package facade.amazonaws.services.cognitoidentityprovider

import scalajs._

type AccountTakeoverEventActionType = "BLOCK" | "MFA_IF_CONFIGURED" | "MFA_REQUIRED" | "NO_ACTION"
object AccountTakeoverEventActionType {
  val BLOCK: "BLOCK" = "BLOCK"
  val MFA_IF_CONFIGURED: "MFA_IF_CONFIGURED" = "MFA_IF_CONFIGURED"
  val MFA_REQUIRED: "MFA_REQUIRED" = "MFA_REQUIRED"
  val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  @inline def values = js.Array[AccountTakeoverEventActionType](BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION)
}

type AdvancedSecurityModeType = "OFF" | "AUDIT" | "ENFORCED"
object AdvancedSecurityModeType {
  val OFF: "OFF" = "OFF"
  val AUDIT: "AUDIT" = "AUDIT"
  val ENFORCED: "ENFORCED" = "ENFORCED"

  @inline def values = js.Array[AdvancedSecurityModeType](OFF, AUDIT, ENFORCED)
}

type AliasAttributeType = "phone_number" | "email" | "preferred_username"
object AliasAttributeType {
  val phone_number: "phone_number" = "phone_number"
  val email: "email" = "email"
  val preferred_username: "preferred_username" = "preferred_username"

  @inline def values = js.Array[AliasAttributeType](phone_number, email, preferred_username)
}

type AttributeDataType = "String" | "Number" | "DateTime" | "Boolean"
object AttributeDataType {
  val String: "String" = "String"
  val Number: "Number" = "Number"
  val DateTime: "DateTime" = "DateTime"
  val Boolean: "Boolean" = "Boolean"

  @inline def values = js.Array[AttributeDataType](String, Number, DateTime, Boolean)
}

type AuthFlowType = "USER_SRP_AUTH" | "REFRESH_TOKEN_AUTH" | "REFRESH_TOKEN" | "CUSTOM_AUTH" | "ADMIN_NO_SRP_AUTH" | "USER_PASSWORD_AUTH" | "ADMIN_USER_PASSWORD_AUTH"
object AuthFlowType {
  val USER_SRP_AUTH: "USER_SRP_AUTH" = "USER_SRP_AUTH"
  val REFRESH_TOKEN_AUTH: "REFRESH_TOKEN_AUTH" = "REFRESH_TOKEN_AUTH"
  val REFRESH_TOKEN: "REFRESH_TOKEN" = "REFRESH_TOKEN"
  val CUSTOM_AUTH: "CUSTOM_AUTH" = "CUSTOM_AUTH"
  val ADMIN_NO_SRP_AUTH: "ADMIN_NO_SRP_AUTH" = "ADMIN_NO_SRP_AUTH"
  val USER_PASSWORD_AUTH: "USER_PASSWORD_AUTH" = "USER_PASSWORD_AUTH"
  val ADMIN_USER_PASSWORD_AUTH: "ADMIN_USER_PASSWORD_AUTH" = "ADMIN_USER_PASSWORD_AUTH"

  @inline def values = js.Array[AuthFlowType](USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN, CUSTOM_AUTH, ADMIN_NO_SRP_AUTH, USER_PASSWORD_AUTH, ADMIN_USER_PASSWORD_AUTH)
}

type ChallengeName = "Password" | "Mfa"
object ChallengeName {
  val Password: "Password" = "Password"
  val Mfa: "Mfa" = "Mfa"

  @inline def values = js.Array[ChallengeName](Password, Mfa)
}

type ChallengeNameType = "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED"
object ChallengeNameType {
  val SMS_MFA: "SMS_MFA" = "SMS_MFA"
  val SOFTWARE_TOKEN_MFA: "SOFTWARE_TOKEN_MFA" = "SOFTWARE_TOKEN_MFA"
  val SELECT_MFA_TYPE: "SELECT_MFA_TYPE" = "SELECT_MFA_TYPE"
  val MFA_SETUP: "MFA_SETUP" = "MFA_SETUP"
  val PASSWORD_VERIFIER: "PASSWORD_VERIFIER" = "PASSWORD_VERIFIER"
  val CUSTOM_CHALLENGE: "CUSTOM_CHALLENGE" = "CUSTOM_CHALLENGE"
  val DEVICE_SRP_AUTH: "DEVICE_SRP_AUTH" = "DEVICE_SRP_AUTH"
  val DEVICE_PASSWORD_VERIFIER: "DEVICE_PASSWORD_VERIFIER" = "DEVICE_PASSWORD_VERIFIER"
  val ADMIN_NO_SRP_AUTH: "ADMIN_NO_SRP_AUTH" = "ADMIN_NO_SRP_AUTH"
  val NEW_PASSWORD_REQUIRED: "NEW_PASSWORD_REQUIRED" = "NEW_PASSWORD_REQUIRED"

