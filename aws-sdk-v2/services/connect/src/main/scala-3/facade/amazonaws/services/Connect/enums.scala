package facade.amazonaws.services.connect

import scalajs.js

type AgentStatusState = "ENABLED" | "DISABLED"
object AgentStatusState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AgentStatusState] = js.Array(ENABLED, DISABLED)
}

type AgentStatusType = "ROUTABLE" | "CUSTOM" | "OFFLINE"
object AgentStatusType {
  inline val ROUTABLE: "ROUTABLE" = "ROUTABLE"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"

  inline def values: js.Array[AgentStatusType] = js.Array(ROUTABLE, CUSTOM, OFFLINE)
}

type Channel = "VOICE" | "CHAT" | "TASK"
object Channel {
  inline val VOICE: "VOICE" = "VOICE"
  inline val CHAT: "CHAT" = "CHAT"
  inline val TASK: "TASK" = "TASK"

  inline def values: js.Array[Channel] = js.Array(VOICE, CHAT, TASK)
}

type Comparison = "LT"
object Comparison {
  inline val LT: "LT" = "LT"

  inline def values: js.Array[Comparison] = js.Array(LT)
}

type ContactFlowModuleState = "ACTIVE" | "ARCHIVED"
object ContactFlowModuleState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  inline def values: js.Array[ContactFlowModuleState] = js.Array(ACTIVE, ARCHIVED)
}

type ContactFlowModuleStatus = "PUBLISHED" | "SAVED"
object ContactFlowModuleStatus {
  inline val PUBLISHED: "PUBLISHED" = "PUBLISHED"
  inline val SAVED: "SAVED" = "SAVED"

  inline def values: js.Array[ContactFlowModuleStatus] = js.Array(PUBLISHED, SAVED)
}

type ContactFlowState = "ACTIVE" | "ARCHIVED"
object ContactFlowState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  inline def values: js.Array[ContactFlowState] = js.Array(ACTIVE, ARCHIVED)
}

type ContactFlowType = "CONTACT_FLOW" | "CUSTOMER_QUEUE" | "CUSTOMER_HOLD" | "CUSTOMER_WHISPER" | "AGENT_HOLD" | "AGENT_WHISPER" | "OUTBOUND_WHISPER" | "AGENT_TRANSFER" | "QUEUE_TRANSFER"
object ContactFlowType {
  inline val CONTACT_FLOW: "CONTACT_FLOW" = "CONTACT_FLOW"
  inline val CUSTOMER_QUEUE: "CUSTOMER_QUEUE" = "CUSTOMER_QUEUE"
  inline val CUSTOMER_HOLD: "CUSTOMER_HOLD" = "CUSTOMER_HOLD"
  inline val CUSTOMER_WHISPER: "CUSTOMER_WHISPER" = "CUSTOMER_WHISPER"
  inline val AGENT_HOLD: "AGENT_HOLD" = "AGENT_HOLD"
  inline val AGENT_WHISPER: "AGENT_WHISPER" = "AGENT_WHISPER"
  inline val OUTBOUND_WHISPER: "OUTBOUND_WHISPER" = "OUTBOUND_WHISPER"
  inline val AGENT_TRANSFER: "AGENT_TRANSFER" = "AGENT_TRANSFER"
  inline val QUEUE_TRANSFER: "QUEUE_TRANSFER" = "QUEUE_TRANSFER"

  inline def values: js.Array[ContactFlowType] = js.Array(CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD, CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER, AGENT_TRANSFER, QUEUE_TRANSFER)
}

type ContactInitiationMethod = "INBOUND" | "OUTBOUND" | "TRANSFER" | "QUEUE_TRANSFER" | "CALLBACK" | "API"
object ContactInitiationMethod {
  inline val INBOUND: "INBOUND" = "INBOUND"
  inline val OUTBOUND: "OUTBOUND" = "OUTBOUND"
  inline val TRANSFER: "TRANSFER" = "TRANSFER"
  inline val QUEUE_TRANSFER: "QUEUE_TRANSFER" = "QUEUE_TRANSFER"
  inline val CALLBACK: "CALLBACK" = "CALLBACK"
  inline val API: "API" = "API"

  inline def values: js.Array[ContactInitiationMethod] = js.Array(INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER, CALLBACK, API)
}

/** The current metric names.
  */
