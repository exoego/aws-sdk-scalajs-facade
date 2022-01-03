package facade.amazonaws.services.elasticbeanstalk

import scalajs.js

@js.native
sealed trait ActionHistoryStatus extends js.Any
object ActionHistoryStatus {
  val Completed = "Completed".asInstanceOf[ActionHistoryStatus]
  val Failed = "Failed".asInstanceOf[ActionHistoryStatus]
  val Unknown = "Unknown".asInstanceOf[ActionHistoryStatus]

  @inline def values: js.Array[ActionHistoryStatus] = js.Array(Completed, Failed, Unknown)
}

@js.native
sealed trait ActionStatus extends js.Any
object ActionStatus {
  val Scheduled = "Scheduled".asInstanceOf[ActionStatus]
  val Pending = "Pending".asInstanceOf[ActionStatus]
  val Running = "Running".asInstanceOf[ActionStatus]
  val Unknown = "Unknown".asInstanceOf[ActionStatus]

  @inline def values: js.Array[ActionStatus] = js.Array(Scheduled, Pending, Running, Unknown)
}

@js.native
sealed trait ActionType extends js.Any
object ActionType {
  val InstanceRefresh = "InstanceRefresh".asInstanceOf[ActionType]
  val PlatformUpdate = "PlatformUpdate".asInstanceOf[ActionType]
  val Unknown = "Unknown".asInstanceOf[ActionType]

  @inline def values: js.Array[ActionType] = js.Array(InstanceRefresh, PlatformUpdate, Unknown)
}

@js.native
sealed trait ApplicationVersionStatus extends js.Any
object ApplicationVersionStatus {
  val Processed = "Processed".asInstanceOf[ApplicationVersionStatus]
  val Unprocessed = "Unprocessed".asInstanceOf[ApplicationVersionStatus]
  val Failed = "Failed".asInstanceOf[ApplicationVersionStatus]
  val Processing = "Processing".asInstanceOf[ApplicationVersionStatus]
  val Building = "Building".asInstanceOf[ApplicationVersionStatus]

  @inline def values: js.Array[ApplicationVersionStatus] = js.Array(Processed, Unprocessed, Failed, Processing, Building)
}

@js.native
sealed trait ComputeType extends js.Any
object ComputeType {
  val BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[ComputeType]
  val BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[ComputeType]
  val BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[ComputeType]

  @inline def values: js.Array[ComputeType] = js.Array(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE)
}

@js.native
sealed trait ConfigurationDeploymentStatus extends js.Any
object ConfigurationDeploymentStatus {
  val deployed = "deployed".asInstanceOf[ConfigurationDeploymentStatus]
  val pending = "pending".asInstanceOf[ConfigurationDeploymentStatus]
  val failed = "failed".asInstanceOf[ConfigurationDeploymentStatus]

  @inline def values: js.Array[ConfigurationDeploymentStatus] = js.Array(deployed, pending, failed)
}

@js.native
sealed trait ConfigurationOptionValueType extends js.Any
object ConfigurationOptionValueType {
  val Scalar = "Scalar".asInstanceOf[ConfigurationOptionValueType]
  val List = "List".asInstanceOf[ConfigurationOptionValueType]

  @inline def values: js.Array[ConfigurationOptionValueType] = js.Array(Scalar, List)
}

@js.native
sealed trait EnvironmentHealth extends js.Any
object EnvironmentHealth {
  val Green = "Green".asInstanceOf[EnvironmentHealth]
  val Yellow = "Yellow".asInstanceOf[EnvironmentHealth]
  val Red = "Red".asInstanceOf[EnvironmentHealth]
  val Grey = "Grey".asInstanceOf[EnvironmentHealth]

  @inline def values: js.Array[EnvironmentHealth] = js.Array(Green, Yellow, Red, Grey)
}

@js.native
sealed trait EnvironmentHealthAttribute extends js.Any
object EnvironmentHealthAttribute {
  val Status = "Status".asInstanceOf[EnvironmentHealthAttribute]
  val Color = "Color".asInstanceOf[EnvironmentHealthAttribute]
  val Causes = "Causes".asInstanceOf[EnvironmentHealthAttribute]
  val ApplicationMetrics = "ApplicationMetrics".asInstanceOf[EnvironmentHealthAttribute]
  val InstancesHealth = "InstancesHealth".asInstanceOf[EnvironmentHealthAttribute]
  val All = "All".asInstanceOf[EnvironmentHealthAttribute]
  val HealthStatus = "HealthStatus".asInstanceOf[EnvironmentHealthAttribute]
  val RefreshedAt = "RefreshedAt".asInstanceOf[EnvironmentHealthAttribute]

  @inline def values: js.Array[EnvironmentHealthAttribute] = js.Array(Status, Color, Causes, ApplicationMetrics, InstancesHealth, All, HealthStatus, RefreshedAt)
}

@js.native
sealed trait EnvironmentHealthStatus extends js.Any
object EnvironmentHealthStatus {
  val NoData = "NoData".asInstanceOf[EnvironmentHealthStatus]
  val Unknown = "Unknown".asInstanceOf[EnvironmentHealthStatus]
  val Pending = "Pending".asInstanceOf[EnvironmentHealthStatus]
  val Ok = "Ok".asInstanceOf[EnvironmentHealthStatus]
  val Info = "Info".asInstanceOf[EnvironmentHealthStatus]
  val Warning = "Warning".asInstanceOf[EnvironmentHealthStatus]
  val Degraded = "Degraded".asInstanceOf[EnvironmentHealthStatus]
  val Severe = "Severe".asInstanceOf[EnvironmentHealthStatus]
  val Suspended = "Suspended".asInstanceOf[EnvironmentHealthStatus]

