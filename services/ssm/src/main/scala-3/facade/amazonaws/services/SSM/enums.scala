package facade.amazonaws.services.ssm

import scalajs._

type AssociationComplianceSeverity = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED"
object AssociationComplianceSeverity {
  val CRITICAL: "CRITICAL" = "CRITICAL"
  val HIGH: "HIGH" = "HIGH"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val LOW: "LOW" = "LOW"
  val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  @inline def values = js.Array[AssociationComplianceSeverity](CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED)
}

type AssociationExecutionFilterKey = "ExecutionId" | "Status" | "CreatedTime"
object AssociationExecutionFilterKey {
  val ExecutionId: "ExecutionId" = "ExecutionId"
  val Status: "Status" = "Status"
  val CreatedTime: "CreatedTime" = "CreatedTime"

  @inline def values = js.Array[AssociationExecutionFilterKey](ExecutionId, Status, CreatedTime)
}

type AssociationExecutionTargetsFilterKey = "Status" | "ResourceId" | "ResourceType"
object AssociationExecutionTargetsFilterKey {
  val Status: "Status" = "Status"
  val ResourceId: "ResourceId" = "ResourceId"
  val ResourceType: "ResourceType" = "ResourceType"

  @inline def values = js.Array[AssociationExecutionTargetsFilterKey](Status, ResourceId, ResourceType)
}

type AssociationFilterKey = "InstanceId" | "Name" | "AssociationId" | "AssociationStatusName" | "LastExecutedBefore" | "LastExecutedAfter" | "AssociationName" | "ResourceGroupName"
object AssociationFilterKey {
  val InstanceId: "InstanceId" = "InstanceId"
  val Name: "Name" = "Name"
  val AssociationId: "AssociationId" = "AssociationId"
  val AssociationStatusName: "AssociationStatusName" = "AssociationStatusName"
  val LastExecutedBefore: "LastExecutedBefore" = "LastExecutedBefore"
  val LastExecutedAfter: "LastExecutedAfter" = "LastExecutedAfter"
  val AssociationName: "AssociationName" = "AssociationName"
  val ResourceGroupName: "ResourceGroupName" = "ResourceGroupName"

  @inline def values = js.Array[AssociationFilterKey](InstanceId, Name, AssociationId, AssociationStatusName, LastExecutedBefore, LastExecutedAfter, AssociationName, ResourceGroupName)
}

type AssociationFilterOperatorType = "EQUAL" | "LESS_THAN" | "GREATER_THAN"
object AssociationFilterOperatorType {
  val EQUAL: "EQUAL" = "EQUAL"
  val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"

  @inline def values = js.Array[AssociationFilterOperatorType](EQUAL, LESS_THAN, GREATER_THAN)
}

type AssociationStatusName = "Pending" | "Success" | "Failed"
object AssociationStatusName {
  val Pending: "Pending" = "Pending"
  val Success: "Success" = "Success"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[AssociationStatusName](Pending, Success, Failed)
}

type AssociationSyncCompliance = "AUTO" | "MANUAL"
object AssociationSyncCompliance {
  val AUTO: "AUTO" = "AUTO"
  val MANUAL: "MANUAL" = "MANUAL"

  @inline def values = js.Array[AssociationSyncCompliance](AUTO, MANUAL)
}

type AttachmentHashType = "Sha256"
object AttachmentHashType {
  val Sha256: "Sha256" = "Sha256"

  @inline def values = js.Array[AttachmentHashType](Sha256)
}

type AttachmentsSourceKey = "SourceUrl" | "S3FileUrl" | "AttachmentReference"
object AttachmentsSourceKey {
  val SourceUrl: "SourceUrl" = "SourceUrl"
  val S3FileUrl: "S3FileUrl" = "S3FileUrl"
  val AttachmentReference: "AttachmentReference" = "AttachmentReference"

  @inline def values = js.Array[AttachmentsSourceKey](SourceUrl, S3FileUrl, AttachmentReference)
}

type AutomationExecutionFilterKey = "DocumentNamePrefix" | "ExecutionStatus" | "ExecutionId" | "ParentExecutionId" | "CurrentAction" | "StartTimeBefore" | "StartTimeAfter" | "AutomationType" | "TagKey" | "TargetResourceGroup" | "AutomationSubtype" | "OpsItemId"
object AutomationExecutionFilterKey {
  val DocumentNamePrefix: "DocumentNamePrefix" = "DocumentNamePrefix"
  val ExecutionStatus: "ExecutionStatus" = "ExecutionStatus"
  val ExecutionId: "ExecutionId" = "ExecutionId"
  val ParentExecutionId: "ParentExecutionId" = "ParentExecutionId"
  val CurrentAction: "CurrentAction" = "CurrentAction"
  val StartTimeBefore: "StartTimeBefore" = "StartTimeBefore"
  val StartTimeAfter: "StartTimeAfter" = "StartTimeAfter"
  val AutomationType: "AutomationType" = "AutomationType"
  val TagKey: "TagKey" = "TagKey"
  val TargetResourceGroup: "TargetResourceGroup" = "TargetResourceGroup"
  val AutomationSubtype: "AutomationSubtype" = "AutomationSubtype"
  val OpsItemId: "OpsItemId" = "OpsItemId"

