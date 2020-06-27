package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object appstream {
  type AccessEndpointList                       = js.Array[AccessEndpoint]
  type AccountName                              = String
  type AccountPassword                          = String
  type Applications                             = js.Array[Application]
  type AppstreamAgentVersion                    = String
  type Arn                                      = String
  type ArnList                                  = js.Array[Arn]
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
  type EmbedHostDomain                          = String
  type EmbedHostDomains                         = js.Array[EmbedHostDomain]
  type FeedbackURL                              = String
  type FleetAttributes                          = js.Array[FleetAttribute]
  type FleetErrors                              = js.Array[FleetError]
  type FleetList                                = js.Array[Fleet]
  type ImageBuilderList                         = js.Array[ImageBuilder]
  type ImageList                                = js.Array[Image]
  type LastReportGenerationExecutionErrors      = js.Array[LastReportGenerationExecutionError]
  type MaxResults                               = Int
  type Metadata                                 = js.Dictionary[String]
  type Name                                     = String
  type OrganizationalUnitDistinguishedName      = String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  type RedirectURL                              = String
  type RegionName                               = String
  type ResourceErrors                           = js.Array[ResourceError]
  type ResourceIdentifier                       = String
  type SecurityGroupIdList                      = js.Array[String]
  type SessionList                              = js.Array[Session]
  type SettingsGroup                            = String
  type SharedImagePermissionsList               = js.Array[SharedImagePermissions]
  type StackAttributes                          = js.Array[StackAttribute]
  type StackErrors                              = js.Array[StackError]
  type StackList                                = js.Array[Stack]
  type StorageConnectorList                     = js.Array[StorageConnector]
  type StreamingUrlUserId                       = String
  type StringList                               = js.Array[String]
  type SubnetIdList                             = js.Array[String]
  type TagKey                                   = String
  type TagKeyList                               = js.Array[TagKey]
  type TagValue                                 = String
  type Tags                                     = js.Dictionary[TagValue]
  type Timestamp                                = js.Date
  type UsageReportSubscriptionList              = js.Array[UsageReportSubscription]
  type UserAttributeValue                       = String
  type UserId                                   = String
  type UserList                                 = js.Array[User]
  type UserSettingList                          = js.Array[UserSetting]
  type UserStackAssociationErrorList            = js.Array[UserStackAssociationError]
  type UserStackAssociationList                 = js.Array[UserStackAssociation]
  type Username                                 = String

  implicit final class AppStreamOps(private val service: AppStream) extends AnyVal {

    @inline def associateFleetFuture(params: AssociateFleetRequest): Future[AssociateFleetResult] =
      service.associateFleet(params).promise().toFuture
    @inline def batchAssociateUserStackFuture(
        params: BatchAssociateUserStackRequest
    ): Future[BatchAssociateUserStackResult] = service.batchAssociateUserStack(params).promise().toFuture
    @inline def batchDisassociateUserStackFuture(
        params: BatchDisassociateUserStackRequest
    ): Future[BatchDisassociateUserStackResult] = service.batchDisassociateUserStack(params).promise().toFuture
    @inline def copyImageFuture(params: CopyImageRequest): Future[CopyImageResponse] =
      service.copyImage(params).promise().toFuture
    @inline def createDirectoryConfigFuture(params: CreateDirectoryConfigRequest): Future[CreateDirectoryConfigResult] =
      service.createDirectoryConfig(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResult] =
      service.createFleet(params).promise().toFuture
    @inline def createImageBuilderFuture(params: CreateImageBuilderRequest): Future[CreateImageBuilderResult] =
      service.createImageBuilder(params).promise().toFuture
    @inline def createImageBuilderStreamingURLFuture(
        params: CreateImageBuilderStreamingURLRequest
    ): Future[CreateImageBuilderStreamingURLResult] = service.createImageBuilderStreamingURL(params).promise().toFuture
    @inline def createStackFuture(params: CreateStackRequest): Future[CreateStackResult] =
      service.createStack(params).promise().toFuture
    @inline def createStreamingURLFuture(params: CreateStreamingURLRequest): Future[CreateStreamingURLResult] =
      service.createStreamingURL(params).promise().toFuture
    @inline def createUsageReportSubscriptionFuture(
        params: CreateUsageReportSubscriptionRequest
    ): Future[CreateUsageReportSubscriptionResult] = service.createUsageReportSubscription(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResult] =
      service.createUser(params).promise().toFuture
    @inline def deleteDirectoryConfigFuture(params: DeleteDirectoryConfigRequest): Future[DeleteDirectoryConfigResult] =
      service.deleteDirectoryConfig(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResult] =
      service.deleteFleet(params).promise().toFuture
    @inline def deleteImageBuilderFuture(params: DeleteImageBuilderRequest): Future[DeleteImageBuilderResult] =
      service.deleteImageBuilder(params).promise().toFuture
    @inline def deleteImageFuture(params: DeleteImageRequest): Future[DeleteImageResult] =
      service.deleteImage(params).promise().toFuture
    @inline def deleteImagePermissionsFuture(
        params: DeleteImagePermissionsRequest
    ): Future[DeleteImagePermissionsResult] = service.deleteImagePermissions(params).promise().toFuture
    @inline def deleteStackFuture(params: DeleteStackRequest): Future[DeleteStackResult] =
      service.deleteStack(params).promise().toFuture
    @inline def deleteUsageReportSubscriptionFuture(
        params: DeleteUsageReportSubscriptionRequest
    ): Future[DeleteUsageReportSubscriptionResult] = service.deleteUsageReportSubscription(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResult] =
      service.deleteUser(params).promise().toFuture
    @inline def describeDirectoryConfigsFuture(
        params: DescribeDirectoryConfigsRequest
    ): Future[DescribeDirectoryConfigsResult] = service.describeDirectoryConfigs(params).promise().toFuture
    @inline def describeFleetsFuture(params: DescribeFleetsRequest): Future[DescribeFleetsResult] =
      service.describeFleets(params).promise().toFuture
    @inline def describeImageBuildersFuture(params: DescribeImageBuildersRequest): Future[DescribeImageBuildersResult] =
      service.describeImageBuilders(params).promise().toFuture
    @inline def describeImagePermissionsFuture(
        params: DescribeImagePermissionsRequest
    ): Future[DescribeImagePermissionsResult] = service.describeImagePermissions(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResult] =
      service.describeImages(params).promise().toFuture
    @inline def describeSessionsFuture(params: DescribeSessionsRequest): Future[DescribeSessionsResult] =
      service.describeSessions(params).promise().toFuture
    @inline def describeStacksFuture(params: DescribeStacksRequest): Future[DescribeStacksResult] =
      service.describeStacks(params).promise().toFuture
    @inline def describeUsageReportSubscriptionsFuture(
        params: DescribeUsageReportSubscriptionsRequest
    ): Future[DescribeUsageReportSubscriptionsResult] =
      service.describeUsageReportSubscriptions(params).promise().toFuture
    @inline def describeUserStackAssociationsFuture(
        params: DescribeUserStackAssociationsRequest
    ): Future[DescribeUserStackAssociationsResult] = service.describeUserStackAssociations(params).promise().toFuture
    @inline def describeUsersFuture(params: DescribeUsersRequest): Future[DescribeUsersResult] =
      service.describeUsers(params).promise().toFuture
    @inline def disableUserFuture(params: DisableUserRequest): Future[DisableUserResult] =
      service.disableUser(params).promise().toFuture
    @inline def disassociateFleetFuture(params: DisassociateFleetRequest): Future[DisassociateFleetResult] =
      service.disassociateFleet(params).promise().toFuture
    @inline def enableUserFuture(params: EnableUserRequest): Future[EnableUserResult] =
      service.enableUser(params).promise().toFuture
    @inline def expireSessionFuture(params: ExpireSessionRequest): Future[ExpireSessionResult] =
      service.expireSession(params).promise().toFuture
    @inline def listAssociatedFleetsFuture(params: ListAssociatedFleetsRequest): Future[ListAssociatedFleetsResult] =
      service.listAssociatedFleets(params).promise().toFuture
    @inline def listAssociatedStacksFuture(params: ListAssociatedStacksRequest): Future[ListAssociatedStacksResult] =
      service.listAssociatedStacks(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def startFleetFuture(params: StartFleetRequest): Future[StartFleetResult] =
      service.startFleet(params).promise().toFuture
    @inline def startImageBuilderFuture(params: StartImageBuilderRequest): Future[StartImageBuilderResult] =
      service.startImageBuilder(params).promise().toFuture
    @inline def stopFleetFuture(params: StopFleetRequest): Future[StopFleetResult] =
      service.stopFleet(params).promise().toFuture
    @inline def stopImageBuilderFuture(params: StopImageBuilderRequest): Future[StopImageBuilderResult] =
      service.stopImageBuilder(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDirectoryConfigFuture(params: UpdateDirectoryConfigRequest): Future[UpdateDirectoryConfigResult] =
      service.updateDirectoryConfig(params).promise().toFuture
    @inline def updateFleetFuture(params: UpdateFleetRequest): Future[UpdateFleetResult] =
      service.updateFleet(params).promise().toFuture
    @inline def updateImagePermissionsFuture(
        params: UpdateImagePermissionsRequest
    ): Future[UpdateImagePermissionsResult] = service.updateImagePermissions(params).promise().toFuture
    @inline def updateStackFuture(params: UpdateStackRequest): Future[UpdateStackResult] =
      service.updateStack(params).promise().toFuture
  }
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
    ): Request[CreateImageBuilderStreamingURLResult]                                             = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult]                      = js.native
    def createStreamingURL(params: CreateStreamingURLRequest): Request[CreateStreamingURLResult] = js.native
    def createUsageReportSubscription(
        params: CreateUsageReportSubscriptionRequest
    ): Request[CreateUsageReportSubscriptionResult]                                                          = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResult]                                     = js.native
    def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): Request[DeleteDirectoryConfigResult]    = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResult]                                  = js.native
    def deleteImage(params: DeleteImageRequest): Request[DeleteImageResult]                                  = js.native
    def deleteImageBuilder(params: DeleteImageBuilderRequest): Request[DeleteImageBuilderResult]             = js.native
    def deleteImagePermissions(params: DeleteImagePermissionsRequest): Request[DeleteImagePermissionsResult] = js.native
    def deleteStack(params: DeleteStackRequest): Request[DeleteStackResult]                                  = js.native
    def deleteUsageReportSubscription(
        params: DeleteUsageReportSubscriptionRequest
    ): Request[DeleteUsageReportSubscriptionResult]                      = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResult] = js.native
    def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): Request[DescribeDirectoryConfigsResult] =
      js.native
    def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult]                      = js.native
    def describeImageBuilders(params: DescribeImageBuildersRequest): Request[DescribeImageBuildersResult] = js.native
    def describeImagePermissions(params: DescribeImagePermissionsRequest): Request[DescribeImagePermissionsResult] =
      js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult]       = js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResult] = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult]       = js.native
    def describeUsageReportSubscriptions(
        params: DescribeUsageReportSubscriptionsRequest
    ): Request[DescribeUsageReportSubscriptionsResult] = js.native
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

  /**
    * Describes an interface VPC endpoint (interface endpoint) that lets you create a private connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When you specify an interface endpoint for a stack, users of the stack can connect to AppStream 2.0 only through that endpoint. When you specify an interface endpoint for an image builder, administrators can connect to the image builder only through that endpoint.
    */
  @js.native
  @Factory
  trait AccessEndpoint extends js.Object {
    var EndpointType: AccessEndpointType
    var VpceId: js.UndefOr[String]
  }

  @js.native
  sealed trait AccessEndpointType extends js.Any
  object AccessEndpointType extends js.Object {
    val STREAMING = "STREAMING".asInstanceOf[AccessEndpointType]

    val values = js.Object.freeze(js.Array(STREAMING))
  }

  @js.native
  sealed trait Action extends js.Any
  object Action extends js.Object {
    val CLIPBOARD_COPY_FROM_LOCAL_DEVICE = "CLIPBOARD_COPY_FROM_LOCAL_DEVICE".asInstanceOf[Action]
    val CLIPBOARD_COPY_TO_LOCAL_DEVICE   = "CLIPBOARD_COPY_TO_LOCAL_DEVICE".asInstanceOf[Action]
    val FILE_UPLOAD                      = "FILE_UPLOAD".asInstanceOf[Action]
    val FILE_DOWNLOAD                    = "FILE_DOWNLOAD".asInstanceOf[Action]
    val PRINTING_TO_LOCAL_DEVICE         = "PRINTING_TO_LOCAL_DEVICE".asInstanceOf[Action]

    val values = js.Object.freeze(
      js.Array(
        CLIPBOARD_COPY_FROM_LOCAL_DEVICE,
        CLIPBOARD_COPY_TO_LOCAL_DEVICE,
        FILE_UPLOAD,
        FILE_DOWNLOAD,
        PRINTING_TO_LOCAL_DEVICE
      )
    )
  }

  /**
    * Describes an application in the application catalog.
    */
  @js.native
  @Factory
  trait Application extends js.Object {
    var DisplayName: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var IconURL: js.UndefOr[String]
    var LaunchParameters: js.UndefOr[String]
    var LaunchPath: js.UndefOr[String]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[String]
  }

  /**
    * The persistent application settings for users of a stack.
    */
  @js.native
  @Factory
  trait ApplicationSettings extends js.Object {
    var Enabled: Boolean
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  /**
    * Describes the persistent application settings for users of a stack.
    */
  @js.native
  @Factory
  trait ApplicationSettingsResponse extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SettingsGroup: js.UndefOr[SettingsGroup]
  }

  @js.native
  @Factory
  trait AssociateFleetRequest extends js.Object {
    var FleetName: String
    var StackName: String
  }

  @js.native
  @Factory
  trait AssociateFleetResult extends js.Object {}

  @js.native
  sealed trait AuthenticationType extends js.Any
  object AuthenticationType extends js.Object {
    val API      = "API".asInstanceOf[AuthenticationType]
    val SAML     = "SAML".asInstanceOf[AuthenticationType]
    val USERPOOL = "USERPOOL".asInstanceOf[AuthenticationType]

    val values = js.Object.freeze(js.Array(API, SAML, USERPOOL))
  }

  @js.native
  @Factory
  trait BatchAssociateUserStackRequest extends js.Object {
    var UserStackAssociations: UserStackAssociationList
  }

  @js.native
  @Factory
  trait BatchAssociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  @js.native
  @Factory
  trait BatchDisassociateUserStackRequest extends js.Object {
    var UserStackAssociations: UserStackAssociationList
  }

  @js.native
  @Factory
  trait BatchDisassociateUserStackResult extends js.Object {
    var errors: js.UndefOr[UserStackAssociationErrorList]
  }

  /**
    * Describes the capacity for a fleet.
    */
  @js.native
  @Factory
  trait ComputeCapacity extends js.Object {
    var DesiredInstances: Int
  }

  /**
    * Describes the capacity status for a fleet.
    */
  @js.native
  @Factory
  trait ComputeCapacityStatus extends js.Object {
    var Desired: Int
    var Available: js.UndefOr[Int]
    var InUse: js.UndefOr[Int]
    var Running: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CopyImageRequest extends js.Object {
    var DestinationImageName: Name
    var DestinationRegion: RegionName
    var SourceImageName: Name
    var DestinationImageDescription: js.UndefOr[Description]
  }

  @js.native
  @Factory
  trait CopyImageResponse extends js.Object {
    var DestinationImageName: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait CreateDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
    var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
    var ServiceAccountCredentials: ServiceAccountCredentials
  }

  @js.native
  @Factory
  trait CreateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  @js.native
  @Factory
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
    var IamRoleArn: js.UndefOr[Arn]
    var IdleDisconnectTimeoutInSeconds: js.UndefOr[Int]
    var ImageArn: js.UndefOr[Arn]
    var ImageName: js.UndefOr[String]
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var Tags: js.UndefOr[Tags]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait CreateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  @js.native
  @Factory
  trait CreateImageBuilderStreamingURLRequest extends js.Object {
    var Name: String
    var Validity: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait CreateImageBuilderStreamingURLResult extends js.Object {
    var Expires: js.UndefOr[Timestamp]
    var StreamingURL: js.UndefOr[String]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  @js.native
  @Factory
  trait CreateStreamingURLRequest extends js.Object {
    var FleetName: String
    var StackName: String
    var UserId: StreamingUrlUserId
    var ApplicationId: js.UndefOr[String]
    var SessionContext: js.UndefOr[String]
    var Validity: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait CreateStreamingURLResult extends js.Object {
    var Expires: js.UndefOr[Timestamp]
    var StreamingURL: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateUsageReportSubscriptionRequest extends js.Object {}

  @js.native
  @Factory
  trait CreateUsageReportSubscriptionResult extends js.Object {
    var S3BucketName: js.UndefOr[String]
    var Schedule: js.UndefOr[UsageReportSchedule]
  }

  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
    var FirstName: js.UndefOr[UserAttributeValue]
    var LastName: js.UndefOr[UserAttributeValue]
    var MessageAction: js.UndefOr[MessageAction]
  }

  @js.native
  @Factory
  trait CreateUserResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
  }

  @js.native
  @Factory
  trait DeleteDirectoryConfigResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteFleetRequest extends js.Object {
    var Name: String
  }

  @js.native
  @Factory
  trait DeleteFleetResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteImageBuilderRequest extends js.Object {
    var Name: Name
  }

  @js.native
  @Factory
  trait DeleteImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  @js.native
  @Factory
  trait DeleteImagePermissionsRequest extends js.Object {
    var Name: Name
    var SharedAccountId: AwsAccountId
  }

  @js.native
  @Factory
  trait DeleteImagePermissionsResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteImageRequest extends js.Object {
    var Name: Name
  }

  @js.native
  @Factory
  trait DeleteImageResult extends js.Object {
    var Image: js.UndefOr[Image]
  }

  @js.native
  @Factory
  trait DeleteStackRequest extends js.Object {
    var Name: String
  }

  @js.native
  @Factory
  trait DeleteStackResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteUsageReportSubscriptionRequest extends js.Object {}

  @js.native
  @Factory
  trait DeleteUsageReportSubscriptionResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  @js.native
  @Factory
  trait DeleteUserResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeDirectoryConfigsRequest extends js.Object {
    var DirectoryNames: js.UndefOr[DirectoryNameList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDirectoryConfigsResult extends js.Object {
    var DirectoryConfigs: js.UndefOr[DirectoryConfigList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFleetsRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFleetsResult extends js.Object {
    var Fleets: js.UndefOr[FleetList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeImageBuildersRequest extends js.Object {
    var MaxResults: js.UndefOr[Int]
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeImageBuildersResult extends js.Object {
    var ImageBuilders: js.UndefOr[ImageBuilderList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeImagePermissionsRequest extends js.Object {
    var Name: Name
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList]
  }

  @js.native
  @Factory
  trait DescribeImagePermissionsResult extends js.Object {
    var Name: js.UndefOr[Name]
    var NextToken: js.UndefOr[String]
    var SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList]
  }

  @js.native
  @Factory
  trait DescribeImagesRequest extends js.Object {
    var Arns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[DescribeImagesMaxResults]
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
    var Type: js.UndefOr[VisibilityType]
  }

  @js.native
  @Factory
  trait DescribeImagesResult extends js.Object {
    var Images: js.UndefOr[ImageList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeSessionsRequest extends js.Object {
    var FleetName: String
    var StackName: String
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var Limit: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var UserId: js.UndefOr[UserId]
  }

  @js.native
  @Factory
  trait DescribeSessionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Sessions: js.UndefOr[SessionList]
  }

  @js.native
  @Factory
  trait DescribeStacksRequest extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeStacksResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Stacks: js.UndefOr[StackList]
  }

  @js.native
  @Factory
  trait DescribeUsageReportSubscriptionsRequest extends js.Object {
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeUsageReportSubscriptionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList]
  }

  @js.native
  @Factory
  trait DescribeUserStackAssociationsRequest extends js.Object {
    var AuthenticationType: js.UndefOr[AuthenticationType]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var StackName: js.UndefOr[String]
    var UserName: js.UndefOr[Username]
  }

  @js.native
  @Factory
  trait DescribeUserStackAssociationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var UserStackAssociations: js.UndefOr[UserStackAssociationList]
  }

  @js.native
  @Factory
  trait DescribeUsersRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeUsersResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  /**
    * Describes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  @js.native
  @Factory
  trait DirectoryConfig extends js.Object {
    var DirectoryName: DirectoryName
    var CreatedTime: js.UndefOr[Timestamp]
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  @js.native
  @Factory
  trait DisableUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  @js.native
  @Factory
  trait DisableUserResult extends js.Object {}

  @js.native
  @Factory
  trait DisassociateFleetRequest extends js.Object {
    var FleetName: String
    var StackName: String
  }

  @js.native
  @Factory
  trait DisassociateFleetResult extends js.Object {}

  /**
    * Describes the configuration information required to join fleets and image builders to Microsoft Active Directory domains.
    */
  @js.native
  @Factory
  trait DomainJoinInfo extends js.Object {
    var DirectoryName: js.UndefOr[DirectoryName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
  }

  @js.native
  @Factory
  trait EnableUserRequest extends js.Object {
    var AuthenticationType: AuthenticationType
    var UserName: Username
  }

  @js.native
  @Factory
  trait EnableUserResult extends js.Object {}

  @js.native
  @Factory
  trait ExpireSessionRequest extends js.Object {
    var SessionId: String
  }

  @js.native
  @Factory
  trait ExpireSessionResult extends js.Object {}

  /**
    * Describes a fleet.
    */
  @js.native
  @Factory
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
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * The fleet attribute.
    */
  @js.native
  sealed trait FleetAttribute extends js.Any
  object FleetAttribute extends js.Object {
    val VPC_CONFIGURATION                    = "VPC_CONFIGURATION".asInstanceOf[FleetAttribute]
    val VPC_CONFIGURATION_SECURITY_GROUP_IDS = "VPC_CONFIGURATION_SECURITY_GROUP_IDS".asInstanceOf[FleetAttribute]
    val DOMAIN_JOIN_INFO                     = "DOMAIN_JOIN_INFO".asInstanceOf[FleetAttribute]
    val IAM_ROLE_ARN                         = "IAM_ROLE_ARN".asInstanceOf[FleetAttribute]

    val values = js.Object.freeze(
      js.Array(VPC_CONFIGURATION, VPC_CONFIGURATION_SECURITY_GROUP_IDS, DOMAIN_JOIN_INFO, IAM_ROLE_ARN)
    )
  }

  /**
    * Describes a fleet error.
    */
  @js.native
  @Factory
  trait FleetError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait FleetErrorCode extends js.Any
  object FleetErrorCode extends js.Object {
    val IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION =
      "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION".asInstanceOf[FleetErrorCode]
    val IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION =
      "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION".asInstanceOf[FleetErrorCode]
    val IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION =
      "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION".asInstanceOf[FleetErrorCode]
    val NETWORK_INTERFACE_LIMIT_EXCEEDED     = "NETWORK_INTERFACE_LIMIT_EXCEEDED".asInstanceOf[FleetErrorCode]
    val INTERNAL_SERVICE_ERROR               = "INTERNAL_SERVICE_ERROR".asInstanceOf[FleetErrorCode]
    val IAM_SERVICE_ROLE_IS_MISSING          = "IAM_SERVICE_ROLE_IS_MISSING".asInstanceOf[FleetErrorCode]
    val MACHINE_ROLE_IS_MISSING              = "MACHINE_ROLE_IS_MISSING".asInstanceOf[FleetErrorCode]
    val STS_DISABLED_IN_REGION               = "STS_DISABLED_IN_REGION".asInstanceOf[FleetErrorCode]
    val SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES = "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES".asInstanceOf[FleetErrorCode]
    val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION =
      "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION".asInstanceOf[FleetErrorCode]
    val SUBNET_NOT_FOUND             = "SUBNET_NOT_FOUND".asInstanceOf[FleetErrorCode]
    val IMAGE_NOT_FOUND              = "IMAGE_NOT_FOUND".asInstanceOf[FleetErrorCode]
    val INVALID_SUBNET_CONFIGURATION = "INVALID_SUBNET_CONFIGURATION".asInstanceOf[FleetErrorCode]
    val SECURITY_GROUPS_NOT_FOUND    = "SECURITY_GROUPS_NOT_FOUND".asInstanceOf[FleetErrorCode]
    val IGW_NOT_ATTACHED             = "IGW_NOT_ATTACHED".asInstanceOf[FleetErrorCode]
    val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION =
      "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_FILE_NOT_FOUND        = "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_ACCESS_DENIED         = "DOMAIN_JOIN_ERROR_ACCESS_DENIED".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_LOGON_FAILURE         = "DOMAIN_JOIN_ERROR_LOGON_FAILURE".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_INVALID_PARAMETER     = "DOMAIN_JOIN_ERROR_INVALID_PARAMETER".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_MORE_DATA             = "DOMAIN_JOIN_ERROR_MORE_DATA".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN        = "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_NOT_SUPPORTED         = "DOMAIN_JOIN_ERROR_NOT_SUPPORTED".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME = "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED =
      "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED =
      "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_NERR_PASSWORD_EXPIRED  = "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED".asInstanceOf[FleetErrorCode]
    val DOMAIN_JOIN_INTERNAL_SERVICE_ERROR = "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR".asInstanceOf[FleetErrorCode]

    val values = js.Object.freeze(
      js.Array(
        IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION,
        IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION,
        IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION,
        NETWORK_INTERFACE_LIMIT_EXCEEDED,
        INTERNAL_SERVICE_ERROR,
        IAM_SERVICE_ROLE_IS_MISSING,
        MACHINE_ROLE_IS_MISSING,
        STS_DISABLED_IN_REGION,
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
    )
  }

  @js.native
  sealed trait FleetState extends js.Any
  object FleetState extends js.Object {
    val STARTING = "STARTING".asInstanceOf[FleetState]
    val RUNNING  = "RUNNING".asInstanceOf[FleetState]
    val STOPPING = "STOPPING".asInstanceOf[FleetState]
    val STOPPED  = "STOPPED".asInstanceOf[FleetState]

    val values = js.Object.freeze(js.Array(STARTING, RUNNING, STOPPING, STOPPED))
  }

  @js.native
  sealed trait FleetType extends js.Any
  object FleetType extends js.Object {
    val ALWAYS_ON = "ALWAYS_ON".asInstanceOf[FleetType]
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[FleetType]

    val values = js.Object.freeze(js.Array(ALWAYS_ON, ON_DEMAND))
  }

  /**
    * Describes an image.
    */
  @js.native
  @Factory
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
    var ImagePermissions: js.UndefOr[ImagePermissions]
    var Platform: js.UndefOr[PlatformType]
    var PublicBaseImageReleasedDate: js.UndefOr[Timestamp]
    var State: js.UndefOr[ImageState]
    var StateChangeReason: js.UndefOr[ImageStateChangeReason]
    var Visibility: js.UndefOr[VisibilityType]
  }

  /**
    * Describes a virtual machine that is used to create an image.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ImageBuilderState extends js.Any
  object ImageBuilderState extends js.Object {
    val PENDING        = "PENDING".asInstanceOf[ImageBuilderState]
    val UPDATING_AGENT = "UPDATING_AGENT".asInstanceOf[ImageBuilderState]
    val RUNNING        = "RUNNING".asInstanceOf[ImageBuilderState]
    val STOPPING       = "STOPPING".asInstanceOf[ImageBuilderState]
    val STOPPED        = "STOPPED".asInstanceOf[ImageBuilderState]
    val REBOOTING      = "REBOOTING".asInstanceOf[ImageBuilderState]
    val SNAPSHOTTING   = "SNAPSHOTTING".asInstanceOf[ImageBuilderState]
    val DELETING       = "DELETING".asInstanceOf[ImageBuilderState]
    val FAILED         = "FAILED".asInstanceOf[ImageBuilderState]

    val values = js.Object.freeze(
      js.Array(PENDING, UPDATING_AGENT, RUNNING, STOPPING, STOPPED, REBOOTING, SNAPSHOTTING, DELETING, FAILED)
    )
  }

  /**
    * Describes the reason why the last image builder state change occurred.
    */
  @js.native
  @Factory
  trait ImageBuilderStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageBuilderStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ImageBuilderStateChangeReasonCode extends js.Any
  object ImageBuilderStateChangeReasonCode extends js.Object {
    val INTERNAL_ERROR    = "INTERNAL_ERROR".asInstanceOf[ImageBuilderStateChangeReasonCode]
    val IMAGE_UNAVAILABLE = "IMAGE_UNAVAILABLE".asInstanceOf[ImageBuilderStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(INTERNAL_ERROR, IMAGE_UNAVAILABLE))
  }

  /**
    * Describes the permissions for an image.
    */
  @js.native
  @Factory
  trait ImagePermissions extends js.Object {
    var allowFleet: js.UndefOr[BooleanObject]
    var allowImageBuilder: js.UndefOr[BooleanObject]
  }

  @js.native
  sealed trait ImageState extends js.Any
  object ImageState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[ImageState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[ImageState]
    val FAILED    = "FAILED".asInstanceOf[ImageState]
    val COPYING   = "COPYING".asInstanceOf[ImageState]
    val DELETING  = "DELETING".asInstanceOf[ImageState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, FAILED, COPYING, DELETING))
  }

  /**
    * Describes the reason why the last image state change occurred.
    */
  @js.native
  @Factory
  trait ImageStateChangeReason extends js.Object {
    var Code: js.UndefOr[ImageStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ImageStateChangeReasonCode extends js.Any
  object ImageStateChangeReasonCode extends js.Object {
    val INTERNAL_ERROR              = "INTERNAL_ERROR".asInstanceOf[ImageStateChangeReasonCode]
    val IMAGE_BUILDER_NOT_AVAILABLE = "IMAGE_BUILDER_NOT_AVAILABLE".asInstanceOf[ImageStateChangeReasonCode]
    val IMAGE_COPY_FAILURE          = "IMAGE_COPY_FAILURE".asInstanceOf[ImageStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(INTERNAL_ERROR, IMAGE_BUILDER_NOT_AVAILABLE, IMAGE_COPY_FAILURE))
  }

  /**
    * Describes the error that is returned when a usage report can't be generated.
    */
  @js.native
  @Factory
  trait LastReportGenerationExecutionError extends js.Object {
    var ErrorCode: js.UndefOr[UsageReportExecutionErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAssociatedFleetsRequest extends js.Object {
    var StackName: String
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAssociatedFleetsResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAssociatedStacksRequest extends js.Object {
    var FleetName: String
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAssociatedStacksResult extends js.Object {
    var Names: js.UndefOr[StringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  sealed trait MessageAction extends js.Any
  object MessageAction extends js.Object {
    val SUPPRESS = "SUPPRESS".asInstanceOf[MessageAction]
    val RESEND   = "RESEND".asInstanceOf[MessageAction]

    val values = js.Object.freeze(js.Array(SUPPRESS, RESEND))
  }

  /**
    * Describes the network details of the fleet or image builder instance.
    */
  @js.native
  @Factory
  trait NetworkAccessConfiguration extends js.Object {
    var EniId: js.UndefOr[String]
    var EniPrivateIpAddress: js.UndefOr[String]
  }

  @js.native
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[Permission]
    val DISABLED = "DISABLED".asInstanceOf[Permission]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait PlatformType extends js.Any
  object PlatformType extends js.Object {
    val WINDOWS             = "WINDOWS".asInstanceOf[PlatformType]
    val WINDOWS_SERVER_2016 = "WINDOWS_SERVER_2016".asInstanceOf[PlatformType]
    val WINDOWS_SERVER_2019 = "WINDOWS_SERVER_2019".asInstanceOf[PlatformType]

    val values = js.Object.freeze(js.Array(WINDOWS, WINDOWS_SERVER_2016, WINDOWS_SERVER_2019))
  }

  /**
    * Describes a resource error.
    */
  @js.native
  @Factory
  trait ResourceError extends js.Object {
    var ErrorCode: js.UndefOr[FleetErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var ErrorTimestamp: js.UndefOr[Timestamp]
  }

  /**
    * Describes the credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  @js.native
  @Factory
  trait ServiceAccountCredentials extends js.Object {
    var AccountName: AccountName
    var AccountPassword: AccountPassword
  }

  /**
    * Describes a streaming session.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait SessionConnectionState extends js.Any
  object SessionConnectionState extends js.Object {
    val CONNECTED     = "CONNECTED".asInstanceOf[SessionConnectionState]
    val NOT_CONNECTED = "NOT_CONNECTED".asInstanceOf[SessionConnectionState]

    val values = js.Object.freeze(js.Array(CONNECTED, NOT_CONNECTED))
  }

  /**
    * Possible values for the state of a streaming session.
    */
  @js.native
  sealed trait SessionState extends js.Any
  object SessionState extends js.Object {
    val ACTIVE  = "ACTIVE".asInstanceOf[SessionState]
    val PENDING = "PENDING".asInstanceOf[SessionState]
    val EXPIRED = "EXPIRED".asInstanceOf[SessionState]

    val values = js.Object.freeze(js.Array(ACTIVE, PENDING, EXPIRED))
  }

  /**
    * Describes the permissions that are available to the specified AWS account for a shared image.
    */
  @js.native
  @Factory
  trait SharedImagePermissions extends js.Object {
    var imagePermissions: ImagePermissions
    var sharedAccountId: AwsAccountId
  }

  /**
    * Describes a stack.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait StackAttribute extends js.Any
  object StackAttribute extends js.Object {
    val STORAGE_CONNECTORS             = "STORAGE_CONNECTORS".asInstanceOf[StackAttribute]
    val STORAGE_CONNECTOR_HOMEFOLDERS  = "STORAGE_CONNECTOR_HOMEFOLDERS".asInstanceOf[StackAttribute]
    val STORAGE_CONNECTOR_GOOGLE_DRIVE = "STORAGE_CONNECTOR_GOOGLE_DRIVE".asInstanceOf[StackAttribute]
    val STORAGE_CONNECTOR_ONE_DRIVE    = "STORAGE_CONNECTOR_ONE_DRIVE".asInstanceOf[StackAttribute]
    val REDIRECT_URL                   = "REDIRECT_URL".asInstanceOf[StackAttribute]
    val FEEDBACK_URL                   = "FEEDBACK_URL".asInstanceOf[StackAttribute]
    val THEME_NAME                     = "THEME_NAME".asInstanceOf[StackAttribute]
    val USER_SETTINGS                  = "USER_SETTINGS".asInstanceOf[StackAttribute]
    val EMBED_HOST_DOMAINS             = "EMBED_HOST_DOMAINS".asInstanceOf[StackAttribute]
    val IAM_ROLE_ARN                   = "IAM_ROLE_ARN".asInstanceOf[StackAttribute]
    val ACCESS_ENDPOINTS               = "ACCESS_ENDPOINTS".asInstanceOf[StackAttribute]

    val values = js.Object.freeze(
      js.Array(
        STORAGE_CONNECTORS,
        STORAGE_CONNECTOR_HOMEFOLDERS,
        STORAGE_CONNECTOR_GOOGLE_DRIVE,
        STORAGE_CONNECTOR_ONE_DRIVE,
        REDIRECT_URL,
        FEEDBACK_URL,
        THEME_NAME,
        USER_SETTINGS,
        EMBED_HOST_DOMAINS,
        IAM_ROLE_ARN,
        ACCESS_ENDPOINTS
      )
    )
  }

  /**
    * Describes a stack error.
    */
  @js.native
  @Factory
  trait StackError extends js.Object {
    var ErrorCode: js.UndefOr[StackErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait StackErrorCode extends js.Any
  object StackErrorCode extends js.Object {
    val STORAGE_CONNECTOR_ERROR = "STORAGE_CONNECTOR_ERROR".asInstanceOf[StackErrorCode]
    val INTERNAL_SERVICE_ERROR  = "INTERNAL_SERVICE_ERROR".asInstanceOf[StackErrorCode]

    val values = js.Object.freeze(js.Array(STORAGE_CONNECTOR_ERROR, INTERNAL_SERVICE_ERROR))
  }

  @js.native
  @Factory
  trait StartFleetRequest extends js.Object {
    var Name: String
  }

  @js.native
  @Factory
  trait StartFleetResult extends js.Object {}

  @js.native
  @Factory
  trait StartImageBuilderRequest extends js.Object {
    var Name: String
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion]
  }

  @js.native
  @Factory
  trait StartImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  @js.native
  @Factory
  trait StopFleetRequest extends js.Object {
    var Name: String
  }

  @js.native
  @Factory
  trait StopFleetResult extends js.Object {}

  @js.native
  @Factory
  trait StopImageBuilderRequest extends js.Object {
    var Name: String
  }

  @js.native
  @Factory
  trait StopImageBuilderResult extends js.Object {
    var ImageBuilder: js.UndefOr[ImageBuilder]
  }

  /**
    * Describes a connector that enables persistent storage for users.
    */
  @js.native
  @Factory
  trait StorageConnector extends js.Object {
    var ConnectorType: StorageConnectorType
    var Domains: js.UndefOr[DomainList]
    var ResourceIdentifier: js.UndefOr[ResourceIdentifier]
  }

  /**
    * The type of storage connector.
    */
  @js.native
  sealed trait StorageConnectorType extends js.Any
  object StorageConnectorType extends js.Object {
    val HOMEFOLDERS  = "HOMEFOLDERS".asInstanceOf[StorageConnectorType]
    val GOOGLE_DRIVE = "GOOGLE_DRIVE".asInstanceOf[StorageConnectorType]
    val ONE_DRIVE    = "ONE_DRIVE".asInstanceOf[StorageConnectorType]

    val values = js.Object.freeze(js.Array(HOMEFOLDERS, GOOGLE_DRIVE, ONE_DRIVE))
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: Tags
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDirectoryConfigRequest extends js.Object {
    var DirectoryName: DirectoryName
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList]
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials]
  }

  @js.native
  @Factory
  trait UpdateDirectoryConfigResult extends js.Object {
    var DirectoryConfig: js.UndefOr[DirectoryConfig]
  }

  @js.native
  @Factory
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
    var MaxUserDurationInSeconds: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait UpdateFleetResult extends js.Object {
    var Fleet: js.UndefOr[Fleet]
  }

  @js.native
  @Factory
  trait UpdateImagePermissionsRequest extends js.Object {
    var ImagePermissions: ImagePermissions
    var Name: Name
    var SharedAccountId: AwsAccountId
  }

  @js.native
  @Factory
  trait UpdateImagePermissionsResult extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateStackResult extends js.Object {
    var Stack: js.UndefOr[Stack]
  }

  @js.native
  sealed trait UsageReportExecutionErrorCode extends js.Any
  object UsageReportExecutionErrorCode extends js.Object {
    val RESOURCE_NOT_FOUND     = "RESOURCE_NOT_FOUND".asInstanceOf[UsageReportExecutionErrorCode]
    val ACCESS_DENIED          = "ACCESS_DENIED".asInstanceOf[UsageReportExecutionErrorCode]
    val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[UsageReportExecutionErrorCode]

    val values = js.Object.freeze(js.Array(RESOURCE_NOT_FOUND, ACCESS_DENIED, INTERNAL_SERVICE_ERROR))
  }

  @js.native
  sealed trait UsageReportSchedule extends js.Any
  object UsageReportSchedule extends js.Object {
    val DAILY = "DAILY".asInstanceOf[UsageReportSchedule]

    val values = js.Object.freeze(js.Array(DAILY))
  }

  /**
    * Describes information about the usage report subscription.
    */
  @js.native
  @Factory
  trait UsageReportSubscription extends js.Object {
    var LastGeneratedReportDate: js.UndefOr[Timestamp]
    var S3BucketName: js.UndefOr[String]
    var Schedule: js.UndefOr[UsageReportSchedule]
    var SubscriptionErrors: js.UndefOr[LastReportGenerationExecutionErrors]
  }

  /**
    * Describes a user in the user pool.
    */
  @js.native
  @Factory
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

  /**
    * Describes an action and whether the action is enabled or disabled for users during their streaming sessions.
    */
  @js.native
  @Factory
  trait UserSetting extends js.Object {
    var Action: Action
    var Permission: Permission
  }

  /**
    * Describes a user in the user pool and the associated stack.
    */
  @js.native
  @Factory
  trait UserStackAssociation extends js.Object {
    var AuthenticationType: AuthenticationType
    var StackName: String
    var UserName: Username
    var SendEmailNotification: js.UndefOr[Boolean]
  }

  /**
    * Describes the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  @js.native
  @Factory
  trait UserStackAssociationError extends js.Object {
    var ErrorCode: js.UndefOr[UserStackAssociationErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var UserStackAssociation: js.UndefOr[UserStackAssociation]
  }

  @js.native
  sealed trait UserStackAssociationErrorCode extends js.Any
  object UserStackAssociationErrorCode extends js.Object {
    val STACK_NOT_FOUND     = "STACK_NOT_FOUND".asInstanceOf[UserStackAssociationErrorCode]
    val USER_NAME_NOT_FOUND = "USER_NAME_NOT_FOUND".asInstanceOf[UserStackAssociationErrorCode]
    val INTERNAL_ERROR      = "INTERNAL_ERROR".asInstanceOf[UserStackAssociationErrorCode]

    val values = js.Object.freeze(js.Array(STACK_NOT_FOUND, USER_NAME_NOT_FOUND, INTERNAL_ERROR))
  }

  @js.native
  sealed trait VisibilityType extends js.Any
  object VisibilityType extends js.Object {
    val PUBLIC  = "PUBLIC".asInstanceOf[VisibilityType]
    val PRIVATE = "PRIVATE".asInstanceOf[VisibilityType]
    val SHARED  = "SHARED".asInstanceOf[VisibilityType]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE, SHARED))
  }

  /**
    * Describes VPC configuration information for fleets and image builders.
    */
  @js.native
  @Factory
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var SubnetIds: js.UndefOr[SubnetIdList]
  }
}
