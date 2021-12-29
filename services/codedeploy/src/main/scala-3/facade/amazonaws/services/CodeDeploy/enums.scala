package facade.amazonaws.services.codedeploy

import scalajs._

type ApplicationRevisionSortBy = "registerTime" | "firstUsedTime" | "lastUsedTime"
object ApplicationRevisionSortBy {
  inline val registerTime: "registerTime" = "registerTime"
  inline val firstUsedTime: "firstUsedTime" = "firstUsedTime"
  inline val lastUsedTime: "lastUsedTime" = "lastUsedTime"

  inline def values: js.Array[ApplicationRevisionSortBy] = js.Array(registerTime, firstUsedTime, lastUsedTime)
}

type AutoRollbackEvent = "DEPLOYMENT_FAILURE" | "DEPLOYMENT_STOP_ON_ALARM" | "DEPLOYMENT_STOP_ON_REQUEST"
object AutoRollbackEvent {
  inline val DEPLOYMENT_FAILURE: "DEPLOYMENT_FAILURE" = "DEPLOYMENT_FAILURE"
  inline val DEPLOYMENT_STOP_ON_ALARM: "DEPLOYMENT_STOP_ON_ALARM" = "DEPLOYMENT_STOP_ON_ALARM"
  inline val DEPLOYMENT_STOP_ON_REQUEST: "DEPLOYMENT_STOP_ON_REQUEST" = "DEPLOYMENT_STOP_ON_REQUEST"

  inline def values: js.Array[AutoRollbackEvent] = js.Array(DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST)
}

type BundleType = "tar" | "tgz" | "zip" | "YAML" | "JSON"
object BundleType {
  inline val tar: "tar" = "tar"
  inline val tgz: "tgz" = "tgz"
  inline val zip: "zip" = "zip"
  inline val YAML: "YAML" = "YAML"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[BundleType] = js.Array(tar, tgz, zip, YAML, JSON)
}

type ComputePlatform = "Server" | "Lambda" | "ECS"
object ComputePlatform {
  inline val Server: "Server" = "Server"
  inline val Lambda: "Lambda" = "Lambda"
  inline val ECS: "ECS" = "ECS"

  inline def values: js.Array[ComputePlatform] = js.Array(Server, Lambda, ECS)
}

type DeploymentCreator = "user" | "autoscaling" | "codeDeployRollback" | "CodeDeploy" | "CodeDeployAutoUpdate" | "CloudFormation" | "CloudFormationRollback"
object DeploymentCreator {
  inline val user: "user" = "user"
  inline val autoscaling: "autoscaling" = "autoscaling"
  inline val codeDeployRollback: "codeDeployRollback" = "codeDeployRollback"
  inline val CodeDeploy: "CodeDeploy" = "CodeDeploy"
  inline val CodeDeployAutoUpdate: "CodeDeployAutoUpdate" = "CodeDeployAutoUpdate"
  inline val CloudFormation: "CloudFormation" = "CloudFormation"
  inline val CloudFormationRollback: "CloudFormationRollback" = "CloudFormationRollback"

  inline def values: js.Array[DeploymentCreator] = js.Array(user, autoscaling, codeDeployRollback, CodeDeploy, CodeDeployAutoUpdate, CloudFormation, CloudFormationRollback)
}

type DeploymentOption = "WITH_TRAFFIC_CONTROL" | "WITHOUT_TRAFFIC_CONTROL"
object DeploymentOption {
  inline val WITH_TRAFFIC_CONTROL: "WITH_TRAFFIC_CONTROL" = "WITH_TRAFFIC_CONTROL"
  inline val WITHOUT_TRAFFIC_CONTROL: "WITHOUT_TRAFFIC_CONTROL" = "WITHOUT_TRAFFIC_CONTROL"

  inline def values: js.Array[DeploymentOption] = js.Array(WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL)
}

type DeploymentReadyAction = "CONTINUE_DEPLOYMENT" | "STOP_DEPLOYMENT"
object DeploymentReadyAction {
  inline val CONTINUE_DEPLOYMENT: "CONTINUE_DEPLOYMENT" = "CONTINUE_DEPLOYMENT"
  inline val STOP_DEPLOYMENT: "STOP_DEPLOYMENT" = "STOP_DEPLOYMENT"