  @inline def values = js.Array[AutomationExecutionFilterKey](
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
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Waiting: "Waiting" = "Waiting"
  val Success: "Success" = "Success"
  val TimedOut: "TimedOut" = "TimedOut"
  val Cancelling: "Cancelling" = "Cancelling"
  val Cancelled: "Cancelled" = "Cancelled"
  val Failed: "Failed" = "Failed"
  val PendingApproval: "PendingApproval" = "PendingApproval"
  val Approved: "Approved" = "Approved"
  val Rejected: "Rejected" = "Rejected"
  val Scheduled: "Scheduled" = "Scheduled"
  val RunbookInProgress: "RunbookInProgress" = "RunbookInProgress"
  val PendingChangeCalendarOverride: "PendingChangeCalendarOverride" = "PendingChangeCalendarOverride"
  val ChangeCalendarOverrideApproved: "ChangeCalendarOverrideApproved" = "ChangeCalendarOverrideApproved"
  val ChangeCalendarOverrideRejected: "ChangeCalendarOverrideRejected" = "ChangeCalendarOverrideRejected"
  val CompletedWithSuccess: "CompletedWithSuccess" = "CompletedWithSuccess"
  val CompletedWithFailure: "CompletedWithFailure" = "CompletedWithFailure"

  @inline def values = js.Array[AutomationExecutionStatus](
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
  val ChangeRequest: "ChangeRequest" = "ChangeRequest"

  @inline def values = js.Array[AutomationSubtype](ChangeRequest)
}

type AutomationType = "CrossAccount" | "Local"
object AutomationType {
  val CrossAccount: "CrossAccount" = "CrossAccount"
  val Local: "Local" = "Local"

  @inline def values = js.Array[AutomationType](CrossAccount, Local)
}

type CalendarState = "OPEN" | "CLOSED"
object CalendarState {
  val OPEN: "OPEN" = "OPEN"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[CalendarState](OPEN, CLOSED)
}

type CommandFilterKey = "InvokedAfter" | "InvokedBefore" | "Status" | "ExecutionStage" | "DocumentName"
object CommandFilterKey {
  val InvokedAfter: "InvokedAfter" = "InvokedAfter"
  val InvokedBefore: "InvokedBefore" = "InvokedBefore"
  val Status: "Status" = "Status"
  val ExecutionStage: "ExecutionStage" = "ExecutionStage"
  val DocumentName: "DocumentName" = "DocumentName"

  @inline def values = js.Array[CommandFilterKey](InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName)
}

type CommandInvocationStatus = "Pending" | "InProgress" | "Delayed" | "Success" | "Cancelled" | "TimedOut" | "Failed" | "Cancelling"
object CommandInvocationStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Delayed: "Delayed" = "Delayed"
  val Success: "Success" = "Success"
  val Cancelled: "Cancelled" = "Cancelled"
  val TimedOut: "TimedOut" = "TimedOut"
  val Failed: "Failed" = "Failed"
  val Cancelling: "Cancelling" = "Cancelling"

  @inline def values = js.Array[CommandInvocationStatus](Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling)
}

type CommandPluginStatus = "Pending" | "InProgress" | "Success" | "TimedOut" | "Cancelled" | "Failed"
object CommandPluginStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Success: "Success" = "Success"
  val TimedOut: "TimedOut" = "TimedOut"
  val Cancelled: "Cancelled" = "Cancelled"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[CommandPluginStatus](Pending, InProgress, Success, TimedOut, Cancelled, Failed)
}

type CommandStatus = "Pending" | "InProgress" | "Success" | "Cancelled" | "Failed" | "TimedOut" | "Cancelling"
object CommandStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Success: "Success" = "Success"
  val Cancelled: "Cancelled" = "Cancelled"
  val Failed: "Failed" = "Failed"
  val TimedOut: "TimedOut" = "TimedOut"
  val Cancelling: "Cancelling" = "Cancelling"

  @inline def values = js.Array[CommandStatus](Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling)
}

type ComplianceQueryOperatorType = "EQUAL" | "NOT_EQUAL" | "BEGIN_WITH" | "LESS_THAN" | "GREATER_THAN"
object ComplianceQueryOperatorType {
  val EQUAL: "EQUAL" = "EQUAL"
  val NOT_EQUAL: "NOT_EQUAL" = "NOT_EQUAL"
  val BEGIN_WITH: "BEGIN_WITH" = "BEGIN_WITH"
  val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"

  @inline def values = js.Array[ComplianceQueryOperatorType](EQUAL, NOT_EQUAL, BEGIN_WITH, LESS_THAN, GREATER_THAN)
}

type ComplianceSeverity = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED"
object ComplianceSeverity {
  val CRITICAL: "CRITICAL" = "CRITICAL"
  val HIGH: "HIGH" = "HIGH"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val LOW: "LOW" = "LOW"
  val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  @inline def values = js.Array[ComplianceSeverity](CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
}

type ComplianceStatus = "COMPLIANT" | "NON_COMPLIANT"
object ComplianceStatus {
  val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"

