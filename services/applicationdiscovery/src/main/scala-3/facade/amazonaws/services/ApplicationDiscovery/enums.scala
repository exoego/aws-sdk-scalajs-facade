package facade.amazonaws.services.applicationdiscovery

import scalajs.js

type AgentStatus = "HEALTHY" | "UNHEALTHY" | "RUNNING" | "UNKNOWN" | "BLACKLISTED" | "SHUTDOWN"
object AgentStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val BLACKLISTED: "BLACKLISTED" = "BLACKLISTED"
  inline val SHUTDOWN: "SHUTDOWN" = "SHUTDOWN"

  inline def values: js.Array[AgentStatus] = js.Array(HEALTHY, UNHEALTHY, RUNNING, UNKNOWN, BLACKLISTED, SHUTDOWN)
}

type BatchDeleteImportDataErrorCode = "NOT_FOUND" | "INTERNAL_SERVER_ERROR" | "OVER_LIMIT"
object BatchDeleteImportDataErrorCode {
  inline val NOT_FOUND: "NOT_FOUND" = "NOT_FOUND"
  inline val INTERNAL_SERVER_ERROR: "INTERNAL_SERVER_ERROR" = "INTERNAL_SERVER_ERROR"
  inline val OVER_LIMIT: "OVER_LIMIT" = "OVER_LIMIT"

  inline def values: js.Array[BatchDeleteImportDataErrorCode] = js.Array(NOT_FOUND, INTERNAL_SERVER_ERROR, OVER_LIMIT)
}

type ConfigurationItemType = "SERVER" | "PROCESS" | "CONNECTION" | "APPLICATION"
object ConfigurationItemType {
  inline val SERVER: "SERVER" = "SERVER"
  inline val PROCESS: "PROCESS" = "PROCESS"
  inline val CONNECTION: "CONNECTION" = "CONNECTION"
  inline val APPLICATION: "APPLICATION" = "APPLICATION"

  inline def values: js.Array[ConfigurationItemType] = js.Array(SERVER, PROCESS, CONNECTION, APPLICATION)
}

type ContinuousExportStatus = "START_IN_PROGRESS" | "START_FAILED" | "ACTIVE" | "ERROR" | "STOP_IN_PROGRESS" | "STOP_FAILED" | "INACTIVE"
object ContinuousExportStatus {
  inline val START_IN_PROGRESS: "START_IN_PROGRESS" = "START_IN_PROGRESS"
  inline val START_FAILED: "START_FAILED" = "START_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ERROR: "ERROR" = "ERROR"
  inline val STOP_IN_PROGRESS: "STOP_IN_PROGRESS" = "STOP_IN_PROGRESS"
  inline val STOP_FAILED: "STOP_FAILED" = "STOP_FAILED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[ContinuousExportStatus] = js.Array(START_IN_PROGRESS, START_FAILED, ACTIVE, ERROR, STOP_IN_PROGRESS, STOP_FAILED, INACTIVE)
}

type DataSource = "AGENT"
object DataSource {
  inline val AGENT: "AGENT" = "AGENT"

  inline def values: js.Array[DataSource] = js.Array(AGENT)
}

type ExportDataFormat = "CSV" | "GRAPHML"
object ExportDataFormat {
  inline val CSV: "CSV" = "CSV"
  inline val GRAPHML: "GRAPHML" = "GRAPHML"

  inline def values: js.Array[ExportDataFormat] = js.Array(CSV, GRAPHML)
}

type ExportStatus = "FAILED" | "SUCCEEDED" | "IN_PROGRESS"
object ExportStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[ExportStatus] = js.Array(FAILED, SUCCEEDED, IN_PROGRESS)
}

type ImportStatus = "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_COMPLETE_WITH_ERRORS" | "IMPORT_FAILED" | "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED" | "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED" | "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED" | "DELETE_FAILED_LIMIT_EXCEEDED" | "INTERNAL_ERROR"
object ImportStatus {
  inline val IMPORT_IN_PROGRESS: "IMPORT_IN_PROGRESS" = "IMPORT_IN_PROGRESS"
  inline val IMPORT_COMPLETE: "IMPORT_COMPLETE" = "IMPORT_COMPLETE"
  inline val IMPORT_COMPLETE_WITH_ERRORS: "IMPORT_COMPLETE_WITH_ERRORS" = "IMPORT_COMPLETE_WITH_ERRORS"
  inline val IMPORT_FAILED: "IMPORT_FAILED" = "IMPORT_FAILED"
  inline val IMPORT_FAILED_SERVER_LIMIT_EXCEEDED: "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED" = "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED"
  inline val IMPORT_FAILED_RECORD_LIMIT_EXCEEDED: "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED" = "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_FAILED_LIMIT_EXCEEDED: "DELETE_FAILED_LIMIT_EXCEEDED" = "DELETE_FAILED_LIMIT_EXCEEDED"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"

  inline def values: js.Array[ImportStatus] = js.Array(
    IMPORT_IN_PROGRESS,
    IMPORT_COMPLETE,
    IMPORT_COMPLETE_WITH_ERRORS,
    IMPORT_FAILED,
    IMPORT_FAILED_SERVER_LIMIT_EXCEEDED,
    IMPORT_FAILED_RECORD_LIMIT_EXCEEDED,
    DELETE_IN_PROGRESS,
    DELETE_COMPLETE,
    DELETE_FAILED,
    DELETE_FAILED_LIMIT_EXCEEDED,
    INTERNAL_ERROR
  )
}

type ImportTaskFilterName = "IMPORT_TASK_ID" | "STATUS" | "NAME"
object ImportTaskFilterName {
  inline val IMPORT_TASK_ID: "IMPORT_TASK_ID" = "IMPORT_TASK_ID"
  inline val STATUS: "STATUS" = "STATUS"
  inline val NAME: "NAME" = "NAME"

  inline def values: js.Array[ImportTaskFilterName] = js.Array(IMPORT_TASK_ID, STATUS, NAME)
}

type orderString = "ASC" | "DESC"
object orderString {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[orderString] = js.Array(ASC, DESC)
}
