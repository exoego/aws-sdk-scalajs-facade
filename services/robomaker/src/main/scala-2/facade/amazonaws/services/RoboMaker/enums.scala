package facade.amazonaws.services.robomaker

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Architecture extends js.Any
object Architecture {
  val X86_64 = "X86_64".asInstanceOf[Architecture]
  val ARM64 = "ARM64".asInstanceOf[Architecture]
  val ARMHF = "ARMHF".asInstanceOf[Architecture]

  @inline def values = js.Array(X86_64, ARM64, ARMHF)
}

@js.native
sealed trait DeploymentJobErrorCode extends js.Any
object DeploymentJobErrorCode {
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[DeploymentJobErrorCode]
  val EnvironmentSetupError = "EnvironmentSetupError".asInstanceOf[DeploymentJobErrorCode]
  val EtagMismatch = "EtagMismatch".asInstanceOf[DeploymentJobErrorCode]
  val FailureThresholdBreached = "FailureThresholdBreached".asInstanceOf[DeploymentJobErrorCode]
  val RobotDeploymentAborted = "RobotDeploymentAborted".asInstanceOf[DeploymentJobErrorCode]
  val RobotDeploymentNoResponse = "RobotDeploymentNoResponse".asInstanceOf[DeploymentJobErrorCode]
  val RobotAgentConnectionTimeout = "RobotAgentConnectionTimeout".asInstanceOf[DeploymentJobErrorCode]
  val GreengrassDeploymentFailed = "GreengrassDeploymentFailed".asInstanceOf[DeploymentJobErrorCode]
  val InvalidGreengrassGroup = "InvalidGreengrassGroup".asInstanceOf[DeploymentJobErrorCode]
  val MissingRobotArchitecture = "MissingRobotArchitecture".asInstanceOf[DeploymentJobErrorCode]
  val MissingRobotApplicationArchitecture = "MissingRobotApplicationArchitecture".asInstanceOf[DeploymentJobErrorCode]
  val MissingRobotDeploymentResource = "MissingRobotDeploymentResource".asInstanceOf[DeploymentJobErrorCode]
  val GreengrassGroupVersionDoesNotExist = "GreengrassGroupVersionDoesNotExist".asInstanceOf[DeploymentJobErrorCode]
  val LambdaDeleted = "LambdaDeleted".asInstanceOf[DeploymentJobErrorCode]
  val ExtractingBundleFailure = "ExtractingBundleFailure".asInstanceOf[DeploymentJobErrorCode]
  val PreLaunchFileFailure = "PreLaunchFileFailure".asInstanceOf[DeploymentJobErrorCode]
  val PostLaunchFileFailure = "PostLaunchFileFailure".asInstanceOf[DeploymentJobErrorCode]
  val BadPermissionError = "BadPermissionError".asInstanceOf[DeploymentJobErrorCode]
  val DownloadConditionFailed = "DownloadConditionFailed".asInstanceOf[DeploymentJobErrorCode]
  val BadLambdaAssociated = "BadLambdaAssociated".asInstanceOf[DeploymentJobErrorCode]
  val InternalServerError = "InternalServerError".asInstanceOf[DeploymentJobErrorCode]
  val RobotApplicationDoesNotExist = "RobotApplicationDoesNotExist".asInstanceOf[DeploymentJobErrorCode]
  val DeploymentFleetDoesNotExist = "DeploymentFleetDoesNotExist".asInstanceOf[DeploymentJobErrorCode]
  val FleetDeploymentTimeout = "FleetDeploymentTimeout".asInstanceOf[DeploymentJobErrorCode]

