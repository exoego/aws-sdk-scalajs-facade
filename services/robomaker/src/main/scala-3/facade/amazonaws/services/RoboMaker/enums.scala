package facade.amazonaws.services.robomaker

import scalajs._

type Architecture = "X86_64" | "ARM64" | "ARMHF"
object Architecture {
  val X86_64: "X86_64" = "X86_64"
  val ARM64: "ARM64" = "ARM64"
  val ARMHF: "ARMHF" = "ARMHF"

  @inline def values = js.Array[Architecture](X86_64, ARM64, ARMHF)
}

type DeploymentJobErrorCode = "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "BadLambdaAssociated" | "InternalServerError" | "RobotApplicationDoesNotExist" | "DeploymentFleetDoesNotExist" | "FleetDeploymentTimeout"
object DeploymentJobErrorCode {
  val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  val EnvironmentSetupError: "EnvironmentSetupError" = "EnvironmentSetupError"
  val EtagMismatch: "EtagMismatch" = "EtagMismatch"
  val FailureThresholdBreached: "FailureThresholdBreached" = "FailureThresholdBreached"
  val RobotDeploymentAborted: "RobotDeploymentAborted" = "RobotDeploymentAborted"
  val RobotDeploymentNoResponse: "RobotDeploymentNoResponse" = "RobotDeploymentNoResponse"
  val RobotAgentConnectionTimeout: "RobotAgentConnectionTimeout" = "RobotAgentConnectionTimeout"
  val GreengrassDeploymentFailed: "GreengrassDeploymentFailed" = "GreengrassDeploymentFailed"
  val InvalidGreengrassGroup: "InvalidGreengrassGroup" = "InvalidGreengrassGroup"
  val MissingRobotArchitecture: "MissingRobotArchitecture" = "MissingRobotArchitecture"
  val MissingRobotApplicationArchitecture: "MissingRobotApplicationArchitecture" = "MissingRobotApplicationArchitecture"
  val MissingRobotDeploymentResource: "MissingRobotDeploymentResource" = "MissingRobotDeploymentResource"
  val GreengrassGroupVersionDoesNotExist: "GreengrassGroupVersionDoesNotExist" = "GreengrassGroupVersionDoesNotExist"
  val LambdaDeleted: "LambdaDeleted" = "LambdaDeleted"
  val ExtractingBundleFailure: "ExtractingBundleFailure" = "ExtractingBundleFailure"
  val PreLaunchFileFailure: "PreLaunchFileFailure" = "PreLaunchFileFailure"
  val PostLaunchFileFailure: "PostLaunchFileFailure" = "PostLaunchFileFailure"
  val BadPermissionError: "BadPermissionError" = "BadPermissionError"
  val DownloadConditionFailed: "DownloadConditionFailed" = "DownloadConditionFailed"
  val BadLambdaAssociated: "BadLambdaAssociated" = "BadLambdaAssociated"
  val InternalServerError: "InternalServerError" = "InternalServerError"
  val RobotApplicationDoesNotExist: "RobotApplicationDoesNotExist" = "RobotApplicationDoesNotExist"
  val DeploymentFleetDoesNotExist: "DeploymentFleetDoesNotExist" = "DeploymentFleetDoesNotExist"
  val FleetDeploymentTimeout: "FleetDeploymentTimeout" = "FleetDeploymentTimeout"

  @inline def values = js.Array[DeploymentJobErrorCode](
    ResourceNotFound,
    EnvironmentSetupError,
    EtagMismatch,
    FailureThresholdBreached,
    RobotDeploymentAborted,
    RobotDeploymentNoResponse,
    RobotAgentConnectionTimeout,
    GreengrassDeploymentFailed,
    InvalidGreengrassGroup,
    MissingRobotArchitecture,
    MissingRobotApplicationArchitecture,
    MissingRobotDeploymentResource,
    GreengrassGroupVersionDoesNotExist,
    LambdaDeleted,
    ExtractingBundleFailure,
    PreLaunchFileFailure,
    PostLaunchFileFailure,
    BadPermissionError,
    DownloadConditionFailed,
    BadLambdaAssociated,
    InternalServerError,
    RobotApplicationDoesNotExist,
    DeploymentFleetDoesNotExist,
    FleetDeploymentTimeout
  )
}

type DeploymentStatus = "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled"
object DeploymentStatus {
  val Pending: "Pending" = "Pending"
  val Preparing: "Preparing" = "Preparing"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Succeeded: "Succeeded" = "Succeeded"
  val Canceled: "Canceled" = "Canceled"

  @inline def values = js.Array[DeploymentStatus](Pending, Preparing, InProgress, Failed, Succeeded, Canceled)
}

