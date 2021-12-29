package facade.amazonaws.services.amplifybackend

import scalajs._

type AdditionalConstraintsElement = "REQUIRE_DIGIT" | "REQUIRE_LOWERCASE" | "REQUIRE_SYMBOL" | "REQUIRE_UPPERCASE"
object AdditionalConstraintsElement {
  val REQUIRE_DIGIT: "REQUIRE_DIGIT" = "REQUIRE_DIGIT"
  val REQUIRE_LOWERCASE: "REQUIRE_LOWERCASE" = "REQUIRE_LOWERCASE"
  val REQUIRE_SYMBOL: "REQUIRE_SYMBOL" = "REQUIRE_SYMBOL"
  val REQUIRE_UPPERCASE: "REQUIRE_UPPERCASE" = "REQUIRE_UPPERCASE"

  @inline def values = js.Array[AdditionalConstraintsElement](REQUIRE_DIGIT, REQUIRE_LOWERCASE, REQUIRE_SYMBOL, REQUIRE_UPPERCASE)
}

type AuthResources = "USER_POOL_ONLY" | "IDENTITY_POOL_AND_USER_POOL"
object AuthResources {
  val USER_POOL_ONLY: "USER_POOL_ONLY" = "USER_POOL_ONLY"
  val IDENTITY_POOL_AND_USER_POOL: "IDENTITY_POOL_AND_USER_POOL" = "IDENTITY_POOL_AND_USER_POOL"

  @inline def values = js.Array[AuthResources](USER_POOL_ONLY, IDENTITY_POOL_AND_USER_POOL)
}

type DeliveryMethod = "EMAIL" | "SMS"
object DeliveryMethod {
  val EMAIL: "EMAIL" = "EMAIL"
  val SMS: "SMS" = "SMS"

  @inline def values = js.Array[DeliveryMethod](EMAIL, SMS)
}

type MFAMode = "ON" | "OFF" | "OPTIONAL"
object MFAMode {
  val ON: "ON" = "ON"
  val OFF: "OFF" = "OFF"
  val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  @inline def values = js.Array[MFAMode](ON, OFF, OPTIONAL)
}

type MfaTypesElement = "SMS" | "TOTP"
object MfaTypesElement {
  val SMS: "SMS" = "SMS"
  val TOTP: "TOTP" = "TOTP"

  @inline def values = js.Array[MfaTypesElement](SMS, TOTP)
}

type Mode = "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT"
object Mode {
  val API_KEY: "API_KEY" = "API_KEY"
  val AWS_IAM: "AWS_IAM" = "AWS_IAM"
  val AMAZON_COGNITO_USER_POOLS: "AMAZON_COGNITO_USER_POOLS" = "AMAZON_COGNITO_USER_POOLS"
  val OPENID_CONNECT: "OPENID_CONNECT" = "OPENID_CONNECT"

  @inline def values = js.Array[Mode](API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
}

type OAuthGrantType = "CODE" | "IMPLICIT"
object OAuthGrantType {
  val CODE: "CODE" = "CODE"
  val IMPLICIT: "IMPLICIT" = "IMPLICIT"

  @inline def values = js.Array[OAuthGrantType](CODE, IMPLICIT)
}

type OAuthScopesElement = "PHONE" | "EMAIL" | "OPENID" | "PROFILE" | "AWS_COGNITO_SIGNIN_USER_ADMIN"
object OAuthScopesElement {
  val PHONE: "PHONE" = "PHONE"
  val EMAIL: "EMAIL" = "EMAIL"
  val OPENID: "OPENID" = "OPENID"
  val PROFILE: "PROFILE" = "PROFILE"
  val AWS_COGNITO_SIGNIN_USER_ADMIN: "AWS_COGNITO_SIGNIN_USER_ADMIN" = "AWS_COGNITO_SIGNIN_USER_ADMIN"

  @inline def values = js.Array[OAuthScopesElement](PHONE, EMAIL, OPENID, PROFILE, AWS_COGNITO_SIGNIN_USER_ADMIN)
}

type RequiredSignUpAttributesElement = "ADDRESS" | "BIRTHDATE" | "EMAIL" | "FAMILY_NAME" | "GENDER" | "GIVEN_NAME" | "LOCALE" | "MIDDLE_NAME" | "NAME" | "NICKNAME" | "PHONE_NUMBER" | "PICTURE" | "PREFERRED_USERNAME" | "PROFILE" | "UPDATED_AT" | "WEBSITE" | "ZONE_INFO"
object RequiredSignUpAttributesElement {
  val ADDRESS: "ADDRESS" = "ADDRESS"
  val BIRTHDATE: "BIRTHDATE" = "BIRTHDATE"
  val EMAIL: "EMAIL" = "EMAIL"
  val FAMILY_NAME: "FAMILY_NAME" = "FAMILY_NAME"
  val GENDER: "GENDER" = "GENDER"
  val GIVEN_NAME: "GIVEN_NAME" = "GIVEN_NAME"
  val LOCALE: "LOCALE" = "LOCALE"
  val MIDDLE_NAME: "MIDDLE_NAME" = "MIDDLE_NAME"
  val NAME: "NAME" = "NAME"
  val NICKNAME: "NICKNAME" = "NICKNAME"
  val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"
  val PICTURE: "PICTURE" = "PICTURE"
  val PREFERRED_USERNAME: "PREFERRED_USERNAME" = "PREFERRED_USERNAME"
  val PROFILE: "PROFILE" = "PROFILE"
  val UPDATED_AT: "UPDATED_AT" = "UPDATED_AT"
  val WEBSITE: "WEBSITE" = "WEBSITE"
  val ZONE_INFO: "ZONE_INFO" = "ZONE_INFO"

  @inline def values = js.Array[RequiredSignUpAttributesElement](
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
  val OPTIMISTIC_CONCURRENCY: "OPTIMISTIC_CONCURRENCY" = "OPTIMISTIC_CONCURRENCY"
  val LAMBDA: "LAMBDA" = "LAMBDA"
  val AUTOMERGE: "AUTOMERGE" = "AUTOMERGE"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ResolutionStrategy](OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
}

type Service = "COGNITO"
object Service {
  val COGNITO: "COGNITO" = "COGNITO"

  @inline def values = js.Array[Service](COGNITO)
}

type SignInMethod = "EMAIL" | "EMAIL_AND_PHONE_NUMBER" | "PHONE_NUMBER" | "USERNAME"
object SignInMethod {
  val EMAIL: "EMAIL" = "EMAIL"
  val EMAIL_AND_PHONE_NUMBER: "EMAIL_AND_PHONE_NUMBER" = "EMAIL_AND_PHONE_NUMBER"
  val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"
  val USERNAME: "USERNAME" = "USERNAME"

  @inline def values = js.Array[SignInMethod](EMAIL, EMAIL_AND_PHONE_NUMBER, PHONE_NUMBER, USERNAME)
}

type Status = "LATEST" | "STALE"
object Status {
  val LATEST: "LATEST" = "LATEST"
  val STALE: "STALE" = "STALE"

  @inline def values = js.Array[Status](LATEST, STALE)
}
