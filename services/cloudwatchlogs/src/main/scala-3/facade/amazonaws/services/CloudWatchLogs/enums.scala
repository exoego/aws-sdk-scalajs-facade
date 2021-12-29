package facade.amazonaws.services.cloudwatchlogs

import scalajs._

/** The method used to distribute log data to the destination, which can be either random or grouped by log stream.
  */
type Distribution = "Random" | "ByLogStream"
object Distribution {
  val Random: "Random" = "Random"
  val ByLogStream: "ByLogStream" = "ByLogStream"

  @inline def values = js.Array[Distribution](Random, ByLogStream)
}

type ExportTaskStatusCode = "CANCELLED" | "COMPLETED" | "FAILED" | "PENDING" | "PENDING_CANCEL" | "RUNNING"
object ExportTaskStatusCode {
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val PENDING: "PENDING" = "PENDING"
  val PENDING_CANCEL: "PENDING_CANCEL" = "PENDING_CANCEL"
  val RUNNING: "RUNNING" = "RUNNING"

  @inline def values = js.Array[ExportTaskStatusCode](CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING)
}

type OrderBy = "LogStreamName" | "LastEventTime"
object OrderBy {
  val LogStreamName: "LogStreamName" = "LogStreamName"
  val LastEventTime: "LastEventTime" = "LastEventTime"

  @inline def values = js.Array[OrderBy](LogStreamName, LastEventTime)
}

type QueryStatus = "Scheduled" | "Running" | "Complete" | "Failed" | "Cancelled"
object QueryStatus {
  val Scheduled: "Scheduled" = "Scheduled"
  val Running: "Running" = "Running"
  val Complete: "Complete" = "Complete"
  val Failed: "Failed" = "Failed"
  val Cancelled: "Cancelled" = "Cancelled"

  @inline def values = js.Array[QueryStatus](Scheduled, Running, Complete, Failed, Cancelled)
}
