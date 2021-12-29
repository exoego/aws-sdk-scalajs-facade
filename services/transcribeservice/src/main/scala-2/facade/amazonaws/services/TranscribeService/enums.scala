package facade.amazonaws.services.transcribeservice

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait BaseModelName extends js.Any
object BaseModelName {
  val NarrowBand = "NarrowBand".asInstanceOf[BaseModelName]
  val WideBand = "WideBand".asInstanceOf[BaseModelName]

  @inline def values = js.Array(NarrowBand, WideBand)
}

@js.native
sealed trait CLMLanguageCode extends js.Any
object CLMLanguageCode {
  val `en-US` = "en-US".asInstanceOf[CLMLanguageCode]
  val `hi-IN` = "hi-IN".asInstanceOf[CLMLanguageCode]
  val `es-US` = "es-US".asInstanceOf[CLMLanguageCode]
  val `en-GB` = "en-GB".asInstanceOf[CLMLanguageCode]
  val `en-AU` = "en-AU".asInstanceOf[CLMLanguageCode]

  @inline def values = js.Array(`en-US`, `hi-IN`, `es-US`, `en-GB`, `en-AU`)
}

@js.native
sealed trait LanguageCode extends js.Any
object LanguageCode {
  val `af-ZA` = "af-ZA".asInstanceOf[LanguageCode]
  val `ar-AE` = "ar-AE".asInstanceOf[LanguageCode]
  val `ar-SA` = "ar-SA".asInstanceOf[LanguageCode]
  val `cy-GB` = "cy-GB".asInstanceOf[LanguageCode]
  val `da-DK` = "da-DK".asInstanceOf[LanguageCode]
  val `de-CH` = "de-CH".asInstanceOf[LanguageCode]
  val `de-DE` = "de-DE".asInstanceOf[LanguageCode]
  val `en-AB` = "en-AB".asInstanceOf[LanguageCode]
  val `en-AU` = "en-AU".asInstanceOf[LanguageCode]
  val `en-GB` = "en-GB".asInstanceOf[LanguageCode]
  val `en-IE` = "en-IE".asInstanceOf[LanguageCode]
  val `en-IN` = "en-IN".asInstanceOf[LanguageCode]
  val `en-US` = "en-US".asInstanceOf[LanguageCode]
  val `en-WL` = "en-WL".asInstanceOf[LanguageCode]
  val `es-ES` = "es-ES".asInstanceOf[LanguageCode]
  val `es-US` = "es-US".asInstanceOf[LanguageCode]
  val `fa-IR` = "fa-IR".asInstanceOf[LanguageCode]
  val `fr-CA` = "fr-CA".asInstanceOf[LanguageCode]
  val `fr-FR` = "fr-FR".asInstanceOf[LanguageCode]
  val `ga-IE` = "ga-IE".asInstanceOf[LanguageCode]
  val `gd-GB` = "gd-GB".asInstanceOf[LanguageCode]
  val `he-IL` = "he-IL".asInstanceOf[LanguageCode]
  val `hi-IN` = "hi-IN".asInstanceOf[LanguageCode]
  val `id-ID` = "id-ID".asInstanceOf[LanguageCode]
  val `it-IT` = "it-IT".asInstanceOf[LanguageCode]
  val `ja-JP` = "ja-JP".asInstanceOf[LanguageCode]
  val `ko-KR` = "ko-KR".asInstanceOf[LanguageCode]
  val `ms-MY` = "ms-MY".asInstanceOf[LanguageCode]
  val `nl-NL` = "nl-NL".asInstanceOf[LanguageCode]
  val `pt-BR` = "pt-BR".asInstanceOf[LanguageCode]
  val `pt-PT` = "pt-PT".asInstanceOf[LanguageCode]
  val `ru-RU` = "ru-RU".asInstanceOf[LanguageCode]
  val `ta-IN` = "ta-IN".asInstanceOf[LanguageCode]
  val `te-IN` = "te-IN".asInstanceOf[LanguageCode]
  val `tr-TR` = "tr-TR".asInstanceOf[LanguageCode]
  val `zh-CN` = "zh-CN".asInstanceOf[LanguageCode]

