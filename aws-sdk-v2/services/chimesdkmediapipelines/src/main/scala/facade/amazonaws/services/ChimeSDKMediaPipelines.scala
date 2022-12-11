package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chimesdkmediapipelines {
  type AmazonResourceName = String
  type Arn = String
  type AttendeeIdList = js.Array[GuidString]
  type AudioSampleRateOption = String
  type ClientRequestToken = String
  type ConcatenationSinkList = js.Array[ConcatenationSink]
  type ConcatenationSourceList = js.Array[ConcatenationSource]
  type ExternalUserIdList = js.Array[ExternalUserIdType]
  type ExternalUserIdType = String
  type GuidString = String
  type Iso8601Timestamp = js.Date
  type LiveConnectorSinkList = js.Array[LiveConnectorSinkConfiguration]
  type LiveConnectorSourceList = js.Array[LiveConnectorSourceConfiguration]
  type MediaCapturePipelineSummaryList = js.Array[MediaCapturePipelineSummary]
  type MediaPipelineList = js.Array[MediaPipelineSummary]
  type ResultMax = Int
  type SensitiveString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String

  final class ChimeSDKMediaPipelinesOps(private val service: ChimeSDKMediaPipelines) extends AnyVal {

    @inline def createMediaCapturePipelineFuture(params: CreateMediaCapturePipelineRequest): Future[CreateMediaCapturePipelineResponse] = service.createMediaCapturePipeline(params).promise().toFuture
    @inline def createMediaConcatenationPipelineFuture(params: CreateMediaConcatenationPipelineRequest): Future[CreateMediaConcatenationPipelineResponse] = service.createMediaConcatenationPipeline(params).promise().toFuture
    @inline def createMediaLiveConnectorPipelineFuture(params: CreateMediaLiveConnectorPipelineRequest): Future[CreateMediaLiveConnectorPipelineResponse] = service.createMediaLiveConnectorPipeline(params).promise().toFuture
    @inline def deleteMediaCapturePipelineFuture(params: DeleteMediaCapturePipelineRequest): Future[js.Object] = service.deleteMediaCapturePipeline(params).promise().toFuture
    @inline def deleteMediaPipelineFuture(params: DeleteMediaPipelineRequest): Future[js.Object] = service.deleteMediaPipeline(params).promise().toFuture
    @inline def getMediaCapturePipelineFuture(params: GetMediaCapturePipelineRequest): Future[GetMediaCapturePipelineResponse] = service.getMediaCapturePipeline(params).promise().toFuture
    @inline def getMediaPipelineFuture(params: GetMediaPipelineRequest): Future[GetMediaPipelineResponse] = service.getMediaPipeline(params).promise().toFuture
    @inline def listMediaCapturePipelinesFuture(params: ListMediaCapturePipelinesRequest): Future[ListMediaCapturePipelinesResponse] = service.listMediaCapturePipelines(params).promise().toFuture
    @inline def listMediaPipelinesFuture(params: ListMediaPipelinesRequest): Future[ListMediaPipelinesResponse] = service.listMediaPipelines(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chimesdkmediapipelines", JSImport.Namespace, "AWS.ChimeSDKMediaPipelines")
  class ChimeSDKMediaPipelines() extends js.Object {
    def this(config: AWSConfig) = this()

    def createMediaCapturePipeline(params: CreateMediaCapturePipelineRequest): Request[CreateMediaCapturePipelineResponse] = js.native
    def createMediaConcatenationPipeline(params: CreateMediaConcatenationPipelineRequest): Request[CreateMediaConcatenationPipelineResponse] = js.native
    def createMediaLiveConnectorPipeline(params: CreateMediaLiveConnectorPipelineRequest): Request[CreateMediaLiveConnectorPipelineResponse] = js.native
    def deleteMediaCapturePipeline(params: DeleteMediaCapturePipelineRequest): Request[js.Object] = js.native
    def deleteMediaPipeline(params: DeleteMediaPipelineRequest): Request[js.Object] = js.native
    def getMediaCapturePipeline(params: GetMediaCapturePipelineRequest): Request[GetMediaCapturePipelineResponse] = js.native
    def getMediaPipeline(params: GetMediaPipelineRequest): Request[GetMediaPipelineResponse] = js.native
    def listMediaCapturePipelines(params: ListMediaCapturePipelinesRequest): Request[ListMediaCapturePipelinesResponse] = js.native
    def listMediaPipelines(params: ListMediaPipelinesRequest): Request[ListMediaPipelinesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object ChimeSDKMediaPipelines {
    @inline implicit def toOps(service: ChimeSDKMediaPipelines): ChimeSDKMediaPipelinesOps = {
      new ChimeSDKMediaPipelinesOps(service)
    }
  }

  /** The configuration for the artifacts concatenation.
    */
  @js.native
  trait ArtifactsConcatenationConfiguration extends js.Object {
    var Audio: AudioConcatenationConfiguration
    var CompositedVideo: CompositedVideoConcatenationConfiguration
    var Content: ContentConcatenationConfiguration
    var DataChannel: DataChannelConcatenationConfiguration
    var MeetingEvents: MeetingEventsConcatenationConfiguration
    var TranscriptionMessages: TranscriptionMessagesConcatenationConfiguration
    var Video: VideoConcatenationConfiguration
  }

  object ArtifactsConcatenationConfiguration {
    @inline
    def apply(
        Audio: AudioConcatenationConfiguration,
        CompositedVideo: CompositedVideoConcatenationConfiguration,
        Content: ContentConcatenationConfiguration,
        DataChannel: DataChannelConcatenationConfiguration,
        MeetingEvents: MeetingEventsConcatenationConfiguration,
        TranscriptionMessages: TranscriptionMessagesConcatenationConfiguration,
        Video: VideoConcatenationConfiguration
    ): ArtifactsConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "Audio" -> Audio.asInstanceOf[js.Any],
        "CompositedVideo" -> CompositedVideo.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "DataChannel" -> DataChannel.asInstanceOf[js.Any],
        "MeetingEvents" -> MeetingEvents.asInstanceOf[js.Any],
        "TranscriptionMessages" -> TranscriptionMessages.asInstanceOf[js.Any],
        "Video" -> Video.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArtifactsConcatenationConfiguration]
    }
  }

  /** The configuration for the artifacts.
    */
  @js.native
  trait ArtifactsConfiguration extends js.Object {
    var Audio: AudioArtifactsConfiguration
    var Content: ContentArtifactsConfiguration
    var Video: VideoArtifactsConfiguration
    var CompositedVideo: js.UndefOr[CompositedVideoArtifactsConfiguration]
  }

  object ArtifactsConfiguration {
    @inline
    def apply(
        Audio: AudioArtifactsConfiguration,
        Content: ContentArtifactsConfiguration,
        Video: VideoArtifactsConfiguration,
        CompositedVideo: js.UndefOr[CompositedVideoArtifactsConfiguration] = js.undefined
    ): ArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "Audio" -> Audio.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "Video" -> Video.asInstanceOf[js.Any]
      )

      CompositedVideo.foreach(__v => __obj.updateDynamic("CompositedVideo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactsConfiguration]
    }
  }

  /** The audio artifact configuration object.
    */
  @js.native
  trait AudioArtifactsConfiguration extends js.Object {
    var MuxType: AudioMuxType
  }

  object AudioArtifactsConfiguration {
    @inline
    def apply(
        MuxType: AudioMuxType
    ): AudioArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "MuxType" -> MuxType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AudioArtifactsConfiguration]
    }
  }

  /** The audio artifact concatenation configuration object.
    */
  @js.native
  trait AudioConcatenationConfiguration extends js.Object {
    var State: AudioArtifactsConcatenationState
  }

  object AudioConcatenationConfiguration {
    @inline
    def apply(
        State: AudioArtifactsConcatenationState
    ): AudioConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AudioConcatenationConfiguration]
    }
  }

  /** The configuration object of the Amazon Chime SDK meeting concatenation for a specified media pipeline.
    */
  @js.native
  trait ChimeSdkMeetingConcatenationConfiguration extends js.Object {
    var ArtifactsConfiguration: ArtifactsConcatenationConfiguration
  }

  object ChimeSdkMeetingConcatenationConfiguration {
    @inline
    def apply(
        ArtifactsConfiguration: ArtifactsConcatenationConfiguration
    ): ChimeSdkMeetingConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "ArtifactsConfiguration" -> ArtifactsConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChimeSdkMeetingConcatenationConfiguration]
    }
  }

  /** The configuration object of the Amazon Chime SDK meeting for a specified media pipeline. <code>SourceType</code> must be <code>ChimeSdkMeeting</code>.
    */
  @js.native
  trait ChimeSdkMeetingConfiguration extends js.Object {
    var ArtifactsConfiguration: js.UndefOr[ArtifactsConfiguration]
    var SourceConfiguration: js.UndefOr[SourceConfiguration]
  }

  object ChimeSdkMeetingConfiguration {
    @inline
    def apply(
        ArtifactsConfiguration: js.UndefOr[ArtifactsConfiguration] = js.undefined,
        SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
    ): ChimeSdkMeetingConfiguration = {
      val __obj = js.Dynamic.literal()
      ArtifactsConfiguration.foreach(__v => __obj.updateDynamic("ArtifactsConfiguration")(__v.asInstanceOf[js.Any]))
      SourceConfiguration.foreach(__v => __obj.updateDynamic("SourceConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChimeSdkMeetingConfiguration]
    }
  }

  /** The media pipeline's configuration object.
    */
  @js.native
  trait ChimeSdkMeetingLiveConnectorConfiguration extends js.Object {
    var Arn: Arn
    var MuxType: LiveConnectorMuxType
    var CompositedVideo: js.UndefOr[CompositedVideoArtifactsConfiguration]
    var SourceConfiguration: js.UndefOr[SourceConfiguration]
  }

  object ChimeSdkMeetingLiveConnectorConfiguration {
    @inline
    def apply(
        Arn: Arn,
        MuxType: LiveConnectorMuxType,
        CompositedVideo: js.UndefOr[CompositedVideoArtifactsConfiguration] = js.undefined,
        SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
    ): ChimeSdkMeetingLiveConnectorConfiguration = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "MuxType" -> MuxType.asInstanceOf[js.Any]
      )

      CompositedVideo.foreach(__v => __obj.updateDynamic("CompositedVideo")(__v.asInstanceOf[js.Any]))
      SourceConfiguration.foreach(__v => __obj.updateDynamic("SourceConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChimeSdkMeetingLiveConnectorConfiguration]
    }
  }

  /** Describes the configuration for the composited video artifacts.
    */
  @js.native
  trait CompositedVideoArtifactsConfiguration extends js.Object {
    var GridViewConfiguration: GridViewConfiguration
    var Layout: js.UndefOr[LayoutOption]
    var Resolution: js.UndefOr[ResolutionOption]
  }

  object CompositedVideoArtifactsConfiguration {
    @inline
    def apply(
        GridViewConfiguration: GridViewConfiguration,
        Layout: js.UndefOr[LayoutOption] = js.undefined,
        Resolution: js.UndefOr[ResolutionOption] = js.undefined
    ): CompositedVideoArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "GridViewConfiguration" -> GridViewConfiguration.asInstanceOf[js.Any]
      )

      Layout.foreach(__v => __obj.updateDynamic("Layout")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompositedVideoArtifactsConfiguration]
    }
  }

  /** The composited video configuration object for a specified media pipeline. <code>SourceType</code> must be <code>ChimeSdkMeeting</code>.
    */
  @js.native
  trait CompositedVideoConcatenationConfiguration extends js.Object {
    var State: ArtifactsConcatenationState
  }

  object CompositedVideoConcatenationConfiguration {
    @inline
    def apply(
        State: ArtifactsConcatenationState
    ): CompositedVideoConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CompositedVideoConcatenationConfiguration]
    }
  }

  /** The data sink of the configuration object.
    */
  @js.native
  trait ConcatenationSink extends js.Object {
    var S3BucketSinkConfiguration: S3BucketSinkConfiguration
    var Type: ConcatenationSinkType
  }

  object ConcatenationSink {
    @inline
    def apply(
        S3BucketSinkConfiguration: S3BucketSinkConfiguration,
        Type: ConcatenationSinkType
    ): ConcatenationSink = {
      val __obj = js.Dynamic.literal(
        "S3BucketSinkConfiguration" -> S3BucketSinkConfiguration.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConcatenationSink]
    }
  }

  /** The source type and media pipeline configuration settings in a configuration object.
    */
  @js.native
  trait ConcatenationSource extends js.Object {
    var MediaCapturePipelineSourceConfiguration: MediaCapturePipelineSourceConfiguration
    var Type: ConcatenationSourceType
  }

  object ConcatenationSource {
    @inline
    def apply(
        MediaCapturePipelineSourceConfiguration: MediaCapturePipelineSourceConfiguration,
        Type: ConcatenationSourceType
    ): ConcatenationSource = {
      val __obj = js.Dynamic.literal(
        "MediaCapturePipelineSourceConfiguration" -> MediaCapturePipelineSourceConfiguration.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConcatenationSource]
    }
  }

  /** The content artifact object.
    */
  @js.native
  trait ContentArtifactsConfiguration extends js.Object {
    var State: ArtifactsState
    var MuxType: js.UndefOr[ContentMuxType]
  }

  object ContentArtifactsConfiguration {
    @inline
    def apply(
        State: ArtifactsState,
        MuxType: js.UndefOr[ContentMuxType] = js.undefined
    ): ContentArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )

      MuxType.foreach(__v => __obj.updateDynamic("MuxType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentArtifactsConfiguration]
    }
  }

  /** The composited content configuration object for a specified media pipeline.
    */
  @js.native
  trait ContentConcatenationConfiguration extends js.Object {
    var State: ArtifactsConcatenationState
  }

  object ContentConcatenationConfiguration {
    @inline
    def apply(
        State: ArtifactsConcatenationState
    ): ContentConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContentConcatenationConfiguration]
    }
  }

  @js.native
  trait CreateMediaCapturePipelineRequest extends js.Object {
    var SinkArn: Arn
    var SinkType: MediaPipelineSinkType
    var SourceArn: Arn
    var SourceType: MediaPipelineSourceType
    var ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateMediaCapturePipelineRequest {
    @inline
    def apply(
        SinkArn: Arn,
        SinkType: MediaPipelineSinkType,
        SourceArn: Arn,
        SourceType: MediaPipelineSourceType,
        ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMediaCapturePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "SinkArn" -> SinkArn.asInstanceOf[js.Any],
        "SinkType" -> SinkType.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any]
      )

      ChimeSdkMeetingConfiguration.foreach(__v => __obj.updateDynamic("ChimeSdkMeetingConfiguration")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaCapturePipelineRequest]
    }
  }

  @js.native
  trait CreateMediaCapturePipelineResponse extends js.Object {
    var MediaCapturePipeline: js.UndefOr[MediaCapturePipeline]
  }

  object CreateMediaCapturePipelineResponse {
    @inline
    def apply(
        MediaCapturePipeline: js.UndefOr[MediaCapturePipeline] = js.undefined
    ): CreateMediaCapturePipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipeline.foreach(__v => __obj.updateDynamic("MediaCapturePipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaCapturePipelineResponse]
    }
  }

  @js.native
  trait CreateMediaConcatenationPipelineRequest extends js.Object {
    var Sinks: ConcatenationSinkList
    var Sources: ConcatenationSourceList
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateMediaConcatenationPipelineRequest {
    @inline
    def apply(
        Sinks: ConcatenationSinkList,
        Sources: ConcatenationSourceList,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMediaConcatenationPipelineRequest = {
      val __obj = js.Dynamic.literal(
        "Sinks" -> Sinks.asInstanceOf[js.Any],
        "Sources" -> Sources.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaConcatenationPipelineRequest]
    }
  }

  @js.native
  trait CreateMediaConcatenationPipelineResponse extends js.Object {
    var MediaConcatenationPipeline: js.UndefOr[MediaConcatenationPipeline]
  }

  object CreateMediaConcatenationPipelineResponse {
    @inline
    def apply(
        MediaConcatenationPipeline: js.UndefOr[MediaConcatenationPipeline] = js.undefined
    ): CreateMediaConcatenationPipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaConcatenationPipeline.foreach(__v => __obj.updateDynamic("MediaConcatenationPipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaConcatenationPipelineResponse]
    }
  }

  @js.native
  trait CreateMediaLiveConnectorPipelineRequest extends js.Object {
    var Sinks: LiveConnectorSinkList
    var Sources: LiveConnectorSourceList
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateMediaLiveConnectorPipelineRequest {
    @inline
    def apply(
        Sinks: LiveConnectorSinkList,
        Sources: LiveConnectorSourceList,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMediaLiveConnectorPipelineRequest = {
      val __obj = js.Dynamic.literal(
        "Sinks" -> Sinks.asInstanceOf[js.Any],
        "Sources" -> Sources.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaLiveConnectorPipelineRequest]
    }
  }

  @js.native
  trait CreateMediaLiveConnectorPipelineResponse extends js.Object {
    var MediaLiveConnectorPipeline: js.UndefOr[MediaLiveConnectorPipeline]
  }

  object CreateMediaLiveConnectorPipelineResponse {
    @inline
    def apply(
        MediaLiveConnectorPipeline: js.UndefOr[MediaLiveConnectorPipeline] = js.undefined
    ): CreateMediaLiveConnectorPipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaLiveConnectorPipeline.foreach(__v => __obj.updateDynamic("MediaLiveConnectorPipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaLiveConnectorPipelineResponse]
    }
  }

  /** The content configuration object's data channel.
    */
  @js.native
  trait DataChannelConcatenationConfiguration extends js.Object {
    var State: ArtifactsConcatenationState
  }

  object DataChannelConcatenationConfiguration {
    @inline
    def apply(
        State: ArtifactsConcatenationState
    ): DataChannelConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataChannelConcatenationConfiguration]
    }
  }

  @js.native
  trait DeleteMediaCapturePipelineRequest extends js.Object {
    var MediaPipelineId: GuidString
  }

  object DeleteMediaCapturePipelineRequest {
    @inline
    def apply(
        MediaPipelineId: GuidString
    ): DeleteMediaCapturePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "MediaPipelineId" -> MediaPipelineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMediaCapturePipelineRequest]
    }
  }

  @js.native
  trait DeleteMediaPipelineRequest extends js.Object {
    var MediaPipelineId: GuidString
  }

  object DeleteMediaPipelineRequest {
    @inline
    def apply(
        MediaPipelineId: GuidString
    ): DeleteMediaPipelineRequest = {
      val __obj = js.Dynamic.literal(
        "MediaPipelineId" -> MediaPipelineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMediaPipelineRequest]
    }
  }

  @js.native
  trait GetMediaCapturePipelineRequest extends js.Object {
    var MediaPipelineId: GuidString
  }

  object GetMediaCapturePipelineRequest {
    @inline
    def apply(
        MediaPipelineId: GuidString
    ): GetMediaCapturePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "MediaPipelineId" -> MediaPipelineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMediaCapturePipelineRequest]
    }
  }

  @js.native
  trait GetMediaCapturePipelineResponse extends js.Object {
    var MediaCapturePipeline: js.UndefOr[MediaCapturePipeline]
  }

  object GetMediaCapturePipelineResponse {
    @inline
    def apply(
        MediaCapturePipeline: js.UndefOr[MediaCapturePipeline] = js.undefined
    ): GetMediaCapturePipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipeline.foreach(__v => __obj.updateDynamic("MediaCapturePipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMediaCapturePipelineResponse]
    }
  }

  @js.native
  trait GetMediaPipelineRequest extends js.Object {
    var MediaPipelineId: GuidString
  }

  object GetMediaPipelineRequest {
    @inline
    def apply(
        MediaPipelineId: GuidString
    ): GetMediaPipelineRequest = {
      val __obj = js.Dynamic.literal(
        "MediaPipelineId" -> MediaPipelineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMediaPipelineRequest]
    }
  }

  @js.native
  trait GetMediaPipelineResponse extends js.Object {
    var MediaPipeline: js.UndefOr[MediaPipeline]
  }

  object GetMediaPipelineResponse {
    @inline
    def apply(
        MediaPipeline: js.UndefOr[MediaPipeline] = js.undefined
    ): GetMediaPipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaPipeline.foreach(__v => __obj.updateDynamic("MediaPipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMediaPipelineResponse]
    }
  }

  /** Specifies the type of grid layout.
    */
  @js.native
  trait GridViewConfiguration extends js.Object {
    var ContentShareLayout: ContentShareLayoutOption
    var PresenterOnlyConfiguration: js.UndefOr[PresenterOnlyConfiguration]
  }

  object GridViewConfiguration {
    @inline
    def apply(
        ContentShareLayout: ContentShareLayoutOption,
        PresenterOnlyConfiguration: js.UndefOr[PresenterOnlyConfiguration] = js.undefined
    ): GridViewConfiguration = {
      val __obj = js.Dynamic.literal(
        "ContentShareLayout" -> ContentShareLayout.asInstanceOf[js.Any]
      )

      PresenterOnlyConfiguration.foreach(__v => __obj.updateDynamic("PresenterOnlyConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GridViewConfiguration]
    }
  }

  @js.native
  trait ListMediaCapturePipelinesRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListMediaCapturePipelinesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMediaCapturePipelinesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMediaCapturePipelinesRequest]
    }
  }

  @js.native
  trait ListMediaCapturePipelinesResponse extends js.Object {
    var MediaCapturePipelines: js.UndefOr[MediaCapturePipelineSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object ListMediaCapturePipelinesResponse {
    @inline
    def apply(
        MediaCapturePipelines: js.UndefOr[MediaCapturePipelineSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMediaCapturePipelinesResponse = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipelines.foreach(__v => __obj.updateDynamic("MediaCapturePipelines")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMediaCapturePipelinesResponse]
    }
  }

  @js.native
  trait ListMediaPipelinesRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListMediaPipelinesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMediaPipelinesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMediaPipelinesRequest]
    }
  }

  @js.native
  trait ListMediaPipelinesResponse extends js.Object {
    var MediaPipelines: js.UndefOr[MediaPipelineList]
    var NextToken: js.UndefOr[String]
  }

  object ListMediaPipelinesResponse {
    @inline
    def apply(
        MediaPipelines: js.UndefOr[MediaPipelineList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMediaPipelinesResponse = {
      val __obj = js.Dynamic.literal()
      MediaPipelines.foreach(__v => __obj.updateDynamic("MediaPipelines")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMediaPipelinesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
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

  /** The media pipeline's RTMP configuration object.
    */
  @js.native
  trait LiveConnectorRTMPConfiguration extends js.Object {
    var Url: SensitiveString
    var AudioChannels: js.UndefOr[AudioChannelsOption]
    var AudioSampleRate: js.UndefOr[AudioSampleRateOption]
  }

  object LiveConnectorRTMPConfiguration {
    @inline
    def apply(
        Url: SensitiveString,
        AudioChannels: js.UndefOr[AudioChannelsOption] = js.undefined,
        AudioSampleRate: js.UndefOr[AudioSampleRateOption] = js.undefined
    ): LiveConnectorRTMPConfiguration = {
      val __obj = js.Dynamic.literal(
        "Url" -> Url.asInstanceOf[js.Any]
      )

      AudioChannels.foreach(__v => __obj.updateDynamic("AudioChannels")(__v.asInstanceOf[js.Any]))
      AudioSampleRate.foreach(__v => __obj.updateDynamic("AudioSampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiveConnectorRTMPConfiguration]
    }
  }

  /** The media pipeline's sink configuration settings.
    */
  @js.native
  trait LiveConnectorSinkConfiguration extends js.Object {
    var RTMPConfiguration: LiveConnectorRTMPConfiguration
    var SinkType: LiveConnectorSinkType
  }

  object LiveConnectorSinkConfiguration {
    @inline
    def apply(
        RTMPConfiguration: LiveConnectorRTMPConfiguration,
        SinkType: LiveConnectorSinkType
    ): LiveConnectorSinkConfiguration = {
      val __obj = js.Dynamic.literal(
        "RTMPConfiguration" -> RTMPConfiguration.asInstanceOf[js.Any],
        "SinkType" -> SinkType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LiveConnectorSinkConfiguration]
    }
  }

  /** The data source configuration object of a streaming media pipeline.
    */
  @js.native
  trait LiveConnectorSourceConfiguration extends js.Object {
    var ChimeSdkMeetingLiveConnectorConfiguration: ChimeSdkMeetingLiveConnectorConfiguration
    var SourceType: LiveConnectorSourceType
  }

  object LiveConnectorSourceConfiguration {
    @inline
    def apply(
        ChimeSdkMeetingLiveConnectorConfiguration: ChimeSdkMeetingLiveConnectorConfiguration,
        SourceType: LiveConnectorSourceType
    ): LiveConnectorSourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "ChimeSdkMeetingLiveConnectorConfiguration" -> ChimeSdkMeetingLiveConnectorConfiguration.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LiveConnectorSourceConfiguration]
    }
  }

  /** A media pipeline object consisting of an ID, source type, source ARN, a sink type, a sink ARN, and a configuration object.
    */
  @js.native
  trait MediaCapturePipeline extends js.Object {
    var ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var MediaPipelineArn: js.UndefOr[AmazonResourceName]
    var MediaPipelineId: js.UndefOr[GuidString]
    var SinkArn: js.UndefOr[Arn]
    var SinkType: js.UndefOr[MediaPipelineSinkType]
    var SourceArn: js.UndefOr[Arn]
    var SourceType: js.UndefOr[MediaPipelineSourceType]
    var Status: js.UndefOr[MediaPipelineStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object MediaCapturePipeline {
    @inline
    def apply(
        ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined,
        MediaPipelineId: js.UndefOr[GuidString] = js.undefined,
        SinkArn: js.UndefOr[Arn] = js.undefined,
        SinkType: js.UndefOr[MediaPipelineSinkType] = js.undefined,
        SourceArn: js.UndefOr[Arn] = js.undefined,
        SourceType: js.UndefOr[MediaPipelineSourceType] = js.undefined,
        Status: js.UndefOr[MediaPipelineStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): MediaCapturePipeline = {
      val __obj = js.Dynamic.literal()
      ChimeSdkMeetingConfiguration.foreach(__v => __obj.updateDynamic("ChimeSdkMeetingConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      MediaPipelineArn.foreach(__v => __obj.updateDynamic("MediaPipelineArn")(__v.asInstanceOf[js.Any]))
      MediaPipelineId.foreach(__v => __obj.updateDynamic("MediaPipelineId")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      SinkType.foreach(__v => __obj.updateDynamic("SinkType")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaCapturePipeline]
    }
  }

  /** The source configuration object of a media capture pipeline.
    */
  @js.native
  trait MediaCapturePipelineSourceConfiguration extends js.Object {
    var ChimeSdkMeetingConfiguration: ChimeSdkMeetingConcatenationConfiguration
    var MediaPipelineArn: Arn
  }

  object MediaCapturePipelineSourceConfiguration {
    @inline
    def apply(
        ChimeSdkMeetingConfiguration: ChimeSdkMeetingConcatenationConfiguration,
        MediaPipelineArn: Arn
    ): MediaCapturePipelineSourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "ChimeSdkMeetingConfiguration" -> ChimeSdkMeetingConfiguration.asInstanceOf[js.Any],
        "MediaPipelineArn" -> MediaPipelineArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MediaCapturePipelineSourceConfiguration]
    }
  }

  /** The summary data of a media capture pipeline.
    */
  @js.native
  trait MediaCapturePipelineSummary extends js.Object {
    var MediaPipelineArn: js.UndefOr[AmazonResourceName]
    var MediaPipelineId: js.UndefOr[GuidString]
  }

  object MediaCapturePipelineSummary {
    @inline
    def apply(
        MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined,
        MediaPipelineId: js.UndefOr[GuidString] = js.undefined
    ): MediaCapturePipelineSummary = {
      val __obj = js.Dynamic.literal()
      MediaPipelineArn.foreach(__v => __obj.updateDynamic("MediaPipelineArn")(__v.asInstanceOf[js.Any]))
      MediaPipelineId.foreach(__v => __obj.updateDynamic("MediaPipelineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaCapturePipelineSummary]
    }
  }

  /** Concatenates audio and video data from one or more data streams.
    */
  @js.native
  trait MediaConcatenationPipeline extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var MediaPipelineArn: js.UndefOr[AmazonResourceName]
    var MediaPipelineId: js.UndefOr[GuidString]
    var Sinks: js.UndefOr[ConcatenationSinkList]
    var Sources: js.UndefOr[ConcatenationSourceList]
    var Status: js.UndefOr[MediaPipelineStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object MediaConcatenationPipeline {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined,
        MediaPipelineId: js.UndefOr[GuidString] = js.undefined,
        Sinks: js.UndefOr[ConcatenationSinkList] = js.undefined,
        Sources: js.UndefOr[ConcatenationSourceList] = js.undefined,
        Status: js.UndefOr[MediaPipelineStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): MediaConcatenationPipeline = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      MediaPipelineArn.foreach(__v => __obj.updateDynamic("MediaPipelineArn")(__v.asInstanceOf[js.Any]))
      MediaPipelineId.foreach(__v => __obj.updateDynamic("MediaPipelineId")(__v.asInstanceOf[js.Any]))
      Sinks.foreach(__v => __obj.updateDynamic("Sinks")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaConcatenationPipeline]
    }
  }

  /** The connector pipeline.
    */
  @js.native
  trait MediaLiveConnectorPipeline extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var MediaPipelineArn: js.UndefOr[AmazonResourceName]
    var MediaPipelineId: js.UndefOr[GuidString]
    var Sinks: js.UndefOr[LiveConnectorSinkList]
    var Sources: js.UndefOr[LiveConnectorSourceList]
    var Status: js.UndefOr[MediaPipelineStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object MediaLiveConnectorPipeline {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined,
        MediaPipelineId: js.UndefOr[GuidString] = js.undefined,
        Sinks: js.UndefOr[LiveConnectorSinkList] = js.undefined,
        Sources: js.UndefOr[LiveConnectorSourceList] = js.undefined,
        Status: js.UndefOr[MediaPipelineStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): MediaLiveConnectorPipeline = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      MediaPipelineArn.foreach(__v => __obj.updateDynamic("MediaPipelineArn")(__v.asInstanceOf[js.Any]))
      MediaPipelineId.foreach(__v => __obj.updateDynamic("MediaPipelineId")(__v.asInstanceOf[js.Any]))
      Sinks.foreach(__v => __obj.updateDynamic("Sinks")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaLiveConnectorPipeline]
    }
  }

  /** A pipeline consisting of a media capture, media concatenation, or live-streaming pipeline.
    */
  @js.native
  trait MediaPipeline extends js.Object {
    var MediaCapturePipeline: js.UndefOr[MediaCapturePipeline]
    var MediaConcatenationPipeline: js.UndefOr[MediaConcatenationPipeline]
    var MediaLiveConnectorPipeline: js.UndefOr[MediaLiveConnectorPipeline]
  }

  object MediaPipeline {
    @inline
    def apply(
        MediaCapturePipeline: js.UndefOr[MediaCapturePipeline] = js.undefined,
        MediaConcatenationPipeline: js.UndefOr[MediaConcatenationPipeline] = js.undefined,
        MediaLiveConnectorPipeline: js.UndefOr[MediaLiveConnectorPipeline] = js.undefined
    ): MediaPipeline = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipeline.foreach(__v => __obj.updateDynamic("MediaCapturePipeline")(__v.asInstanceOf[js.Any]))
      MediaConcatenationPipeline.foreach(__v => __obj.updateDynamic("MediaConcatenationPipeline")(__v.asInstanceOf[js.Any]))
      MediaLiveConnectorPipeline.foreach(__v => __obj.updateDynamic("MediaLiveConnectorPipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaPipeline]
    }
  }

  /** The summary of the media pipeline.
    */
  @js.native
  trait MediaPipelineSummary extends js.Object {
    var MediaPipelineArn: js.UndefOr[AmazonResourceName]
    var MediaPipelineId: js.UndefOr[GuidString]
  }

  object MediaPipelineSummary {
    @inline
    def apply(
        MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined,
        MediaPipelineId: js.UndefOr[GuidString] = js.undefined
    ): MediaPipelineSummary = {
      val __obj = js.Dynamic.literal()
      MediaPipelineArn.foreach(__v => __obj.updateDynamic("MediaPipelineArn")(__v.asInstanceOf[js.Any]))
      MediaPipelineId.foreach(__v => __obj.updateDynamic("MediaPipelineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaPipelineSummary]
    }
  }

  /** The configuration object for an event concatenation pipeline.
    */
  @js.native
  trait MeetingEventsConcatenationConfiguration extends js.Object {
    var State: ArtifactsConcatenationState
  }

  object MeetingEventsConcatenationConfiguration {
    @inline
    def apply(
        State: ArtifactsConcatenationState
    ): MeetingEventsConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MeetingEventsConcatenationConfiguration]
    }
  }

  /** Defines the configuration for a presenter only video tile.
    */
  @js.native
  trait PresenterOnlyConfiguration extends js.Object {
    var PresenterPosition: js.UndefOr[PresenterPosition]
  }

  object PresenterOnlyConfiguration {
    @inline
    def apply(
        PresenterPosition: js.UndefOr[PresenterPosition] = js.undefined
    ): PresenterOnlyConfiguration = {
      val __obj = js.Dynamic.literal()
      PresenterPosition.foreach(__v => __obj.updateDynamic("PresenterPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PresenterOnlyConfiguration]
    }
  }

  /** The configuration settings for the S3 bucket.
    */
  @js.native
  trait S3BucketSinkConfiguration extends js.Object {
    var Destination: Arn
  }

  object S3BucketSinkConfiguration {
    @inline
    def apply(
        Destination: Arn
    ): S3BucketSinkConfiguration = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3BucketSinkConfiguration]
    }
  }

  /** The video streams for a specified media pipeline. The total number of video streams can't exceed 25.
    */
  @js.native
  trait SelectedVideoStreams extends js.Object {
    var AttendeeIds: js.UndefOr[AttendeeIdList]
    var ExternalUserIds: js.UndefOr[ExternalUserIdList]
  }

  object SelectedVideoStreams {
    @inline
    def apply(
        AttendeeIds: js.UndefOr[AttendeeIdList] = js.undefined,
        ExternalUserIds: js.UndefOr[ExternalUserIdList] = js.undefined
    ): SelectedVideoStreams = {
      val __obj = js.Dynamic.literal()
      AttendeeIds.foreach(__v => __obj.updateDynamic("AttendeeIds")(__v.asInstanceOf[js.Any]))
      ExternalUserIds.foreach(__v => __obj.updateDynamic("ExternalUserIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectedVideoStreams]
    }
  }

  /** Source configuration for a specified media pipeline.
    */
  @js.native
  trait SourceConfiguration extends js.Object {
    var SelectedVideoStreams: js.UndefOr[SelectedVideoStreams]
  }

  object SourceConfiguration {
    @inline
    def apply(
        SelectedVideoStreams: js.UndefOr[SelectedVideoStreams] = js.undefined
    ): SourceConfiguration = {
      val __obj = js.Dynamic.literal()
      SelectedVideoStreams.foreach(__v => __obj.updateDynamic("SelectedVideoStreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfiguration]
    }
  }

  /** A key/value pair that grants users access to meeting resources.
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
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
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

  /** The configuration object for concatenating transcription messages.
    */
  @js.native
  trait TranscriptionMessagesConcatenationConfiguration extends js.Object {
    var State: ArtifactsConcatenationState
  }

  object TranscriptionMessagesConcatenationConfiguration {
    @inline
    def apply(
        State: ArtifactsConcatenationState
    ): TranscriptionMessagesConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TranscriptionMessagesConcatenationConfiguration]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
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

  /** The video artifact configuration object.
    */
  @js.native
  trait VideoArtifactsConfiguration extends js.Object {
    var State: ArtifactsState
    var MuxType: js.UndefOr[VideoMuxType]
  }

  object VideoArtifactsConfiguration {
    @inline
    def apply(
        State: ArtifactsState,
        MuxType: js.UndefOr[VideoMuxType] = js.undefined
    ): VideoArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )

      MuxType.foreach(__v => __obj.updateDynamic("MuxType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoArtifactsConfiguration]
    }
  }

  /** The configuration object of a video contacatentation pipeline.
    */
  @js.native
  trait VideoConcatenationConfiguration extends js.Object {
    var State: ArtifactsConcatenationState
  }

  object VideoConcatenationConfiguration {
    @inline
    def apply(
        State: ArtifactsConcatenationState
    ): VideoConcatenationConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VideoConcatenationConfiguration]
    }
  }
}
