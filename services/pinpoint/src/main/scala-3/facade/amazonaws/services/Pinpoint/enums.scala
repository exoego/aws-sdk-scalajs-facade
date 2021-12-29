package facade.amazonaws.services.pinpoint

import scalajs._

type Action = "OPEN_APP" | "DEEP_LINK" | "URL"
object Action {
  val OPEN_APP: "OPEN_APP" = "OPEN_APP"
  val DEEP_LINK: "DEEP_LINK" = "DEEP_LINK"
  val URL: "URL" = "URL"

  @inline def values = js.Array[Action](OPEN_APP, DEEP_LINK, URL)
}

type AttributeType = "INCLUSIVE" | "EXCLUSIVE" | "CONTAINS" | "BEFORE" | "AFTER" | "ON" | "BETWEEN"
object AttributeType {
  val INCLUSIVE: "INCLUSIVE" = "INCLUSIVE"
  val EXCLUSIVE: "EXCLUSIVE" = "EXCLUSIVE"
  val CONTAINS: "CONTAINS" = "CONTAINS"
  val BEFORE: "BEFORE" = "BEFORE"
  val AFTER: "AFTER" = "AFTER"
  val ON: "ON" = "ON"
  val BETWEEN: "BETWEEN" = "BETWEEN"

  @inline def values = js.Array[AttributeType](INCLUSIVE, EXCLUSIVE, CONTAINS, BEFORE, AFTER, ON, BETWEEN)
}

type CampaignStatus = "SCHEDULED" | "EXECUTING" | "PENDING_NEXT_RUN" | "COMPLETED" | "PAUSED" | "DELETED" | "INVALID"
object CampaignStatus {
  val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  val EXECUTING: "EXECUTING" = "EXECUTING"
  val PENDING_NEXT_RUN: "PENDING_NEXT_RUN" = "PENDING_NEXT_RUN"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val PAUSED: "PAUSED" = "PAUSED"
  val DELETED: "DELETED" = "DELETED"
  val INVALID: "INVALID" = "INVALID"

  @inline def values = js.Array[CampaignStatus](SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED, DELETED, INVALID)
}

type ChannelType = "PUSH" | "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM"
object ChannelType {
  val PUSH: "PUSH" = "PUSH"
  val GCM: "GCM" = "GCM"
  val APNS: "APNS" = "APNS"
  val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  val APNS_VOIP: "APNS_VOIP" = "APNS_VOIP"
  val APNS_VOIP_SANDBOX: "APNS_VOIP_SANDBOX" = "APNS_VOIP_SANDBOX"
  val ADM: "ADM" = "ADM"
  val SMS: "SMS" = "SMS"
  val VOICE: "VOICE" = "VOICE"
  val EMAIL: "EMAIL" = "EMAIL"
  val BAIDU: "BAIDU" = "BAIDU"
  val CUSTOM: "CUSTOM" = "CUSTOM"

  @inline def values = js.Array[ChannelType](PUSH, GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM)
}

type DeliveryStatus = "SUCCESSFUL" | "THROTTLED" | "TEMPORARY_FAILURE" | "PERMANENT_FAILURE" | "UNKNOWN_FAILURE" | "OPT_OUT" | "DUPLICATE"
object DeliveryStatus {
  val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  val THROTTLED: "THROTTLED" = "THROTTLED"
  val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"
  val PERMANENT_FAILURE: "PERMANENT_FAILURE" = "PERMANENT_FAILURE"
  val UNKNOWN_FAILURE: "UNKNOWN_FAILURE" = "UNKNOWN_FAILURE"
  val OPT_OUT: "OPT_OUT" = "OPT_OUT"
  val DUPLICATE: "DUPLICATE" = "DUPLICATE"

  @inline def values = js.Array[DeliveryStatus](SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE, PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE)
}

type DimensionType = "INCLUSIVE" | "EXCLUSIVE"
object DimensionType {
  val INCLUSIVE: "INCLUSIVE" = "INCLUSIVE"
  val EXCLUSIVE: "EXCLUSIVE" = "EXCLUSIVE"

  @inline def values = js.Array[DimensionType](INCLUSIVE, EXCLUSIVE)
}

type Duration = "HR_24" | "DAY_7" | "DAY_14" | "DAY_30"
object Duration {
  val HR_24: "HR_24" = "HR_24"
  val DAY_7: "DAY_7" = "DAY_7"
  val DAY_14: "DAY_14" = "DAY_14"
  val DAY_30: "DAY_30" = "DAY_30"

  @inline def values = js.Array[Duration](HR_24, DAY_7, DAY_14, DAY_30)
}

type FilterType = "SYSTEM" | "ENDPOINT"
object FilterType {
  val SYSTEM: "SYSTEM" = "SYSTEM"
  val ENDPOINT: "ENDPOINT" = "ENDPOINT"

  @inline def values = js.Array[FilterType](SYSTEM, ENDPOINT)
}

type Format = "CSV" | "JSON"
object Format {
  val CSV: "CSV" = "CSV"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[Format](CSV, JSON)
}

