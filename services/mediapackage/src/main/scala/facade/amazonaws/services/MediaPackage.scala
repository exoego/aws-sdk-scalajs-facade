package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mediapackage {
  type AdTriggers                                  = js.Array[__AdTriggersElement]
  type MaxResults                                  = Int
  type Tags                                        = js.Dictionary[__string]
  type __boolean                                   = Boolean
  type __integer                                   = Int
  type __listOfChannel                             = js.Array[Channel]
  type __listOfHarvestJob                          = js.Array[HarvestJob]
  type __listOfHlsManifest                         = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint                      = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint                      = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement             = js.Array[__PeriodTriggersElement]
  type __listOf__string                            = js.Array[__string]
  type __mapOf__string                             = js.Dictionary[__string]
  type __string                                    = String

  implicit final class MediaPackageOps(private val service: MediaPackage) extends AnyVal {

    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise().toFuture
    @inline def createHarvestJobFuture(params: CreateHarvestJobRequest): Future[CreateHarvestJobResponse] =
      service.createHarvestJob(params).promise().toFuture
    @inline def createOriginEndpointFuture(params: CreateOriginEndpointRequest): Future[CreateOriginEndpointResponse] =
      service.createOriginEndpoint(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[DeleteChannelResponse] =
      service.deleteChannel(params).promise().toFuture
    @inline def deleteOriginEndpointFuture(params: DeleteOriginEndpointRequest): Future[DeleteOriginEndpointResponse] =
      service.deleteOriginEndpoint(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise().toFuture
    @inline def describeHarvestJobFuture(params: DescribeHarvestJobRequest): Future[DescribeHarvestJobResponse] =
      service.describeHarvestJob(params).promise().toFuture
    @inline def describeOriginEndpointFuture(
        params: DescribeOriginEndpointRequest
    ): Future[DescribeOriginEndpointResponse] = service.describeOriginEndpoint(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise().toFuture
    @inline def listHarvestJobsFuture(params: ListHarvestJobsRequest): Future[ListHarvestJobsResponse] =
      service.listHarvestJobs(params).promise().toFuture
    @inline def listOriginEndpointsFuture(params: ListOriginEndpointsRequest): Future[ListOriginEndpointsResponse] =
      service.listOriginEndpoints(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def rotateIngestEndpointCredentialsFuture(
        params: RotateIngestEndpointCredentialsRequest
    ): Future[RotateIngestEndpointCredentialsResponse] =
      service.rotateIngestEndpointCredentials(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] =
      service.updateChannel(params).promise().toFuture
    @inline def updateOriginEndpointFuture(params: UpdateOriginEndpointRequest): Future[UpdateOriginEndpointResponse] =
      service.updateOriginEndpoint(params).promise().toFuture
  }
}

package mediapackage {
  @js.native
  @JSImport("aws-sdk", "MediaPackage")
  class MediaPackage() extends js.Object {
    def this(config: AWSConfig) = this()

    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse]                      = js.native
    def createHarvestJob(params: CreateHarvestJobRequest): Request[CreateHarvestJobResponse]             = js.native
    def createOriginEndpoint(params: CreateOriginEndpointRequest): Request[CreateOriginEndpointResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse]                      = js.native
    def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): Request[DeleteOriginEndpointResponse] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse]                = js.native
    def describeHarvestJob(params: DescribeHarvestJobRequest): Request[DescribeHarvestJobResponse]       = js.native
    def describeOriginEndpoint(params: DescribeOriginEndpointRequest): Request[DescribeOriginEndpointResponse] =
      js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse]                      = js.native
    def listHarvestJobs(params: ListHarvestJobsRequest): Request[ListHarvestJobsResponse]             = js.native
    def listOriginEndpoints(params: ListOriginEndpointsRequest): Request[ListOriginEndpointsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def rotateIngestEndpointCredentials(
        params: RotateIngestEndpointCredentialsRequest
    ): Request[RotateIngestEndpointCredentialsResponse]                                                  = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse]                      = js.native
    def updateOriginEndpoint(params: UpdateOriginEndpointRequest): Request[UpdateOriginEndpointResponse] = js.native
    @deprecated(
      "This API is deprecated. Please use RotateIngestEndpointCredentials instead",
      "forever"
    ) def rotateChannelCredentials(params: RotateChannelCredentialsRequest): Request[RotateChannelCredentialsResponse] =
      js.native
  }

  @js.native
  sealed trait AdMarkers extends js.Any
  object AdMarkers extends js.Object {
    val NONE            = "NONE".asInstanceOf[AdMarkers]
    val SCTE35_ENHANCED = "SCTE35_ENHANCED".asInstanceOf[AdMarkers]
    val PASSTHROUGH     = "PASSTHROUGH".asInstanceOf[AdMarkers]

    val values = js.Object.freeze(js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH))
  }

  /**
    * This setting allows the delivery restriction flags on SCTE-35 segmentation descriptors to
    * determine whether a message signals an ad.  Choosing "NONE" means no SCTE-35 messages become
    * ads.  Choosing "RESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that
    * contain delivery restrictions will be treated as ads.  Choosing "UNRESTRICTED" means SCTE-35
    * messages of the types specified in AdTriggers that do not contain delivery restrictions will
    * be treated as ads.  Choosing "BOTH" means all SCTE-35 messages of the types specified in
    * AdTriggers will be treated as ads.  Note that Splice Insert messages do not have these flags
    * and are always treated as ads if specified in AdTriggers.
    */
  @js.native
  sealed trait AdsOnDeliveryRestrictions extends js.Any
  object AdsOnDeliveryRestrictions extends js.Object {
    val NONE         = "NONE".asInstanceOf[AdsOnDeliveryRestrictions]
    val RESTRICTED   = "RESTRICTED".asInstanceOf[AdsOnDeliveryRestrictions]
    val UNRESTRICTED = "UNRESTRICTED".asInstanceOf[AdsOnDeliveryRestrictions]
    val BOTH         = "BOTH".asInstanceOf[AdsOnDeliveryRestrictions]

    val values = js.Object.freeze(js.Array(NONE, RESTRICTED, UNRESTRICTED, BOTH))
  }

  /**
    * CDN Authorization credentials
    */
  @js.native
  @Factory
  trait Authorization extends js.Object {
    var CdnIdentifierSecret: __string
    var SecretsRoleArn: __string
  }

  /**
    * A Channel resource configuration.
    */
  @js.native
  @Factory
  trait Channel extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A Common Media Application Format (CMAF) encryption configuration.
    */
  @js.native
  @Factory
  trait CmafEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
  }

  /**
    * A Common Media Application Format (CMAF) packaging configuration.
    */
  @js.native
  @Factory
  trait CmafPackage extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifest]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  /**
    * A Common Media Application Format (CMAF) packaging configuration.
    */
  @js.native
  @Factory
  trait CmafPackageCreateOrUpdateParameters extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  /**
    * A new Channel configuration.
    */
  @js.native
  @Factory
  trait CreateChannelRequest extends js.Object {
    var Id: __string
    var Description: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Configuration parameters used to create a new HarvestJob.
    */
  @js.native
  @Factory
  trait CreateHarvestJobRequest extends js.Object {
    var EndTime: __string
    var Id: __string
    var OriginEndpointId: __string
    var S3Destination: S3Destination
    var StartTime: __string
  }

  @js.native
  @Factory
  trait CreateHarvestJobResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EndTime: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var OriginEndpointId: js.UndefOr[__string]
    var S3Destination: js.UndefOr[S3Destination]
    var StartTime: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  /**
    * Configuration parameters used to create a new OriginEndpoint.
    */
  @js.native
  @Factory
  trait CreateOriginEndpointRequest extends js.Object {
    var ChannelId: __string
    var Id: __string
    var Authorization: js.UndefOr[Authorization]
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait CreateOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
    */
  @js.native
  @Factory
  trait DashEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
    */
  @js.native
  @Factory
  trait DashPackage extends js.Object {
    var AdTriggers: js.UndefOr[AdTriggers]
    var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions]
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

  @js.native
  @Factory
  trait DeleteChannelRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DeleteChannelResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteOriginEndpointRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DeleteOriginEndpointResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeChannelRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DescribeChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DescribeHarvestJobRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DescribeHarvestJobResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EndTime: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var OriginEndpointId: js.UndefOr[__string]
    var S3Destination: js.UndefOr[S3Destination]
    var StartTime: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait DescribeOriginEndpointRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DescribeOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  @js.native
  sealed trait EncryptionMethod extends js.Any
  object EncryptionMethod extends js.Object {
    val AES_128    = "AES_128".asInstanceOf[EncryptionMethod]
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[EncryptionMethod]

    val values = js.Object.freeze(js.Array(AES_128, SAMPLE_AES))
  }

  /**
    * A HarvestJob resource configuration
    */
  @js.native
  @Factory
  trait HarvestJob extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EndTime: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var OriginEndpointId: js.UndefOr[__string]
    var S3Destination: js.UndefOr[S3Destination]
    var StartTime: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  /**
    * An HTTP Live Streaming (HLS) encryption configuration.
    */
  @js.native
  @Factory
  trait HlsEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var ConstantInitializationVector: js.UndefOr[__string]
    var EncryptionMethod: js.UndefOr[EncryptionMethod]
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
    var RepeatExtXKey: js.UndefOr[__boolean]
  }

  /**
    * An HTTP Live Streaming (HLS) ingest resource configuration.
    */
  @js.native
  @Factory
  trait HlsIngest extends js.Object {
    var IngestEndpoints: js.UndefOr[__listOfIngestEndpoint]
  }

  /**
    * A HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  @Factory
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

  /**
    * A HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  @Factory
  trait HlsManifestCreateOrUpdateParameters extends js.Object {
    var Id: __string
    var AdMarkers: js.UndefOr[AdMarkers]
    var AdTriggers: js.UndefOr[AdTriggers]
    var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
  }

  /**
    * An HTTP Live Streaming (HLS) packaging configuration.
    */
  @js.native
  @Factory
  trait HlsPackage extends js.Object {
    var AdMarkers: js.UndefOr[AdMarkers]
    var AdTriggers: js.UndefOr[AdTriggers]
    var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions]
    var Encryption: js.UndefOr[HlsEncryption]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
    var UseAudioRenditionGroup: js.UndefOr[__boolean]
  }

  /**
    * An endpoint for ingesting source content for a Channel.
    */
  @js.native
  @Factory
  trait IngestEndpoint extends js.Object {
    var Id: js.UndefOr[__string]
    var Password: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[__listOfChannel]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListHarvestJobsRequest extends js.Object {
    var IncludeChannelId: js.UndefOr[__string]
    var IncludeStatus: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListHarvestJobsResponse extends js.Object {
    var HarvestJobs: js.UndefOr[__listOfHarvestJob]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListOriginEndpointsRequest extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListOriginEndpointsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var OriginEndpoints: js.UndefOr[__listOfOriginEndpoint]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  sealed trait ManifestLayout extends js.Any
  object ManifestLayout extends js.Object {
    val FULL    = "FULL".asInstanceOf[ManifestLayout]
    val COMPACT = "COMPACT".asInstanceOf[ManifestLayout]

    val values = js.Object.freeze(js.Array(FULL, COMPACT))
  }

  /**
    * A Microsoft Smooth Streaming (MSS) encryption configuration.
    */
  @js.native
  @Factory
  trait MssEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  /**
    * A Microsoft Smooth Streaming (MSS) packaging configuration.
    */
  @js.native
  @Factory
  trait MssPackage extends js.Object {
    var Encryption: js.UndefOr[MssEncryption]
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  /**
    * An OriginEndpoint resource configuration.
    */
  @js.native
  @Factory
  trait OriginEndpoint extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  @js.native
  sealed trait Origination extends js.Any
  object Origination extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[Origination]
    val DENY  = "DENY".asInstanceOf[Origination]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  @js.native
  sealed trait PlaylistType extends js.Any
  object PlaylistType extends js.Object {
    val NONE  = "NONE".asInstanceOf[PlaylistType]
    val EVENT = "EVENT".asInstanceOf[PlaylistType]
    val VOD   = "VOD".asInstanceOf[PlaylistType]

    val values = js.Object.freeze(js.Array(NONE, EVENT, VOD))
  }

  @js.native
  sealed trait Profile extends js.Any
  object Profile extends js.Object {
    val NONE      = "NONE".asInstanceOf[Profile]
    val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[Profile]

    val values = js.Object.freeze(js.Array(NONE, HBBTV_1_5))
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait RotateChannelCredentialsRequest extends js.Object {
    var Id: __string
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait RotateChannelCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait RotateIngestEndpointCredentialsRequest extends js.Object {
    var Id: __string
    var IngestEndpointId: __string
  }

  @js.native
  @Factory
  trait RotateIngestEndpointCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Configuration parameters for where in an S3 bucket to place the harvested content
    */
  @js.native
  @Factory
  trait S3Destination extends js.Object {
    var BucketName: __string
    var ManifestKey: __string
    var RoleArn: __string
  }

  @js.native
  sealed trait SegmentTemplateFormat extends js.Any
  object SegmentTemplateFormat extends js.Object {
    val NUMBER_WITH_TIMELINE = "NUMBER_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
    val TIME_WITH_TIMELINE   = "TIME_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
    val NUMBER_WITH_DURATION = "NUMBER_WITH_DURATION".asInstanceOf[SegmentTemplateFormat]

    val values = js.Object.freeze(js.Array(NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION))
  }

  /**
    * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
    */
  @js.native
  @Factory
  trait SpekeKeyProvider extends js.Object {
    var ResourceId: __string
    var RoleArn: __string
    var SystemIds: __listOf__string
    var Url: __string
    var CertificateArn: js.UndefOr[__string]
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[Status]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[Status]
    val FAILED      = "FAILED".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }

  @js.native
  sealed trait StreamOrder extends js.Any
  object StreamOrder extends js.Object {
    val ORIGINAL                 = "ORIGINAL".asInstanceOf[StreamOrder]
    val VIDEO_BITRATE_ASCENDING  = "VIDEO_BITRATE_ASCENDING".asInstanceOf[StreamOrder]
    val VIDEO_BITRATE_DESCENDING = "VIDEO_BITRATE_DESCENDING".asInstanceOf[StreamOrder]

    val values = js.Object.freeze(js.Array(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING))
  }

  /**
    * A StreamSelection configuration.
    */
  @js.native
  @Factory
  trait StreamSelection extends js.Object {
    var MaxVideoBitsPerSecond: js.UndefOr[__integer]
    var MinVideoBitsPerSecond: js.UndefOr[__integer]
    var StreamOrder: js.UndefOr[StreamOrder]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  /**
    * Configuration parameters used to update the Channel.
    */
  @js.native
  @Factory
  trait UpdateChannelRequest extends js.Object {
    var Id: __string
    var Description: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Configuration parameters used to update an existing OriginEndpoint.
    */
  @js.native
  @Factory
  trait UpdateOriginEndpointRequest extends js.Object {
    var Id: __string
    var Authorization: js.UndefOr[Authorization]
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait UpdateOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  @js.native
  sealed trait __AdTriggersElement extends js.Any
  object __AdTriggersElement extends js.Object {
    val SPLICE_INSERT                     = "SPLICE_INSERT".asInstanceOf[__AdTriggersElement]
    val BREAK                             = "BREAK".asInstanceOf[__AdTriggersElement]
    val PROVIDER_ADVERTISEMENT            = "PROVIDER_ADVERTISEMENT".asInstanceOf[__AdTriggersElement]
    val DISTRIBUTOR_ADVERTISEMENT         = "DISTRIBUTOR_ADVERTISEMENT".asInstanceOf[__AdTriggersElement]
    val PROVIDER_PLACEMENT_OPPORTUNITY    = "PROVIDER_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]
    val DISTRIBUTOR_PLACEMENT_OPPORTUNITY = "DISTRIBUTOR_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]
    val PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY =
      "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]
    val DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY =
      "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]

    val values = js.Object.freeze(
      js.Array(
        SPLICE_INSERT,
        BREAK,
        PROVIDER_ADVERTISEMENT,
        DISTRIBUTOR_ADVERTISEMENT,
        PROVIDER_PLACEMENT_OPPORTUNITY,
        DISTRIBUTOR_PLACEMENT_OPPORTUNITY,
        PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY,
        DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
      )
    )
  }

  @js.native
  sealed trait __PeriodTriggersElement extends js.Any
  object __PeriodTriggersElement extends js.Object {
    val ADS = "ADS".asInstanceOf[__PeriodTriggersElement]

    val values = js.Object.freeze(js.Array(ADS))
  }
}
