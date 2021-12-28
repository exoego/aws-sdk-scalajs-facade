package facade.amazonaws.services.codedeploy

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApplicationRevisionSortBy extends js.Any
object ApplicationRevisionSortBy {
  val registerTime = "registerTime".asInstanceOf[ApplicationRevisionSortBy]
  val firstUsedTime = "firstUsedTime".asInstanceOf[ApplicationRevisionSortBy]
  val lastUsedTime = "lastUsedTime".asInstanceOf[ApplicationRevisionSortBy]

  @inline def values = js.Array(registerTime, firstUsedTime, lastUsedTime)
}

@js.native
sealed trait AutoRollbackEvent extends js.Any
object AutoRollbackEvent {
  val DEPLOYMENT_FAILURE = "DEPLOYMENT_FAILURE".asInstanceOf[AutoRollbackEvent]
  val DEPLOYMENT_STOP_ON_ALARM = "DEPLOYMENT_STOP_ON_ALARM".asInstanceOf[AutoRollbackEvent]
  val DEPLOYMENT_STOP_ON_REQUEST = "DEPLOYMENT_STOP_ON_REQUEST".asInstanceOf[AutoRollbackEvent]

  @inline def values = js.Array(DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST)
}

@js.native
sealed trait BundleType extends js.Any
object BundleType {
  val tar = "tar".asInstanceOf[BundleType]
  val tgz = "tgz".asInstanceOf[BundleType]
  val zip = "zip".asInstanceOf[BundleType]
  val YAML = "YAML".asInstanceOf[BundleType]
  val JSON = "JSON".asInstanceOf[BundleType]

  @inline def values = js.Array(tar, tgz, zip, YAML, JSON)
}

@js.native
sealed trait ComputePlatform extends js.Any
object ComputePlatform {
  val Server = "Server".asInstanceOf[ComputePlatform]
  val Lambda = "Lambda".asInstanceOf[ComputePlatform]
  val ECS = "ECS".asInstanceOf[ComputePlatform]

  @inline def values = js.Array(Server, Lambda, ECS)
}

@js.native
sealed trait DeploymentCreator extends js.Any
object DeploymentCreator {
  val user = "user".asInstanceOf[DeploymentCreator]
  val autoscaling = "autoscaling".asInstanceOf[DeploymentCreator]
  val codeDeployRollback = "codeDeployRollback".asInstanceOf[DeploymentCreator]
  val CodeDeploy = "CodeDeploy".asInstanceOf[DeploymentCreator]
  val CodeDeployAutoUpdate = "CodeDeployAutoUpdate".asInstanceOf[DeploymentCreator]
  val CloudFormation = "CloudFormation".asInstanceOf[DeploymentCreator]
  val CloudFormationRollback = "CloudFormationRollback".asInstanceOf[DeploymentCreator]

  @inline def values = js.Array(user, autoscaling, codeDeployRollback, CodeDeploy, CodeDeployAutoUpdate, CloudFormation, CloudFormationRollback)
}

@js.native
sealed trait DeploymentOption extends js.Any
object DeploymentOption {
  val WITH_TRAFFIC_CONTROL = "WITH_TRAFFIC_CONTROL".asInstanceOf[DeploymentOption]
  val WITHOUT_TRAFFIC_CONTROL = "WITHOUT_TRAFFIC_CONTROL".asInstanceOf[DeploymentOption]

  @inline def values = js.Array(WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL)
}

@js.native
sealed trait DeploymentReadyAction extends js.Any
object DeploymentReadyAction {
  val CONTINUE_DEPLOYMENT = "CONTINUE_DEPLOYMENT".asInstanceOf[DeploymentReadyAction]
  val STOP_DEPLOYMENT = "STOP_DEPLOYMENT".asInstanceOf[DeploymentReadyAction]

