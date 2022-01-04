package facade.amazonaws.services.cloudwatchlogs

import scalajs.js

/** The method used to distribute log data to the destination, which can be either random or grouped by log stream.
  */
type Distribution = "Random" | "ByLogStream"
object Distribution {
  inline val Random: "Random" = "Random"
  inline val ByLogStream: "ByLogStream" = "ByLogStream"

  inline def values: js.Array[Distribution] = js.Array(Random, ByLogStream)
}

type ExportTaskStatusCode = "CANCELLED" | "COMPLETED" | "FAILED" | "PENDING" | "PENDING_CANCEL" | "RUNNING"
object ExportTaskStatusCode {
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val PENDING_CANCEL: "PENDING_CANCEL" = "PENDING_CANCEL"
  inline val RUNNING: "RUNNING" = "RUNNING"

  inline def values: js.Array[ExportTaskStatusCode] = js.Array(CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING)
}

type OrderBy = "LogStreamName" | "LastEventTime"
object OrderBy {
  inline val LogStreamName: "LogStreamName" = "LogStreamName"
  inline val LastEventTime: "LastEventTime" = "LastEventTime"

  inline def values: js.Array[OrderBy] = js.Array(LogStreamName, LastEventTime)
}

type QueryStatus = "Scheduled" | "Running" | "Complete" | "Failed" | "Cancelled" | "Timeout" | "Unknown"
object QueryStatus {
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val Running: "Running" = "Running"
  inline val Complete: "Complete" = "Complete"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Timeout: "Timeout" = "Timeout"
  inline val Unknown: "Unknown" = "Unknown"

  inline def values: js.Array[QueryStatus] = js.Array(Scheduled, Running, Complete, Failed, Cancelled, Timeout, Unknown)
}

type StandardUnit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object StandardUnit {
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val Count: "Count" = "Count"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"
  inline val None: "None" = "None"

  inline def values: js.Array[StandardUnit] = js.Array(
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
