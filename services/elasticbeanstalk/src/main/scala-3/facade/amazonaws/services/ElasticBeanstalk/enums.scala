package facade.amazonaws.services.elasticbeanstalk

import scalajs._

type ActionHistoryStatus = "Completed" | "Failed" | "Unknown"
object ActionHistoryStatus {
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Unknown: "Unknown" = "Unknown"

  @inline def values = js.Array[ActionHistoryStatus](Completed, Failed, Unknown)
}

type ActionStatus = "Scheduled" | "Pending" | "Running" | "Unknown"
object ActionStatus {
  val Scheduled: "Scheduled" = "Scheduled"
  val Pending: "Pending" = "Pending"
  val Running: "Running" = "Running"
  val Unknown: "Unknown" = "Unknown"

  @inline def values = js.Array[ActionStatus](Scheduled, Pending, Running, Unknown)
}

type ActionType = "InstanceRefresh" | "PlatformUpdate" | "Unknown"
object ActionType {
  val InstanceRefresh: "InstanceRefresh" = "InstanceRefresh"
  val PlatformUpdate: "PlatformUpdate" = "PlatformUpdate"
  val Unknown: "Unknown" = "Unknown"

  @inline def values = js.Array[ActionType](InstanceRefresh, PlatformUpdate, Unknown)
}

type ApplicationVersionStatus = "Processed" | "Unprocessed" | "Failed" | "Processing" | "Building"
object ApplicationVersionStatus {
  val Processed: "Processed" = "Processed"
  val Unprocessed: "Unprocessed" = "Unprocessed"
  val Failed: "Failed" = "Failed"
  val Processing: "Processing" = "Processing"
  val Building: "Building" = "Building"

  @inline def values = js.Array[ApplicationVersionStatus](Processed, Unprocessed, Failed, Processing, Building)
}

type ComputeType = "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE"
object ComputeType {
  val BUILD_GENERAL1_SMALL: "BUILD_GENERAL1_SMALL" = "BUILD_GENERAL1_SMALL"
  val BUILD_GENERAL1_MEDIUM: "BUILD_GENERAL1_MEDIUM" = "BUILD_GENERAL1_MEDIUM"
  val BUILD_GENERAL1_LARGE: "BUILD_GENERAL1_LARGE" = "BUILD_GENERAL1_LARGE"

  @inline def values = js.Array[ComputeType](BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE)
}

type ConfigurationDeploymentStatus = "deployed" | "pending" | "failed"
object ConfigurationDeploymentStatus {
  val deployed: "deployed" = "deployed"
  val pending: "pending" = "pending"
  val failed: "failed" = "failed"

  @inline def values = js.Array[ConfigurationDeploymentStatus](deployed, pending, failed)
}

type ConfigurationOptionValueType = "Scalar" | "List"
object ConfigurationOptionValueType {
  val Scalar: "Scalar" = "Scalar"
  val List: "List" = "List"

  @inline def values = js.Array[ConfigurationOptionValueType](Scalar, List)
}

type EnvironmentHealth = "Green" | "Yellow" | "Red" | "Grey"
object EnvironmentHealth {
  val Green: "Green" = "Green"
  val Yellow: "Yellow" = "Yellow"
  val Red: "Red" = "Red"
  val Grey: "Grey" = "Grey"

  @inline def values = js.Array[EnvironmentHealth](Green, Yellow, Red, Grey)
}

type EnvironmentHealthAttribute = "Status" | "Color" | "Causes" | "ApplicationMetrics" | "InstancesHealth" | "All" | "HealthStatus" | "RefreshedAt"
object EnvironmentHealthAttribute {
  val Status: "Status" = "Status"
  val Color: "Color" = "Color"
  val Causes: "Causes" = "Causes"
  val ApplicationMetrics: "ApplicationMetrics" = "ApplicationMetrics"
  val InstancesHealth: "InstancesHealth" = "InstancesHealth"
  val All: "All" = "All"
  val HealthStatus: "HealthStatus" = "HealthStatus"
  val RefreshedAt: "RefreshedAt" = "RefreshedAt"

  @inline def values = js.Array[EnvironmentHealthAttribute](Status, Color, Causes, ApplicationMetrics, InstancesHealth, All, HealthStatus, RefreshedAt)
}

type EnvironmentHealthStatus = "NoData" | "Unknown" | "Pending" | "Ok" | "Info" | "Warning" | "Degraded" | "Severe" | "Suspended"
object EnvironmentHealthStatus {
  val NoData: "NoData" = "NoData"
  val Unknown: "Unknown" = "Unknown"
  val Pending: "Pending" = "Pending"
  val Ok: "Ok" = "Ok"
  val Info: "Info" = "Info"
  val Warning: "Warning" = "Warning"
  val Degraded: "Degraded" = "Degraded"
  val Severe: "Severe" = "Severe"
  val Suspended: "Suspended" = "Suspended"

