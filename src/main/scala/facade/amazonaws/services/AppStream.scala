package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object appstream {
  type AccountName                              = String
  type AccountPassword                          = String
  type Action                                   = String
  type Applications                             = js.Array[Application]
  type AppstreamAgentVersion                    = String
  type Arn                                      = String
  type ArnList                                  = js.Array[Arn]
  type AuthenticationType                       = String
  type AwsAccountId                             = String
  type AwsAccountIdList                         = js.Array[AwsAccountId]
  type BooleanObject                            = Boolean
  type DescribeImagesMaxResults                 = Int
  type Description                              = String
  type DirectoryConfigList                      = js.Array[DirectoryConfig]
  type DirectoryName                            = String
  type DirectoryNameList                        = js.Array[DirectoryName]
  type DisplayName                              = String
  type Domain                                   = String
  type DomainList                               = js.Array[Domain]
  type FeedbackURL                              = String
  type FleetAttribute                           = String
  type FleetAttributes                          = js.Array[FleetAttribute]
  type FleetErrorCode                           = String
  type FleetErrors                              = js.Array[FleetError]
  type FleetList                                = js.Array[Fleet]
  type FleetState                               = String
  type FleetType                                = String
  type ImageBuilderList                         = js.Array[ImageBuilder]
  type ImageBuilderState                        = String
  type ImageBuilderStateChangeReasonCode        = String
  type ImageList                                = js.Array[Image]
  type ImageState                               = String
  type ImageStateChangeReasonCode               = String
  type MaxResults                               = Int
  type MessageAction                            = String
  type Metadata                                 = js.Dictionary[String]
  type Name                                     = String
  type OrganizationalUnitDistinguishedName      = String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  type Permission                               = String
  type PlatformType                             = String
  type RedirectURL                              = String
  type RegionName                               = String
  type ResourceErrors                           = js.Array[ResourceError]
  type ResourceIdentifier                       = String
  type SecurityGroupIdList                      = js.Array[String]
  type SessionList                              = js.Array[Session]
  type SessionState                             = String
  type SettingsGroup                            = String
  type SharedImagePermissionsList               = js.Array[SharedImagePermissions]
  type StackAttribute                           = String
  type StackAttributes                          = js.Array[StackAttribute]
  type StackErrorCode                           = String
  type StackErrors                              = js.Array[StackError]
  type StackList                                = js.Array[Stack]
  type StorageConnectorList                     = js.Array[StorageConnector]
  type StorageConnectorType                     = String
  type StreamingUrlUserId                       = String
  type StringList                               = js.Array[String]
  type SubnetIdList                             = js.Array[String]
  type TagKey                                   = String
  type TagKeyList                               = js.Array[TagKey]
  type TagValue                                 = String
  type Tags                                     = js.Dictionary[TagValue]
  type Timestamp                                = js.Date
  type UserAttributeValue                       = String
  type UserId                                   = String
  type UserList                                 = js.Array[User]
  type UserSettingList                          = js.Array[UserSetting]
  type UserStackAssociationErrorCode            = String
  type UserStackAssociationErrorList            = js.Array[UserStackAssociationError]
  type UserStackAssociationList                 = js.Array[UserStackAssociation]
  type Username                                 = String
  type VisibilityType                           = String
}

