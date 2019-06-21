package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cognitoidentityprovider {
  type AWSAccountIdType                             = String
  type AccountTakeoverActionNotifyType              = Boolean
  type AccountTakeoverEventActionType               = String
  type AdminCreateUserUnusedAccountValidityDaysType = Int
  type AdvancedSecurityModeType                     = String
  type AliasAttributeType                           = String
  type AliasAttributesListType                      = js.Array[AliasAttributeType]
  type ArnType                                      = String
  type AttributeDataType                            = String
  type AttributeListType                            = js.Array[AttributeType]
  type AttributeMappingKeyType                      = String
  type AttributeMappingType                         = js.Dictionary[StringType]
  type AttributeNameListType                        = js.Array[AttributeNameType]
  type AttributeNameType                            = String
  type AttributeValueType                           = String
  type AuthEventsType                               = js.Array[AuthEventType]
  type AuthFlowType                                 = String
  type AuthParametersType                           = js.Dictionary[StringType]
  type BlockedIPRangeListType                       = js.Array[StringType]
  type BooleanType                                  = Boolean
  type CSSType                                      = String
  type CSSVersionType                               = String
  type CallbackURLsListType                         = js.Array[RedirectUrlType]
  type ChallengeName                                = String
  type ChallengeNameType                            = String
  type ChallengeParametersType                      = js.Dictionary[StringType]
  type ChallengeResponse                            = String
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
  type CompromisedCredentialsEventActionType        = String
  type ConfirmationCodeType                         = String
  type CustomAttributeNameType                      = String
  type CustomAttributesListType                     = js.Array[SchemaAttributeType]
  type DateType                                     = js.Date
  type DefaultEmailOptionType                       = String
  type DeliveryMediumListType                       = js.Array[DeliveryMediumType]
  type DeliveryMediumType                           = String
  type DescriptionType                              = String
  type DeviceKeyType                                = String
  type DeviceListType                               = js.Array[DeviceType]
  type DeviceNameType                               = String
  type DeviceRememberedStatusType                   = String
  type DomainStatusType                             = String
  type DomainType                                   = String
  type DomainVersionType                            = String
  type EmailAddressType                             = String
  type EmailNotificationBodyType                    = String
  type EmailNotificationSubjectType                 = String
  type EmailVerificationMessageByLinkType           = String
  type EmailVerificationMessageType                 = String
  type EmailVerificationSubjectByLinkType           = String
  type EmailVerificationSubjectType                 = String
  type EventFilterType                              = String
  type EventFiltersType                             = js.Array[EventFilterType]
  type EventIdType                                  = String
  type EventResponseType                            = String
  type EventType                                    = String
  type ExplicitAuthFlowsListType                    = js.Array[ExplicitAuthFlowsType]
  type ExplicitAuthFlowsType                        = String
  type FeedbackValueType                            = String
  type ForceAliasCreation                           = Boolean
  type GenerateSecret                               = Boolean
  type GroupListType                                = js.Array[GroupType]
  type GroupNameType                                = String
  type HexStringType                                = String
  type HttpHeaderList                               = js.Array[HttpHeader]
  type IdentityProviderTypeType                     = String
  type IdpIdentifierType                            = String
  type IdpIdentifiersListType                       = js.Array[IdpIdentifierType]
  type ImageFileType =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageUrlType                       = String
  type IntegerType                        = Int
  type ListOfStringTypes                  = js.Array[StringType]
  type ListProvidersLimitType             = Int
  type ListResourceServersLimitType       = Int
  type LogoutURLsListType                 = js.Array[RedirectUrlType]
  type LongType                           = Double
  type MFAOptionListType                  = js.Array[MFAOptionType]
  type MessageActionType                  = String
  type OAuthFlowType                      = String
  type OAuthFlowsType                     = js.Array[OAuthFlowType]
  type PaginationKey                      = String
  type PaginationKeyType                  = String
  type PasswordPolicyMinLengthType        = Int
  type PasswordType                       = String
  type PoolQueryLimitType                 = Int
  type PreSignedUrlType                   = String
  type PrecedenceType                     = Int
  type ProviderDetailsType                = js.Dictionary[StringType]
  type ProviderNameType                   = String
  type ProviderNameTypeV1                 = String
  type ProvidersListType                  = js.Array[ProviderDescription]
  type QueryLimit                         = Int
  type QueryLimitType                     = Int
  type RedirectUrlType                    = String
  type RefreshTokenValidityType           = Int
  type ResourceServerIdentifierType       = String
  type ResourceServerNameType             = String
  type ResourceServerScopeDescriptionType = String
  type ResourceServerScopeListType        = js.Array[ResourceServerScopeType]
  type ResourceServerScopeNameType        = String
  type ResourceServersListType            = js.Array[ResourceServerType]
  type RiskDecisionType                   = String
  type RiskLevelType                      = String
  type S3BucketType                       = String
  type SchemaAttributesListType           = js.Array[SchemaAttributeType]
  type ScopeListType                      = js.Array[ScopeType]
  type ScopeType                          = String
  type SearchPaginationTokenType          = String
  type SearchedAttributeNamesListType     = js.Array[AttributeNameType]
  type SecretCodeType                     = String
  type SecretHashType                     = String
  type SessionType                        = String
  type SkippedIPRangeListType             = js.Array[StringType]
  type SmsVerificationMessageType         = String
  type SoftwareTokenMFAUserCodeType       = String
  type StatusType                         = String
  type StringType                         = String
  type SupportedIdentityProvidersListType = js.Array[ProviderNameType]
  type TagKeysType                        = String
  type TagValueType                       = String
  type TokenModelType                     = String
  type UserFilterType                     = String
  type UserImportJobIdType                = String
  type UserImportJobNameType              = String
  type UserImportJobStatusType            = String
  type UserImportJobsListType             = js.Array[UserImportJobType]
  type UserMFASettingListType             = js.Array[StringType]
  type UserPoolClientListType             = js.Array[UserPoolClientDescription]
  type UserPoolIdType                     = String
  type UserPoolListType                   = js.Array[UserPoolDescriptionType]
  type UserPoolMfaType                    = String
  type UserPoolNameType                   = String
  type UserPoolTagsListType               = js.Array[TagKeysType]
  type UserPoolTagsType                   = js.Dictionary[TagValueType]
  type UserStatusType                     = String
  type UsernameAttributeType              = String
  type UsernameAttributesListType         = js.Array[UsernameAttributeType]
  type UsernameType                       = String
  type UsersListType                      = js.Array[UserType]
  type VerifiedAttributeType              = String
  type VerifiedAttributesListType         = js.Array[VerifiedAttributeType]
  type VerifySoftwareTokenResponseType    = String

  implicit final class CognitoIdentityProviderOps(val service: CognitoIdentityProvider) extends AnyVal {

    def addCustomAttributesFuture(params: AddCustomAttributesRequest): Future[AddCustomAttributesResponse] =
      service.addCustomAttributes(params).promise.toFuture
    def adminAddUserToGroupFuture(params: AdminAddUserToGroupRequest): Future[js.Object] =
      service.adminAddUserToGroup(params).promise.toFuture
    def adminConfirmSignUpFuture(params: AdminConfirmSignUpRequest): Future[AdminConfirmSignUpResponse] =
      service.adminConfirmSignUp(params).promise.toFuture
    def adminCreateUserFuture(params: AdminCreateUserRequest): Future[AdminCreateUserResponse] =
      service.adminCreateUser(params).promise.toFuture
    def adminDeleteUserAttributesFuture(
        params: AdminDeleteUserAttributesRequest
    ): Future[AdminDeleteUserAttributesResponse] = service.adminDeleteUserAttributes(params).promise.toFuture
    def adminDeleteUserFuture(params: AdminDeleteUserRequest): Future[js.Object] =
      service.adminDeleteUser(params).promise.toFuture
    def adminDisableProviderForUserFuture(
        params: AdminDisableProviderForUserRequest
    ): Future[AdminDisableProviderForUserResponse] = service.adminDisableProviderForUser(params).promise.toFuture
    def adminDisableUserFuture(params: AdminDisableUserRequest): Future[AdminDisableUserResponse] =
      service.adminDisableUser(params).promise.toFuture
    def adminEnableUserFuture(params: AdminEnableUserRequest): Future[AdminEnableUserResponse] =
      service.adminEnableUser(params).promise.toFuture
    def adminForgetDeviceFuture(params: AdminForgetDeviceRequest): Future[js.Object] =
      service.adminForgetDevice(params).promise.toFuture
    def adminGetDeviceFuture(params: AdminGetDeviceRequest): Future[AdminGetDeviceResponse] =
      service.adminGetDevice(params).promise.toFuture
    def adminGetUserFuture(params: AdminGetUserRequest): Future[AdminGetUserResponse] =
      service.adminGetUser(params).promise.toFuture
    def adminInitiateAuthFuture(params: AdminInitiateAuthRequest): Future[AdminInitiateAuthResponse] =
      service.adminInitiateAuth(params).promise.toFuture
    def adminLinkProviderForUserFuture(
        params: AdminLinkProviderForUserRequest
    ): Future[AdminLinkProviderForUserResponse] = service.adminLinkProviderForUser(params).promise.toFuture
    def adminListDevicesFuture(params: AdminListDevicesRequest): Future[AdminListDevicesResponse] =
      service.adminListDevices(params).promise.toFuture
    def adminListGroupsForUserFuture(params: AdminListGroupsForUserRequest): Future[AdminListGroupsForUserResponse] =
      service.adminListGroupsForUser(params).promise.toFuture
    def adminListUserAuthEventsFuture(params: AdminListUserAuthEventsRequest): Future[AdminListUserAuthEventsResponse] =
      service.adminListUserAuthEvents(params).promise.toFuture
    def adminRemoveUserFromGroupFuture(params: AdminRemoveUserFromGroupRequest): Future[js.Object] =
      service.adminRemoveUserFromGroup(params).promise.toFuture
    def adminResetUserPasswordFuture(params: AdminResetUserPasswordRequest): Future[AdminResetUserPasswordResponse] =
      service.adminResetUserPassword(params).promise.toFuture
    def adminRespondToAuthChallengeFuture(
        params: AdminRespondToAuthChallengeRequest
    ): Future[AdminRespondToAuthChallengeResponse] = service.adminRespondToAuthChallenge(params).promise.toFuture
    def adminSetUserMFAPreferenceFuture(
        params: AdminSetUserMFAPreferenceRequest
    ): Future[AdminSetUserMFAPreferenceResponse] = service.adminSetUserMFAPreference(params).promise.toFuture
    def adminSetUserSettingsFuture(params: AdminSetUserSettingsRequest): Future[AdminSetUserSettingsResponse] =
      service.adminSetUserSettings(params).promise.toFuture
    def adminUpdateAuthEventFeedbackFuture(
        params: AdminUpdateAuthEventFeedbackRequest
    ): Future[AdminUpdateAuthEventFeedbackResponse] = service.adminUpdateAuthEventFeedback(params).promise.toFuture
    def adminUpdateDeviceStatusFuture(params: AdminUpdateDeviceStatusRequest): Future[AdminUpdateDeviceStatusResponse] =
      service.adminUpdateDeviceStatus(params).promise.toFuture
    def adminUpdateUserAttributesFuture(
        params: AdminUpdateUserAttributesRequest
    ): Future[AdminUpdateUserAttributesResponse] = service.adminUpdateUserAttributes(params).promise.toFuture
    def adminUserGlobalSignOutFuture(params: AdminUserGlobalSignOutRequest): Future[AdminUserGlobalSignOutResponse] =
      service.adminUserGlobalSignOut(params).promise.toFuture
    def associateSoftwareTokenFuture(params: AssociateSoftwareTokenRequest): Future[AssociateSoftwareTokenResponse] =
      service.associateSoftwareToken(params).promise.toFuture
    def changePasswordFuture(params: ChangePasswordRequest): Future[ChangePasswordResponse] =
      service.changePassword(params).promise.toFuture
    def confirmDeviceFuture(params: ConfirmDeviceRequest): Future[ConfirmDeviceResponse] =
      service.confirmDevice(params).promise.toFuture
    def confirmForgotPasswordFuture(params: ConfirmForgotPasswordRequest): Future[ConfirmForgotPasswordResponse] =
      service.confirmForgotPassword(params).promise.toFuture
    def confirmSignUpFuture(params: ConfirmSignUpRequest): Future[ConfirmSignUpResponse] =
      service.confirmSignUp(params).promise.toFuture
    def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise.toFuture
    def createIdentityProviderFuture(params: CreateIdentityProviderRequest): Future[CreateIdentityProviderResponse] =
      service.createIdentityProvider(params).promise.toFuture
    def createResourceServerFuture(params: CreateResourceServerRequest): Future[CreateResourceServerResponse] =
      service.createResourceServer(params).promise.toFuture
    def createUserImportJobFuture(params: CreateUserImportJobRequest): Future[CreateUserImportJobResponse] =
      service.createUserImportJob(params).promise.toFuture
    def createUserPoolClientFuture(params: CreateUserPoolClientRequest): Future[CreateUserPoolClientResponse] =
      service.createUserPoolClient(params).promise.toFuture
    def createUserPoolDomainFuture(params: CreateUserPoolDomainRequest): Future[CreateUserPoolDomainResponse] =
      service.createUserPoolDomain(params).promise.toFuture
    def createUserPoolFuture(params: CreateUserPoolRequest): Future[CreateUserPoolResponse] =
      service.createUserPool(params).promise.toFuture
    def deleteGroupFuture(params: DeleteGroupRequest): Future[js.Object] = service.deleteGroup(params).promise.toFuture
    def deleteIdentityProviderFuture(params: DeleteIdentityProviderRequest): Future[js.Object] =
      service.deleteIdentityProvider(params).promise.toFuture
    def deleteResourceServerFuture(params: DeleteResourceServerRequest): Future[js.Object] =
      service.deleteResourceServer(params).promise.toFuture
    def deleteUserAttributesFuture(params: DeleteUserAttributesRequest): Future[DeleteUserAttributesResponse] =
      service.deleteUserAttributes(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise.toFuture
    def deleteUserPoolClientFuture(params: DeleteUserPoolClientRequest): Future[js.Object] =
      service.deleteUserPoolClient(params).promise.toFuture
    def deleteUserPoolDomainFuture(params: DeleteUserPoolDomainRequest): Future[DeleteUserPoolDomainResponse] =
      service.deleteUserPoolDomain(params).promise.toFuture
    def deleteUserPoolFuture(params: DeleteUserPoolRequest): Future[js.Object] =
      service.deleteUserPool(params).promise.toFuture
    def describeIdentityProviderFuture(
        params: DescribeIdentityProviderRequest
    ): Future[DescribeIdentityProviderResponse] = service.describeIdentityProvider(params).promise.toFuture
    def describeResourceServerFuture(params: DescribeResourceServerRequest): Future[DescribeResourceServerResponse] =
      service.describeResourceServer(params).promise.toFuture
    def describeRiskConfigurationFuture(
        params: DescribeRiskConfigurationRequest
    ): Future[DescribeRiskConfigurationResponse] = service.describeRiskConfiguration(params).promise.toFuture
    def describeUserImportJobFuture(params: DescribeUserImportJobRequest): Future[DescribeUserImportJobResponse] =
      service.describeUserImportJob(params).promise.toFuture
    def describeUserPoolClientFuture(params: DescribeUserPoolClientRequest): Future[DescribeUserPoolClientResponse] =
      service.describeUserPoolClient(params).promise.toFuture
    def describeUserPoolDomainFuture(params: DescribeUserPoolDomainRequest): Future[DescribeUserPoolDomainResponse] =
      service.describeUserPoolDomain(params).promise.toFuture
    def describeUserPoolFuture(params: DescribeUserPoolRequest): Future[DescribeUserPoolResponse] =
      service.describeUserPool(params).promise.toFuture
    def forgetDeviceFuture(params: ForgetDeviceRequest): Future[js.Object] =
      service.forgetDevice(params).promise.toFuture
    def forgotPasswordFuture(params: ForgotPasswordRequest): Future[ForgotPasswordResponse] =
      service.forgotPassword(params).promise.toFuture
    def getCSVHeaderFuture(params: GetCSVHeaderRequest): Future[GetCSVHeaderResponse] =
      service.getCSVHeader(params).promise.toFuture
    def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] =
      service.getDevice(params).promise.toFuture
    def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] = service.getGroup(params).promise.toFuture
    def getIdentityProviderByIdentifierFuture(
        params: GetIdentityProviderByIdentifierRequest
    ): Future[GetIdentityProviderByIdentifierResponse] =
      service.getIdentityProviderByIdentifier(params).promise.toFuture
    def getSigningCertificateFuture(params: GetSigningCertificateRequest): Future[GetSigningCertificateResponse] =
      service.getSigningCertificate(params).promise.toFuture
    def getUICustomizationFuture(params: GetUICustomizationRequest): Future[GetUICustomizationResponse] =
      service.getUICustomization(params).promise.toFuture
    def getUserAttributeVerificationCodeFuture(
        params: GetUserAttributeVerificationCodeRequest
    ): Future[GetUserAttributeVerificationCodeResponse] =
      service.getUserAttributeVerificationCode(params).promise.toFuture
    def getUserFuture(params: GetUserRequest): Future[GetUserResponse] = service.getUser(params).promise.toFuture
    def getUserPoolMfaConfigFuture(params: GetUserPoolMfaConfigRequest): Future[GetUserPoolMfaConfigResponse] =
      service.getUserPoolMfaConfig(params).promise.toFuture
    def globalSignOutFuture(params: GlobalSignOutRequest): Future[GlobalSignOutResponse] =
      service.globalSignOut(params).promise.toFuture
    def initiateAuthFuture(params: InitiateAuthRequest): Future[InitiateAuthResponse] =
      service.initiateAuth(params).promise.toFuture
    def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] =
      service.listDevices(params).promise.toFuture
    def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise.toFuture
    def listIdentityProvidersFuture(params: ListIdentityProvidersRequest): Future[ListIdentityProvidersResponse] =
      service.listIdentityProviders(params).promise.toFuture
    def listResourceServersFuture(params: ListResourceServersRequest): Future[ListResourceServersResponse] =
      service.listResourceServers(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listUserImportJobsFuture(params: ListUserImportJobsRequest): Future[ListUserImportJobsResponse] =
      service.listUserImportJobs(params).promise.toFuture
    def listUserPoolClientsFuture(params: ListUserPoolClientsRequest): Future[ListUserPoolClientsResponse] =
      service.listUserPoolClients(params).promise.toFuture
    def listUserPoolsFuture(params: ListUserPoolsRequest): Future[ListUserPoolsResponse] =
      service.listUserPools(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def listUsersInGroupFuture(params: ListUsersInGroupRequest): Future[ListUsersInGroupResponse] =
      service.listUsersInGroup(params).promise.toFuture
    def resendConfirmationCodeFuture(params: ResendConfirmationCodeRequest): Future[ResendConfirmationCodeResponse] =
      service.resendConfirmationCode(params).promise.toFuture
    def respondToAuthChallengeFuture(params: RespondToAuthChallengeRequest): Future[RespondToAuthChallengeResponse] =
      service.respondToAuthChallenge(params).promise.toFuture
    def setRiskConfigurationFuture(params: SetRiskConfigurationRequest): Future[SetRiskConfigurationResponse] =
      service.setRiskConfiguration(params).promise.toFuture
    def setUICustomizationFuture(params: SetUICustomizationRequest): Future[SetUICustomizationResponse] =
      service.setUICustomization(params).promise.toFuture
    def setUserMFAPreferenceFuture(params: SetUserMFAPreferenceRequest): Future[SetUserMFAPreferenceResponse] =
      service.setUserMFAPreference(params).promise.toFuture
    def setUserPoolMfaConfigFuture(params: SetUserPoolMfaConfigRequest): Future[SetUserPoolMfaConfigResponse] =
      service.setUserPoolMfaConfig(params).promise.toFuture
    def setUserSettingsFuture(params: SetUserSettingsRequest): Future[SetUserSettingsResponse] =
      service.setUserSettings(params).promise.toFuture
    def signUpFuture(params: SignUpRequest): Future[SignUpResponse] = service.signUp(params).promise.toFuture
    def startUserImportJobFuture(params: StartUserImportJobRequest): Future[StartUserImportJobResponse] =
      service.startUserImportJob(params).promise.toFuture
    def stopUserImportJobFuture(params: StopUserImportJobRequest): Future[StopUserImportJobResponse] =
      service.stopUserImportJob(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateAuthEventFeedbackFuture(params: UpdateAuthEventFeedbackRequest): Future[UpdateAuthEventFeedbackResponse] =
      service.updateAuthEventFeedback(params).promise.toFuture
    def updateDeviceStatusFuture(params: UpdateDeviceStatusRequest): Future[UpdateDeviceStatusResponse] =
      service.updateDeviceStatus(params).promise.toFuture
    def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] =
      service.updateGroup(params).promise.toFuture
    def updateIdentityProviderFuture(params: UpdateIdentityProviderRequest): Future[UpdateIdentityProviderResponse] =
      service.updateIdentityProvider(params).promise.toFuture
    def updateResourceServerFuture(params: UpdateResourceServerRequest): Future[UpdateResourceServerResponse] =
      service.updateResourceServer(params).promise.toFuture
    def updateUserAttributesFuture(params: UpdateUserAttributesRequest): Future[UpdateUserAttributesResponse] =
      service.updateUserAttributes(params).promise.toFuture
    def updateUserPoolClientFuture(params: UpdateUserPoolClientRequest): Future[UpdateUserPoolClientResponse] =
      service.updateUserPoolClient(params).promise.toFuture
    def updateUserPoolDomainFuture(params: UpdateUserPoolDomainRequest): Future[UpdateUserPoolDomainResponse] =
      service.updateUserPoolDomain(params).promise.toFuture
    def updateUserPoolFuture(params: UpdateUserPoolRequest): Future[UpdateUserPoolResponse] =
      service.updateUserPool(params).promise.toFuture
    def verifySoftwareTokenFuture(params: VerifySoftwareTokenRequest): Future[VerifySoftwareTokenResponse] =
      service.verifySoftwareToken(params).promise.toFuture
    def verifyUserAttributeFuture(params: VerifyUserAttributeRequest): Future[VerifyUserAttributeResponse] =
      service.verifyUserAttribute(params).promise.toFuture
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
    * Account takeover action type.
    */
  @js.native
  trait AccountTakeoverActionType extends js.Object {
    var EventAction: AccountTakeoverEventActionType
    var Notify: AccountTakeoverActionNotifyType
  }

  object AccountTakeoverActionType {
    def apply(
        EventAction: AccountTakeoverEventActionType,
        Notify: AccountTakeoverActionNotifyType
    ): AccountTakeoverActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventAction" -> EventAction.asInstanceOf[js.Any],
        "Notify"      -> Notify.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountTakeoverActionType]
    }
  }

  /**
    * Account takeover actions type.
    */
  @js.native
  trait AccountTakeoverActionsType extends js.Object {
    var HighAction: js.UndefOr[AccountTakeoverActionType]
    var LowAction: js.UndefOr[AccountTakeoverActionType]
    var MediumAction: js.UndefOr[AccountTakeoverActionType]
  }

  object AccountTakeoverActionsType {
    def apply(
        HighAction: js.UndefOr[AccountTakeoverActionType] = js.undefined,
        LowAction: js.UndefOr[AccountTakeoverActionType] = js.undefined,
        MediumAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
    ): AccountTakeoverActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HighAction" -> HighAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LowAction" -> LowAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediumAction" -> MediumAction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountTakeoverActionsType]
    }
  }

  object AccountTakeoverEventActionTypeEnum {
    val BLOCK             = "BLOCK"
    val MFA_IF_CONFIGURED = "MFA_IF_CONFIGURED"
    val MFA_REQUIRED      = "MFA_REQUIRED"
    val NO_ACTION         = "NO_ACTION"

    val values = IndexedSeq(BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION)
  }

  /**
    * Configuration for mitigation actions and notification for different levels of risk detected for a potential account takeover.
    */
  @js.native
  trait AccountTakeoverRiskConfigurationType extends js.Object {
    var Actions: AccountTakeoverActionsType
    var NotifyConfiguration: js.UndefOr[NotifyConfigurationType]
  }

  object AccountTakeoverRiskConfigurationType {
    def apply(
        Actions: AccountTakeoverActionsType,
        NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.undefined
    ): AccountTakeoverRiskConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "NotifyConfiguration" -> NotifyConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountTakeoverRiskConfigurationType]
    }
  }

  /**
    * Represents the request to add custom attributes.
    */
  @js.native
  trait AddCustomAttributesRequest extends js.Object {
    var CustomAttributes: CustomAttributesListType
    var UserPoolId: UserPoolIdType
  }

  object AddCustomAttributesRequest {
    def apply(
        CustomAttributes: CustomAttributesListType,
        UserPoolId: UserPoolIdType
    ): AddCustomAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomAttributes" -> CustomAttributes.asInstanceOf[js.Any],
        "UserPoolId"       -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCustomAttributesRequest]
    }
  }

  /**
    * Represents the response from the server for the request to add custom attributes.
    */
  @js.native
  trait AddCustomAttributesResponse extends js.Object {}

  object AddCustomAttributesResponse {
    def apply(
        ): AddCustomAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCustomAttributesResponse]
    }
  }

  @js.native
  trait AdminAddUserToGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminAddUserToGroupRequest {
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminAddUserToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminAddUserToGroupRequest]
    }
  }

  /**
    * Represents the request to confirm user registration.
    */
  @js.native
  trait AdminConfirmSignUpRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminConfirmSignUpRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminConfirmSignUpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminConfirmSignUpRequest]
    }
  }

  /**
    * Represents the response from the server for the request to confirm registration.
    */
  @js.native
  trait AdminConfirmSignUpResponse extends js.Object {}

  object AdminConfirmSignUpResponse {
    def apply(
        ): AdminConfirmSignUpResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminConfirmSignUpResponse]
    }
  }

  /**
    * The configuration for creating a new user profile.
    */
  @js.native
  trait AdminCreateUserConfigType extends js.Object {
    var AllowAdminCreateUserOnly: js.UndefOr[BooleanType]
    var InviteMessageTemplate: js.UndefOr[MessageTemplateType]
    var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType]
  }

  object AdminCreateUserConfigType {
    def apply(
        AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined,
        InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.undefined,
        UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined
    ): AdminCreateUserConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowAdminCreateUserOnly" -> AllowAdminCreateUserOnly.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InviteMessageTemplate" -> InviteMessageTemplate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnusedAccountValidityDays" -> UnusedAccountValidityDays.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminCreateUserConfigType]
    }
  }

  /**
    * Represents the request to create a user in the specified user pool.
    */
  @js.native
  trait AdminCreateUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType]
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation]
    var MessageAction: js.UndefOr[MessageActionType]
    var TemporaryPassword: js.UndefOr[PasswordType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var ValidationData: js.UndefOr[AttributeListType]
  }

  object AdminCreateUserRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.undefined,
        ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
        MessageAction: js.UndefOr[MessageActionType] = js.undefined,
        TemporaryPassword: js.UndefOr[PasswordType] = js.undefined,
        UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
        ValidationData: js.UndefOr[AttributeListType] = js.undefined
    ): AdminCreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any],
        "DesiredDeliveryMediums" -> DesiredDeliveryMediums.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ForceAliasCreation" -> ForceAliasCreation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageAction" -> MessageAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemporaryPassword" -> TemporaryPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserAttributes" -> UserAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidationData" -> ValidationData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminCreateUserRequest]
    }
  }

  /**
    * Represents the response from the server to the request to create the user.
    */
  @js.native
  trait AdminCreateUserResponse extends js.Object {
    var User: js.UndefOr[UserType]
  }

  object AdminCreateUserResponse {
    def apply(
        User: js.UndefOr[UserType] = js.undefined
    ): AdminCreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminCreateUserResponse]
    }
  }

  /**
    * Represents the request to delete user attributes as an administrator.
    */
  @js.native
  trait AdminDeleteUserAttributesRequest extends js.Object {
    var UserAttributeNames: AttributeNameListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminDeleteUserAttributesRequest {
    def apply(
        UserAttributeNames: AttributeNameListType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminDeleteUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserAttributeNames" -> UserAttributeNames.asInstanceOf[js.Any],
        "UserPoolId"         -> UserPoolId.asInstanceOf[js.Any],
        "Username"           -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDeleteUserAttributesRequest]
    }
  }

  /**
    * Represents the response received from the server for a request to delete user attributes.
    */
  @js.native
  trait AdminDeleteUserAttributesResponse extends js.Object {}

  object AdminDeleteUserAttributesResponse {
    def apply(
        ): AdminDeleteUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDeleteUserAttributesResponse]
    }
  }

  /**
    * Represents the request to delete a user as an administrator.
    */
  @js.native
  trait AdminDeleteUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminDeleteUserRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminDeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDeleteUserRequest]
    }
  }

  @js.native
  trait AdminDisableProviderForUserRequest extends js.Object {
    var User: ProviderUserIdentifierType
    var UserPoolId: StringType
  }

  object AdminDisableProviderForUserRequest {
    def apply(
        User: ProviderUserIdentifierType,
        UserPoolId: StringType
    ): AdminDisableProviderForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User"       -> User.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableProviderForUserRequest]
    }
  }

  @js.native
  trait AdminDisableProviderForUserResponse extends js.Object {}

  object AdminDisableProviderForUserResponse {
    def apply(
        ): AdminDisableProviderForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableProviderForUserResponse]
    }
  }

  /**
    * Represents the request to disable any user as an administrator.
    */
  @js.native
  trait AdminDisableUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminDisableUserRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminDisableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableUserRequest]
    }
  }

  /**
    * Represents the response received from the server to disable the user as an administrator.
    */
  @js.native
  trait AdminDisableUserResponse extends js.Object {}

  object AdminDisableUserResponse {
    def apply(
        ): AdminDisableUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableUserResponse]
    }
  }

  /**
    * Represents the request that enables the user as an administrator.
    */
  @js.native
  trait AdminEnableUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminEnableUserRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminEnableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminEnableUserRequest]
    }
  }

  /**
    * Represents the response from the server for the request to enable a user as an administrator.
    */
  @js.native
  trait AdminEnableUserResponse extends js.Object {}

  object AdminEnableUserResponse {
    def apply(
        ): AdminEnableUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminEnableUserResponse]
    }
  }

  /**
    * Sends the forgot device request, as an administrator.
    */
  @js.native
  trait AdminForgetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminForgetDeviceRequest {
    def apply(
        DeviceKey: DeviceKeyType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminForgetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey"  -> DeviceKey.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminForgetDeviceRequest]
    }
  }

  /**
    * Represents the request to get the device, as an administrator.
    */
  @js.native
  trait AdminGetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminGetDeviceRequest {
    def apply(
        DeviceKey: DeviceKeyType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminGetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey"  -> DeviceKey.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetDeviceRequest]
    }
  }

  /**
    * Gets the device response, as an administrator.
    */
  @js.native
  trait AdminGetDeviceResponse extends js.Object {
    var Device: DeviceType
  }

  object AdminGetDeviceResponse {
    def apply(
        Device: DeviceType
    ): AdminGetDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetDeviceResponse]
    }
  }

  /**
    * Represents the request to get the specified user as an administrator.
    */
  @js.native
  trait AdminGetUserRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminGetUserRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminGetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetUserRequest]
    }
  }

  /**
    * Represents the response from the server from the request to get the specified user as an administrator.
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MFAOptions" -> MFAOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMfaSetting" -> PreferredMfaSetting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserAttributes" -> UserAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserCreateDate" -> UserCreateDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserLastModifiedDate" -> UserLastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserMFASettingList" -> UserMFASettingList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserStatus" -> UserStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetUserResponse]
    }
  }

  /**
    * Initiates the authorization request, as an administrator.
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
    def apply(
        AuthFlow: AuthFlowType,
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        AuthParameters: js.UndefOr[AuthParametersType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        ContextData: js.UndefOr[ContextDataType] = js.undefined
    ): AdminInitiateAuthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthFlow"   -> AuthFlow.asInstanceOf[js.Any],
        "ClientId"   -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AuthParameters" -> AuthParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientMetadata" -> ClientMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContextData" -> ContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminInitiateAuthRequest]
    }
  }

  /**
    * Initiates the authentication response, as an administrator.
    */
  @js.native
  trait AdminInitiateAuthResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object AdminInitiateAuthResponse {
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AdminInitiateAuthResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationResult" -> AuthenticationResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeName" -> ChallengeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeParameters" -> ChallengeParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminInitiateAuthResponse]
    }
  }

  @js.native
  trait AdminLinkProviderForUserRequest extends js.Object {
    var DestinationUser: ProviderUserIdentifierType
    var SourceUser: ProviderUserIdentifierType
    var UserPoolId: StringType
  }

  object AdminLinkProviderForUserRequest {
    def apply(
        DestinationUser: ProviderUserIdentifierType,
        SourceUser: ProviderUserIdentifierType,
        UserPoolId: StringType
    ): AdminLinkProviderForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationUser" -> DestinationUser.asInstanceOf[js.Any],
        "SourceUser"      -> SourceUser.asInstanceOf[js.Any],
        "UserPoolId"      -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminLinkProviderForUserRequest]
    }
  }

  @js.native
  trait AdminLinkProviderForUserResponse extends js.Object {}

  object AdminLinkProviderForUserResponse {
    def apply(
        ): AdminLinkProviderForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminLinkProviderForUserResponse]
    }
  }

  /**
    * Represents the request to list devices, as an administrator.
    */
  @js.native
  trait AdminListDevicesRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object AdminListDevicesRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): AdminListDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListDevicesRequest]
    }
  }

  /**
    * Lists the device's response, as an administrator.
    */
  @js.native
  trait AdminListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object AdminListDevicesResponse {
    def apply(
        Devices: js.UndefOr[DeviceListType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): AdminListDevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Devices" -> Devices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListDevicesResponse]
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
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListGroupsForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListGroupsForUserRequest]
    }
  }

  @js.native
  trait AdminListGroupsForUserResponse extends js.Object {
    var Groups: js.UndefOr[GroupListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListGroupsForUserResponse {
    def apply(
        Groups: js.UndefOr[GroupListType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListGroupsForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListGroupsForUserResponse]
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
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        MaxResults: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListUserAuthEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListUserAuthEventsRequest]
    }
  }

  @js.native
  trait AdminListUserAuthEventsResponse extends js.Object {
    var AuthEvents: js.UndefOr[AuthEventsType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListUserAuthEventsResponse {
    def apply(
        AuthEvents: js.UndefOr[AuthEventsType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): AdminListUserAuthEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthEvents" -> AuthEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListUserAuthEventsResponse]
    }
  }

  @js.native
  trait AdminRemoveUserFromGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminRemoveUserFromGroupRequest {
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminRemoveUserFromGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminRemoveUserFromGroupRequest]
    }
  }

  /**
    * Represents the request to reset a user's password as an administrator.
    */
  @js.native
  trait AdminResetUserPasswordRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminResetUserPasswordRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminResetUserPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminResetUserPasswordRequest]
    }
  }

  /**
    * Represents the response from the server to reset a user password as an administrator.
    */
  @js.native
  trait AdminResetUserPasswordResponse extends js.Object {}

  object AdminResetUserPasswordResponse {
    def apply(
        ): AdminResetUserPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminResetUserPasswordResponse]
    }
  }

  /**
    * The request to respond to the authentication challenge, as an administrator.
    */
  @js.native
  trait AdminRespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: ChallengeNameType
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var ContextData: js.UndefOr[ContextDataType]
    var Session: js.UndefOr[SessionType]
  }

  object AdminRespondToAuthChallengeRequest {
    def apply(
        ChallengeName: ChallengeNameType,
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined,
        ContextData: js.UndefOr[ContextDataType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AdminRespondToAuthChallengeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.asInstanceOf[js.Any],
        "ClientId"      -> ClientId.asInstanceOf[js.Any],
        "UserPoolId"    -> UserPoolId.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeResponses" -> ChallengeResponses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContextData" -> ContextData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminRespondToAuthChallengeRequest]
    }
  }

  /**
    * Responds to the authentication challenge, as an administrator.
    */
  @js.native
  trait AdminRespondToAuthChallengeResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object AdminRespondToAuthChallengeResponse {
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AdminRespondToAuthChallengeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationResult" -> AuthenticationResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeName" -> ChallengeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeParameters" -> ChallengeParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminRespondToAuthChallengeResponse]
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
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined,
        SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
    ): AdminSetUserMFAPreferenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any],
        "SMSMfaSettings" -> SMSMfaSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftwareTokenMfaSettings" -> SoftwareTokenMfaSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserMFAPreferenceRequest]
    }
  }

  @js.native
  trait AdminSetUserMFAPreferenceResponse extends js.Object {}

  object AdminSetUserMFAPreferenceResponse {
    def apply(
        ): AdminSetUserMFAPreferenceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserMFAPreferenceResponse]
    }
  }

  /**
    * Represents the request to set user settings as an administrator.
    */
  @js.native
  trait AdminSetUserSettingsRequest extends js.Object {
    var MFAOptions: MFAOptionListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminSetUserSettingsRequest {
    def apply(
        MFAOptions: MFAOptionListType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminSetUserSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MFAOptions" -> MFAOptions.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserSettingsRequest]
    }
  }

  /**
    * Represents the response from the server to set user settings as an administrator.
    */
  @js.native
  trait AdminSetUserSettingsResponse extends js.Object {}

  object AdminSetUserSettingsResponse {
    def apply(
        ): AdminSetUserSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserSettingsResponse]
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
    def apply(
        EventId: EventIdType,
        FeedbackValue: FeedbackValueType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminUpdateAuthEventFeedbackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventId"       -> EventId.asInstanceOf[js.Any],
        "FeedbackValue" -> FeedbackValue.asInstanceOf[js.Any],
        "UserPoolId"    -> UserPoolId.asInstanceOf[js.Any],
        "Username"      -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateAuthEventFeedbackRequest]
    }
  }

  @js.native
  trait AdminUpdateAuthEventFeedbackResponse extends js.Object {}

  object AdminUpdateAuthEventFeedbackResponse {
    def apply(
        ): AdminUpdateAuthEventFeedbackResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateAuthEventFeedbackResponse]
    }
  }

  /**
    * The request to update the device status, as an administrator.
    */
  @js.native
  trait AdminUpdateDeviceStatusRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  object AdminUpdateDeviceStatusRequest {
    def apply(
        DeviceKey: DeviceKeyType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType,
        DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
    ): AdminUpdateDeviceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey"  -> DeviceKey.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any],
        "DeviceRememberedStatus" -> DeviceRememberedStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateDeviceStatusRequest]
    }
  }

  /**
    * The status response from the request to update the device, as an administrator.
    */
  @js.native
  trait AdminUpdateDeviceStatusResponse extends js.Object {}

  object AdminUpdateDeviceStatusResponse {
    def apply(
        ): AdminUpdateDeviceStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateDeviceStatusResponse]
    }
  }

  /**
    * Represents the request to update the user's attributes as an administrator.
    */
  @js.native
  trait AdminUpdateUserAttributesRequest extends js.Object {
    var UserAttributes: AttributeListType
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminUpdateUserAttributesRequest {
    def apply(
        UserAttributes: AttributeListType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminUpdateUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserAttributes" -> UserAttributes.asInstanceOf[js.Any],
        "UserPoolId"     -> UserPoolId.asInstanceOf[js.Any],
        "Username"       -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateUserAttributesRequest]
    }
  }

  /**
    * Represents the response from the server for the request to update user attributes as an administrator.
    */
  @js.native
  trait AdminUpdateUserAttributesResponse extends js.Object {}

  object AdminUpdateUserAttributesResponse {
    def apply(
        ): AdminUpdateUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateUserAttributesResponse]
    }
  }

  /**
    * The request to sign out of all devices, as an administrator.
    */
  @js.native
  trait AdminUserGlobalSignOutRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Username: UsernameType
  }

  object AdminUserGlobalSignOutRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): AdminUserGlobalSignOutRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Username"   -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUserGlobalSignOutRequest]
    }
  }

  /**
    * The global sign-out response, as an administrator.
    */
  @js.native
  trait AdminUserGlobalSignOutResponse extends js.Object {}

  object AdminUserGlobalSignOutResponse {
    def apply(
        ): AdminUserGlobalSignOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUserGlobalSignOutResponse]
    }
  }

  object AdvancedSecurityModeTypeEnum {
    val OFF      = "OFF"
    val AUDIT    = "AUDIT"
    val ENFORCED = "ENFORCED"

    val values = IndexedSeq(OFF, AUDIT, ENFORCED)
  }

  object AliasAttributeTypeEnum {
    val phone_number       = "phone_number"
    val email              = "email"
    val preferred_username = "preferred_username"

    val values = IndexedSeq(phone_number, email, preferred_username)
  }

  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for a user pool.
    */
  @js.native
  trait AnalyticsConfigurationType extends js.Object {
    var ApplicationId: HexStringType
    var ExternalId: StringType
    var RoleArn: ArnType
    var UserDataShared: js.UndefOr[BooleanType]
  }

  object AnalyticsConfigurationType {
    def apply(
        ApplicationId: HexStringType,
        ExternalId: StringType,
        RoleArn: ArnType,
        UserDataShared: js.UndefOr[BooleanType] = js.undefined
    ): AnalyticsConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ExternalId"    -> ExternalId.asInstanceOf[js.Any],
        "RoleArn"       -> RoleArn.asInstanceOf[js.Any],
        "UserDataShared" -> UserDataShared.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsConfigurationType]
    }
  }

  /**
    * An Amazon Pinpoint analytics endpoint.
    *  An endpoint uniquely identifies a mobile device, email address, or phone number that can receive messages from Amazon Pinpoint analytics.
    */
  @js.native
  trait AnalyticsMetadataType extends js.Object {
    var AnalyticsEndpointId: js.UndefOr[StringType]
  }

  object AnalyticsMetadataType {
    def apply(
        AnalyticsEndpointId: js.UndefOr[StringType] = js.undefined
    ): AnalyticsMetadataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnalyticsEndpointId" -> AnalyticsEndpointId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsMetadataType]
    }
  }

  @js.native
  trait AssociateSoftwareTokenRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var Session: js.UndefOr[SessionType]
  }

  object AssociateSoftwareTokenRequest {
    def apply(
        AccessToken: js.UndefOr[TokenModelType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AssociateSoftwareTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSoftwareTokenRequest]
    }
  }

  @js.native
  trait AssociateSoftwareTokenResponse extends js.Object {
    var SecretCode: js.UndefOr[SecretCodeType]
    var Session: js.UndefOr[SessionType]
  }

  object AssociateSoftwareTokenResponse {
    def apply(
        SecretCode: js.UndefOr[SecretCodeType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): AssociateSoftwareTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretCode" -> SecretCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSoftwareTokenResponse]
    }
  }

  object AttributeDataTypeEnum {
    val String   = "String"
    val Number   = "Number"
    val DateTime = "DateTime"
    val Boolean  = "Boolean"

    val values = IndexedSeq(String, Number, DateTime, Boolean)
  }

  /**
    * Specifies whether the attribute is standard or custom.
    */
  @js.native
  trait AttributeType extends js.Object {
    var Name: AttributeNameType
    var Value: js.UndefOr[AttributeValueType]
  }

  object AttributeType {
    def apply(
        Name: AttributeNameType,
        Value: js.UndefOr[AttributeValueType] = js.undefined
    ): AttributeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeType]
    }
  }

  /**
    * The authentication event type.
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeResponses" -> ChallengeResponses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventContextData" -> EventContextData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventFeedback" -> EventFeedback.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventId" -> EventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventResponse" -> EventResponse.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventRisk" -> EventRisk.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventType" -> EventType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthEventType]
    }
  }

  object AuthFlowTypeEnum {
    val USER_SRP_AUTH      = "USER_SRP_AUTH"
    val REFRESH_TOKEN_AUTH = "REFRESH_TOKEN_AUTH"
    val REFRESH_TOKEN      = "REFRESH_TOKEN"
    val CUSTOM_AUTH        = "CUSTOM_AUTH"
    val ADMIN_NO_SRP_AUTH  = "ADMIN_NO_SRP_AUTH"
    val USER_PASSWORD_AUTH = "USER_PASSWORD_AUTH"

    val values =
      IndexedSeq(USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN, CUSTOM_AUTH, ADMIN_NO_SRP_AUTH, USER_PASSWORD_AUTH)
  }

  /**
    * The authentication result.
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
    def apply(
        AccessToken: js.UndefOr[TokenModelType] = js.undefined,
        ExpiresIn: js.UndefOr[IntegerType] = js.undefined,
        IdToken: js.UndefOr[TokenModelType] = js.undefined,
        NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.undefined,
        RefreshToken: js.UndefOr[TokenModelType] = js.undefined,
        TokenType: js.UndefOr[StringType] = js.undefined
    ): AuthenticationResultType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpiresIn" -> ExpiresIn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdToken" -> IdToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewDeviceMetadata" -> NewDeviceMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RefreshToken" -> RefreshToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenType" -> TokenType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthenticationResultType]
    }
  }

  object ChallengeNameEnum {
    val Password = "Password"
    val Mfa      = "Mfa"

    val values = IndexedSeq(Password, Mfa)
  }

  object ChallengeNameTypeEnum {
    val SMS_MFA                  = "SMS_MFA"
    val SOFTWARE_TOKEN_MFA       = "SOFTWARE_TOKEN_MFA"
    val SELECT_MFA_TYPE          = "SELECT_MFA_TYPE"
    val MFA_SETUP                = "MFA_SETUP"
    val PASSWORD_VERIFIER        = "PASSWORD_VERIFIER"
    val CUSTOM_CHALLENGE         = "CUSTOM_CHALLENGE"
    val DEVICE_SRP_AUTH          = "DEVICE_SRP_AUTH"
    val DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER"
    val ADMIN_NO_SRP_AUTH        = "ADMIN_NO_SRP_AUTH"
    val NEW_PASSWORD_REQUIRED    = "NEW_PASSWORD_REQUIRED"

    val values = IndexedSeq(
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
  }

  object ChallengeResponseEnum {
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Success, Failure)
  }

  /**
    * The challenge response type.
    */
  @js.native
  trait ChallengeResponseType extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeName]
    var ChallengeResponse: js.UndefOr[ChallengeResponse]
  }

  object ChallengeResponseType {
    def apply(
        ChallengeName: js.UndefOr[ChallengeName] = js.undefined,
        ChallengeResponse: js.UndefOr[ChallengeResponse] = js.undefined
    ): ChallengeResponseType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeResponse" -> ChallengeResponse.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChallengeResponseType]
    }
  }

  /**
    * Represents the request to change a user password.
    */
  @js.native
  trait ChangePasswordRequest extends js.Object {
    var AccessToken: TokenModelType
    var PreviousPassword: PasswordType
    var ProposedPassword: PasswordType
  }

  object ChangePasswordRequest {
    def apply(
        AccessToken: TokenModelType,
        PreviousPassword: PasswordType,
        ProposedPassword: PasswordType
    ): ChangePasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken"      -> AccessToken.asInstanceOf[js.Any],
        "PreviousPassword" -> PreviousPassword.asInstanceOf[js.Any],
        "ProposedPassword" -> ProposedPassword.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangePasswordRequest]
    }
  }

  /**
    * The response from the server to the change password request.
    */
  @js.native
  trait ChangePasswordResponse extends js.Object {}

  object ChangePasswordResponse {
    def apply(
        ): ChangePasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangePasswordResponse]
    }
  }

  /**
    * The code delivery details being returned from the server.
    */
  @js.native
  trait CodeDeliveryDetailsType extends js.Object {
    var AttributeName: js.UndefOr[AttributeNameType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
    var Destination: js.UndefOr[StringType]
  }

  object CodeDeliveryDetailsType {
    def apply(
        AttributeName: js.UndefOr[AttributeNameType] = js.undefined,
        DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined,
        Destination: js.UndefOr[StringType] = js.undefined
    ): CodeDeliveryDetailsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeliveryMedium" -> DeliveryMedium.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destination" -> Destination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeDeliveryDetailsType]
    }
  }

  /**
    * The compromised credentials actions type
    */
  @js.native
  trait CompromisedCredentialsActionsType extends js.Object {
    var EventAction: CompromisedCredentialsEventActionType
  }

  object CompromisedCredentialsActionsType {
    def apply(
        EventAction: CompromisedCredentialsEventActionType
    ): CompromisedCredentialsActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventAction" -> EventAction.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompromisedCredentialsActionsType]
    }
  }

  object CompromisedCredentialsEventActionTypeEnum {
    val BLOCK     = "BLOCK"
    val NO_ACTION = "NO_ACTION"

    val values = IndexedSeq(BLOCK, NO_ACTION)
  }

  /**
    * The compromised credentials risk configuration type.
    */
  @js.native
  trait CompromisedCredentialsRiskConfigurationType extends js.Object {
    var Actions: CompromisedCredentialsActionsType
    var EventFilter: js.UndefOr[EventFiltersType]
  }

  object CompromisedCredentialsRiskConfigurationType {
    def apply(
        Actions: CompromisedCredentialsActionsType,
        EventFilter: js.UndefOr[EventFiltersType] = js.undefined
    ): CompromisedCredentialsRiskConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "EventFilter" -> EventFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CompromisedCredentialsRiskConfigurationType]
    }
  }

  /**
    * Confirms the device request.
    */
  @js.native
  trait ConfirmDeviceRequest extends js.Object {
    var AccessToken: TokenModelType
    var DeviceKey: DeviceKeyType
    var DeviceName: js.UndefOr[DeviceNameType]
    var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType]
  }

  object ConfirmDeviceRequest {
    def apply(
        AccessToken: TokenModelType,
        DeviceKey: DeviceKeyType,
        DeviceName: js.UndefOr[DeviceNameType] = js.undefined,
        DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.undefined
    ): ConfirmDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "DeviceKey"   -> DeviceKey.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceSecretVerifierConfig" -> DeviceSecretVerifierConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmDeviceRequest]
    }
  }

  /**
    * Confirms the device response.
    */
  @js.native
  trait ConfirmDeviceResponse extends js.Object {
    var UserConfirmationNecessary: js.UndefOr[BooleanType]
  }

  object ConfirmDeviceResponse {
    def apply(
        UserConfirmationNecessary: js.UndefOr[BooleanType] = js.undefined
    ): ConfirmDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserConfirmationNecessary" -> UserConfirmationNecessary.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmDeviceResponse]
    }
  }

  /**
    * The request representing the confirmation for a password reset.
    */
  @js.native
  trait ConfirmForgotPasswordRequest extends js.Object {
    var ClientId: ClientIdType
    var ConfirmationCode: ConfirmationCodeType
    var Password: PasswordType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ConfirmForgotPasswordRequest {
    def apply(
        ClientId: ClientIdType,
        ConfirmationCode: ConfirmationCodeType,
        Password: PasswordType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ConfirmForgotPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId"         -> ClientId.asInstanceOf[js.Any],
        "ConfirmationCode" -> ConfirmationCode.asInstanceOf[js.Any],
        "Password"         -> Password.asInstanceOf[js.Any],
        "Username"         -> Username.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretHash" -> SecretHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmForgotPasswordRequest]
    }
  }

  /**
    * The response from the server that results from a user's request to retrieve a forgotten password.
    */
  @js.native
  trait ConfirmForgotPasswordResponse extends js.Object {}

  object ConfirmForgotPasswordResponse {
    def apply(
        ): ConfirmForgotPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmForgotPasswordResponse]
    }
  }

  /**
    * Represents the request to confirm registration of a user.
    */
  @js.native
  trait ConfirmSignUpRequest extends js.Object {
    var ClientId: ClientIdType
    var ConfirmationCode: ConfirmationCodeType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ConfirmSignUpRequest {
    def apply(
        ClientId: ClientIdType,
        ConfirmationCode: ConfirmationCodeType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ConfirmSignUpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId"         -> ClientId.asInstanceOf[js.Any],
        "ConfirmationCode" -> ConfirmationCode.asInstanceOf[js.Any],
        "Username"         -> Username.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ForceAliasCreation" -> ForceAliasCreation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretHash" -> SecretHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSignUpRequest]
    }
  }

  /**
    * Represents the response from the server for the registration confirmation.
    */
  @js.native
  trait ConfirmSignUpResponse extends js.Object {}

  object ConfirmSignUpResponse {
    def apply(
        ): ConfirmSignUpResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSignUpResponse]
    }
  }

  /**
    * Contextual user data type used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
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
    def apply(
        HttpHeaders: HttpHeaderList,
        IpAddress: StringType,
        ServerName: StringType,
        ServerPath: StringType,
        EncodedData: js.UndefOr[StringType] = js.undefined
    ): ContextDataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HttpHeaders" -> HttpHeaders.asInstanceOf[js.Any],
        "IpAddress"   -> IpAddress.asInstanceOf[js.Any],
        "ServerName"  -> ServerName.asInstanceOf[js.Any],
        "ServerPath"  -> ServerPath.asInstanceOf[js.Any],
        "EncodedData" -> EncodedData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContextDataType]
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
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        Precedence: js.UndefOr[PrecedenceType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined
    ): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Precedence" -> Precedence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object CreateGroupResponse {
    def apply(
        Group: js.UndefOr[GroupType] = js.undefined
    ): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
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
    def apply(
        ProviderDetails: ProviderDetailsType,
        ProviderName: ProviderNameTypeV1,
        ProviderType: IdentityProviderTypeType,
        UserPoolId: UserPoolIdType,
        AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
        IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
    ): CreateIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderDetails" -> ProviderDetails.asInstanceOf[js.Any],
        "ProviderName"    -> ProviderName.asInstanceOf[js.Any],
        "ProviderType"    -> ProviderType.asInstanceOf[js.Any],
        "UserPoolId"      -> UserPoolId.asInstanceOf[js.Any],
        "AttributeMapping" -> AttributeMapping.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdpIdentifiers" -> IdpIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityProviderRequest]
    }
  }

  @js.native
  trait CreateIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object CreateIdentityProviderResponse {
    def apply(
        IdentityProvider: IdentityProviderType
    ): CreateIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityProviderResponse]
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
    def apply(
        Identifier: ResourceServerIdentifierType,
        Name: ResourceServerNameType,
        UserPoolId: UserPoolIdType,
        Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    ): CreateResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Scopes" -> Scopes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceServerRequest]
    }
  }

  @js.native
  trait CreateResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  object CreateResourceServerResponse {
    def apply(
        ResourceServer: ResourceServerType
    ): CreateResourceServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServer" -> ResourceServer.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceServerResponse]
    }
  }

  /**
    * Represents the request to create the user import job.
    */
  @js.native
  trait CreateUserImportJobRequest extends js.Object {
    var CloudWatchLogsRoleArn: ArnType
    var JobName: UserImportJobNameType
    var UserPoolId: UserPoolIdType
  }

  object CreateUserImportJobRequest {
    def apply(
        CloudWatchLogsRoleArn: ArnType,
        JobName: UserImportJobNameType,
        UserPoolId: UserPoolIdType
    ): CreateUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.asInstanceOf[js.Any],
        "JobName"               -> JobName.asInstanceOf[js.Any],
        "UserPoolId"            -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserImportJobRequest]
    }
  }

  /**
    * Represents the response from the server to the request to create the user import job.
    */
  @js.native
  trait CreateUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object CreateUserImportJobResponse {
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): CreateUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserImportJobResponse]
    }
  }

  /**
    * Represents the request to create a user pool client.
    */
  @js.native
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
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  object CreateUserPoolClientRequest {
    def apply(
        ClientName: ClientNameType,
        UserPoolId: UserPoolIdType,
        AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
        AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
        AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
        CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
        DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
        ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
        GenerateSecret: js.UndefOr[GenerateSecret] = js.undefined,
        LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined,
        ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
        RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
        SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
        WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    ): CreateUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientName" -> ClientName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "AllowedOAuthFlows" -> AllowedOAuthFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowedOAuthFlowsUserPoolClient" -> AllowedOAuthFlowsUserPoolClient.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowedOAuthScopes" -> AllowedOAuthScopes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CallbackURLs" -> CallbackURLs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRedirectURI" -> DefaultRedirectURI.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExplicitAuthFlows" -> ExplicitAuthFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GenerateSecret" -> GenerateSecret.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogoutURLs" -> LogoutURLs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadAttributes" -> ReadAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RefreshTokenValidity" -> RefreshTokenValidity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedIdentityProviders" -> SupportedIdentityProviders.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WriteAttributes" -> WriteAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolClientRequest]
    }
  }

  /**
    * Represents the response from the server to create a user pool client.
    */
  @js.native
  trait CreateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object CreateUserPoolClientResponse {
    def apply(
        UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
    ): CreateUserPoolClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClient" -> UserPoolClient.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolClientResponse]
    }
  }

  @js.native
  trait CreateUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType]
  }

  object CreateUserPoolDomainRequest {
    def apply(
        Domain: DomainType,
        UserPoolId: UserPoolIdType,
        CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
    ): CreateUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain"     -> Domain.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "CustomDomainConfig" -> CustomDomainConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolDomainRequest]
    }
  }

  @js.native
  trait CreateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  object CreateUserPoolDomainResponse {
    def apply(
        CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
    ): CreateUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontDomain" -> CloudFrontDomain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolDomainResponse]
    }
  }

  /**
    * Represents the request to create a user pool.
    */
  @js.native
  trait CreateUserPoolRequest extends js.Object {
    var PoolName: UserPoolNameType
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
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object CreateUserPoolRequest {
    def apply(
        PoolName: UserPoolNameType,
        AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
        AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined,
        AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
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
        UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
        UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
        UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined,
        VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
    ): CreateUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolName" -> PoolName.asInstanceOf[js.Any],
        "AdminCreateUserConfig" -> AdminCreateUserConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AliasAttributes" -> AliasAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoVerifiedAttributes" -> AutoVerifiedAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceConfiguration" -> DeviceConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailConfiguration" -> EmailConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailVerificationMessage" -> EmailVerificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailVerificationSubject" -> EmailVerificationSubject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaConfig" -> LambdaConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MfaConfiguration" -> MfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policies" -> Policies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schema" -> Schema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsConfiguration" -> SmsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsVerificationMessage" -> SmsVerificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolAddOns" -> UserPoolAddOns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolTags" -> UserPoolTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsernameAttributes" -> UsernameAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerificationMessageTemplate" -> VerificationMessageTemplate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolRequest]
    }
  }

  /**
    * Represents the response from the server for the request to create a user pool.
    */
  @js.native
  trait CreateUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  object CreateUserPoolResponse {
    def apply(
        UserPool: js.UndefOr[UserPoolType] = js.undefined
    ): CreateUserPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPool" -> UserPool.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolResponse]
    }
  }

  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  @js.native
  trait CustomDomainConfigType extends js.Object {
    var CertificateArn: ArnType
  }

  object CustomDomainConfigType {
    def apply(
        CertificateArn: ArnType
    ): CustomDomainConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomDomainConfigType]
    }
  }

  object DefaultEmailOptionTypeEnum {
    val CONFIRM_WITH_LINK = "CONFIRM_WITH_LINK"
    val CONFIRM_WITH_CODE = "CONFIRM_WITH_CODE"

    val values = IndexedSeq(CONFIRM_WITH_LINK, CONFIRM_WITH_CODE)
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
  }

  object DeleteGroupRequest {
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType
    ): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
  }

  object DeleteIdentityProviderRequest {
    def apply(
        ProviderName: ProviderNameType,
        UserPoolId: UserPoolIdType
    ): DeleteIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "UserPoolId"   -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityProviderRequest]
    }
  }

  @js.native
  trait DeleteResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var UserPoolId: UserPoolIdType
  }

  object DeleteResourceServerRequest {
    def apply(
        Identifier: ResourceServerIdentifierType,
        UserPoolId: UserPoolIdType
    ): DeleteResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceServerRequest]
    }
  }

  /**
    * Represents the request to delete user attributes.
    */
  @js.native
  trait DeleteUserAttributesRequest extends js.Object {
    var AccessToken: TokenModelType
    var UserAttributeNames: AttributeNameListType
  }

  object DeleteUserAttributesRequest {
    def apply(
        AccessToken: TokenModelType,
        UserAttributeNames: AttributeNameListType
    ): DeleteUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken"        -> AccessToken.asInstanceOf[js.Any],
        "UserAttributeNames" -> UserAttributeNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserAttributesRequest]
    }
  }

  /**
    * Represents the response from the server to delete user attributes.
    */
  @js.native
  trait DeleteUserAttributesResponse extends js.Object {}

  object DeleteUserAttributesResponse {
    def apply(
        ): DeleteUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserAttributesResponse]
    }
  }

  /**
    * Represents the request to delete a user pool client.
    */
  @js.native
  trait DeleteUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
  }

  object DeleteUserPoolClientRequest {
    def apply(
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType
    ): DeleteUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId"   -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolClientRequest]
    }
  }

  @js.native
  trait DeleteUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
  }

  object DeleteUserPoolDomainRequest {
    def apply(
        Domain: DomainType,
        UserPoolId: UserPoolIdType
    ): DeleteUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain"     -> Domain.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolDomainRequest]
    }
  }

  @js.native
  trait DeleteUserPoolDomainResponse extends js.Object {}

  object DeleteUserPoolDomainResponse {
    def apply(
        ): DeleteUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolDomainResponse]
    }
  }

  /**
    * Represents the request to delete a user pool.
    */
  @js.native
  trait DeleteUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object DeleteUserPoolRequest {
    def apply(
        UserPoolId: UserPoolIdType
    ): DeleteUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolRequest]
    }
  }

  /**
    * Represents the request to delete a user.
    */
  @js.native
  trait DeleteUserRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  object DeleteUserRequest {
    def apply(
        AccessToken: TokenModelType
    ): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  object DeliveryMediumTypeEnum {
    val SMS   = "SMS"
    val EMAIL = "EMAIL"

    val values = IndexedSeq(SMS, EMAIL)
  }

  @js.native
  trait DescribeIdentityProviderRequest extends js.Object {
    var ProviderName: ProviderNameType
    var UserPoolId: UserPoolIdType
  }

  object DescribeIdentityProviderRequest {
    def apply(
        ProviderName: ProviderNameType,
        UserPoolId: UserPoolIdType
    ): DescribeIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "UserPoolId"   -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityProviderRequest]
    }
  }

  @js.native
  trait DescribeIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object DescribeIdentityProviderResponse {
    def apply(
        IdentityProvider: IdentityProviderType
    ): DescribeIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityProviderResponse]
    }
  }

  @js.native
  trait DescribeResourceServerRequest extends js.Object {
    var Identifier: ResourceServerIdentifierType
    var UserPoolId: UserPoolIdType
  }

  object DescribeResourceServerRequest {
    def apply(
        Identifier: ResourceServerIdentifierType,
        UserPoolId: UserPoolIdType
    ): DescribeResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceServerRequest]
    }
  }

  @js.native
  trait DescribeResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  object DescribeResourceServerResponse {
    def apply(
        ResourceServer: ResourceServerType
    ): DescribeResourceServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServer" -> ResourceServer.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceServerResponse]
    }
  }

  @js.native
  trait DescribeRiskConfigurationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var ClientId: js.UndefOr[ClientIdType]
  }

  object DescribeRiskConfigurationRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        ClientId: js.UndefOr[ClientIdType] = js.undefined
    ): DescribeRiskConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRiskConfigurationRequest]
    }
  }

  @js.native
  trait DescribeRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: RiskConfigurationType
  }

  object DescribeRiskConfigurationResponse {
    def apply(
        RiskConfiguration: RiskConfigurationType
    ): DescribeRiskConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskConfiguration" -> RiskConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRiskConfigurationResponse]
    }
  }

  /**
    * Represents the request to describe the user import job.
    */
  @js.native
  trait DescribeUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  object DescribeUserImportJobRequest {
    def apply(
        JobId: UserImportJobIdType,
        UserPoolId: UserPoolIdType
    ): DescribeUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId"      -> JobId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserImportJobRequest]
    }
  }

  /**
    * Represents the response from the server to the request to describe the user import job.
    */
  @js.native
  trait DescribeUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object DescribeUserImportJobResponse {
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): DescribeUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserImportJobResponse]
    }
  }

  /**
    * Represents the request to describe a user pool client.
    */
  @js.native
  trait DescribeUserPoolClientRequest extends js.Object {
    var ClientId: ClientIdType
    var UserPoolId: UserPoolIdType
  }

  object DescribeUserPoolClientRequest {
    def apply(
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType
    ): DescribeUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId"   -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolClientRequest]
    }
  }

  /**
    * Represents the response from the server from a request to describe the user pool client.
    */
  @js.native
  trait DescribeUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object DescribeUserPoolClientResponse {
    def apply(
        UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
    ): DescribeUserPoolClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClient" -> UserPoolClient.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolClientResponse]
    }
  }

  @js.native
  trait DescribeUserPoolDomainRequest extends js.Object {
    var Domain: DomainType
  }

  object DescribeUserPoolDomainRequest {
    def apply(
        Domain: DomainType
    ): DescribeUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolDomainRequest]
    }
  }

  @js.native
  trait DescribeUserPoolDomainResponse extends js.Object {
    var DomainDescription: js.UndefOr[DomainDescriptionType]
  }

  object DescribeUserPoolDomainResponse {
    def apply(
        DomainDescription: js.UndefOr[DomainDescriptionType] = js.undefined
    ): DescribeUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainDescription" -> DomainDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolDomainResponse]
    }
  }

  /**
    * Represents the request to describe the user pool.
    */
  @js.native
  trait DescribeUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object DescribeUserPoolRequest {
    def apply(
        UserPoolId: UserPoolIdType
    ): DescribeUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolRequest]
    }
  }

  /**
    * Represents the response to describe the user pool.
    */
  @js.native
  trait DescribeUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  object DescribeUserPoolResponse {
    def apply(
        UserPool: js.UndefOr[UserPoolType] = js.undefined
    ): DescribeUserPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPool" -> UserPool.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolResponse]
    }
  }

  /**
    * The configuration for the user pool's device tracking.
    */
  @js.native
  trait DeviceConfigurationType extends js.Object {
    var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType]
    var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType]
  }

  object DeviceConfigurationType {
    def apply(
        ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.undefined,
        DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.undefined
    ): DeviceConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeRequiredOnNewDevice" -> ChallengeRequiredOnNewDevice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceOnlyRememberedOnUserPrompt" -> DeviceOnlyRememberedOnUserPrompt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceConfigurationType]
    }
  }

  object DeviceRememberedStatusTypeEnum {
    val remembered     = "remembered"
    val not_remembered = "not_remembered"

    val values = IndexedSeq(remembered, not_remembered)
  }

  /**
    * The device verifier against which it will be authenticated.
    */
  @js.native
  trait DeviceSecretVerifierConfigType extends js.Object {
    var PasswordVerifier: js.UndefOr[StringType]
    var Salt: js.UndefOr[StringType]
  }

  object DeviceSecretVerifierConfigType {
    def apply(
        PasswordVerifier: js.UndefOr[StringType] = js.undefined,
        Salt: js.UndefOr[StringType] = js.undefined
    ): DeviceSecretVerifierConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordVerifier" -> PasswordVerifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Salt" -> Salt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceSecretVerifierConfigType]
    }
  }

  /**
    * The device type.
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
    def apply(
        DeviceAttributes: js.UndefOr[AttributeListType] = js.undefined,
        DeviceCreateDate: js.UndefOr[DateType] = js.undefined,
        DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
        DeviceLastAuthenticatedDate: js.UndefOr[DateType] = js.undefined,
        DeviceLastModifiedDate: js.UndefOr[DateType] = js.undefined
    ): DeviceType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceAttributes" -> DeviceAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceCreateDate" -> DeviceCreateDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceKey" -> DeviceKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceLastAuthenticatedDate" -> DeviceLastAuthenticatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceLastModifiedDate" -> DeviceLastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceType]
    }
  }

  /**
    * A container for information about a domain.
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AWSAccountId" -> AWSAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudFrontDistribution" -> CloudFrontDistribution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomDomainConfig" -> CustomDomainConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Bucket" -> S3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainDescriptionType]
    }
  }

  object DomainStatusTypeEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val UPDATING = "UPDATING"
    val ACTIVE   = "ACTIVE"
    val FAILED   = "FAILED"

    val values = IndexedSeq(CREATING, DELETING, UPDATING, ACTIVE, FAILED)
  }

  /**
    * The email configuration type.
    */
  @js.native
  trait EmailConfigurationType extends js.Object {
    var ReplyToEmailAddress: js.UndefOr[EmailAddressType]
    var SourceArn: js.UndefOr[ArnType]
  }

  object EmailConfigurationType {
    def apply(
        ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
        SourceArn: js.UndefOr[ArnType] = js.undefined
    ): EmailConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplyToEmailAddress" -> ReplyToEmailAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceArn" -> SourceArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailConfigurationType]
    }
  }

  /**
    * Specifies the user context data captured at the time of an event request.
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
    def apply(
        City: js.UndefOr[StringType] = js.undefined,
        Country: js.UndefOr[StringType] = js.undefined,
        DeviceName: js.UndefOr[StringType] = js.undefined,
        IpAddress: js.UndefOr[StringType] = js.undefined,
        Timezone: js.UndefOr[StringType] = js.undefined
    ): EventContextDataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "City" -> City.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Country" -> Country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceName" -> DeviceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventContextDataType]
    }
  }

  /**
    * Specifies the event feedback type.
    */
  @js.native
  trait EventFeedbackType extends js.Object {
    var FeedbackValue: FeedbackValueType
    var Provider: StringType
    var FeedbackDate: js.UndefOr[DateType]
  }

  object EventFeedbackType {
    def apply(
        FeedbackValue: FeedbackValueType,
        Provider: StringType,
        FeedbackDate: js.UndefOr[DateType] = js.undefined
    ): EventFeedbackType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeedbackValue" -> FeedbackValue.asInstanceOf[js.Any],
        "Provider"      -> Provider.asInstanceOf[js.Any],
        "FeedbackDate" -> FeedbackDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventFeedbackType]
    }
  }

  object EventFilterTypeEnum {
    val SIGN_IN         = "SIGN_IN"
    val PASSWORD_CHANGE = "PASSWORD_CHANGE"
    val SIGN_UP         = "SIGN_UP"

    val values = IndexedSeq(SIGN_IN, PASSWORD_CHANGE, SIGN_UP)
  }

  object EventResponseTypeEnum {
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Success, Failure)
  }

  /**
    * The event risk type.
    */
  @js.native
  trait EventRiskType extends js.Object {
    var RiskDecision: js.UndefOr[RiskDecisionType]
    var RiskLevel: js.UndefOr[RiskLevelType]
  }

  object EventRiskType {
    def apply(
        RiskDecision: js.UndefOr[RiskDecisionType] = js.undefined,
        RiskLevel: js.UndefOr[RiskLevelType] = js.undefined
    ): EventRiskType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskDecision" -> RiskDecision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RiskLevel" -> RiskLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventRiskType]
    }
  }

  object EventTypeEnum {
    val SignIn         = "SignIn"
    val SignUp         = "SignUp"
    val ForgotPassword = "ForgotPassword"

    val values = IndexedSeq(SignIn, SignUp, ForgotPassword)
  }

  object ExplicitAuthFlowsTypeEnum {
    val ADMIN_NO_SRP_AUTH     = "ADMIN_NO_SRP_AUTH"
    val CUSTOM_AUTH_FLOW_ONLY = "CUSTOM_AUTH_FLOW_ONLY"
    val USER_PASSWORD_AUTH    = "USER_PASSWORD_AUTH"

    val values = IndexedSeq(ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH)
  }

  object FeedbackValueTypeEnum {
    val Valid   = "Valid"
    val Invalid = "Invalid"

    val values = IndexedSeq(Valid, Invalid)
  }

  /**
    * Represents the request to forget the device.
    */
  @js.native
  trait ForgetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object ForgetDeviceRequest {
    def apply(
        DeviceKey: DeviceKeyType,
        AccessToken: js.UndefOr[TokenModelType] = js.undefined
    ): ForgetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any],
        "AccessToken" -> AccessToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgetDeviceRequest]
    }
  }

  /**
    * Represents the request to reset a user's password.
    */
  @js.native
  trait ForgotPasswordRequest extends js.Object {
    var ClientId: ClientIdType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ForgotPasswordRequest {
    def apply(
        ClientId: ClientIdType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ForgotPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretHash" -> SecretHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgotPasswordRequest]
    }
  }

  /**
    * Respresents the response from the server regarding the request to reset a password.
    */
  @js.native
  trait ForgotPasswordResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object ForgotPasswordResponse {
    def apply(
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): ForgotPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgotPasswordResponse]
    }
  }

  /**
    * Represents the request to get the header information for the .csv file for the user import job.
    */
  @js.native
  trait GetCSVHeaderRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object GetCSVHeaderRequest {
    def apply(
        UserPoolId: UserPoolIdType
    ): GetCSVHeaderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCSVHeaderRequest]
    }
  }

  /**
    * Represents the response from the server to the request to get the header information for the .csv file for the user import job.
    */
  @js.native
  trait GetCSVHeaderResponse extends js.Object {
    var CSVHeader: js.UndefOr[ListOfStringTypes]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GetCSVHeaderResponse {
    def apply(
        CSVHeader: js.UndefOr[ListOfStringTypes] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): GetCSVHeaderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CSVHeader" -> CSVHeader.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCSVHeaderResponse]
    }
  }

  /**
    * Represents the request to get the device.
    */
  @js.native
  trait GetDeviceRequest extends js.Object {
    var DeviceKey: DeviceKeyType
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object GetDeviceRequest {
    def apply(
        DeviceKey: DeviceKeyType,
        AccessToken: js.UndefOr[TokenModelType] = js.undefined
    ): GetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey" -> DeviceKey.asInstanceOf[js.Any],
        "AccessToken" -> AccessToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceRequest]
    }
  }

  /**
    * Gets the device response.
    */
  @js.native
  trait GetDeviceResponse extends js.Object {
    var Device: DeviceType
  }

  object GetDeviceResponse {
    def apply(
        Device: DeviceType
    ): GetDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: GroupNameType
    var UserPoolId: UserPoolIdType
  }

  object GetGroupRequest {
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType
    ): GetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object GetGroupResponse {
    def apply(
        Group: js.UndefOr[GroupType] = js.undefined
    ): GetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetIdentityProviderByIdentifierRequest extends js.Object {
    var IdpIdentifier: IdpIdentifierType
    var UserPoolId: UserPoolIdType
  }

  object GetIdentityProviderByIdentifierRequest {
    def apply(
        IdpIdentifier: IdpIdentifierType,
        UserPoolId: UserPoolIdType
    ): GetIdentityProviderByIdentifierRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdpIdentifier" -> IdpIdentifier.asInstanceOf[js.Any],
        "UserPoolId"    -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityProviderByIdentifierRequest]
    }
  }

  @js.native
  trait GetIdentityProviderByIdentifierResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object GetIdentityProviderByIdentifierResponse {
    def apply(
        IdentityProvider: IdentityProviderType
    ): GetIdentityProviderByIdentifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityProviderByIdentifierResponse]
    }
  }

  /**
    * Request to get a signing certificate from Cognito.
    */
  @js.native
  trait GetSigningCertificateRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object GetSigningCertificateRequest {
    def apply(
        UserPoolId: UserPoolIdType
    ): GetSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningCertificateRequest]
    }
  }

  /**
    * Response from Cognito for a signing certificate request.
    */
  @js.native
  trait GetSigningCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[StringType]
  }

  object GetSigningCertificateResponse {
    def apply(
        Certificate: js.UndefOr[StringType] = js.undefined
    ): GetSigningCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningCertificateResponse]
    }
  }

  @js.native
  trait GetUICustomizationRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var ClientId: js.UndefOr[ClientIdType]
  }

  object GetUICustomizationRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        ClientId: js.UndefOr[ClientIdType] = js.undefined
    ): GetUICustomizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUICustomizationRequest]
    }
  }

  @js.native
  trait GetUICustomizationResponse extends js.Object {
    var UICustomization: UICustomizationType
  }

  object GetUICustomizationResponse {
    def apply(
        UICustomization: UICustomizationType
    ): GetUICustomizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UICustomization" -> UICustomization.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUICustomizationResponse]
    }
  }

  /**
    * Represents the request to get user attribute verification.
    */
  @js.native
  trait GetUserAttributeVerificationCodeRequest extends js.Object {
    var AccessToken: TokenModelType
    var AttributeName: AttributeNameType
  }

  object GetUserAttributeVerificationCodeRequest {
    def apply(
        AccessToken: TokenModelType,
        AttributeName: AttributeNameType
    ): GetUserAttributeVerificationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken"   -> AccessToken.asInstanceOf[js.Any],
        "AttributeName" -> AttributeName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserAttributeVerificationCodeRequest]
    }
  }

  /**
    * The verification code response returned by the server response to get the user attribute verification code.
    */
  @js.native
  trait GetUserAttributeVerificationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object GetUserAttributeVerificationCodeResponse {
    def apply(
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): GetUserAttributeVerificationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserAttributeVerificationCodeResponse]
    }
  }

  @js.native
  trait GetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: UserPoolIdType
  }

  object GetUserPoolMfaConfigRequest {
    def apply(
        UserPoolId: UserPoolIdType
    ): GetUserPoolMfaConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPoolMfaConfigRequest]
    }
  }

  @js.native
  trait GetUserPoolMfaConfigResponse extends js.Object {
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  object GetUserPoolMfaConfigResponse {
    def apply(
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
        SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    ): GetUserPoolMfaConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MfaConfiguration" -> MfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsMfaConfiguration" -> SmsMfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftwareTokenMfaConfiguration" -> SoftwareTokenMfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPoolMfaConfigResponse]
    }
  }

  /**
    * Represents the request to get information about the user.
    */
  @js.native
  trait GetUserRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  object GetUserRequest {
    def apply(
        AccessToken: TokenModelType
    ): GetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserRequest]
    }
  }

  /**
    * Represents the response from the server from the request to get information about the user.
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
    def apply(
        UserAttributes: AttributeListType,
        Username: UsernameType,
        MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
        PreferredMfaSetting: js.UndefOr[StringType] = js.undefined,
        UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
    ): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserAttributes" -> UserAttributes.asInstanceOf[js.Any],
        "Username"       -> Username.asInstanceOf[js.Any],
        "MFAOptions" -> MFAOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMfaSetting" -> PreferredMfaSetting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserMFASettingList" -> UserMFASettingList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  /**
    * Represents the request to sign out all devices.
    */
  @js.native
  trait GlobalSignOutRequest extends js.Object {
    var AccessToken: TokenModelType
  }

  object GlobalSignOutRequest {
    def apply(
        AccessToken: TokenModelType
    ): GlobalSignOutRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSignOutRequest]
    }
  }

  /**
    * The response to the request to sign out all devices.
    */
  @js.native
  trait GlobalSignOutResponse extends js.Object {}

  object GlobalSignOutResponse {
    def apply(
        ): GlobalSignOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSignOutResponse]
    }
  }

  /**
    * The group type.
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
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        GroupName: js.UndefOr[GroupNameType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        Precedence: js.UndefOr[PrecedenceType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): GroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupName" -> GroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Precedence" -> Precedence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupType]
    }
  }

  /**
    * The HTTP header.
    */
  @js.native
  trait HttpHeader extends js.Object {
    var headerName: js.UndefOr[StringType]
    var headerValue: js.UndefOr[StringType]
  }

  object HttpHeader {
    def apply(
        headerName: js.UndefOr[StringType] = js.undefined,
        headerValue: js.UndefOr[StringType] = js.undefined
    ): HttpHeader = {
      val _fields = IndexedSeq[(String, js.Any)](
        "headerName" -> headerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "headerValue" -> headerValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HttpHeader]
    }
  }

  /**
    * A container for information about an identity provider.
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeMapping" -> AttributeMapping.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdpIdentifiers" -> IdpIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderDetails" -> ProviderDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderName" -> ProviderName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderType" -> ProviderType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityProviderType]
    }
  }

  object IdentityProviderTypeTypeEnum {
    val SAML            = "SAML"
    val Facebook        = "Facebook"
    val Google          = "Google"
    val LoginWithAmazon = "LoginWithAmazon"
    val OIDC            = "OIDC"

    val values = IndexedSeq(SAML, Facebook, Google, LoginWithAmazon, OIDC)
  }

  /**
    * Initiates the authentication request.
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
    def apply(
        AuthFlow: AuthFlowType,
        ClientId: ClientIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        AuthParameters: js.UndefOr[AuthParametersType] = js.undefined,
        ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): InitiateAuthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthFlow" -> AuthFlow.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AuthParameters" -> AuthParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientMetadata" -> ClientMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateAuthRequest]
    }
  }

  /**
    * Initiates the authentication response.
    */
  @js.native
  trait InitiateAuthResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object InitiateAuthResponse {
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): InitiateAuthResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationResult" -> AuthenticationResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeName" -> ChallengeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeParameters" -> ChallengeParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateAuthResponse]
    }
  }

  /**
    * Specifies the configuration for AWS Lambda triggers.
    */
  @js.native
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

  object LambdaConfigType {
    def apply(
        CreateAuthChallenge: js.UndefOr[ArnType] = js.undefined,
        CustomMessage: js.UndefOr[ArnType] = js.undefined,
        DefineAuthChallenge: js.UndefOr[ArnType] = js.undefined,
        PostAuthentication: js.UndefOr[ArnType] = js.undefined,
        PostConfirmation: js.UndefOr[ArnType] = js.undefined,
        PreAuthentication: js.UndefOr[ArnType] = js.undefined,
        PreSignUp: js.UndefOr[ArnType] = js.undefined,
        PreTokenGeneration: js.UndefOr[ArnType] = js.undefined,
        UserMigration: js.UndefOr[ArnType] = js.undefined,
        VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.undefined
    ): LambdaConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAuthChallenge" -> CreateAuthChallenge.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomMessage" -> CustomMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefineAuthChallenge" -> DefineAuthChallenge.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PostAuthentication" -> PostAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PostConfirmation" -> PostConfirmation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreAuthentication" -> PreAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignUp" -> PreSignUp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreTokenGeneration" -> PreTokenGeneration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserMigration" -> UserMigration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerifyAuthChallengeResponse" -> VerifyAuthChallengeResponse.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaConfigType]
    }
  }

  /**
    * Represents the request to list the devices.
    */
  @js.native
  trait ListDevicesRequest extends js.Object {
    var AccessToken: TokenModelType
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListDevicesRequest {
    def apply(
        AccessToken: TokenModelType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): ListDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesRequest]
    }
  }

  /**
    * Represents the response to list devices.
    */
  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListDevicesResponse {
    def apply(
        Devices: js.UndefOr[DeviceListType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): ListDevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Devices" -> Devices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListGroupsRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
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
    var Groups: js.UndefOr[GroupListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListGroupsResponse {
    def apply(
        Groups: js.UndefOr[GroupListType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
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
  trait ListIdentityProvidersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[ListProvidersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListIdentityProvidersRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListIdentityProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityProvidersRequest]
    }
  }

  @js.native
  trait ListIdentityProvidersResponse extends js.Object {
    var Providers: ProvidersListType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListIdentityProvidersResponse {
    def apply(
        Providers: ProvidersListType,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListIdentityProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Providers" -> Providers.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityProvidersResponse]
    }
  }

  @js.native
  trait ListResourceServersRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[ListResourceServersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListResourceServersRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListResourceServersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceServersRequest]
    }
  }

  @js.native
  trait ListResourceServersResponse extends js.Object {
    var ResourceServers: ResourceServersListType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListResourceServersResponse {
    def apply(
        ResourceServers: ResourceServersListType,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListResourceServersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServers" -> ResourceServers.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceServersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ArnType
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: ArnType
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[UserPoolTagsType]
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: js.UndefOr[UserPoolTagsType] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Represents the request to list the user import jobs.
    */
  @js.native
  trait ListUserImportJobsRequest extends js.Object {
    var MaxResults: PoolQueryLimitType
    var UserPoolId: UserPoolIdType
    var PaginationToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserImportJobsRequest {
    def apply(
        MaxResults: PoolQueryLimitType,
        UserPoolId: UserPoolIdType,
        PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListUserImportJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserImportJobsRequest]
    }
  }

  /**
    * Represents the response from the server to the request to list the user import jobs.
    */
  @js.native
  trait ListUserImportJobsResponse extends js.Object {
    var PaginationToken: js.UndefOr[PaginationKeyType]
    var UserImportJobs: js.UndefOr[UserImportJobsListType]
  }

  object ListUserImportJobsResponse {
    def apply(
        PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined,
        UserImportJobs: js.UndefOr[UserImportJobsListType] = js.undefined
    ): ListUserImportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserImportJobs" -> UserImportJobs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserImportJobsResponse]
    }
  }

  /**
    * Represents the request to list the user pool clients.
    */
  @js.native
  trait ListUserPoolClientsRequest extends js.Object {
    var UserPoolId: UserPoolIdType
    var MaxResults: js.UndefOr[QueryLimit]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUserPoolClientsRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        MaxResults: js.UndefOr[QueryLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListUserPoolClientsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolClientsRequest]
    }
  }

  /**
    * Represents the response from the server that lists user pool clients.
    */
  @js.native
  trait ListUserPoolClientsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKey]
    var UserPoolClients: js.UndefOr[UserPoolClientListType]
  }

  object ListUserPoolClientsResponse {
    def apply(
        NextToken: js.UndefOr[PaginationKey] = js.undefined,
        UserPoolClients: js.UndefOr[UserPoolClientListType] = js.undefined
    ): ListUserPoolClientsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolClients" -> UserPoolClients.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolClientsResponse]
    }
  }

  /**
    * Represents the request to list user pools.
    */
  @js.native
  trait ListUserPoolsRequest extends js.Object {
    var MaxResults: PoolQueryLimitType
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserPoolsRequest {
    def apply(
        MaxResults: PoolQueryLimitType,
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    ): ListUserPoolsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolsRequest]
    }
  }

  /**
    * Represents the response to list user pools.
    */
  @js.native
  trait ListUserPoolsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKeyType]
    var UserPools: js.UndefOr[UserPoolListType]
  }

  object ListUserPoolsResponse {
    def apply(
        NextToken: js.UndefOr[PaginationKeyType] = js.undefined,
        UserPools: js.UndefOr[UserPoolListType] = js.undefined
    ): ListUserPoolsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPools" -> UserPools.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolsResponse]
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
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListUsersInGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersInGroupRequest]
    }
  }

  @js.native
  trait ListUsersInGroupResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationKey]
    var Users: js.UndefOr[UsersListType]
  }

  object ListUsersInGroupResponse {
    def apply(
        NextToken: js.UndefOr[PaginationKey] = js.undefined,
        Users: js.UndefOr[UsersListType] = js.undefined
    ): ListUsersInGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersInGroupResponse]
    }
  }

  /**
    * Represents the request to list users.
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
    def apply(
        UserPoolId: UserPoolIdType,
        AttributesToGet: js.UndefOr[SearchedAttributeNamesListType] = js.undefined,
        Filter: js.UndefOr[UserFilterType] = js.undefined,
        Limit: js.UndefOr[QueryLimitType] = js.undefined,
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    ): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "AttributesToGet" -> AttributesToGet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filter" -> Filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PaginationToken" -> PaginationToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  /**
    * The response from the request to list users.
    */
  @js.native
  trait ListUsersResponse extends js.Object {
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
    var Users: js.UndefOr[UsersListType]
  }

  object ListUsersResponse {
    def apply(
        PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined,
        Users: js.UndefOr[UsersListType] = js.undefined
    ): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x =>
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
    * Specifies the different settings for multi-factor authentication (MFA).
    */
  @js.native
  trait MFAOptionType extends js.Object {
    var AttributeName: js.UndefOr[AttributeNameType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
  }

  object MFAOptionType {
    def apply(
        AttributeName: js.UndefOr[AttributeNameType] = js.undefined,
        DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
    ): MFAOptionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeliveryMedium" -> DeliveryMedium.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MFAOptionType]
    }
  }

  object MessageActionTypeEnum {
    val RESEND   = "RESEND"
    val SUPPRESS = "SUPPRESS"

    val values = IndexedSeq(RESEND, SUPPRESS)
  }

  /**
    * The message template structure.
    */
  @js.native
  trait MessageTemplateType extends js.Object {
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
    var SMSMessage: js.UndefOr[SmsVerificationMessageType]
  }

  object MessageTemplateType {
    def apply(
        EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    ): MessageTemplateType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailMessage" -> EmailMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailSubject" -> EmailSubject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SMSMessage" -> SMSMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageTemplateType]
    }
  }

  /**
    * The new device metadata type.
    */
  @js.native
  trait NewDeviceMetadataType extends js.Object {
    var DeviceGroupKey: js.UndefOr[StringType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
  }

  object NewDeviceMetadataType {
    def apply(
        DeviceGroupKey: js.UndefOr[StringType] = js.undefined,
        DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
    ): NewDeviceMetadataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceGroupKey" -> DeviceGroupKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceKey" -> DeviceKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewDeviceMetadataType]
    }
  }

  /**
    * The notify configuration type.
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
    def apply(
        SourceArn: ArnType,
        BlockEmail: js.UndefOr[NotifyEmailType] = js.undefined,
        From: js.UndefOr[StringType] = js.undefined,
        MfaEmail: js.UndefOr[NotifyEmailType] = js.undefined,
        NoActionEmail: js.UndefOr[NotifyEmailType] = js.undefined,
        ReplyTo: js.UndefOr[StringType] = js.undefined
    ): NotifyConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceArn" -> SourceArn.asInstanceOf[js.Any],
        "BlockEmail" -> BlockEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "From" -> From.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MfaEmail" -> MfaEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NoActionEmail" -> NoActionEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplyTo" -> ReplyTo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyConfigurationType]
    }
  }

  /**
    * The notify email type.
    */
  @js.native
  trait NotifyEmailType extends js.Object {
    var Subject: EmailNotificationSubjectType
    var HtmlBody: js.UndefOr[EmailNotificationBodyType]
    var TextBody: js.UndefOr[EmailNotificationBodyType]
  }

  object NotifyEmailType {
    def apply(
        Subject: EmailNotificationSubjectType,
        HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined,
        TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
    ): NotifyEmailType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subject" -> Subject.asInstanceOf[js.Any],
        "HtmlBody" -> HtmlBody.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TextBody" -> TextBody.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyEmailType]
    }
  }

  /**
    * The minimum and maximum value of an attribute that is of the number data type.
    */
  @js.native
  trait NumberAttributeConstraintsType extends js.Object {
    var MaxValue: js.UndefOr[StringType]
    var MinValue: js.UndefOr[StringType]
  }

  object NumberAttributeConstraintsType {
    def apply(
        MaxValue: js.UndefOr[StringType] = js.undefined,
        MinValue: js.UndefOr[StringType] = js.undefined
    ): NumberAttributeConstraintsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxValue" -> MaxValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinValue" -> MinValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NumberAttributeConstraintsType]
    }
  }

  object OAuthFlowTypeEnum {
    val code               = "code"
    val `implicit`         = "implicit"
    val client_credentials = "client_credentials"

    val values = IndexedSeq(code, `implicit`, client_credentials)
  }

  /**
    * The password policy type.
    */
  @js.native
  trait PasswordPolicyType extends js.Object {
    var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType]
    var RequireLowercase: js.UndefOr[BooleanType]
    var RequireNumbers: js.UndefOr[BooleanType]
    var RequireSymbols: js.UndefOr[BooleanType]
    var RequireUppercase: js.UndefOr[BooleanType]
  }

  object PasswordPolicyType {
    def apply(
        MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined,
        RequireLowercase: js.UndefOr[BooleanType] = js.undefined,
        RequireNumbers: js.UndefOr[BooleanType] = js.undefined,
        RequireSymbols: js.UndefOr[BooleanType] = js.undefined,
        RequireUppercase: js.UndefOr[BooleanType] = js.undefined
    ): PasswordPolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinimumLength" -> MinimumLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequireLowercase" -> RequireLowercase.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequireNumbers" -> RequireNumbers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequireSymbols" -> RequireSymbols.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequireUppercase" -> RequireUppercase.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PasswordPolicyType]
    }
  }

  /**
    * A container for identity provider details.
    */
  @js.native
  trait ProviderDescription extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var LastModifiedDate: js.UndefOr[DateType]
    var ProviderName: js.UndefOr[ProviderNameType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
  }

  object ProviderDescription {
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        ProviderName: js.UndefOr[ProviderNameType] = js.undefined,
        ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
    ): ProviderDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderName" -> ProviderName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderType" -> ProviderType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProviderDescription]
    }
  }

  /**
    * A container for information about an identity provider for a user pool.
    */
  @js.native
  trait ProviderUserIdentifierType extends js.Object {
    var ProviderAttributeName: js.UndefOr[StringType]
    var ProviderAttributeValue: js.UndefOr[StringType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  object ProviderUserIdentifierType {
    def apply(
        ProviderAttributeName: js.UndefOr[StringType] = js.undefined,
        ProviderAttributeValue: js.UndefOr[StringType] = js.undefined,
        ProviderName: js.UndefOr[ProviderNameType] = js.undefined
    ): ProviderUserIdentifierType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderAttributeName" -> ProviderAttributeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderAttributeValue" -> ProviderAttributeValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderName" -> ProviderName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProviderUserIdentifierType]
    }
  }

  /**
    * Represents the request to resend the confirmation code.
    */
  @js.native
  trait ResendConfirmationCodeRequest extends js.Object {
    var ClientId: ClientIdType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object ResendConfirmationCodeRequest {
    def apply(
        ClientId: ClientIdType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): ResendConfirmationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretHash" -> SecretHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendConfirmationCodeRequest]
    }
  }

  /**
    * The response from the server when the Amazon Cognito Your User Pools service makes the request to resend a confirmation code.
    */
  @js.native
  trait ResendConfirmationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object ResendConfirmationCodeResponse {
    def apply(
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): ResendConfirmationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendConfirmationCodeResponse]
    }
  }

  /**
    * A resource server scope.
    */
  @js.native
  trait ResourceServerScopeType extends js.Object {
    var ScopeDescription: ResourceServerScopeDescriptionType
    var ScopeName: ResourceServerScopeNameType
  }

  object ResourceServerScopeType {
    def apply(
        ScopeDescription: ResourceServerScopeDescriptionType,
        ScopeName: ResourceServerScopeNameType
    ): ResourceServerScopeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScopeDescription" -> ScopeDescription.asInstanceOf[js.Any],
        "ScopeName"        -> ScopeName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceServerScopeType]
    }
  }

  /**
    * A container for information about a resource server for a user pool.
    */
  @js.native
  trait ResourceServerType extends js.Object {
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
    var Name: js.UndefOr[ResourceServerNameType]
    var Scopes: js.UndefOr[ResourceServerScopeListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object ResourceServerType {
    def apply(
        Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined,
        Name: js.UndefOr[ResourceServerNameType] = js.undefined,
        Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): ResourceServerType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identifier" -> Identifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scopes" -> Scopes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceServerType]
    }
  }

  /**
    * The request to respond to an authentication challenge.
    */
  @js.native
  trait RespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: ChallengeNameType
    var ClientId: ClientIdType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var Session: js.UndefOr[SessionType]
    var UserContextData: js.UndefOr[UserContextDataType]
  }

  object RespondToAuthChallengeRequest {
    def apply(
        ChallengeName: ChallengeNameType,
        ClientId: ClientIdType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    ): RespondToAuthChallengeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.asInstanceOf[js.Any],
        "ClientId"      -> ClientId.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeResponses" -> ChallengeResponses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondToAuthChallengeRequest]
    }
  }

  /**
    * The response to respond to the authentication challenge.
    */
  @js.native
  trait RespondToAuthChallengeResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var Session: js.UndefOr[SessionType]
  }

  object RespondToAuthChallengeResponse {
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined,
        ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
        ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): RespondToAuthChallengeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationResult" -> AuthenticationResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeName" -> ChallengeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChallengeParameters" -> ChallengeParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondToAuthChallengeResponse]
    }
  }

  /**
    * The risk configuration type.
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
    def apply(
        AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): RiskConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountTakeoverRiskConfiguration" -> AccountTakeoverRiskConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompromisedCredentialsRiskConfiguration" -> CompromisedCredentialsRiskConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RiskExceptionConfiguration" -> RiskExceptionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RiskConfigurationType]
    }
  }

  object RiskDecisionTypeEnum {
    val NoRisk          = "NoRisk"
    val AccountTakeover = "AccountTakeover"
    val Block           = "Block"

    val values = IndexedSeq(NoRisk, AccountTakeover, Block)
  }

  /**
    * The type of the configuration to override the risk decision.
    */
  @js.native
  trait RiskExceptionConfigurationType extends js.Object {
    var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType]
    var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType]
  }

  object RiskExceptionConfigurationType {
    def apply(
        BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.undefined,
        SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.undefined
    ): RiskExceptionConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockedIPRangeList" -> BlockedIPRangeList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkippedIPRangeList" -> SkippedIPRangeList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RiskExceptionConfigurationType]
    }
  }

  object RiskLevelTypeEnum {
    val Low    = "Low"
    val Medium = "Medium"
    val High   = "High"

    val values = IndexedSeq(Low, Medium, High)
  }

  /**
    * The SMS multi-factor authentication (MFA) settings type.
    */
  @js.native
  trait SMSMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  object SMSMfaSettingsType {
    def apply(
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        PreferredMfa: js.UndefOr[BooleanType] = js.undefined
    ): SMSMfaSettingsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMfa" -> PreferredMfa.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMSMfaSettingsType]
    }
  }

  /**
    * Contains information about the schema attribute.
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
    def apply(
        AttributeDataType: js.UndefOr[AttributeDataType] = js.undefined,
        DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.undefined,
        Mutable: js.UndefOr[BooleanType] = js.undefined,
        Name: js.UndefOr[CustomAttributeNameType] = js.undefined,
        NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.undefined,
        Required: js.UndefOr[BooleanType] = js.undefined,
        StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.undefined
    ): SchemaAttributeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeDataType" -> AttributeDataType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeveloperOnlyAttribute" -> DeveloperOnlyAttribute.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mutable" -> Mutable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberAttributeConstraints" -> NumberAttributeConstraints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Required" -> Required.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StringAttributeConstraints" -> StringAttributeConstraints.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaAttributeType]
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
    def apply(
        UserPoolId: UserPoolIdType,
        AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined,
        RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
    ): SetRiskConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "AccountTakeoverRiskConfiguration" -> AccountTakeoverRiskConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompromisedCredentialsRiskConfiguration" -> CompromisedCredentialsRiskConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RiskExceptionConfiguration" -> RiskExceptionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRiskConfigurationRequest]
    }
  }

  @js.native
  trait SetRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: RiskConfigurationType
  }

  object SetRiskConfigurationResponse {
    def apply(
        RiskConfiguration: RiskConfigurationType
    ): SetRiskConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskConfiguration" -> RiskConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRiskConfigurationResponse]
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
    def apply(
        UserPoolId: UserPoolIdType,
        CSS: js.UndefOr[CSSType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        ImageFile: js.UndefOr[ImageFileType] = js.undefined
    ): SetUICustomizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "CSS" -> CSS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageFile" -> ImageFile.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUICustomizationRequest]
    }
  }

  @js.native
  trait SetUICustomizationResponse extends js.Object {
    var UICustomization: UICustomizationType
  }

  object SetUICustomizationResponse {
    def apply(
        UICustomization: UICustomizationType
    ): SetUICustomizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UICustomization" -> UICustomization.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUICustomizationResponse]
    }
  }

  @js.native
  trait SetUserMFAPreferenceRequest extends js.Object {
    var AccessToken: TokenModelType
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
  }

  object SetUserMFAPreferenceRequest {
    def apply(
        AccessToken: TokenModelType,
        SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined,
        SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
    ): SetUserMFAPreferenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "SMSMfaSettings" -> SMSMfaSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftwareTokenMfaSettings" -> SoftwareTokenMfaSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserMFAPreferenceRequest]
    }
  }

  @js.native
  trait SetUserMFAPreferenceResponse extends js.Object {}

  object SetUserMFAPreferenceResponse {
    def apply(
        ): SetUserMFAPreferenceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserMFAPreferenceResponse]
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
    def apply(
        UserPoolId: UserPoolIdType,
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
        SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    ): SetUserPoolMfaConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "MfaConfiguration" -> MfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsMfaConfiguration" -> SmsMfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftwareTokenMfaConfiguration" -> SoftwareTokenMfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserPoolMfaConfigRequest]
    }
  }

  @js.native
  trait SetUserPoolMfaConfigResponse extends js.Object {
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
  }

  object SetUserPoolMfaConfigResponse {
    def apply(
        MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
        SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
        SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    ): SetUserPoolMfaConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MfaConfiguration" -> MfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsMfaConfiguration" -> SmsMfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftwareTokenMfaConfiguration" -> SoftwareTokenMfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserPoolMfaConfigResponse]
    }
  }

  /**
    * Represents the request to set user settings.
    */
  @js.native
  trait SetUserSettingsRequest extends js.Object {
    var AccessToken: TokenModelType
    var MFAOptions: MFAOptionListType
  }

  object SetUserSettingsRequest {
    def apply(
        AccessToken: TokenModelType,
        MFAOptions: MFAOptionListType
    ): SetUserSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "MFAOptions"  -> MFAOptions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserSettingsRequest]
    }
  }

  /**
    * The response from the server for a set user settings request.
    */
  @js.native
  trait SetUserSettingsResponse extends js.Object {}

  object SetUserSettingsResponse {
    def apply(
        ): SetUserSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserSettingsResponse]
    }
  }

  /**
    * Represents the request to register a user.
    */
  @js.native
  trait SignUpRequest extends js.Object {
    var ClientId: ClientIdType
    var Password: PasswordType
    var Username: UsernameType
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
    var SecretHash: js.UndefOr[SecretHashType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var ValidationData: js.UndefOr[AttributeListType]
  }

  object SignUpRequest {
    def apply(
        ClientId: ClientIdType,
        Password: PasswordType,
        Username: UsernameType,
        AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined,
        SecretHash: js.UndefOr[SecretHashType] = js.undefined,
        UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
        UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
        ValidationData: js.UndefOr[AttributeListType] = js.undefined
    ): SignUpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretHash" -> SecretHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserAttributes" -> UserAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserContextData" -> UserContextData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidationData" -> ValidationData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignUpRequest]
    }
  }

  /**
    * The response from the server for a registration request.
    */
  @js.native
  trait SignUpResponse extends js.Object {
    var UserConfirmed: BooleanType
    var UserSub: StringType
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object SignUpResponse {
    def apply(
        UserConfirmed: BooleanType,
        UserSub: StringType,
        CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    ): SignUpResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserConfirmed" -> UserConfirmed.asInstanceOf[js.Any],
        "UserSub"       -> UserSub.asInstanceOf[js.Any],
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignUpResponse]
    }
  }

  /**
    * The SMS configuration type.
    */
  @js.native
  trait SmsConfigurationType extends js.Object {
    var SnsCallerArn: ArnType
    var ExternalId: js.UndefOr[StringType]
  }

  object SmsConfigurationType {
    def apply(
        SnsCallerArn: ArnType,
        ExternalId: js.UndefOr[StringType] = js.undefined
    ): SmsConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnsCallerArn" -> SnsCallerArn.asInstanceOf[js.Any],
        "ExternalId" -> ExternalId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SmsConfigurationType]
    }
  }

  /**
    * The SMS text message multi-factor authentication (MFA) configuration type.
    */
  @js.native
  trait SmsMfaConfigType extends js.Object {
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
  }

  object SmsMfaConfigType {
    def apply(
        SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
        SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
    ): SmsMfaConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsConfiguration" -> SmsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SmsMfaConfigType]
    }
  }

  /**
    * The type used for enabling software token MFA at the user pool level.
    */
  @js.native
  trait SoftwareTokenMfaConfigType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
  }

  object SoftwareTokenMfaConfigType {
    def apply(
        Enabled: js.UndefOr[BooleanType] = js.undefined
    ): SoftwareTokenMfaConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SoftwareTokenMfaConfigType]
    }
  }

  /**
    * The type used for enabling software token MFA at the user level.
    */
  @js.native
  trait SoftwareTokenMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  object SoftwareTokenMfaSettingsType {
    def apply(
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        PreferredMfa: js.UndefOr[BooleanType] = js.undefined
    ): SoftwareTokenMfaSettingsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMfa" -> PreferredMfa.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SoftwareTokenMfaSettingsType]
    }
  }

  /**
    * Represents the request to start the user import job.
    */
  @js.native
  trait StartUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  object StartUserImportJobRequest {
    def apply(
        JobId: UserImportJobIdType,
        UserPoolId: UserPoolIdType
    ): StartUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId"      -> JobId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartUserImportJobRequest]
    }
  }

  /**
    * Represents the response from the server to the request to start the user import job.
    */
  @js.native
  trait StartUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object StartUserImportJobResponse {
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): StartUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartUserImportJobResponse]
    }
  }

  object StatusTypeEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  /**
    * Represents the request to stop the user import job.
    */
  @js.native
  trait StopUserImportJobRequest extends js.Object {
    var JobId: UserImportJobIdType
    var UserPoolId: UserPoolIdType
  }

  object StopUserImportJobRequest {
    def apply(
        JobId: UserImportJobIdType,
        UserPoolId: UserPoolIdType
    ): StopUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId"      -> JobId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopUserImportJobRequest]
    }
  }

  /**
    * Represents the response from the server to the request to stop the user import job.
    */
  @js.native
  trait StopUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object StopUserImportJobResponse {
    def apply(
        UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
    ): StopUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopUserImportJobResponse]
    }
  }

  /**
    * The constraints associated with a string attribute.
    */
  @js.native
  trait StringAttributeConstraintsType extends js.Object {
    var MaxLength: js.UndefOr[StringType]
    var MinLength: js.UndefOr[StringType]
  }

  object StringAttributeConstraintsType {
    def apply(
        MaxLength: js.UndefOr[StringType] = js.undefined,
        MinLength: js.UndefOr[StringType] = js.undefined
    ): StringAttributeConstraintsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxLength" -> MaxLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinLength" -> MinLength.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StringAttributeConstraintsType]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ArnType
    var Tags: js.UndefOr[UserPoolTagsType]
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: ArnType,
        Tags: js.UndefOr[UserPoolTagsType] = js.undefined
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * A container for the UI customization information for a user pool's built-in app UI.
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
    def apply(
        CSS: js.UndefOr[CSSType] = js.undefined,
        CSSVersion: js.UndefOr[CSSVersionType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        ImageUrl: js.UndefOr[ImageUrlType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): UICustomizationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CSS" -> CSS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CSSVersion" -> CSSVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageUrl" -> ImageUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UICustomizationType]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ArnType
    var TagKeys: js.UndefOr[UserPoolTagsListType]
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: ArnType,
        TagKeys: js.UndefOr[UserPoolTagsListType] = js.undefined
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
    def apply(
        EventId: EventIdType,
        FeedbackToken: TokenModelType,
        FeedbackValue: FeedbackValueType,
        UserPoolId: UserPoolIdType,
        Username: UsernameType
    ): UpdateAuthEventFeedbackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventId"       -> EventId.asInstanceOf[js.Any],
        "FeedbackToken" -> FeedbackToken.asInstanceOf[js.Any],
        "FeedbackValue" -> FeedbackValue.asInstanceOf[js.Any],
        "UserPoolId"    -> UserPoolId.asInstanceOf[js.Any],
        "Username"      -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthEventFeedbackRequest]
    }
  }

  @js.native
  trait UpdateAuthEventFeedbackResponse extends js.Object {}

  object UpdateAuthEventFeedbackResponse {
    def apply(
        ): UpdateAuthEventFeedbackResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthEventFeedbackResponse]
    }
  }

  /**
    * Represents the request to update the device status.
    */
  @js.native
  trait UpdateDeviceStatusRequest extends js.Object {
    var AccessToken: TokenModelType
    var DeviceKey: DeviceKeyType
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  object UpdateDeviceStatusRequest {
    def apply(
        AccessToken: TokenModelType,
        DeviceKey: DeviceKeyType,
        DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
    ): UpdateDeviceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.asInstanceOf[js.Any],
        "DeviceKey"   -> DeviceKey.asInstanceOf[js.Any],
        "DeviceRememberedStatus" -> DeviceRememberedStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceStatusRequest]
    }
  }

  /**
    * The response to the request to update the device status.
    */
  @js.native
  trait UpdateDeviceStatusResponse extends js.Object {}

  object UpdateDeviceStatusResponse {
    def apply(
        ): UpdateDeviceStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceStatusResponse]
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
    def apply(
        GroupName: GroupNameType,
        UserPoolId: UserPoolIdType,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        Precedence: js.UndefOr[PrecedenceType] = js.undefined,
        RoleArn: js.UndefOr[ArnType] = js.undefined
    ): UpdateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"  -> GroupName.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Precedence" -> Precedence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object UpdateGroupResponse {
    def apply(
        Group: js.UndefOr[GroupType] = js.undefined
    ): UpdateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupResponse]
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
    def apply(
        ProviderName: ProviderNameType,
        UserPoolId: UserPoolIdType,
        AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
        IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined,
        ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
    ): UpdateIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "UserPoolId"   -> UserPoolId.asInstanceOf[js.Any],
        "AttributeMapping" -> AttributeMapping.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdpIdentifiers" -> IdpIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProviderDetails" -> ProviderDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIdentityProviderRequest]
    }
  }

  @js.native
  trait UpdateIdentityProviderResponse extends js.Object {
    var IdentityProvider: IdentityProviderType
  }

  object UpdateIdentityProviderResponse {
    def apply(
        IdentityProvider: IdentityProviderType
    ): UpdateIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIdentityProviderResponse]
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
    def apply(
        Identifier: ResourceServerIdentifierType,
        Name: ResourceServerNameType,
        UserPoolId: UserPoolIdType,
        Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    ): UpdateResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "Scopes" -> Scopes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceServerRequest]
    }
  }

  @js.native
  trait UpdateResourceServerResponse extends js.Object {
    var ResourceServer: ResourceServerType
  }

  object UpdateResourceServerResponse {
    def apply(
        ResourceServer: ResourceServerType
    ): UpdateResourceServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServer" -> ResourceServer.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceServerResponse]
    }
  }

  /**
    * Represents the request to update user attributes.
    */
  @js.native
  trait UpdateUserAttributesRequest extends js.Object {
    var AccessToken: TokenModelType
    var UserAttributes: AttributeListType
  }

  object UpdateUserAttributesRequest {
    def apply(
        AccessToken: TokenModelType,
        UserAttributes: AttributeListType
    ): UpdateUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken"    -> AccessToken.asInstanceOf[js.Any],
        "UserAttributes" -> UserAttributes.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserAttributesRequest]
    }
  }

  /**
    * Represents the response from the server for the request to update user attributes.
    */
  @js.native
  trait UpdateUserAttributesResponse extends js.Object {
    var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType]
  }

  object UpdateUserAttributesResponse {
    def apply(
        CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.undefined
    ): UpdateUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetailsList" -> CodeDeliveryDetailsList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserAttributesResponse]
    }
  }

  /**
    * Represents the request to update the user pool client.
    */
  @js.native
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
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  object UpdateUserPoolClientRequest {
    def apply(
        ClientId: ClientIdType,
        UserPoolId: UserPoolIdType,
        AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
        AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
        AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
        CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
        ClientName: js.UndefOr[ClientNameType] = js.undefined,
        DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
        ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
        LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined,
        ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
        RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
        SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
        WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    ): UpdateUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId"   -> ClientId.asInstanceOf[js.Any],
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "AllowedOAuthFlows" -> AllowedOAuthFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowedOAuthFlowsUserPoolClient" -> AllowedOAuthFlowsUserPoolClient.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowedOAuthScopes" -> AllowedOAuthScopes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CallbackURLs" -> CallbackURLs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientName" -> ClientName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRedirectURI" -> DefaultRedirectURI.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExplicitAuthFlows" -> ExplicitAuthFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogoutURLs" -> LogoutURLs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadAttributes" -> ReadAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RefreshTokenValidity" -> RefreshTokenValidity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedIdentityProviders" -> SupportedIdentityProviders.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WriteAttributes" -> WriteAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolClientRequest]
    }
  }

  /**
    * Represents the response from the server to the request to update the user pool client.
    */
  @js.native
  trait UpdateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object UpdateUserPoolClientResponse {
    def apply(
        UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
    ): UpdateUserPoolClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClient" -> UserPoolClient.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolClientResponse]
    }
  }

  /**
    * The UpdateUserPoolDomain request input.
    */
  @js.native
  trait UpdateUserPoolDomainRequest extends js.Object {
    var CustomDomainConfig: CustomDomainConfigType
    var Domain: DomainType
    var UserPoolId: UserPoolIdType
  }

  object UpdateUserPoolDomainRequest {
    def apply(
        CustomDomainConfig: CustomDomainConfigType,
        Domain: DomainType,
        UserPoolId: UserPoolIdType
    ): UpdateUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomDomainConfig" -> CustomDomainConfig.asInstanceOf[js.Any],
        "Domain"             -> Domain.asInstanceOf[js.Any],
        "UserPoolId"         -> UserPoolId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolDomainRequest]
    }
  }

  /**
    * The UpdateUserPoolDomain response output.
    */
  @js.native
  trait UpdateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  object UpdateUserPoolDomainResponse {
    def apply(
        CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
    ): UpdateUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontDomain" -> CloudFrontDomain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolDomainResponse]
    }
  }

  /**
    * Represents the request to update the user pool.
    */
  @js.native
  trait UpdateUserPoolRequest extends js.Object {
    var UserPoolId: UserPoolIdType
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

  object UpdateUserPoolRequest {
    def apply(
        UserPoolId: UserPoolIdType,
        AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
        AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
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
        UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
        UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
        VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
    ): UpdateUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.asInstanceOf[js.Any],
        "AdminCreateUserConfig" -> AdminCreateUserConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoVerifiedAttributes" -> AutoVerifiedAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceConfiguration" -> DeviceConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailConfiguration" -> EmailConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailVerificationMessage" -> EmailVerificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailVerificationSubject" -> EmailVerificationSubject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaConfig" -> LambdaConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MfaConfiguration" -> MfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policies" -> Policies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsConfiguration" -> SmsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsVerificationMessage" -> SmsVerificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolAddOns" -> UserPoolAddOns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolTags" -> UserPoolTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerificationMessageTemplate" -> VerificationMessageTemplate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolRequest]
    }
  }

  /**
    * Represents the response from the server when you make a request to update the user pool.
    */
  @js.native
  trait UpdateUserPoolResponse extends js.Object {}

  object UpdateUserPoolResponse {
    def apply(
        ): UpdateUserPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolResponse]
    }
  }

  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  @js.native
  trait UserContextDataType extends js.Object {
    var EncodedData: js.UndefOr[StringType]
  }

  object UserContextDataType {
    def apply(
        EncodedData: js.UndefOr[StringType] = js.undefined
    ): UserContextDataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncodedData" -> EncodedData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserContextDataType]
    }
  }

  object UserImportJobStatusTypeEnum {
    val Created    = "Created"
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Stopping   = "Stopping"
    val Expired    = "Expired"
    val Stopped    = "Stopped"
    val Failed     = "Failed"
    val Succeeded  = "Succeeded"

    val values = IndexedSeq(Created, Pending, InProgress, Stopping, Expired, Stopped, Failed, Succeeded)
  }

  /**
    * The user import job type.
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletionDate" -> CompletionDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletionMessage" -> CompletionMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailedUsers" -> FailedUsers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportedUsers" -> ImportedUsers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignedUrl" -> PreSignedUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkippedUsers" -> SkippedUsers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDate" -> StartDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserImportJobType]
    }
  }

  /**
    * The user pool add-ons type.
    */
  @js.native
  trait UserPoolAddOnsType extends js.Object {
    var AdvancedSecurityMode: AdvancedSecurityModeType
  }

  object UserPoolAddOnsType {
    def apply(
        AdvancedSecurityMode: AdvancedSecurityModeType
    ): UserPoolAddOnsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdvancedSecurityMode" -> AdvancedSecurityMode.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolAddOnsType]
    }
  }

  /**
    * The description of the user pool client.
    */
  @js.native
  trait UserPoolClientDescription extends js.Object {
    var ClientId: js.UndefOr[ClientIdType]
    var ClientName: js.UndefOr[ClientNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object UserPoolClientDescription {
    def apply(
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        ClientName: js.UndefOr[ClientNameType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    ): UserPoolClientDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientName" -> ClientName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolClientDescription]
    }
  }

  /**
    * Contains information about a user pool client.
    */
  @js.native
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
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
  }

  object UserPoolClientType {
    def apply(
        AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
        AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
        AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
        CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
        ClientId: js.UndefOr[ClientIdType] = js.undefined,
        ClientName: js.UndefOr[ClientNameType] = js.undefined,
        ClientSecret: js.UndefOr[ClientSecretType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
        ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined,
        ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
        RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
        SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
        WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    ): UserPoolClientType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedOAuthFlows" -> AllowedOAuthFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowedOAuthFlowsUserPoolClient" -> AllowedOAuthFlowsUserPoolClient.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowedOAuthScopes" -> AllowedOAuthScopes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CallbackURLs" -> CallbackURLs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientName" -> ClientName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientSecret" -> ClientSecret.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRedirectURI" -> DefaultRedirectURI.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExplicitAuthFlows" -> ExplicitAuthFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogoutURLs" -> LogoutURLs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadAttributes" -> ReadAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RefreshTokenValidity" -> RefreshTokenValidity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedIdentityProviders" -> SupportedIdentityProviders.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolId" -> UserPoolId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WriteAttributes" -> WriteAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolClientType]
    }
  }

  /**
    * A user pool description.
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
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        Id: js.UndefOr[UserPoolIdType] = js.undefined,
        LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        Name: js.UndefOr[UserPoolNameType] = js.undefined,
        Status: js.UndefOr[StatusType] = js.undefined
    ): UserPoolDescriptionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaConfig" -> LambdaConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolDescriptionType]
    }
  }

  object UserPoolMfaTypeEnum {
    val OFF      = "OFF"
    val ON       = "ON"
    val OPTIONAL = "OPTIONAL"

    val values = IndexedSeq(OFF, ON, OPTIONAL)
  }

  /**
    * The policy associated with a user pool.
    */
  @js.native
  trait UserPoolPolicyType extends js.Object {
    var PasswordPolicy: js.UndefOr[PasswordPolicyType]
  }

  object UserPoolPolicyType {
    def apply(
        PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.undefined
    ): UserPoolPolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordPolicy" -> PasswordPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolPolicyType]
    }
  }

  /**
    * A container for information about the user pool.
    */
  @js.native
  trait UserPoolType extends js.Object {
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
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object UserPoolType {
    def apply(
        AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
        AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined,
        Arn: js.UndefOr[ArnType] = js.undefined,
        AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
        CreationDate: js.UndefOr[DateType] = js.undefined,
        CustomDomain: js.UndefOr[DomainType] = js.undefined,
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
        UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
        UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
        UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined,
        VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
    ): UserPoolType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdminCreateUserConfig" -> AdminCreateUserConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AliasAttributes" -> AliasAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoVerifiedAttributes" -> AutoVerifiedAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomDomain" -> CustomDomain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceConfiguration" -> DeviceConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailConfiguration" -> EmailConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailConfigurationFailure" -> EmailConfigurationFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailVerificationMessage" -> EmailVerificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailVerificationSubject" -> EmailVerificationSubject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedNumberOfUsers" -> EstimatedNumberOfUsers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaConfig" -> LambdaConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MfaConfiguration" -> MfaConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policies" -> Policies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaAttributes" -> SchemaAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsConfiguration" -> SmsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsConfigurationFailure" -> SmsConfigurationFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsVerificationMessage" -> SmsVerificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolAddOns" -> UserPoolAddOns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserPoolTags" -> UserPoolTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsernameAttributes" -> UsernameAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerificationMessageTemplate" -> VerificationMessageTemplate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolType]
    }
  }

  object UserStatusTypeEnum {
    val UNCONFIRMED           = "UNCONFIRMED"
    val CONFIRMED             = "CONFIRMED"
    val ARCHIVED              = "ARCHIVED"
    val COMPROMISED           = "COMPROMISED"
    val UNKNOWN               = "UNKNOWN"
    val RESET_REQUIRED        = "RESET_REQUIRED"
    val FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD"

    val values =
      IndexedSeq(UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD)
  }

  /**
    * The user type.
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
    def apply(
        Attributes: js.UndefOr[AttributeListType] = js.undefined,
        Enabled: js.UndefOr[BooleanType] = js.undefined,
        MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
        UserCreateDate: js.UndefOr[DateType] = js.undefined,
        UserLastModifiedDate: js.UndefOr[DateType] = js.undefined,
        UserStatus: js.UndefOr[UserStatusType] = js.undefined,
        Username: js.UndefOr[UsernameType] = js.undefined
    ): UserType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MFAOptions" -> MFAOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserCreateDate" -> UserCreateDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserLastModifiedDate" -> UserLastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserStatus" -> UserStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserType]
    }
  }

  object UsernameAttributeTypeEnum {
    val phone_number = "phone_number"
    val email        = "email"

    val values = IndexedSeq(phone_number, email)
  }

  /**
    * The template for verification messages.
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
    def apply(
        DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.undefined,
        EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
        EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.undefined,
        EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
        EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.undefined,
        SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    ): VerificationMessageTemplateType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultEmailOption" -> DefaultEmailOption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailMessage" -> EmailMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailMessageByLink" -> EmailMessageByLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailSubject" -> EmailSubject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailSubjectByLink" -> EmailSubjectByLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmsMessage" -> SmsMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerificationMessageTemplateType]
    }
  }

  object VerifiedAttributeTypeEnum {
    val phone_number = "phone_number"
    val email        = "email"

    val values = IndexedSeq(phone_number, email)
  }

  @js.native
  trait VerifySoftwareTokenRequest extends js.Object {
    var UserCode: SoftwareTokenMFAUserCodeType
    var AccessToken: js.UndefOr[TokenModelType]
    var FriendlyDeviceName: js.UndefOr[StringType]
    var Session: js.UndefOr[SessionType]
  }

  object VerifySoftwareTokenRequest {
    def apply(
        UserCode: SoftwareTokenMFAUserCodeType,
        AccessToken: js.UndefOr[TokenModelType] = js.undefined,
        FriendlyDeviceName: js.UndefOr[StringType] = js.undefined,
        Session: js.UndefOr[SessionType] = js.undefined
    ): VerifySoftwareTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserCode" -> UserCode.asInstanceOf[js.Any],
        "AccessToken" -> AccessToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FriendlyDeviceName" -> FriendlyDeviceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifySoftwareTokenRequest]
    }
  }

  @js.native
  trait VerifySoftwareTokenResponse extends js.Object {
    var Session: js.UndefOr[SessionType]
    var Status: js.UndefOr[VerifySoftwareTokenResponseType]
  }

  object VerifySoftwareTokenResponse {
    def apply(
        Session: js.UndefOr[SessionType] = js.undefined,
        Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.undefined
    ): VerifySoftwareTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifySoftwareTokenResponse]
    }
  }

  object VerifySoftwareTokenResponseTypeEnum {
    val SUCCESS = "SUCCESS"
    val ERROR   = "ERROR"

    val values = IndexedSeq(SUCCESS, ERROR)
  }

  /**
    * Represents the request to verify user attributes.
    */
  @js.native
  trait VerifyUserAttributeRequest extends js.Object {
    var AccessToken: TokenModelType
    var AttributeName: AttributeNameType
    var Code: ConfirmationCodeType
  }

  object VerifyUserAttributeRequest {
    def apply(
        AccessToken: TokenModelType,
        AttributeName: AttributeNameType,
        Code: ConfirmationCodeType
    ): VerifyUserAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken"   -> AccessToken.asInstanceOf[js.Any],
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Code"          -> Code.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyUserAttributeRequest]
    }
  }

  /**
    * A container representing the response from the server from the request to verify user attributes.
    */
  @js.native
  trait VerifyUserAttributeResponse extends js.Object {}

  object VerifyUserAttributeResponse {
    def apply(
        ): VerifyUserAttributeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyUserAttributeResponse]
    }
  }
}
