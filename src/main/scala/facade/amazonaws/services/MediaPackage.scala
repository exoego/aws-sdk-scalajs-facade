package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mediapackage {
  type AdMarkers = String
  type EncryptionMethod = String
  type MaxResults = Int
  type PlaylistType = String
  type Profile = String
  type StreamOrder = String
  type __PeriodTriggersElement = String
  type __boolean = Boolean
  type __integer = Int
  type __listOfChannel = js.Array[Channel]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string = js.Array[__string]
  type __string = String
}

package mediapackage {
  @js.native
  @JSImport("aws-sdk", "MediaPackage")
  class MediaPackage(config: AWSConfig) extends js.Object {
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createOriginEndpoint(params: CreateOriginEndpointRequest): Request[CreateOriginEndpointResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse] = js.native
    def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): Request[DeleteOriginEndpointResponse] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse] = js.native
    def describeOriginEndpoint(params: DescribeOriginEndpointRequest): Request[DescribeOriginEndpointResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listOriginEndpoints(params: ListOriginEndpointsRequest): Request[ListOriginEndpointsResponse] = js.native
    def rotateChannelCredentials(params: RotateChannelCredentialsRequest): Request[RotateChannelCredentialsResponse] = js.native
    def rotateIngestEndpointCredentials(params: RotateIngestEndpointCredentialsRequest): Request[RotateIngestEndpointCredentialsResponse] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
    def updateOriginEndpoint(params: UpdateOriginEndpointRequest): Request[UpdateOriginEndpointResponse] = js.native
  }

  object AdMarkersEnum {
    val NONE = "NONE"
    val SCTE35_ENHANCED = "SCTE35_ENHANCED"
    val PASSTHROUGH = "PASSTHROUGH"

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
  }

  object Channel {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HlsIngest" -> HlsIngest.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
    }
  }

  /**
   * A Common Media Application Format (CMAF) encryption configuration.
   */
  @js.native
  trait CmafEncryption extends js.Object {
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object CmafEncryption {
    def apply(
      KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined,
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined): CmafEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyRotationIntervalSeconds" -> KeyRotationIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafEncryption]
    }
  }

  /**
   * A Common Media Application Format (CMAF) packaging configuration.
   */
  @js.native
  trait CmafPackage extends js.Object {
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifest]
  }

  object CmafPackage {
    def apply(
      SegmentPrefix: js.UndefOr[__string] = js.undefined,
      StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
      SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
      Encryption: js.UndefOr[CmafEncryption] = js.undefined,
      HlsManifests: js.UndefOr[__listOfHlsManifest] = js.undefined): CmafPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentPrefix" -> SegmentPrefix.map { x => x.asInstanceOf[js.Any] },
        "StreamSelection" -> StreamSelection.map { x => x.asInstanceOf[js.Any] },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "HlsManifests" -> HlsManifests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafPackage]
    }
  }

  /**
   * A Common Media Application Format (CMAF) packaging configuration.
   */
  @js.native
  trait CmafPackageCreateOrUpdateParameters extends js.Object {
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters]
  }

  object CmafPackageCreateOrUpdateParameters {
    def apply(
      SegmentPrefix: js.UndefOr[__string] = js.undefined,
      StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
      SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
      Encryption: js.UndefOr[CmafEncryption] = js.undefined,
      HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters] = js.undefined): CmafPackageCreateOrUpdateParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentPrefix" -> SegmentPrefix.map { x => x.asInstanceOf[js.Any] },
        "StreamSelection" -> StreamSelection.map { x => x.asInstanceOf[js.Any] },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "HlsManifests" -> HlsManifests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafPackageCreateOrUpdateParameters]
    }
  }

  /**
   * A new Channel configuration.
   */
  @js.native
  trait CreateChannelRequest extends js.Object {
    var Description: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  object CreateChannelRequest {
    def apply(
      Description: js.UndefOr[__string] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): CreateChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
  }

  object CreateChannelResponse {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): CreateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HlsIngest" -> HlsIngest.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelResponse]
    }
  }

  /**
   * Configuration parameters used to create a new OriginEndpoint.
   */
  @js.native
  trait CreateOriginEndpointRequest extends js.Object {
    var Id: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var ManifestName: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Description: js.UndefOr[__string]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var HlsPackage: js.UndefOr[HlsPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Whitelist: js.UndefOr[__listOf__string]
    var TimeDelaySeconds: js.UndefOr[__integer]
  }

  object CreateOriginEndpointRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      ChannelId: js.UndefOr[__string] = js.undefined,
      MssPackage: js.UndefOr[MssPackage] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
      HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
      DashPackage: js.UndefOr[DashPackage] = js.undefined,
      Whitelist: js.UndefOr[__listOf__string] = js.undefined,
      TimeDelaySeconds: js.UndefOr[__integer] = js.undefined): CreateOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CmafPackage" -> CmafPackage.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "ChannelId" -> ChannelId.map { x => x.asInstanceOf[js.Any] },
        "MssPackage" -> MssPackage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "HlsPackage" -> HlsPackage.map { x => x.asInstanceOf[js.Any] },
        "DashPackage" -> DashPackage.map { x => x.asInstanceOf[js.Any] },
        "Whitelist" -> Whitelist.map { x => x.asInstanceOf[js.Any] },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOriginEndpointRequest]
    }
  }

  @js.native
  trait CreateOriginEndpointResponse extends js.Object {
    var Id: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var ManifestName: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Description: js.UndefOr[__string]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Arn: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
    var TimeDelaySeconds: js.UndefOr[__integer]
  }

  object CreateOriginEndpointResponse {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      ChannelId: js.UndefOr[__string] = js.undefined,
      MssPackage: js.UndefOr[MssPackage] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
      Arn: js.UndefOr[__string] = js.undefined,
      HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
      DashPackage: js.UndefOr[DashPackage] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined,
      Whitelist: js.UndefOr[__listOf__string] = js.undefined,
      TimeDelaySeconds: js.UndefOr[__integer] = js.undefined): CreateOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CmafPackage" -> CmafPackage.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "ChannelId" -> ChannelId.map { x => x.asInstanceOf[js.Any] },
        "MssPackage" -> MssPackage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "HlsPackage" -> HlsPackage.map { x => x.asInstanceOf[js.Any] },
        "DashPackage" -> DashPackage.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "Whitelist" -> Whitelist.map { x => x.asInstanceOf[js.Any] },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOriginEndpointResponse]
    }
  }

  /**
   * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
   */
  @js.native
  trait DashEncryption extends js.Object {
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object DashEncryption {
    def apply(
      KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined,
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined): DashEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyRotationIntervalSeconds" -> KeyRotationIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashEncryption]
    }
  }

  /**
   * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
   */
  @js.native
  trait DashPackage extends js.Object {
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var MinUpdatePeriodSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var Profile: js.UndefOr[Profile]
    var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement]
    var SuggestedPresentationDelaySeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var Encryption: js.UndefOr[DashEncryption]
  }

  object DashPackage {
    def apply(
      ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
      MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined,
      StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
      MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
      Profile: js.UndefOr[Profile] = js.undefined,
      PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.undefined,
      SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined,
      SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
      Encryption: js.UndefOr[DashEncryption] = js.undefined): DashPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManifestWindowSeconds" -> ManifestWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "MinUpdatePeriodSeconds" -> MinUpdatePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "StreamSelection" -> StreamSelection.map { x => x.asInstanceOf[js.Any] },
        "MinBufferTimeSeconds" -> MinBufferTimeSeconds.map { x => x.asInstanceOf[js.Any] },
        "Profile" -> Profile.map { x => x.asInstanceOf[js.Any] },
        "PeriodTriggers" -> PeriodTriggers.map { x => x.asInstanceOf[js.Any] },
        "SuggestedPresentationDelaySeconds" -> SuggestedPresentationDelaySeconds.map { x => x.asInstanceOf[js.Any] },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashPackage]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object DeleteChannelRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined): DeleteChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteChannelResponse extends js.Object {

  }

  object DeleteChannelResponse {
    def apply(): DeleteChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelResponse]
    }
  }

  @js.native
  trait DeleteOriginEndpointRequest extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object DeleteOriginEndpointRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined): DeleteOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOriginEndpointRequest]
    }
  }

  @js.native
  trait DeleteOriginEndpointResponse extends js.Object {

  }

  object DeleteOriginEndpointResponse {
    def apply(): DeleteOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOriginEndpointResponse]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object DescribeChannelRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined): DescribeChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
  }

  object DescribeChannelResponse {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): DescribeChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HlsIngest" -> HlsIngest.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeOriginEndpointRequest extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object DescribeOriginEndpointRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined): DescribeOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOriginEndpointRequest]
    }
  }

  @js.native
  trait DescribeOriginEndpointResponse extends js.Object {
    var Id: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var ManifestName: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Description: js.UndefOr[__string]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Arn: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
    var TimeDelaySeconds: js.UndefOr[__integer]
  }

  object DescribeOriginEndpointResponse {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      ChannelId: js.UndefOr[__string] = js.undefined,
      MssPackage: js.UndefOr[MssPackage] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
      Arn: js.UndefOr[__string] = js.undefined,
      HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
      DashPackage: js.UndefOr[DashPackage] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined,
      Whitelist: js.UndefOr[__listOf__string] = js.undefined,
      TimeDelaySeconds: js.UndefOr[__integer] = js.undefined): DescribeOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CmafPackage" -> CmafPackage.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "ChannelId" -> ChannelId.map { x => x.asInstanceOf[js.Any] },
        "MssPackage" -> MssPackage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "HlsPackage" -> HlsPackage.map { x => x.asInstanceOf[js.Any] },
        "DashPackage" -> DashPackage.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "Whitelist" -> Whitelist.map { x => x.asInstanceOf[js.Any] },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOriginEndpointResponse]
    }
  }

  object EncryptionMethodEnum {
    val AES_128 = "AES_128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = IndexedSeq(AES_128, SAMPLE_AES)
  }

  /**
   * An HTTP Live Streaming (HLS) encryption configuration.
   */
  @js.native
  trait HlsEncryption extends js.Object {
    var EncryptionMethod: js.UndefOr[EncryptionMethod]
    var RepeatExtXKey: js.UndefOr[__boolean]
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
    var ConstantInitializationVector: js.UndefOr[__string]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object HlsEncryption {
    def apply(
      EncryptionMethod: js.UndefOr[EncryptionMethod] = js.undefined,
      RepeatExtXKey: js.UndefOr[__boolean] = js.undefined,
      KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined,
      ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined): HlsEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionMethod" -> EncryptionMethod.map { x => x.asInstanceOf[js.Any] },
        "RepeatExtXKey" -> RepeatExtXKey.map { x => x.asInstanceOf[js.Any] },
        "KeyRotationIntervalSeconds" -> KeyRotationIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "ConstantInitializationVector" -> ConstantInitializationVector.map { x => x.asInstanceOf[js.Any] },
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      IngestEndpoints: js.UndefOr[__listOfIngestEndpoint] = js.undefined): HlsIngest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IngestEndpoints" -> IngestEndpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsIngest]
    }
  }

  /**
   * A HTTP Live Streaming (HLS) manifest configuration.
   */
  @js.native
  trait HlsManifest extends js.Object {
    var Id: js.UndefOr[__string]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var Url: js.UndefOr[__string]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var AdMarkers: js.UndefOr[AdMarkers]
  }

  object HlsManifest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined,
      PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
      IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
      AdMarkers: js.UndefOr[AdMarkers] = js.undefined): HlsManifest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ProgramDateTimeIntervalSeconds" -> ProgramDateTimeIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "PlaylistType" -> PlaylistType.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "PlaylistWindowSeconds" -> PlaylistWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "IncludeIframeOnlyStream" -> IncludeIframeOnlyStream.map { x => x.asInstanceOf[js.Any] },
        "AdMarkers" -> AdMarkers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsManifest]
    }
  }

  /**
   * A HTTP Live Streaming (HLS) manifest configuration.
   */
  @js.native
  trait HlsManifestCreateOrUpdateParameters extends js.Object {
    var Id: js.UndefOr[__string]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var AdMarkers: js.UndefOr[AdMarkers]
  }

  object HlsManifestCreateOrUpdateParameters {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
      PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
      IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
      AdMarkers: js.UndefOr[AdMarkers] = js.undefined): HlsManifestCreateOrUpdateParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ProgramDateTimeIntervalSeconds" -> ProgramDateTimeIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "PlaylistType" -> PlaylistType.map { x => x.asInstanceOf[js.Any] },
        "PlaylistWindowSeconds" -> PlaylistWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "IncludeIframeOnlyStream" -> IncludeIframeOnlyStream.map { x => x.asInstanceOf[js.Any] },
        "AdMarkers" -> AdMarkers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsManifestCreateOrUpdateParameters]
    }
  }

  /**
   * An HTTP Live Streaming (HLS) packaging configuration.
   */
  @js.native
  trait HlsPackage extends js.Object {
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var PlaylistType: js.UndefOr[PlaylistType]
    var StreamSelection: js.UndefOr[StreamSelection]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var UseAudioRenditionGroup: js.UndefOr[__boolean]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var Encryption: js.UndefOr[HlsEncryption]
    var AdMarkers: js.UndefOr[AdMarkers]
  }

  object HlsPackage {
    def apply(
      ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
      PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
      StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
      SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
      UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined,
      PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
      IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
      Encryption: js.UndefOr[HlsEncryption] = js.undefined,
      AdMarkers: js.UndefOr[AdMarkers] = js.undefined): HlsPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgramDateTimeIntervalSeconds" -> ProgramDateTimeIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "PlaylistType" -> PlaylistType.map { x => x.asInstanceOf[js.Any] },
        "StreamSelection" -> StreamSelection.map { x => x.asInstanceOf[js.Any] },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "UseAudioRenditionGroup" -> UseAudioRenditionGroup.map { x => x.asInstanceOf[js.Any] },
        "PlaylistWindowSeconds" -> PlaylistWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "IncludeIframeOnlyStream" -> IncludeIframeOnlyStream.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "AdMarkers" -> AdMarkers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Username: js.UndefOr[__string] = js.undefined): IngestEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[__string] = js.undefined): ListChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[__string] = js.undefined): ListChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Channels" -> Channels.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[__string] = js.undefined): ListOriginEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      OriginEndpoints: js.UndefOr[__listOfOriginEndpoint] = js.undefined): ListOriginEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "OriginEndpoints" -> OriginEndpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOriginEndpointsResponse]
    }
  }

  /**
   * A Microsoft Smooth Streaming (MSS) encryption configuration.
   */
  @js.native
  trait MssEncryption extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object MssEncryption {
    def apply(
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined): MssEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      StreamSelection: js.UndefOr[StreamSelection] = js.undefined): MssPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "ManifestWindowSeconds" -> ManifestWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "SegmentDurationSeconds" -> SegmentDurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "StreamSelection" -> StreamSelection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MssPackage]
    }
  }

  /**
   * An OriginEndpoint resource configuration.
   */
  @js.native
  trait OriginEndpoint extends js.Object {
    var Id: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var ManifestName: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Description: js.UndefOr[__string]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Arn: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
    var TimeDelaySeconds: js.UndefOr[__integer]
  }

  object OriginEndpoint {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      ChannelId: js.UndefOr[__string] = js.undefined,
      MssPackage: js.UndefOr[MssPackage] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
      Arn: js.UndefOr[__string] = js.undefined,
      HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
      DashPackage: js.UndefOr[DashPackage] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined,
      Whitelist: js.UndefOr[__listOf__string] = js.undefined,
      TimeDelaySeconds: js.UndefOr[__integer] = js.undefined): OriginEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CmafPackage" -> CmafPackage.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "ChannelId" -> ChannelId.map { x => x.asInstanceOf[js.Any] },
        "MssPackage" -> MssPackage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "HlsPackage" -> HlsPackage.map { x => x.asInstanceOf[js.Any] },
        "DashPackage" -> DashPackage.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "Whitelist" -> Whitelist.map { x => x.asInstanceOf[js.Any] },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginEndpoint]
    }
  }

  object PlaylistTypeEnum {
    val NONE = "NONE"
    val EVENT = "EVENT"
    val VOD = "VOD"

    val values = IndexedSeq(NONE, EVENT, VOD)
  }

  object ProfileEnum {
    val NONE = "NONE"
    val HBBTV_1_5 = "HBBTV_1_5"

    val values = IndexedSeq(NONE, HBBTV_1_5)
  }

  @deprecated
  @js.native
  trait RotateChannelCredentialsRequest extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object RotateChannelCredentialsRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined): RotateChannelCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
  }

  object RotateChannelCredentialsResponse {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): RotateChannelCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HlsIngest" -> HlsIngest.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateChannelCredentialsResponse]
    }
  }

  @js.native
  trait RotateIngestEndpointCredentialsRequest extends js.Object {
    var Id: js.UndefOr[__string]
    var IngestEndpointId: js.UndefOr[__string]
  }

  object RotateIngestEndpointCredentialsRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      IngestEndpointId: js.UndefOr[__string] = js.undefined): RotateIngestEndpointCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "IngestEndpointId" -> IngestEndpointId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateIngestEndpointCredentialsRequest]
    }
  }

  @js.native
  trait RotateIngestEndpointCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
  }

  object RotateIngestEndpointCredentialsResponse {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): RotateIngestEndpointCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HlsIngest" -> HlsIngest.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateIngestEndpointCredentialsResponse]
    }
  }

  /**
   * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
   */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var ResourceId: js.UndefOr[__string]
    var CertificateArn: js.UndefOr[__string]
    var SystemIds: js.UndefOr[__listOf__string]
    var Url: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object SpekeKeyProvider {
    def apply(
      ResourceId: js.UndefOr[__string] = js.undefined,
      CertificateArn: js.UndefOr[__string] = js.undefined,
      SystemIds: js.UndefOr[__listOf__string] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined,
      RoleArn: js.UndefOr[__string] = js.undefined): SpekeKeyProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "SystemIds" -> SystemIds.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpekeKeyProvider]
    }
  }

  object StreamOrderEnum {
    val ORIGINAL = "ORIGINAL"
    val VIDEO_BITRATE_ASCENDING = "VIDEO_BITRATE_ASCENDING"
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
      StreamOrder: js.UndefOr[StreamOrder] = js.undefined): StreamSelection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxVideoBitsPerSecond" -> MaxVideoBitsPerSecond.map { x => x.asInstanceOf[js.Any] },
        "MinVideoBitsPerSecond" -> MinVideoBitsPerSecond.map { x => x.asInstanceOf[js.Any] },
        "StreamOrder" -> StreamOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSelection]
    }
  }

  /**
   * Configuration parameters used to update the Channel.
   */
  @js.native
  trait UpdateChannelRequest extends js.Object {
    var Description: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  object UpdateChannelRequest {
    def apply(
      Description: js.UndefOr[__string] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): UpdateChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
  }

  object UpdateChannelResponse {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined): UpdateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HlsIngest" -> HlsIngest.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelResponse]
    }
  }

  /**
   * Configuration parameters used to update an existing OriginEndpoint.
   */
  @js.native
  trait UpdateOriginEndpointRequest extends js.Object {
    var Id: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Description: js.UndefOr[__string]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var HlsPackage: js.UndefOr[HlsPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Whitelist: js.UndefOr[__listOf__string]
    var TimeDelaySeconds: js.UndefOr[__integer]
  }

  object UpdateOriginEndpointRequest {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      MssPackage: js.UndefOr[MssPackage] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
      HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
      DashPackage: js.UndefOr[DashPackage] = js.undefined,
      Whitelist: js.UndefOr[__listOf__string] = js.undefined,
      TimeDelaySeconds: js.UndefOr[__integer] = js.undefined): UpdateOriginEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CmafPackage" -> CmafPackage.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "MssPackage" -> MssPackage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "HlsPackage" -> HlsPackage.map { x => x.asInstanceOf[js.Any] },
        "DashPackage" -> DashPackage.map { x => x.asInstanceOf[js.Any] },
        "Whitelist" -> Whitelist.map { x => x.asInstanceOf[js.Any] },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOriginEndpointRequest]
    }
  }

  @js.native
  trait UpdateOriginEndpointResponse extends js.Object {
    var Id: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var ManifestName: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Description: js.UndefOr[__string]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Arn: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
    var TimeDelaySeconds: js.UndefOr[__integer]
  }

  object UpdateOriginEndpointResponse {
    def apply(
      Id: js.UndefOr[__string] = js.undefined,
      CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
      ManifestName: js.UndefOr[__string] = js.undefined,
      ChannelId: js.UndefOr[__string] = js.undefined,
      MssPackage: js.UndefOr[MssPackage] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
      Arn: js.UndefOr[__string] = js.undefined,
      HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
      DashPackage: js.UndefOr[DashPackage] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined,
      Whitelist: js.UndefOr[__listOf__string] = js.undefined,
      TimeDelaySeconds: js.UndefOr[__integer] = js.undefined): UpdateOriginEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CmafPackage" -> CmafPackage.map { x => x.asInstanceOf[js.Any] },
        "ManifestName" -> ManifestName.map { x => x.asInstanceOf[js.Any] },
        "ChannelId" -> ChannelId.map { x => x.asInstanceOf[js.Any] },
        "MssPackage" -> MssPackage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartoverWindowSeconds" -> StartoverWindowSeconds.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "HlsPackage" -> HlsPackage.map { x => x.asInstanceOf[js.Any] },
        "DashPackage" -> DashPackage.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "Whitelist" -> Whitelist.map { x => x.asInstanceOf[js.Any] },
        "TimeDelaySeconds" -> TimeDelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOriginEndpointResponse]
    }
  }

  object __PeriodTriggersElementEnum {
    val ADS = "ADS"

    val values = IndexedSeq(ADS)
  }
}
