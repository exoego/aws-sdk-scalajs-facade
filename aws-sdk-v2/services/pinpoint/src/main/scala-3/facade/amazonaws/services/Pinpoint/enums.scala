package facade.amazonaws.services.pinpoint

import scalajs.js

type Action = "OPEN_APP" | "DEEP_LINK" | "URL"
object Action {
  inline val OPEN_APP: "OPEN_APP" = "OPEN_APP"
  inline val DEEP_LINK: "DEEP_LINK" = "DEEP_LINK"
  inline val URL: "URL" = "URL"

  inline def values: js.Array[Action] = js.Array(OPEN_APP, DEEP_LINK, URL)
}

type Alignment = "LEFT" | "CENTER" | "RIGHT"
object Alignment {
  inline val LEFT: "LEFT" = "LEFT"
  inline val CENTER: "CENTER" = "CENTER"
  inline val RIGHT: "RIGHT" = "RIGHT"

  inline def values: js.Array[Alignment] = js.Array(LEFT, CENTER, RIGHT)
}

type AttributeType = "INCLUSIVE" | "EXCLUSIVE" | "CONTAINS" | "BEFORE" | "AFTER" | "ON" | "BETWEEN"
object AttributeType {
  inline val INCLUSIVE: "INCLUSIVE" = "INCLUSIVE"
  inline val EXCLUSIVE: "EXCLUSIVE" = "EXCLUSIVE"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val BEFORE: "BEFORE" = "BEFORE"
  inline val AFTER: "AFTER" = "AFTER"
  inline val ON: "ON" = "ON"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[AttributeType] = js.Array(INCLUSIVE, EXCLUSIVE, CONTAINS, BEFORE, AFTER, ON, BETWEEN)
}

type ButtonAction = "LINK" | "DEEP_LINK" | "CLOSE"
object ButtonAction {
  inline val LINK: "LINK" = "LINK"
  inline val DEEP_LINK: "DEEP_LINK" = "DEEP_LINK"
  inline val CLOSE: "CLOSE" = "CLOSE"

  inline def values: js.Array[ButtonAction] = js.Array(LINK, DEEP_LINK, CLOSE)
}

type CampaignStatus = "SCHEDULED" | "EXECUTING" | "PENDING_NEXT_RUN" | "COMPLETED" | "PAUSED" | "DELETED" | "INVALID"
object CampaignStatus {
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  inline val EXECUTING: "EXECUTING" = "EXECUTING"
  inline val PENDING_NEXT_RUN: "PENDING_NEXT_RUN" = "PENDING_NEXT_RUN"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val INVALID: "INVALID" = "INVALID"

  inline def values: js.Array[CampaignStatus] = js.Array(SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED, DELETED, INVALID)
}

type ChannelType = "PUSH" | "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | "IN_APP"
object ChannelType {
  inline val PUSH: "PUSH" = "PUSH"
  inline val GCM: "GCM" = "GCM"
  inline val APNS: "APNS" = "APNS"
  inline val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  inline val APNS_VOIP: "APNS_VOIP" = "APNS_VOIP"
  inline val APNS_VOIP_SANDBOX: "APNS_VOIP_SANDBOX" = "APNS_VOIP_SANDBOX"
  inline val ADM: "ADM" = "ADM"
  inline val SMS: "SMS" = "SMS"
  inline val VOICE: "VOICE" = "VOICE"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val BAIDU: "BAIDU" = "BAIDU"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val IN_APP: "IN_APP" = "IN_APP"

  inline def values: js.Array[ChannelType] = js.Array(PUSH, GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM, IN_APP)
}

type DayOfWeek = "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY"
object DayOfWeek {
  inline val MONDAY: "MONDAY" = "MONDAY"
  inline val TUESDAY: "TUESDAY" = "TUESDAY"
  inline val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  inline val THURSDAY: "THURSDAY" = "THURSDAY"
  inline val FRIDAY: "FRIDAY" = "FRIDAY"
  inline val SATURDAY: "SATURDAY" = "SATURDAY"
  inline val SUNDAY: "SUNDAY" = "SUNDAY"

