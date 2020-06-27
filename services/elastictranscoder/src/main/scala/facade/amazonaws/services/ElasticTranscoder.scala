package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object elastictranscoder {
  type AccessControl        = String
  type AccessControls       = js.Array[AccessControl]
  type Artworks             = js.Array[Artwork]
  type Ascending            = String
  type AspectRatio          = String
  type AudioBitDepth        = String
  type AudioBitOrder        = String
  type AudioBitRate         = String
  type AudioChannels        = String
  type AudioCodec           = String
  type AudioCodecProfile    = String
  type AudioPackingMode     = String
  type AudioSampleRate      = String
  type AudioSigned          = String
  type Base64EncodedString  = String
  type BucketName           = String
  type CaptionFormatFormat  = String
  type CaptionFormatPattern = String
  type CaptionFormats       = js.Array[CaptionFormat]
  type CaptionMergePolicy   = String
  type CaptionSources       = js.Array[CaptionSource]
  type CodecOption          = String
  type CodecOptions         = js.Dictionary[CodecOption]
  @deprecated("Deprecated in AWS SDK", "forever")
  type Composition                 = js.Array[Clip]
  type CreateJobOutputs            = js.Array[CreateJobOutput]
  type CreateJobPlaylists          = js.Array[CreateJobPlaylist]
  type Description                 = String
  type Digits                      = String
  type DigitsOrAuto                = String
  type EncryptionMode              = String
  type ExceptionMessages           = js.Array[String]
  type Filename                    = String
  type FixedGOP                    = String
  type FloatString                 = String
  type FrameRate                   = String
  type Grantee                     = String
  type GranteeType                 = String
  type HlsContentProtectionMethod  = String
  type HorizontalAlign             = String
  type Id                          = String
  type Interlaced                  = String
  type JobContainer                = String
  type JobInputs                   = js.Array[JobInput]
  type JobOutputs                  = js.Array[JobOutput]
  type JobStatus                   = String
  type JobWatermarks               = js.Array[JobWatermark]
  type Jobs                        = js.Array[Job]
  type JpgOrPng                    = String
  type Key                         = String
  type KeyArn                      = String
  type KeyIdGuid                   = String
  type KeyStoragePolicy            = String
  type KeyframesMaxDist            = String
  type LongKey                     = String
  type MaxFrameRate                = String
  type MergePolicy                 = String
  type Name                        = String
  type NonEmptyBase64EncodedString = String
  type NullableInteger             = Int
  type NullableLong                = Double
  type OneTo512String              = String
  type Opacity                     = String
  type OutputKeys                  = js.Array[Key]
  type PaddingPolicy               = String
  type Permissions                 = js.Array[Permission]
  type PipelineStatus              = String
  type Pipelines                   = js.Array[Pipeline]
  type PixelsOrPercent             = String
  type PlayReadyDrmFormatString    = String
  type PlaylistFormat              = String
  type Playlists                   = js.Array[Playlist]
  type PresetContainer             = String
  type PresetType                  = String
  type PresetWatermarkId           = String
  type PresetWatermarks            = js.Array[PresetWatermark]
  type Presets                     = js.Array[Preset]
  type Resolution                  = String
  type Role                        = String
  type Rotate                      = String
  type SizingPolicy                = String
  type SnsTopic                    = String
  type SnsTopics                   = js.Array[SnsTopic]
  type StorageClass                = String
  type Success                     = String
  type Target                      = String
  type ThumbnailPattern            = String
  type ThumbnailResolution         = String
  type Time                        = String
  type TimeOffset                  = String
  type UserMetadata                = js.Dictionary[String]
  type VerticalAlign               = String
  type VideoBitRate                = String
  type VideoCodec                  = String
  type Warnings                    = js.Array[Warning]
  type WatermarkKey                = String
  type WatermarkSizingPolicy       = String
  type ZeroTo255String             = String
  type ZeroTo512String             = String

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

    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse]                            = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse]                            = js.native
    def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse]             = js.native
    def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse]                   = js.native
    def deletePipeline(params: DeletePipelineRequest): Request[DeletePipelineResponse]             = js.native
    def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse]                   = js.native
    def listJobsByPipeline(params: ListJobsByPipelineRequest): Request[ListJobsByPipelineResponse] = js.native
    def listJobsByStatus(params: ListJobsByStatusRequest): Request[ListJobsByStatusResponse]       = js.native
    def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse]                = js.native
    def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse]                      = js.native
    def readJob(params: ReadJobRequest): Request[ReadJobResponse]                                  = js.native
    def readPipeline(params: ReadPipelineRequest): Request[ReadPipelineResponse]                   = js.native
    def readPreset(params: ReadPresetRequest): Request[ReadPresetResponse]                         = js.native
    def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse]             = js.native
    def updatePipelineNotifications(
        params: UpdatePipelineNotificationsRequest
    ): Request[UpdatePipelineNotificationsResponse]                                                      = js.native
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
  @Factory
  trait Artwork extends js.Object {
    var AlbumArtFormat: js.UndefOr[JpgOrPng]
    var Encryption: js.UndefOr[Encryption]
    var InputKey: js.UndefOr[WatermarkKey]
    var MaxHeight: js.UndefOr[DigitsOrAuto]
    var MaxWidth: js.UndefOr[DigitsOrAuto]
    var PaddingPolicy: js.UndefOr[PaddingPolicy]
    var SizingPolicy: js.UndefOr[SizingPolicy]
  }

  /**
    * Options associated with your audio codec.
    */
  @js.native
  @Factory
  trait AudioCodecOptions extends js.Object {
    var BitDepth: js.UndefOr[AudioBitDepth]
    var BitOrder: js.UndefOr[AudioBitOrder]
    var Profile: js.UndefOr[AudioCodecProfile]
    var Signed: js.UndefOr[AudioSigned]
  }

  /**
    * Parameters required for transcoding audio.
    */
  @js.native
  @Factory
  trait AudioParameters extends js.Object {
    var AudioPackingMode: js.UndefOr[AudioPackingMode]
    var BitRate: js.UndefOr[AudioBitRate]
    var Channels: js.UndefOr[AudioChannels]
    var Codec: js.UndefOr[AudioCodec]
    var CodecOptions: js.UndefOr[AudioCodecOptions]
    var SampleRate: js.UndefOr[AudioSampleRate]
  }

  /**
    * The <code>CancelJobRequest</code> structure.
    */
  @js.native
  @Factory
  trait CancelJobRequest extends js.Object {
    var Id: Id
  }

  /**
    * The response body contains a JSON object. If the job is successfully canceled, the value of <code>Success</code> is <code>true</code>.
    */
  @js.native
  @Factory
  trait CancelJobResponse extends js.Object {}

  /**
    * The file format of the output captions. If you leave this value blank, Elastic Transcoder returns an error.
    */
  @js.native
  @Factory
  trait CaptionFormat extends js.Object {
    var Encryption: js.UndefOr[Encryption]
    var Format: js.UndefOr[CaptionFormatFormat]
    var Pattern: js.UndefOr[CaptionFormatPattern]
  }

  /**
    * A source file for the input sidecar captions used during the transcoding process.
    */
  @js.native
  @Factory
  trait CaptionSource extends js.Object {
    var Encryption: js.UndefOr[Encryption]
    var Key: js.UndefOr[LongKey]
    var Label: js.UndefOr[Name]
    var Language: js.UndefOr[Key]
    var TimeOffset: js.UndefOr[TimeOffset]
  }

  /**
    * The captions to be created, if any.
    */
  @js.native
  @Factory
  trait Captions extends js.Object {
    var CaptionFormats: js.UndefOr[CaptionFormats]
    var CaptionSources: js.UndefOr[CaptionSources]
    var MergePolicy: js.UndefOr[CaptionMergePolicy]
  }

  /**
    * Settings for one clip in a composition. All jobs in a playlist must have the same clip settings.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait Clip extends js.Object {
    var TimeSpan: js.UndefOr[TimeSpan]
  }

  /**
    * The <code>CreateJobOutput</code> structure.
    */
  @js.native
  @Factory
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

  /**
    * Information about the master playlist.
    */
  @js.native
  @Factory
  trait CreateJobPlaylist extends js.Object {
    var Format: js.UndefOr[PlaylistFormat]
    var HlsContentProtection: js.UndefOr[HlsContentProtection]
    var Name: js.UndefOr[Filename]
    var OutputKeys: js.UndefOr[OutputKeys]
    var PlayReadyDrm: js.UndefOr[PlayReadyDrm]
  }

  /**
    * The <code>CreateJobRequest</code> structure.
    */
  @js.native
  @Factory
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

  /**
    * The CreateJobResponse structure.
    */
  @js.native
  @Factory
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  /**
    * The <code>CreatePipelineRequest</code> structure.
    */
  @js.native
  @Factory
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

  /**
    * When you create a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  @js.native
  @Factory
  trait CreatePipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  /**
    * The <code>CreatePresetRequest</code> structure.
    */
  @js.native
  @Factory
  trait CreatePresetRequest extends js.Object {
    var Container: PresetContainer
    var Name: Name
    var Audio: js.UndefOr[AudioParameters]
    var Description: js.UndefOr[Description]
    var Thumbnails: js.UndefOr[Thumbnails]
    var Video: js.UndefOr[VideoParameters]
  }

  /**
    * The <code>CreatePresetResponse</code> structure.
    */
  @js.native
  @Factory
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
    var Warning: js.UndefOr[String]
  }

  /**
    * The <code>DeletePipelineRequest</code> structure.
    */
  @js.native
  @Factory
  trait DeletePipelineRequest extends js.Object {
    var Id: Id
  }

  /**
    * The <code>DeletePipelineResponse</code> structure.
    */
  @js.native
  @Factory
  trait DeletePipelineResponse extends js.Object {}

  /**
    * The <code>DeletePresetRequest</code> structure.
    */
  @js.native
  @Factory
  trait DeletePresetRequest extends js.Object {
    var Id: Id
  }

  /**
    * The <code>DeletePresetResponse</code> structure.
    */
  @js.native
  @Factory
  trait DeletePresetResponse extends js.Object {}

  /**
    * The detected properties of the input file. Elastic Transcoder identifies these values from the input file.
    */
  @js.native
  @Factory
  trait DetectedProperties extends js.Object {
    var DurationMillis: js.UndefOr[NullableLong]
    var FileSize: js.UndefOr[NullableLong]
    var FrameRate: js.UndefOr[FloatString]
    var Height: js.UndefOr[NullableInteger]
    var Width: js.UndefOr[NullableInteger]
  }

  /**
    * The encryption settings, if any, that are used for decrypting your input files or encrypting your output files. If your input file is encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file, otherwise you must specify the mode you want Elastic Transcoder to use to encrypt your output files.
    */
  @js.native
  @Factory
  trait Encryption extends js.Object {
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Key: js.UndefOr[Base64EncodedString]
    var KeyMd5: js.UndefOr[Base64EncodedString]
    var Mode: js.UndefOr[EncryptionMode]
  }

  /**
    * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to your output files.
    */
  @js.native
  @Factory
  trait HlsContentProtection extends js.Object {
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Key: js.UndefOr[Base64EncodedString]
    var KeyMd5: js.UndefOr[Base64EncodedString]
    var KeyStoragePolicy: js.UndefOr[KeyStoragePolicy]
    var LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String]
    var Method: js.UndefOr[HlsContentProtectionMethod]
  }

  /**
    * The captions to be created, if any.
    */
  @js.native
  @Factory
  trait InputCaptions extends js.Object {
    var CaptionSources: js.UndefOr[CaptionSources]
    var MergePolicy: js.UndefOr[CaptionMergePolicy]
  }

  /**
    * A section of the response body that provides information about the job that is created.
    */
  @js.native
  @Factory
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

  /**
    * The .jpg or .png file associated with an audio file.
    */
  @js.native
  @Factory
  trait JobAlbumArt extends js.Object {
    var Artwork: js.UndefOr[Artworks]
    var MergePolicy: js.UndefOr[MergePolicy]
  }

  /**
    * Information about the file that you're transcoding.
    */
  @js.native
  @Factory
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

  /**
    * <important> Outputs recommended instead.
    *  </important> If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the <code>Output</code> object lists information about the first output. This duplicates the information that is listed for the first output in the <code>Outputs</code> object.
    */
  @js.native
  @Factory
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

  /**
    * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency.
    */
  @js.native
  @Factory
  trait JobWatermark extends js.Object {
    var Encryption: js.UndefOr[Encryption]
    var InputKey: js.UndefOr[WatermarkKey]
    var PresetWatermarkId: js.UndefOr[PresetWatermarkId]
  }

  /**
    * The <code>ListJobsByPipelineRequest</code> structure.
    */
  @js.native
  @Factory
  trait ListJobsByPipelineRequest extends js.Object {
    var PipelineId: Id
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  /**
    * The <code>ListJobsByPipelineResponse</code> structure.
    */
  @js.native
  @Factory
  trait ListJobsByPipelineResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextPageToken: js.UndefOr[Id]
  }

  /**
    * The <code>ListJobsByStatusRequest</code> structure.
    */
  @js.native
  @Factory
  trait ListJobsByStatusRequest extends js.Object {
    var Status: JobStatus
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  /**
    * The <code>ListJobsByStatusResponse</code> structure.
    */
  @js.native
  @Factory
  trait ListJobsByStatusResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextPageToken: js.UndefOr[Id]
  }

  /**
    * The <code>ListPipelineRequest</code> structure.
    */
  @js.native
  @Factory
  trait ListPipelinesRequest extends js.Object {
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  /**
    * A list of the pipelines associated with the current AWS account.
    */
  @js.native
  @Factory
  trait ListPipelinesResponse extends js.Object {
    var NextPageToken: js.UndefOr[Id]
    var Pipelines: js.UndefOr[Pipelines]
  }

  /**
    * The <code>ListPresetsRequest</code> structure.
    */
  @js.native
  @Factory
  trait ListPresetsRequest extends js.Object {
    var Ascending: js.UndefOr[Ascending]
    var PageToken: js.UndefOr[Id]
  }

  /**
    * The <code>ListPresetsResponse</code> structure.
    */
  @js.native
  @Factory
  trait ListPresetsResponse extends js.Object {
    var NextPageToken: js.UndefOr[Id]
    var Presets: js.UndefOr[Presets]
  }

  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic or topics to notify in order to report job status.
    *  <important> To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
    *  </important>
    */
  @js.native
  @Factory
  trait Notifications extends js.Object {
    var Completed: js.UndefOr[SnsTopic]
    var Error: js.UndefOr[SnsTopic]
    var Progressing: js.UndefOr[SnsTopic]
    var Warning: js.UndefOr[SnsTopic]
  }

  /**
    * The <code>Permission</code> structure.
    */
  @js.native
  @Factory
  trait Permission extends js.Object {
    var Access: js.UndefOr[AccessControls]
    var Grantee: js.UndefOr[Grantee]
    var GranteeType: js.UndefOr[GranteeType]
  }

  /**
    * The pipeline (queue) that is used to manage jobs.
    */
  @js.native
  @Factory
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

  /**
    * The <code>PipelineOutputConfig</code> structure.
    */
  @js.native
  @Factory
  trait PipelineOutputConfig extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Permissions: js.UndefOr[Permissions]
    var StorageClass: js.UndefOr[StorageClass]
  }

  /**
    * The PlayReady DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    *  PlayReady DRM encrypts your media files using <code>aes-ctr</code> encryption.
    *  If you use DRM for an <code>HLSv3</code> playlist, your outputs must have a master playlist.
    */
  @js.native
  @Factory
  trait PlayReadyDrm extends js.Object {
    var Format: js.UndefOr[PlayReadyDrmFormatString]
    var InitializationVector: js.UndefOr[ZeroTo255String]
    var Key: js.UndefOr[NonEmptyBase64EncodedString]
    var KeyId: js.UndefOr[KeyIdGuid]
    var KeyMd5: js.UndefOr[NonEmptyBase64EncodedString]
    var LicenseAcquisitionUrl: js.UndefOr[OneTo512String]
  }

  /**
    * Use Only for Fragmented MP4 or MPEG-TS Outputs. If you specify a preset for which the value of Container is <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. We recommend that you create only one master playlist per output format. The maximum number of master playlists in a job is 30.
    */
  @js.native
  @Factory
  trait Playlist extends js.Object {
    var Format: js.UndefOr[PlaylistFormat]
    var HlsContentProtection: js.UndefOr[HlsContentProtection]
    var Name: js.UndefOr[Filename]
    var OutputKeys: js.UndefOr[OutputKeys]
    var PlayReadyDrm: js.UndefOr[PlayReadyDrm]
    var Status: js.UndefOr[JobStatus]
    var StatusDetail: js.UndefOr[Description]
  }

  /**
    * Presets are templates that contain most of the settings for transcoding media files from one format to another. Elastic Transcoder includes some default presets for common formats, for example, several iPod and iPhone versions. You can also create your own presets for formats that aren't included among the default presets. You specify which preset you want to use when you create a job.
    */
  @js.native
  @Factory
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

  /**
    * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in the specified size and location, and with the specified opacity for the duration of the transcoded video.
    *  Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency.
    *  When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have different dimensions.
    */
  @js.native
  @Factory
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

  /**
    * The <code>ReadJobRequest</code> structure.
    */
  @js.native
  @Factory
  trait ReadJobRequest extends js.Object {
    var Id: Id
  }

  /**
    * The <code>ReadJobResponse</code> structure.
    */
  @js.native
  @Factory
  trait ReadJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  /**
    * The <code>ReadPipelineRequest</code> structure.
    */
  @js.native
  @Factory
  trait ReadPipelineRequest extends js.Object {
    var Id: Id
  }

  /**
    * The <code>ReadPipelineResponse</code> structure.
    */
  @js.native
  @Factory
  trait ReadPipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  /**
    * The <code>ReadPresetRequest</code> structure.
    */
  @js.native
  @Factory
  trait ReadPresetRequest extends js.Object {
    var Id: Id
  }

  /**
    * The <code>ReadPresetResponse</code> structure.
    */
  @js.native
  @Factory
  trait ReadPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  /**
    * The <code>TestRoleRequest</code> structure.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait TestRoleRequest extends js.Object {
    var InputBucket: BucketName
    var OutputBucket: BucketName
    var Role: Role
    var Topics: SnsTopics
  }

  /**
    * The <code>TestRoleResponse</code> structure.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait TestRoleResponse extends js.Object {
    var Messages: js.UndefOr[ExceptionMessages]
    var Success: js.UndefOr[Success]
  }

  /**
    * Thumbnails for videos.
    */
  @js.native
  @Factory
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

  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  @js.native
  @Factory
  trait TimeSpan extends js.Object {
    var Duration: js.UndefOr[Time]
    var StartTime: js.UndefOr[Time]
  }

  /**
    * Details about the timing of a job.
    */
  @js.native
  @Factory
  trait Timing extends js.Object {
    var FinishTimeMillis: js.UndefOr[NullableLong]
    var StartTimeMillis: js.UndefOr[NullableLong]
    var SubmitTimeMillis: js.UndefOr[NullableLong]
  }

  /**
    * The <code>UpdatePipelineNotificationsRequest</code> structure.
    */
  @js.native
  @Factory
  trait UpdatePipelineNotificationsRequest extends js.Object {
    var Id: Id
    var Notifications: Notifications
  }

  /**
    * The <code>UpdatePipelineNotificationsResponse</code> structure.
    */
  @js.native
  @Factory
  trait UpdatePipelineNotificationsResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
  }

  /**
    * The <code>UpdatePipelineRequest</code> structure.
    */
  @js.native
  @Factory
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

  /**
    * When you update a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  @js.native
  @Factory
  trait UpdatePipelineResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
    var Warnings: js.UndefOr[Warnings]
  }

  /**
    * The <code>UpdatePipelineStatusRequest</code> structure.
    */
  @js.native
  @Factory
  trait UpdatePipelineStatusRequest extends js.Object {
    var Id: Id
    var Status: PipelineStatus
  }

  /**
    * When you update status for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  @js.native
  @Factory
  trait UpdatePipelineStatusResponse extends js.Object {
    var Pipeline: js.UndefOr[Pipeline]
  }

  /**
    * The <code>VideoParameters</code> structure.
    */
  @js.native
  @Factory
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

  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline.
    *  Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  @js.native
  @Factory
  trait Warning extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }
}