type CurrentMetricName = "AGENTS_ONLINE" | "AGENTS_AVAILABLE" | "AGENTS_ON_CALL" | "AGENTS_NON_PRODUCTIVE" | "AGENTS_AFTER_CONTACT_WORK" | "AGENTS_ERROR" | "AGENTS_STAFFED" | "CONTACTS_IN_QUEUE" | "OLDEST_CONTACT_AGE" | "CONTACTS_SCHEDULED" | "AGENTS_ON_CONTACT" | "SLOTS_ACTIVE" | "SLOTS_AVAILABLE"
object CurrentMetricName {
  inline val AGENTS_ONLINE: "AGENTS_ONLINE" = "AGENTS_ONLINE"
  inline val AGENTS_AVAILABLE: "AGENTS_AVAILABLE" = "AGENTS_AVAILABLE"
  inline val AGENTS_ON_CALL: "AGENTS_ON_CALL" = "AGENTS_ON_CALL"
  inline val AGENTS_NON_PRODUCTIVE: "AGENTS_NON_PRODUCTIVE" = "AGENTS_NON_PRODUCTIVE"
  inline val AGENTS_AFTER_CONTACT_WORK: "AGENTS_AFTER_CONTACT_WORK" = "AGENTS_AFTER_CONTACT_WORK"
  inline val AGENTS_ERROR: "AGENTS_ERROR" = "AGENTS_ERROR"
  inline val AGENTS_STAFFED: "AGENTS_STAFFED" = "AGENTS_STAFFED"
  inline val CONTACTS_IN_QUEUE: "CONTACTS_IN_QUEUE" = "CONTACTS_IN_QUEUE"
  inline val OLDEST_CONTACT_AGE: "OLDEST_CONTACT_AGE" = "OLDEST_CONTACT_AGE"
  inline val CONTACTS_SCHEDULED: "CONTACTS_SCHEDULED" = "CONTACTS_SCHEDULED"
  inline val AGENTS_ON_CONTACT: "AGENTS_ON_CONTACT" = "AGENTS_ON_CONTACT"
  inline val SLOTS_ACTIVE: "SLOTS_ACTIVE" = "SLOTS_ACTIVE"
  inline val SLOTS_AVAILABLE: "SLOTS_AVAILABLE" = "SLOTS_AVAILABLE"

  inline def values: js.Array[CurrentMetricName] = js.Array(
    AGENTS_ONLINE,
    AGENTS_AVAILABLE,
    AGENTS_ON_CALL,
    AGENTS_NON_PRODUCTIVE,
    AGENTS_AFTER_CONTACT_WORK,
    AGENTS_ERROR,
    AGENTS_STAFFED,
    CONTACTS_IN_QUEUE,
    OLDEST_CONTACT_AGE,
    CONTACTS_SCHEDULED,
    AGENTS_ON_CONTACT,
    SLOTS_ACTIVE,
    SLOTS_AVAILABLE
  )
}

type DirectoryType = "SAML" | "CONNECT_MANAGED" | "EXISTING_DIRECTORY"
object DirectoryType {
  inline val SAML: "SAML" = "SAML"
  inline val CONNECT_MANAGED: "CONNECT_MANAGED" = "CONNECT_MANAGED"
  inline val EXISTING_DIRECTORY: "EXISTING_DIRECTORY" = "EXISTING_DIRECTORY"

  inline def values: js.Array[DirectoryType] = js.Array(SAML, CONNECT_MANAGED, EXISTING_DIRECTORY)
}

type EncryptionType = "KMS"
object EncryptionType {
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionType] = js.Array(KMS)
}

type Grouping = "QUEUE" | "CHANNEL"
object Grouping {
  inline val QUEUE: "QUEUE" = "QUEUE"
  inline val CHANNEL: "CHANNEL" = "CHANNEL"

  inline def values: js.Array[Grouping] = js.Array(QUEUE, CHANNEL)
}

/** The historical metric names.
  */
