package facade.amazonaws.services.chimesdkmeetings

import scalajs.js

@js.native
sealed trait MediaCapabilities extends js.Any
object MediaCapabilities {
  val SendReceive = "SendReceive".asInstanceOf[MediaCapabilities]
  val Send = "Send".asInstanceOf[MediaCapabilities]
  val Receive = "Receive".asInstanceOf[MediaCapabilities]
  val None = "None".asInstanceOf[MediaCapabilities]

  @inline def values: js.Array[MediaCapabilities] = js.Array(SendReceive, Send, Receive, None)
}

@js.native
sealed trait MeetingFeatureStatus extends js.Any
object MeetingFeatureStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[MeetingFeatureStatus]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[MeetingFeatureStatus]

  @inline def values: js.Array[MeetingFeatureStatus] = js.Array(AVAILABLE, UNAVAILABLE)
}

@js.native
sealed trait TranscribeContentIdentificationType extends js.Any
object TranscribeContentIdentificationType {
  val PII = "PII".asInstanceOf[TranscribeContentIdentificationType]

  @inline def values: js.Array[TranscribeContentIdentificationType] = js.Array(PII)
}

@js.native
sealed trait TranscribeContentRedactionType extends js.Any
object TranscribeContentRedactionType {
  val PII = "PII".asInstanceOf[TranscribeContentRedactionType]

  @inline def values: js.Array[TranscribeContentRedactionType] = js.Array(PII)
}

@js.native
sealed trait TranscribeLanguageCode extends js.Any
object TranscribeLanguageCode {
  val `en-US` = "en-US".asInstanceOf[TranscribeLanguageCode]
  val `en-GB` = "en-GB".asInstanceOf[TranscribeLanguageCode]
  val `es-US` = "es-US".asInstanceOf[TranscribeLanguageCode]
  val `fr-CA` = "fr-CA".asInstanceOf[TranscribeLanguageCode]
  val `fr-FR` = "fr-FR".asInstanceOf[TranscribeLanguageCode]
  val `en-AU` = "en-AU".asInstanceOf[TranscribeLanguageCode]
  val `it-IT` = "it-IT".asInstanceOf[TranscribeLanguageCode]
  val `de-DE` = "de-DE".asInstanceOf[TranscribeLanguageCode]
  val `pt-BR` = "pt-BR".asInstanceOf[TranscribeLanguageCode]
  val `ja-JP` = "ja-JP".asInstanceOf[TranscribeLanguageCode]
  val `ko-KR` = "ko-KR".asInstanceOf[TranscribeLanguageCode]
  val `zh-CN` = "zh-CN".asInstanceOf[TranscribeLanguageCode]

  @inline def values: js.Array[TranscribeLanguageCode] = js.Array(`en-US`, `en-GB`, `es-US`, `fr-CA`, `fr-FR`, `en-AU`, `it-IT`, `de-DE`, `pt-BR`, `ja-JP`, `ko-KR`, `zh-CN`)
}

@js.native
sealed trait TranscribeMedicalContentIdentificationType extends js.Any
object TranscribeMedicalContentIdentificationType {
  val PHI = "PHI".asInstanceOf[TranscribeMedicalContentIdentificationType]

  @inline def values: js.Array[TranscribeMedicalContentIdentificationType] = js.Array(PHI)
}

@js.native
sealed trait TranscribeMedicalLanguageCode extends js.Any
object TranscribeMedicalLanguageCode {
  val `en-US` = "en-US".asInstanceOf[TranscribeMedicalLanguageCode]

  @inline def values: js.Array[TranscribeMedicalLanguageCode] = js.Array(`en-US`)
}

@js.native
sealed trait TranscribeMedicalRegion extends js.Any
object TranscribeMedicalRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[TranscribeMedicalRegion]
  val `us-east-2` = "us-east-2".asInstanceOf[TranscribeMedicalRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[TranscribeMedicalRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[TranscribeMedicalRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[TranscribeMedicalRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[TranscribeMedicalRegion]
  val auto = "auto".asInstanceOf[TranscribeMedicalRegion]

  @inline def values: js.Array[TranscribeMedicalRegion] = js.Array(`us-east-1`, `us-east-2`, `us-west-2`, `ap-southeast-2`, `ca-central-1`, `eu-west-1`, auto)
}

@js.native
sealed trait TranscribeMedicalSpecialty extends js.Any
object TranscribeMedicalSpecialty {
  val PRIMARYCARE = "PRIMARYCARE".asInstanceOf[TranscribeMedicalSpecialty]
  val CARDIOLOGY = "CARDIOLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val NEUROLOGY = "NEUROLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val ONCOLOGY = "ONCOLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val RADIOLOGY = "RADIOLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val UROLOGY = "UROLOGY".asInstanceOf[TranscribeMedicalSpecialty]

  @inline def values: js.Array[TranscribeMedicalSpecialty] = js.Array(PRIMARYCARE, CARDIOLOGY, NEUROLOGY, ONCOLOGY, RADIOLOGY, UROLOGY)
}

@js.native
sealed trait TranscribeMedicalType extends js.Any
object TranscribeMedicalType {
  val CONVERSATION = "CONVERSATION".asInstanceOf[TranscribeMedicalType]
  val DICTATION = "DICTATION".asInstanceOf[TranscribeMedicalType]

  @inline def values: js.Array[TranscribeMedicalType] = js.Array(CONVERSATION, DICTATION)
}

@js.native
sealed trait TranscribePartialResultsStability extends js.Any
object TranscribePartialResultsStability {
  val low = "low".asInstanceOf[TranscribePartialResultsStability]
  val medium = "medium".asInstanceOf[TranscribePartialResultsStability]
  val high = "high".asInstanceOf[TranscribePartialResultsStability]

  @inline def values: js.Array[TranscribePartialResultsStability] = js.Array(low, medium, high)
}

@js.native
sealed trait TranscribeRegion extends js.Any
object TranscribeRegion {
  val `us-east-2` = "us-east-2".asInstanceOf[TranscribeRegion]
  val `us-east-1` = "us-east-1".asInstanceOf[TranscribeRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[TranscribeRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[TranscribeRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[TranscribeRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[TranscribeRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[TranscribeRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[TranscribeRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[TranscribeRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[TranscribeRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[TranscribeRegion]
  val auto = "auto".asInstanceOf[TranscribeRegion]
  val `us-gov-west-1` = "us-gov-west-1".asInstanceOf[TranscribeRegion]

  @inline def values: js.Array[TranscribeRegion] = js.Array(
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
    auto,
    `us-gov-west-1`
  )
}

@js.native
sealed trait TranscribeVocabularyFilterMethod extends js.Any
object TranscribeVocabularyFilterMethod {
  val remove = "remove".asInstanceOf[TranscribeVocabularyFilterMethod]
  val mask = "mask".asInstanceOf[TranscribeVocabularyFilterMethod]
  val tag = "tag".asInstanceOf[TranscribeVocabularyFilterMethod]

  @inline def values: js.Array[TranscribeVocabularyFilterMethod] = js.Array(remove, mask, tag)
}
