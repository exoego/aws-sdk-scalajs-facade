package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object ssm {
  type Account = String
  type AccountId = String
  type AccountIdList = js.Array[AccountId]
  type Accounts = js.Array[Account]
  type ActivationCode = String
  type ActivationDescription = String
  type ActivationId = String
  type ActivationList = js.Array[Activation]
  type AgentErrorCode = String
  type AggregatorSchemaOnly = Boolean
  type AllowedPattern = String
  type ApproveAfterDays = Int
  type AssociationComplianceSeverity = String
  type AssociationDescriptionList = js.Array[AssociationDescription]
  type AssociationExecutionFilterKey = String
  type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue = String
  type AssociationExecutionId = String
  type AssociationExecutionTargetsFilterKey = String
  type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = String
  type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[AssociationExecution]
  type AssociationFilterKey = String
  type AssociationFilterList = js.Array[AssociationFilter]
  type AssociationFilterOperatorType = String
  type AssociationFilterValue = String
  type AssociationId = String
  type AssociationIdList = js.Array[AssociationId]
  type AssociationList = js.Array[Association]
  type AssociationName = String
  type AssociationResourceId = String
  type AssociationResourceType = String
  type AssociationStatusAggregatedCount = js.Dictionary[InstanceCount]
  type AssociationStatusName = String
  type AssociationVersion = String
  type AssociationVersionList = js.Array[AssociationVersionInfo]
  type AttachmentContentList = js.Array[AttachmentContent]
  type AttachmentHash = String
  type AttachmentHashType = String
  type AttachmentInformationList = js.Array[AttachmentInformation]
  type AttachmentName = String
  type AttachmentUrl = String
  type AttachmentsSourceKey = String
  type AttachmentsSourceList = js.Array[AttachmentsSource]
  type AttachmentsSourceValue = String
  type AttachmentsSourceValues = js.Array[AttachmentsSourceValue]
  type AttributeName = String
  type AttributeValue = String
  type AutomationActionName = String
  type AutomationExecutionFilterKey = String
  type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue = String
  type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId = String
  type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]
  type AutomationExecutionStatus = String
  type AutomationParameterKey = String
  type AutomationParameterMap = js.Dictionary[AutomationParameterValueList]
  type AutomationParameterValue = String
  type AutomationParameterValueList = js.Array[AutomationParameterValue]
  type AutomationType = String
  type BaselineDescription = String
  type BaselineId = String
  type BaselineName = String
  type BatchErrorMessage = String
  type ClientToken = String
  type CloudWatchLogGroupName = String
  type CloudWatchOutputEnabled = Boolean
  type CommandFilterKey = String
  type CommandFilterList = js.Array[CommandFilter]
  type CommandFilterValue = String
  type CommandId = String
  type CommandInvocationList = js.Array[CommandInvocation]
  type CommandInvocationStatus = String
  type CommandList = js.Array[Command]
  type CommandMaxResults = Int
  type CommandPluginList = js.Array[CommandPlugin]
  type CommandPluginName = String
  type CommandPluginOutput = String
  type CommandPluginStatus = String
  type CommandStatus = String
  type Comment = String
  type CompletedCount = Int
  type ComplianceExecutionId = String
  type ComplianceExecutionType = String
  type ComplianceFilterValue = String
  type ComplianceItemContentHash = String
  type ComplianceItemDetails = js.Dictionary[AttributeValue]
  type ComplianceItemEntryList = js.Array[ComplianceItemEntry]
  type ComplianceItemId = String
  type ComplianceItemList = js.Array[ComplianceItem]
  type ComplianceItemTitle = String
  type ComplianceQueryOperatorType = String
  type ComplianceResourceId = String
  type ComplianceResourceIdList = js.Array[ComplianceResourceId]
  type ComplianceResourceType = String
  type ComplianceResourceTypeList = js.Array[ComplianceResourceType]
  type ComplianceSeverity = String
  type ComplianceStatus = String
  type ComplianceStringFilterKey = String
  type ComplianceStringFilterList = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount = Int
  type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName = String
  type ComputerName = String
  type ConnectionStatus = String
  type ContentLength = Double
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate = js.Date
  type DateTime = js.Date
  type DefaultBaseline = Boolean
  type DefaultInstanceName = String
  type DeliveryTimedOutCount = Int
  type DescribeActivationsFilterKeys = String
  type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument = String
  type DocumentARN = String
  type DocumentContent = String
  type DocumentFilterKey = String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = String
  type DocumentFormat = String
  type DocumentHash = String
  type DocumentHashType = String
  type DocumentIdentifierList = js.Array[DocumentIdentifier]
  type DocumentKeyValuesFilterKey = String
  type DocumentKeyValuesFilterList = js.Array[DocumentKeyValuesFilter]
  type DocumentKeyValuesFilterValue = String
  type DocumentKeyValuesFilterValues = js.Array[DocumentKeyValuesFilterValue]
  type DocumentName = String
  type DocumentOwner = String
  type DocumentParameterDefaultValue = String
  type DocumentParameterDescrption = String
  type DocumentParameterList = js.Array[DocumentParameter]
  type DocumentParameterName = String
  type DocumentParameterType = String
  type DocumentPermissionType = String
  type DocumentSchemaVersion = String
  type DocumentSha1 = String
  type DocumentStatus = String
  type DocumentStatusInformation = String
  type DocumentType = String
  type DocumentVersion = String
  type DocumentVersionList = js.Array[DocumentVersionInfo]
  type DocumentVersionName = String
  type DocumentVersionNumber = String
  type DryRun = Boolean
  type EffectiveInstanceAssociationMaxResults = Int
  type EffectivePatchList = js.Array[EffectivePatch]
  type ErrorCount = Int
  type ExecutionMode = String
  type ExecutionRoleName = String
  type ExpirationDate = js.Date
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  type Fault = String
  type GetInventorySchemaMaxResults = Int
  type GetParametersByPathMaxResults = Int
  type IPAddress = String
  type IamRole = String
  type IdempotencyToken = String
  type InstallOverrideList = String
  type InstanceAssociationExecutionSummary = String
  type InstanceAssociationList = js.Array[InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount = js.Dictionary[InstanceCount]
  type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]
  type InstanceCount = Int
  type InstanceId = String
  type InstanceIdList = js.Array[InstanceId]
  type InstanceInformationFilterKey = String
  type InstanceInformationFilterList = js.Array[InstanceInformationFilter]
  type InstanceInformationFilterValue = String
  type InstanceInformationFilterValueSet = js.Array[InstanceInformationFilterValue]
  type InstanceInformationList = js.Array[InstanceInformation]
  type InstanceInformationStringFilterKey = String
  type InstanceInformationStringFilterList = js.Array[InstanceInformationStringFilter]
  type InstancePatchStateFilterKey = String
  type InstancePatchStateFilterList = js.Array[InstancePatchStateFilter]
  type InstancePatchStateFilterValue = String
  type InstancePatchStateFilterValues = js.Array[InstancePatchStateFilterValue]
  type InstancePatchStateList = js.Array[InstancePatchState]
  type InstancePatchStateOperatorType = String
  type InstancePatchStatesList = js.Array[InstancePatchState]
  type InstanceTagName = String
  type InstancesCount = Int
  type InventoryAggregatorExpression = String
  type InventoryAggregatorList = js.Array[InventoryAggregator]
  type InventoryAttributeDataType = String
  type InventoryDeletionId = String
  type InventoryDeletionLastStatusMessage = String
  type InventoryDeletionLastStatusUpdateTime = js.Date
  type InventoryDeletionStartTime = js.Date
  type InventoryDeletionStatus = String
  type InventoryDeletionSummaryItems = js.Array[InventoryDeletionSummaryItem]
  type InventoryDeletionsList = js.Array[InventoryDeletionStatusItem]
  type InventoryFilterKey = String
  type InventoryFilterList = js.Array[InventoryFilter]
  type InventoryFilterValue = String
  type InventoryFilterValueList = js.Array[InventoryFilterValue]
  type InventoryGroupList = js.Array[InventoryGroup]
  type InventoryGroupName = String
  type InventoryItemAttributeList = js.Array[InventoryItemAttribute]
  type InventoryItemAttributeName = String
  type InventoryItemCaptureTime = String
  type InventoryItemContentContext = js.Dictionary[AttributeValue]
  type InventoryItemContentHash = String
  type InventoryItemEntry = js.Dictionary[AttributeValue]
  type InventoryItemEntryList = js.Array[InventoryItemEntry]
  type InventoryItemList = js.Array[InventoryItem]
  type InventoryItemSchemaResultList = js.Array[InventoryItemSchema]
  type InventoryItemSchemaVersion = String
  type InventoryItemTypeName = String
  type InventoryItemTypeNameFilter = String
  type InventoryQueryOperatorType = String
  type InventoryResultEntityId = String
  type InventoryResultEntityList = js.Array[InventoryResultEntity]
  type InventoryResultItemKey = String
  type InventoryResultItemMap = js.Dictionary[InventoryResultItem]
  type InventorySchemaDeleteOption = String
  type InventoryTypeDisplayName = String
  type InvocationTraceOutput = String
  type IsSubTypeSchema = Boolean
  type KeyList = js.Array[TagKey]
  type LastResourceDataSyncMessage = String
  type LastResourceDataSyncStatus = String
  type LastResourceDataSyncTime = js.Date
  type LastSuccessfulResourceDataSyncTime = js.Date
  type MaintenanceWindowAllowUnassociatedTargets = Boolean
  type MaintenanceWindowCutoff = Int
  type MaintenanceWindowDescription = String
  type MaintenanceWindowDurationHours = Int
  type MaintenanceWindowEnabled = Boolean
  type MaintenanceWindowExecutionId = String
  type MaintenanceWindowExecutionList = js.Array[MaintenanceWindowExecution]
  type MaintenanceWindowExecutionStatus = String
  type MaintenanceWindowExecutionStatusDetails = String
  type MaintenanceWindowExecutionTaskExecutionId = String
  type MaintenanceWindowExecutionTaskId = String
  type MaintenanceWindowExecutionTaskIdList = js.Array[MaintenanceWindowExecutionTaskId]
  type MaintenanceWindowExecutionTaskIdentityList = js.Array[MaintenanceWindowExecutionTaskIdentity]
  type MaintenanceWindowExecutionTaskInvocationId = String
  type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[MaintenanceWindowExecutionTaskInvocationIdentity]
  type MaintenanceWindowExecutionTaskInvocationParameters = String
  type MaintenanceWindowFilterKey = String
  type MaintenanceWindowFilterList = js.Array[MaintenanceWindowFilter]
  type MaintenanceWindowFilterValue = String
  type MaintenanceWindowFilterValues = js.Array[MaintenanceWindowFilterValue]
  type MaintenanceWindowId = String
  type MaintenanceWindowIdentityList = js.Array[MaintenanceWindowIdentity]
  type MaintenanceWindowLambdaClientContext = String
  type MaintenanceWindowLambdaPayload = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MaintenanceWindowLambdaQualifier = String
  type MaintenanceWindowMaxResults = Int
  type MaintenanceWindowName = String
  type MaintenanceWindowResourceType = String
  type MaintenanceWindowSchedule = String
  type MaintenanceWindowSearchMaxResults = Int
  type MaintenanceWindowStepFunctionsInput = String
  type MaintenanceWindowStepFunctionsName = String
  type MaintenanceWindowStringDateTime = String
  type MaintenanceWindowTargetId = String
  type MaintenanceWindowTargetList = js.Array[MaintenanceWindowTarget]
  type MaintenanceWindowTaskArn = String
  type MaintenanceWindowTaskId = String
  type MaintenanceWindowTaskList = js.Array[MaintenanceWindowTask]
  type MaintenanceWindowTaskParameterName = String
  type MaintenanceWindowTaskParameterValue = String
  type MaintenanceWindowTaskParameterValueList = js.Array[MaintenanceWindowTaskParameterValue]
  type MaintenanceWindowTaskParameters = js.Dictionary[MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList = js.Array[MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority = Int
  type MaintenanceWindowTaskTargetId = String
  type MaintenanceWindowTaskType = String
  type MaintenanceWindowTimezone = String
  type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = String
  type MaxConcurrency = String
  type MaxErrors = String
  type MaxResults = Int
  type MaxResultsEC2Compatible = Int
  type NextToken = String
  type NormalStringMap = js.Dictionary[String]
  type NotificationArn = String
  type NotificationEvent = String
  type NotificationEventList = js.Array[NotificationEvent]
  type NotificationType = String
  type OperatingSystem = String
  type OutputSourceId = String
  type OutputSourceType = String
  type OwnerInformation = String
  type PSParameterName = String
  type PSParameterSelector = String
  type PSParameterValue = String
  type PSParameterVersion = Double
  type ParameterDescription = String
  type ParameterHistoryList = js.Array[ParameterHistory]
  type ParameterKeyId = String
  type ParameterLabel = String
  type ParameterLabelList = js.Array[ParameterLabel]
  type ParameterList = js.Array[Parameter]
  type ParameterMetadataList = js.Array[ParameterMetadata]
  type ParameterName = String
  type ParameterNameList = js.Array[PSParameterName]
  type ParameterStringFilterKey = String
  type ParameterStringFilterList = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue = String
  type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption = String
  type ParameterType = String
  type ParameterValue = String
  type ParameterValueList = js.Array[ParameterValue]
  type Parameters = js.Dictionary[ParameterValueList]
  type ParametersFilterKey = String
  type ParametersFilterList = js.Array[ParametersFilter]
  type ParametersFilterValue = String
  type ParametersFilterValueList = js.Array[ParametersFilterValue]
  type PatchAction = String
  type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults = Int
  type PatchClassification = String
  type PatchComplianceDataList = js.Array[PatchComplianceData]
  type PatchComplianceDataState = String
  type PatchComplianceLevel = String
  type PatchComplianceMaxResults = Int
  type PatchContentUrl = String
  type PatchDeploymentStatus = String
  type PatchDescription = String
  type PatchFailedCount = Int
  type PatchFilterKey = String
  type PatchFilterList = js.Array[PatchFilter]
  type PatchFilterValue = String
  type PatchFilterValueList = js.Array[PatchFilterValue]
  type PatchGroup = String
  type PatchGroupList = js.Array[PatchGroup]
  type PatchGroupPatchBaselineMappingList = js.Array[PatchGroupPatchBaselineMapping]
  type PatchId = String
  type PatchIdList = js.Array[PatchId]
  type PatchInstalledCount = Int
  type PatchInstalledOtherCount = Int
  type PatchInstalledRejectedCount = Int
  type PatchKbNumber = String
  type PatchLanguage = String
  type PatchList = js.Array[Patch]
  type PatchMissingCount = Int
  type PatchMsrcNumber = String
  type PatchMsrcSeverity = String
  type PatchNotApplicableCount = Int
  type PatchOperationType = String
  type PatchOrchestratorFilterKey = String
  type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = String
  type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]
  type PatchProduct = String
  type PatchProductFamily = String
  type PatchRuleList = js.Array[PatchRule]
  type PatchSeverity = String
  type PatchSourceConfiguration = String
  type PatchSourceList = js.Array[PatchSource]
  type PatchSourceName = String
  type PatchSourceProduct = String
  type PatchSourceProductList = js.Array[PatchSourceProduct]
  type PatchTitle = String
  type PatchVendor = String
  type PingStatus = String
  type PlatformType = String
  type PlatformTypeList = js.Array[PlatformType]
  type Product = String
  type PutInventoryMessage = String
  type Region = String
  type Regions = js.Array[Region]
  type RegistrationLimit = Int
  type RegistrationsCount = Int
  type RemainingCount = Int
  type ResourceComplianceSummaryItemList = js.Array[ResourceComplianceSummaryItem]
  type ResourceCount = Int
  type ResourceCountByStatus = String
  type ResourceDataSyncAWSKMSKeyARN = String
  type ResourceDataSyncCreatedTime = js.Date
  type ResourceDataSyncItemList = js.Array[ResourceDataSyncItem]
  type ResourceDataSyncName = String
  type ResourceDataSyncS3BucketName = String
  type ResourceDataSyncS3Format = String
  type ResourceDataSyncS3Prefix = String
  type ResourceDataSyncS3Region = String
  type ResourceId = String
  type ResourceType = String
  type ResourceTypeForTagging = String
  type ResponseCode = Int
  type ResultAttributeList = js.Array[ResultAttribute]
  type S3BucketName = String
  type S3KeyPrefix = String
  type S3Region = String
  type ScheduleExpression = String
  type ScheduledWindowExecutionList = js.Array[ScheduledWindowExecution]
  type ServiceRole = String
  type SessionDetails = String
  type SessionFilterKey = String
  type SessionFilterList = js.Array[SessionFilter]
  type SessionFilterValue = String
  type SessionId = String
  type SessionList = js.Array[Session]
  type SessionManagerCloudWatchOutputUrl = String
  type SessionManagerParameterName = String
  type SessionManagerParameterValue = String
  type SessionManagerParameterValueList = js.Array[SessionManagerParameterValue]
  type SessionManagerParameters = js.Dictionary[SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl = String
  type SessionMaxResults = Int
  type SessionOwner = String
  type SessionState = String
  type SessionStatus = String
  type SessionTarget = String
  type SignalType = String
  type SnapshotDownloadUrl = String
  type SnapshotId = String
  type StandardErrorContent = String
  type StandardOutputContent = String
  type StatusAdditionalInfo = String
  type StatusDetails = String
  type StatusMessage = String
  type StatusName = String
  type StepExecutionFilterKey = String
  type StepExecutionFilterList = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue = String
  type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]
  type StepExecutionList = js.Array[StepExecution]
  type StopType = String
  type StreamUrl = String
  type StringDateTime = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetCount = Int
  type TargetKey = String
  type TargetLocations = js.Array[TargetLocation]
  type TargetMap = js.Dictionary[TargetMapValueList]
  type TargetMapKey = String
  type TargetMapValue = String
  type TargetMapValueList = js.Array[TargetMapValue]
  type TargetMaps = js.Array[TargetMap]
  type TargetParameterList = js.Array[ParameterValue]
  type TargetType = String
  type TargetValue = String
  type TargetValues = js.Array[TargetValue]
  type Targets = js.Array[Target]
  type TimeoutSeconds = Int
  type TokenValue = String
  type TotalCount = Int
  type Url = String
  type ValidNextStep = String
  type ValidNextStepList = js.Array[ValidNextStep]
  type Version = String
}