  @inline def values = js.Array[ComplianceStatus](COMPLIANT, NON_COMPLIANT)
}

type ComplianceUploadType = "COMPLETE" | "PARTIAL"
object ComplianceUploadType {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val PARTIAL: "PARTIAL" = "PARTIAL"

  @inline def values = js.Array[ComplianceUploadType](COMPLETE, PARTIAL)
}

type ConnectionStatus = "Connected" | "NotConnected"
object ConnectionStatus {
  val Connected: "Connected" = "Connected"
  val NotConnected: "NotConnected" = "NotConnected"

  @inline def values = js.Array[ConnectionStatus](Connected, NotConnected)
}

type DescribeActivationsFilterKeys = "ActivationIds" | "DefaultInstanceName" | "IamRole"
object DescribeActivationsFilterKeys {
  val ActivationIds: "ActivationIds" = "ActivationIds"
  val DefaultInstanceName: "DefaultInstanceName" = "DefaultInstanceName"
  val IamRole: "IamRole" = "IamRole"

  @inline def values = js.Array[DescribeActivationsFilterKeys](ActivationIds, DefaultInstanceName, IamRole)
}

type DocumentFilterKey = "Name" | "Owner" | "PlatformTypes" | "DocumentType"
object DocumentFilterKey {
  val Name: "Name" = "Name"
  val Owner: "Owner" = "Owner"
  val PlatformTypes: "PlatformTypes" = "PlatformTypes"
  val DocumentType: "DocumentType" = "DocumentType"

  @inline def values = js.Array[DocumentFilterKey](Name, Owner, PlatformTypes, DocumentType)
}

type DocumentFormat = "YAML" | "JSON" | "TEXT"
object DocumentFormat {
  val YAML: "YAML" = "YAML"
  val JSON: "JSON" = "JSON"
  val TEXT: "TEXT" = "TEXT"

  @inline def values = js.Array[DocumentFormat](YAML, JSON, TEXT)
}

type DocumentHashType = "Sha256" | "Sha1"
object DocumentHashType {
  val Sha256: "Sha256" = "Sha256"
  val Sha1: "Sha1" = "Sha1"

  @inline def values = js.Array[DocumentHashType](Sha256, Sha1)
}

type DocumentMetadataEnum = "DocumentReviews"
object DocumentMetadataEnum {
  val DocumentReviews: "DocumentReviews" = "DocumentReviews"

  @inline def values = js.Array[DocumentMetadataEnum](DocumentReviews)
}

type DocumentParameterType = "String" | "StringList"
object DocumentParameterType {
  val String: "String" = "String"
  val StringList: "StringList" = "StringList"

  @inline def values = js.Array[DocumentParameterType](String, StringList)
}

type DocumentPermissionType = "Share"
object DocumentPermissionType {
  val Share: "Share" = "Share"

  @inline def values = js.Array[DocumentPermissionType](Share)
}

type DocumentReviewAction = "SendForReview" | "UpdateReview" | "Approve" | "Reject"
object DocumentReviewAction {
  val SendForReview: "SendForReview" = "SendForReview"
  val UpdateReview: "UpdateReview" = "UpdateReview"
  val Approve: "Approve" = "Approve"
  val Reject: "Reject" = "Reject"

  @inline def values = js.Array[DocumentReviewAction](SendForReview, UpdateReview, Approve, Reject)
}

type DocumentReviewCommentType = "Comment"
object DocumentReviewCommentType {
  val Comment: "Comment" = "Comment"

  @inline def values = js.Array[DocumentReviewCommentType](Comment)
}

/** The status of a document.
  */
type DocumentStatus = "Creating" | "Active" | "Updating" | "Deleting" | "Failed"
object DocumentStatus {
  val Creating: "Creating" = "Creating"
  val Active: "Active" = "Active"
  val Updating: "Updating" = "Updating"
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[DocumentStatus](Creating, Active, Updating, Deleting, Failed)
}

type DocumentType = "Command" | "Policy" | "Automation" | "Session" | "Package" | "ApplicationConfiguration" | "ApplicationConfigurationSchema" | "DeploymentStrategy" | "ChangeCalendar" | "Automation.ChangeTemplate"
object DocumentType {
  val Command: "Command" = "Command"
  val Policy: "Policy" = "Policy"
  val Automation: "Automation" = "Automation"
  val Session: "Session" = "Session"
  val Package: "Package" = "Package"
  val ApplicationConfiguration: "ApplicationConfiguration" = "ApplicationConfiguration"
  val ApplicationConfigurationSchema: "ApplicationConfigurationSchema" = "ApplicationConfigurationSchema"
  val DeploymentStrategy: "DeploymentStrategy" = "DeploymentStrategy"
  val ChangeCalendar: "ChangeCalendar" = "ChangeCalendar"
  val `Automation.ChangeTemplate`: "Automation.ChangeTemplate" = "Automation.ChangeTemplate"

