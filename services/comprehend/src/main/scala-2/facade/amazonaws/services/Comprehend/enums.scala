package facade.amazonaws.services.comprehend

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DocumentClassifierDataFormat extends js.Any
object DocumentClassifierDataFormat {
  val COMPREHEND_CSV = "COMPREHEND_CSV".asInstanceOf[DocumentClassifierDataFormat]
  val AUGMENTED_MANIFEST = "AUGMENTED_MANIFEST".asInstanceOf[DocumentClassifierDataFormat]

  @inline def values = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

@js.native
sealed trait DocumentClassifierMode extends js.Any
object DocumentClassifierMode {
  val MULTI_CLASS = "MULTI_CLASS".asInstanceOf[DocumentClassifierMode]
  val MULTI_LABEL = "MULTI_LABEL".asInstanceOf[DocumentClassifierMode]

  @inline def values = js.Array(MULTI_CLASS, MULTI_LABEL)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val CREATING = "CREATING".asInstanceOf[EndpointStatus]
  val DELETING = "DELETING".asInstanceOf[EndpointStatus]
  val FAILED = "FAILED".asInstanceOf[EndpointStatus]
  val IN_SERVICE = "IN_SERVICE".asInstanceOf[EndpointStatus]
  val UPDATING = "UPDATING".asInstanceOf[EndpointStatus]

  @inline def values = js.Array(CREATING, DELETING, FAILED, IN_SERVICE, UPDATING)
}

@js.native
sealed trait EntityRecognizerDataFormat extends js.Any
object EntityRecognizerDataFormat {
  val COMPREHEND_CSV = "COMPREHEND_CSV".asInstanceOf[EntityRecognizerDataFormat]
  val AUGMENTED_MANIFEST = "AUGMENTED_MANIFEST".asInstanceOf[EntityRecognizerDataFormat]

