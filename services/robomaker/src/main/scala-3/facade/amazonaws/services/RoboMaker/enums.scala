package facade.amazonaws.services.robomaker

import scalajs.js

type Architecture = "X86_64" | "ARM64" | "ARMHF"
object Architecture {
  inline val X86_64: "X86_64" = "X86_64"
  inline val ARM64: "ARM64" = "ARM64"
  inline val ARMHF: "ARMHF" = "ARMHF"

  inline def values: js.Array[Architecture] = js.Array(X86_64, ARM64, ARMHF)
}

type DeploymentJobErrorCode = "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "BadLambdaAssociated" | "InternalServerError" | "RobotApplicationDoesNotExist" | "DeploymentFleetDoesNotExist" | "FleetDeploymentTimeout"
object DeploymentJobErrorCode {
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  inline val EnvironmentSetupError: "EnvironmentSetupError" = "EnvironmentSetupError"
  inline val EtagMismatch: "EtagMismatch" = "EtagMismatch"
  inline val FailureThresholdBreached: "FailureThresholdBreached" = "FailureThresholdBreached"
  inline val RobotDeploymentAborted: "RobotDeploymentAborted" = "RobotDeploymentAborted"
  inline val RobotDeploymentNoResponse: "RobotDeploymentNoResponse" = "RobotDeploymentNoResponse"
  inline val RobotAgentConnectionTimeout: "RobotAgentConnectionTimeout" = "RobotAgentConnectionTimeout"
  inline val GreengrassDeploymentFailed: "GreengrassDeploymentFailed" = "GreengrassDeploymentFailed"
  inline val InvalidGreengrassGroup: "InvalidGreengrassGroup" = "InvalidGreengrassGroup"
  inline val MissingRobotArchitecture: "MissingRobotArchitecture" = "MissingRobotArchitecture"
  inline val MissingRobotApplicationArchitecture: "MissingRobotApplicationArchitecture" = "MissingRobotApplicationArchitecture"
  inline val MissingRobotDeploymentResource: "MissingRobotDeploymentResource" = "MissingRobotDeploymentResource"
  inline val GreengrassGroupVersionDoesNotExist: "GreengrassGroupVersionDoesNotExist" = "GreengrassGroupVersionDoesNotExist"
  inline val LambdaDeleted: "LambdaDeleted" = "LambdaDeleted"
  inline val ExtractingBundleFailure: "ExtractingBundleFailure" = "ExtractingBundleFailure"
  inline val PreLaunchFileFailure: "PreLaunchFileFailure" = "PreLaunchFileFailure"
  inline val PostLaunchFileFailure: "PostLaunchFileFailure" = "PostLaunchFileFailure"
  inline val BadPermissionError: "BadPermissionError" = "BadPermissionError"
  inline val DownloadConditionFailed: "DownloadConditionFailed" = "DownloadConditionFailed"
  inline val BadLambdaAssociated: "BadLambdaAssociated" = "BadLambdaAssociated"
  inline val InternalServerError: "InternalServerError" = "InternalServerError"
  inline val RobotApplicationDoesNotExist: "RobotApplicationDoesNotExist" = "RobotApplicationDoesNotExist"
  inline val DeploymentFleetDoesNotExist: "DeploymentFleetDoesNotExist" = "DeploymentFleetDoesNotExist"
  inline val FleetDeploymentTimeout: "FleetDeploymentTimeout" = "FleetDeploymentTimeout"

  inline def values: js.Array[DeploymentJobErrorCode] = js.Array(
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
  inline val Pending: "Pending" = "Pending"
  inline val Preparing: "Preparing" = "Preparing"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Canceled: "Canceled" = "Canceled"

  inline def values: js.Array[DeploymentStatus] = js.Array(Pending, Preparing, InProgress, Failed, Succeeded, Canceled)
}

type ExitBehavior = "FAIL" | "RESTART"
object ExitBehavior {
  inline val FAIL: "FAIL" = "FAIL"
  inline val RESTART: "RESTART" = "RESTART"

  inline def values: js.Array[ExitBehavior] = js.Array(FAIL, RESTART)
}

type FailureBehavior = "Fail" | "Continue"
object FailureBehavior {
  inline val Fail: "Fail" = "Fail"
  inline val Continue: "Continue" = "Continue"