type HistoricalMetricName = "CONTACTS_QUEUED" | "CONTACTS_HANDLED" | "CONTACTS_ABANDONED" | "CONTACTS_CONSULTED" | "CONTACTS_AGENT_HUNG_UP_FIRST" | "CONTACTS_HANDLED_INCOMING" | "CONTACTS_HANDLED_OUTBOUND" | "CONTACTS_HOLD_ABANDONS" | "CONTACTS_TRANSFERRED_IN" | "CONTACTS_TRANSFERRED_OUT" | "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" | "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" | "CONTACTS_MISSED" | "CALLBACK_CONTACTS_HANDLED" | "API_CONTACTS_HANDLED" | "OCCUPANCY" | "HANDLE_TIME" | "AFTER_CONTACT_WORK_TIME" | "QUEUED_TIME" | "ABANDON_TIME" | "QUEUE_ANSWER_TIME" | "HOLD_TIME" | "INTERACTION_TIME" | "INTERACTION_AND_HOLD_TIME" | "SERVICE_LEVEL"
object HistoricalMetricName {
  inline val CONTACTS_QUEUED: "CONTACTS_QUEUED" = "CONTACTS_QUEUED"
  inline val CONTACTS_HANDLED: "CONTACTS_HANDLED" = "CONTACTS_HANDLED"
  inline val CONTACTS_ABANDONED: "CONTACTS_ABANDONED" = "CONTACTS_ABANDONED"
  inline val CONTACTS_CONSULTED: "CONTACTS_CONSULTED" = "CONTACTS_CONSULTED"
  inline val CONTACTS_AGENT_HUNG_UP_FIRST: "CONTACTS_AGENT_HUNG_UP_FIRST" = "CONTACTS_AGENT_HUNG_UP_FIRST"
  inline val CONTACTS_HANDLED_INCOMING: "CONTACTS_HANDLED_INCOMING" = "CONTACTS_HANDLED_INCOMING"
  inline val CONTACTS_HANDLED_OUTBOUND: "CONTACTS_HANDLED_OUTBOUND" = "CONTACTS_HANDLED_OUTBOUND"
  inline val CONTACTS_HOLD_ABANDONS: "CONTACTS_HOLD_ABANDONS" = "CONTACTS_HOLD_ABANDONS"
  inline val CONTACTS_TRANSFERRED_IN: "CONTACTS_TRANSFERRED_IN" = "CONTACTS_TRANSFERRED_IN"
  inline val CONTACTS_TRANSFERRED_OUT: "CONTACTS_TRANSFERRED_OUT" = "CONTACTS_TRANSFERRED_OUT"
  inline val CONTACTS_TRANSFERRED_IN_FROM_QUEUE: "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE"
  inline val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE: "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"
  inline val CONTACTS_MISSED: "CONTACTS_MISSED" = "CONTACTS_MISSED"
  inline val CALLBACK_CONTACTS_HANDLED: "CALLBACK_CONTACTS_HANDLED" = "CALLBACK_CONTACTS_HANDLED"
  inline val API_CONTACTS_HANDLED: "API_CONTACTS_HANDLED" = "API_CONTACTS_HANDLED"
  inline val OCCUPANCY: "OCCUPANCY" = "OCCUPANCY"
  inline val HANDLE_TIME: "HANDLE_TIME" = "HANDLE_TIME"
  inline val AFTER_CONTACT_WORK_TIME: "AFTER_CONTACT_WORK_TIME" = "AFTER_CONTACT_WORK_TIME"
  inline val QUEUED_TIME: "QUEUED_TIME" = "QUEUED_TIME"
  inline val ABANDON_TIME: "ABANDON_TIME" = "ABANDON_TIME"
  inline val QUEUE_ANSWER_TIME: "QUEUE_ANSWER_TIME" = "QUEUE_ANSWER_TIME"
  inline val HOLD_TIME: "HOLD_TIME" = "HOLD_TIME"
  inline val INTERACTION_TIME: "INTERACTION_TIME" = "INTERACTION_TIME"
  inline val INTERACTION_AND_HOLD_TIME: "INTERACTION_AND_HOLD_TIME" = "INTERACTION_AND_HOLD_TIME"
  inline val SERVICE_LEVEL: "SERVICE_LEVEL" = "SERVICE_LEVEL"

  inline def values: js.Array[HistoricalMetricName] = js.Array(
    CONTACTS_QUEUED,
    CONTACTS_HANDLED,
    CONTACTS_ABANDONED,
    CONTACTS_CONSULTED,
    CONTACTS_AGENT_HUNG_UP_FIRST,
    CONTACTS_HANDLED_INCOMING,
    CONTACTS_HANDLED_OUTBOUND,
    CONTACTS_HOLD_ABANDONS,
    CONTACTS_TRANSFERRED_IN,
    CONTACTS_TRANSFERRED_OUT,
    CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
    CONTACTS_TRANSFERRED_OUT_FROM_QUEUE,
    CONTACTS_MISSED,
    CALLBACK_CONTACTS_HANDLED,
    API_CONTACTS_HANDLED,
    OCCUPANCY,
    HANDLE_TIME,
    AFTER_CONTACT_WORK_TIME,
    QUEUED_TIME,
    ABANDON_TIME,
    QUEUE_ANSWER_TIME,
    HOLD_TIME,
    INTERACTION_TIME,
    INTERACTION_AND_HOLD_TIME,
    SERVICE_LEVEL
  )
}

type HoursOfOperationDays = "SUNDAY" | "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY"
object HoursOfOperationDays {
  inline val SUNDAY: "SUNDAY" = "SUNDAY"
  inline val MONDAY: "MONDAY" = "MONDAY"
  inline val TUESDAY: "TUESDAY" = "TUESDAY"
  inline val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  inline val THURSDAY: "THURSDAY" = "THURSDAY"
  inline val FRIDAY: "FRIDAY" = "FRIDAY"
  inline val SATURDAY: "SATURDAY" = "SATURDAY"

