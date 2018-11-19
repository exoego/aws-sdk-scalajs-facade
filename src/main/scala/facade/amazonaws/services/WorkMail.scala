package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object workmail {
  type Aliases = js.Array[EmailAddress]
  type EmailAddress = String
  type EntityState = String
  type GroupName = String
  type Groups = js.Array[Group]
  type MaxResults = Int
  type MemberType = String
  type Members = js.Array[Member]
  type NextToken = String
  type OrganizationId = String
  type OrganizationName = String
  type OrganizationSummaries = js.Array[OrganizationSummary]
  type Password = String
  type PermissionType = String
  type PermissionValues = js.Array[PermissionType]
  type Permissions = js.Array[Permission]
  type ResourceDelegates = js.Array[Delegate]
  type ResourceId = String
  type ResourceName = String
  type ResourceType = String
  type Resources = js.Array[Resource]
  type Timestamp = js.Date
  type UserName = String
  type UserRole = String
  type Users = js.Array[User]
  type WorkMailIdentifier = String
}

package workmail {
  @js.native
  @JSImport("aws-sdk", "WorkMail")
  class WorkMail(config: AWSConfig) extends js.Object {
    def associateDelegateToResource(params: AssociateDelegateToResourceRequest): Request[AssociateDelegateToResourceResponse] = js.native
    def associateMemberToGroup(params: AssociateMemberToGroupRequest): Request[AssociateMemberToGroupResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[CreateAliasResponse] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createResource(params: CreateResourceRequest): Request[CreateResourceResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[DeleteAliasResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): Request[DeleteMailboxPermissionsResponse] = js.native
    def deleteResource(params: DeleteResourceRequest): Request[DeleteResourceResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): Request[DeregisterFromWorkMailResponse] = js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeOrganization(params: DescribeOrganizationRequest): Request[DescribeOrganizationResponse] = js.native
    def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest): Request[DisassociateDelegateFromResourceResponse] = js.native
    def disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest): Request[DisassociateMemberFromGroupResponse] = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse] = js.native
    def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse] = js.native
    def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse] = js.native
    def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse] = js.native
    def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse] = js.native
    def updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest): Request[UpdatePrimaryEmailAddressResponse] = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse] = js.native
  }

  @js.native
  trait AssociateDelegateToResourceRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var ResourceId: js.UndefOr[ResourceId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
  }

  object AssociateDelegateToResourceRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined): AssociateDelegateToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDelegateToResourceRequest]
    }
  }

  @js.native
  trait AssociateDelegateToResourceResponse extends js.Object {

  }

  object AssociateDelegateToResourceResponse {
    def apply(): AssociateDelegateToResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDelegateToResourceResponse]
    }
  }

  @js.native
  trait AssociateMemberToGroupRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var GroupId: js.UndefOr[WorkMailIdentifier]
    var MemberId: js.UndefOr[WorkMailIdentifier]
  }

  object AssociateMemberToGroupRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      MemberId: js.UndefOr[WorkMailIdentifier] = js.undefined): AssociateMemberToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "MemberId" -> MemberId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateMemberToGroupRequest]
    }
  }

  @js.native
  trait AssociateMemberToGroupResponse extends js.Object {

  }

  object AssociateMemberToGroupResponse {
    def apply(): AssociateMemberToGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateMemberToGroupResponse]
    }
  }

  /**
   * <p>At least one delegate must be associated to the resource to disable automatic replies from the resource.</p>
   */
  @js.native
  trait BookingOptions extends js.Object {
    var AutoAcceptRequests: js.UndefOr[Boolean]
    var AutoDeclineRecurringRequests: js.UndefOr[Boolean]
    var AutoDeclineConflictingRequests: js.UndefOr[Boolean]
  }

  object BookingOptions {
    def apply(
      AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined,
      AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined,
      AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined): BookingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoAcceptRequests" -> AutoAcceptRequests.map { x => x.asInstanceOf[js.Any] },
        "AutoDeclineRecurringRequests" -> AutoDeclineRecurringRequests.map { x => x.asInstanceOf[js.Any] },
        "AutoDeclineConflictingRequests" -> AutoDeclineConflictingRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BookingOptions]
    }
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var Alias: js.UndefOr[EmailAddress]
  }

  object CreateAliasRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Alias: js.UndefOr[EmailAddress] = js.undefined): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateAliasResponse extends js.Object {

  }

  object CreateAliasResponse {
    def apply(): CreateAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasResponse]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var Name: js.UndefOr[GroupName]
  }

  object CreateGroupRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      Name: js.UndefOr[GroupName] = js.undefined): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var GroupId: js.UndefOr[WorkMailIdentifier]
  }

  object CreateGroupResponse {
    def apply(
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateResourceRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var Name: js.UndefOr[ResourceName]
    var Type: js.UndefOr[ResourceType]
  }

  object CreateResourceRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      Type: js.UndefOr[ResourceType] = js.undefined): CreateResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceRequest]
    }
  }

  @js.native
  trait CreateResourceResponse extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
  }

  object CreateResourceResponse {
    def apply(
      ResourceId: js.UndefOr[ResourceId] = js.undefined): CreateResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var Name: js.UndefOr[UserName]
    var DisplayName: js.UndefOr[String]
    var Password: js.UndefOr[Password]
  }

  object CreateUserRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      Name: js.UndefOr[UserName] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object CreateUserResponse {
    def apply(
      UserId: js.UndefOr[WorkMailIdentifier] = js.undefined): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  /**
   * <p>The name of the attribute, which is one of the values defined in the UserAttribute enumeration.</p>
   */
  @js.native
  trait Delegate extends js.Object {
    var Id: js.UndefOr[String]
    var Type: js.UndefOr[MemberType]
  }

  object Delegate {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[MemberType] = js.undefined): Delegate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Delegate]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var Alias: js.UndefOr[EmailAddress]
  }

  object DeleteAliasRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Alias: js.UndefOr[EmailAddress] = js.undefined): DeleteAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteAliasResponse extends js.Object {

  }

  object DeleteAliasResponse {
    def apply(): DeleteAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var GroupId: js.UndefOr[WorkMailIdentifier]
  }

  object DeleteGroupRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {

  }

  object DeleteGroupResponse {
    def apply(): DeleteGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var GranteeId: js.UndefOr[WorkMailIdentifier]
  }

  object DeleteMailboxPermissionsRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      GranteeId: js.UndefOr[WorkMailIdentifier] = js.undefined): DeleteMailboxPermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "GranteeId" -> GranteeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMailboxPermissionsRequest]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsResponse extends js.Object {

  }

  object DeleteMailboxPermissionsResponse {
    def apply(): DeleteMailboxPermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMailboxPermissionsResponse]
    }
  }

  @js.native
  trait DeleteResourceRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var ResourceId: js.UndefOr[ResourceId]
  }

  object DeleteResourceRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined): DeleteResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceRequest]
    }
  }

  @js.native
  trait DeleteResourceResponse extends js.Object {

  }

  object DeleteResourceResponse {
    def apply(): DeleteResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object DeleteUserRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      UserId: js.UndefOr[WorkMailIdentifier] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {

  }

  object DeleteUserResponse {
    def apply(): DeleteUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DeregisterFromWorkMailRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
  }

  object DeregisterFromWorkMailRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined): DeregisterFromWorkMailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterFromWorkMailRequest]
    }
  }

  @js.native
  trait DeregisterFromWorkMailResponse extends js.Object {

  }

  object DeregisterFromWorkMailResponse {
    def apply(): DeregisterFromWorkMailResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterFromWorkMailResponse]
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var GroupId: js.UndefOr[WorkMailIdentifier]
  }

  object DescribeGroupRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined): DescribeGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGroupRequest]
    }
  }

  @js.native
  trait DescribeGroupResponse extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Name: js.UndefOr[GroupName]
    var EnabledDate: js.UndefOr[Timestamp]
    var GroupId: js.UndefOr[WorkMailIdentifier]
    var Email: js.UndefOr[EmailAddress]
    var State: js.UndefOr[EntityState]
  }

  object DescribeGroupResponse {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[GroupName] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined): DescribeGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeOrganizationRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
  }

  object DescribeOrganizationRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined): DescribeOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationRequest]
    }
  }

  @js.native
  trait DescribeOrganizationResponse extends js.Object {
    var Alias: js.UndefOr[OrganizationName]
    var DirectoryId: js.UndefOr[String]
    var DefaultMailDomain: js.UndefOr[String]
    var DirectoryType: js.UndefOr[String]
    var OrganizationId: js.UndefOr[OrganizationId]
    var CompletedDate: js.UndefOr[Timestamp]
    var State: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
  }

  object DescribeOrganizationResponse {
    def apply(
      Alias: js.UndefOr[OrganizationName] = js.undefined,
      DirectoryId: js.UndefOr[String] = js.undefined,
      DefaultMailDomain: js.UndefOr[String] = js.undefined,
      DirectoryType: js.UndefOr[String] = js.undefined,
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      CompletedDate: js.UndefOr[Timestamp] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): DescribeOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] },
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "DefaultMailDomain" -> DefaultMailDomain.map { x => x.asInstanceOf[js.Any] },
        "DirectoryType" -> DirectoryType.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "CompletedDate" -> CompletedDate.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationResponse]
    }
  }

  @js.native
  trait DescribeResourceRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var ResourceId: js.UndefOr[ResourceId]
  }

  object DescribeResourceRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined): DescribeResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceRequest]
    }
  }

  @js.native
  trait DescribeResourceResponse extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var ResourceId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var EnabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var BookingOptions: js.UndefOr[BookingOptions]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[ResourceType]
  }

  object DescribeResourceResponse {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined,
      BookingOptions: js.UndefOr[BookingOptions] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined,
      Type: js.UndefOr[ResourceType] = js.undefined): DescribeResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "BookingOptions" -> BookingOptions.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object DescribeUserRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      UserId: js.UndefOr[WorkMailIdentifier] = js.undefined): DescribeUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Name: js.UndefOr[UserName]
    var EnabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var UserRole: js.UndefOr[UserRole]
    var UserId: js.UndefOr[WorkMailIdentifier]
    var State: js.UndefOr[EntityState]
    var DisplayName: js.UndefOr[String]
  }

  object DescribeUserResponse {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[UserName] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined,
      UserRole: js.UndefOr[UserRole] = js.undefined,
      UserId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined): DescribeUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "UserRole" -> UserRole.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserResponse]
    }
  }

  /**
   * <p>The Directory Service doesn't recognize the credentials supplied by the Amazon WorkMail service.</p>
   */
  @js.native
  trait DirectoryServiceAuthenticationFailedExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The directory that you are trying to perform operations on isn't available.</p>
   */
  @js.native
  trait DirectoryUnavailableExceptionException extends js.Object {
    val Message: String
  }

  @js.native
  trait DisassociateDelegateFromResourceRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var ResourceId: js.UndefOr[ResourceId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
  }

  object DisassociateDelegateFromResourceRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined): DisassociateDelegateFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDelegateFromResourceRequest]
    }
  }

  @js.native
  trait DisassociateDelegateFromResourceResponse extends js.Object {

  }

  object DisassociateDelegateFromResourceResponse {
    def apply(): DisassociateDelegateFromResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDelegateFromResourceResponse]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var GroupId: js.UndefOr[WorkMailIdentifier]
    var MemberId: js.UndefOr[WorkMailIdentifier]
  }

  object DisassociateMemberFromGroupRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      MemberId: js.UndefOr[WorkMailIdentifier] = js.undefined): DisassociateMemberFromGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "MemberId" -> MemberId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMemberFromGroupRequest]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupResponse extends js.Object {

  }

  object DisassociateMemberFromGroupResponse {
    def apply(): DisassociateMemberFromGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMemberFromGroupResponse]
    }
  }

  /**
   * <p>The email address that you're trying to assign is already created for a different user, group, or resource.</p>
   */
  @js.native
  trait EmailAddressInUseExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The user, group, or resource that you're trying to register is already registered.</p>
   */
  @js.native
  trait EntityAlreadyRegisteredExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The identifier supplied for the entity is valid, but it does not exist in your organization.</p>
   */
  @js.native
  trait EntityNotFoundExceptionException extends js.Object {
    val Message: String
  }

  object EntityStateEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"
    val DELETED = "DELETED"

    val values = IndexedSeq(ENABLED, DISABLED, DELETED)
  }

  /**
   * <p>You are performing an operation on an entity that isn't in the expected state, such as trying to update a deleted user.</p>
   */
  @js.native
  trait EntityStateExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The representation of an Amazon WorkMail group.</p>
   */
  @js.native
  trait Group extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[GroupName]
    var EnabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var State: js.UndefOr[EntityState]
  }

  object Group {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Name: js.UndefOr[GroupName] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
   * <p>The configuration for a resource isn't valid. A resource must either be able to auto-respond to requests or have at least one delegate associated that can do it on its behalf.</p>
   */
  @js.native
  trait InvalidConfigurationExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>One or more of the input parameters don't match the service's restrictions.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The supplied password doesn't match the minimum security constraints, such as length or use of special characters.</p>
   */
  @js.native
  trait InvalidPasswordExceptionException extends js.Object {
    val Message: String
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListAliasesRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesResponse]
    }
  }

  @js.native
  trait ListGroupMembersRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var GroupId: js.UndefOr[WorkMailIdentifier]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListGroupMembersRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListGroupMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListGroupMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Members" -> Members.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupMembersResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListGroupsRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListMailboxPermissionsRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListMailboxPermissionsRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListMailboxPermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMailboxPermissionsRequest]
    }
  }

  @js.native
  trait ListMailboxPermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[Permissions]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMailboxPermissionsResponse {
    def apply(
      Permissions: js.UndefOr[Permissions] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListMailboxPermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Permissions" -> Permissions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMailboxPermissionsResponse]
    }
  }

  @js.native
  trait ListOrganizationsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListOrganizationsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListOrganizationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationsRequest]
    }
  }

  @js.native
  trait ListOrganizationsResponse extends js.Object {
    var OrganizationSummaries: js.UndefOr[OrganizationSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationsResponse {
    def apply(
      OrganizationSummaries: js.UndefOr[OrganizationSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListOrganizationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationSummaries" -> OrganizationSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationsResponse]
    }
  }

  @js.native
  trait ListResourceDelegatesRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var ResourceId: js.UndefOr[WorkMailIdentifier]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListResourceDelegatesRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      ResourceId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListResourceDelegatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResourceDelegatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Delegates" -> Delegates.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDelegatesResponse]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListResourcesRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var Resources: js.UndefOr[Resources]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourcesResponse {
    def apply(
      Resources: js.UndefOr[Resources] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListUsersRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: js.UndefOr[Users]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersResponse {
    def apply(
      Users: js.UndefOr[Users] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  /**
   * <p>For an email or alias to be created in Amazon WorkMail, the included domain must be defined in the organization.</p>
   */
  @js.native
  trait MailDomainNotFoundExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>After a domain has been added to the organization, it must be verified. The domain is not yet verified.</p>
   */
  @js.native
  trait MailDomainStateExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The representation of a group member (user or group).</p>
   */
  @js.native
  trait Member extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var EnabledDate: js.UndefOr[Timestamp]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[MemberType]
  }

  object Member {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined,
      Type: js.UndefOr[MemberType] = js.undefined): Member = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Member]
    }
  }

  object MemberTypeEnum {
    val GROUP = "GROUP"
    val USER = "USER"

    val values = IndexedSeq(GROUP, USER)
  }

  /**
   * <p>The entity (user, group, or user) name isn't unique in Amazon WorkMail.</p>
   */
  @js.native
  trait NameAvailabilityExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>An operation received a valid organization identifier that either doesn't belong or exist in the system.</p>
   */
  @js.native
  trait OrganizationNotFoundExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The organization must have a valid state (Active or Synchronizing) to perform certain operations on the organization or its entities.</p>
   */
  @js.native
  trait OrganizationStateExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>The brief overview associated with an organization.</p>
   */
  @js.native
  trait OrganizationSummary extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var Alias: js.UndefOr[OrganizationName]
    var ErrorMessage: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  object OrganizationSummary {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      Alias: js.UndefOr[OrganizationName] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined): OrganizationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationSummary]
    }
  }

  /**
   * <p>Permission granted to an entity (user, group) to access a certain aspect of another entity's mailbox.</p>
   */
  @js.native
  trait Permission extends js.Object {
    var GranteeId: js.UndefOr[WorkMailIdentifier]
    var GranteeType: js.UndefOr[MemberType]
    var PermissionValues: js.UndefOr[PermissionValues]
  }

  object Permission {
    def apply(
      GranteeId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      GranteeType: js.UndefOr[MemberType] = js.undefined,
      PermissionValues: js.UndefOr[PermissionValues] = js.undefined): Permission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GranteeId" -> GranteeId.map { x => x.asInstanceOf[js.Any] },
        "GranteeType" -> GranteeType.map { x => x.asInstanceOf[js.Any] },
        "PermissionValues" -> PermissionValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Permission]
    }
  }

  object PermissionTypeEnum {
    val FULL_ACCESS = "FULL_ACCESS"
    val SEND_AS = "SEND_AS"
    val SEND_ON_BEHALF = "SEND_ON_BEHALF"

    val values = IndexedSeq(FULL_ACCESS, SEND_AS, SEND_ON_BEHALF)
  }

  @js.native
  trait PutMailboxPermissionsRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var GranteeId: js.UndefOr[WorkMailIdentifier]
    var PermissionValues: js.UndefOr[PermissionValues]
  }

  object PutMailboxPermissionsRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      GranteeId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      PermissionValues: js.UndefOr[PermissionValues] = js.undefined): PutMailboxPermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "GranteeId" -> GranteeId.map { x => x.asInstanceOf[js.Any] },
        "PermissionValues" -> PermissionValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMailboxPermissionsRequest]
    }
  }

  @js.native
  trait PutMailboxPermissionsResponse extends js.Object {

  }

  object PutMailboxPermissionsResponse {
    def apply(): PutMailboxPermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMailboxPermissionsResponse]
    }
  }

  @js.native
  trait RegisterToWorkMailRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var Email: js.UndefOr[EmailAddress]
  }

  object RegisterToWorkMailRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined): RegisterToWorkMailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterToWorkMailRequest]
    }
  }

  @js.native
  trait RegisterToWorkMailResponse extends js.Object {

  }

  object RegisterToWorkMailResponse {
    def apply(): RegisterToWorkMailResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterToWorkMailResponse]
    }
  }

  /**
   * <p>This entity name is not allowed in Amazon WorkMail.</p>
   */
  @js.native
  trait ReservedNameExceptionException extends js.Object {
    val Message: String
  }

  @js.native
  trait ResetPasswordRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var UserId: js.UndefOr[WorkMailIdentifier]
    var Password: js.UndefOr[Password]
  }

  object ResetPasswordRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      UserId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined): ResetPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPasswordRequest]
    }
  }

  @js.native
  trait ResetPasswordResponse extends js.Object {

  }

  object ResetPasswordResponse {
    def apply(): ResetPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPasswordResponse]
    }
  }

  /**
   * <p>The overview for a resource containing relevant data regarding it.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[ResourceName]
    var EnabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[ResourceType]
  }

  object Resource {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined,
      Type: js.UndefOr[ResourceType] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  object ResourceTypeEnum {
    val ROOM = "ROOM"
    val EQUIPMENT = "EQUIPMENT"

    val values = IndexedSeq(ROOM, EQUIPMENT)
  }

  /**
   * <p>You can't perform a write operation against a read-only directory.</p>
   */
  @js.native
  trait UnsupportedOperationExceptionException extends js.Object {
    val Message: String
  }

  @js.native
  trait UpdatePrimaryEmailAddressRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var Email: js.UndefOr[EmailAddress]
  }

  object UpdatePrimaryEmailAddressRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined): UpdatePrimaryEmailAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "EntityId" -> EntityId.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePrimaryEmailAddressRequest]
    }
  }

  @js.native
  trait UpdatePrimaryEmailAddressResponse extends js.Object {

  }

  object UpdatePrimaryEmailAddressResponse {
    def apply(): UpdatePrimaryEmailAddressResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePrimaryEmailAddressResponse]
    }
  }

  @js.native
  trait UpdateResourceRequest extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var ResourceId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var BookingOptions: js.UndefOr[BookingOptions]
  }

  object UpdateResourceRequest {
    def apply(
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      BookingOptions: js.UndefOr[BookingOptions] = js.undefined): UpdateResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "BookingOptions" -> BookingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceRequest]
    }
  }

  @js.native
  trait UpdateResourceResponse extends js.Object {

  }

  object UpdateResourceResponse {
    def apply(): UpdateResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceResponse]
    }
  }

  /**
   * <p>The representation of an Amazon WorkMail user.</p>
   */
  @js.native
  trait User extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[UserName]
    var EnabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var UserRole: js.UndefOr[UserRole]
    var State: js.UndefOr[EntityState]
    var DisplayName: js.UndefOr[String]
  }

  object User {
    def apply(
      DisabledDate: js.UndefOr[Timestamp] = js.undefined,
      Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
      Name: js.UndefOr[UserName] = js.undefined,
      EnabledDate: js.UndefOr[Timestamp] = js.undefined,
      Email: js.UndefOr[EmailAddress] = js.undefined,
      UserRole: js.UndefOr[UserRole] = js.undefined,
      State: js.UndefOr[EntityState] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisabledDate" -> DisabledDate.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EnabledDate" -> EnabledDate.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "UserRole" -> UserRole.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  object UserRoleEnum {
    val USER = "USER"
    val RESOURCE = "RESOURCE"
    val SYSTEM_USER = "SYSTEM_USER"

    val values = IndexedSeq(USER, RESOURCE, SYSTEM_USER)
  }
}