  @inline def values = js.Array(CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val Created = "Created".asInstanceOf[DeploymentStatus]
  val Queued = "Queued".asInstanceOf[DeploymentStatus]
  val InProgress = "InProgress".asInstanceOf[DeploymentStatus]
  val Baking = "Baking".asInstanceOf[DeploymentStatus]
  val Succeeded = "Succeeded".asInstanceOf[DeploymentStatus]
  val Failed = "Failed".asInstanceOf[DeploymentStatus]
  val Stopped = "Stopped".asInstanceOf[DeploymentStatus]
  val Ready = "Ready".asInstanceOf[DeploymentStatus]

  @inline def values = js.Array(Created, Queued, InProgress, Baking, Succeeded, Failed, Stopped, Ready)
}

@js.native
sealed trait DeploymentTargetType extends js.Any
object DeploymentTargetType {
  val InstanceTarget = "InstanceTarget".asInstanceOf[DeploymentTargetType]
  val LambdaTarget = "LambdaTarget".asInstanceOf[DeploymentTargetType]
  val ECSTarget = "ECSTarget".asInstanceOf[DeploymentTargetType]
  val CloudFormationTarget = "CloudFormationTarget".asInstanceOf[DeploymentTargetType]

  @inline def values = js.Array(InstanceTarget, LambdaTarget, ECSTarget, CloudFormationTarget)
}

@js.native
sealed trait DeploymentType extends js.Any
object DeploymentType {
  val IN_PLACE = "IN_PLACE".asInstanceOf[DeploymentType]
  val BLUE_GREEN = "BLUE_GREEN".asInstanceOf[DeploymentType]

  @inline def values = js.Array(IN_PLACE, BLUE_GREEN)
}

@js.native
sealed trait DeploymentWaitType extends js.Any
object DeploymentWaitType {
  val READY_WAIT = "READY_WAIT".asInstanceOf[DeploymentWaitType]
  val TERMINATION_WAIT = "TERMINATION_WAIT".asInstanceOf[DeploymentWaitType]

  @inline def values = js.Array(READY_WAIT, TERMINATION_WAIT)
}

@js.native
sealed trait EC2TagFilterType extends js.Any
object EC2TagFilterType {
  val KEY_ONLY = "KEY_ONLY".asInstanceOf[EC2TagFilterType]
  val VALUE_ONLY = "VALUE_ONLY".asInstanceOf[EC2TagFilterType]
  val KEY_AND_VALUE = "KEY_AND_VALUE".asInstanceOf[EC2TagFilterType]

  @inline def values = js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val AGENT_ISSUE = "AGENT_ISSUE".asInstanceOf[ErrorCode]
  val ALARM_ACTIVE = "ALARM_ACTIVE".asInstanceOf[ErrorCode]
  val APPLICATION_MISSING = "APPLICATION_MISSING".asInstanceOf[ErrorCode]
  val AUTOSCALING_VALIDATION_ERROR = "AUTOSCALING_VALIDATION_ERROR".asInstanceOf[ErrorCode]
  val AUTO_SCALING_CONFIGURATION = "AUTO_SCALING_CONFIGURATION".asInstanceOf[ErrorCode]
  val AUTO_SCALING_IAM_ROLE_PERMISSIONS = "AUTO_SCALING_IAM_ROLE_PERMISSIONS".asInstanceOf[ErrorCode]
  val CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND = "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND".asInstanceOf[ErrorCode]
  val CUSTOMER_APPLICATION_UNHEALTHY = "CUSTOMER_APPLICATION_UNHEALTHY".asInstanceOf[ErrorCode]
  val DEPLOYMENT_GROUP_MISSING = "DEPLOYMENT_GROUP_MISSING".asInstanceOf[ErrorCode]
  val ECS_UPDATE_ERROR = "ECS_UPDATE_ERROR".asInstanceOf[ErrorCode]
  val ELASTIC_LOAD_BALANCING_INVALID = "ELASTIC_LOAD_BALANCING_INVALID".asInstanceOf[ErrorCode]
  val ELB_INVALID_INSTANCE = "ELB_INVALID_INSTANCE".asInstanceOf[ErrorCode]
  val HEALTH_CONSTRAINTS = "HEALTH_CONSTRAINTS".asInstanceOf[ErrorCode]
  val HEALTH_CONSTRAINTS_INVALID = "HEALTH_CONSTRAINTS_INVALID".asInstanceOf[ErrorCode]
  val HOOK_EXECUTION_FAILURE = "HOOK_EXECUTION_FAILURE".asInstanceOf[ErrorCode]
  val IAM_ROLE_MISSING = "IAM_ROLE_MISSING".asInstanceOf[ErrorCode]
  val IAM_ROLE_PERMISSIONS = "IAM_ROLE_PERMISSIONS".asInstanceOf[ErrorCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ErrorCode]
  val INVALID_ECS_SERVICE = "INVALID_ECS_SERVICE".asInstanceOf[ErrorCode]
  val INVALID_LAMBDA_CONFIGURATION = "INVALID_LAMBDA_CONFIGURATION".asInstanceOf[ErrorCode]
  val INVALID_LAMBDA_FUNCTION = "INVALID_LAMBDA_FUNCTION".asInstanceOf[ErrorCode]
  val INVALID_REVISION = "INVALID_REVISION".asInstanceOf[ErrorCode]
  val MANUAL_STOP = "MANUAL_STOP".asInstanceOf[ErrorCode]
  val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION = "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION".asInstanceOf[ErrorCode]
  val MISSING_ELB_INFORMATION = "MISSING_ELB_INFORMATION".asInstanceOf[ErrorCode]
  val MISSING_GITHUB_TOKEN = "MISSING_GITHUB_TOKEN".asInstanceOf[ErrorCode]
  val NO_EC2_SUBSCRIPTION = "NO_EC2_SUBSCRIPTION".asInstanceOf[ErrorCode]
  val NO_INSTANCES = "NO_INSTANCES".asInstanceOf[ErrorCode]
  val OVER_MAX_INSTANCES = "OVER_MAX_INSTANCES".asInstanceOf[ErrorCode]
  val RESOURCE_LIMIT_EXCEEDED = "RESOURCE_LIMIT_EXCEEDED".asInstanceOf[ErrorCode]
  val REVISION_MISSING = "REVISION_MISSING".asInstanceOf[ErrorCode]
  val THROTTLED = "THROTTLED".asInstanceOf[ErrorCode]
  val TIMEOUT = "TIMEOUT".asInstanceOf[ErrorCode]
  val CLOUDFORMATION_STACK_FAILURE = "CLOUDFORMATION_STACK_FAILURE".asInstanceOf[ErrorCode]

