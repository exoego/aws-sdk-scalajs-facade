package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ssm {
  type Account = String
  type AccountId = String
  type AccountIdList = js.Array[AccountId]
  type AccountSharingInfoList = js.Array[AccountSharingInfo]
  type Accounts = js.Array[Account]
  type ActivationCode = String
  type ActivationDescription = String
  type ActivationId = String
  type ActivationList = js.Array[Activation]
  type AgentErrorCode = String
  type AggregatorSchemaOnly = Boolean
  type AllowedPattern = String
  type ApplyOnlyAtCronInterval = Boolean
  type ApproveAfterDays = Int
  type AssociationDescriptionList = js.Array[AssociationDescription]
  type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue = String
  type AssociationExecutionId = String
  type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = String
  type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[AssociationExecution]
  type AssociationFilterList = js.Array[AssociationFilter]
  type AssociationFilterValue = String
  type AssociationId = String
  type AssociationIdList = js.Array[AssociationId]
  type AssociationList = js.Array[Association]
  type AssociationName = String
  type AssociationResourceId = String
  type AssociationResourceType = String
  type AssociationStatusAggregatedCount = js.Dictionary[InstanceCount]
  type AssociationVersion = String
  type AssociationVersionList = js.Array[AssociationVersionInfo]
  type AttachmentContentList = js.Array[AttachmentContent]
  type AttachmentHash = String
  type AttachmentIdentifier = String
  type AttachmentInformationList = js.Array[AttachmentInformation]
  type AttachmentName = String
  type AttachmentUrl = String
  type AttachmentsSourceList = js.Array[AttachmentsSource]
  type AttachmentsSourceValue = String
  type AttachmentsSourceValues = js.Array[AttachmentsSourceValue]
  type AttributeName = String
  type AttributeValue = String
  type AutomationActionName = String
  type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue = String
  type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId = String
  type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]
  type AutomationParameterKey = String
  type AutomationParameterMap = js.Dictionary[AutomationParameterValueList]
  type AutomationParameterValue = String
  type AutomationParameterValueList = js.Array[AutomationParameterValue]
  type AutomationTargetParameterName = String
  type BaselineDescription = String
  type BaselineId = String
  type BaselineName = String
  type BatchErrorMessage = String
  type CalendarNameOrARN = String
  type CalendarNameOrARNList = js.Array[CalendarNameOrARN]
  type ChangeDetailsValue = String
  type ChangeRequestName = String
  type ClientToken = String
  type CloudWatchLogGroupName = String
  type CloudWatchOutputEnabled = Boolean
  type CommandFilterList = js.Array[CommandFilter]
  type CommandFilterValue = String
  type CommandId = String
  type CommandInvocationList = js.Array[CommandInvocation]
  type CommandList = js.Array[Command]
  type CommandMaxResults = Int
  type CommandPluginList = js.Array[CommandPlugin]
  type CommandPluginName = String
  type CommandPluginOutput = String
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
  type ComplianceResourceId = String
  type ComplianceResourceIdList = js.Array[ComplianceResourceId]
  type ComplianceResourceType = String
  type ComplianceResourceTypeList = js.Array[ComplianceResourceType]
  type ComplianceStringFilterKey = String
  type ComplianceStringFilterList = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount = Int
  type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName = String
  type ComputerName = String
  type ContentLength = Double
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate = js.Date
  type DateTime = js.Date
  type DefaultBaseline = Boolean
  type DefaultInstanceName = String
  type DeliveryTimedOutCount = Int
  type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument = String
  type DocumentARN = String
  type DocumentAuthor = String
  type DocumentContent = String
  type DocumentDisplayName = String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = String
  type DocumentHash = String
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
  type DocumentPermissionMaxResults = Int
  type DocumentRequiresList = js.Array[DocumentRequires]
  type DocumentReviewComment = String
  type DocumentReviewCommentList = js.Array[DocumentReviewCommentSource]
  type DocumentReviewerResponseList = js.Array[DocumentReviewerResponseSource]
  type DocumentSchemaVersion = String
  type DocumentSha1 = String
  type DocumentStatusInformation = String
  type DocumentVersion = String
  type DocumentVersionList = js.Array[DocumentVersionInfo]
  type DocumentVersionName = String
  type DocumentVersionNumber = String
  type DryRun = Boolean
  type EffectiveInstanceAssociationMaxResults = Int
  type EffectivePatchList = js.Array[EffectivePatch]
  type ErrorCount = Int
  type ExecutionRoleName = String
  type ExpirationDate = js.Date
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  type GetInventorySchemaMaxResults = Int
  type GetOpsMetadataMaxResults = Int
  type GetParametersByPathMaxResults = Int
  type IPAddress = String
  type ISO8601String = String
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
  type InstancePatchStatesList = js.Array[InstancePatchState]
  type InstanceTagName = String
  type InstancesCount = Int
  type InventoryAggregatorExpression = String
  type InventoryAggregatorList = js.Array[InventoryAggregator]
  type InventoryDeletionLastStatusMessage = String
  type InventoryDeletionLastStatusUpdateTime = js.Date
  type InventoryDeletionStartTime = js.Date
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
  type InventoryResultEntityId = String
  type InventoryResultEntityList = js.Array[InventoryResultEntity]
  type InventoryResultItemKey = String
  type InventoryResultItemMap = js.Dictionary[InventoryResultItem]
  type InventoryTypeDisplayName = String
  type InvocationTraceOutput = String
  type IsSubTypeSchema = Boolean
  type KeyList = js.Array[TagKey]
  type LastResourceDataSyncMessage = String
  type LastResourceDataSyncTime = js.Date
  type LastSuccessfulResourceDataSyncTime = js.Date
  type ListOpsMetadataMaxResults = Int
  type MaintenanceWindowAllowUnassociatedTargets = Boolean
  type MaintenanceWindowCutoff = Int
  type MaintenanceWindowDescription = String
  type MaintenanceWindowDurationHours = Int
  type MaintenanceWindowEnabled = Boolean
  type MaintenanceWindowExecutionId = String
  type MaintenanceWindowExecutionList = js.Array[MaintenanceWindowExecution]
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
  type MaintenanceWindowLambdaPayload = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MaintenanceWindowLambdaQualifier = String
  type MaintenanceWindowMaxResults = Int
  type MaintenanceWindowName = String
  type MaintenanceWindowOffset = Int
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
  type MaintenanceWindowTimezone = String
  type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = String
  type MaxConcurrency = String
  type MaxErrors = String
  type MaxResults = Int
  type MaxResultsEC2Compatible = Int
  type MaxSessionDuration = String
  type MetadataKey = String
  type MetadataKeysToDeleteList = js.Array[MetadataKey]
  type MetadataMap = js.Dictionary[MetadataValue]
  type MetadataValueString = String
  type NextToken = String
  type NormalStringMap = js.Dictionary[String]
  type NotificationArn = String
  type NotificationEventList = js.Array[NotificationEvent]
  type OpsAggregatorList = js.Array[OpsAggregator]
  type OpsAggregatorType = String
  type OpsAggregatorValue = String
  type OpsAggregatorValueKey = String
  type OpsAggregatorValueMap = js.Dictionary[OpsAggregatorValue]
  type OpsDataAttributeName = String
  type OpsDataTypeName = String
  type OpsEntityId = String
  type OpsEntityItemCaptureTime = String
  type OpsEntityItemEntry = js.Dictionary[AttributeValue]
  type OpsEntityItemEntryList = js.Array[OpsEntityItemEntry]
  type OpsEntityItemKey = String
  type OpsEntityItemMap = js.Dictionary[OpsEntityItem]
  type OpsEntityList = js.Array[OpsEntity]
  type OpsFilterKey = String
  type OpsFilterList = js.Array[OpsFilter]
  type OpsFilterValue = String
  type OpsFilterValueList = js.Array[OpsFilterValue]
  type OpsItemCategory = String
  type OpsItemDataKey = String
  type OpsItemDataValueString = String
  type OpsItemDescription = String
  type OpsItemEventFilterValue = String
  type OpsItemEventFilterValues = js.Array[OpsItemEventFilterValue]
  type OpsItemEventFilters = js.Array[OpsItemEventFilter]
  type OpsItemEventMaxResults = Int
  type OpsItemEventSummaries = js.Array[OpsItemEventSummary]
  type OpsItemFilterValue = String
  type OpsItemFilterValues = js.Array[OpsItemFilterValue]
  type OpsItemFilters = js.Array[OpsItemFilter]
  type OpsItemId = String
  type OpsItemMaxResults = Int
  type OpsItemNotifications = js.Array[OpsItemNotification]
  type OpsItemOperationalData = js.Dictionary[OpsItemDataValue]
  type OpsItemOpsDataKeysList = js.Array[String]
  type OpsItemPriority = Int
  type OpsItemRelatedItemAssociationId = String
  type OpsItemRelatedItemAssociationResourceType = String
  type OpsItemRelatedItemAssociationResourceUri = String
  type OpsItemRelatedItemAssociationType = String
  type OpsItemRelatedItemSummaries = js.Array[OpsItemRelatedItemSummary]
  type OpsItemRelatedItemsFilterValue = String
  type OpsItemRelatedItemsFilterValues = js.Array[OpsItemRelatedItemsFilterValue]
  type OpsItemRelatedItemsFilters = js.Array[OpsItemRelatedItemsFilter]
  type OpsItemRelatedItemsMaxResults = Int
  type OpsItemSeverity = String
  type OpsItemSource = String
  type OpsItemSummaries = js.Array[OpsItemSummary]
  type OpsItemTitle = String
  type OpsItemType = String
  type OpsMetadataArn = String
  type OpsMetadataFilterKey = String
  type OpsMetadataFilterList = js.Array[OpsMetadataFilter]
  type OpsMetadataFilterValue = String
  type OpsMetadataFilterValueList = js.Array[OpsMetadataFilterValue]
  type OpsMetadataList = js.Array[OpsMetadata]
  type OpsMetadataResourceId = String
  type OpsResultAttributeList = js.Array[OpsResultAttribute]
  type OutputSourceId = String
  type OutputSourceType = String
  type OwnerInformation = String
  type PSParameterName = String
  type PSParameterSelector = String
  type PSParameterValue = String
  type PSParameterVersion = Double
  type ParameterDataType = String
  type ParameterDescription = String
  type ParameterHistoryList = js.Array[ParameterHistory]
  type ParameterKeyId = String
  type ParameterLabel = String
  type ParameterLabelList = js.Array[ParameterLabel]
  type ParameterList = js.Array[Parameter]
  type ParameterMetadataList = js.Array[ParameterMetadata]
  type ParameterName = String
  type ParameterNameList = js.Array[PSParameterName]
  type ParameterPolicies = String
  type ParameterPolicyList = js.Array[ParameterInlinePolicy]
  type ParameterStringFilterKey = String
  type ParameterStringFilterList = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue = String
  type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption = String
  type ParameterValue = String
  type ParameterValueList = js.Array[ParameterValue]
  type Parameters = js.Dictionary[ParameterValueList]
  type ParametersFilterList = js.Array[ParametersFilter]
  type ParametersFilterValue = String
  type ParametersFilterValueList = js.Array[ParametersFilterValue]
  type PatchAdvisoryId = String
  type PatchAdvisoryIdList = js.Array[PatchAdvisoryId]
  type PatchArch = String
  type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults = Int
  type PatchBugzillaId = String
  type PatchBugzillaIdList = js.Array[PatchBugzillaId]
  type PatchCVEId = String
  type PatchCVEIdList = js.Array[PatchCVEId]
  type PatchCVEIds = String
  type PatchClassification = String
  type PatchComplianceDataList = js.Array[PatchComplianceData]
  type PatchComplianceMaxResults = Int
  type PatchContentUrl = String
  type PatchCriticalNonCompliantCount = Int
  type PatchDescription = String
  type PatchEpoch = Int
  type PatchFailedCount = Int
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
  type PatchInstalledPendingRebootCount = Int
  type PatchInstalledRejectedCount = Int
  type PatchKbNumber = String
  type PatchLanguage = String
  type PatchList = js.Array[Patch]
  type PatchMissingCount = Int
  type PatchMsrcNumber = String
  type PatchMsrcSeverity = String
  type PatchName = String
  type PatchNotApplicableCount = Int
  type PatchOrchestratorFilterKey = String
  type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = String
  type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]
  type PatchOtherNonCompliantCount = Int
  type PatchProduct = String
  type PatchProductFamily = String
  type PatchPropertiesList = js.Array[PatchPropertyEntry]
  type PatchPropertyEntry = js.Dictionary[AttributeValue]
  type PatchRelease = String
  type PatchRepository = String
  type PatchRuleList = js.Array[PatchRule]
  type PatchSecurityNonCompliantCount = Int
  type PatchSeverity = String
  type PatchSourceConfiguration = String
  type PatchSourceList = js.Array[PatchSource]
  type PatchSourceName = String
  type PatchSourceProduct = String
  type PatchSourceProductList = js.Array[PatchSourceProduct]
  type PatchStringDateTime = String
  type PatchTitle = String
  type PatchUnreportedNotApplicableCount = Int
  type PatchVendor = String
  type PatchVersion = String
  type PlatformTypeList = js.Array[PlatformType]
  type Product = String
  type PutInventoryMessage = String
  type Region = String
  type Regions = js.Array[Region]
  type RegistrationLimit = Int
  type RegistrationMetadataKey = String
  type RegistrationMetadataList = js.Array[RegistrationMetadataItem]
  type RegistrationMetadataValue = String
  type RegistrationsCount = Int
  type RelatedOpsItems = js.Array[RelatedOpsItem]
  type RemainingCount = Int
  type ResourceComplianceSummaryItemList = js.Array[ResourceComplianceSummaryItem]
  type ResourceCount = Int
  type ResourceCountByStatus = String
  type ResourceDataSyncAWSKMSKeyARN = String
  type ResourceDataSyncCreatedTime = js.Date
  type ResourceDataSyncDestinationDataSharingType = String
  type ResourceDataSyncEnableAllOpsDataSources = Boolean
  type ResourceDataSyncIncludeFutureRegions = Boolean
  type ResourceDataSyncItemList = js.Array[ResourceDataSyncItem]
  type ResourceDataSyncLastModifiedTime = js.Date
  type ResourceDataSyncName = String
  type ResourceDataSyncOrganizationSourceType = String
  type ResourceDataSyncOrganizationalUnitId = String
  type ResourceDataSyncOrganizationalUnitList = js.Array[ResourceDataSyncOrganizationalUnit]
  type ResourceDataSyncS3BucketName = String
  type ResourceDataSyncS3Prefix = String
  type ResourceDataSyncS3Region = String
  type ResourceDataSyncSourceRegion = String
  type ResourceDataSyncSourceRegionList = js.Array[ResourceDataSyncSourceRegion]
  type ResourceDataSyncSourceType = String
  type ResourceDataSyncState = String
  type ResourceDataSyncType = String
  type ResourceId = String
  type ResponseCode = Int
  type ResultAttributeList = js.Array[ResultAttribute]
  type ReviewInformationList = js.Array[ReviewInformation]
  type Reviewer = String
  type Runbooks = js.Array[Runbook]
  type S3BucketName = String
  type S3KeyPrefix = String
  type S3Region = String
  type ScheduleExpression = String
  type ScheduledWindowExecutionList = js.Array[ScheduledWindowExecution]
  type ServiceRole = String
  type ServiceSettingId = String
  type ServiceSettingValue = String
  type SessionDetails = String
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
  type SessionReason = String
  type SessionTarget = String
  type SharedDocumentVersion = String
  type SnapshotDownloadUrl = String
  type SnapshotId = String
  type SourceId = String
  type StandardErrorContent = String
  type StandardOutputContent = String
  type StatusAdditionalInfo = String
  type StatusDetails = String
  type StatusMessage = String
  type StatusName = String
  type StepExecutionFilterList = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue = String
  type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]
  type StepExecutionList = js.Array[StepExecution]
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
  type UUID = String
  type Url = String
  type ValidNextStep = String
  type ValidNextStepList = js.Array[ValidNextStep]
  type Version = String

  final class SSMOps(private val service: SSM) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResult] = service.addTagsToResource(params).promise().toFuture
    @inline def associateOpsItemRelatedItemFuture(params: AssociateOpsItemRelatedItemRequest): Future[AssociateOpsItemRelatedItemResponse] = service.associateOpsItemRelatedItem(params).promise().toFuture
    @inline def cancelCommandFuture(params: CancelCommandRequest): Future[CancelCommandResult] = service.cancelCommand(params).promise().toFuture
    @inline def cancelMaintenanceWindowExecutionFuture(params: CancelMaintenanceWindowExecutionRequest): Future[CancelMaintenanceWindowExecutionResult] = service.cancelMaintenanceWindowExecution(params).promise().toFuture
    @inline def createActivationFuture(params: CreateActivationRequest): Future[CreateActivationResult] = service.createActivation(params).promise().toFuture
    @inline def createAssociationBatchFuture(params: CreateAssociationBatchRequest): Future[CreateAssociationBatchResult] = service.createAssociationBatch(params).promise().toFuture
    @inline def createAssociationFuture(params: CreateAssociationRequest): Future[CreateAssociationResult] = service.createAssociation(params).promise().toFuture
    @inline def createDocumentFuture(params: CreateDocumentRequest): Future[CreateDocumentResult] = service.createDocument(params).promise().toFuture
    @inline def createMaintenanceWindowFuture(params: CreateMaintenanceWindowRequest): Future[CreateMaintenanceWindowResult] = service.createMaintenanceWindow(params).promise().toFuture
    @inline def createOpsItemFuture(params: CreateOpsItemRequest): Future[CreateOpsItemResponse] = service.createOpsItem(params).promise().toFuture
    @inline def createOpsMetadataFuture(params: CreateOpsMetadataRequest): Future[CreateOpsMetadataResult] = service.createOpsMetadata(params).promise().toFuture
    @inline def createPatchBaselineFuture(params: CreatePatchBaselineRequest): Future[CreatePatchBaselineResult] = service.createPatchBaseline(params).promise().toFuture
    @inline def createResourceDataSyncFuture(params: CreateResourceDataSyncRequest): Future[CreateResourceDataSyncResult] = service.createResourceDataSync(params).promise().toFuture
    @inline def deleteActivationFuture(params: DeleteActivationRequest): Future[DeleteActivationResult] = service.deleteActivation(params).promise().toFuture
    @inline def deleteAssociationFuture(params: DeleteAssociationRequest): Future[DeleteAssociationResult] = service.deleteAssociation(params).promise().toFuture
    @inline def deleteDocumentFuture(params: DeleteDocumentRequest): Future[DeleteDocumentResult] = service.deleteDocument(params).promise().toFuture
    @inline def deleteInventoryFuture(params: DeleteInventoryRequest): Future[DeleteInventoryResult] = service.deleteInventory(params).promise().toFuture
    @inline def deleteMaintenanceWindowFuture(params: DeleteMaintenanceWindowRequest): Future[DeleteMaintenanceWindowResult] = service.deleteMaintenanceWindow(params).promise().toFuture
    @inline def deleteOpsMetadataFuture(params: DeleteOpsMetadataRequest): Future[DeleteOpsMetadataResult] = service.deleteOpsMetadata(params).promise().toFuture
    @inline def deleteParameterFuture(params: DeleteParameterRequest): Future[DeleteParameterResult] = service.deleteParameter(params).promise().toFuture
    @inline def deleteParametersFuture(params: DeleteParametersRequest): Future[DeleteParametersResult] = service.deleteParameters(params).promise().toFuture
    @inline def deletePatchBaselineFuture(params: DeletePatchBaselineRequest): Future[DeletePatchBaselineResult] = service.deletePatchBaseline(params).promise().toFuture
    @inline def deleteResourceDataSyncFuture(params: DeleteResourceDataSyncRequest): Future[DeleteResourceDataSyncResult] = service.deleteResourceDataSync(params).promise().toFuture
    @inline def deregisterManagedInstanceFuture(params: DeregisterManagedInstanceRequest): Future[DeregisterManagedInstanceResult] = service.deregisterManagedInstance(params).promise().toFuture
    @inline def deregisterPatchBaselineForPatchGroupFuture(params: DeregisterPatchBaselineForPatchGroupRequest): Future[DeregisterPatchBaselineForPatchGroupResult] = service.deregisterPatchBaselineForPatchGroup(params).promise().toFuture
    @inline def deregisterTargetFromMaintenanceWindowFuture(params: DeregisterTargetFromMaintenanceWindowRequest): Future[DeregisterTargetFromMaintenanceWindowResult] = service.deregisterTargetFromMaintenanceWindow(params).promise().toFuture
    @inline def deregisterTaskFromMaintenanceWindowFuture(params: DeregisterTaskFromMaintenanceWindowRequest): Future[DeregisterTaskFromMaintenanceWindowResult] = service.deregisterTaskFromMaintenanceWindow(params).promise().toFuture
    @inline def describeActivationsFuture(params: DescribeActivationsRequest): Future[DescribeActivationsResult] = service.describeActivations(params).promise().toFuture
    @inline def describeAssociationExecutionTargetsFuture(params: DescribeAssociationExecutionTargetsRequest): Future[DescribeAssociationExecutionTargetsResult] = service.describeAssociationExecutionTargets(params).promise().toFuture
    @inline def describeAssociationExecutionsFuture(params: DescribeAssociationExecutionsRequest): Future[DescribeAssociationExecutionsResult] = service.describeAssociationExecutions(params).promise().toFuture
    @inline def describeAssociationFuture(params: DescribeAssociationRequest): Future[DescribeAssociationResult] = service.describeAssociation(params).promise().toFuture
    @inline def describeAutomationExecutionsFuture(params: DescribeAutomationExecutionsRequest): Future[DescribeAutomationExecutionsResult] = service.describeAutomationExecutions(params).promise().toFuture
    @inline def describeAutomationStepExecutionsFuture(params: DescribeAutomationStepExecutionsRequest): Future[DescribeAutomationStepExecutionsResult] = service.describeAutomationStepExecutions(params).promise().toFuture
    @inline def describeAvailablePatchesFuture(params: DescribeAvailablePatchesRequest): Future[DescribeAvailablePatchesResult] = service.describeAvailablePatches(params).promise().toFuture
    @inline def describeDocumentFuture(params: DescribeDocumentRequest): Future[DescribeDocumentResult] = service.describeDocument(params).promise().toFuture
    @inline def describeDocumentPermissionFuture(params: DescribeDocumentPermissionRequest): Future[DescribeDocumentPermissionResponse] = service.describeDocumentPermission(params).promise().toFuture
    @inline def describeEffectiveInstanceAssociationsFuture(params: DescribeEffectiveInstanceAssociationsRequest): Future[DescribeEffectiveInstanceAssociationsResult] = service.describeEffectiveInstanceAssociations(params).promise().toFuture
    @inline def describeEffectivePatchesForPatchBaselineFuture(params: DescribeEffectivePatchesForPatchBaselineRequest): Future[DescribeEffectivePatchesForPatchBaselineResult] = service.describeEffectivePatchesForPatchBaseline(params).promise().toFuture
    @inline def describeInstanceAssociationsStatusFuture(params: DescribeInstanceAssociationsStatusRequest): Future[DescribeInstanceAssociationsStatusResult] = service.describeInstanceAssociationsStatus(params).promise().toFuture
    @inline def describeInstanceInformationFuture(params: DescribeInstanceInformationRequest): Future[DescribeInstanceInformationResult] = service.describeInstanceInformation(params).promise().toFuture
    @inline def describeInstancePatchStatesForPatchGroupFuture(params: DescribeInstancePatchStatesForPatchGroupRequest): Future[DescribeInstancePatchStatesForPatchGroupResult] = service.describeInstancePatchStatesForPatchGroup(params).promise().toFuture
    @inline def describeInstancePatchStatesFuture(params: DescribeInstancePatchStatesRequest): Future[DescribeInstancePatchStatesResult] = service.describeInstancePatchStates(params).promise().toFuture
    @inline def describeInstancePatchesFuture(params: DescribeInstancePatchesRequest): Future[DescribeInstancePatchesResult] = service.describeInstancePatches(params).promise().toFuture
    @inline def describeInventoryDeletionsFuture(params: DescribeInventoryDeletionsRequest): Future[DescribeInventoryDeletionsResult] = service.describeInventoryDeletions(params).promise().toFuture
    @inline def describeMaintenanceWindowExecutionTaskInvocationsFuture(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest): Future[DescribeMaintenanceWindowExecutionTaskInvocationsResult] = service.describeMaintenanceWindowExecutionTaskInvocations(params).promise().toFuture
    @inline def describeMaintenanceWindowExecutionTasksFuture(params: DescribeMaintenanceWindowExecutionTasksRequest): Future[DescribeMaintenanceWindowExecutionTasksResult] = service.describeMaintenanceWindowExecutionTasks(params).promise().toFuture
    @inline def describeMaintenanceWindowExecutionsFuture(params: DescribeMaintenanceWindowExecutionsRequest): Future[DescribeMaintenanceWindowExecutionsResult] = service.describeMaintenanceWindowExecutions(params).promise().toFuture
    @inline def describeMaintenanceWindowScheduleFuture(params: DescribeMaintenanceWindowScheduleRequest): Future[DescribeMaintenanceWindowScheduleResult] = service.describeMaintenanceWindowSchedule(params).promise().toFuture
    @inline def describeMaintenanceWindowTargetsFuture(params: DescribeMaintenanceWindowTargetsRequest): Future[DescribeMaintenanceWindowTargetsResult] = service.describeMaintenanceWindowTargets(params).promise().toFuture
    @inline def describeMaintenanceWindowTasksFuture(params: DescribeMaintenanceWindowTasksRequest): Future[DescribeMaintenanceWindowTasksResult] = service.describeMaintenanceWindowTasks(params).promise().toFuture
    @inline def describeMaintenanceWindowsForTargetFuture(params: DescribeMaintenanceWindowsForTargetRequest): Future[DescribeMaintenanceWindowsForTargetResult] = service.describeMaintenanceWindowsForTarget(params).promise().toFuture
    @inline def describeMaintenanceWindowsFuture(params: DescribeMaintenanceWindowsRequest): Future[DescribeMaintenanceWindowsResult] = service.describeMaintenanceWindows(params).promise().toFuture
    @inline def describeOpsItemsFuture(params: DescribeOpsItemsRequest): Future[DescribeOpsItemsResponse] = service.describeOpsItems(params).promise().toFuture
    @inline def describeParametersFuture(params: DescribeParametersRequest): Future[DescribeParametersResult] = service.describeParameters(params).promise().toFuture
    @inline def describePatchBaselinesFuture(params: DescribePatchBaselinesRequest): Future[DescribePatchBaselinesResult] = service.describePatchBaselines(params).promise().toFuture
    @inline def describePatchGroupStateFuture(params: DescribePatchGroupStateRequest): Future[DescribePatchGroupStateResult] = service.describePatchGroupState(params).promise().toFuture
    @inline def describePatchGroupsFuture(params: DescribePatchGroupsRequest): Future[DescribePatchGroupsResult] = service.describePatchGroups(params).promise().toFuture
    @inline def describePatchPropertiesFuture(params: DescribePatchPropertiesRequest): Future[DescribePatchPropertiesResult] = service.describePatchProperties(params).promise().toFuture
    @inline def describeSessionsFuture(params: DescribeSessionsRequest): Future[DescribeSessionsResponse] = service.describeSessions(params).promise().toFuture
    @inline def disassociateOpsItemRelatedItemFuture(params: DisassociateOpsItemRelatedItemRequest): Future[DisassociateOpsItemRelatedItemResponse] = service.disassociateOpsItemRelatedItem(params).promise().toFuture
    @inline def getAutomationExecutionFuture(params: GetAutomationExecutionRequest): Future[GetAutomationExecutionResult] = service.getAutomationExecution(params).promise().toFuture
    @inline def getCalendarStateFuture(params: GetCalendarStateRequest): Future[GetCalendarStateResponse] = service.getCalendarState(params).promise().toFuture
    @inline def getCommandInvocationFuture(params: GetCommandInvocationRequest): Future[GetCommandInvocationResult] = service.getCommandInvocation(params).promise().toFuture
    @inline def getConnectionStatusFuture(params: GetConnectionStatusRequest): Future[GetConnectionStatusResponse] = service.getConnectionStatus(params).promise().toFuture
    @inline def getDefaultPatchBaselineFuture(params: GetDefaultPatchBaselineRequest): Future[GetDefaultPatchBaselineResult] = service.getDefaultPatchBaseline(params).promise().toFuture
    @inline def getDeployablePatchSnapshotForInstanceFuture(params: GetDeployablePatchSnapshotForInstanceRequest): Future[GetDeployablePatchSnapshotForInstanceResult] = service.getDeployablePatchSnapshotForInstance(params).promise().toFuture
    @inline def getDocumentFuture(params: GetDocumentRequest): Future[GetDocumentResult] = service.getDocument(params).promise().toFuture
    @inline def getInventoryFuture(params: GetInventoryRequest): Future[GetInventoryResult] = service.getInventory(params).promise().toFuture
    @inline def getInventorySchemaFuture(params: GetInventorySchemaRequest): Future[GetInventorySchemaResult] = service.getInventorySchema(params).promise().toFuture
    @inline def getMaintenanceWindowExecutionFuture(params: GetMaintenanceWindowExecutionRequest): Future[GetMaintenanceWindowExecutionResult] = service.getMaintenanceWindowExecution(params).promise().toFuture
    @inline def getMaintenanceWindowExecutionTaskFuture(params: GetMaintenanceWindowExecutionTaskRequest): Future[GetMaintenanceWindowExecutionTaskResult] = service.getMaintenanceWindowExecutionTask(params).promise().toFuture
    @inline def getMaintenanceWindowExecutionTaskInvocationFuture(params: GetMaintenanceWindowExecutionTaskInvocationRequest): Future[GetMaintenanceWindowExecutionTaskInvocationResult] = service.getMaintenanceWindowExecutionTaskInvocation(params).promise().toFuture
    @inline def getMaintenanceWindowFuture(params: GetMaintenanceWindowRequest): Future[GetMaintenanceWindowResult] = service.getMaintenanceWindow(params).promise().toFuture
    @inline def getMaintenanceWindowTaskFuture(params: GetMaintenanceWindowTaskRequest): Future[GetMaintenanceWindowTaskResult] = service.getMaintenanceWindowTask(params).promise().toFuture
    @inline def getOpsItemFuture(params: GetOpsItemRequest): Future[GetOpsItemResponse] = service.getOpsItem(params).promise().toFuture
    @inline def getOpsMetadataFuture(params: GetOpsMetadataRequest): Future[GetOpsMetadataResult] = service.getOpsMetadata(params).promise().toFuture
    @inline def getOpsSummaryFuture(params: GetOpsSummaryRequest): Future[GetOpsSummaryResult] = service.getOpsSummary(params).promise().toFuture
    @inline def getParameterFuture(params: GetParameterRequest): Future[GetParameterResult] = service.getParameter(params).promise().toFuture
    @inline def getParameterHistoryFuture(params: GetParameterHistoryRequest): Future[GetParameterHistoryResult] = service.getParameterHistory(params).promise().toFuture
    @inline def getParametersByPathFuture(params: GetParametersByPathRequest): Future[GetParametersByPathResult] = service.getParametersByPath(params).promise().toFuture
    @inline def getParametersFuture(params: GetParametersRequest): Future[GetParametersResult] = service.getParameters(params).promise().toFuture
    @inline def getPatchBaselineForPatchGroupFuture(params: GetPatchBaselineForPatchGroupRequest): Future[GetPatchBaselineForPatchGroupResult] = service.getPatchBaselineForPatchGroup(params).promise().toFuture
    @inline def getPatchBaselineFuture(params: GetPatchBaselineRequest): Future[GetPatchBaselineResult] = service.getPatchBaseline(params).promise().toFuture
    @inline def getServiceSettingFuture(params: GetServiceSettingRequest): Future[GetServiceSettingResult] = service.getServiceSetting(params).promise().toFuture
    @inline def labelParameterVersionFuture(params: LabelParameterVersionRequest): Future[LabelParameterVersionResult] = service.labelParameterVersion(params).promise().toFuture
    @inline def listAssociationVersionsFuture(params: ListAssociationVersionsRequest): Future[ListAssociationVersionsResult] = service.listAssociationVersions(params).promise().toFuture
    @inline def listAssociationsFuture(params: ListAssociationsRequest): Future[ListAssociationsResult] = service.listAssociations(params).promise().toFuture
    @inline def listCommandInvocationsFuture(params: ListCommandInvocationsRequest): Future[ListCommandInvocationsResult] = service.listCommandInvocations(params).promise().toFuture
    @inline def listCommandsFuture(params: ListCommandsRequest): Future[ListCommandsResult] = service.listCommands(params).promise().toFuture
    @inline def listComplianceItemsFuture(params: ListComplianceItemsRequest): Future[ListComplianceItemsResult] = service.listComplianceItems(params).promise().toFuture
    @inline def listComplianceSummariesFuture(params: ListComplianceSummariesRequest): Future[ListComplianceSummariesResult] = service.listComplianceSummaries(params).promise().toFuture
    @inline def listDocumentMetadataHistoryFuture(params: ListDocumentMetadataHistoryRequest): Future[ListDocumentMetadataHistoryResponse] = service.listDocumentMetadataHistory(params).promise().toFuture
    @inline def listDocumentVersionsFuture(params: ListDocumentVersionsRequest): Future[ListDocumentVersionsResult] = service.listDocumentVersions(params).promise().toFuture
    @inline def listDocumentsFuture(params: ListDocumentsRequest): Future[ListDocumentsResult] = service.listDocuments(params).promise().toFuture
    @inline def listInventoryEntriesFuture(params: ListInventoryEntriesRequest): Future[ListInventoryEntriesResult] = service.listInventoryEntries(params).promise().toFuture
    @inline def listOpsItemEventsFuture(params: ListOpsItemEventsRequest): Future[ListOpsItemEventsResponse] = service.listOpsItemEvents(params).promise().toFuture
    @inline def listOpsItemRelatedItemsFuture(params: ListOpsItemRelatedItemsRequest): Future[ListOpsItemRelatedItemsResponse] = service.listOpsItemRelatedItems(params).promise().toFuture
    @inline def listOpsMetadataFuture(params: ListOpsMetadataRequest): Future[ListOpsMetadataResult] = service.listOpsMetadata(params).promise().toFuture
    @inline def listResourceComplianceSummariesFuture(params: ListResourceComplianceSummariesRequest): Future[ListResourceComplianceSummariesResult] = service.listResourceComplianceSummaries(params).promise().toFuture
    @inline def listResourceDataSyncFuture(params: ListResourceDataSyncRequest): Future[ListResourceDataSyncResult] = service.listResourceDataSync(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def modifyDocumentPermissionFuture(params: ModifyDocumentPermissionRequest): Future[ModifyDocumentPermissionResponse] = service.modifyDocumentPermission(params).promise().toFuture
    @inline def putComplianceItemsFuture(params: PutComplianceItemsRequest): Future[PutComplianceItemsResult] = service.putComplianceItems(params).promise().toFuture
    @inline def putInventoryFuture(params: PutInventoryRequest): Future[PutInventoryResult] = service.putInventory(params).promise().toFuture
    @inline def putParameterFuture(params: PutParameterRequest): Future[PutParameterResult] = service.putParameter(params).promise().toFuture
    @inline def registerDefaultPatchBaselineFuture(params: RegisterDefaultPatchBaselineRequest): Future[RegisterDefaultPatchBaselineResult] = service.registerDefaultPatchBaseline(params).promise().toFuture
    @inline def registerPatchBaselineForPatchGroupFuture(params: RegisterPatchBaselineForPatchGroupRequest): Future[RegisterPatchBaselineForPatchGroupResult] = service.registerPatchBaselineForPatchGroup(params).promise().toFuture
    @inline def registerTargetWithMaintenanceWindowFuture(params: RegisterTargetWithMaintenanceWindowRequest): Future[RegisterTargetWithMaintenanceWindowResult] = service.registerTargetWithMaintenanceWindow(params).promise().toFuture
    @inline def registerTaskWithMaintenanceWindowFuture(params: RegisterTaskWithMaintenanceWindowRequest): Future[RegisterTaskWithMaintenanceWindowResult] = service.registerTaskWithMaintenanceWindow(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceRequest): Future[RemoveTagsFromResourceResult] = service.removeTagsFromResource(params).promise().toFuture
    @inline def resetServiceSettingFuture(params: ResetServiceSettingRequest): Future[ResetServiceSettingResult] = service.resetServiceSetting(params).promise().toFuture
    @inline def resumeSessionFuture(params: ResumeSessionRequest): Future[ResumeSessionResponse] = service.resumeSession(params).promise().toFuture
    @inline def sendAutomationSignalFuture(params: SendAutomationSignalRequest): Future[SendAutomationSignalResult] = service.sendAutomationSignal(params).promise().toFuture
    @inline def sendCommandFuture(params: SendCommandRequest): Future[SendCommandResult] = service.sendCommand(params).promise().toFuture
    @inline def startAssociationsOnceFuture(params: StartAssociationsOnceRequest): Future[StartAssociationsOnceResult] = service.startAssociationsOnce(params).promise().toFuture
    @inline def startAutomationExecutionFuture(params: StartAutomationExecutionRequest): Future[StartAutomationExecutionResult] = service.startAutomationExecution(params).promise().toFuture
    @inline def startChangeRequestExecutionFuture(params: StartChangeRequestExecutionRequest): Future[StartChangeRequestExecutionResult] = service.startChangeRequestExecution(params).promise().toFuture
    @inline def startSessionFuture(params: StartSessionRequest): Future[StartSessionResponse] = service.startSession(params).promise().toFuture
    @inline def stopAutomationExecutionFuture(params: StopAutomationExecutionRequest): Future[StopAutomationExecutionResult] = service.stopAutomationExecution(params).promise().toFuture
    @inline def terminateSessionFuture(params: TerminateSessionRequest): Future[TerminateSessionResponse] = service.terminateSession(params).promise().toFuture
    @inline def unlabelParameterVersionFuture(params: UnlabelParameterVersionRequest): Future[UnlabelParameterVersionResult] = service.unlabelParameterVersion(params).promise().toFuture
    @inline def updateAssociationFuture(params: UpdateAssociationRequest): Future[UpdateAssociationResult] = service.updateAssociation(params).promise().toFuture
    @inline def updateAssociationStatusFuture(params: UpdateAssociationStatusRequest): Future[UpdateAssociationStatusResult] = service.updateAssociationStatus(params).promise().toFuture
    @inline def updateDocumentDefaultVersionFuture(params: UpdateDocumentDefaultVersionRequest): Future[UpdateDocumentDefaultVersionResult] = service.updateDocumentDefaultVersion(params).promise().toFuture
    @inline def updateDocumentFuture(params: UpdateDocumentRequest): Future[UpdateDocumentResult] = service.updateDocument(params).promise().toFuture
    @inline def updateDocumentMetadataFuture(params: UpdateDocumentMetadataRequest): Future[UpdateDocumentMetadataResponse] = service.updateDocumentMetadata(params).promise().toFuture
    @inline def updateMaintenanceWindowFuture(params: UpdateMaintenanceWindowRequest): Future[UpdateMaintenanceWindowResult] = service.updateMaintenanceWindow(params).promise().toFuture
    @inline def updateMaintenanceWindowTargetFuture(params: UpdateMaintenanceWindowTargetRequest): Future[UpdateMaintenanceWindowTargetResult] = service.updateMaintenanceWindowTarget(params).promise().toFuture
    @inline def updateMaintenanceWindowTaskFuture(params: UpdateMaintenanceWindowTaskRequest): Future[UpdateMaintenanceWindowTaskResult] = service.updateMaintenanceWindowTask(params).promise().toFuture
    @inline def updateManagedInstanceRoleFuture(params: UpdateManagedInstanceRoleRequest): Future[UpdateManagedInstanceRoleResult] = service.updateManagedInstanceRole(params).promise().toFuture
    @inline def updateOpsItemFuture(params: UpdateOpsItemRequest): Future[UpdateOpsItemResponse] = service.updateOpsItem(params).promise().toFuture
    @inline def updateOpsMetadataFuture(params: UpdateOpsMetadataRequest): Future[UpdateOpsMetadataResult] = service.updateOpsMetadata(params).promise().toFuture
    @inline def updatePatchBaselineFuture(params: UpdatePatchBaselineRequest): Future[UpdatePatchBaselineResult] = service.updatePatchBaseline(params).promise().toFuture
    @inline def updateResourceDataSyncFuture(params: UpdateResourceDataSyncRequest): Future[UpdateResourceDataSyncResult] = service.updateResourceDataSync(params).promise().toFuture
    @inline def updateServiceSettingFuture(params: UpdateServiceSettingRequest): Future[UpdateServiceSettingResult] = service.updateServiceSetting(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ssm", JSImport.Namespace, "AWS.SSM")
  class SSM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult] = js.native
    def associateOpsItemRelatedItem(params: AssociateOpsItemRelatedItemRequest): Request[AssociateOpsItemRelatedItemResponse] = js.native
    def cancelCommand(params: CancelCommandRequest): Request[CancelCommandResult] = js.native
    def cancelMaintenanceWindowExecution(params: CancelMaintenanceWindowExecutionRequest): Request[CancelMaintenanceWindowExecutionResult] = js.native
    def createActivation(params: CreateActivationRequest): Request[CreateActivationResult] = js.native
    def createAssociation(params: CreateAssociationRequest): Request[CreateAssociationResult] = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest): Request[CreateAssociationBatchResult] = js.native
    def createDocument(params: CreateDocumentRequest): Request[CreateDocumentResult] = js.native
    def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): Request[CreateMaintenanceWindowResult] = js.native
    def createOpsItem(params: CreateOpsItemRequest): Request[CreateOpsItemResponse] = js.native
    def createOpsMetadata(params: CreateOpsMetadataRequest): Request[CreateOpsMetadataResult] = js.native
    def createPatchBaseline(params: CreatePatchBaselineRequest): Request[CreatePatchBaselineResult] = js.native
    def createResourceDataSync(params: CreateResourceDataSyncRequest): Request[CreateResourceDataSyncResult] = js.native
    def deleteActivation(params: DeleteActivationRequest): Request[DeleteActivationResult] = js.native
    def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResult] = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[DeleteDocumentResult] = js.native
    def deleteInventory(params: DeleteInventoryRequest): Request[DeleteInventoryResult] = js.native
    def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): Request[DeleteMaintenanceWindowResult] = js.native
    def deleteOpsMetadata(params: DeleteOpsMetadataRequest): Request[DeleteOpsMetadataResult] = js.native
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
    def describeOpsItems(params: DescribeOpsItemsRequest): Request[DescribeOpsItemsResponse] = js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResult] = js.native
    def describePatchBaselines(params: DescribePatchBaselinesRequest): Request[DescribePatchBaselinesResult] = js.native
    def describePatchGroupState(params: DescribePatchGroupStateRequest): Request[DescribePatchGroupStateResult] = js.native
    def describePatchGroups(params: DescribePatchGroupsRequest): Request[DescribePatchGroupsResult] = js.native
    def describePatchProperties(params: DescribePatchPropertiesRequest): Request[DescribePatchPropertiesResult] = js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResponse] = js.native
    def disassociateOpsItemRelatedItem(params: DisassociateOpsItemRelatedItemRequest): Request[DisassociateOpsItemRelatedItemResponse] = js.native
    def getAutomationExecution(params: GetAutomationExecutionRequest): Request[GetAutomationExecutionResult] = js.native
    def getCalendarState(params: GetCalendarStateRequest): Request[GetCalendarStateResponse] = js.native
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
    def getOpsItem(params: GetOpsItemRequest): Request[GetOpsItemResponse] = js.native
    def getOpsMetadata(params: GetOpsMetadataRequest): Request[GetOpsMetadataResult] = js.native
    def getOpsSummary(params: GetOpsSummaryRequest): Request[GetOpsSummaryResult] = js.native
    def getParameter(params: GetParameterRequest): Request[GetParameterResult] = js.native
    def getParameterHistory(params: GetParameterHistoryRequest): Request[GetParameterHistoryResult] = js.native
    def getParameters(params: GetParametersRequest): Request[GetParametersResult] = js.native
    def getParametersByPath(params: GetParametersByPathRequest): Request[GetParametersByPathResult] = js.native
    def getPatchBaseline(params: GetPatchBaselineRequest): Request[GetPatchBaselineResult] = js.native
    def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest): Request[GetPatchBaselineForPatchGroupResult] = js.native
    def getServiceSetting(params: GetServiceSettingRequest): Request[GetServiceSettingResult] = js.native
    def labelParameterVersion(params: LabelParameterVersionRequest): Request[LabelParameterVersionResult] = js.native
    def listAssociationVersions(params: ListAssociationVersionsRequest): Request[ListAssociationVersionsResult] = js.native
    def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResult] = js.native
    def listCommandInvocations(params: ListCommandInvocationsRequest): Request[ListCommandInvocationsResult] = js.native
    def listCommands(params: ListCommandsRequest): Request[ListCommandsResult] = js.native
    def listComplianceItems(params: ListComplianceItemsRequest): Request[ListComplianceItemsResult] = js.native
    def listComplianceSummaries(params: ListComplianceSummariesRequest): Request[ListComplianceSummariesResult] = js.native
    def listDocumentMetadataHistory(params: ListDocumentMetadataHistoryRequest): Request[ListDocumentMetadataHistoryResponse] = js.native
    def listDocumentVersions(params: ListDocumentVersionsRequest): Request[ListDocumentVersionsResult] = js.native
    def listDocuments(params: ListDocumentsRequest): Request[ListDocumentsResult] = js.native
    def listInventoryEntries(params: ListInventoryEntriesRequest): Request[ListInventoryEntriesResult] = js.native
    def listOpsItemEvents(params: ListOpsItemEventsRequest): Request[ListOpsItemEventsResponse] = js.native
    def listOpsItemRelatedItems(params: ListOpsItemRelatedItemsRequest): Request[ListOpsItemRelatedItemsResponse] = js.native
    def listOpsMetadata(params: ListOpsMetadataRequest): Request[ListOpsMetadataResult] = js.native
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
    def resetServiceSetting(params: ResetServiceSettingRequest): Request[ResetServiceSettingResult] = js.native
    def resumeSession(params: ResumeSessionRequest): Request[ResumeSessionResponse] = js.native
    def sendAutomationSignal(params: SendAutomationSignalRequest): Request[SendAutomationSignalResult] = js.native
    def sendCommand(params: SendCommandRequest): Request[SendCommandResult] = js.native
    def startAssociationsOnce(params: StartAssociationsOnceRequest): Request[StartAssociationsOnceResult] = js.native
    def startAutomationExecution(params: StartAutomationExecutionRequest): Request[StartAutomationExecutionResult] = js.native
    def startChangeRequestExecution(params: StartChangeRequestExecutionRequest): Request[StartChangeRequestExecutionResult] = js.native
    def startSession(params: StartSessionRequest): Request[StartSessionResponse] = js.native
    def stopAutomationExecution(params: StopAutomationExecutionRequest): Request[StopAutomationExecutionResult] = js.native
    def terminateSession(params: TerminateSessionRequest): Request[TerminateSessionResponse] = js.native
    def unlabelParameterVersion(params: UnlabelParameterVersionRequest): Request[UnlabelParameterVersionResult] = js.native
    def updateAssociation(params: UpdateAssociationRequest): Request[UpdateAssociationResult] = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest): Request[UpdateAssociationStatusResult] = js.native
    def updateDocument(params: UpdateDocumentRequest): Request[UpdateDocumentResult] = js.native
    def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest): Request[UpdateDocumentDefaultVersionResult] = js.native
    def updateDocumentMetadata(params: UpdateDocumentMetadataRequest): Request[UpdateDocumentMetadataResponse] = js.native
    def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): Request[UpdateMaintenanceWindowResult] = js.native
    def updateMaintenanceWindowTarget(params: UpdateMaintenanceWindowTargetRequest): Request[UpdateMaintenanceWindowTargetResult] = js.native
    def updateMaintenanceWindowTask(params: UpdateMaintenanceWindowTaskRequest): Request[UpdateMaintenanceWindowTaskResult] = js.native
    def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): Request[UpdateManagedInstanceRoleResult] = js.native
    def updateOpsItem(params: UpdateOpsItemRequest): Request[UpdateOpsItemResponse] = js.native
    def updateOpsMetadata(params: UpdateOpsMetadataRequest): Request[UpdateOpsMetadataResult] = js.native
    def updatePatchBaseline(params: UpdatePatchBaselineRequest): Request[UpdatePatchBaselineResult] = js.native
    def updateResourceDataSync(params: UpdateResourceDataSyncRequest): Request[UpdateResourceDataSyncResult] = js.native
    def updateServiceSetting(params: UpdateServiceSettingRequest): Request[UpdateServiceSettingResult] = js.native
  }
  object SSM {
    @inline implicit def toOps(service: SSM): SSMOps = {
      new SSMOps(service)
    }
  }

  /** Information includes the Amazon Web Services account ID where the current document is shared and the version shared with that account.
    */
  @js.native
  trait AccountSharingInfo extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var SharedDocumentVersion: js.UndefOr[SharedDocumentVersion]
  }

  object AccountSharingInfo {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        SharedDocumentVersion: js.UndefOr[SharedDocumentVersion] = js.undefined
    ): AccountSharingInfo = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      SharedDocumentVersion.foreach(__v => __obj.updateDynamic("SharedDocumentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSharingInfo]
    }
  }

  /** An activation registers one or more on-premises servers or virtual machines (VMs) with Amazon Web Services so that you can configure those servers or VMs using Run Command. A server or VM that has been registered with Amazon Web Services Systems Manager is called a managed node.
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
    var Tags: js.UndefOr[TagList]
  }

  object Activation {
    @inline
    def apply(
        ActivationId: js.UndefOr[ActivationId] = js.undefined,
        CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
        DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
        Description: js.UndefOr[ActivationDescription] = js.undefined,
        ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
        Expired: js.UndefOr[Boolean] = js.undefined,
        IamRole: js.UndefOr[IamRole] = js.undefined,
        RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
        RegistrationsCount: js.UndefOr[RegistrationsCount] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Activation = {
      val __obj = js.Dynamic.literal()
      ActivationId.foreach(__v => __obj.updateDynamic("ActivationId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultInstanceName.foreach(__v => __obj.updateDynamic("DefaultInstanceName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      Expired.foreach(__v => __obj.updateDynamic("Expired")(__v.asInstanceOf[js.Any]))
      IamRole.foreach(__v => __obj.updateDynamic("IamRole")(__v.asInstanceOf[js.Any]))
      RegistrationLimit.foreach(__v => __obj.updateDynamic("RegistrationLimit")(__v.asInstanceOf[js.Any]))
      RegistrationsCount.foreach(__v => __obj.updateDynamic("RegistrationsCount")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Activation]
    }
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
    var Tags: TagList
  }

  object AddTagsToResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceTypeForTagging,
        Tags: TagList
    ): AddTagsToResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResult extends js.Object

  object AddTagsToResourceResult {
    @inline
    def apply(): AddTagsToResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddTagsToResourceResult]
    }
  }

  @js.native
  trait AssociateOpsItemRelatedItemRequest extends js.Object {
    var AssociationType: OpsItemRelatedItemAssociationType
    var OpsItemId: OpsItemId
    var ResourceType: OpsItemRelatedItemAssociationResourceType
    var ResourceUri: OpsItemRelatedItemAssociationResourceUri
  }

  object AssociateOpsItemRelatedItemRequest {
    @inline
    def apply(
        AssociationType: OpsItemRelatedItemAssociationType,
        OpsItemId: OpsItemId,
        ResourceType: OpsItemRelatedItemAssociationResourceType,
        ResourceUri: OpsItemRelatedItemAssociationResourceUri
    ): AssociateOpsItemRelatedItemRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationType" -> AssociationType.asInstanceOf[js.Any],
        "OpsItemId" -> OpsItemId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "ResourceUri" -> ResourceUri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateOpsItemRelatedItemRequest]
    }
  }

  @js.native
  trait AssociateOpsItemRelatedItemResponse extends js.Object {
    var AssociationId: js.UndefOr[OpsItemRelatedItemAssociationId]
  }

  object AssociateOpsItemRelatedItemResponse {
    @inline
    def apply(
        AssociationId: js.UndefOr[OpsItemRelatedItemAssociationId] = js.undefined
    ): AssociateOpsItemRelatedItemResponse = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateOpsItemRelatedItemResponse]
    }
  }

  /** Describes an association of a Amazon Web Services Systems Manager document (SSM document) and a managed node.
    */
  @js.native
  trait Association extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[DocumentARN]
    var Overview: js.UndefOr[AssociationOverview]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  object Association {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        Overview: js.UndefOr[AssociationOverview] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): Association = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.updateDynamic("LastExecutionDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Overview.foreach(__v => __obj.updateDynamic("Overview")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Association]
    }
  }

  /** Describes the parameters for a document.
    */
  @js.native
  trait AssociationDescription extends js.Object {
    var ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval]
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
    var CalendarNames: js.UndefOr[CalendarNameOrARNList]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var Date: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var LastExecutionDate: js.UndefOr[DateTime]
    var LastSuccessfulExecutionDate: js.UndefOr[DateTime]
    var LastUpdateAssociationDate: js.UndefOr[DateTime]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentARN]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Overview: js.UndefOr[AssociationOverview]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Status: js.UndefOr[AssociationStatus]
    var SyncCompliance: js.UndefOr[AssociationSyncCompliance]
    var TargetLocations: js.UndefOr[TargetLocations]
    var Targets: js.UndefOr[Targets]
  }

  object AssociationDescription {
    @inline
    def apply(
        ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval] = js.undefined,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        Date: js.UndefOr[DateTime] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
        LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined,
        LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Overview: js.UndefOr[AssociationOverview] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Status: js.UndefOr[AssociationStatus] = js.undefined,
        SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): AssociationDescription = {
      val __obj = js.Dynamic.literal()
      ApplyOnlyAtCronInterval.foreach(__v => __obj.updateDynamic("ApplyOnlyAtCronInterval")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(__v => __obj.updateDynamic("AutomationTargetParameterName")(__v.asInstanceOf[js.Any]))
      CalendarNames.foreach(__v => __obj.updateDynamic("CalendarNames")(__v.asInstanceOf[js.Any]))
      ComplianceSeverity.foreach(__v => __obj.updateDynamic("ComplianceSeverity")(__v.asInstanceOf[js.Any]))
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.updateDynamic("LastExecutionDate")(__v.asInstanceOf[js.Any]))
      LastSuccessfulExecutionDate.foreach(__v => __obj.updateDynamic("LastSuccessfulExecutionDate")(__v.asInstanceOf[js.Any]))
      LastUpdateAssociationDate.foreach(__v => __obj.updateDynamic("LastUpdateAssociationDate")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      Overview.foreach(__v => __obj.updateDynamic("Overview")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SyncCompliance.foreach(__v => __obj.updateDynamic("SyncCompliance")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationDescription]
    }
  }

  /** Includes information about the specified association.
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
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DetailedStatus: js.UndefOr[StatusName] = js.undefined,
        ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
        LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
        ResourceCountByStatus: js.UndefOr[ResourceCountByStatus] = js.undefined,
        Status: js.UndefOr[StatusName] = js.undefined
    ): AssociationExecution = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.updateDynamic("DetailedStatus")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.updateDynamic("LastExecutionDate")(__v.asInstanceOf[js.Any]))
      ResourceCountByStatus.foreach(__v => __obj.updateDynamic("ResourceCountByStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationExecution]
    }
  }

  /** Filters used in the request.
    */
  @js.native
  trait AssociationExecutionFilter extends js.Object {
    var Key: AssociationExecutionFilterKey
    var Type: AssociationFilterOperatorType
    var Value: AssociationExecutionFilterValue
  }

  object AssociationExecutionFilter {
    @inline
    def apply(
        Key: AssociationExecutionFilterKey,
        Type: AssociationFilterOperatorType,
        Value: AssociationExecutionFilterValue
    ): AssociationExecutionFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociationExecutionFilter]
    }
  }

  /** Includes information about the specified association execution.
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
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        DetailedStatus: js.UndefOr[StatusName] = js.undefined,
        ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined,
        LastExecutionDate: js.UndefOr[DateTime] = js.undefined,
        OutputSource: js.UndefOr[OutputSource] = js.undefined,
        ResourceId: js.UndefOr[AssociationResourceId] = js.undefined,
        ResourceType: js.UndefOr[AssociationResourceType] = js.undefined,
        Status: js.UndefOr[StatusName] = js.undefined
    ): AssociationExecutionTarget = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.updateDynamic("DetailedStatus")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.updateDynamic("LastExecutionDate")(__v.asInstanceOf[js.Any]))
      OutputSource.foreach(__v => __obj.updateDynamic("OutputSource")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationExecutionTarget]
    }
  }

  /** Filters for the association execution.
    */
  @js.native
  trait AssociationExecutionTargetsFilter extends js.Object {
    var Key: AssociationExecutionTargetsFilterKey
    var Value: AssociationExecutionTargetsFilterValue
  }

  object AssociationExecutionTargetsFilter {
    @inline
    def apply(
        Key: AssociationExecutionTargetsFilterKey,
        Value: AssociationExecutionTargetsFilterValue
    ): AssociationExecutionTargetsFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociationExecutionTargetsFilter]
    }
  }

  /** Describes a filter.
    */
  @js.native
  trait AssociationFilter extends js.Object {
    var key: AssociationFilterKey
    var value: AssociationFilterValue
  }

  object AssociationFilter {
    @inline
    def apply(
        key: AssociationFilterKey,
        value: AssociationFilterValue
    ): AssociationFilter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociationFilter]
    }
  }

  /** Information about the association.
    */
  @js.native
  trait AssociationOverview extends js.Object {
    var AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount]
    var DetailedStatus: js.UndefOr[StatusName]
    var Status: js.UndefOr[StatusName]
  }

  object AssociationOverview {
    @inline
    def apply(
        AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount] = js.undefined,
        DetailedStatus: js.UndefOr[StatusName] = js.undefined,
        Status: js.UndefOr[StatusName] = js.undefined
    ): AssociationOverview = {
      val __obj = js.Dynamic.literal()
      AssociationStatusAggregatedCount.foreach(__v => __obj.updateDynamic("AssociationStatusAggregatedCount")(__v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.updateDynamic("DetailedStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationOverview]
    }
  }

  /** Describes an association status.
    */
  @js.native
  trait AssociationStatus extends js.Object {
    var Date: DateTime
    var Message: StatusMessage
    var Name: AssociationStatusName
    var AdditionalInfo: js.UndefOr[StatusAdditionalInfo]
  }

  object AssociationStatus {
    @inline
    def apply(
        Date: DateTime,
        Message: StatusMessage,
        Name: AssociationStatusName,
        AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
    ): AssociationStatus = {
      val __obj = js.Dynamic.literal(
        "Date" -> Date.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AdditionalInfo.foreach(__v => __obj.updateDynamic("AdditionalInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationStatus]
    }
  }

  /** Information about the association version.
    */
  @js.native
  trait AssociationVersionInfo extends js.Object {
    var ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval]
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var CalendarNames: js.UndefOr[CalendarNameOrARNList]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var CreatedDate: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentARN]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var SyncCompliance: js.UndefOr[AssociationSyncCompliance]
    var TargetLocations: js.UndefOr[TargetLocations]
    var Targets: js.UndefOr[Targets]
  }

  object AssociationVersionInfo {
    @inline
    def apply(
        ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval] = js.undefined,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        CreatedDate: js.UndefOr[DateTime] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): AssociationVersionInfo = {
      val __obj = js.Dynamic.literal()
      ApplyOnlyAtCronInterval.foreach(__v => __obj.updateDynamic("ApplyOnlyAtCronInterval")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      CalendarNames.foreach(__v => __obj.updateDynamic("CalendarNames")(__v.asInstanceOf[js.Any]))
      ComplianceSeverity.foreach(__v => __obj.updateDynamic("ComplianceSeverity")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      SyncCompliance.foreach(__v => __obj.updateDynamic("SyncCompliance")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationVersionInfo]
    }
  }

  /** A structure that includes attributes that describe a document attachment.
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
    @inline
    def apply(
        Hash: js.UndefOr[AttachmentHash] = js.undefined,
        HashType: js.UndefOr[AttachmentHashType] = js.undefined,
        Name: js.UndefOr[AttachmentName] = js.undefined,
        Size: js.UndefOr[ContentLength] = js.undefined,
        Url: js.UndefOr[AttachmentUrl] = js.undefined
    ): AttachmentContent = {
      val __obj = js.Dynamic.literal()
      Hash.foreach(__v => __obj.updateDynamic("Hash")(__v.asInstanceOf[js.Any]))
      HashType.foreach(__v => __obj.updateDynamic("HashType")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentContent]
    }
  }

  /** An attribute of an attachment, such as the attachment name.
    */
  @js.native
  trait AttachmentInformation extends js.Object {
    var Name: js.UndefOr[AttachmentName]
  }

  object AttachmentInformation {
    @inline
    def apply(
        Name: js.UndefOr[AttachmentName] = js.undefined
    ): AttachmentInformation = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentInformation]
    }
  }

  /** Identifying information about a document attachment, including the file name and a key-value pair that identifies the location of an attachment to a document.
    */
  @js.native
  trait AttachmentsSource extends js.Object {
    var Key: js.UndefOr[AttachmentsSourceKey]
    var Name: js.UndefOr[AttachmentIdentifier]
    var Values: js.UndefOr[AttachmentsSourceValues]
  }

  object AttachmentsSource {
    @inline
    def apply(
        Key: js.UndefOr[AttachmentsSourceKey] = js.undefined,
        Name: js.UndefOr[AttachmentIdentifier] = js.undefined,
        Values: js.UndefOr[AttachmentsSourceValues] = js.undefined
    ): AttachmentsSource = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentsSource]
    }
  }

  /** Detailed information about the current state of an individual Automation execution.
    */
  @js.native
  trait AutomationExecution extends js.Object {
    var AssociationId: js.UndefOr[String]
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus]
    var AutomationSubtype: js.UndefOr[AutomationSubtype]
    var ChangeRequestName: js.UndefOr[ChangeRequestName]
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
    var OpsItemId: js.UndefOr[String]
    var Outputs: js.UndefOr[AutomationParameterMap]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var ProgressCounters: js.UndefOr[ProgressCounters]
    var ResolvedTargets: js.UndefOr[ResolvedTargets]
    var Runbooks: js.UndefOr[Runbooks]
    var ScheduledTime: js.UndefOr[DateTime]
    var StepExecutions: js.UndefOr[StepExecutionList]
    var StepExecutionsTruncated: js.UndefOr[Boolean]
    var Target: js.UndefOr[String]
    var TargetLocations: js.UndefOr[TargetLocations]
    var TargetMaps: js.UndefOr[TargetMaps]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object AutomationExecution {
    @inline
    def apply(
        AssociationId: js.UndefOr[String] = js.undefined,
        AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
        AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
        AutomationSubtype: js.UndefOr[AutomationSubtype] = js.undefined,
        ChangeRequestName: js.UndefOr[ChangeRequestName] = js.undefined,
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
        OpsItemId: js.UndefOr[String] = js.undefined,
        Outputs: js.UndefOr[AutomationParameterMap] = js.undefined,
        Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
        ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
        ProgressCounters: js.UndefOr[ProgressCounters] = js.undefined,
        ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined,
        Runbooks: js.UndefOr[Runbooks] = js.undefined,
        ScheduledTime: js.UndefOr[DateTime] = js.undefined,
        StepExecutions: js.UndefOr[StepExecutionList] = js.undefined,
        StepExecutionsTruncated: js.UndefOr[Boolean] = js.undefined,
        Target: js.UndefOr[String] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
        TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): AutomationExecution = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AutomationExecutionId.foreach(__v => __obj.updateDynamic("AutomationExecutionId")(__v.asInstanceOf[js.Any]))
      AutomationExecutionStatus.foreach(__v => __obj.updateDynamic("AutomationExecutionStatus")(__v.asInstanceOf[js.Any]))
      AutomationSubtype.foreach(__v => __obj.updateDynamic("AutomationSubtype")(__v.asInstanceOf[js.Any]))
      ChangeRequestName.foreach(__v => __obj.updateDynamic("ChangeRequestName")(__v.asInstanceOf[js.Any]))
      CurrentAction.foreach(__v => __obj.updateDynamic("CurrentAction")(__v.asInstanceOf[js.Any]))
      CurrentStepName.foreach(__v => __obj.updateDynamic("CurrentStepName")(__v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      ExecutedBy.foreach(__v => __obj.updateDynamic("ExecutedBy")(__v.asInstanceOf[js.Any]))
      ExecutionEndTime.foreach(__v => __obj.updateDynamic("ExecutionEndTime")(__v.asInstanceOf[js.Any]))
      ExecutionStartTime.foreach(__v => __obj.updateDynamic("ExecutionStartTime")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ParentAutomationExecutionId.foreach(__v => __obj.updateDynamic("ParentAutomationExecutionId")(__v.asInstanceOf[js.Any]))
      ProgressCounters.foreach(__v => __obj.updateDynamic("ProgressCounters")(__v.asInstanceOf[js.Any]))
      ResolvedTargets.foreach(__v => __obj.updateDynamic("ResolvedTargets")(__v.asInstanceOf[js.Any]))
      Runbooks.foreach(__v => __obj.updateDynamic("Runbooks")(__v.asInstanceOf[js.Any]))
      ScheduledTime.foreach(__v => __obj.updateDynamic("ScheduledTime")(__v.asInstanceOf[js.Any]))
      StepExecutions.foreach(__v => __obj.updateDynamic("StepExecutions")(__v.asInstanceOf[js.Any]))
      StepExecutionsTruncated.foreach(__v => __obj.updateDynamic("StepExecutionsTruncated")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      TargetMaps.foreach(__v => __obj.updateDynamic("TargetMaps")(__v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.updateDynamic("TargetParameterName")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomationExecution]
    }
  }

  /** A filter used to match specific automation executions. This is used to limit the scope of Automation execution information returned.
    */
  @js.native
  trait AutomationExecutionFilter extends js.Object {
    var Key: AutomationExecutionFilterKey
    var Values: AutomationExecutionFilterValueList
  }

  object AutomationExecutionFilter {
    @inline
    def apply(
        Key: AutomationExecutionFilterKey,
        Values: AutomationExecutionFilterValueList
    ): AutomationExecutionFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AutomationExecutionFilter]
    }
  }

  /** Details about a specific Automation execution.
    */
  @js.native
  trait AutomationExecutionMetadata extends js.Object {
    var AssociationId: js.UndefOr[String]
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus]
    var AutomationSubtype: js.UndefOr[AutomationSubtype]
    var AutomationType: js.UndefOr[AutomationType]
    var ChangeRequestName: js.UndefOr[ChangeRequestName]
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
    var OpsItemId: js.UndefOr[String]
    var Outputs: js.UndefOr[AutomationParameterMap]
    var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId]
    var ResolvedTargets: js.UndefOr[ResolvedTargets]
    var Runbooks: js.UndefOr[Runbooks]
    var ScheduledTime: js.UndefOr[DateTime]
    var Target: js.UndefOr[String]
    var TargetMaps: js.UndefOr[TargetMaps]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object AutomationExecutionMetadata {
    @inline
    def apply(
        AssociationId: js.UndefOr[String] = js.undefined,
        AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
        AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined,
        AutomationSubtype: js.UndefOr[AutomationSubtype] = js.undefined,
        AutomationType: js.UndefOr[AutomationType] = js.undefined,
        ChangeRequestName: js.UndefOr[ChangeRequestName] = js.undefined,
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
        OpsItemId: js.UndefOr[String] = js.undefined,
        Outputs: js.UndefOr[AutomationParameterMap] = js.undefined,
        ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined,
        ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined,
        Runbooks: js.UndefOr[Runbooks] = js.undefined,
        ScheduledTime: js.UndefOr[DateTime] = js.undefined,
        Target: js.UndefOr[String] = js.undefined,
        TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
        TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): AutomationExecutionMetadata = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AutomationExecutionId.foreach(__v => __obj.updateDynamic("AutomationExecutionId")(__v.asInstanceOf[js.Any]))
      AutomationExecutionStatus.foreach(__v => __obj.updateDynamic("AutomationExecutionStatus")(__v.asInstanceOf[js.Any]))
      AutomationSubtype.foreach(__v => __obj.updateDynamic("AutomationSubtype")(__v.asInstanceOf[js.Any]))
      AutomationType.foreach(__v => __obj.updateDynamic("AutomationType")(__v.asInstanceOf[js.Any]))
      ChangeRequestName.foreach(__v => __obj.updateDynamic("ChangeRequestName")(__v.asInstanceOf[js.Any]))
      CurrentAction.foreach(__v => __obj.updateDynamic("CurrentAction")(__v.asInstanceOf[js.Any]))
      CurrentStepName.foreach(__v => __obj.updateDynamic("CurrentStepName")(__v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      ExecutedBy.foreach(__v => __obj.updateDynamic("ExecutedBy")(__v.asInstanceOf[js.Any]))
      ExecutionEndTime.foreach(__v => __obj.updateDynamic("ExecutionEndTime")(__v.asInstanceOf[js.Any]))
      ExecutionStartTime.foreach(__v => __obj.updateDynamic("ExecutionStartTime")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      LogFile.foreach(__v => __obj.updateDynamic("LogFile")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      ParentAutomationExecutionId.foreach(__v => __obj.updateDynamic("ParentAutomationExecutionId")(__v.asInstanceOf[js.Any]))
      ResolvedTargets.foreach(__v => __obj.updateDynamic("ResolvedTargets")(__v.asInstanceOf[js.Any]))
      Runbooks.foreach(__v => __obj.updateDynamic("Runbooks")(__v.asInstanceOf[js.Any]))
      ScheduledTime.foreach(__v => __obj.updateDynamic("ScheduledTime")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetMaps.foreach(__v => __obj.updateDynamic("TargetMaps")(__v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.updateDynamic("TargetParameterName")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomationExecutionMetadata]
    }
  }

  /** Defines the basic information about a patch baseline override.
    */
  @js.native
  trait BaselineOverride extends js.Object {
    var ApprovalRules: js.UndefOr[PatchRuleGroup]
    var ApprovedPatches: js.UndefOr[PatchIdList]
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean]
    var GlobalFilters: js.UndefOr[PatchFilterGroup]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var RejectedPatches: js.UndefOr[PatchIdList]
    var RejectedPatchesAction: js.UndefOr[PatchAction]
    var Sources: js.UndefOr[PatchSourceList]
  }

  object BaselineOverride {
    @inline
    def apply(
        ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined,
        ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined,
        ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
        ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
        GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        RejectedPatches: js.UndefOr[PatchIdList] = js.undefined,
        RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined,
        Sources: js.UndefOr[PatchSourceList] = js.undefined
    ): BaselineOverride = {
      val __obj = js.Dynamic.literal()
      ApprovalRules.foreach(__v => __obj.updateDynamic("ApprovalRules")(__v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.updateDynamic("ApprovedPatches")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(__v => __obj.updateDynamic("ApprovedPatchesComplianceLevel")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesEnableNonSecurity.foreach(__v => __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(__v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.updateDynamic("GlobalFilters")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.updateDynamic("RejectedPatches")(__v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.updateDynamic("RejectedPatchesAction")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaselineOverride]
    }
  }

  /** <p/>
    */
  @js.native
  trait CancelCommandRequest extends js.Object {
    var CommandId: CommandId
    var InstanceIds: js.UndefOr[InstanceIdList]
  }

  object CancelCommandRequest {
    @inline
    def apply(
        CommandId: CommandId,
        InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
    ): CancelCommandRequest = {
      val __obj = js.Dynamic.literal(
        "CommandId" -> CommandId.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelCommandRequest]
    }
  }

  /** Whether or not the command was successfully canceled. There is no guarantee that a request can be canceled.
    */
  @js.native
  trait CancelCommandResult extends js.Object

  object CancelCommandResult {
    @inline
    def apply(): CancelCommandResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelCommandResult]
    }
  }

  @js.native
  trait CancelMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object CancelMaintenanceWindowExecutionRequest {
    @inline
    def apply(
        WindowExecutionId: MaintenanceWindowExecutionId
    ): CancelMaintenanceWindowExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelMaintenanceWindowExecutionRequest]
    }
  }

  @js.native
  trait CancelMaintenanceWindowExecutionResult extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  object CancelMaintenanceWindowExecutionResult {
    @inline
    def apply(
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): CancelMaintenanceWindowExecutionResult = {
      val __obj = js.Dynamic.literal()
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelMaintenanceWindowExecutionResult]
    }
  }

  /** Configuration options for sending command output to Amazon CloudWatch Logs.
    */
  @js.native
  trait CloudWatchOutputConfig extends js.Object {
    var CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName]
    var CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled]
  }

  object CloudWatchOutputConfig {
    @inline
    def apply(
        CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined,
        CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled] = js.undefined
    ): CloudWatchOutputConfig = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogGroupName.foreach(__v => __obj.updateDynamic("CloudWatchLogGroupName")(__v.asInstanceOf[js.Any]))
      CloudWatchOutputEnabled.foreach(__v => __obj.updateDynamic("CloudWatchOutputEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchOutputConfig]
    }
  }

  /** Describes a command request.
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
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds]
  }

  object Command {
    @inline
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
        Targets: js.UndefOr[Targets] = js.undefined,
        TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
    ): Command = {
      val __obj = js.Dynamic.literal()
      CloudWatchOutputConfig.foreach(__v => __obj.updateDynamic("CloudWatchOutputConfig")(__v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.updateDynamic("CommandId")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      CompletedCount.foreach(__v => __obj.updateDynamic("CompletedCount")(__v.asInstanceOf[js.Any]))
      DeliveryTimedOutCount.foreach(__v => __obj.updateDynamic("DeliveryTimedOutCount")(__v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      ErrorCount.foreach(__v => __obj.updateDynamic("ErrorCount")(__v.asInstanceOf[js.Any]))
      ExpiresAfter.foreach(__v => __obj.updateDynamic("ExpiresAfter")(__v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.updateDynamic("NotificationConfig")(__v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.updateDynamic("OutputS3BucketName")(__v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.updateDynamic("OutputS3KeyPrefix")(__v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.updateDynamic("OutputS3Region")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      RequestedDateTime.foreach(__v => __obj.updateDynamic("RequestedDateTime")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TargetCount.foreach(__v => __obj.updateDynamic("TargetCount")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.updateDynamic("TimeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Command]
    }
  }

  /** Describes a command filter.
    *
    * '''Note:'''A managed node ID can't be specified when a command status is <code>Pending</code> because the command hasn't run on the node yet.
    */
  @js.native
  trait CommandFilter extends js.Object {
    var key: CommandFilterKey
    var value: CommandFilterValue
  }

  object CommandFilter {
    @inline
    def apply(
        key: CommandFilterKey,
        value: CommandFilterValue
    ): CommandFilter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CommandFilter]
    }
  }

  /** An invocation is a copy of a command sent to a specific managed node. A command can apply to one or more managed nodes. A command invocation applies to one managed node. For example, if a user runs <code>SendCommand</code> against three managed nodes, then a command invocation is created for each requested managed node ID. A command invocation returns status and detail information about a command you ran.
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
    @inline
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
        TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined
    ): CommandInvocation = {
      val __obj = js.Dynamic.literal()
      CloudWatchOutputConfig.foreach(__v => __obj.updateDynamic("CloudWatchOutputConfig")(__v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.updateDynamic("CommandId")(__v.asInstanceOf[js.Any]))
      CommandPlugins.foreach(__v => __obj.updateDynamic("CommandPlugins")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      InstanceName.foreach(__v => __obj.updateDynamic("InstanceName")(__v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.updateDynamic("NotificationConfig")(__v.asInstanceOf[js.Any]))
      RequestedDateTime.foreach(__v => __obj.updateDynamic("RequestedDateTime")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      StandardErrorUrl.foreach(__v => __obj.updateDynamic("StandardErrorUrl")(__v.asInstanceOf[js.Any]))
      StandardOutputUrl.foreach(__v => __obj.updateDynamic("StandardOutputUrl")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TraceOutput.foreach(__v => __obj.updateDynamic("TraceOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommandInvocation]
    }
  }

  /** Describes plugin details.
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
    @inline
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
        StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    ): CommandPlugin = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.updateDynamic("OutputS3BucketName")(__v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.updateDynamic("OutputS3KeyPrefix")(__v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.updateDynamic("OutputS3Region")(__v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.updateDynamic("ResponseCode")(__v.asInstanceOf[js.Any]))
      ResponseFinishDateTime.foreach(__v => __obj.updateDynamic("ResponseFinishDateTime")(__v.asInstanceOf[js.Any]))
      ResponseStartDateTime.foreach(__v => __obj.updateDynamic("ResponseStartDateTime")(__v.asInstanceOf[js.Any]))
      StandardErrorUrl.foreach(__v => __obj.updateDynamic("StandardErrorUrl")(__v.asInstanceOf[js.Any]))
      StandardOutputUrl.foreach(__v => __obj.updateDynamic("StandardOutputUrl")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommandPlugin]
    }
  }

  /** A summary of the call execution that includes an execution ID, the type of execution (for example, <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  @js.native
  trait ComplianceExecutionSummary extends js.Object {
    var ExecutionTime: DateTime
    var ExecutionId: js.UndefOr[ComplianceExecutionId]
    var ExecutionType: js.UndefOr[ComplianceExecutionType]
  }

  object ComplianceExecutionSummary {
    @inline
    def apply(
        ExecutionTime: DateTime,
        ExecutionId: js.UndefOr[ComplianceExecutionId] = js.undefined,
        ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined
    ): ComplianceExecutionSummary = {
      val __obj = js.Dynamic.literal(
        "ExecutionTime" -> ExecutionTime.asInstanceOf[js.Any]
      )

      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      ExecutionType.foreach(__v => __obj.updateDynamic("ExecutionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceExecutionSummary]
    }
  }

  /** Information about the compliance as defined by the resource type. For example, for a patch resource type, <code>Items</code> includes information about the PatchSeverity, Classification, and so on.
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
    @inline
    def apply(
        ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
        Details: js.UndefOr[ComplianceItemDetails] = js.undefined,
        ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
        Id: js.UndefOr[ComplianceItemId] = js.undefined,
        ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
        ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
        Severity: js.UndefOr[ComplianceSeverity] = js.undefined,
        Status: js.UndefOr[ComplianceStatus] = js.undefined,
        Title: js.UndefOr[ComplianceItemTitle] = js.undefined
    ): ComplianceItem = {
      val __obj = js.Dynamic.literal()
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      ExecutionSummary.foreach(__v => __obj.updateDynamic("ExecutionSummary")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceItem]
    }
  }

  /** Information about a compliance item.
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
    @inline
    def apply(
        Severity: ComplianceSeverity,
        Status: ComplianceStatus,
        Details: js.UndefOr[ComplianceItemDetails] = js.undefined,
        Id: js.UndefOr[ComplianceItemId] = js.undefined,
        Title: js.UndefOr[ComplianceItemTitle] = js.undefined
    ): ComplianceItemEntry = {
      val __obj = js.Dynamic.literal(
        "Severity" -> Severity.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceItemEntry]
    }
  }

  /** One or more filters. Use a filter to return a more specific list of results.
    */
  @js.native
  trait ComplianceStringFilter extends js.Object {
    var Key: js.UndefOr[ComplianceStringFilterKey]
    var Type: js.UndefOr[ComplianceQueryOperatorType]
    var Values: js.UndefOr[ComplianceStringFilterValueList]
  }

  object ComplianceStringFilter {
    @inline
    def apply(
        Key: js.UndefOr[ComplianceStringFilterKey] = js.undefined,
        Type: js.UndefOr[ComplianceQueryOperatorType] = js.undefined,
        Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined
    ): ComplianceStringFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceStringFilter]
    }
  }

  /** A summary of compliance information by compliance type.
    */
  @js.native
  trait ComplianceSummaryItem extends js.Object {
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var CompliantSummary: js.UndefOr[CompliantSummary]
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary]
  }

  object ComplianceSummaryItem {
    @inline
    def apply(
        ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
        CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined,
        NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined
    ): ComplianceSummaryItem = {
      val __obj = js.Dynamic.literal()
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      CompliantSummary.foreach(__v => __obj.updateDynamic("CompliantSummary")(__v.asInstanceOf[js.Any]))
      NonCompliantSummary.foreach(__v => __obj.updateDynamic("NonCompliantSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceSummaryItem]
    }
  }

  /** A summary of resources that are compliant. The summary is organized according to the resource count for each compliance type.
    */
  @js.native
  trait CompliantSummary extends js.Object {
    var CompliantCount: js.UndefOr[ComplianceSummaryCount]
    var SeveritySummary: js.UndefOr[SeveritySummary]
  }

  object CompliantSummary {
    @inline
    def apply(
        CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined
    ): CompliantSummary = {
      val __obj = js.Dynamic.literal()
      CompliantCount.foreach(__v => __obj.updateDynamic("CompliantCount")(__v.asInstanceOf[js.Any]))
      SeveritySummary.foreach(__v => __obj.updateDynamic("SeveritySummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompliantSummary]
    }
  }

  @js.native
  trait CreateActivationRequest extends js.Object {
    var IamRole: IamRole
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
    var RegistrationMetadata: js.UndefOr[RegistrationMetadataList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateActivationRequest {
    @inline
    def apply(
        IamRole: IamRole,
        DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
        Description: js.UndefOr[ActivationDescription] = js.undefined,
        ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
        RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
        RegistrationMetadata: js.UndefOr[RegistrationMetadataList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateActivationRequest = {
      val __obj = js.Dynamic.literal(
        "IamRole" -> IamRole.asInstanceOf[js.Any]
      )

      DefaultInstanceName.foreach(__v => __obj.updateDynamic("DefaultInstanceName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      RegistrationLimit.foreach(__v => __obj.updateDynamic("RegistrationLimit")(__v.asInstanceOf[js.Any]))
      RegistrationMetadata.foreach(__v => __obj.updateDynamic("RegistrationMetadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActivationRequest]
    }
  }

  @js.native
  trait CreateActivationResult extends js.Object {
    var ActivationCode: js.UndefOr[ActivationCode]
    var ActivationId: js.UndefOr[ActivationId]
  }

  object CreateActivationResult {
    @inline
    def apply(
        ActivationCode: js.UndefOr[ActivationCode] = js.undefined,
        ActivationId: js.UndefOr[ActivationId] = js.undefined
    ): CreateActivationResult = {
      val __obj = js.Dynamic.literal()
      ActivationCode.foreach(__v => __obj.updateDynamic("ActivationCode")(__v.asInstanceOf[js.Any]))
      ActivationId.foreach(__v => __obj.updateDynamic("ActivationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActivationResult]
    }
  }

  @js.native
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: CreateAssociationBatchRequestEntries
  }

  object CreateAssociationBatchRequest {
    @inline
    def apply(
        Entries: CreateAssociationBatchRequestEntries
    ): CreateAssociationBatchRequest = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAssociationBatchRequest]
    }
  }

  /** Describes the association of a Amazon Web Services Systems Manager document (SSM document) and a managed node.
    */
  @js.native
  trait CreateAssociationBatchRequestEntry extends js.Object {
    var Name: DocumentARN
    var ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval]
    var AssociationName: js.UndefOr[AssociationName]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
    var CalendarNames: js.UndefOr[CalendarNameOrARNList]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var SyncCompliance: js.UndefOr[AssociationSyncCompliance]
    var TargetLocations: js.UndefOr[TargetLocations]
    var Targets: js.UndefOr[Targets]
  }

  object CreateAssociationBatchRequestEntry {
    @inline
    def apply(
        Name: DocumentARN,
        ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): CreateAssociationBatchRequestEntry = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ApplyOnlyAtCronInterval.foreach(__v => __obj.updateDynamic("ApplyOnlyAtCronInterval")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(__v => __obj.updateDynamic("AutomationTargetParameterName")(__v.asInstanceOf[js.Any]))
      CalendarNames.foreach(__v => __obj.updateDynamic("CalendarNames")(__v.asInstanceOf[js.Any]))
      ComplianceSeverity.foreach(__v => __obj.updateDynamic("ComplianceSeverity")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      SyncCompliance.foreach(__v => __obj.updateDynamic("SyncCompliance")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationBatchRequestEntry]
    }
  }

  @js.native
  trait CreateAssociationBatchResult extends js.Object {
    var Failed: js.UndefOr[FailedCreateAssociationList]
    var Successful: js.UndefOr[AssociationDescriptionList]
  }

  object CreateAssociationBatchResult {
    @inline
    def apply(
        Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined,
        Successful: js.UndefOr[AssociationDescriptionList] = js.undefined
    ): CreateAssociationBatchResult = {
      val __obj = js.Dynamic.literal()
      Failed.foreach(__v => __obj.updateDynamic("Failed")(__v.asInstanceOf[js.Any]))
      Successful.foreach(__v => __obj.updateDynamic("Successful")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationBatchResult]
    }
  }

  @js.native
  trait CreateAssociationRequest extends js.Object {
    var Name: DocumentARN
    var ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval]
    var AssociationName: js.UndefOr[AssociationName]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
    var CalendarNames: js.UndefOr[CalendarNameOrARNList]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var SyncCompliance: js.UndefOr[AssociationSyncCompliance]
    var TargetLocations: js.UndefOr[TargetLocations]
    var Targets: js.UndefOr[Targets]
  }

  object CreateAssociationRequest {
    @inline
    def apply(
        Name: DocumentARN,
        ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): CreateAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ApplyOnlyAtCronInterval.foreach(__v => __obj.updateDynamic("ApplyOnlyAtCronInterval")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(__v => __obj.updateDynamic("AutomationTargetParameterName")(__v.asInstanceOf[js.Any]))
      CalendarNames.foreach(__v => __obj.updateDynamic("CalendarNames")(__v.asInstanceOf[js.Any]))
      ComplianceSeverity.foreach(__v => __obj.updateDynamic("ComplianceSeverity")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      SyncCompliance.foreach(__v => __obj.updateDynamic("SyncCompliance")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationRequest]
    }
  }

  @js.native
  trait CreateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object CreateAssociationResult {
    @inline
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): CreateAssociationResult = {
      val __obj = js.Dynamic.literal()
      AssociationDescription.foreach(__v => __obj.updateDynamic("AssociationDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationResult]
    }
  }

  @js.native
  trait CreateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DisplayName: js.UndefOr[DocumentDisplayName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var Requires: js.UndefOr[DocumentRequiresList]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object CreateDocumentRequest {
    @inline
    def apply(
        Content: DocumentContent,
        Name: DocumentName,
        Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined,
        DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentType: js.UndefOr[DocumentType] = js.undefined,
        Requires: js.UndefOr[DocumentRequiresList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): CreateDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attachments.foreach(__v => __obj.updateDynamic("Attachments")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.updateDynamic("DocumentType")(__v.asInstanceOf[js.Any]))
      Requires.foreach(__v => __obj.updateDynamic("Requires")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentRequest]
    }
  }

  @js.native
  trait CreateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  object CreateDocumentResult {
    @inline
    def apply(
        DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): CreateDocumentResult = {
      val __obj = js.Dynamic.literal()
      DocumentDescription.foreach(__v => __obj.updateDynamic("DocumentDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentResult]
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
    var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Tags: js.UndefOr[TagList]
  }

  object CreateMaintenanceWindowRequest {
    @inline
    def apply(
        AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets,
        Cutoff: MaintenanceWindowCutoff,
        Duration: MaintenanceWindowDurationHours,
        Name: MaintenanceWindowName,
        Schedule: MaintenanceWindowSchedule,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined,
        ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.asInstanceOf[js.Any],
        "Cutoff" -> Cutoff.asInstanceOf[js.Any],
        "Duration" -> Duration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Schedule" -> Schedule.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      ScheduleOffset.foreach(__v => __obj.updateDynamic("ScheduleOffset")(__v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.updateDynamic("ScheduleTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait CreateMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object CreateMaintenanceWindowResult {
    @inline
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): CreateMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMaintenanceWindowResult]
    }
  }

  @js.native
  trait CreateOpsItemRequest extends js.Object {
    var Description: OpsItemDescription
    var Source: OpsItemSource
    var Title: OpsItemTitle
    var ActualEndTime: js.UndefOr[DateTime]
    var ActualStartTime: js.UndefOr[DateTime]
    var Category: js.UndefOr[OpsItemCategory]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OpsItemType: js.UndefOr[OpsItemType]
    var PlannedEndTime: js.UndefOr[DateTime]
    var PlannedStartTime: js.UndefOr[DateTime]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Tags: js.UndefOr[TagList]
  }

  object CreateOpsItemRequest {
    @inline
    def apply(
        Description: OpsItemDescription,
        Source: OpsItemSource,
        Title: OpsItemTitle,
        ActualEndTime: js.UndefOr[DateTime] = js.undefined,
        ActualStartTime: js.UndefOr[DateTime] = js.undefined,
        Category: js.UndefOr[OpsItemCategory] = js.undefined,
        Notifications: js.UndefOr[OpsItemNotifications] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OpsItemType: js.UndefOr[OpsItemType] = js.undefined,
        PlannedEndTime: js.UndefOr[DateTime] = js.undefined,
        PlannedStartTime: js.UndefOr[DateTime] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined,
        Severity: js.UndefOr[OpsItemSeverity] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateOpsItemRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      ActualEndTime.foreach(__v => __obj.updateDynamic("ActualEndTime")(__v.asInstanceOf[js.Any]))
      ActualStartTime.foreach(__v => __obj.updateDynamic("ActualStartTime")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.updateDynamic("OperationalData")(__v.asInstanceOf[js.Any]))
      OpsItemType.foreach(__v => __obj.updateDynamic("OpsItemType")(__v.asInstanceOf[js.Any]))
      PlannedEndTime.foreach(__v => __obj.updateDynamic("PlannedEndTime")(__v.asInstanceOf[js.Any]))
      PlannedStartTime.foreach(__v => __obj.updateDynamic("PlannedStartTime")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RelatedOpsItems.foreach(__v => __obj.updateDynamic("RelatedOpsItems")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpsItemRequest]
    }
  }

  @js.native
  trait CreateOpsItemResponse extends js.Object {
    var OpsItemId: js.UndefOr[String]
  }

  object CreateOpsItemResponse {
    @inline
    def apply(
        OpsItemId: js.UndefOr[String] = js.undefined
    ): CreateOpsItemResponse = {
      val __obj = js.Dynamic.literal()
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpsItemResponse]
    }
  }

  @js.native
  trait CreateOpsMetadataRequest extends js.Object {
    var ResourceId: OpsMetadataResourceId
    var Metadata: js.UndefOr[MetadataMap]
    var Tags: js.UndefOr[TagList]
  }

  object CreateOpsMetadataRequest {
    @inline
    def apply(
        ResourceId: OpsMetadataResourceId,
        Metadata: js.UndefOr[MetadataMap] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateOpsMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpsMetadataRequest]
    }
  }

  @js.native
  trait CreateOpsMetadataResult extends js.Object {
    var OpsMetadataArn: js.UndefOr[OpsMetadataArn]
  }

  object CreateOpsMetadataResult {
    @inline
    def apply(
        OpsMetadataArn: js.UndefOr[OpsMetadataArn] = js.undefined
    ): CreateOpsMetadataResult = {
      val __obj = js.Dynamic.literal()
      OpsMetadataArn.foreach(__v => __obj.updateDynamic("OpsMetadataArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpsMetadataResult]
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
    var Tags: js.UndefOr[TagList]
  }

  object CreatePatchBaselineRequest {
    @inline
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
        Sources: js.UndefOr[PatchSourceList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreatePatchBaselineRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ApprovalRules.foreach(__v => __obj.updateDynamic("ApprovalRules")(__v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.updateDynamic("ApprovedPatches")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(__v => __obj.updateDynamic("ApprovedPatchesComplianceLevel")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesEnableNonSecurity.foreach(__v => __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.updateDynamic("GlobalFilters")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.updateDynamic("RejectedPatches")(__v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.updateDynamic("RejectedPatchesAction")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePatchBaselineRequest]
    }
  }

  @js.native
  trait CreatePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object CreatePatchBaselineResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): CreatePatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePatchBaselineResult]
    }
  }

  @js.native
  trait CreateResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination]
    var SyncSource: js.UndefOr[ResourceDataSyncSource]
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  object CreateResourceDataSyncRequest {
    @inline
    def apply(
        SyncName: ResourceDataSyncName,
        S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined,
        SyncSource: js.UndefOr[ResourceDataSyncSource] = js.undefined,
        SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
    ): CreateResourceDataSyncRequest = {
      val __obj = js.Dynamic.literal(
        "SyncName" -> SyncName.asInstanceOf[js.Any]
      )

      S3Destination.foreach(__v => __obj.updateDynamic("S3Destination")(__v.asInstanceOf[js.Any]))
      SyncSource.foreach(__v => __obj.updateDynamic("SyncSource")(__v.asInstanceOf[js.Any]))
      SyncType.foreach(__v => __obj.updateDynamic("SyncType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceDataSyncRequest]
    }
  }

  @js.native
  trait CreateResourceDataSyncResult extends js.Object

  object CreateResourceDataSyncResult {
    @inline
    def apply(): CreateResourceDataSyncResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateResourceDataSyncResult]
    }
  }

  @js.native
  trait DeleteActivationRequest extends js.Object {
    var ActivationId: ActivationId
  }

  object DeleteActivationRequest {
    @inline
    def apply(
        ActivationId: ActivationId
    ): DeleteActivationRequest = {
      val __obj = js.Dynamic.literal(
        "ActivationId" -> ActivationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteActivationRequest]
    }
  }

  @js.native
  trait DeleteActivationResult extends js.Object

  object DeleteActivationResult {
    @inline
    def apply(): DeleteActivationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteActivationResult]
    }
  }

  @js.native
  trait DeleteAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentARN]
  }

  object DeleteAssociationRequest {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined
    ): DeleteAssociationRequest = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssociationResult extends js.Object

  object DeleteAssociationResult {
    @inline
    def apply(): DeleteAssociationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssociationResult]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var Name: DocumentName
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Force: js.UndefOr[Boolean]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DeleteDocumentRequest {
    @inline
    def apply(
        Name: DocumentName,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Force: js.UndefOr[Boolean] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DeleteDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteDocumentResult extends js.Object

  object DeleteDocumentResult {
    @inline
    def apply(): DeleteDocumentResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDocumentResult]
    }
  }

  @js.native
  trait DeleteInventoryRequest extends js.Object {
    var TypeName: InventoryItemTypeName
    var ClientToken: js.UndefOr[UUID]
    var DryRun: js.UndefOr[DryRun]
    var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption]
  }

  object DeleteInventoryRequest {
    @inline
    def apply(
        TypeName: InventoryItemTypeName,
        ClientToken: js.UndefOr[UUID] = js.undefined,
        DryRun: js.UndefOr[DryRun] = js.undefined,
        SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.undefined
    ): DeleteInventoryRequest = {
      val __obj = js.Dynamic.literal(
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      SchemaDeleteOption.foreach(__v => __obj.updateDynamic("SchemaDeleteOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInventoryRequest]
    }
  }

  @js.native
  trait DeleteInventoryResult extends js.Object {
    var DeletionId: js.UndefOr[UUID]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  object DeleteInventoryResult {
    @inline
    def apply(
        DeletionId: js.UndefOr[UUID] = js.undefined,
        DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined,
        TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): DeleteInventoryResult = {
      val __obj = js.Dynamic.literal()
      DeletionId.foreach(__v => __obj.updateDynamic("DeletionId")(__v.asInstanceOf[js.Any]))
      DeletionSummary.foreach(__v => __obj.updateDynamic("DeletionSummary")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInventoryResult]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object DeleteMaintenanceWindowRequest {
    @inline
    def apply(
        WindowId: MaintenanceWindowId
    ): DeleteMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object DeleteMaintenanceWindowResult {
    @inline
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): DeleteMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMaintenanceWindowResult]
    }
  }

  @js.native
  trait DeleteOpsMetadataRequest extends js.Object {
    var OpsMetadataArn: OpsMetadataArn
  }

  object DeleteOpsMetadataRequest {
    @inline
    def apply(
        OpsMetadataArn: OpsMetadataArn
    ): DeleteOpsMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "OpsMetadataArn" -> OpsMetadataArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOpsMetadataRequest]
    }
  }

  @js.native
  trait DeleteOpsMetadataResult extends js.Object

  object DeleteOpsMetadataResult {
    @inline
    def apply(): DeleteOpsMetadataResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOpsMetadataResult]
    }
  }

  @js.native
  trait DeleteParameterRequest extends js.Object {
    var Name: PSParameterName
  }

  object DeleteParameterRequest {
    @inline
    def apply(
        Name: PSParameterName
    ): DeleteParameterRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteParameterRequest]
    }
  }

  @js.native
  trait DeleteParameterResult extends js.Object

  object DeleteParameterResult {
    @inline
    def apply(): DeleteParameterResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteParameterResult]
    }
  }

  @js.native
  trait DeleteParametersRequest extends js.Object {
    var Names: ParameterNameList
  }

  object DeleteParametersRequest {
    @inline
    def apply(
        Names: ParameterNameList
    ): DeleteParametersRequest = {
      val __obj = js.Dynamic.literal(
        "Names" -> Names.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteParametersRequest]
    }
  }

  @js.native
  trait DeleteParametersResult extends js.Object {
    var DeletedParameters: js.UndefOr[ParameterNameList]
    var InvalidParameters: js.UndefOr[ParameterNameList]
  }

  object DeleteParametersResult {
    @inline
    def apply(
        DeletedParameters: js.UndefOr[ParameterNameList] = js.undefined,
        InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
    ): DeleteParametersResult = {
      val __obj = js.Dynamic.literal()
      DeletedParameters.foreach(__v => __obj.updateDynamic("DeletedParameters")(__v.asInstanceOf[js.Any]))
      InvalidParameters.foreach(__v => __obj.updateDynamic("InvalidParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteParametersResult]
    }
  }

  @js.native
  trait DeletePatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object DeletePatchBaselineRequest {
    @inline
    def apply(
        BaselineId: BaselineId
    ): DeletePatchBaselineRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePatchBaselineRequest]
    }
  }

  @js.native
  trait DeletePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object DeletePatchBaselineResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): DeletePatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePatchBaselineResult]
    }
  }

  @js.native
  trait DeleteResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  object DeleteResourceDataSyncRequest {
    @inline
    def apply(
        SyncName: ResourceDataSyncName,
        SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
    ): DeleteResourceDataSyncRequest = {
      val __obj = js.Dynamic.literal(
        "SyncName" -> SyncName.asInstanceOf[js.Any]
      )

      SyncType.foreach(__v => __obj.updateDynamic("SyncType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourceDataSyncRequest]
    }
  }

  @js.native
  trait DeleteResourceDataSyncResult extends js.Object

  object DeleteResourceDataSyncResult {
    @inline
    def apply(): DeleteResourceDataSyncResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourceDataSyncResult]
    }
  }

  @js.native
  trait DeregisterManagedInstanceRequest extends js.Object {
    var InstanceId: ManagedInstanceId
  }

  object DeregisterManagedInstanceRequest {
    @inline
    def apply(
        InstanceId: ManagedInstanceId
    ): DeregisterManagedInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterManagedInstanceRequest]
    }
  }

  @js.native
  trait DeregisterManagedInstanceResult extends js.Object

  object DeregisterManagedInstanceResult {
    @inline
    def apply(): DeregisterManagedInstanceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterManagedInstanceResult]
    }
  }

  @js.native
  trait DeregisterPatchBaselineForPatchGroupRequest extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object DeregisterPatchBaselineForPatchGroupRequest {
    @inline
    def apply(
        BaselineId: BaselineId,
        PatchGroup: PatchGroup
    ): DeregisterPatchBaselineForPatchGroupRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object DeregisterPatchBaselineForPatchGroupResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): DeregisterPatchBaselineForPatchGroupResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.updateDynamic("PatchGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
    var Safe: js.UndefOr[Boolean]
  }

  object DeregisterTargetFromMaintenanceWindowRequest {
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTargetId: MaintenanceWindowTargetId,
        Safe: js.UndefOr[Boolean] = js.undefined
    ): DeregisterTargetFromMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTargetId" -> WindowTargetId.asInstanceOf[js.Any]
      )

      Safe.foreach(__v => __obj.updateDynamic("Safe")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object DeregisterTargetFromMaintenanceWindowResult {
    @inline
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): DeregisterTargetFromMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.updateDynamic("WindowTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
    }
  }

  @js.native
  trait DeregisterTaskFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  object DeregisterTaskFromMaintenanceWindowRequest {
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTaskId: MaintenanceWindowTaskId
    ): DeregisterTaskFromMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
    }
  }

  @js.native
  trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object DeregisterTaskFromMaintenanceWindowResult {
    @inline
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): DeregisterTaskFromMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.updateDynamic("WindowTaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
    }
  }

  /** Filter for the DescribeActivation API.
    */
  @js.native
  trait DescribeActivationsFilter extends js.Object {
    var FilterKey: js.UndefOr[DescribeActivationsFilterKeys]
    var FilterValues: js.UndefOr[StringList]
  }

  object DescribeActivationsFilter {
    @inline
    def apply(
        FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.undefined,
        FilterValues: js.UndefOr[StringList] = js.undefined
    ): DescribeActivationsFilter = {
      val __obj = js.Dynamic.literal()
      FilterKey.foreach(__v => __obj.updateDynamic("FilterKey")(__v.asInstanceOf[js.Any]))
      FilterValues.foreach(__v => __obj.updateDynamic("FilterValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivationsFilter]
    }
  }

  @js.native
  trait DescribeActivationsRequest extends js.Object {
    var Filters: js.UndefOr[DescribeActivationsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeActivationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[DescribeActivationsFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActivationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivationsRequest]
    }
  }

  @js.native
  trait DescribeActivationsResult extends js.Object {
    var ActivationList: js.UndefOr[ActivationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeActivationsResult {
    @inline
    def apply(
        ActivationList: js.UndefOr[ActivationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActivationsResult = {
      val __obj = js.Dynamic.literal()
      ActivationList.foreach(__v => __obj.updateDynamic("ActivationList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivationsResult]
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
    @inline
    def apply(
        AssociationId: AssociationId,
        ExecutionId: AssociationExecutionId,
        Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "ExecutionId" -> ExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
    }
  }

  @js.native
  trait DescribeAssociationExecutionTargetsResult extends js.Object {
    var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionTargetsResult {
    @inline
    def apply(
        AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionTargetsResult = {
      val __obj = js.Dynamic.literal()
      AssociationExecutionTargets.foreach(__v => __obj.updateDynamic("AssociationExecutionTargets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationExecutionTargetsResult]
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
    @inline
    def apply(
        AssociationId: AssociationId,
        Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAssociationExecutionsResult extends js.Object {
    var AssociationExecutions: js.UndefOr[AssociationExecutionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAssociationExecutionsResult {
    @inline
    def apply(
        AssociationExecutions: js.UndefOr[AssociationExecutionsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionsResult = {
      val __obj = js.Dynamic.literal()
      AssociationExecutions.foreach(__v => __obj.updateDynamic("AssociationExecutions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationExecutionsResult]
    }
  }

  @js.native
  trait DescribeAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentARN]
  }

  object DescribeAssociationRequest {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined
    ): DescribeAssociationRequest = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationRequest]
    }
  }

  @js.native
  trait DescribeAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object DescribeAssociationResult {
    @inline
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): DescribeAssociationResult = {
      val __obj = js.Dynamic.literal()
      AssociationDescription.foreach(__v => __obj.updateDynamic("AssociationDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationResult]
    }
  }

  @js.native
  trait DescribeAutomationExecutionsRequest extends js.Object {
    var Filters: js.UndefOr[AutomationExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAutomationExecutionsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[AutomationExecutionFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAutomationExecutionsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutomationExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAutomationExecutionsResult extends js.Object {
    var AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAutomationExecutionsResult {
    @inline
    def apply(
        AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAutomationExecutionsResult = {
      val __obj = js.Dynamic.literal()
      AutomationExecutionMetadataList.foreach(__v => __obj.updateDynamic("AutomationExecutionMetadataList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutomationExecutionsResult]
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
    @inline
    def apply(
        AutomationExecutionId: AutomationExecutionId,
        Filters: js.UndefOr[StepExecutionFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReverseOrder: js.UndefOr[Boolean] = js.undefined
    ): DescribeAutomationStepExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReverseOrder.foreach(__v => __obj.updateDynamic("ReverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutomationStepExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAutomationStepExecutionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StepExecutions: js.UndefOr[StepExecutionList]
  }

  object DescribeAutomationStepExecutionsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
    ): DescribeAutomationStepExecutionsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StepExecutions.foreach(__v => __obj.updateDynamic("StepExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutomationStepExecutionsResult]
    }
  }

  @js.native
  trait DescribeAvailablePatchesRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAvailablePatchesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAvailablePatchesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailablePatchesRequest]
    }
  }

  @js.native
  trait DescribeAvailablePatchesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Patches: js.UndefOr[PatchList]
  }

  object DescribeAvailablePatchesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Patches: js.UndefOr[PatchList] = js.undefined
    ): DescribeAvailablePatchesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Patches.foreach(__v => __obj.updateDynamic("Patches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailablePatchesResult]
    }
  }

  @js.native
  trait DescribeDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
    var MaxResults: js.UndefOr[DocumentPermissionMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDocumentPermissionRequest {
    @inline
    def apply(
        Name: DocumentName,
        PermissionType: DocumentPermissionType,
        MaxResults: js.UndefOr[DocumentPermissionMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDocumentPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentPermissionRequest]
    }
  }

  @js.native
  trait DescribeDocumentPermissionResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
    var AccountSharingInfoList: js.UndefOr[AccountSharingInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDocumentPermissionResponse {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined,
        AccountSharingInfoList: js.UndefOr[AccountSharingInfoList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDocumentPermissionResponse = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      AccountSharingInfoList.foreach(__v => __obj.updateDynamic("AccountSharingInfoList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentPermissionResponse]
    }
  }

  @js.native
  trait DescribeDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DescribeDocumentRequest {
    @inline
    def apply(
        Name: DocumentARN,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DescribeDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentRequest]
    }
  }

  @js.native
  trait DescribeDocumentResult extends js.Object {
    var Document: js.UndefOr[DocumentDescription]
  }

  object DescribeDocumentResult {
    @inline
    def apply(
        Document: js.UndefOr[DocumentDescription] = js.undefined
    ): DescribeDocumentResult = {
      val __obj = js.Dynamic.literal()
      Document.foreach(__v => __obj.updateDynamic("Document")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentResult]
    }
  }

  @js.native
  trait DescribeEffectiveInstanceAssociationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectiveInstanceAssociationsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectiveInstanceAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsRequest]
    }
  }

  @js.native
  trait DescribeEffectiveInstanceAssociationsResult extends js.Object {
    var Associations: js.UndefOr[InstanceAssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectiveInstanceAssociationsResult {
    @inline
    def apply(
        Associations: js.UndefOr[InstanceAssociationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectiveInstanceAssociationsResult = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsResult]
    }
  }

  @js.native
  trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectivePatchesForPatchBaselineRequest {
    @inline
    def apply(
        BaselineId: BaselineId,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectivePatchesForPatchBaselineRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
    }
  }

  @js.native
  trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
    var EffectivePatches: js.UndefOr[EffectivePatchList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEffectivePatchesForPatchBaselineResult {
    @inline
    def apply(
        EffectivePatches: js.UndefOr[EffectivePatchList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectivePatchesForPatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      EffectivePatches.foreach(__v => __obj.updateDynamic("EffectivePatches")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
    }
  }

  @js.native
  trait DescribeInstanceAssociationsStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceAssociationsStatusRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceAssociationsStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceAssociationsStatusRequest]
    }
  }

  @js.native
  trait DescribeInstanceAssociationsStatusResult extends js.Object {
    var InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceAssociationsStatusResult {
    @inline
    def apply(
        InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceAssociationsStatusResult = {
      val __obj = js.Dynamic.literal()
      InstanceAssociationStatusInfos.foreach(__v => __obj.updateDynamic("InstanceAssociationStatusInfos")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceAssociationsStatusResult]
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
    @inline
    def apply(
        Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined,
        InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceInformationRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      InstanceInformationFilterList.foreach(__v => __obj.updateDynamic("InstanceInformationFilterList")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceInformationRequest]
    }
  }

  @js.native
  trait DescribeInstanceInformationResult extends js.Object {
    var InstanceInformationList: js.UndefOr[InstanceInformationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstanceInformationResult {
    @inline
    def apply(
        InstanceInformationList: js.UndefOr[InstanceInformationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceInformationResult = {
      val __obj = js.Dynamic.literal()
      InstanceInformationList.foreach(__v => __obj.updateDynamic("InstanceInformationList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceInformationResult]
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
    @inline
    def apply(
        PatchGroup: PatchGroup,
        Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesForPatchGroupRequest = {
      val __obj = js.Dynamic.literal(
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
    var InstancePatchStates: js.UndefOr[InstancePatchStatesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesForPatchGroupResult {
    @inline
    def apply(
        InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesForPatchGroupResult = {
      val __obj = js.Dynamic.literal()
      InstancePatchStates.foreach(__v => __obj.updateDynamic("InstancePatchStates")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesRequest extends js.Object {
    var InstanceIds: InstanceIdList
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesRequest {
    @inline
    def apply(
        InstanceIds: InstanceIdList,
        MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchStatesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchStatesResult extends js.Object {
    var InstancePatchStates: js.UndefOr[InstancePatchStateList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancePatchStatesResult {
    @inline
    def apply(
        InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesResult = {
      val __obj = js.Dynamic.literal()
      InstancePatchStates.foreach(__v => __obj.updateDynamic("InstancePatchStates")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchStatesResult]
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
    @inline
    def apply(
        InstanceId: InstanceId,
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchesRequest]
    }
  }

  @js.native
  trait DescribeInstancePatchesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Patches: js.UndefOr[PatchComplianceDataList]
  }

  object DescribeInstancePatchesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Patches: js.UndefOr[PatchComplianceDataList] = js.undefined
    ): DescribeInstancePatchesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Patches.foreach(__v => __obj.updateDynamic("Patches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchesResult]
    }
  }

  @js.native
  trait DescribeInventoryDeletionsRequest extends js.Object {
    var DeletionId: js.UndefOr[UUID]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInventoryDeletionsRequest {
    @inline
    def apply(
        DeletionId: js.UndefOr[UUID] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInventoryDeletionsRequest = {
      val __obj = js.Dynamic.literal()
      DeletionId.foreach(__v => __obj.updateDynamic("DeletionId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInventoryDeletionsRequest]
    }
  }

  @js.native
  trait DescribeInventoryDeletionsResult extends js.Object {
    var InventoryDeletions: js.UndefOr[InventoryDeletionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInventoryDeletionsResult {
    @inline
    def apply(
        InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInventoryDeletionsResult = {
      val __obj = js.Dynamic.literal()
      InventoryDeletions.foreach(__v => __obj.updateDynamic("InventoryDeletions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInventoryDeletionsResult]
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
    @inline
    def apply(
        TaskId: MaintenanceWindowExecutionTaskId,
        WindowExecutionId: MaintenanceWindowExecutionId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
      val __obj = js.Dynamic.literal(
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList]
  }

  object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined
    ): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WindowExecutionTaskInvocationIdentities.foreach(__v => __obj.updateDynamic("WindowExecutionTaskInvocationIdentities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
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
    @inline
    def apply(
        WindowExecutionId: MaintenanceWindowExecutionId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTasksRequest = {
      val __obj = js.Dynamic.literal(
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList]
  }

  object DescribeMaintenanceWindowExecutionTasksResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined
    ): DescribeMaintenanceWindowExecutionTasksResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WindowExecutionTaskIdentities.foreach(__v => __obj.updateDynamic("WindowExecutionTaskIdentities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
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
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList]
  }

  object DescribeMaintenanceWindowExecutionsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined
    ): DescribeMaintenanceWindowExecutionsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WindowExecutions.foreach(__v => __obj.updateDynamic("WindowExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
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
    @inline
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): DescribeMaintenanceWindowScheduleRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowScheduleRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowScheduleResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList]
  }

  object DescribeMaintenanceWindowScheduleResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined
    ): DescribeMaintenanceWindowScheduleResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScheduledWindowExecutions.foreach(__v => __obj.updateDynamic("ScheduledWindowExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
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
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowTargetsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTargetsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[MaintenanceWindowTargetList]
  }

  object DescribeMaintenanceWindowTargetsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined
    ): DescribeMaintenanceWindowTargetsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowTargetsResult]
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
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTasksRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowTasksRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowTasksResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tasks: js.UndefOr[MaintenanceWindowTaskList]
  }

  object DescribeMaintenanceWindowTasksResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined
    ): DescribeMaintenanceWindowTasksResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tasks.foreach(__v => __obj.updateDynamic("Tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowTasksResult]
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
    @inline
    def apply(
        ResourceType: MaintenanceWindowResourceType,
        Targets: Targets,
        MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowsForTargetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList]
  }

  object DescribeMaintenanceWindowsForTargetResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined
    ): DescribeMaintenanceWindowsForTargetResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WindowIdentities.foreach(__v => __obj.updateDynamic("WindowIdentities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsRequest extends js.Object {
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeMaintenanceWindowsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowsRequest]
    }
  }

  @js.native
  trait DescribeMaintenanceWindowsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList]
  }

  object DescribeMaintenanceWindowsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined
    ): DescribeMaintenanceWindowsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WindowIdentities.foreach(__v => __obj.updateDynamic("WindowIdentities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowsResult]
    }
  }

  @js.native
  trait DescribeOpsItemsRequest extends js.Object {
    var MaxResults: js.UndefOr[OpsItemMaxResults]
    var NextToken: js.UndefOr[String]
    var OpsItemFilters: js.UndefOr[OpsItemFilters]
  }

  object DescribeOpsItemsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[OpsItemMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OpsItemFilters: js.UndefOr[OpsItemFilters] = js.undefined
    ): DescribeOpsItemsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OpsItemFilters.foreach(__v => __obj.updateDynamic("OpsItemFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOpsItemsRequest]
    }
  }

  @js.native
  trait DescribeOpsItemsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OpsItemSummaries: js.UndefOr[OpsItemSummaries]
  }

  object DescribeOpsItemsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        OpsItemSummaries: js.UndefOr[OpsItemSummaries] = js.undefined
    ): DescribeOpsItemsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OpsItemSummaries.foreach(__v => __obj.updateDynamic("OpsItemSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOpsItemsResponse]
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
    @inline
    def apply(
        Filters: js.UndefOr[ParametersFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
    ): DescribeParametersRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParameterFilters.foreach(__v => __obj.updateDynamic("ParameterFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterMetadataList]
  }

  object DescribeParametersResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Parameters: js.UndefOr[ParameterMetadataList] = js.undefined
    ): DescribeParametersResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersResult]
    }
  }

  @js.native
  trait DescribePatchBaselinesRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchBaselinesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchBaselinesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchBaselinesRequest]
    }
  }

  @js.native
  trait DescribePatchBaselinesResult extends js.Object {
    var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchBaselinesResult {
    @inline
    def apply(
        BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchBaselinesResult = {
      val __obj = js.Dynamic.literal()
      BaselineIdentities.foreach(__v => __obj.updateDynamic("BaselineIdentities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchBaselinesResult]
    }
  }

  @js.native
  trait DescribePatchGroupStateRequest extends js.Object {
    var PatchGroup: PatchGroup
  }

  object DescribePatchGroupStateRequest {
    @inline
    def apply(
        PatchGroup: PatchGroup
    ): DescribePatchGroupStateRequest = {
      val __obj = js.Dynamic.literal(
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePatchGroupStateRequest]
    }
  }

  @js.native
  trait DescribePatchGroupStateResult extends js.Object {
    var Instances: js.UndefOr[Int]
    var InstancesWithCriticalNonCompliantPatches: js.UndefOr[InstancesCount]
    var InstancesWithFailedPatches: js.UndefOr[Int]
    var InstancesWithInstalledOtherPatches: js.UndefOr[Int]
    var InstancesWithInstalledPatches: js.UndefOr[Int]
    var InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount]
    var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount]
    var InstancesWithMissingPatches: js.UndefOr[Int]
    var InstancesWithNotApplicablePatches: js.UndefOr[Int]
    var InstancesWithOtherNonCompliantPatches: js.UndefOr[InstancesCount]
    var InstancesWithSecurityNonCompliantPatches: js.UndefOr[InstancesCount]
    var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Int]
  }

  object DescribePatchGroupStateResult {
    @inline
    def apply(
        Instances: js.UndefOr[Int] = js.undefined,
        InstancesWithCriticalNonCompliantPatches: js.UndefOr[InstancesCount] = js.undefined,
        InstancesWithFailedPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithInstalledOtherPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithInstalledPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount] = js.undefined,
        InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined,
        InstancesWithMissingPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithNotApplicablePatches: js.UndefOr[Int] = js.undefined,
        InstancesWithOtherNonCompliantPatches: js.UndefOr[InstancesCount] = js.undefined,
        InstancesWithSecurityNonCompliantPatches: js.UndefOr[InstancesCount] = js.undefined,
        InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Int] = js.undefined
    ): DescribePatchGroupStateResult = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      InstancesWithCriticalNonCompliantPatches.foreach(__v => __obj.updateDynamic("InstancesWithCriticalNonCompliantPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithFailedPatches.foreach(__v => __obj.updateDynamic("InstancesWithFailedPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithInstalledOtherPatches.foreach(__v => __obj.updateDynamic("InstancesWithInstalledOtherPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithInstalledPatches.foreach(__v => __obj.updateDynamic("InstancesWithInstalledPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithInstalledPendingRebootPatches.foreach(__v => __obj.updateDynamic("InstancesWithInstalledPendingRebootPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithInstalledRejectedPatches.foreach(__v => __obj.updateDynamic("InstancesWithInstalledRejectedPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithMissingPatches.foreach(__v => __obj.updateDynamic("InstancesWithMissingPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithNotApplicablePatches.foreach(__v => __obj.updateDynamic("InstancesWithNotApplicablePatches")(__v.asInstanceOf[js.Any]))
      InstancesWithOtherNonCompliantPatches.foreach(__v => __obj.updateDynamic("InstancesWithOtherNonCompliantPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithSecurityNonCompliantPatches.foreach(__v => __obj.updateDynamic("InstancesWithSecurityNonCompliantPatches")(__v.asInstanceOf[js.Any]))
      InstancesWithUnreportedNotApplicablePatches.foreach(__v => __obj.updateDynamic("InstancesWithUnreportedNotApplicablePatches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchGroupStateResult]
    }
  }

  @js.native
  trait DescribePatchGroupsRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchGroupsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchGroupsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchGroupsRequest]
    }
  }

  @js.native
  trait DescribePatchGroupsResult extends js.Object {
    var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePatchGroupsResult {
    @inline
    def apply(
        Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchGroupsResult = {
      val __obj = js.Dynamic.literal()
      Mappings.foreach(__v => __obj.updateDynamic("Mappings")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchGroupsResult]
    }
  }

  @js.native
  trait DescribePatchPropertiesRequest extends js.Object {
    var OperatingSystem: OperatingSystem
    var Property: PatchProperty
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PatchSet: js.UndefOr[PatchSet]
  }

  object DescribePatchPropertiesRequest {
    @inline
    def apply(
        OperatingSystem: OperatingSystem,
        Property: PatchProperty,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PatchSet: js.UndefOr[PatchSet] = js.undefined
    ): DescribePatchPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "OperatingSystem" -> OperatingSystem.asInstanceOf[js.Any],
        "Property" -> Property.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PatchSet.foreach(__v => __obj.updateDynamic("PatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchPropertiesRequest]
    }
  }

  @js.native
  trait DescribePatchPropertiesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Properties: js.UndefOr[PatchPropertiesList]
  }

  object DescribePatchPropertiesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Properties: js.UndefOr[PatchPropertiesList] = js.undefined
    ): DescribePatchPropertiesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchPropertiesResult]
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
    @inline
    def apply(
        State: SessionState,
        Filters: js.UndefOr[SessionFilterList] = js.undefined,
        MaxResults: js.UndefOr[SessionMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSessionsRequest]
    }
  }

  @js.native
  trait DescribeSessionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Sessions: js.UndefOr[SessionList]
  }

  object DescribeSessionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Sessions: js.UndefOr[SessionList] = js.undefined
    ): DescribeSessionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sessions.foreach(__v => __obj.updateDynamic("Sessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSessionsResponse]
    }
  }

  @js.native
  trait DisassociateOpsItemRelatedItemRequest extends js.Object {
    var AssociationId: OpsItemRelatedItemAssociationId
    var OpsItemId: OpsItemId
  }

  object DisassociateOpsItemRelatedItemRequest {
    @inline
    def apply(
        AssociationId: OpsItemRelatedItemAssociationId,
        OpsItemId: OpsItemId
    ): DisassociateOpsItemRelatedItemRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "OpsItemId" -> OpsItemId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateOpsItemRelatedItemRequest]
    }
  }

  @js.native
  trait DisassociateOpsItemRelatedItemResponse extends js.Object

  object DisassociateOpsItemRelatedItemResponse {
    @inline
    def apply(): DisassociateOpsItemRelatedItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateOpsItemRelatedItemResponse]
    }
  }

  /** A default version of a document.
    */
  @js.native
  trait DocumentDefaultVersionDescription extends js.Object {
    var DefaultVersion: js.UndefOr[DocumentVersion]
    var DefaultVersionName: js.UndefOr[DocumentVersionName]
    var Name: js.UndefOr[DocumentName]
  }

  object DocumentDefaultVersionDescription {
    @inline
    def apply(
        DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined,
        DefaultVersionName: js.UndefOr[DocumentVersionName] = js.undefined,
        Name: js.UndefOr[DocumentName] = js.undefined
    ): DocumentDefaultVersionDescription = {
      val __obj = js.Dynamic.literal()
      DefaultVersion.foreach(__v => __obj.updateDynamic("DefaultVersion")(__v.asInstanceOf[js.Any]))
      DefaultVersionName.foreach(__v => __obj.updateDynamic("DefaultVersionName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentDefaultVersionDescription]
    }
  }

  /** Describes a Amazon Web Services Systems Manager document (SSM document).
    */
  @js.native
  trait DocumentDescription extends js.Object {
    var ApprovedVersion: js.UndefOr[DocumentVersion]
    var AttachmentsInformation: js.UndefOr[AttachmentInformationList]
    var Author: js.UndefOr[DocumentAuthor]
    var CreatedDate: js.UndefOr[DateTime]
    var DefaultVersion: js.UndefOr[DocumentVersion]
    var Description: js.UndefOr[DescriptionInDocument]
    var DisplayName: js.UndefOr[DocumentDisplayName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Hash: js.UndefOr[DocumentHash]
    var HashType: js.UndefOr[DocumentHashType]
    var LatestVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Owner: js.UndefOr[DocumentOwner]
    var Parameters: js.UndefOr[DocumentParameterList]
    var PendingReviewVersion: js.UndefOr[DocumentVersion]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var Requires: js.UndefOr[DocumentRequiresList]
    var ReviewInformation: js.UndefOr[ReviewInformationList]
    var ReviewStatus: js.UndefOr[ReviewStatus]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Sha1: js.UndefOr[DocumentSha1]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DocumentDescription {
    @inline
    def apply(
        ApprovedVersion: js.UndefOr[DocumentVersion] = js.undefined,
        AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.undefined,
        Author: js.UndefOr[DocumentAuthor] = js.undefined,
        CreatedDate: js.UndefOr[DateTime] = js.undefined,
        DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Description: js.UndefOr[DescriptionInDocument] = js.undefined,
        DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentType: js.UndefOr[DocumentType] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Hash: js.UndefOr[DocumentHash] = js.undefined,
        HashType: js.UndefOr[DocumentHashType] = js.undefined,
        LatestVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        Owner: js.UndefOr[DocumentOwner] = js.undefined,
        Parameters: js.UndefOr[DocumentParameterList] = js.undefined,
        PendingReviewVersion: js.UndefOr[DocumentVersion] = js.undefined,
        PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
        Requires: js.UndefOr[DocumentRequiresList] = js.undefined,
        ReviewInformation: js.UndefOr[ReviewInformationList] = js.undefined,
        ReviewStatus: js.UndefOr[ReviewStatus] = js.undefined,
        SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
        Sha1: js.UndefOr[DocumentSha1] = js.undefined,
        Status: js.UndefOr[DocumentStatus] = js.undefined,
        StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DocumentDescription = {
      val __obj = js.Dynamic.literal()
      ApprovedVersion.foreach(__v => __obj.updateDynamic("ApprovedVersion")(__v.asInstanceOf[js.Any]))
      AttachmentsInformation.foreach(__v => __obj.updateDynamic("AttachmentsInformation")(__v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultVersion.foreach(__v => __obj.updateDynamic("DefaultVersion")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.updateDynamic("DocumentType")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Hash.foreach(__v => __obj.updateDynamic("Hash")(__v.asInstanceOf[js.Any]))
      HashType.foreach(__v => __obj.updateDynamic("HashType")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PendingReviewVersion.foreach(__v => __obj.updateDynamic("PendingReviewVersion")(__v.asInstanceOf[js.Any]))
      PlatformTypes.foreach(__v => __obj.updateDynamic("PlatformTypes")(__v.asInstanceOf[js.Any]))
      Requires.foreach(__v => __obj.updateDynamic("Requires")(__v.asInstanceOf[js.Any]))
      ReviewInformation.foreach(__v => __obj.updateDynamic("ReviewInformation")(__v.asInstanceOf[js.Any]))
      ReviewStatus.foreach(__v => __obj.updateDynamic("ReviewStatus")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Sha1.foreach(__v => __obj.updateDynamic("Sha1")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusInformation.foreach(__v => __obj.updateDynamic("StatusInformation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentDescription]
    }
  }

  /** This data type is deprecated. Instead, use <a>DocumentKeyValuesFilter</a>.
    */
  @js.native
  trait DocumentFilter extends js.Object {
    var key: DocumentFilterKey
    var value: DocumentFilterValue
  }

  object DocumentFilter {
    @inline
    def apply(
        key: DocumentFilterKey,
        value: DocumentFilterValue
    ): DocumentFilter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DocumentFilter]
    }
  }

  /** Describes the name of a SSM document.
    */
  @js.native
  trait DocumentIdentifier extends js.Object {
    var Author: js.UndefOr[DocumentAuthor]
    var CreatedDate: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DocumentDisplayName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Owner: js.UndefOr[DocumentOwner]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var Requires: js.UndefOr[DocumentRequiresList]
    var ReviewStatus: js.UndefOr[ReviewStatus]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DocumentIdentifier {
    @inline
    def apply(
        Author: js.UndefOr[DocumentAuthor] = js.undefined,
        CreatedDate: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentType: js.UndefOr[DocumentType] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        Owner: js.UndefOr[DocumentOwner] = js.undefined,
        PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined,
        Requires: js.UndefOr[DocumentRequiresList] = js.undefined,
        ReviewStatus: js.UndefOr[ReviewStatus] = js.undefined,
        SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DocumentIdentifier = {
      val __obj = js.Dynamic.literal()
      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.updateDynamic("DocumentType")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      PlatformTypes.foreach(__v => __obj.updateDynamic("PlatformTypes")(__v.asInstanceOf[js.Any]))
      Requires.foreach(__v => __obj.updateDynamic("Requires")(__v.asInstanceOf[js.Any]))
      ReviewStatus.foreach(__v => __obj.updateDynamic("ReviewStatus")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentIdentifier]
    }
  }

  /** One or more filters. Use a filter to return a more specific list of documents. For keys, you can specify one or more tags that have been applied to a document. You can also use Amazon Web Services-provided keys, some of which have specific allowed values. These keys and their associated values are as follows: <dl> <dt>DocumentType</dt> <dd>* <code>ApplicationConfiguration</code> * <code>ApplicationConfigurationSchema</code> * <code>Automation</code> * <code>ChangeCalendar</code> * <code>Command</code> * <code>DeploymentStrategy</code> * <code>Package</code> * <code>Policy</code> * <code>Session</code> </dd> <dt>Owner</dt> <dd> Note that only one <code>Owner</code> can be specified in a request. For example: <code>Key=Owner,Values=Self</code>. * <code>Amazon</code> * <code>Private</code> * <code>Public</code> * <code>Self</code> * <code>ThirdParty</code> </dd> <dt>PlatformTypes</dt> <dd>* <code>Linux</code> * <code>Windows</code> </dd> </dl> <code>Name</code> is another Amazon Web
    * Services-provided key. If you use <code>Name</code> as a key, you can use a name prefix to return a list of documents. For example, in the Amazon Web Services CLI, to return a list of all documents that begin with <code>Te</code>, run the following command: <code>aws ssm list-documents --filters Key=Name,Values=Te</code> You can also use the <code>TargetType</code> Amazon Web Services-provided key. For a list of valid resource type values that can be used with this key, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html|Amazon Web Services resource and property types reference]] in the <i>CloudFormation User Guide</i>. If you specify more than two keys, only documents that are identified by all the tags are returned in the results. If you specify more than two values for a key, documents that are identified by any of the values are returned in the results. To specify a custom key-value pair, use the format
    * <code>Key=tag:tagName,Values=valueName</code>. For example, if you created a key called region and are using the Amazon Web Services CLI to call the <code>list-documents</code> command: <code>aws ssm list-documents --filters Key=tag:region,Values=east,west Key=Owner,Values=Self</code>
    */
  @js.native
  trait DocumentKeyValuesFilter extends js.Object {
    var Key: js.UndefOr[DocumentKeyValuesFilterKey]
    var Values: js.UndefOr[DocumentKeyValuesFilterValues]
  }

  object DocumentKeyValuesFilter {
    @inline
    def apply(
        Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.undefined,
        Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.undefined
    ): DocumentKeyValuesFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentKeyValuesFilter]
    }
  }

  /** Details about the response to a document review request.
    */
  @js.native
  trait DocumentMetadataResponseInfo extends js.Object {
    var ReviewerResponse: js.UndefOr[DocumentReviewerResponseList]
  }

  object DocumentMetadataResponseInfo {
    @inline
    def apply(
        ReviewerResponse: js.UndefOr[DocumentReviewerResponseList] = js.undefined
    ): DocumentMetadataResponseInfo = {
      val __obj = js.Dynamic.literal()
      ReviewerResponse.foreach(__v => __obj.updateDynamic("ReviewerResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentMetadataResponseInfo]
    }
  }

  /** Parameters specified in a System Manager document that run on the server when the command is run.
    */
  @js.native
  trait DocumentParameter extends js.Object {
    var DefaultValue: js.UndefOr[DocumentParameterDefaultValue]
    var Description: js.UndefOr[DocumentParameterDescrption]
    var Name: js.UndefOr[DocumentParameterName]
    var Type: js.UndefOr[DocumentParameterType]
  }

  object DocumentParameter {
    @inline
    def apply(
        DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.undefined,
        Description: js.UndefOr[DocumentParameterDescrption] = js.undefined,
        Name: js.UndefOr[DocumentParameterName] = js.undefined,
        Type: js.UndefOr[DocumentParameterType] = js.undefined
    ): DocumentParameter = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentParameter]
    }
  }

  /** An SSM document required by the current document.
    */
  @js.native
  trait DocumentRequires extends js.Object {
    var Name: DocumentARN
    var Version: js.UndefOr[DocumentVersion]
  }

  object DocumentRequires {
    @inline
    def apply(
        Name: DocumentARN,
        Version: js.UndefOr[DocumentVersion] = js.undefined
    ): DocumentRequires = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentRequires]
    }
  }

  /** Information about comments added to a document review request.
    */
  @js.native
  trait DocumentReviewCommentSource extends js.Object {
    var Content: js.UndefOr[DocumentReviewComment]
    var Type: js.UndefOr[DocumentReviewCommentType]
  }

  object DocumentReviewCommentSource {
    @inline
    def apply(
        Content: js.UndefOr[DocumentReviewComment] = js.undefined,
        Type: js.UndefOr[DocumentReviewCommentType] = js.undefined
    ): DocumentReviewCommentSource = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentReviewCommentSource]
    }
  }

  /** Information about a reviewer's response to a document review request.
    */
  @js.native
  trait DocumentReviewerResponseSource extends js.Object {
    var Comment: js.UndefOr[DocumentReviewCommentList]
    var CreateTime: js.UndefOr[DateTime]
    var ReviewStatus: js.UndefOr[ReviewStatus]
    var Reviewer: js.UndefOr[Reviewer]
    var UpdatedTime: js.UndefOr[DateTime]
  }

  object DocumentReviewerResponseSource {
    @inline
    def apply(
        Comment: js.UndefOr[DocumentReviewCommentList] = js.undefined,
        CreateTime: js.UndefOr[DateTime] = js.undefined,
        ReviewStatus: js.UndefOr[ReviewStatus] = js.undefined,
        Reviewer: js.UndefOr[Reviewer] = js.undefined,
        UpdatedTime: js.UndefOr[DateTime] = js.undefined
    ): DocumentReviewerResponseSource = {
      val __obj = js.Dynamic.literal()
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      ReviewStatus.foreach(__v => __obj.updateDynamic("ReviewStatus")(__v.asInstanceOf[js.Any]))
      Reviewer.foreach(__v => __obj.updateDynamic("Reviewer")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentReviewerResponseSource]
    }
  }

  /** Information about a document approval review.
    */
  @js.native
  trait DocumentReviews extends js.Object {
    var Action: DocumentReviewAction
    var Comment: js.UndefOr[DocumentReviewCommentList]
  }

  object DocumentReviews {
    @inline
    def apply(
        Action: DocumentReviewAction,
        Comment: js.UndefOr[DocumentReviewCommentList] = js.undefined
    ): DocumentReviews = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentReviews]
    }
  }

  /** Version information about the document.
    */
  @js.native
  trait DocumentVersionInfo extends js.Object {
    var CreatedDate: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DocumentDisplayName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var IsDefaultVersion: js.UndefOr[Boolean]
    var Name: js.UndefOr[DocumentName]
    var ReviewStatus: js.UndefOr[ReviewStatus]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DocumentVersionInfo {
    @inline
    def apply(
        CreatedDate: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        IsDefaultVersion: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[DocumentName] = js.undefined,
        ReviewStatus: js.UndefOr[ReviewStatus] = js.undefined,
        Status: js.UndefOr[DocumentStatus] = js.undefined,
        StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DocumentVersionInfo = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      IsDefaultVersion.foreach(__v => __obj.updateDynamic("IsDefaultVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReviewStatus.foreach(__v => __obj.updateDynamic("ReviewStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusInformation.foreach(__v => __obj.updateDynamic("StatusInformation")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentVersionInfo]
    }
  }

  /** The <code>EffectivePatch</code> structure defines metadata about a patch along with the approval state of the patch in a particular patch baseline. The approval state includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  @js.native
  trait EffectivePatch extends js.Object {
    var Patch: js.UndefOr[Patch]
    var PatchStatus: js.UndefOr[PatchStatus]
  }

  object EffectivePatch {
    @inline
    def apply(
        Patch: js.UndefOr[Patch] = js.undefined,
        PatchStatus: js.UndefOr[PatchStatus] = js.undefined
    ): EffectivePatch = {
      val __obj = js.Dynamic.literal()
      Patch.foreach(__v => __obj.updateDynamic("Patch")(__v.asInstanceOf[js.Any]))
      PatchStatus.foreach(__v => __obj.updateDynamic("PatchStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EffectivePatch]
    }
  }

  /** Describes a failed association.
    */
  @js.native
  trait FailedCreateAssociation extends js.Object {
    var Entry: js.UndefOr[CreateAssociationBatchRequestEntry]
    var Fault: js.UndefOr[Fault]
    var Message: js.UndefOr[BatchErrorMessage]
  }

  object FailedCreateAssociation {
    @inline
    def apply(
        Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined,
        Fault: js.UndefOr[Fault] = js.undefined,
        Message: js.UndefOr[BatchErrorMessage] = js.undefined
    ): FailedCreateAssociation = {
      val __obj = js.Dynamic.literal()
      Entry.foreach(__v => __obj.updateDynamic("Entry")(__v.asInstanceOf[js.Any]))
      Fault.foreach(__v => __obj.updateDynamic("Fault")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedCreateAssociation]
    }
  }

  /** Information about an Automation failure.
    */
  @js.native
  trait FailureDetails extends js.Object {
    var Details: js.UndefOr[AutomationParameterMap]
    var FailureStage: js.UndefOr[String]
    var FailureType: js.UndefOr[String]
  }

  object FailureDetails {
    @inline
    def apply(
        Details: js.UndefOr[AutomationParameterMap] = js.undefined,
        FailureStage: js.UndefOr[String] = js.undefined,
        FailureType: js.UndefOr[String] = js.undefined
    ): FailureDetails = {
      val __obj = js.Dynamic.literal()
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      FailureStage.foreach(__v => __obj.updateDynamic("FailureStage")(__v.asInstanceOf[js.Any]))
      FailureType.foreach(__v => __obj.updateDynamic("FailureType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureDetails]
    }
  }

  @js.native
  trait GetAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
  }

  object GetAutomationExecutionRequest {
    @inline
    def apply(
        AutomationExecutionId: AutomationExecutionId
    ): GetAutomationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAutomationExecutionRequest]
    }
  }

  @js.native
  trait GetAutomationExecutionResult extends js.Object {
    var AutomationExecution: js.UndefOr[AutomationExecution]
  }

  object GetAutomationExecutionResult {
    @inline
    def apply(
        AutomationExecution: js.UndefOr[AutomationExecution] = js.undefined
    ): GetAutomationExecutionResult = {
      val __obj = js.Dynamic.literal()
      AutomationExecution.foreach(__v => __obj.updateDynamic("AutomationExecution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutomationExecutionResult]
    }
  }

  @js.native
  trait GetCalendarStateRequest extends js.Object {
    var CalendarNames: CalendarNameOrARNList
    var AtTime: js.UndefOr[ISO8601String]
  }

  object GetCalendarStateRequest {
    @inline
    def apply(
        CalendarNames: CalendarNameOrARNList,
        AtTime: js.UndefOr[ISO8601String] = js.undefined
    ): GetCalendarStateRequest = {
      val __obj = js.Dynamic.literal(
        "CalendarNames" -> CalendarNames.asInstanceOf[js.Any]
      )

      AtTime.foreach(__v => __obj.updateDynamic("AtTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCalendarStateRequest]
    }
  }

  @js.native
  trait GetCalendarStateResponse extends js.Object {
    var AtTime: js.UndefOr[ISO8601String]
    var NextTransitionTime: js.UndefOr[ISO8601String]
    var State: js.UndefOr[CalendarState]
  }

  object GetCalendarStateResponse {
    @inline
    def apply(
        AtTime: js.UndefOr[ISO8601String] = js.undefined,
        NextTransitionTime: js.UndefOr[ISO8601String] = js.undefined,
        State: js.UndefOr[CalendarState] = js.undefined
    ): GetCalendarStateResponse = {
      val __obj = js.Dynamic.literal()
      AtTime.foreach(__v => __obj.updateDynamic("AtTime")(__v.asInstanceOf[js.Any]))
      NextTransitionTime.foreach(__v => __obj.updateDynamic("NextTransitionTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCalendarStateResponse]
    }
  }

  @js.native
  trait GetCommandInvocationRequest extends js.Object {
    var CommandId: CommandId
    var InstanceId: InstanceId
    var PluginName: js.UndefOr[CommandPluginName]
  }

  object GetCommandInvocationRequest {
    @inline
    def apply(
        CommandId: CommandId,
        InstanceId: InstanceId,
        PluginName: js.UndefOr[CommandPluginName] = js.undefined
    ): GetCommandInvocationRequest = {
      val __obj = js.Dynamic.literal(
        "CommandId" -> CommandId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      PluginName.foreach(__v => __obj.updateDynamic("PluginName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommandInvocationRequest]
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
    @inline
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
        StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    ): GetCommandInvocationResult = {
      val __obj = js.Dynamic.literal()
      CloudWatchOutputConfig.foreach(__v => __obj.updateDynamic("CloudWatchOutputConfig")(__v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.updateDynamic("CommandId")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      ExecutionElapsedTime.foreach(__v => __obj.updateDynamic("ExecutionElapsedTime")(__v.asInstanceOf[js.Any]))
      ExecutionEndDateTime.foreach(__v => __obj.updateDynamic("ExecutionEndDateTime")(__v.asInstanceOf[js.Any]))
      ExecutionStartDateTime.foreach(__v => __obj.updateDynamic("ExecutionStartDateTime")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      PluginName.foreach(__v => __obj.updateDynamic("PluginName")(__v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.updateDynamic("ResponseCode")(__v.asInstanceOf[js.Any]))
      StandardErrorContent.foreach(__v => __obj.updateDynamic("StandardErrorContent")(__v.asInstanceOf[js.Any]))
      StandardErrorUrl.foreach(__v => __obj.updateDynamic("StandardErrorUrl")(__v.asInstanceOf[js.Any]))
      StandardOutputContent.foreach(__v => __obj.updateDynamic("StandardOutputContent")(__v.asInstanceOf[js.Any]))
      StandardOutputUrl.foreach(__v => __obj.updateDynamic("StandardOutputUrl")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommandInvocationResult]
    }
  }

  @js.native
  trait GetConnectionStatusRequest extends js.Object {
    var Target: SessionTarget
  }

  object GetConnectionStatusRequest {
    @inline
    def apply(
        Target: SessionTarget
    ): GetConnectionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "Target" -> Target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectionStatusRequest]
    }
  }

  @js.native
  trait GetConnectionStatusResponse extends js.Object {
    var Status: js.UndefOr[ConnectionStatus]
    var Target: js.UndefOr[SessionTarget]
  }

  object GetConnectionStatusResponse {
    @inline
    def apply(
        Status: js.UndefOr[ConnectionStatus] = js.undefined,
        Target: js.UndefOr[SessionTarget] = js.undefined
    ): GetConnectionStatusResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionStatusResponse]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineRequest extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetDefaultPatchBaselineRequest {
    @inline
    def apply(
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): GetDefaultPatchBaselineRequest = {
      val __obj = js.Dynamic.literal()
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetDefaultPatchBaselineResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): GetDefaultPatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDefaultPatchBaselineResult]
    }
  }

  @js.native
  trait GetDeployablePatchSnapshotForInstanceRequest extends js.Object {
    var InstanceId: InstanceId
    var SnapshotId: SnapshotId
    var BaselineOverride: js.UndefOr[BaselineOverride]
  }

  object GetDeployablePatchSnapshotForInstanceRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SnapshotId: SnapshotId,
        BaselineOverride: js.UndefOr[BaselineOverride] = js.undefined
    ): GetDeployablePatchSnapshotForInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      BaselineOverride.foreach(__v => __obj.updateDynamic("BaselineOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
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
    @inline
    def apply(
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Product: js.UndefOr[Product] = js.undefined,
        SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): GetDeployablePatchSnapshotForInstanceResult = {
      val __obj = js.Dynamic.literal()
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.updateDynamic("Product")(__v.asInstanceOf[js.Any]))
      SnapshotDownloadUrl.foreach(__v => __obj.updateDynamic("SnapshotDownloadUrl")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
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
    @inline
    def apply(
        Name: DocumentARN,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): GetDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResult extends js.Object {
    var AttachmentsContent: js.UndefOr[AttachmentContentList]
    var Content: js.UndefOr[DocumentContent]
    var CreatedDate: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DocumentDisplayName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Requires: js.UndefOr[DocumentRequiresList]
    var ReviewStatus: js.UndefOr[ReviewStatus]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object GetDocumentResult {
    @inline
    def apply(
        AttachmentsContent: js.UndefOr[AttachmentContentList] = js.undefined,
        Content: js.UndefOr[DocumentContent] = js.undefined,
        CreatedDate: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentType: js.UndefOr[DocumentType] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        Requires: js.UndefOr[DocumentRequiresList] = js.undefined,
        ReviewStatus: js.UndefOr[ReviewStatus] = js.undefined,
        Status: js.UndefOr[DocumentStatus] = js.undefined,
        StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): GetDocumentResult = {
      val __obj = js.Dynamic.literal()
      AttachmentsContent.foreach(__v => __obj.updateDynamic("AttachmentsContent")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.updateDynamic("DocumentType")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Requires.foreach(__v => __obj.updateDynamic("Requires")(__v.asInstanceOf[js.Any]))
      ReviewStatus.foreach(__v => __obj.updateDynamic("ReviewStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusInformation.foreach(__v => __obj.updateDynamic("StatusInformation")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentResult]
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
    @inline
    def apply(
        Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined
    ): GetInventoryRequest = {
      val __obj = js.Dynamic.literal()
      Aggregators.foreach(__v => __obj.updateDynamic("Aggregators")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResultAttributes.foreach(__v => __obj.updateDynamic("ResultAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventoryRequest]
    }
  }

  @js.native
  trait GetInventoryResult extends js.Object {
    var Entities: js.UndefOr[InventoryResultEntityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInventoryResult {
    @inline
    def apply(
        Entities: js.UndefOr[InventoryResultEntityList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInventoryResult = {
      val __obj = js.Dynamic.literal()
      Entities.foreach(__v => __obj.updateDynamic("Entities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventoryResult]
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
    @inline
    def apply(
        Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.undefined,
        MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SubType: js.UndefOr[IsSubTypeSchema] = js.undefined,
        TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.undefined
    ): GetInventorySchemaRequest = {
      val __obj = js.Dynamic.literal()
      Aggregator.foreach(__v => __obj.updateDynamic("Aggregator")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SubType.foreach(__v => __obj.updateDynamic("SubType")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventorySchemaRequest]
    }
  }

  @js.native
  trait GetInventorySchemaResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Schemas: js.UndefOr[InventoryItemSchemaResultList]
  }

  object GetInventorySchemaResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined
    ): GetInventorySchemaResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventorySchemaResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionRequest {
    @inline
    def apply(
        WindowExecutionId: MaintenanceWindowExecutionId
    ): GetMaintenanceWindowExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMaintenanceWindowExecutionRequest]
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
    @inline
    def apply(
        EndTime: js.UndefOr[DateTime] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
        StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
        TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined,
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): GetMaintenanceWindowExecutionResult = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TaskIds.foreach(__v => __obj.updateDynamic("TaskIds")(__v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowExecutionResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
    var InvocationId: MaintenanceWindowExecutionTaskInvocationId
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionTaskInvocationRequest {
    @inline
    def apply(
        InvocationId: MaintenanceWindowExecutionTaskInvocationId,
        TaskId: MaintenanceWindowExecutionTaskId,
        WindowExecutionId: MaintenanceWindowExecutionId
    ): GetMaintenanceWindowExecutionTaskInvocationRequest = {
      val __obj = js.Dynamic.literal(
        "InvocationId" -> InvocationId.asInstanceOf[js.Any],
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
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
    @inline
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
        WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
    ): GetMaintenanceWindowExecutionTaskInvocationResult = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      InvocationId.foreach(__v => __obj.updateDynamic("InvocationId")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.updateDynamic("TaskExecutionId")(__v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.updateDynamic("TaskType")(__v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.updateDynamic("WindowTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionTaskRequest {
    @inline
    def apply(
        TaskId: MaintenanceWindowExecutionTaskId,
        WindowExecutionId: MaintenanceWindowExecutionId
    ): GetMaintenanceWindowExecutionTaskRequest = {
      val __obj = js.Dynamic.literal(
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
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
    @inline
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
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): GetMaintenanceWindowExecutionTaskResult = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.updateDynamic("TaskExecutionId")(__v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.updateDynamic("TaskParameters")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object GetMaintenanceWindowRequest {
    @inline
    def apply(
        WindowId: MaintenanceWindowId
    ): GetMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMaintenanceWindowRequest]
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
    var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object GetMaintenanceWindowResult {
    @inline
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
        ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined,
        ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): GetMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      AllowUnassociatedTargets.foreach(__v => __obj.updateDynamic("AllowUnassociatedTargets")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Cutoff.foreach(__v => __obj.updateDynamic("Cutoff")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      ModifiedDate.foreach(__v => __obj.updateDynamic("ModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextExecutionTime.foreach(__v => __obj.updateDynamic("NextExecutionTime")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      ScheduleOffset.foreach(__v => __obj.updateDynamic("ScheduleOffset")(__v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.updateDynamic("ScheduleTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowTaskRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  object GetMaintenanceWindowTaskRequest {
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTaskId: MaintenanceWindowTaskId
    ): GetMaintenanceWindowTaskRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
    }
  }

  @js.native
  trait GetMaintenanceWindowTaskResult extends js.Object {
    var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior]
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
    @inline
    def apply(
        CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined,
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
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): GetMaintenanceWindowTaskResult = {
      val __obj = js.Dynamic.literal()
      CutoffBehavior.foreach(__v => __obj.updateDynamic("CutoffBehavior")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.updateDynamic("TaskInvocationParameters")(__v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.updateDynamic("TaskParameters")(__v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.updateDynamic("TaskType")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.updateDynamic("WindowTaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait GetOpsItemRequest extends js.Object {
    var OpsItemId: OpsItemId
  }

  object GetOpsItemRequest {
    @inline
    def apply(
        OpsItemId: OpsItemId
    ): GetOpsItemRequest = {
      val __obj = js.Dynamic.literal(
        "OpsItemId" -> OpsItemId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOpsItemRequest]
    }
  }

  @js.native
  trait GetOpsItemResponse extends js.Object {
    var OpsItem: js.UndefOr[OpsItem]
  }

  object GetOpsItemResponse {
    @inline
    def apply(
        OpsItem: js.UndefOr[OpsItem] = js.undefined
    ): GetOpsItemResponse = {
      val __obj = js.Dynamic.literal()
      OpsItem.foreach(__v => __obj.updateDynamic("OpsItem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsItemResponse]
    }
  }

  @js.native
  trait GetOpsMetadataRequest extends js.Object {
    var OpsMetadataArn: OpsMetadataArn
    var MaxResults: js.UndefOr[GetOpsMetadataMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetOpsMetadataRequest {
    @inline
    def apply(
        OpsMetadataArn: OpsMetadataArn,
        MaxResults: js.UndefOr[GetOpsMetadataMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetOpsMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "OpsMetadataArn" -> OpsMetadataArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsMetadataRequest]
    }
  }

  @js.native
  trait GetOpsMetadataResult extends js.Object {
    var Metadata: js.UndefOr[MetadataMap]
    var NextToken: js.UndefOr[NextToken]
    var ResourceId: js.UndefOr[OpsMetadataResourceId]
  }

  object GetOpsMetadataResult {
    @inline
    def apply(
        Metadata: js.UndefOr[MetadataMap] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceId: js.UndefOr[OpsMetadataResourceId] = js.undefined
    ): GetOpsMetadataResult = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsMetadataResult]
    }
  }

  @js.native
  trait GetOpsSummaryRequest extends js.Object {
    var Aggregators: js.UndefOr[OpsAggregatorList]
    var Filters: js.UndefOr[OpsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResultAttributes: js.UndefOr[OpsResultAttributeList]
    var SyncName: js.UndefOr[ResourceDataSyncName]
  }

  object GetOpsSummaryRequest {
    @inline
    def apply(
        Aggregators: js.UndefOr[OpsAggregatorList] = js.undefined,
        Filters: js.UndefOr[OpsFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResultAttributes: js.UndefOr[OpsResultAttributeList] = js.undefined,
        SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined
    ): GetOpsSummaryRequest = {
      val __obj = js.Dynamic.literal()
      Aggregators.foreach(__v => __obj.updateDynamic("Aggregators")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResultAttributes.foreach(__v => __obj.updateDynamic("ResultAttributes")(__v.asInstanceOf[js.Any]))
      SyncName.foreach(__v => __obj.updateDynamic("SyncName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsSummaryRequest]
    }
  }

  @js.native
  trait GetOpsSummaryResult extends js.Object {
    var Entities: js.UndefOr[OpsEntityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetOpsSummaryResult {
    @inline
    def apply(
        Entities: js.UndefOr[OpsEntityList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetOpsSummaryResult = {
      val __obj = js.Dynamic.literal()
      Entities.foreach(__v => __obj.updateDynamic("Entities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsSummaryResult]
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
    @inline
    def apply(
        Name: PSParameterName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParameterHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WithDecryption.foreach(__v => __obj.updateDynamic("WithDecryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterHistoryRequest]
    }
  }

  @js.native
  trait GetParameterHistoryResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterHistoryList]
  }

  object GetParameterHistoryResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Parameters: js.UndefOr[ParameterHistoryList] = js.undefined
    ): GetParameterHistoryResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterHistoryResult]
    }
  }

  @js.native
  trait GetParameterRequest extends js.Object {
    var Name: PSParameterName
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParameterRequest {
    @inline
    def apply(
        Name: PSParameterName,
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParameterRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      WithDecryption.foreach(__v => __obj.updateDynamic("WithDecryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterRequest]
    }
  }

  @js.native
  trait GetParameterResult extends js.Object {
    var Parameter: js.UndefOr[Parameter]
  }

  object GetParameterResult {
    @inline
    def apply(
        Parameter: js.UndefOr[Parameter] = js.undefined
    ): GetParameterResult = {
      val __obj = js.Dynamic.literal()
      Parameter.foreach(__v => __obj.updateDynamic("Parameter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterResult]
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
    @inline
    def apply(
        Path: PSParameterName,
        MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined,
        Recursive: js.UndefOr[Boolean] = js.undefined,
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParametersByPathRequest = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParameterFilters.foreach(__v => __obj.updateDynamic("ParameterFilters")(__v.asInstanceOf[js.Any]))
      Recursive.foreach(__v => __obj.updateDynamic("Recursive")(__v.asInstanceOf[js.Any]))
      WithDecryption.foreach(__v => __obj.updateDynamic("WithDecryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersByPathRequest]
    }
  }

  @js.native
  trait GetParametersByPathResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterList]
  }

  object GetParametersByPathResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Parameters: js.UndefOr[ParameterList] = js.undefined
    ): GetParametersByPathResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersByPathResult]
    }
  }

  @js.native
  trait GetParametersRequest extends js.Object {
    var Names: ParameterNameList
    var WithDecryption: js.UndefOr[Boolean]
  }

  object GetParametersRequest {
    @inline
    def apply(
        Names: ParameterNameList,
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParametersRequest = {
      val __obj = js.Dynamic.literal(
        "Names" -> Names.asInstanceOf[js.Any]
      )

      WithDecryption.foreach(__v => __obj.updateDynamic("WithDecryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersRequest]
    }
  }

  @js.native
  trait GetParametersResult extends js.Object {
    var InvalidParameters: js.UndefOr[ParameterNameList]
    var Parameters: js.UndefOr[ParameterList]
  }

  object GetParametersResult {
    @inline
    def apply(
        InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined,
        Parameters: js.UndefOr[ParameterList] = js.undefined
    ): GetParametersResult = {
      val __obj = js.Dynamic.literal()
      InvalidParameters.foreach(__v => __obj.updateDynamic("InvalidParameters")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersResult]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetPatchBaselineForPatchGroupRequest {
    @inline
    def apply(
        PatchGroup: PatchGroup,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): GetPatchBaselineForPatchGroupRequest = {
      val __obj = js.Dynamic.literal(
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )

      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait GetPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object GetPatchBaselineForPatchGroupResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): GetPatchBaselineForPatchGroupResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.updateDynamic("PatchGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait GetPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object GetPatchBaselineRequest {
    @inline
    def apply(
        BaselineId: BaselineId
    ): GetPatchBaselineRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPatchBaselineRequest]
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
    @inline
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
        Sources: js.UndefOr[PatchSourceList] = js.undefined
    ): GetPatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      ApprovalRules.foreach(__v => __obj.updateDynamic("ApprovalRules")(__v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.updateDynamic("ApprovedPatches")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(__v => __obj.updateDynamic("ApprovedPatchesComplianceLevel")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesEnableNonSecurity.foreach(__v => __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(__v.asInstanceOf[js.Any]))
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.updateDynamic("GlobalFilters")(__v.asInstanceOf[js.Any]))
      ModifiedDate.foreach(__v => __obj.updateDynamic("ModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      PatchGroups.foreach(__v => __obj.updateDynamic("PatchGroups")(__v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.updateDynamic("RejectedPatches")(__v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.updateDynamic("RejectedPatchesAction")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPatchBaselineResult]
    }
  }

  /** The request body of the GetServiceSetting API operation.
    */
  @js.native
  trait GetServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
  }

  object GetServiceSettingRequest {
    @inline
    def apply(
        SettingId: ServiceSettingId
    ): GetServiceSettingRequest = {
      val __obj = js.Dynamic.literal(
        "SettingId" -> SettingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceSettingRequest]
    }
  }

  /** The query result body of the GetServiceSetting API operation.
    */
  @js.native
  trait GetServiceSettingResult extends js.Object {
    var ServiceSetting: js.UndefOr[ServiceSetting]
  }

  object GetServiceSettingResult {
    @inline
    def apply(
        ServiceSetting: js.UndefOr[ServiceSetting] = js.undefined
    ): GetServiceSettingResult = {
      val __obj = js.Dynamic.literal()
      ServiceSetting.foreach(__v => __obj.updateDynamic("ServiceSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceSettingResult]
    }
  }

  /** Status information about the aggregated associations.
    */
  @js.native
  trait InstanceAggregatedAssociationOverview extends js.Object {
    var DetailedStatus: js.UndefOr[StatusName]
    var InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount]
  }

  object InstanceAggregatedAssociationOverview {
    @inline
    def apply(
        DetailedStatus: js.UndefOr[StatusName] = js.undefined,
        InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount] = js.undefined
    ): InstanceAggregatedAssociationOverview = {
      val __obj = js.Dynamic.literal()
      DetailedStatus.foreach(__v => __obj.updateDynamic("DetailedStatus")(__v.asInstanceOf[js.Any]))
      InstanceAssociationStatusAggregatedCount.foreach(__v => __obj.updateDynamic("InstanceAssociationStatusAggregatedCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
    }
  }

  /** One or more association documents on the managed node.
    */
  @js.native
  trait InstanceAssociation extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var Content: js.UndefOr[DocumentContent]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object InstanceAssociation {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        Content: js.UndefOr[DocumentContent] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): InstanceAssociation = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociation]
    }
  }

  /** An S3 bucket where you want to store the results of this request. For the minimal permissions required to enable Amazon S3 output for an association, see [[https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-state-assoc.html|Creating associations]] in the <i>Systems Manager User Guide</i>.
    */
  @js.native
  trait InstanceAssociationOutputLocation extends js.Object {
    var S3Location: js.UndefOr[S3OutputLocation]
  }

  object InstanceAssociationOutputLocation {
    @inline
    def apply(
        S3Location: js.UndefOr[S3OutputLocation] = js.undefined
    ): InstanceAssociationOutputLocation = {
      val __obj = js.Dynamic.literal()
      S3Location.foreach(__v => __obj.updateDynamic("S3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociationOutputLocation]
    }
  }

  /** The URL of S3 bucket where you want to store the results of this request.
    */
  @js.native
  trait InstanceAssociationOutputUrl extends js.Object {
    var S3OutputUrl: js.UndefOr[S3OutputUrl]
  }

  object InstanceAssociationOutputUrl {
    @inline
    def apply(
        S3OutputUrl: js.UndefOr[S3OutputUrl] = js.undefined
    ): InstanceAssociationOutputUrl = {
      val __obj = js.Dynamic.literal()
      S3OutputUrl.foreach(__v => __obj.updateDynamic("S3OutputUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociationOutputUrl]
    }
  }

  /** Status information about the association.
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
    var Name: js.UndefOr[DocumentARN]
    var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl]
    var Status: js.UndefOr[StatusName]
  }

  object InstanceAssociationStatusInfo {
    @inline
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
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined,
        Status: js.UndefOr[StatusName] = js.undefined
    ): InstanceAssociationStatusInfo = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.updateDynamic("DetailedStatus")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ExecutionDate.foreach(__v => __obj.updateDynamic("ExecutionDate")(__v.asInstanceOf[js.Any]))
      ExecutionSummary.foreach(__v => __obj.updateDynamic("ExecutionSummary")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputUrl.foreach(__v => __obj.updateDynamic("OutputUrl")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociationStatusInfo]
    }
  }

  /** Describes a filter for a specific list of managed nodes.
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
    var SourceId: js.UndefOr[SourceId]
    var SourceType: js.UndefOr[SourceType]
  }

  object InstanceInformation {
    @inline
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
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        SourceId: js.UndefOr[SourceId] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): InstanceInformation = {
      val __obj = js.Dynamic.literal()
      ActivationId.foreach(__v => __obj.updateDynamic("ActivationId")(__v.asInstanceOf[js.Any]))
      AgentVersion.foreach(__v => __obj.updateDynamic("AgentVersion")(__v.asInstanceOf[js.Any]))
      AssociationOverview.foreach(__v => __obj.updateDynamic("AssociationOverview")(__v.asInstanceOf[js.Any]))
      AssociationStatus.foreach(__v => __obj.updateDynamic("AssociationStatus")(__v.asInstanceOf[js.Any]))
      ComputerName.foreach(__v => __obj.updateDynamic("ComputerName")(__v.asInstanceOf[js.Any]))
      IPAddress.foreach(__v => __obj.updateDynamic("IPAddress")(__v.asInstanceOf[js.Any]))
      IamRole.foreach(__v => __obj.updateDynamic("IamRole")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      IsLatestVersion.foreach(__v => __obj.updateDynamic("IsLatestVersion")(__v.asInstanceOf[js.Any]))
      LastAssociationExecutionDate.foreach(__v => __obj.updateDynamic("LastAssociationExecutionDate")(__v.asInstanceOf[js.Any]))
      LastPingDateTime.foreach(__v => __obj.updateDynamic("LastPingDateTime")(__v.asInstanceOf[js.Any]))
      LastSuccessfulAssociationExecutionDate.foreach(__v => __obj.updateDynamic("LastSuccessfulAssociationExecutionDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PingStatus.foreach(__v => __obj.updateDynamic("PingStatus")(__v.asInstanceOf[js.Any]))
      PlatformName.foreach(__v => __obj.updateDynamic("PlatformName")(__v.asInstanceOf[js.Any]))
      PlatformType.foreach(__v => __obj.updateDynamic("PlatformType")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      RegistrationDate.foreach(__v => __obj.updateDynamic("RegistrationDate")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceInformation]
    }
  }

  /** Describes a filter for a specific list of managed nodes. You can filter node information by using tags. You specify tags by using a key-value mapping. Use this operation instead of the [[DescribeInstanceInformationRequest.InstanceInformationFilterList]] method. The <code>InstanceInformationFilterList</code> method is a legacy method and doesn't support tags.
    */
  @js.native
  trait InstanceInformationFilter extends js.Object {
    var key: InstanceInformationFilterKey
    var valueSet: InstanceInformationFilterValueSet
  }

  object InstanceInformationFilter {
    @inline
    def apply(
        key: InstanceInformationFilterKey,
        valueSet: InstanceInformationFilterValueSet
    ): InstanceInformationFilter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "valueSet" -> valueSet.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstanceInformationFilter]
    }
  }

  /** The filters to describe or get information about your managed nodes.
    */
  @js.native
  trait InstanceInformationStringFilter extends js.Object {
    var Key: InstanceInformationStringFilterKey
    var Values: InstanceInformationFilterValueSet
  }

  object InstanceInformationStringFilter {
    @inline
    def apply(
        Key: InstanceInformationStringFilterKey,
        Values: InstanceInformationFilterValueSet
    ): InstanceInformationStringFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstanceInformationStringFilter]
    }
  }

  /** Defines the high-level patch compliance state for a managed node, providing information about the number of installed, missing, not applicable, and failed patches along with metadata about the operation when this information was gathered for the managed node.
    */
  @js.native
  trait InstancePatchState extends js.Object {
    var BaselineId: BaselineId
    var InstanceId: InstanceId
    var Operation: PatchOperationType
    var OperationEndTime: DateTime
    var OperationStartTime: DateTime
    var PatchGroup: PatchGroup
    var CriticalNonCompliantCount: js.UndefOr[PatchCriticalNonCompliantCount]
    var FailedCount: js.UndefOr[PatchFailedCount]
    var InstallOverrideList: js.UndefOr[InstallOverrideList]
    var InstalledCount: js.UndefOr[PatchInstalledCount]
    var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount]
    var InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount]
    var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount]
    var LastNoRebootInstallOperationTime: js.UndefOr[DateTime]
    var MissingCount: js.UndefOr[PatchMissingCount]
    var NotApplicableCount: js.UndefOr[PatchNotApplicableCount]
    var OtherNonCompliantCount: js.UndefOr[PatchOtherNonCompliantCount]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var RebootOption: js.UndefOr[RebootOption]
    var SecurityNonCompliantCount: js.UndefOr[PatchSecurityNonCompliantCount]
    var SnapshotId: js.UndefOr[SnapshotId]
    var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount]
  }

  object InstancePatchState {
    @inline
    def apply(
        BaselineId: BaselineId,
        InstanceId: InstanceId,
        Operation: PatchOperationType,
        OperationEndTime: DateTime,
        OperationStartTime: DateTime,
        PatchGroup: PatchGroup,
        CriticalNonCompliantCount: js.UndefOr[PatchCriticalNonCompliantCount] = js.undefined,
        FailedCount: js.UndefOr[PatchFailedCount] = js.undefined,
        InstallOverrideList: js.UndefOr[InstallOverrideList] = js.undefined,
        InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined,
        InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined,
        InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount] = js.undefined,
        InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined,
        LastNoRebootInstallOperationTime: js.UndefOr[DateTime] = js.undefined,
        MissingCount: js.UndefOr[PatchMissingCount] = js.undefined,
        NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined,
        OtherNonCompliantCount: js.UndefOr[PatchOtherNonCompliantCount] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
        RebootOption: js.UndefOr[RebootOption] = js.undefined,
        SecurityNonCompliantCount: js.UndefOr[PatchSecurityNonCompliantCount] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.undefined
    ): InstancePatchState = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any],
        "OperationEndTime" -> OperationEndTime.asInstanceOf[js.Any],
        "OperationStartTime" -> OperationStartTime.asInstanceOf[js.Any],
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )

      CriticalNonCompliantCount.foreach(__v => __obj.updateDynamic("CriticalNonCompliantCount")(__v.asInstanceOf[js.Any]))
      FailedCount.foreach(__v => __obj.updateDynamic("FailedCount")(__v.asInstanceOf[js.Any]))
      InstallOverrideList.foreach(__v => __obj.updateDynamic("InstallOverrideList")(__v.asInstanceOf[js.Any]))
      InstalledCount.foreach(__v => __obj.updateDynamic("InstalledCount")(__v.asInstanceOf[js.Any]))
      InstalledOtherCount.foreach(__v => __obj.updateDynamic("InstalledOtherCount")(__v.asInstanceOf[js.Any]))
      InstalledPendingRebootCount.foreach(__v => __obj.updateDynamic("InstalledPendingRebootCount")(__v.asInstanceOf[js.Any]))
      InstalledRejectedCount.foreach(__v => __obj.updateDynamic("InstalledRejectedCount")(__v.asInstanceOf[js.Any]))
      LastNoRebootInstallOperationTime.foreach(__v => __obj.updateDynamic("LastNoRebootInstallOperationTime")(__v.asInstanceOf[js.Any]))
      MissingCount.foreach(__v => __obj.updateDynamic("MissingCount")(__v.asInstanceOf[js.Any]))
      NotApplicableCount.foreach(__v => __obj.updateDynamic("NotApplicableCount")(__v.asInstanceOf[js.Any]))
      OtherNonCompliantCount.foreach(__v => __obj.updateDynamic("OtherNonCompliantCount")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      RebootOption.foreach(__v => __obj.updateDynamic("RebootOption")(__v.asInstanceOf[js.Any]))
      SecurityNonCompliantCount.foreach(__v => __obj.updateDynamic("SecurityNonCompliantCount")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      UnreportedNotApplicableCount.foreach(__v => __obj.updateDynamic("UnreportedNotApplicableCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstancePatchState]
    }
  }

  /** Defines a filter used in <a>DescribeInstancePatchStatesForPatchGroup</a> to scope down the information returned by the API. \```Example```: To filter for all managed nodes in a patch group having more than three patches with a <code>FailedCount</code> status, use the following for the filter: * Value for <code>Key</code>: <code>FailedCount</code> * Value for <code>Type</code>: <code>GreaterThan</code> * Value for <code>Values</code>: <code>3</code>
    */
  @js.native
  trait InstancePatchStateFilter extends js.Object {
    var Key: InstancePatchStateFilterKey
    var Type: InstancePatchStateOperatorType
    var Values: InstancePatchStateFilterValues
  }

  object InstancePatchStateFilter {
    @inline
    def apply(
        Key: InstancePatchStateFilterKey,
        Type: InstancePatchStateOperatorType,
        Values: InstancePatchStateFilterValues
    ): InstancePatchStateFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstancePatchStateFilter]
    }
  }

  /** Specifies the inventory type and attribute for the aggregation execution.
    */
  @js.native
  trait InventoryAggregator extends js.Object {
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Expression: js.UndefOr[InventoryAggregatorExpression]
    var Groups: js.UndefOr[InventoryGroupList]
  }

  object InventoryAggregator {
    @inline
    def apply(
        Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
        Expression: js.UndefOr[InventoryAggregatorExpression] = js.undefined,
        Groups: js.UndefOr[InventoryGroupList] = js.undefined
    ): InventoryAggregator = {
      val __obj = js.Dynamic.literal()
      Aggregators.foreach(__v => __obj.updateDynamic("Aggregators")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryAggregator]
    }
  }

  /** Status information returned by the <code>DeleteInventory</code> operation.
    */
  @js.native
  trait InventoryDeletionStatusItem extends js.Object {
    var DeletionId: js.UndefOr[UUID]
    var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var LastStatus: js.UndefOr[InventoryDeletionStatus]
    var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage]
    var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  object InventoryDeletionStatusItem {
    @inline
    def apply(
        DeletionId: js.UndefOr[UUID] = js.undefined,
        DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.undefined,
        DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined,
        LastStatus: js.UndefOr[InventoryDeletionStatus] = js.undefined,
        LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.undefined,
        LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.undefined,
        TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): InventoryDeletionStatusItem = {
      val __obj = js.Dynamic.literal()
      DeletionId.foreach(__v => __obj.updateDynamic("DeletionId")(__v.asInstanceOf[js.Any]))
      DeletionStartTime.foreach(__v => __obj.updateDynamic("DeletionStartTime")(__v.asInstanceOf[js.Any]))
      DeletionSummary.foreach(__v => __obj.updateDynamic("DeletionSummary")(__v.asInstanceOf[js.Any]))
      LastStatus.foreach(__v => __obj.updateDynamic("LastStatus")(__v.asInstanceOf[js.Any]))
      LastStatusMessage.foreach(__v => __obj.updateDynamic("LastStatusMessage")(__v.asInstanceOf[js.Any]))
      LastStatusUpdateTime.foreach(__v => __obj.updateDynamic("LastStatusUpdateTime")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryDeletionStatusItem]
    }
  }

  /** Information about the delete operation.
    */
  @js.native
  trait InventoryDeletionSummary extends js.Object {
    var RemainingCount: js.UndefOr[RemainingCount]
    var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object InventoryDeletionSummary {
    @inline
    def apply(
        RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
        SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): InventoryDeletionSummary = {
      val __obj = js.Dynamic.literal()
      RemainingCount.foreach(__v => __obj.updateDynamic("RemainingCount")(__v.asInstanceOf[js.Any]))
      SummaryItems.foreach(__v => __obj.updateDynamic("SummaryItems")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryDeletionSummary]
    }
  }

  /** Either a count, remaining count, or a version number in a delete inventory summary.
    */
  @js.native
  trait InventoryDeletionSummaryItem extends js.Object {
    var Count: js.UndefOr[ResourceCount]
    var RemainingCount: js.UndefOr[RemainingCount]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
  }

  object InventoryDeletionSummaryItem {
    @inline
    def apply(
        Count: js.UndefOr[ResourceCount] = js.undefined,
        RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
        Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    ): InventoryDeletionSummaryItem = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      RemainingCount.foreach(__v => __obj.updateDynamic("RemainingCount")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryDeletionSummaryItem]
    }
  }

  /** One or more filters. Use a filter to return a more specific list of results.
    */
  @js.native
  trait InventoryFilter extends js.Object {
    var Key: InventoryFilterKey
    var Values: InventoryFilterValueList
    var Type: js.UndefOr[InventoryQueryOperatorType]
  }

  object InventoryFilter {
    @inline
    def apply(
        Key: InventoryFilterKey,
        Values: InventoryFilterValueList,
        Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined
    ): InventoryFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryFilter]
    }
  }

  /** A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  @js.native
  trait InventoryGroup extends js.Object {
    var Filters: InventoryFilterList
    var Name: InventoryGroupName
  }

  object InventoryGroup {
    @inline
    def apply(
        Filters: InventoryFilterList,
        Name: InventoryGroupName
    ): InventoryGroup = {
      val __obj = js.Dynamic.literal(
        "Filters" -> Filters.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InventoryGroup]
    }
  }

  /** Information collected from managed nodes based on your inventory policy document
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
    @inline
    def apply(
        CaptureTime: InventoryItemCaptureTime,
        SchemaVersion: InventoryItemSchemaVersion,
        TypeName: InventoryItemTypeName,
        Content: js.UndefOr[InventoryItemEntryList] = js.undefined,
        ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined,
        Context: js.UndefOr[InventoryItemContentContext] = js.undefined
    ): InventoryItem = {
      val __obj = js.Dynamic.literal(
        "CaptureTime" -> CaptureTime.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      ContentHash.foreach(__v => __obj.updateDynamic("ContentHash")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryItem]
    }
  }

  /** Attributes are the entries within the inventory item content. It contains name and value.
    */
  @js.native
  trait InventoryItemAttribute extends js.Object {
    var DataType: InventoryAttributeDataType
    var Name: InventoryItemAttributeName
  }

  object InventoryItemAttribute {
    @inline
    def apply(
        DataType: InventoryAttributeDataType,
        Name: InventoryItemAttributeName
    ): InventoryItemAttribute = {
      val __obj = js.Dynamic.literal(
        "DataType" -> DataType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InventoryItemAttribute]
    }
  }

  /** The inventory item schema definition. Users can use this to compose inventory query filters.
    */
  @js.native
  trait InventoryItemSchema extends js.Object {
    var Attributes: InventoryItemAttributeList
    var TypeName: InventoryItemTypeName
    var DisplayName: js.UndefOr[InventoryTypeDisplayName]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
  }

  object InventoryItemSchema {
    @inline
    def apply(
        Attributes: InventoryItemAttributeList,
        TypeName: InventoryItemTypeName,
        DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.undefined,
        Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    ): InventoryItemSchema = {
      val __obj = js.Dynamic.literal(
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryItemSchema]
    }
  }

  /** Inventory query results.
    */
  @js.native
  trait InventoryResultEntity extends js.Object {
    var Data: js.UndefOr[InventoryResultItemMap]
    var Id: js.UndefOr[InventoryResultEntityId]
  }

  object InventoryResultEntity {
    @inline
    def apply(
        Data: js.UndefOr[InventoryResultItemMap] = js.undefined,
        Id: js.UndefOr[InventoryResultEntityId] = js.undefined
    ): InventoryResultEntity = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryResultEntity]
    }
  }

  /** The inventory result item.
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
    @inline
    def apply(
        Content: InventoryItemEntryList,
        SchemaVersion: InventoryItemSchemaVersion,
        TypeName: InventoryItemTypeName,
        CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
        ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined
    ): InventoryResultItem = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      CaptureTime.foreach(__v => __obj.updateDynamic("CaptureTime")(__v.asInstanceOf[js.Any]))
      ContentHash.foreach(__v => __obj.updateDynamic("ContentHash")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryResultItem]
    }
  }

  @js.native
  trait LabelParameterVersionRequest extends js.Object {
    var Labels: ParameterLabelList
    var Name: PSParameterName
    var ParameterVersion: js.UndefOr[PSParameterVersion]
  }

  object LabelParameterVersionRequest {
    @inline
    def apply(
        Labels: ParameterLabelList,
        Name: PSParameterName,
        ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
    ): LabelParameterVersionRequest = {
      val __obj = js.Dynamic.literal(
        "Labels" -> Labels.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ParameterVersion.foreach(__v => __obj.updateDynamic("ParameterVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelParameterVersionRequest]
    }
  }

  @js.native
  trait LabelParameterVersionResult extends js.Object {
    var InvalidLabels: js.UndefOr[ParameterLabelList]
    var ParameterVersion: js.UndefOr[PSParameterVersion]
  }

  object LabelParameterVersionResult {
    @inline
    def apply(
        InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined,
        ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
    ): LabelParameterVersionResult = {
      val __obj = js.Dynamic.literal()
      InvalidLabels.foreach(__v => __obj.updateDynamic("InvalidLabels")(__v.asInstanceOf[js.Any]))
      ParameterVersion.foreach(__v => __obj.updateDynamic("ParameterVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelParameterVersionResult]
    }
  }

  @js.native
  trait ListAssociationVersionsRequest extends js.Object {
    var AssociationId: AssociationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationVersionsRequest {
    @inline
    def apply(
        AssociationId: AssociationId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationVersionsRequest]
    }
  }

  @js.native
  trait ListAssociationVersionsResult extends js.Object {
    var AssociationVersions: js.UndefOr[AssociationVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationVersionsResult {
    @inline
    def apply(
        AssociationVersions: js.UndefOr[AssociationVersionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationVersionsResult = {
      val __obj = js.Dynamic.literal()
      AssociationVersions.foreach(__v => __obj.updateDynamic("AssociationVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationVersionsResult]
    }
  }

  @js.native
  trait ListAssociationsRequest extends js.Object {
    var AssociationFilterList: js.UndefOr[AssociationFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationsRequest {
    @inline
    def apply(
        AssociationFilterList: js.UndefOr[AssociationFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      AssociationFilterList.foreach(__v => __obj.updateDynamic("AssociationFilterList")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsRequest]
    }
  }

  @js.native
  trait ListAssociationsResult extends js.Object {
    var Associations: js.UndefOr[AssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationsResult {
    @inline
    def apply(
        Associations: js.UndefOr[AssociationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsResult = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsResult]
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
    @inline
    def apply(
        CommandId: js.UndefOr[CommandId] = js.undefined,
        Details: js.UndefOr[Boolean] = js.undefined,
        Filters: js.UndefOr[CommandFilterList] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandInvocationsRequest = {
      val __obj = js.Dynamic.literal()
      CommandId.foreach(__v => __obj.updateDynamic("CommandId")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCommandInvocationsRequest]
    }
  }

  @js.native
  trait ListCommandInvocationsResult extends js.Object {
    var CommandInvocations: js.UndefOr[CommandInvocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandInvocationsResult {
    @inline
    def apply(
        CommandInvocations: js.UndefOr[CommandInvocationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandInvocationsResult = {
      val __obj = js.Dynamic.literal()
      CommandInvocations.foreach(__v => __obj.updateDynamic("CommandInvocations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCommandInvocationsResult]
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
    @inline
    def apply(
        CommandId: js.UndefOr[CommandId] = js.undefined,
        Filters: js.UndefOr[CommandFilterList] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandsRequest = {
      val __obj = js.Dynamic.literal()
      CommandId.foreach(__v => __obj.updateDynamic("CommandId")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCommandsRequest]
    }
  }

  @js.native
  trait ListCommandsResult extends js.Object {
    var Commands: js.UndefOr[CommandList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCommandsResult {
    @inline
    def apply(
        Commands: js.UndefOr[CommandList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandsResult = {
      val __obj = js.Dynamic.literal()
      Commands.foreach(__v => __obj.updateDynamic("Commands")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCommandsResult]
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
    @inline
    def apply(
        Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined,
        ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.undefined
    ): ListComplianceItemsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceIds.foreach(__v => __obj.updateDynamic("ResourceIds")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceItemsRequest]
    }
  }

  @js.native
  trait ListComplianceItemsResult extends js.Object {
    var ComplianceItems: js.UndefOr[ComplianceItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceItemsResult {
    @inline
    def apply(
        ComplianceItems: js.UndefOr[ComplianceItemList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComplianceItemsResult = {
      val __obj = js.Dynamic.literal()
      ComplianceItems.foreach(__v => __obj.updateDynamic("ComplianceItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceItemsResult]
    }
  }

  @js.native
  trait ListComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceSummariesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComplianceSummariesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceSummariesRequest]
    }
  }

  @js.native
  trait ListComplianceSummariesResult extends js.Object {
    var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComplianceSummariesResult {
    @inline
    def apply(
        ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComplianceSummariesResult = {
      val __obj = js.Dynamic.literal()
      ComplianceSummaryItems.foreach(__v => __obj.updateDynamic("ComplianceSummaryItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceSummariesResult]
    }
  }

  @js.native
  trait ListDocumentMetadataHistoryRequest extends js.Object {
    var Metadata: DocumentMetadataEnum
    var Name: DocumentName
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentMetadataHistoryRequest {
    @inline
    def apply(
        Metadata: DocumentMetadataEnum,
        Name: DocumentName,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentMetadataHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "Metadata" -> Metadata.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentMetadataHistoryRequest]
    }
  }

  @js.native
  trait ListDocumentMetadataHistoryResponse extends js.Object {
    var Author: js.UndefOr[DocumentAuthor]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Metadata: js.UndefOr[DocumentMetadataResponseInfo]
    var Name: js.UndefOr[DocumentName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentMetadataHistoryResponse {
    @inline
    def apply(
        Author: js.UndefOr[DocumentAuthor] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Metadata: js.UndefOr[DocumentMetadataResponseInfo] = js.undefined,
        Name: js.UndefOr[DocumentName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentMetadataHistoryResponse = {
      val __obj = js.Dynamic.literal()
      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentMetadataHistoryResponse]
    }
  }

  @js.native
  trait ListDocumentVersionsRequest extends js.Object {
    var Name: DocumentARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentVersionsRequest {
    @inline
    def apply(
        Name: DocumentARN,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentVersionsRequest]
    }
  }

  @js.native
  trait ListDocumentVersionsResult extends js.Object {
    var DocumentVersions: js.UndefOr[DocumentVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentVersionsResult {
    @inline
    def apply(
        DocumentVersions: js.UndefOr[DocumentVersionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentVersionsResult = {
      val __obj = js.Dynamic.literal()
      DocumentVersions.foreach(__v => __obj.updateDynamic("DocumentVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentVersionsResult]
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
    @inline
    def apply(
        DocumentFilterList: js.UndefOr[DocumentFilterList] = js.undefined,
        Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsRequest = {
      val __obj = js.Dynamic.literal()
      DocumentFilterList.foreach(__v => __obj.updateDynamic("DocumentFilterList")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentsRequest]
    }
  }

  @js.native
  trait ListDocumentsResult extends js.Object {
    var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDocumentsResult {
    @inline
    def apply(
        DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsResult = {
      val __obj = js.Dynamic.literal()
      DocumentIdentifiers.foreach(__v => __obj.updateDynamic("DocumentIdentifiers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentsResult]
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
    @inline
    def apply(
        InstanceId: InstanceId,
        TypeName: InventoryItemTypeName,
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInventoryEntriesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInventoryEntriesRequest]
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
    @inline
    def apply(
        CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
        Entries: js.UndefOr[InventoryItemEntryList] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
        TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): ListInventoryEntriesResult = {
      val __obj = js.Dynamic.literal()
      CaptureTime.foreach(__v => __obj.updateDynamic("CaptureTime")(__v.asInstanceOf[js.Any]))
      Entries.foreach(__v => __obj.updateDynamic("Entries")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInventoryEntriesResult]
    }
  }

  @js.native
  trait ListOpsItemEventsRequest extends js.Object {
    var Filters: js.UndefOr[OpsItemEventFilters]
    var MaxResults: js.UndefOr[OpsItemEventMaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListOpsItemEventsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[OpsItemEventFilters] = js.undefined,
        MaxResults: js.UndefOr[OpsItemEventMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListOpsItemEventsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpsItemEventsRequest]
    }
  }

  @js.native
  trait ListOpsItemEventsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Summaries: js.UndefOr[OpsItemEventSummaries]
  }

  object ListOpsItemEventsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Summaries: js.UndefOr[OpsItemEventSummaries] = js.undefined
    ): ListOpsItemEventsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpsItemEventsResponse]
    }
  }

  @js.native
  trait ListOpsItemRelatedItemsRequest extends js.Object {
    var Filters: js.UndefOr[OpsItemRelatedItemsFilters]
    var MaxResults: js.UndefOr[OpsItemRelatedItemsMaxResults]
    var NextToken: js.UndefOr[String]
    var OpsItemId: js.UndefOr[OpsItemId]
  }

  object ListOpsItemRelatedItemsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[OpsItemRelatedItemsFilters] = js.undefined,
        MaxResults: js.UndefOr[OpsItemRelatedItemsMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OpsItemId: js.UndefOr[OpsItemId] = js.undefined
    ): ListOpsItemRelatedItemsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpsItemRelatedItemsRequest]
    }
  }

  @js.native
  trait ListOpsItemRelatedItemsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Summaries: js.UndefOr[OpsItemRelatedItemSummaries]
  }

  object ListOpsItemRelatedItemsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Summaries: js.UndefOr[OpsItemRelatedItemSummaries] = js.undefined
    ): ListOpsItemRelatedItemsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpsItemRelatedItemsResponse]
    }
  }

  @js.native
  trait ListOpsMetadataRequest extends js.Object {
    var Filters: js.UndefOr[OpsMetadataFilterList]
    var MaxResults: js.UndefOr[ListOpsMetadataMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOpsMetadataRequest {
    @inline
    def apply(
        Filters: js.UndefOr[OpsMetadataFilterList] = js.undefined,
        MaxResults: js.UndefOr[ListOpsMetadataMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOpsMetadataRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpsMetadataRequest]
    }
  }

  @js.native
  trait ListOpsMetadataResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OpsMetadataList: js.UndefOr[OpsMetadataList]
  }

  object ListOpsMetadataResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OpsMetadataList: js.UndefOr[OpsMetadataList] = js.undefined
    ): ListOpsMetadataResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OpsMetadataList.foreach(__v => __obj.updateDynamic("OpsMetadataList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpsMetadataResult]
    }
  }

  @js.native
  trait ListResourceComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResourceComplianceSummariesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceComplianceSummariesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceComplianceSummariesRequest]
    }
  }

  @js.native
  trait ListResourceComplianceSummariesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList]
  }

  object ListResourceComplianceSummariesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined
    ): ListResourceComplianceSummariesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceComplianceSummaryItems.foreach(__v => __obj.updateDynamic("ResourceComplianceSummaryItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceComplianceSummariesResult]
    }
  }

  @js.native
  trait ListResourceDataSyncRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  object ListResourceDataSyncRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
    ): ListResourceDataSyncRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SyncType.foreach(__v => __obj.updateDynamic("SyncType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDataSyncRequest]
    }
  }

  @js.native
  trait ListResourceDataSyncResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList]
  }

  object ListResourceDataSyncResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined
    ): ListResourceDataSyncResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceDataSyncItems.foreach(__v => __obj.updateDynamic("ResourceDataSyncItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDataSyncResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceTypeForTagging
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /** Information about an Amazon Simple Storage Service (Amazon S3) bucket to write managed node-level logs to.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an Amazon Simple Storage Service (Amazon S3) bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Amazon Web Services Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    */
  @js.native
  trait LoggingInfo extends js.Object {
    var S3BucketName: S3BucketName
    var S3Region: S3Region
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object LoggingInfo {
    @inline
    def apply(
        S3BucketName: S3BucketName,
        S3Region: S3Region,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): LoggingInfo = {
      val __obj = js.Dynamic.literal(
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any],
        "S3Region" -> S3Region.asInstanceOf[js.Any]
      )

      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingInfo]
    }
  }

  /** The parameters for an <code>AUTOMATION</code> task type.
    */
  @js.native
  trait MaintenanceWindowAutomationParameters extends js.Object {
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Parameters: js.UndefOr[AutomationParameterMap]
  }

  object MaintenanceWindowAutomationParameters {
    @inline
    def apply(
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
    ): MaintenanceWindowAutomationParameters = {
      val __obj = js.Dynamic.literal()
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowAutomationParameters]
    }
  }

  /** Describes the information about an execution of a maintenance window.
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
    @inline
    def apply(
        EndTime: js.UndefOr[DateTime] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
        StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): MaintenanceWindowExecution = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowExecution]
    }
  }

  /** Information about a task execution performed as part of a maintenance window execution.
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
    @inline
    def apply(
        EndTime: js.UndefOr[DateTime] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
        StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
        TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined,
        TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined,
        TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined,
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): MaintenanceWindowExecutionTaskIdentity = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.updateDynamic("TaskExecutionId")(__v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.updateDynamic("TaskType")(__v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
    }
  }

  /** Describes the information about a task invocation for a particular target as part of a task execution performed as part of a maintenance window execution.
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
    @inline
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
        WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
    ): MaintenanceWindowExecutionTaskInvocationIdentity = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      InvocationId.foreach(__v => __obj.updateDynamic("InvocationId")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.updateDynamic("TaskExecutionId")(__v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.updateDynamic("TaskType")(__v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.updateDynamic("WindowExecutionId")(__v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.updateDynamic("WindowTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
    }
  }

  /** Filter used in the request. Supported filter keys depend on the API operation that includes the filter. API operations that use <code>MaintenanceWindowFilter&gt;</code> include the following: * <a>DescribeMaintenanceWindowExecutions</a> * <a>DescribeMaintenanceWindowExecutionTaskInvocations</a> * <a>DescribeMaintenanceWindowExecutionTasks</a> * <a>DescribeMaintenanceWindows</a> * <a>DescribeMaintenanceWindowTargets</a> * <a>DescribeMaintenanceWindowTasks</a>
    */
  @js.native
  trait MaintenanceWindowFilter extends js.Object {
    var Key: js.UndefOr[MaintenanceWindowFilterKey]
    var Values: js.UndefOr[MaintenanceWindowFilterValues]
  }

  object MaintenanceWindowFilter {
    @inline
    def apply(
        Key: js.UndefOr[MaintenanceWindowFilterKey] = js.undefined,
        Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined
    ): MaintenanceWindowFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowFilter]
    }
  }

  /** Information about the maintenance window.
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
    var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object MaintenanceWindowIdentity {
    @inline
    def apply(
        Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
        Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
        EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
        ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined,
        ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): MaintenanceWindowIdentity = {
      val __obj = js.Dynamic.literal()
      Cutoff.foreach(__v => __obj.updateDynamic("Cutoff")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextExecutionTime.foreach(__v => __obj.updateDynamic("NextExecutionTime")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      ScheduleOffset.foreach(__v => __obj.updateDynamic("ScheduleOffset")(__v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.updateDynamic("ScheduleTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowIdentity]
    }
  }

  /** The maintenance window to which the specified target belongs.
    */
  @js.native
  trait MaintenanceWindowIdentityForTarget extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object MaintenanceWindowIdentityForTarget {
    @inline
    def apply(
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): MaintenanceWindowIdentityForTarget = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowIdentityForTarget]
    }
  }

  /** The parameters for a <code>LAMBDA</code> task type. For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an Amazon Simple Storage Service (Amazon S3) bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Amazon Web Services Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>. <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>. For Lambda tasks, Systems Manager ignores any values specified for TaskParameters and LoggingInfo.
    */
  @js.native
  trait MaintenanceWindowLambdaParameters extends js.Object {
    var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext]
    var Payload: js.UndefOr[MaintenanceWindowLambdaPayload]
    var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier]
  }

  object MaintenanceWindowLambdaParameters {
    @inline
    def apply(
        ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.undefined,
        Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.undefined,
        Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.undefined
    ): MaintenanceWindowLambdaParameters = {
      val __obj = js.Dynamic.literal()
      ClientContext.foreach(__v => __obj.updateDynamic("ClientContext")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowLambdaParameters]
    }
  }

  /** The parameters for a <code>RUN_COMMAND</code> task type. For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an Amazon Simple Storage Service (Amazon S3) bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Amazon Web Services Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>. <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>. For <code>RUN_COMMAND</code> tasks, Systems Manager uses specified values for <code>TaskParameters</code> and <code>LoggingInfo</code> only if no
    * values are specified for <code>TaskInvocationParameters</code>.
    */
  @js.native
  trait MaintenanceWindowRunCommandParameters extends js.Object {
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig]
    var Comment: js.UndefOr[Comment]
    var DocumentHash: js.UndefOr[DocumentHash]
    var DocumentHashType: js.UndefOr[DocumentHashType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var NotificationConfig: js.UndefOr[NotificationConfig]
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var Parameters: js.UndefOr[Parameters]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds]
  }

  object MaintenanceWindowRunCommandParameters {
    @inline
    def apply(
        CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined,
        Comment: js.UndefOr[Comment] = js.undefined,
        DocumentHash: js.UndefOr[DocumentHash] = js.undefined,
        DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined,
        OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
        TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
    ): MaintenanceWindowRunCommandParameters = {
      val __obj = js.Dynamic.literal()
      CloudWatchOutputConfig.foreach(__v => __obj.updateDynamic("CloudWatchOutputConfig")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      DocumentHash.foreach(__v => __obj.updateDynamic("DocumentHash")(__v.asInstanceOf[js.Any]))
      DocumentHashType.foreach(__v => __obj.updateDynamic("DocumentHashType")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.updateDynamic("NotificationConfig")(__v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.updateDynamic("OutputS3BucketName")(__v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.updateDynamic("OutputS3KeyPrefix")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.updateDynamic("TimeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
    }
  }

  /** The parameters for a <code>STEP_FUNCTIONS</code> task. For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an Amazon Simple Storage Service (Amazon S3) bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Amazon Web Services Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>. <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>. For Step Functions tasks, Systems Manager ignores any values specified for <code>TaskParameters</code> and <code>LoggingInfo</code>.
    */
  @js.native
  trait MaintenanceWindowStepFunctionsParameters extends js.Object {
    var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput]
    var Name: js.UndefOr[MaintenanceWindowStepFunctionsName]
  }

  object MaintenanceWindowStepFunctionsParameters {
    @inline
    def apply(
        Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.undefined
    ): MaintenanceWindowStepFunctionsParameters = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
    }
  }

  /** The target registered with the maintenance window.
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
    @inline
    def apply(
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
        ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): MaintenanceWindowTarget = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.updateDynamic("WindowTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTarget]
    }
  }

  /** Information about a task defined for a maintenance window.
    */
  @js.native
  trait MaintenanceWindowTask extends js.Object {
    var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior]
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
    @inline
    def apply(
        CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined,
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
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): MaintenanceWindowTask = {
      val __obj = js.Dynamic.literal()
      CutoffBehavior.foreach(__v => __obj.updateDynamic("CutoffBehavior")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.updateDynamic("TaskParameters")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.updateDynamic("WindowTaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTask]
    }
  }

  /** The parameters for task execution.
    */
  @js.native
  trait MaintenanceWindowTaskInvocationParameters extends js.Object {
    var Automation: js.UndefOr[MaintenanceWindowAutomationParameters]
    var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters]
    var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters]
    var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters]
  }

  object MaintenanceWindowTaskInvocationParameters {
    @inline
    def apply(
        Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.undefined,
        Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.undefined,
        RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.undefined,
        StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.undefined
    ): MaintenanceWindowTaskInvocationParameters = {
      val __obj = js.Dynamic.literal()
      Automation.foreach(__v => __obj.updateDynamic("Automation")(__v.asInstanceOf[js.Any]))
      Lambda.foreach(__v => __obj.updateDynamic("Lambda")(__v.asInstanceOf[js.Any]))
      RunCommand.foreach(__v => __obj.updateDynamic("RunCommand")(__v.asInstanceOf[js.Any]))
      StepFunctions.foreach(__v => __obj.updateDynamic("StepFunctions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTaskInvocationParameters]
    }
  }

  /** Defines the values for a task parameter.
    */
  @js.native
  trait MaintenanceWindowTaskParameterValueExpression extends js.Object {
    var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList]
  }

  object MaintenanceWindowTaskParameterValueExpression {
    @inline
    def apply(
        Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.undefined
    ): MaintenanceWindowTaskParameterValueExpression = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
    }
  }

  /** Metadata to assign to an Application Manager application.
    */
  @js.native
  trait MetadataValue extends js.Object {
    var Value: js.UndefOr[MetadataValueString]
  }

  object MetadataValue {
    @inline
    def apply(
        Value: js.UndefOr[MetadataValueString] = js.undefined
    ): MetadataValue = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetadataValue]
    }
  }

  @js.native
  trait ModifyDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
    var AccountIdsToAdd: js.UndefOr[AccountIdList]
    var AccountIdsToRemove: js.UndefOr[AccountIdList]
    var SharedDocumentVersion: js.UndefOr[SharedDocumentVersion]
  }

  object ModifyDocumentPermissionRequest {
    @inline
    def apply(
        Name: DocumentName,
        PermissionType: DocumentPermissionType,
        AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined,
        AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined,
        SharedDocumentVersion: js.UndefOr[SharedDocumentVersion] = js.undefined
    ): ModifyDocumentPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any]
      )

      AccountIdsToAdd.foreach(__v => __obj.updateDynamic("AccountIdsToAdd")(__v.asInstanceOf[js.Any]))
      AccountIdsToRemove.foreach(__v => __obj.updateDynamic("AccountIdsToRemove")(__v.asInstanceOf[js.Any]))
      SharedDocumentVersion.foreach(__v => __obj.updateDynamic("SharedDocumentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDocumentPermissionRequest]
    }
  }

  @js.native
  trait ModifyDocumentPermissionResponse extends js.Object

  object ModifyDocumentPermissionResponse {
    @inline
    def apply(): ModifyDocumentPermissionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyDocumentPermissionResponse]
    }
  }

  /** A summary of resources that aren't compliant. The summary is organized according to resource type.
    */
  @js.native
  trait NonCompliantSummary extends js.Object {
    var NonCompliantCount: js.UndefOr[ComplianceSummaryCount]
    var SeveritySummary: js.UndefOr[SeveritySummary]
  }

  object NonCompliantSummary {
    @inline
    def apply(
        NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined
    ): NonCompliantSummary = {
      val __obj = js.Dynamic.literal()
      NonCompliantCount.foreach(__v => __obj.updateDynamic("NonCompliantCount")(__v.asInstanceOf[js.Any]))
      SeveritySummary.foreach(__v => __obj.updateDynamic("SeveritySummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NonCompliantSummary]
    }
  }

  /** Configurations for sending notifications.
    */
  @js.native
  trait NotificationConfig extends js.Object {
    var NotificationArn: js.UndefOr[NotificationArn]
    var NotificationEvents: js.UndefOr[NotificationEventList]
    var NotificationType: js.UndefOr[NotificationType]
  }

  object NotificationConfig {
    @inline
    def apply(
        NotificationArn: js.UndefOr[NotificationArn] = js.undefined,
        NotificationEvents: js.UndefOr[NotificationEventList] = js.undefined,
        NotificationType: js.UndefOr[NotificationType] = js.undefined
    ): NotificationConfig = {
      val __obj = js.Dynamic.literal()
      NotificationArn.foreach(__v => __obj.updateDynamic("NotificationArn")(__v.asInstanceOf[js.Any]))
      NotificationEvents.foreach(__v => __obj.updateDynamic("NotificationEvents")(__v.asInstanceOf[js.Any]))
      NotificationType.foreach(__v => __obj.updateDynamic("NotificationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfig]
    }
  }

  /** One or more aggregators for viewing counts of OpsData using different dimensions such as <code>Source</code>, <code>CreatedTime</code>, or <code>Source and CreatedTime</code>, to name a few.
    */
  @js.native
  trait OpsAggregator extends js.Object {
    var AggregatorType: js.UndefOr[OpsAggregatorType]
    var Aggregators: js.UndefOr[OpsAggregatorList]
    var AttributeName: js.UndefOr[OpsDataAttributeName]
    var Filters: js.UndefOr[OpsFilterList]
    var TypeName: js.UndefOr[OpsDataTypeName]
    var Values: js.UndefOr[OpsAggregatorValueMap]
  }

  object OpsAggregator {
    @inline
    def apply(
        AggregatorType: js.UndefOr[OpsAggregatorType] = js.undefined,
        Aggregators: js.UndefOr[OpsAggregatorList] = js.undefined,
        AttributeName: js.UndefOr[OpsDataAttributeName] = js.undefined,
        Filters: js.UndefOr[OpsFilterList] = js.undefined,
        TypeName: js.UndefOr[OpsDataTypeName] = js.undefined,
        Values: js.UndefOr[OpsAggregatorValueMap] = js.undefined
    ): OpsAggregator = {
      val __obj = js.Dynamic.literal()
      AggregatorType.foreach(__v => __obj.updateDynamic("AggregatorType")(__v.asInstanceOf[js.Any]))
      Aggregators.foreach(__v => __obj.updateDynamic("Aggregators")(__v.asInstanceOf[js.Any]))
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsAggregator]
    }
  }

  /** The result of the query.
    */
  @js.native
  trait OpsEntity extends js.Object {
    var Data: js.UndefOr[OpsEntityItemMap]
    var Id: js.UndefOr[OpsEntityId]
  }

  object OpsEntity {
    @inline
    def apply(
        Data: js.UndefOr[OpsEntityItemMap] = js.undefined,
        Id: js.UndefOr[OpsEntityId] = js.undefined
    ): OpsEntity = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsEntity]
    }
  }

  /** The OpsData summary.
    */
  @js.native
  trait OpsEntityItem extends js.Object {
    var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime]
    var Content: js.UndefOr[OpsEntityItemEntryList]
  }

  object OpsEntityItem {
    @inline
    def apply(
        CaptureTime: js.UndefOr[OpsEntityItemCaptureTime] = js.undefined,
        Content: js.UndefOr[OpsEntityItemEntryList] = js.undefined
    ): OpsEntityItem = {
      val __obj = js.Dynamic.literal()
      CaptureTime.foreach(__v => __obj.updateDynamic("CaptureTime")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsEntityItem]
    }
  }

  /** A filter for viewing OpsData summaries.
    */
  @js.native
  trait OpsFilter extends js.Object {
    var Key: OpsFilterKey
    var Values: OpsFilterValueList
    var Type: js.UndefOr[OpsFilterOperatorType]
  }

  object OpsFilter {
    @inline
    def apply(
        Key: OpsFilterKey,
        Values: OpsFilterValueList,
        Type: js.UndefOr[OpsFilterOperatorType] = js.undefined
    ): OpsFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsFilter]
    }
  }

  /** Operations engineers and IT professionals use Amazon Web Services Systems Manager OpsCenter to view, investigate, and remediate operational work items (OpsItems) impacting the performance and health of their Amazon Web Services resources. OpsCenter is integrated with Amazon EventBridge and Amazon CloudWatch. This means you can configure these services to automatically create an OpsItem in OpsCenter when a CloudWatch alarm enters the ALARM state or when EventBridge processes an event from any Amazon Web Services service that publishes events. Configuring Amazon CloudWatch alarms and EventBridge events to automatically create OpsItems allows you to quickly diagnose and remediate issues with Amazon Web Services resources from a single console. To help you diagnose issues, each OpsItem includes contextually relevant information such as the name and ID of the Amazon Web Services resource that generated the OpsItem, alarm or event details, alarm history, and an alarm timeline graph.
    * For the Amazon Web Services resource, OpsCenter aggregates information from Config, CloudTrail logs, and EventBridge, so you don't have to navigate across multiple console pages during your investigation. For more information, see [[https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html|OpsCenter]] in the <i>Amazon Web Services Systems Manager User Guide</i>.
    */
  @js.native
  trait OpsItem extends js.Object {
    var ActualEndTime: js.UndefOr[DateTime]
    var ActualStartTime: js.UndefOr[DateTime]
    var Category: js.UndefOr[OpsItemCategory]
    var CreatedBy: js.UndefOr[String]
    var CreatedTime: js.UndefOr[DateTime]
    var Description: js.UndefOr[OpsItemDescription]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[DateTime]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OpsItemId: js.UndefOr[OpsItemId]
    var OpsItemType: js.UndefOr[OpsItemType]
    var PlannedEndTime: js.UndefOr[DateTime]
    var PlannedStartTime: js.UndefOr[DateTime]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Source: js.UndefOr[OpsItemSource]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
    var Version: js.UndefOr[String]
  }

  object OpsItem {
    @inline
    def apply(
        ActualEndTime: js.UndefOr[DateTime] = js.undefined,
        ActualStartTime: js.UndefOr[DateTime] = js.undefined,
        Category: js.UndefOr[OpsItemCategory] = js.undefined,
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[OpsItemDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[String] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        Notifications: js.UndefOr[OpsItemNotifications] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OpsItemId: js.UndefOr[OpsItemId] = js.undefined,
        OpsItemType: js.UndefOr[OpsItemType] = js.undefined,
        PlannedEndTime: js.UndefOr[DateTime] = js.undefined,
        PlannedStartTime: js.UndefOr[DateTime] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined,
        Severity: js.UndefOr[OpsItemSeverity] = js.undefined,
        Source: js.UndefOr[OpsItemSource] = js.undefined,
        Status: js.UndefOr[OpsItemStatus] = js.undefined,
        Title: js.UndefOr[OpsItemTitle] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): OpsItem = {
      val __obj = js.Dynamic.literal()
      ActualEndTime.foreach(__v => __obj.updateDynamic("ActualEndTime")(__v.asInstanceOf[js.Any]))
      ActualStartTime.foreach(__v => __obj.updateDynamic("ActualStartTime")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.updateDynamic("OperationalData")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      OpsItemType.foreach(__v => __obj.updateDynamic("OpsItemType")(__v.asInstanceOf[js.Any]))
      PlannedEndTime.foreach(__v => __obj.updateDynamic("PlannedEndTime")(__v.asInstanceOf[js.Any]))
      PlannedStartTime.foreach(__v => __obj.updateDynamic("PlannedStartTime")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RelatedOpsItems.foreach(__v => __obj.updateDynamic("RelatedOpsItems")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItem]
    }
  }

  /** An object that defines the value of the key and its type in the OperationalData map.
    */
  @js.native
  trait OpsItemDataValue extends js.Object {
    var Type: js.UndefOr[OpsItemDataType]
    var Value: js.UndefOr[OpsItemDataValueString]
  }

  object OpsItemDataValue {
    @inline
    def apply(
        Type: js.UndefOr[OpsItemDataType] = js.undefined,
        Value: js.UndefOr[OpsItemDataValueString] = js.undefined
    ): OpsItemDataValue = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemDataValue]
    }
  }

  /** Describes a filter for a specific list of OpsItem events. You can filter event information by using tags. You specify tags by using a key-value pair mapping.
    */
  @js.native
  trait OpsItemEventFilter extends js.Object {
    var Key: OpsItemEventFilterKey
    var Operator: OpsItemEventFilterOperator
    var Values: OpsItemEventFilterValues
  }

  object OpsItemEventFilter {
    @inline
    def apply(
        Key: OpsItemEventFilterKey,
        Operator: OpsItemEventFilterOperator,
        Values: OpsItemEventFilterValues
    ): OpsItemEventFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpsItemEventFilter]
    }
  }

  /** Summary information about an OpsItem event or that associated an OpsItem with a related item.
    */
  @js.native
  trait OpsItemEventSummary extends js.Object {
    var CreatedBy: js.UndefOr[OpsItemIdentity]
    var CreatedTime: js.UndefOr[DateTime]
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var OpsItemId: js.UndefOr[String]
    var Source: js.UndefOr[String]
  }

  object OpsItemEventSummary {
    @inline
    def apply(
        CreatedBy: js.UndefOr[OpsItemIdentity] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        Detail: js.UndefOr[String] = js.undefined,
        DetailType: js.UndefOr[String] = js.undefined,
        EventId: js.UndefOr[String] = js.undefined,
        OpsItemId: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): OpsItemEventSummary = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Detail.foreach(__v => __obj.updateDynamic("Detail")(__v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.updateDynamic("DetailType")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemEventSummary]
    }
  }

  /** Describes an OpsItem filter.
    */
  @js.native
  trait OpsItemFilter extends js.Object {
    var Key: OpsItemFilterKey
    var Operator: OpsItemFilterOperator
    var Values: OpsItemFilterValues
  }

  object OpsItemFilter {
    @inline
    def apply(
        Key: OpsItemFilterKey,
        Operator: OpsItemFilterOperator,
        Values: OpsItemFilterValues
    ): OpsItemFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpsItemFilter]
    }
  }

  /** Information about the user or resource that created an OpsItem event.
    */
  @js.native
  trait OpsItemIdentity extends js.Object {
    var Arn: js.UndefOr[String]
  }

  object OpsItemIdentity {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined
    ): OpsItemIdentity = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemIdentity]
    }
  }

  /** A notification about the OpsItem.
    */
  @js.native
  trait OpsItemNotification extends js.Object {
    var Arn: js.UndefOr[String]
  }

  object OpsItemNotification {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined
    ): OpsItemNotification = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemNotification]
    }
  }

  /** Summary information about related-item resources for an OpsItem.
    */
  @js.native
  trait OpsItemRelatedItemSummary extends js.Object {
    var AssociationId: js.UndefOr[OpsItemRelatedItemAssociationId]
    var AssociationType: js.UndefOr[OpsItemRelatedItemAssociationType]
    var CreatedBy: js.UndefOr[OpsItemIdentity]
    var CreatedTime: js.UndefOr[DateTime]
    var LastModifiedBy: js.UndefOr[OpsItemIdentity]
    var LastModifiedTime: js.UndefOr[DateTime]
    var OpsItemId: js.UndefOr[OpsItemId]
    var ResourceType: js.UndefOr[OpsItemRelatedItemAssociationResourceType]
    var ResourceUri: js.UndefOr[OpsItemRelatedItemAssociationResourceUri]
  }

  object OpsItemRelatedItemSummary {
    @inline
    def apply(
        AssociationId: js.UndefOr[OpsItemRelatedItemAssociationId] = js.undefined,
        AssociationType: js.UndefOr[OpsItemRelatedItemAssociationType] = js.undefined,
        CreatedBy: js.UndefOr[OpsItemIdentity] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        LastModifiedBy: js.UndefOr[OpsItemIdentity] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        OpsItemId: js.UndefOr[OpsItemId] = js.undefined,
        ResourceType: js.UndefOr[OpsItemRelatedItemAssociationResourceType] = js.undefined,
        ResourceUri: js.UndefOr[OpsItemRelatedItemAssociationResourceUri] = js.undefined
    ): OpsItemRelatedItemSummary = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      AssociationType.foreach(__v => __obj.updateDynamic("AssociationType")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      ResourceUri.foreach(__v => __obj.updateDynamic("ResourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemRelatedItemSummary]
    }
  }

  /** Describes a filter for a specific list of related-item resources.
    */
  @js.native
  trait OpsItemRelatedItemsFilter extends js.Object {
    var Key: OpsItemRelatedItemsFilterKey
    var Operator: OpsItemRelatedItemsFilterOperator
    var Values: OpsItemRelatedItemsFilterValues
  }

  object OpsItemRelatedItemsFilter {
    @inline
    def apply(
        Key: OpsItemRelatedItemsFilterKey,
        Operator: OpsItemRelatedItemsFilterOperator,
        Values: OpsItemRelatedItemsFilterValues
    ): OpsItemRelatedItemsFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpsItemRelatedItemsFilter]
    }
  }

  /** A count of OpsItems.
    */
  @js.native
  trait OpsItemSummary extends js.Object {
    var ActualEndTime: js.UndefOr[DateTime]
    var ActualStartTime: js.UndefOr[DateTime]
    var Category: js.UndefOr[OpsItemCategory]
    var CreatedBy: js.UndefOr[String]
    var CreatedTime: js.UndefOr[DateTime]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[DateTime]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OpsItemId: js.UndefOr[OpsItemId]
    var OpsItemType: js.UndefOr[OpsItemType]
    var PlannedEndTime: js.UndefOr[DateTime]
    var PlannedStartTime: js.UndefOr[DateTime]
    var Priority: js.UndefOr[OpsItemPriority]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Source: js.UndefOr[OpsItemSource]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
  }

  object OpsItemSummary {
    @inline
    def apply(
        ActualEndTime: js.UndefOr[DateTime] = js.undefined,
        ActualStartTime: js.UndefOr[DateTime] = js.undefined,
        Category: js.UndefOr[OpsItemCategory] = js.undefined,
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        LastModifiedBy: js.UndefOr[String] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OpsItemId: js.UndefOr[OpsItemId] = js.undefined,
        OpsItemType: js.UndefOr[OpsItemType] = js.undefined,
        PlannedEndTime: js.UndefOr[DateTime] = js.undefined,
        PlannedStartTime: js.UndefOr[DateTime] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        Severity: js.UndefOr[OpsItemSeverity] = js.undefined,
        Source: js.UndefOr[OpsItemSource] = js.undefined,
        Status: js.UndefOr[OpsItemStatus] = js.undefined,
        Title: js.UndefOr[OpsItemTitle] = js.undefined
    ): OpsItemSummary = {
      val __obj = js.Dynamic.literal()
      ActualEndTime.foreach(__v => __obj.updateDynamic("ActualEndTime")(__v.asInstanceOf[js.Any]))
      ActualStartTime.foreach(__v => __obj.updateDynamic("ActualStartTime")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.updateDynamic("OperationalData")(__v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.updateDynamic("OpsItemId")(__v.asInstanceOf[js.Any]))
      OpsItemType.foreach(__v => __obj.updateDynamic("OpsItemType")(__v.asInstanceOf[js.Any]))
      PlannedEndTime.foreach(__v => __obj.updateDynamic("PlannedEndTime")(__v.asInstanceOf[js.Any]))
      PlannedStartTime.foreach(__v => __obj.updateDynamic("PlannedStartTime")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemSummary]
    }
  }

  /** Operational metadata for an application in Application Manager.
    */
  @js.native
  trait OpsMetadata extends js.Object {
    var CreationDate: js.UndefOr[DateTime]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var OpsMetadataArn: js.UndefOr[OpsMetadataArn]
    var ResourceId: js.UndefOr[OpsMetadataResourceId]
  }

  object OpsMetadata {
    @inline
    def apply(
        CreationDate: js.UndefOr[DateTime] = js.undefined,
        LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
        LastModifiedUser: js.UndefOr[String] = js.undefined,
        OpsMetadataArn: js.UndefOr[OpsMetadataArn] = js.undefined,
        ResourceId: js.UndefOr[OpsMetadataResourceId] = js.undefined
    ): OpsMetadata = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.updateDynamic("LastModifiedUser")(__v.asInstanceOf[js.Any]))
      OpsMetadataArn.foreach(__v => __obj.updateDynamic("OpsMetadataArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsMetadata]
    }
  }

  /** A filter to limit the number of OpsMetadata objects displayed.
    */
  @js.native
  trait OpsMetadataFilter extends js.Object {
    var Key: OpsMetadataFilterKey
    var Values: OpsMetadataFilterValueList
  }

  object OpsMetadataFilter {
    @inline
    def apply(
        Key: OpsMetadataFilterKey,
        Values: OpsMetadataFilterValueList
    ): OpsMetadataFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpsMetadataFilter]
    }
  }

  /** The OpsItem data type to return.
    */
  @js.native
  trait OpsResultAttribute extends js.Object {
    var TypeName: OpsDataTypeName
  }

  object OpsResultAttribute {
    @inline
    def apply(
        TypeName: OpsDataTypeName
    ): OpsResultAttribute = {
      val __obj = js.Dynamic.literal(
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpsResultAttribute]
    }
  }

  /** Information about the source where the association execution details are stored.
    */
  @js.native
  trait OutputSource extends js.Object {
    var OutputSourceId: js.UndefOr[OutputSourceId]
    var OutputSourceType: js.UndefOr[OutputSourceType]
  }

  object OutputSource {
    @inline
    def apply(
        OutputSourceId: js.UndefOr[OutputSourceId] = js.undefined,
        OutputSourceType: js.UndefOr[OutputSourceType] = js.undefined
    ): OutputSource = {
      val __obj = js.Dynamic.literal()
      OutputSourceId.foreach(__v => __obj.updateDynamic("OutputSourceId")(__v.asInstanceOf[js.Any]))
      OutputSourceType.foreach(__v => __obj.updateDynamic("OutputSourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSource]
    }
  }

  /** An Amazon Web Services Systems Manager parameter in Parameter Store.
    */
  @js.native
  trait Parameter extends js.Object {
    var ARN: js.UndefOr[String]
    var DataType: js.UndefOr[ParameterDataType]
    var LastModifiedDate: js.UndefOr[DateTime]
    var Name: js.UndefOr[PSParameterName]
    var Selector: js.UndefOr[PSParameterSelector]
    var SourceResult: js.UndefOr[String]
    var Type: js.UndefOr[ParameterType]
    var Value: js.UndefOr[PSParameterValue]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object Parameter {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        DataType: js.UndefOr[ParameterDataType] = js.undefined,
        LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
        Name: js.UndefOr[PSParameterName] = js.undefined,
        Selector: js.UndefOr[PSParameterSelector] = js.undefined,
        SourceResult: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[ParameterType] = js.undefined,
        Value: js.UndefOr[PSParameterValue] = js.undefined,
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): Parameter = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Selector.foreach(__v => __obj.updateDynamic("Selector")(__v.asInstanceOf[js.Any]))
      SourceResult.foreach(__v => __obj.updateDynamic("SourceResult")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
  }

  /** Information about parameter usage.
    */
  @js.native
  trait ParameterHistory extends js.Object {
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var DataType: js.UndefOr[ParameterDataType]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var Labels: js.UndefOr[ParameterLabelList]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var Name: js.UndefOr[PSParameterName]
    var Policies: js.UndefOr[ParameterPolicyList]
    var Tier: js.UndefOr[ParameterTier]
    var Type: js.UndefOr[ParameterType]
    var Value: js.UndefOr[PSParameterValue]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object ParameterHistory {
    @inline
    def apply(
        AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
        DataType: js.UndefOr[ParameterDataType] = js.undefined,
        Description: js.UndefOr[ParameterDescription] = js.undefined,
        KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
        Labels: js.UndefOr[ParameterLabelList] = js.undefined,
        LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
        LastModifiedUser: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[PSParameterName] = js.undefined,
        Policies: js.UndefOr[ParameterPolicyList] = js.undefined,
        Tier: js.UndefOr[ParameterTier] = js.undefined,
        Type: js.UndefOr[ParameterType] = js.undefined,
        Value: js.UndefOr[PSParameterValue] = js.undefined,
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): ParameterHistory = {
      val __obj = js.Dynamic.literal()
      AllowedPattern.foreach(__v => __obj.updateDynamic("AllowedPattern")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.updateDynamic("LastModifiedUser")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterHistory]
    }
  }

  /** One or more policies assigned to a parameter.
    */
  @js.native
  trait ParameterInlinePolicy extends js.Object {
    var PolicyStatus: js.UndefOr[String]
    var PolicyText: js.UndefOr[String]
    var PolicyType: js.UndefOr[String]
  }

  object ParameterInlinePolicy {
    @inline
    def apply(
        PolicyStatus: js.UndefOr[String] = js.undefined,
        PolicyText: js.UndefOr[String] = js.undefined,
        PolicyType: js.UndefOr[String] = js.undefined
    ): ParameterInlinePolicy = {
      val __obj = js.Dynamic.literal()
      PolicyStatus.foreach(__v => __obj.updateDynamic("PolicyStatus")(__v.asInstanceOf[js.Any]))
      PolicyText.foreach(__v => __obj.updateDynamic("PolicyText")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterInlinePolicy]
    }
  }

  /** Metadata includes information like the ARN of the last user and the date/time the parameter was last used.
    */
  @js.native
  trait ParameterMetadata extends js.Object {
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var DataType: js.UndefOr[ParameterDataType]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var Name: js.UndefOr[PSParameterName]
    var Policies: js.UndefOr[ParameterPolicyList]
    var Tier: js.UndefOr[ParameterTier]
    var Type: js.UndefOr[ParameterType]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object ParameterMetadata {
    @inline
    def apply(
        AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
        DataType: js.UndefOr[ParameterDataType] = js.undefined,
        Description: js.UndefOr[ParameterDescription] = js.undefined,
        KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
        LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
        LastModifiedUser: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[PSParameterName] = js.undefined,
        Policies: js.UndefOr[ParameterPolicyList] = js.undefined,
        Tier: js.UndefOr[ParameterTier] = js.undefined,
        Type: js.UndefOr[ParameterType] = js.undefined,
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): ParameterMetadata = {
      val __obj = js.Dynamic.literal()
      AllowedPattern.foreach(__v => __obj.updateDynamic("AllowedPattern")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.updateDynamic("LastModifiedUser")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterMetadata]
    }
  }

  /** One or more filters. Use a filter to return a more specific list of results.
    */
  @js.native
  trait ParameterStringFilter extends js.Object {
    var Key: ParameterStringFilterKey
    var Option: js.UndefOr[ParameterStringQueryOption]
    var Values: js.UndefOr[ParameterStringFilterValueList]
  }

  object ParameterStringFilter {
    @inline
    def apply(
        Key: ParameterStringFilterKey,
        Option: js.UndefOr[ParameterStringQueryOption] = js.undefined,
        Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined
    ): ParameterStringFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Option.foreach(__v => __obj.updateDynamic("Option")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterStringFilter]
    }
  }

  /** This data type is deprecated. Instead, use <a>ParameterStringFilter</a>.
    */
  @js.native
  trait ParametersFilter extends js.Object {
    var Key: ParametersFilterKey
    var Values: ParametersFilterValueList
  }

  object ParametersFilter {
    @inline
    def apply(
        Key: ParametersFilterKey,
        Values: ParametersFilterValueList
    ): ParametersFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ParametersFilter]
    }
  }

  /** Represents metadata about a patch.
    */
  @js.native
  trait Patch extends js.Object {
    var AdvisoryIds: js.UndefOr[PatchAdvisoryIdList]
    var Arch: js.UndefOr[PatchArch]
    var BugzillaIds: js.UndefOr[PatchBugzillaIdList]
    var CVEIds: js.UndefOr[PatchCVEIdList]
    var Classification: js.UndefOr[PatchClassification]
    var ContentUrl: js.UndefOr[PatchContentUrl]
    var Description: js.UndefOr[PatchDescription]
    var Epoch: js.UndefOr[PatchEpoch]
    var Id: js.UndefOr[PatchId]
    var KbNumber: js.UndefOr[PatchKbNumber]
    var Language: js.UndefOr[PatchLanguage]
    var MsrcNumber: js.UndefOr[PatchMsrcNumber]
    var MsrcSeverity: js.UndefOr[PatchMsrcSeverity]
    var Name: js.UndefOr[PatchName]
    var Product: js.UndefOr[PatchProduct]
    var ProductFamily: js.UndefOr[PatchProductFamily]
    var Release: js.UndefOr[PatchRelease]
    var ReleaseDate: js.UndefOr[DateTime]
    var Repository: js.UndefOr[PatchRepository]
    var Severity: js.UndefOr[PatchSeverity]
    var Title: js.UndefOr[PatchTitle]
    var Vendor: js.UndefOr[PatchVendor]
    var Version: js.UndefOr[PatchVersion]
  }

  object Patch {
    @inline
    def apply(
        AdvisoryIds: js.UndefOr[PatchAdvisoryIdList] = js.undefined,
        Arch: js.UndefOr[PatchArch] = js.undefined,
        BugzillaIds: js.UndefOr[PatchBugzillaIdList] = js.undefined,
        CVEIds: js.UndefOr[PatchCVEIdList] = js.undefined,
        Classification: js.UndefOr[PatchClassification] = js.undefined,
        ContentUrl: js.UndefOr[PatchContentUrl] = js.undefined,
        Description: js.UndefOr[PatchDescription] = js.undefined,
        Epoch: js.UndefOr[PatchEpoch] = js.undefined,
        Id: js.UndefOr[PatchId] = js.undefined,
        KbNumber: js.UndefOr[PatchKbNumber] = js.undefined,
        Language: js.UndefOr[PatchLanguage] = js.undefined,
        MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.undefined,
        MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.undefined,
        Name: js.UndefOr[PatchName] = js.undefined,
        Product: js.UndefOr[PatchProduct] = js.undefined,
        ProductFamily: js.UndefOr[PatchProductFamily] = js.undefined,
        Release: js.UndefOr[PatchRelease] = js.undefined,
        ReleaseDate: js.UndefOr[DateTime] = js.undefined,
        Repository: js.UndefOr[PatchRepository] = js.undefined,
        Severity: js.UndefOr[PatchSeverity] = js.undefined,
        Title: js.UndefOr[PatchTitle] = js.undefined,
        Vendor: js.UndefOr[PatchVendor] = js.undefined,
        Version: js.UndefOr[PatchVersion] = js.undefined
    ): Patch = {
      val __obj = js.Dynamic.literal()
      AdvisoryIds.foreach(__v => __obj.updateDynamic("AdvisoryIds")(__v.asInstanceOf[js.Any]))
      Arch.foreach(__v => __obj.updateDynamic("Arch")(__v.asInstanceOf[js.Any]))
      BugzillaIds.foreach(__v => __obj.updateDynamic("BugzillaIds")(__v.asInstanceOf[js.Any]))
      CVEIds.foreach(__v => __obj.updateDynamic("CVEIds")(__v.asInstanceOf[js.Any]))
      Classification.foreach(__v => __obj.updateDynamic("Classification")(__v.asInstanceOf[js.Any]))
      ContentUrl.foreach(__v => __obj.updateDynamic("ContentUrl")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Epoch.foreach(__v => __obj.updateDynamic("Epoch")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      KbNumber.foreach(__v => __obj.updateDynamic("KbNumber")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      MsrcNumber.foreach(__v => __obj.updateDynamic("MsrcNumber")(__v.asInstanceOf[js.Any]))
      MsrcSeverity.foreach(__v => __obj.updateDynamic("MsrcSeverity")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.updateDynamic("Product")(__v.asInstanceOf[js.Any]))
      ProductFamily.foreach(__v => __obj.updateDynamic("ProductFamily")(__v.asInstanceOf[js.Any]))
      Release.foreach(__v => __obj.updateDynamic("Release")(__v.asInstanceOf[js.Any]))
      ReleaseDate.foreach(__v => __obj.updateDynamic("ReleaseDate")(__v.asInstanceOf[js.Any]))
      Repository.foreach(__v => __obj.updateDynamic("Repository")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Vendor.foreach(__v => __obj.updateDynamic("Vendor")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Patch]
    }
  }

  /** Defines the basic information about a patch baseline.
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
    @inline
    def apply(
        BaselineDescription: js.UndefOr[BaselineDescription] = js.undefined,
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        BaselineName: js.UndefOr[BaselineName] = js.undefined,
        DefaultBaseline: js.UndefOr[DefaultBaseline] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): PatchBaselineIdentity = {
      val __obj = js.Dynamic.literal()
      BaselineDescription.foreach(__v => __obj.updateDynamic("BaselineDescription")(__v.asInstanceOf[js.Any]))
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      BaselineName.foreach(__v => __obj.updateDynamic("BaselineName")(__v.asInstanceOf[js.Any]))
      DefaultBaseline.foreach(__v => __obj.updateDynamic("DefaultBaseline")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchBaselineIdentity]
    }
  }

  /** Information about the state of a patch on a particular managed node as it relates to the patch baseline used to patch the node.
    */
  @js.native
  trait PatchComplianceData extends js.Object {
    var Classification: PatchClassification
    var InstalledTime: DateTime
    var KBId: PatchKbNumber
    var Severity: PatchSeverity
    var State: PatchComplianceDataState
    var Title: PatchTitle
    var CVEIds: js.UndefOr[PatchCVEIds]
  }

  object PatchComplianceData {
    @inline
    def apply(
        Classification: PatchClassification,
        InstalledTime: DateTime,
        KBId: PatchKbNumber,
        Severity: PatchSeverity,
        State: PatchComplianceDataState,
        Title: PatchTitle,
        CVEIds: js.UndefOr[PatchCVEIds] = js.undefined
    ): PatchComplianceData = {
      val __obj = js.Dynamic.literal(
        "Classification" -> Classification.asInstanceOf[js.Any],
        "InstalledTime" -> InstalledTime.asInstanceOf[js.Any],
        "KBId" -> KBId.asInstanceOf[js.Any],
        "Severity" -> Severity.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      CVEIds.foreach(__v => __obj.updateDynamic("CVEIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchComplianceData]
    }
  }

  /** Defines which patches should be included in a patch baseline. A patch filter consists of a key and a set of values. The filter key is a patch property. For example, the available filter keys for <code>WINDOWS</code> are <code>PATCH_SET</code>, <code>PRODUCT</code>, <code>PRODUCT_FAMILY</code>, <code>CLASSIFICATION</code>, and <code>MSRC_SEVERITY</code>. The filter values define a matching criterion for the patch property indicated by the key. For example, if the filter key is <code>PRODUCT</code> and the filter values are <code>["Office 2013", "Office 2016"]</code>, then the filter accepts all patches where product name is either "Office 2013" or "Office 2016". The filter values can be exact values for the patch property given as a key, or a wildcard (*), which matches all values. You can view lists of valid values for the patch properties by running the <code>DescribePatchProperties</code> command. For information about which patch properties can be used with each major
    * operating system, see <a>DescribePatchProperties</a>.
    */
  @js.native
  trait PatchFilter extends js.Object {
    var Key: PatchFilterKey
    var Values: PatchFilterValueList
  }

  object PatchFilter {
    @inline
    def apply(
        Key: PatchFilterKey,
        Values: PatchFilterValueList
    ): PatchFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PatchFilter]
    }
  }

  /** A set of patch filters, typically used for approval rules.
    */
  @js.native
  trait PatchFilterGroup extends js.Object {
    var PatchFilters: PatchFilterList
  }

  object PatchFilterGroup {
    @inline
    def apply(
        PatchFilters: PatchFilterList
    ): PatchFilterGroup = {
      val __obj = js.Dynamic.literal(
        "PatchFilters" -> PatchFilters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PatchFilterGroup]
    }
  }

  /** The mapping between a patch group and the patch baseline the patch group is registered with.
    */
  @js.native
  trait PatchGroupPatchBaselineMapping extends js.Object {
    var BaselineIdentity: js.UndefOr[PatchBaselineIdentity]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object PatchGroupPatchBaselineMapping {
    @inline
    def apply(
        BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): PatchGroupPatchBaselineMapping = {
      val __obj = js.Dynamic.literal()
      BaselineIdentity.foreach(__v => __obj.updateDynamic("BaselineIdentity")(__v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.updateDynamic("PatchGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
    }
  }

  /** Defines a filter used in Patch Manager APIs. Supported filter keys depend on the API operation that includes the filter. Patch Manager API operations that use <code>PatchOrchestratorFilter</code> include the following: * <a>DescribeAvailablePatches</a> * <a>DescribeInstancePatches</a> * <a>DescribePatchBaselines</a> * <a>DescribePatchGroups</a>
    */
  @js.native
  trait PatchOrchestratorFilter extends js.Object {
    var Key: js.UndefOr[PatchOrchestratorFilterKey]
    var Values: js.UndefOr[PatchOrchestratorFilterValues]
  }

  object PatchOrchestratorFilter {
    @inline
    def apply(
        Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined,
        Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
    ): PatchOrchestratorFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchOrchestratorFilter]
    }
  }

  /** Defines an approval rule for a patch baseline.
    */
  @js.native
  trait PatchRule extends js.Object {
    var PatchFilterGroup: PatchFilterGroup
    var ApproveAfterDays: js.UndefOr[ApproveAfterDays]
    var ApproveUntilDate: js.UndefOr[PatchStringDateTime]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var EnableNonSecurity: js.UndefOr[Boolean]
  }

  object PatchRule {
    @inline
    def apply(
        PatchFilterGroup: PatchFilterGroup,
        ApproveAfterDays: js.UndefOr[ApproveAfterDays] = js.undefined,
        ApproveUntilDate: js.UndefOr[PatchStringDateTime] = js.undefined,
        ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
        EnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    ): PatchRule = {
      val __obj = js.Dynamic.literal(
        "PatchFilterGroup" -> PatchFilterGroup.asInstanceOf[js.Any]
      )

      ApproveAfterDays.foreach(__v => __obj.updateDynamic("ApproveAfterDays")(__v.asInstanceOf[js.Any]))
      ApproveUntilDate.foreach(__v => __obj.updateDynamic("ApproveUntilDate")(__v.asInstanceOf[js.Any]))
      ComplianceLevel.foreach(__v => __obj.updateDynamic("ComplianceLevel")(__v.asInstanceOf[js.Any]))
      EnableNonSecurity.foreach(__v => __obj.updateDynamic("EnableNonSecurity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchRule]
    }
  }

  /** A set of rules defining the approval rules for a patch baseline.
    */
  @js.native
  trait PatchRuleGroup extends js.Object {
    var PatchRules: PatchRuleList
  }

  object PatchRuleGroup {
    @inline
    def apply(
        PatchRules: PatchRuleList
    ): PatchRuleGroup = {
      val __obj = js.Dynamic.literal(
        "PatchRules" -> PatchRules.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PatchRuleGroup]
    }
  }

  /** Information about the patches to use to update the managed nodes, including target operating systems and source repository. Applies to Linux managed nodes only.
    */
  @js.native
  trait PatchSource extends js.Object {
    var Configuration: PatchSourceConfiguration
    var Name: PatchSourceName
    var Products: PatchSourceProductList
  }

  object PatchSource {
    @inline
    def apply(
        Configuration: PatchSourceConfiguration,
        Name: PatchSourceName,
        Products: PatchSourceProductList
    ): PatchSource = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Products" -> Products.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PatchSource]
    }
  }

  /** Information about the approval status of a patch.
    */
  @js.native
  trait PatchStatus extends js.Object {
    var ApprovalDate: js.UndefOr[DateTime]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var DeploymentStatus: js.UndefOr[PatchDeploymentStatus]
  }

  object PatchStatus {
    @inline
    def apply(
        ApprovalDate: js.UndefOr[DateTime] = js.undefined,
        ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined,
        DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined
    ): PatchStatus = {
      val __obj = js.Dynamic.literal()
      ApprovalDate.foreach(__v => __obj.updateDynamic("ApprovalDate")(__v.asInstanceOf[js.Any]))
      ComplianceLevel.foreach(__v => __obj.updateDynamic("ComplianceLevel")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchStatus]
    }
  }

  /** An aggregate of step execution statuses displayed in the Amazon Web Services Systems Manager console for a multi-Region and multi-account Automation execution.
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
    @inline
    def apply(
        CancelledSteps: js.UndefOr[Int] = js.undefined,
        FailedSteps: js.UndefOr[Int] = js.undefined,
        SuccessSteps: js.UndefOr[Int] = js.undefined,
        TimedOutSteps: js.UndefOr[Int] = js.undefined,
        TotalSteps: js.UndefOr[Int] = js.undefined
    ): ProgressCounters = {
      val __obj = js.Dynamic.literal()
      CancelledSteps.foreach(__v => __obj.updateDynamic("CancelledSteps")(__v.asInstanceOf[js.Any]))
      FailedSteps.foreach(__v => __obj.updateDynamic("FailedSteps")(__v.asInstanceOf[js.Any]))
      SuccessSteps.foreach(__v => __obj.updateDynamic("SuccessSteps")(__v.asInstanceOf[js.Any]))
      TimedOutSteps.foreach(__v => __obj.updateDynamic("TimedOutSteps")(__v.asInstanceOf[js.Any]))
      TotalSteps.foreach(__v => __obj.updateDynamic("TotalSteps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProgressCounters]
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
    var UploadType: js.UndefOr[ComplianceUploadType]
  }

  object PutComplianceItemsRequest {
    @inline
    def apply(
        ComplianceType: ComplianceTypeName,
        ExecutionSummary: ComplianceExecutionSummary,
        Items: ComplianceItemEntryList,
        ResourceId: ComplianceResourceId,
        ResourceType: ComplianceResourceType,
        ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.undefined,
        UploadType: js.UndefOr[ComplianceUploadType] = js.undefined
    ): PutComplianceItemsRequest = {
      val __obj = js.Dynamic.literal(
        "ComplianceType" -> ComplianceType.asInstanceOf[js.Any],
        "ExecutionSummary" -> ExecutionSummary.asInstanceOf[js.Any],
        "Items" -> Items.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      ItemContentHash.foreach(__v => __obj.updateDynamic("ItemContentHash")(__v.asInstanceOf[js.Any]))
      UploadType.foreach(__v => __obj.updateDynamic("UploadType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutComplianceItemsRequest]
    }
  }

  @js.native
  trait PutComplianceItemsResult extends js.Object

  object PutComplianceItemsResult {
    @inline
    def apply(): PutComplianceItemsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutComplianceItemsResult]
    }
  }

  @js.native
  trait PutInventoryRequest extends js.Object {
    var InstanceId: InstanceId
    var Items: InventoryItemList
  }

  object PutInventoryRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Items: InventoryItemList
    ): PutInventoryRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Items" -> Items.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutInventoryRequest]
    }
  }

  @js.native
  trait PutInventoryResult extends js.Object {
    var Message: js.UndefOr[PutInventoryMessage]
  }

  object PutInventoryResult {
    @inline
    def apply(
        Message: js.UndefOr[PutInventoryMessage] = js.undefined
    ): PutInventoryResult = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInventoryResult]
    }
  }

  @js.native
  trait PutParameterRequest extends js.Object {
    var Name: PSParameterName
    var Value: PSParameterValue
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var DataType: js.UndefOr[ParameterDataType]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var Overwrite: js.UndefOr[Boolean]
    var Policies: js.UndefOr[ParameterPolicies]
    var Tags: js.UndefOr[TagList]
    var Tier: js.UndefOr[ParameterTier]
    var Type: js.UndefOr[ParameterType]
  }

  object PutParameterRequest {
    @inline
    def apply(
        Name: PSParameterName,
        Value: PSParameterValue,
        AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
        DataType: js.UndefOr[ParameterDataType] = js.undefined,
        Description: js.UndefOr[ParameterDescription] = js.undefined,
        KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
        Overwrite: js.UndefOr[Boolean] = js.undefined,
        Policies: js.UndefOr[ParameterPolicies] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Tier: js.UndefOr[ParameterTier] = js.undefined,
        Type: js.UndefOr[ParameterType] = js.undefined
    ): PutParameterRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      AllowedPattern.foreach(__v => __obj.updateDynamic("AllowedPattern")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      Overwrite.foreach(__v => __obj.updateDynamic("Overwrite")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutParameterRequest]
    }
  }

  @js.native
  trait PutParameterResult extends js.Object {
    var Tier: js.UndefOr[ParameterTier]
    var Version: js.UndefOr[PSParameterVersion]
  }

  object PutParameterResult {
    @inline
    def apply(
        Tier: js.UndefOr[ParameterTier] = js.undefined,
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): PutParameterResult = {
      val __obj = js.Dynamic.literal()
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutParameterResult]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object RegisterDefaultPatchBaselineRequest {
    @inline
    def apply(
        BaselineId: BaselineId
    ): RegisterDefaultPatchBaselineRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterDefaultPatchBaselineRequest]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object RegisterDefaultPatchBaselineResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): RegisterDefaultPatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDefaultPatchBaselineResult]
    }
  }

  @js.native
  trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  object RegisterPatchBaselineForPatchGroupRequest {
    @inline
    def apply(
        BaselineId: BaselineId,
        PatchGroup: PatchGroup
    ): RegisterPatchBaselineForPatchGroupRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any],
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
    }
  }

  @js.native
  trait RegisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  object RegisterPatchBaselineForPatchGroupResult {
    @inline
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): RegisterPatchBaselineForPatchGroupResult = {
      val __obj = js.Dynamic.literal()
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.updateDynamic("PatchGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupResult]
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
    @inline
    def apply(
        ResourceType: MaintenanceWindowResourceType,
        Targets: Targets,
        WindowId: MaintenanceWindowId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    ): RegisterTargetWithMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any],
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object RegisterTargetWithMaintenanceWindowResult {
    @inline
    def apply(
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): RegisterTargetWithMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      WindowTargetId.foreach(__v => __obj.updateDynamic("WindowTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
    var TaskArn: MaintenanceWindowTaskArn
    var TaskType: MaintenanceWindowTaskType
    var WindowId: MaintenanceWindowId
    var ClientToken: js.UndefOr[ClientToken]
    var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[MaintenanceWindowName]
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority]
    var ServiceRoleArn: js.UndefOr[ServiceRole]
    var Targets: js.UndefOr[Targets]
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters]
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters]
  }

  object RegisterTaskWithMaintenanceWindowRequest {
    @inline
    def apply(
        TaskArn: MaintenanceWindowTaskArn,
        TaskType: MaintenanceWindowTaskType,
        WindowId: MaintenanceWindowId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
        ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined,
        TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined,
        TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    ): RegisterTaskWithMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "TaskArn" -> TaskArn.asInstanceOf[js.Any],
        "TaskType" -> TaskType.asInstanceOf[js.Any],
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      CutoffBehavior.foreach(__v => __obj.updateDynamic("CutoffBehavior")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.updateDynamic("TaskInvocationParameters")(__v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.updateDynamic("TaskParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object RegisterTaskWithMaintenanceWindowResult {
    @inline
    def apply(
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): RegisterTaskWithMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      WindowTaskId.foreach(__v => __obj.updateDynamic("WindowTaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
    }
  }

  /** Reserved for internal use.
    */
  @js.native
  trait RegistrationMetadataItem extends js.Object {
    var Key: RegistrationMetadataKey
    var Value: RegistrationMetadataValue
  }

  object RegistrationMetadataItem {
    @inline
    def apply(
        Key: RegistrationMetadataKey,
        Value: RegistrationMetadataValue
    ): RegistrationMetadataItem = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegistrationMetadataItem]
    }
  }

  /** An OpsItems that shares something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  @js.native
  trait RelatedOpsItem extends js.Object {
    var OpsItemId: String
  }

  object RelatedOpsItem {
    @inline
    def apply(
        OpsItemId: String
    ): RelatedOpsItem = {
      val __obj = js.Dynamic.literal(
        "OpsItemId" -> OpsItemId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RelatedOpsItem]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceTypeForTagging,
        TagKeys: KeyList
    ): RemoveTagsFromResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResult extends js.Object

  object RemoveTagsFromResourceResult {
    @inline
    def apply(): RemoveTagsFromResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveTagsFromResourceResult]
    }
  }

  /** The request body of the ResetServiceSetting API operation.
    */
  @js.native
  trait ResetServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
  }

  object ResetServiceSettingRequest {
    @inline
    def apply(
        SettingId: ServiceSettingId
    ): ResetServiceSettingRequest = {
      val __obj = js.Dynamic.literal(
        "SettingId" -> SettingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResetServiceSettingRequest]
    }
  }

  /** The result body of the ResetServiceSetting API operation.
    */
  @js.native
  trait ResetServiceSettingResult extends js.Object {
    var ServiceSetting: js.UndefOr[ServiceSetting]
  }

  object ResetServiceSettingResult {
    @inline
    def apply(
        ServiceSetting: js.UndefOr[ServiceSetting] = js.undefined
    ): ResetServiceSettingResult = {
      val __obj = js.Dynamic.literal()
      ServiceSetting.foreach(__v => __obj.updateDynamic("ServiceSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetServiceSettingResult]
    }
  }

  /** Information about targets that resolved during the Automation execution.
    */
  @js.native
  trait ResolvedTargets extends js.Object {
    var ParameterValues: js.UndefOr[TargetParameterList]
    var Truncated: js.UndefOr[Boolean]
  }

  object ResolvedTargets {
    @inline
    def apply(
        ParameterValues: js.UndefOr[TargetParameterList] = js.undefined,
        Truncated: js.UndefOr[Boolean] = js.undefined
    ): ResolvedTargets = {
      val __obj = js.Dynamic.literal()
      ParameterValues.foreach(__v => __obj.updateDynamic("ParameterValues")(__v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.updateDynamic("Truncated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolvedTargets]
    }
  }

  /** Compliance summary information for a specific resource.
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
    @inline
    def apply(
        ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined,
        CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined,
        ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined,
        NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined,
        OverallSeverity: js.UndefOr[ComplianceSeverity] = js.undefined,
        ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined,
        ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined,
        Status: js.UndefOr[ComplianceStatus] = js.undefined
    ): ResourceComplianceSummaryItem = {
      val __obj = js.Dynamic.literal()
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      CompliantSummary.foreach(__v => __obj.updateDynamic("CompliantSummary")(__v.asInstanceOf[js.Any]))
      ExecutionSummary.foreach(__v => __obj.updateDynamic("ExecutionSummary")(__v.asInstanceOf[js.Any]))
      NonCompliantSummary.foreach(__v => __obj.updateDynamic("NonCompliantSummary")(__v.asInstanceOf[js.Any]))
      OverallSeverity.foreach(__v => __obj.updateDynamic("OverallSeverity")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceComplianceSummaryItem]
    }
  }

  /** Information about the <code>AwsOrganizationsSource</code> resource data sync source. A sync source of this type can synchronize data from Organizations or, if an Amazon Web Services organization isn't present, from multiple Amazon Web Services Regions.
    */
  @js.native
  trait ResourceDataSyncAwsOrganizationsSource extends js.Object {
    var OrganizationSourceType: ResourceDataSyncOrganizationSourceType
    var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList]
  }

  object ResourceDataSyncAwsOrganizationsSource {
    @inline
    def apply(
        OrganizationSourceType: ResourceDataSyncOrganizationSourceType,
        OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList] = js.undefined
    ): ResourceDataSyncAwsOrganizationsSource = {
      val __obj = js.Dynamic.literal(
        "OrganizationSourceType" -> OrganizationSourceType.asInstanceOf[js.Any]
      )

      OrganizationalUnits.foreach(__v => __obj.updateDynamic("OrganizationalUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncAwsOrganizationsSource]
    }
  }

  /** Synchronize Amazon Web Services Systems Manager Inventory data from multiple Amazon Web Services accounts defined in Organizations to a centralized Amazon S3 bucket. Data is synchronized to individual key prefixes in the central bucket. Each key prefix represents a different Amazon Web Services account ID.
    */
  @js.native
  trait ResourceDataSyncDestinationDataSharing extends js.Object {
    var DestinationDataSharingType: js.UndefOr[ResourceDataSyncDestinationDataSharingType]
  }

  object ResourceDataSyncDestinationDataSharing {
    @inline
    def apply(
        DestinationDataSharingType: js.UndefOr[ResourceDataSyncDestinationDataSharingType] = js.undefined
    ): ResourceDataSyncDestinationDataSharing = {
      val __obj = js.Dynamic.literal()
      DestinationDataSharingType.foreach(__v => __obj.updateDynamic("DestinationDataSharingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncDestinationDataSharing]
    }
  }

  /** Information about a resource data sync configuration, including its current status and last successful sync.
    */
  @js.native
  trait ResourceDataSyncItem extends js.Object {
    var LastStatus: js.UndefOr[LastResourceDataSyncStatus]
    var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime]
    var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage]
    var LastSyncTime: js.UndefOr[LastResourceDataSyncTime]
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination]
    var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime]
    var SyncLastModifiedTime: js.UndefOr[ResourceDataSyncLastModifiedTime]
    var SyncName: js.UndefOr[ResourceDataSyncName]
    var SyncSource: js.UndefOr[ResourceDataSyncSourceWithState]
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  object ResourceDataSyncItem {
    @inline
    def apply(
        LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined,
        LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.undefined,
        LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined,
        LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.undefined,
        S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined,
        SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.undefined,
        SyncLastModifiedTime: js.UndefOr[ResourceDataSyncLastModifiedTime] = js.undefined,
        SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined,
        SyncSource: js.UndefOr[ResourceDataSyncSourceWithState] = js.undefined,
        SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
    ): ResourceDataSyncItem = {
      val __obj = js.Dynamic.literal()
      LastStatus.foreach(__v => __obj.updateDynamic("LastStatus")(__v.asInstanceOf[js.Any]))
      LastSuccessfulSyncTime.foreach(__v => __obj.updateDynamic("LastSuccessfulSyncTime")(__v.asInstanceOf[js.Any]))
      LastSyncStatusMessage.foreach(__v => __obj.updateDynamic("LastSyncStatusMessage")(__v.asInstanceOf[js.Any]))
      LastSyncTime.foreach(__v => __obj.updateDynamic("LastSyncTime")(__v.asInstanceOf[js.Any]))
      S3Destination.foreach(__v => __obj.updateDynamic("S3Destination")(__v.asInstanceOf[js.Any]))
      SyncCreatedTime.foreach(__v => __obj.updateDynamic("SyncCreatedTime")(__v.asInstanceOf[js.Any]))
      SyncLastModifiedTime.foreach(__v => __obj.updateDynamic("SyncLastModifiedTime")(__v.asInstanceOf[js.Any]))
      SyncName.foreach(__v => __obj.updateDynamic("SyncName")(__v.asInstanceOf[js.Any]))
      SyncSource.foreach(__v => __obj.updateDynamic("SyncSource")(__v.asInstanceOf[js.Any]))
      SyncType.foreach(__v => __obj.updateDynamic("SyncType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncItem]
    }
  }

  /** The Organizations organizational unit data source for the sync.
    */
  @js.native
  trait ResourceDataSyncOrganizationalUnit extends js.Object {
    var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId]
  }

  object ResourceDataSyncOrganizationalUnit {
    @inline
    def apply(
        OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId] = js.undefined
    ): ResourceDataSyncOrganizationalUnit = {
      val __obj = js.Dynamic.literal()
      OrganizationalUnitId.foreach(__v => __obj.updateDynamic("OrganizationalUnitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncOrganizationalUnit]
    }
  }

  /** Information about the target S3 bucket for the resource data sync.
    */
  @js.native
  trait ResourceDataSyncS3Destination extends js.Object {
    var BucketName: ResourceDataSyncS3BucketName
    var Region: ResourceDataSyncS3Region
    var SyncFormat: ResourceDataSyncS3Format
    var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN]
    var DestinationDataSharing: js.UndefOr[ResourceDataSyncDestinationDataSharing]
    var Prefix: js.UndefOr[ResourceDataSyncS3Prefix]
  }

  object ResourceDataSyncS3Destination {
    @inline
    def apply(
        BucketName: ResourceDataSyncS3BucketName,
        Region: ResourceDataSyncS3Region,
        SyncFormat: ResourceDataSyncS3Format,
        AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.undefined,
        DestinationDataSharing: js.UndefOr[ResourceDataSyncDestinationDataSharing] = js.undefined,
        Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined
    ): ResourceDataSyncS3Destination = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any],
        "SyncFormat" -> SyncFormat.asInstanceOf[js.Any]
      )

      AWSKMSKeyARN.foreach(__v => __obj.updateDynamic("AWSKMSKeyARN")(__v.asInstanceOf[js.Any]))
      DestinationDataSharing.foreach(__v => __obj.updateDynamic("DestinationDataSharing")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncS3Destination]
    }
  }

  /** Information about the source of the data included in the resource data sync.
    */
  @js.native
  trait ResourceDataSyncSource extends js.Object {
    var SourceRegions: ResourceDataSyncSourceRegionList
    var SourceType: ResourceDataSyncSourceType
    var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource]
    var EnableAllOpsDataSources: js.UndefOr[ResourceDataSyncEnableAllOpsDataSources]
    var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions]
  }

  object ResourceDataSyncSource {
    @inline
    def apply(
        SourceRegions: ResourceDataSyncSourceRegionList,
        SourceType: ResourceDataSyncSourceType,
        AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.undefined,
        EnableAllOpsDataSources: js.UndefOr[ResourceDataSyncEnableAllOpsDataSources] = js.undefined,
        IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.undefined
    ): ResourceDataSyncSource = {
      val __obj = js.Dynamic.literal(
        "SourceRegions" -> SourceRegions.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any]
      )

      AwsOrganizationsSource.foreach(__v => __obj.updateDynamic("AwsOrganizationsSource")(__v.asInstanceOf[js.Any]))
      EnableAllOpsDataSources.foreach(__v => __obj.updateDynamic("EnableAllOpsDataSources")(__v.asInstanceOf[js.Any]))
      IncludeFutureRegions.foreach(__v => __obj.updateDynamic("IncludeFutureRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncSource]
    }
  }

  /** The data type name for including resource data sync state. There are four sync states: <code>OrganizationNotExists</code> (Your organization doesn't exist) <code>NoPermissions</code> (The system can't locate the service-linked role. This role is automatically created when a user creates a resource data sync in Amazon Web Services Systems Manager Explorer.) <code>InvalidOrganizationalUnit</code> (You specified or selected an invalid unit in the resource data sync configuration.) <code>TrustedAccessDisabled</code> (You disabled Systems Manager access in the organization in Organizations.)
    */
  @js.native
  trait ResourceDataSyncSourceWithState extends js.Object {
    var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource]
    var EnableAllOpsDataSources: js.UndefOr[ResourceDataSyncEnableAllOpsDataSources]
    var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions]
    var SourceRegions: js.UndefOr[ResourceDataSyncSourceRegionList]
    var SourceType: js.UndefOr[ResourceDataSyncSourceType]
    var State: js.UndefOr[ResourceDataSyncState]
  }

  object ResourceDataSyncSourceWithState {
    @inline
    def apply(
        AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.undefined,
        EnableAllOpsDataSources: js.UndefOr[ResourceDataSyncEnableAllOpsDataSources] = js.undefined,
        IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.undefined,
        SourceRegions: js.UndefOr[ResourceDataSyncSourceRegionList] = js.undefined,
        SourceType: js.UndefOr[ResourceDataSyncSourceType] = js.undefined,
        State: js.UndefOr[ResourceDataSyncState] = js.undefined
    ): ResourceDataSyncSourceWithState = {
      val __obj = js.Dynamic.literal()
      AwsOrganizationsSource.foreach(__v => __obj.updateDynamic("AwsOrganizationsSource")(__v.asInstanceOf[js.Any]))
      EnableAllOpsDataSources.foreach(__v => __obj.updateDynamic("EnableAllOpsDataSources")(__v.asInstanceOf[js.Any]))
      IncludeFutureRegions.foreach(__v => __obj.updateDynamic("IncludeFutureRegions")(__v.asInstanceOf[js.Any]))
      SourceRegions.foreach(__v => __obj.updateDynamic("SourceRegions")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncSourceWithState]
    }
  }

  /** The inventory item result attribute.
    */
  @js.native
  trait ResultAttribute extends js.Object {
    var TypeName: InventoryItemTypeName
  }

  object ResultAttribute {
    @inline
    def apply(
        TypeName: InventoryItemTypeName
    ): ResultAttribute = {
      val __obj = js.Dynamic.literal(
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResultAttribute]
    }
  }

  @js.native
  trait ResumeSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object ResumeSessionRequest {
    @inline
    def apply(
        SessionId: SessionId
    ): ResumeSessionRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeSessionRequest]
    }
  }

  @js.native
  trait ResumeSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var StreamUrl: js.UndefOr[StreamUrl]
    var TokenValue: js.UndefOr[TokenValue]
  }

  object ResumeSessionResponse {
    @inline
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined,
        StreamUrl: js.UndefOr[StreamUrl] = js.undefined,
        TokenValue: js.UndefOr[TokenValue] = js.undefined
    ): ResumeSessionResponse = {
      val __obj = js.Dynamic.literal()
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      StreamUrl.foreach(__v => __obj.updateDynamic("StreamUrl")(__v.asInstanceOf[js.Any]))
      TokenValue.foreach(__v => __obj.updateDynamic("TokenValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResumeSessionResponse]
    }
  }

  /** Information about the result of a document review request.
    */
  @js.native
  trait ReviewInformation extends js.Object {
    var ReviewedTime: js.UndefOr[DateTime]
    var Reviewer: js.UndefOr[Reviewer]
    var Status: js.UndefOr[ReviewStatus]
  }

  object ReviewInformation {
    @inline
    def apply(
        ReviewedTime: js.UndefOr[DateTime] = js.undefined,
        Reviewer: js.UndefOr[Reviewer] = js.undefined,
        Status: js.UndefOr[ReviewStatus] = js.undefined
    ): ReviewInformation = {
      val __obj = js.Dynamic.literal()
      ReviewedTime.foreach(__v => __obj.updateDynamic("ReviewedTime")(__v.asInstanceOf[js.Any]))
      Reviewer.foreach(__v => __obj.updateDynamic("Reviewer")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReviewInformation]
    }
  }

  /** Information about an Automation runbook used in a runbook workflow in Change Manager.
    *
    * '''Note:'''The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change request have been received.
    */
  @js.native
  trait Runbook extends js.Object {
    var DocumentName: DocumentARN
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var TargetLocations: js.UndefOr[TargetLocations]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object Runbook {
    @inline
    def apply(
        DocumentName: DocumentARN,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): Runbook = {
      val __obj = js.Dynamic.literal(
        "DocumentName" -> DocumentName.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.updateDynamic("TargetParameterName")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Runbook]
    }
  }

  /** An S3 bucket where you want to store the results of this request.
    */
  @js.native
  trait S3OutputLocation extends js.Object {
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var OutputS3Region: js.UndefOr[S3Region]
  }

  object S3OutputLocation {
    @inline
    def apply(
        OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        OutputS3Region: js.UndefOr[S3Region] = js.undefined
    ): S3OutputLocation = {
      val __obj = js.Dynamic.literal()
      OutputS3BucketName.foreach(__v => __obj.updateDynamic("OutputS3BucketName")(__v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.updateDynamic("OutputS3KeyPrefix")(__v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.updateDynamic("OutputS3Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3OutputLocation]
    }
  }

  /** A URL for the Amazon Web Services Systems Manager (Systems Manager) bucket where you want to store the results of this request.
    */
  @js.native
  trait S3OutputUrl extends js.Object {
    var OutputUrl: js.UndefOr[Url]
  }

  object S3OutputUrl {
    @inline
    def apply(
        OutputUrl: js.UndefOr[Url] = js.undefined
    ): S3OutputUrl = {
      val __obj = js.Dynamic.literal()
      OutputUrl.foreach(__v => __obj.updateDynamic("OutputUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3OutputUrl]
    }
  }

  /** Information about a scheduled execution for a maintenance window.
    */
  @js.native
  trait ScheduledWindowExecution extends js.Object {
    var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object ScheduledWindowExecution {
    @inline
    def apply(
        ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): ScheduledWindowExecution = {
      val __obj = js.Dynamic.literal()
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledWindowExecution]
    }
  }

  @js.native
  trait SendAutomationSignalRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var SignalType: SignalType
    var Payload: js.UndefOr[AutomationParameterMap]
  }

  object SendAutomationSignalRequest {
    @inline
    def apply(
        AutomationExecutionId: AutomationExecutionId,
        SignalType: SignalType,
        Payload: js.UndefOr[AutomationParameterMap] = js.undefined
    ): SendAutomationSignalRequest = {
      val __obj = js.Dynamic.literal(
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any],
        "SignalType" -> SignalType.asInstanceOf[js.Any]
      )

      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAutomationSignalRequest]
    }
  }

  @js.native
  trait SendAutomationSignalResult extends js.Object

  object SendAutomationSignalResult {
    @inline
    def apply(): SendAutomationSignalResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendAutomationSignalResult]
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
    @inline
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
        TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
    ): SendCommandRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentName" -> DocumentName.asInstanceOf[js.Any]
      )

      CloudWatchOutputConfig.foreach(__v => __obj.updateDynamic("CloudWatchOutputConfig")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      DocumentHash.foreach(__v => __obj.updateDynamic("DocumentHash")(__v.asInstanceOf[js.Any]))
      DocumentHashType.foreach(__v => __obj.updateDynamic("DocumentHashType")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.updateDynamic("NotificationConfig")(__v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.updateDynamic("OutputS3BucketName")(__v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.updateDynamic("OutputS3KeyPrefix")(__v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.updateDynamic("OutputS3Region")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.updateDynamic("TimeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCommandRequest]
    }
  }

  @js.native
  trait SendCommandResult extends js.Object {
    var Command: js.UndefOr[Command]
  }

  object SendCommandResult {
    @inline
    def apply(
        Command: js.UndefOr[Command] = js.undefined
    ): SendCommandResult = {
      val __obj = js.Dynamic.literal()
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCommandResult]
    }
  }

  /** The service setting data structure. <code>ServiceSetting</code> is an account-level setting for an Amazon Web Services service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an Amazon Web Services service charges money to the account based on feature or service usage, then the Amazon Web Services service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a <code>SettingId</code> object to a setting value. Amazon Web Services services teams define the default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the <a>UpdateServiceSetting</a> API operation to change the default setting. Or, use the <a>ResetServiceSetting</a> to
    * change the value back to the original value defined by the Amazon Web Services service team.
    */
  @js.native
  trait ServiceSetting extends js.Object {
    var ARN: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var SettingId: js.UndefOr[ServiceSettingId]
    var SettingValue: js.UndefOr[ServiceSettingValue]
    var Status: js.UndefOr[String]
  }

  object ServiceSetting {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
        LastModifiedUser: js.UndefOr[String] = js.undefined,
        SettingId: js.UndefOr[ServiceSettingId] = js.undefined,
        SettingValue: js.UndefOr[ServiceSettingValue] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ServiceSetting = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.updateDynamic("LastModifiedUser")(__v.asInstanceOf[js.Any]))
      SettingId.foreach(__v => __obj.updateDynamic("SettingId")(__v.asInstanceOf[js.Any]))
      SettingValue.foreach(__v => __obj.updateDynamic("SettingValue")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSetting]
    }
  }

  /** Information about a Session Manager connection to a managed node.
    */
  @js.native
  trait Session extends js.Object {
    var Details: js.UndefOr[SessionDetails]
    var DocumentName: js.UndefOr[DocumentName]
    var EndDate: js.UndefOr[DateTime]
    var MaxSessionDuration: js.UndefOr[MaxSessionDuration]
    var OutputUrl: js.UndefOr[SessionManagerOutputUrl]
    var Owner: js.UndefOr[SessionOwner]
    var Reason: js.UndefOr[SessionReason]
    var SessionId: js.UndefOr[SessionId]
    var StartDate: js.UndefOr[DateTime]
    var Status: js.UndefOr[SessionStatus]
    var Target: js.UndefOr[SessionTarget]
  }

  object Session {
    @inline
    def apply(
        Details: js.UndefOr[SessionDetails] = js.undefined,
        DocumentName: js.UndefOr[DocumentName] = js.undefined,
        EndDate: js.UndefOr[DateTime] = js.undefined,
        MaxSessionDuration: js.UndefOr[MaxSessionDuration] = js.undefined,
        OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.undefined,
        Owner: js.UndefOr[SessionOwner] = js.undefined,
        Reason: js.UndefOr[SessionReason] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined,
        StartDate: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[SessionStatus] = js.undefined,
        Target: js.UndefOr[SessionTarget] = js.undefined
    ): Session = {
      val __obj = js.Dynamic.literal()
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      MaxSessionDuration.foreach(__v => __obj.updateDynamic("MaxSessionDuration")(__v.asInstanceOf[js.Any]))
      OutputUrl.foreach(__v => __obj.updateDynamic("OutputUrl")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Session]
    }
  }

  /** Describes a filter for Session Manager information.
    */
  @js.native
  trait SessionFilter extends js.Object {
    var key: SessionFilterKey
    var value: SessionFilterValue
  }

  object SessionFilter {
    @inline
    def apply(
        key: SessionFilterKey,
        value: SessionFilterValue
    ): SessionFilter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SessionFilter]
    }
  }

  /** Reserved for future use.
    */
  @js.native
  trait SessionManagerOutputUrl extends js.Object {
    var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl]
    var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl]
  }

  object SessionManagerOutputUrl {
    @inline
    def apply(
        CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.undefined,
        S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined
    ): SessionManagerOutputUrl = {
      val __obj = js.Dynamic.literal()
      CloudWatchOutputUrl.foreach(__v => __obj.updateDynamic("CloudWatchOutputUrl")(__v.asInstanceOf[js.Any]))
      S3OutputUrl.foreach(__v => __obj.updateDynamic("S3OutputUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionManagerOutputUrl]
    }
  }

  /** The number of managed nodes found for each patch severity level defined in the request filter.
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
    @inline
    def apply(
        CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
        UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    ): SeveritySummary = {
      val __obj = js.Dynamic.literal()
      CriticalCount.foreach(__v => __obj.updateDynamic("CriticalCount")(__v.asInstanceOf[js.Any]))
      HighCount.foreach(__v => __obj.updateDynamic("HighCount")(__v.asInstanceOf[js.Any]))
      InformationalCount.foreach(__v => __obj.updateDynamic("InformationalCount")(__v.asInstanceOf[js.Any]))
      LowCount.foreach(__v => __obj.updateDynamic("LowCount")(__v.asInstanceOf[js.Any]))
      MediumCount.foreach(__v => __obj.updateDynamic("MediumCount")(__v.asInstanceOf[js.Any]))
      UnspecifiedCount.foreach(__v => __obj.updateDynamic("UnspecifiedCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeveritySummary]
    }
  }

  @js.native
  trait StartAssociationsOnceRequest extends js.Object {
    var AssociationIds: AssociationIdList
  }

  object StartAssociationsOnceRequest {
    @inline
    def apply(
        AssociationIds: AssociationIdList
    ): StartAssociationsOnceRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationIds" -> AssociationIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartAssociationsOnceRequest]
    }
  }

  @js.native
  trait StartAssociationsOnceResult extends js.Object

  object StartAssociationsOnceResult {
    @inline
    def apply(): StartAssociationsOnceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartAssociationsOnceResult]
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
    var Tags: js.UndefOr[TagList]
    var TargetLocations: js.UndefOr[TargetLocations]
    var TargetMaps: js.UndefOr[TargetMaps]
    var TargetParameterName: js.UndefOr[AutomationParameterKey]
    var Targets: js.UndefOr[Targets]
  }

  object StartAutomationExecutionRequest {
    @inline
    def apply(
        DocumentName: DocumentARN,
        ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Mode: js.UndefOr[ExecutionMode] = js.undefined,
        Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        TargetMaps: js.UndefOr[TargetMaps] = js.undefined,
        TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): StartAutomationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentName" -> DocumentName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      TargetMaps.foreach(__v => __obj.updateDynamic("TargetMaps")(__v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.updateDynamic("TargetParameterName")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAutomationExecutionRequest]
    }
  }

  @js.native
  trait StartAutomationExecutionResult extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
  }

  object StartAutomationExecutionResult {
    @inline
    def apply(
        AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    ): StartAutomationExecutionResult = {
      val __obj = js.Dynamic.literal()
      AutomationExecutionId.foreach(__v => __obj.updateDynamic("AutomationExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAutomationExecutionResult]
    }
  }

  @js.native
  trait StartChangeRequestExecutionRequest extends js.Object {
    var DocumentName: DocumentARN
    var Runbooks: Runbooks
    var AutoApprove: js.UndefOr[Boolean]
    var ChangeDetails: js.UndefOr[ChangeDetailsValue]
    var ChangeRequestName: js.UndefOr[ChangeRequestName]
    var ClientToken: js.UndefOr[IdempotencyToken]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Parameters: js.UndefOr[AutomationParameterMap]
    var ScheduledEndTime: js.UndefOr[DateTime]
    var ScheduledTime: js.UndefOr[DateTime]
    var Tags: js.UndefOr[TagList]
  }

  object StartChangeRequestExecutionRequest {
    @inline
    def apply(
        DocumentName: DocumentARN,
        Runbooks: Runbooks,
        AutoApprove: js.UndefOr[Boolean] = js.undefined,
        ChangeDetails: js.UndefOr[ChangeDetailsValue] = js.undefined,
        ChangeRequestName: js.UndefOr[ChangeRequestName] = js.undefined,
        ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        Parameters: js.UndefOr[AutomationParameterMap] = js.undefined,
        ScheduledEndTime: js.UndefOr[DateTime] = js.undefined,
        ScheduledTime: js.UndefOr[DateTime] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): StartChangeRequestExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentName" -> DocumentName.asInstanceOf[js.Any],
        "Runbooks" -> Runbooks.asInstanceOf[js.Any]
      )

      AutoApprove.foreach(__v => __obj.updateDynamic("AutoApprove")(__v.asInstanceOf[js.Any]))
      ChangeDetails.foreach(__v => __obj.updateDynamic("ChangeDetails")(__v.asInstanceOf[js.Any]))
      ChangeRequestName.foreach(__v => __obj.updateDynamic("ChangeRequestName")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ScheduledEndTime.foreach(__v => __obj.updateDynamic("ScheduledEndTime")(__v.asInstanceOf[js.Any]))
      ScheduledTime.foreach(__v => __obj.updateDynamic("ScheduledTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChangeRequestExecutionRequest]
    }
  }

  @js.native
  trait StartChangeRequestExecutionResult extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
  }

  object StartChangeRequestExecutionResult {
    @inline
    def apply(
        AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    ): StartChangeRequestExecutionResult = {
      val __obj = js.Dynamic.literal()
      AutomationExecutionId.foreach(__v => __obj.updateDynamic("AutomationExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChangeRequestExecutionResult]
    }
  }

  @js.native
  trait StartSessionRequest extends js.Object {
    var Target: SessionTarget
    var DocumentName: js.UndefOr[DocumentARN]
    var Parameters: js.UndefOr[SessionManagerParameters]
    var Reason: js.UndefOr[SessionReason]
  }

  object StartSessionRequest {
    @inline
    def apply(
        Target: SessionTarget,
        DocumentName: js.UndefOr[DocumentARN] = js.undefined,
        Parameters: js.UndefOr[SessionManagerParameters] = js.undefined,
        Reason: js.UndefOr[SessionReason] = js.undefined
    ): StartSessionRequest = {
      val __obj = js.Dynamic.literal(
        "Target" -> Target.asInstanceOf[js.Any]
      )

      DocumentName.foreach(__v => __obj.updateDynamic("DocumentName")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSessionRequest]
    }
  }

  @js.native
  trait StartSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var StreamUrl: js.UndefOr[StreamUrl]
    var TokenValue: js.UndefOr[TokenValue]
  }

  object StartSessionResponse {
    @inline
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined,
        StreamUrl: js.UndefOr[StreamUrl] = js.undefined,
        TokenValue: js.UndefOr[TokenValue] = js.undefined
    ): StartSessionResponse = {
      val __obj = js.Dynamic.literal()
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      StreamUrl.foreach(__v => __obj.updateDynamic("StreamUrl")(__v.asInstanceOf[js.Any]))
      TokenValue.foreach(__v => __obj.updateDynamic("TokenValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSessionResponse]
    }
  }

  /** Detailed information about an the execution state of an Automation step.
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
    @inline
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
        ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined
    ): StepExecution = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      ExecutionEndTime.foreach(__v => __obj.updateDynamic("ExecutionEndTime")(__v.asInstanceOf[js.Any]))
      ExecutionStartTime.foreach(__v => __obj.updateDynamic("ExecutionStartTime")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      IsCritical.foreach(__v => __obj.updateDynamic("IsCritical")(__v.asInstanceOf[js.Any]))
      IsEnd.foreach(__v => __obj.updateDynamic("IsEnd")(__v.asInstanceOf[js.Any]))
      MaxAttempts.foreach(__v => __obj.updateDynamic("MaxAttempts")(__v.asInstanceOf[js.Any]))
      NextStep.foreach(__v => __obj.updateDynamic("NextStep")(__v.asInstanceOf[js.Any]))
      OnFailure.foreach(__v => __obj.updateDynamic("OnFailure")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      OverriddenParameters.foreach(__v => __obj.updateDynamic("OverriddenParameters")(__v.asInstanceOf[js.Any]))
      Response.foreach(__v => __obj.updateDynamic("Response")(__v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.updateDynamic("ResponseCode")(__v.asInstanceOf[js.Any]))
      StepExecutionId.foreach(__v => __obj.updateDynamic("StepExecutionId")(__v.asInstanceOf[js.Any]))
      StepName.foreach(__v => __obj.updateDynamic("StepName")(__v.asInstanceOf[js.Any]))
      StepStatus.foreach(__v => __obj.updateDynamic("StepStatus")(__v.asInstanceOf[js.Any]))
      TargetLocation.foreach(__v => __obj.updateDynamic("TargetLocation")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.updateDynamic("TimeoutSeconds")(__v.asInstanceOf[js.Any]))
      ValidNextSteps.foreach(__v => __obj.updateDynamic("ValidNextSteps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepExecution]
    }
  }

  /** A filter to limit the amount of step execution information returned by the call.
    */
  @js.native
  trait StepExecutionFilter extends js.Object {
    var Key: StepExecutionFilterKey
    var Values: StepExecutionFilterValueList
  }

  object StepExecutionFilter {
    @inline
    def apply(
        Key: StepExecutionFilterKey,
        Values: StepExecutionFilterValueList
    ): StepExecutionFilter = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StepExecutionFilter]
    }
  }

  @js.native
  trait StopAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var Type: js.UndefOr[StopType]
  }

  object StopAutomationExecutionRequest {
    @inline
    def apply(
        AutomationExecutionId: AutomationExecutionId,
        Type: js.UndefOr[StopType] = js.undefined
    ): StopAutomationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopAutomationExecutionRequest]
    }
  }

  @js.native
  trait StopAutomationExecutionResult extends js.Object

  object StopAutomationExecutionResult {
    @inline
    def apply(): StopAutomationExecutionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopAutomationExecutionResult]
    }
  }

  /** Metadata that you assign to your Amazon Web Services resources. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. In Amazon Web Services Systems Manager, you can apply tags to Systems Manager documents (SSM documents), managed nodes, maintenance windows, parameters, patch baselines, OpsItems, and OpsMetadata.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** An array of search criteria that targets managed nodes using a key-value pair that you specify.
    *
    * '''Note:'''One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task, targets are optional for other maintenance window task types (Automation, Lambda, and Step Functions). For more information about running tasks that don't specify targets, see [[https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html|Registering maintenance window tasks without targets]] in the <i>Amazon Web Services Systems Manager User Guide</i>. Supported formats include the following. * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;,&lt;instance-id-3&gt;</code> * <code>Key=tag:&lt;my-tag-key&gt;,Values=&lt;my-tag-value-1&gt;,&lt;my-tag-value-2&gt;</code> * <code>Key=tag-key,Values=&lt;my-tag-key-1&gt;,&lt;my-tag-key-2&gt;</code> * ```Run Command and Maintenance window targets only```: <code>Key=resource-groups:Name,Values=&lt;resource-group-name&gt;</code> * ```Maintenance window targets
    * only```: <code>Key=resource-groups:ResourceTypeFilters,Values=&lt;resource-type-1&gt;,&lt;resource-type-2&gt;</code> * ```Automation targets only```: <code>Key=ResourceGroup;Values=&lt;resource-group-name&gt;</code> For example: * <code>Key=InstanceIds,Values=i-02573cafcfEXAMPLE,i-0471e04240EXAMPLE,i-07782c72faEXAMPLE</code> * <code>Key=tag:CostCenter,Values=CostCenter1,CostCenter2,CostCenter3</code> * <code>Key=tag-key,Values=Name,Instance-Type,CostCenter</code> * ```Run Command and Maintenance window targets only```: <code>Key=resource-groups:Name,Values=ProductionResourceGroup</code> This example demonstrates how to target all resources in the resource group ```ProductionResourceGroup``` in your maintenance window. * ```Maintenance window targets only```: <code>Key=resource-groups:ResourceTypeFilters,Values=AWS::EC2::INSTANCE,AWS::EC2::VPC</code> This example demonstrates how to target only Amazon Elastic Compute Cloud (Amazon EC2) instances and VPCs in your maintenance
    * window. * ```Automation targets only```: <code>Key=ResourceGroup,Values=MyResourceGroup</code> * ```State Manager association targets only```: <code>Key=InstanceIds,Values=*</code> This example demonstrates how to target all managed instances in the Amazon Web Services Region where the association was created. For more information about how to send commands that target managed nodes using <code>Key,Value</code> parameters, see [[https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting|Targeting multiple instances]] in the <i>Amazon Web Services Systems Manager User Guide</i>.
    */
  @js.native
  trait Target extends js.Object {
    var Key: js.UndefOr[TargetKey]
    var Values: js.UndefOr[TargetValues]
  }

  object Target {
    @inline
    def apply(
        Key: js.UndefOr[TargetKey] = js.undefined,
        Values: js.UndefOr[TargetValues] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  /** The combination of Amazon Web Services Regions and Amazon Web Services accounts targeted by the current Automation execution.
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
    @inline
    def apply(
        Accounts: js.UndefOr[Accounts] = js.undefined,
        ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
        Regions: js.UndefOr[Regions] = js.undefined,
        TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined
    ): TargetLocation = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      ExecutionRoleName.foreach(__v => __obj.updateDynamic("ExecutionRoleName")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      TargetLocationMaxConcurrency.foreach(__v => __obj.updateDynamic("TargetLocationMaxConcurrency")(__v.asInstanceOf[js.Any]))
      TargetLocationMaxErrors.foreach(__v => __obj.updateDynamic("TargetLocationMaxErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetLocation]
    }
  }

  @js.native
  trait TerminateSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object TerminateSessionRequest {
    @inline
    def apply(
        SessionId: SessionId
    ): TerminateSessionRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminateSessionRequest]
    }
  }

  @js.native
  trait TerminateSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
  }

  object TerminateSessionResponse {
    @inline
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined
    ): TerminateSessionResponse = {
      val __obj = js.Dynamic.literal()
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateSessionResponse]
    }
  }

  @js.native
  trait UnlabelParameterVersionRequest extends js.Object {
    var Labels: ParameterLabelList
    var Name: PSParameterName
    var ParameterVersion: PSParameterVersion
  }

  object UnlabelParameterVersionRequest {
    @inline
    def apply(
        Labels: ParameterLabelList,
        Name: PSParameterName,
        ParameterVersion: PSParameterVersion
    ): UnlabelParameterVersionRequest = {
      val __obj = js.Dynamic.literal(
        "Labels" -> Labels.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ParameterVersion" -> ParameterVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnlabelParameterVersionRequest]
    }
  }

  @js.native
  trait UnlabelParameterVersionResult extends js.Object {
    var InvalidLabels: js.UndefOr[ParameterLabelList]
    var RemovedLabels: js.UndefOr[ParameterLabelList]
  }

  object UnlabelParameterVersionResult {
    @inline
    def apply(
        InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined,
        RemovedLabels: js.UndefOr[ParameterLabelList] = js.undefined
    ): UnlabelParameterVersionResult = {
      val __obj = js.Dynamic.literal()
      InvalidLabels.foreach(__v => __obj.updateDynamic("InvalidLabels")(__v.asInstanceOf[js.Any]))
      RemovedLabels.foreach(__v => __obj.updateDynamic("RemovedLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnlabelParameterVersionResult]
    }
  }

  @js.native
  trait UpdateAssociationRequest extends js.Object {
    var AssociationId: AssociationId
    var ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
    var CalendarNames: js.UndefOr[CalendarNameOrARNList]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentARN]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var SyncCompliance: js.UndefOr[AssociationSyncCompliance]
    var TargetLocations: js.UndefOr[TargetLocations]
    var Targets: js.UndefOr[Targets]
  }

  object UpdateAssociationRequest {
    @inline
    def apply(
        AssociationId: AssociationId,
        ApplyOnlyAtCronInterval: js.UndefOr[ApplyOnlyAtCronInterval] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined,
        TargetLocations: js.UndefOr[TargetLocations] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): UpdateAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      ApplyOnlyAtCronInterval.foreach(__v => __obj.updateDynamic("ApplyOnlyAtCronInterval")(__v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.updateDynamic("AssociationName")(__v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.updateDynamic("AssociationVersion")(__v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(__v => __obj.updateDynamic("AutomationTargetParameterName")(__v.asInstanceOf[js.Any]))
      CalendarNames.foreach(__v => __obj.updateDynamic("CalendarNames")(__v.asInstanceOf[js.Any]))
      ComplianceSeverity.foreach(__v => __obj.updateDynamic("ComplianceSeverity")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      SyncCompliance.foreach(__v => __obj.updateDynamic("SyncCompliance")(__v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.updateDynamic("TargetLocations")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssociationRequest]
    }
  }

  @js.native
  trait UpdateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object UpdateAssociationResult {
    @inline
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationResult = {
      val __obj = js.Dynamic.literal()
      AssociationDescription.foreach(__v => __obj.updateDynamic("AssociationDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssociationResult]
    }
  }

  @js.native
  trait UpdateAssociationStatusRequest extends js.Object {
    var AssociationStatus: AssociationStatus
    var InstanceId: InstanceId
    var Name: DocumentARN
  }

  object UpdateAssociationStatusRequest {
    @inline
    def apply(
        AssociationStatus: AssociationStatus,
        InstanceId: InstanceId,
        Name: DocumentARN
    ): UpdateAssociationStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationStatus" -> AssociationStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAssociationStatusRequest]
    }
  }

  @js.native
  trait UpdateAssociationStatusResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object UpdateAssociationStatusResult {
    @inline
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationStatusResult = {
      val __obj = js.Dynamic.literal()
      AssociationDescription.foreach(__v => __obj.updateDynamic("AssociationDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssociationStatusResult]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionRequest extends js.Object {
    var DocumentVersion: DocumentVersionNumber
    var Name: DocumentName
  }

  object UpdateDocumentDefaultVersionRequest {
    @inline
    def apply(
        DocumentVersion: DocumentVersionNumber,
        Name: DocumentName
    ): UpdateDocumentDefaultVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentVersion" -> DocumentVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionResult extends js.Object {
    var Description: js.UndefOr[DocumentDefaultVersionDescription]
  }

  object UpdateDocumentDefaultVersionResult {
    @inline
    def apply(
        Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined
    ): UpdateDocumentDefaultVersionResult = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentDefaultVersionResult]
    }
  }

  @js.native
  trait UpdateDocumentMetadataRequest extends js.Object {
    var DocumentReviews: DocumentReviews
    var Name: DocumentName
    var DocumentVersion: js.UndefOr[DocumentVersion]
  }

  object UpdateDocumentMetadataRequest {
    @inline
    def apply(
        DocumentReviews: DocumentReviews,
        Name: DocumentName,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    ): UpdateDocumentMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentReviews" -> DocumentReviews.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentMetadataRequest]
    }
  }

  @js.native
  trait UpdateDocumentMetadataResponse extends js.Object

  object UpdateDocumentMetadataResponse {
    @inline
    def apply(): UpdateDocumentMetadataResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDocumentMetadataResponse]
    }
  }

  @js.native
  trait UpdateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DisplayName: js.UndefOr[DocumentDisplayName]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object UpdateDocumentRequest {
    @inline
    def apply(
        Content: DocumentContent,
        Name: DocumentName,
        Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined,
        DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): UpdateDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attachments.foreach(__v => __obj.updateDynamic("Attachments")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.updateDynamic("DocumentFormat")(__v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.updateDynamic("DocumentVersion")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentRequest]
    }
  }

  @js.native
  trait UpdateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  object UpdateDocumentResult {
    @inline
    def apply(
        DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): UpdateDocumentResult = {
      val __obj = js.Dynamic.literal()
      DocumentDescription.foreach(__v => __obj.updateDynamic("DocumentDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentResult]
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
    var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
  }

  object UpdateMaintenanceWindowRequest {
    @inline
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
        ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined,
        ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    ): UpdateMaintenanceWindowRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      AllowUnassociatedTargets.foreach(__v => __obj.updateDynamic("AllowUnassociatedTargets")(__v.asInstanceOf[js.Any]))
      Cutoff.foreach(__v => __obj.updateDynamic("Cutoff")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.updateDynamic("Replace")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      ScheduleOffset.foreach(__v => __obj.updateDynamic("ScheduleOffset")(__v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.updateDynamic("ScheduleTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowRequest]
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
    var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset]
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object UpdateMaintenanceWindowResult {
    @inline
    def apply(
        AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
        Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
        Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
        EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined,
        ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined,
        ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined,
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): UpdateMaintenanceWindowResult = {
      val __obj = js.Dynamic.literal()
      AllowUnassociatedTargets.foreach(__v => __obj.updateDynamic("AllowUnassociatedTargets")(__v.asInstanceOf[js.Any]))
      Cutoff.foreach(__v => __obj.updateDynamic("Cutoff")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      ScheduleOffset.foreach(__v => __obj.updateDynamic("ScheduleOffset")(__v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.updateDynamic("ScheduleTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowResult]
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
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTargetId: MaintenanceWindowTargetId,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
        Replace: js.UndefOr[Boolean] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): UpdateMaintenanceWindowTargetRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTargetId" -> WindowTargetId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.updateDynamic("Replace")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
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
    @inline
    def apply(
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): UpdateMaintenanceWindowTargetResult = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.updateDynamic("OwnerInformation")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.updateDynamic("WindowTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTaskRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
    var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior]
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
    @inline
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTaskId: MaintenanceWindowTaskId,
        CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined,
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
        TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    ): UpdateMaintenanceWindowTaskRequest = {
      val __obj = js.Dynamic.literal(
        "WindowId" -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]
      )

      CutoffBehavior.foreach(__v => __obj.updateDynamic("CutoffBehavior")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.updateDynamic("Replace")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.updateDynamic("TaskInvocationParameters")(__v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.updateDynamic("TaskParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTaskRequest]
    }
  }

  @js.native
  trait UpdateMaintenanceWindowTaskResult extends js.Object {
    var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior]
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
    @inline
    def apply(
        CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined,
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
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): UpdateMaintenanceWindowTaskResult = {
      val __obj = js.Dynamic.literal()
      CutoffBehavior.foreach(__v => __obj.updateDynamic("CutoffBehavior")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.updateDynamic("MaxErrors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.updateDynamic("TaskInvocationParameters")(__v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.updateDynamic("TaskParameters")(__v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.updateDynamic("WindowId")(__v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.updateDynamic("WindowTaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleRequest extends js.Object {
    var IamRole: IamRole
    var InstanceId: ManagedInstanceId
  }

  object UpdateManagedInstanceRoleRequest {
    @inline
    def apply(
        IamRole: IamRole,
        InstanceId: ManagedInstanceId
    ): UpdateManagedInstanceRoleRequest = {
      val __obj = js.Dynamic.literal(
        "IamRole" -> IamRole.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateManagedInstanceRoleRequest]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleResult extends js.Object

  object UpdateManagedInstanceRoleResult {
    @inline
    def apply(): UpdateManagedInstanceRoleResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateManagedInstanceRoleResult]
    }
  }

  @js.native
  trait UpdateOpsItemRequest extends js.Object {
    var OpsItemId: OpsItemId
    var ActualEndTime: js.UndefOr[DateTime]
    var ActualStartTime: js.UndefOr[DateTime]
    var Category: js.UndefOr[OpsItemCategory]
    var Description: js.UndefOr[OpsItemDescription]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList]
    var PlannedEndTime: js.UndefOr[DateTime]
    var PlannedStartTime: js.UndefOr[DateTime]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
  }

  object UpdateOpsItemRequest {
    @inline
    def apply(
        OpsItemId: OpsItemId,
        ActualEndTime: js.UndefOr[DateTime] = js.undefined,
        ActualStartTime: js.UndefOr[DateTime] = js.undefined,
        Category: js.UndefOr[OpsItemCategory] = js.undefined,
        Description: js.UndefOr[OpsItemDescription] = js.undefined,
        Notifications: js.UndefOr[OpsItemNotifications] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.undefined,
        PlannedEndTime: js.UndefOr[DateTime] = js.undefined,
        PlannedStartTime: js.UndefOr[DateTime] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined,
        Severity: js.UndefOr[OpsItemSeverity] = js.undefined,
        Status: js.UndefOr[OpsItemStatus] = js.undefined,
        Title: js.UndefOr[OpsItemTitle] = js.undefined
    ): UpdateOpsItemRequest = {
      val __obj = js.Dynamic.literal(
        "OpsItemId" -> OpsItemId.asInstanceOf[js.Any]
      )

      ActualEndTime.foreach(__v => __obj.updateDynamic("ActualEndTime")(__v.asInstanceOf[js.Any]))
      ActualStartTime.foreach(__v => __obj.updateDynamic("ActualStartTime")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.updateDynamic("OperationalData")(__v.asInstanceOf[js.Any]))
      OperationalDataToDelete.foreach(__v => __obj.updateDynamic("OperationalDataToDelete")(__v.asInstanceOf[js.Any]))
      PlannedEndTime.foreach(__v => __obj.updateDynamic("PlannedEndTime")(__v.asInstanceOf[js.Any]))
      PlannedStartTime.foreach(__v => __obj.updateDynamic("PlannedStartTime")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RelatedOpsItems.foreach(__v => __obj.updateDynamic("RelatedOpsItems")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOpsItemRequest]
    }
  }

  @js.native
  trait UpdateOpsItemResponse extends js.Object

  object UpdateOpsItemResponse {
    @inline
    def apply(): UpdateOpsItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOpsItemResponse]
    }
  }

  @js.native
  trait UpdateOpsMetadataRequest extends js.Object {
    var OpsMetadataArn: OpsMetadataArn
    var KeysToDelete: js.UndefOr[MetadataKeysToDeleteList]
    var MetadataToUpdate: js.UndefOr[MetadataMap]
  }

  object UpdateOpsMetadataRequest {
    @inline
    def apply(
        OpsMetadataArn: OpsMetadataArn,
        KeysToDelete: js.UndefOr[MetadataKeysToDeleteList] = js.undefined,
        MetadataToUpdate: js.UndefOr[MetadataMap] = js.undefined
    ): UpdateOpsMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "OpsMetadataArn" -> OpsMetadataArn.asInstanceOf[js.Any]
      )

      KeysToDelete.foreach(__v => __obj.updateDynamic("KeysToDelete")(__v.asInstanceOf[js.Any]))
      MetadataToUpdate.foreach(__v => __obj.updateDynamic("MetadataToUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOpsMetadataRequest]
    }
  }

  @js.native
  trait UpdateOpsMetadataResult extends js.Object {
    var OpsMetadataArn: js.UndefOr[OpsMetadataArn]
  }

  object UpdateOpsMetadataResult {
    @inline
    def apply(
        OpsMetadataArn: js.UndefOr[OpsMetadataArn] = js.undefined
    ): UpdateOpsMetadataResult = {
      val __obj = js.Dynamic.literal()
      OpsMetadataArn.foreach(__v => __obj.updateDynamic("OpsMetadataArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOpsMetadataResult]
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
    @inline
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
        Sources: js.UndefOr[PatchSourceList] = js.undefined
    ): UpdatePatchBaselineRequest = {
      val __obj = js.Dynamic.literal(
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )

      ApprovalRules.foreach(__v => __obj.updateDynamic("ApprovalRules")(__v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.updateDynamic("ApprovedPatches")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(__v => __obj.updateDynamic("ApprovedPatchesComplianceLevel")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesEnableNonSecurity.foreach(__v => __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.updateDynamic("GlobalFilters")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.updateDynamic("RejectedPatches")(__v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.updateDynamic("RejectedPatchesAction")(__v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.updateDynamic("Replace")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePatchBaselineRequest]
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
    @inline
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
        Sources: js.UndefOr[PatchSourceList] = js.undefined
    ): UpdatePatchBaselineResult = {
      val __obj = js.Dynamic.literal()
      ApprovalRules.foreach(__v => __obj.updateDynamic("ApprovalRules")(__v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.updateDynamic("ApprovedPatches")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(__v => __obj.updateDynamic("ApprovedPatchesComplianceLevel")(__v.asInstanceOf[js.Any]))
      ApprovedPatchesEnableNonSecurity.foreach(__v => __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(__v.asInstanceOf[js.Any]))
      BaselineId.foreach(__v => __obj.updateDynamic("BaselineId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.updateDynamic("GlobalFilters")(__v.asInstanceOf[js.Any]))
      ModifiedDate.foreach(__v => __obj.updateDynamic("ModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.updateDynamic("RejectedPatches")(__v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.updateDynamic("RejectedPatchesAction")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePatchBaselineResult]
    }
  }

  @js.native
  trait UpdateResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
    var SyncSource: ResourceDataSyncSource
    var SyncType: ResourceDataSyncType
  }

  object UpdateResourceDataSyncRequest {
    @inline
    def apply(
        SyncName: ResourceDataSyncName,
        SyncSource: ResourceDataSyncSource,
        SyncType: ResourceDataSyncType
    ): UpdateResourceDataSyncRequest = {
      val __obj = js.Dynamic.literal(
        "SyncName" -> SyncName.asInstanceOf[js.Any],
        "SyncSource" -> SyncSource.asInstanceOf[js.Any],
        "SyncType" -> SyncType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResourceDataSyncRequest]
    }
  }

  @js.native
  trait UpdateResourceDataSyncResult extends js.Object

  object UpdateResourceDataSyncResult {
    @inline
    def apply(): UpdateResourceDataSyncResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourceDataSyncResult]
    }
  }

  /** The request body of the UpdateServiceSetting API operation.
    */
  @js.native
  trait UpdateServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
    var SettingValue: ServiceSettingValue
  }

  object UpdateServiceSettingRequest {
    @inline
    def apply(
        SettingId: ServiceSettingId,
        SettingValue: ServiceSettingValue
    ): UpdateServiceSettingRequest = {
      val __obj = js.Dynamic.literal(
        "SettingId" -> SettingId.asInstanceOf[js.Any],
        "SettingValue" -> SettingValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceSettingRequest]
    }
  }

  /** The result body of the UpdateServiceSetting API operation.
    */
  @js.native
  trait UpdateServiceSettingResult extends js.Object

  object UpdateServiceSettingResult {
    @inline
    def apply(): UpdateServiceSettingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateServiceSettingResult]
    }
  }
}
