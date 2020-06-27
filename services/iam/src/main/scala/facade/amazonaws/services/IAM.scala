package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iam {
  type AccessDetails                                   = js.Array[AccessDetail]
  type ActionNameListType                              = js.Array[ActionNameType]
  type ActionNameType                                  = String
  type ArnListType                                     = js.Array[arnType]
  type BootstrapDatum                                  = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ColumnNumber                                    = Int
  type ContextEntryListType                            = js.Array[ContextEntry]
  type ContextKeyNameType                              = String
  type ContextKeyNamesResultListType                   = js.Array[ContextKeyNameType]
  type ContextKeyValueListType                         = js.Array[ContextKeyValueType]
  type ContextKeyValueType                             = String
  type DeletionTaskIdType                              = String
  type EvalDecisionDetailsType                         = js.Dictionary[PolicyEvaluationDecisionType]
  type EvalDecisionSourceType                          = String
  type EvaluationResultsListType                       = js.Array[EvaluationResult]
  type LineNumber                                      = Int
  type ManagedPolicyDetailListType                     = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType                   = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType                    = String
  type PolicyGroupListType                             = js.Array[PolicyGroup]
  type PolicyIdentifierType                            = String
  type PolicyRoleListType                              = js.Array[PolicyRole]
  type PolicyUserListType                              = js.Array[PolicyUser]
  type ReasonType                                      = String
  type RegionNameType                                  = String
  type ReportContentType                               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReportStateDescriptionType                      = String
  type ResourceHandlingOptionType                      = String
  type ResourceNameListType                            = js.Array[ResourceNameType]
  type ResourceNameType                                = String
  type ResourceSpecificResultListType                  = js.Array[ResourceSpecificResult]
  type RoleUsageListType                               = js.Array[RoleUsageType]
  type SAMLMetadataDocumentType                        = String
  type SAMLProviderListType                            = js.Array[SAMLProviderListEntry]
  type SAMLProviderNameType                            = String
  type SSHPublicKeyListType                            = js.Array[SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType              = js.Array[ServiceSpecificCredentialMetadata]
  type ServicesLastAccessed                            = js.Array[ServiceLastAccessed]
  type SimulationPolicyListType                        = js.Array[policyDocumentType]
  type StatementListType                               = js.Array[Statement]
  type accessKeyIdType                                 = String
  type accessKeyMetadataListType                       = js.Array[AccessKeyMetadata]
  type accessKeySecretType                             = String
  type accountAliasListType                            = js.Array[accountAliasType]
  type accountAliasType                                = String
  type arnType                                         = String
  type attachedPoliciesListType                        = js.Array[AttachedPolicy]
  type attachmentCountType                             = Int
  type authenticationCodeType                          = String
  type booleanObjectType                               = Boolean
  type booleanType                                     = Boolean
  type certificateBodyType                             = String
  type certificateChainType                            = String
  type certificateIdType                               = String
  type certificateListType                             = js.Array[SigningCertificate]
  type clientIDListType                                = js.Array[clientIDType]
  type clientIDType                                    = String
  type customSuffixType                                = String
  type dateType                                        = js.Date
  type entityDetailsListType                           = js.Array[EntityDetails]
  type entityListType                                  = js.Array[EntityType]
  type entityNameType                                  = String
  type existingUserNameType                            = String
  type groupDetailListType                             = js.Array[GroupDetail]
  type groupListType                                   = js.Array[Group]
  type groupNameListType                               = js.Array[groupNameType]
  type groupNameType                                   = String
  type idType                                          = String
  type instanceProfileListType                         = js.Array[InstanceProfile]
  type instanceProfileNameType                         = String
  type integerType                                     = Int
  type jobIDType                                       = String
  type listPolicyGrantingServiceAccessResponseListType = js.Array[ListPoliciesGrantingServiceAccessEntry]
  type markerType                                      = String
  type maxItemsType                                    = Int
  type maxPasswordAgeType                              = Int
  type mfaDeviceListType                               = js.Array[MFADevice]
  type minimumPasswordLengthType                       = Int
  type organizationsEntityPathType                     = String
  type organizationsPolicyIdType                       = String
  type passwordReusePreventionType                     = Int
  type passwordType                                    = String
  type pathPrefixType                                  = String
  type pathType                                        = String
  type policyDescriptionType                           = String
  type policyDetailListType                            = js.Array[PolicyDetail]
  type policyDocumentType                              = String
  type policyDocumentVersionListType                   = js.Array[PolicyVersion]
  type policyGrantingServiceAccessListType             = js.Array[PolicyGrantingServiceAccess]
  type policyListType                                  = js.Array[Policy]
  type policyNameListType                              = js.Array[policyNameType]
  type policyNameType                                  = String
  type policyPathType                                  = String
  type policyVersionIdType                             = String
  type privateKeyType                                  = String
  type publicKeyFingerprintType                        = String
  type publicKeyIdType                                 = String
  type publicKeyMaterialType                           = String
  type responseMarkerType                              = String
  type roleDescriptionType                             = String
  type roleDetailListType                              = js.Array[RoleDetail]
  type roleListType                                    = js.Array[Role]
  type roleMaxSessionDurationType                      = Int
  type roleNameType                                    = String
  type serialNumberType                                = String
  type serverCertificateMetadataListType               = js.Array[ServerCertificateMetadata]
  type serverCertificateNameType                       = String
  type serviceName                                     = String
  type serviceNameType                                 = String
  type serviceNamespaceListType                        = js.Array[serviceNamespaceType]
  type serviceNamespaceType                            = String
  type servicePassword                                 = String
  type serviceSpecificCredentialId                     = String
  type serviceUserName                                 = String
  type stringType                                      = String
  type summaryMapType                                  = js.Dictionary[summaryValueType]
  type summaryValueType                                = Int
  type tagKeyListType                                  = js.Array[tagKeyType]
  type tagKeyType                                      = String
  type tagListType                                     = js.Array[Tag]
  type tagValueType                                    = String
  type thumbprintListType                              = js.Array[thumbprintType]
  type thumbprintType                                  = String
  type userDetailListType                              = js.Array[UserDetail]
  type userListType                                    = js.Array[User]
  type userNameType                                    = String
  type virtualMFADeviceListType                        = js.Array[VirtualMFADevice]
  type virtualMFADeviceName                            = String

  implicit final class IAMOps(private val service: IAM) extends AnyVal {

    @inline def addClientIDToOpenIDConnectProviderFuture(
        params: AddClientIDToOpenIDConnectProviderRequest
    ): Future[js.Object] = service.addClientIDToOpenIDConnectProvider(params).promise().toFuture
    @inline def addRoleToInstanceProfileFuture(params: AddRoleToInstanceProfileRequest): Future[js.Object] =
      service.addRoleToInstanceProfile(params).promise().toFuture
    @inline def addUserToGroupFuture(params: AddUserToGroupRequest): Future[js.Object] =
      service.addUserToGroup(params).promise().toFuture
    @inline def attachGroupPolicyFuture(params: AttachGroupPolicyRequest): Future[js.Object] =
      service.attachGroupPolicy(params).promise().toFuture
    @inline def attachRolePolicyFuture(params: AttachRolePolicyRequest): Future[js.Object] =
      service.attachRolePolicy(params).promise().toFuture
    @inline def attachUserPolicyFuture(params: AttachUserPolicyRequest): Future[js.Object] =
      service.attachUserPolicy(params).promise().toFuture
    @inline def changePasswordFuture(params: ChangePasswordRequest): Future[js.Object] =
      service.changePassword(params).promise().toFuture
    @inline def createAccessKeyFuture(params: CreateAccessKeyRequest): Future[CreateAccessKeyResponse] =
      service.createAccessKey(params).promise().toFuture
    @inline def createAccountAliasFuture(params: CreateAccountAliasRequest): Future[js.Object] =
      service.createAccountAlias(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise().toFuture
    @inline def createInstanceProfileFuture(
        params: CreateInstanceProfileRequest
    ): Future[CreateInstanceProfileResponse] = service.createInstanceProfile(params).promise().toFuture
    @inline def createLoginProfileFuture(params: CreateLoginProfileRequest): Future[CreateLoginProfileResponse] =
      service.createLoginProfile(params).promise().toFuture
    @inline def createOpenIDConnectProviderFuture(
        params: CreateOpenIDConnectProviderRequest
    ): Future[CreateOpenIDConnectProviderResponse] = service.createOpenIDConnectProvider(params).promise().toFuture
    @inline def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise().toFuture
    @inline def createPolicyVersionFuture(params: CreatePolicyVersionRequest): Future[CreatePolicyVersionResponse] =
      service.createPolicyVersion(params).promise().toFuture
    @inline def createRoleFuture(params: CreateRoleRequest): Future[CreateRoleResponse] =
      service.createRole(params).promise().toFuture
    @inline def createSAMLProviderFuture(params: CreateSAMLProviderRequest): Future[CreateSAMLProviderResponse] =
      service.createSAMLProvider(params).promise().toFuture
    @inline def createServiceLinkedRoleFuture(
        params: CreateServiceLinkedRoleRequest
    ): Future[CreateServiceLinkedRoleResponse] = service.createServiceLinkedRole(params).promise().toFuture
    @inline def createServiceSpecificCredentialFuture(
        params: CreateServiceSpecificCredentialRequest
    ): Future[CreateServiceSpecificCredentialResponse] =
      service.createServiceSpecificCredential(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def createVirtualMFADeviceFuture(
        params: CreateVirtualMFADeviceRequest
    ): Future[CreateVirtualMFADeviceResponse] = service.createVirtualMFADevice(params).promise().toFuture
    @inline def deactivateMFADeviceFuture(params: DeactivateMFADeviceRequest): Future[js.Object] =
      service.deactivateMFADevice(params).promise().toFuture
    @inline def deleteAccessKeyFuture(params: DeleteAccessKeyRequest): Future[js.Object] =
      service.deleteAccessKey(params).promise().toFuture
    @inline def deleteAccountAliasFuture(params: DeleteAccountAliasRequest): Future[js.Object] =
      service.deleteAccountAlias(params).promise().toFuture
    @inline def deleteAccountPasswordPolicyFuture(): Future[js.Object] =
      service.deleteAccountPasswordPolicy().promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[js.Object] =
      service.deleteGroup(params).promise().toFuture
    @inline def deleteGroupPolicyFuture(params: DeleteGroupPolicyRequest): Future[js.Object] =
      service.deleteGroupPolicy(params).promise().toFuture
    @inline def deleteInstanceProfileFuture(params: DeleteInstanceProfileRequest): Future[js.Object] =
      service.deleteInstanceProfile(params).promise().toFuture
    @inline def deleteLoginProfileFuture(params: DeleteLoginProfileRequest): Future[js.Object] =
      service.deleteLoginProfile(params).promise().toFuture
    @inline def deleteOpenIDConnectProviderFuture(params: DeleteOpenIDConnectProviderRequest): Future[js.Object] =
      service.deleteOpenIDConnectProvider(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise().toFuture
    @inline def deletePolicyVersionFuture(params: DeletePolicyVersionRequest): Future[js.Object] =
      service.deletePolicyVersion(params).promise().toFuture
    @inline def deleteRoleFuture(params: DeleteRoleRequest): Future[js.Object] =
      service.deleteRole(params).promise().toFuture
    @inline def deleteRolePermissionsBoundaryFuture(params: DeleteRolePermissionsBoundaryRequest): Future[js.Object] =
      service.deleteRolePermissionsBoundary(params).promise().toFuture
    @inline def deleteRolePolicyFuture(params: DeleteRolePolicyRequest): Future[js.Object] =
      service.deleteRolePolicy(params).promise().toFuture
    @inline def deleteSAMLProviderFuture(params: DeleteSAMLProviderRequest): Future[js.Object] =
      service.deleteSAMLProvider(params).promise().toFuture
    @inline def deleteSSHPublicKeyFuture(params: DeleteSSHPublicKeyRequest): Future[js.Object] =
      service.deleteSSHPublicKey(params).promise().toFuture
    @inline def deleteServerCertificateFuture(params: DeleteServerCertificateRequest): Future[js.Object] =
      service.deleteServerCertificate(params).promise().toFuture
    @inline def deleteServiceLinkedRoleFuture(
        params: DeleteServiceLinkedRoleRequest
    ): Future[DeleteServiceLinkedRoleResponse] = service.deleteServiceLinkedRole(params).promise().toFuture
    @inline def deleteServiceSpecificCredentialFuture(
        params: DeleteServiceSpecificCredentialRequest
    ): Future[js.Object] = service.deleteServiceSpecificCredential(params).promise().toFuture
    @inline def deleteSigningCertificateFuture(params: DeleteSigningCertificateRequest): Future[js.Object] =
      service.deleteSigningCertificate(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] =
      service.deleteUser(params).promise().toFuture
    @inline def deleteUserPermissionsBoundaryFuture(params: DeleteUserPermissionsBoundaryRequest): Future[js.Object] =
      service.deleteUserPermissionsBoundary(params).promise().toFuture
    @inline def deleteUserPolicyFuture(params: DeleteUserPolicyRequest): Future[js.Object] =
      service.deleteUserPolicy(params).promise().toFuture
    @inline def deleteVirtualMFADeviceFuture(params: DeleteVirtualMFADeviceRequest): Future[js.Object] =
      service.deleteVirtualMFADevice(params).promise().toFuture
    @inline def detachGroupPolicyFuture(params: DetachGroupPolicyRequest): Future[js.Object] =
      service.detachGroupPolicy(params).promise().toFuture
    @inline def detachRolePolicyFuture(params: DetachRolePolicyRequest): Future[js.Object] =
      service.detachRolePolicy(params).promise().toFuture
    @inline def detachUserPolicyFuture(params: DetachUserPolicyRequest): Future[js.Object] =
      service.detachUserPolicy(params).promise().toFuture
    @inline def enableMFADeviceFuture(params: EnableMFADeviceRequest): Future[js.Object] =
      service.enableMFADevice(params).promise().toFuture
    @inline def generateCredentialReportFuture(): Future[GenerateCredentialReportResponse] =
      service.generateCredentialReport().promise().toFuture
    @inline def generateOrganizationsAccessReportFuture(
        params: GenerateOrganizationsAccessReportRequest
    ): Future[GenerateOrganizationsAccessReportResponse] =
      service.generateOrganizationsAccessReport(params).promise().toFuture
    @inline def generateServiceLastAccessedDetailsFuture(
        params: GenerateServiceLastAccessedDetailsRequest
    ): Future[GenerateServiceLastAccessedDetailsResponse] =
      service.generateServiceLastAccessedDetails(params).promise().toFuture
    @inline def getAccessKeyLastUsedFuture(params: GetAccessKeyLastUsedRequest): Future[GetAccessKeyLastUsedResponse] =
      service.getAccessKeyLastUsed(params).promise().toFuture
    @inline def getAccountAuthorizationDetailsFuture(
        params: GetAccountAuthorizationDetailsRequest
    ): Future[GetAccountAuthorizationDetailsResponse] =
      service.getAccountAuthorizationDetails(params).promise().toFuture
    @inline def getAccountPasswordPolicyFuture(): Future[GetAccountPasswordPolicyResponse] =
      service.getAccountPasswordPolicy().promise().toFuture
    @inline def getAccountSummaryFuture(): Future[GetAccountSummaryResponse] =
      service.getAccountSummary().promise().toFuture
    @inline def getContextKeysForCustomPolicyFuture(
        params: GetContextKeysForCustomPolicyRequest
    ): Future[GetContextKeysForPolicyResponse] = service.getContextKeysForCustomPolicy(params).promise().toFuture
    @inline def getContextKeysForPrincipalPolicyFuture(
        params: GetContextKeysForPrincipalPolicyRequest
    ): Future[GetContextKeysForPolicyResponse] = service.getContextKeysForPrincipalPolicy(params).promise().toFuture
    @inline def getCredentialReportFuture(): Future[GetCredentialReportResponse] =
      service.getCredentialReport().promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] =
      service.getGroup(params).promise().toFuture
    @inline def getGroupPolicyFuture(params: GetGroupPolicyRequest): Future[GetGroupPolicyResponse] =
      service.getGroupPolicy(params).promise().toFuture
    @inline def getInstanceProfileFuture(params: GetInstanceProfileRequest): Future[GetInstanceProfileResponse] =
      service.getInstanceProfile(params).promise().toFuture
    @inline def getLoginProfileFuture(params: GetLoginProfileRequest): Future[GetLoginProfileResponse] =
      service.getLoginProfile(params).promise().toFuture
    @inline def getOpenIDConnectProviderFuture(
        params: GetOpenIDConnectProviderRequest
    ): Future[GetOpenIDConnectProviderResponse] = service.getOpenIDConnectProvider(params).promise().toFuture
    @inline def getOrganizationsAccessReportFuture(
        params: GetOrganizationsAccessReportRequest
    ): Future[GetOrganizationsAccessReportResponse] = service.getOrganizationsAccessReport(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise().toFuture
    @inline def getPolicyVersionFuture(params: GetPolicyVersionRequest): Future[GetPolicyVersionResponse] =
      service.getPolicyVersion(params).promise().toFuture
    @inline def getRoleFuture(params: GetRoleRequest): Future[GetRoleResponse] =
      service.getRole(params).promise().toFuture
    @inline def getRolePolicyFuture(params: GetRolePolicyRequest): Future[GetRolePolicyResponse] =
      service.getRolePolicy(params).promise().toFuture
    @inline def getSAMLProviderFuture(params: GetSAMLProviderRequest): Future[GetSAMLProviderResponse] =
      service.getSAMLProvider(params).promise().toFuture
    @inline def getSSHPublicKeyFuture(params: GetSSHPublicKeyRequest): Future[GetSSHPublicKeyResponse] =
      service.getSSHPublicKey(params).promise().toFuture
    @inline def getServerCertificateFuture(params: GetServerCertificateRequest): Future[GetServerCertificateResponse] =
      service.getServerCertificate(params).promise().toFuture
    @inline def getServiceLastAccessedDetailsFuture(
        params: GetServiceLastAccessedDetailsRequest
    ): Future[GetServiceLastAccessedDetailsResponse] = service.getServiceLastAccessedDetails(params).promise().toFuture
    @inline def getServiceLastAccessedDetailsWithEntitiesFuture(
        params: GetServiceLastAccessedDetailsWithEntitiesRequest
    ): Future[GetServiceLastAccessedDetailsWithEntitiesResponse] =
      service.getServiceLastAccessedDetailsWithEntities(params).promise().toFuture
    @inline def getServiceLinkedRoleDeletionStatusFuture(
        params: GetServiceLinkedRoleDeletionStatusRequest
    ): Future[GetServiceLinkedRoleDeletionStatusResponse] =
      service.getServiceLinkedRoleDeletionStatus(params).promise().toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] =
      service.getUser(params).promise().toFuture
    @inline def getUserPolicyFuture(params: GetUserPolicyRequest): Future[GetUserPolicyResponse] =
      service.getUserPolicy(params).promise().toFuture
    @inline def listAccessKeysFuture(params: ListAccessKeysRequest): Future[ListAccessKeysResponse] =
      service.listAccessKeys(params).promise().toFuture
    @inline def listAccountAliasesFuture(params: ListAccountAliasesRequest): Future[ListAccountAliasesResponse] =
      service.listAccountAliases(params).promise().toFuture
    @inline def listAttachedGroupPoliciesFuture(
        params: ListAttachedGroupPoliciesRequest
    ): Future[ListAttachedGroupPoliciesResponse] = service.listAttachedGroupPolicies(params).promise().toFuture
    @inline def listAttachedRolePoliciesFuture(
        params: ListAttachedRolePoliciesRequest
    ): Future[ListAttachedRolePoliciesResponse] = service.listAttachedRolePolicies(params).promise().toFuture
    @inline def listAttachedUserPoliciesFuture(
        params: ListAttachedUserPoliciesRequest
    ): Future[ListAttachedUserPoliciesResponse] = service.listAttachedUserPolicies(params).promise().toFuture
    @inline def listEntitiesForPolicyFuture(
        params: ListEntitiesForPolicyRequest
    ): Future[ListEntitiesForPolicyResponse] = service.listEntitiesForPolicy(params).promise().toFuture
    @inline def listGroupPoliciesFuture(params: ListGroupPoliciesRequest): Future[ListGroupPoliciesResponse] =
      service.listGroupPolicies(params).promise().toFuture
    @inline def listGroupsForUserFuture(params: ListGroupsForUserRequest): Future[ListGroupsForUserResponse] =
      service.listGroupsForUser(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise().toFuture
    @inline def listInstanceProfilesForRoleFuture(
        params: ListInstanceProfilesForRoleRequest
    ): Future[ListInstanceProfilesForRoleResponse] = service.listInstanceProfilesForRole(params).promise().toFuture
    @inline def listInstanceProfilesFuture(params: ListInstanceProfilesRequest): Future[ListInstanceProfilesResponse] =
      service.listInstanceProfiles(params).promise().toFuture
    @inline def listMFADevicesFuture(params: ListMFADevicesRequest): Future[ListMFADevicesResponse] =
      service.listMFADevices(params).promise().toFuture
    @inline def listOpenIDConnectProvidersFuture(
        params: ListOpenIDConnectProvidersRequest
    ): Future[ListOpenIDConnectProvidersResponse] = service.listOpenIDConnectProviders(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise().toFuture
    @inline def listPoliciesGrantingServiceAccessFuture(
        params: ListPoliciesGrantingServiceAccessRequest
    ): Future[ListPoliciesGrantingServiceAccessResponse] =
      service.listPoliciesGrantingServiceAccess(params).promise().toFuture
    @inline def listPolicyVersionsFuture(params: ListPolicyVersionsRequest): Future[ListPolicyVersionsResponse] =
      service.listPolicyVersions(params).promise().toFuture
    @inline def listRolePoliciesFuture(params: ListRolePoliciesRequest): Future[ListRolePoliciesResponse] =
      service.listRolePolicies(params).promise().toFuture
    @inline def listRoleTagsFuture(params: ListRoleTagsRequest): Future[ListRoleTagsResponse] =
      service.listRoleTags(params).promise().toFuture
    @inline def listRolesFuture(params: ListRolesRequest): Future[ListRolesResponse] =
      service.listRoles(params).promise().toFuture
    @inline def listSAMLProvidersFuture(params: ListSAMLProvidersRequest): Future[ListSAMLProvidersResponse] =
      service.listSAMLProviders(params).promise().toFuture
    @inline def listSSHPublicKeysFuture(params: ListSSHPublicKeysRequest): Future[ListSSHPublicKeysResponse] =
      service.listSSHPublicKeys(params).promise().toFuture
    @inline def listServerCertificatesFuture(
        params: ListServerCertificatesRequest
    ): Future[ListServerCertificatesResponse] = service.listServerCertificates(params).promise().toFuture
    @inline def listServiceSpecificCredentialsFuture(
        params: ListServiceSpecificCredentialsRequest
    ): Future[ListServiceSpecificCredentialsResponse] =
      service.listServiceSpecificCredentials(params).promise().toFuture
    @inline def listSigningCertificatesFuture(
        params: ListSigningCertificatesRequest
    ): Future[ListSigningCertificatesResponse] = service.listSigningCertificates(params).promise().toFuture
    @inline def listUserPoliciesFuture(params: ListUserPoliciesRequest): Future[ListUserPoliciesResponse] =
      service.listUserPolicies(params).promise().toFuture
    @inline def listUserTagsFuture(params: ListUserTagsRequest): Future[ListUserTagsResponse] =
      service.listUserTags(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def listVirtualMFADevicesFuture(
        params: ListVirtualMFADevicesRequest
    ): Future[ListVirtualMFADevicesResponse] = service.listVirtualMFADevices(params).promise().toFuture
    @inline def putGroupPolicyFuture(params: PutGroupPolicyRequest): Future[js.Object] =
      service.putGroupPolicy(params).promise().toFuture
    @inline def putRolePermissionsBoundaryFuture(params: PutRolePermissionsBoundaryRequest): Future[js.Object] =
      service.putRolePermissionsBoundary(params).promise().toFuture
    @inline def putRolePolicyFuture(params: PutRolePolicyRequest): Future[js.Object] =
      service.putRolePolicy(params).promise().toFuture
    @inline def putUserPermissionsBoundaryFuture(params: PutUserPermissionsBoundaryRequest): Future[js.Object] =
      service.putUserPermissionsBoundary(params).promise().toFuture
    @inline def putUserPolicyFuture(params: PutUserPolicyRequest): Future[js.Object] =
      service.putUserPolicy(params).promise().toFuture
    @inline def removeClientIDFromOpenIDConnectProviderFuture(
        params: RemoveClientIDFromOpenIDConnectProviderRequest
    ): Future[js.Object] = service.removeClientIDFromOpenIDConnectProvider(params).promise().toFuture
    @inline def removeRoleFromInstanceProfileFuture(params: RemoveRoleFromInstanceProfileRequest): Future[js.Object] =
      service.removeRoleFromInstanceProfile(params).promise().toFuture
    @inline def removeUserFromGroupFuture(params: RemoveUserFromGroupRequest): Future[js.Object] =
      service.removeUserFromGroup(params).promise().toFuture
    @inline def resetServiceSpecificCredentialFuture(
        params: ResetServiceSpecificCredentialRequest
    ): Future[ResetServiceSpecificCredentialResponse] =
      service.resetServiceSpecificCredential(params).promise().toFuture
    @inline def resyncMFADeviceFuture(params: ResyncMFADeviceRequest): Future[js.Object] =
      service.resyncMFADevice(params).promise().toFuture
    @inline def setDefaultPolicyVersionFuture(params: SetDefaultPolicyVersionRequest): Future[js.Object] =
      service.setDefaultPolicyVersion(params).promise().toFuture
    @inline def setSecurityTokenServicePreferencesFuture(
        params: SetSecurityTokenServicePreferencesRequest
    ): Future[js.Object] = service.setSecurityTokenServicePreferences(params).promise().toFuture
    @inline def simulateCustomPolicyFuture(params: SimulateCustomPolicyRequest): Future[SimulatePolicyResponse] =
      service.simulateCustomPolicy(params).promise().toFuture
    @inline def simulatePrincipalPolicyFuture(params: SimulatePrincipalPolicyRequest): Future[SimulatePolicyResponse] =
      service.simulatePrincipalPolicy(params).promise().toFuture
    @inline def tagRoleFuture(params: TagRoleRequest): Future[js.Object] = service.tagRole(params).promise().toFuture
    @inline def tagUserFuture(params: TagUserRequest): Future[js.Object] = service.tagUser(params).promise().toFuture
    @inline def untagRoleFuture(params: UntagRoleRequest): Future[js.Object] =
      service.untagRole(params).promise().toFuture
    @inline def untagUserFuture(params: UntagUserRequest): Future[js.Object] =
      service.untagUser(params).promise().toFuture
    @inline def updateAccessKeyFuture(params: UpdateAccessKeyRequest): Future[js.Object] =
      service.updateAccessKey(params).promise().toFuture
    @inline def updateAccountPasswordPolicyFuture(params: UpdateAccountPasswordPolicyRequest): Future[js.Object] =
      service.updateAccountPasswordPolicy(params).promise().toFuture
    @inline def updateAssumeRolePolicyFuture(params: UpdateAssumeRolePolicyRequest): Future[js.Object] =
      service.updateAssumeRolePolicy(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[js.Object] =
      service.updateGroup(params).promise().toFuture
    @inline def updateLoginProfileFuture(params: UpdateLoginProfileRequest): Future[js.Object] =
      service.updateLoginProfile(params).promise().toFuture
    @inline def updateOpenIDConnectProviderThumbprintFuture(
        params: UpdateOpenIDConnectProviderThumbprintRequest
    ): Future[js.Object] = service.updateOpenIDConnectProviderThumbprint(params).promise().toFuture
    @inline def updateRoleDescriptionFuture(
        params: UpdateRoleDescriptionRequest
    ): Future[UpdateRoleDescriptionResponse] = service.updateRoleDescription(params).promise().toFuture
    @inline def updateRoleFuture(params: UpdateRoleRequest): Future[UpdateRoleResponse] =
      service.updateRole(params).promise().toFuture
    @inline def updateSAMLProviderFuture(params: UpdateSAMLProviderRequest): Future[UpdateSAMLProviderResponse] =
      service.updateSAMLProvider(params).promise().toFuture
    @inline def updateSSHPublicKeyFuture(params: UpdateSSHPublicKeyRequest): Future[js.Object] =
      service.updateSSHPublicKey(params).promise().toFuture
    @inline def updateServerCertificateFuture(params: UpdateServerCertificateRequest): Future[js.Object] =
      service.updateServerCertificate(params).promise().toFuture
    @inline def updateServiceSpecificCredentialFuture(
        params: UpdateServiceSpecificCredentialRequest
    ): Future[js.Object] = service.updateServiceSpecificCredential(params).promise().toFuture
    @inline def updateSigningCertificateFuture(params: UpdateSigningCertificateRequest): Future[js.Object] =
      service.updateSigningCertificate(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[js.Object] =
      service.updateUser(params).promise().toFuture
    @inline def uploadSSHPublicKeyFuture(params: UploadSSHPublicKeyRequest): Future[UploadSSHPublicKeyResponse] =
      service.uploadSSHPublicKey(params).promise().toFuture
    @inline def uploadServerCertificateFuture(
        params: UploadServerCertificateRequest
    ): Future[UploadServerCertificateResponse] = service.uploadServerCertificate(params).promise().toFuture
    @inline def uploadSigningCertificateFuture(
        params: UploadSigningCertificateRequest
    ): Future[UploadSigningCertificateResponse] = service.uploadSigningCertificate(params).promise().toFuture
  }
}

package iam {
  @js.native
  @JSImport("aws-sdk", "IAM")
  class IAM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest): Request[js.Object] =
      js.native
    def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest): Request[js.Object]               = js.native
    def addUserToGroup(params: AddUserToGroupRequest): Request[js.Object]                                   = js.native
    def attachGroupPolicy(params: AttachGroupPolicyRequest): Request[js.Object]                             = js.native
    def attachRolePolicy(params: AttachRolePolicyRequest): Request[js.Object]                               = js.native
    def attachUserPolicy(params: AttachUserPolicyRequest): Request[js.Object]                               = js.native
    def changePassword(params: ChangePasswordRequest): Request[js.Object]                                   = js.native
    def createAccessKey(params: CreateAccessKeyRequest): Request[CreateAccessKeyResponse]                   = js.native
    def createAccountAlias(params: CreateAccountAliasRequest): Request[js.Object]                           = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse]                               = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResponse] = js.native
    def createLoginProfile(params: CreateLoginProfileRequest): Request[CreateLoginProfileResponse]          = js.native
    def createOpenIDConnectProvider(
        params: CreateOpenIDConnectProviderRequest
    ): Request[CreateOpenIDConnectProviderResponse]                                                   = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse]                      = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createRole(params: CreateRoleRequest): Request[CreateRoleResponse]                            = js.native
    def createSAMLProvider(params: CreateSAMLProviderRequest): Request[CreateSAMLProviderResponse]    = js.native
    def createServiceLinkedRole(params: CreateServiceLinkedRoleRequest): Request[CreateServiceLinkedRoleResponse] =
      js.native
    def createServiceSpecificCredential(
        params: CreateServiceSpecificCredentialRequest
    ): Request[CreateServiceSpecificCredentialResponse]                    = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest): Request[CreateVirtualMFADeviceResponse] =
      js.native
    def deactivateMFADevice(params: DeactivateMFADeviceRequest): Request[js.Object]                     = js.native
    def deleteAccessKey(params: DeleteAccessKeyRequest): Request[js.Object]                             = js.native
    def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[js.Object]                       = js.native
    def deleteAccountPasswordPolicy(): Request[js.Object]                                               = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[js.Object]                                     = js.native
    def deleteGroupPolicy(params: DeleteGroupPolicyRequest): Request[js.Object]                         = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[js.Object]                 = js.native
    def deleteLoginProfile(params: DeleteLoginProfileRequest): Request[js.Object]                       = js.native
    def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest): Request[js.Object]     = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object]                                   = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object]                     = js.native
    def deleteRole(params: DeleteRoleRequest): Request[js.Object]                                       = js.native
    def deleteRolePermissionsBoundary(params: DeleteRolePermissionsBoundaryRequest): Request[js.Object] = js.native
    def deleteRolePolicy(params: DeleteRolePolicyRequest): Request[js.Object]                           = js.native
    def deleteSAMLProvider(params: DeleteSAMLProviderRequest): Request[js.Object]                       = js.native
    def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest): Request[js.Object]                       = js.native
    def deleteServerCertificate(params: DeleteServerCertificateRequest): Request[js.Object]             = js.native
    def deleteServiceLinkedRole(params: DeleteServiceLinkedRoleRequest): Request[DeleteServiceLinkedRoleResponse] =
      js.native
    def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def deleteSigningCertificate(params: DeleteSigningCertificateRequest): Request[js.Object]               = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                                           = js.native
    def deleteUserPermissionsBoundary(params: DeleteUserPermissionsBoundaryRequest): Request[js.Object]     = js.native
    def deleteUserPolicy(params: DeleteUserPolicyRequest): Request[js.Object]                               = js.native
    def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest): Request[js.Object]                   = js.native
    def detachGroupPolicy(params: DetachGroupPolicyRequest): Request[js.Object]                             = js.native
    def detachRolePolicy(params: DetachRolePolicyRequest): Request[js.Object]                               = js.native
    def detachUserPolicy(params: DetachUserPolicyRequest): Request[js.Object]                               = js.native
    def enableMFADevice(params: EnableMFADeviceRequest): Request[js.Object]                                 = js.native
    def generateCredentialReport(): Request[GenerateCredentialReportResponse]                               = js.native
    def generateOrganizationsAccessReport(
        params: GenerateOrganizationsAccessReportRequest
    ): Request[GenerateOrganizationsAccessReportResponse] = js.native
    def generateServiceLastAccessedDetails(
        params: GenerateServiceLastAccessedDetailsRequest
    ): Request[GenerateServiceLastAccessedDetailsResponse]                                               = js.native
    def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest): Request[GetAccessKeyLastUsedResponse] = js.native
    def getAccountAuthorizationDetails(
        params: GetAccountAuthorizationDetailsRequest
    ): Request[GetAccountAuthorizationDetailsResponse]                        = js.native
    def getAccountPasswordPolicy(): Request[GetAccountPasswordPolicyResponse] = js.native
    def getAccountSummary(): Request[GetAccountSummaryResponse]               = js.native
    def getContextKeysForCustomPolicy(
        params: GetContextKeysForCustomPolicyRequest
    ): Request[GetContextKeysForPolicyResponse] = js.native
    def getContextKeysForPrincipalPolicy(
        params: GetContextKeysForPrincipalPolicyRequest
    ): Request[GetContextKeysForPolicyResponse]                                                    = js.native
    def getCredentialReport(): Request[GetCredentialReportResponse]                                = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse]                               = js.native
    def getGroupPolicy(params: GetGroupPolicyRequest): Request[GetGroupPolicyResponse]             = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResponse] = js.native
    def getLoginProfile(params: GetLoginProfileRequest): Request[GetLoginProfileResponse]          = js.native
    def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest): Request[GetOpenIDConnectProviderResponse] =
      js.native
    def getOrganizationsAccessReport(
        params: GetOrganizationsAccessReportRequest
    ): Request[GetOrganizationsAccessReportResponse]                                                     = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                                  = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse]             = js.native
    def getRole(params: GetRoleRequest): Request[GetRoleResponse]                                        = js.native
    def getRolePolicy(params: GetRolePolicyRequest): Request[GetRolePolicyResponse]                      = js.native
    def getSAMLProvider(params: GetSAMLProviderRequest): Request[GetSAMLProviderResponse]                = js.native
    def getSSHPublicKey(params: GetSSHPublicKeyRequest): Request[GetSSHPublicKeyResponse]                = js.native
    def getServerCertificate(params: GetServerCertificateRequest): Request[GetServerCertificateResponse] = js.native
    def getServiceLastAccessedDetails(
        params: GetServiceLastAccessedDetailsRequest
    ): Request[GetServiceLastAccessedDetailsResponse] = js.native
    def getServiceLastAccessedDetailsWithEntities(
        params: GetServiceLastAccessedDetailsWithEntitiesRequest
    ): Request[GetServiceLastAccessedDetailsWithEntitiesResponse] = js.native
    def getServiceLinkedRoleDeletionStatus(
        params: GetServiceLinkedRoleDeletionStatusRequest
    ): Request[GetServiceLinkedRoleDeletionStatusResponse]                                         = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse]                                  = js.native
    def getUserPolicy(params: GetUserPolicyRequest): Request[GetUserPolicyResponse]                = js.native
    def listAccessKeys(params: ListAccessKeysRequest): Request[ListAccessKeysResponse]             = js.native
    def listAccountAliases(params: ListAccountAliasesRequest): Request[ListAccountAliasesResponse] = js.native
    def listAttachedGroupPolicies(
        params: ListAttachedGroupPoliciesRequest
    ): Request[ListAttachedGroupPoliciesResponse] = js.native
    def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest): Request[ListAttachedRolePoliciesResponse] =
      js.native
    def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest): Request[ListAttachedUserPoliciesResponse] =
      js.native
    def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest): Request[ListEntitiesForPolicyResponse] = js.native
    def listGroupPolicies(params: ListGroupPoliciesRequest): Request[ListGroupPoliciesResponse]             = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                                  = js.native
    def listGroupsForUser(params: ListGroupsForUserRequest): Request[ListGroupsForUserResponse]             = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResponse]    = js.native
    def listInstanceProfilesForRole(
        params: ListInstanceProfilesForRoleRequest
    ): Request[ListInstanceProfilesForRoleResponse]                                    = js.native
    def listMFADevices(params: ListMFADevicesRequest): Request[ListMFADevicesResponse] = js.native
    def listOpenIDConnectProviders(
        params: ListOpenIDConnectProvidersRequest
    ): Request[ListOpenIDConnectProvidersResponse]                               = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPoliciesGrantingServiceAccess(
        params: ListPoliciesGrantingServiceAccessRequest
    ): Request[ListPoliciesGrantingServiceAccessResponse]                                          = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse] = js.native
    def listRolePolicies(params: ListRolePoliciesRequest): Request[ListRolePoliciesResponse]       = js.native
    def listRoleTags(params: ListRoleTagsRequest): Request[ListRoleTagsResponse]                   = js.native
    def listRoles(params: ListRolesRequest): Request[ListRolesResponse]                            = js.native
    def listSAMLProviders(params: ListSAMLProvidersRequest): Request[ListSAMLProvidersResponse]    = js.native
    def listSSHPublicKeys(params: ListSSHPublicKeysRequest): Request[ListSSHPublicKeysResponse]    = js.native
    def listServerCertificates(params: ListServerCertificatesRequest): Request[ListServerCertificatesResponse] =
      js.native
    def listServiceSpecificCredentials(
        params: ListServiceSpecificCredentialsRequest
    ): Request[ListServiceSpecificCredentialsResponse] = js.native
    def listSigningCertificates(params: ListSigningCertificatesRequest): Request[ListSigningCertificatesResponse] =
      js.native
    def listUserPolicies(params: ListUserPoliciesRequest): Request[ListUserPoliciesResponse]                = js.native
    def listUserTags(params: ListUserTagsRequest): Request[ListUserTagsResponse]                            = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def listVirtualMFADevices(params: ListVirtualMFADevicesRequest): Request[ListVirtualMFADevicesResponse] = js.native
    def putGroupPolicy(params: PutGroupPolicyRequest): Request[js.Object]                                   = js.native
    def putRolePermissionsBoundary(params: PutRolePermissionsBoundaryRequest): Request[js.Object]           = js.native
    def putRolePolicy(params: PutRolePolicyRequest): Request[js.Object]                                     = js.native
    def putUserPermissionsBoundary(params: PutUserPermissionsBoundaryRequest): Request[js.Object]           = js.native
    def putUserPolicy(params: PutUserPolicyRequest): Request[js.Object]                                     = js.native
    def removeClientIDFromOpenIDConnectProvider(
        params: RemoveClientIDFromOpenIDConnectProviderRequest
    ): Request[js.Object]                                                                               = js.native
    def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest): Request[js.Object] = js.native
    def removeUserFromGroup(params: RemoveUserFromGroupRequest): Request[js.Object]                     = js.native
    def resetServiceSpecificCredential(
        params: ResetServiceSpecificCredentialRequest
    ): Request[ResetServiceSpecificCredentialResponse]                                      = js.native
    def resyncMFADevice(params: ResyncMFADeviceRequest): Request[js.Object]                 = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object] = js.native
    def setSecurityTokenServicePreferences(params: SetSecurityTokenServicePreferencesRequest): Request[js.Object] =
      js.native
    def simulateCustomPolicy(params: SimulateCustomPolicyRequest): Request[SimulatePolicyResponse]       = js.native
    def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest): Request[SimulatePolicyResponse] = js.native
    def tagRole(params: TagRoleRequest): Request[js.Object]                                              = js.native
    def tagUser(params: TagUserRequest): Request[js.Object]                                              = js.native
    def untagRole(params: UntagRoleRequest): Request[js.Object]                                          = js.native
    def untagUser(params: UntagUserRequest): Request[js.Object]                                          = js.native
    def updateAccessKey(params: UpdateAccessKeyRequest): Request[js.Object]                              = js.native
    def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest): Request[js.Object]      = js.native
    def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest): Request[js.Object]                = js.native
    def updateGroup(params: UpdateGroupRequest): Request[js.Object]                                      = js.native
    def updateLoginProfile(params: UpdateLoginProfileRequest): Request[js.Object]                        = js.native
    def updateOpenIDConnectProviderThumbprint(
        params: UpdateOpenIDConnectProviderThumbprintRequest
    ): Request[js.Object]                                                                                   = js.native
    def updateRole(params: UpdateRoleRequest): Request[UpdateRoleResponse]                                  = js.native
    def updateRoleDescription(params: UpdateRoleDescriptionRequest): Request[UpdateRoleDescriptionResponse] = js.native
    def updateSAMLProvider(params: UpdateSAMLProviderRequest): Request[UpdateSAMLProviderResponse]          = js.native
    def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest): Request[js.Object]                           = js.native
    def updateServerCertificate(params: UpdateServerCertificateRequest): Request[js.Object]                 = js.native
    def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def updateSigningCertificate(params: UpdateSigningCertificateRequest): Request[js.Object]               = js.native
    def updateUser(params: UpdateUserRequest): Request[js.Object]                                           = js.native
    def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest): Request[UploadSSHPublicKeyResponse]          = js.native
    def uploadServerCertificate(params: UploadServerCertificateRequest): Request[UploadServerCertificateResponse] =
      js.native
    def uploadSigningCertificate(params: UploadSigningCertificateRequest): Request[UploadSigningCertificateResponse] =
      js.native
  }

  /**
    * An object that contains details about when a principal in the reported AWS Organizations entity last attempted to access an AWS service. A principal can be an IAM user, an IAM role, or the AWS account root user within the reported Organizations entity.
    *  This data type is a response element in the <a>GetOrganizationsAccessReport</a> operation.
    */
  @js.native
  @Factory
  trait AccessDetail extends js.Object {
    var ServiceName: serviceNameType
    var ServiceNamespace: serviceNamespaceType
    var EntityPath: js.UndefOr[organizationsEntityPathType]
    var LastAuthenticatedTime: js.UndefOr[dateType]
    var Region: js.UndefOr[stringType]
    var TotalAuthenticatedEntities: js.UndefOr[integerType]
  }

  /**
    * Contains information about an AWS access key.
    *  This data type is used as a response element in the <a>CreateAccessKey</a> and <a>ListAccessKeys</a> operations.
    *
    * '''Note:'''The <code>SecretAccessKey</code> value is returned only in response to <a>CreateAccessKey</a>. You can get a secret access key only when you first create an access key; you cannot recover the secret access key later. If you lose a secret access key, you must create a new access key.
    */
  @js.native
  @Factory
  trait AccessKey extends js.Object {
    var AccessKeyId: accessKeyIdType
    var SecretAccessKey: accessKeySecretType
    var Status: statusType
    var UserName: userNameType
    var CreateDate: js.UndefOr[dateType]
  }

  /**
    * Contains information about the last time an AWS access key was used since IAM began tracking this information on April 22, 2015.
    *  This data type is used as a response element in the <a>GetAccessKeyLastUsed</a> operation.
    */
  @js.native
  @Factory
  trait AccessKeyLastUsed extends js.Object {
    var LastUsedDate: dateType
    var Region: stringType
    var ServiceName: stringType
  }

  /**
    * Contains information about an AWS access key, without its secret key.
    *  This data type is used as a response element in the <a>ListAccessKeys</a> operation.
    */
  @js.native
  @Factory
  trait AccessKeyMetadata extends js.Object {
    var AccessKeyId: js.UndefOr[accessKeyIdType]
    var CreateDate: js.UndefOr[dateType]
    var Status: js.UndefOr[statusType]
    var UserName: js.UndefOr[userNameType]
  }

  @js.native
  @Factory
  trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
    var ClientID: clientIDType
    var OpenIDConnectProviderArn: arnType
  }

  @js.native
  @Factory
  trait AddRoleToInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait AddUserToGroupRequest extends js.Object {
    var GroupName: groupNameType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait AttachGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyArn: arnType
  }

  @js.native
  @Factory
  trait AttachRolePolicyRequest extends js.Object {
    var PolicyArn: arnType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait AttachUserPolicyRequest extends js.Object {
    var PolicyArn: arnType
    var UserName: userNameType
  }

  /**
    * Contains information about an attached permissions boundary.
    *  An attached permissions boundary is a managed policy that has been attached to a user or role to set the permissions boundary.
    *  For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions Boundaries for IAM Identities ]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait AttachedPermissionsBoundary extends js.Object {
    var PermissionsBoundaryArn: js.UndefOr[arnType]
    var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType]
  }

  /**
    * Contains information about an attached policy.
    *  An attached policy is a managed policy that has been attached to a user, group, or role. This data type is used as a response element in the <a>ListAttachedGroupPolicies</a>, <a>ListAttachedRolePolicies</a>, <a>ListAttachedUserPolicies</a>, and <a>GetAccountAuthorizationDetails</a> operations.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait AttachedPolicy extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  @js.native
  @Factory
  trait ChangePasswordRequest extends js.Object {
    var NewPassword: passwordType
    var OldPassword: passwordType
  }

  /**
    * Contains information about a condition context key. It includes the name of the key and specifies the value (or values, if the context key supports multiple values) to use in the simulation. This information is used when evaluating the <code>Condition</code> elements of the input policies.
    *  This data type is used as an input parameter to <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulatePrincipalPolicy</a> </code>.
    */
  @js.native
  @Factory
  trait ContextEntry extends js.Object {
    var ContextKeyName: js.UndefOr[ContextKeyNameType]
    var ContextKeyType: js.UndefOr[ContextKeyTypeEnum]
    var ContextKeyValues: js.UndefOr[ContextKeyValueListType]
  }

  @js.native
  sealed trait ContextKeyTypeEnum extends js.Any
  object ContextKeyTypeEnum extends js.Object {
    val string      = "string".asInstanceOf[ContextKeyTypeEnum]
    val stringList  = "stringList".asInstanceOf[ContextKeyTypeEnum]
    val numeric     = "numeric".asInstanceOf[ContextKeyTypeEnum]
    val numericList = "numericList".asInstanceOf[ContextKeyTypeEnum]
    val boolean     = "boolean".asInstanceOf[ContextKeyTypeEnum]
    val booleanList = "booleanList".asInstanceOf[ContextKeyTypeEnum]
    val ip          = "ip".asInstanceOf[ContextKeyTypeEnum]
    val ipList      = "ipList".asInstanceOf[ContextKeyTypeEnum]
    val binary      = "binary".asInstanceOf[ContextKeyTypeEnum]
    val binaryList  = "binaryList".asInstanceOf[ContextKeyTypeEnum]
    val date        = "date".asInstanceOf[ContextKeyTypeEnum]
    val dateList    = "dateList".asInstanceOf[ContextKeyTypeEnum]

    val values = js.Object.freeze(
      js.Array(
        string,
        stringList,
        numeric,
        numericList,
        boolean,
        booleanList,
        ip,
        ipList,
        binary,
        binaryList,
        date,
        dateList
      )
    )
  }

  @js.native
  @Factory
  trait CreateAccessKeyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
  }

  /**
    * Contains the response to a successful <a>CreateAccessKey</a> request.
    */
  @js.native
  @Factory
  trait CreateAccessKeyResponse extends js.Object {
    var AccessKey: AccessKey
  }

  @js.native
  @Factory
  trait CreateAccountAliasRequest extends js.Object {
    var AccountAlias: accountAliasType
  }

  @js.native
  @Factory
  trait CreateGroupRequest extends js.Object {
    var GroupName: groupNameType
    var Path: js.UndefOr[pathType]
  }

  /**
    * Contains the response to a successful <a>CreateGroup</a> request.
    */
  @js.native
  @Factory
  trait CreateGroupResponse extends js.Object {
    var Group: Group
  }

  @js.native
  @Factory
  trait CreateInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var Path: js.UndefOr[pathType]
  }

  /**
    * Contains the response to a successful <a>CreateInstanceProfile</a> request.
    */
  @js.native
  @Factory
  trait CreateInstanceProfileResponse extends js.Object {
    var InstanceProfile: InstanceProfile
  }

  @js.native
  @Factory
  trait CreateLoginProfileRequest extends js.Object {
    var Password: passwordType
    var UserName: userNameType
    var PasswordResetRequired: js.UndefOr[booleanType]
  }

  /**
    * Contains the response to a successful <a>CreateLoginProfile</a> request.
    */
  @js.native
  @Factory
  trait CreateLoginProfileResponse extends js.Object {
    var LoginProfile: LoginProfile
  }

  @js.native
  @Factory
  trait CreateOpenIDConnectProviderRequest extends js.Object {
    var ThumbprintList: thumbprintListType
    var Url: OpenIDConnectProviderUrlType
    var ClientIDList: js.UndefOr[clientIDListType]
  }

  /**
    * Contains the response to a successful <a>CreateOpenIDConnectProvider</a> request.
    */
  @js.native
  @Factory
  trait CreateOpenIDConnectProviderResponse extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
  }

  @js.native
  @Factory
  trait CreatePolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var Description: js.UndefOr[policyDescriptionType]
    var Path: js.UndefOr[policyPathType]
  }

  /**
    * Contains the response to a successful <a>CreatePolicy</a> request.
    */
  @js.native
  @Factory
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  @js.native
  @Factory
  trait CreatePolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var PolicyDocument: policyDocumentType
    var SetAsDefault: js.UndefOr[booleanType]
  }

  /**
    * Contains the response to a successful <a>CreatePolicyVersion</a> request.
    */
  @js.native
  @Factory
  trait CreatePolicyVersionResponse extends js.Object {
    var PolicyVersion: js.UndefOr[PolicyVersion]
  }

  @js.native
  @Factory
  trait CreateRoleRequest extends js.Object {
    var AssumeRolePolicyDocument: policyDocumentType
    var RoleName: roleNameType
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[arnType]
    var Tags: js.UndefOr[tagListType]
  }

  /**
    * Contains the response to a successful <a>CreateRole</a> request.
    */
  @js.native
  @Factory
  trait CreateRoleResponse extends js.Object {
    var Role: Role
  }

  @js.native
  @Factory
  trait CreateSAMLProviderRequest extends js.Object {
    var Name: SAMLProviderNameType
    var SAMLMetadataDocument: SAMLMetadataDocumentType
  }

  /**
    * Contains the response to a successful <a>CreateSAMLProvider</a> request.
    */
  @js.native
  @Factory
  trait CreateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  @js.native
  @Factory
  trait CreateServiceLinkedRoleRequest extends js.Object {
    var AWSServiceName: groupNameType
    var CustomSuffix: js.UndefOr[customSuffixType]
    var Description: js.UndefOr[roleDescriptionType]
  }

  @js.native
  @Factory
  trait CreateServiceLinkedRoleResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  @js.native
  @Factory
  trait CreateServiceSpecificCredentialRequest extends js.Object {
    var ServiceName: serviceName
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait CreateServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential]
  }

  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var UserName: userNameType
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[arnType]
    var Tags: js.UndefOr[tagListType]
  }

  /**
    * Contains the response to a successful <a>CreateUser</a> request.
    */
  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait CreateVirtualMFADeviceRequest extends js.Object {
    var VirtualMFADeviceName: virtualMFADeviceName
    var Path: js.UndefOr[pathType]
  }

  /**
    * Contains the response to a successful <a>CreateVirtualMFADevice</a> request.
    */
  @js.native
  @Factory
  trait CreateVirtualMFADeviceResponse extends js.Object {
    var VirtualMFADevice: VirtualMFADevice
  }

  @js.native
  @Factory
  trait DeactivateMFADeviceRequest extends js.Object {
    var SerialNumber: serialNumberType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait DeleteAccessKeyRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
    var UserName: js.UndefOr[existingUserNameType]
  }

  @js.native
  @Factory
  trait DeleteAccountAliasRequest extends js.Object {
    var AccountAlias: accountAliasType
  }

  @js.native
  @Factory
  trait DeleteGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
  }

  @js.native
  @Factory
  trait DeleteGroupRequest extends js.Object {
    var GroupName: groupNameType
  }

  @js.native
  @Factory
  trait DeleteInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
  }

  @js.native
  @Factory
  trait DeleteLoginProfileRequest extends js.Object {
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait DeleteOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  @js.native
  @Factory
  trait DeletePolicyRequest extends js.Object {
    var PolicyArn: arnType
  }

  @js.native
  @Factory
  trait DeletePolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  @js.native
  @Factory
  trait DeleteRolePermissionsBoundaryRequest extends js.Object {
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait DeleteRolePolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait DeleteRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait DeleteSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: arnType
  }

  @js.native
  @Factory
  trait DeleteSSHPublicKeyRequest extends js.Object {
    var SSHPublicKeyId: publicKeyIdType
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait DeleteServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
  }

  @js.native
  @Factory
  trait DeleteServiceLinkedRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait DeleteServiceLinkedRoleResponse extends js.Object {
    var DeletionTaskId: DeletionTaskIdType
  }

  @js.native
  @Factory
  trait DeleteServiceSpecificCredentialRequest extends js.Object {
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var UserName: js.UndefOr[userNameType]
  }

  @js.native
  @Factory
  trait DeleteSigningCertificateRequest extends js.Object {
    var CertificateId: certificateIdType
    var UserName: js.UndefOr[existingUserNameType]
  }

  @js.native
  @Factory
  trait DeleteUserPermissionsBoundaryRequest extends js.Object {
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait DeleteUserPolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait DeleteVirtualMFADeviceRequest extends js.Object {
    var SerialNumber: serialNumberType
  }

  /**
    * The reason that the service-linked role deletion failed.
    *  This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.
    */
  @js.native
  @Factory
  trait DeletionTaskFailureReasonType extends js.Object {
    var Reason: js.UndefOr[ReasonType]
    var RoleUsageList: js.UndefOr[RoleUsageListType]
  }

  @js.native
  sealed trait DeletionTaskStatusType extends js.Any
  object DeletionTaskStatusType extends js.Object {
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[DeletionTaskStatusType]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeletionTaskStatusType]
    val FAILED      = "FAILED".asInstanceOf[DeletionTaskStatusType]
    val NOT_STARTED = "NOT_STARTED".asInstanceOf[DeletionTaskStatusType]

    val values = js.Object.freeze(js.Array(SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED))
  }

  @js.native
  @Factory
  trait DetachGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyArn: arnType
  }

  @js.native
  @Factory
  trait DetachRolePolicyRequest extends js.Object {
    var PolicyArn: arnType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait DetachUserPolicyRequest extends js.Object {
    var PolicyArn: arnType
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait EnableMFADeviceRequest extends js.Object {
    var AuthenticationCode1: authenticationCodeType
    var AuthenticationCode2: authenticationCodeType
    var SerialNumber: serialNumberType
    var UserName: existingUserNameType
  }

  /**
    * An object that contains details about when the IAM entities (users or roles) were last used in an attempt to access the specified AWS service.
    *  This data type is a response element in the <a>GetServiceLastAccessedDetailsWithEntities</a> operation.
    */
  @js.native
  @Factory
  trait EntityDetails extends js.Object {
    var EntityInfo: EntityInfo
    var LastAuthenticated: js.UndefOr[dateType]
  }

  /**
    * Contains details about the specified entity (user or role).
    *  This data type is an element of the <a>EntityDetails</a> object.
    */
  @js.native
  @Factory
  trait EntityInfo extends js.Object {
    var Arn: arnType
    var Id: idType
    var Name: userNameType
    var Type: policyOwnerEntityType
    var Path: js.UndefOr[pathType]
  }

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType extends js.Object {
    val User               = "User".asInstanceOf[EntityType]
    val Role               = "Role".asInstanceOf[EntityType]
    val Group              = "Group".asInstanceOf[EntityType]
    val LocalManagedPolicy = "LocalManagedPolicy".asInstanceOf[EntityType]
    val AWSManagedPolicy   = "AWSManagedPolicy".asInstanceOf[EntityType]

    val values = js.Object.freeze(js.Array(User, Role, Group, LocalManagedPolicy, AWSManagedPolicy))
  }

  /**
    * Contains information about the reason that the operation failed.
    *  This data type is used as a response element in the <a>GetOrganizationsAccessReport</a>, <a>GetServiceLastAccessedDetails</a>, and <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
    */
  @js.native
  @Factory
  trait ErrorDetails extends js.Object {
    var Code: stringType
    var Message: stringType
  }

  /**
    * Contains the results of a simulation.
    *  This data type is used by the return parameter of <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulatePrincipalPolicy</a> </code>.
    */
  @js.native
  @Factory
  trait EvaluationResult extends js.Object {
    var EvalActionName: ActionNameType
    var EvalDecision: PolicyEvaluationDecisionType
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType]
    var EvalResourceName: js.UndefOr[ResourceNameType]
    var MatchedStatements: js.UndefOr[StatementListType]
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType]
    var OrganizationsDecisionDetail: js.UndefOr[OrganizationsDecisionDetail]
    var PermissionsBoundaryDecisionDetail: js.UndefOr[PermissionsBoundaryDecisionDetail]
    var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType]
  }

  /**
    * Contains the response to a successful <a>GenerateCredentialReport</a> request.
    */
  @js.native
  @Factory
  trait GenerateCredentialReportResponse extends js.Object {
    var Description: js.UndefOr[ReportStateDescriptionType]
    var State: js.UndefOr[ReportStateType]
  }

  @js.native
  @Factory
  trait GenerateOrganizationsAccessReportRequest extends js.Object {
    var EntityPath: organizationsEntityPathType
    var OrganizationsPolicyId: js.UndefOr[organizationsPolicyIdType]
  }

  @js.native
  @Factory
  trait GenerateOrganizationsAccessReportResponse extends js.Object {
    var JobId: js.UndefOr[jobIDType]
  }

  @js.native
  @Factory
  trait GenerateServiceLastAccessedDetailsRequest extends js.Object {
    var Arn: arnType
  }

  @js.native
  @Factory
  trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
    var JobId: js.UndefOr[jobIDType]
  }

  @js.native
  @Factory
  trait GetAccessKeyLastUsedRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
  }

  /**
    * Contains the response to a successful <a>GetAccessKeyLastUsed</a> request. It is also returned as a member of the <a>AccessKeyMetaData</a> structure returned by the <a>ListAccessKeys</a> action.
    */
  @js.native
  @Factory
  trait GetAccessKeyLastUsedResponse extends js.Object {
    var AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed]
    var UserName: js.UndefOr[existingUserNameType]
  }

  @js.native
  @Factory
  trait GetAccountAuthorizationDetailsRequest extends js.Object {
    var Filter: js.UndefOr[entityListType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>GetAccountAuthorizationDetails</a> request.
    */
  @js.native
  @Factory
  trait GetAccountAuthorizationDetailsResponse extends js.Object {
    var GroupDetailList: js.UndefOr[groupDetailListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var Policies: js.UndefOr[ManagedPolicyDetailListType]
    var RoleDetailList: js.UndefOr[roleDetailListType]
    var UserDetailList: js.UndefOr[userDetailListType]
  }

  /**
    * Contains the response to a successful <a>GetAccountPasswordPolicy</a> request.
    */
  @js.native
  @Factory
  trait GetAccountPasswordPolicyResponse extends js.Object {
    var PasswordPolicy: PasswordPolicy
  }

  /**
    * Contains the response to a successful <a>GetAccountSummary</a> request.
    */
  @js.native
  @Factory
  trait GetAccountSummaryResponse extends js.Object {
    var SummaryMap: js.UndefOr[summaryMapType]
  }

  @js.native
  @Factory
  trait GetContextKeysForCustomPolicyRequest extends js.Object {
    var PolicyInputList: SimulationPolicyListType
  }

  /**
    * Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a> or <a>GetContextKeysForCustomPolicy</a> request.
    */
  @js.native
  @Factory
  trait GetContextKeysForPolicyResponse extends js.Object {
    var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType]
  }

  @js.native
  @Factory
  trait GetContextKeysForPrincipalPolicyRequest extends js.Object {
    var PolicySourceArn: arnType
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
  }

  /**
    * Contains the response to a successful <a>GetCredentialReport</a> request.
    */
  @js.native
  @Factory
  trait GetCredentialReportResponse extends js.Object {
    var Content: js.UndefOr[ReportContentType]
    var GeneratedTime: js.UndefOr[dateType]
    var ReportFormat: js.UndefOr[ReportFormatType]
  }

  @js.native
  @Factory
  trait GetGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
  }

  /**
    * Contains the response to a successful <a>GetGroupPolicy</a> request.
    */
  @js.native
  @Factory
  trait GetGroupPolicyResponse extends js.Object {
    var GroupName: groupNameType
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
  }

  @js.native
  @Factory
  trait GetGroupRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>GetGroup</a> request.
    */
  @js.native
  @Factory
  trait GetGroupResponse extends js.Object {
    var Group: Group
    var Users: userListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait GetInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
  }

  /**
    * Contains the response to a successful <a>GetInstanceProfile</a> request.
    */
  @js.native
  @Factory
  trait GetInstanceProfileResponse extends js.Object {
    var InstanceProfile: InstanceProfile
  }

  @js.native
  @Factory
  trait GetLoginProfileRequest extends js.Object {
    var UserName: userNameType
  }

  /**
    * Contains the response to a successful <a>GetLoginProfile</a> request.
    */
  @js.native
  @Factory
  trait GetLoginProfileResponse extends js.Object {
    var LoginProfile: LoginProfile
  }

  @js.native
  @Factory
  trait GetOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  /**
    * Contains the response to a successful <a>GetOpenIDConnectProvider</a> request.
    */
  @js.native
  @Factory
  trait GetOpenIDConnectProviderResponse extends js.Object {
    var ClientIDList: js.UndefOr[clientIDListType]
    var CreateDate: js.UndefOr[dateType]
    var ThumbprintList: js.UndefOr[thumbprintListType]
    var Url: js.UndefOr[OpenIDConnectProviderUrlType]
  }

  @js.native
  @Factory
  trait GetOrganizationsAccessReportRequest extends js.Object {
    var JobId: jobIDType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var SortKey: js.UndefOr[sortKeyType]
  }

  @js.native
  @Factory
  trait GetOrganizationsAccessReportResponse extends js.Object {
    var JobCreationDate: dateType
    var JobStatus: jobStatusType
    var AccessDetails: js.UndefOr[AccessDetails]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var IsTruncated: js.UndefOr[booleanType]
    var JobCompletionDate: js.UndefOr[dateType]
    var Marker: js.UndefOr[markerType]
    var NumberOfServicesAccessible: js.UndefOr[integerType]
    var NumberOfServicesNotAccessed: js.UndefOr[integerType]
  }

  @js.native
  @Factory
  trait GetPolicyRequest extends js.Object {
    var PolicyArn: arnType
  }

  /**
    * Contains the response to a successful <a>GetPolicy</a> request.
    */
  @js.native
  @Factory
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  @js.native
  @Factory
  trait GetPolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  /**
    * Contains the response to a successful <a>GetPolicyVersion</a> request.
    */
  @js.native
  @Factory
  trait GetPolicyVersionResponse extends js.Object {
    var PolicyVersion: js.UndefOr[PolicyVersion]
  }

  @js.native
  @Factory
  trait GetRolePolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  /**
    * Contains the response to a successful <a>GetRolePolicy</a> request.
    */
  @js.native
  @Factory
  trait GetRolePolicyResponse extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait GetRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  /**
    * Contains the response to a successful <a>GetRole</a> request.
    */
  @js.native
  @Factory
  trait GetRoleResponse extends js.Object {
    var Role: Role
  }

  @js.native
  @Factory
  trait GetSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: arnType
  }

  /**
    * Contains the response to a successful <a>GetSAMLProvider</a> request.
    */
  @js.native
  @Factory
  trait GetSAMLProviderResponse extends js.Object {
    var CreateDate: js.UndefOr[dateType]
    var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType]
    var ValidUntil: js.UndefOr[dateType]
  }

  @js.native
  @Factory
  trait GetSSHPublicKeyRequest extends js.Object {
    var Encoding: encodingType
    var SSHPublicKeyId: publicKeyIdType
    var UserName: userNameType
  }

  /**
    * Contains the response to a successful <a>GetSSHPublicKey</a> request.
    */
  @js.native
  @Factory
  trait GetSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: js.UndefOr[SSHPublicKey]
  }

  @js.native
  @Factory
  trait GetServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
  }

  /**
    * Contains the response to a successful <a>GetServerCertificate</a> request.
    */
  @js.native
  @Factory
  trait GetServerCertificateResponse extends js.Object {
    var ServerCertificate: ServerCertificate
  }

  @js.native
  @Factory
  trait GetServiceLastAccessedDetailsRequest extends js.Object {
    var JobId: jobIDType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  @js.native
  @Factory
  trait GetServiceLastAccessedDetailsResponse extends js.Object {
    var JobCompletionDate: dateType
    var JobCreationDate: dateType
    var JobStatus: jobStatusType
    var ServicesLastAccessed: ServicesLastAccessed
    var Error: js.UndefOr[ErrorDetails]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait GetServiceLastAccessedDetailsWithEntitiesRequest extends js.Object {
    var JobId: jobIDType
    var ServiceNamespace: serviceNamespaceType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  @js.native
  @Factory
  trait GetServiceLastAccessedDetailsWithEntitiesResponse extends js.Object {
    var EntityDetailsList: entityDetailsListType
    var JobCompletionDate: dateType
    var JobCreationDate: dateType
    var JobStatus: jobStatusType
    var Error: js.UndefOr[ErrorDetails]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait GetServiceLinkedRoleDeletionStatusRequest extends js.Object {
    var DeletionTaskId: DeletionTaskIdType
  }

  @js.native
  @Factory
  trait GetServiceLinkedRoleDeletionStatusResponse extends js.Object {
    var Status: DeletionTaskStatusType
    var Reason: js.UndefOr[DeletionTaskFailureReasonType]
  }

  @js.native
  @Factory
  trait GetUserPolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  /**
    * Contains the response to a successful <a>GetUserPolicy</a> request.
    */
  @js.native
  @Factory
  trait GetUserPolicyResponse extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait GetUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
  }

  /**
    * Contains the response to a successful <a>GetUser</a> request.
    */
  @js.native
  @Factory
  trait GetUserResponse extends js.Object {
    var User: User
  }

  /**
    * Contains information about an IAM group entity.
    *  This data type is used as a response element in the following operations:
    * * <a>CreateGroup</a>
    *  * <a>GetGroup</a>
    *  * <a>ListGroups</a>
    */
  @js.native
  @Factory
  trait Group extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var GroupId: idType
    var GroupName: groupNameType
    var Path: pathType
  }

  /**
    * Contains information about an IAM group, including all of the group's policies.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  @Factory
  trait GroupDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var CreateDate: js.UndefOr[dateType]
    var GroupId: js.UndefOr[idType]
    var GroupName: js.UndefOr[groupNameType]
    var GroupPolicyList: js.UndefOr[policyDetailListType]
    var Path: js.UndefOr[pathType]
  }

  /**
    * Contains information about an instance profile.
    *  This data type is used as a response element in the following operations:
    * * <a>CreateInstanceProfile</a>
    *  * <a>GetInstanceProfile</a>
    *  * <a>ListInstanceProfiles</a>
    *  * <a>ListInstanceProfilesForRole</a>
    */
  @js.native
  @Factory
  trait InstanceProfile extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var InstanceProfileId: idType
    var InstanceProfileName: instanceProfileNameType
    var Path: pathType
    var Roles: roleListType
  }

  @js.native
  @Factory
  trait ListAccessKeysRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  /**
    * Contains the response to a successful <a>ListAccessKeys</a> request.
    */
  @js.native
  @Factory
  trait ListAccessKeysResponse extends js.Object {
    var AccessKeyMetadata: accessKeyMetadataListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListAccountAliasesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListAccountAliases</a> request.
    */
  @js.native
  @Factory
  trait ListAccountAliasesResponse extends js.Object {
    var AccountAliases: accountAliasListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListAttachedGroupPoliciesRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[policyPathType]
  }

  /**
    * Contains the response to a successful <a>ListAttachedGroupPolicies</a> request.
    */
  @js.native
  @Factory
  trait ListAttachedGroupPoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListAttachedRolePoliciesRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[policyPathType]
  }

  /**
    * Contains the response to a successful <a>ListAttachedRolePolicies</a> request.
    */
  @js.native
  @Factory
  trait ListAttachedRolePoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListAttachedUserPoliciesRequest extends js.Object {
    var UserName: userNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[policyPathType]
  }

  /**
    * Contains the response to a successful <a>ListAttachedUserPolicies</a> request.
    */
  @js.native
  @Factory
  trait ListAttachedUserPoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListEntitiesForPolicyRequest extends js.Object {
    var PolicyArn: arnType
    var EntityFilter: js.UndefOr[EntityType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathType]
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType]
  }

  /**
    * Contains the response to a successful <a>ListEntitiesForPolicy</a> request.
    */
  @js.native
  @Factory
  trait ListEntitiesForPolicyResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var PolicyGroups: js.UndefOr[PolicyGroupListType]
    var PolicyRoles: js.UndefOr[PolicyRoleListType]
    var PolicyUsers: js.UndefOr[PolicyUserListType]
  }

  @js.native
  @Factory
  trait ListGroupPoliciesRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListGroupPolicies</a> request.
    */
  @js.native
  @Factory
  trait ListGroupPoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListGroupsForUserRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListGroupsForUser</a> request.
    */
  @js.native
  @Factory
  trait ListGroupsForUserResponse extends js.Object {
    var Groups: groupListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListGroupsRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  /**
    * Contains the response to a successful <a>ListGroups</a> request.
    */
  @js.native
  @Factory
  trait ListGroupsResponse extends js.Object {
    var Groups: groupListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListInstanceProfilesForRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListInstanceProfilesForRole</a> request.
    */
  @js.native
  @Factory
  trait ListInstanceProfilesForRoleResponse extends js.Object {
    var InstanceProfiles: instanceProfileListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListInstanceProfilesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  /**
    * Contains the response to a successful <a>ListInstanceProfiles</a> request.
    */
  @js.native
  @Factory
  trait ListInstanceProfilesResponse extends js.Object {
    var InstanceProfiles: instanceProfileListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListMFADevicesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  /**
    * Contains the response to a successful <a>ListMFADevices</a> request.
    */
  @js.native
  @Factory
  trait ListMFADevicesResponse extends js.Object {
    var MFADevices: mfaDeviceListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListOpenIDConnectProvidersRequest extends js.Object {}

  /**
    * Contains the response to a successful <a>ListOpenIDConnectProviders</a> request.
    */
  @js.native
  @Factory
  trait ListOpenIDConnectProvidersResponse extends js.Object {
    var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType]
  }

  /**
    * Contains details about the permissions policies that are attached to the specified identity (user, group, or role).
    *  This data type is used as a response element in the <a>ListPoliciesGrantingServiceAccess</a> operation.
    */
  @js.native
  @Factory
  trait ListPoliciesGrantingServiceAccessEntry extends js.Object {
    var Policies: js.UndefOr[policyGrantingServiceAccessListType]
    var ServiceNamespace: js.UndefOr[serviceNamespaceType]
  }

  @js.native
  @Factory
  trait ListPoliciesGrantingServiceAccessRequest extends js.Object {
    var Arn: arnType
    var ServiceNamespaces: serviceNamespaceListType
    var Marker: js.UndefOr[markerType]
  }

  @js.native
  @Factory
  trait ListPoliciesGrantingServiceAccessResponse extends js.Object {
    var PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListPoliciesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var OnlyAttached: js.UndefOr[booleanType]
    var PathPrefix: js.UndefOr[policyPathType]
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType]
    var Scope: js.UndefOr[policyScopeType]
  }

  /**
    * Contains the response to a successful <a>ListPolicies</a> request.
    */
  @js.native
  @Factory
  trait ListPoliciesResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var Policies: js.UndefOr[policyListType]
  }

  @js.native
  @Factory
  trait ListPolicyVersionsRequest extends js.Object {
    var PolicyArn: arnType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListPolicyVersions</a> request.
    */
  @js.native
  @Factory
  trait ListPolicyVersionsResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var Versions: js.UndefOr[policyDocumentVersionListType]
  }

  @js.native
  @Factory
  trait ListRolePoliciesRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListRolePolicies</a> request.
    */
  @js.native
  @Factory
  trait ListRolePoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListRoleTagsRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  @js.native
  @Factory
  trait ListRoleTagsResponse extends js.Object {
    var Tags: tagListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListRolesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  /**
    * Contains the response to a successful <a>ListRoles</a> request.
    */
  @js.native
  @Factory
  trait ListRolesResponse extends js.Object {
    var Roles: roleListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListSAMLProvidersRequest extends js.Object {}

  /**
    * Contains the response to a successful <a>ListSAMLProviders</a> request.
    */
  @js.native
  @Factory
  trait ListSAMLProvidersResponse extends js.Object {
    var SAMLProviderList: js.UndefOr[SAMLProviderListType]
  }

  @js.native
  @Factory
  trait ListSSHPublicKeysRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[userNameType]
  }

  /**
    * Contains the response to a successful <a>ListSSHPublicKeys</a> request.
    */
  @js.native
  @Factory
  trait ListSSHPublicKeysResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
    var SSHPublicKeys: js.UndefOr[SSHPublicKeyListType]
  }

  @js.native
  @Factory
  trait ListServerCertificatesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  /**
    * Contains the response to a successful <a>ListServerCertificates</a> request.
    */
  @js.native
  @Factory
  trait ListServerCertificatesResponse extends js.Object {
    var ServerCertificateMetadataList: serverCertificateMetadataListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListServiceSpecificCredentialsRequest extends js.Object {
    var ServiceName: js.UndefOr[serviceName]
    var UserName: js.UndefOr[userNameType]
  }

  @js.native
  @Factory
  trait ListServiceSpecificCredentialsResponse extends js.Object {
    var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType]
  }

  @js.native
  @Factory
  trait ListSigningCertificatesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  /**
    * Contains the response to a successful <a>ListSigningCertificates</a> request.
    */
  @js.native
  @Factory
  trait ListSigningCertificatesResponse extends js.Object {
    var Certificates: certificateListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListUserPoliciesRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListUserPolicies</a> request.
    */
  @js.native
  @Factory
  trait ListUserPoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListUserTagsRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  @js.native
  @Factory
  trait ListUserTagsResponse extends js.Object {
    var Tags: tagListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PathPrefix: js.UndefOr[pathPrefixType]
  }

  /**
    * Contains the response to a successful <a>ListUsers</a> request.
    */
  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var Users: userListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait ListVirtualMFADevicesRequest extends js.Object {
    var AssignmentStatus: js.UndefOr[assignmentStatusType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  /**
    * Contains the response to a successful <a>ListVirtualMFADevices</a> request.
    */
  @js.native
  @Factory
  trait ListVirtualMFADevicesResponse extends js.Object {
    var VirtualMFADevices: virtualMFADeviceListType
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  /**
    * Contains the user name and password create date for a user.
    *  This data type is used as a response element in the <a>CreateLoginProfile</a> and <a>GetLoginProfile</a> operations.
    */
  @js.native
  @Factory
  trait LoginProfile extends js.Object {
    var CreateDate: dateType
    var UserName: userNameType
    var PasswordResetRequired: js.UndefOr[booleanType]
  }

  /**
    * Contains information about an MFA device.
    *  This data type is used as a response element in the <a>ListMFADevices</a> operation.
    */
  @js.native
  @Factory
  trait MFADevice extends js.Object {
    var EnableDate: dateType
    var SerialNumber: serialNumberType
    var UserName: userNameType
  }

  /**
    * Contains information about a managed policy, including the policy's ARN, versions, and the number of principal entities (users, groups, and roles) that the policy is attached to.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    *  For more information about managed policies, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait ManagedPolicyDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachmentCount: js.UndefOr[attachmentCountType]
    var CreateDate: js.UndefOr[dateType]
    var DefaultVersionId: js.UndefOr[policyVersionIdType]
    var Description: js.UndefOr[policyDescriptionType]
    var IsAttachable: js.UndefOr[booleanType]
    var Path: js.UndefOr[policyPathType]
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType]
    var PolicyId: js.UndefOr[idType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyVersionList: js.UndefOr[policyDocumentVersionListType]
    var UpdateDate: js.UndefOr[dateType]
  }

  /**
    * Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.
    */
  @js.native
  @Factory
  trait OpenIDConnectProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType]
  }

  /**
    * Contains information about the effect that Organizations has on a policy simulation.
    */
  @js.native
  @Factory
  trait OrganizationsDecisionDetail extends js.Object {
    var AllowedByOrganizations: js.UndefOr[booleanType]
  }

  /**
    * Contains information about the account password policy.
    *  This data type is used as a response element in the <a>GetAccountPasswordPolicy</a> operation.
    */
  @js.native
  @Factory
  trait PasswordPolicy extends js.Object {
    var AllowUsersToChangePassword: js.UndefOr[booleanType]
    var ExpirePasswords: js.UndefOr[booleanType]
    var HardExpiry: js.UndefOr[booleanObjectType]
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType]
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType]
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType]
    var RequireLowercaseCharacters: js.UndefOr[booleanType]
    var RequireNumbers: js.UndefOr[booleanType]
    var RequireSymbols: js.UndefOr[booleanType]
    var RequireUppercaseCharacters: js.UndefOr[booleanType]
  }

  @js.native
  sealed trait PermissionsBoundaryAttachmentType extends js.Any
  object PermissionsBoundaryAttachmentType extends js.Object {
    val PermissionsBoundaryPolicy = "PermissionsBoundaryPolicy".asInstanceOf[PermissionsBoundaryAttachmentType]

    val values = js.Object.freeze(js.Array(PermissionsBoundaryPolicy))
  }

  /**
    * Contains information about the effect that a permissions boundary has on a policy simulation when the boundary is applied to an IAM entity.
    */
  @js.native
  @Factory
  trait PermissionsBoundaryDecisionDetail extends js.Object {
    var AllowedByPermissionsBoundary: js.UndefOr[booleanType]
  }

  /**
    * Contains information about a managed policy.
    *  This data type is used as a response element in the <a>CreatePolicy</a>, <a>GetPolicy</a>, and <a>ListPolicies</a> operations.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait Policy extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachmentCount: js.UndefOr[attachmentCountType]
    var CreateDate: js.UndefOr[dateType]
    var DefaultVersionId: js.UndefOr[policyVersionIdType]
    var Description: js.UndefOr[policyDescriptionType]
    var IsAttachable: js.UndefOr[booleanType]
    var Path: js.UndefOr[policyPathType]
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType]
    var PolicyId: js.UndefOr[idType]
    var PolicyName: js.UndefOr[policyNameType]
    var UpdateDate: js.UndefOr[dateType]
  }

  /**
    * Contains information about an IAM policy, including the policy document.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  @Factory
  trait PolicyDetail extends js.Object {
    var PolicyDocument: js.UndefOr[policyDocumentType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  @js.native
  sealed trait PolicyEvaluationDecisionType extends js.Any
  object PolicyEvaluationDecisionType extends js.Object {
    val allowed      = "allowed".asInstanceOf[PolicyEvaluationDecisionType]
    val explicitDeny = "explicitDeny".asInstanceOf[PolicyEvaluationDecisionType]
    val implicitDeny = "implicitDeny".asInstanceOf[PolicyEvaluationDecisionType]

    val values = js.Object.freeze(js.Array(allowed, explicitDeny, implicitDeny))
  }

  /**
    * Contains details about the permissions policies that are attached to the specified identity (user, group, or role).
    *  This data type is an element of the <a>ListPoliciesGrantingServiceAccessEntry</a> object.
    */
  @js.native
  @Factory
  trait PolicyGrantingServiceAccess extends js.Object {
    var PolicyName: policyNameType
    var PolicyType: policyType
    var EntityName: js.UndefOr[entityNameType]
    var EntityType: js.UndefOr[policyOwnerEntityType]
    var PolicyArn: js.UndefOr[arnType]
  }

  /**
    * Contains information about a group that a managed policy is attached to.
    *  This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait PolicyGroup extends js.Object {
    var GroupId: js.UndefOr[idType]
    var GroupName: js.UndefOr[groupNameType]
  }

  /**
    * Contains information about a role that a managed policy is attached to.
    *  This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait PolicyRole extends js.Object {
    var RoleId: js.UndefOr[idType]
    var RoleName: js.UndefOr[roleNameType]
  }

  @js.native
  sealed trait PolicySourceType extends js.Any
  object PolicySourceType extends js.Object {
    val user           = "user".asInstanceOf[PolicySourceType]
    val group          = "group".asInstanceOf[PolicySourceType]
    val role           = "role".asInstanceOf[PolicySourceType]
    val `aws-managed`  = "aws-managed".asInstanceOf[PolicySourceType]
    val `user-managed` = "user-managed".asInstanceOf[PolicySourceType]
    val resource       = "resource".asInstanceOf[PolicySourceType]
    val none           = "none".asInstanceOf[PolicySourceType]

    val values = js.Object.freeze(js.Array(user, group, role, `aws-managed`, `user-managed`, resource, none))
  }

  /**
    * The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity.
    *  For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions Boundaries for IAM Identities ]] in the <i>IAM User Guide</i>.
    */
  @js.native
  sealed trait PolicyUsageType extends js.Any
  object PolicyUsageType extends js.Object {
    val PermissionsPolicy   = "PermissionsPolicy".asInstanceOf[PolicyUsageType]
    val PermissionsBoundary = "PermissionsBoundary".asInstanceOf[PolicyUsageType]

    val values = js.Object.freeze(js.Array(PermissionsPolicy, PermissionsBoundary))
  }

  /**
    * Contains information about a user that a managed policy is attached to.
    *  This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait PolicyUser extends js.Object {
    var UserId: js.UndefOr[idType]
    var UserName: js.UndefOr[userNameType]
  }

  /**
    * Contains information about a version of a managed policy.
    *  This data type is used as a response element in the <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>, <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a> operations.
    *  For more information about managed policies, refer to [[https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html|Managed Policies and Inline Policies]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait PolicyVersion extends js.Object {
    var CreateDate: js.UndefOr[dateType]
    var Document: js.UndefOr[policyDocumentType]
    var IsDefaultVersion: js.UndefOr[booleanType]
    var VersionId: js.UndefOr[policyVersionIdType]
  }

  /**
    * Contains the row and column of a location of a <code>Statement</code> element in a policy document.
    *  This data type is used as a member of the <code> <a>Statement</a> </code> type.
    */
  @js.native
  @Factory
  trait Position extends js.Object {
    var Column: js.UndefOr[ColumnNumber]
    var Line: js.UndefOr[LineNumber]
  }

  @js.native
  @Factory
  trait PutGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
  }

  @js.native
  @Factory
  trait PutRolePermissionsBoundaryRequest extends js.Object {
    var PermissionsBoundary: arnType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait PutRolePolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait PutUserPermissionsBoundaryRequest extends js.Object {
    var PermissionsBoundary: arnType
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait PutUserPolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var PolicyName: policyNameType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
    var ClientID: clientIDType
    var OpenIDConnectProviderArn: arnType
  }

  @js.native
  @Factory
  trait RemoveRoleFromInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait RemoveUserFromGroupRequest extends js.Object {
    var GroupName: groupNameType
    var UserName: existingUserNameType
  }

  @js.native
  sealed trait ReportFormatType extends js.Any
  object ReportFormatType extends js.Object {
    val `text/csv` = "text/csv".asInstanceOf[ReportFormatType]

    val values = js.Object.freeze(js.Array(`text/csv`))
  }

  @js.native
  sealed trait ReportStateType extends js.Any
  object ReportStateType extends js.Object {
    val STARTED    = "STARTED".asInstanceOf[ReportStateType]
    val INPROGRESS = "INPROGRESS".asInstanceOf[ReportStateType]
    val COMPLETE   = "COMPLETE".asInstanceOf[ReportStateType]

    val values = js.Object.freeze(js.Array(STARTED, INPROGRESS, COMPLETE))
  }

  @js.native
  @Factory
  trait ResetServiceSpecificCredentialRequest extends js.Object {
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var UserName: js.UndefOr[userNameType]
  }

  @js.native
  @Factory
  trait ResetServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential]
  }

  /**
    * Contains the result of the simulation of a single API operation call on a single resource.
    *  This data type is used by a member of the <a>EvaluationResult</a> data type.
    */
  @js.native
  @Factory
  trait ResourceSpecificResult extends js.Object {
    var EvalResourceDecision: PolicyEvaluationDecisionType
    var EvalResourceName: ResourceNameType
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType]
    var MatchedStatements: js.UndefOr[StatementListType]
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType]
    var PermissionsBoundaryDecisionDetail: js.UndefOr[PermissionsBoundaryDecisionDetail]
  }

  @js.native
  @Factory
  trait ResyncMFADeviceRequest extends js.Object {
    var AuthenticationCode1: authenticationCodeType
    var AuthenticationCode2: authenticationCodeType
    var SerialNumber: serialNumberType
    var UserName: existingUserNameType
  }

  /**
    * Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.
    */
  @js.native
  @Factory
  trait Role extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var Path: pathType
    var RoleId: idType
    var RoleName: roleNameType
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var RoleLastUsed: js.UndefOr[RoleLastUsed]
    var Tags: js.UndefOr[tagListType]
  }

  /**
    * Contains information about an IAM role, including all of the role's policies.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  @Factory
  trait RoleDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var CreateDate: js.UndefOr[dateType]
    var InstanceProfileList: js.UndefOr[instanceProfileListType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var RoleId: js.UndefOr[idType]
    var RoleLastUsed: js.UndefOr[RoleLastUsed]
    var RoleName: js.UndefOr[roleNameType]
    var RolePolicyList: js.UndefOr[policyDetailListType]
    var Tags: js.UndefOr[tagListType]
  }

  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period|Regions Where Data Is Tracked]] in the <i>IAM User Guide</i>.
    *  This data type is returned as a response element in the <a>GetRole</a> and <a>GetAccountAuthorizationDetails</a> operations.
    */
  @js.native
  @Factory
  trait RoleLastUsed extends js.Object {
    var LastUsedDate: js.UndefOr[dateType]
    var Region: js.UndefOr[stringType]
  }

  /**
    * An object that contains details about how a service-linked role is used, if that information is returned by the service.
    *  This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.
    */
  @js.native
  @Factory
  trait RoleUsageType extends js.Object {
    var Region: js.UndefOr[RegionNameType]
    var Resources: js.UndefOr[ArnListType]
  }

  /**
    * Contains the list of SAML providers for this account.
    */
  @js.native
  @Factory
  trait SAMLProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var ValidUntil: js.UndefOr[dateType]
  }

  /**
    * Contains information about an SSH public key.
    *  This data type is used as a response element in the <a>GetSSHPublicKey</a> and <a>UploadSSHPublicKey</a> operations.
    */
  @js.native
  @Factory
  trait SSHPublicKey extends js.Object {
    var Fingerprint: publicKeyFingerprintType
    var SSHPublicKeyBody: publicKeyMaterialType
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UserName: userNameType
    var UploadDate: js.UndefOr[dateType]
  }

  /**
    * Contains information about an SSH public key, without the key's body or fingerprint.
    *  This data type is used as a response element in the <a>ListSSHPublicKeys</a> operation.
    */
  @js.native
  @Factory
  trait SSHPublicKeyMetadata extends js.Object {
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UploadDate: dateType
    var UserName: userNameType
  }

  /**
    * Contains information about a server certificate.
    *  This data type is used as a response element in the <a>GetServerCertificate</a> operation.
    */
  @js.native
  @Factory
  trait ServerCertificate extends js.Object {
    var CertificateBody: certificateBodyType
    var ServerCertificateMetadata: ServerCertificateMetadata
    var CertificateChain: js.UndefOr[certificateChainType]
  }

  /**
    * Contains information about a server certificate without its certificate body, certificate chain, and private key.
    *  This data type is used as a response element in the <a>UploadServerCertificate</a> and <a>ListServerCertificates</a> operations.
    */
  @js.native
  @Factory
  trait ServerCertificateMetadata extends js.Object {
    var Arn: arnType
    var Path: pathType
    var ServerCertificateId: idType
    var ServerCertificateName: serverCertificateNameType
    var Expiration: js.UndefOr[dateType]
    var UploadDate: js.UndefOr[dateType]
  }

  /**
    * Contains details about the most recent attempt to access the service.
    *  This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.
    */
  @js.native
  @Factory
  trait ServiceLastAccessed extends js.Object {
    var ServiceName: serviceNameType
    var ServiceNamespace: serviceNamespaceType
    var LastAuthenticated: js.UndefOr[dateType]
    var LastAuthenticatedEntity: js.UndefOr[arnType]
    var TotalAuthenticatedEntities: js.UndefOr[integerType]
  }

  /**
    * Contains the details of a service-specific credential.
    */
  @js.native
  @Factory
  trait ServiceSpecificCredential extends js.Object {
    var CreateDate: dateType
    var ServiceName: serviceName
    var ServicePassword: servicePassword
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var ServiceUserName: serviceUserName
    var Status: statusType
    var UserName: userNameType
  }

  /**
    * Contains additional details about a service-specific credential.
    */
  @js.native
  @Factory
  trait ServiceSpecificCredentialMetadata extends js.Object {
    var CreateDate: dateType
    var ServiceName: serviceName
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var ServiceUserName: serviceUserName
    var Status: statusType
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  @js.native
  @Factory
  trait SetSecurityTokenServicePreferencesRequest extends js.Object {
    var GlobalEndpointTokenVersion: globalEndpointTokenVersion
  }

  /**
    * Contains information about an X.509 signing certificate.
    *  This data type is used as a response element in the <a>UploadSigningCertificate</a> and <a>ListSigningCertificates</a> operations.
    */
  @js.native
  @Factory
  trait SigningCertificate extends js.Object {
    var CertificateBody: certificateBodyType
    var CertificateId: certificateIdType
    var Status: statusType
    var UserName: userNameType
    var UploadDate: js.UndefOr[dateType]
  }

  @js.native
  @Factory
  trait SimulateCustomPolicyRequest extends js.Object {
    var ActionNames: ActionNameListType
    var PolicyInputList: SimulationPolicyListType
    var CallerArn: js.UndefOr[ResourceNameType]
    var ContextEntries: js.UndefOr[ContextEntryListType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PermissionsBoundaryPolicyInputList: js.UndefOr[SimulationPolicyListType]
    var ResourceArns: js.UndefOr[ResourceNameListType]
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType]
    var ResourceOwner: js.UndefOr[ResourceNameType]
    var ResourcePolicy: js.UndefOr[policyDocumentType]
  }

  /**
    * Contains the response to a successful <a>SimulatePrincipalPolicy</a> or <a>SimulateCustomPolicy</a> request.
    */
  @js.native
  @Factory
  trait SimulatePolicyResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResultsListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[responseMarkerType]
  }

  @js.native
  @Factory
  trait SimulatePrincipalPolicyRequest extends js.Object {
    var ActionNames: ActionNameListType
    var PolicySourceArn: arnType
    var CallerArn: js.UndefOr[ResourceNameType]
    var ContextEntries: js.UndefOr[ContextEntryListType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
    var PermissionsBoundaryPolicyInputList: js.UndefOr[SimulationPolicyListType]
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
    var ResourceArns: js.UndefOr[ResourceNameListType]
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType]
    var ResourceOwner: js.UndefOr[ResourceNameType]
    var ResourcePolicy: js.UndefOr[policyDocumentType]
  }

  /**
    * Contains a reference to a <code>Statement</code> element in a policy document that determines the result of the simulation.
    *  This data type is used by the <code>MatchedStatements</code> member of the <code> <a>EvaluationResult</a> </code> type.
    */
  @js.native
  @Factory
  trait Statement extends js.Object {
    var EndPosition: js.UndefOr[Position]
    var SourcePolicyId: js.UndefOr[PolicyIdentifierType]
    var SourcePolicyType: js.UndefOr[PolicySourceType]
    var StartPosition: js.UndefOr[Position]
  }

  /**
    * A structure that represents user-provided metadata that can be associated with a resource such as an IAM user or role. For more information about tagging, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html|Tagging IAM Identities]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: tagKeyType
    var Value: tagValueType
  }

  @js.native
  @Factory
  trait TagRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Tags: tagListType
  }

  @js.native
  @Factory
  trait TagUserRequest extends js.Object {
    var Tags: tagListType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait UntagRoleRequest extends js.Object {
    var RoleName: roleNameType
    var TagKeys: tagKeyListType
  }

  @js.native
  @Factory
  trait UntagUserRequest extends js.Object {
    var TagKeys: tagKeyListType
    var UserName: existingUserNameType
  }

  @js.native
  @Factory
  trait UpdateAccessKeyRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
    var Status: statusType
    var UserName: js.UndefOr[existingUserNameType]
  }

  @js.native
  @Factory
  trait UpdateAccountPasswordPolicyRequest extends js.Object {
    var AllowUsersToChangePassword: js.UndefOr[booleanType]
    var HardExpiry: js.UndefOr[booleanObjectType]
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType]
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType]
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType]
    var RequireLowercaseCharacters: js.UndefOr[booleanType]
    var RequireNumbers: js.UndefOr[booleanType]
    var RequireSymbols: js.UndefOr[booleanType]
    var RequireUppercaseCharacters: js.UndefOr[booleanType]
  }

  @js.native
  @Factory
  trait UpdateAssumeRolePolicyRequest extends js.Object {
    var PolicyDocument: policyDocumentType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait UpdateGroupRequest extends js.Object {
    var GroupName: groupNameType
    var NewGroupName: js.UndefOr[groupNameType]
    var NewPath: js.UndefOr[pathType]
  }

  @js.native
  @Factory
  trait UpdateLoginProfileRequest extends js.Object {
    var UserName: userNameType
    var Password: js.UndefOr[passwordType]
    var PasswordResetRequired: js.UndefOr[booleanObjectType]
  }

  @js.native
  @Factory
  trait UpdateOpenIDConnectProviderThumbprintRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
    var ThumbprintList: thumbprintListType
  }

  @js.native
  @Factory
  trait UpdateRoleDescriptionRequest extends js.Object {
    var Description: roleDescriptionType
    var RoleName: roleNameType
  }

  @js.native
  @Factory
  trait UpdateRoleDescriptionResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  @js.native
  @Factory
  trait UpdateRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
  }

  @js.native
  @Factory
  trait UpdateRoleResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateSAMLProviderRequest extends js.Object {
    var SAMLMetadataDocument: SAMLMetadataDocumentType
    var SAMLProviderArn: arnType
  }

  /**
    * Contains the response to a successful <a>UpdateSAMLProvider</a> request.
    */
  @js.native
  @Factory
  trait UpdateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  @js.native
  @Factory
  trait UpdateSSHPublicKeyRequest extends js.Object {
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UserName: userNameType
  }

  @js.native
  @Factory
  trait UpdateServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
    var NewPath: js.UndefOr[pathType]
    var NewServerCertificateName: js.UndefOr[serverCertificateNameType]
  }

  @js.native
  @Factory
  trait UpdateServiceSpecificCredentialRequest extends js.Object {
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var Status: statusType
    var UserName: js.UndefOr[userNameType]
  }

  @js.native
  @Factory
  trait UpdateSigningCertificateRequest extends js.Object {
    var CertificateId: certificateIdType
    var Status: statusType
    var UserName: js.UndefOr[existingUserNameType]
  }

  @js.native
  @Factory
  trait UpdateUserRequest extends js.Object {
    var UserName: existingUserNameType
    var NewPath: js.UndefOr[pathType]
    var NewUserName: js.UndefOr[userNameType]
  }

  @js.native
  @Factory
  trait UploadSSHPublicKeyRequest extends js.Object {
    var SSHPublicKeyBody: publicKeyMaterialType
    var UserName: userNameType
  }

  /**
    * Contains the response to a successful <a>UploadSSHPublicKey</a> request.
    */
  @js.native
  @Factory
  trait UploadSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: js.UndefOr[SSHPublicKey]
  }

  @js.native
  @Factory
  trait UploadServerCertificateRequest extends js.Object {
    var CertificateBody: certificateBodyType
    var PrivateKey: privateKeyType
    var ServerCertificateName: serverCertificateNameType
    var CertificateChain: js.UndefOr[certificateChainType]
    var Path: js.UndefOr[pathType]
  }

  /**
    * Contains the response to a successful <a>UploadServerCertificate</a> request.
    */
  @js.native
  @Factory
  trait UploadServerCertificateResponse extends js.Object {
    var ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata]
  }

  @js.native
  @Factory
  trait UploadSigningCertificateRequest extends js.Object {
    var CertificateBody: certificateBodyType
    var UserName: js.UndefOr[existingUserNameType]
  }

  /**
    * Contains the response to a successful <a>UploadSigningCertificate</a> request.
    */
  @js.native
  @Factory
  trait UploadSigningCertificateResponse extends js.Object {
    var Certificate: SigningCertificate
  }

  /**
    * Contains information about an IAM user entity.
    *  This data type is used as a response element in the following operations:
    * * <a>CreateUser</a>
    *  * <a>GetUser</a>
    *  * <a>ListUsers</a>
    */
  @js.native
  @Factory
  trait User extends js.Object {
    var Arn: arnType
    var CreateDate: dateType
    var Path: pathType
    var UserId: idType
    var UserName: userNameType
    var PasswordLastUsed: js.UndefOr[dateType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Tags: js.UndefOr[tagListType]
  }

  /**
    * Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.
    *  This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
    */
  @js.native
  @Factory
  trait UserDetail extends js.Object {
    var Arn: js.UndefOr[arnType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var CreateDate: js.UndefOr[dateType]
    var GroupList: js.UndefOr[groupNameListType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Tags: js.UndefOr[tagListType]
    var UserId: js.UndefOr[idType]
    var UserName: js.UndefOr[userNameType]
    var UserPolicyList: js.UndefOr[policyDetailListType]
  }

  /**
    * Contains information about a virtual MFA device.
    */
  @js.native
  @Factory
  trait VirtualMFADevice extends js.Object {
    var SerialNumber: serialNumberType
    var Base32StringSeed: js.UndefOr[BootstrapDatum]
    var EnableDate: js.UndefOr[dateType]
    var QRCodePNG: js.UndefOr[BootstrapDatum]
    var User: js.UndefOr[User]
  }

  @js.native
  sealed trait assignmentStatusType extends js.Any
  object assignmentStatusType extends js.Object {
    val Assigned   = "Assigned".asInstanceOf[assignmentStatusType]
    val Unassigned = "Unassigned".asInstanceOf[assignmentStatusType]
    val Any        = "Any".asInstanceOf[assignmentStatusType]

    val values = js.Object.freeze(js.Array(Assigned, Unassigned, Any))
  }

  @js.native
  sealed trait encodingType extends js.Any
  object encodingType extends js.Object {
    val SSH = "SSH".asInstanceOf[encodingType]
    val PEM = "PEM".asInstanceOf[encodingType]

    val values = js.Object.freeze(js.Array(SSH, PEM))
  }

  @js.native
  sealed trait globalEndpointTokenVersion extends js.Any
  object globalEndpointTokenVersion extends js.Object {
    val v1Token = "v1Token".asInstanceOf[globalEndpointTokenVersion]
    val v2Token = "v2Token".asInstanceOf[globalEndpointTokenVersion]

    val values = js.Object.freeze(js.Array(v1Token, v2Token))
  }

  @js.native
  sealed trait jobStatusType extends js.Any
  object jobStatusType extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[jobStatusType]
    val COMPLETED   = "COMPLETED".asInstanceOf[jobStatusType]
    val FAILED      = "FAILED".asInstanceOf[jobStatusType]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED))
  }

  @js.native
  sealed trait policyOwnerEntityType extends js.Any
  object policyOwnerEntityType extends js.Object {
    val USER  = "USER".asInstanceOf[policyOwnerEntityType]
    val ROLE  = "ROLE".asInstanceOf[policyOwnerEntityType]
    val GROUP = "GROUP".asInstanceOf[policyOwnerEntityType]

    val values = js.Object.freeze(js.Array(USER, ROLE, GROUP))
  }

  @js.native
  sealed trait policyScopeType extends js.Any
  object policyScopeType extends js.Object {
    val All   = "All".asInstanceOf[policyScopeType]
    val AWS   = "AWS".asInstanceOf[policyScopeType]
    val Local = "Local".asInstanceOf[policyScopeType]

    val values = js.Object.freeze(js.Array(All, AWS, Local))
  }

  @js.native
  sealed trait policyType extends js.Any
  object policyType extends js.Object {
    val INLINE  = "INLINE".asInstanceOf[policyType]
    val MANAGED = "MANAGED".asInstanceOf[policyType]

    val values = js.Object.freeze(js.Array(INLINE, MANAGED))
  }

  @js.native
  sealed trait sortKeyType extends js.Any
  object sortKeyType extends js.Object {
    val SERVICE_NAMESPACE_ASCENDING        = "SERVICE_NAMESPACE_ASCENDING".asInstanceOf[sortKeyType]
    val SERVICE_NAMESPACE_DESCENDING       = "SERVICE_NAMESPACE_DESCENDING".asInstanceOf[sortKeyType]
    val LAST_AUTHENTICATED_TIME_ASCENDING  = "LAST_AUTHENTICATED_TIME_ASCENDING".asInstanceOf[sortKeyType]
    val LAST_AUTHENTICATED_TIME_DESCENDING = "LAST_AUTHENTICATED_TIME_DESCENDING".asInstanceOf[sortKeyType]

    val values = js.Object.freeze(
      js.Array(
        SERVICE_NAMESPACE_ASCENDING,
        SERVICE_NAMESPACE_DESCENDING,
        LAST_AUTHENTICATED_TIME_ASCENDING,
        LAST_AUTHENTICATED_TIME_DESCENDING
      )
    )
  }

  @js.native
  sealed trait statusType extends js.Any
  object statusType extends js.Object {
    val Active   = "Active".asInstanceOf[statusType]
    val Inactive = "Inactive".asInstanceOf[statusType]

    val values = js.Object.freeze(js.Array(Active, Inactive))
  }

  @js.native
  sealed trait summaryKeyType extends js.Any
  object summaryKeyType extends js.Object {
    val Users                             = "Users".asInstanceOf[summaryKeyType]
    val UsersQuota                        = "UsersQuota".asInstanceOf[summaryKeyType]
    val Groups                            = "Groups".asInstanceOf[summaryKeyType]
    val GroupsQuota                       = "GroupsQuota".asInstanceOf[summaryKeyType]
    val ServerCertificates                = "ServerCertificates".asInstanceOf[summaryKeyType]
    val ServerCertificatesQuota           = "ServerCertificatesQuota".asInstanceOf[summaryKeyType]
    val UserPolicySizeQuota               = "UserPolicySizeQuota".asInstanceOf[summaryKeyType]
    val GroupPolicySizeQuota              = "GroupPolicySizeQuota".asInstanceOf[summaryKeyType]
    val GroupsPerUserQuota                = "GroupsPerUserQuota".asInstanceOf[summaryKeyType]
    val SigningCertificatesPerUserQuota   = "SigningCertificatesPerUserQuota".asInstanceOf[summaryKeyType]
    val AccessKeysPerUserQuota            = "AccessKeysPerUserQuota".asInstanceOf[summaryKeyType]
    val MFADevices                        = "MFADevices".asInstanceOf[summaryKeyType]
    val MFADevicesInUse                   = "MFADevicesInUse".asInstanceOf[summaryKeyType]
    val AccountMFAEnabled                 = "AccountMFAEnabled".asInstanceOf[summaryKeyType]
    val AccountAccessKeysPresent          = "AccountAccessKeysPresent".asInstanceOf[summaryKeyType]
    val AccountSigningCertificatesPresent = "AccountSigningCertificatesPresent".asInstanceOf[summaryKeyType]
    val AttachedPoliciesPerGroupQuota     = "AttachedPoliciesPerGroupQuota".asInstanceOf[summaryKeyType]
    val AttachedPoliciesPerRoleQuota      = "AttachedPoliciesPerRoleQuota".asInstanceOf[summaryKeyType]
    val AttachedPoliciesPerUserQuota      = "AttachedPoliciesPerUserQuota".asInstanceOf[summaryKeyType]
    val Policies                          = "Policies".asInstanceOf[summaryKeyType]
    val PoliciesQuota                     = "PoliciesQuota".asInstanceOf[summaryKeyType]
    val PolicySizeQuota                   = "PolicySizeQuota".asInstanceOf[summaryKeyType]
    val PolicyVersionsInUse               = "PolicyVersionsInUse".asInstanceOf[summaryKeyType]
    val PolicyVersionsInUseQuota          = "PolicyVersionsInUseQuota".asInstanceOf[summaryKeyType]
    val VersionsPerPolicyQuota            = "VersionsPerPolicyQuota".asInstanceOf[summaryKeyType]
    val GlobalEndpointTokenVersion        = "GlobalEndpointTokenVersion".asInstanceOf[summaryKeyType]

    val values = js.Object.freeze(
      js.Array(
        Users,
        UsersQuota,
        Groups,
        GroupsQuota,
        ServerCertificates,
        ServerCertificatesQuota,
        UserPolicySizeQuota,
        GroupPolicySizeQuota,
        GroupsPerUserQuota,
        SigningCertificatesPerUserQuota,
        AccessKeysPerUserQuota,
        MFADevices,
        MFADevicesInUse,
        AccountMFAEnabled,
        AccountAccessKeysPresent,
        AccountSigningCertificatesPresent,
        AttachedPoliciesPerGroupQuota,
        AttachedPoliciesPerRoleQuota,
        AttachedPoliciesPerUserQuota,
        Policies,
        PoliciesQuota,
        PolicySizeQuota,
        PolicyVersionsInUse,
        PolicyVersionsInUseQuota,
        VersionsPerPolicyQuota,
        GlobalEndpointTokenVersion
      )
    )
  }
}
