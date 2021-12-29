package facade.amazonaws.services.connect

import scalajs._

type Channel = "VOICE" | "CHAT" | "TASK"
object Channel {
  val VOICE: "VOICE" = "VOICE"
  val CHAT: "CHAT" = "CHAT"
  val TASK: "TASK" = "TASK"

  @inline def values = js.Array[Channel](VOICE, CHAT, TASK)
}

type Comparison = "LT"
object Comparison {
  val LT: "LT" = "LT"

  @inline def values = js.Array[Comparison](LT)
}

type ContactFlowType = "CONTACT_FLOW" | "CUSTOMER_QUEUE" | "CUSTOMER_HOLD" | "CUSTOMER_WHISPER" | "AGENT_HOLD" | "AGENT_WHISPER" | "OUTBOUND_WHISPER" | "AGENT_TRANSFER" | "QUEUE_TRANSFER"
object ContactFlowType {
  val CONTACT_FLOW: "CONTACT_FLOW" = "CONTACT_FLOW"
  val CUSTOMER_QUEUE: "CUSTOMER_QUEUE" = "CUSTOMER_QUEUE"
  val CUSTOMER_HOLD: "CUSTOMER_HOLD" = "CUSTOMER_HOLD"
  val CUSTOMER_WHISPER: "CUSTOMER_WHISPER" = "CUSTOMER_WHISPER"
  val AGENT_HOLD: "AGENT_HOLD" = "AGENT_HOLD"
  val AGENT_WHISPER: "AGENT_WHISPER" = "AGENT_WHISPER"
  val OUTBOUND_WHISPER: "OUTBOUND_WHISPER" = "OUTBOUND_WHISPER"
  val AGENT_TRANSFER: "AGENT_TRANSFER" = "AGENT_TRANSFER"
  val QUEUE_TRANSFER: "QUEUE_TRANSFER" = "QUEUE_TRANSFER"

  @inline def values = js.Array[ContactFlowType](CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD, CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER, AGENT_TRANSFER, QUEUE_TRANSFER)
}

/** The current metric names.
  */
type CurrentMetricName = "AGENTS_ONLINE" | "AGENTS_AVAILABLE" | "AGENTS_ON_CALL" | "AGENTS_NON_PRODUCTIVE" | "AGENTS_AFTER_CONTACT_WORK" | "AGENTS_ERROR" | "AGENTS_STAFFED" | "CONTACTS_IN_QUEUE" | "OLDEST_CONTACT_AGE" | "CONTACTS_SCHEDULED" | "AGENTS_ON_CONTACT" | "SLOTS_ACTIVE" | "SLOTS_AVAILABLE"
object CurrentMetricName {
  val AGENTS_ONLINE: "AGENTS_ONLINE" = "AGENTS_ONLINE"
  val AGENTS_AVAILABLE: "AGENTS_AVAILABLE" = "AGENTS_AVAILABLE"
  val AGENTS_ON_CALL: "AGENTS_ON_CALL" = "AGENTS_ON_CALL"
  val AGENTS_NON_PRODUCTIVE: "AGENTS_NON_PRODUCTIVE" = "AGENTS_NON_PRODUCTIVE"
  val AGENTS_AFTER_CONTACT_WORK: "AGENTS_AFTER_CONTACT_WORK" = "AGENTS_AFTER_CONTACT_WORK"
  val AGENTS_ERROR: "AGENTS_ERROR" = "AGENTS_ERROR"
  val AGENTS_STAFFED: "AGENTS_STAFFED" = "AGENTS_STAFFED"
  val CONTACTS_IN_QUEUE: "CONTACTS_IN_QUEUE" = "CONTACTS_IN_QUEUE"
  val OLDEST_CONTACT_AGE: "OLDEST_CONTACT_AGE" = "OLDEST_CONTACT_AGE"
  val CONTACTS_SCHEDULED: "CONTACTS_SCHEDULED" = "CONTACTS_SCHEDULED"
  val AGENTS_ON_CONTACT: "AGENTS_ON_CONTACT" = "AGENTS_ON_CONTACT"
  val SLOTS_ACTIVE: "SLOTS_ACTIVE" = "SLOTS_ACTIVE"
  val SLOTS_AVAILABLE: "SLOTS_AVAILABLE" = "SLOTS_AVAILABLE"