  @inline def values = js.Array[ChallengeNameType](
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

type ChallengeResponse = "Success" | "Failure"
object ChallengeResponse {
  val Success: "Success" = "Success"
  val Failure: "Failure" = "Failure"

  @inline def values = js.Array[ChallengeResponse](Success, Failure)
}

type CompromisedCredentialsEventActionType = "BLOCK" | "NO_ACTION"
object CompromisedCredentialsEventActionType {
  val BLOCK: "BLOCK" = "BLOCK"
  val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  @inline def values = js.Array[CompromisedCredentialsEventActionType](BLOCK, NO_ACTION)
}

type CustomEmailSenderLambdaVersionType = "V1_0"
object CustomEmailSenderLambdaVersionType {
  val V1_0: "V1_0" = "V1_0"

  @inline def values = js.Array[CustomEmailSenderLambdaVersionType](V1_0)
}

type CustomSMSSenderLambdaVersionType = "V1_0"
object CustomSMSSenderLambdaVersionType {
  val V1_0: "V1_0" = "V1_0"

  @inline def values = js.Array[CustomSMSSenderLambdaVersionType](V1_0)
}

type DefaultEmailOptionType = "CONFIRM_WITH_LINK" | "CONFIRM_WITH_CODE"
object DefaultEmailOptionType {
  val CONFIRM_WITH_LINK: "CONFIRM_WITH_LINK" = "CONFIRM_WITH_LINK"
  val CONFIRM_WITH_CODE: "CONFIRM_WITH_CODE" = "CONFIRM_WITH_CODE"

  @inline def values = js.Array[DefaultEmailOptionType](CONFIRM_WITH_LINK, CONFIRM_WITH_CODE)
}

type DeliveryMediumType = "SMS" | "EMAIL"
object DeliveryMediumType {
  val SMS: "SMS" = "SMS"
  val EMAIL: "EMAIL" = "EMAIL"

  @inline def values = js.Array[DeliveryMediumType](SMS, EMAIL)
}

type DeviceRememberedStatusType = "remembered" | "not_remembered"
object DeviceRememberedStatusType {
  val remembered: "remembered" = "remembered"
  val not_remembered: "not_remembered" = "not_remembered"

  @inline def values = js.Array[DeviceRememberedStatusType](remembered, not_remembered)
}

type DomainStatusType = "CREATING" | "DELETING" | "UPDATING" | "ACTIVE" | "FAILED"
object DomainStatusType {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[DomainStatusType](CREATING, DELETING, UPDATING, ACTIVE, FAILED)
}

type EmailSendingAccountType = "COGNITO_DEFAULT" | "DEVELOPER"
object EmailSendingAccountType {
  val COGNITO_DEFAULT: "COGNITO_DEFAULT" = "COGNITO_DEFAULT"
  val DEVELOPER: "DEVELOPER" = "DEVELOPER"

  @inline def values = js.Array[EmailSendingAccountType](COGNITO_DEFAULT, DEVELOPER)
}

type EventFilterType = "SIGN_IN" | "PASSWORD_CHANGE" | "SIGN_UP"
object EventFilterType {
  val SIGN_IN: "SIGN_IN" = "SIGN_IN"
  val PASSWORD_CHANGE: "PASSWORD_CHANGE" = "PASSWORD_CHANGE"
  val SIGN_UP: "SIGN_UP" = "SIGN_UP"

  @inline def values = js.Array[EventFilterType](SIGN_IN, PASSWORD_CHANGE, SIGN_UP)
}

type EventResponseType = "Success" | "Failure"
object EventResponseType {
  val Success: "Success" = "Success"
  val Failure: "Failure" = "Failure"

  @inline def values = js.Array[EventResponseType](Success, Failure)
}

type EventType = "SignIn" | "SignUp" | "ForgotPassword"
object EventType {
  val SignIn: "SignIn" = "SignIn"
  val SignUp: "SignUp" = "SignUp"
  val ForgotPassword: "ForgotPassword" = "ForgotPassword"

  @inline def values = js.Array[EventType](SignIn, SignUp, ForgotPassword)
}

type ExplicitAuthFlowsType = "ADMIN_NO_SRP_AUTH" | "CUSTOM_AUTH_FLOW_ONLY" | "USER_PASSWORD_AUTH" | "ALLOW_ADMIN_USER_PASSWORD_AUTH" | "ALLOW_CUSTOM_AUTH" | "ALLOW_USER_PASSWORD_AUTH" | "ALLOW_USER_SRP_AUTH" | "ALLOW_REFRESH_TOKEN_AUTH"
object ExplicitAuthFlowsType {
  val ADMIN_NO_SRP_AUTH: "ADMIN_NO_SRP_AUTH" = "ADMIN_NO_SRP_AUTH"
  val CUSTOM_AUTH_FLOW_ONLY: "CUSTOM_AUTH_FLOW_ONLY" = "CUSTOM_AUTH_FLOW_ONLY"
  val USER_PASSWORD_AUTH: "USER_PASSWORD_AUTH" = "USER_PASSWORD_AUTH"
  val ALLOW_ADMIN_USER_PASSWORD_AUTH: "ALLOW_ADMIN_USER_PASSWORD_AUTH" = "ALLOW_ADMIN_USER_PASSWORD_AUTH"
  val ALLOW_CUSTOM_AUTH: "ALLOW_CUSTOM_AUTH" = "ALLOW_CUSTOM_AUTH"
  val ALLOW_USER_PASSWORD_AUTH: "ALLOW_USER_PASSWORD_AUTH" = "ALLOW_USER_PASSWORD_AUTH"
  val ALLOW_USER_SRP_AUTH: "ALLOW_USER_SRP_AUTH" = "ALLOW_USER_SRP_AUTH"
  val ALLOW_REFRESH_TOKEN_AUTH: "ALLOW_REFRESH_TOKEN_AUTH" = "ALLOW_REFRESH_TOKEN_AUTH"

  @inline def values = js.Array[ExplicitAuthFlowsType](
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

type FeedbackValueType = "Valid" | "Invalid"
object FeedbackValueType {
  val Valid: "Valid" = "Valid"
  val Invalid: "Invalid" = "Invalid"

  @inline def values = js.Array[FeedbackValueType](Valid, Invalid)
}

type IdentityProviderTypeType = "SAML" | "Facebook" | "Google" | "LoginWithAmazon" | "SignInWithApple" | "OIDC"
object IdentityProviderTypeType {
  val SAML: "SAML" = "SAML"
  val Facebook: "Facebook" = "Facebook"
  val Google: "Google" = "Google"
  val LoginWithAmazon: "LoginWithAmazon" = "LoginWithAmazon"
  val SignInWithApple: "SignInWithApple" = "SignInWithApple"
  val OIDC: "OIDC" = "OIDC"

  @inline def values = js.Array[IdentityProviderTypeType](SAML, Facebook, Google, LoginWithAmazon, SignInWithApple, OIDC)
}

type MessageActionType = "RESEND" | "SUPPRESS"
object MessageActionType {
  val RESEND: "RESEND" = "RESEND"
  val SUPPRESS: "SUPPRESS" = "SUPPRESS"

  @inline def values = js.Array[MessageActionType](RESEND, SUPPRESS)
}

type OAuthFlowType = "code" | "implicit" | "client_credentials"
object OAuthFlowType {
  val code: "code" = "code"
  val `implicit`: "implicit" = "implicit"
  val client_credentials: "client_credentials" = "client_credentials"

  @inline def values = js.Array[OAuthFlowType](code, `implicit`, client_credentials)
}

type PreventUserExistenceErrorTypes = "LEGACY" | "ENABLED"
object PreventUserExistenceErrorTypes {
  val LEGACY: "LEGACY" = "LEGACY"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[PreventUserExistenceErrorTypes](LEGACY, ENABLED)
}

type RecoveryOptionNameType = "verified_email" | "verified_phone_number" | "admin_only"
object RecoveryOptionNameType {
  val verified_email: "verified_email" = "verified_email"
  val verified_phone_number: "verified_phone_number" = "verified_phone_number"
  val admin_only: "admin_only" = "admin_only"

  @inline def values = js.Array[RecoveryOptionNameType](verified_email, verified_phone_number, admin_only)
}

type RiskDecisionType = "NoRisk" | "AccountTakeover" | "Block"
object RiskDecisionType {
  val NoRisk: "NoRisk" = "NoRisk"
  val AccountTakeover: "AccountTakeover" = "AccountTakeover"
  val Block: "Block" = "Block"

  @inline def values = js.Array[RiskDecisionType](NoRisk, AccountTakeover, Block)
}

type RiskLevelType = "Low" | "Medium" | "High"
object RiskLevelType {
  val Low: "Low" = "Low"
  val Medium: "Medium" = "Medium"
  val High: "High" = "High"

  @inline def values = js.Array[RiskLevelType](Low, Medium, High)
}

type StatusType = "Enabled" | "Disabled"
object StatusType {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[StatusType](Enabled, Disabled)
}

type TimeUnitsType = "seconds" | "minutes" | "hours" | "days"
object TimeUnitsType {
  val seconds: "seconds" = "seconds"
  val minutes: "minutes" = "minutes"
  val hours: "hours" = "hours"
  val days: "days" = "days"

  @inline def values = js.Array[TimeUnitsType](seconds, minutes, hours, days)
}

type UserImportJobStatusType = "Created" | "Pending" | "InProgress" | "Stopping" | "Expired" | "Stopped" | "Failed" | "Succeeded"
object UserImportJobStatusType {
  val Created: "Created" = "Created"
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Stopping: "Stopping" = "Stopping"
  val Expired: "Expired" = "Expired"
  val Stopped: "Stopped" = "Stopped"
  val Failed: "Failed" = "Failed"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[UserImportJobStatusType](Created, Pending, InProgress, Stopping, Expired, Stopped, Failed, Succeeded)
}

type UserPoolMfaType = "OFF" | "ON" | "OPTIONAL"
object UserPoolMfaType {
  val OFF: "OFF" = "OFF"
  val ON: "ON" = "ON"
  val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  @inline def values = js.Array[UserPoolMfaType](OFF, ON, OPTIONAL)
}

type UserStatusType = "UNCONFIRMED" | "CONFIRMED" | "ARCHIVED" | "COMPROMISED" | "UNKNOWN" | "RESET_REQUIRED" | "FORCE_CHANGE_PASSWORD"
object UserStatusType {
  val UNCONFIRMED: "UNCONFIRMED" = "UNCONFIRMED"
  val CONFIRMED: "CONFIRMED" = "CONFIRMED"
  val ARCHIVED: "ARCHIVED" = "ARCHIVED"
  val COMPROMISED: "COMPROMISED" = "COMPROMISED"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  val RESET_REQUIRED: "RESET_REQUIRED" = "RESET_REQUIRED"
  val FORCE_CHANGE_PASSWORD: "FORCE_CHANGE_PASSWORD" = "FORCE_CHANGE_PASSWORD"

  @inline def values = js.Array[UserStatusType](UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD)
}

type UsernameAttributeType = "phone_number" | "email"
object UsernameAttributeType {
  val phone_number: "phone_number" = "phone_number"
  val email: "email" = "email"

  @inline def values = js.Array[UsernameAttributeType](phone_number, email)
}

type VerifiedAttributeType = "phone_number" | "email"
object VerifiedAttributeType {
  val phone_number: "phone_number" = "phone_number"
  val email: "email" = "email"

  @inline def values = js.Array[VerifiedAttributeType](phone_number, email)
}

type VerifySoftwareTokenResponseType = "SUCCESS" | "ERROR"
object VerifySoftwareTokenResponseType {
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[VerifySoftwareTokenResponseType](SUCCESS, ERROR)
}
