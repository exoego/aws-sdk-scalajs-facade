package facade.amazonaws.services.sms

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AppLaunchConfigurationStatus extends js.Any
object AppLaunchConfigurationStatus {
  val NOT_CONFIGURED = "NOT_CONFIGURED".asInstanceOf[AppLaunchConfigurationStatus]
  val CONFIGURED = "CONFIGURED".asInstanceOf[AppLaunchConfigurationStatus]

  @inline def values = js.Array(NOT_CONFIGURED, CONFIGURED)
}

@js.native
sealed trait AppLaunchStatus extends js.Any
object AppLaunchStatus {
  val READY_FOR_CONFIGURATION = "READY_FOR_CONFIGURATION".asInstanceOf[AppLaunchStatus]
  val CONFIGURATION_IN_PROGRESS = "CONFIGURATION_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
  val CONFIGURATION_INVALID = "CONFIGURATION_INVALID".asInstanceOf[AppLaunchStatus]
  val READY_FOR_LAUNCH = "READY_FOR_LAUNCH".asInstanceOf[AppLaunchStatus]
  val VALIDATION_IN_PROGRESS = "VALIDATION_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
  val LAUNCH_PENDING = "LAUNCH_PENDING".asInstanceOf[AppLaunchStatus]
  val LAUNCH_IN_PROGRESS = "LAUNCH_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
  val LAUNCHED = "LAUNCHED".asInstanceOf[AppLaunchStatus]
  val PARTIALLY_LAUNCHED = "PARTIALLY_LAUNCHED".asInstanceOf[AppLaunchStatus]
  val DELTA_LAUNCH_IN_PROGRESS = "DELTA_LAUNCH_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
  val DELTA_LAUNCH_FAILED = "DELTA_LAUNCH_FAILED".asInstanceOf[AppLaunchStatus]
  val LAUNCH_FAILED = "LAUNCH_FAILED".asInstanceOf[AppLaunchStatus]
  val TERMINATE_IN_PROGRESS = "TERMINATE_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
  val TERMINATE_FAILED = "TERMINATE_FAILED".asInstanceOf[AppLaunchStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[AppLaunchStatus]

  @inline def values = js.Array(
    READY_FOR_CONFIGURATION,
    CONFIGURATION_IN_PROGRESS,
    CONFIGURATION_INVALID,
    READY_FOR_LAUNCH,
    VALIDATION_IN_PROGRESS,
    LAUNCH_PENDING,
    LAUNCH_IN_PROGRESS,
    LAUNCHED,
    PARTIALLY_LAUNCHED,
    DELTA_LAUNCH_IN_PROGRESS,
    DELTA_LAUNCH_FAILED,
    LAUNCH_FAILED,
    TERMINATE_IN_PROGRESS,
    TERMINATE_FAILED,
    TERMINATED
  )
}

@js.native
sealed trait AppReplicationConfigurationStatus extends js.Any
object AppReplicationConfigurationStatus {
  val NOT_CONFIGURED = "NOT_CONFIGURED".asInstanceOf[AppReplicationConfigurationStatus]
  val CONFIGURED = "CONFIGURED".asInstanceOf[AppReplicationConfigurationStatus]

  @inline def values = js.Array(NOT_CONFIGURED, CONFIGURED)
}

@js.native
sealed trait AppReplicationStatus extends js.Any
object AppReplicationStatus {
  val READY_FOR_CONFIGURATION = "READY_FOR_CONFIGURATION".asInstanceOf[AppReplicationStatus]
  val CONFIGURATION_IN_PROGRESS = "CONFIGURATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
  val CONFIGURATION_INVALID = "CONFIGURATION_INVALID".asInstanceOf[AppReplicationStatus]
  val READY_FOR_REPLICATION = "READY_FOR_REPLICATION".asInstanceOf[AppReplicationStatus]
  val VALIDATION_IN_PROGRESS = "VALIDATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
  val REPLICATION_PENDING = "REPLICATION_PENDING".asInstanceOf[AppReplicationStatus]
  val REPLICATION_IN_PROGRESS = "REPLICATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
  val REPLICATED = "REPLICATED".asInstanceOf[AppReplicationStatus]
  val PARTIALLY_REPLICATED = "PARTIALLY_REPLICATED".asInstanceOf[AppReplicationStatus]
  val DELTA_REPLICATION_IN_PROGRESS = "DELTA_REPLICATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
  val DELTA_REPLICATED = "DELTA_REPLICATED".asInstanceOf[AppReplicationStatus]
  val DELTA_REPLICATION_FAILED = "DELTA_REPLICATION_FAILED".asInstanceOf[AppReplicationStatus]
  val REPLICATION_FAILED = "REPLICATION_FAILED".asInstanceOf[AppReplicationStatus]
  val REPLICATION_STOPPING = "REPLICATION_STOPPING".asInstanceOf[AppReplicationStatus]
  val REPLICATION_STOP_FAILED = "REPLICATION_STOP_FAILED".asInstanceOf[AppReplicationStatus]
  val REPLICATION_STOPPED = "REPLICATION_STOPPED".asInstanceOf[AppReplicationStatus]