  @inline def values = js.Array(ResourceNotFound, EnvironmentSetupError, EtagMismatch, FailureThresholdBreached, RobotDeploymentAborted, RobotDeploymentNoResponse, RobotAgentConnectionTimeout, GreengrassDeploymentFailed, InvalidGreengrassGroup, MissingRobotArchitecture, MissingRobotApplicationArchitecture, MissingRobotDeploymentResource, GreengrassGroupVersionDoesNotExist, LambdaDeleted, ExtractingBundleFailure, PreLaunchFileFailure, PostLaunchFileFailure, BadPermissionError, DownloadConditionFailed, BadLambdaAssociated, InternalServerError, RobotApplicationDoesNotExist, DeploymentFleetDoesNotExist, FleetDeploymentTimeout)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val Pending = "Pending".asInstanceOf[DeploymentStatus]
  val Preparing = "Preparing".asInstanceOf[DeploymentStatus]
  val InProgress = "InProgress".asInstanceOf[DeploymentStatus]
  val Failed = "Failed".asInstanceOf[DeploymentStatus]
  val Succeeded = "Succeeded".asInstanceOf[DeploymentStatus]
  val Canceled = "Canceled".asInstanceOf[DeploymentStatus]

  @inline def values = js.Array(Pending, Preparing, InProgress, Failed, Succeeded, Canceled)
}

@js.native
sealed trait ExitBehavior extends js.Any
object ExitBehavior {
  val FAIL = "FAIL".asInstanceOf[ExitBehavior]
  val RESTART = "RESTART".asInstanceOf[ExitBehavior]

  @inline def values = js.Array(FAIL, RESTART)
}

@js.native
sealed trait FailureBehavior extends js.Any
object FailureBehavior {
  val Fail = "Fail".asInstanceOf[FailureBehavior]
  val Continue = "Continue".asInstanceOf[FailureBehavior]

  @inline def values = js.Array(Fail, Continue)
}

@js.native
sealed trait RenderingEngineType extends js.Any
object RenderingEngineType {
  val OGRE = "OGRE".asInstanceOf[RenderingEngineType]

  @inline def values = js.Array(OGRE)
}

@js.native
sealed trait RobotDeploymentStep extends js.Any
object RobotDeploymentStep {
  val Validating = "Validating".asInstanceOf[RobotDeploymentStep]
  val DownloadingExtracting = "DownloadingExtracting".asInstanceOf[RobotDeploymentStep]
  val ExecutingDownloadCondition = "ExecutingDownloadCondition".asInstanceOf[RobotDeploymentStep]
  val ExecutingPreLaunch = "ExecutingPreLaunch".asInstanceOf[RobotDeploymentStep]
  val Launching = "Launching".asInstanceOf[RobotDeploymentStep]
  val ExecutingPostLaunch = "ExecutingPostLaunch".asInstanceOf[RobotDeploymentStep]
  val Finished = "Finished".asInstanceOf[RobotDeploymentStep]

  @inline def values = js.Array(Validating, DownloadingExtracting, ExecutingDownloadCondition, ExecutingPreLaunch, Launching, ExecutingPostLaunch, Finished)
}

@js.native
sealed trait RobotSoftwareSuiteType extends js.Any
object RobotSoftwareSuiteType {
  val ROS = "ROS".asInstanceOf[RobotSoftwareSuiteType]
  val ROS2 = "ROS2".asInstanceOf[RobotSoftwareSuiteType]

  @inline def values = js.Array(ROS, ROS2)
}

@js.native
sealed trait RobotSoftwareSuiteVersionType extends js.Any
object RobotSoftwareSuiteVersionType {
  val Kinetic = "Kinetic".asInstanceOf[RobotSoftwareSuiteVersionType]
  val Melodic = "Melodic".asInstanceOf[RobotSoftwareSuiteVersionType]
  val Dashing = "Dashing".asInstanceOf[RobotSoftwareSuiteVersionType]

  @inline def values = js.Array(Kinetic, Melodic, Dashing)
}