  @inline def values = js.Array(
    AGENT_ISSUE,
    ALARM_ACTIVE,
    APPLICATION_MISSING,
    AUTOSCALING_VALIDATION_ERROR,
    AUTO_SCALING_CONFIGURATION,
    AUTO_SCALING_IAM_ROLE_PERMISSIONS,
    CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND,
    CUSTOMER_APPLICATION_UNHEALTHY,
    DEPLOYMENT_GROUP_MISSING,
    ECS_UPDATE_ERROR,
    ELASTIC_LOAD_BALANCING_INVALID,
    ELB_INVALID_INSTANCE,
    HEALTH_CONSTRAINTS,
    HEALTH_CONSTRAINTS_INVALID,
    HOOK_EXECUTION_FAILURE,
    IAM_ROLE_MISSING,
    IAM_ROLE_PERMISSIONS,
    INTERNAL_ERROR,
    INVALID_ECS_SERVICE,
    INVALID_LAMBDA_CONFIGURATION,
    INVALID_LAMBDA_FUNCTION,
    INVALID_REVISION,
    MANUAL_STOP,
    MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION,
    MISSING_ELB_INFORMATION,
    MISSING_GITHUB_TOKEN,
    NO_EC2_SUBSCRIPTION,
    NO_INSTANCES,
    OVER_MAX_INSTANCES,
    RESOURCE_LIMIT_EXCEEDED,
    REVISION_MISSING,
    THROTTLED,
    TIMEOUT,
    CLOUDFORMATION_STACK_FAILURE
  )
}

@js.native
sealed trait FileExistsBehavior extends js.Any
object FileExistsBehavior {
  val DISALLOW = "DISALLOW".asInstanceOf[FileExistsBehavior]
  val OVERWRITE = "OVERWRITE".asInstanceOf[FileExistsBehavior]
  val RETAIN = "RETAIN".asInstanceOf[FileExistsBehavior]

  @inline def values = js.Array(DISALLOW, OVERWRITE, RETAIN)
}

@js.native
sealed trait GreenFleetProvisioningAction extends js.Any
object GreenFleetProvisioningAction {
  val DISCOVER_EXISTING = "DISCOVER_EXISTING".asInstanceOf[GreenFleetProvisioningAction]
  val COPY_AUTO_SCALING_GROUP = "COPY_AUTO_SCALING_GROUP".asInstanceOf[GreenFleetProvisioningAction]