type ExitBehavior = "FAIL" | "RESTART"
object ExitBehavior {
  val FAIL: "FAIL" = "FAIL"
  val RESTART: "RESTART" = "RESTART"

  @inline def values = js.Array[ExitBehavior](FAIL, RESTART)
}

type FailureBehavior = "Fail" | "Continue"
object FailureBehavior {
  val Fail: "Fail" = "Fail"
  val Continue: "Continue" = "Continue"

  @inline def values = js.Array[FailureBehavior](Fail, Continue)
}

type RenderingEngineType = "OGRE"
object RenderingEngineType {
  val OGRE: "OGRE" = "OGRE"

  @inline def values = js.Array[RenderingEngineType](OGRE)
}

type RobotDeploymentStep = "Validating" | "DownloadingExtracting" | "ExecutingDownloadCondition" | "ExecutingPreLaunch" | "Launching" | "ExecutingPostLaunch" | "Finished"
object RobotDeploymentStep {
  val Validating: "Validating" = "Validating"
  val DownloadingExtracting: "DownloadingExtracting" = "DownloadingExtracting"
  val ExecutingDownloadCondition: "ExecutingDownloadCondition" = "ExecutingDownloadCondition"
  val ExecutingPreLaunch: "ExecutingPreLaunch" = "ExecutingPreLaunch"
  val Launching: "Launching" = "Launching"
  val ExecutingPostLaunch: "ExecutingPostLaunch" = "ExecutingPostLaunch"
  val Finished: "Finished" = "Finished"

  @inline def values = js.Array[RobotDeploymentStep](Validating, DownloadingExtracting, ExecutingDownloadCondition, ExecutingPreLaunch, Launching, ExecutingPostLaunch, Finished)
}

type RobotSoftwareSuiteType = "ROS" | "ROS2"
object RobotSoftwareSuiteType {
  val ROS: "ROS" = "ROS"
  val ROS2: "ROS2" = "ROS2"

  @inline def values = js.Array[RobotSoftwareSuiteType](ROS, ROS2)
}

type RobotSoftwareSuiteVersionType = "Kinetic" | "Melodic" | "Dashing"
object RobotSoftwareSuiteVersionType {
  val Kinetic: "Kinetic" = "Kinetic"
  val Melodic: "Melodic" = "Melodic"
  val Dashing: "Dashing" = "Dashing"

  @inline def values = js.Array[RobotSoftwareSuiteVersionType](Kinetic, Melodic, Dashing)
}

type RobotStatus = "Available" | "Registered" | "PendingNewDeployment" | "Deploying" | "Failed" | "InSync" | "NoResponse"
object RobotStatus {
  val Available: "Available" = "Available"
  val Registered: "Registered" = "Registered"
  val PendingNewDeployment: "PendingNewDeployment" = "PendingNewDeployment"
  val Deploying: "Deploying" = "Deploying"
  val Failed: "Failed" = "Failed"
  val InSync: "InSync" = "InSync"
  val NoResponse: "NoResponse" = "NoResponse"

  @inline def values = js.Array[RobotStatus](Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse)
}

type SimulationJobBatchErrorCode = "InternalServiceError"
object SimulationJobBatchErrorCode {
  val InternalServiceError: "InternalServiceError" = "InternalServiceError"

  @inline def values = js.Array[SimulationJobBatchErrorCode](InternalServiceError)
}

type SimulationJobBatchStatus = "Pending" | "InProgress" | "Failed" | "Completed" | "Canceled" | "Canceling" | "Completing" | "TimingOut" | "TimedOut"
object SimulationJobBatchStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Completed: "Completed" = "Completed"
  val Canceled: "Canceled" = "Canceled"
  val Canceling: "Canceling" = "Canceling"
  val Completing: "Completing" = "Completing"
  val TimingOut: "TimingOut" = "TimingOut"
  val TimedOut: "TimedOut" = "TimedOut"

  @inline def values = js.Array[SimulationJobBatchStatus](Pending, InProgress, Failed, Completed, Canceled, Canceling, Completing, TimingOut, TimedOut)
}

