package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object appstream {
  type AccountName = String
  type AccountPassword = String
  type Action = String
  type Applications = js.Array[Application]
  type AppstreamAgentVersion = String
  type Arn = String
  type ArnList = js.Array[Arn]
  type AuthenticationType = String
  type AwsAccountId = String
  type AwsAccountIdList = js.Array[AwsAccountId]
  type BooleanObject = Boolean
  type DescribeImagesMaxResults = Int
  type Description = String
  type DirectoryConfigList = js.Array[DirectoryConfig]
  type DirectoryName = String
  type DirectoryNameList = js.Array[DirectoryName]
  type DisplayName = String
  type Domain = String
  type DomainList = js.Array[Domain]
  type FeedbackURL = String
  type FleetAttribute = String
  type FleetAttributes = js.Array[FleetAttribute]
  type FleetErrorCode = String
  type FleetErrors = js.Array[FleetError]
  type FleetList = js.Array[Fleet]
  type FleetState = String
  type FleetType = String
  type ImageBuilderList = js.Array[ImageBuilder]
  type ImageBuilderState = String
  type ImageBuilderStateChangeReasonCode = String
  type ImageList = js.Array[Image]
  type ImageState = String
  type ImageStateChangeReasonCode = String
  type MaxResults = Int
  type MessageAction = String
  type Metadata = js.Dictionary[String]
  type Name = String
  type OrganizationalUnitDistinguishedName = String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  type Permission = String
  type PlatformType = String
  type RedirectURL = String
  type RegionName = String
  type ResourceErrors = js.Array[ResourceError]
  type ResourceIdentifier = String
  type SecurityGroupIdList = js.Array[String]
  type SessionList = js.Array[Session]
  type SessionState = String
  type SettingsGroup = String
  type SharedImagePermissionsList = js.Array[SharedImagePermissions]
  type StackAttribute = String
  type StackAttributes = js.Array[StackAttribute]
  type StackErrorCode = String
  type StackErrors = js.Array[StackError]
  type StackList = js.Array[Stack]
  type StorageConnectorList = js.Array[StorageConnector]
  type StorageConnectorType = String
  type StreamingUrlUserId = String
  type StringList = js.Array[String]
  type SubnetIdList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Timestamp = js.Date
  type UserAttributeValue = String
  type UserId = String
  type UserList = js.Array[User]
  type UserSettingList = js.Array[UserSetting]
  type UserStackAssociationErrorCode = String
  type UserStackAssociationErrorList = js.Array[UserStackAssociationError]
  type UserStackAssociationList = js.Array[UserStackAssociation]
  type Username = String
  type VisibilityType = String
}

