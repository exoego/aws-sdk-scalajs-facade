package facade.amazonaws.services.cognitoidentityprovider

import scalajs.js

type AccountTakeoverEventActionType = "BLOCK" | "MFA_IF_CONFIGURED" | "MFA_REQUIRED" | "NO_ACTION"
object AccountTakeoverEventActionType {
  inline val BLOCK: "BLOCK" = "BLOCK"
  inline val MFA_IF_CONFIGURED: "MFA_IF_CONFIGURED" = "MFA_IF_CONFIGURED"
  inline val MFA_REQUIRED: "MFA_REQUIRED" = "MFA_REQUIRED"
  inline val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  inline def values: js.Array[AccountTakeoverEventActionType] = js.Array(BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION)
}

type AdvancedSecurityModeType = "OFF" | "AUDIT" | "ENFORCED"
object AdvancedSecurityModeType {
  inline val OFF: "OFF" = "OFF"
  inline val AUDIT: "AUDIT" = "AUDIT"
  inline val ENFORCED: "ENFORCED" = "ENFORCED"

  inline def values: js.Array[AdvancedSecurityModeType] = js.Array(OFF, AUDIT, ENFORCED)
}

type AliasAttributeType = "phone_number" | "email" | "preferred_username"
object AliasAttributeType {
  inline val phone_number: "phone_number" = "phone_number"
  inline val email: "email" = "email"
  inline val preferred_username: "preferred_username" = "preferred_username"

  inline def values: js.Array[AliasAttributeType] = js.Array(phone_number, email, preferred_username)
}

type AttributeDataType = "String" | "Number" | "DateTime" | "Boolean"
object AttributeDataType {
  inline val String: "String" = "String"
  inline val Number: "Number" = "Number"
  inline val DateTime: "DateTime" = "DateTime"
  inline val Boolean: "Boolean" = "Boolean"

  inline def values: js.Array[AttributeDataType] = js.Array(String, Number, DateTime, Boolean)
}

type AuthFlowType = "USER_SRP_AUTH" | "REFRESH_TOKEN_AUTH" | "REFRESH_TOKEN" | "CUSTOM_AUTH" | "ADMIN_NO_SRP_AUTH" | "USER_PASSWORD_AUTH" | "ADMIN_USER_PASSWORD_AUTH"
object AuthFlowType {
  inline val USER_SRP_AUTH: "USER_SRP_AUTH" = "USER_SRP_AUTH"
  inline val REFRESH_TOKEN_AUTH: "REFRESH_TOKEN_AUTH" = "REFRESH_TOKEN_AUTH"
  inline val REFRESH_TOKEN: "REFRESH_TOKEN" = "REFRESH_TOKEN"
  inline val CUSTOM_AUTH: "CUSTOM_AUTH" = "CUSTOM_AUTH"
  inline val ADMIN_NO_SRP_AUTH: "ADMIN_NO_SRP_AUTH" = "ADMIN_NO_SRP_AUTH"
  inline val USER_PASSWORD_AUTH: "USER_PASSWORD_AUTH" = "USER_PASSWORD_AUTH"
  inline val ADMIN_USER_PASSWORD_AUTH: "ADMIN_USER_PASSWORD_AUTH" = "ADMIN_USER_PASSWORD_AUTH"

  inline def values: js.Array[AuthFlowType] = js.Array(USER_SRP_AUTH, REFRESH_TOKEN_AUTH, REFRESH_TOKEN, CUSTOM_AUTH, ADMIN_NO_SRP_AUTH, USER_PASSWORD_AUTH, ADMIN_USER_PASSWORD_AUTH)
}

type ChallengeName = "Password" | "Mfa"
object ChallengeName {
  inline val Password: "Password" = "Password"
  inline val Mfa: "Mfa" = "Mfa"

  inline def values: js.Array[ChallengeName] = js.Array(Password, Mfa)
}

