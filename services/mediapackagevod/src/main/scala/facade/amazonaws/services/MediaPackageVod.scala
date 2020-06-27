package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mediapackagevod {
  type MaxResults                      = Int
  type __boolean                       = Boolean
  type __integer                       = Int
  type __listOfAssetShallow            = js.Array[AssetShallow]
  type __listOfDashManifest            = js.Array[DashManifest]
  type __listOfEgressEndpoint          = js.Array[EgressEndpoint]
  type __listOfHlsManifest             = js.Array[HlsManifest]
  type __listOfMssManifest             = js.Array[MssManifest]
  type __listOfPackagingConfiguration  = js.Array[PackagingConfiguration]
  type __listOfPackagingGroup          = js.Array[PackagingGroup]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string                = js.Array[__string]
  type __string                        = String

  implicit final class MediaPackageVodOps(private val service: MediaPackageVod) extends AnyVal {

    @inline def createAssetFuture(params: CreateAssetRequest): Future[CreateAssetResponse] =
      service.createAsset(params).promise().toFuture
    @inline def createPackagingConfigurationFuture(
        params: CreatePackagingConfigurationRequest
    ): Future[CreatePackagingConfigurationResponse] = service.createPackagingConfiguration(params).promise().toFuture
    @inline def createPackagingGroupFuture(params: CreatePackagingGroupRequest): Future[CreatePackagingGroupResponse] =
      service.createPackagingGroup(params).promise().toFuture
    @inline def deleteAssetFuture(params: DeleteAssetRequest): Future[DeleteAssetResponse] =
      service.deleteAsset(params).promise().toFuture
    @inline def deletePackagingConfigurationFuture(
        params: DeletePackagingConfigurationRequest
    ): Future[DeletePackagingConfigurationResponse] = service.deletePackagingConfiguration(params).promise().toFuture
    @inline def deletePackagingGroupFuture(params: DeletePackagingGroupRequest): Future[DeletePackagingGroupResponse] =
      service.deletePackagingGroup(params).promise().toFuture
    @inline def describeAssetFuture(params: DescribeAssetRequest): Future[DescribeAssetResponse] =
      service.describeAsset(params).promise().toFuture
    @inline def describePackagingConfigurationFuture(
        params: DescribePackagingConfigurationRequest
    ): Future[DescribePackagingConfigurationResponse] =
      service.describePackagingConfiguration(params).promise().toFuture
    @inline def describePackagingGroupFuture(
        params: DescribePackagingGroupRequest
    ): Future[DescribePackagingGroupResponse] = service.describePackagingGroup(params).promise().toFuture
    @inline def listAssetsFuture(params: ListAssetsRequest): Future[ListAssetsResponse] =
      service.listAssets(params).promise().toFuture
    @inline def listPackagingConfigurationsFuture(
        params: ListPackagingConfigurationsRequest
    ): Future[ListPackagingConfigurationsResponse] = service.listPackagingConfigurations(params).promise().toFuture
    @inline def listPackagingGroupsFuture(params: ListPackagingGroupsRequest): Future[ListPackagingGroupsResponse] =
      service.listPackagingGroups(params).promise().toFuture
  }
}