  @inline def values = js.Array[DocumentType](
    Command,
    Policy,
    Automation,
    Session,
    Package,
    ApplicationConfiguration,
    ApplicationConfigurationSchema,
    DeploymentStrategy,
    ChangeCalendar,
    `Automation.ChangeTemplate`
  )
}

type ExecutionMode = "Auto" | "Interactive"
object ExecutionMode {
  val Auto: "Auto" = "Auto"
  val Interactive: "Interactive" = "Interactive"

  @inline def values = js.Array[ExecutionMode](Auto, Interactive)
}

type Fault = "Client" | "Server" | "Unknown"
object Fault {
  val Client: "Client" = "Client"
  val Server: "Server" = "Server"
  val Unknown: "Unknown" = "Unknown"

  @inline def values = js.Array[Fault](Client, Server, Unknown)
}

type InstanceInformationFilterKey = "InstanceIds" | "AgentVersion" | "PingStatus" | "PlatformTypes" | "ActivationIds" | "IamRole" | "ResourceType" | "AssociationStatus"
object InstanceInformationFilterKey {
  val InstanceIds: "InstanceIds" = "InstanceIds"
  val AgentVersion: "AgentVersion" = "AgentVersion"
  val PingStatus: "PingStatus" = "PingStatus"
  val PlatformTypes: "PlatformTypes" = "PlatformTypes"
  val ActivationIds: "ActivationIds" = "ActivationIds"
  val IamRole: "IamRole" = "IamRole"
  val ResourceType: "ResourceType" = "ResourceType"
  val AssociationStatus: "AssociationStatus" = "AssociationStatus"

  @inline def values = js.Array[InstanceInformationFilterKey](InstanceIds, AgentVersion, PingStatus, PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus)
}

type InstancePatchStateOperatorType = "Equal" | "NotEqual" | "LessThan" | "GreaterThan"
object InstancePatchStateOperatorType {
  val Equal: "Equal" = "Equal"
  val NotEqual: "NotEqual" = "NotEqual"
  val LessThan: "LessThan" = "LessThan"
  val GreaterThan: "GreaterThan" = "GreaterThan"

  @inline def values = js.Array[InstancePatchStateOperatorType](Equal, NotEqual, LessThan, GreaterThan)
}

type InventoryAttributeDataType = "string" | "number"
object InventoryAttributeDataType {
  val string: "string" = "string"
  val number: "number" = "number"

  @inline def values = js.Array[InventoryAttributeDataType](string, number)
}

type InventoryDeletionStatus = "InProgress" | "Complete"
object InventoryDeletionStatus {
  val InProgress: "InProgress" = "InProgress"
  val Complete: "Complete" = "Complete"

  @inline def values = js.Array[InventoryDeletionStatus](InProgress, Complete)
}

type InventoryQueryOperatorType = "Equal" | "NotEqual" | "BeginWith" | "LessThan" | "GreaterThan" | "Exists"
object InventoryQueryOperatorType {
  val Equal: "Equal" = "Equal"
  val NotEqual: "NotEqual" = "NotEqual"
  val BeginWith: "BeginWith" = "BeginWith"
  val LessThan: "LessThan" = "LessThan"
  val GreaterThan: "GreaterThan" = "GreaterThan"
  val Exists: "Exists" = "Exists"

  @inline def values = js.Array[InventoryQueryOperatorType](Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
}

type InventorySchemaDeleteOption = "DisableSchema" | "DeleteSchema"
object InventorySchemaDeleteOption {
  val DisableSchema: "DisableSchema" = "DisableSchema"
  val DeleteSchema: "DeleteSchema" = "DeleteSchema"

  @inline def values = js.Array[InventorySchemaDeleteOption](DisableSchema, DeleteSchema)
}

type LastResourceDataSyncStatus = "Successful" | "Failed" | "InProgress"
object LastResourceDataSyncStatus {
  val Successful: "Successful" = "Successful"
  val Failed: "Failed" = "Failed"
  val InProgress: "InProgress" = "InProgress"

  @inline def values = js.Array[LastResourceDataSyncStatus](Successful, Failed, InProgress)
}

type MaintenanceWindowExecutionStatus = "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING"
object MaintenanceWindowExecutionStatus {
  val PENDING: "PENDING" = "PENDING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val CANCELLING: "CANCELLING" = "CANCELLING"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val SKIPPED_OVERLAPPING: "SKIPPED_OVERLAPPING" = "SKIPPED_OVERLAPPING"

  @inline def values = js.Array[MaintenanceWindowExecutionStatus](PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING)
}

type MaintenanceWindowResourceType = "INSTANCE" | "RESOURCE_GROUP"
object MaintenanceWindowResourceType {
  val INSTANCE: "INSTANCE" = "INSTANCE"
  val RESOURCE_GROUP: "RESOURCE_GROUP" = "RESOURCE_GROUP"

  @inline def values = js.Array[MaintenanceWindowResourceType](INSTANCE, RESOURCE_GROUP)
}

type MaintenanceWindowTaskType = "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA"
object MaintenanceWindowTaskType {
  val RUN_COMMAND: "RUN_COMMAND" = "RUN_COMMAND"
  val AUTOMATION: "AUTOMATION" = "AUTOMATION"
  val STEP_FUNCTIONS: "STEP_FUNCTIONS" = "STEP_FUNCTIONS"
  val LAMBDA: "LAMBDA" = "LAMBDA"

