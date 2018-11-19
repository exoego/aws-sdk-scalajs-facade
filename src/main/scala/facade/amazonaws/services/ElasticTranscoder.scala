package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object elastictranscoder {
  type AccessControl = String
  type AccessControls = js.Array[AccessControl]
  type Artworks = js.Array[Artwork]
  type Ascending = String
  type AspectRatio = String
  type AudioBitDepth = String
  type AudioBitOrder = String
  type AudioBitRate = String
  type AudioChannels = String
  type AudioCodec = String
  type AudioCodecProfile = String
  type AudioPackingMode = String
  type AudioSampleRate = String
  type AudioSigned = String
  type Base64EncodedString = String
  type BucketName = String
  type CaptionFormatFormat = String
  type CaptionFormatPattern = String
  type CaptionFormats = js.Array[CaptionFormat]
  type CaptionMergePolicy = String
  type CaptionSources = js.Array[CaptionSource]
  type CodecOption = String
  type CodecOptions = js.Dictionary[CodecOption]
  type Composition = js.Array[Clip]
  type CreateJobOutputs = js.Array[CreateJobOutput]
  type CreateJobPlaylists = js.Array[CreateJobPlaylist]
  type Description = String
  type Digits = String
  type DigitsOrAuto = String
  type EncryptionMode = String
  type ExceptionMessages = js.Array[String]
  type Filename = String
  type FixedGOP = String
  type FloatString = String
  type FrameRate = String
  type Grantee = String
  type GranteeType = String
  type HlsContentProtectionMethod = String
  type HorizontalAlign = String
  type Id = String
  type Interlaced = String
  type JobContainer = String
  type JobInputs = js.Array[JobInput]
  type JobOutputs = js.Array[JobOutput]
  type JobStatus = String
  type JobWatermarks = js.Array[JobWatermark]
  type Jobs = js.Array[Job]
  type JpgOrPng = String
  type Key = String
  type KeyArn = String
  type KeyIdGuid = String
  type KeyStoragePolicy = String
  type KeyframesMaxDist = String
  type LongKey = String
  type MaxFrameRate = String
  type MergePolicy = String
  type Name = String
  type NonEmptyBase64EncodedString = String
  type NullableInteger = Int
  type NullableLong = Double
  type OneTo512String = String
  type Opacity = String
  type OutputKeys = js.Array[Key]
  type PaddingPolicy = String
  type Permissions = js.Array[Permission]
  type PipelineStatus = String
  type Pipelines = js.Array[Pipeline]
  type PixelsOrPercent = String
  type PlayReadyDrmFormatString = String
  type PlaylistFormat = String
  type Playlists = js.Array[Playlist]
  type PresetContainer = String
  type PresetType = String
  type PresetWatermarkId = String
  type PresetWatermarks = js.Array[PresetWatermark]
  type Presets = js.Array[Preset]
  type Resolution = String
  type Role = String
  type Rotate = String
  type SizingPolicy = String
  type SnsTopic = String
  type SnsTopics = js.Array[SnsTopic]
  type StorageClass = String
  type Success = String
  type Target = String
  type ThumbnailPattern = String
  type ThumbnailResolution = String
  type Time = String
  type TimeOffset = String
  type UserMetadata = js.Dictionary[String]
  type VerticalAlign = String
  type VideoBitRate = String
  type VideoCodec = String
  type Warnings = js.Array[Warning]
  type WatermarkKey = String
  type WatermarkSizingPolicy = String
  type ZeroTo255String = String
  type ZeroTo512String = String
}

