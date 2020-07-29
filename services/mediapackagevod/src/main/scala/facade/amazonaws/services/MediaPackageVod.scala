package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mediapackagevod {
  type MaxResults = Int
  type Tags = js.Dictionary[__string]
  type __boolean = Boolean
  type __integer = Int
  type __listOfAssetShallow = js.Array[AssetShallow]
  type __listOfDashManifest = js.Array[DashManifest]
  type __listOfEgressEndpoint = js.Array[EgressEndpoint]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfMssManifest = js.Array[MssManifest]
  type __listOfPackagingConfiguration = js.Array[PackagingConfiguration]
  type __listOfPackagingGroup = js.Array[PackagingGroup]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String

  implicit final class MediaPackageVodOps(private val service: MediaPackageVod) extends AnyVal {

    @inline def createAssetFuture(params: CreateAssetRequest): Future[CreateAssetResponse] = service.createAsset(params).promise().toFuture
    @inline def createPackagingConfigurationFuture(params: CreatePackagingConfigurationRequest): Future[CreatePackagingConfigurationResponse] = service.createPackagingConfiguration(params).promise().toFuture
    @inline def createPackagingGroupFuture(params: CreatePackagingGroupRequest): Future[CreatePackagingGroupResponse] = service.createPackagingGroup(params).promise().toFuture
    @inline def deleteAssetFuture(params: DeleteAssetRequest): Future[DeleteAssetResponse] = service.deleteAsset(params).promise().toFuture
    @inline def deletePackagingConfigurationFuture(params: DeletePackagingConfigurationRequest): Future[DeletePackagingConfigurationResponse] = service.deletePackagingConfiguration(params).promise().toFuture
    @inline def deletePackagingGroupFuture(params: DeletePackagingGroupRequest): Future[DeletePackagingGroupResponse] = service.deletePackagingGroup(params).promise().toFuture
    @inline def describeAssetFuture(params: DescribeAssetRequest): Future[DescribeAssetResponse] = service.describeAsset(params).promise().toFuture
    @inline def describePackagingConfigurationFuture(params: DescribePackagingConfigurationRequest): Future[DescribePackagingConfigurationResponse] = service.describePackagingConfiguration(params).promise().toFuture
    @inline def describePackagingGroupFuture(params: DescribePackagingGroupRequest): Future[DescribePackagingGroupResponse] = service.describePackagingGroup(params).promise().toFuture
    @inline def listAssetsFuture(params: ListAssetsRequest): Future[ListAssetsResponse] = service.listAssets(params).promise().toFuture
    @inline def listPackagingConfigurationsFuture(params: ListPackagingConfigurationsRequest): Future[ListPackagingConfigurationsResponse] = service.listPackagingConfigurations(params).promise().toFuture
    @inline def listPackagingGroupsFuture(params: ListPackagingGroupsRequest): Future[ListPackagingGroupsResponse] = service.listPackagingGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updatePackagingGroupFuture(params: UpdatePackagingGroupRequest): Future[UpdatePackagingGroupResponse] = service.updatePackagingGroup(params).promise().toFuture
  }
}

