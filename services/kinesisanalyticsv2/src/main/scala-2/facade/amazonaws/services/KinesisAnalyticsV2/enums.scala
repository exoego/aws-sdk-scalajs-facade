package facade.amazonaws.services.kinesisanalyticsv2

import scalajs.js

@js.native
sealed trait ApplicationMode extends js.Any
object ApplicationMode {
  val STREAMING = "STREAMING".asInstanceOf[ApplicationMode]
  val INTERACTIVE = "INTERACTIVE".asInstanceOf[ApplicationMode]

  @inline def values: js.Array[ApplicationMode] = js.Array(STREAMING, INTERACTIVE)
}

@js.native
sealed trait ApplicationRestoreType extends js.Any
object ApplicationRestoreType {
  val SKIP_RESTORE_FROM_SNAPSHOT = "SKIP_RESTORE_FROM_SNAPSHOT".asInstanceOf[ApplicationRestoreType]
  val RESTORE_FROM_LATEST_SNAPSHOT = "RESTORE_FROM_LATEST_SNAPSHOT".asInstanceOf[ApplicationRestoreType]
  val RESTORE_FROM_CUSTOM_SNAPSHOT = "RESTORE_FROM_CUSTOM_SNAPSHOT".asInstanceOf[ApplicationRestoreType]

  @inline def values: js.Array[ApplicationRestoreType] = js.Array(SKIP_RESTORE_FROM_SNAPSHOT, RESTORE_FROM_LATEST_SNAPSHOT, RESTORE_FROM_CUSTOM_SNAPSHOT)
}

@js.native
sealed trait ApplicationStatus extends js.Any
object ApplicationStatus {
  val DELETING = "DELETING".asInstanceOf[ApplicationStatus]
  val STARTING = "STARTING".asInstanceOf[ApplicationStatus]
  val STOPPING = "STOPPING".asInstanceOf[ApplicationStatus]
  val READY = "READY".asInstanceOf[ApplicationStatus]
  val RUNNING = "RUNNING".asInstanceOf[ApplicationStatus]
  val UPDATING = "UPDATING".asInstanceOf[ApplicationStatus]
  val AUTOSCALING = "AUTOSCALING".asInstanceOf[ApplicationStatus]
  val FORCE_STOPPING = "FORCE_STOPPING".asInstanceOf[ApplicationStatus]
  val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[ApplicationStatus]
  val MAINTENANCE = "MAINTENANCE".asInstanceOf[ApplicationStatus]
  val ROLLED_BACK = "ROLLED_BACK".asInstanceOf[ApplicationStatus]

  @inline def values: js.Array[ApplicationStatus] = js.Array(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING, AUTOSCALING, FORCE_STOPPING, ROLLING_BACK, MAINTENANCE, ROLLED_BACK)
}

@js.native
sealed trait ArtifactType extends js.Any
object ArtifactType {
  val UDF = "UDF".asInstanceOf[ArtifactType]
  val DEPENDENCY_JAR = "DEPENDENCY_JAR".asInstanceOf[ArtifactType]

  @inline def values: js.Array[ArtifactType] = js.Array(UDF, DEPENDENCY_JAR)
}

@js.native
sealed trait CodeContentType extends js.Any
object CodeContentType {
  val PLAINTEXT = "PLAINTEXT".asInstanceOf[CodeContentType]
  val ZIPFILE = "ZIPFILE".asInstanceOf[CodeContentType]

  @inline def values: js.Array[CodeContentType] = js.Array(PLAINTEXT, ZIPFILE)
}

@js.native
sealed trait ConfigurationType extends js.Any
object ConfigurationType {
  val DEFAULT = "DEFAULT".asInstanceOf[ConfigurationType]
  val CUSTOM = "CUSTOM".asInstanceOf[ConfigurationType]

  @inline def values: js.Array[ConfigurationType] = js.Array(DEFAULT, CUSTOM)
}

