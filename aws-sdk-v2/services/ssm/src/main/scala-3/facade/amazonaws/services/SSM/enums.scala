package facade.amazonaws.services.ssm

import scalajs.js

type AssociationComplianceSeverity = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED"
object AssociationComplianceSeverity {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"
  inline val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  inline def values: js.Array[AssociationComplianceSeverity] = js.Array(CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED)
}

type AssociationExecutionFilterKey = "ExecutionId" | "Status" | "CreatedTime"
object AssociationExecutionFilterKey {
  inline val ExecutionId: "ExecutionId" = "ExecutionId"
  inline val Status: "Status" = "Status"
  inline val CreatedTime: "CreatedTime" = "CreatedTime"

  inline def values: js.Array[AssociationExecutionFilterKey] = js.Array(ExecutionId, Status, CreatedTime)
}

type AssociationExecutionTargetsFilterKey = "Status" | "ResourceId" | "ResourceType"
object AssociationExecutionTargetsFilterKey {
  inline val Status: "Status" = "Status"
  inline val ResourceId: "ResourceId" = "ResourceId"
  inline val ResourceType: "ResourceType" = "ResourceType"

  inline def values: js.Array[AssociationExecutionTargetsFilterKey] = js.Array(Status, ResourceId, ResourceType)
}

type AssociationFilterKey = "InstanceId" | "Name" | "AssociationId" | "AssociationStatusName" | "LastExecutedBefore" | "LastExecutedAfter" | "AssociationName" | "ResourceGroupName"
object AssociationFilterKey {
  inline val InstanceId: "InstanceId" = "InstanceId"
  inline val Name: "Name" = "Name"
  inline val AssociationId: "AssociationId" = "AssociationId"
  inline val AssociationStatusName: "AssociationStatusName" = "AssociationStatusName"
  inline val LastExecutedBefore: "LastExecutedBefore" = "LastExecutedBefore"
  inline val LastExecutedAfter: "LastExecutedAfter" = "LastExecutedAfter"
  inline val AssociationName: "AssociationName" = "AssociationName"
  inline val ResourceGroupName: "ResourceGroupName" = "ResourceGroupName"

  inline def values: js.Array[AssociationFilterKey] = js.Array(InstanceId, Name, AssociationId, AssociationStatusName, LastExecutedBefore, LastExecutedAfter, AssociationName, ResourceGroupName)
}

type AssociationFilterOperatorType = "EQUAL" | "LESS_THAN" | "GREATER_THAN"
object AssociationFilterOperatorType {
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"

  inline def values: js.Array[AssociationFilterOperatorType] = js.Array(EQUAL, LESS_THAN, GREATER_THAN)
}

type AssociationStatusName = "Pending" | "Success" | "Failed"
object AssociationStatusName {
  inline val Pending: "Pending" = "Pending"
  inline val Success: "Success" = "Success"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[AssociationStatusName] = js.Array(Pending, Success, Failed)
}

type AssociationSyncCompliance = "AUTO" | "MANUAL"
object AssociationSyncCompliance {
  inline val AUTO: "AUTO" = "AUTO"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[AssociationSyncCompliance] = js.Array(AUTO, MANUAL)
}

type AttachmentHashType = "Sha256"
object AttachmentHashType {
  inline val Sha256: "Sha256" = "Sha256"

  inline def values: js.Array[AttachmentHashType] = js.Array(Sha256)
}

type AttachmentsSourceKey = "SourceUrl" | "S3FileUrl" | "AttachmentReference"
object AttachmentsSourceKey {
  inline val SourceUrl: "SourceUrl" = "SourceUrl"
  inline val S3FileUrl: "S3FileUrl" = "S3FileUrl"
  inline val AttachmentReference: "AttachmentReference" = "AttachmentReference"

  inline def values: js.Array[AttachmentsSourceKey] = js.Array(SourceUrl, S3FileUrl, AttachmentReference)
}

type AutomationExecutionFilterKey = "DocumentNamePrefix" | "ExecutionStatus" | "ExecutionId" | "ParentExecutionId" | "CurrentAction" | "StartTimeBefore" | "StartTimeAfter" | "AutomationType" | "TagKey" | "TargetResourceGroup" | "AutomationSubtype" | "OpsItemId"
object AutomationExecutionFilterKey {
  inline val DocumentNamePrefix: "DocumentNamePrefix" = "DocumentNamePrefix"
  inline val ExecutionStatus: "ExecutionStatus" = "ExecutionStatus"
  inline val ExecutionId: "ExecutionId" = "ExecutionId"
  inline val ParentExecutionId: "ParentExecutionId" = "ParentExecutionId"
  inline val CurrentAction: "CurrentAction" = "CurrentAction"
  inline val StartTimeBefore: "StartTimeBefore" = "StartTimeBefore"
  inline val StartTimeAfter: "StartTimeAfter" = "StartTimeAfter"
  inline val AutomationType: "AutomationType" = "AutomationType"
  inline val TagKey: "TagKey" = "TagKey"
  inline val TargetResourceGroup: "TargetResourceGroup" = "TargetResourceGroup"
  inline val AutomationSubtype: "AutomationSubtype" = "AutomationSubtype"
  inline val OpsItemId: "OpsItemId" = "OpsItemId"

  inline def values: js.Array[AutomationExecutionFilterKey] = js.Array(
    DocumentNamePrefix,
    ExecutionStatus,
    ExecutionId,
    ParentExecutionId,
    CurrentAction,
    StartTimeBefore,
    StartTimeAfter,
    AutomationType,
    TagKey,
    TargetResourceGroup,
    AutomationSubtype,
    OpsItemId
  )
}