  inline def values: js.Array[DeploymentReadyAction] = js.Array(CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT)
}

type DeploymentStatus = "Created" | "Queued" | "InProgress" | "Baking" | "Succeeded" | "Failed" | "Stopped" | "Ready"
object DeploymentStatus {
  inline val Created: "Created" = "Created"
  inline val Queued: "Queued" = "Queued"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Baking: "Baking" = "Baking"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Ready: "Ready" = "Ready"

  inline def values: js.Array[DeploymentStatus] = js.Array(Created, Queued, InProgress, Baking, Succeeded, Failed, Stopped, Ready)
}

type DeploymentTargetType = "InstanceTarget" | "LambdaTarget" | "ECSTarget" | "CloudFormationTarget"
object DeploymentTargetType {
  inline val InstanceTarget: "InstanceTarget" = "InstanceTarget"
  inline val LambdaTarget: "LambdaTarget" = "LambdaTarget"
  inline val ECSTarget: "ECSTarget" = "ECSTarget"
  inline val CloudFormationTarget: "CloudFormationTarget" = "CloudFormationTarget"

  inline def values: js.Array[DeploymentTargetType] = js.Array(InstanceTarget, LambdaTarget, ECSTarget, CloudFormationTarget)
}

type DeploymentType = "IN_PLACE" | "BLUE_GREEN"
object DeploymentType {
  inline val IN_PLACE: "IN_PLACE" = "IN_PLACE"
  inline val BLUE_GREEN: "BLUE_GREEN" = "BLUE_GREEN"

  inline def values: js.Array[DeploymentType] = js.Array(IN_PLACE, BLUE_GREEN)
}

type DeploymentWaitType = "READY_WAIT" | "TERMINATION_WAIT"
object DeploymentWaitType {
  inline val READY_WAIT: "READY_WAIT" = "READY_WAIT"
  inline val TERMINATION_WAIT: "TERMINATION_WAIT" = "TERMINATION_WAIT"

  inline def values: js.Array[DeploymentWaitType] = js.Array(READY_WAIT, TERMINATION_WAIT)
}

type EC2TagFilterType = "KEY_ONLY" | "VALUE_ONLY" | "KEY_AND_VALUE"
object EC2TagFilterType {
  inline val KEY_ONLY: "KEY_ONLY" = "KEY_ONLY"
  inline val VALUE_ONLY: "VALUE_ONLY" = "VALUE_ONLY"
  inline val KEY_AND_VALUE: "KEY_AND_VALUE" = "KEY_AND_VALUE"

  inline def values: js.Array[EC2TagFilterType] = js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
}

