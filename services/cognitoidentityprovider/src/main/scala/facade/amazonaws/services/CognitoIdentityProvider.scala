package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cognitoidentityprovider {
  type AWSAccountIdType                             = String
  type AccountTakeoverActionNotifyType              = Boolean
  type AdminCreateUserUnusedAccountValidityDaysType = Int
  type AliasAttributesListType                      = js.Array[AliasAttributeType]
  type ArnType                                      = String
  type AttributeListType                            = js.Array[AttributeType]
  type AttributeMappingKeyType                      = String
  type AttributeMappingType                         = js.Dictionary[StringType]
  type AttributeNameListType                        = js.Array[AttributeNameType]
  type AttributeNameType                            = String
  type AttributeValueType                           = String
  type AuthEventsType                               = js.Array[AuthEventType]
  type AuthParametersType                           = js.Dictionary[AuthParametersValueType]
  type AuthParametersValueType                      = String
  type BlockedIPRangeListType                       = js.Array[StringType]
  type BooleanType                                  = Boolean
  type CSSType                                      = String
  type CSSVersionType                               = String
  type CallbackURLsListType                         = js.Array[RedirectUrlType]
  type ChallengeParametersType                      = js.Dictionary[StringType]
  type ChallengeResponseListType                    = js.Array[ChallengeResponseType]
  type ChallengeResponsesType                       = js.Dictionary[StringType]
  type ClientIdType                                 = String
  type ClientMetadataType                           = js.Dictionary[StringType]
  type ClientNameType                               = String
  type ClientPermissionListType                     = js.Array[ClientPermissionType]
  type ClientPermissionType                         = String
  type ClientSecretType                             = String
  type CodeDeliveryDetailsListType                  = js.Array[CodeDeliveryDetailsType]
  type CompletionMessageType                        = String
  type ConfirmationCodeType                         = String
  type CustomAttributeNameType                      = String
  type CustomAttributesListType                     = js.Array[SchemaAttributeType]
  type DateType                                     = js.Date
  type DeliveryMediumListType                       = js.Array[DeliveryMediumType]
  type DescriptionType                              = String
  type DeviceKeyType                                = String
  type DeviceListType                               = js.Array[DeviceType]
  type DeviceNameType                               = String
  type DomainType                                   = String
  type DomainVersionType                            = String
  type EmailAddressType                             = String
  type EmailNotificationBodyType                    = String
  type EmailNotificationSubjectType                 = String
  type EmailVerificationMessageByLinkType           = String
  type EmailVerificationMessageType                 = String
  type EmailVerificationSubjectByLinkType           = String
  type EmailVerificationSubjectType                 = String
  type EventFiltersType                             = js.Array[EventFilterType]
  type EventIdType                                  = String
  type ExplicitAuthFlowsListType                    = js.Array[ExplicitAuthFlowsType]
  type ForceAliasCreation                           = Boolean
  type GenerateSecret                               = Boolean
  type GroupListType                                = js.Array[GroupType]
  type GroupNameType                                = String
  type HexStringType                                = String
  type HttpHeaderList                               = js.Array[HttpHeader]
  type IdpIdentifierType                            = String
  type IdpIdentifiersListType                       = js.Array[IdpIdentifierType]
  type ImageFileType                                = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageUrlType                                 = String
  type IntegerType                                  = Int
  type ListOfStringTypes                            = js.Array[StringType]
  type ListProvidersLimitType                       = Int
  type ListResourceServersLimitType                 = Int
  type LogoutURLsListType                           = js.Array[RedirectUrlType]
  type LongType                                     = Double
  type MFAOptionListType                            = js.Array[MFAOptionType]
  type OAuthFlowsType                               = js.Array[OAuthFlowType]
  type PaginationKey                                = String
  type PaginationKeyType                            = String
  type PasswordPolicyMinLengthType                  = Int
  type PasswordType                                 = String
  type PoolQueryLimitType                           = Int
  type PreSignedUrlType                             = String
  type PrecedenceType                               = Int
  type PriorityType                                 = Int
  type ProviderDetailsType                          = js.Dictionary[StringType]
  type ProviderNameType                             = String
  type ProviderNameTypeV1                           = String
  type ProvidersListType                            = js.Array[ProviderDescription]
  type QueryLimit                                   = Int
  type QueryLimitType                               = Int
  type RecoveryMechanismsType                       = js.Array[RecoveryOptionType]
  type RedirectUrlType                              = String
  type RefreshTokenValidityType                     = Int
  type ResourceServerIdentifierType                 = String
  type ResourceServerNameType                       = String
  type ResourceServerScopeDescriptionType           = String
  type ResourceServerScopeListType                  = js.Array[ResourceServerScopeType]
  type ResourceServerScopeNameType                  = String
  type ResourceServersListType                      = js.Array[ResourceServerType]
  type S3BucketType                                 = String
  type SESConfigurationSet                          = String
  type SchemaAttributesListType                     = js.Array[SchemaAttributeType]
  type ScopeListType                                = js.Array[ScopeType]
  type ScopeType                                    = String
  type SearchPaginationTokenType                    = String
  type SearchedAttributeNamesListType               = js.Array[AttributeNameType]
  type SecretCodeType                               = String
  type SecretHashType                               = String
  type SessionType                                  = String
  type SkippedIPRangeListType                       = js.Array[StringType]
  type SmsVerificationMessageType                   = String
  type SoftwareTokenMFAUserCodeType                 = String
  type StringType                                   = String
  type SupportedIdentityProvidersListType           = js.Array[ProviderNameType]
  type TagKeysType                                  = String
  type TagValueType                                 = String
  type TemporaryPasswordValidityDaysType            = Int
  type TokenModelType                               = String
  type UserFilterType                               = String
  type UserImportJobIdType                          = String
  type UserImportJobNameType                        = String
  type UserImportJobsListType                       = js.Array[UserImportJobType]
  type UserMFASettingListType                       = js.Array[StringType]
  type UserPoolClientListType                       = js.Array[UserPoolClientDescription]
  type UserPoolIdType                               = String
  type UserPoolListType                             = js.Array[UserPoolDescriptionType]
  type UserPoolNameType                             = String
  type UserPoolTagsListType                         = js.Array[TagKeysType]
  type UserPoolTagsType                             = js.Dictionary[TagValueType]
  type UsernameAttributesListType                   = js.Array[UsernameAttributeType]
  type UsernameType                                 = String
  type UsersListType                                = js.Array[UserType]
  type VerifiedAttributesListType                   = js.Array[VerifiedAttributeType]
  type WrappedBooleanType                           = Boolean

  implicit final class CognitoIdentityProviderOps(private val service: CognitoIdentityProvider) extends AnyVal {

    @inline def addCustomAttributesFuture(params: AddCustomAttributesRequest): Future[AddCustomAttributesResponse] =
      service.addCustomAttributes(params).promise().toFuture
    @inline def adminAddUserToGroupFuture(params: AdminAddUserToGroupRequest): Future[js.Object] =
      service.adminAddUserToGroup(params).promise().toFuture
    @inline def adminConfirmSignUpFuture(params: AdminConfirmSignUpRequest): Future[AdminConfirmSignUpResponse] =
      service.adminConfirmSignUp(params).promise().toFuture
    @inline def adminCreateUserFuture(params: AdminCreateUserRequest): Future[AdminCreateUserResponse] =
      service.adminCreateUser(params).promise().toFuture
    @inline def adminDeleteUserAttributesFuture(
        params: AdminDeleteUserAttributesRequest
    ): Future[AdminDeleteUserAttributesResponse] = service.adminDeleteUserAttributes(params).promise().toFuture
    @inline def adminDeleteUserFuture(params: AdminDeleteUserRequest): Future[js.Object] =
      service.adminDeleteUser(params).promise().toFuture
    @inline def adminDisableProviderForUserFuture(
        params: AdminDisableProviderForUserRequest
    ): Future[AdminDisableProviderForUserResponse] = service.adminDisableProviderForUser(params).promise().toFuture
    @inline def adminDisableUserFuture(params: AdminDisableUserRequest): Future[AdminDisableUserResponse] =
      service.adminDisableUser(params).promise().toFuture
    @inline def adminEnableUserFuture(params: AdminEnableUserRequest): Future[AdminEnableUserResponse] =
      service.adminEnableUser(params).promise().toFuture
    @inline def adminForgetDeviceFuture(params: AdminForgetDeviceRequest): Future[js.Object] =
      service.adminForgetDevice(params).promise().toFuture
    @inline def adminGetDeviceFuture(params: AdminGetDeviceRequest): Future[AdminGetDeviceResponse] =
      service.adminGetDevice(params).promise().toFuture
    @inline def adminGetUserFuture(params: AdminGetUserRequest): Future[AdminGetUserResponse] =
      service.adminGetUser(params).promise().toFuture
    @inline def adminInitiateAuthFuture(params: AdminInitiateAuthRequest): Future[AdminInitiateAuthResponse] =
      service.adminInitiateAuth(params).promise().toFuture
    @inline def adminLinkProviderForUserFuture(
        params: AdminLinkProviderForUserRequest
    ): Future[AdminLinkProviderForUserResponse] = service.adminLinkProviderForUser(params).promise().toFuture
    @inline def adminListDevicesFuture(params: AdminListDevicesRequest): Future[AdminListDevicesResponse] =
      service.adminListDevices(params).promise().toFuture
    @inline def adminListGroupsForUserFuture(
        params: AdminListGroupsForUserRequest
    ): Future[AdminListGroupsForUserResponse] = service.adminListGroupsForUser(params).promise().toFuture
    @inline def adminListUserAuthEventsFuture(
        params: AdminListUserAuthEventsRequest
    ): Future[AdminListUserAuthEventsResponse] = service.adminListUserAuthEvents(params).promise().toFuture
    @inline def adminRemoveUserFromGroupFuture(params: AdminRemoveUserFromGroupRequest): Future[js.Object] =
      service.adminRemoveUserFromGroup(params).promise().toFuture
    @inline def adminResetUserPasswordFuture(
        params: AdminResetUserPasswordRequest
    ): Future[AdminResetUserPasswordResponse] = service.adminResetUserPassword(params).promise().toFuture
    @inline def adminRespondToAuthChallengeFuture(
        params: AdminRespondToAuthChallengeRequest
    ): Future[AdminRespondToAuthChallengeResponse] = service.adminRespondToAuthChallenge(params).promise().toFuture
    @inline def adminSetUserMFAPreferenceFuture(
        params: AdminSetUserMFAPreferenceRequest
    ): Future[AdminSetUserMFAPreferenceResponse] = service.adminSetUserMFAPreference(params).promise().toFuture
    @inline def adminSetUserPasswordFuture(params: AdminSetUserPasswordRequest): Future[AdminSetUserPasswordResponse] =
      service.adminSetUserPassword(params).promise().toFuture
    @inline def adminSetUserSettingsFuture(params: AdminSetUserSettingsRequest): Future[AdminSetUserSettingsResponse] =
      service.adminSetUserSettings(params).promise().toFuture
    @inline def adminUpdateAuthEventFeedbackFuture(
        params: AdminUpdateAuthEventFeedbackRequest
    ): Future[AdminUpdateAuthEventFeedbackResponse] = service.adminUpdateAuthEventFeedback(params).promise().toFuture
    @inline def adminUpdateDeviceStatusFuture(
        params: AdminUpdateDeviceStatusRequest
    ): Future[AdminUpdateDeviceStatusResponse] = service.adminUpdateDeviceStatus(params).promise().toFuture
    @inline def adminUpdateUserAttributesFuture(
        params: AdminUpdateUserAttributesRequest
    ): Future[AdminUpdateUserAttributesResponse] = service.adminUpdateUserAttributes(params).promise().toFuture
    @inline def adminUserGlobalSignOutFuture(
        params: AdminUserGlobalSignOutRequest
    ): Future[AdminUserGlobalSignOutResponse] = service.adminUserGlobalSignOut(params).promise().toFuture
    @inline def associateSoftwareTokenFuture(
        params: AssociateSoftwareTokenRequest
    ): Future[AssociateSoftwareTokenResponse] = service.associateSoftwareToken(params).promise().toFuture
    @inline def changePasswordFuture(params: ChangePasswordRequest): Future[ChangePasswordResponse] =
      service.changePassword(params).promise().toFuture
    @inline def confirmDeviceFuture(params: ConfirmDeviceRequest): Future[ConfirmDeviceResponse] =
      service.confirmDevice(params).promise().toFuture
    @inline def confirmForgotPasswordFuture(
        params: ConfirmForgotPasswordRequest
    ): Future[ConfirmForgotPasswordResponse] = service.confirmForgotPassword(params).promise().toFuture
    @inline def confirmSignUpFuture(params: ConfirmSignUpRequest): Future[ConfirmSignUpResponse] =
      service.confirmSignUp(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise().toFuture
    @inline def createIdentityProviderFuture(
        params: CreateIdentityProviderRequest
    ): Future[CreateIdentityProviderResponse] = service.createIdentityProvider(params).promise().toFuture
    @inline def createResourceServerFuture(params: CreateResourceServerRequest): Future[CreateResourceServerResponse] =
      service.createResourceServer(params).promise().toFuture
    @inline def createUserImportJobFuture(params: CreateUserImportJobRequest): Future[CreateUserImportJobResponse] =
      service.createUserImportJob(params).promise().toFuture
    @inline def createUserPoolClientFuture(params: CreateUserPoolClientRequest): Future[CreateUserPoolClientResponse] =
      service.createUserPoolClient(params).promise().toFuture
    @inline def createUserPoolDomainFuture(params: CreateUserPoolDomainRequest): Future[CreateUserPoolDomainResponse] =
      service.createUserPoolDomain(params).promise().toFuture
    @inline def createUserPoolFuture(params: CreateUserPoolRequest): Future[CreateUserPoolResponse] =
      service.createUserPool(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[js.Object] =
      service.deleteGroup(params).promise().toFuture
    @inline def deleteIdentityProviderFuture(params: DeleteIdentityProviderRequest): Future[js.Object] =
      service.deleteIdentityProvider(params).promise().toFuture
    @inline def deleteResourceServerFuture(params: DeleteResourceServerRequest): Future[js.Object] =
      service.deleteResourceServer(params).promise().toFuture
    @inline def deleteUserAttributesFuture(params: DeleteUserAttributesRequest): Future[DeleteUserAttributesResponse] =
      service.deleteUserAttributes(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] =
      service.deleteUser(params).promise().toFuture
    @inline def deleteUserPoolClientFuture(params: DeleteUserPoolClientRequest): Future[js.Object] =
      service.deleteUserPoolClient(params).promise().toFuture
    @inline def deleteUserPoolDomainFuture(params: DeleteUserPoolDomainRequest): Future[DeleteUserPoolDomainResponse] =
      service.deleteUserPoolDomain(params).promise().toFuture
    @inline def deleteUserPoolFuture(params: DeleteUserPoolRequest): Future[js.Object] =
      service.deleteUserPool(params).promise().toFuture
    @inline def describeIdentityProviderFuture(
        params: DescribeIdentityProviderRequest
    ): Future[DescribeIdentityProviderResponse] = service.describeIdentityProvider(params).promise().toFuture
    @inline def describeResourceServerFuture(
        params: DescribeResourceServerRequest
    ): Future[DescribeResourceServerResponse] = service.describeResourceServer(params).promise().toFuture
    @inline def describeRiskConfigurationFuture(
        params: DescribeRiskConfigurationRequest
    ): Future[DescribeRiskConfigurationResponse] = service.describeRiskConfiguration(params).promise().toFuture
    @inline def describeUserImportJobFuture(
        params: DescribeUserImportJobRequest
    ): Future[DescribeUserImportJobResponse] = service.describeUserImportJob(params).promise().toFuture
    @inline def describeUserPoolClientFuture(
        params: DescribeUserPoolClientRequest
    ): Future[DescribeUserPoolClientResponse] = service.describeUserPoolClient(params).promise().toFuture
    @inline def describeUserPoolDomainFuture(
        params: DescribeUserPoolDomainRequest
    ): Future[DescribeUserPoolDomainResponse] = service.describeUserPoolDomain(params).promise().toFuture
    @inline def describeUserPoolFuture(params: DescribeUserPoolRequest): Future[DescribeUserPoolResponse] =
      service.describeUserPool(params).promise().toFuture
    @inline def forgetDeviceFuture(params: ForgetDeviceRequest): Future[js.Object] =
      service.forgetDevice(params).promise().toFuture
    @inline def forgotPasswordFuture(params: ForgotPasswordRequest): Future[ForgotPasswordResponse] =
      service.forgotPassword(params).promise().toFuture
    @inline def getCSVHeaderFuture(params: GetCSVHeaderRequest): Future[GetCSVHeaderResponse] =
      service.getCSVHeader(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] =
      service.getDevice(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] =
      service.getGroup(params).promise().toFuture
    @inline def getIdentityProviderByIdentifierFuture(
        params: GetIdentityProviderByIdentifierRequest
    ): Future[GetIdentityProviderByIdentifierResponse] =
      service.getIdentityProviderByIdentifier(params).promise().toFuture
    @inline def getSigningCertificateFuture(
        params: GetSigningCertificateRequest
    ): Future[GetSigningCertificateResponse] = service.getSigningCertificate(params).promise().toFuture
    @inline def getUICustomizationFuture(params: GetUICustomizationRequest): Future[GetUICustomizationResponse] =
      service.getUICustomization(params).promise().toFuture
    @inline def getUserAttributeVerificationCodeFuture(
        params: GetUserAttributeVerificationCodeRequest
    ): Future[GetUserAttributeVerificationCodeResponse] =
      service.getUserAttributeVerificationCode(params).promise().toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] =
      service.getUser(params).promise().toFuture
    @inline def getUserPoolMfaConfigFuture(params: GetUserPoolMfaConfigRequest): Future[GetUserPoolMfaConfigResponse] =
      service.getUserPoolMfaConfig(params).promise().toFuture
    @inline def globalSignOutFuture(params: GlobalSignOutRequest): Future[GlobalSignOutResponse] =
      service.globalSignOut(params).promise().toFuture
    @inline def initiateAuthFuture(params: InitiateAuthRequest): Future[InitiateAuthResponse] =
      service.initiateAuth(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] =
      service.listDevices(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise().toFuture
    @inline def listIdentityProvidersFuture(
        params: ListIdentityProvidersRequest
    ): Future[ListIdentityProvidersResponse] = service.listIdentityProviders(params).promise().toFuture
    @inline def listResourceServersFuture(params: ListResourceServersRequest): Future[ListResourceServersResponse] =
      service.listResourceServers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listUserImportJobsFuture(params: ListUserImportJobsRequest): Future[ListUserImportJobsResponse] =
      service.listUserImportJobs(params).promise().toFuture
    @inline def listUserPoolClientsFuture(params: ListUserPoolClientsRequest): Future[ListUserPoolClientsResponse] =
      service.listUserPoolClients(params).promise().toFuture
    @inline def listUserPoolsFuture(params: ListUserPoolsRequest): Future[ListUserPoolsResponse] =
      service.listUserPools(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def listUsersInGroupFuture(params: ListUsersInGroupRequest): Future[ListUsersInGroupResponse] =
      service.listUsersInGroup(params).promise().toFuture
    @inline def resendConfirmationCodeFuture(
        params: ResendConfirmationCodeRequest
    ): Future[ResendConfirmationCodeResponse] = service.resendConfirmationCode(params).promise().toFuture
    @inline def respondToAuthChallengeFuture(
        params: RespondToAuthChallengeRequest
    ): Future[RespondToAuthChallengeResponse] = service.respondToAuthChallenge(params).promise().toFuture
    @inline def setRiskConfigurationFuture(params: SetRiskConfigurationRequest): Future[SetRiskConfigurationResponse] =
      service.setRiskConfiguration(params).promise().toFuture
    @inline def setUICustomizationFuture(params: SetUICustomizationRequest): Future[SetUICustomizationResponse] =
      service.setUICustomization(params).promise().toFuture
    @inline def setUserMFAPreferenceFuture(params: SetUserMFAPreferenceRequest): Future[SetUserMFAPreferenceResponse] =
      service.setUserMFAPreference(params).promise().toFuture
    @inline def setUserPoolMfaConfigFuture(params: SetUserPoolMfaConfigRequest): Future[SetUserPoolMfaConfigResponse] =
      service.setUserPoolMfaConfig(params).promise().toFuture
    @inline def setUserSettingsFuture(params: SetUserSettingsRequest): Future[SetUserSettingsResponse] =
      service.setUserSettings(params).promise().toFuture
    @inline def signUpFuture(params: SignUpRequest): Future[SignUpResponse] = service.signUp(params).promise().toFuture
    @inline def startUserImportJobFuture(params: StartUserImportJobRequest): Future[StartUserImportJobResponse] =
      service.startUserImportJob(params).promise().toFuture
    @inline def stopUserImportJobFuture(params: StopUserImportJobRequest): Future[StopUserImportJobResponse] =
      service.stopUserImportJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateAuthEventFeedbackFuture(
        params: UpdateAuthEventFeedbackRequest
    ): Future[UpdateAuthEventFeedbackResponse] = service.updateAuthEventFeedback(params).promise().toFuture
    @inline def updateDeviceStatusFuture(params: UpdateDeviceStatusRequest): Future[UpdateDeviceStatusResponse] =
      service.updateDeviceStatus(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] =
      service.updateGroup(params).promise().toFuture
    @inline def updateIdentityProviderFuture(
        params: UpdateIdentityProviderRequest
    ): Future[UpdateIdentityProviderResponse] = service.updateIdentityProvider(params).promise().toFuture
    @inline def updateResourceServerFuture(params: UpdateResourceServerRequest): Future[UpdateResourceServerResponse] =
      service.updateResourceServer(params).promise().toFuture
    @inline def updateUserAttributesFuture(params: UpdateUserAttributesRequest): Future[UpdateUserAttributesResponse] =
      service.updateUserAttributes(params).promise().toFuture
    @inline def updateUserPoolClientFuture(params: UpdateUserPoolClientRequest): Future[UpdateUserPoolClientResponse] =
      service.updateUserPoolClient(params).promise().toFuture
    @inline def updateUserPoolDomainFuture(params: UpdateUserPoolDomainRequest): Future[UpdateUserPoolDomainResponse] =
      service.updateUserPoolDomain(params).promise().toFuture
    @inline def updateUserPoolFuture(params: UpdateUserPoolRequest): Future[UpdateUserPoolResponse] =
      service.updateUserPool(params).promise().toFuture
    @inline def verifySoftwareTokenFuture(params: VerifySoftwareTokenRequest): Future[VerifySoftwareTokenResponse] =
      service.verifySoftwareToken(params).promise().toFuture
    @inline def verifyUserAttributeFuture(params: VerifyUserAttributeRequest): Future[VerifyUserAttributeResponse] =
      service.verifyUserAttribute(params).promise().toFuture
  }
}

package cognitoidentityprovider {
  @js.native
  @JSImport("aws-sdk", "CognitoIdentityServiceProvider")
  class CognitoIdentityProvider() extends js.Object {
    def this(config: AWSConfig) = this()

    def addCustomAttributes(params: AddCustomAttributesRequest): Request[AddCustomAttributesResponse] = js.native
    def adminAddUserToGroup(params: AdminAddUserToGroupRequest): Request[js.Object]                   = js.native
    def adminConfirmSignUp(params: AdminConfirmSignUpRequest): Request[AdminConfirmSignUpResponse]    = js.native
    def adminCreateUser(params: AdminCreateUserRequest): Request[AdminCreateUserResponse]             = js.native
    def adminDeleteUser(params: AdminDeleteUserRequest): Request[js.Object]                           = js.native
    def adminDeleteUserAttributes(
        params: AdminDeleteUserAttributesRequest
    ): Request[AdminDeleteUserAttributesResponse] = js.native
    def adminDisableProviderForUser(
        params: AdminDisableProviderForUserRequest
    ): Request[AdminDisableProviderForUserResponse]                                             = js.native
    def adminDisableUser(params: AdminDisableUserRequest): Request[AdminDisableUserResponse]    = js.native
    def adminEnableUser(params: AdminEnableUserRequest): Request[AdminEnableUserResponse]       = js.native
    def adminForgetDevice(params: AdminForgetDeviceRequest): Request[js.Object]                 = js.native
    def adminGetDevice(params: AdminGetDeviceRequest): Request[AdminGetDeviceResponse]          = js.native
    def adminGetUser(params: AdminGetUserRequest): Request[AdminGetUserResponse]                = js.native
    def adminInitiateAuth(params: AdminInitiateAuthRequest): Request[AdminInitiateAuthResponse] = js.native
    def adminLinkProviderForUser(params: AdminLinkProviderForUserRequest): Request[AdminLinkProviderForUserResponse] =
      js.native
    def adminListDevices(params: AdminListDevicesRequest): Request[AdminListDevicesResponse] = js.native
    def adminListGroupsForUser(params: AdminListGroupsForUserRequest): Request[AdminListGroupsForUserResponse] =
      js.native
    def adminListUserAuthEvents(params: AdminListUserAuthEventsRequest): Request[AdminListUserAuthEventsResponse] =
      js.native
    def adminRemoveUserFromGroup(params: AdminRemoveUserFromGroupRequest): Request[js.Object] = js.native
    def adminResetUserPassword(params: AdminResetUserPasswordRequest): Request[AdminResetUserPasswordResponse] =
      js.native
    def adminRespondToAuthChallenge(
        params: AdminRespondToAuthChallengeRequest
    ): Request[AdminRespondToAuthChallengeResponse] = js.native
    def adminSetUserMFAPreference(
        params: AdminSetUserMFAPreferenceRequest
    ): Request[AdminSetUserMFAPreferenceResponse]                                                        = js.native
    def adminSetUserPassword(params: AdminSetUserPasswordRequest): Request[AdminSetUserPasswordResponse] = js.native
    def adminSetUserSettings(params: AdminSetUserSettingsRequest): Request[AdminSetUserSettingsResponse] = js.native
    def adminUpdateAuthEventFeedback(
        params: AdminUpdateAuthEventFeedbackRequest
    ): Request[AdminUpdateAuthEventFeedbackResponse] = js.native
    def adminUpdateDeviceStatus(params: AdminUpdateDeviceStatusRequest): Request[AdminUpdateDeviceStatusResponse] =
      js.native
    def adminUpdateUserAttributes(
        params: AdminUpdateUserAttributesRequest
    ): Request[AdminUpdateUserAttributesResponse] = js.native
    def adminUserGlobalSignOut(params: AdminUserGlobalSignOutRequest): Request[AdminUserGlobalSignOutResponse] =
      js.native
    def associateSoftwareToken(params: AssociateSoftwareTokenRequest): Request[AssociateSoftwareTokenResponse] =
      js.native
    def changePassword(params: ChangePasswordRequest): Request[ChangePasswordResponse]                      = js.native
    def confirmDevice(params: ConfirmDeviceRequest): Request[ConfirmDeviceResponse]                         = js.native
    def confirmForgotPassword(params: ConfirmForgotPasswordRequest): Request[ConfirmForgotPasswordResponse] = js.native
    def confirmSignUp(params: ConfirmSignUpRequest): Request[ConfirmSignUpResponse]                         = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse]                               = js.native
    def createIdentityProvider(params: CreateIdentityProviderRequest): Request[CreateIdentityProviderResponse] =
      js.native
    def createResourceServer(params: CreateResourceServerRequest): Request[CreateResourceServerResponse] = js.native
    def createUserImportJob(params: CreateUserImportJobRequest): Request[CreateUserImportJobResponse]    = js.native
    def createUserPool(params: CreateUserPoolRequest): Request[CreateUserPoolResponse]                   = js.native
    def createUserPoolClient(params: CreateUserPoolClientRequest): Request[CreateUserPoolClientResponse] = js.native
    def createUserPoolDomain(params: CreateUserPoolDomainRequest): Request[CreateUserPoolDomainResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[js.Object]                                      = js.native
    def deleteIdentityProvider(params: DeleteIdentityProviderRequest): Request[js.Object]                = js.native
    def deleteResourceServer(params: DeleteResourceServerRequest): Request[js.Object]                    = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                                        = js.native
    def deleteUserAttributes(params: DeleteUserAttributesRequest): Request[DeleteUserAttributesResponse] = js.native
    def deleteUserPool(params: DeleteUserPoolRequest): Request[js.Object]                                = js.native
    def deleteUserPoolClient(params: DeleteUserPoolClientRequest): Request[js.Object]                    = js.native
    def deleteUserPoolDomain(params: DeleteUserPoolDomainRequest): Request[DeleteUserPoolDomainResponse] = js.native
    def describeIdentityProvider(params: DescribeIdentityProviderRequest): Request[DescribeIdentityProviderResponse] =
      js.native
    def describeResourceServer(params: DescribeResourceServerRequest): Request[DescribeResourceServerResponse] =
      js.native
    def describeRiskConfiguration(
        params: DescribeRiskConfigurationRequest
    ): Request[DescribeRiskConfigurationResponse]                                                           = js.native
    def describeUserImportJob(params: DescribeUserImportJobRequest): Request[DescribeUserImportJobResponse] = js.native
    def describeUserPool(params: DescribeUserPoolRequest): Request[DescribeUserPoolResponse]                = js.native
    def describeUserPoolClient(params: DescribeUserPoolClientRequest): Request[DescribeUserPoolClientResponse] =
      js.native
    def describeUserPoolDomain(params: DescribeUserPoolDomainRequest): Request[DescribeUserPoolDomainResponse] =
      js.native
    def forgetDevice(params: ForgetDeviceRequest): Request[js.Object]                  = js.native
    def forgotPassword(params: ForgotPasswordRequest): Request[ForgotPasswordResponse] = js.native
    def getCSVHeader(params: GetCSVHeaderRequest): Request[GetCSVHeaderResponse]       = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse]                = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse]                   = js.native
    def getIdentityProviderByIdentifier(
        params: GetIdentityProviderByIdentifierRequest
    ): Request[GetIdentityProviderByIdentifierResponse]                                                     = js.native
    def getSigningCertificate(params: GetSigningCertificateRequest): Request[GetSigningCertificateResponse] = js.native
    def getUICustomization(params: GetUICustomizationRequest): Request[GetUICustomizationResponse]          = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse]                                           = js.native
    def getUserAttributeVerificationCode(
        params: GetUserAttributeVerificationCodeRequest
    ): Request[GetUserAttributeVerificationCodeResponse]                                                    = js.native
    def getUserPoolMfaConfig(params: GetUserPoolMfaConfigRequest): Request[GetUserPoolMfaConfigResponse]    = js.native
    def globalSignOut(params: GlobalSignOutRequest): Request[GlobalSignOutResponse]                         = js.native
    def initiateAuth(params: InitiateAuthRequest): Request[InitiateAuthResponse]                            = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse]                               = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                                  = js.native
    def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse] = js.native
    def listResourceServers(params: ListResourceServersRequest): Request[ListResourceServersResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listUserImportJobs(params: ListUserImportJobsRequest): Request[ListUserImportJobsResponse]          = js.native
    def listUserPoolClients(params: ListUserPoolClientsRequest): Request[ListUserPoolClientsResponse]       = js.native
    def listUserPools(params: ListUserPoolsRequest): Request[ListUserPoolsResponse]                         = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def listUsersInGroup(params: ListUsersInGroupRequest): Request[ListUsersInGroupResponse]                = js.native
    def resendConfirmationCode(params: ResendConfirmationCodeRequest): Request[ResendConfirmationCodeResponse] =
      js.native
    def respondToAuthChallenge(params: RespondToAuthChallengeRequest): Request[RespondToAuthChallengeResponse] =
      js.native
    def setRiskConfiguration(params: SetRiskConfigurationRequest): Request[SetRiskConfigurationResponse] = js.native
    def setUICustomization(params: SetUICustomizationRequest): Request[SetUICustomizationResponse]       = js.native
    def setUserMFAPreference(params: SetUserMFAPreferenceRequest): Request[SetUserMFAPreferenceResponse] = js.native
    def setUserPoolMfaConfig(params: SetUserPoolMfaConfigRequest): Request[SetUserPoolMfaConfigResponse] = js.native
    def setUserSettings(params: SetUserSettingsRequest): Request[SetUserSettingsResponse]                = js.native
    def signUp(params: SignUpRequest): Request[SignUpResponse]                                           = js.native
    def startUserImportJob(params: StartUserImportJobRequest): Request[StartUserImportJobResponse]       = js.native
    def stopUserImportJob(params: StopUserImportJobRequest): Request[StopUserImportJobResponse]          = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateAuthEventFeedback(params: UpdateAuthEventFeedbackRequest): Request[UpdateAuthEventFeedbackResponse] =
      js.native
    def updateDeviceStatus(params: UpdateDeviceStatusRequest): Request[UpdateDeviceStatusResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse]                      = js.native
    def updateIdentityProvider(params: UpdateIdentityProviderRequest): Request[UpdateIdentityProviderResponse] =
      js.native
    def updateResourceServer(params: UpdateResourceServerRequest): Request[UpdateResourceServerResponse] = js.native
    def updateUserAttributes(params: UpdateUserAttributesRequest): Request[UpdateUserAttributesResponse] = js.native
    def updateUserPool(params: UpdateUserPoolRequest): Request[UpdateUserPoolResponse]                   = js.native
    def updateUserPoolClient(params: UpdateUserPoolClientRequest): Request[UpdateUserPoolClientResponse] = js.native
    def updateUserPoolDomain(params: UpdateUserPoolDomainRequest): Request[UpdateUserPoolDomainResponse] = js.native
    def verifySoftwareToken(params: VerifySoftwareTokenRequest): Request[VerifySoftwareTokenResponse]    = js.native
    def verifyUserAttribute(params: VerifyUserAttributeRequest): Request[VerifyUserAttributeResponse]    = js.native
  }

  /**
    * The data type for <code>AccountRecoverySetting</code>.
    */
  @js.native
  @Factory
  trait AccountRecoverySettingType extends js.Object {
    var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType]
  }

  /**
    * Account takeover action type.
    */
  @js.native
  @Factory
  trait AccountTakeoverActionType extends js.Object {
    var EventAction: AccountTakeoverEventActionType
    var Notify: AccountTakeoverActionNotifyType
  }

  /**
    * Account takeover actions type.
    */
  @js.native
  @Factory
  trait AccountTakeoverActionsType extends js.Object {
    var HighAction: js.UndefOr[AccountTakeoverActionType]
    var LowAction: js.UndefOr[AccountTakeoverActionType]
    var MediumAction: js.UndefOr[AccountTakeoverActionType]
  }

  @js.native
  sealed trait AccountTakeoverEventActionType extends js.Any
  object AccountTakeoverEventActionType extends js.Object {
    val BLOCK             = "BLOCK".asInstanceOf[AccountTakeoverEventActionType]
    val MFA_IF_CONFIGURED = "MFA_IF_CONFIGURED".asInstanceOf[AccountTakeoverEventActionType]
    val MFA_REQUIRED      = "MFA_REQUIRED".asInstanceOf[AccountTakeoverEventActionType]
    val NO_ACTION         = "NO_ACTION".asInstanceOf[AccountTakeoverEventActionType]

    val values = js.Object.freeze(js.Array(BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION))
  }

  /**
    * Configuration for mitigation actions and notification for different levels of risk detected for a potential account takeover.
    */
  @js.native
  @Factory
  trait AccountTakeoverRiskConfigurationType extends js.Object {
    var Actions: AccountTakeoverActionsType
    var NotifyConfiguration: js.UndefOr[NotifyConfigurationType]
  }

  /**
    * Represents the request to add custom attributes.
    */
  @js.native
  @Factory
  trait AddCustomAttributesRequest extends js.Object {
    var CustomAttributes: CustomAttributesListType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server for the request to add custom attributes.
    */
  @js.native
  @Factory
  trait AddCustomAttributesResponse extends js.Object {}

  @js.native
  @Factory
  trait AdminAddUserToGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the request to confirm user registration.
    */
  @js.native
  @Factory
  trait AdminConfirmSignUpRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  /**
    * Represents the response from the server for the request to confirm registration.
    */
  @js.native
  @Factory
  trait AdminConfirmSignUpResponse extends js.Object {}

  /**
    * The configuration for creating a new user profile.
    */
  @js.native
  @Factory
  trait AdminCreateUserConfigType extends js.Object {
    var AllowAdminCreateUserOnly: js.UndefOr[BooleanType]
    var InviteMessageTemplate: js.UndefOr[MessageTemplateType]
    var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType]
  }

  /**
    * Represents the request to create a user in the specified user pool.
    */
  @js.native
  @Factory
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

  /**
    * Represents the response from the server to the request to create the user.
    */
  @js.native
  @Factory
  trait AdminCreateUserResponse extends js.Object {
    var User: js.UndefOr[UserType]
  }

  /**
    * Represents the request to delete user attributes as an administrator.
    */
  @js.native
  @Factory
  trait AdminDeleteUserAttributesRequest extends js.Object {
    var UserAttributeNames: AttributeNameListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the response received from the server for a request to delete user attributes.
    */
  @js.native
  @Factory
  trait AdminDeleteUserAttributesResponse extends js.Object {}

  /**
    * Represents the request to delete a user as an administrator.
    */
  @js.native
  @Factory
  trait AdminDeleteUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  @js.native
  @Factory
  trait AdminDisableProviderForUserRequest extends js.Object {
    var User: ProviderUserIdentifierType
    var UserPoolId: StringType
  }

  @js.native
  @Factory
  trait AdminDisableProviderForUserResponse extends js.Object {}

  /**
    * Represents the request to disable any user as an administrator.
    */
  @js.native
  @Factory
  trait AdminDisableUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the response received from the server to disable the user as an administrator.
    */
  @js.native
  @Factory
  trait AdminDisableUserResponse extends js.Object {}

  /**
    * Represents the request that enables the user as an administrator.
    */
  @js.native
  @Factory
  trait AdminEnableUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the response from the server for the request to enable a user as an administrator.
    */
  @js.native
  @Factory
  trait AdminEnableUserResponse extends js.Object {}

  /**
    * Sends the forgot device request, as an administrator.
    */
  @js.native
  @Factory
  trait AdminForgetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the request to get the device, as an administrator.
    */
  @js.native
  @Factory
  trait AdminGetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Gets the device response, as an administrator.
    */
  @js.native
  @Factory
  trait AdminGetDeviceResponse extends js.Object {
    var Device: DeviceType
  }

  /**
    * Represents the request to get the specified user as an administrator.
    */
  @js.native
  @Factory
  trait AdminGetUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the response from the server from the request to get the specified user as an administrator.
    */
  @js.native
  @Factory
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

  /**
    * Initiates the authorization request, as an administrator.
    */
  @js.native
  @Factory
  trait AdminInitiateAuthRequest extends js.Object {
    var AuthFlow: AuthFlowType
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var AuthParameters: js.UndefOr[AuthParametersType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var ContextData: js.UndefOr[ContextDataType]
  }

  /**
    * Initiates the authentication response, as an administrator.
    */
  @js.native
  @Factory
  trait AdminInitiateAuthResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  @js.native
  @Factory
  trait AdminLinkProviderForUserRequest extends js.Object {
    var DestinationUser: ProviderUserIdentifierType
    var SourceUser: ProviderUserIdentifierType
    var UserPoolId: StringType
  }

  @js.native
  @Factory
  trait AdminLinkProviderForUserResponse extends js.Object {}

  /**
    * Represents the request to list devices, as an administrator.
    */
  @js.native
  @Factory
  trait AdminListDevicesRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  /**
    * Lists the device's response, as an administrator.
    */
  @js.native
  @Factory
  trait AdminListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  @js.native
  @Factory
  trait AdminListGroupsForUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait AdminListGroupsForUserResponse extends js.Object {
    var Groups: js.UndefOr[GroupListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait AdminListUserAuthEventsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var MaxResults: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait AdminListUserAuthEventsResponse extends js.Object {
    var AuthEvents: js.UndefOr[AuthEventsType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait AdminRemoveUserFromGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the request to reset a user's password as an administrator.
    */
  @js.native
  @Factory
  trait AdminResetUserPasswordRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  /**
    * Represents the response from the server to reset a user password as an administrator.
    */
  @js.native
  @Factory
  trait AdminResetUserPasswordResponse extends js.Object {}

  /**
    * The request to respond to the authentication challenge, as an administrator.
    */
  @js.native
  @Factory
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

  /**
    * Responds to the authentication challenge, as an administrator.
    */
  @js.native
  @Factory
  trait AdminRespondToAuthChallengeResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  @js.native
  @Factory
  trait AdminSetUserMFAPreferenceRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
  }

  @js.native
  @Factory
  trait AdminSetUserMFAPreferenceResponse extends js.Object {}

  @js.native
  @Factory
  trait AdminSetUserPasswordRequest extends js.Object {
    var Password: PasswordType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Permanent: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait AdminSetUserPasswordResponse extends js.Object {}

  /**
    * You can use this parameter to set an MFA configuration that uses the SMS delivery medium.
    */
  @js.native
  @Factory
  trait AdminSetUserSettingsRequest extends js.Object {
    var MFAOptions: MFAOptionListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * Represents the response from the server to set user settings as an administrator.
    */
  @js.native
  @Factory
  trait AdminSetUserSettingsResponse extends js.Object {}

  @js.native
  @Factory
  trait AdminUpdateAuthEventFeedbackRequest extends js.Object {
    var EventId: EventIdType
    var FeedbackValue: FeedbackValueType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  @js.native
  @Factory
  trait AdminUpdateAuthEventFeedbackResponse extends js.Object {}

  /**
    * The request to update the device status, as an administrator.
    */
  @js.native
  @Factory
  trait AdminUpdateDeviceStatusRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  /**
    * The status response from the request to update the device, as an administrator.
    */
  @js.native
  @Factory
  trait AdminUpdateDeviceStatusResponse extends js.Object {}

  /**
    * Represents the request to update the user's attributes as an administrator.
    */
  @js.native
  @Factory
  trait AdminUpdateUserAttributesRequest extends js.Object {
    var UserAttributes: AttributeListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  /**
    * Represents the response from the server for the request to update user attributes as an administrator.
    */
  @js.native
  @Factory
  trait AdminUpdateUserAttributesResponse extends js.Object {}

  /**
    * The request to sign out of all devices, as an administrator.
    */
  @js.native
  @Factory
  trait AdminUserGlobalSignOutRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  /**
    * The global sign-out response, as an administrator.
    */
  @js.native
  @Factory
  trait AdminUserGlobalSignOutResponse extends js.Object {}

  @js.native
  sealed trait AdvancedSecurityModeType extends js.Any
  object AdvancedSecurityModeType extends js.Object {
    val OFF      = "OFF".asInstanceOf[AdvancedSecurityModeType]
    val AUDIT    = "AUDIT".asInstanceOf[AdvancedSecurityModeType]
    val ENFORCED = "ENFORCED".asInstanceOf[AdvancedSecurityModeType]

    val values = js.Object.freeze(js.Array(OFF, AUDIT, ENFORCED))
  }

  @js.native
  sealed trait AliasAttributeType extends js.Any
  object AliasAttributeType extends js.Object {
    val phone_number       = "phone_number".asInstanceOf[AliasAttributeType]
    val email              = "email".asInstanceOf[AliasAttributeType]
    val preferred_username = "preferred_username".asInstanceOf[AliasAttributeType]

    val values = js.Object.freeze(js.Array(phone_number, email, preferred_username))
  }

  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for a user pool.
    */
  @js.native
  @Factory
  trait AnalyticsConfigurationType extends js.Object {
    var ApplicationId: HexStringType
    var ExternalId: StringType
    var RoleArn: ArnType
    var UserDataShared: js.UndefOr[BooleanType]
  }

  /**
    * An Amazon Pinpoint analytics endpoint.
    *  An endpoint uniquely identifies a mobile device, email address, or phone number that can receive messages from Amazon Pinpoint analytics.
    */
  @js.native
  @Factory
  trait AnalyticsMetadataType extends js.Object {
    var AnalyticsEndpointId: js.UndefOr[StringType]
  }

  @js.native
  @Factory
  trait AssociateSoftwareTokenRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var Session: js.UndefOr[SessionType]
  }

  @js.native
  @Factory
  trait AssociateSoftwareTokenResponse extends js.Object {
    var SecretCode: js.UndefOr[SecretCodeType]
    var Session: js.UndefOr[SessionType]
  }

  @js.native
  sealed trait AttributeDataType extends js.Any
  object AttributeDataType extends js.Object {
    val String   = "String".asInstanceOf[AttributeDataType]
    val Number   = "Number".asInstanceOf[AttributeDataType]
    val DateTime = "DateTime".asInstanceOf[AttributeDataType]
    val Boolean  = "Boolean".asInstanceOf[AttributeDataType]

    val values = js.Object.freeze(js.Array(String, Number, DateTime, Boolean))
  }

  /**
    * Specifies whether the attribute is standard or custom.
    */
  @js.native
  @Factory
  trait AttributeType extends js.Object {
    var Name: AttributeNameType
    var Value: js.UndefOr[AttributeValueType]
  }

  /**
    * The authentication event type.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait AuthFlowType extends js.Any
  object AuthFlowType extends js.Object {
    val USER_SRP_AUTH            = "USER_SRP_AUTH".asInstanceOf[AuthFlowType]
    val REFRESH_TOKEN_AUTH       = "REFRESH_TOKEN_AUTH".asInstanceOf[AuthFlowType]
    val REFRESH_TOKEN            = "REFRESH_TOKEN".asInstanceOf[AuthFlowType]
    val CUSTOM_AUTH              = "CUSTOM_AUTH".asInstanceOf[AuthFlowType]
    val ADMIN_NO_SRP_AUTH        = "ADMIN_NO_SRP_AUTH".asInstanceOf[AuthFlowType]
    val USER_PASSWORD_AUTH       = "USER_PASSWORD_AUTH".asInstanceOf[AuthFlowType]
    val ADMIN_USER_PASSWORD_AUTH = "ADMIN_USER_PASSWORD_AUTH".asInstanceOf[AuthFlowType]

    val values = js.Object.freeze(
      js.Array(
        USER_SRP_AUTH,
        REFRESH_TOKEN_AUTH,
        REFRESH_TOKEN,
        CUSTOM_AUTH,
        ADMIN_NO_SRP_AUTH,
        USER_PASSWORD_AUTH,
        ADMIN_USER_PASSWORD_AUTH
      )
    )
  }

  /**
    * The authentication result.
    */
  @js.native
  @Factory
  trait AuthenticationResultType extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var ExpiresIn: js.UndefOr[IntegerType]
    var IdToken: js.UndefOr[TokenModelType]
    var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType]
    var RefreshToken: js.UndefOr[TokenModelType]
    var TokenType: js.UndefOr[StringType]
  }

  @js.native
  sealed trait ChallengeName extends js.Any
  object ChallengeName extends js.Object {
    val Password = "Password".asInstanceOf[ChallengeName]
    val Mfa      = "Mfa".asInstanceOf[ChallengeName]

    val values = js.Object.freeze(js.Array(Password, Mfa))
  }

  @js.native
  sealed trait ChallengeNameType extends js.Any
  object ChallengeNameType extends js.Object {
    val SMS_MFA                  = "SMS_MFA".asInstanceOf[ChallengeNameType]
    val SOFTWARE_TOKEN_MFA       = "SOFTWARE_TOKEN_MFA".asInstanceOf[ChallengeNameType]
    val SELECT_MFA_TYPE          = "SELECT_MFA_TYPE".asInstanceOf[ChallengeNameType]
    val MFA_SETUP                = "MFA_SETUP".asInstanceOf[ChallengeNameType]
    val PASSWORD_VERIFIER        = "PASSWORD_VERIFIER".asInstanceOf[ChallengeNameType]
    val CUSTOM_CHALLENGE         = "CUSTOM_CHALLENGE".asInstanceOf[ChallengeNameType]
    val DEVICE_SRP_AUTH          = "DEVICE_SRP_AUTH".asInstanceOf[ChallengeNameType]
    val DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[ChallengeNameType]
    val ADMIN_NO_SRP_AUTH        = "ADMIN_NO_SRP_AUTH".asInstanceOf[ChallengeNameType]
    val NEW_PASSWORD_REQUIRED    = "NEW_PASSWORD_REQUIRED".asInstanceOf[ChallengeNameType]

    val values = js.Object.freeze(
      js.Array(
        SMS_MFA,
        SOFTWARE_TOKEN_MFA,
        SELECT_MFA_TYPE,
        MFA_SETUP,
        PASSWORD_VERIFIER,
        CUSTOM_CHALLENGE,
        DEVICE_SRP_AUTH,
        DEVICE_PASSWORD_VERIFIER,
        ADMIN_NO_SRP_AUTH,
        NEW_PASSWORD_REQUIRED
      )
    )
  }

  @js.native
  sealed trait ChallengeResponse extends js.Any
  object ChallengeResponse extends js.Object {
    val Success = "Success".asInstanceOf[ChallengeResponse]
    val Failure = "Failure".asInstanceOf[ChallengeResponse]

    val values = js.Object.freeze(js.Array(Success, Failure))
  }

  /**
    * The challenge response type.
    */
  @js.native
  @Factory
  trait ChallengeResponseType extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeName]
    var ChallengeResponse: js.UndefOr[ChallengeResponse]
  }

  /**
    * Represents the request to change a user password.
    */
  @js.native
  @Factory
  trait ChangePasswordRequest extends js.Object {
    var AccessToken: TokenModelType
    var PreviousPassword: PasswordType
    var ProposedPassword: PasswordType
  }

  /**
    * The response from the server to the change password request.
    */
  @js.native
  @Factory
  trait ChangePasswordResponse extends js.Object {}

  /**
    * The code delivery details being returned from the server.
    */
  @js.native
  @Factory
  trait CodeDeliveryDetailsType extends js.Object {
    var AttributeName: js.UndefOr[AttributeNameType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
    var Destination: js.UndefOr[StringType]
  }

  /**
    * The compromised credentials actions type
    */
  @js.native
  @Factory
  trait CompromisedCredentialsActionsType extends js.Object {
    var EventAction: CompromisedCredentialsEventActionType
  }

  @js.native
  sealed trait CompromisedCredentialsEventActionType extends js.Any
  object CompromisedCredentialsEventActionType extends js.Object {
    val BLOCK     = "BLOCK".asInstanceOf[CompromisedCredentialsEventActionType]
    val NO_ACTION = "NO_ACTION".asInstanceOf[CompromisedCredentialsEventActionType]

    val values = js.Object.freeze(js.Array(BLOCK, NO_ACTION))
  }

  /**
    * The compromised credentials risk configuration type.
    */
  @js.native
  @Factory
  trait CompromisedCredentialsRiskConfigurationType extends js.Object {
    var Actions: CompromisedCredentialsActionsType
    var EventFilter: js.UndefOr[EventFiltersType]
  }

  /**
    * Confirms the device request.
    */
  @js.native
  @Factory
  trait ConfirmDeviceRequest extends js.Object {
    var AccessToken: TokenModelType
    var DeviceKey: DeviceKeyType
    var DeviceName: js.UndefOr[DeviceNameType]
    var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType]
  }

  /**
    * Confirms the device response.
    */
  @js.native
  @Factory
  trait ConfirmDeviceResponse extends js.Object {
    var UserConfirmationNecessary: js.UndefOr[BooleanType]
  }

  /**
    * The request representing the confirmation for a password reset.
    */
  @js.native
  @Factory
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

  /**
    * The response from the server that results from a user's request to retrieve a forgotten password.
    */
  @js.native
  @Factory
  trait ConfirmForgotPasswordResponse extends js.Object {}

  /**
    * Represents the request to confirm registration of a user.
    */
  @js.native
  @Factory
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

  /**
    * Represents the response from the server for the registration confirmation.
    */
  @js.native
  @Factory
  trait ConfirmSignUpResponse extends js.Object {}

  /**
    * Contextual user data type used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  @js.native
  @Factory
  trait ContextDataType extends js.Object {
    var HttpHeaders: HttpHeaderList
    var IpAddress: StringType
    var ServerName: StringType
    var ServerPath: StringType
    var EncodedData: js.UndefOr[StringType]
  }

  @js.native
  @Factory
  trait CreateGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Description: js.UndefOr[DescriptionType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  @js.native
  @Factory
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  @js.native
  @Factory
  trait CreateIdentityProviderRequest extends js.Object {
    var ProviderDetails: ProviderDetailsType
    var ProviderName: ProviderNameTypeV1
    var ProviderType: IdentityProviderTypeType
    var UserPoolId: UserPoolIdType
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
  }

  @js.native
  @Factory
  trait CreateIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  @js.native
  @Factory
  trait CreateResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var Name: ResourceServerNameType
    var UserPoolId: UserPoolIdType
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  @js.native
  @Factory
  trait CreateResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  /**
    * Represents the request to create the user import job.
    */
  @js.native
  @Factory
  trait CreateUserImportJobRequest extends js.Object {
    var CloudWatchLogsRoleArn: ArnType
    var JobName: UserImportJobNameType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server to the request to create the user import job.
    */
  @js.native
  @Factory
  trait CreateUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  /**
    * Represents the request to create a user pool client.
    */
  @js.native
  @Factory
  trait CreateUserPoolClientRequest extends js.Object {
    var ClientName: ClientNameType
    var UserPoolId: UserPoolIdType
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var GenerateSecret: js.UndefOr[GenerateSecret]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
    var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  /**
    * Represents the response from the server to create a user pool client.
    */
  @js.native
  @Factory
  trait CreateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  @js.native
  @Factory
  trait CreateUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType]
  }

  @js.native
  @Factory
  trait CreateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  /**
    * Represents the request to create a user pool.
    */
  @js.native
  @Factory
  trait CreateUserPoolRequest extends js.Object {
    var PoolName: UserPoolNameType
    var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var AliasAttributes: js.UndefOr[AliasAttributesListType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
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
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType]
    var UsernameConfiguration: js.UndefOr[UsernameConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  /**
    * Represents the response from the server for the request to create a user pool.
    */
  @js.native
  @Factory
  trait CreateUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  @js.native
  @Factory
  trait CustomDomainConfigType extends js.Object {
    var CertificateArn: ArnType
  }

  @js.native
  sealed trait DefaultEmailOptionType extends js.Any
  object DefaultEmailOptionType extends js.Object {
    val CONFIRM_WITH_LINK = "CONFIRM_WITH_LINK".asInstanceOf[DefaultEmailOptionType]
    val CONFIRM_WITH_CODE = "CONFIRM_WITH_CODE".asInstanceOf[DefaultEmailOptionType]

    val values = js.Object.freeze(js.Array(CONFIRM_WITH_LINK, CONFIRM_WITH_CODE))
  }

  @js.native
  @Factory
  trait DeleteGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait DeleteIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait DeleteResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the request to delete user attributes.
    */
  @js.native
  @Factory
  trait DeleteUserAttributesRequest extends js.Object {
    var AccessToken: TokenModelType
    var UserAttributeNames: AttributeNameListType
  }

  /**
    * Represents the response from the server to delete user attributes.
    */
  @js.native
  @Factory
  trait DeleteUserAttributesResponse extends js.Object {}

  /**
    * Represents the request to delete a user pool client.
    */
  @js.native
  @Factory
  trait DeleteUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait DeleteUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait DeleteUserPoolDomainResponse extends js.Object {}

  /**
    * Represents the request to delete a user pool.
    */
  @js.native
  @Factory
  trait DeleteUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the request to delete a user.
    */
  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  @js.native
  sealed trait DeliveryMediumType extends js.Any
  object DeliveryMediumType extends js.Object {
    val SMS   = "SMS".asInstanceOf[DeliveryMediumType]
    val EMAIL = "EMAIL".asInstanceOf[DeliveryMediumType]

    val values = js.Object.freeze(js.Array(SMS, EMAIL))
  }

  @js.native
  @Factory
  trait DescribeIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait DescribeIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  @js.native
  @Factory
  trait DescribeResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait DescribeResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  @js.native
  @Factory
  trait DescribeRiskConfigurationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var ClientId: js.UndefOr[ClientIdType]
  }

  @js.native
  @Factory
  trait DescribeRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: RiskConfigurationType
  }

  /**
    * Represents the request to describe the user import job.
    */
  @js.native
  @Factory
  trait DescribeUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server to the request to describe the user import job.
    */
  @js.native
  @Factory
  trait DescribeUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  /**
    * Represents the request to describe a user pool client.
    */
  @js.native
  @Factory
  trait DescribeUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server from a request to describe the user pool client.
    */
  @js.native
  @Factory
  trait DescribeUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  @js.native
  @Factory
  trait DescribeUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
  }

  @js.native
  @Factory
  trait DescribeUserPoolDomainResponse extends js.Object {
    var DomainDescription: js.UndefOr[DomainDescriptionType]
  }

  /**
    * Represents the request to describe the user pool.
    */
  @js.native
  @Factory
  trait DescribeUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response to describe the user pool.
    */
  @js.native
  @Factory
  trait DescribeUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  /**
    * The configuration for the user pool's device tracking.
    */
  @js.native
  @Factory
  trait DeviceConfigurationType extends js.Object {
    var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType]
    var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType]
  }

  @js.native
  sealed trait DeviceRememberedStatusType extends js.Any
  object DeviceRememberedStatusType extends js.Object {
    val remembered     = "remembered".asInstanceOf[DeviceRememberedStatusType]
    val not_remembered = "not_remembered".asInstanceOf[DeviceRememberedStatusType]

    val values = js.Object.freeze(js.Array(remembered, not_remembered))
  }

  /**
    * The device verifier against which it will be authenticated.
    */
  @js.native
  @Factory
  trait DeviceSecretVerifierConfigType extends js.Object {
    var PasswordVerifier: js.UndefOr[StringType]
    var Salt: js.UndefOr[StringType]
  }

  /**
    * The device type.
    */
  @js.native
  @Factory
  trait DeviceType extends js.Object {
    var DeviceAttributes: js.UndefOr[AttributeListType]
    var DeviceCreateDate: js.UndefOr[DateType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var DeviceLastAuthenticatedDate: js.UndefOr[DateType]
    var DeviceLastModifiedDate: js.UndefOr[DateType]
  }

  /**
    * A container for information about a domain.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DomainStatusType extends js.Any
  object DomainStatusType extends js.Object {
    val CREATING = "CREATING".asInstanceOf[DomainStatusType]
    val DELETING = "DELETING".asInstanceOf[DomainStatusType]
    val UPDATING = "UPDATING".asInstanceOf[DomainStatusType]
    val ACTIVE   = "ACTIVE".asInstanceOf[DomainStatusType]
    val FAILED   = "FAILED".asInstanceOf[DomainStatusType]

    val values = js.Object.freeze(js.Array(CREATING, DELETING, UPDATING, ACTIVE, FAILED))
  }

  /**
    * The email configuration type.
    */
  @js.native
  @Factory
  trait EmailConfigurationType extends js.Object {
    var ConfigurationSet: js.UndefOr[SESConfigurationSet]
    var EmailSendingAccount: js.UndefOr[EmailSendingAccountType]
    var From: js.UndefOr[StringType]
    var ReplyToEmailAddress: js.UndefOr[EmailAddressType]
    var SourceArn: js.UndefOr[ArnType]
  }

  @js.native
  sealed trait EmailSendingAccountType extends js.Any
  object EmailSendingAccountType extends js.Object {
    val COGNITO_DEFAULT = "COGNITO_DEFAULT".asInstanceOf[EmailSendingAccountType]
    val DEVELOPER       = "DEVELOPER".asInstanceOf[EmailSendingAccountType]

    val values = js.Object.freeze(js.Array(COGNITO_DEFAULT, DEVELOPER))
  }

  /**
    * Specifies the user context data captured at the time of an event request.
    */
  @js.native
  @Factory
  trait EventContextDataType extends js.Object {
    var City: js.UndefOr[StringType]
    var Country: js.UndefOr[StringType]
    var DeviceName: js.UndefOr[StringType]
    var IpAddress: js.UndefOr[StringType]
    var Timezone: js.UndefOr[StringType]
  }

  /**
    * Specifies the event feedback type.
    */
  @js.native
  @Factory
  trait EventFeedbackType extends js.Object {
    var FeedbackValue: FeedbackValueType
    var Provider: StringType
    var FeedbackDate: js.UndefOr[DateType]
  }

  @js.native
  sealed trait EventFilterType extends js.Any
  object EventFilterType extends js.Object {
    val SIGN_IN         = "SIGN_IN".asInstanceOf[EventFilterType]
    val PASSWORD_CHANGE = "PASSWORD_CHANGE".asInstanceOf[EventFilterType]
    val SIGN_UP         = "SIGN_UP".asInstanceOf[EventFilterType]

    val values = js.Object.freeze(js.Array(SIGN_IN, PASSWORD_CHANGE, SIGN_UP))
  }

  @js.native
  sealed trait EventResponseType extends js.Any
  object EventResponseType extends js.Object {
    val Success = "Success".asInstanceOf[EventResponseType]
    val Failure = "Failure".asInstanceOf[EventResponseType]

    val values = js.Object.freeze(js.Array(Success, Failure))
  }

  /**
    * The event risk type.
    */
  @js.native
  @Factory
  trait EventRiskType extends js.Object {
    var RiskDecision: js.UndefOr[RiskDecisionType]
    var RiskLevel: js.UndefOr[RiskLevelType]
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val SignIn         = "SignIn".asInstanceOf[EventType]
    val SignUp         = "SignUp".asInstanceOf[EventType]
    val ForgotPassword = "ForgotPassword".asInstanceOf[EventType]

    val values = js.Object.freeze(js.Array(SignIn, SignUp, ForgotPassword))
  }

  @js.native
  sealed trait ExplicitAuthFlowsType extends js.Any
  object ExplicitAuthFlowsType extends js.Object {
    val ADMIN_NO_SRP_AUTH              = "ADMIN_NO_SRP_AUTH".asInstanceOf[ExplicitAuthFlowsType]
    val CUSTOM_AUTH_FLOW_ONLY          = "CUSTOM_AUTH_FLOW_ONLY".asInstanceOf[ExplicitAuthFlowsType]
    val USER_PASSWORD_AUTH             = "USER_PASSWORD_AUTH".asInstanceOf[ExplicitAuthFlowsType]
    val ALLOW_ADMIN_USER_PASSWORD_AUTH = "ALLOW_ADMIN_USER_PASSWORD_AUTH".asInstanceOf[ExplicitAuthFlowsType]
    val ALLOW_CUSTOM_AUTH              = "ALLOW_CUSTOM_AUTH".asInstanceOf[ExplicitAuthFlowsType]
    val ALLOW_USER_PASSWORD_AUTH       = "ALLOW_USER_PASSWORD_AUTH".asInstanceOf[ExplicitAuthFlowsType]
    val ALLOW_USER_SRP_AUTH            = "ALLOW_USER_SRP_AUTH".asInstanceOf[ExplicitAuthFlowsType]
    val ALLOW_REFRESH_TOKEN_AUTH       = "ALLOW_REFRESH_TOKEN_AUTH".asInstanceOf[ExplicitAuthFlowsType]

    val values = js.Object.freeze(
      js.Array(
        ADMIN_NO_SRP_AUTH,
        CUSTOM_AUTH_FLOW_ONLY,
        USER_PASSWORD_AUTH,
        ALLOW_ADMIN_USER_PASSWORD_AUTH,
        ALLOW_CUSTOM_AUTH,
        ALLOW_USER_PASSWORD_AUTH,
        ALLOW_USER_SRP_AUTH,
        ALLOW_REFRESH_TOKEN_AUTH
      )
    )
  }

  @js.native
  sealed trait FeedbackValueType extends js.Any
  object FeedbackValueType extends js.Object {
    val Valid   = "Valid".asInstanceOf[FeedbackValueType]
    val Invalid = "Invalid".asInstanceOf[FeedbackValueType]

    val values = js.Object.freeze(js.Array(Valid, Invalid))
  }

  /**
    * Represents the request to forget the device.
    */
  @js.native
  @Factory
  trait ForgetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var AccessToken: js.UndefOr[TokenModelType]
  }

  /**
    * Represents the request to reset a user's password.
    */
  @js.native
  @Factory
  trait ForgotPasswordRequest extends js.Object {
    var ClientId: ClientIdType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  /**
    * Respresents the response from the server regarding the request to reset a password.
    */
  @js.native
  @Factory
  trait ForgotPasswordResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  /**
    * Represents the request to get the header information for the .csv file for the user import job.
    */
  @js.native
  @Factory
  trait GetCSVHeaderRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server to the request to get the header information for the .csv file for the user import job.
    */
  @js.native
  @Factory
  trait GetCSVHeaderResponse extends js.Object {
    var CSVHeader: js.UndefOr[ListOfStringTypes]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  /**
    * Represents the request to get the device.
    */
  @js.native
  @Factory
  trait GetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var AccessToken: js.UndefOr[TokenModelType]
  }

  /**
    * Gets the device response.
    */
  @js.native
  @Factory
  trait GetDeviceResponse extends js.Object {
    var Device: DeviceType
  }

  @js.native
  @Factory
  trait GetGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait GetGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  @js.native
  @Factory
  trait GetIdentityProviderByIdentifierRequest extends js.Object {
    var IdpIdentifier: IdpIdentifierType
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait GetIdentityProviderByIdentifierResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  /**
    * Request to get a signing certificate from Cognito.
    */
  @js.native
  @Factory
  trait GetSigningCertificateRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  /**
    * Response from Cognito for a signing certificate request.
    */
  @js.native
  @Factory
  trait GetSigningCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[StringType]
  }

  @js.native
  @Factory
  trait GetUICustomizationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var ClientId: js.UndefOr[ClientIdType]
  }

  @js.native
  @Factory
  trait GetUICustomizationResponse extends js.Object {
    var UICustomization: UICustomizationType
  }

  /**
    * Represents the request to get user attribute verification.
    */
  @js.native
  @Factory
  trait GetUserAttributeVerificationCodeRequest extends js.Object {
    var AccessToken: TokenModelType
    var AttributeName: AttributeNameType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  /**
    * The verification code response returned by the server response to get the user attribute verification code.
    */
  @js.native
  @Factory
  trait GetUserAttributeVerificationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  @js.native
  @Factory
  trait GetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  @js.native
  @Factory
  trait GetUserPoolMfaConfigResponse extends js.Object {
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  /**
    * Represents the request to get information about the user.
    */
  @js.native
  @Factory
  trait GetUserRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  /**
    * Represents the response from the server from the request to get information about the user.
    */
  @js.native
  @Factory
  trait GetUserResponse extends js.Object {
    var UserAttributes: AttributeListType
    var Username: UsernameType
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var PreferredMfaSetting: js.UndefOr[StringType]
    var UserMFASettingList: js.UndefOr[UserMFASettingListType]
  }

  /**
    * Represents the request to sign out all devices.
    */
  @js.native
  @Factory
  trait GlobalSignOutRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  /**
    * The response to the request to sign out all devices.
    */
  @js.native
  @Factory
  trait GlobalSignOutResponse extends js.Object {}

  /**
    * The group type.
    */
  @js.native
  @Factory
  trait GroupType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var Description: js.UndefOr[DescriptionType]
    var GroupName: js.UndefOr[GroupNameType]
    var LastModifiedDate: js.UndefOr[DateType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  /**
    * The HTTP header.
    */
  @js.native
  @Factory
  trait HttpHeader extends js.Object {
    var headerName: js.UndefOr[StringType]
    var headerValue: js.UndefOr[StringType]
  }

  /**
    * A container for information about an identity provider.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait IdentityProviderTypeType extends js.Any
  object IdentityProviderTypeType extends js.Object {
    val SAML            = "SAML".asInstanceOf[IdentityProviderTypeType]
    val Facebook        = "Facebook".asInstanceOf[IdentityProviderTypeType]
    val Google          = "Google".asInstanceOf[IdentityProviderTypeType]
    val LoginWithAmazon = "LoginWithAmazon".asInstanceOf[IdentityProviderTypeType]
    val SignInWithApple = "SignInWithApple".asInstanceOf[IdentityProviderTypeType]
    val OIDC            = "OIDC".asInstanceOf[IdentityProviderTypeType]

    val values = js.Object.freeze(js.Array(SAML, Facebook, Google, LoginWithAmazon, SignInWithApple, OIDC))
  }

  /**
    * Initiates the authentication request.
    */
  @js.native
  @Factory
  trait InitiateAuthRequest extends js.Object {
    var AuthFlow: AuthFlowType
    var ClientId: ClientIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var AuthParameters: js.UndefOr[AuthParametersType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  /**
    * Initiates the authentication response.
    */
  @js.native
  @Factory
  trait InitiateAuthResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  /**
    * Specifies the configuration for AWS Lambda triggers.
    */
  @js.native
  @Factory
  trait LambdaConfigType extends js.Object {
    var CreateAuthChallenge: js.UndefOr[ArnType]
    var CustomMessage: js.UndefOr[ArnType]
    var DefineAuthChallenge: js.UndefOr[ArnType]
    var PostAuthentication: js.UndefOr[ArnType]
    var PostConfirmation: js.UndefOr[ArnType]
    var PreAuthentication: js.UndefOr[ArnType]
    var PreSignUp: js.UndefOr[ArnType]
    var PreTokenGeneration: js.UndefOr[ArnType]
    var UserMigration: js.UndefOr[ArnType]
    var VerifyAuthChallengeResponse: js.UndefOr[ArnType]
  }

  /**
    * Represents the request to list the devices.
    */
  @js.native
  @Factory
  trait ListDevicesRequest extends js.Object {
    var AccessToken: TokenModelType
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  /**
    * Represents the response to list devices.
    */
  @js.native
  @Factory
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  @js.native
  @Factory
  trait ListGroupsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait ListIdentityProvidersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[ListProvidersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  @js.native
  @Factory
  trait ListIdentityProvidersResponse extends js.Object {
    var Providers: ProvidersListType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  @js.native
  @Factory
  trait ListResourceServersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[ListResourceServersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  @js.native
  @Factory
  trait ListResourceServersResponse extends js.Object {
    var ResourceServers: ResourceServersListType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ArnType
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[UserPoolTagsType]
  }

  /**
    * Represents the request to list the user import jobs.
    */
  @js.native
  @Factory
  trait ListUserImportJobsRequest extends js.Object {
    var MaxResults: PoolQueryLimitType
    var UserPoolId: UserPoolIdType
    var PaginationToken: js.UndefOr[PaginationKeyType]
  }

  /**
    * Represents the response from the server to the request to list the user import jobs.
    */
  @js.native
  @Factory
  trait ListUserImportJobsResponse extends js.Object {
    var PaginationToken: js.UndefOr[PaginationKeyType]
    var UserImportJobs: js.UndefOr[UserImportJobsListType]
  }

  /**
    * Represents the request to list the user pool clients.
    */
  @js.native
  @Factory
  trait ListUserPoolClientsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[QueryLimit]
    var NextToken: js.UndefOr[PaginationKey]
  }

  /**
    * Represents the response from the server that lists user pool clients.
    */
  @js.native
  @Factory
  trait ListUserPoolClientsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKey]
    var UserPoolClients: js.UndefOr[UserPoolClientListType]
  }

  /**
    * Represents the request to list user pools.
    */
  @js.native
  @Factory
  trait ListUserPoolsRequest extends js.Object {
    var MaxResults: PoolQueryLimitType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  /**
    * Represents the response to list user pools.
    */
  @js.native
  @Factory
  trait ListUserPoolsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKeyType]
    var UserPools: js.UndefOr[UserPoolListType]
  }

  @js.native
  @Factory
  trait ListUsersInGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait ListUsersInGroupResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKey]
    var Users: js.UndefOr[UsersListType]
  }

  /**
    * Represents the request to list users.
    */
  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var AttributesToGet: js.UndefOr[SearchedAttributeNamesListType]
    var Filter: js.UndefOr[UserFilterType]
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  /**
    * The response from the request to list users.
    */
  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
    var Users: js.UndefOr[UsersListType]
  }

  /**
    * <i>This data type is no longer supported.</i> You can use it only for SMS MFA configurations. You can't use it for TOTP software token MFA configurations.
    *  To set either type of MFA configuration, use the <a>AdminSetUserMFAPreference</a> or <a>SetUserMFAPreference</a> actions.
    *  To look up information about either type of MFA configuration, use the [[AdminGetUserResponse.UserMFASettingList]] or [[GetUserResponse.UserMFASettingList]] responses.
    */
  @js.native
  @Factory
  trait MFAOptionType extends js.Object {
    var AttributeName: js.UndefOr[AttributeNameType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
  }

  @js.native
  sealed trait MessageActionType extends js.Any
  object MessageActionType extends js.Object {
    val RESEND   = "RESEND".asInstanceOf[MessageActionType]
    val SUPPRESS = "SUPPRESS".asInstanceOf[MessageActionType]

    val values = js.Object.freeze(js.Array(RESEND, SUPPRESS))
  }

  /**
    * The message template structure.
    */
  @js.native
  @Factory
  trait MessageTemplateType extends js.Object {
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
    var SMSMessage: js.UndefOr[SmsVerificationMessageType]
  }

  /**
    * The new device metadata type.
    */
  @js.native
  @Factory
  trait NewDeviceMetadataType extends js.Object {
    var DeviceGroupKey: js.UndefOr[StringType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
  }

  /**
    * The notify configuration type.
    */
  @js.native
  @Factory
  trait NotifyConfigurationType extends js.Object {
    var SourceArn: ArnType
    var BlockEmail: js.UndefOr[NotifyEmailType]
    var From: js.UndefOr[StringType]
    var MfaEmail: js.UndefOr[NotifyEmailType]
    var NoActionEmail: js.UndefOr[NotifyEmailType]
    var ReplyTo: js.UndefOr[StringType]
  }

  /**
    * The notify email type.
    */
  @js.native
  @Factory
  trait NotifyEmailType extends js.Object {
    var Subject: EmailNotificationSubjectType
    var HtmlBody: js.UndefOr[EmailNotificationBodyType]
    var TextBody: js.UndefOr[EmailNotificationBodyType]
  }

  /**
    * The minimum and maximum value of an attribute that is of the number data type.
    */
  @js.native
  @Factory
  trait NumberAttributeConstraintsType extends js.Object {
    var MaxValue: js.UndefOr[StringType]
    var MinValue: js.UndefOr[StringType]
  }

  @js.native
  sealed trait OAuthFlowType extends js.Any
  object OAuthFlowType extends js.Object {
    val code               = "code".asInstanceOf[OAuthFlowType]
    val `implicit`         = "implicit".asInstanceOf[OAuthFlowType]
    val client_credentials = "client_credentials".asInstanceOf[OAuthFlowType]

    val values = js.Object.freeze(js.Array(code, `implicit`, client_credentials))
  }

  /**
    * The password policy type.
    */
  @js.native
  @Factory
  trait PasswordPolicyType extends js.Object {
    var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType]
    var RequireLowercase: js.UndefOr[BooleanType]
    var RequireNumbers: js.UndefOr[BooleanType]
    var RequireSymbols: js.UndefOr[BooleanType]
    var RequireUppercase: js.UndefOr[BooleanType]
    var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType]
  }

  @js.native
  sealed trait PreventUserExistenceErrorTypes extends js.Any
  object PreventUserExistenceErrorTypes extends js.Object {
    val LEGACY  = "LEGACY".asInstanceOf[PreventUserExistenceErrorTypes]
    val ENABLED = "ENABLED".asInstanceOf[PreventUserExistenceErrorTypes]

    val values = js.Object.freeze(js.Array(LEGACY, ENABLED))
  }

  /**
    * A container for identity provider details.
    */
  @js.native
  @Factory
  trait ProviderDescription extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var LastModifiedDate: js.UndefOr[DateType]
    var ProviderName: js.UndefOr[ProviderNameType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
  }

  /**
    * A container for information about an identity provider for a user pool.
    */
  @js.native
  @Factory
  trait ProviderUserIdentifierType extends js.Object {
    var ProviderAttributeName: js.UndefOr[StringType]
    var ProviderAttributeValue: js.UndefOr[StringType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  @js.native
  sealed trait RecoveryOptionNameType extends js.Any
  object RecoveryOptionNameType extends js.Object {
    val verified_email        = "verified_email".asInstanceOf[RecoveryOptionNameType]
    val verified_phone_number = "verified_phone_number".asInstanceOf[RecoveryOptionNameType]
    val admin_only            = "admin_only".asInstanceOf[RecoveryOptionNameType]

    val values = js.Object.freeze(js.Array(verified_email, verified_phone_number, admin_only))
  }

  /**
    * A map containing a priority as a key, and recovery method name as a value.
    */
  @js.native
  @Factory
  trait RecoveryOptionType extends js.Object {
    var Name: RecoveryOptionNameType
    var Priority: PriorityType
  }

  /**
    * Represents the request to resend the confirmation code.
    */
  @js.native
  @Factory
  trait ResendConfirmationCodeRequest extends js.Object {
    var ClientId: ClientIdType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  /**
    * The response from the server when the Amazon Cognito Your User Pools service makes the request to resend a confirmation code.
    */
  @js.native
  @Factory
  trait ResendConfirmationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  /**
    * A resource server scope.
    */
  @js.native
  @Factory
  trait ResourceServerScopeType extends js.Object {
    var ScopeDescription: ResourceServerScopeDescriptionType
    var ScopeName: ResourceServerScopeNameType
  }

  /**
    * A container for information about a resource server for a user pool.
    */
  @js.native
  @Factory
  trait ResourceServerType extends js.Object {
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
    var Name: js.UndefOr[ResourceServerNameType]
    var Scopes: js.UndefOr[ResourceServerScopeListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  /**
    * The request to respond to an authentication challenge.
    */
  @js.native
  @Factory
  trait RespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: ChallengeNameType
    var ClientId: ClientIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var Session: js.UndefOr[SessionType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  /**
    * The response to respond to the authentication challenge.
    */
  @js.native
  @Factory
  trait RespondToAuthChallengeResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  /**
    * The risk configuration type.
    */
  @js.native
  @Factory
  trait RiskConfigurationType extends js.Object {
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType]
    var ClientId: js.UndefOr[ClientIdType]
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType]
    var LastModifiedDate: js.UndefOr[DateType]
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  @js.native
  sealed trait RiskDecisionType extends js.Any
  object RiskDecisionType extends js.Object {
    val NoRisk          = "NoRisk".asInstanceOf[RiskDecisionType]
    val AccountTakeover = "AccountTakeover".asInstanceOf[RiskDecisionType]
    val Block           = "Block".asInstanceOf[RiskDecisionType]

    val values = js.Object.freeze(js.Array(NoRisk, AccountTakeover, Block))
  }

  /**
    * The type of the configuration to override the risk decision.
    */
  @js.native
  @Factory
  trait RiskExceptionConfigurationType extends js.Object {
    var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType]
    var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType]
  }

  @js.native
  sealed trait RiskLevelType extends js.Any
  object RiskLevelType extends js.Object {
    val Low    = "Low".asInstanceOf[RiskLevelType]
    val Medium = "Medium".asInstanceOf[RiskLevelType]
    val High   = "High".asInstanceOf[RiskLevelType]

    val values = js.Object.freeze(js.Array(Low, Medium, High))
  }

  /**
    * The type used for enabling SMS MFA at the user level.
    */
  @js.native
  @Factory
  trait SMSMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  /**
    * Contains information about the schema attribute.
    */
  @js.native
  @Factory
  trait SchemaAttributeType extends js.Object {
    var AttributeDataType: js.UndefOr[AttributeDataType]
    var DeveloperOnlyAttribute: js.UndefOr[BooleanType]
    var Mutable: js.UndefOr[BooleanType]
    var Name: js.UndefOr[CustomAttributeNameType]
    var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType]
    var Required: js.UndefOr[BooleanType]
    var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType]
  }

  @js.native
  @Factory
  trait SetRiskConfigurationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType]
    var ClientId: js.UndefOr[ClientIdType]
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType]
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType]
  }

  @js.native
  @Factory
  trait SetRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: RiskConfigurationType
  }

  @js.native
  @Factory
  trait SetUICustomizationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var CSS: js.UndefOr[CSSType]
    var ClientId: js.UndefOr[ClientIdType]
    var ImageFile: js.UndefOr[ImageFileType]
  }

  @js.native
  @Factory
  trait SetUICustomizationResponse extends js.Object {
    var UICustomization: UICustomizationType
  }

  @js.native
  @Factory
  trait SetUserMFAPreferenceRequest extends js.Object {
    var AccessToken: TokenModelType
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
  }

  @js.native
  @Factory
  trait SetUserMFAPreferenceResponse extends js.Object {}

  @js.native
  @Factory
  trait SetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  @js.native
  @Factory
  trait SetUserPoolMfaConfigResponse extends js.Object {
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  /**
    * Represents the request to set user settings.
    */
  @js.native
  @Factory
  trait SetUserSettingsRequest extends js.Object {
    var AccessToken: TokenModelType
    var MFAOptions: MFAOptionListType
  }

  /**
    * The response from the server for a set user settings request.
    */
  @js.native
  @Factory
  trait SetUserSettingsResponse extends js.Object {}

  /**
    * Represents the request to register a user.
    */
  @js.native
  @Factory
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

  /**
    * The response from the server for a registration request.
    */
  @js.native
  @Factory
  trait SignUpResponse extends js.Object {
    var UserConfirmed: BooleanType
    var UserSub: StringType
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  /**
    * The SMS configuration type that includes the settings the Cognito User Pool needs to call for the Amazon SNS service to send an SMS message from your AWS account. The Cognito User Pool makes the request to the Amazon SNS Service by using an AWS IAM role that you provide for your AWS account.
    */
  @js.native
  @Factory
  trait SmsConfigurationType extends js.Object {
    var SnsCallerArn: ArnType
    var ExternalId: js.UndefOr[StringType]
  }

  /**
    * The SMS text message multi-factor authentication (MFA) configuration type.
    */
  @js.native
  @Factory
  trait SmsMfaConfigType extends js.Object {
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
  }

  /**
    * The type used for enabling software token MFA at the user pool level.
    */
  @js.native
  @Factory
  trait SoftwareTokenMfaConfigType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
  }

  /**
    * The type used for enabling software token MFA at the user level.
    */
  @js.native
  @Factory
  trait SoftwareTokenMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  /**
    * Represents the request to start the user import job.
    */
  @js.native
  @Factory
  trait StartUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server to the request to start the user import job.
    */
  @js.native
  @Factory
  trait StartUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  @js.native
  sealed trait StatusType extends js.Any
  object StatusType extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[StatusType]
    val Disabled = "Disabled".asInstanceOf[StatusType]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  /**
    * Represents the request to stop the user import job.
    */
  @js.native
  @Factory
  trait StopUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  /**
    * Represents the response from the server to the request to stop the user import job.
    */
  @js.native
  @Factory
  trait StopUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  /**
    * The constraints associated with a string attribute.
    */
  @js.native
  @Factory
  trait StringAttributeConstraintsType extends js.Object {
    var MaxLength: js.UndefOr[StringType]
    var MinLength: js.UndefOr[StringType]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ArnType
    var Tags: UserPoolTagsType
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * A container for the UI customization information for a user pool's built-in app UI.
    */
  @js.native
  @Factory
  trait UICustomizationType extends js.Object {
    var CSS: js.UndefOr[CSSType]
    var CSSVersion: js.UndefOr[CSSVersionType]
    var ClientId: js.UndefOr[ClientIdType]
    var CreationDate: js.UndefOr[DateType]
    var ImageUrl: js.UndefOr[ImageUrlType]
    var LastModifiedDate: js.UndefOr[DateType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ArnType
    var TagKeys: UserPoolTagsListType
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAuthEventFeedbackRequest extends js.Object {
    var EventId: EventIdType
    var FeedbackToken: TokenModelType
    var FeedbackValue: FeedbackValueType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  @js.native
  @Factory
  trait UpdateAuthEventFeedbackResponse extends js.Object {}

  /**
    * Represents the request to update the device status.
    */
  @js.native
  @Factory
  trait UpdateDeviceStatusRequest extends js.Object {
    var AccessToken: TokenModelType
    var DeviceKey: DeviceKeyType
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  /**
    * The response to the request to update the device status.
    */
  @js.native
  @Factory
  trait UpdateDeviceStatusResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Description: js.UndefOr[DescriptionType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  @js.native
  @Factory
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  @js.native
  @Factory
  trait UpdateIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
    var ProviderDetails: js.UndefOr[ProviderDetailsType]
  }

  @js.native
  @Factory
  trait UpdateIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  @js.native
  @Factory
  trait UpdateResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var Name: ResourceServerNameType
    var UserPoolId: UserPoolIdType
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  @js.native
  @Factory
  trait UpdateResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  /**
    * Represents the request to update user attributes.
    */
  @js.native
  @Factory
  trait UpdateUserAttributesRequest extends js.Object {
    var AccessToken: TokenModelType
    var UserAttributes: AttributeListType
    var ClientMetadata: js.UndefOr[ClientMetadataType]
  }

  /**
    * Represents the response from the server for the request to update user attributes.
    */
  @js.native
  @Factory
  trait UpdateUserAttributesResponse extends js.Object {
    var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType]
  }

  /**
    * Represents the request to update the user pool client.
    */
  @js.native
  @Factory
  trait UpdateUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var ClientName: js.UndefOr[ClientNameType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
    var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  /**
    * Represents the response from the server to the request to update the user pool client.
    */
  @js.native
  @Factory
  trait UpdateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  /**
    * The UpdateUserPoolDomain request input.
    */
  @js.native
  @Factory
  trait UpdateUserPoolDomainRequest extends js.Object {
    var CustomDomainConfig: CustomDomainConfigType
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
  }

  /**
    * The UpdateUserPoolDomain response output.
    */
  @js.native
  @Factory
  trait UpdateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  /**
    * Represents the request to update the user pool.
    */
  @js.native
  @Factory
  trait UpdateUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
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
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  /**
    * Represents the response from the server when you make a request to update the user pool.
    */
  @js.native
  @Factory
  trait UpdateUserPoolResponse extends js.Object {}

  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  @js.native
  @Factory
  trait UserContextDataType extends js.Object {
    var EncodedData: js.UndefOr[StringType]
  }

  @js.native
  sealed trait UserImportJobStatusType extends js.Any
  object UserImportJobStatusType extends js.Object {
    val Created    = "Created".asInstanceOf[UserImportJobStatusType]
    val Pending    = "Pending".asInstanceOf[UserImportJobStatusType]
    val InProgress = "InProgress".asInstanceOf[UserImportJobStatusType]
    val Stopping   = "Stopping".asInstanceOf[UserImportJobStatusType]
    val Expired    = "Expired".asInstanceOf[UserImportJobStatusType]
    val Stopped    = "Stopped".asInstanceOf[UserImportJobStatusType]
    val Failed     = "Failed".asInstanceOf[UserImportJobStatusType]
    val Succeeded  = "Succeeded".asInstanceOf[UserImportJobStatusType]

    val values = js.Object.freeze(js.Array(Created, Pending, InProgress, Stopping, Expired, Stopped, Failed, Succeeded))
  }

  /**
    * The user import job type.
    */
  @js.native
  @Factory
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

  /**
    * The user pool add-ons type.
    */
  @js.native
  @Factory
  trait UserPoolAddOnsType extends js.Object {
    var AdvancedSecurityMode: AdvancedSecurityModeType
  }

  /**
    * The description of the user pool client.
    */
  @js.native
  @Factory
  trait UserPoolClientDescription extends js.Object {
    var ClientId: js.UndefOr[ClientIdType]
    var ClientName: js.UndefOr[ClientNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  /**
    * Contains information about a user pool client.
    */
  @js.native
  @Factory
  trait UserPoolClientType extends js.Object {
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var ClientId: js.UndefOr[ClientIdType]
    var ClientName: js.UndefOr[ClientNameType]
    var ClientSecret: js.UndefOr[ClientSecretType]
    var CreationDate: js.UndefOr[DateType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var LastModifiedDate: js.UndefOr[DateType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
    var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  /**
    * A user pool description.
    */
  @js.native
  @Factory
  trait UserPoolDescriptionType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var Id: js.UndefOr[UserPoolIdType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var LastModifiedDate: js.UndefOr[DateType]
    var Name: js.UndefOr[UserPoolNameType]
    var Status: js.UndefOr[StatusType]
  }

  @js.native
  sealed trait UserPoolMfaType extends js.Any
  object UserPoolMfaType extends js.Object {
    val OFF      = "OFF".asInstanceOf[UserPoolMfaType]
    val ON       = "ON".asInstanceOf[UserPoolMfaType]
    val OPTIONAL = "OPTIONAL".asInstanceOf[UserPoolMfaType]

    val values = js.Object.freeze(js.Array(OFF, ON, OPTIONAL))
  }

  /**
    * The policy associated with a user pool.
    */
  @js.native
  @Factory
  trait UserPoolPolicyType extends js.Object {
    var PasswordPolicy: js.UndefOr[PasswordPolicyType]
  }

  /**
    * A container for information about the user pool.
    */
  @js.native
  @Factory
  trait UserPoolType extends js.Object {
    var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var AliasAttributes: js.UndefOr[AliasAttributesListType]
    var Arn: js.UndefOr[ArnType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var CreationDate: js.UndefOr[DateType]
    var CustomDomain: js.UndefOr[DomainType]
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
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType]
    var UsernameConfiguration: js.UndefOr[UsernameConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  @js.native
  sealed trait UserStatusType extends js.Any
  object UserStatusType extends js.Object {
    val UNCONFIRMED           = "UNCONFIRMED".asInstanceOf[UserStatusType]
    val CONFIRMED             = "CONFIRMED".asInstanceOf[UserStatusType]
    val ARCHIVED              = "ARCHIVED".asInstanceOf[UserStatusType]
    val COMPROMISED           = "COMPROMISED".asInstanceOf[UserStatusType]
    val UNKNOWN               = "UNKNOWN".asInstanceOf[UserStatusType]
    val RESET_REQUIRED        = "RESET_REQUIRED".asInstanceOf[UserStatusType]
    val FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[UserStatusType]

    val values = js.Object.freeze(
      js.Array(UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD)
    )
  }

  /**
    * The user type.
    */
  @js.native
  @Factory
  trait UserType extends js.Object {
    var Attributes: js.UndefOr[AttributeListType]
    var Enabled: js.UndefOr[BooleanType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var UserCreateDate: js.UndefOr[DateType]
    var UserLastModifiedDate: js.UndefOr[DateType]
    var UserStatus: js.UndefOr[UserStatusType]
    var Username: js.UndefOr[UsernameType]
  }

  @js.native
  sealed trait UsernameAttributeType extends js.Any
  object UsernameAttributeType extends js.Object {
    val phone_number = "phone_number".asInstanceOf[UsernameAttributeType]
    val email        = "email".asInstanceOf[UsernameAttributeType]

    val values = js.Object.freeze(js.Array(phone_number, email))
  }

  /**
    * The username configuration type.
    */
  @js.native
  @Factory
  trait UsernameConfigurationType extends js.Object {
    var CaseSensitive: WrappedBooleanType
  }

  /**
    * The template for verification messages.
    */
  @js.native
  @Factory
  trait VerificationMessageTemplateType extends js.Object {
    var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType]
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
    var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType]
    var SmsMessage: js.UndefOr[SmsVerificationMessageType]
  }

  @js.native
  sealed trait VerifiedAttributeType extends js.Any
  object VerifiedAttributeType extends js.Object {
    val phone_number = "phone_number".asInstanceOf[VerifiedAttributeType]
    val email        = "email".asInstanceOf[VerifiedAttributeType]

    val values = js.Object.freeze(js.Array(phone_number, email))
  }

  @js.native
  @Factory
  trait VerifySoftwareTokenRequest extends js.Object {
    var UserCode: SoftwareTokenMFAUserCodeType
    var AccessToken: js.UndefOr[TokenModelType]
    var FriendlyDeviceName: js.UndefOr[StringType]
    var Session: js.UndefOr[SessionType]
  }

  @js.native
  @Factory
  trait VerifySoftwareTokenResponse extends js.Object {
    var Session: js.UndefOr[SessionType]
    var Status: js.UndefOr[VerifySoftwareTokenResponseType]
  }

  @js.native
  sealed trait VerifySoftwareTokenResponseType extends js.Any
  object VerifySoftwareTokenResponseType extends js.Object {
    val SUCCESS = "SUCCESS".asInstanceOf[VerifySoftwareTokenResponseType]
    val ERROR   = "ERROR".asInstanceOf[VerifySoftwareTokenResponseType]

    val values = js.Object.freeze(js.Array(SUCCESS, ERROR))
  }

  /**
    * Represents the request to verify user attributes.
    */
  @js.native
  @Factory
  trait VerifyUserAttributeRequest extends js.Object {
    var AccessToken: TokenModelType
    var AttributeName: AttributeNameType
    var Code: ConfirmationCodeType
  }

  /**
    * A container representing the response from the server from the request to verify user attributes.
    */
  @js.native
  @Factory
  trait VerifyUserAttributeResponse extends js.Object {}
}
