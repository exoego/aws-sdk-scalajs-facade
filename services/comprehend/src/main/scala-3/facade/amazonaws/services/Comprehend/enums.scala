package facade.amazonaws.services.comprehend

import scalajs.js

type DocumentClassifierDataFormat = "COMPREHEND_CSV" | "AUGMENTED_MANIFEST"
object DocumentClassifierDataFormat {
  inline val COMPREHEND_CSV: "COMPREHEND_CSV" = "COMPREHEND_CSV"
  inline val AUGMENTED_MANIFEST: "AUGMENTED_MANIFEST" = "AUGMENTED_MANIFEST"

  inline def values: js.Array[DocumentClassifierDataFormat] = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

type DocumentClassifierMode = "MULTI_CLASS" | "MULTI_LABEL"
object DocumentClassifierMode {
  inline val MULTI_CLASS: "MULTI_CLASS" = "MULTI_CLASS"
  inline val MULTI_LABEL: "MULTI_LABEL" = "MULTI_LABEL"

  inline def values: js.Array[DocumentClassifierMode] = js.Array(MULTI_CLASS, MULTI_LABEL)
}

type EndpointStatus = "CREATING" | "DELETING" | "FAILED" | "IN_SERVICE" | "UPDATING"
object EndpointStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_SERVICE: "IN_SERVICE" = "IN_SERVICE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[EndpointStatus] = js.Array(CREATING, DELETING, FAILED, IN_SERVICE, UPDATING)
}

type EntityRecognizerDataFormat = "COMPREHEND_CSV" | "AUGMENTED_MANIFEST"
object EntityRecognizerDataFormat {
  inline val COMPREHEND_CSV: "COMPREHEND_CSV" = "COMPREHEND_CSV"
  inline val AUGMENTED_MANIFEST: "AUGMENTED_MANIFEST" = "AUGMENTED_MANIFEST"

  inline def values: js.Array[EntityRecognizerDataFormat] = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

type EntityType = "PERSON" | "LOCATION" | "ORGANIZATION" | "COMMERCIAL_ITEM" | "EVENT" | "DATE" | "QUANTITY" | "TITLE" | "OTHER"
object EntityType {
  inline val PERSON: "PERSON" = "PERSON"
  inline val LOCATION: "LOCATION" = "LOCATION"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  inline val COMMERCIAL_ITEM: "COMMERCIAL_ITEM" = "COMMERCIAL_ITEM"
  inline val EVENT: "EVENT" = "EVENT"
  inline val DATE: "DATE" = "DATE"
  inline val QUANTITY: "QUANTITY" = "QUANTITY"
  inline val TITLE: "TITLE" = "TITLE"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[EntityType] = js.Array(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
}

type InputFormat = "ONE_DOC_PER_FILE" | "ONE_DOC_PER_LINE"
object InputFormat {
  inline val ONE_DOC_PER_FILE: "ONE_DOC_PER_FILE" = "ONE_DOC_PER_FILE"
  inline val ONE_DOC_PER_LINE: "ONE_DOC_PER_LINE" = "ONE_DOC_PER_LINE"

  inline def values: js.Array[InputFormat] = js.Array(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
}

type LanguageCode = "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW"
object LanguageCode {
  inline val en: "en" = "en"
  inline val es: "es" = "es"
  inline val fr: "fr" = "fr"
  inline val de: "de" = "de"
  inline val it: "it" = "it"
  inline val pt: "pt" = "pt"
  inline val ar: "ar" = "ar"
  inline val hi: "hi" = "hi"
  inline val ja: "ja" = "ja"
  inline val ko: "ko" = "ko"
  inline val zh: "zh" = "zh"
  inline val `zh-TW`: "zh-TW" = "zh-TW"

  inline def values: js.Array[LanguageCode] = js.Array(en, es, fr, de, it, pt, ar, hi, ja, ko, zh, `zh-TW`)
}

type ModelStatus = "SUBMITTED" | "TRAINING" | "DELETING" | "STOP_REQUESTED" | "STOPPED" | "IN_ERROR" | "TRAINED"
object ModelStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val TRAINING: "TRAINING" = "TRAINING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val IN_ERROR: "IN_ERROR" = "IN_ERROR"
  inline val TRAINED: "TRAINED" = "TRAINED"

  inline def values: js.Array[ModelStatus] = js.Array(SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED)
}

type PartOfSpeechTagType = "ADJ" | "ADP" | "ADV" | "AUX" | "CONJ" | "CCONJ" | "DET" | "INTJ" | "NOUN" | "NUM" | "O" | "PART" | "PRON" | "PROPN" | "PUNCT" | "SCONJ" | "SYM" | "VERB"
object PartOfSpeechTagType {
  inline val ADJ: "ADJ" = "ADJ"
  inline val ADP: "ADP" = "ADP"
  inline val ADV: "ADV" = "ADV"
  inline val AUX: "AUX" = "AUX"
  inline val CONJ: "CONJ" = "CONJ"
  inline val CCONJ: "CCONJ" = "CCONJ"
  inline val DET: "DET" = "DET"
  inline val INTJ: "INTJ" = "INTJ"
  inline val NOUN: "NOUN" = "NOUN"
  inline val NUM: "NUM" = "NUM"
  inline val O: "O" = "O"
  inline val PART: "PART" = "PART"
  inline val PRON: "PRON" = "PRON"
  inline val PROPN: "PROPN" = "PROPN"
  inline val PUNCT: "PUNCT" = "PUNCT"
  inline val SCONJ: "SCONJ" = "SCONJ"
  inline val SYM: "SYM" = "SYM"
  inline val VERB: "VERB" = "VERB"