  inline def values: js.Array[DayOfWeek] = js.Array(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
}

type DeliveryStatus = "SUCCESSFUL" | "THROTTLED" | "TEMPORARY_FAILURE" | "PERMANENT_FAILURE" | "UNKNOWN_FAILURE" | "OPT_OUT" | "DUPLICATE"
object DeliveryStatus {
  inline val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  inline val THROTTLED: "THROTTLED" = "THROTTLED"
  inline val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"
  inline val PERMANENT_FAILURE: "PERMANENT_FAILURE" = "PERMANENT_FAILURE"
  inline val UNKNOWN_FAILURE: "UNKNOWN_FAILURE" = "UNKNOWN_FAILURE"
  inline val OPT_OUT: "OPT_OUT" = "OPT_OUT"
  inline val DUPLICATE: "DUPLICATE" = "DUPLICATE"

  inline def values: js.Array[DeliveryStatus] = js.Array(SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE, PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE)
}

type DimensionType = "INCLUSIVE" | "EXCLUSIVE"
object DimensionType {
  inline val INCLUSIVE: "INCLUSIVE" = "INCLUSIVE"
  inline val EXCLUSIVE: "EXCLUSIVE" = "EXCLUSIVE"

  inline def values: js.Array[DimensionType] = js.Array(INCLUSIVE, EXCLUSIVE)
}

type Duration = "HR_24" | "DAY_7" | "DAY_14" | "DAY_30"
object Duration {
  inline val HR_24: "HR_24" = "HR_24"
  inline val DAY_7: "DAY_7" = "DAY_7"
  inline val DAY_14: "DAY_14" = "DAY_14"
  inline val DAY_30: "DAY_30" = "DAY_30"

  inline def values: js.Array[Duration] = js.Array(HR_24, DAY_7, DAY_14, DAY_30)
}

type FilterType = "SYSTEM" | "ENDPOINT"
object FilterType {
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val ENDPOINT: "ENDPOINT" = "ENDPOINT"

  inline def values: js.Array[FilterType] = js.Array(SYSTEM, ENDPOINT)
}

type Format = "CSV" | "JSON"
object Format {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[Format] = js.Array(CSV, JSON)
}

type Frequency = "ONCE" | "HOURLY" | "DAILY" | "WEEKLY" | "MONTHLY" | "EVENT" | "IN_APP_EVENT"
object Frequency {
  inline val ONCE: "ONCE" = "ONCE"
  inline val HOURLY: "HOURLY" = "HOURLY"
  inline val DAILY: "DAILY" = "DAILY"
  inline val WEEKLY: "WEEKLY" = "WEEKLY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"
  inline val EVENT: "EVENT" = "EVENT"
  inline val IN_APP_EVENT: "IN_APP_EVENT" = "IN_APP_EVENT"

  inline def values: js.Array[Frequency] = js.Array(ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT, IN_APP_EVENT)
}

type Include = "ALL" | "ANY" | "NONE"
object Include {
  inline val ALL: "ALL" = "ALL"
  inline val ANY: "ANY" = "ANY"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Include] = js.Array(ALL, ANY, NONE)
}

type JobStatus = "CREATED" | "PREPARING_FOR_INITIALIZATION" | "INITIALIZING" | "PROCESSING" | "PENDING_JOB" | "COMPLETING" | "COMPLETED" | "FAILING" | "FAILED"
object JobStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val PREPARING_FOR_INITIALIZATION: "PREPARING_FOR_INITIALIZATION" = "PREPARING_FOR_INITIALIZATION"
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val PENDING_JOB: "PENDING_JOB" = "PENDING_JOB"
  inline val COMPLETING: "COMPLETING" = "COMPLETING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILING: "FAILING" = "FAILING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[JobStatus] = js.Array(CREATED, PREPARING_FOR_INITIALIZATION, INITIALIZING, PROCESSING, PENDING_JOB, COMPLETING, COMPLETED, FAILING, FAILED)
}

type Layout = "BOTTOM_BANNER" | "TOP_BANNER" | "OVERLAYS" | "MOBILE_FEED" | "MIDDLE_BANNER" | "CAROUSEL"
object Layout {
  inline val BOTTOM_BANNER: "BOTTOM_BANNER" = "BOTTOM_BANNER"
  inline val TOP_BANNER: "TOP_BANNER" = "TOP_BANNER"
  inline val OVERLAYS: "OVERLAYS" = "OVERLAYS"
  inline val MOBILE_FEED: "MOBILE_FEED" = "MOBILE_FEED"
  inline val MIDDLE_BANNER: "MIDDLE_BANNER" = "MIDDLE_BANNER"
  inline val CAROUSEL: "CAROUSEL" = "CAROUSEL"

