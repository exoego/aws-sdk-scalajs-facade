package facade.amazonaws.services.translate

import scalajs.js

@js.native
sealed trait Directionality extends js.Any
object Directionality {
  val UNI = "UNI".asInstanceOf[Directionality]
  val MULTI = "MULTI".asInstanceOf[Directionality]

  @inline def values: js.Array[Directionality] = js.Array(UNI, MULTI)
}

@js.native
sealed trait DisplayLanguageCode extends js.Any
object DisplayLanguageCode {
  val de = "de".asInstanceOf[DisplayLanguageCode]
  val en = "en".asInstanceOf[DisplayLanguageCode]
  val es = "es".asInstanceOf[DisplayLanguageCode]
  val fr = "fr".asInstanceOf[DisplayLanguageCode]
  val it = "it".asInstanceOf[DisplayLanguageCode]
  val ja = "ja".asInstanceOf[DisplayLanguageCode]
  val ko = "ko".asInstanceOf[DisplayLanguageCode]
  val pt = "pt".asInstanceOf[DisplayLanguageCode]
  val zh = "zh".asInstanceOf[DisplayLanguageCode]
  val `zh-TW` = "zh-TW".asInstanceOf[DisplayLanguageCode]

  @inline def values: js.Array[DisplayLanguageCode] = js.Array(de, en, es, fr, it, ja, ko, pt, zh, `zh-TW`)
}

@js.native
sealed trait EncryptionKeyType extends js.Any
object EncryptionKeyType {
  val KMS = "KMS".asInstanceOf[EncryptionKeyType]

  @inline def values: js.Array[EncryptionKeyType] = js.Array(KMS)
}

@js.native
sealed trait Formality extends js.Any
object Formality {
  val FORMAL = "FORMAL".asInstanceOf[Formality]
  val INFORMAL = "INFORMAL".asInstanceOf[Formality]

  @inline def values: js.Array[Formality] = js.Array(FORMAL, INFORMAL)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val COMPLETED_WITH_ERROR = "COMPLETED_WITH_ERROR".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
  val STOPPED = "STOPPED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED)
}

@js.native
sealed trait MergeStrategy extends js.Any
object MergeStrategy {
  val OVERWRITE = "OVERWRITE".asInstanceOf[MergeStrategy]

  @inline def values: js.Array[MergeStrategy] = js.Array(OVERWRITE)
}

@js.native
sealed trait ParallelDataFormat extends js.Any
object ParallelDataFormat {
  val TSV = "TSV".asInstanceOf[ParallelDataFormat]
  val CSV = "CSV".asInstanceOf[ParallelDataFormat]
  val TMX = "TMX".asInstanceOf[ParallelDataFormat]

  @inline def values: js.Array[ParallelDataFormat] = js.Array(TSV, CSV, TMX)
}

@js.native
sealed trait ParallelDataStatus extends js.Any
object ParallelDataStatus {
  val CREATING = "CREATING".asInstanceOf[ParallelDataStatus]
  val UPDATING = "UPDATING".asInstanceOf[ParallelDataStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ParallelDataStatus]
  val DELETING = "DELETING".asInstanceOf[ParallelDataStatus]
  val FAILED = "FAILED".asInstanceOf[ParallelDataStatus]

  @inline def values: js.Array[ParallelDataStatus] = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

@js.native
sealed trait Profanity extends js.Any
object Profanity {
  val MASK = "MASK".asInstanceOf[Profanity]

  @inline def values: js.Array[Profanity] = js.Array(MASK)
}

@js.native
sealed trait TerminologyDataFormat extends js.Any
object TerminologyDataFormat {
  val CSV = "CSV".asInstanceOf[TerminologyDataFormat]
  val TMX = "TMX".asInstanceOf[TerminologyDataFormat]
  val TSV = "TSV".asInstanceOf[TerminologyDataFormat]

  @inline def values: js.Array[TerminologyDataFormat] = js.Array(CSV, TMX, TSV)
}
