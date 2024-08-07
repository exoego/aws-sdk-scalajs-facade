package facade.amazonaws.services.kinesis

import scalajs.js

@js.native
sealed trait ConsumerStatus extends js.Any
object ConsumerStatus {
  val CREATING = "CREATING".asInstanceOf[ConsumerStatus]
  val DELETING = "DELETING".asInstanceOf[ConsumerStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ConsumerStatus]

  @inline def values: js.Array[ConsumerStatus] = js.Array(CREATING, DELETING, ACTIVE)
}

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val NONE = "NONE".asInstanceOf[EncryptionType]
  val KMS = "KMS".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(NONE, KMS)
}

@js.native
sealed trait MetricsName extends js.Any
object MetricsName {
  val IncomingBytes = "IncomingBytes".asInstanceOf[MetricsName]
  val IncomingRecords = "IncomingRecords".asInstanceOf[MetricsName]
  val OutgoingBytes = "OutgoingBytes".asInstanceOf[MetricsName]
  val OutgoingRecords = "OutgoingRecords".asInstanceOf[MetricsName]
  val WriteProvisionedThroughputExceeded = "WriteProvisionedThroughputExceeded".asInstanceOf[MetricsName]
  val ReadProvisionedThroughputExceeded = "ReadProvisionedThroughputExceeded".asInstanceOf[MetricsName]
  val IteratorAgeMilliseconds = "IteratorAgeMilliseconds".asInstanceOf[MetricsName]
  val ALL = "ALL".asInstanceOf[MetricsName]

  @inline def values: js.Array[MetricsName] = js.Array(
    IncomingBytes,
    IncomingRecords,
    OutgoingBytes,
    OutgoingRecords,
    WriteProvisionedThroughputExceeded,
    ReadProvisionedThroughputExceeded,
    IteratorAgeMilliseconds,
    ALL
  )
}

@js.native
sealed trait ScalingType extends js.Any
object ScalingType {
  val UNIFORM_SCALING = "UNIFORM_SCALING".asInstanceOf[ScalingType]

  @inline def values: js.Array[ScalingType] = js.Array(UNIFORM_SCALING)
}

@js.native
sealed trait ShardFilterType extends js.Any
object ShardFilterType {
  val AFTER_SHARD_ID = "AFTER_SHARD_ID".asInstanceOf[ShardFilterType]
  val AT_TRIM_HORIZON = "AT_TRIM_HORIZON".asInstanceOf[ShardFilterType]
  val FROM_TRIM_HORIZON = "FROM_TRIM_HORIZON".asInstanceOf[ShardFilterType]
  val AT_LATEST = "AT_LATEST".asInstanceOf[ShardFilterType]
  val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[ShardFilterType]
  val FROM_TIMESTAMP = "FROM_TIMESTAMP".asInstanceOf[ShardFilterType]

  @inline def values: js.Array[ShardFilterType] = js.Array(AFTER_SHARD_ID, AT_TRIM_HORIZON, FROM_TRIM_HORIZON, AT_LATEST, AT_TIMESTAMP, FROM_TIMESTAMP)
}

@js.native
sealed trait ShardIteratorType extends js.Any
object ShardIteratorType {
  val AT_SEQUENCE_NUMBER = "AT_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
  val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[ShardIteratorType]
  val LATEST = "LATEST".asInstanceOf[ShardIteratorType]
  val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[ShardIteratorType]

  @inline def values: js.Array[ShardIteratorType] = js.Array(AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

@js.native
sealed trait StreamMode extends js.Any
object StreamMode {
  val PROVISIONED = "PROVISIONED".asInstanceOf[StreamMode]
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[StreamMode]

  @inline def values: js.Array[StreamMode] = js.Array(PROVISIONED, ON_DEMAND)
}

@js.native
sealed trait StreamStatus extends js.Any
object StreamStatus {
  val CREATING = "CREATING".asInstanceOf[StreamStatus]
  val DELETING = "DELETING".asInstanceOf[StreamStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[StreamStatus]
  val UPDATING = "UPDATING".asInstanceOf[StreamStatus]

  @inline def values: js.Array[StreamStatus] = js.Array(CREATING, DELETING, ACTIVE, UPDATING)
}