  @inline def values: js.Array[EnvironmentHealthStatus] = js.Array(NoData, Unknown, Pending, Ok, Info, Warning, Degraded, Severe, Suspended)
}

@js.native
sealed trait EnvironmentInfoType extends js.Any
object EnvironmentInfoType {
  val tail = "tail".asInstanceOf[EnvironmentInfoType]
  val bundle = "bundle".asInstanceOf[EnvironmentInfoType]

  @inline def values: js.Array[EnvironmentInfoType] = js.Array(tail, bundle)
}

@js.native
sealed trait EnvironmentStatus extends js.Any
object EnvironmentStatus {
  val Aborting = "Aborting".asInstanceOf[EnvironmentStatus]
  val Launching = "Launching".asInstanceOf[EnvironmentStatus]
  val Updating = "Updating".asInstanceOf[EnvironmentStatus]
  val LinkingFrom = "LinkingFrom".asInstanceOf[EnvironmentStatus]
  val LinkingTo = "LinkingTo".asInstanceOf[EnvironmentStatus]
  val Ready = "Ready".asInstanceOf[EnvironmentStatus]
  val Terminating = "Terminating".asInstanceOf[EnvironmentStatus]
  val Terminated = "Terminated".asInstanceOf[EnvironmentStatus]

  @inline def values: js.Array[EnvironmentStatus] = js.Array(Aborting, Launching, Updating, LinkingFrom, LinkingTo, Ready, Terminating, Terminated)
}

@js.native
sealed trait EventSeverity extends js.Any
object EventSeverity {
  val TRACE = "TRACE".asInstanceOf[EventSeverity]
  val DEBUG = "DEBUG".asInstanceOf[EventSeverity]
  val INFO = "INFO".asInstanceOf[EventSeverity]
  val WARN = "WARN".asInstanceOf[EventSeverity]
  val ERROR = "ERROR".asInstanceOf[EventSeverity]
  val FATAL = "FATAL".asInstanceOf[EventSeverity]

  @inline def values: js.Array[EventSeverity] = js.Array(TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
}

@js.native
sealed trait FailureType extends js.Any
object FailureType {
  val UpdateCancelled = "UpdateCancelled".asInstanceOf[FailureType]
  val CancellationFailed = "CancellationFailed".asInstanceOf[FailureType]
  val RollbackFailed = "RollbackFailed".asInstanceOf[FailureType]
  val RollbackSuccessful = "RollbackSuccessful".asInstanceOf[FailureType]
  val InternalFailure = "InternalFailure".asInstanceOf[FailureType]
  val InvalidEnvironmentState = "InvalidEnvironmentState".asInstanceOf[FailureType]
  val PermissionsError = "PermissionsError".asInstanceOf[FailureType]

  @inline def values: js.Array[FailureType] = js.Array(UpdateCancelled, CancellationFailed, RollbackFailed, RollbackSuccessful, InternalFailure, InvalidEnvironmentState, PermissionsError)
}

@js.native
sealed trait InstancesHealthAttribute extends js.Any
object InstancesHealthAttribute {
  val HealthStatus = "HealthStatus".asInstanceOf[InstancesHealthAttribute]
  val Color = "Color".asInstanceOf[InstancesHealthAttribute]
  val Causes = "Causes".asInstanceOf[InstancesHealthAttribute]
  val ApplicationMetrics = "ApplicationMetrics".asInstanceOf[InstancesHealthAttribute]
  val RefreshedAt = "RefreshedAt".asInstanceOf[InstancesHealthAttribute]
  val LaunchedAt = "LaunchedAt".asInstanceOf[InstancesHealthAttribute]
  val System = "System".asInstanceOf[InstancesHealthAttribute]
  val Deployment = "Deployment".asInstanceOf[InstancesHealthAttribute]
  val AvailabilityZone = "AvailabilityZone".asInstanceOf[InstancesHealthAttribute]
  val InstanceType = "InstanceType".asInstanceOf[InstancesHealthAttribute]
  val All = "All".asInstanceOf[InstancesHealthAttribute]

  @inline def values: js.Array[InstancesHealthAttribute] = js.Array(HealthStatus, Color, Causes, ApplicationMetrics, RefreshedAt, LaunchedAt, System, Deployment, AvailabilityZone, InstanceType, All)
}

@js.native
sealed trait PlatformStatus extends js.Any
object PlatformStatus {
  val Creating = "Creating".asInstanceOf[PlatformStatus]
  val Failed = "Failed".asInstanceOf[PlatformStatus]
  val Ready = "Ready".asInstanceOf[PlatformStatus]
  val Deleting = "Deleting".asInstanceOf[PlatformStatus]
  val Deleted = "Deleted".asInstanceOf[PlatformStatus]

  @inline def values: js.Array[PlatformStatus] = js.Array(Creating, Failed, Ready, Deleting, Deleted)
}

@js.native
sealed trait SourceRepository extends js.Any
object SourceRepository {
  val CodeCommit = "CodeCommit".asInstanceOf[SourceRepository]
  val S3 = "S3".asInstanceOf[SourceRepository]

  @inline def values: js.Array[SourceRepository] = js.Array(CodeCommit, S3)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val Git = "Git".asInstanceOf[SourceType]
  val Zip = "Zip".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(Git, Zip)
}

@js.native
sealed trait ValidationSeverity extends js.Any
object ValidationSeverity {
  val error = "error".asInstanceOf[ValidationSeverity]
  val warning = "warning".asInstanceOf[ValidationSeverity]

  @inline def values: js.Array[ValidationSeverity] = js.Array(error, warning)
}
