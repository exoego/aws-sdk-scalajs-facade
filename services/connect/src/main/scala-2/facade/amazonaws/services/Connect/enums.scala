package facade.amazonaws.services.connect

import scalajs.js

@js.native
sealed trait Channel extends js.Any
object Channel {
  val VOICE = "VOICE".asInstanceOf[Channel]
  val CHAT = "CHAT".asInstanceOf[Channel]
  val TASK = "TASK".asInstanceOf[Channel]

  @inline def values: js.Array[Channel] = js.Array(VOICE, CHAT, TASK)
}

@js.native
sealed trait Comparison extends js.Any
object Comparison {
  val LT = "LT".asInstanceOf[Comparison]

  @inline def values: js.Array[Comparison] = js.Array(LT)
}

@js.native
sealed trait ContactFlowType extends js.Any
object ContactFlowType {
  val CONTACT_FLOW = "CONTACT_FLOW".asInstanceOf[ContactFlowType]
  val CUSTOMER_QUEUE = "CUSTOMER_QUEUE".asInstanceOf[ContactFlowType]
  val CUSTOMER_HOLD = "CUSTOMER_HOLD".asInstanceOf[ContactFlowType]
  val CUSTOMER_WHISPER = "CUSTOMER_WHISPER".asInstanceOf[ContactFlowType]
  val AGENT_HOLD = "AGENT_HOLD".asInstanceOf[ContactFlowType]
  val AGENT_WHISPER = "AGENT_WHISPER".asInstanceOf[ContactFlowType]
  val OUTBOUND_WHISPER = "OUTBOUND_WHISPER".asInstanceOf[ContactFlowType]
  val AGENT_TRANSFER = "AGENT_TRANSFER".asInstanceOf[ContactFlowType]
  val QUEUE_TRANSFER = "QUEUE_TRANSFER".asInstanceOf[ContactFlowType]

  @inline def values: js.Array[ContactFlowType] = js.Array(CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD, CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER, AGENT_TRANSFER, QUEUE_TRANSFER)
}

/** The current metric names.
  */
@js.native
sealed trait CurrentMetricName extends js.Any
object CurrentMetricName {
  val AGENTS_ONLINE = "AGENTS_ONLINE".asInstanceOf[CurrentMetricName]
  val AGENTS_AVAILABLE = "AGENTS_AVAILABLE".asInstanceOf[CurrentMetricName]
  val AGENTS_ON_CALL = "AGENTS_ON_CALL".asInstanceOf[CurrentMetricName]
  val AGENTS_NON_PRODUCTIVE = "AGENTS_NON_PRODUCTIVE".asInstanceOf[CurrentMetricName]
  val AGENTS_AFTER_CONTACT_WORK = "AGENTS_AFTER_CONTACT_WORK".asInstanceOf[CurrentMetricName]
  val AGENTS_ERROR = "AGENTS_ERROR".asInstanceOf[CurrentMetricName]
  val AGENTS_STAFFED = "AGENTS_STAFFED".asInstanceOf[CurrentMetricName]
  val CONTACTS_IN_QUEUE = "CONTACTS_IN_QUEUE".asInstanceOf[CurrentMetricName]
  val OLDEST_CONTACT_AGE = "OLDEST_CONTACT_AGE".asInstanceOf[CurrentMetricName]
  val CONTACTS_SCHEDULED = "CONTACTS_SCHEDULED".asInstanceOf[CurrentMetricName]
  val AGENTS_ON_CONTACT = "AGENTS_ON_CONTACT".asInstanceOf[CurrentMetricName]
  val SLOTS_ACTIVE = "SLOTS_ACTIVE".asInstanceOf[CurrentMetricName]
  val SLOTS_AVAILABLE = "SLOTS_AVAILABLE".asInstanceOf[CurrentMetricName]

  @inline def values: js.Array[CurrentMetricName] = js.Array(
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

@js.native
sealed trait DirectoryType extends js.Any
object DirectoryType {
  val SAML = "SAML".asInstanceOf[DirectoryType]
  val CONNECT_MANAGED = "CONNECT_MANAGED".asInstanceOf[DirectoryType]
  val EXISTING_DIRECTORY = "EXISTING_DIRECTORY".asInstanceOf[DirectoryType]

  @inline def values: js.Array[DirectoryType] = js.Array(SAML, CONNECT_MANAGED, EXISTING_DIRECTORY)
}

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val KMS = "KMS".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(KMS)
}

@js.native
sealed trait Grouping extends js.Any
object Grouping {
  val QUEUE = "QUEUE".asInstanceOf[Grouping]
  val CHANNEL = "CHANNEL".asInstanceOf[Grouping]

