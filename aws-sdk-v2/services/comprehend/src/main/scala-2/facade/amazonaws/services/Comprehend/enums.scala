package facade.amazonaws.services.comprehend

import scalajs.js

@js.native
sealed trait AugmentedManifestsDocumentTypeFormat extends js.Any
object AugmentedManifestsDocumentTypeFormat {
  val PLAIN_TEXT_DOCUMENT = "PLAIN_TEXT_DOCUMENT".asInstanceOf[AugmentedManifestsDocumentTypeFormat]
  val SEMI_STRUCTURED_DOCUMENT = "SEMI_STRUCTURED_DOCUMENT".asInstanceOf[AugmentedManifestsDocumentTypeFormat]

  @inline def values: js.Array[AugmentedManifestsDocumentTypeFormat] = js.Array(PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT)
}

@js.native
sealed trait BlockType extends js.Any
object BlockType {
  val LINE = "LINE".asInstanceOf[BlockType]
  val WORD = "WORD".asInstanceOf[BlockType]

  @inline def values: js.Array[BlockType] = js.Array(LINE, WORD)
}

@js.native
sealed trait DocumentClassifierDataFormat extends js.Any
object DocumentClassifierDataFormat {
  val COMPREHEND_CSV = "COMPREHEND_CSV".asInstanceOf[DocumentClassifierDataFormat]
  val AUGMENTED_MANIFEST = "AUGMENTED_MANIFEST".asInstanceOf[DocumentClassifierDataFormat]

  @inline def values: js.Array[DocumentClassifierDataFormat] = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
}

@js.native
sealed trait DocumentClassifierMode extends js.Any
object DocumentClassifierMode {
  val MULTI_CLASS = "MULTI_CLASS".asInstanceOf[DocumentClassifierMode]
  val MULTI_LABEL = "MULTI_LABEL".asInstanceOf[DocumentClassifierMode]

  @inline def values: js.Array[DocumentClassifierMode] = js.Array(MULTI_CLASS, MULTI_LABEL)
}

@js.native
sealed trait DocumentReadAction extends js.Any
object DocumentReadAction {
  val TEXTRACT_DETECT_DOCUMENT_TEXT = "TEXTRACT_DETECT_DOCUMENT_TEXT".asInstanceOf[DocumentReadAction]
  val TEXTRACT_ANALYZE_DOCUMENT = "TEXTRACT_ANALYZE_DOCUMENT".asInstanceOf[DocumentReadAction]

  @inline def values: js.Array[DocumentReadAction] = js.Array(TEXTRACT_DETECT_DOCUMENT_TEXT, TEXTRACT_ANALYZE_DOCUMENT)
}

/** Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must specify one or both of the following values: * <code>TABLES</code> - Returns additional information about any tables that are detected in the input document. * <code>FORMS</code> - Returns additional information about any forms that are detected in the input document.
  */
@js.native
sealed trait DocumentReadFeatureTypes extends js.Any
object DocumentReadFeatureTypes {
  val TABLES = "TABLES".asInstanceOf[DocumentReadFeatureTypes]
  val FORMS = "FORMS".asInstanceOf[DocumentReadFeatureTypes]

  @inline def values: js.Array[DocumentReadFeatureTypes] = js.Array(TABLES, FORMS)
}

@js.native
sealed trait DocumentReadMode extends js.Any
object DocumentReadMode {
  val SERVICE_DEFAULT = "SERVICE_DEFAULT".asInstanceOf[DocumentReadMode]
  val FORCE_DOCUMENT_READ_ACTION = "FORCE_DOCUMENT_READ_ACTION".asInstanceOf[DocumentReadMode]

  @inline def values: js.Array[DocumentReadMode] = js.Array(SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION)
}

@js.native
sealed trait DocumentType extends js.Any
object DocumentType {
  val NATIVE_PDF = "NATIVE_PDF".asInstanceOf[DocumentType]
  val SCANNED_PDF = "SCANNED_PDF".asInstanceOf[DocumentType]
  val MS_WORD = "MS_WORD".asInstanceOf[DocumentType]
  val IMAGE = "IMAGE".asInstanceOf[DocumentType]
  val PLAIN_TEXT = "PLAIN_TEXT".asInstanceOf[DocumentType]
  val TEXTRACT_DETECT_DOCUMENT_TEXT_JSON = "TEXTRACT_DETECT_DOCUMENT_TEXT_JSON".asInstanceOf[DocumentType]
  val TEXTRACT_ANALYZE_DOCUMENT_JSON = "TEXTRACT_ANALYZE_DOCUMENT_JSON".asInstanceOf[DocumentType]

