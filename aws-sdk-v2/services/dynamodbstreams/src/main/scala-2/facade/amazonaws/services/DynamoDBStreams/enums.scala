package facade.amazonaws.services.dynamodbstreams

import scalajs.js

@js.native
sealed trait KeyType extends js.Any
object KeyType {
  val HASH = "HASH".asInstanceOf[KeyType]
  val RANGE = "RANGE".asInstanceOf[KeyType]

  @inline def values: js.Array[KeyType] = js.Array(HASH, RANGE)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val INSERT = "INSERT".asInstanceOf[OperationType]
  val MODIFY = "MODIFY".asInstanceOf[OperationType]
  val REMOVE = "REMOVE".asInstanceOf[OperationType]

  @inline def values: js.Array[OperationType] = js.Array(INSERT, MODIFY, REMOVE)
}

@js.native
sealed trait ShardIteratorType extends js.Any
object ShardIteratorType {
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[ShardIteratorType]
  val LATEST = "LATEST".asInstanceOf[ShardIteratorType]
  val AT_SEQUENCE_NUMBER = "AT_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
  val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]

  @inline def values: js.Array[ShardIteratorType] = js.Array(TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER)
}

@js.native
sealed trait StreamStatus extends js.Any
object StreamStatus {
  val ENABLING = "ENABLING".asInstanceOf[StreamStatus]
  val ENABLED = "ENABLED".asInstanceOf[StreamStatus]
  val DISABLING = "DISABLING".asInstanceOf[StreamStatus]
  val DISABLED = "DISABLED".asInstanceOf[StreamStatus]

  @inline def values: js.Array[StreamStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

@js.native
sealed trait StreamViewType extends js.Any
object StreamViewType {
  val NEW_IMAGE = "NEW_IMAGE".asInstanceOf[StreamViewType]
  val OLD_IMAGE = "OLD_IMAGE".asInstanceOf[StreamViewType]
  val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[StreamViewType]
  val KEYS_ONLY = "KEYS_ONLY".asInstanceOf[StreamViewType]

  @inline def values: js.Array[StreamViewType] = js.Array(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
}
