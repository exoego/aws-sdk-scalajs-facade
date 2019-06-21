package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mediapackage {
  type AdMarkers                                   = String
  type EncryptionMethod                            = String
  type ManifestLayout                              = String
  type MaxResults                                  = Int
  type PlaylistType                                = String
  type Profile                                     = String
  type SegmentTemplateFormat                       = String
  type StreamOrder                                 = String
  type Tags                                        = js.Dictionary[__string]
  type __PeriodTriggersElement                     = String
  type __boolean                                   = Boolean
  type __integer                                   = Int
  type __listOfChannel                             = js.Array[Channel]
  type __listOfHlsManifest                         = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint                      = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint                      = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement             = js.Array[__PeriodTriggersElement]
  type __listOf__string                            = js.Array[__string]
  type __mapOf__string                             = js.Dictionary[__string]
  type __string                                    = String

  implicit final class MediaPackageOps(val service: MediaPackage) extends AnyVal {

    def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise.toFuture
    def createOriginEndpointFuture(params: CreateOriginEndpointRequest): Future[CreateOriginEndpointResponse] =
      service.createOriginEndpoint(params).promise.toFuture
    def deleteChannelFuture(params: DeleteChannelRequest): Future[DeleteChannelResponse] =
      service.deleteChannel(params).promise.toFuture
    def deleteOriginEndpointFuture(params: DeleteOriginEndpointRequest): Future[DeleteOriginEndpointResponse] =
      service.deleteOriginEndpoint(params).promise.toFuture
    def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise.toFuture
    def describeOriginEndpointFuture(params: DescribeOriginEndpointRequest): Future[DescribeOriginEndpointResponse] =
      service.describeOriginEndpoint(params).promise.toFuture
    def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise.toFuture
    def listOriginEndpointsFuture(params: ListOriginEndpointsRequest): Future[ListOriginEndpointsResponse] =
      service.listOriginEndpoints(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def rotateChannelCredentialsFuture(
        params: RotateChannelCredentialsRequest
    ): Future[RotateChannelCredentialsResponse] = service.rotateChannelCredentials(params).promise.toFuture
    def rotateIngestEndpointCredentialsFuture(
        params: RotateIngestEndpointCredentialsRequest
    ): Future[RotateIngestEndpointCredentialsResponse] =
      service.rotateIngestEndpointCredentials(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] =
      service.updateChannel(params).promise.toFuture
    def updateOriginEndpointFuture(params: UpdateOriginEndpointRequest): Future[UpdateOriginEndpointResponse] =
      service.updateOriginEndpoint(params).promise.toFuture
  }
}

package mediapackage {
  @js.native
  @JSImport("aws-sdk", "MediaPackage")
  class MediaPackage() extends js.Object {
    def this(config: AWSConfig) = this()

    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse]                      = js.native
    def createOriginEndpoint(params: CreateOriginEndpointRequest): Request[CreateOriginEndpointResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse]                      = js.native
    def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): Request[DeleteOriginEndpointResponse] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse]                = js.native
    def describeOriginEndpoint(params: DescribeOriginEndpointRequest): Request[DescribeOriginEndpointResponse] =
      js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse]                      = js.native
    def listOriginEndpoints(params: ListOriginEndpointsRequest): Request[ListOriginEndpointsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def rotateChannelCredentials(params: RotateChannelCredentialsRequest): Request[RotateChannelCredentialsResponse] =
      js.native
    def rotateIngestEndpointCredentials(
        params: RotateIngestEndpointCredentialsRequest
    ): Request[RotateIngestEndpointCredentialsResponse]                                                  = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse]                      = js.native
    def updateOriginEndpoint(params: UpdateOriginEndpointRequest): Request[UpdateOriginEndpointResponse] = js.native
  }

  object AdMarkersEnum {
    val NONE            = "NONE"
    val SCTE35_ENHANCED = "SCTE35_ENHANCED"
    val PASSTHROUGH     = "PASSTHROUGH"

    val values = IndexedSeq(NONE, SCTE35_ENHANCED, PASSTHROUGH)
  }

  /**
    * A Channel resource configuration.
    */
  @js.native
  trait Channel extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object Channel {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsIngest" -> HlsIngest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
    }
  }

  /**
    * A Common Media Application Format (CMAF) encryption configuration.
    */
  @js.native
  trait CmafEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
  }

  object CmafEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    ): CmafEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any],
        "KeyRotationIntervalSeconds" -> KeyRotationIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafEncryption]
    }
  }

  /**
    * A Common Media Application Format (CMAF) packaging configuration.
    */
  @js.native
  trait CmafPackage extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifest]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object CmafPackage {
    def apply(
        Encryption: js.UndefOr[CmafEncryption] = js.undefined,
        HlsManifests: js.UndefOr[__listOfHlsManifest] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentPrefix: js.UndefOr[__string] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): CmafPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsManifests" -> HlsManifests.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentPrefix" -> SegmentPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSelection" -> StreamSelection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafPackage]
    }
  }

  /**
    * A Common Media Application Format (CMAF) packaging configuration.
    */
  @js.native
  trait CmafPackageCreateOrUpdateParameters extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object CmafPackageCreateOrUpdateParameters {
    def apply(
        Encryption: js.UndefOr[CmafEncryption] = js.undefined,
        HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentPrefix: js.UndefOr[__string] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): CmafPackageCreateOrUpdateParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsManifests" -> HlsManifests.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentPrefix" -> SegmentPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSelection" -> StreamSelection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafPackageCreateOrUpdateParameters]
    }
  }

  /**
    * A new Channel configuration.
    */
  @js.native
  trait CreateChannelRequest extends js.Object {
    var Id: __string
    var Description: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateChannelRequest {
    def apply(
        Id: __string,
        Description: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateChannelResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsIngest" -> HlsIngest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelResponse]
    }
  }

  /**
    * Configuration parameters used to create a new OriginEndpoint.
    */
  @js.native
  trait CreateOriginEndpointRequest extends js.Object {
    var ChannelId: __string
    var Id: __string
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object CreateOriginEndpointRequest {
    def apply(
        ChannelId: __string,
        Id: __string,
        CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): CreateOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any],
        "Id"        -> Id.asInstanceOf[js.Any],
        "CmafPackage" -> CmafPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashPackage" -> DashPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsPackage" -> HlsPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MssPackage" -> MssPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Whitelist" -> Whitelist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOriginEndpointRequest]
    }
  }

  @js.native
  trait CreateOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object CreateOriginEndpointResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): CreateOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelId" -> ChannelId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CmafPackage" -> CmafPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashPackage" -> DashPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsPackage" -> HlsPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MssPackage" -> MssPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Whitelist" -> Whitelist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOriginEndpointResponse]
    }
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
    */
  @js.native
  trait DashEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
  }

  object DashEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    ): DashEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any],
        "KeyRotationIntervalSeconds" -> KeyRotationIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashEncryption]
    }
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
    */
  @js.native
  trait DashPackage extends js.Object {
    var Encryption: js.UndefOr[DashEncryption]
    var ManifestLayout: js.UndefOr[ManifestLayout]
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var MinUpdatePeriodSeconds: js.UndefOr[__integer]
    var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement]
    var Profile: js.UndefOr[Profile]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat]
    var StreamSelection: js.UndefOr[StreamSelection]
    var SuggestedPresentationDelaySeconds: js.UndefOr[__integer]
  }

  object DashPackage {
    def apply(
        Encryption: js.UndefOr[DashEncryption] = js.undefined,
        ManifestLayout: js.UndefOr[ManifestLayout] = js.undefined,
        ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
        MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
        MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined,
        PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.undefined,
        Profile: js.UndefOr[Profile] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
        SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined
    ): DashPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestLayout" -> ManifestLayout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestWindowSeconds" -> ManifestWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinBufferTimeSeconds" -> MinBufferTimeSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinUpdatePeriodSeconds" -> MinUpdatePeriodSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PeriodTriggers" -> PeriodTriggers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Profile" -> Profile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentTemplateFormat" -> SegmentTemplateFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSelection" -> StreamSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SuggestedPresentationDelaySeconds" -> SuggestedPresentationDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashPackage]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var Id: __string
  }

  object DeleteChannelRequest {
    def apply(
        Id: __string
    ): DeleteChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteChannelResponse extends js.Object {}

  object DeleteChannelResponse {
    def apply(
        ): DeleteChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelResponse]
    }
  }

  @js.native
  trait DeleteOriginEndpointRequest extends js.Object {
    var Id: __string
  }

  object DeleteOriginEndpointRequest {
    def apply(
        Id: __string
    ): DeleteOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOriginEndpointRequest]
    }
  }

  @js.native
  trait DeleteOriginEndpointResponse extends js.Object {}

  object DeleteOriginEndpointResponse {
    def apply(
        ): DeleteOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOriginEndpointResponse]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var Id: __string
  }

  object DescribeChannelRequest {
    def apply(
        Id: __string
    ): DescribeChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeChannelResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsIngest" -> HlsIngest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeOriginEndpointRequest extends js.Object {
    var Id: __string
  }

  object DescribeOriginEndpointRequest {
    def apply(
        Id: __string
    ): DescribeOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOriginEndpointRequest]
    }
  }

  @js.native
  trait DescribeOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object DescribeOriginEndpointResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): DescribeOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelId" -> ChannelId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CmafPackage" -> CmafPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashPackage" -> DashPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsPackage" -> HlsPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MssPackage" -> MssPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Whitelist" -> Whitelist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOriginEndpointResponse]
    }
  }

  object EncryptionMethodEnum {
    val AES_128    = "AES_128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = IndexedSeq(AES_128, SAMPLE_AES)
  }

  /**
    * An HTTP Live Streaming (HLS) encryption configuration.
    */
  @js.native
  trait HlsEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var ConstantInitializationVector: js.UndefOr[__string]
    var EncryptionMethod: js.UndefOr[EncryptionMethod]
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
    var RepeatExtXKey: js.UndefOr[__boolean]
  }

  object HlsEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        EncryptionMethod: js.UndefOr[EncryptionMethod] = js.undefined,
        KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        RepeatExtXKey: js.UndefOr[__boolean] = js.undefined
    ): HlsEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any],
        "ConstantInitializationVector" -> ConstantInitializationVector.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptionMethod" -> EncryptionMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyRotationIntervalSeconds" -> KeyRotationIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RepeatExtXKey" -> RepeatExtXKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsEncryption]
    }
  }

  /**
    * An HTTP Live Streaming (HLS) ingest resource configuration.
    */
  @js.native
  trait HlsIngest extends js.Object {
    var IngestEndpoints: js.UndefOr[__listOfIngestEndpoint]
  }

  object HlsIngest {
    def apply(
        IngestEndpoints: js.UndefOr[__listOfIngestEndpoint] = js.undefined
    ): HlsIngest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IngestEndpoints" -> IngestEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsIngest]
    }
  }

  /**
    * A HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  trait HlsManifest extends js.Object {
    var Id: __string
    var AdMarkers: js.UndefOr[AdMarkers]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
  }

  object HlsManifest {
    def apply(
        Id: __string,
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
        PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): HlsManifest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AdMarkers" -> AdMarkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeIframeOnlyStream" -> IncludeIframeOnlyStream.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaylistType" -> PlaylistType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaylistWindowSeconds" -> PlaylistWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramDateTimeIntervalSeconds" -> ProgramDateTimeIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsManifest]
    }
  }

  /**
    * A HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  trait HlsManifestCreateOrUpdateParameters extends js.Object {
    var Id: __string
    var AdMarkers: js.UndefOr[AdMarkers]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
  }

  object HlsManifestCreateOrUpdateParameters {
    def apply(
        Id: __string,
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
        PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined
    ): HlsManifestCreateOrUpdateParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AdMarkers" -> AdMarkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeIframeOnlyStream" -> IncludeIframeOnlyStream.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaylistType" -> PlaylistType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaylistWindowSeconds" -> PlaylistWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramDateTimeIntervalSeconds" -> ProgramDateTimeIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsManifestCreateOrUpdateParameters]
    }
  }

  /**
    * An HTTP Live Streaming (HLS) packaging configuration.
    */
  @js.native
  trait HlsPackage extends js.Object {
    var AdMarkers: js.UndefOr[AdMarkers]
    var Encryption: js.UndefOr[HlsEncryption]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
    var UseAudioRenditionGroup: js.UndefOr[__boolean]
  }

  object HlsPackage {
    def apply(
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        Encryption: js.UndefOr[HlsEncryption] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
        PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
        UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
    ): HlsPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdMarkers" -> AdMarkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeIframeOnlyStream" -> IncludeIframeOnlyStream.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaylistType" -> PlaylistType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaylistWindowSeconds" -> PlaylistWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramDateTimeIntervalSeconds" -> ProgramDateTimeIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSelection" -> StreamSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseAudioRenditionGroup" -> UseAudioRenditionGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsPackage]
    }
  }

  /**
    * An endpoint for ingesting source content for a Channel.
    */
  @js.native
  trait IngestEndpoint extends js.Object {
    var Id: js.UndefOr[__string]
    var Password: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object IngestEndpoint {
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): IngestEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IngestEndpoint]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[__listOfChannel]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsResponse {
    def apply(
        Channels: js.UndefOr[__listOfChannel] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Channels" -> Channels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListOriginEndpointsRequest extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListOriginEndpointsRequest {
    def apply(
        ChannelId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListOriginEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOriginEndpointsRequest]
    }
  }

  @js.native
  trait ListOriginEndpointsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var OriginEndpoints: js.UndefOr[__listOfOriginEndpoint]
  }

  object ListOriginEndpointsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        OriginEndpoints: js.UndefOr[__listOfOriginEndpoint] = js.undefined
    ): ListOriginEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OriginEndpoints" -> OriginEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOriginEndpointsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object ManifestLayoutEnum {
    val FULL    = "FULL"
    val COMPACT = "COMPACT"

    val values = IndexedSeq(FULL, COMPACT)
  }

  /**
    * A Microsoft Smooth Streaming (MSS) encryption configuration.
    */
  @js.native
  trait MssEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  object MssEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): MssEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MssEncryption]
    }
  }

  /**
    * A Microsoft Smooth Streaming (MSS) packaging configuration.
    */
  @js.native
  trait MssPackage extends js.Object {
    var Encryption: js.UndefOr[MssEncryption]
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object MssPackage {
    def apply(
        Encryption: js.UndefOr[MssEncryption] = js.undefined,
        ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): MssPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestWindowSeconds" -> ManifestWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSelection" -> StreamSelection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MssPackage]
    }
  }

  /**
    * An OriginEndpoint resource configuration.
    */
  @js.native
  trait OriginEndpoint extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object OriginEndpoint {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): OriginEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelId" -> ChannelId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CmafPackage" -> CmafPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashPackage" -> DashPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsPackage" -> HlsPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MssPackage" -> MssPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Whitelist" -> Whitelist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginEndpoint]
    }
  }

  object PlaylistTypeEnum {
    val NONE  = "NONE"
    val EVENT = "EVENT"
    val VOD   = "VOD"

    val values = IndexedSeq(NONE, EVENT, VOD)
  }

  object ProfileEnum {
    val NONE      = "NONE"
    val HBBTV_1_5 = "HBBTV_1_5"

    val values = IndexedSeq(NONE, HBBTV_1_5)
  }

  @deprecated
  @js.native
  trait RotateChannelCredentialsRequest extends js.Object {
    var Id: __string
  }

  object RotateChannelCredentialsRequest {
    def apply(
        Id: __string
    ): RotateChannelCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateChannelCredentialsRequest]
    }
  }

  @deprecated
  @js.native
  trait RotateChannelCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object RotateChannelCredentialsResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RotateChannelCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsIngest" -> HlsIngest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateChannelCredentialsResponse]
    }
  }

  @js.native
  trait RotateIngestEndpointCredentialsRequest extends js.Object {
    var Id: __string
    var IngestEndpointId: __string
  }

  object RotateIngestEndpointCredentialsRequest {
    def apply(
        Id: __string,
        IngestEndpointId: __string
    ): RotateIngestEndpointCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"               -> Id.asInstanceOf[js.Any],
        "IngestEndpointId" -> IngestEndpointId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateIngestEndpointCredentialsRequest]
    }
  }

  @js.native
  trait RotateIngestEndpointCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object RotateIngestEndpointCredentialsResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RotateIngestEndpointCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsIngest" -> HlsIngest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateIngestEndpointCredentialsResponse]
    }
  }

  object SegmentTemplateFormatEnum {
    val NUMBER_WITH_TIMELINE = "NUMBER_WITH_TIMELINE"
    val TIME_WITH_TIMELINE   = "TIME_WITH_TIMELINE"

    val values = IndexedSeq(NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE)
  }

  /**
    * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
    */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var ResourceId: __string
    var RoleArn: __string
    var SystemIds: __listOf__string
    var Url: __string
    var CertificateArn: js.UndefOr[__string]
  }

  object SpekeKeyProvider {
    def apply(
        ResourceId: __string,
        RoleArn: __string,
        SystemIds: __listOf__string,
        Url: __string,
        CertificateArn: js.UndefOr[__string] = js.undefined
    ): SpekeKeyProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "RoleArn"    -> RoleArn.asInstanceOf[js.Any],
        "SystemIds"  -> SystemIds.asInstanceOf[js.Any],
        "Url"        -> Url.asInstanceOf[js.Any],
        "CertificateArn" -> CertificateArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpekeKeyProvider]
    }
  }

  object StreamOrderEnum {
    val ORIGINAL                 = "ORIGINAL"
    val VIDEO_BITRATE_ASCENDING  = "VIDEO_BITRATE_ASCENDING"
    val VIDEO_BITRATE_DESCENDING = "VIDEO_BITRATE_DESCENDING"

    val values = IndexedSeq(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
  }

  /**
    * A StreamSelection configuration.
    */
  @js.native
  trait StreamSelection extends js.Object {
    var MaxVideoBitsPerSecond: js.UndefOr[__integer]
    var MinVideoBitsPerSecond: js.UndefOr[__integer]
    var StreamOrder: js.UndefOr[StreamOrder]
  }

  object StreamSelection {
    def apply(
        MaxVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
        MinVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
        StreamOrder: js.UndefOr[StreamOrder] = js.undefined
    ): StreamSelection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxVideoBitsPerSecond" -> MaxVideoBitsPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinVideoBitsPerSecond" -> MinVideoBitsPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamOrder" -> StreamOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSelection]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * Configuration parameters used to update the Channel.
    */
  @js.native
  trait UpdateChannelRequest extends js.Object {
    var Id: __string
    var Description: js.UndefOr[__string]
  }

  object UpdateChannelRequest {
    def apply(
        Id: __string,
        Description: js.UndefOr[__string] = js.undefined
    ): UpdateChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateChannelResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsIngest" -> HlsIngest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelResponse]
    }
  }

  /**
    * Configuration parameters used to update an existing OriginEndpoint.
    */
  @js.native
  trait UpdateOriginEndpointRequest extends js.Object {
    var Id: __string
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object UpdateOriginEndpointRequest {
    def apply(
        Id: __string,
        CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "CmafPackage" -> CmafPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashPackage" -> DashPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsPackage" -> HlsPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MssPackage" -> MssPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Whitelist" -> Whitelist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOriginEndpointRequest]
    }
  }

  @js.native
  trait UpdateOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object UpdateOriginEndpointResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelId" -> ChannelId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CmafPackage" -> CmafPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashPackage" -> DashPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsPackage" -> HlsPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestName" -> ManifestName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MssPackage" -> MssPackage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Whitelist" -> Whitelist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOriginEndpointResponse]
    }
  }

  object __PeriodTriggersElementEnum {
    val ADS = "ADS"

    val values = IndexedSeq(ADS)
  }
}