@js.native
sealed trait InputStartingPosition extends js.Any
object InputStartingPosition {
  val NOW = "NOW".asInstanceOf[InputStartingPosition]
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[InputStartingPosition]
  val LAST_STOPPED_POINT = "LAST_STOPPED_POINT".asInstanceOf[InputStartingPosition]

  @inline def values: js.Array[InputStartingPosition] = js.Array(NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
}

@js.native
sealed trait LogLevel extends js.Any
object LogLevel {
  val INFO = "INFO".asInstanceOf[LogLevel]
  val WARN = "WARN".asInstanceOf[LogLevel]
  val ERROR = "ERROR".asInstanceOf[LogLevel]
  val DEBUG = "DEBUG".asInstanceOf[LogLevel]

  @inline def values: js.Array[LogLevel] = js.Array(INFO, WARN, ERROR, DEBUG)
}

@js.native
sealed trait MetricsLevel extends js.Any
object MetricsLevel {
  val APPLICATION = "APPLICATION".asInstanceOf[MetricsLevel]
  val TASK = "TASK".asInstanceOf[MetricsLevel]
  val OPERATOR = "OPERATOR".asInstanceOf[MetricsLevel]
  val PARALLELISM = "PARALLELISM".asInstanceOf[MetricsLevel]

  @inline def values: js.Array[MetricsLevel] = js.Array(APPLICATION, TASK, OPERATOR, PARALLELISM)
}

@js.native
sealed trait RecordFormatType extends js.Any
object RecordFormatType {
  val JSON = "JSON".asInstanceOf[RecordFormatType]
  val CSV = "CSV".asInstanceOf[RecordFormatType]

  @inline def values: js.Array[RecordFormatType] = js.Array(JSON, CSV)
}

@js.native
sealed trait RuntimeEnvironment extends js.Any
object RuntimeEnvironment {
  val `SQL-1_0` = "SQL-1_0".asInstanceOf[RuntimeEnvironment]
  val `FLINK-1_6` = "FLINK-1_6".asInstanceOf[RuntimeEnvironment]
  val `FLINK-1_8` = "FLINK-1_8".asInstanceOf[RuntimeEnvironment]
  val `ZEPPELIN-FLINK-1_0` = "ZEPPELIN-FLINK-1_0".asInstanceOf[RuntimeEnvironment]
  val `FLINK-1_11` = "FLINK-1_11".asInstanceOf[RuntimeEnvironment]
  val `FLINK-1_13` = "FLINK-1_13".asInstanceOf[RuntimeEnvironment]
  val `ZEPPELIN-FLINK-2_0` = "ZEPPELIN-FLINK-2_0".asInstanceOf[RuntimeEnvironment]

  @inline def values: js.Array[RuntimeEnvironment] = js.Array(`SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `ZEPPELIN-FLINK-1_0`, `FLINK-1_11`, `FLINK-1_13`, `ZEPPELIN-FLINK-2_0`)
}

@js.native
sealed trait SnapshotStatus extends js.Any
object SnapshotStatus {
  val CREATING = "CREATING".asInstanceOf[SnapshotStatus]
  val READY = "READY".asInstanceOf[SnapshotStatus]
  val DELETING = "DELETING".asInstanceOf[SnapshotStatus]
  val FAILED = "FAILED".asInstanceOf[SnapshotStatus]

  @inline def values: js.Array[SnapshotStatus] = js.Array(CREATING, READY, DELETING, FAILED)
}

@js.native
sealed trait UrlType extends js.Any
object UrlType {
  val FLINK_DASHBOARD_URL = "FLINK_DASHBOARD_URL".asInstanceOf[UrlType]
  val ZEPPELIN_UI_URL = "ZEPPELIN_UI_URL".asInstanceOf[UrlType]

  @inline def values: js.Array[UrlType] = js.Array(FLINK_DASHBOARD_URL, ZEPPELIN_UI_URL)
}
