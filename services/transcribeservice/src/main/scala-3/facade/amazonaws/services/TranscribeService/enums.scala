package facade.amazonaws.services.transcribeservice

import scalajs._

type BaseModelName = "NarrowBand" | "WideBand"
object BaseModelName {
  val NarrowBand: "NarrowBand" = "NarrowBand"
  val WideBand: "WideBand" = "WideBand"

  @inline def values = js.Array[BaseModelName](NarrowBand, WideBand)
}

type CLMLanguageCode = "en-US" | "hi-IN" | "es-US" | "en-GB" | "en-AU"
object CLMLanguageCode {
  val `en-US`: "en-US" = "en-US"
  val `hi-IN`: "hi-IN" = "hi-IN"
  val `es-US`: "es-US" = "es-US"
  val `en-GB`: "en-GB" = "en-GB"
  val `en-AU`: "en-AU" = "en-AU"

  @inline def values = js.Array[CLMLanguageCode](`en-US`, `hi-IN`, `es-US`, `en-GB`, `en-AU`)
}

type LanguageCode = "af-ZA" | "ar-AE" | "ar-SA" | "cy-GB" | "da-DK" | "de-CH" | "de-DE" | "en-AB" | "en-AU" | "en-GB" | "en-IE" | "en-IN" | "en-US" | "en-WL" | "es-ES" | "es-US" | "fa-IR" | "fr-CA" | "fr-FR" | "ga-IE" | "gd-GB" | "he-IL" | "hi-IN" | "id-ID" | "it-IT" | "ja-JP" | "ko-KR" | "ms-MY" | "nl-NL" | "pt-BR" | "pt-PT" | "ru-RU" | "ta-IN" | "te-IN" | "tr-TR" | "zh-CN"
object LanguageCode {
  val `af-ZA`: "af-ZA" = "af-ZA"
  val `ar-AE`: "ar-AE" = "ar-AE"
  val `ar-SA`: "ar-SA" = "ar-SA"
  val `cy-GB`: "cy-GB" = "cy-GB"
  val `da-DK`: "da-DK" = "da-DK"
  val `de-CH`: "de-CH" = "de-CH"
  val `de-DE`: "de-DE" = "de-DE"
  val `en-AB`: "en-AB" = "en-AB"
  val `en-AU`: "en-AU" = "en-AU"
  val `en-GB`: "en-GB" = "en-GB"
  val `en-IE`: "en-IE" = "en-IE"
  val `en-IN`: "en-IN" = "en-IN"
  val `en-US`: "en-US" = "en-US"
  val `en-WL`: "en-WL" = "en-WL"
  val `es-ES`: "es-ES" = "es-ES"
  val `es-US`: "es-US" = "es-US"
  val `fa-IR`: "fa-IR" = "fa-IR"
  val `fr-CA`: "fr-CA" = "fr-CA"
  val `fr-FR`: "fr-FR" = "fr-FR"
  val `ga-IE`: "ga-IE" = "ga-IE"
  val `gd-GB`: "gd-GB" = "gd-GB"
  val `he-IL`: "he-IL" = "he-IL"
  val `hi-IN`: "hi-IN" = "hi-IN"
  val `id-ID`: "id-ID" = "id-ID"
  val `it-IT`: "it-IT" = "it-IT"
  val `ja-JP`: "ja-JP" = "ja-JP"
  val `ko-KR`: "ko-KR" = "ko-KR"
  val `ms-MY`: "ms-MY" = "ms-MY"
  val `nl-NL`: "nl-NL" = "nl-NL"
  val `pt-BR`: "pt-BR" = "pt-BR"
  val `pt-PT`: "pt-PT" = "pt-PT"
  val `ru-RU`: "ru-RU" = "ru-RU"
  val `ta-IN`: "ta-IN" = "ta-IN"
  val `te-IN`: "te-IN" = "te-IN"
  val `tr-TR`: "tr-TR" = "tr-TR"
  val `zh-CN`: "zh-CN" = "zh-CN"

  @inline def values = js.Array[LanguageCode](
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
  val mp3: "mp3" = "mp3"
  val mp4: "mp4" = "mp4"
  val wav: "wav" = "wav"
  val flac: "flac" = "flac"
  val ogg: "ogg" = "ogg"
  val amr: "amr" = "amr"
  val webm: "webm" = "webm"

  @inline def values = js.Array[MediaFormat](mp3, mp4, wav, flac, ogg, amr, webm)
}

type ModelStatus = "IN_PROGRESS" | "FAILED" | "COMPLETED"
object ModelStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"
  val COMPLETED: "COMPLETED" = "COMPLETED"

  @inline def values = js.Array[ModelStatus](IN_PROGRESS, FAILED, COMPLETED)
}

type OutputLocationType = "CUSTOMER_BUCKET" | "SERVICE_BUCKET"
object OutputLocationType {
  val CUSTOMER_BUCKET: "CUSTOMER_BUCKET" = "CUSTOMER_BUCKET"
  val SERVICE_BUCKET: "SERVICE_BUCKET" = "SERVICE_BUCKET"

  @inline def values = js.Array[OutputLocationType](CUSTOMER_BUCKET, SERVICE_BUCKET)
}

type RedactionOutput = "redacted" | "redacted_and_unredacted"
object RedactionOutput {
  val redacted: "redacted" = "redacted"
  val redacted_and_unredacted: "redacted_and_unredacted" = "redacted_and_unredacted"

  @inline def values = js.Array[RedactionOutput](redacted, redacted_and_unredacted)
}

type RedactionType = "PII"
object RedactionType {
  val PII: "PII" = "PII"

  @inline def values = js.Array[RedactionType](PII)
}

type Specialty = "PRIMARYCARE"
object Specialty {
  val PRIMARYCARE: "PRIMARYCARE" = "PRIMARYCARE"

  @inline def values = js.Array[Specialty](PRIMARYCARE)
}

type TranscriptionJobStatus = "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED"
object TranscriptionJobStatus {
  val QUEUED: "QUEUED" = "QUEUED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"
  val COMPLETED: "COMPLETED" = "COMPLETED"

  @inline def values = js.Array[TranscriptionJobStatus](QUEUED, IN_PROGRESS, FAILED, COMPLETED)
}

type Type = "CONVERSATION" | "DICTATION"
object Type {
  val CONVERSATION: "CONVERSATION" = "CONVERSATION"
  val DICTATION: "DICTATION" = "DICTATION"

  @inline def values = js.Array[Type](CONVERSATION, DICTATION)
}

type VocabularyFilterMethod = "remove" | "mask" | "tag"
object VocabularyFilterMethod {
  val remove: "remove" = "remove"
  val mask: "mask" = "mask"
  val tag: "tag" = "tag"

  @inline def values = js.Array[VocabularyFilterMethod](remove, mask, tag)
}

type VocabularyState = "PENDING" | "READY" | "FAILED"
object VocabularyState {
  val PENDING: "PENDING" = "PENDING"
  val READY: "READY" = "READY"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[VocabularyState](PENDING, READY, FAILED)
}
