package facade.amazonaws.services.pinpointsmsvoicev2

import scalajs.js

@js.native
sealed trait AccountAttributeName extends js.Any
object AccountAttributeName {
  val ACCOUNT_TIER = "ACCOUNT_TIER".asInstanceOf[AccountAttributeName]

  @inline def values: js.Array[AccountAttributeName] = js.Array(ACCOUNT_TIER)
}

@js.native
sealed trait AccountLimitName extends js.Any
object AccountLimitName {
  val PHONE_NUMBERS = "PHONE_NUMBERS".asInstanceOf[AccountLimitName]
  val POOLS = "POOLS".asInstanceOf[AccountLimitName]
  val CONFIGURATION_SETS = "CONFIGURATION_SETS".asInstanceOf[AccountLimitName]
  val OPT_OUT_LISTS = "OPT_OUT_LISTS".asInstanceOf[AccountLimitName]

  @inline def values: js.Array[AccountLimitName] = js.Array(PHONE_NUMBERS, POOLS, CONFIGURATION_SETS, OPT_OUT_LISTS)
}

@js.native
sealed trait ConfigurationSetFilterName extends js.Any
object ConfigurationSetFilterName {
  val `event-destination-name` = "event-destination-name".asInstanceOf[ConfigurationSetFilterName]
  val `matching-event-types` = "matching-event-types".asInstanceOf[ConfigurationSetFilterName]
  val `default-message-type` = "default-message-type".asInstanceOf[ConfigurationSetFilterName]
  val `default-sender-id` = "default-sender-id".asInstanceOf[ConfigurationSetFilterName]

  @inline def values: js.Array[ConfigurationSetFilterName] = js.Array(`event-destination-name`, `matching-event-types`, `default-message-type`, `default-sender-id`)
}

@js.native
sealed trait DestinationCountryParameterKey extends js.Any
object DestinationCountryParameterKey {
  val IN_TEMPLATE_ID = "IN_TEMPLATE_ID".asInstanceOf[DestinationCountryParameterKey]
  val IN_ENTITY_ID = "IN_ENTITY_ID".asInstanceOf[DestinationCountryParameterKey]

  @inline def values: js.Array[DestinationCountryParameterKey] = js.Array(IN_TEMPLATE_ID, IN_ENTITY_ID)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val ALL = "ALL".asInstanceOf[EventType]
  val TEXT_ALL = "TEXT_ALL".asInstanceOf[EventType]
  val TEXT_SENT = "TEXT_SENT".asInstanceOf[EventType]
  val TEXT_PENDING = "TEXT_PENDING".asInstanceOf[EventType]
  val TEXT_QUEUED = "TEXT_QUEUED".asInstanceOf[EventType]
  val TEXT_SUCCESSFUL = "TEXT_SUCCESSFUL".asInstanceOf[EventType]
  val TEXT_DELIVERED = "TEXT_DELIVERED".asInstanceOf[EventType]
  val TEXT_INVALID = "TEXT_INVALID".asInstanceOf[EventType]
  val TEXT_INVALID_MESSAGE = "TEXT_INVALID_MESSAGE".asInstanceOf[EventType]
  val TEXT_UNREACHABLE = "TEXT_UNREACHABLE".asInstanceOf[EventType]
  val TEXT_CARRIER_UNREACHABLE = "TEXT_CARRIER_UNREACHABLE".asInstanceOf[EventType]
  val TEXT_BLOCKED = "TEXT_BLOCKED".asInstanceOf[EventType]
  val TEXT_CARRIER_BLOCKED = "TEXT_CARRIER_BLOCKED".asInstanceOf[EventType]
  val TEXT_SPAM = "TEXT_SPAM".asInstanceOf[EventType]
  val TEXT_UNKNOWN = "TEXT_UNKNOWN".asInstanceOf[EventType]
  val TEXT_TTL_EXPIRED = "TEXT_TTL_EXPIRED".asInstanceOf[EventType]
  val VOICE_ALL = "VOICE_ALL".asInstanceOf[EventType]
  val VOICE_INITIATED = "VOICE_INITIATED".asInstanceOf[EventType]
  val VOICE_RINGING = "VOICE_RINGING".asInstanceOf[EventType]
  val VOICE_ANSWERED = "VOICE_ANSWERED".asInstanceOf[EventType]
  val VOICE_COMPLETED = "VOICE_COMPLETED".asInstanceOf[EventType]
  val VOICE_BUSY = "VOICE_BUSY".asInstanceOf[EventType]
  val VOICE_NO_ANSWER = "VOICE_NO_ANSWER".asInstanceOf[EventType]
  val VOICE_FAILED = "VOICE_FAILED".asInstanceOf[EventType]
  val VOICE_TTL_EXPIRED = "VOICE_TTL_EXPIRED".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(
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

@js.native
sealed trait KeywordAction extends js.Any
object KeywordAction {
  val AUTOMATIC_RESPONSE = "AUTOMATIC_RESPONSE".asInstanceOf[KeywordAction]
  val OPT_OUT = "OPT_OUT".asInstanceOf[KeywordAction]
  val OPT_IN = "OPT_IN".asInstanceOf[KeywordAction]

  @inline def values: js.Array[KeywordAction] = js.Array(AUTOMATIC_RESPONSE, OPT_OUT, OPT_IN)
}

@js.native
sealed trait KeywordFilterName extends js.Any
object KeywordFilterName {
  val `keyword-action` = "keyword-action".asInstanceOf[KeywordFilterName]

  @inline def values: js.Array[KeywordFilterName] = js.Array(`keyword-action`)
}

@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val TRANSACTIONAL = "TRANSACTIONAL".asInstanceOf[MessageType]
  val PROMOTIONAL = "PROMOTIONAL".asInstanceOf[MessageType]

  @inline def values: js.Array[MessageType] = js.Array(TRANSACTIONAL, PROMOTIONAL)
}

@js.native
sealed trait NumberCapability extends js.Any
object NumberCapability {
  val SMS = "SMS".asInstanceOf[NumberCapability]
  val VOICE = "VOICE".asInstanceOf[NumberCapability]

