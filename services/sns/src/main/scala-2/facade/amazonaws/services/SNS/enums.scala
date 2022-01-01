package facade.amazonaws.services.sns

import scalajs.js

/** Supported language code for sending OTP message
  */
@js.native
sealed trait LanguageCodeString extends js.Any
object LanguageCodeString {
  val `en-US` = "en-US".asInstanceOf[LanguageCodeString]
  val `en-GB` = "en-GB".asInstanceOf[LanguageCodeString]
  val `es-419` = "es-419".asInstanceOf[LanguageCodeString]
  val `es-ES` = "es-ES".asInstanceOf[LanguageCodeString]
  val `de-DE` = "de-DE".asInstanceOf[LanguageCodeString]
  val `fr-CA` = "fr-CA".asInstanceOf[LanguageCodeString]
  val `fr-FR` = "fr-FR".asInstanceOf[LanguageCodeString]
  val `it-IT` = "it-IT".asInstanceOf[LanguageCodeString]
  val `ja-JP` = "ja-JP".asInstanceOf[LanguageCodeString]
  val `pt-BR` = "pt-BR".asInstanceOf[LanguageCodeString]
  val `kr-KR` = "kr-KR".asInstanceOf[LanguageCodeString]
  val `zh-CN` = "zh-CN".asInstanceOf[LanguageCodeString]
  val `zh-TW` = "zh-TW".asInstanceOf[LanguageCodeString]

  @inline def values: js.Array[LanguageCodeString] = js.Array(`en-US`, `en-GB`, `es-419`, `es-ES`, `de-DE`, `fr-CA`, `fr-FR`, `it-IT`, `ja-JP`, `pt-BR`, `kr-KR`, `zh-CN`, `zh-TW`)
}

/** Enum listing out all supported number capabilities.
  */
@js.native
sealed trait NumberCapability extends js.Any
object NumberCapability {
  val SMS = "SMS".asInstanceOf[NumberCapability]
  val MMS = "MMS".asInstanceOf[NumberCapability]
  val VOICE = "VOICE".asInstanceOf[NumberCapability]

  @inline def values: js.Array[NumberCapability] = js.Array(SMS, MMS, VOICE)
}

/** Enum listing out all supported route types. The following enum values are supported. 1. Transactional : Non-marketing traffic 2. Promotional : Marketing 3. Premium : Premium routes for OTP delivery to the carriers
  */
@js.native
sealed trait RouteType extends js.Any
object RouteType {
  val Transactional = "Transactional".asInstanceOf[RouteType]
  val Promotional = "Promotional".asInstanceOf[RouteType]
  val Premium = "Premium".asInstanceOf[RouteType]

  @inline def values: js.Array[RouteType] = js.Array(Transactional, Promotional, Premium)
}

/** Enum listing out all supported destination phone number verification statuses. The following enum values are supported. 1. PENDING : The destination phone number is pending verification. 2. VERIFIED : The destination phone number is verified.
  */
@js.native
sealed trait SMSSandboxPhoneNumberVerificationStatus extends js.Any
object SMSSandboxPhoneNumberVerificationStatus {
  val Pending = "Pending".asInstanceOf[SMSSandboxPhoneNumberVerificationStatus]
  val Verified = "Verified".asInstanceOf[SMSSandboxPhoneNumberVerificationStatus]

  @inline def values: js.Array[SMSSandboxPhoneNumberVerificationStatus] = js.Array(Pending, Verified)
}
