package facade.amazonaws.services.pinpointsmsvoicev2

import scalajs.js

type AccountAttributeName = "ACCOUNT_TIER"
object AccountAttributeName {
  inline val ACCOUNT_TIER: "ACCOUNT_TIER" = "ACCOUNT_TIER"

  inline def values: js.Array[AccountAttributeName] = js.Array(ACCOUNT_TIER)
}

type AccountLimitName = "PHONE_NUMBERS" | "POOLS" | "CONFIGURATION_SETS" | "OPT_OUT_LISTS"
object AccountLimitName {
  inline val PHONE_NUMBERS: "PHONE_NUMBERS" = "PHONE_NUMBERS"
  inline val POOLS: "POOLS" = "POOLS"
  inline val CONFIGURATION_SETS: "CONFIGURATION_SETS" = "CONFIGURATION_SETS"
  inline val OPT_OUT_LISTS: "OPT_OUT_LISTS" = "OPT_OUT_LISTS"

  inline def values: js.Array[AccountLimitName] = js.Array(PHONE_NUMBERS, POOLS, CONFIGURATION_SETS, OPT_OUT_LISTS)
}

type ConfigurationSetFilterName = "event-destination-name" | "matching-event-types" | "default-message-type" | "default-sender-id"
object ConfigurationSetFilterName {
  inline val `event-destination-name`: "event-destination-name" = "event-destination-name"
  inline val `matching-event-types`: "matching-event-types" = "matching-event-types"
  inline val `default-message-type`: "default-message-type" = "default-message-type"
  inline val `default-sender-id`: "default-sender-id" = "default-sender-id"

  inline def values: js.Array[ConfigurationSetFilterName] = js.Array(`event-destination-name`, `matching-event-types`, `default-message-type`, `default-sender-id`)
}

type DestinationCountryParameterKey = "IN_TEMPLATE_ID" | "IN_ENTITY_ID"
object DestinationCountryParameterKey {
  inline val IN_TEMPLATE_ID: "IN_TEMPLATE_ID" = "IN_TEMPLATE_ID"
  inline val IN_ENTITY_ID: "IN_ENTITY_ID" = "IN_ENTITY_ID"

  inline def values: js.Array[DestinationCountryParameterKey] = js.Array(IN_TEMPLATE_ID, IN_ENTITY_ID)
}

type EventType = "ALL" | "TEXT_ALL" | "TEXT_SENT" | "TEXT_PENDING" | "TEXT_QUEUED" | "TEXT_SUCCESSFUL" | "TEXT_DELIVERED" | "TEXT_INVALID" | "TEXT_INVALID_MESSAGE" | "TEXT_UNREACHABLE" | "TEXT_CARRIER_UNREACHABLE" | "TEXT_BLOCKED" | "TEXT_CARRIER_BLOCKED" | "TEXT_SPAM" | "TEXT_UNKNOWN" | "TEXT_TTL_EXPIRED" | "VOICE_ALL" | "VOICE_INITIATED" | "VOICE_RINGING" | "VOICE_ANSWERED" | "VOICE_COMPLETED" | "VOICE_BUSY" | "VOICE_NO_ANSWER" | "VOICE_FAILED" | "VOICE_TTL_EXPIRED"
object EventType {
  inline val ALL: "ALL" = "ALL"
  inline val TEXT_ALL: "TEXT_ALL" = "TEXT_ALL"
  inline val TEXT_SENT: "TEXT_SENT" = "TEXT_SENT"
  inline val TEXT_PENDING: "TEXT_PENDING" = "TEXT_PENDING"
  inline val TEXT_QUEUED: "TEXT_QUEUED" = "TEXT_QUEUED"
  inline val TEXT_SUCCESSFUL: "TEXT_SUCCESSFUL" = "TEXT_SUCCESSFUL"
  inline val TEXT_DELIVERED: "TEXT_DELIVERED" = "TEXT_DELIVERED"
  inline val TEXT_INVALID: "TEXT_INVALID" = "TEXT_INVALID"
  inline val TEXT_INVALID_MESSAGE: "TEXT_INVALID_MESSAGE" = "TEXT_INVALID_MESSAGE"
  inline val TEXT_UNREACHABLE: "TEXT_UNREACHABLE" = "TEXT_UNREACHABLE"
  inline val TEXT_CARRIER_UNREACHABLE: "TEXT_CARRIER_UNREACHABLE" = "TEXT_CARRIER_UNREACHABLE"
  inline val TEXT_BLOCKED: "TEXT_BLOCKED" = "TEXT_BLOCKED"
  inline val TEXT_CARRIER_BLOCKED: "TEXT_CARRIER_BLOCKED" = "TEXT_CARRIER_BLOCKED"
  inline val TEXT_SPAM: "TEXT_SPAM" = "TEXT_SPAM"
  inline val TEXT_UNKNOWN: "TEXT_UNKNOWN" = "TEXT_UNKNOWN"
  inline val TEXT_TTL_EXPIRED: "TEXT_TTL_EXPIRED" = "TEXT_TTL_EXPIRED"
  inline val VOICE_ALL: "VOICE_ALL" = "VOICE_ALL"
  inline val VOICE_INITIATED: "VOICE_INITIATED" = "VOICE_INITIATED"
  inline val VOICE_RINGING: "VOICE_RINGING" = "VOICE_RINGING"
  inline val VOICE_ANSWERED: "VOICE_ANSWERED" = "VOICE_ANSWERED"
  inline val VOICE_COMPLETED: "VOICE_COMPLETED" = "VOICE_COMPLETED"
  inline val VOICE_BUSY: "VOICE_BUSY" = "VOICE_BUSY"
  inline val VOICE_NO_ANSWER: "VOICE_NO_ANSWER" = "VOICE_NO_ANSWER"
  inline val VOICE_FAILED: "VOICE_FAILED" = "VOICE_FAILED"
  inline val VOICE_TTL_EXPIRED: "VOICE_TTL_EXPIRED" = "VOICE_TTL_EXPIRED"