type ErrorCode = "AGENT_ISSUE" | "ALARM_ACTIVE" | "APPLICATION_MISSING" | "AUTOSCALING_VALIDATION_ERROR" | "AUTO_SCALING_CONFIGURATION" | "AUTO_SCALING_IAM_ROLE_PERMISSIONS" | "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND" | "CUSTOMER_APPLICATION_UNHEALTHY" | "DEPLOYMENT_GROUP_MISSING" | "ECS_UPDATE_ERROR" | "ELASTIC_LOAD_BALANCING_INVALID" | "ELB_INVALID_INSTANCE" | "HEALTH_CONSTRAINTS" | "HEALTH_CONSTRAINTS_INVALID" | "HOOK_EXECUTION_FAILURE" | "IAM_ROLE_MISSING" | "IAM_ROLE_PERMISSIONS" | "INTERNAL_ERROR" | "INVALID_ECS_SERVICE" | "INVALID_LAMBDA_CONFIGURATION" | "INVALID_LAMBDA_FUNCTION" | "INVALID_REVISION" | "MANUAL_STOP" | "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" | "MISSING_ELB_INFORMATION" | "MISSING_GITHUB_TOKEN" | "NO_EC2_SUBSCRIPTION" | "NO_INSTANCES" | "OVER_MAX_INSTANCES" | "RESOURCE_LIMIT_EXCEEDED" | "REVISION_MISSING" | "THROTTLED" | "TIMEOUT" | "CLOUDFORMATION_STACK_FAILURE"
object ErrorCode {
  inline val AGENT_ISSUE: "AGENT_ISSUE" = "AGENT_ISSUE"
  inline val ALARM_ACTIVE: "ALARM_ACTIVE" = "ALARM_ACTIVE"
  inline val APPLICATION_MISSING: "APPLICATION_MISSING" = "APPLICATION_MISSING"
  inline val AUTOSCALING_VALIDATION_ERROR: "AUTOSCALING_VALIDATION_ERROR" = "AUTOSCALING_VALIDATION_ERROR"
  inline val AUTO_SCALING_CONFIGURATION: "AUTO_SCALING_CONFIGURATION" = "AUTO_SCALING_CONFIGURATION"
  inline val AUTO_SCALING_IAM_ROLE_PERMISSIONS: "AUTO_SCALING_IAM_ROLE_PERMISSIONS" = "AUTO_SCALING_IAM_ROLE_PERMISSIONS"
  inline val CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND: "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND" = "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND"
  inline val CUSTOMER_APPLICATION_UNHEALTHY: "CUSTOMER_APPLICATION_UNHEALTHY" = "CUSTOMER_APPLICATION_UNHEALTHY"
  inline val DEPLOYMENT_GROUP_MISSING: "DEPLOYMENT_GROUP_MISSING" = "DEPLOYMENT_GROUP_MISSING"
  inline val ECS_UPDATE_ERROR: "ECS_UPDATE_ERROR" = "ECS_UPDATE_ERROR"
  inline val ELASTIC_LOAD_BALANCING_INVALID: "ELASTIC_LOAD_BALANCING_INVALID" = "ELASTIC_LOAD_BALANCING_INVALID"
  inline val ELB_INVALID_INSTANCE: "ELB_INVALID_INSTANCE" = "ELB_INVALID_INSTANCE"
  inline val HEALTH_CONSTRAINTS: "HEALTH_CONSTRAINTS" = "HEALTH_CONSTRAINTS"
  inline val HEALTH_CONSTRAINTS_INVALID: "HEALTH_CONSTRAINTS_INVALID" = "HEALTH_CONSTRAINTS_INVALID"
  inline val HOOK_EXECUTION_FAILURE: "HOOK_EXECUTION_FAILURE" = "HOOK_EXECUTION_FAILURE"
  inline val IAM_ROLE_MISSING: "IAM_ROLE_MISSING" = "IAM_ROLE_MISSING"
  inline val IAM_ROLE_PERMISSIONS: "IAM_ROLE_PERMISSIONS" = "IAM_ROLE_PERMISSIONS"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val INVALID_ECS_SERVICE: "INVALID_ECS_SERVICE" = "INVALID_ECS_SERVICE"
  inline val INVALID_LAMBDA_CONFIGURATION: "INVALID_LAMBDA_CONFIGURATION" = "INVALID_LAMBDA_CONFIGURATION"
  inline val INVALID_LAMBDA_FUNCTION: "INVALID_LAMBDA_FUNCTION" = "INVALID_LAMBDA_FUNCTION"
  inline val INVALID_REVISION: "INVALID_REVISION" = "INVALID_REVISION"
  inline val MANUAL_STOP: "MANUAL_STOP" = "MANUAL_STOP"
  inline val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION: "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" = "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION"
  inline val MISSING_ELB_INFORMATION: "MISSING_ELB_INFORMATION" = "MISSING_ELB_INFORMATION"
  inline val MISSING_GITHUB_TOKEN: "MISSING_GITHUB_TOKEN" = "MISSING_GITHUB_TOKEN"
  inline val NO_EC2_SUBSCRIPTION: "NO_EC2_SUBSCRIPTION" = "NO_EC2_SUBSCRIPTION"
  inline val NO_INSTANCES: "NO_INSTANCES" = "NO_INSTANCES"
  inline val OVER_MAX_INSTANCES: "OVER_MAX_INSTANCES" = "OVER_MAX_INSTANCES"
  inline val RESOURCE_LIMIT_EXCEEDED: "RESOURCE_LIMIT_EXCEEDED" = "RESOURCE_LIMIT_EXCEEDED"
  inline val REVISION_MISSING: "REVISION_MISSING" = "REVISION_MISSING"
  inline val THROTTLED: "THROTTLED" = "THROTTLED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  inline val CLOUDFORMATION_STACK_FAILURE: "CLOUDFORMATION_STACK_FAILURE" = "CLOUDFORMATION_STACK_FAILURE"

