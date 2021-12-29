package facade.amazonaws.services.pinpoint

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Action extends js.Any
object Action {
  val OPEN_APP = "OPEN_APP".asInstanceOf[Action]
  val DEEP_LINK = "DEEP_LINK".asInstanceOf[Action]
  val URL = "URL".asInstanceOf[Action]

  @inline def values = js.Array(OPEN_APP, DEEP_LINK, URL)
}

@js.native
sealed trait AttributeType extends js.Any
object AttributeType {
  val INCLUSIVE = "INCLUSIVE".asInstanceOf[AttributeType]
  val EXCLUSIVE = "EXCLUSIVE".asInstanceOf[AttributeType]
  val CONTAINS = "CONTAINS".asInstanceOf[AttributeType]
  val BEFORE = "BEFORE".asInstanceOf[AttributeType]
  val AFTER = "AFTER".asInstanceOf[AttributeType]
  val ON = "ON".asInstanceOf[AttributeType]
  val BETWEEN = "BETWEEN".asInstanceOf[AttributeType]

  @inline def values = js.Array(INCLUSIVE, EXCLUSIVE, CONTAINS, BEFORE, AFTER, ON, BETWEEN)
}

@js.native
sealed trait CampaignStatus extends js.Any
object CampaignStatus {
  val SCHEDULED = "SCHEDULED".asInstanceOf[CampaignStatus]
  val EXECUTING = "EXECUTING".asInstanceOf[CampaignStatus]
  val PENDING_NEXT_RUN = "PENDING_NEXT_RUN".asInstanceOf[CampaignStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[CampaignStatus]
  val PAUSED = "PAUSED".asInstanceOf[CampaignStatus]
  val DELETED = "DELETED".asInstanceOf[CampaignStatus]
  val INVALID = "INVALID".asInstanceOf[CampaignStatus]

  @inline def values = js.Array(SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED, DELETED, INVALID)
}

@js.native
sealed trait ChannelType extends js.Any
object ChannelType {
  val PUSH = "PUSH".asInstanceOf[ChannelType]
  val GCM = "GCM".asInstanceOf[ChannelType]
  val APNS = "APNS".asInstanceOf[ChannelType]
  val APNS_SANDBOX = "APNS_SANDBOX".asInstanceOf[ChannelType]
  val APNS_VOIP = "APNS_VOIP".asInstanceOf[ChannelType]
  val APNS_VOIP_SANDBOX = "APNS_VOIP_SANDBOX".asInstanceOf[ChannelType]
  val ADM = "ADM".asInstanceOf[ChannelType]
  val SMS = "SMS".asInstanceOf[ChannelType]
  val VOICE = "VOICE".asInstanceOf[ChannelType]
  val EMAIL = "EMAIL".asInstanceOf[ChannelType]
  val BAIDU = "BAIDU".asInstanceOf[ChannelType]
  val CUSTOM = "CUSTOM".asInstanceOf[ChannelType]

  @inline def values = js.Array(PUSH, GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM)
}

@js.native
sealed trait DeliveryStatus extends js.Any
object DeliveryStatus {
  val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[DeliveryStatus]
  val THROTTLED = "THROTTLED".asInstanceOf[DeliveryStatus]
  val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[DeliveryStatus]
  val PERMANENT_FAILURE = "PERMANENT_FAILURE".asInstanceOf[DeliveryStatus]
  val UNKNOWN_FAILURE = "UNKNOWN_FAILURE".asInstanceOf[DeliveryStatus]
  val OPT_OUT = "OPT_OUT".asInstanceOf[DeliveryStatus]
  val DUPLICATE = "DUPLICATE".asInstanceOf[DeliveryStatus]

  @inline def values = js.Array(SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE, PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE)
}

@js.native
sealed trait DimensionType extends js.Any
object DimensionType {
  val INCLUSIVE = "INCLUSIVE".asInstanceOf[DimensionType]
  val EXCLUSIVE = "EXCLUSIVE".asInstanceOf[DimensionType]

  @inline def values = js.Array(INCLUSIVE, EXCLUSIVE)
}

@js.native
sealed trait Duration extends js.Any
object Duration {
  val HR_24 = "HR_24".asInstanceOf[Duration]
  val DAY_7 = "DAY_7".asInstanceOf[Duration]
  val DAY_14 = "DAY_14".asInstanceOf[Duration]
  val DAY_30 = "DAY_30".asInstanceOf[Duration]

  @inline def values = js.Array(HR_24, DAY_7, DAY_14, DAY_30)
}

@js.native
sealed trait FilterType extends js.Any
object FilterType {
  val SYSTEM = "SYSTEM".asInstanceOf[FilterType]
  val ENDPOINT = "ENDPOINT".asInstanceOf[FilterType]

  @inline def values = js.Array(SYSTEM, ENDPOINT)
}

@js.native
sealed trait Format extends js.Any
object Format {
  val CSV = "CSV".asInstanceOf[Format]
  val JSON = "JSON".asInstanceOf[Format]

  @inline def values = js.Array(CSV, JSON)
}

@js.native
sealed trait Frequency extends js.Any
object Frequency {
  val ONCE = "ONCE".asInstanceOf[Frequency]
  val HOURLY = "HOURLY".asInstanceOf[Frequency]
  val DAILY = "DAILY".asInstanceOf[Frequency]
  val WEEKLY = "WEEKLY".asInstanceOf[Frequency]
  val MONTHLY = "MONTHLY".asInstanceOf[Frequency]
  val EVENT = "EVENT".asInstanceOf[Frequency]

