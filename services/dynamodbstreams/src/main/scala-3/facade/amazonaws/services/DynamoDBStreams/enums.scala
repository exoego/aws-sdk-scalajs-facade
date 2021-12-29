package facade.amazonaws.services.dynamodbstreams

import scalajs._

type KeyType = "HASH" | "RANGE"
object KeyType {
  inline val HASH: "HASH" = "HASH"
  inline val RANGE: "RANGE" = "RANGE"

  inline def values: js.Array[KeyType] = js.Array(HASH, RANGE)
}

type OperationType = "INSERT" | "MODIFY" | "REMOVE"
object OperationType {
  inline val INSERT: "INSERT" = "INSERT"
  inline val MODIFY: "MODIFY" = "MODIFY"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[OperationType] = js.Array(INSERT, MODIFY, REMOVE)
}

type ShardIteratorType = "TRIM_HORIZON" | "LATEST" | "AT_SEQUENCE_NUMBER" | "AFTER_SEQUENCE_NUMBER"
object ShardIteratorType {
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"
  inline val AT_SEQUENCE_NUMBER: "AT_SEQUENCE_NUMBER" = "AT_SEQUENCE_NUMBER"
  inline val AFTER_SEQUENCE_NUMBER: "AFTER_SEQUENCE_NUMBER" = "AFTER_SEQUENCE_NUMBER"

  inline def values: js.Array[ShardIteratorType] = js.Array(TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER)
}

type StreamStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object StreamStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[StreamStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

type StreamViewType = "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY"
object StreamViewType {
  inline val NEW_IMAGE: "NEW_IMAGE" = "NEW_IMAGE"
  inline val OLD_IMAGE: "OLD_IMAGE" = "OLD_IMAGE"
  inline val NEW_AND_OLD_IMAGES: "NEW_AND_OLD_IMAGES" = "NEW_AND_OLD_IMAGES"
  inline val KEYS_ONLY: "KEYS_ONLY" = "KEYS_ONLY"

  inline def values: js.Array[StreamViewType] = js.Array(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
}
