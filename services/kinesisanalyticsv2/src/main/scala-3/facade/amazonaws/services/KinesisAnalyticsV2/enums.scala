package facade.amazonaws.services.kinesisanalyticsv2

import scalajs._

type ApplicationRestoreType = "SKIP_RESTORE_FROM_SNAPSHOT" | "RESTORE_FROM_LATEST_SNAPSHOT" | "RESTORE_FROM_CUSTOM_SNAPSHOT"
object ApplicationRestoreType {
  val SKIP_RESTORE_FROM_SNAPSHOT: "SKIP_RESTORE_FROM_SNAPSHOT" = "SKIP_RESTORE_FROM_SNAPSHOT"
  val RESTORE_FROM_LATEST_SNAPSHOT: "RESTORE_FROM_LATEST_SNAPSHOT" = "RESTORE_FROM_LATEST_SNAPSHOT"
  val RESTORE_FROM_CUSTOM_SNAPSHOT: "RESTORE_FROM_CUSTOM_SNAPSHOT" = "RESTORE_FROM_CUSTOM_SNAPSHOT"

  @inline def values = js.Array[ApplicationRestoreType](SKIP_RESTORE_FROM_SNAPSHOT, RESTORE_FROM_LATEST_SNAPSHOT, RESTORE_FROM_CUSTOM_SNAPSHOT)
}

type ApplicationStatus = "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING" | "AUTOSCALING" | "FORCE_STOPPING"
object ApplicationStatus {
  val DELETING: "DELETING" = "DELETING"
  val STARTING: "STARTING" = "STARTING"
  val STOPPING: "STOPPING" = "STOPPING"
  val READY: "READY" = "READY"
  val RUNNING: "RUNNING" = "RUNNING"
  val UPDATING: "UPDATING" = "UPDATING"
  val AUTOSCALING: "AUTOSCALING" = "AUTOSCALING"
  val FORCE_STOPPING: "FORCE_STOPPING" = "FORCE_STOPPING"

  @inline def values = js.Array[ApplicationStatus](DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING, AUTOSCALING, FORCE_STOPPING)
}

type CodeContentType = "PLAINTEXT" | "ZIPFILE"
object CodeContentType {
  val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"
  val ZIPFILE: "ZIPFILE" = "ZIPFILE"

  @inline def values = js.Array[CodeContentType](PLAINTEXT, ZIPFILE)
}

type ConfigurationType = "DEFAULT" | "CUSTOM"
object ConfigurationType {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val CUSTOM: "CUSTOM" = "CUSTOM"

  @inline def values = js.Array[ConfigurationType](DEFAULT, CUSTOM)
}

type InputStartingPosition = "NOW" | "TRIM_HORIZON" | "LAST_STOPPED_POINT"
object InputStartingPosition {
  val NOW: "NOW" = "NOW"
  val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  val LAST_STOPPED_POINT: "LAST_STOPPED_POINT" = "LAST_STOPPED_POINT"

  @inline def values = js.Array[InputStartingPosition](NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
}

type LogLevel = "INFO" | "WARN" | "ERROR" | "DEBUG"
object LogLevel {
  val INFO: "INFO" = "INFO"
  val WARN: "WARN" = "WARN"
  val ERROR: "ERROR" = "ERROR"
  val DEBUG: "DEBUG" = "DEBUG"

  @inline def values = js.Array[LogLevel](INFO, WARN, ERROR, DEBUG)
}

type MetricsLevel = "APPLICATION" | "TASK" | "OPERATOR" | "PARALLELISM"
object MetricsLevel {
  val APPLICATION: "APPLICATION" = "APPLICATION"
  val TASK: "TASK" = "TASK"
  val OPERATOR: "OPERATOR" = "OPERATOR"
  val PARALLELISM: "PARALLELISM" = "PARALLELISM"

  @inline def values = js.Array[MetricsLevel](APPLICATION, TASK, OPERATOR, PARALLELISM)
}

type RecordFormatType = "JSON" | "CSV"
object RecordFormatType {
  val JSON: "JSON" = "JSON"
  val CSV: "CSV" = "CSV"

  @inline def values = js.Array[RecordFormatType](JSON, CSV)
}

type RuntimeEnvironment = "SQL-1_0" | "FLINK-1_6" | "FLINK-1_8" | "FLINK-1_11"
object RuntimeEnvironment {
  val `SQL-1_0`: "SQL-1_0" = "SQL-1_0"
  val `FLINK-1_6`: "FLINK-1_6" = "FLINK-1_6"
  val `FLINK-1_8`: "FLINK-1_8" = "FLINK-1_8"
  val `FLINK-1_11`: "FLINK-1_11" = "FLINK-1_11"

  @inline def values = js.Array[RuntimeEnvironment](`SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `FLINK-1_11`)
}

type SnapshotStatus = "CREATING" | "READY" | "DELETING" | "FAILED"
object SnapshotStatus {
  val CREATING: "CREATING" = "CREATING"
  val READY: "READY" = "READY"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[SnapshotStatus](CREATING, READY, DELETING, FAILED)
}

type UrlType = "FLINK_DASHBOARD_URL"
object UrlType {
  val FLINK_DASHBOARD_URL: "FLINK_DASHBOARD_URL" = "FLINK_DASHBOARD_URL"

  @inline def values = js.Array[UrlType](FLINK_DASHBOARD_URL)
}
