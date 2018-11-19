package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cognitoidentityprovider {
  type AWSAccountIdType = String
  type AccountTakeoverActionNotifyType = Boolean
  type AccountTakeoverEventActionType = String
  type AdminCreateUserUnusedAccountValidityDaysType = Int
  type AdvancedSecurityModeType = String
  type AliasAttributeType = String
  type AliasAttributesListType = js.Array[AliasAttributeType]
  type ArnType = String
  type AttributeDataType = String
  type AttributeListType = js.Array[AttributeType]
  type AttributeMappingKeyType = String
  type AttributeMappingType = js.Dictionary[StringType]
  type AttributeNameListType = js.Array[AttributeNameType]
  type AttributeNameType = String
  type AttributeValueType = String
  type AuthEventsType = js.Array[AuthEventType]
  type AuthFlowType = String
  type AuthParametersType = js.Dictionary[StringType]
  type BlockedIPRangeListType = js.Array[StringType]
  type BooleanType = Boolean
  type CSSType = String
  type CSSVersionType = String
  type CallbackURLsListType = js.Array[RedirectUrlType]
  type ChallengeName = String
  type ChallengeNameType = String
  type ChallengeParametersType = js.Dictionary[StringType]
  type ChallengeResponse = String
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
  type CompromisedCredentialsEventActionType = String
  type ConfirmationCodeType = String
  type CustomAttributeNameType = String
  type CustomAttributesListType = js.Array[SchemaAttributeType]
  type DateType = js.Date
  type DefaultEmailOptionType = String
  type DeliveryMediumListType = js.Array[DeliveryMediumType]
  type DeliveryMediumType = String
  type DescriptionType = String
  type DeviceKeyType = String
  type DeviceListType = js.Array[DeviceType]
  type DeviceNameType = String
  type DeviceRememberedStatusType = String
  type DomainStatusType = String
  type DomainType = String
  type DomainVersionType = String
  type EmailAddressType = String
  type EmailNotificationBodyType = String
  type EmailNotificationSubjectType = String
  type EmailVerificationMessageByLinkType = String
  type EmailVerificationMessageType = String
  type EmailVerificationSubjectByLinkType = String
  type EmailVerificationSubjectType = String
  type EventFilterType = String
  type EventFiltersType = js.Array[EventFilterType]
  type EventIdType = String
  type EventResponseType = String
  type EventType = String
  type ExplicitAuthFlowsListType = js.Array[ExplicitAuthFlowsType]
  type ExplicitAuthFlowsType = String
  type FeedbackValueType = String
  type ForceAliasCreation = Boolean
  type GenerateSecret = Boolean
  type GroupListType = js.Array[GroupType]
  type GroupNameType = String
  type HexStringType = String
  type HttpHeaderList = js.Array[HttpHeader]
  type IdentityProviderTypeType = String
  type IdpIdentifierType = String
  type IdpIdentifiersListType = js.Array[IdpIdentifierType]
  type ImageFileType = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageUrlType = String
  type IntegerType = Int
  type ListOfStringTypes = js.Array[StringType]
  type ListProvidersLimitType = Int
  type ListResourceServersLimitType = Int
  type LogoutURLsListType = js.Array[RedirectUrlType]
  type LongType = Double
  type MFAOptionListType = js.Array[MFAOptionType]
  type MessageActionType = String
  type OAuthFlowType = String
  type OAuthFlowsType = js.Array[OAuthFlowType]
  type PaginationKey = String
  type PaginationKeyType = String
  type PasswordPolicyMinLengthType = Int
  type PasswordType = String
  type PoolQueryLimitType = Int
  type PreSignedUrlType = String
  type PrecedenceType = Int
  type ProviderDetailsType = js.Dictionary[StringType]
  type ProviderNameType = String
  type ProviderNameTypeV1 = String
  type ProvidersListType = js.Array[ProviderDescription]
  type QueryLimit = Int
  type QueryLimitType = Int
  type RedirectUrlType = String
  type RefreshTokenValidityType = Int
  type ResourceServerIdentifierType = String
  type ResourceServerNameType = String
  type ResourceServerScopeDescriptionType = String
  type ResourceServerScopeListType = js.Array[ResourceServerScopeType]
  type ResourceServerScopeNameType = String
  type ResourceServersListType = js.Array[ResourceServerType]
  type RiskDecisionType = String
  type RiskLevelType = String
  type S3BucketType = String
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
  type StatusType = String
  type StringType = String
  type SupportedIdentityProvidersListType = js.Array[ProviderNameType]
  type TokenModelType = String
  type UserFilterType = String
  type UserImportJobIdType = String
  type UserImportJobNameType = String
  type UserImportJobStatusType = String
  type UserImportJobsListType = js.Array[UserImportJobType]
  type UserMFASettingListType = js.Array[StringType]
  type UserPoolClientListType = js.Array[UserPoolClientDescription]
  type UserPoolIdType = String
  type UserPoolListType = js.Array[UserPoolDescriptionType]
  type UserPoolMfaType = String
  type UserPoolNameType = String
  type UserPoolTagsType = js.Dictionary[StringType]
  type UserStatusType = String
  type UsernameAttributeType = String
  type UsernameAttributesListType = js.Array[UsernameAttributeType]
  type UsernameType = String
  type UsersListType = js.Array[UserType]
  type VerifiedAttributeType = String
  type VerifiedAttributesListType = js.Array[VerifiedAttributeType]
  type VerifySoftwareTokenResponseType = String
}