type SimulationJobErrorCode = "InternalServiceError" | "RobotApplicationCrash" | "SimulationApplicationCrash" | "RobotApplicationHealthCheckFailure" | "SimulationApplicationHealthCheckFailure" | "BadPermissionsRobotApplication" | "BadPermissionsSimulationApplication" | "BadPermissionsS3Object" | "BadPermissionsS3Output" | "BadPermissionsCloudwatchLogs" | "SubnetIpLimitExceeded" | "ENILimitExceeded" | "BadPermissionsUserCredentials" | "InvalidBundleRobotApplication" | "InvalidBundleSimulationApplication" | "InvalidS3Resource" | "ThrottlingError" | "LimitExceeded" | "MismatchedEtag" | "RobotApplicationVersionMismatchedEtag" | "SimulationApplicationVersionMismatchedEtag" | "ResourceNotFound" | "RequestThrottled" | "BatchTimedOut" | "BatchCanceled" | "InvalidInput" | "WrongRegionS3Bucket" | "WrongRegionS3Output" | "WrongRegionRobotApplication" | "WrongRegionSimulationApplication" | "UploadContentMismatchError"
object SimulationJobErrorCode {
  val InternalServiceError: "InternalServiceError" = "InternalServiceError"
  val RobotApplicationCrash: "RobotApplicationCrash" = "RobotApplicationCrash"
  val SimulationApplicationCrash: "SimulationApplicationCrash" = "SimulationApplicationCrash"
  val RobotApplicationHealthCheckFailure: "RobotApplicationHealthCheckFailure" = "RobotApplicationHealthCheckFailure"
  val SimulationApplicationHealthCheckFailure: "SimulationApplicationHealthCheckFailure" = "SimulationApplicationHealthCheckFailure"
  val BadPermissionsRobotApplication: "BadPermissionsRobotApplication" = "BadPermissionsRobotApplication"
  val BadPermissionsSimulationApplication: "BadPermissionsSimulationApplication" = "BadPermissionsSimulationApplication"
  val BadPermissionsS3Object: "BadPermissionsS3Object" = "BadPermissionsS3Object"
  val BadPermissionsS3Output: "BadPermissionsS3Output" = "BadPermissionsS3Output"
  val BadPermissionsCloudwatchLogs: "BadPermissionsCloudwatchLogs" = "BadPermissionsCloudwatchLogs"
  val SubnetIpLimitExceeded: "SubnetIpLimitExceeded" = "SubnetIpLimitExceeded"
  val ENILimitExceeded: "ENILimitExceeded" = "ENILimitExceeded"
  val BadPermissionsUserCredentials: "BadPermissionsUserCredentials" = "BadPermissionsUserCredentials"
  val InvalidBundleRobotApplication: "InvalidBundleRobotApplication" = "InvalidBundleRobotApplication"
  val InvalidBundleSimulationApplication: "InvalidBundleSimulationApplication" = "InvalidBundleSimulationApplication"
  val InvalidS3Resource: "InvalidS3Resource" = "InvalidS3Resource"
  val ThrottlingError: "ThrottlingError" = "ThrottlingError"
  val LimitExceeded: "LimitExceeded" = "LimitExceeded"
  val MismatchedEtag: "MismatchedEtag" = "MismatchedEtag"
  val RobotApplicationVersionMismatchedEtag: "RobotApplicationVersionMismatchedEtag" = "RobotApplicationVersionMismatchedEtag"
  val SimulationApplicationVersionMismatchedEtag: "SimulationApplicationVersionMismatchedEtag" = "SimulationApplicationVersionMismatchedEtag"
  val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  val BatchTimedOut: "BatchTimedOut" = "BatchTimedOut"
  val BatchCanceled: "BatchCanceled" = "BatchCanceled"
  val InvalidInput: "InvalidInput" = "InvalidInput"
  val WrongRegionS3Bucket: "WrongRegionS3Bucket" = "WrongRegionS3Bucket"
  val WrongRegionS3Output: "WrongRegionS3Output" = "WrongRegionS3Output"
  val WrongRegionRobotApplication: "WrongRegionRobotApplication" = "WrongRegionRobotApplication"
  val WrongRegionSimulationApplication: "WrongRegionSimulationApplication" = "WrongRegionSimulationApplication"
  val UploadContentMismatchError: "UploadContentMismatchError" = "UploadContentMismatchError"

  @inline def values = js.Array[SimulationJobErrorCode](
    InternalServiceError,
    RobotApplicationCrash,
    SimulationApplicationCrash,
    RobotApplicationHealthCheckFailure,
    SimulationApplicationHealthCheckFailure,
    BadPermissionsRobotApplication,
    BadPermissionsSimulationApplication,
    BadPermissionsS3Object,
    BadPermissionsS3Output,
    BadPermissionsCloudwatchLogs,
    SubnetIpLimitExceeded,
    ENILimitExceeded,
    BadPermissionsUserCredentials,
    InvalidBundleRobotApplication,
    InvalidBundleSimulationApplication,
    InvalidS3Resource,
    ThrottlingError,
    LimitExceeded,
    MismatchedEtag,
    RobotApplicationVersionMismatchedEtag,
    SimulationApplicationVersionMismatchedEtag,
    ResourceNotFound,
    RequestThrottled,
    BatchTimedOut,
    BatchCanceled,
    InvalidInput,
    WrongRegionS3Bucket,
    WrongRegionS3Output,
    WrongRegionRobotApplication,
    WrongRegionSimulationApplication,
    UploadContentMismatchError
  )
}

