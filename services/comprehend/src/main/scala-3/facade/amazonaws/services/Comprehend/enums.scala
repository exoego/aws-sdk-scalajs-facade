package facade.amazonaws.services.comprehend

import scalajs._

type DocumentClassifierDataFormat = "COMPREHEND_CSV" | "AUGMENTED_MANIFEST"
object DocumentClassifierDataFormat {
  val COMPREHEND_CSV: "COMPREHEND_CSV" = "COMPREHEND_CSV"
  val AUGMENTED_MANIFEST: "AUGMENTED_MANIFEST" = "AUGMENTED_MANIFEST"

  @inline def values = js.Array[DocumentClassifierDataFormat](COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

type DocumentClassifierMode = "MULTI_CLASS" | "MULTI_LABEL"
object DocumentClassifierMode {
  val MULTI_CLASS: "MULTI_CLASS" = "MULTI_CLASS"
  val MULTI_LABEL: "MULTI_LABEL" = "MULTI_LABEL"

  @inline def values = js.Array[DocumentClassifierMode](MULTI_CLASS, MULTI_LABEL)
}

type EndpointStatus = "CREATING" | "DELETING" | "FAILED" | "IN_SERVICE" | "UPDATING"
object EndpointStatus {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val IN_SERVICE: "IN_SERVICE" = "IN_SERVICE"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[EndpointStatus](CREATING, DELETING, FAILED, IN_SERVICE, UPDATING)
}

type EntityRecognizerDataFormat = "COMPREHEND_CSV" | "AUGMENTED_MANIFEST"
object EntityRecognizerDataFormat {
  val COMPREHEND_CSV: "COMPREHEND_CSV" = "COMPREHEND_CSV"
  val AUGMENTED_MANIFEST: "AUGMENTED_MANIFEST" = "AUGMENTED_MANIFEST"

  @inline def values = js.Array[EntityRecognizerDataFormat](COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

type EntityType = "PERSON" | "LOCATION" | "ORGANIZATION" | "COMMERCIAL_ITEM" | "EVENT" | "DATE" | "QUANTITY" | "TITLE" | "OTHER"
object EntityType {
  val PERSON: "PERSON" = "PERSON"
  val LOCATION: "LOCATION" = "LOCATION"
  val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  val COMMERCIAL_ITEM: "COMMERCIAL_ITEM" = "COMMERCIAL_ITEM"
  val EVENT: "EVENT" = "EVENT"
  val DATE: "DATE" = "DATE"
  val QUANTITY: "QUANTITY" = "QUANTITY"
  val TITLE: "TITLE" = "TITLE"
  val OTHER: "OTHER" = "OTHER"

  @inline def values = js.Array[EntityType](PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
}

type InputFormat = "ONE_DOC_PER_FILE" | "ONE_DOC_PER_LINE"
object InputFormat {
  val ONE_DOC_PER_FILE: "ONE_DOC_PER_FILE" = "ONE_DOC_PER_FILE"
  val ONE_DOC_PER_LINE: "ONE_DOC_PER_LINE" = "ONE_DOC_PER_LINE"

  @inline def values = js.Array[InputFormat](ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED"
object JobStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[JobStatus](SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
}

type LanguageCode = "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW"
object LanguageCode {
  val en: "en" = "en"
  val es: "es" = "es"
  val fr: "fr" = "fr"
  val de: "de" = "de"
  val it: "it" = "it"
  val pt: "pt" = "pt"
  val ar: "ar" = "ar"
  val hi: "hi" = "hi"
  val ja: "ja" = "ja"
  val ko: "ko" = "ko"
  val zh: "zh" = "zh"
  val `zh-TW`: "zh-TW" = "zh-TW"

  @inline def values = js.Array[LanguageCode](en, es, fr, de, it, pt, ar, hi, ja, ko, zh, `zh-TW`)
}

type ModelStatus = "SUBMITTED" | "TRAINING" | "DELETING" | "STOP_REQUESTED" | "STOPPED" | "IN_ERROR" | "TRAINED"
object ModelStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val TRAINING: "TRAINING" = "TRAINING"
  val DELETING: "DELETING" = "DELETING"
  val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  val STOPPED: "STOPPED" = "STOPPED"
  val IN_ERROR: "IN_ERROR" = "IN_ERROR"
  val TRAINED: "TRAINED" = "TRAINED"

  @inline def values = js.Array[ModelStatus](SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED)
}

type PartOfSpeechTagType = "ADJ" | "ADP" | "ADV" | "AUX" | "CONJ" | "CCONJ" | "DET" | "INTJ" | "NOUN" | "NUM" | "O" | "PART" | "PRON" | "PROPN" | "PUNCT" | "SCONJ" | "SYM" | "VERB"
object PartOfSpeechTagType {
  val ADJ: "ADJ" = "ADJ"
  val ADP: "ADP" = "ADP"
  val ADV: "ADV" = "ADV"
  val AUX: "AUX" = "AUX"
  val CONJ: "CONJ" = "CONJ"
  val CCONJ: "CCONJ" = "CCONJ"
  val DET: "DET" = "DET"
  val INTJ: "INTJ" = "INTJ"
  val NOUN: "NOUN" = "NOUN"
  val NUM: "NUM" = "NUM"
  val O: "O" = "O"
  val PART: "PART" = "PART"
  val PRON: "PRON" = "PRON"
  val PROPN: "PROPN" = "PROPN"
  val PUNCT: "PUNCT" = "PUNCT"
  val SCONJ: "SCONJ" = "SCONJ"
  val SYM: "SYM" = "SYM"
  val VERB: "VERB" = "VERB"

  @inline def values = js.Array[PartOfSpeechTagType](ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
}

type PiiEntitiesDetectionMaskMode = "MASK" | "REPLACE_WITH_PII_ENTITY_TYPE"
object PiiEntitiesDetectionMaskMode {
  val MASK: "MASK" = "MASK"
  val REPLACE_WITH_PII_ENTITY_TYPE: "REPLACE_WITH_PII_ENTITY_TYPE" = "REPLACE_WITH_PII_ENTITY_TYPE"

  @inline def values = js.Array[PiiEntitiesDetectionMaskMode](MASK, REPLACE_WITH_PII_ENTITY_TYPE)
}

type PiiEntitiesDetectionMode = "ONLY_REDACTION" | "ONLY_OFFSETS"
object PiiEntitiesDetectionMode {
  val ONLY_REDACTION: "ONLY_REDACTION" = "ONLY_REDACTION"
  val ONLY_OFFSETS: "ONLY_OFFSETS" = "ONLY_OFFSETS"

  @inline def values = js.Array[PiiEntitiesDetectionMode](ONLY_REDACTION, ONLY_OFFSETS)
}

type PiiEntityType = "BANK_ACCOUNT_NUMBER" | "BANK_ROUTING" | "CREDIT_DEBIT_NUMBER" | "CREDIT_DEBIT_CVV" | "CREDIT_DEBIT_EXPIRY" | "PIN" | "EMAIL" | "ADDRESS" | "NAME" | "PHONE" | "SSN" | "DATE_TIME" | "PASSPORT_NUMBER" | "DRIVER_ID" | "URL" | "AGE" | "USERNAME" | "PASSWORD" | "AWS_ACCESS_KEY" | "AWS_SECRET_KEY" | "IP_ADDRESS" | "MAC_ADDRESS" | "ALL"
object PiiEntityType {
  val BANK_ACCOUNT_NUMBER: "BANK_ACCOUNT_NUMBER" = "BANK_ACCOUNT_NUMBER"
  val BANK_ROUTING: "BANK_ROUTING" = "BANK_ROUTING"
  val CREDIT_DEBIT_NUMBER: "CREDIT_DEBIT_NUMBER" = "CREDIT_DEBIT_NUMBER"
  val CREDIT_DEBIT_CVV: "CREDIT_DEBIT_CVV" = "CREDIT_DEBIT_CVV"
  val CREDIT_DEBIT_EXPIRY: "CREDIT_DEBIT_EXPIRY" = "CREDIT_DEBIT_EXPIRY"
  val PIN: "PIN" = "PIN"
  val EMAIL: "EMAIL" = "EMAIL"
  val ADDRESS: "ADDRESS" = "ADDRESS"
  val NAME: "NAME" = "NAME"
  val PHONE: "PHONE" = "PHONE"
  val SSN: "SSN" = "SSN"
  val DATE_TIME: "DATE_TIME" = "DATE_TIME"
  val PASSPORT_NUMBER: "PASSPORT_NUMBER" = "PASSPORT_NUMBER"
  val DRIVER_ID: "DRIVER_ID" = "DRIVER_ID"
  val URL: "URL" = "URL"
  val AGE: "AGE" = "AGE"
  val USERNAME: "USERNAME" = "USERNAME"
  val PASSWORD: "PASSWORD" = "PASSWORD"
  val AWS_ACCESS_KEY: "AWS_ACCESS_KEY" = "AWS_ACCESS_KEY"
  val AWS_SECRET_KEY: "AWS_SECRET_KEY" = "AWS_SECRET_KEY"
  val IP_ADDRESS: "IP_ADDRESS" = "IP_ADDRESS"
  val MAC_ADDRESS: "MAC_ADDRESS" = "MAC_ADDRESS"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[PiiEntityType](
    BANK_ACCOUNT_NUMBER,
    BANK_ROUTING,
    CREDIT_DEBIT_NUMBER,
    CREDIT_DEBIT_CVV,
    CREDIT_DEBIT_EXPIRY,
    PIN,
    EMAIL,
    ADDRESS,
    NAME,
    PHONE,
    SSN,
    DATE_TIME,
    PASSPORT_NUMBER,
    DRIVER_ID,
    URL,
    AGE,
    USERNAME,
    PASSWORD,
    AWS_ACCESS_KEY,
    AWS_SECRET_KEY,
    IP_ADDRESS,
    MAC_ADDRESS,
    ALL
  )
}

type SentimentType = "POSITIVE" | "NEGATIVE" | "NEUTRAL" | "MIXED"
object SentimentType {
  val POSITIVE: "POSITIVE" = "POSITIVE"
  val NEGATIVE: "NEGATIVE" = "NEGATIVE"
  val NEUTRAL: "NEUTRAL" = "NEUTRAL"
  val MIXED: "MIXED" = "MIXED"

  @inline def values = js.Array[SentimentType](POSITIVE, NEGATIVE, NEUTRAL, MIXED)
}

type SyntaxLanguageCode = "en" | "es" | "fr" | "de" | "it" | "pt"
object SyntaxLanguageCode {
  val en: "en" = "en"
  val es: "es" = "es"
  val fr: "fr" = "fr"
  val de: "de" = "de"
  val it: "it" = "it"
  val pt: "pt" = "pt"

  @inline def values = js.Array[SyntaxLanguageCode](en, es, fr, de, it, pt)
}
