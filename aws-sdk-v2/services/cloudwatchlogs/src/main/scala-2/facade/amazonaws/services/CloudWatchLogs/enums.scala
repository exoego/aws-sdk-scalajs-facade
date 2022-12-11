package facade.amazonaws.services.cloudwatchlogs

import scalajs.js

@js.native
sealed trait DataProtectionStatus extends js.Any
object DataProtectionStatus {
  val ACTIVATED = "ACTIVATED".asInstanceOf[DataProtectionStatus]
  val DELETED = "DELETED".asInstanceOf[DataProtectionStatus]
  val ARCHIVED = "ARCHIVED".asInstanceOf[DataProtectionStatus]
  val DISABLED = "DISABLED".asInstanceOf[DataProtectionStatus]

  @inline def values: js.Array[DataProtectionStatus] = js.Array(ACTIVATED, DELETED, ARCHIVED, DISABLED)
}

/** The method used to distribute log data to the destination, which can be either random or grouped by log stream.
  */
@js.native
sealed trait Distribution extends js.Any
object Distribution {
  val Random = "Random".asInstanceOf[Distribution]
  val ByLogStream = "ByLogStream".asInstanceOf[Distribution]

  @inline def values: js.Array[Distribution] = js.Array(Random, ByLogStream)
}

@js.native
sealed trait ExportTaskStatusCode extends js.Any
object ExportTaskStatusCode {
  val CANCELLED = "CANCELLED".asInstanceOf[ExportTaskStatusCode]
  val COMPLETED = "COMPLETED".asInstanceOf[ExportTaskStatusCode]
  val FAILED = "FAILED".asInstanceOf[ExportTaskStatusCode]
  val PENDING = "PENDING".asInstanceOf[ExportTaskStatusCode]
  val PENDING_CANCEL = "PENDING_CANCEL".asInstanceOf[ExportTaskStatusCode]
  val RUNNING = "RUNNING".asInstanceOf[ExportTaskStatusCode]

  @inline def values: js.Array[ExportTaskStatusCode] = js.Array(CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING)
}

@js.native
sealed trait OrderBy extends js.Any
object OrderBy {
  val LogStreamName = "LogStreamName".asInstanceOf[OrderBy]
  val LastEventTime = "LastEventTime".asInstanceOf[OrderBy]

  @inline def values: js.Array[OrderBy] = js.Array(LogStreamName, LastEventTime)
}

@js.native
sealed trait QueryStatus extends js.Any
object QueryStatus {
  val Scheduled = "Scheduled".asInstanceOf[QueryStatus]
  val Running = "Running".asInstanceOf[QueryStatus]
  val Complete = "Complete".asInstanceOf[QueryStatus]
  val Failed = "Failed".asInstanceOf[QueryStatus]
  val Cancelled = "Cancelled".asInstanceOf[QueryStatus]
  val Timeout = "Timeout".asInstanceOf[QueryStatus]
  val Unknown = "Unknown".asInstanceOf[QueryStatus]

  @inline def values: js.Array[QueryStatus] = js.Array(Scheduled, Running, Complete, Failed, Cancelled, Timeout, Unknown)
}

@js.native
sealed trait StandardUnit extends js.Any
object StandardUnit {
  val Seconds = "Seconds".asInstanceOf[StandardUnit]
  val Microseconds = "Microseconds".asInstanceOf[StandardUnit]
  val Milliseconds = "Milliseconds".asInstanceOf[StandardUnit]
  val Bytes = "Bytes".asInstanceOf[StandardUnit]
  val Kilobytes = "Kilobytes".asInstanceOf[StandardUnit]
  val Megabytes = "Megabytes".asInstanceOf[StandardUnit]
  val Gigabytes = "Gigabytes".asInstanceOf[StandardUnit]
  val Terabytes = "Terabytes".asInstanceOf[StandardUnit]
  val Bits = "Bits".asInstanceOf[StandardUnit]
  val Kilobits = "Kilobits".asInstanceOf[StandardUnit]
  val Megabits = "Megabits".asInstanceOf[StandardUnit]
  val Gigabits = "Gigabits".asInstanceOf[StandardUnit]
  val Terabits = "Terabits".asInstanceOf[StandardUnit]
  val Percent = "Percent".asInstanceOf[StandardUnit]
  val Count = "Count".asInstanceOf[StandardUnit]
  val `Bytes/Second` = "Bytes/Second".asInstanceOf[StandardUnit]
  val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[StandardUnit]
  val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[StandardUnit]
  val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[StandardUnit]
  val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[StandardUnit]
  val `Bits/Second` = "Bits/Second".asInstanceOf[StandardUnit]
  val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[StandardUnit]
  val `Megabits/Second` = "Megabits/Second".asInstanceOf[StandardUnit]
  val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[StandardUnit]
  val `Terabits/Second` = "Terabits/Second".asInstanceOf[StandardUnit]
  val `Count/Second` = "Count/Second".asInstanceOf[StandardUnit]
  val None = "None".asInstanceOf[StandardUnit]

  @inline def values: js.Array[StandardUnit] = js.Array(
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    Count,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`,
    None
  )
}
