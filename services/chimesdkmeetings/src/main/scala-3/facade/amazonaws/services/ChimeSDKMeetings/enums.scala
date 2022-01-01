package facade.amazonaws.services.chimesdkmeetings

import scalajs.js

type MeetingFeatureStatus = "AVAILABLE" | "UNAVAILABLE"
object MeetingFeatureStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[MeetingFeatureStatus] = js.Array(AVAILABLE, UNAVAILABLE)
}

type TranscribeContentIdentificationType = "PII"
object TranscribeContentIdentificationType {
  inline val PII: "PII" = "PII"

  inline def values: js.Array[TranscribeContentIdentificationType] = js.Array(PII)
}

type TranscribeContentRedactionType = "PII"
object TranscribeContentRedactionType {
  inline val PII: "PII" = "PII"

  inline def values: js.Array[TranscribeContentRedactionType] = js.Array(PII)
}

type TranscribeLanguageCode = "en-US" | "en-GB" | "es-US" | "fr-CA" | "fr-FR" | "en-AU" | "it-IT" | "de-DE" | "pt-BR" | "ja-JP" | "ko-KR" | "zh-CN"
object TranscribeLanguageCode {
  inline val `en-US`: "en-US" = "en-US"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `es-US`: "es-US" = "es-US"
  inline val `fr-CA`: "fr-CA" = "fr-CA"
  inline val `fr-FR`: "fr-FR" = "fr-FR"
  inline val `en-AU`: "en-AU" = "en-AU"
  inline val `it-IT`: "it-IT" = "it-IT"
  inline val `de-DE`: "de-DE" = "de-DE"
  inline val `pt-BR`: "pt-BR" = "pt-BR"
  inline val `ja-JP`: "ja-JP" = "ja-JP"
  inline val `ko-KR`: "ko-KR" = "ko-KR"
  inline val `zh-CN`: "zh-CN" = "zh-CN"

  inline def values: js.Array[TranscribeLanguageCode] = js.Array(`en-US`, `en-GB`, `es-US`, `fr-CA`, `fr-FR`, `en-AU`, `it-IT`, `de-DE`, `pt-BR`, `ja-JP`, `ko-KR`, `zh-CN`)
}

type TranscribeMedicalContentIdentificationType = "PHI"
object TranscribeMedicalContentIdentificationType {
  inline val PHI: "PHI" = "PHI"

  inline def values: js.Array[TranscribeMedicalContentIdentificationType] = js.Array(PHI)
}

type TranscribeMedicalLanguageCode = "en-US"
object TranscribeMedicalLanguageCode {
  inline val `en-US`: "en-US" = "en-US"

  inline def values: js.Array[TranscribeMedicalLanguageCode] = js.Array(`en-US`)
}

type TranscribeMedicalRegion = "us-east-1" | "us-east-2" | "us-west-2" | "ap-southeast-2" | "ca-central-1" | "eu-west-1" | "auto"
object TranscribeMedicalRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val auto: "auto" = "auto"

  inline def values: js.Array[TranscribeMedicalRegion] = js.Array(`us-east-1`, `us-east-2`, `us-west-2`, `ap-southeast-2`, `ca-central-1`, `eu-west-1`, auto)
}

type TranscribeMedicalSpecialty = "PRIMARYCARE" | "CARDIOLOGY" | "NEUROLOGY" | "ONCOLOGY" | "RADIOLOGY" | "UROLOGY"
object TranscribeMedicalSpecialty {
  inline val PRIMARYCARE: "PRIMARYCARE" = "PRIMARYCARE"
  inline val CARDIOLOGY: "CARDIOLOGY" = "CARDIOLOGY"
  inline val NEUROLOGY: "NEUROLOGY" = "NEUROLOGY"
  inline val ONCOLOGY: "ONCOLOGY" = "ONCOLOGY"
  inline val RADIOLOGY: "RADIOLOGY" = "RADIOLOGY"
  inline val UROLOGY: "UROLOGY" = "UROLOGY"

  inline def values: js.Array[TranscribeMedicalSpecialty] = js.Array(PRIMARYCARE, CARDIOLOGY, NEUROLOGY, ONCOLOGY, RADIOLOGY, UROLOGY)
}

type TranscribeMedicalType = "CONVERSATION" | "DICTATION"
object TranscribeMedicalType {
  inline val CONVERSATION: "CONVERSATION" = "CONVERSATION"
  inline val DICTATION: "DICTATION" = "DICTATION"

  inline def values: js.Array[TranscribeMedicalType] = js.Array(CONVERSATION, DICTATION)
}

type TranscribePartialResultsStability = "low" | "medium" | "high"
object TranscribePartialResultsStability {
  inline val low: "low" = "low"
  inline val medium: "medium" = "medium"
  inline val high: "high" = "high"

  inline def values: js.Array[TranscribePartialResultsStability] = js.Array(low, medium, high)
}

type TranscribeRegion = "us-east-2" | "us-east-1" | "us-west-2" | "ap-northeast-2" | "ap-southeast-2" | "ap-northeast-1" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "sa-east-1" | "auto"
object TranscribeRegion {
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val auto: "auto" = "auto"

  inline def values: js.Array[TranscribeRegion] = js.Array(
    `us-east-2`,
    `us-east-1`,
    `us-west-2`,
    `ap-northeast-2`,
    `ap-southeast-2`,
    `ap-northeast-1`,
    `ca-central-1`,
    `eu-central-1`,
    `eu-west-1`,
    `eu-west-2`,
    `sa-east-1`,
    auto
  )
}

type TranscribeVocabularyFilterMethod = "remove" | "mask" | "tag"
object TranscribeVocabularyFilterMethod {
  inline val remove: "remove" = "remove"
  inline val mask: "mask" = "mask"
  inline val tag: "tag" = "tag"

  inline def values: js.Array[TranscribeVocabularyFilterMethod] = js.Array(remove, mask, tag)
}
