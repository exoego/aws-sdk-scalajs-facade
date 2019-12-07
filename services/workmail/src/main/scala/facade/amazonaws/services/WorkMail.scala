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
  type MailboxQuota          = Int
  type MailboxSize           = Double
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

  implicit final class WorkMailOps(private val service: WorkMail) extends AnyVal {
    @inline def associateDelegateToResourceFuture(
        params: AssociateDelegateToResourceRequest
    ): Future[AssociateDelegateToResourceResponse] = service.associateDelegateToResource(params).promise.toFuture
    @inline def associateMemberToGroupFuture(
        params: AssociateMemberToGroupRequest
    ): Future[AssociateMemberToGroupResponse] = service.associateMemberToGroup(params).promise.toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[CreateAliasResponse] =
      service.createAlias(params).promise.toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise.toFuture
    @inline def createResourceFuture(params: CreateResourceRequest): Future[CreateResourceResponse] =
      service.createResource(params).promise.toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    @inline def deleteAliasFuture(params: DeleteAliasRequest): Future[DeleteAliasResponse] =
      service.deleteAlias(params).promise.toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] =
      service.deleteGroup(params).promise.toFuture
    @inline def deleteMailboxPermissionsFuture(
        params: DeleteMailboxPermissionsRequest
    ): Future[DeleteMailboxPermissionsResponse] = service.deleteMailboxPermissions(params).promise.toFuture
    @inline def deleteResourceFuture(params: DeleteResourceRequest): Future[DeleteResourceResponse] =
      service.deleteResource(params).promise.toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise.toFuture
    @inline def deregisterFromWorkMailFuture(
        params: DeregisterFromWorkMailRequest
    ): Future[DeregisterFromWorkMailResponse] = service.deregisterFromWorkMail(params).promise.toFuture
    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] =
      service.describeGroup(params).promise.toFuture
    @inline def describeOrganizationFuture(params: DescribeOrganizationRequest): Future[DescribeOrganizationResponse] =
      service.describeOrganization(params).promise.toFuture
    @inline def describeResourceFuture(params: DescribeResourceRequest): Future[DescribeResourceResponse] =
      service.describeResource(params).promise.toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise.toFuture
    @inline def disassociateDelegateFromResourceFuture(
        params: DisassociateDelegateFromResourceRequest
    ): Future[DisassociateDelegateFromResourceResponse] =
      service.disassociateDelegateFromResource(params).promise.toFuture
    @inline def disassociateMemberFromGroupFuture(
        params: DisassociateMemberFromGroupRequest
    ): Future[DisassociateMemberFromGroupResponse] = service.disassociateMemberFromGroup(params).promise.toFuture
    @inline def getMailboxDetailsFuture(params: GetMailboxDetailsRequest): Future[GetMailboxDetailsResponse] =
      service.getMailboxDetails(params).promise.toFuture
    @inline def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise.toFuture
    @inline def listGroupMembersFuture(params: ListGroupMembersRequest): Future[ListGroupMembersResponse] =
      service.listGroupMembers(params).promise.toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise.toFuture
    @inline def listMailboxPermissionsFuture(
        params: ListMailboxPermissionsRequest
    ): Future[ListMailboxPermissionsResponse] = service.listMailboxPermissions(params).promise.toFuture
    @inline def listOrganizationsFuture(params: ListOrganizationsRequest): Future[ListOrganizationsResponse] =
      service.listOrganizations(params).promise.toFuture
    @inline def listResourceDelegatesFuture(
        params: ListResourceDelegatesRequest
    ): Future[ListResourceDelegatesResponse] = service.listResourceDelegates(params).promise.toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise.toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    @inline def putMailboxPermissionsFuture(
        params: PutMailboxPermissionsRequest
    ): Future[PutMailboxPermissionsResponse] = service.putMailboxPermissions(params).promise.toFuture
    @inline def registerToWorkMailFuture(params: RegisterToWorkMailRequest): Future[RegisterToWorkMailResponse] =
      service.registerToWorkMail(params).promise.toFuture
    @inline def resetPasswordFuture(params: ResetPasswordRequest): Future[ResetPasswordResponse] =
      service.resetPassword(params).promise.toFuture
    @inline def updateMailboxQuotaFuture(params: UpdateMailboxQuotaRequest): Future[UpdateMailboxQuotaResponse] =
      service.updateMailboxQuota(params).promise.toFuture
    @inline def updatePrimaryEmailAddressFuture(
        params: UpdatePrimaryEmailAddressRequest
    ): Future[UpdatePrimaryEmailAddressResponse] = service.updatePrimaryEmailAddress(params).promise.toFuture
    @inline def updateResourceFuture(params: UpdateResourceRequest): Future[UpdateResourceResponse] =
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
    ): Request[DisassociateMemberFromGroupResponse]                                             = js.native
    def getMailboxDetails(params: GetMailboxDetailsRequest): Request[GetMailboxDetailsResponse] = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse]                   = js.native
    def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse]    = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                      = js.native
    def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse] =
      js.native
    def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse]             = js.native
    def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse]                         = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse] = js.native
    def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse]          = js.native
    def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse]                         = js.native
    def updateMailboxQuota(params: UpdateMailboxQuotaRequest): Request[UpdateMailboxQuotaResponse]          = js.native
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
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): AssociateDelegateToResourceRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDelegateToResourceRequest]
    }
  }

  @js.native
  trait AssociateDelegateToResourceResponse extends js.Object {}

  object AssociateDelegateToResourceResponse {
    @inline
    def apply(
        ): AssociateDelegateToResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDelegateToResourceResponse]
    }
  }

  @js.native
  trait AssociateMemberToGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var MemberId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object AssociateMemberToGroupRequest {
    @inline
    def apply(
        GroupId: WorkMailIdentifier,
        MemberId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): AssociateMemberToGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "MemberId"       -> MemberId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateMemberToGroupRequest]
    }
  }

  @js.native
  trait AssociateMemberToGroupResponse extends js.Object {}

  object AssociateMemberToGroupResponse {
    @inline
    def apply(
        ): AssociateMemberToGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateMemberToGroupResponse]
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
    @inline
    def apply(
        AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined,
        AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined,
        AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined
    ): BookingOptions = {
      val __obj = js.Dynamic.literal()
      AutoAcceptRequests.foreach(__v => __obj.updateDynamic("AutoAcceptRequests")(__v.asInstanceOf[js.Any]))
      AutoDeclineConflictingRequests.foreach(__v =>
        __obj.updateDynamic("AutoDeclineConflictingRequests")(__v.asInstanceOf[js.Any])
      )
      AutoDeclineRecurringRequests.foreach(__v =>
        __obj.updateDynamic("AutoDeclineRecurringRequests")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BookingOptions]
    }
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var Alias: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object CreateAliasRequest {
    @inline
    def apply(
        Alias: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): CreateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "Alias"          -> Alias.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateAliasResponse extends js.Object {}

  object CreateAliasResponse {
    @inline
    def apply(
        ): CreateAliasResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateAliasResponse]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var Name: GroupName
    var OrganizationId: OrganizationId
  }

  object CreateGroupRequest {
    @inline
    def apply(
        Name: GroupName,
        OrganizationId: OrganizationId
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name"           -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var GroupId: js.UndefOr[WorkMailIdentifier]
  }

  object CreateGroupResponse {
    @inline
    def apply(
        GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateResourceRequest extends js.Object {
    var Name: ResourceName
    var OrganizationId: OrganizationId
    var Type: ResourceType
  }

  object CreateResourceRequest {
    @inline
    def apply(
        Name: ResourceName,
        OrganizationId: OrganizationId,
        Type: ResourceType
    ): CreateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Name"           -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Type"           -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateResourceRequest]
    }
  }

  @js.native
  trait CreateResourceResponse extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
  }

  object CreateResourceResponse {
    @inline
    def apply(
        ResourceId: js.UndefOr[ResourceId] = js.undefined
    ): CreateResourceResponse = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceResponse]
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
    @inline
    def apply(
        DisplayName: String,
        Name: UserName,
        OrganizationId: OrganizationId,
        Password: Password
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "DisplayName"    -> DisplayName.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Password"       -> Password.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object CreateUserResponse {
    @inline
    def apply(
        UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
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
    @inline
    def apply(
        Id: String,
        Type: MemberType
    ): Delegate = {
      val __obj = js.Dynamic.literal(
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Delegate]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var Alias: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeleteAliasRequest {
    @inline
    def apply(
        Alias: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeleteAliasRequest = {
      val __obj = js.Dynamic.literal(
        "Alias"          -> Alias.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteAliasResponse extends js.Object {}

  object DeleteAliasResponse {
    @inline
    def apply(
        ): DeleteAliasResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteAliasResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        GroupId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {}

  object DeleteGroupResponse {
    @inline
    def apply(
        ): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var GranteeId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeleteMailboxPermissionsRequest {
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        GranteeId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeleteMailboxPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "GranteeId"      -> GranteeId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMailboxPermissionsRequest]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsResponse extends js.Object {}

  object DeleteMailboxPermissionsResponse {
    @inline
    def apply(
        ): DeleteMailboxPermissionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteMailboxPermissionsResponse]
    }
  }

  @js.native
  trait DeleteResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object DeleteResourceRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): DeleteResourceRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResourceRequest]
    }
  }

  @js.native
  trait DeleteResourceResponse extends js.Object {}

  object DeleteResourceResponse {
    @inline
    def apply(
        ): DeleteResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteResourceResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  object DeleteUserRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        UserId: WorkMailIdentifier
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {}

  object DeleteUserResponse {
    @inline
    def apply(
        ): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DeregisterFromWorkMailRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DeregisterFromWorkMailRequest {
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DeregisterFromWorkMailRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterFromWorkMailRequest]
    }
  }

  @js.native
  trait DeregisterFromWorkMailResponse extends js.Object {}

  object DeregisterFromWorkMailResponse {
    @inline
    def apply(
        ): DeregisterFromWorkMailResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterFromWorkMailResponse]
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DescribeGroupRequest {
    @inline
    def apply(
        GroupId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DescribeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeGroupRequest]
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
    @inline
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[GroupName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined
    ): DescribeGroupResponse = {
      val __obj = js.Dynamic.literal()
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeOrganizationRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object DescribeOrganizationRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): DescribeOrganizationRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeOrganizationRequest]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      CompletedDate.foreach(__v => __obj.updateDynamic("CompletedDate")(__v.asInstanceOf[js.Any]))
      DefaultMailDomain.foreach(__v => __obj.updateDynamic("DefaultMailDomain")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      DirectoryType.foreach(__v => __obj.updateDynamic("DirectoryType")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationResponse]
    }
  }

  @js.native
  trait DescribeResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object DescribeResourceRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): DescribeResourceRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeResourceRequest]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      BookingOptions.foreach(__v => __obj.updateDynamic("BookingOptions")(__v.asInstanceOf[js.Any]))
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourceResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  object DescribeUserRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        UserId: WorkMailIdentifier
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserRequest]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      UserRole.foreach(__v => __obj.updateDynamic("UserRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  @js.native
  trait DisassociateDelegateFromResourceRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  object DisassociateDelegateFromResourceRequest {
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        ResourceId: ResourceId
    ): DisassociateDelegateFromResourceRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateDelegateFromResourceRequest]
    }
  }

  @js.native
  trait DisassociateDelegateFromResourceResponse extends js.Object {}

  object DisassociateDelegateFromResourceResponse {
    @inline
    def apply(
        ): DisassociateDelegateFromResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDelegateFromResourceResponse]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var MemberId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object DisassociateMemberFromGroupRequest {
    @inline
    def apply(
        GroupId: WorkMailIdentifier,
        MemberId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): DisassociateMemberFromGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "MemberId"       -> MemberId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateMemberFromGroupRequest]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupResponse extends js.Object {}

  object DisassociateMemberFromGroupResponse {
    @inline
    def apply(
        ): DisassociateMemberFromGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateMemberFromGroupResponse]
    }
  }

  object EntityStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"
    val DELETED  = "DELETED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED, DELETED))
  }

  @js.native
  trait GetMailboxDetailsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  object GetMailboxDetailsRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        UserId: WorkMailIdentifier
    ): GetMailboxDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMailboxDetailsRequest]
    }
  }

  @js.native
  trait GetMailboxDetailsResponse extends js.Object {
    var MailboxQuota: js.UndefOr[MailboxQuota]
    var MailboxSize: js.UndefOr[MailboxSize]
  }

  object GetMailboxDetailsResponse {
    @inline
    def apply(
        MailboxQuota: js.UndefOr[MailboxQuota] = js.undefined,
        MailboxSize: js.UndefOr[MailboxSize] = js.undefined
    ): GetMailboxDetailsResponse = {
      val __obj = js.Dynamic.literal()
      MailboxQuota.foreach(__v => __obj.updateDynamic("MailboxQuota")(__v.asInstanceOf[js.Any]))
      MailboxSize.foreach(__v => __obj.updateDynamic("MailboxSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMailboxDetailsResponse]
    }
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
    @inline
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[GroupName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
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
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[Aliases]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAliasesResponse {
    @inline
    def apply(
        Aliases: js.UndefOr[Aliases] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAliasesResponse = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesResponse]
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
    @inline
    def apply(
        GroupId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembersRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembersRequest]
    }
  }

  @js.native
  trait ListGroupMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembersResponse {
    @inline
    def apply(
        Members: js.UndefOr[Members] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembersResponse = {
      val __obj = js.Dynamic.literal()
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembersResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[Groups]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        Groups: js.UndefOr[Groups] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
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
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMailboxPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMailboxPermissionsRequest]
    }
  }

  @js.native
  trait ListMailboxPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[Permissions]
  }

  object ListMailboxPermissionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Permissions: js.UndefOr[Permissions] = js.undefined
    ): ListMailboxPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMailboxPermissionsResponse]
    }
  }

  @js.native
  trait ListOrganizationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationsRequest]
    }
  }

  @js.native
  trait ListOrganizationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationSummaries: js.UndefOr[OrganizationSummaries]
  }

  object ListOrganizationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OrganizationSummaries: js.UndefOr[OrganizationSummaries] = js.undefined
    ): ListOrganizationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationSummaries.foreach(__v => __obj.updateDynamic("OrganizationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationsResponse]
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
    @inline
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: WorkMailIdentifier,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceDelegatesRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDelegatesRequest]
    }
  }

  @js.native
  trait ListResourceDelegatesResponse extends js.Object {
    var Delegates: js.UndefOr[ResourceDelegates]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceDelegatesResponse {
    @inline
    def apply(
        Delegates: js.UndefOr[ResourceDelegates] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceDelegatesResponse = {
      val __obj = js.Dynamic.literal()
      Delegates.foreach(__v => __obj.updateDynamic("Delegates")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDelegatesResponse]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourcesRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Resources: js.UndefOr[Resources]
  }

  object ListResourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Resources: js.UndefOr[Resources] = js.undefined
    ): ListResourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Users: js.UndefOr[Users]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Users: js.UndefOr[Users] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
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
    @inline
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        Type: js.UndefOr[MemberType] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  object MemberTypeEnum {
    val GROUP = "GROUP"
    val USER  = "USER"

    val values = js.Object.freeze(js.Array(GROUP, USER))
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
    @inline
    def apply(
        Alias: js.UndefOr[OrganizationName] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): OrganizationSummary = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationSummary]
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
    @inline
    def apply(
        GranteeId: WorkMailIdentifier,
        GranteeType: MemberType,
        PermissionValues: PermissionValues
    ): Permission = {
      val __obj = js.Dynamic.literal(
        "GranteeId"        -> GranteeId.asInstanceOf[js.Any],
        "GranteeType"      -> GranteeType.asInstanceOf[js.Any],
        "PermissionValues" -> PermissionValues.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Permission]
    }
  }

  object PermissionTypeEnum {
    val FULL_ACCESS    = "FULL_ACCESS"
    val SEND_AS        = "SEND_AS"
    val SEND_ON_BEHALF = "SEND_ON_BEHALF"

    val values = js.Object.freeze(js.Array(FULL_ACCESS, SEND_AS, SEND_ON_BEHALF))
  }

  @js.native
  trait PutMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var GranteeId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var PermissionValues: PermissionValues
  }

  object PutMailboxPermissionsRequest {
    @inline
    def apply(
        EntityId: WorkMailIdentifier,
        GranteeId: WorkMailIdentifier,
        OrganizationId: OrganizationId,
        PermissionValues: PermissionValues
    ): PutMailboxPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "EntityId"         -> EntityId.asInstanceOf[js.Any],
        "GranteeId"        -> GranteeId.asInstanceOf[js.Any],
        "OrganizationId"   -> OrganizationId.asInstanceOf[js.Any],
        "PermissionValues" -> PermissionValues.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutMailboxPermissionsRequest]
    }
  }

  @js.native
  trait PutMailboxPermissionsResponse extends js.Object {}

  object PutMailboxPermissionsResponse {
    @inline
    def apply(
        ): PutMailboxPermissionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutMailboxPermissionsResponse]
    }
  }

  @js.native
  trait RegisterToWorkMailRequest extends js.Object {
    var Email: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object RegisterToWorkMailRequest {
    @inline
    def apply(
        Email: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): RegisterToWorkMailRequest = {
      val __obj = js.Dynamic.literal(
        "Email"          -> Email.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterToWorkMailRequest]
    }
  }

  @js.native
  trait RegisterToWorkMailResponse extends js.Object {}

  object RegisterToWorkMailResponse {
    @inline
    def apply(
        ): RegisterToWorkMailResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RegisterToWorkMailResponse]
    }
  }

  @js.native
  trait ResetPasswordRequest extends js.Object {
    var OrganizationId: OrganizationId
    var Password: Password
    var UserId: WorkMailIdentifier
  }

  object ResetPasswordRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        Password: Password,
        UserId: WorkMailIdentifier
    ): ResetPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Password"       -> Password.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetPasswordRequest]
    }
  }

  @js.native
  trait ResetPasswordResponse extends js.Object {}

  object ResetPasswordResponse {
    @inline
    def apply(
        ): ResetPasswordResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ResetPasswordResponse]
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
    @inline
    def apply(
        DisabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        EnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[WorkMailIdentifier] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        State: js.UndefOr[EntityState] = js.undefined,
        Type: js.UndefOr[ResourceType] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  object ResourceTypeEnum {
    val ROOM      = "ROOM"
    val EQUIPMENT = "EQUIPMENT"

    val values = js.Object.freeze(js.Array(ROOM, EQUIPMENT))
  }

  @js.native
  trait UpdateMailboxQuotaRequest extends js.Object {
    var MailboxQuota: MailboxQuota
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  object UpdateMailboxQuotaRequest {
    @inline
    def apply(
        MailboxQuota: MailboxQuota,
        OrganizationId: OrganizationId,
        UserId: WorkMailIdentifier
    ): UpdateMailboxQuotaRequest = {
      val __obj = js.Dynamic.literal(
        "MailboxQuota"   -> MailboxQuota.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId"         -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateMailboxQuotaRequest]
    }
  }

  @js.native
  trait UpdateMailboxQuotaResponse extends js.Object {}

  object UpdateMailboxQuotaResponse {
    @inline
    def apply(
        ): UpdateMailboxQuotaResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateMailboxQuotaResponse]
    }
  }

  @js.native
  trait UpdatePrimaryEmailAddressRequest extends js.Object {
    var Email: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  object UpdatePrimaryEmailAddressRequest {
    @inline
    def apply(
        Email: EmailAddress,
        EntityId: WorkMailIdentifier,
        OrganizationId: OrganizationId
    ): UpdatePrimaryEmailAddressRequest = {
      val __obj = js.Dynamic.literal(
        "Email"          -> Email.asInstanceOf[js.Any],
        "EntityId"       -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePrimaryEmailAddressRequest]
    }
  }

  @js.native
  trait UpdatePrimaryEmailAddressResponse extends js.Object {}

  object UpdatePrimaryEmailAddressResponse {
    @inline
    def apply(
        ): UpdatePrimaryEmailAddressResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdatePrimaryEmailAddressResponse]
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
    @inline
    def apply(
        OrganizationId: OrganizationId,
        ResourceId: ResourceId,
        BookingOptions: js.UndefOr[BookingOptions] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): UpdateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any]
      )

      BookingOptions.foreach(__v => __obj.updateDynamic("BookingOptions")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceRequest]
    }
  }

  @js.native
  trait UpdateResourceResponse extends js.Object {}

  object UpdateResourceResponse {
    @inline
    def apply(
        ): UpdateResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateResourceResponse]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      DisabledDate.foreach(__v => __obj.updateDynamic("DisabledDate")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnabledDate.foreach(__v => __obj.updateDynamic("EnabledDate")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UserRole.foreach(__v => __obj.updateDynamic("UserRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  object UserRoleEnum {
    val USER        = "USER"
    val RESOURCE    = "RESOURCE"
    val SYSTEM_USER = "SYSTEM_USER"

    val values = js.Object.freeze(js.Array(USER, RESOURCE, SYSTEM_USER))
  }
}
