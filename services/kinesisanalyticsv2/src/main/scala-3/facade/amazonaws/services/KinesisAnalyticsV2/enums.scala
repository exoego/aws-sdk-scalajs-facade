package facade.amazonaws.services.kinesisanalyticsv2

import scalajs.js

type ApplicationMode = "STREAMING" | "INTERACTIVE"
object ApplicationMode {
  inline val STREAMING: "STREAMING" = "STREAMING"
  inline val INTERACTIVE: "INTERACTIVE" = "INTERACTIVE"

  inline def values: js.Array[ApplicationMode] = js.Array(STREAMING, INTERACTIVE)
}

type ApplicationRestoreType = "SKIP_RESTORE_FROM_SNAPSHOT" | "RESTORE_FROM_LATEST_SNAPSHOT" | "RESTORE_FROM_CUSTOM_SNAPSHOT"
object ApplicationRestoreType {
  inline val SKIP_RESTORE_FROM_SNAPSHOT: "SKIP_RESTORE_FROM_SNAPSHOT" = "SKIP_RESTORE_FROM_SNAPSHOT"
  inline val RESTORE_FROM_LATEST_SNAPSHOT: "RESTORE_FROM_LATEST_SNAPSHOT" = "RESTORE_FROM_LATEST_SNAPSHOT"
  inline val RESTORE_FROM_CUSTOM_SNAPSHOT: "RESTORE_FROM_CUSTOM_SNAPSHOT" = "RESTORE_FROM_CUSTOM_SNAPSHOT"

  inline def values: js.Array[ApplicationRestoreType] = js.Array(SKIP_RESTORE_FROM_SNAPSHOT, RESTORE_FROM_LATEST_SNAPSHOT, RESTORE_FROM_CUSTOM_SNAPSHOT)
}

type ApplicationStatus = "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING" | "AUTOSCALING" | "FORCE_STOPPING" | "ROLLING_BACK" | "MAINTENANCE" | "ROLLED_BACK"
object ApplicationStatus {
  inline val DELETING: "DELETING" = "DELETING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val READY: "READY" = "READY"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val AUTOSCALING: "AUTOSCALING" = "AUTOSCALING"
  inline val FORCE_STOPPING: "FORCE_STOPPING" = "FORCE_STOPPING"
  inline val ROLLING_BACK: "ROLLING_BACK" = "ROLLING_BACK"
  inline val MAINTENANCE: "MAINTENANCE" = "MAINTENANCE"
  inline val ROLLED_BACK: "ROLLED_BACK" = "ROLLED_BACK"

  inline def values: js.Array[ApplicationStatus] = js.Array(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING, AUTOSCALING, FORCE_STOPPING, ROLLING_BACK, MAINTENANCE, ROLLED_BACK)
}

type ArtifactType = "UDF" | "DEPENDENCY_JAR"
object ArtifactType {
  inline val UDF: "UDF" = "UDF"
  inline val DEPENDENCY_JAR: "DEPENDENCY_JAR" = "DEPENDENCY_JAR"

  inline def values: js.Array[ArtifactType] = js.Array(UDF, DEPENDENCY_JAR)
}

type CodeContentType = "PLAINTEXT" | "ZIPFILE"
object CodeContentType {
  inline val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"
  inline val ZIPFILE: "ZIPFILE" = "ZIPFILE"

  inline def values: js.Array[CodeContentType] = js.Array(PLAINTEXT, ZIPFILE)
}

type ConfigurationType = "DEFAULT" | "CUSTOM"
object ConfigurationType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[ConfigurationType] = js.Array(DEFAULT, CUSTOM)
}

type InputStartingPosition = "NOW" | "TRIM_HORIZON" | "LAST_STOPPED_POINT"
object InputStartingPosition {
  inline val NOW: "NOW" = "NOW"
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LAST_STOPPED_POINT: "LAST_STOPPED_POINT" = "LAST_STOPPED_POINT"

  inline def values: js.Array[InputStartingPosition] = js.Array(NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
}

type LogLevel = "INFO" | "WARN" | "ERROR" | "DEBUG"
object LogLevel {
  inline val INFO: "INFO" = "INFO"
  inline val WARN: "WARN" = "WARN"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DEBUG: "DEBUG" = "DEBUG"

  inline def values: js.Array[LogLevel] = js.Array(INFO, WARN, ERROR, DEBUG)
}

type MetricsLevel = "APPLICATION" | "TASK" | "OPERATOR" | "PARALLELISM"
object MetricsLevel {
  inline val APPLICATION: "APPLICATION" = "APPLICATION"
  inline val TASK: "TASK" = "TASK"
  inline val OPERATOR: "OPERATOR" = "OPERATOR"
  inline val PARALLELISM: "PARALLELISM" = "PARALLELISM"

  inline def values: js.Array[MetricsLevel] = js.Array(APPLICATION, TASK, OPERATOR, PARALLELISM)
}

type RecordFormatType = "JSON" | "CSV"
object RecordFormatType {
  inline val JSON: "JSON" = "JSON"
  inline val CSV: "CSV" = "CSV"

  inline def values: js.Array[RecordFormatType] = js.Array(JSON, CSV)
}

type RuntimeEnvironment = "SQL-1_0" | "FLINK-1_6" | "FLINK-1_8" | "ZEPPELIN-FLINK-1_0" | "FLINK-1_11" | "FLINK-1_13" | "ZEPPELIN-FLINK-2_0"
object RuntimeEnvironment {
  inline val `SQL-1_0`: "SQL-1_0" = "SQL-1_0"
  inline val `FLINK-1_6`: "FLINK-1_6" = "FLINK-1_6"
  inline val `FLINK-1_8`: "FLINK-1_8" = "FLINK-1_8"
  inline val `ZEPPELIN-FLINK-1_0`: "ZEPPELIN-FLINK-1_0" = "ZEPPELIN-FLINK-1_0"
  inline val `FLINK-1_11`: "FLINK-1_11" = "FLINK-1_11"
  inline val `FLINK-1_13`: "FLINK-1_13" = "FLINK-1_13"
  inline val `ZEPPELIN-FLINK-2_0`: "ZEPPELIN-FLINK-2_0" = "ZEPPELIN-FLINK-2_0"

  inline def values: js.Array[RuntimeEnvironment] = js.Array(`SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `ZEPPELIN-FLINK-1_0`, `FLINK-1_11`, `FLINK-1_13`, `ZEPPELIN-FLINK-2_0`)
}

type SnapshotStatus = "CREATING" | "READY" | "DELETING" | "FAILED"
object SnapshotStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val READY: "READY" = "READY"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[SnapshotStatus] = js.Array(CREATING, READY, DELETING, FAILED)
}

type UrlType = "FLINK_DASHBOARD_URL" | "ZEPPELIN_UI_URL"
object UrlType {
  inline val FLINK_DASHBOARD_URL: "FLINK_DASHBOARD_URL" = "FLINK_DASHBOARD_URL"
  inline val ZEPPELIN_UI_URL: "ZEPPELIN_UI_URL" = "ZEPPELIN_UI_URL"

  inline def values: js.Array[UrlType] = js.Array(FLINK_DASHBOARD_URL, ZEPPELIN_UI_URL)
}