type AutomationExecutionStatus = "Pending" | "InProgress" | "Waiting" | "Success" | "TimedOut" | "Cancelling" | "Cancelled" | "Failed" | "PendingApproval" | "Approved" | "Rejected" | "Scheduled" | "RunbookInProgress" | "PendingChangeCalendarOverride" | "ChangeCalendarOverrideApproved" | "ChangeCalendarOverrideRejected" | "CompletedWithSuccess" | "CompletedWithFailure"
object AutomationExecutionStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Waiting: "Waiting" = "Waiting"
  inline val Success: "Success" = "Success"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Cancelling: "Cancelling" = "Cancelling"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Failed: "Failed" = "Failed"
  inline val PendingApproval: "PendingApproval" = "PendingApproval"
  inline val Approved: "Approved" = "Approved"
  inline val Rejected: "Rejected" = "Rejected"
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val RunbookInProgress: "RunbookInProgress" = "RunbookInProgress"
  inline val PendingChangeCalendarOverride: "PendingChangeCalendarOverride" = "PendingChangeCalendarOverride"
  inline val ChangeCalendarOverrideApproved: "ChangeCalendarOverrideApproved" = "ChangeCalendarOverrideApproved"
  inline val ChangeCalendarOverrideRejected: "ChangeCalendarOverrideRejected" = "ChangeCalendarOverrideRejected"
  inline val CompletedWithSuccess: "CompletedWithSuccess" = "CompletedWithSuccess"
  inline val CompletedWithFailure: "CompletedWithFailure" = "CompletedWithFailure"

  inline def values: js.Array[AutomationExecutionStatus] = js.Array(
    Pending,
    InProgress,
    Waiting,
    Success,
    TimedOut,
    Cancelling,
    Cancelled,
    Failed,
    PendingApproval,
    Approved,
    Rejected,
    Scheduled,
    RunbookInProgress,
    PendingChangeCalendarOverride,
    ChangeCalendarOverrideApproved,
    ChangeCalendarOverrideRejected,
    CompletedWithSuccess,
    CompletedWithFailure
  )
}

type AutomationSubtype = "ChangeRequest"
object AutomationSubtype {
  inline val ChangeRequest: "ChangeRequest" = "ChangeRequest"

  inline def values: js.Array[AutomationSubtype] = js.Array(ChangeRequest)
}

type AutomationType = "CrossAccount" | "Local"
object AutomationType {
  inline val CrossAccount: "CrossAccount" = "CrossAccount"
  inline val Local: "Local" = "Local"

  inline def values: js.Array[AutomationType] = js.Array(CrossAccount, Local)
}

type CalendarState = "OPEN" | "CLOSED"
object CalendarState {
  inline val OPEN: "OPEN" = "OPEN"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[CalendarState] = js.Array(OPEN, CLOSED)
}

type CommandFilterKey = "InvokedAfter" | "InvokedBefore" | "Status" | "ExecutionStage" | "DocumentName"
object CommandFilterKey {
  inline val InvokedAfter: "InvokedAfter" = "InvokedAfter"
  inline val InvokedBefore: "InvokedBefore" = "InvokedBefore"
  inline val Status: "Status" = "Status"
  inline val ExecutionStage: "ExecutionStage" = "ExecutionStage"
  inline val DocumentName: "DocumentName" = "DocumentName"

  inline def values: js.Array[CommandFilterKey] = js.Array(InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName)
}

type CommandInvocationStatus = "Pending" | "InProgress" | "Delayed" | "Success" | "Cancelled" | "TimedOut" | "Failed" | "Cancelling"
object CommandInvocationStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Delayed: "Delayed" = "Delayed"
  inline val Success: "Success" = "Success"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelling: "Cancelling" = "Cancelling"

  inline def values: js.Array[CommandInvocationStatus] = js.Array(Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling)
}

type CommandPluginStatus = "Pending" | "InProgress" | "Success" | "TimedOut" | "Cancelled" | "Failed"
object CommandPluginStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Success: "Success" = "Success"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[CommandPluginStatus] = js.Array(Pending, InProgress, Success, TimedOut, Cancelled, Failed)
}

type CommandStatus = "Pending" | "InProgress" | "Success" | "Cancelled" | "Failed" | "TimedOut" | "Cancelling"
object CommandStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Success: "Success" = "Success"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Failed: "Failed" = "Failed"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Cancelling: "Cancelling" = "Cancelling"

  inline def values: js.Array[CommandStatus] = js.Array(Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling)
}

type ComplianceQueryOperatorType = "EQUAL" | "NOT_EQUAL" | "BEGIN_WITH" | "LESS_THAN" | "GREATER_THAN"
object ComplianceQueryOperatorType {
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val NOT_EQUAL: "NOT_EQUAL" = "NOT_EQUAL"
  inline val BEGIN_WITH: "BEGIN_WITH" = "BEGIN_WITH"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"

  inline def values: js.Array[ComplianceQueryOperatorType] = js.Array(EQUAL, NOT_EQUAL, BEGIN_WITH, LESS_THAN, GREATER_THAN)
}

type ComplianceSeverity = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED"
object ComplianceSeverity {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"
  inline val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  inline val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  inline def values: js.Array[ComplianceSeverity] = js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
}

type ComplianceStatus = "COMPLIANT" | "NON_COMPLIANT"
object ComplianceStatus {
  inline val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  inline val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"

  inline def values: js.Array[ComplianceStatus] = js.Array(COMPLIANT, NON_COMPLIANT)
}

type ComplianceUploadType = "COMPLETE" | "PARTIAL"
object ComplianceUploadType {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val PARTIAL: "PARTIAL" = "PARTIAL"

  inline def values: js.Array[ComplianceUploadType] = js.Array(COMPLETE, PARTIAL)
}

type ConnectionStatus = "Connected" | "NotConnected"
object ConnectionStatus {
  inline val Connected: "Connected" = "Connected"
  inline val NotConnected: "NotConnected" = "NotConnected"

