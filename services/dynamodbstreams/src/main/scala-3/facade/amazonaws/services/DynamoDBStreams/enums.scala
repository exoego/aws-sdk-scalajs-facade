package facade.amazonaws.services.dynamodbstreams

import scalajs._

type KeyType = "HASH" | "RANGE"
object KeyType {
  val HASH: "HASH" = "HASH"
  val RANGE: "RANGE" = "RANGE"

  @inline def values = js.Array[KeyType](HASH, RANGE)
}

type OperationType = "INSERT" | "MODIFY" | "REMOVE"
object OperationType {
  val INSERT: "INSERT" = "INSERT"
  val MODIFY: "MODIFY" = "MODIFY"
  val REMOVE: "REMOVE" = "REMOVE"

  @inline def values = js.Array[OperationType](INSERT, MODIFY, REMOVE)
}

type ShardIteratorType = "TRIM_HORIZON" | "LATEST" | "AT_SEQUENCE_NUMBER" | "AFTER_SEQUENCE_NUMBER"
object ShardIteratorType {
  val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  val LATEST: "LATEST" = "LATEST"
  val AT_SEQUENCE_NUMBER: "AT_SEQUENCE_NUMBER" = "AT_SEQUENCE_NUMBER"
  val AFTER_SEQUENCE_NUMBER: "AFTER_SEQUENCE_NUMBER" = "AFTER_SEQUENCE_NUMBER"

  @inline def values = js.Array[ShardIteratorType](TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER)
}

type StreamStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object StreamStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[StreamStatus](ENABLING, ENABLED, DISABLING, DISABLED)
}

type StreamViewType = "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY"
object StreamViewType {
  val NEW_IMAGE: "NEW_IMAGE" = "NEW_IMAGE"
  val OLD_IMAGE: "OLD_IMAGE" = "OLD_IMAGE"
  val NEW_AND_OLD_IMAGES: "NEW_AND_OLD_IMAGES" = "NEW_AND_OLD_IMAGES"
  val KEYS_ONLY: "KEYS_ONLY" = "KEYS_ONLY"

  @inline def values = js.Array[StreamViewType](NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
}
