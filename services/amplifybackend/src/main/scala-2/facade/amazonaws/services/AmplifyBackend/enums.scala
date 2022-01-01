package facade.amazonaws.services.amplifybackend

import scalajs.js

@js.native
sealed trait AdditionalConstraintsElement extends js.Any
object AdditionalConstraintsElement {
  val REQUIRE_DIGIT = "REQUIRE_DIGIT".asInstanceOf[AdditionalConstraintsElement]
  val REQUIRE_LOWERCASE = "REQUIRE_LOWERCASE".asInstanceOf[AdditionalConstraintsElement]
  val REQUIRE_SYMBOL = "REQUIRE_SYMBOL".asInstanceOf[AdditionalConstraintsElement]
  val REQUIRE_UPPERCASE = "REQUIRE_UPPERCASE".asInstanceOf[AdditionalConstraintsElement]

  @inline def values: js.Array[AdditionalConstraintsElement] = js.Array(REQUIRE_DIGIT, REQUIRE_LOWERCASE, REQUIRE_SYMBOL, REQUIRE_UPPERCASE)
}

@js.native
sealed trait AuthResources extends js.Any
object AuthResources {
  val USER_POOL_ONLY = "USER_POOL_ONLY".asInstanceOf[AuthResources]
  val IDENTITY_POOL_AND_USER_POOL = "IDENTITY_POOL_AND_USER_POOL".asInstanceOf[AuthResources]

  @inline def values: js.Array[AuthResources] = js.Array(USER_POOL_ONLY, IDENTITY_POOL_AND_USER_POOL)
}

@js.native
sealed trait AuthenticatedElement extends js.Any
object AuthenticatedElement {
  val READ = "READ".asInstanceOf[AuthenticatedElement]
  val CREATE_AND_UPDATE = "CREATE_AND_UPDATE".asInstanceOf[AuthenticatedElement]
  val DELETE = "DELETE".asInstanceOf[AuthenticatedElement]

  @inline def values: js.Array[AuthenticatedElement] = js.Array(READ, CREATE_AND_UPDATE, DELETE)
}

@js.native
sealed trait DeliveryMethod extends js.Any
object DeliveryMethod {
  val EMAIL = "EMAIL".asInstanceOf[DeliveryMethod]
  val SMS = "SMS".asInstanceOf[DeliveryMethod]

  @inline def values: js.Array[DeliveryMethod] = js.Array(EMAIL, SMS)
}

@js.native
sealed trait MFAMode extends js.Any
object MFAMode {
  val ON = "ON".asInstanceOf[MFAMode]
  val OFF = "OFF".asInstanceOf[MFAMode]
  val OPTIONAL = "OPTIONAL".asInstanceOf[MFAMode]

  @inline def values: js.Array[MFAMode] = js.Array(ON, OFF, OPTIONAL)
}

@js.native
sealed trait MfaTypesElement extends js.Any
object MfaTypesElement {
  val SMS = "SMS".asInstanceOf[MfaTypesElement]
  val TOTP = "TOTP".asInstanceOf[MfaTypesElement]

  @inline def values: js.Array[MfaTypesElement] = js.Array(SMS, TOTP)
}

@js.native
sealed trait Mode extends js.Any
object Mode {
  val API_KEY = "API_KEY".asInstanceOf[Mode]
  val AWS_IAM = "AWS_IAM".asInstanceOf[Mode]
  val AMAZON_COGNITO_USER_POOLS = "AMAZON_COGNITO_USER_POOLS".asInstanceOf[Mode]
  val OPENID_CONNECT = "OPENID_CONNECT".asInstanceOf[Mode]

  @inline def values: js.Array[Mode] = js.Array(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
}

@js.native
sealed trait OAuthGrantType extends js.Any
object OAuthGrantType {
  val CODE = "CODE".asInstanceOf[OAuthGrantType]
  val IMPLICIT = "IMPLICIT".asInstanceOf[OAuthGrantType]

  @inline def values: js.Array[OAuthGrantType] = js.Array(CODE, IMPLICIT)
}

@js.native
sealed trait OAuthScopesElement extends js.Any
object OAuthScopesElement {
  val PHONE = "PHONE".asInstanceOf[OAuthScopesElement]
  val EMAIL = "EMAIL".asInstanceOf[OAuthScopesElement]
  val OPENID = "OPENID".asInstanceOf[OAuthScopesElement]
  val PROFILE = "PROFILE".asInstanceOf[OAuthScopesElement]
  val AWS_COGNITO_SIGNIN_USER_ADMIN = "AWS_COGNITO_SIGNIN_USER_ADMIN".asInstanceOf[OAuthScopesElement]

