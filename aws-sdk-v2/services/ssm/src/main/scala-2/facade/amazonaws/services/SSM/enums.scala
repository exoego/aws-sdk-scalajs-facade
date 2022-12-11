package facade.amazonaws.services.ssm

import scalajs.js

@js.native
sealed trait AssociationComplianceSeverity extends js.Any
object AssociationComplianceSeverity {
  val CRITICAL = "CRITICAL".asInstanceOf[AssociationComplianceSeverity]
  val HIGH = "HIGH".asInstanceOf[AssociationComplianceSeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[AssociationComplianceSeverity]
  val LOW = "LOW".asInstanceOf[AssociationComplianceSeverity]
  val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[AssociationComplianceSeverity]

  @inline def values: js.Array[AssociationComplianceSeverity] = js.Array(CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED)
}

@js.native
sealed trait AssociationExecutionFilterKey extends js.Any
object AssociationExecutionFilterKey {
  val ExecutionId = "ExecutionId".asInstanceOf[AssociationExecutionFilterKey]
  val Status = "Status".asInstanceOf[AssociationExecutionFilterKey]
  val CreatedTime = "CreatedTime".asInstanceOf[AssociationExecutionFilterKey]

  @inline def values: js.Array[AssociationExecutionFilterKey] = js.Array(ExecutionId, Status, CreatedTime)
}

@js.native
sealed trait AssociationExecutionTargetsFilterKey extends js.Any
object AssociationExecutionTargetsFilterKey {
  val Status = "Status".asInstanceOf[AssociationExecutionTargetsFilterKey]
  val ResourceId = "ResourceId".asInstanceOf[AssociationExecutionTargetsFilterKey]
  val ResourceType = "ResourceType".asInstanceOf[AssociationExecutionTargetsFilterKey]

  @inline def values: js.Array[AssociationExecutionTargetsFilterKey] = js.Array(Status, ResourceId, ResourceType)
}

@js.native
sealed trait AssociationFilterKey extends js.Any
object AssociationFilterKey {
  val InstanceId = "InstanceId".asInstanceOf[AssociationFilterKey]
  val Name = "Name".asInstanceOf[AssociationFilterKey]
  val AssociationId = "AssociationId".asInstanceOf[AssociationFilterKey]
  val AssociationStatusName = "AssociationStatusName".asInstanceOf[AssociationFilterKey]
  val LastExecutedBefore = "LastExecutedBefore".asInstanceOf[AssociationFilterKey]
  val LastExecutedAfter = "LastExecutedAfter".asInstanceOf[AssociationFilterKey]
  val AssociationName = "AssociationName".asInstanceOf[AssociationFilterKey]
  val ResourceGroupName = "ResourceGroupName".asInstanceOf[AssociationFilterKey]

  @inline def values: js.Array[AssociationFilterKey] = js.Array(InstanceId, Name, AssociationId, AssociationStatusName, LastExecutedBefore, LastExecutedAfter, AssociationName, ResourceGroupName)
}

@js.native
sealed trait AssociationFilterOperatorType extends js.Any
object AssociationFilterOperatorType {
  val EQUAL = "EQUAL".asInstanceOf[AssociationFilterOperatorType]
  val LESS_THAN = "LESS_THAN".asInstanceOf[AssociationFilterOperatorType]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[AssociationFilterOperatorType]

  @inline def values: js.Array[AssociationFilterOperatorType] = js.Array(EQUAL, LESS_THAN, GREATER_THAN)
}

@js.native
sealed trait AssociationStatusName extends js.Any
object AssociationStatusName {
  val Pending = "Pending".asInstanceOf[AssociationStatusName]
  val Success = "Success".asInstanceOf[AssociationStatusName]
  val Failed = "Failed".asInstanceOf[AssociationStatusName]

  @inline def values: js.Array[AssociationStatusName] = js.Array(Pending, Success, Failed)
}

@js.native
sealed trait AssociationSyncCompliance extends js.Any
object AssociationSyncCompliance {
  val AUTO = "AUTO".asInstanceOf[AssociationSyncCompliance]
  val MANUAL = "MANUAL".asInstanceOf[AssociationSyncCompliance]

  @inline def values: js.Array[AssociationSyncCompliance] = js.Array(AUTO, MANUAL)
}

@js.native
sealed trait AttachmentHashType extends js.Any
object AttachmentHashType {
  val Sha256 = "Sha256".asInstanceOf[AttachmentHashType]

  @inline def values: js.Array[AttachmentHashType] = js.Array(Sha256)
}

@js.native
sealed trait AttachmentsSourceKey extends js.Any
object AttachmentsSourceKey {
  val SourceUrl = "SourceUrl".asInstanceOf[AttachmentsSourceKey]
  val S3FileUrl = "S3FileUrl".asInstanceOf[AttachmentsSourceKey]
  val AttachmentReference = "AttachmentReference".asInstanceOf[AttachmentsSourceKey]

  @inline def values: js.Array[AttachmentsSourceKey] = js.Array(SourceUrl, S3FileUrl, AttachmentReference)
}

@js.native
sealed trait AutomationExecutionFilterKey extends js.Any
object AutomationExecutionFilterKey {
  val DocumentNamePrefix = "DocumentNamePrefix".asInstanceOf[AutomationExecutionFilterKey]
  val ExecutionStatus = "ExecutionStatus".asInstanceOf[AutomationExecutionFilterKey]
  val ExecutionId = "ExecutionId".asInstanceOf[AutomationExecutionFilterKey]
  val ParentExecutionId = "ParentExecutionId".asInstanceOf[AutomationExecutionFilterKey]
  val CurrentAction = "CurrentAction".asInstanceOf[AutomationExecutionFilterKey]
  val StartTimeBefore = "StartTimeBefore".asInstanceOf[AutomationExecutionFilterKey]
  val StartTimeAfter = "StartTimeAfter".asInstanceOf[AutomationExecutionFilterKey]
  val AutomationType = "AutomationType".asInstanceOf[AutomationExecutionFilterKey]
  val TagKey = "TagKey".asInstanceOf[AutomationExecutionFilterKey]
  val TargetResourceGroup = "TargetResourceGroup".asInstanceOf[AutomationExecutionFilterKey]
  val AutomationSubtype = "AutomationSubtype".asInstanceOf[AutomationExecutionFilterKey]
  val OpsItemId = "OpsItemId".asInstanceOf[AutomationExecutionFilterKey]