  inline def values: js.Array[ErrorCode] = js.Array(
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
  inline val DISALLOW: "DISALLOW" = "DISALLOW"
  inline val OVERWRITE: "OVERWRITE" = "OVERWRITE"
  inline val RETAIN: "RETAIN" = "RETAIN"

  inline def values: js.Array[FileExistsBehavior] = js.Array(DISALLOW, OVERWRITE, RETAIN)
}

type GreenFleetProvisioningAction = "DISCOVER_EXISTING" | "COPY_AUTO_SCALING_GROUP"
object GreenFleetProvisioningAction {
  inline val DISCOVER_EXISTING: "DISCOVER_EXISTING" = "DISCOVER_EXISTING"
  inline val COPY_AUTO_SCALING_GROUP: "COPY_AUTO_SCALING_GROUP" = "COPY_AUTO_SCALING_GROUP"

  inline def values: js.Array[GreenFleetProvisioningAction] = js.Array(DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP)
}

type InstanceAction = "TERMINATE" | "KEEP_ALIVE"
object InstanceAction {
  inline val TERMINATE: "TERMINATE" = "TERMINATE"
  inline val KEEP_ALIVE: "KEEP_ALIVE" = "KEEP_ALIVE"

  inline def values: js.Array[InstanceAction] = js.Array(TERMINATE, KEEP_ALIVE)
}

@deprecated("InstanceStatus is deprecated, use TargetStatus instead.", "forever")
type InstanceStatus = "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready"
object InstanceStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"
  inline val Skipped: "Skipped" = "Skipped"
  inline val Unknown: "Unknown" = "Unknown"
  inline val Ready: "Ready" = "Ready"

  inline def values: js.Array[InstanceStatus] = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
}

type InstanceType = "Blue" | "Green"
object InstanceType {
  inline val Blue: "Blue" = "Blue"
  inline val Green: "Green" = "Green"

  inline def values: js.Array[InstanceType] = js.Array(Blue, Green)
}

type LifecycleErrorCode = "Success" | "ScriptMissing" | "ScriptNotExecutable" | "ScriptTimedOut" | "ScriptFailed" | "UnknownError"
object LifecycleErrorCode {
  inline val Success: "Success" = "Success"
  inline val ScriptMissing: "ScriptMissing" = "ScriptMissing"
  inline val ScriptNotExecutable: "ScriptNotExecutable" = "ScriptNotExecutable"
  inline val ScriptTimedOut: "ScriptTimedOut" = "ScriptTimedOut"
  inline val ScriptFailed: "ScriptFailed" = "ScriptFailed"
  inline val UnknownError: "UnknownError" = "UnknownError"

  inline def values: js.Array[LifecycleErrorCode] = js.Array(Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
}

type LifecycleEventStatus = "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown"
object LifecycleEventStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"
  inline val Skipped: "Skipped" = "Skipped"
  inline val Unknown: "Unknown" = "Unknown"

  inline def values: js.Array[LifecycleEventStatus] = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
}

type ListStateFilterAction = "include" | "exclude" | "ignore"
object ListStateFilterAction {
  inline val include: "include" = "include"
  inline val exclude: "exclude" = "exclude"
  inline val ignore: "ignore" = "ignore"

  inline def values: js.Array[ListStateFilterAction] = js.Array(include, exclude, ignore)
}

type MinimumHealthyHostsType = "HOST_COUNT" | "FLEET_PERCENT"
object MinimumHealthyHostsType {
  inline val HOST_COUNT: "HOST_COUNT" = "HOST_COUNT"
  inline val FLEET_PERCENT: "FLEET_PERCENT" = "FLEET_PERCENT"

  inline def values: js.Array[MinimumHealthyHostsType] = js.Array(HOST_COUNT, FLEET_PERCENT)
}

type OutdatedInstancesStrategy = "UPDATE" | "IGNORE"
object OutdatedInstancesStrategy {
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val IGNORE: "IGNORE" = "IGNORE"

  inline def values: js.Array[OutdatedInstancesStrategy] = js.Array(UPDATE, IGNORE)
}

