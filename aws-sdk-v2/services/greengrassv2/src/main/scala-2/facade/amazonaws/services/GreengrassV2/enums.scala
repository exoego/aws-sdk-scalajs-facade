package facade.amazonaws.services.greengrassv2

import scalajs.js

@js.native
sealed trait CloudComponentState extends js.Any
object CloudComponentState {
  val REQUESTED = "REQUESTED".asInstanceOf[CloudComponentState]
  val INITIATED = "INITIATED".asInstanceOf[CloudComponentState]
  val DEPLOYABLE = "DEPLOYABLE".asInstanceOf[CloudComponentState]
  val FAILED = "FAILED".asInstanceOf[CloudComponentState]
  val DEPRECATED = "DEPRECATED".asInstanceOf[CloudComponentState]

  @inline def values: js.Array[CloudComponentState] = js.Array(REQUESTED, INITIATED, DEPLOYABLE, FAILED, DEPRECATED)
}

@js.native
sealed trait ComponentDependencyType extends js.Any
object ComponentDependencyType {
  val HARD = "HARD".asInstanceOf[ComponentDependencyType]
  val SOFT = "SOFT".asInstanceOf[ComponentDependencyType]

  @inline def values: js.Array[ComponentDependencyType] = js.Array(HARD, SOFT)
}

@js.native
sealed trait ComponentVisibilityScope extends js.Any
object ComponentVisibilityScope {
  val PRIVATE = "PRIVATE".asInstanceOf[ComponentVisibilityScope]
  val PUBLIC = "PUBLIC".asInstanceOf[ComponentVisibilityScope]

  @inline def values: js.Array[ComponentVisibilityScope] = js.Array(PRIVATE, PUBLIC)
}

@js.native
sealed trait CoreDeviceStatus extends js.Any
object CoreDeviceStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[CoreDeviceStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[CoreDeviceStatus]

  @inline def values: js.Array[CoreDeviceStatus] = js.Array(HEALTHY, UNHEALTHY)
}

@js.native
sealed trait DeploymentComponentUpdatePolicyAction extends js.Any
object DeploymentComponentUpdatePolicyAction {
  val NOTIFY_COMPONENTS = "NOTIFY_COMPONENTS".asInstanceOf[DeploymentComponentUpdatePolicyAction]
  val SKIP_NOTIFY_COMPONENTS = "SKIP_NOTIFY_COMPONENTS".asInstanceOf[DeploymentComponentUpdatePolicyAction]

  @inline def values: js.Array[DeploymentComponentUpdatePolicyAction] = js.Array(NOTIFY_COMPONENTS, SKIP_NOTIFY_COMPONENTS)
}

@js.native
sealed trait DeploymentFailureHandlingPolicy extends js.Any
object DeploymentFailureHandlingPolicy {
  val ROLLBACK = "ROLLBACK".asInstanceOf[DeploymentFailureHandlingPolicy]
  val DO_NOTHING = "DO_NOTHING".asInstanceOf[DeploymentFailureHandlingPolicy]

  @inline def values: js.Array[DeploymentFailureHandlingPolicy] = js.Array(ROLLBACK, DO_NOTHING)
}

@js.native
sealed trait DeploymentHistoryFilter extends js.Any
object DeploymentHistoryFilter {
  val ALL = "ALL".asInstanceOf[DeploymentHistoryFilter]
  val LATEST_ONLY = "LATEST_ONLY".asInstanceOf[DeploymentHistoryFilter]