  inline def values: js.Array[FailureBehavior] = js.Array(Fail, Continue)
}

type RenderingEngineType = "OGRE"
object RenderingEngineType {
  inline val OGRE: "OGRE" = "OGRE"

  inline def values: js.Array[RenderingEngineType] = js.Array(OGRE)
}

type RobotDeploymentStep = "Validating" | "DownloadingExtracting" | "ExecutingDownloadCondition" | "ExecutingPreLaunch" | "Launching" | "ExecutingPostLaunch" | "Finished"
object RobotDeploymentStep {
  inline val Validating: "Validating" = "Validating"
  inline val DownloadingExtracting: "DownloadingExtracting" = "DownloadingExtracting"
  inline val ExecutingDownloadCondition: "ExecutingDownloadCondition" = "ExecutingDownloadCondition"
  inline val ExecutingPreLaunch: "ExecutingPreLaunch" = "ExecutingPreLaunch"
  inline val Launching: "Launching" = "Launching"
  inline val ExecutingPostLaunch: "ExecutingPostLaunch" = "ExecutingPostLaunch"
  inline val Finished: "Finished" = "Finished"

  inline def values: js.Array[RobotDeploymentStep] = js.Array(Validating, DownloadingExtracting, ExecutingDownloadCondition, ExecutingPreLaunch, Launching, ExecutingPostLaunch, Finished)
}

type RobotSoftwareSuiteType = "ROS" | "ROS2"
object RobotSoftwareSuiteType {
  inline val ROS: "ROS" = "ROS"
  inline val ROS2: "ROS2" = "ROS2"

  inline def values: js.Array[RobotSoftwareSuiteType] = js.Array(ROS, ROS2)
}

type RobotSoftwareSuiteVersionType = "Kinetic" | "Melodic" | "Dashing"
object RobotSoftwareSuiteVersionType {
  inline val Kinetic: "Kinetic" = "Kinetic"
  inline val Melodic: "Melodic" = "Melodic"
  inline val Dashing: "Dashing" = "Dashing"

  inline def values: js.Array[RobotSoftwareSuiteVersionType] = js.Array(Kinetic, Melodic, Dashing)
}

type RobotStatus = "Available" | "Registered" | "PendingNewDeployment" | "Deploying" | "Failed" | "InSync" | "NoResponse"
object RobotStatus {
  inline val Available: "Available" = "Available"
  inline val Registered: "Registered" = "Registered"
  inline val PendingNewDeployment: "PendingNewDeployment" = "PendingNewDeployment"
  inline val Deploying: "Deploying" = "Deploying"
  inline val Failed: "Failed" = "Failed"
  inline val InSync: "InSync" = "InSync"
  inline val NoResponse: "NoResponse" = "NoResponse"

  inline def values: js.Array[RobotStatus] = js.Array(Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse)
}

type SimulationJobBatchErrorCode = "InternalServiceError"
object SimulationJobBatchErrorCode {
  inline val InternalServiceError: "InternalServiceError" = "InternalServiceError"

  inline def values: js.Array[SimulationJobBatchErrorCode] = js.Array(InternalServiceError)
}

type SimulationJobBatchStatus = "Pending" | "InProgress" | "Failed" | "Completed" | "Canceled" | "Canceling" | "Completing" | "TimingOut" | "TimedOut"
object SimulationJobBatchStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Completed: "Completed" = "Completed"
  inline val Canceled: "Canceled" = "Canceled"
  inline val Canceling: "Canceling" = "Canceling"
  inline val Completing: "Completing" = "Completing"
  inline val TimingOut: "TimingOut" = "TimingOut"
  inline val TimedOut: "TimedOut" = "TimedOut"

  inline def values: js.Array[SimulationJobBatchStatus] = js.Array(Pending, InProgress, Failed, Completed, Canceled, Canceling, Completing, TimingOut, TimedOut)
}

