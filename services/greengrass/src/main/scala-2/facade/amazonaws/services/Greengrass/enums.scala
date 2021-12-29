package facade.amazonaws.services.greengrass

import scalajs._
import scala.scalajs.js.|

/** The current status of the bulk deployment.
  */
@js.native
sealed trait BulkDeploymentStatus extends js.Any
object BulkDeploymentStatus {
  val Initializing = "Initializing".asInstanceOf[BulkDeploymentStatus]
  val Running = "Running".asInstanceOf[BulkDeploymentStatus]
  val Completed = "Completed".asInstanceOf[BulkDeploymentStatus]
  val Stopping = "Stopping".asInstanceOf[BulkDeploymentStatus]
  val Stopped = "Stopped".asInstanceOf[BulkDeploymentStatus]
  val Failed = "Failed".asInstanceOf[BulkDeploymentStatus]

  @inline def values = js.Array(Initializing, Running, Completed, Stopping, Stopped, Failed)
}

@js.native
sealed trait ConfigurationSyncStatus extends js.Any
object ConfigurationSyncStatus {
  val InSync = "InSync".asInstanceOf[ConfigurationSyncStatus]
  val OutOfSync = "OutOfSync".asInstanceOf[ConfigurationSyncStatus]

  @inline def values = js.Array(InSync, OutOfSync)
}

/** The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
  */
@js.native
sealed trait DeploymentType extends js.Any
object DeploymentType {
  val NewDeployment = "NewDeployment".asInstanceOf[DeploymentType]
  val Redeployment = "Redeployment".asInstanceOf[DeploymentType]
  val ResetDeployment = "ResetDeployment".asInstanceOf[DeploymentType]
  val ForceResetDeployment = "ForceResetDeployment".asInstanceOf[DeploymentType]

  @inline def values = js.Array(NewDeployment, Redeployment, ResetDeployment, ForceResetDeployment)
}

@js.native
sealed trait EncodingType extends js.Any
object EncodingType {
  val binary = "binary".asInstanceOf[EncodingType]
  val json = "json".asInstanceOf[EncodingType]

  @inline def values = js.Array(binary, json)
}

/** Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless your scenario requires that you run without containerization, we recommend that you run in a Greengrass container. Omit this value to run the Lambda function with the default containerization for the group.
  */
@js.native
sealed trait FunctionIsolationMode extends js.Any
object FunctionIsolationMode {
  val GreengrassContainer = "GreengrassContainer".asInstanceOf[FunctionIsolationMode]
  val NoContainer = "NoContainer".asInstanceOf[FunctionIsolationMode]

  @inline def values = js.Array(GreengrassContainer, NoContainer)
}

@js.native
sealed trait LoggerComponent extends js.Any
object LoggerComponent {
  val GreengrassSystem = "GreengrassSystem".asInstanceOf[LoggerComponent]
  val Lambda = "Lambda".asInstanceOf[LoggerComponent]

  @inline def values = js.Array(GreengrassSystem, Lambda)
}

@js.native
sealed trait LoggerLevel extends js.Any
object LoggerLevel {
  val DEBUG = "DEBUG".asInstanceOf[LoggerLevel]
  val INFO = "INFO".asInstanceOf[LoggerLevel]
  val WARN = "WARN".asInstanceOf[LoggerLevel]
  val ERROR = "ERROR".asInstanceOf[LoggerLevel]
  val FATAL = "FATAL".asInstanceOf[LoggerLevel]

  @inline def values = js.Array(DEBUG, INFO, WARN, ERROR, FATAL)
}

@js.native
sealed trait LoggerType extends js.Any
object LoggerType {
  val FileSystem = "FileSystem".asInstanceOf[LoggerType]
  val AWSCloudWatch = "AWSCloudWatch".asInstanceOf[LoggerType]

  @inline def values = js.Array(FileSystem, AWSCloudWatch)
}

/** The type of permission a function has to access a resource.
  */
@js.native
sealed trait Permission extends js.Any
object Permission {
  val ro = "ro".asInstanceOf[Permission]
  val rw = "rw".asInstanceOf[Permission]

  @inline def values = js.Array(ro, rw)
}

/** The piece of software on the Greengrass core that will be updated.
  */
@js.native
sealed trait SoftwareToUpdate extends js.Any
object SoftwareToUpdate {
  val core = "core".asInstanceOf[SoftwareToUpdate]
  val ota_agent = "ota_agent".asInstanceOf[SoftwareToUpdate]

  @inline def values = js.Array(core, ota_agent)
}

@js.native
sealed trait Telemetry extends js.Any
object Telemetry {
  val On = "On".asInstanceOf[Telemetry]
  val Off = "Off".asInstanceOf[Telemetry]

  @inline def values = js.Array(On, Off)
}

/** The minimum level of log statements that should be logged by the OTA Agent during an update.
  */
@js.native
sealed trait UpdateAgentLogLevel extends js.Any
object UpdateAgentLogLevel {
  val NONE = "NONE".asInstanceOf[UpdateAgentLogLevel]
  val TRACE = "TRACE".asInstanceOf[UpdateAgentLogLevel]
  val DEBUG = "DEBUG".asInstanceOf[UpdateAgentLogLevel]
  val VERBOSE = "VERBOSE".asInstanceOf[UpdateAgentLogLevel]
  val INFO = "INFO".asInstanceOf[UpdateAgentLogLevel]
  val WARN = "WARN".asInstanceOf[UpdateAgentLogLevel]
  val ERROR = "ERROR".asInstanceOf[UpdateAgentLogLevel]
  val FATAL = "FATAL".asInstanceOf[UpdateAgentLogLevel]

  @inline def values = js.Array(NONE, TRACE, DEBUG, VERBOSE, INFO, WARN, ERROR, FATAL)
}

/** The architecture of the cores which are the targets of an update.
  */
@js.native
sealed trait UpdateTargetsArchitecture extends js.Any
object UpdateTargetsArchitecture {
  val armv6l = "armv6l".asInstanceOf[UpdateTargetsArchitecture]
  val armv7l = "armv7l".asInstanceOf[UpdateTargetsArchitecture]
  val x86_64 = "x86_64".asInstanceOf[UpdateTargetsArchitecture]
  val aarch64 = "aarch64".asInstanceOf[UpdateTargetsArchitecture]

  @inline def values = js.Array(armv6l, armv7l, x86_64, aarch64)
}

/** The operating system of the cores which are the targets of an update.
  */
@js.native
sealed trait UpdateTargetsOperatingSystem extends js.Any
object UpdateTargetsOperatingSystem {
  val ubuntu = "ubuntu".asInstanceOf[UpdateTargetsOperatingSystem]
  val raspbian = "raspbian".asInstanceOf[UpdateTargetsOperatingSystem]
  val amazon_linux = "amazon_linux".asInstanceOf[UpdateTargetsOperatingSystem]
  val openwrt = "openwrt".asInstanceOf[UpdateTargetsOperatingSystem]

  @inline def values = js.Array(ubuntu, raspbian, amazon_linux, openwrt)
}

