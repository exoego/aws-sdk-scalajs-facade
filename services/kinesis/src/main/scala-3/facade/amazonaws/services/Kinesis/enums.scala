package facade.amazonaws.services.kinesis

import scalajs._

type ConsumerStatus = "CREATING" | "DELETING" | "ACTIVE"
object ConsumerStatus {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[ConsumerStatus](CREATING, DELETING, ACTIVE)
}

type EncryptionType = "NONE" | "KMS"
object EncryptionType {
  val NONE: "NONE" = "NONE"
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[EncryptionType](NONE, KMS)
}

type MetricsName = "IncomingBytes" | "IncomingRecords" | "OutgoingBytes" | "OutgoingRecords" | "WriteProvisionedThroughputExceeded" | "ReadProvisionedThroughputExceeded" | "IteratorAgeMilliseconds" | "ALL"
object MetricsName {
  val IncomingBytes: "IncomingBytes" = "IncomingBytes"
  val IncomingRecords: "IncomingRecords" = "IncomingRecords"
  val OutgoingBytes: "OutgoingBytes" = "OutgoingBytes"
  val OutgoingRecords: "OutgoingRecords" = "OutgoingRecords"
  val WriteProvisionedThroughputExceeded: "WriteProvisionedThroughputExceeded" = "WriteProvisionedThroughputExceeded"
  val ReadProvisionedThroughputExceeded: "ReadProvisionedThroughputExceeded" = "ReadProvisionedThroughputExceeded"
  val IteratorAgeMilliseconds: "IteratorAgeMilliseconds" = "IteratorAgeMilliseconds"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[MetricsName](
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

type ScalingType = "UNIFORM_SCALING"
object ScalingType {
  val UNIFORM_SCALING: "UNIFORM_SCALING" = "UNIFORM_SCALING"

  @inline def values = js.Array[ScalingType](UNIFORM_SCALING)
}

type ShardFilterType = "AFTER_SHARD_ID" | "AT_TRIM_HORIZON" | "FROM_TRIM_HORIZON" | "AT_LATEST" | "AT_TIMESTAMP" | "FROM_TIMESTAMP"
object ShardFilterType {
  val AFTER_SHARD_ID: "AFTER_SHARD_ID" = "AFTER_SHARD_ID"
  val AT_TRIM_HORIZON: "AT_TRIM_HORIZON" = "AT_TRIM_HORIZON"
  val FROM_TRIM_HORIZON: "FROM_TRIM_HORIZON" = "FROM_TRIM_HORIZON"
  val AT_LATEST: "AT_LATEST" = "AT_LATEST"
  val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"
  val FROM_TIMESTAMP: "FROM_TIMESTAMP" = "FROM_TIMESTAMP"

  @inline def values = js.Array[ShardFilterType](AFTER_SHARD_ID, AT_TRIM_HORIZON, FROM_TRIM_HORIZON, AT_LATEST, AT_TIMESTAMP, FROM_TIMESTAMP)
}

type ShardIteratorType = "AT_SEQUENCE_NUMBER" | "AFTER_SEQUENCE_NUMBER" | "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP"
object ShardIteratorType {
  val AT_SEQUENCE_NUMBER: "AT_SEQUENCE_NUMBER" = "AT_SEQUENCE_NUMBER"
  val AFTER_SEQUENCE_NUMBER: "AFTER_SEQUENCE_NUMBER" = "AFTER_SEQUENCE_NUMBER"
  val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  val LATEST: "LATEST" = "LATEST"
  val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"

  @inline def values = js.Array[ShardIteratorType](AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

type StreamStatus = "CREATING" | "DELETING" | "ACTIVE" | "UPDATING"
object StreamStatus {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[StreamStatus](CREATING, DELETING, ACTIVE, UPDATING)
}