  inline def values: js.Array[EventType] = js.Array(
    ALL,
    TEXT_ALL,
    TEXT_SENT,
    TEXT_PENDING,
    TEXT_QUEUED,
    TEXT_SUCCESSFUL,
    TEXT_DELIVERED,
    TEXT_INVALID,
    TEXT_INVALID_MESSAGE,
    TEXT_UNREACHABLE,
    TEXT_CARRIER_UNREACHABLE,
    TEXT_BLOCKED,
    TEXT_CARRIER_BLOCKED,
    TEXT_SPAM,
    TEXT_UNKNOWN,
    TEXT_TTL_EXPIRED,
    VOICE_ALL,
    VOICE_INITIATED,
    VOICE_RINGING,
    VOICE_ANSWERED,
    VOICE_COMPLETED,
    VOICE_BUSY,
    VOICE_NO_ANSWER,
    VOICE_FAILED,
    VOICE_TTL_EXPIRED
  )
}

type KeywordAction = "AUTOMATIC_RESPONSE" | "OPT_OUT" | "OPT_IN"
object KeywordAction {
  inline val AUTOMATIC_RESPONSE: "AUTOMATIC_RESPONSE" = "AUTOMATIC_RESPONSE"
  inline val OPT_OUT: "OPT_OUT" = "OPT_OUT"
  inline val OPT_IN: "OPT_IN" = "OPT_IN"

  inline def values: js.Array[KeywordAction] = js.Array(AUTOMATIC_RESPONSE, OPT_OUT, OPT_IN)
}

type KeywordFilterName = "keyword-action"
object KeywordFilterName {
  inline val `keyword-action`: "keyword-action" = "keyword-action"

  inline def values: js.Array[KeywordFilterName] = js.Array(`keyword-action`)
}

type MessageType = "TRANSACTIONAL" | "PROMOTIONAL"
object MessageType {
  inline val TRANSACTIONAL: "TRANSACTIONAL" = "TRANSACTIONAL"
  inline val PROMOTIONAL: "PROMOTIONAL" = "PROMOTIONAL"

  inline def values: js.Array[MessageType] = js.Array(TRANSACTIONAL, PROMOTIONAL)
}

type NumberCapability = "SMS" | "VOICE"
object NumberCapability {
  inline val SMS: "SMS" = "SMS"
  inline val VOICE: "VOICE" = "VOICE"

  inline def values: js.Array[NumberCapability] = js.Array(SMS, VOICE)
}