  inline def values: js.Array[ConnectionStatus] = js.Array(Connected, NotConnected)
}

type DescribeActivationsFilterKeys = "ActivationIds" | "DefaultInstanceName" | "IamRole"
object DescribeActivationsFilterKeys {
  inline val ActivationIds: "ActivationIds" = "ActivationIds"
  inline val DefaultInstanceName: "DefaultInstanceName" = "DefaultInstanceName"
  inline val IamRole: "IamRole" = "IamRole"

  inline def values: js.Array[DescribeActivationsFilterKeys] = js.Array(ActivationIds, DefaultInstanceName, IamRole)
}

type DocumentFilterKey = "Name" | "Owner" | "PlatformTypes" | "DocumentType"
object DocumentFilterKey {
  inline val Name: "Name" = "Name"
  inline val Owner: "Owner" = "Owner"
  inline val PlatformTypes: "PlatformTypes" = "PlatformTypes"
  inline val DocumentType: "DocumentType" = "DocumentType"

  inline def values: js.Array[DocumentFilterKey] = js.Array(Name, Owner, PlatformTypes, DocumentType)
}

type DocumentFormat = "YAML" | "JSON" | "TEXT"
object DocumentFormat {
  inline val YAML: "YAML" = "YAML"
  inline val JSON: "JSON" = "JSON"
  inline val TEXT: "TEXT" = "TEXT"

  inline def values: js.Array[DocumentFormat] = js.Array(YAML, JSON, TEXT)
}

type DocumentHashType = "Sha256" | "Sha1"
object DocumentHashType {
  inline val Sha256: "Sha256" = "Sha256"
  inline val Sha1: "Sha1" = "Sha1"

  inline def values: js.Array[DocumentHashType] = js.Array(Sha256, Sha1)
}

type DocumentMetadataEnum = "DocumentReviews"
object DocumentMetadataEnum {
  inline val DocumentReviews: "DocumentReviews" = "DocumentReviews"

  inline def values: js.Array[DocumentMetadataEnum] = js.Array(DocumentReviews)
}

type DocumentParameterType = "String" | "StringList"
object DocumentParameterType {
  inline val String: "String" = "String"
  inline val StringList: "StringList" = "StringList"

  inline def values: js.Array[DocumentParameterType] = js.Array(String, StringList)
}

type DocumentPermissionType = "Share"
object DocumentPermissionType {
  inline val Share: "Share" = "Share"

  inline def values: js.Array[DocumentPermissionType] = js.Array(Share)
}

type DocumentReviewAction = "SendForReview" | "UpdateReview" | "Approve" | "Reject"
object DocumentReviewAction {
  inline val SendForReview: "SendForReview" = "SendForReview"
  inline val UpdateReview: "UpdateReview" = "UpdateReview"
  inline val Approve: "Approve" = "Approve"
  inline val Reject: "Reject" = "Reject"

  inline def values: js.Array[DocumentReviewAction] = js.Array(SendForReview, UpdateReview, Approve, Reject)
}

type DocumentReviewCommentType = "Comment"
object DocumentReviewCommentType {
  inline val Comment: "Comment" = "Comment"

  inline def values: js.Array[DocumentReviewCommentType] = js.Array(Comment)
}

/** The status of a document.
  */
type DocumentStatus = "Creating" | "Active" | "Updating" | "Deleting" | "Failed"
object DocumentStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Active: "Active" = "Active"
  inline val Updating: "Updating" = "Updating"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DocumentStatus] = js.Array(Creating, Active, Updating, Deleting, Failed)
}

type DocumentType = "Command" | "Policy" | "Automation" | "Session" | "Package" | "ApplicationConfiguration" | "ApplicationConfigurationSchema" | "DeploymentStrategy" | "ChangeCalendar" | "Automation.ChangeTemplate" | "ProblemAnalysis" | "ProblemAnalysisTemplate"
object DocumentType {
  inline val Command: "Command" = "Command"
  inline val Policy: "Policy" = "Policy"
  inline val Automation: "Automation" = "Automation"
  inline val Session: "Session" = "Session"
  inline val Package: "Package" = "Package"
  inline val ApplicationConfiguration: "ApplicationConfiguration" = "ApplicationConfiguration"
  inline val ApplicationConfigurationSchema: "ApplicationConfigurationSchema" = "ApplicationConfigurationSchema"
  inline val DeploymentStrategy: "DeploymentStrategy" = "DeploymentStrategy"
  inline val ChangeCalendar: "ChangeCalendar" = "ChangeCalendar"
  inline val `Automation.ChangeTemplate`: "Automation.ChangeTemplate" = "Automation.ChangeTemplate"
  inline val ProblemAnalysis: "ProblemAnalysis" = "ProblemAnalysis"
  inline val ProblemAnalysisTemplate: "ProblemAnalysisTemplate" = "ProblemAnalysisTemplate"

  inline def values: js.Array[DocumentType] = js.Array(
    Command,
    Policy,
    Automation,
    Session,
    Package,
    ApplicationConfiguration,
    ApplicationConfigurationSchema,
    DeploymentStrategy,
    ChangeCalendar,
    `Automation.ChangeTemplate`,
    ProblemAnalysis,
    ProblemAnalysisTemplate
  )
}

type ExecutionMode = "Auto" | "Interactive"
object ExecutionMode {
  inline val Auto: "Auto" = "Auto"
  inline val Interactive: "Interactive" = "Interactive"

  inline def values: js.Array[ExecutionMode] = js.Array(Auto, Interactive)
}

type Fault = "Client" | "Server" | "Unknown"
object Fault {
  inline val Client: "Client" = "Client"
  inline val Server: "Server" = "Server"
  inline val Unknown: "Unknown" = "Unknown"

  inline def values: js.Array[Fault] = js.Array(Client, Server, Unknown)
}

