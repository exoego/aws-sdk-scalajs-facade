package facade.amazonaws.services.iotevents

import scalajs.js

type AnalysisResultLevel = "INFO" | "WARNING" | "ERROR"
object AnalysisResultLevel {
  inline val INFO: "INFO" = "INFO"
  inline val WARNING: "WARNING" = "WARNING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[AnalysisResultLevel] = js.Array(INFO, WARNING, ERROR)
}

type AnalysisStatus = "RUNNING" | "COMPLETE" | "FAILED"
object AnalysisStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AnalysisStatus] = js.Array(RUNNING, COMPLETE, FAILED)
}

type DetectorModelVersionStatus = "ACTIVE" | "ACTIVATING" | "INACTIVE" | "DEPRECATED" | "DRAFT" | "PAUSED" | "FAILED"
object DetectorModelVersionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DetectorModelVersionStatus] = js.Array(ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED)
}

type EvaluationMethod = "BATCH" | "SERIAL"
object EvaluationMethod {
  inline val BATCH: "BATCH" = "BATCH"
  inline val SERIAL: "SERIAL" = "SERIAL"

  inline def values: js.Array[EvaluationMethod] = js.Array(BATCH, SERIAL)
}

type InputStatus = "CREATING" | "UPDATING" | "ACTIVE" | "DELETING"
object InputStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[InputStatus] = js.Array(CREATING, UPDATING, ACTIVE, DELETING)
}

type LoggingLevel = "ERROR" | "INFO" | "DEBUG"
object LoggingLevel {
  inline val ERROR: "ERROR" = "ERROR"
  inline val INFO: "INFO" = "INFO"
  inline val DEBUG: "DEBUG" = "DEBUG"

  inline def values: js.Array[LoggingLevel] = js.Array(ERROR, INFO, DEBUG)
}

type PayloadType = "STRING" | "JSON"
object PayloadType {
  inline val STRING: "STRING" = "STRING"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[PayloadType] = js.Array(STRING, JSON)
}