  @inline def values: js.Array[OAuthScopesElement] = js.Array(PHONE, EMAIL, OPENID, PROFILE, AWS_COGNITO_SIGNIN_USER_ADMIN)
}

@js.native
sealed trait RequiredSignUpAttributesElement extends js.Any
object RequiredSignUpAttributesElement {
  val ADDRESS = "ADDRESS".asInstanceOf[RequiredSignUpAttributesElement]
  val BIRTHDATE = "BIRTHDATE".asInstanceOf[RequiredSignUpAttributesElement]
  val EMAIL = "EMAIL".asInstanceOf[RequiredSignUpAttributesElement]
  val FAMILY_NAME = "FAMILY_NAME".asInstanceOf[RequiredSignUpAttributesElement]
  val GENDER = "GENDER".asInstanceOf[RequiredSignUpAttributesElement]
  val GIVEN_NAME = "GIVEN_NAME".asInstanceOf[RequiredSignUpAttributesElement]
  val LOCALE = "LOCALE".asInstanceOf[RequiredSignUpAttributesElement]
  val MIDDLE_NAME = "MIDDLE_NAME".asInstanceOf[RequiredSignUpAttributesElement]
  val NAME = "NAME".asInstanceOf[RequiredSignUpAttributesElement]
  val NICKNAME = "NICKNAME".asInstanceOf[RequiredSignUpAttributesElement]
  val PHONE_NUMBER = "PHONE_NUMBER".asInstanceOf[RequiredSignUpAttributesElement]
  val PICTURE = "PICTURE".asInstanceOf[RequiredSignUpAttributesElement]
  val PREFERRED_USERNAME = "PREFERRED_USERNAME".asInstanceOf[RequiredSignUpAttributesElement]
  val PROFILE = "PROFILE".asInstanceOf[RequiredSignUpAttributesElement]
  val UPDATED_AT = "UPDATED_AT".asInstanceOf[RequiredSignUpAttributesElement]
  val WEBSITE = "WEBSITE".asInstanceOf[RequiredSignUpAttributesElement]
  val ZONE_INFO = "ZONE_INFO".asInstanceOf[RequiredSignUpAttributesElement]

  @inline def values: js.Array[RequiredSignUpAttributesElement] = js.Array(
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

@js.native
sealed trait ResolutionStrategy extends js.Any
object ResolutionStrategy {
  val OPTIMISTIC_CONCURRENCY = "OPTIMISTIC_CONCURRENCY".asInstanceOf[ResolutionStrategy]
  val LAMBDA = "LAMBDA".asInstanceOf[ResolutionStrategy]
  val AUTOMERGE = "AUTOMERGE".asInstanceOf[ResolutionStrategy]
  val NONE = "NONE".asInstanceOf[ResolutionStrategy]

  @inline def values: js.Array[ResolutionStrategy] = js.Array(OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
}

@js.native
sealed trait Service extends js.Any
object Service {
  val COGNITO = "COGNITO".asInstanceOf[Service]

  @inline def values: js.Array[Service] = js.Array(COGNITO)
}

@js.native
sealed trait ServiceName extends js.Any
object ServiceName {
  val S3 = "S3".asInstanceOf[ServiceName]

  @inline def values: js.Array[ServiceName] = js.Array(S3)
}

@js.native
sealed trait SignInMethod extends js.Any
object SignInMethod {
  val EMAIL = "EMAIL".asInstanceOf[SignInMethod]
  val EMAIL_AND_PHONE_NUMBER = "EMAIL_AND_PHONE_NUMBER".asInstanceOf[SignInMethod]
  val PHONE_NUMBER = "PHONE_NUMBER".asInstanceOf[SignInMethod]
  val USERNAME = "USERNAME".asInstanceOf[SignInMethod]

  @inline def values: js.Array[SignInMethod] = js.Array(EMAIL, EMAIL_AND_PHONE_NUMBER, PHONE_NUMBER, USERNAME)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val LATEST = "LATEST".asInstanceOf[Status]
  val STALE = "STALE".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(LATEST, STALE)
}

@js.native
sealed trait UnAuthenticatedElement extends js.Any
object UnAuthenticatedElement {
  val READ = "READ".asInstanceOf[UnAuthenticatedElement]
  val CREATE_AND_UPDATE = "CREATE_AND_UPDATE".asInstanceOf[UnAuthenticatedElement]
  val DELETE = "DELETE".asInstanceOf[UnAuthenticatedElement]

  @inline def values: js.Array[UnAuthenticatedElement] = js.Array(READ, CREATE_AND_UPDATE, DELETE)
}