  @inline def values: js.Array[Grouping] = js.Array(QUEUE, CHANNEL)
}

/** The historical metric names.
  */
@js.native
sealed trait HistoricalMetricName extends js.Any
object HistoricalMetricName {
  val CONTACTS_QUEUED = "CONTACTS_QUEUED".asInstanceOf[HistoricalMetricName]
  val CONTACTS_HANDLED = "CONTACTS_HANDLED".asInstanceOf[HistoricalMetricName]
  val CONTACTS_ABANDONED = "CONTACTS_ABANDONED".asInstanceOf[HistoricalMetricName]
  val CONTACTS_CONSULTED = "CONTACTS_CONSULTED".asInstanceOf[HistoricalMetricName]
  val CONTACTS_AGENT_HUNG_UP_FIRST = "CONTACTS_AGENT_HUNG_UP_FIRST".asInstanceOf[HistoricalMetricName]
  val CONTACTS_HANDLED_INCOMING = "CONTACTS_HANDLED_INCOMING".asInstanceOf[HistoricalMetricName]
  val CONTACTS_HANDLED_OUTBOUND = "CONTACTS_HANDLED_OUTBOUND".asInstanceOf[HistoricalMetricName]
  val CONTACTS_HOLD_ABANDONS = "CONTACTS_HOLD_ABANDONS".asInstanceOf[HistoricalMetricName]
  val CONTACTS_TRANSFERRED_IN = "CONTACTS_TRANSFERRED_IN".asInstanceOf[HistoricalMetricName]
  val CONTACTS_TRANSFERRED_OUT = "CONTACTS_TRANSFERRED_OUT".asInstanceOf[HistoricalMetricName]
  val CONTACTS_TRANSFERRED_IN_FROM_QUEUE = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE".asInstanceOf[HistoricalMetricName]
  val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE".asInstanceOf[HistoricalMetricName]
  val CONTACTS_MISSED = "CONTACTS_MISSED".asInstanceOf[HistoricalMetricName]
  val CALLBACK_CONTACTS_HANDLED = "CALLBACK_CONTACTS_HANDLED".asInstanceOf[HistoricalMetricName]
  val API_CONTACTS_HANDLED = "API_CONTACTS_HANDLED".asInstanceOf[HistoricalMetricName]
  val OCCUPANCY = "OCCUPANCY".asInstanceOf[HistoricalMetricName]
  val HANDLE_TIME = "HANDLE_TIME".asInstanceOf[HistoricalMetricName]
  val AFTER_CONTACT_WORK_TIME = "AFTER_CONTACT_WORK_TIME".asInstanceOf[HistoricalMetricName]
  val QUEUED_TIME = "QUEUED_TIME".asInstanceOf[HistoricalMetricName]
  val ABANDON_TIME = "ABANDON_TIME".asInstanceOf[HistoricalMetricName]
  val QUEUE_ANSWER_TIME = "QUEUE_ANSWER_TIME".asInstanceOf[HistoricalMetricName]
  val HOLD_TIME = "HOLD_TIME".asInstanceOf[HistoricalMetricName]
  val INTERACTION_TIME = "INTERACTION_TIME".asInstanceOf[HistoricalMetricName]
  val INTERACTION_AND_HOLD_TIME = "INTERACTION_AND_HOLD_TIME".asInstanceOf[HistoricalMetricName]
  val SERVICE_LEVEL = "SERVICE_LEVEL".asInstanceOf[HistoricalMetricName]

