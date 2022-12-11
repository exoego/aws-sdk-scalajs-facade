package facade.amazonaws.services.pipes

import scalajs.js

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

type BatchJobDependencyType = "N_TO_N" | "SEQUENTIAL"
object BatchJobDependencyType {
  inline val N_TO_N: "N_TO_N" = "N_TO_N"
  inline val SEQUENTIAL: "SEQUENTIAL" = "SEQUENTIAL"

  inline def values: js.Array[BatchJobDependencyType] = js.Array(N_TO_N, SEQUENTIAL)
}

type BatchResourceRequirementType = "GPU" | "MEMORY" | "VCPU"
object BatchResourceRequirementType {
  inline val GPU: "GPU" = "GPU"
  inline val MEMORY: "MEMORY" = "MEMORY"
  inline val VCPU: "VCPU" = "VCPU"

  inline def values: js.Array[BatchResourceRequirementType] = js.Array(GPU, MEMORY, VCPU)
}

type DynamoDBStreamStartPosition = "TRIM_HORIZON" | "LATEST"
object DynamoDBStreamStartPosition {
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"

  inline def values: js.Array[DynamoDBStreamStartPosition] = js.Array(TRIM_HORIZON, LATEST)
}

type EcsEnvironmentFileType = "s3"
object EcsEnvironmentFileType {
  inline val s3: "s3" = "s3"

  inline def values: js.Array[EcsEnvironmentFileType] = js.Array(s3)
}

type EcsResourceRequirementType = "GPU" | "InferenceAccelerator"
object EcsResourceRequirementType {
  inline val GPU: "GPU" = "GPU"
  inline val InferenceAccelerator: "InferenceAccelerator" = "InferenceAccelerator"

  inline def values: js.Array[EcsResourceRequirementType] = js.Array(GPU, InferenceAccelerator)
}

type KinesisStreamStartPosition = "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP"
object KinesisStreamStartPosition {
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"
  inline val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"

  inline def values: js.Array[KinesisStreamStartPosition] = js.Array(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

type LaunchType = "EC2" | "FARGATE" | "EXTERNAL"
object LaunchType {
  inline val EC2: "EC2" = "EC2"
  inline val FARGATE: "FARGATE" = "FARGATE"
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE, EXTERNAL)
}

type MSKStartPosition = "TRIM_HORIZON" | "LATEST"
object MSKStartPosition {
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"

  inline def values: js.Array[MSKStartPosition] = js.Array(TRIM_HORIZON, LATEST)
}

type OnPartialBatchItemFailureStreams = "AUTOMATIC_BISECT"
object OnPartialBatchItemFailureStreams {
  inline val AUTOMATIC_BISECT: "AUTOMATIC_BISECT" = "AUTOMATIC_BISECT"

  inline def values: js.Array[OnPartialBatchItemFailureStreams] = js.Array(AUTOMATIC_BISECT)
}

type PipeState = "RUNNING" | "STOPPED" | "CREATING" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "CREATE_FAILED" | "UPDATE_FAILED" | "START_FAILED" | "STOP_FAILED"
object PipeState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val START_FAILED: "START_FAILED" = "START_FAILED"
  inline val STOP_FAILED: "STOP_FAILED" = "STOP_FAILED"

  inline def values: js.Array[PipeState] = js.Array(RUNNING, STOPPED, CREATING, UPDATING, DELETING, STARTING, STOPPING, CREATE_FAILED, UPDATE_FAILED, START_FAILED, STOP_FAILED)
}

type PipeTargetInvocationType = "REQUEST_RESPONSE" | "FIRE_AND_FORGET"
object PipeTargetInvocationType {
  inline val REQUEST_RESPONSE: "REQUEST_RESPONSE" = "REQUEST_RESPONSE"
  inline val FIRE_AND_FORGET: "FIRE_AND_FORGET" = "FIRE_AND_FORGET"

  inline def values: js.Array[PipeTargetInvocationType] = js.Array(REQUEST_RESPONSE, FIRE_AND_FORGET)
}

type PlacementConstraintType = "distinctInstance" | "memberOf"
object PlacementConstraintType {
  inline val distinctInstance: "distinctInstance" = "distinctInstance"
  inline val memberOf: "memberOf" = "memberOf"

  inline def values: js.Array[PlacementConstraintType] = js.Array(distinctInstance, memberOf)
}

type PlacementStrategyType = "random" | "spread" | "binpack"
object PlacementStrategyType {
  inline val random: "random" = "random"
  inline val spread: "spread" = "spread"
  inline val binpack: "binpack" = "binpack"

  inline def values: js.Array[PlacementStrategyType] = js.Array(random, spread, binpack)
}

type PropagateTags = "TASK_DEFINITION"
object PropagateTags {
  inline val TASK_DEFINITION: "TASK_DEFINITION" = "TASK_DEFINITION"

  inline def values: js.Array[PropagateTags] = js.Array(TASK_DEFINITION)
}

type RequestedPipeState = "RUNNING" | "STOPPED"
object RequestedPipeState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[RequestedPipeState] = js.Array(RUNNING, STOPPED)
}

type RequestedPipeStateDescribeResponse = "RUNNING" | "STOPPED" | "DELETED"
object RequestedPipeStateDescribeResponse {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[RequestedPipeStateDescribeResponse] = js.Array(RUNNING, STOPPED, DELETED)
}

type SelfManagedKafkaStartPosition = "TRIM_HORIZON" | "LATEST"
object SelfManagedKafkaStartPosition {
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"

  inline def values: js.Array[SelfManagedKafkaStartPosition] = js.Array(TRIM_HORIZON, LATEST)
}
