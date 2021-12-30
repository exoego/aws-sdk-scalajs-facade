package facade.amazonaws.services.cognitosync

import scalajs.js

@js.native
sealed trait BulkPublishStatus extends js.Any
object BulkPublishStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[BulkPublishStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[BulkPublishStatus]
  val FAILED = "FAILED".asInstanceOf[BulkPublishStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[BulkPublishStatus]

  @inline def values: js.Array[BulkPublishStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED)
}

@js.native
sealed trait Operation extends js.Any
object Operation {
  val replace = "replace".asInstanceOf[Operation]
  val remove = "remove".asInstanceOf[Operation]

  @inline def values: js.Array[Operation] = js.Array(replace, remove)
}

@js.native
sealed trait Platform extends js.Any
object Platform {
  val APNS = "APNS".asInstanceOf[Platform]
  val APNS_SANDBOX = "APNS_SANDBOX".asInstanceOf[Platform]
  val GCM = "GCM".asInstanceOf[Platform]
  val ADM = "ADM".asInstanceOf[Platform]

  @inline def values: js.Array[Platform] = js.Array(APNS, APNS_SANDBOX, GCM, ADM)
}

@js.native
sealed trait StreamingStatus extends js.Any
object StreamingStatus {
  val ENABLED = "ENABLED".asInstanceOf[StreamingStatus]
  val DISABLED = "DISABLED".asInstanceOf[StreamingStatus]

  @inline def values: js.Array[StreamingStatus] = js.Array(ENABLED, DISABLED)
}
