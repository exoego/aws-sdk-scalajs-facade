package facade.amazonaws.services.applicationdiscovery

import scalajs.js

@js.native
sealed trait AgentStatus extends js.Any
object AgentStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[AgentStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[AgentStatus]
  val RUNNING = "RUNNING".asInstanceOf[AgentStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[AgentStatus]
  val BLACKLISTED = "BLACKLISTED".asInstanceOf[AgentStatus]
  val SHUTDOWN = "SHUTDOWN".asInstanceOf[AgentStatus]

  @inline def values: js.Array[AgentStatus] = js.Array(HEALTHY, UNHEALTHY, RUNNING, UNKNOWN, BLACKLISTED, SHUTDOWN)
}

@js.native
sealed trait BatchDeleteImportDataErrorCode extends js.Any
object BatchDeleteImportDataErrorCode {
  val NOT_FOUND = "NOT_FOUND".asInstanceOf[BatchDeleteImportDataErrorCode]
  val INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[BatchDeleteImportDataErrorCode]
  val OVER_LIMIT = "OVER_LIMIT".asInstanceOf[BatchDeleteImportDataErrorCode]

  @inline def values: js.Array[BatchDeleteImportDataErrorCode] = js.Array(NOT_FOUND, INTERNAL_SERVER_ERROR, OVER_LIMIT)
}

@js.native
sealed trait ConfigurationItemType extends js.Any
object ConfigurationItemType {
  val SERVER = "SERVER".asInstanceOf[ConfigurationItemType]
  val PROCESS = "PROCESS".asInstanceOf[ConfigurationItemType]
  val CONNECTION = "CONNECTION".asInstanceOf[ConfigurationItemType]
  val APPLICATION = "APPLICATION".asInstanceOf[ConfigurationItemType]

  @inline def values: js.Array[ConfigurationItemType] = js.Array(SERVER, PROCESS, CONNECTION, APPLICATION)
}

@js.native
sealed trait ContinuousExportStatus extends js.Any
object ContinuousExportStatus {
  val START_IN_PROGRESS = "START_IN_PROGRESS".asInstanceOf[ContinuousExportStatus]
  val START_FAILED = "START_FAILED".asInstanceOf[ContinuousExportStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ContinuousExportStatus]
  val ERROR = "ERROR".asInstanceOf[ContinuousExportStatus]
  val STOP_IN_PROGRESS = "STOP_IN_PROGRESS".asInstanceOf[ContinuousExportStatus]
  val STOP_FAILED = "STOP_FAILED".asInstanceOf[ContinuousExportStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[ContinuousExportStatus]

  @inline def values: js.Array[ContinuousExportStatus] = js.Array(START_IN_PROGRESS, START_FAILED, ACTIVE, ERROR, STOP_IN_PROGRESS, STOP_FAILED, INACTIVE)
}

@js.native
sealed trait DataSource extends js.Any
object DataSource {
  val AGENT = "AGENT".asInstanceOf[DataSource]

  @inline def values: js.Array[DataSource] = js.Array(AGENT)
}

@js.native
sealed trait ExportDataFormat extends js.Any
object ExportDataFormat {
  val CSV = "CSV".asInstanceOf[ExportDataFormat]
  val GRAPHML = "GRAPHML".asInstanceOf[ExportDataFormat]

  @inline def values: js.Array[ExportDataFormat] = js.Array(CSV, GRAPHML)
}

@js.native
sealed trait ExportStatus extends js.Any
object ExportStatus {
  val FAILED = "FAILED".asInstanceOf[ExportStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ExportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]

  @inline def values: js.Array[ExportStatus] = js.Array(FAILED, SUCCEEDED, IN_PROGRESS)
}

@js.native
sealed trait ImportStatus extends js.Any
object ImportStatus {
  val IMPORT_IN_PROGRESS = "IMPORT_IN_PROGRESS".asInstanceOf[ImportStatus]
  val IMPORT_COMPLETE = "IMPORT_COMPLETE".asInstanceOf[ImportStatus]
  val IMPORT_COMPLETE_WITH_ERRORS = "IMPORT_COMPLETE_WITH_ERRORS".asInstanceOf[ImportStatus]
  val IMPORT_FAILED = "IMPORT_FAILED".asInstanceOf[ImportStatus]
  val IMPORT_FAILED_SERVER_LIMIT_EXCEEDED = "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
  val IMPORT_FAILED_RECORD_LIMIT_EXCEEDED = "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ImportStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[ImportStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ImportStatus]
  val DELETE_FAILED_LIMIT_EXCEEDED = "DELETE_FAILED_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ImportStatus]

  @inline def values: js.Array[ImportStatus] = js.Array(
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

@js.native
sealed trait ImportTaskFilterName extends js.Any
object ImportTaskFilterName {
  val IMPORT_TASK_ID = "IMPORT_TASK_ID".asInstanceOf[ImportTaskFilterName]
  val STATUS = "STATUS".asInstanceOf[ImportTaskFilterName]
  val NAME = "NAME".asInstanceOf[ImportTaskFilterName]

  @inline def values: js.Array[ImportTaskFilterName] = js.Array(IMPORT_TASK_ID, STATUS, NAME)
}

@js.native
sealed trait orderString extends js.Any
object orderString {
  val ASC = "ASC".asInstanceOf[orderString]
  val DESC = "DESC".asInstanceOf[orderString]

  @inline def values: js.Array[orderString] = js.Array(ASC, DESC)
}