package elastictranscoder {
  @js.native
  @JSImport("aws-sdk", "ElasticTranscoder")
  class ElasticTranscoder(config: AWSConfig) extends js.Object {
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse] = js.native
    def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse] = js.native
    def deletePipeline(params: DeletePipelineRequest): Request[DeletePipelineResponse] = js.native
    def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse] = js.native
    def listJobsByPipeline(params: ListJobsByPipelineRequest): Request[ListJobsByPipelineResponse] = js.native
    def listJobsByStatus(params: ListJobsByStatusRequest): Request[ListJobsByStatusResponse] = js.native
    def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse] = js.native
    def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse] = js.native
    def readJob(params: ReadJobRequest): Request[ReadJobResponse] = js.native
    def readPipeline(params: ReadPipelineRequest): Request[ReadPipelineResponse] = js.native
    def readPreset(params: ReadPresetRequest): Request[ReadPresetResponse] = js.native
    def testRole(params: TestRoleRequest): Request[TestRoleResponse] = js.native
    def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse] = js.native
    def updatePipelineNotifications(params: UpdatePipelineNotificationsRequest): Request[UpdatePipelineNotificationsResponse] = js.native
    def updatePipelineStatus(params: UpdatePipelineStatusRequest): Request[UpdatePipelineStatusResponse] = js.native
  }

  /**
   * <p>The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20.</p> <p>To remove artwork or leave the artwork empty, you can either set <code>Artwork</code> to null, or set the <code>Merge Policy</code> to "Replace" and use an empty <code>Artwork</code> array.</p> <p>To pass through existing artwork unchanged, set the <code>Merge Policy</code> to "Prepend", "Append", or "Fallback", and use an empty <code>Artwork</code> array.</p>
   */
  @js.native
  trait Artwork extends js.Object {
    var InputKey: js.UndefOr[WatermarkKey]
    var SizingPolicy: js.UndefOr[SizingPolicy]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var AlbumArtFormat: js.UndefOr[JpgOrPng]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
    var Encryption: js.UndefOr[Encryption]
  }

  object Artwork {
    def apply(
      InputKey: js.UndefOr[WatermarkKey] = js.undefined,
      SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined,
      MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
      PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
      AlbumArtFormat: js.UndefOr[JpgOrPng] = js.undefined,
      MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined): Artwork = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputKey" -> InputKey.map { x => x.asInstanceOf[js.Any] },
        "SizingPolicy" -> SizingPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaxHeight" -> MaxHeight.map { x => x.asInstanceOf[js.Any] },
        "PaddingPolicy" -> PaddingPolicy.map { x => x.asInstanceOf[js.Any] },
        "AlbumArtFormat" -> AlbumArtFormat.map { x => x.asInstanceOf[js.Any] },
        "MaxWidth" -> MaxWidth.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Artwork]
    }
  }

  /**
   * <p>Options associated with your audio codec.</p>
   */
  @js.native
  trait AudioCodecOptions extends js.Object {
    var Profile: js.UndefOr[AudioCodecProfile]
    var BitDepth: js.UndefOr[AudioBitDepth]
    var BitOrder: js.UndefOr[AudioBitOrder]
    var Signed: js.UndefOr[AudioSigned]
  }

  object AudioCodecOptions {
    def apply(
      Profile: js.UndefOr[AudioCodecProfile] = js.undefined,
      BitDepth: js.UndefOr[AudioBitDepth] = js.undefined,
      BitOrder: js.UndefOr[AudioBitOrder] = js.undefined,
      Signed: js.UndefOr[AudioSigned] = js.undefined): AudioCodecOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Profile" -> Profile.map { x => x.asInstanceOf[js.Any] },
        "BitDepth" -> BitDepth.map { x => x.asInstanceOf[js.Any] },
        "BitOrder" -> BitOrder.map { x => x.asInstanceOf[js.Any] },
        "Signed" -> Signed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioCodecOptions]
    }
  }

  /**
   * <p>Parameters required for transcoding audio.</p>
   */
  @js.native
  trait AudioParameters extends js.Object {
    var BitRate: js.UndefOr[AudioBitRate]
    var CodecOptions: js.UndefOr[AudioCodecOptions]
    var Channels: js.UndefOr[AudioChannels]
    var Codec: js.UndefOr[AudioCodec]
    var SampleRate: js.UndefOr[AudioSampleRate]
    var AudioPackingMode: js.UndefOr[AudioPackingMode]
  }

  object AudioParameters {
    def apply(
      BitRate: js.UndefOr[AudioBitRate] = js.undefined,
      CodecOptions: js.UndefOr[AudioCodecOptions] = js.undefined,
      Channels: js.UndefOr[AudioChannels] = js.undefined,
      Codec: js.UndefOr[AudioCodec] = js.undefined,
      SampleRate: js.UndefOr[AudioSampleRate] = js.undefined,
      AudioPackingMode: js.UndefOr[AudioPackingMode] = js.undefined): AudioParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BitRate" -> BitRate.map { x => x.asInstanceOf[js.Any] },
        "CodecOptions" -> CodecOptions.map { x => x.asInstanceOf[js.Any] },
        "Channels" -> Channels.map { x => x.asInstanceOf[js.Any] },
        "Codec" -> Codec.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] },
        "AudioPackingMode" -> AudioPackingMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioParameters]
    }
  }

  /**
   * <p>The <code>CancelJobRequest</code> structure.</p>
   */
  @js.native
  trait CancelJobRequest extends js.Object {
    var Id: js.UndefOr[Id]
  }

  object CancelJobRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  /**
   * <p>The response body contains a JSON object. If the job is successfully canceled, the value of <code>Success</code> is <code>true</code>.</p>
   */
  @js.native
  trait CancelJobResponse extends js.Object {

  }

  object CancelJobResponse {
    def apply(): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
    }
  }

  /**
   * <p>The file format of the output captions. If you leave this value blank, Elastic Transcoder returns an error.</p>
   */
  @js.native
  trait CaptionFormat extends js.Object {
    var Format: js.UndefOr[CaptionFormatFormat]
    var Pattern: js.UndefOr[CaptionFormatPattern]
    var Encryption: js.UndefOr[Encryption]
  }

  object CaptionFormat {
    def apply(
      Format: js.UndefOr[CaptionFormatFormat] = js.undefined,
      Pattern: js.UndefOr[CaptionFormatPattern] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined): CaptionFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Pattern" -> Pattern.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionFormat]
    }
  }

  /**
   * <p>A source file for the input sidecar captions used during the transcoding process.</p>
   */
  @js.native
  trait CaptionSource extends js.Object {
    var TimeOffset: js.UndefOr[TimeOffset]
    var Language: js.UndefOr[Key]
    var Label: js.UndefOr[Name]
    var Encryption: js.UndefOr[Encryption]
    var Key: js.UndefOr[LongKey]
  }

  object CaptionSource {
    def apply(
      TimeOffset: js.UndefOr[TimeOffset] = js.undefined,
      Language: js.UndefOr[Key] = js.undefined,
      Label: js.UndefOr[Name] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      Key: js.UndefOr[LongKey] = js.undefined): CaptionSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeOffset" -> TimeOffset.map { x => x.asInstanceOf[js.Any] },
        "Language" -> Language.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionSource]
    }
  }

  /**
   * <p>The captions to be created, if any.</p>
   */
  @js.native
  trait Captions extends js.Object {
    var MergePolicy: js.UndefOr[CaptionMergePolicy]
    var CaptionSources: js.UndefOr[CaptionSources]
    var CaptionFormats: js.UndefOr[CaptionFormats]
  }

  object Captions {
    def apply(
      MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined,
      CaptionSources: js.UndefOr[CaptionSources] = js.undefined,
      CaptionFormats: js.UndefOr[CaptionFormats] = js.undefined): Captions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MergePolicy" -> MergePolicy.map { x => x.asInstanceOf[js.Any] },
        "CaptionSources" -> CaptionSources.map { x => x.asInstanceOf[js.Any] },
        "CaptionFormats" -> CaptionFormats.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Captions]
    }
  }

  /**
   * <p>Settings for one clip in a composition. All jobs in a playlist must have the same clip settings.</p>
   */
  @deprecated
  @js.native
  trait Clip extends js.Object {
    var TimeSpan: js.UndefOr[TimeSpan]
  }

  object Clip {
    def apply(
      TimeSpan: js.UndefOr[TimeSpan] = js.undefined): Clip = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeSpan" -> TimeSpan.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Clip]
    }
  }

  /**
   * <p>The <code>CreateJobOutput</code> structure.</p>
   */
  @js.native
  trait CreateJobOutput extends js.Object {
    var Watermarks: js.UndefOr[JobWatermarks]
    var ThumbnailPattern: js.UndefOr[ThumbnailPattern]
    var AlbumArt: js.UndefOr[JobAlbumArt]
    var Composition: js.UndefOr[Composition]
    var Rotate: js.UndefOr[Rotate]
    var SegmentDuration: js.UndefOr[FloatString]
    var ThumbnailEncryption: js.UndefOr[Encryption]
    var Captions: js.UndefOr[Captions]
    var Encryption: js.UndefOr[Encryption]
    var PresetId: js.UndefOr[Id]
    var Key: js.UndefOr[Key]
  }

  object CreateJobOutput {
    def apply(
      Watermarks: js.UndefOr[JobWatermarks] = js.undefined,
      ThumbnailPattern: js.UndefOr[ThumbnailPattern] = js.undefined,
      AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined,
      Composition: js.UndefOr[Composition] = js.undefined,
      Rotate: js.UndefOr[Rotate] = js.undefined,
      SegmentDuration: js.UndefOr[FloatString] = js.undefined,
      ThumbnailEncryption: js.UndefOr[Encryption] = js.undefined,
      Captions: js.UndefOr[Captions] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      PresetId: js.UndefOr[Id] = js.undefined,
      Key: js.UndefOr[Key] = js.undefined): CreateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Watermarks" -> Watermarks.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailPattern" -> ThumbnailPattern.map { x => x.asInstanceOf[js.Any] },
        "AlbumArt" -> AlbumArt.map { x => x.asInstanceOf[js.Any] },
        "Composition" -> Composition.map { x => x.asInstanceOf[js.Any] },
        "Rotate" -> Rotate.map { x => x.asInstanceOf[js.Any] },
        "SegmentDuration" -> SegmentDuration.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailEncryption" -> ThumbnailEncryption.map { x => x.asInstanceOf[js.Any] },
        "Captions" -> Captions.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "PresetId" -> PresetId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobOutput]
    }
  }

  /**
   * <p>Information about the master playlist.</p>
   */
  @js.native
  trait CreateJobPlaylist extends js.Object {
    var Format: js.UndefOr[PlaylistFormat]
    var Name: js.UndefOr[Filename]
    var HlsContentProtection: js.UndefOr[HlsContentProtection]
    var PlayReadyDrm: js.UndefOr[PlayReadyDrm]
    var OutputKeys: js.UndefOr[OutputKeys]
  }

  object CreateJobPlaylist {
    def apply(
      Format: js.UndefOr[PlaylistFormat] = js.undefined,
      Name: js.UndefOr[Filename] = js.undefined,
      HlsContentProtection: js.UndefOr[HlsContentProtection] = js.undefined,
      PlayReadyDrm: js.UndefOr[PlayReadyDrm] = js.undefined,
      OutputKeys: js.UndefOr[OutputKeys] = js.undefined): CreateJobPlaylist = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "HlsContentProtection" -> HlsContentProtection.map { x => x.asInstanceOf[js.Any] },
        "PlayReadyDrm" -> PlayReadyDrm.map { x => x.asInstanceOf[js.Any] },
        "OutputKeys" -> OutputKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobPlaylist]
    }
  }

  /**
   * <p>The <code>CreateJobRequest</code> structure.</p>
   */
  @js.native
  trait CreateJobRequest extends js.Object {
    var Playlists: js.UndefOr[CreateJobPlaylists]
    var PipelineId: js.UndefOr[Id]
    var UserMetadata: js.UndefOr[UserMetadata]
    var Inputs: js.UndefOr[JobInputs]
    var OutputKeyPrefix: js.UndefOr[Key]
    var Input: js.UndefOr[JobInput]
    var Output: js.UndefOr[CreateJobOutput]
    var Outputs: js.UndefOr[CreateJobOutputs]
  }

  object CreateJobRequest {
    def apply(
      Playlists: js.UndefOr[CreateJobPlaylists] = js.undefined,
      PipelineId: js.UndefOr[Id] = js.undefined,
      UserMetadata: js.UndefOr[UserMetadata] = js.undefined,
      Inputs: js.UndefOr[JobInputs] = js.undefined,
      OutputKeyPrefix: js.UndefOr[Key] = js.undefined,
      Input: js.UndefOr[JobInput] = js.undefined,
      Output: js.UndefOr[CreateJobOutput] = js.undefined,
      Outputs: js.UndefOr[CreateJobOutputs] = js.undefined): CreateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Playlists" -> Playlists.map { x => x.asInstanceOf[js.Any] },
        "PipelineId" -> PipelineId.map { x => x.asInstanceOf[js.Any] },
        "UserMetadata" -> UserMetadata.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "OutputKeyPrefix" -> OutputKeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
    }
  }

  /**
   * <p>The CreateJobResponse structure.</p>
   */
  @js.native
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object CreateJobResponse {
    def apply(
      Job: js.UndefOr[Job] = js.undefined): CreateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Job" -> Job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResponse]
    }
  }

  /**
   * <p>The <code>CreatePipelineRequest</code> structure.</p>
   */
  @js.native
  trait CreatePipelineRequest extends js.Object {
    var Role: js.UndefOr[Role]
    var Name: js.UndefOr[Name]
    var ThumbnailConfig: js.UndefOr[PipelineOutputConfig]
    var OutputBucket: js.UndefOr[BucketName]
    var InputBucket: js.UndefOr[BucketName]
    var AwsKmsKeyArn: js.UndefOr[KeyArn]
    var Notifications: js.UndefOr[Notifications]
    var ContentConfig: js.UndefOr[PipelineOutputConfig]
  }

  object CreatePipelineRequest {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
      OutputBucket: js.UndefOr[BucketName] = js.undefined,
      InputBucket: js.UndefOr[BucketName] = js.undefined,
      AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
      Notifications: js.UndefOr[Notifications] = js.undefined,
      ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined): CreatePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailConfig" -> ThumbnailConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputBucket" -> OutputBucket.map { x => x.asInstanceOf[js.Any] },
        "InputBucket" -> InputBucket.map { x => x.asInstanceOf[js.Any] },
        "AwsKmsKeyArn" -> AwsKmsKeyArn.map { x => x.asInstanceOf[js.Any] },
        "Notifications" -> Notifications.map { x => x.asInstanceOf[js.Any] },
        "ContentConfig" -> ContentConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineRequest]
    }
  }

  /**
   * <p>When you create a pipeline, Elastic Transcoder returns the values that you specified in the request.</p>
   */
  @js.native
  trait CreatePipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  object CreatePipelineResponse {
    def apply(
      Pipeline: js.UndefOr[Pipeline] = js.undefined,
      Warnings: js.UndefOr[Warnings] = js.undefined): CreatePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipeline" -> Pipeline.map { x => x.asInstanceOf[js.Any] },
        "Warnings" -> Warnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineResponse]
    }
  }

  /**
   * <p>The <code>CreatePresetRequest</code> structure.</p>
   */
  @js.native
  trait CreatePresetRequest extends js.Object {
    var Name: js.UndefOr[Name]
    var Description: js.UndefOr[Description]
    var Thumbnails: js.UndefOr[Thumbnails]
    var Container: js.UndefOr[PresetContainer]
    var Audio: js.UndefOr[AudioParameters]
    var Video: js.UndefOr[VideoParameters]
  }

  object CreatePresetRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Thumbnails: js.UndefOr[Thumbnails] = js.undefined,
      Container: js.UndefOr[PresetContainer] = js.undefined,
      Audio: js.UndefOr[AudioParameters] = js.undefined,
      Video: js.UndefOr[VideoParameters] = js.undefined): CreatePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Thumbnails" -> Thumbnails.map { x => x.asInstanceOf[js.Any] },
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] },
        "Audio" -> Audio.map { x => x.asInstanceOf[js.Any] },
        "Video" -> Video.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresetRequest]
    }
  }

  /**
   * <p>The <code>CreatePresetResponse</code> structure.</p>
   */
  @js.native
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
    var Warning: js.UndefOr[String]
  }

  object CreatePresetResponse {
    def apply(
      Preset: js.UndefOr[Preset] = js.undefined,
      Warning: js.UndefOr[String] = js.undefined): CreatePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Preset" -> Preset.map { x => x.asInstanceOf[js.Any] },
        "Warning" -> Warning.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresetResponse]
    }
  }

  /**
   * <p>The <code>DeletePipelineRequest</code> structure.</p>
   */
  @js.native
  trait DeletePipelineRequest extends js.Object {
    var Id: js.UndefOr[Id]
  }

  object DeletePipelineRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined): DeletePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePipelineRequest]
    }
  }

  /**
   * <p>The <code>DeletePipelineResponse</code> structure.</p>
   */
  @js.native
  trait DeletePipelineResponse extends js.Object {

  }

  object DeletePipelineResponse {
    def apply(): DeletePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePipelineResponse]
    }
  }

  /**
   * <p>The <code>DeletePresetRequest</code> structure.</p>
   */
  @js.native
  trait DeletePresetRequest extends js.Object {
    var Id: js.UndefOr[Id]
  }

  object DeletePresetRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined): DeletePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePresetRequest]
    }
  }

  /**
   * <p>The <code>DeletePresetResponse</code> structure.</p>
   */
  @js.native
  trait DeletePresetResponse extends js.Object {

  }

  object DeletePresetResponse {
    def apply(): DeletePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePresetResponse]
    }
  }

  /**
   * <p>The detected properties of the input file. Elastic Transcoder identifies these values from the input file.</p>
   */
  @js.native
  trait DetectedProperties extends js.Object {
    var FileSize: js.UndefOr[NullableLong]
    var Width: js.UndefOr[NullableInteger]
    var DurationMillis: js.UndefOr[NullableLong]
    var Height: js.UndefOr[NullableInteger]
    var FrameRate: js.UndefOr[FloatString]
  }

  object DetectedProperties {
    def apply(
      FileSize: js.UndefOr[NullableLong] = js.undefined,
      Width: js.UndefOr[NullableInteger] = js.undefined,
      DurationMillis: js.UndefOr[NullableLong] = js.undefined,
      Height: js.UndefOr[NullableInteger] = js.undefined,
      FrameRate: js.UndefOr[FloatString] = js.undefined): DetectedProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSize" -> FileSize.map { x => x.asInstanceOf[js.Any] },
        "Width" -> Width.map { x => x.asInstanceOf[js.Any] },
        "DurationMillis" -> DurationMillis.map { x => x.asInstanceOf[js.Any] },
        "Height" -> Height.map { x => x.asInstanceOf[js.Any] },
        "FrameRate" -> FrameRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectedProperties]
    }
  }

  /**
   * <p>The encryption settings, if any, that are used for decrypting your input files or encrypting your output files. If your input file is encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file, otherwise you must specify the mode you want Elastic Transcoder to use to encrypt your output files.</p>
   */
  @js.native
  trait Encryption extends js.Object {
    var Mode: js.UndefOr[EncryptionMode]
    var Key: js.UndefOr[Base64EncodedString]
    var KeyMd5: js.UndefOr[Base64EncodedString]
    var InitializationVector: js.UndefOr[ZeroTo255String]
  }

  object Encryption {
    def apply(
      Mode: js.UndefOr[EncryptionMode] = js.undefined,
      Key: js.UndefOr[Base64EncodedString] = js.undefined,
      KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined,
      InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined): Encryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "KeyMd5" -> KeyMd5.map { x => x.asInstanceOf[js.Any] },
        "InitializationVector" -> InitializationVector.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Encryption]
    }
  }

  /**
   * <p>The HLS content protection settings, if any, that you want Elastic Transcoder to apply to your output files.</p>
   */
  @js.native
  trait HlsContentProtection extends js.Object {
    var KeyMd5: js.UndefOr[Base64EncodedString]
    var LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String]
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Method: js.UndefOr[HlsContentProtectionMethod]
    var KeyStoragePolicy: js.UndefOr[KeyStoragePolicy]
    var Key: js.UndefOr[Base64EncodedString]
  }

  object HlsContentProtection {
    def apply(
      KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined,
      LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String] = js.undefined,
      InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
      Method: js.UndefOr[HlsContentProtectionMethod] = js.undefined,
      KeyStoragePolicy: js.UndefOr[KeyStoragePolicy] = js.undefined,
      Key: js.UndefOr[Base64EncodedString] = js.undefined): HlsContentProtection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyMd5" -> KeyMd5.map { x => x.asInstanceOf[js.Any] },
        "LicenseAcquisitionUrl" -> LicenseAcquisitionUrl.map { x => x.asInstanceOf[js.Any] },
        "InitializationVector" -> InitializationVector.map { x => x.asInstanceOf[js.Any] },
        "Method" -> Method.map { x => x.asInstanceOf[js.Any] },
        "KeyStoragePolicy" -> KeyStoragePolicy.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsContentProtection]
    }
  }

  /**
   * <p>The captions to be created, if any.</p>
   */
  @js.native
  trait InputCaptions extends js.Object {
    var MergePolicy: js.UndefOr[CaptionMergePolicy]
    var CaptionSources: js.UndefOr[CaptionSources]
  }

  object InputCaptions {
    def apply(
      MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined,
      CaptionSources: js.UndefOr[CaptionSources] = js.undefined): InputCaptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MergePolicy" -> MergePolicy.map { x => x.asInstanceOf[js.Any] },
        "CaptionSources" -> CaptionSources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputCaptions]
    }
  }

  /**
   * <p>A section of the response body that provides information about the job that is created.</p>
   */
  @js.native
  trait Job extends js.Object {
    var Id: js.UndefOr[Id]
    var Playlists: js.UndefOr[Playlists]
    var PipelineId: js.UndefOr[Id]
    var UserMetadata: js.UndefOr[UserMetadata]
    var Inputs: js.UndefOr[JobInputs]
    var OutputKeyPrefix: js.UndefOr[Key]
    var Arn: js.UndefOr[String]
    var Input: js.UndefOr[JobInput]
    var Output: js.UndefOr[JobOutput]
    var Timing: js.UndefOr[Timing]
    var Status: js.UndefOr[JobStatus]
    var Outputs: js.UndefOr[JobOutputs]
  }

  object Job {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      Playlists: js.UndefOr[Playlists] = js.undefined,
      PipelineId: js.UndefOr[Id] = js.undefined,
      UserMetadata: js.UndefOr[UserMetadata] = js.undefined,
      Inputs: js.UndefOr[JobInputs] = js.undefined,
      OutputKeyPrefix: js.UndefOr[Key] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      Input: js.UndefOr[JobInput] = js.undefined,
      Output: js.UndefOr[JobOutput] = js.undefined,
      Timing: js.UndefOr[Timing] = js.undefined,
      Status: js.UndefOr[JobStatus] = js.undefined,
      Outputs: js.UndefOr[JobOutputs] = js.undefined): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Playlists" -> Playlists.map { x => x.asInstanceOf[js.Any] },
        "PipelineId" -> PipelineId.map { x => x.asInstanceOf[js.Any] },
        "UserMetadata" -> UserMetadata.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "OutputKeyPrefix" -> OutputKeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] },
        "Timing" -> Timing.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
    }
  }

  /**
   * <p>The .jpg or .png file associated with an audio file.</p>
   */
  @js.native
  trait JobAlbumArt extends js.Object {
    var MergePolicy: js.UndefOr[MergePolicy]
    var Artwork: js.UndefOr[Artworks]
  }

  object JobAlbumArt {
    def apply(
      MergePolicy: js.UndefOr[MergePolicy] = js.undefined,
      Artwork: js.UndefOr[Artworks] = js.undefined): JobAlbumArt = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MergePolicy" -> MergePolicy.map { x => x.asInstanceOf[js.Any] },
        "Artwork" -> Artwork.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobAlbumArt]
    }
  }

  /**
   * <p>Information about the file that you're transcoding.</p>
   */
  @js.native
  trait JobInput extends js.Object {
    var Resolution: js.UndefOr[Resolution]
    var Interlaced: js.UndefOr[Interlaced]
    var Container: js.UndefOr[JobContainer]
    var AspectRatio: js.UndefOr[AspectRatio]
    var TimeSpan: js.UndefOr[TimeSpan]
    var DetectedProperties: js.UndefOr[DetectedProperties]
    var InputCaptions: js.UndefOr[InputCaptions]
    var Encryption: js.UndefOr[Encryption]
    var FrameRate: js.UndefOr[FrameRate]
    var Key: js.UndefOr[LongKey]
  }

  object JobInput {
    def apply(
      Resolution: js.UndefOr[Resolution] = js.undefined,
      Interlaced: js.UndefOr[Interlaced] = js.undefined,
      Container: js.UndefOr[JobContainer] = js.undefined,
      AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
      TimeSpan: js.UndefOr[TimeSpan] = js.undefined,
      DetectedProperties: js.UndefOr[DetectedProperties] = js.undefined,
      InputCaptions: js.UndefOr[InputCaptions] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      FrameRate: js.UndefOr[FrameRate] = js.undefined,
      Key: js.UndefOr[LongKey] = js.undefined): JobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resolution" -> Resolution.map { x => x.asInstanceOf[js.Any] },
        "Interlaced" -> Interlaced.map { x => x.asInstanceOf[js.Any] },
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] },
        "AspectRatio" -> AspectRatio.map { x => x.asInstanceOf[js.Any] },
        "TimeSpan" -> TimeSpan.map { x => x.asInstanceOf[js.Any] },
        "DetectedProperties" -> DetectedProperties.map { x => x.asInstanceOf[js.Any] },
        "InputCaptions" -> InputCaptions.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "FrameRate" -> FrameRate.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobInput]
    }
  }

  /**
   * <important> <p>Outputs recommended instead.</p> </important> <p>If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the <code>Output</code> object lists information about the first output. This duplicates the information that is listed for the first output in the <code>Outputs</code> object.</p>
   */
  @js.native
  trait JobOutput extends js.Object {
    var FileSize: js.UndefOr[NullableLong]
    var Id: js.UndefOr[String]
    var StatusDetail: js.UndefOr[Description]
    var Duration: js.UndefOr[NullableLong]
    var Watermarks: js.UndefOr[JobWatermarks]
    var ThumbnailPattern: js.UndefOr[ThumbnailPattern]
    var Width: js.UndefOr[NullableInteger]
    var AlbumArt: js.UndefOr[JobAlbumArt]
    var Composition: js.UndefOr[Composition]
    var AppliedColorSpaceConversion: js.UndefOr[String]
    var DurationMillis: js.UndefOr[NullableLong]
    var Rotate: js.UndefOr[Rotate]
    var SegmentDuration: js.UndefOr[FloatString]
    var ThumbnailEncryption: js.UndefOr[Encryption]
    var Height: js.UndefOr[NullableInteger]
    var Captions: js.UndefOr[Captions]
    var Encryption: js.UndefOr[Encryption]
    var FrameRate: js.UndefOr[FloatString]
    var PresetId: js.UndefOr[Id]
    var Status: js.UndefOr[JobStatus]
    var Key: js.UndefOr[Key]
  }

  object JobOutput {
    def apply(
      FileSize: js.UndefOr[NullableLong] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      StatusDetail: js.UndefOr[Description] = js.undefined,
      Duration: js.UndefOr[NullableLong] = js.undefined,
      Watermarks: js.UndefOr[JobWatermarks] = js.undefined,
      ThumbnailPattern: js.UndefOr[ThumbnailPattern] = js.undefined,
      Width: js.UndefOr[NullableInteger] = js.undefined,
      AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined,
      Composition: js.UndefOr[Composition] = js.undefined,
      AppliedColorSpaceConversion: js.UndefOr[String] = js.undefined,
      DurationMillis: js.UndefOr[NullableLong] = js.undefined,
      Rotate: js.UndefOr[Rotate] = js.undefined,
      SegmentDuration: js.UndefOr[FloatString] = js.undefined,
      ThumbnailEncryption: js.UndefOr[Encryption] = js.undefined,
      Height: js.UndefOr[NullableInteger] = js.undefined,
      Captions: js.UndefOr[Captions] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      FrameRate: js.UndefOr[FloatString] = js.undefined,
      PresetId: js.UndefOr[Id] = js.undefined,
      Status: js.UndefOr[JobStatus] = js.undefined,
      Key: js.UndefOr[Key] = js.undefined): JobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSize" -> FileSize.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "StatusDetail" -> StatusDetail.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Watermarks" -> Watermarks.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailPattern" -> ThumbnailPattern.map { x => x.asInstanceOf[js.Any] },
        "Width" -> Width.map { x => x.asInstanceOf[js.Any] },
        "AlbumArt" -> AlbumArt.map { x => x.asInstanceOf[js.Any] },
        "Composition" -> Composition.map { x => x.asInstanceOf[js.Any] },
        "AppliedColorSpaceConversion" -> AppliedColorSpaceConversion.map { x => x.asInstanceOf[js.Any] },
        "DurationMillis" -> DurationMillis.map { x => x.asInstanceOf[js.Any] },
        "Rotate" -> Rotate.map { x => x.asInstanceOf[js.Any] },
        "SegmentDuration" -> SegmentDuration.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailEncryption" -> ThumbnailEncryption.map { x => x.asInstanceOf[js.Any] },
        "Height" -> Height.map { x => x.asInstanceOf[js.Any] },
        "Captions" -> Captions.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "FrameRate" -> FrameRate.map { x => x.asInstanceOf[js.Any] },
        "PresetId" -> PresetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobOutput]
    }
  }

  /**
   * <p>Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency.</p>
   */
  @js.native
  trait JobWatermark extends js.Object {
    var PresetWatermarkId: js.UndefOr[PresetWatermarkId]
    var InputKey: js.UndefOr[WatermarkKey]
    var Encryption: js.UndefOr[Encryption]
  }

  object JobWatermark {
    def apply(
      PresetWatermarkId: js.UndefOr[PresetWatermarkId] = js.undefined,
      InputKey: js.UndefOr[WatermarkKey] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined): JobWatermark = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PresetWatermarkId" -> PresetWatermarkId.map { x => x.asInstanceOf[js.Any] },
        "InputKey" -> InputKey.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobWatermark]
    }
  }

  /**
   * <p>The <code>ListJobsByPipelineRequest</code> structure.</p>
   */
  @js.native
  trait ListJobsByPipelineRequest extends js.Object {
    var PipelineId: js.UndefOr[Id]
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListJobsByPipelineRequest {
    def apply(
      PipelineId: js.UndefOr[Id] = js.undefined,
      Ascending: js.UndefOr[Ascending] = js.undefined,
      PageToken: js.UndefOr[Id] = js.undefined): ListJobsByPipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PipelineId" -> PipelineId.map { x => x.asInstanceOf[js.Any] },
        "Ascending" -> Ascending.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByPipelineRequest]
    }
  }

  /**
   * <p>The <code>ListJobsByPipelineResponse</code> structure.</p>
   */
  @js.native
  trait ListJobsByPipelineResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextPageToken: js.UndefOr[Id]
  }

  object ListJobsByPipelineResponse {
    def apply(
      Jobs: js.UndefOr[Jobs] = js.undefined,
      NextPageToken: js.UndefOr[Id] = js.undefined): ListJobsByPipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Jobs" -> Jobs.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByPipelineResponse]
    }
  }

  /**
   * <p>The <code>ListJobsByStatusRequest</code> structure.</p>
   */
  @js.native
  trait ListJobsByStatusRequest extends js.Object {
    var Status: js.UndefOr[JobStatus]
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListJobsByStatusRequest {
    def apply(
      Status: js.UndefOr[JobStatus] = js.undefined,
      Ascending: js.UndefOr[Ascending] = js.undefined,
      PageToken: js.UndefOr[Id] = js.undefined): ListJobsByStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Ascending" -> Ascending.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByStatusRequest]
    }
  }

  /**
   * <p> The <code>ListJobsByStatusResponse</code> structure. </p>
   */
  @js.native
  trait ListJobsByStatusResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextPageToken: js.UndefOr[Id]
  }

  object ListJobsByStatusResponse {
    def apply(
      Jobs: js.UndefOr[Jobs] = js.undefined,
      NextPageToken: js.UndefOr[Id] = js.undefined): ListJobsByStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Jobs" -> Jobs.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByStatusResponse]
    }
  }

  /**
   * <p>The <code>ListPipelineRequest</code> structure.</p>
   */
  @js.native
  trait ListPipelinesRequest extends js.Object {
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListPipelinesRequest {
    def apply(
      Ascending: js.UndefOr[Ascending] = js.undefined,
      PageToken: js.UndefOr[Id] = js.undefined): ListPipelinesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ascending" -> Ascending.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesRequest]
    }
  }

  /**
   * <p>A list of the pipelines associated with the current AWS account.</p>
   */
  @js.native
  trait ListPipelinesResponse extends js.Object {
    var Pipelines: js.UndefOr[Pipelines]
    var NextPageToken: js.UndefOr[Id]
  }

  object ListPipelinesResponse {
    def apply(
      Pipelines: js.UndefOr[Pipelines] = js.undefined,
      NextPageToken: js.UndefOr[Id] = js.undefined): ListPipelinesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipelines" -> Pipelines.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesResponse]
    }
  }

  /**
   * <p>The <code>ListPresetsRequest</code> structure.</p>
   */
  @js.native
  trait ListPresetsRequest extends js.Object {
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListPresetsRequest {
    def apply(
      Ascending: js.UndefOr[Ascending] = js.undefined,
      PageToken: js.UndefOr[Id] = js.undefined): ListPresetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ascending" -> Ascending.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPresetsRequest]
    }
  }

  /**
   * <p>The <code>ListPresetsResponse</code> structure.</p>
   */
  @js.native
  trait ListPresetsResponse extends js.Object {
    var Presets: js.UndefOr[Presets]
    var NextPageToken: js.UndefOr[Id]
  }

  object ListPresetsResponse {
    def apply(
      Presets: js.UndefOr[Presets] = js.undefined,
      NextPageToken: js.UndefOr[Id] = js.undefined): ListPresetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Presets" -> Presets.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPresetsResponse]
    }
  }

  /**
   * <p>The Amazon Simple Notification Service (Amazon SNS) topic or topics to notify in order to report job status.</p> <important> <p>To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.</p> </important>
   */
  @js.native
  trait Notifications extends js.Object {
    var Progressing: js.UndefOr[SnsTopic]
    var Completed: js.UndefOr[SnsTopic]
    var Warning: js.UndefOr[SnsTopic]
    var Error: js.UndefOr[SnsTopic]
  }

  object Notifications {
    def apply(
      Progressing: js.UndefOr[SnsTopic] = js.undefined,
      Completed: js.UndefOr[SnsTopic] = js.undefined,
      Warning: js.UndefOr[SnsTopic] = js.undefined,
      Error: js.UndefOr[SnsTopic] = js.undefined): Notifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Progressing" -> Progressing.map { x => x.asInstanceOf[js.Any] },
        "Completed" -> Completed.map { x => x.asInstanceOf[js.Any] },
        "Warning" -> Warning.map { x => x.asInstanceOf[js.Any] },
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Notifications]
    }
  }

  /**
   * <p>The <code>Permission</code> structure.</p>
   */
  @js.native
  trait Permission extends js.Object {
    var GranteeType: js.UndefOr[GranteeType]
    var Grantee: js.UndefOr[Grantee]
    var Access: js.UndefOr[AccessControls]
  }

  object Permission {
    def apply(
      GranteeType: js.UndefOr[GranteeType] = js.undefined,
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Access: js.UndefOr[AccessControls] = js.undefined): Permission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GranteeType" -> GranteeType.map { x => x.asInstanceOf[js.Any] },
        "Grantee" -> Grantee.map { x => x.asInstanceOf[js.Any] },
        "Access" -> Access.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Permission]
    }
  }

  /**
   * <p>The pipeline (queue) that is used to manage jobs.</p>
   */
  @js.native
  trait Pipeline extends js.Object {
    var Id: js.UndefOr[Id]
    var Role: js.UndefOr[Role]
    var Name: js.UndefOr[Name]
    var ThumbnailConfig: js.UndefOr[PipelineOutputConfig]
    var OutputBucket: js.UndefOr[BucketName]
    var Arn: js.UndefOr[String]
    var InputBucket: js.UndefOr[BucketName]
    var AwsKmsKeyArn: js.UndefOr[KeyArn]
    var Notifications: js.UndefOr[Notifications]
    var ContentConfig: js.UndefOr[PipelineOutputConfig]
    var Status: js.UndefOr[PipelineStatus]
  }

  object Pipeline {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
      OutputBucket: js.UndefOr[BucketName] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      InputBucket: js.UndefOr[BucketName] = js.undefined,
      AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
      Notifications: js.UndefOr[Notifications] = js.undefined,
      ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
      Status: js.UndefOr[PipelineStatus] = js.undefined): Pipeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailConfig" -> ThumbnailConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputBucket" -> OutputBucket.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "InputBucket" -> InputBucket.map { x => x.asInstanceOf[js.Any] },
        "AwsKmsKeyArn" -> AwsKmsKeyArn.map { x => x.asInstanceOf[js.Any] },
        "Notifications" -> Notifications.map { x => x.asInstanceOf[js.Any] },
        "ContentConfig" -> ContentConfig.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Pipeline]
    }
  }

  /**
   * <p>The <code>PipelineOutputConfig</code> structure.</p>
   */
  @js.native
  trait PipelineOutputConfig extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var StorageClass: js.UndefOr[StorageClass]
    var Permissions: js.UndefOr[Permissions]
  }

  object PipelineOutputConfig {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Permissions: js.UndefOr[Permissions] = js.undefined): PipelineOutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Permissions" -> Permissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineOutputConfig]
    }
  }

  /**
   * <p>The PlayReady DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.</p> <p>PlayReady DRM encrypts your media files using <code>aes-ctr</code> encryption.</p> <p>If you use DRM for an <code>HLSv3</code> playlist, your outputs must have a master playlist.</p>
   */
  @js.native
  trait PlayReadyDrm extends js.Object {
    var Format: js.UndefOr[PlayReadyDrmFormatString]
    var KeyMd5: js.UndefOr[NonEmptyBase64EncodedString]
    var LicenseAcquisitionUrl: js.UndefOr[OneTo512String]
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var KeyId: js.UndefOr[KeyIdGuid]
    var Key: js.UndefOr[NonEmptyBase64EncodedString]
  }

  object PlayReadyDrm {
    def apply(
      Format: js.UndefOr[PlayReadyDrmFormatString] = js.undefined,
      KeyMd5: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined,
      LicenseAcquisitionUrl: js.UndefOr[OneTo512String] = js.undefined,
      InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
      KeyId: js.UndefOr[KeyIdGuid] = js.undefined,
      Key: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined): PlayReadyDrm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "KeyMd5" -> KeyMd5.map { x => x.asInstanceOf[js.Any] },
        "LicenseAcquisitionUrl" -> LicenseAcquisitionUrl.map { x => x.asInstanceOf[js.Any] },
        "InitializationVector" -> InitializationVector.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayReadyDrm]
    }
  }

  /**
   * <p> Use Only for Fragmented MP4 or MPEG-TS Outputs. If you specify a preset for which the value of Container is <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. We recommend that you create only one master playlist per output format. The maximum number of master playlists in a job is 30. </p>
   */
  @js.native
  trait Playlist extends js.Object {
    var Format: js.UndefOr[PlaylistFormat]
    var Name: js.UndefOr[Filename]
    var StatusDetail: js.UndefOr[Description]
    var HlsContentProtection: js.UndefOr[HlsContentProtection]
    var PlayReadyDrm: js.UndefOr[PlayReadyDrm]
    var OutputKeys: js.UndefOr[OutputKeys]
    var Status: js.UndefOr[JobStatus]
  }

  object Playlist {
    def apply(
      Format: js.UndefOr[PlaylistFormat] = js.undefined,
      Name: js.UndefOr[Filename] = js.undefined,
      StatusDetail: js.UndefOr[Description] = js.undefined,
      HlsContentProtection: js.UndefOr[HlsContentProtection] = js.undefined,
      PlayReadyDrm: js.UndefOr[PlayReadyDrm] = js.undefined,
      OutputKeys: js.UndefOr[OutputKeys] = js.undefined,
      Status: js.UndefOr[JobStatus] = js.undefined): Playlist = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "StatusDetail" -> StatusDetail.map { x => x.asInstanceOf[js.Any] },
        "HlsContentProtection" -> HlsContentProtection.map { x => x.asInstanceOf[js.Any] },
        "PlayReadyDrm" -> PlayReadyDrm.map { x => x.asInstanceOf[js.Any] },
        "OutputKeys" -> OutputKeys.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Playlist]
    }
  }

  /**
   * <p>Presets are templates that contain most of the settings for transcoding media files from one format to another. Elastic Transcoder includes some default presets for common formats, for example, several iPod and iPhone versions. You can also create your own presets for formats that aren't included among the default presets. You specify which preset you want to use when you create a job.</p>
   */
  @js.native
  trait Preset extends js.Object {
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var Description: js.UndefOr[Description]
    var Thumbnails: js.UndefOr[Thumbnails]
    var Container: js.UndefOr[PresetContainer]
    var Arn: js.UndefOr[String]
    var Audio: js.UndefOr[AudioParameters]
    var Video: js.UndefOr[VideoParameters]
    var Type: js.UndefOr[PresetType]
  }

  object Preset {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Thumbnails: js.UndefOr[Thumbnails] = js.undefined,
      Container: js.UndefOr[PresetContainer] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      Audio: js.UndefOr[AudioParameters] = js.undefined,
      Video: js.UndefOr[VideoParameters] = js.undefined,
      Type: js.UndefOr[PresetType] = js.undefined): Preset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Thumbnails" -> Thumbnails.map { x => x.asInstanceOf[js.Any] },
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Audio" -> Audio.map { x => x.asInstanceOf[js.Any] },
        "Video" -> Video.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Preset]
    }
  }

  /**
   * <p>Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in the specified size and location, and with the specified opacity for the duration of the transcoded video.</p> <p>Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency.</p> <p>When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have different dimensions.</p>
   */
  @js.native
  trait PresetWatermark extends js.Object {
    var Id: js.UndefOr[PresetWatermarkId]
    var HorizontalAlign: js.UndefOr[HorizontalAlign]
    var Target: js.UndefOr[Target]
    var SizingPolicy: js.UndefOr[WatermarkSizingPolicy]
    var MaxHeight: js.UndefOr[PixelsOrPercent]
    var VerticalOffset: js.UndefOr[PixelsOrPercent]
    var HorizontalOffset: js.UndefOr[PixelsOrPercent]
    var Opacity: js.UndefOr[Opacity]
    var MaxWidth: js.UndefOr[PixelsOrPercent]
    var VerticalAlign: js.UndefOr[VerticalAlign]
  }

  object PresetWatermark {
    def apply(
      Id: js.UndefOr[PresetWatermarkId] = js.undefined,
      HorizontalAlign: js.UndefOr[HorizontalAlign] = js.undefined,
      Target: js.UndefOr[Target] = js.undefined,
      SizingPolicy: js.UndefOr[WatermarkSizingPolicy] = js.undefined,
      MaxHeight: js.UndefOr[PixelsOrPercent] = js.undefined,
      VerticalOffset: js.UndefOr[PixelsOrPercent] = js.undefined,
      HorizontalOffset: js.UndefOr[PixelsOrPercent] = js.undefined,
      Opacity: js.UndefOr[Opacity] = js.undefined,
      MaxWidth: js.UndefOr[PixelsOrPercent] = js.undefined,
      VerticalAlign: js.UndefOr[VerticalAlign] = js.undefined): PresetWatermark = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "HorizontalAlign" -> HorizontalAlign.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "SizingPolicy" -> SizingPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaxHeight" -> MaxHeight.map { x => x.asInstanceOf[js.Any] },
        "VerticalOffset" -> VerticalOffset.map { x => x.asInstanceOf[js.Any] },
        "HorizontalOffset" -> HorizontalOffset.map { x => x.asInstanceOf[js.Any] },
        "Opacity" -> Opacity.map { x => x.asInstanceOf[js.Any] },
        "MaxWidth" -> MaxWidth.map { x => x.asInstanceOf[js.Any] },
        "VerticalAlign" -> VerticalAlign.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PresetWatermark]
    }
  }

  /**
   * <p>The <code>ReadJobRequest</code> structure.</p>
   */
  @js.native
  trait ReadJobRequest extends js.Object {
    var Id: js.UndefOr[Id]
  }

  object ReadJobRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined): ReadJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadJobRequest]
    }
  }

  /**
   * <p>The <code>ReadJobResponse</code> structure.</p>
   */
  @js.native
  trait ReadJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object ReadJobResponse {
    def apply(
      Job: js.UndefOr[Job] = js.undefined): ReadJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Job" -> Job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadJobResponse]
    }
  }

  /**
   * <p>The <code>ReadPipelineRequest</code> structure.</p>
   */
  @js.native
  trait ReadPipelineRequest extends js.Object {
    var Id: js.UndefOr[Id]
  }

  object ReadPipelineRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined): ReadPipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPipelineRequest]
    }
  }

  /**
   * <p>The <code>ReadPipelineResponse</code> structure.</p>
   */
  @js.native
  trait ReadPipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  object ReadPipelineResponse {
    def apply(
      Pipeline: js.UndefOr[Pipeline] = js.undefined,
      Warnings: js.UndefOr[Warnings] = js.undefined): ReadPipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipeline" -> Pipeline.map { x => x.asInstanceOf[js.Any] },
        "Warnings" -> Warnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPipelineResponse]
    }
  }

  /**
   * <p>The <code>ReadPresetRequest</code> structure.</p>
   */
  @js.native
  trait ReadPresetRequest extends js.Object {
    var Id: js.UndefOr[Id]
  }

  object ReadPresetRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined): ReadPresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPresetRequest]
    }
  }

  /**
   * <p>The <code>ReadPresetResponse</code> structure.</p>
   */
  @js.native
  trait ReadPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object ReadPresetResponse {
    def apply(
      Preset: js.UndefOr[Preset] = js.undefined): ReadPresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Preset" -> Preset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPresetResponse]
    }
  }

  /**
   * <p> The <code>TestRoleRequest</code> structure. </p>
   */
  @deprecated
  @js.native
  trait TestRoleRequest extends js.Object {
    var Role: js.UndefOr[Role]
    var InputBucket: js.UndefOr[BucketName]
    var OutputBucket: js.UndefOr[BucketName]
    var Topics: js.UndefOr[SnsTopics]
  }

  object TestRoleRequest {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      InputBucket: js.UndefOr[BucketName] = js.undefined,
      OutputBucket: js.UndefOr[BucketName] = js.undefined,
      Topics: js.UndefOr[SnsTopics] = js.undefined): TestRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "InputBucket" -> InputBucket.map { x => x.asInstanceOf[js.Any] },
        "OutputBucket" -> OutputBucket.map { x => x.asInstanceOf[js.Any] },
        "Topics" -> Topics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRoleRequest]
    }
  }

  /**
   * <p>The <code>TestRoleResponse</code> structure.</p>
   */
  @deprecated
  @js.native
  trait TestRoleResponse extends js.Object {
    var Success: js.UndefOr[Success]
    var Messages: js.UndefOr[ExceptionMessages]
  }

  object TestRoleResponse {
    def apply(
      Success: js.UndefOr[Success] = js.undefined,
      Messages: js.UndefOr[ExceptionMessages] = js.undefined): TestRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Success" -> Success.map { x => x.asInstanceOf[js.Any] },
        "Messages" -> Messages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRoleResponse]
    }
  }

  /**
   * <p>Thumbnails for videos.</p>
   */
  @js.native
  trait Thumbnails extends js.Object {
    var Format: js.UndefOr[JpgOrPng]
    var Resolution: js.UndefOr[ThumbnailResolution]
    var SizingPolicy: js.UndefOr[SizingPolicy]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var Interval: js.UndefOr[Digits]
    var AspectRatio: js.UndefOr[AspectRatio]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
  }

  object Thumbnails {
    def apply(
      Format: js.UndefOr[JpgOrPng] = js.undefined,
      Resolution: js.UndefOr[ThumbnailResolution] = js.undefined,
      SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined,
      MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
      PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
      Interval: js.UndefOr[Digits] = js.undefined,
      AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
      MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined): Thumbnails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Resolution" -> Resolution.map { x => x.asInstanceOf[js.Any] },
        "SizingPolicy" -> SizingPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaxHeight" -> MaxHeight.map { x => x.asInstanceOf[js.Any] },
        "PaddingPolicy" -> PaddingPolicy.map { x => x.asInstanceOf[js.Any] },
        "Interval" -> Interval.map { x => x.asInstanceOf[js.Any] },
        "AspectRatio" -> AspectRatio.map { x => x.asInstanceOf[js.Any] },
        "MaxWidth" -> MaxWidth.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Thumbnails]
    }
  }

  /**
   * <p>Settings that determine when a clip begins and how long it lasts.</p>
   */
  @js.native
  trait TimeSpan extends js.Object {
    var StartTime: js.UndefOr[Time]
    var Duration: js.UndefOr[Time]
  }

  object TimeSpan {
    def apply(
      StartTime: js.UndefOr[Time] = js.undefined,
      Duration: js.UndefOr[Time] = js.undefined): TimeSpan = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeSpan]
    }
  }

  /**
   * <p>Details about the timing of a job.</p>
   */
  @js.native
  trait Timing extends js.Object {
    var SubmitTimeMillis: js.UndefOr[NullableLong]
    var StartTimeMillis: js.UndefOr[NullableLong]
    var FinishTimeMillis: js.UndefOr[NullableLong]
  }

  object Timing {
    def apply(
      SubmitTimeMillis: js.UndefOr[NullableLong] = js.undefined,
      StartTimeMillis: js.UndefOr[NullableLong] = js.undefined,
      FinishTimeMillis: js.UndefOr[NullableLong] = js.undefined): Timing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTimeMillis" -> SubmitTimeMillis.map { x => x.asInstanceOf[js.Any] },
        "StartTimeMillis" -> StartTimeMillis.map { x => x.asInstanceOf[js.Any] },
        "FinishTimeMillis" -> FinishTimeMillis.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Timing]
    }
  }

  /**
   * <p>The <code>UpdatePipelineNotificationsRequest</code> structure.</p>
   */
  @js.native
  trait UpdatePipelineNotificationsRequest extends js.Object {
    var Id: js.UndefOr[Id]
    var Notifications: js.UndefOr[Notifications]
  }

  object UpdatePipelineNotificationsRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      Notifications: js.UndefOr[Notifications] = js.undefined): UpdatePipelineNotificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Notifications" -> Notifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineNotificationsRequest]
    }
  }

  /**
   * <p>The <code>UpdatePipelineNotificationsResponse</code> structure.</p>
   */
  @js.native
  trait UpdatePipelineNotificationsResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
  }

  object UpdatePipelineNotificationsResponse {
    def apply(
      Pipeline: js.UndefOr[Pipeline] = js.undefined): UpdatePipelineNotificationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipeline" -> Pipeline.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineNotificationsResponse]
    }
  }

  /**
   * <p>The <code>UpdatePipelineRequest</code> structure.</p>
   */
  @js.native
  trait UpdatePipelineRequest extends js.Object {
    var Id: js.UndefOr[Id]
    var Role: js.UndefOr[Role]
    var Name: js.UndefOr[Name]
    var ThumbnailConfig: js.UndefOr[PipelineOutputConfig]
    var InputBucket: js.UndefOr[BucketName]
    var AwsKmsKeyArn: js.UndefOr[KeyArn]
    var Notifications: js.UndefOr[Notifications]
    var ContentConfig: js.UndefOr[PipelineOutputConfig]
  }

  object UpdatePipelineRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
      InputBucket: js.UndefOr[BucketName] = js.undefined,
      AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
      Notifications: js.UndefOr[Notifications] = js.undefined,
      ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined): UpdatePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ThumbnailConfig" -> ThumbnailConfig.map { x => x.asInstanceOf[js.Any] },
        "InputBucket" -> InputBucket.map { x => x.asInstanceOf[js.Any] },
        "AwsKmsKeyArn" -> AwsKmsKeyArn.map { x => x.asInstanceOf[js.Any] },
        "Notifications" -> Notifications.map { x => x.asInstanceOf[js.Any] },
        "ContentConfig" -> ContentConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineRequest]
    }
  }

  /**
   * <p>When you update a pipeline, Elastic Transcoder returns the values that you specified in the request.</p>
   */
  @js.native
  trait UpdatePipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  object UpdatePipelineResponse {
    def apply(
      Pipeline: js.UndefOr[Pipeline] = js.undefined,
      Warnings: js.UndefOr[Warnings] = js.undefined): UpdatePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipeline" -> Pipeline.map { x => x.asInstanceOf[js.Any] },
        "Warnings" -> Warnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineResponse]
    }
  }

  /**
   * <p>The <code>UpdatePipelineStatusRequest</code> structure.</p>
   */
  @js.native
  trait UpdatePipelineStatusRequest extends js.Object {
    var Id: js.UndefOr[Id]
    var Status: js.UndefOr[PipelineStatus]
  }

  object UpdatePipelineStatusRequest {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      Status: js.UndefOr[PipelineStatus] = js.undefined): UpdatePipelineStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineStatusRequest]
    }
  }

  /**
   * <p>When you update status for a pipeline, Elastic Transcoder returns the values that you specified in the request.</p>
   */
  @js.native
  trait UpdatePipelineStatusResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
  }

  object UpdatePipelineStatusResponse {
    def apply(
      Pipeline: js.UndefOr[Pipeline] = js.undefined): UpdatePipelineStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipeline" -> Pipeline.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineStatusResponse]
    }
  }

  /**
   * <p>The <code>VideoParameters</code> structure.</p>
   */
  @js.native
  trait VideoParameters extends js.Object {
    var BitRate: js.UndefOr[VideoBitRate]
    var Resolution: js.UndefOr[Resolution]
    var SizingPolicy: js.UndefOr[SizingPolicy]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var DisplayAspectRatio: js.UndefOr[AspectRatio]
    var Watermarks: js.UndefOr[PresetWatermarks]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var CodecOptions: js.UndefOr[CodecOptions]
    var AspectRatio: js.UndefOr[AspectRatio]
    var KeyframesMaxDist: js.UndefOr[KeyframesMaxDist]
    var FixedGOP: js.UndefOr[FixedGOP]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
    var MaxFrameRate: js.UndefOr[MaxFrameRate]
    var Codec: js.UndefOr[VideoCodec]
    var FrameRate: js.UndefOr[FrameRate]
  }

  object VideoParameters {
    def apply(
      BitRate: js.UndefOr[VideoBitRate] = js.undefined,
      Resolution: js.UndefOr[Resolution] = js.undefined,
      SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined,
      MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
      DisplayAspectRatio: js.UndefOr[AspectRatio] = js.undefined,
      Watermarks: js.UndefOr[PresetWatermarks] = js.undefined,
      PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
      CodecOptions: js.UndefOr[CodecOptions] = js.undefined,
      AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
      KeyframesMaxDist: js.UndefOr[KeyframesMaxDist] = js.undefined,
      FixedGOP: js.UndefOr[FixedGOP] = js.undefined,
      MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
      MaxFrameRate: js.UndefOr[MaxFrameRate] = js.undefined,
      Codec: js.UndefOr[VideoCodec] = js.undefined,
      FrameRate: js.UndefOr[FrameRate] = js.undefined): VideoParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BitRate" -> BitRate.map { x => x.asInstanceOf[js.Any] },
        "Resolution" -> Resolution.map { x => x.asInstanceOf[js.Any] },
        "SizingPolicy" -> SizingPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaxHeight" -> MaxHeight.map { x => x.asInstanceOf[js.Any] },
        "DisplayAspectRatio" -> DisplayAspectRatio.map { x => x.asInstanceOf[js.Any] },
        "Watermarks" -> Watermarks.map { x => x.asInstanceOf[js.Any] },
        "PaddingPolicy" -> PaddingPolicy.map { x => x.asInstanceOf[js.Any] },
        "CodecOptions" -> CodecOptions.map { x => x.asInstanceOf[js.Any] },
        "AspectRatio" -> AspectRatio.map { x => x.asInstanceOf[js.Any] },
        "KeyframesMaxDist" -> KeyframesMaxDist.map { x => x.asInstanceOf[js.Any] },
        "FixedGOP" -> FixedGOP.map { x => x.asInstanceOf[js.Any] },
        "MaxWidth" -> MaxWidth.map { x => x.asInstanceOf[js.Any] },
        "MaxFrameRate" -> MaxFrameRate.map { x => x.asInstanceOf[js.Any] },
        "Codec" -> Codec.map { x => x.asInstanceOf[js.Any] },
        "FrameRate" -> FrameRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoParameters]
    }
  }

  /**
   * <p>Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline.</p> <p>Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.</p>
   */
  @js.native
  trait Warning extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object Warning {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): Warning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Warning]
    }
  }
}