type ChallengeNameType = "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED"
object ChallengeNameType {
  inline val SMS_MFA: "SMS_MFA" = "SMS_MFA"
  inline val SOFTWARE_TOKEN_MFA: "SOFTWARE_TOKEN_MFA" = "SOFTWARE_TOKEN_MFA"
  inline val SELECT_MFA_TYPE: "SELECT_MFA_TYPE" = "SELECT_MFA_TYPE"
  inline val MFA_SETUP: "MFA_SETUP" = "MFA_SETUP"
  inline val PASSWORD_VERIFIER: "PASSWORD_VERIFIER" = "PASSWORD_VERIFIER"
  inline val CUSTOM_CHALLENGE: "CUSTOM_CHALLENGE" = "CUSTOM_CHALLENGE"
  inline val DEVICE_SRP_AUTH: "DEVICE_SRP_AUTH" = "DEVICE_SRP_AUTH"
  inline val DEVICE_PASSWORD_VERIFIER: "DEVICE_PASSWORD_VERIFIER" = "DEVICE_PASSWORD_VERIFIER"
  inline val ADMIN_NO_SRP_AUTH: "ADMIN_NO_SRP_AUTH" = "ADMIN_NO_SRP_AUTH"
  inline val NEW_PASSWORD_REQUIRED: "NEW_PASSWORD_REQUIRED" = "NEW_PASSWORD_REQUIRED"

  inline def values: js.Array[ChallengeNameType] = js.Array(
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
  inline val Success: "Success" = "Success"
  inline val Failure: "Failure" = "Failure"

  inline def values: js.Array[ChallengeResponse] = js.Array(Success, Failure)
}

type CompromisedCredentialsEventActionType = "BLOCK" | "NO_ACTION"
object CompromisedCredentialsEventActionType {
  inline val BLOCK: "BLOCK" = "BLOCK"
  inline val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  inline def values: js.Array[CompromisedCredentialsEventActionType] = js.Array(BLOCK, NO_ACTION)
}

type CustomEmailSenderLambdaVersionType = "V1_0"
object CustomEmailSenderLambdaVersionType {
  inline val V1_0: "V1_0" = "V1_0"

  inline def values: js.Array[CustomEmailSenderLambdaVersionType] = js.Array(V1_0)
}

type CustomSMSSenderLambdaVersionType = "V1_0"
object CustomSMSSenderLambdaVersionType {
  inline val V1_0: "V1_0" = "V1_0"

  inline def values: js.Array[CustomSMSSenderLambdaVersionType] = js.Array(V1_0)
}

type DefaultEmailOptionType = "CONFIRM_WITH_LINK" | "CONFIRM_WITH_CODE"
object DefaultEmailOptionType {
  inline val CONFIRM_WITH_LINK: "CONFIRM_WITH_LINK" = "CONFIRM_WITH_LINK"
  inline val CONFIRM_WITH_CODE: "CONFIRM_WITH_CODE" = "CONFIRM_WITH_CODE"

  inline def values: js.Array[DefaultEmailOptionType] = js.Array(CONFIRM_WITH_LINK, CONFIRM_WITH_CODE)
}

type DeliveryMediumType = "SMS" | "EMAIL"
object DeliveryMediumType {
  inline val SMS: "SMS" = "SMS"
  inline val EMAIL: "EMAIL" = "EMAIL"

  inline def values: js.Array[DeliveryMediumType] = js.Array(SMS, EMAIL)
}

type DeviceRememberedStatusType = "remembered" | "not_remembered"
object DeviceRememberedStatusType {
  inline val remembered: "remembered" = "remembered"
  inline val not_remembered: "not_remembered" = "not_remembered"

  inline def values: js.Array[DeviceRememberedStatusType] = js.Array(remembered, not_remembered)
}

type DomainStatusType = "CREATING" | "DELETING" | "UPDATING" | "ACTIVE" | "FAILED"
object DomainStatusType {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DomainStatusType] = js.Array(CREATING, DELETING, UPDATING, ACTIVE, FAILED)
}

type EmailSendingAccountType = "COGNITO_DEFAULT" | "DEVELOPER"
object EmailSendingAccountType {
  inline val COGNITO_DEFAULT: "COGNITO_DEFAULT" = "COGNITO_DEFAULT"
  inline val DEVELOPER: "DEVELOPER" = "DEVELOPER"

  inline def values: js.Array[EmailSendingAccountType] = js.Array(COGNITO_DEFAULT, DEVELOPER)
}

type EventFilterType = "SIGN_IN" | "PASSWORD_CHANGE" | "SIGN_UP"
object EventFilterType {
  inline val SIGN_IN: "SIGN_IN" = "SIGN_IN"
  inline val PASSWORD_CHANGE: "PASSWORD_CHANGE" = "PASSWORD_CHANGE"
  inline val SIGN_UP: "SIGN_UP" = "SIGN_UP"