  inline def values: js.Array[Layout] = js.Array(BOTTOM_BANNER, TOP_BANNER, OVERLAYS, MOBILE_FEED, MIDDLE_BANNER, CAROUSEL)
}

type MessageType = "TRANSACTIONAL" | "PROMOTIONAL"
object MessageType {
  inline val TRANSACTIONAL: "TRANSACTIONAL" = "TRANSACTIONAL"
  inline val PROMOTIONAL: "PROMOTIONAL" = "PROMOTIONAL"

  inline def values: js.Array[MessageType] = js.Array(TRANSACTIONAL, PROMOTIONAL)
}

type Mode = "DELIVERY" | "FILTER"
object Mode {
  inline val DELIVERY: "DELIVERY" = "DELIVERY"
  inline val FILTER: "FILTER" = "FILTER"

  inline def values: js.Array[Mode] = js.Array(DELIVERY, FILTER)
}

type Operator = "ALL" | "ANY"
object Operator {
  inline val ALL: "ALL" = "ALL"
  inline val ANY: "ANY" = "ANY"

  inline def values: js.Array[Operator] = js.Array(ALL, ANY)
}

type RecencyType = "ACTIVE" | "INACTIVE"
object RecencyType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[RecencyType] = js.Array(ACTIVE, INACTIVE)
}

type SegmentType = "DIMENSIONAL" | "IMPORT"
object SegmentType {
  inline val DIMENSIONAL: "DIMENSIONAL" = "DIMENSIONAL"
  inline val IMPORT: "IMPORT" = "IMPORT"

  inline def values: js.Array[SegmentType] = js.Array(DIMENSIONAL, IMPORT)
}

type SourceType = "ALL" | "ANY" | "NONE"
object SourceType {
  inline val ALL: "ALL" = "ALL"
  inline val ANY: "ANY" = "ANY"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[SourceType] = js.Array(ALL, ANY, NONE)
}

type State = "DRAFT" | "ACTIVE" | "COMPLETED" | "CANCELLED" | "CLOSED" | "PAUSED"
object State {
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val CLOSED: "CLOSED" = "CLOSED"
  inline val PAUSED: "PAUSED" = "PAUSED"

  inline def values: js.Array[State] = js.Array(DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED, PAUSED)
}

type TemplateType = "EMAIL" | "SMS" | "VOICE" | "PUSH" | "INAPP"
object TemplateType {
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val SMS: "SMS" = "SMS"
  inline val VOICE: "VOICE" = "VOICE"
  inline val PUSH: "PUSH" = "PUSH"
  inline val INAPP: "INAPP" = "INAPP"

  inline def values: js.Array[TemplateType] = js.Array(EMAIL, SMS, VOICE, PUSH, INAPP)
}

type Type = "ALL" | "ANY" | "NONE"
object Type {
  inline val ALL: "ALL" = "ALL"
  inline val ANY: "ANY" = "ANY"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Type] = js.Array(ALL, ANY, NONE)
}

type __EndpointTypesElement = "PUSH" | "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | "IN_APP"
object __EndpointTypesElement {
  inline val PUSH: "PUSH" = "PUSH"
  inline val GCM: "GCM" = "GCM"
  inline val APNS: "APNS" = "APNS"
  inline val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  inline val APNS_VOIP: "APNS_VOIP" = "APNS_VOIP"
  inline val APNS_VOIP_SANDBOX: "APNS_VOIP_SANDBOX" = "APNS_VOIP_SANDBOX"
  inline val ADM: "ADM" = "ADM"
  inline val SMS: "SMS" = "SMS"
  inline val VOICE: "VOICE" = "VOICE"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val BAIDU: "BAIDU" = "BAIDU"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val IN_APP: "IN_APP" = "IN_APP"

  inline def values: js.Array[__EndpointTypesElement] = js.Array(PUSH, GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM, IN_APP)
}
