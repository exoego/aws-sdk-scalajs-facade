package facade.amazonaws.services.codedeploy

import scalajs._

type ApplicationRevisionSortBy = "registerTime" | "firstUsedTime" | "lastUsedTime"
object ApplicationRevisionSortBy {
  val registerTime: "registerTime" = "registerTime"
  val firstUsedTime: "firstUsedTime" = "firstUsedTime"
  val lastUsedTime: "lastUsedTime" = "lastUsedTime"

  @inline def values = js.Array[ApplicationRevisionSortBy](registerTime, firstUsedTime, lastUsedTime)
}

type AutoRollbackEvent = "DEPLOYMENT_FAILURE" | "DEPLOYMENT_STOP_ON_ALARM" | "DEPLOYMENT_STOP_ON_REQUEST"
object AutoRollbackEvent {
  val DEPLOYMENT_FAILURE: "DEPLOYMENT_FAILURE" = "DEPLOYMENT_FAILURE"
  val DEPLOYMENT_STOP_ON_ALARM: "DEPLOYMENT_STOP_ON_ALARM" = "DEPLOYMENT_STOP_ON_ALARM"
  val DEPLOYMENT_STOP_ON_REQUEST: "DEPLOYMENT_STOP_ON_REQUEST" = "DEPLOYMENT_STOP_ON_REQUEST"

  @inline def values = js.Array[AutoRollbackEvent](DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST)
}

type BundleType = "tar" | "tgz" | "zip" | "YAML" | "JSON"
object BundleType {
  val tar: "tar" = "tar"
  val tgz: "tgz" = "tgz"
  val zip: "zip" = "zip"
  val YAML: "YAML" = "YAML"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[BundleType](tar, tgz, zip, YAML, JSON)
}

type ComputePlatform = "Server" | "Lambda" | "ECS"
object ComputePlatform {
  val Server: "Server" = "Server"
  val Lambda: "Lambda" = "Lambda"
  val ECS: "ECS" = "ECS"

  @inline def values = js.Array[ComputePlatform](Server, Lambda, ECS)
}

type DeploymentCreator = "user" | "autoscaling" | "codeDeployRollback" | "CodeDeploy" | "CodeDeployAutoUpdate" | "CloudFormation" | "CloudFormationRollback"
object DeploymentCreator {
  val user: "user" = "user"
  val autoscaling: "autoscaling" = "autoscaling"
  val codeDeployRollback: "codeDeployRollback" = "codeDeployRollback"
  val CodeDeploy: "CodeDeploy" = "CodeDeploy"
  val CodeDeployAutoUpdate: "CodeDeployAutoUpdate" = "CodeDeployAutoUpdate"
  val CloudFormation: "CloudFormation" = "CloudFormation"
  val CloudFormationRollback: "CloudFormationRollback" = "CloudFormationRollback"

  @inline def values = js.Array[DeploymentCreator](user, autoscaling, codeDeployRollback, CodeDeploy, CodeDeployAutoUpdate, CloudFormation, CloudFormationRollback)
}

type DeploymentOption = "WITH_TRAFFIC_CONTROL" | "WITHOUT_TRAFFIC_CONTROL"
object DeploymentOption {
  val WITH_TRAFFIC_CONTROL: "WITH_TRAFFIC_CONTROL" = "WITH_TRAFFIC_CONTROL"
  val WITHOUT_TRAFFIC_CONTROL: "WITHOUT_TRAFFIC_CONTROL" = "WITHOUT_TRAFFIC_CONTROL"

  @inline def values = js.Array[DeploymentOption](WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL)
}

type DeploymentReadyAction = "CONTINUE_DEPLOYMENT" | "STOP_DEPLOYMENT"
object DeploymentReadyAction {
  val CONTINUE_DEPLOYMENT: "CONTINUE_DEPLOYMENT" = "CONTINUE_DEPLOYMENT"
  val STOP_DEPLOYMENT: "STOP_DEPLOYMENT" = "STOP_DEPLOYMENT"

  @inline def values = js.Array[DeploymentReadyAction](CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT)
}

