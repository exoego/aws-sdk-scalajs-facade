package facade.amazonaws.services.iotevents

import scalajs._

type AnalysisResultLevel = "INFO" | "WARNING" | "ERROR"
object AnalysisResultLevel {
  val INFO: "INFO" = "INFO"
  val WARNING: "WARNING" = "WARNING"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[AnalysisResultLevel](INFO, WARNING, ERROR)
}

type AnalysisStatus = "RUNNING" | "COMPLETE" | "FAILED"
object AnalysisStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AnalysisStatus](RUNNING, COMPLETE, FAILED)
}

type DetectorModelVersionStatus = "ACTIVE" | "ACTIVATING" | "INACTIVE" | "DEPRECATED" | "DRAFT" | "PAUSED" | "FAILED"
object DetectorModelVersionStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"
  val DRAFT: "DRAFT" = "DRAFT"
  val PAUSED: "PAUSED" = "PAUSED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[DetectorModelVersionStatus](ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED)
}

type EvaluationMethod = "BATCH" | "SERIAL"
object EvaluationMethod {
  val BATCH: "BATCH" = "BATCH"
  val SERIAL: "SERIAL" = "SERIAL"

  @inline def values = js.Array[EvaluationMethod](BATCH, SERIAL)
}

type InputStatus = "CREATING" | "UPDATING" | "ACTIVE" | "DELETING"
object InputStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[InputStatus](CREATING, UPDATING, ACTIVE, DELETING)
}

type LoggingLevel = "ERROR" | "INFO" | "DEBUG"
object LoggingLevel {
  val ERROR: "ERROR" = "ERROR"
  val INFO: "INFO" = "INFO"
  val DEBUG: "DEBUG" = "DEBUG"

  @inline def values = js.Array[LoggingLevel](ERROR, INFO, DEBUG)
}

type PayloadType = "STRING" | "JSON"
object PayloadType {
  val STRING: "STRING" = "STRING"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[PayloadType](STRING, JSON)
}
