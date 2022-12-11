package facade.amazonaws.services.chimesdkmediapipelines

import scalajs.js

type ArtifactsConcatenationState = "Enabled" | "Disabled"
object ArtifactsConcatenationState {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ArtifactsConcatenationState] = js.Array(Enabled, Disabled)
}

type ArtifactsState = "Enabled" | "Disabled"
object ArtifactsState {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ArtifactsState] = js.Array(Enabled, Disabled)
}

type AudioArtifactsConcatenationState = "Enabled"
object AudioArtifactsConcatenationState {
  inline val Enabled: "Enabled" = "Enabled"

  inline def values: js.Array[AudioArtifactsConcatenationState] = js.Array(Enabled)
}

type AudioChannelsOption = "Stereo" | "Mono"
object AudioChannelsOption {
  inline val Stereo: "Stereo" = "Stereo"
  inline val Mono: "Mono" = "Mono"

  inline def values: js.Array[AudioChannelsOption] = js.Array(Stereo, Mono)
}

type AudioMuxType = "AudioOnly" | "AudioWithActiveSpeakerVideo" | "AudioWithCompositedVideo"
object AudioMuxType {
  inline val AudioOnly: "AudioOnly" = "AudioOnly"
  inline val AudioWithActiveSpeakerVideo: "AudioWithActiveSpeakerVideo" = "AudioWithActiveSpeakerVideo"
  inline val AudioWithCompositedVideo: "AudioWithCompositedVideo" = "AudioWithCompositedVideo"

  inline def values: js.Array[AudioMuxType] = js.Array(AudioOnly, AudioWithActiveSpeakerVideo, AudioWithCompositedVideo)
}

type ConcatenationSinkType = "S3Bucket"
object ConcatenationSinkType {
  inline val S3Bucket: "S3Bucket" = "S3Bucket"

  inline def values: js.Array[ConcatenationSinkType] = js.Array(S3Bucket)
}

type ConcatenationSourceType = "MediaCapturePipeline"
object ConcatenationSourceType {
  inline val MediaCapturePipeline: "MediaCapturePipeline" = "MediaCapturePipeline"

  inline def values: js.Array[ConcatenationSourceType] = js.Array(MediaCapturePipeline)
}

type ContentMuxType = "ContentOnly"
object ContentMuxType {
  inline val ContentOnly: "ContentOnly" = "ContentOnly"

  inline def values: js.Array[ContentMuxType] = js.Array(ContentOnly)
}

type ContentShareLayoutOption = "PresenterOnly" | "Horizontal" | "Vertical"
object ContentShareLayoutOption {
  inline val PresenterOnly: "PresenterOnly" = "PresenterOnly"
  inline val Horizontal: "Horizontal" = "Horizontal"
  inline val Vertical: "Vertical" = "Vertical"

  inline def values: js.Array[ContentShareLayoutOption] = js.Array(PresenterOnly, Horizontal, Vertical)
}

type LayoutOption = "GridView"
object LayoutOption {
  inline val GridView: "GridView" = "GridView"

  inline def values: js.Array[LayoutOption] = js.Array(GridView)
}

type LiveConnectorMuxType = "AudioWithCompositedVideo" | "AudioWithActiveSpeakerVideo"
object LiveConnectorMuxType {
  inline val AudioWithCompositedVideo: "AudioWithCompositedVideo" = "AudioWithCompositedVideo"
  inline val AudioWithActiveSpeakerVideo: "AudioWithActiveSpeakerVideo" = "AudioWithActiveSpeakerVideo"

  inline def values: js.Array[LiveConnectorMuxType] = js.Array(AudioWithCompositedVideo, AudioWithActiveSpeakerVideo)
}

type LiveConnectorSinkType = "RTMP"
object LiveConnectorSinkType {
  inline val RTMP: "RTMP" = "RTMP"

  inline def values: js.Array[LiveConnectorSinkType] = js.Array(RTMP)
}

type LiveConnectorSourceType = "ChimeSdkMeeting"
object LiveConnectorSourceType {
  inline val ChimeSdkMeeting: "ChimeSdkMeeting" = "ChimeSdkMeeting"

  inline def values: js.Array[LiveConnectorSourceType] = js.Array(ChimeSdkMeeting)
}

type MediaPipelineSinkType = "S3Bucket"
object MediaPipelineSinkType {
  inline val S3Bucket: "S3Bucket" = "S3Bucket"

  inline def values: js.Array[MediaPipelineSinkType] = js.Array(S3Bucket)
}

type MediaPipelineSourceType = "ChimeSdkMeeting"
object MediaPipelineSourceType {
  inline val ChimeSdkMeeting: "ChimeSdkMeeting" = "ChimeSdkMeeting"

  inline def values: js.Array[MediaPipelineSourceType] = js.Array(ChimeSdkMeeting)
}

type MediaPipelineStatus = "Initializing" | "InProgress" | "Failed" | "Stopping" | "Stopped"
object MediaPipelineStatus {
  inline val Initializing: "Initializing" = "Initializing"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[MediaPipelineStatus] = js.Array(Initializing, InProgress, Failed, Stopping, Stopped)
}

type PresenterPosition = "TopLeft" | "TopRight" | "BottomLeft" | "BottomRight"
object PresenterPosition {
  inline val TopLeft: "TopLeft" = "TopLeft"
  inline val TopRight: "TopRight" = "TopRight"
  inline val BottomLeft: "BottomLeft" = "BottomLeft"
  inline val BottomRight: "BottomRight" = "BottomRight"

  inline def values: js.Array[PresenterPosition] = js.Array(TopLeft, TopRight, BottomLeft, BottomRight)
}

type ResolutionOption = "HD" | "FHD"
object ResolutionOption {
  inline val HD: "HD" = "HD"
  inline val FHD: "FHD" = "FHD"

  inline def values: js.Array[ResolutionOption] = js.Array(HD, FHD)
}

type VideoMuxType = "VideoOnly"
object VideoMuxType {
  inline val VideoOnly: "VideoOnly" = "VideoOnly"

  inline def values: js.Array[VideoMuxType] = js.Array(VideoOnly)
}