type SimulationJobErrorCode = "InternalServiceError" | "RobotApplicationCrash" | "SimulationApplicationCrash" | "RobotApplicationHealthCheckFailure" | "SimulationApplicationHealthCheckFailure" | "BadPermissionsRobotApplication" | "BadPermissionsSimulationApplication" | "BadPermissionsS3Object" | "BadPermissionsS3Output" | "BadPermissionsCloudwatchLogs" | "SubnetIpLimitExceeded" | "ENILimitExceeded" | "BadPermissionsUserCredentials" | "InvalidBundleRobotApplication" | "InvalidBundleSimulationApplication" | "InvalidS3Resource" | "ThrottlingError" | "LimitExceeded" | "MismatchedEtag" | "RobotApplicationVersionMismatchedEtag" | "SimulationApplicationVersionMismatchedEtag" | "ResourceNotFound" | "RequestThrottled" | "BatchTimedOut" | "BatchCanceled" | "InvalidInput" | "WrongRegionS3Bucket" | "WrongRegionS3Output" | "WrongRegionRobotApplication" | "WrongRegionSimulationApplication" | "UploadContentMismatchError"
object SimulationJobErrorCode {
  inline val InternalServiceError: "InternalServiceError" = "InternalServiceError"
  inline val RobotApplicationCrash: "RobotApplicationCrash" = "RobotApplicationCrash"
  inline val SimulationApplicationCrash: "SimulationApplicationCrash" = "SimulationApplicationCrash"
  inline val RobotApplicationHealthCheckFailure: "RobotApplicationHealthCheckFailure" = "RobotApplicationHealthCheckFailure"
  inline val SimulationApplicationHealthCheckFailure: "SimulationApplicationHealthCheckFailure" = "SimulationApplicationHealthCheckFailure"
  inline val BadPermissionsRobotApplication: "BadPermissionsRobotApplication" = "BadPermissionsRobotApplication"
  inline val BadPermissionsSimulationApplication: "BadPermissionsSimulationApplication" = "BadPermissionsSimulationApplication"
  inline val BadPermissionsS3Object: "BadPermissionsS3Object" = "BadPermissionsS3Object"
  inline val BadPermissionsS3Output: "BadPermissionsS3Output" = "BadPermissionsS3Output"
  inline val BadPermissionsCloudwatchLogs: "BadPermissionsCloudwatchLogs" = "BadPermissionsCloudwatchLogs"
  inline val SubnetIpLimitExceeded: "SubnetIpLimitExceeded" = "SubnetIpLimitExceeded"
  inline val ENILimitExceeded: "ENILimitExceeded" = "ENILimitExceeded"
  inline val BadPermissionsUserCredentials: "BadPermissionsUserCredentials" = "BadPermissionsUserCredentials"
  inline val InvalidBundleRobotApplication: "InvalidBundleRobotApplication" = "InvalidBundleRobotApplication"
  inline val InvalidBundleSimulationApplication: "InvalidBundleSimulationApplication" = "InvalidBundleSimulationApplication"
  inline val InvalidS3Resource: "InvalidS3Resource" = "InvalidS3Resource"
  inline val ThrottlingError: "ThrottlingError" = "ThrottlingError"
  inline val LimitExceeded: "LimitExceeded" = "LimitExceeded"
  inline val MismatchedEtag: "MismatchedEtag" = "MismatchedEtag"
  inline val RobotApplicationVersionMismatchedEtag: "RobotApplicationVersionMismatchedEtag" = "RobotApplicationVersionMismatchedEtag"
  inline val SimulationApplicationVersionMismatchedEtag: "SimulationApplicationVersionMismatchedEtag" = "SimulationApplicationVersionMismatchedEtag"
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  inline val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  inline val BatchTimedOut: "BatchTimedOut" = "BatchTimedOut"
  inline val BatchCanceled: "BatchCanceled" = "BatchCanceled"
  inline val InvalidInput: "InvalidInput" = "InvalidInput"
  inline val WrongRegionS3Bucket: "WrongRegionS3Bucket" = "WrongRegionS3Bucket"
  inline val WrongRegionS3Output: "WrongRegionS3Output" = "WrongRegionS3Output"
  inline val WrongRegionRobotApplication: "WrongRegionRobotApplication" = "WrongRegionRobotApplication"
  inline val WrongRegionSimulationApplication: "WrongRegionSimulationApplication" = "WrongRegionSimulationApplication"
  inline val UploadContentMismatchError: "UploadContentMismatchError" = "UploadContentMismatchError"

