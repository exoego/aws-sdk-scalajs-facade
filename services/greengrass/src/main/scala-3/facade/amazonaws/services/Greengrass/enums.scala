package facade.amazonaws.services.greengrass

import scalajs._

/** The current status of the bulk deployment.
  */
type BulkDeploymentStatus = "Initializing" | "Running" | "Completed" | "Stopping" | "Stopped" | "Failed"
object BulkDeploymentStatus {
  inline val Initializing: "Initializing" = "Initializing"
  inline val Running: "Running" = "Running"
  inline val Completed: "Completed" = "Completed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[BulkDeploymentStatus] = js.Array(Initializing, Running, Completed, Stopping, Stopped, Failed)
}

type ConfigurationSyncStatus = "InSync" | "OutOfSync"
object ConfigurationSyncStatus {
  inline val InSync: "InSync" = "InSync"
  inline val OutOfSync: "OutOfSync" = "OutOfSync"

  inline def values: js.Array[ConfigurationSyncStatus] = js.Array(InSync, OutOfSync)
}

/** The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
  */
type DeploymentType = "NewDeployment" | "Redeployment" | "ResetDeployment" | "ForceResetDeployment"
object DeploymentType {
  inline val NewDeployment: "NewDeployment" = "NewDeployment"
  inline val Redeployment: "Redeployment" = "Redeployment"
  inline val ResetDeployment: "ResetDeployment" = "ResetDeployment"
  inline val ForceResetDeployment: "ForceResetDeployment" = "ForceResetDeployment"

  inline def values: js.Array[DeploymentType] = js.Array(NewDeployment, Redeployment, ResetDeployment, ForceResetDeployment)
}

type EncodingType = "binary" | "json"
object EncodingType {
  inline val binary: "binary" = "binary"
  inline val json: "json" = "json"

  inline def values: js.Array[EncodingType] = js.Array(binary, json)
}

/** Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless your scenario requires that you run without containerization, we recommend that you run in a Greengrass container. Omit this value to run the Lambda function with the default containerization for the group.
  */
type FunctionIsolationMode = "GreengrassContainer" | "NoContainer"
object FunctionIsolationMode {
  inline val GreengrassContainer: "GreengrassContainer" = "GreengrassContainer"
  inline val NoContainer: "NoContainer" = "NoContainer"

  inline def values: js.Array[FunctionIsolationMode] = js.Array(GreengrassContainer, NoContainer)
}

type LoggerComponent = "GreengrassSystem" | "Lambda"
object LoggerComponent {
  inline val GreengrassSystem: "GreengrassSystem" = "GreengrassSystem"
  inline val Lambda: "Lambda" = "Lambda"

  inline def values: js.Array[LoggerComponent] = js.Array(GreengrassSystem, Lambda)
}

type LoggerLevel = "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL"
object LoggerLevel {
  inline val DEBUG: "DEBUG" = "DEBUG"
  inline val INFO: "INFO" = "INFO"
  inline val WARN: "WARN" = "WARN"
  inline val ERROR: "ERROR" = "ERROR"
  inline val FATAL: "FATAL" = "FATAL"

  inline def values: js.Array[LoggerLevel] = js.Array(DEBUG, INFO, WARN, ERROR, FATAL)
}

type LoggerType = "FileSystem" | "AWSCloudWatch"
object LoggerType {
  inline val FileSystem: "FileSystem" = "FileSystem"
  inline val AWSCloudWatch: "AWSCloudWatch" = "AWSCloudWatch"

  inline def values: js.Array[LoggerType] = js.Array(FileSystem, AWSCloudWatch)
}

/** The type of permission a function has to access a resource.
  */
type Permission = "ro" | "rw"
object Permission {
  inline val ro: "ro" = "ro"
  inline val rw: "rw" = "rw"

  inline def values: js.Array[Permission] = js.Array(ro, rw)
}

/** The piece of software on the Greengrass core that will be updated.
  */
type SoftwareToUpdate = "core" | "ota_agent"
object SoftwareToUpdate {
  inline val core: "core" = "core"
  inline val ota_agent: "ota_agent" = "ota_agent"

  inline def values: js.Array[SoftwareToUpdate] = js.Array(core, ota_agent)
}

type Telemetry = "On" | "Off"
object Telemetry {
  inline val On: "On" = "On"
  inline val Off: "Off" = "Off"

  inline def values: js.Array[Telemetry] = js.Array(On, Off)
}

/** The minimum level of log statements that should be logged by the OTA Agent during an update.
  */
type UpdateAgentLogLevel = "NONE" | "TRACE" | "DEBUG" | "VERBOSE" | "INFO" | "WARN" | "ERROR" | "FATAL"
object UpdateAgentLogLevel {
  inline val NONE: "NONE" = "NONE"
  inline val TRACE: "TRACE" = "TRACE"
  inline val DEBUG: "DEBUG" = "DEBUG"
  inline val VERBOSE: "VERBOSE" = "VERBOSE"
  inline val INFO: "INFO" = "INFO"
  inline val WARN: "WARN" = "WARN"
  inline val ERROR: "ERROR" = "ERROR"
  inline val FATAL: "FATAL" = "FATAL"

  inline def values: js.Array[UpdateAgentLogLevel] = js.Array(NONE, TRACE, DEBUG, VERBOSE, INFO, WARN, ERROR, FATAL)
}

/** The architecture of the cores which are the targets of an update.
  */
type UpdateTargetsArchitecture = "armv6l" | "armv7l" | "x86_64" | "aarch64"
object UpdateTargetsArchitecture {
  inline val armv6l: "armv6l" = "armv6l"
  inline val armv7l: "armv7l" = "armv7l"
  inline val x86_64: "x86_64" = "x86_64"
  inline val aarch64: "aarch64" = "aarch64"

  inline def values: js.Array[UpdateTargetsArchitecture] = js.Array(armv6l, armv7l, x86_64, aarch64)
}

/** The operating system of the cores which are the targets of an update.
  */
type UpdateTargetsOperatingSystem = "ubuntu" | "raspbian" | "amazon_linux" | "openwrt"
object UpdateTargetsOperatingSystem {
  inline val ubuntu: "ubuntu" = "ubuntu"
  inline val raspbian: "raspbian" = "raspbian"
  inline val amazon_linux: "amazon_linux" = "amazon_linux"
  inline val openwrt: "openwrt" = "openwrt"

  inline def values: js.Array[UpdateTargetsOperatingSystem] = js.Array(ubuntu, raspbian, amazon_linux, openwrt)
}
