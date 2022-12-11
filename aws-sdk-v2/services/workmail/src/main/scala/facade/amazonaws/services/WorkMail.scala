package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object workmail {
  type AccessControlRuleAction = String
  type AccessControlRuleDescription = String
  type AccessControlRuleName = String
  type AccessControlRuleNameList = js.Array[AccessControlRuleName]
  type AccessControlRulesList = js.Array[AccessControlRule]
  type ActionsList = js.Array[AccessControlRuleAction]
  type Aliases = js.Array[EmailAddress]
  type AmazonResourceName = String
  type AvailabilityConfigurationList = js.Array[AvailabilityConfiguration]
  type BooleanObject = Boolean
  type Description = String
  type DeviceId = String
  type DeviceModel = String
  type DeviceModelList = js.Array[DeviceModel]
  type DeviceOperatingSystem = String
  type DeviceOperatingSystemList = js.Array[DeviceOperatingSystem]
  type DeviceType = String
  type DeviceTypeList = js.Array[DeviceType]
  type DeviceUserAgent = String
  type DeviceUserAgentList = js.Array[DeviceUserAgent]
  type DirectoryId = String
  type DnsRecords = js.Array[DnsRecord]
  type DomainName = String
  type Domains = js.Array[Domain]
  type EmailAddress = String
  type EntityIdentifier = String
  type ExpiresIn = Double
  type ExternalUserName = String
  type FolderConfigurations = js.Array[FolderConfiguration]
  type GroupName = String
  type Groups = js.Array[Group]
  type HostedZoneId = String
  type IdempotencyClientToken = String
  type ImpersonationMatchedRuleList = js.Array[ImpersonationMatchedRule]
  type ImpersonationRoleDescription = String
  type ImpersonationRoleId = String
  type ImpersonationRoleIdList = js.Array[ImpersonationRoleId]
  type ImpersonationRoleList = js.Array[ImpersonationRole]
  type ImpersonationRoleName = String
  type ImpersonationRuleDescription = String
  type ImpersonationRuleId = String
  type ImpersonationRuleList = js.Array[ImpersonationRule]
  type ImpersonationRuleName = String
  type ImpersonationToken = String
  type IpAddress = String
  type IpRange = String
  type IpRangeList = js.Array[IpRange]
  type Jobs = js.Array[MailboxExportJob]
  type KmsKeyArn = String
  type LambdaArn = String
  type LogGroupArn = String
  type MailDomains = js.Array[MailDomainSummary]
  type MailboxExportErrorInfo = String
  type MailboxExportJobId = String
  type MailboxQuota = Int
  type MailboxSize = Double
  type MaxResults = Int
  type Members = js.Array[Member]
  type MobileDeviceAccessMatchedRuleList = js.Array[MobileDeviceAccessMatchedRule]
  type MobileDeviceAccessOverridesList = js.Array[MobileDeviceAccessOverride]
  type MobileDeviceAccessRuleDescription = String
  type MobileDeviceAccessRuleId = String
  type MobileDeviceAccessRuleName = String
  type MobileDeviceAccessRulesList = js.Array[MobileDeviceAccessRule]
  type NextToken = String
  type OrganizationId = String
  type OrganizationName = String
  type OrganizationSummaries = js.Array[OrganizationSummary]
  type Password = String
  type Percentage = Int
  type PermissionValues = js.Array[PermissionType]
  type Permissions = js.Array[Permission]
  type PolicyDescription = String
  type ResourceDelegates = js.Array[Delegate]
  type ResourceId = String
  type ResourceName = String
  type Resources = js.Array[Resource]
  type RetentionPeriod = Int
  type RoleArn = String
  type S3BucketName = String
  type S3ObjectKey = String
  type ShortString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetUsers = js.Array[EntityIdentifier]
  type Timestamp = js.Date
  type Url = String
  type UserIdList = js.Array[WorkMailIdentifier]
  type UserName = String
  type Users = js.Array[User]
  type WorkMailDomainName = String
  type WorkMailIdentifier = String

  final class WorkMailOps(private val service: WorkMail) extends AnyVal {

    @inline def associateDelegateToResourceFuture(params: AssociateDelegateToResourceRequest): Future[AssociateDelegateToResourceResponse] = service.associateDelegateToResource(params).promise().toFuture
    @inline def associateMemberToGroupFuture(params: AssociateMemberToGroupRequest): Future[AssociateMemberToGroupResponse] = service.associateMemberToGroup(params).promise().toFuture
    @inline def assumeImpersonationRoleFuture(params: AssumeImpersonationRoleRequest): Future[AssumeImpersonationRoleResponse] = service.assumeImpersonationRole(params).promise().toFuture
    @inline def cancelMailboxExportJobFuture(params: CancelMailboxExportJobRequest): Future[CancelMailboxExportJobResponse] = service.cancelMailboxExportJob(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[CreateAliasResponse] = service.createAlias(params).promise().toFuture
    @inline def createAvailabilityConfigurationFuture(params: CreateAvailabilityConfigurationRequest): Future[CreateAvailabilityConfigurationResponse] = service.createAvailabilityConfiguration(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] = service.createGroup(params).promise().toFuture
    @inline def createImpersonationRoleFuture(params: CreateImpersonationRoleRequest): Future[CreateImpersonationRoleResponse] = service.createImpersonationRole(params).promise().toFuture
    @inline def createMobileDeviceAccessRuleFuture(params: CreateMobileDeviceAccessRuleRequest): Future[CreateMobileDeviceAccessRuleResponse] = service.createMobileDeviceAccessRule(params).promise().toFuture
    @inline def createOrganizationFuture(params: CreateOrganizationRequest): Future[CreateOrganizationResponse] = service.createOrganization(params).promise().toFuture
    @inline def createResourceFuture(params: CreateResourceRequest): Future[CreateResourceResponse] = service.createResource(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deleteAccessControlRuleFuture(params: DeleteAccessControlRuleRequest): Future[DeleteAccessControlRuleResponse] = service.deleteAccessControlRule(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasRequest): Future[DeleteAliasResponse] = service.deleteAlias(params).promise().toFuture
    @inline def deleteAvailabilityConfigurationFuture(params: DeleteAvailabilityConfigurationRequest): Future[DeleteAvailabilityConfigurationResponse] = service.deleteAvailabilityConfiguration(params).promise().toFuture
    @inline def deleteEmailMonitoringConfigurationFuture(params: DeleteEmailMonitoringConfigurationRequest): Future[DeleteEmailMonitoringConfigurationResponse] = service.deleteEmailMonitoringConfiguration(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] = service.deleteGroup(params).promise().toFuture
    @inline def deleteImpersonationRoleFuture(params: DeleteImpersonationRoleRequest): Future[DeleteImpersonationRoleResponse] = service.deleteImpersonationRole(params).promise().toFuture
    @inline def deleteMailboxPermissionsFuture(params: DeleteMailboxPermissionsRequest): Future[DeleteMailboxPermissionsResponse] = service.deleteMailboxPermissions(params).promise().toFuture
    @inline def deleteMobileDeviceAccessOverrideFuture(params: DeleteMobileDeviceAccessOverrideRequest): Future[DeleteMobileDeviceAccessOverrideResponse] = service.deleteMobileDeviceAccessOverride(params).promise().toFuture
    @inline def deleteMobileDeviceAccessRuleFuture(params: DeleteMobileDeviceAccessRuleRequest): Future[DeleteMobileDeviceAccessRuleResponse] = service.deleteMobileDeviceAccessRule(params).promise().toFuture
    @inline def deleteOrganizationFuture(params: DeleteOrganizationRequest): Future[DeleteOrganizationResponse] = service.deleteOrganization(params).promise().toFuture
    @inline def deleteResourceFuture(params: DeleteResourceRequest): Future[DeleteResourceResponse] = service.deleteResource(params).promise().toFuture
    @inline def deleteRetentionPolicyFuture(params: DeleteRetentionPolicyRequest): Future[DeleteRetentionPolicyResponse] = service.deleteRetentionPolicy(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] = service.deleteUser(params).promise().toFuture
    @inline def deregisterFromWorkMailFuture(params: DeregisterFromWorkMailRequest): Future[DeregisterFromWorkMailResponse] = service.deregisterFromWorkMail(params).promise().toFuture
    @inline def deregisterMailDomainFuture(params: DeregisterMailDomainRequest): Future[DeregisterMailDomainResponse] = service.deregisterMailDomain(params).promise().toFuture
    @inline def describeEmailMonitoringConfigurationFuture(params: DescribeEmailMonitoringConfigurationRequest): Future[DescribeEmailMonitoringConfigurationResponse] = service.describeEmailMonitoringConfiguration(params).promise().toFuture
    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] = service.describeGroup(params).promise().toFuture
    @inline def describeInboundDmarcSettingsFuture(params: DescribeInboundDmarcSettingsRequest): Future[DescribeInboundDmarcSettingsResponse] = service.describeInboundDmarcSettings(params).promise().toFuture
    @inline def describeMailboxExportJobFuture(params: DescribeMailboxExportJobRequest): Future[DescribeMailboxExportJobResponse] = service.describeMailboxExportJob(params).promise().toFuture
    @inline def describeOrganizationFuture(params: DescribeOrganizationRequest): Future[DescribeOrganizationResponse] = service.describeOrganization(params).promise().toFuture
    @inline def describeResourceFuture(params: DescribeResourceRequest): Future[DescribeResourceResponse] = service.describeResource(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def disassociateDelegateFromResourceFuture(params: DisassociateDelegateFromResourceRequest): Future[DisassociateDelegateFromResourceResponse] = service.disassociateDelegateFromResource(params).promise().toFuture
    @inline def disassociateMemberFromGroupFuture(params: DisassociateMemberFromGroupRequest): Future[DisassociateMemberFromGroupResponse] = service.disassociateMemberFromGroup(params).promise().toFuture
    @inline def getAccessControlEffectFuture(params: GetAccessControlEffectRequest): Future[GetAccessControlEffectResponse] = service.getAccessControlEffect(params).promise().toFuture
    @inline def getDefaultRetentionPolicyFuture(params: GetDefaultRetentionPolicyRequest): Future[GetDefaultRetentionPolicyResponse] = service.getDefaultRetentionPolicy(params).promise().toFuture
    @inline def getImpersonationRoleEffectFuture(params: GetImpersonationRoleEffectRequest): Future[GetImpersonationRoleEffectResponse] = service.getImpersonationRoleEffect(params).promise().toFuture
    @inline def getImpersonationRoleFuture(params: GetImpersonationRoleRequest): Future[GetImpersonationRoleResponse] = service.getImpersonationRole(params).promise().toFuture
    @inline def getMailDomainFuture(params: GetMailDomainRequest): Future[GetMailDomainResponse] = service.getMailDomain(params).promise().toFuture
    @inline def getMailboxDetailsFuture(params: GetMailboxDetailsRequest): Future[GetMailboxDetailsResponse] = service.getMailboxDetails(params).promise().toFuture
    @inline def getMobileDeviceAccessEffectFuture(params: GetMobileDeviceAccessEffectRequest): Future[GetMobileDeviceAccessEffectResponse] = service.getMobileDeviceAccessEffect(params).promise().toFuture
    @inline def getMobileDeviceAccessOverrideFuture(params: GetMobileDeviceAccessOverrideRequest): Future[GetMobileDeviceAccessOverrideResponse] = service.getMobileDeviceAccessOverride(params).promise().toFuture
    @inline def listAccessControlRulesFuture(params: ListAccessControlRulesRequest): Future[ListAccessControlRulesResponse] = service.listAccessControlRules(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] = service.listAliases(params).promise().toFuture
    @inline def listAvailabilityConfigurationsFuture(params: ListAvailabilityConfigurationsRequest): Future[ListAvailabilityConfigurationsResponse] = service.listAvailabilityConfigurations(params).promise().toFuture
    @inline def listGroupMembersFuture(params: ListGroupMembersRequest): Future[ListGroupMembersResponse] = service.listGroupMembers(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listImpersonationRolesFuture(params: ListImpersonationRolesRequest): Future[ListImpersonationRolesResponse] = service.listImpersonationRoles(params).promise().toFuture
    @inline def listMailDomainsFuture(params: ListMailDomainsRequest): Future[ListMailDomainsResponse] = service.listMailDomains(params).promise().toFuture
    @inline def listMailboxExportJobsFuture(params: ListMailboxExportJobsRequest): Future[ListMailboxExportJobsResponse] = service.listMailboxExportJobs(params).promise().toFuture
    @inline def listMailboxPermissionsFuture(params: ListMailboxPermissionsRequest): Future[ListMailboxPermissionsResponse] = service.listMailboxPermissions(params).promise().toFuture
    @inline def listMobileDeviceAccessOverridesFuture(params: ListMobileDeviceAccessOverridesRequest): Future[ListMobileDeviceAccessOverridesResponse] = service.listMobileDeviceAccessOverrides(params).promise().toFuture
    @inline def listMobileDeviceAccessRulesFuture(params: ListMobileDeviceAccessRulesRequest): Future[ListMobileDeviceAccessRulesResponse] = service.listMobileDeviceAccessRules(params).promise().toFuture
    @inline def listOrganizationsFuture(params: ListOrganizationsRequest): Future[ListOrganizationsResponse] = service.listOrganizations(params).promise().toFuture
    @inline def listResourceDelegatesFuture(params: ListResourceDelegatesRequest): Future[ListResourceDelegatesResponse] = service.listResourceDelegates(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] = service.listResources(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def putAccessControlRuleFuture(params: PutAccessControlRuleRequest): Future[PutAccessControlRuleResponse] = service.putAccessControlRule(params).promise().toFuture
    @inline def putEmailMonitoringConfigurationFuture(params: PutEmailMonitoringConfigurationRequest): Future[PutEmailMonitoringConfigurationResponse] = service.putEmailMonitoringConfiguration(params).promise().toFuture
    @inline def putInboundDmarcSettingsFuture(params: PutInboundDmarcSettingsRequest): Future[PutInboundDmarcSettingsResponse] = service.putInboundDmarcSettings(params).promise().toFuture
    @inline def putMailboxPermissionsFuture(params: PutMailboxPermissionsRequest): Future[PutMailboxPermissionsResponse] = service.putMailboxPermissions(params).promise().toFuture
    @inline def putMobileDeviceAccessOverrideFuture(params: PutMobileDeviceAccessOverrideRequest): Future[PutMobileDeviceAccessOverrideResponse] = service.putMobileDeviceAccessOverride(params).promise().toFuture
    @inline def putRetentionPolicyFuture(params: PutRetentionPolicyRequest): Future[PutRetentionPolicyResponse] = service.putRetentionPolicy(params).promise().toFuture
    @inline def registerMailDomainFuture(params: RegisterMailDomainRequest): Future[RegisterMailDomainResponse] = service.registerMailDomain(params).promise().toFuture
    @inline def registerToWorkMailFuture(params: RegisterToWorkMailRequest): Future[RegisterToWorkMailResponse] = service.registerToWorkMail(params).promise().toFuture
    @inline def resetPasswordFuture(params: ResetPasswordRequest): Future[ResetPasswordResponse] = service.resetPassword(params).promise().toFuture
    @inline def startMailboxExportJobFuture(params: StartMailboxExportJobRequest): Future[StartMailboxExportJobResponse] = service.startMailboxExportJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def testAvailabilityConfigurationFuture(params: TestAvailabilityConfigurationRequest): Future[TestAvailabilityConfigurationResponse] = service.testAvailabilityConfiguration(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAvailabilityConfigurationFuture(params: UpdateAvailabilityConfigurationRequest): Future[UpdateAvailabilityConfigurationResponse] = service.updateAvailabilityConfiguration(params).promise().toFuture
    @inline def updateDefaultMailDomainFuture(params: UpdateDefaultMailDomainRequest): Future[UpdateDefaultMailDomainResponse] = service.updateDefaultMailDomain(params).promise().toFuture
    @inline def updateImpersonationRoleFuture(params: UpdateImpersonationRoleRequest): Future[UpdateImpersonationRoleResponse] = service.updateImpersonationRole(params).promise().toFuture
    @inline def updateMailboxQuotaFuture(params: UpdateMailboxQuotaRequest): Future[UpdateMailboxQuotaResponse] = service.updateMailboxQuota(params).promise().toFuture
    @inline def updateMobileDeviceAccessRuleFuture(params: UpdateMobileDeviceAccessRuleRequest): Future[UpdateMobileDeviceAccessRuleResponse] = service.updateMobileDeviceAccessRule(params).promise().toFuture
    @inline def updatePrimaryEmailAddressFuture(params: UpdatePrimaryEmailAddressRequest): Future[UpdatePrimaryEmailAddressResponse] = service.updatePrimaryEmailAddress(params).promise().toFuture
    @inline def updateResourceFuture(params: UpdateResourceRequest): Future[UpdateResourceResponse] = service.updateResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/workmail", JSImport.Namespace, "AWS.WorkMail")
  class WorkMail() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDelegateToResource(params: AssociateDelegateToResourceRequest): Request[AssociateDelegateToResourceResponse] = js.native
    def associateMemberToGroup(params: AssociateMemberToGroupRequest): Request[AssociateMemberToGroupResponse] = js.native
    def assumeImpersonationRole(params: AssumeImpersonationRoleRequest): Request[AssumeImpersonationRoleResponse] = js.native
    def cancelMailboxExportJob(params: CancelMailboxExportJobRequest): Request[CancelMailboxExportJobResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[CreateAliasResponse] = js.native
    def createAvailabilityConfiguration(params: CreateAvailabilityConfigurationRequest): Request[CreateAvailabilityConfigurationResponse] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createImpersonationRole(params: CreateImpersonationRoleRequest): Request[CreateImpersonationRoleResponse] = js.native
    def createMobileDeviceAccessRule(params: CreateMobileDeviceAccessRuleRequest): Request[CreateMobileDeviceAccessRuleResponse] = js.native
    def createOrganization(params: CreateOrganizationRequest): Request[CreateOrganizationResponse] = js.native
    def createResource(params: CreateResourceRequest): Request[CreateResourceResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteAccessControlRule(params: DeleteAccessControlRuleRequest): Request[DeleteAccessControlRuleResponse] = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[DeleteAliasResponse] = js.native
    def deleteAvailabilityConfiguration(params: DeleteAvailabilityConfigurationRequest): Request[DeleteAvailabilityConfigurationResponse] = js.native
    def deleteEmailMonitoringConfiguration(params: DeleteEmailMonitoringConfigurationRequest): Request[DeleteEmailMonitoringConfigurationResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def deleteImpersonationRole(params: DeleteImpersonationRoleRequest): Request[DeleteImpersonationRoleResponse] = js.native
    def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): Request[DeleteMailboxPermissionsResponse] = js.native
    def deleteMobileDeviceAccessOverride(params: DeleteMobileDeviceAccessOverrideRequest): Request[DeleteMobileDeviceAccessOverrideResponse] = js.native
    def deleteMobileDeviceAccessRule(params: DeleteMobileDeviceAccessRuleRequest): Request[DeleteMobileDeviceAccessRuleResponse] = js.native
    def deleteOrganization(params: DeleteOrganizationRequest): Request[DeleteOrganizationResponse] = js.native
    def deleteResource(params: DeleteResourceRequest): Request[DeleteResourceResponse] = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[DeleteRetentionPolicyResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): Request[DeregisterFromWorkMailResponse] = js.native
    def deregisterMailDomain(params: DeregisterMailDomainRequest): Request[DeregisterMailDomainResponse] = js.native
    def describeEmailMonitoringConfiguration(params: DescribeEmailMonitoringConfigurationRequest): Request[DescribeEmailMonitoringConfigurationResponse] = js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeInboundDmarcSettings(params: DescribeInboundDmarcSettingsRequest): Request[DescribeInboundDmarcSettingsResponse] = js.native
    def describeMailboxExportJob(params: DescribeMailboxExportJobRequest): Request[DescribeMailboxExportJobResponse] = js.native
    def describeOrganization(params: DescribeOrganizationRequest): Request[DescribeOrganizationResponse] = js.native
    def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest): Request[DisassociateDelegateFromResourceResponse] = js.native
    def disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest): Request[DisassociateMemberFromGroupResponse] = js.native
    def getAccessControlEffect(params: GetAccessControlEffectRequest): Request[GetAccessControlEffectResponse] = js.native
    def getDefaultRetentionPolicy(params: GetDefaultRetentionPolicyRequest): Request[GetDefaultRetentionPolicyResponse] = js.native
    def getImpersonationRole(params: GetImpersonationRoleRequest): Request[GetImpersonationRoleResponse] = js.native
    def getImpersonationRoleEffect(params: GetImpersonationRoleEffectRequest): Request[GetImpersonationRoleEffectResponse] = js.native
    def getMailDomain(params: GetMailDomainRequest): Request[GetMailDomainResponse] = js.native
    def getMailboxDetails(params: GetMailboxDetailsRequest): Request[GetMailboxDetailsResponse] = js.native
    def getMobileDeviceAccessEffect(params: GetMobileDeviceAccessEffectRequest): Request[GetMobileDeviceAccessEffectResponse] = js.native
    def getMobileDeviceAccessOverride(params: GetMobileDeviceAccessOverrideRequest): Request[GetMobileDeviceAccessOverrideResponse] = js.native
    def listAccessControlRules(params: ListAccessControlRulesRequest): Request[ListAccessControlRulesResponse] = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listAvailabilityConfigurations(params: ListAvailabilityConfigurationsRequest): Request[ListAvailabilityConfigurationsResponse] = js.native
    def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listImpersonationRoles(params: ListImpersonationRolesRequest): Request[ListImpersonationRolesResponse] = js.native
    def listMailDomains(params: ListMailDomainsRequest): Request[ListMailDomainsResponse] = js.native
    def listMailboxExportJobs(params: ListMailboxExportJobsRequest): Request[ListMailboxExportJobsResponse] = js.native
    def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse] = js.native
    def listMobileDeviceAccessOverrides(params: ListMobileDeviceAccessOverridesRequest): Request[ListMobileDeviceAccessOverridesResponse] = js.native
    def listMobileDeviceAccessRules(params: ListMobileDeviceAccessRulesRequest): Request[ListMobileDeviceAccessRulesResponse] = js.native
    def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse] = js.native
    def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def putAccessControlRule(params: PutAccessControlRuleRequest): Request[PutAccessControlRuleResponse] = js.native
    def putEmailMonitoringConfiguration(params: PutEmailMonitoringConfigurationRequest): Request[PutEmailMonitoringConfigurationResponse] = js.native
    def putInboundDmarcSettings(params: PutInboundDmarcSettingsRequest): Request[PutInboundDmarcSettingsResponse] = js.native
    def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse] = js.native
    def putMobileDeviceAccessOverride(params: PutMobileDeviceAccessOverrideRequest): Request[PutMobileDeviceAccessOverrideResponse] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[PutRetentionPolicyResponse] = js.native
    def registerMailDomain(params: RegisterMailDomainRequest): Request[RegisterMailDomainResponse] = js.native
    def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse] = js.native
    def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse] = js.native
    def startMailboxExportJob(params: StartMailboxExportJobRequest): Request[StartMailboxExportJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testAvailabilityConfiguration(params: TestAvailabilityConfigurationRequest): Request[TestAvailabilityConfigurationResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAvailabilityConfiguration(params: UpdateAvailabilityConfigurationRequest): Request[UpdateAvailabilityConfigurationResponse] = js.native
    def updateDefaultMailDomain(params: UpdateDefaultMailDomainRequest): Request[UpdateDefaultMailDomainResponse] = js.native
    def updateImpersonationRole(params: UpdateImpersonationRoleRequest): Request[UpdateImpersonationRoleResponse] = js.native
    def updateMailboxQuota(params: UpdateMailboxQuotaRequest): Request[UpdateMailboxQuotaResponse] = js.native
    def updateMobileDeviceAccessRule(params: UpdateMobileDeviceAccessRuleRequest): Request[UpdateMobileDeviceAccessRuleResponse] = js.native
    def updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest): Request[UpdatePrimaryEmailAddressResponse] = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse] = js.native
  }
  object WorkMail {
    @inline implicit def toOps(service: WorkMail): WorkMailOps = {
      new WorkMailOps(service)
    }
  }

  /** A rule that controls access to an WorkMail organization.
    */
  @js.native
  trait AccessControlRule extends js.Object {
    var Actions: js.UndefOr[ActionsList]
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[AccessControlRuleDescription]
    var Effect: js.UndefOr[AccessControlRuleEffect]
    var ImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList]
    var IpRanges: js.UndefOr[IpRangeList]
    var Name: js.UndefOr[AccessControlRuleName]
    var NotActions: js.UndefOr[ActionsList]
    var NotImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList]
    var NotIpRanges: js.UndefOr[IpRangeList]
    var NotUserIds: js.UndefOr[UserIdList]
    var UserIds: js.UndefOr[UserIdList]
  }

  object AccessControlRule {
    @inline
    def apply(
        Actions: js.UndefOr[ActionsList] = js.undefined,
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[AccessControlRuleDescription] = js.undefined,
        Effect: js.UndefOr[AccessControlRuleEffect] = js.undefined,
        ImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList] = js.undefined,
        IpRanges: js.UndefOr[IpRangeList] = js.undefined,
        Name: js.UndefOr[AccessControlRuleName] = js.undefined,
        NotActions: js.UndefOr[ActionsList] = js.undefined,
        NotImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList] = js.undefined,
        NotIpRanges: js.UndefOr[IpRangeList] = js.undefined,
        NotUserIds: js.UndefOr[UserIdList] = js.undefined,
        UserIds: js.UndefOr[UserIdList] = js.undefined
    ): AccessControlRule = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      ImpersonationRoleIds.foreach(__v => __obj.updateDynamic("ImpersonationRoleIds")(__v.asInstanceOf[js.Any]))
      IpRanges.foreach(__v => __obj.updateDynamic("IpRanges")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NotActions.foreach(__v => __obj.updateDynamic("NotActions")(__v.asInstanceOf[js.Any]))
      NotImpersonationRoleIds.foreach(__v => __obj.updateDynamic("NotImpersonationRoleIds")(__v.asInstanceOf[js.Any]))
      NotIpRanges.foreach(__v => __obj.updateDynamic("NotIpRanges")(__v.asInstanceOf[js.Any]))
      NotUserIds.foreach(__v => __obj.updateDynamic("NotUserIds")(__v.asInstanceOf[js.Any]))
      UserIds.foreach(__v => __obj.updateDynamic("UserIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessControlRule]
    }
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateDelegateToResourceRequest]
    }
  }

  @js.native
  trait AssociateDelegateToResourceResponse extends js.Object

  object AssociateDelegateToResourceResponse {
    @inline
    def apply(): AssociateDelegateToResourceResponse = {
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
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateMemberToGroupRequest]
    }
  }

  @js.native
  trait AssociateMemberToGroupResponse extends js.Object

  object AssociateMemberToGroupResponse {
    @inline
    def apply(): AssociateMemberToGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateMemberToGroupResponse]
    }
  }

  @js.native
  trait AssumeImpersonationRoleRequest extends js.Object {
    var ImpersonationRoleId: ImpersonationRoleId
    var OrganizationId: OrganizationId
  }

  object AssumeImpersonationRoleRequest {
    @inline
    def apply(
        ImpersonationRoleId: ImpersonationRoleId,
        OrganizationId: OrganizationId
    ): AssumeImpersonationRoleRequest = {
      val __obj = js.Dynamic.literal(
        "ImpersonationRoleId" -> ImpersonationRoleId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssumeImpersonationRoleRequest]
    }
  }

  @js.native
  trait AssumeImpersonationRoleResponse extends js.Object {
    var ExpiresIn: js.UndefOr[ExpiresIn]
    var Token: js.UndefOr[ImpersonationToken]
  }

  object AssumeImpersonationRoleResponse {
    @inline
    def apply(
        ExpiresIn: js.UndefOr[ExpiresIn] = js.undefined,
        Token: js.UndefOr[ImpersonationToken] = js.undefined
    ): AssumeImpersonationRoleResponse = {
      val __obj = js.Dynamic.literal()
      ExpiresIn.foreach(__v => __obj.updateDynamic("ExpiresIn")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeImpersonationRoleResponse]
    }
  }

  /** List all the <code>AvailabilityConfiguration</code>'s for the given WorkMail organization.
    */
  @js.native
  trait AvailabilityConfiguration extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var DomainName: js.UndefOr[DomainName]
    var EwsProvider: js.UndefOr[RedactedEwsAvailabilityProvider]
    var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider]
    var ProviderType: js.UndefOr[AvailabilityProviderType]
  }

  object AvailabilityConfiguration {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        EwsProvider: js.UndefOr[RedactedEwsAvailabilityProvider] = js.undefined,
        LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined,
        ProviderType: js.UndefOr[AvailabilityProviderType] = js.undefined
    ): AvailabilityConfiguration = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      EwsProvider.foreach(__v => __obj.updateDynamic("EwsProvider")(__v.asInstanceOf[js.Any]))
      LambdaProvider.foreach(__v => __obj.updateDynamic("LambdaProvider")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityConfiguration]
    }
  }

  /** At least one delegate must be associated to the resource to disable automatic replies from the resource.
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
      AutoDeclineConflictingRequests.foreach(__v => __obj.updateDynamic("AutoDeclineConflictingRequests")(__v.asInstanceOf[js.Any]))
      AutoDeclineRecurringRequests.foreach(__v => __obj.updateDynamic("AutoDeclineRecurringRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BookingOptions]
    }
  }

  @js.native
  trait CancelMailboxExportJobRequest extends js.Object {
    var ClientToken: IdempotencyClientToken
    var JobId: MailboxExportJobId
    var OrganizationId: OrganizationId
  }

  object CancelMailboxExportJobRequest {
    @inline
    def apply(
        ClientToken: IdempotencyClientToken,
        JobId: MailboxExportJobId,
        OrganizationId: OrganizationId
    ): CancelMailboxExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelMailboxExportJobRequest]
    }
  }

  @js.native
  trait CancelMailboxExportJobResponse extends js.Object

  object CancelMailboxExportJobResponse {
    @inline
    def apply(): CancelMailboxExportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelMailboxExportJobResponse]
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
        "Alias" -> Alias.asInstanceOf[js.Any],
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateAliasResponse extends js.Object

  object CreateAliasResponse {
    @inline
    def apply(): CreateAliasResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAliasResponse]
    }
  }

  @js.native
  trait CreateAvailabilityConfigurationRequest extends js.Object {
    var DomainName: DomainName
    var OrganizationId: OrganizationId
    var ClientToken: js.UndefOr[IdempotencyClientToken]
    var EwsProvider: js.UndefOr[EwsAvailabilityProvider]
    var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider]
  }

  object CreateAvailabilityConfigurationRequest {
    @inline
    def apply(
        DomainName: DomainName,
        OrganizationId: OrganizationId,
        ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined,
        EwsProvider: js.UndefOr[EwsAvailabilityProvider] = js.undefined,
        LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
    ): CreateAvailabilityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      EwsProvider.foreach(__v => __obj.updateDynamic("EwsProvider")(__v.asInstanceOf[js.Any]))
      LambdaProvider.foreach(__v => __obj.updateDynamic("LambdaProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAvailabilityConfigurationRequest]
    }
  }

  @js.native
  trait CreateAvailabilityConfigurationResponse extends js.Object

  object CreateAvailabilityConfigurationResponse {
    @inline
    def apply(): CreateAvailabilityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAvailabilityConfigurationResponse]
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
        "Name" -> Name.asInstanceOf[js.Any],
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
  trait CreateImpersonationRoleRequest extends js.Object {
    var Name: ImpersonationRoleName
    var OrganizationId: OrganizationId
    var Rules: ImpersonationRuleList
    var Type: ImpersonationRoleType
    var ClientToken: js.UndefOr[IdempotencyClientToken]
    var Description: js.UndefOr[ImpersonationRoleDescription]
  }

  object CreateImpersonationRoleRequest {
    @inline
    def apply(
        Name: ImpersonationRoleName,
        OrganizationId: OrganizationId,
        Rules: ImpersonationRuleList,
        Type: ImpersonationRoleType,
        ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined,
        Description: js.UndefOr[ImpersonationRoleDescription] = js.undefined
    ): CreateImpersonationRoleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImpersonationRoleRequest]
    }
  }

  @js.native
  trait CreateImpersonationRoleResponse extends js.Object {
    var ImpersonationRoleId: js.UndefOr[ImpersonationRoleId]
  }

  object CreateImpersonationRoleResponse {
    @inline
    def apply(
        ImpersonationRoleId: js.UndefOr[ImpersonationRoleId] = js.undefined
    ): CreateImpersonationRoleResponse = {
      val __obj = js.Dynamic.literal()
      ImpersonationRoleId.foreach(__v => __obj.updateDynamic("ImpersonationRoleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImpersonationRoleResponse]
    }
  }

  @js.native
  trait CreateMobileDeviceAccessRuleRequest extends js.Object {
    var Effect: MobileDeviceAccessRuleEffect
    var Name: MobileDeviceAccessRuleName
    var OrganizationId: OrganizationId
    var ClientToken: js.UndefOr[IdempotencyClientToken]
    var Description: js.UndefOr[MobileDeviceAccessRuleDescription]
    var DeviceModels: js.UndefOr[DeviceModelList]
    var DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList]
    var DeviceTypes: js.UndefOr[DeviceTypeList]
    var DeviceUserAgents: js.UndefOr[DeviceUserAgentList]
    var NotDeviceModels: js.UndefOr[DeviceModelList]
    var NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList]
    var NotDeviceTypes: js.UndefOr[DeviceTypeList]
    var NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList]
  }

  object CreateMobileDeviceAccessRuleRequest {
    @inline
    def apply(
        Effect: MobileDeviceAccessRuleEffect,
        Name: MobileDeviceAccessRuleName,
        OrganizationId: OrganizationId,
        ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined,
        Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined,
        DeviceModels: js.UndefOr[DeviceModelList] = js.undefined,
        DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined,
        DeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined,
        DeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined,
        NotDeviceModels: js.UndefOr[DeviceModelList] = js.undefined,
        NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined,
        NotDeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined,
        NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
    ): CreateMobileDeviceAccessRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Effect" -> Effect.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceModels.foreach(__v => __obj.updateDynamic("DeviceModels")(__v.asInstanceOf[js.Any]))
      DeviceOperatingSystems.foreach(__v => __obj.updateDynamic("DeviceOperatingSystems")(__v.asInstanceOf[js.Any]))
      DeviceTypes.foreach(__v => __obj.updateDynamic("DeviceTypes")(__v.asInstanceOf[js.Any]))
      DeviceUserAgents.foreach(__v => __obj.updateDynamic("DeviceUserAgents")(__v.asInstanceOf[js.Any]))
      NotDeviceModels.foreach(__v => __obj.updateDynamic("NotDeviceModels")(__v.asInstanceOf[js.Any]))
      NotDeviceOperatingSystems.foreach(__v => __obj.updateDynamic("NotDeviceOperatingSystems")(__v.asInstanceOf[js.Any]))
      NotDeviceTypes.foreach(__v => __obj.updateDynamic("NotDeviceTypes")(__v.asInstanceOf[js.Any]))
      NotDeviceUserAgents.foreach(__v => __obj.updateDynamic("NotDeviceUserAgents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMobileDeviceAccessRuleRequest]
    }
  }

  @js.native
  trait CreateMobileDeviceAccessRuleResponse extends js.Object {
    var MobileDeviceAccessRuleId: js.UndefOr[MobileDeviceAccessRuleId]
  }

  object CreateMobileDeviceAccessRuleResponse {
    @inline
    def apply(
        MobileDeviceAccessRuleId: js.UndefOr[MobileDeviceAccessRuleId] = js.undefined
    ): CreateMobileDeviceAccessRuleResponse = {
      val __obj = js.Dynamic.literal()
      MobileDeviceAccessRuleId.foreach(__v => __obj.updateDynamic("MobileDeviceAccessRuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMobileDeviceAccessRuleResponse]
    }
  }

  @js.native
  trait CreateOrganizationRequest extends js.Object {
    var Alias: OrganizationName
    var ClientToken: js.UndefOr[IdempotencyClientToken]
    var DirectoryId: js.UndefOr[DirectoryId]
    var Domains: js.UndefOr[Domains]
    var EnableInteroperability: js.UndefOr[Boolean]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object CreateOrganizationRequest {
    @inline
    def apply(
        Alias: OrganizationName,
        ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Domains: js.UndefOr[Domains] = js.undefined,
        EnableInteroperability: js.UndefOr[Boolean] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): CreateOrganizationRequest = {
      val __obj = js.Dynamic.literal(
        "Alias" -> Alias.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Domains.foreach(__v => __obj.updateDynamic("Domains")(__v.asInstanceOf[js.Any]))
      EnableInteroperability.foreach(__v => __obj.updateDynamic("EnableInteroperability")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrganizationRequest]
    }
  }

  @js.native
  trait CreateOrganizationResponse extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
  }

  object CreateOrganizationResponse {
    @inline
    def apply(
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined
    ): CreateOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrganizationResponse]
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
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
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
        "DisplayName" -> DisplayName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any]
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

  /** The name of the attribute, which is one of the values defined in the UserAttribute enumeration.
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
        "Id" -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Delegate]
    }
  }

  @js.native
  trait DeleteAccessControlRuleRequest extends js.Object {
    var Name: AccessControlRuleName
    var OrganizationId: OrganizationId
  }

  object DeleteAccessControlRuleRequest {
    @inline
    def apply(
        Name: AccessControlRuleName,
        OrganizationId: OrganizationId
    ): DeleteAccessControlRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccessControlRuleRequest]
    }
  }

  @js.native
  trait DeleteAccessControlRuleResponse extends js.Object

  object DeleteAccessControlRuleResponse {
    @inline
    def apply(): DeleteAccessControlRuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccessControlRuleResponse]
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
        "Alias" -> Alias.asInstanceOf[js.Any],
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteAliasResponse extends js.Object

  object DeleteAliasResponse {
    @inline
    def apply(): DeleteAliasResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAliasResponse]
    }
  }

  @js.native
  trait DeleteAvailabilityConfigurationRequest extends js.Object {
    var DomainName: DomainName
    var OrganizationId: OrganizationId
  }

  object DeleteAvailabilityConfigurationRequest {
    @inline
    def apply(
        DomainName: DomainName,
        OrganizationId: OrganizationId
    ): DeleteAvailabilityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAvailabilityConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAvailabilityConfigurationResponse extends js.Object

  object DeleteAvailabilityConfigurationResponse {
    @inline
    def apply(): DeleteAvailabilityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAvailabilityConfigurationResponse]
    }
  }

  @js.native
  trait DeleteEmailMonitoringConfigurationRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object DeleteEmailMonitoringConfigurationRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): DeleteEmailMonitoringConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEmailMonitoringConfigurationRequest]
    }
  }

  @js.native
  trait DeleteEmailMonitoringConfigurationResponse extends js.Object

  object DeleteEmailMonitoringConfigurationResponse {
    @inline
    def apply(): DeleteEmailMonitoringConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEmailMonitoringConfigurationResponse]
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
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object

  object DeleteGroupResponse {
    @inline
    def apply(): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteImpersonationRoleRequest extends js.Object {
    var ImpersonationRoleId: ImpersonationRoleId
    var OrganizationId: OrganizationId
  }

  object DeleteImpersonationRoleRequest {
    @inline
    def apply(
        ImpersonationRoleId: ImpersonationRoleId,
        OrganizationId: OrganizationId
    ): DeleteImpersonationRoleRequest = {
      val __obj = js.Dynamic.literal(
        "ImpersonationRoleId" -> ImpersonationRoleId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteImpersonationRoleRequest]
    }
  }

  @js.native
  trait DeleteImpersonationRoleResponse extends js.Object

  object DeleteImpersonationRoleResponse {
    @inline
    def apply(): DeleteImpersonationRoleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteImpersonationRoleResponse]
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "GranteeId" -> GranteeId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMailboxPermissionsRequest]
    }
  }

  @js.native
  trait DeleteMailboxPermissionsResponse extends js.Object

  object DeleteMailboxPermissionsResponse {
    @inline
    def apply(): DeleteMailboxPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMailboxPermissionsResponse]
    }
  }

  @js.native
  trait DeleteMobileDeviceAccessOverrideRequest extends js.Object {
    var DeviceId: DeviceId
    var OrganizationId: OrganizationId
    var UserId: EntityIdentifier
  }

  object DeleteMobileDeviceAccessOverrideRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        OrganizationId: OrganizationId,
        UserId: EntityIdentifier
    ): DeleteMobileDeviceAccessOverrideRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMobileDeviceAccessOverrideRequest]
    }
  }

  @js.native
  trait DeleteMobileDeviceAccessOverrideResponse extends js.Object

  object DeleteMobileDeviceAccessOverrideResponse {
    @inline
    def apply(): DeleteMobileDeviceAccessOverrideResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMobileDeviceAccessOverrideResponse]
    }
  }

  @js.native
  trait DeleteMobileDeviceAccessRuleRequest extends js.Object {
    var MobileDeviceAccessRuleId: MobileDeviceAccessRuleId
    var OrganizationId: OrganizationId
  }

  object DeleteMobileDeviceAccessRuleRequest {
    @inline
    def apply(
        MobileDeviceAccessRuleId: MobileDeviceAccessRuleId,
        OrganizationId: OrganizationId
    ): DeleteMobileDeviceAccessRuleRequest = {
      val __obj = js.Dynamic.literal(
        "MobileDeviceAccessRuleId" -> MobileDeviceAccessRuleId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMobileDeviceAccessRuleRequest]
    }
  }

  @js.native
  trait DeleteMobileDeviceAccessRuleResponse extends js.Object

  object DeleteMobileDeviceAccessRuleResponse {
    @inline
    def apply(): DeleteMobileDeviceAccessRuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMobileDeviceAccessRuleResponse]
    }
  }

  @js.native
  trait DeleteOrganizationRequest extends js.Object {
    var DeleteDirectory: Boolean
    var OrganizationId: OrganizationId
    var ClientToken: js.UndefOr[IdempotencyClientToken]
  }

  object DeleteOrganizationRequest {
    @inline
    def apply(
        DeleteDirectory: Boolean,
        OrganizationId: OrganizationId,
        ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
    ): DeleteOrganizationRequest = {
      val __obj = js.Dynamic.literal(
        "DeleteDirectory" -> DeleteDirectory.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOrganizationRequest]
    }
  }

  @js.native
  trait DeleteOrganizationResponse extends js.Object {
    var OrganizationId: js.UndefOr[OrganizationId]
    var State: js.UndefOr[String]
  }

  object DeleteOrganizationResponse {
    @inline
    def apply(
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): DeleteOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOrganizationResponse]
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
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourceRequest]
    }
  }

  @js.native
  trait DeleteResourceResponse extends js.Object

  object DeleteResourceResponse {
    @inline
    def apply(): DeleteResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourceResponse]
    }
  }

  @js.native
  trait DeleteRetentionPolicyRequest extends js.Object {
    var Id: ShortString
    var OrganizationId: OrganizationId
  }

  object DeleteRetentionPolicyRequest {
    @inline
    def apply(
        Id: ShortString,
        OrganizationId: OrganizationId
    ): DeleteRetentionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRetentionPolicyRequest]
    }
  }

  @js.native
  trait DeleteRetentionPolicyResponse extends js.Object

  object DeleteRetentionPolicyResponse {
    @inline
    def apply(): DeleteRetentionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRetentionPolicyResponse]
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
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object

  object DeleteUserResponse {
    @inline
    def apply(): DeleteUserResponse = {
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterFromWorkMailRequest]
    }
  }

  @js.native
  trait DeregisterFromWorkMailResponse extends js.Object

  object DeregisterFromWorkMailResponse {
    @inline
    def apply(): DeregisterFromWorkMailResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterFromWorkMailResponse]
    }
  }

  @js.native
  trait DeregisterMailDomainRequest extends js.Object {
    var DomainName: WorkMailDomainName
    var OrganizationId: OrganizationId
  }

  object DeregisterMailDomainRequest {
    @inline
    def apply(
        DomainName: WorkMailDomainName,
        OrganizationId: OrganizationId
    ): DeregisterMailDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterMailDomainRequest]
    }
  }

  @js.native
  trait DeregisterMailDomainResponse extends js.Object

  object DeregisterMailDomainResponse {
    @inline
    def apply(): DeregisterMailDomainResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterMailDomainResponse]
    }
  }

  @js.native
  trait DescribeEmailMonitoringConfigurationRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object DescribeEmailMonitoringConfigurationRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): DescribeEmailMonitoringConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEmailMonitoringConfigurationRequest]
    }
  }

  @js.native
  trait DescribeEmailMonitoringConfigurationResponse extends js.Object {
    var LogGroupArn: js.UndefOr[LogGroupArn]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeEmailMonitoringConfigurationResponse {
    @inline
    def apply(
        LogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeEmailMonitoringConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LogGroupArn.foreach(__v => __obj.updateDynamic("LogGroupArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEmailMonitoringConfigurationResponse]
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
        "GroupId" -> GroupId.asInstanceOf[js.Any],
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
  trait DescribeInboundDmarcSettingsRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object DescribeInboundDmarcSettingsRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): DescribeInboundDmarcSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeInboundDmarcSettingsRequest]
    }
  }

  @js.native
  trait DescribeInboundDmarcSettingsResponse extends js.Object {
    var Enforced: js.UndefOr[Boolean]
  }

  object DescribeInboundDmarcSettingsResponse {
    @inline
    def apply(
        Enforced: js.UndefOr[Boolean] = js.undefined
    ): DescribeInboundDmarcSettingsResponse = {
      val __obj = js.Dynamic.literal()
      Enforced.foreach(__v => __obj.updateDynamic("Enforced")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInboundDmarcSettingsResponse]
    }
  }

  @js.native
  trait DescribeMailboxExportJobRequest extends js.Object {
    var JobId: MailboxExportJobId
    var OrganizationId: OrganizationId
  }

  object DescribeMailboxExportJobRequest {
    @inline
    def apply(
        JobId: MailboxExportJobId,
        OrganizationId: OrganizationId
    ): DescribeMailboxExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMailboxExportJobRequest]
    }
  }

  @js.native
  trait DescribeMailboxExportJobResponse extends js.Object {
    var Description: js.UndefOr[Description]
    var EndTime: js.UndefOr[Timestamp]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var ErrorInfo: js.UndefOr[MailboxExportErrorInfo]
    var EstimatedProgress: js.UndefOr[Percentage]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var RoleArn: js.UndefOr[RoleArn]
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3Path: js.UndefOr[S3ObjectKey]
    var S3Prefix: js.UndefOr[S3ObjectKey]
    var StartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[MailboxExportJobState]
  }

  object DescribeMailboxExportJobResponse {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
        ErrorInfo: js.UndefOr[MailboxExportErrorInfo] = js.undefined,
        EstimatedProgress: js.UndefOr[Percentage] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        S3Path: js.UndefOr[S3ObjectKey] = js.undefined,
        S3Prefix: js.UndefOr[S3ObjectKey] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[MailboxExportJobState] = js.undefined
    ): DescribeMailboxExportJobResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      ErrorInfo.foreach(__v => __obj.updateDynamic("ErrorInfo")(__v.asInstanceOf[js.Any]))
      EstimatedProgress.foreach(__v => __obj.updateDynamic("EstimatedProgress")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3Path.foreach(__v => __obj.updateDynamic("S3Path")(__v.asInstanceOf[js.Any]))
      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMailboxExportJobResponse]
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

  object DescribeOrganizationResponse {
    @inline
    def apply(
        ARN: js.UndefOr[AmazonResourceName] = js.undefined,
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
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
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
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
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
        "UserId" -> UserId.asInstanceOf[js.Any]
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateDelegateFromResourceRequest]
    }
  }

  @js.native
  trait DisassociateDelegateFromResourceResponse extends js.Object

  object DisassociateDelegateFromResourceResponse {
    @inline
    def apply(): DisassociateDelegateFromResourceResponse = {
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
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMemberFromGroupRequest]
    }
  }

  @js.native
  trait DisassociateMemberFromGroupResponse extends js.Object

  object DisassociateMemberFromGroupResponse {
    @inline
    def apply(): DisassociateMemberFromGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateMemberFromGroupResponse]
    }
  }

  /** A DNS record uploaded to your DNS provider.
    */
  @js.native
  trait DnsRecord extends js.Object {
    var Hostname: js.UndefOr[String]
    var Type: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object DnsRecord {
    @inline
    def apply(
        Hostname: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): DnsRecord = {
      val __obj = js.Dynamic.literal()
      Hostname.foreach(__v => __obj.updateDynamic("Hostname")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRecord]
    }
  }

  /** The domain to associate with an WorkMail organization. When you configure a domain hosted in Amazon Route 53 (Route 53), all recommended DNS records are added to the organization when you create it. For more information, see [[https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html|Adding a domain]] in the <i>WorkMail Administrator Guide</i>.
    */
  @js.native
  trait Domain extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var HostedZoneId: js.UndefOr[HostedZoneId]
  }

  object Domain {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        HostedZoneId: js.UndefOr[HostedZoneId] = js.undefined
    ): Domain = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Domain]
    }
  }

  /** Describes an EWS based availability provider. This is only used as input to the service.
    */
  @js.native
  trait EwsAvailabilityProvider extends js.Object {
    var EwsEndpoint: Url
    var EwsPassword: Password
    var EwsUsername: ExternalUserName
  }

  object EwsAvailabilityProvider {
    @inline
    def apply(
        EwsEndpoint: Url,
        EwsPassword: Password,
        EwsUsername: ExternalUserName
    ): EwsAvailabilityProvider = {
      val __obj = js.Dynamic.literal(
        "EwsEndpoint" -> EwsEndpoint.asInstanceOf[js.Any],
        "EwsPassword" -> EwsPassword.asInstanceOf[js.Any],
        "EwsUsername" -> EwsUsername.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EwsAvailabilityProvider]
    }
  }

  /** The configuration applied to an organization's folders by its retention policy.
    */
  @js.native
  trait FolderConfiguration extends js.Object {
    var Action: RetentionAction
    var Name: FolderName
    var Period: js.UndefOr[RetentionPeriod]
  }

  object FolderConfiguration {
    @inline
    def apply(
        Action: RetentionAction,
        Name: FolderName,
        Period: js.UndefOr[RetentionPeriod] = js.undefined
    ): FolderConfiguration = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FolderConfiguration]
    }
  }

  @js.native
  trait GetAccessControlEffectRequest extends js.Object {
    var Action: AccessControlRuleAction
    var IpAddress: IpAddress
    var OrganizationId: OrganizationId
    var ImpersonationRoleId: js.UndefOr[ImpersonationRoleId]
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object GetAccessControlEffectRequest {
    @inline
    def apply(
        Action: AccessControlRuleAction,
        IpAddress: IpAddress,
        OrganizationId: OrganizationId,
        ImpersonationRoleId: js.UndefOr[ImpersonationRoleId] = js.undefined,
        UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): GetAccessControlEffectRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "IpAddress" -> IpAddress.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      ImpersonationRoleId.foreach(__v => __obj.updateDynamic("ImpersonationRoleId")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessControlEffectRequest]
    }
  }

  @js.native
  trait GetAccessControlEffectResponse extends js.Object {
    var Effect: js.UndefOr[AccessControlRuleEffect]
    var MatchedRules: js.UndefOr[AccessControlRuleNameList]
  }

  object GetAccessControlEffectResponse {
    @inline
    def apply(
        Effect: js.UndefOr[AccessControlRuleEffect] = js.undefined,
        MatchedRules: js.UndefOr[AccessControlRuleNameList] = js.undefined
    ): GetAccessControlEffectResponse = {
      val __obj = js.Dynamic.literal()
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      MatchedRules.foreach(__v => __obj.updateDynamic("MatchedRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessControlEffectResponse]
    }
  }

  @js.native
  trait GetDefaultRetentionPolicyRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object GetDefaultRetentionPolicyRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): GetDefaultRetentionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDefaultRetentionPolicyRequest]
    }
  }

  @js.native
  trait GetDefaultRetentionPolicyResponse extends js.Object {
    var Description: js.UndefOr[String]
    var FolderConfigurations: js.UndefOr[FolderConfigurations]
    var Id: js.UndefOr[ShortString]
    var Name: js.UndefOr[ShortString]
  }

  object GetDefaultRetentionPolicyResponse {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        FolderConfigurations: js.UndefOr[FolderConfigurations] = js.undefined,
        Id: js.UndefOr[ShortString] = js.undefined,
        Name: js.UndefOr[ShortString] = js.undefined
    ): GetDefaultRetentionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FolderConfigurations.foreach(__v => __obj.updateDynamic("FolderConfigurations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDefaultRetentionPolicyResponse]
    }
  }

  @js.native
  trait GetImpersonationRoleEffectRequest extends js.Object {
    var ImpersonationRoleId: ImpersonationRoleId
    var OrganizationId: OrganizationId
    var TargetUser: EntityIdentifier
  }

  object GetImpersonationRoleEffectRequest {
    @inline
    def apply(
        ImpersonationRoleId: ImpersonationRoleId,
        OrganizationId: OrganizationId,
        TargetUser: EntityIdentifier
    ): GetImpersonationRoleEffectRequest = {
      val __obj = js.Dynamic.literal(
        "ImpersonationRoleId" -> ImpersonationRoleId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "TargetUser" -> TargetUser.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImpersonationRoleEffectRequest]
    }
  }

  @js.native
  trait GetImpersonationRoleEffectResponse extends js.Object {
    var Effect: js.UndefOr[AccessEffect]
    var MatchedRules: js.UndefOr[ImpersonationMatchedRuleList]
    var Type: js.UndefOr[ImpersonationRoleType]
  }

  object GetImpersonationRoleEffectResponse {
    @inline
    def apply(
        Effect: js.UndefOr[AccessEffect] = js.undefined,
        MatchedRules: js.UndefOr[ImpersonationMatchedRuleList] = js.undefined,
        Type: js.UndefOr[ImpersonationRoleType] = js.undefined
    ): GetImpersonationRoleEffectResponse = {
      val __obj = js.Dynamic.literal()
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      MatchedRules.foreach(__v => __obj.updateDynamic("MatchedRules")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImpersonationRoleEffectResponse]
    }
  }

  @js.native
  trait GetImpersonationRoleRequest extends js.Object {
    var ImpersonationRoleId: ImpersonationRoleId
    var OrganizationId: OrganizationId
  }

  object GetImpersonationRoleRequest {
    @inline
    def apply(
        ImpersonationRoleId: ImpersonationRoleId,
        OrganizationId: OrganizationId
    ): GetImpersonationRoleRequest = {
      val __obj = js.Dynamic.literal(
        "ImpersonationRoleId" -> ImpersonationRoleId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImpersonationRoleRequest]
    }
  }

  @js.native
  trait GetImpersonationRoleResponse extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ImpersonationRoleDescription]
    var ImpersonationRoleId: js.UndefOr[ImpersonationRoleId]
    var Name: js.UndefOr[ImpersonationRoleName]
    var Rules: js.UndefOr[ImpersonationRuleList]
    var Type: js.UndefOr[ImpersonationRoleType]
  }

  object GetImpersonationRoleResponse {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ImpersonationRoleDescription] = js.undefined,
        ImpersonationRoleId: js.UndefOr[ImpersonationRoleId] = js.undefined,
        Name: js.UndefOr[ImpersonationRoleName] = js.undefined,
        Rules: js.UndefOr[ImpersonationRuleList] = js.undefined,
        Type: js.UndefOr[ImpersonationRoleType] = js.undefined
    ): GetImpersonationRoleResponse = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ImpersonationRoleId.foreach(__v => __obj.updateDynamic("ImpersonationRoleId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImpersonationRoleResponse]
    }
  }

  @js.native
  trait GetMailDomainRequest extends js.Object {
    var DomainName: WorkMailDomainName
    var OrganizationId: OrganizationId
  }

  object GetMailDomainRequest {
    @inline
    def apply(
        DomainName: WorkMailDomainName,
        OrganizationId: OrganizationId
    ): GetMailDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMailDomainRequest]
    }
  }

  @js.native
  trait GetMailDomainResponse extends js.Object {
    var DkimVerificationStatus: js.UndefOr[DnsRecordVerificationStatus]
    var IsDefault: js.UndefOr[Boolean]
    var IsTestDomain: js.UndefOr[Boolean]
    var OwnershipVerificationStatus: js.UndefOr[DnsRecordVerificationStatus]
    var Records: js.UndefOr[DnsRecords]
  }

  object GetMailDomainResponse {
    @inline
    def apply(
        DkimVerificationStatus: js.UndefOr[DnsRecordVerificationStatus] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        IsTestDomain: js.UndefOr[Boolean] = js.undefined,
        OwnershipVerificationStatus: js.UndefOr[DnsRecordVerificationStatus] = js.undefined,
        Records: js.UndefOr[DnsRecords] = js.undefined
    ): GetMailDomainResponse = {
      val __obj = js.Dynamic.literal()
      DkimVerificationStatus.foreach(__v => __obj.updateDynamic("DkimVerificationStatus")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      IsTestDomain.foreach(__v => __obj.updateDynamic("IsTestDomain")(__v.asInstanceOf[js.Any]))
      OwnershipVerificationStatus.foreach(__v => __obj.updateDynamic("OwnershipVerificationStatus")(__v.asInstanceOf[js.Any]))
      Records.foreach(__v => __obj.updateDynamic("Records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMailDomainResponse]
    }
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
        "UserId" -> UserId.asInstanceOf[js.Any]
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

  @js.native
  trait GetMobileDeviceAccessEffectRequest extends js.Object {
    var OrganizationId: OrganizationId
    var DeviceModel: js.UndefOr[DeviceModel]
    var DeviceOperatingSystem: js.UndefOr[DeviceOperatingSystem]
    var DeviceType: js.UndefOr[DeviceType]
    var DeviceUserAgent: js.UndefOr[DeviceUserAgent]
  }

  object GetMobileDeviceAccessEffectRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        DeviceModel: js.UndefOr[DeviceModel] = js.undefined,
        DeviceOperatingSystem: js.UndefOr[DeviceOperatingSystem] = js.undefined,
        DeviceType: js.UndefOr[DeviceType] = js.undefined,
        DeviceUserAgent: js.UndefOr[DeviceUserAgent] = js.undefined
    ): GetMobileDeviceAccessEffectRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      DeviceModel.foreach(__v => __obj.updateDynamic("DeviceModel")(__v.asInstanceOf[js.Any]))
      DeviceOperatingSystem.foreach(__v => __obj.updateDynamic("DeviceOperatingSystem")(__v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      DeviceUserAgent.foreach(__v => __obj.updateDynamic("DeviceUserAgent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMobileDeviceAccessEffectRequest]
    }
  }

  @js.native
  trait GetMobileDeviceAccessEffectResponse extends js.Object {
    var Effect: js.UndefOr[MobileDeviceAccessRuleEffect]
    var MatchedRules: js.UndefOr[MobileDeviceAccessMatchedRuleList]
  }

  object GetMobileDeviceAccessEffectResponse {
    @inline
    def apply(
        Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined,
        MatchedRules: js.UndefOr[MobileDeviceAccessMatchedRuleList] = js.undefined
    ): GetMobileDeviceAccessEffectResponse = {
      val __obj = js.Dynamic.literal()
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      MatchedRules.foreach(__v => __obj.updateDynamic("MatchedRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMobileDeviceAccessEffectResponse]
    }
  }

  @js.native
  trait GetMobileDeviceAccessOverrideRequest extends js.Object {
    var DeviceId: DeviceId
    var OrganizationId: OrganizationId
    var UserId: EntityIdentifier
  }

  object GetMobileDeviceAccessOverrideRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        OrganizationId: OrganizationId,
        UserId: EntityIdentifier
    ): GetMobileDeviceAccessOverrideRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMobileDeviceAccessOverrideRequest]
    }
  }

  @js.native
  trait GetMobileDeviceAccessOverrideResponse extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[MobileDeviceAccessRuleDescription]
    var DeviceId: js.UndefOr[DeviceId]
    var Effect: js.UndefOr[MobileDeviceAccessRuleEffect]
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object GetMobileDeviceAccessOverrideResponse {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined,
        UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): GetMobileDeviceAccessOverrideResponse = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMobileDeviceAccessOverrideResponse]
    }
  }

  /** The representation of an WorkMail group.
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

  /** The impersonation rule that matched the input.
    */
  @js.native
  trait ImpersonationMatchedRule extends js.Object {
    var ImpersonationRuleId: js.UndefOr[ImpersonationRuleId]
    var Name: js.UndefOr[ImpersonationRuleName]
  }

  object ImpersonationMatchedRule {
    @inline
    def apply(
        ImpersonationRuleId: js.UndefOr[ImpersonationRuleId] = js.undefined,
        Name: js.UndefOr[ImpersonationRuleName] = js.undefined
    ): ImpersonationMatchedRule = {
      val __obj = js.Dynamic.literal()
      ImpersonationRuleId.foreach(__v => __obj.updateDynamic("ImpersonationRuleId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImpersonationMatchedRule]
    }
  }

  /** An impersonation role for the given WorkMail organization.
    */
  @js.native
  trait ImpersonationRole extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var ImpersonationRoleId: js.UndefOr[ImpersonationRoleId]
    var Name: js.UndefOr[ImpersonationRoleName]
    var Type: js.UndefOr[ImpersonationRoleType]
  }

  object ImpersonationRole {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        ImpersonationRoleId: js.UndefOr[ImpersonationRoleId] = js.undefined,
        Name: js.UndefOr[ImpersonationRoleName] = js.undefined,
        Type: js.UndefOr[ImpersonationRoleType] = js.undefined
    ): ImpersonationRole = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      ImpersonationRoleId.foreach(__v => __obj.updateDynamic("ImpersonationRoleId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImpersonationRole]
    }
  }

  /** The rules for the given impersonation role.
    */
  @js.native
  trait ImpersonationRule extends js.Object {
    var Effect: AccessEffect
    var ImpersonationRuleId: ImpersonationRuleId
    var Description: js.UndefOr[ImpersonationRuleDescription]
    var Name: js.UndefOr[ImpersonationRuleName]
    var NotTargetUsers: js.UndefOr[TargetUsers]
    var TargetUsers: js.UndefOr[TargetUsers]
  }

  object ImpersonationRule {
    @inline
    def apply(
        Effect: AccessEffect,
        ImpersonationRuleId: ImpersonationRuleId,
        Description: js.UndefOr[ImpersonationRuleDescription] = js.undefined,
        Name: js.UndefOr[ImpersonationRuleName] = js.undefined,
        NotTargetUsers: js.UndefOr[TargetUsers] = js.undefined,
        TargetUsers: js.UndefOr[TargetUsers] = js.undefined
    ): ImpersonationRule = {
      val __obj = js.Dynamic.literal(
        "Effect" -> Effect.asInstanceOf[js.Any],
        "ImpersonationRuleId" -> ImpersonationRuleId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NotTargetUsers.foreach(__v => __obj.updateDynamic("NotTargetUsers")(__v.asInstanceOf[js.Any]))
      TargetUsers.foreach(__v => __obj.updateDynamic("TargetUsers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImpersonationRule]
    }
  }

  /** Describes a Lambda based availability provider.
    */
  @js.native
  trait LambdaAvailabilityProvider extends js.Object {
    var LambdaArn: LambdaArn
  }

  object LambdaAvailabilityProvider {
    @inline
    def apply(
        LambdaArn: LambdaArn
    ): LambdaAvailabilityProvider = {
      val __obj = js.Dynamic.literal(
        "LambdaArn" -> LambdaArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaAvailabilityProvider]
    }
  }

  @js.native
  trait ListAccessControlRulesRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object ListAccessControlRulesRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): ListAccessControlRulesRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListAccessControlRulesRequest]
    }
  }

  @js.native
  trait ListAccessControlRulesResponse extends js.Object {
    var Rules: js.UndefOr[AccessControlRulesList]
  }

  object ListAccessControlRulesResponse {
    @inline
    def apply(
        Rules: js.UndefOr[AccessControlRulesList] = js.undefined
    ): ListAccessControlRulesResponse = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessControlRulesResponse]
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
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
  trait ListAvailabilityConfigurationsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAvailabilityConfigurationsRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAvailabilityConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailabilityConfigurationsRequest]
    }
  }

  @js.native
  trait ListAvailabilityConfigurationsResponse extends js.Object {
    var AvailabilityConfigurations: js.UndefOr[AvailabilityConfigurationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAvailabilityConfigurationsResponse {
    @inline
    def apply(
        AvailabilityConfigurations: js.UndefOr[AvailabilityConfigurationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAvailabilityConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      AvailabilityConfigurations.foreach(__v => __obj.updateDynamic("AvailabilityConfigurations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailabilityConfigurationsResponse]
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
        "GroupId" -> GroupId.asInstanceOf[js.Any],
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
  trait ListImpersonationRolesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImpersonationRolesRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImpersonationRolesRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImpersonationRolesRequest]
    }
  }

  @js.native
  trait ListImpersonationRolesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Roles: js.UndefOr[ImpersonationRoleList]
  }

  object ListImpersonationRolesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Roles: js.UndefOr[ImpersonationRoleList] = js.undefined
    ): ListImpersonationRolesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Roles.foreach(__v => __obj.updateDynamic("Roles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImpersonationRolesResponse]
    }
  }

  @js.native
  trait ListMailDomainsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMailDomainsRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMailDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMailDomainsRequest]
    }
  }

  @js.native
  trait ListMailDomainsResponse extends js.Object {
    var MailDomains: js.UndefOr[MailDomains]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMailDomainsResponse {
    @inline
    def apply(
        MailDomains: js.UndefOr[MailDomains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMailDomainsResponse = {
      val __obj = js.Dynamic.literal()
      MailDomains.foreach(__v => __obj.updateDynamic("MailDomains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMailDomainsResponse]
    }
  }

  @js.native
  trait ListMailboxExportJobsRequest extends js.Object {
    var OrganizationId: OrganizationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMailboxExportJobsRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMailboxExportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMailboxExportJobsRequest]
    }
  }

  @js.native
  trait ListMailboxExportJobsResponse extends js.Object {
    var Jobs: js.UndefOr[Jobs]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMailboxExportJobsResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[Jobs] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMailboxExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMailboxExportJobsResponse]
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
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
  trait ListMobileDeviceAccessOverridesRequest extends js.Object {
    var OrganizationId: OrganizationId
    var DeviceId: js.UndefOr[DeviceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var UserId: js.UndefOr[EntityIdentifier]
  }

  object ListMobileDeviceAccessOverridesRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserId: js.UndefOr[EntityIdentifier] = js.undefined
    ): ListMobileDeviceAccessOverridesRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMobileDeviceAccessOverridesRequest]
    }
  }

  @js.native
  trait ListMobileDeviceAccessOverridesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Overrides: js.UndefOr[MobileDeviceAccessOverridesList]
  }

  object ListMobileDeviceAccessOverridesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Overrides: js.UndefOr[MobileDeviceAccessOverridesList] = js.undefined
    ): ListMobileDeviceAccessOverridesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Overrides.foreach(__v => __obj.updateDynamic("Overrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMobileDeviceAccessOverridesResponse]
    }
  }

  @js.native
  trait ListMobileDeviceAccessRulesRequest extends js.Object {
    var OrganizationId: OrganizationId
  }

  object ListMobileDeviceAccessRulesRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId
    ): ListMobileDeviceAccessRulesRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListMobileDeviceAccessRulesRequest]
    }
  }

  @js.native
  trait ListMobileDeviceAccessRulesResponse extends js.Object {
    var Rules: js.UndefOr[MobileDeviceAccessRulesList]
  }

  object ListMobileDeviceAccessRulesResponse {
    @inline
    def apply(
        Rules: js.UndefOr[MobileDeviceAccessRulesList] = js.undefined
    ): ListMobileDeviceAccessRulesResponse = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMobileDeviceAccessRulesResponse]
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
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
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
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
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

  /** The data for a given domain.
    */
  @js.native
  trait MailDomainSummary extends js.Object {
    var DefaultDomain: js.UndefOr[Boolean]
    var DomainName: js.UndefOr[DomainName]
  }

  object MailDomainSummary {
    @inline
    def apply(
        DefaultDomain: js.UndefOr[Boolean] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): MailDomainSummary = {
      val __obj = js.Dynamic.literal()
      DefaultDomain.foreach(__v => __obj.updateDynamic("DefaultDomain")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MailDomainSummary]
    }
  }

  /** The details of a mailbox export job, including the user or resource ID associated with the mailbox and the S3 bucket that the mailbox contents are exported to.
    */
  @js.native
  trait MailboxExportJob extends js.Object {
    var Description: js.UndefOr[Description]
    var EndTime: js.UndefOr[Timestamp]
    var EntityId: js.UndefOr[WorkMailIdentifier]
    var EstimatedProgress: js.UndefOr[Percentage]
    var JobId: js.UndefOr[MailboxExportJobId]
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3Path: js.UndefOr[S3ObjectKey]
    var StartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[MailboxExportJobState]
  }

  object MailboxExportJob {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EntityId: js.UndefOr[WorkMailIdentifier] = js.undefined,
        EstimatedProgress: js.UndefOr[Percentage] = js.undefined,
        JobId: js.UndefOr[MailboxExportJobId] = js.undefined,
        S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        S3Path: js.UndefOr[S3ObjectKey] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[MailboxExportJobState] = js.undefined
    ): MailboxExportJob = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      EstimatedProgress.foreach(__v => __obj.updateDynamic("EstimatedProgress")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3Path.foreach(__v => __obj.updateDynamic("S3Path")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MailboxExportJob]
    }
  }

  /** The representation of a user or group.
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

  /** The rule that a simulated user matches.
    */
  @js.native
  trait MobileDeviceAccessMatchedRule extends js.Object {
    var MobileDeviceAccessRuleId: js.UndefOr[MobileDeviceAccessRuleId]
    var Name: js.UndefOr[MobileDeviceAccessRuleName]
  }

  object MobileDeviceAccessMatchedRule {
    @inline
    def apply(
        MobileDeviceAccessRuleId: js.UndefOr[MobileDeviceAccessRuleId] = js.undefined,
        Name: js.UndefOr[MobileDeviceAccessRuleName] = js.undefined
    ): MobileDeviceAccessMatchedRule = {
      val __obj = js.Dynamic.literal()
      MobileDeviceAccessRuleId.foreach(__v => __obj.updateDynamic("MobileDeviceAccessRuleId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MobileDeviceAccessMatchedRule]
    }
  }

  /** The override object.
    */
  @js.native
  trait MobileDeviceAccessOverride extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[MobileDeviceAccessRuleDescription]
    var DeviceId: js.UndefOr[DeviceId]
    var Effect: js.UndefOr[MobileDeviceAccessRuleEffect]
    var UserId: js.UndefOr[WorkMailIdentifier]
  }

  object MobileDeviceAccessOverride {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined,
        UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
    ): MobileDeviceAccessOverride = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MobileDeviceAccessOverride]
    }
  }

  /** A rule that controls access to mobile devices for an WorkMail group.
    */
  @js.native
  trait MobileDeviceAccessRule extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[MobileDeviceAccessRuleDescription]
    var DeviceModels: js.UndefOr[DeviceModelList]
    var DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList]
    var DeviceTypes: js.UndefOr[DeviceTypeList]
    var DeviceUserAgents: js.UndefOr[DeviceUserAgentList]
    var Effect: js.UndefOr[MobileDeviceAccessRuleEffect]
    var MobileDeviceAccessRuleId: js.UndefOr[MobileDeviceAccessRuleId]
    var Name: js.UndefOr[MobileDeviceAccessRuleName]
    var NotDeviceModels: js.UndefOr[DeviceModelList]
    var NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList]
    var NotDeviceTypes: js.UndefOr[DeviceTypeList]
    var NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList]
  }

  object MobileDeviceAccessRule {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined,
        DeviceModels: js.UndefOr[DeviceModelList] = js.undefined,
        DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined,
        DeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined,
        DeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined,
        Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined,
        MobileDeviceAccessRuleId: js.UndefOr[MobileDeviceAccessRuleId] = js.undefined,
        Name: js.UndefOr[MobileDeviceAccessRuleName] = js.undefined,
        NotDeviceModels: js.UndefOr[DeviceModelList] = js.undefined,
        NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined,
        NotDeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined,
        NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
    ): MobileDeviceAccessRule = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceModels.foreach(__v => __obj.updateDynamic("DeviceModels")(__v.asInstanceOf[js.Any]))
      DeviceOperatingSystems.foreach(__v => __obj.updateDynamic("DeviceOperatingSystems")(__v.asInstanceOf[js.Any]))
      DeviceTypes.foreach(__v => __obj.updateDynamic("DeviceTypes")(__v.asInstanceOf[js.Any]))
      DeviceUserAgents.foreach(__v => __obj.updateDynamic("DeviceUserAgents")(__v.asInstanceOf[js.Any]))
      Effect.foreach(__v => __obj.updateDynamic("Effect")(__v.asInstanceOf[js.Any]))
      MobileDeviceAccessRuleId.foreach(__v => __obj.updateDynamic("MobileDeviceAccessRuleId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NotDeviceModels.foreach(__v => __obj.updateDynamic("NotDeviceModels")(__v.asInstanceOf[js.Any]))
      NotDeviceOperatingSystems.foreach(__v => __obj.updateDynamic("NotDeviceOperatingSystems")(__v.asInstanceOf[js.Any]))
      NotDeviceTypes.foreach(__v => __obj.updateDynamic("NotDeviceTypes")(__v.asInstanceOf[js.Any]))
      NotDeviceUserAgents.foreach(__v => __obj.updateDynamic("NotDeviceUserAgents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MobileDeviceAccessRule]
    }
  }

  /** The representation of an organization.
    */
  @js.native
  trait OrganizationSummary extends js.Object {
    var Alias: js.UndefOr[OrganizationName]
    var DefaultMailDomain: js.UndefOr[DomainName]
    var ErrorMessage: js.UndefOr[String]
    var OrganizationId: js.UndefOr[OrganizationId]
    var State: js.UndefOr[String]
  }

  object OrganizationSummary {
    @inline
    def apply(
        Alias: js.UndefOr[OrganizationName] = js.undefined,
        DefaultMailDomain: js.UndefOr[DomainName] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): OrganizationSummary = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      DefaultMailDomain.foreach(__v => __obj.updateDynamic("DefaultMailDomain")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationSummary]
    }
  }

  /** Permission granted to a user, group, or resource to access a certain aspect of another user, group, or resource mailbox.
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
        "GranteeId" -> GranteeId.asInstanceOf[js.Any],
        "GranteeType" -> GranteeType.asInstanceOf[js.Any],
        "PermissionValues" -> PermissionValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Permission]
    }
  }

  @js.native
  trait PutAccessControlRuleRequest extends js.Object {
    var Description: AccessControlRuleDescription
    var Effect: AccessControlRuleEffect
    var Name: AccessControlRuleName
    var OrganizationId: OrganizationId
    var Actions: js.UndefOr[ActionsList]
    var ImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList]
    var IpRanges: js.UndefOr[IpRangeList]
    var NotActions: js.UndefOr[ActionsList]
    var NotImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList]
    var NotIpRanges: js.UndefOr[IpRangeList]
    var NotUserIds: js.UndefOr[UserIdList]
    var UserIds: js.UndefOr[UserIdList]
  }

  object PutAccessControlRuleRequest {
    @inline
    def apply(
        Description: AccessControlRuleDescription,
        Effect: AccessControlRuleEffect,
        Name: AccessControlRuleName,
        OrganizationId: OrganizationId,
        Actions: js.UndefOr[ActionsList] = js.undefined,
        ImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList] = js.undefined,
        IpRanges: js.UndefOr[IpRangeList] = js.undefined,
        NotActions: js.UndefOr[ActionsList] = js.undefined,
        NotImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList] = js.undefined,
        NotIpRanges: js.UndefOr[IpRangeList] = js.undefined,
        NotUserIds: js.UndefOr[UserIdList] = js.undefined,
        UserIds: js.UndefOr[UserIdList] = js.undefined
    ): PutAccessControlRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "Effect" -> Effect.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ImpersonationRoleIds.foreach(__v => __obj.updateDynamic("ImpersonationRoleIds")(__v.asInstanceOf[js.Any]))
      IpRanges.foreach(__v => __obj.updateDynamic("IpRanges")(__v.asInstanceOf[js.Any]))
      NotActions.foreach(__v => __obj.updateDynamic("NotActions")(__v.asInstanceOf[js.Any]))
      NotImpersonationRoleIds.foreach(__v => __obj.updateDynamic("NotImpersonationRoleIds")(__v.asInstanceOf[js.Any]))
      NotIpRanges.foreach(__v => __obj.updateDynamic("NotIpRanges")(__v.asInstanceOf[js.Any]))
      NotUserIds.foreach(__v => __obj.updateDynamic("NotUserIds")(__v.asInstanceOf[js.Any]))
      UserIds.foreach(__v => __obj.updateDynamic("UserIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccessControlRuleRequest]
    }
  }

  @js.native
  trait PutAccessControlRuleResponse extends js.Object

  object PutAccessControlRuleResponse {
    @inline
    def apply(): PutAccessControlRuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccessControlRuleResponse]
    }
  }

  @js.native
  trait PutEmailMonitoringConfigurationRequest extends js.Object {
    var LogGroupArn: LogGroupArn
    var OrganizationId: OrganizationId
    var RoleArn: RoleArn
  }

  object PutEmailMonitoringConfigurationRequest {
    @inline
    def apply(
        LogGroupArn: LogGroupArn,
        OrganizationId: OrganizationId,
        RoleArn: RoleArn
    ): PutEmailMonitoringConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LogGroupArn" -> LogGroupArn.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutEmailMonitoringConfigurationRequest]
    }
  }

  @js.native
  trait PutEmailMonitoringConfigurationResponse extends js.Object

  object PutEmailMonitoringConfigurationResponse {
    @inline
    def apply(): PutEmailMonitoringConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEmailMonitoringConfigurationResponse]
    }
  }

  @js.native
  trait PutInboundDmarcSettingsRequest extends js.Object {
    var Enforced: BooleanObject
    var OrganizationId: OrganizationId
  }

  object PutInboundDmarcSettingsRequest {
    @inline
    def apply(
        Enforced: BooleanObject,
        OrganizationId: OrganizationId
    ): PutInboundDmarcSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "Enforced" -> Enforced.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutInboundDmarcSettingsRequest]
    }
  }

  @js.native
  trait PutInboundDmarcSettingsResponse extends js.Object

  object PutInboundDmarcSettingsResponse {
    @inline
    def apply(): PutInboundDmarcSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutInboundDmarcSettingsResponse]
    }
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
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "GranteeId" -> GranteeId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "PermissionValues" -> PermissionValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutMailboxPermissionsRequest]
    }
  }

  @js.native
  trait PutMailboxPermissionsResponse extends js.Object

  object PutMailboxPermissionsResponse {
    @inline
    def apply(): PutMailboxPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutMailboxPermissionsResponse]
    }
  }

  @js.native
  trait PutMobileDeviceAccessOverrideRequest extends js.Object {
    var DeviceId: DeviceId
    var Effect: MobileDeviceAccessRuleEffect
    var OrganizationId: OrganizationId
    var UserId: EntityIdentifier
    var Description: js.UndefOr[MobileDeviceAccessRuleDescription]
  }

  object PutMobileDeviceAccessOverrideRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        Effect: MobileDeviceAccessRuleEffect,
        OrganizationId: OrganizationId,
        UserId: EntityIdentifier,
        Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined
    ): PutMobileDeviceAccessOverrideRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Effect" -> Effect.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMobileDeviceAccessOverrideRequest]
    }
  }

  @js.native
  trait PutMobileDeviceAccessOverrideResponse extends js.Object

  object PutMobileDeviceAccessOverrideResponse {
    @inline
    def apply(): PutMobileDeviceAccessOverrideResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutMobileDeviceAccessOverrideResponse]
    }
  }

  @js.native
  trait PutRetentionPolicyRequest extends js.Object {
    var FolderConfigurations: FolderConfigurations
    var Name: ShortString
    var OrganizationId: OrganizationId
    var Description: js.UndefOr[PolicyDescription]
    var Id: js.UndefOr[ShortString]
  }

  object PutRetentionPolicyRequest {
    @inline
    def apply(
        FolderConfigurations: FolderConfigurations,
        Name: ShortString,
        OrganizationId: OrganizationId,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        Id: js.UndefOr[ShortString] = js.undefined
    ): PutRetentionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FolderConfigurations" -> FolderConfigurations.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRetentionPolicyRequest]
    }
  }

  @js.native
  trait PutRetentionPolicyResponse extends js.Object

  object PutRetentionPolicyResponse {
    @inline
    def apply(): PutRetentionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRetentionPolicyResponse]
    }
  }

  /** Describes an EWS based availability provider when returned from the service. It does not contain the password of the endpoint.
    */
  @js.native
  trait RedactedEwsAvailabilityProvider extends js.Object {
    var EwsEndpoint: js.UndefOr[Url]
    var EwsUsername: js.UndefOr[ExternalUserName]
  }

  object RedactedEwsAvailabilityProvider {
    @inline
    def apply(
        EwsEndpoint: js.UndefOr[Url] = js.undefined,
        EwsUsername: js.UndefOr[ExternalUserName] = js.undefined
    ): RedactedEwsAvailabilityProvider = {
      val __obj = js.Dynamic.literal()
      EwsEndpoint.foreach(__v => __obj.updateDynamic("EwsEndpoint")(__v.asInstanceOf[js.Any]))
      EwsUsername.foreach(__v => __obj.updateDynamic("EwsUsername")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedactedEwsAvailabilityProvider]
    }
  }

  @js.native
  trait RegisterMailDomainRequest extends js.Object {
    var DomainName: WorkMailDomainName
    var OrganizationId: OrganizationId
    var ClientToken: js.UndefOr[IdempotencyClientToken]
  }

  object RegisterMailDomainRequest {
    @inline
    def apply(
        DomainName: WorkMailDomainName,
        OrganizationId: OrganizationId,
        ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
    ): RegisterMailDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterMailDomainRequest]
    }
  }

  @js.native
  trait RegisterMailDomainResponse extends js.Object

  object RegisterMailDomainResponse {
    @inline
    def apply(): RegisterMailDomainResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterMailDomainResponse]
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
        "Email" -> Email.asInstanceOf[js.Any],
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterToWorkMailRequest]
    }
  }

  @js.native
  trait RegisterToWorkMailResponse extends js.Object

  object RegisterToWorkMailResponse {
    @inline
    def apply(): RegisterToWorkMailResponse = {
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
        "Password" -> Password.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResetPasswordRequest]
    }
  }

  @js.native
  trait ResetPasswordResponse extends js.Object

  object ResetPasswordResponse {
    @inline
    def apply(): ResetPasswordResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetPasswordResponse]
    }
  }

  /** The representation of a resource.
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

  @js.native
  trait StartMailboxExportJobRequest extends js.Object {
    var ClientToken: IdempotencyClientToken
    var EntityId: WorkMailIdentifier
    var KmsKeyArn: KmsKeyArn
    var OrganizationId: OrganizationId
    var RoleArn: RoleArn
    var S3BucketName: S3BucketName
    var S3Prefix: S3ObjectKey
    var Description: js.UndefOr[Description]
  }

  object StartMailboxExportJobRequest {
    @inline
    def apply(
        ClientToken: IdempotencyClientToken,
        EntityId: WorkMailIdentifier,
        KmsKeyArn: KmsKeyArn,
        OrganizationId: OrganizationId,
        RoleArn: RoleArn,
        S3BucketName: S3BucketName,
        S3Prefix: S3ObjectKey,
        Description: js.UndefOr[Description] = js.undefined
    ): StartMailboxExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "KmsKeyArn" -> KmsKeyArn.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any],
        "S3Prefix" -> S3Prefix.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMailboxExportJobRequest]
    }
  }

  @js.native
  trait StartMailboxExportJobResponse extends js.Object {
    var JobId: js.UndefOr[MailboxExportJobId]
  }

  object StartMailboxExportJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[MailboxExportJobId] = js.undefined
    ): StartMailboxExportJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMailboxExportJobResponse]
    }
  }

  /** Describes a tag applied to a resource.
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
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait TestAvailabilityConfigurationRequest extends js.Object {
    var OrganizationId: OrganizationId
    var DomainName: js.UndefOr[DomainName]
    var EwsProvider: js.UndefOr[EwsAvailabilityProvider]
    var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider]
  }

  object TestAvailabilityConfigurationRequest {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        EwsProvider: js.UndefOr[EwsAvailabilityProvider] = js.undefined,
        LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
    ): TestAvailabilityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      EwsProvider.foreach(__v => __obj.updateDynamic("EwsProvider")(__v.asInstanceOf[js.Any]))
      LambdaProvider.foreach(__v => __obj.updateDynamic("LambdaProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestAvailabilityConfigurationRequest]
    }
  }

  @js.native
  trait TestAvailabilityConfigurationResponse extends js.Object {
    var FailureReason: js.UndefOr[String]
    var TestPassed: js.UndefOr[Boolean]
  }

  object TestAvailabilityConfigurationResponse {
    @inline
    def apply(
        FailureReason: js.UndefOr[String] = js.undefined,
        TestPassed: js.UndefOr[Boolean] = js.undefined
    ): TestAvailabilityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      TestPassed.foreach(__v => __obj.updateDynamic("TestPassed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestAvailabilityConfigurationResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAvailabilityConfigurationRequest extends js.Object {
    var DomainName: DomainName
    var OrganizationId: OrganizationId
    var EwsProvider: js.UndefOr[EwsAvailabilityProvider]
    var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider]
  }

  object UpdateAvailabilityConfigurationRequest {
    @inline
    def apply(
        DomainName: DomainName,
        OrganizationId: OrganizationId,
        EwsProvider: js.UndefOr[EwsAvailabilityProvider] = js.undefined,
        LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
    ): UpdateAvailabilityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      EwsProvider.foreach(__v => __obj.updateDynamic("EwsProvider")(__v.asInstanceOf[js.Any]))
      LambdaProvider.foreach(__v => __obj.updateDynamic("LambdaProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAvailabilityConfigurationRequest]
    }
  }

  @js.native
  trait UpdateAvailabilityConfigurationResponse extends js.Object

  object UpdateAvailabilityConfigurationResponse {
    @inline
    def apply(): UpdateAvailabilityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAvailabilityConfigurationResponse]
    }
  }

  @js.native
  trait UpdateDefaultMailDomainRequest extends js.Object {
    var DomainName: WorkMailDomainName
    var OrganizationId: OrganizationId
  }

  object UpdateDefaultMailDomainRequest {
    @inline
    def apply(
        DomainName: WorkMailDomainName,
        OrganizationId: OrganizationId
    ): UpdateDefaultMailDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDefaultMailDomainRequest]
    }
  }

  @js.native
  trait UpdateDefaultMailDomainResponse extends js.Object

  object UpdateDefaultMailDomainResponse {
    @inline
    def apply(): UpdateDefaultMailDomainResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDefaultMailDomainResponse]
    }
  }

  @js.native
  trait UpdateImpersonationRoleRequest extends js.Object {
    var ImpersonationRoleId: ImpersonationRoleId
    var Name: ImpersonationRoleName
    var OrganizationId: OrganizationId
    var Rules: ImpersonationRuleList
    var Type: ImpersonationRoleType
    var Description: js.UndefOr[ImpersonationRoleDescription]
  }

  object UpdateImpersonationRoleRequest {
    @inline
    def apply(
        ImpersonationRoleId: ImpersonationRoleId,
        Name: ImpersonationRoleName,
        OrganizationId: OrganizationId,
        Rules: ImpersonationRuleList,
        Type: ImpersonationRoleType,
        Description: js.UndefOr[ImpersonationRoleDescription] = js.undefined
    ): UpdateImpersonationRoleRequest = {
      val __obj = js.Dynamic.literal(
        "ImpersonationRoleId" -> ImpersonationRoleId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateImpersonationRoleRequest]
    }
  }

  @js.native
  trait UpdateImpersonationRoleResponse extends js.Object

  object UpdateImpersonationRoleResponse {
    @inline
    def apply(): UpdateImpersonationRoleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateImpersonationRoleResponse]
    }
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
        "MailboxQuota" -> MailboxQuota.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateMailboxQuotaRequest]
    }
  }

  @js.native
  trait UpdateMailboxQuotaResponse extends js.Object

  object UpdateMailboxQuotaResponse {
    @inline
    def apply(): UpdateMailboxQuotaResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMailboxQuotaResponse]
    }
  }

  @js.native
  trait UpdateMobileDeviceAccessRuleRequest extends js.Object {
    var Effect: MobileDeviceAccessRuleEffect
    var MobileDeviceAccessRuleId: MobileDeviceAccessRuleId
    var Name: MobileDeviceAccessRuleName
    var OrganizationId: OrganizationId
    var Description: js.UndefOr[MobileDeviceAccessRuleDescription]
    var DeviceModels: js.UndefOr[DeviceModelList]
    var DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList]
    var DeviceTypes: js.UndefOr[DeviceTypeList]
    var DeviceUserAgents: js.UndefOr[DeviceUserAgentList]
    var NotDeviceModels: js.UndefOr[DeviceModelList]
    var NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList]
    var NotDeviceTypes: js.UndefOr[DeviceTypeList]
    var NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList]
  }

  object UpdateMobileDeviceAccessRuleRequest {
    @inline
    def apply(
        Effect: MobileDeviceAccessRuleEffect,
        MobileDeviceAccessRuleId: MobileDeviceAccessRuleId,
        Name: MobileDeviceAccessRuleName,
        OrganizationId: OrganizationId,
        Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined,
        DeviceModels: js.UndefOr[DeviceModelList] = js.undefined,
        DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined,
        DeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined,
        DeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined,
        NotDeviceModels: js.UndefOr[DeviceModelList] = js.undefined,
        NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined,
        NotDeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined,
        NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
    ): UpdateMobileDeviceAccessRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Effect" -> Effect.asInstanceOf[js.Any],
        "MobileDeviceAccessRuleId" -> MobileDeviceAccessRuleId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceModels.foreach(__v => __obj.updateDynamic("DeviceModels")(__v.asInstanceOf[js.Any]))
      DeviceOperatingSystems.foreach(__v => __obj.updateDynamic("DeviceOperatingSystems")(__v.asInstanceOf[js.Any]))
      DeviceTypes.foreach(__v => __obj.updateDynamic("DeviceTypes")(__v.asInstanceOf[js.Any]))
      DeviceUserAgents.foreach(__v => __obj.updateDynamic("DeviceUserAgents")(__v.asInstanceOf[js.Any]))
      NotDeviceModels.foreach(__v => __obj.updateDynamic("NotDeviceModels")(__v.asInstanceOf[js.Any]))
      NotDeviceOperatingSystems.foreach(__v => __obj.updateDynamic("NotDeviceOperatingSystems")(__v.asInstanceOf[js.Any]))
      NotDeviceTypes.foreach(__v => __obj.updateDynamic("NotDeviceTypes")(__v.asInstanceOf[js.Any]))
      NotDeviceUserAgents.foreach(__v => __obj.updateDynamic("NotDeviceUserAgents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMobileDeviceAccessRuleRequest]
    }
  }

  @js.native
  trait UpdateMobileDeviceAccessRuleResponse extends js.Object

  object UpdateMobileDeviceAccessRuleResponse {
    @inline
    def apply(): UpdateMobileDeviceAccessRuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMobileDeviceAccessRuleResponse]
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
        "Email" -> Email.asInstanceOf[js.Any],
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePrimaryEmailAddressRequest]
    }
  }

  @js.native
  trait UpdatePrimaryEmailAddressResponse extends js.Object

  object UpdatePrimaryEmailAddressResponse {
    @inline
    def apply(): UpdatePrimaryEmailAddressResponse = {
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
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      BookingOptions.foreach(__v => __obj.updateDynamic("BookingOptions")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceRequest]
    }
  }

  @js.native
  trait UpdateResourceResponse extends js.Object

  object UpdateResourceResponse {
    @inline
    def apply(): UpdateResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourceResponse]
    }
  }

  /** The representation of an WorkMail user.
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
}