  @inline def values: js.Array[DocumentType] = js.Array(NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE, PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON, TEXTRACT_ANALYZE_DOCUMENT_JSON)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val CREATING = "CREATING".asInstanceOf[EndpointStatus]
  val DELETING = "DELETING".asInstanceOf[EndpointStatus]
  val FAILED = "FAILED".asInstanceOf[EndpointStatus]
  val IN_SERVICE = "IN_SERVICE".asInstanceOf[EndpointStatus]
  val UPDATING = "UPDATING".asInstanceOf[EndpointStatus]

  @inline def values: js.Array[EndpointStatus] = js.Array(CREATING, DELETING, FAILED, IN_SERVICE, UPDATING)
}

@js.native
sealed trait EntityRecognizerDataFormat extends js.Any
object EntityRecognizerDataFormat {
  val COMPREHEND_CSV = "COMPREHEND_CSV".asInstanceOf[EntityRecognizerDataFormat]
  val AUGMENTED_MANIFEST = "AUGMENTED_MANIFEST".asInstanceOf[EntityRecognizerDataFormat]

  @inline def values: js.Array[EntityRecognizerDataFormat] = js.Array(COMPREHEND_CSV, AUGMENTED_MANIFEST)
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

  @inline def values: js.Array[EntityType] = js.Array(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
}

@js.native
sealed trait InputFormat extends js.Any
object InputFormat {
  val ONE_DOC_PER_FILE = "ONE_DOC_PER_FILE".asInstanceOf[InputFormat]
  val ONE_DOC_PER_LINE = "ONE_DOC_PER_LINE".asInstanceOf[InputFormat]

  @inline def values: js.Array[InputFormat] = js.Array(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
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

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
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

  @inline def values: js.Array[LanguageCode] = js.Array(en, es, fr, de, it, pt, ar, hi, ja, ko, zh, `zh-TW`)
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

  @inline def values: js.Array[ModelStatus] = js.Array(SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED)
}

@js.native
sealed trait PageBasedErrorCode extends js.Any
object PageBasedErrorCode {
  val TEXTRACT_BAD_PAGE = "TEXTRACT_BAD_PAGE".asInstanceOf[PageBasedErrorCode]
  val TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED = "TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED".asInstanceOf[PageBasedErrorCode]
  val PAGE_CHARACTERS_EXCEEDED = "PAGE_CHARACTERS_EXCEEDED".asInstanceOf[PageBasedErrorCode]
  val PAGE_SIZE_EXCEEDED = "PAGE_SIZE_EXCEEDED".asInstanceOf[PageBasedErrorCode]
  val INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[PageBasedErrorCode]

  @inline def values: js.Array[PageBasedErrorCode] = js.Array(TEXTRACT_BAD_PAGE, TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED, PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR)
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

  @inline def values: js.Array[PartOfSpeechTagType] = js.Array(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
}

@js.native
sealed trait PiiEntitiesDetectionMaskMode extends js.Any
object PiiEntitiesDetectionMaskMode {
  val MASK = "MASK".asInstanceOf[PiiEntitiesDetectionMaskMode]
  val REPLACE_WITH_PII_ENTITY_TYPE = "REPLACE_WITH_PII_ENTITY_TYPE".asInstanceOf[PiiEntitiesDetectionMaskMode]

  @inline def values: js.Array[PiiEntitiesDetectionMaskMode] = js.Array(MASK, REPLACE_WITH_PII_ENTITY_TYPE)
}

@js.native
sealed trait PiiEntitiesDetectionMode extends js.Any
object PiiEntitiesDetectionMode {
  val ONLY_REDACTION = "ONLY_REDACTION".asInstanceOf[PiiEntitiesDetectionMode]
  val ONLY_OFFSETS = "ONLY_OFFSETS".asInstanceOf[PiiEntitiesDetectionMode]

