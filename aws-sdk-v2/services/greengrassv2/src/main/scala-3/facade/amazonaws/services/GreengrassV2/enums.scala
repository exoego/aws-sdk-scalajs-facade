package facade.amazonaws.services.greengrassv2

import scalajs.js

type CloudComponentState = "REQUESTED" | "INITIATED" | "DEPLOYABLE" | "FAILED" | "DEPRECATED"
object CloudComponentState {
  inline val REQUESTED: "REQUESTED" = "REQUESTED"
  inline val INITIATED: "INITIATED" = "INITIATED"
  inline val DEPLOYABLE: "DEPLOYABLE" = "DEPLOYABLE"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  inline def values: js.Array[CloudComponentState] = js.Array(REQUESTED, INITIATED, DEPLOYABLE, FAILED, DEPRECATED)
}

type ComponentDependencyType = "HARD" | "SOFT"
object ComponentDependencyType {
  inline val HARD: "HARD" = "HARD"
  inline val SOFT: "SOFT" = "SOFT"

  inline def values: js.Array[ComponentDependencyType] = js.Array(HARD, SOFT)
}

type ComponentVisibilityScope = "PRIVATE" | "PUBLIC"
object ComponentVisibilityScope {
  inline val PRIVATE: "PRIVATE" = "PRIVATE"
  inline val PUBLIC: "PUBLIC" = "PUBLIC"

  inline def values: js.Array[ComponentVisibilityScope] = js.Array(PRIVATE, PUBLIC)
}

type CoreDeviceStatus = "HEALTHY" | "UNHEALTHY"
object CoreDeviceStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  inline def values: js.Array[CoreDeviceStatus] = js.Array(HEALTHY, UNHEALTHY)
}

type DeploymentComponentUpdatePolicyAction = "NOTIFY_COMPONENTS" | "SKIP_NOTIFY_COMPONENTS"
object DeploymentComponentUpdatePolicyAction {
  inline val NOTIFY_COMPONENTS: "NOTIFY_COMPONENTS" = "NOTIFY_COMPONENTS"
  inline val SKIP_NOTIFY_COMPONENTS: "SKIP_NOTIFY_COMPONENTS" = "SKIP_NOTIFY_COMPONENTS"

  inline def values: js.Array[DeploymentComponentUpdatePolicyAction] = js.Array(NOTIFY_COMPONENTS, SKIP_NOTIFY_COMPONENTS)
}

type DeploymentFailureHandlingPolicy = "ROLLBACK" | "DO_NOTHING"
object DeploymentFailureHandlingPolicy {
  inline val ROLLBACK: "ROLLBACK" = "ROLLBACK"
  inline val DO_NOTHING: "DO_NOTHING" = "DO_NOTHING"

  inline def values: js.Array[DeploymentFailureHandlingPolicy] = js.Array(ROLLBACK, DO_NOTHING)
}

type DeploymentHistoryFilter = "ALL" | "LATEST_ONLY"
object DeploymentHistoryFilter {
  inline val ALL: "ALL" = "ALL"
  inline val LATEST_ONLY: "LATEST_ONLY" = "LATEST_ONLY"

  inline def values: js.Array[DeploymentHistoryFilter] = js.Array(ALL, LATEST_ONLY)
}

type DeploymentStatus = "ACTIVE" | "COMPLETED" | "CANCELED" | "FAILED" | "INACTIVE"
object DeploymentStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[DeploymentStatus] = js.Array(ACTIVE, COMPLETED, CANCELED, FAILED, INACTIVE)
}

type EffectiveDeploymentExecutionStatus = "IN_PROGRESS" | "QUEUED" | "FAILED" | "COMPLETED" | "TIMED_OUT" | "CANCELED" | "REJECTED"
object EffectiveDeploymentExecutionStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val REJECTED: "REJECTED" = "REJECTED"

  inline def values: js.Array[EffectiveDeploymentExecutionStatus] = js.Array(IN_PROGRESS, QUEUED, FAILED, COMPLETED, TIMED_OUT, CANCELED, REJECTED)
}

type InstalledComponentLifecycleState = "NEW" | "INSTALLED" | "STARTING" | "RUNNING" | "STOPPING" | "ERRORED" | "BROKEN" | "FINISHED"
object InstalledComponentLifecycleState {
  inline val NEW: "NEW" = "NEW"
  inline val INSTALLED: "INSTALLED" = "INSTALLED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val ERRORED: "ERRORED" = "ERRORED"
  inline val BROKEN: "BROKEN" = "BROKEN"
  inline val FINISHED: "FINISHED" = "FINISHED"

  inline def values: js.Array[InstalledComponentLifecycleState] = js.Array(NEW, INSTALLED, STARTING, RUNNING, STOPPING, ERRORED, BROKEN, FINISHED)
}

type InstalledComponentTopologyFilter = "ALL" | "ROOT"
object InstalledComponentTopologyFilter {
  inline val ALL: "ALL" = "ALL"
  inline val ROOT: "ROOT" = "ROOT"

  inline def values: js.Array[InstalledComponentTopologyFilter] = js.Array(ALL, ROOT)
}

type IoTJobAbortAction = "CANCEL"
object IoTJobAbortAction {
  inline val CANCEL: "CANCEL" = "CANCEL"

  inline def values: js.Array[IoTJobAbortAction] = js.Array(CANCEL)
}

type IoTJobExecutionFailureType = "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL"
object IoTJobExecutionFailureType {
  inline val FAILED: "FAILED" = "FAILED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[IoTJobExecutionFailureType] = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
}

type LambdaEventSourceType = "PUB_SUB" | "IOT_CORE"
object LambdaEventSourceType {
  inline val PUB_SUB: "PUB_SUB" = "PUB_SUB"
  inline val IOT_CORE: "IOT_CORE" = "IOT_CORE"

  inline def values: js.Array[LambdaEventSourceType] = js.Array(PUB_SUB, IOT_CORE)
}

type LambdaFilesystemPermission = "ro" | "rw"
object LambdaFilesystemPermission {
  inline val ro: "ro" = "ro"
  inline val rw: "rw" = "rw"

  inline def values: js.Array[LambdaFilesystemPermission] = js.Array(ro, rw)
}

type LambdaInputPayloadEncodingType = "json" | "binary"
object LambdaInputPayloadEncodingType {
  inline val json: "json" = "json"
  inline val binary: "binary" = "binary"

  inline def values: js.Array[LambdaInputPayloadEncodingType] = js.Array(json, binary)
}

type LambdaIsolationMode = "GreengrassContainer" | "NoContainer"
object LambdaIsolationMode {
  inline val GreengrassContainer: "GreengrassContainer" = "GreengrassContainer"
  inline val NoContainer: "NoContainer" = "NoContainer"

  inline def values: js.Array[LambdaIsolationMode] = js.Array(GreengrassContainer, NoContainer)
}

type RecipeOutputFormat = "JSON" | "YAML"
object RecipeOutputFormat {
  inline val JSON: "JSON" = "JSON"
  inline val YAML: "YAML" = "YAML"

  inline def values: js.Array[RecipeOutputFormat] = js.Array(JSON, YAML)
}

type VendorGuidance = "ACTIVE" | "DISCONTINUED" | "DELETED"
object VendorGuidance {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DISCONTINUED: "DISCONTINUED" = "DISCONTINUED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[VendorGuidance] = js.Array(ACTIVE, DISCONTINUED, DELETED)
}
