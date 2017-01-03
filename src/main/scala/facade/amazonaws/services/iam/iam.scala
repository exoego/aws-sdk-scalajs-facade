package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object iam {
  type ActionNameListType = js.Array[ActionNameType]
  type ActionNameType = String
  type BootstrapDatum = js.Array[Byte]
  type ColumnNumber = Integer
  type ContextEntryListType = js.Array[ContextEntry]
  type ContextKeyNameType = String
  type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]
  type ContextKeyTypeEnum = String
  type ContextKeyValueListType = js.Array[ContextKeyValueType]
  type ContextKeyValueType = String
  type EntityType = String
  type EvalDecisionDetailsType = js.Dictionary[PolicyEvaluationDecisionType]
  type EvalDecisionSourceType = String
  type EvaluationResultsListType = js.Array[EvaluationResult]
  type LineNumber = Integer
  type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = String
  type PolicyEvaluationDecisionType = String
  type PolicyGroupListType = js.Array[PolicyGroup]
  type PolicyIdentifierType = String
  type PolicyRoleListType = js.Array[PolicyRole]
  type PolicySourceType = String
  type PolicyUserListType = js.Array[PolicyUser]
  type ReportContentType = js.Array[Byte]
  type ReportFormatType = String
  type ReportStateDescriptionType = String
  type ReportStateType = String
  type ResourceHandlingOptionType = String
  type ResourceNameListType = js.Array[ResourceNameType]
  type ResourceNameType = String
  type ResourceSpecificResultListType = js.Array[ResourceSpecificResult]
  type SAMLMetadataDocumentType = String
  type SAMLProviderListType = js.Array[SAMLProviderListEntry]
  type SAMLProviderNameType = String
  type SSHPublicKeyListType = js.Array[SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType = js.Array[ServiceSpecificCredentialMetadata]
  type SimulationPolicyListType = js.Array[policyDocumentType]
  type StatementListType = js.Array[Statement]
  type accessKeyIdType = String
  type accessKeyMetadataListType = js.Array[AccessKeyMetadata]
  type accessKeySecretType = String
  type accountAliasListType = js.Array[accountAliasType]
  type accountAliasType = String
  type arnType = String
  type assignmentStatusType = String
  type attachedPoliciesListType = js.Array[AttachedPolicy]
  type attachmentCountType = Integer
  type authenticationCodeType = String
  type booleanObjectType = Boolean
  type booleanType = Boolean
  type certificateBodyType = String
  type certificateChainType = String
  type certificateIdType = String
  type certificateListType = js.Array[SigningCertificate]
  type clientIDListType = js.Array[clientIDType]
  type clientIDType = String
  type credentialReportExpiredExceptionMessage = String
  type credentialReportNotPresentExceptionMessage = String
  type credentialReportNotReadyExceptionMessage = String
  type dateType = js.Date
  type deleteConflictMessage = String
  type duplicateCertificateMessage = String
  type duplicateSSHPublicKeyMessage = String
  type encodingType = String
  type entityAlreadyExistsMessage = String
  type entityListType = js.Array[EntityType]
  type entityTemporarilyUnmodifiableMessage = String
  type existingUserNameType = String
  type groupDetailListType = js.Array[GroupDetail]
  type groupListType = js.Array[Group]
  type groupNameListType = js.Array[groupNameType]
  type groupNameType = String
  type idType = String
  type instanceProfileListType = js.Array[InstanceProfile]
  type instanceProfileNameType = String
  type invalidAuthenticationCodeMessage = String
  type invalidCertificateMessage = String
  type invalidInputMessage = String
  type invalidPublicKeyMessage = String
  type invalidUserTypeMessage = String
  type keyPairMismatchMessage = String
  type limitExceededMessage = String
  type malformedCertificateMessage = String
  type malformedPolicyDocumentMessage = String
  type markerType = String
  type maxItemsType = Integer
  type maxPasswordAgeType = Integer
  type mfaDeviceListType = js.Array[MFADevice]
  type minimumPasswordLengthType = Integer
  type noSuchEntityMessage = String
  type passwordPolicyViolationMessage = String
  type passwordReusePreventionType = Integer
  type passwordType = String
  type pathPrefixType = String
  type pathType = String
  type policyDescriptionType = String
  type policyDetailListType = js.Array[PolicyDetail]
  type policyDocumentType = String
  type policyDocumentVersionListType = js.Array[PolicyVersion]
  type policyEvaluationErrorMessage = String
  type policyListType = js.Array[Policy]
  type policyNameListType = js.Array[policyNameType]
  type policyNameType = String
  type policyPathType = String
  type policyScopeType = String
  type policyVersionIdType = String
  type privateKeyType = String
  type publicKeyFingerprintType = String
  type publicKeyIdType = String
  type publicKeyMaterialType = String
  type roleDetailListType = js.Array[RoleDetail]
  type roleListType = js.Array[Role]
  type roleNameType = String
  type serialNumberType = String
  type serverCertificateMetadataListType = js.Array[ServerCertificateMetadata]
  type serverCertificateNameType = String
  type serviceFailureExceptionMessage = String
  type serviceName = String
  type serviceNotSupportedMessage = String
  type servicePassword = String
  type serviceSpecificCredentialId = String
  type serviceUserName = String
  type statusType = String
  type stringType = String
  type summaryKeyType = String
  type summaryMapType = js.Dictionary[summaryValueType]
  type summaryValueType = Integer
  type thumbprintListType = js.Array[thumbprintType]
  type thumbprintType = String
  type unrecognizedPublicKeyEncodingMessage = String
  type userDetailListType = js.Array[UserDetail]
  type userListType = js.Array[User]
  type userNameType = String
  type virtualMFADeviceListType = js.Array[VirtualMFADevice]
  type virtualMFADeviceName = String
}