type InstanceInformationFilterKey = "InstanceIds" | "AgentVersion" | "PingStatus" | "PlatformTypes" | "ActivationIds" | "IamRole" | "ResourceType" | "AssociationStatus"
object InstanceInformationFilterKey {
  inline val InstanceIds: "InstanceIds" = "InstanceIds"
  inline val AgentVersion: "AgentVersion" = "AgentVersion"
  inline val PingStatus: "PingStatus" = "PingStatus"
  inline val PlatformTypes: "PlatformTypes" = "PlatformTypes"
  inline val ActivationIds: "ActivationIds" = "ActivationIds"
  inline val IamRole: "IamRole" = "IamRole"
  inline val ResourceType: "ResourceType" = "ResourceType"
  inline val AssociationStatus: "AssociationStatus" = "AssociationStatus"

  inline def values: js.Array[InstanceInformationFilterKey] = js.Array(InstanceIds, AgentVersion, PingStatus, PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus)
}

type InstancePatchStateOperatorType = "Equal" | "NotEqual" | "LessThan" | "GreaterThan"
object InstancePatchStateOperatorType {
  inline val Equal: "Equal" = "Equal"
  inline val NotEqual: "NotEqual" = "NotEqual"
  inline val LessThan: "LessThan" = "LessThan"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"

  inline def values: js.Array[InstancePatchStateOperatorType] = js.Array(Equal, NotEqual, LessThan, GreaterThan)
}

type InventoryAttributeDataType = "string" | "number"
object InventoryAttributeDataType {
  inline val string: "string" = "string"
  inline val number: "number" = "number"

  inline def values: js.Array[InventoryAttributeDataType] = js.Array(string, number)
}

type InventoryDeletionStatus = "InProgress" | "Complete"
object InventoryDeletionStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Complete: "Complete" = "Complete"

  inline def values: js.Array[InventoryDeletionStatus] = js.Array(InProgress, Complete)
}

type InventoryQueryOperatorType = "Equal" | "NotEqual" | "BeginWith" | "LessThan" | "GreaterThan" | "Exists"
object InventoryQueryOperatorType {
  inline val Equal: "Equal" = "Equal"
  inline val NotEqual: "NotEqual" = "NotEqual"
  inline val BeginWith: "BeginWith" = "BeginWith"
  inline val LessThan: "LessThan" = "LessThan"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val Exists: "Exists" = "Exists"

  inline def values: js.Array[InventoryQueryOperatorType] = js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
}

type InventorySchemaDeleteOption = "DisableSchema" | "DeleteSchema"
object InventorySchemaDeleteOption {
  inline val DisableSchema: "DisableSchema" = "DisableSchema"
  inline val DeleteSchema: "DeleteSchema" = "DeleteSchema"

  inline def values: js.Array[InventorySchemaDeleteOption] = js.Array(DisableSchema, DeleteSchema)
}

type LastResourceDataSyncStatus = "Successful" | "Failed" | "InProgress"
object LastResourceDataSyncStatus {
  inline val Successful: "Successful" = "Successful"
  inline val Failed: "Failed" = "Failed"
  inline val InProgress: "InProgress" = "InProgress"

  inline def values: js.Array[LastResourceDataSyncStatus] = js.Array(Successful, Failed, InProgress)
}

type MaintenanceWindowExecutionStatus = "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING"
object MaintenanceWindowExecutionStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val SKIPPED_OVERLAPPING: "SKIPPED_OVERLAPPING" = "SKIPPED_OVERLAPPING"

  inline def values: js.Array[MaintenanceWindowExecutionStatus] = js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING)
}

type MaintenanceWindowResourceType = "INSTANCE" | "RESOURCE_GROUP"
object MaintenanceWindowResourceType {
  inline val INSTANCE: "INSTANCE" = "INSTANCE"
  inline val RESOURCE_GROUP: "RESOURCE_GROUP" = "RESOURCE_GROUP"

  inline def values: js.Array[MaintenanceWindowResourceType] = js.Array(INSTANCE, RESOURCE_GROUP)
}

type MaintenanceWindowTaskCutoffBehavior = "CONTINUE_TASK" | "CANCEL_TASK"
object MaintenanceWindowTaskCutoffBehavior {
  inline val CONTINUE_TASK: "CONTINUE_TASK" = "CONTINUE_TASK"
  inline val CANCEL_TASK: "CANCEL_TASK" = "CANCEL_TASK"

  inline def values: js.Array[MaintenanceWindowTaskCutoffBehavior] = js.Array(CONTINUE_TASK, CANCEL_TASK)
}

type MaintenanceWindowTaskType = "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA"
object MaintenanceWindowTaskType {
  inline val RUN_COMMAND: "RUN_COMMAND" = "RUN_COMMAND"
  inline val AUTOMATION: "AUTOMATION" = "AUTOMATION"
  inline val STEP_FUNCTIONS: "STEP_FUNCTIONS" = "STEP_FUNCTIONS"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"

  inline def values: js.Array[MaintenanceWindowTaskType] = js.Array(RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA)
}

type NotificationEvent = "All" | "InProgress" | "Success" | "TimedOut" | "Cancelled" | "Failed"
object NotificationEvent {
  inline val All: "All" = "All"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Success: "Success" = "Success"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[NotificationEvent] = js.Array(All, InProgress, Success, TimedOut, Cancelled, Failed)
}

type NotificationType = "Command" | "Invocation"
object NotificationType {
  inline val Command: "Command" = "Command"
  inline val Invocation: "Invocation" = "Invocation"

  inline def values: js.Array[NotificationType] = js.Array(Command, Invocation)
}