  inline def values: js.Array[HoursOfOperationDays] = js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
}

type InstanceAttributeType = "INBOUND_CALLS" | "OUTBOUND_CALLS" | "CONTACTFLOW_LOGS" | "CONTACT_LENS" | "AUTO_RESOLVE_BEST_VOICES" | "USE_CUSTOM_TTS_VOICES" | "EARLY_MEDIA"
object InstanceAttributeType {
  inline val INBOUND_CALLS: "INBOUND_CALLS" = "INBOUND_CALLS"
  inline val OUTBOUND_CALLS: "OUTBOUND_CALLS" = "OUTBOUND_CALLS"
  inline val CONTACTFLOW_LOGS: "CONTACTFLOW_LOGS" = "CONTACTFLOW_LOGS"
  inline val CONTACT_LENS: "CONTACT_LENS" = "CONTACT_LENS"
  inline val AUTO_RESOLVE_BEST_VOICES: "AUTO_RESOLVE_BEST_VOICES" = "AUTO_RESOLVE_BEST_VOICES"
  inline val USE_CUSTOM_TTS_VOICES: "USE_CUSTOM_TTS_VOICES" = "USE_CUSTOM_TTS_VOICES"
  inline val EARLY_MEDIA: "EARLY_MEDIA" = "EARLY_MEDIA"

  inline def values: js.Array[InstanceAttributeType] = js.Array(INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS, CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES, EARLY_MEDIA)
}

type InstanceStatus = "CREATION_IN_PROGRESS" | "ACTIVE" | "CREATION_FAILED"
object InstanceStatus {
  inline val CREATION_IN_PROGRESS: "CREATION_IN_PROGRESS" = "CREATION_IN_PROGRESS"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  inline def values: js.Array[InstanceStatus] = js.Array(CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED)
}

type InstanceStorageResourceType = "CHAT_TRANSCRIPTS" | "CALL_RECORDINGS" | "SCHEDULED_REPORTS" | "MEDIA_STREAMS" | "CONTACT_TRACE_RECORDS" | "AGENT_EVENTS"
object InstanceStorageResourceType {
  inline val CHAT_TRANSCRIPTS: "CHAT_TRANSCRIPTS" = "CHAT_TRANSCRIPTS"
  inline val CALL_RECORDINGS: "CALL_RECORDINGS" = "CALL_RECORDINGS"
  inline val SCHEDULED_REPORTS: "SCHEDULED_REPORTS" = "SCHEDULED_REPORTS"
  inline val MEDIA_STREAMS: "MEDIA_STREAMS" = "MEDIA_STREAMS"
  inline val CONTACT_TRACE_RECORDS: "CONTACT_TRACE_RECORDS" = "CONTACT_TRACE_RECORDS"
  inline val AGENT_EVENTS: "AGENT_EVENTS" = "AGENT_EVENTS"

  inline def values: js.Array[InstanceStorageResourceType] = js.Array(CHAT_TRANSCRIPTS, CALL_RECORDINGS, SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS)
}

type IntegrationType = "EVENT" | "VOICE_ID" | "PINPOINT_APP" | "WISDOM_ASSISTANT" | "WISDOM_KNOWLEDGE_BASE"
object IntegrationType {
  inline val EVENT: "EVENT" = "EVENT"
  inline val VOICE_ID: "VOICE_ID" = "VOICE_ID"
  inline val PINPOINT_APP: "PINPOINT_APP" = "PINPOINT_APP"
  inline val WISDOM_ASSISTANT: "WISDOM_ASSISTANT" = "WISDOM_ASSISTANT"
  inline val WISDOM_KNOWLEDGE_BASE: "WISDOM_KNOWLEDGE_BASE" = "WISDOM_KNOWLEDGE_BASE"

  inline def values: js.Array[IntegrationType] = js.Array(EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT, WISDOM_KNOWLEDGE_BASE)
}

type LexVersion = "V1" | "V2"
object LexVersion {
  inline val V1: "V1" = "V1"
  inline val V2: "V2" = "V2"

  inline def values: js.Array[LexVersion] = js.Array(V1, V2)
}

type PhoneNumberCountryCode = "AF" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BA" | "BW" | "BR" | "IO" | "VG" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CK" | "CR" | "HR" | "CU" | "CW" | "CY" | "CZ" | "CD" | "DK" | "DJ" | "DM" | "DO" | "TL" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "PF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "CI" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" |
  "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "AN" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "KP" | "MP" | "NO" | "OM" | "PK" | "PW" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "CG" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "KR" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "VI" | "UG" | "UA" | "AE" | "GB" | "US" | "UY" | "UZ" | "VU" | "VA" | "VE" | "VN" | "WF" | "EH" | "YE" | "ZM" | "ZW"