  @inline def values = js.Array[MaintenanceWindowTaskType](RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA)
}

type NotificationEvent = "All" | "InProgress" | "Success" | "TimedOut" | "Cancelled" | "Failed"
object NotificationEvent {
  val All: "All" = "All"
  val InProgress: "InProgress" = "InProgress"
  val Success: "Success" = "Success"
  val TimedOut: "TimedOut" = "TimedOut"
  val Cancelled: "Cancelled" = "Cancelled"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[NotificationEvent](All, InProgress, Success, TimedOut, Cancelled, Failed)
}

type NotificationType = "Command" | "Invocation"
object NotificationType {
  val Command: "Command" = "Command"
  val Invocation: "Invocation" = "Invocation"

  @inline def values = js.Array[NotificationType](Command, Invocation)
}

type OperatingSystem = "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | "ORACLE_LINUX" | "DEBIAN" | "MACOS"
object OperatingSystem {
  val WINDOWS: "WINDOWS" = "WINDOWS"
  val AMAZON_LINUX: "AMAZON_LINUX" = "AMAZON_LINUX"
  val AMAZON_LINUX_2: "AMAZON_LINUX_2" = "AMAZON_LINUX_2"
  val UBUNTU: "UBUNTU" = "UBUNTU"
  val REDHAT_ENTERPRISE_LINUX: "REDHAT_ENTERPRISE_LINUX" = "REDHAT_ENTERPRISE_LINUX"
  val SUSE: "SUSE" = "SUSE"
  val CENTOS: "CENTOS" = "CENTOS"
  val ORACLE_LINUX: "ORACLE_LINUX" = "ORACLE_LINUX"
  val DEBIAN: "DEBIAN" = "DEBIAN"
  val MACOS: "MACOS" = "MACOS"

  @inline def values = js.Array[OperatingSystem](WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN, MACOS)
}

type OpsFilterOperatorType = "Equal" | "NotEqual" | "BeginWith" | "LessThan" | "GreaterThan" | "Exists"
object OpsFilterOperatorType {
  val Equal: "Equal" = "Equal"
  val NotEqual: "NotEqual" = "NotEqual"
  val BeginWith: "BeginWith" = "BeginWith"
  val LessThan: "LessThan" = "LessThan"
  val GreaterThan: "GreaterThan" = "GreaterThan"
  val Exists: "Exists" = "Exists"

  @inline def values = js.Array[OpsFilterOperatorType](Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
}

type OpsItemDataType = "SearchableString" | "String"
object OpsItemDataType {
  val SearchableString: "SearchableString" = "SearchableString"
  val String: "String" = "String"

  @inline def values = js.Array[OpsItemDataType](SearchableString, String)
}

type OpsItemEventFilterKey = "OpsItemId"
object OpsItemEventFilterKey {
  val OpsItemId: "OpsItemId" = "OpsItemId"

  @inline def values = js.Array[OpsItemEventFilterKey](OpsItemId)
}

type OpsItemEventFilterOperator = "Equal"
object OpsItemEventFilterOperator {
  val Equal: "Equal" = "Equal"

  @inline def values = js.Array[OpsItemEventFilterOperator](Equal)
}

type OpsItemFilterKey = "Status" | "CreatedBy" | "Source" | "Priority" | "Title" | "OpsItemId" | "CreatedTime" | "LastModifiedTime" | "ActualStartTime" | "ActualEndTime" | "PlannedStartTime" | "PlannedEndTime" | "OperationalData" | "OperationalDataKey" | "OperationalDataValue" | "ResourceId" | "AutomationId" | "Category" | "Severity" | "OpsItemType" | "ChangeRequestByRequesterArn" | "ChangeRequestByRequesterName" | "ChangeRequestByApproverArn" | "ChangeRequestByApproverName" | "ChangeRequestByTemplate" | "ChangeRequestByTargetsResourceGroup"
object OpsItemFilterKey {
  val Status: "Status" = "Status"
  val CreatedBy: "CreatedBy" = "CreatedBy"
  val Source: "Source" = "Source"
  val Priority: "Priority" = "Priority"
  val Title: "Title" = "Title"
  val OpsItemId: "OpsItemId" = "OpsItemId"
  val CreatedTime: "CreatedTime" = "CreatedTime"
  val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"
  val ActualStartTime: "ActualStartTime" = "ActualStartTime"
  val ActualEndTime: "ActualEndTime" = "ActualEndTime"
  val PlannedStartTime: "PlannedStartTime" = "PlannedStartTime"
  val PlannedEndTime: "PlannedEndTime" = "PlannedEndTime"
  val OperationalData: "OperationalData" = "OperationalData"
  val OperationalDataKey: "OperationalDataKey" = "OperationalDataKey"
  val OperationalDataValue: "OperationalDataValue" = "OperationalDataValue"
  val ResourceId: "ResourceId" = "ResourceId"
  val AutomationId: "AutomationId" = "AutomationId"
  val Category: "Category" = "Category"
  val Severity: "Severity" = "Severity"
  val OpsItemType: "OpsItemType" = "OpsItemType"
  val ChangeRequestByRequesterArn: "ChangeRequestByRequesterArn" = "ChangeRequestByRequesterArn"
  val ChangeRequestByRequesterName: "ChangeRequestByRequesterName" = "ChangeRequestByRequesterName"
  val ChangeRequestByApproverArn: "ChangeRequestByApproverArn" = "ChangeRequestByApproverArn"
  val ChangeRequestByApproverName: "ChangeRequestByApproverName" = "ChangeRequestByApproverName"
  val ChangeRequestByTemplate: "ChangeRequestByTemplate" = "ChangeRequestByTemplate"
  val ChangeRequestByTargetsResourceGroup: "ChangeRequestByTargetsResourceGroup" = "ChangeRequestByTargetsResourceGroup"

