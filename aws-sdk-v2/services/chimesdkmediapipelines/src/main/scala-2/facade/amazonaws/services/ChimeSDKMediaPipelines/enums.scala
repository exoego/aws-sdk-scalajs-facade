package facade.amazonaws.services.chimesdkmediapipelines

import scalajs.js

@js.native
sealed trait ArtifactsConcatenationState extends js.Any
object ArtifactsConcatenationState {
  val Enabled = "Enabled".asInstanceOf[ArtifactsConcatenationState]
  val Disabled = "Disabled".asInstanceOf[ArtifactsConcatenationState]

  @inline def values: js.Array[ArtifactsConcatenationState] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ArtifactsState extends js.Any
object ArtifactsState {
  val Enabled = "Enabled".asInstanceOf[ArtifactsState]
  val Disabled = "Disabled".asInstanceOf[ArtifactsState]

  @inline def values: js.Array[ArtifactsState] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait AudioArtifactsConcatenationState extends js.Any
object AudioArtifactsConcatenationState {
  val Enabled = "Enabled".asInstanceOf[AudioArtifactsConcatenationState]

  @inline def values: js.Array[AudioArtifactsConcatenationState] = js.Array(Enabled)
}

@js.native
sealed trait AudioChannelsOption extends js.Any
object AudioChannelsOption {
  val Stereo = "Stereo".asInstanceOf[AudioChannelsOption]
  val Mono = "Mono".asInstanceOf[AudioChannelsOption]

  @inline def values: js.Array[AudioChannelsOption] = js.Array(Stereo, Mono)
}

@js.native
sealed trait AudioMuxType extends js.Any
object AudioMuxType {
  val AudioOnly = "AudioOnly".asInstanceOf[AudioMuxType]
  val AudioWithActiveSpeakerVideo = "AudioWithActiveSpeakerVideo".asInstanceOf[AudioMuxType]
  val AudioWithCompositedVideo = "AudioWithCompositedVideo".asInstanceOf[AudioMuxType]

  @inline def values: js.Array[AudioMuxType] = js.Array(AudioOnly, AudioWithActiveSpeakerVideo, AudioWithCompositedVideo)
}

@js.native
sealed trait ConcatenationSinkType extends js.Any
object ConcatenationSinkType {
  val S3Bucket = "S3Bucket".asInstanceOf[ConcatenationSinkType]

  @inline def values: js.Array[ConcatenationSinkType] = js.Array(S3Bucket)
}

@js.native
sealed trait ConcatenationSourceType extends js.Any
object ConcatenationSourceType {
  val MediaCapturePipeline = "MediaCapturePipeline".asInstanceOf[ConcatenationSourceType]

  @inline def values: js.Array[ConcatenationSourceType] = js.Array(MediaCapturePipeline)
}

@js.native
sealed trait ContentMuxType extends js.Any
object ContentMuxType {
  val ContentOnly = "ContentOnly".asInstanceOf[ContentMuxType]

  @inline def values: js.Array[ContentMuxType] = js.Array(ContentOnly)
}

@js.native
sealed trait ContentShareLayoutOption extends js.Any
object ContentShareLayoutOption {
  val PresenterOnly = "PresenterOnly".asInstanceOf[ContentShareLayoutOption]
  val Horizontal = "Horizontal".asInstanceOf[ContentShareLayoutOption]
  val Vertical = "Vertical".asInstanceOf[ContentShareLayoutOption]

  @inline def values: js.Array[ContentShareLayoutOption] = js.Array(PresenterOnly, Horizontal, Vertical)
}

@js.native
sealed trait LayoutOption extends js.Any
object LayoutOption {
  val GridView = "GridView".asInstanceOf[LayoutOption]

  @inline def values: js.Array[LayoutOption] = js.Array(GridView)
}

@js.native
sealed trait LiveConnectorMuxType extends js.Any
object LiveConnectorMuxType {
  val AudioWithCompositedVideo = "AudioWithCompositedVideo".asInstanceOf[LiveConnectorMuxType]
  val AudioWithActiveSpeakerVideo = "AudioWithActiveSpeakerVideo".asInstanceOf[LiveConnectorMuxType]

  @inline def values: js.Array[LiveConnectorMuxType] = js.Array(AudioWithCompositedVideo, AudioWithActiveSpeakerVideo)
}

@js.native
sealed trait LiveConnectorSinkType extends js.Any
object LiveConnectorSinkType {
  val RTMP = "RTMP".asInstanceOf[LiveConnectorSinkType]

  @inline def values: js.Array[LiveConnectorSinkType] = js.Array(RTMP)
}

@js.native
sealed trait LiveConnectorSourceType extends js.Any
object LiveConnectorSourceType {
  val ChimeSdkMeeting = "ChimeSdkMeeting".asInstanceOf[LiveConnectorSourceType]

  @inline def values: js.Array[LiveConnectorSourceType] = js.Array(ChimeSdkMeeting)
}

@js.native
sealed trait MediaPipelineSinkType extends js.Any
object MediaPipelineSinkType {
  val S3Bucket = "S3Bucket".asInstanceOf[MediaPipelineSinkType]

  @inline def values: js.Array[MediaPipelineSinkType] = js.Array(S3Bucket)
}

@js.native
sealed trait MediaPipelineSourceType extends js.Any
object MediaPipelineSourceType {
  val ChimeSdkMeeting = "ChimeSdkMeeting".asInstanceOf[MediaPipelineSourceType]

  @inline def values: js.Array[MediaPipelineSourceType] = js.Array(ChimeSdkMeeting)
}

@js.native
sealed trait MediaPipelineStatus extends js.Any
object MediaPipelineStatus {
  val Initializing = "Initializing".asInstanceOf[MediaPipelineStatus]
  val InProgress = "InProgress".asInstanceOf[MediaPipelineStatus]
  val Failed = "Failed".asInstanceOf[MediaPipelineStatus]
  val Stopping = "Stopping".asInstanceOf[MediaPipelineStatus]
  val Stopped = "Stopped".asInstanceOf[MediaPipelineStatus]

  @inline def values: js.Array[MediaPipelineStatus] = js.Array(Initializing, InProgress, Failed, Stopping, Stopped)
}

@js.native
sealed trait PresenterPosition extends js.Any
object PresenterPosition {
  val TopLeft = "TopLeft".asInstanceOf[PresenterPosition]
  val TopRight = "TopRight".asInstanceOf[PresenterPosition]
  val BottomLeft = "BottomLeft".asInstanceOf[PresenterPosition]
  val BottomRight = "BottomRight".asInstanceOf[PresenterPosition]

  @inline def values: js.Array[PresenterPosition] = js.Array(TopLeft, TopRight, BottomLeft, BottomRight)
}

@js.native
sealed trait ResolutionOption extends js.Any
object ResolutionOption {
  val HD = "HD".asInstanceOf[ResolutionOption]
  val FHD = "FHD".asInstanceOf[ResolutionOption]

  @inline def values: js.Array[ResolutionOption] = js.Array(HD, FHD)
}

@js.native
sealed trait VideoMuxType extends js.Any
object VideoMuxType {
  val VideoOnly = "VideoOnly".asInstanceOf[VideoMuxType]

  @inline def values: js.Array[VideoMuxType] = js.Array(VideoOnly)
}