  inline def values: js.Array[EventFilterType] = js.Array(SIGN_IN, PASSWORD_CHANGE, SIGN_UP)
}

type EventResponseType = "Success" | "Failure"
object EventResponseType {
  inline val Success: "Success" = "Success"
  inline val Failure: "Failure" = "Failure"

  inline def values: js.Array[EventResponseType] = js.Array(Success, Failure)
}

type EventType = "SignIn" | "SignUp" | "ForgotPassword"
object EventType {
  inline val SignIn: "SignIn" = "SignIn"
  inline val SignUp: "SignUp" = "SignUp"
  inline val ForgotPassword: "ForgotPassword" = "ForgotPassword"

  inline def values: js.Array[EventType] = js.Array(SignIn, SignUp, ForgotPassword)
}

type ExplicitAuthFlowsType = "ADMIN_NO_SRP_AUTH" | "CUSTOM_AUTH_FLOW_ONLY" | "USER_PASSWORD_AUTH" | "ALLOW_ADMIN_USER_PASSWORD_AUTH" | "ALLOW_CUSTOM_AUTH" | "ALLOW_USER_PASSWORD_AUTH" | "ALLOW_USER_SRP_AUTH" | "ALLOW_REFRESH_TOKEN_AUTH"
object ExplicitAuthFlowsType {
  inline val ADMIN_NO_SRP_AUTH: "ADMIN_NO_SRP_AUTH" = "ADMIN_NO_SRP_AUTH"
  inline val CUSTOM_AUTH_FLOW_ONLY: "CUSTOM_AUTH_FLOW_ONLY" = "CUSTOM_AUTH_FLOW_ONLY"
  inline val USER_PASSWORD_AUTH: "USER_PASSWORD_AUTH" = "USER_PASSWORD_AUTH"
  inline val ALLOW_ADMIN_USER_PASSWORD_AUTH: "ALLOW_ADMIN_USER_PASSWORD_AUTH" = "ALLOW_ADMIN_USER_PASSWORD_AUTH"
  inline val ALLOW_CUSTOM_AUTH: "ALLOW_CUSTOM_AUTH" = "ALLOW_CUSTOM_AUTH"
  inline val ALLOW_USER_PASSWORD_AUTH: "ALLOW_USER_PASSWORD_AUTH" = "ALLOW_USER_PASSWORD_AUTH"
  inline val ALLOW_USER_SRP_AUTH: "ALLOW_USER_SRP_AUTH" = "ALLOW_USER_SRP_AUTH"
  inline val ALLOW_REFRESH_TOKEN_AUTH: "ALLOW_REFRESH_TOKEN_AUTH" = "ALLOW_REFRESH_TOKEN_AUTH"

  inline def values: js.Array[ExplicitAuthFlowsType] = js.Array(
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
  inline val Valid: "Valid" = "Valid"
  inline val Invalid: "Invalid" = "Invalid"

  inline def values: js.Array[FeedbackValueType] = js.Array(Valid, Invalid)
}

type IdentityProviderTypeType = "SAML" | "Facebook" | "Google" | "LoginWithAmazon" | "SignInWithApple" | "OIDC"
object IdentityProviderTypeType {
  inline val SAML: "SAML" = "SAML"
  inline val Facebook: "Facebook" = "Facebook"
  inline val Google: "Google" = "Google"
  inline val LoginWithAmazon: "LoginWithAmazon" = "LoginWithAmazon"
  inline val SignInWithApple: "SignInWithApple" = "SignInWithApple"
  inline val OIDC: "OIDC" = "OIDC"

  inline def values: js.Array[IdentityProviderTypeType] = js.Array(SAML, Facebook, Google, LoginWithAmazon, SignInWithApple, OIDC)
}

type MessageActionType = "RESEND" | "SUPPRESS"
object MessageActionType {
  inline val RESEND: "RESEND" = "RESEND"
  inline val SUPPRESS: "SUPPRESS" = "SUPPRESS"

  inline def values: js.Array[MessageActionType] = js.Array(RESEND, SUPPRESS)
}

type OAuthFlowType = "code" | "implicit" | "client_credentials"
object OAuthFlowType {
  inline val code: "code" = "code"
  inline val `implicit`: "implicit" = "implicit"
  inline val client_credentials: "client_credentials" = "client_credentials"