  @inline def values = js.Array[OpsItemFilterKey](
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
    ChangeRequestByTargetsResourceGroup
  )
}

type OpsItemFilterOperator = "Equal" | "Contains" | "GreaterThan" | "LessThan"
object OpsItemFilterOperator {
  val Equal: "Equal" = "Equal"
  val Contains: "Contains" = "Contains"
  val GreaterThan: "GreaterThan" = "GreaterThan"
  val LessThan: "LessThan" = "LessThan"

  @inline def values = js.Array[OpsItemFilterOperator](Equal, Contains, GreaterThan, LessThan)
}

type OpsItemStatus = "Open" | "InProgress" | "Resolved" | "Pending" | "TimedOut" | "Cancelling" | "Cancelled" | "Failed" | "CompletedWithSuccess" | "CompletedWithFailure" | "Scheduled" | "RunbookInProgress" | "PendingChangeCalendarOverride" | "ChangeCalendarOverrideApproved" | "ChangeCalendarOverrideRejected" | "PendingApproval" | "Approved" | "Rejected"
object OpsItemStatus {
  val Open: "Open" = "Open"
  val InProgress: "InProgress" = "InProgress"
  val Resolved: "Resolved" = "Resolved"
  val Pending: "Pending" = "Pending"
  val TimedOut: "TimedOut" = "TimedOut"
  val Cancelling: "Cancelling" = "Cancelling"
  val Cancelled: "Cancelled" = "Cancelled"
  val Failed: "Failed" = "Failed"
  val CompletedWithSuccess: "CompletedWithSuccess" = "CompletedWithSuccess"
  val CompletedWithFailure: "CompletedWithFailure" = "CompletedWithFailure"
  val Scheduled: "Scheduled" = "Scheduled"
  val RunbookInProgress: "RunbookInProgress" = "RunbookInProgress"
  val PendingChangeCalendarOverride: "PendingChangeCalendarOverride" = "PendingChangeCalendarOverride"
  val ChangeCalendarOverrideApproved: "ChangeCalendarOverrideApproved" = "ChangeCalendarOverrideApproved"
  val ChangeCalendarOverrideRejected: "ChangeCalendarOverrideRejected" = "ChangeCalendarOverrideRejected"
  val PendingApproval: "PendingApproval" = "PendingApproval"
  val Approved: "Approved" = "Approved"
  val Rejected: "Rejected" = "Rejected"

  @inline def values = js.Array[OpsItemStatus](
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
    Rejected
  )
}

type ParameterTier = "Standard" | "Advanced" | "Intelligent-Tiering"
object ParameterTier {
  val Standard: "Standard" = "Standard"
  val Advanced: "Advanced" = "Advanced"
  val `Intelligent-Tiering`: "Intelligent-Tiering" = "Intelligent-Tiering"

  @inline def values = js.Array[ParameterTier](Standard, Advanced, `Intelligent-Tiering`)
}

type ParameterType = "String" | "StringList" | "SecureString"
object ParameterType {
  val String: "String" = "String"
  val StringList: "StringList" = "StringList"
  val SecureString: "SecureString" = "SecureString"

  @inline def values = js.Array[ParameterType](String, StringList, SecureString)
}

type ParametersFilterKey = "Name" | "Type" | "KeyId"
object ParametersFilterKey {
  val Name: "Name" = "Name"
  val Type: "Type" = "Type"
  val KeyId: "KeyId" = "KeyId"

  @inline def values = js.Array[ParametersFilterKey](Name, Type, KeyId)
}

type PatchAction = "ALLOW_AS_DEPENDENCY" | "BLOCK"
object PatchAction {
  val ALLOW_AS_DEPENDENCY: "ALLOW_AS_DEPENDENCY" = "ALLOW_AS_DEPENDENCY"
  val BLOCK: "BLOCK" = "BLOCK"