  @inline def values: js.Array[AutomationExecutionFilterKey] = js.Array(
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

@js.native
sealed trait AutomationExecutionStatus extends js.Any
object AutomationExecutionStatus {
  val Pending = "Pending".asInstanceOf[AutomationExecutionStatus]
  val InProgress = "InProgress".asInstanceOf[AutomationExecutionStatus]
  val Waiting = "Waiting".asInstanceOf[AutomationExecutionStatus]
  val Success = "Success".asInstanceOf[AutomationExecutionStatus]
  val TimedOut = "TimedOut".asInstanceOf[AutomationExecutionStatus]
  val Cancelling = "Cancelling".asInstanceOf[AutomationExecutionStatus]
  val Cancelled = "Cancelled".asInstanceOf[AutomationExecutionStatus]
  val Failed = "Failed".asInstanceOf[AutomationExecutionStatus]
  val PendingApproval = "PendingApproval".asInstanceOf[AutomationExecutionStatus]
  val Approved = "Approved".asInstanceOf[AutomationExecutionStatus]
  val Rejected = "Rejected".asInstanceOf[AutomationExecutionStatus]
  val Scheduled = "Scheduled".asInstanceOf[AutomationExecutionStatus]
  val RunbookInProgress = "RunbookInProgress".asInstanceOf[AutomationExecutionStatus]
  val PendingChangeCalendarOverride = "PendingChangeCalendarOverride".asInstanceOf[AutomationExecutionStatus]
  val ChangeCalendarOverrideApproved = "ChangeCalendarOverrideApproved".asInstanceOf[AutomationExecutionStatus]
  val ChangeCalendarOverrideRejected = "ChangeCalendarOverrideRejected".asInstanceOf[AutomationExecutionStatus]
  val CompletedWithSuccess = "CompletedWithSuccess".asInstanceOf[AutomationExecutionStatus]
  val CompletedWithFailure = "CompletedWithFailure".asInstanceOf[AutomationExecutionStatus]

  @inline def values: js.Array[AutomationExecutionStatus] = js.Array(
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

@js.native
sealed trait AutomationSubtype extends js.Any
object AutomationSubtype {
  val ChangeRequest = "ChangeRequest".asInstanceOf[AutomationSubtype]

  @inline def values: js.Array[AutomationSubtype] = js.Array(ChangeRequest)
}

@js.native
sealed trait AutomationType extends js.Any
object AutomationType {
  val CrossAccount = "CrossAccount".asInstanceOf[AutomationType]
  val Local = "Local".asInstanceOf[AutomationType]

  @inline def values: js.Array[AutomationType] = js.Array(CrossAccount, Local)
}

@js.native
sealed trait CalendarState extends js.Any
object CalendarState {
  val OPEN = "OPEN".asInstanceOf[CalendarState]
  val CLOSED = "CLOSED".asInstanceOf[CalendarState]

  @inline def values: js.Array[CalendarState] = js.Array(OPEN, CLOSED)
}

@js.native
sealed trait CommandFilterKey extends js.Any
object CommandFilterKey {
  val InvokedAfter = "InvokedAfter".asInstanceOf[CommandFilterKey]
  val InvokedBefore = "InvokedBefore".asInstanceOf[CommandFilterKey]
  val Status = "Status".asInstanceOf[CommandFilterKey]
  val ExecutionStage = "ExecutionStage".asInstanceOf[CommandFilterKey]
  val DocumentName = "DocumentName".asInstanceOf[CommandFilterKey]

  @inline def values: js.Array[CommandFilterKey] = js.Array(InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName)
}

@js.native
sealed trait CommandInvocationStatus extends js.Any
object CommandInvocationStatus {
  val Pending = "Pending".asInstanceOf[CommandInvocationStatus]
  val InProgress = "InProgress".asInstanceOf[CommandInvocationStatus]
  val Delayed = "Delayed".asInstanceOf[CommandInvocationStatus]
  val Success = "Success".asInstanceOf[CommandInvocationStatus]
  val Cancelled = "Cancelled".asInstanceOf[CommandInvocationStatus]
  val TimedOut = "TimedOut".asInstanceOf[CommandInvocationStatus]
  val Failed = "Failed".asInstanceOf[CommandInvocationStatus]
  val Cancelling = "Cancelling".asInstanceOf[CommandInvocationStatus]

  @inline def values: js.Array[CommandInvocationStatus] = js.Array(Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling)
}

@js.native
sealed trait CommandPluginStatus extends js.Any
object CommandPluginStatus {
  val Pending = "Pending".asInstanceOf[CommandPluginStatus]
  val InProgress = "InProgress".asInstanceOf[CommandPluginStatus]
  val Success = "Success".asInstanceOf[CommandPluginStatus]
  val TimedOut = "TimedOut".asInstanceOf[CommandPluginStatus]
  val Cancelled = "Cancelled".asInstanceOf[CommandPluginStatus]
  val Failed = "Failed".asInstanceOf[CommandPluginStatus]

  @inline def values: js.Array[CommandPluginStatus] = js.Array(Pending, InProgress, Success, TimedOut, Cancelled, Failed)
}

@js.native
sealed trait CommandStatus extends js.Any
object CommandStatus {
  val Pending = "Pending".asInstanceOf[CommandStatus]
  val InProgress = "InProgress".asInstanceOf[CommandStatus]
  val Success = "Success".asInstanceOf[CommandStatus]
  val Cancelled = "Cancelled".asInstanceOf[CommandStatus]
  val Failed = "Failed".asInstanceOf[CommandStatus]
  val TimedOut = "TimedOut".asInstanceOf[CommandStatus]
  val Cancelling = "Cancelling".asInstanceOf[CommandStatus]

  @inline def values: js.Array[CommandStatus] = js.Array(Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling)
}

@js.native
sealed trait ComplianceQueryOperatorType extends js.Any
object ComplianceQueryOperatorType {
  val EQUAL = "EQUAL".asInstanceOf[ComplianceQueryOperatorType]
  val NOT_EQUAL = "NOT_EQUAL".asInstanceOf[ComplianceQueryOperatorType]
  val BEGIN_WITH = "BEGIN_WITH".asInstanceOf[ComplianceQueryOperatorType]
  val LESS_THAN = "LESS_THAN".asInstanceOf[ComplianceQueryOperatorType]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComplianceQueryOperatorType]

  @inline def values: js.Array[ComplianceQueryOperatorType] = js.Array(EQUAL, NOT_EQUAL, BEGIN_WITH, LESS_THAN, GREATER_THAN)
}

@js.native
sealed trait ComplianceSeverity extends js.Any
object ComplianceSeverity {
  val CRITICAL = "CRITICAL".asInstanceOf[ComplianceSeverity]
  val HIGH = "HIGH".asInstanceOf[ComplianceSeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[ComplianceSeverity]
  val LOW = "LOW".asInstanceOf[ComplianceSeverity]
  val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[ComplianceSeverity]
  val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[ComplianceSeverity]

  @inline def values: js.Array[ComplianceSeverity] = js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
}

@js.native
sealed trait ComplianceStatus extends js.Any
object ComplianceStatus {
  val COMPLIANT = "COMPLIANT".asInstanceOf[ComplianceStatus]
  val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[ComplianceStatus]

  @inline def values: js.Array[ComplianceStatus] = js.Array(COMPLIANT, NON_COMPLIANT)
}

@js.native
sealed trait ComplianceUploadType extends js.Any
object ComplianceUploadType {
  val COMPLETE = "COMPLETE".asInstanceOf[ComplianceUploadType]
  val PARTIAL = "PARTIAL".asInstanceOf[ComplianceUploadType]

  @inline def values: js.Array[ComplianceUploadType] = js.Array(COMPLETE, PARTIAL)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val Connected = "Connected".asInstanceOf[ConnectionStatus]
  val NotConnected = "NotConnected".asInstanceOf[ConnectionStatus]

  @inline def values: js.Array[ConnectionStatus] = js.Array(Connected, NotConnected)
}

@js.native
sealed trait DescribeActivationsFilterKeys extends js.Any
object DescribeActivationsFilterKeys {
  val ActivationIds = "ActivationIds".asInstanceOf[DescribeActivationsFilterKeys]
  val DefaultInstanceName = "DefaultInstanceName".asInstanceOf[DescribeActivationsFilterKeys]
  val IamRole = "IamRole".asInstanceOf[DescribeActivationsFilterKeys]

  @inline def values: js.Array[DescribeActivationsFilterKeys] = js.Array(ActivationIds, DefaultInstanceName, IamRole)
}

@js.native
sealed trait DocumentFilterKey extends js.Any
object DocumentFilterKey {
  val Name = "Name".asInstanceOf[DocumentFilterKey]
  val Owner = "Owner".asInstanceOf[DocumentFilterKey]
  val PlatformTypes = "PlatformTypes".asInstanceOf[DocumentFilterKey]
  val DocumentType = "DocumentType".asInstanceOf[DocumentFilterKey]

  @inline def values: js.Array[DocumentFilterKey] = js.Array(Name, Owner, PlatformTypes, DocumentType)
}

@js.native
sealed trait DocumentFormat extends js.Any
object DocumentFormat {
  val YAML = "YAML".asInstanceOf[DocumentFormat]
  val JSON = "JSON".asInstanceOf[DocumentFormat]
  val TEXT = "TEXT".asInstanceOf[DocumentFormat]

  @inline def values: js.Array[DocumentFormat] = js.Array(YAML, JSON, TEXT)
}

@js.native
sealed trait DocumentHashType extends js.Any
object DocumentHashType {
  val Sha256 = "Sha256".asInstanceOf[DocumentHashType]
  val Sha1 = "Sha1".asInstanceOf[DocumentHashType]

  @inline def values: js.Array[DocumentHashType] = js.Array(Sha256, Sha1)
}

@js.native
sealed trait DocumentMetadataEnum extends js.Any
object DocumentMetadataEnum {
  val DocumentReviews = "DocumentReviews".asInstanceOf[DocumentMetadataEnum]

  @inline def values: js.Array[DocumentMetadataEnum] = js.Array(DocumentReviews)
}

@js.native
sealed trait DocumentParameterType extends js.Any
object DocumentParameterType {
  val String = "String".asInstanceOf[DocumentParameterType]
  val StringList = "StringList".asInstanceOf[DocumentParameterType]

  @inline def values: js.Array[DocumentParameterType] = js.Array(String, StringList)
}

@js.native
sealed trait DocumentPermissionType extends js.Any
object DocumentPermissionType {
  val Share = "Share".asInstanceOf[DocumentPermissionType]

  @inline def values: js.Array[DocumentPermissionType] = js.Array(Share)
}

@js.native
sealed trait DocumentReviewAction extends js.Any
object DocumentReviewAction {
  val SendForReview = "SendForReview".asInstanceOf[DocumentReviewAction]
  val UpdateReview = "UpdateReview".asInstanceOf[DocumentReviewAction]
  val Approve = "Approve".asInstanceOf[DocumentReviewAction]
  val Reject = "Reject".asInstanceOf[DocumentReviewAction]

  @inline def values: js.Array[DocumentReviewAction] = js.Array(SendForReview, UpdateReview, Approve, Reject)
}

@js.native
sealed trait DocumentReviewCommentType extends js.Any
object DocumentReviewCommentType {
  val Comment = "Comment".asInstanceOf[DocumentReviewCommentType]

  @inline def values: js.Array[DocumentReviewCommentType] = js.Array(Comment)
}

/** The status of a document.
  */
@js.native
sealed trait DocumentStatus extends js.Any
object DocumentStatus {
  val Creating = "Creating".asInstanceOf[DocumentStatus]
  val Active = "Active".asInstanceOf[DocumentStatus]
  val Updating = "Updating".asInstanceOf[DocumentStatus]
  val Deleting = "Deleting".asInstanceOf[DocumentStatus]
  val Failed = "Failed".asInstanceOf[DocumentStatus]

  @inline def values: js.Array[DocumentStatus] = js.Array(Creating, Active, Updating, Deleting, Failed)
}

@js.native
sealed trait DocumentType extends js.Any
object DocumentType {
  val Command = "Command".asInstanceOf[DocumentType]
  val Policy = "Policy".asInstanceOf[DocumentType]
  val Automation = "Automation".asInstanceOf[DocumentType]
  val Session = "Session".asInstanceOf[DocumentType]
  val Package = "Package".asInstanceOf[DocumentType]
  val ApplicationConfiguration = "ApplicationConfiguration".asInstanceOf[DocumentType]
  val ApplicationConfigurationSchema = "ApplicationConfigurationSchema".asInstanceOf[DocumentType]
  val DeploymentStrategy = "DeploymentStrategy".asInstanceOf[DocumentType]
  val ChangeCalendar = "ChangeCalendar".asInstanceOf[DocumentType]
  val `Automation.ChangeTemplate` = "Automation.ChangeTemplate".asInstanceOf[DocumentType]
  val ProblemAnalysis = "ProblemAnalysis".asInstanceOf[DocumentType]
  val ProblemAnalysisTemplate = "ProblemAnalysisTemplate".asInstanceOf[DocumentType]
  val CloudFormation = "CloudFormation".asInstanceOf[DocumentType]
  val ConformancePackTemplate = "ConformancePackTemplate".asInstanceOf[DocumentType]

  @inline def values: js.Array[DocumentType] = js.Array(
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
    ProblemAnalysisTemplate,
    CloudFormation,
    ConformancePackTemplate
  )
}

@js.native
sealed trait ExecutionMode extends js.Any
object ExecutionMode {
  val Auto = "Auto".asInstanceOf[ExecutionMode]
  val Interactive = "Interactive".asInstanceOf[ExecutionMode]

  @inline def values: js.Array[ExecutionMode] = js.Array(Auto, Interactive)
}

@js.native
sealed trait ExternalAlarmState extends js.Any
object ExternalAlarmState {
  val UNKNOWN = "UNKNOWN".asInstanceOf[ExternalAlarmState]
  val ALARM = "ALARM".asInstanceOf[ExternalAlarmState]

  @inline def values: js.Array[ExternalAlarmState] = js.Array(UNKNOWN, ALARM)
}

@js.native
sealed trait Fault extends js.Any
object Fault {
  val Client = "Client".asInstanceOf[Fault]
  val Server = "Server".asInstanceOf[Fault]
  val Unknown = "Unknown".asInstanceOf[Fault]

  @inline def values: js.Array[Fault] = js.Array(Client, Server, Unknown)
}

@js.native
sealed trait InstanceInformationFilterKey extends js.Any
object InstanceInformationFilterKey {
  val InstanceIds = "InstanceIds".asInstanceOf[InstanceInformationFilterKey]
  val AgentVersion = "AgentVersion".asInstanceOf[InstanceInformationFilterKey]
  val PingStatus = "PingStatus".asInstanceOf[InstanceInformationFilterKey]
  val PlatformTypes = "PlatformTypes".asInstanceOf[InstanceInformationFilterKey]
  val ActivationIds = "ActivationIds".asInstanceOf[InstanceInformationFilterKey]
  val IamRole = "IamRole".asInstanceOf[InstanceInformationFilterKey]
  val ResourceType = "ResourceType".asInstanceOf[InstanceInformationFilterKey]
  val AssociationStatus = "AssociationStatus".asInstanceOf[InstanceInformationFilterKey]

  @inline def values: js.Array[InstanceInformationFilterKey] = js.Array(InstanceIds, AgentVersion, PingStatus, PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus)
}

@js.native
sealed trait InstancePatchStateOperatorType extends js.Any
object InstancePatchStateOperatorType {
  val Equal = "Equal".asInstanceOf[InstancePatchStateOperatorType]
  val NotEqual = "NotEqual".asInstanceOf[InstancePatchStateOperatorType]
  val LessThan = "LessThan".asInstanceOf[InstancePatchStateOperatorType]
  val GreaterThan = "GreaterThan".asInstanceOf[InstancePatchStateOperatorType]

  @inline def values: js.Array[InstancePatchStateOperatorType] = js.Array(Equal, NotEqual, LessThan, GreaterThan)
}

@js.native
sealed trait InventoryAttributeDataType extends js.Any
object InventoryAttributeDataType {
  val string = "string".asInstanceOf[InventoryAttributeDataType]
  val number = "number".asInstanceOf[InventoryAttributeDataType]

  @inline def values: js.Array[InventoryAttributeDataType] = js.Array(string, number)
}

@js.native
sealed trait InventoryDeletionStatus extends js.Any
object InventoryDeletionStatus {
  val InProgress = "InProgress".asInstanceOf[InventoryDeletionStatus]
  val Complete = "Complete".asInstanceOf[InventoryDeletionStatus]

  @inline def values: js.Array[InventoryDeletionStatus] = js.Array(InProgress, Complete)
}

@js.native
sealed trait InventoryQueryOperatorType extends js.Any
object InventoryQueryOperatorType {
  val Equal = "Equal".asInstanceOf[InventoryQueryOperatorType]
  val NotEqual = "NotEqual".asInstanceOf[InventoryQueryOperatorType]
  val BeginWith = "BeginWith".asInstanceOf[InventoryQueryOperatorType]
  val LessThan = "LessThan".asInstanceOf[InventoryQueryOperatorType]
  val GreaterThan = "GreaterThan".asInstanceOf[InventoryQueryOperatorType]
  val Exists = "Exists".asInstanceOf[InventoryQueryOperatorType]

  @inline def values: js.Array[InventoryQueryOperatorType] = js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
}

@js.native
sealed trait InventorySchemaDeleteOption extends js.Any
object InventorySchemaDeleteOption {
  val DisableSchema = "DisableSchema".asInstanceOf[InventorySchemaDeleteOption]
  val DeleteSchema = "DeleteSchema".asInstanceOf[InventorySchemaDeleteOption]

  @inline def values: js.Array[InventorySchemaDeleteOption] = js.Array(DisableSchema, DeleteSchema)
}

@js.native
sealed trait LastResourceDataSyncStatus extends js.Any
object LastResourceDataSyncStatus {
  val Successful = "Successful".asInstanceOf[LastResourceDataSyncStatus]
  val Failed = "Failed".asInstanceOf[LastResourceDataSyncStatus]
  val InProgress = "InProgress".asInstanceOf[LastResourceDataSyncStatus]

  @inline def values: js.Array[LastResourceDataSyncStatus] = js.Array(Successful, Failed, InProgress)
}

@js.native
sealed trait MaintenanceWindowExecutionStatus extends js.Any
object MaintenanceWindowExecutionStatus {
  val PENDING = "PENDING".asInstanceOf[MaintenanceWindowExecutionStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[MaintenanceWindowExecutionStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[MaintenanceWindowExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[MaintenanceWindowExecutionStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[MaintenanceWindowExecutionStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[MaintenanceWindowExecutionStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[MaintenanceWindowExecutionStatus]
  val SKIPPED_OVERLAPPING = "SKIPPED_OVERLAPPING".asInstanceOf[MaintenanceWindowExecutionStatus]

  @inline def values: js.Array[MaintenanceWindowExecutionStatus] = js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING)
}

@js.native
sealed trait MaintenanceWindowResourceType extends js.Any
object MaintenanceWindowResourceType {
  val INSTANCE = "INSTANCE".asInstanceOf[MaintenanceWindowResourceType]
  val RESOURCE_GROUP = "RESOURCE_GROUP".asInstanceOf[MaintenanceWindowResourceType]

  @inline def values: js.Array[MaintenanceWindowResourceType] = js.Array(INSTANCE, RESOURCE_GROUP)
}

@js.native
sealed trait MaintenanceWindowTaskCutoffBehavior extends js.Any
object MaintenanceWindowTaskCutoffBehavior {
  val CONTINUE_TASK = "CONTINUE_TASK".asInstanceOf[MaintenanceWindowTaskCutoffBehavior]
  val CANCEL_TASK = "CANCEL_TASK".asInstanceOf[MaintenanceWindowTaskCutoffBehavior]

  @inline def values: js.Array[MaintenanceWindowTaskCutoffBehavior] = js.Array(CONTINUE_TASK, CANCEL_TASK)
}

@js.native
sealed trait MaintenanceWindowTaskType extends js.Any
object MaintenanceWindowTaskType {
  val RUN_COMMAND = "RUN_COMMAND".asInstanceOf[MaintenanceWindowTaskType]
  val AUTOMATION = "AUTOMATION".asInstanceOf[MaintenanceWindowTaskType]
  val STEP_FUNCTIONS = "STEP_FUNCTIONS".asInstanceOf[MaintenanceWindowTaskType]
  val LAMBDA = "LAMBDA".asInstanceOf[MaintenanceWindowTaskType]

  @inline def values: js.Array[MaintenanceWindowTaskType] = js.Array(RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA)
}

@js.native
sealed trait NotificationEvent extends js.Any
object NotificationEvent {
  val All = "All".asInstanceOf[NotificationEvent]
  val InProgress = "InProgress".asInstanceOf[NotificationEvent]
  val Success = "Success".asInstanceOf[NotificationEvent]
  val TimedOut = "TimedOut".asInstanceOf[NotificationEvent]
  val Cancelled = "Cancelled".asInstanceOf[NotificationEvent]
  val Failed = "Failed".asInstanceOf[NotificationEvent]

  @inline def values: js.Array[NotificationEvent] = js.Array(All, InProgress, Success, TimedOut, Cancelled, Failed)
}

@js.native
sealed trait NotificationType extends js.Any
object NotificationType {
  val Command = "Command".asInstanceOf[NotificationType]
  val Invocation = "Invocation".asInstanceOf[NotificationType]

  @inline def values: js.Array[NotificationType] = js.Array(Command, Invocation)
}

@js.native
sealed trait OperatingSystem extends js.Any
object OperatingSystem {
  val WINDOWS = "WINDOWS".asInstanceOf[OperatingSystem]
  val AMAZON_LINUX = "AMAZON_LINUX".asInstanceOf[OperatingSystem]
  val AMAZON_LINUX_2 = "AMAZON_LINUX_2".asInstanceOf[OperatingSystem]
  val AMAZON_LINUX_2022 = "AMAZON_LINUX_2022".asInstanceOf[OperatingSystem]
  val UBUNTU = "UBUNTU".asInstanceOf[OperatingSystem]
  val REDHAT_ENTERPRISE_LINUX = "REDHAT_ENTERPRISE_LINUX".asInstanceOf[OperatingSystem]
  val SUSE = "SUSE".asInstanceOf[OperatingSystem]
  val CENTOS = "CENTOS".asInstanceOf[OperatingSystem]
  val ORACLE_LINUX = "ORACLE_LINUX".asInstanceOf[OperatingSystem]
  val DEBIAN = "DEBIAN".asInstanceOf[OperatingSystem]
  val MACOS = "MACOS".asInstanceOf[OperatingSystem]
  val RASPBIAN = "RASPBIAN".asInstanceOf[OperatingSystem]
  val ROCKY_LINUX = "ROCKY_LINUX".asInstanceOf[OperatingSystem]

  @inline def values: js.Array[OperatingSystem] = js.Array(WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, AMAZON_LINUX_2022, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN, MACOS, RASPBIAN, ROCKY_LINUX)
}

@js.native
sealed trait OpsFilterOperatorType extends js.Any
object OpsFilterOperatorType {
  val Equal = "Equal".asInstanceOf[OpsFilterOperatorType]
  val NotEqual = "NotEqual".asInstanceOf[OpsFilterOperatorType]
  val BeginWith = "BeginWith".asInstanceOf[OpsFilterOperatorType]
  val LessThan = "LessThan".asInstanceOf[OpsFilterOperatorType]
  val GreaterThan = "GreaterThan".asInstanceOf[OpsFilterOperatorType]
  val Exists = "Exists".asInstanceOf[OpsFilterOperatorType]

  @inline def values: js.Array[OpsFilterOperatorType] = js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
}

@js.native
sealed trait OpsItemDataType extends js.Any
object OpsItemDataType {
  val SearchableString = "SearchableString".asInstanceOf[OpsItemDataType]
  val String = "String".asInstanceOf[OpsItemDataType]

  @inline def values: js.Array[OpsItemDataType] = js.Array(SearchableString, String)
}

@js.native
sealed trait OpsItemEventFilterKey extends js.Any
object OpsItemEventFilterKey {
  val OpsItemId = "OpsItemId".asInstanceOf[OpsItemEventFilterKey]

  @inline def values: js.Array[OpsItemEventFilterKey] = js.Array(OpsItemId)
}

@js.native
sealed trait OpsItemEventFilterOperator extends js.Any
object OpsItemEventFilterOperator {
  val Equal = "Equal".asInstanceOf[OpsItemEventFilterOperator]

  @inline def values: js.Array[OpsItemEventFilterOperator] = js.Array(Equal)
}

@js.native
sealed trait OpsItemFilterKey extends js.Any
object OpsItemFilterKey {
  val Status = "Status".asInstanceOf[OpsItemFilterKey]
  val CreatedBy = "CreatedBy".asInstanceOf[OpsItemFilterKey]
  val Source = "Source".asInstanceOf[OpsItemFilterKey]
  val Priority = "Priority".asInstanceOf[OpsItemFilterKey]
  val Title = "Title".asInstanceOf[OpsItemFilterKey]
  val OpsItemId = "OpsItemId".asInstanceOf[OpsItemFilterKey]
  val CreatedTime = "CreatedTime".asInstanceOf[OpsItemFilterKey]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[OpsItemFilterKey]
  val ActualStartTime = "ActualStartTime".asInstanceOf[OpsItemFilterKey]
  val ActualEndTime = "ActualEndTime".asInstanceOf[OpsItemFilterKey]
  val PlannedStartTime = "PlannedStartTime".asInstanceOf[OpsItemFilterKey]
  val PlannedEndTime = "PlannedEndTime".asInstanceOf[OpsItemFilterKey]
  val OperationalData = "OperationalData".asInstanceOf[OpsItemFilterKey]
  val OperationalDataKey = "OperationalDataKey".asInstanceOf[OpsItemFilterKey]
  val OperationalDataValue = "OperationalDataValue".asInstanceOf[OpsItemFilterKey]
  val ResourceId = "ResourceId".asInstanceOf[OpsItemFilterKey]
  val AutomationId = "AutomationId".asInstanceOf[OpsItemFilterKey]
  val Category = "Category".asInstanceOf[OpsItemFilterKey]
  val Severity = "Severity".asInstanceOf[OpsItemFilterKey]
  val OpsItemType = "OpsItemType".asInstanceOf[OpsItemFilterKey]
  val ChangeRequestByRequesterArn = "ChangeRequestByRequesterArn".asInstanceOf[OpsItemFilterKey]
  val ChangeRequestByRequesterName = "ChangeRequestByRequesterName".asInstanceOf[OpsItemFilterKey]
  val ChangeRequestByApproverArn = "ChangeRequestByApproverArn".asInstanceOf[OpsItemFilterKey]
  val ChangeRequestByApproverName = "ChangeRequestByApproverName".asInstanceOf[OpsItemFilterKey]
  val ChangeRequestByTemplate = "ChangeRequestByTemplate".asInstanceOf[OpsItemFilterKey]
  val ChangeRequestByTargetsResourceGroup = "ChangeRequestByTargetsResourceGroup".asInstanceOf[OpsItemFilterKey]
  val InsightByType = "InsightByType".asInstanceOf[OpsItemFilterKey]
  val AccountId = "AccountId".asInstanceOf[OpsItemFilterKey]

  @inline def values: js.Array[OpsItemFilterKey] = js.Array(
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
    InsightByType,
    AccountId
  )
}

@js.native
sealed trait OpsItemFilterOperator extends js.Any
object OpsItemFilterOperator {
  val Equal = "Equal".asInstanceOf[OpsItemFilterOperator]
  val Contains = "Contains".asInstanceOf[OpsItemFilterOperator]
  val GreaterThan = "GreaterThan".asInstanceOf[OpsItemFilterOperator]
  val LessThan = "LessThan".asInstanceOf[OpsItemFilterOperator]

  @inline def values: js.Array[OpsItemFilterOperator] = js.Array(Equal, Contains, GreaterThan, LessThan)
}

@js.native
sealed trait OpsItemRelatedItemsFilterKey extends js.Any
object OpsItemRelatedItemsFilterKey {
  val ResourceType = "ResourceType".asInstanceOf[OpsItemRelatedItemsFilterKey]
  val AssociationId = "AssociationId".asInstanceOf[OpsItemRelatedItemsFilterKey]
  val ResourceUri = "ResourceUri".asInstanceOf[OpsItemRelatedItemsFilterKey]

  @inline def values: js.Array[OpsItemRelatedItemsFilterKey] = js.Array(ResourceType, AssociationId, ResourceUri)
}

@js.native
sealed trait OpsItemRelatedItemsFilterOperator extends js.Any
object OpsItemRelatedItemsFilterOperator {
  val Equal = "Equal".asInstanceOf[OpsItemRelatedItemsFilterOperator]

  @inline def values: js.Array[OpsItemRelatedItemsFilterOperator] = js.Array(Equal)
}

@js.native
sealed trait OpsItemStatus extends js.Any
object OpsItemStatus {
  val Open = "Open".asInstanceOf[OpsItemStatus]
  val InProgress = "InProgress".asInstanceOf[OpsItemStatus]
  val Resolved = "Resolved".asInstanceOf[OpsItemStatus]
  val Pending = "Pending".asInstanceOf[OpsItemStatus]
  val TimedOut = "TimedOut".asInstanceOf[OpsItemStatus]
  val Cancelling = "Cancelling".asInstanceOf[OpsItemStatus]
  val Cancelled = "Cancelled".asInstanceOf[OpsItemStatus]
  val Failed = "Failed".asInstanceOf[OpsItemStatus]
  val CompletedWithSuccess = "CompletedWithSuccess".asInstanceOf[OpsItemStatus]
  val CompletedWithFailure = "CompletedWithFailure".asInstanceOf[OpsItemStatus]
  val Scheduled = "Scheduled".asInstanceOf[OpsItemStatus]
  val RunbookInProgress = "RunbookInProgress".asInstanceOf[OpsItemStatus]
  val PendingChangeCalendarOverride = "PendingChangeCalendarOverride".asInstanceOf[OpsItemStatus]
  val ChangeCalendarOverrideApproved = "ChangeCalendarOverrideApproved".asInstanceOf[OpsItemStatus]
  val ChangeCalendarOverrideRejected = "ChangeCalendarOverrideRejected".asInstanceOf[OpsItemStatus]
  val PendingApproval = "PendingApproval".asInstanceOf[OpsItemStatus]
  val Approved = "Approved".asInstanceOf[OpsItemStatus]
  val Rejected = "Rejected".asInstanceOf[OpsItemStatus]
  val Closed = "Closed".asInstanceOf[OpsItemStatus]

  @inline def values: js.Array[OpsItemStatus] = js.Array(
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

@js.native
sealed trait ParameterTier extends js.Any
object ParameterTier {
  val Standard = "Standard".asInstanceOf[ParameterTier]
  val Advanced = "Advanced".asInstanceOf[ParameterTier]
  val `Intelligent-Tiering` = "Intelligent-Tiering".asInstanceOf[ParameterTier]

  @inline def values: js.Array[ParameterTier] = js.Array(Standard, Advanced, `Intelligent-Tiering`)
}

@js.native
sealed trait ParameterType extends js.Any
object ParameterType {
  val String = "String".asInstanceOf[ParameterType]
  val StringList = "StringList".asInstanceOf[ParameterType]
  val SecureString = "SecureString".asInstanceOf[ParameterType]

  @inline def values: js.Array[ParameterType] = js.Array(String, StringList, SecureString)
}

@js.native
sealed trait ParametersFilterKey extends js.Any
object ParametersFilterKey {
  val Name = "Name".asInstanceOf[ParametersFilterKey]
  val Type = "Type".asInstanceOf[ParametersFilterKey]
  val KeyId = "KeyId".asInstanceOf[ParametersFilterKey]

  @inline def values: js.Array[ParametersFilterKey] = js.Array(Name, Type, KeyId)
}

@js.native
sealed trait PatchAction extends js.Any
object PatchAction {
  val ALLOW_AS_DEPENDENCY = "ALLOW_AS_DEPENDENCY".asInstanceOf[PatchAction]
  val BLOCK = "BLOCK".asInstanceOf[PatchAction]

  @inline def values: js.Array[PatchAction] = js.Array(ALLOW_AS_DEPENDENCY, BLOCK)
}

@js.native
sealed trait PatchComplianceDataState extends js.Any
object PatchComplianceDataState {
  val INSTALLED = "INSTALLED".asInstanceOf[PatchComplianceDataState]
  val INSTALLED_OTHER = "INSTALLED_OTHER".asInstanceOf[PatchComplianceDataState]
  val INSTALLED_PENDING_REBOOT = "INSTALLED_PENDING_REBOOT".asInstanceOf[PatchComplianceDataState]
  val INSTALLED_REJECTED = "INSTALLED_REJECTED".asInstanceOf[PatchComplianceDataState]
  val MISSING = "MISSING".asInstanceOf[PatchComplianceDataState]
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[PatchComplianceDataState]
  val FAILED = "FAILED".asInstanceOf[PatchComplianceDataState]

  @inline def values: js.Array[PatchComplianceDataState] = js.Array(INSTALLED, INSTALLED_OTHER, INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE, FAILED)
}

@js.native
sealed trait PatchComplianceLevel extends js.Any
object PatchComplianceLevel {
  val CRITICAL = "CRITICAL".asInstanceOf[PatchComplianceLevel]
  val HIGH = "HIGH".asInstanceOf[PatchComplianceLevel]
  val MEDIUM = "MEDIUM".asInstanceOf[PatchComplianceLevel]
  val LOW = "LOW".asInstanceOf[PatchComplianceLevel]
  val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[PatchComplianceLevel]
  val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[PatchComplianceLevel]

  @inline def values: js.Array[PatchComplianceLevel] = js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
}

@js.native
sealed trait PatchDeploymentStatus extends js.Any
object PatchDeploymentStatus {
  val APPROVED = "APPROVED".asInstanceOf[PatchDeploymentStatus]
  val PENDING_APPROVAL = "PENDING_APPROVAL".asInstanceOf[PatchDeploymentStatus]
  val EXPLICIT_APPROVED = "EXPLICIT_APPROVED".asInstanceOf[PatchDeploymentStatus]
  val EXPLICIT_REJECTED = "EXPLICIT_REJECTED".asInstanceOf[PatchDeploymentStatus]

  @inline def values: js.Array[PatchDeploymentStatus] = js.Array(APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED)
}

@js.native
sealed trait PatchFilterKey extends js.Any
object PatchFilterKey {
  val ARCH = "ARCH".asInstanceOf[PatchFilterKey]
  val ADVISORY_ID = "ADVISORY_ID".asInstanceOf[PatchFilterKey]
  val BUGZILLA_ID = "BUGZILLA_ID".asInstanceOf[PatchFilterKey]
  val PATCH_SET = "PATCH_SET".asInstanceOf[PatchFilterKey]
  val PRODUCT = "PRODUCT".asInstanceOf[PatchFilterKey]
  val PRODUCT_FAMILY = "PRODUCT_FAMILY".asInstanceOf[PatchFilterKey]
  val CLASSIFICATION = "CLASSIFICATION".asInstanceOf[PatchFilterKey]
  val CVE_ID = "CVE_ID".asInstanceOf[PatchFilterKey]
  val EPOCH = "EPOCH".asInstanceOf[PatchFilterKey]
  val MSRC_SEVERITY = "MSRC_SEVERITY".asInstanceOf[PatchFilterKey]
  val NAME = "NAME".asInstanceOf[PatchFilterKey]
  val PATCH_ID = "PATCH_ID".asInstanceOf[PatchFilterKey]
  val SECTION = "SECTION".asInstanceOf[PatchFilterKey]
  val PRIORITY = "PRIORITY".asInstanceOf[PatchFilterKey]
  val REPOSITORY = "REPOSITORY".asInstanceOf[PatchFilterKey]
  val RELEASE = "RELEASE".asInstanceOf[PatchFilterKey]
  val SEVERITY = "SEVERITY".asInstanceOf[PatchFilterKey]
  val SECURITY = "SECURITY".asInstanceOf[PatchFilterKey]
  val VERSION = "VERSION".asInstanceOf[PatchFilterKey]

  @inline def values: js.Array[PatchFilterKey] = js.Array(
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

@js.native
sealed trait PatchOperationType extends js.Any
object PatchOperationType {
  val Scan = "Scan".asInstanceOf[PatchOperationType]
  val Install = "Install".asInstanceOf[PatchOperationType]

  @inline def values: js.Array[PatchOperationType] = js.Array(Scan, Install)
}

@js.native
sealed trait PatchProperty extends js.Any
object PatchProperty {
  val PRODUCT = "PRODUCT".asInstanceOf[PatchProperty]
  val PRODUCT_FAMILY = "PRODUCT_FAMILY".asInstanceOf[PatchProperty]
  val CLASSIFICATION = "CLASSIFICATION".asInstanceOf[PatchProperty]
  val MSRC_SEVERITY = "MSRC_SEVERITY".asInstanceOf[PatchProperty]
  val PRIORITY = "PRIORITY".asInstanceOf[PatchProperty]
  val SEVERITY = "SEVERITY".asInstanceOf[PatchProperty]

  @inline def values: js.Array[PatchProperty] = js.Array(PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY)
}

@js.native
sealed trait PatchSet extends js.Any
object PatchSet {
  val OS = "OS".asInstanceOf[PatchSet]
  val APPLICATION = "APPLICATION".asInstanceOf[PatchSet]

  @inline def values: js.Array[PatchSet] = js.Array(OS, APPLICATION)
}

@js.native
sealed trait PingStatus extends js.Any
object PingStatus {
  val Online = "Online".asInstanceOf[PingStatus]
  val ConnectionLost = "ConnectionLost".asInstanceOf[PingStatus]
  val Inactive = "Inactive".asInstanceOf[PingStatus]

  @inline def values: js.Array[PingStatus] = js.Array(Online, ConnectionLost, Inactive)
}

@js.native
sealed trait PlatformType extends js.Any
object PlatformType {
  val Windows = "Windows".asInstanceOf[PlatformType]
  val Linux = "Linux".asInstanceOf[PlatformType]
  val MacOS = "MacOS".asInstanceOf[PlatformType]

  @inline def values: js.Array[PlatformType] = js.Array(Windows, Linux, MacOS)
}

@js.native
sealed trait RebootOption extends js.Any
object RebootOption {
  val RebootIfNeeded = "RebootIfNeeded".asInstanceOf[RebootOption]
  val NoReboot = "NoReboot".asInstanceOf[RebootOption]

  @inline def values: js.Array[RebootOption] = js.Array(RebootIfNeeded, NoReboot)
}

@js.native
sealed trait ResourceDataSyncS3Format extends js.Any
object ResourceDataSyncS3Format {
  val JsonSerDe = "JsonSerDe".asInstanceOf[ResourceDataSyncS3Format]

  @inline def values: js.Array[ResourceDataSyncS3Format] = js.Array(JsonSerDe)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val ManagedInstance = "ManagedInstance".asInstanceOf[ResourceType]
  val Document = "Document".asInstanceOf[ResourceType]
  val EC2Instance = "EC2Instance".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(ManagedInstance, Document, EC2Instance)
}

@js.native
sealed trait ResourceTypeForTagging extends js.Any
object ResourceTypeForTagging {
  val Document = "Document".asInstanceOf[ResourceTypeForTagging]
  val ManagedInstance = "ManagedInstance".asInstanceOf[ResourceTypeForTagging]
  val MaintenanceWindow = "MaintenanceWindow".asInstanceOf[ResourceTypeForTagging]
  val Parameter = "Parameter".asInstanceOf[ResourceTypeForTagging]
  val PatchBaseline = "PatchBaseline".asInstanceOf[ResourceTypeForTagging]
  val OpsItem = "OpsItem".asInstanceOf[ResourceTypeForTagging]
  val OpsMetadata = "OpsMetadata".asInstanceOf[ResourceTypeForTagging]
  val Automation = "Automation".asInstanceOf[ResourceTypeForTagging]
  val Association = "Association".asInstanceOf[ResourceTypeForTagging]

  @inline def values: js.Array[ResourceTypeForTagging] = js.Array(Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem, OpsMetadata, Automation, Association)
}

@js.native
sealed trait ReviewStatus extends js.Any
object ReviewStatus {
  val APPROVED = "APPROVED".asInstanceOf[ReviewStatus]
  val NOT_REVIEWED = "NOT_REVIEWED".asInstanceOf[ReviewStatus]
  val PENDING = "PENDING".asInstanceOf[ReviewStatus]
  val REJECTED = "REJECTED".asInstanceOf[ReviewStatus]

  @inline def values: js.Array[ReviewStatus] = js.Array(APPROVED, NOT_REVIEWED, PENDING, REJECTED)
}

@js.native
sealed trait SessionFilterKey extends js.Any
object SessionFilterKey {
  val InvokedAfter = "InvokedAfter".asInstanceOf[SessionFilterKey]
  val InvokedBefore = "InvokedBefore".asInstanceOf[SessionFilterKey]
  val Target = "Target".asInstanceOf[SessionFilterKey]
  val Owner = "Owner".asInstanceOf[SessionFilterKey]
  val Status = "Status".asInstanceOf[SessionFilterKey]
  val SessionId = "SessionId".asInstanceOf[SessionFilterKey]

  @inline def values: js.Array[SessionFilterKey] = js.Array(InvokedAfter, InvokedBefore, Target, Owner, Status, SessionId)
}

@js.native
sealed trait SessionState extends js.Any
object SessionState {
  val Active = "Active".asInstanceOf[SessionState]
  val History = "History".asInstanceOf[SessionState]

  @inline def values: js.Array[SessionState] = js.Array(Active, History)
}

@js.native
sealed trait SessionStatus extends js.Any
object SessionStatus {
  val Connected = "Connected".asInstanceOf[SessionStatus]
  val Connecting = "Connecting".asInstanceOf[SessionStatus]
  val Disconnected = "Disconnected".asInstanceOf[SessionStatus]
  val Terminated = "Terminated".asInstanceOf[SessionStatus]
  val Terminating = "Terminating".asInstanceOf[SessionStatus]
  val Failed = "Failed".asInstanceOf[SessionStatus]

  @inline def values: js.Array[SessionStatus] = js.Array(Connected, Connecting, Disconnected, Terminated, Terminating, Failed)
}

@js.native
sealed trait SignalType extends js.Any
object SignalType {
  val Approve = "Approve".asInstanceOf[SignalType]
  val Reject = "Reject".asInstanceOf[SignalType]
  val StartStep = "StartStep".asInstanceOf[SignalType]
  val StopStep = "StopStep".asInstanceOf[SignalType]
  val Resume = "Resume".asInstanceOf[SignalType]

  @inline def values: js.Array[SignalType] = js.Array(Approve, Reject, StartStep, StopStep, Resume)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val `AWS::EC2::Instance` = "AWS::EC2::Instance".asInstanceOf[SourceType]
  val `AWS::IoT::Thing` = "AWS::IoT::Thing".asInstanceOf[SourceType]
  val `AWS::SSM::ManagedInstance` = "AWS::SSM::ManagedInstance".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(`AWS::EC2::Instance`, `AWS::IoT::Thing`, `AWS::SSM::ManagedInstance`)
}

@js.native
sealed trait StepExecutionFilterKey extends js.Any
object StepExecutionFilterKey {
  val StartTimeBefore = "StartTimeBefore".asInstanceOf[StepExecutionFilterKey]
  val StartTimeAfter = "StartTimeAfter".asInstanceOf[StepExecutionFilterKey]
  val StepExecutionStatus = "StepExecutionStatus".asInstanceOf[StepExecutionFilterKey]
  val StepExecutionId = "StepExecutionId".asInstanceOf[StepExecutionFilterKey]
  val StepName = "StepName".asInstanceOf[StepExecutionFilterKey]
  val Action = "Action".asInstanceOf[StepExecutionFilterKey]

  @inline def values: js.Array[StepExecutionFilterKey] = js.Array(StartTimeBefore, StartTimeAfter, StepExecutionStatus, StepExecutionId, StepName, Action)
}

@js.native
sealed trait StopType extends js.Any
object StopType {
  val Complete = "Complete".asInstanceOf[StopType]
  val Cancel = "Cancel".asInstanceOf[StopType]

  @inline def values: js.Array[StopType] = js.Array(Complete, Cancel)
}