object PhoneNumberCountryCode {
  inline val AF: "AF" = "AF"
  inline val AL: "AL" = "AL"
  inline val DZ: "DZ" = "DZ"
  inline val AS: "AS" = "AS"
  inline val AD: "AD" = "AD"
  inline val AO: "AO" = "AO"
  inline val AI: "AI" = "AI"
  inline val AQ: "AQ" = "AQ"
  inline val AG: "AG" = "AG"
  inline val AR: "AR" = "AR"
  inline val AM: "AM" = "AM"
  inline val AW: "AW" = "AW"
  inline val AU: "AU" = "AU"
  inline val AT: "AT" = "AT"
  inline val AZ: "AZ" = "AZ"
  inline val BS: "BS" = "BS"
  inline val BH: "BH" = "BH"
  inline val BD: "BD" = "BD"
  inline val BB: "BB" = "BB"
  inline val BY: "BY" = "BY"
  inline val BE: "BE" = "BE"
  inline val BZ: "BZ" = "BZ"
  inline val BJ: "BJ" = "BJ"
  inline val BM: "BM" = "BM"
  inline val BT: "BT" = "BT"
  inline val BO: "BO" = "BO"
  inline val BA: "BA" = "BA"
  inline val BW: "BW" = "BW"
  inline val BR: "BR" = "BR"
  inline val IO: "IO" = "IO"
  inline val VG: "VG" = "VG"
  inline val BN: "BN" = "BN"
  inline val BG: "BG" = "BG"
  inline val BF: "BF" = "BF"
  inline val BI: "BI" = "BI"
  inline val KH: "KH" = "KH"
  inline val CM: "CM" = "CM"
  inline val CA: "CA" = "CA"
  inline val CV: "CV" = "CV"
  inline val KY: "KY" = "KY"
  inline val CF: "CF" = "CF"
  inline val TD: "TD" = "TD"
  inline val CL: "CL" = "CL"
  inline val CN: "CN" = "CN"
  inline val CX: "CX" = "CX"
  inline val CC: "CC" = "CC"
  inline val CO: "CO" = "CO"
  inline val KM: "KM" = "KM"
  inline val CK: "CK" = "CK"
  inline val CR: "CR" = "CR"
  inline val HR: "HR" = "HR"
  inline val CU: "CU" = "CU"
  inline val CW: "CW" = "CW"
  inline val CY: "CY" = "CY"
  inline val CZ: "CZ" = "CZ"
  inline val CD: "CD" = "CD"
  inline val DK: "DK" = "DK"
  inline val DJ: "DJ" = "DJ"
  inline val DM: "DM" = "DM"
  inline val DO: "DO" = "DO"
  inline val TL: "TL" = "TL"
  inline val EC: "EC" = "EC"
  inline val EG: "EG" = "EG"
  inline val SV: "SV" = "SV"
  inline val GQ: "GQ" = "GQ"
  inline val ER: "ER" = "ER"
  inline val EE: "EE" = "EE"
  inline val ET: "ET" = "ET"
  inline val FK: "FK" = "FK"
  inline val FO: "FO" = "FO"
  inline val FJ: "FJ" = "FJ"
  inline val FI: "FI" = "FI"
  inline val FR: "FR" = "FR"
  inline val PF: "PF" = "PF"
  inline val GA: "GA" = "GA"
  inline val GM: "GM" = "GM"
  inline val GE: "GE" = "GE"
  inline val DE: "DE" = "DE"
  inline val GH: "GH" = "GH"
  inline val GI: "GI" = "GI"
  inline val GR: "GR" = "GR"
  inline val GL: "GL" = "GL"
  inline val GD: "GD" = "GD"
  inline val GU: "GU" = "GU"
  inline val GT: "GT" = "GT"
  inline val GG: "GG" = "GG"
  inline val GN: "GN" = "GN"
  inline val GW: "GW" = "GW"
  inline val GY: "GY" = "GY"
  inline val HT: "HT" = "HT"
  inline val HN: "HN" = "HN"
  inline val HK: "HK" = "HK"
  inline val HU: "HU" = "HU"
  inline val IS: "IS" = "IS"
  inline val IN: "IN" = "IN"
  inline val ID: "ID" = "ID"
  inline val IR: "IR" = "IR"
  inline val IQ: "IQ" = "IQ"
  inline val IE: "IE" = "IE"
  inline val IM: "IM" = "IM"
  inline val IL: "IL" = "IL"
  inline val IT: "IT" = "IT"
  inline val CI: "CI" = "CI"
  inline val JM: "JM" = "JM"
  inline val JP: "JP" = "JP"
  inline val JE: "JE" = "JE"
  inline val JO: "JO" = "JO"
  inline val KZ: "KZ" = "KZ"
  inline val KE: "KE" = "KE"
  inline val KI: "KI" = "KI"
  inline val KW: "KW" = "KW"
  inline val KG: "KG" = "KG"
  inline val LA: "LA" = "LA"
  inline val LV: "LV" = "LV"
  inline val LB: "LB" = "LB"
  inline val LS: "LS" = "LS"
  inline val LR: "LR" = "LR"
  inline val LY: "LY" = "LY"
  inline val LI: "LI" = "LI"
  inline val LT: "LT" = "LT"
  inline val LU: "LU" = "LU"
  inline val MO: "MO" = "MO"
  inline val MK: "MK" = "MK"
  inline val MG: "MG" = "MG"
  inline val MW: "MW" = "MW"
  inline val MY: "MY" = "MY"
  inline val MV: "MV" = "MV"
  inline val ML: "ML" = "ML"
  inline val MT: "MT" = "MT"
  inline val MH: "MH" = "MH"
  inline val MR: "MR" = "MR"
  inline val MU: "MU" = "MU"
  inline val YT: "YT" = "YT"
  inline val MX: "MX" = "MX"
  inline val FM: "FM" = "FM"
  inline val MD: "MD" = "MD"
  inline val MC: "MC" = "MC"
  inline val MN: "MN" = "MN"
  inline val ME: "ME" = "ME"
  inline val MS: "MS" = "MS"
  inline val MA: "MA" = "MA"
  inline val MZ: "MZ" = "MZ"
  inline val MM: "MM" = "MM"
  inline val NA: "NA" = "NA"
  inline val NR: "NR" = "NR"
  inline val NP: "NP" = "NP"
  inline val NL: "NL" = "NL"
  inline val AN: "AN" = "AN"
  inline val NC: "NC" = "NC"
  inline val NZ: "NZ" = "NZ"
  inline val NI: "NI" = "NI"
  inline val NE: "NE" = "NE"
  inline val NG: "NG" = "NG"
  inline val NU: "NU" = "NU"
  inline val KP: "KP" = "KP"
  inline val MP: "MP" = "MP"
  inline val NO: "NO" = "NO"
  inline val OM: "OM" = "OM"
  inline val PK: "PK" = "PK"
  inline val PW: "PW" = "PW"
  inline val PA: "PA" = "PA"
  inline val PG: "PG" = "PG"
  inline val PY: "PY" = "PY"
  inline val PE: "PE" = "PE"
  inline val PH: "PH" = "PH"
  inline val PN: "PN" = "PN"
  inline val PL: "PL" = "PL"
  inline val PT: "PT" = "PT"
  inline val PR: "PR" = "PR"
  inline val QA: "QA" = "QA"
  inline val CG: "CG" = "CG"
  inline val RE: "RE" = "RE"
  inline val RO: "RO" = "RO"
  inline val RU: "RU" = "RU"
  inline val RW: "RW" = "RW"
  inline val BL: "BL" = "BL"
  inline val SH: "SH" = "SH"
  inline val KN: "KN" = "KN"
  inline val LC: "LC" = "LC"
  inline val MF: "MF" = "MF"
  inline val PM: "PM" = "PM"
  inline val VC: "VC" = "VC"
  inline val WS: "WS" = "WS"
  inline val SM: "SM" = "SM"
  inline val ST: "ST" = "ST"
  inline val SA: "SA" = "SA"
  inline val SN: "SN" = "SN"
  inline val RS: "RS" = "RS"
  inline val SC: "SC" = "SC"
  inline val SL: "SL" = "SL"
  inline val SG: "SG" = "SG"
  inline val SX: "SX" = "SX"
  inline val SK: "SK" = "SK"
  inline val SI: "SI" = "SI"
  inline val SB: "SB" = "SB"
  inline val SO: "SO" = "SO"
  inline val ZA: "ZA" = "ZA"
  inline val KR: "KR" = "KR"
  inline val ES: "ES" = "ES"
  inline val LK: "LK" = "LK"
  inline val SD: "SD" = "SD"
  inline val SR: "SR" = "SR"
  inline val SJ: "SJ" = "SJ"
  inline val SZ: "SZ" = "SZ"
  inline val SE: "SE" = "SE"
  inline val CH: "CH" = "CH"
  inline val SY: "SY" = "SY"
  inline val TW: "TW" = "TW"
  inline val TJ: "TJ" = "TJ"
  inline val TZ: "TZ" = "TZ"
  inline val TH: "TH" = "TH"
  inline val TG: "TG" = "TG"
  inline val TK: "TK" = "TK"
  inline val TO: "TO" = "TO"
  inline val TT: "TT" = "TT"
  inline val TN: "TN" = "TN"
  inline val TR: "TR" = "TR"
  inline val TM: "TM" = "TM"
  inline val TC: "TC" = "TC"
  inline val TV: "TV" = "TV"
  inline val VI: "VI" = "VI"
  inline val UG: "UG" = "UG"
  inline val UA: "UA" = "UA"
  inline val AE: "AE" = "AE"
  inline val GB: "GB" = "GB"
  inline val US: "US" = "US"
  inline val UY: "UY" = "UY"
  inline val UZ: "UZ" = "UZ"
  inline val VU: "VU" = "VU"
  inline val VA: "VA" = "VA"
  inline val VE: "VE" = "VE"
  inline val VN: "VN" = "VN"
  inline val WF: "WF" = "WF"
  inline val EH: "EH" = "EH"
  inline val YE: "YE" = "YE"
  inline val ZM: "ZM" = "ZM"
  inline val ZW: "ZW" = "ZW"