package mediapackagevod {
  @js.native
  @JSImport("aws-sdk", "MediaPackageVod", "AWS.MediaPackageVod")
  class MediaPackageVod() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAsset(params: CreateAssetRequest): Request[CreateAssetResponse] = js.native
    def createPackagingConfiguration(params: CreatePackagingConfigurationRequest): Request[CreatePackagingConfigurationResponse] = js.native
    def createPackagingGroup(params: CreatePackagingGroupRequest): Request[CreatePackagingGroupResponse] = js.native
    def deleteAsset(params: DeleteAssetRequest): Request[DeleteAssetResponse] = js.native
    def deletePackagingConfiguration(params: DeletePackagingConfigurationRequest): Request[DeletePackagingConfigurationResponse] = js.native
    def deletePackagingGroup(params: DeletePackagingGroupRequest): Request[DeletePackagingGroupResponse] = js.native
    def describeAsset(params: DescribeAssetRequest): Request[DescribeAssetResponse] = js.native
    def describePackagingConfiguration(params: DescribePackagingConfigurationRequest): Request[DescribePackagingConfigurationResponse] = js.native
    def describePackagingGroup(params: DescribePackagingGroupRequest): Request[DescribePackagingGroupResponse] = js.native
    def listAssets(params: ListAssetsRequest): Request[ListAssetsResponse] = js.native
    def listPackagingConfigurations(params: ListPackagingConfigurationsRequest): Request[ListPackagingConfigurationsResponse] = js.native
    def listPackagingGroups(params: ListPackagingGroupsRequest): Request[ListPackagingGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updatePackagingGroup(params: UpdatePackagingGroupRequest): Request[UpdatePackagingGroupResponse] = js.native
  }

  @js.native
  sealed trait AdMarkers extends js.Any
  object AdMarkers {
    val NONE = "NONE".asInstanceOf[AdMarkers]
    val SCTE35_ENHANCED = "SCTE35_ENHANCED".asInstanceOf[AdMarkers]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[AdMarkers]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH))
  }

  /**
    * A MediaPackage VOD Asset resource.
    */
  @js.native
  trait AssetShallow extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object AssetShallow {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        SourceRoleArn: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): AssetShallow = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceRoleArn.foreach(__v => __obj.updateDynamic("SourceRoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetShallow]
    }
  }

  /**
    * CDN Authorization credentials
    */
  @js.native
  trait Authorization extends js.Object {
    var CdnIdentifierSecret: __string
    var SecretsRoleArn: __string
  }

  object Authorization {
    @inline
    def apply(
        CdnIdentifierSecret: __string,
        SecretsRoleArn: __string
    ): Authorization = {
      val __obj = js.Dynamic.literal(
        "CdnIdentifierSecret" -> CdnIdentifierSecret.asInstanceOf[js.Any],
        "SecretsRoleArn" -> SecretsRoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Authorization]
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
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): CmafEncryption = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        HlsManifests: __listOfHlsManifest,
        Encryption: js.UndefOr[CmafEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    ): CmafPackage = {
      val __obj = js.Dynamic.literal(
        "HlsManifests" -> HlsManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[Tags]
  }

  object CreateAssetRequest {
    @inline
    def apply(
        Id: __string,
        PackagingGroupId: __string,
        SourceArn: __string,
        SourceRoleArn: __string,
        ResourceId: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateAssetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "PackagingGroupId" -> PackagingGroupId.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any],
        "SourceRoleArn" -> SourceRoleArn.asInstanceOf[js.Any]
      )

      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssetRequest]
    }
  }

  @js.native
  trait CreateAssetResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateAssetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfEgressEndpoint] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        SourceRoleArn: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateAssetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceRoleArn.foreach(__v => __obj.updateDynamic("SourceRoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[Tags]
  }

  object CreatePackagingConfigurationRequest {
    @inline
    def apply(
        Id: __string,
        PackagingGroupId: __string,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePackagingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "PackagingGroupId" -> PackagingGroupId.asInstanceOf[js.Any]
      )

      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[Tags]
  }

  object CreatePackagingConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePackagingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackagingConfigurationResponse]
    }
  }

  /**
    * A new MediaPackage VOD PackagingGroup resource configuration.
    */
  @js.native
  trait CreatePackagingGroupRequest extends js.Object {
    var Id: __string
    var Authorization: js.UndefOr[Authorization]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePackagingGroupRequest {
    @inline
    def apply(
        Id: __string,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePackagingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackagingGroupRequest]
    }
  }

  @js.native
  trait CreatePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePackagingGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        DomainName: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePackagingGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): DashEncryption = {
      val __obj = js.Dynamic.literal(
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
    var ManifestLayout: js.UndefOr[ManifestLayout]
    var ManifestName: js.UndefOr[__string]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var Profile: js.UndefOr[Profile]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object DashManifest {
    @inline
    def apply(
        ManifestLayout: js.UndefOr[ManifestLayout] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
        Profile: js.UndefOr[Profile] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): DashManifest = {
      val __obj = js.Dynamic.literal()
      ManifestLayout.foreach(__v => __obj.updateDynamic("ManifestLayout")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MinBufferTimeSeconds.foreach(__v => __obj.updateDynamic("MinBufferTimeSeconds")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
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
    var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat]
  }

  object DashPackage {
    @inline
    def apply(
        DashManifests: __listOfDashManifest,
        Encryption: js.UndefOr[DashEncryption] = js.undefined,
        PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat] = js.undefined
    ): DashPackage = {
      val __obj = js.Dynamic.literal(
        "DashManifests" -> DashManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      PeriodTriggers.foreach(__v => __obj.updateDynamic("PeriodTriggers")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      SegmentTemplateFormat.foreach(__v => __obj.updateDynamic("SegmentTemplateFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashPackage]
    }
  }

  @js.native
  trait DeleteAssetRequest extends js.Object {
    var Id: __string
  }

  object DeleteAssetRequest {
    @inline
    def apply(
        Id: __string
    ): DeleteAssetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAssetRequest]
    }
  }

  @js.native
  trait DeleteAssetResponse extends js.Object {}

  object DeleteAssetResponse {
    @inline
    def apply(
    ): DeleteAssetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteAssetResponse]
    }
  }

  @js.native
  trait DeletePackagingConfigurationRequest extends js.Object {
    var Id: __string
  }

  object DeletePackagingConfigurationRequest {
    @inline
    def apply(
        Id: __string
    ): DeletePackagingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePackagingConfigurationRequest]
    }
  }

  @js.native
  trait DeletePackagingConfigurationResponse extends js.Object {}

  object DeletePackagingConfigurationResponse {
    @inline
    def apply(
    ): DeletePackagingConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePackagingConfigurationResponse]
    }
  }

  @js.native
  trait DeletePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  object DeletePackagingGroupRequest {
    @inline
    def apply(
        Id: __string
    ): DeletePackagingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePackagingGroupRequest]
    }
  }

  @js.native
  trait DeletePackagingGroupResponse extends js.Object {}

  object DeletePackagingGroupResponse {
    @inline
    def apply(
    ): DeletePackagingGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePackagingGroupResponse]
    }
  }

  @js.native
  trait DescribeAssetRequest extends js.Object {
    var Id: __string
  }

  object DescribeAssetRequest {
    @inline
    def apply(
        Id: __string
    ): DescribeAssetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssetRequest]
    }
  }

  @js.native
  trait DescribeAssetResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint]
    var Id: js.UndefOr[__string]
    var PackagingGroupId: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var SourceRoleArn: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeAssetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfEgressEndpoint] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        SourceRoleArn: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeAssetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceRoleArn.foreach(__v => __obj.updateDynamic("SourceRoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssetResponse]
    }
  }

  @js.native
  trait DescribePackagingConfigurationRequest extends js.Object {
    var Id: __string
  }

  object DescribePackagingConfigurationRequest {
    @inline
    def apply(
        Id: __string
    ): DescribePackagingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
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
    var Tags: js.UndefOr[Tags]
  }

  object DescribePackagingConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribePackagingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackagingConfigurationResponse]
    }
  }

  @js.native
  trait DescribePackagingGroupRequest extends js.Object {
    var Id: __string
  }

  object DescribePackagingGroupRequest {
    @inline
    def apply(
        Id: __string
    ): DescribePackagingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePackagingGroupRequest]
    }
  }

  @js.native
  trait DescribePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object DescribePackagingGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        DomainName: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribePackagingGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        PackagingConfigurationId: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): EgressEndpoint = {
      val __obj = js.Dynamic.literal()
      PackagingConfigurationId.foreach(__v => __obj.updateDynamic("PackagingConfigurationId")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EgressEndpoint]
    }
  }

  @js.native
  sealed trait EncryptionMethod extends js.Any
  object EncryptionMethod {
    val AES_128 = "AES_128".asInstanceOf[EncryptionMethod]
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[EncryptionMethod]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
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
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        EncryptionMethod: js.UndefOr[EncryptionMethod] = js.undefined
    ): HlsEncryption = {
      val __obj = js.Dynamic.literal(
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      EncryptionMethod.foreach(__v => __obj.updateDynamic("EncryptionMethod")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        RepeatExtXKey: js.UndefOr[__boolean] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): HlsManifest = {
      val __obj = js.Dynamic.literal()
      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      IncludeIframeOnlyStream.foreach(__v => __obj.updateDynamic("IncludeIframeOnlyStream")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      ProgramDateTimeIntervalSeconds.foreach(__v => __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(__v.asInstanceOf[js.Any]))
      RepeatExtXKey.foreach(__v => __obj.updateDynamic("RepeatExtXKey")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        HlsManifests: __listOfHlsManifest,
        Encryption: js.UndefOr[HlsEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
    ): HlsPackage = {
      val __obj = js.Dynamic.literal(
        "HlsManifests" -> HlsManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      UseAudioRenditionGroup.foreach(__v => __obj.updateDynamic("UseAudioRenditionGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): ListAssetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsRequest]
    }
  }

  @js.native
  trait ListAssetsResponse extends js.Object {
    var Assets: js.UndefOr[__listOfAssetShallow]
    var NextToken: js.UndefOr[__string]
  }

  object ListAssetsResponse {
    @inline
    def apply(
        Assets: js.UndefOr[__listOfAssetShallow] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListAssetsResponse = {
      val __obj = js.Dynamic.literal()
      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined
    ): ListPackagingConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingConfigurationsRequest]
    }
  }

  @js.native
  trait ListPackagingConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PackagingConfigurations: js.UndefOr[__listOfPackagingConfiguration]
  }

  object ListPackagingConfigurationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingConfigurations: js.UndefOr[__listOfPackagingConfiguration] = js.undefined
    ): ListPackagingConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackagingConfigurations.foreach(__v => __obj.updateDynamic("PackagingConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingConfigurationsResponse]
    }
  }

  @js.native
  trait ListPackagingGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListPackagingGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPackagingGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingGroupsRequest]
    }
  }

  @js.native
  trait ListPackagingGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PackagingGroups: js.UndefOr[__listOfPackagingGroup]
  }

  object ListPackagingGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        PackagingGroups: js.UndefOr[__listOfPackagingGroup] = js.undefined
    ): ListPackagingGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackagingGroups.foreach(__v => __obj.updateDynamic("PackagingGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagingGroupsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait ManifestLayout extends js.Any
  object ManifestLayout {
    val FULL = "FULL".asInstanceOf[ManifestLayout]
    val COMPACT = "COMPACT".asInstanceOf[ManifestLayout]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FULL, COMPACT))
  }

  /**
    * A Microsoft Smooth Streaming (MSS) encryption configuration.
    */
  @js.native
  trait MssEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  object MssEncryption {
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): MssEncryption = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ManifestName: js.UndefOr[__string] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): MssManifest = {
      val __obj = js.Dynamic.literal()
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MssManifests: __listOfMssManifest,
        Encryption: js.UndefOr[MssEncryption] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    ): MssPackage = {
      val __obj = js.Dynamic.literal(
        "MssManifests" -> MssManifests.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[Tags]
  }

  object PackagingConfiguration {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        PackagingGroupId: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): PackagingConfiguration = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      PackagingGroupId.foreach(__v => __obj.updateDynamic("PackagingGroupId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackagingConfiguration]
    }
  }

  /**
    * A MediaPackage VOD PackagingGroup resource.
    */
  @js.native
  trait PackagingGroup extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object PackagingGroup {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        DomainName: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): PackagingGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackagingGroup]
    }
  }

  @js.native
  sealed trait Profile extends js.Any
  object Profile {
    val NONE = "NONE".asInstanceOf[Profile]
    val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[Profile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, HBBTV_1_5))
  }

  @js.native
  sealed trait SegmentTemplateFormat extends js.Any
  object SegmentTemplateFormat {
    val NUMBER_WITH_TIMELINE = "NUMBER_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
    val TIME_WITH_TIMELINE = "TIME_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
    val NUMBER_WITH_DURATION = "NUMBER_WITH_DURATION".asInstanceOf[SegmentTemplateFormat]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION))
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
    @inline
    def apply(
        RoleArn: __string,
        SystemIds: __listOf__string,
        Url: __string
    ): SpekeKeyProvider = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SystemIds" -> SystemIds.asInstanceOf[js.Any],
        "Url" -> Url.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SpekeKeyProvider]
    }
  }

  @js.native
  sealed trait StreamOrder extends js.Any
  object StreamOrder {
    val ORIGINAL = "ORIGINAL".asInstanceOf[StreamOrder]
    val VIDEO_BITRATE_ASCENDING = "VIDEO_BITRATE_ASCENDING".asInstanceOf[StreamOrder]
    val VIDEO_BITRATE_DESCENDING = "VIDEO_BITRATE_DESCENDING".asInstanceOf[StreamOrder]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
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
    @inline
    def apply(
        MaxVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
        MinVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
        StreamOrder: js.UndefOr[StreamOrder] = js.undefined
    ): StreamSelection = {
      val __obj = js.Dynamic.literal()
      MaxVideoBitsPerSecond.foreach(__v => __obj.updateDynamic("MaxVideoBitsPerSecond")(__v.asInstanceOf[js.Any]))
      MinVideoBitsPerSecond.foreach(__v => __obj.updateDynamic("MinVideoBitsPerSecond")(__v.asInstanceOf[js.Any]))
      StreamOrder.foreach(__v => __obj.updateDynamic("StreamOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSelection]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * A MediaPackage VOD PackagingGroup resource configuration.
    */
  @js.native
  trait UpdatePackagingGroupRequest extends js.Object {
    var Id: __string
    var Authorization: js.UndefOr[Authorization]
  }

  object UpdatePackagingGroupRequest {
    @inline
    def apply(
        Id: __string,
        Authorization: js.UndefOr[Authorization] = js.undefined
    ): UpdatePackagingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePackagingGroupRequest]
    }
  }

  @js.native
  trait UpdatePackagingGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var DomainName: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object UpdatePackagingGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        DomainName: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdatePackagingGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePackagingGroupResponse]
    }
  }

  @js.native
  sealed trait __PeriodTriggersElement extends js.Any
  object __PeriodTriggersElement {
    val ADS = "ADS".asInstanceOf[__PeriodTriggersElement]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ADS))
  }
}
