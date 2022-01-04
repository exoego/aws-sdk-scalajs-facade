package facade.amazonaws.services.sns

import scalajs.js

/** Supported language code for sending OTP message
  */
type LanguageCodeString = "en-US" | "en-GB" | "es-419" | "es-ES" | "de-DE" | "fr-CA" | "fr-FR" | "it-IT" | "ja-JP" | "pt-BR" | "kr-KR" | "zh-CN" | "zh-TW"
object LanguageCodeString {
  inline val `en-US`: "en-US" = "en-US"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `es-419`: "es-419" = "es-419"
  inline val `es-ES`: "es-ES" = "es-ES"
  inline val `de-DE`: "de-DE" = "de-DE"
  inline val `fr-CA`: "fr-CA" = "fr-CA"
  inline val `fr-FR`: "fr-FR" = "fr-FR"
  inline val `it-IT`: "it-IT" = "it-IT"
  inline val `ja-JP`: "ja-JP" = "ja-JP"
  inline val `pt-BR`: "pt-BR" = "pt-BR"
  inline val `kr-KR`: "kr-KR" = "kr-KR"
  inline val `zh-CN`: "zh-CN" = "zh-CN"
  inline val `zh-TW`: "zh-TW" = "zh-TW"

  inline def values: js.Array[LanguageCodeString] = js.Array(`en-US`, `en-GB`, `es-419`, `es-ES`, `de-DE`, `fr-CA`, `fr-FR`, `it-IT`, `ja-JP`, `pt-BR`, `kr-KR`, `zh-CN`, `zh-TW`)
}

/** Enum listing out all supported number capabilities.
  */
type NumberCapability = "SMS" | "MMS" | "VOICE"
object NumberCapability {
  inline val SMS: "SMS" = "SMS"
  inline val MMS: "MMS" = "MMS"
  inline val VOICE: "VOICE" = "VOICE"

  inline def values: js.Array[NumberCapability] = js.Array(SMS, MMS, VOICE)
}

/** Enum listing out all supported route types. The following enum values are supported. 1. Transactional : Non-marketing traffic 2. Promotional : Marketing 3. Premium : Premium routes for OTP delivery to the carriers
  */
type RouteType = "Transactional" | "Promotional" | "Premium"
object RouteType {
  inline val Transactional: "Transactional" = "Transactional"
  inline val Promotional: "Promotional" = "Promotional"
  inline val Premium: "Premium" = "Premium"

  inline def values: js.Array[RouteType] = js.Array(Transactional, Promotional, Premium)
}

/** Enum listing out all supported destination phone number verification statuses. The following enum values are supported. 1. PENDING : The destination phone number is pending verification. 2. VERIFIED : The destination phone number is verified.
  */
type SMSSandboxPhoneNumberVerificationStatus = "Pending" | "Verified"
object SMSSandboxPhoneNumberVerificationStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Verified: "Verified" = "Verified"

  inline def values: js.Array[SMSSandboxPhoneNumberVerificationStatus] = js.Array(Pending, Verified)
}
