package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object cognitoidentityprovider {
  type AWSAccountIdType = String
  type AccessTokenValidityType = Int
  type AccountTakeoverActionNotifyType = Boolean
  type AdminCreateUserUnusedAccountValidityDaysType = Int
  type AliasAttributesListType = js.Array[AliasAttributeType]
  type ArnType = String
  type AttributeListType = js.Array[AttributeType]
  type AttributeMappingKeyType = String
  type AttributeMappingType = js.Dictionary[StringType]
  type AttributeNameListType = js.Array[AttributeNameType]
  type AttributeNameType = String
  type AttributeValueType = String
  type AttributesRequireVerificationBeforeUpdateType = js.Array[VerifiedAttributeType]
  type AuthEventsType = js.Array[AuthEventType]
  type AuthParametersType = js.Dictionary[StringType]
  type AuthSessionValidityType = Int
  type BlockedIPRangeListType = js.Array[StringType]
  type BooleanType = Boolean
  type CSSType = String
  type CSSVersionType = String
  type CallbackURLsListType = js.Array[RedirectUrlType]
  type ChallengeParametersType = js.Dictionary[StringType]
  type ChallengeResponseListType = js.Array[ChallengeResponseType]
  type ChallengeResponsesType = js.Dictionary[StringType]
  type ClientIdType = String
  type ClientMetadataType = js.Dictionary[StringType]
  type ClientNameType = String
  type ClientPermissionListType = js.Array[ClientPermissionType]
  type ClientPermissionType = String
  type ClientSecretType = String
  type CodeDeliveryDetailsListType = js.Array[CodeDeliveryDetailsType]
  type CompletionMessageType = String
  type ConfirmationCodeType = String
  type CustomAttributeNameType = String
  type CustomAttributesListType = js.Array[SchemaAttributeType]
  type DateType = js.Date
  type DeliveryMediumListType = js.Array[DeliveryMediumType]
  type DescriptionType = String
  type DeviceKeyType = String
  type DeviceListType = js.Array[DeviceType]
  type DeviceNameType = String
  type DomainType = String
  type DomainVersionType = String
  type EmailAddressType = String
  type EmailNotificationBodyType = String
  type EmailNotificationSubjectType = String
  type EmailVerificationMessageByLinkType = String
  type EmailVerificationMessageType = String
  type EmailVerificationSubjectByLinkType = String
  type EmailVerificationSubjectType = String
  type EventFiltersType = js.Array[EventFilterType]
  type EventIdType = String
  type ExplicitAuthFlowsListType = js.Array[ExplicitAuthFlowsType]
  type ForceAliasCreation = Boolean
  type GenerateSecret = Boolean
  type GroupListType = js.Array[GroupType]
  type GroupNameType = String
  type HexStringType = String
  type HttpHeaderList = js.Array[HttpHeader]
  type IdTokenValidityType = Int
  type IdpIdentifierType = String
  type IdpIdentifiersListType = js.Array[IdpIdentifierType]
  type ImageFileType = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageUrlType = String
  type IntegerType = Int
  type ListOfStringTypes = js.Array[StringType]
  type ListProvidersLimitType = Int
  type ListResourceServersLimitType = Int
  type LogoutURLsListType = js.Array[RedirectUrlType]
  type LongType = Double
  type MFAOptionListType = js.Array[MFAOptionType]
  type OAuthFlowsType = js.Array[OAuthFlowType]
  type PaginationKey = String
  type PaginationKeyType = String
  type PasswordPolicyMinLengthType = Int
  type PasswordType = String
  type PoolQueryLimitType = Int
  type PreSignedUrlType = String
  type PrecedenceType = Int
  type PriorityType = Int
  type ProviderDetailsType = js.Dictionary[StringType]
  type ProviderNameType = String
  type ProviderNameTypeV1 = String
  type ProvidersListType = js.Array[ProviderDescription]
  type QueryLimit = Int
  type QueryLimitType = Int
  type RecoveryMechanismsType = js.Array[RecoveryOptionType]
  type RedirectUrlType = String
  type RefreshTokenValidityType = Int
  type RegionCodeType = String
  type ResourceServerIdentifierType = String
  type ResourceServerNameType = String
  type ResourceServerScopeDescriptionType = String
  type ResourceServerScopeListType = js.Array[ResourceServerScopeType]
  type ResourceServerScopeNameType = String
  type ResourceServersListType = js.Array[ResourceServerType]
  type S3BucketType = String
  type SESConfigurationSet = String
  type SchemaAttributesListType = js.Array[SchemaAttributeType]
  type ScopeListType = js.Array[ScopeType]
  type ScopeType = String
  type SearchPaginationTokenType = String
  type SearchedAttributeNamesListType = js.Array[AttributeNameType]
  type SecretCodeType = String
  type SecretHashType = String
  type SessionType = String
  type SkippedIPRangeListType = js.Array[StringType]
  type SmsVerificationMessageType = String
  type SoftwareTokenMFAUserCodeType = String
  type StringType = String
  type SupportedIdentityProvidersListType = js.Array[ProviderNameType]
  type TagKeysType = String
  type TagValueType = String
  type TemporaryPasswordValidityDaysType = Int
  type TokenModelType = String
  type UserFilterType = String
  type UserImportJobIdType = String
  type UserImportJobNameType = String
  type UserImportJobsListType = js.Array[UserImportJobType]
  type UserMFASettingListType = js.Array[StringType]
  type UserPoolClientListType = js.Array[UserPoolClientDescription]
  type UserPoolIdType = String
  type UserPoolListType = js.Array[UserPoolDescriptionType]
  type UserPoolNameType = String
  type UserPoolTagsListType = js.Array[TagKeysType]
  type UserPoolTagsType = js.Dictionary[TagValueType]
  type UsernameAttributesListType = js.Array[UsernameAttributeType]
  type UsernameType = String
  type UsersListType = js.Array[UserType]
  type VerifiedAttributesListType = js.Array[VerifiedAttributeType]
  type WrappedBooleanType = Boolean

  final class CognitoIdentityProviderOps(private val service: CognitoIdentityProvider) extends AnyVal {

    @inline def addCustomAttributesFuture(params: AddCustomAttributesRequest): Future[AddCustomAttributesResponse] = service.addCustomAttributes(params).promise().toFuture
    @inline def adminAddUserToGroupFuture(params: AdminAddUserToGroupRequest): Future[js.Object] = service.adminAddUserToGroup(params).promise().toFuture
    @inline def adminConfirmSignUpFuture(params: AdminConfirmSignUpRequest): Future[AdminConfirmSignUpResponse] = service.adminConfirmSignUp(params).promise().toFuture
    @inline def adminCreateUserFuture(params: AdminCreateUserRequest): Future[AdminCreateUserResponse] = service.adminCreateUser(params).promise().toFuture
    @inline def adminDeleteUserAttributesFuture(params: AdminDeleteUserAttributesRequest): Future[AdminDeleteUserAttributesResponse] = service.adminDeleteUserAttributes(params).promise().toFuture
    @inline def adminDeleteUserFuture(params: AdminDeleteUserRequest): Future[js.Object] = service.adminDeleteUser(params).promise().toFuture
    @inline def adminDisableProviderForUserFuture(params: AdminDisableProviderForUserRequest): Future[AdminDisableProviderForUserResponse] = service.adminDisableProviderForUser(params).promise().toFuture
    @inline def adminDisableUserFuture(params: AdminDisableUserRequest): Future[AdminDisableUserResponse] = service.adminDisableUser(params).promise().toFuture
    @inline def adminEnableUserFuture(params: AdminEnableUserRequest): Future[AdminEnableUserResponse] = service.adminEnableUser(params).promise().toFuture
    @inline def adminForgetDeviceFuture(params: AdminForgetDeviceRequest): Future[js.Object] = service.adminForgetDevice(params).promise().toFuture
    @inline def adminGetDeviceFuture(params: AdminGetDeviceRequest): Future[AdminGetDeviceResponse] = service.adminGetDevice(params).promise().toFuture
    @inline def adminGetUserFuture(params: AdminGetUserRequest): Future[AdminGetUserResponse] = service.adminGetUser(params).promise().toFuture
    @inline def adminInitiateAuthFuture(params: AdminInitiateAuthRequest): Future[AdminInitiateAuthResponse] = service.adminInitiateAuth(params).promise().toFuture
    @inline def adminLinkProviderForUserFuture(params: AdminLinkProviderForUserRequest): Future[AdminLinkProviderForUserResponse] = service.adminLinkProviderForUser(params).promise().toFuture
    @inline def adminListDevicesFuture(params: AdminListDevicesRequest): Future[AdminListDevicesResponse] = service.adminListDevices(params).promise().toFuture
    @inline def adminListGroupsForUserFuture(params: AdminListGroupsForUserRequest): Future[AdminListGroupsForUserResponse] = service.adminListGroupsForUser(params).promise().toFuture
    @inline def adminListUserAuthEventsFuture(params: AdminListUserAuthEventsRequest): Future[AdminListUserAuthEventsResponse] = service.adminListUserAuthEvents(params).promise().toFuture
    @inline def adminRemoveUserFromGroupFuture(params: AdminRemoveUserFromGroupRequest): Future[js.Object] = service.adminRemoveUserFromGroup(params).promise().toFuture
    @inline def adminResetUserPasswordFuture(params: AdminResetUserPasswordRequest): Future[AdminResetUserPasswordResponse] = service.adminResetUserPassword(params).promise().toFuture
    @inline def adminRespondToAuthChallengeFuture(params: AdminRespondToAuthChallengeRequest): Future[AdminRespondToAuthChallengeResponse] = service.adminRespondToAuthChallenge(params).promise().toFuture
    @inline def adminSetUserMFAPreferenceFuture(params: AdminSetUserMFAPreferenceRequest): Future[AdminSetUserMFAPreferenceResponse] = service.adminSetUserMFAPreference(params).promise().toFuture
    @inline def adminSetUserPasswordFuture(params: AdminSetUserPasswordRequest): Future[AdminSetUserPasswordResponse] = service.adminSetUserPassword(params).promise().toFuture
    @inline def adminSetUserSettingsFuture(params: AdminSetUserSettingsRequest): Future[AdminSetUserSettingsResponse] = service.adminSetUserSettings(params).promise().toFuture
    @inline def adminUpdateAuthEventFeedbackFuture(params: AdminUpdateAuthEventFeedbackRequest): Future[AdminUpdateAuthEventFeedbackResponse] = service.adminUpdateAuthEventFeedback(params).promise().toFuture
    @inline def adminUpdateDeviceStatusFuture(params: AdminUpdateDeviceStatusRequest): Future[AdminUpdateDeviceStatusResponse] = service.adminUpdateDeviceStatus(params).promise().toFuture
    @inline def adminUpdateUserAttributesFuture(params: AdminUpdateUserAttributesRequest): Future[AdminUpdateUserAttributesResponse] = service.adminUpdateUserAttributes(params).promise().toFuture
    @inline def adminUserGlobalSignOutFuture(params: AdminUserGlobalSignOutRequest): Future[AdminUserGlobalSignOutResponse] = service.adminUserGlobalSignOut(params).promise().toFuture
    @inline def associateSoftwareTokenFuture(params: AssociateSoftwareTokenRequest): Future[AssociateSoftwareTokenResponse] = service.associateSoftwareToken(params).promise().toFuture
    @inline def changePasswordFuture(params: ChangePasswordRequest): Future[ChangePasswordResponse] = service.changePassword(params).promise().toFuture
    @inline def confirmDeviceFuture(params: ConfirmDeviceRequest): Future[ConfirmDeviceResponse] = service.confirmDevice(params).promise().toFuture
    @inline def confirmForgotPasswordFuture(params: ConfirmForgotPasswordRequest): Future[ConfirmForgotPasswordResponse] = service.confirmForgotPassword(params).promise().toFuture
    @inline def confirmSignUpFuture(params: ConfirmSignUpRequest): Future[ConfirmSignUpResponse] = service.confirmSignUp(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] = service.createGroup(params).promise().toFuture
    @inline def createIdentityProviderFuture(params: CreateIdentityProviderRequest): Future[CreateIdentityProviderResponse] = service.createIdentityProvider(params).promise().toFuture
    @inline def createResourceServerFuture(params: CreateResourceServerRequest): Future[CreateResourceServerResponse] = service.createResourceServer(params).promise().toFuture
    @inline def createUserImportJobFuture(params: CreateUserImportJobRequest): Future[CreateUserImportJobResponse] = service.createUserImportJob(params).promise().toFuture
    @inline def createUserPoolClientFuture(params: CreateUserPoolClientRequest): Future[CreateUserPoolClientResponse] = service.createUserPoolClient(params).promise().toFuture
    @inline def createUserPoolDomainFuture(params: CreateUserPoolDomainRequest): Future[CreateUserPoolDomainResponse] = service.createUserPoolDomain(params).promise().toFuture
    @inline def createUserPoolFuture(params: CreateUserPoolRequest): Future[CreateUserPoolResponse] = service.createUserPool(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[js.Object] = service.deleteGroup(params).promise().toFuture
    @inline def deleteIdentityProviderFuture(params: DeleteIdentityProviderRequest): Future[js.Object] = service.deleteIdentityProvider(params).promise().toFuture
    @inline def deleteResourceServerFuture(params: DeleteResourceServerRequest): Future[js.Object] = service.deleteResourceServer(params).promise().toFuture
    @inline def deleteUserAttributesFuture(params: DeleteUserAttributesRequest): Future[DeleteUserAttributesResponse] = service.deleteUserAttributes(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def deleteUserPoolClientFuture(params: DeleteUserPoolClientRequest): Future[js.Object] = service.deleteUserPoolClient(params).promise().toFuture
    @inline def deleteUserPoolDomainFuture(params: DeleteUserPoolDomainRequest): Future[DeleteUserPoolDomainResponse] = service.deleteUserPoolDomain(params).promise().toFuture
    @inline def deleteUserPoolFuture(params: DeleteUserPoolRequest): Future[js.Object] = service.deleteUserPool(params).promise().toFuture
    @inline def describeIdentityProviderFuture(params: DescribeIdentityProviderRequest): Future[DescribeIdentityProviderResponse] = service.describeIdentityProvider(params).promise().toFuture
    @inline def describeResourceServerFuture(params: DescribeResourceServerRequest): Future[DescribeResourceServerResponse] = service.describeResourceServer(params).promise().toFuture
    @inline def describeRiskConfigurationFuture(params: DescribeRiskConfigurationRequest): Future[DescribeRiskConfigurationResponse] = service.describeRiskConfiguration(params).promise().toFuture
    @inline def describeUserImportJobFuture(params: DescribeUserImportJobRequest): Future[DescribeUserImportJobResponse] = service.describeUserImportJob(params).promise().toFuture
    @inline def describeUserPoolClientFuture(params: DescribeUserPoolClientRequest): Future[DescribeUserPoolClientResponse] = service.describeUserPoolClient(params).promise().toFuture
    @inline def describeUserPoolDomainFuture(params: DescribeUserPoolDomainRequest): Future[DescribeUserPoolDomainResponse] = service.describeUserPoolDomain(params).promise().toFuture
    @inline def describeUserPoolFuture(params: DescribeUserPoolRequest): Future[DescribeUserPoolResponse] = service.describeUserPool(params).promise().toFuture
    @inline def forgetDeviceFuture(params: ForgetDeviceRequest): Future[js.Object] = service.forgetDevice(params).promise().toFuture
    @inline def forgotPasswordFuture(params: ForgotPasswordRequest): Future[ForgotPasswordResponse] = service.forgotPassword(params).promise().toFuture
    @inline def getCSVHeaderFuture(params: GetCSVHeaderRequest): Future[GetCSVHeaderResponse] = service.getCSVHeader(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] = service.getDevice(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] = service.getGroup(params).promise().toFuture
    @inline def getIdentityProviderByIdentifierFuture(params: GetIdentityProviderByIdentifierRequest): Future[GetIdentityProviderByIdentifierResponse] = service.getIdentityProviderByIdentifier(params).promise().toFuture
    @inline def getSigningCertificateFuture(params: GetSigningCertificateRequest): Future[GetSigningCertificateResponse] = service.getSigningCertificate(params).promise().toFuture
    @inline def getUICustomizationFuture(params: GetUICustomizationRequest): Future[GetUICustomizationResponse] = service.getUICustomization(params).promise().toFuture
    @inline def getUserAttributeVerificationCodeFuture(params: GetUserAttributeVerificationCodeRequest): Future[GetUserAttributeVerificationCodeResponse] = service.getUserAttributeVerificationCode(params).promise().toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] = service.getUser(params).promise().toFuture
    @inline def getUserPoolMfaConfigFuture(params: GetUserPoolMfaConfigRequest): Future[GetUserPoolMfaConfigResponse] = service.getUserPoolMfaConfig(params).promise().toFuture
    @inline def globalSignOutFuture(params: GlobalSignOutRequest): Future[GlobalSignOutResponse] = service.globalSignOut(params).promise().toFuture
    @inline def initiateAuthFuture(params: InitiateAuthRequest): Future[InitiateAuthResponse] = service.initiateAuth(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] = service.listDevices(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listIdentityProvidersFuture(params: ListIdentityProvidersRequest): Future[ListIdentityProvidersResponse] = service.listIdentityProviders(params).promise().toFuture
    @inline def listResourceServersFuture(params: ListResourceServersRequest): Future[ListResourceServersResponse] = service.listResourceServers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUserImportJobsFuture(params: ListUserImportJobsRequest): Future[ListUserImportJobsResponse] = service.listUserImportJobs(params).promise().toFuture
    @inline def listUserPoolClientsFuture(params: ListUserPoolClientsRequest): Future[ListUserPoolClientsResponse] = service.listUserPoolClients(params).promise().toFuture
    @inline def listUserPoolsFuture(params: ListUserPoolsRequest): Future[ListUserPoolsResponse] = service.listUserPools(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def listUsersInGroupFuture(params: ListUsersInGroupRequest): Future[ListUsersInGroupResponse] = service.listUsersInGroup(params).promise().toFuture
    @inline def resendConfirmationCodeFuture(params: ResendConfirmationCodeRequest): Future[ResendConfirmationCodeResponse] = service.resendConfirmationCode(params).promise().toFuture
    @inline def respondToAuthChallengeFuture(params: RespondToAuthChallengeRequest): Future[RespondToAuthChallengeResponse] = service.respondToAuthChallenge(params).promise().toFuture
    @inline def revokeTokenFuture(params: RevokeTokenRequest): Future[RevokeTokenResponse] = service.revokeToken(params).promise().toFuture
    @inline def setRiskConfigurationFuture(params: SetRiskConfigurationRequest): Future[SetRiskConfigurationResponse] = service.setRiskConfiguration(params).promise().toFuture
    @inline def setUICustomizationFuture(params: SetUICustomizationRequest): Future[SetUICustomizationResponse] = service.setUICustomization(params).promise().toFuture
    @inline def setUserMFAPreferenceFuture(params: SetUserMFAPreferenceRequest): Future[SetUserMFAPreferenceResponse] = service.setUserMFAPreference(params).promise().toFuture
    @inline def setUserPoolMfaConfigFuture(params: SetUserPoolMfaConfigRequest): Future[SetUserPoolMfaConfigResponse] = service.setUserPoolMfaConfig(params).promise().toFuture
    @inline def setUserSettingsFuture(params: SetUserSettingsRequest): Future[SetUserSettingsResponse] = service.setUserSettings(params).promise().toFuture
    @inline def signUpFuture(params: SignUpRequest): Future[SignUpResponse] = service.signUp(params).promise().toFuture
    @inline def startUserImportJobFuture(params: StartUserImportJobRequest): Future[StartUserImportJobResponse] = service.startUserImportJob(params).promise().toFuture
    @inline def stopUserImportJobFuture(params: StopUserImportJobRequest): Future[StopUserImportJobResponse] = service.stopUserImportJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAuthEventFeedbackFuture(params: UpdateAuthEventFeedbackRequest): Future[UpdateAuthEventFeedbackResponse] = service.updateAuthEventFeedback(params).promise().toFuture
    @inline def updateDeviceStatusFuture(params: UpdateDeviceStatusRequest): Future[UpdateDeviceStatusResponse] = service.updateDeviceStatus(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] = service.updateGroup(params).promise().toFuture
    @inline def updateIdentityProviderFuture(params: UpdateIdentityProviderRequest): Future[UpdateIdentityProviderResponse] = service.updateIdentityProvider(params).promise().toFuture
    @inline def updateResourceServerFuture(params: UpdateResourceServerRequest): Future[UpdateResourceServerResponse] = service.updateResourceServer(params).promise().toFuture
    @inline def updateUserAttributesFuture(params: UpdateUserAttributesRequest): Future[UpdateUserAttributesResponse] = service.updateUserAttributes(params).promise().toFuture
    @inline def updateUserPoolClientFuture(params: UpdateUserPoolClientRequest): Future[UpdateUserPoolClientResponse] = service.updateUserPoolClient(params).promise().toFuture
    @inline def updateUserPoolDomainFuture(params: UpdateUserPoolDomainRequest): Future[UpdateUserPoolDomainResponse] = service.updateUserPoolDomain(params).promise().toFuture
    @inline def updateUserPoolFuture(params: UpdateUserPoolRequest): Future[UpdateUserPoolResponse] = service.updateUserPool(params).promise().toFuture
    @inline def verifySoftwareTokenFuture(params: VerifySoftwareTokenRequest): Future[VerifySoftwareTokenResponse] = service.verifySoftwareToken(params).promise().toFuture
    @inline def verifyUserAttributeFuture(params: VerifyUserAttributeRequest): Future[VerifyUserAttributeResponse] = service.verifyUserAttribute(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/cognitoidentityserviceprovider", JSImport.Namespace, "AWS.CognitoIdentityServiceProvider")
  class CognitoIdentityProvider() extends js.Object {
    def this(config: AWSConfig) = this()

    def addCustomAttributes(params: AddCustomAttributesRequest): Request[AddCustomAttributesResponse] = js.native
    def adminAddUserToGroup(params: AdminAddUserToGroupRequest): Request[js.Object] = js.native
    def adminConfirmSignUp(params: AdminConfirmSignUpRequest): Request[AdminConfirmSignUpResponse] = js.native
    def adminCreateUser(params: AdminCreateUserRequest): Request[AdminCreateUserResponse] = js.native
    def adminDeleteUser(params: AdminDeleteUserRequest): Request[js.Object] = js.native
    def adminDeleteUserAttributes(params: AdminDeleteUserAttributesRequest): Request[AdminDeleteUserAttributesResponse] = js.native
    def adminDisableProviderForUser(params: AdminDisableProviderForUserRequest): Request[AdminDisableProviderForUserResponse] = js.native
    def adminDisableUser(params: AdminDisableUserRequest): Request[AdminDisableUserResponse] = js.native
    def adminEnableUser(params: AdminEnableUserRequest): Request[AdminEnableUserResponse] = js.native
    def adminForgetDevice(params: AdminForgetDeviceRequest): Request[js.Object] = js.native
    def adminGetDevice(params: AdminGetDeviceRequest): Request[AdminGetDeviceResponse] = js.native
    def adminGetUser(params: AdminGetUserRequest): Request[AdminGetUserResponse] = js.native
    def adminInitiateAuth(params: AdminInitiateAuthRequest): Request[AdminInitiateAuthResponse] = js.native
    def adminLinkProviderForUser(params: AdminLinkProviderForUserRequest): Request[AdminLinkProviderForUserResponse] = js.native
    def adminListDevices(params: AdminListDevicesRequest): Request[AdminListDevicesResponse] = js.native
    def adminListGroupsForUser(params: AdminListGroupsForUserRequest): Request[AdminListGroupsForUserResponse] = js.native
    def adminListUserAuthEvents(params: AdminListUserAuthEventsRequest): Request[AdminListUserAuthEventsResponse] = js.native
    def adminRemoveUserFromGroup(params: AdminRemoveUserFromGroupRequest): Request[js.Object] = js.native
    def adminResetUserPassword(params: AdminResetUserPasswordRequest): Request[AdminResetUserPasswordResponse] = js.native
    def adminRespondToAuthChallenge(params: AdminRespondToAuthChallengeRequest): Request[AdminRespondToAuthChallengeResponse] = js.native
    def adminSetUserMFAPreference(params: AdminSetUserMFAPreferenceRequest): Request[AdminSetUserMFAPreferenceResponse] = js.native
    def adminSetUserPassword(params: AdminSetUserPasswordRequest): Request[AdminSetUserPasswordResponse] = js.native
    def adminSetUserSettings(params: AdminSetUserSettingsRequest): Request[AdminSetUserSettingsResponse] = js.native
    def adminUpdateAuthEventFeedback(params: AdminUpdateAuthEventFeedbackRequest): Request[AdminUpdateAuthEventFeedbackResponse] = js.native
    def adminUpdateDeviceStatus(params: AdminUpdateDeviceStatusRequest): Request[AdminUpdateDeviceStatusResponse] = js.native
    def adminUpdateUserAttributes(params: AdminUpdateUserAttributesRequest): Request[AdminUpdateUserAttributesResponse] = js.native
    def adminUserGlobalSignOut(params: AdminUserGlobalSignOutRequest): Request[AdminUserGlobalSignOutResponse] = js.native
    def associateSoftwareToken(params: AssociateSoftwareTokenRequest): Request[AssociateSoftwareTokenResponse] = js.native
    def changePassword(params: ChangePasswordRequest): Request[ChangePasswordResponse] = js.native
    def confirmDevice(params: ConfirmDeviceRequest): Request[ConfirmDeviceResponse] = js.native
    def confirmForgotPassword(params: ConfirmForgotPasswordRequest): Request[ConfirmForgotPasswordResponse] = js.native
    def confirmSignUp(params: ConfirmSignUpRequest): Request[ConfirmSignUpResponse] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createIdentityProvider(params: CreateIdentityProviderRequest): Request[CreateIdentityProviderResponse] = js.native
    def createResourceServer(params: CreateResourceServerRequest): Request[CreateResourceServerResponse] = js.native
    def createUserImportJob(params: CreateUserImportJobRequest): Request[CreateUserImportJobResponse] = js.native
    def createUserPool(params: CreateUserPoolRequest): Request[CreateUserPoolResponse] = js.native
    def createUserPoolClient(params: CreateUserPoolClientRequest): Request[CreateUserPoolClientResponse] = js.native
    def createUserPoolDomain(params: CreateUserPoolDomainRequest): Request[CreateUserPoolDomainResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[js.Object] = js.native
    def deleteIdentityProvider(params: DeleteIdentityProviderRequest): Request[js.Object] = js.native
    def deleteResourceServer(params: DeleteResourceServerRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteUserAttributes(params: DeleteUserAttributesRequest): Request[DeleteUserAttributesResponse] = js.native
    def deleteUserPool(params: DeleteUserPoolRequest): Request[js.Object] = js.native
    def deleteUserPoolClient(params: DeleteUserPoolClientRequest): Request[js.Object] = js.native
    def deleteUserPoolDomain(params: DeleteUserPoolDomainRequest): Request[DeleteUserPoolDomainResponse] = js.native
    def describeIdentityProvider(params: DescribeIdentityProviderRequest): Request[DescribeIdentityProviderResponse] = js.native
    def describeResourceServer(params: DescribeResourceServerRequest): Request[DescribeResourceServerResponse] = js.native
    def describeRiskConfiguration(params: DescribeRiskConfigurationRequest): Request[DescribeRiskConfigurationResponse] = js.native
    def describeUserImportJob(params: DescribeUserImportJobRequest): Request[DescribeUserImportJobResponse] = js.native
    def describeUserPool(params: DescribeUserPoolRequest): Request[DescribeUserPoolResponse] = js.native
    def describeUserPoolClient(params: DescribeUserPoolClientRequest): Request[DescribeUserPoolClientResponse] = js.native
    def describeUserPoolDomain(params: DescribeUserPoolDomainRequest): Request[DescribeUserPoolDomainResponse] = js.native
    def forgetDevice(params: ForgetDeviceRequest): Request[js.Object] = js.native
    def forgotPassword(params: ForgotPasswordRequest): Request[ForgotPasswordResponse] = js.native
    def getCSVHeader(params: GetCSVHeaderRequest): Request[GetCSVHeaderResponse] = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse] = js.native
    def getIdentityProviderByIdentifier(params: GetIdentityProviderByIdentifierRequest): Request[GetIdentityProviderByIdentifierResponse] = js.native
    def getSigningCertificate(params: GetSigningCertificateRequest): Request[GetSigningCertificateResponse] = js.native
    def getUICustomization(params: GetUICustomizationRequest): Request[GetUICustomizationResponse] = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse] = js.native
    def getUserAttributeVerificationCode(params: GetUserAttributeVerificationCodeRequest): Request[GetUserAttributeVerificationCodeResponse] = js.native
    def getUserPoolMfaConfig(params: GetUserPoolMfaConfigRequest): Request[GetUserPoolMfaConfigResponse] = js.native
    def globalSignOut(params: GlobalSignOutRequest): Request[GlobalSignOutResponse] = js.native
    def initiateAuth(params: InitiateAuthRequest): Request[InitiateAuthResponse] = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse] = js.native
    def listResourceServers(params: ListResourceServersRequest): Request[ListResourceServersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUserImportJobs(params: ListUserImportJobsRequest): Request[ListUserImportJobsResponse] = js.native
    def listUserPoolClients(params: ListUserPoolClientsRequest): Request[ListUserPoolClientsResponse] = js.native
    def listUserPools(params: ListUserPoolsRequest): Request[ListUserPoolsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listUsersInGroup(params: ListUsersInGroupRequest): Request[ListUsersInGroupResponse] = js.native
    def resendConfirmationCode(params: ResendConfirmationCodeRequest): Request[ResendConfirmationCodeResponse] = js.native
    def respondToAuthChallenge(params: RespondToAuthChallengeRequest): Request[RespondToAuthChallengeResponse] = js.native
    def revokeToken(params: RevokeTokenRequest): Request[RevokeTokenResponse] = js.native
    def setRiskConfiguration(params: SetRiskConfigurationRequest): Request[SetRiskConfigurationResponse] = js.native
    def setUICustomization(params: SetUICustomizationRequest): Request[SetUICustomizationResponse] = js.native
    def setUserMFAPreference(params: SetUserMFAPreferenceRequest): Request[SetUserMFAPreferenceResponse] = js.native
    def setUserPoolMfaConfig(params: SetUserPoolMfaConfigRequest): Request[SetUserPoolMfaConfigResponse] = js.native
    def setUserSettings(params: SetUserSettingsRequest): Request[SetUserSettingsResponse] = js.native
    def signUp(params: SignUpRequest): Request[SignUpResponse] = js.native
    def startUserImportJob(params: StartUserImportJobRequest): Request[StartUserImportJobResponse] = js.native
    def stopUserImportJob(params: StopUserImportJobRequest): Request[StopUserImportJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAuthEventFeedback(params: UpdateAuthEventFeedbackRequest): Request[UpdateAuthEventFeedbackResponse] = js.native
    def updateDeviceStatus(params: UpdateDeviceStatusRequest): Request[UpdateDeviceStatusResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateIdentityProvider(params: UpdateIdentityProviderRequest): Request[UpdateIdentityProviderResponse] = js.native
    def updateResourceServer(params: UpdateResourceServerRequest): Request[UpdateResourceServerResponse] = js.native
    def updateUserAttributes(params: UpdateUserAttributesRequest): Request[UpdateUserAttributesResponse] = js.native
    def updateUserPool(params: UpdateUserPoolRequest): Request[UpdateUserPoolResponse] = js.native
    def updateUserPoolClient(params: UpdateUserPoolClientRequest): Request[UpdateUserPoolClientResponse] = js.native
    def updateUserPoolDomain(params: UpdateUserPoolDomainRequest): Request[UpdateUserPoolDomainResponse] = js.native
    def verifySoftwareToken(params: VerifySoftwareTokenRequest): Request[VerifySoftwareTokenResponse] = js.native
    def verifyUserAttribute(params: VerifyUserAttributeRequest): Request[VerifyUserAttributeResponse] = js.native
  }
  object CognitoIdentityProvider {
    @inline implicit def toOps(service: CognitoIdentityProvider): CognitoIdentityProviderOps = {
      new CognitoIdentityProviderOps(service)
    }
  }

  /** The data type for <code>AccountRecoverySetting</code>.
    */
  @js.native
  trait AccountRecoverySettingType extends js.Object {
    var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType]
  }

  object AccountRecoverySettingType {
    @inline
    def apply(
        RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType] = js.undefined
    ): AccountRecoverySettingType = {
      val __obj = js.Dynamic.literal()
      RecoveryMechanisms.foreach(__v => __obj.updateDynamic("RecoveryMechanisms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountRecoverySettingType]
    }
  }

  /** Account takeover action type.
    */
  @js.native
  trait AccountTakeoverActionType extends js.Object {
    var EventAction: AccountTakeoverEventActionType
    var Notify: AccountTakeoverActionNotifyType
  }

  object AccountTakeoverActionType {
    @inline
    def apply(
        EventAction: AccountTakeoverEventActionType,
        Notify: AccountTakeoverActionNotifyType
    ): AccountTakeoverActionType = {
      val __obj = js.Dynamic.literal(
        "EventAction" -> EventAction.asInstanceOf[js.Any],
        "Notify" -> Notify.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountTakeoverActionType]
    }
  }

  /** Account takeover actions type.
    */
  @js.native
  trait AccountTakeoverActionsType extends js.Object {
    var HighAction: js.UndefOr[AccountTakeoverActionType]
    var LowAction: js.UndefOr[AccountTakeoverActionType]
    var MediumAction: js.UndefOr[AccountTakeoverActionType]
  }

  object AccountTakeoverActionsType {
    @inline
    def apply(
        HighAction: js.UndefOr[AccountTakeoverActionType] = js.undefined,
        LowAction: js.UndefOr[AccountTakeoverActionType] = js.undefined,
        MediumAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
    ): AccountTakeoverActionsType = {
      val __obj = js.Dynamic.literal()
      HighAction.foreach(__v => __obj.updateDynamic("HighAction")(__v.asInstanceOf[js.Any]))
      LowAction.foreach(__v => __obj.updateDynamic("LowAction")(__v.asInstanceOf[js.Any]))
      MediumAction.foreach(__v => __obj.updateDynamic("MediumAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountTakeoverActionsType]
    }
  }

  /** Configuration for mitigation actions and notification for different levels of risk detected for a potential account takeover.
    */
  @js.native
  trait AccountTakeoverRiskConfigurationType extends js.Object {
    var Actions: AccountTakeoverActionsType
    var NotifyConfiguration: js.UndefOr[NotifyConfigurationType]
  }

  object AccountTakeoverRiskConfigurationType {
    @inline
    def apply(
        Actions: AccountTakeoverActionsType,
        NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.undefined
    ): AccountTakeoverRiskConfigurationType = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any]
      )

      NotifyConfiguration.foreach(__v => __obj.updateDynamic("NotifyConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountTakeoverRiskConfigurationType]
    }
  }

  /** Represents the request to add custom attributes.
    */
  @js.native
  trait AddCustomAttributesRequest extends js.Object {
    var CustomAttributes: CustomAttributesListType
    var UserPoolId: UserPoolIdType
  }

  object AddCustomAttributesRequest {
    @inline
    def apply(
        CustomAttributes: CustomAttributesListType,
        UserPoolId: UserPoolIdType
    ): AddCustomAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "CustomAttributes" -> CustomAttributes.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddCustomAttributesRequest]
    }
  }

  /** Represents the response from the server for the request to add custom attributes.
    */
  @js.native
  trait AddCustomAttributesResponse extends js.Object

  object AddCustomAttributesResponse {
    @inline
    def apply(): AddCustomAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddCustomAttributesResponse]
    }
  }

  @js.native
  trait AdminAddUserToGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminAddUserToGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminAddUserToGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminAddUserToGroupRequest]
    }
  }

  /** Represents the request to confirm user registration.
    */
  @js.native
  trait AdminConfirmSignUpRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  object AdminConfirmSignUpRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    ): AdminConfirmSignUpRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminConfirmSignUpRequest]
    }
  }

  /** Represents the response from the server for the request to confirm registration.
    */
  @js.native
  trait AdminConfirmSignUpResponse extends js.Object

  object AdminConfirmSignUpResponse {
    @inline
    def apply(): AdminConfirmSignUpResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminConfirmSignUpResponse]
    }
  }

  /** The configuration for creating a new user profile.
    */
  @js.native
  trait AdminCreateUserConfigType extends js.Object {
    var AllowAdminCreateUserOnly: js.UndefOr[BooleanType]
    var InviteMessageTemplate: js.UndefOr[MessageTemplateType]
    var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType]
  }

  object AdminCreateUserConfigType {
    @inline
    def apply(
        AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined,
        InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.undefined,
        UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined
    ): AdminCreateUserConfigType = {
      val __obj = js.Dynamic.literal()
      AllowAdminCreateUserOnly.foreach(__v => __obj.updateDynamic("AllowAdminCreateUserOnly")(__v.asInstanceOf[js.Any]))
      InviteMessageTemplate.foreach(__v => __obj.updateDynamic("InviteMessageTemplate")(__v.asInstanceOf[js.Any]))
      UnusedAccountValidityDays.foreach(__v => __obj.updateDynamic("UnusedAccountValidityDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminCreateUserConfigType]
    }
  }

  /** Represents the request to create a user in the specified user pool.
    */
  @js.native
  trait AdminCreateUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType]
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation]
    var MessageAction: js.UndefOr[MessageActionType]
    var TemporaryPassword: js.UndefOr[PasswordType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var ValidationData: js.UndefOr[AttributeListType]
  }

  object AdminCreateUserRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.undefined,
        ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
        MessageAction: js.UndefOr[MessageActionType] = js.undefined,
        TemporaryPassword: js.UndefOr[PasswordType] = js.undefined,
        UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
        ValidationData: js.UndefOr[AttributeListType] = js.undefined
    ): AdminCreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      DesiredDeliveryMediums.foreach(__v => __obj.updateDynamic("DesiredDeliveryMediums")(__v.asInstanceOf[js.Any]))
      ForceAliasCreation.foreach(__v => __obj.updateDynamic("ForceAliasCreation")(__v.asInstanceOf[js.Any]))
      MessageAction.foreach(__v => __obj.updateDynamic("MessageAction")(__v.asInstanceOf[js.Any]))
      TemporaryPassword.foreach(__v => __obj.updateDynamic("TemporaryPassword")(__v.asInstanceOf[js.Any]))
      UserAttributes.foreach(__v => __obj.updateDynamic("UserAttributes")(__v.asInstanceOf[js.Any]))
      ValidationData.foreach(__v => __obj.updateDynamic("ValidationData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminCreateUserRequest]
    }
  }

  /** Represents the response from the server to the request to create the user.
    */
  @js.native
  trait AdminCreateUserResponse extends js.Object {
    var User: js.UndefOr[UserType]
  }

  object AdminCreateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[UserType] = js.undefined
    ): AdminCreateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminCreateUserResponse]
    }
  }

  /** Represents the request to delete user attributes as an administrator.
    */
  @js.native
  trait AdminDeleteUserAttributesRequest extends js.Object {
    var UserAttributeNames: AttributeNameListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminDeleteUserAttributesRequest {
    @inline
    def apply(
        UserAttributeNames: AttributeNameListType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminDeleteUserAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "UserAttributeNames" -> UserAttributeNames.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminDeleteUserAttributesRequest]
    }
  }

  /** Represents the response received from the server for a request to delete user attributes.
    */
  @js.native
  trait AdminDeleteUserAttributesResponse extends js.Object

  object AdminDeleteUserAttributesResponse {
    @inline
    def apply(): AdminDeleteUserAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminDeleteUserAttributesResponse]
    }
  }

  /** Represents the request to delete a user as an administrator.
    */
  @js.native
  trait AdminDeleteUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminDeleteUserRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminDeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminDeleteUserRequest]
    }
  }

  @js.native
  trait AdminDisableProviderForUserRequest extends js.Object {
    var User: ProviderUserIdentifierType
    var UserPoolId: StringType
  }

  object AdminDisableProviderForUserRequest {
    @inline
    def apply(
        User: ProviderUserIdentifierType,
        UserPoolId: StringType
    ): AdminDisableProviderForUserRequest = {
      val __obj = js.Dynamic.literal(
        "User" -> User.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminDisableProviderForUserRequest]
    }
  }

  @js.native
  trait AdminDisableProviderForUserResponse extends js.Object

  object AdminDisableProviderForUserResponse {
    @inline
    def apply(): AdminDisableProviderForUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminDisableProviderForUserResponse]
    }
  }

  /** Represents the request to disable the user as an administrator.
    */
  @js.native
  trait AdminDisableUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminDisableUserRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminDisableUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminDisableUserRequest]
    }
  }

  /** Represents the response received from the server to disable the user as an administrator.
    */
  @js.native
  trait AdminDisableUserResponse extends js.Object

  object AdminDisableUserResponse {
    @inline
    def apply(): AdminDisableUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminDisableUserResponse]
    }
  }

  /** Represents the request that enables the user as an administrator.
    */
  @js.native
  trait AdminEnableUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminEnableUserRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminEnableUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminEnableUserRequest]
    }
  }

  /** Represents the response from the server for the request to enable a user as an administrator.
    */
  @js.native
  trait AdminEnableUserResponse extends js.Object

  object AdminEnableUserResponse {
    @inline
    def apply(): AdminEnableUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminEnableUserResponse]
    }
  }

  /** Sends the forgot device request, as an administrator.
    */
  @js.native
  trait AdminForgetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminForgetDeviceRequest {
    @inline
    def apply(
        DeviceKey: DeviceKeyType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminForgetDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminForgetDeviceRequest]
    }
  }

  /** Represents the request to get the device, as an administrator.
    */
  @js.native
  trait AdminGetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminGetDeviceRequest {
    @inline
    def apply(
        DeviceKey: DeviceKeyType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminGetDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminGetDeviceRequest]
    }
  }

  /** Gets the device response, as an administrator.
    */
  @js.native
  trait AdminGetDeviceResponse extends js.Object {
    var Device: DeviceType
  }

  object AdminGetDeviceResponse {
    @inline
    def apply(
        Device: DeviceType
    ): AdminGetDeviceResponse = {
      val __obj = js.Dynamic.literal(
        "Device" -> Device.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminGetDeviceResponse]
    }
  }

  /** Represents the request to get the specified user as an administrator.
    */
  @js.native
  trait AdminGetUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminGetUserRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminGetUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminGetUserRequest]
    }
  }

  /** Represents the response from the server from the request to get the specified user as an administrator.
    */
  @js.native
  trait AdminGetUserResponse extends js.Object {
    var Username: UsernameType
    var Enabled: js.UndefOr[BooleanType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var PreferredMfaSetting: js.UndefOr[StringType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var UserCreateDate: js.UndefOr[DateType]
    var UserLastModifiedDate: js.UndefOr[DateType]
    var UserMFASettingList: js.UndefOr[UserMFASettingListType]
    var UserStatus: js.UndefOr[UserStatusType]
  }

  object AdminGetUserResponse {
    @inline
    def apply(
        Username: UsernameType,
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
        PreferredMfaSetting: js.UndefOr[StringType] = js.undefined,
        UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
        UserCreateDate: js.UndefOr[DateType] = js.undefined,
        UserLastModifiedDate: js.UndefOr[DateType] = js.undefined,
        UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined,
        UserStatus: js.UndefOr[UserStatusType] = js.undefined
    ): AdminGetUserResponse = {
      val __obj = js.Dynamic.literal(
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      MFAOptions.foreach(__v => __obj.updateDynamic("MFAOptions")(__v.asInstanceOf[js.Any]))
      PreferredMfaSetting.foreach(__v => __obj.updateDynamic("PreferredMfaSetting")(__v.asInstanceOf[js.Any]))
      UserAttributes.foreach(__v => __obj.updateDynamic("UserAttributes")(__v.asInstanceOf[js.Any]))
      UserCreateDate.foreach(__v => __obj.updateDynamic("UserCreateDate")(__v.asInstanceOf[js.Any]))
      UserLastModifiedDate.foreach(__v => __obj.updateDynamic("UserLastModifiedDate")(__v.asInstanceOf[js.Any]))
      UserMFASettingList.foreach(__v => __obj.updateDynamic("UserMFASettingList")(__v.asInstanceOf[js.Any]))
      UserStatus.foreach(__v => __obj.updateDynamic("UserStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminGetUserResponse]
    }
  }

  /** Initiates the authorization request, as an administrator.
    */
  @js.native
  trait AdminInitiateAuthRequest extends js.Object {
    var AuthFlow: AuthFlowType
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var AuthParameters: js.UndefOr[AuthParametersType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var ContextData: js.UndefOr[ContextDataType]
  }

  object AdminInitiateAuthRequest {
    @inline
    def apply(
        AuthFlow: AuthFlowType,
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        AuthParameters: js.UndefOr[AuthParametersType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        ContextData: js.UndefOr[ContextDataType] = js.undefined
    ): AdminInitiateAuthRequest = {
      val __obj = js.Dynamic.literal(
        "AuthFlow" -> AuthFlow.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      AuthParameters.foreach(__v => __obj.updateDynamic("AuthParameters")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      ContextData.foreach(__v => __obj.updateDynamic("ContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminInitiateAuthRequest]
    }
  }

  /** Initiates the authentication response, as an administrator.
    */
  @js.native
  trait AdminInitiateAuthResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object AdminInitiateAuthResponse {
    @inline
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AdminInitiateAuthResponse = {
      val __obj = js.Dynamic.literal()
      AuthenticationResult.foreach(__v => __obj.updateDynamic("AuthenticationResult")(__v.asInstanceOf[js.Any]))
      ChallengeName.foreach(__v => __obj.updateDynamic("ChallengeName")(__v.asInstanceOf[js.Any]))
      ChallengeParameters.foreach(__v => __obj.updateDynamic("ChallengeParameters")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminInitiateAuthResponse]
    }
  }

  @js.native
  trait AdminLinkProviderForUserRequest extends js.Object {
    var DestinationUser: ProviderUserIdentifierType
    var SourceUser: ProviderUserIdentifierType
    var UserPoolId: StringType
  }

  object AdminLinkProviderForUserRequest {
    @inline
    def apply(
        DestinationUser: ProviderUserIdentifierType,
        SourceUser: ProviderUserIdentifierType,
        UserPoolId: StringType
    ): AdminLinkProviderForUserRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationUser" -> DestinationUser.asInstanceOf[js.Any],
        "SourceUser" -> SourceUser.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminLinkProviderForUserRequest]
    }
  }

  @js.native
  trait AdminLinkProviderForUserResponse extends js.Object

  object AdminLinkProviderForUserResponse {
    @inline
    def apply(): AdminLinkProviderForUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminLinkProviderForUserResponse]
    }
  }

  /** Represents the request to list devices, as an administrator.
    */
  @js.native
  trait AdminListDevicesRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object AdminListDevicesRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): AdminListDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminListDevicesRequest]
    }
  }

  /** Lists the device's response, as an administrator.
    */
  @js.native
  trait AdminListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object AdminListDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[DeviceListType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): AdminListDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminListDevicesResponse]
    }
  }

  @js.native
  trait AdminListGroupsForUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListGroupsForUserRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListGroupsForUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminListGroupsForUserRequest]
    }
  }

  @js.native
  trait AdminListGroupsForUserResponse extends js.Object {
    var Groups: js.UndefOr[GroupListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListGroupsForUserResponse {
    @inline
    def apply(
        Groups: js.UndefOr[GroupListType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListGroupsForUserResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminListGroupsForUserResponse]
    }
  }

  @js.native
  trait AdminListUserAuthEventsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var MaxResults: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListUserAuthEventsRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        MaxResults: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListUserAuthEventsRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminListUserAuthEventsRequest]
    }
  }

  @js.native
  trait AdminListUserAuthEventsResponse extends js.Object {
    var AuthEvents: js.UndefOr[AuthEventsType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListUserAuthEventsResponse {
    @inline
    def apply(
        AuthEvents: js.UndefOr[AuthEventsType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListUserAuthEventsResponse = {
      val __obj = js.Dynamic.literal()
      AuthEvents.foreach(__v => __obj.updateDynamic("AuthEvents")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminListUserAuthEventsResponse]
    }
  }

  @js.native
  trait AdminRemoveUserFromGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminRemoveUserFromGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminRemoveUserFromGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminRemoveUserFromGroupRequest]
    }
  }

  /** Represents the request to reset a user's password as an administrator.
    */
  @js.native
  trait AdminResetUserPasswordRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  object AdminResetUserPasswordRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    ): AdminResetUserPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminResetUserPasswordRequest]
    }
  }

  /** Represents the response from the server to reset a user password as an administrator.
    */
  @js.native
  trait AdminResetUserPasswordResponse extends js.Object

  object AdminResetUserPasswordResponse {
    @inline
    def apply(): AdminResetUserPasswordResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminResetUserPasswordResponse]
    }
  }

  /** The request to respond to the authentication challenge, as an administrator.
    */
  @js.native
  trait AdminRespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: ChallengeNameType
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var ContextData: js.UndefOr[ContextDataType]
    var Session: js.UndefOr[SessionType]
  }

  object AdminRespondToAuthChallengeRequest {
    @inline
    def apply(
        ChallengeName: ChallengeNameType,
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        ContextData: js.UndefOr[ContextDataType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AdminRespondToAuthChallengeRequest = {
      val __obj = js.Dynamic.literal(
        "ChallengeName" -> ChallengeName.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ChallengeResponses.foreach(__v => __obj.updateDynamic("ChallengeResponses")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      ContextData.foreach(__v => __obj.updateDynamic("ContextData")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminRespondToAuthChallengeRequest]
    }
  }

  /** Responds to the authentication challenge, as an administrator.
    */
  @js.native
  trait AdminRespondToAuthChallengeResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object AdminRespondToAuthChallengeResponse {
    @inline
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AdminRespondToAuthChallengeResponse = {
      val __obj = js.Dynamic.literal()
      AuthenticationResult.foreach(__v => __obj.updateDynamic("AuthenticationResult")(__v.asInstanceOf[js.Any]))
      ChallengeName.foreach(__v => __obj.updateDynamic("ChallengeName")(__v.asInstanceOf[js.Any]))
      ChallengeParameters.foreach(__v => __obj.updateDynamic("ChallengeParameters")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminRespondToAuthChallengeResponse]
    }
  }

  @js.native
  trait AdminSetUserMFAPreferenceRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
  }

  object AdminSetUserMFAPreferenceRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined,
        SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
    ): AdminSetUserMFAPreferenceRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      SMSMfaSettings.foreach(__v => __obj.updateDynamic("SMSMfaSettings")(__v.asInstanceOf[js.Any]))
      SoftwareTokenMfaSettings.foreach(__v => __obj.updateDynamic("SoftwareTokenMfaSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminSetUserMFAPreferenceRequest]
    }
  }

  @js.native
  trait AdminSetUserMFAPreferenceResponse extends js.Object

  object AdminSetUserMFAPreferenceResponse {
    @inline
    def apply(): AdminSetUserMFAPreferenceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminSetUserMFAPreferenceResponse]
    }
  }

  @js.native
  trait AdminSetUserPasswordRequest extends js.Object {
    var Password: PasswordType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Permanent: js.UndefOr[BooleanType]
  }

  object AdminSetUserPasswordRequest {
    @inline
    def apply(
        Password: PasswordType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        Permanent: js.UndefOr[BooleanType] = js.undefined
    ): AdminSetUserPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "Password" -> Password.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Permanent.foreach(__v => __obj.updateDynamic("Permanent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminSetUserPasswordRequest]
    }
  }

  @js.native
  trait AdminSetUserPasswordResponse extends js.Object

  object AdminSetUserPasswordResponse {
    @inline
    def apply(): AdminSetUserPasswordResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminSetUserPasswordResponse]
    }
  }

  /** You can use this parameter to set an MFA configuration that uses the SMS delivery medium.
    */
  @js.native
  trait AdminSetUserSettingsRequest extends js.Object {
    var MFAOptions: MFAOptionListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminSetUserSettingsRequest {
    @inline
    def apply(
        MFAOptions: MFAOptionListType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminSetUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "MFAOptions" -> MFAOptions.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminSetUserSettingsRequest]
    }
  }

  /** Represents the response from the server to set user settings as an administrator.
    */
  @js.native
  trait AdminSetUserSettingsResponse extends js.Object

  object AdminSetUserSettingsResponse {
    @inline
    def apply(): AdminSetUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminSetUserSettingsResponse]
    }
  }

  @js.native
  trait AdminUpdateAuthEventFeedbackRequest extends js.Object {
    var EventId: EventIdType
    var FeedbackValue: FeedbackValueType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminUpdateAuthEventFeedbackRequest {
    @inline
    def apply(
        EventId: EventIdType,
        FeedbackValue: FeedbackValueType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminUpdateAuthEventFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "EventId" -> EventId.asInstanceOf[js.Any],
        "FeedbackValue" -> FeedbackValue.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminUpdateAuthEventFeedbackRequest]
    }
  }

  @js.native
  trait AdminUpdateAuthEventFeedbackResponse extends js.Object

  object AdminUpdateAuthEventFeedbackResponse {
    @inline
    def apply(): AdminUpdateAuthEventFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminUpdateAuthEventFeedbackResponse]
    }
  }

  /** The request to update the device status, as an administrator.
    */
  @js.native
  trait AdminUpdateDeviceStatusRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  object AdminUpdateDeviceStatusRequest {
    @inline
    def apply(
        DeviceKey: DeviceKeyType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
    ): AdminUpdateDeviceStatusRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      DeviceRememberedStatus.foreach(__v => __obj.updateDynamic("DeviceRememberedStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminUpdateDeviceStatusRequest]
    }
  }

  /** The status response to the request to update the device, as an administrator.
    */
  @js.native
  trait AdminUpdateDeviceStatusResponse extends js.Object

  object AdminUpdateDeviceStatusResponse {
    @inline
    def apply(): AdminUpdateDeviceStatusResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminUpdateDeviceStatusResponse]
    }
  }

  /** Represents the request to update the user's attributes as an administrator.
    */
  @js.native
  trait AdminUpdateUserAttributesRequest extends js.Object {
    var UserAttributes: AttributeListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  object AdminUpdateUserAttributesRequest {
    @inline
    def apply(
        UserAttributes: AttributeListType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    ): AdminUpdateUserAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "UserAttributes" -> UserAttributes.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminUpdateUserAttributesRequest]
    }
  }

  /** Represents the response from the server for the request to update user attributes as an administrator.
    */
  @js.native
  trait AdminUpdateUserAttributesResponse extends js.Object

  object AdminUpdateUserAttributesResponse {
    @inline
    def apply(): AdminUpdateUserAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminUpdateUserAttributesResponse]
    }
  }

  /** The request to sign out of all devices, as an administrator.
    */
  @js.native
  trait AdminUserGlobalSignOutRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminUserGlobalSignOutRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminUserGlobalSignOutRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdminUserGlobalSignOutRequest]
    }
  }

  /** The global sign-out response, as an administrator.
    */
  @js.native
  trait AdminUserGlobalSignOutResponse extends js.Object

  object AdminUserGlobalSignOutResponse {
    @inline
    def apply(): AdminUserGlobalSignOutResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminUserGlobalSignOutResponse]
    }
  }

  /** The Amazon Pinpoint analytics configuration necessary to collect metrics for a user pool.
    *
    * '''Note:'''In Regions where Amazon Pinpointisn't available, user pools only support sending events to Amazon Pinpoint projects in us-east-1. In Regions where Amazon Pinpoint is available, user pools support sending events to Amazon Pinpoint projects within that same Region.
    */
  @js.native
  trait AnalyticsConfigurationType extends js.Object {
    var ApplicationArn: js.UndefOr[ArnType]
    var ApplicationId: js.UndefOr[HexStringType]
    var ExternalId: js.UndefOr[StringType]
    var RoleArn: js.UndefOr[ArnType]
    var UserDataShared: js.UndefOr[BooleanType]
  }

  object AnalyticsConfigurationType {
    @inline
    def apply(
        ApplicationArn: js.UndefOr[ArnType] = js.undefined,
        ApplicationId: js.UndefOr[HexStringType] = js.undefined,
        ExternalId: js.UndefOr[StringType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined,
        UserDataShared: js.UndefOr[BooleanType] = js.undefined
    ): AnalyticsConfigurationType = {
      val __obj = js.Dynamic.literal()
      ApplicationArn.foreach(__v => __obj.updateDynamic("ApplicationArn")(__v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      UserDataShared.foreach(__v => __obj.updateDynamic("UserDataShared")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyticsConfigurationType]
    }
  }

  /** An Amazon Pinpoint analytics endpoint. An endpoint uniquely identifies a mobile device, email address, or phone number that can receive messages from Amazon Pinpoint analytics. For more information about Amazon Web Services Regions that can contain Amazon Pinpoint resources for use with Amazon Cognito user pools, see [[https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html|Using Amazon Pinpoint analytics with Amazon Cognito user pools]].
    */
  @js.native
  trait AnalyticsMetadataType extends js.Object {
    var AnalyticsEndpointId: js.UndefOr[StringType]
  }

  object AnalyticsMetadataType {
    @inline
    def apply(
        AnalyticsEndpointId: js.UndefOr[StringType] = js.undefined
    ): AnalyticsMetadataType = {
      val __obj = js.Dynamic.literal()
      AnalyticsEndpointId.foreach(__v => __obj.updateDynamic("AnalyticsEndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyticsMetadataType]
    }
  }

  @js.native
  trait AssociateSoftwareTokenRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var Session: js.UndefOr[SessionType]
  }

  object AssociateSoftwareTokenRequest {
    @inline
    def apply(
        AccessToken: js.UndefOr[TokenModelType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AssociateSoftwareTokenRequest = {
      val __obj = js.Dynamic.literal()
      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSoftwareTokenRequest]
    }
  }

  @js.native
  trait AssociateSoftwareTokenResponse extends js.Object {
    var SecretCode: js.UndefOr[SecretCodeType]
    var Session: js.UndefOr[SessionType]
  }

  object AssociateSoftwareTokenResponse {
    @inline
    def apply(
        SecretCode: js.UndefOr[SecretCodeType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AssociateSoftwareTokenResponse = {
      val __obj = js.Dynamic.literal()
      SecretCode.foreach(__v => __obj.updateDynamic("SecretCode")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSoftwareTokenResponse]
    }
  }

  /** Specifies whether the attribute is standard or custom.
    */
  @js.native
  trait AttributeType extends js.Object {
    var Name: AttributeNameType
    var Value: js.UndefOr[AttributeValueType]
  }

  object AttributeType {
    @inline
    def apply(
        Name: AttributeNameType,
        Value: js.UndefOr[AttributeValueType] = js.undefined
    ): AttributeType = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeType]
    }
  }

  /** The authentication event type.
    */
  @js.native
  trait AuthEventType extends js.Object {
    var ChallengeResponses: js.UndefOr[ChallengeResponseListType]
    var CreationDate: js.UndefOr[DateType]
    var EventContextData: js.UndefOr[EventContextDataType]
    var EventFeedback: js.UndefOr[EventFeedbackType]
    var EventId: js.UndefOr[StringType]
    var EventResponse: js.UndefOr[EventResponseType]
    var EventRisk: js.UndefOr[EventRiskType]
    var EventType: js.UndefOr[EventType]
  }

  object AuthEventType {
    @inline
    def apply(
        ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        EventContextData: js.UndefOr[EventContextDataType] = js.undefined,
        EventFeedback: js.UndefOr[EventFeedbackType] = js.undefined,
        EventId: js.UndefOr[StringType] = js.undefined,
        EventResponse: js.UndefOr[EventResponseType] = js.undefined,
        EventRisk: js.UndefOr[EventRiskType] = js.undefined,
        EventType: js.UndefOr[EventType] = js.undefined
    ): AuthEventType = {
      val __obj = js.Dynamic.literal()
      ChallengeResponses.foreach(__v => __obj.updateDynamic("ChallengeResponses")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      EventContextData.foreach(__v => __obj.updateDynamic("EventContextData")(__v.asInstanceOf[js.Any]))
      EventFeedback.foreach(__v => __obj.updateDynamic("EventFeedback")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      EventResponse.foreach(__v => __obj.updateDynamic("EventResponse")(__v.asInstanceOf[js.Any]))
      EventRisk.foreach(__v => __obj.updateDynamic("EventRisk")(__v.asInstanceOf[js.Any]))
      EventType.foreach(__v => __obj.updateDynamic("EventType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthEventType]
    }
  }

  /** The authentication result.
    */
  @js.native
  trait AuthenticationResultType extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var ExpiresIn: js.UndefOr[IntegerType]
    var IdToken: js.UndefOr[TokenModelType]
    var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType]
    var RefreshToken: js.UndefOr[TokenModelType]
    var TokenType: js.UndefOr[StringType]
  }

  object AuthenticationResultType {
    @inline
    def apply(
        AccessToken: js.UndefOr[TokenModelType] = js.undefined,
        ExpiresIn: js.UndefOr[IntegerType] = js.undefined,
        IdToken: js.UndefOr[TokenModelType] = js.undefined,
        NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.undefined,
        RefreshToken: js.UndefOr[TokenModelType] = js.undefined,
        TokenType: js.UndefOr[StringType] = js.undefined
    ): AuthenticationResultType = {
      val __obj = js.Dynamic.literal()
      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      ExpiresIn.foreach(__v => __obj.updateDynamic("ExpiresIn")(__v.asInstanceOf[js.Any]))
      IdToken.foreach(__v => __obj.updateDynamic("IdToken")(__v.asInstanceOf[js.Any]))
      NewDeviceMetadata.foreach(__v => __obj.updateDynamic("NewDeviceMetadata")(__v.asInstanceOf[js.Any]))
      RefreshToken.foreach(__v => __obj.updateDynamic("RefreshToken")(__v.asInstanceOf[js.Any]))
      TokenType.foreach(__v => __obj.updateDynamic("TokenType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationResultType]
    }
  }

  /** The challenge response type.
    */
  @js.native
  trait ChallengeResponseType extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeName]
    var ChallengeResponse: js.UndefOr[ChallengeResponse]
  }

  object ChallengeResponseType {
    @inline
    def apply(
        ChallengeName: js.UndefOr[ChallengeName] = js.undefined,
        ChallengeResponse: js.UndefOr[ChallengeResponse] = js.undefined
    ): ChallengeResponseType = {
      val __obj = js.Dynamic.literal()
      ChallengeName.foreach(__v => __obj.updateDynamic("ChallengeName")(__v.asInstanceOf[js.Any]))
      ChallengeResponse.foreach(__v => __obj.updateDynamic("ChallengeResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChallengeResponseType]
    }
  }

  /** Represents the request to change a user password.
    */
  @js.native
  trait ChangePasswordRequest extends js.Object {
    var AccessToken: TokenModelType
    var PreviousPassword: PasswordType
    var ProposedPassword: PasswordType
  }

  object ChangePasswordRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        PreviousPassword: PasswordType,
        ProposedPassword: PasswordType
    ): ChangePasswordRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "PreviousPassword" -> PreviousPassword.asInstanceOf[js.Any],
        "ProposedPassword" -> ProposedPassword.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChangePasswordRequest]
    }
  }

  /** The response from the server to the change password request.
    */
  @js.native
  trait ChangePasswordResponse extends js.Object

  object ChangePasswordResponse {
    @inline
    def apply(): ChangePasswordResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangePasswordResponse]
    }
  }

  /** The delivery details for an email or SMS message that Amazon Cognito sent for authentication or verification.
    */
  @js.native
  trait CodeDeliveryDetailsType extends js.Object {
    var AttributeName: js.UndefOr[AttributeNameType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
    var Destination: js.UndefOr[StringType]
  }

  object CodeDeliveryDetailsType {
    @inline
    def apply(
        AttributeName: js.UndefOr[AttributeNameType] = js.undefined,
        DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined,
        Destination: js.UndefOr[StringType] = js.undefined
    ): CodeDeliveryDetailsType = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      DeliveryMedium.foreach(__v => __obj.updateDynamic("DeliveryMedium")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeDeliveryDetailsType]
    }
  }

  /** The compromised credentials actions type.
    */
  @js.native
  trait CompromisedCredentialsActionsType extends js.Object {
    var EventAction: CompromisedCredentialsEventActionType
  }

  object CompromisedCredentialsActionsType {
    @inline
    def apply(
        EventAction: CompromisedCredentialsEventActionType
    ): CompromisedCredentialsActionsType = {
      val __obj = js.Dynamic.literal(
        "EventAction" -> EventAction.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CompromisedCredentialsActionsType]
    }
  }

  /** The compromised credentials risk configuration type.
    */
  @js.native
  trait CompromisedCredentialsRiskConfigurationType extends js.Object {
    var Actions: CompromisedCredentialsActionsType
    var EventFilter: js.UndefOr[EventFiltersType]
  }

  object CompromisedCredentialsRiskConfigurationType {
    @inline
    def apply(
        Actions: CompromisedCredentialsActionsType,
        EventFilter: js.UndefOr[EventFiltersType] = js.undefined
    ): CompromisedCredentialsRiskConfigurationType = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any]
      )

      EventFilter.foreach(__v => __obj.updateDynamic("EventFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompromisedCredentialsRiskConfigurationType]
    }
  }

  /** Confirms the device request.
    */
  @js.native
  trait ConfirmDeviceRequest extends js.Object {
    var AccessToken: TokenModelType
    var DeviceKey: DeviceKeyType
    var DeviceName: js.UndefOr[DeviceNameType]
    var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType]
  }

  object ConfirmDeviceRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        DeviceKey: DeviceKeyType,
        DeviceName: js.UndefOr[DeviceNameType] = js.undefined,
        DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.undefined
    ): ConfirmDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any]
      )

      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      DeviceSecretVerifierConfig.foreach(__v => __obj.updateDynamic("DeviceSecretVerifierConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmDeviceRequest]
    }
  }

  /** Confirms the device response.
    */
  @js.native
  trait ConfirmDeviceResponse extends js.Object {
    var UserConfirmationNecessary: js.UndefOr[BooleanType]
  }

  object ConfirmDeviceResponse {
    @inline
    def apply(
        UserConfirmationNecessary: js.UndefOr[BooleanType] = js.undefined
    ): ConfirmDeviceResponse = {
      val __obj = js.Dynamic.literal()
      UserConfirmationNecessary.foreach(__v => __obj.updateDynamic("UserConfirmationNecessary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmDeviceResponse]
    }
  }

  /** The request representing the confirmation for a password reset.
    */
  @js.native
  trait ConfirmForgotPasswordRequest extends js.Object {
    var ClientId: ClientIdType
    var ConfirmationCode: ConfirmationCodeType
    var Password: PasswordType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ConfirmForgotPasswordRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        ConfirmationCode: ConfirmationCodeType,
        Password: PasswordType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ConfirmForgotPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "ConfirmationCode" -> ConfirmationCode.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      SecretHash.foreach(__v => __obj.updateDynamic("SecretHash")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmForgotPasswordRequest]
    }
  }

  /** The response from the server that results from a user's request to retrieve a forgotten password.
    */
  @js.native
  trait ConfirmForgotPasswordResponse extends js.Object

  object ConfirmForgotPasswordResponse {
    @inline
    def apply(): ConfirmForgotPasswordResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmForgotPasswordResponse]
    }
  }

  /** Represents the request to confirm registration of a user.
    */
  @js.native
  trait ConfirmSignUpRequest extends js.Object {
    var ClientId: ClientIdType
    var ConfirmationCode: ConfirmationCodeType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ConfirmSignUpRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        ConfirmationCode: ConfirmationCodeType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ConfirmSignUpRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "ConfirmationCode" -> ConfirmationCode.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      ForceAliasCreation.foreach(__v => __obj.updateDynamic("ForceAliasCreation")(__v.asInstanceOf[js.Any]))
      SecretHash.foreach(__v => __obj.updateDynamic("SecretHash")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmSignUpRequest]
    }
  }

  /** Represents the response from the server for the registration confirmation.
    */
  @js.native
  trait ConfirmSignUpResponse extends js.Object

  object ConfirmSignUpResponse {
    @inline
    def apply(): ConfirmSignUpResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmSignUpResponse]
    }
  }

  /** Contextual user data type used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  @js.native
  trait ContextDataType extends js.Object {
    var HttpHeaders: HttpHeaderList
    var IpAddress: StringType
    var ServerName: StringType
    var ServerPath: StringType
    var EncodedData: js.UndefOr[StringType]
  }

  object ContextDataType {
    @inline
    def apply(
        HttpHeaders: HttpHeaderList,
        IpAddress: StringType,
        ServerName: StringType,
        ServerPath: StringType,
        EncodedData: js.UndefOr[StringType] = js.undefined
    ): ContextDataType = {
      val __obj = js.Dynamic.literal(
        "HttpHeaders" -> HttpHeaders.asInstanceOf[js.Any],
        "IpAddress" -> IpAddress.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any],
        "ServerPath" -> ServerPath.asInstanceOf[js.Any]
      )

      EncodedData.foreach(__v => __obj.updateDynamic("EncodedData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContextDataType]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Description: js.UndefOr[DescriptionType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        Precedence: js.UndefOr[PrecedenceType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Precedence.foreach(__v => __obj.updateDynamic("Precedence")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object CreateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[GroupType] = js.undefined
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateIdentityProviderRequest extends js.Object {
    var ProviderDetails: ProviderDetailsType
    var ProviderName: ProviderNameTypeV1
    var ProviderType: IdentityProviderTypeType
    var UserPoolId: UserPoolIdType
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
  }

  object CreateIdentityProviderRequest {
    @inline
    def apply(
        ProviderDetails: ProviderDetailsType,
        ProviderName: ProviderNameTypeV1,
        ProviderType: IdentityProviderTypeType,
        UserPoolId: UserPoolIdType,
        AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
        IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
    ): CreateIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ProviderDetails" -> ProviderDetails.asInstanceOf[js.Any],
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "ProviderType" -> ProviderType.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AttributeMapping.foreach(__v => __obj.updateDynamic("AttributeMapping")(__v.asInstanceOf[js.Any]))
      IdpIdentifiers.foreach(__v => __obj.updateDynamic("IdpIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIdentityProviderRequest]
    }
  }

  @js.native
  trait CreateIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object CreateIdentityProviderResponse {
    @inline
    def apply(
        IdentityProvider: IdentityProviderType
    ): CreateIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateIdentityProviderResponse]
    }
  }

  @js.native
  trait CreateResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var Name: ResourceServerNameType
    var UserPoolId: UserPoolIdType
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  object CreateResourceServerRequest {
    @inline
    def apply(
        Identifier: ResourceServerIdentifierType,
        Name: ResourceServerNameType,
        UserPoolId: UserPoolIdType,
        Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    ): CreateResourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      Scopes.foreach(__v => __obj.updateDynamic("Scopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceServerRequest]
    }
  }

  @js.native
  trait CreateResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  object CreateResourceServerResponse {
    @inline
    def apply(
        ResourceServer: ResourceServerType
    ): CreateResourceServerResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceServer" -> ResourceServer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateResourceServerResponse]
    }
  }

  /** Represents the request to create the user import job.
    */
  @js.native
  trait CreateUserImportJobRequest extends js.Object {
    var CloudWatchLogsRoleArn: ArnType
    var JobName: UserImportJobNameType
    var UserPoolId: UserPoolIdType
  }

  object CreateUserImportJobRequest {
    @inline
    def apply(
        CloudWatchLogsRoleArn: ArnType,
        JobName: UserImportJobNameType,
        UserPoolId: UserPoolIdType
    ): CreateUserImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.asInstanceOf[js.Any],
        "JobName" -> JobName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateUserImportJobRequest]
    }
  }

  /** Represents the response from the server to the request to create the user import job.
    */
  @js.native
  trait CreateUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object CreateUserImportJobResponse {
    @inline
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): CreateUserImportJobResponse = {
      val __obj = js.Dynamic.literal()
      UserImportJob.foreach(__v => __obj.updateDynamic("UserImportJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserImportJobResponse]
    }
  }

  /** Represents the request to create a user pool client.
    */
  @js.native
  trait CreateUserPoolClientRequest extends js.Object {
    var ClientName: ClientNameType
    var UserPoolId: UserPoolIdType
    var AccessTokenValidity: js.UndefOr[AccessTokenValidityType]
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var AuthSessionValidity: js.UndefOr[AuthSessionValidityType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType]
    var EnableTokenRevocation: js.UndefOr[WrappedBooleanType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var GenerateSecret: js.UndefOr[GenerateSecret]
    var IdTokenValidity: js.UndefOr[IdTokenValidityType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
    var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var TokenValidityUnits: js.UndefOr[TokenValidityUnitsType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  object CreateUserPoolClientRequest {
    @inline
    def apply(
        ClientName: ClientNameType,
        UserPoolId: UserPoolIdType,
        AccessTokenValidity: js.UndefOr[AccessTokenValidityType] = js.undefined,
        AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
        AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
        AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
        AuthSessionValidity: js.UndefOr[AuthSessionValidityType] = js.undefined,
        CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
        DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
        EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType] = js.undefined,
        EnableTokenRevocation: js.UndefOr[WrappedBooleanType] = js.undefined,
        ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
        GenerateSecret: js.UndefOr[GenerateSecret] = js.undefined,
        IdTokenValidity: js.UndefOr[IdTokenValidityType] = js.undefined,
        LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined,
        PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.undefined,
        ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
        RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
        SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
        TokenValidityUnits: js.UndefOr[TokenValidityUnitsType] = js.undefined,
        WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    ): CreateUserPoolClientRequest = {
      val __obj = js.Dynamic.literal(
        "ClientName" -> ClientName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AccessTokenValidity.foreach(__v => __obj.updateDynamic("AccessTokenValidity")(__v.asInstanceOf[js.Any]))
      AllowedOAuthFlows.foreach(__v => __obj.updateDynamic("AllowedOAuthFlows")(__v.asInstanceOf[js.Any]))
      AllowedOAuthFlowsUserPoolClient.foreach(__v => __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(__v.asInstanceOf[js.Any]))
      AllowedOAuthScopes.foreach(__v => __obj.updateDynamic("AllowedOAuthScopes")(__v.asInstanceOf[js.Any]))
      AnalyticsConfiguration.foreach(__v => __obj.updateDynamic("AnalyticsConfiguration")(__v.asInstanceOf[js.Any]))
      AuthSessionValidity.foreach(__v => __obj.updateDynamic("AuthSessionValidity")(__v.asInstanceOf[js.Any]))
      CallbackURLs.foreach(__v => __obj.updateDynamic("CallbackURLs")(__v.asInstanceOf[js.Any]))
      DefaultRedirectURI.foreach(__v => __obj.updateDynamic("DefaultRedirectURI")(__v.asInstanceOf[js.Any]))
      EnablePropagateAdditionalUserContextData.foreach(__v => __obj.updateDynamic("EnablePropagateAdditionalUserContextData")(__v.asInstanceOf[js.Any]))
      EnableTokenRevocation.foreach(__v => __obj.updateDynamic("EnableTokenRevocation")(__v.asInstanceOf[js.Any]))
      ExplicitAuthFlows.foreach(__v => __obj.updateDynamic("ExplicitAuthFlows")(__v.asInstanceOf[js.Any]))
      GenerateSecret.foreach(__v => __obj.updateDynamic("GenerateSecret")(__v.asInstanceOf[js.Any]))
      IdTokenValidity.foreach(__v => __obj.updateDynamic("IdTokenValidity")(__v.asInstanceOf[js.Any]))
      LogoutURLs.foreach(__v => __obj.updateDynamic("LogoutURLs")(__v.asInstanceOf[js.Any]))
      PreventUserExistenceErrors.foreach(__v => __obj.updateDynamic("PreventUserExistenceErrors")(__v.asInstanceOf[js.Any]))
      ReadAttributes.foreach(__v => __obj.updateDynamic("ReadAttributes")(__v.asInstanceOf[js.Any]))
      RefreshTokenValidity.foreach(__v => __obj.updateDynamic("RefreshTokenValidity")(__v.asInstanceOf[js.Any]))
      SupportedIdentityProviders.foreach(__v => __obj.updateDynamic("SupportedIdentityProviders")(__v.asInstanceOf[js.Any]))
      TokenValidityUnits.foreach(__v => __obj.updateDynamic("TokenValidityUnits")(__v.asInstanceOf[js.Any]))
      WriteAttributes.foreach(__v => __obj.updateDynamic("WriteAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserPoolClientRequest]
    }
  }

  /** Represents the response from the server to create a user pool client.
    */
  @js.native
  trait CreateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object CreateUserPoolClientResponse {
    @inline
    def apply(
        UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
    ): CreateUserPoolClientResponse = {
      val __obj = js.Dynamic.literal()
      UserPoolClient.foreach(__v => __obj.updateDynamic("UserPoolClient")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserPoolClientResponse]
    }
  }

  @js.native
  trait CreateUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType]
  }

  object CreateUserPoolDomainRequest {
    @inline
    def apply(
        Domain: DomainType,
        UserPoolId: UserPoolIdType,
        CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
    ): CreateUserPoolDomainRequest = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      CustomDomainConfig.foreach(__v => __obj.updateDynamic("CustomDomainConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserPoolDomainRequest]
    }
  }

  @js.native
  trait CreateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  object CreateUserPoolDomainResponse {
    @inline
    def apply(
        CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
    ): CreateUserPoolDomainResponse = {
      val __obj = js.Dynamic.literal()
      CloudFrontDomain.foreach(__v => __obj.updateDynamic("CloudFrontDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserPoolDomainResponse]
    }
  }

  /** Represents the request to create a user pool.
    */
  @js.native
  trait CreateUserPoolRequest extends js.Object {
    var PoolName: UserPoolNameType
    var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var AliasAttributes: js.UndefOr[AliasAttributesListType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var DeletionProtection: js.UndefOr[DeletionProtectionType]
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType]
    var EmailConfiguration: js.UndefOr[EmailConfigurationType]
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var Policies: js.UndefOr[UserPoolPolicyType]
    var Schema: js.UndefOr[SchemaAttributesListType]
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType]
    var UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType]
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType]
    var UsernameConfiguration: js.UndefOr[UsernameConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object CreateUserPoolRequest {
    @inline
    def apply(
        PoolName: UserPoolNameType,
        AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined,
        AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
        AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined,
        AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
        DeletionProtection: js.UndefOr[DeletionProtectionType] = js.undefined,
        DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined,
        EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined,
        EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        Policies: js.UndefOr[UserPoolPolicyType] = js.undefined,
        Schema: js.UndefOr[SchemaAttributesListType] = js.undefined,
        SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined,
        SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType] = js.undefined,
        UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
        UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
        UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined,
        UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.undefined,
        VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
    ): CreateUserPoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      )

      AccountRecoverySetting.foreach(__v => __obj.updateDynamic("AccountRecoverySetting")(__v.asInstanceOf[js.Any]))
      AdminCreateUserConfig.foreach(__v => __obj.updateDynamic("AdminCreateUserConfig")(__v.asInstanceOf[js.Any]))
      AliasAttributes.foreach(__v => __obj.updateDynamic("AliasAttributes")(__v.asInstanceOf[js.Any]))
      AutoVerifiedAttributes.foreach(__v => __obj.updateDynamic("AutoVerifiedAttributes")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      DeviceConfiguration.foreach(__v => __obj.updateDynamic("DeviceConfiguration")(__v.asInstanceOf[js.Any]))
      EmailConfiguration.foreach(__v => __obj.updateDynamic("EmailConfiguration")(__v.asInstanceOf[js.Any]))
      EmailVerificationMessage.foreach(__v => __obj.updateDynamic("EmailVerificationMessage")(__v.asInstanceOf[js.Any]))
      EmailVerificationSubject.foreach(__v => __obj.updateDynamic("EmailVerificationSubject")(__v.asInstanceOf[js.Any]))
      LambdaConfig.foreach(__v => __obj.updateDynamic("LambdaConfig")(__v.asInstanceOf[js.Any]))
      MfaConfiguration.foreach(__v => __obj.updateDynamic("MfaConfiguration")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      SmsAuthenticationMessage.foreach(__v => __obj.updateDynamic("SmsAuthenticationMessage")(__v.asInstanceOf[js.Any]))
      SmsConfiguration.foreach(__v => __obj.updateDynamic("SmsConfiguration")(__v.asInstanceOf[js.Any]))
      SmsVerificationMessage.foreach(__v => __obj.updateDynamic("SmsVerificationMessage")(__v.asInstanceOf[js.Any]))
      UserAttributeUpdateSettings.foreach(__v => __obj.updateDynamic("UserAttributeUpdateSettings")(__v.asInstanceOf[js.Any]))
      UserPoolAddOns.foreach(__v => __obj.updateDynamic("UserPoolAddOns")(__v.asInstanceOf[js.Any]))
      UserPoolTags.foreach(__v => __obj.updateDynamic("UserPoolTags")(__v.asInstanceOf[js.Any]))
      UsernameAttributes.foreach(__v => __obj.updateDynamic("UsernameAttributes")(__v.asInstanceOf[js.Any]))
      UsernameConfiguration.foreach(__v => __obj.updateDynamic("UsernameConfiguration")(__v.asInstanceOf[js.Any]))
      VerificationMessageTemplate.foreach(__v => __obj.updateDynamic("VerificationMessageTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserPoolRequest]
    }
  }

  /** Represents the response from the server for the request to create a user pool.
    */
  @js.native
  trait CreateUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  object CreateUserPoolResponse {
    @inline
    def apply(
        UserPool: js.UndefOr[UserPoolType] = js.undefined
    ): CreateUserPoolResponse = {
      val __obj = js.Dynamic.literal()
      UserPool.foreach(__v => __obj.updateDynamic("UserPool")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserPoolResponse]
    }
  }

  /** The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  @js.native
  trait CustomDomainConfigType extends js.Object {
    var CertificateArn: ArnType
  }

  object CustomDomainConfigType {
    @inline
    def apply(
        CertificateArn: ArnType
    ): CustomDomainConfigType = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomDomainConfigType]
    }
  }

  /** A custom email sender Lambda configuration type.
    */
  @js.native
  trait CustomEmailLambdaVersionConfigType extends js.Object {
    var LambdaArn: ArnType
    var LambdaVersion: CustomEmailSenderLambdaVersionType
  }

  object CustomEmailLambdaVersionConfigType {
    @inline
    def apply(
        LambdaArn: ArnType,
        LambdaVersion: CustomEmailSenderLambdaVersionType
    ): CustomEmailLambdaVersionConfigType = {
      val __obj = js.Dynamic.literal(
        "LambdaArn" -> LambdaArn.asInstanceOf[js.Any],
        "LambdaVersion" -> LambdaVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomEmailLambdaVersionConfigType]
    }
  }

  /** A custom SMS sender Lambda configuration type.
    */
  @js.native
  trait CustomSMSLambdaVersionConfigType extends js.Object {
    var LambdaArn: ArnType
    var LambdaVersion: CustomSMSSenderLambdaVersionType
  }

  object CustomSMSLambdaVersionConfigType {
    @inline
    def apply(
        LambdaArn: ArnType,
        LambdaVersion: CustomSMSSenderLambdaVersionType
    ): CustomSMSLambdaVersionConfigType = {
      val __obj = js.Dynamic.literal(
        "LambdaArn" -> LambdaArn.asInstanceOf[js.Any],
        "LambdaVersion" -> LambdaVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomSMSLambdaVersionConfigType]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
  }

  object DeleteIdentityProviderRequest {
    @inline
    def apply(
        ProviderName: ProviderNameType,
        UserPoolId: UserPoolIdType
    ): DeleteIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIdentityProviderRequest]
    }
  }

  @js.native
  trait DeleteResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var UserPoolId: UserPoolIdType
  }

  object DeleteResourceServerRequest {
    @inline
    def apply(
        Identifier: ResourceServerIdentifierType,
        UserPoolId: UserPoolIdType
    ): DeleteResourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourceServerRequest]
    }
  }

  /** Represents the request to delete user attributes.
    */
  @js.native
  trait DeleteUserAttributesRequest extends js.Object {
    var AccessToken: TokenModelType
    var UserAttributeNames: AttributeNameListType
  }

  object DeleteUserAttributesRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        UserAttributeNames: AttributeNameListType
    ): DeleteUserAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "UserAttributeNames" -> UserAttributeNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserAttributesRequest]
    }
  }

  /** Represents the response from the server to delete user attributes.
    */
  @js.native
  trait DeleteUserAttributesResponse extends js.Object

  object DeleteUserAttributesResponse {
    @inline
    def apply(): DeleteUserAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserAttributesResponse]
    }
  }

  /** Represents the request to delete a user pool client.
    */
  @js.native
  trait DeleteUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
  }

  object DeleteUserPoolClientRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType
    ): DeleteUserPoolClientRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserPoolClientRequest]
    }
  }

  @js.native
  trait DeleteUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
  }

  object DeleteUserPoolDomainRequest {
    @inline
    def apply(
        Domain: DomainType,
        UserPoolId: UserPoolIdType
    ): DeleteUserPoolDomainRequest = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserPoolDomainRequest]
    }
  }

  @js.native
  trait DeleteUserPoolDomainResponse extends js.Object

  object DeleteUserPoolDomainResponse {
    @inline
    def apply(): DeleteUserPoolDomainResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserPoolDomainResponse]
    }
  }

  /** Represents the request to delete a user pool.
    */
  @js.native
  trait DeleteUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object DeleteUserPoolRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType
    ): DeleteUserPoolRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserPoolRequest]
    }
  }

  /** Represents the request to delete a user.
    */
  @js.native
  trait DeleteUserRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  object DeleteUserRequest {
    @inline
    def apply(
        AccessToken: TokenModelType
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
  }

  object DescribeIdentityProviderRequest {
    @inline
    def apply(
        ProviderName: ProviderNameType,
        UserPoolId: UserPoolIdType
    ): DescribeIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIdentityProviderRequest]
    }
  }

  @js.native
  trait DescribeIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object DescribeIdentityProviderResponse {
    @inline
    def apply(
        IdentityProvider: IdentityProviderType
    ): DescribeIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIdentityProviderResponse]
    }
  }

  @js.native
  trait DescribeResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var UserPoolId: UserPoolIdType
  }

  object DescribeResourceServerRequest {
    @inline
    def apply(
        Identifier: ResourceServerIdentifierType,
        UserPoolId: UserPoolIdType
    ): DescribeResourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeResourceServerRequest]
    }
  }

  @js.native
  trait DescribeResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  object DescribeResourceServerResponse {
    @inline
    def apply(
        ResourceServer: ResourceServerType
    ): DescribeResourceServerResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceServer" -> ResourceServer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeResourceServerResponse]
    }
  }

  @js.native
  trait DescribeRiskConfigurationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var ClientId: js.UndefOr[ClientIdType]
  }

  object DescribeRiskConfigurationRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        ClientId: js.UndefOr[ClientIdType] = js.undefined
    ): DescribeRiskConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRiskConfigurationRequest]
    }
  }

  @js.native
  trait DescribeRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: RiskConfigurationType
  }

  object DescribeRiskConfigurationResponse {
    @inline
    def apply(
        RiskConfiguration: RiskConfigurationType
    ): DescribeRiskConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "RiskConfiguration" -> RiskConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRiskConfigurationResponse]
    }
  }

  /** Represents the request to describe the user import job.
    */
  @js.native
  trait DescribeUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  object DescribeUserImportJobRequest {
    @inline
    def apply(
        JobId: UserImportJobIdType,
        UserPoolId: UserPoolIdType
    ): DescribeUserImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserImportJobRequest]
    }
  }

  /** Represents the response from the server to the request to describe the user import job.
    */
  @js.native
  trait DescribeUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object DescribeUserImportJobResponse {
    @inline
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): DescribeUserImportJobResponse = {
      val __obj = js.Dynamic.literal()
      UserImportJob.foreach(__v => __obj.updateDynamic("UserImportJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserImportJobResponse]
    }
  }

  /** Represents the request to describe a user pool client.
    */
  @js.native
  trait DescribeUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
  }

  object DescribeUserPoolClientRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType
    ): DescribeUserPoolClientRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserPoolClientRequest]
    }
  }

  /** Represents the response from the server from a request to describe the user pool client.
    */
  @js.native
  trait DescribeUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object DescribeUserPoolClientResponse {
    @inline
    def apply(
        UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
    ): DescribeUserPoolClientResponse = {
      val __obj = js.Dynamic.literal()
      UserPoolClient.foreach(__v => __obj.updateDynamic("UserPoolClient")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserPoolClientResponse]
    }
  }

  @js.native
  trait DescribeUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
  }

  object DescribeUserPoolDomainRequest {
    @inline
    def apply(
        Domain: DomainType
    ): DescribeUserPoolDomainRequest = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserPoolDomainRequest]
    }
  }

  @js.native
  trait DescribeUserPoolDomainResponse extends js.Object {
    var DomainDescription: js.UndefOr[DomainDescriptionType]
  }

  object DescribeUserPoolDomainResponse {
    @inline
    def apply(
        DomainDescription: js.UndefOr[DomainDescriptionType] = js.undefined
    ): DescribeUserPoolDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainDescription.foreach(__v => __obj.updateDynamic("DomainDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserPoolDomainResponse]
    }
  }

  /** Represents the request to describe the user pool.
    */
  @js.native
  trait DescribeUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object DescribeUserPoolRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType
    ): DescribeUserPoolRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserPoolRequest]
    }
  }

  /** Represents the response to describe the user pool.
    */
  @js.native
  trait DescribeUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  object DescribeUserPoolResponse {
    @inline
    def apply(
        UserPool: js.UndefOr[UserPoolType] = js.undefined
    ): DescribeUserPoolResponse = {
      val __obj = js.Dynamic.literal()
      UserPool.foreach(__v => __obj.updateDynamic("UserPool")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserPoolResponse]
    }
  }

  /** The device-remembering configuration for a user pool. A [[https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html| DescribeUserPool]] request returns a null value for this object when the user pool isn't configured to remember devices. When device remembering is active, you can remember a user's device with a [[https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html|ConfirmDevice]] API request. Additionally. when the property <code>DeviceOnlyRememberedOnUserPrompt</code> is <code>true</code>, you must follow <code>ConfirmDevice</code> with an [[https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html|UpdateDeviceStatus]] API request that sets the user's device to <code>remembered</code> or <code>not_remembered</code>. To sign in with a remembered device, include <code>DEVICE_KEY</code> in the authentication parameters in your user's
    * [[https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html| InitiateAuth]] request. If your app doesn't include a <code>DEVICE_KEY</code> parameter, the [[https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html#API_InitiateAuth_ResponseSyntax|response]] from Amazon Cognito includes newly-generated <code>DEVICE_KEY</code> and <code>DEVICE_GROUP_KEY</code> values under <code>NewDeviceMetadata</code>. Store these values to use in future device-authentication requests.
    *
    * '''Note:'''When you provide a value for any property of <code>DeviceConfiguration</code>, you activate the device remembering for the user pool.
    */
  @js.native
  trait DeviceConfigurationType extends js.Object {
    var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType]
    var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType]
  }

  object DeviceConfigurationType {
    @inline
    def apply(
        ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.undefined,
        DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.undefined
    ): DeviceConfigurationType = {
      val __obj = js.Dynamic.literal()
      ChallengeRequiredOnNewDevice.foreach(__v => __obj.updateDynamic("ChallengeRequiredOnNewDevice")(__v.asInstanceOf[js.Any]))
      DeviceOnlyRememberedOnUserPrompt.foreach(__v => __obj.updateDynamic("DeviceOnlyRememberedOnUserPrompt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceConfigurationType]
    }
  }

  /** The device verifier against which it is authenticated.
    */
  @js.native
  trait DeviceSecretVerifierConfigType extends js.Object {
    var PasswordVerifier: js.UndefOr[StringType]
    var Salt: js.UndefOr[StringType]
  }

  object DeviceSecretVerifierConfigType {
    @inline
    def apply(
        PasswordVerifier: js.UndefOr[StringType] = js.undefined,
        Salt: js.UndefOr[StringType] = js.undefined
    ): DeviceSecretVerifierConfigType = {
      val __obj = js.Dynamic.literal()
      PasswordVerifier.foreach(__v => __obj.updateDynamic("PasswordVerifier")(__v.asInstanceOf[js.Any]))
      Salt.foreach(__v => __obj.updateDynamic("Salt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceSecretVerifierConfigType]
    }
  }

  /** The device type.
    */
  @js.native
  trait DeviceType extends js.Object {
    var DeviceAttributes: js.UndefOr[AttributeListType]
    var DeviceCreateDate: js.UndefOr[DateType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var DeviceLastAuthenticatedDate: js.UndefOr[DateType]
    var DeviceLastModifiedDate: js.UndefOr[DateType]
  }

  object DeviceType {
    @inline
    def apply(
        DeviceAttributes: js.UndefOr[AttributeListType] = js.undefined,
        DeviceCreateDate: js.UndefOr[DateType] = js.undefined,
        DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
        DeviceLastAuthenticatedDate: js.UndefOr[DateType] = js.undefined,
        DeviceLastModifiedDate: js.UndefOr[DateType] = js.undefined
    ): DeviceType = {
      val __obj = js.Dynamic.literal()
      DeviceAttributes.foreach(__v => __obj.updateDynamic("DeviceAttributes")(__v.asInstanceOf[js.Any]))
      DeviceCreateDate.foreach(__v => __obj.updateDynamic("DeviceCreateDate")(__v.asInstanceOf[js.Any]))
      DeviceKey.foreach(__v => __obj.updateDynamic("DeviceKey")(__v.asInstanceOf[js.Any]))
      DeviceLastAuthenticatedDate.foreach(__v => __obj.updateDynamic("DeviceLastAuthenticatedDate")(__v.asInstanceOf[js.Any]))
      DeviceLastModifiedDate.foreach(__v => __obj.updateDynamic("DeviceLastModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceType]
    }
  }

  /** A container for information about a domain.
    */
  @js.native
  trait DomainDescriptionType extends js.Object {
    var AWSAccountId: js.UndefOr[AWSAccountIdType]
    var CloudFrontDistribution: js.UndefOr[StringType]
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType]
    var Domain: js.UndefOr[DomainType]
    var S3Bucket: js.UndefOr[S3BucketType]
    var Status: js.UndefOr[DomainStatusType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Version: js.UndefOr[DomainVersionType]
  }

  object DomainDescriptionType {
    @inline
    def apply(
        AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined,
        CloudFrontDistribution: js.UndefOr[StringType] = js.undefined,
        CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined,
        Domain: js.UndefOr[DomainType] = js.undefined,
        S3Bucket: js.UndefOr[S3BucketType] = js.undefined,
        Status: js.UndefOr[DomainStatusType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
        Version: js.UndefOr[DomainVersionType] = js.undefined
    ): DomainDescriptionType = {
      val __obj = js.Dynamic.literal()
      AWSAccountId.foreach(__v => __obj.updateDynamic("AWSAccountId")(__v.asInstanceOf[js.Any]))
      CloudFrontDistribution.foreach(__v => __obj.updateDynamic("CloudFrontDistribution")(__v.asInstanceOf[js.Any]))
      CustomDomainConfig.foreach(__v => __obj.updateDynamic("CustomDomainConfig")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDescriptionType]
    }
  }

  /** The email configuration of your user pool. The email configuration type sets your preferred sending method, Amazon Web Services Region, and sender for messages from your user pool.
    *
    * '''Note:'''Amazon Cognito can send email messages with Amazon Simple Email Service resources in the Amazon Web Services Region where you created your user pool, and in alternate Regions in some cases. For more information on the supported Regions, see [[https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html|Email settings for Amazon Cognito user pools]].
    */
  @js.native
  trait EmailConfigurationType extends js.Object {
    var ConfigurationSet: js.UndefOr[SESConfigurationSet]
    var EmailSendingAccount: js.UndefOr[EmailSendingAccountType]
    var From: js.UndefOr[StringType]
    var ReplyToEmailAddress: js.UndefOr[EmailAddressType]
    var SourceArn: js.UndefOr[ArnType]
  }

  object EmailConfigurationType {
    @inline
    def apply(
        ConfigurationSet: js.UndefOr[SESConfigurationSet] = js.undefined,
        EmailSendingAccount: js.UndefOr[EmailSendingAccountType] = js.undefined,
        From: js.UndefOr[StringType] = js.undefined,
        ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
        SourceArn: js.UndefOr[ArnType] = js.undefined
    ): EmailConfigurationType = {
      val __obj = js.Dynamic.literal()
      ConfigurationSet.foreach(__v => __obj.updateDynamic("ConfigurationSet")(__v.asInstanceOf[js.Any]))
      EmailSendingAccount.foreach(__v => __obj.updateDynamic("EmailSendingAccount")(__v.asInstanceOf[js.Any]))
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      ReplyToEmailAddress.foreach(__v => __obj.updateDynamic("ReplyToEmailAddress")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailConfigurationType]
    }
  }

  /** Specifies the user context data captured at the time of an event request.
    */
  @js.native
  trait EventContextDataType extends js.Object {
    var City: js.UndefOr[StringType]
    var Country: js.UndefOr[StringType]
    var DeviceName: js.UndefOr[StringType]
    var IpAddress: js.UndefOr[StringType]
    var Timezone: js.UndefOr[StringType]
  }

  object EventContextDataType {
    @inline
    def apply(
        City: js.UndefOr[StringType] = js.undefined,
        Country: js.UndefOr[StringType] = js.undefined,
        DeviceName: js.UndefOr[StringType] = js.undefined,
        IpAddress: js.UndefOr[StringType] = js.undefined,
        Timezone: js.UndefOr[StringType] = js.undefined
    ): EventContextDataType = {
      val __obj = js.Dynamic.literal()
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventContextDataType]
    }
  }

  /** Specifies the event feedback type.
    */
  @js.native
  trait EventFeedbackType extends js.Object {
    var FeedbackValue: FeedbackValueType
    var Provider: StringType
    var FeedbackDate: js.UndefOr[DateType]
  }

  object EventFeedbackType {
    @inline
    def apply(
        FeedbackValue: FeedbackValueType,
        Provider: StringType,
        FeedbackDate: js.UndefOr[DateType] = js.undefined
    ): EventFeedbackType = {
      val __obj = js.Dynamic.literal(
        "FeedbackValue" -> FeedbackValue.asInstanceOf[js.Any],
        "Provider" -> Provider.asInstanceOf[js.Any]
      )

      FeedbackDate.foreach(__v => __obj.updateDynamic("FeedbackDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventFeedbackType]
    }
  }

  /** The event risk type.
    */
  @js.native
  trait EventRiskType extends js.Object {
    var CompromisedCredentialsDetected: js.UndefOr[WrappedBooleanType]
    var RiskDecision: js.UndefOr[RiskDecisionType]
    var RiskLevel: js.UndefOr[RiskLevelType]
  }

  object EventRiskType {
    @inline
    def apply(
        CompromisedCredentialsDetected: js.UndefOr[WrappedBooleanType] = js.undefined,
        RiskDecision: js.UndefOr[RiskDecisionType] = js.undefined,
        RiskLevel: js.UndefOr[RiskLevelType] = js.undefined
    ): EventRiskType = {
      val __obj = js.Dynamic.literal()
      CompromisedCredentialsDetected.foreach(__v => __obj.updateDynamic("CompromisedCredentialsDetected")(__v.asInstanceOf[js.Any]))
      RiskDecision.foreach(__v => __obj.updateDynamic("RiskDecision")(__v.asInstanceOf[js.Any]))
      RiskLevel.foreach(__v => __obj.updateDynamic("RiskLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventRiskType]
    }
  }

  /** Represents the request to forget the device.
    */
  @js.native
  trait ForgetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object ForgetDeviceRequest {
    @inline
    def apply(
        DeviceKey: DeviceKeyType,
        AccessToken: js.UndefOr[TokenModelType] = js.undefined
    ): ForgetDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any]
      )

      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForgetDeviceRequest]
    }
  }

  /** Represents the request to reset a user's password.
    */
  @js.native
  trait ForgotPasswordRequest extends js.Object {
    var ClientId: ClientIdType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ForgotPasswordRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ForgotPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      SecretHash.foreach(__v => __obj.updateDynamic("SecretHash")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForgotPasswordRequest]
    }
  }

  /** The response from Amazon Cognito to a request to reset a password.
    */
  @js.native
  trait ForgotPasswordResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object ForgotPasswordResponse {
    @inline
    def apply(
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): ForgotPasswordResponse = {
      val __obj = js.Dynamic.literal()
      CodeDeliveryDetails.foreach(__v => __obj.updateDynamic("CodeDeliveryDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForgotPasswordResponse]
    }
  }

  /** Represents the request to get the header information of the CSV file for the user import job.
    */
  @js.native
  trait GetCSVHeaderRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object GetCSVHeaderRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType
    ): GetCSVHeaderRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCSVHeaderRequest]
    }
  }

  /** Represents the response from the server to the request to get the header information of the CSV file for the user import job.
    */
  @js.native
  trait GetCSVHeaderResponse extends js.Object {
    var CSVHeader: js.UndefOr[ListOfStringTypes]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GetCSVHeaderResponse {
    @inline
    def apply(
        CSVHeader: js.UndefOr[ListOfStringTypes] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): GetCSVHeaderResponse = {
      val __obj = js.Dynamic.literal()
      CSVHeader.foreach(__v => __obj.updateDynamic("CSVHeader")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCSVHeaderResponse]
    }
  }

  /** Represents the request to get the device.
    */
  @js.native
  trait GetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object GetDeviceRequest {
    @inline
    def apply(
        DeviceKey: DeviceKeyType,
        AccessToken: js.UndefOr[TokenModelType] = js.undefined
    ): GetDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any]
      )

      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceRequest]
    }
  }

  /** Gets the device response.
    */
  @js.native
  trait GetDeviceResponse extends js.Object {
    var Device: DeviceType
  }

  object GetDeviceResponse {
    @inline
    def apply(
        Device: DeviceType
    ): GetDeviceResponse = {
      val __obj = js.Dynamic.literal(
        "Device" -> Device.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
  }

  object GetGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType
    ): GetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object GetGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[GroupType] = js.undefined
    ): GetGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetIdentityProviderByIdentifierRequest extends js.Object {
    var IdpIdentifier: IdpIdentifierType
    var UserPoolId: UserPoolIdType
  }

  object GetIdentityProviderByIdentifierRequest {
    @inline
    def apply(
        IdpIdentifier: IdpIdentifierType,
        UserPoolId: UserPoolIdType
    ): GetIdentityProviderByIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "IdpIdentifier" -> IdpIdentifier.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
    }
  }

  @js.native
  trait GetIdentityProviderByIdentifierResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object GetIdentityProviderByIdentifierResponse {
    @inline
    def apply(
        IdentityProvider: IdentityProviderType
    ): GetIdentityProviderByIdentifierResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIdentityProviderByIdentifierResponse]
    }
  }

  /** Request to get a signing certificate from Amazon Cognito.
    */
  @js.native
  trait GetSigningCertificateRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object GetSigningCertificateRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType
    ): GetSigningCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSigningCertificateRequest]
    }
  }

  /** Response from Amazon Cognito for a signing certificate request.
    */
  @js.native
  trait GetSigningCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[StringType]
  }

  object GetSigningCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[StringType] = js.undefined
    ): GetSigningCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSigningCertificateResponse]
    }
  }

  @js.native
  trait GetUICustomizationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var ClientId: js.UndefOr[ClientIdType]
  }

  object GetUICustomizationRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        ClientId: js.UndefOr[ClientIdType] = js.undefined
    ): GetUICustomizationRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUICustomizationRequest]
    }
  }

  @js.native
  trait GetUICustomizationResponse extends js.Object {
    var UICustomization: UICustomizationType
  }

  object GetUICustomizationResponse {
    @inline
    def apply(
        UICustomization: UICustomizationType
    ): GetUICustomizationResponse = {
      val __obj = js.Dynamic.literal(
        "UICustomization" -> UICustomization.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUICustomizationResponse]
    }
  }

  /** Represents the request to get user attribute verification.
    */
  @js.native
  trait GetUserAttributeVerificationCodeRequest extends js.Object {
    var AccessToken: TokenModelType
    var AttributeName: AttributeNameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  object GetUserAttributeVerificationCodeRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        AttributeName: AttributeNameType,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    ): GetUserAttributeVerificationCodeRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "AttributeName" -> AttributeName.asInstanceOf[js.Any]
      )

      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserAttributeVerificationCodeRequest]
    }
  }

  /** The verification code response returned by the server response to get the user attribute verification code.
    */
  @js.native
  trait GetUserAttributeVerificationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object GetUserAttributeVerificationCodeResponse {
    @inline
    def apply(
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): GetUserAttributeVerificationCodeResponse = {
      val __obj = js.Dynamic.literal()
      CodeDeliveryDetails.foreach(__v => __obj.updateDynamic("CodeDeliveryDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserAttributeVerificationCodeResponse]
    }
  }

  @js.native
  trait GetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object GetUserPoolMfaConfigRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType
    ): GetUserPoolMfaConfigRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserPoolMfaConfigRequest]
    }
  }

  @js.native
  trait GetUserPoolMfaConfigResponse extends js.Object {
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  object GetUserPoolMfaConfigResponse {
    @inline
    def apply(
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
        SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    ): GetUserPoolMfaConfigResponse = {
      val __obj = js.Dynamic.literal()
      MfaConfiguration.foreach(__v => __obj.updateDynamic("MfaConfiguration")(__v.asInstanceOf[js.Any]))
      SmsMfaConfiguration.foreach(__v => __obj.updateDynamic("SmsMfaConfiguration")(__v.asInstanceOf[js.Any]))
      SoftwareTokenMfaConfiguration.foreach(__v => __obj.updateDynamic("SoftwareTokenMfaConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserPoolMfaConfigResponse]
    }
  }

  /** Represents the request to get information about the user.
    */
  @js.native
  trait GetUserRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  object GetUserRequest {
    @inline
    def apply(
        AccessToken: TokenModelType
    ): GetUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserRequest]
    }
  }

  /** Represents the response from the server from the request to get information about the user.
    */
  @js.native
  trait GetUserResponse extends js.Object {
    var UserAttributes: AttributeListType
    var Username: UsernameType
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var PreferredMfaSetting: js.UndefOr[StringType]
    var UserMFASettingList: js.UndefOr[UserMFASettingListType]
  }

  object GetUserResponse {
    @inline
    def apply(
        UserAttributes: AttributeListType,
        Username: UsernameType,
        MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
        PreferredMfaSetting: js.UndefOr[StringType] = js.undefined,
        UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
    ): GetUserResponse = {
      val __obj = js.Dynamic.literal(
        "UserAttributes" -> UserAttributes.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      MFAOptions.foreach(__v => __obj.updateDynamic("MFAOptions")(__v.asInstanceOf[js.Any]))
      PreferredMfaSetting.foreach(__v => __obj.updateDynamic("PreferredMfaSetting")(__v.asInstanceOf[js.Any]))
      UserMFASettingList.foreach(__v => __obj.updateDynamic("UserMFASettingList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserResponse]
    }
  }

  /** Represents the request to sign out all devices.
    */
  @js.native
  trait GlobalSignOutRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  object GlobalSignOutRequest {
    @inline
    def apply(
        AccessToken: TokenModelType
    ): GlobalSignOutRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GlobalSignOutRequest]
    }
  }

  /** The response to the request to sign out all devices.
    */
  @js.native
  trait GlobalSignOutResponse extends js.Object

  object GlobalSignOutResponse {
    @inline
    def apply(): GlobalSignOutResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSignOutResponse]
    }
  }

  /** The group type.
    */
  @js.native
  trait GroupType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var Description: js.UndefOr[DescriptionType]
    var GroupName: js.UndefOr[GroupNameType]
    var LastModifiedDate: js.UndefOr[DateType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GroupType {
    @inline
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        GroupName: js.UndefOr[GroupNameType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        Precedence: js.UndefOr[PrecedenceType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): GroupType = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Precedence.foreach(__v => __obj.updateDynamic("Precedence")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupType]
    }
  }

  /** The HTTP header.
    */
  @js.native
  trait HttpHeader extends js.Object {
    var headerName: js.UndefOr[StringType]
    var headerValue: js.UndefOr[StringType]
  }

  object HttpHeader {
    @inline
    def apply(
        headerName: js.UndefOr[StringType] = js.undefined,
        headerValue: js.UndefOr[StringType] = js.undefined
    ): HttpHeader = {
      val __obj = js.Dynamic.literal()
      headerName.foreach(__v => __obj.updateDynamic("headerName")(__v.asInstanceOf[js.Any]))
      headerValue.foreach(__v => __obj.updateDynamic("headerValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpHeader]
    }
  }

  /** A container for information about an IdP.
    */
  @js.native
  trait IdentityProviderType extends js.Object {
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var CreationDate: js.UndefOr[DateType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
    var LastModifiedDate: js.UndefOr[DateType]
    var ProviderDetails: js.UndefOr[ProviderDetailsType]
    var ProviderName: js.UndefOr[ProviderNameType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object IdentityProviderType {
    @inline
    def apply(
        AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined,
        ProviderName: js.UndefOr[ProviderNameType] = js.undefined,
        ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): IdentityProviderType = {
      val __obj = js.Dynamic.literal()
      AttributeMapping.foreach(__v => __obj.updateDynamic("AttributeMapping")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      IdpIdentifiers.foreach(__v => __obj.updateDynamic("IdpIdentifiers")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ProviderDetails.foreach(__v => __obj.updateDynamic("ProviderDetails")(__v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.updateDynamic("ProviderName")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderType]
    }
  }

  /** Initiates the authentication request.
    */
  @js.native
  trait InitiateAuthRequest extends js.Object {
    var AuthFlow: AuthFlowType
    var ClientId: ClientIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var AuthParameters: js.UndefOr[AuthParametersType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object InitiateAuthRequest {
    @inline
    def apply(
        AuthFlow: AuthFlowType,
        ClientId: ClientIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        AuthParameters: js.UndefOr[AuthParametersType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): InitiateAuthRequest = {
      val __obj = js.Dynamic.literal(
        "AuthFlow" -> AuthFlow.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      AuthParameters.foreach(__v => __obj.updateDynamic("AuthParameters")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateAuthRequest]
    }
  }

  /** Initiates the authentication response.
    */
  @js.native
  trait InitiateAuthResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object InitiateAuthResponse {
    @inline
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): InitiateAuthResponse = {
      val __obj = js.Dynamic.literal()
      AuthenticationResult.foreach(__v => __obj.updateDynamic("AuthenticationResult")(__v.asInstanceOf[js.Any]))
      ChallengeName.foreach(__v => __obj.updateDynamic("ChallengeName")(__v.asInstanceOf[js.Any]))
      ChallengeParameters.foreach(__v => __obj.updateDynamic("ChallengeParameters")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateAuthResponse]
    }
  }

  /** Specifies the configuration for Lambda triggers.
    */
  @js.native
  trait LambdaConfigType extends js.Object {
    var CreateAuthChallenge: js.UndefOr[ArnType]
    var CustomEmailSender: js.UndefOr[CustomEmailLambdaVersionConfigType]
    var CustomMessage: js.UndefOr[ArnType]
    var CustomSMSSender: js.UndefOr[CustomSMSLambdaVersionConfigType]
    var DefineAuthChallenge: js.UndefOr[ArnType]
    var KMSKeyID: js.UndefOr[ArnType]
    var PostAuthentication: js.UndefOr[ArnType]
    var PostConfirmation: js.UndefOr[ArnType]
    var PreAuthentication: js.UndefOr[ArnType]
    var PreSignUp: js.UndefOr[ArnType]
    var PreTokenGeneration: js.UndefOr[ArnType]
    var UserMigration: js.UndefOr[ArnType]
    var VerifyAuthChallengeResponse: js.UndefOr[ArnType]
  }

  object LambdaConfigType {
    @inline
    def apply(
        CreateAuthChallenge: js.UndefOr[ArnType] = js.undefined,
        CustomEmailSender: js.UndefOr[CustomEmailLambdaVersionConfigType] = js.undefined,
        CustomMessage: js.UndefOr[ArnType] = js.undefined,
        CustomSMSSender: js.UndefOr[CustomSMSLambdaVersionConfigType] = js.undefined,
        DefineAuthChallenge: js.UndefOr[ArnType] = js.undefined,
        KMSKeyID: js.UndefOr[ArnType] = js.undefined,
        PostAuthentication: js.UndefOr[ArnType] = js.undefined,
        PostConfirmation: js.UndefOr[ArnType] = js.undefined,
        PreAuthentication: js.UndefOr[ArnType] = js.undefined,
        PreSignUp: js.UndefOr[ArnType] = js.undefined,
        PreTokenGeneration: js.UndefOr[ArnType] = js.undefined,
        UserMigration: js.UndefOr[ArnType] = js.undefined,
        VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.undefined
    ): LambdaConfigType = {
      val __obj = js.Dynamic.literal()
      CreateAuthChallenge.foreach(__v => __obj.updateDynamic("CreateAuthChallenge")(__v.asInstanceOf[js.Any]))
      CustomEmailSender.foreach(__v => __obj.updateDynamic("CustomEmailSender")(__v.asInstanceOf[js.Any]))
      CustomMessage.foreach(__v => __obj.updateDynamic("CustomMessage")(__v.asInstanceOf[js.Any]))
      CustomSMSSender.foreach(__v => __obj.updateDynamic("CustomSMSSender")(__v.asInstanceOf[js.Any]))
      DefineAuthChallenge.foreach(__v => __obj.updateDynamic("DefineAuthChallenge")(__v.asInstanceOf[js.Any]))
      KMSKeyID.foreach(__v => __obj.updateDynamic("KMSKeyID")(__v.asInstanceOf[js.Any]))
      PostAuthentication.foreach(__v => __obj.updateDynamic("PostAuthentication")(__v.asInstanceOf[js.Any]))
      PostConfirmation.foreach(__v => __obj.updateDynamic("PostConfirmation")(__v.asInstanceOf[js.Any]))
      PreAuthentication.foreach(__v => __obj.updateDynamic("PreAuthentication")(__v.asInstanceOf[js.Any]))
      PreSignUp.foreach(__v => __obj.updateDynamic("PreSignUp")(__v.asInstanceOf[js.Any]))
      PreTokenGeneration.foreach(__v => __obj.updateDynamic("PreTokenGeneration")(__v.asInstanceOf[js.Any]))
      UserMigration.foreach(__v => __obj.updateDynamic("UserMigration")(__v.asInstanceOf[js.Any]))
      VerifyAuthChallengeResponse.foreach(__v => __obj.updateDynamic("VerifyAuthChallengeResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaConfigType]
    }
  }

  /** Represents the request to list the devices.
    */
  @js.native
  trait ListDevicesRequest extends js.Object {
    var AccessToken: TokenModelType
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListDevicesRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): ListDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesRequest]
    }
  }

  /** Represents the response to list devices.
    */
  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[DeviceListType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): ListDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        Groups: js.UndefOr[GroupListType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListIdentityProvidersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[ListProvidersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListIdentityProvidersRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListIdentityProvidersRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProvidersRequest]
    }
  }

  @js.native
  trait ListIdentityProvidersResponse extends js.Object {
    var Providers: ProvidersListType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListIdentityProvidersResponse {
    @inline
    def apply(
        Providers: ProvidersListType,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListIdentityProvidersResponse = {
      val __obj = js.Dynamic.literal(
        "Providers" -> Providers.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProvidersResponse]
    }
  }

  @js.native
  trait ListResourceServersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[ListResourceServersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListResourceServersRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListResourceServersRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceServersRequest]
    }
  }

  @js.native
  trait ListResourceServersResponse extends js.Object {
    var ResourceServers: ResourceServersListType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListResourceServersResponse {
    @inline
    def apply(
        ResourceServers: ResourceServersListType,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListResourceServersResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceServers" -> ResourceServers.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceServersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ArnType
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ArnType
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[UserPoolTagsType]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[UserPoolTagsType] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Represents the request to list the user import jobs.
    */
  @js.native
  trait ListUserImportJobsRequest extends js.Object {
    var MaxResults: PoolQueryLimitType
    var UserPoolId: UserPoolIdType
    var PaginationToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserImportJobsRequest {
    @inline
    def apply(
        MaxResults: PoolQueryLimitType,
        UserPoolId: UserPoolIdType,
        PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListUserImportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "MaxResults" -> MaxResults.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserImportJobsRequest]
    }
  }

  /** Represents the response from the server to the request to list the user import jobs.
    */
  @js.native
  trait ListUserImportJobsResponse extends js.Object {
    var PaginationToken: js.UndefOr[PaginationKeyType]
    var UserImportJobs: js.UndefOr[UserImportJobsListType]
  }

  object ListUserImportJobsResponse {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined,
        UserImportJobs: js.UndefOr[UserImportJobsListType] = js.undefined
    ): ListUserImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      UserImportJobs.foreach(__v => __obj.updateDynamic("UserImportJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserImportJobsResponse]
    }
  }

  /** Represents the request to list the user pool clients.
    */
  @js.native
  trait ListUserPoolClientsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[QueryLimit]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUserPoolClientsRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        MaxResults: js.UndefOr[QueryLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListUserPoolClientsRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserPoolClientsRequest]
    }
  }

  /** Represents the response from the server that lists user pool clients.
    */
  @js.native
  trait ListUserPoolClientsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKey]
    var UserPoolClients: js.UndefOr[UserPoolClientListType]
  }

  object ListUserPoolClientsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationKey] = js.undefined,
        UserPoolClients: js.UndefOr[UserPoolClientListType] = js.undefined
    ): ListUserPoolClientsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserPoolClients.foreach(__v => __obj.updateDynamic("UserPoolClients")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserPoolClientsResponse]
    }
  }

  /** Represents the request to list user pools.
    */
  @js.native
  trait ListUserPoolsRequest extends js.Object {
    var MaxResults: PoolQueryLimitType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserPoolsRequest {
    @inline
    def apply(
        MaxResults: PoolQueryLimitType,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListUserPoolsRequest = {
      val __obj = js.Dynamic.literal(
        "MaxResults" -> MaxResults.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserPoolsRequest]
    }
  }

  /** Represents the response to list user pools.
    */
  @js.native
  trait ListUserPoolsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKeyType]
    var UserPools: js.UndefOr[UserPoolListType]
  }

  object ListUserPoolsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined,
        UserPools: js.UndefOr[UserPoolListType] = js.undefined
    ): ListUserPoolsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserPools.foreach(__v => __obj.updateDynamic("UserPools")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserPoolsResponse]
    }
  }

  @js.native
  trait ListUsersInGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUsersInGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListUsersInGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersInGroupRequest]
    }
  }

  @js.native
  trait ListUsersInGroupResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKey]
    var Users: js.UndefOr[UsersListType]
  }

  object ListUsersInGroupResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationKey] = js.undefined,
        Users: js.UndefOr[UsersListType] = js.undefined
    ): ListUsersInGroupResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersInGroupResponse]
    }
  }

  /** Represents the request to list users.
    */
  @js.native
  trait ListUsersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var AttributesToGet: js.UndefOr[SearchedAttributeNamesListType]
    var Filter: js.UndefOr[UserFilterType]
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListUsersRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        AttributesToGet: js.UndefOr[SearchedAttributeNamesListType] = js.undefined,
        Filter: js.UndefOr[UserFilterType] = js.undefined,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AttributesToGet.foreach(__v => __obj.updateDynamic("AttributesToGet")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  /** The response from the request to list users.
    */
  @js.native
  trait ListUsersResponse extends js.Object {
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
    var Users: js.UndefOr[UsersListType]
  }

  object ListUsersResponse {
    @inline
    def apply(
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined,
        Users: js.UndefOr[UsersListType] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** <i>This data type is no longer supported.</i> Applies only to SMS multi-factor authentication (MFA) configurations. Does not apply to time-based one-time password (TOTP) software token MFA configurations.
    */
  @js.native
  trait MFAOptionType extends js.Object {
    var AttributeName: js.UndefOr[AttributeNameType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
  }

  object MFAOptionType {
    @inline
    def apply(
        AttributeName: js.UndefOr[AttributeNameType] = js.undefined,
        DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
    ): MFAOptionType = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      DeliveryMedium.foreach(__v => __obj.updateDynamic("DeliveryMedium")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MFAOptionType]
    }
  }

  /** The message template structure.
    */
  @js.native
  trait MessageTemplateType extends js.Object {
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
    var SMSMessage: js.UndefOr[SmsVerificationMessageType]
  }

  object MessageTemplateType {
    @inline
    def apply(
        EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    ): MessageTemplateType = {
      val __obj = js.Dynamic.literal()
      EmailMessage.foreach(__v => __obj.updateDynamic("EmailMessage")(__v.asInstanceOf[js.Any]))
      EmailSubject.foreach(__v => __obj.updateDynamic("EmailSubject")(__v.asInstanceOf[js.Any]))
      SMSMessage.foreach(__v => __obj.updateDynamic("SMSMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageTemplateType]
    }
  }

  /** The new device metadata type.
    */
  @js.native
  trait NewDeviceMetadataType extends js.Object {
    var DeviceGroupKey: js.UndefOr[StringType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
  }

  object NewDeviceMetadataType {
    @inline
    def apply(
        DeviceGroupKey: js.UndefOr[StringType] = js.undefined,
        DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
    ): NewDeviceMetadataType = {
      val __obj = js.Dynamic.literal()
      DeviceGroupKey.foreach(__v => __obj.updateDynamic("DeviceGroupKey")(__v.asInstanceOf[js.Any]))
      DeviceKey.foreach(__v => __obj.updateDynamic("DeviceKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewDeviceMetadataType]
    }
  }

  /** The notify configuration type.
    */
  @js.native
  trait NotifyConfigurationType extends js.Object {
    var SourceArn: ArnType
    var BlockEmail: js.UndefOr[NotifyEmailType]
    var From: js.UndefOr[StringType]
    var MfaEmail: js.UndefOr[NotifyEmailType]
    var NoActionEmail: js.UndefOr[NotifyEmailType]
    var ReplyTo: js.UndefOr[StringType]
  }

  object NotifyConfigurationType {
    @inline
    def apply(
        SourceArn: ArnType,
        BlockEmail: js.UndefOr[NotifyEmailType] = js.undefined,
        From: js.UndefOr[StringType] = js.undefined,
        MfaEmail: js.UndefOr[NotifyEmailType] = js.undefined,
        NoActionEmail: js.UndefOr[NotifyEmailType] = js.undefined,
        ReplyTo: js.UndefOr[StringType] = js.undefined
    ): NotifyConfigurationType = {
      val __obj = js.Dynamic.literal(
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      BlockEmail.foreach(__v => __obj.updateDynamic("BlockEmail")(__v.asInstanceOf[js.Any]))
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      MfaEmail.foreach(__v => __obj.updateDynamic("MfaEmail")(__v.asInstanceOf[js.Any]))
      NoActionEmail.foreach(__v => __obj.updateDynamic("NoActionEmail")(__v.asInstanceOf[js.Any]))
      ReplyTo.foreach(__v => __obj.updateDynamic("ReplyTo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyConfigurationType]
    }
  }

  /** The notify email type.
    */
  @js.native
  trait NotifyEmailType extends js.Object {
    var Subject: EmailNotificationSubjectType
    var HtmlBody: js.UndefOr[EmailNotificationBodyType]
    var TextBody: js.UndefOr[EmailNotificationBodyType]
  }

  object NotifyEmailType {
    @inline
    def apply(
        Subject: EmailNotificationSubjectType,
        HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined,
        TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
    ): NotifyEmailType = {
      val __obj = js.Dynamic.literal(
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      HtmlBody.foreach(__v => __obj.updateDynamic("HtmlBody")(__v.asInstanceOf[js.Any]))
      TextBody.foreach(__v => __obj.updateDynamic("TextBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyEmailType]
    }
  }

  /** The minimum and maximum values of an attribute that is of the number data type.
    */
  @js.native
  trait NumberAttributeConstraintsType extends js.Object {
    var MaxValue: js.UndefOr[StringType]
    var MinValue: js.UndefOr[StringType]
  }

  object NumberAttributeConstraintsType {
    @inline
    def apply(
        MaxValue: js.UndefOr[StringType] = js.undefined,
        MinValue: js.UndefOr[StringType] = js.undefined
    ): NumberAttributeConstraintsType = {
      val __obj = js.Dynamic.literal()
      MaxValue.foreach(__v => __obj.updateDynamic("MaxValue")(__v.asInstanceOf[js.Any]))
      MinValue.foreach(__v => __obj.updateDynamic("MinValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberAttributeConstraintsType]
    }
  }

  /** The password policy type.
    */
  @js.native
  trait PasswordPolicyType extends js.Object {
    var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType]
    var RequireLowercase: js.UndefOr[BooleanType]
    var RequireNumbers: js.UndefOr[BooleanType]
    var RequireSymbols: js.UndefOr[BooleanType]
    var RequireUppercase: js.UndefOr[BooleanType]
    var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType]
  }

  object PasswordPolicyType {
    @inline
    def apply(
        MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined,
        RequireLowercase: js.UndefOr[BooleanType] = js.undefined,
        RequireNumbers: js.UndefOr[BooleanType] = js.undefined,
        RequireSymbols: js.UndefOr[BooleanType] = js.undefined,
        RequireUppercase: js.UndefOr[BooleanType] = js.undefined,
        TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.undefined
    ): PasswordPolicyType = {
      val __obj = js.Dynamic.literal()
      MinimumLength.foreach(__v => __obj.updateDynamic("MinimumLength")(__v.asInstanceOf[js.Any]))
      RequireLowercase.foreach(__v => __obj.updateDynamic("RequireLowercase")(__v.asInstanceOf[js.Any]))
      RequireNumbers.foreach(__v => __obj.updateDynamic("RequireNumbers")(__v.asInstanceOf[js.Any]))
      RequireSymbols.foreach(__v => __obj.updateDynamic("RequireSymbols")(__v.asInstanceOf[js.Any]))
      RequireUppercase.foreach(__v => __obj.updateDynamic("RequireUppercase")(__v.asInstanceOf[js.Any]))
      TemporaryPasswordValidityDays.foreach(__v => __obj.updateDynamic("TemporaryPasswordValidityDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PasswordPolicyType]
    }
  }

  /** A container for IdP details.
    */
  @js.native
  trait ProviderDescription extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var LastModifiedDate: js.UndefOr[DateType]
    var ProviderName: js.UndefOr[ProviderNameType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
  }

  object ProviderDescription {
    @inline
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        ProviderName: js.UndefOr[ProviderNameType] = js.undefined,
        ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
    ): ProviderDescription = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.updateDynamic("ProviderName")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProviderDescription]
    }
  }

  /** A container for information about an IdP for a user pool.
    */
  @js.native
  trait ProviderUserIdentifierType extends js.Object {
    var ProviderAttributeName: js.UndefOr[StringType]
    var ProviderAttributeValue: js.UndefOr[StringType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  object ProviderUserIdentifierType {
    @inline
    def apply(
        ProviderAttributeName: js.UndefOr[StringType] = js.undefined,
        ProviderAttributeValue: js.UndefOr[StringType] = js.undefined,
        ProviderName: js.UndefOr[ProviderNameType] = js.undefined
    ): ProviderUserIdentifierType = {
      val __obj = js.Dynamic.literal()
      ProviderAttributeName.foreach(__v => __obj.updateDynamic("ProviderAttributeName")(__v.asInstanceOf[js.Any]))
      ProviderAttributeValue.foreach(__v => __obj.updateDynamic("ProviderAttributeValue")(__v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.updateDynamic("ProviderName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProviderUserIdentifierType]
    }
  }

  /** A map containing a priority as a key, and recovery method name as a value.
    */
  @js.native
  trait RecoveryOptionType extends js.Object {
    var Name: RecoveryOptionNameType
    var Priority: PriorityType
  }

  object RecoveryOptionType {
    @inline
    def apply(
        Name: RecoveryOptionNameType,
        Priority: PriorityType
    ): RecoveryOptionType = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RecoveryOptionType]
    }
  }

  /** Represents the request to resend the confirmation code.
    */
  @js.native
  trait ResendConfirmationCodeRequest extends js.Object {
    var ClientId: ClientIdType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ResendConfirmationCodeRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ResendConfirmationCodeRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      SecretHash.foreach(__v => __obj.updateDynamic("SecretHash")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResendConfirmationCodeRequest]
    }
  }

  /** The response from the server when Amazon Cognito makes the request to resend a confirmation code.
    */
  @js.native
  trait ResendConfirmationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object ResendConfirmationCodeResponse {
    @inline
    def apply(
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): ResendConfirmationCodeResponse = {
      val __obj = js.Dynamic.literal()
      CodeDeliveryDetails.foreach(__v => __obj.updateDynamic("CodeDeliveryDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResendConfirmationCodeResponse]
    }
  }

  /** A resource server scope.
    */
  @js.native
  trait ResourceServerScopeType extends js.Object {
    var ScopeDescription: ResourceServerScopeDescriptionType
    var ScopeName: ResourceServerScopeNameType
  }

  object ResourceServerScopeType {
    @inline
    def apply(
        ScopeDescription: ResourceServerScopeDescriptionType,
        ScopeName: ResourceServerScopeNameType
    ): ResourceServerScopeType = {
      val __obj = js.Dynamic.literal(
        "ScopeDescription" -> ScopeDescription.asInstanceOf[js.Any],
        "ScopeName" -> ScopeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResourceServerScopeType]
    }
  }

  /** A container for information about a resource server for a user pool.
    */
  @js.native
  trait ResourceServerType extends js.Object {
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
    var Name: js.UndefOr[ResourceServerNameType]
    var Scopes: js.UndefOr[ResourceServerScopeListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object ResourceServerType {
    @inline
    def apply(
        Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined,
        Name: js.UndefOr[ResourceServerNameType] = js.undefined,
        Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): ResourceServerType = {
      val __obj = js.Dynamic.literal()
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Scopes.foreach(__v => __obj.updateDynamic("Scopes")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceServerType]
    }
  }

  /** The request to respond to an authentication challenge.
    */
  @js.native
  trait RespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: ChallengeNameType
    var ClientId: ClientIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var Session: js.UndefOr[SessionType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object RespondToAuthChallengeRequest {
    @inline
    def apply(
        ChallengeName: ChallengeNameType,
        ClientId: ClientIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): RespondToAuthChallengeRequest = {
      val __obj = js.Dynamic.literal(
        "ChallengeName" -> ChallengeName.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ChallengeResponses.foreach(__v => __obj.updateDynamic("ChallengeResponses")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RespondToAuthChallengeRequest]
    }
  }

  /** The response to respond to the authentication challenge.
    */
  @js.native
  trait RespondToAuthChallengeResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object RespondToAuthChallengeResponse {
    @inline
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): RespondToAuthChallengeResponse = {
      val __obj = js.Dynamic.literal()
      AuthenticationResult.foreach(__v => __obj.updateDynamic("AuthenticationResult")(__v.asInstanceOf[js.Any]))
      ChallengeName.foreach(__v => __obj.updateDynamic("ChallengeName")(__v.asInstanceOf[js.Any]))
      ChallengeParameters.foreach(__v => __obj.updateDynamic("ChallengeParameters")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RespondToAuthChallengeResponse]
    }
  }

  @js.native
  trait RevokeTokenRequest extends js.Object {
    var ClientId: ClientIdType
    var Token: TokenModelType
    var ClientSecret: js.UndefOr[ClientSecretType]
  }

  object RevokeTokenRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        Token: TokenModelType,
        ClientSecret: js.UndefOr[ClientSecretType] = js.undefined
    ): RevokeTokenRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Token" -> Token.asInstanceOf[js.Any]
      )

      ClientSecret.foreach(__v => __obj.updateDynamic("ClientSecret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeTokenRequest]
    }
  }

  @js.native
  trait RevokeTokenResponse extends js.Object

  object RevokeTokenResponse {
    @inline
    def apply(): RevokeTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevokeTokenResponse]
    }
  }

  /** The risk configuration type.
    */
  @js.native
  trait RiskConfigurationType extends js.Object {
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType]
    var ClientId: js.UndefOr[ClientIdType]
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType]
    var LastModifiedDate: js.UndefOr[DateType]
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object RiskConfigurationType {
    @inline
    def apply(
        AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): RiskConfigurationType = {
      val __obj = js.Dynamic.literal()
      AccountTakeoverRiskConfiguration.foreach(__v => __obj.updateDynamic("AccountTakeoverRiskConfiguration")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      CompromisedCredentialsRiskConfiguration.foreach(__v => __obj.updateDynamic("CompromisedCredentialsRiskConfiguration")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      RiskExceptionConfiguration.foreach(__v => __obj.updateDynamic("RiskExceptionConfiguration")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RiskConfigurationType]
    }
  }

  /** The type of the configuration to override the risk decision.
    */
  @js.native
  trait RiskExceptionConfigurationType extends js.Object {
    var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType]
    var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType]
  }

  object RiskExceptionConfigurationType {
    @inline
    def apply(
        BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.undefined,
        SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.undefined
    ): RiskExceptionConfigurationType = {
      val __obj = js.Dynamic.literal()
      BlockedIPRangeList.foreach(__v => __obj.updateDynamic("BlockedIPRangeList")(__v.asInstanceOf[js.Any]))
      SkippedIPRangeList.foreach(__v => __obj.updateDynamic("SkippedIPRangeList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RiskExceptionConfigurationType]
    }
  }

  /** The type used for enabling SMS multi-factor authentication (MFA) at the user level. Phone numbers don't need to be verified to be used for SMS MFA. If an MFA type is activated for a user, the user will be prompted for MFA during all sign-in attempts, unless device tracking is turned on and the device has been trusted. If you would like MFA to be applied selectively based on the assessed risk level of sign-in attempts, deactivate MFA for users and turn on Adaptive Authentication for the user pool.
    */
  @js.native
  trait SMSMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  object SMSMfaSettingsType {
    @inline
    def apply(
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        PreferredMfa: js.UndefOr[BooleanType] = js.undefined
    ): SMSMfaSettingsType = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      PreferredMfa.foreach(__v => __obj.updateDynamic("PreferredMfa")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSMfaSettingsType]
    }
  }

  /** Contains information about the schema attribute.
    */
  @js.native
  trait SchemaAttributeType extends js.Object {
    var AttributeDataType: js.UndefOr[AttributeDataType]
    var DeveloperOnlyAttribute: js.UndefOr[BooleanType]
    var Mutable: js.UndefOr[BooleanType]
    var Name: js.UndefOr[CustomAttributeNameType]
    var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType]
    var Required: js.UndefOr[BooleanType]
    var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType]
  }

  object SchemaAttributeType {
    @inline
    def apply(
        AttributeDataType: js.UndefOr[AttributeDataType] = js.undefined,
        DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.undefined,
        Mutable: js.UndefOr[BooleanType] = js.undefined,
        Name: js.UndefOr[CustomAttributeNameType] = js.undefined,
        NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.undefined,
        Required: js.UndefOr[BooleanType] = js.undefined,
        StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.undefined
    ): SchemaAttributeType = {
      val __obj = js.Dynamic.literal()
      AttributeDataType.foreach(__v => __obj.updateDynamic("AttributeDataType")(__v.asInstanceOf[js.Any]))
      DeveloperOnlyAttribute.foreach(__v => __obj.updateDynamic("DeveloperOnlyAttribute")(__v.asInstanceOf[js.Any]))
      Mutable.foreach(__v => __obj.updateDynamic("Mutable")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberAttributeConstraints.foreach(__v => __obj.updateDynamic("NumberAttributeConstraints")(__v.asInstanceOf[js.Any]))
      Required.foreach(__v => __obj.updateDynamic("Required")(__v.asInstanceOf[js.Any]))
      StringAttributeConstraints.foreach(__v => __obj.updateDynamic("StringAttributeConstraints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaAttributeType]
    }
  }

  @js.native
  trait SetRiskConfigurationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType]
    var ClientId: js.UndefOr[ClientIdType]
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType]
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType]
  }

  object SetRiskConfigurationRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined,
        RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
    ): SetRiskConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AccountTakeoverRiskConfiguration.foreach(__v => __obj.updateDynamic("AccountTakeoverRiskConfiguration")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      CompromisedCredentialsRiskConfiguration.foreach(__v => __obj.updateDynamic("CompromisedCredentialsRiskConfiguration")(__v.asInstanceOf[js.Any]))
      RiskExceptionConfiguration.foreach(__v => __obj.updateDynamic("RiskExceptionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetRiskConfigurationRequest]
    }
  }

  @js.native
  trait SetRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: RiskConfigurationType
  }

  object SetRiskConfigurationResponse {
    @inline
    def apply(
        RiskConfiguration: RiskConfigurationType
    ): SetRiskConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "RiskConfiguration" -> RiskConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetRiskConfigurationResponse]
    }
  }

  @js.native
  trait SetUICustomizationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var CSS: js.UndefOr[CSSType]
    var ClientId: js.UndefOr[ClientIdType]
    var ImageFile: js.UndefOr[ImageFileType]
  }

  object SetUICustomizationRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        CSS: js.UndefOr[CSSType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        ImageFile: js.UndefOr[ImageFileType] = js.undefined
    ): SetUICustomizationRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      CSS.foreach(__v => __obj.updateDynamic("CSS")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      ImageFile.foreach(__v => __obj.updateDynamic("ImageFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetUICustomizationRequest]
    }
  }

  @js.native
  trait SetUICustomizationResponse extends js.Object {
    var UICustomization: UICustomizationType
  }

  object SetUICustomizationResponse {
    @inline
    def apply(
        UICustomization: UICustomizationType
    ): SetUICustomizationResponse = {
      val __obj = js.Dynamic.literal(
        "UICustomization" -> UICustomization.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetUICustomizationResponse]
    }
  }

  @js.native
  trait SetUserMFAPreferenceRequest extends js.Object {
    var AccessToken: TokenModelType
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
  }

  object SetUserMFAPreferenceRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined,
        SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
    ): SetUserMFAPreferenceRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      )

      SMSMfaSettings.foreach(__v => __obj.updateDynamic("SMSMfaSettings")(__v.asInstanceOf[js.Any]))
      SoftwareTokenMfaSettings.foreach(__v => __obj.updateDynamic("SoftwareTokenMfaSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetUserMFAPreferenceRequest]
    }
  }

  @js.native
  trait SetUserMFAPreferenceResponse extends js.Object

  object SetUserMFAPreferenceResponse {
    @inline
    def apply(): SetUserMFAPreferenceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetUserMFAPreferenceResponse]
    }
  }

  @js.native
  trait SetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  object SetUserPoolMfaConfigRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
        SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    ): SetUserPoolMfaConfigRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      MfaConfiguration.foreach(__v => __obj.updateDynamic("MfaConfiguration")(__v.asInstanceOf[js.Any]))
      SmsMfaConfiguration.foreach(__v => __obj.updateDynamic("SmsMfaConfiguration")(__v.asInstanceOf[js.Any]))
      SoftwareTokenMfaConfiguration.foreach(__v => __obj.updateDynamic("SoftwareTokenMfaConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetUserPoolMfaConfigRequest]
    }
  }

  @js.native
  trait SetUserPoolMfaConfigResponse extends js.Object {
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  object SetUserPoolMfaConfigResponse {
    @inline
    def apply(
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
        SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    ): SetUserPoolMfaConfigResponse = {
      val __obj = js.Dynamic.literal()
      MfaConfiguration.foreach(__v => __obj.updateDynamic("MfaConfiguration")(__v.asInstanceOf[js.Any]))
      SmsMfaConfiguration.foreach(__v => __obj.updateDynamic("SmsMfaConfiguration")(__v.asInstanceOf[js.Any]))
      SoftwareTokenMfaConfiguration.foreach(__v => __obj.updateDynamic("SoftwareTokenMfaConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetUserPoolMfaConfigResponse]
    }
  }

  /** Represents the request to set user settings.
    */
  @js.native
  trait SetUserSettingsRequest extends js.Object {
    var AccessToken: TokenModelType
    var MFAOptions: MFAOptionListType
  }

  object SetUserSettingsRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        MFAOptions: MFAOptionListType
    ): SetUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "MFAOptions" -> MFAOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetUserSettingsRequest]
    }
  }

  /** The response from the server for a set user settings request.
    */
  @js.native
  trait SetUserSettingsResponse extends js.Object

  object SetUserSettingsResponse {
    @inline
    def apply(): SetUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetUserSettingsResponse]
    }
  }

  /** Represents the request to register a user.
    */
  @js.native
  trait SignUpRequest extends js.Object {
    var ClientId: ClientIdType
    var Password: PasswordType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var ValidationData: js.UndefOr[AttributeListType]
  }

  object SignUpRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        Password: PasswordType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
        ValidationData: js.UndefOr[AttributeListType] = js.undefined
    ): SignUpRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AnalyticsMetadata.foreach(__v => __obj.updateDynamic("AnalyticsMetadata")(__v.asInstanceOf[js.Any]))
      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      SecretHash.foreach(__v => __obj.updateDynamic("SecretHash")(__v.asInstanceOf[js.Any]))
      UserAttributes.foreach(__v => __obj.updateDynamic("UserAttributes")(__v.asInstanceOf[js.Any]))
      UserContextData.foreach(__v => __obj.updateDynamic("UserContextData")(__v.asInstanceOf[js.Any]))
      ValidationData.foreach(__v => __obj.updateDynamic("ValidationData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignUpRequest]
    }
  }

  /** The response from the server for a registration request.
    */
  @js.native
  trait SignUpResponse extends js.Object {
    var UserConfirmed: BooleanType
    var UserSub: StringType
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object SignUpResponse {
    @inline
    def apply(
        UserConfirmed: BooleanType,
        UserSub: StringType,
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): SignUpResponse = {
      val __obj = js.Dynamic.literal(
        "UserConfirmed" -> UserConfirmed.asInstanceOf[js.Any],
        "UserSub" -> UserSub.asInstanceOf[js.Any]
      )

      CodeDeliveryDetails.foreach(__v => __obj.updateDynamic("CodeDeliveryDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignUpResponse]
    }
  }

  /** The SMS configuration type is the settings that your Amazon Cognito user pool must use to send an SMS message from your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access Management (IAM) role in your Amazon Web Services account.
    */
  @js.native
  trait SmsConfigurationType extends js.Object {
    var SnsCallerArn: ArnType
    var ExternalId: js.UndefOr[StringType]
    var SnsRegion: js.UndefOr[RegionCodeType]
  }

  object SmsConfigurationType {
    @inline
    def apply(
        SnsCallerArn: ArnType,
        ExternalId: js.UndefOr[StringType] = js.undefined,
        SnsRegion: js.UndefOr[RegionCodeType] = js.undefined
    ): SmsConfigurationType = {
      val __obj = js.Dynamic.literal(
        "SnsCallerArn" -> SnsCallerArn.asInstanceOf[js.Any]
      )

      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      SnsRegion.foreach(__v => __obj.updateDynamic("SnsRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SmsConfigurationType]
    }
  }

  /** The SMS text message multi-factor authentication (MFA) configuration type.
    */
  @js.native
  trait SmsMfaConfigType extends js.Object {
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
  }

  object SmsMfaConfigType {
    @inline
    def apply(
        SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
    ): SmsMfaConfigType = {
      val __obj = js.Dynamic.literal()
      SmsAuthenticationMessage.foreach(__v => __obj.updateDynamic("SmsAuthenticationMessage")(__v.asInstanceOf[js.Any]))
      SmsConfiguration.foreach(__v => __obj.updateDynamic("SmsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SmsMfaConfigType]
    }
  }

  /** The type used for enabling software token MFA at the user pool level.
    */
  @js.native
  trait SoftwareTokenMfaConfigType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
  }

  object SoftwareTokenMfaConfigType {
    @inline
    def apply(
        Enabled: js.UndefOr[BooleanType] = js.undefined
    ): SoftwareTokenMfaConfigType = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SoftwareTokenMfaConfigType]
    }
  }

  /** The type used for enabling software token MFA at the user level. If an MFA type is activated for a user, the user will be prompted for MFA during all sign-in attempts, unless device tracking is turned on and the device has been trusted. If you want MFA to be applied selectively based on the assessed risk level of sign-in attempts, deactivate MFA for users and turn on Adaptive Authentication for the user pool.
    */
  @js.native
  trait SoftwareTokenMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  object SoftwareTokenMfaSettingsType {
    @inline
    def apply(
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        PreferredMfa: js.UndefOr[BooleanType] = js.undefined
    ): SoftwareTokenMfaSettingsType = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      PreferredMfa.foreach(__v => __obj.updateDynamic("PreferredMfa")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SoftwareTokenMfaSettingsType]
    }
  }

  /** Represents the request to start the user import job.
    */
  @js.native
  trait StartUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  object StartUserImportJobRequest {
    @inline
    def apply(
        JobId: UserImportJobIdType,
        UserPoolId: UserPoolIdType
    ): StartUserImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartUserImportJobRequest]
    }
  }

  /** Represents the response from the server to the request to start the user import job.
    */
  @js.native
  trait StartUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object StartUserImportJobResponse {
    @inline
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): StartUserImportJobResponse = {
      val __obj = js.Dynamic.literal()
      UserImportJob.foreach(__v => __obj.updateDynamic("UserImportJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartUserImportJobResponse]
    }
  }

  /** Represents the request to stop the user import job.
    */
  @js.native
  trait StopUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  object StopUserImportJobRequest {
    @inline
    def apply(
        JobId: UserImportJobIdType,
        UserPoolId: UserPoolIdType
    ): StopUserImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopUserImportJobRequest]
    }
  }

  /** Represents the response from the server to the request to stop the user import job.
    */
  @js.native
  trait StopUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object StopUserImportJobResponse {
    @inline
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): StopUserImportJobResponse = {
      val __obj = js.Dynamic.literal()
      UserImportJob.foreach(__v => __obj.updateDynamic("UserImportJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopUserImportJobResponse]
    }
  }

  /** The constraints associated with a string attribute.
    */
  @js.native
  trait StringAttributeConstraintsType extends js.Object {
    var MaxLength: js.UndefOr[StringType]
    var MinLength: js.UndefOr[StringType]
  }

  object StringAttributeConstraintsType {
    @inline
    def apply(
        MaxLength: js.UndefOr[StringType] = js.undefined,
        MinLength: js.UndefOr[StringType] = js.undefined
    ): StringAttributeConstraintsType = {
      val __obj = js.Dynamic.literal()
      MaxLength.foreach(__v => __obj.updateDynamic("MaxLength")(__v.asInstanceOf[js.Any]))
      MinLength.foreach(__v => __obj.updateDynamic("MinLength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringAttributeConstraintsType]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ArnType
    var Tags: UserPoolTagsType
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ArnType,
        Tags: UserPoolTagsType
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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

  /** The data type TokenValidityUnits specifies the time units you use when you set the duration of ID, access, and refresh tokens.
    */
  @js.native
  trait TokenValidityUnitsType extends js.Object {
    var AccessToken: js.UndefOr[TimeUnitsType]
    var IdToken: js.UndefOr[TimeUnitsType]
    var RefreshToken: js.UndefOr[TimeUnitsType]
  }

  object TokenValidityUnitsType {
    @inline
    def apply(
        AccessToken: js.UndefOr[TimeUnitsType] = js.undefined,
        IdToken: js.UndefOr[TimeUnitsType] = js.undefined,
        RefreshToken: js.UndefOr[TimeUnitsType] = js.undefined
    ): TokenValidityUnitsType = {
      val __obj = js.Dynamic.literal()
      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      IdToken.foreach(__v => __obj.updateDynamic("IdToken")(__v.asInstanceOf[js.Any]))
      RefreshToken.foreach(__v => __obj.updateDynamic("RefreshToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TokenValidityUnitsType]
    }
  }

  /** A container for the UI customization information for a user pool's built-in app UI.
    */
  @js.native
  trait UICustomizationType extends js.Object {
    var CSS: js.UndefOr[CSSType]
    var CSSVersion: js.UndefOr[CSSVersionType]
    var ClientId: js.UndefOr[ClientIdType]
    var CreationDate: js.UndefOr[DateType]
    var ImageUrl: js.UndefOr[ImageUrlType]
    var LastModifiedDate: js.UndefOr[DateType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object UICustomizationType {
    @inline
    def apply(
        CSS: js.UndefOr[CSSType] = js.undefined,
        CSSVersion: js.UndefOr[CSSVersionType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        ImageUrl: js.UndefOr[ImageUrlType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): UICustomizationType = {
      val __obj = js.Dynamic.literal()
      CSS.foreach(__v => __obj.updateDynamic("CSS")(__v.asInstanceOf[js.Any]))
      CSSVersion.foreach(__v => __obj.updateDynamic("CSSVersion")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UICustomizationType]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ArnType
    var TagKeys: UserPoolTagsListType
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ArnType,
        TagKeys: UserPoolTagsListType
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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
  trait UpdateAuthEventFeedbackRequest extends js.Object {
    var EventId: EventIdType
    var FeedbackToken: TokenModelType
    var FeedbackValue: FeedbackValueType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object UpdateAuthEventFeedbackRequest {
    @inline
    def apply(
        EventId: EventIdType,
        FeedbackToken: TokenModelType,
        FeedbackValue: FeedbackValueType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): UpdateAuthEventFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "EventId" -> EventId.asInstanceOf[js.Any],
        "FeedbackToken" -> FeedbackToken.asInstanceOf[js.Any],
        "FeedbackValue" -> FeedbackValue.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAuthEventFeedbackRequest]
    }
  }

  @js.native
  trait UpdateAuthEventFeedbackResponse extends js.Object

  object UpdateAuthEventFeedbackResponse {
    @inline
    def apply(): UpdateAuthEventFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAuthEventFeedbackResponse]
    }
  }

  /** Represents the request to update the device status.
    */
  @js.native
  trait UpdateDeviceStatusRequest extends js.Object {
    var AccessToken: TokenModelType
    var DeviceKey: DeviceKeyType
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  object UpdateDeviceStatusRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        DeviceKey: DeviceKeyType,
        DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
    ): UpdateDeviceStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any]
      )

      DeviceRememberedStatus.foreach(__v => __obj.updateDynamic("DeviceRememberedStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceStatusRequest]
    }
  }

  /** The response to the request to update the device status.
    */
  @js.native
  trait UpdateDeviceStatusResponse extends js.Object

  object UpdateDeviceStatusResponse {
    @inline
    def apply(): UpdateDeviceStatusResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDeviceStatusResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Description: js.UndefOr[DescriptionType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  object UpdateGroupRequest {
    @inline
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        Precedence: js.UndefOr[PrecedenceType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Precedence.foreach(__v => __obj.updateDynamic("Precedence")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object UpdateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[GroupType] = js.undefined
    ): UpdateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
    var ProviderDetails: js.UndefOr[ProviderDetailsType]
  }

  object UpdateIdentityProviderRequest {
    @inline
    def apply(
        ProviderName: ProviderNameType,
        UserPoolId: UserPoolIdType,
        AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
        IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined,
        ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
    ): UpdateIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AttributeMapping.foreach(__v => __obj.updateDynamic("AttributeMapping")(__v.asInstanceOf[js.Any]))
      IdpIdentifiers.foreach(__v => __obj.updateDynamic("IdpIdentifiers")(__v.asInstanceOf[js.Any]))
      ProviderDetails.foreach(__v => __obj.updateDynamic("ProviderDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIdentityProviderRequest]
    }
  }

  @js.native
  trait UpdateIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object UpdateIdentityProviderResponse {
    @inline
    def apply(
        IdentityProvider: IdentityProviderType
    ): UpdateIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateIdentityProviderResponse]
    }
  }

  @js.native
  trait UpdateResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var Name: ResourceServerNameType
    var UserPoolId: UserPoolIdType
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  object UpdateResourceServerRequest {
    @inline
    def apply(
        Identifier: ResourceServerIdentifierType,
        Name: ResourceServerNameType,
        UserPoolId: UserPoolIdType,
        Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    ): UpdateResourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      Scopes.foreach(__v => __obj.updateDynamic("Scopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceServerRequest]
    }
  }

  @js.native
  trait UpdateResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  object UpdateResourceServerResponse {
    @inline
    def apply(
        ResourceServer: ResourceServerType
    ): UpdateResourceServerResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceServer" -> ResourceServer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResourceServerResponse]
    }
  }

  /** Represents the request to update user attributes.
    */
  @js.native
  trait UpdateUserAttributesRequest extends js.Object {
    var AccessToken: TokenModelType
    var UserAttributes: AttributeListType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  object UpdateUserAttributesRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        UserAttributes: AttributeListType,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    ): UpdateUserAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "UserAttributes" -> UserAttributes.asInstanceOf[js.Any]
      )

      ClientMetadata.foreach(__v => __obj.updateDynamic("ClientMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserAttributesRequest]
    }
  }

  /** Represents the response from the server for the request to update user attributes.
    */
  @js.native
  trait UpdateUserAttributesResponse extends js.Object {
    var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType]
  }

  object UpdateUserAttributesResponse {
    @inline
    def apply(
        CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.undefined
    ): UpdateUserAttributesResponse = {
      val __obj = js.Dynamic.literal()
      CodeDeliveryDetailsList.foreach(__v => __obj.updateDynamic("CodeDeliveryDetailsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserAttributesResponse]
    }
  }

  /** Represents the request to update the user pool client.
    */
  @js.native
  trait UpdateUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
    var AccessTokenValidity: js.UndefOr[AccessTokenValidityType]
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var AuthSessionValidity: js.UndefOr[AuthSessionValidityType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var ClientName: js.UndefOr[ClientNameType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType]
    var EnableTokenRevocation: js.UndefOr[WrappedBooleanType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var IdTokenValidity: js.UndefOr[IdTokenValidityType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
    var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var TokenValidityUnits: js.UndefOr[TokenValidityUnitsType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  object UpdateUserPoolClientRequest {
    @inline
    def apply(
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType,
        AccessTokenValidity: js.UndefOr[AccessTokenValidityType] = js.undefined,
        AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
        AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
        AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
        AuthSessionValidity: js.UndefOr[AuthSessionValidityType] = js.undefined,
        CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
        ClientName: js.UndefOr[ClientNameType] = js.undefined,
        DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
        EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType] = js.undefined,
        EnableTokenRevocation: js.UndefOr[WrappedBooleanType] = js.undefined,
        ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
        IdTokenValidity: js.UndefOr[IdTokenValidityType] = js.undefined,
        LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined,
        PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.undefined,
        ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
        RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
        SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
        TokenValidityUnits: js.UndefOr[TokenValidityUnitsType] = js.undefined,
        WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    ): UpdateUserPoolClientRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AccessTokenValidity.foreach(__v => __obj.updateDynamic("AccessTokenValidity")(__v.asInstanceOf[js.Any]))
      AllowedOAuthFlows.foreach(__v => __obj.updateDynamic("AllowedOAuthFlows")(__v.asInstanceOf[js.Any]))
      AllowedOAuthFlowsUserPoolClient.foreach(__v => __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(__v.asInstanceOf[js.Any]))
      AllowedOAuthScopes.foreach(__v => __obj.updateDynamic("AllowedOAuthScopes")(__v.asInstanceOf[js.Any]))
      AnalyticsConfiguration.foreach(__v => __obj.updateDynamic("AnalyticsConfiguration")(__v.asInstanceOf[js.Any]))
      AuthSessionValidity.foreach(__v => __obj.updateDynamic("AuthSessionValidity")(__v.asInstanceOf[js.Any]))
      CallbackURLs.foreach(__v => __obj.updateDynamic("CallbackURLs")(__v.asInstanceOf[js.Any]))
      ClientName.foreach(__v => __obj.updateDynamic("ClientName")(__v.asInstanceOf[js.Any]))
      DefaultRedirectURI.foreach(__v => __obj.updateDynamic("DefaultRedirectURI")(__v.asInstanceOf[js.Any]))
      EnablePropagateAdditionalUserContextData.foreach(__v => __obj.updateDynamic("EnablePropagateAdditionalUserContextData")(__v.asInstanceOf[js.Any]))
      EnableTokenRevocation.foreach(__v => __obj.updateDynamic("EnableTokenRevocation")(__v.asInstanceOf[js.Any]))
      ExplicitAuthFlows.foreach(__v => __obj.updateDynamic("ExplicitAuthFlows")(__v.asInstanceOf[js.Any]))
      IdTokenValidity.foreach(__v => __obj.updateDynamic("IdTokenValidity")(__v.asInstanceOf[js.Any]))
      LogoutURLs.foreach(__v => __obj.updateDynamic("LogoutURLs")(__v.asInstanceOf[js.Any]))
      PreventUserExistenceErrors.foreach(__v => __obj.updateDynamic("PreventUserExistenceErrors")(__v.asInstanceOf[js.Any]))
      ReadAttributes.foreach(__v => __obj.updateDynamic("ReadAttributes")(__v.asInstanceOf[js.Any]))
      RefreshTokenValidity.foreach(__v => __obj.updateDynamic("RefreshTokenValidity")(__v.asInstanceOf[js.Any]))
      SupportedIdentityProviders.foreach(__v => __obj.updateDynamic("SupportedIdentityProviders")(__v.asInstanceOf[js.Any]))
      TokenValidityUnits.foreach(__v => __obj.updateDynamic("TokenValidityUnits")(__v.asInstanceOf[js.Any]))
      WriteAttributes.foreach(__v => __obj.updateDynamic("WriteAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserPoolClientRequest]
    }
  }

  /** Represents the response from the server to the request to update the user pool client.
    */
  @js.native
  trait UpdateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object UpdateUserPoolClientResponse {
    @inline
    def apply(
        UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
    ): UpdateUserPoolClientResponse = {
      val __obj = js.Dynamic.literal()
      UserPoolClient.foreach(__v => __obj.updateDynamic("UserPoolClient")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserPoolClientResponse]
    }
  }

  /** The UpdateUserPoolDomain request input.
    */
  @js.native
  trait UpdateUserPoolDomainRequest extends js.Object {
    var CustomDomainConfig: CustomDomainConfigType
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
  }

  object UpdateUserPoolDomainRequest {
    @inline
    def apply(
        CustomDomainConfig: CustomDomainConfigType,
        Domain: DomainType,
        UserPoolId: UserPoolIdType
    ): UpdateUserPoolDomainRequest = {
      val __obj = js.Dynamic.literal(
        "CustomDomainConfig" -> CustomDomainConfig.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserPoolDomainRequest]
    }
  }

  /** The UpdateUserPoolDomain response output.
    */
  @js.native
  trait UpdateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  object UpdateUserPoolDomainResponse {
    @inline
    def apply(
        CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
    ): UpdateUserPoolDomainResponse = {
      val __obj = js.Dynamic.literal()
      CloudFrontDomain.foreach(__v => __obj.updateDynamic("CloudFrontDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserPoolDomainResponse]
    }
  }

  /** Represents the request to update the user pool.
    */
  @js.native
  trait UpdateUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var DeletionProtection: js.UndefOr[DeletionProtectionType]
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType]
    var EmailConfiguration: js.UndefOr[EmailConfigurationType]
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var Policies: js.UndefOr[UserPoolPolicyType]
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType]
    var UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType]
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object UpdateUserPoolRequest {
    @inline
    def apply(
        UserPoolId: UserPoolIdType,
        AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined,
        AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
        AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
        DeletionProtection: js.UndefOr[DeletionProtectionType] = js.undefined,
        DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined,
        EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined,
        EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        Policies: js.UndefOr[UserPoolPolicyType] = js.undefined,
        SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined,
        SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType] = js.undefined,
        UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
        UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
        VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
    ): UpdateUserPoolRequest = {
      val __obj = js.Dynamic.literal(
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      )

      AccountRecoverySetting.foreach(__v => __obj.updateDynamic("AccountRecoverySetting")(__v.asInstanceOf[js.Any]))
      AdminCreateUserConfig.foreach(__v => __obj.updateDynamic("AdminCreateUserConfig")(__v.asInstanceOf[js.Any]))
      AutoVerifiedAttributes.foreach(__v => __obj.updateDynamic("AutoVerifiedAttributes")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      DeviceConfiguration.foreach(__v => __obj.updateDynamic("DeviceConfiguration")(__v.asInstanceOf[js.Any]))
      EmailConfiguration.foreach(__v => __obj.updateDynamic("EmailConfiguration")(__v.asInstanceOf[js.Any]))
      EmailVerificationMessage.foreach(__v => __obj.updateDynamic("EmailVerificationMessage")(__v.asInstanceOf[js.Any]))
      EmailVerificationSubject.foreach(__v => __obj.updateDynamic("EmailVerificationSubject")(__v.asInstanceOf[js.Any]))
      LambdaConfig.foreach(__v => __obj.updateDynamic("LambdaConfig")(__v.asInstanceOf[js.Any]))
      MfaConfiguration.foreach(__v => __obj.updateDynamic("MfaConfiguration")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      SmsAuthenticationMessage.foreach(__v => __obj.updateDynamic("SmsAuthenticationMessage")(__v.asInstanceOf[js.Any]))
      SmsConfiguration.foreach(__v => __obj.updateDynamic("SmsConfiguration")(__v.asInstanceOf[js.Any]))
      SmsVerificationMessage.foreach(__v => __obj.updateDynamic("SmsVerificationMessage")(__v.asInstanceOf[js.Any]))
      UserAttributeUpdateSettings.foreach(__v => __obj.updateDynamic("UserAttributeUpdateSettings")(__v.asInstanceOf[js.Any]))
      UserPoolAddOns.foreach(__v => __obj.updateDynamic("UserPoolAddOns")(__v.asInstanceOf[js.Any]))
      UserPoolTags.foreach(__v => __obj.updateDynamic("UserPoolTags")(__v.asInstanceOf[js.Any]))
      VerificationMessageTemplate.foreach(__v => __obj.updateDynamic("VerificationMessageTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserPoolRequest]
    }
  }

  /** Represents the response from the server when you make a request to update the user pool.
    */
  @js.native
  trait UpdateUserPoolResponse extends js.Object

  object UpdateUserPoolResponse {
    @inline
    def apply(): UpdateUserPoolResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUserPoolResponse]
    }
  }

  /** The settings for updates to user attributes. These settings include the property <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how to handle changes to the value of your users' email address and phone number attributes. For more information, see [[https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates| Verifying updates to email addresses and phone numbers]].
    */
  @js.native
  trait UserAttributeUpdateSettingsType extends js.Object {
    var AttributesRequireVerificationBeforeUpdate: js.UndefOr[AttributesRequireVerificationBeforeUpdateType]
  }

  object UserAttributeUpdateSettingsType {
    @inline
    def apply(
        AttributesRequireVerificationBeforeUpdate: js.UndefOr[AttributesRequireVerificationBeforeUpdateType] = js.undefined
    ): UserAttributeUpdateSettingsType = {
      val __obj = js.Dynamic.literal()
      AttributesRequireVerificationBeforeUpdate.foreach(__v => __obj.updateDynamic("AttributesRequireVerificationBeforeUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserAttributeUpdateSettingsType]
    }
  }

  /** Contextual data, such as the user's device fingerprint, IP address, or location, used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  @js.native
  trait UserContextDataType extends js.Object {
    var EncodedData: js.UndefOr[StringType]
    var IpAddress: js.UndefOr[StringType]
  }

  object UserContextDataType {
    @inline
    def apply(
        EncodedData: js.UndefOr[StringType] = js.undefined,
        IpAddress: js.UndefOr[StringType] = js.undefined
    ): UserContextDataType = {
      val __obj = js.Dynamic.literal()
      EncodedData.foreach(__v => __obj.updateDynamic("EncodedData")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserContextDataType]
    }
  }

  /** The user import job type.
    */
  @js.native
  trait UserImportJobType extends js.Object {
    var CloudWatchLogsRoleArn: js.UndefOr[ArnType]
    var CompletionDate: js.UndefOr[DateType]
    var CompletionMessage: js.UndefOr[CompletionMessageType]
    var CreationDate: js.UndefOr[DateType]
    var FailedUsers: js.UndefOr[LongType]
    var ImportedUsers: js.UndefOr[LongType]
    var JobId: js.UndefOr[UserImportJobIdType]
    var JobName: js.UndefOr[UserImportJobNameType]
    var PreSignedUrl: js.UndefOr[PreSignedUrlType]
    var SkippedUsers: js.UndefOr[LongType]
    var StartDate: js.UndefOr[DateType]
    var Status: js.UndefOr[UserImportJobStatusType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object UserImportJobType {
    @inline
    def apply(
        CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.undefined,
        CompletionDate: js.UndefOr[DateType] = js.undefined,
        CompletionMessage: js.UndefOr[CompletionMessageType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        FailedUsers: js.UndefOr[LongType] = js.undefined,
        ImportedUsers: js.UndefOr[LongType] = js.undefined,
        JobId: js.UndefOr[UserImportJobIdType] = js.undefined,
        JobName: js.UndefOr[UserImportJobNameType] = js.undefined,
        PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.undefined,
        SkippedUsers: js.UndefOr[LongType] = js.undefined,
        StartDate: js.UndefOr[DateType] = js.undefined,
        Status: js.UndefOr[UserImportJobStatusType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): UserImportJobType = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.updateDynamic("CompletionDate")(__v.asInstanceOf[js.Any]))
      CompletionMessage.foreach(__v => __obj.updateDynamic("CompletionMessage")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      FailedUsers.foreach(__v => __obj.updateDynamic("FailedUsers")(__v.asInstanceOf[js.Any]))
      ImportedUsers.foreach(__v => __obj.updateDynamic("ImportedUsers")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      SkippedUsers.foreach(__v => __obj.updateDynamic("SkippedUsers")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserImportJobType]
    }
  }

  /** The user pool add-ons type.
    */
  @js.native
  trait UserPoolAddOnsType extends js.Object {
    var AdvancedSecurityMode: AdvancedSecurityModeType
  }

  object UserPoolAddOnsType {
    @inline
    def apply(
        AdvancedSecurityMode: AdvancedSecurityModeType
    ): UserPoolAddOnsType = {
      val __obj = js.Dynamic.literal(
        "AdvancedSecurityMode" -> AdvancedSecurityMode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserPoolAddOnsType]
    }
  }

  /** The description of the user pool client.
    */
  @js.native
  trait UserPoolClientDescription extends js.Object {
    var ClientId: js.UndefOr[ClientIdType]
    var ClientName: js.UndefOr[ClientNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object UserPoolClientDescription {
    @inline
    def apply(
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        ClientName: js.UndefOr[ClientNameType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): UserPoolClientDescription = {
      val __obj = js.Dynamic.literal()
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      ClientName.foreach(__v => __obj.updateDynamic("ClientName")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolClientDescription]
    }
  }

  /** Contains information about a user pool client.
    */
  @js.native
  trait UserPoolClientType extends js.Object {
    var AccessTokenValidity: js.UndefOr[AccessTokenValidityType]
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var AuthSessionValidity: js.UndefOr[AuthSessionValidityType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var ClientId: js.UndefOr[ClientIdType]
    var ClientName: js.UndefOr[ClientNameType]
    var ClientSecret: js.UndefOr[ClientSecretType]
    var CreationDate: js.UndefOr[DateType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType]
    var EnableTokenRevocation: js.UndefOr[WrappedBooleanType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var IdTokenValidity: js.UndefOr[IdTokenValidityType]
    var LastModifiedDate: js.UndefOr[DateType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
    var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var TokenValidityUnits: js.UndefOr[TokenValidityUnitsType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  object UserPoolClientType {
    @inline
    def apply(
        AccessTokenValidity: js.UndefOr[AccessTokenValidityType] = js.undefined,
        AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
        AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
        AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
        AuthSessionValidity: js.UndefOr[AuthSessionValidityType] = js.undefined,
        CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        ClientName: js.UndefOr[ClientNameType] = js.undefined,
        ClientSecret: js.UndefOr[ClientSecretType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
        EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType] = js.undefined,
        EnableTokenRevocation: js.UndefOr[WrappedBooleanType] = js.undefined,
        ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
        IdTokenValidity: js.UndefOr[IdTokenValidityType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined,
        PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.undefined,
        ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
        RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
        SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
        TokenValidityUnits: js.UndefOr[TokenValidityUnitsType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
        WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    ): UserPoolClientType = {
      val __obj = js.Dynamic.literal()
      AccessTokenValidity.foreach(__v => __obj.updateDynamic("AccessTokenValidity")(__v.asInstanceOf[js.Any]))
      AllowedOAuthFlows.foreach(__v => __obj.updateDynamic("AllowedOAuthFlows")(__v.asInstanceOf[js.Any]))
      AllowedOAuthFlowsUserPoolClient.foreach(__v => __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(__v.asInstanceOf[js.Any]))
      AllowedOAuthScopes.foreach(__v => __obj.updateDynamic("AllowedOAuthScopes")(__v.asInstanceOf[js.Any]))
      AnalyticsConfiguration.foreach(__v => __obj.updateDynamic("AnalyticsConfiguration")(__v.asInstanceOf[js.Any]))
      AuthSessionValidity.foreach(__v => __obj.updateDynamic("AuthSessionValidity")(__v.asInstanceOf[js.Any]))
      CallbackURLs.foreach(__v => __obj.updateDynamic("CallbackURLs")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      ClientName.foreach(__v => __obj.updateDynamic("ClientName")(__v.asInstanceOf[js.Any]))
      ClientSecret.foreach(__v => __obj.updateDynamic("ClientSecret")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DefaultRedirectURI.foreach(__v => __obj.updateDynamic("DefaultRedirectURI")(__v.asInstanceOf[js.Any]))
      EnablePropagateAdditionalUserContextData.foreach(__v => __obj.updateDynamic("EnablePropagateAdditionalUserContextData")(__v.asInstanceOf[js.Any]))
      EnableTokenRevocation.foreach(__v => __obj.updateDynamic("EnableTokenRevocation")(__v.asInstanceOf[js.Any]))
      ExplicitAuthFlows.foreach(__v => __obj.updateDynamic("ExplicitAuthFlows")(__v.asInstanceOf[js.Any]))
      IdTokenValidity.foreach(__v => __obj.updateDynamic("IdTokenValidity")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LogoutURLs.foreach(__v => __obj.updateDynamic("LogoutURLs")(__v.asInstanceOf[js.Any]))
      PreventUserExistenceErrors.foreach(__v => __obj.updateDynamic("PreventUserExistenceErrors")(__v.asInstanceOf[js.Any]))
      ReadAttributes.foreach(__v => __obj.updateDynamic("ReadAttributes")(__v.asInstanceOf[js.Any]))
      RefreshTokenValidity.foreach(__v => __obj.updateDynamic("RefreshTokenValidity")(__v.asInstanceOf[js.Any]))
      SupportedIdentityProviders.foreach(__v => __obj.updateDynamic("SupportedIdentityProviders")(__v.asInstanceOf[js.Any]))
      TokenValidityUnits.foreach(__v => __obj.updateDynamic("TokenValidityUnits")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      WriteAttributes.foreach(__v => __obj.updateDynamic("WriteAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolClientType]
    }
  }

  /** A user pool description.
    */
  @js.native
  trait UserPoolDescriptionType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var Id: js.UndefOr[UserPoolIdType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var LastModifiedDate: js.UndefOr[DateType]
    var Name: js.UndefOr[UserPoolNameType]
    var Status: js.UndefOr[StatusType]
  }

  object UserPoolDescriptionType {
    @inline
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        Id: js.UndefOr[UserPoolIdType] = js.undefined,
        LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        Name: js.UndefOr[UserPoolNameType] = js.undefined,
        Status: js.UndefOr[StatusType] = js.undefined
    ): UserPoolDescriptionType = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LambdaConfig.foreach(__v => __obj.updateDynamic("LambdaConfig")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolDescriptionType]
    }
  }

  /** The policy associated with a user pool.
    */
  @js.native
  trait UserPoolPolicyType extends js.Object {
    var PasswordPolicy: js.UndefOr[PasswordPolicyType]
  }

  object UserPoolPolicyType {
    @inline
    def apply(
        PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.undefined
    ): UserPoolPolicyType = {
      val __obj = js.Dynamic.literal()
      PasswordPolicy.foreach(__v => __obj.updateDynamic("PasswordPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolPolicyType]
    }
  }

  /** A container for information about the user pool.
    */
  @js.native
  trait UserPoolType extends js.Object {
    var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var AliasAttributes: js.UndefOr[AliasAttributesListType]
    var Arn: js.UndefOr[ArnType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var CreationDate: js.UndefOr[DateType]
    var CustomDomain: js.UndefOr[DomainType]
    var DeletionProtection: js.UndefOr[DeletionProtectionType]
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType]
    var Domain: js.UndefOr[DomainType]
    var EmailConfiguration: js.UndefOr[EmailConfigurationType]
    var EmailConfigurationFailure: js.UndefOr[StringType]
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType]
    var EstimatedNumberOfUsers: js.UndefOr[IntegerType]
    var Id: js.UndefOr[UserPoolIdType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var LastModifiedDate: js.UndefOr[DateType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var Name: js.UndefOr[UserPoolNameType]
    var Policies: js.UndefOr[UserPoolPolicyType]
    var SchemaAttributes: js.UndefOr[SchemaAttributesListType]
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
    var SmsConfigurationFailure: js.UndefOr[StringType]
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType]
    var Status: js.UndefOr[StatusType]
    var UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType]
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType]
    var UsernameConfiguration: js.UndefOr[UsernameConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object UserPoolType {
    @inline
    def apply(
        AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined,
        AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
        AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined,
        Arn: js.UndefOr[ArnType] = js.undefined,
        AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        CustomDomain: js.UndefOr[DomainType] = js.undefined,
        DeletionProtection: js.UndefOr[DeletionProtectionType] = js.undefined,
        DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined,
        Domain: js.UndefOr[DomainType] = js.undefined,
        EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined,
        EmailConfigurationFailure: js.UndefOr[StringType] = js.undefined,
        EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.undefined,
        Id: js.UndefOr[UserPoolIdType] = js.undefined,
        LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        Name: js.UndefOr[UserPoolNameType] = js.undefined,
        Policies: js.UndefOr[UserPoolPolicyType] = js.undefined,
        SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.undefined,
        SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined,
        SmsConfigurationFailure: js.UndefOr[StringType] = js.undefined,
        SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        Status: js.UndefOr[StatusType] = js.undefined,
        UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType] = js.undefined,
        UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
        UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
        UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined,
        UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.undefined,
        VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
    ): UserPoolType = {
      val __obj = js.Dynamic.literal()
      AccountRecoverySetting.foreach(__v => __obj.updateDynamic("AccountRecoverySetting")(__v.asInstanceOf[js.Any]))
      AdminCreateUserConfig.foreach(__v => __obj.updateDynamic("AdminCreateUserConfig")(__v.asInstanceOf[js.Any]))
      AliasAttributes.foreach(__v => __obj.updateDynamic("AliasAttributes")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AutoVerifiedAttributes.foreach(__v => __obj.updateDynamic("AutoVerifiedAttributes")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      CustomDomain.foreach(__v => __obj.updateDynamic("CustomDomain")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      DeviceConfiguration.foreach(__v => __obj.updateDynamic("DeviceConfiguration")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      EmailConfiguration.foreach(__v => __obj.updateDynamic("EmailConfiguration")(__v.asInstanceOf[js.Any]))
      EmailConfigurationFailure.foreach(__v => __obj.updateDynamic("EmailConfigurationFailure")(__v.asInstanceOf[js.Any]))
      EmailVerificationMessage.foreach(__v => __obj.updateDynamic("EmailVerificationMessage")(__v.asInstanceOf[js.Any]))
      EmailVerificationSubject.foreach(__v => __obj.updateDynamic("EmailVerificationSubject")(__v.asInstanceOf[js.Any]))
      EstimatedNumberOfUsers.foreach(__v => __obj.updateDynamic("EstimatedNumberOfUsers")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LambdaConfig.foreach(__v => __obj.updateDynamic("LambdaConfig")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      MfaConfiguration.foreach(__v => __obj.updateDynamic("MfaConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      SchemaAttributes.foreach(__v => __obj.updateDynamic("SchemaAttributes")(__v.asInstanceOf[js.Any]))
      SmsAuthenticationMessage.foreach(__v => __obj.updateDynamic("SmsAuthenticationMessage")(__v.asInstanceOf[js.Any]))
      SmsConfiguration.foreach(__v => __obj.updateDynamic("SmsConfiguration")(__v.asInstanceOf[js.Any]))
      SmsConfigurationFailure.foreach(__v => __obj.updateDynamic("SmsConfigurationFailure")(__v.asInstanceOf[js.Any]))
      SmsVerificationMessage.foreach(__v => __obj.updateDynamic("SmsVerificationMessage")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserAttributeUpdateSettings.foreach(__v => __obj.updateDynamic("UserAttributeUpdateSettings")(__v.asInstanceOf[js.Any]))
      UserPoolAddOns.foreach(__v => __obj.updateDynamic("UserPoolAddOns")(__v.asInstanceOf[js.Any]))
      UserPoolTags.foreach(__v => __obj.updateDynamic("UserPoolTags")(__v.asInstanceOf[js.Any]))
      UsernameAttributes.foreach(__v => __obj.updateDynamic("UsernameAttributes")(__v.asInstanceOf[js.Any]))
      UsernameConfiguration.foreach(__v => __obj.updateDynamic("UsernameConfiguration")(__v.asInstanceOf[js.Any]))
      VerificationMessageTemplate.foreach(__v => __obj.updateDynamic("VerificationMessageTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolType]
    }
  }

  /** A user profile in a Amazon Cognito user pool.
    */
  @js.native
  trait UserType extends js.Object {
    var Attributes: js.UndefOr[AttributeListType]
    var Enabled: js.UndefOr[BooleanType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var UserCreateDate: js.UndefOr[DateType]
    var UserLastModifiedDate: js.UndefOr[DateType]
    var UserStatus: js.UndefOr[UserStatusType]
    var Username: js.UndefOr[UsernameType]
  }

  object UserType {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeListType] = js.undefined,
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
        UserCreateDate: js.UndefOr[DateType] = js.undefined,
        UserLastModifiedDate: js.UndefOr[DateType] = js.undefined,
        UserStatus: js.UndefOr[UserStatusType] = js.undefined,
        Username: js.UndefOr[UsernameType] = js.undefined
    ): UserType = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      MFAOptions.foreach(__v => __obj.updateDynamic("MFAOptions")(__v.asInstanceOf[js.Any]))
      UserCreateDate.foreach(__v => __obj.updateDynamic("UserCreateDate")(__v.asInstanceOf[js.Any]))
      UserLastModifiedDate.foreach(__v => __obj.updateDynamic("UserLastModifiedDate")(__v.asInstanceOf[js.Any]))
      UserStatus.foreach(__v => __obj.updateDynamic("UserStatus")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserType]
    }
  }

  /** The username configuration type.
    */
  @js.native
  trait UsernameConfigurationType extends js.Object {
    var CaseSensitive: WrappedBooleanType
  }

  object UsernameConfigurationType {
    @inline
    def apply(
        CaseSensitive: WrappedBooleanType
    ): UsernameConfigurationType = {
      val __obj = js.Dynamic.literal(
        "CaseSensitive" -> CaseSensitive.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UsernameConfigurationType]
    }
  }

  /** The template for verification messages.
    */
  @js.native
  trait VerificationMessageTemplateType extends js.Object {
    var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType]
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
    var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType]
    var SmsMessage: js.UndefOr[SmsVerificationMessageType]
  }

  object VerificationMessageTemplateType {
    @inline
    def apply(
        DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.undefined,
        EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.undefined,
        EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.undefined,
        SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    ): VerificationMessageTemplateType = {
      val __obj = js.Dynamic.literal()
      DefaultEmailOption.foreach(__v => __obj.updateDynamic("DefaultEmailOption")(__v.asInstanceOf[js.Any]))
      EmailMessage.foreach(__v => __obj.updateDynamic("EmailMessage")(__v.asInstanceOf[js.Any]))
      EmailMessageByLink.foreach(__v => __obj.updateDynamic("EmailMessageByLink")(__v.asInstanceOf[js.Any]))
      EmailSubject.foreach(__v => __obj.updateDynamic("EmailSubject")(__v.asInstanceOf[js.Any]))
      EmailSubjectByLink.foreach(__v => __obj.updateDynamic("EmailSubjectByLink")(__v.asInstanceOf[js.Any]))
      SmsMessage.foreach(__v => __obj.updateDynamic("SmsMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VerificationMessageTemplateType]
    }
  }

  @js.native
  trait VerifySoftwareTokenRequest extends js.Object {
    var UserCode: SoftwareTokenMFAUserCodeType
    var AccessToken: js.UndefOr[TokenModelType]
    var FriendlyDeviceName: js.UndefOr[StringType]
    var Session: js.UndefOr[SessionType]
  }

  object VerifySoftwareTokenRequest {
    @inline
    def apply(
        UserCode: SoftwareTokenMFAUserCodeType,
        AccessToken: js.UndefOr[TokenModelType] = js.undefined,
        FriendlyDeviceName: js.UndefOr[StringType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): VerifySoftwareTokenRequest = {
      val __obj = js.Dynamic.literal(
        "UserCode" -> UserCode.asInstanceOf[js.Any]
      )

      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      FriendlyDeviceName.foreach(__v => __obj.updateDynamic("FriendlyDeviceName")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VerifySoftwareTokenRequest]
    }
  }

  @js.native
  trait VerifySoftwareTokenResponse extends js.Object {
    var Session: js.UndefOr[SessionType]
    var Status: js.UndefOr[VerifySoftwareTokenResponseType]
  }

  object VerifySoftwareTokenResponse {
    @inline
    def apply(
        Session: js.UndefOr[SessionType] = js.undefined,
        Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.undefined
    ): VerifySoftwareTokenResponse = {
      val __obj = js.Dynamic.literal()
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VerifySoftwareTokenResponse]
    }
  }

  /** Represents the request to verify user attributes.
    */
  @js.native
  trait VerifyUserAttributeRequest extends js.Object {
    var AccessToken: TokenModelType
    var AttributeName: AttributeNameType
    var Code: ConfirmationCodeType
  }

  object VerifyUserAttributeRequest {
    @inline
    def apply(
        AccessToken: TokenModelType,
        AttributeName: AttributeNameType,
        Code: ConfirmationCodeType
    ): VerifyUserAttributeRequest = {
      val __obj = js.Dynamic.literal(
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Code" -> Code.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VerifyUserAttributeRequest]
    }
  }

  /** A container representing the response from the server from the request to verify user attributes.
    */
  @js.native
  trait VerifyUserAttributeResponse extends js.Object

  object VerifyUserAttributeResponse {
    @inline
    def apply(): VerifyUserAttributeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyUserAttributeResponse]
    }
  }
}