  @inline def values = js.Array[EnvironmentHealthStatus](NoData, Unknown, Pending, Ok, Info, Warning, Degraded, Severe, Suspended)
}

type EnvironmentInfoType = "tail" | "bundle"
object EnvironmentInfoType {
  val tail: "tail" = "tail"
  val bundle: "bundle" = "bundle"

  @inline def values = js.Array[EnvironmentInfoType](tail, bundle)
}

type EnvironmentStatus = "Aborting" | "Launching" | "Updating" | "LinkingFrom" | "LinkingTo" | "Ready" | "Terminating" | "Terminated"
object EnvironmentStatus {
  val Aborting: "Aborting" = "Aborting"
  val Launching: "Launching" = "Launching"
  val Updating: "Updating" = "Updating"
  val LinkingFrom: "LinkingFrom" = "LinkingFrom"
  val LinkingTo: "LinkingTo" = "LinkingTo"
  val Ready: "Ready" = "Ready"
  val Terminating: "Terminating" = "Terminating"
  val Terminated: "Terminated" = "Terminated"

  @inline def values = js.Array[EnvironmentStatus](Aborting, Launching, Updating, LinkingFrom, LinkingTo, Ready, Terminating, Terminated)
}

type EventSeverity = "TRACE" | "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL"
object EventSeverity {
  val TRACE: "TRACE" = "TRACE"
  val DEBUG: "DEBUG" = "DEBUG"
  val INFO: "INFO" = "INFO"
  val WARN: "WARN" = "WARN"
  val ERROR: "ERROR" = "ERROR"
  val FATAL: "FATAL" = "FATAL"

  @inline def values = js.Array[EventSeverity](TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
}

type FailureType = "UpdateCancelled" | "CancellationFailed" | "RollbackFailed" | "RollbackSuccessful" | "InternalFailure" | "InvalidEnvironmentState" | "PermissionsError"
object FailureType {
  val UpdateCancelled: "UpdateCancelled" = "UpdateCancelled"
  val CancellationFailed: "CancellationFailed" = "CancellationFailed"
  val RollbackFailed: "RollbackFailed" = "RollbackFailed"
  val RollbackSuccessful: "RollbackSuccessful" = "RollbackSuccessful"
  val InternalFailure: "InternalFailure" = "InternalFailure"
  val InvalidEnvironmentState: "InvalidEnvironmentState" = "InvalidEnvironmentState"
  val PermissionsError: "PermissionsError" = "PermissionsError"

  @inline def values = js.Array[FailureType](UpdateCancelled, CancellationFailed, RollbackFailed, RollbackSuccessful, InternalFailure, InvalidEnvironmentState, PermissionsError)
}

type InstancesHealthAttribute = "HealthStatus" | "Color" | "Causes" | "ApplicationMetrics" | "RefreshedAt" | "LaunchedAt" | "System" | "Deployment" | "AvailabilityZone" | "InstanceType" | "All"
object InstancesHealthAttribute {
  val HealthStatus: "HealthStatus" = "HealthStatus"
  val Color: "Color" = "Color"
  val Causes: "Causes" = "Causes"
  val ApplicationMetrics: "ApplicationMetrics" = "ApplicationMetrics"
  val RefreshedAt: "RefreshedAt" = "RefreshedAt"
  val LaunchedAt: "LaunchedAt" = "LaunchedAt"
  val System: "System" = "System"
  val Deployment: "Deployment" = "Deployment"
  val AvailabilityZone: "AvailabilityZone" = "AvailabilityZone"
  val InstanceType: "InstanceType" = "InstanceType"
  val All: "All" = "All"

  @inline def values = js.Array[InstancesHealthAttribute](HealthStatus, Color, Causes, ApplicationMetrics, RefreshedAt, LaunchedAt, System, Deployment, AvailabilityZone, InstanceType, All)
}

type PlatformStatus = "Creating" | "Failed" | "Ready" | "Deleting" | "Deleted"
object PlatformStatus {
  val Creating: "Creating" = "Creating"
  val Failed: "Failed" = "Failed"
  val Ready: "Ready" = "Ready"
  val Deleting: "Deleting" = "Deleting"
  val Deleted: "Deleted" = "Deleted"

  @inline def values = js.Array[PlatformStatus](Creating, Failed, Ready, Deleting, Deleted)
}

type SourceRepository = "CodeCommit" | "S3"
object SourceRepository {
  val CodeCommit: "CodeCommit" = "CodeCommit"
  val S3: "S3" = "S3"

  @inline def values = js.Array[SourceRepository](CodeCommit, S3)
}

type SourceType = "Git" | "Zip"
object SourceType {
  val Git: "Git" = "Git"
  val Zip: "Zip" = "Zip"

  @inline def values = js.Array[SourceType](Git, Zip)
}

type ValidationSeverity = "error" | "warning"
object ValidationSeverity {
  val error: "error" = "error"
  val warning: "warning" = "warning"

  @inline def values = js.Array[ValidationSeverity](error, warning)
}
