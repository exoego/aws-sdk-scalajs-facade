package facade.amazonaws.services.cloudwatchlogs

import scalajs._

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

type QueryStatus = "Scheduled" | "Running" | "Complete" | "Failed" | "Cancelled"
object QueryStatus {
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val Running: "Running" = "Running"
  inline val Complete: "Complete" = "Complete"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelled: "Cancelled" = "Cancelled"

  inline def values: js.Array[QueryStatus] = js.Array(Scheduled, Running, Complete, Failed, Cancelled)
}
