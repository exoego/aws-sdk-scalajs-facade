package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object elastictranscoder {
  type AccessControl               = String
  type AccessControls              = js.Array[AccessControl]
  type Artworks                    = js.Array[Artwork]
  type Ascending                   = String
  type AspectRatio                 = String
  type AudioBitDepth               = String
  type AudioBitOrder               = String
  type AudioBitRate                = String
  type AudioChannels               = String
  type AudioCodec                  = String
  type AudioCodecProfile           = String
  type AudioPackingMode            = String
  type AudioSampleRate             = String
  type AudioSigned                 = String
  type Base64EncodedString         = String
  type BucketName                  = String
  type CaptionFormatFormat         = String
  type CaptionFormatPattern        = String
  type CaptionFormats              = js.Array[CaptionFormat]
  type CaptionMergePolicy          = String
  type CaptionSources              = js.Array[CaptionSource]
  type CodecOption                 = String
  type CodecOptions                = js.Dictionary[CodecOption]
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
    def testRole(params: TestRoleRequest): Request[TestRoleResponse]                               = js.native
    def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse]             = js.native
    def updatePipelineNotifications(
        params: UpdatePipelineNotificationsRequest
    ): Request[UpdatePipelineNotificationsResponse]                                                      = js.native
    def updatePipelineStatus(params: UpdatePipelineStatusRequest): Request[UpdatePipelineStatusResponse] = js.native
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
    def apply(AlbumArtFormat: js.UndefOr[JpgOrPng] = js.undefined,
              Encryption: js.UndefOr[Encryption] = js.undefined,
              InputKey: js.UndefOr[WatermarkKey] = js.undefined,
              MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
              MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
              PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
              SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined): Artwork = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlbumArtFormat" -> AlbumArtFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputKey" -> InputKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxHeight" -> MaxHeight.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxWidth" -> MaxWidth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaddingPolicy" -> PaddingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizingPolicy" -> SizingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Artwork]
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
    def apply(BitDepth: js.UndefOr[AudioBitDepth] = js.undefined,
              BitOrder: js.UndefOr[AudioBitOrder] = js.undefined,
              Profile: js.UndefOr[AudioCodecProfile] = js.undefined,
              Signed: js.UndefOr[AudioSigned] = js.undefined): AudioCodecOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BitDepth" -> BitDepth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BitOrder" -> BitOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Profile" -> Profile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Signed" -> Signed.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioCodecOptions]
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
    def apply(AudioPackingMode: js.UndefOr[AudioPackingMode] = js.undefined,
              BitRate: js.UndefOr[AudioBitRate] = js.undefined,
              Channels: js.UndefOr[AudioChannels] = js.undefined,
              Codec: js.UndefOr[AudioCodec] = js.undefined,
              CodecOptions: js.UndefOr[AudioCodecOptions] = js.undefined,
              SampleRate: js.UndefOr[AudioSampleRate] = js.undefined): AudioParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioPackingMode" -> AudioPackingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BitRate" -> BitRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Channels" -> Channels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodecOptions" -> CodecOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SampleRate" -> SampleRate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioParameters]
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
    def apply(Id: Id): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  /**
    * The response body contains a JSON object. If the job is successfully canceled, the value of <code>Success</code> is <code>true</code>.
    */
  @js.native
  trait CancelJobResponse extends js.Object {}

  object CancelJobResponse {
    def apply(): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
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
    def apply(Encryption: js.UndefOr[Encryption] = js.undefined,
              Format: js.UndefOr[CaptionFormatFormat] = js.undefined,
              Pattern: js.UndefOr[CaptionFormatPattern] = js.undefined): CaptionFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pattern" -> Pattern.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionFormat]
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
    def apply(Encryption: js.UndefOr[Encryption] = js.undefined,
              Key: js.UndefOr[LongKey] = js.undefined,
              Label: js.UndefOr[Name] = js.undefined,
              Language: js.UndefOr[Key] = js.undefined,
              TimeOffset: js.UndefOr[TimeOffset] = js.undefined): CaptionSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Label" -> Label.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Language" -> Language.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeOffset" -> TimeOffset.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionSource]
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
    def apply(CaptionFormats: js.UndefOr[CaptionFormats] = js.undefined,
              CaptionSources: js.UndefOr[CaptionSources] = js.undefined,
              MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined): Captions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptionFormats" -> CaptionFormats.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionSources" -> CaptionSources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MergePolicy" -> MergePolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Captions]
    }
  }

  /**
    * Settings for one clip in a composition. All jobs in a playlist must have the same clip settings.
    */
  @deprecated
  @js.native
  trait Clip extends js.Object {
    var TimeSpan: js.UndefOr[TimeSpan]
  }

  object Clip {
    def apply(TimeSpan: js.UndefOr[TimeSpan] = js.undefined): Clip = {
      val _fields = IndexedSeq[(String, js.Any)]("TimeSpan" -> TimeSpan.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Clip]
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
    def apply(AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined,
              Captions: js.UndefOr[Captions] = js.undefined,
              Composition: js.UndefOr[Composition] = js.undefined,
              Encryption: js.UndefOr[Encryption] = js.undefined,
              Key: js.UndefOr[Key] = js.undefined,
              PresetId: js.UndefOr[Id] = js.undefined,
              Rotate: js.UndefOr[Rotate] = js.undefined,
              SegmentDuration: js.UndefOr[FloatString] = js.undefined,
              ThumbnailEncryption: js.UndefOr[Encryption] = js.undefined,
              ThumbnailPattern: js.UndefOr[ThumbnailPattern] = js.undefined,
              Watermarks: js.UndefOr[JobWatermarks] = js.undefined): CreateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlbumArt" -> AlbumArt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Captions" -> Captions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Composition" -> Composition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PresetId" -> PresetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rotate" -> Rotate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDuration" -> SegmentDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailEncryption" -> ThumbnailEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailPattern" -> ThumbnailPattern.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Watermarks" -> Watermarks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobOutput]
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
    def apply(Format: js.UndefOr[PlaylistFormat] = js.undefined,
              HlsContentProtection: js.UndefOr[HlsContentProtection] = js.undefined,
              Name: js.UndefOr[Filename] = js.undefined,
              OutputKeys: js.UndefOr[OutputKeys] = js.undefined,
              PlayReadyDrm: js.UndefOr[PlayReadyDrm] = js.undefined): CreateJobPlaylist = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsContentProtection" -> HlsContentProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputKeys" -> OutputKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayReadyDrm" -> PlayReadyDrm.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobPlaylist]
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
    def apply(PipelineId: Id,
              Input: js.UndefOr[JobInput] = js.undefined,
              Inputs: js.UndefOr[JobInputs] = js.undefined,
              Output: js.UndefOr[CreateJobOutput] = js.undefined,
              OutputKeyPrefix: js.UndefOr[Key] = js.undefined,
              Outputs: js.UndefOr[CreateJobOutputs] = js.undefined,
              Playlists: js.UndefOr[CreateJobPlaylists] = js.undefined,
              UserMetadata: js.UndefOr[UserMetadata] = js.undefined): CreateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PipelineId" -> PipelineId.asInstanceOf[js.Any],
        "Input" -> Input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Inputs" -> Inputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Output" -> Output.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputKeyPrefix" -> OutputKeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Outputs" -> Outputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Playlists" -> Playlists.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserMetadata" -> UserMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
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
    def apply(Job: js.UndefOr[Job] = js.undefined): CreateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Job" -> Job.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResponse]
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
    def apply(InputBucket: BucketName,
              Name: Name,
              Role: Role,
              AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
              ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
              Notifications: js.UndefOr[Notifications] = js.undefined,
              OutputBucket: js.UndefOr[BucketName] = js.undefined,
              ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined): CreatePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputBucket" -> InputBucket.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "Role"        -> Role.asInstanceOf[js.Any],
        "AwsKmsKeyArn" -> AwsKmsKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContentConfig" -> ContentConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Notifications" -> Notifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputBucket" -> OutputBucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailConfig" -> ThumbnailConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineRequest]
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
    def apply(Pipeline: js.UndefOr[Pipeline] = js.undefined,
              Warnings: js.UndefOr[Warnings] = js.undefined): CreatePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Pipeline" -> Pipeline.map { x =>
        x.asInstanceOf[js.Any]
      }, "Warnings" -> Warnings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineResponse]
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
    def apply(Container: PresetContainer,
              Name: Name,
              Audio: js.UndefOr[AudioParameters] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              Thumbnails: js.UndefOr[Thumbnails] = js.undefined,
              Video: js.UndefOr[VideoParameters] = js.undefined): CreatePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Container" -> Container.asInstanceOf[js.Any],
        "Name"      -> Name.asInstanceOf[js.Any],
        "Audio" -> Audio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Thumbnails" -> Thumbnails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Video" -> Video.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresetRequest]
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
    def apply(Preset: js.UndefOr[Preset] = js.undefined,
              Warning: js.UndefOr[String] = js.undefined): CreatePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Preset" -> Preset.map { x =>
        x.asInstanceOf[js.Any]
      }, "Warning" -> Warning.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresetResponse]
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
    def apply(Id: Id): DeletePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePipelineRequest]
    }
  }

  /**
    * The <code>DeletePipelineResponse</code> structure.
    */
  @js.native
  trait DeletePipelineResponse extends js.Object {}

  object DeletePipelineResponse {
    def apply(): DeletePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePipelineResponse]
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
    def apply(Id: Id): DeletePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePresetRequest]
    }
  }

  /**
    * The <code>DeletePresetResponse</code> structure.
    */
  @js.native
  trait DeletePresetResponse extends js.Object {}

  object DeletePresetResponse {
    def apply(): DeletePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePresetResponse]
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
    def apply(DurationMillis: js.UndefOr[NullableLong] = js.undefined,
              FileSize: js.UndefOr[NullableLong] = js.undefined,
              FrameRate: js.UndefOr[FloatString] = js.undefined,
              Height: js.UndefOr[NullableInteger] = js.undefined,
              Width: js.UndefOr[NullableInteger] = js.undefined): DetectedProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DurationMillis" -> DurationMillis.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileSize" -> FileSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameRate" -> FrameRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Height" -> Height.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Width" -> Width.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectedProperties]
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
    def apply(InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
              Key: js.UndefOr[Base64EncodedString] = js.undefined,
              KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined,
              Mode: js.UndefOr[EncryptionMode] = js.undefined): Encryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitializationVector" -> InitializationVector.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyMd5" -> KeyMd5.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mode" -> Mode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Encryption]
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
    def apply(InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
              Key: js.UndefOr[Base64EncodedString] = js.undefined,
              KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined,
              KeyStoragePolicy: js.UndefOr[KeyStoragePolicy] = js.undefined,
              LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String] = js.undefined,
              Method: js.UndefOr[HlsContentProtectionMethod] = js.undefined): HlsContentProtection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitializationVector" -> InitializationVector.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyMd5" -> KeyMd5.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyStoragePolicy" -> KeyStoragePolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseAcquisitionUrl" -> LicenseAcquisitionUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Method" -> Method.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsContentProtection]
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
    def apply(CaptionSources: js.UndefOr[CaptionSources] = js.undefined,
              MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined): InputCaptions = {
      val _fields = IndexedSeq[(String, js.Any)]("CaptionSources" -> CaptionSources.map { x =>
        x.asInstanceOf[js.Any]
      }, "MergePolicy" -> MergePolicy.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputCaptions]
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
    def apply(Arn: js.UndefOr[String] = js.undefined,
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
              UserMetadata: js.UndefOr[UserMetadata] = js.undefined): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Input" -> Input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Inputs" -> Inputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Output" -> Output.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputKeyPrefix" -> OutputKeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Outputs" -> Outputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelineId" -> PipelineId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Playlists" -> Playlists.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timing" -> Timing.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserMetadata" -> UserMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
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
    def apply(Artwork: js.UndefOr[Artworks] = js.undefined,
              MergePolicy: js.UndefOr[MergePolicy] = js.undefined): JobAlbumArt = {
      val _fields = IndexedSeq[(String, js.Any)]("Artwork" -> Artwork.map { x =>
        x.asInstanceOf[js.Any]
      }, "MergePolicy" -> MergePolicy.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobAlbumArt]
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
    def apply(AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
              Container: js.UndefOr[JobContainer] = js.undefined,
              DetectedProperties: js.UndefOr[DetectedProperties] = js.undefined,
              Encryption: js.UndefOr[Encryption] = js.undefined,
              FrameRate: js.UndefOr[FrameRate] = js.undefined,
              InputCaptions: js.UndefOr[InputCaptions] = js.undefined,
              Interlaced: js.UndefOr[Interlaced] = js.undefined,
              Key: js.UndefOr[LongKey] = js.undefined,
              Resolution: js.UndefOr[Resolution] = js.undefined,
              TimeSpan: js.UndefOr[TimeSpan] = js.undefined): JobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AspectRatio" -> AspectRatio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Container" -> Container.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetectedProperties" -> DetectedProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameRate" -> FrameRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputCaptions" -> InputCaptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Interlaced" -> Interlaced.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeSpan" -> TimeSpan.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobInput]
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
    def apply(AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined,
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
              Width: js.UndefOr[NullableInteger] = js.undefined): JobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlbumArt" -> AlbumArt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AppliedColorSpaceConversion" -> AppliedColorSpaceConversion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Captions" -> Captions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Composition" -> Composition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationMillis" -> DurationMillis.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileSize" -> FileSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameRate" -> FrameRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Height" -> Height.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PresetId" -> PresetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rotate" -> Rotate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDuration" -> SegmentDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusDetail" -> StatusDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailEncryption" -> ThumbnailEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailPattern" -> ThumbnailPattern.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Watermarks" -> Watermarks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Width" -> Width.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobOutput]
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
    def apply(Encryption: js.UndefOr[Encryption] = js.undefined,
              InputKey: js.UndefOr[WatermarkKey] = js.undefined,
              PresetWatermarkId: js.UndefOr[PresetWatermarkId] = js.undefined): JobWatermark = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputKey" -> InputKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PresetWatermarkId" -> PresetWatermarkId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobWatermark]
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
    def apply(PipelineId: Id,
              Ascending: js.UndefOr[Ascending] = js.undefined,
              PageToken: js.UndefOr[Id] = js.undefined): ListJobsByPipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PipelineId" -> PipelineId.asInstanceOf[js.Any],
        "Ascending" -> Ascending.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageToken" -> PageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByPipelineRequest]
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
    def apply(Jobs: js.UndefOr[Jobs] = js.undefined,
              NextPageToken: js.UndefOr[Id] = js.undefined): ListJobsByPipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Jobs" -> Jobs.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextPageToken" -> NextPageToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByPipelineResponse]
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
    def apply(Status: JobStatus,
              Ascending: js.UndefOr[Ascending] = js.undefined,
              PageToken: js.UndefOr[Id] = js.undefined): ListJobsByStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Status" -> Status.asInstanceOf[js.Any], "Ascending" -> Ascending.map {
        x =>
          x.asInstanceOf[js.Any]
      }, "PageToken" -> PageToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByStatusRequest]
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
    def apply(Jobs: js.UndefOr[Jobs] = js.undefined,
              NextPageToken: js.UndefOr[Id] = js.undefined): ListJobsByStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Jobs" -> Jobs.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextPageToken" -> NextPageToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsByStatusResponse]
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
    def apply(Ascending: js.UndefOr[Ascending] = js.undefined,
              PageToken: js.UndefOr[Id] = js.undefined): ListPipelinesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Ascending" -> Ascending.map { x =>
        x.asInstanceOf[js.Any]
      }, "PageToken" -> PageToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesRequest]
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
    def apply(NextPageToken: js.UndefOr[Id] = js.undefined,
              Pipelines: js.UndefOr[Pipelines] = js.undefined): ListPipelinesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextPageToken" -> NextPageToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Pipelines" -> Pipelines.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesResponse]
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
    def apply(Ascending: js.UndefOr[Ascending] = js.undefined,
              PageToken: js.UndefOr[Id] = js.undefined): ListPresetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Ascending" -> Ascending.map { x =>
        x.asInstanceOf[js.Any]
      }, "PageToken" -> PageToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPresetsRequest]
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
    def apply(NextPageToken: js.UndefOr[Id] = js.undefined,
              Presets: js.UndefOr[Presets] = js.undefined): ListPresetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextPageToken" -> NextPageToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Presets" -> Presets.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPresetsResponse]
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
    def apply(Completed: js.UndefOr[SnsTopic] = js.undefined,
              Error: js.UndefOr[SnsTopic] = js.undefined,
              Progressing: js.UndefOr[SnsTopic] = js.undefined,
              Warning: js.UndefOr[SnsTopic] = js.undefined): Notifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Completed" -> Completed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Error" -> Error.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Progressing" -> Progressing.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Warning" -> Warning.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Notifications]
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
    def apply(Access: js.UndefOr[AccessControls] = js.undefined,
              Grantee: js.UndefOr[Grantee] = js.undefined,
              GranteeType: js.UndefOr[GranteeType] = js.undefined): Permission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Access" -> Access.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Grantee" -> Grantee.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GranteeType" -> GranteeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Permission]
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
    def apply(Arn: js.UndefOr[String] = js.undefined,
              AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
              ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
              Id: js.UndefOr[Id] = js.undefined,
              InputBucket: js.UndefOr[BucketName] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined,
              Notifications: js.UndefOr[Notifications] = js.undefined,
              OutputBucket: js.UndefOr[BucketName] = js.undefined,
              Role: js.UndefOr[Role] = js.undefined,
              Status: js.UndefOr[PipelineStatus] = js.undefined,
              ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined): Pipeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AwsKmsKeyArn" -> AwsKmsKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContentConfig" -> ContentConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputBucket" -> InputBucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Notifications" -> Notifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputBucket" -> OutputBucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailConfig" -> ThumbnailConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Pipeline]
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
    def apply(Bucket: js.UndefOr[BucketName] = js.undefined,
              Permissions: js.UndefOr[Permissions] = js.undefined,
              StorageClass: js.UndefOr[StorageClass] = js.undefined): PipelineOutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Permissions" -> Permissions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageClass" -> StorageClass.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineOutputConfig]
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
    def apply(Format: js.UndefOr[PlayReadyDrmFormatString] = js.undefined,
              InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined,
              Key: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined,
              KeyId: js.UndefOr[KeyIdGuid] = js.undefined,
              KeyMd5: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined,
              LicenseAcquisitionUrl: js.UndefOr[OneTo512String] = js.undefined): PlayReadyDrm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitializationVector" -> InitializationVector.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyId" -> KeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyMd5" -> KeyMd5.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseAcquisitionUrl" -> LicenseAcquisitionUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayReadyDrm]
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
    def apply(Format: js.UndefOr[PlaylistFormat] = js.undefined,
              HlsContentProtection: js.UndefOr[HlsContentProtection] = js.undefined,
              Name: js.UndefOr[Filename] = js.undefined,
              OutputKeys: js.UndefOr[OutputKeys] = js.undefined,
              PlayReadyDrm: js.UndefOr[PlayReadyDrm] = js.undefined,
              Status: js.UndefOr[JobStatus] = js.undefined,
              StatusDetail: js.UndefOr[Description] = js.undefined): Playlist = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsContentProtection" -> HlsContentProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputKeys" -> OutputKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayReadyDrm" -> PlayReadyDrm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusDetail" -> StatusDetail.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Playlist]
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
    def apply(Arn: js.UndefOr[String] = js.undefined,
              Audio: js.UndefOr[AudioParameters] = js.undefined,
              Container: js.UndefOr[PresetContainer] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              Id: js.UndefOr[Id] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined,
              Thumbnails: js.UndefOr[Thumbnails] = js.undefined,
              Type: js.UndefOr[PresetType] = js.undefined,
              Video: js.UndefOr[VideoParameters] = js.undefined): Preset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Audio" -> Audio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Container" -> Container.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Thumbnails" -> Thumbnails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Video" -> Video.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Preset]
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
    def apply(HorizontalAlign: js.UndefOr[HorizontalAlign] = js.undefined,
              HorizontalOffset: js.UndefOr[PixelsOrPercent] = js.undefined,
              Id: js.UndefOr[PresetWatermarkId] = js.undefined,
              MaxHeight: js.UndefOr[PixelsOrPercent] = js.undefined,
              MaxWidth: js.UndefOr[PixelsOrPercent] = js.undefined,
              Opacity: js.UndefOr[Opacity] = js.undefined,
              SizingPolicy: js.UndefOr[WatermarkSizingPolicy] = js.undefined,
              Target: js.UndefOr[Target] = js.undefined,
              VerticalAlign: js.UndefOr[VerticalAlign] = js.undefined,
              VerticalOffset: js.UndefOr[PixelsOrPercent] = js.undefined): PresetWatermark = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HorizontalAlign" -> HorizontalAlign.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HorizontalOffset" -> HorizontalOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxHeight" -> MaxHeight.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxWidth" -> MaxWidth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Opacity" -> Opacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizingPolicy" -> SizingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Target" -> Target.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerticalAlign" -> VerticalAlign.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerticalOffset" -> VerticalOffset.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PresetWatermark]
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
    def apply(Id: Id): ReadJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadJobRequest]
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
    def apply(Job: js.UndefOr[Job] = js.undefined): ReadJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Job" -> Job.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadJobResponse]
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
    def apply(Id: Id): ReadPipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPipelineRequest]
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
    def apply(Pipeline: js.UndefOr[Pipeline] = js.undefined,
              Warnings: js.UndefOr[Warnings] = js.undefined): ReadPipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Pipeline" -> Pipeline.map { x =>
        x.asInstanceOf[js.Any]
      }, "Warnings" -> Warnings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPipelineResponse]
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
    def apply(Id: Id): ReadPresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPresetRequest]
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
    def apply(Preset: js.UndefOr[Preset] = js.undefined): ReadPresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Preset" -> Preset.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReadPresetResponse]
    }
  }

  /**
    * The <code>TestRoleRequest</code> structure.
    */
  @deprecated
  @js.native
  trait TestRoleRequest extends js.Object {
    var InputBucket: BucketName
    var OutputBucket: BucketName
    var Role: Role
    var Topics: SnsTopics
  }

  object TestRoleRequest {
    def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputBucket"  -> InputBucket.asInstanceOf[js.Any],
        "OutputBucket" -> OutputBucket.asInstanceOf[js.Any],
        "Role"         -> Role.asInstanceOf[js.Any],
        "Topics"       -> Topics.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRoleRequest]
    }
  }

  /**
    * The <code>TestRoleResponse</code> structure.
    */
  @deprecated
  @js.native
  trait TestRoleResponse extends js.Object {
    var Messages: js.UndefOr[ExceptionMessages]
    var Success: js.UndefOr[Success]
  }

  object TestRoleResponse {
    def apply(Messages: js.UndefOr[ExceptionMessages] = js.undefined,
              Success: js.UndefOr[Success] = js.undefined): TestRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Messages" -> Messages.map { x =>
        x.asInstanceOf[js.Any]
      }, "Success" -> Success.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRoleResponse]
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
    def apply(AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
              Format: js.UndefOr[JpgOrPng] = js.undefined,
              Interval: js.UndefOr[Digits] = js.undefined,
              MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined,
              MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined,
              PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined,
              Resolution: js.UndefOr[ThumbnailResolution] = js.undefined,
              SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined): Thumbnails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AspectRatio" -> AspectRatio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Interval" -> Interval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxHeight" -> MaxHeight.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxWidth" -> MaxWidth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaddingPolicy" -> PaddingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizingPolicy" -> SizingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Thumbnails]
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
    def apply(Duration: js.UndefOr[Time] = js.undefined, StartTime: js.UndefOr[Time] = js.undefined): TimeSpan = {
      val _fields = IndexedSeq[(String, js.Any)]("Duration" -> Duration.map { x =>
        x.asInstanceOf[js.Any]
      }, "StartTime" -> StartTime.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeSpan]
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
    def apply(FinishTimeMillis: js.UndefOr[NullableLong] = js.undefined,
              StartTimeMillis: js.UndefOr[NullableLong] = js.undefined,
              SubmitTimeMillis: js.UndefOr[NullableLong] = js.undefined): Timing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FinishTimeMillis" -> FinishTimeMillis.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTimeMillis" -> StartTimeMillis.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubmitTimeMillis" -> SubmitTimeMillis.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Timing]
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
    def apply(Id: Id, Notifications: Notifications): UpdatePipelineNotificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"            -> Id.asInstanceOf[js.Any],
        "Notifications" -> Notifications.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineNotificationsRequest]
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
    def apply(Pipeline: js.UndefOr[Pipeline] = js.undefined): UpdatePipelineNotificationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Pipeline" -> Pipeline.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineNotificationsResponse]
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
    def apply(Id: Id,
              AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
              ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined,
              InputBucket: js.UndefOr[BucketName] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined,
              Notifications: js.UndefOr[Notifications] = js.undefined,
              Role: js.UndefOr[Role] = js.undefined,
              ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined): UpdatePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AwsKmsKeyArn" -> AwsKmsKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContentConfig" -> ContentConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputBucket" -> InputBucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Notifications" -> Notifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThumbnailConfig" -> ThumbnailConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineRequest]
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
    def apply(Pipeline: js.UndefOr[Pipeline] = js.undefined,
              Warnings: js.UndefOr[Warnings] = js.undefined): UpdatePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Pipeline" -> Pipeline.map { x =>
        x.asInstanceOf[js.Any]
      }, "Warnings" -> Warnings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineResponse]
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
    def apply(Id: Id, Status: PipelineStatus): UpdatePipelineStatusRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Id" -> Id.asInstanceOf[js.Any], "Status" -> Status.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineStatusRequest]
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
    def apply(Pipeline: js.UndefOr[Pipeline] = js.undefined): UpdatePipelineStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Pipeline" -> Pipeline.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineStatusResponse]
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
    def apply(AspectRatio: js.UndefOr[AspectRatio] = js.undefined,
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
              Watermarks: js.UndefOr[PresetWatermarks] = js.undefined): VideoParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AspectRatio" -> AspectRatio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BitRate" -> BitRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodecOptions" -> CodecOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayAspectRatio" -> DisplayAspectRatio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedGOP" -> FixedGOP.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameRate" -> FrameRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyframesMaxDist" -> KeyframesMaxDist.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxFrameRate" -> MaxFrameRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxHeight" -> MaxHeight.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxWidth" -> MaxWidth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaddingPolicy" -> PaddingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizingPolicy" -> SizingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Watermarks" -> Watermarks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoParameters]
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
    def apply(Code: js.UndefOr[String] = js.undefined, Message: js.UndefOr[String] = js.undefined): Warning = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Warning]
    }
  }
}