package cognitoidentityprovider {
  @js.native
  @JSImport("aws-sdk", "CognitoIdentityServiceProvider")
  class CognitoIdentityProvider(config: AWSConfig) extends js.Object {
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
    def listUserImportJobs(params: ListUserImportJobsRequest): Request[ListUserImportJobsResponse] = js.native
    def listUserPoolClients(params: ListUserPoolClientsRequest): Request[ListUserPoolClientsResponse] = js.native
    def listUserPools(params: ListUserPoolsRequest): Request[ListUserPoolsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listUsersInGroup(params: ListUsersInGroupRequest): Request[ListUsersInGroupResponse] = js.native
    def resendConfirmationCode(params: ResendConfirmationCodeRequest): Request[ResendConfirmationCodeResponse] = js.native
    def respondToAuthChallenge(params: RespondToAuthChallengeRequest): Request[RespondToAuthChallengeResponse] = js.native
    def setRiskConfiguration(params: SetRiskConfigurationRequest): Request[SetRiskConfigurationResponse] = js.native
    def setUICustomization(params: SetUICustomizationRequest): Request[SetUICustomizationResponse] = js.native
    def setUserMFAPreference(params: SetUserMFAPreferenceRequest): Request[SetUserMFAPreferenceResponse] = js.native
    def setUserPoolMfaConfig(params: SetUserPoolMfaConfigRequest): Request[SetUserPoolMfaConfigResponse] = js.native
    def setUserSettings(params: SetUserSettingsRequest): Request[SetUserSettingsResponse] = js.native
    def signUp(params: SignUpRequest): Request[SignUpResponse] = js.native
    def startUserImportJob(params: StartUserImportJobRequest): Request[StartUserImportJobResponse] = js.native
    def stopUserImportJob(params: StopUserImportJobRequest): Request[StopUserImportJobResponse] = js.native
    def updateAuthEventFeedback(params: UpdateAuthEventFeedbackRequest): Request[UpdateAuthEventFeedbackResponse] = js.native
    def updateDeviceStatus(params: UpdateDeviceStatusRequest): Request[UpdateDeviceStatusResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateIdentityProvider(params: UpdateIdentityProviderRequest): Request[UpdateIdentityProviderResponse] = js.native
    def updateResourceServer(params: UpdateResourceServerRequest): Request[UpdateResourceServerResponse] = js.native
    def updateUserAttributes(params: UpdateUserAttributesRequest): Request[UpdateUserAttributesResponse] = js.native
    def updateUserPool(params: UpdateUserPoolRequest): Request[UpdateUserPoolResponse] = js.native
    def updateUserPoolClient(params: UpdateUserPoolClientRequest): Request[UpdateUserPoolClientResponse] = js.native
    def verifySoftwareToken(params: VerifySoftwareTokenRequest): Request[VerifySoftwareTokenResponse] = js.native
    def verifyUserAttribute(params: VerifyUserAttributeRequest): Request[VerifyUserAttributeResponse] = js.native
  }

  /**
   * <p>Account takeover action type.</p>
   */
  @js.native
  trait AccountTakeoverActionType extends js.Object {
    var Notify: js.UndefOr[AccountTakeoverActionNotifyType]
    var EventAction: js.UndefOr[AccountTakeoverEventActionType]
  }

  object AccountTakeoverActionType {
    def apply(
      Notify: js.UndefOr[AccountTakeoverActionNotifyType] = js.undefined,
      EventAction: js.UndefOr[AccountTakeoverEventActionType] = js.undefined): AccountTakeoverActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notify" -> Notify.map { x => x.asInstanceOf[js.Any] },
        "EventAction" -> EventAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountTakeoverActionType]
    }
  }

  /**
   * <p>Account takeover actions type.</p>
   */
  @js.native
  trait AccountTakeoverActionsType extends js.Object {
    var LowAction: js.UndefOr[AccountTakeoverActionType]
    var MediumAction: js.UndefOr[AccountTakeoverActionType]
    var HighAction: js.UndefOr[AccountTakeoverActionType]
  }

  object AccountTakeoverActionsType {
    def apply(
      LowAction: js.UndefOr[AccountTakeoverActionType] = js.undefined,
      MediumAction: js.UndefOr[AccountTakeoverActionType] = js.undefined,
      HighAction: js.UndefOr[AccountTakeoverActionType] = js.undefined): AccountTakeoverActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LowAction" -> LowAction.map { x => x.asInstanceOf[js.Any] },
        "MediumAction" -> MediumAction.map { x => x.asInstanceOf[js.Any] },
        "HighAction" -> HighAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountTakeoverActionsType]
    }
  }

  object AccountTakeoverEventActionTypeEnum {
    val BLOCK = "BLOCK"
    val MFA_IF_CONFIGURED = "MFA_IF_CONFIGURED"
    val MFA_REQUIRED = "MFA_REQUIRED"
    val NO_ACTION = "NO_ACTION"

    val values = IndexedSeq(BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION)
  }

  /**
   * <p>Configuration for mitigation actions and notification for different levels of risk detected for a potential account takeover.</p>
   */
  @js.native
  trait AccountTakeoverRiskConfigurationType extends js.Object {
    var NotifyConfiguration: js.UndefOr[NotifyConfigurationType]
    var Actions: js.UndefOr[AccountTakeoverActionsType]
  }

  object AccountTakeoverRiskConfigurationType {
    def apply(
      NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.undefined,
      Actions: js.UndefOr[AccountTakeoverActionsType] = js.undefined): AccountTakeoverRiskConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotifyConfiguration" -> NotifyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountTakeoverRiskConfigurationType]
    }
  }

  /**
   * <p>Represents the request to add custom attributes.</p>
   */
  @js.native
  trait AddCustomAttributesRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var CustomAttributes: js.UndefOr[CustomAttributesListType]
  }

  object AddCustomAttributesRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      CustomAttributes: js.UndefOr[CustomAttributesListType] = js.undefined): AddCustomAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "CustomAttributes" -> CustomAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCustomAttributesRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the request to add custom attributes.</p>
   */
  @js.native
  trait AddCustomAttributesResponse extends js.Object {

  }

  object AddCustomAttributesResponse {
    def apply(): AddCustomAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCustomAttributesResponse]
    }
  }

  @js.native
  trait AdminAddUserToGroupRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var GroupName: js.UndefOr[GroupNameType]
  }

  object AdminAddUserToGroupRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      GroupName: js.UndefOr[GroupNameType] = js.undefined): AdminAddUserToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminAddUserToGroupRequest]
    }
  }

  /**
   * <p>Represents the request to confirm user registration.</p>
   */
  @js.native
  trait AdminConfirmSignUpRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminConfirmSignUpRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminConfirmSignUpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminConfirmSignUpRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the request to confirm registration.</p>
   */
  @js.native
  trait AdminConfirmSignUpResponse extends js.Object {

  }

  object AdminConfirmSignUpResponse {
    def apply(): AdminConfirmSignUpResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminConfirmSignUpResponse]
    }
  }

  /**
   * <p>The configuration for creating a new user profile.</p>
   */
  @js.native
  trait AdminCreateUserConfigType extends js.Object {
    var AllowAdminCreateUserOnly: js.UndefOr[BooleanType]
    var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType]
    var InviteMessageTemplate: js.UndefOr[MessageTemplateType]
  }

  object AdminCreateUserConfigType {
    def apply(
      AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined,
      UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined,
      InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.undefined): AdminCreateUserConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowAdminCreateUserOnly" -> AllowAdminCreateUserOnly.map { x => x.asInstanceOf[js.Any] },
        "UnusedAccountValidityDays" -> UnusedAccountValidityDays.map { x => x.asInstanceOf[js.Any] },
        "InviteMessageTemplate" -> InviteMessageTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminCreateUserConfigType]
    }
  }

  /**
   * <p>Represents the request to create a user in the specified user pool.</p>
   */
  @js.native
  trait AdminCreateUserRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ValidationData: js.UndefOr[AttributeListType]
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation]
    var UserAttributes: js.UndefOr[AttributeListType]
    var MessageAction: js.UndefOr[MessageActionType]
    var TemporaryPassword: js.UndefOr[PasswordType]
  }

  object AdminCreateUserRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ValidationData: js.UndefOr[AttributeListType] = js.undefined,
      ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
      UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
      MessageAction: js.UndefOr[MessageActionType] = js.undefined,
      TemporaryPassword: js.UndefOr[PasswordType] = js.undefined): AdminCreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "DesiredDeliveryMediums" -> DesiredDeliveryMediums.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ValidationData" -> ValidationData.map { x => x.asInstanceOf[js.Any] },
        "ForceAliasCreation" -> ForceAliasCreation.map { x => x.asInstanceOf[js.Any] },
        "UserAttributes" -> UserAttributes.map { x => x.asInstanceOf[js.Any] },
        "MessageAction" -> MessageAction.map { x => x.asInstanceOf[js.Any] },
        "TemporaryPassword" -> TemporaryPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminCreateUserRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to create the user.</p>
   */
  @js.native
  trait AdminCreateUserResponse extends js.Object {
    var User: js.UndefOr[UserType]
  }

  object AdminCreateUserResponse {
    def apply(
      User: js.UndefOr[UserType] = js.undefined): AdminCreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminCreateUserResponse]
    }
  }

  /**
   * <p>Represents the request to delete user attributes as an administrator.</p>
   */
  @js.native
  trait AdminDeleteUserAttributesRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var UserAttributeNames: js.UndefOr[AttributeNameListType]
  }

  object AdminDeleteUserAttributesRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      UserAttributeNames: js.UndefOr[AttributeNameListType] = js.undefined): AdminDeleteUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "UserAttributeNames" -> UserAttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDeleteUserAttributesRequest]
    }
  }

  /**
   * <p>Represents the response received from the server for a request to delete user attributes.</p>
   */
  @js.native
  trait AdminDeleteUserAttributesResponse extends js.Object {

  }

  object AdminDeleteUserAttributesResponse {
    def apply(): AdminDeleteUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDeleteUserAttributesResponse]
    }
  }

  /**
   * <p>Represents the request to delete a user as an administrator.</p>
   */
  @js.native
  trait AdminDeleteUserRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminDeleteUserRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminDeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDeleteUserRequest]
    }
  }

  @js.native
  trait AdminDisableProviderForUserRequest extends js.Object {
    var UserPoolId: js.UndefOr[StringType]
    var User: js.UndefOr[ProviderUserIdentifierType]
  }

  object AdminDisableProviderForUserRequest {
    def apply(
      UserPoolId: js.UndefOr[StringType] = js.undefined,
      User: js.UndefOr[ProviderUserIdentifierType] = js.undefined): AdminDisableProviderForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableProviderForUserRequest]
    }
  }

  @js.native
  trait AdminDisableProviderForUserResponse extends js.Object {

  }

  object AdminDisableProviderForUserResponse {
    def apply(): AdminDisableProviderForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableProviderForUserResponse]
    }
  }

  /**
   * <p>Represents the request to disable any user as an administrator.</p>
   */
  @js.native
  trait AdminDisableUserRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminDisableUserRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminDisableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableUserRequest]
    }
  }

  /**
   * <p>Represents the response received from the server to disable the user as an administrator.</p>
   */
  @js.native
  trait AdminDisableUserResponse extends js.Object {

  }

  object AdminDisableUserResponse {
    def apply(): AdminDisableUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminDisableUserResponse]
    }
  }

  /**
   * <p>Represents the request that enables the user as an administrator.</p>
   */
  @js.native
  trait AdminEnableUserRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminEnableUserRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminEnableUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminEnableUserRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the request to enable a user as an administrator.</p>
   */
  @js.native
  trait AdminEnableUserResponse extends js.Object {

  }

  object AdminEnableUserResponse {
    def apply(): AdminEnableUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminEnableUserResponse]
    }
  }

  /**
   * <p>Sends the forgot device request, as an administrator.</p>
   */
  @js.native
  trait AdminForgetDeviceRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
  }

  object AdminForgetDeviceRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined): AdminForgetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminForgetDeviceRequest]
    }
  }

  /**
   * <p>Represents the request to get the device, as an administrator.</p>
   */
  @js.native
  trait AdminGetDeviceRequest extends js.Object {
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminGetDeviceRequest {
    def apply(
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminGetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetDeviceRequest]
    }
  }

  /**
   * <p>Gets the device response, as an administrator.</p>
   */
  @js.native
  trait AdminGetDeviceResponse extends js.Object {
    var Device: js.UndefOr[DeviceType]
  }

  object AdminGetDeviceResponse {
    def apply(
      Device: js.UndefOr[DeviceType] = js.undefined): AdminGetDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetDeviceResponse]
    }
  }

  /**
   * <p>Represents the request to get the specified user as an administrator.</p>
   */
  @js.native
  trait AdminGetUserRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminGetUserRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminGetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetUserRequest]
    }
  }

  /**
   * <p>Represents the response from the server from the request to get the specified user as an administrator.</p>
   */
  @js.native
  trait AdminGetUserResponse extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var UserLastModifiedDate: js.UndefOr[DateType]
    var UserStatus: js.UndefOr[UserStatusType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var Enabled: js.UndefOr[BooleanType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var PreferredMfaSetting: js.UndefOr[StringType]
    var UserMFASettingList: js.UndefOr[UserMFASettingListType]
    var UserCreateDate: js.UndefOr[DateType]
  }

  object AdminGetUserResponse {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      UserLastModifiedDate: js.UndefOr[DateType] = js.undefined,
      UserStatus: js.UndefOr[UserStatusType] = js.undefined,
      MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
      Enabled: js.UndefOr[BooleanType] = js.undefined,
      UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
      PreferredMfaSetting: js.UndefOr[StringType] = js.undefined,
      UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined,
      UserCreateDate: js.UndefOr[DateType] = js.undefined): AdminGetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "UserLastModifiedDate" -> UserLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "UserStatus" -> UserStatus.map { x => x.asInstanceOf[js.Any] },
        "MFAOptions" -> MFAOptions.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "UserAttributes" -> UserAttributes.map { x => x.asInstanceOf[js.Any] },
        "PreferredMfaSetting" -> PreferredMfaSetting.map { x => x.asInstanceOf[js.Any] },
        "UserMFASettingList" -> UserMFASettingList.map { x => x.asInstanceOf[js.Any] },
        "UserCreateDate" -> UserCreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminGetUserResponse]
    }
  }

  /**
   * <p>Initiates the authorization request, as an administrator.</p>
   */
  @js.native
  trait AdminInitiateAuthRequest extends js.Object {
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var AuthParameters: js.UndefOr[AuthParametersType]
    var ContextData: js.UndefOr[ContextDataType]
    var ClientId: js.UndefOr[ClientIdType]
    var AuthFlow: js.UndefOr[AuthFlowType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object AdminInitiateAuthRequest {
    def apply(
      ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      AuthParameters: js.UndefOr[AuthParametersType] = js.undefined,
      ContextData: js.UndefOr[ContextDataType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      AuthFlow: js.UndefOr[AuthFlowType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): AdminInitiateAuthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientMetadata" -> ClientMetadata.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "AuthParameters" -> AuthParameters.map { x => x.asInstanceOf[js.Any] },
        "ContextData" -> ContextData.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "AuthFlow" -> AuthFlow.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminInitiateAuthRequest]
    }
  }

  /**
   * <p>Initiates the authentication response, as an administrator.</p>
   */
  @js.native
  trait AdminInitiateAuthResponse extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var Session: js.UndefOr[SessionType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
  }

  object AdminInitiateAuthResponse {
    def apply(
      ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
      AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined): AdminInitiateAuthResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "ChallengeParameters" -> ChallengeParameters.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationResult" -> AuthenticationResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminInitiateAuthResponse]
    }
  }

  @js.native
  trait AdminLinkProviderForUserRequest extends js.Object {
    var UserPoolId: js.UndefOr[StringType]
    var DestinationUser: js.UndefOr[ProviderUserIdentifierType]
    var SourceUser: js.UndefOr[ProviderUserIdentifierType]
  }

  object AdminLinkProviderForUserRequest {
    def apply(
      UserPoolId: js.UndefOr[StringType] = js.undefined,
      DestinationUser: js.UndefOr[ProviderUserIdentifierType] = js.undefined,
      SourceUser: js.UndefOr[ProviderUserIdentifierType] = js.undefined): AdminLinkProviderForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "DestinationUser" -> DestinationUser.map { x => x.asInstanceOf[js.Any] },
        "SourceUser" -> SourceUser.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminLinkProviderForUserRequest]
    }
  }

  @js.native
  trait AdminLinkProviderForUserResponse extends js.Object {

  }

  object AdminLinkProviderForUserResponse {
    def apply(): AdminLinkProviderForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminLinkProviderForUserResponse]
    }
  }

  /**
   * <p>Represents the request to list devices, as an administrator.</p>
   */
  @js.native
  trait AdminListDevicesRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object AdminListDevicesRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      Limit: js.UndefOr[QueryLimitType] = js.undefined,
      PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined): AdminListDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListDevicesRequest]
    }
  }

  /**
   * <p>Lists the device's response, as an administrator.</p>
   */
  @js.native
  trait AdminListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object AdminListDevicesResponse {
    def apply(
      Devices: js.UndefOr[DeviceListType] = js.undefined,
      PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined): AdminListDevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Devices" -> Devices.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListDevicesResponse]
    }
  }

  @js.native
  trait AdminListGroupsForUserRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListGroupsForUserRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Limit: js.UndefOr[QueryLimitType] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): AdminListGroupsForUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): AdminListGroupsForUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListGroupsForUserResponse]
    }
  }

  @js.native
  trait AdminListUserAuthEventsRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var MaxResults: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object AdminListUserAuthEventsRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      MaxResults: js.UndefOr[QueryLimitType] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): AdminListUserAuthEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): AdminListUserAuthEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthEvents" -> AuthEvents.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminListUserAuthEventsResponse]
    }
  }

  @js.native
  trait AdminRemoveUserFromGroupRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var GroupName: js.UndefOr[GroupNameType]
  }

  object AdminRemoveUserFromGroupRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      GroupName: js.UndefOr[GroupNameType] = js.undefined): AdminRemoveUserFromGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminRemoveUserFromGroupRequest]
    }
  }

  /**
   * <p>Represents the request to reset a user's password as an administrator.</p>
   */
  @js.native
  trait AdminResetUserPasswordRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminResetUserPasswordRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminResetUserPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminResetUserPasswordRequest]
    }
  }

  /**
   * <p>Represents the response from the server to reset a user password as an administrator.</p>
   */
  @js.native
  trait AdminResetUserPasswordResponse extends js.Object {

  }

  object AdminResetUserPasswordResponse {
    def apply(): AdminResetUserPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminResetUserPasswordResponse]
    }
  }

  /**
   * <p>The request to respond to the authentication challenge, as an administrator.</p>
   */
  @js.native
  trait AdminRespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Session: js.UndefOr[SessionType]
    var ContextData: js.UndefOr[ContextDataType]
    var ClientId: js.UndefOr[ClientIdType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object AdminRespondToAuthChallengeRequest {
    def apply(
      ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      ContextData: js.UndefOr[ContextDataType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): AdminRespondToAuthChallengeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "ContextData" -> ContextData.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ChallengeResponses" -> ChallengeResponses.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminRespondToAuthChallengeRequest]
    }
  }

  /**
   * <p>Responds to the authentication challenge, as an administrator.</p>
   */
  @js.native
  trait AdminRespondToAuthChallengeResponse extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var Session: js.UndefOr[SessionType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
  }

  object AdminRespondToAuthChallengeResponse {
    def apply(
      ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
      AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined): AdminRespondToAuthChallengeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "ChallengeParameters" -> ChallengeParameters.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationResult" -> AuthenticationResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminRespondToAuthChallengeResponse]
    }
  }

  @js.native
  trait AdminSetUserMFAPreferenceRequest extends js.Object {
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
    var Username: js.UndefOr[UsernameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object AdminSetUserMFAPreferenceRequest {
    def apply(
      SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined,
      SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): AdminSetUserMFAPreferenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMSMfaSettings" -> SMSMfaSettings.map { x => x.asInstanceOf[js.Any] },
        "SoftwareTokenMfaSettings" -> SoftwareTokenMfaSettings.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserMFAPreferenceRequest]
    }
  }

  @js.native
  trait AdminSetUserMFAPreferenceResponse extends js.Object {

  }

  object AdminSetUserMFAPreferenceResponse {
    def apply(): AdminSetUserMFAPreferenceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserMFAPreferenceResponse]
    }
  }

  /**
   * <p>Represents the request to set user settings as an administrator.</p>
   */
  @js.native
  trait AdminSetUserSettingsRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
  }

  object AdminSetUserSettingsRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined): AdminSetUserSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "MFAOptions" -> MFAOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserSettingsRequest]
    }
  }

  /**
   * <p>Represents the response from the server to set user settings as an administrator.</p>
   */
  @js.native
  trait AdminSetUserSettingsResponse extends js.Object {

  }

  object AdminSetUserSettingsResponse {
    def apply(): AdminSetUserSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminSetUserSettingsResponse]
    }
  }

  @js.native
  trait AdminUpdateAuthEventFeedbackRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var EventId: js.UndefOr[EventIdType]
    var FeedbackValue: js.UndefOr[FeedbackValueType]
  }

  object AdminUpdateAuthEventFeedbackRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      EventId: js.UndefOr[EventIdType] = js.undefined,
      FeedbackValue: js.UndefOr[FeedbackValueType] = js.undefined): AdminUpdateAuthEventFeedbackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "FeedbackValue" -> FeedbackValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateAuthEventFeedbackRequest]
    }
  }

  @js.native
  trait AdminUpdateAuthEventFeedbackResponse extends js.Object {

  }

  object AdminUpdateAuthEventFeedbackResponse {
    def apply(): AdminUpdateAuthEventFeedbackResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateAuthEventFeedbackResponse]
    }
  }

  /**
   * <p>The request to update the device status, as an administrator.</p>
   */
  @js.native
  trait AdminUpdateDeviceStatusRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  object AdminUpdateDeviceStatusRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
      DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined): AdminUpdateDeviceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] },
        "DeviceRememberedStatus" -> DeviceRememberedStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateDeviceStatusRequest]
    }
  }

  /**
   * <p>The status response from the request to update the device, as an administrator.</p>
   */
  @js.native
  trait AdminUpdateDeviceStatusResponse extends js.Object {

  }

  object AdminUpdateDeviceStatusResponse {
    def apply(): AdminUpdateDeviceStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateDeviceStatusResponse]
    }
  }

  /**
   * <p>Represents the request to update the user's attributes as an administrator.</p>
   */
  @js.native
  trait AdminUpdateUserAttributesRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
    var UserAttributes: js.UndefOr[AttributeListType]
  }

  object AdminUpdateUserAttributesRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined,
      UserAttributes: js.UndefOr[AttributeListType] = js.undefined): AdminUpdateUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "UserAttributes" -> UserAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateUserAttributesRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the request to update user attributes as an administrator.</p>
   */
  @js.native
  trait AdminUpdateUserAttributesResponse extends js.Object {

  }

  object AdminUpdateUserAttributesResponse {
    def apply(): AdminUpdateUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUpdateUserAttributesResponse]
    }
  }

  /**
   * <p>The request to sign out of all devices, as an administrator.</p>
   */
  @js.native
  trait AdminUserGlobalSignOutRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Username: js.UndefOr[UsernameType]
  }

  object AdminUserGlobalSignOutRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): AdminUserGlobalSignOutRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUserGlobalSignOutRequest]
    }
  }

  /**
   * <p>The global sign-out response, as an administrator.</p>
   */
  @js.native
  trait AdminUserGlobalSignOutResponse extends js.Object {

  }

  object AdminUserGlobalSignOutResponse {
    def apply(): AdminUserGlobalSignOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdminUserGlobalSignOutResponse]
    }
  }

  object AdvancedSecurityModeTypeEnum {
    val OFF = "OFF"
    val AUDIT = "AUDIT"
    val ENFORCED = "ENFORCED"

    val values = IndexedSeq(OFF, AUDIT, ENFORCED)
  }

  object AliasAttributeTypeEnum {
    val phone_number = "phone_number"
    val email = "email"
    val preferred_username = "preferred_username"

    val values = IndexedSeq(phone_number, email, preferred_username)
  }

  /**
   * <p>The Amazon Pinpoint analytics configuration for collecting metrics for a user pool.</p>
   */
  @js.native
  trait AnalyticsConfigurationType extends js.Object {
    var ApplicationId: js.UndefOr[HexStringType]
    var RoleArn: js.UndefOr[ArnType]
    var ExternalId: js.UndefOr[StringType]
    var UserDataShared: js.UndefOr[BooleanType]
  }

  object AnalyticsConfigurationType {
    def apply(
      ApplicationId: js.UndefOr[HexStringType] = js.undefined,
      RoleArn: js.UndefOr[ArnType] = js.undefined,
      ExternalId: js.UndefOr[StringType] = js.undefined,
      UserDataShared: js.UndefOr[BooleanType] = js.undefined): AnalyticsConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "UserDataShared" -> UserDataShared.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsConfigurationType]
    }
  }

  /**
   * <p>An Amazon Pinpoint analytics endpoint.</p> <p>An endpoint uniquely identifies a mobile device, email address, or phone number that can receive messages from Amazon Pinpoint analytics.</p>
   */
  @js.native
  trait AnalyticsMetadataType extends js.Object {
    var AnalyticsEndpointId: js.UndefOr[StringType]
  }

  object AnalyticsMetadataType {
    def apply(
      AnalyticsEndpointId: js.UndefOr[StringType] = js.undefined): AnalyticsMetadataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnalyticsEndpointId" -> AnalyticsEndpointId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Session: js.UndefOr[SessionType] = js.undefined): AssociateSoftwareTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Session: js.UndefOr[SessionType] = js.undefined): AssociateSoftwareTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretCode" -> SecretCode.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSoftwareTokenResponse]
    }
  }

  object AttributeDataTypeEnum {
    val String = "String"
    val Number = "Number"
    val DateTime = "DateTime"
    val Boolean = "Boolean"

    val values = IndexedSeq(String, Number, DateTime, Boolean)
  }

  /**
   * <p>Specifies whether the attribute is standard or custom.</p>
   */
  @js.native
  trait AttributeType extends js.Object {
    var Name: js.UndefOr[AttributeNameType]
    var Value: js.UndefOr[AttributeValueType]
  }

  object AttributeType {
    def apply(
      Name: js.UndefOr[AttributeNameType] = js.undefined,
      Value: js.UndefOr[AttributeValueType] = js.undefined): AttributeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeType]
    }
  }

  /**
   * <p>The authentication event type.</p>
   */
  @js.native
  trait AuthEventType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var EventFeedback: js.UndefOr[EventFeedbackType]
    var EventType: js.UndefOr[EventType]
    var EventId: js.UndefOr[StringType]
    var EventRisk: js.UndefOr[EventRiskType]
    var EventContextData: js.UndefOr[EventContextDataType]
    var ChallengeResponses: js.UndefOr[ChallengeResponseListType]
    var EventResponse: js.UndefOr[EventResponseType]
  }

  object AuthEventType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      EventFeedback: js.UndefOr[EventFeedbackType] = js.undefined,
      EventType: js.UndefOr[EventType] = js.undefined,
      EventId: js.UndefOr[StringType] = js.undefined,
      EventRisk: js.UndefOr[EventRiskType] = js.undefined,
      EventContextData: js.UndefOr[EventContextDataType] = js.undefined,
      ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.undefined,
      EventResponse: js.UndefOr[EventResponseType] = js.undefined): AuthEventType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "EventFeedback" -> EventFeedback.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "EventRisk" -> EventRisk.map { x => x.asInstanceOf[js.Any] },
        "EventContextData" -> EventContextData.map { x => x.asInstanceOf[js.Any] },
        "ChallengeResponses" -> ChallengeResponses.map { x => x.asInstanceOf[js.Any] },
        "EventResponse" -> EventResponse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthEventType]
    }
  }

  object AuthFlowTypeEnum {
    val USER_SRP_AUTH = "USER_SRP_AUTH"
    val REFRESH_TOKEN_AUTH = "REFRESH_TOKEN_AUTH"
    val REFRESH_TOKEN = "REFRESH_TOKEN"
    val CUSTOM_AUTH = "CUSTOM_AUTH"
    val ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH"
    val USER_PASSWORD_AUTH = "USER_PASSWORD_AUTH"

    val values = IndexedSeq(USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN, CUSTOM_AUTH, ADMIN_NO_SRP_AUTH, USER_PASSWORD_AUTH)
  }

  /**
   * <p>The authentication result.</p>
   */
  @js.native
  trait AuthenticationResultType extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType]
    var IdToken: js.UndefOr[TokenModelType]
    var RefreshToken: js.UndefOr[TokenModelType]
    var TokenType: js.UndefOr[StringType]
    var ExpiresIn: js.UndefOr[IntegerType]
  }

  object AuthenticationResultType {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.undefined,
      IdToken: js.UndefOr[TokenModelType] = js.undefined,
      RefreshToken: js.UndefOr[TokenModelType] = js.undefined,
      TokenType: js.UndefOr[StringType] = js.undefined,
      ExpiresIn: js.UndefOr[IntegerType] = js.undefined): AuthenticationResultType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "NewDeviceMetadata" -> NewDeviceMetadata.map { x => x.asInstanceOf[js.Any] },
        "IdToken" -> IdToken.map { x => x.asInstanceOf[js.Any] },
        "RefreshToken" -> RefreshToken.map { x => x.asInstanceOf[js.Any] },
        "TokenType" -> TokenType.map { x => x.asInstanceOf[js.Any] },
        "ExpiresIn" -> ExpiresIn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthenticationResultType]
    }
  }

  object ChallengeNameEnum {
    val Password = "Password"
    val Mfa = "Mfa"

    val values = IndexedSeq(Password, Mfa)
  }

  object ChallengeNameTypeEnum {
    val SMS_MFA = "SMS_MFA"
    val SOFTWARE_TOKEN_MFA = "SOFTWARE_TOKEN_MFA"
    val SELECT_MFA_TYPE = "SELECT_MFA_TYPE"
    val MFA_SETUP = "MFA_SETUP"
    val PASSWORD_VERIFIER = "PASSWORD_VERIFIER"
    val CUSTOM_CHALLENGE = "CUSTOM_CHALLENGE"
    val DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH"
    val DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER"
    val ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH"
    val NEW_PASSWORD_REQUIRED = "NEW_PASSWORD_REQUIRED"

    val values = IndexedSeq(SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE, MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED)
  }

  object ChallengeResponseEnum {
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Success, Failure)
  }

  /**
   * <p>The challenge response type.</p>
   */
  @js.native
  trait ChallengeResponseType extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeName]
    var ChallengeResponse: js.UndefOr[ChallengeResponse]
  }

  object ChallengeResponseType {
    def apply(
      ChallengeName: js.UndefOr[ChallengeName] = js.undefined,
      ChallengeResponse: js.UndefOr[ChallengeResponse] = js.undefined): ChallengeResponseType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "ChallengeResponse" -> ChallengeResponse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChallengeResponseType]
    }
  }

  /**
   * <p>Represents the request to change a user password.</p>
   */
  @js.native
  trait ChangePasswordRequest extends js.Object {
    var PreviousPassword: js.UndefOr[PasswordType]
    var ProposedPassword: js.UndefOr[PasswordType]
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object ChangePasswordRequest {
    def apply(
      PreviousPassword: js.UndefOr[PasswordType] = js.undefined,
      ProposedPassword: js.UndefOr[PasswordType] = js.undefined,
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): ChangePasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreviousPassword" -> PreviousPassword.map { x => x.asInstanceOf[js.Any] },
        "ProposedPassword" -> ProposedPassword.map { x => x.asInstanceOf[js.Any] },
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangePasswordRequest]
    }
  }

  /**
   * <p>The response from the server to the change password request.</p>
   */
  @js.native
  trait ChangePasswordResponse extends js.Object {

  }

  object ChangePasswordResponse {
    def apply(): ChangePasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangePasswordResponse]
    }
  }

  /**
   * <p>The code delivery details being returned from the server.</p>
   */
  @js.native
  trait CodeDeliveryDetailsType extends js.Object {
    var Destination: js.UndefOr[StringType]
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
    var AttributeName: js.UndefOr[AttributeNameType]
  }

  object CodeDeliveryDetailsType {
    def apply(
      Destination: js.UndefOr[StringType] = js.undefined,
      DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined,
      AttributeName: js.UndefOr[AttributeNameType] = js.undefined): CodeDeliveryDetailsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "DeliveryMedium" -> DeliveryMedium.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeDeliveryDetailsType]
    }
  }

  /**
   * <p>The compromised credentials actions type</p>
   */
  @js.native
  trait CompromisedCredentialsActionsType extends js.Object {
    var EventAction: js.UndefOr[CompromisedCredentialsEventActionType]
  }

  object CompromisedCredentialsActionsType {
    def apply(
      EventAction: js.UndefOr[CompromisedCredentialsEventActionType] = js.undefined): CompromisedCredentialsActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventAction" -> EventAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompromisedCredentialsActionsType]
    }
  }

  object CompromisedCredentialsEventActionTypeEnum {
    val BLOCK = "BLOCK"
    val NO_ACTION = "NO_ACTION"

    val values = IndexedSeq(BLOCK, NO_ACTION)
  }

  /**
   * <p>The compromised credentials risk configuration type.</p>
   */
  @js.native
  trait CompromisedCredentialsRiskConfigurationType extends js.Object {
    var EventFilter: js.UndefOr[EventFiltersType]
    var Actions: js.UndefOr[CompromisedCredentialsActionsType]
  }

  object CompromisedCredentialsRiskConfigurationType {
    def apply(
      EventFilter: js.UndefOr[EventFiltersType] = js.undefined,
      Actions: js.UndefOr[CompromisedCredentialsActionsType] = js.undefined): CompromisedCredentialsRiskConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventFilter" -> EventFilter.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompromisedCredentialsRiskConfigurationType]
    }
  }

  /**
   * <p>Confirms the device request.</p>
   */
  @js.native
  trait ConfirmDeviceRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType]
    var DeviceName: js.UndefOr[DeviceNameType]
  }

  object ConfirmDeviceRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
      DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.undefined,
      DeviceName: js.UndefOr[DeviceNameType] = js.undefined): ConfirmDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] },
        "DeviceSecretVerifierConfig" -> DeviceSecretVerifierConfig.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmDeviceRequest]
    }
  }

  /**
   * <p>Confirms the device response.</p>
   */
  @js.native
  trait ConfirmDeviceResponse extends js.Object {
    var UserConfirmationNecessary: js.UndefOr[BooleanType]
  }

  object ConfirmDeviceResponse {
    def apply(
      UserConfirmationNecessary: js.UndefOr[BooleanType] = js.undefined): ConfirmDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserConfirmationNecessary" -> UserConfirmationNecessary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmDeviceResponse]
    }
  }

  /**
   * <p>The request representing the confirmation for a password reset.</p>
   */
  @js.native
  trait ConfirmForgotPasswordRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var SecretHash: js.UndefOr[SecretHashType]
    var Password: js.UndefOr[PasswordType]
    var ClientId: js.UndefOr[ClientIdType]
    var ConfirmationCode: js.UndefOr[ConfirmationCodeType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object ConfirmForgotPasswordRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      SecretHash: js.UndefOr[SecretHashType] = js.undefined,
      Password: js.UndefOr[PasswordType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      ConfirmationCode: js.UndefOr[ConfirmationCodeType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): ConfirmForgotPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "SecretHash" -> SecretHash.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ConfirmationCode" -> ConfirmationCode.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmForgotPasswordRequest]
    }
  }

  /**
   * <p>The response from the server that results from a user's request to retrieve a forgotten password.</p>
   */
  @js.native
  trait ConfirmForgotPasswordResponse extends js.Object {

  }

  object ConfirmForgotPasswordResponse {
    def apply(): ConfirmForgotPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmForgotPasswordResponse]
    }
  }

  /**
   * <p>Represents the request to confirm registration of a user.</p>
   */
  @js.native
  trait ConfirmSignUpRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var SecretHash: js.UndefOr[SecretHashType]
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation]
    var ClientId: js.UndefOr[ClientIdType]
    var ConfirmationCode: js.UndefOr[ConfirmationCodeType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object ConfirmSignUpRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      SecretHash: js.UndefOr[SecretHashType] = js.undefined,
      ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      ConfirmationCode: js.UndefOr[ConfirmationCodeType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): ConfirmSignUpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "SecretHash" -> SecretHash.map { x => x.asInstanceOf[js.Any] },
        "ForceAliasCreation" -> ForceAliasCreation.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ConfirmationCode" -> ConfirmationCode.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSignUpRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the registration confirmation.</p>
   */
  @js.native
  trait ConfirmSignUpResponse extends js.Object {

  }

  object ConfirmSignUpResponse {
    def apply(): ConfirmSignUpResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSignUpResponse]
    }
  }

  /**
   * <p>Contextual user data type used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.</p>
   */
  @js.native
  trait ContextDataType extends js.Object {
    var HttpHeaders: js.UndefOr[HttpHeaderList]
    var IpAddress: js.UndefOr[StringType]
    var ServerName: js.UndefOr[StringType]
    var EncodedData: js.UndefOr[StringType]
    var ServerPath: js.UndefOr[StringType]
  }

  object ContextDataType {
    def apply(
      HttpHeaders: js.UndefOr[HttpHeaderList] = js.undefined,
      IpAddress: js.UndefOr[StringType] = js.undefined,
      ServerName: js.UndefOr[StringType] = js.undefined,
      EncodedData: js.UndefOr[StringType] = js.undefined,
      ServerPath: js.UndefOr[StringType] = js.undefined): ContextDataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HttpHeaders" -> HttpHeaders.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "EncodedData" -> EncodedData.map { x => x.asInstanceOf[js.Any] },
        "ServerPath" -> ServerPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContextDataType]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupNameType]
    var Description: js.UndefOr[DescriptionType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  object CreateGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupNameType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Precedence: js.UndefOr[PrecedenceType] = js.undefined,
      RoleArn: js.UndefOr[ArnType] = js.undefined): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Precedence" -> Precedence.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object CreateGroupResponse {
    def apply(
      Group: js.UndefOr[GroupType] = js.undefined): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateIdentityProviderRequest extends js.Object {
    var ProviderDetails: js.UndefOr[ProviderDetailsType]
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
    var ProviderName: js.UndefOr[ProviderNameTypeV1]
  }

  object CreateIdentityProviderRequest {
    def apply(
      ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined,
      AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
      ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined,
      ProviderName: js.UndefOr[ProviderNameTypeV1] = js.undefined): CreateIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderDetails" -> ProviderDetails.map { x => x.asInstanceOf[js.Any] },
        "AttributeMapping" -> AttributeMapping.map { x => x.asInstanceOf[js.Any] },
        "ProviderType" -> ProviderType.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdpIdentifiers" -> IdpIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityProviderRequest]
    }
  }

  @js.native
  trait CreateIdentityProviderResponse extends js.Object {
    var IdentityProvider: js.UndefOr[IdentityProviderType]
  }

  object CreateIdentityProviderResponse {
    def apply(
      IdentityProvider: js.UndefOr[IdentityProviderType] = js.undefined): CreateIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityProviderResponse]
    }
  }

  @js.native
  trait CreateResourceServerRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
    var Name: js.UndefOr[ResourceServerNameType]
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  object CreateResourceServerRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined,
      Name: js.UndefOr[ResourceServerNameType] = js.undefined,
      Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined): CreateResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Scopes" -> Scopes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceServerRequest]
    }
  }

  @js.native
  trait CreateResourceServerResponse extends js.Object {
    var ResourceServer: js.UndefOr[ResourceServerType]
  }

  object CreateResourceServerResponse {
    def apply(
      ResourceServer: js.UndefOr[ResourceServerType] = js.undefined): CreateResourceServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServer" -> ResourceServer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceServerResponse]
    }
  }

  /**
   * <p>Represents the request to create the user import job.</p>
   */
  @js.native
  trait CreateUserImportJobRequest extends js.Object {
    var JobName: js.UndefOr[UserImportJobNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var CloudWatchLogsRoleArn: js.UndefOr[ArnType]
  }

  object CreateUserImportJobRequest {
    def apply(
      JobName: js.UndefOr[UserImportJobNameType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.undefined): CreateUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserImportJobRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to create the user import job.</p>
   */
  @js.native
  trait CreateUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object CreateUserImportJobResponse {
    def apply(
      UserImportJob: js.UndefOr[UserImportJobType] = js.undefined): CreateUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserImportJobResponse]
    }
  }

  /**
   * <p>Represents the request to create a user pool client.</p>
   */
  @js.native
  trait CreateUserPoolClientRequest extends js.Object {
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var GenerateSecret: js.UndefOr[GenerateSecret]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var ClientName: js.UndefOr[ClientNameType]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
  }

  object CreateUserPoolClientRequest {
    def apply(
      AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
      GenerateSecret: js.UndefOr[GenerateSecret] = js.undefined,
      ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
      RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
      DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
      WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
      AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
      ClientName: js.UndefOr[ClientNameType] = js.undefined,
      ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
      SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
      AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
      CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
      LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined): CreateUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedOAuthFlowsUserPoolClient" -> AllowedOAuthFlowsUserPoolClient.map { x => x.asInstanceOf[js.Any] },
        "GenerateSecret" -> GenerateSecret.map { x => x.asInstanceOf[js.Any] },
        "ExplicitAuthFlows" -> ExplicitAuthFlows.map { x => x.asInstanceOf[js.Any] },
        "RefreshTokenValidity" -> RefreshTokenValidity.map { x => x.asInstanceOf[js.Any] },
        "DefaultRedirectURI" -> DefaultRedirectURI.map { x => x.asInstanceOf[js.Any] },
        "WriteAttributes" -> WriteAttributes.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthScopes" -> AllowedOAuthScopes.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthFlows" -> AllowedOAuthFlows.map { x => x.asInstanceOf[js.Any] },
        "ClientName" -> ClientName.map { x => x.asInstanceOf[js.Any] },
        "ReadAttributes" -> ReadAttributes.map { x => x.asInstanceOf[js.Any] },
        "SupportedIdentityProviders" -> SupportedIdentityProviders.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CallbackURLs" -> CallbackURLs.map { x => x.asInstanceOf[js.Any] },
        "LogoutURLs" -> LogoutURLs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolClientRequest]
    }
  }

  /**
   * <p>Represents the response from the server to create a user pool client.</p>
   */
  @js.native
  trait CreateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object CreateUserPoolClientResponse {
    def apply(
      UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined): CreateUserPoolClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClient" -> UserPoolClient.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolClientResponse]
    }
  }

  @js.native
  trait CreateUserPoolDomainRequest extends js.Object {
    var Domain: js.UndefOr[DomainType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType]
  }

  object CreateUserPoolDomainRequest {
    def apply(
      Domain: js.UndefOr[DomainType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined): CreateUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "CustomDomainConfig" -> CustomDomainConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolDomainRequest]
    }
  }

  @js.native
  trait CreateUserPoolDomainResponse extends js.Object {
    var CloudFrontDomain: js.UndefOr[DomainType]
  }

  object CreateUserPoolDomainResponse {
    def apply(
      CloudFrontDomain: js.UndefOr[DomainType] = js.undefined): CreateUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontDomain" -> CloudFrontDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolDomainResponse]
    }
  }

  /**
   * <p>Represents the request to create a user pool.</p>
   */
  @js.native
  trait CreateUserPoolRequest extends js.Object {
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var Policies: js.UndefOr[UserPoolPolicyType]
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var EmailConfiguration: js.UndefOr[EmailConfigurationType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType]
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType]
    var AliasAttributes: js.UndefOr[AliasAttributesListType]
    var Schema: js.UndefOr[SchemaAttributesListType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var PoolName: js.UndefOr[UserPoolNameType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object CreateUserPoolRequest {
    def apply(
      SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
      Policies: js.UndefOr[UserPoolPolicyType] = js.undefined,
      UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
      EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined,
      AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
      UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined,
      MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
      EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
      EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
      AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined,
      Schema: js.UndefOr[SchemaAttributesListType] = js.undefined,
      SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined,
      UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
      PoolName: js.UndefOr[UserPoolNameType] = js.undefined,
      LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
      SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined,
      VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined): CreateUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmsVerificationMessage" -> SmsVerificationMessage.map { x => x.asInstanceOf[js.Any] },
        "AutoVerifiedAttributes" -> AutoVerifiedAttributes.map { x => x.asInstanceOf[js.Any] },
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "UserPoolAddOns" -> UserPoolAddOns.map { x => x.asInstanceOf[js.Any] },
        "EmailConfiguration" -> EmailConfiguration.map { x => x.asInstanceOf[js.Any] },
        "AdminCreateUserConfig" -> AdminCreateUserConfig.map { x => x.asInstanceOf[js.Any] },
        "UsernameAttributes" -> UsernameAttributes.map { x => x.asInstanceOf[js.Any] },
        "MfaConfiguration" -> MfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "EmailVerificationSubject" -> EmailVerificationSubject.map { x => x.asInstanceOf[js.Any] },
        "EmailVerificationMessage" -> EmailVerificationMessage.map { x => x.asInstanceOf[js.Any] },
        "AliasAttributes" -> AliasAttributes.map { x => x.asInstanceOf[js.Any] },
        "Schema" -> Schema.map { x => x.asInstanceOf[js.Any] },
        "SmsConfiguration" -> SmsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "UserPoolTags" -> UserPoolTags.map { x => x.asInstanceOf[js.Any] },
        "PoolName" -> PoolName.map { x => x.asInstanceOf[js.Any] },
        "LambdaConfig" -> LambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x => x.asInstanceOf[js.Any] },
        "DeviceConfiguration" -> DeviceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "VerificationMessageTemplate" -> VerificationMessageTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the request to create a user pool.</p>
   */
  @js.native
  trait CreateUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  object CreateUserPoolResponse {
    def apply(
      UserPool: js.UndefOr[UserPoolType] = js.undefined): CreateUserPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPool" -> UserPool.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserPoolResponse]
    }
  }

  /**
   * <p>The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.</p>
   */
  @js.native
  trait CustomDomainConfigType extends js.Object {
    var CertificateArn: js.UndefOr[ArnType]
  }

  object CustomDomainConfigType {
    def apply(
      CertificateArn: js.UndefOr[ArnType] = js.undefined): CustomDomainConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var GroupName: js.UndefOr[GroupNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object DeleteGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupNameType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteIdentityProviderRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  object DeleteIdentityProviderRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ProviderName: js.UndefOr[ProviderNameType] = js.undefined): DeleteIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityProviderRequest]
    }
  }

  @js.native
  trait DeleteResourceServerRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
  }

  object DeleteResourceServerRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined): DeleteResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceServerRequest]
    }
  }

  /**
   * <p>Represents the request to delete user attributes.</p>
   */
  @js.native
  trait DeleteUserAttributesRequest extends js.Object {
    var UserAttributeNames: js.UndefOr[AttributeNameListType]
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object DeleteUserAttributesRequest {
    def apply(
      UserAttributeNames: js.UndefOr[AttributeNameListType] = js.undefined,
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): DeleteUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserAttributeNames" -> UserAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserAttributesRequest]
    }
  }

  /**
   * <p>Represents the response from the server to delete user attributes.</p>
   */
  @js.native
  trait DeleteUserAttributesResponse extends js.Object {

  }

  object DeleteUserAttributesResponse {
    def apply(): DeleteUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserAttributesResponse]
    }
  }

  /**
   * <p>Represents the request to delete a user pool client.</p>
   */
  @js.native
  trait DeleteUserPoolClientRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
  }

  object DeleteUserPoolClientRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined): DeleteUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolClientRequest]
    }
  }

  @js.native
  trait DeleteUserPoolDomainRequest extends js.Object {
    var Domain: js.UndefOr[DomainType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object DeleteUserPoolDomainRequest {
    def apply(
      Domain: js.UndefOr[DomainType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): DeleteUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolDomainRequest]
    }
  }

  @js.native
  trait DeleteUserPoolDomainResponse extends js.Object {

  }

  object DeleteUserPoolDomainResponse {
    def apply(): DeleteUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolDomainResponse]
    }
  }

  /**
   * <p>Represents the request to delete a user pool.</p>
   */
  @js.native
  trait DeleteUserPoolRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object DeleteUserPoolRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): DeleteUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserPoolRequest]
    }
  }

  /**
   * <p>Represents the request to delete a user.</p>
   */
  @js.native
  trait DeleteUserRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object DeleteUserRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  object DeliveryMediumTypeEnum {
    val SMS = "SMS"
    val EMAIL = "EMAIL"

    val values = IndexedSeq(SMS, EMAIL)
  }

  @js.native
  trait DescribeIdentityProviderRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  object DescribeIdentityProviderRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ProviderName: js.UndefOr[ProviderNameType] = js.undefined): DescribeIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityProviderRequest]
    }
  }

  @js.native
  trait DescribeIdentityProviderResponse extends js.Object {
    var IdentityProvider: js.UndefOr[IdentityProviderType]
  }

  object DescribeIdentityProviderResponse {
    def apply(
      IdentityProvider: js.UndefOr[IdentityProviderType] = js.undefined): DescribeIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityProviderResponse]
    }
  }

  @js.native
  trait DescribeResourceServerRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
  }

  object DescribeResourceServerRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined): DescribeResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceServerRequest]
    }
  }

  @js.native
  trait DescribeResourceServerResponse extends js.Object {
    var ResourceServer: js.UndefOr[ResourceServerType]
  }

  object DescribeResourceServerResponse {
    def apply(
      ResourceServer: js.UndefOr[ResourceServerType] = js.undefined): DescribeResourceServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServer" -> ResourceServer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceServerResponse]
    }
  }

  @js.native
  trait DescribeRiskConfigurationRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
  }

  object DescribeRiskConfigurationRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined): DescribeRiskConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRiskConfigurationRequest]
    }
  }

  @js.native
  trait DescribeRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: js.UndefOr[RiskConfigurationType]
  }

  object DescribeRiskConfigurationResponse {
    def apply(
      RiskConfiguration: js.UndefOr[RiskConfigurationType] = js.undefined): DescribeRiskConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskConfiguration" -> RiskConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRiskConfigurationResponse]
    }
  }

  /**
   * <p>Represents the request to describe the user import job.</p>
   */
  @js.native
  trait DescribeUserImportJobRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var JobId: js.UndefOr[UserImportJobIdType]
  }

  object DescribeUserImportJobRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      JobId: js.UndefOr[UserImportJobIdType] = js.undefined): DescribeUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserImportJobRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to describe the user import job.</p>
   */
  @js.native
  trait DescribeUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object DescribeUserImportJobResponse {
    def apply(
      UserImportJob: js.UndefOr[UserImportJobType] = js.undefined): DescribeUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserImportJobResponse]
    }
  }

  /**
   * <p>Represents the request to describe a user pool client.</p>
   */
  @js.native
  trait DescribeUserPoolClientRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
  }

  object DescribeUserPoolClientRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined): DescribeUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolClientRequest]
    }
  }

  /**
   * <p>Represents the response from the server from a request to describe the user pool client.</p>
   */
  @js.native
  trait DescribeUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object DescribeUserPoolClientResponse {
    def apply(
      UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined): DescribeUserPoolClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClient" -> UserPoolClient.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolClientResponse]
    }
  }

  @js.native
  trait DescribeUserPoolDomainRequest extends js.Object {
    var Domain: js.UndefOr[DomainType]
  }

  object DescribeUserPoolDomainRequest {
    def apply(
      Domain: js.UndefOr[DomainType] = js.undefined): DescribeUserPoolDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolDomainRequest]
    }
  }

  @js.native
  trait DescribeUserPoolDomainResponse extends js.Object {
    var DomainDescription: js.UndefOr[DomainDescriptionType]
  }

  object DescribeUserPoolDomainResponse {
    def apply(
      DomainDescription: js.UndefOr[DomainDescriptionType] = js.undefined): DescribeUserPoolDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainDescription" -> DomainDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolDomainResponse]
    }
  }

  /**
   * <p>Represents the request to describe the user pool.</p>
   */
  @js.native
  trait DescribeUserPoolRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object DescribeUserPoolRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): DescribeUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolRequest]
    }
  }

  /**
   * <p>Represents the response to describe the user pool.</p>
   */
  @js.native
  trait DescribeUserPoolResponse extends js.Object {
    var UserPool: js.UndefOr[UserPoolType]
  }

  object DescribeUserPoolResponse {
    def apply(
      UserPool: js.UndefOr[UserPoolType] = js.undefined): DescribeUserPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPool" -> UserPool.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserPoolResponse]
    }
  }

  /**
   * <p>The configuration for the user pool's device tracking.</p>
   */
  @js.native
  trait DeviceConfigurationType extends js.Object {
    var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType]
    var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType]
  }

  object DeviceConfigurationType {
    def apply(
      ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.undefined,
      DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.undefined): DeviceConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeRequiredOnNewDevice" -> ChallengeRequiredOnNewDevice.map { x => x.asInstanceOf[js.Any] },
        "DeviceOnlyRememberedOnUserPrompt" -> DeviceOnlyRememberedOnUserPrompt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceConfigurationType]
    }
  }

  object DeviceRememberedStatusTypeEnum {
    val remembered = "remembered"
    val not_remembered = "not_remembered"

    val values = IndexedSeq(remembered, not_remembered)
  }

  /**
   * <p>The device verifier against which it will be authenticated.</p>
   */
  @js.native
  trait DeviceSecretVerifierConfigType extends js.Object {
    var PasswordVerifier: js.UndefOr[StringType]
    var Salt: js.UndefOr[StringType]
  }

  object DeviceSecretVerifierConfigType {
    def apply(
      PasswordVerifier: js.UndefOr[StringType] = js.undefined,
      Salt: js.UndefOr[StringType] = js.undefined): DeviceSecretVerifierConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordVerifier" -> PasswordVerifier.map { x => x.asInstanceOf[js.Any] },
        "Salt" -> Salt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceSecretVerifierConfigType]
    }
  }

  /**
   * <p>The device type.</p>
   */
  @js.native
  trait DeviceType extends js.Object {
    var DeviceAttributes: js.UndefOr[AttributeListType]
    var DeviceLastAuthenticatedDate: js.UndefOr[DateType]
    var DeviceLastModifiedDate: js.UndefOr[DateType]
    var DeviceCreateDate: js.UndefOr[DateType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
  }

  object DeviceType {
    def apply(
      DeviceAttributes: js.UndefOr[AttributeListType] = js.undefined,
      DeviceLastAuthenticatedDate: js.UndefOr[DateType] = js.undefined,
      DeviceLastModifiedDate: js.UndefOr[DateType] = js.undefined,
      DeviceCreateDate: js.UndefOr[DateType] = js.undefined,
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined): DeviceType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceAttributes" -> DeviceAttributes.map { x => x.asInstanceOf[js.Any] },
        "DeviceLastAuthenticatedDate" -> DeviceLastAuthenticatedDate.map { x => x.asInstanceOf[js.Any] },
        "DeviceLastModifiedDate" -> DeviceLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "DeviceCreateDate" -> DeviceCreateDate.map { x => x.asInstanceOf[js.Any] },
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceType]
    }
  }

  /**
   * <p>A container for information about a domain.</p>
   */
  @js.native
  trait DomainDescriptionType extends js.Object {
    var S3Bucket: js.UndefOr[S3BucketType]
    var Version: js.UndefOr[DomainVersionType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var AWSAccountId: js.UndefOr[AWSAccountIdType]
    var CloudFrontDistribution: js.UndefOr[StringType]
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType]
    var Domain: js.UndefOr[DomainType]
    var Status: js.UndefOr[DomainStatusType]
  }

  object DomainDescriptionType {
    def apply(
      S3Bucket: js.UndefOr[S3BucketType] = js.undefined,
      Version: js.UndefOr[DomainVersionType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined,
      CloudFrontDistribution: js.UndefOr[StringType] = js.undefined,
      CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined,
      Status: js.UndefOr[DomainStatusType] = js.undefined): DomainDescriptionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "AWSAccountId" -> AWSAccountId.map { x => x.asInstanceOf[js.Any] },
        "CloudFrontDistribution" -> CloudFrontDistribution.map { x => x.asInstanceOf[js.Any] },
        "CustomDomainConfig" -> CustomDomainConfig.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainDescriptionType]
    }
  }

  object DomainStatusTypeEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val UPDATING = "UPDATING"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATING, DELETING, UPDATING, ACTIVE, FAILED)
  }

  /**
   * <p>The email configuration type.</p>
   */
  @js.native
  trait EmailConfigurationType extends js.Object {
    var SourceArn: js.UndefOr[ArnType]
    var ReplyToEmailAddress: js.UndefOr[EmailAddressType]
  }

  object EmailConfigurationType {
    def apply(
      SourceArn: js.UndefOr[ArnType] = js.undefined,
      ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.undefined): EmailConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "ReplyToEmailAddress" -> ReplyToEmailAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailConfigurationType]
    }
  }

  /**
   * <p>Specifies the user context data captured at the time of an event request.</p>
   */
  @js.native
  trait EventContextDataType extends js.Object {
    var Timezone: js.UndefOr[StringType]
    var Country: js.UndefOr[StringType]
    var IpAddress: js.UndefOr[StringType]
    var City: js.UndefOr[StringType]
    var DeviceName: js.UndefOr[StringType]
  }

  object EventContextDataType {
    def apply(
      Timezone: js.UndefOr[StringType] = js.undefined,
      Country: js.UndefOr[StringType] = js.undefined,
      IpAddress: js.UndefOr[StringType] = js.undefined,
      City: js.UndefOr[StringType] = js.undefined,
      DeviceName: js.UndefOr[StringType] = js.undefined): EventContextDataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "Country" -> Country.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "City" -> City.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventContextDataType]
    }
  }

  /**
   * <p>Specifies the event feedback type.</p>
   */
  @js.native
  trait EventFeedbackType extends js.Object {
    var FeedbackValue: js.UndefOr[FeedbackValueType]
    var Provider: js.UndefOr[StringType]
    var FeedbackDate: js.UndefOr[DateType]
  }

  object EventFeedbackType {
    def apply(
      FeedbackValue: js.UndefOr[FeedbackValueType] = js.undefined,
      Provider: js.UndefOr[StringType] = js.undefined,
      FeedbackDate: js.UndefOr[DateType] = js.undefined): EventFeedbackType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeedbackValue" -> FeedbackValue.map { x => x.asInstanceOf[js.Any] },
        "Provider" -> Provider.map { x => x.asInstanceOf[js.Any] },
        "FeedbackDate" -> FeedbackDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventFeedbackType]
    }
  }

  object EventFilterTypeEnum {
    val SIGN_IN = "SIGN_IN"
    val PASSWORD_CHANGE = "PASSWORD_CHANGE"
    val SIGN_UP = "SIGN_UP"

    val values = IndexedSeq(SIGN_IN, PASSWORD_CHANGE, SIGN_UP)
  }

  object EventResponseTypeEnum {
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Success, Failure)
  }

  /**
   * <p>The event risk type.</p>
   */
  @js.native
  trait EventRiskType extends js.Object {
    var RiskDecision: js.UndefOr[RiskDecisionType]
    var RiskLevel: js.UndefOr[RiskLevelType]
  }

  object EventRiskType {
    def apply(
      RiskDecision: js.UndefOr[RiskDecisionType] = js.undefined,
      RiskLevel: js.UndefOr[RiskLevelType] = js.undefined): EventRiskType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskDecision" -> RiskDecision.map { x => x.asInstanceOf[js.Any] },
        "RiskLevel" -> RiskLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventRiskType]
    }
  }

  object EventTypeEnum {
    val SignIn = "SignIn"
    val SignUp = "SignUp"
    val ForgotPassword = "ForgotPassword"

    val values = IndexedSeq(SignIn, SignUp, ForgotPassword)
  }

  object ExplicitAuthFlowsTypeEnum {
    val ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH"
    val CUSTOM_AUTH_FLOW_ONLY = "CUSTOM_AUTH_FLOW_ONLY"
    val USER_PASSWORD_AUTH = "USER_PASSWORD_AUTH"

    val values = IndexedSeq(ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH)
  }

  object FeedbackValueTypeEnum {
    val Valid = "Valid"
    val Invalid = "Invalid"

    val values = IndexedSeq(Valid, Invalid)
  }

  /**
   * <p>Represents the request to forget the device.</p>
   */
  @js.native
  trait ForgetDeviceRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
  }

  object ForgetDeviceRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined): ForgetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgetDeviceRequest]
    }
  }

  /**
   * <p>Represents the request to reset a user's password.</p>
   */
  @js.native
  trait ForgotPasswordRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var SecretHash: js.UndefOr[SecretHashType]
    var ClientId: js.UndefOr[ClientIdType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object ForgotPasswordRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      SecretHash: js.UndefOr[SecretHashType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): ForgotPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "SecretHash" -> SecretHash.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgotPasswordRequest]
    }
  }

  /**
   * <p>Respresents the response from the server regarding the request to reset a password.</p>
   */
  @js.native
  trait ForgotPasswordResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object ForgotPasswordResponse {
    def apply(
      CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined): ForgotPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgotPasswordResponse]
    }
  }

  /**
   * <p>Represents the request to get the header information for the .csv file for the user import job.</p>
   */
  @js.native
  trait GetCSVHeaderRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GetCSVHeaderRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): GetCSVHeaderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCSVHeaderRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to get the header information for the .csv file for the user import job.</p>
   */
  @js.native
  trait GetCSVHeaderResponse extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var CSVHeader: js.UndefOr[ListOfStringTypes]
  }

  object GetCSVHeaderResponse {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      CSVHeader: js.UndefOr[ListOfStringTypes] = js.undefined): GetCSVHeaderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "CSVHeader" -> CSVHeader.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCSVHeaderResponse]
    }
  }

  /**
   * <p>Represents the request to get the device.</p>
   */
  @js.native
  trait GetDeviceRequest extends js.Object {
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object GetDeviceRequest {
    def apply(
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): GetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] },
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceRequest]
    }
  }

  /**
   * <p>Gets the device response.</p>
   */
  @js.native
  trait GetDeviceResponse extends js.Object {
    var Device: js.UndefOr[DeviceType]
  }

  object GetDeviceResponse {
    def apply(
      Device: js.UndefOr[DeviceType] = js.undefined): GetDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupNameType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GetGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupNameType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): GetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object GetGroupResponse {
    def apply(
      Group: js.UndefOr[GroupType] = js.undefined): GetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetIdentityProviderByIdentifierRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var IdpIdentifier: js.UndefOr[IdpIdentifierType]
  }

  object GetIdentityProviderByIdentifierRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      IdpIdentifier: js.UndefOr[IdpIdentifierType] = js.undefined): GetIdentityProviderByIdentifierRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdpIdentifier" -> IdpIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityProviderByIdentifierRequest]
    }
  }

  @js.native
  trait GetIdentityProviderByIdentifierResponse extends js.Object {
    var IdentityProvider: js.UndefOr[IdentityProviderType]
  }

  object GetIdentityProviderByIdentifierResponse {
    def apply(
      IdentityProvider: js.UndefOr[IdentityProviderType] = js.undefined): GetIdentityProviderByIdentifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityProviderByIdentifierResponse]
    }
  }

  /**
   * <p>Request to get a signing certificate from Cognito.</p>
   */
  @js.native
  trait GetSigningCertificateRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GetSigningCertificateRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): GetSigningCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningCertificateRequest]
    }
  }

  /**
   * <p>Response from Cognito for a signing certificate request.</p>
   */
  @js.native
  trait GetSigningCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[StringType]
  }

  object GetSigningCertificateResponse {
    def apply(
      Certificate: js.UndefOr[StringType] = js.undefined): GetSigningCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningCertificateResponse]
    }
  }

  @js.native
  trait GetUICustomizationRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
  }

  object GetUICustomizationRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined): GetUICustomizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUICustomizationRequest]
    }
  }

  @js.native
  trait GetUICustomizationResponse extends js.Object {
    var UICustomization: js.UndefOr[UICustomizationType]
  }

  object GetUICustomizationResponse {
    def apply(
      UICustomization: js.UndefOr[UICustomizationType] = js.undefined): GetUICustomizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UICustomization" -> UICustomization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUICustomizationResponse]
    }
  }

  /**
   * <p>Represents the request to get user attribute verification.</p>
   */
  @js.native
  trait GetUserAttributeVerificationCodeRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var AttributeName: js.UndefOr[AttributeNameType]
  }

  object GetUserAttributeVerificationCodeRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      AttributeName: js.UndefOr[AttributeNameType] = js.undefined): GetUserAttributeVerificationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserAttributeVerificationCodeRequest]
    }
  }

  /**
   * <p>The verification code response returned by the server response to get the user attribute verification code.</p>
   */
  @js.native
  trait GetUserAttributeVerificationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object GetUserAttributeVerificationCodeResponse {
    def apply(
      CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined): GetUserAttributeVerificationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserAttributeVerificationCodeResponse]
    }
  }

  @js.native
  trait GetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
  }

  object GetUserPoolMfaConfigRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined): GetUserPoolMfaConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPoolMfaConfigRequest]
    }
  }

  @js.native
  trait GetUserPoolMfaConfigResponse extends js.Object {
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
  }

  object GetUserPoolMfaConfigResponse {
    def apply(
      SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
      SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined,
      MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined): GetUserPoolMfaConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmsMfaConfiguration" -> SmsMfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SoftwareTokenMfaConfiguration" -> SoftwareTokenMfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "MfaConfiguration" -> MfaConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserPoolMfaConfigResponse]
    }
  }

  /**
   * <p>Represents the request to get information about the user.</p>
   */
  @js.native
  trait GetUserRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object GetUserRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): GetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserRequest]
    }
  }

  /**
   * <p>Represents the response from the server from the request to get information about the user.</p>
   */
  @js.native
  trait GetUserResponse extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var PreferredMfaSetting: js.UndefOr[StringType]
    var UserMFASettingList: js.UndefOr[UserMFASettingListType]
  }

  object GetUserResponse {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
      UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
      PreferredMfaSetting: js.UndefOr[StringType] = js.undefined,
      UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "MFAOptions" -> MFAOptions.map { x => x.asInstanceOf[js.Any] },
        "UserAttributes" -> UserAttributes.map { x => x.asInstanceOf[js.Any] },
        "PreferredMfaSetting" -> PreferredMfaSetting.map { x => x.asInstanceOf[js.Any] },
        "UserMFASettingList" -> UserMFASettingList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  /**
   * <p>Represents the request to sign out all devices.</p>
   */
  @js.native
  trait GlobalSignOutRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object GlobalSignOutRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): GlobalSignOutRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSignOutRequest]
    }
  }

  /**
   * <p>The response to the request to sign out all devices.</p>
   */
  @js.native
  trait GlobalSignOutResponse extends js.Object {

  }

  object GlobalSignOutResponse {
    def apply(): GlobalSignOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSignOutResponse]
    }
  }

  /**
   * <p>The group type.</p>
   */
  @js.native
  trait GroupType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var LastModifiedDate: js.UndefOr[DateType]
    var GroupName: js.UndefOr[GroupNameType]
    var Description: js.UndefOr[DescriptionType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  object GroupType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      GroupName: js.UndefOr[GroupNameType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Precedence: js.UndefOr[PrecedenceType] = js.undefined,
      RoleArn: js.UndefOr[ArnType] = js.undefined): GroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Precedence" -> Precedence.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupType]
    }
  }

  /**
   * <p>The HTTP header.</p>
   */
  @js.native
  trait HttpHeader extends js.Object {
    var headerName: js.UndefOr[StringType]
    var headerValue: js.UndefOr[StringType]
  }

  object HttpHeader {
    def apply(
      headerName: js.UndefOr[StringType] = js.undefined,
      headerValue: js.UndefOr[StringType] = js.undefined): HttpHeader = {
      val _fields = IndexedSeq[(String, js.Any)](
        "headerName" -> headerName.map { x => x.asInstanceOf[js.Any] },
        "headerValue" -> headerValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HttpHeader]
    }
  }

  /**
   * <p>A container for information about an identity provider.</p>
   */
  @js.native
  trait IdentityProviderType extends js.Object {
    var ProviderDetails: js.UndefOr[ProviderDetailsType]
    var CreationDate: js.UndefOr[DateType]
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var LastModifiedDate: js.UndefOr[DateType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  object IdentityProviderType {
    def apply(
      ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined,
      CreationDate: js.UndefOr[DateType] = js.undefined,
      AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined,
      ProviderName: js.UndefOr[ProviderNameType] = js.undefined): IdentityProviderType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderDetails" -> ProviderDetails.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "AttributeMapping" -> AttributeMapping.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "ProviderType" -> ProviderType.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdpIdentifiers" -> IdpIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityProviderType]
    }
  }

  object IdentityProviderTypeTypeEnum {
    val SAML = "SAML"
    val Facebook = "Facebook"
    val Google = "Google"
    val LoginWithAmazon = "LoginWithAmazon"
    val OIDC = "OIDC"

    val values = IndexedSeq(SAML, Facebook, Google, LoginWithAmazon, OIDC)
  }

  /**
   * <p>Initiates the authentication request.</p>
   */
  @js.native
  trait InitiateAuthRequest extends js.Object {
    var ClientMetadata: js.UndefOr[ClientMetadataType]
    var AuthParameters: js.UndefOr[AuthParametersType]
    var ClientId: js.UndefOr[ClientIdType]
    var AuthFlow: js.UndefOr[AuthFlowType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object InitiateAuthRequest {
    def apply(
      ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined,
      AuthParameters: js.UndefOr[AuthParametersType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      AuthFlow: js.UndefOr[AuthFlowType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): InitiateAuthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientMetadata" -> ClientMetadata.map { x => x.asInstanceOf[js.Any] },
        "AuthParameters" -> AuthParameters.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "AuthFlow" -> AuthFlow.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateAuthRequest]
    }
  }

  /**
   * <p>Initiates the authentication response.</p>
   */
  @js.native
  trait InitiateAuthResponse extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var Session: js.UndefOr[SessionType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
  }

  object InitiateAuthResponse {
    def apply(
      ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
      AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined): InitiateAuthResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "ChallengeParameters" -> ChallengeParameters.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationResult" -> AuthenticationResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateAuthResponse]
    }
  }

  /**
   * <p>Specifies the configuration for AWS Lambda triggers.</p>
   */
  @js.native
  trait LambdaConfigType extends js.Object {
    var PostConfirmation: js.UndefOr[ArnType]
    var PostAuthentication: js.UndefOr[ArnType]
    var PreAuthentication: js.UndefOr[ArnType]
    var UserMigration: js.UndefOr[ArnType]
    var PreTokenGeneration: js.UndefOr[ArnType]
    var CustomMessage: js.UndefOr[ArnType]
    var DefineAuthChallenge: js.UndefOr[ArnType]
    var CreateAuthChallenge: js.UndefOr[ArnType]
    var PreSignUp: js.UndefOr[ArnType]
    var VerifyAuthChallengeResponse: js.UndefOr[ArnType]
  }

  object LambdaConfigType {
    def apply(
      PostConfirmation: js.UndefOr[ArnType] = js.undefined,
      PostAuthentication: js.UndefOr[ArnType] = js.undefined,
      PreAuthentication: js.UndefOr[ArnType] = js.undefined,
      UserMigration: js.UndefOr[ArnType] = js.undefined,
      PreTokenGeneration: js.UndefOr[ArnType] = js.undefined,
      CustomMessage: js.UndefOr[ArnType] = js.undefined,
      DefineAuthChallenge: js.UndefOr[ArnType] = js.undefined,
      CreateAuthChallenge: js.UndefOr[ArnType] = js.undefined,
      PreSignUp: js.UndefOr[ArnType] = js.undefined,
      VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.undefined): LambdaConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PostConfirmation" -> PostConfirmation.map { x => x.asInstanceOf[js.Any] },
        "PostAuthentication" -> PostAuthentication.map { x => x.asInstanceOf[js.Any] },
        "PreAuthentication" -> PreAuthentication.map { x => x.asInstanceOf[js.Any] },
        "UserMigration" -> UserMigration.map { x => x.asInstanceOf[js.Any] },
        "PreTokenGeneration" -> PreTokenGeneration.map { x => x.asInstanceOf[js.Any] },
        "CustomMessage" -> CustomMessage.map { x => x.asInstanceOf[js.Any] },
        "DefineAuthChallenge" -> DefineAuthChallenge.map { x => x.asInstanceOf[js.Any] },
        "CreateAuthChallenge" -> CreateAuthChallenge.map { x => x.asInstanceOf[js.Any] },
        "PreSignUp" -> PreSignUp.map { x => x.asInstanceOf[js.Any] },
        "VerifyAuthChallengeResponse" -> VerifyAuthChallengeResponse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaConfigType]
    }
  }

  /**
   * <p>Represents the request to list the devices.</p>
   */
  @js.native
  trait ListDevicesRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var Limit: js.UndefOr[QueryLimitType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListDevicesRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      Limit: js.UndefOr[QueryLimitType] = js.undefined,
      PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined): ListDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesRequest]
    }
  }

  /**
   * <p>Represents the response to list devices.</p>
   */
  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListDevicesResponse {
    def apply(
      Devices: js.UndefOr[DeviceListType] = js.undefined,
      PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined): ListDevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Devices" -> Devices.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListGroupsRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Limit: js.UndefOr[QueryLimitType] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListIdentityProvidersRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var MaxResults: js.UndefOr[ListProvidersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListIdentityProvidersRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined,
      NextToken: js.UndefOr[PaginationKeyType] = js.undefined): ListIdentityProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityProvidersRequest]
    }
  }

  @js.native
  trait ListIdentityProvidersResponse extends js.Object {
    var Providers: js.UndefOr[ProvidersListType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListIdentityProvidersResponse {
    def apply(
      Providers: js.UndefOr[ProvidersListType] = js.undefined,
      NextToken: js.UndefOr[PaginationKeyType] = js.undefined): ListIdentityProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Providers" -> Providers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityProvidersResponse]
    }
  }

  @js.native
  trait ListResourceServersRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var MaxResults: js.UndefOr[ListResourceServersLimitType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListResourceServersRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined,
      NextToken: js.UndefOr[PaginationKeyType] = js.undefined): ListResourceServersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceServersRequest]
    }
  }

  @js.native
  trait ListResourceServersResponse extends js.Object {
    var ResourceServers: js.UndefOr[ResourceServersListType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListResourceServersResponse {
    def apply(
      ResourceServers: js.UndefOr[ResourceServersListType] = js.undefined,
      NextToken: js.UndefOr[PaginationKeyType] = js.undefined): ListResourceServersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServers" -> ResourceServers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceServersResponse]
    }
  }

  /**
   * <p>Represents the request to list the user import jobs.</p>
   */
  @js.native
  trait ListUserImportJobsRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var MaxResults: js.UndefOr[PoolQueryLimitType]
    var PaginationToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserImportJobsRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      MaxResults: js.UndefOr[PoolQueryLimitType] = js.undefined,
      PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined): ListUserImportJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserImportJobsRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to list the user import jobs.</p>
   */
  @js.native
  trait ListUserImportJobsResponse extends js.Object {
    var UserImportJobs: js.UndefOr[UserImportJobsListType]
    var PaginationToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserImportJobsResponse {
    def apply(
      UserImportJobs: js.UndefOr[UserImportJobsListType] = js.undefined,
      PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined): ListUserImportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJobs" -> UserImportJobs.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserImportJobsResponse]
    }
  }

  /**
   * <p>Represents the request to list the user pool clients.</p>
   */
  @js.native
  trait ListUserPoolClientsRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var MaxResults: js.UndefOr[QueryLimit]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUserPoolClientsRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      MaxResults: js.UndefOr[QueryLimit] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListUserPoolClientsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolClientsRequest]
    }
  }

  /**
   * <p>Represents the response from the server that lists user pool clients.</p>
   */
  @js.native
  trait ListUserPoolClientsResponse extends js.Object {
    var UserPoolClients: js.UndefOr[UserPoolClientListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUserPoolClientsResponse {
    def apply(
      UserPoolClients: js.UndefOr[UserPoolClientListType] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListUserPoolClientsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClients" -> UserPoolClients.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolClientsResponse]
    }
  }

  /**
   * <p>Represents the request to list user pools.</p>
   */
  @js.native
  trait ListUserPoolsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationKeyType]
    var MaxResults: js.UndefOr[PoolQueryLimitType]
  }

  object ListUserPoolsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationKeyType] = js.undefined,
      MaxResults: js.UndefOr[PoolQueryLimitType] = js.undefined): ListUserPoolsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolsRequest]
    }
  }

  /**
   * <p>Represents the response to list user pools.</p>
   */
  @js.native
  trait ListUserPoolsResponse extends js.Object {
    var UserPools: js.UndefOr[UserPoolListType]
    var NextToken: js.UndefOr[PaginationKeyType]
  }

  object ListUserPoolsResponse {
    def apply(
      UserPools: js.UndefOr[UserPoolListType] = js.undefined,
      NextToken: js.UndefOr[PaginationKeyType] = js.undefined): ListUserPoolsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPools" -> UserPools.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserPoolsResponse]
    }
  }

  @js.native
  trait ListUsersInGroupRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var GroupName: js.UndefOr[GroupNameType]
    var Limit: js.UndefOr[QueryLimitType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUsersInGroupRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      GroupName: js.UndefOr[GroupNameType] = js.undefined,
      Limit: js.UndefOr[QueryLimitType] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListUsersInGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersInGroupRequest]
    }
  }

  @js.native
  trait ListUsersInGroupResponse extends js.Object {
    var Users: js.UndefOr[UsersListType]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListUsersInGroupResponse {
    def apply(
      Users: js.UndefOr[UsersListType] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListUsersInGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersInGroupResponse]
    }
  }

  /**
   * <p>Represents the request to list users.</p>
   */
  @js.native
  trait ListUsersRequest extends js.Object {
    var Limit: js.UndefOr[QueryLimitType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
    var AttributesToGet: js.UndefOr[SearchedAttributeNamesListType]
    var Filter: js.UndefOr[UserFilterType]
  }

  object ListUsersRequest {
    def apply(
      Limit: js.UndefOr[QueryLimitType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined,
      AttributesToGet: js.UndefOr[SearchedAttributeNamesListType] = js.undefined,
      Filter: js.UndefOr[UserFilterType] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] },
        "AttributesToGet" -> AttributesToGet.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  /**
   * <p>The response from the request to list users.</p>
   */
  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: js.UndefOr[UsersListType]
    var PaginationToken: js.UndefOr[SearchPaginationTokenType]
  }

  object ListUsersResponse {
    def apply(
      Users: js.UndefOr[UsersListType] = js.undefined,
      PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  /**
   * <p>Specifies the different settings for multi-factor authentication (MFA).</p>
   */
  @js.native
  trait MFAOptionType extends js.Object {
    var DeliveryMedium: js.UndefOr[DeliveryMediumType]
    var AttributeName: js.UndefOr[AttributeNameType]
  }

  object MFAOptionType {
    def apply(
      DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined,
      AttributeName: js.UndefOr[AttributeNameType] = js.undefined): MFAOptionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryMedium" -> DeliveryMedium.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MFAOptionType]
    }
  }

  object MessageActionTypeEnum {
    val RESEND = "RESEND"
    val SUPPRESS = "SUPPRESS"

    val values = IndexedSeq(RESEND, SUPPRESS)
  }

  /**
   * <p>The message template structure.</p>
   */
  @js.native
  trait MessageTemplateType extends js.Object {
    var SMSMessage: js.UndefOr[SmsVerificationMessageType]
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
  }

  object MessageTemplateType {
    def apply(
      SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
      EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined): MessageTemplateType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMSMessage" -> SMSMessage.map { x => x.asInstanceOf[js.Any] },
        "EmailMessage" -> EmailMessage.map { x => x.asInstanceOf[js.Any] },
        "EmailSubject" -> EmailSubject.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageTemplateType]
    }
  }

  /**
   * <p>The new device metadata type.</p>
   */
  @js.native
  trait NewDeviceMetadataType extends js.Object {
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var DeviceGroupKey: js.UndefOr[StringType]
  }

  object NewDeviceMetadataType {
    def apply(
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
      DeviceGroupKey: js.UndefOr[StringType] = js.undefined): NewDeviceMetadataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] },
        "DeviceGroupKey" -> DeviceGroupKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewDeviceMetadataType]
    }
  }

  /**
   * <p>The notify configuration type.</p>
   */
  @js.native
  trait NotifyConfigurationType extends js.Object {
    var MfaEmail: js.UndefOr[NotifyEmailType]
    var ReplyTo: js.UndefOr[StringType]
    var NoActionEmail: js.UndefOr[NotifyEmailType]
    var SourceArn: js.UndefOr[ArnType]
    var BlockEmail: js.UndefOr[NotifyEmailType]
    var From: js.UndefOr[StringType]
  }

  object NotifyConfigurationType {
    def apply(
      MfaEmail: js.UndefOr[NotifyEmailType] = js.undefined,
      ReplyTo: js.UndefOr[StringType] = js.undefined,
      NoActionEmail: js.UndefOr[NotifyEmailType] = js.undefined,
      SourceArn: js.UndefOr[ArnType] = js.undefined,
      BlockEmail: js.UndefOr[NotifyEmailType] = js.undefined,
      From: js.UndefOr[StringType] = js.undefined): NotifyConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MfaEmail" -> MfaEmail.map { x => x.asInstanceOf[js.Any] },
        "ReplyTo" -> ReplyTo.map { x => x.asInstanceOf[js.Any] },
        "NoActionEmail" -> NoActionEmail.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "BlockEmail" -> BlockEmail.map { x => x.asInstanceOf[js.Any] },
        "From" -> From.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyConfigurationType]
    }
  }

  /**
   * <p>The notify email type.</p>
   */
  @js.native
  trait NotifyEmailType extends js.Object {
    var Subject: js.UndefOr[EmailNotificationSubjectType]
    var HtmlBody: js.UndefOr[EmailNotificationBodyType]
    var TextBody: js.UndefOr[EmailNotificationBodyType]
  }

  object NotifyEmailType {
    def apply(
      Subject: js.UndefOr[EmailNotificationSubjectType] = js.undefined,
      HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined,
      TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined): NotifyEmailType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subject" -> Subject.map { x => x.asInstanceOf[js.Any] },
        "HtmlBody" -> HtmlBody.map { x => x.asInstanceOf[js.Any] },
        "TextBody" -> TextBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyEmailType]
    }
  }

  /**
   * <p>The minimum and maximum value of an attribute that is of the number data type.</p>
   */
  @js.native
  trait NumberAttributeConstraintsType extends js.Object {
    var MinValue: js.UndefOr[StringType]
    var MaxValue: js.UndefOr[StringType]
  }

  object NumberAttributeConstraintsType {
    def apply(
      MinValue: js.UndefOr[StringType] = js.undefined,
      MaxValue: js.UndefOr[StringType] = js.undefined): NumberAttributeConstraintsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinValue" -> MinValue.map { x => x.asInstanceOf[js.Any] },
        "MaxValue" -> MaxValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NumberAttributeConstraintsType]
    }
  }

  object OAuthFlowTypeEnum {
    val code = "code"
    val `implicit` = "implicit"
    val client_credentials = "client_credentials"

    val values = IndexedSeq(code, `implicit`, client_credentials)
  }

  /**
   * <p>The password policy type.</p>
   */
  @js.native
  trait PasswordPolicyType extends js.Object {
    var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType]
    var RequireNumbers: js.UndefOr[BooleanType]
    var RequireLowercase: js.UndefOr[BooleanType]
    var RequireUppercase: js.UndefOr[BooleanType]
    var RequireSymbols: js.UndefOr[BooleanType]
  }

  object PasswordPolicyType {
    def apply(
      MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined,
      RequireNumbers: js.UndefOr[BooleanType] = js.undefined,
      RequireLowercase: js.UndefOr[BooleanType] = js.undefined,
      RequireUppercase: js.UndefOr[BooleanType] = js.undefined,
      RequireSymbols: js.UndefOr[BooleanType] = js.undefined): PasswordPolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinimumLength" -> MinimumLength.map { x => x.asInstanceOf[js.Any] },
        "RequireNumbers" -> RequireNumbers.map { x => x.asInstanceOf[js.Any] },
        "RequireLowercase" -> RequireLowercase.map { x => x.asInstanceOf[js.Any] },
        "RequireUppercase" -> RequireUppercase.map { x => x.asInstanceOf[js.Any] },
        "RequireSymbols" -> RequireSymbols.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PasswordPolicyType]
    }
  }

  /**
   * <p>A container for identity provider details.</p>
   */
  @js.native
  trait ProviderDescription extends js.Object {
    var ProviderName: js.UndefOr[ProviderNameType]
    var ProviderType: js.UndefOr[IdentityProviderTypeType]
    var LastModifiedDate: js.UndefOr[DateType]
    var CreationDate: js.UndefOr[DateType]
  }

  object ProviderDescription {
    def apply(
      ProviderName: js.UndefOr[ProviderNameType] = js.undefined,
      ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      CreationDate: js.UndefOr[DateType] = js.undefined): ProviderDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] },
        "ProviderType" -> ProviderType.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProviderDescription]
    }
  }

  /**
   * <p>A container for information about an identity provider for a user pool.</p>
   */
  @js.native
  trait ProviderUserIdentifierType extends js.Object {
    var ProviderName: js.UndefOr[ProviderNameType]
    var ProviderAttributeName: js.UndefOr[StringType]
    var ProviderAttributeValue: js.UndefOr[StringType]
  }

  object ProviderUserIdentifierType {
    def apply(
      ProviderName: js.UndefOr[ProviderNameType] = js.undefined,
      ProviderAttributeName: js.UndefOr[StringType] = js.undefined,
      ProviderAttributeValue: js.UndefOr[StringType] = js.undefined): ProviderUserIdentifierType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] },
        "ProviderAttributeName" -> ProviderAttributeName.map { x => x.asInstanceOf[js.Any] },
        "ProviderAttributeValue" -> ProviderAttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProviderUserIdentifierType]
    }
  }

  /**
   * <p>Represents the request to resend the confirmation code.</p>
   */
  @js.native
  trait ResendConfirmationCodeRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var SecretHash: js.UndefOr[SecretHashType]
    var ClientId: js.UndefOr[ClientIdType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object ResendConfirmationCodeRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      SecretHash: js.UndefOr[SecretHashType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): ResendConfirmationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "SecretHash" -> SecretHash.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendConfirmationCodeRequest]
    }
  }

  /**
   * <p>The response from the server when the Amazon Cognito Your User Pools service makes the request to resend a confirmation code.</p>
   */
  @js.native
  trait ResendConfirmationCodeResponse extends js.Object {
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
  }

  object ResendConfirmationCodeResponse {
    def apply(
      CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined): ResendConfirmationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendConfirmationCodeResponse]
    }
  }

  /**
   * <p>A resource server scope.</p>
   */
  @js.native
  trait ResourceServerScopeType extends js.Object {
    var ScopeName: js.UndefOr[ResourceServerScopeNameType]
    var ScopeDescription: js.UndefOr[ResourceServerScopeDescriptionType]
  }

  object ResourceServerScopeType {
    def apply(
      ScopeName: js.UndefOr[ResourceServerScopeNameType] = js.undefined,
      ScopeDescription: js.UndefOr[ResourceServerScopeDescriptionType] = js.undefined): ResourceServerScopeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScopeName" -> ScopeName.map { x => x.asInstanceOf[js.Any] },
        "ScopeDescription" -> ScopeDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceServerScopeType]
    }
  }

  /**
   * <p>A container for information about a resource server for a user pool.</p>
   */
  @js.native
  trait ResourceServerType extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
    var Name: js.UndefOr[ResourceServerNameType]
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  object ResourceServerType {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined,
      Name: js.UndefOr[ResourceServerNameType] = js.undefined,
      Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined): ResourceServerType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Scopes" -> Scopes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceServerType]
    }
  }

  /**
   * <p>The request to respond to an authentication challenge.</p>
   */
  @js.native
  trait RespondToAuthChallengeRequest extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var Session: js.UndefOr[SessionType]
    var ClientId: js.UndefOr[ClientIdType]
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object RespondToAuthChallengeRequest {
    def apply(
      ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): RespondToAuthChallengeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ChallengeResponses" -> ChallengeResponses.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondToAuthChallengeRequest]
    }
  }

  /**
   * <p>The response to respond to the authentication challenge.</p>
   */
  @js.native
  trait RespondToAuthChallengeResponse extends js.Object {
    var ChallengeName: js.UndefOr[ChallengeNameType]
    var Session: js.UndefOr[SessionType]
    var ChallengeParameters: js.UndefOr[ChallengeParametersType]
    var AuthenticationResult: js.UndefOr[AuthenticationResultType]
  }

  object RespondToAuthChallengeResponse {
    def apply(
      ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined,
      AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined): RespondToAuthChallengeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChallengeName" -> ChallengeName.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "ChallengeParameters" -> ChallengeParameters.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationResult" -> AuthenticationResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondToAuthChallengeResponse]
    }
  }

  /**
   * <p>The risk configuration type.</p>
   */
  @js.native
  trait RiskConfigurationType extends js.Object {
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType]
    var LastModifiedDate: js.UndefOr[DateType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType]
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType]
  }

  object RiskConfigurationType {
    def apply(
      RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined,
      AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined): RiskConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskExceptionConfiguration" -> RiskExceptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "CompromisedCredentialsRiskConfiguration" -> CompromisedCredentialsRiskConfiguration.map { x => x.asInstanceOf[js.Any] },
        "AccountTakeoverRiskConfiguration" -> AccountTakeoverRiskConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RiskConfigurationType]
    }
  }

  object RiskDecisionTypeEnum {
    val NoRisk = "NoRisk"
    val AccountTakeover = "AccountTakeover"
    val Block = "Block"

    val values = IndexedSeq(NoRisk, AccountTakeover, Block)
  }

  /**
   * <p>The type of the configuration to override the risk decision.</p>
   */
  @js.native
  trait RiskExceptionConfigurationType extends js.Object {
    var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType]
    var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType]
  }

  object RiskExceptionConfigurationType {
    def apply(
      BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.undefined,
      SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.undefined): RiskExceptionConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockedIPRangeList" -> BlockedIPRangeList.map { x => x.asInstanceOf[js.Any] },
        "SkippedIPRangeList" -> SkippedIPRangeList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RiskExceptionConfigurationType]
    }
  }

  object RiskLevelTypeEnum {
    val Low = "Low"
    val Medium = "Medium"
    val High = "High"

    val values = IndexedSeq(Low, Medium, High)
  }

  /**
   * <p>The SMS multi-factor authentication (MFA) settings type.</p>
   */
  @js.native
  trait SMSMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  object SMSMfaSettingsType {
    def apply(
      Enabled: js.UndefOr[BooleanType] = js.undefined,
      PreferredMfa: js.UndefOr[BooleanType] = js.undefined): SMSMfaSettingsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "PreferredMfa" -> PreferredMfa.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMSMfaSettingsType]
    }
  }

  /**
   * <p>Contains information about the schema attribute.</p>
   */
  @js.native
  trait SchemaAttributeType extends js.Object {
    var Name: js.UndefOr[CustomAttributeNameType]
    var AttributeDataType: js.UndefOr[AttributeDataType]
    var Required: js.UndefOr[BooleanType]
    var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType]
    var Mutable: js.UndefOr[BooleanType]
    var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType]
    var DeveloperOnlyAttribute: js.UndefOr[BooleanType]
  }

  object SchemaAttributeType {
    def apply(
      Name: js.UndefOr[CustomAttributeNameType] = js.undefined,
      AttributeDataType: js.UndefOr[AttributeDataType] = js.undefined,
      Required: js.UndefOr[BooleanType] = js.undefined,
      NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.undefined,
      Mutable: js.UndefOr[BooleanType] = js.undefined,
      StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.undefined,
      DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.undefined): SchemaAttributeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AttributeDataType" -> AttributeDataType.map { x => x.asInstanceOf[js.Any] },
        "Required" -> Required.map { x => x.asInstanceOf[js.Any] },
        "NumberAttributeConstraints" -> NumberAttributeConstraints.map { x => x.asInstanceOf[js.Any] },
        "Mutable" -> Mutable.map { x => x.asInstanceOf[js.Any] },
        "StringAttributeConstraints" -> StringAttributeConstraints.map { x => x.asInstanceOf[js.Any] },
        "DeveloperOnlyAttribute" -> DeveloperOnlyAttribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaAttributeType]
    }
  }

  @js.native
  trait SetRiskConfigurationRequest extends js.Object {
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType]
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType]
  }

  object SetRiskConfigurationRequest {
    def apply(
      RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined,
      AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined): SetRiskConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskExceptionConfiguration" -> RiskExceptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "CompromisedCredentialsRiskConfiguration" -> CompromisedCredentialsRiskConfiguration.map { x => x.asInstanceOf[js.Any] },
        "AccountTakeoverRiskConfiguration" -> AccountTakeoverRiskConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRiskConfigurationRequest]
    }
  }

  @js.native
  trait SetRiskConfigurationResponse extends js.Object {
    var RiskConfiguration: js.UndefOr[RiskConfigurationType]
  }

  object SetRiskConfigurationResponse {
    def apply(
      RiskConfiguration: js.UndefOr[RiskConfigurationType] = js.undefined): SetRiskConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RiskConfiguration" -> RiskConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRiskConfigurationResponse]
    }
  }

  @js.native
  trait SetUICustomizationRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
    var CSS: js.UndefOr[CSSType]
    var ImageFile: js.UndefOr[ImageFileType]
  }

  object SetUICustomizationRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      CSS: js.UndefOr[CSSType] = js.undefined,
      ImageFile: js.UndefOr[ImageFileType] = js.undefined): SetUICustomizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "CSS" -> CSS.map { x => x.asInstanceOf[js.Any] },
        "ImageFile" -> ImageFile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUICustomizationRequest]
    }
  }

  @js.native
  trait SetUICustomizationResponse extends js.Object {
    var UICustomization: js.UndefOr[UICustomizationType]
  }

  object SetUICustomizationResponse {
    def apply(
      UICustomization: js.UndefOr[UICustomizationType] = js.undefined): SetUICustomizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UICustomization" -> UICustomization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUICustomizationResponse]
    }
  }

  @js.native
  trait SetUserMFAPreferenceRequest extends js.Object {
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType]
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType]
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object SetUserMFAPreferenceRequest {
    def apply(
      SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined,
      SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined,
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): SetUserMFAPreferenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMSMfaSettings" -> SMSMfaSettings.map { x => x.asInstanceOf[js.Any] },
        "SoftwareTokenMfaSettings" -> SoftwareTokenMfaSettings.map { x => x.asInstanceOf[js.Any] },
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserMFAPreferenceRequest]
    }
  }

  @js.native
  trait SetUserMFAPreferenceResponse extends js.Object {

  }

  object SetUserMFAPreferenceResponse {
    def apply(): SetUserMFAPreferenceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserMFAPreferenceResponse]
    }
  }

  @js.native
  trait SetUserPoolMfaConfigRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
  }

  object SetUserPoolMfaConfigRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
      SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined,
      MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined): SetUserPoolMfaConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "SmsMfaConfiguration" -> SmsMfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SoftwareTokenMfaConfiguration" -> SoftwareTokenMfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "MfaConfiguration" -> MfaConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserPoolMfaConfigRequest]
    }
  }

  @js.native
  trait SetUserPoolMfaConfigResponse extends js.Object {
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType]
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
  }

  object SetUserPoolMfaConfigResponse {
    def apply(
      SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined,
      SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined,
      MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined): SetUserPoolMfaConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmsMfaConfiguration" -> SmsMfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SoftwareTokenMfaConfiguration" -> SoftwareTokenMfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "MfaConfiguration" -> MfaConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserPoolMfaConfigResponse]
    }
  }

  /**
   * <p>Represents the request to set user settings.</p>
   */
  @js.native
  trait SetUserSettingsRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
  }

  object SetUserSettingsRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined): SetUserSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "MFAOptions" -> MFAOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserSettingsRequest]
    }
  }

  /**
   * <p>The response from the server for a set user settings request.</p>
   */
  @js.native
  trait SetUserSettingsResponse extends js.Object {

  }

  object SetUserSettingsResponse {
    def apply(): SetUserSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetUserSettingsResponse]
    }
  }

  /**
   * <p>Represents the request to register a user.</p>
   */
  @js.native
  trait SignUpRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var SecretHash: js.UndefOr[SecretHashType]
    var ValidationData: js.UndefOr[AttributeListType]
    var Password: js.UndefOr[PasswordType]
    var ClientId: js.UndefOr[ClientIdType]
    var UserAttributes: js.UndefOr[AttributeListType]
    var UserContextData: js.UndefOr[UserContextDataType]
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType]
  }

  object SignUpRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      SecretHash: js.UndefOr[SecretHashType] = js.undefined,
      ValidationData: js.UndefOr[AttributeListType] = js.undefined,
      Password: js.UndefOr[PasswordType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
      UserContextData: js.UndefOr[UserContextDataType] = js.undefined,
      AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined): SignUpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "SecretHash" -> SecretHash.map { x => x.asInstanceOf[js.Any] },
        "ValidationData" -> ValidationData.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "UserAttributes" -> UserAttributes.map { x => x.asInstanceOf[js.Any] },
        "UserContextData" -> UserContextData.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsMetadata" -> AnalyticsMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignUpRequest]
    }
  }

  /**
   * <p>The response from the server for a registration request.</p>
   */
  @js.native
  trait SignUpResponse extends js.Object {
    var UserConfirmed: js.UndefOr[BooleanType]
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType]
    var UserSub: js.UndefOr[StringType]
  }

  object SignUpResponse {
    def apply(
      UserConfirmed: js.UndefOr[BooleanType] = js.undefined,
      CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined,
      UserSub: js.UndefOr[StringType] = js.undefined): SignUpResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserConfirmed" -> UserConfirmed.map { x => x.asInstanceOf[js.Any] },
        "CodeDeliveryDetails" -> CodeDeliveryDetails.map { x => x.asInstanceOf[js.Any] },
        "UserSub" -> UserSub.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignUpResponse]
    }
  }

  /**
   * <p>The SMS configuration type.</p>
   */
  @js.native
  trait SmsConfigurationType extends js.Object {
    var SnsCallerArn: js.UndefOr[ArnType]
    var ExternalId: js.UndefOr[StringType]
  }

  object SmsConfigurationType {
    def apply(
      SnsCallerArn: js.UndefOr[ArnType] = js.undefined,
      ExternalId: js.UndefOr[StringType] = js.undefined): SmsConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnsCallerArn" -> SnsCallerArn.map { x => x.asInstanceOf[js.Any] },
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SmsConfigurationType]
    }
  }

  /**
   * <p>The SMS text message multi-factor authentication (MFA) configuration type.</p>
   */
  @js.native
  trait SmsMfaConfigType extends js.Object {
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
  }

  object SmsMfaConfigType {
    def apply(
      SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined): SmsMfaConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x => x.asInstanceOf[js.Any] },
        "SmsConfiguration" -> SmsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SmsMfaConfigType]
    }
  }

  /**
   * <p>The type used for enabling software token MFA at the user pool level.</p>
   */
  @js.native
  trait SoftwareTokenMfaConfigType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
  }

  object SoftwareTokenMfaConfigType {
    def apply(
      Enabled: js.UndefOr[BooleanType] = js.undefined): SoftwareTokenMfaConfigType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SoftwareTokenMfaConfigType]
    }
  }

  /**
   * <p>The type used for enabling software token MFA at the user level.</p>
   */
  @js.native
  trait SoftwareTokenMfaSettingsType extends js.Object {
    var Enabled: js.UndefOr[BooleanType]
    var PreferredMfa: js.UndefOr[BooleanType]
  }

  object SoftwareTokenMfaSettingsType {
    def apply(
      Enabled: js.UndefOr[BooleanType] = js.undefined,
      PreferredMfa: js.UndefOr[BooleanType] = js.undefined): SoftwareTokenMfaSettingsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "PreferredMfa" -> PreferredMfa.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SoftwareTokenMfaSettingsType]
    }
  }

  /**
   * <p>Represents the request to start the user import job.</p>
   */
  @js.native
  trait StartUserImportJobRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var JobId: js.UndefOr[UserImportJobIdType]
  }

  object StartUserImportJobRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      JobId: js.UndefOr[UserImportJobIdType] = js.undefined): StartUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartUserImportJobRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to start the user import job.</p>
   */
  @js.native
  trait StartUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object StartUserImportJobResponse {
    def apply(
      UserImportJob: js.UndefOr[UserImportJobType] = js.undefined): StartUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartUserImportJobResponse]
    }
  }

  object StatusTypeEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  /**
   * <p>Represents the request to stop the user import job.</p>
   */
  @js.native
  trait StopUserImportJobRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var JobId: js.UndefOr[UserImportJobIdType]
  }

  object StopUserImportJobRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      JobId: js.UndefOr[UserImportJobIdType] = js.undefined): StopUserImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopUserImportJobRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to stop the user import job.</p>
   */
  @js.native
  trait StopUserImportJobResponse extends js.Object {
    var UserImportJob: js.UndefOr[UserImportJobType]
  }

  object StopUserImportJobResponse {
    def apply(
      UserImportJob: js.UndefOr[UserImportJobType] = js.undefined): StopUserImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserImportJob" -> UserImportJob.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopUserImportJobResponse]
    }
  }

  /**
   * <p>The constraints associated with a string attribute.</p>
   */
  @js.native
  trait StringAttributeConstraintsType extends js.Object {
    var MinLength: js.UndefOr[StringType]
    var MaxLength: js.UndefOr[StringType]
  }

  object StringAttributeConstraintsType {
    def apply(
      MinLength: js.UndefOr[StringType] = js.undefined,
      MaxLength: js.UndefOr[StringType] = js.undefined): StringAttributeConstraintsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinLength" -> MinLength.map { x => x.asInstanceOf[js.Any] },
        "MaxLength" -> MaxLength.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StringAttributeConstraintsType]
    }
  }

  /**
   * <p>A container for the UI customization information for a user pool's built-in app UI.</p>
   */
  @js.native
  trait UICustomizationType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var CSS: js.UndefOr[CSSType]
    var LastModifiedDate: js.UndefOr[DateType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientId: js.UndefOr[ClientIdType]
    var CSSVersion: js.UndefOr[CSSVersionType]
    var ImageUrl: js.UndefOr[ImageUrlType]
  }

  object UICustomizationType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      CSS: js.UndefOr[CSSType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      CSSVersion: js.UndefOr[CSSVersionType] = js.undefined,
      ImageUrl: js.UndefOr[ImageUrlType] = js.undefined): UICustomizationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "CSS" -> CSS.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "CSSVersion" -> CSSVersion.map { x => x.asInstanceOf[js.Any] },
        "ImageUrl" -> ImageUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UICustomizationType]
    }
  }

  @js.native
  trait UpdateAuthEventFeedbackRequest extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var FeedbackValue: js.UndefOr[FeedbackValueType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var EventId: js.UndefOr[EventIdType]
    var FeedbackToken: js.UndefOr[TokenModelType]
  }

  object UpdateAuthEventFeedbackRequest {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      FeedbackValue: js.UndefOr[FeedbackValueType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      EventId: js.UndefOr[EventIdType] = js.undefined,
      FeedbackToken: js.UndefOr[TokenModelType] = js.undefined): UpdateAuthEventFeedbackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "FeedbackValue" -> FeedbackValue.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "FeedbackToken" -> FeedbackToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthEventFeedbackRequest]
    }
  }

  @js.native
  trait UpdateAuthEventFeedbackResponse extends js.Object {

  }

  object UpdateAuthEventFeedbackResponse {
    def apply(): UpdateAuthEventFeedbackResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthEventFeedbackResponse]
    }
  }

  /**
   * <p>Represents the request to update the device status.</p>
   */
  @js.native
  trait UpdateDeviceStatusRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var DeviceKey: js.UndefOr[DeviceKeyType]
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType]
  }

  object UpdateDeviceStatusRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined,
      DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined): UpdateDeviceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "DeviceKey" -> DeviceKey.map { x => x.asInstanceOf[js.Any] },
        "DeviceRememberedStatus" -> DeviceRememberedStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceStatusRequest]
    }
  }

  /**
   * <p>The response to the request to update the device status.</p>
   */
  @js.native
  trait UpdateDeviceStatusResponse extends js.Object {

  }

  object UpdateDeviceStatusResponse {
    def apply(): UpdateDeviceStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceStatusResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupNameType]
    var Description: js.UndefOr[DescriptionType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Precedence: js.UndefOr[PrecedenceType]
    var RoleArn: js.UndefOr[ArnType]
  }

  object UpdateGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupNameType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Precedence: js.UndefOr[PrecedenceType] = js.undefined,
      RoleArn: js.UndefOr[ArnType] = js.undefined): UpdateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Precedence" -> Precedence.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[GroupType]
  }

  object UpdateGroupResponse {
    def apply(
      Group: js.UndefOr[GroupType] = js.undefined): UpdateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateIdentityProviderRequest extends js.Object {
    var ProviderDetails: js.UndefOr[ProviderDetailsType]
    var AttributeMapping: js.UndefOr[AttributeMappingType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType]
    var ProviderName: js.UndefOr[ProviderNameType]
  }

  object UpdateIdentityProviderRequest {
    def apply(
      ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined,
      AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined,
      ProviderName: js.UndefOr[ProviderNameType] = js.undefined): UpdateIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProviderDetails" -> ProviderDetails.map { x => x.asInstanceOf[js.Any] },
        "AttributeMapping" -> AttributeMapping.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdpIdentifiers" -> IdpIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIdentityProviderRequest]
    }
  }

  @js.native
  trait UpdateIdentityProviderResponse extends js.Object {
    var IdentityProvider: js.UndefOr[IdentityProviderType]
  }

  object UpdateIdentityProviderResponse {
    def apply(
      IdentityProvider: js.UndefOr[IdentityProviderType] = js.undefined): UpdateIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProvider" -> IdentityProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIdentityProviderResponse]
    }
  }

  @js.native
  trait UpdateResourceServerRequest extends js.Object {
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var Identifier: js.UndefOr[ResourceServerIdentifierType]
    var Name: js.UndefOr[ResourceServerNameType]
    var Scopes: js.UndefOr[ResourceServerScopeListType]
  }

  object UpdateResourceServerRequest {
    def apply(
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined,
      Name: js.UndefOr[ResourceServerNameType] = js.undefined,
      Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined): UpdateResourceServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Scopes" -> Scopes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceServerRequest]
    }
  }

  @js.native
  trait UpdateResourceServerResponse extends js.Object {
    var ResourceServer: js.UndefOr[ResourceServerType]
  }

  object UpdateResourceServerResponse {
    def apply(
      ResourceServer: js.UndefOr[ResourceServerType] = js.undefined): UpdateResourceServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceServer" -> ResourceServer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceServerResponse]
    }
  }

  /**
   * <p>Represents the request to update user attributes.</p>
   */
  @js.native
  trait UpdateUserAttributesRequest extends js.Object {
    var UserAttributes: js.UndefOr[AttributeListType]
    var AccessToken: js.UndefOr[TokenModelType]
  }

  object UpdateUserAttributesRequest {
    def apply(
      UserAttributes: js.UndefOr[AttributeListType] = js.undefined,
      AccessToken: js.UndefOr[TokenModelType] = js.undefined): UpdateUserAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserAttributes" -> UserAttributes.map { x => x.asInstanceOf[js.Any] },
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserAttributesRequest]
    }
  }

  /**
   * <p>Represents the response from the server for the request to update user attributes.</p>
   */
  @js.native
  trait UpdateUserAttributesResponse extends js.Object {
    var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType]
  }

  object UpdateUserAttributesResponse {
    def apply(
      CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.undefined): UpdateUserAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeDeliveryDetailsList" -> CodeDeliveryDetailsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserAttributesResponse]
    }
  }

  /**
   * <p>Represents the request to update the user pool client.</p>
   */
  @js.native
  trait UpdateUserPoolClientRequest extends js.Object {
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var ClientId: js.UndefOr[ClientIdType]
    var ClientName: js.UndefOr[ClientNameType]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
  }

  object UpdateUserPoolClientRequest {
    def apply(
      AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
      ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
      RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
      DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
      WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
      AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      ClientName: js.UndefOr[ClientNameType] = js.undefined,
      ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
      SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
      AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
      CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
      LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined): UpdateUserPoolClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedOAuthFlowsUserPoolClient" -> AllowedOAuthFlowsUserPoolClient.map { x => x.asInstanceOf[js.Any] },
        "ExplicitAuthFlows" -> ExplicitAuthFlows.map { x => x.asInstanceOf[js.Any] },
        "RefreshTokenValidity" -> RefreshTokenValidity.map { x => x.asInstanceOf[js.Any] },
        "DefaultRedirectURI" -> DefaultRedirectURI.map { x => x.asInstanceOf[js.Any] },
        "WriteAttributes" -> WriteAttributes.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthScopes" -> AllowedOAuthScopes.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthFlows" -> AllowedOAuthFlows.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ClientName" -> ClientName.map { x => x.asInstanceOf[js.Any] },
        "ReadAttributes" -> ReadAttributes.map { x => x.asInstanceOf[js.Any] },
        "SupportedIdentityProviders" -> SupportedIdentityProviders.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CallbackURLs" -> CallbackURLs.map { x => x.asInstanceOf[js.Any] },
        "LogoutURLs" -> LogoutURLs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolClientRequest]
    }
  }

  /**
   * <p>Represents the response from the server to the request to update the user pool client.</p>
   */
  @js.native
  trait UpdateUserPoolClientResponse extends js.Object {
    var UserPoolClient: js.UndefOr[UserPoolClientType]
  }

  object UpdateUserPoolClientResponse {
    def apply(
      UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined): UpdateUserPoolClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClient" -> UserPoolClient.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolClientResponse]
    }
  }

  /**
   * <p>Represents the request to update the user pool.</p>
   */
  @js.native
  trait UpdateUserPoolRequest extends js.Object {
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var Policies: js.UndefOr[UserPoolPolicyType]
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var EmailConfiguration: js.UndefOr[EmailConfigurationType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType]
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
  }

  object UpdateUserPoolRequest {
    def apply(
      SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
      Policies: js.UndefOr[UserPoolPolicyType] = js.undefined,
      UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
      EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined,
      AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
      EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
      EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
      SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined,
      UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
      LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
      SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined,
      VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined): UpdateUserPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmsVerificationMessage" -> SmsVerificationMessage.map { x => x.asInstanceOf[js.Any] },
        "AutoVerifiedAttributes" -> AutoVerifiedAttributes.map { x => x.asInstanceOf[js.Any] },
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "UserPoolAddOns" -> UserPoolAddOns.map { x => x.asInstanceOf[js.Any] },
        "EmailConfiguration" -> EmailConfiguration.map { x => x.asInstanceOf[js.Any] },
        "AdminCreateUserConfig" -> AdminCreateUserConfig.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "MfaConfiguration" -> MfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "EmailVerificationSubject" -> EmailVerificationSubject.map { x => x.asInstanceOf[js.Any] },
        "EmailVerificationMessage" -> EmailVerificationMessage.map { x => x.asInstanceOf[js.Any] },
        "SmsConfiguration" -> SmsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "UserPoolTags" -> UserPoolTags.map { x => x.asInstanceOf[js.Any] },
        "LambdaConfig" -> LambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x => x.asInstanceOf[js.Any] },
        "DeviceConfiguration" -> DeviceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "VerificationMessageTemplate" -> VerificationMessageTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolRequest]
    }
  }

  /**
   * <p>Represents the response from the server when you make a request to update the user pool.</p>
   */
  @js.native
  trait UpdateUserPoolResponse extends js.Object {

  }

  object UpdateUserPoolResponse {
    def apply(): UpdateUserPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPoolResponse]
    }
  }

  /**
   * <p>Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.</p>
   */
  @js.native
  trait UserContextDataType extends js.Object {
    var EncodedData: js.UndefOr[StringType]
  }

  object UserContextDataType {
    def apply(
      EncodedData: js.UndefOr[StringType] = js.undefined): UserContextDataType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncodedData" -> EncodedData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserContextDataType]
    }
  }

  object UserImportJobStatusTypeEnum {
    val Created = "Created"
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Stopping = "Stopping"
    val Expired = "Expired"
    val Stopped = "Stopped"
    val Failed = "Failed"
    val Succeeded = "Succeeded"

    val values = IndexedSeq(Created, Pending, InProgress, Stopping, Expired, Stopped, Failed, Succeeded)
  }

  /**
   * <p>The user import job type.</p>
   */
  @js.native
  trait UserImportJobType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var CloudWatchLogsRoleArn: js.UndefOr[ArnType]
    var CompletionDate: js.UndefOr[DateType]
    var JobId: js.UndefOr[UserImportJobIdType]
    var CompletionMessage: js.UndefOr[CompletionMessageType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var PreSignedUrl: js.UndefOr[PreSignedUrlType]
    var JobName: js.UndefOr[UserImportJobNameType]
    var ImportedUsers: js.UndefOr[LongType]
    var SkippedUsers: js.UndefOr[LongType]
    var StartDate: js.UndefOr[DateType]
    var FailedUsers: js.UndefOr[LongType]
    var Status: js.UndefOr[UserImportJobStatusType]
  }

  object UserImportJobType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.undefined,
      CompletionDate: js.UndefOr[DateType] = js.undefined,
      JobId: js.UndefOr[UserImportJobIdType] = js.undefined,
      CompletionMessage: js.UndefOr[CompletionMessageType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.undefined,
      JobName: js.UndefOr[UserImportJobNameType] = js.undefined,
      ImportedUsers: js.UndefOr[LongType] = js.undefined,
      SkippedUsers: js.UndefOr[LongType] = js.undefined,
      StartDate: js.UndefOr[DateType] = js.undefined,
      FailedUsers: js.UndefOr[LongType] = js.undefined,
      Status: js.UndefOr[UserImportJobStatusType] = js.undefined): UserImportJobType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CompletionDate" -> CompletionDate.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "CompletionMessage" -> CompletionMessage.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ImportedUsers" -> ImportedUsers.map { x => x.asInstanceOf[js.Any] },
        "SkippedUsers" -> SkippedUsers.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "FailedUsers" -> FailedUsers.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserImportJobType]
    }
  }

  /**
   * <p>The user pool add-ons type.</p>
   */
  @js.native
  trait UserPoolAddOnsType extends js.Object {
    var AdvancedSecurityMode: js.UndefOr[AdvancedSecurityModeType]
  }

  object UserPoolAddOnsType {
    def apply(
      AdvancedSecurityMode: js.UndefOr[AdvancedSecurityModeType] = js.undefined): UserPoolAddOnsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdvancedSecurityMode" -> AdvancedSecurityMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolAddOnsType]
    }
  }

  /**
   * <p>The description of the user pool client.</p>
   */
  @js.native
  trait UserPoolClientDescription extends js.Object {
    var ClientId: js.UndefOr[ClientIdType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var ClientName: js.UndefOr[ClientNameType]
  }

  object UserPoolClientDescription {
    def apply(
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      ClientName: js.UndefOr[ClientNameType] = js.undefined): UserPoolClientDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "ClientName" -> ClientName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolClientDescription]
    }
  }

  /**
   * <p>Contains information about a user pool client.</p>
   */
  @js.native
  trait UserPoolClientType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType]
    var LastModifiedDate: js.UndefOr[DateType]
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType]
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType]
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType]
    var WriteAttributes: js.UndefOr[ClientPermissionListType]
    var UserPoolId: js.UndefOr[UserPoolIdType]
    var AllowedOAuthScopes: js.UndefOr[ScopeListType]
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType]
    var ClientId: js.UndefOr[ClientIdType]
    var ClientSecret: js.UndefOr[ClientSecretType]
    var ClientName: js.UndefOr[ClientNameType]
    var ReadAttributes: js.UndefOr[ClientPermissionListType]
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType]
    var CallbackURLs: js.UndefOr[CallbackURLsListType]
    var LogoutURLs: js.UndefOr[LogoutURLsListType]
  }

  object UserPoolClientType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined,
      RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
      DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined,
      WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined,
      AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined,
      AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined,
      ClientId: js.UndefOr[ClientIdType] = js.undefined,
      ClientSecret: js.UndefOr[ClientSecretType] = js.undefined,
      ClientName: js.UndefOr[ClientNameType] = js.undefined,
      ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined,
      SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined,
      AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined,
      CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined,
      LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined): UserPoolClientType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthFlowsUserPoolClient" -> AllowedOAuthFlowsUserPoolClient.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "ExplicitAuthFlows" -> ExplicitAuthFlows.map { x => x.asInstanceOf[js.Any] },
        "RefreshTokenValidity" -> RefreshTokenValidity.map { x => x.asInstanceOf[js.Any] },
        "DefaultRedirectURI" -> DefaultRedirectURI.map { x => x.asInstanceOf[js.Any] },
        "WriteAttributes" -> WriteAttributes.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthScopes" -> AllowedOAuthScopes.map { x => x.asInstanceOf[js.Any] },
        "AllowedOAuthFlows" -> AllowedOAuthFlows.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ClientSecret" -> ClientSecret.map { x => x.asInstanceOf[js.Any] },
        "ClientName" -> ClientName.map { x => x.asInstanceOf[js.Any] },
        "ReadAttributes" -> ReadAttributes.map { x => x.asInstanceOf[js.Any] },
        "SupportedIdentityProviders" -> SupportedIdentityProviders.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CallbackURLs" -> CallbackURLs.map { x => x.asInstanceOf[js.Any] },
        "LogoutURLs" -> LogoutURLs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolClientType]
    }
  }

  /**
   * <p>A user pool description.</p>
   */
  @js.native
  trait UserPoolDescriptionType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var Id: js.UndefOr[UserPoolIdType]
    var Name: js.UndefOr[UserPoolNameType]
    var LastModifiedDate: js.UndefOr[DateType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var Status: js.UndefOr[StatusType]
  }

  object UserPoolDescriptionType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      Id: js.UndefOr[UserPoolIdType] = js.undefined,
      Name: js.UndefOr[UserPoolNameType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
      Status: js.UndefOr[StatusType] = js.undefined): UserPoolDescriptionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "LambdaConfig" -> LambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolDescriptionType]
    }
  }

  object UserPoolMfaTypeEnum {
    val OFF = "OFF"
    val ON = "ON"
    val OPTIONAL = "OPTIONAL"

    val values = IndexedSeq(OFF, ON, OPTIONAL)
  }

  /**
   * <p>The policy associated with a user pool.</p>
   */
  @js.native
  trait UserPoolPolicyType extends js.Object {
    var PasswordPolicy: js.UndefOr[PasswordPolicyType]
  }

  object UserPoolPolicyType {
    def apply(
      PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.undefined): UserPoolPolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordPolicy" -> PasswordPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolPolicyType]
    }
  }

  /**
   * <p>A container for information about the user pool.</p>
   */
  @js.native
  trait UserPoolType extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var CustomDomain: js.UndefOr[DomainType]
    var Id: js.UndefOr[UserPoolIdType]
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType]
    var Name: js.UndefOr[UserPoolNameType]
    var LastModifiedDate: js.UndefOr[DateType]
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType]
    var EmailConfigurationFailure: js.UndefOr[StringType]
    var Policies: js.UndefOr[UserPoolPolicyType]
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType]
    var EmailConfiguration: js.UndefOr[EmailConfigurationType]
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType]
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType]
    var MfaConfiguration: js.UndefOr[UserPoolMfaType]
    var Arn: js.UndefOr[ArnType]
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType]
    var SchemaAttributes: js.UndefOr[SchemaAttributesListType]
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType]
    var AliasAttributes: js.UndefOr[AliasAttributesListType]
    var SmsConfigurationFailure: js.UndefOr[StringType]
    var SmsConfiguration: js.UndefOr[SmsConfigurationType]
    var UserPoolTags: js.UndefOr[UserPoolTagsType]
    var EstimatedNumberOfUsers: js.UndefOr[IntegerType]
    var LambdaConfig: js.UndefOr[LambdaConfigType]
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType]
    var Domain: js.UndefOr[DomainType]
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType]
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType]
    var Status: js.UndefOr[StatusType]
  }

  object UserPoolType {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      CustomDomain: js.UndefOr[DomainType] = js.undefined,
      Id: js.UndefOr[UserPoolIdType] = js.undefined,
      SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      Name: js.UndefOr[UserPoolNameType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined,
      AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined,
      EmailConfigurationFailure: js.UndefOr[StringType] = js.undefined,
      Policies: js.UndefOr[UserPoolPolicyType] = js.undefined,
      UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined,
      EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined,
      AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined,
      UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined,
      MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined,
      Arn: js.UndefOr[ArnType] = js.undefined,
      EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
      SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.undefined,
      EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
      AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined,
      SmsConfigurationFailure: js.UndefOr[StringType] = js.undefined,
      SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined,
      UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined,
      EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.undefined,
      LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined,
      SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined,
      DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined,
      VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined,
      Status: js.UndefOr[StatusType] = js.undefined): UserPoolType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "CustomDomain" -> CustomDomain.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "SmsVerificationMessage" -> SmsVerificationMessage.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "AutoVerifiedAttributes" -> AutoVerifiedAttributes.map { x => x.asInstanceOf[js.Any] },
        "EmailConfigurationFailure" -> EmailConfigurationFailure.map { x => x.asInstanceOf[js.Any] },
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "UserPoolAddOns" -> UserPoolAddOns.map { x => x.asInstanceOf[js.Any] },
        "EmailConfiguration" -> EmailConfiguration.map { x => x.asInstanceOf[js.Any] },
        "AdminCreateUserConfig" -> AdminCreateUserConfig.map { x => x.asInstanceOf[js.Any] },
        "UsernameAttributes" -> UsernameAttributes.map { x => x.asInstanceOf[js.Any] },
        "MfaConfiguration" -> MfaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "EmailVerificationSubject" -> EmailVerificationSubject.map { x => x.asInstanceOf[js.Any] },
        "SchemaAttributes" -> SchemaAttributes.map { x => x.asInstanceOf[js.Any] },
        "EmailVerificationMessage" -> EmailVerificationMessage.map { x => x.asInstanceOf[js.Any] },
        "AliasAttributes" -> AliasAttributes.map { x => x.asInstanceOf[js.Any] },
        "SmsConfigurationFailure" -> SmsConfigurationFailure.map { x => x.asInstanceOf[js.Any] },
        "SmsConfiguration" -> SmsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "UserPoolTags" -> UserPoolTags.map { x => x.asInstanceOf[js.Any] },
        "EstimatedNumberOfUsers" -> EstimatedNumberOfUsers.map { x => x.asInstanceOf[js.Any] },
        "LambdaConfig" -> LambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "SmsAuthenticationMessage" -> SmsAuthenticationMessage.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "DeviceConfiguration" -> DeviceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "VerificationMessageTemplate" -> VerificationMessageTemplate.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolType]
    }
  }

  object UserStatusTypeEnum {
    val UNCONFIRMED = "UNCONFIRMED"
    val CONFIRMED = "CONFIRMED"
    val ARCHIVED = "ARCHIVED"
    val COMPROMISED = "COMPROMISED"
    val UNKNOWN = "UNKNOWN"
    val RESET_REQUIRED = "RESET_REQUIRED"
    val FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD"

    val values = IndexedSeq(UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD)
  }

  /**
   * <p>The user type.</p>
   */
  @js.native
  trait UserType extends js.Object {
    var Username: js.UndefOr[UsernameType]
    var UserLastModifiedDate: js.UndefOr[DateType]
    var UserStatus: js.UndefOr[UserStatusType]
    var MFAOptions: js.UndefOr[MFAOptionListType]
    var Attributes: js.UndefOr[AttributeListType]
    var Enabled: js.UndefOr[BooleanType]
    var UserCreateDate: js.UndefOr[DateType]
  }

  object UserType {
    def apply(
      Username: js.UndefOr[UsernameType] = js.undefined,
      UserLastModifiedDate: js.UndefOr[DateType] = js.undefined,
      UserStatus: js.UndefOr[UserStatusType] = js.undefined,
      MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined,
      Attributes: js.UndefOr[AttributeListType] = js.undefined,
      Enabled: js.UndefOr[BooleanType] = js.undefined,
      UserCreateDate: js.UndefOr[DateType] = js.undefined): UserType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "UserLastModifiedDate" -> UserLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "UserStatus" -> UserStatus.map { x => x.asInstanceOf[js.Any] },
        "MFAOptions" -> MFAOptions.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "UserCreateDate" -> UserCreateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserType]
    }
  }

  object UsernameAttributeTypeEnum {
    val phone_number = "phone_number"
    val email = "email"

    val values = IndexedSeq(phone_number, email)
  }

  /**
   * <p>The template for verification messages.</p>
   */
  @js.native
  trait VerificationMessageTemplateType extends js.Object {
    var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType]
    var SmsMessage: js.UndefOr[SmsVerificationMessageType]
    var EmailMessage: js.UndefOr[EmailVerificationMessageType]
    var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType]
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType]
    var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType]
  }

  object VerificationMessageTemplateType {
    def apply(
      DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.undefined,
      SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined,
      EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined,
      EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.undefined,
      EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined,
      EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.undefined): VerificationMessageTemplateType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultEmailOption" -> DefaultEmailOption.map { x => x.asInstanceOf[js.Any] },
        "SmsMessage" -> SmsMessage.map { x => x.asInstanceOf[js.Any] },
        "EmailMessage" -> EmailMessage.map { x => x.asInstanceOf[js.Any] },
        "EmailMessageByLink" -> EmailMessageByLink.map { x => x.asInstanceOf[js.Any] },
        "EmailSubject" -> EmailSubject.map { x => x.asInstanceOf[js.Any] },
        "EmailSubjectByLink" -> EmailSubjectByLink.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerificationMessageTemplateType]
    }
  }

  object VerifiedAttributeTypeEnum {
    val phone_number = "phone_number"
    val email = "email"

    val values = IndexedSeq(phone_number, email)
  }

  @js.native
  trait VerifySoftwareTokenRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var Session: js.UndefOr[SessionType]
    var UserCode: js.UndefOr[SoftwareTokenMFAUserCodeType]
    var FriendlyDeviceName: js.UndefOr[StringType]
  }

  object VerifySoftwareTokenRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined,
      UserCode: js.UndefOr[SoftwareTokenMFAUserCodeType] = js.undefined,
      FriendlyDeviceName: js.UndefOr[StringType] = js.undefined): VerifySoftwareTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] },
        "UserCode" -> UserCode.map { x => x.asInstanceOf[js.Any] },
        "FriendlyDeviceName" -> FriendlyDeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifySoftwareTokenRequest]
    }
  }

  @js.native
  trait VerifySoftwareTokenResponse extends js.Object {
    var Status: js.UndefOr[VerifySoftwareTokenResponseType]
    var Session: js.UndefOr[SessionType]
  }

  object VerifySoftwareTokenResponse {
    def apply(
      Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.undefined,
      Session: js.UndefOr[SessionType] = js.undefined): VerifySoftwareTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Session" -> Session.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifySoftwareTokenResponse]
    }
  }

  object VerifySoftwareTokenResponseTypeEnum {
    val SUCCESS = "SUCCESS"
    val ERROR = "ERROR"

    val values = IndexedSeq(SUCCESS, ERROR)
  }

  /**
   * <p>Represents the request to verify user attributes.</p>
   */
  @js.native
  trait VerifyUserAttributeRequest extends js.Object {
    var AccessToken: js.UndefOr[TokenModelType]
    var AttributeName: js.UndefOr[AttributeNameType]
    var Code: js.UndefOr[ConfirmationCodeType]
  }

  object VerifyUserAttributeRequest {
    def apply(
      AccessToken: js.UndefOr[TokenModelType] = js.undefined,
      AttributeName: js.UndefOr[AttributeNameType] = js.undefined,
      Code: js.UndefOr[ConfirmationCodeType] = js.undefined): VerifyUserAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyUserAttributeRequest]
    }
  }

  /**
   * <p>A container representing the response from the server from the request to verify user attributes.</p>
   */
  @js.native
  trait VerifyUserAttributeResponse extends js.Object {

  }

  object VerifyUserAttributeResponse {
    def apply(): VerifyUserAttributeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyUserAttributeResponse]
    }
  }
}
