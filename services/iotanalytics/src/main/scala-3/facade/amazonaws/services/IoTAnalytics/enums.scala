package facade.amazonaws.services.iotanalytics

import scalajs._

type ChannelStatus = "CREATING" | "ACTIVE" | "DELETING"
object ChannelStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ChannelStatus](CREATING, ACTIVE, DELETING)
}

type ComputeType = "ACU_1" | "ACU_2"
object ComputeType {
  val ACU_1: "ACU_1" = "ACU_1"
  val ACU_2: "ACU_2" = "ACU_2"

  @inline def values = js.Array[ComputeType](ACU_1, ACU_2)
}

type DatasetActionType = "QUERY" | "CONTAINER"
object DatasetActionType {
  val QUERY: "QUERY" = "QUERY"
  val CONTAINER: "CONTAINER" = "CONTAINER"

  @inline def values = js.Array[DatasetActionType](QUERY, CONTAINER)
}

type DatasetContentState = "CREATING" | "SUCCEEDED" | "FAILED"
object DatasetContentState {
  val CREATING: "CREATING" = "CREATING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[DatasetContentState](CREATING, SUCCEEDED, FAILED)
}

type DatasetStatus = "CREATING" | "ACTIVE" | "DELETING"
object DatasetStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[DatasetStatus](CREATING, ACTIVE, DELETING)
}

type DatastoreStatus = "CREATING" | "ACTIVE" | "DELETING"
object DatastoreStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[DatastoreStatus](CREATING, ACTIVE, DELETING)
}

type FileFormatType = "JSON" | "PARQUET"
object FileFormatType {
  val JSON: "JSON" = "JSON"
  val PARQUET: "PARQUET" = "PARQUET"

  @inline def values = js.Array[FileFormatType](JSON, PARQUET)
}

type LoggingLevel = "ERROR"
object LoggingLevel {
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[LoggingLevel](ERROR)
}

type ReprocessingStatus = "RUNNING" | "SUCCEEDED" | "CANCELLED" | "FAILED"
object ReprocessingStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ReprocessingStatus](RUNNING, SUCCEEDED, CANCELLED, FAILED)
}