  @inline def values = js.Array(`af-ZA`, `ar-AE`, `ar-SA`, `cy-GB`, `da-DK`, `de-CH`, `de-DE`, `en-AB`, `en-AU`, `en-GB`, `en-IE`, `en-IN`, `en-US`, `en-WL`, `es-ES`, `es-US`, `fa-IR`, `fr-CA`, `fr-FR`, `ga-IE`, `gd-GB`, `he-IL`, `hi-IN`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `ms-MY`, `nl-NL`, `pt-BR`, `pt-PT`, `ru-RU`, `ta-IN`, `te-IN`, `tr-TR`, `zh-CN`)
}

@js.native
sealed trait MediaFormat extends js.Any
object MediaFormat {
  val mp3 = "mp3".asInstanceOf[MediaFormat]
  val mp4 = "mp4".asInstanceOf[MediaFormat]
  val wav = "wav".asInstanceOf[MediaFormat]
  val flac = "flac".asInstanceOf[MediaFormat]
  val ogg = "ogg".asInstanceOf[MediaFormat]
  val amr = "amr".asInstanceOf[MediaFormat]
  val webm = "webm".asInstanceOf[MediaFormat]

  @inline def values = js.Array(mp3, mp4, wav, flac, ogg, amr, webm)
}

@js.native
sealed trait ModelStatus extends js.Any
object ModelStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ModelStatus]
  val FAILED = "FAILED".asInstanceOf[ModelStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ModelStatus]

  @inline def values = js.Array(IN_PROGRESS, FAILED, COMPLETED)
}

@js.native
sealed trait OutputLocationType extends js.Any
object OutputLocationType {
  val CUSTOMER_BUCKET = "CUSTOMER_BUCKET".asInstanceOf[OutputLocationType]
  val SERVICE_BUCKET = "SERVICE_BUCKET".asInstanceOf[OutputLocationType]

  @inline def values = js.Array(CUSTOMER_BUCKET, SERVICE_BUCKET)
}

@js.native
sealed trait RedactionOutput extends js.Any
object RedactionOutput {
  val redacted = "redacted".asInstanceOf[RedactionOutput]
  val redacted_and_unredacted = "redacted_and_unredacted".asInstanceOf[RedactionOutput]

  @inline def values = js.Array(redacted, redacted_and_unredacted)
}

@js.native
sealed trait RedactionType extends js.Any
object RedactionType {
  val PII = "PII".asInstanceOf[RedactionType]

  @inline def values = js.Array(PII)
}

@js.native
sealed trait Specialty extends js.Any
object Specialty {
  val PRIMARYCARE = "PRIMARYCARE".asInstanceOf[Specialty]

  @inline def values = js.Array(PRIMARYCARE)
}

@js.native
sealed trait TranscriptionJobStatus extends js.Any
object TranscriptionJobStatus {
  val QUEUED = "QUEUED".asInstanceOf[TranscriptionJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TranscriptionJobStatus]
  val FAILED = "FAILED".asInstanceOf[TranscriptionJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[TranscriptionJobStatus]

  @inline def values = js.Array(QUEUED, IN_PROGRESS, FAILED, COMPLETED)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val CONVERSATION = "CONVERSATION".asInstanceOf[Type]
  val DICTATION = "DICTATION".asInstanceOf[Type]

  @inline def values = js.Array(CONVERSATION, DICTATION)
}

@js.native
sealed trait VocabularyFilterMethod extends js.Any
object VocabularyFilterMethod {
  val remove = "remove".asInstanceOf[VocabularyFilterMethod]
  val mask = "mask".asInstanceOf[VocabularyFilterMethod]
  val tag = "tag".asInstanceOf[VocabularyFilterMethod]

  @inline def values = js.Array(remove, mask, tag)
}

@js.native
sealed trait VocabularyState extends js.Any
object VocabularyState {
  val PENDING = "PENDING".asInstanceOf[VocabularyState]
  val READY = "READY".asInstanceOf[VocabularyState]
  val FAILED = "FAILED".asInstanceOf[VocabularyState]

  @inline def values = js.Array(PENDING, READY, FAILED)
}