  inline def values: js.Array[PhoneNumberCountryCode] = js.Array(
    AF,
    AL,
    DZ,
    AS,
    AD,
    AO,
    AI,
    AQ,
    AG,
    AR,
    AM,
    AW,
    AU,
    AT,
    AZ,
    BS,
    BH,
    BD,
    BB,
    BY,
    BE,
    BZ,
    BJ,
    BM,
    BT,
    BO,
    BA,
    BW,
    BR,
    IO,
    VG,
    BN,
    BG,
    BF,
    BI,
    KH,
    CM,
    CA,
    CV,
    KY,
    CF,
    TD,
    CL,
    CN,
    CX,
    CC,
    CO,
    KM,
    CK,
    CR,
    HR,
    CU,
    CW,
    CY,
    CZ,
    CD,
    DK,
    DJ,
    DM,
    DO,
    TL,
    EC,
    EG,
    SV,
    GQ,
    ER,
    EE,
    ET,
    FK,
    FO,
    FJ,
    FI,
    FR,
    PF,
    GA,
    GM,
    GE,
    DE,
    GH,
    GI,
    GR,
    GL,
    GD,
    GU,
    GT,
    GG,
    GN,
    GW,
    GY,
    HT,
    HN,
    HK,
    HU,
    IS,
    IN,
    ID,
    IR,
    IQ,
    IE,
    IM,
    IL,
    IT,
    CI,
    JM,
    JP,
    JE,
    JO,
    KZ,
    KE,
    KI,
    KW,
    KG,
    LA,
    LV,
    LB,
    LS,
    LR,
    LY,
    LI,
    LT,
    LU,
    MO,
    MK,
    MG,
    MW,
    MY,
    MV,
    ML,
    MT,
    MH,
    MR,
    MU,
    YT,
    MX,
    FM,
    MD,
    MC,
    MN,
    ME,
    MS,
    MA,
    MZ,
    MM,
    NA,
    NR,
    NP,
    NL,
    AN,
    NC,
    NZ,
    NI,
    NE,
    NG,
    NU,
    KP,
    MP,
    NO,
    OM,
    PK,
    PW,
    PA,
    PG,
    PY,
    PE,
    PH,
    PN,
    PL,
    PT,
    PR,
    QA,
    CG,
    RE,
    RO,
    RU,
    RW,
    BL,
    SH,
    KN,
    LC,
    MF,
    PM,
    VC,
    WS,
    SM,
    ST,
    SA,
    SN,
    RS,
    SC,
    SL,
    SG,
    SX,
    SK,
    SI,
    SB,
    SO,
    ZA,
    KR,
    ES,
    LK,
    SD,
    SR,
    SJ,
    SZ,
    SE,
    CH,
    SY,
    TW,
    TJ,
    TZ,
    TH,
    TG,
    TK,
    TO,
    TT,
    TN,
    TR,
    TM,
    TC,
    TV,
    VI,
    UG,
    UA,
    AE,
    GB,
    US,
    UY,
    UZ,
    VU,
    VA,
    VE,
    VN,
    WF,
    EH,
    YE,
    ZM,
    ZW
  )
}

