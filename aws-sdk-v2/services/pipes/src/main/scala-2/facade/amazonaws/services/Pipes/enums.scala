package facade.amazonaws.services.pipes

import scalajs.js

@js.native
sealed trait AssignPublicIp extends js.Any
object AssignPublicIp {
  val ENABLED = "ENABLED".asInstanceOf[AssignPublicIp]
  val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

  @inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait BatchJobDependencyType extends js.Any
object BatchJobDependencyType {
  val N_TO_N = "N_TO_N".asInstanceOf[BatchJobDependencyType]
  val SEQUENTIAL = "SEQUENTIAL".asInstanceOf[BatchJobDependencyType]

  @inline def values: js.Array[BatchJobDependencyType] = js.Array(N_TO_N, SEQUENTIAL)
}

@js.native
sealed trait BatchResourceRequirementType extends js.Any
object BatchResourceRequirementType {
  val GPU = "GPU".asInstanceOf[BatchResourceRequirementType]
  val MEMORY = "MEMORY".asInstanceOf[BatchResourceRequirementType]
  val VCPU = "VCPU".asInstanceOf[BatchResourceRequirementType]

  @inline def values: js.Array[BatchResourceRequirementType] = js.Array(GPU, MEMORY, VCPU)
}

@js.native
sealed trait DynamoDBStreamStartPosition extends js.Any
object DynamoDBStreamStartPosition {
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[DynamoDBStreamStartPosition]
  val LATEST = "LATEST".asInstanceOf[DynamoDBStreamStartPosition]

  @inline def values: js.Array[DynamoDBStreamStartPosition] = js.Array(TRIM_HORIZON, LATEST)
}

@js.native
sealed trait EcsEnvironmentFileType extends js.Any
object EcsEnvironmentFileType {
  val s3 = "s3".asInstanceOf[EcsEnvironmentFileType]

  @inline def values: js.Array[EcsEnvironmentFileType] = js.Array(s3)
}

@js.native
sealed trait EcsResourceRequirementType extends js.Any
object EcsResourceRequirementType {
  val GPU = "GPU".asInstanceOf[EcsResourceRequirementType]
  val InferenceAccelerator = "InferenceAccelerator".asInstanceOf[EcsResourceRequirementType]

  @inline def values: js.Array[EcsResourceRequirementType] = js.Array(GPU, InferenceAccelerator)
}

@js.native
sealed trait KinesisStreamStartPosition extends js.Any
object KinesisStreamStartPosition {
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[KinesisStreamStartPosition]
  val LATEST = "LATEST".asInstanceOf[KinesisStreamStartPosition]
  val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[KinesisStreamStartPosition]

  @inline def values: js.Array[KinesisStreamStartPosition] = js.Array(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

@js.native
sealed trait LaunchType extends js.Any
object LaunchType {
  val EC2 = "EC2".asInstanceOf[LaunchType]
  val FARGATE = "FARGATE".asInstanceOf[LaunchType]
  val EXTERNAL = "EXTERNAL".asInstanceOf[LaunchType]

  @inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE, EXTERNAL)
}

@js.native
sealed trait MSKStartPosition extends js.Any
object MSKStartPosition {
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[MSKStartPosition]
  val LATEST = "LATEST".asInstanceOf[MSKStartPosition]

  @inline def values: js.Array[MSKStartPosition] = js.Array(TRIM_HORIZON, LATEST)
}

@js.native
sealed trait OnPartialBatchItemFailureStreams extends js.Any
object OnPartialBatchItemFailureStreams {
  val AUTOMATIC_BISECT = "AUTOMATIC_BISECT".asInstanceOf[OnPartialBatchItemFailureStreams]

  @inline def values: js.Array[OnPartialBatchItemFailureStreams] = js.Array(AUTOMATIC_BISECT)
}

@js.native
sealed trait PipeState extends js.Any
object PipeState {
  val RUNNING = "RUNNING".asInstanceOf[PipeState]
  val STOPPED = "STOPPED".asInstanceOf[PipeState]
  val CREATING = "CREATING".asInstanceOf[PipeState]
  val UPDATING = "UPDATING".asInstanceOf[PipeState]
  val DELETING = "DELETING".asInstanceOf[PipeState]
  val STARTING = "STARTING".asInstanceOf[PipeState]
  val STOPPING = "STOPPING".asInstanceOf[PipeState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[PipeState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[PipeState]
  val START_FAILED = "START_FAILED".asInstanceOf[PipeState]
  val STOP_FAILED = "STOP_FAILED".asInstanceOf[PipeState]

  @inline def values: js.Array[PipeState] = js.Array(RUNNING, STOPPED, CREATING, UPDATING, DELETING, STARTING, STOPPING, CREATE_FAILED, UPDATE_FAILED, START_FAILED, STOP_FAILED)
}

@js.native
sealed trait PipeTargetInvocationType extends js.Any
object PipeTargetInvocationType {
  val REQUEST_RESPONSE = "REQUEST_RESPONSE".asInstanceOf[PipeTargetInvocationType]
  val FIRE_AND_FORGET = "FIRE_AND_FORGET".asInstanceOf[PipeTargetInvocationType]

  @inline def values: js.Array[PipeTargetInvocationType] = js.Array(REQUEST_RESPONSE, FIRE_AND_FORGET)
}

@js.native
sealed trait PlacementConstraintType extends js.Any
object PlacementConstraintType {
  val distinctInstance = "distinctInstance".asInstanceOf[PlacementConstraintType]
  val memberOf = "memberOf".asInstanceOf[PlacementConstraintType]

  @inline def values: js.Array[PlacementConstraintType] = js.Array(distinctInstance, memberOf)
}

@js.native
sealed trait PlacementStrategyType extends js.Any
object PlacementStrategyType {
  val random = "random".asInstanceOf[PlacementStrategyType]
  val spread = "spread".asInstanceOf[PlacementStrategyType]
  val binpack = "binpack".asInstanceOf[PlacementStrategyType]

  @inline def values: js.Array[PlacementStrategyType] = js.Array(random, spread, binpack)
}

@js.native
sealed trait PropagateTags extends js.Any
object PropagateTags {
  val TASK_DEFINITION = "TASK_DEFINITION".asInstanceOf[PropagateTags]

  @inline def values: js.Array[PropagateTags] = js.Array(TASK_DEFINITION)
}

@js.native
sealed trait RequestedPipeState extends js.Any
object RequestedPipeState {
  val RUNNING = "RUNNING".asInstanceOf[RequestedPipeState]
  val STOPPED = "STOPPED".asInstanceOf[RequestedPipeState]

  @inline def values: js.Array[RequestedPipeState] = js.Array(RUNNING, STOPPED)
}

@js.native
sealed trait RequestedPipeStateDescribeResponse extends js.Any
object RequestedPipeStateDescribeResponse {
  val RUNNING = "RUNNING".asInstanceOf[RequestedPipeStateDescribeResponse]
  val STOPPED = "STOPPED".asInstanceOf[RequestedPipeStateDescribeResponse]
  val DELETED = "DELETED".asInstanceOf[RequestedPipeStateDescribeResponse]

  @inline def values: js.Array[RequestedPipeStateDescribeResponse] = js.Array(RUNNING, STOPPED, DELETED)
}

@js.native
sealed trait SelfManagedKafkaStartPosition extends js.Any
object SelfManagedKafkaStartPosition {
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[SelfManagedKafkaStartPosition]
  val LATEST = "LATEST".asInstanceOf[SelfManagedKafkaStartPosition]

  @inline def values: js.Array[SelfManagedKafkaStartPosition] = js.Array(TRIM_HORIZON, LATEST)
}