  @inline def values = js.Array[CurrentMetricName](
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
  val SAML: "SAML" = "SAML"
  val CONNECT_MANAGED: "CONNECT_MANAGED" = "CONNECT_MANAGED"
  val EXISTING_DIRECTORY: "EXISTING_DIRECTORY" = "EXISTING_DIRECTORY"

  @inline def values = js.Array[DirectoryType](SAML, CONNECT_MANAGED, EXISTING_DIRECTORY)
}

type EncryptionType = "KMS"
object EncryptionType {
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[EncryptionType](KMS)
}

type Grouping = "QUEUE" | "CHANNEL"
object Grouping {
  val QUEUE: "QUEUE" = "QUEUE"
  val CHANNEL: "CHANNEL" = "CHANNEL"

  @inline def values = js.Array[Grouping](QUEUE, CHANNEL)
}

/** The historical metric names.
  */
type HistoricalMetricName = "CONTACTS_QUEUED" | "CONTACTS_HANDLED" | "CONTACTS_ABANDONED" | "CONTACTS_CONSULTED" | "CONTACTS_AGENT_HUNG_UP_FIRST" | "CONTACTS_HANDLED_INCOMING" | "CONTACTS_HANDLED_OUTBOUND" | "CONTACTS_HOLD_ABANDONS" | "CONTACTS_TRANSFERRED_IN" | "CONTACTS_TRANSFERRED_OUT" | "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" | "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" | "CONTACTS_MISSED" | "CALLBACK_CONTACTS_HANDLED" | "API_CONTACTS_HANDLED" | "OCCUPANCY" | "HANDLE_TIME" | "AFTER_CONTACT_WORK_TIME" | "QUEUED_TIME" | "ABANDON_TIME" | "QUEUE_ANSWER_TIME" | "HOLD_TIME" | "INTERACTION_TIME" | "INTERACTION_AND_HOLD_TIME" | "SERVICE_LEVEL"
object HistoricalMetricName {
  val CONTACTS_QUEUED: "CONTACTS_QUEUED" = "CONTACTS_QUEUED"
  val CONTACTS_HANDLED: "CONTACTS_HANDLED" = "CONTACTS_HANDLED"
  val CONTACTS_ABANDONED: "CONTACTS_ABANDONED" = "CONTACTS_ABANDONED"
  val CONTACTS_CONSULTED: "CONTACTS_CONSULTED" = "CONTACTS_CONSULTED"
  val CONTACTS_AGENT_HUNG_UP_FIRST: "CONTACTS_AGENT_HUNG_UP_FIRST" = "CONTACTS_AGENT_HUNG_UP_FIRST"
  val CONTACTS_HANDLED_INCOMING: "CONTACTS_HANDLED_INCOMING" = "CONTACTS_HANDLED_INCOMING"
  val CONTACTS_HANDLED_OUTBOUND: "CONTACTS_HANDLED_OUTBOUND" = "CONTACTS_HANDLED_OUTBOUND"
  val CONTACTS_HOLD_ABANDONS: "CONTACTS_HOLD_ABANDONS" = "CONTACTS_HOLD_ABANDONS"
  val CONTACTS_TRANSFERRED_IN: "CONTACTS_TRANSFERRED_IN" = "CONTACTS_TRANSFERRED_IN"
  val CONTACTS_TRANSFERRED_OUT: "CONTACTS_TRANSFERRED_OUT" = "CONTACTS_TRANSFERRED_OUT"
  val CONTACTS_TRANSFERRED_IN_FROM_QUEUE: "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE"
  val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE: "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"
  val CONTACTS_MISSED: "CONTACTS_MISSED" = "CONTACTS_MISSED"
  val CALLBACK_CONTACTS_HANDLED: "CALLBACK_CONTACTS_HANDLED" = "CALLBACK_CONTACTS_HANDLED"
  val API_CONTACTS_HANDLED: "API_CONTACTS_HANDLED" = "API_CONTACTS_HANDLED"
  val OCCUPANCY: "OCCUPANCY" = "OCCUPANCY"
  val HANDLE_TIME: "HANDLE_TIME" = "HANDLE_TIME"
  val AFTER_CONTACT_WORK_TIME: "AFTER_CONTACT_WORK_TIME" = "AFTER_CONTACT_WORK_TIME"
  val QUEUED_TIME: "QUEUED_TIME" = "QUEUED_TIME"
  val ABANDON_TIME: "ABANDON_TIME" = "ABANDON_TIME"
  val QUEUE_ANSWER_TIME: "QUEUE_ANSWER_TIME" = "QUEUE_ANSWER_TIME"
  val HOLD_TIME: "HOLD_TIME" = "HOLD_TIME"
  val INTERACTION_TIME: "INTERACTION_TIME" = "INTERACTION_TIME"
  val INTERACTION_AND_HOLD_TIME: "INTERACTION_AND_HOLD_TIME" = "INTERACTION_AND_HOLD_TIME"
  val SERVICE_LEVEL: "SERVICE_LEVEL" = "SERVICE_LEVEL"