type PhoneNumberType = "TOLL_FREE" | "DID"
object PhoneNumberType {
  inline val TOLL_FREE: "TOLL_FREE" = "TOLL_FREE"
  inline val DID: "DID" = "DID"

  inline def values: js.Array[PhoneNumberType] = js.Array(TOLL_FREE, DID)
}

type PhoneType = "SOFT_PHONE" | "DESK_PHONE"
object PhoneType {
  inline val SOFT_PHONE: "SOFT_PHONE" = "SOFT_PHONE"
  inline val DESK_PHONE: "DESK_PHONE" = "DESK_PHONE"

  inline def values: js.Array[PhoneType] = js.Array(SOFT_PHONE, DESK_PHONE)
}

type QueueStatus = "ENABLED" | "DISABLED"
object QueueStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[QueueStatus] = js.Array(ENABLED, DISABLED)
}

type QueueType = "STANDARD" | "AGENT"
object QueueType {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val AGENT: "AGENT" = "AGENT"

  inline def values: js.Array[QueueType] = js.Array(STANDARD, AGENT)
}

type QuickConnectType = "USER" | "QUEUE" | "PHONE_NUMBER"
object QuickConnectType {
  inline val USER: "USER" = "USER"
  inline val QUEUE: "QUEUE" = "QUEUE"
  inline val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"

