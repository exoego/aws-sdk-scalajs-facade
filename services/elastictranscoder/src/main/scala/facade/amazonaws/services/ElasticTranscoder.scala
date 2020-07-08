package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
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
  @deprecated("Deprecated in AWS SDK", "forever")
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

  implicit final class ElasticTranscoderOps(private val service: ElasticTranscoder) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise().toFuture
    @inline def createPipelineFuture(params: CreatePipelineRequest): Future[CreatePipelineResponse] =
      service.createPipeline(params).promise().toFuture
    @inline def createPresetFuture(params: CreatePresetRequest): Future[CreatePresetResponse] =
      service.createPreset(params).promise().toFuture
    @inline def deletePipelineFuture(params: DeletePipelineRequest): Future[DeletePipelineResponse] =
      service.deletePipeline(params).promise().toFuture
    @inline def deletePresetFuture(params: DeletePresetRequest): Future[DeletePresetResponse] =
      service.deletePreset(params).promise().toFuture
    @inline def listJobsByPipelineFuture(params: ListJobsByPipelineRequest): Future[ListJobsByPipelineResponse] =
      service.listJobsByPipeline(params).promise().toFuture
    @inline def listJobsByStatusFuture(params: ListJobsByStatusRequest): Future[ListJobsByStatusResponse] =
      service.listJobsByStatus(params).promise().toFuture
    @inline def listPipelinesFuture(params: ListPipelinesRequest): Future[ListPipelinesResponse] =
      service.listPipelines(params).promise().toFuture
    @inline def listPresetsFuture(params: ListPresetsRequest): Future[ListPresetsResponse] =
      service.listPresets(params).promise().toFuture
    @inline def readJobFuture(params: ReadJobRequest): Future[ReadJobResponse] =
      service.readJob(params).promise().toFuture
    @inline def readPipelineFuture(params: ReadPipelineRequest): Future[ReadPipelineResponse] =
      service.readPipeline(params).promise().toFuture
    @inline def readPresetFuture(params: ReadPresetRequest): Future[ReadPresetResponse] =
      service.readPreset(params).promise().toFuture
    @inline def updatePipelineFuture(params: UpdatePipelineRequest): Future[UpdatePipelineResponse] =
      service.updatePipeline(params).promise().toFuture
    @inline def updatePipelineNotificationsFuture(
        params: UpdatePipelineNotificationsRequest
    ): Future[UpdatePipelineNotificationsResponse] = service.updatePipelineNotifications(params).promise().toFuture
    @inline def updatePipelineStatusFuture(params: UpdatePipelineStatusRequest): Future[UpdatePipelineStatusResponse] =
      service.updatePipelineStatus(params).promise().toFuture
  }
}

