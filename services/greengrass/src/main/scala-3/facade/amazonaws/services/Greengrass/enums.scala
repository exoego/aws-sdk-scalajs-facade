package facade.amazonaws.services.greengrass

import scalajs._

/** The current status of the bulk deployment.
  */
type BulkDeploymentStatus = "Initializing" | "Running" | "Completed" | "Stopping" | "Stopped" | "Failed"
object BulkDeploymentStatus {
  val Initializing: "Initializing" = "Initializing"
  val Running: "Running" = "Running"
  val Completed: "Completed" = "Completed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[BulkDeploymentStatus](Initializing, Running, Completed, Stopping, Stopped, Failed)
}

type ConfigurationSyncStatus = "InSync" | "OutOfSync"
object ConfigurationSyncStatus {
  val InSync: "InSync" = "InSync"
  val OutOfSync: "OutOfSync" = "OutOfSync"

  @inline def values = js.Array[ConfigurationSyncStatus](InSync, OutOfSync)
}

/** The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
  */
type DeploymentType = "NewDeployment" | "Redeployment" | "ResetDeployment" | "ForceResetDeployment"
object DeploymentType {
  val NewDeployment: "NewDeployment" = "NewDeployment"
  val Redeployment: "Redeployment" = "Redeployment"
  val ResetDeployment: "ResetDeployment" = "ResetDeployment"
  val ForceResetDeployment: "ForceResetDeployment" = "ForceResetDeployment"

  @inline def values = js.Array[DeploymentType](NewDeployment, Redeployment, ResetDeployment, ForceResetDeployment)
}

type EncodingType = "binary" | "json"
object EncodingType {
  val binary: "binary" = "binary"
  val json: "json" = "json"

  @inline def values = js.Array[EncodingType](binary, json)
}

/** Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless your scenario requires that you run without containerization, we recommend that you run in a Greengrass container. Omit this value to run the Lambda function with the default containerization for the group.
  */
type FunctionIsolationMode = "GreengrassContainer" | "NoContainer"
object FunctionIsolationMode {
  val GreengrassContainer: "GreengrassContainer" = "GreengrassContainer"
  val NoContainer: "NoContainer" = "NoContainer"

  @inline def values = js.Array[FunctionIsolationMode](GreengrassContainer, NoContainer)
}

type LoggerComponent = "GreengrassSystem" | "Lambda"
object LoggerComponent {
  val GreengrassSystem: "GreengrassSystem" = "GreengrassSystem"
  val Lambda: "Lambda" = "Lambda"

  @inline def values = js.Array[LoggerComponent](GreengrassSystem, Lambda)
}

type LoggerLevel = "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL"
object LoggerLevel {
  val DEBUG: "DEBUG" = "DEBUG"
  val INFO: "INFO" = "INFO"
  val WARN: "WARN" = "WARN"
  val ERROR: "ERROR" = "ERROR"
  val FATAL: "FATAL" = "FATAL"

  @inline def values = js.Array[LoggerLevel](DEBUG, INFO, WARN, ERROR, FATAL)
}

type LoggerType = "FileSystem" | "AWSCloudWatch"
object LoggerType {
  val FileSystem: "FileSystem" = "FileSystem"
  val AWSCloudWatch: "AWSCloudWatch" = "AWSCloudWatch"

  @inline def values = js.Array[LoggerType](FileSystem, AWSCloudWatch)
}

/** The type of permission a function has to access a resource.
  */
type Permission = "ro" | "rw"
object Permission {
  val ro: "ro" = "ro"
  val rw: "rw" = "rw"

  @inline def values = js.Array[Permission](ro, rw)
}

/** The piece of software on the Greengrass core that will be updated.
  */
type SoftwareToUpdate = "core" | "ota_agent"
object SoftwareToUpdate {
  val core: "core" = "core"
  val ota_agent: "ota_agent" = "ota_agent"

  @inline def values = js.Array[SoftwareToUpdate](core, ota_agent)
}

type Telemetry = "On" | "Off"
object Telemetry {
  val On: "On" = "On"
  val Off: "Off" = "Off"

  @inline def values = js.Array[Telemetry](On, Off)
}

/** The minimum level of log statements that should be logged by the OTA Agent during an update.
  */
type UpdateAgentLogLevel = "NONE" | "TRACE" | "DEBUG" | "VERBOSE" | "INFO" | "WARN" | "ERROR" | "FATAL"
object UpdateAgentLogLevel {
  val NONE: "NONE" = "NONE"
  val TRACE: "TRACE" = "TRACE"
  val DEBUG: "DEBUG" = "DEBUG"
  val VERBOSE: "VERBOSE" = "VERBOSE"
  val INFO: "INFO" = "INFO"
  val WARN: "WARN" = "WARN"
  val ERROR: "ERROR" = "ERROR"
  val FATAL: "FATAL" = "FATAL"

  @inline def values = js.Array[UpdateAgentLogLevel](NONE, TRACE, DEBUG, VERBOSE, INFO, WARN, ERROR, FATAL)
}

/** The architecture of the cores which are the targets of an update.
  */
type UpdateTargetsArchitecture = "armv6l" | "armv7l" | "x86_64" | "aarch64"
object UpdateTargetsArchitecture {
  val armv6l: "armv6l" = "armv6l"
  val armv7l: "armv7l" = "armv7l"
  val x86_64: "x86_64" = "x86_64"
  val aarch64: "aarch64" = "aarch64"

  @inline def values = js.Array[UpdateTargetsArchitecture](armv6l, armv7l, x86_64, aarch64)
}

/** The operating system of the cores which are the targets of an update.
  */
type UpdateTargetsOperatingSystem = "ubuntu" | "raspbian" | "amazon_linux" | "openwrt"
object UpdateTargetsOperatingSystem {
  val ubuntu: "ubuntu" = "ubuntu"
  val raspbian: "raspbian" = "raspbian"
  val amazon_linux: "amazon_linux" = "amazon_linux"
  val openwrt: "openwrt" = "openwrt"

  @inline def values = js.Array[UpdateTargetsOperatingSystem](ubuntu, raspbian, amazon_linux, openwrt)
}
