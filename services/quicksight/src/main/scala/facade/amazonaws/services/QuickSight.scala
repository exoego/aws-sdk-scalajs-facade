package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object quicksight {
  type Arn                      = String
  type AwsAccountId             = String
  type EmbeddingUrl             = String
  type GroupDescription         = String
  type GroupList                = js.Array[Group]
  type GroupMemberList          = js.Array[GroupMember]
  type GroupMemberName          = String
  type GroupName                = String
  type IdentityType             = String
  type MaxResults               = Int
  type Namespace                = String
  type RoleSessionName          = String
  type SessionLifetimeInMinutes = Double
  type StatusCode               = Int
  type UserList                 = js.Array[User]
  type UserName                 = String
  type UserRole                 = String

  implicit final class QuickSightOps(private val service: QuickSight) extends AnyVal {

    def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise.toFuture
    def createGroupMembershipFuture(params: CreateGroupMembershipRequest): Future[CreateGroupMembershipResponse] =
      service.createGroupMembership(params).promise.toFuture
    def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] =
      service.deleteGroup(params).promise.toFuture
    def deleteGroupMembershipFuture(params: DeleteGroupMembershipRequest): Future[DeleteGroupMembershipResponse] =
      service.deleteGroupMembership(params).promise.toFuture
    def deleteUserByPrincipalIdFuture(params: DeleteUserByPrincipalIdRequest): Future[DeleteUserByPrincipalIdResponse] =
      service.deleteUserByPrincipalId(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise.toFuture
    def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] =
      service.describeGroup(params).promise.toFuture
    def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise.toFuture
    def getDashboardEmbedUrlFuture(params: GetDashboardEmbedUrlRequest): Future[GetDashboardEmbedUrlResponse] =
      service.getDashboardEmbedUrl(params).promise.toFuture
    def listGroupMembershipsFuture(params: ListGroupMembershipsRequest): Future[ListGroupMembershipsResponse] =
      service.listGroupMemberships(params).promise.toFuture
    def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise.toFuture
    def listUserGroupsFuture(params: ListUserGroupsRequest): Future[ListUserGroupsResponse] =
      service.listUserGroups(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def registerUserFuture(params: RegisterUserRequest): Future[RegisterUserResponse] =
      service.registerUser(params).promise.toFuture
    def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] =
      service.updateGroup(params).promise.toFuture
    def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise.toFuture
  }
}