@js.native
sealed trait RobotStatus extends js.Any
object RobotStatus {
  val Available = "Available".asInstanceOf[RobotStatus]
  val Registered = "Registered".asInstanceOf[RobotStatus]
  val PendingNewDeployment = "PendingNewDeployment".asInstanceOf[RobotStatus]
  val Deploying = "Deploying".asInstanceOf[RobotStatus]
  val Failed = "Failed".asInstanceOf[RobotStatus]
  val InSync = "InSync".asInstanceOf[RobotStatus]
  val NoResponse = "NoResponse".asInstanceOf[RobotStatus]

  @inline def values = js.Array(Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse)
}

@js.native
sealed trait SimulationJobBatchErrorCode extends js.Any
object SimulationJobBatchErrorCode {
  val InternalServiceError = "InternalServiceError".asInstanceOf[SimulationJobBatchErrorCode]

  @inline def values = js.Array(InternalServiceError)
}

@js.native
sealed trait SimulationJobBatchStatus extends js.Any
object SimulationJobBatchStatus {
  val Pending = "Pending".asInstanceOf[SimulationJobBatchStatus]
  val InProgress = "InProgress".asInstanceOf[SimulationJobBatchStatus]
  val Failed = "Failed".asInstanceOf[SimulationJobBatchStatus]
  val Completed = "Completed".asInstanceOf[SimulationJobBatchStatus]
  val Canceled = "Canceled".asInstanceOf[SimulationJobBatchStatus]
  val Canceling = "Canceling".asInstanceOf[SimulationJobBatchStatus]
  val Completing = "Completing".asInstanceOf[SimulationJobBatchStatus]
  val TimingOut = "TimingOut".asInstanceOf[SimulationJobBatchStatus]
  val TimedOut = "TimedOut".asInstanceOf[SimulationJobBatchStatus]

  @inline def values = js.Array(Pending, InProgress, Failed, Completed, Canceled, Canceling, Completing, TimingOut, TimedOut)
}

@js.native
sealed trait SimulationJobErrorCode extends js.Any
object SimulationJobErrorCode {
  val InternalServiceError = "InternalServiceError".asInstanceOf[SimulationJobErrorCode]
  val RobotApplicationCrash = "RobotApplicationCrash".asInstanceOf[SimulationJobErrorCode]
  val SimulationApplicationCrash = "SimulationApplicationCrash".asInstanceOf[SimulationJobErrorCode]
  val RobotApplicationHealthCheckFailure = "RobotApplicationHealthCheckFailure".asInstanceOf[SimulationJobErrorCode]
  val SimulationApplicationHealthCheckFailure = "SimulationApplicationHealthCheckFailure".asInstanceOf[SimulationJobErrorCode]
  val BadPermissionsRobotApplication = "BadPermissionsRobotApplication".asInstanceOf[SimulationJobErrorCode]
  val BadPermissionsSimulationApplication = "BadPermissionsSimulationApplication".asInstanceOf[SimulationJobErrorCode]
  val BadPermissionsS3Object = "BadPermissionsS3Object".asInstanceOf[SimulationJobErrorCode]
  val BadPermissionsS3Output = "BadPermissionsS3Output".asInstanceOf[SimulationJobErrorCode]
  val BadPermissionsCloudwatchLogs = "BadPermissionsCloudwatchLogs".asInstanceOf[SimulationJobErrorCode]
  val SubnetIpLimitExceeded = "SubnetIpLimitExceeded".asInstanceOf[SimulationJobErrorCode]
  val ENILimitExceeded = "ENILimitExceeded".asInstanceOf[SimulationJobErrorCode]
  val BadPermissionsUserCredentials = "BadPermissionsUserCredentials".asInstanceOf[SimulationJobErrorCode]
  val InvalidBundleRobotApplication = "InvalidBundleRobotApplication".asInstanceOf[SimulationJobErrorCode]
  val InvalidBundleSimulationApplication = "InvalidBundleSimulationApplication".asInstanceOf[SimulationJobErrorCode]
  val InvalidS3Resource = "InvalidS3Resource".asInstanceOf[SimulationJobErrorCode]
  val ThrottlingError = "ThrottlingError".asInstanceOf[SimulationJobErrorCode]
  val LimitExceeded = "LimitExceeded".asInstanceOf[SimulationJobErrorCode]
  val MismatchedEtag = "MismatchedEtag".asInstanceOf[SimulationJobErrorCode]
  val RobotApplicationVersionMismatchedEtag = "RobotApplicationVersionMismatchedEtag".asInstanceOf[SimulationJobErrorCode]
  val SimulationApplicationVersionMismatchedEtag = "SimulationApplicationVersionMismatchedEtag".asInstanceOf[SimulationJobErrorCode]
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[SimulationJobErrorCode]
  val RequestThrottled = "RequestThrottled".asInstanceOf[SimulationJobErrorCode]
  val BatchTimedOut = "BatchTimedOut".asInstanceOf[SimulationJobErrorCode]
  val BatchCanceled = "BatchCanceled".asInstanceOf[SimulationJobErrorCode]
  val InvalidInput = "InvalidInput".asInstanceOf[SimulationJobErrorCode]
  val WrongRegionS3Bucket = "WrongRegionS3Bucket".asInstanceOf[SimulationJobErrorCode]
  val WrongRegionS3Output = "WrongRegionS3Output".asInstanceOf[SimulationJobErrorCode]
  val WrongRegionRobotApplication = "WrongRegionRobotApplication".asInstanceOf[SimulationJobErrorCode]
  val WrongRegionSimulationApplication = "WrongRegionSimulationApplication".asInstanceOf[SimulationJobErrorCode]
  val UploadContentMismatchError = "UploadContentMismatchError".asInstanceOf[SimulationJobErrorCode]