  @inline def values = js.Array(
    READY_FOR_CONFIGURATION,
    CONFIGURATION_IN_PROGRESS,
    CONFIGURATION_INVALID,
    READY_FOR_REPLICATION,
    VALIDATION_IN_PROGRESS,
    REPLICATION_PENDING,
    REPLICATION_IN_PROGRESS,
    REPLICATED,
    PARTIALLY_REPLICATED,
    DELTA_REPLICATION_IN_PROGRESS,
    DELTA_REPLICATED,
    DELTA_REPLICATION_FAILED,
    REPLICATION_FAILED,
    REPLICATION_STOPPING,
    REPLICATION_STOP_FAILED,
    REPLICATION_STOPPED
  )
}

@js.native
sealed trait AppStatus extends js.Any
object AppStatus {
  val CREATING = "CREATING".asInstanceOf[AppStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[AppStatus]
  val UPDATING = "UPDATING".asInstanceOf[AppStatus]
  val DELETING = "DELETING".asInstanceOf[AppStatus]
  val DELETED = "DELETED".asInstanceOf[AppStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AppStatus]

  @inline def values = js.Array(CREATING, ACTIVE, UPDATING, DELETING, DELETED, DELETE_FAILED)
}

@js.native
sealed trait AppValidationStrategy extends js.Any
object AppValidationStrategy {
  val SSM = "SSM".asInstanceOf[AppValidationStrategy]

  @inline def values = js.Array(SSM)
}

@js.native
sealed trait ConnectorCapability extends js.Any
object ConnectorCapability {
  val VSPHERE = "VSPHERE".asInstanceOf[ConnectorCapability]
  val SCVMM = "SCVMM".asInstanceOf[ConnectorCapability]
  val `HYPERV-MANAGER` = "HYPERV-MANAGER".asInstanceOf[ConnectorCapability]
  val SNAPSHOT_BATCHING = "SNAPSHOT_BATCHING".asInstanceOf[ConnectorCapability]
  val SMS_OPTIMIZED = "SMS_OPTIMIZED".asInstanceOf[ConnectorCapability]

  @inline def values = js.Array(VSPHERE, SCVMM, `HYPERV-MANAGER`, SNAPSHOT_BATCHING, SMS_OPTIMIZED)
}

@js.native
sealed trait ConnectorStatus extends js.Any
object ConnectorStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[ConnectorStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[ConnectorStatus]

  @inline def values = js.Array(HEALTHY, UNHEALTHY)
}

@js.native
sealed trait LicenseType extends js.Any
object LicenseType {
  val AWS = "AWS".asInstanceOf[LicenseType]
  val BYOL = "BYOL".asInstanceOf[LicenseType]

  @inline def values = js.Array(AWS, BYOL)
}

@js.native
sealed trait OutputFormat extends js.Any
object OutputFormat {
  val JSON = "JSON".asInstanceOf[OutputFormat]
  val YAML = "YAML".asInstanceOf[OutputFormat]

