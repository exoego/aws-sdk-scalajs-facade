package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object workmail {
  type AccessControlRuleAction      = String
  type AccessControlRuleDescription = String
  type AccessControlRuleName        = String
  type AccessControlRuleNameList    = js.Array[AccessControlRuleName]
  type AccessControlRulesList       = js.Array[AccessControlRule]
  type ActionsList                  = js.Array[AccessControlRuleAction]
  type Aliases                      = js.Array[EmailAddress]
  type AmazonResourceName           = String
  type EmailAddress                 = String
  type GroupName                    = String
  type Groups                       = js.Array[Group]
  type IpAddress                    = String
  type IpRange                      = String
  type IpRangeList                  = js.Array[IpRange]
  type MailboxQuota                 = Int
  type MailboxSize                  = Double
  type MaxResults                   = Int
  type Members                      = js.Array[Member]
  type NextToken                    = String
  type OrganizationId               = String
  type OrganizationName             = String
  type OrganizationSummaries        = js.Array[OrganizationSummary]
  type Password                     = String
  type PermissionValues             = js.Array[PermissionType]
  type Permissions                  = js.Array[Permission]
  type ResourceDelegates            = js.Array[Delegate]
  type ResourceId                   = String
  type ResourceName                 = String
  type Resources                    = js.Array[Resource]
  type TagKey                       = String
  type TagKeyList                   = js.Array[TagKey]
  type TagList                      = js.Array[Tag]
  type TagValue                     = String
  type Timestamp                    = js.Date
  type UserIdList                   = js.Array[WorkMailIdentifier]
  type UserName                     = String
  type Users                        = js.Array[User]
  type WorkMailIdentifier           = String

  implicit final class WorkMailOps(private val service: WorkMail) extends AnyVal {

    @inline def associateDelegateToResourceFuture(
        params: AssociateDelegateToResourceRequest
    ): Future[AssociateDelegateToResourceResponse] = service.associateDelegateToResource(params).promise().toFuture
    @inline def associateMemberToGroupFuture(
        params: AssociateMemberToGroupRequest
    ): Future[AssociateMemberToGroupResponse] = service.associateMemberToGroup(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[CreateAliasResponse] =
      service.createAlias(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise().toFuture
    @inline def createResourceFuture(params: CreateResourceRequest): Future[CreateResourceResponse] =
      service.createResource(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def deleteAccessControlRuleFuture(
        params: DeleteAccessControlRuleRequest
    ): Future[DeleteAccessControlRuleResponse] = service.deleteAccessControlRule(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasRequest): Future[DeleteAliasResponse] =
      service.deleteAlias(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] =
      service.deleteGroup(params).promise().toFuture
    @inline def deleteMailboxPermissionsFuture(
        params: DeleteMailboxPermissionsRequest
    ): Future[DeleteMailboxPermissionsResponse] = service.deleteMailboxPermissions(params).promise().toFuture
    @inline def deleteResourceFuture(params: DeleteResourceRequest): Future[DeleteResourceResponse] =
      service.deleteResource(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise().toFuture
    @inline def deregisterFromWorkMailFuture(
        params: DeregisterFromWorkMailRequest
    ): Future[DeregisterFromWorkMailResponse] = service.deregisterFromWorkMail(params).promise().toFuture
    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] =
      service.describeGroup(params).promise().toFuture
    @inline def describeOrganizationFuture(params: DescribeOrganizationRequest): Future[DescribeOrganizationResponse] =
      service.describeOrganization(params).promise().toFuture
    @inline def describeResourceFuture(params: DescribeResourceRequest): Future[DescribeResourceResponse] =
      service.describeResource(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise().toFuture
    @inline def disassociateDelegateFromResourceFuture(
        params: DisassociateDelegateFromResourceRequest
    ): Future[DisassociateDelegateFromResourceResponse] =
      service.disassociateDelegateFromResource(params).promise().toFuture
    @inline def disassociateMemberFromGroupFuture(
        params: DisassociateMemberFromGroupRequest
    ): Future[DisassociateMemberFromGroupResponse] = service.disassociateMemberFromGroup(params).promise().toFuture
    @inline def getAccessControlEffectFuture(
        params: GetAccessControlEffectRequest
    ): Future[GetAccessControlEffectResponse] = service.getAccessControlEffect(params).promise().toFuture
    @inline def getMailboxDetailsFuture(params: GetMailboxDetailsRequest): Future[GetMailboxDetailsResponse] =
      service.getMailboxDetails(params).promise().toFuture
    @inline def listAccessControlRulesFuture(
        params: ListAccessControlRulesRequest
    ): Future[ListAccessControlRulesResponse] = service.listAccessControlRules(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise().toFuture
    @inline def listGroupMembersFuture(params: ListGroupMembersRequest): Future[ListGroupMembersResponse] =
      service.listGroupMembers(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise().toFuture
    @inline def listMailboxPermissionsFuture(
        params: ListMailboxPermissionsRequest
    ): Future[ListMailboxPermissionsResponse] = service.listMailboxPermissions(params).promise().toFuture
    @inline def listOrganizationsFuture(params: ListOrganizationsRequest): Future[ListOrganizationsResponse] =
      service.listOrganizations(params).promise().toFuture
    @inline def listResourceDelegatesFuture(
        params: ListResourceDelegatesRequest
    ): Future[ListResourceDelegatesResponse] = service.listResourceDelegates(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def putAccessControlRuleFuture(params: PutAccessControlRuleRequest): Future[PutAccessControlRuleResponse] =
      service.putAccessControlRule(params).promise().toFuture
    @inline def putMailboxPermissionsFuture(
        params: PutMailboxPermissionsRequest
    ): Future[PutMailboxPermissionsResponse] = service.putMailboxPermissions(params).promise().toFuture
    @inline def registerToWorkMailFuture(params: RegisterToWorkMailRequest): Future[RegisterToWorkMailResponse] =
      service.registerToWorkMail(params).promise().toFuture
    @inline def resetPasswordFuture(params: ResetPasswordRequest): Future[ResetPasswordResponse] =
      service.resetPassword(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateMailboxQuotaFuture(params: UpdateMailboxQuotaRequest): Future[UpdateMailboxQuotaResponse] =
      service.updateMailboxQuota(params).promise().toFuture
    @inline def updatePrimaryEmailAddressFuture(
        params: UpdatePrimaryEmailAddressRequest
    ): Future[UpdatePrimaryEmailAddressResponse] = service.updatePrimaryEmailAddress(params).promise().toFuture
    @inline def updateResourceFuture(params: UpdateResourceRequest): Future[UpdateResourceResponse] =
      service.updateResource(params).promise().toFuture
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
    def deleteAccessControlRule(params: DeleteAccessControlRuleRequest): Request[DeleteAccessControlRuleResponse] =
      js.native
    def deleteAlias(params: DeleteAliasRequest): Request[DeleteAliasResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
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
    ): Request[DisassociateMemberFromGroupResponse] = js.native
    def getAccessControlEffect(params: GetAccessControlEffectRequest): Request[GetAccessControlEffectResponse] =
      js.native
    def getMailboxDetails(params: GetMailboxDetailsRequest): Request[GetMailboxDetailsResponse] = js.native
    def listAccessControlRules(params: ListAccessControlRulesRequest): Request[ListAccessControlRulesResponse] =
      js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse]                = js.native
    def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                   = js.native
    def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse] =
      js.native
    def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse]             = js.native
    def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse]                         = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def putAccessControlRule(params: PutAccessControlRuleRequest): Request[PutAccessControlRuleResponse]    = js.native
    def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse] = js.native
    def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse]          = js.native
    def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse]                         = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateMailboxQuota(params: UpdateMailboxQuotaRequest): Request[UpdateMailboxQuotaResponse]          = js.native
    def updatePrimaryEmailAddress(
        params: UpdatePrimaryEmailAddressRequest
    ): Request[UpdatePrimaryEmailAddressResponse]                                      = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse] = js.native
  }

  /**
    * A rule that controls access to an Amazon WorkMail organization.
    */
  @js.native
  @Factory
  trait AccessControlRule extends js.Object {
    var Actions: js.UndefOr[ActionsList]
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[AccessControlRuleDescription]
    var Effect: js.UndefOr[AccessControlRuleEffect]
    var IpRanges: js.UndefOr[IpRangeList]
    var Name: js.UndefOr[AccessControlRuleName]
    var NotActions: js.UndefOr[ActionsList]
    var NotIpRanges: js.UndefOr[IpRangeList]
    var NotUserIds: js.UndefOr[UserIdList]
    var UserIds: js.UndefOr[UserIdList]
  }

  @js.native
  sealed trait AccessControlRuleEffect extends js.Any
  object AccessControlRuleEffect extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[AccessControlRuleEffect]
    val DENY  = "DENY".asInstanceOf[AccessControlRuleEffect]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  @js.native
  @Factory
  trait AssociateDelegateToResourceRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  @js.native
  @Factory
  trait AssociateDelegateToResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateMemberToGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var MemberId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait AssociateMemberToGroupResponse extends js.Object {}

  /**
    * At least one delegate must be associated to the resource to disable automatic replies from the resource.
    */
  @js.native
  @Factory
  trait BookingOptions extends js.Object {
    var AutoAcceptRequests: js.UndefOr[Boolean]
    var AutoDeclineConflictingRequests: js.UndefOr[Boolean]
    var AutoDeclineRecurringRequests: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateAliasRequest extends js.Object {
    var Alias: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait CreateAliasResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateGroupRequest extends js.Object {
    var Name: GroupName
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait CreateGroupResponse extends js.Object {
    var GroupId: js.UndefOr[WorkMailIdentifier]
  }

  @js.native
  @Factory
  trait CreateResourceRequest extends js.Object {
    var Name: ResourceName
    var OrganizationId: OrganizationId
    var Type: ResourceType
  }

  @js.native
  @Factory
  trait CreateResourceResponse extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var DisplayName: String
    var Name: UserName
    var OrganizationId: OrganizationId
    var Password: Password
  }

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  /**
    * The name of the attribute, which is one of the values defined in the UserAttribute enumeration.
    */
  @js.native
  @Factory
  trait Delegate extends js.Object {
    var Id: String
    var Type: MemberType
  }

  @js.native
  @Factory
  trait DeleteAccessControlRuleRequest extends js.Object {
    var Name: AccessControlRuleName
    var OrganizationId: js.UndefOr[OrganizationId]
  }

  @js.native
  @Factory
  trait DeleteAccessControlRuleResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteAliasRequest extends js.Object {
    var Alias: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DeleteAliasResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DeleteGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var GranteeId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DeleteMailboxPermissionsResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  @js.native
  @Factory
  trait DeleteUserResponse extends js.Object {}

  @js.native
  @Factory
  trait DeregisterFromWorkMailRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DeregisterFromWorkMailResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DescribeGroupResponse extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var GroupId: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[GroupName]
    var State: js.UndefOr[EntityState]
  }

  @js.native
  @Factory
  trait DescribeOrganizationRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DescribeOrganizationResponse extends js.Object {
    var ARN: js.UndefOr[AmazonResourceName]
    var Alias: js.UndefOr[OrganizationName]
    var CompletedDate: js.UndefOr[Timestamp]
    var DefaultMailDomain: js.UndefOr[String]
    var DirectoryId: js.UndefOr[String]
    var DirectoryType: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var OrganizationId: js.UndefOr[OrganizationId]
    var State: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeUserRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DisassociateDelegateFromResourceRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
  }

  @js.native
  @Factory
  trait DisassociateDelegateFromResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateMemberFromGroupRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var MemberId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait DisassociateMemberFromGroupResponse extends js.Object {}

  @js.native
  sealed trait EntityState extends js.Any
  object EntityState extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[EntityState]
    val DISABLED = "DISABLED".asInstanceOf[EntityState]
    val DELETED  = "DELETED".asInstanceOf[EntityState]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED, DELETED))
  }

  @js.native
  @Factory
  trait GetAccessControlEffectRequest extends js.Object {
    var Action: AccessControlRuleAction
    var IpAddress: IpAddress
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  @js.native
  @Factory
  trait GetAccessControlEffectResponse extends js.Object {
    var Effect: js.UndefOr[AccessControlRuleEffect]
    var MatchedRules: js.UndefOr[AccessControlRuleNameList]
  }

  @js.native
  @Factory
  trait GetMailboxDetailsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  @js.native
  @Factory
  trait GetMailboxDetailsResponse extends js.Object {
    var MailboxQuota: js.UndefOr[MailboxQuota]
    var MailboxSize: js.UndefOr[MailboxSize]
  }

  /**
    * The representation of an Amazon WorkMail group.
    */
  @js.native
  @Factory
  trait Group extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[GroupName]
    var State: js.UndefOr[EntityState]
  }

  @js.native
  @Factory
  trait ListAccessControlRulesRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait ListAccessControlRulesResponse extends js.Object {
    var Rules: js.UndefOr[AccessControlRulesList]
  }

  @js.native
  @Factory
  trait ListAliasesRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[Aliases]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGroupMembersRequest extends js.Object {
    var GroupId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGroupMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGroupsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[Groups]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMailboxPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[Permissions]
  }

  @js.native
  @Factory
  trait ListOrganizationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOrganizationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationSummaries: js.UndefOr[OrganizationSummaries]
  }

  @js.native
  @Factory
  trait ListResourceDelegatesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: WorkMailIdentifier
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResourceDelegatesResponse extends js.Object {
    var Delegates: js.UndefOr[ResourceDelegates]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResourcesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Resources: js.UndefOr[Resources]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Users: js.UndefOr[Users]
  }

  /**
    * The representation of a user or group.
    */
  @js.native
  @Factory
  trait Member extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[MemberType]
  }

  @js.native
  sealed trait MemberType extends js.Any
  object MemberType extends js.Object {
    val GROUP = "GROUP".asInstanceOf[MemberType]
    val USER  = "USER".asInstanceOf[MemberType]

    val values = js.Object.freeze(js.Array(GROUP, USER))
  }

  /**
    * The representation of an organization.
    */
  @js.native
  @Factory
  trait OrganizationSummary extends js.Object {
    var Alias: js.UndefOr[OrganizationName]
    var ErrorMessage: js.UndefOr[String]
    var OrganizationId: js.UndefOr[OrganizationId]
    var State: js.UndefOr[String]
  }

  /**
    * Permission granted to a user, group, or resource to access a certain aspect of another user, group, or resource mailbox.
    */
  @js.native
  @Factory
  trait Permission extends js.Object {
    var GranteeId: WorkMailIdentifier
    var GranteeType: MemberType
    var PermissionValues: PermissionValues
  }

  @js.native
  sealed trait PermissionType extends js.Any
  object PermissionType extends js.Object {
    val FULL_ACCESS    = "FULL_ACCESS".asInstanceOf[PermissionType]
    val SEND_AS        = "SEND_AS".asInstanceOf[PermissionType]
    val SEND_ON_BEHALF = "SEND_ON_BEHALF".asInstanceOf[PermissionType]

    val values = js.Object.freeze(js.Array(FULL_ACCESS, SEND_AS, SEND_ON_BEHALF))
  }

  @js.native
  @Factory
  trait PutAccessControlRuleRequest extends js.Object {
    var Description: AccessControlRuleDescription
    var Effect: AccessControlRuleEffect
    var Name: AccessControlRuleName
    var OrganizationId: OrganizationId
    var Actions: js.UndefOr[ActionsList]
    var IpRanges: js.UndefOr[IpRangeList]
    var NotActions: js.UndefOr[ActionsList]
    var NotIpRanges: js.UndefOr[IpRangeList]
    var NotUserIds: js.UndefOr[UserIdList]
    var UserIds: js.UndefOr[UserIdList]
  }

  @js.native
  @Factory
  trait PutAccessControlRuleResponse extends js.Object {}

  @js.native
  @Factory
  trait PutMailboxPermissionsRequest extends js.Object {
    var EntityId: WorkMailIdentifier
    var GranteeId: WorkMailIdentifier
    var OrganizationId: OrganizationId
    var PermissionValues: PermissionValues
  }

  @js.native
  @Factory
  trait PutMailboxPermissionsResponse extends js.Object {}

  @js.native
  @Factory
  trait RegisterToWorkMailRequest extends js.Object {
    var Email: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait RegisterToWorkMailResponse extends js.Object {}

  @js.native
  @Factory
  trait ResetPasswordRequest extends js.Object {
    var OrganizationId: OrganizationId
    var Password: Password
    var UserId: WorkMailIdentifier
  }

  @js.native
  @Factory
  trait ResetPasswordResponse extends js.Object {}

  /**
    * The representation of a resource.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var DisabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[EmailAddress]
    var EnabledDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[WorkMailIdentifier]
    var Name: js.UndefOr[ResourceName]
    var State: js.UndefOr[EntityState]
    var Type: js.UndefOr[ResourceType]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val ROOM      = "ROOM".asInstanceOf[ResourceType]
    val EQUIPMENT = "EQUIPMENT".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(ROOM, EQUIPMENT))
  }

  /**
    * Describes a tag applied to a resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateMailboxQuotaRequest extends js.Object {
    var MailboxQuota: MailboxQuota
    var OrganizationId: OrganizationId
    var UserId: WorkMailIdentifier
  }

  @js.native
  @Factory
  trait UpdateMailboxQuotaResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdatePrimaryEmailAddressRequest extends js.Object {
    var Email: EmailAddress
    var EntityId: WorkMailIdentifier
    var OrganizationId: OrganizationId
  }

  @js.native
  @Factory
  trait UpdatePrimaryEmailAddressResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateResourceRequest extends js.Object {
    var OrganizationId: OrganizationId
    var ResourceId: ResourceId
    var BookingOptions: js.UndefOr[BookingOptions]
    var Name: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait UpdateResourceResponse extends js.Object {}

  /**
    * The representation of an Amazon WorkMail user.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait UserRole extends js.Any
  object UserRole extends js.Object {
    val USER        = "USER".asInstanceOf[UserRole]
    val RESOURCE    = "RESOURCE".asInstanceOf[UserRole]
    val SYSTEM_USER = "SYSTEM_USER".asInstanceOf[UserRole]

    val values = js.Object.freeze(js.Array(USER, RESOURCE, SYSTEM_USER))
  }
}