  inline def values: js.Array[OAuthFlowType] = js.Array(code, `implicit`, client_credentials)
}

type PreventUserExistenceErrorTypes = "LEGACY" | "ENABLED"
object PreventUserExistenceErrorTypes {
  inline val LEGACY: "LEGACY" = "LEGACY"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[PreventUserExistenceErrorTypes] = js.Array(LEGACY, ENABLED)
}

type RecoveryOptionNameType = "verified_email" | "verified_phone_number" | "admin_only"
object RecoveryOptionNameType {
  inline val verified_email: "verified_email" = "verified_email"
  inline val verified_phone_number: "verified_phone_number" = "verified_phone_number"
  inline val admin_only: "admin_only" = "admin_only"

  inline def values: js.Array[RecoveryOptionNameType] = js.Array(verified_email, verified_phone_number, admin_only)
}

type RiskDecisionType = "NoRisk" | "AccountTakeover" | "Block"
object RiskDecisionType {
  inline val NoRisk: "NoRisk" = "NoRisk"
  inline val AccountTakeover: "AccountTakeover" = "AccountTakeover"
  inline val Block: "Block" = "Block"

  inline def values: js.Array[RiskDecisionType] = js.Array(NoRisk, AccountTakeover, Block)
}

type RiskLevelType = "Low" | "Medium" | "High"
object RiskLevelType {
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"

  inline def values: js.Array[RiskLevelType] = js.Array(Low, Medium, High)
}

type StatusType = "Enabled" | "Disabled"
object StatusType {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[StatusType] = js.Array(Enabled, Disabled)
}

type TimeUnitsType = "seconds" | "minutes" | "hours" | "days"
object TimeUnitsType {
  inline val seconds: "seconds" = "seconds"
  inline val minutes: "minutes" = "minutes"
  inline val hours: "hours" = "hours"
  inline val days: "days" = "days"

  inline def values: js.Array[TimeUnitsType] = js.Array(seconds, minutes, hours, days)
}

type UserImportJobStatusType = "Created" | "Pending" | "InProgress" | "Stopping" | "Expired" | "Stopped" | "Failed" | "Succeeded"
object UserImportJobStatusType {
  inline val Created: "Created" = "Created"
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Expired: "Expired" = "Expired"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[UserImportJobStatusType] = js.Array(Created, Pending, InProgress, Stopping, Expired, Stopped, Failed, Succeeded)
}

type UserPoolMfaType = "OFF" | "ON" | "OPTIONAL"
object UserPoolMfaType {
  inline val OFF: "OFF" = "OFF"
  inline val ON: "ON" = "ON"
  inline val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  inline def values: js.Array[UserPoolMfaType] = js.Array(OFF, ON, OPTIONAL)
}

type UserStatusType = "UNCONFIRMED" | "CONFIRMED" | "ARCHIVED" | "COMPROMISED" | "UNKNOWN" | "RESET_REQUIRED" | "FORCE_CHANGE_PASSWORD"
object UserStatusType {
  inline val UNCONFIRMED: "UNCONFIRMED" = "UNCONFIRMED"
  inline val CONFIRMED: "CONFIRMED" = "CONFIRMED"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"
  inline val COMPROMISED: "COMPROMISED" = "COMPROMISED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val RESET_REQUIRED: "RESET_REQUIRED" = "RESET_REQUIRED"
  inline val FORCE_CHANGE_PASSWORD: "FORCE_CHANGE_PASSWORD" = "FORCE_CHANGE_PASSWORD"

  inline def values: js.Array[UserStatusType] = js.Array(UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD)
}

type UsernameAttributeType = "phone_number" | "email"
object UsernameAttributeType {
  inline val phone_number: "phone_number" = "phone_number"
  inline val email: "email" = "email"

  inline def values: js.Array[UsernameAttributeType] = js.Array(phone_number, email)
}

type VerifiedAttributeType = "phone_number" | "email"
object VerifiedAttributeType {
  inline val phone_number: "phone_number" = "phone_number"
  inline val email: "email" = "email"

  inline def values: js.Array[VerifiedAttributeType] = js.Array(phone_number, email)
}

type VerifySoftwareTokenResponseType = "SUCCESS" | "ERROR"
object VerifySoftwareTokenResponseType {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[VerifySoftwareTokenResponseType] = js.Array(SUCCESS, ERROR)
}