type OperatingSystem = "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | "ORACLE_LINUX" | "DEBIAN" | "MACOS" | "RASPBIAN"
object OperatingSystem {
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val AMAZON_LINUX: "AMAZON_LINUX" = "AMAZON_LINUX"
  inline val AMAZON_LINUX_2: "AMAZON_LINUX_2" = "AMAZON_LINUX_2"
  inline val UBUNTU: "UBUNTU" = "UBUNTU"
  inline val REDHAT_ENTERPRISE_LINUX: "REDHAT_ENTERPRISE_LINUX" = "REDHAT_ENTERPRISE_LINUX"
  inline val SUSE: "SUSE" = "SUSE"
  inline val CENTOS: "CENTOS" = "CENTOS"
  inline val ORACLE_LINUX: "ORACLE_LINUX" = "ORACLE_LINUX"
  inline val DEBIAN: "DEBIAN" = "DEBIAN"
  inline val MACOS: "MACOS" = "MACOS"
  inline val RASPBIAN: "RASPBIAN" = "RASPBIAN"

  inline def values: js.Array[OperatingSystem] = js.Array(WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN, MACOS, RASPBIAN)
}

type OpsFilterOperatorType = "Equal" | "NotEqual" | "BeginWith" | "LessThan" | "GreaterThan" | "Exists"
object OpsFilterOperatorType {
  inline val Equal: "Equal" = "Equal"
  inline val NotEqual: "NotEqual" = "NotEqual"
  inline val BeginWith: "BeginWith" = "BeginWith"
  inline val LessThan: "LessThan" = "LessThan"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val Exists: "Exists" = "Exists"

  inline def values: js.Array[OpsFilterOperatorType] = js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
}

type OpsItemDataType = "SearchableString" | "String"
object OpsItemDataType {
  inline val SearchableString: "SearchableString" = "SearchableString"
  inline val String: "String" = "String"

  inline def values: js.Array[OpsItemDataType] = js.Array(SearchableString, String)
}

type OpsItemEventFilterKey = "OpsItemId"
object OpsItemEventFilterKey {
  inline val OpsItemId: "OpsItemId" = "OpsItemId"

  inline def values: js.Array[OpsItemEventFilterKey] = js.Array(OpsItemId)
}

type OpsItemEventFilterOperator = "Equal"
object OpsItemEventFilterOperator {
  inline val Equal: "Equal" = "Equal"

  inline def values: js.Array[OpsItemEventFilterOperator] = js.Array(Equal)
}

type OpsItemFilterKey = "Status" | "CreatedBy" | "Source" | "Priority" | "Title" | "OpsItemId" | "CreatedTime" | "LastModifiedTime" | "ActualStartTime" | "ActualEndTime" | "PlannedStartTime" | "PlannedEndTime" | "OperationalData" | "OperationalDataKey" | "OperationalDataValue" | "ResourceId" | "AutomationId" | "Category" | "Severity" | "OpsItemType" | "ChangeRequestByRequesterArn" | "ChangeRequestByRequesterName" | "ChangeRequestByApproverArn" | "ChangeRequestByApproverName" | "ChangeRequestByTemplate" | "ChangeRequestByTargetsResourceGroup" | "InsightByType"
object OpsItemFilterKey {
  inline val Status: "Status" = "Status"
  inline val CreatedBy: "CreatedBy" = "CreatedBy"
  inline val Source: "Source" = "Source"
  inline val Priority: "Priority" = "Priority"
  inline val Title: "Title" = "Title"
  inline val OpsItemId: "OpsItemId" = "OpsItemId"
  inline val CreatedTime: "CreatedTime" = "CreatedTime"
  inline val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"
  inline val ActualStartTime: "ActualStartTime" = "ActualStartTime"
  inline val ActualEndTime: "ActualEndTime" = "ActualEndTime"
  inline val PlannedStartTime: "PlannedStartTime" = "PlannedStartTime"
  inline val PlannedEndTime: "PlannedEndTime" = "PlannedEndTime"
  inline val OperationalData: "OperationalData" = "OperationalData"
  inline val OperationalDataKey: "OperationalDataKey" = "OperationalDataKey"
  inline val OperationalDataValue: "OperationalDataValue" = "OperationalDataValue"
  inline val ResourceId: "ResourceId" = "ResourceId"
  inline val AutomationId: "AutomationId" = "AutomationId"
  inline val Category: "Category" = "Category"
  inline val Severity: "Severity" = "Severity"
  inline val OpsItemType: "OpsItemType" = "OpsItemType"
  inline val ChangeRequestByRequesterArn: "ChangeRequestByRequesterArn" = "ChangeRequestByRequesterArn"
  inline val ChangeRequestByRequesterName: "ChangeRequestByRequesterName" = "ChangeRequestByRequesterName"
  inline val ChangeRequestByApproverArn: "ChangeRequestByApproverArn" = "ChangeRequestByApproverArn"
  inline val ChangeRequestByApproverName: "ChangeRequestByApproverName" = "ChangeRequestByApproverName"
  inline val ChangeRequestByTemplate: "ChangeRequestByTemplate" = "ChangeRequestByTemplate"
  inline val ChangeRequestByTargetsResourceGroup: "ChangeRequestByTargetsResourceGroup" = "ChangeRequestByTargetsResourceGroup"
  inline val InsightByType: "InsightByType" = "InsightByType"

  inline def values: js.Array[OpsItemFilterKey] = js.Array(
    Status,
    CreatedBy,
    Source,
    Priority,
    Title,
    OpsItemId,
    CreatedTime,
    LastModifiedTime,
    ActualStartTime,
    ActualEndTime,
    PlannedStartTime,
    PlannedEndTime,
    OperationalData,
    OperationalDataKey,
    OperationalDataValue,
    ResourceId,
    AutomationId,
    Category,
    Severity,
    OpsItemType,
    ChangeRequestByRequesterArn,
    ChangeRequestByRequesterName,
    ChangeRequestByApproverArn,
    ChangeRequestByApproverName,
    ChangeRequestByTemplate,
    ChangeRequestByTargetsResourceGroup,
    InsightByType
  )
}

