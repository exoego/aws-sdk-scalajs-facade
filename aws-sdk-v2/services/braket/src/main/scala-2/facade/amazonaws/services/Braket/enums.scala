package facade.amazonaws.services.braket

import scalajs.js

@js.native
sealed trait CancellationStatus extends js.Any
object CancellationStatus {
  val CANCELLING = "CANCELLING".asInstanceOf[CancellationStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[CancellationStatus]

  @inline def values: js.Array[CancellationStatus] = js.Array(CANCELLING, CANCELLED)
}

@js.native
sealed trait CompressionType extends js.Any
object CompressionType {
  val NONE = "NONE".asInstanceOf[CompressionType]
  val GZIP = "GZIP".asInstanceOf[CompressionType]

  @inline def values: js.Array[CompressionType] = js.Array(NONE, GZIP)
}

@js.native
sealed trait DeviceStatus extends js.Any
object DeviceStatus {
  val ONLINE = "ONLINE".asInstanceOf[DeviceStatus]
  val OFFLINE = "OFFLINE".asInstanceOf[DeviceStatus]
  val RETIRED = "RETIRED".asInstanceOf[DeviceStatus]

  @inline def values: js.Array[DeviceStatus] = js.Array(ONLINE, OFFLINE, RETIRED)
}

@js.native
sealed trait DeviceType extends js.Any
object DeviceType {
  val QPU = "QPU".asInstanceOf[DeviceType]
  val SIMULATOR = "SIMULATOR".asInstanceOf[DeviceType]

  @inline def values: js.Array[DeviceType] = js.Array(QPU, SIMULATOR)
}

@js.native
sealed trait InstanceType extends js.Any
object InstanceType {
  val `ml.m4.xlarge` = "ml.m4.xlarge".asInstanceOf[InstanceType]
  val `ml.m4.2xlarge` = "ml.m4.2xlarge".asInstanceOf[InstanceType]
  val `ml.m4.4xlarge` = "ml.m4.4xlarge".asInstanceOf[InstanceType]
  val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[InstanceType]
  val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[InstanceType]
  val `ml.m5.large` = "ml.m5.large".asInstanceOf[InstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[InstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[InstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[InstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[InstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[InstanceType]
  val `ml.c4.xlarge` = "ml.c4.xlarge".asInstanceOf[InstanceType]
  val `ml.c4.2xlarge` = "ml.c4.2xlarge".asInstanceOf[InstanceType]
  val `ml.c4.4xlarge` = "ml.c4.4xlarge".asInstanceOf[InstanceType]
  val `ml.c4.8xlarge` = "ml.c4.8xlarge".asInstanceOf[InstanceType]
  val `ml.p2.xlarge` = "ml.p2.xlarge".asInstanceOf[InstanceType]
  val `ml.p2.8xlarge` = "ml.p2.8xlarge".asInstanceOf[InstanceType]
  val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[InstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[InstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[InstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[InstanceType]
  val `ml.p3dn.24xlarge` = "ml.p3dn.24xlarge".asInstanceOf[InstanceType]
  val `ml.p4d.24xlarge` = "ml.p4d.24xlarge".asInstanceOf[InstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[InstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[InstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[InstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[InstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[InstanceType]
  val `ml.c5n.xlarge` = "ml.c5n.xlarge".asInstanceOf[InstanceType]
  val `ml.c5n.2xlarge` = "ml.c5n.2xlarge".asInstanceOf[InstanceType]
  val `ml.c5n.4xlarge` = "ml.c5n.4xlarge".asInstanceOf[InstanceType]
  val `ml.c5n.9xlarge` = "ml.c5n.9xlarge".asInstanceOf[InstanceType]
  val `ml.c5n.18xlarge` = "ml.c5n.18xlarge".asInstanceOf[InstanceType]

  @inline def values: js.Array[InstanceType] = js.Array(
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

@js.native
sealed trait JobEventType extends js.Any
object JobEventType {
  val WAITING_FOR_PRIORITY = "WAITING_FOR_PRIORITY".asInstanceOf[JobEventType]
  val QUEUED_FOR_EXECUTION = "QUEUED_FOR_EXECUTION".asInstanceOf[JobEventType]
  val STARTING_INSTANCE = "STARTING_INSTANCE".asInstanceOf[JobEventType]
  val DOWNLOADING_DATA = "DOWNLOADING_DATA".asInstanceOf[JobEventType]
  val RUNNING = "RUNNING".asInstanceOf[JobEventType]
  val DEPRIORITIZED_DUE_TO_INACTIVITY = "DEPRIORITIZED_DUE_TO_INACTIVITY".asInstanceOf[JobEventType]
  val UPLOADING_RESULTS = "UPLOADING_RESULTS".asInstanceOf[JobEventType]
  val COMPLETED = "COMPLETED".asInstanceOf[JobEventType]
  val FAILED = "FAILED".asInstanceOf[JobEventType]
  val MAX_RUNTIME_EXCEEDED = "MAX_RUNTIME_EXCEEDED".asInstanceOf[JobEventType]
  val CANCELLED = "CANCELLED".asInstanceOf[JobEventType]

  @inline def values: js.Array[JobEventType] = js.Array(
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

@js.native
sealed trait JobPrimaryStatus extends js.Any
object JobPrimaryStatus {
  val QUEUED = "QUEUED".asInstanceOf[JobPrimaryStatus]
  val RUNNING = "RUNNING".asInstanceOf[JobPrimaryStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobPrimaryStatus]
  val FAILED = "FAILED".asInstanceOf[JobPrimaryStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[JobPrimaryStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[JobPrimaryStatus]

  @inline def values: js.Array[JobPrimaryStatus] = js.Array(QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

@js.native
sealed trait QuantumTaskStatus extends js.Any
object QuantumTaskStatus {
  val CREATED = "CREATED".asInstanceOf[QuantumTaskStatus]
  val QUEUED = "QUEUED".asInstanceOf[QuantumTaskStatus]
  val RUNNING = "RUNNING".asInstanceOf[QuantumTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[QuantumTaskStatus]
  val FAILED = "FAILED".asInstanceOf[QuantumTaskStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[QuantumTaskStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[QuantumTaskStatus]

  @inline def values: js.Array[QuantumTaskStatus] = js.Array(CREATED, QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

@js.native
sealed trait SearchJobsFilterOperator extends js.Any
object SearchJobsFilterOperator {
  val LT = "LT".asInstanceOf[SearchJobsFilterOperator]
  val LTE = "LTE".asInstanceOf[SearchJobsFilterOperator]
  val EQUAL = "EQUAL".asInstanceOf[SearchJobsFilterOperator]
  val GT = "GT".asInstanceOf[SearchJobsFilterOperator]
  val GTE = "GTE".asInstanceOf[SearchJobsFilterOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[SearchJobsFilterOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[SearchJobsFilterOperator]

  @inline def values: js.Array[SearchJobsFilterOperator] = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN, CONTAINS)
}

@js.native
sealed trait SearchQuantumTasksFilterOperator extends js.Any
object SearchQuantumTasksFilterOperator {
  val LT = "LT".asInstanceOf[SearchQuantumTasksFilterOperator]
  val LTE = "LTE".asInstanceOf[SearchQuantumTasksFilterOperator]
  val EQUAL = "EQUAL".asInstanceOf[SearchQuantumTasksFilterOperator]
  val GT = "GT".asInstanceOf[SearchQuantumTasksFilterOperator]
  val GTE = "GTE".asInstanceOf[SearchQuantumTasksFilterOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[SearchQuantumTasksFilterOperator]

  @inline def values: js.Array[SearchQuantumTasksFilterOperator] = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN)
}
