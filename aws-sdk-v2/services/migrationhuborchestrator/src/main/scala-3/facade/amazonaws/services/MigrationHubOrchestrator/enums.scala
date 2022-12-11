package facade.amazonaws.services.migrationhuborchestrator

import scalajs.js

type DataType = "STRING" | "INTEGER" | "STRINGLIST" | "STRINGMAP"
object DataType {
  inline val STRING: "STRING" = "STRING"
  inline val INTEGER: "INTEGER" = "INTEGER"
  inline val STRINGLIST: "STRINGLIST" = "STRINGLIST"
  inline val STRINGMAP: "STRINGMAP" = "STRINGMAP"

  inline def values: js.Array[DataType] = js.Array(STRING, INTEGER, STRINGLIST, STRINGMAP)
}

type MigrationWorkflowStatusEnum = "CREATING" | "NOT_STARTED" | "CREATION_FAILED" | "STARTING" | "IN_PROGRESS" | "WORKFLOW_FAILED" | "PAUSED" | "PAUSING" | "PAUSING_FAILED" | "USER_ATTENTION_REQUIRED" | "DELETING" | "DELETION_FAILED" | "DELETED" | "COMPLETED"
object MigrationWorkflowStatusEnum {
  inline val CREATING: "CREATING" = "CREATING"
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val WORKFLOW_FAILED: "WORKFLOW_FAILED" = "WORKFLOW_FAILED"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val PAUSING: "PAUSING" = "PAUSING"
  inline val PAUSING_FAILED: "PAUSING_FAILED" = "PAUSING_FAILED"
  inline val USER_ATTENTION_REQUIRED: "USER_ATTENTION_REQUIRED" = "USER_ATTENTION_REQUIRED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETION_FAILED: "DELETION_FAILED" = "DELETION_FAILED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[MigrationWorkflowStatusEnum] = js.Array(
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

type Owner = "AWS_MANAGED" | "CUSTOM"
object Owner {
  inline val AWS_MANAGED: "AWS_MANAGED" = "AWS_MANAGED"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[Owner] = js.Array(AWS_MANAGED, CUSTOM)
}

type PluginHealth = "HEALTHY" | "UNHEALTHY"
object PluginHealth {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  inline def values: js.Array[PluginHealth] = js.Array(HEALTHY, UNHEALTHY)
}

type RunEnvironment = "AWS" | "ONPREMISE"
object RunEnvironment {
  inline val AWS: "AWS" = "AWS"
  inline val ONPREMISE: "ONPREMISE" = "ONPREMISE"

  inline def values: js.Array[RunEnvironment] = js.Array(AWS, ONPREMISE)
}

type StepActionType = "MANUAL" | "AUTOMATED"
object StepActionType {
  inline val MANUAL: "MANUAL" = "MANUAL"
  inline val AUTOMATED: "AUTOMATED" = "AUTOMATED"

  inline def values: js.Array[StepActionType] = js.Array(MANUAL, AUTOMATED)
}

type StepGroupStatus = "AWAITING_DEPENDENCIES" | "READY" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "PAUSED" | "PAUSING" | "USER_ATTENTION_REQUIRED"
object StepGroupStatus {
  inline val AWAITING_DEPENDENCIES: "AWAITING_DEPENDENCIES" = "AWAITING_DEPENDENCIES"
  inline val READY: "READY" = "READY"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val PAUSING: "PAUSING" = "PAUSING"
  inline val USER_ATTENTION_REQUIRED: "USER_ATTENTION_REQUIRED" = "USER_ATTENTION_REQUIRED"

  inline def values: js.Array[StepGroupStatus] = js.Array(AWAITING_DEPENDENCIES, READY, IN_PROGRESS, COMPLETED, FAILED, PAUSED, PAUSING, USER_ATTENTION_REQUIRED)
}

type StepStatus = "AWAITING_DEPENDENCIES" | "READY" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "PAUSED" | "USER_ATTENTION_REQUIRED"
object StepStatus {
  inline val AWAITING_DEPENDENCIES: "AWAITING_DEPENDENCIES" = "AWAITING_DEPENDENCIES"
  inline val READY: "READY" = "READY"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val USER_ATTENTION_REQUIRED: "USER_ATTENTION_REQUIRED" = "USER_ATTENTION_REQUIRED"

  inline def values: js.Array[StepStatus] = js.Array(AWAITING_DEPENDENCIES, READY, IN_PROGRESS, COMPLETED, FAILED, PAUSED, USER_ATTENTION_REQUIRED)
}

type TargetType = "SINGLE" | "ALL" | "NONE"
object TargetType {
  inline val SINGLE: "SINGLE" = "SINGLE"
  inline val ALL: "ALL" = "ALL"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[TargetType] = js.Array(SINGLE, ALL, NONE)
}

type TemplateStatus = "CREATED"
object TemplateStatus {
  inline val CREATED: "CREATED" = "CREATED"

  inline def values: js.Array[TemplateStatus] = js.Array(CREATED)
}
