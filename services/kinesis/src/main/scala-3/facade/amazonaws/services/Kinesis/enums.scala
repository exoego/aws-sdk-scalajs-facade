package facade.amazonaws.services.kinesis

import scalajs._

type ConsumerStatus = "CREATING" | "DELETING" | "ACTIVE"
object ConsumerStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[ConsumerStatus] = js.Array(CREATING, DELETING, ACTIVE)
}

type EncryptionType = "NONE" | "KMS"
object EncryptionType {
  inline val NONE: "NONE" = "NONE"
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionType] = js.Array(NONE, KMS)
}

type MetricsName = "IncomingBytes" | "IncomingRecords" | "OutgoingBytes" | "OutgoingRecords" | "WriteProvisionedThroughputExceeded" | "ReadProvisionedThroughputExceeded" | "IteratorAgeMilliseconds" | "ALL"
object MetricsName {
  inline val IncomingBytes: "IncomingBytes" = "IncomingBytes"
  inline val IncomingRecords: "IncomingRecords" = "IncomingRecords"
  inline val OutgoingBytes: "OutgoingBytes" = "OutgoingBytes"
  inline val OutgoingRecords: "OutgoingRecords" = "OutgoingRecords"
  inline val WriteProvisionedThroughputExceeded: "WriteProvisionedThroughputExceeded" = "WriteProvisionedThroughputExceeded"
  inline val ReadProvisionedThroughputExceeded: "ReadProvisionedThroughputExceeded" = "ReadProvisionedThroughputExceeded"
  inline val IteratorAgeMilliseconds: "IteratorAgeMilliseconds" = "IteratorAgeMilliseconds"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[MetricsName] = js.Array(
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
  inline val UNIFORM_SCALING: "UNIFORM_SCALING" = "UNIFORM_SCALING"

  inline def values: js.Array[ScalingType] = js.Array(UNIFORM_SCALING)
}

type ShardFilterType = "AFTER_SHARD_ID" | "AT_TRIM_HORIZON" | "FROM_TRIM_HORIZON" | "AT_LATEST" | "AT_TIMESTAMP" | "FROM_TIMESTAMP"
object ShardFilterType {
  inline val AFTER_SHARD_ID: "AFTER_SHARD_ID" = "AFTER_SHARD_ID"
  inline val AT_TRIM_HORIZON: "AT_TRIM_HORIZON" = "AT_TRIM_HORIZON"
  inline val FROM_TRIM_HORIZON: "FROM_TRIM_HORIZON" = "FROM_TRIM_HORIZON"
  inline val AT_LATEST: "AT_LATEST" = "AT_LATEST"
  inline val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"
  inline val FROM_TIMESTAMP: "FROM_TIMESTAMP" = "FROM_TIMESTAMP"

  inline def values: js.Array[ShardFilterType] = js.Array(AFTER_SHARD_ID, AT_TRIM_HORIZON, FROM_TRIM_HORIZON, AT_LATEST, AT_TIMESTAMP, FROM_TIMESTAMP)
}

type ShardIteratorType = "AT_SEQUENCE_NUMBER" | "AFTER_SEQUENCE_NUMBER" | "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP"
object ShardIteratorType {
  inline val AT_SEQUENCE_NUMBER: "AT_SEQUENCE_NUMBER" = "AT_SEQUENCE_NUMBER"
  inline val AFTER_SEQUENCE_NUMBER: "AFTER_SEQUENCE_NUMBER" = "AFTER_SEQUENCE_NUMBER"
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"
  inline val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"

  inline def values: js.Array[ShardIteratorType] = js.Array(AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

type StreamStatus = "CREATING" | "DELETING" | "ACTIVE" | "UPDATING"
object StreamStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[StreamStatus] = js.Array(CREATING, DELETING, ACTIVE, UPDATING)
}