  @inline def values = js.Array[HistoricalMetricName](
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
  val SUNDAY: "SUNDAY" = "SUNDAY"
  val MONDAY: "MONDAY" = "MONDAY"
  val TUESDAY: "TUESDAY" = "TUESDAY"
  val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  val THURSDAY: "THURSDAY" = "THURSDAY"
  val FRIDAY: "FRIDAY" = "FRIDAY"
  val SATURDAY: "SATURDAY" = "SATURDAY"

  @inline def values = js.Array[HoursOfOperationDays](SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
}

type InstanceAttributeType = "INBOUND_CALLS" | "OUTBOUND_CALLS" | "CONTACTFLOW_LOGS" | "CONTACT_LENS" | "AUTO_RESOLVE_BEST_VOICES" | "USE_CUSTOM_TTS_VOICES" | "EARLY_MEDIA"
object InstanceAttributeType {
  val INBOUND_CALLS: "INBOUND_CALLS" = "INBOUND_CALLS"
  val OUTBOUND_CALLS: "OUTBOUND_CALLS" = "OUTBOUND_CALLS"
  val CONTACTFLOW_LOGS: "CONTACTFLOW_LOGS" = "CONTACTFLOW_LOGS"
  val CONTACT_LENS: "CONTACT_LENS" = "CONTACT_LENS"
  val AUTO_RESOLVE_BEST_VOICES: "AUTO_RESOLVE_BEST_VOICES" = "AUTO_RESOLVE_BEST_VOICES"
  val USE_CUSTOM_TTS_VOICES: "USE_CUSTOM_TTS_VOICES" = "USE_CUSTOM_TTS_VOICES"
  val EARLY_MEDIA: "EARLY_MEDIA" = "EARLY_MEDIA"

  @inline def values = js.Array[InstanceAttributeType](INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS, CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES, EARLY_MEDIA)
}

type InstanceStatus = "CREATION_IN_PROGRESS" | "ACTIVE" | "CREATION_FAILED"
object InstanceStatus {
  val CREATION_IN_PROGRESS: "CREATION_IN_PROGRESS" = "CREATION_IN_PROGRESS"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  @inline def values = js.Array[InstanceStatus](CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED)
}

type InstanceStorageResourceType = "CHAT_TRANSCRIPTS" | "CALL_RECORDINGS" | "SCHEDULED_REPORTS" | "MEDIA_STREAMS" | "CONTACT_TRACE_RECORDS" | "AGENT_EVENTS"
object InstanceStorageResourceType {
  val CHAT_TRANSCRIPTS: "CHAT_TRANSCRIPTS" = "CHAT_TRANSCRIPTS"
  val CALL_RECORDINGS: "CALL_RECORDINGS" = "CALL_RECORDINGS"
  val SCHEDULED_REPORTS: "SCHEDULED_REPORTS" = "SCHEDULED_REPORTS"
  val MEDIA_STREAMS: "MEDIA_STREAMS" = "MEDIA_STREAMS"
  val CONTACT_TRACE_RECORDS: "CONTACT_TRACE_RECORDS" = "CONTACT_TRACE_RECORDS"
  val AGENT_EVENTS: "AGENT_EVENTS" = "AGENT_EVENTS"

  @inline def values = js.Array[InstanceStorageResourceType](CHAT_TRANSCRIPTS, CALL_RECORDINGS, SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS)
}

type IntegrationType = "EVENT"
object IntegrationType {
  val EVENT: "EVENT" = "EVENT"

  @inline def values = js.Array[IntegrationType](EVENT)
}

type PhoneNumberCountryCode = "AF" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BA" | "BW" | "BR" | "IO" | "VG" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CK" | "CR" | "HR" | "CU" | "CW" | "CY" | "CZ" | "CD" | "DK" | "DJ" | "DM" | "DO" | "TL" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "PF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "CI" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" |
  "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "AN" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "KP" | "MP" | "NO" | "OM" | "PK" | "PW" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "CG" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "KR" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "VI" | "UG" | "UA" | "AE" | "GB" | "US" | "UY" | "UZ" | "VU" | "VA" | "VE" | "VN" | "WF" | "EH" | "YE" | "ZM" | "ZW"
object PhoneNumberCountryCode {
  val AF: "AF" = "AF"
  val AL: "AL" = "AL"
  val DZ: "DZ" = "DZ"
  val AS: "AS" = "AS"
  val AD: "AD" = "AD"
  val AO: "AO" = "AO"
  val AI: "AI" = "AI"
  val AQ: "AQ" = "AQ"
  val AG: "AG" = "AG"
  val AR: "AR" = "AR"
  val AM: "AM" = "AM"
  val AW: "AW" = "AW"
  val AU: "AU" = "AU"
  val AT: "AT" = "AT"
  val AZ: "AZ" = "AZ"
  val BS: "BS" = "BS"
  val BH: "BH" = "BH"
  val BD: "BD" = "BD"
  val BB: "BB" = "BB"
  val BY: "BY" = "BY"
  val BE: "BE" = "BE"
  val BZ: "BZ" = "BZ"
  val BJ: "BJ" = "BJ"
  val BM: "BM" = "BM"
  val BT: "BT" = "BT"
  val BO: "BO" = "BO"
  val BA: "BA" = "BA"
  val BW: "BW" = "BW"
  val BR: "BR" = "BR"
  val IO: "IO" = "IO"
  val VG: "VG" = "VG"
  val BN: "BN" = "BN"
  val BG: "BG" = "BG"
  val BF: "BF" = "BF"
  val BI: "BI" = "BI"
  val KH: "KH" = "KH"
  val CM: "CM" = "CM"
  val CA: "CA" = "CA"
  val CV: "CV" = "CV"
  val KY: "KY" = "KY"
  val CF: "CF" = "CF"
  val TD: "TD" = "TD"
  val CL: "CL" = "CL"
  val CN: "CN" = "CN"
  val CX: "CX" = "CX"
  val CC: "CC" = "CC"
  val CO: "CO" = "CO"
  val KM: "KM" = "KM"
  val CK: "CK" = "CK"
  val CR: "CR" = "CR"
  val HR: "HR" = "HR"
  val CU: "CU" = "CU"
  val CW: "CW" = "CW"
  val CY: "CY" = "CY"
  val CZ: "CZ" = "CZ"
  val CD: "CD" = "CD"
  val DK: "DK" = "DK"
  val DJ: "DJ" = "DJ"
  val DM: "DM" = "DM"
  val DO: "DO" = "DO"
  val TL: "TL" = "TL"
  val EC: "EC" = "EC"
  val EG: "EG" = "EG"
  val SV: "SV" = "SV"
  val GQ: "GQ" = "GQ"
  val ER: "ER" = "ER"
  val EE: "EE" = "EE"
  val ET: "ET" = "ET"
  val FK: "FK" = "FK"
  val FO: "FO" = "FO"
  val FJ: "FJ" = "FJ"
  val FI: "FI" = "FI"
  val FR: "FR" = "FR"
  val PF: "PF" = "PF"
  val GA: "GA" = "GA"
  val GM: "GM" = "GM"
  val GE: "GE" = "GE"
  val DE: "DE" = "DE"
  val GH: "GH" = "GH"
  val GI: "GI" = "GI"
  val GR: "GR" = "GR"
  val GL: "GL" = "GL"
  val GD: "GD" = "GD"
  val GU: "GU" = "GU"
  val GT: "GT" = "GT"
  val GG: "GG" = "GG"
  val GN: "GN" = "GN"
  val GW: "GW" = "GW"
  val GY: "GY" = "GY"
  val HT: "HT" = "HT"
  val HN: "HN" = "HN"
  val HK: "HK" = "HK"
  val HU: "HU" = "HU"
  val IS: "IS" = "IS"
  val IN: "IN" = "IN"
  val ID: "ID" = "ID"
  val IR: "IR" = "IR"
  val IQ: "IQ" = "IQ"
  val IE: "IE" = "IE"
  val IM: "IM" = "IM"
  val IL: "IL" = "IL"
  val IT: "IT" = "IT"
  val CI: "CI" = "CI"
  val JM: "JM" = "JM"
  val JP: "JP" = "JP"
  val JE: "JE" = "JE"
  val JO: "JO" = "JO"
  val KZ: "KZ" = "KZ"
  val KE: "KE" = "KE"
  val KI: "KI" = "KI"
  val KW: "KW" = "KW"
  val KG: "KG" = "KG"
  val LA: "LA" = "LA"
  val LV: "LV" = "LV"
  val LB: "LB" = "LB"
  val LS: "LS" = "LS"
  val LR: "LR" = "LR"
  val LY: "LY" = "LY"
  val LI: "LI" = "LI"
  val LT: "LT" = "LT"
  val LU: "LU" = "LU"
  val MO: "MO" = "MO"
  val MK: "MK" = "MK"
  val MG: "MG" = "MG"
  val MW: "MW" = "MW"
  val MY: "MY" = "MY"
  val MV: "MV" = "MV"
  val ML: "ML" = "ML"
  val MT: "MT" = "MT"
  val MH: "MH" = "MH"
  val MR: "MR" = "MR"
  val MU: "MU" = "MU"
  val YT: "YT" = "YT"
  val MX: "MX" = "MX"
  val FM: "FM" = "FM"
  val MD: "MD" = "MD"
  val MC: "MC" = "MC"
  val MN: "MN" = "MN"
  val ME: "ME" = "ME"
  val MS: "MS" = "MS"
  val MA: "MA" = "MA"
  val MZ: "MZ" = "MZ"
  val MM: "MM" = "MM"
  val NA: "NA" = "NA"
  val NR: "NR" = "NR"
  val NP: "NP" = "NP"
  val NL: "NL" = "NL"
  val AN: "AN" = "AN"
  val NC: "NC" = "NC"
  val NZ: "NZ" = "NZ"
  val NI: "NI" = "NI"
  val NE: "NE" = "NE"
  val NG: "NG" = "NG"
  val NU: "NU" = "NU"
  val KP: "KP" = "KP"
  val MP: "MP" = "MP"
  val NO: "NO" = "NO"
  val OM: "OM" = "OM"
  val PK: "PK" = "PK"
  val PW: "PW" = "PW"
  val PA: "PA" = "PA"
  val PG: "PG" = "PG"
  val PY: "PY" = "PY"
  val PE: "PE" = "PE"
  val PH: "PH" = "PH"
  val PN: "PN" = "PN"
  val PL: "PL" = "PL"
  val PT: "PT" = "PT"
  val PR: "PR" = "PR"
  val QA: "QA" = "QA"
  val CG: "CG" = "CG"
  val RE: "RE" = "RE"
  val RO: "RO" = "RO"
  val RU: "RU" = "RU"
  val RW: "RW" = "RW"
  val BL: "BL" = "BL"
  val SH: "SH" = "SH"
  val KN: "KN" = "KN"
  val LC: "LC" = "LC"
  val MF: "MF" = "MF"
  val PM: "PM" = "PM"
  val VC: "VC" = "VC"
  val WS: "WS" = "WS"
  val SM: "SM" = "SM"
  val ST: "ST" = "ST"
  val SA: "SA" = "SA"
  val SN: "SN" = "SN"
  val RS: "RS" = "RS"
  val SC: "SC" = "SC"
  val SL: "SL" = "SL"
  val SG: "SG" = "SG"
  val SX: "SX" = "SX"
  val SK: "SK" = "SK"
  val SI: "SI" = "SI"
  val SB: "SB" = "SB"
  val SO: "SO" = "SO"
  val ZA: "ZA" = "ZA"
  val KR: "KR" = "KR"
  val ES: "ES" = "ES"
  val LK: "LK" = "LK"
  val SD: "SD" = "SD"
  val SR: "SR" = "SR"
  val SJ: "SJ" = "SJ"
  val SZ: "SZ" = "SZ"
  val SE: "SE" = "SE"
  val CH: "CH" = "CH"
  val SY: "SY" = "SY"
  val TW: "TW" = "TW"
  val TJ: "TJ" = "TJ"
  val TZ: "TZ" = "TZ"
  val TH: "TH" = "TH"
  val TG: "TG" = "TG"
  val TK: "TK" = "TK"
  val TO: "TO" = "TO"
  val TT: "TT" = "TT"
  val TN: "TN" = "TN"
  val TR: "TR" = "TR"
  val TM: "TM" = "TM"
  val TC: "TC" = "TC"
  val TV: "TV" = "TV"
  val VI: "VI" = "VI"
  val UG: "UG" = "UG"
  val UA: "UA" = "UA"
  val AE: "AE" = "AE"
  val GB: "GB" = "GB"
  val US: "US" = "US"
  val UY: "UY" = "UY"
  val UZ: "UZ" = "UZ"
  val VU: "VU" = "VU"
  val VA: "VA" = "VA"
  val VE: "VE" = "VE"
  val VN: "VN" = "VN"
  val WF: "WF" = "WF"
  val EH: "EH" = "EH"
  val YE: "YE" = "YE"
  val ZM: "ZM" = "ZM"
  val ZW: "ZW" = "ZW"

  @inline def values = js.Array[PhoneNumberCountryCode](
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
  val TOLL_FREE: "TOLL_FREE" = "TOLL_FREE"
  val DID: "DID" = "DID"

  @inline def values = js.Array[PhoneNumberType](TOLL_FREE, DID)
}

type PhoneType = "SOFT_PHONE" | "DESK_PHONE"
object PhoneType {
  val SOFT_PHONE: "SOFT_PHONE" = "SOFT_PHONE"
  val DESK_PHONE: "DESK_PHONE" = "DESK_PHONE"

  @inline def values = js.Array[PhoneType](SOFT_PHONE, DESK_PHONE)
}

type QueueStatus = "ENABLED" | "DISABLED"
object QueueStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[QueueStatus](ENABLED, DISABLED)
}

type QueueType = "STANDARD" | "AGENT"
object QueueType {
  val STANDARD: "STANDARD" = "STANDARD"
  val AGENT: "AGENT" = "AGENT"

  @inline def values = js.Array[QueueType](STANDARD, AGENT)
}

type QuickConnectType = "USER" | "QUEUE" | "PHONE_NUMBER"
object QuickConnectType {
  val USER: "USER" = "USER"
  val QUEUE: "QUEUE" = "QUEUE"
  val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"

  @inline def values = js.Array[QuickConnectType](USER, QUEUE, PHONE_NUMBER)
}

type ReferenceType = "URL"
object ReferenceType {
  val URL: "URL" = "URL"

  @inline def values = js.Array[ReferenceType](URL)
}

type SourceType = "SALESFORCE" | "ZENDESK"
object SourceType {
  val SALESFORCE: "SALESFORCE" = "SALESFORCE"
  val ZENDESK: "ZENDESK" = "ZENDESK"

  @inline def values = js.Array[SourceType](SALESFORCE, ZENDESK)
}

type Statistic = "SUM" | "MAX" | "AVG"
object Statistic {
  val SUM: "SUM" = "SUM"
  val MAX: "MAX" = "MAX"
  val AVG: "AVG" = "AVG"

  @inline def values = js.Array[Statistic](SUM, MAX, AVG)
}

type StorageType = "S3" | "KINESIS_VIDEO_STREAM" | "KINESIS_STREAM" | "KINESIS_FIREHOSE"
object StorageType {
  val S3: "S3" = "S3"
  val KINESIS_VIDEO_STREAM: "KINESIS_VIDEO_STREAM" = "KINESIS_VIDEO_STREAM"
  val KINESIS_STREAM: "KINESIS_STREAM" = "KINESIS_STREAM"
  val KINESIS_FIREHOSE: "KINESIS_FIREHOSE" = "KINESIS_FIREHOSE"

  @inline def values = js.Array[StorageType](S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM, KINESIS_FIREHOSE)
}

type Unit = "SECONDS" | "COUNT" | "PERCENT"
object Unit {
  val SECONDS: "SECONDS" = "SECONDS"
  val COUNT: "COUNT" = "COUNT"
  val PERCENT: "PERCENT" = "PERCENT"

  @inline def values = js.Array[Unit](SECONDS, COUNT, PERCENT)
}

type UseCaseType = "RULES_EVALUATION"
object UseCaseType {
  val RULES_EVALUATION: "RULES_EVALUATION" = "RULES_EVALUATION"

  @inline def values = js.Array[UseCaseType](RULES_EVALUATION)
}

type VoiceRecordingTrack = "FROM_AGENT" | "TO_AGENT" | "ALL"
object VoiceRecordingTrack {
  val FROM_AGENT: "FROM_AGENT" = "FROM_AGENT"
  val TO_AGENT: "TO_AGENT" = "TO_AGENT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[VoiceRecordingTrack](FROM_AGENT, TO_AGENT, ALL)
}