type NumberStatus = "PENDING" | "ACTIVE" | "ASSOCIATING" | "DISASSOCIATING" | "DELETED"
object NumberStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ASSOCIATING: "ASSOCIATING" = "ASSOCIATING"
  inline val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[NumberStatus] = js.Array(PENDING, ACTIVE, ASSOCIATING, DISASSOCIATING, DELETED)
}

type NumberType = "SHORT_CODE" | "LONG_CODE" | "TOLL_FREE" | "TEN_DLC"
object NumberType {
  inline val SHORT_CODE: "SHORT_CODE" = "SHORT_CODE"
  inline val LONG_CODE: "LONG_CODE" = "LONG_CODE"
  inline val TOLL_FREE: "TOLL_FREE" = "TOLL_FREE"
  inline val TEN_DLC: "TEN_DLC" = "TEN_DLC"

  inline def values: js.Array[NumberType] = js.Array(SHORT_CODE, LONG_CODE, TOLL_FREE, TEN_DLC)
}

type OptedOutFilterName = "end-user-opted-out"
object OptedOutFilterName {
  inline val `end-user-opted-out`: "end-user-opted-out" = "end-user-opted-out"

  inline def values: js.Array[OptedOutFilterName] = js.Array(`end-user-opted-out`)
}

type PhoneNumberFilterName = "status" | "iso-country-code" | "message-type" | "number-capability" | "number-type" | "two-way-enabled" | "self-managed-opt-outs-enabled" | "opt-out-list-name" | "deletion-protection-enabled"
object PhoneNumberFilterName {
  inline val status: "status" = "status"
  inline val `iso-country-code`: "iso-country-code" = "iso-country-code"
  inline val `message-type`: "message-type" = "message-type"
  inline val `number-capability`: "number-capability" = "number-capability"
  inline val `number-type`: "number-type" = "number-type"
  inline val `two-way-enabled`: "two-way-enabled" = "two-way-enabled"
  inline val `self-managed-opt-outs-enabled`: "self-managed-opt-outs-enabled" = "self-managed-opt-outs-enabled"
  inline val `opt-out-list-name`: "opt-out-list-name" = "opt-out-list-name"
  inline val `deletion-protection-enabled`: "deletion-protection-enabled" = "deletion-protection-enabled"

  inline def values: js.Array[PhoneNumberFilterName] = js.Array(
    status,
    `iso-country-code`,
    `message-type`,
    `number-capability`,
    `number-type`,
    `two-way-enabled`,
    `self-managed-opt-outs-enabled`,
    `opt-out-list-name`,
    `deletion-protection-enabled`
  )
}

type PoolFilterName = "status" | "message-type" | "two-way-enabled" | "self-managed-opt-outs-enabled" | "opt-out-list-name" | "shared-routes-enabled" | "deletion-protection-enabled"
object PoolFilterName {
  inline val status: "status" = "status"
  inline val `message-type`: "message-type" = "message-type"
  inline val `two-way-enabled`: "two-way-enabled" = "two-way-enabled"
  inline val `self-managed-opt-outs-enabled`: "self-managed-opt-outs-enabled" = "self-managed-opt-outs-enabled"
  inline val `opt-out-list-name`: "opt-out-list-name" = "opt-out-list-name"
  inline val `shared-routes-enabled`: "shared-routes-enabled" = "shared-routes-enabled"
  inline val `deletion-protection-enabled`: "deletion-protection-enabled" = "deletion-protection-enabled"

  inline def values: js.Array[PoolFilterName] = js.Array(status, `message-type`, `two-way-enabled`, `self-managed-opt-outs-enabled`, `opt-out-list-name`, `shared-routes-enabled`, `deletion-protection-enabled`)
}

type PoolOriginationIdentitiesFilterName = "iso-country-code" | "number-capability"
object PoolOriginationIdentitiesFilterName {
  inline val `iso-country-code`: "iso-country-code" = "iso-country-code"
  inline val `number-capability`: "number-capability" = "number-capability"

  inline def values: js.Array[PoolOriginationIdentitiesFilterName] = js.Array(`iso-country-code`, `number-capability`)
}

type PoolStatus = "CREATING" | "ACTIVE" | "DELETING"
object PoolStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[PoolStatus] = js.Array(CREATING, ACTIVE, DELETING)
}

