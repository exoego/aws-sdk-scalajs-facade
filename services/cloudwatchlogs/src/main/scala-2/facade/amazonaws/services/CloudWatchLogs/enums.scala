package facade.amazonaws.services.cloudwatchlogs

import scalajs._
import scala.scalajs.js.|

/** The method used to distribute log data to the destination, which can be either random or grouped by log stream.
  */
@js.native
sealed trait Distribution extends js.Any
object Distribution {
  val Random = "Random".asInstanceOf[Distribution]
  val ByLogStream = "ByLogStream".asInstanceOf[Distribution]

  @inline def values = js.Array(Random, ByLogStream)
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

  @inline def values = js.Array(CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING)
}

@js.native
sealed trait OrderBy extends js.Any
object OrderBy {
  val LogStreamName = "LogStreamName".asInstanceOf[OrderBy]
  val LastEventTime = "LastEventTime".asInstanceOf[OrderBy]

  @inline def values = js.Array(LogStreamName, LastEventTime)
}

@js.native
sealed trait QueryStatus extends js.Any
object QueryStatus {
  val Scheduled = "Scheduled".asInstanceOf[QueryStatus]
  val Running = "Running".asInstanceOf[QueryStatus]
  val Complete = "Complete".asInstanceOf[QueryStatus]
  val Failed = "Failed".asInstanceOf[QueryStatus]
  val Cancelled = "Cancelled".asInstanceOf[QueryStatus]

  @inline def values = js.Array(Scheduled, Running, Complete, Failed, Cancelled)
}