package iam {
  @js.native
  trait Iam extends js.Object {
    def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest, callback: Callback[js.Object]): Unit = js.native
    def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest): Request[js.Object] = js.native
    def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest): Request[js.Object] = js.native
    def addUserToGroup(params: AddUserToGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def addUserToGroup(params: AddUserToGroupRequest): Request[js.Object] = js.native
    def attachGroupPolicy(params: AttachGroupPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def attachGroupPolicy(params: AttachGroupPolicyRequest): Request[js.Object] = js.native
    def attachRolePolicy(params: AttachRolePolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def attachRolePolicy(params: AttachRolePolicyRequest): Request[js.Object] = js.native
    def attachUserPolicy(params: AttachUserPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def attachUserPolicy(params: AttachUserPolicyRequest): Request[js.Object] = js.native
    def changePassword(params: ChangePasswordRequest, callback: Callback[js.Object]): Unit = js.native
    def changePassword(params: ChangePasswordRequest): Request[js.Object] = js.native
    def createAccessKey(params: CreateAccessKeyRequest, callback: Callback[CreateAccessKeyResponse]): Unit = js.native
    def createAccessKey(params: CreateAccessKeyRequest): Request[CreateAccessKeyResponse] = js.native
    def createAccountAlias(params: CreateAccountAliasRequest, callback: Callback[js.Object]): Unit = js.native
    def createAccountAlias(params: CreateAccountAliasRequest): Request[js.Object] = js.native
    def createGroup(params: CreateGroupRequest, callback: Callback[CreateGroupResponse]): Unit = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest, callback: Callback[CreateInstanceProfileResponse]): Unit = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResponse] = js.native
    def createLoginProfile(params: CreateLoginProfileRequest, callback: Callback[CreateLoginProfileResponse]): Unit = js.native
    def createLoginProfile(params: CreateLoginProfileRequest): Request[CreateLoginProfileResponse] = js.native
    def createOpenIDConnectProvider(params: CreateOpenIDConnectProviderRequest, callback: Callback[CreateOpenIDConnectProviderResponse]): Unit = js.native
    def createOpenIDConnectProvider(params: CreateOpenIDConnectProviderRequest): Request[CreateOpenIDConnectProviderResponse] = js.native
    def createPolicy(params: CreatePolicyRequest, callback: Callback[CreatePolicyResponse]): Unit = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse] = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest, callback: Callback[CreatePolicyVersionResponse]): Unit = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createRole(params: CreateRoleRequest, callback: Callback[CreateRoleResponse]): Unit = js.native
    def createRole(params: CreateRoleRequest): Request[CreateRoleResponse] = js.native
    def createSAMLProvider(params: CreateSAMLProviderRequest, callback: Callback[CreateSAMLProviderResponse]): Unit = js.native
    def createSAMLProvider(params: CreateSAMLProviderRequest): Request[CreateSAMLProviderResponse] = js.native
    def createServiceSpecificCredential(params: CreateServiceSpecificCredentialRequest, callback: Callback[CreateServiceSpecificCredentialResponse]): Unit = js.native
    def createServiceSpecificCredential(params: CreateServiceSpecificCredentialRequest): Request[CreateServiceSpecificCredentialResponse] = js.native
    def createUser(params: CreateUserRequest, callback: Callback[CreateUserResponse]): Unit = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest, callback: Callback[CreateVirtualMFADeviceResponse]): Unit = js.native
    def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest): Request[CreateVirtualMFADeviceResponse] = js.native
    def deactivateMFADevice(params: DeactivateMFADeviceRequest, callback: Callback[js.Object]): Unit = js.native
    def deactivateMFADevice(params: DeactivateMFADeviceRequest): Request[js.Object] = js.native
    def deleteAccessKey(params: DeleteAccessKeyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteAccessKey(params: DeleteAccessKeyRequest): Request[js.Object] = js.native
    def deleteAccountAlias(params: DeleteAccountAliasRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[js.Object] = js.native
    def deleteAccountPasswordPolicy(callback: Callback[js.Object]): Unit = js.native
    def deleteAccountPasswordPolicy(): Request[js.Object] = js.native
    def deleteGroup(params: DeleteGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[js.Object] = js.native
    def deleteGroupPolicy(params: DeleteGroupPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteGroupPolicy(params: DeleteGroupPolicyRequest): Request[js.Object] = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[js.Object] = js.native
    def deleteLoginProfile(params: DeleteLoginProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteLoginProfile(params: DeleteLoginProfileRequest): Request[js.Object] = js.native
    def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest, callback: Callback[js.Object]): Unit = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object] = js.native
    def deleteRole(params: DeleteRoleRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteRole(params: DeleteRoleRequest): Request[js.Object] = js.native
    def deleteRolePolicy(params: DeleteRolePolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteRolePolicy(params: DeleteRolePolicyRequest): Request[js.Object] = js.native
    def deleteSAMLProvider(params: DeleteSAMLProviderRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSAMLProvider(params: DeleteSAMLProviderRequest): Request[js.Object] = js.native
    def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest): Request[js.Object] = js.native
    def deleteServerCertificate(params: DeleteServerCertificateRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteServerCertificate(params: DeleteServerCertificateRequest): Request[js.Object] = js.native
    def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def deleteSigningCertificate(params: DeleteSigningCertificateRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSigningCertificate(params: DeleteSigningCertificateRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteUserPolicy(params: DeleteUserPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteUserPolicy(params: DeleteUserPolicyRequest): Request[js.Object] = js.native
    def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest): Request[js.Object] = js.native
    def detachGroupPolicy(params: DetachGroupPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def detachGroupPolicy(params: DetachGroupPolicyRequest): Request[js.Object] = js.native
    def detachRolePolicy(params: DetachRolePolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def detachRolePolicy(params: DetachRolePolicyRequest): Request[js.Object] = js.native
    def detachUserPolicy(params: DetachUserPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def detachUserPolicy(params: DetachUserPolicyRequest): Request[js.Object] = js.native
    def enableMFADevice(params: EnableMFADeviceRequest, callback: Callback[js.Object]): Unit = js.native
    def enableMFADevice(params: EnableMFADeviceRequest): Request[js.Object] = js.native
    def generateCredentialReport(callback: Callback[GenerateCredentialReportResponse]): Unit = js.native
    def generateCredentialReport(): Request[GenerateCredentialReportResponse] = js.native
    def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest, callback: Callback[GetAccessKeyLastUsedResponse]): Unit = js.native
    def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest): Request[GetAccessKeyLastUsedResponse] = js.native
    def getAccountAuthorizationDetails(params: GetAccountAuthorizationDetailsRequest, callback: Callback[GetAccountAuthorizationDetailsResponse]): Unit = js.native
    def getAccountAuthorizationDetails(params: GetAccountAuthorizationDetailsRequest): Request[GetAccountAuthorizationDetailsResponse] = js.native
    def getAccountPasswordPolicy(callback: Callback[GetAccountPasswordPolicyResponse]): Unit = js.native
    def getAccountPasswordPolicy(): Request[GetAccountPasswordPolicyResponse] = js.native
    def getAccountSummary(callback: Callback[GetAccountSummaryResponse]): Unit = js.native
    def getAccountSummary(): Request[GetAccountSummaryResponse] = js.native
    def getContextKeysForCustomPolicy(params: GetContextKeysForCustomPolicyRequest, callback: Callback[GetContextKeysForPolicyResponse]): Unit = js.native
    def getContextKeysForCustomPolicy(params: GetContextKeysForCustomPolicyRequest): Request[GetContextKeysForPolicyResponse] = js.native
    def getContextKeysForPrincipalPolicy(params: GetContextKeysForPrincipalPolicyRequest, callback: Callback[GetContextKeysForPolicyResponse]): Unit = js.native
    def getContextKeysForPrincipalPolicy(params: GetContextKeysForPrincipalPolicyRequest): Request[GetContextKeysForPolicyResponse] = js.native
    def getCredentialReport(callback: Callback[GetCredentialReportResponse]): Unit = js.native
    def getCredentialReport(): Request[GetCredentialReportResponse] = js.native
    def getGroup(params: GetGroupRequest, callback: Callback[GetGroupResponse]): Unit = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse] = js.native
    def getGroupPolicy(params: GetGroupPolicyRequest, callback: Callback[GetGroupPolicyResponse]): Unit = js.native
    def getGroupPolicy(params: GetGroupPolicyRequest): Request[GetGroupPolicyResponse] = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest, callback: Callback[GetInstanceProfileResponse]): Unit = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResponse] = js.native
    def getLoginProfile(params: GetLoginProfileRequest, callback: Callback[GetLoginProfileResponse]): Unit = js.native
    def getLoginProfile(params: GetLoginProfileRequest): Request[GetLoginProfileResponse] = js.native
    def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest, callback: Callback[GetOpenIDConnectProviderResponse]): Unit = js.native
    def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest): Request[GetOpenIDConnectProviderResponse] = js.native
    def getPolicy(params: GetPolicyRequest, callback: Callback[GetPolicyResponse]): Unit = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest, callback: Callback[GetPolicyVersionResponse]): Unit = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse] = js.native
    def getRole(params: GetRoleRequest, callback: Callback[GetRoleResponse]): Unit = js.native
    def getRole(params: GetRoleRequest): Request[GetRoleResponse] = js.native
    def getRolePolicy(params: GetRolePolicyRequest, callback: Callback[GetRolePolicyResponse]): Unit = js.native
    def getRolePolicy(params: GetRolePolicyRequest): Request[GetRolePolicyResponse] = js.native
    def getSAMLProvider(params: GetSAMLProviderRequest, callback: Callback[GetSAMLProviderResponse]): Unit = js.native
    def getSAMLProvider(params: GetSAMLProviderRequest): Request[GetSAMLProviderResponse] = js.native
    def getSSHPublicKey(params: GetSSHPublicKeyRequest, callback: Callback[GetSSHPublicKeyResponse]): Unit = js.native
    def getSSHPublicKey(params: GetSSHPublicKeyRequest): Request[GetSSHPublicKeyResponse] = js.native
    def getServerCertificate(params: GetServerCertificateRequest, callback: Callback[GetServerCertificateResponse]): Unit = js.native
    def getServerCertificate(params: GetServerCertificateRequest): Request[GetServerCertificateResponse] = js.native
    def getUser(params: GetUserRequest, callback: Callback[GetUserResponse]): Unit = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse] = js.native
    def getUserPolicy(params: GetUserPolicyRequest, callback: Callback[GetUserPolicyResponse]): Unit = js.native
    def getUserPolicy(params: GetUserPolicyRequest): Request[GetUserPolicyResponse] = js.native
    def listAccessKeys(params: ListAccessKeysRequest, callback: Callback[ListAccessKeysResponse]): Unit = js.native
    def listAccessKeys(params: ListAccessKeysRequest): Request[ListAccessKeysResponse] = js.native
    def listAccountAliases(params: ListAccountAliasesRequest, callback: Callback[ListAccountAliasesResponse]): Unit = js.native
    def listAccountAliases(params: ListAccountAliasesRequest): Request[ListAccountAliasesResponse] = js.native
    def listAttachedGroupPolicies(params: ListAttachedGroupPoliciesRequest, callback: Callback[ListAttachedGroupPoliciesResponse]): Unit = js.native
    def listAttachedGroupPolicies(params: ListAttachedGroupPoliciesRequest): Request[ListAttachedGroupPoliciesResponse] = js.native
    def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest, callback: Callback[ListAttachedRolePoliciesResponse]): Unit = js.native
    def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest): Request[ListAttachedRolePoliciesResponse] = js.native
    def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest, callback: Callback[ListAttachedUserPoliciesResponse]): Unit = js.native
    def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest): Request[ListAttachedUserPoliciesResponse] = js.native
    def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest, callback: Callback[ListEntitiesForPolicyResponse]): Unit = js.native
    def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest): Request[ListEntitiesForPolicyResponse] = js.native
    def listGroupPolicies(params: ListGroupPoliciesRequest, callback: Callback[ListGroupPoliciesResponse]): Unit = js.native
    def listGroupPolicies(params: ListGroupPoliciesRequest): Request[ListGroupPoliciesResponse] = js.native
    def listGroups(params: ListGroupsRequest, callback: Callback[ListGroupsResponse]): Unit = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listGroupsForUser(params: ListGroupsForUserRequest, callback: Callback[ListGroupsForUserResponse]): Unit = js.native
    def listGroupsForUser(params: ListGroupsForUserRequest): Request[ListGroupsForUserResponse] = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest, callback: Callback[ListInstanceProfilesResponse]): Unit = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResponse] = js.native
    def listInstanceProfilesForRole(params: ListInstanceProfilesForRoleRequest, callback: Callback[ListInstanceProfilesForRoleResponse]): Unit = js.native
    def listInstanceProfilesForRole(params: ListInstanceProfilesForRoleRequest): Request[ListInstanceProfilesForRoleResponse] = js.native
    def listMFADevices(params: ListMFADevicesRequest, callback: Callback[ListMFADevicesResponse]): Unit = js.native
    def listMFADevices(params: ListMFADevicesRequest): Request[ListMFADevicesResponse] = js.native
    def listOpenIDConnectProviders(params: ListOpenIDConnectProvidersRequest, callback: Callback[ListOpenIDConnectProvidersResponse]): Unit = js.native
    def listOpenIDConnectProviders(params: ListOpenIDConnectProvidersRequest): Request[ListOpenIDConnectProvidersResponse] = js.native
    def listPolicies(params: ListPoliciesRequest, callback: Callback[ListPoliciesResponse]): Unit = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest, callback: Callback[ListPolicyVersionsResponse]): Unit = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse] = js.native
    def listRolePolicies(params: ListRolePoliciesRequest, callback: Callback[ListRolePoliciesResponse]): Unit = js.native
    def listRolePolicies(params: ListRolePoliciesRequest): Request[ListRolePoliciesResponse] = js.native
    def listRoles(params: ListRolesRequest, callback: Callback[ListRolesResponse]): Unit = js.native
    def listRoles(params: ListRolesRequest): Request[ListRolesResponse] = js.native
    def listSAMLProviders(params: ListSAMLProvidersRequest, callback: Callback[ListSAMLProvidersResponse]): Unit = js.native
    def listSAMLProviders(params: ListSAMLProvidersRequest): Request[ListSAMLProvidersResponse] = js.native
    def listSSHPublicKeys(params: ListSSHPublicKeysRequest, callback: Callback[ListSSHPublicKeysResponse]): Unit = js.native
    def listSSHPublicKeys(params: ListSSHPublicKeysRequest): Request[ListSSHPublicKeysResponse] = js.native
    def listServerCertificates(params: ListServerCertificatesRequest, callback: Callback[ListServerCertificatesResponse]): Unit = js.native
    def listServerCertificates(params: ListServerCertificatesRequest): Request[ListServerCertificatesResponse] = js.native
    def listServiceSpecificCredentials(params: ListServiceSpecificCredentialsRequest, callback: Callback[ListServiceSpecificCredentialsResponse]): Unit = js.native
    def listServiceSpecificCredentials(params: ListServiceSpecificCredentialsRequest): Request[ListServiceSpecificCredentialsResponse] = js.native
    def listSigningCertificates(params: ListSigningCertificatesRequest, callback: Callback[ListSigningCertificatesResponse]): Unit = js.native
    def listSigningCertificates(params: ListSigningCertificatesRequest): Request[ListSigningCertificatesResponse] = js.native
    def listUserPolicies(params: ListUserPoliciesRequest, callback: Callback[ListUserPoliciesResponse]): Unit = js.native
    def listUserPolicies(params: ListUserPoliciesRequest): Request[ListUserPoliciesResponse] = js.native
    def listUsers(params: ListUsersRequest, callback: Callback[ListUsersResponse]): Unit = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listVirtualMFADevices(params: ListVirtualMFADevicesRequest, callback: Callback[ListVirtualMFADevicesResponse]): Unit = js.native
    def listVirtualMFADevices(params: ListVirtualMFADevicesRequest): Request[ListVirtualMFADevicesResponse] = js.native
    def putGroupPolicy(params: PutGroupPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putGroupPolicy(params: PutGroupPolicyRequest): Request[js.Object] = js.native
    def putRolePolicy(params: PutRolePolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putRolePolicy(params: PutRolePolicyRequest): Request[js.Object] = js.native
    def putUserPolicy(params: PutUserPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putUserPolicy(params: PutUserPolicyRequest): Request[js.Object] = js.native
    def removeClientIDFromOpenIDConnectProvider(params: RemoveClientIDFromOpenIDConnectProviderRequest, callback: Callback[js.Object]): Unit = js.native
    def removeClientIDFromOpenIDConnectProvider(params: RemoveClientIDFromOpenIDConnectProviderRequest): Request[js.Object] = js.native
    def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest): Request[js.Object] = js.native
    def removeUserFromGroup(params: RemoveUserFromGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def removeUserFromGroup(params: RemoveUserFromGroupRequest): Request[js.Object] = js.native
    def resetServiceSpecificCredential(params: ResetServiceSpecificCredentialRequest, callback: Callback[ResetServiceSpecificCredentialResponse]): Unit = js.native
    def resetServiceSpecificCredential(params: ResetServiceSpecificCredentialRequest): Request[ResetServiceSpecificCredentialResponse] = js.native
    def resyncMFADevice(params: ResyncMFADeviceRequest, callback: Callback[js.Object]): Unit = js.native
    def resyncMFADevice(params: ResyncMFADeviceRequest): Request[js.Object] = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest, callback: Callback[js.Object]): Unit = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object] = js.native
    def simulateCustomPolicy(params: SimulateCustomPolicyRequest, callback: Callback[SimulatePolicyResponse]): Unit = js.native
    def simulateCustomPolicy(params: SimulateCustomPolicyRequest): Request[SimulatePolicyResponse] = js.native
    def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest, callback: Callback[SimulatePolicyResponse]): Unit = js.native
    def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest): Request[SimulatePolicyResponse] = js.native
    def updateAccessKey(params: UpdateAccessKeyRequest, callback: Callback[js.Object]): Unit = js.native
    def updateAccessKey(params: UpdateAccessKeyRequest): Request[js.Object] = js.native
    def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest): Request[js.Object] = js.native
    def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest): Request[js.Object] = js.native
    def updateGroup(params: UpdateGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def updateGroup(params: UpdateGroupRequest): Request[js.Object] = js.native
    def updateLoginProfile(params: UpdateLoginProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def updateLoginProfile(params: UpdateLoginProfileRequest): Request[js.Object] = js.native
    def updateOpenIDConnectProviderThumbprint(params: UpdateOpenIDConnectProviderThumbprintRequest, callback: Callback[js.Object]): Unit = js.native
    def updateOpenIDConnectProviderThumbprint(params: UpdateOpenIDConnectProviderThumbprintRequest): Request[js.Object] = js.native
    def updateSAMLProvider(params: UpdateSAMLProviderRequest, callback: Callback[UpdateSAMLProviderResponse]): Unit = js.native
    def updateSAMLProvider(params: UpdateSAMLProviderRequest): Request[UpdateSAMLProviderResponse] = js.native
    def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest, callback: Callback[js.Object]): Unit = js.native
    def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest): Request[js.Object] = js.native
    def updateServerCertificate(params: UpdateServerCertificateRequest, callback: Callback[js.Object]): Unit = js.native
    def updateServerCertificate(params: UpdateServerCertificateRequest): Request[js.Object] = js.native
    def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest, callback: Callback[js.Object]): Unit = js.native
    def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def updateSigningCertificate(params: UpdateSigningCertificateRequest, callback: Callback[js.Object]): Unit = js.native
    def updateSigningCertificate(params: UpdateSigningCertificateRequest): Request[js.Object] = js.native
    def updateUser(params: UpdateUserRequest, callback: Callback[js.Object]): Unit = js.native
    def updateUser(params: UpdateUserRequest): Request[js.Object] = js.native
    def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest, callback: Callback[UploadSSHPublicKeyResponse]): Unit = js.native
    def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest): Request[UploadSSHPublicKeyResponse] = js.native
    def uploadServerCertificate(params: UploadServerCertificateRequest, callback: Callback[UploadServerCertificateResponse]): Unit = js.native
    def uploadServerCertificate(params: UploadServerCertificateRequest): Request[UploadServerCertificateResponse] = js.native
    def uploadSigningCertificate(params: UploadSigningCertificateRequest, callback: Callback[UploadSigningCertificateResponse]): Unit = js.native
    def uploadSigningCertificate(params: UploadSigningCertificateRequest): Request[UploadSigningCertificateResponse] = js.native
  }

  /**
   * <p>Contains information about an AWS access key.</p> <p> This data type is used as a response element in the <a>CreateAccessKey</a> and <a>ListAccessKeys</a> actions. </p> <note> <p>The <code>SecretAccessKey</code> value is returned only in response to <a>CreateAccessKey</a>. You can get a secret access key only when you first create an access key; you cannot recover the secret access key later. If you lose a secret access key, you must create a new access key.</p> </note>
   */
  @js.native
  trait AccessKey extends js.Object {
    var SecretAccessKey: accessKeySecretType
    var UserName: userNameType
    var AccessKeyId: accessKeyIdType
    var CreateDate: dateType
    var Status: statusType
  }

  object AccessKey {
    def apply(
      SecretAccessKey: js.UndefOr[accessKeySecretType] = js.undefined,
      UserName: js.UndefOr[userNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): AccessKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SecretAccessKey" -> SecretAccessKey.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKey]
    }
  }

  /**
   * <p>Contains information about the last time an AWS access key was used.</p> <p>This data type is used as a response element in the <a>GetAccessKeyLastUsed</a> action.</p>
   */
  @js.native
  trait AccessKeyLastUsed extends js.Object {
    var LastUsedDate: dateType
    var ServiceName: stringType
    var Region: stringType
  }

  object AccessKeyLastUsed {
    def apply(
      LastUsedDate: js.UndefOr[dateType] = js.undefined,
      ServiceName: js.UndefOr[stringType] = js.undefined,
      Region: js.UndefOr[stringType] = js.undefined
    ): AccessKeyLastUsed = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastUsedDate" -> LastUsedDate.map { x => x: js.Any }),
        ("ServiceName" -> ServiceName.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKeyLastUsed]
    }
  }

  /**
   * <p>Contains information about an AWS access key, without its secret key.</p> <p>This data type is used as a response element in the <a>ListAccessKeys</a> action.</p>
   */
  @js.native
  trait AccessKeyMetadata extends js.Object {
    var UserName: userNameType
    var AccessKeyId: accessKeyIdType
    var Status: statusType
    var CreateDate: dateType
  }

  object AccessKeyMetadata {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined
    ): AccessKeyMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKeyMetadata]
    }
  }

  @js.native
  trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
    var ClientID: clientIDType
  }

  object AddClientIDToOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined,
      ClientID: js.UndefOr[clientIDType] = js.undefined
    ): AddClientIDToOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x: js.Any }),
        ("ClientID" -> ClientID.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddClientIDToOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait AddRoleToInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var RoleName: roleNameType
  }

  object AddRoleToInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined
    ): AddRoleToInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfileName" -> InstanceProfileName.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddRoleToInstanceProfileRequest]
    }
  }

  @js.native
  trait AddUserToGroupRequest extends js.Object {
    var GroupName: groupNameType
    var UserName: existingUserNameType
  }

  object AddUserToGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): AddUserToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddUserToGroupRequest]
    }
  }

  @js.native
  trait AttachGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyArn: arnType
  }

  object AttachGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): AttachGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachGroupPolicyRequest]
    }
  }

  @js.native
  trait AttachRolePolicyRequest extends js.Object {
    var RoleName: roleNameType
    var PolicyArn: arnType
  }

  object AttachRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): AttachRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachRolePolicyRequest]
    }
  }

  @js.native
  trait AttachUserPolicyRequest extends js.Object {
    var UserName: userNameType
    var PolicyArn: arnType
  }

  object AttachUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): AttachUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachUserPolicyRequest]
    }
  }

  /**
   * <p>Contains information about an attached policy.</p> <p>An attached policy is a managed policy that has been attached to a user, group, or role. This data type is used as a response element in the <a>ListAttachedGroupPolicies</a>, <a>ListAttachedRolePolicies</a>, <a>ListAttachedUserPolicies</a>, and <a>GetAccountAuthorizationDetails</a> actions. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait AttachedPolicy extends js.Object {
    var PolicyName: policyNameType
    var PolicyArn: arnType
  }

  object AttachedPolicy {
    def apply(
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): AttachedPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachedPolicy]
    }
  }

  @js.native
  trait ChangePasswordRequest extends js.Object {
    var OldPassword: passwordType
    var NewPassword: passwordType
  }

  object ChangePasswordRequest {
    def apply(
      OldPassword: js.UndefOr[passwordType] = js.undefined,
      NewPassword: js.UndefOr[passwordType] = js.undefined
    ): ChangePasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OldPassword" -> OldPassword.map { x => x: js.Any }),
        ("NewPassword" -> NewPassword.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangePasswordRequest]
    }
  }

  /**
   * <p>Contains information about a condition context key. It includes the name of the key and specifies the value (or values, if the context key supports multiple values) to use in the simulation. This information is used when evaluating the <code>Condition</code> elements of the input policies.</p> <p>This data type is used as an input parameter to <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulateCustomPolicy</a> </code>.</p>
   */
  @js.native
  trait ContextEntry extends js.Object {
    var ContextKeyName: ContextKeyNameType
    var ContextKeyValues: ContextKeyValueListType
    var ContextKeyType: ContextKeyTypeEnum
  }

  object ContextEntry {
    def apply(
      ContextKeyName: js.UndefOr[ContextKeyNameType] = js.undefined,
      ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.undefined,
      ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.undefined
    ): ContextEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ContextKeyName" -> ContextKeyName.map { x => x: js.Any }),
        ("ContextKeyValues" -> ContextKeyValues.map { x => x: js.Any }),
        ("ContextKeyType" -> ContextKeyType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContextEntry]
    }
  }


  object ContextKeyTypeEnumEnum {
    val string = "string"
    val stringList = "stringList"
    val numeric = "numeric"
    val numericList = "numericList"
    val boolean = "boolean"
    val booleanList = "booleanList"
    val ip = "ip"
    val ipList = "ipList"
    val binary = "binary"
    val binaryList = "binaryList"
    val date = "date"
    val dateList = "dateList"

    val values = IndexedSeq(string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList)
  }

  @js.native
  trait CreateAccessKeyRequest extends js.Object {
    var UserName: existingUserNameType
  }

  object CreateAccessKeyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): CreateAccessKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessKeyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateAccessKey</a> request. </p>
   */
  @js.native
  trait CreateAccessKeyResponse extends js.Object {
    var AccessKey: AccessKey
  }

  object CreateAccessKeyResponse {
    def apply(
      AccessKey: js.UndefOr[AccessKey] = js.undefined
    ): CreateAccessKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessKey" -> AccessKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessKeyResponse]
    }
  }

  @js.native
  trait CreateAccountAliasRequest extends js.Object {
    var AccountAlias: accountAliasType
  }

  object CreateAccountAliasRequest {
    def apply(
      AccountAlias: js.UndefOr[accountAliasType] = js.undefined
    ): CreateAccountAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountAlias" -> AccountAlias.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountAliasRequest]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var Path: pathType
    var GroupName: groupNameType
  }

  object CreateGroupRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      GroupName: js.UndefOr[groupNameType] = js.undefined
    ): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateGroup</a> request. </p>
   */
  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: Group
  }

  object CreateGroupResponse {
    def apply(
      Group: js.UndefOr[Group] = js.undefined
    ): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Group" -> Group.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var Path: pathType
  }

  object CreateInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined
    ): CreateInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfileName" -> InstanceProfileName.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateInstanceProfile</a> request. </p>
   */
  @js.native
  trait CreateInstanceProfileResponse extends js.Object {
    var InstanceProfile: InstanceProfile
  }

  object CreateInstanceProfileResponse {
    def apply(
      InstanceProfile: js.UndefOr[InstanceProfile] = js.undefined
    ): CreateInstanceProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfile" -> InstanceProfile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceProfileResponse]
    }
  }

  @js.native
  trait CreateLoginProfileRequest extends js.Object {
    var UserName: userNameType
    var Password: passwordType
    var PasswordResetRequired: booleanType
  }

  object CreateLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Password: js.UndefOr[passwordType] = js.undefined,
      PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
    ): CreateLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Password" -> Password.map { x => x: js.Any }),
        ("PasswordResetRequired" -> PasswordResetRequired.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoginProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateLoginProfile</a> request. </p>
   */
  @js.native
  trait CreateLoginProfileResponse extends js.Object {
    var LoginProfile: LoginProfile
  }

  object CreateLoginProfileResponse {
    def apply(
      LoginProfile: js.UndefOr[LoginProfile] = js.undefined
    ): CreateLoginProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoginProfile" -> LoginProfile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoginProfileResponse]
    }
  }

  @js.native
  trait CreateOpenIDConnectProviderRequest extends js.Object {
    var Url: OpenIDConnectProviderUrlType
    var ClientIDList: clientIDListType
    var ThumbprintList: thumbprintListType
  }

  object CreateOpenIDConnectProviderRequest {
    def apply(
      Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined,
      ClientIDList: js.UndefOr[clientIDListType] = js.undefined,
      ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined
    ): CreateOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Url" -> Url.map { x => x: js.Any }),
        ("ClientIDList" -> ClientIDList.map { x => x: js.Any }),
        ("ThumbprintList" -> ThumbprintList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOpenIDConnectProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateOpenIDConnectProvider</a> request. </p>
   */
  @js.native
  trait CreateOpenIDConnectProviderResponse extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  object CreateOpenIDConnectProviderResponse {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
    ): CreateOpenIDConnectProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOpenIDConnectProviderResponse]
    }
  }

  @js.native
  trait CreatePolicyRequest extends js.Object {
    var PolicyName: policyNameType
    var Path: policyPathType
    var PolicyDocument: policyDocumentType
    var Description: policyDescriptionType
  }

  object CreatePolicyRequest {
    def apply(
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      Path: js.UndefOr[policyPathType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      Description: js.UndefOr[policyDescriptionType] = js.undefined
    ): CreatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreatePolicy</a> request. </p>
   */
  @js.native
  trait CreatePolicyResponse extends js.Object {
    var Policy: Policy
  }

  object CreatePolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined
    ): CreatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyResponse]
    }
  }

  @js.native
  trait CreatePolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var PolicyDocument: policyDocumentType
    var SetAsDefault: booleanType
  }

  object CreatePolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      SetAsDefault: js.UndefOr[booleanType] = js.undefined
    ): CreatePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any }),
        ("SetAsDefault" -> SetAsDefault.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreatePolicyVersion</a> request. </p>
   */
  @js.native
  trait CreatePolicyVersionResponse extends js.Object {
    var PolicyVersion: PolicyVersion
  }

  object CreatePolicyVersionResponse {
    def apply(
      PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
    ): CreatePolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyVersion" -> PolicyVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionResponse]
    }
  }

  @js.native
  trait CreateRoleRequest extends js.Object {
    var Path: pathType
    var RoleName: roleNameType
    var AssumeRolePolicyDocument: policyDocumentType
  }

  object CreateRoleRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): CreateRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateRole</a> request. </p>
   */
  @js.native
  trait CreateRoleResponse extends js.Object {
    var Role: Role
  }

  object CreateRoleResponse {
    def apply(
      Role: js.UndefOr[Role] = js.undefined
    ): CreateRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleResponse]
    }
  }

  @js.native
  trait CreateSAMLProviderRequest extends js.Object {
    var SAMLMetadataDocument: SAMLMetadataDocumentType
    var Name: SAMLProviderNameType
  }

  object CreateSAMLProviderRequest {
    def apply(
      SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
      Name: js.UndefOr[SAMLProviderNameType] = js.undefined
    ): CreateSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLMetadataDocument" -> SAMLMetadataDocument.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSAMLProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateSAMLProvider</a> request. </p>
   */
  @js.native
  trait CreateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: arnType
  }

  object CreateSAMLProviderResponse {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): CreateSAMLProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLProviderArn" -> SAMLProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSAMLProviderResponse]
    }
  }

  @js.native
  trait CreateServiceSpecificCredentialRequest extends js.Object {
    var UserName: userNameType
    var ServiceName: serviceName
  }

  object CreateServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined
    ): CreateServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceName" -> ServiceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait CreateServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: ServiceSpecificCredential
  }

  object CreateServiceSpecificCredentialResponse {
    def apply(
      ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
    ): CreateServiceSpecificCredentialResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceSpecificCredential" -> ServiceSpecificCredential.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceSpecificCredentialResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var Path: pathType
    var UserName: userNameType
  }

  object CreateUserRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      UserName: js.UndefOr[userNameType] = js.undefined
    ): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateUser</a> request. </p>
   */
  @js.native
  trait CreateUserResponse extends js.Object {
    var User: User
  }

  object CreateUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined
    ): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("User" -> User.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait CreateVirtualMFADeviceRequest extends js.Object {
    var Path: pathType
    var VirtualMFADeviceName: virtualMFADeviceName
  }

  object CreateVirtualMFADeviceRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      VirtualMFADeviceName: js.UndefOr[virtualMFADeviceName] = js.undefined
    ): CreateVirtualMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("VirtualMFADeviceName" -> VirtualMFADeviceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualMFADeviceRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateVirtualMFADevice</a> request. </p>
   */
  @js.native
  trait CreateVirtualMFADeviceResponse extends js.Object {
    var VirtualMFADevice: VirtualMFADevice
  }

  object CreateVirtualMFADeviceResponse {
    def apply(
      VirtualMFADevice: js.UndefOr[VirtualMFADevice] = js.undefined
    ): CreateVirtualMFADeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VirtualMFADevice" -> VirtualMFADevice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualMFADeviceResponse]
    }
  }

  /**
   * <p>The request was rejected because the most recent credential report has expired. To generate a new credential report, use <a>GenerateCredentialReport</a>. For more information about credential report expiration, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in the <i>IAM User Guide</i>.</p>
   */
  @js.native
  trait CredentialReportExpiredExceptionException extends js.Object {
    var message: credentialReportExpiredExceptionMessage
  }

  /**
   * <p>The request was rejected because the credential report does not exist. To generate a credential report, use <a>GenerateCredentialReport</a>.</p>
   */
  @js.native
  trait CredentialReportNotPresentExceptionException extends js.Object {
    var message: credentialReportNotPresentExceptionMessage
  }

  /**
   * <p>The request was rejected because the credential report is still being generated.</p>
   */
  @js.native
  trait CredentialReportNotReadyExceptionException extends js.Object {
    var message: credentialReportNotReadyExceptionMessage
  }

  @js.native
  trait DeactivateMFADeviceRequest extends js.Object {
    var UserName: existingUserNameType
    var SerialNumber: serialNumberType
  }

  object DeactivateMFADeviceRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined
    ): DeactivateMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeactivateMFADeviceRequest]
    }
  }

  @js.native
  trait DeleteAccessKeyRequest extends js.Object {
    var UserName: existingUserNameType
    var AccessKeyId: accessKeyIdType
  }

  object DeleteAccessKeyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined
    ): DeleteAccessKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccessKeyRequest]
    }
  }

  @js.native
  trait DeleteAccountAliasRequest extends js.Object {
    var AccountAlias: accountAliasType
  }

  object DeleteAccountAliasRequest {
    def apply(
      AccountAlias: js.UndefOr[accountAliasType] = js.undefined
    ): DeleteAccountAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountAlias" -> AccountAlias.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountAliasRequest]
    }
  }

  /**
   * <p>The request was rejected because it attempted to delete a resource that has attached subordinate entities. The error message describes these entities.</p>
   */
  @js.native
  trait DeleteConflictExceptionException extends js.Object {
    var message: deleteConflictMessage
  }

  @js.native
  trait DeleteGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
  }

  object DeleteGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): DeleteGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupPolicyRequest]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupName: groupNameType
  }

  object DeleteGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined
    ): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
  }

  object DeleteInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined
    ): DeleteInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfileName" -> InstanceProfileName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceProfileRequest]
    }
  }

  @js.native
  trait DeleteLoginProfileRequest extends js.Object {
    var UserName: userNameType
  }

  object DeleteLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined
    ): DeleteLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoginProfileRequest]
    }
  }

  @js.native
  trait DeleteOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  object DeleteOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
    ): DeleteOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyArn: arnType
  }

  object DeletePolicyRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DeletePolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  object DeletePolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined
    ): DeletePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  @js.native
  trait DeleteRolePolicyRequest extends js.Object {
    var RoleName: roleNameType
    var PolicyName: policyNameType
  }

  object DeleteRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): DeleteRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRolePolicyRequest]
    }
  }

  @js.native
  trait DeleteRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  object DeleteRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined
    ): DeleteRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoleRequest]
    }
  }

  @js.native
  trait DeleteSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: arnType
  }

  object DeleteSAMLProviderRequest {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): DeleteSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLProviderArn" -> SAMLProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSAMLProviderRequest]
    }
  }

  @js.native
  trait DeleteSSHPublicKeyRequest extends js.Object {
    var UserName: userNameType
    var SSHPublicKeyId: publicKeyIdType
  }

  object DeleteSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined
    ): DeleteSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SSHPublicKeyId" -> SSHPublicKeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSSHPublicKeyRequest]
    }
  }

  @js.native
  trait DeleteServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
  }

  object DeleteServerCertificateRequest {
    def apply(
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined
    ): DeleteServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificateName" -> ServerCertificateName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerCertificateRequest]
    }
  }

  @js.native
  trait DeleteServiceSpecificCredentialRequest extends js.Object {
    var UserName: userNameType
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
  }

  object DeleteServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined
    ): DeleteServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait DeleteSigningCertificateRequest extends js.Object {
    var UserName: existingUserNameType
    var CertificateId: certificateIdType
  }

  object DeleteSigningCertificateRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      CertificateId: js.UndefOr[certificateIdType] = js.undefined
    ): DeleteSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("CertificateId" -> CertificateId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSigningCertificateRequest]
    }
  }

  @js.native
  trait DeleteUserPolicyRequest extends js.Object {
    var UserName: existingUserNameType
    var PolicyName: policyNameType
  }

  object DeleteUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): DeleteUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPolicyRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserName: existingUserNameType
  }

  object DeleteUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteVirtualMFADeviceRequest extends js.Object {
    var SerialNumber: serialNumberType
  }

  object DeleteVirtualMFADeviceRequest {
    def apply(
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined
    ): DeleteVirtualMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualMFADeviceRequest]
    }
  }

  @js.native
  trait DetachGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyArn: arnType
  }

  object DetachGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): DetachGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachGroupPolicyRequest]
    }
  }

  @js.native
  trait DetachRolePolicyRequest extends js.Object {
    var RoleName: roleNameType
    var PolicyArn: arnType
  }

  object DetachRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): DetachRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachRolePolicyRequest]
    }
  }

  @js.native
  trait DetachUserPolicyRequest extends js.Object {
    var UserName: userNameType
    var PolicyArn: arnType
  }

  object DetachUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): DetachUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachUserPolicyRequest]
    }
  }

  /**
   * <p>The request was rejected because the same certificate is associated with an IAM user in the account.</p>
   */
  @js.native
  trait DuplicateCertificateExceptionException extends js.Object {
    var message: duplicateCertificateMessage
  }

  /**
   * <p>The request was rejected because the SSH public key is already associated with the specified IAM user.</p>
   */
  @js.native
  trait DuplicateSSHPublicKeyExceptionException extends js.Object {
    var message: duplicateSSHPublicKeyMessage
  }

  @js.native
  trait EnableMFADeviceRequest extends js.Object {
    var UserName: existingUserNameType
    var SerialNumber: serialNumberType
    var AuthenticationCode1: authenticationCodeType
    var AuthenticationCode2: authenticationCodeType
  }

  object EnableMFADeviceRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      AuthenticationCode1: js.UndefOr[authenticationCodeType] = js.undefined,
      AuthenticationCode2: js.UndefOr[authenticationCodeType] = js.undefined
    ): EnableMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any }),
        ("AuthenticationCode1" -> AuthenticationCode1.map { x => x: js.Any }),
        ("AuthenticationCode2" -> AuthenticationCode2.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableMFADeviceRequest]
    }
  }

  /**
   * <p>The request was rejected because it attempted to create a resource that already exists.</p>
   */
  @js.native
  trait EntityAlreadyExistsExceptionException extends js.Object {
    var message: entityAlreadyExistsMessage
  }

  /**
   * <p>The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user name that was deleted and then recreated. The error indicates that the request is likely to succeed if you try again after waiting several minutes. The error message describes the entity.</p>
   */
  @js.native
  trait EntityTemporarilyUnmodifiableExceptionException extends js.Object {
    var message: entityTemporarilyUnmodifiableMessage
  }


  object EntityTypeEnum {
    val User = "User"
    val Role = "Role"
    val Group = "Group"
    val LocalManagedPolicy = "LocalManagedPolicy"
    val AWSManagedPolicy = "AWSManagedPolicy"

    val values = IndexedSeq(User, Role, Group, LocalManagedPolicy, AWSManagedPolicy)
  }

  /**
   * <p>Contains the results of a simulation.</p> <p>This data type is used by the return parameter of <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulatePrincipalPolicy</a> </code>.</p>
   */
  @js.native
  trait EvaluationResult extends js.Object {
    var EvalActionName: ActionNameType
    var MissingContextValues: ContextKeyNamesResultListType
    var EvalResourceName: ResourceNameType
    var EvalDecision: PolicyEvaluationDecisionType
    var ResourceSpecificResults: ResourceSpecificResultListType
    var EvalDecisionDetails: EvalDecisionDetailsType
    var MatchedStatements: StatementListType
  }

  object EvaluationResult {
    def apply(
      EvalActionName: js.UndefOr[ActionNameType] = js.undefined,
      MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined,
      EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined,
      EvalDecision: js.UndefOr[PolicyEvaluationDecisionType] = js.undefined,
      ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.undefined,
      EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined,
      MatchedStatements: js.UndefOr[StatementListType] = js.undefined
    ): EvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvalActionName" -> EvalActionName.map { x => x: js.Any }),
        ("MissingContextValues" -> MissingContextValues.map { x => x: js.Any }),
        ("EvalResourceName" -> EvalResourceName.map { x => x: js.Any }),
        ("EvalDecision" -> EvalDecision.map { x => x: js.Any }),
        ("ResourceSpecificResults" -> ResourceSpecificResults.map { x => x: js.Any }),
        ("EvalDecisionDetails" -> EvalDecisionDetails.map { x => x: js.Any }),
        ("MatchedStatements" -> MatchedStatements.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResult]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GenerateCredentialReport</a> request. </p>
   */
  @js.native
  trait GenerateCredentialReportResponse extends js.Object {
    var State: ReportStateType
    var Description: ReportStateDescriptionType
  }

  object GenerateCredentialReportResponse {
    def apply(
      State: js.UndefOr[ReportStateType] = js.undefined,
      Description: js.UndefOr[ReportStateDescriptionType] = js.undefined
    ): GenerateCredentialReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateCredentialReportResponse]
    }
  }

  @js.native
  trait GetAccessKeyLastUsedRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
  }

  object GetAccessKeyLastUsedRequest {
    def apply(
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined
    ): GetAccessKeyLastUsedRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccessKeyLastUsedRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccessKeyLastUsed</a> request. It is also returned as a member of the <a>AccessKeyMetaData</a> structure returned by the <a>ListAccessKeys</a> action.</p>
   */
  @js.native
  trait GetAccessKeyLastUsedResponse extends js.Object {
    var UserName: existingUserNameType
    var AccessKeyLastUsed: AccessKeyLastUsed
  }

  object GetAccessKeyLastUsedResponse {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed] = js.undefined
    ): GetAccessKeyLastUsedResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("AccessKeyLastUsed" -> AccessKeyLastUsed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccessKeyLastUsedResponse]
    }
  }

  @js.native
  trait GetAccountAuthorizationDetailsRequest extends js.Object {
    var Filter: entityListType
    var MaxItems: maxItemsType
    var Marker: markerType
  }

  object GetAccountAuthorizationDetailsRequest {
    def apply(
      Filter: js.UndefOr[entityListType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): GetAccountAuthorizationDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filter" -> Filter.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountAuthorizationDetailsRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccountAuthorizationDetails</a> request. </p>
   */
  @js.native
  trait GetAccountAuthorizationDetailsResponse extends js.Object {
    var IsTruncated: booleanType
    var UserDetailList: userDetailListType
    var Policies: ManagedPolicyDetailListType
    var RoleDetailList: roleDetailListType
    var GroupDetailList: groupDetailListType
    var Marker: markerType
  }

  object GetAccountAuthorizationDetailsResponse {
    def apply(
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      UserDetailList: js.UndefOr[userDetailListType] = js.undefined,
      Policies: js.UndefOr[ManagedPolicyDetailListType] = js.undefined,
      RoleDetailList: js.UndefOr[roleDetailListType] = js.undefined,
      GroupDetailList: js.UndefOr[groupDetailListType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): GetAccountAuthorizationDetailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("UserDetailList" -> UserDetailList.map { x => x: js.Any }),
        ("Policies" -> Policies.map { x => x: js.Any }),
        ("RoleDetailList" -> RoleDetailList.map { x => x: js.Any }),
        ("GroupDetailList" -> GroupDetailList.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountAuthorizationDetailsResponse]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccountPasswordPolicy</a> request. </p>
   */
  @js.native
  trait GetAccountPasswordPolicyResponse extends js.Object {
    var PasswordPolicy: PasswordPolicy
  }

  object GetAccountPasswordPolicyResponse {
    def apply(
      PasswordPolicy: js.UndefOr[PasswordPolicy] = js.undefined
    ): GetAccountPasswordPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PasswordPolicy" -> PasswordPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountPasswordPolicyResponse]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccountSummary</a> request. </p>
   */
  @js.native
  trait GetAccountSummaryResponse extends js.Object {
    var SummaryMap: summaryMapType
  }

  object GetAccountSummaryResponse {
    def apply(
      SummaryMap: js.UndefOr[summaryMapType] = js.undefined
    ): GetAccountSummaryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SummaryMap" -> SummaryMap.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSummaryResponse]
    }
  }

  @js.native
  trait GetContextKeysForCustomPolicyRequest extends js.Object {
    var PolicyInputList: SimulationPolicyListType
  }

  object GetContextKeysForCustomPolicyRequest {
    def apply(
      PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
    ): GetContextKeysForCustomPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyInputList" -> PolicyInputList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContextKeysForCustomPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a> or <a>GetContextKeysForCustomPolicy</a> request. </p>
   */
  @js.native
  trait GetContextKeysForPolicyResponse extends js.Object {
    var ContextKeyNames: ContextKeyNamesResultListType
  }

  object GetContextKeysForPolicyResponse {
    def apply(
      ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
    ): GetContextKeysForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ContextKeyNames" -> ContextKeyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContextKeysForPolicyResponse]
    }
  }

  @js.native
  trait GetContextKeysForPrincipalPolicyRequest extends js.Object {
    var PolicySourceArn: arnType
    var PolicyInputList: SimulationPolicyListType
  }

  object GetContextKeysForPrincipalPolicyRequest {
    def apply(
      PolicySourceArn: js.UndefOr[arnType] = js.undefined,
      PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
    ): GetContextKeysForPrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicySourceArn" -> PolicySourceArn.map { x => x: js.Any }),
        ("PolicyInputList" -> PolicyInputList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContextKeysForPrincipalPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetCredentialReport</a> request. </p>
   */
  @js.native
  trait GetCredentialReportResponse extends js.Object {
    var Content: ReportContentType
    var ReportFormat: ReportFormatType
    var GeneratedTime: dateType
  }

  object GetCredentialReportResponse {
    def apply(
      Content: js.UndefOr[ReportContentType] = js.undefined,
      ReportFormat: js.UndefOr[ReportFormatType] = js.undefined,
      GeneratedTime: js.UndefOr[dateType] = js.undefined
    ): GetCredentialReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Content" -> Content.map { x => x: js.Any }),
        ("ReportFormat" -> ReportFormat.map { x => x: js.Any }),
        ("GeneratedTime" -> GeneratedTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCredentialReportResponse]
    }
  }

  @js.native
  trait GetGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
  }

  object GetGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): GetGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetGroupPolicy</a> request. </p>
   */
  @js.native
  trait GetGroupPolicyResponse extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object GetGroupPolicyResponse {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): GetGroupPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupPolicyResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object GetGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): GetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetGroup</a> request. </p>
   */
  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: Group
    var Users: userListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object GetGroupResponse {
    def apply(
      Group: js.UndefOr[Group] = js.undefined,
      Users: js.UndefOr[userListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): GetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Group" -> Group.map { x => x: js.Any }),
        ("Users" -> Users.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
  }

  object GetInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined
    ): GetInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfileName" -> InstanceProfileName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetInstanceProfile</a> request. </p>
   */
  @js.native
  trait GetInstanceProfileResponse extends js.Object {
    var InstanceProfile: InstanceProfile
  }

  object GetInstanceProfileResponse {
    def apply(
      InstanceProfile: js.UndefOr[InstanceProfile] = js.undefined
    ): GetInstanceProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfile" -> InstanceProfile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceProfileResponse]
    }
  }

  @js.native
  trait GetLoginProfileRequest extends js.Object {
    var UserName: userNameType
  }

  object GetLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined
    ): GetLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoginProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetLoginProfile</a> request. </p>
   */
  @js.native
  trait GetLoginProfileResponse extends js.Object {
    var LoginProfile: LoginProfile
  }

  object GetLoginProfileResponse {
    def apply(
      LoginProfile: js.UndefOr[LoginProfile] = js.undefined
    ): GetLoginProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoginProfile" -> LoginProfile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoginProfileResponse]
    }
  }

  @js.native
  trait GetOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
  }

  object GetOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
    ): GetOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIDConnectProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetOpenIDConnectProvider</a> request. </p>
   */
  @js.native
  trait GetOpenIDConnectProviderResponse extends js.Object {
    var Url: OpenIDConnectProviderUrlType
    var ClientIDList: clientIDListType
    var ThumbprintList: thumbprintListType
    var CreateDate: dateType
  }

  object GetOpenIDConnectProviderResponse {
    def apply(
      Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined,
      ClientIDList: js.UndefOr[clientIDListType] = js.undefined,
      ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined
    ): GetOpenIDConnectProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Url" -> Url.map { x => x: js.Any }),
        ("ClientIDList" -> ClientIDList.map { x => x: js.Any }),
        ("ThumbprintList" -> ThumbprintList.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIDConnectProviderResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var PolicyArn: arnType
  }

  object GetPolicyRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined
    ): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetPolicy</a> request. </p>
   */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: Policy
  }

  object GetPolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined
    ): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait GetPolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  object GetPolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined
    ): GetPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetPolicyVersion</a> request. </p>
   */
  @js.native
  trait GetPolicyVersionResponse extends js.Object {
    var PolicyVersion: PolicyVersion
  }

  object GetPolicyVersionResponse {
    def apply(
      PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
    ): GetPolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyVersion" -> PolicyVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionResponse]
    }
  }

  @js.native
  trait GetRolePolicyRequest extends js.Object {
    var RoleName: roleNameType
    var PolicyName: policyNameType
  }

  object GetRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): GetRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRolePolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetRolePolicy</a> request. </p>
   */
  @js.native
  trait GetRolePolicyResponse extends js.Object {
    var RoleName: roleNameType
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object GetRolePolicyResponse {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): GetRolePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRolePolicyResponse]
    }
  }

  @js.native
  trait GetRoleRequest extends js.Object {
    var RoleName: roleNameType
  }

  object GetRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined
    ): GetRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetRole</a> request. </p>
   */
  @js.native
  trait GetRoleResponse extends js.Object {
    var Role: Role
  }

  object GetRoleResponse {
    def apply(
      Role: js.UndefOr[Role] = js.undefined
    ): GetRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoleResponse]
    }
  }

  @js.native
  trait GetSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: arnType
  }

  object GetSAMLProviderRequest {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): GetSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLProviderArn" -> SAMLProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSAMLProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetSAMLProvider</a> request. </p>
   */
  @js.native
  trait GetSAMLProviderResponse extends js.Object {
    var SAMLMetadataDocument: SAMLMetadataDocumentType
    var CreateDate: dateType
    var ValidUntil: dateType
  }

  object GetSAMLProviderResponse {
    def apply(
      SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      ValidUntil: js.UndefOr[dateType] = js.undefined
    ): GetSAMLProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLMetadataDocument" -> SAMLMetadataDocument.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("ValidUntil" -> ValidUntil.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSAMLProviderResponse]
    }
  }

  @js.native
  trait GetSSHPublicKeyRequest extends js.Object {
    var UserName: userNameType
    var SSHPublicKeyId: publicKeyIdType
    var Encoding: encodingType
  }

  object GetSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Encoding: js.UndefOr[encodingType] = js.undefined
    ): GetSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SSHPublicKeyId" -> SSHPublicKeyId.map { x => x: js.Any }),
        ("Encoding" -> Encoding.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSSHPublicKeyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetSSHPublicKey</a> request.</p>
   */
  @js.native
  trait GetSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: SSHPublicKey
  }

  object GetSSHPublicKeyResponse {
    def apply(
      SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
    ): GetSSHPublicKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SSHPublicKey" -> SSHPublicKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSSHPublicKeyResponse]
    }
  }

  @js.native
  trait GetServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
  }

  object GetServerCertificateRequest {
    def apply(
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined
    ): GetServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificateName" -> ServerCertificateName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServerCertificateRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetServerCertificate</a> request. </p>
   */
  @js.native
  trait GetServerCertificateResponse extends js.Object {
    var ServerCertificate: ServerCertificate
  }

  object GetServerCertificateResponse {
    def apply(
      ServerCertificate: js.UndefOr[ServerCertificate] = js.undefined
    ): GetServerCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificate" -> ServerCertificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServerCertificateResponse]
    }
  }

  @js.native
  trait GetUserPolicyRequest extends js.Object {
    var UserName: existingUserNameType
    var PolicyName: policyNameType
  }

  object GetUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined
    ): GetUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetUserPolicy</a> request. </p>
   */
  @js.native
  trait GetUserPolicyResponse extends js.Object {
    var UserName: existingUserNameType
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object GetUserPolicyResponse {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): GetUserPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPolicyResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var UserName: existingUserNameType
  }

  object GetUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): GetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetUser</a> request. </p>
   */
  @js.native
  trait GetUserResponse extends js.Object {
    var User: User
  }

  object GetUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined
    ): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("User" -> User.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  /**
   * <p>Contains information about an IAM group entity.</p> <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateGroup</a> </p> </li> <li> <p> <a>GetGroup</a> </p> </li> <li> <p> <a>ListGroups</a> </p> </li> </ul>
   */
  @js.native
  trait Group extends js.Object {
    var Path: pathType
    var GroupName: groupNameType
    var GroupId: idType
    var Arn: arnType
    var CreateDate: dateType
  }

  object Group {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      GroupId: js.UndefOr[idType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined
    ): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
   * <p>Contains information about an IAM group, including all of the group's policies.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.</p>
   */
  @js.native
  trait GroupDetail extends js.Object {
    var AttachedManagedPolicies: attachedPoliciesListType
    var Path: pathType
    var GroupName: groupNameType
    var GroupId: idType
    var Arn: arnType
    var CreateDate: dateType
    var GroupPolicyList: policyDetailListType
  }

  object GroupDetail {
    def apply(
      AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      GroupId: js.UndefOr[idType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      GroupPolicyList: js.UndefOr[policyDetailListType] = js.undefined
    ): GroupDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachedManagedPolicies" -> AttachedManagedPolicies.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("GroupPolicyList" -> GroupPolicyList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupDetail]
    }
  }

  /**
   * <p>Contains information about an instance profile.</p> <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateInstanceProfile</a> </p> </li> <li> <p> <a>GetInstanceProfile</a> </p> </li> <li> <p> <a>ListInstanceProfiles</a> </p> </li> <li> <p> <a>ListInstanceProfilesForRole</a> </p> </li> </ul>
   */
  @js.native
  trait InstanceProfile extends js.Object {
    var Path: pathType
    var InstanceProfileName: instanceProfileNameType
    var Arn: arnType
    var CreateDate: dateType
    var InstanceProfileId: idType
    var Roles: roleListType
  }

  object InstanceProfile {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      InstanceProfileId: js.UndefOr[idType] = js.undefined,
      Roles: js.UndefOr[roleListType] = js.undefined
    ): InstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("InstanceProfileName" -> InstanceProfileName.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("InstanceProfileId" -> InstanceProfileId.map { x => x: js.Any }),
        ("Roles" -> Roles.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceProfile]
    }
  }

  /**
   * <p>The request was rejected because the authentication code was not recognized. The error message describes the specific error.</p>
   */
  @js.native
  trait InvalidAuthenticationCodeExceptionException extends js.Object {
    var message: invalidAuthenticationCodeMessage
  }

  /**
   * <p>The request was rejected because the certificate is invalid.</p>
   */
  @js.native
  trait InvalidCertificateExceptionException extends js.Object {
    var message: invalidCertificateMessage
  }

  /**
   * <p>The request was rejected because an invalid or out-of-range value was supplied for an input parameter.</p>
   */
  @js.native
  trait InvalidInputExceptionException extends js.Object {
    var message: invalidInputMessage
  }

  /**
   * <p>The request was rejected because the public key is malformed or otherwise invalid.</p>
   */
  @js.native
  trait InvalidPublicKeyExceptionException extends js.Object {
    var message: invalidPublicKeyMessage
  }

  /**
   * <p>The request was rejected because the type of user for the transaction was incorrect.</p>
   */
  @js.native
  trait InvalidUserTypeExceptionException extends js.Object {
    var message: invalidUserTypeMessage
  }

  /**
   * <p>The request was rejected because the public key certificate and the private key do not match.</p>
   */
  @js.native
  trait KeyPairMismatchExceptionException extends js.Object {
    var message: keyPairMismatchMessage
  }

  /**
   * <p>The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: limitExceededMessage
  }

  @js.native
  trait ListAccessKeysRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListAccessKeysRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListAccessKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccessKeysRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAccessKeys</a> request. </p>
   */
  @js.native
  trait ListAccessKeysResponse extends js.Object {
    var AccessKeyMetadata: accessKeyMetadataListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListAccessKeysResponse {
    def apply(
      AccessKeyMetadata: js.UndefOr[accessKeyMetadataListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListAccessKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessKeyMetadata" -> AccessKeyMetadata.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccessKeysResponse]
    }
  }

  @js.native
  trait ListAccountAliasesRequest extends js.Object {
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListAccountAliasesRequest {
    def apply(
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListAccountAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountAliasesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAccountAliases</a> request. </p>
   */
  @js.native
  trait ListAccountAliasesResponse extends js.Object {
    var AccountAliases: accountAliasListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListAccountAliasesResponse {
    def apply(
      AccountAliases: js.UndefOr[accountAliasListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListAccountAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountAliases" -> AccountAliases.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountAliasesResponse]
    }
  }

  @js.native
  trait ListAttachedGroupPoliciesRequest extends js.Object {
    var GroupName: groupNameType
    var PathPrefix: policyPathType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListAttachedGroupPoliciesRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListAttachedGroupPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedGroupPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAttachedGroupPolicies</a> request. </p>
   */
  @js.native
  trait ListAttachedGroupPoliciesResponse extends js.Object {
    var AttachedPolicies: attachedPoliciesListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListAttachedGroupPoliciesResponse {
    def apply(
      AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListAttachedGroupPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachedPolicies" -> AttachedPolicies.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedGroupPoliciesResponse]
    }
  }

  @js.native
  trait ListAttachedRolePoliciesRequest extends js.Object {
    var RoleName: roleNameType
    var PathPrefix: policyPathType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListAttachedRolePoliciesRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListAttachedRolePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedRolePoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAttachedRolePolicies</a> request. </p>
   */
  @js.native
  trait ListAttachedRolePoliciesResponse extends js.Object {
    var AttachedPolicies: attachedPoliciesListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListAttachedRolePoliciesResponse {
    def apply(
      AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListAttachedRolePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachedPolicies" -> AttachedPolicies.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedRolePoliciesResponse]
    }
  }

  @js.native
  trait ListAttachedUserPoliciesRequest extends js.Object {
    var UserName: userNameType
    var PathPrefix: policyPathType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListAttachedUserPoliciesRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListAttachedUserPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedUserPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAttachedUserPolicies</a> request. </p>
   */
  @js.native
  trait ListAttachedUserPoliciesResponse extends js.Object {
    var AttachedPolicies: attachedPoliciesListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListAttachedUserPoliciesResponse {
    def apply(
      AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListAttachedUserPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachedPolicies" -> AttachedPolicies.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedUserPoliciesResponse]
    }
  }

  @js.native
  trait ListEntitiesForPolicyRequest extends js.Object {
    var MaxItems: maxItemsType
    var EntityFilter: EntityType
    var PolicyArn: arnType
    var PathPrefix: pathType
    var Marker: markerType
  }

  object ListEntitiesForPolicyRequest {
    def apply(
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      EntityFilter: js.UndefOr[EntityType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      PathPrefix: js.UndefOr[pathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListEntitiesForPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("EntityFilter" -> EntityFilter.map { x => x: js.Any }),
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any }),
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitiesForPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListEntitiesForPolicy</a> request. </p>
   */
  @js.native
  trait ListEntitiesForPolicyResponse extends js.Object {
    var IsTruncated: booleanType
    var PolicyRoles: PolicyRoleListType
    var PolicyGroups: PolicyGroupListType
    var PolicyUsers: PolicyUserListType
    var Marker: markerType
  }

  object ListEntitiesForPolicyResponse {
    def apply(
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      PolicyRoles: js.UndefOr[PolicyRoleListType] = js.undefined,
      PolicyGroups: js.UndefOr[PolicyGroupListType] = js.undefined,
      PolicyUsers: js.UndefOr[PolicyUserListType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListEntitiesForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("PolicyRoles" -> PolicyRoles.map { x => x: js.Any }),
        ("PolicyGroups" -> PolicyGroups.map { x => x: js.Any }),
        ("PolicyUsers" -> PolicyUsers.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitiesForPolicyResponse]
    }
  }

  @js.native
  trait ListGroupPoliciesRequest extends js.Object {
    var GroupName: groupNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListGroupPoliciesRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListGroupPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListGroupPolicies</a> request. </p>
   */
  @js.native
  trait ListGroupPoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListGroupPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[policyNameListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListGroupPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupPoliciesResponse]
    }
  }

  @js.native
  trait ListGroupsForUserRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListGroupsForUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListGroupsForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsForUserRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListGroupsForUser</a> request. </p>
   */
  @js.native
  trait ListGroupsForUserResponse extends js.Object {
    var Groups: groupListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListGroupsForUserResponse {
    def apply(
      Groups: js.UndefOr[groupListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListGroupsForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsForUserResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var PathPrefix: pathPrefixType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListGroupsRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListGroups</a> request. </p>
   */
  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: groupListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListGroupsResponse {
    def apply(
      Groups: js.UndefOr[groupListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListInstanceProfilesForRoleRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListInstanceProfilesForRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListInstanceProfilesForRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesForRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListInstanceProfilesForRole</a> request. </p>
   */
  @js.native
  trait ListInstanceProfilesForRoleResponse extends js.Object {
    var InstanceProfiles: instanceProfileListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListInstanceProfilesForRoleResponse {
    def apply(
      InstanceProfiles: js.UndefOr[instanceProfileListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListInstanceProfilesForRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfiles" -> InstanceProfiles.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesForRoleResponse]
    }
  }

  @js.native
  trait ListInstanceProfilesRequest extends js.Object {
    var PathPrefix: pathPrefixType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListInstanceProfilesRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListInstanceProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListInstanceProfiles</a> request. </p>
   */
  @js.native
  trait ListInstanceProfilesResponse extends js.Object {
    var InstanceProfiles: instanceProfileListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListInstanceProfilesResponse {
    def apply(
      InstanceProfiles: js.UndefOr[instanceProfileListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListInstanceProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfiles" -> InstanceProfiles.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesResponse]
    }
  }

  @js.native
  trait ListMFADevicesRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListMFADevicesRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListMFADevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMFADevicesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListMFADevices</a> request. </p>
   */
  @js.native
  trait ListMFADevicesResponse extends js.Object {
    var MFADevices: mfaDeviceListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListMFADevicesResponse {
    def apply(
      MFADevices: js.UndefOr[mfaDeviceListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListMFADevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MFADevices" -> MFADevices.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMFADevicesResponse]
    }
  }

  @js.native
  trait ListOpenIDConnectProvidersRequest extends js.Object {

  }

  object ListOpenIDConnectProvidersRequest {
    def apply(

    ): ListOpenIDConnectProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenIDConnectProvidersRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListOpenIDConnectProviders</a> request. </p>
   */
  @js.native
  trait ListOpenIDConnectProvidersResponse extends js.Object {
    var OpenIDConnectProviderList: OpenIDConnectProviderListType
  }

  object ListOpenIDConnectProvidersResponse {
    def apply(
      OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.undefined
    ): ListOpenIDConnectProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderList" -> OpenIDConnectProviderList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenIDConnectProvidersResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var Scope: policyScopeType
    var MaxItems: maxItemsType
    var OnlyAttached: booleanType
    var PathPrefix: policyPathType
    var Marker: markerType
  }

  object ListPoliciesRequest {
    def apply(
      Scope: js.UndefOr[policyScopeType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      OnlyAttached: js.UndefOr[booleanType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Scope" -> Scope.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("OnlyAttached" -> OnlyAttached.map { x => x: js.Any }),
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListPolicies</a> request. </p>
   */
  @js.native
  trait ListPoliciesResponse extends js.Object {
    var Policies: policyListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListPoliciesResponse {
    def apply(
      Policies: js.UndefOr[policyListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policies" -> Policies.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListPolicyVersionsRequest extends js.Object {
    var PolicyArn: arnType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListPolicyVersionsRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListPolicyVersions</a> request. </p>
   */
  @js.native
  trait ListPolicyVersionsResponse extends js.Object {
    var Versions: policyDocumentVersionListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListPolicyVersionsResponse {
    def apply(
      Versions: js.UndefOr[policyDocumentVersionListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Versions" -> Versions.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsResponse]
    }
  }

  @js.native
  trait ListRolePoliciesRequest extends js.Object {
    var RoleName: roleNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListRolePoliciesRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListRolePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolePoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListRolePolicies</a> request. </p>
   */
  @js.native
  trait ListRolePoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListRolePoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[policyNameListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListRolePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolePoliciesResponse]
    }
  }

  @js.native
  trait ListRolesRequest extends js.Object {
    var PathPrefix: pathPrefixType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListRolesRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListRolesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListRoles</a> request. </p>
   */
  @js.native
  trait ListRolesResponse extends js.Object {
    var Roles: roleListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListRolesResponse {
    def apply(
      Roles: js.UndefOr[roleListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListRolesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Roles" -> Roles.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolesResponse]
    }
  }

  @js.native
  trait ListSAMLProvidersRequest extends js.Object {

  }

  object ListSAMLProvidersRequest {
    def apply(

    ): ListSAMLProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSAMLProvidersRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListSAMLProviders</a> request. </p>
   */
  @js.native
  trait ListSAMLProvidersResponse extends js.Object {
    var SAMLProviderList: SAMLProviderListType
  }

  object ListSAMLProvidersResponse {
    def apply(
      SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.undefined
    ): ListSAMLProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLProviderList" -> SAMLProviderList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSAMLProvidersResponse]
    }
  }

  @js.native
  trait ListSSHPublicKeysRequest extends js.Object {
    var UserName: userNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListSSHPublicKeysRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListSSHPublicKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSSHPublicKeysRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListSSHPublicKeys</a> request.</p>
   */
  @js.native
  trait ListSSHPublicKeysResponse extends js.Object {
    var SSHPublicKeys: SSHPublicKeyListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListSSHPublicKeysResponse {
    def apply(
      SSHPublicKeys: js.UndefOr[SSHPublicKeyListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListSSHPublicKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SSHPublicKeys" -> SSHPublicKeys.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSSHPublicKeysResponse]
    }
  }

  @js.native
  trait ListServerCertificatesRequest extends js.Object {
    var PathPrefix: pathPrefixType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListServerCertificatesRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListServerCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerCertificatesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListServerCertificates</a> request. </p>
   */
  @js.native
  trait ListServerCertificatesResponse extends js.Object {
    var ServerCertificateMetadataList: serverCertificateMetadataListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListServerCertificatesResponse {
    def apply(
      ServerCertificateMetadataList: js.UndefOr[serverCertificateMetadataListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListServerCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificateMetadataList" -> ServerCertificateMetadataList.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerCertificatesResponse]
    }
  }

  @js.native
  trait ListServiceSpecificCredentialsRequest extends js.Object {
    var UserName: userNameType
    var ServiceName: serviceName
  }

  object ListServiceSpecificCredentialsRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined
    ): ListServiceSpecificCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceName" -> ServiceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceSpecificCredentialsRequest]
    }
  }

  @js.native
  trait ListServiceSpecificCredentialsResponse extends js.Object {
    var ServiceSpecificCredentials: ServiceSpecificCredentialsListType
  }

  object ListServiceSpecificCredentialsResponse {
    def apply(
      ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.undefined
    ): ListServiceSpecificCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceSpecificCredentials" -> ServiceSpecificCredentials.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceSpecificCredentialsResponse]
    }
  }

  @js.native
  trait ListSigningCertificatesRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListSigningCertificatesRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListSigningCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningCertificatesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListSigningCertificates</a> request. </p>
   */
  @js.native
  trait ListSigningCertificatesResponse extends js.Object {
    var Certificates: certificateListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListSigningCertificatesResponse {
    def apply(
      Certificates: js.UndefOr[certificateListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListSigningCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Certificates" -> Certificates.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningCertificatesResponse]
    }
  }

  @js.native
  trait ListUserPoliciesRequest extends js.Object {
    var UserName: existingUserNameType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListUserPoliciesRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListUserPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListUserPolicies</a> request. </p>
   */
  @js.native
  trait ListUserPoliciesResponse extends js.Object {
    var PolicyNames: policyNameListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListUserPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[policyNameListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListUserPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoliciesResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var PathPrefix: pathPrefixType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListUsersRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPrefix" -> PathPrefix.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListUsers</a> request. </p>
   */
  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: userListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListUsersResponse {
    def apply(
      Users: js.UndefOr[userListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Users" -> Users.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait ListVirtualMFADevicesRequest extends js.Object {
    var AssignmentStatus: assignmentStatusType
    var Marker: markerType
    var MaxItems: maxItemsType
  }

  object ListVirtualMFADevicesRequest {
    def apply(
      AssignmentStatus: js.UndefOr[assignmentStatusType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined
    ): ListVirtualMFADevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssignmentStatus" -> AssignmentStatus.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualMFADevicesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListVirtualMFADevices</a> request. </p>
   */
  @js.native
  trait ListVirtualMFADevicesResponse extends js.Object {
    var VirtualMFADevices: virtualMFADeviceListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object ListVirtualMFADevicesResponse {
    def apply(
      VirtualMFADevices: js.UndefOr[virtualMFADeviceListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): ListVirtualMFADevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VirtualMFADevices" -> VirtualMFADevices.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualMFADevicesResponse]
    }
  }

  /**
   * <p>Contains the user name and password create date for a user.</p> <p> This data type is used as a response element in the <a>CreateLoginProfile</a> and <a>GetLoginProfile</a> actions. </p>
   */
  @js.native
  trait LoginProfile extends js.Object {
    var UserName: userNameType
    var CreateDate: dateType
    var PasswordResetRequired: booleanType
  }

  object LoginProfile {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
    ): LoginProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("PasswordResetRequired" -> PasswordResetRequired.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoginProfile]
    }
  }

  /**
   * <p>Contains information about an MFA device.</p> <p>This data type is used as a response element in the <a>ListMFADevices</a> action.</p>
   */
  @js.native
  trait MFADevice extends js.Object {
    var UserName: userNameType
    var SerialNumber: serialNumberType
    var EnableDate: dateType
  }

  object MFADevice {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      EnableDate: js.UndefOr[dateType] = js.undefined
    ): MFADevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any }),
        ("EnableDate" -> EnableDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MFADevice]
    }
  }

  /**
   * <p>The request was rejected because the certificate was malformed or expired. The error message describes the specific error.</p>
   */
  @js.native
  trait MalformedCertificateExceptionException extends js.Object {
    var message: malformedCertificateMessage
  }

  /**
   * <p>The request was rejected because the policy document was malformed. The error message describes the specific error.</p>
   */
  @js.native
  trait MalformedPolicyDocumentExceptionException extends js.Object {
    var message: malformedPolicyDocumentMessage
  }

  /**
   * <p>Contains information about a managed policy, including the policy's ARN, versions, and the number of principal entities (users, groups, and roles) that the policy is attached to.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.</p> <p>For more information about managed policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait ManagedPolicyDetail extends js.Object {
    var PolicyId: idType
    var DefaultVersionId: policyVersionIdType
    var Path: policyPathType
    var PolicyVersionList: policyDocumentVersionListType
    var Description: policyDescriptionType
    var UpdateDate: dateType
    var Arn: arnType
    var CreateDate: dateType
    var PolicyName: policyNameType
    var AttachmentCount: attachmentCountType
    var IsAttachable: booleanType
  }

  object ManagedPolicyDetail {
    def apply(
      PolicyId: js.UndefOr[idType] = js.undefined,
      DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined,
      Path: js.UndefOr[policyPathType] = js.undefined,
      PolicyVersionList: js.UndefOr[policyDocumentVersionListType] = js.undefined,
      Description: js.UndefOr[policyDescriptionType] = js.undefined,
      UpdateDate: js.UndefOr[dateType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
      IsAttachable: js.UndefOr[booleanType] = js.undefined
    ): ManagedPolicyDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyId" -> PolicyId.map { x => x: js.Any }),
        ("DefaultVersionId" -> DefaultVersionId.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("PolicyVersionList" -> PolicyVersionList.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("UpdateDate" -> UpdateDate.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("AttachmentCount" -> AttachmentCount.map { x => x: js.Any }),
        ("IsAttachable" -> IsAttachable.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ManagedPolicyDetail]
    }
  }

  /**
   * <p>The request was rejected because it referenced an entity that does not exist. The error message describes the entity.</p>
   */
  @js.native
  trait NoSuchEntityExceptionException extends js.Object {
    var message: noSuchEntityMessage
  }

  /**
   * <p>Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.</p>
   */
  @js.native
  trait OpenIDConnectProviderListEntry extends js.Object {
    var Arn: arnType
  }

  object OpenIDConnectProviderListEntry {
    def apply(
      Arn: js.UndefOr[arnType] = js.undefined
    ): OpenIDConnectProviderListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Arn" -> Arn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenIDConnectProviderListEntry]
    }
  }

  /**
   * <p>Contains information about the account password policy.</p> <p> This data type is used as a response element in the <a>GetAccountPasswordPolicy</a> action. </p>
   */
  @js.native
  trait PasswordPolicy extends js.Object {
    var ExpirePasswords: booleanType
    var MinimumPasswordLength: minimumPasswordLengthType
    var PasswordReusePrevention: passwordReusePreventionType
    var HardExpiry: booleanObjectType
    var RequireNumbers: booleanType
    var RequireUppercaseCharacters: booleanType
    var AllowUsersToChangePassword: booleanType
    var MaxPasswordAge: maxPasswordAgeType
    var RequireSymbols: booleanType
    var RequireLowercaseCharacters: booleanType
  }

  object PasswordPolicy {
    def apply(
      ExpirePasswords: js.UndefOr[booleanType] = js.undefined,
      MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
      PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
      HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
      RequireNumbers: js.UndefOr[booleanType] = js.undefined,
      RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined,
      AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
      MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
      RequireSymbols: js.UndefOr[booleanType] = js.undefined,
      RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
    ): PasswordPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExpirePasswords" -> ExpirePasswords.map { x => x: js.Any }),
        ("MinimumPasswordLength" -> MinimumPasswordLength.map { x => x: js.Any }),
        ("PasswordReusePrevention" -> PasswordReusePrevention.map { x => x: js.Any }),
        ("HardExpiry" -> HardExpiry.map { x => x: js.Any }),
        ("RequireNumbers" -> RequireNumbers.map { x => x: js.Any }),
        ("RequireUppercaseCharacters" -> RequireUppercaseCharacters.map { x => x: js.Any }),
        ("AllowUsersToChangePassword" -> AllowUsersToChangePassword.map { x => x: js.Any }),
        ("MaxPasswordAge" -> MaxPasswordAge.map { x => x: js.Any }),
        ("RequireSymbols" -> RequireSymbols.map { x => x: js.Any }),
        ("RequireLowercaseCharacters" -> RequireLowercaseCharacters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PasswordPolicy]
    }
  }

  /**
   * <p>The request was rejected because the provided password did not meet the requirements imposed by the account password policy.</p>
   */
  @js.native
  trait PasswordPolicyViolationExceptionException extends js.Object {
    var message: passwordPolicyViolationMessage
  }

  /**
   * <p>Contains information about a managed policy.</p> <p>This data type is used as a response element in the <a>CreatePolicy</a>, <a>GetPolicy</a>, and <a>ListPolicies</a> actions. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait Policy extends js.Object {
    var PolicyId: idType
    var DefaultVersionId: policyVersionIdType
    var Path: policyPathType
    var Description: policyDescriptionType
    var UpdateDate: dateType
    var Arn: arnType
    var CreateDate: dateType
    var PolicyName: policyNameType
    var AttachmentCount: attachmentCountType
    var IsAttachable: booleanType
  }

  object Policy {
    def apply(
      PolicyId: js.UndefOr[idType] = js.undefined,
      DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined,
      Path: js.UndefOr[policyPathType] = js.undefined,
      Description: js.UndefOr[policyDescriptionType] = js.undefined,
      UpdateDate: js.UndefOr[dateType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
      IsAttachable: js.UndefOr[booleanType] = js.undefined
    ): Policy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyId" -> PolicyId.map { x => x: js.Any }),
        ("DefaultVersionId" -> DefaultVersionId.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("UpdateDate" -> UpdateDate.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("AttachmentCount" -> AttachmentCount.map { x => x: js.Any }),
        ("IsAttachable" -> IsAttachable.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
    }
  }

  /**
   * <p>Contains information about an IAM policy, including the policy document.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.</p>
   */
  @js.native
  trait PolicyDetail extends js.Object {
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object PolicyDetail {
    def apply(
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): PolicyDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyDetail]
    }
  }


  object PolicyEvaluationDecisionTypeEnum {
    val allowed = "allowed"
    val explicitDeny = "explicitDeny"
    val implicitDeny = "implicitDeny"

    val values = IndexedSeq(allowed, explicitDeny, implicitDeny)
  }

  /**
   * <p>The request failed because a provided policy could not be successfully evaluated. An additional detail message indicates the source of the failure.</p>
   */
  @js.native
  trait PolicyEvaluationExceptionException extends js.Object {
    var message: policyEvaluationErrorMessage
  }

  /**
   * <p>Contains information about a group that a managed policy is attached to.</p> <p>This data type is used as a response element in the <a>ListEntitiesForPolicy</a> action. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyGroup extends js.Object {
    var GroupName: groupNameType
    var GroupId: idType
  }

  object PolicyGroup {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      GroupId: js.UndefOr[idType] = js.undefined
    ): PolicyGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyGroup]
    }
  }

  /**
   * <p>Contains information about a role that a managed policy is attached to.</p> <p>This data type is used as a response element in the <a>ListEntitiesForPolicy</a> action. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyRole extends js.Object {
    var RoleName: roleNameType
    var RoleId: idType
  }

  object PolicyRole {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      RoleId: js.UndefOr[idType] = js.undefined
    ): PolicyRole = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("RoleId" -> RoleId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyRole]
    }
  }


  object PolicySourceTypeEnum {
    val user = "user"
    val group = "group"
    val role = "role"
    val `aws-managed` = "aws-managed"
    val `user-managed` = "user-managed"
    val resource = "resource"
    val none = "none"

    val values = IndexedSeq(user, group, role, `aws-managed`, `user-managed`, resource, none)
  }

  /**
   * <p>Contains information about a user that a managed policy is attached to.</p> <p>This data type is used as a response element in the <a>ListEntitiesForPolicy</a> action. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyUser extends js.Object {
    var UserName: userNameType
    var UserId: idType
  }

  object PolicyUser {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      UserId: js.UndefOr[idType] = js.undefined
    ): PolicyUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("UserId" -> UserId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyUser]
    }
  }

  /**
   * <p>Contains information about a version of a managed policy.</p> <p>This data type is used as a response element in the <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>, <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a> actions. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyVersion extends js.Object {
    var Document: policyDocumentType
    var VersionId: policyVersionIdType
    var IsDefaultVersion: booleanType
    var CreateDate: dateType
  }

  object PolicyVersion {
    def apply(
      Document: js.UndefOr[policyDocumentType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined,
      IsDefaultVersion: js.UndefOr[booleanType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined
    ): PolicyVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Document" -> Document.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("IsDefaultVersion" -> IsDefaultVersion.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyVersion]
    }
  }

  /**
   * <p>Contains the row and column of a location of a <code>Statement</code> element in a policy document.</p> <p>This data type is used as a member of the <code> <a>Statement</a> </code> type.</p>
   */
  @js.native
  trait Position extends js.Object {
    var Line: LineNumber
    var Column: ColumnNumber
  }

  object Position {
    def apply(
      Line: js.UndefOr[LineNumber] = js.undefined,
      Column: js.UndefOr[ColumnNumber] = js.undefined
    ): Position = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Line" -> Line.map { x => x: js.Any }),
        ("Column" -> Column.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Position]
    }
  }

  @js.native
  trait PutGroupPolicyRequest extends js.Object {
    var GroupName: groupNameType
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object PutGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): PutGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutGroupPolicyRequest]
    }
  }

  @js.native
  trait PutRolePolicyRequest extends js.Object {
    var RoleName: roleNameType
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object PutRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): PutRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRolePolicyRequest]
    }
  }

  @js.native
  trait PutUserPolicyRequest extends js.Object {
    var UserName: existingUserNameType
    var PolicyName: policyNameType
    var PolicyDocument: policyDocumentType
  }

  object PutUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): PutUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutUserPolicyRequest]
    }
  }

  @js.native
  trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
    var ClientID: clientIDType
  }

  object RemoveClientIDFromOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined,
      ClientID: js.UndefOr[clientIDType] = js.undefined
    ): RemoveClientIDFromOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x: js.Any }),
        ("ClientID" -> ClientID.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveClientIDFromOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait RemoveRoleFromInstanceProfileRequest extends js.Object {
    var InstanceProfileName: instanceProfileNameType
    var RoleName: roleNameType
  }

  object RemoveRoleFromInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined
    ): RemoveRoleFromInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceProfileName" -> InstanceProfileName.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveRoleFromInstanceProfileRequest]
    }
  }

  @js.native
  trait RemoveUserFromGroupRequest extends js.Object {
    var GroupName: groupNameType
    var UserName: existingUserNameType
  }

  object RemoveUserFromGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      UserName: js.UndefOr[existingUserNameType] = js.undefined
    ): RemoveUserFromGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveUserFromGroupRequest]
    }
  }


  object ReportFormatTypeEnum {
    val `text/csv` = "text/csv"

    val values = IndexedSeq(`text/csv`)
  }


  object ReportStateTypeEnum {
    val STARTED = "STARTED"
    val INPROGRESS = "INPROGRESS"
    val COMPLETE = "COMPLETE"

    val values = IndexedSeq(STARTED, INPROGRESS, COMPLETE)
  }

  @js.native
  trait ResetServiceSpecificCredentialRequest extends js.Object {
    var UserName: userNameType
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
  }

  object ResetServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined
    ): ResetServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait ResetServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: ServiceSpecificCredential
  }

  object ResetServiceSpecificCredentialResponse {
    def apply(
      ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
    ): ResetServiceSpecificCredentialResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceSpecificCredential" -> ServiceSpecificCredential.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetServiceSpecificCredentialResponse]
    }
  }

  /**
   * <p>Contains the result of the simulation of a single API action call on a single resource.</p> <p>This data type is used by a member of the <a>EvaluationResult</a> data type.</p>
   */
  @js.native
  trait ResourceSpecificResult extends js.Object {
    var EvalResourceDecision: PolicyEvaluationDecisionType
    var MissingContextValues: ContextKeyNamesResultListType
    var EvalResourceName: ResourceNameType
    var EvalDecisionDetails: EvalDecisionDetailsType
    var MatchedStatements: StatementListType
  }

  object ResourceSpecificResult {
    def apply(
      EvalResourceDecision: js.UndefOr[PolicyEvaluationDecisionType] = js.undefined,
      MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined,
      EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined,
      EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined,
      MatchedStatements: js.UndefOr[StatementListType] = js.undefined
    ): ResourceSpecificResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvalResourceDecision" -> EvalResourceDecision.map { x => x: js.Any }),
        ("MissingContextValues" -> MissingContextValues.map { x => x: js.Any }),
        ("EvalResourceName" -> EvalResourceName.map { x => x: js.Any }),
        ("EvalDecisionDetails" -> EvalDecisionDetails.map { x => x: js.Any }),
        ("MatchedStatements" -> MatchedStatements.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceSpecificResult]
    }
  }

  @js.native
  trait ResyncMFADeviceRequest extends js.Object {
    var UserName: existingUserNameType
    var SerialNumber: serialNumberType
    var AuthenticationCode1: authenticationCodeType
    var AuthenticationCode2: authenticationCodeType
  }

  object ResyncMFADeviceRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      AuthenticationCode1: js.UndefOr[authenticationCodeType] = js.undefined,
      AuthenticationCode2: js.UndefOr[authenticationCodeType] = js.undefined
    ): ResyncMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any }),
        ("AuthenticationCode1" -> AuthenticationCode1.map { x => x: js.Any }),
        ("AuthenticationCode2" -> AuthenticationCode2.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResyncMFADeviceRequest]
    }
  }

  /**
   * <p>Contains information about an IAM role.</p> <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateRole</a> </p> </li> <li> <p> <a>GetRole</a> </p> </li> <li> <p> <a>ListRoles</a> </p> </li> </ul>
   */
  @js.native
  trait Role extends js.Object {
    var RoleId: idType
    var Path: pathType
    var AssumeRolePolicyDocument: policyDocumentType
    var Arn: arnType
    var CreateDate: dateType
    var RoleName: roleNameType
  }

  object Role {
    def apply(
      RoleId: js.UndefOr[idType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined
    ): Role = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleId" -> RoleId.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Role]
    }
  }

  /**
   * <p>Contains information about an IAM role, including all of the role's policies.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.</p>
   */
  @js.native
  trait RoleDetail extends js.Object {
    var RoleId: idType
    var AttachedManagedPolicies: attachedPoliciesListType
    var Path: pathType
    var AssumeRolePolicyDocument: policyDocumentType
    var RolePolicyList: policyDetailListType
    var Arn: arnType
    var CreateDate: dateType
    var RoleName: roleNameType
    var InstanceProfileList: instanceProfileListType
  }

  object RoleDetail {
    def apply(
      RoleId: js.UndefOr[idType] = js.undefined,
      AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      RolePolicyList: js.UndefOr[policyDetailListType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      InstanceProfileList: js.UndefOr[instanceProfileListType] = js.undefined
    ): RoleDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleId" -> RoleId.map { x => x: js.Any }),
        ("AttachedManagedPolicies" -> AttachedManagedPolicies.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.map { x => x: js.Any }),
        ("RolePolicyList" -> RolePolicyList.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("InstanceProfileList" -> InstanceProfileList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoleDetail]
    }
  }

  /**
   * <p>Contains the list of SAML providers for this account.</p>
   */
  @js.native
  trait SAMLProviderListEntry extends js.Object {
    var Arn: arnType
    var ValidUntil: dateType
    var CreateDate: dateType
  }

  object SAMLProviderListEntry {
    def apply(
      Arn: js.UndefOr[arnType] = js.undefined,
      ValidUntil: js.UndefOr[dateType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined
    ): SAMLProviderListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("ValidUntil" -> ValidUntil.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SAMLProviderListEntry]
    }
  }

  /**
   * <p>Contains information about an SSH public key.</p> <p>This data type is used as a response element in the <a>GetSSHPublicKey</a> and <a>UploadSSHPublicKey</a> actions. </p>
   */
  @js.native
  trait SSHPublicKey extends js.Object {
    var UserName: userNameType
    var SSHPublicKeyBody: publicKeyMaterialType
    var Fingerprint: publicKeyFingerprintType
    var UploadDate: dateType
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
  }

  object SSHPublicKey {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyBody: js.UndefOr[publicKeyMaterialType] = js.undefined,
      Fingerprint: js.UndefOr[publicKeyFingerprintType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): SSHPublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SSHPublicKeyBody" -> SSHPublicKeyBody.map { x => x: js.Any }),
        ("Fingerprint" -> Fingerprint.map { x => x: js.Any }),
        ("UploadDate" -> UploadDate.map { x => x: js.Any }),
        ("SSHPublicKeyId" -> SSHPublicKeyId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSHPublicKey]
    }
  }

  /**
   * <p>Contains information about an SSH public key, without the key's body or fingerprint.</p> <p>This data type is used as a response element in the <a>ListSSHPublicKeys</a> action.</p>
   */
  @js.native
  trait SSHPublicKeyMetadata extends js.Object {
    var UserName: userNameType
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
    var UploadDate: dateType
  }

  object SSHPublicKeyMetadata {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined
    ): SSHPublicKeyMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SSHPublicKeyId" -> SSHPublicKeyId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("UploadDate" -> UploadDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSHPublicKeyMetadata]
    }
  }

  /**
   * <p>Contains information about a server certificate.</p> <p> This data type is used as a response element in the <a>GetServerCertificate</a> action. </p>
   */
  @js.native
  trait ServerCertificate extends js.Object {
    var ServerCertificateMetadata: ServerCertificateMetadata
    var CertificateBody: certificateBodyType
    var CertificateChain: certificateChainType
  }

  object ServerCertificate {
    def apply(
      ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined,
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined,
      CertificateChain: js.UndefOr[certificateChainType] = js.undefined
    ): ServerCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificateMetadata" -> ServerCertificateMetadata.map { x => x: js.Any }),
        ("CertificateBody" -> CertificateBody.map { x => x: js.Any }),
        ("CertificateChain" -> CertificateChain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerCertificate]
    }
  }

  /**
   * <p>Contains information about a server certificate without its certificate body, certificate chain, and private key.</p> <p> This data type is used as a response element in the <a>UploadServerCertificate</a> and <a>ListServerCertificates</a> actions. </p>
   */
  @js.native
  trait ServerCertificateMetadata extends js.Object {
    var Path: pathType
    var ServerCertificateName: serverCertificateNameType
    var Arn: arnType
    var UploadDate: dateType
    var ServerCertificateId: idType
    var Expiration: dateType
  }

  object ServerCertificateMetadata {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined,
      ServerCertificateId: js.UndefOr[idType] = js.undefined,
      Expiration: js.UndefOr[dateType] = js.undefined
    ): ServerCertificateMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("ServerCertificateName" -> ServerCertificateName.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("UploadDate" -> UploadDate.map { x => x: js.Any }),
        ("ServerCertificateId" -> ServerCertificateId.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerCertificateMetadata]
    }
  }

  /**
   * <p>The request processing has failed because of an unknown error, exception or failure.</p>
   */
  @js.native
  trait ServiceFailureExceptionException extends js.Object {
    var message: serviceFailureExceptionMessage
  }

  /**
   * <p>The specified service does not support service-specific credentials.</p>
   */
  @js.native
  trait ServiceNotSupportedExceptionException extends js.Object {
    var message: serviceNotSupportedMessage
  }

  /**
   * <p>Contains the details of a service specific credential.</p>
   */
  @js.native
  trait ServiceSpecificCredential extends js.Object {
    var UserName: userNameType
    var ServiceName: serviceName
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var ServicePassword: servicePassword
    var CreateDate: dateType
    var ServiceUserName: serviceUserName
    var Status: statusType
  }

  object ServiceSpecificCredential {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined,
      ServicePassword: js.UndefOr[servicePassword] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      ServiceUserName: js.UndefOr[serviceUserName] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): ServiceSpecificCredential = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceName" -> ServiceName.map { x => x: js.Any }),
        ("ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x: js.Any }),
        ("ServicePassword" -> ServicePassword.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("ServiceUserName" -> ServiceUserName.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSpecificCredential]
    }
  }

  /**
   * <p>Contains additional details about a service-specific credential.</p>
   */
  @js.native
  trait ServiceSpecificCredentialMetadata extends js.Object {
    var UserName: userNameType
    var ServiceName: serviceName
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var CreateDate: dateType
    var ServiceUserName: serviceUserName
    var Status: statusType
  }

  object ServiceSpecificCredentialMetadata {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      ServiceUserName: js.UndefOr[serviceUserName] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): ServiceSpecificCredentialMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceName" -> ServiceName.map { x => x: js.Any }),
        ("ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("ServiceUserName" -> ServiceUserName.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSpecificCredentialMetadata]
    }
  }

  @js.native
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var PolicyArn: arnType
    var VersionId: policyVersionIdType
  }

  object SetDefaultPolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined
    ): SetDefaultPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyArn" -> PolicyArn.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultPolicyVersionRequest]
    }
  }

  /**
   * <p>Contains information about an X.509 signing certificate.</p> <p>This data type is used as a response element in the <a>UploadSigningCertificate</a> and <a>ListSigningCertificates</a> actions. </p>
   */
  @js.native
  trait SigningCertificate extends js.Object {
    var UserName: userNameType
    var CertificateBody: certificateBodyType
    var CertificateId: certificateIdType
    var UploadDate: dateType
    var Status: statusType
  }

  object SigningCertificate {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined,
      CertificateId: js.UndefOr[certificateIdType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): SigningCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("CertificateBody" -> CertificateBody.map { x => x: js.Any }),
        ("CertificateId" -> CertificateId.map { x => x: js.Any }),
        ("UploadDate" -> UploadDate.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningCertificate]
    }
  }

  @js.native
  trait SimulateCustomPolicyRequest extends js.Object {
    var ResourceArns: ResourceNameListType
    var ResourceHandlingOption: ResourceHandlingOptionType
    var MaxItems: maxItemsType
    var ResourcePolicy: policyDocumentType
    var ResourceOwner: ResourceNameType
    var CallerArn: ResourceNameType
    var PolicyInputList: SimulationPolicyListType
    var ActionNames: ActionNameListType
    var ContextEntries: ContextEntryListType
    var Marker: markerType
  }

  object SimulateCustomPolicyRequest {
    def apply(
      ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined,
      ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined,
      ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined,
      CallerArn: js.UndefOr[ResourceNameType] = js.undefined,
      PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined,
      ActionNames: js.UndefOr[ActionNameListType] = js.undefined,
      ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): SimulateCustomPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceArns" -> ResourceArns.map { x => x: js.Any }),
        ("ResourceHandlingOption" -> ResourceHandlingOption.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("ResourcePolicy" -> ResourcePolicy.map { x => x: js.Any }),
        ("ResourceOwner" -> ResourceOwner.map { x => x: js.Any }),
        ("CallerArn" -> CallerArn.map { x => x: js.Any }),
        ("PolicyInputList" -> PolicyInputList.map { x => x: js.Any }),
        ("ActionNames" -> ActionNames.map { x => x: js.Any }),
        ("ContextEntries" -> ContextEntries.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulateCustomPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>SimulatePrincipalPolicy</a> or <a>SimulateCustomPolicy</a> request.</p>
   */
  @js.native
  trait SimulatePolicyResponse extends js.Object {
    var EvaluationResults: EvaluationResultsListType
    var IsTruncated: booleanType
    var Marker: markerType
  }

  object SimulatePolicyResponse {
    def apply(
      EvaluationResults: js.UndefOr[EvaluationResultsListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): SimulatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationResults" -> EvaluationResults.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulatePolicyResponse]
    }
  }

  @js.native
  trait SimulatePrincipalPolicyRequest extends js.Object {
    var ResourceArns: ResourceNameListType
    var ResourceHandlingOption: ResourceHandlingOptionType
    var MaxItems: maxItemsType
    var ResourcePolicy: policyDocumentType
    var PolicySourceArn: arnType
    var ResourceOwner: ResourceNameType
    var CallerArn: ResourceNameType
    var PolicyInputList: SimulationPolicyListType
    var ActionNames: ActionNameListType
    var ContextEntries: ContextEntryListType
    var Marker: markerType
  }

  object SimulatePrincipalPolicyRequest {
    def apply(
      ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined,
      ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined,
      PolicySourceArn: js.UndefOr[arnType] = js.undefined,
      ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined,
      CallerArn: js.UndefOr[ResourceNameType] = js.undefined,
      PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined,
      ActionNames: js.UndefOr[ActionNameListType] = js.undefined,
      ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined
    ): SimulatePrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceArns" -> ResourceArns.map { x => x: js.Any }),
        ("ResourceHandlingOption" -> ResourceHandlingOption.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("ResourcePolicy" -> ResourcePolicy.map { x => x: js.Any }),
        ("PolicySourceArn" -> PolicySourceArn.map { x => x: js.Any }),
        ("ResourceOwner" -> ResourceOwner.map { x => x: js.Any }),
        ("CallerArn" -> CallerArn.map { x => x: js.Any }),
        ("PolicyInputList" -> PolicyInputList.map { x => x: js.Any }),
        ("ActionNames" -> ActionNames.map { x => x: js.Any }),
        ("ContextEntries" -> ContextEntries.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulatePrincipalPolicyRequest]
    }
  }

  /**
   * <p>Contains a reference to a <code>Statement</code> element in a policy document that determines the result of the simulation.</p> <p>This data type is used by the <code>MatchedStatements</code> member of the <code> <a>EvaluationResult</a> </code> type.</p>
   */
  @js.native
  trait Statement extends js.Object {
    var SourcePolicyId: PolicyIdentifierType
    var SourcePolicyType: PolicySourceType
    var StartPosition: Position
    var EndPosition: Position
  }

  object Statement {
    def apply(
      SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.undefined,
      SourcePolicyType: js.UndefOr[PolicySourceType] = js.undefined,
      StartPosition: js.UndefOr[Position] = js.undefined,
      EndPosition: js.UndefOr[Position] = js.undefined
    ): Statement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourcePolicyId" -> SourcePolicyId.map { x => x: js.Any }),
        ("SourcePolicyType" -> SourcePolicyType.map { x => x: js.Any }),
        ("StartPosition" -> StartPosition.map { x => x: js.Any }),
        ("EndPosition" -> EndPosition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Statement]
    }
  }

  /**
   * <p>The request was rejected because the public key encoding format is unsupported or unrecognized.</p>
   */
  @js.native
  trait UnrecognizedPublicKeyEncodingExceptionException extends js.Object {
    var message: unrecognizedPublicKeyEncodingMessage
  }

  @js.native
  trait UpdateAccessKeyRequest extends js.Object {
    var UserName: existingUserNameType
    var AccessKeyId: accessKeyIdType
    var Status: statusType
  }

  object UpdateAccessKeyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): UpdateAccessKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccessKeyRequest]
    }
  }

  @js.native
  trait UpdateAccountPasswordPolicyRequest extends js.Object {
    var MinimumPasswordLength: minimumPasswordLengthType
    var PasswordReusePrevention: passwordReusePreventionType
    var HardExpiry: booleanObjectType
    var RequireNumbers: booleanType
    var RequireUppercaseCharacters: booleanType
    var AllowUsersToChangePassword: booleanType
    var MaxPasswordAge: maxPasswordAgeType
    var RequireSymbols: booleanType
    var RequireLowercaseCharacters: booleanType
  }

  object UpdateAccountPasswordPolicyRequest {
    def apply(
      MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
      PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
      HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
      RequireNumbers: js.UndefOr[booleanType] = js.undefined,
      RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined,
      AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
      MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
      RequireSymbols: js.UndefOr[booleanType] = js.undefined,
      RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
    ): UpdateAccountPasswordPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MinimumPasswordLength" -> MinimumPasswordLength.map { x => x: js.Any }),
        ("PasswordReusePrevention" -> PasswordReusePrevention.map { x => x: js.Any }),
        ("HardExpiry" -> HardExpiry.map { x => x: js.Any }),
        ("RequireNumbers" -> RequireNumbers.map { x => x: js.Any }),
        ("RequireUppercaseCharacters" -> RequireUppercaseCharacters.map { x => x: js.Any }),
        ("AllowUsersToChangePassword" -> AllowUsersToChangePassword.map { x => x: js.Any }),
        ("MaxPasswordAge" -> MaxPasswordAge.map { x => x: js.Any }),
        ("RequireSymbols" -> RequireSymbols.map { x => x: js.Any }),
        ("RequireLowercaseCharacters" -> RequireLowercaseCharacters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountPasswordPolicyRequest]
    }
  }

  @js.native
  trait UpdateAssumeRolePolicyRequest extends js.Object {
    var RoleName: roleNameType
    var PolicyDocument: policyDocumentType
  }

  object UpdateAssumeRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    ): UpdateAssumeRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RoleName" -> RoleName.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssumeRolePolicyRequest]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupName: groupNameType
    var NewPath: pathType
    var NewGroupName: groupNameType
  }

  object UpdateGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      NewPath: js.UndefOr[pathType] = js.undefined,
      NewGroupName: js.UndefOr[groupNameType] = js.undefined
    ): UpdateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("NewPath" -> NewPath.map { x => x: js.Any }),
        ("NewGroupName" -> NewGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateLoginProfileRequest extends js.Object {
    var UserName: userNameType
    var Password: passwordType
    var PasswordResetRequired: booleanObjectType
  }

  object UpdateLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Password: js.UndefOr[passwordType] = js.undefined,
      PasswordResetRequired: js.UndefOr[booleanObjectType] = js.undefined
    ): UpdateLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Password" -> Password.map { x => x: js.Any }),
        ("PasswordResetRequired" -> PasswordResetRequired.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoginProfileRequest]
    }
  }

  @js.native
  trait UpdateOpenIDConnectProviderThumbprintRequest extends js.Object {
    var OpenIDConnectProviderArn: arnType
    var ThumbprintList: thumbprintListType
  }

  object UpdateOpenIDConnectProviderThumbprintRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined,
      ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined
    ): UpdateOpenIDConnectProviderThumbprintRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x: js.Any }),
        ("ThumbprintList" -> ThumbprintList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOpenIDConnectProviderThumbprintRequest]
    }
  }

  @js.native
  trait UpdateSAMLProviderRequest extends js.Object {
    var SAMLMetadataDocument: SAMLMetadataDocumentType
    var SAMLProviderArn: arnType
  }

  object UpdateSAMLProviderRequest {
    def apply(
      SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): UpdateSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLMetadataDocument" -> SAMLMetadataDocument.map { x => x: js.Any }),
        ("SAMLProviderArn" -> SAMLProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSAMLProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UpdateSAMLProvider</a> request. </p>
   */
  @js.native
  trait UpdateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: arnType
  }

  object UpdateSAMLProviderResponse {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined
    ): UpdateSAMLProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLProviderArn" -> SAMLProviderArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSAMLProviderResponse]
    }
  }

  @js.native
  trait UpdateSSHPublicKeyRequest extends js.Object {
    var UserName: userNameType
    var SSHPublicKeyId: publicKeyIdType
    var Status: statusType
  }

  object UpdateSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): UpdateSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SSHPublicKeyId" -> SSHPublicKeyId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSSHPublicKeyRequest]
    }
  }

  @js.native
  trait UpdateServerCertificateRequest extends js.Object {
    var ServerCertificateName: serverCertificateNameType
    var NewPath: pathType
    var NewServerCertificateName: serverCertificateNameType
  }

  object UpdateServerCertificateRequest {
    def apply(
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined,
      NewPath: js.UndefOr[pathType] = js.undefined,
      NewServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined
    ): UpdateServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificateName" -> ServerCertificateName.map { x => x: js.Any }),
        ("NewPath" -> NewPath.map { x => x: js.Any }),
        ("NewServerCertificateName" -> NewServerCertificateName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerCertificateRequest]
    }
  }

  @js.native
  trait UpdateServiceSpecificCredentialRequest extends js.Object {
    var UserName: userNameType
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    var Status: statusType
  }

  object UpdateServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): UpdateServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait UpdateSigningCertificateRequest extends js.Object {
    var UserName: existingUserNameType
    var CertificateId: certificateIdType
    var Status: statusType
  }

  object UpdateSigningCertificateRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      CertificateId: js.UndefOr[certificateIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined
    ): UpdateSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("CertificateId" -> CertificateId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSigningCertificateRequest]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var UserName: existingUserNameType
    var NewPath: pathType
    var NewUserName: userNameType
  }

  object UpdateUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      NewPath: js.UndefOr[pathType] = js.undefined,
      NewUserName: js.UndefOr[userNameType] = js.undefined
    ): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("NewPath" -> NewPath.map { x => x: js.Any }),
        ("NewUserName" -> NewUserName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UploadSSHPublicKeyRequest extends js.Object {
    var UserName: userNameType
    var SSHPublicKeyBody: publicKeyMaterialType
  }

  object UploadSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyBody: js.UndefOr[publicKeyMaterialType] = js.undefined
    ): UploadSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("SSHPublicKeyBody" -> SSHPublicKeyBody.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSSHPublicKeyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UploadSSHPublicKey</a> request.</p>
   */
  @js.native
  trait UploadSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: SSHPublicKey
  }

  object UploadSSHPublicKeyResponse {
    def apply(
      SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
    ): UploadSSHPublicKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SSHPublicKey" -> SSHPublicKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSSHPublicKeyResponse]
    }
  }

  @js.native
  trait UploadServerCertificateRequest extends js.Object {
    var CertificateBody: certificateBodyType
    var Path: pathType
    var ServerCertificateName: serverCertificateNameType
    var PrivateKey: privateKeyType
    var CertificateChain: certificateChainType
  }

  object UploadServerCertificateRequest {
    def apply(
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined,
      PrivateKey: js.UndefOr[privateKeyType] = js.undefined,
      CertificateChain: js.UndefOr[certificateChainType] = js.undefined
    ): UploadServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CertificateBody" -> CertificateBody.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("ServerCertificateName" -> ServerCertificateName.map { x => x: js.Any }),
        ("PrivateKey" -> PrivateKey.map { x => x: js.Any }),
        ("CertificateChain" -> CertificateChain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadServerCertificateRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UploadServerCertificate</a> request. </p>
   */
  @js.native
  trait UploadServerCertificateResponse extends js.Object {
    var ServerCertificateMetadata: ServerCertificateMetadata
  }

  object UploadServerCertificateResponse {
    def apply(
      ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined
    ): UploadServerCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServerCertificateMetadata" -> ServerCertificateMetadata.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadServerCertificateResponse]
    }
  }

  @js.native
  trait UploadSigningCertificateRequest extends js.Object {
    var UserName: existingUserNameType
    var CertificateBody: certificateBodyType
  }

  object UploadSigningCertificateRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined
    ): UploadSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("CertificateBody" -> CertificateBody.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSigningCertificateRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UploadSigningCertificate</a> request. </p>
   */
  @js.native
  trait UploadSigningCertificateResponse extends js.Object {
    var Certificate: SigningCertificate
  }

  object UploadSigningCertificateResponse {
    def apply(
      Certificate: js.UndefOr[SigningCertificate] = js.undefined
    ): UploadSigningCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Certificate" -> Certificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSigningCertificateResponse]
    }
  }

  /**
   * <p>Contains information about an IAM user entity.</p> <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateUser</a> </p> </li> <li> <p> <a>GetUser</a> </p> </li> <li> <p> <a>ListUsers</a> </p> </li> </ul>
   */
  @js.native
  trait User extends js.Object {
    var UserName: userNameType
    var Path: pathType
    var Arn: arnType
    var CreateDate: dateType
    var PasswordLastUsed: dateType
    var UserId: idType
  }

  object User {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      PasswordLastUsed: js.UndefOr[dateType] = js.undefined,
      UserId: js.UndefOr[idType] = js.undefined
    ): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("PasswordLastUsed" -> PasswordLastUsed.map { x => x: js.Any }),
        ("UserId" -> UserId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
   * <p>Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.</p>
   */
  @js.native
  trait UserDetail extends js.Object {
    var UserName: userNameType
    var AttachedManagedPolicies: attachedPoliciesListType
    var GroupList: groupNameListType
    var Path: pathType
    var UserPolicyList: policyDetailListType
    var Arn: arnType
    var CreateDate: dateType
    var UserId: idType
  }

  object UserDetail {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      GroupList: js.UndefOr[groupNameListType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      UserId: js.UndefOr[idType] = js.undefined
    ): UserDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("AttachedManagedPolicies" -> AttachedManagedPolicies.map { x => x: js.Any }),
        ("GroupList" -> GroupList.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("UserPolicyList" -> UserPolicyList.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("UserId" -> UserId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserDetail]
    }
  }

  /**
   * <p>Contains information about a virtual MFA device.</p>
   */
  @js.native
  trait VirtualMFADevice extends js.Object {
    var EnableDate: dateType
    var QRCodePNG: BootstrapDatum
    var Base32StringSeed: BootstrapDatum
    var User: User
    var SerialNumber: serialNumberType
  }

  object VirtualMFADevice {
    def apply(
      EnableDate: js.UndefOr[dateType] = js.undefined,
      QRCodePNG: js.UndefOr[BootstrapDatum] = js.undefined,
      Base32StringSeed: js.UndefOr[BootstrapDatum] = js.undefined,
      User: js.UndefOr[User] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined
    ): VirtualMFADevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnableDate" -> EnableDate.map { x => x: js.Any }),
        ("QRCodePNG" -> QRCodePNG.map { x => x: js.Any }),
        ("Base32StringSeed" -> Base32StringSeed.map { x => x: js.Any }),
        ("User" -> User.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualMFADevice]
    }
  }


  object assignmentStatusTypeEnum {
    val Assigned = "Assigned"
    val Unassigned = "Unassigned"
    val Any = "Any"

    val values = IndexedSeq(Assigned, Unassigned, Any)
  }


  object encodingTypeEnum {
    val SSH = "SSH"
    val PEM = "PEM"

    val values = IndexedSeq(SSH, PEM)
  }


  object policyScopeTypeEnum {
    val All = "All"
    val AWS = "AWS"
    val Local = "Local"

    val values = IndexedSeq(All, AWS, Local)
  }


  object statusTypeEnum {
    val Active = "Active"
    val Inactive = "Inactive"

    val values = IndexedSeq(Active, Inactive)
  }


  object summaryKeyTypeEnum {
    val Users = "Users"
    val UsersQuota = "UsersQuota"
    val Groups = "Groups"
    val GroupsQuota = "GroupsQuota"
    val ServerCertificates = "ServerCertificates"
    val ServerCertificatesQuota = "ServerCertificatesQuota"
    val UserPolicySizeQuota = "UserPolicySizeQuota"
    val GroupPolicySizeQuota = "GroupPolicySizeQuota"
    val GroupsPerUserQuota = "GroupsPerUserQuota"
    val SigningCertificatesPerUserQuota = "SigningCertificatesPerUserQuota"
    val AccessKeysPerUserQuota = "AccessKeysPerUserQuota"
    val MFADevices = "MFADevices"
    val MFADevicesInUse = "MFADevicesInUse"
    val AccountMFAEnabled = "AccountMFAEnabled"
    val AccountAccessKeysPresent = "AccountAccessKeysPresent"
    val AccountSigningCertificatesPresent = "AccountSigningCertificatesPresent"
    val AttachedPoliciesPerGroupQuota = "AttachedPoliciesPerGroupQuota"
    val AttachedPoliciesPerRoleQuota = "AttachedPoliciesPerRoleQuota"
    val AttachedPoliciesPerUserQuota = "AttachedPoliciesPerUserQuota"
    val Policies = "Policies"
    val PoliciesQuota = "PoliciesQuota"
    val PolicySizeQuota = "PolicySizeQuota"
    val PolicyVersionsInUse = "PolicyVersionsInUse"
    val PolicyVersionsInUseQuota = "PolicyVersionsInUseQuota"
    val VersionsPerPolicyQuota = "VersionsPerPolicyQuota"

    val values = IndexedSeq(Users, UsersQuota, Groups, GroupsQuota, ServerCertificates, ServerCertificatesQuota, UserPolicySizeQuota, GroupPolicySizeQuota, GroupsPerUserQuota, SigningCertificatesPerUserQuota, AccessKeysPerUserQuota, MFADevices, MFADevicesInUse, AccountMFAEnabled, AccountAccessKeysPresent, AccountSigningCertificatesPresent, AttachedPoliciesPerGroupQuota, AttachedPoliciesPerRoleQuota, AttachedPoliciesPerUserQuota, Policies, PoliciesQuota, PolicySizeQuota, PolicyVersionsInUse, PolicyVersionsInUseQuota, VersionsPerPolicyQuota)
  }
}
