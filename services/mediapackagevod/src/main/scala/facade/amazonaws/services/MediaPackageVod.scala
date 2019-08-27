package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mediapackagevod {
  type AdMarkers                      = String
  type EncryptionMethod               = String
  type MaxResults                     = Int
  type Profile                        = String
  type StreamOrder                    = String
  type __boolean                      = Boolean
  type __integer                      = Int
  type __listOfAssetShallow           = js.Array[AssetShallow]
  type __listOfDashManifest           = js.Array[DashManifest]
  type __listOfEgressEndpoint         = js.Array[EgressEndpoint]
  type __listOfHlsManifest            = js.Array[HlsManifest]
  type __listOfMssManifest            = js.Array[MssManifest]
  type __listOfPackagingConfiguration = js.Array[PackagingConfiguration]
  type __listOfPackagingGroup         = js.Array[PackagingGroup]
  type __listOf__string               = js.Array[__string]
  type __string                       = String

  implicit final class MediaPackageVodOps(val service: MediaPackageVod) extends AnyVal {

    def createAssetFuture(params: CreateAssetRequest): Future[CreateAssetResponse] =
      service.createAsset(params).promise.toFuture
    def createPackagingConfigurationFuture(
        params: CreatePackagingConfigurationRequest
    ): Future[CreatePackagingConfigurationResponse] = service.createPackagingConfiguration(params).promise.toFuture
    def createPackagingGroupFuture(params: CreatePackagingGroupRequest): Future[CreatePackagingGroupResponse] =
      service.createPackagingGroup(params).promise.toFuture
    def deleteAssetFuture(params: DeleteAssetRequest): Future[DeleteAssetResponse] =
      service.deleteAsset(params).promise.toFuture
    def deletePackagingConfigurationFuture(
        params: DeletePackagingConfigurationRequest
    ): Future[DeletePackagingConfigurationResponse] = service.deletePackagingConfiguration(params).promise.toFuture
    def deletePackagingGroupFuture(params: DeletePackagingGroupRequest): Future[DeletePackagingGroupResponse] =
      service.deletePackagingGroup(params).promise.toFuture
    def describeAssetFuture(params: DescribeAssetRequest): Future[DescribeAssetResponse] =
      service.describeAsset(params).promise.toFuture
    def describePackagingConfigurationFuture(
        params: DescribePackagingConfigurationRequest
    ): Future[DescribePackagingConfigurationResponse] = service.describePackagingConfiguration(params).promise.toFuture
    def describePackagingGroupFuture(params: DescribePackagingGroupRequest): Future[DescribePackagingGroupResponse] =
      service.describePackagingGroup(params).promise.toFuture
    def listAssetsFuture(params: ListAssetsRequest): Future[ListAssetsResponse] =
      service.listAssets(params).promise.toFuture
    def listPackagingConfigurationsFuture(
        params: ListPackagingConfigurationsRequest
    ): Future[ListPackagingConfigurationsResponse] = service.listPackagingConfigurations(params).promise.toFuture
    def listPackagingGroupsFuture(params: ListPackagingGroupsRequest): Future[ListPackagingGroupsResponse] =
      service.listPackagingGroups(params).promise.toFuture
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

  object AdMarkersEnum {
    val NONE            = "NONE"
    val SCTE35_ENHANCED = "SCTE35_ENHANCED"
    val PASSTHROUGH     = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH))
  }

  /**
    * A MediaPackage VOD Asset resource.
    */
  @js.native
  trait AssetShallow extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
  }

  object AssetShallow {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        SourceRoleArn: js.UndefOr[__string] = js.undefined
    ): AssetShallow = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      SourceRoleArn.foreach(__v => __obj.update("SourceRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetShallow]
    }
  }

  /**
    * A CMAF encryption configuration.
    */
  @js.native
  trait CmafEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  object CmafEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): CmafEncryption = {
      val __obj = js.Dictionary[js.Any](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CmafEncryption]
    }
  }

  /**
    * A CMAF packaging configuration.
    */
  @js.native
  trait CmafPackage extends js.Object {
    var HlsManifests: __listOfHlsManifest
    var Encryption: js.UndefOr[CmafEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
  }

  object CmafPackage {
    def apply(
        HlsManifests: __listOfHlsManifest,
        Encryption: js.UndefOr[CmafEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    ): CmafPackage = {
      val __obj = js.Dictionary[js.Any](
        "HlsManifests" -> HlsManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.update("Encryption", __v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.update("SegmentDurationSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafPackage]
    }
  }

  /**
    * A new MediaPackage VOD Asset configuration.
    */
  @js.native
  trait CreateAssetRequest extends js.Object {
    var Id: __string
    var PackagingGroupId: __string
    var SourceArn: __string
    var SourceRoleArn: __string
    var ResourceId: js.UndefOr[__string]
  }

  object CreateAssetRequest {
    def apply(
        Id: __string,
        PackagingGroupId: __string,
        SourceArn: __string,
        SourceRoleArn: __string,
        ResourceId: js.UndefOr[__string] = js.undefined
    ): CreateAssetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id"               -> Id.asInstanceOf[js.Any],
        "PackagingGroupId" -> PackagingGroupId.asInstanceOf[js.Any],
        "SourceArn"        -> SourceArn.asInstanceOf[js.Any],
        "SourceRoleArn"    -> SourceRoleArn.asInstanceOf[js.Any]
      )

      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssetRequest]
    }
  }

  @js.native
  trait CreateAssetResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
  }

  object CreateAssetResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfEgressEndpoint] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        SourceRoleArn: js.UndefOr[__string] = js.undefined
    ): CreateAssetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.update("EgressEndpoints", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      SourceRoleArn.foreach(__v => __obj.update("SourceRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssetResponse]
    }
  }

  /**
    * A new MediaPackage VOD PackagingConfiguration resource configuration.
    */
  @js.native
  trait CreatePackagingConfigurationRequest extends js.Object {
    var Id: __string
    var PackagingGroupId: __string
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var MssPackage: js.UndefOr[MssPackage]
  }

  object CreatePackagingConfigurationRequest {
    def apply(
        Id: __string,
        PackagingGroupId: __string,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined
    ): CreatePackagingConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id"               -> Id.asInstanceOf[js.Any],
        "PackagingGroupId" -> PackagingGroupId.asInstanceOf[js.Any]
      )

      CmafPackage.foreach(__v => __obj.update("CmafPackage", __v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.update("DashPackage", __v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.update("HlsPackage", __v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.update("MssPackage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackagingConfigurationRequest]
    }
  }

  @js.native
  trait CreatePackagingConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var PackagingGroupId: js.UndefOr[__string]
  }

  object CreatePackagingConfigurationResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): CreatePackagingConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.update("CmafPackage", __v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.update("DashPackage", __v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.update("HlsPackage", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.update("MssPackage", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackagingConfigurationResponse]
    }
  }

  /**
    * A new MediaPackage VOD PackagingGroup resource configuration.
    */
  @js.native
  trait CreatePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  object CreatePackagingGroupRequest {
    def apply(
        Id: __string
    ): CreatePackagingGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePackagingGroupRequest]
    }
  }

  @js.native
  trait CreatePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  object CreatePackagingGroupResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined
    ): CreatePackagingGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackagingGroupResponse]
    }
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
    */
  @js.native
  trait DashEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  object DashEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): DashEncryption = {
      val __obj = js.Dictionary[js.Any](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DashEncryption]
    }
  }

  /**
    * A DASH manifest configuration.
    */
  @js.native
  trait DashManifest extends js.Object {
    var ManifestName: js.UndefOr[__string]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var Profile: js.UndefOr[Profile]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object DashManifest {
    def apply(
        ManifestName: js.UndefOr[__string] = js.undefined,
        MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
        Profile: js.UndefOr[Profile] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): DashManifest = {
      val __obj = js.Dictionary.empty[js.Any]
      ManifestName.foreach(__v => __obj.update("ManifestName", __v.asInstanceOf[js.Any]))
      MinBufferTimeSeconds.foreach(__v => __obj.update("MinBufferTimeSeconds", __v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.update("Profile", __v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.update("StreamSelection", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashManifest]
    }
  }

  /**
    * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
    */
  @js.native
  trait DashPackage extends js.Object {
    var DashManifests: __listOfDashManifest
    var Encryption: js.UndefOr[DashEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
  }

  object DashPackage {
    def apply(
        DashManifests: __listOfDashManifest,
        Encryption: js.UndefOr[DashEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    ): DashPackage = {
      val __obj = js.Dictionary[js.Any](
        "DashManifests" -> DashManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.update("Encryption", __v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.update("SegmentDurationSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashPackage]
    }
  }

  @js.native
  trait DeleteAssetRequest extends js.Object {
    var Id: __string
  }

  object DeleteAssetRequest {
    def apply(
        Id: __string
    ): DeleteAssetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAssetRequest]
    }
  }

  @js.native
  trait DeleteAssetResponse extends js.Object {}

  object DeleteAssetResponse {
    def apply(
        ): DeleteAssetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteAssetResponse]
    }
  }

  @js.native
  trait DeletePackagingConfigurationRequest extends js.Object {
    var Id: __string
  }

  object DeletePackagingConfigurationRequest {
    def apply(
        Id: __string
    ): DeletePackagingConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePackagingConfigurationRequest]
    }
  }

  @js.native
  trait DeletePackagingConfigurationResponse extends js.Object {}

  object DeletePackagingConfigurationResponse {
    def apply(
        ): DeletePackagingConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeletePackagingConfigurationResponse]
    }
  }

  @js.native
  trait DeletePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  object DeletePackagingGroupRequest {
    def apply(
        Id: __string
    ): DeletePackagingGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePackagingGroupRequest]
    }
  }

  @js.native
  trait DeletePackagingGroupResponse extends js.Object {}

  object DeletePackagingGroupResponse {
    def apply(
        ): DeletePackagingGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeletePackagingGroupResponse]
    }
  }

  @js.native
  trait DescribeAssetRequest extends js.Object {
    var Id: __string
  }

  object DescribeAssetRequest {
    def apply(
        Id: __string
    ): DescribeAssetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssetRequest]
    }
  }

  @js.native
  trait DescribeAssetResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
  }

  object DescribeAssetResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfEgressEndpoint] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        SourceRoleArn: js.UndefOr[__string] = js.undefined
    ): DescribeAssetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.update("EgressEndpoints", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      SourceRoleArn.foreach(__v => __obj.update("SourceRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssetResponse]
    }
  }

  @js.native
  trait DescribePackagingConfigurationRequest extends js.Object {
    var Id: __string
  }

  object DescribePackagingConfigurationRequest {
    def apply(
        Id: __string
    ): DescribePackagingConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePackagingConfigurationRequest]
    }
  }

  @js.native
  trait DescribePackagingConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var PackagingGroupId: js.UndefOr[__string]
  }

  object DescribePackagingConfigurationResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): DescribePackagingConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.update("CmafPackage", __v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.update("DashPackage", __v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.update("HlsPackage", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.update("MssPackage", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackagingConfigurationResponse]
    }
  }

  @js.native
  trait DescribePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  object DescribePackagingGroupRequest {
    def apply(
        Id: __string
    ): DescribePackagingGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePackagingGroupRequest]
    }
  }

  @js.native
  trait DescribePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  object DescribePackagingGroupResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined
    ): DescribePackagingGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackagingGroupResponse]
    }
  }

  /**
    * The endpoint URL used to access an Asset using one PackagingConfiguration.
    */
  @js.native
  trait EgressEndpoint extends js.Object {
    var PackagingConfigurationId: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object EgressEndpoint {
    def apply(
        PackagingConfigurationId: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): EgressEndpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      PackagingConfigurationId.foreach(__v => __obj.update("PackagingConfigurationId", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EgressEndpoint]
    }
  }

  object EncryptionMethodEnum {
    val AES_128    = "AES_128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = js.Object.freeze(js.Array(AES_128, SAMPLE_AES))
  }

  /**
    * An HTTP Live Streaming (HLS) encryption configuration.
    */
  @js.native
  trait HlsEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var ConstantInitializationVector: js.UndefOr[__string]
    var EncryptionMethod: js.UndefOr[EncryptionMethod]
  }

  object HlsEncryption {
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        EncryptionMethod: js.UndefOr[EncryptionMethod] = js.undefined
    ): HlsEncryption = {
      val __obj = js.Dictionary[js.Any](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      ConstantInitializationVector.foreach(
        __v => __obj.update("ConstantInitializationVector", __v.asInstanceOf[js.Any])
      )
      EncryptionMethod.foreach(__v => __obj.update("EncryptionMethod", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsEncryption]
    }
  }

  /**
    * An HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  trait HlsManifest extends js.Object {
    var AdMarkers: js.UndefOr[AdMarkers]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var RepeatExtXKey: js.UndefOr[__boolean]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object HlsManifest {
    def apply(
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        RepeatExtXKey: js.UndefOr[__boolean] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): HlsManifest = {
      val __obj = js.Dictionary.empty[js.Any]
      AdMarkers.foreach(__v => __obj.update("AdMarkers", __v.asInstanceOf[js.Any]))
      IncludeIframeOnlyStream.foreach(__v => __obj.update("IncludeIframeOnlyStream", __v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.update("ManifestName", __v.asInstanceOf[js.Any]))
      ProgramDateTimeIntervalSeconds.foreach(
        __v => __obj.update("ProgramDateTimeIntervalSeconds", __v.asInstanceOf[js.Any])
      )
      RepeatExtXKey.foreach(__v => __obj.update("RepeatExtXKey", __v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.update("StreamSelection", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsManifest]
    }
  }

  /**
    * An HTTP Live Streaming (HLS) packaging configuration.
    */
  @js.native
  trait HlsPackage extends js.Object {
    var HlsManifests: __listOfHlsManifest
    var Encryption: js.UndefOr[HlsEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var UseAudioRenditionGroup: js.UndefOr[__boolean]
  }

  object HlsPackage {
    def apply(
        HlsManifests: __listOfHlsManifest,
        Encryption: js.UndefOr[HlsEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
    ): HlsPackage = {
      val __obj = js.Dictionary[js.Any](
        "HlsManifests" -> HlsManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.update("Encryption", __v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.update("SegmentDurationSeconds", __v.asInstanceOf[js.Any]))
      UseAudioRenditionGroup.foreach(__v => __obj.update("UseAudioRenditionGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsPackage]
    }
  }

  @js.native
  trait ListAssetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
  }

  object ListAssetsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): ListAssetsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsRequest]
    }
  }

  @js.native
  trait ListAssetsResponse extends js.Object {
    var Assets: js.UndefOr[__listOfAssetShallow]
    var NextToken: js.UndefOr[__string]
  }

  object ListAssetsResponse {
    def apply(
        Assets: js.UndefOr[__listOfAssetShallow] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListAssetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Assets.foreach(__v => __obj.update("Assets", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsResponse]
    }
  }

  @js.native
  trait ListPackagingConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
  }

  object ListPackagingConfigurationsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): ListPackagingConfigurationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingConfigurationsRequest]
    }
  }

  @js.native
  trait ListPackagingConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PackagingConfigurations: js.UndefOr[__listOfPackagingConfiguration]
  }

  object ListPackagingConfigurationsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingConfigurations: js.UndefOr[__listOfPackagingConfiguration] = js.undefined
    ): ListPackagingConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PackagingConfigurations.foreach(__v => __obj.update("PackagingConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingConfigurationsResponse]
    }
  }

  @js.native
  trait ListPackagingGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListPackagingGroupsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPackagingGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingGroupsRequest]
    }
  }

  @js.native
  trait ListPackagingGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PackagingGroups: js.UndefOr[__listOfPackagingGroup]
  }

  object ListPackagingGroupsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingGroups: js.UndefOr[__listOfPackagingGroup] = js.undefined
    ): ListPackagingGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PackagingGroups.foreach(__v => __obj.update("PackagingGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingGroupsResponse]
    }
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
      val __obj = js.Dictionary[js.Any](
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MssEncryption]
    }
  }

  /**
    * A Microsoft Smooth Streaming (MSS) manifest configuration.
    */
  @js.native
  trait MssManifest extends js.Object {
    var ManifestName: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object MssManifest {
    def apply(
        ManifestName: js.UndefOr[__string] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): MssManifest = {
      val __obj = js.Dictionary.empty[js.Any]
      ManifestName.foreach(__v => __obj.update("ManifestName", __v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.update("StreamSelection", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MssManifest]
    }
  }

  /**
    * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
    */
  @js.native
  trait MssPackage extends js.Object {
    var MssManifests: __listOfMssManifest
    var Encryption: js.UndefOr[MssEncryption]
    var SegmentDurationSeconds: js.UndefOr[__integer]
  }

  object MssPackage {
    def apply(
        MssManifests: __listOfMssManifest,
        Encryption: js.UndefOr[MssEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    ): MssPackage = {
      val __obj = js.Dictionary[js.Any](
        "MssManifests" -> MssManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.update("Encryption", __v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.update("SegmentDurationSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MssPackage]
    }
  }

  /**
    * A MediaPackage VOD PackagingConfiguration resource.
    */
  @js.native
  trait PackagingConfiguration extends js.Object {
    var Arn: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var PackagingGroupId: js.UndefOr[__string]
  }

  object PackagingConfiguration {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): PackagingConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.update("CmafPackage", __v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.update("DashPackage", __v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.update("HlsPackage", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.update("MssPackage", __v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.update("PackagingGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackagingConfiguration]
    }
  }

  /**
    * A MediaPackage VOD PackagingGroup resource.
    */
  @js.native
  trait PackagingGroup extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  object PackagingGroup {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined
    ): PackagingGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackagingGroup]
    }
  }

  object ProfileEnum {
    val NONE      = "NONE"
    val HBBTV_1_5 = "HBBTV_1_5"

    val values = js.Object.freeze(js.Array(NONE, HBBTV_1_5))
  }

  /**
    * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
    */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var RoleArn: __string
    var SystemIds: __listOf__string
    var Url: __string
  }

  object SpekeKeyProvider {
    def apply(
        RoleArn: __string,
        SystemIds: __listOf__string,
        Url: __string
    ): SpekeKeyProvider = {
      val __obj = js.Dictionary[js.Any](
        "RoleArn"   -> RoleArn.asInstanceOf[js.Any],
        "SystemIds" -> SystemIds.asInstanceOf[js.Any],
        "Url"       -> Url.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SpekeKeyProvider]
    }
  }

  object StreamOrderEnum {
    val ORIGINAL                 = "ORIGINAL"
    val VIDEO_BITRATE_ASCENDING  = "VIDEO_BITRATE_ASCENDING"
    val VIDEO_BITRATE_DESCENDING = "VIDEO_BITRATE_DESCENDING"

    val values = js.Object.freeze(js.Array(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING))
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
      val __obj = js.Dictionary.empty[js.Any]
      MaxVideoBitsPerSecond.foreach(__v => __obj.update("MaxVideoBitsPerSecond", __v.asInstanceOf[js.Any]))
      MinVideoBitsPerSecond.foreach(__v => __obj.update("MinVideoBitsPerSecond", __v.asInstanceOf[js.Any]))
      StreamOrder.foreach(__v => __obj.update("StreamOrder", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSelection]
    }
  }
}
