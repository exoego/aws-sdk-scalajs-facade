package facade.amazonaws.services.iotanalytics

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ChannelStatus extends js.Any
object ChannelStatus {
  val CREATING = "CREATING".asInstanceOf[ChannelStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ChannelStatus]
  val DELETING = "DELETING".asInstanceOf[ChannelStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING)
}

@js.native
sealed trait ComputeType extends js.Any
object ComputeType {
  val ACU_1 = "ACU_1".asInstanceOf[ComputeType]
  val ACU_2 = "ACU_2".asInstanceOf[ComputeType]

  @inline def values = js.Array(ACU_1, ACU_2)
}

@js.native
sealed trait DatasetActionType extends js.Any
object DatasetActionType {
  val QUERY = "QUERY".asInstanceOf[DatasetActionType]
  val CONTAINER = "CONTAINER".asInstanceOf[DatasetActionType]

  @inline def values = js.Array(QUERY, CONTAINER)
}

@js.native
sealed trait DatasetContentState extends js.Any
object DatasetContentState {
  val CREATING = "CREATING".asInstanceOf[DatasetContentState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DatasetContentState]
  val FAILED = "FAILED".asInstanceOf[DatasetContentState]

  @inline def values = js.Array(CREATING, SUCCEEDED, FAILED)
}

@js.native
sealed trait DatasetStatus extends js.Any
object DatasetStatus {
  val CREATING = "CREATING".asInstanceOf[DatasetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DatasetStatus]
  val DELETING = "DELETING".asInstanceOf[DatasetStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING)
}

@js.native
sealed trait DatastoreStatus extends js.Any
object DatastoreStatus {
  val CREATING = "CREATING".asInstanceOf[DatastoreStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DatastoreStatus]
  val DELETING = "DELETING".asInstanceOf[DatastoreStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING)
}

@js.native
sealed trait FileFormatType extends js.Any
object FileFormatType {
  val JSON = "JSON".asInstanceOf[FileFormatType]
  val PARQUET = "PARQUET".asInstanceOf[FileFormatType]

  @inline def values = js.Array(JSON, PARQUET)
}

@js.native
sealed trait LoggingLevel extends js.Any
object LoggingLevel {
  val ERROR = "ERROR".asInstanceOf[LoggingLevel]

  @inline def values = js.Array(ERROR)
}

@js.native
sealed trait ReprocessingStatus extends js.Any
object ReprocessingStatus {
  val RUNNING = "RUNNING".asInstanceOf[ReprocessingStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ReprocessingStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ReprocessingStatus]
  val FAILED = "FAILED".asInstanceOf[ReprocessingStatus]

  @inline def values = js.Array(RUNNING, SUCCEEDED, CANCELLED, FAILED)
}