package appstream {
  @js.native
  @JSImport("aws-sdk", "AppStream")
  class AppStream() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateFleet(params: AssociateFleetRequest): Request[AssociateFleetResult] = js.native
    def batchAssociateUserStack(params: BatchAssociateUserStackRequest): Request[BatchAssociateUserStackResult] =
      js.native
    def batchDisassociateUserStack(
        params: BatchDisassociateUserStackRequest
    ): Request[BatchDisassociateUserStackResult]                                                          = js.native
    def copyImage(params: CopyImageRequest): Request[CopyImageResponse]                                   = js.native
    def createDirectoryConfig(params: CreateDirectoryConfigRequest): Request[CreateDirectoryConfigResult] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResult]                               = js.native
    def createImageBuilder(params: CreateImageBuilderRequest): Request[CreateImageBuilderResult]          = js.native
    def createImageBuilderStreamingURL(
        params: CreateImageBuilderStreamingURLRequest
    ): Request[CreateImageBuilderStreamingURLResult]                                                         = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult]                                  = js.native
    def createStreamingURL(params: CreateStreamingURLRequest): Request[CreateStreamingURLResult]             = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResult]                                     = js.native
    def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): Request[DeleteDirectoryConfigResult]    = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResult]                                  = js.native
    def deleteImage(params: DeleteImageRequest): Request[DeleteImageResult]                                  = js.native
    def deleteImageBuilder(params: DeleteImageBuilderRequest): Request[DeleteImageBuilderResult]             = js.native
    def deleteImagePermissions(params: DeleteImagePermissionsRequest): Request[DeleteImagePermissionsResult] = js.native
    def deleteStack(params: DeleteStackRequest): Request[DeleteStackResult]                                  = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResult]                                     = js.native
    def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): Request[DescribeDirectoryConfigsResult] =
      js.native
    def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult]                      = js.native
    def describeImageBuilders(params: DescribeImageBuildersRequest): Request[DescribeImageBuildersResult] = js.native
    def describeImagePermissions(params: DescribeImagePermissionsRequest): Request[DescribeImagePermissionsResult] =
      js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult]       = js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResult] = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult]       = js.native
    def describeUserStackAssociations(
        params: DescribeUserStackAssociationsRequest
    ): Request[DescribeUserStackAssociationsResult]                                                          = js.native
    def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResult]                            = js.native
    def disableUser(params: DisableUserRequest): Request[DisableUserResult]                                  = js.native
    def disassociateFleet(params: DisassociateFleetRequest): Request[DisassociateFleetResult]                = js.native
    def enableUser(params: EnableUserRequest): Request[EnableUserResult]                                     = js.native
    def expireSession(params: ExpireSessionRequest): Request[ExpireSessionResult]                            = js.native
    def listAssociatedFleets(params: ListAssociatedFleetsRequest): Request[ListAssociatedFleetsResult]       = js.native
    def listAssociatedStacks(params: ListAssociatedStacksRequest): Request[ListAssociatedStacksResult]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]        = js.native
    def startFleet(params: StartFleetRequest): Request[StartFleetResult]                                     = js.native
    def startImageBuilder(params: StartImageBuilderRequest): Request[StartImageBuilderResult]                = js.native
    def stopFleet(params: StopFleetRequest): Request[StopFleetResult]                                        = js.native
    def stopImageBuilder(params: StopImageBuilderRequest): Request[StopImageBuilderResult]                   = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                                = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                          = js.native
    def updateDirectoryConfig(params: UpdateDirectoryConfigRequest): Request[UpdateDirectoryConfigResult]    = js.native
    def updateFleet(params: UpdateFleetRequest): Request[UpdateFleetResult]                                  = js.native
    def updateImagePermissions(params: UpdateImagePermissionsRequest): Request[UpdateImagePermissionsResult] = js.native
    def updateStack(params: UpdateStackRequest): Request[UpdateStackResult]                                  = js.native
  }

  object ActionEnum {
    val CLIPBOARD_COPY_FROM_LOCAL_DEVICE = "CLIPBOARD_COPY_FROM_LOCAL_DEVICE"
    val CLIPBOARD_COPY_TO_LOCAL_DEVICE   = "CLIPBOARD_COPY_TO_LOCAL_DEVICE"
    val FILE_UPLOAD                      = "FILE_UPLOAD"
    val FILE_DOWNLOAD                    = "FILE_DOWNLOAD"
    val PRINTING_TO_LOCAL_DEVICE         = "PRINTING_TO_LOCAL_DEVICE"

    val values = IndexedSeq(
      CLIPBOARD_COPY_FROM_LOCAL_DEVICE,
      CLIPBOARD_COPY_TO_LOCAL_DEVICE,
      FILE_UPLOAD,
      FILE_DOWNLOAD,
      PRINTING_TO_LOCAL_DEVICE
    )
  }

  /**
    * Describes an application in the application catalog.
    */
  @js.native
  trait Application extends js.Object {
    var DisplayName: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var IconURL: js.UndefOr[String]
    var LaunchParameters: js.UndefOr[String]
    var LaunchPath: js.UndefOr[String]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[String]
  }

  object Application {
    def apply(DisplayName: js.UndefOr[String] = js.undefined,
              Enabled: js.UndefOr[Boolean] = js.undefined,
              IconURL: js.UndefOr[String] = js.undefined,
              LaunchParameters: js.UndefOr[String] = js.undefined,
              LaunchPath: js.UndefOr[String] = js.undefined,
              Metadata: js.UndefOr[Metadata] = js.undefined,
              Name: js.UndefOr[String] = js.undefined): Application = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IconURL" -> IconURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchParameters" -> LaunchParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchPath" -> LaunchPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metadata" -> Metadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Application]
    }
  }

  /**
    * The persistent application settings for users of a stack.
    */
  @js.native
  trait ApplicationSettings extends js.Object {
    var Enabled: Boolean
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  object ApplicationSettings {
    def apply(Enabled: Boolean, SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined): ApplicationSettings = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Enabled" -> Enabled.asInstanceOf[js.Any], "SettingsGroup" -> SettingsGroup.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSettings]
    }
  }

  /**
    * Describes the persistent application settings for users of a stack.
    */
  @js.native
  trait ApplicationSettingsResponse extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  object ApplicationSettingsResponse {
    def apply(Enabled: js.UndefOr[Boolean] = js.undefined,
              S3BucketName: js.UndefOr[String] = js.undefined,
              SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined): ApplicationSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3BucketName" -> S3BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SettingsGroup" -> SettingsGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSettingsResponse]
    }
  }

  @js.native
  trait AssociateFleetRequest extends js.Object {
    var FleetName: String
    var StackName: String
  }

  object AssociateFleetRequest {
    def apply(FleetName: String, StackName: String): AssociateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateFleetRequest]
    }
  }

  @js.native
  trait AssociateFleetResult extends js.Object {}

  object AssociateFleetResult {
    def apply(): AssociateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateFleetResult]
    }
  }

  object AuthenticationTypeEnum {
    val API      = "API"
    val SAML     = "SAML"
    val USERPOOL = "USERPOOL"

    val values = IndexedSeq(API, SAML, USERPOOL)
  }

  @js.native
  trait BatchAssociateUserStackRequest extends js.Object {
    var UserStackAssociations: UserStackAssociationList
  }

  object BatchAssociateUserStackRequest {
    def apply(UserStackAssociations: UserStackAssociationList): BatchAssociateUserStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("UserStackAssociations" -> UserStackAssociations.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAssociateUserStackRequest]
    }
  }

  @js.native
  trait BatchAssociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  object BatchAssociateUserStackResult {
    def apply(errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined): BatchAssociateUserStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]("errors" -> errors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAssociateUserStackResult]
    }
  }

  @js.native
  trait BatchDisassociateUserStackRequest extends js.Object {
    var UserStackAssociations: UserStackAssociationList
  }

  object BatchDisassociateUserStackRequest {
    def apply(UserStackAssociations: UserStackAssociationList): BatchDisassociateUserStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("UserStackAssociations" -> UserStackAssociations.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisassociateUserStackRequest]
    }
  }

  @js.native
  trait BatchDisassociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  object BatchDisassociateUserStackResult {
    def apply(errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined): BatchDisassociateUserStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]("errors" -> errors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisassociateUserStackResult]
    }
  }

  /**
    * Describes the capacity for a fleet.
    */
  @js.native
  trait ComputeCapacity extends js.Object {
    var DesiredInstances: Int
  }

  object ComputeCapacity {
    def apply(DesiredInstances: Int): ComputeCapacity = {
      val _fields = IndexedSeq[(String, js.Any)]("DesiredInstances" -> DesiredInstances.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeCapacity]
    }
  }

  /**
    * Describes the capacity status for a fleet.
    */
  @js.native
  trait ComputeCapacityStatus extends js.Object {
    var Desired: Int
    var Available: js.UndefOr[Int]
    var InUse: js.UndefOr[Int]
    var Running: js.UndefOr[Int]
  }

  object ComputeCapacityStatus {
    def apply(Desired: Int,
              Available: js.UndefOr[Int] = js.undefined,
              InUse: js.UndefOr[Int] = js.undefined,
              Running: js.UndefOr[Int] = js.undefined): ComputeCapacityStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Desired" -> Desired.asInstanceOf[js.Any],
        "Available" -> Available.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InUse" -> InUse.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Running" -> Running.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeCapacityStatus]
    }
  }

  @js.native
  trait CopyImageRequest extends js.Object {
    var DestinationImageName: Name
    var DestinationRegion: RegionName
    var SourceImageName: Name
    var DestinationImageDescription: js.UndefOr[Description]
  }

  object CopyImageRequest {
    def apply(DestinationImageName: Name,
              DestinationRegion: RegionName,
              SourceImageName: Name,
              DestinationImageDescription: js.UndefOr[Description] = js.undefined): CopyImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationImageName" -> DestinationImageName.asInstanceOf[js.Any],
        "DestinationRegion"    -> DestinationRegion.asInstanceOf[js.Any],
        "SourceImageName"      -> SourceImageName.asInstanceOf[js.Any],
        "DestinationImageDescription" -> DestinationImageDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageRequest]
    }
  }

  @js.native
  trait CopyImageResponse extends js.Object {
    var DestinationImageName: js.UndefOr[Name]
  }

  object CopyImageResponse {
    def apply(DestinationImageName: js.UndefOr[Name] = js.undefined): CopyImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DestinationImageName" -> DestinationImageName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageResponse]
    }
  }

  @js.native
  trait CreateDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
    var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
    var ServiceAccountCredentials: ServiceAccountCredentials
  }

  object CreateDirectoryConfigRequest {
    def apply(DirectoryName: DirectoryName,
              OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList,
              ServiceAccountCredentials: ServiceAccountCredentials): CreateDirectoryConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName"                        -> DirectoryName.asInstanceOf[js.Any],
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any],
        "ServiceAccountCredentials"            -> ServiceAccountCredentials.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryConfigRequest]
    }
  }

  @js.native
  trait CreateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  object CreateDirectoryConfigResult {
    def apply(DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined): CreateDirectoryConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DirectoryConfig" -> DirectoryConfig.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryConfigResult]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var ComputeCapacity: ComputeCapacity
    var InstanceType: String
    var Name: Name
    var Description: js.UndefOr[Description]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var FleetType: js.UndefOr[FleetType]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateFleetRequest {
    def apply(ComputeCapacity: ComputeCapacity,
              InstanceType: String,
              Name: Name,
              Description: js.UndefOr[Description] = js.undefined,
              DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
              DisplayName: js.UndefOr[DisplayName] = js.undefined,
              DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
              EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
              FleetType: js.UndefOr[FleetType] = js.undefined,
              ImageArn: js.UndefOr[Arn] = js.undefined,
              ImageName: js.UndefOr[String] = js.undefined,
              MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined,
              VpcConfig: js.UndefOr[VpcConfig] = js.undefined): CreateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComputeCapacity" -> ComputeCapacity.asInstanceOf[js.Any],
        "InstanceType"    -> InstanceType.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisconnectTimeoutInSeconds" -> DisconnectTimeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainJoinInfo" -> DomainJoinInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetType" -> FleetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageArn" -> ImageArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageName" -> ImageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxUserDurationInSeconds" -> MaxUserDurationInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  object CreateFleetResult {
    def apply(Fleet: js.UndefOr[Fleet] = js.undefined): CreateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Fleet" -> Fleet.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetResult]
    }
  }

  @js.native
  trait CreateImageBuilderRequest extends js.Object {
    var InstanceType: String
    var Name: Name
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateImageBuilderRequest {
    def apply(InstanceType: String,
              Name: Name,
              AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              DisplayName: js.UndefOr[DisplayName] = js.undefined,
              DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
              EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
              ImageArn: js.UndefOr[Arn] = js.undefined,
              ImageName: js.UndefOr[String] = js.undefined,
              VpcConfig: js.UndefOr[VpcConfig] = js.undefined): CreateImageBuilderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainJoinInfo" -> DomainJoinInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageArn" -> ImageArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageName" -> ImageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderRequest]
    }
  }

  @js.native
  trait CreateImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object CreateImageBuilderResult {
    def apply(ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): CreateImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ImageBuilder" -> ImageBuilder.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderResult]
    }
  }

  @js.native
  trait CreateImageBuilderStreamingURLRequest extends js.Object {
    var Name: String
    var Validity: js.UndefOr[Double]
  }

  object CreateImageBuilderStreamingURLRequest {
    def apply(Name: String, Validity: js.UndefOr[Double] = js.undefined): CreateImageBuilderStreamingURLRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any], "Validity" -> Validity.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderStreamingURLRequest]
    }
  }

  @js.native
  trait CreateImageBuilderStreamingURLResult extends js.Object {
    var Expires: js.UndefOr[Timestamp]
    var StreamingURL: js.UndefOr[String]
  }

  object CreateImageBuilderStreamingURLResult {
    def apply(Expires: js.UndefOr[Timestamp] = js.undefined,
              StreamingURL: js.UndefOr[String] = js.undefined): CreateImageBuilderStreamingURLResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Expires" -> Expires.map { x =>
        x.asInstanceOf[js.Any]
      }, "StreamingURL" -> StreamingURL.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderStreamingURLResult]
    }
  }

  @js.native
  trait CreateStackRequest extends js.Object {
    var Name: Name
    var ApplicationSettings: js.UndefOr[ApplicationSettings]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var UserSettings: js.UndefOr[UserSettingList]
  }

  object CreateStackRequest {
    def apply(Name: Name,
              ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              DisplayName: js.UndefOr[DisplayName] = js.undefined,
              FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
              RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
              StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
              UserSettings: js.UndefOr[UserSettingList] = js.undefined): CreateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "ApplicationSettings" -> ApplicationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeedbackURL" -> FeedbackURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RedirectURL" -> RedirectURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageConnectors" -> StorageConnectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserSettings" -> UserSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackRequest]
    }
  }

  @js.native
  trait CreateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  object CreateStackResult {
    def apply(Stack: js.UndefOr[Stack] = js.undefined): CreateStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Stack" -> Stack.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackResult]
    }
  }

  @js.native
  trait CreateStreamingURLRequest extends js.Object {
    var FleetName: String
    var StackName: String
    var UserId: StreamingUrlUserId
    var ApplicationId: js.UndefOr[String]
    var SessionContext: js.UndefOr[String]
    var Validity: js.UndefOr[Double]
  }

  object CreateStreamingURLRequest {
    def apply(FleetName: String,
              StackName: String,
              UserId: StreamingUrlUserId,
              ApplicationId: js.UndefOr[String] = js.undefined,
              SessionContext: js.UndefOr[String] = js.undefined,
              Validity: js.UndefOr[Double] = js.undefined): CreateStreamingURLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionContext" -> SessionContext.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Validity" -> Validity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingURLRequest]
    }
  }

  @js.native
  trait CreateStreamingURLResult extends js.Object {
    var Expires: js.UndefOr[Timestamp]
    var StreamingURL: js.UndefOr[String]
  }

  object CreateStreamingURLResult {
    def apply(Expires: js.UndefOr[Timestamp] = js.undefined,
              StreamingURL: js.UndefOr[String] = js.undefined): CreateStreamingURLResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Expires" -> Expires.map { x =>
        x.asInstanceOf[js.Any]
      }, "StreamingURL" -> StreamingURL.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingURLResult]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
    var FirstName: js.UndefOr[UserAttributeValue]
    var LastName: js.UndefOr[UserAttributeValue]
    var MessageAction: js.UndefOr[MessageAction]
  }

  object CreateUserRequest {
    def apply(AuthenticationType: AuthenticationType,
              UserName: Username,
              FirstName: js.UndefOr[UserAttributeValue] = js.undefined,
              LastName: js.UndefOr[UserAttributeValue] = js.undefined,
              MessageAction: js.UndefOr[MessageAction] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName"           -> UserName.asInstanceOf[js.Any],
        "FirstName" -> FirstName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastName" -> LastName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageAction" -> MessageAction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResult extends js.Object {}

  object CreateUserResult {
    def apply(): CreateUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResult]
    }
  }

  @js.native
  trait DeleteDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
  }

  object DeleteDirectoryConfigRequest {
    def apply(DirectoryName: DirectoryName): DeleteDirectoryConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DirectoryName" -> DirectoryName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryConfigRequest]
    }
  }

  @js.native
  trait DeleteDirectoryConfigResult extends js.Object {}

  object DeleteDirectoryConfigResult {
    def apply(): DeleteDirectoryConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryConfigResult]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var Name: String
  }

  object DeleteFleetRequest {
    def apply(Name: String): DeleteFleetRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResult extends js.Object {}

  object DeleteFleetResult {
    def apply(): DeleteFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetResult]
    }
  }

  @js.native
  trait DeleteImageBuilderRequest extends js.Object {
    var Name: Name
  }

  object DeleteImageBuilderRequest {
    def apply(Name: Name): DeleteImageBuilderRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageBuilderRequest]
    }
  }

  @js.native
  trait DeleteImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object DeleteImageBuilderResult {
    def apply(ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): DeleteImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ImageBuilder" -> ImageBuilder.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageBuilderResult]
    }
  }

  @js.native
  trait DeleteImagePermissionsRequest extends js.Object {
    var Name: Name
    var SharedAccountId: AwsAccountId
  }

  object DeleteImagePermissionsRequest {
    def apply(Name: Name, SharedAccountId: AwsAccountId): DeleteImagePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"            -> Name.asInstanceOf[js.Any],
        "SharedAccountId" -> SharedAccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImagePermissionsRequest]
    }
  }

  @js.native
  trait DeleteImagePermissionsResult extends js.Object {}

  object DeleteImagePermissionsResult {
    def apply(): DeleteImagePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImagePermissionsResult]
    }
  }

  @js.native
  trait DeleteImageRequest extends js.Object {
    var Name: Name
  }

  object DeleteImageRequest {
    def apply(Name: Name): DeleteImageRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageRequest]
    }
  }

  @js.native
  trait DeleteImageResult extends js.Object {
    var Image: js.UndefOr[Image]
  }

  object DeleteImageResult {
    def apply(Image: js.UndefOr[Image] = js.undefined): DeleteImageResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Image" -> Image.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageResult]
    }
  }

  @js.native
  trait DeleteStackRequest extends js.Object {
    var Name: String
  }

  object DeleteStackRequest {
    def apply(Name: String): DeleteStackRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackRequest]
    }
  }

  @js.native
  trait DeleteStackResult extends js.Object {}

  object DeleteStackResult {
    def apply(): DeleteStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackResult]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  object DeleteUserRequest {
    def apply(AuthenticationType: AuthenticationType, UserName: Username): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName"           -> UserName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResult extends js.Object {}

  object DeleteUserResult {
    def apply(): DeleteUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserResult]
    }
  }

  @js.native
  trait DescribeDirectoryConfigsRequest extends js.Object {
    var DirectoryNames: js.UndefOr[DirectoryNameList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDirectoryConfigsRequest {
    def apply(DirectoryNames: js.UndefOr[DirectoryNameList] = js.undefined,
              MaxResults: js.UndefOr[Int] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeDirectoryConfigsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryNames" -> DirectoryNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectoryConfigsRequest]
    }
  }

  @js.native
  trait DescribeDirectoryConfigsResult extends js.Object {
    var DirectoryConfigs: js.UndefOr[DirectoryConfigList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDirectoryConfigsResult {
    def apply(DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeDirectoryConfigsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DirectoryConfigs" -> DirectoryConfigs.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectoryConfigsResult]
    }
  }

  @js.native
  trait DescribeFleetsRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsRequest {
    def apply(Names: js.UndefOr[StringList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeFleetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Names" -> Names.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsRequest]
    }
  }

  @js.native
  trait DescribeFleetsResult extends js.Object {
    var Fleets: js.UndefOr[FleetList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsResult {
    def apply(Fleets: js.UndefOr[FleetList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeFleetsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Fleets" -> Fleets.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsResult]
    }
  }

  @js.native
  trait DescribeImageBuildersRequest extends js.Object {
    var MaxResults: js.UndefOr[Int]
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImageBuildersRequest {
    def apply(MaxResults: js.UndefOr[Int] = js.undefined,
              Names: js.UndefOr[StringList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeImageBuildersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Names" -> Names.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImageBuildersRequest]
    }
  }

  @js.native
  trait DescribeImageBuildersResult extends js.Object {
    var ImageBuilders: js.UndefOr[ImageBuilderList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImageBuildersResult {
    def apply(ImageBuilders: js.UndefOr[ImageBuilderList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeImageBuildersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ImageBuilders" -> ImageBuilders.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImageBuildersResult]
    }
  }

  @js.native
  trait DescribeImagePermissionsRequest extends js.Object {
    var Name: Name
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList]
  }

  object DescribeImagePermissionsRequest {
    def apply(Name: Name,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.undefined): DescribeImagePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SharedAwsAccountIds" -> SharedAwsAccountIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagePermissionsRequest]
    }
  }

  @js.native
  trait DescribeImagePermissionsResult extends js.Object {
    var Name: js.UndefOr[Name]
    var NextToken: js.UndefOr[String]
    var SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList]
  }

  object DescribeImagePermissionsResult {
    def apply(
        Name: js.UndefOr[Name] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList] = js.undefined
    ): DescribeImagePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SharedImagePermissionsList" -> SharedImagePermissionsList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagePermissionsResult]
    }
  }

  @js.native
  trait DescribeImagesRequest extends js.Object {
    var Arns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[DescribeImagesMaxResults]
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
    var Type: js.UndefOr[VisibilityType]
  }

  object DescribeImagesRequest {
    def apply(Arns: js.UndefOr[ArnList] = js.undefined,
              MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.undefined,
              Names: js.UndefOr[StringList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[VisibilityType] = js.undefined): DescribeImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arns" -> Arns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Names" -> Names.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesRequest]
    }
  }

  @js.native
  trait DescribeImagesResult extends js.Object {
    var Images: js.UndefOr[ImageList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImagesResult {
    def apply(Images: js.UndefOr[ImageList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Images" -> Images.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesResult]
    }
  }

  @js.native
  trait DescribeSessionsRequest extends js.Object {
    var FleetName: String
    var StackName: String
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var Limit: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var UserId: js.UndefOr[UserId]
  }

  object DescribeSessionsRequest {
    def apply(FleetName: String,
              StackName: String,
              AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
              Limit: js.UndefOr[Int] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              UserId: js.UndefOr[UserId] = js.undefined): DescribeSessionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "AuthenticationType" -> AuthenticationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserId" -> UserId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsRequest]
    }
  }

  @js.native
  trait DescribeSessionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Sessions: js.UndefOr[SessionList]
  }

  object DescribeSessionsResult {
    def apply(NextToken: js.UndefOr[String] = js.undefined,
              Sessions: js.UndefOr[SessionList] = js.undefined): DescribeSessionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Sessions" -> Sessions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsResult]
    }
  }

  @js.native
  trait DescribeStacksRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeStacksRequest {
    def apply(Names: js.UndefOr[StringList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeStacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Names" -> Names.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksRequest]
    }
  }

  @js.native
  trait DescribeStacksResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Stacks: js.UndefOr[StackList]
  }

  object DescribeStacksResult {
    def apply(NextToken: js.UndefOr[String] = js.undefined,
              Stacks: js.UndefOr[StackList] = js.undefined): DescribeStacksResult = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Stacks" -> Stacks.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksResult]
    }
  }

  @js.native
  trait DescribeUserStackAssociationsRequest extends js.Object {
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var StackName: js.UndefOr[String]
    var UserName: js.UndefOr[Username]
  }

  object DescribeUserStackAssociationsRequest {
    def apply(AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              StackName: js.UndefOr[String] = js.undefined,
              UserName: js.UndefOr[Username] = js.undefined): DescribeUserStackAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackName" -> StackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserName" -> UserName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserStackAssociationsRequest]
    }
  }

  @js.native
  trait DescribeUserStackAssociationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var UserStackAssociations: js.UndefOr[UserStackAssociationList]
  }

  object DescribeUserStackAssociationsResult {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined
    ): DescribeUserStackAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "UserStackAssociations" -> UserStackAssociations.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserStackAssociationsResult]
    }
  }

  @js.native
  trait DescribeUsersRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUsersRequest {
    def apply(AuthenticationType: AuthenticationType,
              MaxResults: js.UndefOr[Int] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUsersRequest]
    }
  }

  @js.native
  trait DescribeUsersResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  object DescribeUsersResult {
    def apply(NextToken: js.UndefOr[String] = js.undefined,
              Users: js.UndefOr[UserList] = js.undefined): DescribeUsersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Users" -> Users.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUsersResult]
    }
  }

  /**
    * Configuration information for the directory used to join domains.
    */
  @js.native
  trait DirectoryConfig extends js.Object {
    var DirectoryName: DirectoryName
    var CreatedTime: js.UndefOr[Timestamp]
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object DirectoryConfig {
    def apply(DirectoryName: DirectoryName,
              CreatedTime: js.UndefOr[Timestamp] = js.undefined,
              OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
              ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined): DirectoryConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceAccountCredentials" -> ServiceAccountCredentials.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryConfig]
    }
  }

  @js.native
  trait DisableUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  object DisableUserRequest {
    def apply(AuthenticationType: AuthenticationType, UserName: Username): DisableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName"           -> UserName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableUserRequest]
    }
  }

  @js.native
  trait DisableUserResult extends js.Object {}

  object DisableUserResult {
    def apply(): DisableUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableUserResult]
    }
  }

  @js.native
  trait DisassociateFleetRequest extends js.Object {
    var FleetName: String
    var StackName: String
  }

  object DisassociateFleetRequest {
    def apply(FleetName: String, StackName: String): DisassociateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFleetRequest]
    }
  }

  @js.native
  trait DisassociateFleetResult extends js.Object {}

  object DisassociateFleetResult {
    def apply(): DisassociateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFleetResult]
    }
  }

  /**
    * Contains the information needed to join a Microsoft Active Directory domain.
    */
  @js.native
  trait DomainJoinInfo extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
  }

  object DomainJoinInfo {
    def apply(
        DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
        OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined
    ): DomainJoinInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrganizationalUnitDistinguishedName" -> OrganizationalUnitDistinguishedName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainJoinInfo]
    }
  }

  @js.native
  trait EnableUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  object EnableUserRequest {
    def apply(AuthenticationType: AuthenticationType, UserName: Username): EnableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName"           -> UserName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableUserRequest]
    }
  }

  @js.native
  trait EnableUserResult extends js.Object {}

  object EnableUserResult {
    def apply(): EnableUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableUserResult]
    }
  }

  @js.native
  trait ExpireSessionRequest extends js.Object {
    var SessionId: String
  }

  object ExpireSessionRequest {
    def apply(SessionId: String): ExpireSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("SessionId" -> SessionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpireSessionRequest]
    }
  }

  @js.native
  trait ExpireSessionResult extends js.Object {}

  object ExpireSessionResult {
    def apply(): ExpireSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpireSessionResult]
    }
  }

  /**
    * Contains the parameters for a fleet.
    */
  @js.native
  trait Fleet extends js.Object {
    var Arn: Arn
    var ComputeCapacityStatus: ComputeCapacityStatus
    var InstanceType: String
    var Name: String
    var State: FleetState
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var DisplayName: js.UndefOr[String]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var FleetErrors: js.UndefOr[FleetErrors]
    var FleetType: js.UndefOr[FleetType]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object Fleet {
    def apply(Arn: Arn,
              ComputeCapacityStatus: ComputeCapacityStatus,
              InstanceType: String,
              Name: String,
              State: FleetState,
              CreatedTime: js.UndefOr[Timestamp] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
              DisplayName: js.UndefOr[String] = js.undefined,
              DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
              EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
              FleetErrors: js.UndefOr[FleetErrors] = js.undefined,
              FleetType: js.UndefOr[FleetType] = js.undefined,
              ImageArn: js.UndefOr[Arn] = js.undefined,
              ImageName: js.UndefOr[String] = js.undefined,
              MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined,
              VpcConfig: js.UndefOr[VpcConfig] = js.undefined): Fleet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn"                   -> Arn.asInstanceOf[js.Any],
        "ComputeCapacityStatus" -> ComputeCapacityStatus.asInstanceOf[js.Any],
        "InstanceType"          -> InstanceType.asInstanceOf[js.Any],
        "Name"                  -> Name.asInstanceOf[js.Any],
        "State"                 -> State.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisconnectTimeoutInSeconds" -> DisconnectTimeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainJoinInfo" -> DomainJoinInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetErrors" -> FleetErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetType" -> FleetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageArn" -> ImageArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageName" -> ImageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxUserDurationInSeconds" -> MaxUserDurationInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Fleet]
    }
  }

  /**
    * The fleet attribute.
    */
  object FleetAttributeEnum {
    val VPC_CONFIGURATION                    = "VPC_CONFIGURATION"
    val VPC_CONFIGURATION_SECURITY_GROUP_IDS = "VPC_CONFIGURATION_SECURITY_GROUP_IDS"
    val DOMAIN_JOIN_INFO                     = "DOMAIN_JOIN_INFO"

    val values = IndexedSeq(VPC_CONFIGURATION, VPC_CONFIGURATION_SECURITY_GROUP_IDS, DOMAIN_JOIN_INFO)
  }

  /**
    * Describes a fleet error.
    */
  @js.native
  trait FleetError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object FleetError {
    def apply(ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined,
              ErrorMessage: js.UndefOr[String] = js.undefined): FleetError = {
      val _fields = IndexedSeq[(String, js.Any)]("ErrorCode" -> ErrorCode.map { x =>
        x.asInstanceOf[js.Any]
      }, "ErrorMessage" -> ErrorMessage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetError]
    }
  }

  object FleetErrorCodeEnum {
    val IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION    = "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION"
    val IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION      = "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION"
    val IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION      = "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION"
    val NETWORK_INTERFACE_LIMIT_EXCEEDED                = "NETWORK_INTERFACE_LIMIT_EXCEEDED"
    val INTERNAL_SERVICE_ERROR                          = "INTERNAL_SERVICE_ERROR"
    val IAM_SERVICE_ROLE_IS_MISSING                     = "IAM_SERVICE_ROLE_IS_MISSING"
    val SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES            = "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES"
    val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION = "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION"
    val SUBNET_NOT_FOUND                                = "SUBNET_NOT_FOUND"
    val IMAGE_NOT_FOUND                                 = "IMAGE_NOT_FOUND"
    val INVALID_SUBNET_CONFIGURATION                    = "INVALID_SUBNET_CONFIGURATION"
    val SECURITY_GROUPS_NOT_FOUND                       = "SECURITY_GROUPS_NOT_FOUND"
    val IGW_NOT_ATTACHED                                = "IGW_NOT_ATTACHED"
    val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION =
      "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION"
    val DOMAIN_JOIN_ERROR_FILE_NOT_FOUND                    = "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND"
    val DOMAIN_JOIN_ERROR_ACCESS_DENIED                     = "DOMAIN_JOIN_ERROR_ACCESS_DENIED"
    val DOMAIN_JOIN_ERROR_LOGON_FAILURE                     = "DOMAIN_JOIN_ERROR_LOGON_FAILURE"
    val DOMAIN_JOIN_ERROR_INVALID_PARAMETER                 = "DOMAIN_JOIN_ERROR_INVALID_PARAMETER"
    val DOMAIN_JOIN_ERROR_MORE_DATA                         = "DOMAIN_JOIN_ERROR_MORE_DATA"
    val DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN                    = "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN"
    val DOMAIN_JOIN_ERROR_NOT_SUPPORTED                     = "DOMAIN_JOIN_ERROR_NOT_SUPPORTED"
    val DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME             = "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME"
    val DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED            = "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED"
    val DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED = "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED"
    val DOMAIN_JOIN_NERR_PASSWORD_EXPIRED                   = "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED"
    val DOMAIN_JOIN_INTERNAL_SERVICE_ERROR                  = "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR"

    val values = IndexedSeq(
      IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION,
      IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION,
      IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION,
      NETWORK_INTERFACE_LIMIT_EXCEEDED,
      INTERNAL_SERVICE_ERROR,
      IAM_SERVICE_ROLE_IS_MISSING,
      SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES,
      IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION,
      SUBNET_NOT_FOUND,
      IMAGE_NOT_FOUND,
      INVALID_SUBNET_CONFIGURATION,
      SECURITY_GROUPS_NOT_FOUND,
      IGW_NOT_ATTACHED,
      IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION,
      DOMAIN_JOIN_ERROR_FILE_NOT_FOUND,
      DOMAIN_JOIN_ERROR_ACCESS_DENIED,
      DOMAIN_JOIN_ERROR_LOGON_FAILURE,
      DOMAIN_JOIN_ERROR_INVALID_PARAMETER,
      DOMAIN_JOIN_ERROR_MORE_DATA,
      DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN,
      DOMAIN_JOIN_ERROR_NOT_SUPPORTED,
      DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME,
      DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED,
      DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED,
      DOMAIN_JOIN_NERR_PASSWORD_EXPIRED,
      DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
    )
  }

  object FleetStateEnum {
    val STARTING = "STARTING"
    val RUNNING  = "RUNNING"
    val STOPPING = "STOPPING"
    val STOPPED  = "STOPPED"

    val values = IndexedSeq(STARTING, RUNNING, STOPPING, STOPPED)
  }

  object FleetTypeEnum {
    val ALWAYS_ON = "ALWAYS_ON"
    val ON_DEMAND = "ON_DEMAND"

    val values = IndexedSeq(ALWAYS_ON, ON_DEMAND)
  }

  /**
    * Describes an image.
    */
  @js.native
  trait Image extends js.Object {
    var Name: String
    var Applications: js.UndefOr[Applications]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var Arn: js.UndefOr[Arn]
    var BaseImageArn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var ImageBuilderSupported: js.UndefOr[Boolean]
    var ImagePermissions: js.UndefOr[ImagePermissions]
    var Platform: js.UndefOr[PlatformType]
    var PublicBaseImageReleasedDate: js.UndefOr[Timestamp]
    var State: js.UndefOr[ImageState]
    var StateChangeReason: js.UndefOr[ImageStateChangeReason]
    var Visibility: js.UndefOr[VisibilityType]
  }

  object Image {
    def apply(Name: String,
              Applications: js.UndefOr[Applications] = js.undefined,
              AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
              Arn: js.UndefOr[Arn] = js.undefined,
              BaseImageArn: js.UndefOr[Arn] = js.undefined,
              CreatedTime: js.UndefOr[Timestamp] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              DisplayName: js.UndefOr[String] = js.undefined,
              ImageBuilderSupported: js.UndefOr[Boolean] = js.undefined,
              ImagePermissions: js.UndefOr[ImagePermissions] = js.undefined,
              Platform: js.UndefOr[PlatformType] = js.undefined,
              PublicBaseImageReleasedDate: js.UndefOr[Timestamp] = js.undefined,
              State: js.UndefOr[ImageState] = js.undefined,
              StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.undefined,
              Visibility: js.UndefOr[VisibilityType] = js.undefined): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Applications" -> Applications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BaseImageArn" -> BaseImageArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageBuilderSupported" -> ImageBuilderSupported.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImagePermissions" -> ImagePermissions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicBaseImageReleasedDate" -> PublicBaseImageReleasedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Visibility" -> Visibility.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  /**
    * Describes a streaming instance used for editing an image. New images are created from a snapshot through an image builder.
    */
  @js.native
  trait ImageBuilder extends js.Object {
    var Name: String
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var ImageArn: js.UndefOr[Arn]
    var ImageBuilderErrors: js.UndefOr[ResourceErrors]
    var InstanceType: js.UndefOr[String]
    var Platform: js.UndefOr[PlatformType]
    var State: js.UndefOr[ImageBuilderState]
    var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object ImageBuilder {
    def apply(Name: String,
              AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
              Arn: js.UndefOr[Arn] = js.undefined,
              CreatedTime: js.UndefOr[Timestamp] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              DisplayName: js.UndefOr[String] = js.undefined,
              DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
              EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
              ImageArn: js.UndefOr[Arn] = js.undefined,
              ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.undefined,
              InstanceType: js.UndefOr[String] = js.undefined,
              Platform: js.UndefOr[PlatformType] = js.undefined,
              State: js.UndefOr[ImageBuilderState] = js.undefined,
              StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.undefined,
              VpcConfig: js.UndefOr[VpcConfig] = js.undefined): ImageBuilder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainJoinInfo" -> DomainJoinInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageArn" -> ImageArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageBuilderErrors" -> ImageBuilderErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageBuilder]
    }
  }

  object ImageBuilderStateEnum {
    val PENDING        = "PENDING"
    val UPDATING_AGENT = "UPDATING_AGENT"
    val RUNNING        = "RUNNING"
    val STOPPING       = "STOPPING"
    val STOPPED        = "STOPPED"
    val REBOOTING      = "REBOOTING"
    val SNAPSHOTTING   = "SNAPSHOTTING"
    val DELETING       = "DELETING"
    val FAILED         = "FAILED"

    val values =
      IndexedSeq(PENDING, UPDATING_AGENT, RUNNING, STOPPING, STOPPED, REBOOTING, SNAPSHOTTING, DELETING, FAILED)
  }

  /**
    * Describes the reason why the last image builder state change occurred.
    */
  @js.native
  trait ImageBuilderStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageBuilderStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ImageBuilderStateChangeReason {
    def apply(Code: js.UndefOr[ImageBuilderStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): ImageBuilderStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageBuilderStateChangeReason]
    }
  }

  object ImageBuilderStateChangeReasonCodeEnum {
    val INTERNAL_ERROR    = "INTERNAL_ERROR"
    val IMAGE_UNAVAILABLE = "IMAGE_UNAVAILABLE"

    val values = IndexedSeq(INTERNAL_ERROR, IMAGE_UNAVAILABLE)
  }

  /**
    * Describes the permissions for an image.
    */
  @js.native
  trait ImagePermissions extends js.Object {
    var allowFleet: js.UndefOr[BooleanObject]
    var allowImageBuilder: js.UndefOr[BooleanObject]
  }

  object ImagePermissions {
    def apply(allowFleet: js.UndefOr[BooleanObject] = js.undefined,
              allowImageBuilder: js.UndefOr[BooleanObject] = js.undefined): ImagePermissions = {
      val _fields = IndexedSeq[(String, js.Any)]("allowFleet" -> allowFleet.map { x =>
        x.asInstanceOf[js.Any]
      }, "allowImageBuilder" -> allowImageBuilder.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImagePermissions]
    }
  }

  object ImageStateEnum {
    val PENDING   = "PENDING"
    val AVAILABLE = "AVAILABLE"
    val FAILED    = "FAILED"
    val COPYING   = "COPYING"
    val DELETING  = "DELETING"

    val values = IndexedSeq(PENDING, AVAILABLE, FAILED, COPYING, DELETING)
  }

  /**
    * Describes the reason why the last image state change occurred.
    */
  @js.native
  trait ImageStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ImageStateChangeReason {
    def apply(Code: js.UndefOr[ImageStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): ImageStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageStateChangeReason]
    }
  }

  object ImageStateChangeReasonCodeEnum {
    val INTERNAL_ERROR              = "INTERNAL_ERROR"
    val IMAGE_BUILDER_NOT_AVAILABLE = "IMAGE_BUILDER_NOT_AVAILABLE"
    val IMAGE_COPY_FAILURE          = "IMAGE_COPY_FAILURE"

    val values = IndexedSeq(INTERNAL_ERROR, IMAGE_BUILDER_NOT_AVAILABLE, IMAGE_COPY_FAILURE)
  }

  @js.native
  trait ListAssociatedFleetsRequest extends js.Object {
    var StackName: String
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedFleetsRequest {
    def apply(StackName: String, NextToken: js.UndefOr[String] = js.undefined): ListAssociatedFleetsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackName" -> StackName.asInstanceOf[js.Any], "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedFleetsRequest]
    }
  }

  @js.native
  trait ListAssociatedFleetsResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedFleetsResult {
    def apply(Names: js.UndefOr[StringList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): ListAssociatedFleetsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Names" -> Names.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedFleetsResult]
    }
  }

  @js.native
  trait ListAssociatedStacksRequest extends js.Object {
    var FleetName: String
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedStacksRequest {
    def apply(FleetName: String, NextToken: js.UndefOr[String] = js.undefined): ListAssociatedStacksRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("FleetName" -> FleetName.asInstanceOf[js.Any], "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedStacksRequest]
    }
  }

  @js.native
  trait ListAssociatedStacksResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedStacksResult {
    def apply(Names: js.UndefOr[StringList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): ListAssociatedStacksResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Names" -> Names.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedStacksResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    def apply(ResourceArn: Arn): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ResourceArn" -> ResourceArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(Tags: js.UndefOr[Tags] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Tags" -> Tags.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object MessageActionEnum {
    val SUPPRESS = "SUPPRESS"
    val RESEND   = "RESEND"

    val values = IndexedSeq(SUPPRESS, RESEND)
  }

  /**
    * The network details of the fleet instance for the streaming session.
    */
  @js.native
  trait NetworkAccessConfiguration extends js.Object {
    var EniId: js.UndefOr[String]
    var EniPrivateIpAddress: js.UndefOr[String]
  }

  object NetworkAccessConfiguration {
    def apply(EniId: js.UndefOr[String] = js.undefined,
              EniPrivateIpAddress: js.UndefOr[String] = js.undefined): NetworkAccessConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("EniId" -> EniId.map { x =>
        x.asInstanceOf[js.Any]
      }, "EniPrivateIpAddress" -> EniPrivateIpAddress.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAccessConfiguration]
    }
  }

  object PermissionEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object PlatformTypeEnum {
    val WINDOWS = "WINDOWS"

    val values = IndexedSeq(WINDOWS)
  }

  /**
    * Describes a resource error.
    */
  @js.native
  trait ResourceError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var ErrorTimestamp: js.UndefOr[Timestamp]
  }

  object ResourceError {
    def apply(ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined,
              ErrorMessage: js.UndefOr[String] = js.undefined,
              ErrorTimestamp: js.UndefOr[Timestamp] = js.undefined): ResourceError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorTimestamp" -> ErrorTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceError]
    }
  }

  /**
    * Describes the credentials for the service account used by the streaming instance to connect to the directory.
    */
  @js.native
  trait ServiceAccountCredentials extends js.Object {
    var AccountName: AccountName
    var AccountPassword: AccountPassword
  }

  object ServiceAccountCredentials {
    def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountName"     -> AccountName.asInstanceOf[js.Any],
        "AccountPassword" -> AccountPassword.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceAccountCredentials]
    }
  }

  /**
    * Describes a streaming session.
    */
  @js.native
  trait Session extends js.Object {
    var FleetName: String
    var Id: String
    var StackName: String
    var State: SessionState
    var UserId: UserId
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration]
  }

  object Session {
    def apply(FleetName: String,
              Id: String,
              StackName: String,
              State: SessionState,
              UserId: UserId,
              AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
              NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration] = js.undefined): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "Id"        -> Id.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "State"     -> State.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any],
        "AuthenticationType" -> AuthenticationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkAccessConfiguration" -> NetworkAccessConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }

  /**
    * Possible values for the state of a streaming session.
    */
  object SessionStateEnum {
    val ACTIVE  = "ACTIVE"
    val PENDING = "PENDING"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(ACTIVE, PENDING, EXPIRED)
  }

  /**
    * Describes the permissions that are available to the specified AWS account for a shared image.
    */
  @js.native
  trait SharedImagePermissions extends js.Object {
    var imagePermissions: ImagePermissions
    var sharedAccountId: AwsAccountId
  }

  object SharedImagePermissions {
    def apply(imagePermissions: ImagePermissions, sharedAccountId: AwsAccountId): SharedImagePermissions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imagePermissions" -> imagePermissions.asInstanceOf[js.Any],
        "sharedAccountId"  -> sharedAccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SharedImagePermissions]
    }
  }

  /**
    * Describes a stack.
    */
  @js.native
  trait Stack extends js.Object {
    var Name: String
    var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StackErrors: js.UndefOr[StackErrors]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var UserSettings: js.UndefOr[UserSettingList]
  }

  object Stack {
    def apply(Name: String,
              ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.undefined,
              Arn: js.UndefOr[Arn] = js.undefined,
              CreatedTime: js.UndefOr[Timestamp] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              DisplayName: js.UndefOr[String] = js.undefined,
              FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
              RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
              StackErrors: js.UndefOr[StackErrors] = js.undefined,
              StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
              UserSettings: js.UndefOr[UserSettingList] = js.undefined): Stack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "ApplicationSettings" -> ApplicationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeedbackURL" -> FeedbackURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RedirectURL" -> RedirectURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackErrors" -> StackErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageConnectors" -> StorageConnectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserSettings" -> UserSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stack]
    }
  }

  object StackAttributeEnum {
    val STORAGE_CONNECTORS             = "STORAGE_CONNECTORS"
    val STORAGE_CONNECTOR_HOMEFOLDERS  = "STORAGE_CONNECTOR_HOMEFOLDERS"
    val STORAGE_CONNECTOR_GOOGLE_DRIVE = "STORAGE_CONNECTOR_GOOGLE_DRIVE"
    val STORAGE_CONNECTOR_ONE_DRIVE    = "STORAGE_CONNECTOR_ONE_DRIVE"
    val REDIRECT_URL                   = "REDIRECT_URL"
    val FEEDBACK_URL                   = "FEEDBACK_URL"
    val THEME_NAME                     = "THEME_NAME"
    val USER_SETTINGS                  = "USER_SETTINGS"

    val values = IndexedSeq(
      STORAGE_CONNECTORS,
      STORAGE_CONNECTOR_HOMEFOLDERS,
      STORAGE_CONNECTOR_GOOGLE_DRIVE,
      STORAGE_CONNECTOR_ONE_DRIVE,
      REDIRECT_URL,
      FEEDBACK_URL,
      THEME_NAME,
      USER_SETTINGS
    )
  }

  /**
    * Describes a stack error.
    */
  @js.native
  trait StackError extends js.Object {
    var ErrorCode: js.UndefOr[StackErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object StackError {
    def apply(ErrorCode: js.UndefOr[StackErrorCode] = js.undefined,
              ErrorMessage: js.UndefOr[String] = js.undefined): StackError = {
      val _fields = IndexedSeq[(String, js.Any)]("ErrorCode" -> ErrorCode.map { x =>
        x.asInstanceOf[js.Any]
      }, "ErrorMessage" -> ErrorMessage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackError]
    }
  }

  object StackErrorCodeEnum {
    val STORAGE_CONNECTOR_ERROR = "STORAGE_CONNECTOR_ERROR"
    val INTERNAL_SERVICE_ERROR  = "INTERNAL_SERVICE_ERROR"

    val values = IndexedSeq(STORAGE_CONNECTOR_ERROR, INTERNAL_SERVICE_ERROR)
  }

  @js.native
  trait StartFleetRequest extends js.Object {
    var Name: String
  }

  object StartFleetRequest {
    def apply(Name: String): StartFleetRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetRequest]
    }
  }

  @js.native
  trait StartFleetResult extends js.Object {}

  object StartFleetResult {
    def apply(): StartFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetResult]
    }
  }

  @js.native
  trait StartImageBuilderRequest extends js.Object {
    var Name: String
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
  }

  object StartImageBuilderRequest {
    def apply(Name: String,
              AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined): StartImageBuilderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImageBuilderRequest]
    }
  }

  @js.native
  trait StartImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object StartImageBuilderResult {
    def apply(ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): StartImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ImageBuilder" -> ImageBuilder.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImageBuilderResult]
    }
  }

  @js.native
  trait StopFleetRequest extends js.Object {
    var Name: String
  }

  object StopFleetRequest {
    def apply(Name: String): StopFleetRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetRequest]
    }
  }

  @js.native
  trait StopFleetResult extends js.Object {}

  object StopFleetResult {
    def apply(): StopFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetResult]
    }
  }

  @js.native
  trait StopImageBuilderRequest extends js.Object {
    var Name: String
  }

  object StopImageBuilderRequest {
    def apply(Name: String): StopImageBuilderRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopImageBuilderRequest]
    }
  }

  @js.native
  trait StopImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object StopImageBuilderResult {
    def apply(ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): StopImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ImageBuilder" -> ImageBuilder.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopImageBuilderResult]
    }
  }

  /**
    * Describes a connector to enable persistent storage for users.
    */
  @js.native
  trait StorageConnector extends js.Object {
    var ConnectorType: StorageConnectorType
    var Domains: js.UndefOr[DomainList]
    var ResourceIdentifier: js.UndefOr[ResourceIdentifier]
  }

  object StorageConnector {
    def apply(ConnectorType: StorageConnectorType,
              Domains: js.UndefOr[DomainList] = js.undefined,
              ResourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined): StorageConnector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorType" -> ConnectorType.asInstanceOf[js.Any],
        "Domains" -> Domains.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceIdentifier" -> ResourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageConnector]
    }
  }

  /**
    * The type of storage connector.
    */
  object StorageConnectorTypeEnum {
    val HOMEFOLDERS  = "HOMEFOLDERS"
    val GOOGLE_DRIVE = "GOOGLE_DRIVE"
    val ONE_DRIVE    = "ONE_DRIVE"

    val values = IndexedSeq(HOMEFOLDERS, GOOGLE_DRIVE, ONE_DRIVE)
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(ResourceArn: Arn, Tags: Tags): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(ResourceArn: Arn, TagKeys: TagKeyList): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object UpdateDirectoryConfigRequest {
    def apply(
        DirectoryName: DirectoryName,
        OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
        ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
    ): UpdateDirectoryConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.asInstanceOf[js.Any],
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceAccountCredentials" -> ServiceAccountCredentials.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDirectoryConfigRequest]
    }
  }

  @js.native
  trait UpdateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  object UpdateDirectoryConfigResult {
    def apply(DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined): UpdateDirectoryConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DirectoryConfig" -> DirectoryConfig.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDirectoryConfigResult]
    }
  }

  @js.native
  trait UpdateFleetRequest extends js.Object {
    var AttributesToDelete: js.UndefOr[FleetAttributes]
    var ComputeCapacity: js.UndefOr[ComputeCapacity]
    var DeleteVpcConfig: js.UndefOr[Boolean]
    var Description: js.UndefOr[Description]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object UpdateFleetRequest {
    def apply(AttributesToDelete: js.UndefOr[FleetAttributes] = js.undefined,
              ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined,
              DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
              DisplayName: js.UndefOr[DisplayName] = js.undefined,
              DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
              EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
              ImageArn: js.UndefOr[Arn] = js.undefined,
              ImageName: js.UndefOr[String] = js.undefined,
              InstanceType: js.UndefOr[String] = js.undefined,
              MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              VpcConfig: js.UndefOr[VpcConfig] = js.undefined): UpdateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributesToDelete" -> AttributesToDelete.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ComputeCapacity" -> ComputeCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeleteVpcConfig" -> DeleteVpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisconnectTimeoutInSeconds" -> DisconnectTimeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainJoinInfo" -> DomainJoinInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageArn" -> ImageArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageName" -> ImageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxUserDurationInSeconds" -> MaxUserDurationInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetRequest]
    }
  }

  @js.native
  trait UpdateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  object UpdateFleetResult {
    def apply(Fleet: js.UndefOr[Fleet] = js.undefined): UpdateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Fleet" -> Fleet.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetResult]
    }
  }

  @js.native
  trait UpdateImagePermissionsRequest extends js.Object {
    var ImagePermissions: ImagePermissions
    var Name: Name
    var SharedAccountId: AwsAccountId
  }

  object UpdateImagePermissionsRequest {
    def apply(ImagePermissions: ImagePermissions,
              Name: Name,
              SharedAccountId: AwsAccountId): UpdateImagePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImagePermissions" -> ImagePermissions.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any],
        "SharedAccountId"  -> SharedAccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateImagePermissionsRequest]
    }
  }

  @js.native
  trait UpdateImagePermissionsResult extends js.Object {}

  object UpdateImagePermissionsResult {
    def apply(): UpdateImagePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateImagePermissionsResult]
    }
  }

  @js.native
  trait UpdateStackRequest extends js.Object {
    var Name: String
    var ApplicationSettings: js.UndefOr[ApplicationSettings]
    var AttributesToDelete: js.UndefOr[StackAttributes]
    var DeleteStorageConnectors: js.UndefOr[Boolean]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var UserSettings: js.UndefOr[UserSettingList]
  }

  object UpdateStackRequest {
    def apply(Name: String,
              ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined,
              AttributesToDelete: js.UndefOr[StackAttributes] = js.undefined,
              DeleteStorageConnectors: js.UndefOr[Boolean] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              DisplayName: js.UndefOr[DisplayName] = js.undefined,
              FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
              RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
              StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
              UserSettings: js.UndefOr[UserSettingList] = js.undefined): UpdateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "ApplicationSettings" -> ApplicationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributesToDelete" -> AttributesToDelete.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeleteStorageConnectors" -> DeleteStorageConnectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeedbackURL" -> FeedbackURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RedirectURL" -> RedirectURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageConnectors" -> StorageConnectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserSettings" -> UserSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackRequest]
    }
  }

  @js.native
  trait UpdateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  object UpdateStackResult {
    def apply(Stack: js.UndefOr[Stack] = js.undefined): UpdateStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Stack" -> Stack.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackResult]
    }
  }

  /**
    * Describes a user in the user pool.
    */
  @js.native
  trait User extends js.Object {
    var AuthenticationType: AuthenticationType
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Enabled: js.UndefOr[Boolean]
    var FirstName: js.UndefOr[UserAttributeValue]
    var LastName: js.UndefOr[UserAttributeValue]
    var Status: js.UndefOr[String]
    var UserName: js.UndefOr[Username]
  }

  object User {
    def apply(AuthenticationType: AuthenticationType,
              Arn: js.UndefOr[Arn] = js.undefined,
              CreatedTime: js.UndefOr[Timestamp] = js.undefined,
              Enabled: js.UndefOr[Boolean] = js.undefined,
              FirstName: js.UndefOr[UserAttributeValue] = js.undefined,
              LastName: js.UndefOr[UserAttributeValue] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              UserName: js.UndefOr[Username] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FirstName" -> FirstName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastName" -> LastName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserName" -> UserName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
    * Describes an action and whether the action is enabled or disabled for users during their streaming sessions.
    */
  @js.native
  trait UserSetting extends js.Object {
    var Action: Action
    var Permission: Permission
  }

  object UserSetting {
    def apply(Action: Action, Permission: Permission): UserSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action"     -> Action.asInstanceOf[js.Any],
        "Permission" -> Permission.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserSetting]
    }
  }

  /**
    * Describes a user in the user pool and the associated stack.
    */
  @js.native
  trait UserStackAssociation extends js.Object {
    var AuthenticationType: AuthenticationType
    var StackName: String
    var UserName: Username
    var SendEmailNotification: js.UndefOr[Boolean]
  }

  object UserStackAssociation {
    def apply(AuthenticationType: AuthenticationType,
              StackName: String,
              UserName: Username,
              SendEmailNotification: js.UndefOr[Boolean] = js.undefined): UserStackAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "StackName"          -> StackName.asInstanceOf[js.Any],
        "UserName"           -> UserName.asInstanceOf[js.Any],
        "SendEmailNotification" -> SendEmailNotification.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStackAssociation]
    }
  }

  /**
    * Describes the error that is returned when a user can�ft be associated with or disassociated from a stack.
    */
  @js.native
  trait UserStackAssociationError extends js.Object {
    var ErrorCode: js.UndefOr[UserStackAssociationErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var UserStackAssociation: js.UndefOr[UserStackAssociation]
  }

  object UserStackAssociationError {
    def apply(ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.undefined,
              ErrorMessage: js.UndefOr[String] = js.undefined,
              UserStackAssociation: js.UndefOr[UserStackAssociation] = js.undefined): UserStackAssociationError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserStackAssociation" -> UserStackAssociation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStackAssociationError]
    }
  }

  object UserStackAssociationErrorCodeEnum {
    val STACK_NOT_FOUND     = "STACK_NOT_FOUND"
    val USER_NAME_NOT_FOUND = "USER_NAME_NOT_FOUND"
    val INTERNAL_ERROR      = "INTERNAL_ERROR"

    val values = IndexedSeq(STACK_NOT_FOUND, USER_NAME_NOT_FOUND, INTERNAL_ERROR)
  }

  object VisibilityTypeEnum {
    val PUBLIC  = "PUBLIC"
    val PRIVATE = "PRIVATE"
    val SHARED  = "SHARED"

    val values = IndexedSeq(PUBLIC, PRIVATE, SHARED)
  }

  /**
    * Describes VPC configuration information.
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var SubnetIds: js.UndefOr[SubnetIdList]
  }

  object VpcConfig {
    def apply(SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
              SubnetIds: js.UndefOr[SubnetIdList] = js.undefined): VpcConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("SecurityGroupIds" -> SecurityGroupIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "SubnetIds" -> SubnetIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
    }
  }
}