type Frequency = "ONCE" | "HOURLY" | "DAILY" | "WEEKLY" | "MONTHLY" | "EVENT"
object Frequency {
  val ONCE: "ONCE" = "ONCE"
  val HOURLY: "HOURLY" = "HOURLY"
  val DAILY: "DAILY" = "DAILY"
  val WEEKLY: "WEEKLY" = "WEEKLY"
  val MONTHLY: "MONTHLY" = "MONTHLY"
  val EVENT: "EVENT" = "EVENT"

  @inline def values = js.Array[Frequency](ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT)
}

type Include = "ALL" | "ANY" | "NONE"
object Include {
  val ALL: "ALL" = "ALL"
  val ANY: "ANY" = "ANY"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Include](ALL, ANY, NONE)
}

type JobStatus = "CREATED" | "PREPARING_FOR_INITIALIZATION" | "INITIALIZING" | "PROCESSING" | "PENDING_JOB" | "COMPLETING" | "COMPLETED" | "FAILING" | "FAILED"
object JobStatus {
  val CREATED: "CREATED" = "CREATED"
  val PREPARING_FOR_INITIALIZATION: "PREPARING_FOR_INITIALIZATION" = "PREPARING_FOR_INITIALIZATION"
  val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  val PROCESSING: "PROCESSING" = "PROCESSING"
  val PENDING_JOB: "PENDING_JOB" = "PENDING_JOB"
  val COMPLETING: "COMPLETING" = "COMPLETING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILING: "FAILING" = "FAILING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[JobStatus](CREATED, PREPARING_FOR_INITIALIZATION, INITIALIZING, PROCESSING, PENDING_JOB, COMPLETING, COMPLETED, FAILING, FAILED)
}

type MessageType = "TRANSACTIONAL" | "PROMOTIONAL"
object MessageType {
  val TRANSACTIONAL: "TRANSACTIONAL" = "TRANSACTIONAL"
  val PROMOTIONAL: "PROMOTIONAL" = "PROMOTIONAL"

  @inline def values = js.Array[MessageType](TRANSACTIONAL, PROMOTIONAL)
}

type Mode = "DELIVERY" | "FILTER"
object Mode {
  val DELIVERY: "DELIVERY" = "DELIVERY"
  val FILTER: "FILTER" = "FILTER"

  @inline def values = js.Array[Mode](DELIVERY, FILTER)
}

type Operator = "ALL" | "ANY"
object Operator {
  val ALL: "ALL" = "ALL"
  val ANY: "ANY" = "ANY"

  @inline def values = js.Array[Operator](ALL, ANY)
}

type RecencyType = "ACTIVE" | "INACTIVE"
object RecencyType {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[RecencyType](ACTIVE, INACTIVE)
}

type SegmentType = "DIMENSIONAL" | "IMPORT"
object SegmentType {
  val DIMENSIONAL: "DIMENSIONAL" = "DIMENSIONAL"
  val IMPORT: "IMPORT" = "IMPORT"

  @inline def values = js.Array[SegmentType](DIMENSIONAL, IMPORT)
}

type SourceType = "ALL" | "ANY" | "NONE"
object SourceType {
  val ALL: "ALL" = "ALL"
  val ANY: "ANY" = "ANY"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[SourceType](ALL, ANY, NONE)
}

type State = "DRAFT" | "ACTIVE" | "COMPLETED" | "CANCELLED" | "CLOSED" | "PAUSED"
object State {
  val DRAFT: "DRAFT" = "DRAFT"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val CLOSED: "CLOSED" = "CLOSED"
  val PAUSED: "PAUSED" = "PAUSED"

  @inline def values = js.Array[State](DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED, PAUSED)
}

type TemplateType = "EMAIL" | "SMS" | "VOICE" | "PUSH"
object TemplateType {
  val EMAIL: "EMAIL" = "EMAIL"
  val SMS: "SMS" = "SMS"
  val VOICE: "VOICE" = "VOICE"
  val PUSH: "PUSH" = "PUSH"

  @inline def values = js.Array[TemplateType](EMAIL, SMS, VOICE, PUSH)
}

type Type = "ALL" | "ANY" | "NONE"
object Type {
  val ALL: "ALL" = "ALL"
  val ANY: "ANY" = "ANY"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Type](ALL, ANY, NONE)
}

type __EndpointTypesElement = "PUSH" | "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM"
object __EndpointTypesElement {
  val PUSH: "PUSH" = "PUSH"
  val GCM: "GCM" = "GCM"
  val APNS: "APNS" = "APNS"
  val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  val APNS_VOIP: "APNS_VOIP" = "APNS_VOIP"
  val APNS_VOIP_SANDBOX: "APNS_VOIP_SANDBOX" = "APNS_VOIP_SANDBOX"
  val ADM: "ADM" = "ADM"
  val SMS: "SMS" = "SMS"
  val VOICE: "VOICE" = "VOICE"
  val EMAIL: "EMAIL" = "EMAIL"
  val BAIDU: "BAIDU" = "BAIDU"
  val CUSTOM: "CUSTOM" = "CUSTOM"

  @inline def values = js.Array[__EndpointTypesElement](PUSH, GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM)
}