type DeploymentStatus = "Created" | "Queued" | "InProgress" | "Baking" | "Succeeded" | "Failed" | "Stopped" | "Ready"
object DeploymentStatus {
  val Created: "Created" = "Created"
  val Queued: "Queued" = "Queued"
  val InProgress: "InProgress" = "InProgress"
  val Baking: "Baking" = "Baking"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"
  val Stopped: "Stopped" = "Stopped"
  val Ready: "Ready" = "Ready"

  @inline def values = js.Array[DeploymentStatus](Created, Queued, InProgress, Baking, Succeeded, Failed, Stopped, Ready)
}

type DeploymentTargetType = "InstanceTarget" | "LambdaTarget" | "ECSTarget" | "CloudFormationTarget"
object DeploymentTargetType {
  val InstanceTarget: "InstanceTarget" = "InstanceTarget"
  val LambdaTarget: "LambdaTarget" = "LambdaTarget"
  val ECSTarget: "ECSTarget" = "ECSTarget"
  val CloudFormationTarget: "CloudFormationTarget" = "CloudFormationTarget"

  @inline def values = js.Array[DeploymentTargetType](InstanceTarget, LambdaTarget, ECSTarget, CloudFormationTarget)
}

type DeploymentType = "IN_PLACE" | "BLUE_GREEN"
object DeploymentType {
  val IN_PLACE: "IN_PLACE" = "IN_PLACE"
  val BLUE_GREEN: "BLUE_GREEN" = "BLUE_GREEN"

  @inline def values = js.Array[DeploymentType](IN_PLACE, BLUE_GREEN)
}

type DeploymentWaitType = "READY_WAIT" | "TERMINATION_WAIT"
object DeploymentWaitType {
  val READY_WAIT: "READY_WAIT" = "READY_WAIT"
  val TERMINATION_WAIT: "TERMINATION_WAIT" = "TERMINATION_WAIT"

  @inline def values = js.Array[DeploymentWaitType](READY_WAIT, TERMINATION_WAIT)
}

type EC2TagFilterType = "KEY_ONLY" | "VALUE_ONLY" | "KEY_AND_VALUE"
object EC2TagFilterType {
  val KEY_ONLY: "KEY_ONLY" = "KEY_ONLY"
  val VALUE_ONLY: "VALUE_ONLY" = "VALUE_ONLY"
  val KEY_AND_VALUE: "KEY_AND_VALUE" = "KEY_AND_VALUE"