  @inline def values: js.Array[DeploymentHistoryFilter] = js.Array(ALL, LATEST_ONLY)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DeploymentStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[DeploymentStatus]
  val CANCELED = "CANCELED".asInstanceOf[DeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[DeploymentStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[DeploymentStatus]

  @inline def values: js.Array[DeploymentStatus] = js.Array(ACTIVE, COMPLETED, CANCELED, FAILED, INACTIVE)
}

@js.native
sealed trait EffectiveDeploymentExecutionStatus extends js.Any
object EffectiveDeploymentExecutionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[EffectiveDeploymentExecutionStatus]
  val QUEUED = "QUEUED".asInstanceOf[EffectiveDeploymentExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[EffectiveDeploymentExecutionStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[EffectiveDeploymentExecutionStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[EffectiveDeploymentExecutionStatus]
  val CANCELED = "CANCELED".asInstanceOf[EffectiveDeploymentExecutionStatus]
  val REJECTED = "REJECTED".asInstanceOf[EffectiveDeploymentExecutionStatus]

  @inline def values: js.Array[EffectiveDeploymentExecutionStatus] = js.Array(IN_PROGRESS, QUEUED, FAILED, COMPLETED, TIMED_OUT, CANCELED, REJECTED)
}

@js.native
sealed trait InstalledComponentLifecycleState extends js.Any
object InstalledComponentLifecycleState {
  val NEW = "NEW".asInstanceOf[InstalledComponentLifecycleState]
  val INSTALLED = "INSTALLED".asInstanceOf[InstalledComponentLifecycleState]
  val STARTING = "STARTING".asInstanceOf[InstalledComponentLifecycleState]
  val RUNNING = "RUNNING".asInstanceOf[InstalledComponentLifecycleState]
  val STOPPING = "STOPPING".asInstanceOf[InstalledComponentLifecycleState]
  val ERRORED = "ERRORED".asInstanceOf[InstalledComponentLifecycleState]
  val BROKEN = "BROKEN".asInstanceOf[InstalledComponentLifecycleState]
  val FINISHED = "FINISHED".asInstanceOf[InstalledComponentLifecycleState]

  @inline def values: js.Array[InstalledComponentLifecycleState] = js.Array(NEW, INSTALLED, STARTING, RUNNING, STOPPING, ERRORED, BROKEN, FINISHED)
}

@js.native
sealed trait IoTJobAbortAction extends js.Any
object IoTJobAbortAction {
  val CANCEL = "CANCEL".asInstanceOf[IoTJobAbortAction]

  @inline def values: js.Array[IoTJobAbortAction] = js.Array(CANCEL)
}

@js.native
sealed trait IoTJobExecutionFailureType extends js.Any
object IoTJobExecutionFailureType {
  val FAILED = "FAILED".asInstanceOf[IoTJobExecutionFailureType]
  val REJECTED = "REJECTED".asInstanceOf[IoTJobExecutionFailureType]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[IoTJobExecutionFailureType]
  val ALL = "ALL".asInstanceOf[IoTJobExecutionFailureType]

  @inline def values: js.Array[IoTJobExecutionFailureType] = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
}

@js.native
sealed trait LambdaEventSourceType extends js.Any
object LambdaEventSourceType {
  val PUB_SUB = "PUB_SUB".asInstanceOf[LambdaEventSourceType]
  val IOT_CORE = "IOT_CORE".asInstanceOf[LambdaEventSourceType]

  @inline def values: js.Array[LambdaEventSourceType] = js.Array(PUB_SUB, IOT_CORE)
}

@js.native
sealed trait LambdaFilesystemPermission extends js.Any
object LambdaFilesystemPermission {
  val ro = "ro".asInstanceOf[LambdaFilesystemPermission]
  val rw = "rw".asInstanceOf[LambdaFilesystemPermission]

  @inline def values: js.Array[LambdaFilesystemPermission] = js.Array(ro, rw)
}

@js.native
sealed trait LambdaInputPayloadEncodingType extends js.Any
object LambdaInputPayloadEncodingType {
  val json = "json".asInstanceOf[LambdaInputPayloadEncodingType]
  val binary = "binary".asInstanceOf[LambdaInputPayloadEncodingType]

  @inline def values: js.Array[LambdaInputPayloadEncodingType] = js.Array(json, binary)
}

@js.native
sealed trait LambdaIsolationMode extends js.Any
object LambdaIsolationMode {
  val GreengrassContainer = "GreengrassContainer".asInstanceOf[LambdaIsolationMode]
  val NoContainer = "NoContainer".asInstanceOf[LambdaIsolationMode]

  @inline def values: js.Array[LambdaIsolationMode] = js.Array(GreengrassContainer, NoContainer)
}

@js.native
sealed trait RecipeOutputFormat extends js.Any
object RecipeOutputFormat {
  val JSON = "JSON".asInstanceOf[RecipeOutputFormat]
  val YAML = "YAML".asInstanceOf[RecipeOutputFormat]

  @inline def values: js.Array[RecipeOutputFormat] = js.Array(JSON, YAML)
}