  @inline def values = js.Array[PatchAction](ALLOW_AS_DEPENDENCY, BLOCK)
}

type PatchComplianceDataState = "INSTALLED" | "INSTALLED_OTHER" | "INSTALLED_PENDING_REBOOT" | "INSTALLED_REJECTED" | "MISSING" | "NOT_APPLICABLE" | "FAILED"
object PatchComplianceDataState {
  val INSTALLED: "INSTALLED" = "INSTALLED"
  val INSTALLED_OTHER: "INSTALLED_OTHER" = "INSTALLED_OTHER"
  val INSTALLED_PENDING_REBOOT: "INSTALLED_PENDING_REBOOT" = "INSTALLED_PENDING_REBOOT"
  val INSTALLED_REJECTED: "INSTALLED_REJECTED" = "INSTALLED_REJECTED"
  val MISSING: "MISSING" = "MISSING"
  val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[PatchComplianceDataState](INSTALLED, INSTALLED_OTHER, INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE, FAILED)
}

type PatchComplianceLevel = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED"
object PatchComplianceLevel {
  val CRITICAL: "CRITICAL" = "CRITICAL"
  val HIGH: "HIGH" = "HIGH"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val LOW: "LOW" = "LOW"
  val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  @inline def values = js.Array[PatchComplianceLevel](CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
}

type PatchDeploymentStatus = "APPROVED" | "PENDING_APPROVAL" | "EXPLICIT_APPROVED" | "EXPLICIT_REJECTED"
object PatchDeploymentStatus {
  val APPROVED: "APPROVED" = "APPROVED"
  val PENDING_APPROVAL: "PENDING_APPROVAL" = "PENDING_APPROVAL"
  val EXPLICIT_APPROVED: "EXPLICIT_APPROVED" = "EXPLICIT_APPROVED"
  val EXPLICIT_REJECTED: "EXPLICIT_REJECTED" = "EXPLICIT_REJECTED"

  @inline def values = js.Array[PatchDeploymentStatus](APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED)
}

type PatchFilterKey = "ARCH" | "ADVISORY_ID" | "BUGZILLA_ID" | "PATCH_SET" | "PRODUCT" | "PRODUCT_FAMILY" | "CLASSIFICATION" | "CVE_ID" | "EPOCH" | "MSRC_SEVERITY" | "NAME" | "PATCH_ID" | "SECTION" | "PRIORITY" | "REPOSITORY" | "RELEASE" | "SEVERITY" | "SECURITY" | "VERSION"
object PatchFilterKey {
  val ARCH: "ARCH" = "ARCH"
  val ADVISORY_ID: "ADVISORY_ID" = "ADVISORY_ID"
  val BUGZILLA_ID: "BUGZILLA_ID" = "BUGZILLA_ID"
  val PATCH_SET: "PATCH_SET" = "PATCH_SET"
  val PRODUCT: "PRODUCT" = "PRODUCT"
  val PRODUCT_FAMILY: "PRODUCT_FAMILY" = "PRODUCT_FAMILY"
  val CLASSIFICATION: "CLASSIFICATION" = "CLASSIFICATION"
  val CVE_ID: "CVE_ID" = "CVE_ID"
  val EPOCH: "EPOCH" = "EPOCH"
  val MSRC_SEVERITY: "MSRC_SEVERITY" = "MSRC_SEVERITY"
  val NAME: "NAME" = "NAME"
  val PATCH_ID: "PATCH_ID" = "PATCH_ID"
  val SECTION: "SECTION" = "SECTION"
  val PRIORITY: "PRIORITY" = "PRIORITY"
  val REPOSITORY: "REPOSITORY" = "REPOSITORY"
  val RELEASE: "RELEASE" = "RELEASE"
  val SEVERITY: "SEVERITY" = "SEVERITY"
  val SECURITY: "SECURITY" = "SECURITY"
  val VERSION: "VERSION" = "VERSION"

  @inline def values = js.Array[PatchFilterKey](
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
  val Scan: "Scan" = "Scan"
  val Install: "Install" = "Install"

  @inline def values = js.Array[PatchOperationType](Scan, Install)
}

type PatchProperty = "PRODUCT" | "PRODUCT_FAMILY" | "CLASSIFICATION" | "MSRC_SEVERITY" | "PRIORITY" | "SEVERITY"
object PatchProperty {
  val PRODUCT: "PRODUCT" = "PRODUCT"
  val PRODUCT_FAMILY: "PRODUCT_FAMILY" = "PRODUCT_FAMILY"
  val CLASSIFICATION: "CLASSIFICATION" = "CLASSIFICATION"
  val MSRC_SEVERITY: "MSRC_SEVERITY" = "MSRC_SEVERITY"
  val PRIORITY: "PRIORITY" = "PRIORITY"
  val SEVERITY: "SEVERITY" = "SEVERITY"

  @inline def values = js.Array[PatchProperty](PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY)
}

type PatchSet = "OS" | "APPLICATION"
object PatchSet {
  val OS: "OS" = "OS"
  val APPLICATION: "APPLICATION" = "APPLICATION"

  @inline def values = js.Array[PatchSet](OS, APPLICATION)
}

type PingStatus = "Online" | "ConnectionLost" | "Inactive"
object PingStatus {
  val Online: "Online" = "Online"
  val ConnectionLost: "ConnectionLost" = "ConnectionLost"
  val Inactive: "Inactive" = "Inactive"

  @inline def values = js.Array[PingStatus](Online, ConnectionLost, Inactive)
}

type PlatformType = "Windows" | "Linux"
object PlatformType {
  val Windows: "Windows" = "Windows"
  val Linux: "Linux" = "Linux"

