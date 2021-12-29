package facade.amazonaws.services.greengrassv2

import scalajs._

type CloudComponentState = "REQUESTED" | "INITIATED" | "DEPLOYABLE" | "FAILED" | "DEPRECATED"
object CloudComponentState {
  val REQUESTED: "REQUESTED" = "REQUESTED"
  val INITIATED: "INITIATED" = "INITIATED"
  val DEPLOYABLE: "DEPLOYABLE" = "DEPLOYABLE"
  val FAILED: "FAILED" = "FAILED"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  @inline def values = js.Array[CloudComponentState](REQUESTED, INITIATED, DEPLOYABLE, FAILED, DEPRECATED)
}

type ComponentDependencyType = "HARD" | "SOFT"
object ComponentDependencyType {
  val HARD: "HARD" = "HARD"
  val SOFT: "SOFT" = "SOFT"

  @inline def values = js.Array[ComponentDependencyType](HARD, SOFT)
}

type ComponentVisibilityScope = "PRIVATE" | "PUBLIC"
object ComponentVisibilityScope {
  val PRIVATE: "PRIVATE" = "PRIVATE"
  val PUBLIC: "PUBLIC" = "PUBLIC"

  @inline def values = js.Array[ComponentVisibilityScope](PRIVATE, PUBLIC)
}

type CoreDeviceStatus = "HEALTHY" | "UNHEALTHY"
object CoreDeviceStatus {
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  @inline def values = js.Array[CoreDeviceStatus](HEALTHY, UNHEALTHY)
}

type DeploymentComponentUpdatePolicyAction = "NOTIFY_COMPONENTS" | "SKIP_NOTIFY_COMPONENTS"
object DeploymentComponentUpdatePolicyAction {
  val NOTIFY_COMPONENTS: "NOTIFY_COMPONENTS" = "NOTIFY_COMPONENTS"
  val SKIP_NOTIFY_COMPONENTS: "SKIP_NOTIFY_COMPONENTS" = "SKIP_NOTIFY_COMPONENTS"

  @inline def values = js.Array[DeploymentComponentUpdatePolicyAction](NOTIFY_COMPONENTS, SKIP_NOTIFY_COMPONENTS)
}

type DeploymentFailureHandlingPolicy = "ROLLBACK" | "DO_NOTHING"
object DeploymentFailureHandlingPolicy {
  val ROLLBACK: "ROLLBACK" = "ROLLBACK"
  val DO_NOTHING: "DO_NOTHING" = "DO_NOTHING"

  @inline def values = js.Array[DeploymentFailureHandlingPolicy](ROLLBACK, DO_NOTHING)
}

type DeploymentHistoryFilter = "ALL" | "LATEST_ONLY"
object DeploymentHistoryFilter {
  val ALL: "ALL" = "ALL"
  val LATEST_ONLY: "LATEST_ONLY" = "LATEST_ONLY"

  @inline def values = js.Array[DeploymentHistoryFilter](ALL, LATEST_ONLY)
}

type DeploymentStatus = "ACTIVE" | "COMPLETED" | "CANCELED" | "FAILED" | "INACTIVE"
object DeploymentStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELED: "CANCELED" = "CANCELED"
  val FAILED: "FAILED" = "FAILED"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[DeploymentStatus](ACTIVE, COMPLETED, CANCELED, FAILED, INACTIVE)
}

type EffectiveDeploymentExecutionStatus = "IN_PROGRESS" | "QUEUED" | "FAILED" | "COMPLETED" | "TIMED_OUT" | "CANCELED" | "REJECTED"
object EffectiveDeploymentExecutionStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val QUEUED: "QUEUED" = "QUEUED"
  val FAILED: "FAILED" = "FAILED"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val CANCELED: "CANCELED" = "CANCELED"
  val REJECTED: "REJECTED" = "REJECTED"

  @inline def values = js.Array[EffectiveDeploymentExecutionStatus](IN_PROGRESS, QUEUED, FAILED, COMPLETED, TIMED_OUT, CANCELED, REJECTED)
}

type InstalledComponentLifecycleState = "NEW" | "INSTALLED" | "STARTING" | "RUNNING" | "STOPPING" | "ERRORED" | "BROKEN" | "FINISHED"
object InstalledComponentLifecycleState {
  val NEW: "NEW" = "NEW"
  val INSTALLED: "INSTALLED" = "INSTALLED"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPING: "STOPPING" = "STOPPING"
  val ERRORED: "ERRORED" = "ERRORED"
  val BROKEN: "BROKEN" = "BROKEN"
  val FINISHED: "FINISHED" = "FINISHED"

  @inline def values = js.Array[InstalledComponentLifecycleState](NEW, INSTALLED, STARTING, RUNNING, STOPPING, ERRORED, BROKEN, FINISHED)
}

type IoTJobAbortAction = "CANCEL"
object IoTJobAbortAction {
  val CANCEL: "CANCEL" = "CANCEL"

  @inline def values = js.Array[IoTJobAbortAction](CANCEL)
}

type IoTJobExecutionFailureType = "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL"
object IoTJobExecutionFailureType {
  val FAILED: "FAILED" = "FAILED"
  val REJECTED: "REJECTED" = "REJECTED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[IoTJobExecutionFailureType](FAILED, REJECTED, TIMED_OUT, ALL)
}

type LambdaEventSourceType = "PUB_SUB" | "IOT_CORE"
object LambdaEventSourceType {
  val PUB_SUB: "PUB_SUB" = "PUB_SUB"
  val IOT_CORE: "IOT_CORE" = "IOT_CORE"

  @inline def values = js.Array[LambdaEventSourceType](PUB_SUB, IOT_CORE)
}

type LambdaFilesystemPermission = "ro" | "rw"
object LambdaFilesystemPermission {
  val ro: "ro" = "ro"
  val rw: "rw" = "rw"

  @inline def values = js.Array[LambdaFilesystemPermission](ro, rw)
}

type LambdaInputPayloadEncodingType = "json" | "binary"
object LambdaInputPayloadEncodingType {
  val json: "json" = "json"
  val binary: "binary" = "binary"

  @inline def values = js.Array[LambdaInputPayloadEncodingType](json, binary)
}

type LambdaIsolationMode = "GreengrassContainer" | "NoContainer"
object LambdaIsolationMode {
  val GreengrassContainer: "GreengrassContainer" = "GreengrassContainer"
  val NoContainer: "NoContainer" = "NoContainer"

  @inline def values = js.Array[LambdaIsolationMode](GreengrassContainer, NoContainer)
}

type RecipeOutputFormat = "JSON" | "YAML"
object RecipeOutputFormat {
  val JSON: "JSON" = "JSON"
  val YAML: "YAML" = "YAML"

  @inline def values = js.Array[RecipeOutputFormat](JSON, YAML)
}