type OpsItemFilterOperator = "Equal" | "Contains" | "GreaterThan" | "LessThan"
object OpsItemFilterOperator {
  inline val Equal: "Equal" = "Equal"
  inline val Contains: "Contains" = "Contains"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val LessThan: "LessThan" = "LessThan"

  inline def values: js.Array[OpsItemFilterOperator] = js.Array(Equal, Contains, GreaterThan, LessThan)
}

type OpsItemRelatedItemsFilterKey = "ResourceType" | "AssociationId" | "ResourceUri"
object OpsItemRelatedItemsFilterKey {
  inline val ResourceType: "ResourceType" = "ResourceType"
  inline val AssociationId: "AssociationId" = "AssociationId"
  inline val ResourceUri: "ResourceUri" = "ResourceUri"

  inline def values: js.Array[OpsItemRelatedItemsFilterKey] = js.Array(ResourceType, AssociationId, ResourceUri)
}

type OpsItemRelatedItemsFilterOperator = "Equal"
object OpsItemRelatedItemsFilterOperator {
  inline val Equal: "Equal" = "Equal"

  inline def values: js.Array[OpsItemRelatedItemsFilterOperator] = js.Array(Equal)
}

type OpsItemStatus = "Open" | "InProgress" | "Resolved" | "Pending" | "TimedOut" | "Cancelling" | "Cancelled" | "Failed" | "CompletedWithSuccess" | "CompletedWithFailure" | "Scheduled" | "RunbookInProgress" | "PendingChangeCalendarOverride" | "ChangeCalendarOverrideApproved" | "ChangeCalendarOverrideRejected" | "PendingApproval" | "Approved" | "Rejected" | "Closed"
object OpsItemStatus {
  inline val Open: "Open" = "Open"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Resolved: "Resolved" = "Resolved"
  inline val Pending: "Pending" = "Pending"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Cancelling: "Cancelling" = "Cancelling"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Failed: "Failed" = "Failed"
  inline val CompletedWithSuccess: "CompletedWithSuccess" = "CompletedWithSuccess"
  inline val CompletedWithFailure: "CompletedWithFailure" = "CompletedWithFailure"
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val RunbookInProgress: "RunbookInProgress" = "RunbookInProgress"
  inline val PendingChangeCalendarOverride: "PendingChangeCalendarOverride" = "PendingChangeCalendarOverride"
  inline val ChangeCalendarOverrideApproved: "ChangeCalendarOverrideApproved" = "ChangeCalendarOverrideApproved"
  inline val ChangeCalendarOverrideRejected: "ChangeCalendarOverrideRejected" = "ChangeCalendarOverrideRejected"
  inline val PendingApproval: "PendingApproval" = "PendingApproval"
  inline val Approved: "Approved" = "Approved"
  inline val Rejected: "Rejected" = "Rejected"
  inline val Closed: "Closed" = "Closed"

  inline def values: js.Array[OpsItemStatus] = js.Array(
    Open,
    InProgress,
    Resolved,
    Pending,
    TimedOut,
    Cancelling,
    Cancelled,
    Failed,
    CompletedWithSuccess,
    CompletedWithFailure,
    Scheduled,
    RunbookInProgress,
    PendingChangeCalendarOverride,
    ChangeCalendarOverrideApproved,
    ChangeCalendarOverrideRejected,
    PendingApproval,
    Approved,
    Rejected,
    Closed
  )
}

type ParameterTier = "Standard" | "Advanced" | "Intelligent-Tiering"
object ParameterTier {
  inline val Standard: "Standard" = "Standard"
  inline val Advanced: "Advanced" = "Advanced"
  inline val `Intelligent-Tiering`: "Intelligent-Tiering" = "Intelligent-Tiering"

  inline def values: js.Array[ParameterTier] = js.Array(Standard, Advanced, `Intelligent-Tiering`)
}

type ParameterType = "String" | "StringList" | "SecureString"
object ParameterType {
  inline val String: "String" = "String"
  inline val StringList: "StringList" = "StringList"
  inline val SecureString: "SecureString" = "SecureString"

  inline def values: js.Array[ParameterType] = js.Array(String, StringList, SecureString)
}

type ParametersFilterKey = "Name" | "Type" | "KeyId"
object ParametersFilterKey {
  inline val Name: "Name" = "Name"
  inline val Type: "Type" = "Type"
  inline val KeyId: "KeyId" = "KeyId"

  inline def values: js.Array[ParametersFilterKey] = js.Array(Name, Type, KeyId)
}

type PatchAction = "ALLOW_AS_DEPENDENCY" | "BLOCK"
object PatchAction {
  inline val ALLOW_AS_DEPENDENCY: "ALLOW_AS_DEPENDENCY" = "ALLOW_AS_DEPENDENCY"
  inline val BLOCK: "BLOCK" = "BLOCK"

  inline def values: js.Array[PatchAction] = js.Array(ALLOW_AS_DEPENDENCY, BLOCK)
}

type PatchComplianceDataState = "INSTALLED" | "INSTALLED_OTHER" | "INSTALLED_PENDING_REBOOT" | "INSTALLED_REJECTED" | "MISSING" | "NOT_APPLICABLE" | "FAILED"
object PatchComplianceDataState {
  inline val INSTALLED: "INSTALLED" = "INSTALLED"
  inline val INSTALLED_OTHER: "INSTALLED_OTHER" = "INSTALLED_OTHER"
  inline val INSTALLED_PENDING_REBOOT: "INSTALLED_PENDING_REBOOT" = "INSTALLED_PENDING_REBOOT"
  inline val INSTALLED_REJECTED: "INSTALLED_REJECTED" = "INSTALLED_REJECTED"
  inline val MISSING: "MISSING" = "MISSING"
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[PatchComplianceDataState] = js.Array(INSTALLED, INSTALLED_OTHER, INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE, FAILED)
}

