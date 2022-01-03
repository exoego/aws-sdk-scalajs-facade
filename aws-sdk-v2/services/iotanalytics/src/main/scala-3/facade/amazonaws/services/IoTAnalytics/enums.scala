package facade.amazonaws.services.iotanalytics

import scalajs.js

type ChannelStatus = "CREATING" | "ACTIVE" | "DELETING"
object ChannelStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ChannelStatus] = js.Array(CREATING, ACTIVE, DELETING)
}

type ComputeType = "ACU_1" | "ACU_2"
object ComputeType {
  inline val ACU_1: "ACU_1" = "ACU_1"
  inline val ACU_2: "ACU_2" = "ACU_2"

  inline def values: js.Array[ComputeType] = js.Array(ACU_1, ACU_2)
}

type DatasetActionType = "QUERY" | "CONTAINER"
object DatasetActionType {
  inline val QUERY: "QUERY" = "QUERY"
  inline val CONTAINER: "CONTAINER" = "CONTAINER"

  inline def values: js.Array[DatasetActionType] = js.Array(QUERY, CONTAINER)
}

type DatasetContentState = "CREATING" | "SUCCEEDED" | "FAILED"
object DatasetContentState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DatasetContentState] = js.Array(CREATING, SUCCEEDED, FAILED)
}

type DatasetStatus = "CREATING" | "ACTIVE" | "DELETING"
object DatasetStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[DatasetStatus] = js.Array(CREATING, ACTIVE, DELETING)
}

type DatastoreStatus = "CREATING" | "ACTIVE" | "DELETING"
object DatastoreStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[DatastoreStatus] = js.Array(CREATING, ACTIVE, DELETING)
}

type FileFormatType = "JSON" | "PARQUET"
object FileFormatType {
  inline val JSON: "JSON" = "JSON"
  inline val PARQUET: "PARQUET" = "PARQUET"

  inline def values: js.Array[FileFormatType] = js.Array(JSON, PARQUET)
}

type LoggingLevel = "ERROR"
object LoggingLevel {
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[LoggingLevel] = js.Array(ERROR)
}

type ReprocessingStatus = "RUNNING" | "SUCCEEDED" | "CANCELLED" | "FAILED"
object ReprocessingStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReprocessingStatus] = js.Array(RUNNING, SUCCEEDED, CANCELLED, FAILED)
}
