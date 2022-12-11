package facade.amazonaws.services.cloudtrail

import scalajs.js

type DeliveryStatus = "SUCCESS" | "FAILED" | "FAILED_SIGNING_FILE" | "PENDING" | "RESOURCE_NOT_FOUND" | "ACCESS_DENIED" | "ACCESS_DENIED_SIGNING_FILE" | "CANCELLED" | "UNKNOWN"
object DeliveryStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val FAILED_SIGNING_FILE: "FAILED_SIGNING_FILE" = "FAILED_SIGNING_FILE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val ACCESS_DENIED_SIGNING_FILE: "ACCESS_DENIED_SIGNING_FILE" = "ACCESS_DENIED_SIGNING_FILE"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[DeliveryStatus] = js.Array(SUCCESS, FAILED, FAILED_SIGNING_FILE, PENDING, RESOURCE_NOT_FOUND, ACCESS_DENIED, ACCESS_DENIED_SIGNING_FILE, CANCELLED, UNKNOWN)
}

type DestinationType = "EVENT_DATA_STORE" | "AWS_SERVICE"
object DestinationType {
  inline val EVENT_DATA_STORE: "EVENT_DATA_STORE" = "EVENT_DATA_STORE"
  inline val AWS_SERVICE: "AWS_SERVICE" = "AWS_SERVICE"

  inline def values: js.Array[DestinationType] = js.Array(EVENT_DATA_STORE, AWS_SERVICE)
}

type EventCategory = "insight"
object EventCategory {
  inline val insight: "insight" = "insight"

  inline def values: js.Array[EventCategory] = js.Array(insight)
}

type EventDataStoreStatus = "CREATED" | "ENABLED" | "PENDING_DELETION"
object EventDataStoreStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val PENDING_DELETION: "PENDING_DELETION" = "PENDING_DELETION"

  inline def values: js.Array[EventDataStoreStatus] = js.Array(CREATED, ENABLED, PENDING_DELETION)
}

type ImportFailureStatus = "FAILED" | "RETRY" | "SUCCEEDED"
object ImportFailureStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val RETRY: "RETRY" = "RETRY"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  inline def values: js.Array[ImportFailureStatus] = js.Array(FAILED, RETRY, SUCCEEDED)
}

type ImportStatus = "INITIALIZING" | "IN_PROGRESS" | "FAILED" | "STOPPED" | "COMPLETED"
object ImportStatus {
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[ImportStatus] = js.Array(INITIALIZING, IN_PROGRESS, FAILED, STOPPED, COMPLETED)
}

type InsightType = "ApiCallRateInsight" | "ApiErrorRateInsight"
object InsightType {
  inline val ApiCallRateInsight: "ApiCallRateInsight" = "ApiCallRateInsight"
  inline val ApiErrorRateInsight: "ApiErrorRateInsight" = "ApiErrorRateInsight"

  inline def values: js.Array[InsightType] = js.Array(ApiCallRateInsight, ApiErrorRateInsight)
}

type LookupAttributeKey = "EventId" | "EventName" | "ReadOnly" | "Username" | "ResourceType" | "ResourceName" | "EventSource" | "AccessKeyId"
object LookupAttributeKey {
  inline val EventId: "EventId" = "EventId"
  inline val EventName: "EventName" = "EventName"
  inline val ReadOnly: "ReadOnly" = "ReadOnly"
  inline val Username: "Username" = "Username"
  inline val ResourceType: "ResourceType" = "ResourceType"
  inline val ResourceName: "ResourceName" = "ResourceName"
  inline val EventSource: "EventSource" = "EventSource"
  inline val AccessKeyId: "AccessKeyId" = "AccessKeyId"

  inline def values: js.Array[LookupAttributeKey] = js.Array(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
}

type QueryStatus = "QUEUED" | "RUNNING" | "FINISHED" | "FAILED" | "CANCELLED" | "TIMED_OUT"
object QueryStatus {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  inline def values: js.Array[QueryStatus] = js.Array(QUEUED, RUNNING, FINISHED, FAILED, CANCELLED, TIMED_OUT)
}

type ReadWriteType = "ReadOnly" | "WriteOnly" | "All"
object ReadWriteType {
  inline val ReadOnly: "ReadOnly" = "ReadOnly"
  inline val WriteOnly: "WriteOnly" = "WriteOnly"
  inline val All: "All" = "All"

  inline def values: js.Array[ReadWriteType] = js.Array(ReadOnly, WriteOnly, All)
}