type PatchComplianceLevel = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED"
object PatchComplianceLevel {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"
  inline val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  inline val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  inline def values: js.Array[PatchComplianceLevel] = js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
}

type PatchDeploymentStatus = "APPROVED" | "PENDING_APPROVAL" | "EXPLICIT_APPROVED" | "EXPLICIT_REJECTED"
object PatchDeploymentStatus {
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val PENDING_APPROVAL: "PENDING_APPROVAL" = "PENDING_APPROVAL"
  inline val EXPLICIT_APPROVED: "EXPLICIT_APPROVED" = "EXPLICIT_APPROVED"
  inline val EXPLICIT_REJECTED: "EXPLICIT_REJECTED" = "EXPLICIT_REJECTED"

  inline def values: js.Array[PatchDeploymentStatus] = js.Array(APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED)
}

type PatchFilterKey = "ARCH" | "ADVISORY_ID" | "BUGZILLA_ID" | "PATCH_SET" | "PRODUCT" | "PRODUCT_FAMILY" | "CLASSIFICATION" | "CVE_ID" | "EPOCH" | "MSRC_SEVERITY" | "NAME" | "PATCH_ID" | "SECTION" | "PRIORITY" | "REPOSITORY" | "RELEASE" | "SEVERITY" | "SECURITY" | "VERSION"
object PatchFilterKey {
  inline val ARCH: "ARCH" = "ARCH"
  inline val ADVISORY_ID: "ADVISORY_ID" = "ADVISORY_ID"
  inline val BUGZILLA_ID: "BUGZILLA_ID" = "BUGZILLA_ID"
  inline val PATCH_SET: "PATCH_SET" = "PATCH_SET"
  inline val PRODUCT: "PRODUCT" = "PRODUCT"
  inline val PRODUCT_FAMILY: "PRODUCT_FAMILY" = "PRODUCT_FAMILY"
  inline val CLASSIFICATION: "CLASSIFICATION" = "CLASSIFICATION"
  inline val CVE_ID: "CVE_ID" = "CVE_ID"
  inline val EPOCH: "EPOCH" = "EPOCH"
  inline val MSRC_SEVERITY: "MSRC_SEVERITY" = "MSRC_SEVERITY"
  inline val NAME: "NAME" = "NAME"
  inline val PATCH_ID: "PATCH_ID" = "PATCH_ID"
  inline val SECTION: "SECTION" = "SECTION"
  inline val PRIORITY: "PRIORITY" = "PRIORITY"
  inline val REPOSITORY: "REPOSITORY" = "REPOSITORY"
  inline val RELEASE: "RELEASE" = "RELEASE"
  inline val SEVERITY: "SEVERITY" = "SEVERITY"
  inline val SECURITY: "SECURITY" = "SECURITY"
  inline val VERSION: "VERSION" = "VERSION"

  inline def values: js.Array[PatchFilterKey] = js.Array(
    ARCH,
    ADVISORY_ID,
    BUGZILLA_ID,
    PATCH_SET,
    PRODUCT,
    PRODUCT_FAMILY,
    CLASSIFICATION,
    CVE_ID,
    EPOCH,
    MSRC_SEVERITY,
    NAME,
    PATCH_ID,
    SECTION,
    PRIORITY,
    REPOSITORY,
    RELEASE,
    SEVERITY,
    SECURITY,
    VERSION
  )
}

type PatchOperationType = "Scan" | "Install"
object PatchOperationType {
  inline val Scan: "Scan" = "Scan"
  inline val Install: "Install" = "Install"

  inline def values: js.Array[PatchOperationType] = js.Array(Scan, Install)
}

type PatchProperty = "PRODUCT" | "PRODUCT_FAMILY" | "CLASSIFICATION" | "MSRC_SEVERITY" | "PRIORITY" | "SEVERITY"
object PatchProperty {
  inline val PRODUCT: "PRODUCT" = "PRODUCT"
  inline val PRODUCT_FAMILY: "PRODUCT_FAMILY" = "PRODUCT_FAMILY"
  inline val CLASSIFICATION: "CLASSIFICATION" = "CLASSIFICATION"
  inline val MSRC_SEVERITY: "MSRC_SEVERITY" = "MSRC_SEVERITY"
  inline val PRIORITY: "PRIORITY" = "PRIORITY"
  inline val SEVERITY: "SEVERITY" = "SEVERITY"

  inline def values: js.Array[PatchProperty] = js.Array(PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY)
}

type PatchSet = "OS" | "APPLICATION"
object PatchSet {
  inline val OS: "OS" = "OS"
  inline val APPLICATION: "APPLICATION" = "APPLICATION"

  inline def values: js.Array[PatchSet] = js.Array(OS, APPLICATION)
}

type PingStatus = "Online" | "ConnectionLost" | "Inactive"
object PingStatus {
  inline val Online: "Online" = "Online"
  inline val ConnectionLost: "ConnectionLost" = "ConnectionLost"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[PingStatus] = js.Array(Online, ConnectionLost, Inactive)
}

type PlatformType = "Windows" | "Linux" | "MacOS"
object PlatformType {
  inline val Windows: "Windows" = "Windows"
  inline val Linux: "Linux" = "Linux"
  inline val MacOS: "MacOS" = "MacOS"

  inline def values: js.Array[PlatformType] = js.Array(Windows, Linux, MacOS)
}

type RebootOption = "RebootIfNeeded" | "NoReboot"
object RebootOption {
  inline val RebootIfNeeded: "RebootIfNeeded" = "RebootIfNeeded"
  inline val NoReboot: "NoReboot" = "NoReboot"

