package facade.amazonaws.services.elasticbeanstalk

import scalajs.js

type ActionHistoryStatus = "Completed" | "Failed" | "Unknown"
object ActionHistoryStatus {
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Unknown: "Unknown" = "Unknown"

  inline def values: js.Array[ActionHistoryStatus] = js.Array(Completed, Failed, Unknown)
}

type ActionStatus = "Scheduled" | "Pending" | "Running" | "Unknown"
object ActionStatus {
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val Pending: "Pending" = "Pending"
  inline val Running: "Running" = "Running"
  inline val Unknown: "Unknown" = "Unknown"

  inline def values: js.Array[ActionStatus] = js.Array(Scheduled, Pending, Running, Unknown)
}

type ActionType = "InstanceRefresh" | "PlatformUpdate" | "Unknown"
object ActionType {
  inline val InstanceRefresh: "InstanceRefresh" = "InstanceRefresh"
  inline val PlatformUpdate: "PlatformUpdate" = "PlatformUpdate"
  inline val Unknown: "Unknown" = "Unknown"

  inline def values: js.Array[ActionType] = js.Array(InstanceRefresh, PlatformUpdate, Unknown)
}

type ApplicationVersionStatus = "Processed" | "Unprocessed" | "Failed" | "Processing" | "Building"
object ApplicationVersionStatus {
  inline val Processed: "Processed" = "Processed"
  inline val Unprocessed: "Unprocessed" = "Unprocessed"
  inline val Failed: "Failed" = "Failed"
  inline val Processing: "Processing" = "Processing"
  inline val Building: "Building" = "Building"

  inline def values: js.Array[ApplicationVersionStatus] = js.Array(Processed, Unprocessed, Failed, Processing, Building)
}

type ComputeType = "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE"
object ComputeType {
  inline val BUILD_GENERAL1_SMALL: "BUILD_GENERAL1_SMALL" = "BUILD_GENERAL1_SMALL"
  inline val BUILD_GENERAL1_MEDIUM: "BUILD_GENERAL1_MEDIUM" = "BUILD_GENERAL1_MEDIUM"
  inline val BUILD_GENERAL1_LARGE: "BUILD_GENERAL1_LARGE" = "BUILD_GENERAL1_LARGE"

  inline def values: js.Array[ComputeType] = js.Array(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE)
}

type ConfigurationDeploymentStatus = "deployed" | "pending" | "failed"
object ConfigurationDeploymentStatus {
  inline val deployed: "deployed" = "deployed"
  inline val pending: "pending" = "pending"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[ConfigurationDeploymentStatus] = js.Array(deployed, pending, failed)
}

type ConfigurationOptionValueType = "Scalar" | "List"
object ConfigurationOptionValueType {
  inline val Scalar: "Scalar" = "Scalar"
  inline val List: "List" = "List"

  inline def values: js.Array[ConfigurationOptionValueType] = js.Array(Scalar, List)
}

type EnvironmentHealth = "Green" | "Yellow" | "Red" | "Grey"
object EnvironmentHealth {
  inline val Green: "Green" = "Green"
  inline val Yellow: "Yellow" = "Yellow"
  inline val Red: "Red" = "Red"
  inline val Grey: "Grey" = "Grey"

  inline def values: js.Array[EnvironmentHealth] = js.Array(Green, Yellow, Red, Grey)
}

type EnvironmentHealthAttribute = "Status" | "Color" | "Causes" | "ApplicationMetrics" | "InstancesHealth" | "All" | "HealthStatus" | "RefreshedAt"
object EnvironmentHealthAttribute {
  inline val Status: "Status" = "Status"
  inline val Color: "Color" = "Color"
  inline val Causes: "Causes" = "Causes"
  inline val ApplicationMetrics: "ApplicationMetrics" = "ApplicationMetrics"
  inline val InstancesHealth: "InstancesHealth" = "InstancesHealth"
  inline val All: "All" = "All"
  inline val HealthStatus: "HealthStatus" = "HealthStatus"
  inline val RefreshedAt: "RefreshedAt" = "RefreshedAt"

  inline def values: js.Array[EnvironmentHealthAttribute] = js.Array(Status, Color, Causes, ApplicationMetrics, InstancesHealth, All, HealthStatus, RefreshedAt)
}

type EnvironmentHealthStatus = "NoData" | "Unknown" | "Pending" | "Ok" | "Info" | "Warning" | "Degraded" | "Severe" | "Suspended"
object EnvironmentHealthStatus {
  inline val NoData: "NoData" = "NoData"
  inline val Unknown: "Unknown" = "Unknown"
  inline val Pending: "Pending" = "Pending"
  inline val Ok: "Ok" = "Ok"
  inline val Info: "Info" = "Info"
  inline val Warning: "Warning" = "Warning"
  inline val Degraded: "Degraded" = "Degraded"
  inline val Severe: "Severe" = "Severe"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[EnvironmentHealthStatus] = js.Array(NoData, Unknown, Pending, Ok, Info, Warning, Degraded, Severe, Suspended)
}

