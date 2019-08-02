package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object workmail {
  type Aliases               = js.Array[EmailAddress]
  type EmailAddress          = String
  type EntityState           = String
  type GroupName             = String
  type Groups                = js.Array[Group]
  type MaxResults            = Int
  type MemberType            = String
  type Members               = js.Array[Member]
  type NextToken             = String
  type OrganizationId        = String
  type OrganizationName      = String
  type OrganizationSummaries = js.Array[OrganizationSummary]
  type Password              = String
  type PermissionType        = String
  type PermissionValues      = js.Array[PermissionType]
  type Permissions           = js.Array[Permission]
  type ResourceDelegates     = js.Array[Delegate]
  type ResourceId            = String
  type ResourceName          = String
  type ResourceType          = String
  type Resources             = js.Array[Resource]
  type Timestamp             = js.Date
  type UserName              = String
  type UserRole              = String
  type Users                 = js.Array[User]
  type WorkMailIdentifier    = String

  implicit final class WorkMailOps(val service: WorkMail) extends AnyVal {

    def associateDelegateToResourceFuture(
        params: AssociateDelegateToResourceRequest
    ): Future[AssociateDelegateToResourceResponse] = service.associateDelegateToResource(params).promise.toFuture
    def associateMemberToGroupFuture(params: AssociateMemberToGroupRequest): Future[AssociateMemberToGroupResponse] =
      service.associateMemberToGroup(params).promise.toFuture
    def createAliasFuture(params: CreateAliasRequest): Future[CreateAliasResponse] =
      service.createAlias(params).promise.toFuture
    def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise.toFuture
    def createResourceFuture(params: CreateResourceRequest): Future[CreateResourceResponse] =
      service.createResource(params).promise.toFuture
    def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    def deleteAliasFuture(params: DeleteAliasRequest): Future[DeleteAliasResponse] =
      service.deleteAlias(params).promise.toFuture
    def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] =
      service.deleteGroup(params).promise.toFuture
    def deleteMailboxPermissionsFuture(
        params: DeleteMailboxPermissionsRequest
    ): Future[DeleteMailboxPermissionsResponse] = service.deleteMailboxPermissions(params).promise.toFuture
    def deleteResourceFuture(params: DeleteResourceRequest): Future[DeleteResourceResponse] =
      service.deleteResource(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise.toFuture
    def deregisterFromWorkMailFuture(params: DeregisterFromWorkMailRequest): Future[DeregisterFromWorkMailResponse] =
      service.deregisterFromWorkMail(params).promise.toFuture
    def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] =
      service.describeGroup(params).promise.toFuture
    def describeOrganizationFuture(params: DescribeOrganizationRequest): Future[DescribeOrganizationResponse] =
      service.describeOrganization(params).promise.toFuture
    def describeResourceFuture(params: DescribeResourceRequest): Future[DescribeResourceResponse] =
      service.describeResource(params).promise.toFuture
    def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise.toFuture
    def disassociateDelegateFromResourceFuture(
        params: DisassociateDelegateFromResourceRequest
    ): Future[DisassociateDelegateFromResourceResponse] =
      service.disassociateDelegateFromResource(params).promise.toFuture
    def disassociateMemberFromGroupFuture(
        params: DisassociateMemberFromGroupRequest
    ): Future[DisassociateMemberFromGroupResponse] = service.disassociateMemberFromGroup(params).promise.toFuture
    def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise.toFuture
    def listGroupMembersFuture(params: ListGroupMembersRequest): Future[ListGroupMembersResponse] =
      service.listGroupMembers(params).promise.toFuture
    def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise.toFuture
    def listMailboxPermissionsFuture(params: ListMailboxPermissionsRequest): Future[ListMailboxPermissionsResponse] =
      service.listMailboxPermissions(params).promise.toFuture
    def listOrganizationsFuture(params: ListOrganizationsRequest): Future[ListOrganizationsResponse] =
      service.listOrganizations(params).promise.toFuture
    def listResourceDelegatesFuture(params: ListResourceDelegatesRequest): Future[ListResourceDelegatesResponse] =
      service.listResourceDelegates(params).promise.toFuture
    def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def putMailboxPermissionsFuture(params: PutMailboxPermissionsRequest): Future[PutMailboxPermissionsResponse] =
      service.putMailboxPermissions(params).promise.toFuture
    def registerToWorkMailFuture(params: RegisterToWorkMailRequest): Future[RegisterToWorkMailResponse] =
      service.registerToWorkMail(params).promise.toFuture
    def resetPasswordFuture(params: ResetPasswordRequest): Future[ResetPasswordResponse] =
      service.resetPassword(params).promise.toFuture
    def updatePrimaryEmailAddressFuture(
        params: UpdatePrimaryEmailAddressRequest
    ): Future[UpdatePrimaryEmailAddressResponse] = service.updatePrimaryEmailAddress(params).promise.toFuture
    def updateResourceFuture(params: UpdateResourceRequest): Future[UpdateResourceResponse] =
      service.updateResource(params).promise.toFuture
  }
}

