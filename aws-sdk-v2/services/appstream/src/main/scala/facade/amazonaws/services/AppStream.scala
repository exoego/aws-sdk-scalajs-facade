package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object appstream {
  type AccessEndpointList = js.Array[AccessEndpoint]
  type AccountName = String
  type AccountPassword = String
  type AppBlocks = js.Array[AppBlock]
  type ApplicationAttributes = js.Array[ApplicationAttribute]
  type ApplicationFleetAssociationList = js.Array[ApplicationFleetAssociation]
  type Applications = js.Array[Application]
  type AppstreamAgentVersion = String
  type Arn = String
  type ArnList = js.Array[Arn]
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
  type EmbedHostDomain = String
  type EmbedHostDomains = js.Array[EmbedHostDomain]
  type FeedbackURL = String
  type FleetAttributes = js.Array[FleetAttribute]
  type FleetErrors = js.Array[FleetError]
  type FleetList = js.Array[Fleet]
  type ImageBuilderList = js.Array[ImageBuilder]
  type ImageList = js.Array[Image]
  type LastReportGenerationExecutionErrors = js.Array[LastReportGenerationExecutionError]
  type MaxResults = Int
  type Metadata = js.Dictionary[String]
  type Name = String
  type OrganizationalUnitDistinguishedName = String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  type Platforms = js.Array[PlatformType]
  type RedirectURL = String
  type RegionName = String
  type ResourceErrors = js.Array[ResourceError]
  type ResourceIdentifier = String
  type S3Bucket = String
  type S3Key = String
  type SecurityGroupIdList = js.Array[String]
  type SessionList = js.Array[Session]
  type SettingsGroup = String
  type SharedImagePermissionsList = js.Array[SharedImagePermissions]
  type StackAttributes = js.Array[StackAttribute]
  type StackErrors = js.Array[StackError]
  type StackList = js.Array[Stack]
  type StorageConnectorList = js.Array[StorageConnector]
  type StreamingUrlUserId = String
  type StringList = js.Array[String]
  type SubnetIdList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Timestamp = js.Date
  type UsageReportSubscriptionList = js.Array[UsageReportSubscription]
  type UsbDeviceFilterString = String
  type UsbDeviceFilterStrings = js.Array[UsbDeviceFilterString]
  type UserAttributeValue = String
  type UserId = String
  type UserList = js.Array[User]
  type UserSettingList = js.Array[UserSetting]
  type UserStackAssociationErrorList = js.Array[UserStackAssociationError]
  type UserStackAssociationList = js.Array[UserStackAssociation]
  type Username = String

  final class AppStreamOps(private val service: AppStream) extends AnyVal {

    @inline def associateApplicationFleetFuture(params: AssociateApplicationFleetRequest): Future[AssociateApplicationFleetResult] = service.associateApplicationFleet(params).promise().toFuture
    @inline def associateFleetFuture(params: AssociateFleetRequest): Future[AssociateFleetResult] = service.associateFleet(params).promise().toFuture
    @inline def batchAssociateUserStackFuture(params: BatchAssociateUserStackRequest): Future[BatchAssociateUserStackResult] = service.batchAssociateUserStack(params).promise().toFuture
    @inline def batchDisassociateUserStackFuture(params: BatchDisassociateUserStackRequest): Future[BatchDisassociateUserStackResult] = service.batchDisassociateUserStack(params).promise().toFuture
    @inline def copyImageFuture(params: CopyImageRequest): Future[CopyImageResponse] = service.copyImage(params).promise().toFuture
    @inline def createAppBlockFuture(params: CreateAppBlockRequest): Future[CreateAppBlockResult] = service.createAppBlock(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResult] = service.createApplication(params).promise().toFuture
    @inline def createDirectoryConfigFuture(params: CreateDirectoryConfigRequest): Future[CreateDirectoryConfigResult] = service.createDirectoryConfig(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResult] = service.createFleet(params).promise().toFuture
    @inline def createImageBuilderFuture(params: CreateImageBuilderRequest): Future[CreateImageBuilderResult] = service.createImageBuilder(params).promise().toFuture
    @inline def createImageBuilderStreamingURLFuture(params: CreateImageBuilderStreamingURLRequest): Future[CreateImageBuilderStreamingURLResult] = service.createImageBuilderStreamingURL(params).promise().toFuture
    @inline def createStackFuture(params: CreateStackRequest): Future[CreateStackResult] = service.createStack(params).promise().toFuture
    @inline def createStreamingURLFuture(params: CreateStreamingURLRequest): Future[CreateStreamingURLResult] = service.createStreamingURL(params).promise().toFuture
    @inline def createUpdatedImageFuture(params: CreateUpdatedImageRequest): Future[CreateUpdatedImageResult] = service.createUpdatedImage(params).promise().toFuture
    @inline def createUsageReportSubscriptionFuture(params: CreateUsageReportSubscriptionRequest): Future[CreateUsageReportSubscriptionResult] = service.createUsageReportSubscription(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResult] = service.createUser(params).promise().toFuture
    @inline def deleteAppBlockFuture(params: DeleteAppBlockRequest): Future[DeleteAppBlockResult] = service.deleteAppBlock(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResult] = service.deleteApplication(params).promise().toFuture
    @inline def deleteDirectoryConfigFuture(params: DeleteDirectoryConfigRequest): Future[DeleteDirectoryConfigResult] = service.deleteDirectoryConfig(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResult] = service.deleteFleet(params).promise().toFuture
    @inline def deleteImageBuilderFuture(params: DeleteImageBuilderRequest): Future[DeleteImageBuilderResult] = service.deleteImageBuilder(params).promise().toFuture
    @inline def deleteImageFuture(params: DeleteImageRequest): Future[DeleteImageResult] = service.deleteImage(params).promise().toFuture
    @inline def deleteImagePermissionsFuture(params: DeleteImagePermissionsRequest): Future[DeleteImagePermissionsResult] = service.deleteImagePermissions(params).promise().toFuture
    @inline def deleteStackFuture(params: DeleteStackRequest): Future[DeleteStackResult] = service.deleteStack(params).promise().toFuture
    @inline def deleteUsageReportSubscriptionFuture(params: DeleteUsageReportSubscriptionRequest): Future[DeleteUsageReportSubscriptionResult] = service.deleteUsageReportSubscription(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResult] = service.deleteUser(params).promise().toFuture
    @inline def describeAppBlocksFuture(params: DescribeAppBlocksRequest): Future[DescribeAppBlocksResult] = service.describeAppBlocks(params).promise().toFuture
    @inline def describeApplicationFleetAssociationsFuture(params: DescribeApplicationFleetAssociationsRequest): Future[DescribeApplicationFleetAssociationsResult] = service.describeApplicationFleetAssociations(params).promise().toFuture
    @inline def describeApplicationsFuture(params: DescribeApplicationsRequest): Future[DescribeApplicationsResult] = service.describeApplications(params).promise().toFuture
    @inline def describeDirectoryConfigsFuture(params: DescribeDirectoryConfigsRequest): Future[DescribeDirectoryConfigsResult] = service.describeDirectoryConfigs(params).promise().toFuture
    @inline def describeFleetsFuture(params: DescribeFleetsRequest): Future[DescribeFleetsResult] = service.describeFleets(params).promise().toFuture
    @inline def describeImageBuildersFuture(params: DescribeImageBuildersRequest): Future[DescribeImageBuildersResult] = service.describeImageBuilders(params).promise().toFuture
    @inline def describeImagePermissionsFuture(params: DescribeImagePermissionsRequest): Future[DescribeImagePermissionsResult] = service.describeImagePermissions(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResult] = service.describeImages(params).promise().toFuture
    @inline def describeSessionsFuture(params: DescribeSessionsRequest): Future[DescribeSessionsResult] = service.describeSessions(params).promise().toFuture
    @inline def describeStacksFuture(params: DescribeStacksRequest): Future[DescribeStacksResult] = service.describeStacks(params).promise().toFuture
    @inline def describeUsageReportSubscriptionsFuture(params: DescribeUsageReportSubscriptionsRequest): Future[DescribeUsageReportSubscriptionsResult] = service.describeUsageReportSubscriptions(params).promise().toFuture
    @inline def describeUserStackAssociationsFuture(params: DescribeUserStackAssociationsRequest): Future[DescribeUserStackAssociationsResult] = service.describeUserStackAssociations(params).promise().toFuture
    @inline def describeUsersFuture(params: DescribeUsersRequest): Future[DescribeUsersResult] = service.describeUsers(params).promise().toFuture
    @inline def disableUserFuture(params: DisableUserRequest): Future[DisableUserResult] = service.disableUser(params).promise().toFuture
    @inline def disassociateApplicationFleetFuture(params: DisassociateApplicationFleetRequest): Future[DisassociateApplicationFleetResult] = service.disassociateApplicationFleet(params).promise().toFuture
    @inline def disassociateFleetFuture(params: DisassociateFleetRequest): Future[DisassociateFleetResult] = service.disassociateFleet(params).promise().toFuture
    @inline def enableUserFuture(params: EnableUserRequest): Future[EnableUserResult] = service.enableUser(params).promise().toFuture
    @inline def expireSessionFuture(params: ExpireSessionRequest): Future[ExpireSessionResult] = service.expireSession(params).promise().toFuture
    @inline def listAssociatedFleetsFuture(params: ListAssociatedFleetsRequest): Future[ListAssociatedFleetsResult] = service.listAssociatedFleets(params).promise().toFuture
    @inline def listAssociatedStacksFuture(params: ListAssociatedStacksRequest): Future[ListAssociatedStacksResult] = service.listAssociatedStacks(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startFleetFuture(params: StartFleetRequest): Future[StartFleetResult] = service.startFleet(params).promise().toFuture
    @inline def startImageBuilderFuture(params: StartImageBuilderRequest): Future[StartImageBuilderResult] = service.startImageBuilder(params).promise().toFuture
    @inline def stopFleetFuture(params: StopFleetRequest): Future[StopFleetResult] = service.stopFleet(params).promise().toFuture
    @inline def stopImageBuilderFuture(params: StopImageBuilderRequest): Future[StopImageBuilderResult] = service.stopImageBuilder(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResult] = service.updateApplication(params).promise().toFuture
    @inline def updateDirectoryConfigFuture(params: UpdateDirectoryConfigRequest): Future[UpdateDirectoryConfigResult] = service.updateDirectoryConfig(params).promise().toFuture
    @inline def updateFleetFuture(params: UpdateFleetRequest): Future[UpdateFleetResult] = service.updateFleet(params).promise().toFuture
    @inline def updateImagePermissionsFuture(params: UpdateImagePermissionsRequest): Future[UpdateImagePermissionsResult] = service.updateImagePermissions(params).promise().toFuture
    @inline def updateStackFuture(params: UpdateStackRequest): Future[UpdateStackResult] = service.updateStack(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/appstream", JSImport.Namespace, "AWS.AppStream")
  class AppStream() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateApplicationFleet(params: AssociateApplicationFleetRequest): Request[AssociateApplicationFleetResult] = js.native
    def associateFleet(params: AssociateFleetRequest): Request[AssociateFleetResult] = js.native
    def batchAssociateUserStack(params: BatchAssociateUserStackRequest): Request[BatchAssociateUserStackResult] = js.native
    def batchDisassociateUserStack(params: BatchDisassociateUserStackRequest): Request[BatchDisassociateUserStackResult] = js.native
    def copyImage(params: CopyImageRequest): Request[CopyImageResponse] = js.native
    def createAppBlock(params: CreateAppBlockRequest): Request[CreateAppBlockResult] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResult] = js.native
    def createDirectoryConfig(params: CreateDirectoryConfigRequest): Request[CreateDirectoryConfigResult] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResult] = js.native
    def createImageBuilder(params: CreateImageBuilderRequest): Request[CreateImageBuilderResult] = js.native
    def createImageBuilderStreamingURL(params: CreateImageBuilderStreamingURLRequest): Request[CreateImageBuilderStreamingURLResult] = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult] = js.native
    def createStreamingURL(params: CreateStreamingURLRequest): Request[CreateStreamingURLResult] = js.native
    def createUpdatedImage(params: CreateUpdatedImageRequest): Request[CreateUpdatedImageResult] = js.native
    def createUsageReportSubscription(params: CreateUsageReportSubscriptionRequest): Request[CreateUsageReportSubscriptionResult] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResult] = js.native
    def deleteAppBlock(params: DeleteAppBlockRequest): Request[DeleteAppBlockResult] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResult] = js.native
    def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): Request[DeleteDirectoryConfigResult] = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResult] = js.native
    def deleteImage(params: DeleteImageRequest): Request[DeleteImageResult] = js.native
    def deleteImageBuilder(params: DeleteImageBuilderRequest): Request[DeleteImageBuilderResult] = js.native
    def deleteImagePermissions(params: DeleteImagePermissionsRequest): Request[DeleteImagePermissionsResult] = js.native
    def deleteStack(params: DeleteStackRequest): Request[DeleteStackResult] = js.native
    def deleteUsageReportSubscription(params: DeleteUsageReportSubscriptionRequest): Request[DeleteUsageReportSubscriptionResult] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResult] = js.native
    def describeAppBlocks(params: DescribeAppBlocksRequest): Request[DescribeAppBlocksResult] = js.native
    def describeApplicationFleetAssociations(params: DescribeApplicationFleetAssociationsRequest): Request[DescribeApplicationFleetAssociationsResult] = js.native
    def describeApplications(params: DescribeApplicationsRequest): Request[DescribeApplicationsResult] = js.native
    def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): Request[DescribeDirectoryConfigsResult] = js.native
    def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult] = js.native
    def describeImageBuilders(params: DescribeImageBuildersRequest): Request[DescribeImageBuildersResult] = js.native
    def describeImagePermissions(params: DescribeImagePermissionsRequest): Request[DescribeImagePermissionsResult] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult] = js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResult] = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult] = js.native
    def describeUsageReportSubscriptions(params: DescribeUsageReportSubscriptionsRequest): Request[DescribeUsageReportSubscriptionsResult] = js.native
    def describeUserStackAssociations(params: DescribeUserStackAssociationsRequest): Request[DescribeUserStackAssociationsResult] = js.native
    def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResult] = js.native
    def disableUser(params: DisableUserRequest): Request[DisableUserResult] = js.native
    def disassociateApplicationFleet(params: DisassociateApplicationFleetRequest): Request[DisassociateApplicationFleetResult] = js.native
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
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResult] = js.native
    def updateDirectoryConfig(params: UpdateDirectoryConfigRequest): Request[UpdateDirectoryConfigResult] = js.native
    def updateFleet(params: UpdateFleetRequest): Request[UpdateFleetResult] = js.native
    def updateImagePermissions(params: UpdateImagePermissionsRequest): Request[UpdateImagePermissionsResult] = js.native
    def updateStack(params: UpdateStackRequest): Request[UpdateStackResult] = js.native
  }
  object AppStream {
    @inline implicit def toOps(service: AppStream): AppStreamOps = {
      new AppStreamOps(service)
    }
  }

  /** Describes an interface VPC endpoint (interface endpoint) that lets you create a private connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When you specify an interface endpoint for a stack, users of the stack can connect to AppStream 2.0 only through that endpoint. When you specify an interface endpoint for an image builder, administrators can connect to the image builder only through that endpoint.
    */
  @js.native
  trait AccessEndpoint extends js.Object {
    var EndpointType: AccessEndpointType
    var VpceId: js.UndefOr[String]
  }

  object AccessEndpoint {
    @inline
    def apply(
        EndpointType: AccessEndpointType,
        VpceId: js.UndefOr[String] = js.undefined
    ): AccessEndpoint = {
      val __obj = js.Dynamic.literal(
        "EndpointType" -> EndpointType.asInstanceOf[js.Any]
      )

      VpceId.foreach(__v => __obj.updateDynamic("VpceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessEndpoint]
    }
  }

  /** Describes an app block. App blocks are an Amazon AppStream 2.0 resource that stores the details about the virtual hard disk in an S3 bucket. It also stores the setup script with details about how to mount the virtual hard disk. The virtual hard disk includes the application binaries and other files necessary to launch your applications. Multiple applications can be assigned to a single app block. This is only supported for Elastic fleets.
    */
  @js.native
  trait AppBlock extends js.Object {
    var Arn: Arn
    var Name: String
    var SetupScriptDetails: ScriptDetails
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var SourceS3Location: js.UndefOr[S3Location]
  }

  object AppBlock {
    @inline
    def apply(
        Arn: Arn,
        Name: String,
        SetupScriptDetails: ScriptDetails,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        SourceS3Location: js.UndefOr[S3Location] = js.undefined
    ): AppBlock = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SetupScriptDetails" -> SetupScriptDetails.asInstanceOf[js.Any]
      )

      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      SourceS3Location.foreach(__v => __obj.updateDynamic("SourceS3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppBlock]
    }
  }

  /** Describes an application in the application catalog.
    */
  @js.native
  trait Application extends js.Object {
    var AppBlockArn: js.UndefOr[Arn]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var IconS3Location: js.UndefOr[S3Location]
    var IconURL: js.UndefOr[String]
    var InstanceFamilies: js.UndefOr[StringList]
    var LaunchParameters: js.UndefOr[String]
    var LaunchPath: js.UndefOr[String]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[String]
    var Platforms: js.UndefOr[Platforms]
    var WorkingDirectory: js.UndefOr[String]
  }

  object Application {
    @inline
    def apply(
        AppBlockArn: js.UndefOr[Arn] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        IconS3Location: js.UndefOr[S3Location] = js.undefined,
        IconURL: js.UndefOr[String] = js.undefined,
        InstanceFamilies: js.UndefOr[StringList] = js.undefined,
        LaunchParameters: js.UndefOr[String] = js.undefined,
        LaunchPath: js.UndefOr[String] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Platforms: js.UndefOr[Platforms] = js.undefined,
        WorkingDirectory: js.UndefOr[String] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal()
      AppBlockArn.foreach(__v => __obj.updateDynamic("AppBlockArn")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IconS3Location.foreach(__v => __obj.updateDynamic("IconS3Location")(__v.asInstanceOf[js.Any]))
      IconURL.foreach(__v => __obj.updateDynamic("IconURL")(__v.asInstanceOf[js.Any]))
      InstanceFamilies.foreach(__v => __obj.updateDynamic("InstanceFamilies")(__v.asInstanceOf[js.Any]))
      LaunchParameters.foreach(__v => __obj.updateDynamic("LaunchParameters")(__v.asInstanceOf[js.Any]))
      LaunchPath.foreach(__v => __obj.updateDynamic("LaunchPath")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Platforms.foreach(__v => __obj.updateDynamic("Platforms")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
    }
  }

  /** Describes the application fleet association.
    */
  @js.native
  trait ApplicationFleetAssociation extends js.Object {
    var ApplicationArn: Arn
    var FleetName: String
  }

  object ApplicationFleetAssociation {
    @inline
    def apply(
        ApplicationArn: Arn,
        FleetName: String
    ): ApplicationFleetAssociation = {
      val __obj = js.Dynamic.literal(
        "ApplicationArn" -> ApplicationArn.asInstanceOf[js.Any],
        "FleetName" -> FleetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApplicationFleetAssociation]
    }
  }

  /** The persistent application settings for users of a stack.
    */
  @js.native
  trait ApplicationSettings extends js.Object {
    var Enabled: Boolean
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  object ApplicationSettings {
    @inline
    def apply(
        Enabled: Boolean,
        SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined
    ): ApplicationSettings = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      SettingsGroup.foreach(__v => __obj.updateDynamic("SettingsGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSettings]
    }
  }

  /** Describes the persistent application settings for users of a stack.
    */
  @js.native
  trait ApplicationSettingsResponse extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  object ApplicationSettingsResponse {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined
    ): ApplicationSettingsResponse = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      SettingsGroup.foreach(__v => __obj.updateDynamic("SettingsGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSettingsResponse]
    }
  }

  @js.native
  trait AssociateApplicationFleetRequest extends js.Object {
    var ApplicationArn: Arn
    var FleetName: Name
  }

  object AssociateApplicationFleetRequest {
    @inline
    def apply(
        ApplicationArn: Arn,
        FleetName: Name
    ): AssociateApplicationFleetRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationArn" -> ApplicationArn.asInstanceOf[js.Any],
        "FleetName" -> FleetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateApplicationFleetRequest]
    }
  }

  @js.native
  trait AssociateApplicationFleetResult extends js.Object {
    var ApplicationFleetAssociation: js.UndefOr[ApplicationFleetAssociation]
  }

  object AssociateApplicationFleetResult {
    @inline
    def apply(
        ApplicationFleetAssociation: js.UndefOr[ApplicationFleetAssociation] = js.undefined
    ): AssociateApplicationFleetResult = {
      val __obj = js.Dynamic.literal()
      ApplicationFleetAssociation.foreach(__v => __obj.updateDynamic("ApplicationFleetAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateApplicationFleetResult]
    }
  }

  @js.native
  trait AssociateFleetRequest extends js.Object {
    var FleetName: String
    var StackName: String
  }

  object AssociateFleetRequest {
    @inline
    def apply(
        FleetName: String,
        StackName: String
    ): AssociateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateFleetRequest]
    }
  }

  @js.native
  trait AssociateFleetResult extends js.Object

  object AssociateFleetResult {
    @inline
    def apply(): AssociateFleetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateFleetResult]
    }
  }

  @js.native
  trait BatchAssociateUserStackRequest extends js.Object {
    var UserStackAssociations: UserStackAssociationList
  }

  object BatchAssociateUserStackRequest {
    @inline
    def apply(
        UserStackAssociations: UserStackAssociationList
    ): BatchAssociateUserStackRequest = {
      val __obj = js.Dynamic.literal(
        "UserStackAssociations" -> UserStackAssociations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchAssociateUserStackRequest]
    }
  }

  @js.native
  trait BatchAssociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  object BatchAssociateUserStackResult {
    @inline
    def apply(
        errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
    ): BatchAssociateUserStackResult = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateUserStackResult]
    }
  }

  @js.native
  trait BatchDisassociateUserStackRequest extends js.Object {
    var UserStackAssociations: UserStackAssociationList
  }

  object BatchDisassociateUserStackRequest {
    @inline
    def apply(
        UserStackAssociations: UserStackAssociationList
    ): BatchDisassociateUserStackRequest = {
      val __obj = js.Dynamic.literal(
        "UserStackAssociations" -> UserStackAssociations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDisassociateUserStackRequest]
    }
  }

  @js.native
  trait BatchDisassociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  object BatchDisassociateUserStackResult {
    @inline
    def apply(
        errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
    ): BatchDisassociateUserStackResult = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateUserStackResult]
    }
  }

  /** Describes the capacity for a fleet.
    */
  @js.native
  trait ComputeCapacity extends js.Object {
    var DesiredInstances: Int
  }

  object ComputeCapacity {
    @inline
    def apply(
        DesiredInstances: Int
    ): ComputeCapacity = {
      val __obj = js.Dynamic.literal(
        "DesiredInstances" -> DesiredInstances.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ComputeCapacity]
    }
  }

  /** Describes the capacity status for a fleet.
    */
  @js.native
  trait ComputeCapacityStatus extends js.Object {
    var Desired: Int
    var Available: js.UndefOr[Int]
    var InUse: js.UndefOr[Int]
    var Running: js.UndefOr[Int]
  }

  object ComputeCapacityStatus {
    @inline
    def apply(
        Desired: Int,
        Available: js.UndefOr[Int] = js.undefined,
        InUse: js.UndefOr[Int] = js.undefined,
        Running: js.UndefOr[Int] = js.undefined
    ): ComputeCapacityStatus = {
      val __obj = js.Dynamic.literal(
        "Desired" -> Desired.asInstanceOf[js.Any]
      )

      Available.foreach(__v => __obj.updateDynamic("Available")(__v.asInstanceOf[js.Any]))
      InUse.foreach(__v => __obj.updateDynamic("InUse")(__v.asInstanceOf[js.Any]))
      Running.foreach(__v => __obj.updateDynamic("Running")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeCapacityStatus]
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
    @inline
    def apply(
        DestinationImageName: Name,
        DestinationRegion: RegionName,
        SourceImageName: Name,
        DestinationImageDescription: js.UndefOr[Description] = js.undefined
    ): CopyImageRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationImageName" -> DestinationImageName.asInstanceOf[js.Any],
        "DestinationRegion" -> DestinationRegion.asInstanceOf[js.Any],
        "SourceImageName" -> SourceImageName.asInstanceOf[js.Any]
      )

      DestinationImageDescription.foreach(__v => __obj.updateDynamic("DestinationImageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyImageRequest]
    }
  }

  @js.native
  trait CopyImageResponse extends js.Object {
    var DestinationImageName: js.UndefOr[Name]
  }

  object CopyImageResponse {
    @inline
    def apply(
        DestinationImageName: js.UndefOr[Name] = js.undefined
    ): CopyImageResponse = {
      val __obj = js.Dynamic.literal()
      DestinationImageName.foreach(__v => __obj.updateDynamic("DestinationImageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyImageResponse]
    }
  }

  @js.native
  trait CreateAppBlockRequest extends js.Object {
    var Name: Name
    var SetupScriptDetails: ScriptDetails
    var SourceS3Location: S3Location
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var Tags: js.UndefOr[Tags]
  }

  object CreateAppBlockRequest {
    @inline
    def apply(
        Name: Name,
        SetupScriptDetails: ScriptDetails,
        SourceS3Location: S3Location,
        Description: js.UndefOr[Description] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateAppBlockRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SetupScriptDetails" -> SetupScriptDetails.asInstanceOf[js.Any],
        "SourceS3Location" -> SourceS3Location.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppBlockRequest]
    }
  }

  @js.native
  trait CreateAppBlockResult extends js.Object {
    var AppBlock: js.UndefOr[AppBlock]
  }

  object CreateAppBlockResult {
    @inline
    def apply(
        AppBlock: js.UndefOr[AppBlock] = js.undefined
    ): CreateAppBlockResult = {
      val __obj = js.Dynamic.literal()
      AppBlock.foreach(__v => __obj.updateDynamic("AppBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppBlockResult]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var AppBlockArn: Arn
    var IconS3Location: S3Location
    var InstanceFamilies: StringList
    var LaunchPath: String
    var Name: Name
    var Platforms: Platforms
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var LaunchParameters: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
    var WorkingDirectory: js.UndefOr[String]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        AppBlockArn: Arn,
        IconS3Location: S3Location,
        InstanceFamilies: StringList,
        LaunchPath: String,
        Name: Name,
        Platforms: Platforms,
        Description: js.UndefOr[Description] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        LaunchParameters: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WorkingDirectory: js.UndefOr[String] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "AppBlockArn" -> AppBlockArn.asInstanceOf[js.Any],
        "IconS3Location" -> IconS3Location.asInstanceOf[js.Any],
        "InstanceFamilies" -> InstanceFamilies.asInstanceOf[js.Any],
        "LaunchPath" -> LaunchPath.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Platforms" -> Platforms.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      LaunchParameters.foreach(__v => __obj.updateDynamic("LaunchParameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResult extends js.Object {
    var Application: js.UndefOr[Application]
  }

  object CreateApplicationResult {
    @inline
    def apply(
        Application: js.UndefOr[Application] = js.undefined
    ): CreateApplicationResult = {
      val __obj = js.Dynamic.literal()
      Application.foreach(__v => __obj.updateDynamic("Application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResult]
    }
  }

  @js.native
  trait CreateDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
    var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object CreateDirectoryConfigRequest {
    @inline
    def apply(
        DirectoryName: DirectoryName,
        OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList,
        ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
    ): CreateDirectoryConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryName" -> DirectoryName.asInstanceOf[js.Any],
        "OrganizationalUnitDistinguishedNames" -> OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any]
      )

      ServiceAccountCredentials.foreach(__v => __obj.updateDynamic("ServiceAccountCredentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectoryConfigRequest]
    }
  }

  @js.native
  trait CreateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  object CreateDirectoryConfigResult {
    @inline
    def apply(
        DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined
    ): CreateDirectoryConfigResult = {
      val __obj = js.Dynamic.literal()
      DirectoryConfig.foreach(__v => __obj.updateDynamic("DirectoryConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectoryConfigResult]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var InstanceType: String
    var Name: Name
    var ComputeCapacity: js.UndefOr[ComputeCapacity]
    var Description: js.UndefOr[Description]
    var DisconnectTimeoutInSeconds: js.UndefOr[Int]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var FleetType: js.UndefOr[FleetType]
    var IamRoleArn: js.UndefOr[Arn]
    var IdleDisconnectTimeoutInSeconds: js.UndefOr[Int]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var MaxConcurrentSessions: js.UndefOr[Int]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var Platform: js.UndefOr[PlatformType]
    var StreamView: js.UndefOr[StreamView]
    var Tags: js.UndefOr[Tags]
    var UsbDeviceFilterStrings: js.UndefOr[UsbDeviceFilterStrings]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateFleetRequest {
    @inline
    def apply(
        InstanceType: String,
        Name: Name,
        ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
        EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        FleetType: js.UndefOr[FleetType] = js.undefined,
        IamRoleArn: js.UndefOr[Arn] = js.undefined,
        IdleDisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
        ImageArn: js.UndefOr[Arn] = js.undefined,
        ImageName: js.UndefOr[String] = js.undefined,
        MaxConcurrentSessions: js.UndefOr[Int] = js.undefined,
        MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined,
        Platform: js.UndefOr[PlatformType] = js.undefined,
        StreamView: js.UndefOr[StreamView] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UsbDeviceFilterStrings: js.UndefOr[UsbDeviceFilterStrings] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ComputeCapacity.foreach(__v => __obj.updateDynamic("ComputeCapacity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisconnectTimeoutInSeconds.foreach(__v => __obj.updateDynamic("DisconnectTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DomainJoinInfo.foreach(__v => __obj.updateDynamic("DomainJoinInfo")(__v.asInstanceOf[js.Any]))
      EnableDefaultInternetAccess.foreach(__v => __obj.updateDynamic("EnableDefaultInternetAccess")(__v.asInstanceOf[js.Any]))
      FleetType.foreach(__v => __obj.updateDynamic("FleetType")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      IdleDisconnectTimeoutInSeconds.foreach(__v => __obj.updateDynamic("IdleDisconnectTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      MaxConcurrentSessions.foreach(__v => __obj.updateDynamic("MaxConcurrentSessions")(__v.asInstanceOf[js.Any]))
      MaxUserDurationInSeconds.foreach(__v => __obj.updateDynamic("MaxUserDurationInSeconds")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      StreamView.foreach(__v => __obj.updateDynamic("StreamView")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UsbDeviceFilterStrings.foreach(__v => __obj.updateDynamic("UsbDeviceFilterStrings")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  object CreateFleetResult {
    @inline
    def apply(
        Fleet: js.UndefOr[Fleet] = js.undefined
    ): CreateFleetResult = {
      val __obj = js.Dynamic.literal()
      Fleet.foreach(__v => __obj.updateDynamic("Fleet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetResult]
    }
  }

  @js.native
  trait CreateImageBuilderRequest extends js.Object {
    var InstanceType: String
    var Name: Name
    var AccessEndpoints: js.UndefOr[AccessEndpointList]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var IamRoleArn: js.UndefOr[Arn]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateImageBuilderRequest {
    @inline
    def apply(
        InstanceType: String,
        Name: Name,
        AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined,
        AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
        EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        IamRoleArn: js.UndefOr[Arn] = js.undefined,
        ImageArn: js.UndefOr[Arn] = js.undefined,
        ImageName: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateImageBuilderRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccessEndpoints.foreach(__v => __obj.updateDynamic("AccessEndpoints")(__v.asInstanceOf[js.Any]))
      AppstreamAgentVersion.foreach(__v => __obj.updateDynamic("AppstreamAgentVersion")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DomainJoinInfo.foreach(__v => __obj.updateDynamic("DomainJoinInfo")(__v.asInstanceOf[js.Any]))
      EnableDefaultInternetAccess.foreach(__v => __obj.updateDynamic("EnableDefaultInternetAccess")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageBuilderRequest]
    }
  }

  @js.native
  trait CreateImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object CreateImageBuilderResult {
    @inline
    def apply(
        ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
    ): CreateImageBuilderResult = {
      val __obj = js.Dynamic.literal()
      ImageBuilder.foreach(__v => __obj.updateDynamic("ImageBuilder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageBuilderResult]
    }
  }

  @js.native
  trait CreateImageBuilderStreamingURLRequest extends js.Object {
    var Name: String
    var Validity: js.UndefOr[Double]
  }

  object CreateImageBuilderStreamingURLRequest {
    @inline
    def apply(
        Name: String,
        Validity: js.UndefOr[Double] = js.undefined
    ): CreateImageBuilderStreamingURLRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Validity.foreach(__v => __obj.updateDynamic("Validity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageBuilderStreamingURLRequest]
    }
  }

  @js.native
  trait CreateImageBuilderStreamingURLResult extends js.Object {
    var Expires: js.UndefOr[Timestamp]
    var StreamingURL: js.UndefOr[String]
  }

  object CreateImageBuilderStreamingURLResult {
    @inline
    def apply(
        Expires: js.UndefOr[Timestamp] = js.undefined,
        StreamingURL: js.UndefOr[String] = js.undefined
    ): CreateImageBuilderStreamingURLResult = {
      val __obj = js.Dynamic.literal()
      Expires.foreach(__v => __obj.updateDynamic("Expires")(__v.asInstanceOf[js.Any]))
      StreamingURL.foreach(__v => __obj.updateDynamic("StreamingURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageBuilderStreamingURLResult]
    }
  }

  @js.native
  trait CreateStackRequest extends js.Object {
    var Name: Name
    var AccessEndpoints: js.UndefOr[AccessEndpointList]
    var ApplicationSettings: js.UndefOr[ApplicationSettings]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var EmbedHostDomains: js.UndefOr[EmbedHostDomains]
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var Tags: js.UndefOr[Tags]
    var UserSettings: js.UndefOr[UserSettingList]
  }

  object CreateStackRequest {
    @inline
    def apply(
        Name: Name,
        AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined,
        ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        EmbedHostDomains: js.UndefOr[EmbedHostDomains] = js.undefined,
        FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
        RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
        StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UserSettings: js.UndefOr[UserSettingList] = js.undefined
    ): CreateStackRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccessEndpoints.foreach(__v => __obj.updateDynamic("AccessEndpoints")(__v.asInstanceOf[js.Any]))
      ApplicationSettings.foreach(__v => __obj.updateDynamic("ApplicationSettings")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EmbedHostDomains.foreach(__v => __obj.updateDynamic("EmbedHostDomains")(__v.asInstanceOf[js.Any]))
      FeedbackURL.foreach(__v => __obj.updateDynamic("FeedbackURL")(__v.asInstanceOf[js.Any]))
      RedirectURL.foreach(__v => __obj.updateDynamic("RedirectURL")(__v.asInstanceOf[js.Any]))
      StorageConnectors.foreach(__v => __obj.updateDynamic("StorageConnectors")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackRequest]
    }
  }

  @js.native
  trait CreateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  object CreateStackResult {
    @inline
    def apply(
        Stack: js.UndefOr[Stack] = js.undefined
    ): CreateStackResult = {
      val __obj = js.Dynamic.literal()
      Stack.foreach(__v => __obj.updateDynamic("Stack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackResult]
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
    @inline
    def apply(
        FleetName: String,
        StackName: String,
        UserId: StreamingUrlUserId,
        ApplicationId: js.UndefOr[String] = js.undefined,
        SessionContext: js.UndefOr[String] = js.undefined,
        Validity: js.UndefOr[Double] = js.undefined
    ): CreateStreamingURLRequest = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      SessionContext.foreach(__v => __obj.updateDynamic("SessionContext")(__v.asInstanceOf[js.Any]))
      Validity.foreach(__v => __obj.updateDynamic("Validity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingURLRequest]
    }
  }

  @js.native
  trait CreateStreamingURLResult extends js.Object {
    var Expires: js.UndefOr[Timestamp]
    var StreamingURL: js.UndefOr[String]
  }

  object CreateStreamingURLResult {
    @inline
    def apply(
        Expires: js.UndefOr[Timestamp] = js.undefined,
        StreamingURL: js.UndefOr[String] = js.undefined
    ): CreateStreamingURLResult = {
      val __obj = js.Dynamic.literal()
      Expires.foreach(__v => __obj.updateDynamic("Expires")(__v.asInstanceOf[js.Any]))
      StreamingURL.foreach(__v => __obj.updateDynamic("StreamingURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingURLResult]
    }
  }

  @js.native
  trait CreateUpdatedImageRequest extends js.Object {
    var existingImageName: Name
    var newImageName: Name
    var dryRun: js.UndefOr[Boolean]
    var newImageDescription: js.UndefOr[Description]
    var newImageDisplayName: js.UndefOr[DisplayName]
    var newImageTags: js.UndefOr[Tags]
  }

  object CreateUpdatedImageRequest {
    @inline
    def apply(
        existingImageName: Name,
        newImageName: Name,
        dryRun: js.UndefOr[Boolean] = js.undefined,
        newImageDescription: js.UndefOr[Description] = js.undefined,
        newImageDisplayName: js.UndefOr[DisplayName] = js.undefined,
        newImageTags: js.UndefOr[Tags] = js.undefined
    ): CreateUpdatedImageRequest = {
      val __obj = js.Dynamic.literal(
        "existingImageName" -> existingImageName.asInstanceOf[js.Any],
        "newImageName" -> newImageName.asInstanceOf[js.Any]
      )

      dryRun.foreach(__v => __obj.updateDynamic("dryRun")(__v.asInstanceOf[js.Any]))
      newImageDescription.foreach(__v => __obj.updateDynamic("newImageDescription")(__v.asInstanceOf[js.Any]))
      newImageDisplayName.foreach(__v => __obj.updateDynamic("newImageDisplayName")(__v.asInstanceOf[js.Any]))
      newImageTags.foreach(__v => __obj.updateDynamic("newImageTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUpdatedImageRequest]
    }
  }

  @js.native
  trait CreateUpdatedImageResult extends js.Object {
    var canUpdateImage: js.UndefOr[Boolean]
    var image: js.UndefOr[Image]
  }

  object CreateUpdatedImageResult {
    @inline
    def apply(
        canUpdateImage: js.UndefOr[Boolean] = js.undefined,
        image: js.UndefOr[Image] = js.undefined
    ): CreateUpdatedImageResult = {
      val __obj = js.Dynamic.literal()
      canUpdateImage.foreach(__v => __obj.updateDynamic("canUpdateImage")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUpdatedImageResult]
    }
  }

  @js.native
  trait CreateUsageReportSubscriptionRequest extends js.Object

  object CreateUsageReportSubscriptionRequest {
    @inline
    def apply(): CreateUsageReportSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUsageReportSubscriptionRequest]
    }
  }

  @js.native
  trait CreateUsageReportSubscriptionResult extends js.Object {
    var S3BucketName: js.UndefOr[String]
    var Schedule: js.UndefOr[UsageReportSchedule]
  }

  object CreateUsageReportSubscriptionResult {
    @inline
    def apply(
        S3BucketName: js.UndefOr[String] = js.undefined,
        Schedule: js.UndefOr[UsageReportSchedule] = js.undefined
    ): CreateUsageReportSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUsageReportSubscriptionResult]
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
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        UserName: Username,
        FirstName: js.UndefOr[UserAttributeValue] = js.undefined,
        LastName: js.UndefOr[UserAttributeValue] = js.undefined,
        MessageAction: js.UndefOr[MessageAction] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      MessageAction.foreach(__v => __obj.updateDynamic("MessageAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResult extends js.Object

  object CreateUserResult {
    @inline
    def apply(): CreateUserResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUserResult]
    }
  }

  @js.native
  trait DeleteAppBlockRequest extends js.Object {
    var Name: Name
  }

  object DeleteAppBlockRequest {
    @inline
    def apply(
        Name: Name
    ): DeleteAppBlockRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppBlockRequest]
    }
  }

  @js.native
  trait DeleteAppBlockResult extends js.Object

  object DeleteAppBlockResult {
    @inline
    def apply(): DeleteAppBlockResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAppBlockResult]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var Name: Name
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        Name: Name
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResult extends js.Object

  object DeleteApplicationResult {
    @inline
    def apply(): DeleteApplicationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationResult]
    }
  }

  @js.native
  trait DeleteDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
  }

  object DeleteDirectoryConfigRequest {
    @inline
    def apply(
        DirectoryName: DirectoryName
    ): DeleteDirectoryConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryName" -> DirectoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDirectoryConfigRequest]
    }
  }

  @js.native
  trait DeleteDirectoryConfigResult extends js.Object

  object DeleteDirectoryConfigResult {
    @inline
    def apply(): DeleteDirectoryConfigResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDirectoryConfigResult]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var Name: String
  }

  object DeleteFleetRequest {
    @inline
    def apply(
        Name: String
    ): DeleteFleetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResult extends js.Object

  object DeleteFleetResult {
    @inline
    def apply(): DeleteFleetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFleetResult]
    }
  }

  @js.native
  trait DeleteImageBuilderRequest extends js.Object {
    var Name: Name
  }

  object DeleteImageBuilderRequest {
    @inline
    def apply(
        Name: Name
    ): DeleteImageBuilderRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteImageBuilderRequest]
    }
  }

  @js.native
  trait DeleteImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object DeleteImageBuilderResult {
    @inline
    def apply(
        ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
    ): DeleteImageBuilderResult = {
      val __obj = js.Dynamic.literal()
      ImageBuilder.foreach(__v => __obj.updateDynamic("ImageBuilder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteImageBuilderResult]
    }
  }

  @js.native
  trait DeleteImagePermissionsRequest extends js.Object {
    var Name: Name
    var SharedAccountId: AwsAccountId
  }

  object DeleteImagePermissionsRequest {
    @inline
    def apply(
        Name: Name,
        SharedAccountId: AwsAccountId
    ): DeleteImagePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SharedAccountId" -> SharedAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteImagePermissionsRequest]
    }
  }

  @js.native
  trait DeleteImagePermissionsResult extends js.Object

  object DeleteImagePermissionsResult {
    @inline
    def apply(): DeleteImagePermissionsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteImagePermissionsResult]
    }
  }

  @js.native
  trait DeleteImageRequest extends js.Object {
    var Name: Name
  }

  object DeleteImageRequest {
    @inline
    def apply(
        Name: Name
    ): DeleteImageRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteImageRequest]
    }
  }

  @js.native
  trait DeleteImageResult extends js.Object {
    var Image: js.UndefOr[Image]
  }

  object DeleteImageResult {
    @inline
    def apply(
        Image: js.UndefOr[Image] = js.undefined
    ): DeleteImageResult = {
      val __obj = js.Dynamic.literal()
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteImageResult]
    }
  }

  @js.native
  trait DeleteStackRequest extends js.Object {
    var Name: String
  }

  object DeleteStackRequest {
    @inline
    def apply(
        Name: String
    ): DeleteStackRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteStackRequest]
    }
  }

  @js.native
  trait DeleteStackResult extends js.Object

  object DeleteStackResult {
    @inline
    def apply(): DeleteStackResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteStackResult]
    }
  }

  @js.native
  trait DeleteUsageReportSubscriptionRequest extends js.Object

  object DeleteUsageReportSubscriptionRequest {
    @inline
    def apply(): DeleteUsageReportSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUsageReportSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteUsageReportSubscriptionResult extends js.Object

  object DeleteUsageReportSubscriptionResult {
    @inline
    def apply(): DeleteUsageReportSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUsageReportSubscriptionResult]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  object DeleteUserRequest {
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        UserName: Username
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResult extends js.Object

  object DeleteUserResult {
    @inline
    def apply(): DeleteUserResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserResult]
    }
  }

  @js.native
  trait DescribeAppBlocksRequest extends js.Object {
    var Arns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAppBlocksRequest {
    @inline
    def apply(
        Arns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAppBlocksRequest = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppBlocksRequest]
    }
  }

  @js.native
  trait DescribeAppBlocksResult extends js.Object {
    var AppBlocks: js.UndefOr[AppBlocks]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAppBlocksResult {
    @inline
    def apply(
        AppBlocks: js.UndefOr[AppBlocks] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAppBlocksResult = {
      val __obj = js.Dynamic.literal()
      AppBlocks.foreach(__v => __obj.updateDynamic("AppBlocks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppBlocksResult]
    }
  }

  @js.native
  trait DescribeApplicationFleetAssociationsRequest extends js.Object {
    var ApplicationArn: js.UndefOr[Arn]
    var FleetName: js.UndefOr[Name]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeApplicationFleetAssociationsRequest {
    @inline
    def apply(
        ApplicationArn: js.UndefOr[Arn] = js.undefined,
        FleetName: js.UndefOr[Name] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeApplicationFleetAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      ApplicationArn.foreach(__v => __obj.updateDynamic("ApplicationArn")(__v.asInstanceOf[js.Any]))
      FleetName.foreach(__v => __obj.updateDynamic("FleetName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationFleetAssociationsRequest]
    }
  }

  @js.native
  trait DescribeApplicationFleetAssociationsResult extends js.Object {
    var ApplicationFleetAssociations: js.UndefOr[ApplicationFleetAssociationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeApplicationFleetAssociationsResult {
    @inline
    def apply(
        ApplicationFleetAssociations: js.UndefOr[ApplicationFleetAssociationList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeApplicationFleetAssociationsResult = {
      val __obj = js.Dynamic.literal()
      ApplicationFleetAssociations.foreach(__v => __obj.updateDynamic("ApplicationFleetAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationFleetAssociationsResult]
    }
  }

  @js.native
  trait DescribeApplicationsRequest extends js.Object {
    var Arns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeApplicationsRequest {
    @inline
    def apply(
        Arns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationsRequest]
    }
  }

  @js.native
  trait DescribeApplicationsResult extends js.Object {
    var Applications: js.UndefOr[Applications]
    var NextToken: js.UndefOr[String]
  }

  object DescribeApplicationsResult {
    @inline
    def apply(
        Applications: js.UndefOr[Applications] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeApplicationsResult = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationsResult]
    }
  }

  @js.native
  trait DescribeDirectoryConfigsRequest extends js.Object {
    var DirectoryNames: js.UndefOr[DirectoryNameList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDirectoryConfigsRequest {
    @inline
    def apply(
        DirectoryNames: js.UndefOr[DirectoryNameList] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeDirectoryConfigsRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryNames.foreach(__v => __obj.updateDynamic("DirectoryNames")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectoryConfigsRequest]
    }
  }

  @js.native
  trait DescribeDirectoryConfigsResult extends js.Object {
    var DirectoryConfigs: js.UndefOr[DirectoryConfigList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDirectoryConfigsResult {
    @inline
    def apply(
        DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeDirectoryConfigsResult = {
      val __obj = js.Dynamic.literal()
      DirectoryConfigs.foreach(__v => __obj.updateDynamic("DirectoryConfigs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectoryConfigsResult]
    }
  }

  @js.native
  trait DescribeFleetsRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsRequest {
    @inline
    def apply(
        Names: js.UndefOr[StringList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeFleetsRequest = {
      val __obj = js.Dynamic.literal()
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetsRequest]
    }
  }

  @js.native
  trait DescribeFleetsResult extends js.Object {
    var Fleets: js.UndefOr[FleetList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsResult {
    @inline
    def apply(
        Fleets: js.UndefOr[FleetList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeFleetsResult = {
      val __obj = js.Dynamic.literal()
      Fleets.foreach(__v => __obj.updateDynamic("Fleets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetsResult]
    }
  }

  @js.native
  trait DescribeImageBuildersRequest extends js.Object {
    var MaxResults: js.UndefOr[Int]
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImageBuildersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[Int] = js.undefined,
        Names: js.UndefOr[StringList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImageBuildersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageBuildersRequest]
    }
  }

  @js.native
  trait DescribeImageBuildersResult extends js.Object {
    var ImageBuilders: js.UndefOr[ImageBuilderList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImageBuildersResult {
    @inline
    def apply(
        ImageBuilders: js.UndefOr[ImageBuilderList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImageBuildersResult = {
      val __obj = js.Dynamic.literal()
      ImageBuilders.foreach(__v => __obj.updateDynamic("ImageBuilders")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageBuildersResult]
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
    @inline
    def apply(
        Name: Name,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.undefined
    ): DescribeImagePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SharedAwsAccountIds.foreach(__v => __obj.updateDynamic("SharedAwsAccountIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagePermissionsRequest]
    }
  }

  @js.native
  trait DescribeImagePermissionsResult extends js.Object {
    var Name: js.UndefOr[Name]
    var NextToken: js.UndefOr[String]
    var SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList]
  }

  object DescribeImagePermissionsResult {
    @inline
    def apply(
        Name: js.UndefOr[Name] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList] = js.undefined
    ): DescribeImagePermissionsResult = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SharedImagePermissionsList.foreach(__v => __obj.updateDynamic("SharedImagePermissionsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagePermissionsResult]
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
    @inline
    def apply(
        Arns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.undefined,
        Names: js.UndefOr[StringList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[VisibilityType] = js.undefined
    ): DescribeImagesRequest = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagesRequest]
    }
  }

  @js.native
  trait DescribeImagesResult extends js.Object {
    var Images: js.UndefOr[ImageList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImagesResult {
    @inline
    def apply(
        Images: js.UndefOr[ImageList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImagesResult = {
      val __obj = js.Dynamic.literal()
      Images.foreach(__v => __obj.updateDynamic("Images")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagesResult]
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
    @inline
    def apply(
        FleetName: String,
        StackName: String,
        AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        Limit: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserId: js.UndefOr[UserId] = js.undefined
    ): DescribeSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSessionsRequest]
    }
  }

  @js.native
  trait DescribeSessionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Sessions: js.UndefOr[SessionList]
  }

  object DescribeSessionsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Sessions: js.UndefOr[SessionList] = js.undefined
    ): DescribeSessionsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sessions.foreach(__v => __obj.updateDynamic("Sessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSessionsResult]
    }
  }

  @js.native
  trait DescribeStacksRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeStacksRequest {
    @inline
    def apply(
        Names: js.UndefOr[StringList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeStacksRequest = {
      val __obj = js.Dynamic.literal()
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStacksRequest]
    }
  }

  @js.native
  trait DescribeStacksResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Stacks: js.UndefOr[StackList]
  }

  object DescribeStacksResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Stacks: js.UndefOr[StackList] = js.undefined
    ): DescribeStacksResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Stacks.foreach(__v => __obj.updateDynamic("Stacks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStacksResult]
    }
  }

  @js.native
  trait DescribeUsageReportSubscriptionsRequest extends js.Object {
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUsageReportSubscriptionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeUsageReportSubscriptionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsageReportSubscriptionsRequest]
    }
  }

  @js.native
  trait DescribeUsageReportSubscriptionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList]
  }

  object DescribeUsageReportSubscriptionsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList] = js.undefined
    ): DescribeUsageReportSubscriptionsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UsageReportSubscriptions.foreach(__v => __obj.updateDynamic("UsageReportSubscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsageReportSubscriptionsResult]
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
    @inline
    def apply(
        AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        StackName: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[Username] = js.undefined
    ): DescribeUserStackAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserStackAssociationsRequest]
    }
  }

  @js.native
  trait DescribeUserStackAssociationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var UserStackAssociations: js.UndefOr[UserStackAssociationList]
  }

  object DescribeUserStackAssociationsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined
    ): DescribeUserStackAssociationsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserStackAssociations.foreach(__v => __obj.updateDynamic("UserStackAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserStackAssociationsResult]
    }
  }

  @js.native
  trait DescribeUsersRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeUsersRequest {
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsersRequest]
    }
  }

  @js.native
  trait DescribeUsersResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  object DescribeUsersResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Users: js.UndefOr[UserList] = js.undefined
    ): DescribeUsersResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsersResult]
    }
  }

  /** Describes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  @js.native
  trait DirectoryConfig extends js.Object {
    var DirectoryName: DirectoryName
    var CreatedTime: js.UndefOr[Timestamp]
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object DirectoryConfig {
    @inline
    def apply(
        DirectoryName: DirectoryName,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
        ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
    ): DirectoryConfig = {
      val __obj = js.Dynamic.literal(
        "DirectoryName" -> DirectoryName.asInstanceOf[js.Any]
      )

      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitDistinguishedNames.foreach(__v => __obj.updateDynamic("OrganizationalUnitDistinguishedNames")(__v.asInstanceOf[js.Any]))
      ServiceAccountCredentials.foreach(__v => __obj.updateDynamic("ServiceAccountCredentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectoryConfig]
    }
  }

  @js.native
  trait DisableUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  object DisableUserRequest {
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        UserName: Username
    ): DisableUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableUserRequest]
    }
  }

  @js.native
  trait DisableUserResult extends js.Object

  object DisableUserResult {
    @inline
    def apply(): DisableUserResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableUserResult]
    }
  }

  @js.native
  trait DisassociateApplicationFleetRequest extends js.Object {
    var ApplicationArn: Arn
    var FleetName: Name
  }

  object DisassociateApplicationFleetRequest {
    @inline
    def apply(
        ApplicationArn: Arn,
        FleetName: Name
    ): DisassociateApplicationFleetRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationArn" -> ApplicationArn.asInstanceOf[js.Any],
        "FleetName" -> FleetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateApplicationFleetRequest]
    }
  }

  @js.native
  trait DisassociateApplicationFleetResult extends js.Object

  object DisassociateApplicationFleetResult {
    @inline
    def apply(): DisassociateApplicationFleetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateApplicationFleetResult]
    }
  }

  @js.native
  trait DisassociateFleetRequest extends js.Object {
    var FleetName: String
    var StackName: String
  }

  object DisassociateFleetRequest {
    @inline
    def apply(
        FleetName: String,
        StackName: String
    ): DisassociateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateFleetRequest]
    }
  }

  @js.native
  trait DisassociateFleetResult extends js.Object

  object DisassociateFleetResult {
    @inline
    def apply(): DisassociateFleetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFleetResult]
    }
  }

  /** Describes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  @js.native
  trait DomainJoinInfo extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
  }

  object DomainJoinInfo {
    @inline
    def apply(
        DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
        OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined
    ): DomainJoinInfo = {
      val __obj = js.Dynamic.literal()
      DirectoryName.foreach(__v => __obj.updateDynamic("DirectoryName")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitDistinguishedName.foreach(__v => __obj.updateDynamic("OrganizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainJoinInfo]
    }
  }

  @js.native
  trait EnableUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  object EnableUserRequest {
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        UserName: Username
    ): EnableUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableUserRequest]
    }
  }

  @js.native
  trait EnableUserResult extends js.Object

  object EnableUserResult {
    @inline
    def apply(): EnableUserResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableUserResult]
    }
  }

  @js.native
  trait ExpireSessionRequest extends js.Object {
    var SessionId: String
  }

  object ExpireSessionRequest {
    @inline
    def apply(
        SessionId: String
    ): ExpireSessionRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExpireSessionRequest]
    }
  }

  @js.native
  trait ExpireSessionResult extends js.Object

  object ExpireSessionResult {
    @inline
    def apply(): ExpireSessionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpireSessionResult]
    }
  }

  /** Describes a fleet.
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
    var IamRoleArn: js.UndefOr[Arn]
    var IdleDisconnectTimeoutInSeconds: js.UndefOr[Int]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var MaxConcurrentSessions: js.UndefOr[Int]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var Platform: js.UndefOr[PlatformType]
    var StreamView: js.UndefOr[StreamView]
    var UsbDeviceFilterStrings: js.UndefOr[UsbDeviceFilterStrings]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object Fleet {
    @inline
    def apply(
        Arn: Arn,
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
        IamRoleArn: js.UndefOr[Arn] = js.undefined,
        IdleDisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
        ImageArn: js.UndefOr[Arn] = js.undefined,
        ImageName: js.UndefOr[String] = js.undefined,
        MaxConcurrentSessions: js.UndefOr[Int] = js.undefined,
        MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined,
        Platform: js.UndefOr[PlatformType] = js.undefined,
        StreamView: js.UndefOr[StreamView] = js.undefined,
        UsbDeviceFilterStrings: js.UndefOr[UsbDeviceFilterStrings] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): Fleet = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ComputeCapacityStatus" -> ComputeCapacityStatus.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisconnectTimeoutInSeconds.foreach(__v => __obj.updateDynamic("DisconnectTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DomainJoinInfo.foreach(__v => __obj.updateDynamic("DomainJoinInfo")(__v.asInstanceOf[js.Any]))
      EnableDefaultInternetAccess.foreach(__v => __obj.updateDynamic("EnableDefaultInternetAccess")(__v.asInstanceOf[js.Any]))
      FleetErrors.foreach(__v => __obj.updateDynamic("FleetErrors")(__v.asInstanceOf[js.Any]))
      FleetType.foreach(__v => __obj.updateDynamic("FleetType")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      IdleDisconnectTimeoutInSeconds.foreach(__v => __obj.updateDynamic("IdleDisconnectTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      MaxConcurrentSessions.foreach(__v => __obj.updateDynamic("MaxConcurrentSessions")(__v.asInstanceOf[js.Any]))
      MaxUserDurationInSeconds.foreach(__v => __obj.updateDynamic("MaxUserDurationInSeconds")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      StreamView.foreach(__v => __obj.updateDynamic("StreamView")(__v.asInstanceOf[js.Any]))
      UsbDeviceFilterStrings.foreach(__v => __obj.updateDynamic("UsbDeviceFilterStrings")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Fleet]
    }
  }

  /** Describes a fleet error.
    */
  @js.native
  trait FleetError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object FleetError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined
    ): FleetError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FleetError]
    }
  }

  /** Describes an image.
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
    var ImageBuilderName: js.UndefOr[String]
    var ImageBuilderSupported: js.UndefOr[Boolean]
    var ImageErrors: js.UndefOr[ResourceErrors]
    var ImagePermissions: js.UndefOr[ImagePermissions]
    var Platform: js.UndefOr[PlatformType]
    var PublicBaseImageReleasedDate: js.UndefOr[Timestamp]
    var State: js.UndefOr[ImageState]
    var StateChangeReason: js.UndefOr[ImageStateChangeReason]
    var Visibility: js.UndefOr[VisibilityType]
  }

  object Image {
    @inline
    def apply(
        Name: String,
        Applications: js.UndefOr[Applications] = js.undefined,
        AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        BaseImageArn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        ImageBuilderName: js.UndefOr[String] = js.undefined,
        ImageBuilderSupported: js.UndefOr[Boolean] = js.undefined,
        ImageErrors: js.UndefOr[ResourceErrors] = js.undefined,
        ImagePermissions: js.UndefOr[ImagePermissions] = js.undefined,
        Platform: js.UndefOr[PlatformType] = js.undefined,
        PublicBaseImageReleasedDate: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[ImageState] = js.undefined,
        StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.undefined,
        Visibility: js.UndefOr[VisibilityType] = js.undefined
    ): Image = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      AppstreamAgentVersion.foreach(__v => __obj.updateDynamic("AppstreamAgentVersion")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      BaseImageArn.foreach(__v => __obj.updateDynamic("BaseImageArn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ImageBuilderName.foreach(__v => __obj.updateDynamic("ImageBuilderName")(__v.asInstanceOf[js.Any]))
      ImageBuilderSupported.foreach(__v => __obj.updateDynamic("ImageBuilderSupported")(__v.asInstanceOf[js.Any]))
      ImageErrors.foreach(__v => __obj.updateDynamic("ImageErrors")(__v.asInstanceOf[js.Any]))
      ImagePermissions.foreach(__v => __obj.updateDynamic("ImagePermissions")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      PublicBaseImageReleasedDate.foreach(__v => __obj.updateDynamic("PublicBaseImageReleasedDate")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
    }
  }

  /** Describes a virtual machine that is used to create an image.
    */
  @js.native
  trait ImageBuilder extends js.Object {
    var Name: String
    var AccessEndpoints: js.UndefOr[AccessEndpointList]
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo]
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject]
    var IamRoleArn: js.UndefOr[Arn]
    var ImageArn: js.UndefOr[Arn]
    var ImageBuilderErrors: js.UndefOr[ResourceErrors]
    var InstanceType: js.UndefOr[String]
    var NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration]
    var Platform: js.UndefOr[PlatformType]
    var State: js.UndefOr[ImageBuilderState]
    var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object ImageBuilder {
    @inline
    def apply(
        Name: String,
        AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined,
        AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
        EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        IamRoleArn: js.UndefOr[Arn] = js.undefined,
        ImageArn: js.UndefOr[Arn] = js.undefined,
        ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration] = js.undefined,
        Platform: js.UndefOr[PlatformType] = js.undefined,
        State: js.UndefOr[ImageBuilderState] = js.undefined,
        StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): ImageBuilder = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccessEndpoints.foreach(__v => __obj.updateDynamic("AccessEndpoints")(__v.asInstanceOf[js.Any]))
      AppstreamAgentVersion.foreach(__v => __obj.updateDynamic("AppstreamAgentVersion")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DomainJoinInfo.foreach(__v => __obj.updateDynamic("DomainJoinInfo")(__v.asInstanceOf[js.Any]))
      EnableDefaultInternetAccess.foreach(__v => __obj.updateDynamic("EnableDefaultInternetAccess")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageBuilderErrors.foreach(__v => __obj.updateDynamic("ImageBuilderErrors")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      NetworkAccessConfiguration.foreach(__v => __obj.updateDynamic("NetworkAccessConfiguration")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageBuilder]
    }
  }

  /** Describes the reason why the last image builder state change occurred.
    */
  @js.native
  trait ImageBuilderStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageBuilderStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ImageBuilderStateChangeReason {
    @inline
    def apply(
        Code: js.UndefOr[ImageBuilderStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): ImageBuilderStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageBuilderStateChangeReason]
    }
  }

  /** Describes the permissions for an image.
    */
  @js.native
  trait ImagePermissions extends js.Object {
    var allowFleet: js.UndefOr[BooleanObject]
    var allowImageBuilder: js.UndefOr[BooleanObject]
  }

  object ImagePermissions {
    @inline
    def apply(
        allowFleet: js.UndefOr[BooleanObject] = js.undefined,
        allowImageBuilder: js.UndefOr[BooleanObject] = js.undefined
    ): ImagePermissions = {
      val __obj = js.Dynamic.literal()
      allowFleet.foreach(__v => __obj.updateDynamic("allowFleet")(__v.asInstanceOf[js.Any]))
      allowImageBuilder.foreach(__v => __obj.updateDynamic("allowImageBuilder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImagePermissions]
    }
  }

  /** Describes the reason why the last image state change occurred.
    */
  @js.native
  trait ImageStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ImageStateChangeReason {
    @inline
    def apply(
        Code: js.UndefOr[ImageStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): ImageStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageStateChangeReason]
    }
  }

  /** Describes the error that is returned when a usage report can't be generated.
    */
  @js.native
  trait LastReportGenerationExecutionError extends js.Object {
    var ErrorCode: js.UndefOr[UsageReportExecutionErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object LastReportGenerationExecutionError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[UsageReportExecutionErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined
    ): LastReportGenerationExecutionError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LastReportGenerationExecutionError]
    }
  }

  @js.native
  trait ListAssociatedFleetsRequest extends js.Object {
    var StackName: String
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedFleetsRequest {
    @inline
    def apply(
        StackName: String,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociatedFleetsRequest = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedFleetsRequest]
    }
  }

  @js.native
  trait ListAssociatedFleetsResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedFleetsResult {
    @inline
    def apply(
        Names: js.UndefOr[StringList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociatedFleetsResult = {
      val __obj = js.Dynamic.literal()
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedFleetsResult]
    }
  }

  @js.native
  trait ListAssociatedStacksRequest extends js.Object {
    var FleetName: String
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedStacksRequest {
    @inline
    def apply(
        FleetName: String,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociatedStacksRequest = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedStacksRequest]
    }
  }

  @js.native
  trait ListAssociatedStacksResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociatedStacksResult {
    @inline
    def apply(
        Names: js.UndefOr[StringList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociatedStacksResult = {
      val __obj = js.Dynamic.literal()
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedStacksResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Describes the network details of the fleet or image builder instance.
    */
  @js.native
  trait NetworkAccessConfiguration extends js.Object {
    var EniId: js.UndefOr[String]
    var EniPrivateIpAddress: js.UndefOr[String]
  }

  object NetworkAccessConfiguration {
    @inline
    def apply(
        EniId: js.UndefOr[String] = js.undefined,
        EniPrivateIpAddress: js.UndefOr[String] = js.undefined
    ): NetworkAccessConfiguration = {
      val __obj = js.Dynamic.literal()
      EniId.foreach(__v => __obj.updateDynamic("EniId")(__v.asInstanceOf[js.Any]))
      EniPrivateIpAddress.foreach(__v => __obj.updateDynamic("EniPrivateIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkAccessConfiguration]
    }
  }

  /** Describes a resource error.
    */
  @js.native
  trait ResourceError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var ErrorTimestamp: js.UndefOr[Timestamp]
  }

  object ResourceError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ErrorTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): ResourceError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorTimestamp.foreach(__v => __obj.updateDynamic("ErrorTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceError]
    }
  }

  /** Describes the S3 location.
    */
  @js.native
  trait S3Location extends js.Object {
    var S3Bucket: S3Bucket
    var S3Key: S3Key
  }

  object S3Location {
    @inline
    def apply(
        S3Bucket: S3Bucket,
        S3Key: S3Key
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any],
        "S3Key" -> S3Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Describes the details of the script.
    */
  @js.native
  trait ScriptDetails extends js.Object {
    var ExecutablePath: String
    var ScriptS3Location: S3Location
    var TimeoutInSeconds: Int
    var ExecutableParameters: js.UndefOr[String]
  }

  object ScriptDetails {
    @inline
    def apply(
        ExecutablePath: String,
        ScriptS3Location: S3Location,
        TimeoutInSeconds: Int,
        ExecutableParameters: js.UndefOr[String] = js.undefined
    ): ScriptDetails = {
      val __obj = js.Dynamic.literal(
        "ExecutablePath" -> ExecutablePath.asInstanceOf[js.Any],
        "ScriptS3Location" -> ScriptS3Location.asInstanceOf[js.Any],
        "TimeoutInSeconds" -> TimeoutInSeconds.asInstanceOf[js.Any]
      )

      ExecutableParameters.foreach(__v => __obj.updateDynamic("ExecutableParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScriptDetails]
    }
  }

  /** Describes the credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  @js.native
  trait ServiceAccountCredentials extends js.Object {
    var AccountName: AccountName
    var AccountPassword: AccountPassword
  }

  object ServiceAccountCredentials {
    @inline
    def apply(
        AccountName: AccountName,
        AccountPassword: AccountPassword
    ): ServiceAccountCredentials = {
      val __obj = js.Dynamic.literal(
        "AccountName" -> AccountName.asInstanceOf[js.Any],
        "AccountPassword" -> AccountPassword.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceAccountCredentials]
    }
  }

  /** Describes a streaming session.
    */
  @js.native
  trait Session extends js.Object {
    var FleetName: String
    var Id: String
    var StackName: String
    var State: SessionState
    var UserId: UserId
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var ConnectionState: js.UndefOr[SessionConnectionState]
    var MaxExpirationTime: js.UndefOr[Timestamp]
    var NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration]
    var StartTime: js.UndefOr[Timestamp]
  }

  object Session {
    @inline
    def apply(
        FleetName: String,
        Id: String,
        StackName: String,
        State: SessionState,
        UserId: UserId,
        AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        ConnectionState: js.UndefOr[SessionConnectionState] = js.undefined,
        MaxExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): Session = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      MaxExpirationTime.foreach(__v => __obj.updateDynamic("MaxExpirationTime")(__v.asInstanceOf[js.Any]))
      NetworkAccessConfiguration.foreach(__v => __obj.updateDynamic("NetworkAccessConfiguration")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Session]
    }
  }

  /** Describes the permissions that are available to the specified AWS account for a shared image.
    */
  @js.native
  trait SharedImagePermissions extends js.Object {
    var imagePermissions: ImagePermissions
    var sharedAccountId: AwsAccountId
  }

  object SharedImagePermissions {
    @inline
    def apply(
        imagePermissions: ImagePermissions,
        sharedAccountId: AwsAccountId
    ): SharedImagePermissions = {
      val __obj = js.Dynamic.literal(
        "imagePermissions" -> imagePermissions.asInstanceOf[js.Any],
        "sharedAccountId" -> sharedAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SharedImagePermissions]
    }
  }

  /** Describes a stack.
    */
  @js.native
  trait Stack extends js.Object {
    var Name: String
    var AccessEndpoints: js.UndefOr[AccessEndpointList]
    var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var DisplayName: js.UndefOr[String]
    var EmbedHostDomains: js.UndefOr[EmbedHostDomains]
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StackErrors: js.UndefOr[StackErrors]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var UserSettings: js.UndefOr[UserSettingList]
  }

  object Stack {
    @inline
    def apply(
        Name: String,
        AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined,
        ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        EmbedHostDomains: js.UndefOr[EmbedHostDomains] = js.undefined,
        FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
        RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
        StackErrors: js.UndefOr[StackErrors] = js.undefined,
        StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
        UserSettings: js.UndefOr[UserSettingList] = js.undefined
    ): Stack = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccessEndpoints.foreach(__v => __obj.updateDynamic("AccessEndpoints")(__v.asInstanceOf[js.Any]))
      ApplicationSettings.foreach(__v => __obj.updateDynamic("ApplicationSettings")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EmbedHostDomains.foreach(__v => __obj.updateDynamic("EmbedHostDomains")(__v.asInstanceOf[js.Any]))
      FeedbackURL.foreach(__v => __obj.updateDynamic("FeedbackURL")(__v.asInstanceOf[js.Any]))
      RedirectURL.foreach(__v => __obj.updateDynamic("RedirectURL")(__v.asInstanceOf[js.Any]))
      StackErrors.foreach(__v => __obj.updateDynamic("StackErrors")(__v.asInstanceOf[js.Any]))
      StorageConnectors.foreach(__v => __obj.updateDynamic("StorageConnectors")(__v.asInstanceOf[js.Any]))
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stack]
    }
  }

  /** Describes a stack error.
    */
  @js.native
  trait StackError extends js.Object {
    var ErrorCode: js.UndefOr[StackErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object StackError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[StackErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined
    ): StackError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackError]
    }
  }

  @js.native
  trait StartFleetRequest extends js.Object {
    var Name: String
  }

  object StartFleetRequest {
    @inline
    def apply(
        Name: String
    ): StartFleetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartFleetRequest]
    }
  }

  @js.native
  trait StartFleetResult extends js.Object

  object StartFleetResult {
    @inline
    def apply(): StartFleetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartFleetResult]
    }
  }

  @js.native
  trait StartImageBuilderRequest extends js.Object {
    var Name: String
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
  }

  object StartImageBuilderRequest {
    @inline
    def apply(
        Name: String,
        AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
    ): StartImageBuilderRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AppstreamAgentVersion.foreach(__v => __obj.updateDynamic("AppstreamAgentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImageBuilderRequest]
    }
  }

  @js.native
  trait StartImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object StartImageBuilderResult {
    @inline
    def apply(
        ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
    ): StartImageBuilderResult = {
      val __obj = js.Dynamic.literal()
      ImageBuilder.foreach(__v => __obj.updateDynamic("ImageBuilder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImageBuilderResult]
    }
  }

  @js.native
  trait StopFleetRequest extends js.Object {
    var Name: String
  }

  object StopFleetRequest {
    @inline
    def apply(
        Name: String
    ): StopFleetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopFleetRequest]
    }
  }

  @js.native
  trait StopFleetResult extends js.Object

  object StopFleetResult {
    @inline
    def apply(): StopFleetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopFleetResult]
    }
  }

  @js.native
  trait StopImageBuilderRequest extends js.Object {
    var Name: String
  }

  object StopImageBuilderRequest {
    @inline
    def apply(
        Name: String
    ): StopImageBuilderRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopImageBuilderRequest]
    }
  }

  @js.native
  trait StopImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  object StopImageBuilderResult {
    @inline
    def apply(
        ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
    ): StopImageBuilderResult = {
      val __obj = js.Dynamic.literal()
      ImageBuilder.foreach(__v => __obj.updateDynamic("ImageBuilder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopImageBuilderResult]
    }
  }

  /** Describes a connector that enables persistent storage for users.
    */
  @js.native
  trait StorageConnector extends js.Object {
    var ConnectorType: StorageConnectorType
    var Domains: js.UndefOr[DomainList]
    var ResourceIdentifier: js.UndefOr[ResourceIdentifier]
  }

  object StorageConnector {
    @inline
    def apply(
        ConnectorType: StorageConnectorType,
        Domains: js.UndefOr[DomainList] = js.undefined,
        ResourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
    ): StorageConnector = {
      val __obj = js.Dynamic.literal(
        "ConnectorType" -> ConnectorType.asInstanceOf[js.Any]
      )

      Domains.foreach(__v => __obj.updateDynamic("Domains")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageConnector]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var Name: Name
    var AppBlockArn: js.UndefOr[Arn]
    var AttributesToDelete: js.UndefOr[ApplicationAttributes]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var IconS3Location: js.UndefOr[S3Location]
    var LaunchParameters: js.UndefOr[String]
    var LaunchPath: js.UndefOr[String]
    var WorkingDirectory: js.UndefOr[String]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        Name: Name,
        AppBlockArn: js.UndefOr[Arn] = js.undefined,
        AttributesToDelete: js.UndefOr[ApplicationAttributes] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        IconS3Location: js.UndefOr[S3Location] = js.undefined,
        LaunchParameters: js.UndefOr[String] = js.undefined,
        LaunchPath: js.UndefOr[String] = js.undefined,
        WorkingDirectory: js.UndefOr[String] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AppBlockArn.foreach(__v => __obj.updateDynamic("AppBlockArn")(__v.asInstanceOf[js.Any]))
      AttributesToDelete.foreach(__v => __obj.updateDynamic("AttributesToDelete")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      IconS3Location.foreach(__v => __obj.updateDynamic("IconS3Location")(__v.asInstanceOf[js.Any]))
      LaunchParameters.foreach(__v => __obj.updateDynamic("LaunchParameters")(__v.asInstanceOf[js.Any]))
      LaunchPath.foreach(__v => __obj.updateDynamic("LaunchPath")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResult extends js.Object {
    var Application: js.UndefOr[Application]
  }

  object UpdateApplicationResult {
    @inline
    def apply(
        Application: js.UndefOr[Application] = js.undefined
    ): UpdateApplicationResult = {
      val __obj = js.Dynamic.literal()
      Application.foreach(__v => __obj.updateDynamic("Application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationResult]
    }
  }

  @js.native
  trait UpdateDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  object UpdateDirectoryConfigRequest {
    @inline
    def apply(
        DirectoryName: DirectoryName,
        OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined,
        ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
    ): UpdateDirectoryConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryName" -> DirectoryName.asInstanceOf[js.Any]
      )

      OrganizationalUnitDistinguishedNames.foreach(__v => __obj.updateDynamic("OrganizationalUnitDistinguishedNames")(__v.asInstanceOf[js.Any]))
      ServiceAccountCredentials.foreach(__v => __obj.updateDynamic("ServiceAccountCredentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDirectoryConfigRequest]
    }
  }

  @js.native
  trait UpdateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  object UpdateDirectoryConfigResult {
    @inline
    def apply(
        DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined
    ): UpdateDirectoryConfigResult = {
      val __obj = js.Dynamic.literal()
      DirectoryConfig.foreach(__v => __obj.updateDynamic("DirectoryConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDirectoryConfigResult]
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
    var IamRoleArn: js.UndefOr[Arn]
    var IdleDisconnectTimeoutInSeconds: js.UndefOr[Int]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var MaxConcurrentSessions: js.UndefOr[Int]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Platform: js.UndefOr[PlatformType]
    var StreamView: js.UndefOr[StreamView]
    var UsbDeviceFilterStrings: js.UndefOr[UsbDeviceFilterStrings]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object UpdateFleetRequest {
    @inline
    def apply(
        AttributesToDelete: js.UndefOr[FleetAttributes] = js.undefined,
        ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined,
        DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined,
        EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        IamRoleArn: js.UndefOr[Arn] = js.undefined,
        IdleDisconnectTimeoutInSeconds: js.UndefOr[Int] = js.undefined,
        ImageArn: js.UndefOr[Arn] = js.undefined,
        ImageName: js.UndefOr[String] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        MaxConcurrentSessions: js.UndefOr[Int] = js.undefined,
        MaxUserDurationInSeconds: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Platform: js.UndefOr[PlatformType] = js.undefined,
        StreamView: js.UndefOr[StreamView] = js.undefined,
        UsbDeviceFilterStrings: js.UndefOr[UsbDeviceFilterStrings] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): UpdateFleetRequest = {
      val __obj = js.Dynamic.literal()
      AttributesToDelete.foreach(__v => __obj.updateDynamic("AttributesToDelete")(__v.asInstanceOf[js.Any]))
      ComputeCapacity.foreach(__v => __obj.updateDynamic("ComputeCapacity")(__v.asInstanceOf[js.Any]))
      DeleteVpcConfig.foreach(__v => __obj.updateDynamic("DeleteVpcConfig")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisconnectTimeoutInSeconds.foreach(__v => __obj.updateDynamic("DisconnectTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DomainJoinInfo.foreach(__v => __obj.updateDynamic("DomainJoinInfo")(__v.asInstanceOf[js.Any]))
      EnableDefaultInternetAccess.foreach(__v => __obj.updateDynamic("EnableDefaultInternetAccess")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      IdleDisconnectTimeoutInSeconds.foreach(__v => __obj.updateDynamic("IdleDisconnectTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      MaxConcurrentSessions.foreach(__v => __obj.updateDynamic("MaxConcurrentSessions")(__v.asInstanceOf[js.Any]))
      MaxUserDurationInSeconds.foreach(__v => __obj.updateDynamic("MaxUserDurationInSeconds")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      StreamView.foreach(__v => __obj.updateDynamic("StreamView")(__v.asInstanceOf[js.Any]))
      UsbDeviceFilterStrings.foreach(__v => __obj.updateDynamic("UsbDeviceFilterStrings")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetRequest]
    }
  }

  @js.native
  trait UpdateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  object UpdateFleetResult {
    @inline
    def apply(
        Fleet: js.UndefOr[Fleet] = js.undefined
    ): UpdateFleetResult = {
      val __obj = js.Dynamic.literal()
      Fleet.foreach(__v => __obj.updateDynamic("Fleet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetResult]
    }
  }

  @js.native
  trait UpdateImagePermissionsRequest extends js.Object {
    var ImagePermissions: ImagePermissions
    var Name: Name
    var SharedAccountId: AwsAccountId
  }

  object UpdateImagePermissionsRequest {
    @inline
    def apply(
        ImagePermissions: ImagePermissions,
        Name: Name,
        SharedAccountId: AwsAccountId
    ): UpdateImagePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "ImagePermissions" -> ImagePermissions.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SharedAccountId" -> SharedAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateImagePermissionsRequest]
    }
  }

  @js.native
  trait UpdateImagePermissionsResult extends js.Object

  object UpdateImagePermissionsResult {
    @inline
    def apply(): UpdateImagePermissionsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateImagePermissionsResult]
    }
  }

  @js.native
  trait UpdateStackRequest extends js.Object {
    var Name: String
    var AccessEndpoints: js.UndefOr[AccessEndpointList]
    var ApplicationSettings: js.UndefOr[ApplicationSettings]
    var AttributesToDelete: js.UndefOr[StackAttributes]
    var DeleteStorageConnectors: js.UndefOr[Boolean]
    var Description: js.UndefOr[Description]
    var DisplayName: js.UndefOr[DisplayName]
    var EmbedHostDomains: js.UndefOr[EmbedHostDomains]
    var FeedbackURL: js.UndefOr[FeedbackURL]
    var RedirectURL: js.UndefOr[RedirectURL]
    var StorageConnectors: js.UndefOr[StorageConnectorList]
    var UserSettings: js.UndefOr[UserSettingList]
  }

  object UpdateStackRequest {
    @inline
    def apply(
        Name: String,
        AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined,
        ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined,
        AttributesToDelete: js.UndefOr[StackAttributes] = js.undefined,
        DeleteStorageConnectors: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        EmbedHostDomains: js.UndefOr[EmbedHostDomains] = js.undefined,
        FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined,
        RedirectURL: js.UndefOr[RedirectURL] = js.undefined,
        StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined,
        UserSettings: js.UndefOr[UserSettingList] = js.undefined
    ): UpdateStackRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccessEndpoints.foreach(__v => __obj.updateDynamic("AccessEndpoints")(__v.asInstanceOf[js.Any]))
      ApplicationSettings.foreach(__v => __obj.updateDynamic("ApplicationSettings")(__v.asInstanceOf[js.Any]))
      AttributesToDelete.foreach(__v => __obj.updateDynamic("AttributesToDelete")(__v.asInstanceOf[js.Any]))
      DeleteStorageConnectors.foreach(__v => __obj.updateDynamic("DeleteStorageConnectors")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EmbedHostDomains.foreach(__v => __obj.updateDynamic("EmbedHostDomains")(__v.asInstanceOf[js.Any]))
      FeedbackURL.foreach(__v => __obj.updateDynamic("FeedbackURL")(__v.asInstanceOf[js.Any]))
      RedirectURL.foreach(__v => __obj.updateDynamic("RedirectURL")(__v.asInstanceOf[js.Any]))
      StorageConnectors.foreach(__v => __obj.updateDynamic("StorageConnectors")(__v.asInstanceOf[js.Any]))
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackRequest]
    }
  }

  @js.native
  trait UpdateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  object UpdateStackResult {
    @inline
    def apply(
        Stack: js.UndefOr[Stack] = js.undefined
    ): UpdateStackResult = {
      val __obj = js.Dynamic.literal()
      Stack.foreach(__v => __obj.updateDynamic("Stack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackResult]
    }
  }

  /** Describes information about the usage report subscription.
    */
  @js.native
  trait UsageReportSubscription extends js.Object {
    var LastGeneratedReportDate: js.UndefOr[Timestamp]
    var S3BucketName: js.UndefOr[String]
    var Schedule: js.UndefOr[UsageReportSchedule]
    var SubscriptionErrors: js.UndefOr[LastReportGenerationExecutionErrors]
  }

  object UsageReportSubscription {
    @inline
    def apply(
        LastGeneratedReportDate: js.UndefOr[Timestamp] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        Schedule: js.UndefOr[UsageReportSchedule] = js.undefined,
        SubscriptionErrors: js.UndefOr[LastReportGenerationExecutionErrors] = js.undefined
    ): UsageReportSubscription = {
      val __obj = js.Dynamic.literal()
      LastGeneratedReportDate.foreach(__v => __obj.updateDynamic("LastGeneratedReportDate")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SubscriptionErrors.foreach(__v => __obj.updateDynamic("SubscriptionErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageReportSubscription]
    }
  }

  /** Describes a user in the user pool.
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
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        FirstName: js.UndefOr[UserAttributeValue] = js.undefined,
        LastName: js.UndefOr[UserAttributeValue] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[Username] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** Describes an action and whether the action is enabled or disabled for users during their streaming sessions.
    */
  @js.native
  trait UserSetting extends js.Object {
    var Action: Action
    var Permission: Permission
  }

  object UserSetting {
    @inline
    def apply(
        Action: Action,
        Permission: Permission
    ): UserSetting = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Permission" -> Permission.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserSetting]
    }
  }

  /** Describes a user in the user pool and the associated stack.
    */
  @js.native
  trait UserStackAssociation extends js.Object {
    var AuthenticationType: AuthenticationType
    var StackName: String
    var UserName: Username
    var SendEmailNotification: js.UndefOr[Boolean]
  }

  object UserStackAssociation {
    @inline
    def apply(
        AuthenticationType: AuthenticationType,
        StackName: String,
        UserName: Username,
        SendEmailNotification: js.UndefOr[Boolean] = js.undefined
    ): UserStackAssociation = {
      val __obj = js.Dynamic.literal(
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      SendEmailNotification.foreach(__v => __obj.updateDynamic("SendEmailNotification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserStackAssociation]
    }
  }

  /** Describes the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  @js.native
  trait UserStackAssociationError extends js.Object {
    var ErrorCode: js.UndefOr[UserStackAssociationErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var UserStackAssociation: js.UndefOr[UserStackAssociation]
  }

  object UserStackAssociationError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        UserStackAssociation: js.UndefOr[UserStackAssociation] = js.undefined
    ): UserStackAssociationError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      UserStackAssociation.foreach(__v => __obj.updateDynamic("UserStackAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserStackAssociationError]
    }
  }

  /** Describes VPC configuration information for fleets and image builders.
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var SubnetIds: js.UndefOr[SubnetIdList]
  }

  object VpcConfig {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdList] = js.undefined
    ): VpcConfig = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfig]
    }
  }
}