  @inline def values = js.Array[PlatformType](Windows, Linux)
}

type RebootOption = "RebootIfNeeded" | "NoReboot"
object RebootOption {
  val RebootIfNeeded: "RebootIfNeeded" = "RebootIfNeeded"
  val NoReboot: "NoReboot" = "NoReboot"

  @inline def values = js.Array[RebootOption](RebootIfNeeded, NoReboot)
}

type ResourceDataSyncS3Format = "JsonSerDe"
object ResourceDataSyncS3Format {
  val JsonSerDe: "JsonSerDe" = "JsonSerDe"

  @inline def values = js.Array[ResourceDataSyncS3Format](JsonSerDe)
}

type ResourceType = "ManagedInstance" | "Document" | "EC2Instance"
object ResourceType {
  val ManagedInstance: "ManagedInstance" = "ManagedInstance"
  val Document: "Document" = "Document"
  val EC2Instance: "EC2Instance" = "EC2Instance"

  @inline def values = js.Array[ResourceType](ManagedInstance, Document, EC2Instance)
}

type ResourceTypeForTagging = "Document" | "ManagedInstance" | "MaintenanceWindow" | "Parameter" | "PatchBaseline" | "OpsItem" | "OpsMetadata"
object ResourceTypeForTagging {
  val Document: "Document" = "Document"
  val ManagedInstance: "ManagedInstance" = "ManagedInstance"
  val MaintenanceWindow: "MaintenanceWindow" = "MaintenanceWindow"
  val Parameter: "Parameter" = "Parameter"
  val PatchBaseline: "PatchBaseline" = "PatchBaseline"
  val OpsItem: "OpsItem" = "OpsItem"
  val OpsMetadata: "OpsMetadata" = "OpsMetadata"

  @inline def values = js.Array[ResourceTypeForTagging](Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem, OpsMetadata)
}

type ReviewStatus = "APPROVED" | "NOT_REVIEWED" | "PENDING" | "REJECTED"
object ReviewStatus {
  val APPROVED: "APPROVED" = "APPROVED"
  val NOT_REVIEWED: "NOT_REVIEWED" = "NOT_REVIEWED"
  val PENDING: "PENDING" = "PENDING"
  val REJECTED: "REJECTED" = "REJECTED"

  @inline def values = js.Array[ReviewStatus](APPROVED, NOT_REVIEWED, PENDING, REJECTED)
}

type SessionFilterKey = "InvokedAfter" | "InvokedBefore" | "Target" | "Owner" | "Status" | "SessionId"
object SessionFilterKey {
  val InvokedAfter: "InvokedAfter" = "InvokedAfter"
  val InvokedBefore: "InvokedBefore" = "InvokedBefore"
  val Target: "Target" = "Target"
  val Owner: "Owner" = "Owner"
  val Status: "Status" = "Status"
  val SessionId: "SessionId" = "SessionId"

  @inline def values = js.Array[SessionFilterKey](InvokedAfter, InvokedBefore, Target, Owner, Status, SessionId)
}

type SessionState = "Active" | "History"
object SessionState {
  val Active: "Active" = "Active"
  val History: "History" = "History"

  @inline def values = js.Array[SessionState](Active, History)
}

type SessionStatus = "Connected" | "Connecting" | "Disconnected" | "Terminated" | "Terminating" | "Failed"
object SessionStatus {
  val Connected: "Connected" = "Connected"
  val Connecting: "Connecting" = "Connecting"
  val Disconnected: "Disconnected" = "Disconnected"
  val Terminated: "Terminated" = "Terminated"
  val Terminating: "Terminating" = "Terminating"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[SessionStatus](Connected, Connecting, Disconnected, Terminated, Terminating, Failed)
}

type SignalType = "Approve" | "Reject" | "StartStep" | "StopStep" | "Resume"
object SignalType {
  val Approve: "Approve" = "Approve"
  val Reject: "Reject" = "Reject"
  val StartStep: "StartStep" = "StartStep"
  val StopStep: "StopStep" = "StopStep"
  val Resume: "Resume" = "Resume"

  @inline def values = js.Array[SignalType](Approve, Reject, StartStep, StopStep, Resume)
}

type StepExecutionFilterKey = "StartTimeBefore" | "StartTimeAfter" | "StepExecutionStatus" | "StepExecutionId" | "StepName" | "Action"
object StepExecutionFilterKey {
  val StartTimeBefore: "StartTimeBefore" = "StartTimeBefore"
  val StartTimeAfter: "StartTimeAfter" = "StartTimeAfter"
  val StepExecutionStatus: "StepExecutionStatus" = "StepExecutionStatus"
  val StepExecutionId: "StepExecutionId" = "StepExecutionId"
  val StepName: "StepName" = "StepName"
  val Action: "Action" = "Action"

  @inline def values = js.Array[StepExecutionFilterKey](StartTimeBefore, StartTimeAfter, StepExecutionStatus, StepExecutionId, StepName, Action)
}

type StopType = "Complete" | "Cancel"
object StopType {
  val Complete: "Complete" = "Complete"
  val Cancel: "Cancel" = "Cancel"

  @inline def values = js.Array[StopType](Complete, Cancel)
}