package elastictranscoder {
  @js.native
  @JSImport("aws-sdk", "ElasticTranscoder")
  class ElasticTranscoder() extends js.Object {
    def this(config: AWSConfig) = this()

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
    def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse] = js.native
    def updatePipelineNotifications(
        params: UpdatePipelineNotificationsRequest
    ): Request[UpdatePipelineNotificationsResponse] = js.native
    def updatePipelineStatus(params: UpdatePipelineStatusRequest): Request[UpdatePipelineStatusResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def testRole(params: TestRoleRequest): Request[TestRoleResponse] =
      js.native
  }

  /**
    * The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20.
    *  To remove artwork or leave the artwork empty, you can either set <code>Artwork</code> to null, or set the <code>Merge Policy</code> to "Replace" and use an empty <code>Artwork</code> array.
    *  To pass through existing artwork unchanged, set the <code>Merge Policy</code> to "Prepend", "Append", or "Fallback", and use an empty <code>Artwork</code> array.
    */
  @js.native
  trait Artwork extends js.Object {
    var AlbumArtFormat: js.UndefOr[JpgOrPng]
    var Encryption: js.UndefOr[Encryption]
    var InputKey: js.UndefOr[WatermarkKey]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var SizingPolicy: js.UndefOr[SizingPolicy]
  }

  object Artwork {
    @inline
    def apply(
        AlbumArtFormat: js.UndefOr[JpgOrPng] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        InputKey: js.UndefOr[WatermarkKey] = js.undefined,
        MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
        MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
        PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
        SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined
    ): Artwork = {
      val __obj = js.Dynamic.literal()
      AlbumArtFormat.foreach(__v => __obj.updateDynamic("AlbumArtFormat")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      InputKey.foreach(__v => __obj.updateDynamic("InputKey")(__v.asInstanceOf[js.Any]))
      MaxHeight.foreach(__v => __obj.updateDynamic("MaxHeight")(__v.asInstanceOf[js.Any]))
      MaxWidth.foreach(__v => __obj.updateDynamic("MaxWidth")(__v.asInstanceOf[js.Any]))
      PaddingPolicy.foreach(__v => __obj.updateDynamic("PaddingPolicy")(__v.asInstanceOf[js.Any]))
      SizingPolicy.foreach(__v => __obj.updateDynamic("SizingPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Artwork]
    }
  }

  /**
    * Options associated with your audio codec.
    */
  @js.native
  trait AudioCodecOptions extends js.Object {
    var BitDepth: js.UndefOr[AudioBitDepth]
    var BitOrder: js.UndefOr[AudioBitOrder]
    var Profile: js.UndefOr[AudioCodecProfile]
    var Signed: js.UndefOr[AudioSigned]
  }

  object AudioCodecOptions {
    @inline
    def apply(
        BitDepth: js.UndefOr[AudioBitDepth] = js.undefined,
        BitOrder: js.UndefOr[AudioBitOrder] = js.undefined,
        Profile: js.UndefOr[AudioCodecProfile] = js.undefined,
        Signed: js.UndefOr[AudioSigned] = js.undefined
    ): AudioCodecOptions = {
      val __obj = js.Dynamic.literal()
      BitDepth.foreach(__v => __obj.updateDynamic("BitDepth")(__v.asInstanceOf[js.Any]))
      BitOrder.foreach(__v => __obj.updateDynamic("BitOrder")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      Signed.foreach(__v => __obj.updateDynamic("Signed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioCodecOptions]
    }
  }

  /**
    * Parameters required for transcoding audio.
    */
  @js.native
  trait AudioParameters extends js.Object {
    var AudioPackingMode: js.UndefOr[AudioPackingMode]
    var BitRate: js.UndefOr[AudioBitRate]
    var Channels: js.UndefOr[AudioChannels]
    var Codec: js.UndefOr[AudioCodec]
    var CodecOptions: js.UndefOr[AudioCodecOptions]
    var SampleRate: js.UndefOr[AudioSampleRate]
  }

  object AudioParameters {
    @inline
    def apply(
        AudioPackingMode: js.UndefOr[AudioPackingMode] = js.undefined,
        BitRate: js.UndefOr[AudioBitRate] = js.undefined,
        Channels: js.UndefOr[AudioChannels] = js.undefined,
        Codec: js.UndefOr[AudioCodec] = js.undefined,
        CodecOptions: js.UndefOr[AudioCodecOptions] = js.undefined,
        SampleRate: js.UndefOr[AudioSampleRate] = js.undefined
    ): AudioParameters = {
      val __obj = js.Dynamic.literal()
      AudioPackingMode.foreach(__v => __obj.updateDynamic("AudioPackingMode")(__v.asInstanceOf[js.Any]))
      BitRate.foreach(__v => __obj.updateDynamic("BitRate")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      CodecOptions.foreach(__v => __obj.updateDynamic("CodecOptions")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioParameters]
    }
  }

  /**
    * The <code>CancelJobRequest</code> structure.
    */
  @js.native
  trait CancelJobRequest extends js.Object {
    var Id: Id
  }

  object CancelJobRequest {
    @inline
    def apply(
        Id: Id
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  /**
    * The response body contains a JSON object. If the job is successfully canceled, the value of <code>Success</code> is <code>true</code>.
    */
  @js.native
  trait CancelJobResponse extends js.Object {}

  object CancelJobResponse {
    @inline
    def apply(
    ): CancelJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  /**
    * The file format of the output captions. If you leave this value blank, Elastic Transcoder returns an error.
    */
  @js.native
  trait CaptionFormat extends js.Object {
    var Encryption: js.UndefOr[Encryption]
    var Format: js.UndefOr[CaptionFormatFormat]
    var Pattern: js.UndefOr[CaptionFormatPattern]
  }

  object CaptionFormat {
    @inline
    def apply(
        Encryption: js.UndefOr[Encryption] = js.undefined,
        Format: js.UndefOr[CaptionFormatFormat] = js.undefined,
        Pattern: js.UndefOr[CaptionFormatPattern] = js.undefined
    ): CaptionFormat = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Pattern.foreach(__v => __obj.updateDynamic("Pattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionFormat]
    }
  }

  /**
    * A source file for the input sidecar captions used during the transcoding process.
    */
  @js.native
  trait CaptionSource extends js.Object {
    var Encryption: js.UndefOr[Encryption]
    var Key: js.UndefOr[LongKey]
    var Label: js.UndefOr[Name]
    var Language: js.UndefOr[Key]
    var TimeOffset: js.UndefOr[TimeOffset]
  }

  object CaptionSource {
    @inline
    def apply(
        Encryption: js.UndefOr[Encryption] = js.undefined,
        Key: js.UndefOr[LongKey] = js.undefined,
        Label: js.UndefOr[Name] = js.undefined,
        Language: js.UndefOr[Key] = js.undefined,
        TimeOffset: js.UndefOr[TimeOffset] = js.undefined
    ): CaptionSource = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      TimeOffset.foreach(__v => __obj.updateDynamic("TimeOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSource]
    }
  }

  /**
    * The captions to be created, if any.
    */
  @js.native
  trait Captions extends js.Object {
    var CaptionFormats: js.UndefOr[CaptionFormats]
    var CaptionSources: js.UndefOr[CaptionSources]
    var MergePolicy: js.UndefOr[CaptionMergePolicy]
  }

  object Captions {
    @inline
    def apply(
        CaptionFormats: js.UndefOr[CaptionFormats] = js.undefined,
        CaptionSources: js.UndefOr[CaptionSources] = js.undefined,
        MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined
    ): Captions = {
      val __obj = js.Dynamic.literal()
      CaptionFormats.foreach(__v => __obj.updateDynamic("CaptionFormats")(__v.asInstanceOf[js.Any]))
      CaptionSources.foreach(__v => __obj.updateDynamic("CaptionSources")(__v.asInstanceOf[js.Any]))
      MergePolicy.foreach(__v => __obj.updateDynamic("MergePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Captions]
    }
  }

  /**
    * Settings for one clip in a composition. All jobs in a playlist must have the same clip settings.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait Clip extends js.Object {
    var TimeSpan: js.UndefOr[TimeSpan]
  }

  object Clip {
    @inline
    def apply(
        TimeSpan: js.UndefOr[TimeSpan] = js.undefined
    ): Clip = {
      val __obj = js.Dynamic.literal()
      TimeSpan.foreach(__v => __obj.updateDynamic("TimeSpan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Clip]
    }
  }

  /**
    * The <code>CreateJobOutput</code> structure.
    */
  @js.native
  trait CreateJobOutput extends js.Object {
    var AlbumArt: js.UndefOr[JobAlbumArt]
    var Captions: js.UndefOr[Captions]
    var Composition: js.UndefOr[Composition]
    var Encryption: js.UndefOr[Encryption]
    var Key: js.UndefOr[Key]
    var PresetId: js.UndefOr[Id]
    var Rotate: js.UndefOr[Rotate]
    var SegmentDuration: js.UndefOr[FloatString]
    var ThumbnailEncryption: js.UndefOr[Encryption]
    var ThumbnailPattern: js.UndefOr[ThumbnailPattern]
    var Watermarks: js.UndefOr[JobWatermarks]
  }

  object CreateJobOutput {
    @inline
    def apply(
        AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined,
        Captions: js.UndefOr[Captions] = js.undefined,
        Composition: js.UndefOr[Composition] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        Key: js.UndefOr[Key] = js.undefined,
        PresetId: js.UndefOr[Id] = js.undefined,
        Rotate: js.UndefOr[Rotate] = js.undefined,
        SegmentDuration: js.UndefOr[FloatString] = js.undefined,
        ThumbnailEncryption: js.UndefOr[Encryption] = js.undefined,
        ThumbnailPattern: js.UndefOr[ThumbnailPattern] = js.undefined,
        Watermarks: js.UndefOr[JobWatermarks] = js.undefined
    ): CreateJobOutput = {
      val __obj = js.Dynamic.literal()
      AlbumArt.foreach(__v => __obj.updateDynamic("AlbumArt")(__v.asInstanceOf[js.Any]))
      Captions.foreach(__v => __obj.updateDynamic("Captions")(__v.asInstanceOf[js.Any]))
      Composition.foreach(__v => __obj.updateDynamic("Composition")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      PresetId.foreach(__v => __obj.updateDynamic("PresetId")(__v.asInstanceOf[js.Any]))
      Rotate.foreach(__v => __obj.updateDynamic("Rotate")(__v.asInstanceOf[js.Any]))
      SegmentDuration.foreach(__v => __obj.updateDynamic("SegmentDuration")(__v.asInstanceOf[js.Any]))
      ThumbnailEncryption.foreach(__v => __obj.updateDynamic("ThumbnailEncryption")(__v.asInstanceOf[js.Any]))
      ThumbnailPattern.foreach(__v => __obj.updateDynamic("ThumbnailPattern")(__v.asInstanceOf[js.Any]))
      Watermarks.foreach(__v => __obj.updateDynamic("Watermarks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobOutput]
    }
  }

  /**
    * Information about the master playlist.
    */
  @js.native
  trait CreateJobPlaylist extends js.Object {
    var Format: js.UndefOr[PlaylistFormat]
    var HlsContentProtection: js.UndefOr[HlsContentProtection]
    var Name: js.UndefOr[Filename]
    var OutputKeys: js.UndefOr[OutputKeys]
    var PlayReadyDrm: js.UndefOr[PlayReadyDrm]
  }

  object CreateJobPlaylist {
    @inline
    def apply(
        Format: js.UndefOr[PlaylistFormat] = js.undefined,
        HlsContentProtection: js.UndefOr[HlsContentProtection] = js.undefined,
        Name: js.UndefOr[Filename] = js.undefined,
        OutputKeys: js.UndefOr[OutputKeys] = js.undefined,
        PlayReadyDrm: js.UndefOr[PlayReadyDrm] = js.undefined
    ): CreateJobPlaylist = {
      val __obj = js.Dynamic.literal()
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      HlsContentProtection.foreach(__v => __obj.updateDynamic("HlsContentProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputKeys.foreach(__v => __obj.updateDynamic("OutputKeys")(__v.asInstanceOf[js.Any]))
      PlayReadyDrm.foreach(__v => __obj.updateDynamic("PlayReadyDrm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobPlaylist]
    }
  }

  /**
    * The <code>CreateJobRequest</code> structure.
    */
  @js.native
  trait CreateJobRequest extends js.Object {
    var PipelineId: Id
    var Input: js.UndefOr[JobInput]
    var Inputs: js.UndefOr[JobInputs]
    var Output: js.UndefOr[CreateJobOutput]
    var OutputKeyPrefix: js.UndefOr[Key]
    var Outputs: js.UndefOr[CreateJobOutputs]
    var Playlists: js.UndefOr[CreateJobPlaylists]
    var UserMetadata: js.UndefOr[UserMetadata]
  }

  object CreateJobRequest {
    @inline
    def apply(
        PipelineId: Id,
        Input: js.UndefOr[JobInput] = js.undefined,
        Inputs: js.UndefOr[JobInputs] = js.undefined,
        Output: js.UndefOr[CreateJobOutput] = js.undefined,
        OutputKeyPrefix: js.UndefOr[Key] = js.undefined,
        Outputs: js.UndefOr[CreateJobOutputs] = js.undefined,
        Playlists: js.UndefOr[CreateJobPlaylists] = js.undefined,
        UserMetadata: js.UndefOr[UserMetadata] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineId" -> PipelineId.asInstanceOf[js.Any]
      )

      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      OutputKeyPrefix.foreach(__v => __obj.updateDynamic("OutputKeyPrefix")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      Playlists.foreach(__v => __obj.updateDynamic("Playlists")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  /**
    * The CreateJobResponse structure.
    */
  @js.native
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object CreateJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  /**
    * The <code>CreatePipelineRequest</code> structure.
    */
  @js.native
  trait CreatePipelineRequest extends js.Object {
    var InputBucket: BucketName
    var Name: Name
    var Role: Role
    var AwsKmsKeyArn: js.UndefOr[KeyArn]
    var ContentConfig: js.UndefOr[PipelineOutputConfig]
    var Notifications: js.UndefOr[Notifications]
    var OutputBucket: js.UndefOr[BucketName]
    var ThumbnailConfig: js.UndefOr[PipelineOutputConfig]
  }

  object CreatePipelineRequest {
    @inline
    def apply(
        InputBucket: BucketName,
        Name: Name,
        Role: Role,
        AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
        ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
        Notifications: js.UndefOr[Notifications] = js.undefined,
        OutputBucket: js.UndefOr[BucketName] = js.undefined,
        ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
    ): CreatePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "InputBucket" -> InputBucket.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any]
      )

      AwsKmsKeyArn.foreach(__v => __obj.updateDynamic("AwsKmsKeyArn")(__v.asInstanceOf[js.Any]))
      ContentConfig.foreach(__v => __obj.updateDynamic("ContentConfig")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      OutputBucket.foreach(__v => __obj.updateDynamic("OutputBucket")(__v.asInstanceOf[js.Any]))
      ThumbnailConfig.foreach(__v => __obj.updateDynamic("ThumbnailConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineRequest]
    }
  }

  /**
    * When you create a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  @js.native
  trait CreatePipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  object CreatePipelineResponse {
    @inline
    def apply(
        Pipeline: js.UndefOr[Pipeline] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): CreatePipelineResponse = {
      val __obj = js.Dynamic.literal()
      Pipeline.foreach(__v => __obj.updateDynamic("Pipeline")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineResponse]
    }
  }

  /**
    * The <code>CreatePresetRequest</code> structure.
    */
  @js.native
  trait CreatePresetRequest extends js.Object {
    var Container: PresetContainer
    var Name: Name
    var Audio: js.UndefOr[AudioParameters]
    var Description: js.UndefOr[Description]
    var Thumbnails: js.UndefOr[Thumbnails]
    var Video: js.UndefOr[VideoParameters]
  }

  object CreatePresetRequest {
    @inline
    def apply(
        Container: PresetContainer,
        Name: Name,
        Audio: js.UndefOr[AudioParameters] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Thumbnails: js.UndefOr[Thumbnails] = js.undefined,
        Video: js.UndefOr[VideoParameters] = js.undefined
    ): CreatePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Container" -> Container.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Audio.foreach(__v => __obj.updateDynamic("Audio")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Thumbnails.foreach(__v => __obj.updateDynamic("Thumbnails")(__v.asInstanceOf[js.Any]))
      Video.foreach(__v => __obj.updateDynamic("Video")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresetRequest]
    }
  }

  /**
    * The <code>CreatePresetResponse</code> structure.
    */
  @js.native
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
    var Warning: js.UndefOr[String]
  }

  object CreatePresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined,
        Warning: js.UndefOr[String] = js.undefined
    ): CreatePresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      Warning.foreach(__v => __obj.updateDynamic("Warning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresetResponse]
    }
  }

  /**
    * The <code>DeletePipelineRequest</code> structure.
    */
  @js.native
  trait DeletePipelineRequest extends js.Object {
    var Id: Id
  }

  object DeletePipelineRequest {
    @inline
    def apply(
        Id: Id
    ): DeletePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePipelineRequest]
    }
  }

  /**
    * The <code>DeletePipelineResponse</code> structure.
    */
  @js.native
  trait DeletePipelineResponse extends js.Object {}

  object DeletePipelineResponse {
    @inline
    def apply(
    ): DeletePipelineResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePipelineResponse]
    }
  }

  /**
    * The <code>DeletePresetRequest</code> structure.
    */
  @js.native
  trait DeletePresetRequest extends js.Object {
    var Id: Id
  }

  object DeletePresetRequest {
    @inline
    def apply(
        Id: Id
    ): DeletePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePresetRequest]
    }
  }

  /**
    * The <code>DeletePresetResponse</code> structure.
    */
  @js.native
  trait DeletePresetResponse extends js.Object {}

  object DeletePresetResponse {
    @inline
    def apply(
    ): DeletePresetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePresetResponse]
    }
  }

  /**
    * The detected properties of the input file. Elastic Transcoder identifies these values from the input file.
    */
  @js.native
  trait DetectedProperties extends js.Object {
    var DurationMillis: js.UndefOr[NullableLong]
    var FileSize: js.UndefOr[NullableLong]
    var FrameRate: js.UndefOr[FloatString]
    var Height: js.UndefOr[NullableInteger]
    var Width: js.UndefOr[NullableInteger]
  }

  object DetectedProperties {
    @inline
    def apply(
        DurationMillis: js.UndefOr[NullableLong] = js.undefined,
        FileSize: js.UndefOr[NullableLong] = js.undefined,
        FrameRate: js.UndefOr[FloatString] = js.undefined,
        Height: js.UndefOr[NullableInteger] = js.undefined,
        Width: js.UndefOr[NullableInteger] = js.undefined
    ): DetectedProperties = {
      val __obj = js.Dynamic.literal()
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      FileSize.foreach(__v => __obj.updateDynamic("FileSize")(__v.asInstanceOf[js.Any]))
      FrameRate.foreach(__v => __obj.updateDynamic("FrameRate")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectedProperties]
    }
  }

  /**
    * The encryption settings, if any, that are used for decrypting your input files or encrypting your output files. If your input file is encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file, otherwise you must specify the mode you want Elastic Transcoder to use to encrypt your output files.
    */
  @js.native
  trait Encryption extends js.Object {
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Key: js.UndefOr[Base64EncodedString]
    var KeyMd5: js.UndefOr[Base64EncodedString]
    var Mode: js.UndefOr[EncryptionMode]
  }

  object Encryption {
    @inline
    def apply(
        InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
        Key: js.UndefOr[Base64EncodedString] = js.undefined,
        KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined,
        Mode: js.UndefOr[EncryptionMode] = js.undefined
    ): Encryption = {
      val __obj = js.Dynamic.literal()
      InitializationVector.foreach(__v => __obj.updateDynamic("InitializationVector")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      KeyMd5.foreach(__v => __obj.updateDynamic("KeyMd5")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Encryption]
    }
  }

  /**
    * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to your output files.
    */
  @js.native
  trait HlsContentProtection extends js.Object {
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Key: js.UndefOr[Base64EncodedString]
    var KeyMd5: js.UndefOr[Base64EncodedString]
    var KeyStoragePolicy: js.UndefOr[KeyStoragePolicy]
    var LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String]
    var Method: js.UndefOr[HlsContentProtectionMethod]
  }

  object HlsContentProtection {
    @inline
    def apply(
        InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
        Key: js.UndefOr[Base64EncodedString] = js.undefined,
        KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined,
        KeyStoragePolicy: js.UndefOr[KeyStoragePolicy] = js.undefined,
        LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String] = js.undefined,
        Method: js.UndefOr[HlsContentProtectionMethod] = js.undefined
    ): HlsContentProtection = {
      val __obj = js.Dynamic.literal()
      InitializationVector.foreach(__v => __obj.updateDynamic("InitializationVector")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      KeyMd5.foreach(__v => __obj.updateDynamic("KeyMd5")(__v.asInstanceOf[js.Any]))
      KeyStoragePolicy.foreach(__v => __obj.updateDynamic("KeyStoragePolicy")(__v.asInstanceOf[js.Any]))
      LicenseAcquisitionUrl.foreach(__v => __obj.updateDynamic("LicenseAcquisitionUrl")(__v.asInstanceOf[js.Any]))
      Method.foreach(__v => __obj.updateDynamic("Method")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsContentProtection]
    }
  }

  /**
    * The captions to be created, if any.
    */
  @js.native
  trait InputCaptions extends js.Object {
    var CaptionSources: js.UndefOr[CaptionSources]
    var MergePolicy: js.UndefOr[CaptionMergePolicy]
  }

  object InputCaptions {
    @inline
    def apply(
        CaptionSources: js.UndefOr[CaptionSources] = js.undefined,
        MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined
    ): InputCaptions = {
      val __obj = js.Dynamic.literal()
      CaptionSources.foreach(__v => __obj.updateDynamic("CaptionSources")(__v.asInstanceOf[js.Any]))
      MergePolicy.foreach(__v => __obj.updateDynamic("MergePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputCaptions]
    }
  }

  /**
    * A section of the response body that provides information about the job that is created.
    */
  @js.native
  trait Job extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[Id]
    var Input: js.UndefOr[JobInput]
    var Inputs: js.UndefOr[JobInputs]
    var Output: js.UndefOr[JobOutput]
    var OutputKeyPrefix: js.UndefOr[Key]
    var Outputs: js.UndefOr[JobOutputs]
    var PipelineId: js.UndefOr[Id]
    var Playlists: js.UndefOr[Playlists]
    var Status: js.UndefOr[JobStatus]
    var Timing: js.UndefOr[Timing]
    var UserMetadata: js.UndefOr[UserMetadata]
  }

  object Job {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Input: js.UndefOr[JobInput] = js.undefined,
        Inputs: js.UndefOr[JobInputs] = js.undefined,
        Output: js.UndefOr[JobOutput] = js.undefined,
        OutputKeyPrefix: js.UndefOr[Key] = js.undefined,
        Outputs: js.UndefOr[JobOutputs] = js.undefined,
        PipelineId: js.UndefOr[Id] = js.undefined,
        Playlists: js.UndefOr[Playlists] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        Timing: js.UndefOr[Timing] = js.undefined,
        UserMetadata: js.UndefOr[UserMetadata] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      OutputKeyPrefix.foreach(__v => __obj.updateDynamic("OutputKeyPrefix")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      PipelineId.foreach(__v => __obj.updateDynamic("PipelineId")(__v.asInstanceOf[js.Any]))
      Playlists.foreach(__v => __obj.updateDynamic("Playlists")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timing.foreach(__v => __obj.updateDynamic("Timing")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * The .jpg or .png file associated with an audio file.
    */
  @js.native
  trait JobAlbumArt extends js.Object {
    var Artwork: js.UndefOr[Artworks]
    var MergePolicy: js.UndefOr[MergePolicy]
  }

  object JobAlbumArt {
    @inline
    def apply(
        Artwork: js.UndefOr[Artworks] = js.undefined,
        MergePolicy: js.UndefOr[MergePolicy] = js.undefined
    ): JobAlbumArt = {
      val __obj = js.Dynamic.literal()
      Artwork.foreach(__v => __obj.updateDynamic("Artwork")(__v.asInstanceOf[js.Any]))
      MergePolicy.foreach(__v => __obj.updateDynamic("MergePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobAlbumArt]
    }
  }

  /**
    * Information about the file that you're transcoding.
    */
  @js.native
  trait JobInput extends js.Object {
    var AspectRatio: js.UndefOr[AspectRatio]
    var Container: js.UndefOr[JobContainer]
    var DetectedProperties: js.UndefOr[DetectedProperties]
    var Encryption: js.UndefOr[Encryption]
    var FrameRate: js.UndefOr[FrameRate]
    var InputCaptions: js.UndefOr[InputCaptions]
    var Interlaced: js.UndefOr[Interlaced]
    var Key: js.UndefOr[LongKey]
    var Resolution: js.UndefOr[Resolution]
    var TimeSpan: js.UndefOr[TimeSpan]
  }

  object JobInput {
    @inline
    def apply(
        AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
        Container: js.UndefOr[JobContainer] = js.undefined,
        DetectedProperties: js.UndefOr[DetectedProperties] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        FrameRate: js.UndefOr[FrameRate] = js.undefined,
        InputCaptions: js.UndefOr[InputCaptions] = js.undefined,
        Interlaced: js.UndefOr[Interlaced] = js.undefined,
        Key: js.UndefOr[LongKey] = js.undefined,
        Resolution: js.UndefOr[Resolution] = js.undefined,
        TimeSpan: js.UndefOr[TimeSpan] = js.undefined
    ): JobInput = {
      val __obj = js.Dynamic.literal()
      AspectRatio.foreach(__v => __obj.updateDynamic("AspectRatio")(__v.asInstanceOf[js.Any]))
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      DetectedProperties.foreach(__v => __obj.updateDynamic("DetectedProperties")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FrameRate.foreach(__v => __obj.updateDynamic("FrameRate")(__v.asInstanceOf[js.Any]))
      InputCaptions.foreach(__v => __obj.updateDynamic("InputCaptions")(__v.asInstanceOf[js.Any]))
      Interlaced.foreach(__v => __obj.updateDynamic("Interlaced")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      TimeSpan.foreach(__v => __obj.updateDynamic("TimeSpan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobInput]
    }
  }

  /**
    * <important> Outputs recommended instead.
    *  </important> If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the <code>Output</code> object lists information about the first output. This duplicates the information that is listed for the first output in the <code>Outputs</code> object.
    */
  @js.native
  trait JobOutput extends js.Object {
    var AlbumArt: js.UndefOr[JobAlbumArt]
    var AppliedColorSpaceConversion: js.UndefOr[String]
    var Captions: js.UndefOr[Captions]
    var Composition: js.UndefOr[Composition]
    var Duration: js.UndefOr[NullableLong]
    var DurationMillis: js.UndefOr[NullableLong]
    var Encryption: js.UndefOr[Encryption]
    var FileSize: js.UndefOr[NullableLong]
    var FrameRate: js.UndefOr[FloatString]
    var Height: js.UndefOr[NullableInteger]
    var Id: js.UndefOr[String]
    var Key: js.UndefOr[Key]
    var PresetId: js.UndefOr[Id]
    var Rotate: js.UndefOr[Rotate]
    var SegmentDuration: js.UndefOr[FloatString]
    var Status: js.UndefOr[JobStatus]
    var StatusDetail: js.UndefOr[Description]
    var ThumbnailEncryption: js.UndefOr[Encryption]
    var ThumbnailPattern: js.UndefOr[ThumbnailPattern]
    var Watermarks: js.UndefOr[JobWatermarks]
    var Width: js.UndefOr[NullableInteger]
  }

  object JobOutput {
    @inline
    def apply(
        AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined,
        AppliedColorSpaceConversion: js.UndefOr[String] = js.undefined,
        Captions: js.UndefOr[Captions] = js.undefined,
        Composition: js.UndefOr[Composition] = js.undefined,
        Duration: js.UndefOr[NullableLong] = js.undefined,
        DurationMillis: js.UndefOr[NullableLong] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        FileSize: js.UndefOr[NullableLong] = js.undefined,
        FrameRate: js.UndefOr[FloatString] = js.undefined,
        Height: js.UndefOr[NullableInteger] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Key: js.UndefOr[Key] = js.undefined,
        PresetId: js.UndefOr[Id] = js.undefined,
        Rotate: js.UndefOr[Rotate] = js.undefined,
        SegmentDuration: js.UndefOr[FloatString] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusDetail: js.UndefOr[Description] = js.undefined,
        ThumbnailEncryption: js.UndefOr[Encryption] = js.undefined,
        ThumbnailPattern: js.UndefOr[ThumbnailPattern] = js.undefined,
        Watermarks: js.UndefOr[JobWatermarks] = js.undefined,
        Width: js.UndefOr[NullableInteger] = js.undefined
    ): JobOutput = {
      val __obj = js.Dynamic.literal()
      AlbumArt.foreach(__v => __obj.updateDynamic("AlbumArt")(__v.asInstanceOf[js.Any]))
      AppliedColorSpaceConversion.foreach(__v =>
        __obj.updateDynamic("AppliedColorSpaceConversion")(__v.asInstanceOf[js.Any])
      )
      Captions.foreach(__v => __obj.updateDynamic("Captions")(__v.asInstanceOf[js.Any]))
      Composition.foreach(__v => __obj.updateDynamic("Composition")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FileSize.foreach(__v => __obj.updateDynamic("FileSize")(__v.asInstanceOf[js.Any]))
      FrameRate.foreach(__v => __obj.updateDynamic("FrameRate")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      PresetId.foreach(__v => __obj.updateDynamic("PresetId")(__v.asInstanceOf[js.Any]))
      Rotate.foreach(__v => __obj.updateDynamic("Rotate")(__v.asInstanceOf[js.Any]))
      SegmentDuration.foreach(__v => __obj.updateDynamic("SegmentDuration")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.updateDynamic("StatusDetail")(__v.asInstanceOf[js.Any]))
      ThumbnailEncryption.foreach(__v => __obj.updateDynamic("ThumbnailEncryption")(__v.asInstanceOf[js.Any]))
      ThumbnailPattern.foreach(__v => __obj.updateDynamic("ThumbnailPattern")(__v.asInstanceOf[js.Any]))
      Watermarks.foreach(__v => __obj.updateDynamic("Watermarks")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobOutput]
    }
  }

  /**
    * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency.
    */
  @js.native
  trait JobWatermark extends js.Object {
    var Encryption: js.UndefOr[Encryption]
    var InputKey: js.UndefOr[WatermarkKey]
    var PresetWatermarkId: js.UndefOr[PresetWatermarkId]
  }

  object JobWatermark {
    @inline
    def apply(
        Encryption: js.UndefOr[Encryption] = js.undefined,
        InputKey: js.UndefOr[WatermarkKey] = js.undefined,
        PresetWatermarkId: js.UndefOr[PresetWatermarkId] = js.undefined
    ): JobWatermark = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      InputKey.foreach(__v => __obj.updateDynamic("InputKey")(__v.asInstanceOf[js.Any]))
      PresetWatermarkId.foreach(__v => __obj.updateDynamic("PresetWatermarkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobWatermark]
    }
  }

  /**
    * The <code>ListJobsByPipelineRequest</code> structure.
    */
  @js.native
  trait ListJobsByPipelineRequest extends js.Object {
    var PipelineId: Id
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListJobsByPipelineRequest {
    @inline
    def apply(
        PipelineId: Id,
        Ascending: js.UndefOr[Ascending] = js.undefined,
        PageToken: js.UndefOr[Id] = js.undefined
    ): ListJobsByPipelineRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineId" -> PipelineId.asInstanceOf[js.Any]
      )

      Ascending.foreach(__v => __obj.updateDynamic("Ascending")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsByPipelineRequest]
    }
  }

  /**
    * The <code>ListJobsByPipelineResponse</code> structure.
    */
  @js.native
  trait ListJobsByPipelineResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextPageToken: js.UndefOr[Id]
  }

  object ListJobsByPipelineResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[Jobs] = js.undefined,
        NextPageToken: js.UndefOr[Id] = js.undefined
    ): ListJobsByPipelineResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsByPipelineResponse]
    }
  }

  /**
    * The <code>ListJobsByStatusRequest</code> structure.
    */
  @js.native
  trait ListJobsByStatusRequest extends js.Object {
    var Status: JobStatus
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListJobsByStatusRequest {
    @inline
    def apply(
        Status: JobStatus,
        Ascending: js.UndefOr[Ascending] = js.undefined,
        PageToken: js.UndefOr[Id] = js.undefined
    ): ListJobsByStatusRequest = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Ascending.foreach(__v => __obj.updateDynamic("Ascending")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsByStatusRequest]
    }
  }

  /**
    * The <code>ListJobsByStatusResponse</code> structure.
    */
  @js.native
  trait ListJobsByStatusResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextPageToken: js.UndefOr[Id]
  }

  object ListJobsByStatusResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[Jobs] = js.undefined,
        NextPageToken: js.UndefOr[Id] = js.undefined
    ): ListJobsByStatusResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsByStatusResponse]
    }
  }

  /**
    * The <code>ListPipelineRequest</code> structure.
    */
  @js.native
  trait ListPipelinesRequest extends js.Object {
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListPipelinesRequest {
    @inline
    def apply(
        Ascending: js.UndefOr[Ascending] = js.undefined,
        PageToken: js.UndefOr[Id] = js.undefined
    ): ListPipelinesRequest = {
      val __obj = js.Dynamic.literal()
      Ascending.foreach(__v => __obj.updateDynamic("Ascending")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesRequest]
    }
  }

  /**
    * A list of the pipelines associated with the current AWS account.
    */
  @js.native
  trait ListPipelinesResponse extends js.Object {
    var NextPageToken: js.UndefOr[Id]
    var Pipelines: js.UndefOr[Pipelines]
  }

  object ListPipelinesResponse {
    @inline
    def apply(
        NextPageToken: js.UndefOr[Id] = js.undefined,
        Pipelines: js.UndefOr[Pipelines] = js.undefined
    ): ListPipelinesResponse = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Pipelines.foreach(__v => __obj.updateDynamic("Pipelines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesResponse]
    }
  }

  /**
    * The <code>ListPresetsRequest</code> structure.
    */
  @js.native
  trait ListPresetsRequest extends js.Object {
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  object ListPresetsRequest {
    @inline
    def apply(
        Ascending: js.UndefOr[Ascending] = js.undefined,
        PageToken: js.UndefOr[Id] = js.undefined
    ): ListPresetsRequest = {
      val __obj = js.Dynamic.literal()
      Ascending.foreach(__v => __obj.updateDynamic("Ascending")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPresetsRequest]
    }
  }

  /**
    * The <code>ListPresetsResponse</code> structure.
    */
  @js.native
  trait ListPresetsResponse extends js.Object {
    var NextPageToken: js.UndefOr[Id]
    var Presets: js.UndefOr[Presets]
  }

  object ListPresetsResponse {
    @inline
    def apply(
        NextPageToken: js.UndefOr[Id] = js.undefined,
        Presets: js.UndefOr[Presets] = js.undefined
    ): ListPresetsResponse = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Presets.foreach(__v => __obj.updateDynamic("Presets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPresetsResponse]
    }
  }

  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic or topics to notify in order to report job status.
    *  <important> To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
    *  </important>
    */
  @js.native
  trait Notifications extends js.Object {
    var Completed: js.UndefOr[SnsTopic]
    var Error: js.UndefOr[SnsTopic]
    var Progressing: js.UndefOr[SnsTopic]
    var Warning: js.UndefOr[SnsTopic]
  }

  object Notifications {
    @inline
    def apply(
        Completed: js.UndefOr[SnsTopic] = js.undefined,
        Error: js.UndefOr[SnsTopic] = js.undefined,
        Progressing: js.UndefOr[SnsTopic] = js.undefined,
        Warning: js.UndefOr[SnsTopic] = js.undefined
    ): Notifications = {
      val __obj = js.Dynamic.literal()
      Completed.foreach(__v => __obj.updateDynamic("Completed")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Progressing.foreach(__v => __obj.updateDynamic("Progressing")(__v.asInstanceOf[js.Any]))
      Warning.foreach(__v => __obj.updateDynamic("Warning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Notifications]
    }
  }

  /**
    * The <code>Permission</code> structure.
    */
  @js.native
  trait Permission extends js.Object {
    var Access: js.UndefOr[AccessControls]
    var Grantee: js.UndefOr[Grantee]
    var GranteeType: js.UndefOr[GranteeType]
  }

  object Permission {
    @inline
    def apply(
        Access: js.UndefOr[AccessControls] = js.undefined,
        Grantee: js.UndefOr[Grantee] = js.undefined,
        GranteeType: js.UndefOr[GranteeType] = js.undefined
    ): Permission = {
      val __obj = js.Dynamic.literal()
      Access.foreach(__v => __obj.updateDynamic("Access")(__v.asInstanceOf[js.Any]))
      Grantee.foreach(__v => __obj.updateDynamic("Grantee")(__v.asInstanceOf[js.Any]))
      GranteeType.foreach(__v => __obj.updateDynamic("GranteeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Permission]
    }
  }

  /**
    * The pipeline (queue) that is used to manage jobs.
    */
  @js.native
  trait Pipeline extends js.Object {
    var Arn: js.UndefOr[String]
    var AwsKmsKeyArn: js.UndefOr[KeyArn]
    var ContentConfig: js.UndefOr[PipelineOutputConfig]
    var Id: js.UndefOr[Id]
    var InputBucket: js.UndefOr[BucketName]
    var Name: js.UndefOr[Name]
    var Notifications: js.UndefOr[Notifications]
    var OutputBucket: js.UndefOr[BucketName]
    var Role: js.UndefOr[Role]
    var Status: js.UndefOr[PipelineStatus]
    var ThumbnailConfig: js.UndefOr[PipelineOutputConfig]
  }

  object Pipeline {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
        ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        InputBucket: js.UndefOr[BucketName] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Notifications: js.UndefOr[Notifications] = js.undefined,
        OutputBucket: js.UndefOr[BucketName] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        Status: js.UndefOr[PipelineStatus] = js.undefined,
        ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
    ): Pipeline = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AwsKmsKeyArn.foreach(__v => __obj.updateDynamic("AwsKmsKeyArn")(__v.asInstanceOf[js.Any]))
      ContentConfig.foreach(__v => __obj.updateDynamic("ContentConfig")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputBucket.foreach(__v => __obj.updateDynamic("InputBucket")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      OutputBucket.foreach(__v => __obj.updateDynamic("OutputBucket")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThumbnailConfig.foreach(__v => __obj.updateDynamic("ThumbnailConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Pipeline]
    }
  }

  /**
    * The <code>PipelineOutputConfig</code> structure.
    */
  @js.native
  trait PipelineOutputConfig extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Permissions: js.UndefOr[Permissions]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object PipelineOutputConfig {
    @inline
    def apply(
        Bucket: js.UndefOr[BucketName] = js.undefined,
        Permissions: js.UndefOr[Permissions] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined
    ): PipelineOutputConfig = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineOutputConfig]
    }
  }

  /**
    * The PlayReady DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    *  PlayReady DRM encrypts your media files using <code>aes-ctr</code> encryption.
    *  If you use DRM for an <code>HLSv3</code> playlist, your outputs must have a master playlist.
    */
  @js.native
  trait PlayReadyDrm extends js.Object {
    var Format: js.UndefOr[PlayReadyDrmFormatString]
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Key: js.UndefOr[NonEmptyBase64EncodedString]
    var KeyId: js.UndefOr[KeyIdGuid]
    var KeyMd5: js.UndefOr[NonEmptyBase64EncodedString]
    var LicenseAcquisitionUrl: js.UndefOr[OneTo512String]
  }

  object PlayReadyDrm {
    @inline
    def apply(
        Format: js.UndefOr[PlayReadyDrmFormatString] = js.undefined,
        InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
        Key: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined,
        KeyId: js.UndefOr[KeyIdGuid] = js.undefined,
        KeyMd5: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined,
        LicenseAcquisitionUrl: js.UndefOr[OneTo512String] = js.undefined
    ): PlayReadyDrm = {
      val __obj = js.Dynamic.literal()
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      InitializationVector.foreach(__v => __obj.updateDynamic("InitializationVector")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      KeyMd5.foreach(__v => __obj.updateDynamic("KeyMd5")(__v.asInstanceOf[js.Any]))
      LicenseAcquisitionUrl.foreach(__v => __obj.updateDynamic("LicenseAcquisitionUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlayReadyDrm]
    }
  }

  /**
    * Use Only for Fragmented MP4 or MPEG-TS Outputs. If you specify a preset for which the value of Container is <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. We recommend that you create only one master playlist per output format. The maximum number of master playlists in a job is 30.
    */
  @js.native
  trait Playlist extends js.Object {
    var Format: js.UndefOr[PlaylistFormat]
    var HlsContentProtection: js.UndefOr[HlsContentProtection]
    var Name: js.UndefOr[Filename]
    var OutputKeys: js.UndefOr[OutputKeys]
    var PlayReadyDrm: js.UndefOr[PlayReadyDrm]
    var Status: js.UndefOr[JobStatus]
    var StatusDetail: js.UndefOr[Description]
  }

  object Playlist {
    @inline
    def apply(
        Format: js.UndefOr[PlaylistFormat] = js.undefined,
        HlsContentProtection: js.UndefOr[HlsContentProtection] = js.undefined,
        Name: js.UndefOr[Filename] = js.undefined,
        OutputKeys: js.UndefOr[OutputKeys] = js.undefined,
        PlayReadyDrm: js.UndefOr[PlayReadyDrm] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusDetail: js.UndefOr[Description] = js.undefined
    ): Playlist = {
      val __obj = js.Dynamic.literal()
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      HlsContentProtection.foreach(__v => __obj.updateDynamic("HlsContentProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputKeys.foreach(__v => __obj.updateDynamic("OutputKeys")(__v.asInstanceOf[js.Any]))
      PlayReadyDrm.foreach(__v => __obj.updateDynamic("PlayReadyDrm")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.updateDynamic("StatusDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Playlist]
    }
  }

  /**
    * Presets are templates that contain most of the settings for transcoding media files from one format to another. Elastic Transcoder includes some default presets for common formats, for example, several iPod and iPhone versions. You can also create your own presets for formats that aren't included among the default presets. You specify which preset you want to use when you create a job.
    */
  @js.native
  trait Preset extends js.Object {
    var Arn: js.UndefOr[String]
    var Audio: js.UndefOr[AudioParameters]
    var Container: js.UndefOr[PresetContainer]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var Thumbnails: js.UndefOr[Thumbnails]
    var Type: js.UndefOr[PresetType]
    var Video: js.UndefOr[VideoParameters]
  }

  object Preset {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Audio: js.UndefOr[AudioParameters] = js.undefined,
        Container: js.UndefOr[PresetContainer] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Thumbnails: js.UndefOr[Thumbnails] = js.undefined,
        Type: js.UndefOr[PresetType] = js.undefined,
        Video: js.UndefOr[VideoParameters] = js.undefined
    ): Preset = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Audio.foreach(__v => __obj.updateDynamic("Audio")(__v.asInstanceOf[js.Any]))
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Thumbnails.foreach(__v => __obj.updateDynamic("Thumbnails")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Video.foreach(__v => __obj.updateDynamic("Video")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Preset]
    }
  }

  /**
    * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in the specified size and location, and with the specified opacity for the duration of the transcoded video.
    *  Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency.
    *  When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have different dimensions.
    */
  @js.native
  trait PresetWatermark extends js.Object {
    var HorizontalAlign: js.UndefOr[HorizontalAlign]
    var HorizontalOffset: js.UndefOr[PixelsOrPercent]
    var Id: js.UndefOr[PresetWatermarkId]
    var MaxHeight: js.UndefOr[PixelsOrPercent]
    var MaxWidth: js.UndefOr[PixelsOrPercent]
    var Opacity: js.UndefOr[Opacity]
    var SizingPolicy: js.UndefOr[WatermarkSizingPolicy]
    var Target: js.UndefOr[Target]
    var VerticalAlign: js.UndefOr[VerticalAlign]
    var VerticalOffset: js.UndefOr[PixelsOrPercent]
  }

  object PresetWatermark {
    @inline
    def apply(
        HorizontalAlign: js.UndefOr[HorizontalAlign] = js.undefined,
        HorizontalOffset: js.UndefOr[PixelsOrPercent] = js.undefined,
        Id: js.UndefOr[PresetWatermarkId] = js.undefined,
        MaxHeight: js.UndefOr[PixelsOrPercent] = js.undefined,
        MaxWidth: js.UndefOr[PixelsOrPercent] = js.undefined,
        Opacity: js.UndefOr[Opacity] = js.undefined,
        SizingPolicy: js.UndefOr[WatermarkSizingPolicy] = js.undefined,
        Target: js.UndefOr[Target] = js.undefined,
        VerticalAlign: js.UndefOr[VerticalAlign] = js.undefined,
        VerticalOffset: js.UndefOr[PixelsOrPercent] = js.undefined
    ): PresetWatermark = {
      val __obj = js.Dynamic.literal()
      HorizontalAlign.foreach(__v => __obj.updateDynamic("HorizontalAlign")(__v.asInstanceOf[js.Any]))
      HorizontalOffset.foreach(__v => __obj.updateDynamic("HorizontalOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MaxHeight.foreach(__v => __obj.updateDynamic("MaxHeight")(__v.asInstanceOf[js.Any]))
      MaxWidth.foreach(__v => __obj.updateDynamic("MaxWidth")(__v.asInstanceOf[js.Any]))
      Opacity.foreach(__v => __obj.updateDynamic("Opacity")(__v.asInstanceOf[js.Any]))
      SizingPolicy.foreach(__v => __obj.updateDynamic("SizingPolicy")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      VerticalAlign.foreach(__v => __obj.updateDynamic("VerticalAlign")(__v.asInstanceOf[js.Any]))
      VerticalOffset.foreach(__v => __obj.updateDynamic("VerticalOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PresetWatermark]
    }
  }

  /**
    * The <code>ReadJobRequest</code> structure.
    */
  @js.native
  trait ReadJobRequest extends js.Object {
    var Id: Id
  }

  object ReadJobRequest {
    @inline
    def apply(
        Id: Id
    ): ReadJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReadJobRequest]
    }
  }

  /**
    * The <code>ReadJobResponse</code> structure.
    */
  @js.native
  trait ReadJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object ReadJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): ReadJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadJobResponse]
    }
  }

  /**
    * The <code>ReadPipelineRequest</code> structure.
    */
  @js.native
  trait ReadPipelineRequest extends js.Object {
    var Id: Id
  }

  object ReadPipelineRequest {
    @inline
    def apply(
        Id: Id
    ): ReadPipelineRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReadPipelineRequest]
    }
  }

  /**
    * The <code>ReadPipelineResponse</code> structure.
    */
  @js.native
  trait ReadPipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  object ReadPipelineResponse {
    @inline
    def apply(
        Pipeline: js.UndefOr[Pipeline] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): ReadPipelineResponse = {
      val __obj = js.Dynamic.literal()
      Pipeline.foreach(__v => __obj.updateDynamic("Pipeline")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadPipelineResponse]
    }
  }

  /**
    * The <code>ReadPresetRequest</code> structure.
    */
  @js.native
  trait ReadPresetRequest extends js.Object {
    var Id: Id
  }

  object ReadPresetRequest {
    @inline
    def apply(
        Id: Id
    ): ReadPresetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReadPresetRequest]
    }
  }

  /**
    * The <code>ReadPresetResponse</code> structure.
    */
  @js.native
  trait ReadPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object ReadPresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): ReadPresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadPresetResponse]
    }
  }

  /**
    * The <code>TestRoleRequest</code> structure.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait TestRoleRequest extends js.Object {
    var InputBucket: BucketName
    var OutputBucket: BucketName
    var Role: Role
    var Topics: SnsTopics
  }

  object TestRoleRequest {
    @inline
    def apply(
        InputBucket: BucketName,
        OutputBucket: BucketName,
        Role: Role,
        Topics: SnsTopics
    ): TestRoleRequest = {
      val __obj = js.Dynamic.literal(
        "InputBucket" -> InputBucket.asInstanceOf[js.Any],
        "OutputBucket" -> OutputBucket.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "Topics" -> Topics.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestRoleRequest]
    }
  }

  /**
    * The <code>TestRoleResponse</code> structure.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait TestRoleResponse extends js.Object {
    var Messages: js.UndefOr[ExceptionMessages]
    var Success: js.UndefOr[Success]
  }

  object TestRoleResponse {
    @inline
    def apply(
        Messages: js.UndefOr[ExceptionMessages] = js.undefined,
        Success: js.UndefOr[Success] = js.undefined
    ): TestRoleResponse = {
      val __obj = js.Dynamic.literal()
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      Success.foreach(__v => __obj.updateDynamic("Success")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestRoleResponse]
    }
  }

  /**
    * Thumbnails for videos.
    */
  @js.native
  trait Thumbnails extends js.Object {
    var AspectRatio: js.UndefOr[AspectRatio]
    var Format: js.UndefOr[JpgOrPng]
    var Interval: js.UndefOr[Digits]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var Resolution: js.UndefOr[ThumbnailResolution]
    var SizingPolicy: js.UndefOr[SizingPolicy]
  }

  object Thumbnails {
    @inline
    def apply(
        AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
        Format: js.UndefOr[JpgOrPng] = js.undefined,
        Interval: js.UndefOr[Digits] = js.undefined,
        MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
        MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
        PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
        Resolution: js.UndefOr[ThumbnailResolution] = js.undefined,
        SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined
    ): Thumbnails = {
      val __obj = js.Dynamic.literal()
      AspectRatio.foreach(__v => __obj.updateDynamic("AspectRatio")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      MaxHeight.foreach(__v => __obj.updateDynamic("MaxHeight")(__v.asInstanceOf[js.Any]))
      MaxWidth.foreach(__v => __obj.updateDynamic("MaxWidth")(__v.asInstanceOf[js.Any]))
      PaddingPolicy.foreach(__v => __obj.updateDynamic("PaddingPolicy")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      SizingPolicy.foreach(__v => __obj.updateDynamic("SizingPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Thumbnails]
    }
  }

  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  @js.native
  trait TimeSpan extends js.Object {
    var Duration: js.UndefOr[Time]
    var StartTime: js.UndefOr[Time]
  }

  object TimeSpan {
    @inline
    def apply(
        Duration: js.UndefOr[Time] = js.undefined,
        StartTime: js.UndefOr[Time] = js.undefined
    ): TimeSpan = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSpan]
    }
  }

  /**
    * Details about the timing of a job.
    */
  @js.native
  trait Timing extends js.Object {
    var FinishTimeMillis: js.UndefOr[NullableLong]
    var StartTimeMillis: js.UndefOr[NullableLong]
    var SubmitTimeMillis: js.UndefOr[NullableLong]
  }

  object Timing {
    @inline
    def apply(
        FinishTimeMillis: js.UndefOr[NullableLong] = js.undefined,
        StartTimeMillis: js.UndefOr[NullableLong] = js.undefined,
        SubmitTimeMillis: js.UndefOr[NullableLong] = js.undefined
    ): Timing = {
      val __obj = js.Dynamic.literal()
      FinishTimeMillis.foreach(__v => __obj.updateDynamic("FinishTimeMillis")(__v.asInstanceOf[js.Any]))
      StartTimeMillis.foreach(__v => __obj.updateDynamic("StartTimeMillis")(__v.asInstanceOf[js.Any]))
      SubmitTimeMillis.foreach(__v => __obj.updateDynamic("SubmitTimeMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Timing]
    }
  }

  /**
    * The <code>UpdatePipelineNotificationsRequest</code> structure.
    */
  @js.native
  trait UpdatePipelineNotificationsRequest extends js.Object {
    var Id: Id
    var Notifications: Notifications
  }

  object UpdatePipelineNotificationsRequest {
    @inline
    def apply(
        Id: Id,
        Notifications: Notifications
    ): UpdatePipelineNotificationsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Notifications" -> Notifications.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePipelineNotificationsRequest]
    }
  }

  /**
    * The <code>UpdatePipelineNotificationsResponse</code> structure.
    */
  @js.native
  trait UpdatePipelineNotificationsResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
  }

  object UpdatePipelineNotificationsResponse {
    @inline
    def apply(
        Pipeline: js.UndefOr[Pipeline] = js.undefined
    ): UpdatePipelineNotificationsResponse = {
      val __obj = js.Dynamic.literal()
      Pipeline.foreach(__v => __obj.updateDynamic("Pipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineNotificationsResponse]
    }
  }

  /**
    * The <code>UpdatePipelineRequest</code> structure.
    */
  @js.native
  trait UpdatePipelineRequest extends js.Object {
    var Id: Id
    var AwsKmsKeyArn: js.UndefOr[KeyArn]
    var ContentConfig: js.UndefOr[PipelineOutputConfig]
    var InputBucket: js.UndefOr[BucketName]
    var Name: js.UndefOr[Name]
    var Notifications: js.UndefOr[Notifications]
    var Role: js.UndefOr[Role]
    var ThumbnailConfig: js.UndefOr[PipelineOutputConfig]
  }

  object UpdatePipelineRequest {
    @inline
    def apply(
        Id: Id,
        AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
        ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
        InputBucket: js.UndefOr[BucketName] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Notifications: js.UndefOr[Notifications] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
    ): UpdatePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AwsKmsKeyArn.foreach(__v => __obj.updateDynamic("AwsKmsKeyArn")(__v.asInstanceOf[js.Any]))
      ContentConfig.foreach(__v => __obj.updateDynamic("ContentConfig")(__v.asInstanceOf[js.Any]))
      InputBucket.foreach(__v => __obj.updateDynamic("InputBucket")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      ThumbnailConfig.foreach(__v => __obj.updateDynamic("ThumbnailConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineRequest]
    }
  }

  /**
    * When you update a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  @js.native
  trait UpdatePipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  object UpdatePipelineResponse {
    @inline
    def apply(
        Pipeline: js.UndefOr[Pipeline] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): UpdatePipelineResponse = {
      val __obj = js.Dynamic.literal()
      Pipeline.foreach(__v => __obj.updateDynamic("Pipeline")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineResponse]
    }
  }

  /**
    * The <code>UpdatePipelineStatusRequest</code> structure.
    */
  @js.native
  trait UpdatePipelineStatusRequest extends js.Object {
    var Id: Id
    var Status: PipelineStatus
  }

  object UpdatePipelineStatusRequest {
    @inline
    def apply(
        Id: Id,
        Status: PipelineStatus
    ): UpdatePipelineStatusRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePipelineStatusRequest]
    }
  }

  /**
    * When you update status for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  @js.native
  trait UpdatePipelineStatusResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
  }

  object UpdatePipelineStatusResponse {
    @inline
    def apply(
        Pipeline: js.UndefOr[Pipeline] = js.undefined
    ): UpdatePipelineStatusResponse = {
      val __obj = js.Dynamic.literal()
      Pipeline.foreach(__v => __obj.updateDynamic("Pipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineStatusResponse]
    }
  }

  /**
    * The <code>VideoParameters</code> structure.
    */
  @js.native
  trait VideoParameters extends js.Object {
    var AspectRatio: js.UndefOr[AspectRatio]
    var BitRate: js.UndefOr[VideoBitRate]
    var Codec: js.UndefOr[VideoCodec]
    var CodecOptions: js.UndefOr[CodecOptions]
    var DisplayAspectRatio: js.UndefOr[AspectRatio]
    var FixedGOP: js.UndefOr[FixedGOP]
    var FrameRate: js.UndefOr[FrameRate]
    var KeyframesMaxDist: js.UndefOr[KeyframesMaxDist]
    var MaxFrameRate: js.UndefOr[MaxFrameRate]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var Resolution: js.UndefOr[Resolution]
    var SizingPolicy: js.UndefOr[SizingPolicy]
    var Watermarks: js.UndefOr[PresetWatermarks]
  }

  object VideoParameters {
    @inline
    def apply(
        AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
        BitRate: js.UndefOr[VideoBitRate] = js.undefined,
        Codec: js.UndefOr[VideoCodec] = js.undefined,
        CodecOptions: js.UndefOr[CodecOptions] = js.undefined,
        DisplayAspectRatio: js.UndefOr[AspectRatio] = js.undefined,
        FixedGOP: js.UndefOr[FixedGOP] = js.undefined,
        FrameRate: js.UndefOr[FrameRate] = js.undefined,
        KeyframesMaxDist: js.UndefOr[KeyframesMaxDist] = js.undefined,
        MaxFrameRate: js.UndefOr[MaxFrameRate] = js.undefined,
        MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
        MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
        PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
        Resolution: js.UndefOr[Resolution] = js.undefined,
        SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined,
        Watermarks: js.UndefOr[PresetWatermarks] = js.undefined
    ): VideoParameters = {
      val __obj = js.Dynamic.literal()
      AspectRatio.foreach(__v => __obj.updateDynamic("AspectRatio")(__v.asInstanceOf[js.Any]))
      BitRate.foreach(__v => __obj.updateDynamic("BitRate")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      CodecOptions.foreach(__v => __obj.updateDynamic("CodecOptions")(__v.asInstanceOf[js.Any]))
      DisplayAspectRatio.foreach(__v => __obj.updateDynamic("DisplayAspectRatio")(__v.asInstanceOf[js.Any]))
      FixedGOP.foreach(__v => __obj.updateDynamic("FixedGOP")(__v.asInstanceOf[js.Any]))
      FrameRate.foreach(__v => __obj.updateDynamic("FrameRate")(__v.asInstanceOf[js.Any]))
      KeyframesMaxDist.foreach(__v => __obj.updateDynamic("KeyframesMaxDist")(__v.asInstanceOf[js.Any]))
      MaxFrameRate.foreach(__v => __obj.updateDynamic("MaxFrameRate")(__v.asInstanceOf[js.Any]))
      MaxHeight.foreach(__v => __obj.updateDynamic("MaxHeight")(__v.asInstanceOf[js.Any]))
      MaxWidth.foreach(__v => __obj.updateDynamic("MaxWidth")(__v.asInstanceOf[js.Any]))
      PaddingPolicy.foreach(__v => __obj.updateDynamic("PaddingPolicy")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      SizingPolicy.foreach(__v => __obj.updateDynamic("SizingPolicy")(__v.asInstanceOf[js.Any]))
      Watermarks.foreach(__v => __obj.updateDynamic("Watermarks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoParameters]
    }
  }

  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline.
    *  Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  @js.native
  trait Warning extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object Warning {
    @inline
    def apply(
        Code: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): Warning = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Warning]
    }
  }
}