  @inline def values = js.Array(DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP)
}

@js.native
sealed trait InstanceAction extends js.Any
object InstanceAction {
  val TERMINATE = "TERMINATE".asInstanceOf[InstanceAction]
  val KEEP_ALIVE = "KEEP_ALIVE".asInstanceOf[InstanceAction]

  @inline def values = js.Array(TERMINATE, KEEP_ALIVE)
}

@deprecated("InstanceStatus is deprecated, use TargetStatus instead.", "forever")
@js.native
sealed trait InstanceStatus extends js.Any
object InstanceStatus {
  val Pending = "Pending".asInstanceOf[InstanceStatus]
  val InProgress = "InProgress".asInstanceOf[InstanceStatus]
  val Succeeded = "Succeeded".asInstanceOf[InstanceStatus]
  val Failed = "Failed".asInstanceOf[InstanceStatus]
  val Skipped = "Skipped".asInstanceOf[InstanceStatus]
  val Unknown = "Unknown".asInstanceOf[InstanceStatus]
  val Ready = "Ready".asInstanceOf[InstanceStatus]

  @inline def values = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
}

@js.native
sealed trait InstanceType extends js.Any
object InstanceType {
  val Blue = "Blue".asInstanceOf[InstanceType]
  val Green = "Green".asInstanceOf[InstanceType]

  @inline def values = js.Array(Blue, Green)
}

@js.native
sealed trait LifecycleErrorCode extends js.Any
object LifecycleErrorCode {
  val Success = "Success".asInstanceOf[LifecycleErrorCode]
  val ScriptMissing = "ScriptMissing".asInstanceOf[LifecycleErrorCode]
  val ScriptNotExecutable = "ScriptNotExecutable".asInstanceOf[LifecycleErrorCode]
  val ScriptTimedOut = "ScriptTimedOut".asInstanceOf[LifecycleErrorCode]
  val ScriptFailed = "ScriptFailed".asInstanceOf[LifecycleErrorCode]
  val UnknownError = "UnknownError".asInstanceOf[LifecycleErrorCode]

  @inline def values = js.Array(Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
}

@js.native
sealed trait LifecycleEventStatus extends js.Any
object LifecycleEventStatus {
  val Pending = "Pending".asInstanceOf[LifecycleEventStatus]
  val InProgress = "InProgress".asInstanceOf[LifecycleEventStatus]
  val Succeeded = "Succeeded".asInstanceOf[LifecycleEventStatus]
  val Failed = "Failed".asInstanceOf[LifecycleEventStatus]
  val Skipped = "Skipped".asInstanceOf[LifecycleEventStatus]
  val Unknown = "Unknown".asInstanceOf[LifecycleEventStatus]

  @inline def values = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
}

@js.native
sealed trait ListStateFilterAction extends js.Any
object ListStateFilterAction {
  val include = "include".asInstanceOf[ListStateFilterAction]
  val exclude = "exclude".asInstanceOf[ListStateFilterAction]
  val ignore = "ignore".asInstanceOf[ListStateFilterAction]

  @inline def values = js.Array(include, exclude, ignore)
}

@js.native
sealed trait MinimumHealthyHostsType extends js.Any
object MinimumHealthyHostsType {
  val HOST_COUNT = "HOST_COUNT".asInstanceOf[MinimumHealthyHostsType]
  val FLEET_PERCENT = "FLEET_PERCENT".asInstanceOf[MinimumHealthyHostsType]

  @inline def values = js.Array(HOST_COUNT, FLEET_PERCENT)
}

@js.native
sealed trait OutdatedInstancesStrategy extends js.Any
object OutdatedInstancesStrategy {
  val UPDATE = "UPDATE".asInstanceOf[OutdatedInstancesStrategy]
  val IGNORE = "IGNORE".asInstanceOf[OutdatedInstancesStrategy]

  @inline def values = js.Array(UPDATE, IGNORE)
}

@js.native
sealed trait RegistrationStatus extends js.Any
object RegistrationStatus {
  val Registered = "Registered".asInstanceOf[RegistrationStatus]
  val Deregistered = "Deregistered".asInstanceOf[RegistrationStatus]