package workmail {
  @js.native
  @JSImport("aws-sdk", "WorkMail")
  class WorkMail() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDelegateToResource(
        params: AssociateDelegateToResourceRequest
    ): Request[AssociateDelegateToResourceResponse] = js.native
    def associateMemberToGroup(params: AssociateMemberToGroupRequest): Request[AssociateMemberToGroupResponse] =
      js.native
    def createAlias(params: CreateAliasRequest): Request[CreateAliasResponse]          = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse]          = js.native
    def createResource(params: CreateResourceRequest): Request[CreateResourceResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]             = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[DeleteAliasResponse]          = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse]          = js.native
    def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): Request[DeleteMailboxPermissionsResponse] =
      js.native
    def deleteResource(params: DeleteResourceRequest): Request[DeleteResourceResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse]             = js.native
    def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): Request[DeregisterFromWorkMailResponse] =
      js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse]                      = js.native
    def describeOrganization(params: DescribeOrganizationRequest): Request[DescribeOrganizationResponse] = js.native
    def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse]             = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse]                         = js.native
    def disassociateDelegateFromResource(
        params: DisassociateDelegateFromResourceRequest
    ): Request[DisassociateDelegateFromResourceResponse] = js.native
    def disassociateMemberFromGroup(
        params: DisassociateMemberFromGroupRequest
    ): Request[DisassociateMemberFromGroupResponse]                                          = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse]                = js.native
    def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                   = js.native
    def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse] =
      js.native
    def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse]             = js.native
    def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse]                         = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse] = js.native
    def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse]          = js.native
    def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse]                         = js.native
    def updatePrimaryEmailAddress(
        params: UpdatePrimaryEmailAddressRequest
    ): Request[UpdatePrimaryEmailAddressResponse]                                      = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse] = js.native
  }

  @js.native
  trait AssociateDelegateToResourceRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object AssociateDelegateToResourceRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): AssociateDelegateToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDelegateToResourceRequest]
    }
  }

  @js.native
  trait AssociateDelegateToResourceResponse extends js.Object {}

  object AssociateDelegateToResourceResponse {
    def apply(
        ): AssociateDelegateToResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDelegateToResourceResponse]
    }
  }

  @js.native
  trait AssociateMemberToGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var MemberId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object AssociateMemberToGroupRequest {
    def apply(
        GroupId: WorkMailIdentifier,
        MemberId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): AssociateMemberToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "MemberId"       -> MemberId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateMemberToGroupRequest]
    }
  }

  @js.native
  trait AssociateMemberToGroupResponse extends js.Object {}

  object AssociateMemberToGroupResponse {
    def apply(
        ): AssociateMemberToGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateMemberToGroupResponse]
    }
  }

  /**
    * At least one delegate must be associated to the resource to disable automatic replies from the resource.
    */
  @js.native
  trait BookingOptions extends js.Object {
    var AutoAcceptRequests: js.UndefOr[Boolean]
    var AutoDeclineConflictingRequests: js.UndefOr[Boolean]
    var AutoDeclineRecurringRequests: js.UndefOr[Boolean]
  }

  object BookingOptions {
    def apply(
        AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined,
        AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined,
        AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined
    ): BookingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoAcceptRequests" -> AutoAcceptRequests.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoDeclineConflictingRequests" -> AutoDeclineConflictingRequests.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoDeclineRecurringRequests" -> AutoDeclineRecurringRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BookingOptions]
    }
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var Alias: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object CreateAliasRequest {
    def apply(
        Alias: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias"          -> Alias.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateAliasResponse extends js.Object {}

  object CreateAliasResponse {
    def apply(
        ): CreateAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasResponse]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var Name: GroupName
    var OrganizationId: OrganizationId
  }

  object CreateGroupRequest {
    def apply(
        Name: GroupName,
        OrganizationId: OrganizationId
    ): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"           -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var GroupId: js.UndefOr[WorkMailIdentifier]
  }

  object CreateGroupResponse {
    def apply(
        GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateResourceRequest extends js.Object {
    var Name: ResourceName
    var OrganizationId: OrganizationId
    var Type: ResourceType
  }

  object CreateResourceRequest {
    def apply(
        Name: ResourceName,
        OrganizationId: OrganizationId,
        Type: ResourceType
    ): CreateResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"           -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Type"           -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceRequest]
    }
  }

  @js.native
  trait CreateResourceResponse extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
  }

  object CreateResourceResponse {
    def apply(
        ResourceId: js.UndefOr[ResourceId] = js.undefined
    ): CreateResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var DisplayName: String
    var Name: UserName
    var OrganizationId: OrganizationId
    var Password: Password
  }

  object CreateUserRequest {
    def apply(
        DisplayName: String,
        Name: UserName,
        OrganizationId: OrganizationId,
        Password: Password
    ): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisplayName"    -> DisplayName.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Password"       -> Password.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object CreateUserResponse {
    def apply(
        UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  /**
    * The name of the attribute, which is one of the values defined in the UserAttribute enumeration.
    */
  @js.native
  trait Delegate extends js.Object {
    var Id: String
    var Type: MemberType
  }

  object Delegate {
    def apply(
        Id: String,
        Type: MemberType
    ): Delegate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Delegate]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var Alias: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeleteAliasRequest {
    def apply(
        Alias: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeleteAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias"          -> Alias.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteAliasResponse extends js.Object {}

  object DeleteAliasResponse {
    def apply(
        ): DeleteAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeleteGroupRequest {
    def apply(
        GroupId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {}

  object DeleteGroupResponse {
    def apply(
        ): DeleteGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var GranteeId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeleteMailboxPermissionsRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        GranteeId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeleteMailboxPermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "GranteeId"      -> GranteeId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMailboxPermissionsRequest]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsResponse extends js.Object {}

  object DeleteMailboxPermissionsResponse {
    def apply(
        ): DeleteMailboxPermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMailboxPermissionsResponse]
    }
  }

  @js.native
  trait DeleteResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object DeleteResourceRequest {
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): DeleteResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceRequest]
    }
  }

  @js.native
  trait DeleteResourceResponse extends js.Object {}

  object DeleteResourceResponse {
    def apply(
        ): DeleteResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  object DeleteUserRequest {
    def apply(
        OrganizationId: OrganizationId,
        UserId: WorkMailIdentifier
    ): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {}

  object DeleteUserResponse {
    def apply(
        ): DeleteUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DeregisterFromWorkMailRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeregisterFromWorkMailRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeregisterFromWorkMailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterFromWorkMailRequest]
    }
  }

  @js.native
  trait DeregisterFromWorkMailResponse extends js.Object {}

  object DeregisterFromWorkMailResponse {
    def apply(
        ): DeregisterFromWorkMailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterFromWorkMailResponse]
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DescribeGroupRequest {
    def apply(
        GroupId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DescribeGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGroupRequest]
    }
  }

  @js.native
  trait DescribeGroupResponse extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var GroupId: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[GroupName]
    var State: js.UndefOr[EntityState]
  }

  object DescribeGroupResponse {
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[GroupName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined
    ): DescribeGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupId" -> GroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeOrganizationRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object DescribeOrganizationRequest {
    def apply(
        OrganizationId: OrganizationId
    ): DescribeOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationRequest]
    }
  }

  @js.native
  trait DescribeOrganizationResponse extends js.Object {
    var Alias: js.UndefOr[OrganizationName]
    var CompletedDate: js.UndefOr[Timestamp]
    var DefaultMailDomain: js.UndefOr[String]
    var DirectoryId: js.UndefOr[String]
    var DirectoryType: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var OrganizationId: js.UndefOr[OrganizationId]
    var State: js.UndefOr[String]
  }

  object DescribeOrganizationResponse {
    def apply(
        Alias: js.UndefOr[OrganizationName] = js.undefined,
        CompletedDate: js.UndefOr[Timestamp] = js.undefined,
        DefaultMailDomain: js.UndefOr[String] = js.undefined,
        DirectoryId: js.UndefOr[String] = js.undefined,
        DirectoryType: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): DescribeOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedDate" -> CompletedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultMailDomain" -> DefaultMailDomain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryId" -> DirectoryId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryType" -> DirectoryType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrganizationId" -> OrganizationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationResponse]
    }
  }

  @js.native
  trait DescribeResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object DescribeResourceRequest {
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): DescribeResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceRequest]
    }
  }

  @js.native
  trait DescribeResourceResponse extends js.Object {
    var BookingOptions: js.UndefOr[BookingOptions]
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var ResourceId: js.UndefOr[ResourceId]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[ResourceType]
  }

  object DescribeResourceResponse {
    def apply(
        BookingOptions: js.UndefOr[BookingOptions] = js.undefined,
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        Type: js.UndefOr[ResourceType] = js.undefined
    ): DescribeResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BookingOptions" -> BookingOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  object DescribeUserRequest {
    def apply(
        OrganizationId: OrganizationId,
        UserId: WorkMailIdentifier
    ): DescribeUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[String]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Name: js.UndefOr[UserName]
    var State: js.UndefOr[EntityState]
    var UserId: js.UndefOr[WorkMailIdentifier]
    var UserRole: js.UndefOr[UserRole]
  }

  object DescribeUserResponse {
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[UserName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        UserId: js.UndefOr[WorkMailIdentifier] = js.undefined,
        UserRole: js.UndefOr[UserRole] = js.undefined
    ): DescribeUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserId" -> UserId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserRole" -> UserRole.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserResponse]
    }
  }

  @js.native
  trait DisassociateDelegateFromResourceRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object DisassociateDelegateFromResourceRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): DisassociateDelegateFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDelegateFromResourceRequest]
    }
  }

  @js.native
  trait DisassociateDelegateFromResourceResponse extends js.Object {}

  object DisassociateDelegateFromResourceResponse {
    def apply(
        ): DisassociateDelegateFromResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDelegateFromResourceResponse]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var MemberId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DisassociateMemberFromGroupRequest {
    def apply(
        GroupId: WorkMailIdentifier,
        MemberId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DisassociateMemberFromGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "MemberId"       -> MemberId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMemberFromGroupRequest]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupResponse extends js.Object {}

  object DisassociateMemberFromGroupResponse {
    def apply(
        ): DisassociateMemberFromGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMemberFromGroupResponse]
    }
  }

  object EntityStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"
    val DELETED  = "DELETED"

    val values = IndexedSeq(ENABLED, DISABLED, DELETED)
  }

  /**
    * The representation of an Amazon WorkMail group.
    */
  @js.native
  trait Group extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[GroupName]
    var State: js.UndefOr[EntityState]
  }

  object Group {
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[GroupName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined
    ): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAliasesRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[Aliases]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAliasesResponse {
    def apply(
        Aliases: js.UndefOr[Aliases] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aliases" -> Aliases.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesResponse]
    }
  }

  @js.native
  trait ListGroupMembersRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembersRequest {
    def apply(
        GroupId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupMembersRequest]
    }
  }

  @js.native
  trait ListGroupMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembersResponse {
    def apply(
        Members: js.UndefOr[Members] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Members" -> Members.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupMembersResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsRequest {
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[Groups]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsResponse {
    def apply(
        Groups: js.UndefOr[Groups] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMailboxPermissionsRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMailboxPermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMailboxPermissionsRequest]
    }
  }

  @js.native
  trait ListMailboxPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[Permissions]
  }

  object ListMailboxPermissionsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Permissions: js.UndefOr[Permissions] = js.undefined
    ): ListMailboxPermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Permissions" -> Permissions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMailboxPermissionsResponse]
    }
  }

  @js.native
  trait ListOrganizationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationsRequest]
    }
  }

  @js.native
  trait ListOrganizationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationSummaries: js.UndefOr[OrganizationSummaries]
  }

  object ListOrganizationsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OrganizationSummaries: js.UndefOr[OrganizationSummaries] = js.undefined
    ): ListOrganizationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrganizationSummaries" -> OrganizationSummaries.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationsResponse]
    }
  }

  @js.native
  trait ListResourceDelegatesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: WorkMailIdentifier
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceDelegatesRequest {
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: WorkMailIdentifier,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceDelegatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDelegatesRequest]
    }
  }

  @js.native
  trait ListResourceDelegatesResponse extends js.Object {
    var Delegates: js.UndefOr[ResourceDelegates]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceDelegatesResponse {
    def apply(
        Delegates: js.UndefOr[ResourceDelegates] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceDelegatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Delegates" -> Delegates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDelegatesResponse]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourcesRequest {
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Resources: js.UndefOr[Resources]
  }

  object ListResourcesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Resources: js.UndefOr[Resources] = js.undefined
    ): ListResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resources" -> Resources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Users: js.UndefOr[Users]
  }

  object ListUsersResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Users: js.UndefOr[Users] = js.undefined
    ): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  /**
    * The representation of a user or group.
    */
  @js.native
  trait Member extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[MemberType]
  }

  object Member {
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        Type: js.UndefOr[MemberType] = js.undefined
    ): Member = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Member]
    }
  }

  object MemberTypeEnum {
    val GROUP = "GROUP"
    val USER  = "USER"

    val values = IndexedSeq(GROUP, USER)
  }

  /**
    * The representation of an organization.
    */
  @js.native
  trait OrganizationSummary extends js.Object {
    var Alias: js.UndefOr[OrganizationName]
    var ErrorMessage: js.UndefOr[String]
    var OrganizationId: js.UndefOr[OrganizationId]
    var State: js.UndefOr[String]
  }

  object OrganizationSummary {
    def apply(
        Alias: js.UndefOr[OrganizationName] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): OrganizationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrganizationId" -> OrganizationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationSummary]
    }
  }

  /**
    * Permission granted to a user, group, or resource to access a certain aspect of another user, group, or resource mailbox.
    */
  @js.native
  trait Permission extends js.Object {
    var GranteeId: WorkMailIdentifier
    var GranteeType: MemberType
    var PermissionValues: PermissionValues
  }

  object Permission {
    def apply(
        GranteeId: WorkMailIdentifier,
        GranteeType: MemberType,
        PermissionValues: PermissionValues
    ): Permission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GranteeId"        -> GranteeId.asInstanceOf[js.Any],
        "GranteeType"      -> GranteeType.asInstanceOf[js.Any],
        "PermissionValues" -> PermissionValues.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Permission]
    }
  }

  object PermissionTypeEnum {
    val FULL_ACCESS    = "FULL_ACCESS"
    val SEND_AS        = "SEND_AS"
    val SEND_ON_BEHALF = "SEND_ON_BEHALF"

    val values = IndexedSeq(FULL_ACCESS, SEND_AS, SEND_ON_BEHALF)
  }

  @js.native
  trait PutMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var GranteeId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var PermissionValues: PermissionValues
  }

  object PutMailboxPermissionsRequest {
    def apply(
        EntityId: WorkMailIdentifier,
        GranteeId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        PermissionValues: PermissionValues
    ): PutMailboxPermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityId"         -> EntityId.asInstanceOf[js.Any],
        "GranteeId"        -> GranteeId.asInstanceOf[js.Any],
        "OrganizationId"   -> OrganizationId.asInstanceOf[js.Any],
        "PermissionValues" -> PermissionValues.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMailboxPermissionsRequest]
    }
  }

  @js.native
  trait PutMailboxPermissionsResponse extends js.Object {}

  object PutMailboxPermissionsResponse {
    def apply(
        ): PutMailboxPermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMailboxPermissionsResponse]
    }
  }

  @js.native
  trait RegisterToWorkMailRequest extends js.Object {
    var Email: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object RegisterToWorkMailRequest {
    def apply(
        Email: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): RegisterToWorkMailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Email"          -> Email.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterToWorkMailRequest]
    }
  }

  @js.native
  trait RegisterToWorkMailResponse extends js.Object {}

  object RegisterToWorkMailResponse {
    def apply(
        ): RegisterToWorkMailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterToWorkMailResponse]
    }
  }

  @js.native
  trait ResetPasswordRequest extends js.Object {
    var OrganizationId: OrganizationId
    var Password: Password
    var UserId: WorkMailIdentifier
  }

  object ResetPasswordRequest {
    def apply(
        OrganizationId: OrganizationId,
        Password: Password,
        UserId: WorkMailIdentifier
    ): ResetPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Password"       -> Password.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPasswordRequest]
    }
  }

  @js.native
  trait ResetPasswordResponse extends js.Object {}

  object ResetPasswordResponse {
    def apply(
        ): ResetPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPasswordResponse]
    }
  }

  /**
    * The representation of a resource.
    */
  @js.native
  trait Resource extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[ResourceName]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[ResourceType]
  }

  object Resource {
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        Type: js.UndefOr[ResourceType] = js.undefined
    ): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  object ResourceTypeEnum {
    val ROOM      = "ROOM"
    val EQUIPMENT = "EQUIPMENT"

    val values = IndexedSeq(ROOM, EQUIPMENT)
  }

  @js.native
  trait UpdatePrimaryEmailAddressRequest extends js.Object {
    var Email: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object UpdatePrimaryEmailAddressRequest {
    def apply(
        Email: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): UpdatePrimaryEmailAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Email"          -> Email.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePrimaryEmailAddressRequest]
    }
  }

  @js.native
  trait UpdatePrimaryEmailAddressResponse extends js.Object {}

  object UpdatePrimaryEmailAddressResponse {
    def apply(
        ): UpdatePrimaryEmailAddressResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePrimaryEmailAddressResponse]
    }
  }

  @js.native
  trait UpdateResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
    var BookingOptions: js.UndefOr[BookingOptions]
    var Name: js.UndefOr[ResourceName]
  }

  object UpdateResourceRequest {
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: ResourceId,
        BookingOptions: js.UndefOr[BookingOptions] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): UpdateResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any],
        "BookingOptions" -> BookingOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceRequest]
    }
  }

  @js.native
  trait UpdateResourceResponse extends js.Object {}

  object UpdateResourceResponse {
    def apply(
        ): UpdateResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceResponse]
    }
  }

  /**
    * The representation of an Amazon WorkMail user.
    */
  @js.native
  trait User extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[String]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[UserName]
    var State: js.UndefOr[EntityState]
    var UserRole: js.UndefOr[UserRole]
  }

  object User {
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[String] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[UserName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        UserRole: js.UndefOr[UserRole] = js.undefined
    ): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledDate" -> EnabledDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserRole" -> UserRole.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  object UserRoleEnum {
    val USER        = "USER"
    val RESOURCE    = "RESOURCE"
    val SYSTEM_USER = "SYSTEM_USER"

    val values = IndexedSeq(USER, RESOURCE, SYSTEM_USER)
  }
}