  @inline def values: js.Array[NumberCapability] = js.Array(SMS, VOICE)
}

@js.native
sealed trait NumberStatus extends js.Any
object NumberStatus {
  val PENDING = "PENDING".asInstanceOf[NumberStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[NumberStatus]
  val ASSOCIATING = "ASSOCIATING".asInstanceOf[NumberStatus]
  val DISASSOCIATING = "DISASSOCIATING".asInstanceOf[NumberStatus]
  val DELETED = "DELETED".asInstanceOf[NumberStatus]

  @inline def values: js.Array[NumberStatus] = js.Array(PENDING, ACTIVE, ASSOCIATING, DISASSOCIATING, DELETED)
}

@js.native
sealed trait NumberType extends js.Any
object NumberType {
  val SHORT_CODE = "SHORT_CODE".asInstanceOf[NumberType]
  val LONG_CODE = "LONG_CODE".asInstanceOf[NumberType]
  val TOLL_FREE = "TOLL_FREE".asInstanceOf[NumberType]
  val TEN_DLC = "TEN_DLC".asInstanceOf[NumberType]

  @inline def values: js.Array[NumberType] = js.Array(SHORT_CODE, LONG_CODE, TOLL_FREE, TEN_DLC)
}

@js.native
sealed trait OptedOutFilterName extends js.Any
object OptedOutFilterName {
  val `end-user-opted-out` = "end-user-opted-out".asInstanceOf[OptedOutFilterName]

  @inline def values: js.Array[OptedOutFilterName] = js.Array(`end-user-opted-out`)
}

@js.native
sealed trait PhoneNumberFilterName extends js.Any
object PhoneNumberFilterName {
  val status = "status".asInstanceOf[PhoneNumberFilterName]
  val `iso-country-code` = "iso-country-code".asInstanceOf[PhoneNumberFilterName]
  val `message-type` = "message-type".asInstanceOf[PhoneNumberFilterName]
  val `number-capability` = "number-capability".asInstanceOf[PhoneNumberFilterName]
  val `number-type` = "number-type".asInstanceOf[PhoneNumberFilterName]
  val `two-way-enabled` = "two-way-enabled".asInstanceOf[PhoneNumberFilterName]
  val `self-managed-opt-outs-enabled` = "self-managed-opt-outs-enabled".asInstanceOf[PhoneNumberFilterName]
  val `opt-out-list-name` = "opt-out-list-name".asInstanceOf[PhoneNumberFilterName]
  val `deletion-protection-enabled` = "deletion-protection-enabled".asInstanceOf[PhoneNumberFilterName]

