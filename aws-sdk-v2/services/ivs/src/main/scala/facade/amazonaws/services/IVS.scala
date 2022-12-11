package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ivs {
  type BatchErrors = js.Array[BatchError]
  type ChannelArn = String
  type ChannelArnList = js.Array[ChannelArn]
  type ChannelList = js.Array[ChannelSummary]
  type ChannelName = String
  type ChannelRecordingConfigurationArn = String
  type Channels = js.Array[Channel]
  type IngestEndpoint = String
  type IsAuthorized = Boolean
  type MaxChannelResults = Int
  type MaxPlaybackKeyPairResults = Int
  type MaxRecordingConfigurationResults = Int
  type MaxStreamKeyResults = Int
  type MaxStreamResults = Int
  type PaginationToken = String
  type PlaybackKeyPairArn = String
  type PlaybackKeyPairFingerprint = String
  type PlaybackKeyPairList = js.Array[PlaybackKeyPairSummary]
  type PlaybackKeyPairName = String
  type PlaybackPublicKeyMaterial = String
  type PlaybackURL = String
  type RecordingConfigurationArn = String
  type RecordingConfigurationList = js.Array[RecordingConfigurationSummary]
  type RecordingConfigurationName = String
  type RecordingReconnectWindowSeconds = Int
  type ResourceArn = String
  type S3DestinationBucketName = String
  type StreamEvents = js.Array[StreamEvent]
  type StreamId = String
  type StreamKeyArn = String
  type StreamKeyArnList = js.Array[StreamKeyArn]
  type StreamKeyList = js.Array[StreamKeySummary]
  type StreamKeyValue = String
  type StreamKeys = js.Array[StreamKey]
  type StreamList = js.Array[StreamSummary]
  type StreamMetadata = String
  type StreamSessionList = js.Array[StreamSessionSummary]
  type StreamStartTime = js.Date
  type StreamViewerCount = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type TargetIntervalSeconds = Double
  type Time = js.Date
  type errorCode = String
  type errorMessage = String

  final class IVSOps(private val service: IVS) extends AnyVal {

    @inline def batchGetChannelFuture(params: BatchGetChannelRequest): Future[BatchGetChannelResponse] = service.batchGetChannel(params).promise().toFuture
    @inline def batchGetStreamKeyFuture(params: BatchGetStreamKeyRequest): Future[BatchGetStreamKeyResponse] = service.batchGetStreamKey(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] = service.createChannel(params).promise().toFuture
    @inline def createRecordingConfigurationFuture(params: CreateRecordingConfigurationRequest): Future[CreateRecordingConfigurationResponse] = service.createRecordingConfiguration(params).promise().toFuture
    @inline def createStreamKeyFuture(params: CreateStreamKeyRequest): Future[CreateStreamKeyResponse] = service.createStreamKey(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] = service.deleteChannel(params).promise().toFuture
    @inline def deletePlaybackKeyPairFuture(params: DeletePlaybackKeyPairRequest): Future[DeletePlaybackKeyPairResponse] = service.deletePlaybackKeyPair(params).promise().toFuture
    @inline def deleteRecordingConfigurationFuture(params: DeleteRecordingConfigurationRequest): Future[js.Object] = service.deleteRecordingConfiguration(params).promise().toFuture
    @inline def deleteStreamKeyFuture(params: DeleteStreamKeyRequest): Future[js.Object] = service.deleteStreamKey(params).promise().toFuture
    @inline def getChannelFuture(params: GetChannelRequest): Future[GetChannelResponse] = service.getChannel(params).promise().toFuture
    @inline def getPlaybackKeyPairFuture(params: GetPlaybackKeyPairRequest): Future[GetPlaybackKeyPairResponse] = service.getPlaybackKeyPair(params).promise().toFuture
    @inline def getRecordingConfigurationFuture(params: GetRecordingConfigurationRequest): Future[GetRecordingConfigurationResponse] = service.getRecordingConfiguration(params).promise().toFuture
    @inline def getStreamFuture(params: GetStreamRequest): Future[GetStreamResponse] = service.getStream(params).promise().toFuture
    @inline def getStreamKeyFuture(params: GetStreamKeyRequest): Future[GetStreamKeyResponse] = service.getStreamKey(params).promise().toFuture
    @inline def getStreamSessionFuture(params: GetStreamSessionRequest): Future[GetStreamSessionResponse] = service.getStreamSession(params).promise().toFuture
    @inline def importPlaybackKeyPairFuture(params: ImportPlaybackKeyPairRequest): Future[ImportPlaybackKeyPairResponse] = service.importPlaybackKeyPair(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listPlaybackKeyPairsFuture(params: ListPlaybackKeyPairsRequest): Future[ListPlaybackKeyPairsResponse] = service.listPlaybackKeyPairs(params).promise().toFuture
    @inline def listRecordingConfigurationsFuture(params: ListRecordingConfigurationsRequest): Future[ListRecordingConfigurationsResponse] = service.listRecordingConfigurations(params).promise().toFuture
    @inline def listStreamKeysFuture(params: ListStreamKeysRequest): Future[ListStreamKeysResponse] = service.listStreamKeys(params).promise().toFuture
    @inline def listStreamSessionsFuture(params: ListStreamSessionsRequest): Future[ListStreamSessionsResponse] = service.listStreamSessions(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsRequest): Future[ListStreamsResponse] = service.listStreams(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putMetadataFuture(params: PutMetadataRequest): Future[js.Object] = service.putMetadata(params).promise().toFuture
    @inline def stopStreamFuture(params: StopStreamRequest): Future[StopStreamResponse] = service.stopStream(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] = service.updateChannel(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ivs", JSImport.Namespace, "AWS.IVS")
  class IVS() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetChannel(params: BatchGetChannelRequest): Request[BatchGetChannelResponse] = js.native
    def batchGetStreamKey(params: BatchGetStreamKeyRequest): Request[BatchGetStreamKeyResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createRecordingConfiguration(params: CreateRecordingConfigurationRequest): Request[CreateRecordingConfigurationResponse] = js.native
    def createStreamKey(params: CreateStreamKeyRequest): Request[CreateStreamKeyResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[js.Object] = js.native
    def deletePlaybackKeyPair(params: DeletePlaybackKeyPairRequest): Request[DeletePlaybackKeyPairResponse] = js.native
    def deleteRecordingConfiguration(params: DeleteRecordingConfigurationRequest): Request[js.Object] = js.native
    def deleteStreamKey(params: DeleteStreamKeyRequest): Request[js.Object] = js.native
    def getChannel(params: GetChannelRequest): Request[GetChannelResponse] = js.native
    def getPlaybackKeyPair(params: GetPlaybackKeyPairRequest): Request[GetPlaybackKeyPairResponse] = js.native
    def getRecordingConfiguration(params: GetRecordingConfigurationRequest): Request[GetRecordingConfigurationResponse] = js.native
    def getStream(params: GetStreamRequest): Request[GetStreamResponse] = js.native
    def getStreamKey(params: GetStreamKeyRequest): Request[GetStreamKeyResponse] = js.native
    def getStreamSession(params: GetStreamSessionRequest): Request[GetStreamSessionResponse] = js.native
    def importPlaybackKeyPair(params: ImportPlaybackKeyPairRequest): Request[ImportPlaybackKeyPairResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listPlaybackKeyPairs(params: ListPlaybackKeyPairsRequest): Request[ListPlaybackKeyPairsResponse] = js.native
    def listRecordingConfigurations(params: ListRecordingConfigurationsRequest): Request[ListRecordingConfigurationsResponse] = js.native
    def listStreamKeys(params: ListStreamKeysRequest): Request[ListStreamKeysResponse] = js.native
    def listStreamSessions(params: ListStreamSessionsRequest): Request[ListStreamSessionsResponse] = js.native
    def listStreams(params: ListStreamsRequest): Request[ListStreamsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putMetadata(params: PutMetadataRequest): Request[js.Object] = js.native
    def stopStream(params: StopStreamRequest): Request[StopStreamResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
  }
  object IVS {
    @inline implicit def toOps(service: IVS): IVSOps = {
      new IVSOps(service)
    }
  }

  /** Object specifying a stream’s audio configuration, as set up by the broadcaster (usually in an encoder). This is part of the <a>IngestConfiguration</a> object and used for monitoring stream health.
    */
  @js.native
  trait AudioConfiguration extends js.Object {
    var channels: js.UndefOr[Int]
    var codec: js.UndefOr[String]
    var sampleRate: js.UndefOr[Int]
    var targetBitrate: js.UndefOr[Int]
  }

  object AudioConfiguration {
    @inline
    def apply(
        channels: js.UndefOr[Int] = js.undefined,
        codec: js.UndefOr[String] = js.undefined,
        sampleRate: js.UndefOr[Int] = js.undefined,
        targetBitrate: js.UndefOr[Int] = js.undefined
    ): AudioConfiguration = {
      val __obj = js.Dynamic.literal()
      channels.foreach(__v => __obj.updateDynamic("channels")(__v.asInstanceOf[js.Any]))
      codec.foreach(__v => __obj.updateDynamic("codec")(__v.asInstanceOf[js.Any]))
      sampleRate.foreach(__v => __obj.updateDynamic("sampleRate")(__v.asInstanceOf[js.Any]))
      targetBitrate.foreach(__v => __obj.updateDynamic("targetBitrate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioConfiguration]
    }
  }

  /** Error related to a specific channel, specified by its ARN.
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

  /** Object specifying a channel.
    */
  @js.native
  trait Channel extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var authorized: js.UndefOr[IsAuthorized]
    var ingestEndpoint: js.UndefOr[IngestEndpoint]
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var playbackUrl: js.UndefOr[PlaybackURL]
    var recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[ChannelType]
  }

  object Channel {
    @inline
    def apply(
        arn: js.UndefOr[ChannelArn] = js.undefined,
        authorized: js.UndefOr[IsAuthorized] = js.undefined,
        ingestEndpoint: js.UndefOr[IngestEndpoint] = js.undefined,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        playbackUrl: js.UndefOr[PlaybackURL] = js.undefined,
        recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      authorized.foreach(__v => __obj.updateDynamic("authorized")(__v.asInstanceOf[js.Any]))
      ingestEndpoint.foreach(__v => __obj.updateDynamic("ingestEndpoint")(__v.asInstanceOf[js.Any]))
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      playbackUrl.foreach(__v => __obj.updateDynamic("playbackUrl")(__v.asInstanceOf[js.Any]))
      recordingConfigurationArn.foreach(__v => __obj.updateDynamic("recordingConfigurationArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /** Summary information about a channel.
    */
  @js.native
  trait ChannelSummary extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var authorized: js.UndefOr[IsAuthorized]
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn]
    var tags: js.UndefOr[Tags]
  }

  object ChannelSummary {
    @inline
    def apply(
        arn: js.UndefOr[ChannelArn] = js.undefined,
        authorized: js.UndefOr[IsAuthorized] = js.undefined,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): ChannelSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      authorized.foreach(__v => __obj.updateDynamic("authorized")(__v.asInstanceOf[js.Any]))
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recordingConfigurationArn.foreach(__v => __obj.updateDynamic("recordingConfigurationArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSummary]
    }
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var authorized: js.UndefOr[Boolean]
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[ChannelType]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        authorized: js.UndefOr[Boolean] = js.undefined,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal()
      authorized.foreach(__v => __obj.updateDynamic("authorized")(__v.asInstanceOf[js.Any]))
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recordingConfigurationArn.foreach(__v => __obj.updateDynamic("recordingConfigurationArn")(__v.asInstanceOf[js.Any]))
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
  trait CreateRecordingConfigurationRequest extends js.Object {
    var destinationConfiguration: DestinationConfiguration
    var name: js.UndefOr[RecordingConfigurationName]
    var recordingReconnectWindowSeconds: js.UndefOr[RecordingReconnectWindowSeconds]
    var tags: js.UndefOr[Tags]
    var thumbnailConfiguration: js.UndefOr[ThumbnailConfiguration]
  }

  object CreateRecordingConfigurationRequest {
    @inline
    def apply(
        destinationConfiguration: DestinationConfiguration,
        name: js.UndefOr[RecordingConfigurationName] = js.undefined,
        recordingReconnectWindowSeconds: js.UndefOr[RecordingReconnectWindowSeconds] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        thumbnailConfiguration: js.UndefOr[ThumbnailConfiguration] = js.undefined
    ): CreateRecordingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "destinationConfiguration" -> destinationConfiguration.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recordingReconnectWindowSeconds.foreach(__v => __obj.updateDynamic("recordingReconnectWindowSeconds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      thumbnailConfiguration.foreach(__v => __obj.updateDynamic("thumbnailConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecordingConfigurationRequest]
    }
  }

  @js.native
  trait CreateRecordingConfigurationResponse extends js.Object {
    var recordingConfiguration: js.UndefOr[RecordingConfiguration]
  }

  object CreateRecordingConfigurationResponse {
    @inline
    def apply(
        recordingConfiguration: js.UndefOr[RecordingConfiguration] = js.undefined
    ): CreateRecordingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      recordingConfiguration.foreach(__v => __obj.updateDynamic("recordingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecordingConfigurationResponse]
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
  trait DeletePlaybackKeyPairRequest extends js.Object {
    var arn: PlaybackKeyPairArn
  }

  object DeletePlaybackKeyPairRequest {
    @inline
    def apply(
        arn: PlaybackKeyPairArn
    ): DeletePlaybackKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePlaybackKeyPairRequest]
    }
  }

  @js.native
  trait DeletePlaybackKeyPairResponse extends js.Object

  object DeletePlaybackKeyPairResponse {
    @inline
    def apply(): DeletePlaybackKeyPairResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePlaybackKeyPairResponse]
    }
  }

  @js.native
  trait DeleteRecordingConfigurationRequest extends js.Object {
    var arn: RecordingConfigurationArn
  }

  object DeleteRecordingConfigurationRequest {
    @inline
    def apply(
        arn: RecordingConfigurationArn
    ): DeleteRecordingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecordingConfigurationRequest]
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

  /** A complex type that describes a location where recorded videos will be stored. Each member represents a type of destination configuration. For recording, you define one and only one type of destination configuration.
    */
  @js.native
  trait DestinationConfiguration extends js.Object {
    var s3: js.UndefOr[S3DestinationConfiguration]
  }

  object DestinationConfiguration {
    @inline
    def apply(
        s3: js.UndefOr[S3DestinationConfiguration] = js.undefined
    ): DestinationConfiguration = {
      val __obj = js.Dynamic.literal()
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationConfiguration]
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
  trait GetPlaybackKeyPairRequest extends js.Object {
    var arn: PlaybackKeyPairArn
  }

  object GetPlaybackKeyPairRequest {
    @inline
    def apply(
        arn: PlaybackKeyPairArn
    ): GetPlaybackKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPlaybackKeyPairRequest]
    }
  }

  @js.native
  trait GetPlaybackKeyPairResponse extends js.Object {
    var keyPair: js.UndefOr[PlaybackKeyPair]
  }

  object GetPlaybackKeyPairResponse {
    @inline
    def apply(
        keyPair: js.UndefOr[PlaybackKeyPair] = js.undefined
    ): GetPlaybackKeyPairResponse = {
      val __obj = js.Dynamic.literal()
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlaybackKeyPairResponse]
    }
  }

  @js.native
  trait GetRecordingConfigurationRequest extends js.Object {
    var arn: RecordingConfigurationArn
  }

  object GetRecordingConfigurationRequest {
    @inline
    def apply(
        arn: RecordingConfigurationArn
    ): GetRecordingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecordingConfigurationRequest]
    }
  }

  @js.native
  trait GetRecordingConfigurationResponse extends js.Object {
    var recordingConfiguration: js.UndefOr[RecordingConfiguration]
  }

  object GetRecordingConfigurationResponse {
    @inline
    def apply(
        recordingConfiguration: js.UndefOr[RecordingConfiguration] = js.undefined
    ): GetRecordingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      recordingConfiguration.foreach(__v => __obj.updateDynamic("recordingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordingConfigurationResponse]
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
  trait GetStreamSessionRequest extends js.Object {
    var channelArn: ChannelArn
    var streamId: js.UndefOr[StreamId]
  }

  object GetStreamSessionRequest {
    @inline
    def apply(
        channelArn: ChannelArn,
        streamId: js.UndefOr[StreamId] = js.undefined
    ): GetStreamSessionRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any]
      )

      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamSessionRequest]
    }
  }

  @js.native
  trait GetStreamSessionResponse extends js.Object {
    var streamSession: js.UndefOr[StreamSession]
  }

  object GetStreamSessionResponse {
    @inline
    def apply(
        streamSession: js.UndefOr[StreamSession] = js.undefined
    ): GetStreamSessionResponse = {
      val __obj = js.Dynamic.literal()
      streamSession.foreach(__v => __obj.updateDynamic("streamSession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamSessionResponse]
    }
  }

  @js.native
  trait ImportPlaybackKeyPairRequest extends js.Object {
    var publicKeyMaterial: PlaybackPublicKeyMaterial
    var name: js.UndefOr[PlaybackKeyPairName]
    var tags: js.UndefOr[Tags]
  }

  object ImportPlaybackKeyPairRequest {
    @inline
    def apply(
        publicKeyMaterial: PlaybackPublicKeyMaterial,
        name: js.UndefOr[PlaybackKeyPairName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): ImportPlaybackKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "publicKeyMaterial" -> publicKeyMaterial.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportPlaybackKeyPairRequest]
    }
  }

  @js.native
  trait ImportPlaybackKeyPairResponse extends js.Object {
    var keyPair: js.UndefOr[PlaybackKeyPair]
  }

  object ImportPlaybackKeyPairResponse {
    @inline
    def apply(
        keyPair: js.UndefOr[PlaybackKeyPair] = js.undefined
    ): ImportPlaybackKeyPairResponse = {
      val __obj = js.Dynamic.literal()
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportPlaybackKeyPairResponse]
    }
  }

  /** Object specifying the ingest configuration set up by the broadcaster, usually in an encoder.
    */
  @js.native
  trait IngestConfiguration extends js.Object {
    var audio: js.UndefOr[AudioConfiguration]
    var video: js.UndefOr[VideoConfiguration]
  }

  object IngestConfiguration {
    @inline
    def apply(
        audio: js.UndefOr[AudioConfiguration] = js.undefined,
        video: js.UndefOr[VideoConfiguration] = js.undefined
    ): IngestConfiguration = {
      val __obj = js.Dynamic.literal()
      audio.foreach(__v => __obj.updateDynamic("audio")(__v.asInstanceOf[js.Any]))
      video.foreach(__v => __obj.updateDynamic("video")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IngestConfiguration]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var filterByName: js.UndefOr[ChannelName]
    var filterByRecordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn]
    var maxResults: js.UndefOr[MaxChannelResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        filterByName: js.UndefOr[ChannelName] = js.undefined,
        filterByRecordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined,
        maxResults: js.UndefOr[MaxChannelResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      filterByName.foreach(__v => __obj.updateDynamic("filterByName")(__v.asInstanceOf[js.Any]))
      filterByRecordingConfigurationArn.foreach(__v => __obj.updateDynamic("filterByRecordingConfigurationArn")(__v.asInstanceOf[js.Any]))
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
  trait ListPlaybackKeyPairsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxPlaybackKeyPairResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPlaybackKeyPairsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxPlaybackKeyPairResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPlaybackKeyPairsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaybackKeyPairsRequest]
    }
  }

  @js.native
  trait ListPlaybackKeyPairsResponse extends js.Object {
    var keyPairs: PlaybackKeyPairList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPlaybackKeyPairsResponse {
    @inline
    def apply(
        keyPairs: PlaybackKeyPairList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPlaybackKeyPairsResponse = {
      val __obj = js.Dynamic.literal(
        "keyPairs" -> keyPairs.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaybackKeyPairsResponse]
    }
  }

  @js.native
  trait ListRecordingConfigurationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxRecordingConfigurationResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRecordingConfigurationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxRecordingConfigurationResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRecordingConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordingConfigurationsRequest]
    }
  }

  @js.native
  trait ListRecordingConfigurationsResponse extends js.Object {
    var recordingConfigurations: RecordingConfigurationList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRecordingConfigurationsResponse {
    @inline
    def apply(
        recordingConfigurations: RecordingConfigurationList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRecordingConfigurationsResponse = {
      val __obj = js.Dynamic.literal(
        "recordingConfigurations" -> recordingConfigurations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordingConfigurationsResponse]
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
  trait ListStreamSessionsRequest extends js.Object {
    var channelArn: ChannelArn
    var maxResults: js.UndefOr[MaxStreamResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamSessionsRequest {
    @inline
    def apply(
        channelArn: ChannelArn,
        maxResults: js.UndefOr[MaxStreamResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamSessionsRequest]
    }
  }

  @js.native
  trait ListStreamSessionsResponse extends js.Object {
    var streamSessions: StreamSessionList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamSessionsResponse {
    @inline
    def apply(
        streamSessions: StreamSessionList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamSessionsResponse = {
      val __obj = js.Dynamic.literal(
        "streamSessions" -> streamSessions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamSessionsResponse]
    }
  }

  @js.native
  trait ListStreamsRequest extends js.Object {
    var filterBy: js.UndefOr[StreamFilters]
    var maxResults: js.UndefOr[MaxStreamResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamsRequest {
    @inline
    def apply(
        filterBy: js.UndefOr[StreamFilters] = js.undefined,
        maxResults: js.UndefOr[MaxStreamResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamsRequest = {
      val __obj = js.Dynamic.literal()
      filterBy.foreach(__v => __obj.updateDynamic("filterBy")(__v.asInstanceOf[js.Any]))
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
    var tags: Tags
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: Tags
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A key pair used to sign and validate a playback authorization token.
    */
  @js.native
  trait PlaybackKeyPair extends js.Object {
    var arn: js.UndefOr[PlaybackKeyPairArn]
    var fingerprint: js.UndefOr[PlaybackKeyPairFingerprint]
    var name: js.UndefOr[PlaybackKeyPairName]
    var tags: js.UndefOr[Tags]
  }

  object PlaybackKeyPair {
    @inline
    def apply(
        arn: js.UndefOr[PlaybackKeyPairArn] = js.undefined,
        fingerprint: js.UndefOr[PlaybackKeyPairFingerprint] = js.undefined,
        name: js.UndefOr[PlaybackKeyPairName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): PlaybackKeyPair = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      fingerprint.foreach(__v => __obj.updateDynamic("fingerprint")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlaybackKeyPair]
    }
  }

  /** Summary information about a playback key pair.
    */
  @js.native
  trait PlaybackKeyPairSummary extends js.Object {
    var arn: js.UndefOr[PlaybackKeyPairArn]
    var name: js.UndefOr[PlaybackKeyPairName]
    var tags: js.UndefOr[Tags]
  }

  object PlaybackKeyPairSummary {
    @inline
    def apply(
        arn: js.UndefOr[PlaybackKeyPairArn] = js.undefined,
        name: js.UndefOr[PlaybackKeyPairName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): PlaybackKeyPairSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlaybackKeyPairSummary]
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

  /** An object representing a configuration to record a channel stream.
    */
  @js.native
  trait RecordingConfiguration extends js.Object {
    var arn: RecordingConfigurationArn
    var destinationConfiguration: DestinationConfiguration
    var state: RecordingConfigurationState
    var name: js.UndefOr[RecordingConfigurationName]
    var recordingReconnectWindowSeconds: js.UndefOr[RecordingReconnectWindowSeconds]
    var tags: js.UndefOr[Tags]
    var thumbnailConfiguration: js.UndefOr[ThumbnailConfiguration]
  }

  object RecordingConfiguration {
    @inline
    def apply(
        arn: RecordingConfigurationArn,
        destinationConfiguration: DestinationConfiguration,
        state: RecordingConfigurationState,
        name: js.UndefOr[RecordingConfigurationName] = js.undefined,
        recordingReconnectWindowSeconds: js.UndefOr[RecordingReconnectWindowSeconds] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        thumbnailConfiguration: js.UndefOr[ThumbnailConfiguration] = js.undefined
    ): RecordingConfiguration = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "destinationConfiguration" -> destinationConfiguration.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recordingReconnectWindowSeconds.foreach(__v => __obj.updateDynamic("recordingReconnectWindowSeconds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      thumbnailConfiguration.foreach(__v => __obj.updateDynamic("thumbnailConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordingConfiguration]
    }
  }

  /** Summary information about a RecordingConfiguration.
    */
  @js.native
  trait RecordingConfigurationSummary extends js.Object {
    var arn: RecordingConfigurationArn
    var destinationConfiguration: DestinationConfiguration
    var state: RecordingConfigurationState
    var name: js.UndefOr[RecordingConfigurationName]
    var tags: js.UndefOr[Tags]
  }

  object RecordingConfigurationSummary {
    @inline
    def apply(
        arn: RecordingConfigurationArn,
        destinationConfiguration: DestinationConfiguration,
        state: RecordingConfigurationState,
        name: js.UndefOr[RecordingConfigurationName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): RecordingConfigurationSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "destinationConfiguration" -> destinationConfiguration.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordingConfigurationSummary]
    }
  }

  /** A complex type that describes an S3 location where recorded videos will be stored.
    */
  @js.native
  trait S3DestinationConfiguration extends js.Object {
    var bucketName: S3DestinationBucketName
  }

  object S3DestinationConfiguration {
    @inline
    def apply(
        bucketName: S3DestinationBucketName
    ): S3DestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3DestinationConfiguration]
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
  trait StopStreamResponse extends js.Object

  object StopStreamResponse {
    @inline
    def apply(): StopStreamResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopStreamResponse]
    }
  }

  /** Specifies a live video stream that has been ingested and distributed.
    */
  @js.native
  trait Stream extends js.Object {
    var channelArn: js.UndefOr[ChannelArn]
    var health: js.UndefOr[StreamHealth]
    var playbackUrl: js.UndefOr[PlaybackURL]
    var startTime: js.UndefOr[StreamStartTime]
    var state: js.UndefOr[StreamState]
    var streamId: js.UndefOr[StreamId]
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
        streamId: js.UndefOr[StreamId] = js.undefined,
        viewerCount: js.UndefOr[StreamViewerCount] = js.undefined
    ): Stream = {
      val __obj = js.Dynamic.literal()
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      playbackUrl.foreach(__v => __obj.updateDynamic("playbackUrl")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      viewerCount.foreach(__v => __obj.updateDynamic("viewerCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stream]
    }
  }

  /** Object specifying a stream’s events. For a list of events, see [[https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html|Using Amazon EventBridge with Amazon IVS]].
    */
  @js.native
  trait StreamEvent extends js.Object {
    var eventTime: js.UndefOr[Time]
    var name: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object StreamEvent {
    @inline
    def apply(
        eventTime: js.UndefOr[Time] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): StreamEvent = {
      val __obj = js.Dynamic.literal()
      eventTime.foreach(__v => __obj.updateDynamic("eventTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamEvent]
    }
  }

  /** Object specifying the stream attribute on which to filter.
    */
  @js.native
  trait StreamFilters extends js.Object {
    var health: js.UndefOr[StreamHealth]
  }

  object StreamFilters {
    @inline
    def apply(
        health: js.UndefOr[StreamHealth] = js.undefined
    ): StreamFilters = {
      val __obj = js.Dynamic.literal()
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamFilters]
    }
  }

  /** Object specifying a stream key.
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

  /** Summary information about a stream key.
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

  /** Object that captures the Amazon IVS configuration that the customer provisioned, the ingest configurations that the broadcaster used, and the most recent Amazon IVS stream events it encountered.
    */
  @js.native
  trait StreamSession extends js.Object {
    var channel: js.UndefOr[Channel]
    var endTime: js.UndefOr[Time]
    var ingestConfiguration: js.UndefOr[IngestConfiguration]
    var recordingConfiguration: js.UndefOr[RecordingConfiguration]
    var startTime: js.UndefOr[Time]
    var streamId: js.UndefOr[StreamId]
    var truncatedEvents: js.UndefOr[StreamEvents]
  }

  object StreamSession {
    @inline
    def apply(
        channel: js.UndefOr[Channel] = js.undefined,
        endTime: js.UndefOr[Time] = js.undefined,
        ingestConfiguration: js.UndefOr[IngestConfiguration] = js.undefined,
        recordingConfiguration: js.UndefOr[RecordingConfiguration] = js.undefined,
        startTime: js.UndefOr[Time] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        truncatedEvents: js.UndefOr[StreamEvents] = js.undefined
    ): StreamSession = {
      val __obj = js.Dynamic.literal()
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      ingestConfiguration.foreach(__v => __obj.updateDynamic("ingestConfiguration")(__v.asInstanceOf[js.Any]))
      recordingConfiguration.foreach(__v => __obj.updateDynamic("recordingConfiguration")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      truncatedEvents.foreach(__v => __obj.updateDynamic("truncatedEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSession]
    }
  }

  /** Summary information about a stream session.
    */
  @js.native
  trait StreamSessionSummary extends js.Object {
    var endTime: js.UndefOr[Time]
    var hasErrorEvent: js.UndefOr[Boolean]
    var startTime: js.UndefOr[Time]
    var streamId: js.UndefOr[StreamId]
  }

  object StreamSessionSummary {
    @inline
    def apply(
        endTime: js.UndefOr[Time] = js.undefined,
        hasErrorEvent: js.UndefOr[Boolean] = js.undefined,
        startTime: js.UndefOr[Time] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined
    ): StreamSessionSummary = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      hasErrorEvent.foreach(__v => __obj.updateDynamic("hasErrorEvent")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSessionSummary]
    }
  }

  /** Summary information about a stream.
    */
  @js.native
  trait StreamSummary extends js.Object {
    var channelArn: js.UndefOr[ChannelArn]
    var health: js.UndefOr[StreamHealth]
    var startTime: js.UndefOr[StreamStartTime]
    var state: js.UndefOr[StreamState]
    var streamId: js.UndefOr[StreamId]
    var viewerCount: js.UndefOr[StreamViewerCount]
  }

  object StreamSummary {
    @inline
    def apply(
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        health: js.UndefOr[StreamHealth] = js.undefined,
        startTime: js.UndefOr[StreamStartTime] = js.undefined,
        state: js.UndefOr[StreamState] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        viewerCount: js.UndefOr[StreamViewerCount] = js.undefined
    ): StreamSummary = {
      val __obj = js.Dynamic.literal()
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** An object representing a configuration of thumbnails for recorded video.
    */
  @js.native
  trait ThumbnailConfiguration extends js.Object {
    var recordingMode: js.UndefOr[RecordingMode]
    var targetIntervalSeconds: js.UndefOr[TargetIntervalSeconds]
  }

  object ThumbnailConfiguration {
    @inline
    def apply(
        recordingMode: js.UndefOr[RecordingMode] = js.undefined,
        targetIntervalSeconds: js.UndefOr[TargetIntervalSeconds] = js.undefined
    ): ThumbnailConfiguration = {
      val __obj = js.Dynamic.literal()
      recordingMode.foreach(__v => __obj.updateDynamic("recordingMode")(__v.asInstanceOf[js.Any]))
      targetIntervalSeconds.foreach(__v => __obj.updateDynamic("targetIntervalSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThumbnailConfiguration]
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateChannelRequest extends js.Object {
    var arn: ChannelArn
    var authorized: js.UndefOr[Boolean]
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn]
    var `type`: js.UndefOr[ChannelType]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        arn: ChannelArn,
        authorized: js.UndefOr[Boolean] = js.undefined,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      authorized.foreach(__v => __obj.updateDynamic("authorized")(__v.asInstanceOf[js.Any]))
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recordingConfigurationArn.foreach(__v => __obj.updateDynamic("recordingConfigurationArn")(__v.asInstanceOf[js.Any]))
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

  /** Object specifying a stream’s video configuration, as set up by the broadcaster (usually in an encoder). This is part of the <a>IngestConfiguration</a> object and used for monitoring stream health.
    */
  @js.native
  trait VideoConfiguration extends js.Object {
    var avcLevel: js.UndefOr[String]
    var avcProfile: js.UndefOr[String]
    var codec: js.UndefOr[String]
    var encoder: js.UndefOr[String]
    var targetBitrate: js.UndefOr[Int]
    var targetFramerate: js.UndefOr[Int]
    var videoHeight: js.UndefOr[Int]
    var videoWidth: js.UndefOr[Int]
  }

  object VideoConfiguration {
    @inline
    def apply(
        avcLevel: js.UndefOr[String] = js.undefined,
        avcProfile: js.UndefOr[String] = js.undefined,
        codec: js.UndefOr[String] = js.undefined,
        encoder: js.UndefOr[String] = js.undefined,
        targetBitrate: js.UndefOr[Int] = js.undefined,
        targetFramerate: js.UndefOr[Int] = js.undefined,
        videoHeight: js.UndefOr[Int] = js.undefined,
        videoWidth: js.UndefOr[Int] = js.undefined
    ): VideoConfiguration = {
      val __obj = js.Dynamic.literal()
      avcLevel.foreach(__v => __obj.updateDynamic("avcLevel")(__v.asInstanceOf[js.Any]))
      avcProfile.foreach(__v => __obj.updateDynamic("avcProfile")(__v.asInstanceOf[js.Any]))
      codec.foreach(__v => __obj.updateDynamic("codec")(__v.asInstanceOf[js.Any]))
      encoder.foreach(__v => __obj.updateDynamic("encoder")(__v.asInstanceOf[js.Any]))
      targetBitrate.foreach(__v => __obj.updateDynamic("targetBitrate")(__v.asInstanceOf[js.Any]))
      targetFramerate.foreach(__v => __obj.updateDynamic("targetFramerate")(__v.asInstanceOf[js.Any]))
      videoHeight.foreach(__v => __obj.updateDynamic("videoHeight")(__v.asInstanceOf[js.Any]))
      videoWidth.foreach(__v => __obj.updateDynamic("videoWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoConfiguration]
    }
  }
}