  @inline def values = js.Array[EC2TagFilterType](KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
}

type ErrorCode = "AGENT_ISSUE" | "ALARM_ACTIVE" | "APPLICATION_MISSING" | "AUTOSCALING_VALIDATION_ERROR" | "AUTO_SCALING_CONFIGURATION" | "AUTO_SCALING_IAM_ROLE_PERMISSIONS" | "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND" | "CUSTOMER_APPLICATION_UNHEALTHY" | "DEPLOYMENT_GROUP_MISSING" | "ECS_UPDATE_ERROR" | "ELASTIC_LOAD_BALANCING_INVALID" | "ELB_INVALID_INSTANCE" | "HEALTH_CONSTRAINTS" | "HEALTH_CONSTRAINTS_INVALID" | "HOOK_EXECUTION_FAILURE" | "IAM_ROLE_MISSING" | "IAM_ROLE_PERMISSIONS" | "INTERNAL_ERROR" | "INVALID_ECS_SERVICE" | "INVALID_LAMBDA_CONFIGURATION" | "INVALID_LAMBDA_FUNCTION" | "INVALID_REVISION" | "MANUAL_STOP" | "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" | "MISSING_ELB_INFORMATION" | "MISSING_GITHUB_TOKEN" | "NO_EC2_SUBSCRIPTION" | "NO_INSTANCES" | "OVER_MAX_INSTANCES" | "RESOURCE_LIMIT_EXCEEDED" | "REVISION_MISSING" | "THROTTLED" | "TIMEOUT" | "CLOUDFORMATION_STACK_FAILURE"
object ErrorCode {
  val AGENT_ISSUE: "AGENT_ISSUE" = "AGENT_ISSUE"
  val ALARM_ACTIVE: "ALARM_ACTIVE" = "ALARM_ACTIVE"
  val APPLICATION_MISSING: "APPLICATION_MISSING" = "APPLICATION_MISSING"
  val AUTOSCALING_VALIDATION_ERROR: "AUTOSCALING_VALIDATION_ERROR" = "AUTOSCALING_VALIDATION_ERROR"
  val AUTO_SCALING_CONFIGURATION: "AUTO_SCALING_CONFIGURATION" = "AUTO_SCALING_CONFIGURATION"
  val AUTO_SCALING_IAM_ROLE_PERMISSIONS: "AUTO_SCALING_IAM_ROLE_PERMISSIONS" = "AUTO_SCALING_IAM_ROLE_PERMISSIONS"
  val CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND: "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND" = "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND"
  val CUSTOMER_APPLICATION_UNHEALTHY: "CUSTOMER_APPLICATION_UNHEALTHY" = "CUSTOMER_APPLICATION_UNHEALTHY"
  val DEPLOYMENT_GROUP_MISSING: "DEPLOYMENT_GROUP_MISSING" = "DEPLOYMENT_GROUP_MISSING"
  val ECS_UPDATE_ERROR: "ECS_UPDATE_ERROR" = "ECS_UPDATE_ERROR"
  val ELASTIC_LOAD_BALANCING_INVALID: "ELASTIC_LOAD_BALANCING_INVALID" = "ELASTIC_LOAD_BALANCING_INVALID"
  val ELB_INVALID_INSTANCE: "ELB_INVALID_INSTANCE" = "ELB_INVALID_INSTANCE"
  val HEALTH_CONSTRAINTS: "HEALTH_CONSTRAINTS" = "HEALTH_CONSTRAINTS"
  val HEALTH_CONSTRAINTS_INVALID: "HEALTH_CONSTRAINTS_INVALID" = "HEALTH_CONSTRAINTS_INVALID"
  val HOOK_EXECUTION_FAILURE: "HOOK_EXECUTION_FAILURE" = "HOOK_EXECUTION_FAILURE"
  val IAM_ROLE_MISSING: "IAM_ROLE_MISSING" = "IAM_ROLE_MISSING"
  val IAM_ROLE_PERMISSIONS: "IAM_ROLE_PERMISSIONS" = "IAM_ROLE_PERMISSIONS"
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val INVALID_ECS_SERVICE: "INVALID_ECS_SERVICE" = "INVALID_ECS_SERVICE"
  val INVALID_LAMBDA_CONFIGURATION: "INVALID_LAMBDA_CONFIGURATION" = "INVALID_LAMBDA_CONFIGURATION"
  val INVALID_LAMBDA_FUNCTION: "INVALID_LAMBDA_FUNCTION" = "INVALID_LAMBDA_FUNCTION"
  val INVALID_REVISION: "INVALID_REVISION" = "INVALID_REVISION"
  val MANUAL_STOP: "MANUAL_STOP" = "MANUAL_STOP"
  val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION: "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" = "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION"
  val MISSING_ELB_INFORMATION: "MISSING_ELB_INFORMATION" = "MISSING_ELB_INFORMATION"
  val MISSING_GITHUB_TOKEN: "MISSING_GITHUB_TOKEN" = "MISSING_GITHUB_TOKEN"
  val NO_EC2_SUBSCRIPTION: "NO_EC2_SUBSCRIPTION" = "NO_EC2_SUBSCRIPTION"
  val NO_INSTANCES: "NO_INSTANCES" = "NO_INSTANCES"
  val OVER_MAX_INSTANCES: "OVER_MAX_INSTANCES" = "OVER_MAX_INSTANCES"
  val RESOURCE_LIMIT_EXCEEDED: "RESOURCE_LIMIT_EXCEEDED" = "RESOURCE_LIMIT_EXCEEDED"
  val REVISION_MISSING: "REVISION_MISSING" = "REVISION_MISSING"
  val THROTTLED: "THROTTLED" = "THROTTLED"
  val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  val CLOUDFORMATION_STACK_FAILURE: "CLOUDFORMATION_STACK_FAILURE" = "CLOUDFORMATION_STACK_FAILURE"