package ssm {
  @js.native
  @JSImport("aws-sdk", "SSM")
  class SSM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult] = js.native
    def cancelCommand(params: CancelCommandRequest): Request[CancelCommandResult] = js.native
    def cancelMaintenanceWindowExecution(params: CancelMaintenanceWindowExecutionRequest): Request[CancelMaintenanceWindowExecutionResult] = js.native
    def createActivation(params: CreateActivationRequest): Request[CreateActivationResult] = js.native
    def createAssociation(params: CreateAssociationRequest): Request[CreateAssociationResult] = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest): Request[CreateAssociationBatchResult] = js.native
    def createDocument(params: CreateDocumentRequest): Request[CreateDocumentResult] = js.native
    def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): Request[CreateMaintenanceWindowResult] = js.native
    def createPatchBaseline(params: CreatePatchBaselineRequest): Request[CreatePatchBaselineResult] = js.native
    def createResourceDataSync(params: CreateResourceDataSyncRequest): Request[CreateResourceDataSyncResult] = js.native
    def deleteActivation(params: DeleteActivationRequest): Request[DeleteActivationResult] = js.native
    def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResult] = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[DeleteDocumentResult] = js.native
    def deleteInventory(params: DeleteInventoryRequest): Request[DeleteInventoryResult] = js.native
    def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): Request[DeleteMaintenanceWindowResult] = js.native
    def deleteParameter(params: DeleteParameterRequest): Request[DeleteParameterResult] = js.native
    def deleteParameters(params: DeleteParametersRequest): Request[DeleteParametersResult] = js.native
    def deletePatchBaseline(params: DeletePatchBaselineRequest): Request[DeletePatchBaselineResult] = js.native
    def deleteResourceDataSync(params: DeleteResourceDataSyncRequest): Request[DeleteResourceDataSyncResult] = js.native
    def deregisterManagedInstance(params: DeregisterManagedInstanceRequest): Request[DeregisterManagedInstanceResult] = js.native
    def deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest): Request[DeregisterPatchBaselineForPatchGroupResult] = js.native
    def deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest): Request[DeregisterTargetFromMaintenanceWindowResult] = js.native
    def deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest): Request[DeregisterTaskFromMaintenanceWindowResult] = js.native
    def describeActivations(params: DescribeActivationsRequest): Request[DescribeActivationsResult] = js.native
    def describeAssociation(params: DescribeAssociationRequest): Request[DescribeAssociationResult] = js.native
    def describeAssociationExecutionTargets(params: DescribeAssociationExecutionTargetsRequest): Request[DescribeAssociationExecutionTargetsResult] = js.native
    def describeAssociationExecutions(params: DescribeAssociationExecutionsRequest): Request[DescribeAssociationExecutionsResult] = js.native
    def describeAutomationExecutions(params: DescribeAutomationExecutionsRequest): Request[DescribeAutomationExecutionsResult] = js.native
    def describeAutomationStepExecutions(params: DescribeAutomationStepExecutionsRequest): Request[DescribeAutomationStepExecutionsResult] = js.native
    def describeAvailablePatches(params: DescribeAvailablePatchesRequest): Request[DescribeAvailablePatchesResult] = js.native
    def describeDocument(params: DescribeDocumentRequest): Request[DescribeDocumentResult] = js.native
    def describeDocumentPermission(params: DescribeDocumentPermissionRequest): Request[DescribeDocumentPermissionResponse] = js.native
    def describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest): Request[DescribeEffectiveInstanceAssociationsResult] = js.native
    def describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest): Request[DescribeEffectivePatchesForPatchBaselineResult] = js.native
    def describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest): Request[DescribeInstanceAssociationsStatusResult] = js.native
    def describeInstanceInformation(params: DescribeInstanceInformationRequest): Request[DescribeInstanceInformationResult] = js.native
    def describeInstancePatchStates(params: DescribeInstancePatchStatesRequest): Request[DescribeInstancePatchStatesResult] = js.native
    def describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest): Request[DescribeInstancePatchStatesForPatchGroupResult] = js.native
    def describeInstancePatches(params: DescribeInstancePatchesRequest): Request[DescribeInstancePatchesResult] = js.native
    def describeInventoryDeletions(params: DescribeInventoryDeletionsRequest): Request[DescribeInventoryDeletionsResult] = js.native
    def describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult] = js.native
    def describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest): Request[DescribeMaintenanceWindowExecutionTasksResult] = js.native
    def describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest): Request[DescribeMaintenanceWindowExecutionsResult] = js.native
    def describeMaintenanceWindowSchedule(params: DescribeMaintenanceWindowScheduleRequest): Request[DescribeMaintenanceWindowScheduleResult] = js.native
    def describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest): Request[DescribeMaintenanceWindowTargetsResult] = js.native
    def describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest): Request[DescribeMaintenanceWindowTasksResult] = js.native
    def describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest): Request[DescribeMaintenanceWindowsResult] = js.native
    def describeMaintenanceWindowsForTarget(params: DescribeMaintenanceWindowsForTargetRequest): Request[DescribeMaintenanceWindowsForTargetResult] = js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResult] = js.native
    def describePatchBaselines(params: DescribePatchBaselinesRequest): Request[DescribePatchBaselinesResult] = js.native
    def describePatchGroupState(params: DescribePatchGroupStateRequest): Request[DescribePatchGroupStateResult] = js.native
    def describePatchGroups(params: DescribePatchGroupsRequest): Request[DescribePatchGroupsResult] = js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResponse] = js.native
    def getAutomationExecution(params: GetAutomationExecutionRequest): Request[GetAutomationExecutionResult] = js.native
    def getCommandInvocation(params: GetCommandInvocationRequest): Request[GetCommandInvocationResult] = js.native
    def getConnectionStatus(params: GetConnectionStatusRequest): Request[GetConnectionStatusResponse] = js.native
    def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest): Request[GetDefaultPatchBaselineResult] = js.native
    def getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest): Request[GetDeployablePatchSnapshotForInstanceResult] = js.native
    def getDocument(params: GetDocumentRequest): Request[GetDocumentResult] = js.native
    def getInventory(params: GetInventoryRequest): Request[GetInventoryResult] = js.native
    def getInventorySchema(params: GetInventorySchemaRequest): Request[GetInventorySchemaResult] = js.native
    def getMaintenanceWindow(params: GetMaintenanceWindowRequest): Request[GetMaintenanceWindowResult] = js.native
    def getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest): Request[GetMaintenanceWindowExecutionResult] = js.native
    def getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest): Request[GetMaintenanceWindowExecutionTaskResult] = js.native
    def getMaintenanceWindowExecutionTaskInvocation(params: GetMaintenanceWindowExecutionTaskInvocationRequest): Request[GetMaintenanceWindowExecutionTaskInvocationResult] = js.native
    def getMaintenanceWindowTask(params: GetMaintenanceWindowTaskRequest): Request[GetMaintenanceWindowTaskResult] = js.native
    def getParameter(params: GetParameterRequest): Request[GetParameterResult] = js.native
    def getParameterHistory(params: GetParameterHistoryRequest): Request[GetParameterHistoryResult] = js.native
    def getParameters(params: GetParametersRequest): Request[GetParametersResult] = js.native
    def getParametersByPath(params: GetParametersByPathRequest): Request[GetParametersByPathResult] = js.native
    def getPatchBaseline(params: GetPatchBaselineRequest): Request[GetPatchBaselineResult] = js.native
    def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest): Request[GetPatchBaselineForPatchGroupResult] = js.native
    def labelParameterVersion(params: LabelParameterVersionRequest): Request[LabelParameterVersionResult] = js.native
    def listAssociationVersions(params: ListAssociationVersionsRequest): Request[ListAssociationVersionsResult] = js.native
    def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResult] = js.native
    def listCommandInvocations(params: ListCommandInvocationsRequest): Request[ListCommandInvocationsResult] = js.native
    def listCommands(params: ListCommandsRequest): Request[ListCommandsResult] = js.native
    def listComplianceItems(params: ListComplianceItemsRequest): Request[ListComplianceItemsResult] = js.native
    def listComplianceSummaries(params: ListComplianceSummariesRequest): Request[ListComplianceSummariesResult] = js.native
    def listDocumentVersions(params: ListDocumentVersionsRequest): Request[ListDocumentVersionsResult] = js.native
    def listDocuments(params: ListDocumentsRequest): Request[ListDocumentsResult] = js.native
    def listInventoryEntries(params: ListInventoryEntriesRequest): Request[ListInventoryEntriesResult] = js.native
    def listResourceComplianceSummaries(params: ListResourceComplianceSummariesRequest): Request[ListResourceComplianceSummariesResult] = js.native
    def listResourceDataSync(params: ListResourceDataSyncRequest): Request[ListResourceDataSyncResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def modifyDocumentPermission(params: ModifyDocumentPermissionRequest): Request[ModifyDocumentPermissionResponse] = js.native
    def putComplianceItems(params: PutComplianceItemsRequest): Request[PutComplianceItemsResult] = js.native
    def putInventory(params: PutInventoryRequest): Request[PutInventoryResult] = js.native
    def putParameter(params: PutParameterRequest): Request[PutParameterResult] = js.native
    def registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest): Request[RegisterDefaultPatchBaselineResult] = js.native
    def registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest): Request[RegisterPatchBaselineForPatchGroupResult] = js.native
    def registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest): Request[RegisterTargetWithMaintenanceWindowResult] = js.native
    def registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest): Request[RegisterTaskWithMaintenanceWindowResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult] = js.native
    def resumeSession(params: ResumeSessionRequest): Request[ResumeSessionResponse] = js.native
    def sendAutomationSignal(params: SendAutomationSignalRequest): Request[SendAutomationSignalResult] = js.native
    def sendCommand(params: SendCommandRequest): Request[SendCommandResult] = js.native
    def startAssociationsOnce(params: StartAssociationsOnceRequest): Request[StartAssociationsOnceResult] = js.native
    def startAutomationExecution(params: StartAutomationExecutionRequest): Request[StartAutomationExecutionResult] = js.native
    def startSession(params: StartSessionRequest): Request[StartSessionResponse] = js.native
    def stopAutomationExecution(params: StopAutomationExecutionRequest): Request[StopAutomationExecutionResult] = js.native
    def terminateSession(params: TerminateSessionRequest): Request[TerminateSessionResponse] = js.native
    def updateAssociation(params: UpdateAssociationRequest): Request[UpdateAssociationResult] = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest): Request[UpdateAssociationStatusResult] = js.native
    def updateDocument(params: UpdateDocumentRequest): Request[UpdateDocumentResult] = js.native
    def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest): Request[UpdateDocumentDefaultVersionResult] = js.native
    def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): Request[UpdateMaintenanceWindowResult] = js.native
    def updateMaintenanceWindowTarget(params: UpdateMaintenanceWindowTargetRequest): Request[UpdateMaintenanceWindowTargetResult] = js.native
    def updateMaintenanceWindowTask(params: UpdateMaintenanceWindowTaskRequest): Request[UpdateMaintenanceWindowTaskResult] = js.native
    def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): Request[UpdateManagedInstanceRoleResult] = js.native
    def updatePatchBaseline(params: UpdatePatchBaselineRequest): Request[UpdatePatchBaselineResult] = js.native
  }

  /**
   * An activation registers one or more on-premises servers or virtual machines (VMs) with AWS so that you can configure those servers or VMs using Run Command. A server or VM that has been registered with AWS is called a managed instance.
   */
  @js.native
  trait Activation extends js.Object {
    var ActivationId: js.UndefOr[ActivationId]
    var CreatedDate: js.UndefOr[CreatedDate]
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var Expired: js.UndefOr[Boolean]
    var IamRole: js.UndefOr[IamRole]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
    var RegistrationsCount: js.UndefOr[RegistrationsCount]
  }

  object Activation {
    def apply(
      ActivationId: js.UndefOr[ActivationId] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
      Description: js.UndefOr[ActivationDescription] = js.undefined,
      ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
      Expired: js.UndefOr[Boolean] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined,
      RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
      RegistrationsCount: js.UndefOr[RegistrationsCount] = js.undefined): Activation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "DefaultInstanceName" -> DefaultInstanceName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "Expired" -> Expired.map { x => x.asInstanceOf[js.Any] },
        "IamRole" -> IamRole.map { x => x.asInstanceOf[js.Any] },
        "RegistrationLimit" -> RegistrationLimit.map { x => x.asInstanceOf[js.Any] },
        "RegistrationsCount" -> RegistrationsCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Activation]
    }
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
    var Tags: TagList
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceId: ResourceId,
      ResourceType: ResourceTypeForTagging,
      Tags: TagList): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResult extends js.Object {

  }

  object AddTagsToResourceResult {
    def apply(): AddTagsToResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceResult]
    }
  }

  /**
   * Describes an association of a Systems Manager document and an instance.
   */
  @js.native
  trait Association extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[DocumentName]
    var Overview: js.UndefOr[AssociationOverview]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  object Association {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      Overview: js.UndefOr[AssociationOverview] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): Association = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Overview" -> Overview.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Association]
    }
  }

  object AssociationComplianceSeverityEnum {
    val CRITICAL = "CRITICAL"
    val HIGH = "HIGH"
    val MEDIUM = "MEDIUM"
    val LOW = "LOW"
    val UNSPECIFIED = "UNSPECIFIED"

    val values = IndexedSeq(CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED)
  }

  /**
   * Describes the parameters for a document.
   */
  @js.native
  trait AssociationDescription extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var Date: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var LastSuccessfulExecutionDate: js.UndefOr[DateTime]
    var LastUpdateAssociationDate: js.UndefOr[DateTime]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Overview: js.UndefOr[AssociationOverview]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Status: js.UndefOr[AssociationStatus]
    var Targets: js.UndefOr[Targets]
  }

  object AssociationDescription {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      Date: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined,
      LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
      Overview: js.UndefOr[AssociationOverview] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Status: js.UndefOr[AssociationStatus] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): AssociationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulExecutionDate" -> LastSuccessfulExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateAssociationDate" -> LastUpdateAssociationDate.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "Overview" -> Overview.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationDescription]
    }
  }

  /**
   * Includes information about the specified association.
   */
  @js.native
  trait AssociationExecution extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var CreatedTime: js.UndefOr[DateTime]
    var DetailedStatus: js.UndefOr[StatusName]
    var ExecutionId: js.UndefOr[AssociationExecutionId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var ResourceCountByStatus: js.UndefOr[ResourceCountByStatus]
    var Status: js.UndefOr[StatusName]
  }

  object AssociationExecution {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      CreatedTime: js.UndefOr[DateTime] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      ResourceCountByStatus: js.UndefOr[ResourceCountByStatus] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): AssociationExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "ResourceCountByStatus" -> ResourceCountByStatus.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationExecution]
    }
  }

  /**
   * Filters used in the request.
   */
  @js.native
  trait AssociationExecutionFilter extends js.Object {
    var Key: AssociationExecutionFilterKey
    var Type: AssociationFilterOperatorType
    var Value: AssociationExecutionFilterValue
  }

  object AssociationExecutionFilter {
    def apply(
      Key: AssociationExecutionFilterKey,
      Type: AssociationFilterOperatorType,
      Value: AssociationExecutionFilterValue): AssociationExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationExecutionFilter]
    }
  }

  object AssociationExecutionFilterKeyEnum {
    val ExecutionId = "ExecutionId"
    val Status = "Status"
    val CreatedTime = "CreatedTime"

    val values = IndexedSeq(ExecutionId, Status, CreatedTime)
  }

  /**
   * Includes information about the specified association execution.
   */
  @js.native
  trait AssociationExecutionTarget extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var DetailedStatus: js.UndefOr[StatusName]
    var ExecutionId: js.UndefOr[AssociationExecutionId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var OutputSource: js.UndefOr[OutputSource]
    var ResourceId: js.UndefOr[AssociationResourceId]
    var ResourceType: js.UndefOr[AssociationResourceType]
    var Status: js.UndefOr[StatusName]
  }

  object AssociationExecutionTarget {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      OutputSource: js.UndefOr[OutputSource] = js.undefined,
      ResourceId: js.UndefOr[AssociationResourceId] = js.undefined,
      ResourceType: js.UndefOr[AssociationResourceType] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): AssociationExecutionTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "OutputSource" -> OutputSource.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationExecutionTarget]
    }
  }

  /**
   * Filters for the association execution.
   */
  @js.native
  trait AssociationExecutionTargetsFilter extends js.Object {
    var Key: AssociationExecutionTargetsFilterKey
    var Value: AssociationExecutionTargetsFilterValue
  }

  object AssociationExecutionTargetsFilter {
    def apply(
      Key: AssociationExecutionTargetsFilterKey,
      Value: AssociationExecutionTargetsFilterValue): AssociationExecutionTargetsFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationExecutionTargetsFilter]
    }
  }

  object AssociationExecutionTargetsFilterKeyEnum {
    val Status = "Status"
    val ResourceId = "ResourceId"
    val ResourceType = "ResourceType"

    val values = IndexedSeq(Status, ResourceId, ResourceType)
  }

  /**
   * Describes a filter.
   */
  @js.native
  trait AssociationFilter extends js.Object {
    var key: AssociationFilterKey
    var value: AssociationFilterValue
  }

  object AssociationFilter {
    def apply(
      key: AssociationFilterKey,
      value: AssociationFilterValue): AssociationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationFilter]
    }
  }

  object AssociationFilterKeyEnum {
    val InstanceId = "InstanceId"
    val Name = "Name"
    val AssociationId = "AssociationId"
    val AssociationStatusName = "AssociationStatusName"
    val LastExecutedBefore = "LastExecutedBefore"
    val LastExecutedAfter = "LastExecutedAfter"
    val AssociationName = "AssociationName"

    val values = IndexedSeq(InstanceId, Name, AssociationId, AssociationStatusName, LastExecutedBefore, LastExecutedAfter, AssociationName)
  }

  object AssociationFilterOperatorTypeEnum {
    val EQUAL = "EQUAL"
    val LESS_THAN = "LESS_THAN"
    val GREATER_THAN = "GREATER_THAN"

    val values = IndexedSeq(EQUAL, LESS_THAN, GREATER_THAN)
  }

  /**
   * Information about the association.
   */
  @js.native
  trait AssociationOverview extends js.Object {
    var AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount]
    var DetailedStatus: js.UndefOr[StatusName]
    var Status: js.UndefOr[StatusName]
  }

  object AssociationOverview {
    def apply(
      AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): AssociationOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationStatusAggregatedCount" -> AssociationStatusAggregatedCount.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationOverview]
    }
  }

  /**
   * Describes an association status.
   */
  @js.native
  trait AssociationStatus extends js.Object {
    var Date: DateTime
    var Message: StatusMessage
    var Name: AssociationStatusName
    var AdditionalInfo: js.UndefOr[StatusAdditionalInfo]
  }

  object AssociationStatus {
    def apply(
      Date: DateTime,
      Message: StatusMessage,
      Name: AssociationStatusName,
      AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined): AssociationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "AdditionalInfo" -> AdditionalInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationStatus]
    }
  }

  object AssociationStatusNameEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, Success, Failed)
  }

  /**
   * Information about the association version.
   */
  @js.native
  trait AssociationVersionInfo extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var CreatedDate: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  object AssociationVersionInfo {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): AssociationVersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationVersionInfo]
    }
  }

  /**
   * A structure that includes attributes that describe a document attachment.
   */
  @js.native
  trait AttachmentContent extends js.Object {
    var Hash: js.UndefOr[AttachmentHash]
    var HashType: js.UndefOr[AttachmentHashType]
    var Name: js.UndefOr[AttachmentName]
    var Size: js.UndefOr[ContentLength]
    var Url: js.UndefOr[AttachmentUrl]
  }

  object AttachmentContent {
    def apply(
      Hash: js.UndefOr[AttachmentHash] = js.undefined,
      HashType: js.UndefOr[AttachmentHashType] = js.undefined,
      Name: js.UndefOr[AttachmentName] = js.undefined,
      Size: js.UndefOr[ContentLength] = js.undefined,
      Url: js.UndefOr[AttachmentUrl] = js.undefined): AttachmentContent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Hash" -> Hash.map { x => x.asInstanceOf[js.Any] },
        "HashType" -> HashType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentContent]
    }
  }

  object AttachmentHashTypeEnum {
    val Sha256 = "Sha256"

    val values = IndexedSeq(Sha256)
  }

  /**
   * An attribute of an attachment, such as the attachment name or size.
   */
  @js.native
  trait AttachmentInformation extends js.Object {
    var Name: js.UndefOr[AttachmentName]
  }

  object AttachmentInformation {
    def apply(
      Name: js.UndefOr[AttachmentName] = js.undefined): AttachmentInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentInformation]
    }
  }

  /**
   * A key and value pair that identifies the location of an attachment to a document.
   */
  @js.native
  trait AttachmentsSource extends js.Object {
    var Key: js.UndefOr[AttachmentsSourceKey]
    var Values: js.UndefOr[AttachmentsSourceValues]
  }

  object AttachmentsSource {
    def apply(
      Key: js.UndefOr[AttachmentsSourceKey] = js.undefined,
      Values: js.UndefOr[AttachmentsSourceValues] = js.undefined): AttachmentsSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentsSource]
    }
  }

  object AttachmentsSourceKeyEnum {
    val SourceUrl = "SourceUrl"

    val values = IndexedSeq(SourceUrl)
  }

  /**
   * Detailed information about the current state of an individual Automation execution.
   */
  @js.native
  trait AutomationExecution extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus]
    var CurrentAction: js.UndefOr[String]
    var CurrentStepName: js.UndefOr[String]
    var DocumentName: js.UndefOr[DocumentName]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var ExecutedBy: js.UndefOr[String]
    var ExecutionEndTime: js.UndefOr[DateTime]
    var ExecutionStartTime: js.UndefOr[DateTime]
    var FailureMessage: js.UndefOr[String]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Mode: js.UndefOr[ExecutionMode]
    var Outputs: js.UndefOr[AutomationParameterMap]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var ProgressCounters: js.UndefOr[ProgressCounters]
    var ResolvedTargets: js.UndefOr[ResolvedTargets]
    var StepExecutions: js.UndefOr[StepExecutionList]
    var StepExecutionsTruncated: js.UndefOr[Boolean]
    var Target: js.UndefOr[String]
    var TargetLocations: js.UndefOr[TargetLocations]
    var TargetMaps: js.UndefOr[TargetMaps]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object AutomationExecution {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      CurrentAction: js.UndefOr[String] = js.undefined,
      CurrentStepName: js.UndefOr[String] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      ExecutedBy: js.UndefOr[String] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Mode: js.UndefOr[ExecutionMode] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      ProgressCounters: js.UndefOr[ProgressCounters] = js.undefined,
      ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined,
      StepExecutions: js.UndefOr[StepExecutionList] = js.undefined,
      StepExecutionsTruncated: js.UndefOr[Boolean] = js.undefined,
      Target: js.UndefOr[String] = js.undefined,
      TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
      TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
      TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): AutomationExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionStatus" -> AutomationExecutionStatus.map { x => x.asInstanceOf[js.Any] },
        "CurrentAction" -> CurrentAction.map { x => x.asInstanceOf[js.Any] },
        "CurrentStepName" -> CurrentStepName.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "ExecutedBy" -> ExecutedBy.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndTime" -> ExecutionEndTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartTime" -> ExecutionStartTime.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ParentAutomationExecutionId" -> ParentAutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ProgressCounters" -> ProgressCounters.map { x => x.asInstanceOf[js.Any] },
        "ResolvedTargets" -> ResolvedTargets.map { x => x.asInstanceOf[js.Any] },
        "StepExecutions" -> StepExecutions.map { x => x.asInstanceOf[js.Any] },
        "StepExecutionsTruncated" -> StepExecutionsTruncated.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "TargetLocations" -> TargetLocations.map { x => x.asInstanceOf[js.Any] },
        "TargetMaps" -> TargetMaps.map { x => x.asInstanceOf[js.Any] },
        "TargetParameterName" -> TargetParameterName.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecution]
    }
  }

  /**
   * A filter used to match specific automation executions. This is used to limit the scope of Automation execution information returned.
   */
  @js.native
  trait AutomationExecutionFilter extends js.Object {
    var Key: AutomationExecutionFilterKey
    var Values: AutomationExecutionFilterValueList
  }

  object AutomationExecutionFilter {
    def apply(
      Key: AutomationExecutionFilterKey,
      Values: AutomationExecutionFilterValueList): AutomationExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecutionFilter]
    }
  }

  object AutomationExecutionFilterKeyEnum {
    val DocumentNamePrefix = "DocumentNamePrefix"
    val ExecutionStatus = "ExecutionStatus"
    val ExecutionId = "ExecutionId"
    val ParentExecutionId = "ParentExecutionId"
    val CurrentAction = "CurrentAction"
    val StartTimeBefore = "StartTimeBefore"
    val StartTimeAfter = "StartTimeAfter"
    val AutomationType = "AutomationType"

    val values = IndexedSeq(DocumentNamePrefix, ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter, AutomationType)
  }

  /**
   * Details about a specific Automation execution.
   */
  @js.native
  trait AutomationExecutionMetadata extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus]
    var AutomationType: js.UndefOr[AutomationType]
    var CurrentAction: js.UndefOr[String]
    var CurrentStepName: js.UndefOr[String]
    var DocumentName: js.UndefOr[DocumentName]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var ExecutedBy: js.UndefOr[String]
    var ExecutionEndTime: js.UndefOr[DateTime]
    var ExecutionStartTime: js.UndefOr[DateTime]
    var FailureMessage: js.UndefOr[String]
    var LogFile: js.UndefOr[String]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Mode: js.UndefOr[ExecutionMode]
    var Outputs: js.UndefOr[AutomationParameterMap]
    var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var ResolvedTargets: js.UndefOr[ResolvedTargets]
    var Target: js.UndefOr[String]
    var TargetMaps: js.UndefOr[TargetMaps]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object AutomationExecutionMetadata {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      AutomationType: js.UndefOr[AutomationType] = js.undefined,
      CurrentAction: js.UndefOr[String] = js.undefined,
      CurrentStepName: js.UndefOr[String] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      ExecutedBy: js.UndefOr[String] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      LogFile: js.UndefOr[String] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Mode: js.UndefOr[ExecutionMode] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined,
      ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined,
      Target: js.UndefOr[String] = js.undefined,
      TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
      TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): AutomationExecutionMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionStatus" -> AutomationExecutionStatus.map { x => x.asInstanceOf[js.Any] },
        "AutomationType" -> AutomationType.map { x => x.asInstanceOf[js.Any] },
        "CurrentAction" -> CurrentAction.map { x => x.asInstanceOf[js.Any] },
        "CurrentStepName" -> CurrentStepName.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "ExecutedBy" -> ExecutedBy.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndTime" -> ExecutionEndTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartTime" -> ExecutionStartTime.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "LogFile" -> LogFile.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] },
        "ParentAutomationExecutionId" -> ParentAutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ResolvedTargets" -> ResolvedTargets.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "TargetMaps" -> TargetMaps.map { x => x.asInstanceOf[js.Any] },
        "TargetParameterName" -> TargetParameterName.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecutionMetadata]
    }
  }

  object AutomationExecutionStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Waiting = "Waiting"
    val Success = "Success"
    val TimedOut = "TimedOut"
    val Cancelling = "Cancelling"
    val Cancelled = "Cancelled"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, InProgress, Waiting, Success, TimedOut, Cancelling, Cancelled, Failed)
  }

  object AutomationTypeEnum {
    val CrossAccount = "CrossAccount"
    val Local = "Local"

    val values = IndexedSeq(CrossAccount, Local)
  }

  /**
   * <p/>
   */
  @js.native
  trait CancelCommandRequest extends js.Object {
    var CommandId: CommandId
    var InstanceIds: js.UndefOr[InstanceIdList]
  }

  object CancelCommandRequest {
    def apply(
      CommandId: CommandId,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined): CancelCommandRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandId" -> CommandId.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCommandRequest]
    }
  }

  /**
   * Whether or not the command was successfully canceled. There is no guarantee that a request can be canceled.
   */
  @js.native
  trait CancelCommandResult extends js.Object {

  }

  object CancelCommandResult {
    def apply(): CancelCommandResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCommandResult]
    }
  }

  @js.native
  trait CancelMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object CancelMaintenanceWindowExecutionRequest {
    def apply(
      WindowExecutionId: MaintenanceWindowExecutionId): CancelMaintenanceWindowExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelMaintenanceWindowExecutionRequest]
    }
  }

  @js.native
  trait CancelMaintenanceWindowExecutionResult extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object CancelMaintenanceWindowExecutionResult {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined): CancelMaintenanceWindowExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelMaintenanceWindowExecutionResult]
    }
  }

  /**
   * Configuration options for sending command output to CloudWatch Logs.
   */
  @js.native
  trait CloudWatchOutputConfig extends js.Object {
    var CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName]
    var CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled]
  }

  object CloudWatchOutputConfig {
    def apply(
      CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined,
      CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled] = js.undefined): CloudWatchOutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogGroupName" -> CloudWatchLogGroupName.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchOutputEnabled" -> CloudWatchOutputEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchOutputConfig]
    }
  }

  /**
   * Describes a command request.
   */
  @js.native
  trait Command extends js.Object {
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var CommandId: js.UndefOr[CommandId]
    var Comment: js.UndefOr[Comment]
    var CompletedCount: js.UndefOr[CompletedCount]
    var DeliveryTimedOutCount: js.UndefOr[DeliveryTimedOutCount]
    var DocumentName: js.UndefOr[DocumentName]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var ErrorCount: js.UndefOr[ErrorCount]
    var ExpiresAfter: js.UndefOr[DateTime]
    var InstanceIds: js.UndefOr[InstanceIdList]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var OutputS3Region: js.UndefOr[S3Region]
    var Parameters: js.UndefOr[Parameters]
    var RequestedDateTime: js.UndefOr[DateTime]
    var ServiceRole: js.UndefOr[ServiceRole]
    var Status: js.UndefOr[CommandStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
    var TargetCount: js.UndefOr[TargetCount]
    var Targets: js.UndefOr[Targets]
  }

  object Command {
    def apply(
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      CompletedCount: js.UndefOr[CompletedCount] = js.undefined,
      DeliveryTimedOutCount: js.UndefOr[DeliveryTimedOutCount] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      ErrorCount: js.UndefOr[ErrorCount] = js.undefined,
      ExpiresAfter: js.UndefOr[DateTime] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      RequestedDateTime: js.UndefOr[DateTime] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      Status: js.UndefOr[CommandStatus] = js.undefined,
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      TargetCount: js.UndefOr[TargetCount] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): Command = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "CompletedCount" -> CompletedCount.map { x => x.asInstanceOf[js.Any] },
        "DeliveryTimedOutCount" -> DeliveryTimedOutCount.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "ErrorCount" -> ErrorCount.map { x => x.asInstanceOf[js.Any] },
        "ExpiresAfter" -> ExpiresAfter.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "RequestedDateTime" -> RequestedDateTime.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TargetCount" -> TargetCount.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }

  /**
   * Describes a command filter.
   */
  @js.native
  trait CommandFilter extends js.Object {
    var key: CommandFilterKey
    var value: CommandFilterValue
  }

  object CommandFilter {
    def apply(
      key: CommandFilterKey,
      value: CommandFilterValue): CommandFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommandFilter]
    }
  }

  object CommandFilterKeyEnum {
    val InvokedAfter = "InvokedAfter"
    val InvokedBefore = "InvokedBefore"
    val Status = "Status"
    val ExecutionStage = "ExecutionStage"
    val DocumentName = "DocumentName"

    val values = IndexedSeq(InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName)
  }

  /**
   * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user executes SendCommand against three instances, then a command invocation is created for each requested instance ID. A command invocation returns status and detail information about a command you executed.
   */
  @js.native
  trait CommandInvocation extends js.Object {
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var CommandId: js.UndefOr[CommandId]
    var CommandPlugins: js.UndefOr[CommandPluginList]
    var Comment: js.UndefOr[Comment]
    var DocumentName: js.UndefOr[DocumentName]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var InstanceName: js.UndefOr[InstanceTagName]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var RequestedDateTime: js.UndefOr[DateTime]
    var ServiceRole: js.UndefOr[ServiceRole]
    var StandardErrorUrl: js.UndefOr[Url]
    var StandardOutputUrl: js.UndefOr[Url]
    var Status: js.UndefOr[CommandInvocationStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
    var TraceOutput: js.UndefOr[InvocationTraceOutput]
  }

  object CommandInvocation {
    def apply(
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      CommandPlugins: js.UndefOr[CommandPluginList] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      InstanceName: js.UndefOr[InstanceTagName] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      RequestedDateTime: js.UndefOr[DateTime] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      Status: js.UndefOr[CommandInvocationStatus] = js.undefined,
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined): CommandInvocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "CommandPlugins" -> CommandPlugins.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceName" -> InstanceName.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "RequestedDateTime" -> RequestedDateTime.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorUrl" -> StandardErrorUrl.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputUrl" -> StandardOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TraceOutput" -> TraceOutput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommandInvocation]
    }
  }

  object CommandInvocationStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Delayed = "Delayed"
    val Success = "Success"
    val Cancelled = "Cancelled"
    val TimedOut = "TimedOut"
    val Failed = "Failed"
    val Cancelling = "Cancelling"

    val values = IndexedSeq(Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling)
  }

  /**
   * Describes plugin details.
   */
  @js.native
  trait CommandPlugin extends js.Object {
    var Name: js.UndefOr[CommandPluginName]
    var Output: js.UndefOr[CommandPluginOutput]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var OutputS3Region: js.UndefOr[S3Region]
    var ResponseCode: js.UndefOr[ResponseCode]
    var ResponseFinishDateTime: js.UndefOr[DateTime]
    var ResponseStartDateTime: js.UndefOr[DateTime]
    var StandardErrorUrl: js.UndefOr[Url]
    var StandardOutputUrl: js.UndefOr[Url]
    var Status: js.UndefOr[CommandPluginStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
  }

  object CommandPlugin {
    def apply(
      Name: js.UndefOr[CommandPluginName] = js.undefined,
      Output: js.UndefOr[CommandPluginOutput] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
      ResponseFinishDateTime: js.UndefOr[DateTime] = js.undefined,
      ResponseStartDateTime: js.UndefOr[DateTime] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      Status: js.UndefOr[CommandPluginStatus] = js.undefined,
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined): CommandPlugin = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "ResponseFinishDateTime" -> ResponseFinishDateTime.map { x => x.asInstanceOf[js.Any] },
        "ResponseStartDateTime" -> ResponseStartDateTime.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorUrl" -> StandardErrorUrl.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputUrl" -> StandardOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommandPlugin]
    }
  }

  object CommandPluginStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Success = "Success"
    val TimedOut = "TimedOut"
    val Cancelled = "Cancelled"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, InProgress, Success, TimedOut, Cancelled, Failed)
  }

  object CommandStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Success = "Success"
    val Cancelled = "Cancelled"
    val Failed = "Failed"
    val TimedOut = "TimedOut"
    val Cancelling = "Cancelling"

    val values = IndexedSeq(Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling)
  }

  /**
   * A summary of the call execution that includes an execution ID, the type of execution (for example, <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
   */
  @js.native
  trait ComplianceExecutionSummary extends js.Object {
    var ExecutionTime: DateTime
    var ExecutionId: js.UndefOr[ComplianceExecutionId]
    var ExecutionType: js.UndefOr[ComplianceExecutionType]
  }

  object ComplianceExecutionSummary {
    def apply(
      ExecutionTime: DateTime,
      ExecutionId: js.UndefOr[ComplianceExecutionId] = js.undefined,
      ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined): ComplianceExecutionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionTime" -> ExecutionTime.asInstanceOf[js.Any],
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ExecutionType" -> ExecutionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceExecutionSummary]
    }
  }

  /**
   * Information about the compliance as defined by the resource type. For example, for a patch resource type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.
   */
  @js.native
  trait ComplianceItem extends js.Object {
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var Details: js.UndefOr[ComplianceItemDetails]
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary]
    var Id: js.UndefOr[ComplianceItemId]
    var ResourceId: js.UndefOr[ComplianceResourceId]
    var ResourceType: js.UndefOr[ComplianceResourceType]
    var Severity: js.UndefOr[ComplianceSeverity]
    var Status: js.UndefOr[ComplianceStatus]
    var Title: js.UndefOr[ComplianceItemTitle]
  }

  object ComplianceItem {
    def apply(
      ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
      Details: js.UndefOr[ComplianceItemDetails] = js.undefined,
      ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
      Id: js.UndefOr[ComplianceItemId] = js.undefined,
      ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
      ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
      Severity: js.UndefOr[ComplianceSeverity] = js.undefined,
      Status: js.UndefOr[ComplianceStatus] = js.undefined,
      Title: js.UndefOr[ComplianceItemTitle] = js.undefined): ComplianceItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceItem]
    }
  }

  /**
   * Information about a compliance item.
   */
  @js.native
  trait ComplianceItemEntry extends js.Object {
    var Severity: ComplianceSeverity
    var Status: ComplianceStatus
    var Details: js.UndefOr[ComplianceItemDetails]
    var Id: js.UndefOr[ComplianceItemId]
    var Title: js.UndefOr[ComplianceItemTitle]
  }

  object ComplianceItemEntry {
    def apply(
      Severity: ComplianceSeverity,
      Status: ComplianceStatus,
      Details: js.UndefOr[ComplianceItemDetails] = js.undefined,
      Id: js.UndefOr[ComplianceItemId] = js.undefined,
      Title: js.UndefOr[ComplianceItemTitle] = js.undefined): ComplianceItemEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Severity" -> Severity.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceItemEntry]
    }
  }

  object ComplianceQueryOperatorTypeEnum {
    val EQUAL = "EQUAL"
    val NOT_EQUAL = "NOT_EQUAL"
    val BEGIN_WITH = "BEGIN_WITH"
    val LESS_THAN = "LESS_THAN"
    val GREATER_THAN = "GREATER_THAN"

    val values = IndexedSeq(EQUAL, NOT_EQUAL, BEGIN_WITH, LESS_THAN, GREATER_THAN)
  }

  object ComplianceSeverityEnum {
    val CRITICAL = "CRITICAL"
    val HIGH = "HIGH"
    val MEDIUM = "MEDIUM"
    val LOW = "LOW"
    val INFORMATIONAL = "INFORMATIONAL"
    val UNSPECIFIED = "UNSPECIFIED"

    val values = IndexedSeq(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
  }

  object ComplianceStatusEnum {
    val COMPLIANT = "COMPLIANT"
    val NON_COMPLIANT = "NON_COMPLIANT"

    val values = IndexedSeq(COMPLIANT, NON_COMPLIANT)
  }

  /**
   * One or more filters. Use a filter to return a more specific list of results.
   */
  @js.native
  trait ComplianceStringFilter extends js.Object {
    var Key: js.UndefOr[ComplianceStringFilterKey]
    var Type: js.UndefOr[ComplianceQueryOperatorType]
    var Values: js.UndefOr[ComplianceStringFilterValueList]
  }

  object ComplianceStringFilter {
    def apply(
      Key: js.UndefOr[ComplianceStringFilterKey] = js.undefined,
      Type: js.UndefOr[ComplianceQueryOperatorType] = js.undefined,
      Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined): ComplianceStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceStringFilter]
    }
  }

  /**
   * A summary of compliance information by compliance type.
   */
  @js.native
  trait ComplianceSummaryItem extends js.Object {
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var CompliantSummary: js.UndefOr[CompliantSummary]
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary]
  }

  object ComplianceSummaryItem {
    def apply(
      ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
      CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined,
      NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined): ComplianceSummaryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "CompliantSummary" -> CompliantSummary.map { x => x.asInstanceOf[js.Any] },
        "NonCompliantSummary" -> NonCompliantSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceSummaryItem]
    }
  }

  /**
   * A summary of resources that are compliant. The summary is organized according to the resource count for each compliance type.
   */
  @js.native
  trait CompliantSummary extends js.Object {
    var CompliantCount: js.UndefOr[ComplianceSummaryCount]
    var SeveritySummary: js.UndefOr[SeveritySummary]
  }

  object CompliantSummary {
    def apply(
      CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined): CompliantSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompliantCount" -> CompliantCount.map { x => x.asInstanceOf[js.Any] },
        "SeveritySummary" -> SeveritySummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompliantSummary]
    }
  }

  object ConnectionStatusEnum {
    val Connected = "Connected"
    val NotConnected = "NotConnected"

    val values = IndexedSeq(Connected, NotConnected)
  }

  @js.native
  trait CreateActivationRequest extends js.Object {
    var IamRole: IamRole
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
  }

  object CreateActivationRequest {
    def apply(
      IamRole: IamRole,
      DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
      Description: js.UndefOr[ActivationDescription] = js.undefined,
      ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
      RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined): CreateActivationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamRole" -> IamRole.asInstanceOf[js.Any],
        "DefaultInstanceName" -> DefaultInstanceName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "RegistrationLimit" -> RegistrationLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivationRequest]
    }
  }

  @js.native
  trait CreateActivationResult extends js.Object {
    var ActivationCode: js.UndefOr[ActivationCode]
    var ActivationId: js.UndefOr[ActivationId]
  }

  object CreateActivationResult {
    def apply(
      ActivationCode: js.UndefOr[ActivationCode] = js.undefined,
      ActivationId: js.UndefOr[ActivationId] = js.undefined): CreateActivationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationCode" -> ActivationCode.map { x => x.asInstanceOf[js.Any] },
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivationResult]
    }
  }

  @js.native
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: CreateAssociationBatchRequestEntries
  }

  object CreateAssociationBatchRequest {
    def apply(
      Entries: CreateAssociationBatchRequestEntries): CreateAssociationBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entries" -> Entries.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequest]
    }
  }

  /**
   * Describes the association of a Systems Manager SSM document and an instance.
   */
  @js.native
  trait CreateAssociationBatchRequestEntry extends js.Object {
    var Name: DocumentName
    var AssociationName: js.UndefOr[AssociationName]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  object CreateAssociationBatchRequestEntry {
    def apply(
      Name: DocumentName,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): CreateAssociationBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequestEntry]
    }
  }

  @js.native
  trait CreateAssociationBatchResult extends js.Object {
    var Failed: js.UndefOr[FailedCreateAssociationList]
    var Successful: js.UndefOr[AssociationDescriptionList]
  }

  object CreateAssociationBatchResult {
    def apply(
      Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined,
      Successful: js.UndefOr[AssociationDescriptionList] = js.undefined): CreateAssociationBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] },
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchResult]
    }
  }

  @js.native
  trait CreateAssociationRequest extends js.Object {
    var Name: DocumentName
    var AssociationName: js.UndefOr[AssociationName]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  object CreateAssociationRequest {
    def apply(
      Name: DocumentName,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): CreateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationRequest]
    }
  }

  @js.native
  trait CreateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object CreateAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined): CreateAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationDescription" -> AssociationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationResult]
    }
  }

  @js.native
  trait CreateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object CreateDocumentRequest {
    def apply(
      Content: DocumentContent,
      Name: DocumentName,
      Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      TargetType: js.UndefOr[TargetType] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): CreateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Attachments" -> Attachments.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentRequest]
    }
  }

  @js.native
  trait CreateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  object CreateDocumentResult {
    def apply(
      DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined): CreateDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentDescription" -> DocumentDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentResult]
    }
  }

  @js.native
  trait CreateMaintenanceWindowRequest extends js.Object {
    var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
    var Cutoff: MaintenanceWindowCutoff
    var Duration: MaintenanceWindowDurationHours
    var Name: MaintenanceWindowName
    var Schedule: MaintenanceWindowSchedule
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object CreateMaintenanceWindowRequest {
    def apply(
      AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets,
      Cutoff: MaintenanceWindowCutoff,
      Duration: MaintenanceWindowDurationHours,
      Name: MaintenanceWindowName,
      Schedule: MaintenanceWindowSchedule,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): CreateMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.asInstanceOf[js.Any],
        "Cutoff" -> Cutoff.asInstanceOf[js.Any],
        "Duration" -> Duration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Schedule" -> Schedule.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait CreateMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object CreateMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): CreateMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMaintenanceWindowResult]
    }
  }

  @js.native
  trait CreatePatchBaselineRequest extends js.Object {
    var Name: BaselineName
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[BaselineDescription]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var Sources: js.UndefOr[PatchSourceList]
  }

  object CreatePatchBaselineRequest {
    def apply(
      Name: BaselineName,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined): CreatePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePatchBaselineRequest]
    }
  }

  @js.native
  trait CreatePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object CreatePatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined): CreatePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePatchBaselineResult]
    }
  }

  @js.native
  trait CreateResourceDataSyncRequest extends js.Object {
    var S3Destination: ResourceDataSyncS3Destination
    var SyncName: ResourceDataSyncName
  }

  object CreateResourceDataSyncRequest {
    def apply(
      S3Destination: ResourceDataSyncS3Destination,
      SyncName: ResourceDataSyncName): CreateResourceDataSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Destination" -> S3Destination.asInstanceOf[js.Any],
        "SyncName" -> SyncName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceDataSyncRequest]
    }
  }

  @js.native
  trait CreateResourceDataSyncResult extends js.Object {

  }

  object CreateResourceDataSyncResult {
    def apply(): CreateResourceDataSyncResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceDataSyncResult]
    }
  }

  @js.native
  trait DeleteActivationRequest extends js.Object {
    var ActivationId: ActivationId
  }

  object DeleteActivationRequest {
    def apply(
      ActivationId: ActivationId): DeleteActivationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationId" -> ActivationId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivationRequest]
    }
  }

  @js.native
  trait DeleteActivationResult extends js.Object {

  }

  object DeleteActivationResult {
    def apply(): DeleteActivationResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivationResult]
    }
  }

  @js.native
  trait DeleteAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentName]
  }

  object DeleteAssociationRequest {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined): DeleteAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssociationResult extends js.Object {

  }

  object DeleteAssociationResult {
    def apply(): DeleteAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssociationResult]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var Name: DocumentName
  }

  object DeleteDocumentRequest {
    def apply(
      Name: DocumentName): DeleteDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteDocumentResult extends js.Object {

  }

  object DeleteDocumentResult {
    def apply(): DeleteDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentResult]
    }
  }

  @js.native
  trait DeleteInventoryRequest extends js.Object {
    var TypeName: InventoryItemTypeName
    var ClientToken: js.UndefOr[ClientToken]
    var DryRun: js.UndefOr[DryRun]
    var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption]
  }

  object DeleteInventoryRequest {
    def apply(
      TypeName: InventoryItemTypeName,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined,
      SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.undefined): DeleteInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SchemaDeleteOption" -> SchemaDeleteOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInventoryRequest]
    }
  }

  @js.native
  trait DeleteInventoryResult extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  object DeleteInventoryResult {
    def apply(
      DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined,
      DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined): DeleteInventoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionId" -> DeletionId.map { x => x.asInstanceOf[js.Any] },
        "DeletionSummary" -> DeletionSummary.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInventoryResult]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object DeleteMaintenanceWindowRequest {
    def apply(
      WindowId: MaintenanceWindowId): DeleteMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object DeleteMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): DeleteMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMaintenanceWindowResult]
    }
  }

  @js.native
  trait DeleteParameterRequest extends js.Object {
    var Name: PSParameterName
  }

  object DeleteParameterRequest {
    def apply(
      Name: PSParameterName): DeleteParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParameterRequest]
    }
  }

  @js.native
  trait DeleteParameterResult extends js.Object {

  }

  object DeleteParameterResult {
    def apply(): DeleteParameterResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParameterResult]
    }
  }

  @js.native
  trait DeleteParametersRequest extends js.Object {
    var Names: ParameterNameList
  }

  object DeleteParametersRequest {
    def apply(
      Names: ParameterNameList): DeleteParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParametersRequest]
    }
  }

  @js.native
  trait DeleteParametersResult extends js.Object {
    var DeletedParameters: js.UndefOr[ParameterNameList]
    var InvalidParameters: js.UndefOr[ParameterNameList]
  }

  object DeleteParametersResult {
    def apply(
      DeletedParameters: js.UndefOr[ParameterNameList] = js.undefined,
      InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined): DeleteParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletedParameters" -> DeletedParameters.map { x => x.asInstanceOf[js.Any] },
        "InvalidParameters" -> InvalidParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParametersResult]
    }
  }

  @js.native
  trait DeletePatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object DeletePatchBaselineRequest {
    def apply(
      BaselineId: BaselineId): DeletePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePatchBaselineRequest]
    }
  }

  @js.native
  trait DeletePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object DeletePatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined): DeletePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePatchBaselineResult]
    }
  }

  @js.native
  trait DeleteResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
  }

  object DeleteResourceDataSyncRequest {
    def apply(
      SyncName: ResourceDataSyncName): DeleteResourceDataSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SyncName" -> SyncName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceDataSyncRequest]
    }
  }

  @js.native
  trait DeleteResourceDataSyncResult extends js.Object {

  }

  object DeleteResourceDataSyncResult {
    def apply(): DeleteResourceDataSyncResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceDataSyncResult]
    }
  }

  @js.native
  trait DeregisterManagedInstanceRequest extends js.Object {
    var InstanceId: ManagedInstanceId
  }

  object DeregisterManagedInstanceRequest {
    def apply(
      InstanceId: ManagedInstanceId): DeregisterManagedInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterManagedInstanceRequest]
    }
  }

  @js.native
  trait DeregisterManagedInstanceResult extends js.Object {

  }

  object DeregisterManagedInstanceResult {
    def apply(): DeregisterManagedInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterManagedInstanceResult]
    }
  }

  @js.native
  trait DeregisterPatchBaselineForPatchGroupRequest extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object DeregisterPatchBaselineForPatchGroupRequest {
    def apply(
      BaselineId: BaselineId,
      PatchGroup: PatchGroup): DeregisterPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object DeregisterPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): DeregisterPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
    var Safe: js.UndefOr[Boolean]
  }

  object DeregisterTargetFromMaintenanceWindowRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      WindowTargetId: MaintenanceWindowTargetId,
      Safe: js.UndefOr[Boolean] = js.undefined): DeregisterTargetFromMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTargetId" -> WindowTargetId.asInstanceOf[js.Any],
        "Safe" -> Safe.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object DeregisterTargetFromMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined): DeregisterTargetFromMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
    }
  }

  @js.native
  trait DeregisterTaskFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  object DeregisterTaskFromMaintenanceWindowRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      WindowTaskId: MaintenanceWindowTaskId): DeregisterTaskFromMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object DeregisterTaskFromMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): DeregisterTaskFromMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
    }
  }

  /**
   * Filter for the DescribeActivation API.
   */
  @js.native
  trait DescribeActivationsFilter extends js.Object {
    var FilterKey: js.UndefOr[DescribeActivationsFilterKeys]
    var FilterValues: js.UndefOr[StringList]
  }

  object DescribeActivationsFilter {
    def apply(
      FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.undefined,
      FilterValues: js.UndefOr[StringList] = js.undefined): DescribeActivationsFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterKey" -> FilterKey.map { x => x.asInstanceOf[js.Any] },
        "FilterValues" -> FilterValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivationsFilter]
    }
  }

  object DescribeActivationsFilterKeysEnum {
    val ActivationIds = "ActivationIds"
    val DefaultInstanceName = "DefaultInstanceName"
    val IamRole = "IamRole"

    val values = IndexedSeq(ActivationIds, DefaultInstanceName, IamRole)
  }

  @js.native
  trait DescribeActivationsRequest extends js.Object {
    var Filters: js.UndefOr[DescribeActivationsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeActivationsRequest {
    def apply(
      Filters: js.UndefOr[DescribeActivationsFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeActivationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivationsRequest]
    }
  }

  @js.native
  trait DescribeActivationsResult extends js.Object {
    var ActivationList: js.UndefOr[ActivationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeActivationsResult {
    def apply(
      ActivationList: js.UndefOr[ActivationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeActivationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationList" -> ActivationList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivationsResult]
    }
  }

  @js.native
  trait DescribeAssociationExecutionTargetsRequest extends js.Object {
    var AssociationId: AssociationId
    var ExecutionId: AssociationExecutionId
    var Filters: js.UndefOr[AssociationExecutionTargetsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionTargetsRequest {
    def apply(
      AssociationId: AssociationId,
      ExecutionId: AssociationExecutionId,
      Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAssociationExecutionTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "ExecutionId" -> ExecutionId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationExecutionTargetsRequest]
    }
  }

  @js.native
  trait DescribeAssociationExecutionTargetsResult extends js.Object {
    var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionTargetsResult {
    def apply(
      AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAssociationExecutionTargetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationExecutionTargets" -> AssociationExecutionTargets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationExecutionTargetsResult]
    }
  }

  @js.native
  trait DescribeAssociationExecutionsRequest extends js.Object {
    var AssociationId: AssociationId
    var Filters: js.UndefOr[AssociationExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionsRequest {
    def apply(
      AssociationId: AssociationId,
      Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAssociationExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAssociationExecutionsResult extends js.Object {
    var AssociationExecutions: js.UndefOr[AssociationExecutionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionsResult {
    def apply(
      AssociationExecutions: js.UndefOr[AssociationExecutionsList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAssociationExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationExecutions" -> AssociationExecutions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationExecutionsResult]
    }
  }

  @js.native
  trait DescribeAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentName]
  }

  object DescribeAssociationRequest {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined): DescribeAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationRequest]
    }
  }

  @js.native
  trait DescribeAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object DescribeAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined): DescribeAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationDescription" -> AssociationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationResult]
    }
  }

  @js.native
  trait DescribeAutomationExecutionsRequest extends js.Object {
    var Filters: js.UndefOr[AutomationExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAutomationExecutionsRequest {
    def apply(
      Filters: js.UndefOr[AutomationExecutionFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAutomationExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAutomationExecutionsResult extends js.Object {
    var AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAutomationExecutionsResult {
    def apply(
      AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAutomationExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionMetadataList" -> AutomationExecutionMetadataList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationExecutionsResult]
    }
  }

  @js.native
  trait DescribeAutomationStepExecutionsRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var Filters: js.UndefOr[StepExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReverseOrder: js.UndefOr[Boolean]
  }

  object DescribeAutomationStepExecutionsRequest {
    def apply(
      AutomationExecutionId: AutomationExecutionId,
      Filters: js.UndefOr[StepExecutionFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ReverseOrder: js.UndefOr[Boolean] = js.undefined): DescribeAutomationStepExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ReverseOrder" -> ReverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationStepExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAutomationStepExecutionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StepExecutions: js.UndefOr[StepExecutionList]
  }

  object DescribeAutomationStepExecutionsResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StepExecutions: js.UndefOr[StepExecutionList] = js.undefined): DescribeAutomationStepExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StepExecutions" -> StepExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationStepExecutionsResult]
    }
  }

  @js.native
  trait DescribeAvailablePatchesRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAvailablePatchesRequest {
    def apply(
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAvailablePatchesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailablePatchesRequest]
    }
  }

  @js.native
  trait DescribeAvailablePatchesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Patches: js.UndefOr[PatchList]
  }

  object DescribeAvailablePatchesResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Patches: js.UndefOr[PatchList] = js.undefined): DescribeAvailablePatchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Patches" -> Patches.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailablePatchesResult]
    }
  }

  @js.native
  trait DescribeDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
  }

  object DescribeDocumentPermissionRequest {
    def apply(
      Name: DocumentName,
      PermissionType: DocumentPermissionType): DescribeDocumentPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentPermissionRequest]
    }
  }

  @js.native
  trait DescribeDocumentPermissionResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DescribeDocumentPermissionResponse {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): DescribeDocumentPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentPermissionResponse]
    }
  }

  @js.native
  trait DescribeDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DescribeDocumentRequest {
    def apply(
      Name: DocumentARN,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): DescribeDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentRequest]
    }
  }

  @js.native
  trait DescribeDocumentResult extends js.Object {
    var Document: js.UndefOr[DocumentDescription]
  }

  object DescribeDocumentResult {
    def apply(
      Document: js.UndefOr[DocumentDescription] = js.undefined): DescribeDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentResult]
    }
  }

  @js.native
  trait DescribeEffectiveInstanceAssociationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectiveInstanceAssociationsRequest {
    def apply(
      InstanceId: InstanceId,
      MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeEffectiveInstanceAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectiveInstanceAssociationsRequest]
    }
  }

  @js.native
  trait DescribeEffectiveInstanceAssociationsResult extends js.Object {
    var Associations: js.UndefOr[InstanceAssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectiveInstanceAssociationsResult {
    def apply(
      Associations: js.UndefOr[InstanceAssociationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeEffectiveInstanceAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Associations" -> Associations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectiveInstanceAssociationsResult]
    }
  }

  @js.native
  trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectivePatchesForPatchBaselineRequest {
    def apply(
      BaselineId: BaselineId,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeEffectivePatchesForPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
    }
  }

  @js.native
  trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
    var EffectivePatches: js.UndefOr[EffectivePatchList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectivePatchesForPatchBaselineResult {
    def apply(
      EffectivePatches: js.UndefOr[EffectivePatchList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeEffectivePatchesForPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EffectivePatches" -> EffectivePatches.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
    }
  }

  @js.native
  trait DescribeInstanceAssociationsStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceAssociationsStatusRequest {
    def apply(
      InstanceId: InstanceId,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstanceAssociationsStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceAssociationsStatusRequest]
    }
  }

  @js.native
  trait DescribeInstanceAssociationsStatusResult extends js.Object {
    var InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceAssociationsStatusResult {
    def apply(
      InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstanceAssociationsStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceAssociationStatusInfos" -> InstanceAssociationStatusInfos.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceAssociationsStatusResult]
    }
  }

  @js.native
  trait DescribeInstanceInformationRequest extends js.Object {
    var Filters: js.UndefOr[InstanceInformationStringFilterList]
    var InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList]
    var MaxResults: js.UndefOr[MaxResultsEC2Compatible]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceInformationRequest {
    def apply(
      Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined,
      InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstanceInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "InstanceInformationFilterList" -> InstanceInformationFilterList.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceInformationRequest]
    }
  }

  @js.native
  trait DescribeInstanceInformationResult extends js.Object {
    var InstanceInformationList: js.UndefOr[InstanceInformationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceInformationResult {
    def apply(
      InstanceInformationList: js.UndefOr[InstanceInformationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstanceInformationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInformationList" -> InstanceInformationList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceInformationResult]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
    var Filters: js.UndefOr[InstancePatchStateFilterList]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesForPatchGroupRequest {
    def apply(
      PatchGroup: PatchGroup,
      Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancePatchStatesForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
    var InstancePatchStates: js.UndefOr[InstancePatchStatesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesForPatchGroupResult {
    def apply(
      InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancePatchStatesForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancePatchStates" -> InstancePatchStates.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesRequest extends js.Object {
    var InstanceIds: InstanceIdList
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesRequest {
    def apply(
      InstanceIds: InstanceIdList,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancePatchStatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesResult extends js.Object {
    var InstancePatchStates: js.UndefOr[InstancePatchStateList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesResult {
    def apply(
      InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancePatchStatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancePatchStates" -> InstancePatchStates.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesResult]
    }
  }

  @js.native
  trait DescribeInstancePatchesRequest extends js.Object {
    var InstanceId: InstanceId
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchesRequest {
    def apply(
      InstanceId: InstanceId,
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancePatchesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Patches: js.UndefOr[PatchComplianceDataList]
  }

  object DescribeInstancePatchesResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Patches: js.UndefOr[PatchComplianceDataList] = js.undefined): DescribeInstancePatchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Patches" -> Patches.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchesResult]
    }
  }

  @js.native
  trait DescribeInventoryDeletionsRequest extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInventoryDeletionsRequest {
    def apply(
      DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInventoryDeletionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionId" -> DeletionId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInventoryDeletionsRequest]
    }
  }

  @js.native
  trait DescribeInventoryDeletionsResult extends js.Object {
    var InventoryDeletions: js.UndefOr[InventoryDeletionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInventoryDeletionsResult {
    def apply(
      InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInventoryDeletionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InventoryDeletions" -> InventoryDeletions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInventoryDeletionsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTaskInvocationsRequest extends js.Object {
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
    def apply(
      TaskId: MaintenanceWindowExecutionTaskId,
      WindowExecutionId: MaintenanceWindowExecutionId,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList]
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionTaskInvocationIdentities" -> WindowExecutionTaskInvocationIdentities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionTasksRequest {
    def apply(
      WindowExecutionId: MaintenanceWindowExecutionId,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList]
  }

  object DescribeMaintenanceWindowExecutionTasksResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined): DescribeMaintenanceWindowExecutionTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionTaskIdentities" -> WindowExecutionTaskIdentities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionsRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList]
  }

  object DescribeMaintenanceWindowExecutionsResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined): DescribeMaintenanceWindowExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutions" -> WindowExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowScheduleRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var Targets: js.UndefOr[Targets]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object DescribeMaintenanceWindowScheduleRequest {
    def apply(
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): DescribeMaintenanceWindowScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowScheduleRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowScheduleResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList]
  }

  object DescribeMaintenanceWindowScheduleResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined): DescribeMaintenanceWindowScheduleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledWindowExecutions" -> ScheduledWindowExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowScheduleResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowTargetsRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTargetsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[MaintenanceWindowTargetList]
  }

  object DescribeMaintenanceWindowTargetsResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined): DescribeMaintenanceWindowTargetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTargetsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowTasksRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tasks: js.UndefOr[MaintenanceWindowTaskList]
  }

  object DescribeMaintenanceWindowTasksResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined): DescribeMaintenanceWindowTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tasks" -> Tasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTasksResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
    var ResourceType: MaintenanceWindowResourceType
    var Targets: Targets
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowsForTargetRequest {
    def apply(
      ResourceType: MaintenanceWindowResourceType,
      Targets: Targets,
      MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowsForTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList]
  }

  object DescribeMaintenanceWindowsForTargetResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined): DescribeMaintenanceWindowsForTargetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "WindowIdentities" -> WindowIdentities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsRequest extends js.Object {
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowsRequest {
    def apply(
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList]
  }

  object DescribeMaintenanceWindowsResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined): DescribeMaintenanceWindowsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "WindowIdentities" -> WindowIdentities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsResult]
    }
  }

  @js.native
  trait DescribeParametersRequest extends js.Object {
    var Filters: js.UndefOr[ParametersFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ParameterFilters: js.UndefOr[ParameterStringFilterList]
  }

  object DescribeParametersRequest {
    def apply(
      Filters: js.UndefOr[ParametersFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined): DescribeParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ParameterFilters" -> ParameterFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterMetadataList]
  }

  object DescribeParametersResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Parameters: js.UndefOr[ParameterMetadataList] = js.undefined): DescribeParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersResult]
    }
  }

  @js.native
  trait DescribePatchBaselinesRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchBaselinesRequest {
    def apply(
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribePatchBaselinesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchBaselinesRequest]
    }
  }

  @js.native
  trait DescribePatchBaselinesResult extends js.Object {
    var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchBaselinesResult {
    def apply(
      BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribePatchBaselinesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineIdentities" -> BaselineIdentities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchBaselinesResult]
    }
  }

  @js.native
  trait DescribePatchGroupStateRequest extends js.Object {
    var PatchGroup: PatchGroup
  }

  object DescribePatchGroupStateRequest {
    def apply(
      PatchGroup: PatchGroup): DescribePatchGroupStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupStateRequest]
    }
  }

  @js.native
  trait DescribePatchGroupStateResult extends js.Object {
    var Instances: js.UndefOr[Int]
    var InstancesWithFailedPatches: js.UndefOr[Int]
    var InstancesWithInstalledOtherPatches: js.UndefOr[Int]
    var InstancesWithInstalledPatches: js.UndefOr[Int]
    var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount]
    var InstancesWithMissingPatches: js.UndefOr[Int]
    var InstancesWithNotApplicablePatches: js.UndefOr[Int]
  }

  object DescribePatchGroupStateResult {
    def apply(
      Instances: js.UndefOr[Int] = js.undefined,
      InstancesWithFailedPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithInstalledOtherPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithInstalledPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined,
      InstancesWithMissingPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithNotApplicablePatches: js.UndefOr[Int] = js.undefined): DescribePatchGroupStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithFailedPatches" -> InstancesWithFailedPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithInstalledOtherPatches" -> InstancesWithInstalledOtherPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithInstalledPatches" -> InstancesWithInstalledPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithInstalledRejectedPatches" -> InstancesWithInstalledRejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithMissingPatches" -> InstancesWithMissingPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithNotApplicablePatches" -> InstancesWithNotApplicablePatches.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupStateResult]
    }
  }

  @js.native
  trait DescribePatchGroupsRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchGroupsRequest {
    def apply(
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribePatchGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupsRequest]
    }
  }

  @js.native
  trait DescribePatchGroupsResult extends js.Object {
    var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchGroupsResult {
    def apply(
      Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribePatchGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Mappings" -> Mappings.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupsResult]
    }
  }

  @js.native
  trait DescribeSessionsRequest extends js.Object {
    var State: SessionState
    var Filters: js.UndefOr[SessionFilterList]
    var MaxResults: js.UndefOr[SessionMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeSessionsRequest {
    def apply(
      State: SessionState,
      Filters: js.UndefOr[SessionFilterList] = js.undefined,
      MaxResults: js.UndefOr[SessionMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeSessionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsRequest]
    }
  }

  @js.native
  trait DescribeSessionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Sessions: js.UndefOr[SessionList]
  }

  object DescribeSessionsResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Sessions: js.UndefOr[SessionList] = js.undefined): DescribeSessionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Sessions" -> Sessions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsResponse]
    }
  }

  /**
   * A default version of a document.
   */
  @js.native
  trait DocumentDefaultVersionDescription extends js.Object {
    var DefaultVersion: js.UndefOr[DocumentVersion]
    var DefaultVersionName: js.UndefOr[DocumentVersionName]
    var Name: js.UndefOr[DocumentName]
  }

  object DocumentDefaultVersionDescription {
    def apply(
      DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DefaultVersionName: js.UndefOr[DocumentVersionName] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined): DocumentDefaultVersionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultVersion" -> DefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersionName" -> DefaultVersionName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDefaultVersionDescription]
    }
  }

  /**
   * Describes a Systems Manager document.
   */
  @js.native
  trait DocumentDescription extends js.Object {
    var AttachmentsInformation: js.UndefOr[AttachmentInformationList]
    var CreatedDate: js.UndefOr[DateTime]
    var DefaultVersion: js.UndefOr[DocumentVersion]
    var Description: js.UndefOr[DescriptionInDocument]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Hash: js.UndefOr[DocumentHash]
    var HashType: js.UndefOr[DocumentHashType]
    var LatestVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Owner: js.UndefOr[DocumentOwner]
    var Parameters: js.UndefOr[DocumentParameterList]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Sha1: js.UndefOr[DocumentSha1]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DocumentDescription {
    def apply(
      AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Description: js.UndefOr[DescriptionInDocument] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Hash: js.UndefOr[DocumentHash] = js.undefined,
      HashType: js.UndefOr[DocumentHashType] = js.undefined,
      LatestVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Name: js.UndefOr[DocumentARN] = js.undefined,
      Owner: js.UndefOr[DocumentOwner] = js.undefined,
      Parameters: js.UndefOr[DocumentParameterList] = js.undefined,
      PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
      SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
      Sha1: js.UndefOr[DocumentSha1] = js.undefined,
      Status: js.UndefOr[DocumentStatus] = js.undefined,
      StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      TargetType: js.UndefOr[TargetType] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): DocumentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachmentsInformation" -> AttachmentsInformation.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersion" -> DefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Hash" -> Hash.map { x => x.asInstanceOf[js.Any] },
        "HashType" -> HashType.map { x => x.asInstanceOf[js.Any] },
        "LatestVersion" -> LatestVersion.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "PlatformTypes" -> PlatformTypes.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "Sha1" -> Sha1.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusInformation" -> StatusInformation.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDescription]
    }
  }

  /**
   * Describes a filter.
   */
  @js.native
  trait DocumentFilter extends js.Object {
    var key: DocumentFilterKey
    var value: DocumentFilterValue
  }

  object DocumentFilter {
    def apply(
      key: DocumentFilterKey,
      value: DocumentFilterValue): DocumentFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentFilter]
    }
  }

  object DocumentFilterKeyEnum {
    val Name = "Name"
    val Owner = "Owner"
    val PlatformTypes = "PlatformTypes"
    val DocumentType = "DocumentType"

    val values = IndexedSeq(Name, Owner, PlatformTypes, DocumentType)
  }

  object DocumentFormatEnum {
    val YAML = "YAML"
    val JSON = "JSON"

    val values = IndexedSeq(YAML, JSON)
  }

  object DocumentHashTypeEnum {
    val Sha256 = "Sha256"
    val Sha1 = "Sha1"

    val values = IndexedSeq(Sha256, Sha1)
  }

  /**
   * Describes the name of a Systems Manager document.
   */
  @js.native
  trait DocumentIdentifier extends js.Object {
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Owner: js.UndefOr[DocumentOwner]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DocumentIdentifier {
    def apply(
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Name: js.UndefOr[DocumentARN] = js.undefined,
      Owner: js.UndefOr[DocumentOwner] = js.undefined,
      PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
      SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      TargetType: js.UndefOr[TargetType] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): DocumentIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "PlatformTypes" -> PlatformTypes.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentIdentifier]
    }
  }

  /**
   * One or more filters. Use a filter to return a more specific list of documents.
   *  For keys, you can specify one or more tags that have been applied to a document.
   *  Other valid values include Owner, Name, PlatformTypes, and DocumentType.
   *  Note that only one Owner can be specified in a request. For example: <code>Key=Owner,Values=Self</code>.
   *  If you use Name as a key, you can use a name prefix to return a list of documents. For example, in the AWS CLI, to return a list of all documents that begin with <code>Te</code>, run the following command:
   *  <code>aws ssm list-documents --filters Key=Name,Values=Te</code>
   *  If you specify more than two keys, only documents that are identified by all the tags are returned in the results. If you specify more than two values for a key, documents that are identified by any of the values are returned in the results.
   *  To specify a custom key and value pair, use the format <code>Key=tag:[tagName],Values=[valueName]</code>.
   *  For example, if you created a Key called region and are using the AWS CLI to call the <code>list-documents</code> command:
   *  <code>aws ssm list-documents --filters Key=tag:region,Values=east,west Key=Owner,Values=Self</code>
   */
  @js.native
  trait DocumentKeyValuesFilter extends js.Object {
    var Key: js.UndefOr[DocumentKeyValuesFilterKey]
    var Values: js.UndefOr[DocumentKeyValuesFilterValues]
  }

  object DocumentKeyValuesFilter {
    def apply(
      Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.undefined,
      Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.undefined): DocumentKeyValuesFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentKeyValuesFilter]
    }
  }

  /**
   * Parameters specified in a System Manager document that execute on the server when the command is run.
   */
  @js.native
  trait DocumentParameter extends js.Object {
    var DefaultValue: js.UndefOr[DocumentParameterDefaultValue]
    var Description: js.UndefOr[DocumentParameterDescrption]
    var Name: js.UndefOr[DocumentParameterName]
    var Type: js.UndefOr[DocumentParameterType]
  }

  object DocumentParameter {
    def apply(
      DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.undefined,
      Description: js.UndefOr[DocumentParameterDescrption] = js.undefined,
      Name: js.UndefOr[DocumentParameterName] = js.undefined,
      Type: js.UndefOr[DocumentParameterType] = js.undefined): DocumentParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentParameter]
    }
  }

  object DocumentParameterTypeEnum {
    val String = "String"
    val StringList = "StringList"

    val values = IndexedSeq(String, StringList)
  }

  object DocumentPermissionTypeEnum {
    val Share = "Share"

    val values = IndexedSeq(Share)
  }

  /**
   * The status of a document.
   */
  object DocumentStatusEnum {
    val Creating = "Creating"
    val Active = "Active"
    val Updating = "Updating"
    val Deleting = "Deleting"
    val Failed = "Failed"

    val values = IndexedSeq(Creating, Active, Updating, Deleting, Failed)
  }

  object DocumentTypeEnum {
    val Command = "Command"
    val Policy = "Policy"
    val Automation = "Automation"
    val Session = "Session"
    val Package = "Package"

    val values = IndexedSeq(Command, Policy, Automation, Session, Package)
  }

  /**
   * Version information about the document.
   */
  @js.native
  trait DocumentVersionInfo extends js.Object {
    var CreatedDate: js.UndefOr[DateTime]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var IsDefaultVersion: js.UndefOr[Boolean]
    var Name: js.UndefOr[DocumentName]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DocumentVersionInfo {
    def apply(
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      IsDefaultVersion: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      Status: js.UndefOr[DocumentStatus] = js.undefined,
      StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): DocumentVersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "IsDefaultVersion" -> IsDefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusInformation" -> StatusInformation.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentVersionInfo]
    }
  }

  /**
   * The EffectivePatch structure defines metadata about a patch along with the approval state of the patch in a particular patch baseline. The approval state includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
   */
  @js.native
  trait EffectivePatch extends js.Object {
    var Patch: js.UndefOr[Patch]
    var PatchStatus: js.UndefOr[PatchStatus]
  }

  object EffectivePatch {
    def apply(
      Patch: js.UndefOr[Patch] = js.undefined,
      PatchStatus: js.UndefOr[PatchStatus] = js.undefined): EffectivePatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Patch" -> Patch.map { x => x.asInstanceOf[js.Any] },
        "PatchStatus" -> PatchStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EffectivePatch]
    }
  }

  object ExecutionModeEnum {
    val Auto = "Auto"
    val Interactive = "Interactive"

    val values = IndexedSeq(Auto, Interactive)
  }

  /**
   * Describes a failed association.
   */
  @js.native
  trait FailedCreateAssociation extends js.Object {
    var Entry: js.UndefOr[CreateAssociationBatchRequestEntry]
    var Fault: js.UndefOr[Fault]
    var Message: js.UndefOr[BatchErrorMessage]
  }

  object FailedCreateAssociation {
    def apply(
      Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined,
      Fault: js.UndefOr[Fault] = js.undefined,
      Message: js.UndefOr[BatchErrorMessage] = js.undefined): FailedCreateAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entry" -> Entry.map { x => x.asInstanceOf[js.Any] },
        "Fault" -> Fault.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateAssociation]
    }
  }

  /**
   * Information about an Automation failure.
   */
  @js.native
  trait FailureDetails extends js.Object {
    var Details: js.UndefOr[AutomationParameterMap]
    var FailureStage: js.UndefOr[String]
    var FailureType: js.UndefOr[String]
  }

  object FailureDetails {
    def apply(
      Details: js.UndefOr[AutomationParameterMap] = js.undefined,
      FailureStage: js.UndefOr[String] = js.undefined,
      FailureType: js.UndefOr[String] = js.undefined): FailureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "FailureStage" -> FailureStage.map { x => x.asInstanceOf[js.Any] },
        "FailureType" -> FailureType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailureDetails]
    }
  }

  object FaultEnum {
    val Client = "Client"
    val Server = "Server"
    val Unknown = "Unknown"

    val values = IndexedSeq(Client, Server, Unknown)
  }

  @js.native
  trait GetAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
  }

  object GetAutomationExecutionRequest {
    def apply(
      AutomationExecutionId: AutomationExecutionId): GetAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAutomationExecutionRequest]
    }
  }

  @js.native
  trait GetAutomationExecutionResult extends js.Object {
    var AutomationExecution: js.UndefOr[AutomationExecution]
  }

  object GetAutomationExecutionResult {
    def apply(
      AutomationExecution: js.UndefOr[AutomationExecution] = js.undefined): GetAutomationExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecution" -> AutomationExecution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAutomationExecutionResult]
    }
  }

  @js.native
  trait GetCommandInvocationRequest extends js.Object {
    var CommandId: CommandId
    var InstanceId: InstanceId
    var PluginName: js.UndefOr[CommandPluginName]
  }

  object GetCommandInvocationRequest {
    def apply(
      CommandId: CommandId,
      InstanceId: InstanceId,
      PluginName: js.UndefOr[CommandPluginName] = js.undefined): GetCommandInvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandId" -> CommandId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "PluginName" -> PluginName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommandInvocationRequest]
    }
  }

  @js.native
  trait GetCommandInvocationResult extends js.Object {
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var CommandId: js.UndefOr[CommandId]
    var Comment: js.UndefOr[Comment]
    var DocumentName: js.UndefOr[DocumentName]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var ExecutionElapsedTime: js.UndefOr[StringDateTime]
    var ExecutionEndDateTime: js.UndefOr[StringDateTime]
    var ExecutionStartDateTime: js.UndefOr[StringDateTime]
    var InstanceId: js.UndefOr[InstanceId]
    var PluginName: js.UndefOr[CommandPluginName]
    var ResponseCode: js.UndefOr[ResponseCode]
    var StandardErrorContent: js.UndefOr[StandardErrorContent]
    var StandardErrorUrl: js.UndefOr[Url]
    var StandardOutputContent: js.UndefOr[StandardOutputContent]
    var StandardOutputUrl: js.UndefOr[Url]
    var Status: js.UndefOr[CommandInvocationStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
  }

  object GetCommandInvocationResult {
    def apply(
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.undefined,
      ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.undefined,
      ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      PluginName: js.UndefOr[CommandPluginName] = js.undefined,
      ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
      StandardErrorContent: js.UndefOr[StandardErrorContent] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      StandardOutputContent: js.UndefOr[StandardOutputContent] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      Status: js.UndefOr[CommandInvocationStatus] = js.undefined,
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined): GetCommandInvocationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "ExecutionElapsedTime" -> ExecutionElapsedTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndDateTime" -> ExecutionEndDateTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartDateTime" -> ExecutionStartDateTime.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "PluginName" -> PluginName.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorContent" -> StandardErrorContent.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorUrl" -> StandardErrorUrl.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputContent" -> StandardOutputContent.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputUrl" -> StandardOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommandInvocationResult]
    }
  }

  @js.native
  trait GetConnectionStatusRequest extends js.Object {
    var Target: SessionTarget
  }

  object GetConnectionStatusRequest {
    def apply(
      Target: SessionTarget): GetConnectionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionStatusRequest]
    }
  }

  @js.native
  trait GetConnectionStatusResponse extends js.Object {
    var Status: js.UndefOr[ConnectionStatus]
    var Target: js.UndefOr[SessionTarget]
  }

  object GetConnectionStatusResponse {
    def apply(
      Status: js.UndefOr[ConnectionStatus] = js.undefined,
      Target: js.UndefOr[SessionTarget] = js.undefined): GetConnectionStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionStatusResponse]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineRequest extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetDefaultPatchBaselineRequest {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): GetDefaultPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDefaultPatchBaselineRequest]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetDefaultPatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): GetDefaultPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDefaultPatchBaselineResult]
    }
  }

  @js.native
  trait GetDeployablePatchSnapshotForInstanceRequest extends js.Object {
    var InstanceId: InstanceId
    var SnapshotId: SnapshotId
  }

  object GetDeployablePatchSnapshotForInstanceRequest {
    def apply(
      InstanceId: InstanceId,
      SnapshotId: SnapshotId): GetDeployablePatchSnapshotForInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
    }
  }

  @js.native
  trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var Product: js.UndefOr[Product]
    var SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object GetDeployablePatchSnapshotForInstanceResult {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Product: js.UndefOr[Product] = js.undefined,
      SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): GetDeployablePatchSnapshotForInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Product" -> Product.map { x => x.asInstanceOf[js.Any] },
        "SnapshotDownloadUrl" -> SnapshotDownloadUrl.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
    }
  }

  @js.native
  trait GetDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object GetDocumentRequest {
    def apply(
      Name: DocumentARN,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): GetDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResult extends js.Object {
    var AttachmentsContent: js.UndefOr[AttachmentContentList]
    var Content: js.UndefOr[DocumentContent]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object GetDocumentResult {
    def apply(
      AttachmentsContent: js.UndefOr[AttachmentContentList] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Name: js.UndefOr[DocumentARN] = js.undefined,
      Status: js.UndefOr[DocumentStatus] = js.undefined,
      StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): GetDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachmentsContent" -> AttachmentsContent.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusInformation" -> StatusInformation.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentResult]
    }
  }

  @js.native
  trait GetInventoryRequest extends js.Object {
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResultAttributes: js.UndefOr[ResultAttributeList]
  }

  object GetInventoryRequest {
    def apply(
      Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
      Filters: js.UndefOr[InventoryFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined): GetInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aggregators" -> Aggregators.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResultAttributes" -> ResultAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventoryRequest]
    }
  }

  @js.native
  trait GetInventoryResult extends js.Object {
    var Entities: js.UndefOr[InventoryResultEntityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInventoryResult {
    def apply(
      Entities: js.UndefOr[InventoryResultEntityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInventoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entities" -> Entities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventoryResult]
    }
  }

  @js.native
  trait GetInventorySchemaRequest extends js.Object {
    var Aggregator: js.UndefOr[AggregatorSchemaOnly]
    var MaxResults: js.UndefOr[GetInventorySchemaMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SubType: js.UndefOr[IsSubTypeSchema]
    var TypeName: js.UndefOr[InventoryItemTypeNameFilter]
  }

  object GetInventorySchemaRequest {
    def apply(
      Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.undefined,
      MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SubType: js.UndefOr[IsSubTypeSchema] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.undefined): GetInventorySchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aggregator" -> Aggregator.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SubType" -> SubType.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventorySchemaRequest]
    }
  }

  @js.native
  trait GetInventorySchemaResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Schemas: js.UndefOr[InventoryItemSchemaResultList]
  }

  object GetInventorySchemaResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined): GetInventorySchemaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Schemas" -> Schemas.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventorySchemaResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionRequest {
    def apply(
      WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionResult extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object GetMaintenanceWindowExecutionResult {
    def apply(
      EndTime: js.UndefOr[DateTime] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined): GetMaintenanceWindowExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskIds" -> TaskIds.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
    var InvocationId: MaintenanceWindowExecutionTaskInvocationId
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionTaskInvocationRequest {
    def apply(
      InvocationId: MaintenanceWindowExecutionTaskInvocationId,
      TaskId: MaintenanceWindowExecutionTaskId,
      WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionTaskInvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InvocationId" -> InvocationId.asInstanceOf[js.Any],
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskInvocationResult extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId]
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId]
  }

  object GetMaintenanceWindowExecutionTaskInvocationResult {
    def apply(
      EndTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined,
      InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined): GetMaintenanceWindowExecutionTaskInvocationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "InvocationId" -> InvocationId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionTaskRequest {
    def apply(
      TaskId: MaintenanceWindowExecutionTaskId,
      WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var ServiceRole: js.UndefOr[ServiceRole]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList]
    var Type: js.UndefOr[MaintenanceWindowTaskType]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object GetMaintenanceWindowExecutionTaskResult {
    def apply(
      EndTime: js.UndefOr[DateTime] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.undefined,
      Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined): GetMaintenanceWindowExecutionTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object GetMaintenanceWindowRequest {
    def apply(
      WindowId: MaintenanceWindowId): GetMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowResult extends js.Object {
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var CreatedDate: js.UndefOr[DateTime]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var ModifiedDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object GetMaintenanceWindowResult {
    def apply(
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): GetMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "ModifiedDate" -> ModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NextExecutionTime" -> NextExecutionTime.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowTaskRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  object GetMaintenanceWindowTaskRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      WindowTaskId: MaintenanceWindowTaskId): GetMaintenanceWindowTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowTaskRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowTaskResult extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var Targets: js.UndefOr[Targets]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object GetMaintenanceWindowTaskResult {
    def apply(
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): GetMaintenanceWindowTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait GetParameterHistoryRequest extends js.Object {
    var Name: PSParameterName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParameterHistoryRequest {
    def apply(
      Name: PSParameterName,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterHistoryRequest]
    }
  }

  @js.native
  trait GetParameterHistoryResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterHistoryList]
  }

  object GetParameterHistoryResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Parameters: js.UndefOr[ParameterHistoryList] = js.undefined): GetParameterHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterHistoryResult]
    }
  }

  @js.native
  trait GetParameterRequest extends js.Object {
    var Name: PSParameterName
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParameterRequest {
    def apply(
      Name: PSParameterName,
      WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterRequest]
    }
  }

  @js.native
  trait GetParameterResult extends js.Object {
    var Parameter: js.UndefOr[Parameter]
  }

  object GetParameterResult {
    def apply(
      Parameter: js.UndefOr[Parameter] = js.undefined): GetParameterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameter" -> Parameter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterResult]
    }
  }

  @js.native
  trait GetParametersByPathRequest extends js.Object {
    var Path: PSParameterName
    var MaxResults: js.UndefOr[GetParametersByPathMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ParameterFilters: js.UndefOr[ParameterStringFilterList]
    var Recursive: js.UndefOr[Boolean]
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParametersByPathRequest {
    def apply(
      Path: PSParameterName,
      MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined,
      Recursive: js.UndefOr[Boolean] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParametersByPathRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ParameterFilters" -> ParameterFilters.map { x => x.asInstanceOf[js.Any] },
        "Recursive" -> Recursive.map { x => x.asInstanceOf[js.Any] },
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersByPathRequest]
    }
  }

  @js.native
  trait GetParametersByPathResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterList]
  }

  object GetParametersByPathResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Parameters: js.UndefOr[ParameterList] = js.undefined): GetParametersByPathResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersByPathResult]
    }
  }

  @js.native
  trait GetParametersRequest extends js.Object {
    var Names: ParameterNameList
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParametersRequest {
    def apply(
      Names: ParameterNameList,
      WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.asInstanceOf[js.Any],
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersRequest]
    }
  }

  @js.native
  trait GetParametersResult extends js.Object {
    var InvalidParameters: js.UndefOr[ParameterNameList]
    var Parameters: js.UndefOr[ParameterList]
  }

  object GetParametersResult {
    def apply(
      InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined,
      Parameters: js.UndefOr[ParameterList] = js.undefined): GetParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InvalidParameters" -> InvalidParameters.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersResult]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetPatchBaselineForPatchGroupRequest {
    def apply(
      PatchGroup: PatchGroup,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): GetPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any],
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object GetPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): GetPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait GetPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object GetPatchBaselineRequest {
    def apply(
      BaselineId: BaselineId): GetPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineRequest]
    }
  }

  @js.native
  trait GetPatchBaselineResult extends js.Object {
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var BaselineId: js.UndefOr[BaselineId]
    var CreatedDate: js.UndefOr[DateTime]
    var Description: js.UndefOr[BaselineDescription]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
    var ModifiedDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[BaselineName]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var PatchGroups: js.UndefOr[PatchGroupList]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var Sources: js.UndefOr[PatchSourceList]
  }

  object GetPatchBaselineResult {
    def apply(
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined,
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      PatchGroups: js.UndefOr[PatchGroupList] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined): GetPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] },
        "ModifiedDate" -> ModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "PatchGroups" -> PatchGroups.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineResult]
    }
  }

  /**
   * Status information about the aggregated associations.
   */
  @js.native
  trait InstanceAggregatedAssociationOverview extends js.Object {
    var DetailedStatus: js.UndefOr[StatusName]
    var InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount]
  }

  object InstanceAggregatedAssociationOverview {
    def apply(
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount] = js.undefined): InstanceAggregatedAssociationOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "InstanceAssociationStatusAggregatedCount" -> InstanceAssociationStatusAggregatedCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAggregatedAssociationOverview]
    }
  }

  /**
   * One or more association documents on the instance.
   */
  @js.native
  trait InstanceAssociation extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var Content: js.UndefOr[DocumentContent]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object InstanceAssociation {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): InstanceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociation]
    }
  }

  /**
   * An Amazon S3 bucket where you want to store the results of this request.
   */
  @js.native
  trait InstanceAssociationOutputLocation extends js.Object {
    var S3Location: js.UndefOr[S3OutputLocation]
  }

  object InstanceAssociationOutputLocation {
    def apply(
      S3Location: js.UndefOr[S3OutputLocation] = js.undefined): InstanceAssociationOutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Location" -> S3Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationOutputLocation]
    }
  }

  /**
   * The URL of Amazon S3 bucket where you want to store the results of this request.
   */
  @js.native
  trait InstanceAssociationOutputUrl extends js.Object {
    var S3OutputUrl: js.UndefOr[S3OutputUrl]
  }

  object InstanceAssociationOutputUrl {
    def apply(
      S3OutputUrl: js.UndefOr[S3OutputUrl] = js.undefined): InstanceAssociationOutputUrl = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputUrl" -> S3OutputUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationOutputUrl]
    }
  }

  /**
   * Status information about the instance association.
   */
  @js.native
  trait InstanceAssociationStatusInfo extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var DetailedStatus: js.UndefOr[StatusName]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var ErrorCode: js.UndefOr[AgentErrorCode]
    var ExecutionDate: js.UndefOr[DateTime]
    var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentName]
    var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl]
    var Status: js.UndefOr[StatusName]
  }

  object InstanceAssociationStatusInfo {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      ErrorCode: js.UndefOr[AgentErrorCode] = js.undefined,
      ExecutionDate: js.UndefOr[DateTime] = js.undefined,
      ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): InstanceAssociationStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ExecutionDate" -> ExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OutputUrl" -> OutputUrl.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationStatusInfo]
    }
  }

  /**
   * Describes a filter for a specific list of instances.
   */
  @js.native
  trait InstanceInformation extends js.Object {
    var ActivationId: js.UndefOr[ActivationId]
    var AgentVersion: js.UndefOr[Version]
    var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview]
    var AssociationStatus: js.UndefOr[StatusName]
    var ComputerName: js.UndefOr[ComputerName]
    var IPAddress: js.UndefOr[IPAddress]
    var IamRole: js.UndefOr[IamRole]
    var InstanceId: js.UndefOr[InstanceId]
    var IsLatestVersion: js.UndefOr[Boolean]
    var LastAssociationExecutionDate: js.UndefOr[DateTime]
    var LastPingDateTime: js.UndefOr[DateTime]
    var LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[String]
    var PingStatus: js.UndefOr[PingStatus]
    var PlatformName: js.UndefOr[String]
    var PlatformType: js.UndefOr[PlatformType]
    var PlatformVersion: js.UndefOr[String]
    var RegistrationDate: js.UndefOr[DateTime]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object InstanceInformation {
    def apply(
      ActivationId: js.UndefOr[ActivationId] = js.undefined,
      AgentVersion: js.UndefOr[Version] = js.undefined,
      AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.undefined,
      AssociationStatus: js.UndefOr[StatusName] = js.undefined,
      ComputerName: js.UndefOr[ComputerName] = js.undefined,
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      IsLatestVersion: js.UndefOr[Boolean] = js.undefined,
      LastAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined,
      LastPingDateTime: js.UndefOr[DateTime] = js.undefined,
      LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      PingStatus: js.UndefOr[PingStatus] = js.undefined,
      PlatformName: js.UndefOr[String] = js.undefined,
      PlatformType: js.UndefOr[PlatformType] = js.undefined,
      PlatformVersion: js.UndefOr[String] = js.undefined,
      RegistrationDate: js.UndefOr[DateTime] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): InstanceInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] },
        "AgentVersion" -> AgentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationOverview" -> AssociationOverview.map { x => x.asInstanceOf[js.Any] },
        "AssociationStatus" -> AssociationStatus.map { x => x.asInstanceOf[js.Any] },
        "ComputerName" -> ComputerName.map { x => x.asInstanceOf[js.Any] },
        "IPAddress" -> IPAddress.map { x => x.asInstanceOf[js.Any] },
        "IamRole" -> IamRole.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "IsLatestVersion" -> IsLatestVersion.map { x => x.asInstanceOf[js.Any] },
        "LastAssociationExecutionDate" -> LastAssociationExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "LastPingDateTime" -> LastPingDateTime.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulAssociationExecutionDate" -> LastSuccessfulAssociationExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PingStatus" -> PingStatus.map { x => x.asInstanceOf[js.Any] },
        "PlatformName" -> PlatformName.map { x => x.asInstanceOf[js.Any] },
        "PlatformType" -> PlatformType.map { x => x.asInstanceOf[js.Any] },
        "PlatformVersion" -> PlatformVersion.map { x => x.asInstanceOf[js.Any] },
        "RegistrationDate" -> RegistrationDate.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformation]
    }
  }

  /**
   * Describes a filter for a specific list of instances. You can filter instances information by using tags. You specify tags by using a key-value mapping.
   *  Use this action instead of the [[DescribeInstanceInformationRequest.InstanceInformationFilterList]] method. The <code>InstanceInformationFilterList</code> method is a legacy method and does not support tags.
   */
  @js.native
  trait InstanceInformationFilter extends js.Object {
    var key: InstanceInformationFilterKey
    var valueSet: InstanceInformationFilterValueSet
  }

  object InstanceInformationFilter {
    def apply(
      key: InstanceInformationFilterKey,
      valueSet: InstanceInformationFilterValueSet): InstanceInformationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "valueSet" -> valueSet.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformationFilter]
    }
  }

  object InstanceInformationFilterKeyEnum {
    val InstanceIds = "InstanceIds"
    val AgentVersion = "AgentVersion"
    val PingStatus = "PingStatus"
    val PlatformTypes = "PlatformTypes"
    val ActivationIds = "ActivationIds"
    val IamRole = "IamRole"
    val ResourceType = "ResourceType"
    val AssociationStatus = "AssociationStatus"

    val values = IndexedSeq(InstanceIds, AgentVersion, PingStatus, PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus)
  }

  /**
   * The filters to describe or get information about your managed instances.
   */
  @js.native
  trait InstanceInformationStringFilter extends js.Object {
    var Key: InstanceInformationStringFilterKey
    var Values: InstanceInformationFilterValueSet
  }

  object InstanceInformationStringFilter {
    def apply(
      Key: InstanceInformationStringFilterKey,
      Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformationStringFilter]
    }
  }

  /**
   * Defines the high-level patch compliance state for a managed instance, providing information about the number of installed, missing, not applicable, and failed patches along with metadata about the operation when this information was gathered for the instance.
   */
  @js.native
  trait InstancePatchState extends js.Object {
    var BaselineId: BaselineId
    var InstanceId: InstanceId
    var Operation: PatchOperationType
    var OperationEndTime: DateTime
    var OperationStartTime: DateTime
    var PatchGroup: PatchGroup
    var FailedCount: js.UndefOr[PatchFailedCount]
    var InstallOverrideList: js.UndefOr[InstallOverrideList]
    var InstalledCount: js.UndefOr[PatchInstalledCount]
    var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount]
    var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount]
    var MissingCount: js.UndefOr[PatchMissingCount]
    var NotApplicableCount: js.UndefOr[PatchNotApplicableCount]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object InstancePatchState {
    def apply(
      BaselineId: BaselineId,
      InstanceId: InstanceId,
      Operation: PatchOperationType,
      OperationEndTime: DateTime,
      OperationStartTime: DateTime,
      PatchGroup: PatchGroup,
      FailedCount: js.UndefOr[PatchFailedCount] = js.undefined,
      InstallOverrideList: js.UndefOr[InstallOverrideList] = js.undefined,
      InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined,
      InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined,
      InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined,
      MissingCount: js.UndefOr[PatchMissingCount] = js.undefined,
      NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): InstancePatchState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any],
        "OperationEndTime" -> OperationEndTime.asInstanceOf[js.Any],
        "OperationStartTime" -> OperationStartTime.asInstanceOf[js.Any],
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any],
        "FailedCount" -> FailedCount.map { x => x.asInstanceOf[js.Any] },
        "InstallOverrideList" -> InstallOverrideList.map { x => x.asInstanceOf[js.Any] },
        "InstalledCount" -> InstalledCount.map { x => x.asInstanceOf[js.Any] },
        "InstalledOtherCount" -> InstalledOtherCount.map { x => x.asInstanceOf[js.Any] },
        "InstalledRejectedCount" -> InstalledRejectedCount.map { x => x.asInstanceOf[js.Any] },
        "MissingCount" -> MissingCount.map { x => x.asInstanceOf[js.Any] },
        "NotApplicableCount" -> NotApplicableCount.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePatchState]
    }
  }

  /**
   * Defines a filter used in DescribeInstancePatchStatesForPatchGroup used to scope down the information returned by the API.
   */
  @js.native
  trait InstancePatchStateFilter extends js.Object {
    var Key: InstancePatchStateFilterKey
    var Type: InstancePatchStateOperatorType
    var Values: InstancePatchStateFilterValues
  }

  object InstancePatchStateFilter {
    def apply(
      Key: InstancePatchStateFilterKey,
      Type: InstancePatchStateOperatorType,
      Values: InstancePatchStateFilterValues): InstancePatchStateFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePatchStateFilter]
    }
  }

  object InstancePatchStateOperatorTypeEnum {
    val Equal = "Equal"
    val NotEqual = "NotEqual"
    val LessThan = "LessThan"
    val GreaterThan = "GreaterThan"

    val values = IndexedSeq(Equal, NotEqual, LessThan, GreaterThan)
  }

  /**
   * Specifies the inventory type and attribute for the aggregation execution.
   */
  @js.native
  trait InventoryAggregator extends js.Object {
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Expression: js.UndefOr[InventoryAggregatorExpression]
    var Groups: js.UndefOr[InventoryGroupList]
  }

  object InventoryAggregator {
    def apply(
      Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
      Expression: js.UndefOr[InventoryAggregatorExpression] = js.undefined,
      Groups: js.UndefOr[InventoryGroupList] = js.undefined): InventoryAggregator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aggregators" -> Aggregators.map { x => x.asInstanceOf[js.Any] },
        "Expression" -> Expression.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryAggregator]
    }
  }

  object InventoryAttributeDataTypeEnum {
    val string = "string"
    val number = "number"

    val values = IndexedSeq(string, number)
  }

  object InventoryDeletionStatusEnum {
    val InProgress = "InProgress"
    val Complete = "Complete"

    val values = IndexedSeq(InProgress, Complete)
  }

  /**
   * Status information returned by the <code>DeleteInventory</code> action.
   */
  @js.native
  trait InventoryDeletionStatusItem extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var LastStatus: js.UndefOr[InventoryDeletionStatus]
    var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage]
    var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  object InventoryDeletionStatusItem {
    def apply(
      DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined,
      DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.undefined,
      DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined,
      LastStatus: js.UndefOr[InventoryDeletionStatus] = js.undefined,
      LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.undefined,
      LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined): InventoryDeletionStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionId" -> DeletionId.map { x => x.asInstanceOf[js.Any] },
        "DeletionStartTime" -> DeletionStartTime.map { x => x.asInstanceOf[js.Any] },
        "DeletionSummary" -> DeletionSummary.map { x => x.asInstanceOf[js.Any] },
        "LastStatus" -> LastStatus.map { x => x.asInstanceOf[js.Any] },
        "LastStatusMessage" -> LastStatusMessage.map { x => x.asInstanceOf[js.Any] },
        "LastStatusUpdateTime" -> LastStatusUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDeletionStatusItem]
    }
  }

  /**
   * Information about the delete operation.
   */
  @js.native
  trait InventoryDeletionSummary extends js.Object {
    var RemainingCount: js.UndefOr[RemainingCount]
    var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object InventoryDeletionSummary {
    def apply(
      RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
      SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.undefined,
      TotalCount: js.UndefOr[TotalCount] = js.undefined): InventoryDeletionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RemainingCount" -> RemainingCount.map { x => x.asInstanceOf[js.Any] },
        "SummaryItems" -> SummaryItems.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDeletionSummary]
    }
  }

  /**
   * Either a count, remaining count, or a version number in a delete inventory summary.
   */
  @js.native
  trait InventoryDeletionSummaryItem extends js.Object {
    var Count: js.UndefOr[ResourceCount]
    var RemainingCount: js.UndefOr[RemainingCount]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
  }

  object InventoryDeletionSummaryItem {
    def apply(
      Count: js.UndefOr[ResourceCount] = js.undefined,
      RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
      Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined): InventoryDeletionSummaryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "RemainingCount" -> RemainingCount.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDeletionSummaryItem]
    }
  }

  /**
   * One or more filters. Use a filter to return a more specific list of results.
   */
  @js.native
  trait InventoryFilter extends js.Object {
    var Key: InventoryFilterKey
    var Values: InventoryFilterValueList
    var Type: js.UndefOr[InventoryQueryOperatorType]
  }

  object InventoryFilter {
    def apply(
      Key: InventoryFilterKey,
      Values: InventoryFilterValueList,
      Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined): InventoryFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any],
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryFilter]
    }
  }

  /**
   * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
   */
  @js.native
  trait InventoryGroup extends js.Object {
    var Filters: InventoryFilterList
    var Name: InventoryGroupName
  }

  object InventoryGroup {
    def apply(
      Filters: InventoryFilterList,
      Name: InventoryGroupName): InventoryGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryGroup]
    }
  }

  /**
   * Information collected from managed instances based on your inventory policy document
   */
  @js.native
  trait InventoryItem extends js.Object {
    var CaptureTime: InventoryItemCaptureTime
    var SchemaVersion: InventoryItemSchemaVersion
    var TypeName: InventoryItemTypeName
    var Content: js.UndefOr[InventoryItemEntryList]
    var ContentHash: js.UndefOr[InventoryItemContentHash]
    var Context: js.UndefOr[InventoryItemContentContext]
  }

  object InventoryItem {
    def apply(
      CaptureTime: InventoryItemCaptureTime,
      SchemaVersion: InventoryItemSchemaVersion,
      TypeName: InventoryItemTypeName,
      Content: js.UndefOr[InventoryItemEntryList] = js.undefined,
      ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined,
      Context: js.UndefOr[InventoryItemContentContext] = js.undefined): InventoryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptureTime" -> CaptureTime.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any],
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "ContentHash" -> ContentHash.map { x => x.asInstanceOf[js.Any] },
        "Context" -> Context.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItem]
    }
  }

  /**
   * Attributes are the entries within the inventory item content. It contains name and value.
   */
  @js.native
  trait InventoryItemAttribute extends js.Object {
    var DataType: InventoryAttributeDataType
    var Name: InventoryItemAttributeName
  }

  object InventoryItemAttribute {
    def apply(
      DataType: InventoryAttributeDataType,
      Name: InventoryItemAttributeName): InventoryItemAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataType" -> DataType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItemAttribute]
    }
  }

  /**
   * The inventory item schema definition. Users can use this to compose inventory query filters.
   */
  @js.native
  trait InventoryItemSchema extends js.Object {
    var Attributes: InventoryItemAttributeList
    var TypeName: InventoryItemTypeName
    var DisplayName: js.UndefOr[InventoryTypeDisplayName]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
  }

  object InventoryItemSchema {
    def apply(
      Attributes: InventoryItemAttributeList,
      TypeName: InventoryItemTypeName,
      DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.undefined,
      Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined): InventoryItemSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItemSchema]
    }
  }

  object InventoryQueryOperatorTypeEnum {
    val Equal = "Equal"
    val NotEqual = "NotEqual"
    val BeginWith = "BeginWith"
    val LessThan = "LessThan"
    val GreaterThan = "GreaterThan"
    val Exists = "Exists"

    val values = IndexedSeq(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists)
  }

  /**
   * Inventory query results.
   */
  @js.native
  trait InventoryResultEntity extends js.Object {
    var Data: js.UndefOr[InventoryResultItemMap]
    var Id: js.UndefOr[InventoryResultEntityId]
  }

  object InventoryResultEntity {
    def apply(
      Data: js.UndefOr[InventoryResultItemMap] = js.undefined,
      Id: js.UndefOr[InventoryResultEntityId] = js.undefined): InventoryResultEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryResultEntity]
    }
  }

  /**
   * The inventory result item.
   */
  @js.native
  trait InventoryResultItem extends js.Object {
    var Content: InventoryItemEntryList
    var SchemaVersion: InventoryItemSchemaVersion
    var TypeName: InventoryItemTypeName
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var ContentHash: js.UndefOr[InventoryItemContentHash]
  }

  object InventoryResultItem {
    def apply(
      Content: InventoryItemEntryList,
      SchemaVersion: InventoryItemSchemaVersion,
      TypeName: InventoryItemTypeName,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined): InventoryResultItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any],
        "CaptureTime" -> CaptureTime.map { x => x.asInstanceOf[js.Any] },
        "ContentHash" -> ContentHash.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryResultItem]
    }
  }

  object InventorySchemaDeleteOptionEnum {
    val DisableSchema = "DisableSchema"
    val DeleteSchema = "DeleteSchema"

    val values = IndexedSeq(DisableSchema, DeleteSchema)
  }

  @js.native
  trait LabelParameterVersionRequest extends js.Object {
    var Labels: ParameterLabelList
    var Name: PSParameterName
    var ParameterVersion: js.UndefOr[PSParameterVersion]
  }

  object LabelParameterVersionRequest {
    def apply(
      Labels: ParameterLabelList,
      Name: PSParameterName,
      ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined): LabelParameterVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Labels" -> Labels.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ParameterVersion" -> ParameterVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelParameterVersionRequest]
    }
  }

  @js.native
  trait LabelParameterVersionResult extends js.Object {
    var InvalidLabels: js.UndefOr[ParameterLabelList]
  }

  object LabelParameterVersionResult {
    def apply(
      InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined): LabelParameterVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InvalidLabels" -> InvalidLabels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelParameterVersionResult]
    }
  }

  object LastResourceDataSyncStatusEnum {
    val Successful = "Successful"
    val Failed = "Failed"
    val InProgress = "InProgress"

    val values = IndexedSeq(Successful, Failed, InProgress)
  }

  @js.native
  trait ListAssociationVersionsRequest extends js.Object {
    var AssociationId: AssociationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationVersionsRequest {
    def apply(
      AssociationId: AssociationId,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAssociationVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationVersionsRequest]
    }
  }

  @js.native
  trait ListAssociationVersionsResult extends js.Object {
    var AssociationVersions: js.UndefOr[AssociationVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationVersionsResult {
    def apply(
      AssociationVersions: js.UndefOr[AssociationVersionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAssociationVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationVersions" -> AssociationVersions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationVersionsResult]
    }
  }

  @js.native
  trait ListAssociationsRequest extends js.Object {
    var AssociationFilterList: js.UndefOr[AssociationFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationsRequest {
    def apply(
      AssociationFilterList: js.UndefOr[AssociationFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationFilterList" -> AssociationFilterList.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsRequest]
    }
  }

  @js.native
  trait ListAssociationsResult extends js.Object {
    var Associations: js.UndefOr[AssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationsResult {
    def apply(
      Associations: js.UndefOr[AssociationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Associations" -> Associations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsResult]
    }
  }

  @js.native
  trait ListCommandInvocationsRequest extends js.Object {
    var CommandId: js.UndefOr[CommandId]
    var Details: js.UndefOr[Boolean]
    var Filters: js.UndefOr[CommandFilterList]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[CommandMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandInvocationsRequest {
    def apply(
      CommandId: js.UndefOr[CommandId] = js.undefined,
      Details: js.UndefOr[Boolean] = js.undefined,
      Filters: js.UndefOr[CommandFilterList] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCommandInvocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandInvocationsRequest]
    }
  }

  @js.native
  trait ListCommandInvocationsResult extends js.Object {
    var CommandInvocations: js.UndefOr[CommandInvocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandInvocationsResult {
    def apply(
      CommandInvocations: js.UndefOr[CommandInvocationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCommandInvocationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandInvocations" -> CommandInvocations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandInvocationsResult]
    }
  }

  @js.native
  trait ListCommandsRequest extends js.Object {
    var CommandId: js.UndefOr[CommandId]
    var Filters: js.UndefOr[CommandFilterList]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[CommandMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandsRequest {
    def apply(
      CommandId: js.UndefOr[CommandId] = js.undefined,
      Filters: js.UndefOr[CommandFilterList] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCommandsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandsRequest]
    }
  }

  @js.native
  trait ListCommandsResult extends js.Object {
    var Commands: js.UndefOr[CommandList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandsResult {
    def apply(
      Commands: js.UndefOr[CommandList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCommandsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Commands" -> Commands.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandsResult]
    }
  }

  @js.native
  trait ListComplianceItemsRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceIds: js.UndefOr[ComplianceResourceIdList]
    var ResourceTypes: js.UndefOr[ComplianceResourceTypeList]
  }

  object ListComplianceItemsRequest {
    def apply(
      Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined,
      ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.undefined): ListComplianceItemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListComplianceItemsRequest]
    }
  }

  @js.native
  trait ListComplianceItemsResult extends js.Object {
    var ComplianceItems: js.UndefOr[ComplianceItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceItemsResult {
    def apply(
      ComplianceItems: js.UndefOr[ComplianceItemList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListComplianceItemsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceItems" -> ComplianceItems.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListComplianceItemsResult]
    }
  }

  @js.native
  trait ListComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceSummariesRequest {
    def apply(
      Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListComplianceSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListComplianceSummariesRequest]
    }
  }

  @js.native
  trait ListComplianceSummariesResult extends js.Object {
    var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceSummariesResult {
    def apply(
      ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListComplianceSummariesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceSummaryItems" -> ComplianceSummaryItems.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListComplianceSummariesResult]
    }
  }

  @js.native
  trait ListDocumentVersionsRequest extends js.Object {
    var Name: DocumentName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentVersionsRequest {
    def apply(
      Name: DocumentName,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDocumentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentVersionsRequest]
    }
  }

  @js.native
  trait ListDocumentVersionsResult extends js.Object {
    var DocumentVersions: js.UndefOr[DocumentVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentVersionsResult {
    def apply(
      DocumentVersions: js.UndefOr[DocumentVersionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDocumentVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentVersions" -> DocumentVersions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentVersionsResult]
    }
  }

  @js.native
  trait ListDocumentsRequest extends js.Object {
    var DocumentFilterList: js.UndefOr[DocumentFilterList]
    var Filters: js.UndefOr[DocumentKeyValuesFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentsRequest {
    def apply(
      DocumentFilterList: js.UndefOr[DocumentFilterList] = js.undefined,
      Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDocumentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentFilterList" -> DocumentFilterList.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentsRequest]
    }
  }

  @js.native
  trait ListDocumentsResult extends js.Object {
    var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentsResult {
    def apply(
      DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDocumentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentIdentifiers" -> DocumentIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentsResult]
    }
  }

  @js.native
  trait ListInventoryEntriesRequest extends js.Object {
    var InstanceId: InstanceId
    var TypeName: InventoryItemTypeName
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInventoryEntriesRequest {
    def apply(
      InstanceId: InstanceId,
      TypeName: InventoryItemTypeName,
      Filters: js.UndefOr[InventoryFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListInventoryEntriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInventoryEntriesRequest]
    }
  }

  @js.native
  trait ListInventoryEntriesResult extends js.Object {
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var Entries: js.UndefOr[InventoryItemEntryList]
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
    var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  object ListInventoryEntriesResult {
    def apply(
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      Entries: js.UndefOr[InventoryItemEntryList] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined): ListInventoryEntriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptureTime" -> CaptureTime.map { x => x.asInstanceOf[js.Any] },
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInventoryEntriesResult]
    }
  }

  @js.native
  trait ListResourceComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceComplianceSummariesRequest {
    def apply(
      Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResourceComplianceSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceComplianceSummariesRequest]
    }
  }

  @js.native
  trait ListResourceComplianceSummariesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList]
  }

  object ListResourceComplianceSummariesResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined): ListResourceComplianceSummariesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceComplianceSummaryItems" -> ResourceComplianceSummaryItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceComplianceSummariesResult]
    }
  }

  @js.native
  trait ListResourceDataSyncRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceDataSyncRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResourceDataSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDataSyncRequest]
    }
  }

  @js.native
  trait ListResourceDataSyncResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList]
  }

  object ListResourceDataSyncResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined): ListResourceDataSyncResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceDataSyncItems" -> ResourceDataSyncItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDataSyncResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceId: ResourceId,
      ResourceType: ResourceTypeForTagging): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResult {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined): ListTagsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
   * Information about an Amazon S3 bucket to write instance-level logs to.
   *
   * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   */
  @js.native
  trait LoggingInfo extends js.Object {
    var S3BucketName: S3BucketName
    var S3Region: S3Region
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object LoggingInfo {
    def apply(
      S3BucketName: S3BucketName,
      S3Region: S3Region,
      S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined): LoggingInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any],
        "S3Region" -> S3Region.asInstanceOf[js.Any],
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingInfo]
    }
  }

  /**
   * The parameters for an AUTOMATION task type.
   */
  @js.native
  trait MaintenanceWindowAutomationParameters extends js.Object {
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Parameters: js.UndefOr[AutomationParameterMap]
  }

  object MaintenanceWindowAutomationParameters {
    def apply(
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined): MaintenanceWindowAutomationParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowAutomationParameters]
    }
  }

  /**
   * Describes the information about an execution of a Maintenance Window.
   */
  @js.native
  trait MaintenanceWindowExecution extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object MaintenanceWindowExecution {
    def apply(
      EndTime: js.UndefOr[DateTime] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): MaintenanceWindowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecution]
    }
  }

  object MaintenanceWindowExecutionStatusEnum {
    val PENDING = "PENDING"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"
    val TIMED_OUT = "TIMED_OUT"
    val CANCELLING = "CANCELLING"
    val CANCELLED = "CANCELLED"
    val SKIPPED_OVERLAPPING = "SKIPPED_OVERLAPPING"

    val values = IndexedSeq(PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING)
  }

  /**
   * Information about a task execution performed as part of a Maintenance Window execution.
   */
  @js.native
  trait MaintenanceWindowExecutionTaskIdentity extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object MaintenanceWindowExecutionTaskIdentity {
    def apply(
      EndTime: js.UndefOr[DateTime] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined): MaintenanceWindowExecutionTaskIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
    }
  }

  /**
   * Describes the information about a task invocation for a particular target as part of a task execution performed as part of a Maintenance Window execution.
   */
  @js.native
  trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId]
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId]
  }

  object MaintenanceWindowExecutionTaskInvocationIdentity {
    def apply(
      EndTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined,
      InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined): MaintenanceWindowExecutionTaskInvocationIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "InvocationId" -> InvocationId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
    }
  }

  /**
   * Filter used in the request. Supported filter keys are Name and Enabled.
   */
  @js.native
  trait MaintenanceWindowFilter extends js.Object {
    var Key: js.UndefOr[MaintenanceWindowFilterKey]
    var Values: js.UndefOr[MaintenanceWindowFilterValues]
  }

  object MaintenanceWindowFilter {
    def apply(
      Key: js.UndefOr[MaintenanceWindowFilterKey] = js.undefined,
      Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined): MaintenanceWindowFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowFilter]
    }
  }

  /**
   * Information about the Maintenance Window.
   */
  @js.native
  trait MaintenanceWindowIdentity extends js.Object {
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object MaintenanceWindowIdentity {
    def apply(
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): MaintenanceWindowIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NextExecutionTime" -> NextExecutionTime.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowIdentity]
    }
  }

  /**
   * The Maintenance Window to which the specified target belongs.
   */
  @js.native
  trait MaintenanceWindowIdentityForTarget extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object MaintenanceWindowIdentityForTarget {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): MaintenanceWindowIdentityForTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowIdentityForTarget]
    }
  }

  /**
   * The parameters for a LAMBDA task type.
   *  For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
   *
   * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   *  <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   *  For Lambda tasks, Systems Manager ignores any values specified for TaskParameters and LoggingInfo.
   */
  @js.native
  trait MaintenanceWindowLambdaParameters extends js.Object {
    var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext]
    var Payload: js.UndefOr[MaintenanceWindowLambdaPayload]
    var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier]
  }

  object MaintenanceWindowLambdaParameters {
    def apply(
      ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.undefined,
      Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.undefined,
      Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.undefined): MaintenanceWindowLambdaParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientContext" -> ClientContext.map { x => x.asInstanceOf[js.Any] },
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowLambdaParameters]
    }
  }

  object MaintenanceWindowResourceTypeEnum {
    val INSTANCE = "INSTANCE"

    val values = IndexedSeq(INSTANCE)
  }

  /**
   * The parameters for a RUN_COMMAND task type.
   *  For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
   *
   * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   *  <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   *  For Run Command tasks, Systems Manager uses specified values for <code>TaskParameters</code> and <code>LoggingInfo</code> only if no values are specified for <code>TaskInvocationParameters</code>.
   */
  @js.native
  trait MaintenanceWindowRunCommandParameters extends js.Object {
    var Comment: js.UndefOr[Comment]
    var DocumentHash: js.UndefOr[DocumentHash]
    var DocumentHashType: js.UndefOr[DocumentHashType]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var Parameters: js.UndefOr[Parameters]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds]
  }

  object MaintenanceWindowRunCommandParameters {
    def apply(
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentHash: js.UndefOr[DocumentHash] = js.undefined,
      DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined): MaintenanceWindowRunCommandParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "DocumentHash" -> DocumentHash.map { x => x.asInstanceOf[js.Any] },
        "DocumentHashType" -> DocumentHashType.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TimeoutSeconds" -> TimeoutSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowRunCommandParameters]
    }
  }

  /**
   * The parameters for a STEP_FUNCTION task.
   *  For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
   *
   * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   *  <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
   *  For Step Functions tasks, Systems Manager ignores any values specified for <code>TaskParameters</code> and <code>LoggingInfo</code>.
   */
  @js.native
  trait MaintenanceWindowStepFunctionsParameters extends js.Object {
    var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput]
    var Name: js.UndefOr[MaintenanceWindowStepFunctionsName]
  }

  object MaintenanceWindowStepFunctionsParameters {
    def apply(
      Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.undefined): MaintenanceWindowStepFunctionsParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowStepFunctionsParameters]
    }
  }

  /**
   * The target registered with the Maintenance Window.
   */
  @js.native
  trait MaintenanceWindowTarget extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var Targets: js.UndefOr[Targets]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object MaintenanceWindowTarget {
    def apply(
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined): MaintenanceWindowTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTarget]
    }
  }

  /**
   * Information about a task defined for a Maintenance Window.
   */
  @js.native
  trait MaintenanceWindowTask extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var Targets: js.UndefOr[Targets]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var Type: js.UndefOr[MaintenanceWindowTaskType]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object MaintenanceWindowTask {
    def apply(
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): MaintenanceWindowTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTask]
    }
  }

  /**
   * The parameters for task execution.
   */
  @js.native
  trait MaintenanceWindowTaskInvocationParameters extends js.Object {
    var Automation: js.UndefOr[MaintenanceWindowAutomationParameters]
    var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters]
    var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters]
    var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters]
  }

  object MaintenanceWindowTaskInvocationParameters {
    def apply(
      Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.undefined,
      Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.undefined,
      RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.undefined,
      StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.undefined): MaintenanceWindowTaskInvocationParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Automation" -> Automation.map { x => x.asInstanceOf[js.Any] },
        "Lambda" -> Lambda.map { x => x.asInstanceOf[js.Any] },
        "RunCommand" -> RunCommand.map { x => x.asInstanceOf[js.Any] },
        "StepFunctions" -> StepFunctions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTaskInvocationParameters]
    }
  }

  /**
   * Defines the values for a task parameter.
   */
  @js.native
  trait MaintenanceWindowTaskParameterValueExpression extends js.Object {
    var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList]
  }

  object MaintenanceWindowTaskParameterValueExpression {
    def apply(
      Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.undefined): MaintenanceWindowTaskParameterValueExpression = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
    }
  }

  object MaintenanceWindowTaskTypeEnum {
    val RUN_COMMAND = "RUN_COMMAND"
    val AUTOMATION = "AUTOMATION"
    val STEP_FUNCTIONS = "STEP_FUNCTIONS"
    val LAMBDA = "LAMBDA"

    val values = IndexedSeq(RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA)
  }

  @js.native
  trait ModifyDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
    var AccountIdsToAdd: js.UndefOr[AccountIdList]
    var AccountIdsToRemove: js.UndefOr[AccountIdList]
  }

  object ModifyDocumentPermissionRequest {
    def apply(
      Name: DocumentName,
      PermissionType: DocumentPermissionType,
      AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined,
      AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined): ModifyDocumentPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any],
        "AccountIdsToAdd" -> AccountIdsToAdd.map { x => x.asInstanceOf[js.Any] },
        "AccountIdsToRemove" -> AccountIdsToRemove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDocumentPermissionRequest]
    }
  }

  @js.native
  trait ModifyDocumentPermissionResponse extends js.Object {

  }

  object ModifyDocumentPermissionResponse {
    def apply(): ModifyDocumentPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDocumentPermissionResponse]
    }
  }

  /**
   * A summary of resources that are not compliant. The summary is organized according to resource type.
   */
  @js.native
  trait NonCompliantSummary extends js.Object {
    var NonCompliantCount: js.UndefOr[ComplianceSummaryCount]
    var SeveritySummary: js.UndefOr[SeveritySummary]
  }

  object NonCompliantSummary {
    def apply(
      NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined): NonCompliantSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NonCompliantCount" -> NonCompliantCount.map { x => x.asInstanceOf[js.Any] },
        "SeveritySummary" -> SeveritySummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NonCompliantSummary]
    }
  }

  /**
   * Configurations for sending notifications.
   */
  @js.native
  trait NotificationConfig extends js.Object {
    var NotificationArn: js.UndefOr[NotificationArn]
    var NotificationEvents: js.UndefOr[NotificationEventList]
    var NotificationType: js.UndefOr[NotificationType]
  }

  object NotificationConfig {
    def apply(
      NotificationArn: js.UndefOr[NotificationArn] = js.undefined,
      NotificationEvents: js.UndefOr[NotificationEventList] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined): NotificationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotificationArn" -> NotificationArn.map { x => x.asInstanceOf[js.Any] },
        "NotificationEvents" -> NotificationEvents.map { x => x.asInstanceOf[js.Any] },
        "NotificationType" -> NotificationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfig]
    }
  }

  object NotificationEventEnum {
    val All = "All"
    val InProgress = "InProgress"
    val Success = "Success"
    val TimedOut = "TimedOut"
    val Cancelled = "Cancelled"
    val Failed = "Failed"

    val values = IndexedSeq(All, InProgress, Success, TimedOut, Cancelled, Failed)
  }

  object NotificationTypeEnum {
    val Command = "Command"
    val Invocation = "Invocation"

    val values = IndexedSeq(Command, Invocation)
  }

  object OperatingSystemEnum {
    val WINDOWS = "WINDOWS"
    val AMAZON_LINUX = "AMAZON_LINUX"
    val AMAZON_LINUX_2 = "AMAZON_LINUX_2"
    val UBUNTU = "UBUNTU"
    val REDHAT_ENTERPRISE_LINUX = "REDHAT_ENTERPRISE_LINUX"
    val SUSE = "SUSE"
    val CENTOS = "CENTOS"

    val values = IndexedSeq(WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS)
  }

  /**
   * Information about the source where the association execution details are stored.
   */
  @js.native
  trait OutputSource extends js.Object {
    var OutputSourceId: js.UndefOr[OutputSourceId]
    var OutputSourceType: js.UndefOr[OutputSourceType]
  }

  object OutputSource {
    def apply(
      OutputSourceId: js.UndefOr[OutputSourceId] = js.undefined,
      OutputSourceType: js.UndefOr[OutputSourceType] = js.undefined): OutputSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputSourceId" -> OutputSourceId.map { x => x.asInstanceOf[js.Any] },
        "OutputSourceType" -> OutputSourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputSource]
    }
  }

  /**
   * An Amazon EC2 Systems Manager parameter in Parameter Store.
   */
  @js.native
  trait Parameter extends js.Object {
    var ARN: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[PSParameterName]
    var Selector: js.UndefOr[PSParameterSelector]
    var SourceResult: js.UndefOr[String]
    var Type: js.UndefOr[ParameterType]
    var Value: js.UndefOr[PSParameterValue]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object Parameter {
    def apply(
      ARN: js.UndefOr[String] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[PSParameterName] = js.undefined,
      Selector: js.UndefOr[PSParameterSelector] = js.undefined,
      SourceResult: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      Version: js.UndefOr[PSParameterVersion] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Selector" -> Selector.map { x => x.asInstanceOf[js.Any] },
        "SourceResult" -> SourceResult.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * Information about parameter usage.
   */
  @js.native
  trait ParameterHistory extends js.Object {
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var Labels: js.UndefOr[ParameterLabelList]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var Name: js.UndefOr[PSParameterName]
    var Type: js.UndefOr[ParameterType]
    var Value: js.UndefOr[PSParameterValue]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object ParameterHistory {
    def apply(
      AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      Labels: js.UndefOr[ParameterLabelList] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      LastModifiedUser: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[PSParameterName] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      Version: js.UndefOr[PSParameterVersion] = js.undefined): ParameterHistory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedPattern" -> AllowedPattern.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Labels" -> Labels.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedUser" -> LastModifiedUser.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterHistory]
    }
  }

  /**
   * Metada includes information like the ARN of the last user and the date/time the parameter was last used.
   */
  @js.native
  trait ParameterMetadata extends js.Object {
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var Name: js.UndefOr[PSParameterName]
    var Type: js.UndefOr[ParameterType]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object ParameterMetadata {
    def apply(
      AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      LastModifiedUser: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[PSParameterName] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined,
      Version: js.UndefOr[PSParameterVersion] = js.undefined): ParameterMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedPattern" -> AllowedPattern.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedUser" -> LastModifiedUser.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterMetadata]
    }
  }

  /**
   * One or more filters. Use a filter to return a more specific list of results.
   *
   * '''Note:'''The <code>Name</code> field can't be used with the <a>GetParametersByPath</a> API action.
   */
  @js.native
  trait ParameterStringFilter extends js.Object {
    var Key: ParameterStringFilterKey
    var Option: js.UndefOr[ParameterStringQueryOption]
    var Values: js.UndefOr[ParameterStringFilterValueList]
  }

  object ParameterStringFilter {
    def apply(
      Key: ParameterStringFilterKey,
      Option: js.UndefOr[ParameterStringQueryOption] = js.undefined,
      Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined): ParameterStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Option" -> Option.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterStringFilter]
    }
  }

  object ParameterTypeEnum {
    val String = "String"
    val StringList = "StringList"
    val SecureString = "SecureString"

    val values = IndexedSeq(String, StringList, SecureString)
  }

  /**
   * This data type is deprecated. Instead, use <a>ParameterStringFilter</a>.
   */
  @js.native
  trait ParametersFilter extends js.Object {
    var Key: ParametersFilterKey
    var Values: ParametersFilterValueList
  }

  object ParametersFilter {
    def apply(
      Key: ParametersFilterKey,
      Values: ParametersFilterValueList): ParametersFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParametersFilter]
    }
  }

  object ParametersFilterKeyEnum {
    val Name = "Name"
    val Type = "Type"
    val KeyId = "KeyId"

    val values = IndexedSeq(Name, Type, KeyId)
  }

  /**
   * Represents metadata about a patch.
   */
  @js.native
  trait Patch extends js.Object {
    var Classification: js.UndefOr[PatchClassification]
    var ContentUrl: js.UndefOr[PatchContentUrl]
    var Description: js.UndefOr[PatchDescription]
    var Id: js.UndefOr[PatchId]
    var KbNumber: js.UndefOr[PatchKbNumber]
    var Language: js.UndefOr[PatchLanguage]
    var MsrcNumber: js.UndefOr[PatchMsrcNumber]
    var MsrcSeverity: js.UndefOr[PatchMsrcSeverity]
    var Product: js.UndefOr[PatchProduct]
    var ProductFamily: js.UndefOr[PatchProductFamily]
    var ReleaseDate: js.UndefOr[DateTime]
    var Title: js.UndefOr[PatchTitle]
    var Vendor: js.UndefOr[PatchVendor]
  }

  object Patch {
    def apply(
      Classification: js.UndefOr[PatchClassification] = js.undefined,
      ContentUrl: js.UndefOr[PatchContentUrl] = js.undefined,
      Description: js.UndefOr[PatchDescription] = js.undefined,
      Id: js.UndefOr[PatchId] = js.undefined,
      KbNumber: js.UndefOr[PatchKbNumber] = js.undefined,
      Language: js.UndefOr[PatchLanguage] = js.undefined,
      MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.undefined,
      MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.undefined,
      Product: js.UndefOr[PatchProduct] = js.undefined,
      ProductFamily: js.UndefOr[PatchProductFamily] = js.undefined,
      ReleaseDate: js.UndefOr[DateTime] = js.undefined,
      Title: js.UndefOr[PatchTitle] = js.undefined,
      Vendor: js.UndefOr[PatchVendor] = js.undefined): Patch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.map { x => x.asInstanceOf[js.Any] },
        "ContentUrl" -> ContentUrl.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "KbNumber" -> KbNumber.map { x => x.asInstanceOf[js.Any] },
        "Language" -> Language.map { x => x.asInstanceOf[js.Any] },
        "MsrcNumber" -> MsrcNumber.map { x => x.asInstanceOf[js.Any] },
        "MsrcSeverity" -> MsrcSeverity.map { x => x.asInstanceOf[js.Any] },
        "Product" -> Product.map { x => x.asInstanceOf[js.Any] },
        "ProductFamily" -> ProductFamily.map { x => x.asInstanceOf[js.Any] },
        "ReleaseDate" -> ReleaseDate.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "Vendor" -> Vendor.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Patch]
    }
  }

  object PatchActionEnum {
    val ALLOW_AS_DEPENDENCY = "ALLOW_AS_DEPENDENCY"
    val BLOCK = "BLOCK"

    val values = IndexedSeq(ALLOW_AS_DEPENDENCY, BLOCK)
  }

  /**
   * Defines the basic information about a patch baseline.
   */
  @js.native
  trait PatchBaselineIdentity extends js.Object {
    var BaselineDescription: js.UndefOr[BaselineDescription]
    var BaselineId: js.UndefOr[BaselineId]
    var BaselineName: js.UndefOr[BaselineName]
    var DefaultBaseline: js.UndefOr[DefaultBaseline]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object PatchBaselineIdentity {
    def apply(
      BaselineDescription: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      BaselineName: js.UndefOr[BaselineName] = js.undefined,
      DefaultBaseline: js.UndefOr[DefaultBaseline] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): PatchBaselineIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineDescription" -> BaselineDescription.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "BaselineName" -> BaselineName.map { x => x.asInstanceOf[js.Any] },
        "DefaultBaseline" -> DefaultBaseline.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchBaselineIdentity]
    }
  }

  /**
   * Information about the state of a patch on a particular instance as it relates to the patch baseline used to patch the instance.
   */
  @js.native
  trait PatchComplianceData extends js.Object {
    var Classification: PatchClassification
    var InstalledTime: DateTime
    var KBId: PatchKbNumber
    var Severity: PatchSeverity
    var State: PatchComplianceDataState
    var Title: PatchTitle
  }

  object PatchComplianceData {
    def apply(
      Classification: PatchClassification,
      InstalledTime: DateTime,
      KBId: PatchKbNumber,
      Severity: PatchSeverity,
      State: PatchComplianceDataState,
      Title: PatchTitle): PatchComplianceData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "InstalledTime" -> InstalledTime.asInstanceOf[js.Any],
        "KBId" -> KBId.asInstanceOf[js.Any],
        "Severity" -> Severity.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchComplianceData]
    }
  }

  object PatchComplianceDataStateEnum {
    val INSTALLED = "INSTALLED"
    val INSTALLED_OTHER = "INSTALLED_OTHER"
    val INSTALLED_REJECTED = "INSTALLED_REJECTED"
    val MISSING = "MISSING"
    val NOT_APPLICABLE = "NOT_APPLICABLE"
    val FAILED = "FAILED"

    val values = IndexedSeq(INSTALLED, INSTALLED_OTHER, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE, FAILED)
  }

  object PatchComplianceLevelEnum {
    val CRITICAL = "CRITICAL"
    val HIGH = "HIGH"
    val MEDIUM = "MEDIUM"
    val LOW = "LOW"
    val INFORMATIONAL = "INFORMATIONAL"
    val UNSPECIFIED = "UNSPECIFIED"

    val values = IndexedSeq(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED)
  }

  object PatchDeploymentStatusEnum {
    val APPROVED = "APPROVED"
    val PENDING_APPROVAL = "PENDING_APPROVAL"
    val EXPLICIT_APPROVED = "EXPLICIT_APPROVED"
    val EXPLICIT_REJECTED = "EXPLICIT_REJECTED"

    val values = IndexedSeq(APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED)
  }

  /**
   * Defines a patch filter.
   *  A patch filter consists of key/value pairs, but not all keys are valid for all operating system types. For example, the key <code>PRODUCT</code> is valid for all supported operating system types. The key <code>MSRC_SEVERITY</code>, however, is valid only for Windows operating systems, and the key <code>SECTION</code> is valid only for Ubuntu operating systems.
   *  Refer to the following sections for information about which keys may be used with each major operating system, and which values are valid for each key.
   *  <b>Windows Operating Systems</b>
   *  The supported keys for Windows operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>MSRC_SEVERITY</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>Windows7</code>
   *  * <code>Windows8</code>
   *  * <code>Windows8.1</code>
   *  * <code>Windows8Embedded</code>
   *  * <code>Windows10</code>
   *  * <code>Windows10LTSB</code>
   *  * <code>WindowsServer2008</code>
   *  * <code>WindowsServer2008R2</code>
   *  * <code>WindowsServer2012</code>
   *  * <code>WindowsServer2012R2</code>
   *  * <code>WindowsServer2016</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>CLASSIFICATION</code>
   *  <i>Supported values:</i>
   * * <code>CriticalUpdates</code>
   *  * <code>DefinitionUpdates</code>
   *  * <code>Drivers</code>
   *  * <code>FeaturePacks</code>
   *  * <code>SecurityUpdates</code>
   *  * <code>ServicePacks</code>
   *  * <code>Tools</code>
   *  * <code>UpdateRollups</code>
   *  * <code>Updates</code>
   *  * <code>Upgrades</code>
   * <i>Supported key:</i> <code>MSRC_SEVERITY</code>
   *  <i>Supported values:</i>
   * * <code>Critical</code>
   *  * <code>Important</code>
   *  * <code>Moderate</code>
   *  * <code>Low</code>
   *  * <code>Unspecified</code>
   * <b>Ubuntu Operating Systems</b>
   *  The supported keys for Ubuntu operating systems are <code>PRODUCT</code>, <code>PRIORITY</code>, and <code>SECTION</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>Ubuntu14.04</code>
   *  * <code>Ubuntu16.04</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>PRIORITY</code>
   *  <i>Supported values:</i>
   * * <code>Required</code>
   *  * <code>Important</code>
   *  * <code>Standard</code>
   *  * <code>Optional</code>
   *  * <code>Extra</code>
   * <i>Supported key:</i> <code>SECTION</code>
   *  Only the length of the key value is validated. Minimum length is 1. Maximum length is 64.
   *  <b>Amazon Linux Operating Systems</b>
   *  The supported keys for Amazon Linux operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>AmazonLinux2012.03</code>
   *  * <code>AmazonLinux2012.09</code>
   *  * <code>AmazonLinux2013.03</code>
   *  * <code>AmazonLinux2013.09</code>
   *  * <code>AmazonLinux2014.03</code>
   *  * <code>AmazonLinux2014.09</code>
   *  * <code>AmazonLinux2015.03</code>
   *  * <code>AmazonLinux2015.09</code>
   *  * <code>AmazonLinux2016.03</code>
   *  * <code>AmazonLinux2016.09</code>
   *  * <code>AmazonLinux2017.03</code>
   *  * <code>AmazonLinux2017.09</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>CLASSIFICATION</code>
   *  <i>Supported values:</i>
   * * <code>Security</code>
   *  * <code>Bugfix</code>
   *  * <code>Enhancement</code>
   *  * <code>Recommended</code>
   *  * <code>Newpackage</code>
   * <i>Supported key:</i> <code>SEVERITY</code>
   *  <i>Supported values:</i>
   * * <code>Critical</code>
   *  * <code>Important</code>
   *  * <code>Medium</code>
   *  * <code>Low</code>
   * <b>Amazon Linux 2 Operating Systems</b>
   *  The supported keys for Amazon Linux 2 operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>AmazonLinux2</code>
   *  * <code>AmazonLinux2.0</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>CLASSIFICATION</code>
   *  <i>Supported values:</i>
   * * <code>Security</code>
   *  * <code>Bugfix</code>
   *  * <code>Enhancement</code>
   *  * <code>Recommended</code>
   *  * <code>Newpackage</code>
   * <i>Supported key:</i> <code>SEVERITY</code>
   *  <i>Supported values:</i>
   * * <code>Critical</code>
   *  * <code>Important</code>
   *  * <code>Medium</code>
   *  * <code>Low</code>
   * <b>RedHat Enterprise Linux (RHEL) Operating Systems</b>
   *  The supported keys for RedHat Enterprise Linux operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>RedhatEnterpriseLinux6.5</code>
   *  * <code>RedhatEnterpriseLinux6.6</code>
   *  * <code>RedhatEnterpriseLinux6.7</code>
   *  * <code>RedhatEnterpriseLinux6.8</code>
   *  * <code>RedhatEnterpriseLinux6.9</code>
   *  * <code>RedhatEnterpriseLinux7.0</code>
   *  * <code>RedhatEnterpriseLinux7.1</code>
   *  * <code>RedhatEnterpriseLinux7.2</code>
   *  * <code>RedhatEnterpriseLinux7.3</code>
   *  * <code>RedhatEnterpriseLinux7.4</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>CLASSIFICATION</code>
   *  <i>Supported values:</i>
   * * <code>Security</code>
   *  * <code>Bugfix</code>
   *  * <code>Enhancement</code>
   *  * <code>Recommended</code>
   *  * <code>Newpackage</code>
   * <i>Supported key:</i> <code>SEVERITY</code>
   *  <i>Supported values:</i>
   * * <code>Critical</code>
   *  * <code>Important</code>
   *  * <code>Medium</code>
   *  * <code>Low</code>
   * <b>SUSE Linux Enterprise Server (SLES) Operating Systems</b>
   *  The supported keys for SLES operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>Suse12.0</code>
   *  * <code>Suse12.1</code>
   *  * <code>Suse12.2</code>
   *  * <code>Suse12.3</code>
   *  * <code>Suse12.4</code>
   *  * <code>Suse12.5</code>
   *  * <code>Suse12.6</code>
   *  * <code>Suse12.7</code>
   *  * <code>Suse12.8</code>
   *  * <code>Suse12.9</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>CLASSIFICATION</code>
   *  <i>Supported values:</i>
   * * <code>Security</code>
   *  * <code>Recommended</code>
   *  * <code>Optional</code>
   *  * <code>Feature</code>
   *  * <code>Document</code>
   *  * <code>Yast</code>
   * <i>Supported key:</i> <code>SEVERITY</code>
   *  <i>Supported values:</i>
   * * <code>Critical</code>
   *  * <code>Important</code>
   *  * <code>Moderate</code>
   *  * <code>Low</code>
   * <b>CentOS Operating Systems</b>
   *  The supported keys for CentOS operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.
   *  <i>Supported key:</i> <code>PRODUCT</code>
   *  <i>Supported values:</i>
   * * <code>CentOS6.5</code>
   *  * <code>CentOS6.6</code>
   *  * <code>CentOS6.7</code>
   *  * <code>CentOS6.8</code>
   *  * <code>CentOS6.9</code>
   *  * <code>CentOS7.0</code>
   *  * <code>CentOS7.1</code>
   *  * <code>CentOS7.2</code>
   *  * <code>CentOS7.3</code>
   *  * <code>CentOS7.4</code>
   *  * <code>*</code>
   *  <i>Use a wildcard character (*) to target all supported operating system versions.</i>
   * <i>Supported key:</i> <code>CLASSIFICATION</code>
   *  <i>Supported values:</i>
   * * <code>Security</code>
   *  * <code>Bugfix</code>
   *  * <code>Enhancement</code>
   *  * <code>Recommended</code>
   *  * <code>Newpackage</code>
   * <i>Supported key:</i> <code>SEVERITY</code>
   *  <i>Supported values:</i>
   * * <code>Critical</code>
   *  * <code>Important</code>
   *  * <code>Medium</code>
   *  * <code>Low</code>
   */
  @js.native
  trait PatchFilter extends js.Object {
    var Key: PatchFilterKey
    var Values: PatchFilterValueList
  }

  object PatchFilter {
    def apply(
      Key: PatchFilterKey,
      Values: PatchFilterValueList): PatchFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchFilter]
    }
  }

  /**
   * A set of patch filters, typically used for approval rules.
   */
  @js.native
  trait PatchFilterGroup extends js.Object {
    var PatchFilters: PatchFilterList
  }

  object PatchFilterGroup {
    def apply(
      PatchFilters: PatchFilterList): PatchFilterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchFilters" -> PatchFilters.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchFilterGroup]
    }
  }

  object PatchFilterKeyEnum {
    val PRODUCT = "PRODUCT"
    val CLASSIFICATION = "CLASSIFICATION"
    val MSRC_SEVERITY = "MSRC_SEVERITY"
    val PATCH_ID = "PATCH_ID"
    val SECTION = "SECTION"
    val PRIORITY = "PRIORITY"
    val SEVERITY = "SEVERITY"

    val values = IndexedSeq(PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY)
  }

  /**
   * The mapping between a patch group and the patch baseline the patch group is registered with.
   */
  @js.native
  trait PatchGroupPatchBaselineMapping extends js.Object {
    var BaselineIdentity: js.UndefOr[PatchBaselineIdentity]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object PatchGroupPatchBaselineMapping {
    def apply(
      BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): PatchGroupPatchBaselineMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineIdentity" -> BaselineIdentity.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchGroupPatchBaselineMapping]
    }
  }

  object PatchOperationTypeEnum {
    val Scan = "Scan"
    val Install = "Install"

    val values = IndexedSeq(Scan, Install)
  }

  /**
   * Defines a filter used in Patch Manager APIs.
   */
  @js.native
  trait PatchOrchestratorFilter extends js.Object {
    var Key: js.UndefOr[PatchOrchestratorFilterKey]
    var Values: js.UndefOr[PatchOrchestratorFilterValues]
  }

  object PatchOrchestratorFilter {
    def apply(
      Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined,
      Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined): PatchOrchestratorFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchOrchestratorFilter]
    }
  }

  /**
   * Defines an approval rule for a patch baseline.
   */
  @js.native
  trait PatchRule extends js.Object {
    var ApproveAfterDays: ApproveAfterDays
    var PatchFilterGroup: PatchFilterGroup
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var EnableNonSecurity: js.UndefOr[Boolean]
  }

  object PatchRule {
    def apply(
      ApproveAfterDays: ApproveAfterDays,
      PatchFilterGroup: PatchFilterGroup,
      ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      EnableNonSecurity: js.UndefOr[Boolean] = js.undefined): PatchRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApproveAfterDays" -> ApproveAfterDays.asInstanceOf[js.Any],
        "PatchFilterGroup" -> PatchFilterGroup.asInstanceOf[js.Any],
        "ComplianceLevel" -> ComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "EnableNonSecurity" -> EnableNonSecurity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchRule]
    }
  }

  /**
   * A set of rules defining the approval rules for a patch baseline.
   */
  @js.native
  trait PatchRuleGroup extends js.Object {
    var PatchRules: PatchRuleList
  }

  object PatchRuleGroup {
    def apply(
      PatchRules: PatchRuleList): PatchRuleGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchRules" -> PatchRules.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchRuleGroup]
    }
  }

  /**
   * Information about the patches to use to update the instances, including target operating systems and source repository. Applies to Linux instances only.
   */
  @js.native
  trait PatchSource extends js.Object {
    var Configuration: PatchSourceConfiguration
    var Name: PatchSourceName
    var Products: PatchSourceProductList
  }

  object PatchSource {
    def apply(
      Configuration: PatchSourceConfiguration,
      Name: PatchSourceName,
      Products: PatchSourceProductList): PatchSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Products" -> Products.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchSource]
    }
  }

  /**
   * Information about the approval status of a patch.
   */
  @js.native
  trait PatchStatus extends js.Object {
    var ApprovalDate: js.UndefOr[DateTime]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var DeploymentStatus: js.UndefOr[PatchDeploymentStatus]
  }

  object PatchStatus {
    def apply(
      ApprovalDate: js.UndefOr[DateTime] = js.undefined,
      ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined): PatchStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovalDate" -> ApprovalDate.map { x => x.asInstanceOf[js.Any] },
        "ComplianceLevel" -> ComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "DeploymentStatus" -> DeploymentStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchStatus]
    }
  }

  object PingStatusEnum {
    val Online = "Online"
    val ConnectionLost = "ConnectionLost"
    val Inactive = "Inactive"

    val values = IndexedSeq(Online, ConnectionLost, Inactive)
  }

  object PlatformTypeEnum {
    val Windows = "Windows"
    val Linux = "Linux"

    val values = IndexedSeq(Windows, Linux)
  }

  /**
   * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.
   */
  @js.native
  trait ProgressCounters extends js.Object {
    var CancelledSteps: js.UndefOr[Int]
    var FailedSteps: js.UndefOr[Int]
    var SuccessSteps: js.UndefOr[Int]
    var TimedOutSteps: js.UndefOr[Int]
    var TotalSteps: js.UndefOr[Int]
  }

  object ProgressCounters {
    def apply(
      CancelledSteps: js.UndefOr[Int] = js.undefined,
      FailedSteps: js.UndefOr[Int] = js.undefined,
      SuccessSteps: js.UndefOr[Int] = js.undefined,
      TimedOutSteps: js.UndefOr[Int] = js.undefined,
      TotalSteps: js.UndefOr[Int] = js.undefined): ProgressCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CancelledSteps" -> CancelledSteps.map { x => x.asInstanceOf[js.Any] },
        "FailedSteps" -> FailedSteps.map { x => x.asInstanceOf[js.Any] },
        "SuccessSteps" -> SuccessSteps.map { x => x.asInstanceOf[js.Any] },
        "TimedOutSteps" -> TimedOutSteps.map { x => x.asInstanceOf[js.Any] },
        "TotalSteps" -> TotalSteps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProgressCounters]
    }
  }

  @js.native
  trait PutComplianceItemsRequest extends js.Object {
    var ComplianceType: ComplianceTypeName
    var ExecutionSummary: ComplianceExecutionSummary
    var Items: ComplianceItemEntryList
    var ResourceId: ComplianceResourceId
    var ResourceType: ComplianceResourceType
    var ItemContentHash: js.UndefOr[ComplianceItemContentHash]
  }

  object PutComplianceItemsRequest {
    def apply(
      ComplianceType: ComplianceTypeName,
      ExecutionSummary: ComplianceExecutionSummary,
      Items: ComplianceItemEntryList,
      ResourceId: ComplianceResourceId,
      ResourceType: ComplianceResourceType,
      ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.undefined): PutComplianceItemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceType" -> ComplianceType.asInstanceOf[js.Any],
        "ExecutionSummary" -> ExecutionSummary.asInstanceOf[js.Any],
        "Items" -> Items.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "ItemContentHash" -> ItemContentHash.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutComplianceItemsRequest]
    }
  }

  @js.native
  trait PutComplianceItemsResult extends js.Object {

  }

  object PutComplianceItemsResult {
    def apply(): PutComplianceItemsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutComplianceItemsResult]
    }
  }

  @js.native
  trait PutInventoryRequest extends js.Object {
    var InstanceId: InstanceId
    var Items: InventoryItemList
  }

  object PutInventoryRequest {
    def apply(
      InstanceId: InstanceId,
      Items: InventoryItemList): PutInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Items" -> Items.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInventoryRequest]
    }
  }

  @js.native
  trait PutInventoryResult extends js.Object {
    var Message: js.UndefOr[PutInventoryMessage]
  }

  object PutInventoryResult {
    def apply(
      Message: js.UndefOr[PutInventoryMessage] = js.undefined): PutInventoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInventoryResult]
    }
  }

  @js.native
  trait PutParameterRequest extends js.Object {
    var Name: PSParameterName
    var Type: ParameterType
    var Value: PSParameterValue
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var Overwrite: js.UndefOr[Boolean]
  }

  object PutParameterRequest {
    def apply(
      Name: PSParameterName,
      Type: ParameterType,
      Value: PSParameterValue,
      AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      Overwrite: js.UndefOr[Boolean] = js.undefined): PutParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "AllowedPattern" -> AllowedPattern.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Overwrite" -> Overwrite.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutParameterRequest]
    }
  }

  @js.native
  trait PutParameterResult extends js.Object {
    var Version: js.UndefOr[PSParameterVersion]
  }

  object PutParameterResult {
    def apply(
      Version: js.UndefOr[PSParameterVersion] = js.undefined): PutParameterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutParameterResult]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object RegisterDefaultPatchBaselineRequest {
    def apply(
      BaselineId: BaselineId): RegisterDefaultPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDefaultPatchBaselineRequest]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object RegisterDefaultPatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined): RegisterDefaultPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDefaultPatchBaselineResult]
    }
  }

  @js.native
  trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object RegisterPatchBaselineForPatchGroupRequest {
    def apply(
      BaselineId: BaselineId,
      PatchGroup: PatchGroup): RegisterPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait RegisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object RegisterPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): RegisterPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait RegisterTargetWithMaintenanceWindowRequest extends js.Object {
    var ResourceType: MaintenanceWindowResourceType
    var Targets: Targets
    var WindowId: MaintenanceWindowId
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
  }

  object RegisterTargetWithMaintenanceWindowRequest {
    def apply(
      ResourceType: MaintenanceWindowResourceType,
      Targets: Targets,
      WindowId: MaintenanceWindowId,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined): RegisterTargetWithMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any],
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object RegisterTargetWithMaintenanceWindowResult {
    def apply(
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined): RegisterTargetWithMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
    var MaxConcurrency: MaxConcurrency
    var MaxErrors: MaxErrors
    var Targets: Targets
    var TaskArn: MaintenanceWindowTaskArn
    var TaskType: MaintenanceWindowTaskType
    var WindowId: MaintenanceWindowId
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
  }

  object RegisterTaskWithMaintenanceWindowRequest {
    def apply(
      MaxConcurrency: MaxConcurrency,
      MaxErrors: MaxErrors,
      Targets: Targets,
      TaskArn: MaintenanceWindowTaskArn,
      TaskType: MaintenanceWindowTaskType,
      WindowId: MaintenanceWindowId,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined): RegisterTaskWithMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxConcurrency" -> MaxConcurrency.asInstanceOf[js.Any],
        "MaxErrors" -> MaxErrors.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any],
        "TaskArn" -> TaskArn.asInstanceOf[js.Any],
        "TaskType" -> TaskType.asInstanceOf[js.Any],
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object RegisterTaskWithMaintenanceWindowResult {
    def apply(
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): RegisterTaskWithMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceRequest {
    def apply(
      ResourceId: ResourceId,
      ResourceType: ResourceTypeForTagging,
      TagKeys: KeyList): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResult extends js.Object {

  }

  object RemoveTagsFromResourceResult {
    def apply(): RemoveTagsFromResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResult]
    }
  }

  /**
   * Information about targets that resolved during the Automation execution.
   */
  @js.native
  trait ResolvedTargets extends js.Object {
    var ParameterValues: js.UndefOr[TargetParameterList]
    var Truncated: js.UndefOr[Boolean]
  }

  object ResolvedTargets {
    def apply(
      ParameterValues: js.UndefOr[TargetParameterList] = js.undefined,
      Truncated: js.UndefOr[Boolean] = js.undefined): ResolvedTargets = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterValues" -> ParameterValues.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolvedTargets]
    }
  }

  /**
   * Compliance summary information for a specific resource.
   */
  @js.native
  trait ResourceComplianceSummaryItem extends js.Object {
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var CompliantSummary: js.UndefOr[CompliantSummary]
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary]
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary]
    var OverallSeverity: js.UndefOr[ComplianceSeverity]
    var ResourceId: js.UndefOr[ComplianceResourceId]
    var ResourceType: js.UndefOr[ComplianceResourceType]
    var Status: js.UndefOr[ComplianceStatus]
  }

  object ResourceComplianceSummaryItem {
    def apply(
      ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
      CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined,
      ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
      NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined,
      OverallSeverity: js.UndefOr[ComplianceSeverity] = js.undefined,
      ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
      ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
      Status: js.UndefOr[ComplianceStatus] = js.undefined): ResourceComplianceSummaryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "CompliantSummary" -> CompliantSummary.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "NonCompliantSummary" -> NonCompliantSummary.map { x => x.asInstanceOf[js.Any] },
        "OverallSeverity" -> OverallSeverity.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceComplianceSummaryItem]
    }
  }

  /**
   * Information about a Resource Data Sync configuration, including its current status and last successful sync.
   */
  @js.native
  trait ResourceDataSyncItem extends js.Object {
    var LastStatus: js.UndefOr[LastResourceDataSyncStatus]
    var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime]
    var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage]
    var LastSyncTime: js.UndefOr[LastResourceDataSyncTime]
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination]
    var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime]
    var SyncName: js.UndefOr[ResourceDataSyncName]
  }

  object ResourceDataSyncItem {
    def apply(
      LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined,
      LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.undefined,
      LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined,
      LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.undefined,
      S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined,
      SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.undefined,
      SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined): ResourceDataSyncItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastStatus" -> LastStatus.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulSyncTime" -> LastSuccessfulSyncTime.map { x => x.asInstanceOf[js.Any] },
        "LastSyncStatusMessage" -> LastSyncStatusMessage.map { x => x.asInstanceOf[js.Any] },
        "LastSyncTime" -> LastSyncTime.map { x => x.asInstanceOf[js.Any] },
        "S3Destination" -> S3Destination.map { x => x.asInstanceOf[js.Any] },
        "SyncCreatedTime" -> SyncCreatedTime.map { x => x.asInstanceOf[js.Any] },
        "SyncName" -> SyncName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDataSyncItem]
    }
  }

  /**
   * Information about the target Amazon S3 bucket for the Resource Data Sync.
   */
  @js.native
  trait ResourceDataSyncS3Destination extends js.Object {
    var BucketName: ResourceDataSyncS3BucketName
    var Region: ResourceDataSyncS3Region
    var SyncFormat: ResourceDataSyncS3Format
    var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN]
    var Prefix: js.UndefOr[ResourceDataSyncS3Prefix]
  }

  object ResourceDataSyncS3Destination {
    def apply(
      BucketName: ResourceDataSyncS3BucketName,
      Region: ResourceDataSyncS3Region,
      SyncFormat: ResourceDataSyncS3Format,
      AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.undefined,
      Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined): ResourceDataSyncS3Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any],
        "SyncFormat" -> SyncFormat.asInstanceOf[js.Any],
        "AWSKMSKeyARN" -> AWSKMSKeyARN.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDataSyncS3Destination]
    }
  }

  object ResourceDataSyncS3FormatEnum {
    val JsonSerDe = "JsonSerDe"

    val values = IndexedSeq(JsonSerDe)
  }

  object ResourceTypeEnum {
    val ManagedInstance = "ManagedInstance"
    val Document = "Document"
    val EC2Instance = "EC2Instance"

    val values = IndexedSeq(ManagedInstance, Document, EC2Instance)
  }

  object ResourceTypeForTaggingEnum {
    val Document = "Document"
    val ManagedInstance = "ManagedInstance"
    val MaintenanceWindow = "MaintenanceWindow"
    val Parameter = "Parameter"
    val PatchBaseline = "PatchBaseline"

    val values = IndexedSeq(Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline)
  }

  /**
   * The inventory item result attribute.
   */
  @js.native
  trait ResultAttribute extends js.Object {
    var TypeName: InventoryItemTypeName
  }

  object ResultAttribute {
    def apply(
      TypeName: InventoryItemTypeName): ResultAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultAttribute]
    }
  }

  @js.native
  trait ResumeSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object ResumeSessionRequest {
    def apply(
      SessionId: SessionId): ResumeSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResumeSessionRequest]
    }
  }

  @js.native
  trait ResumeSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var StreamUrl: js.UndefOr[StreamUrl]
    var TokenValue: js.UndefOr[TokenValue]
  }

  object ResumeSessionResponse {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined,
      StreamUrl: js.UndefOr[StreamUrl] = js.undefined,
      TokenValue: js.UndefOr[TokenValue] = js.undefined): ResumeSessionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] },
        "StreamUrl" -> StreamUrl.map { x => x.asInstanceOf[js.Any] },
        "TokenValue" -> TokenValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResumeSessionResponse]
    }
  }

  /**
   * An Amazon S3 bucket where you want to store the results of this request.
   */
  @js.native
  trait S3OutputLocation extends js.Object {
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var OutputS3Region: js.UndefOr[S3Region]
  }

  object S3OutputLocation {
    def apply(
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined): S3OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3OutputLocation]
    }
  }

  /**
   * A URL for the Amazon S3 bucket where you want to store the results of this request.
   */
  @js.native
  trait S3OutputUrl extends js.Object {
    var OutputUrl: js.UndefOr[Url]
  }

  object S3OutputUrl {
    def apply(
      OutputUrl: js.UndefOr[Url] = js.undefined): S3OutputUrl = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputUrl" -> OutputUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3OutputUrl]
    }
  }

  /**
   * Information about a scheduled execution for a Maintenance Window.
   */
  @js.native
  trait ScheduledWindowExecution extends js.Object {
    var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object ScheduledWindowExecution {
    def apply(
      ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): ScheduledWindowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionTime" -> ExecutionTime.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledWindowExecution]
    }
  }

  @js.native
  trait SendAutomationSignalRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var SignalType: SignalType
    var Payload: js.UndefOr[AutomationParameterMap]
  }

  object SendAutomationSignalRequest {
    def apply(
      AutomationExecutionId: AutomationExecutionId,
      SignalType: SignalType,
      Payload: js.UndefOr[AutomationParameterMap] = js.undefined): SendAutomationSignalRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any],
        "SignalType" -> SignalType.asInstanceOf[js.Any],
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendAutomationSignalRequest]
    }
  }

  @js.native
  trait SendAutomationSignalResult extends js.Object {

  }

  object SendAutomationSignalResult {
    def apply(): SendAutomationSignalResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendAutomationSignalResult]
    }
  }

  @js.native
  trait SendCommandRequest extends js.Object {
    var DocumentName: DocumentARN
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var Comment: js.UndefOr[Comment]
    var DocumentHash: js.UndefOr[DocumentHash]
    var DocumentHashType: js.UndefOr[DocumentHashType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceIds: js.UndefOr[InstanceIdList]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var OutputS3Region: js.UndefOr[S3Region]
    var Parameters: js.UndefOr[Parameters]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var Targets: js.UndefOr[Targets]
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds]
  }

  object SendCommandRequest {
    def apply(
      DocumentName: DocumentARN,
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentHash: js.UndefOr[DocumentHash] = js.undefined,
      DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined): SendCommandRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentName" -> DocumentName.asInstanceOf[js.Any],
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "DocumentHash" -> DocumentHash.map { x => x.asInstanceOf[js.Any] },
        "DocumentHashType" -> DocumentHashType.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "TimeoutSeconds" -> TimeoutSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendCommandRequest]
    }
  }

  @js.native
  trait SendCommandResult extends js.Object {
    var Command: js.UndefOr[Command]
  }

  object SendCommandResult {
    def apply(
      Command: js.UndefOr[Command] = js.undefined): SendCommandResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Command" -> Command.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendCommandResult]
    }
  }

  /**
   * Information about a Session Manager connection to an instance.
   */
  @js.native
  trait Session extends js.Object {
    var Details: js.UndefOr[SessionDetails]
    var DocumentName: js.UndefOr[DocumentName]
    var EndDate: js.UndefOr[DateTime]
    var OutputUrl: js.UndefOr[SessionManagerOutputUrl]
    var Owner: js.UndefOr[SessionOwner]
    var SessionId: js.UndefOr[SessionId]
    var StartDate: js.UndefOr[DateTime]
    var Status: js.UndefOr[SessionStatus]
    var Target: js.UndefOr[SessionTarget]
  }

  object Session {
    def apply(
      Details: js.UndefOr[SessionDetails] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      EndDate: js.UndefOr[DateTime] = js.undefined,
      OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.undefined,
      Owner: js.UndefOr[SessionOwner] = js.undefined,
      SessionId: js.UndefOr[SessionId] = js.undefined,
      StartDate: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[SessionStatus] = js.undefined,
      Target: js.UndefOr[SessionTarget] = js.undefined): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "OutputUrl" -> OutputUrl.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }

  /**
   * Describes a filter for Session Manager information.
   */
  @js.native
  trait SessionFilter extends js.Object {
    var key: SessionFilterKey
    var value: SessionFilterValue
  }

  object SessionFilter {
    def apply(
      key: SessionFilterKey,
      value: SessionFilterValue): SessionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SessionFilter]
    }
  }

  object SessionFilterKeyEnum {
    val InvokedAfter = "InvokedAfter"
    val InvokedBefore = "InvokedBefore"
    val Target = "Target"
    val Owner = "Owner"
    val Status = "Status"

    val values = IndexedSeq(InvokedAfter, InvokedBefore, Target, Owner, Status)
  }

  /**
   * Reserved for future use.
   */
  @js.native
  trait SessionManagerOutputUrl extends js.Object {
    var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl]
    var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl]
  }

  object SessionManagerOutputUrl {
    def apply(
      CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.undefined,
      S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined): SessionManagerOutputUrl = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchOutputUrl" -> CloudWatchOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "S3OutputUrl" -> S3OutputUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SessionManagerOutputUrl]
    }
  }

  object SessionStateEnum {
    val Active = "Active"
    val History = "History"

    val values = IndexedSeq(Active, History)
  }

  object SessionStatusEnum {
    val Connected = "Connected"
    val Connecting = "Connecting"
    val Disconnected = "Disconnected"
    val Terminated = "Terminated"
    val Terminating = "Terminating"
    val Failed = "Failed"

    val values = IndexedSeq(Connected, Connecting, Disconnected, Terminated, Terminating, Failed)
  }

  /**
   * The number of managed instances found for each patch severity level defined in the request filter.
   */
  @js.native
  trait SeveritySummary extends js.Object {
    var CriticalCount: js.UndefOr[ComplianceSummaryCount]
    var HighCount: js.UndefOr[ComplianceSummaryCount]
    var InformationalCount: js.UndefOr[ComplianceSummaryCount]
    var LowCount: js.UndefOr[ComplianceSummaryCount]
    var MediumCount: js.UndefOr[ComplianceSummaryCount]
    var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount]
  }

  object SeveritySummary {
    def apply(
      CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined): SeveritySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CriticalCount" -> CriticalCount.map { x => x.asInstanceOf[js.Any] },
        "HighCount" -> HighCount.map { x => x.asInstanceOf[js.Any] },
        "InformationalCount" -> InformationalCount.map { x => x.asInstanceOf[js.Any] },
        "LowCount" -> LowCount.map { x => x.asInstanceOf[js.Any] },
        "MediumCount" -> MediumCount.map { x => x.asInstanceOf[js.Any] },
        "UnspecifiedCount" -> UnspecifiedCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SeveritySummary]
    }
  }

  object SignalTypeEnum {
    val Approve = "Approve"
    val Reject = "Reject"
    val StartStep = "StartStep"
    val StopStep = "StopStep"
    val Resume = "Resume"

    val values = IndexedSeq(Approve, Reject, StartStep, StopStep, Resume)
  }

  @js.native
  trait StartAssociationsOnceRequest extends js.Object {
    var AssociationIds: AssociationIdList
  }

  object StartAssociationsOnceRequest {
    def apply(
      AssociationIds: AssociationIdList): StartAssociationsOnceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationIds" -> AssociationIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAssociationsOnceRequest]
    }
  }

  @js.native
  trait StartAssociationsOnceResult extends js.Object {

  }

  object StartAssociationsOnceResult {
    def apply(): StartAssociationsOnceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAssociationsOnceResult]
    }
  }

  @js.native
  trait StartAutomationExecutionRequest extends js.Object {
    var DocumentName: DocumentARN
    var ClientToken: js.UndefOr[IdempotencyToken]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Mode: js.UndefOr[ExecutionMode]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var TargetLocations: js.UndefOr[TargetLocations]
    var TargetMaps: js.UndefOr[TargetMaps]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object StartAutomationExecutionRequest {
    def apply(
      DocumentName: DocumentARN,
      ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Mode: js.UndefOr[ExecutionMode] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
      TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
      TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): StartAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentName" -> DocumentName.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "TargetLocations" -> TargetLocations.map { x => x.asInstanceOf[js.Any] },
        "TargetMaps" -> TargetMaps.map { x => x.asInstanceOf[js.Any] },
        "TargetParameterName" -> TargetParameterName.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAutomationExecutionRequest]
    }
  }

  @js.native
  trait StartAutomationExecutionResult extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
  }

  object StartAutomationExecutionResult {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined): StartAutomationExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAutomationExecutionResult]
    }
  }

  @js.native
  trait StartSessionRequest extends js.Object {
    var Target: SessionTarget
    var DocumentName: js.UndefOr[DocumentARN]
    var Parameters: js.UndefOr[SessionManagerParameters]
  }

  object StartSessionRequest {
    def apply(
      Target: SessionTarget,
      DocumentName: js.UndefOr[DocumentARN] = js.undefined,
      Parameters: js.UndefOr[SessionManagerParameters] = js.undefined): StartSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.asInstanceOf[js.Any],
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSessionRequest]
    }
  }

  @js.native
  trait StartSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var StreamUrl: js.UndefOr[StreamUrl]
    var TokenValue: js.UndefOr[TokenValue]
  }

  object StartSessionResponse {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined,
      StreamUrl: js.UndefOr[StreamUrl] = js.undefined,
      TokenValue: js.UndefOr[TokenValue] = js.undefined): StartSessionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] },
        "StreamUrl" -> StreamUrl.map { x => x.asInstanceOf[js.Any] },
        "TokenValue" -> TokenValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSessionResponse]
    }
  }

  /**
   * Detailed information about an the execution state of an Automation step.
   */
  @js.native
  trait StepExecution extends js.Object {
    var Action: js.UndefOr[AutomationActionName]
    var ExecutionEndTime: js.UndefOr[DateTime]
    var ExecutionStartTime: js.UndefOr[DateTime]
    var FailureDetails: js.UndefOr[FailureDetails]
    var FailureMessage: js.UndefOr[String]
    var Inputs: js.UndefOr[NormalStringMap]
    var IsCritical: js.UndefOr[Boolean]
    var IsEnd: js.UndefOr[Boolean]
    var MaxAttempts: js.UndefOr[Int]
    var NextStep: js.UndefOr[String]
    var OnFailure: js.UndefOr[String]
    var Outputs: js.UndefOr[AutomationParameterMap]
    var OverriddenParameters: js.UndefOr[AutomationParameterMap]
    var Response: js.UndefOr[String]
    var ResponseCode: js.UndefOr[String]
    var StepExecutionId: js.UndefOr[String]
    var StepName: js.UndefOr[String]
    var StepStatus: js.UndefOr[AutomationExecutionStatus]
    var TargetLocation: js.UndefOr[TargetLocation]
    var Targets: js.UndefOr[Targets]
    var TimeoutSeconds: js.UndefOr[Double]
    var ValidNextSteps: js.UndefOr[ValidNextStepList]
  }

  object StepExecution {
    def apply(
      Action: js.UndefOr[AutomationActionName] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      Inputs: js.UndefOr[NormalStringMap] = js.undefined,
      IsCritical: js.UndefOr[Boolean] = js.undefined,
      IsEnd: js.UndefOr[Boolean] = js.undefined,
      MaxAttempts: js.UndefOr[Int] = js.undefined,
      NextStep: js.UndefOr[String] = js.undefined,
      OnFailure: js.UndefOr[String] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined,
      OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      Response: js.UndefOr[String] = js.undefined,
      ResponseCode: js.UndefOr[String] = js.undefined,
      StepExecutionId: js.UndefOr[String] = js.undefined,
      StepName: js.UndefOr[String] = js.undefined,
      StepStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      TargetLocation: js.UndefOr[TargetLocation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      TimeoutSeconds: js.UndefOr[Double] = js.undefined,
      ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined): StepExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndTime" -> ExecutionEndTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartTime" -> ExecutionStartTime.map { x => x.asInstanceOf[js.Any] },
        "FailureDetails" -> FailureDetails.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "IsCritical" -> IsCritical.map { x => x.asInstanceOf[js.Any] },
        "IsEnd" -> IsEnd.map { x => x.asInstanceOf[js.Any] },
        "MaxAttempts" -> MaxAttempts.map { x => x.asInstanceOf[js.Any] },
        "NextStep" -> NextStep.map { x => x.asInstanceOf[js.Any] },
        "OnFailure" -> OnFailure.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] },
        "OverriddenParameters" -> OverriddenParameters.map { x => x.asInstanceOf[js.Any] },
        "Response" -> Response.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "StepExecutionId" -> StepExecutionId.map { x => x.asInstanceOf[js.Any] },
        "StepName" -> StepName.map { x => x.asInstanceOf[js.Any] },
        "StepStatus" -> StepStatus.map { x => x.asInstanceOf[js.Any] },
        "TargetLocation" -> TargetLocation.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "TimeoutSeconds" -> TimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "ValidNextSteps" -> ValidNextSteps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepExecution]
    }
  }

  /**
   * A filter to limit the amount of step execution information returned by the call.
   */
  @js.native
  trait StepExecutionFilter extends js.Object {
    var Key: StepExecutionFilterKey
    var Values: StepExecutionFilterValueList
  }

  object StepExecutionFilter {
    def apply(
      Key: StepExecutionFilterKey,
      Values: StepExecutionFilterValueList): StepExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepExecutionFilter]
    }
  }

  object StepExecutionFilterKeyEnum {
    val StartTimeBefore = "StartTimeBefore"
    val StartTimeAfter = "StartTimeAfter"
    val StepExecutionStatus = "StepExecutionStatus"
    val StepExecutionId = "StepExecutionId"
    val StepName = "StepName"
    val Action = "Action"

    val values = IndexedSeq(StartTimeBefore, StartTimeAfter, StepExecutionStatus, StepExecutionId, StepName, Action)
  }

  @js.native
  trait StopAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var Type: js.UndefOr[StopType]
  }

  object StopAutomationExecutionRequest {
    def apply(
      AutomationExecutionId: AutomationExecutionId,
      Type: js.UndefOr[StopType] = js.undefined): StopAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any],
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAutomationExecutionRequest]
    }
  }

  @js.native
  trait StopAutomationExecutionResult extends js.Object {

  }

  object StopAutomationExecutionResult {
    def apply(): StopAutomationExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAutomationExecutionResult]
    }
  }

  object StopTypeEnum {
    val Complete = "Complete"
    val Cancel = "Cancel"

    val values = IndexedSeq(Complete, Cancel)
  }

  /**
   * Metadata that you assign to your AWS resources. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. In Systems Manager, you can apply tags to documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines.
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * An array of search criteria that targets instances using a Key,Value combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in the call.
   *  <p/>
   */
  @js.native
  trait Target extends js.Object {
    var Key: js.UndefOr[TargetKey]
    var Values: js.UndefOr[TargetValues]
  }

  object Target {
    def apply(
      Key: js.UndefOr[TargetKey] = js.undefined,
      Values: js.UndefOr[TargetValues] = js.undefined): Target = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Target]
    }
  }

  /**
   * The combination of AWS Regions and accounts targeted by the current Automation execution.
   */
  @js.native
  trait TargetLocation extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var Regions: js.UndefOr[Regions]
    var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency]
    var TargetLocationMaxErrors: js.UndefOr[MaxErrors]
  }

  object TargetLocation {
    def apply(
      Accounts: js.UndefOr[Accounts] = js.undefined,
      ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
      Regions: js.UndefOr[Regions] = js.undefined,
      TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined): TargetLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleName" -> ExecutionRoleName.map { x => x.asInstanceOf[js.Any] },
        "Regions" -> Regions.map { x => x.asInstanceOf[js.Any] },
        "TargetLocationMaxConcurrency" -> TargetLocationMaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "TargetLocationMaxErrors" -> TargetLocationMaxErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetLocation]
    }
  }

  @js.native
  trait TerminateSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object TerminateSessionRequest {
    def apply(
      SessionId: SessionId): TerminateSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateSessionRequest]
    }
  }

  @js.native
  trait TerminateSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
  }

  object TerminateSessionResponse {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined): TerminateSessionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateSessionResponse]
    }
  }

  @js.native
  trait UpdateAssociationRequest extends js.Object {
    var AssociationId: AssociationId
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  object UpdateAssociationRequest {
    def apply(
      AssociationId: AssociationId,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): UpdateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationRequest]
    }
  }

  @js.native
  trait UpdateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object UpdateAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined): UpdateAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationDescription" -> AssociationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationResult]
    }
  }

  @js.native
  trait UpdateAssociationStatusRequest extends js.Object {
    var AssociationStatus: AssociationStatus
    var InstanceId: InstanceId
    var Name: DocumentName
  }

  object UpdateAssociationStatusRequest {
    def apply(
      AssociationStatus: AssociationStatus,
      InstanceId: InstanceId,
      Name: DocumentName): UpdateAssociationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationStatus" -> AssociationStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationStatusRequest]
    }
  }

  @js.native
  trait UpdateAssociationStatusResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object UpdateAssociationStatusResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined): UpdateAssociationStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationDescription" -> AssociationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationStatusResult]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionRequest extends js.Object {
    var DocumentVersion: DocumentVersionNumber
    var Name: DocumentName
  }

  object UpdateDocumentDefaultVersionRequest {
    def apply(
      DocumentVersion: DocumentVersionNumber,
      Name: DocumentName): UpdateDocumentDefaultVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentVersion" -> DocumentVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentDefaultVersionRequest]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionResult extends js.Object {
    var Description: js.UndefOr[DocumentDefaultVersionDescription]
  }

  object UpdateDocumentDefaultVersionResult {
    def apply(
      Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined): UpdateDocumentDefaultVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentDefaultVersionResult]
    }
  }

  @js.native
  trait UpdateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object UpdateDocumentRequest {
    def apply(
      Content: DocumentContent,
      Name: DocumentName,
      Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      TargetType: js.UndefOr[TargetType] = js.undefined,
      VersionName: js.UndefOr[DocumentVersionName] = js.undefined): UpdateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Attachments" -> Attachments.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "VersionName" -> VersionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentRequest]
    }
  }

  @js.native
  trait UpdateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  object UpdateDocumentResult {
    def apply(
      DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined): UpdateDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentDescription" -> DocumentDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Replace: js.UndefOr[Boolean]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object UpdateMaintenanceWindowRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): UpdateMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowResult extends js.Object {
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object UpdateMaintenanceWindowResult {
    def apply(
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): UpdateMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTargetRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Replace: js.UndefOr[Boolean]
    var Targets: js.UndefOr[Targets]
  }

  object UpdateMaintenanceWindowTargetRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      WindowTargetId: MaintenanceWindowTargetId,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): UpdateMaintenanceWindowTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTargetId" -> WindowTargetId.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTargetRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTargetResult extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Targets: js.UndefOr[Targets]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object UpdateMaintenanceWindowTargetResult {
    def apply(
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined): UpdateMaintenanceWindowTargetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTargetResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTaskRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var Replace: js.UndefOr[Boolean]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var Targets: js.UndefOr[Targets]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
  }

  object UpdateMaintenanceWindowTaskRequest {
    def apply(
      WindowId: MaintenanceWindowId,
      WindowTaskId: MaintenanceWindowTaskId,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined): UpdateMaintenanceWindowTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTaskRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTaskResult extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var Targets: js.UndefOr[Targets]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object UpdateMaintenanceWindowTaskResult {
    def apply(
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): UpdateMaintenanceWindowTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleRequest extends js.Object {
    var IamRole: IamRole
    var InstanceId: ManagedInstanceId
  }

  object UpdateManagedInstanceRoleRequest {
    def apply(
      IamRole: IamRole,
      InstanceId: ManagedInstanceId): UpdateManagedInstanceRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamRole" -> IamRole.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateManagedInstanceRoleRequest]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleResult extends js.Object {

  }

  object UpdateManagedInstanceRoleResult {
    def apply(): UpdateManagedInstanceRoleResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateManagedInstanceRoleResult]
    }
  }

  @js.native
  trait UpdatePatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var Description: js.UndefOr[BaselineDescription]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
    var Name: js.UndefOr[BaselineName]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var Replace: js.UndefOr[Boolean]
    var Sources: js.UndefOr[PatchSourceList]
  }

  object UpdatePatchBaselineRequest {
    def apply(
      BaselineId: BaselineId,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined): UpdatePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePatchBaselineRequest]
    }
  }

  @js.native
  trait UpdatePatchBaselineResult extends js.Object {
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var BaselineId: js.UndefOr[BaselineId]
    var CreatedDate: js.UndefOr[DateTime]
    var Description: js.UndefOr[BaselineDescription]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
    var ModifiedDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[BaselineName]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var Sources: js.UndefOr[PatchSourceList]
  }

  object UpdatePatchBaselineResult {
    def apply(
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined,
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined): UpdatePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] },
        "ModifiedDate" -> ModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePatchBaselineResult]
    }
  }
}
