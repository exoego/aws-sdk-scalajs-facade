package facade.amazonaws.services.cognitosync

import scalajs._

type BulkPublishStatus = "NOT_STARTED" | "IN_PROGRESS" | "FAILED" | "SUCCEEDED"
object BulkPublishStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  inline def values: js.Array[BulkPublishStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED)
}

type Operation = "replace" | "remove"
object Operation {
  inline val replace: "replace" = "replace"
  inline val remove: "remove" = "remove"

  inline def values: js.Array[Operation] = js.Array(replace, remove)
}

type Platform = "APNS" | "APNS_SANDBOX" | "GCM" | "ADM"
object Platform {
  inline val APNS: "APNS" = "APNS"
  inline val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  inline val GCM: "GCM" = "GCM"
  inline val ADM: "ADM" = "ADM"

  inline def values: js.Array[Platform] = js.Array(APNS, APNS_SANDBOX, GCM, ADM)
}

type StreamingStatus = "ENABLED" | "DISABLED"
object StreamingStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[StreamingStatus] = js.Array(ENABLED, DISABLED)
}