  inline def values: js.Array[RebootOption] = js.Array(RebootIfNeeded, NoReboot)
}

type ResourceDataSyncS3Format = "JsonSerDe"
object ResourceDataSyncS3Format {
  inline val JsonSerDe: "JsonSerDe" = "JsonSerDe"

  inline def values: js.Array[ResourceDataSyncS3Format] = js.Array(JsonSerDe)
}

type ResourceType = "ManagedInstance" | "Document" | "EC2Instance"
object ResourceType {
  inline val ManagedInstance: "ManagedInstance" = "ManagedInstance"
  inline val Document: "Document" = "Document"
  inline val EC2Instance: "EC2Instance" = "EC2Instance"

  inline def values: js.Array[ResourceType] = js.Array(ManagedInstance, Document, EC2Instance)
}

type ResourceTypeForTagging = "Document" | "ManagedInstance" | "MaintenanceWindow" | "Parameter" | "PatchBaseline" | "OpsItem" | "OpsMetadata"
object ResourceTypeForTagging {
  inline val Document: "Document" = "Document"
  inline val ManagedInstance: "ManagedInstance" = "ManagedInstance"
  inline val MaintenanceWindow: "MaintenanceWindow" = "MaintenanceWindow"
  inline val Parameter: "Parameter" = "Parameter"
  inline val PatchBaseline: "PatchBaseline" = "PatchBaseline"
  inline val OpsItem: "OpsItem" = "OpsItem"
  inline val OpsMetadata: "OpsMetadata" = "OpsMetadata"

  inline def values: js.Array[ResourceTypeForTagging] = js.Array(Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem, OpsMetadata)
}

type ReviewStatus = "APPROVED" | "NOT_REVIEWED" | "PENDING" | "REJECTED"
object ReviewStatus {
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val NOT_REVIEWED: "NOT_REVIEWED" = "NOT_REVIEWED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val REJECTED: "REJECTED" = "REJECTED"

  inline def values: js.Array[ReviewStatus] = js.Array(APPROVED, NOT_REVIEWED, PENDING, REJECTED)
}

type SessionFilterKey = "InvokedAfter" | "InvokedBefore" | "Target" | "Owner" | "Status" | "SessionId"
object SessionFilterKey {
  inline val InvokedAfter: "InvokedAfter" = "InvokedAfter"
  inline val InvokedBefore: "InvokedBefore" = "InvokedBefore"
  inline val Target: "Target" = "Target"
  inline val Owner: "Owner" = "Owner"
  inline val Status: "Status" = "Status"
  inline val SessionId: "SessionId" = "SessionId"

  inline def values: js.Array[SessionFilterKey] = js.Array(InvokedAfter, InvokedBefore, Target, Owner, Status, SessionId)
}

type SessionState = "Active" | "History"
object SessionState {
  inline val Active: "Active" = "Active"
  inline val History: "History" = "History"

  inline def values: js.Array[SessionState] = js.Array(Active, History)
}

type SessionStatus = "Connected" | "Connecting" | "Disconnected" | "Terminated" | "Terminating" | "Failed"
object SessionStatus {
  inline val Connected: "Connected" = "Connected"
  inline val Connecting: "Connecting" = "Connecting"
  inline val Disconnected: "Disconnected" = "Disconnected"
  inline val Terminated: "Terminated" = "Terminated"
  inline val Terminating: "Terminating" = "Terminating"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[SessionStatus] = js.Array(Connected, Connecting, Disconnected, Terminated, Terminating, Failed)
}

type SignalType = "Approve" | "Reject" | "StartStep" | "StopStep" | "Resume"
object SignalType {
  inline val Approve: "Approve" = "Approve"
  inline val Reject: "Reject" = "Reject"
  inline val StartStep: "StartStep" = "StartStep"
  inline val StopStep: "StopStep" = "StopStep"
  inline val Resume: "Resume" = "Resume"

  inline def values: js.Array[SignalType] = js.Array(Approve, Reject, StartStep, StopStep, Resume)
}

type SourceType = "AWS::EC2::Instance" | "AWS::IoT::Thing" | "AWS::SSM::ManagedInstance"
object SourceType {
  inline val `AWS::EC2::Instance`: "AWS::EC2::Instance" = "AWS::EC2::Instance"
  inline val `AWS::IoT::Thing`: "AWS::IoT::Thing" = "AWS::IoT::Thing"
  inline val `AWS::SSM::ManagedInstance`: "AWS::SSM::ManagedInstance" = "AWS::SSM::ManagedInstance"

  inline def values: js.Array[SourceType] = js.Array(`AWS::EC2::Instance`, `AWS::IoT::Thing`, `AWS::SSM::ManagedInstance`)
}

type StepExecutionFilterKey = "StartTimeBefore" | "StartTimeAfter" | "StepExecutionStatus" | "StepExecutionId" | "StepName" | "Action"
object StepExecutionFilterKey {
  inline val StartTimeBefore: "StartTimeBefore" = "StartTimeBefore"
  inline val StartTimeAfter: "StartTimeAfter" = "StartTimeAfter"
  inline val StepExecutionStatus: "StepExecutionStatus" = "StepExecutionStatus"
  inline val StepExecutionId: "StepExecutionId" = "StepExecutionId"
  inline val StepName: "StepName" = "StepName"
  inline val Action: "Action" = "Action"

  inline def values: js.Array[StepExecutionFilterKey] = js.Array(StartTimeBefore, StartTimeAfter, StepExecutionStatus, StepExecutionId, StepName, Action)
}

type StopType = "Complete" | "Cancel"
object StopType {
  inline val Complete: "Complete" = "Complete"
  inline val Cancel: "Cancel" = "Cancel"

  inline def values: js.Array[StopType] = js.Array(Complete, Cancel)
}