  @inline def values = js.Array(ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT)
}

@js.native
sealed trait Include extends js.Any
object Include {
  val ALL = "ALL".asInstanceOf[Include]
  val ANY = "ANY".asInstanceOf[Include]
  val NONE = "NONE".asInstanceOf[Include]

  @inline def values = js.Array(ALL, ANY, NONE)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val CREATED = "CREATED".asInstanceOf[JobStatus]
  val PREPARING_FOR_INITIALIZATION = "PREPARING_FOR_INITIALIZATION".asInstanceOf[JobStatus]
  val INITIALIZING = "INITIALIZING".asInstanceOf[JobStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[JobStatus]
  val PENDING_JOB = "PENDING_JOB".asInstanceOf[JobStatus]
  val COMPLETING = "COMPLETING".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val FAILING = "FAILING".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]

  @inline def values = js.Array(CREATED, PREPARING_FOR_INITIALIZATION, INITIALIZING, PROCESSING, PENDING_JOB, COMPLETING, COMPLETED, FAILING, FAILED)
}

@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val TRANSACTIONAL = "TRANSACTIONAL".asInstanceOf[MessageType]
  val PROMOTIONAL = "PROMOTIONAL".asInstanceOf[MessageType]

  @inline def values = js.Array(TRANSACTIONAL, PROMOTIONAL)
}

@js.native
sealed trait Mode extends js.Any
object Mode {
  val DELIVERY = "DELIVERY".asInstanceOf[Mode]
  val FILTER = "FILTER".asInstanceOf[Mode]

  @inline def values = js.Array(DELIVERY, FILTER)
}

@js.native
sealed trait Operator extends js.Any
object Operator {
  val ALL = "ALL".asInstanceOf[Operator]
  val ANY = "ANY".asInstanceOf[Operator]

  @inline def values = js.Array(ALL, ANY)
}

@js.native
sealed trait RecencyType extends js.Any
object RecencyType {
  val ACTIVE = "ACTIVE".asInstanceOf[RecencyType]
  val INACTIVE = "INACTIVE".asInstanceOf[RecencyType]

  @inline def values = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait SegmentType extends js.Any
object SegmentType {
  val DIMENSIONAL = "DIMENSIONAL".asInstanceOf[SegmentType]
  val IMPORT = "IMPORT".asInstanceOf[SegmentType]

  @inline def values = js.Array(DIMENSIONAL, IMPORT)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val ALL = "ALL".asInstanceOf[SourceType]
  val ANY = "ANY".asInstanceOf[SourceType]
  val NONE = "NONE".asInstanceOf[SourceType]

  @inline def values = js.Array(ALL, ANY, NONE)
}

@js.native
sealed trait State extends js.Any
object State {
  val DRAFT = "DRAFT".asInstanceOf[State]
  val ACTIVE = "ACTIVE".asInstanceOf[State]
  val COMPLETED = "COMPLETED".asInstanceOf[State]
  val CANCELLED = "CANCELLED".asInstanceOf[State]
  val CLOSED = "CLOSED".asInstanceOf[State]
  val PAUSED = "PAUSED".asInstanceOf[State]

  @inline def values = js.Array(DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED, PAUSED)
}

@js.native
sealed trait TemplateType extends js.Any
object TemplateType {
  val EMAIL = "EMAIL".asInstanceOf[TemplateType]
  val SMS = "SMS".asInstanceOf[TemplateType]
  val VOICE = "VOICE".asInstanceOf[TemplateType]
  val PUSH = "PUSH".asInstanceOf[TemplateType]

  @inline def values = js.Array(EMAIL, SMS, VOICE, PUSH)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val ALL = "ALL".asInstanceOf[Type]
  val ANY = "ANY".asInstanceOf[Type]
  val NONE = "NONE".asInstanceOf[Type]

  @inline def values = js.Array(ALL, ANY, NONE)
}

@js.native
sealed trait __EndpointTypesElement extends js.Any
object __EndpointTypesElement {
  val PUSH = "PUSH".asInstanceOf[__EndpointTypesElement]
  val GCM = "GCM".asInstanceOf[__EndpointTypesElement]
  val APNS = "APNS".asInstanceOf[__EndpointTypesElement]
  val APNS_SANDBOX = "APNS_SANDBOX".asInstanceOf[__EndpointTypesElement]
  val APNS_VOIP = "APNS_VOIP".asInstanceOf[__EndpointTypesElement]
  val APNS_VOIP_SANDBOX = "APNS_VOIP_SANDBOX".asInstanceOf[__EndpointTypesElement]
  val ADM = "ADM".asInstanceOf[__EndpointTypesElement]
  val SMS = "SMS".asInstanceOf[__EndpointTypesElement]
  val VOICE = "VOICE".asInstanceOf[__EndpointTypesElement]
  val EMAIL = "EMAIL".asInstanceOf[__EndpointTypesElement]
  val BAIDU = "BAIDU".asInstanceOf[__EndpointTypesElement]
  val CUSTOM = "CUSTOM".asInstanceOf[__EndpointTypesElement]

  @inline def values = js.Array(PUSH, GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM)
}

