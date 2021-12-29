package facade.amazonaws.services.amplifybackend

import scalajs._

type AdditionalConstraintsElement = "REQUIRE_DIGIT" | "REQUIRE_LOWERCASE" | "REQUIRE_SYMBOL" | "REQUIRE_UPPERCASE"
object AdditionalConstraintsElement {
  inline val REQUIRE_DIGIT: "REQUIRE_DIGIT" = "REQUIRE_DIGIT"
  inline val REQUIRE_LOWERCASE: "REQUIRE_LOWERCASE" = "REQUIRE_LOWERCASE"
  inline val REQUIRE_SYMBOL: "REQUIRE_SYMBOL" = "REQUIRE_SYMBOL"
  inline val REQUIRE_UPPERCASE: "REQUIRE_UPPERCASE" = "REQUIRE_UPPERCASE"

  inline def values: js.Array[AdditionalConstraintsElement] = js.Array(REQUIRE_DIGIT, REQUIRE_LOWERCASE, REQUIRE_SYMBOL, REQUIRE_UPPERCASE)
}

type AuthResources = "USER_POOL_ONLY" | "IDENTITY_POOL_AND_USER_POOL"
object AuthResources {
  inline val USER_POOL_ONLY: "USER_POOL_ONLY" = "USER_POOL_ONLY"
  inline val IDENTITY_POOL_AND_USER_POOL: "IDENTITY_POOL_AND_USER_POOL" = "IDENTITY_POOL_AND_USER_POOL"

  inline def values: js.Array[AuthResources] = js.Array(USER_POOL_ONLY, IDENTITY_POOL_AND_USER_POOL)
}

type DeliveryMethod = "EMAIL" | "SMS"
object DeliveryMethod {
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val SMS: "SMS" = "SMS"

  inline def values: js.Array[DeliveryMethod] = js.Array(EMAIL, SMS)
}

type MFAMode = "ON" | "OFF" | "OPTIONAL"
object MFAMode {
  inline val ON: "ON" = "ON"
  inline val OFF: "OFF" = "OFF"
  inline val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  inline def values: js.Array[MFAMode] = js.Array(ON, OFF, OPTIONAL)
}

type MfaTypesElement = "SMS" | "TOTP"
object MfaTypesElement {
  inline val SMS: "SMS" = "SMS"
  inline val TOTP: "TOTP" = "TOTP"

  inline def values: js.Array[MfaTypesElement] = js.Array(SMS, TOTP)
}

type Mode = "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT"
object Mode {
  inline val API_KEY: "API_KEY" = "API_KEY"
  inline val AWS_IAM: "AWS_IAM" = "AWS_IAM"
  inline val AMAZON_COGNITO_USER_POOLS: "AMAZON_COGNITO_USER_POOLS" = "AMAZON_COGNITO_USER_POOLS"
  inline val OPENID_CONNECT: "OPENID_CONNECT" = "OPENID_CONNECT"

  inline def values: js.Array[Mode] = js.Array(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
}

type OAuthGrantType = "CODE" | "IMPLICIT"
object OAuthGrantType {
  inline val CODE: "CODE" = "CODE"
  inline val IMPLICIT: "IMPLICIT" = "IMPLICIT"

  inline def values: js.Array[OAuthGrantType] = js.Array(CODE, IMPLICIT)
}

type OAuthScopesElement = "PHONE" | "EMAIL" | "OPENID" | "PROFILE" | "AWS_COGNITO_SIGNIN_USER_ADMIN"
object OAuthScopesElement {
  inline val PHONE: "PHONE" = "PHONE"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val OPENID: "OPENID" = "OPENID"
  inline val PROFILE: "PROFILE" = "PROFILE"
  inline val AWS_COGNITO_SIGNIN_USER_ADMIN: "AWS_COGNITO_SIGNIN_USER_ADMIN" = "AWS_COGNITO_SIGNIN_USER_ADMIN"