  @inline def values = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

@js.native
sealed trait EntityType extends js.Any
object EntityType {
  val PERSON = "PERSON".asInstanceOf[EntityType]
  val LOCATION = "LOCATION".asInstanceOf[EntityType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[EntityType]
  val COMMERCIAL_ITEM = "COMMERCIAL_ITEM".asInstanceOf[EntityType]
  val EVENT = "EVENT".asInstanceOf[EntityType]
  val DATE = "DATE".asInstanceOf[EntityType]
  val QUANTITY = "QUANTITY".asInstanceOf[EntityType]
  val TITLE = "TITLE".asInstanceOf[EntityType]
  val OTHER = "OTHER".asInstanceOf[EntityType]

  @inline def values = js.Array(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
}

@js.native
sealed trait InputFormat extends js.Any
object InputFormat {
  val ONE_DOC_PER_FILE = "ONE_DOC_PER_FILE".asInstanceOf[InputFormat]
  val ONE_DOC_PER_LINE = "ONE_DOC_PER_LINE".asInstanceOf[InputFormat]

  @inline def values = js.Array(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
  val STOPPED = "STOPPED".asInstanceOf[JobStatus]

  @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
}

@js.native
sealed trait LanguageCode extends js.Any
object LanguageCode {
  val en = "en".asInstanceOf[LanguageCode]
  val es = "es".asInstanceOf[LanguageCode]
  val fr = "fr".asInstanceOf[LanguageCode]
  val de = "de".asInstanceOf[LanguageCode]
  val it = "it".asInstanceOf[LanguageCode]
  val pt = "pt".asInstanceOf[LanguageCode]
  val ar = "ar".asInstanceOf[LanguageCode]
  val hi = "hi".asInstanceOf[LanguageCode]
  val ja = "ja".asInstanceOf[LanguageCode]
  val ko = "ko".asInstanceOf[LanguageCode]
  val zh = "zh".asInstanceOf[LanguageCode]
  val `zh-TW` = "zh-TW".asInstanceOf[LanguageCode]

  @inline def values = js.Array(en, es, fr, de, it, pt, ar, hi, ja, ko, zh, `zh-TW`)
}

@js.native
sealed trait ModelStatus extends js.Any
object ModelStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[ModelStatus]
  val TRAINING = "TRAINING".asInstanceOf[ModelStatus]
  val DELETING = "DELETING".asInstanceOf[ModelStatus]
  val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[ModelStatus]
  val STOPPED = "STOPPED".asInstanceOf[ModelStatus]
  val IN_ERROR = "IN_ERROR".asInstanceOf[ModelStatus]
  val TRAINED = "TRAINED".asInstanceOf[ModelStatus]

  @inline def values = js.Array(SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED)
}

@js.native
sealed trait PartOfSpeechTagType extends js.Any
object PartOfSpeechTagType {
  val ADJ = "ADJ".asInstanceOf[PartOfSpeechTagType]
  val ADP = "ADP".asInstanceOf[PartOfSpeechTagType]
  val ADV = "ADV".asInstanceOf[PartOfSpeechTagType]
  val AUX = "AUX".asInstanceOf[PartOfSpeechTagType]
  val CONJ = "CONJ".asInstanceOf[PartOfSpeechTagType]
  val CCONJ = "CCONJ".asInstanceOf[PartOfSpeechTagType]
  val DET = "DET".asInstanceOf[PartOfSpeechTagType]
  val INTJ = "INTJ".asInstanceOf[PartOfSpeechTagType]
  val NOUN = "NOUN".asInstanceOf[PartOfSpeechTagType]
  val NUM = "NUM".asInstanceOf[PartOfSpeechTagType]
  val O = "O".asInstanceOf[PartOfSpeechTagType]
  val PART = "PART".asInstanceOf[PartOfSpeechTagType]
  val PRON = "PRON".asInstanceOf[PartOfSpeechTagType]
  val PROPN = "PROPN".asInstanceOf[PartOfSpeechTagType]
  val PUNCT = "PUNCT".asInstanceOf[PartOfSpeechTagType]
  val SCONJ = "SCONJ".asInstanceOf[PartOfSpeechTagType]
  val SYM = "SYM".asInstanceOf[PartOfSpeechTagType]
  val VERB = "VERB".asInstanceOf[PartOfSpeechTagType]

  @inline def values = js.Array(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
}

@js.native
sealed trait PiiEntitiesDetectionMaskMode extends js.Any
object PiiEntitiesDetectionMaskMode {
  val MASK = "MASK".asInstanceOf[PiiEntitiesDetectionMaskMode]
  val REPLACE_WITH_PII_ENTITY_TYPE = "REPLACE_WITH_PII_ENTITY_TYPE".asInstanceOf[PiiEntitiesDetectionMaskMode]

  @inline def values = js.Array(MASK, REPLACE_WITH_PII_ENTITY_TYPE)
}

@js.native
sealed trait PiiEntitiesDetectionMode extends js.Any
object PiiEntitiesDetectionMode {
  val ONLY_REDACTION = "ONLY_REDACTION".asInstanceOf[PiiEntitiesDetectionMode]
  val ONLY_OFFSETS = "ONLY_OFFSETS".asInstanceOf[PiiEntitiesDetectionMode]

  @inline def values = js.Array(ONLY_REDACTION, ONLY_OFFSETS)
}

@js.native
sealed trait PiiEntityType extends js.Any
object PiiEntityType {
  val BANK_ACCOUNT_NUMBER = "BANK_ACCOUNT_NUMBER".asInstanceOf[PiiEntityType]
  val BANK_ROUTING = "BANK_ROUTING".asInstanceOf[PiiEntityType]
  val CREDIT_DEBIT_NUMBER = "CREDIT_DEBIT_NUMBER".asInstanceOf[PiiEntityType]
  val CREDIT_DEBIT_CVV = "CREDIT_DEBIT_CVV".asInstanceOf[PiiEntityType]
  val CREDIT_DEBIT_EXPIRY = "CREDIT_DEBIT_EXPIRY".asInstanceOf[PiiEntityType]
  val PIN = "PIN".asInstanceOf[PiiEntityType]
  val EMAIL = "EMAIL".asInstanceOf[PiiEntityType]
  val ADDRESS = "ADDRESS".asInstanceOf[PiiEntityType]
  val NAME = "NAME".asInstanceOf[PiiEntityType]
  val PHONE = "PHONE".asInstanceOf[PiiEntityType]
  val SSN = "SSN".asInstanceOf[PiiEntityType]
  val DATE_TIME = "DATE_TIME".asInstanceOf[PiiEntityType]
  val PASSPORT_NUMBER = "PASSPORT_NUMBER".asInstanceOf[PiiEntityType]
  val DRIVER_ID = "DRIVER_ID".asInstanceOf[PiiEntityType]
  val URL = "URL".asInstanceOf[PiiEntityType]
  val AGE = "AGE".asInstanceOf[PiiEntityType]
  val USERNAME = "USERNAME".asInstanceOf[PiiEntityType]
  val PASSWORD = "PASSWORD".asInstanceOf[PiiEntityType]
  val AWS_ACCESS_KEY = "AWS_ACCESS_KEY".asInstanceOf[PiiEntityType]
  val AWS_SECRET_KEY = "AWS_SECRET_KEY".asInstanceOf[PiiEntityType]
  val IP_ADDRESS = "IP_ADDRESS".asInstanceOf[PiiEntityType]
  val MAC_ADDRESS = "MAC_ADDRESS".asInstanceOf[PiiEntityType]
  val ALL = "ALL".asInstanceOf[PiiEntityType]

  @inline def values = js.Array(BANK_ACCOUNT_NUMBER, BANK_ROUTING, CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL, ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL, AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS, MAC_ADDRESS, ALL)
}

@js.native
sealed trait SentimentType extends js.Any
object SentimentType {
  val POSITIVE = "POSITIVE".asInstanceOf[SentimentType]
  val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentType]
  val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentType]
  val MIXED = "MIXED".asInstanceOf[SentimentType]

  @inline def values = js.Array(POSITIVE, NEGATIVE, NEUTRAL, MIXED)
}

@js.native
sealed trait SyntaxLanguageCode extends js.Any
object SyntaxLanguageCode {
  val en = "en".asInstanceOf[SyntaxLanguageCode]
  val es = "es".asInstanceOf[SyntaxLanguageCode]
  val fr = "fr".asInstanceOf[SyntaxLanguageCode]
  val de = "de".asInstanceOf[SyntaxLanguageCode]
  val it = "it".asInstanceOf[SyntaxLanguageCode]
  val pt = "pt".asInstanceOf[SyntaxLanguageCode]

  @inline def values = js.Array(en, es, fr, de, it, pt)
}