  @inline def values = js.Array(JSON, YAML)
}

@js.native
sealed trait ReplicationJobState extends js.Any
object ReplicationJobState {
  val PENDING = "PENDING".asInstanceOf[ReplicationJobState]
  val ACTIVE = "ACTIVE".asInstanceOf[ReplicationJobState]
  val FAILED = "FAILED".asInstanceOf[ReplicationJobState]
  val DELETING = "DELETING".asInstanceOf[ReplicationJobState]
  val DELETED = "DELETED".asInstanceOf[ReplicationJobState]
  val COMPLETED = "COMPLETED".asInstanceOf[ReplicationJobState]
  val PAUSED_ON_FAILURE = "PAUSED_ON_FAILURE".asInstanceOf[ReplicationJobState]
  val FAILING = "FAILING".asInstanceOf[ReplicationJobState]

  @inline def values = js.Array(PENDING, ACTIVE, FAILED, DELETING, DELETED, COMPLETED, PAUSED_ON_FAILURE, FAILING)
}

@js.native
sealed trait ReplicationRunState extends js.Any
object ReplicationRunState {
  val PENDING = "PENDING".asInstanceOf[ReplicationRunState]
  val MISSED = "MISSED".asInstanceOf[ReplicationRunState]
  val ACTIVE = "ACTIVE".asInstanceOf[ReplicationRunState]
  val FAILED = "FAILED".asInstanceOf[ReplicationRunState]
  val COMPLETED = "COMPLETED".asInstanceOf[ReplicationRunState]
  val DELETING = "DELETING".asInstanceOf[ReplicationRunState]
  val DELETED = "DELETED".asInstanceOf[ReplicationRunState]

  @inline def values = js.Array(PENDING, MISSED, ACTIVE, FAILED, COMPLETED, DELETING, DELETED)
}

@js.native
sealed trait ReplicationRunType extends js.Any
object ReplicationRunType {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[ReplicationRunType]
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[ReplicationRunType]

  @inline def values = js.Array(ON_DEMAND, AUTOMATIC)
}

@js.native
sealed trait ScriptType extends js.Any
object ScriptType {
  val SHELL_SCRIPT = "SHELL_SCRIPT".asInstanceOf[ScriptType]
  val POWERSHELL_SCRIPT = "POWERSHELL_SCRIPT".asInstanceOf[ScriptType]

  @inline def values = js.Array(SHELL_SCRIPT, POWERSHELL_SCRIPT)
}

@js.native
sealed trait ServerCatalogStatus extends js.Any
object ServerCatalogStatus {
  val NOT_IMPORTED = "NOT_IMPORTED".asInstanceOf[ServerCatalogStatus]
  val IMPORTING = "IMPORTING".asInstanceOf[ServerCatalogStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ServerCatalogStatus]
  val DELETED = "DELETED".asInstanceOf[ServerCatalogStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ServerCatalogStatus]

  @inline def values = js.Array(NOT_IMPORTED, IMPORTING, AVAILABLE, DELETED, EXPIRED)
}

@js.native
sealed trait ServerType extends js.Any
object ServerType {
  val VIRTUAL_MACHINE = "VIRTUAL_MACHINE".asInstanceOf[ServerType]

  @inline def values = js.Array(VIRTUAL_MACHINE)
}

@js.native
sealed trait ServerValidationStrategy extends js.Any
object ServerValidationStrategy {
  val USERDATA = "USERDATA".asInstanceOf[ServerValidationStrategy]

  @inline def values = js.Array(USERDATA)
}

@js.native
sealed trait ValidationStatus extends js.Any
object ValidationStatus {
  val READY_FOR_VALIDATION = "READY_FOR_VALIDATION".asInstanceOf[ValidationStatus]
  val PENDING = "PENDING".asInstanceOf[ValidationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ValidationStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ValidationStatus]
  val FAILED = "FAILED".asInstanceOf[ValidationStatus]

  @inline def values = js.Array(READY_FOR_VALIDATION, PENDING, IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait VmManagerType extends js.Any
object VmManagerType {
  val VSPHERE = "VSPHERE".asInstanceOf[VmManagerType]
  val SCVMM = "SCVMM".asInstanceOf[VmManagerType]
  val `HYPERV-MANAGER` = "HYPERV-MANAGER".asInstanceOf[VmManagerType]

  @inline def values = js.Array(VSPHERE, SCVMM, `HYPERV-MANAGER`)
}