  @inline def values: js.Array[PhoneNumberFilterName] = js.Array(
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

@js.native
sealed trait PoolFilterName extends js.Any
object PoolFilterName {
  val status = "status".asInstanceOf[PoolFilterName]
  val `message-type` = "message-type".asInstanceOf[PoolFilterName]
  val `two-way-enabled` = "two-way-enabled".asInstanceOf[PoolFilterName]
  val `self-managed-opt-outs-enabled` = "self-managed-opt-outs-enabled".asInstanceOf[PoolFilterName]
  val `opt-out-list-name` = "opt-out-list-name".asInstanceOf[PoolFilterName]
  val `shared-routes-enabled` = "shared-routes-enabled".asInstanceOf[PoolFilterName]
  val `deletion-protection-enabled` = "deletion-protection-enabled".asInstanceOf[PoolFilterName]

  @inline def values: js.Array[PoolFilterName] = js.Array(status, `message-type`, `two-way-enabled`, `self-managed-opt-outs-enabled`, `opt-out-list-name`, `shared-routes-enabled`, `deletion-protection-enabled`)
}

@js.native
sealed trait PoolOriginationIdentitiesFilterName extends js.Any
object PoolOriginationIdentitiesFilterName {
  val `iso-country-code` = "iso-country-code".asInstanceOf[PoolOriginationIdentitiesFilterName]
  val `number-capability` = "number-capability".asInstanceOf[PoolOriginationIdentitiesFilterName]

  @inline def values: js.Array[PoolOriginationIdentitiesFilterName] = js.Array(`iso-country-code`, `number-capability`)
}

@js.native
sealed trait PoolStatus extends js.Any
object PoolStatus {
  val CREATING = "CREATING".asInstanceOf[PoolStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[PoolStatus]
  val DELETING = "DELETING".asInstanceOf[PoolStatus]

  @inline def values: js.Array[PoolStatus] = js.Array(CREATING, ACTIVE, DELETING)
}

@js.native
sealed trait RequestableNumberType extends js.Any
object RequestableNumberType {
  val LONG_CODE = "LONG_CODE".asInstanceOf[RequestableNumberType]
  val TOLL_FREE = "TOLL_FREE".asInstanceOf[RequestableNumberType]
  val TEN_DLC = "TEN_DLC".asInstanceOf[RequestableNumberType]

  @inline def values: js.Array[RequestableNumberType] = js.Array(LONG_CODE, TOLL_FREE, TEN_DLC)
}

@js.native
sealed trait SenderIdFilterName extends js.Any
object SenderIdFilterName {
  val `sender-id` = "sender-id".asInstanceOf[SenderIdFilterName]
  val `iso-country-code` = "iso-country-code".asInstanceOf[SenderIdFilterName]
  val `message-type` = "message-type".asInstanceOf[SenderIdFilterName]

  @inline def values: js.Array[SenderIdFilterName] = js.Array(`sender-id`, `iso-country-code`, `message-type`)
}

@js.native
sealed trait SpendLimitName extends js.Any
object SpendLimitName {
  val TEXT_MESSAGE_MONTHLY_SPEND_LIMIT = "TEXT_MESSAGE_MONTHLY_SPEND_LIMIT".asInstanceOf[SpendLimitName]
  val VOICE_MESSAGE_MONTHLY_SPEND_LIMIT = "VOICE_MESSAGE_MONTHLY_SPEND_LIMIT".asInstanceOf[SpendLimitName]

  @inline def values: js.Array[SpendLimitName] = js.Array(TEXT_MESSAGE_MONTHLY_SPEND_LIMIT, VOICE_MESSAGE_MONTHLY_SPEND_LIMIT)
}

@js.native
sealed trait VoiceId extends js.Any
object VoiceId {
  val AMY = "AMY".asInstanceOf[VoiceId]
  val ASTRID = "ASTRID".asInstanceOf[VoiceId]
  val BIANCA = "BIANCA".asInstanceOf[VoiceId]
  val BRIAN = "BRIAN".asInstanceOf[VoiceId]
  val CAMILA = "CAMILA".asInstanceOf[VoiceId]
  val CARLA = "CARLA".asInstanceOf[VoiceId]
  val CARMEN = "CARMEN".asInstanceOf[VoiceId]
  val CELINE = "CELINE".asInstanceOf[VoiceId]
  val CHANTAL = "CHANTAL".asInstanceOf[VoiceId]
  val CONCHITA = "CONCHITA".asInstanceOf[VoiceId]
  val CRISTIANO = "CRISTIANO".asInstanceOf[VoiceId]
  val DORA = "DORA".asInstanceOf[VoiceId]
  val EMMA = "EMMA".asInstanceOf[VoiceId]
  val ENRIQUE = "ENRIQUE".asInstanceOf[VoiceId]
  val EWA = "EWA".asInstanceOf[VoiceId]
  val FILIZ = "FILIZ".asInstanceOf[VoiceId]
  val GERAINT = "GERAINT".asInstanceOf[VoiceId]
  val GIORGIO = "GIORGIO".asInstanceOf[VoiceId]
  val GWYNETH = "GWYNETH".asInstanceOf[VoiceId]
  val HANS = "HANS".asInstanceOf[VoiceId]
  val INES = "INES".asInstanceOf[VoiceId]
  val IVY = "IVY".asInstanceOf[VoiceId]
  val JACEK = "JACEK".asInstanceOf[VoiceId]
  val JAN = "JAN".asInstanceOf[VoiceId]
  val JOANNA = "JOANNA".asInstanceOf[VoiceId]
  val JOEY = "JOEY".asInstanceOf[VoiceId]
  val JUSTIN = "JUSTIN".asInstanceOf[VoiceId]
  val KARL = "KARL".asInstanceOf[VoiceId]
  val KENDRA = "KENDRA".asInstanceOf[VoiceId]
  val KIMBERLY = "KIMBERLY".asInstanceOf[VoiceId]
  val LEA = "LEA".asInstanceOf[VoiceId]
  val LIV = "LIV".asInstanceOf[VoiceId]
  val LOTTE = "LOTTE".asInstanceOf[VoiceId]
  val LUCIA = "LUCIA".asInstanceOf[VoiceId]
  val LUPE = "LUPE".asInstanceOf[VoiceId]
  val MADS = "MADS".asInstanceOf[VoiceId]
  val MAJA = "MAJA".asInstanceOf[VoiceId]
  val MARLENE = "MARLENE".asInstanceOf[VoiceId]
  val MATHIEU = "MATHIEU".asInstanceOf[VoiceId]
  val MATTHEW = "MATTHEW".asInstanceOf[VoiceId]
  val MAXIM = "MAXIM".asInstanceOf[VoiceId]
  val MIA = "MIA".asInstanceOf[VoiceId]
  val MIGUEL = "MIGUEL".asInstanceOf[VoiceId]
  val MIZUKI = "MIZUKI".asInstanceOf[VoiceId]
  val NAJA = "NAJA".asInstanceOf[VoiceId]
  val NICOLE = "NICOLE".asInstanceOf[VoiceId]
  val PENELOPE = "PENELOPE".asInstanceOf[VoiceId]
  val RAVEENA = "RAVEENA".asInstanceOf[VoiceId]
  val RICARDO = "RICARDO".asInstanceOf[VoiceId]
  val RUBEN = "RUBEN".asInstanceOf[VoiceId]
  val RUSSELL = "RUSSELL".asInstanceOf[VoiceId]
  val SALLI = "SALLI".asInstanceOf[VoiceId]
  val SEOYEON = "SEOYEON".asInstanceOf[VoiceId]
  val TAKUMI = "TAKUMI".asInstanceOf[VoiceId]
  val TATYANA = "TATYANA".asInstanceOf[VoiceId]
  val VICKI = "VICKI".asInstanceOf[VoiceId]
  val VITORIA = "VITORIA".asInstanceOf[VoiceId]
  val ZEINA = "ZEINA".asInstanceOf[VoiceId]
  val ZHIYU = "ZHIYU".asInstanceOf[VoiceId]

  @inline def values: js.Array[VoiceId] = js.Array(
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

@js.native
sealed trait VoiceMessageBodyTextType extends js.Any
object VoiceMessageBodyTextType {
  val TEXT = "TEXT".asInstanceOf[VoiceMessageBodyTextType]
  val SSML = "SSML".asInstanceOf[VoiceMessageBodyTextType]

  @inline def values: js.Array[VoiceMessageBodyTextType] = js.Array(TEXT, SSML)
}
