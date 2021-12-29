package facade.amazonaws.services.transcribeservice

import scalajs._

type BaseModelName = "NarrowBand" | "WideBand"
object BaseModelName {
  inline val NarrowBand: "NarrowBand" = "NarrowBand"
  inline val WideBand: "WideBand" = "WideBand"

  inline def values: js.Array[BaseModelName] = js.Array(NarrowBand, WideBand)
}

type CLMLanguageCode = "en-US" | "hi-IN" | "es-US" | "en-GB" | "en-AU"
object CLMLanguageCode {
  inline val `en-US`: "en-US" = "en-US"
  inline val `hi-IN`: "hi-IN" = "hi-IN"
  inline val `es-US`: "es-US" = "es-US"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `en-AU`: "en-AU" = "en-AU"

  inline def values: js.Array[CLMLanguageCode] = js.Array(`en-US`, `hi-IN`, `es-US`, `en-GB`, `en-AU`)
}

type LanguageCode = "af-ZA" | "ar-AE" | "ar-SA" | "cy-GB" | "da-DK" | "de-CH" | "de-DE" | "en-AB" | "en-AU" | "en-GB" | "en-IE" | "en-IN" | "en-US" | "en-WL" | "es-ES" | "es-US" | "fa-IR" | "fr-CA" | "fr-FR" | "ga-IE" | "gd-GB" | "he-IL" | "hi-IN" | "id-ID" | "it-IT" | "ja-JP" | "ko-KR" | "ms-MY" | "nl-NL" | "pt-BR" | "pt-PT" | "ru-RU" | "ta-IN" | "te-IN" | "tr-TR" | "zh-CN"
object LanguageCode {
  inline val `af-ZA`: "af-ZA" = "af-ZA"
  inline val `ar-AE`: "ar-AE" = "ar-AE"
  inline val `ar-SA`: "ar-SA" = "ar-SA"
  inline val `cy-GB`: "cy-GB" = "cy-GB"
  inline val `da-DK`: "da-DK" = "da-DK"
  inline val `de-CH`: "de-CH" = "de-CH"
  inline val `de-DE`: "de-DE" = "de-DE"
  inline val `en-AB`: "en-AB" = "en-AB"
  inline val `en-AU`: "en-AU" = "en-AU"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `en-IE`: "en-IE" = "en-IE"
  inline val `en-IN`: "en-IN" = "en-IN"
  inline val `en-US`: "en-US" = "en-US"
  inline val `en-WL`: "en-WL" = "en-WL"
  inline val `es-ES`: "es-ES" = "es-ES"
  inline val `es-US`: "es-US" = "es-US"
  inline val `fa-IR`: "fa-IR" = "fa-IR"
  inline val `fr-CA`: "fr-CA" = "fr-CA"
  inline val `fr-FR`: "fr-FR" = "fr-FR"
  inline val `ga-IE`: "ga-IE" = "ga-IE"
  inline val `gd-GB`: "gd-GB" = "gd-GB"
  inline val `he-IL`: "he-IL" = "he-IL"
  inline val `hi-IN`: "hi-IN" = "hi-IN"
  inline val `id-ID`: "id-ID" = "id-ID"
  inline val `it-IT`: "it-IT" = "it-IT"
  inline val `ja-JP`: "ja-JP" = "ja-JP"
  inline val `ko-KR`: "ko-KR" = "ko-KR"
  inline val `ms-MY`: "ms-MY" = "ms-MY"
  inline val `nl-NL`: "nl-NL" = "nl-NL"
  inline val `pt-BR`: "pt-BR" = "pt-BR"
  inline val `pt-PT`: "pt-PT" = "pt-PT"
  inline val `ru-RU`: "ru-RU" = "ru-RU"
  inline val `ta-IN`: "ta-IN" = "ta-IN"
  inline val `te-IN`: "te-IN" = "te-IN"
  inline val `tr-TR`: "tr-TR" = "tr-TR"
  inline val `zh-CN`: "zh-CN" = "zh-CN"