type EnvironmentInfoType = "tail" | "bundle"
object EnvironmentInfoType {
  inline val tail: "tail" = "tail"
  inline val bundle: "bundle" = "bundle"

  inline def values: js.Array[EnvironmentInfoType] = js.Array(tail, bundle)
}

type EnvironmentStatus = "Aborting" | "Launching" | "Updating" | "LinkingFrom" | "LinkingTo" | "Ready" | "Terminating" | "Terminated"
object EnvironmentStatus {
  inline val Aborting: "Aborting" = "Aborting"
  inline val Launching: "Launching" = "Launching"
  inline val Updating: "Updating" = "Updating"
  inline val LinkingFrom: "LinkingFrom" = "LinkingFrom"
  inline val LinkingTo: "LinkingTo" = "LinkingTo"
  inline val Ready: "Ready" = "Ready"
  inline val Terminating: "Terminating" = "Terminating"
  inline val Terminated: "Terminated" = "Terminated"

  inline def values: js.Array[EnvironmentStatus] = js.Array(Aborting, Launching, Updating, LinkingFrom, LinkingTo, Ready, Terminating, Terminated)
}

type EventSeverity = "TRACE" | "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL"
object EventSeverity {
  inline val TRACE: "TRACE" = "TRACE"
  inline val DEBUG: "DEBUG" = "DEBUG"
  inline val INFO: "INFO" = "INFO"
  inline val WARN: "WARN" = "WARN"
  inline val ERROR: "ERROR" = "ERROR"
  inline val FATAL: "FATAL" = "FATAL"

  inline def values: js.Array[EventSeverity] = js.Array(TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
}

type FailureType = "UpdateCancelled" | "CancellationFailed" | "RollbackFailed" | "RollbackSuccessful" | "InternalFailure" | "InvalidEnvironmentState" | "PermissionsError"
object FailureType {
  inline val UpdateCancelled: "UpdateCancelled" = "UpdateCancelled"
  inline val CancellationFailed: "CancellationFailed" = "CancellationFailed"
  inline val RollbackFailed: "RollbackFailed" = "RollbackFailed"
  inline val RollbackSuccessful: "RollbackSuccessful" = "RollbackSuccessful"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"
  inline val InvalidEnvironmentState: "InvalidEnvironmentState" = "InvalidEnvironmentState"
  inline val PermissionsError: "PermissionsError" = "PermissionsError"

  inline def values: js.Array[FailureType] = js.Array(UpdateCancelled, CancellationFailed, RollbackFailed, RollbackSuccessful, InternalFailure, InvalidEnvironmentState, PermissionsError)
}

type InstancesHealthAttribute = "HealthStatus" | "Color" | "Causes" | "ApplicationMetrics" | "RefreshedAt" | "LaunchedAt" | "System" | "Deployment" | "AvailabilityZone" | "InstanceType" | "All"
object InstancesHealthAttribute {
  inline val HealthStatus: "HealthStatus" = "HealthStatus"
  inline val Color: "Color" = "Color"
  inline val Causes: "Causes" = "Causes"
  inline val ApplicationMetrics: "ApplicationMetrics" = "ApplicationMetrics"
  inline val RefreshedAt: "RefreshedAt" = "RefreshedAt"
  inline val LaunchedAt: "LaunchedAt" = "LaunchedAt"
  inline val System: "System" = "System"
  inline val Deployment: "Deployment" = "Deployment"
  inline val AvailabilityZone: "AvailabilityZone" = "AvailabilityZone"
  inline val InstanceType: "InstanceType" = "InstanceType"
  inline val All: "All" = "All"

  inline def values: js.Array[InstancesHealthAttribute] = js.Array(HealthStatus, Color, Causes, ApplicationMetrics, RefreshedAt, LaunchedAt, System, Deployment, AvailabilityZone, InstanceType, All)
}

type PlatformStatus = "Creating" | "Failed" | "Ready" | "Deleting" | "Deleted"
object PlatformStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Failed: "Failed" = "Failed"
  inline val Ready: "Ready" = "Ready"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"

  inline def values: js.Array[PlatformStatus] = js.Array(Creating, Failed, Ready, Deleting, Deleted)
}

type SourceRepository = "CodeCommit" | "S3"
object SourceRepository {
  inline val CodeCommit: "CodeCommit" = "CodeCommit"
  inline val S3: "S3" = "S3"

  inline def values: js.Array[SourceRepository] = js.Array(CodeCommit, S3)
}

type SourceType = "Git" | "Zip"
object SourceType {
  inline val Git: "Git" = "Git"
  inline val Zip: "Zip" = "Zip"

  inline def values: js.Array[SourceType] = js.Array(Git, Zip)
}

type ValidationSeverity = "error" | "warning"
object ValidationSeverity {
  inline val error: "error" = "error"
  inline val warning: "warning" = "warning"

  inline def values: js.Array[ValidationSeverity] = js.Array(error, warning)
}
