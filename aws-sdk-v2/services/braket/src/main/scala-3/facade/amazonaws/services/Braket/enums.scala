package facade.amazonaws.services.braket

import scalajs.js

type CancellationStatus = "CANCELLING" | "CANCELLED"
object CancellationStatus {
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[CancellationStatus] = js.Array(CANCELLING, CANCELLED)
}

type CompressionType = "NONE" | "GZIP"
object CompressionType {
  inline val NONE: "NONE" = "NONE"
  inline val GZIP: "GZIP" = "GZIP"

  inline def values: js.Array[CompressionType] = js.Array(NONE, GZIP)
}

type DeviceStatus = "ONLINE" | "OFFLINE" | "RETIRED"
object DeviceStatus {
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"
  inline val RETIRED: "RETIRED" = "RETIRED"

  inline def values: js.Array[DeviceStatus] = js.Array(ONLINE, OFFLINE, RETIRED)
}

type DeviceType = "QPU" | "SIMULATOR"
object DeviceType {
  inline val QPU: "QPU" = "QPU"
  inline val SIMULATOR: "SIMULATOR" = "SIMULATOR"

  inline def values: js.Array[DeviceType] = js.Array(QPU, SIMULATOR)
}

type InstanceType = "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.p4d.24xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5n.xlarge" | "ml.c5n.2xlarge" | "ml.c5n.4xlarge" | "ml.c5n.9xlarge" | "ml.c5n.18xlarge"
object InstanceType {
  inline val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  inline val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  inline val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  inline val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  inline val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  inline val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  inline val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  inline val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  inline val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  inline val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  inline val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  inline val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.p3dn.24xlarge`: "ml.p3dn.24xlarge" = "ml.p3dn.24xlarge"
  inline val `ml.p4d.24xlarge`: "ml.p4d.24xlarge" = "ml.p4d.24xlarge"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.c5n.xlarge`: "ml.c5n.xlarge" = "ml.c5n.xlarge"
  inline val `ml.c5n.2xlarge`: "ml.c5n.2xlarge" = "ml.c5n.2xlarge"
  inline val `ml.c5n.4xlarge`: "ml.c5n.4xlarge" = "ml.c5n.4xlarge"
  inline val `ml.c5n.9xlarge`: "ml.c5n.9xlarge" = "ml.c5n.9xlarge"
  inline val `ml.c5n.18xlarge`: "ml.c5n.18xlarge" = "ml.c5n.18xlarge"

  inline def values: js.Array[InstanceType] = js.Array(
    `ml.m4.xlarge`,
    `ml.m4.2xlarge`,
    `ml.m4.4xlarge`,
    `ml.m4.10xlarge`,
    `ml.m4.16xlarge`,
    `ml.g4dn.xlarge`,
    `ml.g4dn.2xlarge`,
    `ml.g4dn.4xlarge`,
    `ml.g4dn.8xlarge`,
    `ml.g4dn.12xlarge`,
    `ml.g4dn.16xlarge`,
    `ml.m5.large`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.24xlarge`,
    `ml.c4.xlarge`,
    `ml.c4.2xlarge`,
    `ml.c4.4xlarge`,
    `ml.c4.8xlarge`,
    `ml.p2.xlarge`,
    `ml.p2.8xlarge`,
    `ml.p2.16xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`,
    `ml.p3dn.24xlarge`,
    `ml.p4d.24xlarge`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.18xlarge`,
    `ml.c5n.xlarge`,
    `ml.c5n.2xlarge`,
    `ml.c5n.4xlarge`,
    `ml.c5n.9xlarge`,
    `ml.c5n.18xlarge`
  )
}

type JobEventType = "WAITING_FOR_PRIORITY" | "QUEUED_FOR_EXECUTION" | "STARTING_INSTANCE" | "DOWNLOADING_DATA" | "RUNNING" | "DEPRIORITIZED_DUE_TO_INACTIVITY" | "UPLOADING_RESULTS" | "COMPLETED" | "FAILED" | "MAX_RUNTIME_EXCEEDED" | "CANCELLED"
object JobEventType {
  inline val WAITING_FOR_PRIORITY: "WAITING_FOR_PRIORITY" = "WAITING_FOR_PRIORITY"
  inline val QUEUED_FOR_EXECUTION: "QUEUED_FOR_EXECUTION" = "QUEUED_FOR_EXECUTION"
  inline val STARTING_INSTANCE: "STARTING_INSTANCE" = "STARTING_INSTANCE"
  inline val DOWNLOADING_DATA: "DOWNLOADING_DATA" = "DOWNLOADING_DATA"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val DEPRIORITIZED_DUE_TO_INACTIVITY: "DEPRIORITIZED_DUE_TO_INACTIVITY" = "DEPRIORITIZED_DUE_TO_INACTIVITY"
  inline val UPLOADING_RESULTS: "UPLOADING_RESULTS" = "UPLOADING_RESULTS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val MAX_RUNTIME_EXCEEDED: "MAX_RUNTIME_EXCEEDED" = "MAX_RUNTIME_EXCEEDED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[JobEventType] = js.Array(
    WAITING_FOR_PRIORITY,
    QUEUED_FOR_EXECUTION,
    STARTING_INSTANCE,
    DOWNLOADING_DATA,
    RUNNING,
    DEPRIORITIZED_DUE_TO_INACTIVITY,
    UPLOADING_RESULTS,
    COMPLETED,
    FAILED,
    MAX_RUNTIME_EXCEEDED,
    CANCELLED
  )
}

type JobPrimaryStatus = "QUEUED" | "RUNNING" | "COMPLETED" | "FAILED" | "CANCELLING" | "CANCELLED"
object JobPrimaryStatus {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[JobPrimaryStatus] = js.Array(QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

type QuantumTaskStatus = "CREATED" | "QUEUED" | "RUNNING" | "COMPLETED" | "FAILED" | "CANCELLING" | "CANCELLED"
object QuantumTaskStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[QuantumTaskStatus] = js.Array(CREATED, QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

type SearchJobsFilterOperator = "LT" | "LTE" | "EQUAL" | "GT" | "GTE" | "BETWEEN" | "CONTAINS"
object SearchJobsFilterOperator {
  inline val LT: "LT" = "LT"
  inline val LTE: "LTE" = "LTE"
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val GT: "GT" = "GT"
  inline val GTE: "GTE" = "GTE"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"

  inline def values: js.Array[SearchJobsFilterOperator] = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN, CONTAINS)
}

type SearchQuantumTasksFilterOperator = "LT" | "LTE" | "EQUAL" | "GT" | "GTE" | "BETWEEN"
object SearchQuantumTasksFilterOperator {
  inline val LT: "LT" = "LT"
  inline val LTE: "LTE" = "LTE"
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val GT: "GT" = "GT"
  inline val GTE: "GTE" = "GTE"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[SearchQuantumTasksFilterOperator] = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN)
}
