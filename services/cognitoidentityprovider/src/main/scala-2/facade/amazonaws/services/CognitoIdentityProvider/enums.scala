package facade.amazonaws.services.cognitoidentityprovider

import scalajs.js

@js.native
sealed trait AccountTakeoverEventActionType extends js.Any
object AccountTakeoverEventActionType {
  val BLOCK = "BLOCK".asInstanceOf[AccountTakeoverEventActionType]
  val MFA_IF_CONFIGURED = "MFA_IF_CONFIGURED".asInstanceOf[AccountTakeoverEventActionType]
  val MFA_REQUIRED = "MFA_REQUIRED".asInstanceOf[AccountTakeoverEventActionType]
  val NO_ACTION = "NO_ACTION".asInstanceOf[AccountTakeoverEventActionType]

  @inline def values: js.Array[AccountTakeoverEventActionType] = js.Array(BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION)
}

@js.native
sealed trait AdvancedSecurityModeType extends js.Any
object AdvancedSecurityModeType {
  val OFF = "OFF".asInstanceOf[AdvancedSecurityModeType]
  val AUDIT = "AUDIT".asInstanceOf[AdvancedSecurityModeType]
  val ENFORCED = "ENFORCED".asInstanceOf[AdvancedSecurityModeType]

  @inline def values: js.Array[AdvancedSecurityModeType] = js.Array(OFF, AUDIT, ENFORCED)
}

@js.native
sealed trait AliasAttributeType extends js.Any
object AliasAttributeType {
  val phone_number = "phone_number".asInstanceOf[AliasAttributeType]
  val email = "email".asInstanceOf[AliasAttributeType]
  val preferred_username = "preferred_username".asInstanceOf[AliasAttributeType]

  @inline def values: js.Array[AliasAttributeType] = js.Array(phone_number, email, preferred_username)
}

@js.native
sealed trait AttributeDataType extends js.Any
object AttributeDataType {
  val String = "String".asInstanceOf[AttributeDataType]
  val Number = "Number".asInstanceOf[AttributeDataType]
  val DateTime = "DateTime".asInstanceOf[AttributeDataType]
  val Boolean = "Boolean".asInstanceOf[AttributeDataType]

  @inline def values: js.Array[AttributeDataType] = js.Array(String, Number, DateTime, Boolean)
}

@js.native
sealed trait AuthFlowType extends js.Any
object AuthFlowType {
  val USER_SRP_AUTH = "USER_SRP_AUTH".asInstanceOf[AuthFlowType]
  val REFRESH_TOKEN_AUTH = "REFRESH_TOKEN_AUTH".asInstanceOf[AuthFlowType]
  val REFRESH_TOKEN = "REFRESH_TOKEN".asInstanceOf[AuthFlowType]
  val CUSTOM_AUTH = "CUSTOM_AUTH".asInstanceOf[AuthFlowType]
  val ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[AuthFlowType]
  val USER_PASSWORD_AUTH = "USER_PASSWORD_AUTH".asInstanceOf[AuthFlowType]
  val ADMIN_USER_PASSWORD_AUTH = "ADMIN_USER_PASSWORD_AUTH".asInstanceOf[AuthFlowType]

  @inline def values: js.Array[AuthFlowType] = js.Array(USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN, CUSTOM_AUTH, ADMIN_NO_SRP_AUTH, USER_PASSWORD_AUTH, ADMIN_USER_PASSWORD_AUTH)
}

@js.native
sealed trait ChallengeName extends js.Any
object ChallengeName {
  val Password = "Password".asInstanceOf[ChallengeName]
  val Mfa = "Mfa".asInstanceOf[ChallengeName]

  @inline def values: js.Array[ChallengeName] = js.Array(Password, Mfa)
}

@js.native
sealed trait ChallengeNameType extends js.Any
object ChallengeNameType {
  val SMS_MFA = "SMS_MFA".asInstanceOf[ChallengeNameType]
  val SOFTWARE_TOKEN_MFA = "SOFTWARE_TOKEN_MFA".asInstanceOf[ChallengeNameType]
  val SELECT_MFA_TYPE = "SELECT_MFA_TYPE".asInstanceOf[ChallengeNameType]
  val MFA_SETUP = "MFA_SETUP".asInstanceOf[ChallengeNameType]
  val PASSWORD_VERIFIER = "PASSWORD_VERIFIER".asInstanceOf[ChallengeNameType]
  val CUSTOM_CHALLENGE = "CUSTOM_CHALLENGE".asInstanceOf[ChallengeNameType]
  val DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH".asInstanceOf[ChallengeNameType]
  val DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[ChallengeNameType]
  val ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[ChallengeNameType]
  val NEW_PASSWORD_REQUIRED = "NEW_PASSWORD_REQUIRED".asInstanceOf[ChallengeNameType]

