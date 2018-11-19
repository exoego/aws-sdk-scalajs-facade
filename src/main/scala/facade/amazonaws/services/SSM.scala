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
  type DocumentType = String
  type DocumentVersion = String
  type DocumentVersionList = js.Array[DocumentVersionInfo]
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
  class SSM(config: AWSConfig) extends js.Object {
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
   * <p>An activation registers one or more on-premises servers or virtual machines (VMs) with AWS so that you can configure those servers or VMs using Run Command. A server or VM that has been registered with AWS is called a managed instance.</p>
   */
  @js.native
  trait Activation extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDate]
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var ActivationId: js.UndefOr[ActivationId]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
    var RegistrationsCount: js.UndefOr[RegistrationsCount]
    var IamRole: js.UndefOr[IamRole]
    var Expired: js.UndefOr[Boolean]
  }

  object Activation {
    def apply(
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      Description: js.UndefOr[ActivationDescription] = js.undefined,
      ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
      DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
      ActivationId: js.UndefOr[ActivationId] = js.undefined,
      RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
      RegistrationsCount: js.UndefOr[RegistrationsCount] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined,
      Expired: js.UndefOr[Boolean] = js.undefined): Activation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "DefaultInstanceName" -> DefaultInstanceName.map { x => x.asInstanceOf[js.Any] },
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] },
        "RegistrationLimit" -> RegistrationLimit.map { x => x.asInstanceOf[js.Any] },
        "RegistrationsCount" -> RegistrationsCount.map { x => x.asInstanceOf[js.Any] },
        "IamRole" -> IamRole.map { x => x.asInstanceOf[js.Any] },
        "Expired" -> Expired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Activation]
    }
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceType: js.UndefOr[ResourceTypeForTagging]
    var ResourceId: js.UndefOr[ResourceId]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceTypeForTagging] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes an association of a Systems Manager document and an instance.</p>
   */
  @js.native
  trait Association extends js.Object {
    var Name: js.UndefOr[DocumentName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var LastExecutionDate: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var InstanceId: js.UndefOr[InstanceId]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Overview: js.UndefOr[AssociationOverview]
    var Targets: js.UndefOr[Targets]
    var AssociationId: js.UndefOr[AssociationId]
  }

  object Association {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Overview: js.UndefOr[AssociationOverview] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined): Association = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Overview" -> Overview.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes the parameters for a document.</p>
   */
  @js.native
  trait AssociationDescription extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var LastSuccessfulExecutionDate: js.UndefOr[DateTime]
    var Parameters: js.UndefOr[Parameters]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var LastExecutionDate: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var InstanceId: js.UndefOr[InstanceId]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Overview: js.UndefOr[AssociationOverview]
    var LastUpdateAssociationDate: js.UndefOr[DateTime]
    var Date: js.UndefOr[DateTime]
    var Targets: js.UndefOr[Targets]
    var AssociationId: js.UndefOr[AssociationId]
    var Status: js.UndefOr[AssociationStatus]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
  }

  object AssociationDescription {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Overview: js.UndefOr[AssociationOverview] = js.undefined,
      LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined,
      Date: js.UndefOr[DateTime] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Status: js.UndefOr[AssociationStatus] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined): AssociationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulExecutionDate" -> LastSuccessfulExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Overview" -> Overview.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateAssociationDate" -> LastUpdateAssociationDate.map { x => x.asInstanceOf[js.Any] },
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationDescription]
    }
  }

  /**
   * <p>Includes information about the specified association.</p>
   */
  @js.native
  trait AssociationExecution extends js.Object {
    var CreatedTime: js.UndefOr[DateTime]
    var DetailedStatus: js.UndefOr[StatusName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var ExecutionId: js.UndefOr[AssociationExecutionId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var ResourceCountByStatus: js.UndefOr[ResourceCountByStatus]
    var AssociationId: js.UndefOr[AssociationId]
    var Status: js.UndefOr[StatusName]
  }

  object AssociationExecution {
    def apply(
      CreatedTime: js.UndefOr[DateTime] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      ResourceCountByStatus: js.UndefOr[ResourceCountByStatus] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): AssociationExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "ResourceCountByStatus" -> ResourceCountByStatus.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationExecution]
    }
  }

  /**
   * <p>Filters used in the request.</p>
   */
  @js.native
  trait AssociationExecutionFilter extends js.Object {
    var Key: js.UndefOr[AssociationExecutionFilterKey]
    var Value: js.UndefOr[AssociationExecutionFilterValue]
    var Type: js.UndefOr[AssociationFilterOperatorType]
  }

  object AssociationExecutionFilter {
    def apply(
      Key: js.UndefOr[AssociationExecutionFilterKey] = js.undefined,
      Value: js.UndefOr[AssociationExecutionFilterValue] = js.undefined,
      Type: js.UndefOr[AssociationFilterOperatorType] = js.undefined): AssociationExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Includes information about the specified association execution.</p>
   */
  @js.native
  trait AssociationExecutionTarget extends js.Object {
    var ResourceId: js.UndefOr[AssociationResourceId]
    var DetailedStatus: js.UndefOr[StatusName]
    var ResourceType: js.UndefOr[AssociationResourceType]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var OutputSource: js.UndefOr[OutputSource]
    var ExecutionId: js.UndefOr[AssociationExecutionId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var AssociationId: js.UndefOr[AssociationId]
    var Status: js.UndefOr[StatusName]
  }

  object AssociationExecutionTarget {
    def apply(
      ResourceId: js.UndefOr[AssociationResourceId] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      ResourceType: js.UndefOr[AssociationResourceType] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      OutputSource: js.UndefOr[OutputSource] = js.undefined,
      ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): AssociationExecutionTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "OutputSource" -> OutputSource.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "LastExecutionDate" -> LastExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationExecutionTarget]
    }
  }

  /**
   * <p>Filters for the association execution.</p>
   */
  @js.native
  trait AssociationExecutionTargetsFilter extends js.Object {
    var Key: js.UndefOr[AssociationExecutionTargetsFilterKey]
    var Value: js.UndefOr[AssociationExecutionTargetsFilterValue]
  }

  object AssociationExecutionTargetsFilter {
    def apply(
      Key: js.UndefOr[AssociationExecutionTargetsFilterKey] = js.undefined,
      Value: js.UndefOr[AssociationExecutionTargetsFilterValue] = js.undefined): AssociationExecutionTargetsFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes a filter.</p>
   */
  @js.native
  trait AssociationFilter extends js.Object {
    var key: js.UndefOr[AssociationFilterKey]
    var value: js.UndefOr[AssociationFilterValue]
  }

  object AssociationFilter {
    def apply(
      key: js.UndefOr[AssociationFilterKey] = js.undefined,
      value: js.UndefOr[AssociationFilterValue] = js.undefined): AssociationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about the association.</p>
   */
  @js.native
  trait AssociationOverview extends js.Object {
    var Status: js.UndefOr[StatusName]
    var DetailedStatus: js.UndefOr[StatusName]
    var AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount]
  }

  object AssociationOverview {
    def apply(
      Status: js.UndefOr[StatusName] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount] = js.undefined): AssociationOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "AssociationStatusAggregatedCount" -> AssociationStatusAggregatedCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationOverview]
    }
  }

  /**
   * <p>Describes an association status.</p>
   */
  @js.native
  trait AssociationStatus extends js.Object {
    var Date: js.UndefOr[DateTime]
    var Name: js.UndefOr[AssociationStatusName]
    var Message: js.UndefOr[StatusMessage]
    var AdditionalInfo: js.UndefOr[StatusAdditionalInfo]
  }

  object AssociationStatus {
    def apply(
      Date: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[AssociationStatusName] = js.undefined,
      Message: js.UndefOr[StatusMessage] = js.undefined,
      AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined): AssociationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Information about the association version.</p>
   */
  @js.native
  trait AssociationVersionInfo extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var CreatedDate: js.UndefOr[DateTime]
    var Parameters: js.UndefOr[Parameters]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
    var AssociationId: js.UndefOr[AssociationId]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
  }

  object AssociationVersionInfo {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined): AssociationVersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationVersionInfo]
    }
  }

  /**
   * <p>Detailed information about the current state of an individual Automation execution.</p>
   */
  @js.native
  trait AutomationExecution extends js.Object {
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Target: js.UndefOr[String]
    var MaxErrors: js.UndefOr[MaxErrors]
    var TargetMaps: js.UndefOr[TargetMaps]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var FailureMessage: js.UndefOr[String]
    var StepExecutions: js.UndefOr[StepExecutionList]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var ResolvedTargets: js.UndefOr[ResolvedTargets]
    var ProgressCounters: js.UndefOr[ProgressCounters]
    var ExecutionStartTime: js.UndefOr[DateTime]
    var ExecutionEndTime: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Mode: js.UndefOr[ExecutionMode]
    var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var TargetLocations: js.UndefOr[TargetLocations]
    var CurrentStepName: js.UndefOr[String]
    var DocumentName: js.UndefOr[DocumentName]
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var Targets: js.UndefOr[Targets]
    var StepExecutionsTruncated: js.UndefOr[Boolean]
    var CurrentAction: js.UndefOr[String]
    var ExecutedBy: js.UndefOr[String]
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus]
    var Outputs: js.UndefOr[AutomationParameterMap]
  }

  object AutomationExecution {
    def apply(
      TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
      Target: js.UndefOr[String] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      StepExecutions: js.UndefOr[StepExecutionList] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined,
      ProgressCounters: js.UndefOr[ProgressCounters] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Mode: js.UndefOr[ExecutionMode] = js.undefined,
      ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
      CurrentStepName: js.UndefOr[String] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      StepExecutionsTruncated: js.UndefOr[Boolean] = js.undefined,
      CurrentAction: js.UndefOr[String] = js.undefined,
      ExecutedBy: js.UndefOr[String] = js.undefined,
      AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined): AutomationExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetParameterName" -> TargetParameterName.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "TargetMaps" -> TargetMaps.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "StepExecutions" -> StepExecutions.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResolvedTargets" -> ResolvedTargets.map { x => x.asInstanceOf[js.Any] },
        "ProgressCounters" -> ProgressCounters.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartTime" -> ExecutionStartTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndTime" -> ExecutionEndTime.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "ParentAutomationExecutionId" -> ParentAutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TargetLocations" -> TargetLocations.map { x => x.asInstanceOf[js.Any] },
        "CurrentStepName" -> CurrentStepName.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "StepExecutionsTruncated" -> StepExecutionsTruncated.map { x => x.asInstanceOf[js.Any] },
        "CurrentAction" -> CurrentAction.map { x => x.asInstanceOf[js.Any] },
        "ExecutedBy" -> ExecutedBy.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionStatus" -> AutomationExecutionStatus.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecution]
    }
  }

  /**
   * <p>A filter used to match specific automation executions. This is used to limit the scope of Automation execution information returned.</p>
   */
  @js.native
  trait AutomationExecutionFilter extends js.Object {
    var Key: js.UndefOr[AutomationExecutionFilterKey]
    var Values: js.UndefOr[AutomationExecutionFilterValueList]
  }

  object AutomationExecutionFilter {
    def apply(
      Key: js.UndefOr[AutomationExecutionFilterKey] = js.undefined,
      Values: js.UndefOr[AutomationExecutionFilterValueList] = js.undefined): AutomationExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Details about a specific Automation execution.</p>
   */
  @js.native
  trait AutomationExecutionMetadata extends js.Object {
    var LogFile: js.UndefOr[String]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Target: js.UndefOr[String]
    var MaxErrors: js.UndefOr[MaxErrors]
    var TargetMaps: js.UndefOr[TargetMaps]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var AutomationType: js.UndefOr[AutomationType]
    var FailureMessage: js.UndefOr[String]
    var ResolvedTargets: js.UndefOr[ResolvedTargets]
    var ExecutionStartTime: js.UndefOr[DateTime]
    var ExecutionEndTime: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Mode: js.UndefOr[ExecutionMode]
    var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var CurrentStepName: js.UndefOr[String]
    var DocumentName: js.UndefOr[DocumentName]
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var Targets: js.UndefOr[Targets]
    var CurrentAction: js.UndefOr[String]
    var ExecutedBy: js.UndefOr[String]
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus]
    var Outputs: js.UndefOr[AutomationParameterMap]
  }

  object AutomationExecutionMetadata {
    def apply(
      LogFile: js.UndefOr[String] = js.undefined,
      TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
      Target: js.UndefOr[String] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      AutomationType: js.UndefOr[AutomationType] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Mode: js.UndefOr[ExecutionMode] = js.undefined,
      ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      CurrentStepName: js.UndefOr[String] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      CurrentAction: js.UndefOr[String] = js.undefined,
      ExecutedBy: js.UndefOr[String] = js.undefined,
      AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined): AutomationExecutionMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogFile" -> LogFile.map { x => x.asInstanceOf[js.Any] },
        "TargetParameterName" -> TargetParameterName.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "TargetMaps" -> TargetMaps.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "AutomationType" -> AutomationType.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "ResolvedTargets" -> ResolvedTargets.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartTime" -> ExecutionStartTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndTime" -> ExecutionEndTime.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "ParentAutomationExecutionId" -> ParentAutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "CurrentStepName" -> CurrentStepName.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "CurrentAction" -> CurrentAction.map { x => x.asInstanceOf[js.Any] },
        "ExecutedBy" -> ExecutedBy.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionStatus" -> AutomationExecutionStatus.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var CommandId: js.UndefOr[CommandId]
    var InstanceIds: js.UndefOr[InstanceIdList]
  }

  object CancelCommandRequest {
    def apply(
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined): CancelCommandRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCommandRequest]
    }
  }

  /**
   * <p>Whether or not the command was successfully canceled. There is no guarantee that a request can be canceled.</p>
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
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object CancelMaintenanceWindowExecutionRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined): CancelMaintenanceWindowExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Configuration options for sending command output to CloudWatch Logs.</p>
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
   * <p>Describes a command request.</p>
   */
  @js.native
  trait Command extends js.Object {
    var StatusDetails: js.UndefOr[StatusDetails]
    var MaxErrors: js.UndefOr[MaxErrors]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ErrorCount: js.UndefOr[ErrorCount]
    var TargetCount: js.UndefOr[TargetCount]
    var ServiceRole: js.UndefOr[ServiceRole]
    var ExpiresAfter: js.UndefOr[DateTime]
    var Parameters: js.UndefOr[Parameters]
    var OutputS3Region: js.UndefOr[S3Region]
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var CompletedCount: js.UndefOr[CompletedCount]
    var CommandId: js.UndefOr[CommandId]
    var InstanceIds: js.UndefOr[InstanceIdList]
    var DocumentName: js.UndefOr[DocumentName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var RequestedDateTime: js.UndefOr[DateTime]
    var Targets: js.UndefOr[Targets]
    var DeliveryTimedOutCount: js.UndefOr[DeliveryTimedOutCount]
    var Comment: js.UndefOr[Comment]
    var Status: js.UndefOr[CommandStatus]
  }

  object Command {
    def apply(
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ErrorCount: js.UndefOr[ErrorCount] = js.undefined,
      TargetCount: js.UndefOr[TargetCount] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      ExpiresAfter: js.UndefOr[DateTime] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      CompletedCount: js.UndefOr[CompletedCount] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      RequestedDateTime: js.UndefOr[DateTime] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      DeliveryTimedOutCount: js.UndefOr[DeliveryTimedOutCount] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      Status: js.UndefOr[CommandStatus] = js.undefined): Command = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ErrorCount" -> ErrorCount.map { x => x.asInstanceOf[js.Any] },
        "TargetCount" -> TargetCount.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "ExpiresAfter" -> ExpiresAfter.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "CompletedCount" -> CompletedCount.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "RequestedDateTime" -> RequestedDateTime.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "DeliveryTimedOutCount" -> DeliveryTimedOutCount.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }

  /**
   * <p>Describes a command filter.</p>
   */
  @js.native
  trait CommandFilter extends js.Object {
    var key: js.UndefOr[CommandFilterKey]
    var value: js.UndefOr[CommandFilterValue]
  }

  object CommandFilter {
    def apply(
      key: js.UndefOr[CommandFilterKey] = js.undefined,
      value: js.UndefOr[CommandFilterValue] = js.undefined): CommandFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user executes SendCommand against three instances, then a command invocation is created for each requested instance ID. A command invocation returns status and detail information about a command you executed. </p>
   */
  @js.native
  trait CommandInvocation extends js.Object {
    var StatusDetails: js.UndefOr[StatusDetails]
    var CommandPlugins: js.UndefOr[CommandPluginList]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var ServiceRole: js.UndefOr[ServiceRole]
    var TraceOutput: js.UndefOr[InvocationTraceOutput]
    var InstanceName: js.UndefOr[InstanceTagName]
    var StandardErrorUrl: js.UndefOr[Url]
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var StandardOutputUrl: js.UndefOr[Url]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var CommandId: js.UndefOr[CommandId]
    var InstanceId: js.UndefOr[InstanceId]
    var DocumentName: js.UndefOr[DocumentName]
    var RequestedDateTime: js.UndefOr[DateTime]
    var Comment: js.UndefOr[Comment]
    var Status: js.UndefOr[CommandInvocationStatus]
  }

  object CommandInvocation {
    def apply(
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      CommandPlugins: js.UndefOr[CommandPluginList] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined,
      InstanceName: js.UndefOr[InstanceTagName] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      RequestedDateTime: js.UndefOr[DateTime] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      Status: js.UndefOr[CommandInvocationStatus] = js.undefined): CommandInvocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "CommandPlugins" -> CommandPlugins.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "TraceOutput" -> TraceOutput.map { x => x.asInstanceOf[js.Any] },
        "InstanceName" -> InstanceName.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorUrl" -> StandardErrorUrl.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputUrl" -> StandardOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "RequestedDateTime" -> RequestedDateTime.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes plugin details.</p>
   */
  @js.native
  trait CommandPlugin extends js.Object {
    var StatusDetails: js.UndefOr[StatusDetails]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var ResponseStartDateTime: js.UndefOr[DateTime]
    var Name: js.UndefOr[CommandPluginName]
    var StandardErrorUrl: js.UndefOr[Url]
    var OutputS3Region: js.UndefOr[S3Region]
    var ResponseCode: js.UndefOr[ResponseCode]
    var StandardOutputUrl: js.UndefOr[Url]
    var Output: js.UndefOr[CommandPluginOutput]
    var ResponseFinishDateTime: js.UndefOr[DateTime]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var Status: js.UndefOr[CommandPluginStatus]
  }

  object CommandPlugin {
    def apply(
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      ResponseStartDateTime: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[CommandPluginName] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      Output: js.UndefOr[CommandPluginOutput] = js.undefined,
      ResponseFinishDateTime: js.UndefOr[DateTime] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      Status: js.UndefOr[CommandPluginStatus] = js.undefined): CommandPlugin = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "ResponseStartDateTime" -> ResponseStartDateTime.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorUrl" -> StandardErrorUrl.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputUrl" -> StandardOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] },
        "ResponseFinishDateTime" -> ResponseFinishDateTime.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A summary of the call execution that includes an execution ID, the type of execution (for example, <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
   */
  @js.native
  trait ComplianceExecutionSummary extends js.Object {
    var ExecutionTime: js.UndefOr[DateTime]
    var ExecutionId: js.UndefOr[ComplianceExecutionId]
    var ExecutionType: js.UndefOr[ComplianceExecutionType]
  }

  object ComplianceExecutionSummary {
    def apply(
      ExecutionTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionId: js.UndefOr[ComplianceExecutionId] = js.undefined,
      ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined): ComplianceExecutionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionTime" -> ExecutionTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ExecutionType" -> ExecutionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceExecutionSummary]
    }
  }

  /**
   * <p>Information about the compliance as defined by the resource type. For example, for a patch resource type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.</p>
   */
  @js.native
  trait ComplianceItem extends js.Object {
    var Id: js.UndefOr[ComplianceItemId]
    var ResourceId: js.UndefOr[ComplianceResourceId]
    var Title: js.UndefOr[ComplianceItemTitle]
    var ResourceType: js.UndefOr[ComplianceResourceType]
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary]
    var Details: js.UndefOr[ComplianceItemDetails]
    var Severity: js.UndefOr[ComplianceSeverity]
    var Status: js.UndefOr[ComplianceStatus]
  }

  object ComplianceItem {
    def apply(
      Id: js.UndefOr[ComplianceItemId] = js.undefined,
      ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
      Title: js.UndefOr[ComplianceItemTitle] = js.undefined,
      ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
      ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
      Details: js.UndefOr[ComplianceItemDetails] = js.undefined,
      Severity: js.UndefOr[ComplianceSeverity] = js.undefined,
      Status: js.UndefOr[ComplianceStatus] = js.undefined): ComplianceItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceItem]
    }
  }

  /**
   * <p>Information about a compliance item.</p>
   */
  @js.native
  trait ComplianceItemEntry extends js.Object {
    var Id: js.UndefOr[ComplianceItemId]
    var Title: js.UndefOr[ComplianceItemTitle]
    var Details: js.UndefOr[ComplianceItemDetails]
    var Severity: js.UndefOr[ComplianceSeverity]
    var Status: js.UndefOr[ComplianceStatus]
  }

  object ComplianceItemEntry {
    def apply(
      Id: js.UndefOr[ComplianceItemId] = js.undefined,
      Title: js.UndefOr[ComplianceItemTitle] = js.undefined,
      Details: js.UndefOr[ComplianceItemDetails] = js.undefined,
      Severity: js.UndefOr[ComplianceSeverity] = js.undefined,
      Status: js.UndefOr[ComplianceStatus] = js.undefined): ComplianceItemEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>One or more filters. Use a filter to return a more specific list of results.</p>
   */
  @js.native
  trait ComplianceStringFilter extends js.Object {
    var Key: js.UndefOr[ComplianceStringFilterKey]
    var Values: js.UndefOr[ComplianceStringFilterValueList]
    var Type: js.UndefOr[ComplianceQueryOperatorType]
  }

  object ComplianceStringFilter {
    def apply(
      Key: js.UndefOr[ComplianceStringFilterKey] = js.undefined,
      Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined,
      Type: js.UndefOr[ComplianceQueryOperatorType] = js.undefined): ComplianceStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceStringFilter]
    }
  }

  /**
   * <p>A summary of compliance information by compliance type.</p>
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
   * <p>A summary of resources that are compliant. The summary is organized according to the resource count for each compliance type.</p>
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
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
    var IamRole: js.UndefOr[IamRole]
  }

  object CreateActivationRequest {
    def apply(
      Description: js.UndefOr[ActivationDescription] = js.undefined,
      ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
      DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
      RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined): CreateActivationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "DefaultInstanceName" -> DefaultInstanceName.map { x => x.asInstanceOf[js.Any] },
        "RegistrationLimit" -> RegistrationLimit.map { x => x.asInstanceOf[js.Any] },
        "IamRole" -> IamRole.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivationRequest]
    }
  }

  @js.native
  trait CreateActivationResult extends js.Object {
    var ActivationId: js.UndefOr[ActivationId]
    var ActivationCode: js.UndefOr[ActivationCode]
  }

  object CreateActivationResult {
    def apply(
      ActivationId: js.UndefOr[ActivationId] = js.undefined,
      ActivationCode: js.UndefOr[ActivationCode] = js.undefined): CreateActivationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] },
        "ActivationCode" -> ActivationCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivationResult]
    }
  }

  @js.native
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: js.UndefOr[CreateAssociationBatchRequestEntries]
  }

  object CreateAssociationBatchRequest {
    def apply(
      Entries: js.UndefOr[CreateAssociationBatchRequestEntries] = js.undefined): CreateAssociationBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequest]
    }
  }

  /**
   * <p>Describes the association of a Systems Manager SSM document and an instance.</p>
   */
  @js.native
  trait CreateAssociationBatchRequestEntry extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var Parameters: js.UndefOr[Parameters]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var InstanceId: js.UndefOr[InstanceId]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
  }

  object CreateAssociationBatchRequestEntry {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined): CreateAssociationBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequestEntry]
    }
  }

  @js.native
  trait CreateAssociationBatchResult extends js.Object {
    var Successful: js.UndefOr[AssociationDescriptionList]
    var Failed: js.UndefOr[FailedCreateAssociationList]
  }

  object CreateAssociationBatchResult {
    def apply(
      Successful: js.UndefOr[AssociationDescriptionList] = js.undefined,
      Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined): CreateAssociationBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] },
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchResult]
    }
  }

  @js.native
  trait CreateAssociationRequest extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var Parameters: js.UndefOr[Parameters]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var InstanceId: js.UndefOr[InstanceId]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
  }

  object CreateAssociationRequest {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined): CreateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TargetType: js.UndefOr[TargetType]
    var Content: js.UndefOr[DocumentContent]
    var Name: js.UndefOr[DocumentName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
  }

  object CreateDocumentRequest {
    def apply(
      TargetType: js.UndefOr[TargetType] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined): CreateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[MaintenanceWindowName]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var ClientToken: js.UndefOr[ClientToken]
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object CreateMaintenanceWindowRequest {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): CreateMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var Name: js.UndefOr[BaselineName]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[BaselineDescription]
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var Sources: js.UndefOr[PatchSourceList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
  }

  object CreatePatchBaselineRequest {
    def apply(
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined): CreatePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var SyncName: js.UndefOr[ResourceDataSyncName]
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination]
  }

  object CreateResourceDataSyncRequest {
    def apply(
      SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined,
      S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined): CreateResourceDataSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SyncName" -> SyncName.map { x => x.asInstanceOf[js.Any] },
        "S3Destination" -> S3Destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ActivationId: js.UndefOr[ActivationId]
  }

  object DeleteActivationRequest {
    def apply(
      ActivationId: js.UndefOr[ActivationId] = js.undefined): DeleteActivationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[DocumentName]
    var InstanceId: js.UndefOr[InstanceId]
    var AssociationId: js.UndefOr[AssociationId]
  }

  object DeleteAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined): DeleteAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[DocumentName]
  }

  object DeleteDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined): DeleteDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption]
    var DryRun: js.UndefOr[DryRun]
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DeleteInventoryRequest {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined): DeleteInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "SchemaDeleteOption" -> SchemaDeleteOption.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInventoryRequest]
    }
  }

  @js.native
  trait DeleteInventoryResult extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
  }

  object DeleteInventoryResult {
    def apply(
      DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined): DeleteInventoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionId" -> DeletionId.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "DeletionSummary" -> DeletionSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInventoryResult]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object DeleteMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): DeleteMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[PSParameterName]
  }

  object DeleteParameterRequest {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined): DeleteParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Names: js.UndefOr[ParameterNameList]
  }

  object DeleteParametersRequest {
    def apply(
      Names: js.UndefOr[ParameterNameList] = js.undefined): DeleteParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var BaselineId: js.UndefOr[BaselineId]
  }

  object DeletePatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined): DeletePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var SyncName: js.UndefOr[ResourceDataSyncName]
  }

  object DeleteResourceDataSyncRequest {
    def apply(
      SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined): DeleteResourceDataSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SyncName" -> SyncName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var InstanceId: js.UndefOr[ManagedInstanceId]
  }

  object DeregisterManagedInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[ManagedInstanceId] = js.undefined): DeregisterManagedInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object DeregisterPatchBaselineForPatchGroupRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): DeregisterPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
    var Safe: js.UndefOr[Boolean]
  }

  object DeregisterTargetFromMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined,
      Safe: js.UndefOr[Boolean] = js.undefined): DeregisterTargetFromMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] },
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
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object DeregisterTaskFromMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): DeregisterTaskFromMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Filter for the DescribeActivation API.</p>
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
    var MaxResults: js.UndefOr[MaxResults]
    var ExecutionId: js.UndefOr[AssociationExecutionId]
    var Filters: js.UndefOr[AssociationExecutionTargetsFilterList]
    var NextToken: js.UndefOr[NextToken]
    var AssociationId: js.UndefOr[AssociationId]
  }

  object DescribeAssociationExecutionTargetsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
      Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined): DescribeAssociationExecutionTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AssociationId: js.UndefOr[AssociationId]
    var Filters: js.UndefOr[AssociationExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionsRequest {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAssociationExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
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
    var Name: js.UndefOr[DocumentName]
    var InstanceId: js.UndefOr[InstanceId]
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
  }

  object DescribeAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined): DescribeAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxResults: js.UndefOr[MaxResults]
    var ReverseOrder: js.UndefOr[Boolean]
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var Filters: js.UndefOr[StepExecutionFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAutomationStepExecutionsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ReverseOrder: js.UndefOr[Boolean] = js.undefined,
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      Filters: js.UndefOr[StepExecutionFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAutomationStepExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ReverseOrder" -> ReverseOrder.map { x => x.asInstanceOf[js.Any] },
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationStepExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAutomationStepExecutionsResult extends js.Object {
    var StepExecutions: js.UndefOr[StepExecutionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAutomationStepExecutionsResult {
    def apply(
      StepExecutions: js.UndefOr[StepExecutionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAutomationStepExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StepExecutions" -> StepExecutions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Patches: js.UndefOr[PatchList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAvailablePatchesResult {
    def apply(
      Patches: js.UndefOr[PatchList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAvailablePatchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Patches" -> Patches.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailablePatchesResult]
    }
  }

  @js.native
  trait DescribeDocumentPermissionRequest extends js.Object {
    var Name: js.UndefOr[DocumentName]
    var PermissionType: js.UndefOr[DocumentPermissionType]
  }

  object DescribeDocumentPermissionRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      PermissionType: js.UndefOr[DocumentPermissionType] = js.undefined): DescribeDocumentPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PermissionType" -> PermissionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[DocumentARN]
    var DocumentVersion: js.UndefOr[DocumentVersion]
  }

  object DescribeDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined): DescribeDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectiveInstanceAssociationsRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeEffectiveInstanceAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
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
    var BaselineId: js.UndefOr[BaselineId]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectivePatchesForPatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeEffectivePatchesForPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
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
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceAssociationsStatusRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstanceAssociationsStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
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
    var InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList]
    var Filters: js.UndefOr[InstanceInformationStringFilterList]
    var MaxResults: js.UndefOr[MaxResultsEC2Compatible]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceInformationRequest {
    def apply(
      InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined,
      Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstanceInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInformationFilterList" -> InstanceInformationFilterList.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
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
    var PatchGroup: js.UndefOr[PatchGroup]
    var Filters: js.UndefOr[InstancePatchStateFilterList]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
  }

  object DescribeInstancePatchStatesForPatchGroupRequest {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined): DescribeInstancePatchStatesForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var InstanceIds: js.UndefOr[InstanceIdList]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
  }

  object DescribeInstancePatchStatesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined): DescribeInstancePatchStatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var InstanceId: js.UndefOr[InstanceId]
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
  }

  object DescribeInstancePatchesRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined): DescribeInstancePatchesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchesResult extends js.Object {
    var Patches: js.UndefOr[PatchComplianceDataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchesResult {
    def apply(
      Patches: js.UndefOr[PatchComplianceDataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancePatchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Patches" -> Patches.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchesResult]
    }
  }

  @js.native
  trait DescribeInventoryDeletionsRequest extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object DescribeInventoryDeletionsRequest {
    def apply(
      DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): DescribeInventoryDeletionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionId" -> DeletionId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
    def apply(
      TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskId" -> TaskId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
    var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
    def apply(
      WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionTaskInvocationIdentities" -> WindowExecutionTaskInvocationIdentities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksRequest extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionTasksRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
    var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionTasksResult {
    def apply(
      WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionTaskIdentities" -> WindowExecutionTaskIdentities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionsRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
    var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowExecutionsResult {
    def apply(
      WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutions" -> WindowExecutions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowScheduleRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var Targets: js.UndefOr[Targets]
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowScheduleRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowScheduleRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowScheduleResult extends js.Object {
    var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowScheduleResult {
    def apply(
      ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowScheduleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduledWindowExecutions" -> ScheduledWindowExecutions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowScheduleResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowTargetsRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTargetsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsResult extends js.Object {
    var Targets: js.UndefOr[MaintenanceWindowTargetList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowTargetsResult {
    def apply(
      Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowTargetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTargetsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowTasksRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksResult extends js.Object {
    var Tasks: js.UndefOr[MaintenanceWindowTaskList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowTasksResult {
    def apply(
      Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tasks" -> Tasks.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTasksResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
    var Targets: js.UndefOr[Targets]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowsForTargetRequest {
    def apply(
      Targets: js.UndefOr[Targets] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowsForTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
    var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowsForTargetResult {
    def apply(
      WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowsForTargetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowIdentities" -> WindowIdentities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowsResult {
    def apply(
      WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeMaintenanceWindowsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowIdentities" -> WindowIdentities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsResult]
    }
  }

  @js.native
  trait DescribeParametersRequest extends js.Object {
    var Filters: js.UndefOr[ParametersFilterList]
    var ParameterFilters: js.UndefOr[ParameterStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeParametersRequest {
    def apply(
      Filters: js.UndefOr[ParametersFilterList] = js.undefined,
      ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ParameterFilters" -> ParameterFilters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResult extends js.Object {
    var Parameters: js.UndefOr[ParameterMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeParametersResult {
    def apply(
      Parameters: js.UndefOr[ParameterMetadataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object DescribePatchGroupStateRequest {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): DescribePatchGroupStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupStateRequest]
    }
  }

  @js.native
  trait DescribePatchGroupStateResult extends js.Object {
    var InstancesWithNotApplicablePatches: js.UndefOr[Int]
    var InstancesWithInstalledPatches: js.UndefOr[Int]
    var InstancesWithMissingPatches: js.UndefOr[Int]
    var InstancesWithFailedPatches: js.UndefOr[Int]
    var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount]
    var Instances: js.UndefOr[Int]
    var InstancesWithInstalledOtherPatches: js.UndefOr[Int]
  }

  object DescribePatchGroupStateResult {
    def apply(
      InstancesWithNotApplicablePatches: js.UndefOr[Int] = js.undefined,
      InstancesWithInstalledPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithMissingPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithFailedPatches: js.UndefOr[Int] = js.undefined,
      InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined,
      Instances: js.UndefOr[Int] = js.undefined,
      InstancesWithInstalledOtherPatches: js.UndefOr[Int] = js.undefined): DescribePatchGroupStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancesWithNotApplicablePatches" -> InstancesWithNotApplicablePatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithInstalledPatches" -> InstancesWithInstalledPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithMissingPatches" -> InstancesWithMissingPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithFailedPatches" -> InstancesWithFailedPatches.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithInstalledRejectedPatches" -> InstancesWithInstalledRejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "InstancesWithInstalledOtherPatches" -> InstancesWithInstalledOtherPatches.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupStateResult]
    }
  }

  @js.native
  trait DescribePatchGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchGroupsRequest {
    def apply(
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribePatchGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
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
    var State: js.UndefOr[SessionState]
    var MaxResults: js.UndefOr[SessionMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Filters: js.UndefOr[SessionFilterList]
  }

  object DescribeSessionsRequest {
    def apply(
      State: js.UndefOr[SessionState] = js.undefined,
      MaxResults: js.UndefOr[SessionMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Filters: js.UndefOr[SessionFilterList] = js.undefined): DescribeSessionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsRequest]
    }
  }

  @js.native
  trait DescribeSessionsResponse extends js.Object {
    var Sessions: js.UndefOr[SessionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeSessionsResponse {
    def apply(
      Sessions: js.UndefOr[SessionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeSessionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Sessions" -> Sessions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSessionsResponse]
    }
  }

  /**
   * <p>A default version of a document.</p>
   */
  @js.native
  trait DocumentDefaultVersionDescription extends js.Object {
    var Name: js.UndefOr[DocumentName]
    var DefaultVersion: js.UndefOr[DocumentVersion]
  }

  object DocumentDefaultVersionDescription {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined): DocumentDefaultVersionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersion" -> DefaultVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDefaultVersionDescription]
    }
  }

  /**
   * <p>Describes a Systems Manager document. </p>
   */
  @js.native
  trait DocumentDescription extends js.Object {
    var TargetType: js.UndefOr[TargetType]
    var Name: js.UndefOr[DocumentARN]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var CreatedDate: js.UndefOr[DateTime]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Description: js.UndefOr[DescriptionInDocument]
    var HashType: js.UndefOr[DocumentHashType]
    var Parameters: js.UndefOr[DocumentParameterList]
    var DefaultVersion: js.UndefOr[DocumentVersion]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Sha1: js.UndefOr[DocumentSha1]
    var DocumentType: js.UndefOr[DocumentType]
    var Tags: js.UndefOr[TagList]
    var LatestVersion: js.UndefOr[DocumentVersion]
    var Owner: js.UndefOr[DocumentOwner]
    var Hash: js.UndefOr[DocumentHash]
    var Status: js.UndefOr[DocumentStatus]
  }

  object DocumentDescription {
    def apply(
      TargetType: js.UndefOr[TargetType] = js.undefined,
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
      Description: js.UndefOr[DescriptionInDocument] = js.undefined,
      HashType: js.UndefOr[DocumentHashType] = js.undefined,
      Parameters: js.UndefOr[DocumentParameterList] = js.undefined,
      DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined,
      PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Sha1: js.UndefOr[DocumentSha1] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      LatestVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Owner: js.UndefOr[DocumentOwner] = js.undefined,
      Hash: js.UndefOr[DocumentHash] = js.undefined,
      Status: js.UndefOr[DocumentStatus] = js.undefined): DocumentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HashType" -> HashType.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersion" -> DefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "PlatformTypes" -> PlatformTypes.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Sha1" -> Sha1.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "LatestVersion" -> LatestVersion.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Hash" -> Hash.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDescription]
    }
  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait DocumentFilter extends js.Object {
    var key: js.UndefOr[DocumentFilterKey]
    var value: js.UndefOr[DocumentFilterValue]
  }

  object DocumentFilter {
    def apply(
      key: js.UndefOr[DocumentFilterKey] = js.undefined,
      value: js.UndefOr[DocumentFilterValue] = js.undefined): DocumentFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes the name of a Systems Manager document.</p>
   */
  @js.native
  trait DocumentIdentifier extends js.Object {
    var TargetType: js.UndefOr[TargetType]
    var Name: js.UndefOr[DocumentARN]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var DocumentType: js.UndefOr[DocumentType]
    var Tags: js.UndefOr[TagList]
    var Owner: js.UndefOr[DocumentOwner]
  }

  object DocumentIdentifier {
    def apply(
      TargetType: js.UndefOr[TargetType] = js.undefined,
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
      PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Owner: js.UndefOr[DocumentOwner] = js.undefined): DocumentIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "PlatformTypes" -> PlatformTypes.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentIdentifier]
    }
  }

  /**
   * <p>One or more filters. Use a filter to return a more specific list of documents.</p> <p>For keys, you can specify one or more tags that have been applied to a document. </p> <p>Other valid values include Owner, Name, PlatformTypes, and DocumentType.</p> <p>Note that only one Owner can be specified in a request. For example: <code>Key=Owner,Values=Self</code>.</p> <p>If you use Name as a key, you can use a name prefix to return a list of documents. For example, in the AWS CLI, to return a list of all documents that begin with <code>Te</code>, run the following command:</p> <p> <code>aws ssm list-documents --filters Key=Name,Values=Te</code> </p> <p>If you specify more than two keys, only documents that are identified by all the tags are returned in the results. If you specify more than two values for a key, documents that are identified by any of the values are returned in the results.</p> <p>To specify a custom key and value pair, use the format <code>Key=tag:[tagName],Values=[valueName]</code>.</p> <p>For example, if you created a Key called region and are using the AWS CLI to call the <code>list-documents</code> command: </p> <p> <code>aws ssm list-documents --filters Key=tag:region,Values=east,west Key=Owner,Values=Self</code> </p>
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
   * <p>Parameters specified in a System Manager document that execute on the server when the command is run. </p>
   */
  @js.native
  trait DocumentParameter extends js.Object {
    var Name: js.UndefOr[DocumentParameterName]
    var Type: js.UndefOr[DocumentParameterType]
    var Description: js.UndefOr[DocumentParameterDescrption]
    var DefaultValue: js.UndefOr[DocumentParameterDefaultValue]
  }

  object DocumentParameter {
    def apply(
      Name: js.UndefOr[DocumentParameterName] = js.undefined,
      Type: js.UndefOr[DocumentParameterType] = js.undefined,
      Description: js.UndefOr[DocumentParameterDescrption] = js.undefined,
      DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.undefined): DocumentParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  object DocumentStatusEnum {
    val Creating = "Creating"
    val Active = "Active"
    val Updating = "Updating"
    val Deleting = "Deleting"

    val values = IndexedSeq(Creating, Active, Updating, Deleting)
  }

  object DocumentTypeEnum {
    val Command = "Command"
    val Policy = "Policy"
    val Automation = "Automation"
    val Session = "Session"

    val values = IndexedSeq(Command, Policy, Automation, Session)
  }

  /**
   * <p>Version information about the document.</p>
   */
  @js.native
  trait DocumentVersionInfo extends js.Object {
    var Name: js.UndefOr[DocumentName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var CreatedDate: js.UndefOr[DateTime]
    var IsDefaultVersion: js.UndefOr[Boolean]
    var DocumentVersion: js.UndefOr[DocumentVersion]
  }

  object DocumentVersionInfo {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      IsDefaultVersion: js.UndefOr[Boolean] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined): DocumentVersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "IsDefaultVersion" -> IsDefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentVersionInfo]
    }
  }

  /**
   * <p>The EffectivePatch structure defines metadata about a patch along with the approval state of the patch in a particular patch baseline. The approval state includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.</p>
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
   * <p>Describes a failed association.</p>
   */
  @js.native
  trait FailedCreateAssociation extends js.Object {
    var Entry: js.UndefOr[CreateAssociationBatchRequestEntry]
    var Message: js.UndefOr[BatchErrorMessage]
    var Fault: js.UndefOr[Fault]
  }

  object FailedCreateAssociation {
    def apply(
      Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined,
      Message: js.UndefOr[BatchErrorMessage] = js.undefined,
      Fault: js.UndefOr[Fault] = js.undefined): FailedCreateAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entry" -> Entry.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "Fault" -> Fault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateAssociation]
    }
  }

  /**
   * <p>Information about an Automation failure.</p>
   */
  @js.native
  trait FailureDetails extends js.Object {
    var FailureStage: js.UndefOr[String]
    var FailureType: js.UndefOr[String]
    var Details: js.UndefOr[AutomationParameterMap]
  }

  object FailureDetails {
    def apply(
      FailureStage: js.UndefOr[String] = js.undefined,
      FailureType: js.UndefOr[String] = js.undefined,
      Details: js.UndefOr[AutomationParameterMap] = js.undefined): FailureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailureStage" -> FailureStage.map { x => x.asInstanceOf[js.Any] },
        "FailureType" -> FailureType.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
  }

  object GetAutomationExecutionRequest {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined): GetAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var CommandId: js.UndefOr[CommandId]
    var InstanceId: js.UndefOr[InstanceId]
    var PluginName: js.UndefOr[CommandPluginName]
  }

  object GetCommandInvocationRequest {
    def apply(
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      PluginName: js.UndefOr[CommandPluginName] = js.undefined): GetCommandInvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "PluginName" -> PluginName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommandInvocationRequest]
    }
  }

  @js.native
  trait GetCommandInvocationResult extends js.Object {
    var StatusDetails: js.UndefOr[StatusDetails]
    var StandardErrorContent: js.UndefOr[StandardErrorContent]
    var StandardErrorUrl: js.UndefOr[Url]
    var ExecutionStartDateTime: js.UndefOr[StringDateTime]
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var ResponseCode: js.UndefOr[ResponseCode]
    var ExecutionEndDateTime: js.UndefOr[StringDateTime]
    var ExecutionElapsedTime: js.UndefOr[StringDateTime]
    var StandardOutputUrl: js.UndefOr[Url]
    var StandardOutputContent: js.UndefOr[StandardOutputContent]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var PluginName: js.UndefOr[CommandPluginName]
    var CommandId: js.UndefOr[CommandId]
    var InstanceId: js.UndefOr[InstanceId]
    var DocumentName: js.UndefOr[DocumentName]
    var Comment: js.UndefOr[Comment]
    var Status: js.UndefOr[CommandInvocationStatus]
  }

  object GetCommandInvocationResult {
    def apply(
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      StandardErrorContent: js.UndefOr[StandardErrorContent] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.undefined,
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
      ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.undefined,
      ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      StandardOutputContent: js.UndefOr[StandardOutputContent] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      PluginName: js.UndefOr[CommandPluginName] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      Status: js.UndefOr[CommandInvocationStatus] = js.undefined): GetCommandInvocationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorContent" -> StandardErrorContent.map { x => x.asInstanceOf[js.Any] },
        "StandardErrorUrl" -> StandardErrorUrl.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartDateTime" -> ExecutionStartDateTime.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndDateTime" -> ExecutionEndDateTime.map { x => x.asInstanceOf[js.Any] },
        "ExecutionElapsedTime" -> ExecutionElapsedTime.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputUrl" -> StandardOutputUrl.map { x => x.asInstanceOf[js.Any] },
        "StandardOutputContent" -> StandardOutputContent.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "PluginName" -> PluginName.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommandInvocationResult]
    }
  }

  @js.native
  trait GetConnectionStatusRequest extends js.Object {
    var Target: js.UndefOr[SessionTarget]
  }

  object GetConnectionStatusRequest {
    def apply(
      Target: js.UndefOr[SessionTarget] = js.undefined): GetConnectionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionStatusRequest]
    }
  }

  @js.native
  trait GetConnectionStatusResponse extends js.Object {
    var Target: js.UndefOr[SessionTarget]
    var Status: js.UndefOr[ConnectionStatus]
  }

  object GetConnectionStatusResponse {
    def apply(
      Target: js.UndefOr[SessionTarget] = js.undefined,
      Status: js.UndefOr[ConnectionStatus] = js.undefined): GetConnectionStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var InstanceId: js.UndefOr[InstanceId]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object GetDeployablePatchSnapshotForInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): GetDeployablePatchSnapshotForInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
    }
  }

  @js.native
  trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var SnapshotId: js.UndefOr[SnapshotId]
    var SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl]
    var Product: js.UndefOr[Product]
  }

  object GetDeployablePatchSnapshotForInstanceResult {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl] = js.undefined,
      Product: js.UndefOr[Product] = js.undefined): GetDeployablePatchSnapshotForInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotDownloadUrl" -> SnapshotDownloadUrl.map { x => x.asInstanceOf[js.Any] },
        "Product" -> Product.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
    }
  }

  @js.native
  trait GetDocumentRequest extends js.Object {
    var Name: js.UndefOr[DocumentARN]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var DocumentFormat: js.UndefOr[DocumentFormat]
  }

  object GetDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined): GetDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResult extends js.Object {
    var Content: js.UndefOr[DocumentContent]
    var Name: js.UndefOr[DocumentARN]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var DocumentType: js.UndefOr[DocumentType]
  }

  object GetDocumentResult {
    def apply(
      Content: js.UndefOr[DocumentContent] = js.undefined,
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined): GetDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentType" -> DocumentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentResult]
    }
  }

  @js.native
  trait GetInventoryRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var ResultAttributes: js.UndefOr[ResultAttributeList]
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Filters: js.UndefOr[InventoryFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInventoryRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined,
      Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
      Filters: js.UndefOr[InventoryFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResultAttributes" -> ResultAttributes.map { x => x.asInstanceOf[js.Any] },
        "Aggregators" -> Aggregators.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TypeName: js.UndefOr[InventoryItemTypeNameFilter]
    var MaxResults: js.UndefOr[GetInventorySchemaMaxResults]
    var Aggregator: js.UndefOr[AggregatorSchemaOnly]
    var SubType: js.UndefOr[IsSubTypeSchema]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInventorySchemaRequest {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.undefined,
      MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined,
      Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.undefined,
      SubType: js.UndefOr[IsSubTypeSchema] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInventorySchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Aggregator" -> Aggregator.map { x => x.asInstanceOf[js.Any] },
        "SubType" -> SubType.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventorySchemaRequest]
    }
  }

  @js.native
  trait GetInventorySchemaResult extends js.Object {
    var Schemas: js.UndefOr[InventoryItemSchemaResultList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInventorySchemaResult {
    def apply(
      Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInventorySchemaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Schemas" -> Schemas.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventorySchemaResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object GetMaintenanceWindowExecutionRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined): GetMaintenanceWindowExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionResult extends js.Object {
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList]
    var StartTime: js.UndefOr[DateTime]
    var EndTime: js.UndefOr[DateTime]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
  }

  object GetMaintenanceWindowExecutionResult {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined): GetMaintenanceWindowExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskIds" -> TaskIds.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId]
  }

  object GetMaintenanceWindowExecutionTaskInvocationRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined): GetMaintenanceWindowExecutionTaskInvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskId" -> TaskId.map { x => x.asInstanceOf[js.Any] },
        "InvocationId" -> InvocationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskInvocationResult extends js.Object {
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters]
    var StartTime: js.UndefOr[DateTime]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var EndTime: js.UndefOr[DateTime]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId]
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
  }

  object GetMaintenanceWindowExecutionTaskInvocationResult {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined,
      InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined): GetMaintenanceWindowExecutionTaskInvocationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] },
        "InvocationId" -> InvocationId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId]
  }

  object GetMaintenanceWindowExecutionTaskRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined): GetMaintenanceWindowExecutionTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskId" -> TaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var MaxErrors: js.UndefOr[MaxErrors]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ServiceRole: js.UndefOr[ServiceRole]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var StartTime: js.UndefOr[DateTime]
    var EndTime: js.UndefOr[DateTime]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var Type: js.UndefOr[MaintenanceWindowTaskType]
  }

  object GetMaintenanceWindowExecutionTaskResult {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined): GetMaintenanceWindowExecutionTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object GetMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined): GetMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowResult extends js.Object {
    var ModifiedDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var CreatedDate: js.UndefOr[DateTime]
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object GetMaintenanceWindowResult {
    def apply(
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): GetMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModifiedDate" -> ModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NextExecutionTime" -> NextExecutionTime.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowTaskRequest extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object GetMaintenanceWindowTaskRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): GetMaintenanceWindowTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowTaskRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowTaskResult extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var Targets: js.UndefOr[Targets]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object GetMaintenanceWindowTaskResult {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): GetMaintenanceWindowTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait GetParameterHistoryRequest extends js.Object {
    var Name: js.UndefOr[PSParameterName]
    var WithDecryption: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetParameterHistoryRequest {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetParameterHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterHistoryRequest]
    }
  }

  @js.native
  trait GetParameterHistoryResult extends js.Object {
    var Parameters: js.UndefOr[ParameterHistoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetParameterHistoryResult {
    def apply(
      Parameters: js.UndefOr[ParameterHistoryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetParameterHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterHistoryResult]
    }
  }

  @js.native
  trait GetParameterRequest extends js.Object {
    var Name: js.UndefOr[PSParameterName]
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParameterRequest {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
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
    var Path: js.UndefOr[PSParameterName]
    var MaxResults: js.UndefOr[GetParametersByPathMaxResults]
    var WithDecryption: js.UndefOr[Boolean]
    var Recursive: js.UndefOr[Boolean]
    var ParameterFilters: js.UndefOr[ParameterStringFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetParametersByPathRequest {
    def apply(
      Path: js.UndefOr[PSParameterName] = js.undefined,
      MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined,
      Recursive: js.UndefOr[Boolean] = js.undefined,
      ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetParametersByPathRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] },
        "Recursive" -> Recursive.map { x => x.asInstanceOf[js.Any] },
        "ParameterFilters" -> ParameterFilters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersByPathRequest]
    }
  }

  @js.native
  trait GetParametersByPathResult extends js.Object {
    var Parameters: js.UndefOr[ParameterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetParametersByPathResult {
    def apply(
      Parameters: js.UndefOr[ParameterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetParametersByPathResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersByPathResult]
    }
  }

  @js.native
  trait GetParametersRequest extends js.Object {
    var Names: js.UndefOr[ParameterNameList]
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParametersRequest {
    def apply(
      Names: js.UndefOr[ParameterNameList] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "WithDecryption" -> WithDecryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersRequest]
    }
  }

  @js.native
  trait GetParametersResult extends js.Object {
    var Parameters: js.UndefOr[ParameterList]
    var InvalidParameters: js.UndefOr[ParameterNameList]
  }

  object GetParametersResult {
    def apply(
      Parameters: js.UndefOr[ParameterList] = js.undefined,
      InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined): GetParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "InvalidParameters" -> InvalidParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersResult]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupRequest extends js.Object {
    var PatchGroup: js.UndefOr[PatchGroup]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetPatchBaselineForPatchGroupRequest {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): GetPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): GetPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait GetPatchBaselineRequest extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object GetPatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined): GetPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineRequest]
    }
  }

  @js.native
  trait GetPatchBaselineResult extends js.Object {
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var ModifiedDate: js.UndefOr[DateTime]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var Name: js.UndefOr[BaselineName]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var CreatedDate: js.UndefOr[DateTime]
    var Description: js.UndefOr[BaselineDescription]
    var BaselineId: js.UndefOr[BaselineId]
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var Sources: js.UndefOr[PatchSourceList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var PatchGroups: js.UndefOr[PatchGroupList]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
  }

  object GetPatchBaselineResult {
    def apply(
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      PatchGroups: js.UndefOr[PatchGroupList] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined): GetPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "ModifiedDate" -> ModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "PatchGroups" -> PatchGroups.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineResult]
    }
  }

  /**
   * <p>Status information about the aggregated associations.</p>
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
   * <p>One or more association documents on the instance. </p>
   */
  @js.native
  trait InstanceAssociation extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var InstanceId: js.UndefOr[InstanceId]
    var Content: js.UndefOr[DocumentContent]
    var AssociationVersion: js.UndefOr[AssociationVersion]
  }

  object InstanceAssociation {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined): InstanceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociation]
    }
  }

  /**
   * <p>An Amazon S3 bucket where you want to store the results of this request.</p>
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
   * <p>The URL of Amazon S3 bucket where you want to store the results of this request.</p>
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
   * <p>Status information about the instance association.</p>
   */
  @js.native
  trait InstanceAssociationStatusInfo extends js.Object {
    var Name: js.UndefOr[DocumentName]
    var DetailedStatus: js.UndefOr[StatusName]
    var ExecutionDate: js.UndefOr[DateTime]
    var ErrorCode: js.UndefOr[AgentErrorCode]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var InstanceId: js.UndefOr[InstanceId]
    var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl]
    var AssociationId: js.UndefOr[AssociationId]
    var Status: js.UndefOr[StatusName]
  }

  object InstanceAssociationStatusInfo {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      ExecutionDate: js.UndefOr[DateTime] = js.undefined,
      ErrorCode: js.UndefOr[AgentErrorCode] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined): InstanceAssociationStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DetailedStatus" -> DetailedStatus.map { x => x.asInstanceOf[js.Any] },
        "ExecutionDate" -> ExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "OutputUrl" -> OutputUrl.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationStatusInfo]
    }
  }

  /**
   * <p>Describes a filter for a specific list of instances. </p>
   */
  @js.native
  trait InstanceInformation extends js.Object {
    var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview]
    var IPAddress: js.UndefOr[IPAddress]
    var Name: js.UndefOr[String]
    var AssociationStatus: js.UndefOr[StatusName]
    var PlatformVersion: js.UndefOr[String]
    var PingStatus: js.UndefOr[PingStatus]
    var PlatformType: js.UndefOr[PlatformType]
    var LastPingDateTime: js.UndefOr[DateTime]
    var LastAssociationExecutionDate: js.UndefOr[DateTime]
    var ResourceType: js.UndefOr[ResourceType]
    var ComputerName: js.UndefOr[ComputerName]
    var IsLatestVersion: js.UndefOr[Boolean]
    var AgentVersion: js.UndefOr[Version]
    var ActivationId: js.UndefOr[ActivationId]
    var InstanceId: js.UndefOr[InstanceId]
    var RegistrationDate: js.UndefOr[DateTime]
    var IamRole: js.UndefOr[IamRole]
    var LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime]
    var PlatformName: js.UndefOr[String]
  }

  object InstanceInformation {
    def apply(
      AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.undefined,
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AssociationStatus: js.UndefOr[StatusName] = js.undefined,
      PlatformVersion: js.UndefOr[String] = js.undefined,
      PingStatus: js.UndefOr[PingStatus] = js.undefined,
      PlatformType: js.UndefOr[PlatformType] = js.undefined,
      LastPingDateTime: js.UndefOr[DateTime] = js.undefined,
      LastAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      ComputerName: js.UndefOr[ComputerName] = js.undefined,
      IsLatestVersion: js.UndefOr[Boolean] = js.undefined,
      AgentVersion: js.UndefOr[Version] = js.undefined,
      ActivationId: js.UndefOr[ActivationId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      RegistrationDate: js.UndefOr[DateTime] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined,
      LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined,
      PlatformName: js.UndefOr[String] = js.undefined): InstanceInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationOverview" -> AssociationOverview.map { x => x.asInstanceOf[js.Any] },
        "IPAddress" -> IPAddress.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AssociationStatus" -> AssociationStatus.map { x => x.asInstanceOf[js.Any] },
        "PlatformVersion" -> PlatformVersion.map { x => x.asInstanceOf[js.Any] },
        "PingStatus" -> PingStatus.map { x => x.asInstanceOf[js.Any] },
        "PlatformType" -> PlatformType.map { x => x.asInstanceOf[js.Any] },
        "LastPingDateTime" -> LastPingDateTime.map { x => x.asInstanceOf[js.Any] },
        "LastAssociationExecutionDate" -> LastAssociationExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ComputerName" -> ComputerName.map { x => x.asInstanceOf[js.Any] },
        "IsLatestVersion" -> IsLatestVersion.map { x => x.asInstanceOf[js.Any] },
        "AgentVersion" -> AgentVersion.map { x => x.asInstanceOf[js.Any] },
        "ActivationId" -> ActivationId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "RegistrationDate" -> RegistrationDate.map { x => x.asInstanceOf[js.Any] },
        "IamRole" -> IamRole.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulAssociationExecutionDate" -> LastSuccessfulAssociationExecutionDate.map { x => x.asInstanceOf[js.Any] },
        "PlatformName" -> PlatformName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformation]
    }
  }

  /**
   * <p>Describes a filter for a specific list of instances. You can filter instances information by using tags. You specify tags by using a key-value mapping.</p> <p>Use this action instead of the <a>DescribeInstanceInformationRequest$InstanceInformationFilterList</a> method. The <code>InstanceInformationFilterList</code> method is a legacy method and does not support tags. </p>
   */
  @js.native
  trait InstanceInformationFilter extends js.Object {
    var key: js.UndefOr[InstanceInformationFilterKey]
    var valueSet: js.UndefOr[InstanceInformationFilterValueSet]
  }

  object InstanceInformationFilter {
    def apply(
      key: js.UndefOr[InstanceInformationFilterKey] = js.undefined,
      valueSet: js.UndefOr[InstanceInformationFilterValueSet] = js.undefined): InstanceInformationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "valueSet" -> valueSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The filters to describe or get information about your managed instances.</p>
   */
  @js.native
  trait InstanceInformationStringFilter extends js.Object {
    var Key: js.UndefOr[InstanceInformationStringFilterKey]
    var Values: js.UndefOr[InstanceInformationFilterValueSet]
  }

  object InstanceInformationStringFilter {
    def apply(
      Key: js.UndefOr[InstanceInformationStringFilterKey] = js.undefined,
      Values: js.UndefOr[InstanceInformationFilterValueSet] = js.undefined): InstanceInformationStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformationStringFilter]
    }
  }

  /**
   * <p>Defines the high-level patch compliance state for a managed instance, providing information about the number of installed, missing, not applicable, and failed patches along with metadata about the operation when this information was gathered for the instance.</p>
   */
  @js.native
  trait InstancePatchState extends js.Object {
    var InstalledCount: js.UndefOr[PatchInstalledCount]
    var PatchGroup: js.UndefOr[PatchGroup]
    var SnapshotId: js.UndefOr[SnapshotId]
    var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount]
    var BaselineId: js.UndefOr[BaselineId]
    var FailedCount: js.UndefOr[PatchFailedCount]
    var NotApplicableCount: js.UndefOr[PatchNotApplicableCount]
    var Operation: js.UndefOr[PatchOperationType]
    var OperationStartTime: js.UndefOr[DateTime]
    var InstallOverrideList: js.UndefOr[InstallOverrideList]
    var InstanceId: js.UndefOr[InstanceId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var OperationEndTime: js.UndefOr[DateTime]
    var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount]
    var MissingCount: js.UndefOr[PatchMissingCount]
  }

  object InstancePatchState {
    def apply(
      InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      FailedCount: js.UndefOr[PatchFailedCount] = js.undefined,
      NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined,
      Operation: js.UndefOr[PatchOperationType] = js.undefined,
      OperationStartTime: js.UndefOr[DateTime] = js.undefined,
      InstallOverrideList: js.UndefOr[InstallOverrideList] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      OperationEndTime: js.UndefOr[DateTime] = js.undefined,
      InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined,
      MissingCount: js.UndefOr[PatchMissingCount] = js.undefined): InstancePatchState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstalledCount" -> InstalledCount.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "InstalledRejectedCount" -> InstalledRejectedCount.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "FailedCount" -> FailedCount.map { x => x.asInstanceOf[js.Any] },
        "NotApplicableCount" -> NotApplicableCount.map { x => x.asInstanceOf[js.Any] },
        "Operation" -> Operation.map { x => x.asInstanceOf[js.Any] },
        "OperationStartTime" -> OperationStartTime.map { x => x.asInstanceOf[js.Any] },
        "InstallOverrideList" -> InstallOverrideList.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "OperationEndTime" -> OperationEndTime.map { x => x.asInstanceOf[js.Any] },
        "InstalledOtherCount" -> InstalledOtherCount.map { x => x.asInstanceOf[js.Any] },
        "MissingCount" -> MissingCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePatchState]
    }
  }

  /**
   * <p>Defines a filter used in DescribeInstancePatchStatesForPatchGroup used to scope down the information returned by the API.</p>
   */
  @js.native
  trait InstancePatchStateFilter extends js.Object {
    var Key: js.UndefOr[InstancePatchStateFilterKey]
    var Values: js.UndefOr[InstancePatchStateFilterValues]
    var Type: js.UndefOr[InstancePatchStateOperatorType]
  }

  object InstancePatchStateFilter {
    def apply(
      Key: js.UndefOr[InstancePatchStateFilterKey] = js.undefined,
      Values: js.UndefOr[InstancePatchStateFilterValues] = js.undefined,
      Type: js.UndefOr[InstancePatchStateOperatorType] = js.undefined): InstancePatchStateFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Specifies the inventory type and attribute for the aggregation execution.</p>
   */
  @js.native
  trait InventoryAggregator extends js.Object {
    var Expression: js.UndefOr[InventoryAggregatorExpression]
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Groups: js.UndefOr[InventoryGroupList]
  }

  object InventoryAggregator {
    def apply(
      Expression: js.UndefOr[InventoryAggregatorExpression] = js.undefined,
      Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
      Groups: js.UndefOr[InventoryGroupList] = js.undefined): InventoryAggregator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Expression" -> Expression.map { x => x.asInstanceOf[js.Any] },
        "Aggregators" -> Aggregators.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Status information returned by the <code>DeleteInventory</code> action.</p>
   */
  @js.native
  trait InventoryDeletionStatusItem extends js.Object {
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var LastStatus: js.UndefOr[InventoryDeletionStatus]
    var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime]
    var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime]
    var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage]
  }

  object InventoryDeletionStatusItem {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined,
      DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined,
      LastStatus: js.UndefOr[InventoryDeletionStatus] = js.undefined,
      LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.undefined,
      DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.undefined,
      LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.undefined): InventoryDeletionStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "DeletionSummary" -> DeletionSummary.map { x => x.asInstanceOf[js.Any] },
        "DeletionId" -> DeletionId.map { x => x.asInstanceOf[js.Any] },
        "LastStatus" -> LastStatus.map { x => x.asInstanceOf[js.Any] },
        "LastStatusUpdateTime" -> LastStatusUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "DeletionStartTime" -> DeletionStartTime.map { x => x.asInstanceOf[js.Any] },
        "LastStatusMessage" -> LastStatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDeletionStatusItem]
    }
  }

  /**
   * <p>Information about the delete operation.</p>
   */
  @js.native
  trait InventoryDeletionSummary extends js.Object {
    var TotalCount: js.UndefOr[TotalCount]
    var RemainingCount: js.UndefOr[RemainingCount]
    var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems]
  }

  object InventoryDeletionSummary {
    def apply(
      TotalCount: js.UndefOr[TotalCount] = js.undefined,
      RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
      SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.undefined): InventoryDeletionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] },
        "RemainingCount" -> RemainingCount.map { x => x.asInstanceOf[js.Any] },
        "SummaryItems" -> SummaryItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDeletionSummary]
    }
  }

  /**
   * <p>Either a count, remaining count, or a version number in a delete inventory summary.</p>
   */
  @js.native
  trait InventoryDeletionSummaryItem extends js.Object {
    var Version: js.UndefOr[InventoryItemSchemaVersion]
    var Count: js.UndefOr[ResourceCount]
    var RemainingCount: js.UndefOr[RemainingCount]
  }

  object InventoryDeletionSummaryItem {
    def apply(
      Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      Count: js.UndefOr[ResourceCount] = js.undefined,
      RemainingCount: js.UndefOr[RemainingCount] = js.undefined): InventoryDeletionSummaryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "RemainingCount" -> RemainingCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDeletionSummaryItem]
    }
  }

  /**
   * <p>One or more filters. Use a filter to return a more specific list of results.</p>
   */
  @js.native
  trait InventoryFilter extends js.Object {
    var Key: js.UndefOr[InventoryFilterKey]
    var Values: js.UndefOr[InventoryFilterValueList]
    var Type: js.UndefOr[InventoryQueryOperatorType]
  }

  object InventoryFilter {
    def apply(
      Key: js.UndefOr[InventoryFilterKey] = js.undefined,
      Values: js.UndefOr[InventoryFilterValueList] = js.undefined,
      Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined): InventoryFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryFilter]
    }
  }

  /**
   * <p>A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.</p>
   */
  @js.native
  trait InventoryGroup extends js.Object {
    var Name: js.UndefOr[InventoryGroupName]
    var Filters: js.UndefOr[InventoryFilterList]
  }

  object InventoryGroup {
    def apply(
      Name: js.UndefOr[InventoryGroupName] = js.undefined,
      Filters: js.UndefOr[InventoryFilterList] = js.undefined): InventoryGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryGroup]
    }
  }

  /**
   * <p>Information collected from managed instances based on your inventory policy document</p>
   */
  @js.native
  trait InventoryItem extends js.Object {
    var Content: js.UndefOr[InventoryItemEntryList]
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var ContentHash: js.UndefOr[InventoryItemContentHash]
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion]
    var Context: js.UndefOr[InventoryItemContentContext]
  }

  object InventoryItem {
    def apply(
      Content: js.UndefOr[InventoryItemEntryList] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      Context: js.UndefOr[InventoryItemContentContext] = js.undefined): InventoryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "ContentHash" -> ContentHash.map { x => x.asInstanceOf[js.Any] },
        "CaptureTime" -> CaptureTime.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "Context" -> Context.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItem]
    }
  }

  /**
   * <p>Attributes are the entries within the inventory item content. It contains name and value.</p>
   */
  @js.native
  trait InventoryItemAttribute extends js.Object {
    var Name: js.UndefOr[InventoryItemAttributeName]
    var DataType: js.UndefOr[InventoryAttributeDataType]
  }

  object InventoryItemAttribute {
    def apply(
      Name: js.UndefOr[InventoryItemAttributeName] = js.undefined,
      DataType: js.UndefOr[InventoryAttributeDataType] = js.undefined): InventoryItemAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItemAttribute]
    }
  }

  /**
   * <p>The inventory item schema definition. Users can use this to compose inventory query filters.</p>
   */
  @js.native
  trait InventoryItemSchema extends js.Object {
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
    var Attributes: js.UndefOr[InventoryItemAttributeList]
    var DisplayName: js.UndefOr[InventoryTypeDisplayName]
  }

  object InventoryItemSchema {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      Attributes: js.UndefOr[InventoryItemAttributeList] = js.undefined,
      DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.undefined): InventoryItemSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Inventory query results.</p>
   */
  @js.native
  trait InventoryResultEntity extends js.Object {
    var Id: js.UndefOr[InventoryResultEntityId]
    var Data: js.UndefOr[InventoryResultItemMap]
  }

  object InventoryResultEntity {
    def apply(
      Id: js.UndefOr[InventoryResultEntityId] = js.undefined,
      Data: js.UndefOr[InventoryResultItemMap] = js.undefined): InventoryResultEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryResultEntity]
    }
  }

  /**
   * <p>The inventory result item.</p>
   */
  @js.native
  trait InventoryResultItem extends js.Object {
    var Content: js.UndefOr[InventoryItemEntryList]
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var ContentHash: js.UndefOr[InventoryItemContentHash]
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion]
  }

  object InventoryResultItem {
    def apply(
      Content: js.UndefOr[InventoryItemEntryList] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined): InventoryResultItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "ContentHash" -> ContentHash.map { x => x.asInstanceOf[js.Any] },
        "CaptureTime" -> CaptureTime.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[PSParameterName]
    var ParameterVersion: js.UndefOr[PSParameterVersion]
    var Labels: js.UndefOr[ParameterLabelList]
  }

  object LabelParameterVersionRequest {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined,
      Labels: js.UndefOr[ParameterLabelList] = js.undefined): LabelParameterVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ParameterVersion" -> ParameterVersion.map { x => x.asInstanceOf[js.Any] },
        "Labels" -> Labels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AssociationId: js.UndefOr[AssociationId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationVersionsRequest {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAssociationVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
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
    var MaxResults: js.UndefOr[CommandMaxResults]
    var Details: js.UndefOr[Boolean]
    var CommandId: js.UndefOr[CommandId]
    var InstanceId: js.UndefOr[InstanceId]
    var Filters: js.UndefOr[CommandFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandInvocationsRequest {
    def apply(
      MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
      Details: js.UndefOr[Boolean] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[CommandFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCommandInvocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
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
    var MaxResults: js.UndefOr[CommandMaxResults]
    var CommandId: js.UndefOr[CommandId]
    var InstanceId: js.UndefOr[InstanceId]
    var Filters: js.UndefOr[CommandFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandsRequest {
    def apply(
      MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[CommandFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCommandsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "CommandId" -> CommandId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
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
    var MaxResults: js.UndefOr[MaxResults]
    var ResourceIds: js.UndefOr[ComplianceResourceIdList]
    var ResourceTypes: js.UndefOr[ComplianceResourceTypeList]
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceItemsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined,
      ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.undefined,
      Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListComplianceItemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListComplianceSummariesRequest {
    def apply(
      Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListComplianceSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[DocumentName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentVersionsRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDocumentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
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
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var MaxResults: js.UndefOr[MaxResults]
    var InstanceId: js.UndefOr[InstanceId]
    var Filters: js.UndefOr[InventoryFilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInventoryEntriesRequest {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[InventoryFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListInventoryEntriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInventoryEntriesRequest]
    }
  }

  @js.native
  trait ListInventoryEntriesResult extends js.Object {
    var Entries: js.UndefOr[InventoryItemEntryList]
    var TypeName: js.UndefOr[InventoryItemTypeName]
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInventoryEntriesResult {
    def apply(
      Entries: js.UndefOr[InventoryItemEntryList] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListInventoryEntriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "CaptureTime" -> CaptureTime.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInventoryEntriesResult]
    }
  }

  @js.native
  trait ListResourceComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListResourceComplianceSummariesRequest {
    def apply(
      Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListResourceComplianceSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceComplianceSummariesRequest]
    }
  }

  @js.native
  trait ListResourceComplianceSummariesResult extends js.Object {
    var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceComplianceSummariesResult {
    def apply(
      ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResourceComplianceSummariesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceComplianceSummaryItems" -> ResourceComplianceSummaryItems.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceComplianceSummariesResult]
    }
  }

  @js.native
  trait ListResourceDataSyncRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListResourceDataSyncRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListResourceDataSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDataSyncRequest]
    }
  }

  @js.native
  trait ListResourceDataSyncResult extends js.Object {
    var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceDataSyncResult {
    def apply(
      ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResourceDataSyncResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceDataSyncItems" -> ResourceDataSyncItems.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDataSyncResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceType: js.UndefOr[ResourceTypeForTagging]
    var ResourceId: js.UndefOr[ResourceId]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceTypeForTagging] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about an Amazon S3 bucket to write instance-level logs to.</p> <note> <p> <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> </note>
   */
  @js.native
  trait LoggingInfo extends js.Object {
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var S3Region: js.UndefOr[S3Region]
  }

  object LoggingInfo {
    def apply(
      S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      S3Region: js.UndefOr[S3Region] = js.undefined): LoggingInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "S3Region" -> S3Region.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingInfo]
    }
  }

  /**
   * <p>The parameters for an AUTOMATION task type.</p>
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
   * <p>Describes the information about an execution of a Maintenance Window. </p>
   */
  @js.native
  trait MaintenanceWindowExecution extends js.Object {
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var StartTime: js.UndefOr[DateTime]
    var EndTime: js.UndefOr[DateTime]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
  }

  object MaintenanceWindowExecution {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined): MaintenanceWindowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about a task execution performed as part of a Maintenance Window execution.</p>
   */
  @js.native
  trait MaintenanceWindowExecutionTaskIdentity extends js.Object {
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var StartTime: js.UndefOr[DateTime]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var EndTime: js.UndefOr[DateTime]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
  }

  object MaintenanceWindowExecutionTaskIdentity {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined): MaintenanceWindowExecutionTaskIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
    }
  }

  /**
   * <p>Describes the information about a task invocation for a particular target as part of a task execution performed as part of a Maintenance Window execution.</p>
   */
  @js.native
  trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters]
    var StartTime: js.UndefOr[DateTime]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var EndTime: js.UndefOr[DateTime]
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId]
    var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId]
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
  }

  object MaintenanceWindowExecutionTaskInvocationIdentity {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined,
      InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined): MaintenanceWindowExecutionTaskInvocationIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionId" -> TaskExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ExecutionId" -> ExecutionId.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] },
        "InvocationId" -> InvocationId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "WindowExecutionId" -> WindowExecutionId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
    }
  }

  /**
   * <p>Filter used in the request. Supported filter keys are Name and Enabled.</p>
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
   * <p>Information about the Maintenance Window.</p>
   */
  @js.native
  trait MaintenanceWindowIdentity extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object MaintenanceWindowIdentity {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): MaintenanceWindowIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NextExecutionTime" -> NextExecutionTime.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowIdentity]
    }
  }

  /**
   * <p>The Maintenance Window to which the specified target belongs.</p>
   */
  @js.native
  trait MaintenanceWindowIdentityForTarget extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Name: js.UndefOr[MaintenanceWindowName]
  }

  object MaintenanceWindowIdentityForTarget {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined): MaintenanceWindowIdentityForTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowIdentityForTarget]
    }
  }

  /**
   * <p>The parameters for a LAMBDA task type.</p> <p>For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.</p> <note> <p> <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> <p> <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> <p>For Lambda tasks, Systems Manager ignores any values specified for TaskParameters and LoggingInfo.</p> </note>
   */
  @js.native
  trait MaintenanceWindowLambdaParameters extends js.Object {
    var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext]
    var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier]
    var Payload: js.UndefOr[MaintenanceWindowLambdaPayload]
  }

  object MaintenanceWindowLambdaParameters {
    def apply(
      ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.undefined,
      Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.undefined,
      Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.undefined): MaintenanceWindowLambdaParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientContext" -> ClientContext.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] },
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowLambdaParameters]
    }
  }

  object MaintenanceWindowResourceTypeEnum {
    val INSTANCE = "INSTANCE"

    val values = IndexedSeq(INSTANCE)
  }

  /**
   * <p>The parameters for a RUN_COMMAND task type.</p> <p>For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.</p> <note> <p> <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> <p> <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> <p>For Run Command tasks, Systems Manager uses specified values for <code>TaskParameters</code> and <code>LoggingInfo</code> only if no values are specified for <code>TaskInvocationParameters</code>. </p> </note>
   */
  @js.native
  trait MaintenanceWindowRunCommandParameters extends js.Object {
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var Parameters: js.UndefOr[Parameters]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var Comment: js.UndefOr[Comment]
    var DocumentHash: js.UndefOr[DocumentHash]
    var DocumentHashType: js.UndefOr[DocumentHashType]
  }

  object MaintenanceWindowRunCommandParameters {
    def apply(
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentHash: js.UndefOr[DocumentHash] = js.undefined,
      DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined): MaintenanceWindowRunCommandParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TimeoutSeconds" -> TimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "DocumentHash" -> DocumentHash.map { x => x.asInstanceOf[js.Any] },
        "DocumentHashType" -> DocumentHashType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowRunCommandParameters]
    }
  }

  /**
   * <p>The parameters for a STEP_FUNCTION task.</p> <p>For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.</p> <note> <p> <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> <p> <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.</p> <p>For Step Functions tasks, Systems Manager ignores any values specified for <code>TaskParameters</code> and <code>LoggingInfo</code>.</p> </note>
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
   * <p>The target registered with the Maintenance Window.</p>
   */
  @js.native
  trait MaintenanceWindowTarget extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Targets: js.UndefOr[Targets]
  }

  object MaintenanceWindowTarget {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): MaintenanceWindowTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTarget]
    }
  }

  /**
   * <p>Information about a task defined for a Maintenance Window.</p>
   */
  @js.native
  trait MaintenanceWindowTask extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var Targets: js.UndefOr[Targets]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
    var Type: js.UndefOr[MaintenanceWindowTaskType]
  }

  object MaintenanceWindowTask {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined,
      Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined): MaintenanceWindowTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTask]
    }
  }

  /**
   * <p>The parameters for task execution.</p>
   */
  @js.native
  trait MaintenanceWindowTaskInvocationParameters extends js.Object {
    var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters]
    var Automation: js.UndefOr[MaintenanceWindowAutomationParameters]
    var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters]
    var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters]
  }

  object MaintenanceWindowTaskInvocationParameters {
    def apply(
      RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.undefined,
      Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.undefined,
      StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.undefined,
      Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.undefined): MaintenanceWindowTaskInvocationParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RunCommand" -> RunCommand.map { x => x.asInstanceOf[js.Any] },
        "Automation" -> Automation.map { x => x.asInstanceOf[js.Any] },
        "StepFunctions" -> StepFunctions.map { x => x.asInstanceOf[js.Any] },
        "Lambda" -> Lambda.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTaskInvocationParameters]
    }
  }

  /**
   * <p>Defines the values for a task parameter.</p>
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
    var Name: js.UndefOr[DocumentName]
    var PermissionType: js.UndefOr[DocumentPermissionType]
    var AccountIdsToAdd: js.UndefOr[AccountIdList]
    var AccountIdsToRemove: js.UndefOr[AccountIdList]
  }

  object ModifyDocumentPermissionRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      PermissionType: js.UndefOr[DocumentPermissionType] = js.undefined,
      AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined,
      AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined): ModifyDocumentPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PermissionType" -> PermissionType.map { x => x.asInstanceOf[js.Any] },
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
   * <p>A summary of resources that are not compliant. The summary is organized according to resource type.</p>
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
   * <p>Configurations for sending notifications.</p>
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
   * <p>Information about the source where the association execution details are stored.</p>
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
   * <p>An Amazon EC2 Systems Manager parameter in Parameter Store.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var ARN: js.UndefOr[String]
    var Name: js.UndefOr[PSParameterName]
    var LastModifiedDate: js.UndefOr[DateTime]
    var Version: js.UndefOr[PSParameterVersion]
    var Value: js.UndefOr[PSParameterValue]
    var Selector: js.UndefOr[PSParameterSelector]
    var SourceResult: js.UndefOr[String]
    var Type: js.UndefOr[ParameterType]
  }

  object Parameter {
    def apply(
      ARN: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[PSParameterName] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Version: js.UndefOr[PSParameterVersion] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      Selector: js.UndefOr[PSParameterSelector] = js.undefined,
      SourceResult: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Selector" -> Selector.map { x => x.asInstanceOf[js.Any] },
        "SourceResult" -> SourceResult.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>Information about parameter usage.</p>
   */
  @js.native
  trait ParameterHistory extends js.Object {
    var Name: js.UndefOr[PSParameterName]
    var LastModifiedDate: js.UndefOr[DateTime]
    var Version: js.UndefOr[PSParameterVersion]
    var Description: js.UndefOr[ParameterDescription]
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var Value: js.UndefOr[PSParameterValue]
    var KeyId: js.UndefOr[ParameterKeyId]
    var LastModifiedUser: js.UndefOr[String]
    var Labels: js.UndefOr[ParameterLabelList]
    var Type: js.UndefOr[ParameterType]
  }

  object ParameterHistory {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Version: js.UndefOr[PSParameterVersion] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      LastModifiedUser: js.UndefOr[String] = js.undefined,
      Labels: js.UndefOr[ParameterLabelList] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined): ParameterHistory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AllowedPattern" -> AllowedPattern.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedUser" -> LastModifiedUser.map { x => x.asInstanceOf[js.Any] },
        "Labels" -> Labels.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterHistory]
    }
  }

  /**
   * <p>Metada includes information like the ARN of the last user and the date/time the parameter was last used.</p>
   */
  @js.native
  trait ParameterMetadata extends js.Object {
    var Name: js.UndefOr[PSParameterName]
    var LastModifiedDate: js.UndefOr[DateTime]
    var Version: js.UndefOr[PSParameterVersion]
    var Description: js.UndefOr[ParameterDescription]
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var KeyId: js.UndefOr[ParameterKeyId]
    var LastModifiedUser: js.UndefOr[String]
    var Type: js.UndefOr[ParameterType]
  }

  object ParameterMetadata {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Version: js.UndefOr[PSParameterVersion] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      LastModifiedUser: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined): ParameterMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AllowedPattern" -> AllowedPattern.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedUser" -> LastModifiedUser.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterMetadata]
    }
  }

  /**
   * <p>One or more filters. Use a filter to return a more specific list of results.</p> <note> <p>The <code>Name</code> field can't be used with the <a>GetParametersByPath</a> API action.</p> </note>
   */
  @js.native
  trait ParameterStringFilter extends js.Object {
    var Key: js.UndefOr[ParameterStringFilterKey]
    var Option: js.UndefOr[ParameterStringQueryOption]
    var Values: js.UndefOr[ParameterStringFilterValueList]
  }

  object ParameterStringFilter {
    def apply(
      Key: js.UndefOr[ParameterStringFilterKey] = js.undefined,
      Option: js.UndefOr[ParameterStringQueryOption] = js.undefined,
      Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined): ParameterStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
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
   * <p>This data type is deprecated. Instead, use <a>ParameterStringFilter</a>.</p>
   */
  @js.native
  trait ParametersFilter extends js.Object {
    var Key: js.UndefOr[ParametersFilterKey]
    var Values: js.UndefOr[ParametersFilterValueList]
  }

  object ParametersFilter {
    def apply(
      Key: js.UndefOr[ParametersFilterKey] = js.undefined,
      Values: js.UndefOr[ParametersFilterValueList] = js.undefined): ParametersFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents metadata about a patch.</p>
   */
  @js.native
  trait Patch extends js.Object {
    var Id: js.UndefOr[PatchId]
    var Classification: js.UndefOr[PatchClassification]
    var Title: js.UndefOr[PatchTitle]
    var ReleaseDate: js.UndefOr[DateTime]
    var KbNumber: js.UndefOr[PatchKbNumber]
    var Description: js.UndefOr[PatchDescription]
    var ContentUrl: js.UndefOr[PatchContentUrl]
    var MsrcSeverity: js.UndefOr[PatchMsrcSeverity]
    var Vendor: js.UndefOr[PatchVendor]
    var MsrcNumber: js.UndefOr[PatchMsrcNumber]
    var Language: js.UndefOr[PatchLanguage]
    var ProductFamily: js.UndefOr[PatchProductFamily]
    var Product: js.UndefOr[PatchProduct]
  }

  object Patch {
    def apply(
      Id: js.UndefOr[PatchId] = js.undefined,
      Classification: js.UndefOr[PatchClassification] = js.undefined,
      Title: js.UndefOr[PatchTitle] = js.undefined,
      ReleaseDate: js.UndefOr[DateTime] = js.undefined,
      KbNumber: js.UndefOr[PatchKbNumber] = js.undefined,
      Description: js.UndefOr[PatchDescription] = js.undefined,
      ContentUrl: js.UndefOr[PatchContentUrl] = js.undefined,
      MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.undefined,
      Vendor: js.UndefOr[PatchVendor] = js.undefined,
      MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.undefined,
      Language: js.UndefOr[PatchLanguage] = js.undefined,
      ProductFamily: js.UndefOr[PatchProductFamily] = js.undefined,
      Product: js.UndefOr[PatchProduct] = js.undefined): Patch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Classification" -> Classification.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "ReleaseDate" -> ReleaseDate.map { x => x.asInstanceOf[js.Any] },
        "KbNumber" -> KbNumber.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ContentUrl" -> ContentUrl.map { x => x.asInstanceOf[js.Any] },
        "MsrcSeverity" -> MsrcSeverity.map { x => x.asInstanceOf[js.Any] },
        "Vendor" -> Vendor.map { x => x.asInstanceOf[js.Any] },
        "MsrcNumber" -> MsrcNumber.map { x => x.asInstanceOf[js.Any] },
        "Language" -> Language.map { x => x.asInstanceOf[js.Any] },
        "ProductFamily" -> ProductFamily.map { x => x.asInstanceOf[js.Any] },
        "Product" -> Product.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Patch]
    }
  }

  object PatchActionEnum {
    val ALLOW_AS_DEPENDENCY = "ALLOW_AS_DEPENDENCY"
    val BLOCK = "BLOCK"

    val values = IndexedSeq(ALLOW_AS_DEPENDENCY, BLOCK)
  }

  /**
   * <p>Defines the basic information about a patch baseline.</p>
   */
  @js.native
  trait PatchBaselineIdentity extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var BaselineId: js.UndefOr[BaselineId]
    var BaselineName: js.UndefOr[BaselineName]
    var BaselineDescription: js.UndefOr[BaselineDescription]
    var DefaultBaseline: js.UndefOr[DefaultBaseline]
  }

  object PatchBaselineIdentity {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      BaselineName: js.UndefOr[BaselineName] = js.undefined,
      BaselineDescription: js.UndefOr[BaselineDescription] = js.undefined,
      DefaultBaseline: js.UndefOr[DefaultBaseline] = js.undefined): PatchBaselineIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "BaselineName" -> BaselineName.map { x => x.asInstanceOf[js.Any] },
        "BaselineDescription" -> BaselineDescription.map { x => x.asInstanceOf[js.Any] },
        "DefaultBaseline" -> DefaultBaseline.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchBaselineIdentity]
    }
  }

  /**
   * <p>Information about the state of a patch on a particular instance as it relates to the patch baseline used to patch the instance.</p>
   */
  @js.native
  trait PatchComplianceData extends js.Object {
    var Classification: js.UndefOr[PatchClassification]
    var Title: js.UndefOr[PatchTitle]
    var KBId: js.UndefOr[PatchKbNumber]
    var InstalledTime: js.UndefOr[DateTime]
    var State: js.UndefOr[PatchComplianceDataState]
    var Severity: js.UndefOr[PatchSeverity]
  }

  object PatchComplianceData {
    def apply(
      Classification: js.UndefOr[PatchClassification] = js.undefined,
      Title: js.UndefOr[PatchTitle] = js.undefined,
      KBId: js.UndefOr[PatchKbNumber] = js.undefined,
      InstalledTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[PatchComplianceDataState] = js.undefined,
      Severity: js.UndefOr[PatchSeverity] = js.undefined): PatchComplianceData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "KBId" -> KBId.map { x => x.asInstanceOf[js.Any] },
        "InstalledTime" -> InstalledTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Defines a patch filter.</p> <p>A patch filter consists of key/value pairs, but not all keys are valid for all operating system types. For example, the key <code>PRODUCT</code> is valid for all supported operating system types. The key <code>MSRC_SEVERITY</code>, however, is valid only for Windows operating systems, and the key <code>SECTION</code> is valid only for Ubuntu operating systems.</p> <p>Refer to the following sections for information about which keys may be used with each major operating system, and which values are valid for each key.</p> <p> <b>Windows Operating Systems</b> </p> <p>The supported keys for Windows operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>MSRC_SEVERITY</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Windows7</code> </p> </li> <li> <p> <code>Windows8</code> </p> </li> <li> <p> <code>Windows8.1</code> </p> </li> <li> <p> <code>Windows8Embedded</code> </p> </li> <li> <p> <code>Windows10</code> </p> </li> <li> <p> <code>Windows10LTSB</code> </p> </li> <li> <p> <code>WindowsServer2008</code> </p> </li> <li> <p> <code>WindowsServer2008R2</code> </p> </li> <li> <p> <code>WindowsServer2012</code> </p> </li> <li> <p> <code>WindowsServer2012R2</code> </p> </li> <li> <p> <code>WindowsServer2016</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>CLASSIFICATION</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>CriticalUpdates</code> </p> </li> <li> <p> <code>DefinitionUpdates</code> </p> </li> <li> <p> <code>Drivers</code> </p> </li> <li> <p> <code>FeaturePacks</code> </p> </li> <li> <p> <code>SecurityUpdates</code> </p> </li> <li> <p> <code>ServicePacks</code> </p> </li> <li> <p> <code>Tools</code> </p> </li> <li> <p> <code>UpdateRollups</code> </p> </li> <li> <p> <code>Updates</code> </p> </li> <li> <p> <code>Upgrades</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>MSRC_SEVERITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Critical</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Moderate</code> </p> </li> <li> <p> <code>Low</code> </p> </li> <li> <p> <code>Unspecified</code> </p> </li> </ul> <p> <b>Ubuntu Operating Systems</b> </p> <p>The supported keys for Ubuntu operating systems are <code>PRODUCT</code>, <code>PRIORITY</code>, and <code>SECTION</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Ubuntu14.04</code> </p> </li> <li> <p> <code>Ubuntu16.04</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>PRIORITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Required</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Standard</code> </p> </li> <li> <p> <code>Optional</code> </p> </li> <li> <p> <code>Extra</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>SECTION</code> </p> <p>Only the length of the key value is validated. Minimum length is 1. Maximum length is 64.</p> <p> <b>Amazon Linux Operating Systems</b> </p> <p>The supported keys for Amazon Linux operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>AmazonLinux2012.03</code> </p> </li> <li> <p> <code>AmazonLinux2012.09</code> </p> </li> <li> <p> <code>AmazonLinux2013.03</code> </p> </li> <li> <p> <code>AmazonLinux2013.09</code> </p> </li> <li> <p> <code>AmazonLinux2014.03</code> </p> </li> <li> <p> <code>AmazonLinux2014.09</code> </p> </li> <li> <p> <code>AmazonLinux2015.03</code> </p> </li> <li> <p> <code>AmazonLinux2015.09</code> </p> </li> <li> <p> <code>AmazonLinux2016.03</code> </p> </li> <li> <p> <code>AmazonLinux2016.09</code> </p> </li> <li> <p> <code>AmazonLinux2017.03</code> </p> </li> <li> <p> <code>AmazonLinux2017.09</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>CLASSIFICATION</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Security</code> </p> </li> <li> <p> <code>Bugfix</code> </p> </li> <li> <p> <code>Enhancement</code> </p> </li> <li> <p> <code>Recommended</code> </p> </li> <li> <p> <code>Newpackage</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>SEVERITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Critical</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Medium</code> </p> </li> <li> <p> <code>Low</code> </p> </li> </ul> <p> <b>Amazon Linux 2 Operating Systems</b> </p> <p>The supported keys for Amazon Linux 2 operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>AmazonLinux2</code> </p> </li> <li> <p> <code>AmazonLinux2.0</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>CLASSIFICATION</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Security</code> </p> </li> <li> <p> <code>Bugfix</code> </p> </li> <li> <p> <code>Enhancement</code> </p> </li> <li> <p> <code>Recommended</code> </p> </li> <li> <p> <code>Newpackage</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>SEVERITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Critical</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Medium</code> </p> </li> <li> <p> <code>Low</code> </p> </li> </ul> <p> <b>RedHat Enterprise Linux (RHEL) Operating Systems</b> </p> <p>The supported keys for RedHat Enterprise Linux operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>RedhatEnterpriseLinux6.5</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux6.6</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux6.7</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux6.8</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux6.9</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux7.0</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux7.1</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux7.2</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux7.3</code> </p> </li> <li> <p> <code>RedhatEnterpriseLinux7.4</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>CLASSIFICATION</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Security</code> </p> </li> <li> <p> <code>Bugfix</code> </p> </li> <li> <p> <code>Enhancement</code> </p> </li> <li> <p> <code>Recommended</code> </p> </li> <li> <p> <code>Newpackage</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>SEVERITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Critical</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Medium</code> </p> </li> <li> <p> <code>Low</code> </p> </li> </ul> <p> <b>SUSE Linux Enterprise Server (SLES) Operating Systems</b> </p> <p>The supported keys for SLES operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Suse12.0</code> </p> </li> <li> <p> <code>Suse12.1</code> </p> </li> <li> <p> <code>Suse12.2</code> </p> </li> <li> <p> <code>Suse12.3</code> </p> </li> <li> <p> <code>Suse12.4</code> </p> </li> <li> <p> <code>Suse12.5</code> </p> </li> <li> <p> <code>Suse12.6</code> </p> </li> <li> <p> <code>Suse12.7</code> </p> </li> <li> <p> <code>Suse12.8</code> </p> </li> <li> <p> <code>Suse12.9</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>CLASSIFICATION</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Security</code> </p> </li> <li> <p> <code>Recommended</code> </p> </li> <li> <p> <code>Optional</code> </p> </li> <li> <p> <code>Feature</code> </p> </li> <li> <p> <code>Document</code> </p> </li> <li> <p> <code>Yast</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>SEVERITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Critical</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Moderate</code> </p> </li> <li> <p> <code>Low</code> </p> </li> </ul> <p> <b>CentOS Operating Systems</b> </p> <p>The supported keys for CentOS operating systems are <code>PRODUCT</code>, <code>CLASSIFICATION</code>, and <code>SEVERITY</code>. See the following lists for valid values for each of these keys.</p> <p> <i>Supported key:</i> <code>PRODUCT</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>CentOS6.5</code> </p> </li> <li> <p> <code>CentOS6.6</code> </p> </li> <li> <p> <code>CentOS6.7</code> </p> </li> <li> <p> <code>CentOS6.8</code> </p> </li> <li> <p> <code>CentOS6.9</code> </p> </li> <li> <p> <code>CentOS7.0</code> </p> </li> <li> <p> <code>CentOS7.1</code> </p> </li> <li> <p> <code>CentOS7.2</code> </p> </li> <li> <p> <code>CentOS7.3</code> </p> </li> <li> <p> <code>CentOS7.4</code> </p> </li> <li> <p> <code>*</code> </p> <p> <i>Use a wildcard character (*) to target all supported operating system versions.</i> </p> </li> </ul> <p> <i>Supported key:</i> <code>CLASSIFICATION</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Security</code> </p> </li> <li> <p> <code>Bugfix</code> </p> </li> <li> <p> <code>Enhancement</code> </p> </li> <li> <p> <code>Recommended</code> </p> </li> <li> <p> <code>Newpackage</code> </p> </li> </ul> <p> <i>Supported key:</i> <code>SEVERITY</code> </p> <p> <i>Supported values:</i> </p> <ul> <li> <p> <code>Critical</code> </p> </li> <li> <p> <code>Important</code> </p> </li> <li> <p> <code>Medium</code> </p> </li> <li> <p> <code>Low</code> </p> </li> </ul>
   */
  @js.native
  trait PatchFilter extends js.Object {
    var Key: js.UndefOr[PatchFilterKey]
    var Values: js.UndefOr[PatchFilterValueList]
  }

  object PatchFilter {
    def apply(
      Key: js.UndefOr[PatchFilterKey] = js.undefined,
      Values: js.UndefOr[PatchFilterValueList] = js.undefined): PatchFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchFilter]
    }
  }

  /**
   * <p>A set of patch filters, typically used for approval rules.</p>
   */
  @js.native
  trait PatchFilterGroup extends js.Object {
    var PatchFilters: js.UndefOr[PatchFilterList]
  }

  object PatchFilterGroup {
    def apply(
      PatchFilters: js.UndefOr[PatchFilterList] = js.undefined): PatchFilterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchFilters" -> PatchFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The mapping between a patch group and the patch baseline the patch group is registered with.</p>
   */
  @js.native
  trait PatchGroupPatchBaselineMapping extends js.Object {
    var PatchGroup: js.UndefOr[PatchGroup]
    var BaselineIdentity: js.UndefOr[PatchBaselineIdentity]
  }

  object PatchGroupPatchBaselineMapping {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined): PatchGroupPatchBaselineMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] },
        "BaselineIdentity" -> BaselineIdentity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchGroupPatchBaselineMapping]
    }
  }

  object PatchOperationTypeEnum {
    val Scan = "Scan"
    val Install = "Install"

    val values = IndexedSeq(Scan, Install)
  }

  /**
   * <p>Defines a filter used in Patch Manager APIs.</p>
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
   * <p>Defines an approval rule for a patch baseline.</p>
   */
  @js.native
  trait PatchRule extends js.Object {
    var PatchFilterGroup: js.UndefOr[PatchFilterGroup]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApproveAfterDays: js.UndefOr[ApproveAfterDays]
    var EnableNonSecurity: js.UndefOr[Boolean]
  }

  object PatchRule {
    def apply(
      PatchFilterGroup: js.UndefOr[PatchFilterGroup] = js.undefined,
      ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      ApproveAfterDays: js.UndefOr[ApproveAfterDays] = js.undefined,
      EnableNonSecurity: js.UndefOr[Boolean] = js.undefined): PatchRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchFilterGroup" -> PatchFilterGroup.map { x => x.asInstanceOf[js.Any] },
        "ComplianceLevel" -> ComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "ApproveAfterDays" -> ApproveAfterDays.map { x => x.asInstanceOf[js.Any] },
        "EnableNonSecurity" -> EnableNonSecurity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchRule]
    }
  }

  /**
   * <p>A set of rules defining the approval rules for a patch baseline.</p>
   */
  @js.native
  trait PatchRuleGroup extends js.Object {
    var PatchRules: js.UndefOr[PatchRuleList]
  }

  object PatchRuleGroup {
    def apply(
      PatchRules: js.UndefOr[PatchRuleList] = js.undefined): PatchRuleGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PatchRules" -> PatchRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchRuleGroup]
    }
  }

  /**
   * <p>Information about the patches to use to update the instances, including target operating systems and source repository. Applies to Linux instances only.</p>
   */
  @js.native
  trait PatchSource extends js.Object {
    var Name: js.UndefOr[PatchSourceName]
    var Products: js.UndefOr[PatchSourceProductList]
    var Configuration: js.UndefOr[PatchSourceConfiguration]
  }

  object PatchSource {
    def apply(
      Name: js.UndefOr[PatchSourceName] = js.undefined,
      Products: js.UndefOr[PatchSourceProductList] = js.undefined,
      Configuration: js.UndefOr[PatchSourceConfiguration] = js.undefined): PatchSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Products" -> Products.map { x => x.asInstanceOf[js.Any] },
        "Configuration" -> Configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchSource]
    }
  }

  /**
   * <p>Information about the approval status of a patch.</p>
   */
  @js.native
  trait PatchStatus extends js.Object {
    var DeploymentStatus: js.UndefOr[PatchDeploymentStatus]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApprovalDate: js.UndefOr[DateTime]
  }

  object PatchStatus {
    def apply(
      DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined,
      ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      ApprovalDate: js.UndefOr[DateTime] = js.undefined): PatchStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeploymentStatus" -> DeploymentStatus.map { x => x.asInstanceOf[js.Any] },
        "ComplianceLevel" -> ComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "ApprovalDate" -> ApprovalDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.</p>
   */
  @js.native
  trait ProgressCounters extends js.Object {
    var TimedOutSteps: js.UndefOr[Int]
    var TotalSteps: js.UndefOr[Int]
    var CancelledSteps: js.UndefOr[Int]
    var FailedSteps: js.UndefOr[Int]
    var SuccessSteps: js.UndefOr[Int]
  }

  object ProgressCounters {
    def apply(
      TimedOutSteps: js.UndefOr[Int] = js.undefined,
      TotalSteps: js.UndefOr[Int] = js.undefined,
      CancelledSteps: js.UndefOr[Int] = js.undefined,
      FailedSteps: js.UndefOr[Int] = js.undefined,
      SuccessSteps: js.UndefOr[Int] = js.undefined): ProgressCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimedOutSteps" -> TimedOutSteps.map { x => x.asInstanceOf[js.Any] },
        "TotalSteps" -> TotalSteps.map { x => x.asInstanceOf[js.Any] },
        "CancelledSteps" -> CancelledSteps.map { x => x.asInstanceOf[js.Any] },
        "FailedSteps" -> FailedSteps.map { x => x.asInstanceOf[js.Any] },
        "SuccessSteps" -> SuccessSteps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProgressCounters]
    }
  }

  @js.native
  trait PutComplianceItemsRequest extends js.Object {
    var ResourceId: js.UndefOr[ComplianceResourceId]
    var ResourceType: js.UndefOr[ComplianceResourceType]
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary]
    var ItemContentHash: js.UndefOr[ComplianceItemContentHash]
    var Items: js.UndefOr[ComplianceItemEntryList]
  }

  object PutComplianceItemsRequest {
    def apply(
      ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
      ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
      ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
      ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.undefined,
      Items: js.UndefOr[ComplianceItemEntryList] = js.undefined): PutComplianceItemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "ItemContentHash" -> ItemContentHash.map { x => x.asInstanceOf[js.Any] },
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var InstanceId: js.UndefOr[InstanceId]
    var Items: js.UndefOr[InventoryItemList]
  }

  object PutInventoryRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Items: js.UndefOr[InventoryItemList] = js.undefined): PutInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Overwrite: js.UndefOr[Boolean]
    var Name: js.UndefOr[PSParameterName]
    var Description: js.UndefOr[ParameterDescription]
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var Value: js.UndefOr[PSParameterValue]
    var KeyId: js.UndefOr[ParameterKeyId]
    var Type: js.UndefOr[ParameterType]
  }

  object PutParameterRequest {
    def apply(
      Overwrite: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[PSParameterName] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined): PutParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Overwrite" -> Overwrite.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AllowedPattern" -> AllowedPattern.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var BaselineId: js.UndefOr[BaselineId]
  }

  object RegisterDefaultPatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined): RegisterDefaultPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object RegisterPatchBaselineForPatchGroupRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined): RegisterPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "PatchGroup" -> PatchGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Targets: js.UndefOr[Targets]
  }

  object RegisterTargetWithMaintenanceWindowRequest {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): RegisterTargetWithMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ClientToken: js.UndefOr[ClientToken]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var TaskType: js.UndefOr[MaintenanceWindowTaskType]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var Targets: js.UndefOr[Targets]
  }

  object RegisterTaskWithMaintenanceWindowRequest {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): RegisterTaskWithMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "TaskType" -> TaskType.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceType: js.UndefOr[ResourceTypeForTagging]
    var ResourceId: js.UndefOr[ResourceId]
    var TagKeys: js.UndefOr[KeyList]
  }

  object RemoveTagsFromResourceRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceTypeForTagging] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about targets that resolved during the Automation execution.</p>
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
   * <p>Compliance summary information for a specific resource. </p>
   */
  @js.native
  trait ResourceComplianceSummaryItem extends js.Object {
    var ResourceId: js.UndefOr[ComplianceResourceId]
    var CompliantSummary: js.UndefOr[CompliantSummary]
    var ResourceType: js.UndefOr[ComplianceResourceType]
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var OverallSeverity: js.UndefOr[ComplianceSeverity]
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary]
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary]
    var Status: js.UndefOr[ComplianceStatus]
  }

  object ResourceComplianceSummaryItem {
    def apply(
      ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
      CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined,
      ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
      OverallSeverity: js.UndefOr[ComplianceSeverity] = js.undefined,
      ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
      NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined,
      Status: js.UndefOr[ComplianceStatus] = js.undefined): ResourceComplianceSummaryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "CompliantSummary" -> CompliantSummary.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "OverallSeverity" -> OverallSeverity.map { x => x.asInstanceOf[js.Any] },
        "ExecutionSummary" -> ExecutionSummary.map { x => x.asInstanceOf[js.Any] },
        "NonCompliantSummary" -> NonCompliantSummary.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceComplianceSummaryItem]
    }
  }

  /**
   * <p>Information about a Resource Data Sync configuration, including its current status and last successful sync.</p>
   */
  @js.native
  trait ResourceDataSyncItem extends js.Object {
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination]
    var LastStatus: js.UndefOr[LastResourceDataSyncStatus]
    var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime]
    var LastSyncTime: js.UndefOr[LastResourceDataSyncTime]
    var SyncName: js.UndefOr[ResourceDataSyncName]
    var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage]
    var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime]
  }

  object ResourceDataSyncItem {
    def apply(
      S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined,
      LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined,
      LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.undefined,
      LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.undefined,
      SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined,
      LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined,
      SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.undefined): ResourceDataSyncItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Destination" -> S3Destination.map { x => x.asInstanceOf[js.Any] },
        "LastStatus" -> LastStatus.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulSyncTime" -> LastSuccessfulSyncTime.map { x => x.asInstanceOf[js.Any] },
        "LastSyncTime" -> LastSyncTime.map { x => x.asInstanceOf[js.Any] },
        "SyncName" -> SyncName.map { x => x.asInstanceOf[js.Any] },
        "LastSyncStatusMessage" -> LastSyncStatusMessage.map { x => x.asInstanceOf[js.Any] },
        "SyncCreatedTime" -> SyncCreatedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDataSyncItem]
    }
  }

  /**
   * <p>Information about the target Amazon S3 bucket for the Resource Data Sync.</p>
   */
  @js.native
  trait ResourceDataSyncS3Destination extends js.Object {
    var BucketName: js.UndefOr[ResourceDataSyncS3BucketName]
    var Region: js.UndefOr[ResourceDataSyncS3Region]
    var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN]
    var SyncFormat: js.UndefOr[ResourceDataSyncS3Format]
    var Prefix: js.UndefOr[ResourceDataSyncS3Prefix]
  }

  object ResourceDataSyncS3Destination {
    def apply(
      BucketName: js.UndefOr[ResourceDataSyncS3BucketName] = js.undefined,
      Region: js.UndefOr[ResourceDataSyncS3Region] = js.undefined,
      AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.undefined,
      SyncFormat: js.UndefOr[ResourceDataSyncS3Format] = js.undefined,
      Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined): ResourceDataSyncS3Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "AWSKMSKeyARN" -> AWSKMSKeyARN.map { x => x.asInstanceOf[js.Any] },
        "SyncFormat" -> SyncFormat.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The inventory item result attribute.</p>
   */
  @js.native
  trait ResultAttribute extends js.Object {
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  object ResultAttribute {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined): ResultAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultAttribute]
    }
  }

  @js.native
  trait ResumeSessionRequest extends js.Object {
    var SessionId: js.UndefOr[SessionId]
  }

  object ResumeSessionRequest {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined): ResumeSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResumeSessionRequest]
    }
  }

  @js.native
  trait ResumeSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var TokenValue: js.UndefOr[TokenValue]
    var StreamUrl: js.UndefOr[StreamUrl]
  }

  object ResumeSessionResponse {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined,
      TokenValue: js.UndefOr[TokenValue] = js.undefined,
      StreamUrl: js.UndefOr[StreamUrl] = js.undefined): ResumeSessionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] },
        "TokenValue" -> TokenValue.map { x => x.asInstanceOf[js.Any] },
        "StreamUrl" -> StreamUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResumeSessionResponse]
    }
  }

  /**
   * <p>An Amazon S3 bucket where you want to store the results of this request.</p>
   */
  @js.native
  trait S3OutputLocation extends js.Object {
    var OutputS3Region: js.UndefOr[S3Region]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object S3OutputLocation {
    def apply(
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined): S3OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3OutputLocation]
    }
  }

  /**
   * <p>A URL for the Amazon S3 bucket where you want to store the results of this request.</p>
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
   * <p>Information about a scheduled execution for a Maintenance Window.</p>
   */
  @js.native
  trait ScheduledWindowExecution extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Name: js.UndefOr[MaintenanceWindowName]
    var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object ScheduledWindowExecution {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): ScheduledWindowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ExecutionTime" -> ExecutionTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledWindowExecution]
    }
  }

  @js.native
  trait SendAutomationSignalRequest extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var SignalType: js.UndefOr[SignalType]
    var Payload: js.UndefOr[AutomationParameterMap]
  }

  object SendAutomationSignalRequest {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      SignalType: js.UndefOr[SignalType] = js.undefined,
      Payload: js.UndefOr[AutomationParameterMap] = js.undefined): SendAutomationSignalRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
        "SignalType" -> SignalType.map { x => x.asInstanceOf[js.Any] },
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
    var MaxErrors: js.UndefOr[MaxErrors]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var Parameters: js.UndefOr[Parameters]
    var OutputS3Region: js.UndefOr[S3Region]
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceIds: js.UndefOr[InstanceIdList]
    var DocumentName: js.UndefOr[DocumentARN]
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var Targets: js.UndefOr[Targets]
    var Comment: js.UndefOr[Comment]
    var DocumentHash: js.UndefOr[DocumentHash]
    var DocumentHashType: js.UndefOr[DocumentHashType]
  }

  object SendCommandRequest {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      DocumentName: js.UndefOr[DocumentARN] = js.undefined,
      TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentHash: js.UndefOr[DocumentHash] = js.undefined,
      DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined): SendCommandRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "OutputS3BucketName" -> OutputS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfig" -> NotificationConfig.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "OutputS3Region" -> OutputS3Region.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchOutputConfig" -> CloudWatchOutputConfig.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "TimeoutSeconds" -> TimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "DocumentHash" -> DocumentHash.map { x => x.asInstanceOf[js.Any] },
        "DocumentHashType" -> DocumentHashType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about a Session Manager connection to an instance.</p>
   */
  @js.native
  trait Session extends js.Object {
    var Target: js.UndefOr[SessionTarget]
    var SessionId: js.UndefOr[SessionId]
    var Details: js.UndefOr[SessionDetails]
    var StartDate: js.UndefOr[DateTime]
    var DocumentName: js.UndefOr[DocumentName]
    var OutputUrl: js.UndefOr[SessionManagerOutputUrl]
    var EndDate: js.UndefOr[DateTime]
    var Owner: js.UndefOr[SessionOwner]
    var Status: js.UndefOr[SessionStatus]
  }

  object Session {
    def apply(
      Target: js.UndefOr[SessionTarget] = js.undefined,
      SessionId: js.UndefOr[SessionId] = js.undefined,
      Details: js.UndefOr[SessionDetails] = js.undefined,
      StartDate: js.UndefOr[DateTime] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.undefined,
      EndDate: js.UndefOr[DateTime] = js.undefined,
      Owner: js.UndefOr[SessionOwner] = js.undefined,
      Status: js.UndefOr[SessionStatus] = js.undefined): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "OutputUrl" -> OutputUrl.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }

  /**
   * <p>Describes a filter for Session Manager information.</p>
   */
  @js.native
  trait SessionFilter extends js.Object {
    var key: js.UndefOr[SessionFilterKey]
    var value: js.UndefOr[SessionFilterValue]
  }

  object SessionFilter {
    def apply(
      key: js.UndefOr[SessionFilterKey] = js.undefined,
      value: js.UndefOr[SessionFilterValue] = js.undefined): SessionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Reserved for future use.</p>
   */
  @js.native
  trait SessionManagerOutputUrl extends js.Object {
    var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl]
    var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl]
  }

  object SessionManagerOutputUrl {
    def apply(
      S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined,
      CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.undefined): SessionManagerOutputUrl = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputUrl" -> S3OutputUrl.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchOutputUrl" -> CloudWatchOutputUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The number of managed instances found for each patch severity level defined in the request filter.</p>
   */
  @js.native
  trait SeveritySummary extends js.Object {
    var CriticalCount: js.UndefOr[ComplianceSummaryCount]
    var MediumCount: js.UndefOr[ComplianceSummaryCount]
    var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount]
    var InformationalCount: js.UndefOr[ComplianceSummaryCount]
    var LowCount: js.UndefOr[ComplianceSummaryCount]
    var HighCount: js.UndefOr[ComplianceSummaryCount]
  }

  object SeveritySummary {
    def apply(
      CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
      HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined): SeveritySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CriticalCount" -> CriticalCount.map { x => x.asInstanceOf[js.Any] },
        "MediumCount" -> MediumCount.map { x => x.asInstanceOf[js.Any] },
        "UnspecifiedCount" -> UnspecifiedCount.map { x => x.asInstanceOf[js.Any] },
        "InformationalCount" -> InformationalCount.map { x => x.asInstanceOf[js.Any] },
        "LowCount" -> LowCount.map { x => x.asInstanceOf[js.Any] },
        "HighCount" -> HighCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AssociationIds: js.UndefOr[AssociationIdList]
  }

  object StartAssociationsOnceRequest {
    def apply(
      AssociationIds: js.UndefOr[AssociationIdList] = js.undefined): StartAssociationsOnceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationIds" -> AssociationIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var MaxErrors: js.UndefOr[MaxErrors]
    var TargetMaps: js.UndefOr[TargetMaps]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ClientToken: js.UndefOr[IdempotencyToken]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Mode: js.UndefOr[ExecutionMode]
    var TargetLocations: js.UndefOr[TargetLocations]
    var DocumentName: js.UndefOr[DocumentARN]
    var Targets: js.UndefOr[Targets]
  }

  object StartAutomationExecutionRequest {
    def apply(
      TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Mode: js.UndefOr[ExecutionMode] = js.undefined,
      TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
      DocumentName: js.UndefOr[DocumentARN] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): StartAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetParameterName" -> TargetParameterName.map { x => x.asInstanceOf[js.Any] },
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "TargetMaps" -> TargetMaps.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "TargetLocations" -> TargetLocations.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
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
    var Target: js.UndefOr[SessionTarget]
    var DocumentName: js.UndefOr[DocumentARN]
    var Parameters: js.UndefOr[SessionManagerParameters]
  }

  object StartSessionRequest {
    def apply(
      Target: js.UndefOr[SessionTarget] = js.undefined,
      DocumentName: js.UndefOr[DocumentARN] = js.undefined,
      Parameters: js.UndefOr[SessionManagerParameters] = js.undefined): StartSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "DocumentName" -> DocumentName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSessionRequest]
    }
  }

  @js.native
  trait StartSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var TokenValue: js.UndefOr[TokenValue]
    var StreamUrl: js.UndefOr[StreamUrl]
  }

  object StartSessionResponse {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined,
      TokenValue: js.UndefOr[TokenValue] = js.undefined,
      StreamUrl: js.UndefOr[StreamUrl] = js.undefined): StartSessionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] },
        "TokenValue" -> TokenValue.map { x => x.asInstanceOf[js.Any] },
        "StreamUrl" -> StreamUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSessionResponse]
    }
  }

  /**
   * <p>Detailed information about an the execution state of an Automation step.</p>
   */
  @js.native
  trait StepExecution extends js.Object {
    var MaxAttempts: js.UndefOr[Int]
    var IsCritical: js.UndefOr[Boolean]
    var FailureMessage: js.UndefOr[String]
    var Inputs: js.UndefOr[NormalStringMap]
    var OverriddenParameters: js.UndefOr[AutomationParameterMap]
    var StepExecutionId: js.UndefOr[String]
    var OnFailure: js.UndefOr[String]
    var ExecutionStartTime: js.UndefOr[DateTime]
    var ResponseCode: js.UndefOr[String]
    var ExecutionEndTime: js.UndefOr[DateTime]
    var StepName: js.UndefOr[String]
    var TargetLocation: js.UndefOr[TargetLocation]
    var NextStep: js.UndefOr[String]
    var Response: js.UndefOr[String]
    var TimeoutSeconds: js.UndefOr[Double]
    var Targets: js.UndefOr[Targets]
    var StepStatus: js.UndefOr[AutomationExecutionStatus]
    var ValidNextSteps: js.UndefOr[ValidNextStepList]
    var Action: js.UndefOr[AutomationActionName]
    var FailureDetails: js.UndefOr[FailureDetails]
    var IsEnd: js.UndefOr[Boolean]
    var Outputs: js.UndefOr[AutomationParameterMap]
  }

  object StepExecution {
    def apply(
      MaxAttempts: js.UndefOr[Int] = js.undefined,
      IsCritical: js.UndefOr[Boolean] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      Inputs: js.UndefOr[NormalStringMap] = js.undefined,
      OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      StepExecutionId: js.UndefOr[String] = js.undefined,
      OnFailure: js.UndefOr[String] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      ResponseCode: js.UndefOr[String] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      StepName: js.UndefOr[String] = js.undefined,
      TargetLocation: js.UndefOr[TargetLocation] = js.undefined,
      NextStep: js.UndefOr[String] = js.undefined,
      Response: js.UndefOr[String] = js.undefined,
      TimeoutSeconds: js.UndefOr[Double] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      StepStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined,
      Action: js.UndefOr[AutomationActionName] = js.undefined,
      FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
      IsEnd: js.UndefOr[Boolean] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined): StepExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxAttempts" -> MaxAttempts.map { x => x.asInstanceOf[js.Any] },
        "IsCritical" -> IsCritical.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "OverriddenParameters" -> OverriddenParameters.map { x => x.asInstanceOf[js.Any] },
        "StepExecutionId" -> StepExecutionId.map { x => x.asInstanceOf[js.Any] },
        "OnFailure" -> OnFailure.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStartTime" -> ExecutionStartTime.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "ExecutionEndTime" -> ExecutionEndTime.map { x => x.asInstanceOf[js.Any] },
        "StepName" -> StepName.map { x => x.asInstanceOf[js.Any] },
        "TargetLocation" -> TargetLocation.map { x => x.asInstanceOf[js.Any] },
        "NextStep" -> NextStep.map { x => x.asInstanceOf[js.Any] },
        "Response" -> Response.map { x => x.asInstanceOf[js.Any] },
        "TimeoutSeconds" -> TimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "StepStatus" -> StepStatus.map { x => x.asInstanceOf[js.Any] },
        "ValidNextSteps" -> ValidNextSteps.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "FailureDetails" -> FailureDetails.map { x => x.asInstanceOf[js.Any] },
        "IsEnd" -> IsEnd.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepExecution]
    }
  }

  /**
   * <p>A filter to limit the amount of step execution information returned by the call.</p>
   */
  @js.native
  trait StepExecutionFilter extends js.Object {
    var Key: js.UndefOr[StepExecutionFilterKey]
    var Values: js.UndefOr[StepExecutionFilterValueList]
  }

  object StepExecutionFilter {
    def apply(
      Key: js.UndefOr[StepExecutionFilterKey] = js.undefined,
      Values: js.UndefOr[StepExecutionFilterValueList] = js.undefined): StepExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var Type: js.UndefOr[StopType]
  }

  object StopAutomationExecutionRequest {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      Type: js.UndefOr[StopType] = js.undefined): StopAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomationExecutionId" -> AutomationExecutionId.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Metadata that you assign to your AWS resources. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. In Systems Manager, you can apply tags to documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>An array of search criteria that targets instances using a Key,Value combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in the call.</p> <p/>
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
   * <p>The combination of AWS Regions and accounts targeted by the current Automation execution.</p>
   */
  @js.native
  trait TargetLocation extends js.Object {
    var TargetLocationMaxErrors: js.UndefOr[MaxErrors]
    var Regions: js.UndefOr[Regions]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var Accounts: js.UndefOr[Accounts]
    var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency]
  }

  object TargetLocation {
    def apply(
      TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Regions: js.UndefOr[Regions] = js.undefined,
      ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
      Accounts: js.UndefOr[Accounts] = js.undefined,
      TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined): TargetLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetLocationMaxErrors" -> TargetLocationMaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Regions" -> Regions.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleName" -> ExecutionRoleName.map { x => x.asInstanceOf[js.Any] },
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "TargetLocationMaxConcurrency" -> TargetLocationMaxConcurrency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetLocation]
    }
  }

  @js.native
  trait TerminateSessionRequest extends js.Object {
    var SessionId: js.UndefOr[SessionId]
  }

  object TerminateSessionRequest {
    def apply(
      SessionId: js.UndefOr[SessionId] = js.undefined): TerminateSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SessionId" -> SessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentName]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var Parameters: js.UndefOr[Parameters]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var AssociationName: js.UndefOr[AssociationName]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
    var AssociationId: js.UndefOr[AssociationId]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
  }

  object UpdateAssociationRequest {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      AssociationName: js.UndefOr[AssociationName] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined): UpdateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSeverity" -> ComplianceSeverity.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "AssociationVersion" -> AssociationVersion.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] },
        "AssociationName" -> AssociationName.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[DocumentName]
    var InstanceId: js.UndefOr[InstanceId]
    var AssociationStatus: js.UndefOr[AssociationStatus]
  }

  object UpdateAssociationStatusRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationStatus: js.UndefOr[AssociationStatus] = js.undefined): UpdateAssociationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "AssociationStatus" -> AssociationStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[DocumentName]
    var DocumentVersion: js.UndefOr[DocumentVersionNumber]
  }

  object UpdateDocumentDefaultVersionRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersionNumber] = js.undefined): UpdateDocumentDefaultVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TargetType: js.UndefOr[TargetType]
    var Content: js.UndefOr[DocumentContent]
    var Name: js.UndefOr[DocumentName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
  }

  object UpdateDocumentRequest {
    def apply(
      TargetType: js.UndefOr[TargetType] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined): UpdateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DocumentFormat" -> DocumentFormat.map { x => x.asInstanceOf[js.Any] },
        "DocumentVersion" -> DocumentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var Replace: js.UndefOr[Boolean]
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object UpdateMaintenanceWindowRequest {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): UpdateMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowResult extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Duration: js.UndefOr[MaintenanceWindowDurationHours]
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets]
    var Enabled: js.UndefOr[MaintenanceWindowEnabled]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff]
    var Schedule: js.UndefOr[MaintenanceWindowSchedule]
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object UpdateMaintenanceWindowResult {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
      EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined): UpdateMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "ScheduleTimezone" -> ScheduleTimezone.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] },
        "Cutoff" -> Cutoff.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTargetRequest extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Replace: js.UndefOr[Boolean]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Targets: js.UndefOr[Targets]
  }

  object UpdateMaintenanceWindowTargetRequest {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): UpdateMaintenanceWindowTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTargetRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTargetResult extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Targets: js.UndefOr[Targets]
  }

  object UpdateMaintenanceWindowTargetResult {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined): UpdateMaintenanceWindowTargetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "WindowTargetId" -> WindowTargetId.map { x => x.asInstanceOf[js.Any] },
        "OwnerInformation" -> OwnerInformation.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTargetResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTaskRequest extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var Replace: js.UndefOr[Boolean]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var Targets: js.UndefOr[Targets]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object UpdateMaintenanceWindowTaskRequest {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): UpdateMaintenanceWindowTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTaskRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTaskResult extends js.Object {
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var Targets: js.UndefOr[Targets]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object UpdateMaintenanceWindowTaskResult {
    def apply(
      MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
      TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined): UpdateMaintenanceWindowTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxErrors" -> MaxErrors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WindowId" -> WindowId.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrency" -> MaxConcurrency.map { x => x.asInstanceOf[js.Any] },
        "TaskInvocationParameters" -> TaskInvocationParameters.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "TaskParameters" -> TaskParameters.map { x => x.asInstanceOf[js.Any] },
        "LoggingInfo" -> LoggingInfo.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "WindowTaskId" -> WindowTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleRequest extends js.Object {
    var InstanceId: js.UndefOr[ManagedInstanceId]
    var IamRole: js.UndefOr[IamRole]
  }

  object UpdateManagedInstanceRoleRequest {
    def apply(
      InstanceId: js.UndefOr[ManagedInstanceId] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined): UpdateManagedInstanceRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "IamRole" -> IamRole.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var Name: js.UndefOr[BaselineName]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var Replace: js.UndefOr[Boolean]
    var Description: js.UndefOr[BaselineDescription]
    var BaselineId: js.UndefOr[BaselineId]
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var Sources: js.UndefOr[PatchSourceList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
  }

  object UpdatePatchBaselineRequest {
    def apply(
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined): UpdatePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "Replace" -> Replace.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePatchBaselineRequest]
    }
  }

  @js.native
  trait UpdatePatchBaselineResult extends js.Object {
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var ModifiedDate: js.UndefOr[DateTime]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var Name: js.UndefOr[BaselineName]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var CreatedDate: js.UndefOr[DateTime]
    var Description: js.UndefOr[BaselineDescription]
    var BaselineId: js.UndefOr[BaselineId]
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var Sources: js.UndefOr[PatchSourceList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
  }

  object UpdatePatchBaselineResult {
    def apply(
      ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      Sources: js.UndefOr[PatchSourceList] = js.undefined,
      ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined): UpdatePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApprovedPatchesEnableNonSecurity" -> ApprovedPatchesEnableNonSecurity.map { x => x.asInstanceOf[js.Any] },
        "ModifiedDate" -> ModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatchesAction" -> RejectedPatchesAction.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "BaselineId" -> BaselineId.map { x => x.asInstanceOf[js.Any] },
        "ApprovalRules" -> ApprovalRules.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatches" -> ApprovedPatches.map { x => x.asInstanceOf[js.Any] },
        "Sources" -> Sources.map { x => x.asInstanceOf[js.Any] },
        "ApprovedPatchesComplianceLevel" -> ApprovedPatchesComplianceLevel.map { x => x.asInstanceOf[js.Any] },
        "RejectedPatches" -> RejectedPatches.map { x => x.asInstanceOf[js.Any] },
        "GlobalFilters" -> GlobalFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePatchBaselineResult]
    }
  }
}
