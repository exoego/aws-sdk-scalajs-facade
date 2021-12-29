package facade.amazonaws.services.kinesisanalytics

import scalajs._

type ApplicationStatus = "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING"
object ApplicationStatus {
  inline val DELETING: "DELETING" = "DELETING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val READY: "READY" = "READY"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ApplicationStatus] = js.Array(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING)
}

type InputStartingPosition = "NOW" | "TRIM_HORIZON" | "LAST_STOPPED_POINT"
object InputStartingPosition {
  inline val NOW: "NOW" = "NOW"
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LAST_STOPPED_POINT: "LAST_STOPPED_POINT" = "LAST_STOPPED_POINT"

  inline def values: js.Array[InputStartingPosition] = js.Array(NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
}

type RecordFormatType = "JSON" | "CSV"
object RecordFormatType {
  inline val JSON: "JSON" = "JSON"
  inline val CSV: "CSV" = "CSV"

  inline def values: js.Array[RecordFormatType] = js.Array(JSON, CSV)
}