  inline def values: js.Array[QuickConnectType] = js.Array(USER, QUEUE, PHONE_NUMBER)
}

type ReferenceStatus = "APPROVED" | "REJECTED"
object ReferenceStatus {
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val REJECTED: "REJECTED" = "REJECTED"

  inline def values: js.Array[ReferenceStatus] = js.Array(APPROVED, REJECTED)
}

type ReferenceType = "URL" | "ATTACHMENT"
object ReferenceType {
  inline val URL: "URL" = "URL"
  inline val ATTACHMENT: "ATTACHMENT" = "ATTACHMENT"

  inline def values: js.Array[ReferenceType] = js.Array(URL, ATTACHMENT)
}

type SourceType = "SALESFORCE" | "ZENDESK"
object SourceType {
  inline val SALESFORCE: "SALESFORCE" = "SALESFORCE"
  inline val ZENDESK: "ZENDESK" = "ZENDESK"

  inline def values: js.Array[SourceType] = js.Array(SALESFORCE, ZENDESK)
}

type Statistic = "SUM" | "MAX" | "AVG"
object Statistic {
  inline val SUM: "SUM" = "SUM"
  inline val MAX: "MAX" = "MAX"
  inline val AVG: "AVG" = "AVG"

  inline def values: js.Array[Statistic] = js.Array(SUM, MAX, AVG)
}

type StorageType = "S3" | "KINESIS_VIDEO_STREAM" | "KINESIS_STREAM" | "KINESIS_FIREHOSE"
object StorageType {
  inline val S3: "S3" = "S3"
  inline val KINESIS_VIDEO_STREAM: "KINESIS_VIDEO_STREAM" = "KINESIS_VIDEO_STREAM"
  inline val KINESIS_STREAM: "KINESIS_STREAM" = "KINESIS_STREAM"
  inline val KINESIS_FIREHOSE: "KINESIS_FIREHOSE" = "KINESIS_FIREHOSE"

  inline def values: js.Array[StorageType] = js.Array(S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM, KINESIS_FIREHOSE)
}

type TrafficType = "GENERAL" | "CAMPAIGN"
object TrafficType {
  inline val GENERAL: "GENERAL" = "GENERAL"
  inline val CAMPAIGN: "CAMPAIGN" = "CAMPAIGN"

  inline def values: js.Array[TrafficType] = js.Array(GENERAL, CAMPAIGN)
}

type Unit = "SECONDS" | "COUNT" | "PERCENT"
object Unit {
  inline val SECONDS: "SECONDS" = "SECONDS"
  inline val COUNT: "COUNT" = "COUNT"
  inline val PERCENT: "PERCENT" = "PERCENT"

  inline def values: js.Array[Unit] = js.Array(SECONDS, COUNT, PERCENT)
}

type UseCaseType = "RULES_EVALUATION" | "CONNECT_CAMPAIGNS"
object UseCaseType {
  inline val RULES_EVALUATION: "RULES_EVALUATION" = "RULES_EVALUATION"
  inline val CONNECT_CAMPAIGNS: "CONNECT_CAMPAIGNS" = "CONNECT_CAMPAIGNS"

  inline def values: js.Array[UseCaseType] = js.Array(RULES_EVALUATION, CONNECT_CAMPAIGNS)
}

type VoiceRecordingTrack = "FROM_AGENT" | "TO_AGENT" | "ALL"
object VoiceRecordingTrack {
  inline val FROM_AGENT: "FROM_AGENT" = "FROM_AGENT"
  inline val TO_AGENT: "TO_AGENT" = "TO_AGENT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[VoiceRecordingTrack] = js.Array(FROM_AGENT, TO_AGENT, ALL)
}