  @inline def values = js.Array(Registered, Deregistered)
}

@js.native
sealed trait RevisionLocationType extends js.Any
object RevisionLocationType {
  val S3 = "S3".asInstanceOf[RevisionLocationType]
  val GitHub = "GitHub".asInstanceOf[RevisionLocationType]
  val String = "String".asInstanceOf[RevisionLocationType]
  val AppSpecContent = "AppSpecContent".asInstanceOf[RevisionLocationType]

  @inline def values = js.Array(S3, GitHub, String, AppSpecContent)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ascending = "ascending".asInstanceOf[SortOrder]
  val descending = "descending".asInstanceOf[SortOrder]

  @inline def values = js.Array(ascending, descending)
}

@js.native
sealed trait StopStatus extends js.Any
object StopStatus {
  val Pending = "Pending".asInstanceOf[StopStatus]
  val Succeeded = "Succeeded".asInstanceOf[StopStatus]

  @inline def values = js.Array(Pending, Succeeded)
}

@js.native
sealed trait TagFilterType extends js.Any
object TagFilterType {
  val KEY_ONLY = "KEY_ONLY".asInstanceOf[TagFilterType]
  val VALUE_ONLY = "VALUE_ONLY".asInstanceOf[TagFilterType]
  val KEY_AND_VALUE = "KEY_AND_VALUE".asInstanceOf[TagFilterType]

  @inline def values = js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
}

@js.native
sealed trait TargetFilterName extends js.Any
object TargetFilterName {
  val TargetStatus = "TargetStatus".asInstanceOf[TargetFilterName]
  val ServerInstanceLabel = "ServerInstanceLabel".asInstanceOf[TargetFilterName]

  @inline def values = js.Array(TargetStatus, ServerInstanceLabel)
}

@js.native
sealed trait TargetLabel extends js.Any
object TargetLabel {
  val Blue = "Blue".asInstanceOf[TargetLabel]
  val Green = "Green".asInstanceOf[TargetLabel]

  @inline def values = js.Array(Blue, Green)
}

@js.native
sealed trait TargetStatus extends js.Any
object TargetStatus {
  val Pending = "Pending".asInstanceOf[TargetStatus]
  val InProgress = "InProgress".asInstanceOf[TargetStatus]
  val Succeeded = "Succeeded".asInstanceOf[TargetStatus]
  val Failed = "Failed".asInstanceOf[TargetStatus]
  val Skipped = "Skipped".asInstanceOf[TargetStatus]
  val Unknown = "Unknown".asInstanceOf[TargetStatus]
  val Ready = "Ready".asInstanceOf[TargetStatus]

  @inline def values = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
}

@js.native
sealed trait TrafficRoutingType extends js.Any
object TrafficRoutingType {
  val TimeBasedCanary = "TimeBasedCanary".asInstanceOf[TrafficRoutingType]
  val TimeBasedLinear = "TimeBasedLinear".asInstanceOf[TrafficRoutingType]
  val AllAtOnce = "AllAtOnce".asInstanceOf[TrafficRoutingType]

  @inline def values = js.Array(TimeBasedCanary, TimeBasedLinear, AllAtOnce)
}

@js.native
sealed trait TriggerEventType extends js.Any
object TriggerEventType {
  val DeploymentStart = "DeploymentStart".asInstanceOf[TriggerEventType]
  val DeploymentSuccess = "DeploymentSuccess".asInstanceOf[TriggerEventType]
  val DeploymentFailure = "DeploymentFailure".asInstanceOf[TriggerEventType]
  val DeploymentStop = "DeploymentStop".asInstanceOf[TriggerEventType]
  val DeploymentRollback = "DeploymentRollback".asInstanceOf[TriggerEventType]
  val DeploymentReady = "DeploymentReady".asInstanceOf[TriggerEventType]
  val InstanceStart = "InstanceStart".asInstanceOf[TriggerEventType]
  val InstanceSuccess = "InstanceSuccess".asInstanceOf[TriggerEventType]
  val InstanceFailure = "InstanceFailure".asInstanceOf[TriggerEventType]
  val InstanceReady = "InstanceReady".asInstanceOf[TriggerEventType]

  @inline def values = js.Array(
    DeploymentStart,
    DeploymentSuccess,
    DeploymentFailure,
    DeploymentStop,
    DeploymentRollback,
    DeploymentReady,
    InstanceStart,
    InstanceSuccess,
    InstanceFailure,
    InstanceReady
  )
}