  @inline def values = js.Array[ErrorCode](
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

type FileExistsBehavior = "DISALLOW" | "OVERWRITE" | "RETAIN"
object FileExistsBehavior {
  val DISALLOW: "DISALLOW" = "DISALLOW"
  val OVERWRITE: "OVERWRITE" = "OVERWRITE"
  val RETAIN: "RETAIN" = "RETAIN"

  @inline def values = js.Array[FileExistsBehavior](DISALLOW, OVERWRITE, RETAIN)
}

type GreenFleetProvisioningAction = "DISCOVER_EXISTING" | "COPY_AUTO_SCALING_GROUP"
object GreenFleetProvisioningAction {
  val DISCOVER_EXISTING: "DISCOVER_EXISTING" = "DISCOVER_EXISTING"
  val COPY_AUTO_SCALING_GROUP: "COPY_AUTO_SCALING_GROUP" = "COPY_AUTO_SCALING_GROUP"

  @inline def values = js.Array[GreenFleetProvisioningAction](DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP)
}

type InstanceAction = "TERMINATE" | "KEEP_ALIVE"
object InstanceAction {
  val TERMINATE: "TERMINATE" = "TERMINATE"
  val KEEP_ALIVE: "KEEP_ALIVE" = "KEEP_ALIVE"

  @inline def values = js.Array[InstanceAction](TERMINATE, KEEP_ALIVE)
}

@deprecated("InstanceStatus is deprecated, use TargetStatus instead.", "forever")
type InstanceStatus = "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready"
object InstanceStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"
  val Skipped: "Skipped" = "Skipped"
  val Unknown: "Unknown" = "Unknown"
  val Ready: "Ready" = "Ready"

  @inline def values = js.Array[InstanceStatus](Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
}

type InstanceType = "Blue" | "Green"
object InstanceType {
  val Blue: "Blue" = "Blue"
  val Green: "Green" = "Green"

  @inline def values = js.Array[InstanceType](Blue, Green)
}

type LifecycleErrorCode = "Success" | "ScriptMissing" | "ScriptNotExecutable" | "ScriptTimedOut" | "ScriptFailed" | "UnknownError"
object LifecycleErrorCode {
  val Success: "Success" = "Success"
  val ScriptMissing: "ScriptMissing" = "ScriptMissing"
  val ScriptNotExecutable: "ScriptNotExecutable" = "ScriptNotExecutable"
  val ScriptTimedOut: "ScriptTimedOut" = "ScriptTimedOut"
  val ScriptFailed: "ScriptFailed" = "ScriptFailed"
  val UnknownError: "UnknownError" = "UnknownError"

  @inline def values = js.Array[LifecycleErrorCode](Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
}

type LifecycleEventStatus = "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown"
object LifecycleEventStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"
  val Skipped: "Skipped" = "Skipped"
  val Unknown: "Unknown" = "Unknown"

  @inline def values = js.Array[LifecycleEventStatus](Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
}

type ListStateFilterAction = "include" | "exclude" | "ignore"
object ListStateFilterAction {
  val include: "include" = "include"
  val exclude: "exclude" = "exclude"
  val ignore: "ignore" = "ignore"

  @inline def values = js.Array[ListStateFilterAction](include, exclude, ignore)
}

type MinimumHealthyHostsType = "HOST_COUNT" | "FLEET_PERCENT"
object MinimumHealthyHostsType {
  val HOST_COUNT: "HOST_COUNT" = "HOST_COUNT"
  val FLEET_PERCENT: "FLEET_PERCENT" = "FLEET_PERCENT"

  @inline def values = js.Array[MinimumHealthyHostsType](HOST_COUNT, FLEET_PERCENT)
}

type OutdatedInstancesStrategy = "UPDATE" | "IGNORE"
object OutdatedInstancesStrategy {
  val UPDATE: "UPDATE" = "UPDATE"
  val IGNORE: "IGNORE" = "IGNORE"

  @inline def values = js.Array[OutdatedInstancesStrategy](UPDATE, IGNORE)
}

type RegistrationStatus = "Registered" | "Deregistered"
object RegistrationStatus {
  val Registered: "Registered" = "Registered"
  val Deregistered: "Deregistered" = "Deregistered"

  @inline def values = js.Array[RegistrationStatus](Registered, Deregistered)
}

type RevisionLocationType = "S3" | "GitHub" | "String" | "AppSpecContent"
object RevisionLocationType {
  val S3: "S3" = "S3"
  val GitHub: "GitHub" = "GitHub"
  val String: "String" = "String"
  val AppSpecContent: "AppSpecContent" = "AppSpecContent"

  @inline def values = js.Array[RevisionLocationType](S3, GitHub, String, AppSpecContent)
}

type SortOrder = "ascending" | "descending"
object SortOrder {
  val ascending: "ascending" = "ascending"
  val descending: "descending" = "descending"

  @inline def values = js.Array[SortOrder](ascending, descending)
}

type StopStatus = "Pending" | "Succeeded"
object StopStatus {
  val Pending: "Pending" = "Pending"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[StopStatus](Pending, Succeeded)
}

type TagFilterType = "KEY_ONLY" | "VALUE_ONLY" | "KEY_AND_VALUE"
object TagFilterType {
  val KEY_ONLY: "KEY_ONLY" = "KEY_ONLY"
  val VALUE_ONLY: "VALUE_ONLY" = "VALUE_ONLY"
  val KEY_AND_VALUE: "KEY_AND_VALUE" = "KEY_AND_VALUE"

  @inline def values = js.Array[TagFilterType](KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
}

type TargetFilterName = "TargetStatus" | "ServerInstanceLabel"
object TargetFilterName {
  val TargetStatus: "TargetStatus" = "TargetStatus"
  val ServerInstanceLabel: "ServerInstanceLabel" = "ServerInstanceLabel"

  @inline def values = js.Array[TargetFilterName](TargetStatus, ServerInstanceLabel)
}

type TargetLabel = "Blue" | "Green"
object TargetLabel {
  val Blue: "Blue" = "Blue"
  val Green: "Green" = "Green"

  @inline def values = js.Array[TargetLabel](Blue, Green)
}

type TargetStatus = "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready"
object TargetStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"
  val Skipped: "Skipped" = "Skipped"
  val Unknown: "Unknown" = "Unknown"
  val Ready: "Ready" = "Ready"

  @inline def values = js.Array[TargetStatus](Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
}

type TrafficRoutingType = "TimeBasedCanary" | "TimeBasedLinear" | "AllAtOnce"
object TrafficRoutingType {
  val TimeBasedCanary: "TimeBasedCanary" = "TimeBasedCanary"
  val TimeBasedLinear: "TimeBasedLinear" = "TimeBasedLinear"
  val AllAtOnce: "AllAtOnce" = "AllAtOnce"

  @inline def values = js.Array[TrafficRoutingType](TimeBasedCanary, TimeBasedLinear, AllAtOnce)
}

type TriggerEventType = "DeploymentStart" | "DeploymentSuccess" | "DeploymentFailure" | "DeploymentStop" | "DeploymentRollback" | "DeploymentReady" | "InstanceStart" | "InstanceSuccess" | "InstanceFailure" | "InstanceReady"
object TriggerEventType {
  val DeploymentStart: "DeploymentStart" = "DeploymentStart"
  val DeploymentSuccess: "DeploymentSuccess" = "DeploymentSuccess"
  val DeploymentFailure: "DeploymentFailure" = "DeploymentFailure"
  val DeploymentStop: "DeploymentStop" = "DeploymentStop"
  val DeploymentRollback: "DeploymentRollback" = "DeploymentRollback"
  val DeploymentReady: "DeploymentReady" = "DeploymentReady"
  val InstanceStart: "InstanceStart" = "InstanceStart"
  val InstanceSuccess: "InstanceSuccess" = "InstanceSuccess"
  val InstanceFailure: "InstanceFailure" = "InstanceFailure"
  val InstanceReady: "InstanceReady" = "InstanceReady"

  @inline def values = js.Array[TriggerEventType](
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