  inline def values: js.Array[SimulationJobErrorCode] = js.Array(
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
  inline val Pending: "Pending" = "Pending"
  inline val Preparing: "Preparing" = "Preparing"
  inline val Running: "Running" = "Running"
  inline val Restarting: "Restarting" = "Restarting"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val RunningFailed: "RunningFailed" = "RunningFailed"
  inline val Terminating: "Terminating" = "Terminating"
  inline val Terminated: "Terminated" = "Terminated"
  inline val Canceled: "Canceled" = "Canceled"

  inline def values: js.Array[SimulationJobStatus] = js.Array(Pending, Preparing, Running, Restarting, Completed, Failed, RunningFailed, Terminating, Terminated, Canceled)
}

type SimulationSoftwareSuiteType = "Gazebo" | "RosbagPlay"
object SimulationSoftwareSuiteType {
  inline val Gazebo: "Gazebo" = "Gazebo"
  inline val RosbagPlay: "RosbagPlay" = "RosbagPlay"

  inline def values: js.Array[SimulationSoftwareSuiteType] = js.Array(Gazebo, RosbagPlay)
}

type UploadBehavior = "UPLOAD_ON_TERMINATE" | "UPLOAD_ROLLING_AUTO_REMOVE"
object UploadBehavior {
  inline val UPLOAD_ON_TERMINATE: "UPLOAD_ON_TERMINATE" = "UPLOAD_ON_TERMINATE"
  inline val UPLOAD_ROLLING_AUTO_REMOVE: "UPLOAD_ROLLING_AUTO_REMOVE" = "UPLOAD_ROLLING_AUTO_REMOVE"

  inline def values: js.Array[UploadBehavior] = js.Array(UPLOAD_ON_TERMINATE, UPLOAD_ROLLING_AUTO_REMOVE)
}

type WorldExportJobErrorCode = "InternalServiceError" | "LimitExceeded" | "ResourceNotFound" | "RequestThrottled" | "InvalidInput" | "AccessDenied"
object WorldExportJobErrorCode {
  inline val InternalServiceError: "InternalServiceError" = "InternalServiceError"
  inline val LimitExceeded: "LimitExceeded" = "LimitExceeded"
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  inline val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  inline val InvalidInput: "InvalidInput" = "InvalidInput"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"

  inline def values: js.Array[WorldExportJobErrorCode] = js.Array(InternalServiceError, LimitExceeded, ResourceNotFound, RequestThrottled, InvalidInput, AccessDenied)
}

type WorldExportJobStatus = "Pending" | "Running" | "Completed" | "Failed" | "Canceling" | "Canceled"
object WorldExportJobStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Running: "Running" = "Running"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Canceling: "Canceling" = "Canceling"
  inline val Canceled: "Canceled" = "Canceled"

  inline def values: js.Array[WorldExportJobStatus] = js.Array(Pending, Running, Completed, Failed, Canceling, Canceled)
}

type WorldGenerationJobErrorCode = "InternalServiceError" | "LimitExceeded" | "ResourceNotFound" | "RequestThrottled" | "InvalidInput" | "AllWorldGenerationFailed"
object WorldGenerationJobErrorCode {
  inline val InternalServiceError: "InternalServiceError" = "InternalServiceError"
  inline val LimitExceeded: "LimitExceeded" = "LimitExceeded"
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  inline val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  inline val InvalidInput: "InvalidInput" = "InvalidInput"
  inline val AllWorldGenerationFailed: "AllWorldGenerationFailed" = "AllWorldGenerationFailed"

  inline def values: js.Array[WorldGenerationJobErrorCode] = js.Array(InternalServiceError, LimitExceeded, ResourceNotFound, RequestThrottled, InvalidInput, AllWorldGenerationFailed)
}

type WorldGenerationJobStatus = "Pending" | "Running" | "Completed" | "Failed" | "PartialFailed" | "Canceling" | "Canceled"
object WorldGenerationJobStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Running: "Running" = "Running"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val PartialFailed: "PartialFailed" = "PartialFailed"
  inline val Canceling: "Canceling" = "Canceling"
  inline val Canceled: "Canceled" = "Canceled"

  inline def values: js.Array[WorldGenerationJobStatus] = js.Array(Pending, Running, Completed, Failed, PartialFailed, Canceling, Canceled)
}
