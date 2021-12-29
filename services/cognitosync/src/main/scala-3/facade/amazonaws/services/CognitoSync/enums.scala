package facade.amazonaws.services.cognitosync

import scalajs._

type BulkPublishStatus = "NOT_STARTED" | "IN_PROGRESS" | "FAILED" | "SUCCEEDED"
object BulkPublishStatus {
  val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  @inline def values = js.Array[BulkPublishStatus](NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED)
}

type Operation = "replace" | "remove"
object Operation {
  val replace: "replace" = "replace"
  val remove: "remove" = "remove"

  @inline def values = js.Array[Operation](replace, remove)
}

type Platform = "APNS" | "APNS_SANDBOX" | "GCM" | "ADM"
object Platform {
  val APNS: "APNS" = "APNS"
  val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  val GCM: "GCM" = "GCM"
  val ADM: "ADM" = "ADM"

  @inline def values = js.Array[Platform](APNS, APNS_SANDBOX, GCM, ADM)
}

type StreamingStatus = "ENABLED" | "DISABLED"
object StreamingStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[StreamingStatus](ENABLED, DISABLED)
}