package appstream {
  @js.native
  @JSImport("aws-sdk", "AppStream")
  class AppStream(config: AWSConfig) extends js.Object {
    def associateFleet(params: AssociateFleetRequest): Request[AssociateFleetResult] = js.native
    def batchAssociateUserStack(params: BatchAssociateUserStackRequest): Request[BatchAssociateUserStackResult] = js.native
    def batchDisassociateUserStack(params: BatchDisassociateUserStackRequest): Request[BatchDisassociateUserStackResult] = js.native
    def copyImage(params: CopyImageRequest): Request[CopyImageResponse] = js.native
    def createDirectoryConfig(params: CreateDirectoryConfigRequest): Request[CreateDirectoryConfigResult] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResult] = js.native
    def createImageBuilder(params: CreateImageBuilderRequest): Request[CreateImageBuilderResult] = js.native
    def createImageBuilderStreamingURL(params: CreateImageBuilderStreamingURLRequest): Request[CreateImageBuilderStreamingURLResult] = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult] = js.native
    def createStreamingURL(params: CreateStreamingURLRequest): Request[CreateStreamingURLResult] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResult] = js.native
    def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): Request[DeleteDirectoryConfigResult] = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResult] = js.native
    def deleteImage(params: DeleteImageRequest): Request[DeleteImageResult] = js.native
    def deleteImageBuilder(params: DeleteImageBuilderRequest): Request[DeleteImageBuilderResult] = js.native
    def deleteImagePermissions(params: DeleteImagePermissionsRequest): Request[DeleteImagePermissionsResult] = js.native
    def deleteStack(params: DeleteStackRequest): Request[DeleteStackResult] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResult] = js.native
    def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): Request[DescribeDirectoryConfigsResult] = js.native
    def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult] = js.native
    def describeImageBuilders(params: DescribeImageBuildersRequest): Request[DescribeImageBuildersResult] = js.native
    def describeImagePermissions(params: DescribeImagePermissionsRequest): Request[DescribeImagePermissionsResult] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult] = js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResult] = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult] = js.native
    def describeUserStackAssociations(params: DescribeUserStackAssociationsRequest): Request[DescribeUserStackAssociationsResult] = js.native
    def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResult] = js.native
    def disableUser(params: DisableUserRequest): Request[DisableUserResult] = js.native
    def disassociateFleet(params: DisassociateFleetRequest): Request[DisassociateFleetResult] = js.native
    def enableUser(params: EnableUserRequest): Request[EnableUserResult] = js.native
    def expireSession(params: ExpireSessionRequest): Request[ExpireSessionResult] = js.native
    def listAssociatedFleets(params: ListAssociatedFleetsRequest): Request[ListAssociatedFleetsResult] = js.native
    def listAssociatedStacks(params: ListAssociatedStacksRequest): Request[ListAssociatedStacksResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startFleet(params: StartFleetRequest): Request[StartFleetResult] = js.native
    def startImageBuilder(params: StartImageBuilderRequest): Request[StartImageBuilderResult] = js.native
    def stopFleet(params: StopFleetRequest): Request[StopFleetResult] = js.native
    def stopImageBuilder(params: StopImageBuilderRequest): Request[StopImageBuilderResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDirectoryConfig(params: UpdateDirectoryConfigRequest): Request[UpdateDirectoryConfigResult] = js.native
    def updateFleet(params: UpdateFleetRequest): Request[UpdateFleetResult] = js.native
    def updateImagePermissions(params: UpdateImagePermissionsRequest): Request[UpdateImagePermissionsResult] = js.native
    def updateStack(params: UpdateStackRequest): Request[UpdateStackResult] = js.native
  }

  object ActionEnum {
    val CLIPBOARD_COPY_FROM_LOCAL_DEVICE = "CLIPBOARD_COPY_FROM_LOCAL_DEVICE"
    val CLIPBOARD_COPY_TO_LOCAL_DEVICE = "CLIPBOARD_COPY_TO_LOCAL_DEVICE"
    val FILE_UPLOAD = "FILE_UPLOAD"
    val FILE_DOWNLOAD = "FILE_DOWNLOAD"
    val PRINTING_TO_LOCAL_DEVICE = "PRINTING_TO_LOCAL_DEVICE"

    val values = IndexedSeq(CLIPBOARD_COPY_FROM_LOCAL_DEVICE, CLIPBOARD_COPY_TO_LOCAL_DEVICE, FILE_UPLOAD, FILE_DOWNLOAD, PRINTING_TO_LOCAL_DEVICE)
  }

  /**
   * <p>Describes an application in the application catalog.</p>
   */
  @js.native
  trait Application extends js.Object {
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var LaunchPath: js.UndefOr[String]
    var LaunchParameters: js.UndefOr[String]
    var IconURL: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
  }

  object Application {
    def apply(
      Metadata: js.UndefOr[Metadata] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      LaunchPath: js.UndefOr[String] = js.undefined,
      LaunchParameters: js.UndefOr[String] = js.undefined,
      IconURL: js.UndefOr[String] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined): Application = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "LaunchPath" -> LaunchPath.map { x => x.asInstanceOf[js.Any] },
        "LaunchParameters" -> LaunchParameters.map { x => x.asInstanceOf[js.Any] },
        "IconURL" -> IconURL.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Application]
    }
  }

  /**
   * <p>The persistent application settings for users of a stack.</p>
   */
  @js.native
  trait ApplicationSettings extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  object ApplicationSettings {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined,
      SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined): ApplicationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SettingsGroup" -> SettingsGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSettings]
    }
  }

  /**
   * <p>Describes the persistent application settings for users of a stack.</p>
   */
  @js.native
  trait ApplicationSettingsResponse extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var SettingsGroup: js.UndefOr[SettingsGroup]
    var S3BucketName: js.UndefOr[String]
  }

  object ApplicationSettingsResponse {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined,
      SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined): ApplicationSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SettingsGroup" -> SettingsGroup.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSettingsResponse]
    }
  }

  @js.native
  trait AssociateFleetRequest extends js.Object {
    var FleetName: js.UndefOr[String]
    var StackName: js.UndefOr[String]
  }

  object AssociateFleetRequest {
    def apply(
      FleetName: js.UndefOr[String] = js.undefined,
      StackName: js.UndefOr[String] = js.undefined): AssociateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateFleetRequest]
    }
  }

  @js.native
  trait AssociateFleetResult extends js.Object {

  }

  object AssociateFleetResult {
    def apply(): AssociateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateFleetResult]
    }
  }

  object AuthenticationTypeEnum {
    val API = "API"
    val SAML = "SAML"
    val USERPOOL = "USERPOOL"

    val values = IndexedSeq(API, SAML, USERPOOL)
  }

  @js.native
  trait BatchAssociateUserStackRequest extends js.Object {
    var UserStackAssociations: js.UndefOr[UserStackAssociationList]
  }

  object BatchAssociateUserStackRequest {
    def apply(
      UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined): BatchAssociateUserStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserStackAssociations" -> UserStackAssociations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAssociateUserStackRequest]
    }
  }

  @js.native
  trait BatchAssociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  object BatchAssociateUserStackResult {
    def apply(
      errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined): BatchAssociateUserStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errors" -> errors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAssociateUserStackResult]
    }
  }

  @js.native
  trait BatchDisassociateUserStackRequest extends js.Object {
    var UserStackAssociations: js.UndefOr[UserStackAssociationList]
  }

  object BatchDisassociateUserStackRequest {
    def apply(
      UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined): BatchDisassociateUserStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserStackAssociations" -> UserStackAssociations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisassociateUserStackRequest]
    }
  }

  @js.native
  trait BatchDisassociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  object BatchDisassociateUserStackResult {
    def apply(
      errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined): BatchDisassociateUserStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errors" -> errors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisassociateUserStackResult]
    }
  }

  /**
   * <p>Describes the capacity for a fleet.</p>
   */
  @js.native
  trait ComputeCapacity extends js.Object {
    var DesiredInstances: js.UndefOr[Int]
  }

  object ComputeCapacity {
    def apply(
      DesiredInstances: js.UndefOr[Int] = js.undefined): ComputeCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DesiredInstances" -> DesiredInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeCapacity]
    }
  }

  /**
   * <p>Describes the capacity status for a fleet.</p>
   */
  @js.native
  trait ComputeCapacityStatus extends js.Object {
    var Desired: js.UndefOr[Int]
    var Running: js.UndefOr[Int]
    var InUse: js.UndefOr[Int]
    var Available: js.UndefOr[Int]
  }

  object ComputeCapacityStatus {
    def apply(
      Desired: js.UndefOr[Int] = js.undefined,
      Running: js.UndefOr[Int] = js.undefined,
      InUse: js.UndefOr[Int] = js.undefined,
      Available: js.UndefOr[Int] = js.undefined): ComputeCapacityStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Desired" -> Desired.map { x => x.asInstanceOf[js.Any] },
        "Running" -> Running.map { x => x.asInstanceOf[js.Any] },
        "InUse" -> InUse.map { x => x.asInstanceOf[js.Any] },
        "Available" -> Available.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeCapacityStatus]
    }
  }

  @js.native
  trait CopyImageRequest extends js.Object {
    var SourceImageName: js.UndefOr[Name]
    var DestinationImageName: js.UndefOr[Name]
    var DestinationRegion: js.UndefOr[RegionName]
    var DestinationImageDescription: js.UndefOr[Description]
  }

  object CopyImageRequest {
    def apply(
      SourceImageName: js.UndefOr[Name] = js.undefined,
      DestinationImageName: js.UndefOr[Name] = js.undefined,
      DestinationRegion: js.UndefOr[RegionName] = js.undefined,
      DestinationImageDescription: js.UndefOr[Description] = js.undefined): CopyImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceImageName" -> SourceImageName.map { x => x.asInstanceOf[js.Any] },
        "DestinationImageName" -> DestinationImageName.map { x => x.asInstanceOf[js.Any] },
        "DestinationRegion" -> DestinationRegion.map { x => x.asInstanceOf[js.Any] },
        "DestinationImageDescription" -> DestinationImageDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageRequest]
    }
  }

  @js.native
  trait CopyImageResponse extends js.Object {
    var DestinationImageName: js.UndefOr[Name]
  }

  object CopyImageResponse {
    def apply(
      DestinationImageName: js.UndefOr[Name] = js.undefined): CopyImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationImageName" -> DestinationImageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageResponse]
    }
  }

  @js.native
  trait CreateDirectoryConfigRequest extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object CreateDirectoryConfigRequest {
    def apply(
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
      OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
      ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined): CreateDirectoryConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.map { x => x.asInstanceOf[js.Any] },
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccountCredentials" -> ServiceAccountCredentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryConfigRequest]
    }
  }

  @js.native
  trait CreateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  object CreateDirectoryConfigResult {
    def apply(
      DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined): CreateDirectoryConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryConfig" -> DirectoryConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryConfigResult]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var FleetType: js.UndefOr[FleetType]
    var Name: js.UndefOr[Name]
    var ComputeCapacity: js.UndefOr[ComputeCapacity]
    var ImageName: js.UndefOr[String]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var Description: js.UndefOr[Description]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var ImageArn: js.UndefOr[Arn]
    var InstanceType: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
    var DisplayName: js.UndefOr[DisplayName]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
  }

  object CreateFleetRequest {
    def apply(
      FleetType: js.UndefOr[FleetType] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined,
      ImageName: js.UndefOr[String] = js.undefined,
      EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
      DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
      ImageArn: js.UndefOr[Arn] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined,
      MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined): CreateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetType" -> FleetType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ComputeCapacity" -> ComputeCapacity.map { x => x.asInstanceOf[js.Any] },
        "ImageName" -> ImageName.map { x => x.asInstanceOf[js.Any] },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DisconnectTimeoutInSeconds" -> DisconnectTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "DomainJoinInfo" -> DomainJoinInfo.map { x => x.asInstanceOf[js.Any] },
        "ImageArn" -> ImageArn.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "MaxUserDurationInSeconds" -> MaxUserDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  object CreateFleetResult {
    def apply(
      Fleet: js.UndefOr[Fleet] = js.undefined): CreateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fleet" -> Fleet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetResult]
    }
  }

  @js.native
  trait CreateImageBuilderRequest extends js.Object {
    var Name: js.UndefOr[Name]
    var ImageName: js.UndefOr[String]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var Description: js.UndefOr[Description]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var ImageArn: js.UndefOr[Arn]
    var InstanceType: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
    var DisplayName: js.UndefOr[DisplayName]
  }

  object CreateImageBuilderRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      ImageName: js.UndefOr[String] = js.undefined,
      EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
      DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
      ImageArn: js.UndefOr[Arn] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined): CreateImageBuilderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ImageName" -> ImageName.map { x => x.asInstanceOf[js.Any] },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x => x.asInstanceOf[js.Any] },
        "DomainJoinInfo" -> DomainJoinInfo.map { x => x.asInstanceOf[js.Any] },
        "ImageArn" -> ImageArn.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderRequest]
    }
  }

  @js.native
  trait CreateImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object CreateImageBuilderResult {
    def apply(
      ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): CreateImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageBuilder" -> ImageBuilder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderResult]
    }
  }

  @js.native
  trait CreateImageBuilderStreamingURLRequest extends js.Object {
    var Name: js.UndefOr[String]
    var Validity: js.UndefOr[Double]
  }

  object CreateImageBuilderStreamingURLRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Validity: js.UndefOr[Double] = js.undefined): CreateImageBuilderStreamingURLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Validity" -> Validity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderStreamingURLRequest]
    }
  }

  @js.native
  trait CreateImageBuilderStreamingURLResult extends js.Object {
    var StreamingURL: js.UndefOr[String]
    var Expires: js.UndefOr[Timestamp]
  }

  object CreateImageBuilderStreamingURLResult {
    def apply(
      StreamingURL: js.UndefOr[String] = js.undefined,
      Expires: js.UndefOr[Timestamp] = js.undefined): CreateImageBuilderStreamingURLResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamingURL" -> StreamingURL.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageBuilderStreamingURLResult]
    }
  }

  @js.native
  trait CreateStackRequest extends js.Object {
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var Name: js.UndefOr[Name]
    var RedirectURL: js.UndefOr[RedirectURL]
    var Description: js.UndefOr[Description]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var ApplicationSettings: js.UndefOr[ApplicationSettings]
    var UserSettings: js.UndefOr[UserSettingList]
    var DisplayName: js.UndefOr[DisplayName]
  }

  object CreateStackRequest {
    def apply(
      FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
      ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined,
      UserSettings: js.UndefOr[UserSettingList] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined): CreateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeedbackURL" -> FeedbackURL.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RedirectURL" -> RedirectURL.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StorageConnectors" -> StorageConnectors.map { x => x.asInstanceOf[js.Any] },
        "ApplicationSettings" -> ApplicationSettings.map { x => x.asInstanceOf[js.Any] },
        "UserSettings" -> UserSettings.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackRequest]
    }
  }

  @js.native
  trait CreateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  object CreateStackResult {
    def apply(
      Stack: js.UndefOr[Stack] = js.undefined): CreateStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Stack" -> Stack.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackResult]
    }
  }

  @js.native
  trait CreateStreamingURLRequest extends js.Object {
    var ApplicationId: js.UndefOr[String]
    var FleetName: js.UndefOr[String]
    var StackName: js.UndefOr[String]
    var UserId: js.UndefOr[StreamingUrlUserId]
    var SessionContext: js.UndefOr[String]
    var Validity: js.UndefOr[Double]
  }

  object CreateStreamingURLRequest {
    def apply(
      ApplicationId: js.UndefOr[String] = js.undefined,
      FleetName: js.UndefOr[String] = js.undefined,
      StackName: js.UndefOr[String] = js.undefined,
      UserId: js.UndefOr[StreamingUrlUserId] = js.undefined,
      SessionContext: js.UndefOr[String] = js.undefined,
      Validity: js.UndefOr[Double] = js.undefined): CreateStreamingURLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x => x.asInstanceOf[js.Any] },
        "FleetName" -> FleetName.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "SessionContext" -> SessionContext.map { x => x.asInstanceOf[js.Any] },
        "Validity" -> Validity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingURLRequest]
    }
  }

  @js.native
  trait CreateStreamingURLResult extends js.Object {
    var StreamingURL: js.UndefOr[String]
    var Expires: js.UndefOr[Timestamp]
  }

  object CreateStreamingURLResult {
    def apply(
      StreamingURL: js.UndefOr[String] = js.undefined,
      Expires: js.UndefOr[Timestamp] = js.undefined): CreateStreamingURLResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamingURL" -> StreamingURL.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingURLResult]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var LastName: js.UndefOr[UserAttributeValue]
    var UserName: js.UndefOr[Username]
    var FirstName: js.UndefOr[UserAttributeValue]
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var MessageAction: js.UndefOr[MessageAction]
  }

  object CreateUserRequest {
    def apply(
      LastName: js.UndefOr[UserAttributeValue] = js.undefined,
      UserName: js.UndefOr[Username] = js.undefined,
      FirstName: js.UndefOr[UserAttributeValue] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      MessageAction: js.UndefOr[MessageAction] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "MessageAction" -> MessageAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResult extends js.Object {

  }

  object CreateUserResult {
    def apply(): CreateUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResult]
    }
  }

  @js.native
  trait DeleteDirectoryConfigRequest extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
  }

  object DeleteDirectoryConfigRequest {
    def apply(
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined): DeleteDirectoryConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryConfigRequest]
    }
  }

  @js.native
  trait DeleteDirectoryConfigResult extends js.Object {

  }

  object DeleteDirectoryConfigResult {
    def apply(): DeleteDirectoryConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryConfigResult]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object DeleteFleetRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): DeleteFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResult extends js.Object {

  }

  object DeleteFleetResult {
    def apply(): DeleteFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetResult]
    }
  }

  @js.native
  trait DeleteImageBuilderRequest extends js.Object {
    var Name: js.UndefOr[Name]
  }

  object DeleteImageBuilderRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined): DeleteImageBuilderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageBuilderRequest]
    }
  }

  @js.native
  trait DeleteImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object DeleteImageBuilderResult {
    def apply(
      ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): DeleteImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageBuilder" -> ImageBuilder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageBuilderResult]
    }
  }

  @js.native
  trait DeleteImagePermissionsRequest extends js.Object {
    var Name: js.UndefOr[Name]
    var SharedAccountId: js.UndefOr[AwsAccountId]
  }

  object DeleteImagePermissionsRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      SharedAccountId: js.UndefOr[AwsAccountId] = js.undefined): DeleteImagePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SharedAccountId" -> SharedAccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImagePermissionsRequest]
    }
  }

  @js.native
  trait DeleteImagePermissionsResult extends js.Object {

  }

  object DeleteImagePermissionsResult {
    def apply(): DeleteImagePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImagePermissionsResult]
    }
  }

  @js.native
  trait DeleteImageRequest extends js.Object {
    var Name: js.UndefOr[Name]
  }

  object DeleteImageRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined): DeleteImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageRequest]
    }
  }

  @js.native
  trait DeleteImageResult extends js.Object {
    var Image: js.UndefOr[Image]
  }

  object DeleteImageResult {
    def apply(
      Image: js.UndefOr[Image] = js.undefined): DeleteImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImageResult]
    }
  }

  @js.native
  trait DeleteStackRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object DeleteStackRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): DeleteStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackRequest]
    }
  }

  @js.native
  trait DeleteStackResult extends js.Object {

  }

  object DeleteStackResult {
    def apply(): DeleteStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackResult]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserName: js.UndefOr[Username]
    var AuthenticationType: js.UndefOr[AuthenticationType]
  }

  object DeleteUserRequest {
    def apply(
      UserName: js.UndefOr[Username] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResult extends js.Object {

  }

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
    def apply(
      DirectoryNames: js.UndefOr[DirectoryNameList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeDirectoryConfigsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryNames" -> DirectoryNames.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectoryConfigsRequest]
    }
  }

  @js.native
  trait DescribeDirectoryConfigsResult extends js.Object {
    var DirectoryConfigs: js.UndefOr[DirectoryConfigList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDirectoryConfigsResult {
    def apply(
      DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeDirectoryConfigsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryConfigs" -> DirectoryConfigs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectoryConfigsResult]
    }
  }

  @js.native
  trait DescribeFleetsRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsRequest {
    def apply(
      Names: js.UndefOr[StringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFleetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsRequest]
    }
  }

  @js.native
  trait DescribeFleetsResult extends js.Object {
    var Fleets: js.UndefOr[FleetList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsResult {
    def apply(
      Fleets: js.UndefOr[FleetList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFleetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fleets" -> Fleets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsResult]
    }
  }

  @js.native
  trait DescribeImageBuildersRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImageBuildersRequest {
    def apply(
      Names: js.UndefOr[StringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImageBuildersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImageBuildersRequest]
    }
  }

  @js.native
  trait DescribeImageBuildersResult extends js.Object {
    var ImageBuilders: js.UndefOr[ImageBuilderList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImageBuildersResult {
    def apply(
      ImageBuilders: js.UndefOr[ImageBuilderList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImageBuildersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageBuilders" -> ImageBuilders.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImageBuildersResult]
    }
  }

  @js.native
  trait DescribeImagePermissionsRequest extends js.Object {
    var Name: js.UndefOr[Name]
    var MaxResults: js.UndefOr[MaxResults]
    var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImagePermissionsRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImagePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SharedAwsAccountIds" -> SharedAwsAccountIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagePermissionsRequest]
    }
  }

  @js.native
  trait DescribeImagePermissionsResult extends js.Object {
    var Name: js.UndefOr[Name]
    var SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImagePermissionsResult {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImagePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SharedImagePermissionsList" -> SharedImagePermissionsList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagePermissionsResult]
    }
  }

  @js.native
  trait DescribeImagesRequest extends js.Object {
    var MaxResults: js.UndefOr[DescribeImagesMaxResults]
    var Arns: js.UndefOr[ArnList]
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
    var Type: js.UndefOr[VisibilityType]
  }

  object DescribeImagesRequest {
    def apply(
      MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.undefined,
      Arns: js.UndefOr[ArnList] = js.undefined,
      Names: js.UndefOr[StringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[VisibilityType] = js.undefined): DescribeImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Arns" -> Arns.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesRequest]
    }
  }

  @js.native
  trait DescribeImagesResult extends js.Object {
    var Images: js.UndefOr[ImageList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImagesResult {
    def apply(
      Images: js.UndefOr[ImageList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Images" -> Images.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesResult]
    }
  }

  @js.native
  trait DescribeSessionsRequest extends js.Object {
    var Limit: js.UndefOr[Int]
    var FleetName: js.UndefOr[String]
    var StackName: js.UndefOr[String]
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var UserId: js.UndefOr[UserId]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSessionsRequest {
    def apply(
      Limit: js.UndefOr[Int] = js.undefined,
      FleetName: js.UndefOr[String] = js.undefined,
      StackName: js.UndefOr[String] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSessionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "FleetName" -> FleetName.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsRequest]
    }
  }

  @js.native
  trait DescribeSessionsResult extends js.Object {
    var Sessions: js.UndefOr[SessionList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSessionsResult {
    def apply(
      Sessions: js.UndefOr[SessionList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSessionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Sessions" -> Sessions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsResult]
    }
  }

  @js.native
  trait DescribeStacksRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeStacksRequest {
    def apply(
      Names: js.UndefOr[StringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeStacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksRequest]
    }
  }

  @js.native
  trait DescribeStacksResult extends js.Object {
    var Stacks: js.UndefOr[StackList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeStacksResult {
    def apply(
      Stacks: js.UndefOr[StackList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeStacksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Stacks" -> Stacks.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksResult]
    }
  }

  @js.native
  trait DescribeUserStackAssociationsRequest extends js.Object {
    var UserName: js.UndefOr[Username]
    var MaxResults: js.UndefOr[MaxResults]
    var StackName: js.UndefOr[String]
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUserStackAssociationsRequest {
    def apply(
      UserName: js.UndefOr[Username] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      StackName: js.UndefOr[String] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeUserStackAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserStackAssociationsRequest]
    }
  }

  @js.native
  trait DescribeUserStackAssociationsResult extends js.Object {
    var UserStackAssociations: js.UndefOr[UserStackAssociationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUserStackAssociationsResult {
    def apply(
      UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeUserStackAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserStackAssociations" -> UserStackAssociations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserStackAssociationsResult]
    }
  }

  @js.native
  trait DescribeUsersRequest extends js.Object {
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUsersRequest {
    def apply(
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUsersRequest]
    }
  }

  @js.native
  trait DescribeUsersResult extends js.Object {
    var Users: js.UndefOr[UserList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUsersResult {
    def apply(
      Users: js.UndefOr[UserList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeUsersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUsersResult]
    }
  }

  /**
   * <p>Configuration information for the directory used to join domains.</p>
   */
  @js.native
  trait DirectoryConfig extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
    var CreatedTime: js.UndefOr[Timestamp]
  }

  object DirectoryConfig {
    def apply(
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
      OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
      ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined,
      CreatedTime: js.UndefOr[Timestamp] = js.undefined): DirectoryConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.map { x => x.asInstanceOf[js.Any] },
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccountCredentials" -> ServiceAccountCredentials.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryConfig]
    }
  }

  @js.native
  trait DisableUserRequest extends js.Object {
    var UserName: js.UndefOr[Username]
    var AuthenticationType: js.UndefOr[AuthenticationType]
  }

  object DisableUserRequest {
    def apply(
      UserName: js.UndefOr[Username] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined): DisableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableUserRequest]
    }
  }

  @js.native
  trait DisableUserResult extends js.Object {

  }

  object DisableUserResult {
    def apply(): DisableUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableUserResult]
    }
  }

  @js.native
  trait DisassociateFleetRequest extends js.Object {
    var FleetName: js.UndefOr[String]
    var StackName: js.UndefOr[String]
  }

  object DisassociateFleetRequest {
    def apply(
      FleetName: js.UndefOr[String] = js.undefined,
      StackName: js.UndefOr[String] = js.undefined): DisassociateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFleetRequest]
    }
  }

  @js.native
  trait DisassociateFleetResult extends js.Object {

  }

  object DisassociateFleetResult {
    def apply(): DisassociateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFleetResult]
    }
  }

  /**
   * <p>Contains the information needed to join a Microsoft Active Directory domain.</p>
   */
  @js.native
  trait DomainJoinInfo extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
  }

  object DomainJoinInfo {
    def apply(
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
      OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined): DomainJoinInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.map { x => x.asInstanceOf[js.Any] },
        "OrganizationalUnitDistinguishedName" -> OrganizationalUnitDistinguishedName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainJoinInfo]
    }
  }

  @js.native
  trait EnableUserRequest extends js.Object {
    var UserName: js.UndefOr[Username]
    var AuthenticationType: js.UndefOr[AuthenticationType]
  }

  object EnableUserRequest {
    def apply(
      UserName: js.UndefOr[Username] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined): EnableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableUserRequest]
    }
  }

  @js.native
  trait EnableUserResult extends js.Object {

  }

  object EnableUserResult {
    def apply(): EnableUserResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableUserResult]
    }
  }

  @js.native
  trait ExpireSessionRequest extends js.Object {
    var SessionId: js.UndefOr[String]
  }

  object ExpireSessionRequest {
    def apply(
      SessionId: js.UndefOr[String] = js.undefined): ExpireSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpireSessionRequest]
    }
  }

  @js.native
  trait ExpireSessionResult extends js.Object {

  }

  object ExpireSessionResult {
    def apply(): ExpireSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpireSessionResult]
    }
  }

  /**
   * <p>Contains the parameters for a fleet.</p>
   */
  @js.native
  trait Fleet extends js.Object {
    var FleetErrors: js.UndefOr[FleetErrors]
    var FleetType: js.UndefOr[FleetType]
    var CreatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var ImageName: js.UndefOr[String]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var Description: js.UndefOr[String]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var Arn: js.UndefOr[Arn]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var ImageArn: js.UndefOr[Arn]
    var InstanceType: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
    var ComputeCapacityStatus: js.UndefOr[ComputeCapacityStatus]
    var State: js.UndefOr[FleetState]
    var DisplayName: js.UndefOr[String]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
  }

  object Fleet {
    def apply(
      FleetErrors: js.UndefOr[FleetErrors] = js.undefined,
      FleetType: js.UndefOr[FleetType] = js.undefined,
      CreatedTime: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ImageName: js.UndefOr[String] = js.undefined,
      EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
      ImageArn: js.UndefOr[Arn] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      ComputeCapacityStatus: js.UndefOr[ComputeCapacityStatus] = js.undefined,
      State: js.UndefOr[FleetState] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined,
      MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined): Fleet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetErrors" -> FleetErrors.map { x => x.asInstanceOf[js.Any] },
        "FleetType" -> FleetType.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ImageName" -> ImageName.map { x => x.asInstanceOf[js.Any] },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DisconnectTimeoutInSeconds" -> DisconnectTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "DomainJoinInfo" -> DomainJoinInfo.map { x => x.asInstanceOf[js.Any] },
        "ImageArn" -> ImageArn.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "ComputeCapacityStatus" -> ComputeCapacityStatus.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "MaxUserDurationInSeconds" -> MaxUserDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Fleet]
    }
  }

  /**
   * <p>The fleet attribute.</p>
   */
  object FleetAttributeEnum {
    val VPC_CONFIGURATION = "VPC_CONFIGURATION"
    val VPC_CONFIGURATION_SECURITY_GROUP_IDS = "VPC_CONFIGURATION_SECURITY_GROUP_IDS"
    val DOMAIN_JOIN_INFO = "DOMAIN_JOIN_INFO"

    val values = IndexedSeq(VPC_CONFIGURATION, VPC_CONFIGURATION_SECURITY_GROUP_IDS, DOMAIN_JOIN_INFO)
  }

  /**
   * <p>Describes a fleet error.</p>
   */
  @js.native
  trait FleetError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object FleetError {
    def apply(
      ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): FleetError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetError]
    }
  }

  object FleetErrorCodeEnum {
    val IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION = "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION"
    val IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION = "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION"
    val IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION = "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION"
    val NETWORK_INTERFACE_LIMIT_EXCEEDED = "NETWORK_INTERFACE_LIMIT_EXCEEDED"
    val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR"
    val IAM_SERVICE_ROLE_IS_MISSING = "IAM_SERVICE_ROLE_IS_MISSING"
    val SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES = "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES"
    val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION = "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION"
    val SUBNET_NOT_FOUND = "SUBNET_NOT_FOUND"
    val IMAGE_NOT_FOUND = "IMAGE_NOT_FOUND"
    val INVALID_SUBNET_CONFIGURATION = "INVALID_SUBNET_CONFIGURATION"
    val SECURITY_GROUPS_NOT_FOUND = "SECURITY_GROUPS_NOT_FOUND"
    val IGW_NOT_ATTACHED = "IGW_NOT_ATTACHED"
    val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION = "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION"
    val DOMAIN_JOIN_ERROR_FILE_NOT_FOUND = "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND"
    val DOMAIN_JOIN_ERROR_ACCESS_DENIED = "DOMAIN_JOIN_ERROR_ACCESS_DENIED"
    val DOMAIN_JOIN_ERROR_LOGON_FAILURE = "DOMAIN_JOIN_ERROR_LOGON_FAILURE"
    val DOMAIN_JOIN_ERROR_INVALID_PARAMETER = "DOMAIN_JOIN_ERROR_INVALID_PARAMETER"
    val DOMAIN_JOIN_ERROR_MORE_DATA = "DOMAIN_JOIN_ERROR_MORE_DATA"
    val DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN = "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN"
    val DOMAIN_JOIN_ERROR_NOT_SUPPORTED = "DOMAIN_JOIN_ERROR_NOT_SUPPORTED"
    val DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME = "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME"
    val DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED = "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED"
    val DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED = "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED"
    val DOMAIN_JOIN_NERR_PASSWORD_EXPIRED = "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED"
    val DOMAIN_JOIN_INTERNAL_SERVICE_ERROR = "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR"

    val values = IndexedSeq(IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION, IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION, IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION, NETWORK_INTERFACE_LIMIT_EXCEEDED, INTERNAL_SERVICE_ERROR, IAM_SERVICE_ROLE_IS_MISSING, SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES, IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION, SUBNET_NOT_FOUND, IMAGE_NOT_FOUND, INVALID_SUBNET_CONFIGURATION, SECURITY_GROUPS_NOT_FOUND, IGW_NOT_ATTACHED, IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION, DOMAIN_JOIN_ERROR_FILE_NOT_FOUND, DOMAIN_JOIN_ERROR_ACCESS_DENIED, DOMAIN_JOIN_ERROR_LOGON_FAILURE, DOMAIN_JOIN_ERROR_INVALID_PARAMETER, DOMAIN_JOIN_ERROR_MORE_DATA, DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN, DOMAIN_JOIN_ERROR_NOT_SUPPORTED, DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME, DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED, DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED, DOMAIN_JOIN_NERR_PASSWORD_EXPIRED, DOMAIN_JOIN_INTERNAL_SERVICE_ERROR)
  }

  object FleetStateEnum {
    val STARTING = "STARTING"
    val RUNNING = "RUNNING"
    val STOPPING = "STOPPING"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(STARTING, RUNNING, STOPPING, STOPPED)
  }

  object FleetTypeEnum {
    val ALWAYS_ON = "ALWAYS_ON"
    val ON_DEMAND = "ON_DEMAND"

    val values = IndexedSeq(ALWAYS_ON, ON_DEMAND)
  }

  /**
   * <p>Describes an image.</p>
   */
  @js.native
  trait Image extends js.Object {
    var CreatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var StateChangeReason: js.UndefOr[ImageStateChangeReason]
    var Applications: js.UndefOr[Applications]
    var Platform: js.UndefOr[PlatformType]
    var ImageBuilderSupported: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var ImagePermissions: js.UndefOr[ImagePermissions]
    var PublicBaseImageReleasedDate: js.UndefOr[Timestamp]
    var Visibility: js.UndefOr[VisibilityType]
    var Arn: js.UndefOr[Arn]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var BaseImageArn: js.UndefOr[Arn]
    var State: js.UndefOr[ImageState]
    var DisplayName: js.UndefOr[String]
  }

  object Image {
    def apply(
      CreatedTime: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.undefined,
      Applications: js.UndefOr[Applications] = js.undefined,
      Platform: js.UndefOr[PlatformType] = js.undefined,
      ImageBuilderSupported: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ImagePermissions: js.UndefOr[ImagePermissions] = js.undefined,
      PublicBaseImageReleasedDate: js.UndefOr[Timestamp] = js.undefined,
      Visibility: js.UndefOr[VisibilityType] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
      BaseImageArn: js.UndefOr[Arn] = js.undefined,
      State: js.UndefOr[ImageState] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "StateChangeReason" -> StateChangeReason.map { x => x.asInstanceOf[js.Any] },
        "Applications" -> Applications.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "ImageBuilderSupported" -> ImageBuilderSupported.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ImagePermissions" -> ImagePermissions.map { x => x.asInstanceOf[js.Any] },
        "PublicBaseImageReleasedDate" -> PublicBaseImageReleasedDate.map { x => x.asInstanceOf[js.Any] },
        "Visibility" -> Visibility.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x => x.asInstanceOf[js.Any] },
        "BaseImageArn" -> BaseImageArn.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  /**
   * <p>Describes a streaming instance used for editing an image. New images are created from a snapshot through an image builder.</p>
   */
  @js.native
  trait ImageBuilder extends js.Object {
    var CreatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason]
    var Platform: js.UndefOr[PlatformType]
    var ImageBuilderErrors: js.UndefOr[ResourceErrors]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var Description: js.UndefOr[String]
    var Arn: js.UndefOr[Arn]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var ImageArn: js.UndefOr[Arn]
    var InstanceType: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
    var State: js.UndefOr[ImageBuilderState]
    var DisplayName: js.UndefOr[String]
  }

  object ImageBuilder {
    def apply(
      CreatedTime: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.undefined,
      Platform: js.UndefOr[PlatformType] = js.undefined,
      ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.undefined,
      EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
      DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
      ImageArn: js.UndefOr[Arn] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      State: js.UndefOr[ImageBuilderState] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined): ImageBuilder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "StateChangeReason" -> StateChangeReason.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "ImageBuilderErrors" -> ImageBuilderErrors.map { x => x.asInstanceOf[js.Any] },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x => x.asInstanceOf[js.Any] },
        "DomainJoinInfo" -> DomainJoinInfo.map { x => x.asInstanceOf[js.Any] },
        "ImageArn" -> ImageArn.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageBuilder]
    }
  }

  object ImageBuilderStateEnum {
    val PENDING = "PENDING"
    val UPDATING_AGENT = "UPDATING_AGENT"
    val RUNNING = "RUNNING"
    val STOPPING = "STOPPING"
    val STOPPED = "STOPPED"
    val REBOOTING = "REBOOTING"
    val SNAPSHOTTING = "SNAPSHOTTING"
    val DELETING = "DELETING"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING, UPDATING_AGENT, RUNNING, STOPPING, STOPPED, REBOOTING, SNAPSHOTTING, DELETING, FAILED)
  }

  /**
   * <p>Describes the reason why the last image builder state change occurred.</p>
   */
  @js.native
  trait ImageBuilderStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageBuilderStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ImageBuilderStateChangeReason {
    def apply(
      Code: js.UndefOr[ImageBuilderStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): ImageBuilderStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageBuilderStateChangeReason]
    }
  }

  object ImageBuilderStateChangeReasonCodeEnum {
    val INTERNAL_ERROR = "INTERNAL_ERROR"
    val IMAGE_UNAVAILABLE = "IMAGE_UNAVAILABLE"

    val values = IndexedSeq(INTERNAL_ERROR, IMAGE_UNAVAILABLE)
  }

  /**
   * <p>Describes the permissions for an image. </p>
   */
  @js.native
  trait ImagePermissions extends js.Object {
    var allowFleet: js.UndefOr[BooleanObject]
    var allowImageBuilder: js.UndefOr[BooleanObject]
  }

  object ImagePermissions {
    def apply(
      allowFleet: js.UndefOr[BooleanObject] = js.undefined,
      allowImageBuilder: js.UndefOr[BooleanObject] = js.undefined): ImagePermissions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowFleet" -> allowFleet.map { x => x.asInstanceOf[js.Any] },
        "allowImageBuilder" -> allowImageBuilder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImagePermissions]
    }
  }

  object ImageStateEnum {
    val PENDING = "PENDING"
    val AVAILABLE = "AVAILABLE"
    val FAILED = "FAILED"
    val COPYING = "COPYING"
    val DELETING = "DELETING"

    val values = IndexedSeq(PENDING, AVAILABLE, FAILED, COPYING, DELETING)
  }

  /**
   * <p>Describes the reason why the last image state change occurred.</p>
   */
  @js.native
  trait ImageStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ImageStateChangeReason {
    def apply(
      Code: js.UndefOr[ImageStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): ImageStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageStateChangeReason]
    }
  }

  object ImageStateChangeReasonCodeEnum {
    val INTERNAL_ERROR = "INTERNAL_ERROR"
    val IMAGE_BUILDER_NOT_AVAILABLE = "IMAGE_BUILDER_NOT_AVAILABLE"
    val IMAGE_COPY_FAILURE = "IMAGE_COPY_FAILURE"

    val values = IndexedSeq(INTERNAL_ERROR, IMAGE_BUILDER_NOT_AVAILABLE, IMAGE_COPY_FAILURE)
  }

  @js.native
  trait ListAssociatedFleetsRequest extends js.Object {
    var StackName: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedFleetsRequest {
    def apply(
      StackName: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListAssociatedFleetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedFleetsRequest]
    }
  }

  @js.native
  trait ListAssociatedFleetsResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedFleetsResult {
    def apply(
      Names: js.UndefOr[StringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListAssociatedFleetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedFleetsResult]
    }
  }

  @js.native
  trait ListAssociatedStacksRequest extends js.Object {
    var FleetName: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedStacksRequest {
    def apply(
      FleetName: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListAssociatedStacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetName" -> FleetName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedStacksRequest]
    }
  }

  @js.native
  trait ListAssociatedStacksResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedStacksResult {
    def apply(
      Names: js.UndefOr[StringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListAssociatedStacksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociatedStacksResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(
      Tags: js.UndefOr[Tags] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object MessageActionEnum {
    val SUPPRESS = "SUPPRESS"
    val RESEND = "RESEND"

    val values = IndexedSeq(SUPPRESS, RESEND)
  }

  /**
   * <p>The network details of the fleet instance for the streaming session.</p>
   */
  @js.native
  trait NetworkAccessConfiguration extends js.Object {
    var EniPrivateIpAddress: js.UndefOr[String]
    var EniId: js.UndefOr[String]
  }

  object NetworkAccessConfiguration {
    def apply(
      EniPrivateIpAddress: js.UndefOr[String] = js.undefined,
      EniId: js.UndefOr[String] = js.undefined): NetworkAccessConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EniPrivateIpAddress" -> EniPrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "EniId" -> EniId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAccessConfiguration]
    }
  }

  object PermissionEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object PlatformTypeEnum {
    val WINDOWS = "WINDOWS"

    val values = IndexedSeq(WINDOWS)
  }

  /**
   * <p>Describes a resource error.</p>
   */
  @js.native
  trait ResourceError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var ErrorTimestamp: js.UndefOr[Timestamp]
  }

  object ResourceError {
    def apply(
      ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined,
      ErrorTimestamp: js.UndefOr[Timestamp] = js.undefined): ResourceError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "ErrorTimestamp" -> ErrorTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceError]
    }
  }

  /**
   * <p>Describes the credentials for the service account used by the streaming instance to connect to the directory.</p>
   */
  @js.native
  trait ServiceAccountCredentials extends js.Object {
    var AccountName: js.UndefOr[AccountName]
    var AccountPassword: js.UndefOr[AccountPassword]
  }

  object ServiceAccountCredentials {
    def apply(
      AccountName: js.UndefOr[AccountName] = js.undefined,
      AccountPassword: js.UndefOr[AccountPassword] = js.undefined): ServiceAccountCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountName" -> AccountName.map { x => x.asInstanceOf[js.Any] },
        "AccountPassword" -> AccountPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceAccountCredentials]
    }
  }

  /**
   * <p>Describes a streaming session.</p>
   */
  @js.native
  trait Session extends js.Object {
    var Id: js.UndefOr[String]
    var NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration]
    var FleetName: js.UndefOr[String]
    var StackName: js.UndefOr[String]
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var UserId: js.UndefOr[UserId]
    var State: js.UndefOr[SessionState]
  }

  object Session {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration] = js.undefined,
      FleetName: js.UndefOr[String] = js.undefined,
      StackName: js.UndefOr[String] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      State: js.UndefOr[SessionState] = js.undefined): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "NetworkAccessConfiguration" -> NetworkAccessConfiguration.map { x => x.asInstanceOf[js.Any] },
        "FleetName" -> FleetName.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }

  /**
   * <p>Possible values for the state of a streaming session.</p>
   */
  object SessionStateEnum {
    val ACTIVE = "ACTIVE"
    val PENDING = "PENDING"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(ACTIVE, PENDING, EXPIRED)
  }

  /**
   * <p>Describes the permissions that are available to the specified AWS account for a shared image.</p>
   */
  @js.native
  trait SharedImagePermissions extends js.Object {
    var sharedAccountId: js.UndefOr[AwsAccountId]
    var imagePermissions: js.UndefOr[ImagePermissions]
  }

  object SharedImagePermissions {
    def apply(
      sharedAccountId: js.UndefOr[AwsAccountId] = js.undefined,
      imagePermissions: js.UndefOr[ImagePermissions] = js.undefined): SharedImagePermissions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sharedAccountId" -> sharedAccountId.map { x => x.asInstanceOf[js.Any] },
        "imagePermissions" -> imagePermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SharedImagePermissions]
    }
  }

  /**
   * <p>Describes a stack.</p>
   */
  @js.native
  trait Stack extends js.Object {
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var CreatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StackErrors: js.UndefOr[StackErrors]
    var Description: js.UndefOr[String]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse]
    var Arn: js.UndefOr[Arn]
    var UserSettings: js.UndefOr[UserSettingList]
    var DisplayName: js.UndefOr[String]
  }

  object Stack {
    def apply(
      FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
      CreatedTime: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
      StackErrors: js.UndefOr[StackErrors] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
      ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      UserSettings: js.UndefOr[UserSettingList] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined): Stack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeedbackURL" -> FeedbackURL.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RedirectURL" -> RedirectURL.map { x => x.asInstanceOf[js.Any] },
        "StackErrors" -> StackErrors.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StorageConnectors" -> StorageConnectors.map { x => x.asInstanceOf[js.Any] },
        "ApplicationSettings" -> ApplicationSettings.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "UserSettings" -> UserSettings.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stack]
    }
  }

  object StackAttributeEnum {
    val STORAGE_CONNECTORS = "STORAGE_CONNECTORS"
    val STORAGE_CONNECTOR_HOMEFOLDERS = "STORAGE_CONNECTOR_HOMEFOLDERS"
    val STORAGE_CONNECTOR_GOOGLE_DRIVE = "STORAGE_CONNECTOR_GOOGLE_DRIVE"
    val STORAGE_CONNECTOR_ONE_DRIVE = "STORAGE_CONNECTOR_ONE_DRIVE"
    val REDIRECT_URL = "REDIRECT_URL"
    val FEEDBACK_URL = "FEEDBACK_URL"
    val THEME_NAME = "THEME_NAME"
    val USER_SETTINGS = "USER_SETTINGS"

    val values = IndexedSeq(STORAGE_CONNECTORS, STORAGE_CONNECTOR_HOMEFOLDERS, STORAGE_CONNECTOR_GOOGLE_DRIVE, STORAGE_CONNECTOR_ONE_DRIVE, REDIRECT_URL, FEEDBACK_URL, THEME_NAME, USER_SETTINGS)
  }

  /**
   * <p>Describes a stack error.</p>
   */
  @js.native
  trait StackError extends js.Object {
    var ErrorCode: js.UndefOr[StackErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object StackError {
    def apply(
      ErrorCode: js.UndefOr[StackErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): StackError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackError]
    }
  }

  object StackErrorCodeEnum {
    val STORAGE_CONNECTOR_ERROR = "STORAGE_CONNECTOR_ERROR"
    val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR"

    val values = IndexedSeq(STORAGE_CONNECTOR_ERROR, INTERNAL_SERVICE_ERROR)
  }

  @js.native
  trait StartFleetRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object StartFleetRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): StartFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetRequest]
    }
  }

  @js.native
  trait StartFleetResult extends js.Object {

  }

  object StartFleetResult {
    def apply(): StartFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetResult]
    }
  }

  @js.native
  trait StartImageBuilderRequest extends js.Object {
    var Name: js.UndefOr[String]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
  }

  object StartImageBuilderRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined): StartImageBuilderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AppstreamAgentVersion" -> AppstreamAgentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImageBuilderRequest]
    }
  }

  @js.native
  trait StartImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object StartImageBuilderResult {
    def apply(
      ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): StartImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageBuilder" -> ImageBuilder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImageBuilderResult]
    }
  }

  @js.native
  trait StopFleetRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object StopFleetRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): StopFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetRequest]
    }
  }

  @js.native
  trait StopFleetResult extends js.Object {

  }

  object StopFleetResult {
    def apply(): StopFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetResult]
    }
  }

  @js.native
  trait StopImageBuilderRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object StopImageBuilderRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): StopImageBuilderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopImageBuilderRequest]
    }
  }

  @js.native
  trait StopImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object StopImageBuilderResult {
    def apply(
      ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined): StopImageBuilderResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageBuilder" -> ImageBuilder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopImageBuilderResult]
    }
  }

  /**
   * <p>Describes a connector to enable persistent storage for users.</p>
   */
  @js.native
  trait StorageConnector extends js.Object {
    var ConnectorType: js.UndefOr[StorageConnectorType]
    var ResourceIdentifier: js.UndefOr[ResourceIdentifier]
    var Domains: js.UndefOr[DomainList]
  }

  object StorageConnector {
    def apply(
      ConnectorType: js.UndefOr[StorageConnectorType] = js.undefined,
      ResourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
      Domains: js.UndefOr[DomainList] = js.undefined): StorageConnector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorType" -> ConnectorType.map { x => x.asInstanceOf[js.Any] },
        "ResourceIdentifier" -> ResourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Domains" -> Domains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageConnector]
    }
  }

  /**
   * <p>The type of storage connector.</p>
   */
  object StorageConnectorTypeEnum {
    val HOMEFOLDERS = "HOMEFOLDERS"
    val GOOGLE_DRIVE = "GOOGLE_DRIVE"
    val ONE_DRIVE = "ONE_DRIVE"

    val values = IndexedSeq(HOMEFOLDERS, GOOGLE_DRIVE, ONE_DRIVE)
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDirectoryConfigRequest extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object UpdateDirectoryConfigRequest {
    def apply(
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
      OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
      ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined): UpdateDirectoryConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryName" -> DirectoryName.map { x => x.asInstanceOf[js.Any] },
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccountCredentials" -> ServiceAccountCredentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDirectoryConfigRequest]
    }
  }

  @js.native
  trait UpdateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  object UpdateDirectoryConfigResult {
    def apply(
      DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined): UpdateDirectoryConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryConfig" -> DirectoryConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDirectoryConfigResult]
    }
  }

  @js.native
  trait UpdateFleetRequest extends js.Object {
    var Name: js.UndefOr[String]
    var ComputeCapacity: js.UndefOr[ComputeCapacity]
    var ImageName: js.UndefOr[String]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var Description: js.UndefOr[Description]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var ImageArn: js.UndefOr[Arn]
    var InstanceType: js.UndefOr[String]
    var AttributesToDelete: js.UndefOr[FleetAttributes]
    var VpcConfig: js.UndefOr[VpcConfig]
    var DisplayName: js.UndefOr[DisplayName]
    var DeleteVpcConfig: js.UndefOr[Boolean]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
  }

  object UpdateFleetRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined,
      ImageName: js.UndefOr[String] = js.undefined,
      EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
      DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
      ImageArn: js.UndefOr[Arn] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      AttributesToDelete: js.UndefOr[FleetAttributes] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined,
      DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined,
      MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined): UpdateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ComputeCapacity" -> ComputeCapacity.map { x => x.asInstanceOf[js.Any] },
        "ImageName" -> ImageName.map { x => x.asInstanceOf[js.Any] },
        "EnableDefaultInternetAccess" -> EnableDefaultInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DisconnectTimeoutInSeconds" -> DisconnectTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "DomainJoinInfo" -> DomainJoinInfo.map { x => x.asInstanceOf[js.Any] },
        "ImageArn" -> ImageArn.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AttributesToDelete" -> AttributesToDelete.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "DeleteVpcConfig" -> DeleteVpcConfig.map { x => x.asInstanceOf[js.Any] },
        "MaxUserDurationInSeconds" -> MaxUserDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetRequest]
    }
  }

  @js.native
  trait UpdateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  object UpdateFleetResult {
    def apply(
      Fleet: js.UndefOr[Fleet] = js.undefined): UpdateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fleet" -> Fleet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetResult]
    }
  }

  @js.native
  trait UpdateImagePermissionsRequest extends js.Object {
    var Name: js.UndefOr[Name]
    var SharedAccountId: js.UndefOr[AwsAccountId]
    var ImagePermissions: js.UndefOr[ImagePermissions]
  }

  object UpdateImagePermissionsRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      SharedAccountId: js.UndefOr[AwsAccountId] = js.undefined,
      ImagePermissions: js.UndefOr[ImagePermissions] = js.undefined): UpdateImagePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SharedAccountId" -> SharedAccountId.map { x => x.asInstanceOf[js.Any] },
        "ImagePermissions" -> ImagePermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateImagePermissionsRequest]
    }
  }

  @js.native
  trait UpdateImagePermissionsResult extends js.Object {

  }

  object UpdateImagePermissionsResult {
    def apply(): UpdateImagePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateImagePermissionsResult]
    }
  }

  @js.native
  trait UpdateStackRequest extends js.Object {
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var Name: js.UndefOr[String]
    var RedirectURL: js.UndefOr[RedirectURL]
    var Description: js.UndefOr[Description]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var ApplicationSettings: js.UndefOr[ApplicationSettings]
    var DeleteStorageConnectors: js.UndefOr[Boolean]
    var AttributesToDelete: js.UndefOr[StackAttributes]
    var UserSettings: js.UndefOr[UserSettingList]
    var DisplayName: js.UndefOr[DisplayName]
  }

  object UpdateStackRequest {
    def apply(
      FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
      ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined,
      DeleteStorageConnectors: js.UndefOr[Boolean] = js.undefined,
      AttributesToDelete: js.UndefOr[StackAttributes] = js.undefined,
      UserSettings: js.UndefOr[UserSettingList] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined): UpdateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeedbackURL" -> FeedbackURL.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RedirectURL" -> RedirectURL.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StorageConnectors" -> StorageConnectors.map { x => x.asInstanceOf[js.Any] },
        "ApplicationSettings" -> ApplicationSettings.map { x => x.asInstanceOf[js.Any] },
        "DeleteStorageConnectors" -> DeleteStorageConnectors.map { x => x.asInstanceOf[js.Any] },
        "AttributesToDelete" -> AttributesToDelete.map { x => x.asInstanceOf[js.Any] },
        "UserSettings" -> UserSettings.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackRequest]
    }
  }

  @js.native
  trait UpdateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  object UpdateStackResult {
    def apply(
      Stack: js.UndefOr[Stack] = js.undefined): UpdateStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Stack" -> Stack.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackResult]
    }
  }

  /**
   * <p>Describes a user in the user pool.</p>
   */
  @js.native
  trait User extends js.Object {
    var LastName: js.UndefOr[UserAttributeValue]
    var UserName: js.UndefOr[Username]
    var CreatedTime: js.UndefOr[Timestamp]
    var Enabled: js.UndefOr[Boolean]
    var FirstName: js.UndefOr[UserAttributeValue]
    var Arn: js.UndefOr[Arn]
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var Status: js.UndefOr[String]
  }

  object User {
    def apply(
      LastName: js.UndefOr[UserAttributeValue] = js.undefined,
      UserName: js.UndefOr[Username] = js.undefined,
      CreatedTime: js.UndefOr[Timestamp] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      FirstName: js.UndefOr[UserAttributeValue] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
   * <p>Describes an action and whether the action is enabled or disabled for users during their streaming sessions.</p>
   */
  @js.native
  trait UserSetting extends js.Object {
    var Action: js.UndefOr[Action]
    var Permission: js.UndefOr[Permission]
  }

  object UserSetting {
    def apply(
      Action: js.UndefOr[Action] = js.undefined,
      Permission: js.UndefOr[Permission] = js.undefined): UserSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Permission" -> Permission.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserSetting]
    }
  }

  /**
   * <p>Describes a user in the user pool and the associated stack.</p>
   */
  @js.native
  trait UserStackAssociation extends js.Object {
    var StackName: js.UndefOr[String]
    var UserName: js.UndefOr[Username]
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var SendEmailNotification: js.UndefOr[Boolean]
  }

  object UserStackAssociation {
    def apply(
      StackName: js.UndefOr[String] = js.undefined,
      UserName: js.UndefOr[Username] = js.undefined,
      AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      SendEmailNotification: js.UndefOr[Boolean] = js.undefined): UserStackAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationType" -> AuthenticationType.map { x => x.asInstanceOf[js.Any] },
        "SendEmailNotification" -> SendEmailNotification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStackAssociation]
    }
  }

  /**
   * <p>Describes the error that is returned when a user can’t be associated with or disassociated from a stack. </p>
   */
  @js.native
  trait UserStackAssociationError extends js.Object {
    var UserStackAssociation: js.UndefOr[UserStackAssociation]
    var ErrorCode: js.UndefOr[UserStackAssociationErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object UserStackAssociationError {
    def apply(
      UserStackAssociation: js.UndefOr[UserStackAssociation] = js.undefined,
      ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): UserStackAssociationError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserStackAssociation" -> UserStackAssociation.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStackAssociationError]
    }
  }

  object UserStackAssociationErrorCodeEnum {
    val STACK_NOT_FOUND = "STACK_NOT_FOUND"
    val USER_NAME_NOT_FOUND = "USER_NAME_NOT_FOUND"
    val INTERNAL_ERROR = "INTERNAL_ERROR"

    val values = IndexedSeq(STACK_NOT_FOUND, USER_NAME_NOT_FOUND, INTERNAL_ERROR)
  }

  object VisibilityTypeEnum {
    val PUBLIC = "PUBLIC"
    val PRIVATE = "PRIVATE"
    val SHARED = "SHARED"

    val values = IndexedSeq(PUBLIC, PRIVATE, SHARED)
  }

  /**
   * <p>Describes VPC configuration information.</p>
   */
  @js.native
  trait VpcConfig extends js.Object {
    var SubnetIds: js.UndefOr[SubnetIdList]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
  }

  object VpcConfig {
    def apply(
      SubnetIds: js.UndefOr[SubnetIdList] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined): VpcConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
    }
  }
}
