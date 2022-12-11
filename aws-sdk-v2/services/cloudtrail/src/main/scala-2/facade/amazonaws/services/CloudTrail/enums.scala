package facade.amazonaws.services.cloudtrail

import scalajs.js

@js.native
sealed trait DeliveryStatus extends js.Any
object DeliveryStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[DeliveryStatus]
  val FAILED = "FAILED".asInstanceOf[DeliveryStatus]
  val FAILED_SIGNING_FILE = "FAILED_SIGNING_FILE".asInstanceOf[DeliveryStatus]
  val PENDING = "PENDING".asInstanceOf[DeliveryStatus]
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[DeliveryStatus]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[DeliveryStatus]
  val ACCESS_DENIED_SIGNING_FILE = "ACCESS_DENIED_SIGNING_FILE".asInstanceOf[DeliveryStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[DeliveryStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[DeliveryStatus]

  @inline def values: js.Array[DeliveryStatus] = js.Array(SUCCESS, FAILED, FAILED_SIGNING_FILE, PENDING, RESOURCE_NOT_FOUND, ACCESS_DENIED, ACCESS_DENIED_SIGNING_FILE, CANCELLED, UNKNOWN)
}

@js.native
sealed trait DestinationType extends js.Any
object DestinationType {
  val EVENT_DATA_STORE = "EVENT_DATA_STORE".asInstanceOf[DestinationType]
  val AWS_SERVICE = "AWS_SERVICE".asInstanceOf[DestinationType]

  @inline def values: js.Array[DestinationType] = js.Array(EVENT_DATA_STORE, AWS_SERVICE)
}

@js.native
sealed trait EventCategory extends js.Any
object EventCategory {
  val insight = "insight".asInstanceOf[EventCategory]

  @inline def values: js.Array[EventCategory] = js.Array(insight)
}

@js.native
sealed trait EventDataStoreStatus extends js.Any
object EventDataStoreStatus {
  val CREATED = "CREATED".asInstanceOf[EventDataStoreStatus]
  val ENABLED = "ENABLED".asInstanceOf[EventDataStoreStatus]
  val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[EventDataStoreStatus]

  @inline def values: js.Array[EventDataStoreStatus] = js.Array(CREATED, ENABLED, PENDING_DELETION)
}

@js.native
sealed trait ImportFailureStatus extends js.Any
object ImportFailureStatus {
  val FAILED = "FAILED".asInstanceOf[ImportFailureStatus]
  val RETRY = "RETRY".asInstanceOf[ImportFailureStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ImportFailureStatus]

  @inline def values: js.Array[ImportFailureStatus] = js.Array(FAILED, RETRY, SUCCEEDED)
}

@js.native
sealed trait ImportStatus extends js.Any
object ImportStatus {
  val INITIALIZING = "INITIALIZING".asInstanceOf[ImportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ImportStatus]
  val FAILED = "FAILED".asInstanceOf[ImportStatus]
  val STOPPED = "STOPPED".asInstanceOf[ImportStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ImportStatus]

  @inline def values: js.Array[ImportStatus] = js.Array(INITIALIZING, IN_PROGRESS, FAILED, STOPPED, COMPLETED)
}

@js.native
sealed trait InsightType extends js.Any
object InsightType {
  val ApiCallRateInsight = "ApiCallRateInsight".asInstanceOf[InsightType]
  val ApiErrorRateInsight = "ApiErrorRateInsight".asInstanceOf[InsightType]

  @inline def values: js.Array[InsightType] = js.Array(ApiCallRateInsight, ApiErrorRateInsight)
}

@js.native
sealed trait LookupAttributeKey extends js.Any
object LookupAttributeKey {
  val EventId = "EventId".asInstanceOf[LookupAttributeKey]
  val EventName = "EventName".asInstanceOf[LookupAttributeKey]
  val ReadOnly = "ReadOnly".asInstanceOf[LookupAttributeKey]
  val Username = "Username".asInstanceOf[LookupAttributeKey]
  val ResourceType = "ResourceType".asInstanceOf[LookupAttributeKey]
  val ResourceName = "ResourceName".asInstanceOf[LookupAttributeKey]
  val EventSource = "EventSource".asInstanceOf[LookupAttributeKey]
  val AccessKeyId = "AccessKeyId".asInstanceOf[LookupAttributeKey]

  @inline def values: js.Array[LookupAttributeKey] = js.Array(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
}

@js.native
sealed trait QueryStatus extends js.Any
object QueryStatus {
  val QUEUED = "QUEUED".asInstanceOf[QueryStatus]
  val RUNNING = "RUNNING".asInstanceOf[QueryStatus]
  val FINISHED = "FINISHED".asInstanceOf[QueryStatus]
  val FAILED = "FAILED".asInstanceOf[QueryStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[QueryStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[QueryStatus]

  @inline def values: js.Array[QueryStatus] = js.Array(QUEUED, RUNNING, FINISHED, FAILED, CANCELLED, TIMED_OUT)
}

@js.native
sealed trait ReadWriteType extends js.Any
object ReadWriteType {
  val ReadOnly = "ReadOnly".asInstanceOf[ReadWriteType]
  val WriteOnly = "WriteOnly".asInstanceOf[ReadWriteType]
  val All = "All".asInstanceOf[ReadWriteType]

  @inline def values: js.Array[ReadWriteType] = js.Array(ReadOnly, WriteOnly, All)
}