  inline def values: js.Array[LanguageCode] = js.Array(
    `af-ZA`,
    `ar-AE`,
    `ar-SA`,
    `cy-GB`,
    `da-DK`,
    `de-CH`,
    `de-DE`,
    `en-AB`,
    `en-AU`,
    `en-GB`,
    `en-IE`,
    `en-IN`,
    `en-US`,
    `en-WL`,
    `es-ES`,
    `es-US`,
    `fa-IR`,
    `fr-CA`,
    `fr-FR`,
    `ga-IE`,
    `gd-GB`,
    `he-IL`,
    `hi-IN`,
    `id-ID`,
    `it-IT`,
    `ja-JP`,
    `ko-KR`,
    `ms-MY`,
    `nl-NL`,
    `pt-BR`,
    `pt-PT`,
    `ru-RU`,
    `ta-IN`,
    `te-IN`,
    `tr-TR`,
    `zh-CN`
  )
}

type MediaFormat = "mp3" | "mp4" | "wav" | "flac" | "ogg" | "amr" | "webm"
object MediaFormat {
  inline val mp3: "mp3" = "mp3"
  inline val mp4: "mp4" = "mp4"
  inline val wav: "wav" = "wav"
  inline val flac: "flac" = "flac"
  inline val ogg: "ogg" = "ogg"
  inline val amr: "amr" = "amr"
  inline val webm: "webm" = "webm"

  inline def values: js.Array[MediaFormat] = js.Array(mp3, mp4, wav, flac, ogg, amr, webm)
}

type ModelStatus = "IN_PROGRESS" | "FAILED" | "COMPLETED"
object ModelStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[ModelStatus] = js.Array(IN_PROGRESS, FAILED, COMPLETED)
}

type OutputLocationType = "CUSTOMER_BUCKET" | "SERVICE_BUCKET"
object OutputLocationType {
  inline val CUSTOMER_BUCKET: "CUSTOMER_BUCKET" = "CUSTOMER_BUCKET"
  inline val SERVICE_BUCKET: "SERVICE_BUCKET" = "SERVICE_BUCKET"

  inline def values: js.Array[OutputLocationType] = js.Array(CUSTOMER_BUCKET, SERVICE_BUCKET)
}

type RedactionOutput = "redacted" | "redacted_and_unredacted"
object RedactionOutput {
  inline val redacted: "redacted" = "redacted"
  inline val redacted_and_unredacted: "redacted_and_unredacted" = "redacted_and_unredacted"

  inline def values: js.Array[RedactionOutput] = js.Array(redacted, redacted_and_unredacted)
}

type RedactionType = "PII"
object RedactionType {
  inline val PII: "PII" = "PII"

  inline def values: js.Array[RedactionType] = js.Array(PII)
}

type Specialty = "PRIMARYCARE"
object Specialty {
  inline val PRIMARYCARE: "PRIMARYCARE" = "PRIMARYCARE"

  inline def values: js.Array[Specialty] = js.Array(PRIMARYCARE)
}

type TranscriptionJobStatus = "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED"
object TranscriptionJobStatus {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[TranscriptionJobStatus] = js.Array(QUEUED, IN_PROGRESS, FAILED, COMPLETED)
}

type Type = "CONVERSATION" | "DICTATION"
object Type {
  inline val CONVERSATION: "CONVERSATION" = "CONVERSATION"
  inline val DICTATION: "DICTATION" = "DICTATION"

  inline def values: js.Array[Type] = js.Array(CONVERSATION, DICTATION)
}

type VocabularyFilterMethod = "remove" | "mask" | "tag"
object VocabularyFilterMethod {
  inline val remove: "remove" = "remove"
  inline val mask: "mask" = "mask"
  inline val tag: "tag" = "tag"

  inline def values: js.Array[VocabularyFilterMethod] = js.Array(remove, mask, tag)
}

type VocabularyState = "PENDING" | "READY" | "FAILED"
object VocabularyState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val READY: "READY" = "READY"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[VocabularyState] = js.Array(PENDING, READY, FAILED)
}
