package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object ssm {
  type AccountId = String
  type AccountIdList = js.Array[AccountId]
  type ActivationCode = String
  type ActivationDescription = String
  type ActivationId = String
  type ActivationList = js.Array[Activation]
  type AgentErrorCode = String
  type ApproveAfterDays = Integer
  type AssociationDescriptionList = js.Array[AssociationDescription]
  type AssociationFilterKey = String
  type AssociationFilterList = js.Array[AssociationFilter]
  type AssociationFilterValue = String
  type AssociationId = String
  type AssociationList = js.Array[Association]
  type AssociationStatusAggregatedCount = js.Dictionary[InstanceCount]
  type AssociationStatusName = String
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
  type BaselineDescription = String
  type BaselineId = String
  type BaselineName = String
  type BatchErrorMessage = String
  type ClientToken = String
  type CommandFilterKey = String
  type CommandFilterList = js.Array[CommandFilter]
  type CommandFilterValue = String
  type CommandId = String
  type CommandInvocationList = js.Array[CommandInvocation]
  type CommandInvocationStatus = String
  type CommandList = js.Array[Command]
  type CommandMaxResults = Integer
  type CommandPluginList = js.Array[CommandPlugin]
  type CommandPluginName = String
  type CommandPluginOutput = String
  type CommandPluginStatus = String
  type CommandStatus = String
  type Comment = String
  type CompletedCount = Integer
  type ComputerName = String
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate = js.Date
  type DateTime = js.Date
  type DefaultBaseline = Boolean
  type DefaultInstanceName = String
  type DescribeActivationsFilterKeys = String
  type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument = String
  type DocumentARN = String
  type DocumentContent = String
  type DocumentFilterKey = String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = String
  type DocumentHash = String
  type DocumentHashType = String
  type DocumentIdentifierList = js.Array[DocumentIdentifier]
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
  type EffectiveInstanceAssociationMaxResults = Integer
  type EffectivePatchList = js.Array[EffectivePatch]
  type ErrorCount = Integer
  type ExpirationDate = js.Date
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  type Fault = String
  type GetInventorySchemaMaxResults = Integer
  type IPAddress = String
  type IamRole = String
  type InstanceAssociationExecutionSummary = String
  type InstanceAssociationList = js.Array[InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount = js.Dictionary[InstanceCount]
  type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]
  type InstanceCount = Integer
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
  type InventoryAttributeDataType = String
  type InventoryFilterKey = String
  type InventoryFilterList = js.Array[InventoryFilter]
  type InventoryFilterValue = String
  type InventoryFilterValueList = js.Array[InventoryFilterValue]
  type InventoryItemAttributeList = js.Array[InventoryItemAttribute]
  type InventoryItemAttributeName = String
  type InventoryItemCaptureTime = String
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
  type InvocationTraceOutput = String
  type KeyList = js.Array[TagKey]
  type MaintenanceWindowAllowUnassociatedTargets = Boolean
  type MaintenanceWindowCutoff = Integer
  type MaintenanceWindowDurationHours = Integer
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
  type MaintenanceWindowMaxResults = Integer
  type MaintenanceWindowName = String
  type MaintenanceWindowResourceType = String
  type MaintenanceWindowSchedule = String
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
  type MaintenanceWindowTaskPriority = Integer
  type MaintenanceWindowTaskTargetId = String
  type MaintenanceWindowTaskType = String
  type ManagedInstanceId = String
  type MaxResults = Integer
  type MaxResultsEC2Compatible = Integer
  type NextToken = String
  type NormalStringMap = js.Dictionary[String]
  type NotificationArn = String
  type NotificationEvent = String
  type NotificationEventList = js.Array[NotificationEvent]
  type NotificationType = String
  type OwnerInformation = String
  type PSParameterName = String
  type PSParameterValue = String
  type ParameterDescription = String
  type ParameterHistoryList = js.Array[ParameterHistory]
  type ParameterKeyId = String
  type ParameterList = js.Array[Parameter]
  type ParameterMetadataList = js.Array[ParameterMetadata]
  type ParameterName = String
  type ParameterNameList = js.Array[PSParameterName]
  type ParameterType = String
  type ParameterValue = String
  type ParameterValueList = js.Array[ParameterValue]
  type Parameters = js.Dictionary[ParameterValueList]
  type ParametersFilterKey = String
  type ParametersFilterList = js.Array[ParametersFilter]
  type ParametersFilterValue = String
  type ParametersFilterValueList = js.Array[ParametersFilterValue]
  type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults = Integer
  type PatchClassification = String
  type PatchComplianceDataList = js.Array[PatchComplianceData]
  type PatchComplianceDataState = String
  type PatchComplianceMaxResults = Integer
  type PatchContentUrl = String
  type PatchDeploymentStatus = String
  type PatchDescription = String
  type PatchFailedCount = Integer
  type PatchFilterKey = String
  type PatchFilterList = js.Array[PatchFilter]
  type PatchFilterValue = String
  type PatchFilterValueList = js.Array[PatchFilterValue]
  type PatchGroup = String
  type PatchGroupList = js.Array[PatchGroup]
  type PatchGroupPatchBaselineMappingList = js.Array[PatchGroupPatchBaselineMapping]
  type PatchId = String
  type PatchIdList = js.Array[PatchId]
  type PatchInstalledCount = Integer
  type PatchInstalledOtherCount = Integer
  type PatchInstalledTime = js.Date
  type PatchKbNumber = String
  type PatchLanguage = String
  type PatchList = js.Array[Patch]
  type PatchMissingCount = Integer
  type PatchMsrcNumber = String
  type PatchMsrcSeverity = String
  type PatchNotApplicableCount = Integer
  type PatchOperationEndTime = js.Date
  type PatchOperationStartTime = js.Date
  type PatchOperationType = String
  type PatchOrchestratorFilterKey = String
  type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = String
  type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]
  type PatchProduct = String
  type PatchProductFamily = String
  type PatchRuleList = js.Array[PatchRule]
  type PatchSeverity = String
  type PatchTitle = String
  type PatchVendor = String
  type PingStatus = String
  type PlatformType = String
  type PlatformTypeList = js.Array[PlatformType]
  type RegistrationLimit = Integer
  type RegistrationsCount = Integer
  type ResourceId = String
  type ResourceType = String
  type ResourceTypeForTagging = String
  type ResponseCode = Integer
  type ResultAttributeList = js.Array[ResultAttribute]
  type S3BucketName = String
  type S3KeyPrefix = String
  type S3Region = String
  type ScheduleExpression = String
  type ServiceRole = String
  type SnapshotDownloadUrl = String
  type SnapshotId = String
  type StandardErrorContent = String
  type StandardOutputContent = String
  type StatusAdditionalInfo = String
  type StatusDetails = String
  type StatusMessage = String
  type StatusName = String
  type StepExecutionList = js.Array[StepExecution]
  type StringDateTime = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetCount = Integer
  type TargetKey = String
  type TargetValue = String
  type TargetValues = js.Array[TargetValue]
  type Targets = js.Array[Target]
  type TimeoutSeconds = Integer
  type Url = String
  type VelocityConstraint = String
  type Version = String
}

