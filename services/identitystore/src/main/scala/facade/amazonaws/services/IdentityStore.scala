package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object identitystore {
  type AttributePath = String
  type Filters = js.Array[Filter]
  type GroupDisplayName = String
  type Groups = js.Array[Group]
  type IdentityStoreId = String
  type MaxResults = Int
  type NextToken = String
  type ResourceId = String
  type SensitiveStringType = String
  type UserName = String
  type Users = js.Array[User]

  final class IdentityStoreOps(private val service: IdentityStore) extends AnyVal {

    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] = service.describeGroup(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/identitystore", JSImport.Namespace, "AWS.IdentityStore")
  class IdentityStore() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
  }
  object IdentityStore {
    @inline implicit def toOps(service: IdentityStore): IdentityStoreOps = {
      new IdentityStoreOps(service)
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
  }

  object DescribeGroupRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId
    ): DescribeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupRequest]
    }
  }

  @js.native
  trait DescribeGroupResponse extends js.Object {
    var DisplayName: GroupDisplayName
    var GroupId: ResourceId
  }

  object DescribeGroupResponse {
    @inline
    def apply(
        DisplayName: GroupDisplayName,
        GroupId: ResourceId
    ): DescribeGroupResponse = {
      val __obj = js.Dynamic.literal(
        "DisplayName" -> DisplayName.asInstanceOf[js.Any],
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
  }

  object DescribeUserRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var UserId: ResourceId
    var UserName: UserName
  }

  object DescribeUserResponse {
    @inline
    def apply(
        UserId: ResourceId,
        UserName: UserName
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /** A query filter used by <code>ListUsers</code> and <code>ListGroup</code>. This filter object provides the attribute name and attribute value to search users or groups.
    */
  @js.native
  trait Filter extends js.Object {
    var AttributePath: AttributePath
    var AttributeValue: SensitiveStringType
  }

  object Filter {
    @inline
    def apply(
        AttributePath: AttributePath,
        AttributeValue: SensitiveStringType
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "AttributePath" -> AttributePath.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  /** A group object, which contains a specified group’s metadata and attributes.
    */
  @js.native
  trait Group extends js.Object {
    var DisplayName: GroupDisplayName
    var GroupId: ResourceId
  }

  object Group {
    @inline
    def apply(
        DisplayName: GroupDisplayName,
        GroupId: ResourceId
    ): Group = {
      val __obj = js.Dynamic.literal(
        "DisplayName" -> DisplayName.asInstanceOf[js.Any],
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Group]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: Groups
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        Groups: Groups,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "Groups" -> Groups.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: Users
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersResponse {
    @inline
    def apply(
        Users: Users,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal(
        "Users" -> Users.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** A user object, which contains a specified user’s metadata and attributes.
    */
  @js.native
  trait User extends js.Object {
    var UserId: ResourceId
    var UserName: UserName
  }

  object User {
    @inline
    def apply(
        UserId: ResourceId,
        UserName: UserName
    ): User = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[User]
    }
  }
}