  @inline def values: js.Array[HistoricalMetricName] = js.Array(
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

@js.native
sealed trait HoursOfOperationDays extends js.Any
object HoursOfOperationDays {
  val SUNDAY = "SUNDAY".asInstanceOf[HoursOfOperationDays]
  val MONDAY = "MONDAY".asInstanceOf[HoursOfOperationDays]
  val TUESDAY = "TUESDAY".asInstanceOf[HoursOfOperationDays]
  val WEDNESDAY = "WEDNESDAY".asInstanceOf[HoursOfOperationDays]
  val THURSDAY = "THURSDAY".asInstanceOf[HoursOfOperationDays]
  val FRIDAY = "FRIDAY".asInstanceOf[HoursOfOperationDays]
  val SATURDAY = "SATURDAY".asInstanceOf[HoursOfOperationDays]

  @inline def values: js.Array[HoursOfOperationDays] = js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
}

@js.native
sealed trait InstanceAttributeType extends js.Any
object InstanceAttributeType {
  val INBOUND_CALLS = "INBOUND_CALLS".asInstanceOf[InstanceAttributeType]
  val OUTBOUND_CALLS = "OUTBOUND_CALLS".asInstanceOf[InstanceAttributeType]
  val CONTACTFLOW_LOGS = "CONTACTFLOW_LOGS".asInstanceOf[InstanceAttributeType]
  val CONTACT_LENS = "CONTACT_LENS".asInstanceOf[InstanceAttributeType]
  val AUTO_RESOLVE_BEST_VOICES = "AUTO_RESOLVE_BEST_VOICES".asInstanceOf[InstanceAttributeType]
  val USE_CUSTOM_TTS_VOICES = "USE_CUSTOM_TTS_VOICES".asInstanceOf[InstanceAttributeType]
  val EARLY_MEDIA = "EARLY_MEDIA".asInstanceOf[InstanceAttributeType]

  @inline def values: js.Array[InstanceAttributeType] = js.Array(INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS, CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES, EARLY_MEDIA)
}

@js.native
sealed trait InstanceStatus extends js.Any
object InstanceStatus {
  val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[InstanceStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[InstanceStatus]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[InstanceStatus]

  @inline def values: js.Array[InstanceStatus] = js.Array(CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED)
}

@js.native
sealed trait InstanceStorageResourceType extends js.Any
object InstanceStorageResourceType {
  val CHAT_TRANSCRIPTS = "CHAT_TRANSCRIPTS".asInstanceOf[InstanceStorageResourceType]
  val CALL_RECORDINGS = "CALL_RECORDINGS".asInstanceOf[InstanceStorageResourceType]
  val SCHEDULED_REPORTS = "SCHEDULED_REPORTS".asInstanceOf[InstanceStorageResourceType]
  val MEDIA_STREAMS = "MEDIA_STREAMS".asInstanceOf[InstanceStorageResourceType]
  val CONTACT_TRACE_RECORDS = "CONTACT_TRACE_RECORDS".asInstanceOf[InstanceStorageResourceType]
  val AGENT_EVENTS = "AGENT_EVENTS".asInstanceOf[InstanceStorageResourceType]

  @inline def values: js.Array[InstanceStorageResourceType] = js.Array(CHAT_TRANSCRIPTS, CALL_RECORDINGS, SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS)
}

@js.native
sealed trait IntegrationType extends js.Any
object IntegrationType {
  val EVENT = "EVENT".asInstanceOf[IntegrationType]

  @inline def values: js.Array[IntegrationType] = js.Array(EVENT)
}

@js.native
sealed trait PhoneNumberCountryCode extends js.Any
object PhoneNumberCountryCode {
  val AF = "AF".asInstanceOf[PhoneNumberCountryCode]
  val AL = "AL".asInstanceOf[PhoneNumberCountryCode]
  val DZ = "DZ".asInstanceOf[PhoneNumberCountryCode]
  val AS = "AS".asInstanceOf[PhoneNumberCountryCode]
  val AD = "AD".asInstanceOf[PhoneNumberCountryCode]
  val AO = "AO".asInstanceOf[PhoneNumberCountryCode]
  val AI = "AI".asInstanceOf[PhoneNumberCountryCode]
  val AQ = "AQ".asInstanceOf[PhoneNumberCountryCode]
  val AG = "AG".asInstanceOf[PhoneNumberCountryCode]
  val AR = "AR".asInstanceOf[PhoneNumberCountryCode]
  val AM = "AM".asInstanceOf[PhoneNumberCountryCode]
  val AW = "AW".asInstanceOf[PhoneNumberCountryCode]
  val AU = "AU".asInstanceOf[PhoneNumberCountryCode]
  val AT = "AT".asInstanceOf[PhoneNumberCountryCode]
  val AZ = "AZ".asInstanceOf[PhoneNumberCountryCode]
  val BS = "BS".asInstanceOf[PhoneNumberCountryCode]
  val BH = "BH".asInstanceOf[PhoneNumberCountryCode]
  val BD = "BD".asInstanceOf[PhoneNumberCountryCode]
  val BB = "BB".asInstanceOf[PhoneNumberCountryCode]
  val BY = "BY".asInstanceOf[PhoneNumberCountryCode]
  val BE = "BE".asInstanceOf[PhoneNumberCountryCode]
  val BZ = "BZ".asInstanceOf[PhoneNumberCountryCode]
  val BJ = "BJ".asInstanceOf[PhoneNumberCountryCode]
  val BM = "BM".asInstanceOf[PhoneNumberCountryCode]
  val BT = "BT".asInstanceOf[PhoneNumberCountryCode]
  val BO = "BO".asInstanceOf[PhoneNumberCountryCode]
  val BA = "BA".asInstanceOf[PhoneNumberCountryCode]
  val BW = "BW".asInstanceOf[PhoneNumberCountryCode]
  val BR = "BR".asInstanceOf[PhoneNumberCountryCode]
  val IO = "IO".asInstanceOf[PhoneNumberCountryCode]
  val VG = "VG".asInstanceOf[PhoneNumberCountryCode]
  val BN = "BN".asInstanceOf[PhoneNumberCountryCode]
  val BG = "BG".asInstanceOf[PhoneNumberCountryCode]
  val BF = "BF".asInstanceOf[PhoneNumberCountryCode]
  val BI = "BI".asInstanceOf[PhoneNumberCountryCode]
  val KH = "KH".asInstanceOf[PhoneNumberCountryCode]
  val CM = "CM".asInstanceOf[PhoneNumberCountryCode]
  val CA = "CA".asInstanceOf[PhoneNumberCountryCode]
  val CV = "CV".asInstanceOf[PhoneNumberCountryCode]
  val KY = "KY".asInstanceOf[PhoneNumberCountryCode]
  val CF = "CF".asInstanceOf[PhoneNumberCountryCode]
  val TD = "TD".asInstanceOf[PhoneNumberCountryCode]
  val CL = "CL".asInstanceOf[PhoneNumberCountryCode]
  val CN = "CN".asInstanceOf[PhoneNumberCountryCode]
  val CX = "CX".asInstanceOf[PhoneNumberCountryCode]
  val CC = "CC".asInstanceOf[PhoneNumberCountryCode]
  val CO = "CO".asInstanceOf[PhoneNumberCountryCode]
  val KM = "KM".asInstanceOf[PhoneNumberCountryCode]
  val CK = "CK".asInstanceOf[PhoneNumberCountryCode]
  val CR = "CR".asInstanceOf[PhoneNumberCountryCode]
  val HR = "HR".asInstanceOf[PhoneNumberCountryCode]
  val CU = "CU".asInstanceOf[PhoneNumberCountryCode]
  val CW = "CW".asInstanceOf[PhoneNumberCountryCode]
  val CY = "CY".asInstanceOf[PhoneNumberCountryCode]
  val CZ = "CZ".asInstanceOf[PhoneNumberCountryCode]
  val CD = "CD".asInstanceOf[PhoneNumberCountryCode]
  val DK = "DK".asInstanceOf[PhoneNumberCountryCode]
  val DJ = "DJ".asInstanceOf[PhoneNumberCountryCode]
  val DM = "DM".asInstanceOf[PhoneNumberCountryCode]
  val DO = "DO".asInstanceOf[PhoneNumberCountryCode]
  val TL = "TL".asInstanceOf[PhoneNumberCountryCode]
  val EC = "EC".asInstanceOf[PhoneNumberCountryCode]
  val EG = "EG".asInstanceOf[PhoneNumberCountryCode]
  val SV = "SV".asInstanceOf[PhoneNumberCountryCode]
  val GQ = "GQ".asInstanceOf[PhoneNumberCountryCode]
  val ER = "ER".asInstanceOf[PhoneNumberCountryCode]
  val EE = "EE".asInstanceOf[PhoneNumberCountryCode]
  val ET = "ET".asInstanceOf[PhoneNumberCountryCode]
  val FK = "FK".asInstanceOf[PhoneNumberCountryCode]
  val FO = "FO".asInstanceOf[PhoneNumberCountryCode]
  val FJ = "FJ".asInstanceOf[PhoneNumberCountryCode]
  val FI = "FI".asInstanceOf[PhoneNumberCountryCode]
  val FR = "FR".asInstanceOf[PhoneNumberCountryCode]
  val PF = "PF".asInstanceOf[PhoneNumberCountryCode]
  val GA = "GA".asInstanceOf[PhoneNumberCountryCode]
  val GM = "GM".asInstanceOf[PhoneNumberCountryCode]
  val GE = "GE".asInstanceOf[PhoneNumberCountryCode]
  val DE = "DE".asInstanceOf[PhoneNumberCountryCode]
  val GH = "GH".asInstanceOf[PhoneNumberCountryCode]
  val GI = "GI".asInstanceOf[PhoneNumberCountryCode]
  val GR = "GR".asInstanceOf[PhoneNumberCountryCode]
  val GL = "GL".asInstanceOf[PhoneNumberCountryCode]
  val GD = "GD".asInstanceOf[PhoneNumberCountryCode]
  val GU = "GU".asInstanceOf[PhoneNumberCountryCode]
  val GT = "GT".asInstanceOf[PhoneNumberCountryCode]
  val GG = "GG".asInstanceOf[PhoneNumberCountryCode]
  val GN = "GN".asInstanceOf[PhoneNumberCountryCode]
  val GW = "GW".asInstanceOf[PhoneNumberCountryCode]
  val GY = "GY".asInstanceOf[PhoneNumberCountryCode]
  val HT = "HT".asInstanceOf[PhoneNumberCountryCode]
  val HN = "HN".asInstanceOf[PhoneNumberCountryCode]
  val HK = "HK".asInstanceOf[PhoneNumberCountryCode]
  val HU = "HU".asInstanceOf[PhoneNumberCountryCode]
  val IS = "IS".asInstanceOf[PhoneNumberCountryCode]
  val IN = "IN".asInstanceOf[PhoneNumberCountryCode]
  val ID = "ID".asInstanceOf[PhoneNumberCountryCode]
  val IR = "IR".asInstanceOf[PhoneNumberCountryCode]
  val IQ = "IQ".asInstanceOf[PhoneNumberCountryCode]
  val IE = "IE".asInstanceOf[PhoneNumberCountryCode]
  val IM = "IM".asInstanceOf[PhoneNumberCountryCode]
  val IL = "IL".asInstanceOf[PhoneNumberCountryCode]
  val IT = "IT".asInstanceOf[PhoneNumberCountryCode]
  val CI = "CI".asInstanceOf[PhoneNumberCountryCode]
  val JM = "JM".asInstanceOf[PhoneNumberCountryCode]
  val JP = "JP".asInstanceOf[PhoneNumberCountryCode]
  val JE = "JE".asInstanceOf[PhoneNumberCountryCode]
  val JO = "JO".asInstanceOf[PhoneNumberCountryCode]
  val KZ = "KZ".asInstanceOf[PhoneNumberCountryCode]
  val KE = "KE".asInstanceOf[PhoneNumberCountryCode]
  val KI = "KI".asInstanceOf[PhoneNumberCountryCode]
  val KW = "KW".asInstanceOf[PhoneNumberCountryCode]
  val KG = "KG".asInstanceOf[PhoneNumberCountryCode]
  val LA = "LA".asInstanceOf[PhoneNumberCountryCode]
  val LV = "LV".asInstanceOf[PhoneNumberCountryCode]
  val LB = "LB".asInstanceOf[PhoneNumberCountryCode]
  val LS = "LS".asInstanceOf[PhoneNumberCountryCode]
  val LR = "LR".asInstanceOf[PhoneNumberCountryCode]
  val LY = "LY".asInstanceOf[PhoneNumberCountryCode]
  val LI = "LI".asInstanceOf[PhoneNumberCountryCode]
  val LT = "LT".asInstanceOf[PhoneNumberCountryCode]
  val LU = "LU".asInstanceOf[PhoneNumberCountryCode]
  val MO = "MO".asInstanceOf[PhoneNumberCountryCode]
  val MK = "MK".asInstanceOf[PhoneNumberCountryCode]
  val MG = "MG".asInstanceOf[PhoneNumberCountryCode]
  val MW = "MW".asInstanceOf[PhoneNumberCountryCode]
  val MY = "MY".asInstanceOf[PhoneNumberCountryCode]
  val MV = "MV".asInstanceOf[PhoneNumberCountryCode]
  val ML = "ML".asInstanceOf[PhoneNumberCountryCode]
  val MT = "MT".asInstanceOf[PhoneNumberCountryCode]
  val MH = "MH".asInstanceOf[PhoneNumberCountryCode]
  val MR = "MR".asInstanceOf[PhoneNumberCountryCode]
  val MU = "MU".asInstanceOf[PhoneNumberCountryCode]
  val YT = "YT".asInstanceOf[PhoneNumberCountryCode]
  val MX = "MX".asInstanceOf[PhoneNumberCountryCode]
  val FM = "FM".asInstanceOf[PhoneNumberCountryCode]
  val MD = "MD".asInstanceOf[PhoneNumberCountryCode]
  val MC = "MC".asInstanceOf[PhoneNumberCountryCode]
  val MN = "MN".asInstanceOf[PhoneNumberCountryCode]
  val ME = "ME".asInstanceOf[PhoneNumberCountryCode]
  val MS = "MS".asInstanceOf[PhoneNumberCountryCode]
  val MA = "MA".asInstanceOf[PhoneNumberCountryCode]
  val MZ = "MZ".asInstanceOf[PhoneNumberCountryCode]
  val MM = "MM".asInstanceOf[PhoneNumberCountryCode]
  val NA = "NA".asInstanceOf[PhoneNumberCountryCode]
  val NR = "NR".asInstanceOf[PhoneNumberCountryCode]
  val NP = "NP".asInstanceOf[PhoneNumberCountryCode]
  val NL = "NL".asInstanceOf[PhoneNumberCountryCode]
  val AN = "AN".asInstanceOf[PhoneNumberCountryCode]
  val NC = "NC".asInstanceOf[PhoneNumberCountryCode]
  val NZ = "NZ".asInstanceOf[PhoneNumberCountryCode]
  val NI = "NI".asInstanceOf[PhoneNumberCountryCode]
  val NE = "NE".asInstanceOf[PhoneNumberCountryCode]
  val NG = "NG".asInstanceOf[PhoneNumberCountryCode]
  val NU = "NU".asInstanceOf[PhoneNumberCountryCode]
  val KP = "KP".asInstanceOf[PhoneNumberCountryCode]
  val MP = "MP".asInstanceOf[PhoneNumberCountryCode]
  val NO = "NO".asInstanceOf[PhoneNumberCountryCode]
  val OM = "OM".asInstanceOf[PhoneNumberCountryCode]
  val PK = "PK".asInstanceOf[PhoneNumberCountryCode]
  val PW = "PW".asInstanceOf[PhoneNumberCountryCode]
  val PA = "PA".asInstanceOf[PhoneNumberCountryCode]
  val PG = "PG".asInstanceOf[PhoneNumberCountryCode]
  val PY = "PY".asInstanceOf[PhoneNumberCountryCode]
  val PE = "PE".asInstanceOf[PhoneNumberCountryCode]
  val PH = "PH".asInstanceOf[PhoneNumberCountryCode]
  val PN = "PN".asInstanceOf[PhoneNumberCountryCode]
  val PL = "PL".asInstanceOf[PhoneNumberCountryCode]
  val PT = "PT".asInstanceOf[PhoneNumberCountryCode]
  val PR = "PR".asInstanceOf[PhoneNumberCountryCode]
  val QA = "QA".asInstanceOf[PhoneNumberCountryCode]
  val CG = "CG".asInstanceOf[PhoneNumberCountryCode]
  val RE = "RE".asInstanceOf[PhoneNumberCountryCode]
  val RO = "RO".asInstanceOf[PhoneNumberCountryCode]
  val RU = "RU".asInstanceOf[PhoneNumberCountryCode]
  val RW = "RW".asInstanceOf[PhoneNumberCountryCode]
  val BL = "BL".asInstanceOf[PhoneNumberCountryCode]
  val SH = "SH".asInstanceOf[PhoneNumberCountryCode]
  val KN = "KN".asInstanceOf[PhoneNumberCountryCode]
  val LC = "LC".asInstanceOf[PhoneNumberCountryCode]
  val MF = "MF".asInstanceOf[PhoneNumberCountryCode]
  val PM = "PM".asInstanceOf[PhoneNumberCountryCode]
  val VC = "VC".asInstanceOf[PhoneNumberCountryCode]
  val WS = "WS".asInstanceOf[PhoneNumberCountryCode]
  val SM = "SM".asInstanceOf[PhoneNumberCountryCode]
  val ST = "ST".asInstanceOf[PhoneNumberCountryCode]
  val SA = "SA".asInstanceOf[PhoneNumberCountryCode]
  val SN = "SN".asInstanceOf[PhoneNumberCountryCode]
  val RS = "RS".asInstanceOf[PhoneNumberCountryCode]
  val SC = "SC".asInstanceOf[PhoneNumberCountryCode]
  val SL = "SL".asInstanceOf[PhoneNumberCountryCode]
  val SG = "SG".asInstanceOf[PhoneNumberCountryCode]
  val SX = "SX".asInstanceOf[PhoneNumberCountryCode]
  val SK = "SK".asInstanceOf[PhoneNumberCountryCode]
  val SI = "SI".asInstanceOf[PhoneNumberCountryCode]
  val SB = "SB".asInstanceOf[PhoneNumberCountryCode]
  val SO = "SO".asInstanceOf[PhoneNumberCountryCode]
  val ZA = "ZA".asInstanceOf[PhoneNumberCountryCode]
  val KR = "KR".asInstanceOf[PhoneNumberCountryCode]
  val ES = "ES".asInstanceOf[PhoneNumberCountryCode]
  val LK = "LK".asInstanceOf[PhoneNumberCountryCode]
  val SD = "SD".asInstanceOf[PhoneNumberCountryCode]
  val SR = "SR".asInstanceOf[PhoneNumberCountryCode]
  val SJ = "SJ".asInstanceOf[PhoneNumberCountryCode]
  val SZ = "SZ".asInstanceOf[PhoneNumberCountryCode]
  val SE = "SE".asInstanceOf[PhoneNumberCountryCode]
  val CH = "CH".asInstanceOf[PhoneNumberCountryCode]
  val SY = "SY".asInstanceOf[PhoneNumberCountryCode]
  val TW = "TW".asInstanceOf[PhoneNumberCountryCode]
  val TJ = "TJ".asInstanceOf[PhoneNumberCountryCode]
  val TZ = "TZ".asInstanceOf[PhoneNumberCountryCode]
  val TH = "TH".asInstanceOf[PhoneNumberCountryCode]
  val TG = "TG".asInstanceOf[PhoneNumberCountryCode]
  val TK = "TK".asInstanceOf[PhoneNumberCountryCode]
  val TO = "TO".asInstanceOf[PhoneNumberCountryCode]
  val TT = "TT".asInstanceOf[PhoneNumberCountryCode]
  val TN = "TN".asInstanceOf[PhoneNumberCountryCode]
  val TR = "TR".asInstanceOf[PhoneNumberCountryCode]
  val TM = "TM".asInstanceOf[PhoneNumberCountryCode]
  val TC = "TC".asInstanceOf[PhoneNumberCountryCode]
  val TV = "TV".asInstanceOf[PhoneNumberCountryCode]
  val VI = "VI".asInstanceOf[PhoneNumberCountryCode]
  val UG = "UG".asInstanceOf[PhoneNumberCountryCode]
  val UA = "UA".asInstanceOf[PhoneNumberCountryCode]
  val AE = "AE".asInstanceOf[PhoneNumberCountryCode]
  val GB = "GB".asInstanceOf[PhoneNumberCountryCode]
  val US = "US".asInstanceOf[PhoneNumberCountryCode]
  val UY = "UY".asInstanceOf[PhoneNumberCountryCode]
  val UZ = "UZ".asInstanceOf[PhoneNumberCountryCode]
  val VU = "VU".asInstanceOf[PhoneNumberCountryCode]
  val VA = "VA".asInstanceOf[PhoneNumberCountryCode]
  val VE = "VE".asInstanceOf[PhoneNumberCountryCode]
  val VN = "VN".asInstanceOf[PhoneNumberCountryCode]
  val WF = "WF".asInstanceOf[PhoneNumberCountryCode]
  val EH = "EH".asInstanceOf[PhoneNumberCountryCode]
  val YE = "YE".asInstanceOf[PhoneNumberCountryCode]
  val ZM = "ZM".asInstanceOf[PhoneNumberCountryCode]
  val ZW = "ZW".asInstanceOf[PhoneNumberCountryCode]

  @inline def values: js.Array[PhoneNumberCountryCode] = js.Array(
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

@js.native
sealed trait PhoneNumberType extends js.Any
object PhoneNumberType {
  val TOLL_FREE = "TOLL_FREE".asInstanceOf[PhoneNumberType]
  val DID = "DID".asInstanceOf[PhoneNumberType]

  @inline def values: js.Array[PhoneNumberType] = js.Array(TOLL_FREE, DID)
}

@js.native
sealed trait PhoneType extends js.Any
object PhoneType {
  val SOFT_PHONE = "SOFT_PHONE".asInstanceOf[PhoneType]
  val DESK_PHONE = "DESK_PHONE".asInstanceOf[PhoneType]

  @inline def values: js.Array[PhoneType] = js.Array(SOFT_PHONE, DESK_PHONE)
}

@js.native
sealed trait QueueStatus extends js.Any
object QueueStatus {
  val ENABLED = "ENABLED".asInstanceOf[QueueStatus]
  val DISABLED = "DISABLED".asInstanceOf[QueueStatus]

  @inline def values: js.Array[QueueStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait QueueType extends js.Any
object QueueType {
  val STANDARD = "STANDARD".asInstanceOf[QueueType]
  val AGENT = "AGENT".asInstanceOf[QueueType]

  @inline def values: js.Array[QueueType] = js.Array(STANDARD, AGENT)
}

@js.native
sealed trait QuickConnectType extends js.Any
object QuickConnectType {
  val USER = "USER".asInstanceOf[QuickConnectType]
  val QUEUE = "QUEUE".asInstanceOf[QuickConnectType]
  val PHONE_NUMBER = "PHONE_NUMBER".asInstanceOf[QuickConnectType]

  @inline def values: js.Array[QuickConnectType] = js.Array(USER, QUEUE, PHONE_NUMBER)
}

@js.native
sealed trait ReferenceType extends js.Any
object ReferenceType {
  val URL = "URL".asInstanceOf[ReferenceType]

  @inline def values: js.Array[ReferenceType] = js.Array(URL)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val SALESFORCE = "SALESFORCE".asInstanceOf[SourceType]
  val ZENDESK = "ZENDESK".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(SALESFORCE, ZENDESK)
}

@js.native
sealed trait Statistic extends js.Any
object Statistic {
  val SUM = "SUM".asInstanceOf[Statistic]
  val MAX = "MAX".asInstanceOf[Statistic]
  val AVG = "AVG".asInstanceOf[Statistic]

  @inline def values: js.Array[Statistic] = js.Array(SUM, MAX, AVG)
}

@js.native
sealed trait StorageType extends js.Any
object StorageType {
  val S3 = "S3".asInstanceOf[StorageType]
  val KINESIS_VIDEO_STREAM = "KINESIS_VIDEO_STREAM".asInstanceOf[StorageType]
  val KINESIS_STREAM = "KINESIS_STREAM".asInstanceOf[StorageType]
  val KINESIS_FIREHOSE = "KINESIS_FIREHOSE".asInstanceOf[StorageType]

  @inline def values: js.Array[StorageType] = js.Array(S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM, KINESIS_FIREHOSE)
}

@js.native
sealed trait Unit extends js.Any
object Unit {
  val SECONDS = "SECONDS".asInstanceOf[Unit]
  val COUNT = "COUNT".asInstanceOf[Unit]
  val PERCENT = "PERCENT".asInstanceOf[Unit]

  @inline def values: js.Array[Unit] = js.Array(SECONDS, COUNT, PERCENT)
}

@js.native
sealed trait UseCaseType extends js.Any
object UseCaseType {
  val RULES_EVALUATION = "RULES_EVALUATION".asInstanceOf[UseCaseType]

  @inline def values: js.Array[UseCaseType] = js.Array(RULES_EVALUATION)
}

@js.native
sealed trait VoiceRecordingTrack extends js.Any
object VoiceRecordingTrack {
  val FROM_AGENT = "FROM_AGENT".asInstanceOf[VoiceRecordingTrack]
  val TO_AGENT = "TO_AGENT".asInstanceOf[VoiceRecordingTrack]
  val ALL = "ALL".asInstanceOf[VoiceRecordingTrack]

  @inline def values: js.Array[VoiceRecordingTrack] = js.Array(FROM_AGENT, TO_AGENT, ALL)
}