package mediapackagevod {
  @js.native
  @JSImport("aws-sdk", "MediaPackageVod")
  class MediaPackageVod() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAsset(params: CreateAssetRequest): Request[CreateAssetResponse] = js.native
    def createPackagingConfiguration(
        params: CreatePackagingConfigurationRequest
    ): Request[CreatePackagingConfigurationResponse]                                                     = js.native
    def createPackagingGroup(params: CreatePackagingGroupRequest): Request[CreatePackagingGroupResponse] = js.native
    def deleteAsset(params: DeleteAssetRequest): Request[DeleteAssetResponse]                            = js.native
    def deletePackagingConfiguration(
        params: DeletePackagingConfigurationRequest
    ): Request[DeletePackagingConfigurationResponse]                                                     = js.native
    def deletePackagingGroup(params: DeletePackagingGroupRequest): Request[DeletePackagingGroupResponse] = js.native
    def describeAsset(params: DescribeAssetRequest): Request[DescribeAssetResponse]                      = js.native
    def describePackagingConfiguration(
        params: DescribePackagingConfigurationRequest
    ): Request[DescribePackagingConfigurationResponse] = js.native
    def describePackagingGroup(params: DescribePackagingGroupRequest): Request[DescribePackagingGroupResponse] =
      js.native
    def listAssets(params: ListAssetsRequest): Request[ListAssetsResponse] = js.native
    def listPackagingConfigurations(
        params: ListPackagingConfigurationsRequest
    ): Request[ListPackagingConfigurationsResponse]                                                   = js.native
    def listPackagingGroups(params: ListPackagingGroupsRequest): Request[ListPackagingGroupsResponse] = js.native
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
    * A MediaPackage VOD Asset resource.
    */
  @js.native
  @Factory
  trait AssetShallow extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
  }

  /**
    * A CMAF encryption configuration.
    */
  @js.native
  @Factory
  trait CmafEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  /**
    * A CMAF packaging configuration.
    */
  @js.native
  @Factory
  trait CmafPackage extends js.Object {
    var HlsManifests: __listOfHlsManifest
    var Encryption: js.UndefOr[CmafEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
  }

  /**
    * A new MediaPackage VOD Asset configuration.
    */
  @js.native
  @Factory
  trait CreateAssetRequest extends js.Object {
    var Id: __string
    var PackagingGroupId: __string
    var SourceArn: __string
    var SourceRoleArn: __string
    var ResourceId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateAssetResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
  }

  /**
    * A new MediaPackage VOD PackagingConfiguration resource configuration.
    */
  @js.native
  @Factory
  trait CreatePackagingConfigurationRequest extends js.Object {
    var Id: __string
    var PackagingGroupId: __string
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var MssPackage: js.UndefOr[MssPackage]
  }

  @js.native
  @Factory
  trait CreatePackagingConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var PackagingGroupId: js.UndefOr[__string]
  }

  /**
    * A new MediaPackage VOD PackagingGroup resource configuration.
    */
  @js.native
  @Factory
  trait CreatePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait CreatePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
    */
  @js.native
  @Factory
  trait DashEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  /**
    * A DASH manifest configuration.
    */
  @js.native
  @Factory
  trait DashManifest extends js.Object {
    var ManifestLayout: js.UndefOr[ManifestLayout]
    var ManifestName: js.UndefOr[__string]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var Profile: js.UndefOr[Profile]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
    */
  @js.native
  @Factory
  trait DashPackage extends js.Object {
    var DashManifests: __listOfDashManifest
    var Encryption: js.UndefOr[DashEncryption]
    var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat]
  }

  @js.native
  @Factory
  trait DeleteAssetRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DeleteAssetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeletePackagingConfigurationRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DeletePackagingConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeletePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DeletePackagingGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeAssetRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DescribeAssetResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribePackagingConfigurationRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DescribePackagingConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var PackagingGroupId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait DescribePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  /**
    * The endpoint URL used to access an Asset using one PackagingConfiguration.
    */
  @js.native
  @Factory
  trait EgressEndpoint extends js.Object {
    var PackagingConfigurationId: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  @js.native
  sealed trait EncryptionMethod extends js.Any
  object EncryptionMethod extends js.Object {
    val AES_128    = "AES_128".asInstanceOf[EncryptionMethod]
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[EncryptionMethod]

    val values = js.Object.freeze(js.Array(AES_128, SAMPLE_AES))
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
  }

  /**
    * An HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  @Factory
  trait HlsManifest extends js.Object {
    var AdMarkers: js.UndefOr[AdMarkers]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var RepeatExtXKey: js.UndefOr[__boolean]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  /**
    * An HTTP Live Streaming (HLS) packaging configuration.
    */
  @js.native
  @Factory
  trait HlsPackage extends js.Object {
    var HlsManifests: __listOfHlsManifest
    var Encryption: js.UndefOr[HlsEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var UseAudioRenditionGroup: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
  trait ListAssetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListAssetsResponse extends js.Object {
    var Assets: js.UndefOr[__listOfAssetShallow]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListPackagingConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListPackagingConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PackagingConfigurations: js.UndefOr[__listOfPackagingConfiguration]
  }

  @js.native
  @Factory
  trait ListPackagingGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListPackagingGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PackagingGroups: js.UndefOr[__listOfPackagingGroup]
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
    * A Microsoft Smooth Streaming (MSS) manifest configuration.
    */
  @js.native
  @Factory
  trait MssManifest extends js.Object {
    var ManifestName: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  /**
    * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
    */
  @js.native
  @Factory
  trait MssPackage extends js.Object {
    var MssManifests: __listOfMssManifest
    var Encryption: js.UndefOr[MssEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
  }

  /**
    * A MediaPackage VOD PackagingConfiguration resource.
    */
  @js.native
  @Factory
  trait PackagingConfiguration extends js.Object {
    var Arn: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var PackagingGroupId: js.UndefOr[__string]
  }

  /**
    * A MediaPackage VOD PackagingGroup resource.
    */
  @js.native
  @Factory
  trait PackagingGroup extends js.Object {
    var Arn: js.UndefOr[__string]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  @js.native
  sealed trait Profile extends js.Any
  object Profile extends js.Object {
    val NONE      = "NONE".asInstanceOf[Profile]
    val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[Profile]

    val values = js.Object.freeze(js.Array(NONE, HBBTV_1_5))
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
    var RoleArn: __string
    var SystemIds: __listOf__string
    var Url: __string
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
  sealed trait __PeriodTriggersElement extends js.Any
  object __PeriodTriggersElement extends js.Object {
    val ADS = "ADS".asInstanceOf[__PeriodTriggersElement]

    val values = js.Object.freeze(js.Array(ADS))
  }
}