type RegistrationStatus = "Registered" | "Deregistered"
object RegistrationStatus {
  inline val Registered: "Registered" = "Registered"
  inline val Deregistered: "Deregistered" = "Deregistered"

  inline def values: js.Array[RegistrationStatus] = js.Array(Registered, Deregistered)
}

type RevisionLocationType = "S3" | "GitHub" | "String" | "AppSpecContent"
object RevisionLocationType {
  inline val S3: "S3" = "S3"
  inline val GitHub: "GitHub" = "GitHub"
  inline val String: "String" = "String"
  inline val AppSpecContent: "AppSpecContent" = "AppSpecContent"

  inline def values: js.Array[RevisionLocationType] = js.Array(S3, GitHub, String, AppSpecContent)
}

type SortOrder = "ascending" | "descending"
object SortOrder {
  inline val ascending: "ascending" = "ascending"
  inline val descending: "descending" = "descending"

  inline def values: js.Array[SortOrder] = js.Array(ascending, descending)
}

type StopStatus = "Pending" | "Succeeded"
object StopStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[StopStatus] = js.Array(Pending, Succeeded)
}

type TagFilterType = "KEY_ONLY" | "VALUE_ONLY" | "KEY_AND_VALUE"
object TagFilterType {
  inline val KEY_ONLY: "KEY_ONLY" = "KEY_ONLY"
  inline val VALUE_ONLY: "VALUE_ONLY" = "VALUE_ONLY"
  inline val KEY_AND_VALUE: "KEY_AND_VALUE" = "KEY_AND_VALUE"

  inline def values: js.Array[TagFilterType] = js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
}

type TargetFilterName = "TargetStatus" | "ServerInstanceLabel"
object TargetFilterName {
  inline val TargetStatus: "TargetStatus" = "TargetStatus"
  inline val ServerInstanceLabel: "ServerInstanceLabel" = "ServerInstanceLabel"

  inline def values: js.Array[TargetFilterName] = js.Array(TargetStatus, ServerInstanceLabel)
}

type TargetLabel = "Blue" | "Green"
object TargetLabel {
  inline val Blue: "Blue" = "Blue"
  inline val Green: "Green" = "Green"

  inline def values: js.Array[TargetLabel] = js.Array(Blue, Green)
}

type TargetStatus = "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready"
object TargetStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"
  inline val Skipped: "Skipped" = "Skipped"
  inline val Unknown: "Unknown" = "Unknown"
  inline val Ready: "Ready" = "Ready"

  inline def values: js.Array[TargetStatus] = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
}

type TrafficRoutingType = "TimeBasedCanary" | "TimeBasedLinear" | "AllAtOnce"
object TrafficRoutingType {
  inline val TimeBasedCanary: "TimeBasedCanary" = "TimeBasedCanary"
  inline val TimeBasedLinear: "TimeBasedLinear" = "TimeBasedLinear"
  inline val AllAtOnce: "AllAtOnce" = "AllAtOnce"

  inline def values: js.Array[TrafficRoutingType] = js.Array(TimeBasedCanary, TimeBasedLinear, AllAtOnce)
}

type TriggerEventType = "DeploymentStart" | "DeploymentSuccess" | "DeploymentFailure" | "DeploymentStop" | "DeploymentRollback" | "DeploymentReady" | "InstanceStart" | "InstanceSuccess" | "InstanceFailure" | "InstanceReady"
object TriggerEventType {
  inline val DeploymentStart: "DeploymentStart" = "DeploymentStart"
  inline val DeploymentSuccess: "DeploymentSuccess" = "DeploymentSuccess"
  inline val DeploymentFailure: "DeploymentFailure" = "DeploymentFailure"
  inline val DeploymentStop: "DeploymentStop" = "DeploymentStop"
  inline val DeploymentRollback: "DeploymentRollback" = "DeploymentRollback"
  inline val DeploymentReady: "DeploymentReady" = "DeploymentReady"
  inline val InstanceStart: "InstanceStart" = "InstanceStart"
  inline val InstanceSuccess: "InstanceSuccess" = "InstanceSuccess"
  inline val InstanceFailure: "InstanceFailure" = "InstanceFailure"
  inline val InstanceReady: "InstanceReady" = "InstanceReady"

  inline def values: js.Array[TriggerEventType] = js.Array(
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