  inline def values: js.Array[OAuthScopesElement] = js.Array(PHONE, EMAIL, OPENID, PROFILE, AWS_COGNITO_SIGNIN_USER_ADMIN)
}

type RequiredSignUpAttributesElement = "ADDRESS" | "BIRTHDATE" | "EMAIL" | "FAMILY_NAME" | "GENDER" | "GIVEN_NAME" | "LOCALE" | "MIDDLE_NAME" | "NAME" | "NICKNAME" | "PHONE_NUMBER" | "PICTURE" | "PREFERRED_USERNAME" | "PROFILE" | "UPDATED_AT" | "WEBSITE" | "ZONE_INFO"
object RequiredSignUpAttributesElement {
  inline val ADDRESS: "ADDRESS" = "ADDRESS"
  inline val BIRTHDATE: "BIRTHDATE" = "BIRTHDATE"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val FAMILY_NAME: "FAMILY_NAME" = "FAMILY_NAME"
  inline val GENDER: "GENDER" = "GENDER"
  inline val GIVEN_NAME: "GIVEN_NAME" = "GIVEN_NAME"
  inline val LOCALE: "LOCALE" = "LOCALE"
  inline val MIDDLE_NAME: "MIDDLE_NAME" = "MIDDLE_NAME"
  inline val NAME: "NAME" = "NAME"
  inline val NICKNAME: "NICKNAME" = "NICKNAME"
  inline val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"
  inline val PICTURE: "PICTURE" = "PICTURE"
  inline val PREFERRED_USERNAME: "PREFERRED_USERNAME" = "PREFERRED_USERNAME"
  inline val PROFILE: "PROFILE" = "PROFILE"
  inline val UPDATED_AT: "UPDATED_AT" = "UPDATED_AT"
  inline val WEBSITE: "WEBSITE" = "WEBSITE"
  inline val ZONE_INFO: "ZONE_INFO" = "ZONE_INFO"

  inline def values: js.Array[RequiredSignUpAttributesElement] = js.Array(
    ADDRESS,
    BIRTHDATE,
    EMAIL,
    FAMILY_NAME,
    GENDER,
    GIVEN_NAME,
    LOCALE,
    MIDDLE_NAME,
    NAME,
    NICKNAME,
    PHONE_NUMBER,
    PICTURE,
    PREFERRED_USERNAME,
    PROFILE,
    UPDATED_AT,
    WEBSITE,
    ZONE_INFO
  )
}

type ResolutionStrategy = "OPTIMISTIC_CONCURRENCY" | "LAMBDA" | "AUTOMERGE" | "NONE"
object ResolutionStrategy {
  inline val OPTIMISTIC_CONCURRENCY: "OPTIMISTIC_CONCURRENCY" = "OPTIMISTIC_CONCURRENCY"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val AUTOMERGE: "AUTOMERGE" = "AUTOMERGE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ResolutionStrategy] = js.Array(OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
}

type Service = "COGNITO"
object Service {
  inline val COGNITO: "COGNITO" = "COGNITO"

  inline def values: js.Array[Service] = js.Array(COGNITO)
}

type SignInMethod = "EMAIL" | "EMAIL_AND_PHONE_NUMBER" | "PHONE_NUMBER" | "USERNAME"
object SignInMethod {
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val EMAIL_AND_PHONE_NUMBER: "EMAIL_AND_PHONE_NUMBER" = "EMAIL_AND_PHONE_NUMBER"
  inline val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"
  inline val USERNAME: "USERNAME" = "USERNAME"

  inline def values: js.Array[SignInMethod] = js.Array(EMAIL, EMAIL_AND_PHONE_NUMBER, PHONE_NUMBER, USERNAME)
}

type Status = "LATEST" | "STALE"
object Status {
  inline val LATEST: "LATEST" = "LATEST"
  inline val STALE: "STALE" = "STALE"

  inline def values: js.Array[Status] = js.Array(LATEST, STALE)
}