package ssm {
  @js.native
  trait Ssm extends js.Object {
    def addTagsToResource(params: AddTagsToResourceRequest, callback: Callback[AddTagsToResourceResult]): Unit = js.native
    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult] = js.native
    def cancelCommand(params: CancelCommandRequest, callback: Callback[CancelCommandResult]): Unit = js.native
    def cancelCommand(params: CancelCommandRequest): Request[CancelCommandResult] = js.native
    def createActivation(params: CreateActivationRequest, callback: Callback[CreateActivationResult]): Unit = js.native
    def createActivation(params: CreateActivationRequest): Request[CreateActivationResult] = js.native
    def createAssociation(params: CreateAssociationRequest, callback: Callback[CreateAssociationResult]): Unit = js.native
    def createAssociation(params: CreateAssociationRequest): Request[CreateAssociationResult] = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest, callback: Callback[CreateAssociationBatchResult]): Unit = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest): Request[CreateAssociationBatchResult] = js.native
    def createDocument(params: CreateDocumentRequest, callback: Callback[CreateDocumentResult]): Unit = js.native
    def createDocument(params: CreateDocumentRequest): Request[CreateDocumentResult] = js.native
    def createMaintenanceWindow(params: CreateMaintenanceWindowRequest, callback: Callback[CreateMaintenanceWindowResult]): Unit = js.native
    def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): Request[CreateMaintenanceWindowResult] = js.native
    def createPatchBaseline(params: CreatePatchBaselineRequest, callback: Callback[CreatePatchBaselineResult]): Unit = js.native
    def createPatchBaseline(params: CreatePatchBaselineRequest): Request[CreatePatchBaselineResult] = js.native
    def deleteActivation(params: DeleteActivationRequest, callback: Callback[DeleteActivationResult]): Unit = js.native
    def deleteActivation(params: DeleteActivationRequest): Request[DeleteActivationResult] = js.native
    def deleteAssociation(params: DeleteAssociationRequest, callback: Callback[DeleteAssociationResult]): Unit = js.native
    def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResult] = js.native
    def deleteDocument(params: DeleteDocumentRequest, callback: Callback[DeleteDocumentResult]): Unit = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[DeleteDocumentResult] = js.native
    def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest, callback: Callback[DeleteMaintenanceWindowResult]): Unit = js.native
    def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): Request[DeleteMaintenanceWindowResult] = js.native
    def deleteParameter(params: DeleteParameterRequest, callback: Callback[DeleteParameterResult]): Unit = js.native
    def deleteParameter(params: DeleteParameterRequest): Request[DeleteParameterResult] = js.native
    def deletePatchBaseline(params: DeletePatchBaselineRequest, callback: Callback[DeletePatchBaselineResult]): Unit = js.native
    def deletePatchBaseline(params: DeletePatchBaselineRequest): Request[DeletePatchBaselineResult] = js.native
    def deregisterManagedInstance(params: DeregisterManagedInstanceRequest, callback: Callback[DeregisterManagedInstanceResult]): Unit = js.native
    def deregisterManagedInstance(params: DeregisterManagedInstanceRequest): Request[DeregisterManagedInstanceResult] = js.native
    def deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest, callback: Callback[DeregisterPatchBaselineForPatchGroupResult]): Unit = js.native
    def deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest): Request[DeregisterPatchBaselineForPatchGroupResult] = js.native
    def deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest, callback: Callback[DeregisterTargetFromMaintenanceWindowResult]): Unit = js.native
    def deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest): Request[DeregisterTargetFromMaintenanceWindowResult] = js.native
    def deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest, callback: Callback[DeregisterTaskFromMaintenanceWindowResult]): Unit = js.native
    def deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest): Request[DeregisterTaskFromMaintenanceWindowResult] = js.native
    def describeActivations(params: DescribeActivationsRequest, callback: Callback[DescribeActivationsResult]): Unit = js.native
    def describeActivations(params: DescribeActivationsRequest): Request[DescribeActivationsResult] = js.native
    def describeAssociation(params: DescribeAssociationRequest, callback: Callback[DescribeAssociationResult]): Unit = js.native
    def describeAssociation(params: DescribeAssociationRequest): Request[DescribeAssociationResult] = js.native
    def describeAutomationExecutions(params: DescribeAutomationExecutionsRequest, callback: Callback[DescribeAutomationExecutionsResult]): Unit = js.native
    def describeAutomationExecutions(params: DescribeAutomationExecutionsRequest): Request[DescribeAutomationExecutionsResult] = js.native
    def describeAvailablePatches(params: DescribeAvailablePatchesRequest, callback: Callback[DescribeAvailablePatchesResult]): Unit = js.native
    def describeAvailablePatches(params: DescribeAvailablePatchesRequest): Request[DescribeAvailablePatchesResult] = js.native
    def describeDocument(params: DescribeDocumentRequest, callback: Callback[DescribeDocumentResult]): Unit = js.native
    def describeDocument(params: DescribeDocumentRequest): Request[DescribeDocumentResult] = js.native
    def describeDocumentPermission(params: DescribeDocumentPermissionRequest, callback: Callback[DescribeDocumentPermissionResponse]): Unit = js.native
    def describeDocumentPermission(params: DescribeDocumentPermissionRequest): Request[DescribeDocumentPermissionResponse] = js.native
    def describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest, callback: Callback[DescribeEffectiveInstanceAssociationsResult]): Unit = js.native
    def describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest): Request[DescribeEffectiveInstanceAssociationsResult] = js.native
    def describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest, callback: Callback[DescribeEffectivePatchesForPatchBaselineResult]): Unit = js.native
    def describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest): Request[DescribeEffectivePatchesForPatchBaselineResult] = js.native
    def describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest, callback: Callback[DescribeInstanceAssociationsStatusResult]): Unit = js.native
    def describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest): Request[DescribeInstanceAssociationsStatusResult] = js.native
    def describeInstanceInformation(params: DescribeInstanceInformationRequest, callback: Callback[DescribeInstanceInformationResult]): Unit = js.native
    def describeInstanceInformation(params: DescribeInstanceInformationRequest): Request[DescribeInstanceInformationResult] = js.native
    def describeInstancePatchStates(params: DescribeInstancePatchStatesRequest, callback: Callback[DescribeInstancePatchStatesResult]): Unit = js.native
    def describeInstancePatchStates(params: DescribeInstancePatchStatesRequest): Request[DescribeInstancePatchStatesResult] = js.native
    def describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest, callback: Callback[DescribeInstancePatchStatesForPatchGroupResult]): Unit = js.native
    def describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest): Request[DescribeInstancePatchStatesForPatchGroupResult] = js.native
    def describeInstancePatches(params: DescribeInstancePatchesRequest, callback: Callback[DescribeInstancePatchesResult]): Unit = js.native
    def describeInstancePatches(params: DescribeInstancePatchesRequest): Request[DescribeInstancePatchesResult] = js.native
    def describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest, callback: Callback[DescribeMaintenanceWindowExecutionTaskInvocationsResult]): Unit = js.native
    def describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult] = js.native
    def describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest, callback: Callback[DescribeMaintenanceWindowExecutionTasksResult]): Unit = js.native
    def describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest): Request[DescribeMaintenanceWindowExecutionTasksResult] = js.native
    def describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest, callback: Callback[DescribeMaintenanceWindowExecutionsResult]): Unit = js.native
    def describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest): Request[DescribeMaintenanceWindowExecutionsResult] = js.native
    def describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest, callback: Callback[DescribeMaintenanceWindowTargetsResult]): Unit = js.native
    def describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest): Request[DescribeMaintenanceWindowTargetsResult] = js.native
    def describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest, callback: Callback[DescribeMaintenanceWindowTasksResult]): Unit = js.native
    def describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest): Request[DescribeMaintenanceWindowTasksResult] = js.native
    def describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest, callback: Callback[DescribeMaintenanceWindowsResult]): Unit = js.native
    def describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest): Request[DescribeMaintenanceWindowsResult] = js.native
    def describeParameters(params: DescribeParametersRequest, callback: Callback[DescribeParametersResult]): Unit = js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResult] = js.native
    def describePatchBaselines(params: DescribePatchBaselinesRequest, callback: Callback[DescribePatchBaselinesResult]): Unit = js.native
    def describePatchBaselines(params: DescribePatchBaselinesRequest): Request[DescribePatchBaselinesResult] = js.native
    def describePatchGroupState(params: DescribePatchGroupStateRequest, callback: Callback[DescribePatchGroupStateResult]): Unit = js.native
    def describePatchGroupState(params: DescribePatchGroupStateRequest): Request[DescribePatchGroupStateResult] = js.native
    def describePatchGroups(params: DescribePatchGroupsRequest, callback: Callback[DescribePatchGroupsResult]): Unit = js.native
    def describePatchGroups(params: DescribePatchGroupsRequest): Request[DescribePatchGroupsResult] = js.native
    def getAutomationExecution(params: GetAutomationExecutionRequest, callback: Callback[GetAutomationExecutionResult]): Unit = js.native
    def getAutomationExecution(params: GetAutomationExecutionRequest): Request[GetAutomationExecutionResult] = js.native
    def getCommandInvocation(params: GetCommandInvocationRequest, callback: Callback[GetCommandInvocationResult]): Unit = js.native
    def getCommandInvocation(params: GetCommandInvocationRequest): Request[GetCommandInvocationResult] = js.native
    def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest, callback: Callback[GetDefaultPatchBaselineResult]): Unit = js.native
    def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest): Request[GetDefaultPatchBaselineResult] = js.native
    def getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest, callback: Callback[GetDeployablePatchSnapshotForInstanceResult]): Unit = js.native
    def getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest): Request[GetDeployablePatchSnapshotForInstanceResult] = js.native
    def getDocument(params: GetDocumentRequest, callback: Callback[GetDocumentResult]): Unit = js.native
    def getDocument(params: GetDocumentRequest): Request[GetDocumentResult] = js.native
    def getInventory(params: GetInventoryRequest, callback: Callback[GetInventoryResult]): Unit = js.native
    def getInventory(params: GetInventoryRequest): Request[GetInventoryResult] = js.native
    def getInventorySchema(params: GetInventorySchemaRequest, callback: Callback[GetInventorySchemaResult]): Unit = js.native
    def getInventorySchema(params: GetInventorySchemaRequest): Request[GetInventorySchemaResult] = js.native
    def getMaintenanceWindow(params: GetMaintenanceWindowRequest, callback: Callback[GetMaintenanceWindowResult]): Unit = js.native
    def getMaintenanceWindow(params: GetMaintenanceWindowRequest): Request[GetMaintenanceWindowResult] = js.native
    def getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest, callback: Callback[GetMaintenanceWindowExecutionResult]): Unit = js.native
    def getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest): Request[GetMaintenanceWindowExecutionResult] = js.native
    def getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest, callback: Callback[GetMaintenanceWindowExecutionTaskResult]): Unit = js.native
    def getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest): Request[GetMaintenanceWindowExecutionTaskResult] = js.native
    def getParameterHistory(params: GetParameterHistoryRequest, callback: Callback[GetParameterHistoryResult]): Unit = js.native
    def getParameterHistory(params: GetParameterHistoryRequest): Request[GetParameterHistoryResult] = js.native
    def getParameters(params: GetParametersRequest, callback: Callback[GetParametersResult]): Unit = js.native
    def getParameters(params: GetParametersRequest): Request[GetParametersResult] = js.native
    def getPatchBaseline(params: GetPatchBaselineRequest, callback: Callback[GetPatchBaselineResult]): Unit = js.native
    def getPatchBaseline(params: GetPatchBaselineRequest): Request[GetPatchBaselineResult] = js.native
    def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest, callback: Callback[GetPatchBaselineForPatchGroupResult]): Unit = js.native
    def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest): Request[GetPatchBaselineForPatchGroupResult] = js.native
    def listAssociations(params: ListAssociationsRequest, callback: Callback[ListAssociationsResult]): Unit = js.native
    def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResult] = js.native
    def listCommandInvocations(params: ListCommandInvocationsRequest, callback: Callback[ListCommandInvocationsResult]): Unit = js.native
    def listCommandInvocations(params: ListCommandInvocationsRequest): Request[ListCommandInvocationsResult] = js.native
    def listCommands(params: ListCommandsRequest, callback: Callback[ListCommandsResult]): Unit = js.native
    def listCommands(params: ListCommandsRequest): Request[ListCommandsResult] = js.native
    def listDocumentVersions(params: ListDocumentVersionsRequest, callback: Callback[ListDocumentVersionsResult]): Unit = js.native
    def listDocumentVersions(params: ListDocumentVersionsRequest): Request[ListDocumentVersionsResult] = js.native
    def listDocuments(params: ListDocumentsRequest, callback: Callback[ListDocumentsResult]): Unit = js.native
    def listDocuments(params: ListDocumentsRequest): Request[ListDocumentsResult] = js.native
    def listInventoryEntries(params: ListInventoryEntriesRequest, callback: Callback[ListInventoryEntriesResult]): Unit = js.native
    def listInventoryEntries(params: ListInventoryEntriesRequest): Request[ListInventoryEntriesResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest, callback: Callback[ListTagsForResourceResult]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def modifyDocumentPermission(params: ModifyDocumentPermissionRequest, callback: Callback[ModifyDocumentPermissionResponse]): Unit = js.native
    def modifyDocumentPermission(params: ModifyDocumentPermissionRequest): Request[ModifyDocumentPermissionResponse] = js.native
    def putInventory(params: PutInventoryRequest, callback: Callback[PutInventoryResult]): Unit = js.native
    def putInventory(params: PutInventoryRequest): Request[PutInventoryResult] = js.native
    def putParameter(params: PutParameterRequest, callback: Callback[PutParameterResult]): Unit = js.native
    def putParameter(params: PutParameterRequest): Request[PutParameterResult] = js.native
    def registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest, callback: Callback[RegisterDefaultPatchBaselineResult]): Unit = js.native
    def registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest): Request[RegisterDefaultPatchBaselineResult] = js.native
    def registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest, callback: Callback[RegisterPatchBaselineForPatchGroupResult]): Unit = js.native
    def registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest): Request[RegisterPatchBaselineForPatchGroupResult] = js.native
    def registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest, callback: Callback[RegisterTargetWithMaintenanceWindowResult]): Unit = js.native
    def registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest): Request[RegisterTargetWithMaintenanceWindowResult] = js.native
    def registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest, callback: Callback[RegisterTaskWithMaintenanceWindowResult]): Unit = js.native
    def registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest): Request[RegisterTaskWithMaintenanceWindowResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest, callback: Callback[RemoveTagsFromResourceResult]): Unit = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult] = js.native
    def sendCommand(params: SendCommandRequest, callback: Callback[SendCommandResult]): Unit = js.native
    def sendCommand(params: SendCommandRequest): Request[SendCommandResult] = js.native
    def startAutomationExecution(params: StartAutomationExecutionRequest, callback: Callback[StartAutomationExecutionResult]): Unit = js.native
    def startAutomationExecution(params: StartAutomationExecutionRequest): Request[StartAutomationExecutionResult] = js.native
    def stopAutomationExecution(params: StopAutomationExecutionRequest, callback: Callback[StopAutomationExecutionResult]): Unit = js.native
    def stopAutomationExecution(params: StopAutomationExecutionRequest): Request[StopAutomationExecutionResult] = js.native
    def updateAssociation(params: UpdateAssociationRequest, callback: Callback[UpdateAssociationResult]): Unit = js.native
    def updateAssociation(params: UpdateAssociationRequest): Request[UpdateAssociationResult] = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest, callback: Callback[UpdateAssociationStatusResult]): Unit = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest): Request[UpdateAssociationStatusResult] = js.native
    def updateDocument(params: UpdateDocumentRequest, callback: Callback[UpdateDocumentResult]): Unit = js.native
    def updateDocument(params: UpdateDocumentRequest): Request[UpdateDocumentResult] = js.native
    def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest, callback: Callback[UpdateDocumentDefaultVersionResult]): Unit = js.native
    def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest): Request[UpdateDocumentDefaultVersionResult] = js.native
    def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest, callback: Callback[UpdateMaintenanceWindowResult]): Unit = js.native
    def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): Request[UpdateMaintenanceWindowResult] = js.native
    def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest, callback: Callback[UpdateManagedInstanceRoleResult]): Unit = js.native
    def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): Request[UpdateManagedInstanceRoleResult] = js.native
    def updatePatchBaseline(params: UpdatePatchBaselineRequest, callback: Callback[UpdatePatchBaselineResult]): Unit = js.native
    def updatePatchBaseline(params: UpdatePatchBaselineRequest): Request[UpdatePatchBaselineResult] = js.native
  }

  /**
   * <p>An activation registers one or more on-premises servers or virtual machines (VMs) with AWS so that you can configure those servers or VMs using Run Command. A server or VM that has been registered with AWS is called a managed instance.</p>
   */
  @js.native
  trait Activation extends js.Object {
    var CreatedDate: CreatedDate
    var Description: ActivationDescription
    var ExpirationDate: ExpirationDate
    var DefaultInstanceName: DefaultInstanceName
    var ActivationId: ActivationId
    var RegistrationLimit: RegistrationLimit
    var RegistrationsCount: RegistrationsCount
    var IamRole: IamRole
    var Expired: Boolean
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
      Expired: js.UndefOr[Boolean] = js.undefined
    ): Activation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ExpirationDate" -> ExpirationDate.map { x => x: js.Any }),
        ("DefaultInstanceName" -> DefaultInstanceName.map { x => x: js.Any }),
        ("ActivationId" -> ActivationId.map { x => x: js.Any }),
        ("RegistrationLimit" -> RegistrationLimit.map { x => x: js.Any }),
        ("RegistrationsCount" -> RegistrationsCount.map { x => x: js.Any }),
        ("IamRole" -> IamRole.map { x => x: js.Any }),
        ("Expired" -> Expired.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Activation]
    }
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceType: ResourceTypeForTagging
    var ResourceId: ResourceId
    var Tags: TagList
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceTypeForTagging] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResult extends js.Object {

  }

  object AddTagsToResourceResult {
    def apply(

    ): AddTagsToResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceResult]
    }
  }

  /**
   * <p>Error returned if an attempt is made to register a patch group with a patch baseline that is already registered with a different patch baseline.</p>
   */
  @js.native
  trait AlreadyExistsExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>You must disassociate an SSM document from all instances before you can delete it.</p>
   */
  @js.native
  trait AssociatedInstancesException extends js.Object {

  }

  /**
   * <p>Describes an association of an SSM document and an instance.</p>
   */
  @js.native
  trait Association extends js.Object {
    var Name: DocumentName
    var LastExecutionDate: DateTime
    var DocumentVersion: DocumentVersion
    var InstanceId: InstanceId
    var ScheduleExpression: ScheduleExpression
    var Overview: AssociationOverview
    var Targets: Targets
    var AssociationId: AssociationId
  }

  object Association {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Overview: js.UndefOr[AssociationOverview] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined
    ): Association = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("LastExecutionDate" -> LastExecutionDate.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ScheduleExpression" -> ScheduleExpression.map { x => x: js.Any }),
        ("Overview" -> Overview.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Association]
    }
  }

  /**
   * <p>The specified association already exists.</p>
   */
  @js.native
  trait AssociationAlreadyExistsException extends js.Object {

  }

  /**
   * <p>Describes the parameters for a document.</p>
   */
  @js.native
  trait AssociationDescription extends js.Object {
    var Name: DocumentName
    var LastSuccessfulExecutionDate: DateTime
    var Parameters: Parameters
    var LastExecutionDate: DateTime
    var DocumentVersion: DocumentVersion
    var InstanceId: InstanceId
    var ScheduleExpression: ScheduleExpression
    var Overview: AssociationOverview
    var LastUpdateAssociationDate: DateTime
    var Date: DateTime
    var Targets: Targets
    var AssociationId: AssociationId
    var Status: AssociationStatus
    var OutputLocation: InstanceAssociationOutputLocation
  }

  object AssociationDescription {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Overview: js.UndefOr[AssociationOverview] = js.undefined,
      LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined,
      Date: js.UndefOr[DateTime] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Status: js.UndefOr[AssociationStatus] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    ): AssociationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("LastSuccessfulExecutionDate" -> LastSuccessfulExecutionDate.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("LastExecutionDate" -> LastExecutionDate.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ScheduleExpression" -> ScheduleExpression.map { x => x: js.Any }),
        ("Overview" -> Overview.map { x => x: js.Any }),
        ("LastUpdateAssociationDate" -> LastUpdateAssociationDate.map { x => x: js.Any }),
        ("Date" -> Date.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("OutputLocation" -> OutputLocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationDescription]
    }
  }

  /**
   * <p>The specified association does not exist.</p>
   */
  @js.native
  trait AssociationDoesNotExistException extends js.Object {
    var Message: String
  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait AssociationFilter extends js.Object {
    var key: AssociationFilterKey
    var value: AssociationFilterValue
  }

  object AssociationFilter {
    def apply(
      key: js.UndefOr[AssociationFilterKey] = js.undefined,
      value: js.UndefOr[AssociationFilterValue] = js.undefined
    ): AssociationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("key" -> key.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

    val values = IndexedSeq(InstanceId, Name, AssociationId, AssociationStatusName, LastExecutedBefore, LastExecutedAfter)
  }

  /**
   * <p>You can have at most 2,000 active associations.</p>
   */
  @js.native
  trait AssociationLimitExceededException extends js.Object {

  }

  /**
   * <p>Information about the association.</p>
   */
  @js.native
  trait AssociationOverview extends js.Object {
    var Status: StatusName
    var DetailedStatus: StatusName
    var AssociationStatusAggregatedCount: AssociationStatusAggregatedCount
  }

  object AssociationOverview {
    def apply(
      Status: js.UndefOr[StatusName] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount] = js.undefined
    ): AssociationOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("DetailedStatus" -> DetailedStatus.map { x => x: js.Any }),
        ("AssociationStatusAggregatedCount" -> AssociationStatusAggregatedCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationOverview]
    }
  }

  /**
   * <p>Describes an association status.</p>
   */
  @js.native
  trait AssociationStatus extends js.Object {
    var Date: DateTime
    var Name: AssociationStatusName
    var Message: StatusMessage
    var AdditionalInfo: StatusAdditionalInfo
  }

  object AssociationStatus {
    def apply(
      Date: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[AssociationStatusName] = js.undefined,
      Message: js.UndefOr[StatusMessage] = js.undefined,
      AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
    ): AssociationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Date" -> Date.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>An Automation document with the specified name could not be found.</p>
   */
  @js.native
  trait AutomationDefinitionNotFoundExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>An Automation document with the specified name and version could not be found.</p>
   */
  @js.native
  trait AutomationDefinitionVersionNotFoundExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>Detailed information about the current state of an individual Automation execution.</p>
   */
  @js.native
  trait AutomationExecution extends js.Object {
    var FailureMessage: String
    var StepExecutions: StepExecutionList
    var Parameters: AutomationParameterMap
    var ExecutionStartTime: DateTime
    var ExecutionEndTime: DateTime
    var DocumentVersion: DocumentVersion
    var DocumentName: DocumentName
    var AutomationExecutionId: AutomationExecutionId
    var AutomationExecutionStatus: AutomationExecutionStatus
    var Outputs: AutomationParameterMap
  }

  object AutomationExecution {
    def apply(
      FailureMessage: js.UndefOr[String] = js.undefined,
      StepExecutions: js.UndefOr[StepExecutionList] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
    ): AutomationExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailureMessage" -> FailureMessage.map { x => x: js.Any }),
        ("StepExecutions" -> StepExecutions.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("ExecutionStartTime" -> ExecutionStartTime.map { x => x: js.Any }),
        ("ExecutionEndTime" -> ExecutionEndTime.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("AutomationExecutionId" -> AutomationExecutionId.map { x => x: js.Any }),
        ("AutomationExecutionStatus" -> AutomationExecutionStatus.map { x => x: js.Any }),
        ("Outputs" -> Outputs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecution]
    }
  }

  /**
   * <p>A filter used to match specific automation executions. This is used to limit the scope of Automation execution information returned.</p>
   */
  @js.native
  trait AutomationExecutionFilter extends js.Object {
    var Key: AutomationExecutionFilterKey
    var Values: AutomationExecutionFilterValueList
  }

  object AutomationExecutionFilter {
    def apply(
      Key: js.UndefOr[AutomationExecutionFilterKey] = js.undefined,
      Values: js.UndefOr[AutomationExecutionFilterValueList] = js.undefined
    ): AutomationExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecutionFilter]
    }
  }


  object AutomationExecutionFilterKeyEnum {
    val DocumentNamePrefix = "DocumentNamePrefix"
    val ExecutionStatus = "ExecutionStatus"

    val values = IndexedSeq(DocumentNamePrefix, ExecutionStatus)
  }

  /**
   * <p>The number of simultaneously running Automation executions exceeded the allowable limit.</p>
   */
  @js.native
  trait AutomationExecutionLimitExceededExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>Details about a specific Automation execution.</p>
   */
  @js.native
  trait AutomationExecutionMetadata extends js.Object {
    var LogFile: String
    var ExecutionStartTime: DateTime
    var ExecutionEndTime: DateTime
    var DocumentVersion: DocumentVersion
    var DocumentName: DocumentName
    var AutomationExecutionId: AutomationExecutionId
    var ExecutedBy: String
    var AutomationExecutionStatus: AutomationExecutionStatus
    var Outputs: AutomationParameterMap
  }

  object AutomationExecutionMetadata {
    def apply(
      LogFile: js.UndefOr[String] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
      ExecutedBy: js.UndefOr[String] = js.undefined,
      AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
    ): AutomationExecutionMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogFile" -> LogFile.map { x => x: js.Any }),
        ("ExecutionStartTime" -> ExecutionStartTime.map { x => x: js.Any }),
        ("ExecutionEndTime" -> ExecutionEndTime.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("AutomationExecutionId" -> AutomationExecutionId.map { x => x: js.Any }),
        ("ExecutedBy" -> ExecutedBy.map { x => x: js.Any }),
        ("AutomationExecutionStatus" -> AutomationExecutionStatus.map { x => x: js.Any }),
        ("Outputs" -> Outputs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutomationExecutionMetadata]
    }
  }

  /**
   * <p>There is no automation execution information for the requested automation execution ID.</p>
   */
  @js.native
  trait AutomationExecutionNotFoundExceptionException extends js.Object {
    var Message: String
  }


  object AutomationExecutionStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Success = "Success"
    val TimedOut = "TimedOut"
    val Cancelled = "Cancelled"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, InProgress, Success, TimedOut, Cancelled, Failed)
  }

  /**
   * <p/>
   */
  @js.native
  trait CancelCommandRequest extends js.Object {
    var CommandId: CommandId
    var InstanceIds: InstanceIdList
  }

  object CancelCommandRequest {
    def apply(
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
    ): CancelCommandRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CancelCommandResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCommandResult]
    }
  }

  /**
   * <p>Describes a command request.</p>
   */
  @js.native
  trait Command extends js.Object {
    var StatusDetails: StatusDetails
    var MaxErrors: VelocityConstraint
    var OutputS3BucketName: S3BucketName
    var NotificationConfig: NotificationConfig
    var MaxConcurrency: VelocityConstraint
    var ErrorCount: ErrorCount
    var TargetCount: TargetCount
    var ServiceRole: ServiceRole
    var ExpiresAfter: DateTime
    var Parameters: Parameters
    var OutputS3Region: S3Region
    var CompletedCount: CompletedCount
    var CommandId: CommandId
    var InstanceIds: InstanceIdList
    var DocumentName: DocumentName
    var OutputS3KeyPrefix: S3KeyPrefix
    var RequestedDateTime: DateTime
    var Targets: Targets
    var Comment: Comment
    var Status: CommandStatus
  }

  object Command {
    def apply(
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      MaxErrors: js.UndefOr[VelocityConstraint] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      MaxConcurrency: js.UndefOr[VelocityConstraint] = js.undefined,
      ErrorCount: js.UndefOr[ErrorCount] = js.undefined,
      TargetCount: js.UndefOr[TargetCount] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      ExpiresAfter: js.UndefOr[DateTime] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      CompletedCount: js.UndefOr[CompletedCount] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      RequestedDateTime: js.UndefOr[DateTime] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      Status: js.UndefOr[CommandStatus] = js.undefined
    ): Command = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("MaxErrors" -> MaxErrors.map { x => x: js.Any }),
        ("OutputS3BucketName" -> OutputS3BucketName.map { x => x: js.Any }),
        ("NotificationConfig" -> NotificationConfig.map { x => x: js.Any }),
        ("MaxConcurrency" -> MaxConcurrency.map { x => x: js.Any }),
        ("ErrorCount" -> ErrorCount.map { x => x: js.Any }),
        ("TargetCount" -> TargetCount.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("ExpiresAfter" -> ExpiresAfter.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("OutputS3Region" -> OutputS3Region.map { x => x: js.Any }),
        ("CompletedCount" -> CompletedCount.map { x => x: js.Any }),
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x: js.Any }),
        ("RequestedDateTime" -> RequestedDateTime.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }

  /**
   * <p>Describes a command filter.</p>
   */
  @js.native
  trait CommandFilter extends js.Object {
    var key: CommandFilterKey
    var value: CommandFilterValue
  }

  object CommandFilter {
    def apply(
      key: js.UndefOr[CommandFilterKey] = js.undefined,
      value: js.UndefOr[CommandFilterValue] = js.undefined
    ): CommandFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("key" -> key.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommandFilter]
    }
  }


  object CommandFilterKeyEnum {
    val InvokedAfter = "InvokedAfter"
    val InvokedBefore = "InvokedBefore"
    val Status = "Status"

    val values = IndexedSeq(InvokedAfter, InvokedBefore, Status)
  }

  /**
   * <p>An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user executes SendCommand against three instances, then a command invocation is created for each requested instance ID. A command invocation returns status and detail information about a command you executed. </p>
   */
  @js.native
  trait CommandInvocation extends js.Object {
    var StatusDetails: StatusDetails
    var CommandPlugins: CommandPluginList
    var NotificationConfig: NotificationConfig
    var ServiceRole: ServiceRole
    var TraceOutput: InvocationTraceOutput
    var InstanceName: InstanceTagName
    var StandardErrorUrl: Url
    var StandardOutputUrl: Url
    var CommandId: CommandId
    var InstanceId: InstanceId
    var DocumentName: DocumentName
    var RequestedDateTime: DateTime
    var Comment: Comment
    var Status: CommandInvocationStatus
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
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      RequestedDateTime: js.UndefOr[DateTime] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      Status: js.UndefOr[CommandInvocationStatus] = js.undefined
    ): CommandInvocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("CommandPlugins" -> CommandPlugins.map { x => x: js.Any }),
        ("NotificationConfig" -> NotificationConfig.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("TraceOutput" -> TraceOutput.map { x => x: js.Any }),
        ("InstanceName" -> InstanceName.map { x => x: js.Any }),
        ("StandardErrorUrl" -> StandardErrorUrl.map { x => x: js.Any }),
        ("StandardOutputUrl" -> StandardOutputUrl.map { x => x: js.Any }),
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("RequestedDateTime" -> RequestedDateTime.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var StatusDetails: StatusDetails
    var OutputS3BucketName: S3BucketName
    var ResponseStartDateTime: DateTime
    var Name: CommandPluginName
    var StandardErrorUrl: Url
    var OutputS3Region: S3Region
    var ResponseCode: ResponseCode
    var StandardOutputUrl: Url
    var Output: CommandPluginOutput
    var ResponseFinishDateTime: DateTime
    var OutputS3KeyPrefix: S3KeyPrefix
    var Status: CommandPluginStatus
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
      Status: js.UndefOr[CommandPluginStatus] = js.undefined
    ): CommandPlugin = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("OutputS3BucketName" -> OutputS3BucketName.map { x => x: js.Any }),
        ("ResponseStartDateTime" -> ResponseStartDateTime.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("StandardErrorUrl" -> StandardErrorUrl.map { x => x: js.Any }),
        ("OutputS3Region" -> OutputS3Region.map { x => x: js.Any }),
        ("ResponseCode" -> ResponseCode.map { x => x: js.Any }),
        ("StandardOutputUrl" -> StandardOutputUrl.map { x => x: js.Any }),
        ("Output" -> Output.map { x => x: js.Any }),
        ("ResponseFinishDateTime" -> ResponseFinishDateTime.map { x => x: js.Any }),
        ("OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

  @js.native
  trait CreateActivationRequest extends js.Object {
    var Description: ActivationDescription
    var ExpirationDate: ExpirationDate
    var DefaultInstanceName: DefaultInstanceName
    var RegistrationLimit: RegistrationLimit
    var IamRole: IamRole
  }

  object CreateActivationRequest {
    def apply(
      Description: js.UndefOr[ActivationDescription] = js.undefined,
      ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
      DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
      RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined
    ): CreateActivationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("ExpirationDate" -> ExpirationDate.map { x => x: js.Any }),
        ("DefaultInstanceName" -> DefaultInstanceName.map { x => x: js.Any }),
        ("RegistrationLimit" -> RegistrationLimit.map { x => x: js.Any }),
        ("IamRole" -> IamRole.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivationRequest]
    }
  }

  @js.native
  trait CreateActivationResult extends js.Object {
    var ActivationId: ActivationId
    var ActivationCode: ActivationCode
  }

  object CreateActivationResult {
    def apply(
      ActivationId: js.UndefOr[ActivationId] = js.undefined,
      ActivationCode: js.UndefOr[ActivationCode] = js.undefined
    ): CreateActivationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ActivationId" -> ActivationId.map { x => x: js.Any }),
        ("ActivationCode" -> ActivationCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivationResult]
    }
  }

  @js.native
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: CreateAssociationBatchRequestEntries
  }

  object CreateAssociationBatchRequest {
    def apply(
      Entries: js.UndefOr[CreateAssociationBatchRequestEntries] = js.undefined
    ): CreateAssociationBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Entries" -> Entries.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequest]
    }
  }

  /**
   * <p> Describes the association of an SSM document and an instance. </p>
   */
  @js.native
  trait CreateAssociationBatchRequestEntry extends js.Object {
    var Name: DocumentName
    var Parameters: Parameters
    var DocumentVersion: DocumentVersion
    var InstanceId: InstanceId
    var ScheduleExpression: ScheduleExpression
    var Targets: Targets
    var OutputLocation: InstanceAssociationOutputLocation
  }

  object CreateAssociationBatchRequestEntry {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    ): CreateAssociationBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ScheduleExpression" -> ScheduleExpression.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("OutputLocation" -> OutputLocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequestEntry]
    }
  }

  @js.native
  trait CreateAssociationBatchResult extends js.Object {
    var Successful: AssociationDescriptionList
    var Failed: FailedCreateAssociationList
  }

  object CreateAssociationBatchResult {
    def apply(
      Successful: js.UndefOr[AssociationDescriptionList] = js.undefined,
      Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined
    ): CreateAssociationBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Failed" -> Failed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchResult]
    }
  }

  @js.native
  trait CreateAssociationRequest extends js.Object {
    var Name: DocumentName
    var Parameters: Parameters
    var DocumentVersion: DocumentVersion
    var InstanceId: InstanceId
    var ScheduleExpression: ScheduleExpression
    var Targets: Targets
    var OutputLocation: InstanceAssociationOutputLocation
  }

  object CreateAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    ): CreateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ScheduleExpression" -> ScheduleExpression.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("OutputLocation" -> OutputLocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationRequest]
    }
  }

  @js.native
  trait CreateAssociationResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object CreateAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): CreateAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationResult]
    }
  }

  @js.native
  trait CreateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var DocumentType: DocumentType
  }

  object CreateDocumentRequest {
    def apply(
      Content: js.UndefOr[DocumentContent] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined
    ): CreateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Content" -> Content.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentType" -> DocumentType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentRequest]
    }
  }

  @js.native
  trait CreateDocumentResult extends js.Object {
    var DocumentDescription: DocumentDescription
  }

  object CreateDocumentResult {
    def apply(
      DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): CreateDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentDescription" -> DocumentDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentResult]
    }
  }

  @js.native
  trait CreateMaintenanceWindowRequest extends js.Object {
    var Name: MaintenanceWindowName
    var Duration: MaintenanceWindowDurationHours
    var ClientToken: ClientToken
    var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
    var Cutoff: MaintenanceWindowCutoff
    var Schedule: MaintenanceWindowSchedule
  }

  object CreateMaintenanceWindowRequest {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    ): CreateMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x: js.Any }),
        ("Cutoff" -> Cutoff.map { x => x: js.Any }),
        ("Schedule" -> Schedule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait CreateMaintenanceWindowResult extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object CreateMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): CreateMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMaintenanceWindowResult]
    }
  }

  @js.native
  trait CreatePatchBaselineRequest extends js.Object {
    var Name: BaselineName
    var ClientToken: ClientToken
    var Description: BaselineDescription
    var ApprovalRules: PatchRuleGroup
    var ApprovedPatches: PatchIdList
    var RejectedPatches: PatchIdList
    var GlobalFilters: PatchFilterGroup
  }

  object CreatePatchBaselineRequest {
    def apply(
      Name: js.UndefOr[BaselineName] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    ): CreatePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ApprovalRules" -> ApprovalRules.map { x => x: js.Any }),
        ("ApprovedPatches" -> ApprovedPatches.map { x => x: js.Any }),
        ("RejectedPatches" -> RejectedPatches.map { x => x: js.Any }),
        ("GlobalFilters" -> GlobalFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePatchBaselineRequest]
    }
  }

  @js.native
  trait CreatePatchBaselineResult extends js.Object {
    var BaselineId: BaselineId
  }

  object CreatePatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): CreatePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePatchBaselineResult]
    }
  }

  /**
   * <p>You have exceeded the limit for custom schemas. Delete one or more custom schemas and try again.</p>
   */
  @js.native
  trait CustomSchemaCountLimitExceededExceptionException extends js.Object {
    var Message: String
  }

  @js.native
  trait DeleteActivationRequest extends js.Object {
    var ActivationId: ActivationId
  }

  object DeleteActivationRequest {
    def apply(
      ActivationId: js.UndefOr[ActivationId] = js.undefined
    ): DeleteActivationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ActivationId" -> ActivationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivationRequest]
    }
  }

  @js.native
  trait DeleteActivationResult extends js.Object {

  }

  object DeleteActivationResult {
    def apply(

    ): DeleteActivationResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivationResult]
    }
  }

  @js.native
  trait DeleteAssociationRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
    var AssociationId: AssociationId
  }

  object DeleteAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined
    ): DeleteAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssociationResult extends js.Object {

  }

  object DeleteAssociationResult {
    def apply(

    ): DeleteAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssociationResult]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var Name: DocumentName
  }

  object DeleteDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined
    ): DeleteDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteDocumentResult extends js.Object {

  }

  object DeleteDocumentResult {
    def apply(

    ): DeleteDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentResult]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object DeleteMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): DeleteMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowResult extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object DeleteMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): DeleteMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMaintenanceWindowResult]
    }
  }

  @js.native
  trait DeleteParameterRequest extends js.Object {
    var Name: PSParameterName
  }

  object DeleteParameterRequest {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined
    ): DeleteParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParameterRequest]
    }
  }

  @js.native
  trait DeleteParameterResult extends js.Object {

  }

  object DeleteParameterResult {
    def apply(

    ): DeleteParameterResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParameterResult]
    }
  }

  @js.native
  trait DeletePatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object DeletePatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): DeletePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePatchBaselineRequest]
    }
  }

  @js.native
  trait DeletePatchBaselineResult extends js.Object {
    var BaselineId: BaselineId
  }

  object DeletePatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): DeletePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePatchBaselineResult]
    }
  }

  @js.native
  trait DeregisterManagedInstanceRequest extends js.Object {
    var InstanceId: ManagedInstanceId
  }

  object DeregisterManagedInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[ManagedInstanceId] = js.undefined
    ): DeregisterManagedInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterManagedInstanceRequest]
    }
  }

  @js.native
  trait DeregisterManagedInstanceResult extends js.Object {

  }

  object DeregisterManagedInstanceResult {
    def apply(

    ): DeregisterManagedInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

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
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): DeregisterPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object DeregisterPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): DeregisterPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
  }

  object DeregisterTargetFromMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): DeregisterTargetFromMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("WindowTargetId" -> WindowTargetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
  }

  object DeregisterTargetFromMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): DeregisterTargetFromMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("WindowTargetId" -> WindowTargetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): DeregisterTaskFromMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("WindowTaskId" -> WindowTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  object DeregisterTaskFromMaintenanceWindowResult {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): DeregisterTaskFromMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("WindowTaskId" -> WindowTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
    }
  }

  /**
   * <p>Filter for the DescribeActivation API.</p>
   */
  @js.native
  trait DescribeActivationsFilter extends js.Object {
    var FilterKey: DescribeActivationsFilterKeys
    var FilterValues: StringList
  }

  object DescribeActivationsFilter {
    def apply(
      FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.undefined,
      FilterValues: js.UndefOr[StringList] = js.undefined
    ): DescribeActivationsFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FilterKey" -> FilterKey.map { x => x: js.Any }),
        ("FilterValues" -> FilterValues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Filters: DescribeActivationsFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object DescribeActivationsRequest {
    def apply(
      Filters: js.UndefOr[DescribeActivationsFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActivationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivationsRequest]
    }
  }

  @js.native
  trait DescribeActivationsResult extends js.Object {
    var ActivationList: ActivationList
    var NextToken: NextToken
  }

  object DescribeActivationsResult {
    def apply(
      ActivationList: js.UndefOr[ActivationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActivationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ActivationList" -> ActivationList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivationsResult]
    }
  }

  @js.native
  trait DescribeAssociationRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
    var AssociationId: AssociationId
  }

  object DescribeAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined
    ): DescribeAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationRequest]
    }
  }

  @js.native
  trait DescribeAssociationResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object DescribeAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): DescribeAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationResult]
    }
  }

  @js.native
  trait DescribeAutomationExecutionsRequest extends js.Object {
    var Filters: AutomationExecutionFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object DescribeAutomationExecutionsRequest {
    def apply(
      Filters: js.UndefOr[AutomationExecutionFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAutomationExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAutomationExecutionsResult extends js.Object {
    var AutomationExecutionMetadataList: AutomationExecutionMetadataList
    var NextToken: NextToken
  }

  object DescribeAutomationExecutionsResult {
    def apply(
      AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAutomationExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutomationExecutionMetadataList" -> AutomationExecutionMetadataList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutomationExecutionsResult]
    }
  }

  @js.native
  trait DescribeAvailablePatchesRequest extends js.Object {
    var Filters: PatchOrchestratorFilterList
    var MaxResults: PatchBaselineMaxResults
    var NextToken: NextToken
  }

  object DescribeAvailablePatchesRequest {
    def apply(
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAvailablePatchesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailablePatchesRequest]
    }
  }

  @js.native
  trait DescribeAvailablePatchesResult extends js.Object {
    var Patches: PatchList
    var NextToken: NextToken
  }

  object DescribeAvailablePatchesResult {
    def apply(
      Patches: js.UndefOr[PatchList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAvailablePatchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Patches" -> Patches.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Name: js.UndefOr[DocumentName] = js.undefined,
      PermissionType: js.UndefOr[DocumentPermissionType] = js.undefined
    ): DescribeDocumentPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("PermissionType" -> PermissionType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentPermissionRequest]
    }
  }

  @js.native
  trait DescribeDocumentPermissionResponse extends js.Object {
    var AccountIds: AccountIdList
  }

  object DescribeDocumentPermissionResponse {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined
    ): DescribeDocumentPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountIds" -> AccountIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentPermissionResponse]
    }
  }

  @js.native
  trait DescribeDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentVersion: DocumentVersion
  }

  object DescribeDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    ): DescribeDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentRequest]
    }
  }

  @js.native
  trait DescribeDocumentResult extends js.Object {
    var Document: DocumentDescription
  }

  object DescribeDocumentResult {
    def apply(
      Document: js.UndefOr[DocumentDescription] = js.undefined
    ): DescribeDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Document" -> Document.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentResult]
    }
  }

  @js.native
  trait DescribeEffectiveInstanceAssociationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: EffectiveInstanceAssociationMaxResults
    var NextToken: NextToken
  }

  object DescribeEffectiveInstanceAssociationsRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectiveInstanceAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectiveInstanceAssociationsRequest]
    }
  }

  @js.native
  trait DescribeEffectiveInstanceAssociationsResult extends js.Object {
    var Associations: InstanceAssociationList
    var NextToken: NextToken
  }

  object DescribeEffectiveInstanceAssociationsResult {
    def apply(
      Associations: js.UndefOr[InstanceAssociationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectiveInstanceAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Associations" -> Associations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectiveInstanceAssociationsResult]
    }
  }

  @js.native
  trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
    var MaxResults: PatchBaselineMaxResults
    var NextToken: NextToken
  }

  object DescribeEffectivePatchesForPatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectivePatchesForPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
    }
  }

  @js.native
  trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
    var EffectivePatches: EffectivePatchList
    var NextToken: NextToken
  }

  object DescribeEffectivePatchesForPatchBaselineResult {
    def apply(
      EffectivePatches: js.UndefOr[EffectivePatchList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectivePatchesForPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EffectivePatches" -> EffectivePatches.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
    }
  }

  @js.native
  trait DescribeInstanceAssociationsStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object DescribeInstanceAssociationsStatusRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceAssociationsStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceAssociationsStatusRequest]
    }
  }

  @js.native
  trait DescribeInstanceAssociationsStatusResult extends js.Object {
    var InstanceAssociationStatusInfos: InstanceAssociationStatusInfos
    var NextToken: NextToken
  }

  object DescribeInstanceAssociationsStatusResult {
    def apply(
      InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceAssociationsStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceAssociationStatusInfos" -> InstanceAssociationStatusInfos.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceAssociationsStatusResult]
    }
  }

  @js.native
  trait DescribeInstanceInformationRequest extends js.Object {
    var InstanceInformationFilterList: InstanceInformationFilterList
    var Filters: InstanceInformationStringFilterList
    var MaxResults: MaxResultsEC2Compatible
    var NextToken: NextToken
  }

  object DescribeInstanceInformationRequest {
    def apply(
      InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined,
      Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceInformationFilterList" -> InstanceInformationFilterList.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceInformationRequest]
    }
  }

  @js.native
  trait DescribeInstanceInformationResult extends js.Object {
    var InstanceInformationList: InstanceInformationList
    var NextToken: NextToken
  }

  object DescribeInstanceInformationResult {
    def apply(
      InstanceInformationList: js.UndefOr[InstanceInformationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceInformationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceInformationList" -> InstanceInformationList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceInformationResult]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
    var Filters: InstancePatchStateFilterList
    var NextToken: NextToken
    var MaxResults: PatchComplianceMaxResults
  }

  object DescribeInstancePatchStatesForPatchGroupRequest {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
    ): DescribeInstancePatchStatesForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
    var InstancePatchStates: InstancePatchStatesList
    var NextToken: NextToken
  }

  object DescribeInstancePatchStatesForPatchGroupResult {
    def apply(
      InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstancePatchStates" -> InstancePatchStates.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesRequest extends js.Object {
    var InstanceIds: InstanceIdList
    var NextToken: NextToken
    var MaxResults: PatchComplianceMaxResults
  }

  object DescribeInstancePatchStatesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
    ): DescribeInstancePatchStatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesResult extends js.Object {
    var InstancePatchStates: InstancePatchStateList
    var NextToken: NextToken
  }

  object DescribeInstancePatchStatesResult {
    def apply(
      InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstancePatchStates" -> InstancePatchStates.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchStatesResult]
    }
  }

  @js.native
  trait DescribeInstancePatchesRequest extends js.Object {
    var InstanceId: InstanceId
    var Filters: PatchOrchestratorFilterList
    var NextToken: NextToken
    var MaxResults: PatchComplianceMaxResults
  }

  object DescribeInstancePatchesRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
    ): DescribeInstancePatchesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchesResult extends js.Object {
    var Patches: PatchComplianceDataList
    var NextToken: NextToken
  }

  object DescribeInstancePatchesResult {
    def apply(
      Patches: js.UndefOr[PatchComplianceDataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Patches" -> Patches.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancePatchesResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTaskInvocationsRequest extends js.Object {
    var TaskId: MaintenanceWindowExecutionTaskId
    var MaxResults: MaintenanceWindowMaxResults
    var Filters: MaintenanceWindowFilterList
    var WindowExecutionId: MaintenanceWindowExecutionId
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
    def apply(
      TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TaskId" -> TaskId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
    var WindowExecutionTaskInvocationIdentities: MaintenanceWindowExecutionTaskInvocationIdentityList
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
    def apply(
      WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowExecutionTaskInvocationIdentities" -> WindowExecutionTaskInvocationIdentities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Filters: MaintenanceWindowFilterList
    var MaxResults: MaintenanceWindowMaxResults
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowExecutionTasksRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
    var WindowExecutionTaskIdentities: MaintenanceWindowExecutionTaskIdentityList
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowExecutionTasksResult {
    def apply(
      WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowExecutionTaskIdentities" -> WindowExecutionTaskIdentities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: MaintenanceWindowFilterList
    var MaxResults: MaintenanceWindowMaxResults
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowExecutionsRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
    var WindowExecutions: MaintenanceWindowExecutionList
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowExecutionsResult {
    def apply(
      WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowExecutions" -> WindowExecutions.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: MaintenanceWindowFilterList
    var MaxResults: MaintenanceWindowMaxResults
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowTargetsRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTargetsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsResult extends js.Object {
    var Targets: MaintenanceWindowTargetList
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowTargetsResult {
    def apply(
      Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTargetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTargetsResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: MaintenanceWindowFilterList
    var MaxResults: MaintenanceWindowMaxResults
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowTasksRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksResult extends js.Object {
    var Tasks: MaintenanceWindowTaskList
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowTasksResult {
    def apply(
      Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tasks" -> Tasks.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowTasksResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsRequest extends js.Object {
    var Filters: MaintenanceWindowFilterList
    var MaxResults: MaintenanceWindowMaxResults
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowsRequest {
    def apply(
      Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsResult extends js.Object {
    var WindowIdentities: MaintenanceWindowIdentityList
    var NextToken: NextToken
  }

  object DescribeMaintenanceWindowsResult {
    def apply(
      WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowIdentities" -> WindowIdentities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceWindowsResult]
    }
  }

  @js.native
  trait DescribeParametersRequest extends js.Object {
    var Filters: ParametersFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object DescribeParametersRequest {
    def apply(
      Filters: js.UndefOr[ParametersFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResult extends js.Object {
    var Parameters: ParameterMetadataList
    var NextToken: NextToken
  }

  object DescribeParametersResult {
    def apply(
      Parameters: js.UndefOr[ParameterMetadataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersResult]
    }
  }

  @js.native
  trait DescribePatchBaselinesRequest extends js.Object {
    var Filters: PatchOrchestratorFilterList
    var MaxResults: PatchBaselineMaxResults
    var NextToken: NextToken
  }

  object DescribePatchBaselinesRequest {
    def apply(
      Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchBaselinesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchBaselinesRequest]
    }
  }

  @js.native
  trait DescribePatchBaselinesResult extends js.Object {
    var BaselineIdentities: PatchBaselineIdentityList
    var NextToken: NextToken
  }

  object DescribePatchBaselinesResult {
    def apply(
      BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchBaselinesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineIdentities" -> BaselineIdentities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchBaselinesResult]
    }
  }

  @js.native
  trait DescribePatchGroupStateRequest extends js.Object {
    var PatchGroup: PatchGroup
  }

  object DescribePatchGroupStateRequest {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): DescribePatchGroupStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupStateRequest]
    }
  }

  @js.native
  trait DescribePatchGroupStateResult extends js.Object {
    var InstancesWithNotApplicablePatches: Integer
    var InstancesWithInstalledPatches: Integer
    var InstancesWithMissingPatches: Integer
    var InstancesWithFailedPatches: Integer
    var Instances: Integer
    var InstancesWithInstalledOtherPatches: Integer
  }

  object DescribePatchGroupStateResult {
    def apply(
      InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined,
      InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined,
      InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined,
      InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined,
      Instances: js.UndefOr[Integer] = js.undefined,
      InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined
    ): DescribePatchGroupStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstancesWithNotApplicablePatches" -> InstancesWithNotApplicablePatches.map { x => x: js.Any }),
        ("InstancesWithInstalledPatches" -> InstancesWithInstalledPatches.map { x => x: js.Any }),
        ("InstancesWithMissingPatches" -> InstancesWithMissingPatches.map { x => x: js.Any }),
        ("InstancesWithFailedPatches" -> InstancesWithFailedPatches.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("InstancesWithInstalledOtherPatches" -> InstancesWithInstalledOtherPatches.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupStateResult]
    }
  }

  @js.native
  trait DescribePatchGroupsRequest extends js.Object {
    var MaxResults: PatchBaselineMaxResults
    var NextToken: NextToken
  }

  object DescribePatchGroupsRequest {
    def apply(
      MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupsRequest]
    }
  }

  @js.native
  trait DescribePatchGroupsResult extends js.Object {
    var Mappings: PatchGroupPatchBaselineMappingList
    var NextToken: NextToken
  }

  object DescribePatchGroupsResult {
    def apply(
      Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Mappings" -> Mappings.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePatchGroupsResult]
    }
  }

  /**
   * <p>The specified SSM document already exists.</p>
   */
  @js.native
  trait DocumentAlreadyExistsException extends js.Object {
    var Message: String
  }

  /**
   * <p>A default version of a document.</p>
   */
  @js.native
  trait DocumentDefaultVersionDescription extends js.Object {
    var Name: DocumentName
    var DefaultVersion: DocumentVersion
  }

  object DocumentDefaultVersionDescription {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
    ): DocumentDefaultVersionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DefaultVersion" -> DefaultVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDefaultVersionDescription]
    }
  }

  /**
   * <p> Describes an SSM document. </p>
   */
  @js.native
  trait DocumentDescription extends js.Object {
    var Name: DocumentARN
    var CreatedDate: DateTime
    var SchemaVersion: DocumentSchemaVersion
    var Description: DescriptionInDocument
    var HashType: DocumentHashType
    var Parameters: DocumentParameterList
    var DefaultVersion: DocumentVersion
    var PlatformTypes: PlatformTypeList
    var DocumentVersion: DocumentVersion
    var Sha1: DocumentSha1
    var DocumentType: DocumentType
    var LatestVersion: DocumentVersion
    var Owner: DocumentOwner
    var Hash: DocumentHash
    var Status: DocumentStatus
  }

  object DocumentDescription {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
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
      LatestVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Owner: js.UndefOr[DocumentOwner] = js.undefined,
      Hash: js.UndefOr[DocumentHash] = js.undefined,
      Status: js.UndefOr[DocumentStatus] = js.undefined
    ): DocumentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("SchemaVersion" -> SchemaVersion.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("HashType" -> HashType.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("DefaultVersion" -> DefaultVersion.map { x => x: js.Any }),
        ("PlatformTypes" -> PlatformTypes.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("Sha1" -> Sha1.map { x => x: js.Any }),
        ("DocumentType" -> DocumentType.map { x => x: js.Any }),
        ("LatestVersion" -> LatestVersion.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("Hash" -> Hash.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDescription]
    }
  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait DocumentFilter extends js.Object {
    var key: DocumentFilterKey
    var value: DocumentFilterValue
  }

  object DocumentFilter {
    def apply(
      key: js.UndefOr[DocumentFilterKey] = js.undefined,
      value: js.UndefOr[DocumentFilterValue] = js.undefined
    ): DocumentFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("key" -> key.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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


  object DocumentHashTypeEnum {
    val Sha256 = "Sha256"
    val Sha1 = "Sha1"

    val values = IndexedSeq(Sha256, Sha1)
  }

  /**
   * <p>Describes the name of an SSM document.</p>
   */
  @js.native
  trait DocumentIdentifier extends js.Object {
    var Name: DocumentARN
    var SchemaVersion: DocumentSchemaVersion
    var PlatformTypes: PlatformTypeList
    var DocumentVersion: DocumentVersion
    var DocumentType: DocumentType
    var Owner: DocumentOwner
  }

  object DocumentIdentifier {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
      SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
      PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined,
      Owner: js.UndefOr[DocumentOwner] = js.undefined
    ): DocumentIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("SchemaVersion" -> SchemaVersion.map { x => x: js.Any }),
        ("PlatformTypes" -> PlatformTypes.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("DocumentType" -> DocumentType.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentIdentifier]
    }
  }

  /**
   * <p>You can have at most 200 active SSM documents.</p>
   */
  @js.native
  trait DocumentLimitExceededException extends js.Object {
    var Message: String
  }

  /**
   * <p>Parameters specified in the SSM document that execute on the server when the command is run. </p>
   */
  @js.native
  trait DocumentParameter extends js.Object {
    var Name: DocumentParameterName
    var Type: DocumentParameterType
    var Description: DocumentParameterDescrption
    var DefaultValue: DocumentParameterDefaultValue
  }

  object DocumentParameter {
    def apply(
      Name: js.UndefOr[DocumentParameterName] = js.undefined,
      Type: js.UndefOr[DocumentParameterType] = js.undefined,
      Description: js.UndefOr[DocumentParameterDescrption] = js.undefined,
      DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.undefined
    ): DocumentParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentParameter]
    }
  }


  object DocumentParameterTypeEnum {
    val String = "String"
    val StringList = "StringList"

    val values = IndexedSeq(String, StringList)
  }

  /**
   * <p>The document cannot be shared with more AWS user accounts. You can share a document with a maximum of 20 accounts. You can publicly share up to five documents. If you need to increase this limit, contact AWS Support.</p>
   */
  @js.native
  trait DocumentPermissionLimitException extends js.Object {
    var Message: String
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

    val values = IndexedSeq(Command, Policy, Automation)
  }

  /**
   * <p>Version information about the document.</p>
   */
  @js.native
  trait DocumentVersionInfo extends js.Object {
    var Name: DocumentName
    var DocumentVersion: DocumentVersion
    var CreatedDate: DateTime
    var IsDefaultVersion: Boolean
  }

  object DocumentVersionInfo {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      IsDefaultVersion: js.UndefOr[Boolean] = js.undefined
    ): DocumentVersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("IsDefaultVersion" -> IsDefaultVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentVersionInfo]
    }
  }

  /**
   * <p>The document has too many versions. Delete one or more document versions and try again.</p>
   */
  @js.native
  trait DocumentVersionLimitExceededException extends js.Object {
    var Message: String
  }

  /**
   * <p>Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.</p>
   */
  @js.native
  trait DoesNotExistExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>The content of the association document matches another document. Change the content of the document and try again.</p>
   */
  @js.native
  trait DuplicateDocumentContentException extends js.Object {
    var Message: String
  }

  /**
   * <p>You cannot specify an instance ID in more than one association.</p>
   */
  @js.native
  trait DuplicateInstanceIdException extends js.Object {

  }

  /**
   * <p>The EffectivePatch structure defines metadata about a patch along with the approval state of the patch in a particular patch baseline. The approval state includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.</p>
   */
  @js.native
  trait EffectivePatch extends js.Object {
    var Patch: Patch
    var PatchStatus: PatchStatus
  }

  object EffectivePatch {
    def apply(
      Patch: js.UndefOr[Patch] = js.undefined,
      PatchStatus: js.UndefOr[PatchStatus] = js.undefined
    ): EffectivePatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Patch" -> Patch.map { x => x: js.Any }),
        ("PatchStatus" -> PatchStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EffectivePatch]
    }
  }

  /**
   * <p>Describes a failed association.</p>
   */
  @js.native
  trait FailedCreateAssociation extends js.Object {
    var Entry: CreateAssociationBatchRequestEntry
    var Message: BatchErrorMessage
    var Fault: Fault
  }

  object FailedCreateAssociation {
    def apply(
      Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined,
      Message: js.UndefOr[BatchErrorMessage] = js.undefined,
      Fault: js.UndefOr[Fault] = js.undefined
    ): FailedCreateAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Entry" -> Entry.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("Fault" -> Fault.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateAssociation]
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
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    ): GetAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutomationExecutionId" -> AutomationExecutionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAutomationExecutionRequest]
    }
  }

  @js.native
  trait GetAutomationExecutionResult extends js.Object {
    var AutomationExecution: AutomationExecution
  }

  object GetAutomationExecutionResult {
    def apply(
      AutomationExecution: js.UndefOr[AutomationExecution] = js.undefined
    ): GetAutomationExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutomationExecution" -> AutomationExecution.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAutomationExecutionResult]
    }
  }

  @js.native
  trait GetCommandInvocationRequest extends js.Object {
    var CommandId: CommandId
    var InstanceId: InstanceId
    var PluginName: CommandPluginName
  }

  object GetCommandInvocationRequest {
    def apply(
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      PluginName: js.UndefOr[CommandPluginName] = js.undefined
    ): GetCommandInvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("PluginName" -> PluginName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommandInvocationRequest]
    }
  }

  @js.native
  trait GetCommandInvocationResult extends js.Object {
    var StatusDetails: StatusDetails
    var StandardErrorContent: StandardErrorContent
    var StandardErrorUrl: Url
    var ExecutionStartDateTime: StringDateTime
    var ResponseCode: ResponseCode
    var ExecutionEndDateTime: StringDateTime
    var ExecutionElapsedTime: StringDateTime
    var StandardOutputUrl: Url
    var StandardOutputContent: StandardOutputContent
    var PluginName: CommandPluginName
    var CommandId: CommandId
    var InstanceId: InstanceId
    var DocumentName: DocumentName
    var Comment: Comment
    var Status: CommandInvocationStatus
  }

  object GetCommandInvocationResult {
    def apply(
      StatusDetails: js.UndefOr[StatusDetails] = js.undefined,
      StandardErrorContent: js.UndefOr[StandardErrorContent] = js.undefined,
      StandardErrorUrl: js.UndefOr[Url] = js.undefined,
      ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.undefined,
      ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
      ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.undefined,
      ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.undefined,
      StandardOutputUrl: js.UndefOr[Url] = js.undefined,
      StandardOutputContent: js.UndefOr[StandardOutputContent] = js.undefined,
      PluginName: js.UndefOr[CommandPluginName] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      DocumentName: js.UndefOr[DocumentName] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      Status: js.UndefOr[CommandInvocationStatus] = js.undefined
    ): GetCommandInvocationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("StandardErrorContent" -> StandardErrorContent.map { x => x: js.Any }),
        ("StandardErrorUrl" -> StandardErrorUrl.map { x => x: js.Any }),
        ("ExecutionStartDateTime" -> ExecutionStartDateTime.map { x => x: js.Any }),
        ("ResponseCode" -> ResponseCode.map { x => x: js.Any }),
        ("ExecutionEndDateTime" -> ExecutionEndDateTime.map { x => x: js.Any }),
        ("ExecutionElapsedTime" -> ExecutionElapsedTime.map { x => x: js.Any }),
        ("StandardOutputUrl" -> StandardOutputUrl.map { x => x: js.Any }),
        ("StandardOutputContent" -> StandardOutputContent.map { x => x: js.Any }),
        ("PluginName" -> PluginName.map { x => x: js.Any }),
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommandInvocationResult]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineRequest extends js.Object {

  }

  object GetDefaultPatchBaselineRequest {
    def apply(

    ): GetDefaultPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDefaultPatchBaselineRequest]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineResult extends js.Object {
    var BaselineId: BaselineId
  }

  object GetDefaultPatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): GetDefaultPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): GetDeployablePatchSnapshotForInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
    }
  }

  @js.native
  trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
    var InstanceId: InstanceId
    var SnapshotId: SnapshotId
    var SnapshotDownloadUrl: SnapshotDownloadUrl
  }

  object GetDeployablePatchSnapshotForInstanceResult {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl] = js.undefined
    ): GetDeployablePatchSnapshotForInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("SnapshotDownloadUrl" -> SnapshotDownloadUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
    }
  }

  @js.native
  trait GetDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentVersion: DocumentVersion
  }

  object GetDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    ): GetDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResult extends js.Object {
    var Name: DocumentARN
    var DocumentVersion: DocumentVersion
    var Content: DocumentContent
    var DocumentType: DocumentType
  }

  object GetDocumentResult {
    def apply(
      Name: js.UndefOr[DocumentARN] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined,
      DocumentType: js.UndefOr[DocumentType] = js.undefined
    ): GetDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("Content" -> Content.map { x => x: js.Any }),
        ("DocumentType" -> DocumentType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentResult]
    }
  }

  @js.native
  trait GetInventoryRequest extends js.Object {
    var Filters: InventoryFilterList
    var ResultAttributes: ResultAttributeList
    var NextToken: NextToken
    var MaxResults: MaxResults
  }

  object GetInventoryRequest {
    def apply(
      Filters: js.UndefOr[InventoryFilterList] = js.undefined,
      ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined
    ): GetInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("ResultAttributes" -> ResultAttributes.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventoryRequest]
    }
  }

  @js.native
  trait GetInventoryResult extends js.Object {
    var Entities: InventoryResultEntityList
    var NextToken: NextToken
  }

  object GetInventoryResult {
    def apply(
      Entities: js.UndefOr[InventoryResultEntityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInventoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Entities" -> Entities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventoryResult]
    }
  }

  @js.native
  trait GetInventorySchemaRequest extends js.Object {
    var TypeName: InventoryItemTypeNameFilter
    var NextToken: NextToken
    var MaxResults: GetInventorySchemaMaxResults
  }

  object GetInventorySchemaRequest {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined
    ): GetInventorySchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TypeName" -> TypeName.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventorySchemaRequest]
    }
  }

  @js.native
  trait GetInventorySchemaResult extends js.Object {
    var Schemas: InventoryItemSchemaResultList
    var NextToken: NextToken
  }

  object GetInventorySchemaResult {
    def apply(
      Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInventorySchemaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Schemas" -> Schemas.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInventorySchemaResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): GetMaintenanceWindowExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionResult extends js.Object {
    var StatusDetails: MaintenanceWindowExecutionStatusDetails
    var TaskIds: MaintenanceWindowExecutionTaskIdList
    var StartTime: DateTime
    var EndTime: DateTime
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Status: MaintenanceWindowExecutionStatus
  }

  object GetMaintenanceWindowExecutionResult {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    ): GetMaintenanceWindowExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("TaskIds" -> TaskIds.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
    var TaskId: MaintenanceWindowExecutionTaskId
  }

  object GetMaintenanceWindowExecutionTaskRequest {
    def apply(
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      TaskId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
    ): GetMaintenanceWindowExecutionTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("TaskId" -> TaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
    var StatusDetails: MaintenanceWindowExecutionStatusDetails
    var MaxErrors: VelocityConstraint
    var MaxConcurrency: VelocityConstraint
    var ServiceRole: ServiceRole
    var TaskArn: MaintenanceWindowTaskArn
    var StartTime: DateTime
    var EndTime: DateTime
    var TaskExecutionId: MaintenanceWindowExecutionTaskId
    var TaskParameters: MaintenanceWindowTaskParametersList
    var Priority: MaintenanceWindowTaskPriority
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Status: MaintenanceWindowExecutionStatus
    var Type: MaintenanceWindowTaskType
  }

  object GetMaintenanceWindowExecutionTaskResult {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      MaxErrors: js.UndefOr[VelocityConstraint] = js.undefined,
      MaxConcurrency: js.UndefOr[VelocityConstraint] = js.undefined,
      ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
      Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    ): GetMaintenanceWindowExecutionTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("MaxErrors" -> MaxErrors.map { x => x: js.Any }),
        ("MaxConcurrency" -> MaxConcurrency.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("TaskArn" -> TaskArn.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("TaskExecutionId" -> TaskExecutionId.map { x => x: js.Any }),
        ("TaskParameters" -> TaskParameters.map { x => x: js.Any }),
        ("Priority" -> Priority.map { x => x: js.Any }),
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object GetMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): GetMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowResult extends js.Object {
    var ModifiedDate: DateTime
    var Name: MaintenanceWindowName
    var WindowId: MaintenanceWindowId
    var Duration: MaintenanceWindowDurationHours
    var CreatedDate: DateTime
    var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
    var Enabled: MaintenanceWindowEnabled
    var Cutoff: MaintenanceWindowCutoff
    var Schedule: MaintenanceWindowSchedule
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
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    ): GetMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ModifiedDate" -> ModifiedDate.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Cutoff" -> Cutoff.map { x => x: js.Any }),
        ("Schedule" -> Schedule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMaintenanceWindowResult]
    }
  }

  @js.native
  trait GetParameterHistoryRequest extends js.Object {
    var Name: PSParameterName
    var WithDecryption: Boolean
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object GetParameterHistoryRequest {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetParameterHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("WithDecryption" -> WithDecryption.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterHistoryRequest]
    }
  }

  @js.native
  trait GetParameterHistoryResult extends js.Object {
    var Parameters: ParameterHistoryList
    var NextToken: NextToken
  }

  object GetParameterHistoryResult {
    def apply(
      Parameters: js.UndefOr[ParameterHistoryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetParameterHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParameterHistoryResult]
    }
  }

  @js.native
  trait GetParametersRequest extends js.Object {
    var Names: ParameterNameList
    var WithDecryption: Boolean
  }

  object GetParametersRequest {
    def apply(
      Names: js.UndefOr[ParameterNameList] = js.undefined,
      WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Names" -> Names.map { x => x: js.Any }),
        ("WithDecryption" -> WithDecryption.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersRequest]
    }
  }

  @js.native
  trait GetParametersResult extends js.Object {
    var Parameters: ParameterList
    var InvalidParameters: ParameterNameList
  }

  object GetParametersResult {
    def apply(
      Parameters: js.UndefOr[ParameterList] = js.undefined,
      InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
    ): GetParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("InvalidParameters" -> InvalidParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersResult]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
  }

  object GetPatchBaselineForPatchGroupRequest {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): GetPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object GetPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): GetPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait GetPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object GetPatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): GetPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineRequest]
    }
  }

  @js.native
  trait GetPatchBaselineResult extends js.Object {
    var ModifiedDate: DateTime
    var Name: BaselineName
    var CreatedDate: DateTime
    var Description: BaselineDescription
    var BaselineId: BaselineId
    var ApprovalRules: PatchRuleGroup
    var ApprovedPatches: PatchIdList
    var PatchGroups: PatchGroupList
    var RejectedPatches: PatchIdList
    var GlobalFilters: PatchFilterGroup
  }

  object GetPatchBaselineResult {
    def apply(
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      PatchGroups: js.UndefOr[PatchGroupList] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    ): GetPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ModifiedDate" -> ModifiedDate.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("ApprovalRules" -> ApprovalRules.map { x => x: js.Any }),
        ("ApprovedPatches" -> ApprovedPatches.map { x => x: js.Any }),
        ("PatchGroups" -> PatchGroups.map { x => x: js.Any }),
        ("RejectedPatches" -> RejectedPatches.map { x => x: js.Any }),
        ("GlobalFilters" -> GlobalFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPatchBaselineResult]
    }
  }

  /**
   * <p>Error returned when an idempotent operation is retried and the parameters don’t match the original call to the API with the same idempotency token. </p>
   */
  @js.native
  trait IdempotentParameterMismatchException extends js.Object {
    var Message: String
  }

  /**
   * <p>Status information about the aggregated associations.</p>
   */
  @js.native
  trait InstanceAggregatedAssociationOverview extends js.Object {
    var DetailedStatus: StatusName
    var InstanceAssociationStatusAggregatedCount: InstanceAssociationStatusAggregatedCount
  }

  object InstanceAggregatedAssociationOverview {
    def apply(
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount] = js.undefined
    ): InstanceAggregatedAssociationOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DetailedStatus" -> DetailedStatus.map { x => x: js.Any }),
        ("InstanceAssociationStatusAggregatedCount" -> InstanceAssociationStatusAggregatedCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAggregatedAssociationOverview]
    }
  }

  /**
   * <p>One or more association documents on the instance. </p>
   */
  @js.native
  trait InstanceAssociation extends js.Object {
    var AssociationId: AssociationId
    var InstanceId: InstanceId
    var Content: DocumentContent
  }

  object InstanceAssociation {
    def apply(
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined
    ): InstanceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationId" -> AssociationId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Content" -> Content.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociation]
    }
  }

  /**
   * <p>An Amazon S3 bucket where you want to store the results of this request.</p>
   */
  @js.native
  trait InstanceAssociationOutputLocation extends js.Object {
    var S3Location: S3OutputLocation
  }

  object InstanceAssociationOutputLocation {
    def apply(
      S3Location: js.UndefOr[S3OutputLocation] = js.undefined
    ): InstanceAssociationOutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3Location" -> S3Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationOutputLocation]
    }
  }

  /**
   * <p>The URL of Amazon S3 bucket where you want to store the results of this request.</p>
   */
  @js.native
  trait InstanceAssociationOutputUrl extends js.Object {
    var S3OutputUrl: S3OutputUrl
  }

  object InstanceAssociationOutputUrl {
    def apply(
      S3OutputUrl: js.UndefOr[S3OutputUrl] = js.undefined
    ): InstanceAssociationOutputUrl = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3OutputUrl" -> S3OutputUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationOutputUrl]
    }
  }

  /**
   * <p>Status information about the instance association.</p>
   */
  @js.native
  trait InstanceAssociationStatusInfo extends js.Object {
    var Name: DocumentName
    var DetailedStatus: StatusName
    var ExecutionDate: DateTime
    var ErrorCode: AgentErrorCode
    var ExecutionSummary: InstanceAssociationExecutionSummary
    var DocumentVersion: DocumentVersion
    var InstanceId: InstanceId
    var OutputUrl: InstanceAssociationOutputUrl
    var AssociationId: AssociationId
    var Status: StatusName
  }

  object InstanceAssociationStatusInfo {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DetailedStatus: js.UndefOr[StatusName] = js.undefined,
      ExecutionDate: js.UndefOr[DateTime] = js.undefined,
      ErrorCode: js.UndefOr[AgentErrorCode] = js.undefined,
      ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      Status: js.UndefOr[StatusName] = js.undefined
    ): InstanceAssociationStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DetailedStatus" -> DetailedStatus.map { x => x: js.Any }),
        ("ExecutionDate" -> ExecutionDate.map { x => x: js.Any }),
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("ExecutionSummary" -> ExecutionSummary.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("OutputUrl" -> OutputUrl.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAssociationStatusInfo]
    }
  }

  /**
   * <p>Describes a filter for a specific list of instances. </p>
   */
  @js.native
  trait InstanceInformation extends js.Object {
    var AssociationOverview: InstanceAggregatedAssociationOverview
    var IPAddress: IPAddress
    var Name: String
    var AssociationStatus: StatusName
    var PlatformVersion: String
    var PingStatus: PingStatus
    var PlatformType: PlatformType
    var LastPingDateTime: DateTime
    var LastAssociationExecutionDate: DateTime
    var ResourceType: ResourceType
    var ComputerName: ComputerName
    var IsLatestVersion: Boolean
    var AgentVersion: Version
    var ActivationId: ActivationId
    var InstanceId: InstanceId
    var RegistrationDate: DateTime
    var IamRole: IamRole
    var LastSuccessfulAssociationExecutionDate: DateTime
    var PlatformName: String
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
      PlatformName: js.UndefOr[String] = js.undefined
    ): InstanceInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationOverview" -> AssociationOverview.map { x => x: js.Any }),
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AssociationStatus" -> AssociationStatus.map { x => x: js.Any }),
        ("PlatformVersion" -> PlatformVersion.map { x => x: js.Any }),
        ("PingStatus" -> PingStatus.map { x => x: js.Any }),
        ("PlatformType" -> PlatformType.map { x => x: js.Any }),
        ("LastPingDateTime" -> LastPingDateTime.map { x => x: js.Any }),
        ("LastAssociationExecutionDate" -> LastAssociationExecutionDate.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ComputerName" -> ComputerName.map { x => x: js.Any }),
        ("IsLatestVersion" -> IsLatestVersion.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("ActivationId" -> ActivationId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("RegistrationDate" -> RegistrationDate.map { x => x: js.Any }),
        ("IamRole" -> IamRole.map { x => x: js.Any }),
        ("LastSuccessfulAssociationExecutionDate" -> LastSuccessfulAssociationExecutionDate.map { x => x: js.Any }),
        ("PlatformName" -> PlatformName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformation]
    }
  }

  /**
   * <p>Describes a filter for a specific list of instances. </p>
   */
  @js.native
  trait InstanceInformationFilter extends js.Object {
    var key: InstanceInformationFilterKey
    var valueSet: InstanceInformationFilterValueSet
  }

  object InstanceInformationFilter {
    def apply(
      key: js.UndefOr[InstanceInformationFilterKey] = js.undefined,
      valueSet: js.UndefOr[InstanceInformationFilterValueSet] = js.undefined
    ): InstanceInformationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("key" -> key.map { x => x: js.Any }),
        ("valueSet" -> valueSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Key: InstanceInformationStringFilterKey
    var Values: InstanceInformationFilterValueSet
  }

  object InstanceInformationStringFilter {
    def apply(
      Key: js.UndefOr[InstanceInformationStringFilterKey] = js.undefined,
      Values: js.UndefOr[InstanceInformationFilterValueSet] = js.undefined
    ): InstanceInformationStringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInformationStringFilter]
    }
  }

  /**
   * <p>Defines the high-level patch compliance state for a managed instance, providing information about the number of installed, missing, not applicable, and failed patches along with metadata about the operation when this information was gathered for the instance.</p>
   */
  @js.native
  trait InstancePatchState extends js.Object {
    var InstalledCount: PatchInstalledCount
    var PatchGroup: PatchGroup
    var SnapshotId: SnapshotId
    var BaselineId: BaselineId
    var FailedCount: PatchFailedCount
    var NotApplicableCount: PatchNotApplicableCount
    var Operation: PatchOperationType
    var OperationStartTime: PatchOperationStartTime
    var InstanceId: InstanceId
    var OwnerInformation: OwnerInformation
    var OperationEndTime: PatchOperationEndTime
    var InstalledOtherCount: PatchInstalledOtherCount
    var MissingCount: PatchMissingCount
  }

  object InstancePatchState {
    def apply(
      InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      FailedCount: js.UndefOr[PatchFailedCount] = js.undefined,
      NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined,
      Operation: js.UndefOr[PatchOperationType] = js.undefined,
      OperationStartTime: js.UndefOr[PatchOperationStartTime] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      OperationEndTime: js.UndefOr[PatchOperationEndTime] = js.undefined,
      InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined,
      MissingCount: js.UndefOr[PatchMissingCount] = js.undefined
    ): InstancePatchState = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstalledCount" -> InstalledCount.map { x => x: js.Any }),
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("FailedCount" -> FailedCount.map { x => x: js.Any }),
        ("NotApplicableCount" -> NotApplicableCount.map { x => x: js.Any }),
        ("Operation" -> Operation.map { x => x: js.Any }),
        ("OperationStartTime" -> OperationStartTime.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("OwnerInformation" -> OwnerInformation.map { x => x: js.Any }),
        ("OperationEndTime" -> OperationEndTime.map { x => x: js.Any }),
        ("InstalledOtherCount" -> InstalledOtherCount.map { x => x: js.Any }),
        ("MissingCount" -> MissingCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePatchState]
    }
  }

  /**
   * <p>Defines a filter used in DescribeInstancePatchStatesForPatchGroup used to scope down the information returned by the API.</p>
   */
  @js.native
  trait InstancePatchStateFilter extends js.Object {
    var Key: InstancePatchStateFilterKey
    var Values: InstancePatchStateFilterValues
    var Type: InstancePatchStateOperatorType
  }

  object InstancePatchStateFilter {
    def apply(
      Key: js.UndefOr[InstancePatchStateFilterKey] = js.undefined,
      Values: js.UndefOr[InstancePatchStateFilterValues] = js.undefined,
      Type: js.UndefOr[InstancePatchStateOperatorType] = js.undefined
    ): InstancePatchStateFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>An error occurred on the server side.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    var Message: String
  }

  /**
   * <p>The activation is not valid. The activation might have been deleted, or the ActivationId and the ActivationCode do not match.</p>
   */
  @js.native
  trait InvalidActivationException extends js.Object {
    var Message: String
  }

  /**
   * <p>The activation ID is not valid. Verify the you entered the correct ActivationId or ActivationCode and try again.</p>
   */
  @js.native
  trait InvalidActivationIdException extends js.Object {
    var Message: String
  }

  /**
   * <p>The supplied parameters for invoking the specified Automation document are incorrect. For example, they may not match the set of parameters permitted for the specified Automation document.</p>
   */
  @js.native
  trait InvalidAutomationExecutionParametersExceptionException extends js.Object {
    var Message: String
  }

  @js.native
  trait InvalidCommandIdException extends js.Object {

  }

  /**
   * <p>The specified document does not exist.</p>
   */
  @js.native
  trait InvalidDocumentException extends js.Object {
    var Message: String
  }

  /**
   * <p>The content for the SSM document is not valid.</p>
   */
  @js.native
  trait InvalidDocumentContentException extends js.Object {
    var Message: String
  }

  /**
   * <p>You attempted to delete a document while it is still shared. You must stop sharing the document before you can delete it.</p>
   */
  @js.native
  trait InvalidDocumentOperationException extends js.Object {
    var Message: String
  }

  /**
   * <p>The version of the document schema is not supported.</p>
   */
  @js.native
  trait InvalidDocumentSchemaVersionException extends js.Object {
    var Message: String
  }

  /**
   * <p>The document version is not valid or does not exist.</p>
   */
  @js.native
  trait InvalidDocumentVersionException extends js.Object {
    var Message: String
  }

  /**
   * <p>The filter name is not valid. Verify the you entered the correct name and try again.</p>
   */
  @js.native
  trait InvalidFilterException extends js.Object {
    var Message: String
  }

  /**
   * <p>The specified key is not valid.</p>
   */
  @js.native
  trait InvalidFilterKeyException extends js.Object {

  }

  /**
   * <p>The filter value is not valid. Verify the value and try again.</p>
   */
  @js.native
  trait InvalidFilterValueException extends js.Object {
    var Message: String
  }

  /**
   * <p>The following problems can cause this exception:</p> <p>You do not have permission to access the instance.</p> <p>The SSM agent is not running. On managed instances and Linux instances, verify that the SSM agent is running. On EC2 Windows instances, verify that the EC2Config service is running.</p> <p>The SSM agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM agent or EC2Config service.</p> <p>The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states are: Shutting-down and Terminated.</p>
   */
  @js.native
  trait InvalidInstanceIdException extends js.Object {
    var Message: String
  }

  /**
   * <p>The specified filter value is not valid.</p>
   */
  @js.native
  trait InvalidInstanceInformationFilterValueException extends js.Object {
    var message: String
  }

  /**
   * <p>One or more content items is not valid.</p>
   */
  @js.native
  trait InvalidItemContentExceptionException extends js.Object {
    var TypeName: InventoryItemTypeName
    var Message: String
  }

  /**
   * <p>The query key ID is not valid.</p>
   */
  @js.native
  trait InvalidKeyIdException extends js.Object {
    var message: String
  }

  /**
   * <p>The specified token is not valid.</p>
   */
  @js.native
  trait InvalidNextTokenException extends js.Object {

  }

  /**
   * <p>One or more configuration items is not valid. Verify that a valid Amazon Resource Name (ARN) was provided for an Amazon SNS topic.</p>
   */
  @js.native
  trait InvalidNotificationConfigException extends js.Object {
    var Message: String
  }

  /**
   * <p>The S3 bucket does not exist.</p>
   */
  @js.native
  trait InvalidOutputFolderException extends js.Object {

  }

  /**
   * <p>The output location is not valid or does not exist.</p>
   */
  @js.native
  trait InvalidOutputLocationException extends js.Object {

  }

  /**
   * <p>You must specify values for all required parameters in the SSM document. You can only supply values to parameters defined in the SSM document.</p>
   */
  @js.native
  trait InvalidParametersException extends js.Object {
    var Message: String
  }

  /**
   * <p>The permission type is not supported. <i>Share</i> is the only supported permission type.</p>
   */
  @js.native
  trait InvalidPermissionTypeException extends js.Object {
    var Message: String
  }

  /**
   * <p>The plugin name is not valid.</p>
   */
  @js.native
  trait InvalidPluginNameException extends js.Object {

  }

  /**
   * <p>The resource ID is not valid. Verify that you entered the correct ID and try again.</p>
   */
  @js.native
  trait InvalidResourceIdException extends js.Object {

  }

  /**
   * <p>The resource type is not valid. If you are attempting to tag an instance, the instance must be a registered, managed instance.</p>
   */
  @js.native
  trait InvalidResourceTypeException extends js.Object {

  }

  /**
   * <p>The specified inventory item result attribute is not valid.</p>
   */
  @js.native
  trait InvalidResultAttributeExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>The role name can't contain invalid characters. Also verify that you specified an IAM role for notifications that includes the required trust policy. For information about configuring the IAM role for Run Command notifications, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/rc-sns.html">Getting Amazon SNS Notifications When a Command Changes Status</a> in the <i>Amazon Elastic Compute Cloud User Guide </i>.</p>
   */
  @js.native
  trait InvalidRoleException extends js.Object {
    var Message: String
  }

  /**
   * <p>The schedule is invalid. Verify your cron or rate expression and try again.</p>
   */
  @js.native
  trait InvalidScheduleException extends js.Object {
    var Message: String
  }

  /**
   * <p>The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you might not have permission to perform the operation.</p>
   */
  @js.native
  trait InvalidTargetException extends js.Object {
    var Message: String
  }

  /**
   * <p>The parameter type name is not valid.</p>
   */
  @js.native
  trait InvalidTypeNameExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>The update is not valid.</p>
   */
  @js.native
  trait InvalidUpdateException extends js.Object {
    var Message: String
  }


  object InventoryAttributeDataTypeEnum {
    val string = "string"
    val number = "number"

    val values = IndexedSeq(string, number)
  }

  /**
   * <p>One or more filters. Use a filter to return a more specific list of results.</p>
   */
  @js.native
  trait InventoryFilter extends js.Object {
    var Key: InventoryFilterKey
    var Values: InventoryFilterValueList
    var Type: InventoryQueryOperatorType
  }

  object InventoryFilter {
    def apply(
      Key: js.UndefOr[InventoryFilterKey] = js.undefined,
      Values: js.UndefOr[InventoryFilterValueList] = js.undefined,
      Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined
    ): InventoryFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryFilter]
    }
  }

  /**
   * <p>Information collected from managed instances based on your inventory policy document</p>
   */
  @js.native
  trait InventoryItem extends js.Object {
    var Content: InventoryItemEntryList
    var TypeName: InventoryItemTypeName
    var ContentHash: InventoryItemContentHash
    var CaptureTime: InventoryItemCaptureTime
    var SchemaVersion: InventoryItemSchemaVersion
  }

  object InventoryItem {
    def apply(
      Content: js.UndefOr[InventoryItemEntryList] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    ): InventoryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Content" -> Content.map { x => x: js.Any }),
        ("TypeName" -> TypeName.map { x => x: js.Any }),
        ("ContentHash" -> ContentHash.map { x => x: js.Any }),
        ("CaptureTime" -> CaptureTime.map { x => x: js.Any }),
        ("SchemaVersion" -> SchemaVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItem]
    }
  }

  /**
   * <p>Attributes are the entries within the inventory item content. It contains name and value.</p>
   */
  @js.native
  trait InventoryItemAttribute extends js.Object {
    var Name: InventoryItemAttributeName
    var DataType: InventoryAttributeDataType
  }

  object InventoryItemAttribute {
    def apply(
      Name: js.UndefOr[InventoryItemAttributeName] = js.undefined,
      DataType: js.UndefOr[InventoryAttributeDataType] = js.undefined
    ): InventoryItemAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DataType" -> DataType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItemAttribute]
    }
  }

  /**
   * <p>The inventory item schema definition. Users can use this to compose inventory query filters.</p>
   */
  @js.native
  trait InventoryItemSchema extends js.Object {
    var TypeName: InventoryItemTypeName
    var Version: InventoryItemSchemaVersion
    var Attributes: InventoryItemAttributeList
  }

  object InventoryItemSchema {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      Attributes: js.UndefOr[InventoryItemAttributeList] = js.undefined
    ): InventoryItemSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TypeName" -> TypeName.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryItemSchema]
    }
  }


  object InventoryQueryOperatorTypeEnum {
    val Equal = "Equal"
    val NotEqual = "NotEqual"
    val BeginWith = "BeginWith"
    val LessThan = "LessThan"
    val GreaterThan = "GreaterThan"

    val values = IndexedSeq(Equal, NotEqual, BeginWith, LessThan, GreaterThan)
  }

  /**
   * <p>Inventory query results.</p>
   */
  @js.native
  trait InventoryResultEntity extends js.Object {
    var Id: InventoryResultEntityId
    var Data: InventoryResultItemMap
  }

  object InventoryResultEntity {
    def apply(
      Id: js.UndefOr[InventoryResultEntityId] = js.undefined,
      Data: js.UndefOr[InventoryResultItemMap] = js.undefined
    ): InventoryResultEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Data" -> Data.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryResultEntity]
    }
  }

  /**
   * <p>The inventory result item.</p>
   */
  @js.native
  trait InventoryResultItem extends js.Object {
    var Content: InventoryItemEntryList
    var TypeName: InventoryItemTypeName
    var ContentHash: InventoryItemContentHash
    var CaptureTime: InventoryItemCaptureTime
    var SchemaVersion: InventoryItemSchemaVersion
  }

  object InventoryResultItem {
    def apply(
      Content: js.UndefOr[InventoryItemEntryList] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    ): InventoryResultItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Content" -> Content.map { x => x: js.Any }),
        ("TypeName" -> TypeName.map { x => x: js.Any }),
        ("ContentHash" -> ContentHash.map { x => x: js.Any }),
        ("CaptureTime" -> CaptureTime.map { x => x: js.Any }),
        ("SchemaVersion" -> SchemaVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryResultItem]
    }
  }

  /**
   * <p>The command ID and instance ID you specified did not match any invocations. Verify the command ID adn the instance ID and try again. </p>
   */
  @js.native
  trait InvocationDoesNotExistException extends js.Object {

  }

  /**
   * <p>The inventory item has invalid content. </p>
   */
  @js.native
  trait ItemContentMismatchExceptionException extends js.Object {
    var TypeName: InventoryItemTypeName
    var Message: String
  }

  /**
   * <p>The inventory item size has exceeded the size limit.</p>
   */
  @js.native
  trait ItemSizeLimitExceededExceptionException extends js.Object {
    var TypeName: InventoryItemTypeName
    var Message: String
  }

  @js.native
  trait ListAssociationsRequest extends js.Object {
    var AssociationFilterList: AssociationFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object ListAssociationsRequest {
    def apply(
      AssociationFilterList: js.UndefOr[AssociationFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationFilterList" -> AssociationFilterList.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsRequest]
    }
  }

  @js.native
  trait ListAssociationsResult extends js.Object {
    var Associations: AssociationList
    var NextToken: NextToken
  }

  object ListAssociationsResult {
    def apply(
      Associations: js.UndefOr[AssociationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Associations" -> Associations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsResult]
    }
  }

  @js.native
  trait ListCommandInvocationsRequest extends js.Object {
    var MaxResults: CommandMaxResults
    var Details: Boolean
    var CommandId: CommandId
    var InstanceId: InstanceId
    var Filters: CommandFilterList
    var NextToken: NextToken
  }

  object ListCommandInvocationsRequest {
    def apply(
      MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
      Details: js.UndefOr[Boolean] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[CommandFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandInvocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("Details" -> Details.map { x => x: js.Any }),
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandInvocationsRequest]
    }
  }

  @js.native
  trait ListCommandInvocationsResult extends js.Object {
    var CommandInvocations: CommandInvocationList
    var NextToken: NextToken
  }

  object ListCommandInvocationsResult {
    def apply(
      CommandInvocations: js.UndefOr[CommandInvocationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandInvocationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CommandInvocations" -> CommandInvocations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandInvocationsResult]
    }
  }

  @js.native
  trait ListCommandsRequest extends js.Object {
    var MaxResults: CommandMaxResults
    var CommandId: CommandId
    var InstanceId: InstanceId
    var Filters: CommandFilterList
    var NextToken: NextToken
  }

  object ListCommandsRequest {
    def apply(
      MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
      CommandId: js.UndefOr[CommandId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[CommandFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandsRequest]
    }
  }

  @js.native
  trait ListCommandsResult extends js.Object {
    var Commands: CommandList
    var NextToken: NextToken
  }

  object ListCommandsResult {
    def apply(
      Commands: js.UndefOr[CommandList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Commands" -> Commands.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCommandsResult]
    }
  }

  @js.native
  trait ListDocumentVersionsRequest extends js.Object {
    var Name: DocumentName
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object ListDocumentVersionsRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentVersionsRequest]
    }
  }

  @js.native
  trait ListDocumentVersionsResult extends js.Object {
    var DocumentVersions: DocumentVersionList
    var NextToken: NextToken
  }

  object ListDocumentVersionsResult {
    def apply(
      DocumentVersions: js.UndefOr[DocumentVersionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentVersions" -> DocumentVersions.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentVersionsResult]
    }
  }

  @js.native
  trait ListDocumentsRequest extends js.Object {
    var DocumentFilterList: DocumentFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object ListDocumentsRequest {
    def apply(
      DocumentFilterList: js.UndefOr[DocumentFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentFilterList" -> DocumentFilterList.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentsRequest]
    }
  }

  @js.native
  trait ListDocumentsResult extends js.Object {
    var DocumentIdentifiers: DocumentIdentifierList
    var NextToken: NextToken
  }

  object ListDocumentsResult {
    def apply(
      DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentIdentifiers" -> DocumentIdentifiers.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentsResult]
    }
  }

  @js.native
  trait ListInventoryEntriesRequest extends js.Object {
    var TypeName: InventoryItemTypeName
    var MaxResults: MaxResults
    var InstanceId: InstanceId
    var Filters: InventoryFilterList
    var NextToken: NextToken
  }

  object ListInventoryEntriesRequest {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[InventoryFilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInventoryEntriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TypeName" -> TypeName.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInventoryEntriesRequest]
    }
  }

  @js.native
  trait ListInventoryEntriesResult extends js.Object {
    var Entries: InventoryItemEntryList
    var TypeName: InventoryItemTypeName
    var CaptureTime: InventoryItemCaptureTime
    var SchemaVersion: InventoryItemSchemaVersion
    var InstanceId: InstanceId
    var NextToken: NextToken
  }

  object ListInventoryEntriesResult {
    def apply(
      Entries: js.UndefOr[InventoryItemEntryList] = js.undefined,
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined,
      CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
      SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInventoryEntriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Entries" -> Entries.map { x => x: js.Any }),
        ("TypeName" -> TypeName.map { x => x: js.Any }),
        ("CaptureTime" -> CaptureTime.map { x => x: js.Any }),
        ("SchemaVersion" -> SchemaVersion.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInventoryEntriesResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceType: ResourceTypeForTagging
    var ResourceId: ResourceId
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceTypeForTagging] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var TagList: TagList
  }

  object ListTagsForResourceResult {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
   * <p>Information about an Amazon S3 bucket to write instance-level logs to.</p>
   */
  @js.native
  trait LoggingInfo extends js.Object {
    var S3BucketName: S3BucketName
    var S3KeyPrefix: S3KeyPrefix
    var S3Region: S3Region
  }

  object LoggingInfo {
    def apply(
      S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      S3Region: js.UndefOr[S3Region] = js.undefined
    ): LoggingInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("S3Region" -> S3Region.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingInfo]
    }
  }

  /**
   * <p>Describes the information about an execution of a Maintenance Window. </p>
   */
  @js.native
  trait MaintenanceWindowExecution extends js.Object {
    var StatusDetails: MaintenanceWindowExecutionStatusDetails
    var WindowId: MaintenanceWindowId
    var StartTime: DateTime
    var EndTime: DateTime
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Status: MaintenanceWindowExecutionStatus
  }

  object MaintenanceWindowExecution {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    ): MaintenanceWindowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecution]
    }
  }


  object MaintenanceWindowExecutionStatusEnum {
    val PENDING = "PENDING"
    val `IN_PROGRESS` = "IN_PROGRESS"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"
    val `TIMED_OUT` = "TIMED_OUT"
    val CANCELLING = "CANCELLING"
    val CANCELLED = "CANCELLED"
    val `SKIPPED_OVERLAPPING` = "SKIPPED_OVERLAPPING"

    val values = IndexedSeq(PENDING, `IN_PROGRESS`, SUCCESS, FAILED, `TIMED_OUT`, CANCELLING, CANCELLED, `SKIPPED_OVERLAPPING`)
  }

  /**
   * <p>Information about a task execution performed as part of a Maintenance Window execution.</p>
   */
  @js.native
  trait MaintenanceWindowExecutionTaskIdentity extends js.Object {
    var StatusDetails: MaintenanceWindowExecutionStatusDetails
    var TaskArn: MaintenanceWindowTaskArn
    var StartTime: DateTime
    var TaskType: MaintenanceWindowTaskType
    var EndTime: DateTime
    var TaskExecutionId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Status: MaintenanceWindowExecutionStatus
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
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    ): MaintenanceWindowExecutionTaskIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("TaskArn" -> TaskArn.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("TaskType" -> TaskType.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("TaskExecutionId" -> TaskExecutionId.map { x => x: js.Any }),
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
    }
  }

  /**
   * <p>Describes the information about a task invocation for a particular target as part of a task execution performed as part of a Maintenance Window execution.</p>
   */
  @js.native
  trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
    var StatusDetails: MaintenanceWindowExecutionStatusDetails
    var Parameters: MaintenanceWindowExecutionTaskInvocationParameters
    var StartTime: DateTime
    var EndTime: DateTime
    var TaskExecutionId: MaintenanceWindowExecutionTaskId
    var ExecutionId: MaintenanceWindowExecutionTaskExecutionId
    var WindowTargetId: MaintenanceWindowTaskTargetId
    var InvocationId: MaintenanceWindowExecutionTaskInvocationId
    var OwnerInformation: OwnerInformation
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Status: MaintenanceWindowExecutionStatus
  }

  object MaintenanceWindowExecutionTaskInvocationIdentity {
    def apply(
      StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
      Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
      ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined,
      InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
      Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    ): MaintenanceWindowExecutionTaskInvocationIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("TaskExecutionId" -> TaskExecutionId.map { x => x: js.Any }),
        ("ExecutionId" -> ExecutionId.map { x => x: js.Any }),
        ("WindowTargetId" -> WindowTargetId.map { x => x: js.Any }),
        ("InvocationId" -> InvocationId.map { x => x: js.Any }),
        ("OwnerInformation" -> OwnerInformation.map { x => x: js.Any }),
        ("WindowExecutionId" -> WindowExecutionId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
    }
  }

  /**
   * <p>Filter used in the request.</p>
   */
  @js.native
  trait MaintenanceWindowFilter extends js.Object {
    var Key: MaintenanceWindowFilterKey
    var Values: MaintenanceWindowFilterValues
  }

  object MaintenanceWindowFilter {
    def apply(
      Key: js.UndefOr[MaintenanceWindowFilterKey] = js.undefined,
      Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined
    ): MaintenanceWindowFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowFilter]
    }
  }

  /**
   * <p>Information about the Maintenance Window.</p>
   */
  @js.native
  trait MaintenanceWindowIdentity extends js.Object {
    var Name: MaintenanceWindowName
    var WindowId: MaintenanceWindowId
    var Duration: MaintenanceWindowDurationHours
    var Enabled: MaintenanceWindowEnabled
    var Cutoff: MaintenanceWindowCutoff
  }

  object MaintenanceWindowIdentity {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
    ): MaintenanceWindowIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Cutoff" -> Cutoff.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowIdentity]
    }
  }


  object MaintenanceWindowResourceTypeEnum {
    val INSTANCE = "INSTANCE"

    val values = IndexedSeq(INSTANCE)
  }

  /**
   * <p>The target registered with the Maintenance Window.</p>
   */
  @js.native
  trait MaintenanceWindowTarget extends js.Object {
    var WindowId: MaintenanceWindowId
    var ResourceType: MaintenanceWindowResourceType
    var WindowTargetId: MaintenanceWindowTargetId
    var OwnerInformation: OwnerInformation
    var Targets: Targets
  }

  object MaintenanceWindowTarget {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined
    ): MaintenanceWindowTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("WindowTargetId" -> WindowTargetId.map { x => x: js.Any }),
        ("OwnerInformation" -> OwnerInformation.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTarget]
    }
  }

  /**
   * <p>Information about a task defined for a Maintenance Window.</p>
   */
  @js.native
  trait MaintenanceWindowTask extends js.Object {
    var MaxErrors: VelocityConstraint
    var WindowId: MaintenanceWindowId
    var MaxConcurrency: VelocityConstraint
    var TaskArn: MaintenanceWindowTaskArn
    var ServiceRoleArn: ServiceRole
    var TaskParameters: MaintenanceWindowTaskParameters
    var LoggingInfo: LoggingInfo
    var Priority: MaintenanceWindowTaskPriority
    var Targets: Targets
    var WindowTaskId: MaintenanceWindowTaskId
    var Type: MaintenanceWindowTaskType
  }

  object MaintenanceWindowTask {
    def apply(
      MaxErrors: js.UndefOr[VelocityConstraint] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[VelocityConstraint] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined,
      Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    ): MaintenanceWindowTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxErrors" -> MaxErrors.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("MaxConcurrency" -> MaxConcurrency.map { x => x: js.Any }),
        ("TaskArn" -> TaskArn.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("TaskParameters" -> TaskParameters.map { x => x: js.Any }),
        ("LoggingInfo" -> LoggingInfo.map { x => x: js.Any }),
        ("Priority" -> Priority.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("WindowTaskId" -> WindowTaskId.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTask]
    }
  }

  /**
   * <p>Defines the values for a task parameter.</p>
   */
  @js.native
  trait MaintenanceWindowTaskParameterValueExpression extends js.Object {
    var Values: MaintenanceWindowTaskParameterValueList
  }

  object MaintenanceWindowTaskParameterValueExpression {
    def apply(
      Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.undefined
    ): MaintenanceWindowTaskParameterValueExpression = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
    }
  }


  object MaintenanceWindowTaskTypeEnum {
    val `RUN_COMMAND` = "RUN_COMMAND"

    val values = IndexedSeq(`RUN_COMMAND`)
  }

  /**
   * <p>The size limit of an SSM document is 64 KB.</p>
   */
  @js.native
  trait MaxDocumentSizeExceededException extends js.Object {
    var Message: String
  }

  @js.native
  trait ModifyDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
    var AccountIdsToAdd: AccountIdList
    var AccountIdsToRemove: AccountIdList
  }

  object ModifyDocumentPermissionRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      PermissionType: js.UndefOr[DocumentPermissionType] = js.undefined,
      AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined,
      AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined
    ): ModifyDocumentPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("PermissionType" -> PermissionType.map { x => x: js.Any }),
        ("AccountIdsToAdd" -> AccountIdsToAdd.map { x => x: js.Any }),
        ("AccountIdsToRemove" -> AccountIdsToRemove.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDocumentPermissionRequest]
    }
  }

  @js.native
  trait ModifyDocumentPermissionResponse extends js.Object {

  }

  object ModifyDocumentPermissionResponse {
    def apply(

    ): ModifyDocumentPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDocumentPermissionResponse]
    }
  }

  /**
   * <p>Configurations for sending notifications.</p>
   */
  @js.native
  trait NotificationConfig extends js.Object {
    var NotificationArn: NotificationArn
    var NotificationEvents: NotificationEventList
    var NotificationType: NotificationType
  }

  object NotificationConfig {
    def apply(
      NotificationArn: js.UndefOr[NotificationArn] = js.undefined,
      NotificationEvents: js.UndefOr[NotificationEventList] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined
    ): NotificationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationArn" -> NotificationArn.map { x => x: js.Any }),
        ("NotificationEvents" -> NotificationEvents.map { x => x: js.Any }),
        ("NotificationType" -> NotificationType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

  /**
   * <p>An Amazon EC2 Systems Manager parameter in Parameter Store.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var Name: PSParameterName
    var Type: ParameterType
    var Value: PSParameterValue
  }

  object Parameter {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined
    ): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>The parameter already exists. You can't create duplicate parameters.</p>
   */
  @js.native
  trait ParameterAlreadyExistsException extends js.Object {
    var message: String
  }

  /**
   * <p>Information about parameter usage.</p>
   */
  @js.native
  trait ParameterHistory extends js.Object {
    var Name: PSParameterName
    var LastModifiedDate: DateTime
    var Description: ParameterDescription
    var Value: PSParameterValue
    var KeyId: ParameterKeyId
    var LastModifiedUser: String
    var Type: ParameterType
  }

  object ParameterHistory {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      LastModifiedUser: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined
    ): ParameterHistory = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("LastModifiedDate" -> LastModifiedDate.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("LastModifiedUser" -> LastModifiedUser.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterHistory]
    }
  }

  /**
   * <p>You have exceeded the number of parameters for this AWS account. Delete one or more parameters and try again.</p>
   */
  @js.native
  trait ParameterLimitExceededException extends js.Object {
    var message: String
  }

  /**
   * <p>Metada includes information like the ARN of the last user and the date/time the parameter was last used.</p>
   */
  @js.native
  trait ParameterMetadata extends js.Object {
    var Name: PSParameterName
    var LastModifiedDate: DateTime
    var Description: ParameterDescription
    var KeyId: ParameterKeyId
    var LastModifiedUser: String
    var Type: ParameterType
  }

  object ParameterMetadata {
    def apply(
      Name: js.UndefOr[PSParameterName] = js.undefined,
      LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      LastModifiedUser: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined
    ): ParameterMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("LastModifiedDate" -> LastModifiedDate.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("LastModifiedUser" -> LastModifiedUser.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterMetadata]
    }
  }

  /**
   * <p>The parameter could not be found. Verify the name and try again.</p>
   */
  @js.native
  trait ParameterNotFoundException extends js.Object {
    var message: String
  }


  object ParameterTypeEnum {
    val String = "String"
    val StringList = "StringList"
    val SecureString = "SecureString"

    val values = IndexedSeq(String, StringList, SecureString)
  }

  /**
   * <p>One or more filters. Use a filter to return a more specific list of results.</p>
   */
  @js.native
  trait ParametersFilter extends js.Object {
    var Key: ParametersFilterKey
    var Values: ParametersFilterValueList
  }

  object ParametersFilter {
    def apply(
      Key: js.UndefOr[ParametersFilterKey] = js.undefined,
      Values: js.UndefOr[ParametersFilterValueList] = js.undefined
    ): ParametersFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Id: PatchId
    var Classification: PatchClassification
    var Title: PatchTitle
    var ReleaseDate: DateTime
    var KbNumber: PatchKbNumber
    var Description: PatchDescription
    var ContentUrl: PatchContentUrl
    var MsrcSeverity: PatchMsrcSeverity
    var Vendor: PatchVendor
    var MsrcNumber: PatchMsrcNumber
    var Language: PatchLanguage
    var ProductFamily: PatchProductFamily
    var Product: PatchProduct
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
      Product: js.UndefOr[PatchProduct] = js.undefined
    ): Patch = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Classification" -> Classification.map { x => x: js.Any }),
        ("Title" -> Title.map { x => x: js.Any }),
        ("ReleaseDate" -> ReleaseDate.map { x => x: js.Any }),
        ("KbNumber" -> KbNumber.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ContentUrl" -> ContentUrl.map { x => x: js.Any }),
        ("MsrcSeverity" -> MsrcSeverity.map { x => x: js.Any }),
        ("Vendor" -> Vendor.map { x => x: js.Any }),
        ("MsrcNumber" -> MsrcNumber.map { x => x: js.Any }),
        ("Language" -> Language.map { x => x: js.Any }),
        ("ProductFamily" -> ProductFamily.map { x => x: js.Any }),
        ("Product" -> Product.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Patch]
    }
  }

  /**
   * <p>Defines the basic information about a patch baseline.</p>
   */
  @js.native
  trait PatchBaselineIdentity extends js.Object {
    var BaselineId: BaselineId
    var BaselineName: BaselineName
    var BaselineDescription: BaselineDescription
    var DefaultBaseline: DefaultBaseline
  }

  object PatchBaselineIdentity {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      BaselineName: js.UndefOr[BaselineName] = js.undefined,
      BaselineDescription: js.UndefOr[BaselineDescription] = js.undefined,
      DefaultBaseline: js.UndefOr[DefaultBaseline] = js.undefined
    ): PatchBaselineIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("BaselineName" -> BaselineName.map { x => x: js.Any }),
        ("BaselineDescription" -> BaselineDescription.map { x => x: js.Any }),
        ("DefaultBaseline" -> DefaultBaseline.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchBaselineIdentity]
    }
  }

  /**
   * <p>Information about the state of a patch on a particular instance as it relates to the patch baseline used to patch the instance.</p>
   */
  @js.native
  trait PatchComplianceData extends js.Object {
    var Classification: PatchClassification
    var Title: PatchTitle
    var KBId: PatchKbNumber
    var InstalledTime: PatchInstalledTime
    var State: PatchComplianceDataState
    var Severity: PatchSeverity
  }

  object PatchComplianceData {
    def apply(
      Classification: js.UndefOr[PatchClassification] = js.undefined,
      Title: js.UndefOr[PatchTitle] = js.undefined,
      KBId: js.UndefOr[PatchKbNumber] = js.undefined,
      InstalledTime: js.UndefOr[PatchInstalledTime] = js.undefined,
      State: js.UndefOr[PatchComplianceDataState] = js.undefined,
      Severity: js.UndefOr[PatchSeverity] = js.undefined
    ): PatchComplianceData = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Classification" -> Classification.map { x => x: js.Any }),
        ("Title" -> Title.map { x => x: js.Any }),
        ("KBId" -> KBId.map { x => x: js.Any }),
        ("InstalledTime" -> InstalledTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchComplianceData]
    }
  }


  object PatchComplianceDataStateEnum {
    val INSTALLED = "INSTALLED"
    val `INSTALLED_OTHER` = "INSTALLED_OTHER"
    val MISSING = "MISSING"
    val `NOT_APPLICABLE` = "NOT_APPLICABLE"
    val FAILED = "FAILED"

    val values = IndexedSeq(INSTALLED, `INSTALLED_OTHER`, MISSING, `NOT_APPLICABLE`, FAILED)
  }


  object PatchDeploymentStatusEnum {
    val APPROVED = "APPROVED"
    val `PENDING_APPROVAL` = "PENDING_APPROVAL"
    val `EXPLICIT_APPROVED` = "EXPLICIT_APPROVED"
    val `EXPLICIT_REJECTED` = "EXPLICIT_REJECTED"

    val values = IndexedSeq(APPROVED, `PENDING_APPROVAL`, `EXPLICIT_APPROVED`, `EXPLICIT_REJECTED`)
  }

  /**
   * <p>Defines a patch filter.</p>
   */
  @js.native
  trait PatchFilter extends js.Object {
    var Key: PatchFilterKey
    var Values: PatchFilterValueList
  }

  object PatchFilter {
    def apply(
      Key: js.UndefOr[PatchFilterKey] = js.undefined,
      Values: js.UndefOr[PatchFilterValueList] = js.undefined
    ): PatchFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchFilter]
    }
  }

  /**
   * <p>A set of patch filters, typically used for approval rules.</p>
   */
  @js.native
  trait PatchFilterGroup extends js.Object {
    var PatchFilters: PatchFilterList
  }

  object PatchFilterGroup {
    def apply(
      PatchFilters: js.UndefOr[PatchFilterList] = js.undefined
    ): PatchFilterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchFilters" -> PatchFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchFilterGroup]
    }
  }


  object PatchFilterKeyEnum {
    val PRODUCT = "PRODUCT"
    val CLASSIFICATION = "CLASSIFICATION"
    val `MSRC_SEVERITY` = "MSRC_SEVERITY"
    val `PATCH_ID` = "PATCH_ID"

    val values = IndexedSeq(PRODUCT, CLASSIFICATION, `MSRC_SEVERITY`, `PATCH_ID`)
  }

  /**
   * <p>The mapping between a patch group and the patch baseline the patch group is registered with.</p>
   */
  @js.native
  trait PatchGroupPatchBaselineMapping extends js.Object {
    var PatchGroup: PatchGroup
    var BaselineIdentity: PatchBaselineIdentity
  }

  object PatchGroupPatchBaselineMapping {
    def apply(
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined,
      BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined
    ): PatchGroupPatchBaselineMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any }),
        ("BaselineIdentity" -> BaselineIdentity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Key: PatchOrchestratorFilterKey
    var Values: PatchOrchestratorFilterValues
  }

  object PatchOrchestratorFilter {
    def apply(
      Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined,
      Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
    ): PatchOrchestratorFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchOrchestratorFilter]
    }
  }

  /**
   * <p>Defines an approval rule for a patch baseline.</p>
   */
  @js.native
  trait PatchRule extends js.Object {
    var PatchFilterGroup: PatchFilterGroup
    var ApproveAfterDays: ApproveAfterDays
  }

  object PatchRule {
    def apply(
      PatchFilterGroup: js.UndefOr[PatchFilterGroup] = js.undefined,
      ApproveAfterDays: js.UndefOr[ApproveAfterDays] = js.undefined
    ): PatchRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchFilterGroup" -> PatchFilterGroup.map { x => x: js.Any }),
        ("ApproveAfterDays" -> ApproveAfterDays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchRule]
    }
  }

  /**
   * <p>A set of rules defining the approval rules for a patch baseline.</p>
   */
  @js.native
  trait PatchRuleGroup extends js.Object {
    var PatchRules: PatchRuleList
  }

  object PatchRuleGroup {
    def apply(
      PatchRules: js.UndefOr[PatchRuleList] = js.undefined
    ): PatchRuleGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PatchRules" -> PatchRules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchRuleGroup]
    }
  }

  /**
   * <p>Information about the approval status of a patch.</p>
   */
  @js.native
  trait PatchStatus extends js.Object {
    var DeploymentStatus: PatchDeploymentStatus
    var ApprovalDate: DateTime
  }

  object PatchStatus {
    def apply(
      DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined,
      ApprovalDate: js.UndefOr[DateTime] = js.undefined
    ): PatchStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeploymentStatus" -> DeploymentStatus.map { x => x: js.Any }),
        ("ApprovalDate" -> ApprovalDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

  @js.native
  trait PutInventoryRequest extends js.Object {
    var InstanceId: InstanceId
    var Items: InventoryItemList
  }

  object PutInventoryRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Items: js.UndefOr[InventoryItemList] = js.undefined
    ): PutInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInventoryRequest]
    }
  }

  @js.native
  trait PutInventoryResult extends js.Object {

  }

  object PutInventoryResult {
    def apply(

    ): PutInventoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInventoryResult]
    }
  }

  @js.native
  trait PutParameterRequest extends js.Object {
    var Overwrite: Boolean
    var Name: PSParameterName
    var Description: ParameterDescription
    var Value: PSParameterValue
    var KeyId: ParameterKeyId
    var Type: ParameterType
  }

  object PutParameterRequest {
    def apply(
      Overwrite: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[PSParameterName] = js.undefined,
      Description: js.UndefOr[ParameterDescription] = js.undefined,
      Value: js.UndefOr[PSParameterValue] = js.undefined,
      KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined
    ): PutParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Overwrite" -> Overwrite.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutParameterRequest]
    }
  }

  @js.native
  trait PutParameterResult extends js.Object {

  }

  object PutParameterResult {
    def apply(

    ): PutParameterResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutParameterResult]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object RegisterDefaultPatchBaselineRequest {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): RegisterDefaultPatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDefaultPatchBaselineRequest]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineResult extends js.Object {
    var BaselineId: BaselineId
  }

  object RegisterDefaultPatchBaselineResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): RegisterDefaultPatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): RegisterPatchBaselineForPatchGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait RegisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object RegisterPatchBaselineForPatchGroupResult {
    def apply(
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): RegisterPatchBaselineForPatchGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("PatchGroup" -> PatchGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait RegisterTargetWithMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var ClientToken: ClientToken
    var ResourceType: MaintenanceWindowResourceType
    var OwnerInformation: OwnerInformation
    var Targets: Targets
  }

  object RegisterTargetWithMaintenanceWindowRequest {
    def apply(
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
      OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined
    ): RegisterTargetWithMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("OwnerInformation" -> OwnerInformation.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
    var WindowTargetId: MaintenanceWindowTargetId
  }

  object RegisterTargetWithMaintenanceWindowResult {
    def apply(
      WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): RegisterTargetWithMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowTargetId" -> WindowTargetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
    var MaxErrors: VelocityConstraint
    var WindowId: MaintenanceWindowId
    var MaxConcurrency: VelocityConstraint
    var ClientToken: ClientToken
    var TaskArn: MaintenanceWindowTaskArn
    var TaskType: MaintenanceWindowTaskType
    var ServiceRoleArn: ServiceRole
    var TaskParameters: MaintenanceWindowTaskParameters
    var LoggingInfo: LoggingInfo
    var Priority: MaintenanceWindowTaskPriority
    var Targets: Targets
  }

  object RegisterTaskWithMaintenanceWindowRequest {
    def apply(
      MaxErrors: js.UndefOr[VelocityConstraint] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      MaxConcurrency: js.UndefOr[VelocityConstraint] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
      TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined,
      LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
      Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined
    ): RegisterTaskWithMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxErrors" -> MaxErrors.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("MaxConcurrency" -> MaxConcurrency.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("TaskArn" -> TaskArn.map { x => x: js.Any }),
        ("TaskType" -> TaskType.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("TaskParameters" -> TaskParameters.map { x => x: js.Any }),
        ("LoggingInfo" -> LoggingInfo.map { x => x: js.Any }),
        ("Priority" -> Priority.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
    var WindowTaskId: MaintenanceWindowTaskId
  }

  object RegisterTaskWithMaintenanceWindowResult {
    def apply(
      WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): RegisterTaskWithMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WindowTaskId" -> WindowTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceType: ResourceTypeForTagging
    var ResourceId: ResourceId
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceTypeForTagging] = js.undefined,
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined
    ): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResult extends js.Object {

  }

  object RemoveTagsFromResourceResult {
    def apply(

    ): RemoveTagsFromResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResult]
    }
  }

  /**
   * <p>Error returned if an attempt is made to delete a patch baseline that is registered for a patch group.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>Error returned when the caller has exceeded the default resource limits (e.g. too many Maintenance Windows have been created).</p>
   */
  @js.native
  trait ResourceLimitExceededExceptionException extends js.Object {
    var Message: String
  }


  object ResourceTypeEnum {
    val ManagedInstance = "ManagedInstance"
    val Document = "Document"
    val EC2Instance = "EC2Instance"

    val values = IndexedSeq(ManagedInstance, Document, EC2Instance)
  }


  object ResourceTypeForTaggingEnum {
    val ManagedInstance = "ManagedInstance"
    val MaintenanceWindow = "MaintenanceWindow"
    val Parameter = "Parameter"

    val values = IndexedSeq(ManagedInstance, MaintenanceWindow, Parameter)
  }

  /**
   * <p>The inventory item result attribute.</p>
   */
  @js.native
  trait ResultAttribute extends js.Object {
    var TypeName: InventoryItemTypeName
  }

  object ResultAttribute {
    def apply(
      TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): ResultAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TypeName" -> TypeName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultAttribute]
    }
  }

  /**
   * <p>An Amazon S3 bucket where you want to store the results of this request.</p>
   */
  @js.native
  trait S3OutputLocation extends js.Object {
    var OutputS3Region: S3Region
    var OutputS3BucketName: S3BucketName
    var OutputS3KeyPrefix: S3KeyPrefix
  }

  object S3OutputLocation {
    def apply(
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): S3OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OutputS3Region" -> OutputS3Region.map { x => x: js.Any }),
        ("OutputS3BucketName" -> OutputS3BucketName.map { x => x: js.Any }),
        ("OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3OutputLocation]
    }
  }

  /**
   * <p>A URL for the Amazon S3 bucket where you want to store the results of this request.</p>
   */
  @js.native
  trait S3OutputUrl extends js.Object {
    var OutputUrl: Url
  }

  object S3OutputUrl {
    def apply(
      OutputUrl: js.UndefOr[Url] = js.undefined
    ): S3OutputUrl = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OutputUrl" -> OutputUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3OutputUrl]
    }
  }

  @js.native
  trait SendCommandRequest extends js.Object {
    var MaxErrors: VelocityConstraint
    var OutputS3BucketName: S3BucketName
    var NotificationConfig: NotificationConfig
    var MaxConcurrency: VelocityConstraint
    var Parameters: Parameters
    var OutputS3Region: S3Region
    var ServiceRoleArn: ServiceRole
    var InstanceIds: InstanceIdList
    var DocumentName: DocumentARN
    var TimeoutSeconds: TimeoutSeconds
    var OutputS3KeyPrefix: S3KeyPrefix
    var Targets: Targets
    var Comment: Comment
    var DocumentHash: DocumentHash
    var DocumentHashType: DocumentHashType
  }

  object SendCommandRequest {
    def apply(
      MaxErrors: js.UndefOr[VelocityConstraint] = js.undefined,
      OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
      MaxConcurrency: js.UndefOr[VelocityConstraint] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      OutputS3Region: js.UndefOr[S3Region] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdList] = js.undefined,
      DocumentName: js.UndefOr[DocumentARN] = js.undefined,
      TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      Targets: js.UndefOr[Targets] = js.undefined,
      Comment: js.UndefOr[Comment] = js.undefined,
      DocumentHash: js.UndefOr[DocumentHash] = js.undefined,
      DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined
    ): SendCommandRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxErrors" -> MaxErrors.map { x => x: js.Any }),
        ("OutputS3BucketName" -> OutputS3BucketName.map { x => x: js.Any }),
        ("NotificationConfig" -> NotificationConfig.map { x => x: js.Any }),
        ("MaxConcurrency" -> MaxConcurrency.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("OutputS3Region" -> OutputS3Region.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("TimeoutSeconds" -> TimeoutSeconds.map { x => x: js.Any }),
        ("OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x: js.Any }),
        ("Targets" -> Targets.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("DocumentHash" -> DocumentHash.map { x => x: js.Any }),
        ("DocumentHashType" -> DocumentHashType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendCommandRequest]
    }
  }

  @js.native
  trait SendCommandResult extends js.Object {
    var Command: Command
  }

  object SendCommandResult {
    def apply(
      Command: js.UndefOr[Command] = js.undefined
    ): SendCommandResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Command" -> Command.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendCommandResult]
    }
  }

  @js.native
  trait StartAutomationExecutionRequest extends js.Object {
    var DocumentName: DocumentARN
    var DocumentVersion: DocumentVersion
    var Parameters: AutomationParameterMap
  }

  object StartAutomationExecutionRequest {
    def apply(
      DocumentName: js.UndefOr[DocumentARN] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
    ): StartAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentName" -> DocumentName.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAutomationExecutionRequest]
    }
  }

  @js.native
  trait StartAutomationExecutionResult extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
  }

  object StartAutomationExecutionResult {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    ): StartAutomationExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutomationExecutionId" -> AutomationExecutionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAutomationExecutionResult]
    }
  }

  /**
   * <p>The updated status is the same as the current status.</p>
   */
  @js.native
  trait StatusUnchangedException extends js.Object {

  }

  /**
   * <p>Detailed information about an the execution state of an Automation step.</p>
   */
  @js.native
  trait StepExecution extends js.Object {
    var FailureMessage: String
    var Inputs: NormalStringMap
    var ExecutionStartTime: DateTime
    var ResponseCode: String
    var ExecutionEndTime: DateTime
    var StepName: String
    var Response: String
    var StepStatus: AutomationExecutionStatus
    var Action: AutomationActionName
    var Outputs: AutomationParameterMap
  }

  object StepExecution {
    def apply(
      FailureMessage: js.UndefOr[String] = js.undefined,
      Inputs: js.UndefOr[NormalStringMap] = js.undefined,
      ExecutionStartTime: js.UndefOr[DateTime] = js.undefined,
      ResponseCode: js.UndefOr[String] = js.undefined,
      ExecutionEndTime: js.UndefOr[DateTime] = js.undefined,
      StepName: js.UndefOr[String] = js.undefined,
      Response: js.UndefOr[String] = js.undefined,
      StepStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
      Action: js.UndefOr[AutomationActionName] = js.undefined,
      Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
    ): StepExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailureMessage" -> FailureMessage.map { x => x: js.Any }),
        ("Inputs" -> Inputs.map { x => x: js.Any }),
        ("ExecutionStartTime" -> ExecutionStartTime.map { x => x: js.Any }),
        ("ResponseCode" -> ResponseCode.map { x => x: js.Any }),
        ("ExecutionEndTime" -> ExecutionEndTime.map { x => x: js.Any }),
        ("StepName" -> StepName.map { x => x: js.Any }),
        ("Response" -> Response.map { x => x: js.Any }),
        ("StepStatus" -> StepStatus.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any }),
        ("Outputs" -> Outputs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepExecution]
    }
  }

  @js.native
  trait StopAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
  }

  object StopAutomationExecutionRequest {
    def apply(
      AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    ): StopAutomationExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutomationExecutionId" -> AutomationExecutionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAutomationExecutionRequest]
    }
  }

  @js.native
  trait StopAutomationExecutionResult extends js.Object {

  }

  object StopAutomationExecutionResult {
    def apply(

    ): StopAutomationExecutionResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAutomationExecutionResult]
    }
  }

  /**
   * <p>Metadata that you assign to your managed instances. Tags enable you to categorize your managed instances in different ways, for example, by purpose, owner, or environment.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code> combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in the call.</p>
   */
  @js.native
  trait Target extends js.Object {
    var Key: TargetKey
    var Values: TargetValues
  }

  object Target {
    def apply(
      Key: js.UndefOr[TargetKey] = js.undefined,
      Values: js.UndefOr[TargetValues] = js.undefined
    ): Target = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Target]
    }
  }

  /**
   * <p>The <code>Targets</code> parameter includes too many tags. Remove one or more tags and try the command again.</p>
   */
  @js.native
  trait TooManyTagsErrorException extends js.Object {

  }

  /**
   * <p>There are concurrent updates for a resource that supports one update at a time.</p>
   */
  @js.native
  trait TooManyUpdatesException extends js.Object {

  }

  /**
   * <p>The size of inventory data has exceeded the total size limit for the resource.</p>
   */
  @js.native
  trait TotalSizeLimitExceededExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>Inventory item type schema version has to match supported versions in the service. Check output of <code>GetInventorySchema</code> to see the available schema version for each type.</p>
   */
  @js.native
  trait UnsupportedInventorySchemaVersionExceptionException extends js.Object {
    var Message: String
  }

  /**
   * <p>The parameter type is not supported.</p>
   */
  @js.native
  trait UnsupportedParameterTypeException extends js.Object {
    var message: String
  }

  /**
   * <p>The document does not support the platform type of the given instance ID(s). For example, you sent an SSM document for a Windows instance to a Linux instance.</p>
   */
  @js.native
  trait UnsupportedPlatformTypeException extends js.Object {
    var Message: String
  }

  @js.native
  trait UpdateAssociationRequest extends js.Object {
    var Parameters: Parameters
    var DocumentVersion: DocumentVersion
    var ScheduleExpression: ScheduleExpression
    var AssociationId: AssociationId
    var OutputLocation: InstanceAssociationOutputLocation
  }

  object UpdateAssociationRequest {
    def apply(
      Parameters: js.UndefOr[Parameters] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      AssociationId: js.UndefOr[AssociationId] = js.undefined,
      OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    ): UpdateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any }),
        ("ScheduleExpression" -> ScheduleExpression.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any }),
        ("OutputLocation" -> OutputLocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationRequest]
    }
  }

  @js.native
  trait UpdateAssociationResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object UpdateAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationResult]
    }
  }

  @js.native
  trait UpdateAssociationStatusRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
    var AssociationStatus: AssociationStatus
  }

  object UpdateAssociationStatusRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationStatus: js.UndefOr[AssociationStatus] = js.undefined
    ): UpdateAssociationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AssociationStatus" -> AssociationStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationStatusRequest]
    }
  }

  @js.native
  trait UpdateAssociationStatusResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object UpdateAssociationStatusResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationStatusResult]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionRequest extends js.Object {
    var Name: DocumentName
    var DocumentVersion: DocumentVersionNumber
  }

  object UpdateDocumentDefaultVersionRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersionNumber] = js.undefined
    ): UpdateDocumentDefaultVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentDefaultVersionRequest]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionResult extends js.Object {
    var Description: DocumentDefaultVersionDescription
  }

  object UpdateDocumentDefaultVersionResult {
    def apply(
      Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined
    ): UpdateDocumentDefaultVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentDefaultVersionResult]
    }
  }

  @js.native
  trait UpdateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var DocumentVersion: DocumentVersion
  }

  object UpdateDocumentRequest {
    def apply(
      Content: js.UndefOr[DocumentContent] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    ): UpdateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Content" -> Content.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("DocumentVersion" -> DocumentVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentRequest]
    }
  }

  @js.native
  trait UpdateDocumentResult extends js.Object {
    var DocumentDescription: DocumentDescription
  }

  object UpdateDocumentResult {
    def apply(
      DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): UpdateDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentDescription" -> DocumentDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowRequest extends js.Object {
    var Name: MaintenanceWindowName
    var WindowId: MaintenanceWindowId
    var Duration: MaintenanceWindowDurationHours
    var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
    var Enabled: MaintenanceWindowEnabled
    var Cutoff: MaintenanceWindowCutoff
    var Schedule: MaintenanceWindowSchedule
  }

  object UpdateMaintenanceWindowRequest {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    ): UpdateMaintenanceWindowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Cutoff" -> Cutoff.map { x => x: js.Any }),
        ("Schedule" -> Schedule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowResult extends js.Object {
    var Name: MaintenanceWindowName
    var WindowId: MaintenanceWindowId
    var Duration: MaintenanceWindowDurationHours
    var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
    var Enabled: MaintenanceWindowEnabled
    var Cutoff: MaintenanceWindowCutoff
    var Schedule: MaintenanceWindowSchedule
  }

  object UpdateMaintenanceWindowResult {
    def apply(
      Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
      WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
      Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
      AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
      Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
      Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
      Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    ): UpdateMaintenanceWindowResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("WindowId" -> WindowId.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("AllowUnassociatedTargets" -> AllowUnassociatedTargets.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Cutoff" -> Cutoff.map { x => x: js.Any }),
        ("Schedule" -> Schedule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceWindowResult]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleRequest extends js.Object {
    var InstanceId: ManagedInstanceId
    var IamRole: IamRole
  }

  object UpdateManagedInstanceRoleRequest {
    def apply(
      InstanceId: js.UndefOr[ManagedInstanceId] = js.undefined,
      IamRole: js.UndefOr[IamRole] = js.undefined
    ): UpdateManagedInstanceRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("IamRole" -> IamRole.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateManagedInstanceRoleRequest]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleResult extends js.Object {

  }

  object UpdateManagedInstanceRoleResult {
    def apply(

    ): UpdateManagedInstanceRoleResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateManagedInstanceRoleResult]
    }
  }

  @js.native
  trait UpdatePatchBaselineRequest extends js.Object {
    var Name: BaselineName
    var Description: BaselineDescription
    var BaselineId: BaselineId
    var ApprovalRules: PatchRuleGroup
    var ApprovedPatches: PatchIdList
    var RejectedPatches: PatchIdList
    var GlobalFilters: PatchFilterGroup
  }

  object UpdatePatchBaselineRequest {
    def apply(
      Name: js.UndefOr[BaselineName] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    ): UpdatePatchBaselineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("ApprovalRules" -> ApprovalRules.map { x => x: js.Any }),
        ("ApprovedPatches" -> ApprovedPatches.map { x => x: js.Any }),
        ("RejectedPatches" -> RejectedPatches.map { x => x: js.Any }),
        ("GlobalFilters" -> GlobalFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePatchBaselineRequest]
    }
  }

  @js.native
  trait UpdatePatchBaselineResult extends js.Object {
    var ModifiedDate: DateTime
    var Name: BaselineName
    var CreatedDate: DateTime
    var Description: BaselineDescription
    var BaselineId: BaselineId
    var ApprovalRules: PatchRuleGroup
    var ApprovedPatches: PatchIdList
    var RejectedPatches: PatchIdList
    var GlobalFilters: PatchFilterGroup
  }

  object UpdatePatchBaselineResult {
    def apply(
      ModifiedDate: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[BaselineName] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[BaselineDescription] = js.undefined,
      BaselineId: js.UndefOr[BaselineId] = js.undefined,
      ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
      ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
      RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
      GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    ): UpdatePatchBaselineResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ModifiedDate" -> ModifiedDate.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("BaselineId" -> BaselineId.map { x => x: js.Any }),
        ("ApprovalRules" -> ApprovalRules.map { x => x: js.Any }),
        ("ApprovedPatches" -> ApprovedPatches.map { x => x: js.Any }),
        ("RejectedPatches" -> RejectedPatches.map { x => x: js.Any }),
        ("GlobalFilters" -> GlobalFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePatchBaselineResult]
    }
  }
}