package quicksight {
  @js.native
  @JSImport("aws-sdk", "QuickSight")
  class QuickSight() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse]                               = js.native
    def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse]                               = js.native
    def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse]                                  = js.native
    def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse] =
      js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse]                      = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse]                         = js.native
    def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse] = js.native
    def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                               = js.native
    def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse]                   = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                  = js.native
    def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse]                         = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse]                            = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                               = js.native
  }

  @js.native
  trait CreateGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  object CreateGroupMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        MemberName: GroupMemberName,
        Namespace: Namespace
    ): CreateGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "MemberName"   -> MemberName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateGroupMembershipRequest]
    }
  }

  @js.native
  trait CreateGroupMembershipResponse extends js.Object {
    var GroupMember: js.UndefOr[GroupMember]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateGroupMembershipResponse {
    @inline
    def apply(
        GroupMember: js.UndefOr[GroupMember] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateGroupMembershipResponse = {
      val __obj = js.Dynamic.literal()
      GroupMember.foreach(__v => __obj.updateDynamic("GroupMember")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupMembershipResponse]
    }
  }

  /**
    * The request object for this operation.
    */
  @js.native
  trait CreateGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var Description: js.UndefOr[GroupDescription]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  /**
    * The response object for this operation.
    */
  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait DeleteGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  object DeleteGroupMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        MemberName: GroupMemberName,
        Namespace: Namespace
    ): DeleteGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "MemberName"   -> MemberName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGroupMembershipRequest]
    }
  }

  @js.native
  trait DeleteGroupMembershipResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteGroupMembershipResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteGroupMembershipResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupMembershipResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteGroupResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteUserByPrincipalIdRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var PrincipalId: String
  }

  object DeleteUserByPrincipalIdRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        PrincipalId: String
    ): DeleteUserByPrincipalIdRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any],
        "PrincipalId"  -> PrincipalId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserByPrincipalIdRequest]
    }
  }

  @js.native
  trait DeleteUserByPrincipalIdResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteUserByPrincipalIdResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteUserByPrincipalIdResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserByPrincipalIdResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
  }

  object DeleteUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any],
        "UserName"     -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
  }

  object DescribeGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace
    ): DescribeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeGroupRequest]
    }
  }

  @js.native
  trait DescribeGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
  }

  object DescribeUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any],
        "UserName"     -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
  }

  object DescribeUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        User: js.UndefOr[User] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  @js.native
  trait GetDashboardEmbedUrlRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: String
    var IdentityType: IdentityType
    var ResetDisabled: js.UndefOr[Boolean]
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
    var UndoRedoDisabled: js.UndefOr[Boolean]
    var UserArn: js.UndefOr[Arn]
  }

  object GetDashboardEmbedUrlRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: String,
        IdentityType: IdentityType,
        ResetDisabled: js.UndefOr[Boolean] = js.undefined,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined,
        UndoRedoDisabled: js.UndefOr[Boolean] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): GetDashboardEmbedUrlRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId"  -> DashboardId.asInstanceOf[js.Any],
        "IdentityType" -> IdentityType.asInstanceOf[js.Any]
      )

      ResetDisabled.foreach(__v => __obj.updateDynamic("ResetDisabled")(__v.asInstanceOf[js.Any]))
      SessionLifetimeInMinutes.foreach(__v => __obj.updateDynamic("SessionLifetimeInMinutes")(__v.asInstanceOf[js.Any]))
      UndoRedoDisabled.foreach(__v => __obj.updateDynamic("UndoRedoDisabled")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDashboardEmbedUrlRequest]
    }
  }

  @js.native
  trait GetDashboardEmbedUrlResponse extends js.Object {
    var EmbedUrl: js.UndefOr[EmbeddingUrl]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object GetDashboardEmbedUrlResponse {
    @inline
    def apply(
        EmbedUrl: js.UndefOr[EmbeddingUrl] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): GetDashboardEmbedUrlResponse = {
      val __obj = js.Dynamic.literal()
      EmbedUrl.foreach(__v => __obj.updateDynamic("EmbedUrl")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDashboardEmbedUrlResponse]
    }
  }

  /**
    * A <i>group</i> in Amazon QuickSight consists of a set of users. You can use groups to make it easier to manage access and security. Currently, an Amazon QuickSight subscription can't contain more than 500 Amazon QuickSight groups.
    */
  @js.native
  trait Group extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GroupDescription]
    var GroupName: js.UndefOr[GroupName]
    var PrincipalId: js.UndefOr[String]
  }

  object Group {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GroupDescription] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        PrincipalId: js.UndefOr[String] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /**
    * A member of an Amazon QuickSight group. Currently, group members must be users. Groups can't be members of another group.
    */
  @js.native
  trait GroupMember extends js.Object {
    var Arn: js.UndefOr[Arn]
    var MemberName: js.UndefOr[GroupMemberName]
  }

  object GroupMember {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        MemberName: js.UndefOr[GroupMemberName] = js.undefined
    ): GroupMember = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      MemberName.foreach(__v => __obj.updateDynamic("MemberName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupMember]
    }
  }

  object IdentityTypeEnum {
    val IAM        = "IAM"
    val QUICKSIGHT = "QUICKSIGHT"

    val values = js.Object.freeze(js.Array(IAM, QUICKSIGHT))
  }

  @js.native
  trait ListGroupMembershipsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListGroupMembershipsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListGroupMembershipsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsRequest]
    }
  }

  @js.native
  trait ListGroupMembershipsResponse extends js.Object {
    var GroupMemberList: js.UndefOr[GroupMemberList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListGroupMembershipsResponse {
    @inline
    def apply(
        GroupMemberList: js.UndefOr[GroupMemberList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListGroupMembershipsResponse = {
      val __obj = js.Dynamic.literal()
      GroupMemberList.foreach(__v => __obj.updateDynamic("GroupMemberList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        GroupList: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal()
      GroupList.foreach(__v => __obj.updateDynamic("GroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListUserGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListUserGroupsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUserGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any],
        "UserName"     -> UserName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserGroupsRequest]
    }
  }

  @js.native
  trait ListUserGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListUserGroupsResponse {
    @inline
    def apply(
        GroupList: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListUserGroupsResponse = {
      val __obj = js.Dynamic.literal()
      GroupList.foreach(__v => __obj.updateDynamic("GroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListUsersRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UserList: js.UndefOr[UserList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        UserList: js.UndefOr[UserList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserList.foreach(__v => __obj.updateDynamic("UserList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait RegisterUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Email: String
    var IdentityType: IdentityType
    var Namespace: Namespace
    var UserRole: UserRole
    var IamArn: js.UndefOr[String]
    var SessionName: js.UndefOr[RoleSessionName]
    var UserName: js.UndefOr[UserName]
  }

  object RegisterUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Email: String,
        IdentityType: IdentityType,
        Namespace: Namespace,
        UserRole: UserRole,
        IamArn: js.UndefOr[String] = js.undefined,
        SessionName: js.UndefOr[RoleSessionName] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): RegisterUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Email"        -> Email.asInstanceOf[js.Any],
        "IdentityType" -> IdentityType.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any],
        "UserRole"     -> UserRole.asInstanceOf[js.Any]
      )

      IamArn.foreach(__v => __obj.updateDynamic("IamArn")(__v.asInstanceOf[js.Any]))
      SessionName.foreach(__v => __obj.updateDynamic("SessionName")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUserRequest]
    }
  }

  @js.native
  trait RegisterUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
    var UserInvitationUrl: js.UndefOr[String]
  }

  object RegisterUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        User: js.UndefOr[User] = js.undefined,
        UserInvitationUrl: js.UndefOr[String] = js.undefined
    ): RegisterUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      UserInvitationUrl.foreach(__v => __obj.updateDynamic("UserInvitationUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUserResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var Description: js.UndefOr[GroupDescription]
  }

  object UpdateGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName"    -> GroupName.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Email: String
    var Namespace: Namespace
    var Role: UserRole
    var UserName: UserName
  }

  object UpdateUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Email: String,
        Namespace: Namespace,
        Role: UserRole,
        UserName: UserName
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Email"        -> Email.asInstanceOf[js.Any],
        "Namespace"    -> Namespace.asInstanceOf[js.Any],
        "Role"         -> Role.asInstanceOf[js.Any],
        "UserName"     -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /**
    * A registered user of Amazon QuickSight. Currently, an Amazon QuickSight subscription can't contain more than 20 million users.
    */
  @js.native
  trait User extends js.Object {
    var Active: js.UndefOr[Boolean]
    var Arn: js.UndefOr[Arn]
    var Email: js.UndefOr[String]
    var IdentityType: js.UndefOr[IdentityType]
    var PrincipalId: js.UndefOr[String]
    var Role: js.UndefOr[UserRole]
    var UserName: js.UndefOr[UserName]
  }

  object User {
    @inline
    def apply(
        Active: js.UndefOr[Boolean] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        Email: js.UndefOr[String] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        PrincipalId: js.UndefOr[String] = js.undefined,
        Role: js.UndefOr[UserRole] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  object UserRoleEnum {
    val ADMIN             = "ADMIN"
    val AUTHOR            = "AUTHOR"
    val READER            = "READER"
    val RESTRICTED_AUTHOR = "RESTRICTED_AUTHOR"
    val RESTRICTED_READER = "RESTRICTED_READER"

    val values = js.Object.freeze(js.Array(ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR, RESTRICTED_READER))
  }
}
