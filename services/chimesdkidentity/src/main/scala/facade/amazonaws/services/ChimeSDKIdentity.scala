package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chimesdkidentity {
  type AppInstanceAdminList = js.Array[AppInstanceAdminSummary]
  type AppInstanceList = js.Array[AppInstanceSummary]
  type AppInstanceUserEndpointSummaryList = js.Array[AppInstanceUserEndpointSummary]
  type AppInstanceUserList = js.Array[AppInstanceUserSummary]
  type ChimeArn = String
  type ClientRequestToken = String
  type MaxResults = Int
  type Metadata = String
  type NextToken = String
  type NonEmptyResourceName = String
  type NonEmptySensitiveString1600 = String
  type ResourceName = String
  type RetentionDays = Int
  type SensitiveChimeArn = String
  type SensitiveString1600 = String
  type SensitiveString64 = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UserId = String
  type UserName = String

  final class ChimeSDKIdentityOps(private val service: ChimeSDKIdentity) extends AnyVal {

    @inline def createAppInstanceAdminFuture(params: CreateAppInstanceAdminRequest): Future[CreateAppInstanceAdminResponse] = service.createAppInstanceAdmin(params).promise().toFuture
    @inline def createAppInstanceFuture(params: CreateAppInstanceRequest): Future[CreateAppInstanceResponse] = service.createAppInstance(params).promise().toFuture
    @inline def createAppInstanceUserFuture(params: CreateAppInstanceUserRequest): Future[CreateAppInstanceUserResponse] = service.createAppInstanceUser(params).promise().toFuture
    @inline def deleteAppInstanceAdminFuture(params: DeleteAppInstanceAdminRequest): Future[js.Object] = service.deleteAppInstanceAdmin(params).promise().toFuture
    @inline def deleteAppInstanceFuture(params: DeleteAppInstanceRequest): Future[js.Object] = service.deleteAppInstance(params).promise().toFuture
    @inline def deleteAppInstanceUserFuture(params: DeleteAppInstanceUserRequest): Future[js.Object] = service.deleteAppInstanceUser(params).promise().toFuture
    @inline def deregisterAppInstanceUserEndpointFuture(params: DeregisterAppInstanceUserEndpointRequest): Future[js.Object] = service.deregisterAppInstanceUserEndpoint(params).promise().toFuture
    @inline def describeAppInstanceAdminFuture(params: DescribeAppInstanceAdminRequest): Future[DescribeAppInstanceAdminResponse] = service.describeAppInstanceAdmin(params).promise().toFuture
    @inline def describeAppInstanceFuture(params: DescribeAppInstanceRequest): Future[DescribeAppInstanceResponse] = service.describeAppInstance(params).promise().toFuture
    @inline def describeAppInstanceUserEndpointFuture(params: DescribeAppInstanceUserEndpointRequest): Future[DescribeAppInstanceUserEndpointResponse] = service.describeAppInstanceUserEndpoint(params).promise().toFuture
    @inline def describeAppInstanceUserFuture(params: DescribeAppInstanceUserRequest): Future[DescribeAppInstanceUserResponse] = service.describeAppInstanceUser(params).promise().toFuture
    @inline def getAppInstanceRetentionSettingsFuture(params: GetAppInstanceRetentionSettingsRequest): Future[GetAppInstanceRetentionSettingsResponse] = service.getAppInstanceRetentionSettings(params).promise().toFuture
    @inline def listAppInstanceAdminsFuture(params: ListAppInstanceAdminsRequest): Future[ListAppInstanceAdminsResponse] = service.listAppInstanceAdmins(params).promise().toFuture
    @inline def listAppInstanceUserEndpointsFuture(params: ListAppInstanceUserEndpointsRequest): Future[ListAppInstanceUserEndpointsResponse] = service.listAppInstanceUserEndpoints(params).promise().toFuture
    @inline def listAppInstanceUsersFuture(params: ListAppInstanceUsersRequest): Future[ListAppInstanceUsersResponse] = service.listAppInstanceUsers(params).promise().toFuture
    @inline def listAppInstancesFuture(params: ListAppInstancesRequest): Future[ListAppInstancesResponse] = service.listAppInstances(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putAppInstanceRetentionSettingsFuture(params: PutAppInstanceRetentionSettingsRequest): Future[PutAppInstanceRetentionSettingsResponse] = service.putAppInstanceRetentionSettings(params).promise().toFuture
    @inline def registerAppInstanceUserEndpointFuture(params: RegisterAppInstanceUserEndpointRequest): Future[RegisterAppInstanceUserEndpointResponse] = service.registerAppInstanceUserEndpoint(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAppInstanceFuture(params: UpdateAppInstanceRequest): Future[UpdateAppInstanceResponse] = service.updateAppInstance(params).promise().toFuture
    @inline def updateAppInstanceUserEndpointFuture(params: UpdateAppInstanceUserEndpointRequest): Future[UpdateAppInstanceUserEndpointResponse] = service.updateAppInstanceUserEndpoint(params).promise().toFuture
    @inline def updateAppInstanceUserFuture(params: UpdateAppInstanceUserRequest): Future[UpdateAppInstanceUserResponse] = service.updateAppInstanceUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chimesdkidentity", JSImport.Namespace, "AWS.ChimeSDKIdentity")
  class ChimeSDKIdentity() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAppInstance(params: CreateAppInstanceRequest): Request[CreateAppInstanceResponse] = js.native
    def createAppInstanceAdmin(params: CreateAppInstanceAdminRequest): Request[CreateAppInstanceAdminResponse] = js.native
    def createAppInstanceUser(params: CreateAppInstanceUserRequest): Request[CreateAppInstanceUserResponse] = js.native
    def deleteAppInstance(params: DeleteAppInstanceRequest): Request[js.Object] = js.native
    def deleteAppInstanceAdmin(params: DeleteAppInstanceAdminRequest): Request[js.Object] = js.native
    def deleteAppInstanceUser(params: DeleteAppInstanceUserRequest): Request[js.Object] = js.native
    def deregisterAppInstanceUserEndpoint(params: DeregisterAppInstanceUserEndpointRequest): Request[js.Object] = js.native
    def describeAppInstance(params: DescribeAppInstanceRequest): Request[DescribeAppInstanceResponse] = js.native
    def describeAppInstanceAdmin(params: DescribeAppInstanceAdminRequest): Request[DescribeAppInstanceAdminResponse] = js.native
    def describeAppInstanceUser(params: DescribeAppInstanceUserRequest): Request[DescribeAppInstanceUserResponse] = js.native
    def describeAppInstanceUserEndpoint(params: DescribeAppInstanceUserEndpointRequest): Request[DescribeAppInstanceUserEndpointResponse] = js.native
    def getAppInstanceRetentionSettings(params: GetAppInstanceRetentionSettingsRequest): Request[GetAppInstanceRetentionSettingsResponse] = js.native
    def listAppInstanceAdmins(params: ListAppInstanceAdminsRequest): Request[ListAppInstanceAdminsResponse] = js.native
    def listAppInstanceUserEndpoints(params: ListAppInstanceUserEndpointsRequest): Request[ListAppInstanceUserEndpointsResponse] = js.native
    def listAppInstanceUsers(params: ListAppInstanceUsersRequest): Request[ListAppInstanceUsersResponse] = js.native
    def listAppInstances(params: ListAppInstancesRequest): Request[ListAppInstancesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putAppInstanceRetentionSettings(params: PutAppInstanceRetentionSettingsRequest): Request[PutAppInstanceRetentionSettingsResponse] = js.native
    def registerAppInstanceUserEndpoint(params: RegisterAppInstanceUserEndpointRequest): Request[RegisterAppInstanceUserEndpointResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAppInstance(params: UpdateAppInstanceRequest): Request[UpdateAppInstanceResponse] = js.native
    def updateAppInstanceUser(params: UpdateAppInstanceUserRequest): Request[UpdateAppInstanceUserResponse] = js.native
    def updateAppInstanceUserEndpoint(params: UpdateAppInstanceUserEndpointRequest): Request[UpdateAppInstanceUserEndpointResponse] = js.native
  }
  object ChimeSDKIdentity {
    @inline implicit def toOps(service: ChimeSDKIdentity): ChimeSDKIdentityOps = {
      new ChimeSDKIdentityOps(service)
    }
  }

  /** The details of an <code>AppInstance</code>, an instance of an Amazon Chime SDK messaging application.
    */
  @js.native
  trait AppInstance extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[NonEmptyResourceName]
  }

  object AppInstance {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined
    ): AppInstance = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstance]
    }
  }

  /** The details of an <code>AppInstanceAdmin</code>.
    */
  @js.native
  trait AppInstanceAdmin extends js.Object {
    var Admin: js.UndefOr[Identity]
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
  }

  object AppInstanceAdmin {
    @inline
    def apply(
        Admin: js.UndefOr[Identity] = js.undefined,
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): AppInstanceAdmin = {
      val __obj = js.Dynamic.literal()
      Admin.foreach(__v => __obj.updateDynamic("Admin")(__v.asInstanceOf[js.Any]))
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceAdmin]
    }
  }

  /** Summary of the details of an <code>AppInstanceAdmin</code>.
    */
  @js.native
  trait AppInstanceAdminSummary extends js.Object {
    var Admin: js.UndefOr[Identity]
  }

  object AppInstanceAdminSummary {
    @inline
    def apply(
        Admin: js.UndefOr[Identity] = js.undefined
    ): AppInstanceAdminSummary = {
      val __obj = js.Dynamic.literal()
      Admin.foreach(__v => __obj.updateDynamic("Admin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceAdminSummary]
    }
  }

  /** The details of the data-retention settings for an <code>AppInstance</code>.
    */
  @js.native
  trait AppInstanceRetentionSettings extends js.Object {
    var ChannelRetentionSettings: js.UndefOr[ChannelRetentionSettings]
  }

  object AppInstanceRetentionSettings {
    @inline
    def apply(
        ChannelRetentionSettings: js.UndefOr[ChannelRetentionSettings] = js.undefined
    ): AppInstanceRetentionSettings = {
      val __obj = js.Dynamic.literal()
      ChannelRetentionSettings.foreach(__v => __obj.updateDynamic("ChannelRetentionSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceRetentionSettings]
    }
  }

  /** Summary of the data for an <code>AppInstance</code>.
    */
  @js.native
  trait AppInstanceSummary extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[NonEmptyResourceName]
  }

  object AppInstanceSummary {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined
    ): AppInstanceSummary = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceSummary]
    }
  }

  /** The details of an <code>AppInstanceUser</code>.
    */
  @js.native
  trait AppInstanceUser extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[UserName]
  }

  object AppInstanceUser {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[UserName] = js.undefined
    ): AppInstanceUser = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUser]
    }
  }

  /** An endpoint under an Amazon Chime <code>AppInstanceUser</code> that receives messages for a user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a user.
    */
  @js.native
  trait AppInstanceUserEndpoint extends js.Object {
    var AllowMessages: js.UndefOr[AllowMessages]
    var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var EndpointAttributes: js.UndefOr[EndpointAttributes]
    var EndpointId: js.UndefOr[SensitiveString64]
    var EndpointState: js.UndefOr[EndpointState]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[SensitiveString1600]
    var ResourceArn: js.UndefOr[SensitiveChimeArn]
    var Type: js.UndefOr[AppInstanceUserEndpointType]
  }

  object AppInstanceUserEndpoint {
    @inline
    def apply(
        AllowMessages: js.UndefOr[AllowMessages] = js.undefined,
        AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        EndpointAttributes: js.UndefOr[EndpointAttributes] = js.undefined,
        EndpointId: js.UndefOr[SensitiveString64] = js.undefined,
        EndpointState: js.UndefOr[EndpointState] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[SensitiveString1600] = js.undefined,
        ResourceArn: js.UndefOr[SensitiveChimeArn] = js.undefined,
        Type: js.UndefOr[AppInstanceUserEndpointType] = js.undefined
    ): AppInstanceUserEndpoint = {
      val __obj = js.Dynamic.literal()
      AllowMessages.foreach(__v => __obj.updateDynamic("AllowMessages")(__v.asInstanceOf[js.Any]))
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EndpointAttributes.foreach(__v => __obj.updateDynamic("EndpointAttributes")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      EndpointState.foreach(__v => __obj.updateDynamic("EndpointState")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUserEndpoint]
    }
  }

  /** Summary of the details of an <code>AppInstanceUserEndpoint</code>.
    */
  @js.native
  trait AppInstanceUserEndpointSummary extends js.Object {
    var AllowMessages: js.UndefOr[AllowMessages]
    var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn]
    var EndpointId: js.UndefOr[SensitiveString64]
    var EndpointState: js.UndefOr[EndpointState]
    var Name: js.UndefOr[SensitiveString1600]
    var Type: js.UndefOr[AppInstanceUserEndpointType]
  }

  object AppInstanceUserEndpointSummary {
    @inline
    def apply(
        AllowMessages: js.UndefOr[AllowMessages] = js.undefined,
        AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined,
        EndpointId: js.UndefOr[SensitiveString64] = js.undefined,
        EndpointState: js.UndefOr[EndpointState] = js.undefined,
        Name: js.UndefOr[SensitiveString1600] = js.undefined,
        Type: js.UndefOr[AppInstanceUserEndpointType] = js.undefined
    ): AppInstanceUserEndpointSummary = {
      val __obj = js.Dynamic.literal()
      AllowMessages.foreach(__v => __obj.updateDynamic("AllowMessages")(__v.asInstanceOf[js.Any]))
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      EndpointState.foreach(__v => __obj.updateDynamic("EndpointState")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUserEndpointSummary]
    }
  }

  /** Summary of the details of an <code>AppInstanceUser</code>.
    */
  @js.native
  trait AppInstanceUserSummary extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[UserName]
  }

  object AppInstanceUserSummary {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[UserName] = js.undefined
    ): AppInstanceUserSummary = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUserSummary]
    }
  }

  /** The details of the retention settings for a channel.
    */
  @js.native
  trait ChannelRetentionSettings extends js.Object {
    var RetentionDays: js.UndefOr[RetentionDays]
  }

  object ChannelRetentionSettings {
    @inline
    def apply(
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined
    ): ChannelRetentionSettings = {
      val __obj = js.Dynamic.literal()
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelRetentionSettings]
    }
  }

  @js.native
  trait CreateAppInstanceAdminRequest extends js.Object {
    var AppInstanceAdminArn: ChimeArn
    var AppInstanceArn: ChimeArn
  }

  object CreateAppInstanceAdminRequest {
    @inline
    def apply(
        AppInstanceAdminArn: ChimeArn,
        AppInstanceArn: ChimeArn
    ): CreateAppInstanceAdminRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceAdminArn" -> AppInstanceAdminArn.asInstanceOf[js.Any],
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAppInstanceAdminRequest]
    }
  }

  @js.native
  trait CreateAppInstanceAdminResponse extends js.Object {
    var AppInstanceAdmin: js.UndefOr[Identity]
    var AppInstanceArn: js.UndefOr[ChimeArn]
  }

  object CreateAppInstanceAdminResponse {
    @inline
    def apply(
        AppInstanceAdmin: js.UndefOr[Identity] = js.undefined,
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateAppInstanceAdminResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceAdmin.foreach(__v => __obj.updateDynamic("AppInstanceAdmin")(__v.asInstanceOf[js.Any]))
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceAdminResponse]
    }
  }

  @js.native
  trait CreateAppInstanceRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Name: NonEmptyResourceName
    var Metadata: js.UndefOr[Metadata]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAppInstanceRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        Name: NonEmptyResourceName,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceRequest]
    }
  }

  @js.native
  trait CreateAppInstanceResponse extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
  }

  object CreateAppInstanceResponse {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateAppInstanceResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceResponse]
    }
  }

  @js.native
  trait CreateAppInstanceUserRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var AppInstanceUserId: UserId
    var ClientRequestToken: ClientRequestToken
    var Name: UserName
    var Metadata: js.UndefOr[Metadata]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        AppInstanceUserId: UserId,
        ClientRequestToken: ClientRequestToken,
        Name: UserName,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "AppInstanceUserId" -> AppInstanceUserId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceUserRequest]
    }
  }

  @js.native
  trait CreateAppInstanceUserResponse extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
  }

  object CreateAppInstanceUserResponse {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceUserResponse]
    }
  }

  @js.native
  trait DeleteAppInstanceAdminRequest extends js.Object {
    var AppInstanceAdminArn: ChimeArn
    var AppInstanceArn: ChimeArn
  }

  object DeleteAppInstanceAdminRequest {
    @inline
    def apply(
        AppInstanceAdminArn: ChimeArn,
        AppInstanceArn: ChimeArn
    ): DeleteAppInstanceAdminRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceAdminArn" -> AppInstanceAdminArn.asInstanceOf[js.Any],
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceAdminRequest]
    }
  }

  @js.native
  trait DeleteAppInstanceRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object DeleteAppInstanceRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): DeleteAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceRequest]
    }
  }

  @js.native
  trait DeleteAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
  }

  object DeleteAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn
    ): DeleteAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceUserRequest]
    }
  }

  @js.native
  trait DeregisterAppInstanceUserEndpointRequest extends js.Object {
    var AppInstanceUserArn: SensitiveChimeArn
    var EndpointId: SensitiveString64
  }

  object DeregisterAppInstanceUserEndpointRequest {
    @inline
    def apply(
        AppInstanceUserArn: SensitiveChimeArn,
        EndpointId: SensitiveString64
    ): DeregisterAppInstanceUserEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterAppInstanceUserEndpointRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceAdminRequest extends js.Object {
    var AppInstanceAdminArn: ChimeArn
    var AppInstanceArn: ChimeArn
  }

  object DescribeAppInstanceAdminRequest {
    @inline
    def apply(
        AppInstanceAdminArn: ChimeArn,
        AppInstanceArn: ChimeArn
    ): DescribeAppInstanceAdminRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceAdminArn" -> AppInstanceAdminArn.asInstanceOf[js.Any],
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceAdminRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceAdminResponse extends js.Object {
    var AppInstanceAdmin: js.UndefOr[AppInstanceAdmin]
  }

  object DescribeAppInstanceAdminResponse {
    @inline
    def apply(
        AppInstanceAdmin: js.UndefOr[AppInstanceAdmin] = js.undefined
    ): DescribeAppInstanceAdminResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceAdmin.foreach(__v => __obj.updateDynamic("AppInstanceAdmin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceAdminResponse]
    }
  }

  @js.native
  trait DescribeAppInstanceRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object DescribeAppInstanceRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): DescribeAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceResponse extends js.Object {
    var AppInstance: js.UndefOr[AppInstance]
  }

  object DescribeAppInstanceResponse {
    @inline
    def apply(
        AppInstance: js.UndefOr[AppInstance] = js.undefined
    ): DescribeAppInstanceResponse = {
      val __obj = js.Dynamic.literal()
      AppInstance.foreach(__v => __obj.updateDynamic("AppInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceResponse]
    }
  }

  @js.native
  trait DescribeAppInstanceUserEndpointRequest extends js.Object {
    var AppInstanceUserArn: SensitiveString1600
    var EndpointId: SensitiveString64
  }

  object DescribeAppInstanceUserEndpointRequest {
    @inline
    def apply(
        AppInstanceUserArn: SensitiveString1600,
        EndpointId: SensitiveString64
    ): DescribeAppInstanceUserEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceUserEndpointRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceUserEndpointResponse extends js.Object {
    var AppInstanceUserEndpoint: js.UndefOr[AppInstanceUserEndpoint]
  }

  object DescribeAppInstanceUserEndpointResponse {
    @inline
    def apply(
        AppInstanceUserEndpoint: js.UndefOr[AppInstanceUserEndpoint] = js.undefined
    ): DescribeAppInstanceUserEndpointResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserEndpoint.foreach(__v => __obj.updateDynamic("AppInstanceUserEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceUserEndpointResponse]
    }
  }

  @js.native
  trait DescribeAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
  }

  object DescribeAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn
    ): DescribeAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceUserRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceUserResponse extends js.Object {
    var AppInstanceUser: js.UndefOr[AppInstanceUser]
  }

  object DescribeAppInstanceUserResponse {
    @inline
    def apply(
        AppInstanceUser: js.UndefOr[AppInstanceUser] = js.undefined
    ): DescribeAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUser.foreach(__v => __obj.updateDynamic("AppInstanceUser")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceUserResponse]
    }
  }

  /** The attributes of an <code>Endpoint</code>.
    */
  @js.native
  trait EndpointAttributes extends js.Object {
    var DeviceToken: NonEmptySensitiveString1600
    var VoipDeviceToken: js.UndefOr[NonEmptySensitiveString1600]
  }

  object EndpointAttributes {
    @inline
    def apply(
        DeviceToken: NonEmptySensitiveString1600,
        VoipDeviceToken: js.UndefOr[NonEmptySensitiveString1600] = js.undefined
    ): EndpointAttributes = {
      val __obj = js.Dynamic.literal(
        "DeviceToken" -> DeviceToken.asInstanceOf[js.Any]
      )

      VoipDeviceToken.foreach(__v => __obj.updateDynamic("VoipDeviceToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointAttributes]
    }
  }

  /** A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported values: * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty. * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message. When INACTIVE, the corresponding reason will be conveyed through EndpointStatusReason. * <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to invalid device token * <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code> field.
    */
  @js.native
  trait EndpointState extends js.Object {
    var Status: EndpointStatus
    var StatusReason: js.UndefOr[EndpointStatusReason]
  }

  object EndpointState {
    @inline
    def apply(
        Status: EndpointStatus,
        StatusReason: js.UndefOr[EndpointStatusReason] = js.undefined
    ): EndpointState = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointState]
    }
  }

  @js.native
  trait GetAppInstanceRetentionSettingsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object GetAppInstanceRetentionSettingsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): GetAppInstanceRetentionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppInstanceRetentionSettingsRequest]
    }
  }

  @js.native
  trait GetAppInstanceRetentionSettingsResponse extends js.Object {
    var AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings]
    var InitiateDeletionTimestamp: js.UndefOr[Timestamp]
  }

  object GetAppInstanceRetentionSettingsResponse {
    @inline
    def apply(
        AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings] = js.undefined,
        InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): GetAppInstanceRetentionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceRetentionSettings.foreach(__v => __obj.updateDynamic("AppInstanceRetentionSettings")(__v.asInstanceOf[js.Any]))
      InitiateDeletionTimestamp.foreach(__v => __obj.updateDynamic("InitiateDeletionTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppInstanceRetentionSettingsResponse]
    }
  }

  /** The details of a user.
    */
  @js.native
  trait Identity extends js.Object {
    var Arn: js.UndefOr[ChimeArn]
    var Name: js.UndefOr[ResourceName]
  }

  object Identity {
    @inline
    def apply(
        Arn: js.UndefOr[ChimeArn] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): Identity = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Identity]
    }
  }

  @js.native
  trait ListAppInstanceAdminsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceAdminsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceAdminsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceAdminsRequest]
    }
  }

  @js.native
  trait ListAppInstanceAdminsResponse extends js.Object {
    var AppInstanceAdmins: js.UndefOr[AppInstanceAdminList]
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceAdminsResponse {
    @inline
    def apply(
        AppInstanceAdmins: js.UndefOr[AppInstanceAdminList] = js.undefined,
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceAdminsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceAdmins.foreach(__v => __obj.updateDynamic("AppInstanceAdmins")(__v.asInstanceOf[js.Any]))
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceAdminsResponse]
    }
  }

  @js.native
  trait ListAppInstanceUserEndpointsRequest extends js.Object {
    var AppInstanceUserArn: SensitiveChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceUserEndpointsRequest {
    @inline
    def apply(
        AppInstanceUserArn: SensitiveChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceUserEndpointsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceUserEndpointsRequest]
    }
  }

  @js.native
  trait ListAppInstanceUserEndpointsResponse extends js.Object {
    var AppInstanceUserEndpoints: js.UndefOr[AppInstanceUserEndpointSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceUserEndpointsResponse {
    @inline
    def apply(
        AppInstanceUserEndpoints: js.UndefOr[AppInstanceUserEndpointSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceUserEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserEndpoints.foreach(__v => __obj.updateDynamic("AppInstanceUserEndpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceUserEndpointsResponse]
    }
  }

  @js.native
  trait ListAppInstanceUsersRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceUsersRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceUsersRequest]
    }
  }

  @js.native
  trait ListAppInstanceUsersResponse extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var AppInstanceUsers: js.UndefOr[AppInstanceUserList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceUsersResponse {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        AppInstanceUsers: js.UndefOr[AppInstanceUserList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceUsersResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      AppInstanceUsers.foreach(__v => __obj.updateDynamic("AppInstanceUsers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceUsersResponse]
    }
  }

  @js.native
  trait ListAppInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstancesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstancesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstancesRequest]
    }
  }

  @js.native
  trait ListAppInstancesResponse extends js.Object {
    var AppInstances: js.UndefOr[AppInstanceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstancesResponse {
    @inline
    def apply(
        AppInstances: js.UndefOr[AppInstanceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstancesResponse = {
      val __obj = js.Dynamic.literal()
      AppInstances.foreach(__v => __obj.updateDynamic("AppInstances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstancesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ChimeArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: ChimeArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutAppInstanceRetentionSettingsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var AppInstanceRetentionSettings: AppInstanceRetentionSettings
  }

  object PutAppInstanceRetentionSettingsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        AppInstanceRetentionSettings: AppInstanceRetentionSettings
    ): PutAppInstanceRetentionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "AppInstanceRetentionSettings" -> AppInstanceRetentionSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAppInstanceRetentionSettingsRequest]
    }
  }

  @js.native
  trait PutAppInstanceRetentionSettingsResponse extends js.Object {
    var AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings]
    var InitiateDeletionTimestamp: js.UndefOr[Timestamp]
  }

  object PutAppInstanceRetentionSettingsResponse {
    @inline
    def apply(
        AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings] = js.undefined,
        InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): PutAppInstanceRetentionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceRetentionSettings.foreach(__v => __obj.updateDynamic("AppInstanceRetentionSettings")(__v.asInstanceOf[js.Any]))
      InitiateDeletionTimestamp.foreach(__v => __obj.updateDynamic("InitiateDeletionTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppInstanceRetentionSettingsResponse]
    }
  }

  @js.native
  trait RegisterAppInstanceUserEndpointRequest extends js.Object {
    var AppInstanceUserArn: SensitiveChimeArn
    var ClientRequestToken: ClientRequestToken
    var EndpointAttributes: EndpointAttributes
    var ResourceArn: SensitiveChimeArn
    var Type: AppInstanceUserEndpointType
    var AllowMessages: js.UndefOr[AllowMessages]
    var Name: js.UndefOr[SensitiveString1600]
  }

  object RegisterAppInstanceUserEndpointRequest {
    @inline
    def apply(
        AppInstanceUserArn: SensitiveChimeArn,
        ClientRequestToken: ClientRequestToken,
        EndpointAttributes: EndpointAttributes,
        ResourceArn: SensitiveChimeArn,
        Type: AppInstanceUserEndpointType,
        AllowMessages: js.UndefOr[AllowMessages] = js.undefined,
        Name: js.UndefOr[SensitiveString1600] = js.undefined
    ): RegisterAppInstanceUserEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "EndpointAttributes" -> EndpointAttributes.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AllowMessages.foreach(__v => __obj.updateDynamic("AllowMessages")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAppInstanceUserEndpointRequest]
    }
  }

  @js.native
  trait RegisterAppInstanceUserEndpointResponse extends js.Object {
    var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn]
    var EndpointId: js.UndefOr[SensitiveString64]
  }

  object RegisterAppInstanceUserEndpointResponse {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined,
        EndpointId: js.UndefOr[SensitiveString64] = js.undefined
    ): RegisterAppInstanceUserEndpointResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAppInstanceUserEndpointResponse]
    }
  }

  /** A tag object containing a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ChimeArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: ChimeArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ChimeArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: ChimeArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAppInstanceRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var Metadata: Metadata
    var Name: NonEmptyResourceName
  }

  object UpdateAppInstanceRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        Metadata: Metadata,
        Name: NonEmptyResourceName
    ): UpdateAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "Metadata" -> Metadata.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAppInstanceRequest]
    }
  }

  @js.native
  trait UpdateAppInstanceResponse extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
  }

  object UpdateAppInstanceResponse {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateAppInstanceResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceResponse]
    }
  }

  @js.native
  trait UpdateAppInstanceUserEndpointRequest extends js.Object {
    var AppInstanceUserArn: SensitiveChimeArn
    var EndpointId: SensitiveString64
    var AllowMessages: js.UndefOr[AllowMessages]
    var Name: js.UndefOr[SensitiveString1600]
  }

  object UpdateAppInstanceUserEndpointRequest {
    @inline
    def apply(
        AppInstanceUserArn: SensitiveChimeArn,
        EndpointId: SensitiveString64,
        AllowMessages: js.UndefOr[AllowMessages] = js.undefined,
        Name: js.UndefOr[SensitiveString1600] = js.undefined
    ): UpdateAppInstanceUserEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any]
      )

      AllowMessages.foreach(__v => __obj.updateDynamic("AllowMessages")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceUserEndpointRequest]
    }
  }

  @js.native
  trait UpdateAppInstanceUserEndpointResponse extends js.Object {
    var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn]
    var EndpointId: js.UndefOr[SensitiveString64]
  }

  object UpdateAppInstanceUserEndpointResponse {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined,
        EndpointId: js.UndefOr[SensitiveString64] = js.undefined
    ): UpdateAppInstanceUserEndpointResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceUserEndpointResponse]
    }
  }

  @js.native
  trait UpdateAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
    var Metadata: Metadata
    var Name: UserName
  }

  object UpdateAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn,
        Metadata: Metadata,
        Name: UserName
    ): UpdateAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "Metadata" -> Metadata.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAppInstanceUserRequest]
    }
  }

  @js.native
  trait UpdateAppInstanceUserResponse extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
  }

  object UpdateAppInstanceUserResponse {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceUserResponse]
    }
  }
}
