package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object iam {
  type ActionNameListType = js.Array[ActionNameType]
  type ActionNameType = String
  type ArnListType = js.Array[arnType]
  type BootstrapDatum = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ColumnNumber = Int
  type ContextEntryListType = js.Array[ContextEntry]
  type ContextKeyNameType = String
  type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]
  type ContextKeyTypeEnum = String
  type ContextKeyValueListType = js.Array[ContextKeyValueType]
  type ContextKeyValueType = String
  type DeletionTaskIdType = String
  type DeletionTaskStatusType = String
  type EntityType = String
  type EvalDecisionDetailsType = js.Dictionary[PolicyEvaluationDecisionType]
  type EvalDecisionSourceType = String
  type EvaluationResultsListType = js.Array[EvaluationResult]
  type LineNumber = Int
  type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = String
  type PermissionsBoundaryAttachmentType = String
  type PolicyEvaluationDecisionType = String
  type PolicyGroupListType = js.Array[PolicyGroup]
  type PolicyIdentifierType = String
  type PolicyRoleListType = js.Array[PolicyRole]
  type PolicySourceType = String
  type PolicyUsageType = String
  type PolicyUserListType = js.Array[PolicyUser]
  type ReasonType = String
  type RegionNameType = String
  type ReportContentType = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReportFormatType = String
  type ReportStateDescriptionType = String
  type ReportStateType = String
  type ResourceHandlingOptionType = String
  type ResourceNameListType = js.Array[ResourceNameType]
  type ResourceNameType = String
  type ResourceSpecificResultListType = js.Array[ResourceSpecificResult]
  type RoleUsageListType = js.Array[RoleUsageType]
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
  type attachmentCountType = Int
  type authenticationCodeType = String
  type booleanObjectType = Boolean
  type booleanType = Boolean
  type certificateBodyType = String
  type certificateChainType = String
  type certificateIdType = String
  type certificateListType = js.Array[SigningCertificate]
  type clientIDListType = js.Array[clientIDType]
  type clientIDType = String
  type customSuffixType = String
  type dateType = js.Date
  type encodingType = String
  type entityListType = js.Array[EntityType]
  type existingUserNameType = String
  type groupDetailListType = js.Array[GroupDetail]
  type groupListType = js.Array[Group]
  type groupNameListType = js.Array[groupNameType]
  type groupNameType = String
  type idType = String
  type instanceProfileListType = js.Array[InstanceProfile]
  type instanceProfileNameType = String
  type markerType = String
  type maxItemsType = Int
  type maxPasswordAgeType = Int
  type mfaDeviceListType = js.Array[MFADevice]
  type minimumPasswordLengthType = Int
  type passwordReusePreventionType = Int
  type passwordType = String
  type pathPrefixType = String
  type pathType = String
  type policyDescriptionType = String
  type policyDetailListType = js.Array[PolicyDetail]
  type policyDocumentType = String
  type policyDocumentVersionListType = js.Array[PolicyVersion]
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
  type roleDescriptionType = String
  type roleDetailListType = js.Array[RoleDetail]
  type roleListType = js.Array[Role]
  type roleMaxSessionDurationType = Int
  type roleNameType = String
  type serialNumberType = String
  type serverCertificateMetadataListType = js.Array[ServerCertificateMetadata]
  type serverCertificateNameType = String
  type serviceName = String
  type servicePassword = String
  type serviceSpecificCredentialId = String
  type serviceUserName = String
  type statusType = String
  type stringType = String
  type summaryKeyType = String
  type summaryMapType = js.Dictionary[summaryValueType]
  type summaryValueType = Int
  type tagKeyListType = js.Array[tagKeyType]
  type tagKeyType = String
  type tagListType = js.Array[Tag]
  type tagValueType = String
  type thumbprintListType = js.Array[thumbprintType]
  type thumbprintType = String
  type userDetailListType = js.Array[UserDetail]
  type userListType = js.Array[User]
  type userNameType = String
  type virtualMFADeviceListType = js.Array[VirtualMFADevice]
  type virtualMFADeviceName = String
}

