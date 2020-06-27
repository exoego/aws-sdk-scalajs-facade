package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ssm {
  type Account                                              = String
  type AccountId                                            = String
  type AccountIdList                                        = js.Array[AccountId]
  type AccountSharingInfoList                               = js.Array[AccountSharingInfo]
  type Accounts                                             = js.Array[Account]
  type ActivationCode                                       = String
  type ActivationDescription                                = String
  type ActivationId                                         = String
  type ActivationList                                       = js.Array[Activation]
  type AgentErrorCode                                       = String
  type AggregatorSchemaOnly                                 = Boolean
  type AllowedPattern                                       = String
  type ApproveAfterDays                                     = Int
  type AssociationDescriptionList                           = js.Array[AssociationDescription]
  type AssociationExecutionFilterList                       = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue                      = String
  type AssociationExecutionId                               = String
  type AssociationExecutionTargetsFilterList                = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue               = String
  type AssociationExecutionTargetsList                      = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList                            = js.Array[AssociationExecution]
  type AssociationFilterList                                = js.Array[AssociationFilter]
  type AssociationFilterValue                               = String
  type AssociationId                                        = String
  type AssociationIdList                                    = js.Array[AssociationId]
  type AssociationList                                      = js.Array[Association]
  type AssociationName                                      = String
  type AssociationResourceId                                = String
  type AssociationResourceType                              = String
  type AssociationStatusAggregatedCount                     = js.Dictionary[InstanceCount]
  type AssociationVersion                                   = String
  type AssociationVersionList                               = js.Array[AssociationVersionInfo]
  type AttachmentContentList                                = js.Array[AttachmentContent]
  type AttachmentHash                                       = String
  type AttachmentIdentifier                                 = String
  type AttachmentInformationList                            = js.Array[AttachmentInformation]
  type AttachmentName                                       = String
  type AttachmentUrl                                        = String
  type AttachmentsSourceList                                = js.Array[AttachmentsSource]
  type AttachmentsSourceValue                               = String
  type AttachmentsSourceValues                              = js.Array[AttachmentsSourceValue]
  type AttributeName                                        = String
  type AttributeValue                                       = String
  type AutomationActionName                                 = String
  type AutomationExecutionFilterList                        = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue                       = String
  type AutomationExecutionFilterValueList                   = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId                                = String
  type AutomationExecutionMetadataList                      = js.Array[AutomationExecutionMetadata]
  type AutomationParameterKey                               = String
  type AutomationParameterMap                               = js.Dictionary[AutomationParameterValueList]
  type AutomationParameterValue                             = String
  type AutomationParameterValueList                         = js.Array[AutomationParameterValue]
  type AutomationTargetParameterName                        = String
  type BaselineDescription                                  = String
  type BaselineId                                           = String
  type BaselineName                                         = String
  type BatchErrorMessage                                    = String
  type CalendarNameOrARN                                    = String
  type CalendarNameOrARNList                                = js.Array[CalendarNameOrARN]
  type ClientToken                                          = String
  type CloudWatchLogGroupName                               = String
  type CloudWatchOutputEnabled                              = Boolean
  type CommandFilterList                                    = js.Array[CommandFilter]
  type CommandFilterValue                                   = String
  type CommandId                                            = String
  type CommandInvocationList                                = js.Array[CommandInvocation]
  type CommandList                                          = js.Array[Command]
  type CommandMaxResults                                    = Int
  type CommandPluginList                                    = js.Array[CommandPlugin]
  type CommandPluginName                                    = String
  type CommandPluginOutput                                  = String
  type Comment                                              = String
  type CompletedCount                                       = Int
  type ComplianceExecutionId                                = String
  type ComplianceExecutionType                              = String
  type ComplianceFilterValue                                = String
  type ComplianceItemContentHash                            = String
  type ComplianceItemDetails                                = js.Dictionary[AttributeValue]
  type ComplianceItemEntryList                              = js.Array[ComplianceItemEntry]
  type ComplianceItemId                                     = String
  type ComplianceItemList                                   = js.Array[ComplianceItem]
  type ComplianceItemTitle                                  = String
  type ComplianceResourceId                                 = String
  type ComplianceResourceIdList                             = js.Array[ComplianceResourceId]
  type ComplianceResourceType                               = String
  type ComplianceResourceTypeList                           = js.Array[ComplianceResourceType]
  type ComplianceStringFilterKey                            = String
  type ComplianceStringFilterList                           = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList                      = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount                               = Int
  type ComplianceSummaryItemList                            = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName                                   = String
  type ComputerName                                         = String
  type ContentLength                                        = Double
  type CreateAssociationBatchRequestEntries                 = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate                                          = js.Date
  type DateTime                                             = js.Date
  type DefaultBaseline                                      = Boolean
  type DefaultInstanceName                                  = String
  type DeliveryTimedOutCount                                = Int
  type DescribeActivationsFilterList                        = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument                                = String
  type DocumentARN                                          = String
  type DocumentContent                                      = String
  type DocumentFilterList                                   = js.Array[DocumentFilter]
  type DocumentFilterValue                                  = String
  type DocumentHash                                         = String
  type DocumentIdentifierList                               = js.Array[DocumentIdentifier]
  type DocumentKeyValuesFilterKey                           = String
  type DocumentKeyValuesFilterList                          = js.Array[DocumentKeyValuesFilter]
  type DocumentKeyValuesFilterValue                         = String
  type DocumentKeyValuesFilterValues                        = js.Array[DocumentKeyValuesFilterValue]
  type DocumentName                                         = String
  type DocumentOwner                                        = String
  type DocumentParameterDefaultValue                        = String
  type DocumentParameterDescrption                          = String
  type DocumentParameterList                                = js.Array[DocumentParameter]
  type DocumentParameterName                                = String
  type DocumentRequiresList                                 = js.Array[DocumentRequires]
  type DocumentSchemaVersion                                = String
  type DocumentSha1                                         = String
  type DocumentStatusInformation                            = String
  type DocumentVersion                                      = String
  type DocumentVersionList                                  = js.Array[DocumentVersionInfo]
  type DocumentVersionName                                  = String
  type DocumentVersionNumber                                = String
  type DryRun                                               = Boolean
  type EffectiveInstanceAssociationMaxResults               = Int
  type EffectivePatchList                                   = js.Array[EffectivePatch]
  type ErrorCount                                           = Int
  type ExecutionRoleName                                    = String
  type ExpirationDate                                       = js.Date
  type FailedCreateAssociationList                          = js.Array[FailedCreateAssociation]
  type GetInventorySchemaMaxResults                         = Int
  type GetParametersByPathMaxResults                        = Int
  type IPAddress                                            = String
  type ISO8601String                                        = String
  type IamRole                                              = String
  type IdempotencyToken                                     = String
  type InstallOverrideList                                  = String
  type InstanceAssociationExecutionSummary                  = String
  type InstanceAssociationList                              = js.Array[InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount             = js.Dictionary[InstanceCount]
  type InstanceAssociationStatusInfos                       = js.Array[InstanceAssociationStatusInfo]
  type InstanceCount                                        = Int
  type InstanceId                                           = String
  type InstanceIdList                                       = js.Array[InstanceId]
  type InstanceInformationFilterList                        = js.Array[InstanceInformationFilter]
  type InstanceInformationFilterValue                       = String
  type InstanceInformationFilterValueSet                    = js.Array[InstanceInformationFilterValue]
  type InstanceInformationList                              = js.Array[InstanceInformation]
  type InstanceInformationStringFilterKey                   = String
  type InstanceInformationStringFilterList                  = js.Array[InstanceInformationStringFilter]
  type InstancePatchStateFilterKey                          = String
  type InstancePatchStateFilterList                         = js.Array[InstancePatchStateFilter]
  type InstancePatchStateFilterValue                        = String
  type InstancePatchStateFilterValues                       = js.Array[InstancePatchStateFilterValue]
  type InstancePatchStateList                               = js.Array[InstancePatchState]
  type InstancePatchStatesList                              = js.Array[InstancePatchState]
  type InstanceTagName                                      = String
  type InstancesCount                                       = Int
  type InventoryAggregatorExpression                        = String
  type InventoryAggregatorList                              = js.Array[InventoryAggregator]
  type InventoryDeletionId                                  = String
  type InventoryDeletionLastStatusMessage                   = String
  type InventoryDeletionLastStatusUpdateTime                = js.Date
  type InventoryDeletionStartTime                           = js.Date
  type InventoryDeletionSummaryItems                        = js.Array[InventoryDeletionSummaryItem]
  type InventoryDeletionsList                               = js.Array[InventoryDeletionStatusItem]
  type InventoryFilterKey                                   = String
  type InventoryFilterList                                  = js.Array[InventoryFilter]
  type InventoryFilterValue                                 = String
  type InventoryFilterValueList                             = js.Array[InventoryFilterValue]
  type InventoryGroupList                                   = js.Array[InventoryGroup]
  type InventoryGroupName                                   = String
  type InventoryItemAttributeList                           = js.Array[InventoryItemAttribute]
  type InventoryItemAttributeName                           = String
  type InventoryItemCaptureTime                             = String
  type InventoryItemContentContext                          = js.Dictionary[AttributeValue]
  type InventoryItemContentHash                             = String
  type InventoryItemEntry                                   = js.Dictionary[AttributeValue]
  type InventoryItemEntryList                               = js.Array[InventoryItemEntry]
  type InventoryItemList                                    = js.Array[InventoryItem]
  type InventoryItemSchemaResultList                        = js.Array[InventoryItemSchema]
  type InventoryItemSchemaVersion                           = String
  type InventoryItemTypeName                                = String
  type InventoryItemTypeNameFilter                          = String
  type InventoryResultEntityId                              = String
  type InventoryResultEntityList                            = js.Array[InventoryResultEntity]
  type InventoryResultItemKey                               = String
  type InventoryResultItemMap                               = js.Dictionary[InventoryResultItem]
  type InventoryTypeDisplayName                             = String
  type InvocationTraceOutput                                = String
  type IsSubTypeSchema                                      = Boolean
  type KeyList                                              = js.Array[TagKey]
  type LastResourceDataSyncMessage                          = String
  type LastResourceDataSyncTime                             = js.Date
  type LastSuccessfulResourceDataSyncTime                   = js.Date
  type MaintenanceWindowAllowUnassociatedTargets            = Boolean
  type MaintenanceWindowCutoff                              = Int
  type MaintenanceWindowDescription                         = String
  type MaintenanceWindowDurationHours                       = Int
  type MaintenanceWindowEnabled                             = Boolean
  type MaintenanceWindowExecutionId                         = String
  type MaintenanceWindowExecutionList                       = js.Array[MaintenanceWindowExecution]
  type MaintenanceWindowExecutionStatusDetails              = String
  type MaintenanceWindowExecutionTaskExecutionId            = String
  type MaintenanceWindowExecutionTaskId                     = String
  type MaintenanceWindowExecutionTaskIdList                 = js.Array[MaintenanceWindowExecutionTaskId]
  type MaintenanceWindowExecutionTaskIdentityList           = js.Array[MaintenanceWindowExecutionTaskIdentity]
  type MaintenanceWindowExecutionTaskInvocationId           = String
  type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[MaintenanceWindowExecutionTaskInvocationIdentity]
  type MaintenanceWindowExecutionTaskInvocationParameters   = String
  type MaintenanceWindowFilterKey                           = String
  type MaintenanceWindowFilterList                          = js.Array[MaintenanceWindowFilter]
  type MaintenanceWindowFilterValue                         = String
  type MaintenanceWindowFilterValues                        = js.Array[MaintenanceWindowFilterValue]
  type MaintenanceWindowId                                  = String
  type MaintenanceWindowIdentityList                        = js.Array[MaintenanceWindowIdentity]
  type MaintenanceWindowLambdaClientContext                 = String
  type MaintenanceWindowLambdaPayload                       = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MaintenanceWindowLambdaQualifier                     = String
  type MaintenanceWindowMaxResults                          = Int
  type MaintenanceWindowName                                = String
  type MaintenanceWindowSchedule                            = String
  type MaintenanceWindowSearchMaxResults                    = Int
  type MaintenanceWindowStepFunctionsInput                  = String
  type MaintenanceWindowStepFunctionsName                   = String
  type MaintenanceWindowStringDateTime                      = String
  type MaintenanceWindowTargetId                            = String
  type MaintenanceWindowTargetList                          = js.Array[MaintenanceWindowTarget]
  type MaintenanceWindowTaskArn                             = String
  type MaintenanceWindowTaskId                              = String
  type MaintenanceWindowTaskList                            = js.Array[MaintenanceWindowTask]
  type MaintenanceWindowTaskParameterName                   = String
  type MaintenanceWindowTaskParameterValue                  = String
  type MaintenanceWindowTaskParameterValueList              = js.Array[MaintenanceWindowTaskParameterValue]
  type MaintenanceWindowTaskParameters                      = js.Dictionary[MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList                  = js.Array[MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority                        = Int
  type MaintenanceWindowTaskTargetId                        = String
  type MaintenanceWindowTimezone                            = String
  type MaintenanceWindowsForTargetList                      = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId                                    = String
  type MaxConcurrency                                       = String
  type MaxErrors                                            = String
  type MaxResults                                           = Int
  type MaxResultsEC2Compatible                              = Int
  type NextToken                                            = String
  type NormalStringMap                                      = js.Dictionary[String]
  type NotificationArn                                      = String
  type NotificationEventList                                = js.Array[NotificationEvent]
  type OpsAggregatorList                                    = js.Array[OpsAggregator]
  type OpsAggregatorType                                    = String
  type OpsAggregatorValue                                   = String
  type OpsAggregatorValueKey                                = String
  type OpsAggregatorValueMap                                = js.Dictionary[OpsAggregatorValue]
  type OpsDataAttributeName                                 = String
  type OpsDataTypeName                                      = String
  type OpsEntityId                                          = String
  type OpsEntityItemCaptureTime                             = String
  type OpsEntityItemEntry                                   = js.Dictionary[AttributeValue]
  type OpsEntityItemEntryList                               = js.Array[OpsEntityItemEntry]
  type OpsEntityItemKey                                     = String
  type OpsEntityItemMap                                     = js.Dictionary[OpsEntityItem]
  type OpsEntityList                                        = js.Array[OpsEntity]
  type OpsFilterKey                                         = String
  type OpsFilterList                                        = js.Array[OpsFilter]
  type OpsFilterValue                                       = String
  type OpsFilterValueList                                   = js.Array[OpsFilterValue]
  type OpsItemCategory                                      = String
  type OpsItemDataKey                                       = String
  type OpsItemDataValueString                               = String
  type OpsItemDescription                                   = String
  type OpsItemFilterValue                                   = String
  type OpsItemFilterValues                                  = js.Array[OpsItemFilterValue]
  type OpsItemFilters                                       = js.Array[OpsItemFilter]
  type OpsItemId                                            = String
  type OpsItemMaxResults                                    = Int
  type OpsItemNotifications                                 = js.Array[OpsItemNotification]
  type OpsItemOperationalData                               = js.Dictionary[OpsItemDataValue]
  type OpsItemOpsDataKeysList                               = js.Array[String]
  type OpsItemPriority                                      = Int
  type OpsItemSeverity                                      = String
  type OpsItemSource                                        = String
  type OpsItemSummaries                                     = js.Array[OpsItemSummary]
  type OpsItemTitle                                         = String
  type OpsResultAttributeList                               = js.Array[OpsResultAttribute]
  type OutputSourceId                                       = String
  type OutputSourceType                                     = String
  type OwnerInformation                                     = String
  type PSParameterName                                      = String
  type PSParameterSelector                                  = String
  type PSParameterValue                                     = String
  type PSParameterVersion                                   = Double
  type ParameterDescription                                 = String
  type ParameterHistoryList                                 = js.Array[ParameterHistory]
  type ParameterKeyId                                       = String
  type ParameterLabel                                       = String
  type ParameterLabelList                                   = js.Array[ParameterLabel]
  type ParameterList                                        = js.Array[Parameter]
  type ParameterMetadataList                                = js.Array[ParameterMetadata]
  type ParameterName                                        = String
  type ParameterNameList                                    = js.Array[PSParameterName]
  type ParameterPolicies                                    = String
  type ParameterPolicyList                                  = js.Array[ParameterInlinePolicy]
  type ParameterStringFilterKey                             = String
  type ParameterStringFilterList                            = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue                           = String
  type ParameterStringFilterValueList                       = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption                           = String
  type ParameterValue                                       = String
  type ParameterValueList                                   = js.Array[ParameterValue]
  type Parameters                                           = js.Dictionary[ParameterValueList]
  type ParametersFilterList                                 = js.Array[ParametersFilter]
  type ParametersFilterValue                                = String
  type ParametersFilterValueList                            = js.Array[ParametersFilterValue]
  type PatchBaselineIdentityList                            = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults                              = Int
  type PatchClassification                                  = String
  type PatchComplianceDataList                              = js.Array[PatchComplianceData]
  type PatchComplianceMaxResults                            = Int
  type PatchContentUrl                                      = String
  type PatchDescription                                     = String
  type PatchFailedCount                                     = Int
  type PatchFilterList                                      = js.Array[PatchFilter]
  type PatchFilterValue                                     = String
  type PatchFilterValueList                                 = js.Array[PatchFilterValue]
  type PatchGroup                                           = String
  type PatchGroupList                                       = js.Array[PatchGroup]
  type PatchGroupPatchBaselineMappingList                   = js.Array[PatchGroupPatchBaselineMapping]
  type PatchId                                              = String
  type PatchIdList                                          = js.Array[PatchId]
  type PatchInstalledCount                                  = Int
  type PatchInstalledOtherCount                             = Int
  type PatchInstalledPendingRebootCount                     = Int
  type PatchInstalledRejectedCount                          = Int
  type PatchKbNumber                                        = String
  type PatchLanguage                                        = String
  type PatchList                                            = js.Array[Patch]
  type PatchMissingCount                                    = Int
  type PatchMsrcNumber                                      = String
  type PatchMsrcSeverity                                    = String
  type PatchNotApplicableCount                              = Int
  type PatchOrchestratorFilterKey                           = String
  type PatchOrchestratorFilterList                          = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue                         = String
  type PatchOrchestratorFilterValues                        = js.Array[PatchOrchestratorFilterValue]
  type PatchProduct                                         = String
  type PatchProductFamily                                   = String
  type PatchPropertiesList                                  = js.Array[PatchPropertyEntry]
  type PatchPropertyEntry                                   = js.Dictionary[AttributeValue]
  type PatchRuleList                                        = js.Array[PatchRule]
  type PatchSeverity                                        = String
  type PatchSourceConfiguration                             = String
  type PatchSourceList                                      = js.Array[PatchSource]
  type PatchSourceName                                      = String
  type PatchSourceProduct                                   = String
  type PatchSourceProductList                               = js.Array[PatchSourceProduct]
  type PatchStringDate                                      = String
  type PatchTitle                                           = String
  type PatchUnreportedNotApplicableCount                    = Int
  type PatchVendor                                          = String
  type PlatformTypeList                                     = js.Array[PlatformType]
  type Product                                              = String
  type PutInventoryMessage                                  = String
  type Region                                               = String
  type Regions                                              = js.Array[Region]
  type RegistrationLimit                                    = Int
  type RegistrationsCount                                   = Int
  type RelatedOpsItems                                      = js.Array[RelatedOpsItem]
  type RemainingCount                                       = Int
  type ResourceComplianceSummaryItemList                    = js.Array[ResourceComplianceSummaryItem]
  type ResourceCount                                        = Int
  type ResourceCountByStatus                                = String
  type ResourceDataSyncAWSKMSKeyARN                         = String
  type ResourceDataSyncCreatedTime                          = js.Date
  type ResourceDataSyncIncludeFutureRegions                 = Boolean
  type ResourceDataSyncItemList                             = js.Array[ResourceDataSyncItem]
  type ResourceDataSyncLastModifiedTime                     = js.Date
  type ResourceDataSyncName                                 = String
  type ResourceDataSyncOrganizationSourceType               = String
  type ResourceDataSyncOrganizationalUnitId                 = String
  type ResourceDataSyncOrganizationalUnitList               = js.Array[ResourceDataSyncOrganizationalUnit]
  type ResourceDataSyncS3BucketName                         = String
  type ResourceDataSyncS3Prefix                             = String
  type ResourceDataSyncS3Region                             = String
  type ResourceDataSyncSourceRegion                         = String
  type ResourceDataSyncSourceRegionList                     = js.Array[ResourceDataSyncSourceRegion]
  type ResourceDataSyncSourceType                           = String
  type ResourceDataSyncState                                = String
  type ResourceDataSyncType                                 = String
  type ResourceId                                           = String
  type ResponseCode                                         = Int
  type ResultAttributeList                                  = js.Array[ResultAttribute]
  type S3BucketName                                         = String
  type S3KeyPrefix                                          = String
  type S3Region                                             = String
  type ScheduleExpression                                   = String
  type ScheduledWindowExecutionList                         = js.Array[ScheduledWindowExecution]
  type ServiceRole                                          = String
  type ServiceSettingId                                     = String
  type ServiceSettingValue                                  = String
  type SessionDetails                                       = String
  type SessionFilterList                                    = js.Array[SessionFilter]
  type SessionFilterValue                                   = String
  type SessionId                                            = String
  type SessionList                                          = js.Array[Session]
  type SessionManagerCloudWatchOutputUrl                    = String
  type SessionManagerParameterName                          = String
  type SessionManagerParameterValue                         = String
  type SessionManagerParameterValueList                     = js.Array[SessionManagerParameterValue]
  type SessionManagerParameters                             = js.Dictionary[SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl                            = String
  type SessionMaxResults                                    = Int
  type SessionOwner                                         = String
  type SessionTarget                                        = String
  type SharedDocumentVersion                                = String
  type SnapshotDownloadUrl                                  = String
  type SnapshotId                                           = String
  type StandardErrorContent                                 = String
  type StandardOutputContent                                = String
  type StatusAdditionalInfo                                 = String
  type StatusDetails                                        = String
  type StatusMessage                                        = String
  type StatusName                                           = String
  type StepExecutionFilterList                              = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue                             = String
  type StepExecutionFilterValueList                         = js.Array[StepExecutionFilterValue]
  type StepExecutionList                                    = js.Array[StepExecution]
  type StreamUrl                                            = String
  type StringDateTime                                       = String
  type StringList                                           = js.Array[String]
  type TagKey                                               = String
  type TagList                                              = js.Array[Tag]
  type TagValue                                             = String
  type TargetCount                                          = Int
  type TargetKey                                            = String
  type TargetLocations                                      = js.Array[TargetLocation]
  type TargetMap                                            = js.Dictionary[TargetMapValueList]
  type TargetMapKey                                         = String
  type TargetMapValue                                       = String
  type TargetMapValueList                                   = js.Array[TargetMapValue]
  type TargetMaps                                           = js.Array[TargetMap]
  type TargetParameterList                                  = js.Array[ParameterValue]
  type TargetType                                           = String
  type TargetValue                                          = String
  type TargetValues                                         = js.Array[TargetValue]
  type Targets                                              = js.Array[Target]
  type TimeoutSeconds                                       = Int
  type TokenValue                                           = String
  type TotalCount                                           = Int
  type Url                                                  = String
  type ValidNextStep                                        = String
  type ValidNextStepList                                    = js.Array[ValidNextStep]
  type Version                                              = String

  implicit final class SSMOps(private val service: SSM) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResult] =
      service.addTagsToResource(params).promise().toFuture
    @inline def cancelCommandFuture(params: CancelCommandRequest): Future[CancelCommandResult] =
      service.cancelCommand(params).promise().toFuture
    @inline def cancelMaintenanceWindowExecutionFuture(
        params: CancelMaintenanceWindowExecutionRequest
    ): Future[CancelMaintenanceWindowExecutionResult] =
      service.cancelMaintenanceWindowExecution(params).promise().toFuture
    @inline def createActivationFuture(params: CreateActivationRequest): Future[CreateActivationResult] =
      service.createActivation(params).promise().toFuture
    @inline def createAssociationBatchFuture(
        params: CreateAssociationBatchRequest
    ): Future[CreateAssociationBatchResult] = service.createAssociationBatch(params).promise().toFuture
    @inline def createAssociationFuture(params: CreateAssociationRequest): Future[CreateAssociationResult] =
      service.createAssociation(params).promise().toFuture
    @inline def createDocumentFuture(params: CreateDocumentRequest): Future[CreateDocumentResult] =
      service.createDocument(params).promise().toFuture
    @inline def createMaintenanceWindowFuture(
        params: CreateMaintenanceWindowRequest
    ): Future[CreateMaintenanceWindowResult] = service.createMaintenanceWindow(params).promise().toFuture
    @inline def createOpsItemFuture(params: CreateOpsItemRequest): Future[CreateOpsItemResponse] =
      service.createOpsItem(params).promise().toFuture
    @inline def createPatchBaselineFuture(params: CreatePatchBaselineRequest): Future[CreatePatchBaselineResult] =
      service.createPatchBaseline(params).promise().toFuture
    @inline def createResourceDataSyncFuture(
        params: CreateResourceDataSyncRequest
    ): Future[CreateResourceDataSyncResult] = service.createResourceDataSync(params).promise().toFuture
    @inline def deleteActivationFuture(params: DeleteActivationRequest): Future[DeleteActivationResult] =
      service.deleteActivation(params).promise().toFuture
    @inline def deleteAssociationFuture(params: DeleteAssociationRequest): Future[DeleteAssociationResult] =
      service.deleteAssociation(params).promise().toFuture
    @inline def deleteDocumentFuture(params: DeleteDocumentRequest): Future[DeleteDocumentResult] =
      service.deleteDocument(params).promise().toFuture
    @inline def deleteInventoryFuture(params: DeleteInventoryRequest): Future[DeleteInventoryResult] =
      service.deleteInventory(params).promise().toFuture
    @inline def deleteMaintenanceWindowFuture(
        params: DeleteMaintenanceWindowRequest
    ): Future[DeleteMaintenanceWindowResult] = service.deleteMaintenanceWindow(params).promise().toFuture
    @inline def deleteParameterFuture(params: DeleteParameterRequest): Future[DeleteParameterResult] =
      service.deleteParameter(params).promise().toFuture
    @inline def deleteParametersFuture(params: DeleteParametersRequest): Future[DeleteParametersResult] =
      service.deleteParameters(params).promise().toFuture
    @inline def deletePatchBaselineFuture(params: DeletePatchBaselineRequest): Future[DeletePatchBaselineResult] =
      service.deletePatchBaseline(params).promise().toFuture
    @inline def deleteResourceDataSyncFuture(
        params: DeleteResourceDataSyncRequest
    ): Future[DeleteResourceDataSyncResult] = service.deleteResourceDataSync(params).promise().toFuture
    @inline def deregisterManagedInstanceFuture(
        params: DeregisterManagedInstanceRequest
    ): Future[DeregisterManagedInstanceResult] = service.deregisterManagedInstance(params).promise().toFuture
    @inline def deregisterPatchBaselineForPatchGroupFuture(
        params: DeregisterPatchBaselineForPatchGroupRequest
    ): Future[DeregisterPatchBaselineForPatchGroupResult] =
      service.deregisterPatchBaselineForPatchGroup(params).promise().toFuture
    @inline def deregisterTargetFromMaintenanceWindowFuture(
        params: DeregisterTargetFromMaintenanceWindowRequest
    ): Future[DeregisterTargetFromMaintenanceWindowResult] =
      service.deregisterTargetFromMaintenanceWindow(params).promise().toFuture
    @inline def deregisterTaskFromMaintenanceWindowFuture(
        params: DeregisterTaskFromMaintenanceWindowRequest
    ): Future[DeregisterTaskFromMaintenanceWindowResult] =
      service.deregisterTaskFromMaintenanceWindow(params).promise().toFuture
    @inline def describeActivationsFuture(params: DescribeActivationsRequest): Future[DescribeActivationsResult] =
      service.describeActivations(params).promise().toFuture
    @inline def describeAssociationExecutionTargetsFuture(
        params: DescribeAssociationExecutionTargetsRequest
    ): Future[DescribeAssociationExecutionTargetsResult] =
      service.describeAssociationExecutionTargets(params).promise().toFuture
    @inline def describeAssociationExecutionsFuture(
        params: DescribeAssociationExecutionsRequest
    ): Future[DescribeAssociationExecutionsResult] = service.describeAssociationExecutions(params).promise().toFuture
    @inline def describeAssociationFuture(params: DescribeAssociationRequest): Future[DescribeAssociationResult] =
      service.describeAssociation(params).promise().toFuture
    @inline def describeAutomationExecutionsFuture(
        params: DescribeAutomationExecutionsRequest
    ): Future[DescribeAutomationExecutionsResult] = service.describeAutomationExecutions(params).promise().toFuture
    @inline def describeAutomationStepExecutionsFuture(
        params: DescribeAutomationStepExecutionsRequest
    ): Future[DescribeAutomationStepExecutionsResult] =
      service.describeAutomationStepExecutions(params).promise().toFuture
    @inline def describeAvailablePatchesFuture(
        params: DescribeAvailablePatchesRequest
    ): Future[DescribeAvailablePatchesResult] = service.describeAvailablePatches(params).promise().toFuture
    @inline def describeDocumentFuture(params: DescribeDocumentRequest): Future[DescribeDocumentResult] =
      service.describeDocument(params).promise().toFuture
    @inline def describeDocumentPermissionFuture(
        params: DescribeDocumentPermissionRequest
    ): Future[DescribeDocumentPermissionResponse] = service.describeDocumentPermission(params).promise().toFuture
    @inline def describeEffectiveInstanceAssociationsFuture(
        params: DescribeEffectiveInstanceAssociationsRequest
    ): Future[DescribeEffectiveInstanceAssociationsResult] =
      service.describeEffectiveInstanceAssociations(params).promise().toFuture
    @inline def describeEffectivePatchesForPatchBaselineFuture(
        params: DescribeEffectivePatchesForPatchBaselineRequest
    ): Future[DescribeEffectivePatchesForPatchBaselineResult] =
      service.describeEffectivePatchesForPatchBaseline(params).promise().toFuture
    @inline def describeInstanceAssociationsStatusFuture(
        params: DescribeInstanceAssociationsStatusRequest
    ): Future[DescribeInstanceAssociationsStatusResult] =
      service.describeInstanceAssociationsStatus(params).promise().toFuture
    @inline def describeInstanceInformationFuture(
        params: DescribeInstanceInformationRequest
    ): Future[DescribeInstanceInformationResult] = service.describeInstanceInformation(params).promise().toFuture
    @inline def describeInstancePatchStatesForPatchGroupFuture(
        params: DescribeInstancePatchStatesForPatchGroupRequest
    ): Future[DescribeInstancePatchStatesForPatchGroupResult] =
      service.describeInstancePatchStatesForPatchGroup(params).promise().toFuture
    @inline def describeInstancePatchStatesFuture(
        params: DescribeInstancePatchStatesRequest
    ): Future[DescribeInstancePatchStatesResult] = service.describeInstancePatchStates(params).promise().toFuture
    @inline def describeInstancePatchesFuture(
        params: DescribeInstancePatchesRequest
    ): Future[DescribeInstancePatchesResult] = service.describeInstancePatches(params).promise().toFuture
    @inline def describeInventoryDeletionsFuture(
        params: DescribeInventoryDeletionsRequest
    ): Future[DescribeInventoryDeletionsResult] = service.describeInventoryDeletions(params).promise().toFuture
    @inline def describeMaintenanceWindowExecutionTaskInvocationsFuture(
        params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest
    ): Future[DescribeMaintenanceWindowExecutionTaskInvocationsResult] =
      service.describeMaintenanceWindowExecutionTaskInvocations(params).promise().toFuture
    @inline def describeMaintenanceWindowExecutionTasksFuture(
        params: DescribeMaintenanceWindowExecutionTasksRequest
    ): Future[DescribeMaintenanceWindowExecutionTasksResult] =
      service.describeMaintenanceWindowExecutionTasks(params).promise().toFuture
    @inline def describeMaintenanceWindowExecutionsFuture(
        params: DescribeMaintenanceWindowExecutionsRequest
    ): Future[DescribeMaintenanceWindowExecutionsResult] =
      service.describeMaintenanceWindowExecutions(params).promise().toFuture
    @inline def describeMaintenanceWindowScheduleFuture(
        params: DescribeMaintenanceWindowScheduleRequest
    ): Future[DescribeMaintenanceWindowScheduleResult] =
      service.describeMaintenanceWindowSchedule(params).promise().toFuture
    @inline def describeMaintenanceWindowTargetsFuture(
        params: DescribeMaintenanceWindowTargetsRequest
    ): Future[DescribeMaintenanceWindowTargetsResult] =
      service.describeMaintenanceWindowTargets(params).promise().toFuture
    @inline def describeMaintenanceWindowTasksFuture(
        params: DescribeMaintenanceWindowTasksRequest
    ): Future[DescribeMaintenanceWindowTasksResult] = service.describeMaintenanceWindowTasks(params).promise().toFuture
    @inline def describeMaintenanceWindowsForTargetFuture(
        params: DescribeMaintenanceWindowsForTargetRequest
    ): Future[DescribeMaintenanceWindowsForTargetResult] =
      service.describeMaintenanceWindowsForTarget(params).promise().toFuture
    @inline def describeMaintenanceWindowsFuture(
        params: DescribeMaintenanceWindowsRequest
    ): Future[DescribeMaintenanceWindowsResult] = service.describeMaintenanceWindows(params).promise().toFuture
    @inline def describeOpsItemsFuture(params: DescribeOpsItemsRequest): Future[DescribeOpsItemsResponse] =
      service.describeOpsItems(params).promise().toFuture
    @inline def describeParametersFuture(params: DescribeParametersRequest): Future[DescribeParametersResult] =
      service.describeParameters(params).promise().toFuture
    @inline def describePatchBaselinesFuture(
        params: DescribePatchBaselinesRequest
    ): Future[DescribePatchBaselinesResult] = service.describePatchBaselines(params).promise().toFuture
    @inline def describePatchGroupStateFuture(
        params: DescribePatchGroupStateRequest
    ): Future[DescribePatchGroupStateResult] = service.describePatchGroupState(params).promise().toFuture
    @inline def describePatchGroupsFuture(params: DescribePatchGroupsRequest): Future[DescribePatchGroupsResult] =
      service.describePatchGroups(params).promise().toFuture
    @inline def describePatchPropertiesFuture(
        params: DescribePatchPropertiesRequest
    ): Future[DescribePatchPropertiesResult] = service.describePatchProperties(params).promise().toFuture
    @inline def describeSessionsFuture(params: DescribeSessionsRequest): Future[DescribeSessionsResponse] =
      service.describeSessions(params).promise().toFuture
    @inline def getAutomationExecutionFuture(
        params: GetAutomationExecutionRequest
    ): Future[GetAutomationExecutionResult] = service.getAutomationExecution(params).promise().toFuture
    @inline def getCalendarStateFuture(params: GetCalendarStateRequest): Future[GetCalendarStateResponse] =
      service.getCalendarState(params).promise().toFuture
    @inline def getCommandInvocationFuture(params: GetCommandInvocationRequest): Future[GetCommandInvocationResult] =
      service.getCommandInvocation(params).promise().toFuture
    @inline def getConnectionStatusFuture(params: GetConnectionStatusRequest): Future[GetConnectionStatusResponse] =
      service.getConnectionStatus(params).promise().toFuture
    @inline def getDefaultPatchBaselineFuture(
        params: GetDefaultPatchBaselineRequest
    ): Future[GetDefaultPatchBaselineResult] = service.getDefaultPatchBaseline(params).promise().toFuture
    @inline def getDeployablePatchSnapshotForInstanceFuture(
        params: GetDeployablePatchSnapshotForInstanceRequest
    ): Future[GetDeployablePatchSnapshotForInstanceResult] =
      service.getDeployablePatchSnapshotForInstance(params).promise().toFuture
    @inline def getDocumentFuture(params: GetDocumentRequest): Future[GetDocumentResult] =
      service.getDocument(params).promise().toFuture
    @inline def getInventoryFuture(params: GetInventoryRequest): Future[GetInventoryResult] =
      service.getInventory(params).promise().toFuture
    @inline def getInventorySchemaFuture(params: GetInventorySchemaRequest): Future[GetInventorySchemaResult] =
      service.getInventorySchema(params).promise().toFuture
    @inline def getMaintenanceWindowExecutionFuture(
        params: GetMaintenanceWindowExecutionRequest
    ): Future[GetMaintenanceWindowExecutionResult] = service.getMaintenanceWindowExecution(params).promise().toFuture
    @inline def getMaintenanceWindowExecutionTaskFuture(
        params: GetMaintenanceWindowExecutionTaskRequest
    ): Future[GetMaintenanceWindowExecutionTaskResult] =
      service.getMaintenanceWindowExecutionTask(params).promise().toFuture
    @inline def getMaintenanceWindowExecutionTaskInvocationFuture(
        params: GetMaintenanceWindowExecutionTaskInvocationRequest
    ): Future[GetMaintenanceWindowExecutionTaskInvocationResult] =
      service.getMaintenanceWindowExecutionTaskInvocation(params).promise().toFuture
    @inline def getMaintenanceWindowFuture(params: GetMaintenanceWindowRequest): Future[GetMaintenanceWindowResult] =
      service.getMaintenanceWindow(params).promise().toFuture
    @inline def getMaintenanceWindowTaskFuture(
        params: GetMaintenanceWindowTaskRequest
    ): Future[GetMaintenanceWindowTaskResult] = service.getMaintenanceWindowTask(params).promise().toFuture
    @inline def getOpsItemFuture(params: GetOpsItemRequest): Future[GetOpsItemResponse] =
      service.getOpsItem(params).promise().toFuture
    @inline def getOpsSummaryFuture(params: GetOpsSummaryRequest): Future[GetOpsSummaryResult] =
      service.getOpsSummary(params).promise().toFuture
    @inline def getParameterFuture(params: GetParameterRequest): Future[GetParameterResult] =
      service.getParameter(params).promise().toFuture
    @inline def getParameterHistoryFuture(params: GetParameterHistoryRequest): Future[GetParameterHistoryResult] =
      service.getParameterHistory(params).promise().toFuture
    @inline def getParametersByPathFuture(params: GetParametersByPathRequest): Future[GetParametersByPathResult] =
      service.getParametersByPath(params).promise().toFuture
    @inline def getParametersFuture(params: GetParametersRequest): Future[GetParametersResult] =
      service.getParameters(params).promise().toFuture
    @inline def getPatchBaselineForPatchGroupFuture(
        params: GetPatchBaselineForPatchGroupRequest
    ): Future[GetPatchBaselineForPatchGroupResult] = service.getPatchBaselineForPatchGroup(params).promise().toFuture
    @inline def getPatchBaselineFuture(params: GetPatchBaselineRequest): Future[GetPatchBaselineResult] =
      service.getPatchBaseline(params).promise().toFuture
    @inline def getServiceSettingFuture(params: GetServiceSettingRequest): Future[GetServiceSettingResult] =
      service.getServiceSetting(params).promise().toFuture
    @inline def labelParameterVersionFuture(params: LabelParameterVersionRequest): Future[LabelParameterVersionResult] =
      service.labelParameterVersion(params).promise().toFuture
    @inline def listAssociationVersionsFuture(
        params: ListAssociationVersionsRequest
    ): Future[ListAssociationVersionsResult] = service.listAssociationVersions(params).promise().toFuture
    @inline def listAssociationsFuture(params: ListAssociationsRequest): Future[ListAssociationsResult] =
      service.listAssociations(params).promise().toFuture
    @inline def listCommandInvocationsFuture(
        params: ListCommandInvocationsRequest
    ): Future[ListCommandInvocationsResult] = service.listCommandInvocations(params).promise().toFuture
    @inline def listCommandsFuture(params: ListCommandsRequest): Future[ListCommandsResult] =
      service.listCommands(params).promise().toFuture
    @inline def listComplianceItemsFuture(params: ListComplianceItemsRequest): Future[ListComplianceItemsResult] =
      service.listComplianceItems(params).promise().toFuture
    @inline def listComplianceSummariesFuture(
        params: ListComplianceSummariesRequest
    ): Future[ListComplianceSummariesResult] = service.listComplianceSummaries(params).promise().toFuture
    @inline def listDocumentVersionsFuture(params: ListDocumentVersionsRequest): Future[ListDocumentVersionsResult] =
      service.listDocumentVersions(params).promise().toFuture
    @inline def listDocumentsFuture(params: ListDocumentsRequest): Future[ListDocumentsResult] =
      service.listDocuments(params).promise().toFuture
    @inline def listInventoryEntriesFuture(params: ListInventoryEntriesRequest): Future[ListInventoryEntriesResult] =
      service.listInventoryEntries(params).promise().toFuture
    @inline def listResourceComplianceSummariesFuture(
        params: ListResourceComplianceSummariesRequest
    ): Future[ListResourceComplianceSummariesResult] =
      service.listResourceComplianceSummaries(params).promise().toFuture
    @inline def listResourceDataSyncFuture(params: ListResourceDataSyncRequest): Future[ListResourceDataSyncResult] =
      service.listResourceDataSync(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyDocumentPermissionFuture(
        params: ModifyDocumentPermissionRequest
    ): Future[ModifyDocumentPermissionResponse] = service.modifyDocumentPermission(params).promise().toFuture
    @inline def putComplianceItemsFuture(params: PutComplianceItemsRequest): Future[PutComplianceItemsResult] =
      service.putComplianceItems(params).promise().toFuture
    @inline def putInventoryFuture(params: PutInventoryRequest): Future[PutInventoryResult] =
      service.putInventory(params).promise().toFuture
    @inline def putParameterFuture(params: PutParameterRequest): Future[PutParameterResult] =
      service.putParameter(params).promise().toFuture
    @inline def registerDefaultPatchBaselineFuture(
        params: RegisterDefaultPatchBaselineRequest
    ): Future[RegisterDefaultPatchBaselineResult] = service.registerDefaultPatchBaseline(params).promise().toFuture
    @inline def registerPatchBaselineForPatchGroupFuture(
        params: RegisterPatchBaselineForPatchGroupRequest
    ): Future[RegisterPatchBaselineForPatchGroupResult] =
      service.registerPatchBaselineForPatchGroup(params).promise().toFuture
    @inline def registerTargetWithMaintenanceWindowFuture(
        params: RegisterTargetWithMaintenanceWindowRequest
    ): Future[RegisterTargetWithMaintenanceWindowResult] =
      service.registerTargetWithMaintenanceWindow(params).promise().toFuture
    @inline def registerTaskWithMaintenanceWindowFuture(
        params: RegisterTaskWithMaintenanceWindowRequest
    ): Future[RegisterTaskWithMaintenanceWindowResult] =
      service.registerTaskWithMaintenanceWindow(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(
        params: RemoveTagsFromResourceRequest
    ): Future[RemoveTagsFromResourceResult] = service.removeTagsFromResource(params).promise().toFuture
    @inline def resetServiceSettingFuture(params: ResetServiceSettingRequest): Future[ResetServiceSettingResult] =
      service.resetServiceSetting(params).promise().toFuture
    @inline def resumeSessionFuture(params: ResumeSessionRequest): Future[ResumeSessionResponse] =
      service.resumeSession(params).promise().toFuture
    @inline def sendAutomationSignalFuture(params: SendAutomationSignalRequest): Future[SendAutomationSignalResult] =
      service.sendAutomationSignal(params).promise().toFuture
    @inline def sendCommandFuture(params: SendCommandRequest): Future[SendCommandResult] =
      service.sendCommand(params).promise().toFuture
    @inline def startAssociationsOnceFuture(params: StartAssociationsOnceRequest): Future[StartAssociationsOnceResult] =
      service.startAssociationsOnce(params).promise().toFuture
    @inline def startAutomationExecutionFuture(
        params: StartAutomationExecutionRequest
    ): Future[StartAutomationExecutionResult] = service.startAutomationExecution(params).promise().toFuture
    @inline def startSessionFuture(params: StartSessionRequest): Future[StartSessionResponse] =
      service.startSession(params).promise().toFuture
    @inline def stopAutomationExecutionFuture(
        params: StopAutomationExecutionRequest
    ): Future[StopAutomationExecutionResult] = service.stopAutomationExecution(params).promise().toFuture
    @inline def terminateSessionFuture(params: TerminateSessionRequest): Future[TerminateSessionResponse] =
      service.terminateSession(params).promise().toFuture
    @inline def updateAssociationFuture(params: UpdateAssociationRequest): Future[UpdateAssociationResult] =
      service.updateAssociation(params).promise().toFuture
    @inline def updateAssociationStatusFuture(
        params: UpdateAssociationStatusRequest
    ): Future[UpdateAssociationStatusResult] = service.updateAssociationStatus(params).promise().toFuture
    @inline def updateDocumentDefaultVersionFuture(
        params: UpdateDocumentDefaultVersionRequest
    ): Future[UpdateDocumentDefaultVersionResult] = service.updateDocumentDefaultVersion(params).promise().toFuture
    @inline def updateDocumentFuture(params: UpdateDocumentRequest): Future[UpdateDocumentResult] =
      service.updateDocument(params).promise().toFuture
    @inline def updateMaintenanceWindowFuture(
        params: UpdateMaintenanceWindowRequest
    ): Future[UpdateMaintenanceWindowResult] = service.updateMaintenanceWindow(params).promise().toFuture
    @inline def updateMaintenanceWindowTargetFuture(
        params: UpdateMaintenanceWindowTargetRequest
    ): Future[UpdateMaintenanceWindowTargetResult] = service.updateMaintenanceWindowTarget(params).promise().toFuture
    @inline def updateMaintenanceWindowTaskFuture(
        params: UpdateMaintenanceWindowTaskRequest
    ): Future[UpdateMaintenanceWindowTaskResult] = service.updateMaintenanceWindowTask(params).promise().toFuture
    @inline def updateManagedInstanceRoleFuture(
        params: UpdateManagedInstanceRoleRequest
    ): Future[UpdateManagedInstanceRoleResult] = service.updateManagedInstanceRole(params).promise().toFuture
    @inline def updateOpsItemFuture(params: UpdateOpsItemRequest): Future[UpdateOpsItemResponse] =
      service.updateOpsItem(params).promise().toFuture
    @inline def updatePatchBaselineFuture(params: UpdatePatchBaselineRequest): Future[UpdatePatchBaselineResult] =
      service.updatePatchBaseline(params).promise().toFuture
    @inline def updateResourceDataSyncFuture(
        params: UpdateResourceDataSyncRequest
    ): Future[UpdateResourceDataSyncResult] = service.updateResourceDataSync(params).promise().toFuture
    @inline def updateServiceSettingFuture(params: UpdateServiceSettingRequest): Future[UpdateServiceSettingResult] =
      service.updateServiceSetting(params).promise().toFuture
  }
}

package ssm {
  @js.native
  @JSImport("aws-sdk", "SSM")
  class SSM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult] = js.native
    def cancelCommand(params: CancelCommandRequest): Request[CancelCommandResult]             = js.native
    def cancelMaintenanceWindowExecution(
        params: CancelMaintenanceWindowExecutionRequest
    ): Request[CancelMaintenanceWindowExecutionResult]                                                       = js.native
    def createActivation(params: CreateActivationRequest): Request[CreateActivationResult]                   = js.native
    def createAssociation(params: CreateAssociationRequest): Request[CreateAssociationResult]                = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest): Request[CreateAssociationBatchResult] = js.native
    def createDocument(params: CreateDocumentRequest): Request[CreateDocumentResult]                         = js.native
    def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): Request[CreateMaintenanceWindowResult] =
      js.native
    def createOpsItem(params: CreateOpsItemRequest): Request[CreateOpsItemResponse]                          = js.native
    def createPatchBaseline(params: CreatePatchBaselineRequest): Request[CreatePatchBaselineResult]          = js.native
    def createResourceDataSync(params: CreateResourceDataSyncRequest): Request[CreateResourceDataSyncResult] = js.native
    def deleteActivation(params: DeleteActivationRequest): Request[DeleteActivationResult]                   = js.native
    def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResult]                = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[DeleteDocumentResult]                         = js.native
    def deleteInventory(params: DeleteInventoryRequest): Request[DeleteInventoryResult]                      = js.native
    def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): Request[DeleteMaintenanceWindowResult] =
      js.native
    def deleteParameter(params: DeleteParameterRequest): Request[DeleteParameterResult]                      = js.native
    def deleteParameters(params: DeleteParametersRequest): Request[DeleteParametersResult]                   = js.native
    def deletePatchBaseline(params: DeletePatchBaselineRequest): Request[DeletePatchBaselineResult]          = js.native
    def deleteResourceDataSync(params: DeleteResourceDataSyncRequest): Request[DeleteResourceDataSyncResult] = js.native
    def deregisterManagedInstance(params: DeregisterManagedInstanceRequest): Request[DeregisterManagedInstanceResult] =
      js.native
    def deregisterPatchBaselineForPatchGroup(
        params: DeregisterPatchBaselineForPatchGroupRequest
    ): Request[DeregisterPatchBaselineForPatchGroupResult] = js.native
    def deregisterTargetFromMaintenanceWindow(
        params: DeregisterTargetFromMaintenanceWindowRequest
    ): Request[DeregisterTargetFromMaintenanceWindowResult] = js.native
    def deregisterTaskFromMaintenanceWindow(
        params: DeregisterTaskFromMaintenanceWindowRequest
    ): Request[DeregisterTaskFromMaintenanceWindowResult]                                           = js.native
    def describeActivations(params: DescribeActivationsRequest): Request[DescribeActivationsResult] = js.native
    def describeAssociation(params: DescribeAssociationRequest): Request[DescribeAssociationResult] = js.native
    def describeAssociationExecutionTargets(
        params: DescribeAssociationExecutionTargetsRequest
    ): Request[DescribeAssociationExecutionTargetsResult] = js.native
    def describeAssociationExecutions(
        params: DescribeAssociationExecutionsRequest
    ): Request[DescribeAssociationExecutionsResult] = js.native
    def describeAutomationExecutions(
        params: DescribeAutomationExecutionsRequest
    ): Request[DescribeAutomationExecutionsResult] = js.native
    def describeAutomationStepExecutions(
        params: DescribeAutomationStepExecutionsRequest
    ): Request[DescribeAutomationStepExecutionsResult] = js.native
    def describeAvailablePatches(params: DescribeAvailablePatchesRequest): Request[DescribeAvailablePatchesResult] =
      js.native
    def describeDocument(params: DescribeDocumentRequest): Request[DescribeDocumentResult] = js.native
    def describeDocumentPermission(
        params: DescribeDocumentPermissionRequest
    ): Request[DescribeDocumentPermissionResponse] = js.native
    def describeEffectiveInstanceAssociations(
        params: DescribeEffectiveInstanceAssociationsRequest
    ): Request[DescribeEffectiveInstanceAssociationsResult] = js.native
    def describeEffectivePatchesForPatchBaseline(
        params: DescribeEffectivePatchesForPatchBaselineRequest
    ): Request[DescribeEffectivePatchesForPatchBaselineResult] = js.native
    def describeInstanceAssociationsStatus(
        params: DescribeInstanceAssociationsStatusRequest
    ): Request[DescribeInstanceAssociationsStatusResult] = js.native
    def describeInstanceInformation(
        params: DescribeInstanceInformationRequest
    ): Request[DescribeInstanceInformationResult] = js.native
    def describeInstancePatchStates(
        params: DescribeInstancePatchStatesRequest
    ): Request[DescribeInstancePatchStatesResult] = js.native
    def describeInstancePatchStatesForPatchGroup(
        params: DescribeInstancePatchStatesForPatchGroupRequest
    ): Request[DescribeInstancePatchStatesForPatchGroupResult] = js.native
    def describeInstancePatches(params: DescribeInstancePatchesRequest): Request[DescribeInstancePatchesResult] =
      js.native
    def describeInventoryDeletions(
        params: DescribeInventoryDeletionsRequest
    ): Request[DescribeInventoryDeletionsResult] = js.native
    def describeMaintenanceWindowExecutionTaskInvocations(
        params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest
    ): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult] = js.native
    def describeMaintenanceWindowExecutionTasks(
        params: DescribeMaintenanceWindowExecutionTasksRequest
    ): Request[DescribeMaintenanceWindowExecutionTasksResult] = js.native
    def describeMaintenanceWindowExecutions(
        params: DescribeMaintenanceWindowExecutionsRequest
    ): Request[DescribeMaintenanceWindowExecutionsResult] = js.native
    def describeMaintenanceWindowSchedule(
        params: DescribeMaintenanceWindowScheduleRequest
    ): Request[DescribeMaintenanceWindowScheduleResult] = js.native
    def describeMaintenanceWindowTargets(
        params: DescribeMaintenanceWindowTargetsRequest
    ): Request[DescribeMaintenanceWindowTargetsResult] = js.native
    def describeMaintenanceWindowTasks(
        params: DescribeMaintenanceWindowTasksRequest
    ): Request[DescribeMaintenanceWindowTasksResult] = js.native
    def describeMaintenanceWindows(
        params: DescribeMaintenanceWindowsRequest
    ): Request[DescribeMaintenanceWindowsResult] = js.native
    def describeMaintenanceWindowsForTarget(
        params: DescribeMaintenanceWindowsForTargetRequest
    ): Request[DescribeMaintenanceWindowsForTargetResult]                                                    = js.native
    def describeOpsItems(params: DescribeOpsItemsRequest): Request[DescribeOpsItemsResponse]                 = js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResult]             = js.native
    def describePatchBaselines(params: DescribePatchBaselinesRequest): Request[DescribePatchBaselinesResult] = js.native
    def describePatchGroupState(params: DescribePatchGroupStateRequest): Request[DescribePatchGroupStateResult] =
      js.native
    def describePatchGroups(params: DescribePatchGroupsRequest): Request[DescribePatchGroupsResult] = js.native
    def describePatchProperties(params: DescribePatchPropertiesRequest): Request[DescribePatchPropertiesResult] =
      js.native
    def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResponse]                 = js.native
    def getAutomationExecution(params: GetAutomationExecutionRequest): Request[GetAutomationExecutionResult] = js.native
    def getCalendarState(params: GetCalendarStateRequest): Request[GetCalendarStateResponse]                 = js.native
    def getCommandInvocation(params: GetCommandInvocationRequest): Request[GetCommandInvocationResult]       = js.native
    def getConnectionStatus(params: GetConnectionStatusRequest): Request[GetConnectionStatusResponse]        = js.native
    def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest): Request[GetDefaultPatchBaselineResult] =
      js.native
    def getDeployablePatchSnapshotForInstance(
        params: GetDeployablePatchSnapshotForInstanceRequest
    ): Request[GetDeployablePatchSnapshotForInstanceResult]                                            = js.native
    def getDocument(params: GetDocumentRequest): Request[GetDocumentResult]                            = js.native
    def getInventory(params: GetInventoryRequest): Request[GetInventoryResult]                         = js.native
    def getInventorySchema(params: GetInventorySchemaRequest): Request[GetInventorySchemaResult]       = js.native
    def getMaintenanceWindow(params: GetMaintenanceWindowRequest): Request[GetMaintenanceWindowResult] = js.native
    def getMaintenanceWindowExecution(
        params: GetMaintenanceWindowExecutionRequest
    ): Request[GetMaintenanceWindowExecutionResult] = js.native
    def getMaintenanceWindowExecutionTask(
        params: GetMaintenanceWindowExecutionTaskRequest
    ): Request[GetMaintenanceWindowExecutionTaskResult] = js.native
    def getMaintenanceWindowExecutionTaskInvocation(
        params: GetMaintenanceWindowExecutionTaskInvocationRequest
    ): Request[GetMaintenanceWindowExecutionTaskInvocationResult] = js.native
    def getMaintenanceWindowTask(params: GetMaintenanceWindowTaskRequest): Request[GetMaintenanceWindowTaskResult] =
      js.native
    def getOpsItem(params: GetOpsItemRequest): Request[GetOpsItemResponse]                          = js.native
    def getOpsSummary(params: GetOpsSummaryRequest): Request[GetOpsSummaryResult]                   = js.native
    def getParameter(params: GetParameterRequest): Request[GetParameterResult]                      = js.native
    def getParameterHistory(params: GetParameterHistoryRequest): Request[GetParameterHistoryResult] = js.native
    def getParameters(params: GetParametersRequest): Request[GetParametersResult]                   = js.native
    def getParametersByPath(params: GetParametersByPathRequest): Request[GetParametersByPathResult] = js.native
    def getPatchBaseline(params: GetPatchBaselineRequest): Request[GetPatchBaselineResult]          = js.native
    def getPatchBaselineForPatchGroup(
        params: GetPatchBaselineForPatchGroupRequest
    ): Request[GetPatchBaselineForPatchGroupResult]                                                       = js.native
    def getServiceSetting(params: GetServiceSettingRequest): Request[GetServiceSettingResult]             = js.native
    def labelParameterVersion(params: LabelParameterVersionRequest): Request[LabelParameterVersionResult] = js.native
    def listAssociationVersions(params: ListAssociationVersionsRequest): Request[ListAssociationVersionsResult] =
      js.native
    def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResult]                   = js.native
    def listCommandInvocations(params: ListCommandInvocationsRequest): Request[ListCommandInvocationsResult] = js.native
    def listCommands(params: ListCommandsRequest): Request[ListCommandsResult]                               = js.native
    def listComplianceItems(params: ListComplianceItemsRequest): Request[ListComplianceItemsResult]          = js.native
    def listComplianceSummaries(params: ListComplianceSummariesRequest): Request[ListComplianceSummariesResult] =
      js.native
    def listDocumentVersions(params: ListDocumentVersionsRequest): Request[ListDocumentVersionsResult] = js.native
    def listDocuments(params: ListDocumentsRequest): Request[ListDocumentsResult]                      = js.native
    def listInventoryEntries(params: ListInventoryEntriesRequest): Request[ListInventoryEntriesResult] = js.native
    def listResourceComplianceSummaries(
        params: ListResourceComplianceSummariesRequest
    ): Request[ListResourceComplianceSummariesResult]                                                  = js.native
    def listResourceDataSync(params: ListResourceDataSyncRequest): Request[ListResourceDataSyncResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult]    = js.native
    def modifyDocumentPermission(params: ModifyDocumentPermissionRequest): Request[ModifyDocumentPermissionResponse] =
      js.native
    def putComplianceItems(params: PutComplianceItemsRequest): Request[PutComplianceItemsResult] = js.native
    def putInventory(params: PutInventoryRequest): Request[PutInventoryResult]                   = js.native
    def putParameter(params: PutParameterRequest): Request[PutParameterResult]                   = js.native
    def registerDefaultPatchBaseline(
        params: RegisterDefaultPatchBaselineRequest
    ): Request[RegisterDefaultPatchBaselineResult] = js.native
    def registerPatchBaselineForPatchGroup(
        params: RegisterPatchBaselineForPatchGroupRequest
    ): Request[RegisterPatchBaselineForPatchGroupResult] = js.native
    def registerTargetWithMaintenanceWindow(
        params: RegisterTargetWithMaintenanceWindowRequest
    ): Request[RegisterTargetWithMaintenanceWindowResult] = js.native
    def registerTaskWithMaintenanceWindow(
        params: RegisterTaskWithMaintenanceWindowRequest
    ): Request[RegisterTaskWithMaintenanceWindowResult]                                                      = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult] = js.native
    def resetServiceSetting(params: ResetServiceSettingRequest): Request[ResetServiceSettingResult]          = js.native
    def resumeSession(params: ResumeSessionRequest): Request[ResumeSessionResponse]                          = js.native
    def sendAutomationSignal(params: SendAutomationSignalRequest): Request[SendAutomationSignalResult]       = js.native
    def sendCommand(params: SendCommandRequest): Request[SendCommandResult]                                  = js.native
    def startAssociationsOnce(params: StartAssociationsOnceRequest): Request[StartAssociationsOnceResult]    = js.native
    def startAutomationExecution(params: StartAutomationExecutionRequest): Request[StartAutomationExecutionResult] =
      js.native
    def startSession(params: StartSessionRequest): Request[StartSessionResponse] = js.native
    def stopAutomationExecution(params: StopAutomationExecutionRequest): Request[StopAutomationExecutionResult] =
      js.native
    def terminateSession(params: TerminateSessionRequest): Request[TerminateSessionResponse]  = js.native
    def updateAssociation(params: UpdateAssociationRequest): Request[UpdateAssociationResult] = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest): Request[UpdateAssociationStatusResult] =
      js.native
    def updateDocument(params: UpdateDocumentRequest): Request[UpdateDocumentResult] = js.native
    def updateDocumentDefaultVersion(
        params: UpdateDocumentDefaultVersionRequest
    ): Request[UpdateDocumentDefaultVersionResult] = js.native
    def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): Request[UpdateMaintenanceWindowResult] =
      js.native
    def updateMaintenanceWindowTarget(
        params: UpdateMaintenanceWindowTargetRequest
    ): Request[UpdateMaintenanceWindowTargetResult] = js.native
    def updateMaintenanceWindowTask(
        params: UpdateMaintenanceWindowTaskRequest
    ): Request[UpdateMaintenanceWindowTaskResult] = js.native
    def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): Request[UpdateManagedInstanceRoleResult] =
      js.native
    def updateOpsItem(params: UpdateOpsItemRequest): Request[UpdateOpsItemResponse]                          = js.native
    def updatePatchBaseline(params: UpdatePatchBaselineRequest): Request[UpdatePatchBaselineResult]          = js.native
    def updateResourceDataSync(params: UpdateResourceDataSyncRequest): Request[UpdateResourceDataSyncResult] = js.native
    def updateServiceSetting(params: UpdateServiceSettingRequest): Request[UpdateServiceSettingResult]       = js.native
  }

  /**
    * Information includes the AWS account ID where the current document is shared and the version shared with that account.
    */
  @js.native
  @Factory
  trait AccountSharingInfo extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var SharedDocumentVersion: js.UndefOr[SharedDocumentVersion]
  }

  /**
    * An activation registers one or more on-premises servers or virtual machines (VMs) with AWS so that you can configure those servers or VMs using Run Command. A server or VM that has been registered with AWS is called a managed instance.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
    var Tags: TagList
  }

  @js.native
  @Factory
  trait AddTagsToResourceResult extends js.Object {}

  /**
    * Describes an association of a Systems Manager document and an instance.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait AssociationComplianceSeverity extends js.Any
  object AssociationComplianceSeverity extends js.Object {
    val CRITICAL    = "CRITICAL".asInstanceOf[AssociationComplianceSeverity]
    val HIGH        = "HIGH".asInstanceOf[AssociationComplianceSeverity]
    val MEDIUM      = "MEDIUM".asInstanceOf[AssociationComplianceSeverity]
    val LOW         = "LOW".asInstanceOf[AssociationComplianceSeverity]
    val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[AssociationComplianceSeverity]

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED))
  }

  /**
    * Describes the parameters for a document.
    */
  @js.native
  @Factory
  trait AssociationDescription extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
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
    var Targets: js.UndefOr[Targets]
  }

  /**
    * Includes information about the specified association.
    */
  @js.native
  @Factory
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

  /**
    * Filters used in the request.
    */
  @js.native
  @Factory
  trait AssociationExecutionFilter extends js.Object {
    var Key: AssociationExecutionFilterKey
    var Type: AssociationFilterOperatorType
    var Value: AssociationExecutionFilterValue
  }

  @js.native
  sealed trait AssociationExecutionFilterKey extends js.Any
  object AssociationExecutionFilterKey extends js.Object {
    val ExecutionId = "ExecutionId".asInstanceOf[AssociationExecutionFilterKey]
    val Status      = "Status".asInstanceOf[AssociationExecutionFilterKey]
    val CreatedTime = "CreatedTime".asInstanceOf[AssociationExecutionFilterKey]

    val values = js.Object.freeze(js.Array(ExecutionId, Status, CreatedTime))
  }

  /**
    * Includes information about the specified association execution.
    */
  @js.native
  @Factory
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

  /**
    * Filters for the association execution.
    */
  @js.native
  @Factory
  trait AssociationExecutionTargetsFilter extends js.Object {
    var Key: AssociationExecutionTargetsFilterKey
    var Value: AssociationExecutionTargetsFilterValue
  }

  @js.native
  sealed trait AssociationExecutionTargetsFilterKey extends js.Any
  object AssociationExecutionTargetsFilterKey extends js.Object {
    val Status       = "Status".asInstanceOf[AssociationExecutionTargetsFilterKey]
    val ResourceId   = "ResourceId".asInstanceOf[AssociationExecutionTargetsFilterKey]
    val ResourceType = "ResourceType".asInstanceOf[AssociationExecutionTargetsFilterKey]

    val values = js.Object.freeze(js.Array(Status, ResourceId, ResourceType))
  }

  /**
    * Describes a filter.
    */
  @js.native
  @Factory
  trait AssociationFilter extends js.Object {
    var key: AssociationFilterKey
    var value: AssociationFilterValue
  }

  @js.native
  sealed trait AssociationFilterKey extends js.Any
  object AssociationFilterKey extends js.Object {
    val InstanceId            = "InstanceId".asInstanceOf[AssociationFilterKey]
    val Name                  = "Name".asInstanceOf[AssociationFilterKey]
    val AssociationId         = "AssociationId".asInstanceOf[AssociationFilterKey]
    val AssociationStatusName = "AssociationStatusName".asInstanceOf[AssociationFilterKey]
    val LastExecutedBefore    = "LastExecutedBefore".asInstanceOf[AssociationFilterKey]
    val LastExecutedAfter     = "LastExecutedAfter".asInstanceOf[AssociationFilterKey]
    val AssociationName       = "AssociationName".asInstanceOf[AssociationFilterKey]

    val values = js.Object.freeze(
      js.Array(
        InstanceId,
        Name,
        AssociationId,
        AssociationStatusName,
        LastExecutedBefore,
        LastExecutedAfter,
        AssociationName
      )
    )
  }

  @js.native
  sealed trait AssociationFilterOperatorType extends js.Any
  object AssociationFilterOperatorType extends js.Object {
    val EQUAL        = "EQUAL".asInstanceOf[AssociationFilterOperatorType]
    val LESS_THAN    = "LESS_THAN".asInstanceOf[AssociationFilterOperatorType]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[AssociationFilterOperatorType]

    val values = js.Object.freeze(js.Array(EQUAL, LESS_THAN, GREATER_THAN))
  }

  /**
    * Information about the association.
    */
  @js.native
  @Factory
  trait AssociationOverview extends js.Object {
    var AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount]
    var DetailedStatus: js.UndefOr[StatusName]
    var Status: js.UndefOr[StatusName]
  }

  /**
    * Describes an association status.
    */
  @js.native
  @Factory
  trait AssociationStatus extends js.Object {
    var Date: DateTime
    var Message: StatusMessage
    var Name: AssociationStatusName
    var AdditionalInfo: js.UndefOr[StatusAdditionalInfo]
  }

  @js.native
  sealed trait AssociationStatusName extends js.Any
  object AssociationStatusName extends js.Object {
    val Pending = "Pending".asInstanceOf[AssociationStatusName]
    val Success = "Success".asInstanceOf[AssociationStatusName]
    val Failed  = "Failed".asInstanceOf[AssociationStatusName]

    val values = js.Object.freeze(js.Array(Pending, Success, Failed))
  }

  /**
    * Information about the association version.
    */
  @js.native
  @Factory
  trait AssociationVersionInfo extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var CreatedDate: js.UndefOr[DateTime]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentARN]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  /**
    * A structure that includes attributes that describe a document attachment.
    */
  @js.native
  @Factory
  trait AttachmentContent extends js.Object {
    var Hash: js.UndefOr[AttachmentHash]
    var HashType: js.UndefOr[AttachmentHashType]
    var Name: js.UndefOr[AttachmentName]
    var Size: js.UndefOr[ContentLength]
    var Url: js.UndefOr[AttachmentUrl]
  }

  @js.native
  sealed trait AttachmentHashType extends js.Any
  object AttachmentHashType extends js.Object {
    val Sha256 = "Sha256".asInstanceOf[AttachmentHashType]

    val values = js.Object.freeze(js.Array(Sha256))
  }

  /**
    * An attribute of an attachment, such as the attachment name.
    */
  @js.native
  @Factory
  trait AttachmentInformation extends js.Object {
    var Name: js.UndefOr[AttachmentName]
  }

  /**
    * Identifying information about a document attachment, including the file name and a key-value pair that identifies the location of an attachment to a document.
    */
  @js.native
  @Factory
  trait AttachmentsSource extends js.Object {
    var Key: js.UndefOr[AttachmentsSourceKey]
    var Name: js.UndefOr[AttachmentIdentifier]
    var Values: js.UndefOr[AttachmentsSourceValues]
  }

  @js.native
  sealed trait AttachmentsSourceKey extends js.Any
  object AttachmentsSourceKey extends js.Object {
    val SourceUrl           = "SourceUrl".asInstanceOf[AttachmentsSourceKey]
    val S3FileUrl           = "S3FileUrl".asInstanceOf[AttachmentsSourceKey]
    val AttachmentReference = "AttachmentReference".asInstanceOf[AttachmentsSourceKey]

    val values = js.Object.freeze(js.Array(SourceUrl, S3FileUrl, AttachmentReference))
  }

  /**
    * Detailed information about the current state of an individual Automation execution.
    */
  @js.native
  @Factory
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

  /**
    * A filter used to match specific automation executions. This is used to limit the scope of Automation execution information returned.
    */
  @js.native
  @Factory
  trait AutomationExecutionFilter extends js.Object {
    var Key: AutomationExecutionFilterKey
    var Values: AutomationExecutionFilterValueList
  }

  @js.native
  sealed trait AutomationExecutionFilterKey extends js.Any
  object AutomationExecutionFilterKey extends js.Object {
    val DocumentNamePrefix = "DocumentNamePrefix".asInstanceOf[AutomationExecutionFilterKey]
    val ExecutionStatus    = "ExecutionStatus".asInstanceOf[AutomationExecutionFilterKey]
    val ExecutionId        = "ExecutionId".asInstanceOf[AutomationExecutionFilterKey]
    val ParentExecutionId  = "ParentExecutionId".asInstanceOf[AutomationExecutionFilterKey]
    val CurrentAction      = "CurrentAction".asInstanceOf[AutomationExecutionFilterKey]
    val StartTimeBefore    = "StartTimeBefore".asInstanceOf[AutomationExecutionFilterKey]
    val StartTimeAfter     = "StartTimeAfter".asInstanceOf[AutomationExecutionFilterKey]
    val AutomationType     = "AutomationType".asInstanceOf[AutomationExecutionFilterKey]
    val TagKey             = "TagKey".asInstanceOf[AutomationExecutionFilterKey]

    val values = js.Object.freeze(
      js.Array(
        DocumentNamePrefix,
        ExecutionStatus,
        ExecutionId,
        ParentExecutionId,
        CurrentAction,
        StartTimeBefore,
        StartTimeAfter,
        AutomationType,
        TagKey
      )
    )
  }

  /**
    * Details about a specific Automation execution.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait AutomationExecutionStatus extends js.Any
  object AutomationExecutionStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[AutomationExecutionStatus]
    val InProgress = "InProgress".asInstanceOf[AutomationExecutionStatus]
    val Waiting    = "Waiting".asInstanceOf[AutomationExecutionStatus]
    val Success    = "Success".asInstanceOf[AutomationExecutionStatus]
    val TimedOut   = "TimedOut".asInstanceOf[AutomationExecutionStatus]
    val Cancelling = "Cancelling".asInstanceOf[AutomationExecutionStatus]
    val Cancelled  = "Cancelled".asInstanceOf[AutomationExecutionStatus]
    val Failed     = "Failed".asInstanceOf[AutomationExecutionStatus]

    val values =
      js.Object.freeze(js.Array(Pending, InProgress, Waiting, Success, TimedOut, Cancelling, Cancelled, Failed))
  }

  @js.native
  sealed trait AutomationType extends js.Any
  object AutomationType extends js.Object {
    val CrossAccount = "CrossAccount".asInstanceOf[AutomationType]
    val Local        = "Local".asInstanceOf[AutomationType]

    val values = js.Object.freeze(js.Array(CrossAccount, Local))
  }

  @js.native
  sealed trait CalendarState extends js.Any
  object CalendarState extends js.Object {
    val OPEN   = "OPEN".asInstanceOf[CalendarState]
    val CLOSED = "CLOSED".asInstanceOf[CalendarState]

    val values = js.Object.freeze(js.Array(OPEN, CLOSED))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CancelCommandRequest extends js.Object {
    var CommandId: CommandId
    var InstanceIds: js.UndefOr[InstanceIdList]
  }

  /**
    * Whether or not the command was successfully canceled. There is no guarantee that a request can be canceled.
    */
  @js.native
  @Factory
  trait CancelCommandResult extends js.Object {}

  @js.native
  @Factory
  trait CancelMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  @js.native
  @Factory
  trait CancelMaintenanceWindowExecutionResult extends js.Object {
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  /**
    * Configuration options for sending command output to CloudWatch Logs.
    */
  @js.native
  @Factory
  trait CloudWatchOutputConfig extends js.Object {
    var CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName]
    var CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled]
  }

  /**
    * Describes a command request.
    */
  @js.native
  @Factory
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

  /**
    * Describes a command filter.
    */
  @js.native
  @Factory
  trait CommandFilter extends js.Object {
    var key: CommandFilterKey
    var value: CommandFilterValue
  }

  @js.native
  sealed trait CommandFilterKey extends js.Any
  object CommandFilterKey extends js.Object {
    val InvokedAfter   = "InvokedAfter".asInstanceOf[CommandFilterKey]
    val InvokedBefore  = "InvokedBefore".asInstanceOf[CommandFilterKey]
    val Status         = "Status".asInstanceOf[CommandFilterKey]
    val ExecutionStage = "ExecutionStage".asInstanceOf[CommandFilterKey]
    val DocumentName   = "DocumentName".asInstanceOf[CommandFilterKey]

    val values = js.Object.freeze(js.Array(InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName))
  }

  /**
    * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. A command invocation returns status and detail information about a command you ran.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait CommandInvocationStatus extends js.Any
  object CommandInvocationStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[CommandInvocationStatus]
    val InProgress = "InProgress".asInstanceOf[CommandInvocationStatus]
    val Delayed    = "Delayed".asInstanceOf[CommandInvocationStatus]
    val Success    = "Success".asInstanceOf[CommandInvocationStatus]
    val Cancelled  = "Cancelled".asInstanceOf[CommandInvocationStatus]
    val TimedOut   = "TimedOut".asInstanceOf[CommandInvocationStatus]
    val Failed     = "Failed".asInstanceOf[CommandInvocationStatus]
    val Cancelling = "Cancelling".asInstanceOf[CommandInvocationStatus]

    val values =
      js.Object.freeze(js.Array(Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling))
  }

  /**
    * Describes plugin details.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait CommandPluginStatus extends js.Any
  object CommandPluginStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[CommandPluginStatus]
    val InProgress = "InProgress".asInstanceOf[CommandPluginStatus]
    val Success    = "Success".asInstanceOf[CommandPluginStatus]
    val TimedOut   = "TimedOut".asInstanceOf[CommandPluginStatus]
    val Cancelled  = "Cancelled".asInstanceOf[CommandPluginStatus]
    val Failed     = "Failed".asInstanceOf[CommandPluginStatus]

    val values = js.Object.freeze(js.Array(Pending, InProgress, Success, TimedOut, Cancelled, Failed))
  }

  @js.native
  sealed trait CommandStatus extends js.Any
  object CommandStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[CommandStatus]
    val InProgress = "InProgress".asInstanceOf[CommandStatus]
    val Success    = "Success".asInstanceOf[CommandStatus]
    val Cancelled  = "Cancelled".asInstanceOf[CommandStatus]
    val Failed     = "Failed".asInstanceOf[CommandStatus]
    val TimedOut   = "TimedOut".asInstanceOf[CommandStatus]
    val Cancelling = "Cancelling".asInstanceOf[CommandStatus]

    val values = js.Object.freeze(js.Array(Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling))
  }

  /**
    * A summary of the call execution that includes an execution ID, the type of execution (for example, <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  @js.native
  @Factory
  trait ComplianceExecutionSummary extends js.Object {
    var ExecutionTime: DateTime
    var ExecutionId: js.UndefOr[ComplianceExecutionId]
    var ExecutionType: js.UndefOr[ComplianceExecutionType]
  }

  /**
    * Information about the compliance as defined by the resource type. For example, for a patch resource type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.
    */
  @js.native
  @Factory
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

  /**
    * Information about a compliance item.
    */
  @js.native
  @Factory
  trait ComplianceItemEntry extends js.Object {
    var Severity: ComplianceSeverity
    var Status: ComplianceStatus
    var Details: js.UndefOr[ComplianceItemDetails]
    var Id: js.UndefOr[ComplianceItemId]
    var Title: js.UndefOr[ComplianceItemTitle]
  }

  @js.native
  sealed trait ComplianceQueryOperatorType extends js.Any
  object ComplianceQueryOperatorType extends js.Object {
    val EQUAL        = "EQUAL".asInstanceOf[ComplianceQueryOperatorType]
    val NOT_EQUAL    = "NOT_EQUAL".asInstanceOf[ComplianceQueryOperatorType]
    val BEGIN_WITH   = "BEGIN_WITH".asInstanceOf[ComplianceQueryOperatorType]
    val LESS_THAN    = "LESS_THAN".asInstanceOf[ComplianceQueryOperatorType]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComplianceQueryOperatorType]

    val values = js.Object.freeze(js.Array(EQUAL, NOT_EQUAL, BEGIN_WITH, LESS_THAN, GREATER_THAN))
  }

  @js.native
  sealed trait ComplianceSeverity extends js.Any
  object ComplianceSeverity extends js.Object {
    val CRITICAL      = "CRITICAL".asInstanceOf[ComplianceSeverity]
    val HIGH          = "HIGH".asInstanceOf[ComplianceSeverity]
    val MEDIUM        = "MEDIUM".asInstanceOf[ComplianceSeverity]
    val LOW           = "LOW".asInstanceOf[ComplianceSeverity]
    val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[ComplianceSeverity]
    val UNSPECIFIED   = "UNSPECIFIED".asInstanceOf[ComplianceSeverity]

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED))
  }

  @js.native
  sealed trait ComplianceStatus extends js.Any
  object ComplianceStatus extends js.Object {
    val COMPLIANT     = "COMPLIANT".asInstanceOf[ComplianceStatus]
    val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[ComplianceStatus]

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT))
  }

  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  @js.native
  @Factory
  trait ComplianceStringFilter extends js.Object {
    var Key: js.UndefOr[ComplianceStringFilterKey]
    var Type: js.UndefOr[ComplianceQueryOperatorType]
    var Values: js.UndefOr[ComplianceStringFilterValueList]
  }

  /**
    * A summary of compliance information by compliance type.
    */
  @js.native
  @Factory
  trait ComplianceSummaryItem extends js.Object {
    var ComplianceType: js.UndefOr[ComplianceTypeName]
    var CompliantSummary: js.UndefOr[CompliantSummary]
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary]
  }

  /**
    * A summary of resources that are compliant. The summary is organized according to the resource count for each compliance type.
    */
  @js.native
  @Factory
  trait CompliantSummary extends js.Object {
    var CompliantCount: js.UndefOr[ComplianceSummaryCount]
    var SeveritySummary: js.UndefOr[SeveritySummary]
  }

  @js.native
  sealed trait ConnectionStatus extends js.Any
  object ConnectionStatus extends js.Object {
    val Connected    = "Connected".asInstanceOf[ConnectionStatus]
    val NotConnected = "NotConnected".asInstanceOf[ConnectionStatus]

    val values = js.Object.freeze(js.Array(Connected, NotConnected))
  }

  @js.native
  @Factory
  trait CreateActivationRequest extends js.Object {
    var IamRole: IamRole
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateActivationResult extends js.Object {
    var ActivationCode: js.UndefOr[ActivationCode]
    var ActivationId: js.UndefOr[ActivationId]
  }

  @js.native
  @Factory
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: CreateAssociationBatchRequestEntries
  }

  /**
    * Describes the association of a Systems Manager SSM document and an instance.
    */
  @js.native
  @Factory
  trait CreateAssociationBatchRequestEntry extends js.Object {
    var Name: DocumentARN
    var AssociationName: js.UndefOr[AssociationName]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
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

  @js.native
  @Factory
  trait CreateAssociationBatchResult extends js.Object {
    var Failed: js.UndefOr[FailedCreateAssociationList]
    var Successful: js.UndefOr[AssociationDescriptionList]
  }

  @js.native
  @Factory
  trait CreateAssociationRequest extends js.Object {
    var Name: DocumentARN
    var AssociationName: js.UndefOr[AssociationName]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
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

  @js.native
  @Factory
  trait CreateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  @js.native
  @Factory
  trait CreateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var Requires: js.UndefOr[DocumentRequiresList]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  @js.native
  @Factory
  trait CreateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  @js.native
  @Factory
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
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  @js.native
  @Factory
  trait CreateOpsItemRequest extends js.Object {
    var Description: OpsItemDescription
    var Source: OpsItemSource
    var Title: OpsItemTitle
    var Category: js.UndefOr[OpsItemCategory]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateOpsItemResponse extends js.Object {
    var OpsItemId: js.UndefOr[String]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreatePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  @js.native
  @Factory
  trait CreateResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination]
    var SyncSource: js.UndefOr[ResourceDataSyncSource]
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  @js.native
  @Factory
  trait CreateResourceDataSyncResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteActivationRequest extends js.Object {
    var ActivationId: ActivationId
  }

  @js.native
  @Factory
  trait DeleteActivationResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentARN]
  }

  @js.native
  @Factory
  trait DeleteAssociationResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteDocumentRequest extends js.Object {
    var Name: DocumentName
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Force: js.UndefOr[Boolean]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  @js.native
  @Factory
  trait DeleteDocumentResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteInventoryRequest extends js.Object {
    var TypeName: InventoryItemTypeName
    var ClientToken: js.UndefOr[ClientToken]
    var DryRun: js.UndefOr[DryRun]
    var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption]
  }

  @js.native
  @Factory
  trait DeleteInventoryResult extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  @js.native
  @Factory
  trait DeleteMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  @js.native
  @Factory
  trait DeleteMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  @js.native
  @Factory
  trait DeleteParameterRequest extends js.Object {
    var Name: PSParameterName
  }

  @js.native
  @Factory
  trait DeleteParameterResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteParametersRequest extends js.Object {
    var Names: ParameterNameList
  }

  @js.native
  @Factory
  trait DeleteParametersResult extends js.Object {
    var DeletedParameters: js.UndefOr[ParameterNameList]
    var InvalidParameters: js.UndefOr[ParameterNameList]
  }

  @js.native
  @Factory
  trait DeletePatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  @js.native
  @Factory
  trait DeletePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  @js.native
  @Factory
  trait DeleteResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  @js.native
  @Factory
  trait DeleteResourceDataSyncResult extends js.Object {}

  @js.native
  @Factory
  trait DeregisterManagedInstanceRequest extends js.Object {
    var InstanceId: ManagedInstanceId
  }

  @js.native
  @Factory
  trait DeregisterManagedInstanceResult extends js.Object {}

  @js.native
  @Factory
  trait DeregisterPatchBaselineForPatchGroupRequest extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  @js.native
  @Factory
  trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  @js.native
  @Factory
  trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
    var Safe: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  @js.native
  @Factory
  trait DeregisterTaskFromMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  @js.native
  @Factory
  trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  /**
    * Filter for the DescribeActivation API.
    */
  @js.native
  @Factory
  trait DescribeActivationsFilter extends js.Object {
    var FilterKey: js.UndefOr[DescribeActivationsFilterKeys]
    var FilterValues: js.UndefOr[StringList]
  }

  @js.native
  sealed trait DescribeActivationsFilterKeys extends js.Any
  object DescribeActivationsFilterKeys extends js.Object {
    val ActivationIds       = "ActivationIds".asInstanceOf[DescribeActivationsFilterKeys]
    val DefaultInstanceName = "DefaultInstanceName".asInstanceOf[DescribeActivationsFilterKeys]
    val IamRole             = "IamRole".asInstanceOf[DescribeActivationsFilterKeys]

    val values = js.Object.freeze(js.Array(ActivationIds, DefaultInstanceName, IamRole))
  }

  @js.native
  @Factory
  trait DescribeActivationsRequest extends js.Object {
    var Filters: js.UndefOr[DescribeActivationsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeActivationsResult extends js.Object {
    var ActivationList: js.UndefOr[ActivationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAssociationExecutionTargetsRequest extends js.Object {
    var AssociationId: AssociationId
    var ExecutionId: AssociationExecutionId
    var Filters: js.UndefOr[AssociationExecutionTargetsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAssociationExecutionTargetsResult extends js.Object {
    var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAssociationExecutionsRequest extends js.Object {
    var AssociationId: AssociationId
    var Filters: js.UndefOr[AssociationExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAssociationExecutionsResult extends js.Object {
    var AssociationExecutions: js.UndefOr[AssociationExecutionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var InstanceId: js.UndefOr[InstanceId]
    var Name: js.UndefOr[DocumentARN]
  }

  @js.native
  @Factory
  trait DescribeAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  @js.native
  @Factory
  trait DescribeAutomationExecutionsRequest extends js.Object {
    var Filters: js.UndefOr[AutomationExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAutomationExecutionsResult extends js.Object {
    var AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAutomationStepExecutionsRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var Filters: js.UndefOr[StepExecutionFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReverseOrder: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeAutomationStepExecutionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StepExecutions: js.UndefOr[StepExecutionList]
  }

  @js.native
  @Factory
  trait DescribeAvailablePatchesRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAvailablePatchesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Patches: js.UndefOr[PatchList]
  }

  @js.native
  @Factory
  trait DescribeDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
  }

  @js.native
  @Factory
  trait DescribeDocumentPermissionResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
    var AccountSharingInfoList: js.UndefOr[AccountSharingInfoList]
  }

  @js.native
  @Factory
  trait DescribeDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  @js.native
  @Factory
  trait DescribeDocumentResult extends js.Object {
    var Document: js.UndefOr[DocumentDescription]
  }

  @js.native
  @Factory
  trait DescribeEffectiveInstanceAssociationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeEffectiveInstanceAssociationsResult extends js.Object {
    var Associations: js.UndefOr[InstanceAssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
    var EffectivePatches: js.UndefOr[EffectivePatchList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceAssociationsStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceAssociationsStatusResult extends js.Object {
    var InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceInformationRequest extends js.Object {
    var Filters: js.UndefOr[InstanceInformationStringFilterList]
    var InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList]
    var MaxResults: js.UndefOr[MaxResultsEC2Compatible]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceInformationResult extends js.Object {
    var InstanceInformationList: js.UndefOr[InstanceInformationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancePatchStatesForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
    var Filters: js.UndefOr[InstancePatchStateFilterList]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
    var InstancePatchStates: js.UndefOr[InstancePatchStatesList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancePatchStatesRequest extends js.Object {
    var InstanceIds: InstanceIdList
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancePatchStatesResult extends js.Object {
    var InstancePatchStates: js.UndefOr[InstancePatchStateList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancePatchesRequest extends js.Object {
    var InstanceId: InstanceId
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchComplianceMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancePatchesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Patches: js.UndefOr[PatchComplianceDataList]
  }

  @js.native
  @Factory
  trait DescribeInventoryDeletionsRequest extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInventoryDeletionsResult extends js.Object {
    var InventoryDeletions: js.UndefOr[InventoryDeletionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowExecutionTaskInvocationsRequest extends js.Object {
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowExecutionTasksRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowExecutionsRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowScheduleRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var Targets: js.UndefOr[Targets]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowScheduleResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowTargetsRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowTargetsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[MaintenanceWindowTargetList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowTasksRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowTasksResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tasks: js.UndefOr[MaintenanceWindowTaskList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
    var ResourceType: MaintenanceWindowResourceType
    var Targets: Targets
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowsRequest extends js.Object {
    var Filters: js.UndefOr[MaintenanceWindowFilterList]
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMaintenanceWindowsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList]
  }

  @js.native
  @Factory
  trait DescribeOpsItemsRequest extends js.Object {
    var MaxResults: js.UndefOr[OpsItemMaxResults]
    var NextToken: js.UndefOr[String]
    var OpsItemFilters: js.UndefOr[OpsItemFilters]
  }

  @js.native
  @Factory
  trait DescribeOpsItemsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OpsItemSummaries: js.UndefOr[OpsItemSummaries]
  }

  @js.native
  @Factory
  trait DescribeParametersRequest extends js.Object {
    var Filters: js.UndefOr[ParametersFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ParameterFilters: js.UndefOr[ParameterStringFilterList]
  }

  @js.native
  @Factory
  trait DescribeParametersResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterMetadataList]
  }

  @js.native
  @Factory
  trait DescribePatchBaselinesRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribePatchBaselinesResult extends js.Object {
    var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribePatchGroupStateRequest extends js.Object {
    var PatchGroup: PatchGroup
  }

  @js.native
  @Factory
  trait DescribePatchGroupStateResult extends js.Object {
    var Instances: js.UndefOr[Int]
    var InstancesWithFailedPatches: js.UndefOr[Int]
    var InstancesWithInstalledOtherPatches: js.UndefOr[Int]
    var InstancesWithInstalledPatches: js.UndefOr[Int]
    var InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount]
    var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount]
    var InstancesWithMissingPatches: js.UndefOr[Int]
    var InstancesWithNotApplicablePatches: js.UndefOr[Int]
    var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait DescribePatchGroupsRequest extends js.Object {
    var Filters: js.UndefOr[PatchOrchestratorFilterList]
    var MaxResults: js.UndefOr[PatchBaselineMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribePatchGroupsResult extends js.Object {
    var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribePatchPropertiesRequest extends js.Object {
    var OperatingSystem: OperatingSystem
    var Property: PatchProperty
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PatchSet: js.UndefOr[PatchSet]
  }

  @js.native
  @Factory
  trait DescribePatchPropertiesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Properties: js.UndefOr[PatchPropertiesList]
  }

  @js.native
  @Factory
  trait DescribeSessionsRequest extends js.Object {
    var State: SessionState
    var Filters: js.UndefOr[SessionFilterList]
    var MaxResults: js.UndefOr[SessionMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeSessionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Sessions: js.UndefOr[SessionList]
  }

  /**
    * A default version of a document.
    */
  @js.native
  @Factory
  trait DocumentDefaultVersionDescription extends js.Object {
    var DefaultVersion: js.UndefOr[DocumentVersion]
    var DefaultVersionName: js.UndefOr[DocumentVersionName]
    var Name: js.UndefOr[DocumentName]
  }

  /**
    * Describes a Systems Manager document.
    */
  @js.native
  @Factory
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
    var Requires: js.UndefOr[DocumentRequiresList]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Sha1: js.UndefOr[DocumentSha1]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  /**
    * Describes a filter.
    */
  @js.native
  @Factory
  trait DocumentFilter extends js.Object {
    var key: DocumentFilterKey
    var value: DocumentFilterValue
  }

  @js.native
  sealed trait DocumentFilterKey extends js.Any
  object DocumentFilterKey extends js.Object {
    val Name          = "Name".asInstanceOf[DocumentFilterKey]
    val Owner         = "Owner".asInstanceOf[DocumentFilterKey]
    val PlatformTypes = "PlatformTypes".asInstanceOf[DocumentFilterKey]
    val DocumentType  = "DocumentType".asInstanceOf[DocumentFilterKey]

    val values = js.Object.freeze(js.Array(Name, Owner, PlatformTypes, DocumentType))
  }

  @js.native
  sealed trait DocumentFormat extends js.Any
  object DocumentFormat extends js.Object {
    val YAML = "YAML".asInstanceOf[DocumentFormat]
    val JSON = "JSON".asInstanceOf[DocumentFormat]
    val TEXT = "TEXT".asInstanceOf[DocumentFormat]

    val values = js.Object.freeze(js.Array(YAML, JSON, TEXT))
  }

  @js.native
  sealed trait DocumentHashType extends js.Any
  object DocumentHashType extends js.Object {
    val Sha256 = "Sha256".asInstanceOf[DocumentHashType]
    val Sha1   = "Sha1".asInstanceOf[DocumentHashType]

    val values = js.Object.freeze(js.Array(Sha256, Sha1))
  }

  /**
    * Describes the name of a Systems Manager document.
    */
  @js.native
  @Factory
  trait DocumentIdentifier extends js.Object {
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Owner: js.UndefOr[DocumentOwner]
    var PlatformTypes: js.UndefOr[PlatformTypeList]
    var Requires: js.UndefOr[DocumentRequiresList]
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion]
    var Tags: js.UndefOr[TagList]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
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
  @Factory
  trait DocumentKeyValuesFilter extends js.Object {
    var Key: js.UndefOr[DocumentKeyValuesFilterKey]
    var Values: js.UndefOr[DocumentKeyValuesFilterValues]
  }

  /**
    * Parameters specified in a System Manager document that run on the server when the command is run.
    */
  @js.native
  @Factory
  trait DocumentParameter extends js.Object {
    var DefaultValue: js.UndefOr[DocumentParameterDefaultValue]
    var Description: js.UndefOr[DocumentParameterDescrption]
    var Name: js.UndefOr[DocumentParameterName]
    var Type: js.UndefOr[DocumentParameterType]
  }

  @js.native
  sealed trait DocumentParameterType extends js.Any
  object DocumentParameterType extends js.Object {
    val String     = "String".asInstanceOf[DocumentParameterType]
    val StringList = "StringList".asInstanceOf[DocumentParameterType]

    val values = js.Object.freeze(js.Array(String, StringList))
  }

  @js.native
  sealed trait DocumentPermissionType extends js.Any
  object DocumentPermissionType extends js.Object {
    val Share = "Share".asInstanceOf[DocumentPermissionType]

    val values = js.Object.freeze(js.Array(Share))
  }

  /**
    * An SSM document required by the current document.
    */
  @js.native
  @Factory
  trait DocumentRequires extends js.Object {
    var Name: DocumentARN
    var Version: js.UndefOr[DocumentVersion]
  }

  /**
    * The status of a document.
    */
  @js.native
  sealed trait DocumentStatus extends js.Any
  object DocumentStatus extends js.Object {
    val Creating = "Creating".asInstanceOf[DocumentStatus]
    val Active   = "Active".asInstanceOf[DocumentStatus]
    val Updating = "Updating".asInstanceOf[DocumentStatus]
    val Deleting = "Deleting".asInstanceOf[DocumentStatus]
    val Failed   = "Failed".asInstanceOf[DocumentStatus]

    val values = js.Object.freeze(js.Array(Creating, Active, Updating, Deleting, Failed))
  }

  @js.native
  sealed trait DocumentType extends js.Any
  object DocumentType extends js.Object {
    val Command                        = "Command".asInstanceOf[DocumentType]
    val Policy                         = "Policy".asInstanceOf[DocumentType]
    val Automation                     = "Automation".asInstanceOf[DocumentType]
    val Session                        = "Session".asInstanceOf[DocumentType]
    val Package                        = "Package".asInstanceOf[DocumentType]
    val ApplicationConfiguration       = "ApplicationConfiguration".asInstanceOf[DocumentType]
    val ApplicationConfigurationSchema = "ApplicationConfigurationSchema".asInstanceOf[DocumentType]
    val DeploymentStrategy             = "DeploymentStrategy".asInstanceOf[DocumentType]
    val ChangeCalendar                 = "ChangeCalendar".asInstanceOf[DocumentType]

    val values = js.Object.freeze(
      js.Array(
        Command,
        Policy,
        Automation,
        Session,
        Package,
        ApplicationConfiguration,
        ApplicationConfigurationSchema,
        DeploymentStrategy,
        ChangeCalendar
      )
    )
  }

  /**
    * Version information about the document.
    */
  @js.native
  @Factory
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

  /**
    * The EffectivePatch structure defines metadata about a patch along with the approval state of the patch in a particular patch baseline. The approval state includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  @js.native
  @Factory
  trait EffectivePatch extends js.Object {
    var Patch: js.UndefOr[Patch]
    var PatchStatus: js.UndefOr[PatchStatus]
  }

  @js.native
  sealed trait ExecutionMode extends js.Any
  object ExecutionMode extends js.Object {
    val Auto        = "Auto".asInstanceOf[ExecutionMode]
    val Interactive = "Interactive".asInstanceOf[ExecutionMode]

    val values = js.Object.freeze(js.Array(Auto, Interactive))
  }

  /**
    * Describes a failed association.
    */
  @js.native
  @Factory
  trait FailedCreateAssociation extends js.Object {
    var Entry: js.UndefOr[CreateAssociationBatchRequestEntry]
    var Fault: js.UndefOr[Fault]
    var Message: js.UndefOr[BatchErrorMessage]
  }

  /**
    * Information about an Automation failure.
    */
  @js.native
  @Factory
  trait FailureDetails extends js.Object {
    var Details: js.UndefOr[AutomationParameterMap]
    var FailureStage: js.UndefOr[String]
    var FailureType: js.UndefOr[String]
  }

  @js.native
  sealed trait Fault extends js.Any
  object Fault extends js.Object {
    val Client  = "Client".asInstanceOf[Fault]
    val Server  = "Server".asInstanceOf[Fault]
    val Unknown = "Unknown".asInstanceOf[Fault]

    val values = js.Object.freeze(js.Array(Client, Server, Unknown))
  }

  @js.native
  @Factory
  trait GetAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
  }

  @js.native
  @Factory
  trait GetAutomationExecutionResult extends js.Object {
    var AutomationExecution: js.UndefOr[AutomationExecution]
  }

  @js.native
  @Factory
  trait GetCalendarStateRequest extends js.Object {
    var CalendarNames: CalendarNameOrARNList
    var AtTime: js.UndefOr[ISO8601String]
  }

  @js.native
  @Factory
  trait GetCalendarStateResponse extends js.Object {
    var AtTime: js.UndefOr[ISO8601String]
    var NextTransitionTime: js.UndefOr[ISO8601String]
    var State: js.UndefOr[CalendarState]
  }

  @js.native
  @Factory
  trait GetCommandInvocationRequest extends js.Object {
    var CommandId: CommandId
    var InstanceId: InstanceId
    var PluginName: js.UndefOr[CommandPluginName]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetConnectionStatusRequest extends js.Object {
    var Target: SessionTarget
  }

  @js.native
  @Factory
  trait GetConnectionStatusResponse extends js.Object {
    var Status: js.UndefOr[ConnectionStatus]
    var Target: js.UndefOr[SessionTarget]
  }

  @js.native
  @Factory
  trait GetDefaultPatchBaselineRequest extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  @js.native
  @Factory
  trait GetDefaultPatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  @js.native
  @Factory
  trait GetDeployablePatchSnapshotForInstanceRequest extends js.Object {
    var InstanceId: InstanceId
    var SnapshotId: SnapshotId
  }

  @js.native
  @Factory
  trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var Product: js.UndefOr[Product]
    var SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  @js.native
  @Factory
  trait GetDocumentRequest extends js.Object {
    var Name: DocumentARN
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  @js.native
  @Factory
  trait GetDocumentResult extends js.Object {
    var AttachmentsContent: js.UndefOr[AttachmentContentList]
    var Content: js.UndefOr[DocumentContent]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Name: js.UndefOr[DocumentARN]
    var Requires: js.UndefOr[DocumentRequiresList]
    var Status: js.UndefOr[DocumentStatus]
    var StatusInformation: js.UndefOr[DocumentStatusInformation]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  @js.native
  @Factory
  trait GetInventoryRequest extends js.Object {
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResultAttributes: js.UndefOr[ResultAttributeList]
  }

  @js.native
  @Factory
  trait GetInventoryResult extends js.Object {
    var Entities: js.UndefOr[InventoryResultEntityList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetInventorySchemaRequest extends js.Object {
    var Aggregator: js.UndefOr[AggregatorSchemaOnly]
    var MaxResults: js.UndefOr[GetInventorySchemaMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SubType: js.UndefOr[IsSubTypeSchema]
    var TypeName: js.UndefOr[InventoryItemTypeNameFilter]
  }

  @js.native
  @Factory
  trait GetInventorySchemaResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Schemas: js.UndefOr[InventoryItemSchemaResultList]
  }

  @js.native
  @Factory
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  @js.native
  @Factory
  trait GetMaintenanceWindowExecutionResult extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
  }

  @js.native
  @Factory
  trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
    var InvocationId: MaintenanceWindowExecutionTaskInvocationId
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
    var TaskId: MaintenanceWindowExecutionTaskId
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetMaintenanceWindowTaskRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTaskId: MaintenanceWindowTaskId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetOpsItemRequest extends js.Object {
    var OpsItemId: OpsItemId
  }

  @js.native
  @Factory
  trait GetOpsItemResponse extends js.Object {
    var OpsItem: js.UndefOr[OpsItem]
  }

  @js.native
  @Factory
  trait GetOpsSummaryRequest extends js.Object {
    var Aggregators: js.UndefOr[OpsAggregatorList]
    var Filters: js.UndefOr[OpsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResultAttributes: js.UndefOr[OpsResultAttributeList]
    var SyncName: js.UndefOr[ResourceDataSyncName]
  }

  @js.native
  @Factory
  trait GetOpsSummaryResult extends js.Object {
    var Entities: js.UndefOr[OpsEntityList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetParameterHistoryRequest extends js.Object {
    var Name: PSParameterName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var WithDecryption: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetParameterHistoryResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterHistoryList]
  }

  @js.native
  @Factory
  trait GetParameterRequest extends js.Object {
    var Name: PSParameterName
    var WithDecryption: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetParameterResult extends js.Object {
    var Parameter: js.UndefOr[Parameter]
  }

  @js.native
  @Factory
  trait GetParametersByPathRequest extends js.Object {
    var Path: PSParameterName
    var MaxResults: js.UndefOr[GetParametersByPathMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ParameterFilters: js.UndefOr[ParameterStringFilterList]
    var Recursive: js.UndefOr[Boolean]
    var WithDecryption: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetParametersByPathResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parameters: js.UndefOr[ParameterList]
  }

  @js.native
  @Factory
  trait GetParametersRequest extends js.Object {
    var Names: ParameterNameList
    var WithDecryption: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetParametersResult extends js.Object {
    var InvalidParameters: js.UndefOr[ParameterNameList]
    var Parameters: js.UndefOr[ParameterList]
  }

  @js.native
  @Factory
  trait GetPatchBaselineForPatchGroupRequest extends js.Object {
    var PatchGroup: PatchGroup
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  @js.native
  @Factory
  trait GetPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  @js.native
  @Factory
  trait GetPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  @js.native
  @Factory
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

  /**
    * The request body of the GetServiceSetting API action.
    */
  @js.native
  @Factory
  trait GetServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
  }

  /**
    * The query result body of the GetServiceSetting API action.
    */
  @js.native
  @Factory
  trait GetServiceSettingResult extends js.Object {
    var ServiceSetting: js.UndefOr[ServiceSetting]
  }

  /**
    * Status information about the aggregated associations.
    */
  @js.native
  @Factory
  trait InstanceAggregatedAssociationOverview extends js.Object {
    var DetailedStatus: js.UndefOr[StatusName]
    var InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount]
  }

  /**
    * One or more association documents on the instance.
    */
  @js.native
  @Factory
  trait InstanceAssociation extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var Content: js.UndefOr[DocumentContent]
    var InstanceId: js.UndefOr[InstanceId]
  }

  /**
    * An Amazon S3 bucket where you want to store the results of this request.
    */
  @js.native
  @Factory
  trait InstanceAssociationOutputLocation extends js.Object {
    var S3Location: js.UndefOr[S3OutputLocation]
  }

  /**
    * The URL of Amazon S3 bucket where you want to store the results of this request.
    */
  @js.native
  @Factory
  trait InstanceAssociationOutputUrl extends js.Object {
    var S3OutputUrl: js.UndefOr[S3OutputUrl]
  }

  /**
    * Status information about the instance association.
    */
  @js.native
  @Factory
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

  /**
    * Describes a filter for a specific list of instances.
    */
  @js.native
  @Factory
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

  /**
    * Describes a filter for a specific list of instances. You can filter instances information by using tags. You specify tags by using a key-value mapping.
    *  Use this action instead of the [[DescribeInstanceInformationRequest.InstanceInformationFilterList]] method. The <code>InstanceInformationFilterList</code> method is a legacy method and does not support tags.
    */
  @js.native
  @Factory
  trait InstanceInformationFilter extends js.Object {
    var key: InstanceInformationFilterKey
    var valueSet: InstanceInformationFilterValueSet
  }

  @js.native
  sealed trait InstanceInformationFilterKey extends js.Any
  object InstanceInformationFilterKey extends js.Object {
    val InstanceIds       = "InstanceIds".asInstanceOf[InstanceInformationFilterKey]
    val AgentVersion      = "AgentVersion".asInstanceOf[InstanceInformationFilterKey]
    val PingStatus        = "PingStatus".asInstanceOf[InstanceInformationFilterKey]
    val PlatformTypes     = "PlatformTypes".asInstanceOf[InstanceInformationFilterKey]
    val ActivationIds     = "ActivationIds".asInstanceOf[InstanceInformationFilterKey]
    val IamRole           = "IamRole".asInstanceOf[InstanceInformationFilterKey]
    val ResourceType      = "ResourceType".asInstanceOf[InstanceInformationFilterKey]
    val AssociationStatus = "AssociationStatus".asInstanceOf[InstanceInformationFilterKey]

    val values = js.Object.freeze(
      js.Array(
        InstanceIds,
        AgentVersion,
        PingStatus,
        PlatformTypes,
        ActivationIds,
        IamRole,
        ResourceType,
        AssociationStatus
      )
    )
  }

  /**
    * The filters to describe or get information about your managed instances.
    */
  @js.native
  @Factory
  trait InstanceInformationStringFilter extends js.Object {
    var Key: InstanceInformationStringFilterKey
    var Values: InstanceInformationFilterValueSet
  }

  /**
    * Defines the high-level patch compliance state for a managed instance, providing information about the number of installed, missing, not applicable, and failed patches along with metadata about the operation when this information was gathered for the instance.
    */
  @js.native
  @Factory
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
    var InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount]
    var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount]
    var LastNoRebootInstallOperationTime: js.UndefOr[DateTime]
    var MissingCount: js.UndefOr[PatchMissingCount]
    var NotApplicableCount: js.UndefOr[PatchNotApplicableCount]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var RebootOption: js.UndefOr[RebootOption]
    var SnapshotId: js.UndefOr[SnapshotId]
    var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount]
  }

  /**
    * Defines a filter used in DescribeInstancePatchStatesForPatchGroup used to scope down the information returned by the API.
    */
  @js.native
  @Factory
  trait InstancePatchStateFilter extends js.Object {
    var Key: InstancePatchStateFilterKey
    var Type: InstancePatchStateOperatorType
    var Values: InstancePatchStateFilterValues
  }

  @js.native
  sealed trait InstancePatchStateOperatorType extends js.Any
  object InstancePatchStateOperatorType extends js.Object {
    val Equal       = "Equal".asInstanceOf[InstancePatchStateOperatorType]
    val NotEqual    = "NotEqual".asInstanceOf[InstancePatchStateOperatorType]
    val LessThan    = "LessThan".asInstanceOf[InstancePatchStateOperatorType]
    val GreaterThan = "GreaterThan".asInstanceOf[InstancePatchStateOperatorType]

    val values = js.Object.freeze(js.Array(Equal, NotEqual, LessThan, GreaterThan))
  }

  /**
    * Specifies the inventory type and attribute for the aggregation execution.
    */
  @js.native
  @Factory
  trait InventoryAggregator extends js.Object {
    var Aggregators: js.UndefOr[InventoryAggregatorList]
    var Expression: js.UndefOr[InventoryAggregatorExpression]
    var Groups: js.UndefOr[InventoryGroupList]
  }

  @js.native
  sealed trait InventoryAttributeDataType extends js.Any
  object InventoryAttributeDataType extends js.Object {
    val string = "string".asInstanceOf[InventoryAttributeDataType]
    val number = "number".asInstanceOf[InventoryAttributeDataType]

    val values = js.Object.freeze(js.Array(string, number))
  }

  @js.native
  sealed trait InventoryDeletionStatus extends js.Any
  object InventoryDeletionStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[InventoryDeletionStatus]
    val Complete   = "Complete".asInstanceOf[InventoryDeletionStatus]

    val values = js.Object.freeze(js.Array(InProgress, Complete))
  }

  /**
    * Status information returned by the <code>DeleteInventory</code> action.
    */
  @js.native
  @Factory
  trait InventoryDeletionStatusItem extends js.Object {
    var DeletionId: js.UndefOr[InventoryDeletionId]
    var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime]
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary]
    var LastStatus: js.UndefOr[InventoryDeletionStatus]
    var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage]
    var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  /**
    * Information about the delete operation.
    */
  @js.native
  @Factory
  trait InventoryDeletionSummary extends js.Object {
    var RemainingCount: js.UndefOr[RemainingCount]
    var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems]
    var TotalCount: js.UndefOr[TotalCount]
  }

  /**
    * Either a count, remaining count, or a version number in a delete inventory summary.
    */
  @js.native
  @Factory
  trait InventoryDeletionSummaryItem extends js.Object {
    var Count: js.UndefOr[ResourceCount]
    var RemainingCount: js.UndefOr[RemainingCount]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
  }

  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  @js.native
  @Factory
  trait InventoryFilter extends js.Object {
    var Key: InventoryFilterKey
    var Values: InventoryFilterValueList
    var Type: js.UndefOr[InventoryQueryOperatorType]
  }

  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  @js.native
  @Factory
  trait InventoryGroup extends js.Object {
    var Filters: InventoryFilterList
    var Name: InventoryGroupName
  }

  /**
    * Information collected from managed instances based on your inventory policy document
    */
  @js.native
  @Factory
  trait InventoryItem extends js.Object {
    var CaptureTime: InventoryItemCaptureTime
    var SchemaVersion: InventoryItemSchemaVersion
    var TypeName: InventoryItemTypeName
    var Content: js.UndefOr[InventoryItemEntryList]
    var ContentHash: js.UndefOr[InventoryItemContentHash]
    var Context: js.UndefOr[InventoryItemContentContext]
  }

  /**
    * Attributes are the entries within the inventory item content. It contains name and value.
    */
  @js.native
  @Factory
  trait InventoryItemAttribute extends js.Object {
    var DataType: InventoryAttributeDataType
    var Name: InventoryItemAttributeName
  }

  /**
    * The inventory item schema definition. Users can use this to compose inventory query filters.
    */
  @js.native
  @Factory
  trait InventoryItemSchema extends js.Object {
    var Attributes: InventoryItemAttributeList
    var TypeName: InventoryItemTypeName
    var DisplayName: js.UndefOr[InventoryTypeDisplayName]
    var Version: js.UndefOr[InventoryItemSchemaVersion]
  }

  @js.native
  sealed trait InventoryQueryOperatorType extends js.Any
  object InventoryQueryOperatorType extends js.Object {
    val Equal       = "Equal".asInstanceOf[InventoryQueryOperatorType]
    val NotEqual    = "NotEqual".asInstanceOf[InventoryQueryOperatorType]
    val BeginWith   = "BeginWith".asInstanceOf[InventoryQueryOperatorType]
    val LessThan    = "LessThan".asInstanceOf[InventoryQueryOperatorType]
    val GreaterThan = "GreaterThan".asInstanceOf[InventoryQueryOperatorType]
    val Exists      = "Exists".asInstanceOf[InventoryQueryOperatorType]

    val values = js.Object.freeze(js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists))
  }

  /**
    * Inventory query results.
    */
  @js.native
  @Factory
  trait InventoryResultEntity extends js.Object {
    var Data: js.UndefOr[InventoryResultItemMap]
    var Id: js.UndefOr[InventoryResultEntityId]
  }

  /**
    * The inventory result item.
    */
  @js.native
  @Factory
  trait InventoryResultItem extends js.Object {
    var Content: InventoryItemEntryList
    var SchemaVersion: InventoryItemSchemaVersion
    var TypeName: InventoryItemTypeName
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var ContentHash: js.UndefOr[InventoryItemContentHash]
  }

  @js.native
  sealed trait InventorySchemaDeleteOption extends js.Any
  object InventorySchemaDeleteOption extends js.Object {
    val DisableSchema = "DisableSchema".asInstanceOf[InventorySchemaDeleteOption]
    val DeleteSchema  = "DeleteSchema".asInstanceOf[InventorySchemaDeleteOption]

    val values = js.Object.freeze(js.Array(DisableSchema, DeleteSchema))
  }

  @js.native
  @Factory
  trait LabelParameterVersionRequest extends js.Object {
    var Labels: ParameterLabelList
    var Name: PSParameterName
    var ParameterVersion: js.UndefOr[PSParameterVersion]
  }

  @js.native
  @Factory
  trait LabelParameterVersionResult extends js.Object {
    var InvalidLabels: js.UndefOr[ParameterLabelList]
    var ParameterVersion: js.UndefOr[PSParameterVersion]
  }

  @js.native
  sealed trait LastResourceDataSyncStatus extends js.Any
  object LastResourceDataSyncStatus extends js.Object {
    val Successful = "Successful".asInstanceOf[LastResourceDataSyncStatus]
    val Failed     = "Failed".asInstanceOf[LastResourceDataSyncStatus]
    val InProgress = "InProgress".asInstanceOf[LastResourceDataSyncStatus]

    val values = js.Object.freeze(js.Array(Successful, Failed, InProgress))
  }

  @js.native
  @Factory
  trait ListAssociationVersionsRequest extends js.Object {
    var AssociationId: AssociationId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAssociationVersionsResult extends js.Object {
    var AssociationVersions: js.UndefOr[AssociationVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAssociationsRequest extends js.Object {
    var AssociationFilterList: js.UndefOr[AssociationFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAssociationsResult extends js.Object {
    var Associations: js.UndefOr[AssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCommandInvocationsRequest extends js.Object {
    var CommandId: js.UndefOr[CommandId]
    var Details: js.UndefOr[Boolean]
    var Filters: js.UndefOr[CommandFilterList]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[CommandMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCommandInvocationsResult extends js.Object {
    var CommandInvocations: js.UndefOr[CommandInvocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCommandsRequest extends js.Object {
    var CommandId: js.UndefOr[CommandId]
    var Filters: js.UndefOr[CommandFilterList]
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[CommandMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCommandsResult extends js.Object {
    var Commands: js.UndefOr[CommandList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListComplianceItemsRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceIds: js.UndefOr[ComplianceResourceIdList]
    var ResourceTypes: js.UndefOr[ComplianceResourceTypeList]
  }

  @js.native
  @Factory
  trait ListComplianceItemsResult extends js.Object {
    var ComplianceItems: js.UndefOr[ComplianceItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListComplianceSummariesResult extends js.Object {
    var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDocumentVersionsRequest extends js.Object {
    var Name: DocumentARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDocumentVersionsResult extends js.Object {
    var DocumentVersions: js.UndefOr[DocumentVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDocumentsRequest extends js.Object {
    var DocumentFilterList: js.UndefOr[DocumentFilterList]
    var Filters: js.UndefOr[DocumentKeyValuesFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDocumentsResult extends js.Object {
    var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListInventoryEntriesRequest extends js.Object {
    var InstanceId: InstanceId
    var TypeName: InventoryItemTypeName
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListInventoryEntriesResult extends js.Object {
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime]
    var Entries: js.UndefOr[InventoryItemEntryList]
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
    var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion]
    var TypeName: js.UndefOr[InventoryItemTypeName]
  }

  @js.native
  @Factory
  trait ListResourceComplianceSummariesRequest extends js.Object {
    var Filters: js.UndefOr[ComplianceStringFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResourceComplianceSummariesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList]
  }

  @js.native
  @Factory
  trait ListResourceDataSyncRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SyncType: js.UndefOr[ResourceDataSyncType]
  }

  @js.native
  @Factory
  trait ListResourceDataSyncResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
  }

  @js.native
  @Factory
  trait ListTagsForResourceResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  /**
    * Information about an Amazon S3 bucket to write instance-level logs to.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    */
  @js.native
  @Factory
  trait LoggingInfo extends js.Object {
    var S3BucketName: S3BucketName
    var S3Region: S3Region
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  /**
    * The parameters for an AUTOMATION task type.
    */
  @js.native
  @Factory
  trait MaintenanceWindowAutomationParameters extends js.Object {
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var Parameters: js.UndefOr[AutomationParameterMap]
  }

  /**
    * Describes the information about an execution of a maintenance window.
    */
  @js.native
  @Factory
  trait MaintenanceWindowExecution extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus]
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails]
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  @js.native
  sealed trait MaintenanceWindowExecutionStatus extends js.Any
  object MaintenanceWindowExecutionStatus extends js.Object {
    val PENDING             = "PENDING".asInstanceOf[MaintenanceWindowExecutionStatus]
    val IN_PROGRESS         = "IN_PROGRESS".asInstanceOf[MaintenanceWindowExecutionStatus]
    val SUCCESS             = "SUCCESS".asInstanceOf[MaintenanceWindowExecutionStatus]
    val FAILED              = "FAILED".asInstanceOf[MaintenanceWindowExecutionStatus]
    val TIMED_OUT           = "TIMED_OUT".asInstanceOf[MaintenanceWindowExecutionStatus]
    val CANCELLING          = "CANCELLING".asInstanceOf[MaintenanceWindowExecutionStatus]
    val CANCELLED           = "CANCELLED".asInstanceOf[MaintenanceWindowExecutionStatus]
    val SKIPPED_OVERLAPPING = "SKIPPED_OVERLAPPING".asInstanceOf[MaintenanceWindowExecutionStatus]

    val values = js.Object.freeze(
      js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING)
    )
  }

  /**
    * Information about a task execution performed as part of a maintenance window execution.
    */
  @js.native
  @Factory
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

  /**
    * Describes the information about a task invocation for a particular target as part of a task execution performed as part of a maintenance window execution.
    */
  @js.native
  @Factory
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

  /**
    * Filter used in the request. Supported filter keys are Name and Enabled.
    */
  @js.native
  @Factory
  trait MaintenanceWindowFilter extends js.Object {
    var Key: js.UndefOr[MaintenanceWindowFilterKey]
    var Values: js.UndefOr[MaintenanceWindowFilterValues]
  }

  /**
    * Information about the maintenance window.
    */
  @js.native
  @Factory
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

  /**
    * The maintenance window to which the specified target belongs.
    */
  @js.native
  @Factory
  trait MaintenanceWindowIdentityForTarget extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  /**
    * The parameters for a LAMBDA task type.
    *  For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    *  <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    *  For Lambda tasks, Systems Manager ignores any values specified for TaskParameters and LoggingInfo.
    */
  @js.native
  @Factory
  trait MaintenanceWindowLambdaParameters extends js.Object {
    var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext]
    var Payload: js.UndefOr[MaintenanceWindowLambdaPayload]
    var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier]
  }

  @js.native
  sealed trait MaintenanceWindowResourceType extends js.Any
  object MaintenanceWindowResourceType extends js.Object {
    val INSTANCE       = "INSTANCE".asInstanceOf[MaintenanceWindowResourceType]
    val RESOURCE_GROUP = "RESOURCE_GROUP".asInstanceOf[MaintenanceWindowResourceType]

    val values = js.Object.freeze(js.Array(INSTANCE, RESOURCE_GROUP))
  }

  /**
    * The parameters for a RUN_COMMAND task type.
    *  For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    *  <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    *  For Run Command tasks, Systems Manager uses specified values for <code>TaskParameters</code> and <code>LoggingInfo</code> only if no values are specified for <code>TaskInvocationParameters</code>.
    */
  @js.native
  @Factory
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

  /**
    * The parameters for a STEP_FUNCTIONS task.
    *  For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    *  <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
    *  For Step Functions tasks, Systems Manager ignores any values specified for <code>TaskParameters</code> and <code>LoggingInfo</code>.
    */
  @js.native
  @Factory
  trait MaintenanceWindowStepFunctionsParameters extends js.Object {
    var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput]
    var Name: js.UndefOr[MaintenanceWindowStepFunctionsName]
  }

  /**
    * The target registered with the maintenance window.
    */
  @js.native
  @Factory
  trait MaintenanceWindowTarget extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType]
    var Targets: js.UndefOr[Targets]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  /**
    * Information about a task defined for a maintenance window.
    */
  @js.native
  @Factory
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

  /**
    * The parameters for task execution.
    */
  @js.native
  @Factory
  trait MaintenanceWindowTaskInvocationParameters extends js.Object {
    var Automation: js.UndefOr[MaintenanceWindowAutomationParameters]
    var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters]
    var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters]
    var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters]
  }

  /**
    * Defines the values for a task parameter.
    */
  @js.native
  @Factory
  trait MaintenanceWindowTaskParameterValueExpression extends js.Object {
    var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList]
  }

  @js.native
  sealed trait MaintenanceWindowTaskType extends js.Any
  object MaintenanceWindowTaskType extends js.Object {
    val RUN_COMMAND    = "RUN_COMMAND".asInstanceOf[MaintenanceWindowTaskType]
    val AUTOMATION     = "AUTOMATION".asInstanceOf[MaintenanceWindowTaskType]
    val STEP_FUNCTIONS = "STEP_FUNCTIONS".asInstanceOf[MaintenanceWindowTaskType]
    val LAMBDA         = "LAMBDA".asInstanceOf[MaintenanceWindowTaskType]

    val values = js.Object.freeze(js.Array(RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA))
  }

  @js.native
  @Factory
  trait ModifyDocumentPermissionRequest extends js.Object {
    var Name: DocumentName
    var PermissionType: DocumentPermissionType
    var AccountIdsToAdd: js.UndefOr[AccountIdList]
    var AccountIdsToRemove: js.UndefOr[AccountIdList]
    var SharedDocumentVersion: js.UndefOr[SharedDocumentVersion]
  }

  @js.native
  @Factory
  trait ModifyDocumentPermissionResponse extends js.Object {}

  /**
    * A summary of resources that are not compliant. The summary is organized according to resource type.
    */
  @js.native
  @Factory
  trait NonCompliantSummary extends js.Object {
    var NonCompliantCount: js.UndefOr[ComplianceSummaryCount]
    var SeveritySummary: js.UndefOr[SeveritySummary]
  }

  /**
    * Configurations for sending notifications.
    */
  @js.native
  @Factory
  trait NotificationConfig extends js.Object {
    var NotificationArn: js.UndefOr[NotificationArn]
    var NotificationEvents: js.UndefOr[NotificationEventList]
    var NotificationType: js.UndefOr[NotificationType]
  }

  @js.native
  sealed trait NotificationEvent extends js.Any
  object NotificationEvent extends js.Object {
    val All        = "All".asInstanceOf[NotificationEvent]
    val InProgress = "InProgress".asInstanceOf[NotificationEvent]
    val Success    = "Success".asInstanceOf[NotificationEvent]
    val TimedOut   = "TimedOut".asInstanceOf[NotificationEvent]
    val Cancelled  = "Cancelled".asInstanceOf[NotificationEvent]
    val Failed     = "Failed".asInstanceOf[NotificationEvent]

    val values = js.Object.freeze(js.Array(All, InProgress, Success, TimedOut, Cancelled, Failed))
  }

  @js.native
  sealed trait NotificationType extends js.Any
  object NotificationType extends js.Object {
    val Command    = "Command".asInstanceOf[NotificationType]
    val Invocation = "Invocation".asInstanceOf[NotificationType]

    val values = js.Object.freeze(js.Array(Command, Invocation))
  }

  @js.native
  sealed trait OperatingSystem extends js.Any
  object OperatingSystem extends js.Object {
    val WINDOWS                 = "WINDOWS".asInstanceOf[OperatingSystem]
    val AMAZON_LINUX            = "AMAZON_LINUX".asInstanceOf[OperatingSystem]
    val AMAZON_LINUX_2          = "AMAZON_LINUX_2".asInstanceOf[OperatingSystem]
    val UBUNTU                  = "UBUNTU".asInstanceOf[OperatingSystem]
    val REDHAT_ENTERPRISE_LINUX = "REDHAT_ENTERPRISE_LINUX".asInstanceOf[OperatingSystem]
    val SUSE                    = "SUSE".asInstanceOf[OperatingSystem]
    val CENTOS                  = "CENTOS".asInstanceOf[OperatingSystem]

    val values =
      js.Object.freeze(js.Array(WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS))
  }

  /**
    * One or more aggregators for viewing counts of OpsItems using different dimensions such as <code>Source</code>, <code>CreatedTime</code>, or <code>Source and CreatedTime</code>, to name a few.
    */
  @js.native
  @Factory
  trait OpsAggregator extends js.Object {
    var AggregatorType: js.UndefOr[OpsAggregatorType]
    var Aggregators: js.UndefOr[OpsAggregatorList]
    var AttributeName: js.UndefOr[OpsDataAttributeName]
    var Filters: js.UndefOr[OpsFilterList]
    var TypeName: js.UndefOr[OpsDataTypeName]
    var Values: js.UndefOr[OpsAggregatorValueMap]
  }

  /**
    * The result of the query.
    */
  @js.native
  @Factory
  trait OpsEntity extends js.Object {
    var Data: js.UndefOr[OpsEntityItemMap]
    var Id: js.UndefOr[OpsEntityId]
  }

  /**
    * The OpsItem summaries result item.
    */
  @js.native
  @Factory
  trait OpsEntityItem extends js.Object {
    var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime]
    var Content: js.UndefOr[OpsEntityItemEntryList]
  }

  /**
    * A filter for viewing OpsItem summaries.
    */
  @js.native
  @Factory
  trait OpsFilter extends js.Object {
    var Key: OpsFilterKey
    var Values: OpsFilterValueList
    var Type: js.UndefOr[OpsFilterOperatorType]
  }

  @js.native
  sealed trait OpsFilterOperatorType extends js.Any
  object OpsFilterOperatorType extends js.Object {
    val Equal       = "Equal".asInstanceOf[OpsFilterOperatorType]
    val NotEqual    = "NotEqual".asInstanceOf[OpsFilterOperatorType]
    val BeginWith   = "BeginWith".asInstanceOf[OpsFilterOperatorType]
    val LessThan    = "LessThan".asInstanceOf[OpsFilterOperatorType]
    val GreaterThan = "GreaterThan".asInstanceOf[OpsFilterOperatorType]
    val Exists      = "Exists".asInstanceOf[OpsFilterOperatorType]

    val values = js.Object.freeze(js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists))
  }

  /**
    * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see [[http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html|AWS Systems Manager OpsCenter]] in the <i>AWS Systems Manager User Guide</i>.
    */
  @js.native
  @Factory
  trait OpsItem extends js.Object {
    var Category: js.UndefOr[OpsItemCategory]
    var CreatedBy: js.UndefOr[String]
    var CreatedTime: js.UndefOr[DateTime]
    var Description: js.UndefOr[OpsItemDescription]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[DateTime]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OpsItemId: js.UndefOr[OpsItemId]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Source: js.UndefOr[OpsItemSource]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
    var Version: js.UndefOr[String]
  }

  @js.native
  sealed trait OpsItemDataType extends js.Any
  object OpsItemDataType extends js.Object {
    val SearchableString = "SearchableString".asInstanceOf[OpsItemDataType]
    val String           = "String".asInstanceOf[OpsItemDataType]

    val values = js.Object.freeze(js.Array(SearchableString, String))
  }

  /**
    * An object that defines the value of the key and its type in the OperationalData map.
    */
  @js.native
  @Factory
  trait OpsItemDataValue extends js.Object {
    var Type: js.UndefOr[OpsItemDataType]
    var Value: js.UndefOr[OpsItemDataValueString]
  }

  /**
    * Describes an OpsItem filter.
    */
  @js.native
  @Factory
  trait OpsItemFilter extends js.Object {
    var Key: OpsItemFilterKey
    var Operator: OpsItemFilterOperator
    var Values: OpsItemFilterValues
  }

  @js.native
  sealed trait OpsItemFilterKey extends js.Any
  object OpsItemFilterKey extends js.Object {
    val Status               = "Status".asInstanceOf[OpsItemFilterKey]
    val CreatedBy            = "CreatedBy".asInstanceOf[OpsItemFilterKey]
    val Source               = "Source".asInstanceOf[OpsItemFilterKey]
    val Priority             = "Priority".asInstanceOf[OpsItemFilterKey]
    val Title                = "Title".asInstanceOf[OpsItemFilterKey]
    val OpsItemId            = "OpsItemId".asInstanceOf[OpsItemFilterKey]
    val CreatedTime          = "CreatedTime".asInstanceOf[OpsItemFilterKey]
    val LastModifiedTime     = "LastModifiedTime".asInstanceOf[OpsItemFilterKey]
    val OperationalData      = "OperationalData".asInstanceOf[OpsItemFilterKey]
    val OperationalDataKey   = "OperationalDataKey".asInstanceOf[OpsItemFilterKey]
    val OperationalDataValue = "OperationalDataValue".asInstanceOf[OpsItemFilterKey]
    val ResourceId           = "ResourceId".asInstanceOf[OpsItemFilterKey]
    val AutomationId         = "AutomationId".asInstanceOf[OpsItemFilterKey]
    val Category             = "Category".asInstanceOf[OpsItemFilterKey]
    val Severity             = "Severity".asInstanceOf[OpsItemFilterKey]

    val values = js.Object.freeze(
      js.Array(
        Status,
        CreatedBy,
        Source,
        Priority,
        Title,
        OpsItemId,
        CreatedTime,
        LastModifiedTime,
        OperationalData,
        OperationalDataKey,
        OperationalDataValue,
        ResourceId,
        AutomationId,
        Category,
        Severity
      )
    )
  }

  @js.native
  sealed trait OpsItemFilterOperator extends js.Any
  object OpsItemFilterOperator extends js.Object {
    val Equal       = "Equal".asInstanceOf[OpsItemFilterOperator]
    val Contains    = "Contains".asInstanceOf[OpsItemFilterOperator]
    val GreaterThan = "GreaterThan".asInstanceOf[OpsItemFilterOperator]
    val LessThan    = "LessThan".asInstanceOf[OpsItemFilterOperator]

    val values = js.Object.freeze(js.Array(Equal, Contains, GreaterThan, LessThan))
  }

  /**
    * A notification about the OpsItem.
    */
  @js.native
  @Factory
  trait OpsItemNotification extends js.Object {
    var Arn: js.UndefOr[String]
  }

  @js.native
  sealed trait OpsItemStatus extends js.Any
  object OpsItemStatus extends js.Object {
    val Open       = "Open".asInstanceOf[OpsItemStatus]
    val InProgress = "InProgress".asInstanceOf[OpsItemStatus]
    val Resolved   = "Resolved".asInstanceOf[OpsItemStatus]

    val values = js.Object.freeze(js.Array(Open, InProgress, Resolved))
  }

  /**
    * A count of OpsItems.
    */
  @js.native
  @Factory
  trait OpsItemSummary extends js.Object {
    var Category: js.UndefOr[OpsItemCategory]
    var CreatedBy: js.UndefOr[String]
    var CreatedTime: js.UndefOr[DateTime]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[DateTime]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OpsItemId: js.UndefOr[OpsItemId]
    var Priority: js.UndefOr[OpsItemPriority]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Source: js.UndefOr[OpsItemSource]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
  }

  /**
    * The OpsItem data type to return.
    */
  @js.native
  @Factory
  trait OpsResultAttribute extends js.Object {
    var TypeName: OpsDataTypeName
  }

  /**
    * Information about the source where the association execution details are stored.
    */
  @js.native
  @Factory
  trait OutputSource extends js.Object {
    var OutputSourceId: js.UndefOr[OutputSourceId]
    var OutputSourceType: js.UndefOr[OutputSourceType]
  }

  /**
    * An Amazon EC2 Systems Manager parameter in Parameter Store.
    */
  @js.native
  @Factory
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

  /**
    * Information about parameter usage.
    */
  @js.native
  @Factory
  trait ParameterHistory extends js.Object {
    var AllowedPattern: js.UndefOr[AllowedPattern]
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

  /**
    * One or more policies assigned to a parameter.
    */
  @js.native
  @Factory
  trait ParameterInlinePolicy extends js.Object {
    var PolicyStatus: js.UndefOr[String]
    var PolicyText: js.UndefOr[String]
    var PolicyType: js.UndefOr[String]
  }

  /**
    * Metadata includes information like the ARN of the last user and the date/time the parameter was last used.
    */
  @js.native
  @Factory
  trait ParameterMetadata extends js.Object {
    var AllowedPattern: js.UndefOr[AllowedPattern]
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

  /**
    * One or more filters. Use a filter to return a more specific list of results.
    *  <important> The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code> can be used with both actions.
    *  For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of <code>Label</code>.
    *  For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid: <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
    *  For examples of CLI commands demonstrating valid parameter filter constructions, see [[http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html|Searching for Systems Manager Parameters]] in the <i>AWS Systems Manager User Guide</i>.
    *  </important>
    */
  @js.native
  @Factory
  trait ParameterStringFilter extends js.Object {
    var Key: ParameterStringFilterKey
    var Option: js.UndefOr[ParameterStringQueryOption]
    var Values: js.UndefOr[ParameterStringFilterValueList]
  }

  @js.native
  sealed trait ParameterTier extends js.Any
  object ParameterTier extends js.Object {
    val Standard              = "Standard".asInstanceOf[ParameterTier]
    val Advanced              = "Advanced".asInstanceOf[ParameterTier]
    val `Intelligent-Tiering` = "Intelligent-Tiering".asInstanceOf[ParameterTier]

    val values = js.Object.freeze(js.Array(Standard, Advanced, `Intelligent-Tiering`))
  }

  @js.native
  sealed trait ParameterType extends js.Any
  object ParameterType extends js.Object {
    val String       = "String".asInstanceOf[ParameterType]
    val StringList   = "StringList".asInstanceOf[ParameterType]
    val SecureString = "SecureString".asInstanceOf[ParameterType]

    val values = js.Object.freeze(js.Array(String, StringList, SecureString))
  }

  /**
    * This data type is deprecated. Instead, use <a>ParameterStringFilter</a>.
    */
  @js.native
  @Factory
  trait ParametersFilter extends js.Object {
    var Key: ParametersFilterKey
    var Values: ParametersFilterValueList
  }

  @js.native
  sealed trait ParametersFilterKey extends js.Any
  object ParametersFilterKey extends js.Object {
    val Name  = "Name".asInstanceOf[ParametersFilterKey]
    val Type  = "Type".asInstanceOf[ParametersFilterKey]
    val KeyId = "KeyId".asInstanceOf[ParametersFilterKey]

    val values = js.Object.freeze(js.Array(Name, Type, KeyId))
  }

  /**
    * Represents metadata about a patch.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait PatchAction extends js.Any
  object PatchAction extends js.Object {
    val ALLOW_AS_DEPENDENCY = "ALLOW_AS_DEPENDENCY".asInstanceOf[PatchAction]
    val BLOCK               = "BLOCK".asInstanceOf[PatchAction]

    val values = js.Object.freeze(js.Array(ALLOW_AS_DEPENDENCY, BLOCK))
  }

  /**
    * Defines the basic information about a patch baseline.
    */
  @js.native
  @Factory
  trait PatchBaselineIdentity extends js.Object {
    var BaselineDescription: js.UndefOr[BaselineDescription]
    var BaselineId: js.UndefOr[BaselineId]
    var BaselineName: js.UndefOr[BaselineName]
    var DefaultBaseline: js.UndefOr[DefaultBaseline]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  /**
    * Information about the state of a patch on a particular instance as it relates to the patch baseline used to patch the instance.
    */
  @js.native
  @Factory
  trait PatchComplianceData extends js.Object {
    var Classification: PatchClassification
    var InstalledTime: DateTime
    var KBId: PatchKbNumber
    var Severity: PatchSeverity
    var State: PatchComplianceDataState
    var Title: PatchTitle
  }

  @js.native
  sealed trait PatchComplianceDataState extends js.Any
  object PatchComplianceDataState extends js.Object {
    val INSTALLED                = "INSTALLED".asInstanceOf[PatchComplianceDataState]
    val INSTALLED_OTHER          = "INSTALLED_OTHER".asInstanceOf[PatchComplianceDataState]
    val INSTALLED_PENDING_REBOOT = "INSTALLED_PENDING_REBOOT".asInstanceOf[PatchComplianceDataState]
    val INSTALLED_REJECTED       = "INSTALLED_REJECTED".asInstanceOf[PatchComplianceDataState]
    val MISSING                  = "MISSING".asInstanceOf[PatchComplianceDataState]
    val NOT_APPLICABLE           = "NOT_APPLICABLE".asInstanceOf[PatchComplianceDataState]
    val FAILED                   = "FAILED".asInstanceOf[PatchComplianceDataState]

    val values = js.Object.freeze(
      js.Array(
        INSTALLED,
        INSTALLED_OTHER,
        INSTALLED_PENDING_REBOOT,
        INSTALLED_REJECTED,
        MISSING,
        NOT_APPLICABLE,
        FAILED
      )
    )
  }

  @js.native
  sealed trait PatchComplianceLevel extends js.Any
  object PatchComplianceLevel extends js.Object {
    val CRITICAL      = "CRITICAL".asInstanceOf[PatchComplianceLevel]
    val HIGH          = "HIGH".asInstanceOf[PatchComplianceLevel]
    val MEDIUM        = "MEDIUM".asInstanceOf[PatchComplianceLevel]
    val LOW           = "LOW".asInstanceOf[PatchComplianceLevel]
    val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[PatchComplianceLevel]
    val UNSPECIFIED   = "UNSPECIFIED".asInstanceOf[PatchComplianceLevel]

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED))
  }

  @js.native
  sealed trait PatchDeploymentStatus extends js.Any
  object PatchDeploymentStatus extends js.Object {
    val APPROVED          = "APPROVED".asInstanceOf[PatchDeploymentStatus]
    val PENDING_APPROVAL  = "PENDING_APPROVAL".asInstanceOf[PatchDeploymentStatus]
    val EXPLICIT_APPROVED = "EXPLICIT_APPROVED".asInstanceOf[PatchDeploymentStatus]
    val EXPLICIT_REJECTED = "EXPLICIT_REJECTED".asInstanceOf[PatchDeploymentStatus]

    val values = js.Object.freeze(js.Array(APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED))
  }

  /**
    * Defines which patches should be included in a patch baseline.
    *  A patch filter consists of a key and a set of values. The filter key is a patch property. For example, the available filter keys for WINDOWS are PATCH_SET, PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, and MSRC_SEVERITY. The filter values define a matching criterion for the patch property indicated by the key. For example, if the filter key is PRODUCT and the filter values are ["Office 2013", "Office 2016"], then the filter accepts all patches where product name is either "Office 2013" or "Office 2016". The filter values can be exact values for the patch property given as a key, or a wildcard (*), which matches all values.
    *  You can view lists of valid values for the patch properties by running the <code>DescribePatchProperties</code> command. For information about which patch properties can be used with each major operating system, see <a>DescribePatchProperties</a>.
    */
  @js.native
  @Factory
  trait PatchFilter extends js.Object {
    var Key: PatchFilterKey
    var Values: PatchFilterValueList
  }

  /**
    * A set of patch filters, typically used for approval rules.
    */
  @js.native
  @Factory
  trait PatchFilterGroup extends js.Object {
    var PatchFilters: PatchFilterList
  }

  @js.native
  sealed trait PatchFilterKey extends js.Any
  object PatchFilterKey extends js.Object {
    val PATCH_SET      = "PATCH_SET".asInstanceOf[PatchFilterKey]
    val PRODUCT        = "PRODUCT".asInstanceOf[PatchFilterKey]
    val PRODUCT_FAMILY = "PRODUCT_FAMILY".asInstanceOf[PatchFilterKey]
    val CLASSIFICATION = "CLASSIFICATION".asInstanceOf[PatchFilterKey]
    val MSRC_SEVERITY  = "MSRC_SEVERITY".asInstanceOf[PatchFilterKey]
    val PATCH_ID       = "PATCH_ID".asInstanceOf[PatchFilterKey]
    val SECTION        = "SECTION".asInstanceOf[PatchFilterKey]
    val PRIORITY       = "PRIORITY".asInstanceOf[PatchFilterKey]
    val SEVERITY       = "SEVERITY".asInstanceOf[PatchFilterKey]

    val values = js.Object.freeze(
      js.Array(PATCH_SET, PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY)
    )
  }

  /**
    * The mapping between a patch group and the patch baseline the patch group is registered with.
    */
  @js.native
  @Factory
  trait PatchGroupPatchBaselineMapping extends js.Object {
    var BaselineIdentity: js.UndefOr[PatchBaselineIdentity]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  @js.native
  sealed trait PatchOperationType extends js.Any
  object PatchOperationType extends js.Object {
    val Scan    = "Scan".asInstanceOf[PatchOperationType]
    val Install = "Install".asInstanceOf[PatchOperationType]

    val values = js.Object.freeze(js.Array(Scan, Install))
  }

  /**
    * Defines a filter used in Patch Manager APIs.
    */
  @js.native
  @Factory
  trait PatchOrchestratorFilter extends js.Object {
    var Key: js.UndefOr[PatchOrchestratorFilterKey]
    var Values: js.UndefOr[PatchOrchestratorFilterValues]
  }

  @js.native
  sealed trait PatchProperty extends js.Any
  object PatchProperty extends js.Object {
    val PRODUCT        = "PRODUCT".asInstanceOf[PatchProperty]
    val PRODUCT_FAMILY = "PRODUCT_FAMILY".asInstanceOf[PatchProperty]
    val CLASSIFICATION = "CLASSIFICATION".asInstanceOf[PatchProperty]
    val MSRC_SEVERITY  = "MSRC_SEVERITY".asInstanceOf[PatchProperty]
    val PRIORITY       = "PRIORITY".asInstanceOf[PatchProperty]
    val SEVERITY       = "SEVERITY".asInstanceOf[PatchProperty]

    val values = js.Object.freeze(js.Array(PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY))
  }

  /**
    * Defines an approval rule for a patch baseline.
    */
  @js.native
  @Factory
  trait PatchRule extends js.Object {
    var PatchFilterGroup: PatchFilterGroup
    var ApproveAfterDays: js.UndefOr[ApproveAfterDays]
    var ApproveUntilDate: js.UndefOr[PatchStringDate]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var EnableNonSecurity: js.UndefOr[Boolean]
  }

  /**
    * A set of rules defining the approval rules for a patch baseline.
    */
  @js.native
  @Factory
  trait PatchRuleGroup extends js.Object {
    var PatchRules: PatchRuleList
  }

  @js.native
  sealed trait PatchSet extends js.Any
  object PatchSet extends js.Object {
    val OS          = "OS".asInstanceOf[PatchSet]
    val APPLICATION = "APPLICATION".asInstanceOf[PatchSet]

    val values = js.Object.freeze(js.Array(OS, APPLICATION))
  }

  /**
    * Information about the patches to use to update the instances, including target operating systems and source repository. Applies to Linux instances only.
    */
  @js.native
  @Factory
  trait PatchSource extends js.Object {
    var Configuration: PatchSourceConfiguration
    var Name: PatchSourceName
    var Products: PatchSourceProductList
  }

  /**
    * Information about the approval status of a patch.
    */
  @js.native
  @Factory
  trait PatchStatus extends js.Object {
    var ApprovalDate: js.UndefOr[DateTime]
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel]
    var DeploymentStatus: js.UndefOr[PatchDeploymentStatus]
  }

  @js.native
  sealed trait PingStatus extends js.Any
  object PingStatus extends js.Object {
    val Online         = "Online".asInstanceOf[PingStatus]
    val ConnectionLost = "ConnectionLost".asInstanceOf[PingStatus]
    val Inactive       = "Inactive".asInstanceOf[PingStatus]

    val values = js.Object.freeze(js.Array(Online, ConnectionLost, Inactive))
  }

  @js.native
  sealed trait PlatformType extends js.Any
  object PlatformType extends js.Object {
    val Windows = "Windows".asInstanceOf[PlatformType]
    val Linux   = "Linux".asInstanceOf[PlatformType]

    val values = js.Object.freeze(js.Array(Windows, Linux))
  }

  /**
    * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.
    */
  @js.native
  @Factory
  trait ProgressCounters extends js.Object {
    var CancelledSteps: js.UndefOr[Int]
    var FailedSteps: js.UndefOr[Int]
    var SuccessSteps: js.UndefOr[Int]
    var TimedOutSteps: js.UndefOr[Int]
    var TotalSteps: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait PutComplianceItemsRequest extends js.Object {
    var ComplianceType: ComplianceTypeName
    var ExecutionSummary: ComplianceExecutionSummary
    var Items: ComplianceItemEntryList
    var ResourceId: ComplianceResourceId
    var ResourceType: ComplianceResourceType
    var ItemContentHash: js.UndefOr[ComplianceItemContentHash]
  }

  @js.native
  @Factory
  trait PutComplianceItemsResult extends js.Object {}

  @js.native
  @Factory
  trait PutInventoryRequest extends js.Object {
    var InstanceId: InstanceId
    var Items: InventoryItemList
  }

  @js.native
  @Factory
  trait PutInventoryResult extends js.Object {
    var Message: js.UndefOr[PutInventoryMessage]
  }

  @js.native
  @Factory
  trait PutParameterRequest extends js.Object {
    var Name: PSParameterName
    var Type: ParameterType
    var Value: PSParameterValue
    var AllowedPattern: js.UndefOr[AllowedPattern]
    var Description: js.UndefOr[ParameterDescription]
    var KeyId: js.UndefOr[ParameterKeyId]
    var Overwrite: js.UndefOr[Boolean]
    var Policies: js.UndefOr[ParameterPolicies]
    var Tags: js.UndefOr[TagList]
    var Tier: js.UndefOr[ParameterTier]
  }

  @js.native
  @Factory
  trait PutParameterResult extends js.Object {
    var Tier: js.UndefOr[ParameterTier]
    var Version: js.UndefOr[PSParameterVersion]
  }

  @js.native
  sealed trait RebootOption extends js.Any
  object RebootOption extends js.Object {
    val RebootIfNeeded = "RebootIfNeeded".asInstanceOf[RebootOption]
    val NoReboot       = "NoReboot".asInstanceOf[RebootOption]

    val values = js.Object.freeze(js.Array(RebootIfNeeded, NoReboot))
  }

  @js.native
  @Factory
  trait RegisterDefaultPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  @js.native
  @Factory
  trait RegisterDefaultPatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  @js.native
  @Factory
  trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
    var BaselineId: BaselineId
    var PatchGroup: PatchGroup
  }

  @js.native
  @Factory
  trait RegisterPatchBaselineForPatchGroupResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
    var PatchGroup: js.UndefOr[PatchGroup]
  }

  @js.native
  @Factory
  trait RegisterTargetWithMaintenanceWindowRequest extends js.Object {
    var ResourceType: MaintenanceWindowResourceType
    var Targets: Targets
    var WindowId: MaintenanceWindowId
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
  }

  @js.native
  @Factory
  trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  /**
    * An OpsItems that shares something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  @js.native
  @Factory
  trait RelatedOpsItem extends js.Object {
    var OpsItemId: String
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeForTagging
    var TagKeys: KeyList
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceResult extends js.Object {}

  /**
    * The request body of the ResetServiceSetting API action.
    */
  @js.native
  @Factory
  trait ResetServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
  }

  /**
    * The result body of the ResetServiceSetting API action.
    */
  @js.native
  @Factory
  trait ResetServiceSettingResult extends js.Object {
    var ServiceSetting: js.UndefOr[ServiceSetting]
  }

  /**
    * Information about targets that resolved during the Automation execution.
    */
  @js.native
  @Factory
  trait ResolvedTargets extends js.Object {
    var ParameterValues: js.UndefOr[TargetParameterList]
    var Truncated: js.UndefOr[Boolean]
  }

  /**
    * Compliance summary information for a specific resource.
    */
  @js.native
  @Factory
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

  /**
    * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from AWS Organizations or, if an AWS Organization is not present, from multiple AWS Regions.
    */
  @js.native
  @Factory
  trait ResourceDataSyncAwsOrganizationsSource extends js.Object {
    var OrganizationSourceType: ResourceDataSyncOrganizationSourceType
    var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList]
  }

  /**
    * Information about a Resource Data Sync configuration, including its current status and last successful sync.
    */
  @js.native
  @Factory
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

  /**
    * The AWS Organizations organizational unit data source for the sync.
    */
  @js.native
  @Factory
  trait ResourceDataSyncOrganizationalUnit extends js.Object {
    var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId]
  }

  /**
    * Information about the target Amazon S3 bucket for the Resource Data Sync.
    */
  @js.native
  @Factory
  trait ResourceDataSyncS3Destination extends js.Object {
    var BucketName: ResourceDataSyncS3BucketName
    var Region: ResourceDataSyncS3Region
    var SyncFormat: ResourceDataSyncS3Format
    var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN]
    var Prefix: js.UndefOr[ResourceDataSyncS3Prefix]
  }

  @js.native
  sealed trait ResourceDataSyncS3Format extends js.Any
  object ResourceDataSyncS3Format extends js.Object {
    val JsonSerDe = "JsonSerDe".asInstanceOf[ResourceDataSyncS3Format]

    val values = js.Object.freeze(js.Array(JsonSerDe))
  }

  /**
    * Information about the source of the data included in the resource data sync.
    */
  @js.native
  @Factory
  trait ResourceDataSyncSource extends js.Object {
    var SourceRegions: ResourceDataSyncSourceRegionList
    var SourceType: ResourceDataSyncSourceType
    var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource]
    var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions]
  }

  /**
    * The data type name for including resource data sync state. There are four sync states:
    *  <code>OrganizationNotExists</code> (Your organization doesn't exist)
    *  <code>NoPermissions</code> (The system can't locate the service-linked role. This role is automatically created when a user creates a resource data sync in Explorer.)
    *  <code>InvalidOrganizationalUnit</code> (You specified or selected an invalid unit in the resource data sync configuration.)
    *  <code>TrustedAccessDisabled</code> (You disabled Systems Manager access in the organization in AWS Organizations.)
    */
  @js.native
  @Factory
  trait ResourceDataSyncSourceWithState extends js.Object {
    var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource]
    var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions]
    var SourceRegions: js.UndefOr[ResourceDataSyncSourceRegionList]
    var SourceType: js.UndefOr[ResourceDataSyncSourceType]
    var State: js.UndefOr[ResourceDataSyncState]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val ManagedInstance = "ManagedInstance".asInstanceOf[ResourceType]
    val Document        = "Document".asInstanceOf[ResourceType]
    val EC2Instance     = "EC2Instance".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(ManagedInstance, Document, EC2Instance))
  }

  @js.native
  sealed trait ResourceTypeForTagging extends js.Any
  object ResourceTypeForTagging extends js.Object {
    val Document          = "Document".asInstanceOf[ResourceTypeForTagging]
    val ManagedInstance   = "ManagedInstance".asInstanceOf[ResourceTypeForTagging]
    val MaintenanceWindow = "MaintenanceWindow".asInstanceOf[ResourceTypeForTagging]
    val Parameter         = "Parameter".asInstanceOf[ResourceTypeForTagging]
    val PatchBaseline     = "PatchBaseline".asInstanceOf[ResourceTypeForTagging]
    val OpsItem           = "OpsItem".asInstanceOf[ResourceTypeForTagging]

    val values =
      js.Object.freeze(js.Array(Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem))
  }

  /**
    * The inventory item result attribute.
    */
  @js.native
  @Factory
  trait ResultAttribute extends js.Object {
    var TypeName: InventoryItemTypeName
  }

  @js.native
  @Factory
  trait ResumeSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  @js.native
  @Factory
  trait ResumeSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var StreamUrl: js.UndefOr[StreamUrl]
    var TokenValue: js.UndefOr[TokenValue]
  }

  /**
    * An Amazon S3 bucket where you want to store the results of this request.
    */
  @js.native
  @Factory
  trait S3OutputLocation extends js.Object {
    var OutputS3BucketName: js.UndefOr[S3BucketName]
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var OutputS3Region: js.UndefOr[S3Region]
  }

  /**
    * A URL for the Amazon S3 bucket where you want to store the results of this request.
    */
  @js.native
  @Factory
  trait S3OutputUrl extends js.Object {
    var OutputUrl: js.UndefOr[Url]
  }

  /**
    * Information about a scheduled execution for a maintenance window.
    */
  @js.native
  @Factory
  trait ScheduledWindowExecution extends js.Object {
    var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime]
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  @js.native
  @Factory
  trait SendAutomationSignalRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var SignalType: SignalType
    var Payload: js.UndefOr[AutomationParameterMap]
  }

  @js.native
  @Factory
  trait SendAutomationSignalResult extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait SendCommandResult extends js.Object {
    var Command: js.UndefOr[Command]
  }

  /**
    * The service setting data structure.
    *  <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature.
    *  Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the <a>UpdateServiceSetting</a> API action to change the default setting. Or, use the <a>ResetServiceSetting</a> to change the value back to the original value defined by the AWS service team.
    */
  @js.native
  @Factory
  trait ServiceSetting extends js.Object {
    var ARN: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[DateTime]
    var LastModifiedUser: js.UndefOr[String]
    var SettingId: js.UndefOr[ServiceSettingId]
    var SettingValue: js.UndefOr[ServiceSettingValue]
    var Status: js.UndefOr[String]
  }

  /**
    * Information about a Session Manager connection to an instance.
    */
  @js.native
  @Factory
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

  /**
    * Describes a filter for Session Manager information.
    */
  @js.native
  @Factory
  trait SessionFilter extends js.Object {
    var key: SessionFilterKey
    var value: SessionFilterValue
  }

  @js.native
  sealed trait SessionFilterKey extends js.Any
  object SessionFilterKey extends js.Object {
    val InvokedAfter  = "InvokedAfter".asInstanceOf[SessionFilterKey]
    val InvokedBefore = "InvokedBefore".asInstanceOf[SessionFilterKey]
    val Target        = "Target".asInstanceOf[SessionFilterKey]
    val Owner         = "Owner".asInstanceOf[SessionFilterKey]
    val Status        = "Status".asInstanceOf[SessionFilterKey]

    val values = js.Object.freeze(js.Array(InvokedAfter, InvokedBefore, Target, Owner, Status))
  }

  /**
    * Reserved for future use.
    */
  @js.native
  @Factory
  trait SessionManagerOutputUrl extends js.Object {
    var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl]
    var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl]
  }

  @js.native
  sealed trait SessionState extends js.Any
  object SessionState extends js.Object {
    val Active  = "Active".asInstanceOf[SessionState]
    val History = "History".asInstanceOf[SessionState]

    val values = js.Object.freeze(js.Array(Active, History))
  }

  @js.native
  sealed trait SessionStatus extends js.Any
  object SessionStatus extends js.Object {
    val Connected    = "Connected".asInstanceOf[SessionStatus]
    val Connecting   = "Connecting".asInstanceOf[SessionStatus]
    val Disconnected = "Disconnected".asInstanceOf[SessionStatus]
    val Terminated   = "Terminated".asInstanceOf[SessionStatus]
    val Terminating  = "Terminating".asInstanceOf[SessionStatus]
    val Failed       = "Failed".asInstanceOf[SessionStatus]

    val values = js.Object.freeze(js.Array(Connected, Connecting, Disconnected, Terminated, Terminating, Failed))
  }

  /**
    * The number of managed instances found for each patch severity level defined in the request filter.
    */
  @js.native
  @Factory
  trait SeveritySummary extends js.Object {
    var CriticalCount: js.UndefOr[ComplianceSummaryCount]
    var HighCount: js.UndefOr[ComplianceSummaryCount]
    var InformationalCount: js.UndefOr[ComplianceSummaryCount]
    var LowCount: js.UndefOr[ComplianceSummaryCount]
    var MediumCount: js.UndefOr[ComplianceSummaryCount]
    var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount]
  }

  @js.native
  sealed trait SignalType extends js.Any
  object SignalType extends js.Object {
    val Approve   = "Approve".asInstanceOf[SignalType]
    val Reject    = "Reject".asInstanceOf[SignalType]
    val StartStep = "StartStep".asInstanceOf[SignalType]
    val StopStep  = "StopStep".asInstanceOf[SignalType]
    val Resume    = "Resume".asInstanceOf[SignalType]

    val values = js.Object.freeze(js.Array(Approve, Reject, StartStep, StopStep, Resume))
  }

  @js.native
  @Factory
  trait StartAssociationsOnceRequest extends js.Object {
    var AssociationIds: AssociationIdList
  }

  @js.native
  @Factory
  trait StartAssociationsOnceResult extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait StartAutomationExecutionResult extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
  }

  @js.native
  @Factory
  trait StartSessionRequest extends js.Object {
    var Target: SessionTarget
    var DocumentName: js.UndefOr[DocumentARN]
    var Parameters: js.UndefOr[SessionManagerParameters]
  }

  @js.native
  @Factory
  trait StartSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var StreamUrl: js.UndefOr[StreamUrl]
    var TokenValue: js.UndefOr[TokenValue]
  }

  /**
    * Detailed information about an the execution state of an Automation step.
    */
  @js.native
  @Factory
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

  /**
    * A filter to limit the amount of step execution information returned by the call.
    */
  @js.native
  @Factory
  trait StepExecutionFilter extends js.Object {
    var Key: StepExecutionFilterKey
    var Values: StepExecutionFilterValueList
  }

  @js.native
  sealed trait StepExecutionFilterKey extends js.Any
  object StepExecutionFilterKey extends js.Object {
    val StartTimeBefore     = "StartTimeBefore".asInstanceOf[StepExecutionFilterKey]
    val StartTimeAfter      = "StartTimeAfter".asInstanceOf[StepExecutionFilterKey]
    val StepExecutionStatus = "StepExecutionStatus".asInstanceOf[StepExecutionFilterKey]
    val StepExecutionId     = "StepExecutionId".asInstanceOf[StepExecutionFilterKey]
    val StepName            = "StepName".asInstanceOf[StepExecutionFilterKey]
    val Action              = "Action".asInstanceOf[StepExecutionFilterKey]

    val values = js.Object.freeze(
      js.Array(StartTimeBefore, StartTimeAfter, StepExecutionStatus, StepExecutionId, StepName, Action)
    )
  }

  @js.native
  @Factory
  trait StopAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var Type: js.UndefOr[StopType]
  }

  @js.native
  @Factory
  trait StopAutomationExecutionResult extends js.Object {}

  @js.native
  sealed trait StopType extends js.Any
  object StopType extends js.Object {
    val Complete = "Complete".asInstanceOf[StopType]
    val Cancel   = "Cancel".asInstanceOf[StopType]

    val values = js.Object.freeze(js.Array(Complete, Cancel))
  }

  /**
    * Metadata that you assign to your AWS resources. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. In Systems Manager, you can apply tags to documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * An array of search criteria that targets instances using a Key,Value combination that you specify.
    *  Supported formats include the following.
    * * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
    *  * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
    *  * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
    *  * (Maintenance window targets only) <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
    *  * (Maintenance window targets only) <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
    * For example:
    * * <code>Key=InstanceIds,Values=i-02573cafcfEXAMPLE,i-0471e04240EXAMPLE,i-07782c72faEXAMPLE</code>
    *  * <code>Key=tag:CostCenter,Values=CostCenter1,CostCenter2,CostCenter3</code>
    *  * <code>Key=tag-key,Values=Name,Instance-Type,CostCenter</code>
    *  * (Maintenance window targets only) <code>Key=resource-groups:Name,Values=ProductionResourceGroup</code>
    *  This example demonstrates how to target all resources in the resource group ```ProductionResourceGroup``` in your maintenance window.
    *  * (Maintenance window targets only) <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
    *  This example demonstrates how to target only Amazon EC2 instances and VPCs in your maintenance window.
    *  * (State Manager association targets only) <code>Key=InstanceIds,Values=<i>*</i> </code>
    *  This example demonstrates how to target all managed instances in the AWS Region where the association was created.
    * For information about how to send commands that target instances using <code>Key,Value</code> parameters, see [[https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting|Using Targets and Rate Controls to Send Commands to a Fleet]] in the <i>AWS Systems Manager User Guide</i>.
    */
  @js.native
  @Factory
  trait Target extends js.Object {
    var Key: js.UndefOr[TargetKey]
    var Values: js.UndefOr[TargetValues]
  }

  /**
    * The combination of AWS Regions and accounts targeted by the current Automation execution.
    */
  @js.native
  @Factory
  trait TargetLocation extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var Regions: js.UndefOr[Regions]
    var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency]
    var TargetLocationMaxErrors: js.UndefOr[MaxErrors]
  }

  @js.native
  @Factory
  trait TerminateSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  @js.native
  @Factory
  trait TerminateSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
  }

  @js.native
  @Factory
  trait UpdateAssociationRequest extends js.Object {
    var AssociationId: AssociationId
    var AssociationName: js.UndefOr[AssociationName]
    var AssociationVersion: js.UndefOr[AssociationVersion]
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName]
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var MaxConcurrency: js.UndefOr[MaxConcurrency]
    var MaxErrors: js.UndefOr[MaxErrors]
    var Name: js.UndefOr[DocumentARN]
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation]
    var Parameters: js.UndefOr[Parameters]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var Targets: js.UndefOr[Targets]
  }

  @js.native
  @Factory
  trait UpdateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  @js.native
  @Factory
  trait UpdateAssociationStatusRequest extends js.Object {
    var AssociationStatus: AssociationStatus
    var InstanceId: InstanceId
    var Name: DocumentARN
  }

  @js.native
  @Factory
  trait UpdateAssociationStatusResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  @js.native
  @Factory
  trait UpdateDocumentDefaultVersionRequest extends js.Object {
    var DocumentVersion: DocumentVersionNumber
    var Name: DocumentName
  }

  @js.native
  @Factory
  trait UpdateDocumentDefaultVersionResult extends js.Object {
    var Description: js.UndefOr[DocumentDefaultVersionDescription]
  }

  @js.native
  @Factory
  trait UpdateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var TargetType: js.UndefOr[TargetType]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  @js.native
  @Factory
  trait UpdateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateMaintenanceWindowTargetRequest extends js.Object {
    var WindowId: MaintenanceWindowId
    var WindowTargetId: MaintenanceWindowTargetId
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Replace: js.UndefOr[Boolean]
    var Targets: js.UndefOr[Targets]
  }

  @js.native
  @Factory
  trait UpdateMaintenanceWindowTargetResult extends js.Object {
    var Description: js.UndefOr[MaintenanceWindowDescription]
    var Name: js.UndefOr[MaintenanceWindowName]
    var OwnerInformation: js.UndefOr[OwnerInformation]
    var Targets: js.UndefOr[Targets]
    var WindowId: js.UndefOr[MaintenanceWindowId]
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateManagedInstanceRoleRequest extends js.Object {
    var IamRole: IamRole
    var InstanceId: ManagedInstanceId
  }

  @js.native
  @Factory
  trait UpdateManagedInstanceRoleResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateOpsItemRequest extends js.Object {
    var OpsItemId: OpsItemId
    var Category: js.UndefOr[OpsItemCategory]
    var Description: js.UndefOr[OpsItemDescription]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Severity: js.UndefOr[OpsItemSeverity]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
  }

  @js.native
  @Factory
  trait UpdateOpsItemResponse extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
    var SyncSource: ResourceDataSyncSource
    var SyncType: ResourceDataSyncType
  }

  @js.native
  @Factory
  trait UpdateResourceDataSyncResult extends js.Object {}

  /**
    * The request body of the UpdateServiceSetting API action.
    */
  @js.native
  @Factory
  trait UpdateServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
    var SettingValue: ServiceSettingValue
  }

  /**
    * The result body of the UpdateServiceSetting API action.
    */
  @js.native
  @Factory
  trait UpdateServiceSettingResult extends js.Object {}
}
