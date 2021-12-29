package facade.amazonaws.services.kinesisanalytics

import scalajs._

type ApplicationStatus = "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING"
object ApplicationStatus {
  val DELETING: "DELETING" = "DELETING"
  val STARTING: "STARTING" = "STARTING"
  val STOPPING: "STOPPING" = "STOPPING"
  val READY: "READY" = "READY"
  val RUNNING: "RUNNING" = "RUNNING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[ApplicationStatus](DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING)
}

type InputStartingPosition = "NOW" | "TRIM_HORIZON" | "LAST_STOPPED_POINT"
object InputStartingPosition {
  val NOW: "NOW" = "NOW"
  val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  val LAST_STOPPED_POINT: "LAST_STOPPED_POINT" = "LAST_STOPPED_POINT"

  @inline def values = js.Array[InputStartingPosition](NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
}

type RecordFormatType = "JSON" | "CSV"
object RecordFormatType {
  val JSON: "JSON" = "JSON"
  val CSV: "CSV" = "CSV"

  @inline def values = js.Array[RecordFormatType](JSON, CSV)
}