type RequestableNumberType = "LONG_CODE" | "TOLL_FREE" | "TEN_DLC"
object RequestableNumberType {
  inline val LONG_CODE: "LONG_CODE" = "LONG_CODE"
  inline val TOLL_FREE: "TOLL_FREE" = "TOLL_FREE"
  inline val TEN_DLC: "TEN_DLC" = "TEN_DLC"

  inline def values: js.Array[RequestableNumberType] = js.Array(LONG_CODE, TOLL_FREE, TEN_DLC)
}

type SenderIdFilterName = "sender-id" | "iso-country-code" | "message-type"
object SenderIdFilterName {
  inline val `sender-id`: "sender-id" = "sender-id"
  inline val `iso-country-code`: "iso-country-code" = "iso-country-code"
  inline val `message-type`: "message-type" = "message-type"

  inline def values: js.Array[SenderIdFilterName] = js.Array(`sender-id`, `iso-country-code`, `message-type`)
}

type SpendLimitName = "TEXT_MESSAGE_MONTHLY_SPEND_LIMIT" | "VOICE_MESSAGE_MONTHLY_SPEND_LIMIT"
object SpendLimitName {
  inline val TEXT_MESSAGE_MONTHLY_SPEND_LIMIT: "TEXT_MESSAGE_MONTHLY_SPEND_LIMIT" = "TEXT_MESSAGE_MONTHLY_SPEND_LIMIT"
  inline val VOICE_MESSAGE_MONTHLY_SPEND_LIMIT: "VOICE_MESSAGE_MONTHLY_SPEND_LIMIT" = "VOICE_MESSAGE_MONTHLY_SPEND_LIMIT"

  inline def values: js.Array[SpendLimitName] = js.Array(TEXT_MESSAGE_MONTHLY_SPEND_LIMIT, VOICE_MESSAGE_MONTHLY_SPEND_LIMIT)
}

