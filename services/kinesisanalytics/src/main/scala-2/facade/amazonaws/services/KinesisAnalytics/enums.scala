package facade.amazonaws.services.kinesisanalytics

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApplicationStatus extends js.Any
object ApplicationStatus {
  val DELETING = "DELETING".asInstanceOf[ApplicationStatus]
  val STARTING = "STARTING".asInstanceOf[ApplicationStatus]
  val STOPPING = "STOPPING".asInstanceOf[ApplicationStatus]
  val READY = "READY".asInstanceOf[ApplicationStatus]
  val RUNNING = "RUNNING".asInstanceOf[ApplicationStatus]
  val UPDATING = "UPDATING".asInstanceOf[ApplicationStatus]

  @inline def values = js.Array(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING)
}

@js.native
sealed trait InputStartingPosition extends js.Any
object InputStartingPosition {
  val NOW = "NOW".asInstanceOf[InputStartingPosition]
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[InputStartingPosition]
  val LAST_STOPPED_POINT = "LAST_STOPPED_POINT".asInstanceOf[InputStartingPosition]

  @inline def values = js.Array(NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
}

@js.native
sealed trait RecordFormatType extends js.Any
object RecordFormatType {
  val JSON = "JSON".asInstanceOf[RecordFormatType]
  val CSV = "CSV".asInstanceOf[RecordFormatType]

  @inline def values = js.Array(JSON, CSV)
}