  inline def values: js.Array[PartOfSpeechTagType] = js.Array(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
}

type PiiEntitiesDetectionMaskMode = "MASK" | "REPLACE_WITH_PII_ENTITY_TYPE"
object PiiEntitiesDetectionMaskMode {
  inline val MASK: "MASK" = "MASK"
  inline val REPLACE_WITH_PII_ENTITY_TYPE: "REPLACE_WITH_PII_ENTITY_TYPE" = "REPLACE_WITH_PII_ENTITY_TYPE"

  inline def values: js.Array[PiiEntitiesDetectionMaskMode] = js.Array(MASK, REPLACE_WITH_PII_ENTITY_TYPE)
}

type PiiEntitiesDetectionMode = "ONLY_REDACTION" | "ONLY_OFFSETS"
object PiiEntitiesDetectionMode {
  inline val ONLY_REDACTION: "ONLY_REDACTION" = "ONLY_REDACTION"
  inline val ONLY_OFFSETS: "ONLY_OFFSETS" = "ONLY_OFFSETS"

  inline def values: js.Array[PiiEntitiesDetectionMode] = js.Array(ONLY_REDACTION, ONLY_OFFSETS)
}

type PiiEntityType = "BANK_ACCOUNT_NUMBER" | "BANK_ROUTING" | "CREDIT_DEBIT_NUMBER" | "CREDIT_DEBIT_CVV" | "CREDIT_DEBIT_EXPIRY" | "PIN" | "EMAIL" | "ADDRESS" | "NAME" | "PHONE" | "SSN" | "DATE_TIME" | "PASSPORT_NUMBER" | "DRIVER_ID" | "URL" | "AGE" | "USERNAME" | "PASSWORD" | "AWS_ACCESS_KEY" | "AWS_SECRET_KEY" | "IP_ADDRESS" | "MAC_ADDRESS" | "ALL"
object PiiEntityType {
  inline val BANK_ACCOUNT_NUMBER: "BANK_ACCOUNT_NUMBER" = "BANK_ACCOUNT_NUMBER"
  inline val BANK_ROUTING: "BANK_ROUTING" = "BANK_ROUTING"
  inline val CREDIT_DEBIT_NUMBER: "CREDIT_DEBIT_NUMBER" = "CREDIT_DEBIT_NUMBER"
  inline val CREDIT_DEBIT_CVV: "CREDIT_DEBIT_CVV" = "CREDIT_DEBIT_CVV"
  inline val CREDIT_DEBIT_EXPIRY: "CREDIT_DEBIT_EXPIRY" = "CREDIT_DEBIT_EXPIRY"
  inline val PIN: "PIN" = "PIN"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val ADDRESS: "ADDRESS" = "ADDRESS"
  inline val NAME: "NAME" = "NAME"
  inline val PHONE: "PHONE" = "PHONE"
  inline val SSN: "SSN" = "SSN"
  inline val DATE_TIME: "DATE_TIME" = "DATE_TIME"
  inline val PASSPORT_NUMBER: "PASSPORT_NUMBER" = "PASSPORT_NUMBER"
  inline val DRIVER_ID: "DRIVER_ID" = "DRIVER_ID"
  inline val URL: "URL" = "URL"
  inline val AGE: "AGE" = "AGE"
  inline val USERNAME: "USERNAME" = "USERNAME"
  inline val PASSWORD: "PASSWORD" = "PASSWORD"
  inline val AWS_ACCESS_KEY: "AWS_ACCESS_KEY" = "AWS_ACCESS_KEY"
  inline val AWS_SECRET_KEY: "AWS_SECRET_KEY" = "AWS_SECRET_KEY"
  inline val IP_ADDRESS: "IP_ADDRESS" = "IP_ADDRESS"
  inline val MAC_ADDRESS: "MAC_ADDRESS" = "MAC_ADDRESS"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[PiiEntityType] = js.Array(
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
  inline val POSITIVE: "POSITIVE" = "POSITIVE"
  inline val NEGATIVE: "NEGATIVE" = "NEGATIVE"
  inline val NEUTRAL: "NEUTRAL" = "NEUTRAL"
  inline val MIXED: "MIXED" = "MIXED"

  inline def values: js.Array[SentimentType] = js.Array(POSITIVE, NEGATIVE, NEUTRAL, MIXED)
}

type SyntaxLanguageCode = "en" | "es" | "fr" | "de" | "it" | "pt"
object SyntaxLanguageCode {
  inline val en: "en" = "en"
  inline val es: "es" = "es"
  inline val fr: "fr" = "fr"
  inline val de: "de" = "de"
  inline val it: "it" = "it"
  inline val pt: "pt" = "pt"

  inline def values: js.Array[SyntaxLanguageCode] = js.Array(en, es, fr, de, it, pt)
}