  @inline def values: js.Array[ChallengeNameType] = js.Array(
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

@js.native
sealed trait ChallengeResponse extends js.Any
object ChallengeResponse {
  val Success = "Success".asInstanceOf[ChallengeResponse]
  val Failure = "Failure".asInstanceOf[ChallengeResponse]

  @inline def values: js.Array[ChallengeResponse] = js.Array(Success, Failure)
}

@js.native
sealed trait CompromisedCredentialsEventActionType extends js.Any
object CompromisedCredentialsEventActionType {
  val BLOCK = "BLOCK".asInstanceOf[CompromisedCredentialsEventActionType]
  val NO_ACTION = "NO_ACTION".asInstanceOf[CompromisedCredentialsEventActionType]

  @inline def values: js.Array[CompromisedCredentialsEventActionType] = js.Array(BLOCK, NO_ACTION)
}

@js.native
sealed trait CustomEmailSenderLambdaVersionType extends js.Any
object CustomEmailSenderLambdaVersionType {
  val V1_0 = "V1_0".asInstanceOf[CustomEmailSenderLambdaVersionType]

  @inline def values: js.Array[CustomEmailSenderLambdaVersionType] = js.Array(V1_0)
}

@js.native
sealed trait CustomSMSSenderLambdaVersionType extends js.Any
object CustomSMSSenderLambdaVersionType {
  val V1_0 = "V1_0".asInstanceOf[CustomSMSSenderLambdaVersionType]

  @inline def values: js.Array[CustomSMSSenderLambdaVersionType] = js.Array(V1_0)
}

@js.native
sealed trait DefaultEmailOptionType extends js.Any
object DefaultEmailOptionType {
  val CONFIRM_WITH_LINK = "CONFIRM_WITH_LINK".asInstanceOf[DefaultEmailOptionType]
  val CONFIRM_WITH_CODE = "CONFIRM_WITH_CODE".asInstanceOf[DefaultEmailOptionType]

  @inline def values: js.Array[DefaultEmailOptionType] = js.Array(CONFIRM_WITH_LINK, CONFIRM_WITH_CODE)
}

@js.native
sealed trait DeliveryMediumType extends js.Any
object DeliveryMediumType {
  val SMS = "SMS".asInstanceOf[DeliveryMediumType]
  val EMAIL = "EMAIL".asInstanceOf[DeliveryMediumType]

  @inline def values: js.Array[DeliveryMediumType] = js.Array(SMS, EMAIL)
}

@js.native
sealed trait DeviceRememberedStatusType extends js.Any
object DeviceRememberedStatusType {
  val remembered = "remembered".asInstanceOf[DeviceRememberedStatusType]
  val not_remembered = "not_remembered".asInstanceOf[DeviceRememberedStatusType]

  @inline def values: js.Array[DeviceRememberedStatusType] = js.Array(remembered, not_remembered)
}

@js.native
sealed trait DomainStatusType extends js.Any
object DomainStatusType {
  val CREATING = "CREATING".asInstanceOf[DomainStatusType]
  val DELETING = "DELETING".asInstanceOf[DomainStatusType]
  val UPDATING = "UPDATING".asInstanceOf[DomainStatusType]
  val ACTIVE = "ACTIVE".asInstanceOf[DomainStatusType]
  val FAILED = "FAILED".asInstanceOf[DomainStatusType]

  @inline def values: js.Array[DomainStatusType] = js.Array(CREATING, DELETING, UPDATING, ACTIVE, FAILED)
}

@js.native
sealed trait EmailSendingAccountType extends js.Any
object EmailSendingAccountType {
  val COGNITO_DEFAULT = "COGNITO_DEFAULT".asInstanceOf[EmailSendingAccountType]
  val DEVELOPER = "DEVELOPER".asInstanceOf[EmailSendingAccountType]

  @inline def values: js.Array[EmailSendingAccountType] = js.Array(COGNITO_DEFAULT, DEVELOPER)
}

@js.native
sealed trait EventFilterType extends js.Any
object EventFilterType {
  val SIGN_IN = "SIGN_IN".asInstanceOf[EventFilterType]
  val PASSWORD_CHANGE = "PASSWORD_CHANGE".asInstanceOf[EventFilterType]
  val SIGN_UP = "SIGN_UP".asInstanceOf[EventFilterType]

  @inline def values: js.Array[EventFilterType] = js.Array(SIGN_IN, PASSWORD_CHANGE, SIGN_UP)
}

@js.native
sealed trait EventResponseType extends js.Any
object EventResponseType {
  val Success = "Success".asInstanceOf[EventResponseType]
  val Failure = "Failure".asInstanceOf[EventResponseType]

  @inline def values: js.Array[EventResponseType] = js.Array(Success, Failure)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val SignIn = "SignIn".asInstanceOf[EventType]
  val SignUp = "SignUp".asInstanceOf[EventType]
  val ForgotPassword = "ForgotPassword".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(SignIn, SignUp, ForgotPassword)
}

@js.native
sealed trait ExplicitAuthFlowsType extends js.Any
object ExplicitAuthFlowsType {
  val ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[ExplicitAuthFlowsType]
  val CUSTOM_AUTH_FLOW_ONLY = "CUSTOM_AUTH_FLOW_ONLY".asInstanceOf[ExplicitAuthFlowsType]
  val USER_PASSWORD_AUTH = "USER_PASSWORD_AUTH".asInstanceOf[ExplicitAuthFlowsType]
  val ALLOW_ADMIN_USER_PASSWORD_AUTH = "ALLOW_ADMIN_USER_PASSWORD_AUTH".asInstanceOf[ExplicitAuthFlowsType]
  val ALLOW_CUSTOM_AUTH = "ALLOW_CUSTOM_AUTH".asInstanceOf[ExplicitAuthFlowsType]
  val ALLOW_USER_PASSWORD_AUTH = "ALLOW_USER_PASSWORD_AUTH".asInstanceOf[ExplicitAuthFlowsType]
  val ALLOW_USER_SRP_AUTH = "ALLOW_USER_SRP_AUTH".asInstanceOf[ExplicitAuthFlowsType]
  val ALLOW_REFRESH_TOKEN_AUTH = "ALLOW_REFRESH_TOKEN_AUTH".asInstanceOf[ExplicitAuthFlowsType]

  @inline def values: js.Array[ExplicitAuthFlowsType] = js.Array(
    ADMIN_NO_SRP_AUTH,
    CUSTOM_AUTH_FLOW_ONLY,
    USER_PASSWORD_AUTH,
    ALLOW_ADMIN_USER_PASSWORD_AUTH,
    ALLOW_CUSTOM_AUTH,
    ALLOW_USER_PASSWORD_AUTH,
    ALLOW_USER_SRP_AUTH,
    ALLOW_REFRESH_TOKEN_AUTH
  )
}

@js.native
sealed trait FeedbackValueType extends js.Any
object FeedbackValueType {
  val Valid = "Valid".asInstanceOf[FeedbackValueType]
  val Invalid = "Invalid".asInstanceOf[FeedbackValueType]

  @inline def values: js.Array[FeedbackValueType] = js.Array(Valid, Invalid)
}

@js.native
sealed trait IdentityProviderTypeType extends js.Any
object IdentityProviderTypeType {
  val SAML = "SAML".asInstanceOf[IdentityProviderTypeType]
  val Facebook = "Facebook".asInstanceOf[IdentityProviderTypeType]
  val Google = "Google".asInstanceOf[IdentityProviderTypeType]
  val LoginWithAmazon = "LoginWithAmazon".asInstanceOf[IdentityProviderTypeType]
  val SignInWithApple = "SignInWithApple".asInstanceOf[IdentityProviderTypeType]
  val OIDC = "OIDC".asInstanceOf[IdentityProviderTypeType]

  @inline def values: js.Array[IdentityProviderTypeType] = js.Array(SAML, Facebook, Google, LoginWithAmazon, SignInWithApple, OIDC)
}

@js.native
sealed trait MessageActionType extends js.Any
object MessageActionType {
  val RESEND = "RESEND".asInstanceOf[MessageActionType]
  val SUPPRESS = "SUPPRESS".asInstanceOf[MessageActionType]

  @inline def values: js.Array[MessageActionType] = js.Array(RESEND, SUPPRESS)
}

@js.native
sealed trait OAuthFlowType extends js.Any
object OAuthFlowType {
  val code = "code".asInstanceOf[OAuthFlowType]
  val `implicit` = "implicit".asInstanceOf[OAuthFlowType]
  val client_credentials = "client_credentials".asInstanceOf[OAuthFlowType]

  @inline def values: js.Array[OAuthFlowType] = js.Array(code, `implicit`, client_credentials)
}

@js.native
sealed trait PreventUserExistenceErrorTypes extends js.Any
object PreventUserExistenceErrorTypes {
  val LEGACY = "LEGACY".asInstanceOf[PreventUserExistenceErrorTypes]
  val ENABLED = "ENABLED".asInstanceOf[PreventUserExistenceErrorTypes]

  @inline def values: js.Array[PreventUserExistenceErrorTypes] = js.Array(LEGACY, ENABLED)
}

@js.native
sealed trait RecoveryOptionNameType extends js.Any
object RecoveryOptionNameType {
  val verified_email = "verified_email".asInstanceOf[RecoveryOptionNameType]
  val verified_phone_number = "verified_phone_number".asInstanceOf[RecoveryOptionNameType]
  val admin_only = "admin_only".asInstanceOf[RecoveryOptionNameType]

  @inline def values: js.Array[RecoveryOptionNameType] = js.Array(verified_email, verified_phone_number, admin_only)
}

@js.native
sealed trait RiskDecisionType extends js.Any
object RiskDecisionType {
  val NoRisk = "NoRisk".asInstanceOf[RiskDecisionType]
  val AccountTakeover = "AccountTakeover".asInstanceOf[RiskDecisionType]
  val Block = "Block".asInstanceOf[RiskDecisionType]

  @inline def values: js.Array[RiskDecisionType] = js.Array(NoRisk, AccountTakeover, Block)
}

@js.native
sealed trait RiskLevelType extends js.Any
object RiskLevelType {
  val Low = "Low".asInstanceOf[RiskLevelType]
  val Medium = "Medium".asInstanceOf[RiskLevelType]
  val High = "High".asInstanceOf[RiskLevelType]

  @inline def values: js.Array[RiskLevelType] = js.Array(Low, Medium, High)
}

@js.native
sealed trait StatusType extends js.Any
object StatusType {
  val Enabled = "Enabled".asInstanceOf[StatusType]
  val Disabled = "Disabled".asInstanceOf[StatusType]

  @inline def values: js.Array[StatusType] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait TimeUnitsType extends js.Any
object TimeUnitsType {
  val seconds = "seconds".asInstanceOf[TimeUnitsType]
  val minutes = "minutes".asInstanceOf[TimeUnitsType]
  val hours = "hours".asInstanceOf[TimeUnitsType]
  val days = "days".asInstanceOf[TimeUnitsType]

  @inline def values: js.Array[TimeUnitsType] = js.Array(seconds, minutes, hours, days)
}

@js.native
sealed trait UserImportJobStatusType extends js.Any
object UserImportJobStatusType {
  val Created = "Created".asInstanceOf[UserImportJobStatusType]
  val Pending = "Pending".asInstanceOf[UserImportJobStatusType]
  val InProgress = "InProgress".asInstanceOf[UserImportJobStatusType]
  val Stopping = "Stopping".asInstanceOf[UserImportJobStatusType]
  val Expired = "Expired".asInstanceOf[UserImportJobStatusType]
  val Stopped = "Stopped".asInstanceOf[UserImportJobStatusType]
  val Failed = "Failed".asInstanceOf[UserImportJobStatusType]
  val Succeeded = "Succeeded".asInstanceOf[UserImportJobStatusType]

  @inline def values: js.Array[UserImportJobStatusType] = js.Array(Created, Pending, InProgress, Stopping, Expired, Stopped, Failed, Succeeded)
}

@js.native
sealed trait UserPoolMfaType extends js.Any
object UserPoolMfaType {
  val OFF = "OFF".asInstanceOf[UserPoolMfaType]
  val ON = "ON".asInstanceOf[UserPoolMfaType]
  val OPTIONAL = "OPTIONAL".asInstanceOf[UserPoolMfaType]

  @inline def values: js.Array[UserPoolMfaType] = js.Array(OFF, ON, OPTIONAL)
}

@js.native
sealed trait UserStatusType extends js.Any
object UserStatusType {
  val UNCONFIRMED = "UNCONFIRMED".asInstanceOf[UserStatusType]
  val CONFIRMED = "CONFIRMED".asInstanceOf[UserStatusType]
  val ARCHIVED = "ARCHIVED".asInstanceOf[UserStatusType]
  val COMPROMISED = "COMPROMISED".asInstanceOf[UserStatusType]
  val UNKNOWN = "UNKNOWN".asInstanceOf[UserStatusType]
  val RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[UserStatusType]
  val FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[UserStatusType]

  @inline def values: js.Array[UserStatusType] = js.Array(UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD)
}

@js.native
sealed trait UsernameAttributeType extends js.Any
object UsernameAttributeType {
  val phone_number = "phone_number".asInstanceOf[UsernameAttributeType]
  val email = "email".asInstanceOf[UsernameAttributeType]

  @inline def values: js.Array[UsernameAttributeType] = js.Array(phone_number, email)
}

@js.native
sealed trait VerifiedAttributeType extends js.Any
object VerifiedAttributeType {
  val phone_number = "phone_number".asInstanceOf[VerifiedAttributeType]
  val email = "email".asInstanceOf[VerifiedAttributeType]

  @inline def values: js.Array[VerifiedAttributeType] = js.Array(phone_number, email)
}

@js.native
sealed trait VerifySoftwareTokenResponseType extends js.Any
object VerifySoftwareTokenResponseType {
  val SUCCESS = "SUCCESS".asInstanceOf[VerifySoftwareTokenResponseType]
  val ERROR = "ERROR".asInstanceOf[VerifySoftwareTokenResponseType]

  @inline def values: js.Array[VerifySoftwareTokenResponseType] = js.Array(SUCCESS, ERROR)
}