type SimulationJobStatus = "Pending" | "Preparing" | "Running" | "Restarting" | "Completed" | "Failed" | "RunningFailed" | "Terminating" | "Terminated" | "Canceled"
object SimulationJobStatus {
  val Pending: "Pending" = "Pending"
  val Preparing: "Preparing" = "Preparing"
  val Running: "Running" = "Running"
  val Restarting: "Restarting" = "Restarting"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val RunningFailed: "RunningFailed" = "RunningFailed"
  val Terminating: "Terminating" = "Terminating"
  val Terminated: "Terminated" = "Terminated"
  val Canceled: "Canceled" = "Canceled"

  @inline def values = js.Array[SimulationJobStatus](Pending, Preparing, Running, Restarting, Completed, Failed, RunningFailed, Terminating, Terminated, Canceled)
}

type SimulationSoftwareSuiteType = "Gazebo" | "RosbagPlay"
object SimulationSoftwareSuiteType {
  val Gazebo: "Gazebo" = "Gazebo"
  val RosbagPlay: "RosbagPlay" = "RosbagPlay"

  @inline def values = js.Array[SimulationSoftwareSuiteType](Gazebo, RosbagPlay)
}

type UploadBehavior = "UPLOAD_ON_TERMINATE" | "UPLOAD_ROLLING_AUTO_REMOVE"
object UploadBehavior {
  val UPLOAD_ON_TERMINATE: "UPLOAD_ON_TERMINATE" = "UPLOAD_ON_TERMINATE"
  val UPLOAD_ROLLING_AUTO_REMOVE: "UPLOAD_ROLLING_AUTO_REMOVE" = "UPLOAD_ROLLING_AUTO_REMOVE"

  @inline def values = js.Array[UploadBehavior](UPLOAD_ON_TERMINATE, UPLOAD_ROLLING_AUTO_REMOVE)
}

type WorldExportJobErrorCode = "InternalServiceError" | "LimitExceeded" | "ResourceNotFound" | "RequestThrottled" | "InvalidInput" | "AccessDenied"
object WorldExportJobErrorCode {
  val InternalServiceError: "InternalServiceError" = "InternalServiceError"
  val LimitExceeded: "LimitExceeded" = "LimitExceeded"
  val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  val InvalidInput: "InvalidInput" = "InvalidInput"
  val AccessDenied: "AccessDenied" = "AccessDenied"

  @inline def values = js.Array[WorldExportJobErrorCode](InternalServiceError, LimitExceeded, ResourceNotFound, RequestThrottled, InvalidInput, AccessDenied)
}

type WorldExportJobStatus = "Pending" | "Running" | "Completed" | "Failed" | "Canceling" | "Canceled"
object WorldExportJobStatus {
  val Pending: "Pending" = "Pending"
  val Running: "Running" = "Running"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Canceling: "Canceling" = "Canceling"
  val Canceled: "Canceled" = "Canceled"

  @inline def values = js.Array[WorldExportJobStatus](Pending, Running, Completed, Failed, Canceling, Canceled)
}

type WorldGenerationJobErrorCode = "InternalServiceError" | "LimitExceeded" | "ResourceNotFound" | "RequestThrottled" | "InvalidInput" | "AllWorldGenerationFailed"
object WorldGenerationJobErrorCode {
  val InternalServiceError: "InternalServiceError" = "InternalServiceError"
  val LimitExceeded: "LimitExceeded" = "LimitExceeded"
  val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  val InvalidInput: "InvalidInput" = "InvalidInput"
  val AllWorldGenerationFailed: "AllWorldGenerationFailed" = "AllWorldGenerationFailed"

  @inline def values = js.Array[WorldGenerationJobErrorCode](InternalServiceError, LimitExceeded, ResourceNotFound, RequestThrottled, InvalidInput, AllWorldGenerationFailed)
}

type WorldGenerationJobStatus = "Pending" | "Running" | "Completed" | "Failed" | "PartialFailed" | "Canceling" | "Canceled"
object WorldGenerationJobStatus {
  val Pending: "Pending" = "Pending"
  val Running: "Running" = "Running"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val PartialFailed: "PartialFailed" = "PartialFailed"
  val Canceling: "Canceling" = "Canceling"
  val Canceled: "Canceled" = "Canceled"

  @inline def values = js.Array[WorldGenerationJobStatus](Pending, Running, Completed, Failed, PartialFailed, Canceling, Canceled)
}