  @inline def values = js.Array(InternalServiceError, RobotApplicationCrash, SimulationApplicationCrash, RobotApplicationHealthCheckFailure, SimulationApplicationHealthCheckFailure, BadPermissionsRobotApplication, BadPermissionsSimulationApplication, BadPermissionsS3Object, BadPermissionsS3Output, BadPermissionsCloudwatchLogs, SubnetIpLimitExceeded, ENILimitExceeded, BadPermissionsUserCredentials, InvalidBundleRobotApplication, InvalidBundleSimulationApplication, InvalidS3Resource, ThrottlingError, LimitExceeded, MismatchedEtag, RobotApplicationVersionMismatchedEtag, SimulationApplicationVersionMismatchedEtag, ResourceNotFound, RequestThrottled, BatchTimedOut, BatchCanceled, InvalidInput, WrongRegionS3Bucket, WrongRegionS3Output, WrongRegionRobotApplication, WrongRegionSimulationApplication, UploadContentMismatchError)
}

@js.native
sealed trait SimulationJobStatus extends js.Any
object SimulationJobStatus {
  val Pending = "Pending".asInstanceOf[SimulationJobStatus]
  val Preparing = "Preparing".asInstanceOf[SimulationJobStatus]
  val Running = "Running".asInstanceOf[SimulationJobStatus]
  val Restarting = "Restarting".asInstanceOf[SimulationJobStatus]
  val Completed = "Completed".asInstanceOf[SimulationJobStatus]
  val Failed = "Failed".asInstanceOf[SimulationJobStatus]
  val RunningFailed = "RunningFailed".asInstanceOf[SimulationJobStatus]
  val Terminating = "Terminating".asInstanceOf[SimulationJobStatus]
  val Terminated = "Terminated".asInstanceOf[SimulationJobStatus]
  val Canceled = "Canceled".asInstanceOf[SimulationJobStatus]

  @inline def values = js.Array(Pending, Preparing, Running, Restarting, Completed, Failed, RunningFailed, Terminating, Terminated, Canceled)
}

@js.native
sealed trait SimulationSoftwareSuiteType extends js.Any
object SimulationSoftwareSuiteType {
  val Gazebo = "Gazebo".asInstanceOf[SimulationSoftwareSuiteType]
  val RosbagPlay = "RosbagPlay".asInstanceOf[SimulationSoftwareSuiteType]

