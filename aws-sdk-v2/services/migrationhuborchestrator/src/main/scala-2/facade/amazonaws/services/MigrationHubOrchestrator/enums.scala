package facade.amazonaws.services.migrationhuborchestrator

import scalajs.js

@js.native
sealed trait DataType extends js.Any
object DataType {
  val STRING = "STRING".asInstanceOf[DataType]
  val INTEGER = "INTEGER".asInstanceOf[DataType]
  val STRINGLIST = "STRINGLIST".asInstanceOf[DataType]
  val STRINGMAP = "STRINGMAP".asInstanceOf[DataType]

  @inline def values: js.Array[DataType] = js.Array(STRING, INTEGER, STRINGLIST, STRINGMAP)
}

@js.native
sealed trait MigrationWorkflowStatusEnum extends js.Any
object MigrationWorkflowStatusEnum {
  val CREATING = "CREATING".asInstanceOf[MigrationWorkflowStatusEnum]
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[MigrationWorkflowStatusEnum]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[MigrationWorkflowStatusEnum]
  val STARTING = "STARTING".asInstanceOf[MigrationWorkflowStatusEnum]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[MigrationWorkflowStatusEnum]
  val WORKFLOW_FAILED = "WORKFLOW_FAILED".asInstanceOf[MigrationWorkflowStatusEnum]
  val PAUSED = "PAUSED".asInstanceOf[MigrationWorkflowStatusEnum]
  val PAUSING = "PAUSING".asInstanceOf[MigrationWorkflowStatusEnum]
  val PAUSING_FAILED = "PAUSING_FAILED".asInstanceOf[MigrationWorkflowStatusEnum]
  val USER_ATTENTION_REQUIRED = "USER_ATTENTION_REQUIRED".asInstanceOf[MigrationWorkflowStatusEnum]
  val DELETING = "DELETING".asInstanceOf[MigrationWorkflowStatusEnum]
  val DELETION_FAILED = "DELETION_FAILED".asInstanceOf[MigrationWorkflowStatusEnum]
  val DELETED = "DELETED".asInstanceOf[MigrationWorkflowStatusEnum]
  val COMPLETED = "COMPLETED".asInstanceOf[MigrationWorkflowStatusEnum]

  @inline def values: js.Array[MigrationWorkflowStatusEnum] = js.Array(
    CREATING,
    NOT_STARTED,
    CREATION_FAILED,
    STARTING,
    IN_PROGRESS,
    WORKFLOW_FAILED,
    PAUSED,
    PAUSING,
    PAUSING_FAILED,
    USER_ATTENTION_REQUIRED,
    DELETING,
    DELETION_FAILED,
    DELETED,
    COMPLETED
  )
}

@js.native
sealed trait Owner extends js.Any
object Owner {
  val AWS_MANAGED = "AWS_MANAGED".asInstanceOf[Owner]
  val CUSTOM = "CUSTOM".asInstanceOf[Owner]

  @inline def values: js.Array[Owner] = js.Array(AWS_MANAGED, CUSTOM)
}

@js.native
sealed trait PluginHealth extends js.Any
object PluginHealth {
  val HEALTHY = "HEALTHY".asInstanceOf[PluginHealth]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[PluginHealth]

  @inline def values: js.Array[PluginHealth] = js.Array(HEALTHY, UNHEALTHY)
}

@js.native
sealed trait RunEnvironment extends js.Any
object RunEnvironment {
  val AWS = "AWS".asInstanceOf[RunEnvironment]
  val ONPREMISE = "ONPREMISE".asInstanceOf[RunEnvironment]

  @inline def values: js.Array[RunEnvironment] = js.Array(AWS, ONPREMISE)
}

@js.native
sealed trait StepActionType extends js.Any
object StepActionType {
  val MANUAL = "MANUAL".asInstanceOf[StepActionType]
  val AUTOMATED = "AUTOMATED".asInstanceOf[StepActionType]

  @inline def values: js.Array[StepActionType] = js.Array(MANUAL, AUTOMATED)
}

@js.native
sealed trait StepGroupStatus extends js.Any
object StepGroupStatus {
  val AWAITING_DEPENDENCIES = "AWAITING_DEPENDENCIES".asInstanceOf[StepGroupStatus]
  val READY = "READY".asInstanceOf[StepGroupStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StepGroupStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[StepGroupStatus]
  val FAILED = "FAILED".asInstanceOf[StepGroupStatus]
  val PAUSED = "PAUSED".asInstanceOf[StepGroupStatus]
  val PAUSING = "PAUSING".asInstanceOf[StepGroupStatus]
  val USER_ATTENTION_REQUIRED = "USER_ATTENTION_REQUIRED".asInstanceOf[StepGroupStatus]

  @inline def values: js.Array[StepGroupStatus] = js.Array(AWAITING_DEPENDENCIES, READY, IN_PROGRESS, COMPLETED, FAILED, PAUSED, PAUSING, USER_ATTENTION_REQUIRED)
}

@js.native
sealed trait StepStatus extends js.Any
object StepStatus {
  val AWAITING_DEPENDENCIES = "AWAITING_DEPENDENCIES".asInstanceOf[StepStatus]
  val READY = "READY".asInstanceOf[StepStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StepStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[StepStatus]
  val FAILED = "FAILED".asInstanceOf[StepStatus]
  val PAUSED = "PAUSED".asInstanceOf[StepStatus]
  val USER_ATTENTION_REQUIRED = "USER_ATTENTION_REQUIRED".asInstanceOf[StepStatus]

  @inline def values: js.Array[StepStatus] = js.Array(AWAITING_DEPENDENCIES, READY, IN_PROGRESS, COMPLETED, FAILED, PAUSED, USER_ATTENTION_REQUIRED)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val SINGLE = "SINGLE".asInstanceOf[TargetType]
  val ALL = "ALL".asInstanceOf[TargetType]
  val NONE = "NONE".asInstanceOf[TargetType]

  @inline def values: js.Array[TargetType] = js.Array(SINGLE, ALL, NONE)
}

@js.native
sealed trait TemplateStatus extends js.Any
object TemplateStatus {
  val CREATED = "CREATED".asInstanceOf[TemplateStatus]

  @inline def values: js.Array[TemplateStatus] = js.Array(CREATED)
}