package iam {
  @js.native
  @JSImport("aws-sdk", "IAM")
  class IAM(config: AWSConfig) extends js.Object {
    def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest): Request[js.Object] = js.native
    def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest): Request[js.Object] = js.native
    def addUserToGroup(params: AddUserToGroupRequest): Request[js.Object] = js.native
    def attachGroupPolicy(params: AttachGroupPolicyRequest): Request[js.Object] = js.native
    def attachRolePolicy(params: AttachRolePolicyRequest): Request[js.Object] = js.native
    def attachUserPolicy(params: AttachUserPolicyRequest): Request[js.Object] = js.native
    def changePassword(params: ChangePasswordRequest): Request[js.Object] = js.native
    def createAccessKey(params: CreateAccessKeyRequest): Request[CreateAccessKeyResponse] = js.native
    def createAccountAlias(params: CreateAccountAliasRequest): Request[js.Object] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResponse] = js.native
    def createLoginProfile(params: CreateLoginProfileRequest): Request[CreateLoginProfileResponse] = js.native
    def createOpenIDConnectProvider(params: CreateOpenIDConnectProviderRequest): Request[CreateOpenIDConnectProviderResponse] = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse] = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createRole(params: CreateRoleRequest): Request[CreateRoleResponse] = js.native
    def createSAMLProvider(params: CreateSAMLProviderRequest): Request[CreateSAMLProviderResponse] = js.native
    def createServiceLinkedRole(params: CreateServiceLinkedRoleRequest): Request[CreateServiceLinkedRoleResponse] = js.native
    def createServiceSpecificCredential(params: CreateServiceSpecificCredentialRequest): Request[CreateServiceSpecificCredentialResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest): Request[CreateVirtualMFADeviceResponse] = js.native
    def deactivateMFADevice(params: DeactivateMFADeviceRequest): Request[js.Object] = js.native
    def deleteAccessKey(params: DeleteAccessKeyRequest): Request[js.Object] = js.native
    def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[js.Object] = js.native
    def deleteAccountPasswordPolicy(): Request[js.Object] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[js.Object] = js.native
    def deleteGroupPolicy(params: DeleteGroupPolicyRequest): Request[js.Object] = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[js.Object] = js.native
    def deleteLoginProfile(params: DeleteLoginProfileRequest): Request[js.Object] = js.native
    def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object] = js.native
    def deleteRole(params: DeleteRoleRequest): Request[js.Object] = js.native
    def deleteRolePermissionsBoundary(params: DeleteRolePermissionsBoundaryRequest): Request[js.Object] = js.native
    def deleteRolePolicy(params: DeleteRolePolicyRequest): Request[js.Object] = js.native
    def deleteSAMLProvider(params: DeleteSAMLProviderRequest): Request[js.Object] = js.native
    def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest): Request[js.Object] = js.native
    def deleteServerCertificate(params: DeleteServerCertificateRequest): Request[js.Object] = js.native
    def deleteServiceLinkedRole(params: DeleteServiceLinkedRoleRequest): Request[DeleteServiceLinkedRoleResponse] = js.native
    def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def deleteSigningCertificate(params: DeleteSigningCertificateRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteUserPermissionsBoundary(params: DeleteUserPermissionsBoundaryRequest): Request[js.Object] = js.native
    def deleteUserPolicy(params: DeleteUserPolicyRequest): Request[js.Object] = js.native
    def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest): Request[js.Object] = js.native
    def detachGroupPolicy(params: DetachGroupPolicyRequest): Request[js.Object] = js.native
    def detachRolePolicy(params: DetachRolePolicyRequest): Request[js.Object] = js.native
    def detachUserPolicy(params: DetachUserPolicyRequest): Request[js.Object] = js.native
    def enableMFADevice(params: EnableMFADeviceRequest): Request[js.Object] = js.native
    def generateCredentialReport(): Request[GenerateCredentialReportResponse] = js.native
    def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest): Request[GetAccessKeyLastUsedResponse] = js.native
    def getAccountAuthorizationDetails(params: GetAccountAuthorizationDetailsRequest): Request[GetAccountAuthorizationDetailsResponse] = js.native
    def getAccountPasswordPolicy(): Request[GetAccountPasswordPolicyResponse] = js.native
    def getAccountSummary(): Request[GetAccountSummaryResponse] = js.native
    def getContextKeysForCustomPolicy(params: GetContextKeysForCustomPolicyRequest): Request[GetContextKeysForPolicyResponse] = js.native
    def getContextKeysForPrincipalPolicy(params: GetContextKeysForPrincipalPolicyRequest): Request[GetContextKeysForPolicyResponse] = js.native
    def getCredentialReport(): Request[GetCredentialReportResponse] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse] = js.native
    def getGroupPolicy(params: GetGroupPolicyRequest): Request[GetGroupPolicyResponse] = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResponse] = js.native
    def getLoginProfile(params: GetLoginProfileRequest): Request[GetLoginProfileResponse] = js.native
    def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest): Request[GetOpenIDConnectProviderResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse] = js.native
    def getRole(params: GetRoleRequest): Request[GetRoleResponse] = js.native
    def getRolePolicy(params: GetRolePolicyRequest): Request[GetRolePolicyResponse] = js.native
    def getSAMLProvider(params: GetSAMLProviderRequest): Request[GetSAMLProviderResponse] = js.native
    def getSSHPublicKey(params: GetSSHPublicKeyRequest): Request[GetSSHPublicKeyResponse] = js.native
    def getServerCertificate(params: GetServerCertificateRequest): Request[GetServerCertificateResponse] = js.native
    def getServiceLinkedRoleDeletionStatus(params: GetServiceLinkedRoleDeletionStatusRequest): Request[GetServiceLinkedRoleDeletionStatusResponse] = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse] = js.native
    def getUserPolicy(params: GetUserPolicyRequest): Request[GetUserPolicyResponse] = js.native
    def listAccessKeys(params: ListAccessKeysRequest): Request[ListAccessKeysResponse] = js.native
    def listAccountAliases(params: ListAccountAliasesRequest): Request[ListAccountAliasesResponse] = js.native
    def listAttachedGroupPolicies(params: ListAttachedGroupPoliciesRequest): Request[ListAttachedGroupPoliciesResponse] = js.native
    def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest): Request[ListAttachedRolePoliciesResponse] = js.native
    def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest): Request[ListAttachedUserPoliciesResponse] = js.native
    def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest): Request[ListEntitiesForPolicyResponse] = js.native
    def listGroupPolicies(params: ListGroupPoliciesRequest): Request[ListGroupPoliciesResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listGroupsForUser(params: ListGroupsForUserRequest): Request[ListGroupsForUserResponse] = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResponse] = js.native
    def listInstanceProfilesForRole(params: ListInstanceProfilesForRoleRequest): Request[ListInstanceProfilesForRoleResponse] = js.native
    def listMFADevices(params: ListMFADevicesRequest): Request[ListMFADevicesResponse] = js.native
    def listOpenIDConnectProviders(params: ListOpenIDConnectProvidersRequest): Request[ListOpenIDConnectProvidersResponse] = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse] = js.native
    def listRolePolicies(params: ListRolePoliciesRequest): Request[ListRolePoliciesResponse] = js.native
    def listRoleTags(params: ListRoleTagsRequest): Request[ListRoleTagsResponse] = js.native
    def listRoles(params: ListRolesRequest): Request[ListRolesResponse] = js.native
    def listSAMLProviders(params: ListSAMLProvidersRequest): Request[ListSAMLProvidersResponse] = js.native
    def listSSHPublicKeys(params: ListSSHPublicKeysRequest): Request[ListSSHPublicKeysResponse] = js.native
    def listServerCertificates(params: ListServerCertificatesRequest): Request[ListServerCertificatesResponse] = js.native
    def listServiceSpecificCredentials(params: ListServiceSpecificCredentialsRequest): Request[ListServiceSpecificCredentialsResponse] = js.native
    def listSigningCertificates(params: ListSigningCertificatesRequest): Request[ListSigningCertificatesResponse] = js.native
    def listUserPolicies(params: ListUserPoliciesRequest): Request[ListUserPoliciesResponse] = js.native
    def listUserTags(params: ListUserTagsRequest): Request[ListUserTagsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listVirtualMFADevices(params: ListVirtualMFADevicesRequest): Request[ListVirtualMFADevicesResponse] = js.native
    def putGroupPolicy(params: PutGroupPolicyRequest): Request[js.Object] = js.native
    def putRolePermissionsBoundary(params: PutRolePermissionsBoundaryRequest): Request[js.Object] = js.native
    def putRolePolicy(params: PutRolePolicyRequest): Request[js.Object] = js.native
    def putUserPermissionsBoundary(params: PutUserPermissionsBoundaryRequest): Request[js.Object] = js.native
    def putUserPolicy(params: PutUserPolicyRequest): Request[js.Object] = js.native
    def removeClientIDFromOpenIDConnectProvider(params: RemoveClientIDFromOpenIDConnectProviderRequest): Request[js.Object] = js.native
    def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest): Request[js.Object] = js.native
    def removeUserFromGroup(params: RemoveUserFromGroupRequest): Request[js.Object] = js.native
    def resetServiceSpecificCredential(params: ResetServiceSpecificCredentialRequest): Request[ResetServiceSpecificCredentialResponse] = js.native
    def resyncMFADevice(params: ResyncMFADeviceRequest): Request[js.Object] = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object] = js.native
    def simulateCustomPolicy(params: SimulateCustomPolicyRequest): Request[SimulatePolicyResponse] = js.native
    def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest): Request[SimulatePolicyResponse] = js.native
    def tagRole(params: TagRoleRequest): Request[js.Object] = js.native
    def tagUser(params: TagUserRequest): Request[js.Object] = js.native
    def untagRole(params: UntagRoleRequest): Request[js.Object] = js.native
    def untagUser(params: UntagUserRequest): Request[js.Object] = js.native
    def updateAccessKey(params: UpdateAccessKeyRequest): Request[js.Object] = js.native
    def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest): Request[js.Object] = js.native
    def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest): Request[js.Object] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[js.Object] = js.native
    def updateLoginProfile(params: UpdateLoginProfileRequest): Request[js.Object] = js.native
    def updateOpenIDConnectProviderThumbprint(params: UpdateOpenIDConnectProviderThumbprintRequest): Request[js.Object] = js.native
    def updateRole(params: UpdateRoleRequest): Request[UpdateRoleResponse] = js.native
    def updateRoleDescription(params: UpdateRoleDescriptionRequest): Request[UpdateRoleDescriptionResponse] = js.native
    def updateSAMLProvider(params: UpdateSAMLProviderRequest): Request[UpdateSAMLProviderResponse] = js.native
    def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest): Request[js.Object] = js.native
    def updateServerCertificate(params: UpdateServerCertificateRequest): Request[js.Object] = js.native
    def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest): Request[js.Object] = js.native
    def updateSigningCertificate(params: UpdateSigningCertificateRequest): Request[js.Object] = js.native
    def updateUser(params: UpdateUserRequest): Request[js.Object] = js.native
    def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest): Request[UploadSSHPublicKeyResponse] = js.native
    def uploadServerCertificate(params: UploadServerCertificateRequest): Request[UploadServerCertificateResponse] = js.native
    def uploadSigningCertificate(params: UploadSigningCertificateRequest): Request[UploadSigningCertificateResponse] = js.native
  }

  /**
   * <p>Contains information about an AWS access key.</p> <p> This data type is used as a response element in the <a>CreateAccessKey</a> and <a>ListAccessKeys</a> operations. </p> <note> <p>The <code>SecretAccessKey</code> value is returned only in response to <a>CreateAccessKey</a>. You can get a secret access key only when you first create an access key; you cannot recover the secret access key later. If you lose a secret access key, you must create a new access key.</p> </note>
   */
  @js.native
  trait AccessKey extends js.Object {
    var SecretAccessKey: js.UndefOr[accessKeySecretType]
    var UserName: js.UndefOr[userNameType]
    var AccessKeyId: js.UndefOr[accessKeyIdType]
    var CreateDate: js.UndefOr[dateType]
    var Status: js.UndefOr[statusType]
  }

  object AccessKey {
    def apply(
      SecretAccessKey: js.UndefOr[accessKeySecretType] = js.undefined,
      UserName: js.UndefOr[userNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): AccessKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretAccessKey" -> SecretAccessKey.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKey]
    }
  }

  /**
   * <p>Contains information about the last time an AWS access key was used.</p> <p>This data type is used as a response element in the <a>GetAccessKeyLastUsed</a> operation.</p>
   */
  @js.native
  trait AccessKeyLastUsed extends js.Object {
    var LastUsedDate: js.UndefOr[dateType]
    var ServiceName: js.UndefOr[stringType]
    var Region: js.UndefOr[stringType]
  }

  object AccessKeyLastUsed {
    def apply(
      LastUsedDate: js.UndefOr[dateType] = js.undefined,
      ServiceName: js.UndefOr[stringType] = js.undefined,
      Region: js.UndefOr[stringType] = js.undefined): AccessKeyLastUsed = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUsedDate" -> LastUsedDate.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKeyLastUsed]
    }
  }

  /**
   * <p>Contains information about an AWS access key, without its secret key.</p> <p>This data type is used as a response element in the <a>ListAccessKeys</a> operation.</p>
   */
  @js.native
  trait AccessKeyMetadata extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var AccessKeyId: js.UndefOr[accessKeyIdType]
    var Status: js.UndefOr[statusType]
    var CreateDate: js.UndefOr[dateType]
  }

  object AccessKeyMetadata {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined): AccessKeyMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKeyMetadata]
    }
  }

  @js.native
  trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
    var ClientID: js.UndefOr[clientIDType]
  }

  object AddClientIDToOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined,
      ClientID: js.UndefOr[clientIDType] = js.undefined): AddClientIDToOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x.asInstanceOf[js.Any] },
        "ClientID" -> ClientID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddClientIDToOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait AddRoleToInstanceProfileRequest extends js.Object {
    var InstanceProfileName: js.UndefOr[instanceProfileNameType]
    var RoleName: js.UndefOr[roleNameType]
  }

  object AddRoleToInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined): AddRoleToInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfileName" -> InstanceProfileName.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddRoleToInstanceProfileRequest]
    }
  }

  @js.native
  trait AddUserToGroupRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  object AddUserToGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      UserName: js.UndefOr[existingUserNameType] = js.undefined): AddUserToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddUserToGroupRequest]
    }
  }

  @js.native
  trait AttachGroupPolicyRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object AttachGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): AttachGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachGroupPolicyRequest]
    }
  }

  @js.native
  trait AttachRolePolicyRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object AttachRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): AttachRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachRolePolicyRequest]
    }
  }

  @js.native
  trait AttachUserPolicyRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object AttachUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): AttachUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachUserPolicyRequest]
    }
  }

  /**
   * <p>Contains information about an attached permissions boundary.</p> <p>An attached permissions boundary is a managed policy that has been attached to a user or role to set the permissions boundary.</p> <p>For more information about permissions boundaries, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a> in the <i>IAM User Guide</i>.</p>
   */
  @js.native
  trait AttachedPermissionsBoundary extends js.Object {
    var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType]
    var PermissionsBoundaryArn: js.UndefOr[arnType]
  }

  object AttachedPermissionsBoundary {
    def apply(
      PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.undefined,
      PermissionsBoundaryArn: js.UndefOr[arnType] = js.undefined): AttachedPermissionsBoundary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PermissionsBoundaryType" -> PermissionsBoundaryType.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundaryArn" -> PermissionsBoundaryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachedPermissionsBoundary]
    }
  }

  /**
   * <p>Contains information about an attached policy.</p> <p>An attached policy is a managed policy that has been attached to a user, group, or role. This data type is used as a response element in the <a>ListAttachedGroupPolicies</a>, <a>ListAttachedRolePolicies</a>, <a>ListAttachedUserPolicies</a>, and <a>GetAccountAuthorizationDetails</a> operations. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait AttachedPolicy extends js.Object {
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object AttachedPolicy {
    def apply(
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): AttachedPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachedPolicy]
    }
  }

  @js.native
  trait ChangePasswordRequest extends js.Object {
    var OldPassword: js.UndefOr[passwordType]
    var NewPassword: js.UndefOr[passwordType]
  }

  object ChangePasswordRequest {
    def apply(
      OldPassword: js.UndefOr[passwordType] = js.undefined,
      NewPassword: js.UndefOr[passwordType] = js.undefined): ChangePasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OldPassword" -> OldPassword.map { x => x.asInstanceOf[js.Any] },
        "NewPassword" -> NewPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangePasswordRequest]
    }
  }

  /**
   * <p>Contains information about a condition context key. It includes the name of the key and specifies the value (or values, if the context key supports multiple values) to use in the simulation. This information is used when evaluating the <code>Condition</code> elements of the input policies.</p> <p>This data type is used as an input parameter to <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulateCustomPolicy</a> </code>.</p>
   */
  @js.native
  trait ContextEntry extends js.Object {
    var ContextKeyName: js.UndefOr[ContextKeyNameType]
    var ContextKeyValues: js.UndefOr[ContextKeyValueListType]
    var ContextKeyType: js.UndefOr[ContextKeyTypeEnum]
  }

  object ContextEntry {
    def apply(
      ContextKeyName: js.UndefOr[ContextKeyNameType] = js.undefined,
      ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.undefined,
      ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.undefined): ContextEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContextKeyName" -> ContextKeyName.map { x => x.asInstanceOf[js.Any] },
        "ContextKeyValues" -> ContextKeyValues.map { x => x.asInstanceOf[js.Any] },
        "ContextKeyType" -> ContextKeyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var UserName: js.UndefOr[existingUserNameType]
  }

  object CreateAccessKeyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined): CreateAccessKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessKeyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateAccessKey</a> request. </p>
   */
  @js.native
  trait CreateAccessKeyResponse extends js.Object {
    var AccessKey: js.UndefOr[AccessKey]
  }

  object CreateAccessKeyResponse {
    def apply(
      AccessKey: js.UndefOr[AccessKey] = js.undefined): CreateAccessKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKey" -> AccessKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessKeyResponse]
    }
  }

  @js.native
  trait CreateAccountAliasRequest extends js.Object {
    var AccountAlias: js.UndefOr[accountAliasType]
  }

  object CreateAccountAliasRequest {
    def apply(
      AccountAlias: js.UndefOr[accountAliasType] = js.undefined): CreateAccountAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountAlias" -> AccountAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountAliasRequest]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var Path: js.UndefOr[pathType]
    var GroupName: js.UndefOr[groupNameType]
  }

  object CreateGroupRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      GroupName: js.UndefOr[groupNameType] = js.undefined): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateGroup</a> request. </p>
   */
  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object CreateGroupResponse {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateInstanceProfileRequest extends js.Object {
    var InstanceProfileName: js.UndefOr[instanceProfileNameType]
    var Path: js.UndefOr[pathType]
  }

  object CreateInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined): CreateInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfileName" -> InstanceProfileName.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateInstanceProfile</a> request. </p>
   */
  @js.native
  trait CreateInstanceProfileResponse extends js.Object {
    var InstanceProfile: js.UndefOr[InstanceProfile]
  }

  object CreateInstanceProfileResponse {
    def apply(
      InstanceProfile: js.UndefOr[InstanceProfile] = js.undefined): CreateInstanceProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfile" -> InstanceProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceProfileResponse]
    }
  }

  @js.native
  trait CreateLoginProfileRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var Password: js.UndefOr[passwordType]
    var PasswordResetRequired: js.UndefOr[booleanType]
  }

  object CreateLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Password: js.UndefOr[passwordType] = js.undefined,
      PasswordResetRequired: js.UndefOr[booleanType] = js.undefined): CreateLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "PasswordResetRequired" -> PasswordResetRequired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoginProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateLoginProfile</a> request. </p>
   */
  @js.native
  trait CreateLoginProfileResponse extends js.Object {
    var LoginProfile: js.UndefOr[LoginProfile]
  }

  object CreateLoginProfileResponse {
    def apply(
      LoginProfile: js.UndefOr[LoginProfile] = js.undefined): CreateLoginProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoginProfile" -> LoginProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoginProfileResponse]
    }
  }

  @js.native
  trait CreateOpenIDConnectProviderRequest extends js.Object {
    var Url: js.UndefOr[OpenIDConnectProviderUrlType]
    var ClientIDList: js.UndefOr[clientIDListType]
    var ThumbprintList: js.UndefOr[thumbprintListType]
  }

  object CreateOpenIDConnectProviderRequest {
    def apply(
      Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined,
      ClientIDList: js.UndefOr[clientIDListType] = js.undefined,
      ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined): CreateOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "ClientIDList" -> ClientIDList.map { x => x.asInstanceOf[js.Any] },
        "ThumbprintList" -> ThumbprintList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOpenIDConnectProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateOpenIDConnectProvider</a> request. </p>
   */
  @js.native
  trait CreateOpenIDConnectProviderResponse extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
  }

  object CreateOpenIDConnectProviderResponse {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined): CreateOpenIDConnectProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOpenIDConnectProviderResponse]
    }
  }

  @js.native
  trait CreatePolicyRequest extends js.Object {
    var PolicyName: js.UndefOr[policyNameType]
    var Path: js.UndefOr[policyPathType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
    var Description: js.UndefOr[policyDescriptionType]
  }

  object CreatePolicyRequest {
    def apply(
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      Path: js.UndefOr[policyPathType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      Description: js.UndefOr[policyDescriptionType] = js.undefined): CreatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreatePolicy</a> request. </p>
   */
  @js.native
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object CreatePolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined): CreatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyResponse]
    }
  }

  @js.native
  trait CreatePolicyVersionRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
    var SetAsDefault: js.UndefOr[booleanType]
  }

  object CreatePolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      SetAsDefault: js.UndefOr[booleanType] = js.undefined): CreatePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "SetAsDefault" -> SetAsDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreatePolicyVersion</a> request. </p>
   */
  @js.native
  trait CreatePolicyVersionResponse extends js.Object {
    var PolicyVersion: js.UndefOr[PolicyVersion]
  }

  object CreatePolicyVersionResponse {
    def apply(
      PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined): CreatePolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyVersion" -> PolicyVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionResponse]
    }
  }

  @js.native
  trait CreateRoleRequest extends js.Object {
    var Path: js.UndefOr[pathType]
    var Description: js.UndefOr[roleDescriptionType]
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var PermissionsBoundary: js.UndefOr[arnType]
    var RoleName: js.UndefOr[roleNameType]
    var Tags: js.UndefOr[tagListType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
  }

  object CreateRoleRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      Description: js.UndefOr[roleDescriptionType] = js.undefined,
      AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      PermissionsBoundary: js.UndefOr[arnType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined,
      MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined): CreateRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "MaxSessionDuration" -> MaxSessionDuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateRole</a> request. </p>
   */
  @js.native
  trait CreateRoleResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  object CreateRoleResponse {
    def apply(
      Role: js.UndefOr[Role] = js.undefined): CreateRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleResponse]
    }
  }

  @js.native
  trait CreateSAMLProviderRequest extends js.Object {
    var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType]
    var Name: js.UndefOr[SAMLProviderNameType]
  }

  object CreateSAMLProviderRequest {
    def apply(
      SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
      Name: js.UndefOr[SAMLProviderNameType] = js.undefined): CreateSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLMetadataDocument" -> SAMLMetadataDocument.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSAMLProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateSAMLProvider</a> request. </p>
   */
  @js.native
  trait CreateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object CreateSAMLProviderResponse {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined): CreateSAMLProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLProviderArn" -> SAMLProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSAMLProviderResponse]
    }
  }

  @js.native
  trait CreateServiceLinkedRoleRequest extends js.Object {
    var AWSServiceName: js.UndefOr[groupNameType]
    var Description: js.UndefOr[roleDescriptionType]
    var CustomSuffix: js.UndefOr[customSuffixType]
  }

  object CreateServiceLinkedRoleRequest {
    def apply(
      AWSServiceName: js.UndefOr[groupNameType] = js.undefined,
      Description: js.UndefOr[roleDescriptionType] = js.undefined,
      CustomSuffix: js.UndefOr[customSuffixType] = js.undefined): CreateServiceLinkedRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AWSServiceName" -> AWSServiceName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "CustomSuffix" -> CustomSuffix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceLinkedRoleRequest]
    }
  }

  @js.native
  trait CreateServiceLinkedRoleResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  object CreateServiceLinkedRoleResponse {
    def apply(
      Role: js.UndefOr[Role] = js.undefined): CreateServiceLinkedRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceLinkedRoleResponse]
    }
  }

  @js.native
  trait CreateServiceSpecificCredentialRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var ServiceName: js.UndefOr[serviceName]
  }

  object CreateServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined): CreateServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait CreateServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential]
  }

  object CreateServiceSpecificCredentialResponse {
    def apply(
      ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined): CreateServiceSpecificCredentialResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceSpecificCredential" -> ServiceSpecificCredential.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceSpecificCredentialResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var Path: js.UndefOr[pathType]
    var UserName: js.UndefOr[userNameType]
    var Tags: js.UndefOr[tagListType]
    var PermissionsBoundary: js.UndefOr[arnType]
  }

  object CreateUserRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      UserName: js.UndefOr[userNameType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined,
      PermissionsBoundary: js.UndefOr[arnType] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateUser</a> request. </p>
   */
  @js.native
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object CreateUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait CreateVirtualMFADeviceRequest extends js.Object {
    var Path: js.UndefOr[pathType]
    var VirtualMFADeviceName: js.UndefOr[virtualMFADeviceName]
  }

  object CreateVirtualMFADeviceRequest {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      VirtualMFADeviceName: js.UndefOr[virtualMFADeviceName] = js.undefined): CreateVirtualMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "VirtualMFADeviceName" -> VirtualMFADeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualMFADeviceRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>CreateVirtualMFADevice</a> request. </p>
   */
  @js.native
  trait CreateVirtualMFADeviceResponse extends js.Object {
    var VirtualMFADevice: js.UndefOr[VirtualMFADevice]
  }

  object CreateVirtualMFADeviceResponse {
    def apply(
      VirtualMFADevice: js.UndefOr[VirtualMFADevice] = js.undefined): CreateVirtualMFADeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VirtualMFADevice" -> VirtualMFADevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualMFADeviceResponse]
    }
  }

  @js.native
  trait DeactivateMFADeviceRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var SerialNumber: js.UndefOr[serialNumberType]
  }

  object DeactivateMFADeviceRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined): DeactivateMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeactivateMFADeviceRequest]
    }
  }

  @js.native
  trait DeleteAccessKeyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var AccessKeyId: js.UndefOr[accessKeyIdType]
  }

  object DeleteAccessKeyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined): DeleteAccessKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccessKeyRequest]
    }
  }

  @js.native
  trait DeleteAccountAliasRequest extends js.Object {
    var AccountAlias: js.UndefOr[accountAliasType]
  }

  object DeleteAccountAliasRequest {
    def apply(
      AccountAlias: js.UndefOr[accountAliasType] = js.undefined): DeleteAccountAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountAlias" -> AccountAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountAliasRequest]
    }
  }

  @js.native
  trait DeleteGroupPolicyRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object DeleteGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined): DeleteGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupPolicyRequest]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
  }

  object DeleteGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteInstanceProfileRequest extends js.Object {
    var InstanceProfileName: js.UndefOr[instanceProfileNameType]
  }

  object DeleteInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined): DeleteInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfileName" -> InstanceProfileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceProfileRequest]
    }
  }

  @js.native
  trait DeleteLoginProfileRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
  }

  object DeleteLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined): DeleteLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoginProfileRequest]
    }
  }

  @js.native
  trait DeleteOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
  }

  object DeleteOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined): DeleteOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
  }

  object DeletePolicyRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DeletePolicyVersionRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var VersionId: js.UndefOr[policyVersionIdType]
  }

  object DeletePolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined): DeletePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  @js.native
  trait DeleteRolePermissionsBoundaryRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
  }

  object DeleteRolePermissionsBoundaryRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined): DeleteRolePermissionsBoundaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRolePermissionsBoundaryRequest]
    }
  }

  @js.native
  trait DeleteRolePolicyRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object DeleteRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined): DeleteRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRolePolicyRequest]
    }
  }

  @js.native
  trait DeleteRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
  }

  object DeleteRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined): DeleteRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoleRequest]
    }
  }

  @js.native
  trait DeleteSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object DeleteSAMLProviderRequest {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined): DeleteSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLProviderArn" -> SAMLProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSAMLProviderRequest]
    }
  }

  @js.native
  trait DeleteSSHPublicKeyRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SSHPublicKeyId: js.UndefOr[publicKeyIdType]
  }

  object DeleteSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined): DeleteSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyId" -> SSHPublicKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSSHPublicKeyRequest]
    }
  }

  @js.native
  trait DeleteServerCertificateRequest extends js.Object {
    var ServerCertificateName: js.UndefOr[serverCertificateNameType]
  }

  object DeleteServerCertificateRequest {
    def apply(
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined): DeleteServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificateName" -> ServerCertificateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerCertificateRequest]
    }
  }

  @js.native
  trait DeleteServiceLinkedRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
  }

  object DeleteServiceLinkedRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined): DeleteServiceLinkedRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceLinkedRoleRequest]
    }
  }

  @js.native
  trait DeleteServiceLinkedRoleResponse extends js.Object {
    var DeletionTaskId: js.UndefOr[DeletionTaskIdType]
  }

  object DeleteServiceLinkedRoleResponse {
    def apply(
      DeletionTaskId: js.UndefOr[DeletionTaskIdType] = js.undefined): DeleteServiceLinkedRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionTaskId" -> DeletionTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceLinkedRoleResponse]
    }
  }

  @js.native
  trait DeleteServiceSpecificCredentialRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId]
  }

  object DeleteServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined): DeleteServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait DeleteSigningCertificateRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var CertificateId: js.UndefOr[certificateIdType]
  }

  object DeleteSigningCertificateRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      CertificateId: js.UndefOr[certificateIdType] = js.undefined): DeleteSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "CertificateId" -> CertificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSigningCertificateRequest]
    }
  }

  @js.native
  trait DeleteUserPermissionsBoundaryRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
  }

  object DeleteUserPermissionsBoundaryRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined): DeleteUserPermissionsBoundaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPermissionsBoundaryRequest]
    }
  }

  @js.native
  trait DeleteUserPolicyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object DeleteUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined): DeleteUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPolicyRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
  }

  object DeleteUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteVirtualMFADeviceRequest extends js.Object {
    var SerialNumber: js.UndefOr[serialNumberType]
  }

  object DeleteVirtualMFADeviceRequest {
    def apply(
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined): DeleteVirtualMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualMFADeviceRequest]
    }
  }

  /**
   * <p>The reason that the service-linked role deletion failed.</p> <p>This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.</p>
   */
  @js.native
  trait DeletionTaskFailureReasonType extends js.Object {
    var Reason: js.UndefOr[ReasonType]
    var RoleUsageList: js.UndefOr[RoleUsageListType]
  }

  object DeletionTaskFailureReasonType {
    def apply(
      Reason: js.UndefOr[ReasonType] = js.undefined,
      RoleUsageList: js.UndefOr[RoleUsageListType] = js.undefined): DeletionTaskFailureReasonType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "RoleUsageList" -> RoleUsageList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletionTaskFailureReasonType]
    }
  }

  object DeletionTaskStatusTypeEnum {
    val SUCCEEDED = "SUCCEEDED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED = "FAILED"
    val NOT_STARTED = "NOT_STARTED"

    val values = IndexedSeq(SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED)
  }

  @js.native
  trait DetachGroupPolicyRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object DetachGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): DetachGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachGroupPolicyRequest]
    }
  }

  @js.native
  trait DetachRolePolicyRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object DetachRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): DetachRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachRolePolicyRequest]
    }
  }

  @js.native
  trait DetachUserPolicyRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var PolicyArn: js.UndefOr[arnType]
  }

  object DetachUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined): DetachUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachUserPolicyRequest]
    }
  }

  @js.native
  trait EnableMFADeviceRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var AuthenticationCode1: js.UndefOr[authenticationCodeType]
    var AuthenticationCode2: js.UndefOr[authenticationCodeType]
  }

  object EnableMFADeviceRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      AuthenticationCode1: js.UndefOr[authenticationCodeType] = js.undefined,
      AuthenticationCode2: js.UndefOr[authenticationCodeType] = js.undefined): EnableMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationCode1" -> AuthenticationCode1.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationCode2" -> AuthenticationCode2.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableMFADeviceRequest]
    }
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
    var OrganizationsDecisionDetail: js.UndefOr[OrganizationsDecisionDetail]
    var EvalActionName: js.UndefOr[ActionNameType]
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType]
    var EvalResourceName: js.UndefOr[ResourceNameType]
    var EvalDecision: js.UndefOr[PolicyEvaluationDecisionType]
    var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType]
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType]
    var MatchedStatements: js.UndefOr[StatementListType]
  }

  object EvaluationResult {
    def apply(
      OrganizationsDecisionDetail: js.UndefOr[OrganizationsDecisionDetail] = js.undefined,
      EvalActionName: js.UndefOr[ActionNameType] = js.undefined,
      MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined,
      EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined,
      EvalDecision: js.UndefOr[PolicyEvaluationDecisionType] = js.undefined,
      ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.undefined,
      EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined,
      MatchedStatements: js.UndefOr[StatementListType] = js.undefined): EvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationsDecisionDetail" -> OrganizationsDecisionDetail.map { x => x.asInstanceOf[js.Any] },
        "EvalActionName" -> EvalActionName.map { x => x.asInstanceOf[js.Any] },
        "MissingContextValues" -> MissingContextValues.map { x => x.asInstanceOf[js.Any] },
        "EvalResourceName" -> EvalResourceName.map { x => x.asInstanceOf[js.Any] },
        "EvalDecision" -> EvalDecision.map { x => x.asInstanceOf[js.Any] },
        "ResourceSpecificResults" -> ResourceSpecificResults.map { x => x.asInstanceOf[js.Any] },
        "EvalDecisionDetails" -> EvalDecisionDetails.map { x => x.asInstanceOf[js.Any] },
        "MatchedStatements" -> MatchedStatements.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResult]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GenerateCredentialReport</a> request. </p>
   */
  @js.native
  trait GenerateCredentialReportResponse extends js.Object {
    var State: js.UndefOr[ReportStateType]
    var Description: js.UndefOr[ReportStateDescriptionType]
  }

  object GenerateCredentialReportResponse {
    def apply(
      State: js.UndefOr[ReportStateType] = js.undefined,
      Description: js.UndefOr[ReportStateDescriptionType] = js.undefined): GenerateCredentialReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateCredentialReportResponse]
    }
  }

  @js.native
  trait GetAccessKeyLastUsedRequest extends js.Object {
    var AccessKeyId: js.UndefOr[accessKeyIdType]
  }

  object GetAccessKeyLastUsedRequest {
    def apply(
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined): GetAccessKeyLastUsedRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccessKeyLastUsedRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccessKeyLastUsed</a> request. It is also returned as a member of the <a>AccessKeyMetaData</a> structure returned by the <a>ListAccessKeys</a> action.</p>
   */
  @js.native
  trait GetAccessKeyLastUsedResponse extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed]
  }

  object GetAccessKeyLastUsedResponse {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed] = js.undefined): GetAccessKeyLastUsedResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AccessKeyLastUsed" -> AccessKeyLastUsed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccessKeyLastUsedResponse]
    }
  }

  @js.native
  trait GetAccountAuthorizationDetailsRequest extends js.Object {
    var Filter: js.UndefOr[entityListType]
    var MaxItems: js.UndefOr[maxItemsType]
    var Marker: js.UndefOr[markerType]
  }

  object GetAccountAuthorizationDetailsRequest {
    def apply(
      Filter: js.UndefOr[entityListType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): GetAccountAuthorizationDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountAuthorizationDetailsRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccountAuthorizationDetails</a> request. </p>
   */
  @js.native
  trait GetAccountAuthorizationDetailsResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var UserDetailList: js.UndefOr[userDetailListType]
    var Policies: js.UndefOr[ManagedPolicyDetailListType]
    var RoleDetailList: js.UndefOr[roleDetailListType]
    var GroupDetailList: js.UndefOr[groupDetailListType]
    var Marker: js.UndefOr[markerType]
  }

  object GetAccountAuthorizationDetailsResponse {
    def apply(
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      UserDetailList: js.UndefOr[userDetailListType] = js.undefined,
      Policies: js.UndefOr[ManagedPolicyDetailListType] = js.undefined,
      RoleDetailList: js.UndefOr[roleDetailListType] = js.undefined,
      GroupDetailList: js.UndefOr[groupDetailListType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): GetAccountAuthorizationDetailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "UserDetailList" -> UserDetailList.map { x => x.asInstanceOf[js.Any] },
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "RoleDetailList" -> RoleDetailList.map { x => x.asInstanceOf[js.Any] },
        "GroupDetailList" -> GroupDetailList.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountAuthorizationDetailsResponse]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccountPasswordPolicy</a> request. </p>
   */
  @js.native
  trait GetAccountPasswordPolicyResponse extends js.Object {
    var PasswordPolicy: js.UndefOr[PasswordPolicy]
  }

  object GetAccountPasswordPolicyResponse {
    def apply(
      PasswordPolicy: js.UndefOr[PasswordPolicy] = js.undefined): GetAccountPasswordPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordPolicy" -> PasswordPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountPasswordPolicyResponse]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetAccountSummary</a> request. </p>
   */
  @js.native
  trait GetAccountSummaryResponse extends js.Object {
    var SummaryMap: js.UndefOr[summaryMapType]
  }

  object GetAccountSummaryResponse {
    def apply(
      SummaryMap: js.UndefOr[summaryMapType] = js.undefined): GetAccountSummaryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SummaryMap" -> SummaryMap.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSummaryResponse]
    }
  }

  @js.native
  trait GetContextKeysForCustomPolicyRequest extends js.Object {
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
  }

  object GetContextKeysForCustomPolicyRequest {
    def apply(
      PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined): GetContextKeysForCustomPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyInputList" -> PolicyInputList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContextKeysForCustomPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a> or <a>GetContextKeysForCustomPolicy</a> request. </p>
   */
  @js.native
  trait GetContextKeysForPolicyResponse extends js.Object {
    var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType]
  }

  object GetContextKeysForPolicyResponse {
    def apply(
      ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.undefined): GetContextKeysForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContextKeyNames" -> ContextKeyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContextKeysForPolicyResponse]
    }
  }

  @js.native
  trait GetContextKeysForPrincipalPolicyRequest extends js.Object {
    var PolicySourceArn: js.UndefOr[arnType]
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
  }

  object GetContextKeysForPrincipalPolicyRequest {
    def apply(
      PolicySourceArn: js.UndefOr[arnType] = js.undefined,
      PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined): GetContextKeysForPrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicySourceArn" -> PolicySourceArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyInputList" -> PolicyInputList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContextKeysForPrincipalPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetCredentialReport</a> request. </p>
   */
  @js.native
  trait GetCredentialReportResponse extends js.Object {
    var Content: js.UndefOr[ReportContentType]
    var ReportFormat: js.UndefOr[ReportFormatType]
    var GeneratedTime: js.UndefOr[dateType]
  }

  object GetCredentialReportResponse {
    def apply(
      Content: js.UndefOr[ReportContentType] = js.undefined,
      ReportFormat: js.UndefOr[ReportFormatType] = js.undefined,
      GeneratedTime: js.UndefOr[dateType] = js.undefined): GetCredentialReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "ReportFormat" -> ReportFormat.map { x => x.asInstanceOf[js.Any] },
        "GeneratedTime" -> GeneratedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCredentialReportResponse]
    }
  }

  @js.native
  trait GetGroupPolicyRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object GetGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined): GetGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetGroupPolicy</a> request. </p>
   */
  @js.native
  trait GetGroupPolicyResponse extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object GetGroupPolicyResponse {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): GetGroupPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupPolicyResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object GetGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): GetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetGroup</a> request. </p>
   */
  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var Users: js.UndefOr[userListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object GetGroupResponse {
    def apply(
      Group: js.UndefOr[Group] = js.undefined,
      Users: js.UndefOr[userListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): GetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetInstanceProfileRequest extends js.Object {
    var InstanceProfileName: js.UndefOr[instanceProfileNameType]
  }

  object GetInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined): GetInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfileName" -> InstanceProfileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetInstanceProfile</a> request. </p>
   */
  @js.native
  trait GetInstanceProfileResponse extends js.Object {
    var InstanceProfile: js.UndefOr[InstanceProfile]
  }

  object GetInstanceProfileResponse {
    def apply(
      InstanceProfile: js.UndefOr[InstanceProfile] = js.undefined): GetInstanceProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfile" -> InstanceProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceProfileResponse]
    }
  }

  @js.native
  trait GetLoginProfileRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
  }

  object GetLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined): GetLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoginProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetLoginProfile</a> request. </p>
   */
  @js.native
  trait GetLoginProfileResponse extends js.Object {
    var LoginProfile: js.UndefOr[LoginProfile]
  }

  object GetLoginProfileResponse {
    def apply(
      LoginProfile: js.UndefOr[LoginProfile] = js.undefined): GetLoginProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoginProfile" -> LoginProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoginProfileResponse]
    }
  }

  @js.native
  trait GetOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
  }

  object GetOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined): GetOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIDConnectProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetOpenIDConnectProvider</a> request. </p>
   */
  @js.native
  trait GetOpenIDConnectProviderResponse extends js.Object {
    var Url: js.UndefOr[OpenIDConnectProviderUrlType]
    var ClientIDList: js.UndefOr[clientIDListType]
    var ThumbprintList: js.UndefOr[thumbprintListType]
    var CreateDate: js.UndefOr[dateType]
  }

  object GetOpenIDConnectProviderResponse {
    def apply(
      Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined,
      ClientIDList: js.UndefOr[clientIDListType] = js.undefined,
      ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined): GetOpenIDConnectProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "ClientIDList" -> ClientIDList.map { x => x.asInstanceOf[js.Any] },
        "ThumbprintList" -> ThumbprintList.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIDConnectProviderResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
  }

  object GetPolicyRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetPolicy</a> request. </p>
   */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetPolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait GetPolicyVersionRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var VersionId: js.UndefOr[policyVersionIdType]
  }

  object GetPolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined): GetPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetPolicyVersion</a> request. </p>
   */
  @js.native
  trait GetPolicyVersionResponse extends js.Object {
    var PolicyVersion: js.UndefOr[PolicyVersion]
  }

  object GetPolicyVersionResponse {
    def apply(
      PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined): GetPolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyVersion" -> PolicyVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionResponse]
    }
  }

  @js.native
  trait GetRolePolicyRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object GetRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined): GetRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRolePolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetRolePolicy</a> request. </p>
   */
  @js.native
  trait GetRolePolicyResponse extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object GetRolePolicyResponse {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): GetRolePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRolePolicyResponse]
    }
  }

  @js.native
  trait GetRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
  }

  object GetRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined): GetRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetRole</a> request. </p>
   */
  @js.native
  trait GetRoleResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  object GetRoleResponse {
    def apply(
      Role: js.UndefOr[Role] = js.undefined): GetRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoleResponse]
    }
  }

  @js.native
  trait GetSAMLProviderRequest extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object GetSAMLProviderRequest {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined): GetSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLProviderArn" -> SAMLProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSAMLProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetSAMLProvider</a> request. </p>
   */
  @js.native
  trait GetSAMLProviderResponse extends js.Object {
    var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType]
    var CreateDate: js.UndefOr[dateType]
    var ValidUntil: js.UndefOr[dateType]
  }

  object GetSAMLProviderResponse {
    def apply(
      SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      ValidUntil: js.UndefOr[dateType] = js.undefined): GetSAMLProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLMetadataDocument" -> SAMLMetadataDocument.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSAMLProviderResponse]
    }
  }

  @js.native
  trait GetSSHPublicKeyRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SSHPublicKeyId: js.UndefOr[publicKeyIdType]
    var Encoding: js.UndefOr[encodingType]
  }

  object GetSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Encoding: js.UndefOr[encodingType] = js.undefined): GetSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyId" -> SSHPublicKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encoding" -> Encoding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSSHPublicKeyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetSSHPublicKey</a> request.</p>
   */
  @js.native
  trait GetSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: js.UndefOr[SSHPublicKey]
  }

  object GetSSHPublicKeyResponse {
    def apply(
      SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined): GetSSHPublicKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSHPublicKey" -> SSHPublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSSHPublicKeyResponse]
    }
  }

  @js.native
  trait GetServerCertificateRequest extends js.Object {
    var ServerCertificateName: js.UndefOr[serverCertificateNameType]
  }

  object GetServerCertificateRequest {
    def apply(
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined): GetServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificateName" -> ServerCertificateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServerCertificateRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetServerCertificate</a> request. </p>
   */
  @js.native
  trait GetServerCertificateResponse extends js.Object {
    var ServerCertificate: js.UndefOr[ServerCertificate]
  }

  object GetServerCertificateResponse {
    def apply(
      ServerCertificate: js.UndefOr[ServerCertificate] = js.undefined): GetServerCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificate" -> ServerCertificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServerCertificateResponse]
    }
  }

  @js.native
  trait GetServiceLinkedRoleDeletionStatusRequest extends js.Object {
    var DeletionTaskId: js.UndefOr[DeletionTaskIdType]
  }

  object GetServiceLinkedRoleDeletionStatusRequest {
    def apply(
      DeletionTaskId: js.UndefOr[DeletionTaskIdType] = js.undefined): GetServiceLinkedRoleDeletionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionTaskId" -> DeletionTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceLinkedRoleDeletionStatusRequest]
    }
  }

  @js.native
  trait GetServiceLinkedRoleDeletionStatusResponse extends js.Object {
    var Status: js.UndefOr[DeletionTaskStatusType]
    var Reason: js.UndefOr[DeletionTaskFailureReasonType]
  }

  object GetServiceLinkedRoleDeletionStatusResponse {
    def apply(
      Status: js.UndefOr[DeletionTaskStatusType] = js.undefined,
      Reason: js.UndefOr[DeletionTaskFailureReasonType] = js.undefined): GetServiceLinkedRoleDeletionStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceLinkedRoleDeletionStatusResponse]
    }
  }

  @js.native
  trait GetUserPolicyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var PolicyName: js.UndefOr[policyNameType]
  }

  object GetUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined): GetUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetUserPolicy</a> request. </p>
   */
  @js.native
  trait GetUserPolicyResponse extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object GetUserPolicyResponse {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): GetUserPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPolicyResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
  }

  object GetUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined): GetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetUser</a> request. </p>
   */
  @js.native
  trait GetUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  /**
   * <p>Contains information about an IAM group entity.</p> <p>This data type is used as a response element in the following operations:</p> <ul> <li> <p> <a>CreateGroup</a> </p> </li> <li> <p> <a>GetGroup</a> </p> </li> <li> <p> <a>ListGroups</a> </p> </li> </ul>
   */
  @js.native
  trait Group extends js.Object {
    var Path: js.UndefOr[pathType]
    var GroupName: js.UndefOr[groupNameType]
    var GroupId: js.UndefOr[idType]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
  }

  object Group {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      GroupId: js.UndefOr[idType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
   * <p>Contains information about an IAM group, including all of the group's policies.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>
   */
  @js.native
  trait GroupDetail extends js.Object {
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var Path: js.UndefOr[pathType]
    var GroupName: js.UndefOr[groupNameType]
    var GroupId: js.UndefOr[idType]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var GroupPolicyList: js.UndefOr[policyDetailListType]
  }

  object GroupDetail {
    def apply(
      AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      GroupId: js.UndefOr[idType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      GroupPolicyList: js.UndefOr[policyDetailListType] = js.undefined): GroupDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedManagedPolicies" -> AttachedManagedPolicies.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "GroupPolicyList" -> GroupPolicyList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupDetail]
    }
  }

  /**
   * <p>Contains information about an instance profile.</p> <p>This data type is used as a response element in the following operations:</p> <ul> <li> <p> <a>CreateInstanceProfile</a> </p> </li> <li> <p> <a>GetInstanceProfile</a> </p> </li> <li> <p> <a>ListInstanceProfiles</a> </p> </li> <li> <p> <a>ListInstanceProfilesForRole</a> </p> </li> </ul>
   */
  @js.native
  trait InstanceProfile extends js.Object {
    var Path: js.UndefOr[pathType]
    var InstanceProfileName: js.UndefOr[instanceProfileNameType]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var InstanceProfileId: js.UndefOr[idType]
    var Roles: js.UndefOr[roleListType]
  }

  object InstanceProfile {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      InstanceProfileId: js.UndefOr[idType] = js.undefined,
      Roles: js.UndefOr[roleListType] = js.undefined): InstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "InstanceProfileName" -> InstanceProfileName.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "InstanceProfileId" -> InstanceProfileId.map { x => x.asInstanceOf[js.Any] },
        "Roles" -> Roles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceProfile]
    }
  }

  @js.native
  trait ListAccessKeysRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListAccessKeysRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListAccessKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccessKeysRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAccessKeys</a> request. </p>
   */
  @js.native
  trait ListAccessKeysResponse extends js.Object {
    var AccessKeyMetadata: js.UndefOr[accessKeyMetadataListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListAccessKeysResponse {
    def apply(
      AccessKeyMetadata: js.UndefOr[accessKeyMetadataListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListAccessKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyMetadata" -> AccessKeyMetadata.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccessKeysResponse]
    }
  }

  @js.native
  trait ListAccountAliasesRequest extends js.Object {
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListAccountAliasesRequest {
    def apply(
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListAccountAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountAliasesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAccountAliases</a> request. </p>
   */
  @js.native
  trait ListAccountAliasesResponse extends js.Object {
    var AccountAliases: js.UndefOr[accountAliasListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListAccountAliasesResponse {
    def apply(
      AccountAliases: js.UndefOr[accountAliasListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListAccountAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountAliases" -> AccountAliases.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountAliasesResponse]
    }
  }

  @js.native
  trait ListAttachedGroupPoliciesRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PathPrefix: js.UndefOr[policyPathType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListAttachedGroupPoliciesRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListAttachedGroupPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedGroupPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAttachedGroupPolicies</a> request. </p>
   */
  @js.native
  trait ListAttachedGroupPoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListAttachedGroupPoliciesResponse {
    def apply(
      AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListAttachedGroupPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicies" -> AttachedPolicies.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedGroupPoliciesResponse]
    }
  }

  @js.native
  trait ListAttachedRolePoliciesRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PathPrefix: js.UndefOr[policyPathType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListAttachedRolePoliciesRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListAttachedRolePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedRolePoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAttachedRolePolicies</a> request. </p>
   */
  @js.native
  trait ListAttachedRolePoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListAttachedRolePoliciesResponse {
    def apply(
      AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListAttachedRolePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicies" -> AttachedPolicies.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedRolePoliciesResponse]
    }
  }

  @js.native
  trait ListAttachedUserPoliciesRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var PathPrefix: js.UndefOr[policyPathType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListAttachedUserPoliciesRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListAttachedUserPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedUserPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListAttachedUserPolicies</a> request. </p>
   */
  @js.native
  trait ListAttachedUserPoliciesResponse extends js.Object {
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListAttachedUserPoliciesResponse {
    def apply(
      AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListAttachedUserPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicies" -> AttachedPolicies.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedUserPoliciesResponse]
    }
  }

  @js.native
  trait ListEntitiesForPolicyRequest extends js.Object {
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType]
    var MaxItems: js.UndefOr[maxItemsType]
    var EntityFilter: js.UndefOr[EntityType]
    var PolicyArn: js.UndefOr[arnType]
    var PathPrefix: js.UndefOr[pathType]
    var Marker: js.UndefOr[markerType]
  }

  object ListEntitiesForPolicyRequest {
    def apply(
      PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      EntityFilter: js.UndefOr[EntityType] = js.undefined,
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      PathPrefix: js.UndefOr[pathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListEntitiesForPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyUsageFilter" -> PolicyUsageFilter.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "EntityFilter" -> EntityFilter.map { x => x.asInstanceOf[js.Any] },
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] },
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitiesForPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListEntitiesForPolicy</a> request. </p>
   */
  @js.native
  trait ListEntitiesForPolicyResponse extends js.Object {
    var IsTruncated: js.UndefOr[booleanType]
    var PolicyRoles: js.UndefOr[PolicyRoleListType]
    var PolicyGroups: js.UndefOr[PolicyGroupListType]
    var PolicyUsers: js.UndefOr[PolicyUserListType]
    var Marker: js.UndefOr[markerType]
  }

  object ListEntitiesForPolicyResponse {
    def apply(
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      PolicyRoles: js.UndefOr[PolicyRoleListType] = js.undefined,
      PolicyGroups: js.UndefOr[PolicyGroupListType] = js.undefined,
      PolicyUsers: js.UndefOr[PolicyUserListType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListEntitiesForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "PolicyRoles" -> PolicyRoles.map { x => x.asInstanceOf[js.Any] },
        "PolicyGroups" -> PolicyGroups.map { x => x.asInstanceOf[js.Any] },
        "PolicyUsers" -> PolicyUsers.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitiesForPolicyResponse]
    }
  }

  @js.native
  trait ListGroupPoliciesRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListGroupPoliciesRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListGroupPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListGroupPolicies</a> request. </p>
   */
  @js.native
  trait ListGroupPoliciesResponse extends js.Object {
    var PolicyNames: js.UndefOr[policyNameListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListGroupPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[policyNameListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListGroupPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupPoliciesResponse]
    }
  }

  @js.native
  trait ListGroupsForUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListGroupsForUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListGroupsForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsForUserRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListGroupsForUser</a> request. </p>
   */
  @js.native
  trait ListGroupsForUserResponse extends js.Object {
    var Groups: js.UndefOr[groupListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListGroupsForUserResponse {
    def apply(
      Groups: js.UndefOr[groupListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListGroupsForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsForUserResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var PathPrefix: js.UndefOr[pathPrefixType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListGroupsRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListGroups</a> request. </p>
   */
  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[groupListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListGroupsResponse {
    def apply(
      Groups: js.UndefOr[groupListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListInstanceProfilesForRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListInstanceProfilesForRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListInstanceProfilesForRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesForRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListInstanceProfilesForRole</a> request. </p>
   */
  @js.native
  trait ListInstanceProfilesForRoleResponse extends js.Object {
    var InstanceProfiles: js.UndefOr[instanceProfileListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListInstanceProfilesForRoleResponse {
    def apply(
      InstanceProfiles: js.UndefOr[instanceProfileListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListInstanceProfilesForRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfiles" -> InstanceProfiles.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesForRoleResponse]
    }
  }

  @js.native
  trait ListInstanceProfilesRequest extends js.Object {
    var PathPrefix: js.UndefOr[pathPrefixType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListInstanceProfilesRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListInstanceProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListInstanceProfiles</a> request. </p>
   */
  @js.native
  trait ListInstanceProfilesResponse extends js.Object {
    var InstanceProfiles: js.UndefOr[instanceProfileListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListInstanceProfilesResponse {
    def apply(
      InstanceProfiles: js.UndefOr[instanceProfileListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListInstanceProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfiles" -> InstanceProfiles.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesResponse]
    }
  }

  @js.native
  trait ListMFADevicesRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListMFADevicesRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListMFADevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMFADevicesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListMFADevices</a> request. </p>
   */
  @js.native
  trait ListMFADevicesResponse extends js.Object {
    var MFADevices: js.UndefOr[mfaDeviceListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListMFADevicesResponse {
    def apply(
      MFADevices: js.UndefOr[mfaDeviceListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListMFADevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MFADevices" -> MFADevices.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMFADevicesResponse]
    }
  }

  @js.native
  trait ListOpenIDConnectProvidersRequest extends js.Object {

  }

  object ListOpenIDConnectProvidersRequest {
    def apply(): ListOpenIDConnectProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenIDConnectProvidersRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListOpenIDConnectProviders</a> request. </p>
   */
  @js.native
  trait ListOpenIDConnectProvidersResponse extends js.Object {
    var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType]
  }

  object ListOpenIDConnectProvidersResponse {
    def apply(
      OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.undefined): ListOpenIDConnectProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderList" -> OpenIDConnectProviderList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenIDConnectProvidersResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var Scope: js.UndefOr[policyScopeType]
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType]
    var MaxItems: js.UndefOr[maxItemsType]
    var OnlyAttached: js.UndefOr[booleanType]
    var PathPrefix: js.UndefOr[policyPathType]
    var Marker: js.UndefOr[markerType]
  }

  object ListPoliciesRequest {
    def apply(
      Scope: js.UndefOr[policyScopeType] = js.undefined,
      PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined,
      OnlyAttached: js.UndefOr[booleanType] = js.undefined,
      PathPrefix: js.UndefOr[policyPathType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "PolicyUsageFilter" -> PolicyUsageFilter.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "OnlyAttached" -> OnlyAttached.map { x => x.asInstanceOf[js.Any] },
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListPolicies</a> request. </p>
   */
  @js.native
  trait ListPoliciesResponse extends js.Object {
    var Policies: js.UndefOr[policyListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListPoliciesResponse {
    def apply(
      Policies: js.UndefOr[policyListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListPolicyVersionsRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListPolicyVersionsRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListPolicyVersions</a> request. </p>
   */
  @js.native
  trait ListPolicyVersionsResponse extends js.Object {
    var Versions: js.UndefOr[policyDocumentVersionListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListPolicyVersionsResponse {
    def apply(
      Versions: js.UndefOr[policyDocumentVersionListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Versions" -> Versions.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsResponse]
    }
  }

  @js.native
  trait ListRolePoliciesRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListRolePoliciesRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListRolePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolePoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListRolePolicies</a> request. </p>
   */
  @js.native
  trait ListRolePoliciesResponse extends js.Object {
    var PolicyNames: js.UndefOr[policyNameListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListRolePoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[policyNameListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListRolePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolePoliciesResponse]
    }
  }

  @js.native
  trait ListRoleTagsRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListRoleTagsRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListRoleTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoleTagsRequest]
    }
  }

  @js.native
  trait ListRoleTagsResponse extends js.Object {
    var Tags: js.UndefOr[tagListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListRoleTagsResponse {
    def apply(
      Tags: js.UndefOr[tagListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListRoleTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoleTagsResponse]
    }
  }

  @js.native
  trait ListRolesRequest extends js.Object {
    var PathPrefix: js.UndefOr[pathPrefixType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListRolesRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListRolesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListRoles</a> request. </p>
   */
  @js.native
  trait ListRolesResponse extends js.Object {
    var Roles: js.UndefOr[roleListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListRolesResponse {
    def apply(
      Roles: js.UndefOr[roleListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListRolesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Roles" -> Roles.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRolesResponse]
    }
  }

  @js.native
  trait ListSAMLProvidersRequest extends js.Object {

  }

  object ListSAMLProvidersRequest {
    def apply(): ListSAMLProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSAMLProvidersRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListSAMLProviders</a> request. </p>
   */
  @js.native
  trait ListSAMLProvidersResponse extends js.Object {
    var SAMLProviderList: js.UndefOr[SAMLProviderListType]
  }

  object ListSAMLProvidersResponse {
    def apply(
      SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.undefined): ListSAMLProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLProviderList" -> SAMLProviderList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSAMLProvidersResponse]
    }
  }

  @js.native
  trait ListSSHPublicKeysRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListSSHPublicKeysRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListSSHPublicKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSSHPublicKeysRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListSSHPublicKeys</a> request.</p>
   */
  @js.native
  trait ListSSHPublicKeysResponse extends js.Object {
    var SSHPublicKeys: js.UndefOr[SSHPublicKeyListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListSSHPublicKeysResponse {
    def apply(
      SSHPublicKeys: js.UndefOr[SSHPublicKeyListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListSSHPublicKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSHPublicKeys" -> SSHPublicKeys.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSSHPublicKeysResponse]
    }
  }

  @js.native
  trait ListServerCertificatesRequest extends js.Object {
    var PathPrefix: js.UndefOr[pathPrefixType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListServerCertificatesRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListServerCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerCertificatesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListServerCertificates</a> request. </p>
   */
  @js.native
  trait ListServerCertificatesResponse extends js.Object {
    var ServerCertificateMetadataList: js.UndefOr[serverCertificateMetadataListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListServerCertificatesResponse {
    def apply(
      ServerCertificateMetadataList: js.UndefOr[serverCertificateMetadataListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListServerCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificateMetadataList" -> ServerCertificateMetadataList.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerCertificatesResponse]
    }
  }

  @js.native
  trait ListServiceSpecificCredentialsRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var ServiceName: js.UndefOr[serviceName]
  }

  object ListServiceSpecificCredentialsRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined): ListServiceSpecificCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceSpecificCredentialsRequest]
    }
  }

  @js.native
  trait ListServiceSpecificCredentialsResponse extends js.Object {
    var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType]
  }

  object ListServiceSpecificCredentialsResponse {
    def apply(
      ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.undefined): ListServiceSpecificCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceSpecificCredentials" -> ServiceSpecificCredentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceSpecificCredentialsResponse]
    }
  }

  @js.native
  trait ListSigningCertificatesRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListSigningCertificatesRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListSigningCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningCertificatesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListSigningCertificates</a> request. </p>
   */
  @js.native
  trait ListSigningCertificatesResponse extends js.Object {
    var Certificates: js.UndefOr[certificateListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListSigningCertificatesResponse {
    def apply(
      Certificates: js.UndefOr[certificateListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListSigningCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningCertificatesResponse]
    }
  }

  @js.native
  trait ListUserPoliciesRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListUserPoliciesRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListUserPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoliciesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListUserPolicies</a> request. </p>
   */
  @js.native
  trait ListUserPoliciesResponse extends js.Object {
    var PolicyNames: js.UndefOr[policyNameListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListUserPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[policyNameListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListUserPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoliciesResponse]
    }
  }

  @js.native
  trait ListUserTagsRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListUserTagsRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListUserTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserTagsRequest]
    }
  }

  @js.native
  trait ListUserTagsResponse extends js.Object {
    var Tags: js.UndefOr[tagListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListUserTagsResponse {
    def apply(
      Tags: js.UndefOr[tagListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListUserTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserTagsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var PathPrefix: js.UndefOr[pathPrefixType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListUsersRequest {
    def apply(
      PathPrefix: js.UndefOr[pathPrefixType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathPrefix" -> PathPrefix.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListUsers</a> request. </p>
   */
  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: js.UndefOr[userListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListUsersResponse {
    def apply(
      Users: js.UndefOr[userListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait ListVirtualMFADevicesRequest extends js.Object {
    var AssignmentStatus: js.UndefOr[assignmentStatusType]
    var Marker: js.UndefOr[markerType]
    var MaxItems: js.UndefOr[maxItemsType]
  }

  object ListVirtualMFADevicesRequest {
    def apply(
      AssignmentStatus: js.UndefOr[assignmentStatusType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined,
      MaxItems: js.UndefOr[maxItemsType] = js.undefined): ListVirtualMFADevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentStatus" -> AssignmentStatus.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualMFADevicesRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>ListVirtualMFADevices</a> request. </p>
   */
  @js.native
  trait ListVirtualMFADevicesResponse extends js.Object {
    var VirtualMFADevices: js.UndefOr[virtualMFADeviceListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object ListVirtualMFADevicesResponse {
    def apply(
      VirtualMFADevices: js.UndefOr[virtualMFADeviceListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): ListVirtualMFADevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VirtualMFADevices" -> VirtualMFADevices.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualMFADevicesResponse]
    }
  }

  /**
   * <p>Contains the user name and password create date for a user.</p> <p> This data type is used as a response element in the <a>CreateLoginProfile</a> and <a>GetLoginProfile</a> operations. </p>
   */
  @js.native
  trait LoginProfile extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var CreateDate: js.UndefOr[dateType]
    var PasswordResetRequired: js.UndefOr[booleanType]
  }

  object LoginProfile {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      PasswordResetRequired: js.UndefOr[booleanType] = js.undefined): LoginProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "PasswordResetRequired" -> PasswordResetRequired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoginProfile]
    }
  }

  /**
   * <p>Contains information about an MFA device.</p> <p>This data type is used as a response element in the <a>ListMFADevices</a> operation.</p>
   */
  @js.native
  trait MFADevice extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var EnableDate: js.UndefOr[dateType]
  }

  object MFADevice {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      EnableDate: js.UndefOr[dateType] = js.undefined): MFADevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "EnableDate" -> EnableDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MFADevice]
    }
  }

  /**
   * <p>Contains information about a managed policy, including the policy's ARN, versions, and the number of principal entities (users, groups, and roles) that the policy is attached to.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p> <p>For more information about managed policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait ManagedPolicyDetail extends js.Object {
    var PolicyId: js.UndefOr[idType]
    var DefaultVersionId: js.UndefOr[policyVersionIdType]
    var Path: js.UndefOr[policyPathType]
    var PolicyVersionList: js.UndefOr[policyDocumentVersionListType]
    var Description: js.UndefOr[policyDescriptionType]
    var UpdateDate: js.UndefOr[dateType]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType]
    var PolicyName: js.UndefOr[policyNameType]
    var AttachmentCount: js.UndefOr[attachmentCountType]
    var IsAttachable: js.UndefOr[booleanType]
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
      PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
      IsAttachable: js.UndefOr[booleanType] = js.undefined): ManagedPolicyDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersionId" -> DefaultVersionId.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "PolicyVersionList" -> PolicyVersionList.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UpdateDate" -> UpdateDate.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundaryUsageCount" -> PermissionsBoundaryUsageCount.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "AttachmentCount" -> AttachmentCount.map { x => x.asInstanceOf[js.Any] },
        "IsAttachable" -> IsAttachable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ManagedPolicyDetail]
    }
  }

  /**
   * <p>Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.</p>
   */
  @js.native
  trait OpenIDConnectProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType]
  }

  object OpenIDConnectProviderListEntry {
    def apply(
      Arn: js.UndefOr[arnType] = js.undefined): OpenIDConnectProviderListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenIDConnectProviderListEntry]
    }
  }

  /**
   * <p>Contains information about AWS Organizations's effect on a policy simulation.</p>
   */
  @js.native
  trait OrganizationsDecisionDetail extends js.Object {
    var AllowedByOrganizations: js.UndefOr[booleanType]
  }

  object OrganizationsDecisionDetail {
    def apply(
      AllowedByOrganizations: js.UndefOr[booleanType] = js.undefined): OrganizationsDecisionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedByOrganizations" -> AllowedByOrganizations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationsDecisionDetail]
    }
  }

  /**
   * <p>Contains information about the account password policy.</p> <p> This data type is used as a response element in the <a>GetAccountPasswordPolicy</a> operation. </p>
   */
  @js.native
  trait PasswordPolicy extends js.Object {
    var ExpirePasswords: js.UndefOr[booleanType]
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType]
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType]
    var HardExpiry: js.UndefOr[booleanObjectType]
    var RequireNumbers: js.UndefOr[booleanType]
    var RequireUppercaseCharacters: js.UndefOr[booleanType]
    var AllowUsersToChangePassword: js.UndefOr[booleanType]
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType]
    var RequireSymbols: js.UndefOr[booleanType]
    var RequireLowercaseCharacters: js.UndefOr[booleanType]
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
      RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined): PasswordPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExpirePasswords" -> ExpirePasswords.map { x => x.asInstanceOf[js.Any] },
        "MinimumPasswordLength" -> MinimumPasswordLength.map { x => x.asInstanceOf[js.Any] },
        "PasswordReusePrevention" -> PasswordReusePrevention.map { x => x.asInstanceOf[js.Any] },
        "HardExpiry" -> HardExpiry.map { x => x.asInstanceOf[js.Any] },
        "RequireNumbers" -> RequireNumbers.map { x => x.asInstanceOf[js.Any] },
        "RequireUppercaseCharacters" -> RequireUppercaseCharacters.map { x => x.asInstanceOf[js.Any] },
        "AllowUsersToChangePassword" -> AllowUsersToChangePassword.map { x => x.asInstanceOf[js.Any] },
        "MaxPasswordAge" -> MaxPasswordAge.map { x => x.asInstanceOf[js.Any] },
        "RequireSymbols" -> RequireSymbols.map { x => x.asInstanceOf[js.Any] },
        "RequireLowercaseCharacters" -> RequireLowercaseCharacters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PasswordPolicy]
    }
  }

  object PermissionsBoundaryAttachmentTypeEnum {
    val PermissionsBoundaryPolicy = "PermissionsBoundaryPolicy"

    val values = IndexedSeq(PermissionsBoundaryPolicy)
  }

  /**
   * <p>Contains information about a managed policy.</p> <p>This data type is used as a response element in the <a>CreatePolicy</a>, <a>GetPolicy</a>, and <a>ListPolicies</a> operations. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait Policy extends js.Object {
    var PolicyId: js.UndefOr[idType]
    var DefaultVersionId: js.UndefOr[policyVersionIdType]
    var Path: js.UndefOr[policyPathType]
    var Description: js.UndefOr[policyDescriptionType]
    var UpdateDate: js.UndefOr[dateType]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType]
    var PolicyName: js.UndefOr[policyNameType]
    var AttachmentCount: js.UndefOr[attachmentCountType]
    var IsAttachable: js.UndefOr[booleanType]
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
      PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
      IsAttachable: js.UndefOr[booleanType] = js.undefined): Policy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersionId" -> DefaultVersionId.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UpdateDate" -> UpdateDate.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundaryUsageCount" -> PermissionsBoundaryUsageCount.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "AttachmentCount" -> AttachmentCount.map { x => x.asInstanceOf[js.Any] },
        "IsAttachable" -> IsAttachable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
    }
  }

  /**
   * <p>Contains information about an IAM policy, including the policy document.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>
   */
  @js.native
  trait PolicyDetail extends js.Object {
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object PolicyDetail {
    def apply(
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): PolicyDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Contains information about a group that a managed policy is attached to.</p> <p>This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyGroup extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var GroupId: js.UndefOr[idType]
  }

  object PolicyGroup {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      GroupId: js.UndefOr[idType] = js.undefined): PolicyGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyGroup]
    }
  }

  /**
   * <p>Contains information about a role that a managed policy is attached to.</p> <p>This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyRole extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var RoleId: js.UndefOr[idType]
  }

  object PolicyRole {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      RoleId: js.UndefOr[idType] = js.undefined): PolicyRole = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "RoleId" -> RoleId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity.</p> <p>For more information about permissions boundaries, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a> in the <i>IAM User Guide</i>.</p>
   */
  object PolicyUsageTypeEnum {
    val PermissionsPolicy = "PermissionsPolicy"
    val PermissionsBoundary = "PermissionsBoundary"

    val values = IndexedSeq(PermissionsPolicy, PermissionsBoundary)
  }

  /**
   * <p>Contains information about a user that a managed policy is attached to.</p> <p>This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyUser extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var UserId: js.UndefOr[idType]
  }

  object PolicyUser {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      UserId: js.UndefOr[idType] = js.undefined): PolicyUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyUser]
    }
  }

  /**
   * <p>Contains information about a version of a managed policy.</p> <p>This data type is used as a response element in the <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>, <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a> operations. </p> <p>For more information about managed policies, refer to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide. </p>
   */
  @js.native
  trait PolicyVersion extends js.Object {
    var Document: js.UndefOr[policyDocumentType]
    var VersionId: js.UndefOr[policyVersionIdType]
    var IsDefaultVersion: js.UndefOr[booleanType]
    var CreateDate: js.UndefOr[dateType]
  }

  object PolicyVersion {
    def apply(
      Document: js.UndefOr[policyDocumentType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined,
      IsDefaultVersion: js.UndefOr[booleanType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined): PolicyVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "IsDefaultVersion" -> IsDefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyVersion]
    }
  }

  /**
   * <p>Contains the row and column of a location of a <code>Statement</code> element in a policy document.</p> <p>This data type is used as a member of the <code> <a>Statement</a> </code> type.</p>
   */
  @js.native
  trait Position extends js.Object {
    var Line: js.UndefOr[LineNumber]
    var Column: js.UndefOr[ColumnNumber]
  }

  object Position {
    def apply(
      Line: js.UndefOr[LineNumber] = js.undefined,
      Column: js.UndefOr[ColumnNumber] = js.undefined): Position = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Line" -> Line.map { x => x.asInstanceOf[js.Any] },
        "Column" -> Column.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Position]
    }
  }

  @js.native
  trait PutGroupPolicyRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object PutGroupPolicyRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): PutGroupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutGroupPolicyRequest]
    }
  }

  @js.native
  trait PutRolePermissionsBoundaryRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PermissionsBoundary: js.UndefOr[arnType]
  }

  object PutRolePermissionsBoundaryRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PermissionsBoundary: js.UndefOr[arnType] = js.undefined): PutRolePermissionsBoundaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRolePermissionsBoundaryRequest]
    }
  }

  @js.native
  trait PutRolePolicyRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object PutRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): PutRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRolePolicyRequest]
    }
  }

  @js.native
  trait PutUserPermissionsBoundaryRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var PermissionsBoundary: js.UndefOr[arnType]
  }

  object PutUserPermissionsBoundaryRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      PermissionsBoundary: js.UndefOr[arnType] = js.undefined): PutUserPermissionsBoundaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutUserPermissionsBoundaryRequest]
    }
  }

  @js.native
  trait PutUserPolicyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var PolicyName: js.UndefOr[policyNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object PutUserPolicyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      PolicyName: js.UndefOr[policyNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): PutUserPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutUserPolicyRequest]
    }
  }

  @js.native
  trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
    var ClientID: js.UndefOr[clientIDType]
  }

  object RemoveClientIDFromOpenIDConnectProviderRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined,
      ClientID: js.UndefOr[clientIDType] = js.undefined): RemoveClientIDFromOpenIDConnectProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x.asInstanceOf[js.Any] },
        "ClientID" -> ClientID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveClientIDFromOpenIDConnectProviderRequest]
    }
  }

  @js.native
  trait RemoveRoleFromInstanceProfileRequest extends js.Object {
    var InstanceProfileName: js.UndefOr[instanceProfileNameType]
    var RoleName: js.UndefOr[roleNameType]
  }

  object RemoveRoleFromInstanceProfileRequest {
    def apply(
      InstanceProfileName: js.UndefOr[instanceProfileNameType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined): RemoveRoleFromInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceProfileName" -> InstanceProfileName.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveRoleFromInstanceProfileRequest]
    }
  }

  @js.native
  trait RemoveUserFromGroupRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var UserName: js.UndefOr[existingUserNameType]
  }

  object RemoveUserFromGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      UserName: js.UndefOr[existingUserNameType] = js.undefined): RemoveUserFromGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var UserName: js.UndefOr[userNameType]
    var ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId]
  }

  object ResetServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined): ResetServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait ResetServiceSpecificCredentialResponse extends js.Object {
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential]
  }

  object ResetServiceSpecificCredentialResponse {
    def apply(
      ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined): ResetServiceSpecificCredentialResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceSpecificCredential" -> ServiceSpecificCredential.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetServiceSpecificCredentialResponse]
    }
  }

  /**
   * <p>Contains the result of the simulation of a single API operation call on a single resource.</p> <p>This data type is used by a member of the <a>EvaluationResult</a> data type.</p>
   */
  @js.native
  trait ResourceSpecificResult extends js.Object {
    var EvalResourceDecision: js.UndefOr[PolicyEvaluationDecisionType]
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType]
    var EvalResourceName: js.UndefOr[ResourceNameType]
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType]
    var MatchedStatements: js.UndefOr[StatementListType]
  }

  object ResourceSpecificResult {
    def apply(
      EvalResourceDecision: js.UndefOr[PolicyEvaluationDecisionType] = js.undefined,
      MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined,
      EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined,
      EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined,
      MatchedStatements: js.UndefOr[StatementListType] = js.undefined): ResourceSpecificResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvalResourceDecision" -> EvalResourceDecision.map { x => x.asInstanceOf[js.Any] },
        "MissingContextValues" -> MissingContextValues.map { x => x.asInstanceOf[js.Any] },
        "EvalResourceName" -> EvalResourceName.map { x => x.asInstanceOf[js.Any] },
        "EvalDecisionDetails" -> EvalDecisionDetails.map { x => x.asInstanceOf[js.Any] },
        "MatchedStatements" -> MatchedStatements.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceSpecificResult]
    }
  }

  @js.native
  trait ResyncMFADeviceRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var AuthenticationCode1: js.UndefOr[authenticationCodeType]
    var AuthenticationCode2: js.UndefOr[authenticationCodeType]
  }

  object ResyncMFADeviceRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      AuthenticationCode1: js.UndefOr[authenticationCodeType] = js.undefined,
      AuthenticationCode2: js.UndefOr[authenticationCodeType] = js.undefined): ResyncMFADeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationCode1" -> AuthenticationCode1.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationCode2" -> AuthenticationCode2.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResyncMFADeviceRequest]
    }
  }

  /**
   * <p>Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.</p>
   */
  @js.native
  trait Role extends js.Object {
    var RoleId: js.UndefOr[idType]
    var Path: js.UndefOr[pathType]
    var Description: js.UndefOr[roleDescriptionType]
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var RoleName: js.UndefOr[roleNameType]
    var Tags: js.UndefOr[tagListType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
  }

  object Role {
    def apply(
      RoleId: js.UndefOr[idType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      Description: js.UndefOr[roleDescriptionType] = js.undefined,
      AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined,
      MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined): Role = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleId" -> RoleId.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "MaxSessionDuration" -> MaxSessionDuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Role]
    }
  }

  /**
   * <p>Contains information about an IAM role, including all of the role's policies.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>
   */
  @js.native
  trait RoleDetail extends js.Object {
    var RoleId: js.UndefOr[idType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var Path: js.UndefOr[pathType]
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType]
    var RolePolicyList: js.UndefOr[policyDetailListType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var RoleName: js.UndefOr[roleNameType]
    var Tags: js.UndefOr[tagListType]
    var InstanceProfileList: js.UndefOr[instanceProfileListType]
  }

  object RoleDetail {
    def apply(
      RoleId: js.UndefOr[idType] = js.undefined,
      AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined,
      RolePolicyList: js.UndefOr[policyDetailListType] = js.undefined,
      PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined,
      InstanceProfileList: js.UndefOr[instanceProfileListType] = js.undefined): RoleDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleId" -> RoleId.map { x => x.asInstanceOf[js.Any] },
        "AttachedManagedPolicies" -> AttachedManagedPolicies.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "AssumeRolePolicyDocument" -> AssumeRolePolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "RolePolicyList" -> RolePolicyList.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "InstanceProfileList" -> InstanceProfileList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoleDetail]
    }
  }

  /**
   * <p>An object that contains details about how a service-linked role is used, if that information is returned by the service.</p> <p>This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.</p>
   */
  @js.native
  trait RoleUsageType extends js.Object {
    var Region: js.UndefOr[RegionNameType]
    var Resources: js.UndefOr[ArnListType]
  }

  object RoleUsageType {
    def apply(
      Region: js.UndefOr[RegionNameType] = js.undefined,
      Resources: js.UndefOr[ArnListType] = js.undefined): RoleUsageType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoleUsageType]
    }
  }

  /**
   * <p>Contains the list of SAML providers for this account.</p>
   */
  @js.native
  trait SAMLProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType]
    var ValidUntil: js.UndefOr[dateType]
    var CreateDate: js.UndefOr[dateType]
  }

  object SAMLProviderListEntry {
    def apply(
      Arn: js.UndefOr[arnType] = js.undefined,
      ValidUntil: js.UndefOr[dateType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined): SAMLProviderListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SAMLProviderListEntry]
    }
  }

  /**
   * <p>Contains information about an SSH public key.</p> <p>This data type is used as a response element in the <a>GetSSHPublicKey</a> and <a>UploadSSHPublicKey</a> operations. </p>
   */
  @js.native
  trait SSHPublicKey extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SSHPublicKeyBody: js.UndefOr[publicKeyMaterialType]
    var Fingerprint: js.UndefOr[publicKeyFingerprintType]
    var UploadDate: js.UndefOr[dateType]
    var SSHPublicKeyId: js.UndefOr[publicKeyIdType]
    var Status: js.UndefOr[statusType]
  }

  object SSHPublicKey {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyBody: js.UndefOr[publicKeyMaterialType] = js.undefined,
      Fingerprint: js.UndefOr[publicKeyFingerprintType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): SSHPublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyBody" -> SSHPublicKeyBody.map { x => x.asInstanceOf[js.Any] },
        "Fingerprint" -> Fingerprint.map { x => x.asInstanceOf[js.Any] },
        "UploadDate" -> UploadDate.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyId" -> SSHPublicKeyId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSHPublicKey]
    }
  }

  /**
   * <p>Contains information about an SSH public key, without the key's body or fingerprint.</p> <p>This data type is used as a response element in the <a>ListSSHPublicKeys</a> operation.</p>
   */
  @js.native
  trait SSHPublicKeyMetadata extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SSHPublicKeyId: js.UndefOr[publicKeyIdType]
    var Status: js.UndefOr[statusType]
    var UploadDate: js.UndefOr[dateType]
  }

  object SSHPublicKeyMetadata {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined): SSHPublicKeyMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyId" -> SSHPublicKeyId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "UploadDate" -> UploadDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSHPublicKeyMetadata]
    }
  }

  /**
   * <p>Contains information about a server certificate.</p> <p> This data type is used as a response element in the <a>GetServerCertificate</a> operation. </p>
   */
  @js.native
  trait ServerCertificate extends js.Object {
    var ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata]
    var CertificateBody: js.UndefOr[certificateBodyType]
    var CertificateChain: js.UndefOr[certificateChainType]
  }

  object ServerCertificate {
    def apply(
      ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined,
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined,
      CertificateChain: js.UndefOr[certificateChainType] = js.undefined): ServerCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificateMetadata" -> ServerCertificateMetadata.map { x => x.asInstanceOf[js.Any] },
        "CertificateBody" -> CertificateBody.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerCertificate]
    }
  }

  /**
   * <p>Contains information about a server certificate without its certificate body, certificate chain, and private key.</p> <p> This data type is used as a response element in the <a>UploadServerCertificate</a> and <a>ListServerCertificates</a> operations. </p>
   */
  @js.native
  trait ServerCertificateMetadata extends js.Object {
    var Path: js.UndefOr[pathType]
    var ServerCertificateName: js.UndefOr[serverCertificateNameType]
    var Arn: js.UndefOr[arnType]
    var UploadDate: js.UndefOr[dateType]
    var ServerCertificateId: js.UndefOr[idType]
    var Expiration: js.UndefOr[dateType]
  }

  object ServerCertificateMetadata {
    def apply(
      Path: js.UndefOr[pathType] = js.undefined,
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined,
      ServerCertificateId: js.UndefOr[idType] = js.undefined,
      Expiration: js.UndefOr[dateType] = js.undefined): ServerCertificateMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "ServerCertificateName" -> ServerCertificateName.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "UploadDate" -> UploadDate.map { x => x.asInstanceOf[js.Any] },
        "ServerCertificateId" -> ServerCertificateId.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerCertificateMetadata]
    }
  }

  /**
   * <p>Contains the details of a service-specific credential.</p>
   */
  @js.native
  trait ServiceSpecificCredential extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var ServiceName: js.UndefOr[serviceName]
    var ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId]
    var ServicePassword: js.UndefOr[servicePassword]
    var CreateDate: js.UndefOr[dateType]
    var ServiceUserName: js.UndefOr[serviceUserName]
    var Status: js.UndefOr[statusType]
  }

  object ServiceSpecificCredential {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined,
      ServicePassword: js.UndefOr[servicePassword] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      ServiceUserName: js.UndefOr[serviceUserName] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): ServiceSpecificCredential = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x.asInstanceOf[js.Any] },
        "ServicePassword" -> ServicePassword.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "ServiceUserName" -> ServiceUserName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSpecificCredential]
    }
  }

  /**
   * <p>Contains additional details about a service-specific credential.</p>
   */
  @js.native
  trait ServiceSpecificCredentialMetadata extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var ServiceName: js.UndefOr[serviceName]
    var ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId]
    var CreateDate: js.UndefOr[dateType]
    var ServiceUserName: js.UndefOr[serviceUserName]
    var Status: js.UndefOr[statusType]
  }

  object ServiceSpecificCredentialMetadata {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceName: js.UndefOr[serviceName] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      ServiceUserName: js.UndefOr[serviceUserName] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): ServiceSpecificCredentialMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "ServiceUserName" -> ServiceUserName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSpecificCredentialMetadata]
    }
  }

  @js.native
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var PolicyArn: js.UndefOr[arnType]
    var VersionId: js.UndefOr[policyVersionIdType]
  }

  object SetDefaultPolicyVersionRequest {
    def apply(
      PolicyArn: js.UndefOr[arnType] = js.undefined,
      VersionId: js.UndefOr[policyVersionIdType] = js.undefined): SetDefaultPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultPolicyVersionRequest]
    }
  }

  /**
   * <p>Contains information about an X.509 signing certificate.</p> <p>This data type is used as a response element in the <a>UploadSigningCertificate</a> and <a>ListSigningCertificates</a> operations. </p>
   */
  @js.native
  trait SigningCertificate extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var CertificateBody: js.UndefOr[certificateBodyType]
    var CertificateId: js.UndefOr[certificateIdType]
    var UploadDate: js.UndefOr[dateType]
    var Status: js.UndefOr[statusType]
  }

  object SigningCertificate {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined,
      CertificateId: js.UndefOr[certificateIdType] = js.undefined,
      UploadDate: js.UndefOr[dateType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): SigningCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "CertificateBody" -> CertificateBody.map { x => x.asInstanceOf[js.Any] },
        "CertificateId" -> CertificateId.map { x => x.asInstanceOf[js.Any] },
        "UploadDate" -> UploadDate.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningCertificate]
    }
  }

  @js.native
  trait SimulateCustomPolicyRequest extends js.Object {
    var ResourceArns: js.UndefOr[ResourceNameListType]
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType]
    var MaxItems: js.UndefOr[maxItemsType]
    var ResourcePolicy: js.UndefOr[policyDocumentType]
    var ResourceOwner: js.UndefOr[ResourceNameType]
    var CallerArn: js.UndefOr[ResourceNameType]
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
    var ActionNames: js.UndefOr[ActionNameListType]
    var ContextEntries: js.UndefOr[ContextEntryListType]
    var Marker: js.UndefOr[markerType]
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
      Marker: js.UndefOr[markerType] = js.undefined): SimulateCustomPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] },
        "ResourceHandlingOption" -> ResourceHandlingOption.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "ResourcePolicy" -> ResourcePolicy.map { x => x.asInstanceOf[js.Any] },
        "ResourceOwner" -> ResourceOwner.map { x => x.asInstanceOf[js.Any] },
        "CallerArn" -> CallerArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyInputList" -> PolicyInputList.map { x => x.asInstanceOf[js.Any] },
        "ActionNames" -> ActionNames.map { x => x.asInstanceOf[js.Any] },
        "ContextEntries" -> ContextEntries.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulateCustomPolicyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>SimulatePrincipalPolicy</a> or <a>SimulateCustomPolicy</a> request.</p>
   */
  @js.native
  trait SimulatePolicyResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResultsListType]
    var IsTruncated: js.UndefOr[booleanType]
    var Marker: js.UndefOr[markerType]
  }

  object SimulatePolicyResponse {
    def apply(
      EvaluationResults: js.UndefOr[EvaluationResultsListType] = js.undefined,
      IsTruncated: js.UndefOr[booleanType] = js.undefined,
      Marker: js.UndefOr[markerType] = js.undefined): SimulatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationResults" -> EvaluationResults.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulatePolicyResponse]
    }
  }

  @js.native
  trait SimulatePrincipalPolicyRequest extends js.Object {
    var ResourceArns: js.UndefOr[ResourceNameListType]
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType]
    var MaxItems: js.UndefOr[maxItemsType]
    var ResourcePolicy: js.UndefOr[policyDocumentType]
    var PolicySourceArn: js.UndefOr[arnType]
    var ResourceOwner: js.UndefOr[ResourceNameType]
    var CallerArn: js.UndefOr[ResourceNameType]
    var PolicyInputList: js.UndefOr[SimulationPolicyListType]
    var ActionNames: js.UndefOr[ActionNameListType]
    var ContextEntries: js.UndefOr[ContextEntryListType]
    var Marker: js.UndefOr[markerType]
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
      Marker: js.UndefOr[markerType] = js.undefined): SimulatePrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] },
        "ResourceHandlingOption" -> ResourceHandlingOption.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "ResourcePolicy" -> ResourcePolicy.map { x => x.asInstanceOf[js.Any] },
        "PolicySourceArn" -> PolicySourceArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceOwner" -> ResourceOwner.map { x => x.asInstanceOf[js.Any] },
        "CallerArn" -> CallerArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyInputList" -> PolicyInputList.map { x => x.asInstanceOf[js.Any] },
        "ActionNames" -> ActionNames.map { x => x.asInstanceOf[js.Any] },
        "ContextEntries" -> ContextEntries.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulatePrincipalPolicyRequest]
    }
  }

  /**
   * <p>Contains a reference to a <code>Statement</code> element in a policy document that determines the result of the simulation.</p> <p>This data type is used by the <code>MatchedStatements</code> member of the <code> <a>EvaluationResult</a> </code> type.</p>
   */
  @js.native
  trait Statement extends js.Object {
    var SourcePolicyId: js.UndefOr[PolicyIdentifierType]
    var SourcePolicyType: js.UndefOr[PolicySourceType]
    var StartPosition: js.UndefOr[Position]
    var EndPosition: js.UndefOr[Position]
  }

  object Statement {
    def apply(
      SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.undefined,
      SourcePolicyType: js.UndefOr[PolicySourceType] = js.undefined,
      StartPosition: js.UndefOr[Position] = js.undefined,
      EndPosition: js.UndefOr[Position] = js.undefined): Statement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourcePolicyId" -> SourcePolicyId.map { x => x.asInstanceOf[js.Any] },
        "SourcePolicyType" -> SourcePolicyType.map { x => x.asInstanceOf[js.Any] },
        "StartPosition" -> StartPosition.map { x => x.asInstanceOf[js.Any] },
        "EndPosition" -> EndPosition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Statement]
    }
  }

  /**
   * <p>A structure that represents user-provided metadata that can be associated with a resource such as an IAM user or role. For more information about tagging, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM User Guide</i>.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[tagKeyType]
    var Value: js.UndefOr[tagValueType]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[tagKeyType] = js.undefined,
      Value: js.UndefOr[tagValueType] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var Tags: js.UndefOr[tagListType]
  }

  object TagRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined): TagRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagRoleRequest]
    }
  }

  @js.native
  trait TagUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var Tags: js.UndefOr[tagListType]
  }

  object TagUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined): TagUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagUserRequest]
    }
  }

  @js.native
  trait UntagRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var TagKeys: js.UndefOr[tagKeyListType]
  }

  object UntagRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      TagKeys: js.UndefOr[tagKeyListType] = js.undefined): UntagRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagRoleRequest]
    }
  }

  @js.native
  trait UntagUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var TagKeys: js.UndefOr[tagKeyListType]
  }

  object UntagUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      TagKeys: js.UndefOr[tagKeyListType] = js.undefined): UntagUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagUserRequest]
    }
  }

  @js.native
  trait UpdateAccessKeyRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var AccessKeyId: js.UndefOr[accessKeyIdType]
    var Status: js.UndefOr[statusType]
  }

  object UpdateAccessKeyRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): UpdateAccessKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccessKeyRequest]
    }
  }

  @js.native
  trait UpdateAccountPasswordPolicyRequest extends js.Object {
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType]
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType]
    var HardExpiry: js.UndefOr[booleanObjectType]
    var RequireNumbers: js.UndefOr[booleanType]
    var RequireUppercaseCharacters: js.UndefOr[booleanType]
    var AllowUsersToChangePassword: js.UndefOr[booleanType]
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType]
    var RequireSymbols: js.UndefOr[booleanType]
    var RequireLowercaseCharacters: js.UndefOr[booleanType]
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
      RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined): UpdateAccountPasswordPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinimumPasswordLength" -> MinimumPasswordLength.map { x => x.asInstanceOf[js.Any] },
        "PasswordReusePrevention" -> PasswordReusePrevention.map { x => x.asInstanceOf[js.Any] },
        "HardExpiry" -> HardExpiry.map { x => x.asInstanceOf[js.Any] },
        "RequireNumbers" -> RequireNumbers.map { x => x.asInstanceOf[js.Any] },
        "RequireUppercaseCharacters" -> RequireUppercaseCharacters.map { x => x.asInstanceOf[js.Any] },
        "AllowUsersToChangePassword" -> AllowUsersToChangePassword.map { x => x.asInstanceOf[js.Any] },
        "MaxPasswordAge" -> MaxPasswordAge.map { x => x.asInstanceOf[js.Any] },
        "RequireSymbols" -> RequireSymbols.map { x => x.asInstanceOf[js.Any] },
        "RequireLowercaseCharacters" -> RequireLowercaseCharacters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountPasswordPolicyRequest]
    }
  }

  @js.native
  trait UpdateAssumeRolePolicyRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var PolicyDocument: js.UndefOr[policyDocumentType]
  }

  object UpdateAssumeRolePolicyRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined): UpdateAssumeRolePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssumeRolePolicyRequest]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupName: js.UndefOr[groupNameType]
    var NewPath: js.UndefOr[pathType]
    var NewGroupName: js.UndefOr[groupNameType]
  }

  object UpdateGroupRequest {
    def apply(
      GroupName: js.UndefOr[groupNameType] = js.undefined,
      NewPath: js.UndefOr[pathType] = js.undefined,
      NewGroupName: js.UndefOr[groupNameType] = js.undefined): UpdateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "NewPath" -> NewPath.map { x => x.asInstanceOf[js.Any] },
        "NewGroupName" -> NewGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateLoginProfileRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var Password: js.UndefOr[passwordType]
    var PasswordResetRequired: js.UndefOr[booleanObjectType]
  }

  object UpdateLoginProfileRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Password: js.UndefOr[passwordType] = js.undefined,
      PasswordResetRequired: js.UndefOr[booleanObjectType] = js.undefined): UpdateLoginProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "PasswordResetRequired" -> PasswordResetRequired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoginProfileRequest]
    }
  }

  @js.native
  trait UpdateOpenIDConnectProviderThumbprintRequest extends js.Object {
    var OpenIDConnectProviderArn: js.UndefOr[arnType]
    var ThumbprintList: js.UndefOr[thumbprintListType]
  }

  object UpdateOpenIDConnectProviderThumbprintRequest {
    def apply(
      OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined,
      ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined): UpdateOpenIDConnectProviderThumbprintRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenIDConnectProviderArn" -> OpenIDConnectProviderArn.map { x => x.asInstanceOf[js.Any] },
        "ThumbprintList" -> ThumbprintList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOpenIDConnectProviderThumbprintRequest]
    }
  }

  @js.native
  trait UpdateRoleDescriptionRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var Description: js.UndefOr[roleDescriptionType]
  }

  object UpdateRoleDescriptionRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Description: js.UndefOr[roleDescriptionType] = js.undefined): UpdateRoleDescriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleDescriptionRequest]
    }
  }

  @js.native
  trait UpdateRoleDescriptionResponse extends js.Object {
    var Role: js.UndefOr[Role]
  }

  object UpdateRoleDescriptionResponse {
    def apply(
      Role: js.UndefOr[Role] = js.undefined): UpdateRoleDescriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleDescriptionResponse]
    }
  }

  @js.native
  trait UpdateRoleRequest extends js.Object {
    var RoleName: js.UndefOr[roleNameType]
    var Description: js.UndefOr[roleDescriptionType]
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType]
  }

  object UpdateRoleRequest {
    def apply(
      RoleName: js.UndefOr[roleNameType] = js.undefined,
      Description: js.UndefOr[roleDescriptionType] = js.undefined,
      MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined): UpdateRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MaxSessionDuration" -> MaxSessionDuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleRequest]
    }
  }

  @js.native
  trait UpdateRoleResponse extends js.Object {

  }

  object UpdateRoleResponse {
    def apply(): UpdateRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleResponse]
    }
  }

  @js.native
  trait UpdateSAMLProviderRequest extends js.Object {
    var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType]
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object UpdateSAMLProviderRequest {
    def apply(
      SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined,
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined): UpdateSAMLProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLMetadataDocument" -> SAMLMetadataDocument.map { x => x.asInstanceOf[js.Any] },
        "SAMLProviderArn" -> SAMLProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSAMLProviderRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UpdateSAMLProvider</a> request. </p>
   */
  @js.native
  trait UpdateSAMLProviderResponse extends js.Object {
    var SAMLProviderArn: js.UndefOr[arnType]
  }

  object UpdateSAMLProviderResponse {
    def apply(
      SAMLProviderArn: js.UndefOr[arnType] = js.undefined): UpdateSAMLProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SAMLProviderArn" -> SAMLProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSAMLProviderResponse]
    }
  }

  @js.native
  trait UpdateSSHPublicKeyRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SSHPublicKeyId: js.UndefOr[publicKeyIdType]
    var Status: js.UndefOr[statusType]
  }

  object UpdateSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyId: js.UndefOr[publicKeyIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): UpdateSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyId" -> SSHPublicKeyId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSSHPublicKeyRequest]
    }
  }

  @js.native
  trait UpdateServerCertificateRequest extends js.Object {
    var ServerCertificateName: js.UndefOr[serverCertificateNameType]
    var NewPath: js.UndefOr[pathType]
    var NewServerCertificateName: js.UndefOr[serverCertificateNameType]
  }

  object UpdateServerCertificateRequest {
    def apply(
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined,
      NewPath: js.UndefOr[pathType] = js.undefined,
      NewServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined): UpdateServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificateName" -> ServerCertificateName.map { x => x.asInstanceOf[js.Any] },
        "NewPath" -> NewPath.map { x => x.asInstanceOf[js.Any] },
        "NewServerCertificateName" -> NewServerCertificateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerCertificateRequest]
    }
  }

  @js.native
  trait UpdateServiceSpecificCredentialRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId]
    var Status: js.UndefOr[statusType]
  }

  object UpdateServiceSpecificCredentialRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      ServiceSpecificCredentialId: js.UndefOr[serviceSpecificCredentialId] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): UpdateServiceSpecificCredentialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecificCredentialId" -> ServiceSpecificCredentialId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceSpecificCredentialRequest]
    }
  }

  @js.native
  trait UpdateSigningCertificateRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var CertificateId: js.UndefOr[certificateIdType]
    var Status: js.UndefOr[statusType]
  }

  object UpdateSigningCertificateRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      CertificateId: js.UndefOr[certificateIdType] = js.undefined,
      Status: js.UndefOr[statusType] = js.undefined): UpdateSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "CertificateId" -> CertificateId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSigningCertificateRequest]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var NewPath: js.UndefOr[pathType]
    var NewUserName: js.UndefOr[userNameType]
  }

  object UpdateUserRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      NewPath: js.UndefOr[pathType] = js.undefined,
      NewUserName: js.UndefOr[userNameType] = js.undefined): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "NewPath" -> NewPath.map { x => x.asInstanceOf[js.Any] },
        "NewUserName" -> NewUserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UploadSSHPublicKeyRequest extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var SSHPublicKeyBody: js.UndefOr[publicKeyMaterialType]
  }

  object UploadSSHPublicKeyRequest {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      SSHPublicKeyBody: js.UndefOr[publicKeyMaterialType] = js.undefined): UploadSSHPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "SSHPublicKeyBody" -> SSHPublicKeyBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSSHPublicKeyRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UploadSSHPublicKey</a> request.</p>
   */
  @js.native
  trait UploadSSHPublicKeyResponse extends js.Object {
    var SSHPublicKey: js.UndefOr[SSHPublicKey]
  }

  object UploadSSHPublicKeyResponse {
    def apply(
      SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined): UploadSSHPublicKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSHPublicKey" -> SSHPublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSSHPublicKeyResponse]
    }
  }

  @js.native
  trait UploadServerCertificateRequest extends js.Object {
    var CertificateBody: js.UndefOr[certificateBodyType]
    var Path: js.UndefOr[pathType]
    var ServerCertificateName: js.UndefOr[serverCertificateNameType]
    var PrivateKey: js.UndefOr[privateKeyType]
    var CertificateChain: js.UndefOr[certificateChainType]
  }

  object UploadServerCertificateRequest {
    def apply(
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      ServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined,
      PrivateKey: js.UndefOr[privateKeyType] = js.undefined,
      CertificateChain: js.UndefOr[certificateChainType] = js.undefined): UploadServerCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateBody" -> CertificateBody.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "ServerCertificateName" -> ServerCertificateName.map { x => x.asInstanceOf[js.Any] },
        "PrivateKey" -> PrivateKey.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadServerCertificateRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UploadServerCertificate</a> request. </p>
   */
  @js.native
  trait UploadServerCertificateResponse extends js.Object {
    var ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata]
  }

  object UploadServerCertificateResponse {
    def apply(
      ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined): UploadServerCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerCertificateMetadata" -> ServerCertificateMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadServerCertificateResponse]
    }
  }

  @js.native
  trait UploadSigningCertificateRequest extends js.Object {
    var UserName: js.UndefOr[existingUserNameType]
    var CertificateBody: js.UndefOr[certificateBodyType]
  }

  object UploadSigningCertificateRequest {
    def apply(
      UserName: js.UndefOr[existingUserNameType] = js.undefined,
      CertificateBody: js.UndefOr[certificateBodyType] = js.undefined): UploadSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "CertificateBody" -> CertificateBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSigningCertificateRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>UploadSigningCertificate</a> request. </p>
   */
  @js.native
  trait UploadSigningCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[SigningCertificate]
  }

  object UploadSigningCertificateResponse {
    def apply(
      Certificate: js.UndefOr[SigningCertificate] = js.undefined): UploadSigningCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadSigningCertificateResponse]
    }
  }

  /**
   * <p>Contains information about an IAM user entity.</p> <p>This data type is used as a response element in the following operations:</p> <ul> <li> <p> <a>CreateUser</a> </p> </li> <li> <p> <a>GetUser</a> </p> </li> <li> <p> <a>ListUsers</a> </p> </li> </ul>
   */
  @js.native
  trait User extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var Path: js.UndefOr[pathType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var Tags: js.UndefOr[tagListType]
    var PasswordLastUsed: js.UndefOr[dateType]
    var UserId: js.UndefOr[idType]
  }

  object User {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined,
      PasswordLastUsed: js.UndefOr[dateType] = js.undefined,
      UserId: js.UndefOr[idType] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "PasswordLastUsed" -> PasswordLastUsed.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
   * <p>Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>
   */
  @js.native
  trait UserDetail extends js.Object {
    var UserName: js.UndefOr[userNameType]
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType]
    var GroupList: js.UndefOr[groupNameListType]
    var Path: js.UndefOr[pathType]
    var UserPolicyList: js.UndefOr[policyDetailListType]
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary]
    var Arn: js.UndefOr[arnType]
    var CreateDate: js.UndefOr[dateType]
    var Tags: js.UndefOr[tagListType]
    var UserId: js.UndefOr[idType]
  }

  object UserDetail {
    def apply(
      UserName: js.UndefOr[userNameType] = js.undefined,
      AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined,
      GroupList: js.UndefOr[groupNameListType] = js.undefined,
      Path: js.UndefOr[pathType] = js.undefined,
      UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined,
      PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      CreateDate: js.UndefOr[dateType] = js.undefined,
      Tags: js.UndefOr[tagListType] = js.undefined,
      UserId: js.UndefOr[idType] = js.undefined): UserDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "AttachedManagedPolicies" -> AttachedManagedPolicies.map { x => x.asInstanceOf[js.Any] },
        "GroupList" -> GroupList.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "UserPolicyList" -> UserPolicyList.map { x => x.asInstanceOf[js.Any] },
        "PermissionsBoundary" -> PermissionsBoundary.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserDetail]
    }
  }

  /**
   * <p>Contains information about a virtual MFA device.</p>
   */
  @js.native
  trait VirtualMFADevice extends js.Object {
    var EnableDate: js.UndefOr[dateType]
    var QRCodePNG: js.UndefOr[BootstrapDatum]
    var Base32StringSeed: js.UndefOr[BootstrapDatum]
    var User: js.UndefOr[User]
    var SerialNumber: js.UndefOr[serialNumberType]
  }

  object VirtualMFADevice {
    def apply(
      EnableDate: js.UndefOr[dateType] = js.undefined,
      QRCodePNG: js.UndefOr[BootstrapDatum] = js.undefined,
      Base32StringSeed: js.UndefOr[BootstrapDatum] = js.undefined,
      User: js.UndefOr[User] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined): VirtualMFADevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableDate" -> EnableDate.map { x => x.asInstanceOf[js.Any] },
        "QRCodePNG" -> QRCodePNG.map { x => x.asInstanceOf[js.Any] },
        "Base32StringSeed" -> Base32StringSeed.map { x => x.asInstanceOf[js.Any] },
        "User" -> User.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