  @inline def values = js.Array(Gazebo, RosbagPlay)
}

@js.native
sealed trait UploadBehavior extends js.Any
object UploadBehavior {
  val UPLOAD_ON_TERMINATE = "UPLOAD_ON_TERMINATE".asInstanceOf[UploadBehavior]
  val UPLOAD_ROLLING_AUTO_REMOVE = "UPLOAD_ROLLING_AUTO_REMOVE".asInstanceOf[UploadBehavior]

  @inline def values = js.Array(UPLOAD_ON_TERMINATE, UPLOAD_ROLLING_AUTO_REMOVE)
}

@js.native
sealed trait WorldExportJobErrorCode extends js.Any
object WorldExportJobErrorCode {
  val InternalServiceError = "InternalServiceError".asInstanceOf[WorldExportJobErrorCode]
  val LimitExceeded = "LimitExceeded".asInstanceOf[WorldExportJobErrorCode]
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[WorldExportJobErrorCode]
  val RequestThrottled = "RequestThrottled".asInstanceOf[WorldExportJobErrorCode]
  val InvalidInput = "InvalidInput".asInstanceOf[WorldExportJobErrorCode]
  val AccessDenied = "AccessDenied".asInstanceOf[WorldExportJobErrorCode]

  @inline def values = js.Array(InternalServiceError, LimitExceeded, ResourceNotFound, RequestThrottled, InvalidInput, AccessDenied)
}

@js.native
sealed trait WorldExportJobStatus extends js.Any
object WorldExportJobStatus {
  val Pending = "Pending".asInstanceOf[WorldExportJobStatus]
  val Running = "Running".asInstanceOf[WorldExportJobStatus]
  val Completed = "Completed".asInstanceOf[WorldExportJobStatus]
  val Failed = "Failed".asInstanceOf[WorldExportJobStatus]
  val Canceling = "Canceling".asInstanceOf[WorldExportJobStatus]
  val Canceled = "Canceled".asInstanceOf[WorldExportJobStatus]

  @inline def values = js.Array(Pending, Running, Completed, Failed, Canceling, Canceled)
}

@js.native
sealed trait WorldGenerationJobErrorCode extends js.Any
object WorldGenerationJobErrorCode {
  val InternalServiceError = "InternalServiceError".asInstanceOf[WorldGenerationJobErrorCode]
  val LimitExceeded = "LimitExceeded".asInstanceOf[WorldGenerationJobErrorCode]
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[WorldGenerationJobErrorCode]
  val RequestThrottled = "RequestThrottled".asInstanceOf[WorldGenerationJobErrorCode]
  val InvalidInput = "InvalidInput".asInstanceOf[WorldGenerationJobErrorCode]
  val AllWorldGenerationFailed = "AllWorldGenerationFailed".asInstanceOf[WorldGenerationJobErrorCode]

  @inline def values = js.Array(InternalServiceError, LimitExceeded, ResourceNotFound, RequestThrottled, InvalidInput, AllWorldGenerationFailed)
}

@js.native
sealed trait WorldGenerationJobStatus extends js.Any
object WorldGenerationJobStatus {
  val Pending = "Pending".asInstanceOf[WorldGenerationJobStatus]
  val Running = "Running".asInstanceOf[WorldGenerationJobStatus]
  val Completed = "Completed".asInstanceOf[WorldGenerationJobStatus]
  val Failed = "Failed".asInstanceOf[WorldGenerationJobStatus]
  val PartialFailed = "PartialFailed".asInstanceOf[WorldGenerationJobStatus]
  val Canceling = "Canceling".asInstanceOf[WorldGenerationJobStatus]
  val Canceled = "Canceled".asInstanceOf[WorldGenerationJobStatus]

  @inline def values = js.Array(Pending, Running, Completed, Failed, PartialFailed, Canceling, Canceled)
}