type VoiceId = "AMY" | "ASTRID" | "BIANCA" | "BRIAN" | "CAMILA" | "CARLA" | "CARMEN" | "CELINE" | "CHANTAL" | "CONCHITA" | "CRISTIANO" | "DORA" | "EMMA" | "ENRIQUE" | "EWA" | "FILIZ" | "GERAINT" | "GIORGIO" | "GWYNETH" | "HANS" | "INES" | "IVY" | "JACEK" | "JAN" | "JOANNA" | "JOEY" | "JUSTIN" | "KARL" | "KENDRA" | "KIMBERLY" | "LEA" | "LIV" | "LOTTE" | "LUCIA" | "LUPE" | "MADS" | "MAJA" | "MARLENE" | "MATHIEU" | "MATTHEW" | "MAXIM" | "MIA" | "MIGUEL" | "MIZUKI" | "NAJA" | "NICOLE" | "PENELOPE" | "RAVEENA" | "RICARDO" | "RUBEN" | "RUSSELL" | "SALLI" | "SEOYEON" | "TAKUMI" | "TATYANA" | "VICKI" | "VITORIA" | "ZEINA" | "ZHIYU"
object VoiceId {
  inline val AMY: "AMY" = "AMY"
  inline val ASTRID: "ASTRID" = "ASTRID"
  inline val BIANCA: "BIANCA" = "BIANCA"
  inline val BRIAN: "BRIAN" = "BRIAN"
  inline val CAMILA: "CAMILA" = "CAMILA"
  inline val CARLA: "CARLA" = "CARLA"
  inline val CARMEN: "CARMEN" = "CARMEN"
  inline val CELINE: "CELINE" = "CELINE"
  inline val CHANTAL: "CHANTAL" = "CHANTAL"
  inline val CONCHITA: "CONCHITA" = "CONCHITA"
  inline val CRISTIANO: "CRISTIANO" = "CRISTIANO"
  inline val DORA: "DORA" = "DORA"
  inline val EMMA: "EMMA" = "EMMA"
  inline val ENRIQUE: "ENRIQUE" = "ENRIQUE"
  inline val EWA: "EWA" = "EWA"
  inline val FILIZ: "FILIZ" = "FILIZ"
  inline val GERAINT: "GERAINT" = "GERAINT"
  inline val GIORGIO: "GIORGIO" = "GIORGIO"
  inline val GWYNETH: "GWYNETH" = "GWYNETH"
  inline val HANS: "HANS" = "HANS"
  inline val INES: "INES" = "INES"
  inline val IVY: "IVY" = "IVY"
  inline val JACEK: "JACEK" = "JACEK"
  inline val JAN: "JAN" = "JAN"
  inline val JOANNA: "JOANNA" = "JOANNA"
  inline val JOEY: "JOEY" = "JOEY"
  inline val JUSTIN: "JUSTIN" = "JUSTIN"
  inline val KARL: "KARL" = "KARL"
  inline val KENDRA: "KENDRA" = "KENDRA"
  inline val KIMBERLY: "KIMBERLY" = "KIMBERLY"
  inline val LEA: "LEA" = "LEA"
  inline val LIV: "LIV" = "LIV"
  inline val LOTTE: "LOTTE" = "LOTTE"
  inline val LUCIA: "LUCIA" = "LUCIA"
  inline val LUPE: "LUPE" = "LUPE"
  inline val MADS: "MADS" = "MADS"
  inline val MAJA: "MAJA" = "MAJA"
  inline val MARLENE: "MARLENE" = "MARLENE"
  inline val MATHIEU: "MATHIEU" = "MATHIEU"
  inline val MATTHEW: "MATTHEW" = "MATTHEW"
  inline val MAXIM: "MAXIM" = "MAXIM"
  inline val MIA: "MIA" = "MIA"
  inline val MIGUEL: "MIGUEL" = "MIGUEL"
  inline val MIZUKI: "MIZUKI" = "MIZUKI"
  inline val NAJA: "NAJA" = "NAJA"
  inline val NICOLE: "NICOLE" = "NICOLE"
  inline val PENELOPE: "PENELOPE" = "PENELOPE"
  inline val RAVEENA: "RAVEENA" = "RAVEENA"
  inline val RICARDO: "RICARDO" = "RICARDO"
  inline val RUBEN: "RUBEN" = "RUBEN"
  inline val RUSSELL: "RUSSELL" = "RUSSELL"
  inline val SALLI: "SALLI" = "SALLI"
  inline val SEOYEON: "SEOYEON" = "SEOYEON"
  inline val TAKUMI: "TAKUMI" = "TAKUMI"
  inline val TATYANA: "TATYANA" = "TATYANA"
  inline val VICKI: "VICKI" = "VICKI"
  inline val VITORIA: "VITORIA" = "VITORIA"
  inline val ZEINA: "ZEINA" = "ZEINA"
  inline val ZHIYU: "ZHIYU" = "ZHIYU"

  inline def values: js.Array[VoiceId] = js.Array(
    AMY,
    ASTRID,
    BIANCA,
    BRIAN,
    CAMILA,
    CARLA,
    CARMEN,
    CELINE,
    CHANTAL,
    CONCHITA,
    CRISTIANO,
    DORA,
    EMMA,
    ENRIQUE,
    EWA,
    FILIZ,
    GERAINT,
    GIORGIO,
    GWYNETH,
    HANS,
    INES,
    IVY,
    JACEK,
    JAN,
    JOANNA,
    JOEY,
    JUSTIN,
    KARL,
    KENDRA,
    KIMBERLY,
    LEA,
    LIV,
    LOTTE,
    LUCIA,
    LUPE,
    MADS,
    MAJA,
    MARLENE,
    MATHIEU,
    MATTHEW,
    MAXIM,
    MIA,
    MIGUEL,
    MIZUKI,
    NAJA,
    NICOLE,
    PENELOPE,
    RAVEENA,
    RICARDO,
    RUBEN,
    RUSSELL,
    SALLI,
    SEOYEON,
    TAKUMI,
    TATYANA,
    VICKI,
    VITORIA,
    ZEINA,
    ZHIYU
  )
}

type VoiceMessageBodyTextType = "TEXT" | "SSML"
object VoiceMessageBodyTextType {
  inline val TEXT: "TEXT" = "TEXT"
  inline val SSML: "SSML" = "SSML"

  inline def values: js.Array[VoiceMessageBodyTextType] = js.Array(TEXT, SSML)
}