  @inline def values: js.Array[PiiEntitiesDetectionMode] = js.Array(ONLY_REDACTION, ONLY_OFFSETS)
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
  val LICENSE_PLATE = "LICENSE_PLATE".asInstanceOf[PiiEntityType]
  val VEHICLE_IDENTIFICATION_NUMBER = "VEHICLE_IDENTIFICATION_NUMBER".asInstanceOf[PiiEntityType]
  val UK_NATIONAL_INSURANCE_NUMBER = "UK_NATIONAL_INSURANCE_NUMBER".asInstanceOf[PiiEntityType]
  val CA_SOCIAL_INSURANCE_NUMBER = "CA_SOCIAL_INSURANCE_NUMBER".asInstanceOf[PiiEntityType]
  val US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER = "US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER".asInstanceOf[PiiEntityType]
  val UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER = "UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER".asInstanceOf[PiiEntityType]
  val IN_PERMANENT_ACCOUNT_NUMBER = "IN_PERMANENT_ACCOUNT_NUMBER".asInstanceOf[PiiEntityType]
  val IN_NREGA = "IN_NREGA".asInstanceOf[PiiEntityType]
  val INTERNATIONAL_BANK_ACCOUNT_NUMBER = "INTERNATIONAL_BANK_ACCOUNT_NUMBER".asInstanceOf[PiiEntityType]
  val SWIFT_CODE = "SWIFT_CODE".asInstanceOf[PiiEntityType]
  val UK_NATIONAL_HEALTH_SERVICE_NUMBER = "UK_NATIONAL_HEALTH_SERVICE_NUMBER".asInstanceOf[PiiEntityType]
  val CA_HEALTH_NUMBER = "CA_HEALTH_NUMBER".asInstanceOf[PiiEntityType]
  val IN_AADHAAR = "IN_AADHAAR".asInstanceOf[PiiEntityType]
  val IN_VOTER_NUMBER = "IN_VOTER_NUMBER".asInstanceOf[PiiEntityType]

  @inline def values: js.Array[PiiEntityType] = js.Array(
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
    ALL,
    LICENSE_PLATE,
    VEHICLE_IDENTIFICATION_NUMBER,
    UK_NATIONAL_INSURANCE_NUMBER,
    CA_SOCIAL_INSURANCE_NUMBER,
    US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
    UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER,
    IN_PERMANENT_ACCOUNT_NUMBER,
    IN_NREGA,
    INTERNATIONAL_BANK_ACCOUNT_NUMBER,
    SWIFT_CODE,
    UK_NATIONAL_HEALTH_SERVICE_NUMBER,
    CA_HEALTH_NUMBER,
    IN_AADHAAR,
    IN_VOTER_NUMBER
  )
}

@js.native
sealed trait RelationshipType extends js.Any
object RelationshipType {
  val CHILD = "CHILD".asInstanceOf[RelationshipType]

  @inline def values: js.Array[RelationshipType] = js.Array(CHILD)
}

@js.native
sealed trait SentimentType extends js.Any
object SentimentType {
  val POSITIVE = "POSITIVE".asInstanceOf[SentimentType]
  val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentType]
  val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentType]
  val MIXED = "MIXED".asInstanceOf[SentimentType]

  @inline def values: js.Array[SentimentType] = js.Array(POSITIVE, NEGATIVE, NEUTRAL, MIXED)
}

@js.native
sealed trait Split extends js.Any
object Split {
  val TRAIN = "TRAIN".asInstanceOf[Split]
  val TEST = "TEST".asInstanceOf[Split]

  @inline def values: js.Array[Split] = js.Array(TRAIN, TEST)
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

  @inline def values: js.Array[SyntaxLanguageCode] = js.Array(en, es, fr, de, it, pt)
}

@js.native
sealed trait TargetedSentimentEntityType extends js.Any
object TargetedSentimentEntityType {
  val PERSON = "PERSON".asInstanceOf[TargetedSentimentEntityType]
  val LOCATION = "LOCATION".asInstanceOf[TargetedSentimentEntityType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[TargetedSentimentEntityType]
  val FACILITY = "FACILITY".asInstanceOf[TargetedSentimentEntityType]
  val BRAND = "BRAND".asInstanceOf[TargetedSentimentEntityType]
  val COMMERCIAL_ITEM = "COMMERCIAL_ITEM".asInstanceOf[TargetedSentimentEntityType]
  val MOVIE = "MOVIE".asInstanceOf[TargetedSentimentEntityType]
  val MUSIC = "MUSIC".asInstanceOf[TargetedSentimentEntityType]
  val BOOK = "BOOK".asInstanceOf[TargetedSentimentEntityType]
  val SOFTWARE = "SOFTWARE".asInstanceOf[TargetedSentimentEntityType]
  val GAME = "GAME".asInstanceOf[TargetedSentimentEntityType]
  val PERSONAL_TITLE = "PERSONAL_TITLE".asInstanceOf[TargetedSentimentEntityType]
  val EVENT = "EVENT".asInstanceOf[TargetedSentimentEntityType]
  val DATE = "DATE".asInstanceOf[TargetedSentimentEntityType]
  val QUANTITY = "QUANTITY".asInstanceOf[TargetedSentimentEntityType]
  val ATTRIBUTE = "ATTRIBUTE".asInstanceOf[TargetedSentimentEntityType]
  val OTHER = "OTHER".asInstanceOf[TargetedSentimentEntityType]

  @inline def values: js.Array[TargetedSentimentEntityType] = js.Array(PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND, COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE, EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER)
}
