package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ssm {
  type Account                                              = String
  type AccountId                                            = String
  type AccountIdList                                        = js.Array[AccountId]
  type Accounts                                             = js.Array[Account]
  type ActivationCode                                       = String
  type ActivationDescription                                = String
  type ActivationId                                         = String
  type ActivationList                                       = js.Array[Activation]
  type AgentErrorCode                                       = String
  type AggregatorSchemaOnly                                 = Boolean
  type AllowedPattern                                       = String
  type ApproveAfterDays                                     = Int
  type AssociationComplianceSeverity                        = String
  type AssociationDescriptionList                           = js.Array[AssociationDescription]
  type AssociationExecutionFilterKey                        = String
  type AssociationExecutionFilterList                       = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue                      = String
  type AssociationExecutionId                               = String
  type AssociationExecutionTargetsFilterKey                 = String
  type AssociationExecutionTargetsFilterList                = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue               = String
  type AssociationExecutionTargetsList                      = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList                            = js.Array[AssociationExecution]
  type AssociationFilterKey                                 = String
  type AssociationFilterList                                = js.Array[AssociationFilter]
  type AssociationFilterOperatorType                        = String
  type AssociationFilterValue                               = String
  type AssociationId                                        = String
  type AssociationIdList                                    = js.Array[AssociationId]
  type AssociationList                                      = js.Array[Association]
  type AssociationName                                      = String
  type AssociationResourceId                                = String
  type AssociationResourceType                              = String
  type AssociationStatusAggregatedCount                     = js.Dictionary[InstanceCount]
  type AssociationStatusName                                = String
  type AssociationVersion                                   = String
  type AssociationVersionList                               = js.Array[AssociationVersionInfo]
  type AttachmentContentList                                = js.Array[AttachmentContent]
  type AttachmentHash                                       = String
  type AttachmentHashType                                   = String
  type AttachmentInformationList                            = js.Array[AttachmentInformation]
  type AttachmentName                                       = String
  type AttachmentUrl                                        = String
  type AttachmentsSourceKey                                 = String
  type AttachmentsSourceList                                = js.Array[AttachmentsSource]
  type AttachmentsSourceValue                               = String
  type AttachmentsSourceValues                              = js.Array[AttachmentsSourceValue]
  type AttributeName                                        = String
  type AttributeValue                                       = String
  type AutomationActionName                                 = String
  type AutomationExecutionFilterKey                         = String
  type AutomationExecutionFilterList                        = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue                       = String
  type AutomationExecutionFilterValueList                   = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId                                = String
  type AutomationExecutionMetadataList                      = js.Array[AutomationExecutionMetadata]
  type AutomationExecutionStatus                            = String
  type AutomationParameterKey                               = String
  type AutomationParameterMap                               = js.Dictionary[AutomationParameterValueList]
  type AutomationParameterValue                             = String
  type AutomationParameterValueList                         = js.Array[AutomationParameterValue]
  type AutomationTargetParameterName                        = String
  type AutomationType                                       = String
  type BaselineDescription                                  = String
  type BaselineId                                           = String
  type BaselineName                                         = String
  type BatchErrorMessage                                    = String
  type ClientToken                                          = String
  type CloudWatchLogGroupName                               = String
  type CloudWatchOutputEnabled                              = Boolean
  type CommandFilterKey                                     = String
  type CommandFilterList                                    = js.Array[CommandFilter]
  type CommandFilterValue                                   = String
  type CommandId                                            = String
  type CommandInvocationList                                = js.Array[CommandInvocation]
  type CommandInvocationStatus                              = String
  type CommandList                                          = js.Array[Command]
  type CommandMaxResults                                    = Int
  type CommandPluginList                                    = js.Array[CommandPlugin]
  type CommandPluginName                                    = String
  type CommandPluginOutput                                  = String
  type CommandPluginStatus                                  = String
  type CommandStatus                                        = String
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
  type ComplianceQueryOperatorType                          = String
  type ComplianceResourceId                                 = String
  type ComplianceResourceIdList                             = js.Array[ComplianceResourceId]
  type ComplianceResourceType                               = String
  type ComplianceResourceTypeList                           = js.Array[ComplianceResourceType]
  type ComplianceSeverity                                   = String
  type ComplianceStatus                                     = String
  type ComplianceStringFilterKey                            = String
  type ComplianceStringFilterList                           = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList                      = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount                               = Int
  type ComplianceSummaryItemList                            = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName                                   = String
  type ComputerName                                         = String
  type ConnectionStatus                                     = String
  type ContentLength                                        = Double
  type CreateAssociationBatchRequestEntries                 = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate                                          = js.Date
  type DateTime                                             = js.Date
  type DefaultBaseline                                      = Boolean
  type DefaultInstanceName                                  = String
  type DeliveryTimedOutCount                                = Int
  type DescribeActivationsFilterKeys                        = String
  type DescribeActivationsFilterList                        = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument                                = String
  type DocumentARN                                          = String
  type DocumentContent                                      = String
  type DocumentFilterKey                                    = String
  type DocumentFilterList                                   = js.Array[DocumentFilter]
  type DocumentFilterValue                                  = String
  type DocumentFormat                                       = String
  type DocumentHash                                         = String
  type DocumentHashType                                     = String
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
  type DocumentParameterType                                = String
  type DocumentPermissionType                               = String
  type DocumentSchemaVersion                                = String
  type DocumentSha1                                         = String
  type DocumentStatus                                       = String
  type DocumentStatusInformation                            = String
  type DocumentType                                         = String
  type DocumentVersion                                      = String
  type DocumentVersionList                                  = js.Array[DocumentVersionInfo]
  type DocumentVersionName                                  = String
  type DocumentVersionNumber                                = String
  type DryRun                                               = Boolean
  type EffectiveInstanceAssociationMaxResults               = Int
  type EffectivePatchList                                   = js.Array[EffectivePatch]
  type ErrorCount                                           = Int
  type ExecutionMode                                        = String
  type ExecutionRoleName                                    = String
  type ExpirationDate                                       = js.Date
  type FailedCreateAssociationList                          = js.Array[FailedCreateAssociation]
  type Fault                                                = String
  type GetInventorySchemaMaxResults                         = Int
  type GetParametersByPathMaxResults                        = Int
  type IPAddress                                            = String
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
  type InstanceInformationFilterKey                         = String
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
  type InstancePatchStateOperatorType                       = String
  type InstancePatchStatesList                              = js.Array[InstancePatchState]
  type InstanceTagName                                      = String
  type InstancesCount                                       = Int
  type InventoryAggregatorExpression                        = String
  type InventoryAggregatorList                              = js.Array[InventoryAggregator]
  type InventoryAttributeDataType                           = String
  type InventoryDeletionId                                  = String
  type InventoryDeletionLastStatusMessage                   = String
  type InventoryDeletionLastStatusUpdateTime                = js.Date
  type InventoryDeletionStartTime                           = js.Date
  type InventoryDeletionStatus                              = String
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
  type InventoryQueryOperatorType                           = String
  type InventoryResultEntityId                              = String
  type InventoryResultEntityList                            = js.Array[InventoryResultEntity]
  type InventoryResultItemKey                               = String
  type InventoryResultItemMap                               = js.Dictionary[InventoryResultItem]
  type InventorySchemaDeleteOption                          = String
  type InventoryTypeDisplayName                             = String
  type InvocationTraceOutput                                = String
  type IsSubTypeSchema                                      = Boolean
  type KeyList                                              = js.Array[TagKey]
  type LastResourceDataSyncMessage                          = String
  type LastResourceDataSyncStatus                           = String
  type LastResourceDataSyncTime                             = js.Date
  type LastSuccessfulResourceDataSyncTime                   = js.Date
  type MaintenanceWindowAllowUnassociatedTargets            = Boolean
  type MaintenanceWindowCutoff                              = Int
  type MaintenanceWindowDescription                         = String
  type MaintenanceWindowDurationHours                       = Int
  type MaintenanceWindowEnabled                             = Boolean
  type MaintenanceWindowExecutionId                         = String
  type MaintenanceWindowExecutionList                       = js.Array[MaintenanceWindowExecution]
  type MaintenanceWindowExecutionStatus                     = String
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
  type MaintenanceWindowLambdaPayload =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MaintenanceWindowLambdaQualifier        = String
  type MaintenanceWindowMaxResults             = Int
  type MaintenanceWindowName                   = String
  type MaintenanceWindowResourceType           = String
  type MaintenanceWindowSchedule               = String
  type MaintenanceWindowSearchMaxResults       = Int
  type MaintenanceWindowStepFunctionsInput     = String
  type MaintenanceWindowStepFunctionsName      = String
  type MaintenanceWindowStringDateTime         = String
  type MaintenanceWindowTargetId               = String
  type MaintenanceWindowTargetList             = js.Array[MaintenanceWindowTarget]
  type MaintenanceWindowTaskArn                = String
  type MaintenanceWindowTaskId                 = String
  type MaintenanceWindowTaskList               = js.Array[MaintenanceWindowTask]
  type MaintenanceWindowTaskParameterName      = String
  type MaintenanceWindowTaskParameterValue     = String
  type MaintenanceWindowTaskParameterValueList = js.Array[MaintenanceWindowTaskParameterValue]
  type MaintenanceWindowTaskParameters         = js.Dictionary[MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList     = js.Array[MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority           = Int
  type MaintenanceWindowTaskTargetId           = String
  type MaintenanceWindowTaskType               = String
  type MaintenanceWindowTimezone               = String
  type MaintenanceWindowsForTargetList         = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId                       = String
  type MaxConcurrency                          = String
  type MaxErrors                               = String
  type MaxResults                              = Int
  type MaxResultsEC2Compatible                 = Int
  type NextToken                               = String
  type NormalStringMap                         = js.Dictionary[String]
  type NotificationArn                         = String
  type NotificationEvent                       = String
  type NotificationEventList                   = js.Array[NotificationEvent]
  type NotificationType                        = String
  type OperatingSystem                         = String
  type OpsAggregatorList                       = js.Array[OpsAggregator]
  type OpsAggregatorType                       = String
  type OpsAggregatorValue                      = String
  type OpsAggregatorValueKey                   = String
  type OpsAggregatorValueMap                   = js.Dictionary[OpsAggregatorValue]
  type OpsDataAttributeName                    = String
  type OpsDataTypeName                         = String
  type OpsEntityId                             = String
  type OpsEntityItemEntry                      = js.Dictionary[AttributeValue]
  type OpsEntityItemEntryList                  = js.Array[OpsEntityItemEntry]
  type OpsEntityItemKey                        = String
  type OpsEntityItemMap                        = js.Dictionary[OpsEntityItem]
  type OpsEntityList                           = js.Array[OpsEntity]
  type OpsFilterKey                            = String
  type OpsFilterList                           = js.Array[OpsFilter]
  type OpsFilterOperatorType                   = String
  type OpsFilterValue                          = String
  type OpsFilterValueList                      = js.Array[OpsFilterValue]
  type OpsItemDataKey                          = String
  type OpsItemDataType                         = String
  type OpsItemDataValueString                  = String
  type OpsItemDescription                      = String
  type OpsItemFilterKey                        = String
  type OpsItemFilterOperator                   = String
  type OpsItemFilterValue                      = String
  type OpsItemFilterValues                     = js.Array[OpsItemFilterValue]
  type OpsItemFilters                          = js.Array[OpsItemFilter]
  type OpsItemId                               = String
  type OpsItemMaxResults                       = Int
  type OpsItemNotifications                    = js.Array[OpsItemNotification]
  type OpsItemOperationalData                  = js.Dictionary[OpsItemDataValue]
  type OpsItemOpsDataKeysList                  = js.Array[String]
  type OpsItemPriority                         = Int
  type OpsItemSource                           = String
  type OpsItemStatus                           = String
  type OpsItemSummaries                        = js.Array[OpsItemSummary]
  type OpsItemTitle                            = String
  type OutputSourceId                          = String
  type OutputSourceType                        = String
  type OwnerInformation                        = String
  type PSParameterName                         = String
  type PSParameterSelector                     = String
  type PSParameterValue                        = String
  type PSParameterVersion                      = Double
  type ParameterDescription                    = String
  type ParameterHistoryList                    = js.Array[ParameterHistory]
  type ParameterKeyId                          = String
  type ParameterLabel                          = String
  type ParameterLabelList                      = js.Array[ParameterLabel]
  type ParameterList                           = js.Array[Parameter]
  type ParameterMetadataList                   = js.Array[ParameterMetadata]
  type ParameterName                           = String
  type ParameterNameList                       = js.Array[PSParameterName]
  type ParameterPolicies                       = String
  type ParameterPolicyList                     = js.Array[ParameterInlinePolicy]
  type ParameterStringFilterKey                = String
  type ParameterStringFilterList               = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue              = String
  type ParameterStringFilterValueList          = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption              = String
  type ParameterTier                           = String
  type ParameterType                           = String
  type ParameterValue                          = String
  type ParameterValueList                      = js.Array[ParameterValue]
  type Parameters                              = js.Dictionary[ParameterValueList]
  type ParametersFilterKey                     = String
  type ParametersFilterList                    = js.Array[ParametersFilter]
  type ParametersFilterValue                   = String
  type ParametersFilterValueList               = js.Array[ParametersFilterValue]
  type PatchAction                             = String
  type PatchBaselineIdentityList               = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults                 = Int
  type PatchClassification                     = String
  type PatchComplianceDataList                 = js.Array[PatchComplianceData]
  type PatchComplianceDataState                = String
  type PatchComplianceLevel                    = String
  type PatchComplianceMaxResults               = Int
  type PatchContentUrl                         = String
  type PatchDeploymentStatus                   = String
  type PatchDescription                        = String
  type PatchFailedCount                        = Int
  type PatchFilterKey                          = String
  type PatchFilterList                         = js.Array[PatchFilter]
  type PatchFilterValue                        = String
  type PatchFilterValueList                    = js.Array[PatchFilterValue]
  type PatchGroup                              = String
  type PatchGroupList                          = js.Array[PatchGroup]
  type PatchGroupPatchBaselineMappingList      = js.Array[PatchGroupPatchBaselineMapping]
  type PatchId                                 = String
  type PatchIdList                             = js.Array[PatchId]
  type PatchInstalledCount                     = Int
  type PatchInstalledOtherCount                = Int
  type PatchInstalledRejectedCount             = Int
  type PatchKbNumber                           = String
  type PatchLanguage                           = String
  type PatchList                               = js.Array[Patch]
  type PatchMissingCount                       = Int
  type PatchMsrcNumber                         = String
  type PatchMsrcSeverity                       = String
  type PatchNotApplicableCount                 = Int
  type PatchOperationType                      = String
  type PatchOrchestratorFilterKey              = String
  type PatchOrchestratorFilterList             = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue            = String
  type PatchOrchestratorFilterValues           = js.Array[PatchOrchestratorFilterValue]
  type PatchProduct                            = String
  type PatchProductFamily                      = String
  type PatchPropertiesList                     = js.Array[PatchPropertyEntry]
  type PatchProperty                           = String
  type PatchPropertyEntry                      = js.Dictionary[AttributeValue]
  type PatchRuleList                           = js.Array[PatchRule]
  type PatchSet                                = String
  type PatchSeverity                           = String
  type PatchSourceConfiguration                = String
  type PatchSourceList                         = js.Array[PatchSource]
  type PatchSourceName                         = String
  type PatchSourceProduct                      = String
  type PatchSourceProductList                  = js.Array[PatchSourceProduct]
  type PatchTitle                              = String
  type PatchUnreportedNotApplicableCount       = Int
  type PatchVendor                             = String
  type PingStatus                              = String
  type PlatformType                            = String
  type PlatformTypeList                        = js.Array[PlatformType]
  type Product                                 = String
  type PutInventoryMessage                     = String
  type Region                                  = String
  type Regions                                 = js.Array[Region]
  type RegistrationLimit                       = Int
  type RegistrationsCount                      = Int
  type RelatedOpsItems                         = js.Array[RelatedOpsItem]
  type RemainingCount                          = Int
  type ResourceComplianceSummaryItemList       = js.Array[ResourceComplianceSummaryItem]
  type ResourceCount                           = Int
  type ResourceCountByStatus                   = String
  type ResourceDataSyncAWSKMSKeyARN            = String
  type ResourceDataSyncCreatedTime             = js.Date
  type ResourceDataSyncItemList                = js.Array[ResourceDataSyncItem]
  type ResourceDataSyncName                    = String
  type ResourceDataSyncS3BucketName            = String
  type ResourceDataSyncS3Format                = String
  type ResourceDataSyncS3Prefix                = String
  type ResourceDataSyncS3Region                = String
  type ResourceId                              = String
  type ResourceType                            = String
  type ResourceTypeForTagging                  = String
  type ResponseCode                            = Int
  type ResultAttributeList                     = js.Array[ResultAttribute]
  type S3BucketName                            = String
  type S3KeyPrefix                             = String
  type S3Region                                = String
  type ScheduleExpression                      = String
  type ScheduledWindowExecutionList            = js.Array[ScheduledWindowExecution]
  type ServiceRole                             = String
  type ServiceSettingId                        = String
  type ServiceSettingValue                     = String
  type SessionDetails                          = String
  type SessionFilterKey                        = String
  type SessionFilterList                       = js.Array[SessionFilter]
  type SessionFilterValue                      = String
  type SessionId                               = String
  type SessionList                             = js.Array[Session]
  type SessionManagerCloudWatchOutputUrl       = String
  type SessionManagerParameterName             = String
  type SessionManagerParameterValue            = String
  type SessionManagerParameterValueList        = js.Array[SessionManagerParameterValue]
  type SessionManagerParameters                = js.Dictionary[SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl               = String
  type SessionMaxResults                       = Int
  type SessionOwner                            = String
  type SessionState                            = String
  type SessionStatus                           = String
  type SessionTarget                           = String
  type SignalType                              = String
  type SnapshotDownloadUrl                     = String
  type SnapshotId                              = String
  type StandardErrorContent                    = String
  type StandardOutputContent                   = String
  type StatusAdditionalInfo                    = String
  type StatusDetails                           = String
  type StatusMessage                           = String
  type StatusName                              = String
  type StepExecutionFilterKey                  = String
  type StepExecutionFilterList                 = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue                = String
  type StepExecutionFilterValueList            = js.Array[StepExecutionFilterValue]
  type StepExecutionList                       = js.Array[StepExecution]
  type StopType                                = String
  type StreamUrl                               = String
  type StringDateTime                          = String
  type StringList                              = js.Array[String]
  type TagKey                                  = String
  type TagList                                 = js.Array[Tag]
  type TagValue                                = String
  type TargetCount                             = Int
  type TargetKey                               = String
  type TargetLocations                         = js.Array[TargetLocation]
  type TargetMap                               = js.Dictionary[TargetMapValueList]
  type TargetMapKey                            = String
  type TargetMapValue                          = String
  type TargetMapValueList                      = js.Array[TargetMapValue]
  type TargetMaps                              = js.Array[TargetMap]
  type TargetParameterList                     = js.Array[ParameterValue]
  type TargetType                              = String
  type TargetValue                             = String
  type TargetValues                            = js.Array[TargetValue]
  type Targets                                 = js.Array[Target]
  type TimeoutSeconds                          = Int
  type TokenValue                              = String
  type TotalCount                              = Int
  type Url                                     = String
  type ValidNextStep                           = String
  type ValidNextStepList                       = js.Array[ValidNextStep]
  type Version                                 = String

  implicit final class SSMOps(val service: SSM) extends AnyVal {

    def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResult] =
      service.addTagsToResource(params).promise.toFuture
    def cancelCommandFuture(params: CancelCommandRequest): Future[CancelCommandResult] =
      service.cancelCommand(params).promise.toFuture
    def cancelMaintenanceWindowExecutionFuture(
        params: CancelMaintenanceWindowExecutionRequest
    ): Future[CancelMaintenanceWindowExecutionResult] =
      service.cancelMaintenanceWindowExecution(params).promise.toFuture
    def createActivationFuture(params: CreateActivationRequest): Future[CreateActivationResult] =
      service.createActivation(params).promise.toFuture
    def createAssociationBatchFuture(params: CreateAssociationBatchRequest): Future[CreateAssociationBatchResult] =
      service.createAssociationBatch(params).promise.toFuture
    def createAssociationFuture(params: CreateAssociationRequest): Future[CreateAssociationResult] =
      service.createAssociation(params).promise.toFuture
    def createDocumentFuture(params: CreateDocumentRequest): Future[CreateDocumentResult] =
      service.createDocument(params).promise.toFuture
    def createMaintenanceWindowFuture(params: CreateMaintenanceWindowRequest): Future[CreateMaintenanceWindowResult] =
      service.createMaintenanceWindow(params).promise.toFuture
    def createOpsItemFuture(params: CreateOpsItemRequest): Future[CreateOpsItemResponse] =
      service.createOpsItem(params).promise.toFuture
    def createPatchBaselineFuture(params: CreatePatchBaselineRequest): Future[CreatePatchBaselineResult] =
      service.createPatchBaseline(params).promise.toFuture
    def createResourceDataSyncFuture(params: CreateResourceDataSyncRequest): Future[CreateResourceDataSyncResult] =
      service.createResourceDataSync(params).promise.toFuture
    def deleteActivationFuture(params: DeleteActivationRequest): Future[DeleteActivationResult] =
      service.deleteActivation(params).promise.toFuture
    def deleteAssociationFuture(params: DeleteAssociationRequest): Future[DeleteAssociationResult] =
      service.deleteAssociation(params).promise.toFuture
    def deleteDocumentFuture(params: DeleteDocumentRequest): Future[DeleteDocumentResult] =
      service.deleteDocument(params).promise.toFuture
    def deleteInventoryFuture(params: DeleteInventoryRequest): Future[DeleteInventoryResult] =
      service.deleteInventory(params).promise.toFuture
    def deleteMaintenanceWindowFuture(params: DeleteMaintenanceWindowRequest): Future[DeleteMaintenanceWindowResult] =
      service.deleteMaintenanceWindow(params).promise.toFuture
    def deleteParameterFuture(params: DeleteParameterRequest): Future[DeleteParameterResult] =
      service.deleteParameter(params).promise.toFuture
    def deleteParametersFuture(params: DeleteParametersRequest): Future[DeleteParametersResult] =
      service.deleteParameters(params).promise.toFuture
    def deletePatchBaselineFuture(params: DeletePatchBaselineRequest): Future[DeletePatchBaselineResult] =
      service.deletePatchBaseline(params).promise.toFuture
    def deleteResourceDataSyncFuture(params: DeleteResourceDataSyncRequest): Future[DeleteResourceDataSyncResult] =
      service.deleteResourceDataSync(params).promise.toFuture
    def deregisterManagedInstanceFuture(
        params: DeregisterManagedInstanceRequest
    ): Future[DeregisterManagedInstanceResult] = service.deregisterManagedInstance(params).promise.toFuture
    def deregisterPatchBaselineForPatchGroupFuture(
        params: DeregisterPatchBaselineForPatchGroupRequest
    ): Future[DeregisterPatchBaselineForPatchGroupResult] =
      service.deregisterPatchBaselineForPatchGroup(params).promise.toFuture
    def deregisterTargetFromMaintenanceWindowFuture(
        params: DeregisterTargetFromMaintenanceWindowRequest
    ): Future[DeregisterTargetFromMaintenanceWindowResult] =
      service.deregisterTargetFromMaintenanceWindow(params).promise.toFuture
    def deregisterTaskFromMaintenanceWindowFuture(
        params: DeregisterTaskFromMaintenanceWindowRequest
    ): Future[DeregisterTaskFromMaintenanceWindowResult] =
      service.deregisterTaskFromMaintenanceWindow(params).promise.toFuture
    def describeActivationsFuture(params: DescribeActivationsRequest): Future[DescribeActivationsResult] =
      service.describeActivations(params).promise.toFuture
    def describeAssociationExecutionTargetsFuture(
        params: DescribeAssociationExecutionTargetsRequest
    ): Future[DescribeAssociationExecutionTargetsResult] =
      service.describeAssociationExecutionTargets(params).promise.toFuture
    def describeAssociationExecutionsFuture(
        params: DescribeAssociationExecutionsRequest
    ): Future[DescribeAssociationExecutionsResult] = service.describeAssociationExecutions(params).promise.toFuture
    def describeAssociationFuture(params: DescribeAssociationRequest): Future[DescribeAssociationResult] =
      service.describeAssociation(params).promise.toFuture
    def describeAutomationExecutionsFuture(
        params: DescribeAutomationExecutionsRequest
    ): Future[DescribeAutomationExecutionsResult] = service.describeAutomationExecutions(params).promise.toFuture
    def describeAutomationStepExecutionsFuture(
        params: DescribeAutomationStepExecutionsRequest
    ): Future[DescribeAutomationStepExecutionsResult] =
      service.describeAutomationStepExecutions(params).promise.toFuture
    def describeAvailablePatchesFuture(
        params: DescribeAvailablePatchesRequest
    ): Future[DescribeAvailablePatchesResult] = service.describeAvailablePatches(params).promise.toFuture
    def describeDocumentFuture(params: DescribeDocumentRequest): Future[DescribeDocumentResult] =
      service.describeDocument(params).promise.toFuture
    def describeDocumentPermissionFuture(
        params: DescribeDocumentPermissionRequest
    ): Future[DescribeDocumentPermissionResponse] = service.describeDocumentPermission(params).promise.toFuture
    def describeEffectiveInstanceAssociationsFuture(
        params: DescribeEffectiveInstanceAssociationsRequest
    ): Future[DescribeEffectiveInstanceAssociationsResult] =
      service.describeEffectiveInstanceAssociations(params).promise.toFuture
    def describeEffectivePatchesForPatchBaselineFuture(
        params: DescribeEffectivePatchesForPatchBaselineRequest
    ): Future[DescribeEffectivePatchesForPatchBaselineResult] =
      service.describeEffectivePatchesForPatchBaseline(params).promise.toFuture
    def describeInstanceAssociationsStatusFuture(
        params: DescribeInstanceAssociationsStatusRequest
    ): Future[DescribeInstanceAssociationsStatusResult] =
      service.describeInstanceAssociationsStatus(params).promise.toFuture
    def describeInstanceInformationFuture(
        params: DescribeInstanceInformationRequest
    ): Future[DescribeInstanceInformationResult] = service.describeInstanceInformation(params).promise.toFuture
    def describeInstancePatchStatesForPatchGroupFuture(
        params: DescribeInstancePatchStatesForPatchGroupRequest
    ): Future[DescribeInstancePatchStatesForPatchGroupResult] =
      service.describeInstancePatchStatesForPatchGroup(params).promise.toFuture
    def describeInstancePatchStatesFuture(
        params: DescribeInstancePatchStatesRequest
    ): Future[DescribeInstancePatchStatesResult] = service.describeInstancePatchStates(params).promise.toFuture
    def describeInstancePatchesFuture(params: DescribeInstancePatchesRequest): Future[DescribeInstancePatchesResult] =
      service.describeInstancePatches(params).promise.toFuture
    def describeInventoryDeletionsFuture(
        params: DescribeInventoryDeletionsRequest
    ): Future[DescribeInventoryDeletionsResult] = service.describeInventoryDeletions(params).promise.toFuture
    def describeMaintenanceWindowExecutionTaskInvocationsFuture(
        params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest
    ): Future[DescribeMaintenanceWindowExecutionTaskInvocationsResult] =
      service.describeMaintenanceWindowExecutionTaskInvocations(params).promise.toFuture
    def describeMaintenanceWindowExecutionTasksFuture(
        params: DescribeMaintenanceWindowExecutionTasksRequest
    ): Future[DescribeMaintenanceWindowExecutionTasksResult] =
      service.describeMaintenanceWindowExecutionTasks(params).promise.toFuture
    def describeMaintenanceWindowExecutionsFuture(
        params: DescribeMaintenanceWindowExecutionsRequest
    ): Future[DescribeMaintenanceWindowExecutionsResult] =
      service.describeMaintenanceWindowExecutions(params).promise.toFuture
    def describeMaintenanceWindowScheduleFuture(
        params: DescribeMaintenanceWindowScheduleRequest
    ): Future[DescribeMaintenanceWindowScheduleResult] =
      service.describeMaintenanceWindowSchedule(params).promise.toFuture
    def describeMaintenanceWindowTargetsFuture(
        params: DescribeMaintenanceWindowTargetsRequest
    ): Future[DescribeMaintenanceWindowTargetsResult] =
      service.describeMaintenanceWindowTargets(params).promise.toFuture
    def describeMaintenanceWindowTasksFuture(
        params: DescribeMaintenanceWindowTasksRequest
    ): Future[DescribeMaintenanceWindowTasksResult] = service.describeMaintenanceWindowTasks(params).promise.toFuture
    def describeMaintenanceWindowsForTargetFuture(
        params: DescribeMaintenanceWindowsForTargetRequest
    ): Future[DescribeMaintenanceWindowsForTargetResult] =
      service.describeMaintenanceWindowsForTarget(params).promise.toFuture
    def describeMaintenanceWindowsFuture(
        params: DescribeMaintenanceWindowsRequest
    ): Future[DescribeMaintenanceWindowsResult] = service.describeMaintenanceWindows(params).promise.toFuture
    def describeOpsItemsFuture(params: DescribeOpsItemsRequest): Future[DescribeOpsItemsResponse] =
      service.describeOpsItems(params).promise.toFuture
    def describeParametersFuture(params: DescribeParametersRequest): Future[DescribeParametersResult] =
      service.describeParameters(params).promise.toFuture
    def describePatchBaselinesFuture(params: DescribePatchBaselinesRequest): Future[DescribePatchBaselinesResult] =
      service.describePatchBaselines(params).promise.toFuture
    def describePatchGroupStateFuture(params: DescribePatchGroupStateRequest): Future[DescribePatchGroupStateResult] =
      service.describePatchGroupState(params).promise.toFuture
    def describePatchGroupsFuture(params: DescribePatchGroupsRequest): Future[DescribePatchGroupsResult] =
      service.describePatchGroups(params).promise.toFuture
    def describePatchPropertiesFuture(params: DescribePatchPropertiesRequest): Future[DescribePatchPropertiesResult] =
      service.describePatchProperties(params).promise.toFuture
    def describeSessionsFuture(params: DescribeSessionsRequest): Future[DescribeSessionsResponse] =
      service.describeSessions(params).promise.toFuture
    def getAutomationExecutionFuture(params: GetAutomationExecutionRequest): Future[GetAutomationExecutionResult] =
      service.getAutomationExecution(params).promise.toFuture
    def getCommandInvocationFuture(params: GetCommandInvocationRequest): Future[GetCommandInvocationResult] =
      service.getCommandInvocation(params).promise.toFuture
    def getConnectionStatusFuture(params: GetConnectionStatusRequest): Future[GetConnectionStatusResponse] =
      service.getConnectionStatus(params).promise.toFuture
    def getDefaultPatchBaselineFuture(params: GetDefaultPatchBaselineRequest): Future[GetDefaultPatchBaselineResult] =
      service.getDefaultPatchBaseline(params).promise.toFuture
    def getDeployablePatchSnapshotForInstanceFuture(
        params: GetDeployablePatchSnapshotForInstanceRequest
    ): Future[GetDeployablePatchSnapshotForInstanceResult] =
      service.getDeployablePatchSnapshotForInstance(params).promise.toFuture
    def getDocumentFuture(params: GetDocumentRequest): Future[GetDocumentResult] =
      service.getDocument(params).promise.toFuture
    def getInventoryFuture(params: GetInventoryRequest): Future[GetInventoryResult] =
      service.getInventory(params).promise.toFuture
    def getInventorySchemaFuture(params: GetInventorySchemaRequest): Future[GetInventorySchemaResult] =
      service.getInventorySchema(params).promise.toFuture
    def getMaintenanceWindowExecutionFuture(
        params: GetMaintenanceWindowExecutionRequest
    ): Future[GetMaintenanceWindowExecutionResult] = service.getMaintenanceWindowExecution(params).promise.toFuture
    def getMaintenanceWindowExecutionTaskFuture(
        params: GetMaintenanceWindowExecutionTaskRequest
    ): Future[GetMaintenanceWindowExecutionTaskResult] =
      service.getMaintenanceWindowExecutionTask(params).promise.toFuture
    def getMaintenanceWindowExecutionTaskInvocationFuture(
        params: GetMaintenanceWindowExecutionTaskInvocationRequest
    ): Future[GetMaintenanceWindowExecutionTaskInvocationResult] =
      service.getMaintenanceWindowExecutionTaskInvocation(params).promise.toFuture
    def getMaintenanceWindowFuture(params: GetMaintenanceWindowRequest): Future[GetMaintenanceWindowResult] =
      service.getMaintenanceWindow(params).promise.toFuture
    def getMaintenanceWindowTaskFuture(
        params: GetMaintenanceWindowTaskRequest
    ): Future[GetMaintenanceWindowTaskResult] = service.getMaintenanceWindowTask(params).promise.toFuture
    def getOpsItemFuture(params: GetOpsItemRequest): Future[GetOpsItemResponse] =
      service.getOpsItem(params).promise.toFuture
    def getOpsSummaryFuture(params: GetOpsSummaryRequest): Future[GetOpsSummaryResult] =
      service.getOpsSummary(params).promise.toFuture
    def getParameterFuture(params: GetParameterRequest): Future[GetParameterResult] =
      service.getParameter(params).promise.toFuture
    def getParameterHistoryFuture(params: GetParameterHistoryRequest): Future[GetParameterHistoryResult] =
      service.getParameterHistory(params).promise.toFuture
    def getParametersByPathFuture(params: GetParametersByPathRequest): Future[GetParametersByPathResult] =
      service.getParametersByPath(params).promise.toFuture
    def getParametersFuture(params: GetParametersRequest): Future[GetParametersResult] =
      service.getParameters(params).promise.toFuture
    def getPatchBaselineForPatchGroupFuture(
        params: GetPatchBaselineForPatchGroupRequest
    ): Future[GetPatchBaselineForPatchGroupResult] = service.getPatchBaselineForPatchGroup(params).promise.toFuture
    def getPatchBaselineFuture(params: GetPatchBaselineRequest): Future[GetPatchBaselineResult] =
      service.getPatchBaseline(params).promise.toFuture
    def getServiceSettingFuture(params: GetServiceSettingRequest): Future[GetServiceSettingResult] =
      service.getServiceSetting(params).promise.toFuture
    def labelParameterVersionFuture(params: LabelParameterVersionRequest): Future[LabelParameterVersionResult] =
      service.labelParameterVersion(params).promise.toFuture
    def listAssociationVersionsFuture(params: ListAssociationVersionsRequest): Future[ListAssociationVersionsResult] =
      service.listAssociationVersions(params).promise.toFuture
    def listAssociationsFuture(params: ListAssociationsRequest): Future[ListAssociationsResult] =
      service.listAssociations(params).promise.toFuture
    def listCommandInvocationsFuture(params: ListCommandInvocationsRequest): Future[ListCommandInvocationsResult] =
      service.listCommandInvocations(params).promise.toFuture
    def listCommandsFuture(params: ListCommandsRequest): Future[ListCommandsResult] =
      service.listCommands(params).promise.toFuture
    def listComplianceItemsFuture(params: ListComplianceItemsRequest): Future[ListComplianceItemsResult] =
      service.listComplianceItems(params).promise.toFuture
    def listComplianceSummariesFuture(params: ListComplianceSummariesRequest): Future[ListComplianceSummariesResult] =
      service.listComplianceSummaries(params).promise.toFuture
    def listDocumentVersionsFuture(params: ListDocumentVersionsRequest): Future[ListDocumentVersionsResult] =
      service.listDocumentVersions(params).promise.toFuture
    def listDocumentsFuture(params: ListDocumentsRequest): Future[ListDocumentsResult] =
      service.listDocuments(params).promise.toFuture
    def listInventoryEntriesFuture(params: ListInventoryEntriesRequest): Future[ListInventoryEntriesResult] =
      service.listInventoryEntries(params).promise.toFuture
    def listResourceComplianceSummariesFuture(
        params: ListResourceComplianceSummariesRequest
    ): Future[ListResourceComplianceSummariesResult] = service.listResourceComplianceSummaries(params).promise.toFuture
    def listResourceDataSyncFuture(params: ListResourceDataSyncRequest): Future[ListResourceDataSyncResult] =
      service.listResourceDataSync(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise.toFuture
    def modifyDocumentPermissionFuture(
        params: ModifyDocumentPermissionRequest
    ): Future[ModifyDocumentPermissionResponse] = service.modifyDocumentPermission(params).promise.toFuture
    def putComplianceItemsFuture(params: PutComplianceItemsRequest): Future[PutComplianceItemsResult] =
      service.putComplianceItems(params).promise.toFuture
    def putInventoryFuture(params: PutInventoryRequest): Future[PutInventoryResult] =
      service.putInventory(params).promise.toFuture
    def putParameterFuture(params: PutParameterRequest): Future[PutParameterResult] =
      service.putParameter(params).promise.toFuture
    def registerDefaultPatchBaselineFuture(
        params: RegisterDefaultPatchBaselineRequest
    ): Future[RegisterDefaultPatchBaselineResult] = service.registerDefaultPatchBaseline(params).promise.toFuture
    def registerPatchBaselineForPatchGroupFuture(
        params: RegisterPatchBaselineForPatchGroupRequest
    ): Future[RegisterPatchBaselineForPatchGroupResult] =
      service.registerPatchBaselineForPatchGroup(params).promise.toFuture
    def registerTargetWithMaintenanceWindowFuture(
        params: RegisterTargetWithMaintenanceWindowRequest
    ): Future[RegisterTargetWithMaintenanceWindowResult] =
      service.registerTargetWithMaintenanceWindow(params).promise.toFuture
    def registerTaskWithMaintenanceWindowFuture(
        params: RegisterTaskWithMaintenanceWindowRequest
    ): Future[RegisterTaskWithMaintenanceWindowResult] =
      service.registerTaskWithMaintenanceWindow(params).promise.toFuture
    def removeTagsFromResourceFuture(params: RemoveTagsFromResourceRequest): Future[RemoveTagsFromResourceResult] =
      service.removeTagsFromResource(params).promise.toFuture
    def resetServiceSettingFuture(params: ResetServiceSettingRequest): Future[ResetServiceSettingResult] =
      service.resetServiceSetting(params).promise.toFuture
    def resumeSessionFuture(params: ResumeSessionRequest): Future[ResumeSessionResponse] =
      service.resumeSession(params).promise.toFuture
    def sendAutomationSignalFuture(params: SendAutomationSignalRequest): Future[SendAutomationSignalResult] =
      service.sendAutomationSignal(params).promise.toFuture
    def sendCommandFuture(params: SendCommandRequest): Future[SendCommandResult] =
      service.sendCommand(params).promise.toFuture
    def startAssociationsOnceFuture(params: StartAssociationsOnceRequest): Future[StartAssociationsOnceResult] =
      service.startAssociationsOnce(params).promise.toFuture
    def startAutomationExecutionFuture(
        params: StartAutomationExecutionRequest
    ): Future[StartAutomationExecutionResult] = service.startAutomationExecution(params).promise.toFuture
    def startSessionFuture(params: StartSessionRequest): Future[StartSessionResponse] =
      service.startSession(params).promise.toFuture
    def stopAutomationExecutionFuture(params: StopAutomationExecutionRequest): Future[StopAutomationExecutionResult] =
      service.stopAutomationExecution(params).promise.toFuture
    def terminateSessionFuture(params: TerminateSessionRequest): Future[TerminateSessionResponse] =
      service.terminateSession(params).promise.toFuture
    def updateAssociationFuture(params: UpdateAssociationRequest): Future[UpdateAssociationResult] =
      service.updateAssociation(params).promise.toFuture
    def updateAssociationStatusFuture(params: UpdateAssociationStatusRequest): Future[UpdateAssociationStatusResult] =
      service.updateAssociationStatus(params).promise.toFuture
    def updateDocumentDefaultVersionFuture(
        params: UpdateDocumentDefaultVersionRequest
    ): Future[UpdateDocumentDefaultVersionResult] = service.updateDocumentDefaultVersion(params).promise.toFuture
    def updateDocumentFuture(params: UpdateDocumentRequest): Future[UpdateDocumentResult] =
      service.updateDocument(params).promise.toFuture
    def updateMaintenanceWindowFuture(params: UpdateMaintenanceWindowRequest): Future[UpdateMaintenanceWindowResult] =
      service.updateMaintenanceWindow(params).promise.toFuture
    def updateMaintenanceWindowTargetFuture(
        params: UpdateMaintenanceWindowTargetRequest
    ): Future[UpdateMaintenanceWindowTargetResult] = service.updateMaintenanceWindowTarget(params).promise.toFuture
    def updateMaintenanceWindowTaskFuture(
        params: UpdateMaintenanceWindowTaskRequest
    ): Future[UpdateMaintenanceWindowTaskResult] = service.updateMaintenanceWindowTask(params).promise.toFuture
    def updateManagedInstanceRoleFuture(
        params: UpdateManagedInstanceRoleRequest
    ): Future[UpdateManagedInstanceRoleResult] = service.updateManagedInstanceRole(params).promise.toFuture
    def updateOpsItemFuture(params: UpdateOpsItemRequest): Future[UpdateOpsItemResponse] =
      service.updateOpsItem(params).promise.toFuture
    def updatePatchBaselineFuture(params: UpdatePatchBaselineRequest): Future[UpdatePatchBaselineResult] =
      service.updatePatchBaseline(params).promise.toFuture
    def updateServiceSettingFuture(params: UpdateServiceSettingRequest): Future[UpdateServiceSettingResult] =
      service.updateServiceSetting(params).promise.toFuture
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
    def updateOpsItem(params: UpdateOpsItemRequest): Request[UpdateOpsItemResponse]                    = js.native
    def updatePatchBaseline(params: UpdatePatchBaselineRequest): Request[UpdatePatchBaselineResult]    = js.native
    def updateServiceSetting(params: UpdateServiceSettingRequest): Request[UpdateServiceSettingResult] = js.native
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
    var Tags: js.UndefOr[TagList]
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
        RegistrationsCount: js.UndefOr[RegistrationsCount] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Activation = {
      val __obj = js.Dictionary.empty[js.Any]
      ActivationId.foreach(__v => __obj.update("ActivationId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DefaultInstanceName.foreach(__v => __obj.update("DefaultInstanceName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.update("ExpirationDate", __v.asInstanceOf[js.Any]))
      Expired.foreach(__v => __obj.update("Expired", __v.asInstanceOf[js.Any]))
      IamRole.foreach(__v => __obj.update("IamRole", __v.asInstanceOf[js.Any]))
      RegistrationLimit.foreach(__v => __obj.update("RegistrationLimit", __v.asInstanceOf[js.Any]))
      RegistrationsCount.foreach(__v => __obj.update("RegistrationsCount", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceTypeForTagging,
        Tags: TagList
    ): AddTagsToResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResult extends js.Object {}

  object AddTagsToResourceResult {
    def apply(
        ): AddTagsToResourceResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AddTagsToResourceResult]
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
    var Name: js.UndefOr[DocumentARN]
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
        Name: js.UndefOr[DocumentARN] = js.undefined,
        Overview: js.UndefOr[AssociationOverview] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): Association = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.update("LastExecutionDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Overview.foreach(__v => __obj.update("Overview", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Association]
    }
  }

  object AssociationComplianceSeverityEnum {
    val CRITICAL    = "CRITICAL"
    val HIGH        = "HIGH"
    val MEDIUM      = "MEDIUM"
    val LOW         = "LOW"
    val UNSPECIFIED = "UNSPECIFIED"

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED))
  }

  /**
    * Describes the parameters for a document.
    */
  @js.native
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

  object AssociationDescription {
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
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
        Targets: js.UndefOr[Targets] = js.undefined
    ): AssociationDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(
        __v => __obj.update("AutomationTargetParameterName", __v.asInstanceOf[js.Any])
      )
      ComplianceSeverity.foreach(__v => __obj.update("ComplianceSeverity", __v.asInstanceOf[js.Any]))
      Date.foreach(__v => __obj.update("Date", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.update("LastExecutionDate", __v.asInstanceOf[js.Any]))
      LastSuccessfulExecutionDate.foreach(__v => __obj.update("LastSuccessfulExecutionDate", __v.asInstanceOf[js.Any]))
      LastUpdateAssociationDate.foreach(__v => __obj.update("LastUpdateAssociationDate", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      Overview.foreach(__v => __obj.update("Overview", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationDescription]
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
        Status: js.UndefOr[StatusName] = js.undefined
    ): AssociationExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.update("DetailedStatus", __v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.update("ExecutionId", __v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.update("LastExecutionDate", __v.asInstanceOf[js.Any]))
      ResourceCountByStatus.foreach(__v => __obj.update("ResourceCountByStatus", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationExecution]
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
        Value: AssociationExecutionFilterValue
    ): AssociationExecutionFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociationExecutionFilter]
    }
  }

  object AssociationExecutionFilterKeyEnum {
    val ExecutionId = "ExecutionId"
    val Status      = "Status"
    val CreatedTime = "CreatedTime"

    val values = js.Object.freeze(js.Array(ExecutionId, Status, CreatedTime))
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
        Status: js.UndefOr[StatusName] = js.undefined
    ): AssociationExecutionTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.update("DetailedStatus", __v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.update("ExecutionId", __v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.update("LastExecutionDate", __v.asInstanceOf[js.Any]))
      OutputSource.foreach(__v => __obj.update("OutputSource", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationExecutionTarget]
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
        Value: AssociationExecutionTargetsFilterValue
    ): AssociationExecutionTargetsFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociationExecutionTargetsFilter]
    }
  }

  object AssociationExecutionTargetsFilterKeyEnum {
    val Status       = "Status"
    val ResourceId   = "ResourceId"
    val ResourceType = "ResourceType"

    val values = js.Object.freeze(js.Array(Status, ResourceId, ResourceType))
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
        value: AssociationFilterValue
    ): AssociationFilter = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociationFilter]
    }
  }

  object AssociationFilterKeyEnum {
    val InstanceId            = "InstanceId"
    val Name                  = "Name"
    val AssociationId         = "AssociationId"
    val AssociationStatusName = "AssociationStatusName"
    val LastExecutedBefore    = "LastExecutedBefore"
    val LastExecutedAfter     = "LastExecutedAfter"
    val AssociationName       = "AssociationName"

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

  object AssociationFilterOperatorTypeEnum {
    val EQUAL        = "EQUAL"
    val LESS_THAN    = "LESS_THAN"
    val GREATER_THAN = "GREATER_THAN"

    val values = js.Object.freeze(js.Array(EQUAL, LESS_THAN, GREATER_THAN))
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
        Status: js.UndefOr[StatusName] = js.undefined
    ): AssociationOverview = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationStatusAggregatedCount.foreach(
        __v => __obj.update("AssociationStatusAggregatedCount", __v.asInstanceOf[js.Any])
      )
      DetailedStatus.foreach(__v => __obj.update("DetailedStatus", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationOverview]
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
        AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
    ): AssociationStatus = {
      val __obj = js.Dictionary[js.Any](
        "Date"    -> Date.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      )

      AdditionalInfo.foreach(__v => __obj.update("AdditionalInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationStatus]
    }
  }

  object AssociationStatusNameEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failed  = "Failed"

    val values = js.Object.freeze(js.Array(Pending, Success, Failed))
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
    var Name: js.UndefOr[DocumentARN]
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
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): AssociationVersionInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      ComplianceSeverity.foreach(__v => __obj.update("ComplianceSeverity", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationVersionInfo]
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
        Url: js.UndefOr[AttachmentUrl] = js.undefined
    ): AttachmentContent = {
      val __obj = js.Dictionary.empty[js.Any]
      Hash.foreach(__v => __obj.update("Hash", __v.asInstanceOf[js.Any]))
      HashType.foreach(__v => __obj.update("HashType", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentContent]
    }
  }

  object AttachmentHashTypeEnum {
    val Sha256 = "Sha256"

    val values = js.Object.freeze(js.Array(Sha256))
  }

  /**
    * An attribute of an attachment, such as the attachment name.
    */
  @js.native
  trait AttachmentInformation extends js.Object {
    var Name: js.UndefOr[AttachmentName]
  }

  object AttachmentInformation {
    def apply(
        Name: js.UndefOr[AttachmentName] = js.undefined
    ): AttachmentInformation = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentInformation]
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
        Values: js.UndefOr[AttachmentsSourceValues] = js.undefined
    ): AttachmentsSource = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentsSource]
    }
  }

  object AttachmentsSourceKeyEnum {
    val SourceUrl = "SourceUrl"

    val values = js.Object.freeze(js.Array(SourceUrl))
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
        Targets: js.UndefOr[Targets] = js.undefined
    ): AutomationExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomationExecutionId.foreach(__v => __obj.update("AutomationExecutionId", __v.asInstanceOf[js.Any]))
      AutomationExecutionStatus.foreach(__v => __obj.update("AutomationExecutionStatus", __v.asInstanceOf[js.Any]))
      CurrentAction.foreach(__v => __obj.update("CurrentAction", __v.asInstanceOf[js.Any]))
      CurrentStepName.foreach(__v => __obj.update("CurrentStepName", __v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      ExecutedBy.foreach(__v => __obj.update("ExecutedBy", __v.asInstanceOf[js.Any]))
      ExecutionEndTime.foreach(__v => __obj.update("ExecutionEndTime", __v.asInstanceOf[js.Any]))
      ExecutionStartTime.foreach(__v => __obj.update("ExecutionStartTime", __v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.update("FailureMessage", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.update("Outputs", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ParentAutomationExecutionId.foreach(__v => __obj.update("ParentAutomationExecutionId", __v.asInstanceOf[js.Any]))
      ProgressCounters.foreach(__v => __obj.update("ProgressCounters", __v.asInstanceOf[js.Any]))
      ResolvedTargets.foreach(__v => __obj.update("ResolvedTargets", __v.asInstanceOf[js.Any]))
      StepExecutions.foreach(__v => __obj.update("StepExecutions", __v.asInstanceOf[js.Any]))
      StepExecutionsTruncated.foreach(__v => __obj.update("StepExecutionsTruncated", __v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.update("TargetLocations", __v.asInstanceOf[js.Any]))
      TargetMaps.foreach(__v => __obj.update("TargetMaps", __v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.update("TargetParameterName", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomationExecution]
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
        Values: AutomationExecutionFilterValueList
    ): AutomationExecutionFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AutomationExecutionFilter]
    }
  }

  object AutomationExecutionFilterKeyEnum {
    val DocumentNamePrefix = "DocumentNamePrefix"
    val ExecutionStatus    = "ExecutionStatus"
    val ExecutionId        = "ExecutionId"
    val ParentExecutionId  = "ParentExecutionId"
    val CurrentAction      = "CurrentAction"
    val StartTimeBefore    = "StartTimeBefore"
    val StartTimeAfter     = "StartTimeAfter"
    val AutomationType     = "AutomationType"

    val values = js.Object.freeze(
      js.Array(
        DocumentNamePrefix,
        ExecutionStatus,
        ExecutionId,
        ParentExecutionId,
        CurrentAction,
        StartTimeBefore,
        StartTimeAfter,
        AutomationType
      )
    )
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
        Targets: js.UndefOr[Targets] = js.undefined
    ): AutomationExecutionMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomationExecutionId.foreach(__v => __obj.update("AutomationExecutionId", __v.asInstanceOf[js.Any]))
      AutomationExecutionStatus.foreach(__v => __obj.update("AutomationExecutionStatus", __v.asInstanceOf[js.Any]))
      AutomationType.foreach(__v => __obj.update("AutomationType", __v.asInstanceOf[js.Any]))
      CurrentAction.foreach(__v => __obj.update("CurrentAction", __v.asInstanceOf[js.Any]))
      CurrentStepName.foreach(__v => __obj.update("CurrentStepName", __v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      ExecutedBy.foreach(__v => __obj.update("ExecutedBy", __v.asInstanceOf[js.Any]))
      ExecutionEndTime.foreach(__v => __obj.update("ExecutionEndTime", __v.asInstanceOf[js.Any]))
      ExecutionStartTime.foreach(__v => __obj.update("ExecutionStartTime", __v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.update("FailureMessage", __v.asInstanceOf[js.Any]))
      LogFile.foreach(__v => __obj.update("LogFile", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.update("Outputs", __v.asInstanceOf[js.Any]))
      ParentAutomationExecutionId.foreach(__v => __obj.update("ParentAutomationExecutionId", __v.asInstanceOf[js.Any]))
      ResolvedTargets.foreach(__v => __obj.update("ResolvedTargets", __v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      TargetMaps.foreach(__v => __obj.update("TargetMaps", __v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.update("TargetParameterName", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomationExecutionMetadata]
    }
  }

  object AutomationExecutionStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Waiting    = "Waiting"
    val Success    = "Success"
    val TimedOut   = "TimedOut"
    val Cancelling = "Cancelling"
    val Cancelled  = "Cancelled"
    val Failed     = "Failed"

    val values =
      js.Object.freeze(js.Array(Pending, InProgress, Waiting, Success, TimedOut, Cancelling, Cancelled, Failed))
  }

  object AutomationTypeEnum {
    val CrossAccount = "CrossAccount"
    val Local        = "Local"

    val values = js.Object.freeze(js.Array(CrossAccount, Local))
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
        InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
    ): CancelCommandRequest = {
      val __obj = js.Dictionary[js.Any](
        "CommandId" -> CommandId.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelCommandRequest]
    }
  }

  /**
    * Whether or not the command was successfully canceled. There is no guarantee that a request can be canceled.
    */
  @js.native
  trait CancelCommandResult extends js.Object {}

  object CancelCommandResult {
    def apply(
        ): CancelCommandResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CancelCommandResult]
    }
  }

  @js.native
  trait CancelMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object CancelMaintenanceWindowExecutionRequest {
    def apply(
        WindowExecutionId: MaintenanceWindowExecutionId
    ): CancelMaintenanceWindowExecutionRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): CancelMaintenanceWindowExecutionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelMaintenanceWindowExecutionResult]
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
        CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled] = js.undefined
    ): CloudWatchOutputConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchLogGroupName.foreach(__v => __obj.update("CloudWatchLogGroupName", __v.asInstanceOf[js.Any]))
      CloudWatchOutputEnabled.foreach(__v => __obj.update("CloudWatchOutputEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchOutputConfig]
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
        Targets: js.UndefOr[Targets] = js.undefined
    ): Command = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchOutputConfig.foreach(__v => __obj.update("CloudWatchOutputConfig", __v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.update("CommandId", __v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      CompletedCount.foreach(__v => __obj.update("CompletedCount", __v.asInstanceOf[js.Any]))
      DeliveryTimedOutCount.foreach(__v => __obj.update("DeliveryTimedOutCount", __v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      ErrorCount.foreach(__v => __obj.update("ErrorCount", __v.asInstanceOf[js.Any]))
      ExpiresAfter.foreach(__v => __obj.update("ExpiresAfter", __v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.update("NotificationConfig", __v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.update("OutputS3BucketName", __v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.update("OutputS3KeyPrefix", __v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.update("OutputS3Region", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      RequestedDateTime.foreach(__v => __obj.update("RequestedDateTime", __v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.update("ServiceRole", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TargetCount.foreach(__v => __obj.update("TargetCount", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Command]
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
        value: CommandFilterValue
    ): CommandFilter = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CommandFilter]
    }
  }

  object CommandFilterKeyEnum {
    val InvokedAfter   = "InvokedAfter"
    val InvokedBefore  = "InvokedBefore"
    val Status         = "Status"
    val ExecutionStage = "ExecutionStage"
    val DocumentName   = "DocumentName"

    val values = js.Object.freeze(js.Array(InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName))
  }

  /**
    * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. A command invocation returns status and detail information about a command you ran.
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
        TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined
    ): CommandInvocation = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchOutputConfig.foreach(__v => __obj.update("CloudWatchOutputConfig", __v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.update("CommandId", __v.asInstanceOf[js.Any]))
      CommandPlugins.foreach(__v => __obj.update("CommandPlugins", __v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      InstanceName.foreach(__v => __obj.update("InstanceName", __v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.update("NotificationConfig", __v.asInstanceOf[js.Any]))
      RequestedDateTime.foreach(__v => __obj.update("RequestedDateTime", __v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.update("ServiceRole", __v.asInstanceOf[js.Any]))
      StandardErrorUrl.foreach(__v => __obj.update("StandardErrorUrl", __v.asInstanceOf[js.Any]))
      StandardOutputUrl.foreach(__v => __obj.update("StandardOutputUrl", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TraceOutput.foreach(__v => __obj.update("TraceOutput", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommandInvocation]
    }
  }

  object CommandInvocationStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Delayed    = "Delayed"
    val Success    = "Success"
    val Cancelled  = "Cancelled"
    val TimedOut   = "TimedOut"
    val Failed     = "Failed"
    val Cancelling = "Cancelling"

    val values =
      js.Object.freeze(js.Array(Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling))
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
        StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    ): CommandPlugin = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.update("Output", __v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.update("OutputS3BucketName", __v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.update("OutputS3KeyPrefix", __v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.update("OutputS3Region", __v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.update("ResponseCode", __v.asInstanceOf[js.Any]))
      ResponseFinishDateTime.foreach(__v => __obj.update("ResponseFinishDateTime", __v.asInstanceOf[js.Any]))
      ResponseStartDateTime.foreach(__v => __obj.update("ResponseStartDateTime", __v.asInstanceOf[js.Any]))
      StandardErrorUrl.foreach(__v => __obj.update("StandardErrorUrl", __v.asInstanceOf[js.Any]))
      StandardOutputUrl.foreach(__v => __obj.update("StandardOutputUrl", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommandPlugin]
    }
  }

  object CommandPluginStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Success    = "Success"
    val TimedOut   = "TimedOut"
    val Cancelled  = "Cancelled"
    val Failed     = "Failed"

    val values = js.Object.freeze(js.Array(Pending, InProgress, Success, TimedOut, Cancelled, Failed))
  }

  object CommandStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Success    = "Success"
    val Cancelled  = "Cancelled"
    val Failed     = "Failed"
    val TimedOut   = "TimedOut"
    val Cancelling = "Cancelling"

    val values = js.Object.freeze(js.Array(Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling))
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
        ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined
    ): ComplianceExecutionSummary = {
      val __obj = js.Dictionary[js.Any](
        "ExecutionTime" -> ExecutionTime.asInstanceOf[js.Any]
      )

      ExecutionId.foreach(__v => __obj.update("ExecutionId", __v.asInstanceOf[js.Any]))
      ExecutionType.foreach(__v => __obj.update("ExecutionType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceExecutionSummary]
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
        Title: js.UndefOr[ComplianceItemTitle] = js.undefined
    ): ComplianceItem = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      ExecutionSummary.foreach(__v => __obj.update("ExecutionSummary", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.update("Severity", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceItem]
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
        Title: js.UndefOr[ComplianceItemTitle] = js.undefined
    ): ComplianceItemEntry = {
      val __obj = js.Dictionary[js.Any](
        "Severity" -> Severity.asInstanceOf[js.Any],
        "Status"   -> Status.asInstanceOf[js.Any]
      )

      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceItemEntry]
    }
  }

  object ComplianceQueryOperatorTypeEnum {
    val EQUAL        = "EQUAL"
    val NOT_EQUAL    = "NOT_EQUAL"
    val BEGIN_WITH   = "BEGIN_WITH"
    val LESS_THAN    = "LESS_THAN"
    val GREATER_THAN = "GREATER_THAN"

    val values = js.Object.freeze(js.Array(EQUAL, NOT_EQUAL, BEGIN_WITH, LESS_THAN, GREATER_THAN))
  }

  object ComplianceSeverityEnum {
    val CRITICAL      = "CRITICAL"
    val HIGH          = "HIGH"
    val MEDIUM        = "MEDIUM"
    val LOW           = "LOW"
    val INFORMATIONAL = "INFORMATIONAL"
    val UNSPECIFIED   = "UNSPECIFIED"

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED))
  }

  object ComplianceStatusEnum {
    val COMPLIANT     = "COMPLIANT"
    val NON_COMPLIANT = "NON_COMPLIANT"

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT))
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
        Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined
    ): ComplianceStringFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceStringFilter]
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
        NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined
    ): ComplianceSummaryItem = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      CompliantSummary.foreach(__v => __obj.update("CompliantSummary", __v.asInstanceOf[js.Any]))
      NonCompliantSummary.foreach(__v => __obj.update("NonCompliantSummary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceSummaryItem]
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
        SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined
    ): CompliantSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CompliantCount.foreach(__v => __obj.update("CompliantCount", __v.asInstanceOf[js.Any]))
      SeveritySummary.foreach(__v => __obj.update("SeveritySummary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompliantSummary]
    }
  }

  object ConnectionStatusEnum {
    val Connected    = "Connected"
    val NotConnected = "NotConnected"

    val values = js.Object.freeze(js.Array(Connected, NotConnected))
  }

  @js.native
  trait CreateActivationRequest extends js.Object {
    var IamRole: IamRole
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName]
    var Description: js.UndefOr[ActivationDescription]
    var ExpirationDate: js.UndefOr[ExpirationDate]
    var RegistrationLimit: js.UndefOr[RegistrationLimit]
    var Tags: js.UndefOr[TagList]
  }

  object CreateActivationRequest {
    def apply(
        IamRole: IamRole,
        DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined,
        Description: js.UndefOr[ActivationDescription] = js.undefined,
        ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined,
        RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateActivationRequest = {
      val __obj = js.Dictionary[js.Any](
        "IamRole" -> IamRole.asInstanceOf[js.Any]
      )

      DefaultInstanceName.foreach(__v => __obj.update("DefaultInstanceName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.update("ExpirationDate", __v.asInstanceOf[js.Any]))
      RegistrationLimit.foreach(__v => __obj.update("RegistrationLimit", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActivationRequest]
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
        ActivationId: js.UndefOr[ActivationId] = js.undefined
    ): CreateActivationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ActivationCode.foreach(__v => __obj.update("ActivationCode", __v.asInstanceOf[js.Any]))
      ActivationId.foreach(__v => __obj.update("ActivationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActivationResult]
    }
  }

  @js.native
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: CreateAssociationBatchRequestEntries
  }

  object CreateAssociationBatchRequest {
    def apply(
        Entries: CreateAssociationBatchRequestEntries
    ): CreateAssociationBatchRequest = {
      val __obj = js.Dictionary[js.Any](
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAssociationBatchRequest]
    }
  }

  /**
    * Describes the association of a Systems Manager SSM document and an instance.
    */
  @js.native
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

  object CreateAssociationBatchRequestEntry {
    def apply(
        Name: DocumentARN,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): CreateAssociationBatchRequestEntry = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(
        __v => __obj.update("AutomationTargetParameterName", __v.asInstanceOf[js.Any])
      )
      ComplianceSeverity.foreach(__v => __obj.update("ComplianceSeverity", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationBatchRequestEntry]
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
        Successful: js.UndefOr[AssociationDescriptionList] = js.undefined
    ): CreateAssociationBatchResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Failed.foreach(__v => __obj.update("Failed", __v.asInstanceOf[js.Any]))
      Successful.foreach(__v => __obj.update("Successful", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationBatchResult]
    }
  }

  @js.native
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

  object CreateAssociationRequest {
    def apply(
        Name: DocumentARN,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): CreateAssociationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(
        __v => __obj.update("AutomationTargetParameterName", __v.asInstanceOf[js.Any])
      )
      ComplianceSeverity.foreach(__v => __obj.update("ComplianceSeverity", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationRequest]
    }
  }

  @js.native
  trait CreateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object CreateAssociationResult {
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): CreateAssociationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationDescription.foreach(__v => __obj.update("AssociationDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssociationResult]
    }
  }

  @js.native
  trait CreateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
    var Attachments: js.UndefOr[AttachmentsSourceList]
    var DocumentFormat: js.UndefOr[DocumentFormat]
    var DocumentType: js.UndefOr[DocumentType]
    var Tags: js.UndefOr[TagList]
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
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): CreateDocumentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Content" -> Content.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      )

      Attachments.foreach(__v => __obj.update("Attachments", __v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.update("DocumentType", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.update("TargetType", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentRequest]
    }
  }

  @js.native
  trait CreateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  object CreateDocumentResult {
    def apply(
        DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): CreateDocumentResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentDescription.foreach(__v => __obj.update("DocumentDescription", __v.asInstanceOf[js.Any]))
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
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone]
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime]
    var Tags: js.UndefOr[TagList]
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
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
        "AllowUnassociatedTargets" -> AllowUnassociatedTargets.asInstanceOf[js.Any],
        "Cutoff"                   -> Cutoff.asInstanceOf[js.Any],
        "Duration"                 -> Duration.asInstanceOf[js.Any],
        "Name"                     -> Name.asInstanceOf[js.Any],
        "Schedule"                 -> Schedule.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.update("ScheduleTimezone", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMaintenanceWindowRequest]
    }
  }

  @js.native
  trait CreateMaintenanceWindowResult extends js.Object {
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object CreateMaintenanceWindowResult {
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): CreateMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMaintenanceWindowResult]
    }
  }

  @js.native
  trait CreateOpsItemRequest extends js.Object {
    var Description: OpsItemDescription
    var Source: OpsItemSource
    var Title: OpsItemTitle
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Tags: js.UndefOr[TagList]
  }

  object CreateOpsItemRequest {
    def apply(
        Description: OpsItemDescription,
        Source: OpsItemSource,
        Title: OpsItemTitle,
        Notifications: js.UndefOr[OpsItemNotifications] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateOpsItemRequest = {
      val __obj = js.Dictionary[js.Any](
        "Description" -> Description.asInstanceOf[js.Any],
        "Source"      -> Source.asInstanceOf[js.Any],
        "Title"       -> Title.asInstanceOf[js.Any]
      )

      Notifications.foreach(__v => __obj.update("Notifications", __v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.update("OperationalData", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      RelatedOpsItems.foreach(__v => __obj.update("RelatedOpsItems", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpsItemRequest]
    }
  }

  @js.native
  trait CreateOpsItemResponse extends js.Object {
    var OpsItemId: js.UndefOr[String]
  }

  object CreateOpsItemResponse {
    def apply(
        OpsItemId: js.UndefOr[String] = js.undefined
    ): CreateOpsItemResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OpsItemId.foreach(__v => __obj.update("OpsItemId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpsItemResponse]
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
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ApprovalRules.foreach(__v => __obj.update("ApprovalRules", __v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.update("ApprovedPatches", __v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(
        __v => __obj.update("ApprovedPatchesComplianceLevel", __v.asInstanceOf[js.Any])
      )
      ApprovedPatchesEnableNonSecurity.foreach(
        __v => __obj.update("ApprovedPatchesEnableNonSecurity", __v.asInstanceOf[js.Any])
      )
      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.update("GlobalFilters", __v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.update("RejectedPatches", __v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.update("RejectedPatchesAction", __v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.update("Sources", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePatchBaselineRequest]
    }
  }

  @js.native
  trait CreatePatchBaselineResult extends js.Object {
    var BaselineId: js.UndefOr[BaselineId]
  }

  object CreatePatchBaselineResult {
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): CreatePatchBaselineResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePatchBaselineResult]
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
        SyncName: ResourceDataSyncName
    ): CreateResourceDataSyncRequest = {
      val __obj = js.Dictionary[js.Any](
        "S3Destination" -> S3Destination.asInstanceOf[js.Any],
        "SyncName"      -> SyncName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateResourceDataSyncRequest]
    }
  }

  @js.native
  trait CreateResourceDataSyncResult extends js.Object {}

  object CreateResourceDataSyncResult {
    def apply(
        ): CreateResourceDataSyncResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateResourceDataSyncResult]
    }
  }

  @js.native
  trait DeleteActivationRequest extends js.Object {
    var ActivationId: ActivationId
  }

  object DeleteActivationRequest {
    def apply(
        ActivationId: ActivationId
    ): DeleteActivationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ActivationId" -> ActivationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteActivationRequest]
    }
  }

  @js.native
  trait DeleteActivationResult extends js.Object {}

  object DeleteActivationResult {
    def apply(
        ): DeleteActivationResult = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined
    ): DeleteAssociationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssociationResult extends js.Object {}

  object DeleteAssociationResult {
    def apply(
        ): DeleteAssociationResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteAssociationResult]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var Name: DocumentName
    var DocumentVersion: js.UndefOr[DocumentVersion]
    var VersionName: js.UndefOr[DocumentVersionName]
  }

  object DeleteDocumentRequest {
    def apply(
        Name: DocumentName,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DeleteDocumentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteDocumentResult extends js.Object {}

  object DeleteDocumentResult {
    def apply(
        ): DeleteDocumentResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDocumentResult]
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
        SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.undefined
    ): DeleteInventoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.update("DryRun", __v.asInstanceOf[js.Any]))
      SchemaDeleteOption.foreach(__v => __obj.update("SchemaDeleteOption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInventoryRequest]
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
        TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): DeleteInventoryResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DeletionId.foreach(__v => __obj.update("DeletionId", __v.asInstanceOf[js.Any]))
      DeletionSummary.foreach(__v => __obj.update("DeletionSummary", __v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.update("TypeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInventoryResult]
    }
  }

  @js.native
  trait DeleteMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object DeleteMaintenanceWindowRequest {
    def apply(
        WindowId: MaintenanceWindowId
    ): DeleteMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): DeleteMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMaintenanceWindowResult]
    }
  }

  @js.native
  trait DeleteParameterRequest extends js.Object {
    var Name: PSParameterName
  }

  object DeleteParameterRequest {
    def apply(
        Name: PSParameterName
    ): DeleteParameterRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteParameterRequest]
    }
  }

  @js.native
  trait DeleteParameterResult extends js.Object {}

  object DeleteParameterResult {
    def apply(
        ): DeleteParameterResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteParameterResult]
    }
  }

  @js.native
  trait DeleteParametersRequest extends js.Object {
    var Names: ParameterNameList
  }

  object DeleteParametersRequest {
    def apply(
        Names: ParameterNameList
    ): DeleteParametersRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        DeletedParameters: js.UndefOr[ParameterNameList] = js.undefined,
        InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
    ): DeleteParametersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DeletedParameters.foreach(__v => __obj.update("DeletedParameters", __v.asInstanceOf[js.Any]))
      InvalidParameters.foreach(__v => __obj.update("InvalidParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteParametersResult]
    }
  }

  @js.native
  trait DeletePatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object DeletePatchBaselineRequest {
    def apply(
        BaselineId: BaselineId
    ): DeletePatchBaselineRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): DeletePatchBaselineResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePatchBaselineResult]
    }
  }

  @js.native
  trait DeleteResourceDataSyncRequest extends js.Object {
    var SyncName: ResourceDataSyncName
  }

  object DeleteResourceDataSyncRequest {
    def apply(
        SyncName: ResourceDataSyncName
    ): DeleteResourceDataSyncRequest = {
      val __obj = js.Dictionary[js.Any](
        "SyncName" -> SyncName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResourceDataSyncRequest]
    }
  }

  @js.native
  trait DeleteResourceDataSyncResult extends js.Object {}

  object DeleteResourceDataSyncResult {
    def apply(
        ): DeleteResourceDataSyncResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteResourceDataSyncResult]
    }
  }

  @js.native
  trait DeregisterManagedInstanceRequest extends js.Object {
    var InstanceId: ManagedInstanceId
  }

  object DeregisterManagedInstanceRequest {
    def apply(
        InstanceId: ManagedInstanceId
    ): DeregisterManagedInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterManagedInstanceRequest]
    }
  }

  @js.native
  trait DeregisterManagedInstanceResult extends js.Object {}

  object DeregisterManagedInstanceResult {
    def apply(
        ): DeregisterManagedInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeregisterManagedInstanceResult]
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
        PatchGroup: PatchGroup
    ): DeregisterPatchBaselineForPatchGroupRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): DeregisterPatchBaselineForPatchGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.update("PatchGroup", __v.asInstanceOf[js.Any]))
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
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTargetId: MaintenanceWindowTargetId,
        Safe: js.UndefOr[Boolean] = js.undefined
    ): DeregisterTargetFromMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId"       -> WindowId.asInstanceOf[js.Any],
        "WindowTargetId" -> WindowTargetId.asInstanceOf[js.Any]
      )

      Safe.foreach(__v => __obj.update("Safe", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
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
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): DeregisterTargetFromMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.update("WindowTargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
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
        WindowTaskId: MaintenanceWindowTaskId
    ): DeregisterTaskFromMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId"     -> WindowId.asInstanceOf[js.Any],
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
    def apply(
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): DeregisterTaskFromMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.update("WindowTaskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
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
        FilterValues: js.UndefOr[StringList] = js.undefined
    ): DescribeActivationsFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      FilterKey.foreach(__v => __obj.update("FilterKey", __v.asInstanceOf[js.Any]))
      FilterValues.foreach(__v => __obj.update("FilterValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivationsFilter]
    }
  }

  object DescribeActivationsFilterKeysEnum {
    val ActivationIds       = "ActivationIds"
    val DefaultInstanceName = "DefaultInstanceName"
    val IamRole             = "IamRole"

    val values = js.Object.freeze(js.Array(ActivationIds, DefaultInstanceName, IamRole))
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActivationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivationsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActivationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ActivationList.foreach(__v => __obj.update("ActivationList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AssociationId: AssociationId,
        ExecutionId: AssociationExecutionId,
        Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "ExecutionId"   -> ExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionTargetsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationExecutionTargets.foreach(__v => __obj.update("AssociationExecutionTargets", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AssociationId: AssociationId,
        Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationExecutionsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAssociationExecutionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationExecutions.foreach(__v => __obj.update("AssociationExecutions", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined
    ): DescribeAssociationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssociationRequest]
    }
  }

  @js.native
  trait DescribeAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object DescribeAssociationResult {
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): DescribeAssociationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationDescription.foreach(__v => __obj.update("AssociationDescription", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[AutomationExecutionFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAutomationExecutionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutomationExecutionsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAutomationExecutionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomationExecutionMetadataList.foreach(
        __v => __obj.update("AutomationExecutionMetadataList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AutomationExecutionId: AutomationExecutionId,
        Filters: js.UndefOr[StepExecutionFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReverseOrder: js.UndefOr[Boolean] = js.undefined
    ): DescribeAutomationStepExecutionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ReverseOrder.foreach(__v => __obj.update("ReverseOrder", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutomationStepExecutionsRequest]
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
        StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
    ): DescribeAutomationStepExecutionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      StepExecutions.foreach(__v => __obj.update("StepExecutions", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAvailablePatchesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailablePatchesRequest]
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
        Patches: js.UndefOr[PatchList] = js.undefined
    ): DescribeAvailablePatchesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Patches.foreach(__v => __obj.update("Patches", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailablePatchesResult]
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
        PermissionType: DocumentPermissionType
    ): DescribeDocumentPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"           -> Name.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDocumentPermissionRequest]
    }
  }

  @js.native
  trait DescribeDocumentPermissionResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DescribeDocumentPermissionResponse {
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined
    ): DescribeDocumentPermissionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountIds.foreach(__v => __obj.update("AccountIds", __v.asInstanceOf[js.Any]))
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
    def apply(
        Name: DocumentARN,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DescribeDocumentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentRequest]
    }
  }

  @js.native
  trait DescribeDocumentResult extends js.Object {
    var Document: js.UndefOr[DocumentDescription]
  }

  object DescribeDocumentResult {
    def apply(
        Document: js.UndefOr[DocumentDescription] = js.undefined
    ): DescribeDocumentResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Document.foreach(__v => __obj.update("Document", __v.asInstanceOf[js.Any]))
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
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectiveInstanceAssociationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectiveInstanceAssociationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Associations.foreach(__v => __obj.update("Associations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        BaselineId: BaselineId,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectivePatchesForPatchBaselineRequest = {
      val __obj = js.Dictionary[js.Any](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEffectivePatchesForPatchBaselineResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EffectivePatches.foreach(__v => __obj.update("EffectivePatches", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceAssociationsStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceAssociationsStatusRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceAssociationsStatusResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceAssociationStatusInfos.foreach(
        __v => __obj.update("InstanceAssociationStatusInfos", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined,
        InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceInformationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      InstanceInformationFilterList.foreach(
        __v => __obj.update("InstanceInformationFilterList", __v.asInstanceOf[js.Any])
      )
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceInformationRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstanceInformationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceInformationList.foreach(__v => __obj.update("InstanceInformationList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        PatchGroup: PatchGroup,
        Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesForPatchGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesForPatchGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstancePatchStates.foreach(__v => __obj.update("InstancePatchStates", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        InstanceIds: InstanceIdList,
        MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchStatesRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchStatesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstancePatchStates.foreach(__v => __obj.update("InstancePatchStates", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        InstanceId: InstanceId,
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancePatchesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchesRequest]
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
        Patches: js.UndefOr[PatchComplianceDataList] = js.undefined
    ): DescribeInstancePatchesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Patches.foreach(__v => __obj.update("Patches", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancePatchesResult]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInventoryDeletionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeletionId.foreach(__v => __obj.update("DeletionId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInventoryDeletionsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInventoryDeletionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InventoryDeletions.foreach(__v => __obj.update("InventoryDeletions", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        TaskId: MaintenanceWindowExecutionTaskId,
        WindowExecutionId: MaintenanceWindowExecutionId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "TaskId"            -> TaskId.asInstanceOf[js.Any],
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
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
        WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] =
          js.undefined
    ): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WindowExecutionTaskInvocationIdentities.foreach(
        __v => __obj.update("WindowExecutionTaskInvocationIdentities", __v.asInstanceOf[js.Any])
      )
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
    def apply(
        WindowExecutionId: MaintenanceWindowExecutionId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionTasksRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowExecutionId" -> WindowExecutionId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
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
        WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined
    ): DescribeMaintenanceWindowExecutionTasksResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WindowExecutionTaskIdentities.foreach(
        __v => __obj.update("WindowExecutionTaskIdentities", __v.asInstanceOf[js.Any])
      )
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
    def apply(
        WindowId: MaintenanceWindowId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowExecutionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
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
        WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined
    ): DescribeMaintenanceWindowExecutionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WindowExecutions.foreach(__v => __obj.update("WindowExecutions", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): DescribeMaintenanceWindowScheduleRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowScheduleRequest]
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
        ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined
    ): DescribeMaintenanceWindowScheduleResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScheduledWindowExecutions.foreach(__v => __obj.update("ScheduledWindowExecutions", __v.asInstanceOf[js.Any]))
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
    def apply(
        WindowId: MaintenanceWindowId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowTargetsRequest]
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
        Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined
    ): DescribeMaintenanceWindowTargetsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
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
    def apply(
        WindowId: MaintenanceWindowId,
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowTasksRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowTasksRequest]
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
        Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined
    ): DescribeMaintenanceWindowTasksResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tasks.foreach(__v => __obj.update("Tasks", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceType: MaintenanceWindowResourceType,
        Targets: Targets,
        MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowsForTargetRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Targets"      -> Targets.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
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
        WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined
    ): DescribeMaintenanceWindowsForTargetResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WindowIdentities.foreach(__v => __obj.update("WindowIdentities", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMaintenanceWindowsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceWindowsRequest]
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
        WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined
    ): DescribeMaintenanceWindowsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WindowIdentities.foreach(__v => __obj.update("WindowIdentities", __v.asInstanceOf[js.Any]))
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
    def apply(
        MaxResults: js.UndefOr[OpsItemMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OpsItemFilters: js.UndefOr[OpsItemFilters] = js.undefined
    ): DescribeOpsItemsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      OpsItemFilters.foreach(__v => __obj.update("OpsItemFilters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOpsItemsRequest]
    }
  }

  @js.native
  trait DescribeOpsItemsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OpsItemSummaries: js.UndefOr[OpsItemSummaries]
  }

  object DescribeOpsItemsResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        OpsItemSummaries: js.UndefOr[OpsItemSummaries] = js.undefined
    ): DescribeOpsItemsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      OpsItemSummaries.foreach(__v => __obj.update("OpsItemSummaries", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[ParametersFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
    ): DescribeParametersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ParameterFilters.foreach(__v => __obj.update("ParameterFilters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersRequest]
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
        Parameters: js.UndefOr[ParameterMetadataList] = js.undefined
    ): DescribeParametersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchBaselinesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchBaselinesRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchBaselinesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineIdentities.foreach(__v => __obj.update("BaselineIdentities", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchBaselinesResult]
    }
  }

  @js.native
  trait DescribePatchGroupStateRequest extends js.Object {
    var PatchGroup: PatchGroup
  }

  object DescribePatchGroupStateRequest {
    def apply(
        PatchGroup: PatchGroup
    ): DescribePatchGroupStateRequest = {
      val __obj = js.Dictionary[js.Any](
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePatchGroupStateRequest]
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
    var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Int]
  }

  object DescribePatchGroupStateResult {
    def apply(
        Instances: js.UndefOr[Int] = js.undefined,
        InstancesWithFailedPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithInstalledOtherPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithInstalledPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined,
        InstancesWithMissingPatches: js.UndefOr[Int] = js.undefined,
        InstancesWithNotApplicablePatches: js.UndefOr[Int] = js.undefined,
        InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Int] = js.undefined
    ): DescribePatchGroupStateResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Instances.foreach(__v => __obj.update("Instances", __v.asInstanceOf[js.Any]))
      InstancesWithFailedPatches.foreach(__v => __obj.update("InstancesWithFailedPatches", __v.asInstanceOf[js.Any]))
      InstancesWithInstalledOtherPatches.foreach(
        __v => __obj.update("InstancesWithInstalledOtherPatches", __v.asInstanceOf[js.Any])
      )
      InstancesWithInstalledPatches.foreach(
        __v => __obj.update("InstancesWithInstalledPatches", __v.asInstanceOf[js.Any])
      )
      InstancesWithInstalledRejectedPatches.foreach(
        __v => __obj.update("InstancesWithInstalledRejectedPatches", __v.asInstanceOf[js.Any])
      )
      InstancesWithMissingPatches.foreach(__v => __obj.update("InstancesWithMissingPatches", __v.asInstanceOf[js.Any]))
      InstancesWithNotApplicablePatches.foreach(
        __v => __obj.update("InstancesWithNotApplicablePatches", __v.asInstanceOf[js.Any])
      )
      InstancesWithUnreportedNotApplicablePatches.foreach(
        __v => __obj.update("InstancesWithUnreportedNotApplicablePatches", __v.asInstanceOf[js.Any])
      )
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
    def apply(
        Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined,
        MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchGroupsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePatchGroupsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Mappings.foreach(__v => __obj.update("Mappings", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        OperatingSystem: OperatingSystem,
        Property: PatchProperty,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PatchSet: js.UndefOr[PatchSet] = js.undefined
    ): DescribePatchPropertiesRequest = {
      val __obj = js.Dictionary[js.Any](
        "OperatingSystem" -> OperatingSystem.asInstanceOf[js.Any],
        "Property"        -> Property.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PatchSet.foreach(__v => __obj.update("PatchSet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePatchPropertiesRequest]
    }
  }

  @js.native
  trait DescribePatchPropertiesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Properties: js.UndefOr[PatchPropertiesList]
  }

  object DescribePatchPropertiesResult {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Properties: js.UndefOr[PatchPropertiesList] = js.undefined
    ): DescribePatchPropertiesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.update("Properties", __v.asInstanceOf[js.Any]))
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
    def apply(
        State: SessionState,
        Filters: js.UndefOr[SessionFilterList] = js.undefined,
        MaxResults: js.UndefOr[SessionMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeSessionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "State" -> State.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSessionsRequest]
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
        Sessions: js.UndefOr[SessionList] = js.undefined
    ): DescribeSessionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Sessions.foreach(__v => __obj.update("Sessions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSessionsResponse]
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
        Name: js.UndefOr[DocumentName] = js.undefined
    ): DocumentDefaultVersionDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultVersion.foreach(__v => __obj.update("DefaultVersion", __v.asInstanceOf[js.Any]))
      DefaultVersionName.foreach(__v => __obj.update("DefaultVersionName", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentDefaultVersionDescription]
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
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DocumentDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachmentsInformation.foreach(__v => __obj.update("AttachmentsInformation", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DefaultVersion.foreach(__v => __obj.update("DefaultVersion", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.update("DocumentType", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      Hash.foreach(__v => __obj.update("Hash", __v.asInstanceOf[js.Any]))
      HashType.foreach(__v => __obj.update("HashType", __v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.update("LatestVersion", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      PlatformTypes.foreach(__v => __obj.update("PlatformTypes", __v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.update("SchemaVersion", __v.asInstanceOf[js.Any]))
      Sha1.foreach(__v => __obj.update("Sha1", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusInformation.foreach(__v => __obj.update("StatusInformation", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.update("TargetType", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentDescription]
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
        value: DocumentFilterValue
    ): DocumentFilter = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DocumentFilter]
    }
  }

  object DocumentFilterKeyEnum {
    val Name          = "Name"
    val Owner         = "Owner"
    val PlatformTypes = "PlatformTypes"
    val DocumentType  = "DocumentType"

    val values = js.Object.freeze(js.Array(Name, Owner, PlatformTypes, DocumentType))
  }

  object DocumentFormatEnum {
    val YAML = "YAML"
    val JSON = "JSON"

    val values = js.Object.freeze(js.Array(YAML, JSON))
  }

  object DocumentHashTypeEnum {
    val Sha256 = "Sha256"
    val Sha1   = "Sha1"

    val values = js.Object.freeze(js.Array(Sha256, Sha1))
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
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DocumentIdentifier = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.update("DocumentType", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      PlatformTypes.foreach(__v => __obj.update("PlatformTypes", __v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.update("SchemaVersion", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.update("TargetType", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentIdentifier]
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
        Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.undefined
    ): DocumentKeyValuesFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentKeyValuesFilter]
    }
  }

  /**
    * Parameters specified in a System Manager document that run on the server when the command is run.
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
        Type: js.UndefOr[DocumentParameterType] = js.undefined
    ): DocumentParameter = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentParameter]
    }
  }

  object DocumentParameterTypeEnum {
    val String     = "String"
    val StringList = "StringList"

    val values = js.Object.freeze(js.Array(String, StringList))
  }

  object DocumentPermissionTypeEnum {
    val Share = "Share"

    val values = js.Object.freeze(js.Array(Share))
  }

  /**
    * The status of a document.
    */
  object DocumentStatusEnum {
    val Creating = "Creating"
    val Active   = "Active"
    val Updating = "Updating"
    val Deleting = "Deleting"
    val Failed   = "Failed"

    val values = js.Object.freeze(js.Array(Creating, Active, Updating, Deleting, Failed))
  }

  object DocumentTypeEnum {
    val Command    = "Command"
    val Policy     = "Policy"
    val Automation = "Automation"
    val Session    = "Session"
    val Package    = "Package"

    val values = js.Object.freeze(js.Array(Command, Policy, Automation, Session, Package))
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
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): DocumentVersionInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      IsDefaultVersion.foreach(__v => __obj.update("IsDefaultVersion", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusInformation.foreach(__v => __obj.update("StatusInformation", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentVersionInfo]
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
        PatchStatus: js.UndefOr[PatchStatus] = js.undefined
    ): EffectivePatch = {
      val __obj = js.Dictionary.empty[js.Any]
      Patch.foreach(__v => __obj.update("Patch", __v.asInstanceOf[js.Any]))
      PatchStatus.foreach(__v => __obj.update("PatchStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EffectivePatch]
    }
  }

  object ExecutionModeEnum {
    val Auto        = "Auto"
    val Interactive = "Interactive"

    val values = js.Object.freeze(js.Array(Auto, Interactive))
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
        Message: js.UndefOr[BatchErrorMessage] = js.undefined
    ): FailedCreateAssociation = {
      val __obj = js.Dictionary.empty[js.Any]
      Entry.foreach(__v => __obj.update("Entry", __v.asInstanceOf[js.Any]))
      Fault.foreach(__v => __obj.update("Fault", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedCreateAssociation]
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
        FailureType: js.UndefOr[String] = js.undefined
    ): FailureDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      FailureStage.foreach(__v => __obj.update("FailureStage", __v.asInstanceOf[js.Any]))
      FailureType.foreach(__v => __obj.update("FailureType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureDetails]
    }
  }

  object FaultEnum {
    val Client  = "Client"
    val Server  = "Server"
    val Unknown = "Unknown"

    val values = js.Object.freeze(js.Array(Client, Server, Unknown))
  }

  @js.native
  trait GetAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
  }

  object GetAutomationExecutionRequest {
    def apply(
        AutomationExecutionId: AutomationExecutionId
    ): GetAutomationExecutionRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        AutomationExecution: js.UndefOr[AutomationExecution] = js.undefined
    ): GetAutomationExecutionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomationExecution.foreach(__v => __obj.update("AutomationExecution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutomationExecutionResult]
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
        PluginName: js.UndefOr[CommandPluginName] = js.undefined
    ): GetCommandInvocationRequest = {
      val __obj = js.Dictionary[js.Any](
        "CommandId"  -> CommandId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      PluginName.foreach(__v => __obj.update("PluginName", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchOutputConfig.foreach(__v => __obj.update("CloudWatchOutputConfig", __v.asInstanceOf[js.Any]))
      CommandId.foreach(__v => __obj.update("CommandId", __v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      ExecutionElapsedTime.foreach(__v => __obj.update("ExecutionElapsedTime", __v.asInstanceOf[js.Any]))
      ExecutionEndDateTime.foreach(__v => __obj.update("ExecutionEndDateTime", __v.asInstanceOf[js.Any]))
      ExecutionStartDateTime.foreach(__v => __obj.update("ExecutionStartDateTime", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      PluginName.foreach(__v => __obj.update("PluginName", __v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.update("ResponseCode", __v.asInstanceOf[js.Any]))
      StandardErrorContent.foreach(__v => __obj.update("StandardErrorContent", __v.asInstanceOf[js.Any]))
      StandardErrorUrl.foreach(__v => __obj.update("StandardErrorUrl", __v.asInstanceOf[js.Any]))
      StandardOutputContent.foreach(__v => __obj.update("StandardOutputContent", __v.asInstanceOf[js.Any]))
      StandardOutputUrl.foreach(__v => __obj.update("StandardOutputUrl", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommandInvocationResult]
    }
  }

  @js.native
  trait GetConnectionStatusRequest extends js.Object {
    var Target: SessionTarget
  }

  object GetConnectionStatusRequest {
    def apply(
        Target: SessionTarget
    ): GetConnectionStatusRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Status: js.UndefOr[ConnectionStatus] = js.undefined,
        Target: js.UndefOr[SessionTarget] = js.undefined
    ): GetConnectionStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionStatusResponse]
    }
  }

  @js.native
  trait GetDefaultPatchBaselineRequest extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object GetDefaultPatchBaselineRequest {
    def apply(
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): GetDefaultPatchBaselineRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
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
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): GetDefaultPatchBaselineResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDefaultPatchBaselineResult]
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
        SnapshotId: SnapshotId
    ): GetDeployablePatchSnapshotForInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

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
    def apply(
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Product: js.UndefOr[Product] = js.undefined,
        SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): GetDeployablePatchSnapshotForInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.update("Product", __v.asInstanceOf[js.Any]))
      SnapshotDownloadUrl.foreach(__v => __obj.update("SnapshotDownloadUrl", __v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
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
    def apply(
        Name: DocumentARN,
        DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): GetDocumentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentRequest]
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
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): GetDocumentResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachmentsContent.foreach(__v => __obj.update("AttachmentsContent", __v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentType.foreach(__v => __obj.update("DocumentType", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusInformation.foreach(__v => __obj.update("StatusInformation", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
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
    def apply(
        Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined,
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined
    ): GetInventoryRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Aggregators.foreach(__v => __obj.update("Aggregators", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResultAttributes.foreach(__v => __obj.update("ResultAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventoryRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInventoryResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Entities.foreach(__v => __obj.update("Entities", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.undefined,
        MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SubType: js.UndefOr[IsSubTypeSchema] = js.undefined,
        TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.undefined
    ): GetInventorySchemaRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Aggregator.foreach(__v => __obj.update("Aggregator", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SubType.foreach(__v => __obj.update("SubType", __v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.update("TypeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventorySchemaRequest]
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
        Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined
    ): GetInventorySchemaResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.update("Schemas", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInventorySchemaResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    var WindowExecutionId: MaintenanceWindowExecutionId
  }

  object GetMaintenanceWindowExecutionRequest {
    def apply(
        WindowExecutionId: MaintenanceWindowExecutionId
    ): GetMaintenanceWindowExecutionRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        EndTime: js.UndefOr[DateTime] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined,
        StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined,
        TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined,
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): GetMaintenanceWindowExecutionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TaskIds.foreach(__v => __obj.update("TaskIds", __v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
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
    def apply(
        InvocationId: MaintenanceWindowExecutionTaskInvocationId,
        TaskId: MaintenanceWindowExecutionTaskId,
        WindowExecutionId: MaintenanceWindowExecutionId
    ): GetMaintenanceWindowExecutionTaskInvocationRequest = {
      val __obj = js.Dictionary[js.Any](
        "InvocationId"      -> InvocationId.asInstanceOf[js.Any],
        "TaskId"            -> TaskId.asInstanceOf[js.Any],
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
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.update("ExecutionId", __v.asInstanceOf[js.Any]))
      InvocationId.foreach(__v => __obj.update("InvocationId", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.update("TaskExecutionId", __v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.update("TaskType", __v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.update("WindowTargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
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
        WindowExecutionId: MaintenanceWindowExecutionId
    ): GetMaintenanceWindowExecutionTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "TaskId"            -> TaskId.asInstanceOf[js.Any],
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
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.update("ServiceRole", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.update("TaskArn", __v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.update("TaskExecutionId", __v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.update("TaskParameters", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
    }
  }

  @js.native
  trait GetMaintenanceWindowRequest extends js.Object {
    var WindowId: MaintenanceWindowId
  }

  object GetMaintenanceWindowRequest {
    def apply(
        WindowId: MaintenanceWindowId
    ): GetMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
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
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): GetMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowUnassociatedTargets.foreach(__v => __obj.update("AllowUnassociatedTargets", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Cutoff.foreach(__v => __obj.update("Cutoff", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      ModifiedDate.foreach(__v => __obj.update("ModifiedDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextExecutionTime.foreach(__v => __obj.update("NextExecutionTime", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.update("ScheduleTimezone", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowResult]
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
        WindowTaskId: MaintenanceWindowTaskId
    ): GetMaintenanceWindowTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId"     -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
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
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): GetMaintenanceWindowTaskResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.update("LoggingInfo", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.update("TaskArn", __v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.update("TaskInvocationParameters", __v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.update("TaskParameters", __v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.update("TaskType", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.update("WindowTaskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMaintenanceWindowTaskResult]
    }
  }

  @js.native
  trait GetOpsItemRequest extends js.Object {
    var OpsItemId: OpsItemId
  }

  object GetOpsItemRequest {
    def apply(
        OpsItemId: OpsItemId
    ): GetOpsItemRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        OpsItem: js.UndefOr[OpsItem] = js.undefined
    ): GetOpsItemResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      OpsItem.foreach(__v => __obj.update("OpsItem", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsItemResponse]
    }
  }

  @js.native
  trait GetOpsSummaryRequest extends js.Object {
    var Aggregators: OpsAggregatorList
    var Filters: js.UndefOr[OpsFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetOpsSummaryRequest {
    def apply(
        Aggregators: OpsAggregatorList,
        Filters: js.UndefOr[OpsFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetOpsSummaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "Aggregators" -> Aggregators.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpsSummaryRequest]
    }
  }

  @js.native
  trait GetOpsSummaryResult extends js.Object {
    var Entities: js.UndefOr[OpsEntityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetOpsSummaryResult {
    def apply(
        Entities: js.UndefOr[OpsEntityList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetOpsSummaryResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Entities.foreach(__v => __obj.update("Entities", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Name: PSParameterName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParameterHistoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      WithDecryption.foreach(__v => __obj.update("WithDecryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterHistoryRequest]
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
        Parameters: js.UndefOr[ParameterHistoryList] = js.undefined
    ): GetParameterHistoryResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterHistoryResult]
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
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParameterRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      WithDecryption.foreach(__v => __obj.update("WithDecryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParameterRequest]
    }
  }

  @js.native
  trait GetParameterResult extends js.Object {
    var Parameter: js.UndefOr[Parameter]
  }

  object GetParameterResult {
    def apply(
        Parameter: js.UndefOr[Parameter] = js.undefined
    ): GetParameterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Parameter.foreach(__v => __obj.update("Parameter", __v.asInstanceOf[js.Any]))
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
    def apply(
        Path: PSParameterName,
        MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined,
        Recursive: js.UndefOr[Boolean] = js.undefined,
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParametersByPathRequest = {
      val __obj = js.Dictionary[js.Any](
        "Path" -> Path.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ParameterFilters.foreach(__v => __obj.update("ParameterFilters", __v.asInstanceOf[js.Any]))
      Recursive.foreach(__v => __obj.update("Recursive", __v.asInstanceOf[js.Any]))
      WithDecryption.foreach(__v => __obj.update("WithDecryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersByPathRequest]
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
        Parameters: js.UndefOr[ParameterList] = js.undefined
    ): GetParametersByPathResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersByPathResult]
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
        WithDecryption: js.UndefOr[Boolean] = js.undefined
    ): GetParametersRequest = {
      val __obj = js.Dictionary[js.Any](
        "Names" -> Names.asInstanceOf[js.Any]
      )

      WithDecryption.foreach(__v => __obj.update("WithDecryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersRequest]
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
        Parameters: js.UndefOr[ParameterList] = js.undefined
    ): GetParametersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InvalidParameters.foreach(__v => __obj.update("InvalidParameters", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParametersResult]
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
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): GetPatchBaselineForPatchGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "PatchGroup" -> PatchGroup.asInstanceOf[js.Any]
      )

      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
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
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): GetPatchBaselineForPatchGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.update("PatchGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
    }
  }

  @js.native
  trait GetPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object GetPatchBaselineRequest {
    def apply(
        BaselineId: BaselineId
    ): GetPatchBaselineRequest = {
      val __obj = js.Dictionary[js.Any](
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
      val __obj = js.Dictionary.empty[js.Any]
      ApprovalRules.foreach(__v => __obj.update("ApprovalRules", __v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.update("ApprovedPatches", __v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(
        __v => __obj.update("ApprovedPatchesComplianceLevel", __v.asInstanceOf[js.Any])
      )
      ApprovedPatchesEnableNonSecurity.foreach(
        __v => __obj.update("ApprovedPatchesEnableNonSecurity", __v.asInstanceOf[js.Any])
      )
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.update("GlobalFilters", __v.asInstanceOf[js.Any]))
      ModifiedDate.foreach(__v => __obj.update("ModifiedDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      PatchGroups.foreach(__v => __obj.update("PatchGroups", __v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.update("RejectedPatches", __v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.update("RejectedPatchesAction", __v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.update("Sources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPatchBaselineResult]
    }
  }

  /**
    * The request body of the GetServiceSetting API action.
    */
  @js.native
  trait GetServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
  }

  object GetServiceSettingRequest {
    def apply(
        SettingId: ServiceSettingId
    ): GetServiceSettingRequest = {
      val __obj = js.Dictionary[js.Any](
        "SettingId" -> SettingId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServiceSettingRequest]
    }
  }

  /**
    * The query result body of the GetServiceSetting API action.
    */
  @js.native
  trait GetServiceSettingResult extends js.Object {
    var ServiceSetting: js.UndefOr[ServiceSetting]
  }

  object GetServiceSettingResult {
    def apply(
        ServiceSetting: js.UndefOr[ServiceSetting] = js.undefined
    ): GetServiceSettingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSetting.foreach(__v => __obj.update("ServiceSetting", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceSettingResult]
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
        InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount] = js.undefined
    ): InstanceAggregatedAssociationOverview = {
      val __obj = js.Dictionary.empty[js.Any]
      DetailedStatus.foreach(__v => __obj.update("DetailedStatus", __v.asInstanceOf[js.Any]))
      InstanceAssociationStatusAggregatedCount.foreach(
        __v => __obj.update("InstanceAssociationStatusAggregatedCount", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
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
        InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): InstanceAssociation = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociation]
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
        S3Location: js.UndefOr[S3OutputLocation] = js.undefined
    ): InstanceAssociationOutputLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      S3Location.foreach(__v => __obj.update("S3Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociationOutputLocation]
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
        S3OutputUrl: js.UndefOr[S3OutputUrl] = js.undefined
    ): InstanceAssociationOutputUrl = {
      val __obj = js.Dictionary.empty[js.Any]
      S3OutputUrl.foreach(__v => __obj.update("S3OutputUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociationOutputUrl]
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
    var Name: js.UndefOr[DocumentARN]
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
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined,
        Status: js.UndefOr[StatusName] = js.undefined
    ): InstanceAssociationStatusInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationId.foreach(__v => __obj.update("AssociationId", __v.asInstanceOf[js.Any]))
      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      DetailedStatus.foreach(__v => __obj.update("DetailedStatus", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ExecutionDate.foreach(__v => __obj.update("ExecutionDate", __v.asInstanceOf[js.Any]))
      ExecutionSummary.foreach(__v => __obj.update("ExecutionSummary", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OutputUrl.foreach(__v => __obj.update("OutputUrl", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAssociationStatusInfo]
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
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): InstanceInformation = {
      val __obj = js.Dictionary.empty[js.Any]
      ActivationId.foreach(__v => __obj.update("ActivationId", __v.asInstanceOf[js.Any]))
      AgentVersion.foreach(__v => __obj.update("AgentVersion", __v.asInstanceOf[js.Any]))
      AssociationOverview.foreach(__v => __obj.update("AssociationOverview", __v.asInstanceOf[js.Any]))
      AssociationStatus.foreach(__v => __obj.update("AssociationStatus", __v.asInstanceOf[js.Any]))
      ComputerName.foreach(__v => __obj.update("ComputerName", __v.asInstanceOf[js.Any]))
      IPAddress.foreach(__v => __obj.update("IPAddress", __v.asInstanceOf[js.Any]))
      IamRole.foreach(__v => __obj.update("IamRole", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      IsLatestVersion.foreach(__v => __obj.update("IsLatestVersion", __v.asInstanceOf[js.Any]))
      LastAssociationExecutionDate.foreach(
        __v => __obj.update("LastAssociationExecutionDate", __v.asInstanceOf[js.Any])
      )
      LastPingDateTime.foreach(__v => __obj.update("LastPingDateTime", __v.asInstanceOf[js.Any]))
      LastSuccessfulAssociationExecutionDate.foreach(
        __v => __obj.update("LastSuccessfulAssociationExecutionDate", __v.asInstanceOf[js.Any])
      )
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PingStatus.foreach(__v => __obj.update("PingStatus", __v.asInstanceOf[js.Any]))
      PlatformName.foreach(__v => __obj.update("PlatformName", __v.asInstanceOf[js.Any]))
      PlatformType.foreach(__v => __obj.update("PlatformType", __v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.update("PlatformVersion", __v.asInstanceOf[js.Any]))
      RegistrationDate.foreach(__v => __obj.update("RegistrationDate", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceInformation]
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
        valueSet: InstanceInformationFilterValueSet
    ): InstanceInformationFilter = {
      val __obj = js.Dictionary[js.Any](
        "key"      -> key.asInstanceOf[js.Any],
        "valueSet" -> valueSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InstanceInformationFilter]
    }
  }

  object InstanceInformationFilterKeyEnum {
    val InstanceIds       = "InstanceIds"
    val AgentVersion      = "AgentVersion"
    val PingStatus        = "PingStatus"
    val PlatformTypes     = "PlatformTypes"
    val ActivationIds     = "ActivationIds"
    val IamRole           = "IamRole"
    val ResourceType      = "ResourceType"
    val AssociationStatus = "AssociationStatus"

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
  trait InstanceInformationStringFilter extends js.Object {
    var Key: InstanceInformationStringFilterKey
    var Values: InstanceInformationFilterValueSet
  }

  object InstanceInformationStringFilter {
    def apply(
        Key: InstanceInformationStringFilterKey,
        Values: InstanceInformationFilterValueSet
    ): InstanceInformationStringFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InstanceInformationStringFilter]
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
    var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount]
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
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.undefined
    ): InstancePatchState = {
      val __obj = js.Dictionary[js.Any](
        "BaselineId"         -> BaselineId.asInstanceOf[js.Any],
        "InstanceId"         -> InstanceId.asInstanceOf[js.Any],
        "Operation"          -> Operation.asInstanceOf[js.Any],
        "OperationEndTime"   -> OperationEndTime.asInstanceOf[js.Any],
        "OperationStartTime" -> OperationStartTime.asInstanceOf[js.Any],
        "PatchGroup"         -> PatchGroup.asInstanceOf[js.Any]
      )

      FailedCount.foreach(__v => __obj.update("FailedCount", __v.asInstanceOf[js.Any]))
      InstallOverrideList.foreach(__v => __obj.update("InstallOverrideList", __v.asInstanceOf[js.Any]))
      InstalledCount.foreach(__v => __obj.update("InstalledCount", __v.asInstanceOf[js.Any]))
      InstalledOtherCount.foreach(__v => __obj.update("InstalledOtherCount", __v.asInstanceOf[js.Any]))
      InstalledRejectedCount.foreach(__v => __obj.update("InstalledRejectedCount", __v.asInstanceOf[js.Any]))
      MissingCount.foreach(__v => __obj.update("MissingCount", __v.asInstanceOf[js.Any]))
      NotApplicableCount.foreach(__v => __obj.update("NotApplicableCount", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      UnreportedNotApplicableCount.foreach(
        __v => __obj.update("UnreportedNotApplicableCount", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[InstancePatchState]
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
        Values: InstancePatchStateFilterValues
    ): InstancePatchStateFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Type"   -> Type.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InstancePatchStateFilter]
    }
  }

  object InstancePatchStateOperatorTypeEnum {
    val Equal       = "Equal"
    val NotEqual    = "NotEqual"
    val LessThan    = "LessThan"
    val GreaterThan = "GreaterThan"

    val values = js.Object.freeze(js.Array(Equal, NotEqual, LessThan, GreaterThan))
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
        Groups: js.UndefOr[InventoryGroupList] = js.undefined
    ): InventoryAggregator = {
      val __obj = js.Dictionary.empty[js.Any]
      Aggregators.foreach(__v => __obj.update("Aggregators", __v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.update("Expression", __v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.update("Groups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryAggregator]
    }
  }

  object InventoryAttributeDataTypeEnum {
    val string = "string"
    val number = "number"

    val values = js.Object.freeze(js.Array(string, number))
  }

  object InventoryDeletionStatusEnum {
    val InProgress = "InProgress"
    val Complete   = "Complete"

    val values = js.Object.freeze(js.Array(InProgress, Complete))
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
        TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): InventoryDeletionStatusItem = {
      val __obj = js.Dictionary.empty[js.Any]
      DeletionId.foreach(__v => __obj.update("DeletionId", __v.asInstanceOf[js.Any]))
      DeletionStartTime.foreach(__v => __obj.update("DeletionStartTime", __v.asInstanceOf[js.Any]))
      DeletionSummary.foreach(__v => __obj.update("DeletionSummary", __v.asInstanceOf[js.Any]))
      LastStatus.foreach(__v => __obj.update("LastStatus", __v.asInstanceOf[js.Any]))
      LastStatusMessage.foreach(__v => __obj.update("LastStatusMessage", __v.asInstanceOf[js.Any]))
      LastStatusUpdateTime.foreach(__v => __obj.update("LastStatusUpdateTime", __v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.update("TypeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryDeletionStatusItem]
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
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): InventoryDeletionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      RemainingCount.foreach(__v => __obj.update("RemainingCount", __v.asInstanceOf[js.Any]))
      SummaryItems.foreach(__v => __obj.update("SummaryItems", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryDeletionSummary]
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
        Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    ): InventoryDeletionSummaryItem = {
      val __obj = js.Dictionary.empty[js.Any]
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      RemainingCount.foreach(__v => __obj.update("RemainingCount", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryDeletionSummaryItem]
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
        Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined
    ): InventoryFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryFilter]
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
        Name: InventoryGroupName
    ): InventoryGroup = {
      val __obj = js.Dictionary[js.Any](
        "Filters" -> Filters.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InventoryGroup]
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
        Context: js.UndefOr[InventoryItemContentContext] = js.undefined
    ): InventoryItem = {
      val __obj = js.Dictionary[js.Any](
        "CaptureTime"   -> CaptureTime.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "TypeName"      -> TypeName.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      ContentHash.foreach(__v => __obj.update("ContentHash", __v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.update("Context", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryItem]
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
        Name: InventoryItemAttributeName
    ): InventoryItemAttribute = {
      val __obj = js.Dictionary[js.Any](
        "DataType" -> DataType.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InventoryItemAttribute]
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
        Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    ): InventoryItemSchema = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "TypeName"   -> TypeName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryItemSchema]
    }
  }

  object InventoryQueryOperatorTypeEnum {
    val Equal       = "Equal"
    val NotEqual    = "NotEqual"
    val BeginWith   = "BeginWith"
    val LessThan    = "LessThan"
    val GreaterThan = "GreaterThan"
    val Exists      = "Exists"

    val values = js.Object.freeze(js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists))
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
        Id: js.UndefOr[InventoryResultEntityId] = js.undefined
    ): InventoryResultEntity = {
      val __obj = js.Dictionary.empty[js.Any]
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryResultEntity]
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
        ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined
    ): InventoryResultItem = {
      val __obj = js.Dictionary[js.Any](
        "Content"       -> Content.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "TypeName"      -> TypeName.asInstanceOf[js.Any]
      )

      CaptureTime.foreach(__v => __obj.update("CaptureTime", __v.asInstanceOf[js.Any]))
      ContentHash.foreach(__v => __obj.update("ContentHash", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryResultItem]
    }
  }

  object InventorySchemaDeleteOptionEnum {
    val DisableSchema = "DisableSchema"
    val DeleteSchema  = "DeleteSchema"

    val values = js.Object.freeze(js.Array(DisableSchema, DeleteSchema))
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
        ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
    ): LabelParameterVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Labels" -> Labels.asInstanceOf[js.Any],
        "Name"   -> Name.asInstanceOf[js.Any]
      )

      ParameterVersion.foreach(__v => __obj.update("ParameterVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelParameterVersionRequest]
    }
  }

  @js.native
  trait LabelParameterVersionResult extends js.Object {
    var InvalidLabels: js.UndefOr[ParameterLabelList]
  }

  object LabelParameterVersionResult {
    def apply(
        InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined
    ): LabelParameterVersionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InvalidLabels.foreach(__v => __obj.update("InvalidLabels", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelParameterVersionResult]
    }
  }

  object LastResourceDataSyncStatusEnum {
    val Successful = "Successful"
    val Failed     = "Failed"
    val InProgress = "InProgress"

    val values = js.Object.freeze(js.Array(Successful, Failed, InProgress))
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationVersionsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationVersionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationVersions.foreach(__v => __obj.update("AssociationVersions", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AssociationFilterList: js.UndefOr[AssociationFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationFilterList.foreach(__v => __obj.update("AssociationFilterList", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Associations.foreach(__v => __obj.update("Associations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        CommandId: js.UndefOr[CommandId] = js.undefined,
        Details: js.UndefOr[Boolean] = js.undefined,
        Filters: js.UndefOr[CommandFilterList] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandInvocationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CommandId.foreach(__v => __obj.update("CommandId", __v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCommandInvocationsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandInvocationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CommandInvocations.foreach(__v => __obj.update("CommandInvocations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        CommandId: js.UndefOr[CommandId] = js.undefined,
        Filters: js.UndefOr[CommandFilterList] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CommandId.foreach(__v => __obj.update("CommandId", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCommandsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCommandsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Commands.foreach(__v => __obj.update("Commands", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined,
        ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.undefined
    ): ListComplianceItemsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceIds.foreach(__v => __obj.update("ResourceIds", __v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.update("ResourceTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceItemsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComplianceItemsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceItems.foreach(__v => __obj.update("ComplianceItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComplianceSummariesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceSummariesRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComplianceSummariesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceSummaryItems.foreach(__v => __obj.update("ComplianceSummaryItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceSummariesResult]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentVersionsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentVersionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentVersions.foreach(__v => __obj.update("DocumentVersions", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        DocumentFilterList: js.UndefOr[DocumentFilterList] = js.undefined,
        Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentFilterList.foreach(__v => __obj.update("DocumentFilterList", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentsRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentIdentifiers.foreach(__v => __obj.update("DocumentIdentifiers", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        InstanceId: InstanceId,
        TypeName: InventoryItemTypeName,
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInventoryEntriesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "TypeName"   -> TypeName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined,
        Entries: js.UndefOr[InventoryItemEntryList] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined,
        TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
    ): ListInventoryEntriesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CaptureTime.foreach(__v => __obj.update("CaptureTime", __v.asInstanceOf[js.Any]))
      Entries.foreach(__v => __obj.update("Entries", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.update("SchemaVersion", __v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.update("TypeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInventoryEntriesResult]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceComplianceSummariesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceComplianceSummariesRequest]
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
        ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined
    ): ListResourceComplianceSummariesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceComplianceSummaryItems.foreach(
        __v => __obj.update("ResourceComplianceSummaryItems", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListResourceComplianceSummariesResult]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResourceDataSyncRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDataSyncRequest]
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
        ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined
    ): ListResourceDataSyncResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceDataSyncItems.foreach(__v => __obj.update("ResourceDataSyncItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDataSyncResult]
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
        ResourceType: ResourceTypeForTagging
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
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
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      TagList.foreach(__v => __obj.update("TagList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
    * Information about an Amazon S3 bucket to write instance-level logs to.
    *
    * '''Note:'''<code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
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
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): LoggingInfo = {
      val __obj = js.Dictionary[js.Any](
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any],
        "S3Region"     -> S3Region.asInstanceOf[js.Any]
      )

      S3KeyPrefix.foreach(__v => __obj.update("S3KeyPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingInfo]
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
        Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
    ): MaintenanceWindowAutomationParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowAutomationParameters]
    }
  }

  /**
    * Describes the information about an execution of a maintenance window.
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
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): MaintenanceWindowExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowExecution]
    }
  }

  object MaintenanceWindowExecutionStatusEnum {
    val PENDING             = "PENDING"
    val IN_PROGRESS         = "IN_PROGRESS"
    val SUCCESS             = "SUCCESS"
    val FAILED              = "FAILED"
    val TIMED_OUT           = "TIMED_OUT"
    val CANCELLING          = "CANCELLING"
    val CANCELLED           = "CANCELLED"
    val SKIPPED_OVERLAPPING = "SKIPPED_OVERLAPPING"

    val values = js.Object.freeze(
      js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING)
    )
  }

  /**
    * Information about a task execution performed as part of a maintenance window execution.
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
        WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    ): MaintenanceWindowExecutionTaskIdentity = {
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.update("TaskArn", __v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.update("TaskExecutionId", __v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.update("TaskType", __v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
    }
  }

  /**
    * Describes the information about a task invocation for a particular target as part of a task execution performed as part of a maintenance window execution.
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
        WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
    ): MaintenanceWindowExecutionTaskInvocationIdentity = {
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.update("ExecutionId", __v.asInstanceOf[js.Any]))
      InvocationId.foreach(__v => __obj.update("InvocationId", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.update("StatusDetails", __v.asInstanceOf[js.Any]))
      TaskExecutionId.foreach(__v => __obj.update("TaskExecutionId", __v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.update("TaskType", __v.asInstanceOf[js.Any]))
      WindowExecutionId.foreach(__v => __obj.update("WindowExecutionId", __v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.update("WindowTargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
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
        Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined
    ): MaintenanceWindowFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowFilter]
    }
  }

  /**
    * Information about the maintenance window.
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
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): MaintenanceWindowIdentity = {
      val __obj = js.Dictionary.empty[js.Any]
      Cutoff.foreach(__v => __obj.update("Cutoff", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextExecutionTime.foreach(__v => __obj.update("NextExecutionTime", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.update("ScheduleTimezone", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowIdentity]
    }
  }

  /**
    * The maintenance window to which the specified target belongs.
    */
  @js.native
  trait MaintenanceWindowIdentityForTarget extends js.Object {
    var Name: js.UndefOr[MaintenanceWindowName]
    var WindowId: js.UndefOr[MaintenanceWindowId]
  }

  object MaintenanceWindowIdentityForTarget {
    def apply(
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): MaintenanceWindowIdentityForTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowIdentityForTarget]
    }
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
  trait MaintenanceWindowLambdaParameters extends js.Object {
    var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext]
    var Payload: js.UndefOr[MaintenanceWindowLambdaPayload]
    var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier]
  }

  object MaintenanceWindowLambdaParameters {
    def apply(
        ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.undefined,
        Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.undefined,
        Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.undefined
    ): MaintenanceWindowLambdaParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      ClientContext.foreach(__v => __obj.update("ClientContext", __v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowLambdaParameters]
    }
  }

  object MaintenanceWindowResourceTypeEnum {
    val INSTANCE       = "INSTANCE"
    val RESOURCE_GROUP = "RESOURCE_GROUP"

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
        TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
    ): MaintenanceWindowRunCommandParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      DocumentHash.foreach(__v => __obj.update("DocumentHash", __v.asInstanceOf[js.Any]))
      DocumentHashType.foreach(__v => __obj.update("DocumentHashType", __v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.update("NotificationConfig", __v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.update("OutputS3BucketName", __v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.update("OutputS3KeyPrefix", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.update("TimeoutSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
    }
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
  trait MaintenanceWindowStepFunctionsParameters extends js.Object {
    var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput]
    var Name: js.UndefOr[MaintenanceWindowStepFunctionsName]
  }

  object MaintenanceWindowStepFunctionsParameters {
    def apply(
        Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.undefined
    ): MaintenanceWindowStepFunctionsParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      Input.foreach(__v => __obj.update("Input", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
    }
  }

  /**
    * The target registered with the maintenance window.
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
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): MaintenanceWindowTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.update("WindowTargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTarget]
    }
  }

  /**
    * Information about a task defined for a maintenance window.
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
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): MaintenanceWindowTask = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.update("LoggingInfo", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.update("TaskArn", __v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.update("TaskParameters", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.update("WindowTaskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTask]
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
        StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.undefined
    ): MaintenanceWindowTaskInvocationParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      Automation.foreach(__v => __obj.update("Automation", __v.asInstanceOf[js.Any]))
      Lambda.foreach(__v => __obj.update("Lambda", __v.asInstanceOf[js.Any]))
      RunCommand.foreach(__v => __obj.update("RunCommand", __v.asInstanceOf[js.Any]))
      StepFunctions.foreach(__v => __obj.update("StepFunctions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTaskInvocationParameters]
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
        Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.undefined
    ): MaintenanceWindowTaskParameterValueExpression = {
      val __obj = js.Dictionary.empty[js.Any]
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
    }
  }

  object MaintenanceWindowTaskTypeEnum {
    val RUN_COMMAND    = "RUN_COMMAND"
    val AUTOMATION     = "AUTOMATION"
    val STEP_FUNCTIONS = "STEP_FUNCTIONS"
    val LAMBDA         = "LAMBDA"

    val values = js.Object.freeze(js.Array(RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA))
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
        AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined
    ): ModifyDocumentPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"           -> Name.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any]
      )

      AccountIdsToAdd.foreach(__v => __obj.update("AccountIdsToAdd", __v.asInstanceOf[js.Any]))
      AccountIdsToRemove.foreach(__v => __obj.update("AccountIdsToRemove", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDocumentPermissionRequest]
    }
  }

  @js.native
  trait ModifyDocumentPermissionResponse extends js.Object {}

  object ModifyDocumentPermissionResponse {
    def apply(
        ): ModifyDocumentPermissionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ModifyDocumentPermissionResponse]
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
        SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined
    ): NonCompliantSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      NonCompliantCount.foreach(__v => __obj.update("NonCompliantCount", __v.asInstanceOf[js.Any]))
      SeveritySummary.foreach(__v => __obj.update("SeveritySummary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NonCompliantSummary]
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
        NotificationType: js.UndefOr[NotificationType] = js.undefined
    ): NotificationConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      NotificationArn.foreach(__v => __obj.update("NotificationArn", __v.asInstanceOf[js.Any]))
      NotificationEvents.foreach(__v => __obj.update("NotificationEvents", __v.asInstanceOf[js.Any]))
      NotificationType.foreach(__v => __obj.update("NotificationType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfig]
    }
  }

  object NotificationEventEnum {
    val All        = "All"
    val InProgress = "InProgress"
    val Success    = "Success"
    val TimedOut   = "TimedOut"
    val Cancelled  = "Cancelled"
    val Failed     = "Failed"

    val values = js.Object.freeze(js.Array(All, InProgress, Success, TimedOut, Cancelled, Failed))
  }

  object NotificationTypeEnum {
    val Command    = "Command"
    val Invocation = "Invocation"

    val values = js.Object.freeze(js.Array(Command, Invocation))
  }

  object OperatingSystemEnum {
    val WINDOWS                 = "WINDOWS"
    val AMAZON_LINUX            = "AMAZON_LINUX"
    val AMAZON_LINUX_2          = "AMAZON_LINUX_2"
    val UBUNTU                  = "UBUNTU"
    val REDHAT_ENTERPRISE_LINUX = "REDHAT_ENTERPRISE_LINUX"
    val SUSE                    = "SUSE"
    val CENTOS                  = "CENTOS"

    val values =
      js.Object.freeze(js.Array(WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS))
  }

  /**
    * One or more aggregators for viewing counts of OpsItems using different dimensions such as <code>Source</code>, <code>CreatedTime</code>, or <code>Source and CreatedTime</code>, to name a few.
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
    def apply(
        AggregatorType: js.UndefOr[OpsAggregatorType] = js.undefined,
        Aggregators: js.UndefOr[OpsAggregatorList] = js.undefined,
        AttributeName: js.UndefOr[OpsDataAttributeName] = js.undefined,
        Filters: js.UndefOr[OpsFilterList] = js.undefined,
        TypeName: js.UndefOr[OpsDataTypeName] = js.undefined,
        Values: js.UndefOr[OpsAggregatorValueMap] = js.undefined
    ): OpsAggregator = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregatorType.foreach(__v => __obj.update("AggregatorType", __v.asInstanceOf[js.Any]))
      Aggregators.foreach(__v => __obj.update("Aggregators", __v.asInstanceOf[js.Any]))
      AttributeName.foreach(__v => __obj.update("AttributeName", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.update("TypeName", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsAggregator]
    }
  }

  /**
    * The result of the query.
    */
  @js.native
  trait OpsEntity extends js.Object {
    var Data: js.UndefOr[OpsEntityItemMap]
    var Id: js.UndefOr[OpsEntityId]
  }

  object OpsEntity {
    def apply(
        Data: js.UndefOr[OpsEntityItemMap] = js.undefined,
        Id: js.UndefOr[OpsEntityId] = js.undefined
    ): OpsEntity = {
      val __obj = js.Dictionary.empty[js.Any]
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsEntity]
    }
  }

  /**
    * The OpsItem summaries result item.
    */
  @js.native
  trait OpsEntityItem extends js.Object {
    var Content: js.UndefOr[OpsEntityItemEntryList]
  }

  object OpsEntityItem {
    def apply(
        Content: js.UndefOr[OpsEntityItemEntryList] = js.undefined
    ): OpsEntityItem = {
      val __obj = js.Dictionary.empty[js.Any]
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsEntityItem]
    }
  }

  /**
    * A filter for viewing OpsItem summaries.
    */
  @js.native
  trait OpsFilter extends js.Object {
    var Key: OpsFilterKey
    var Values: OpsFilterValueList
    var Type: js.UndefOr[OpsFilterOperatorType]
  }

  object OpsFilter {
    def apply(
        Key: OpsFilterKey,
        Values: OpsFilterValueList,
        Type: js.UndefOr[OpsFilterOperatorType] = js.undefined
    ): OpsFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsFilter]
    }
  }

  object OpsFilterOperatorTypeEnum {
    val Equal       = "Equal"
    val NotEqual    = "NotEqual"
    val BeginWith   = "BeginWith"
    val LessThan    = "LessThan"
    val GreaterThan = "GreaterThan"
    val Exists      = "Exists"

    val values = js.Object.freeze(js.Array(Equal, NotEqual, BeginWith, LessThan, GreaterThan, Exists))
  }

  /**
    * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see [[http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html|AWS Systems Manager OpsCenter]] in the <i>AWS Systems Manager User Guide</i>.
    */
  @js.native
  trait OpsItem extends js.Object {
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
    var Source: js.UndefOr[OpsItemSource]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
    var Version: js.UndefOr[String]
  }

  object OpsItem {
    def apply(
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[OpsItemDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[String] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        Notifications: js.UndefOr[OpsItemNotifications] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OpsItemId: js.UndefOr[OpsItemId] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined,
        Source: js.UndefOr[OpsItemSource] = js.undefined,
        Status: js.UndefOr[OpsItemStatus] = js.undefined,
        Title: js.UndefOr[OpsItemTitle] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): OpsItem = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.update("Notifications", __v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.update("OperationalData", __v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.update("OpsItemId", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      RelatedOpsItems.foreach(__v => __obj.update("RelatedOpsItems", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItem]
    }
  }

  object OpsItemDataTypeEnum {
    val SearchableString = "SearchableString"
    val String           = "String"

    val values = js.Object.freeze(js.Array(SearchableString, String))
  }

  /**
    * An object that defines the value of the key and its type in the OperationalData map.
    */
  @js.native
  trait OpsItemDataValue extends js.Object {
    var Type: js.UndefOr[OpsItemDataType]
    var Value: js.UndefOr[OpsItemDataValueString]
  }

  object OpsItemDataValue {
    def apply(
        Type: js.UndefOr[OpsItemDataType] = js.undefined,
        Value: js.UndefOr[OpsItemDataValueString] = js.undefined
    ): OpsItemDataValue = {
      val __obj = js.Dictionary.empty[js.Any]
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemDataValue]
    }
  }

  /**
    * Describes an OpsItem filter.
    */
  @js.native
  trait OpsItemFilter extends js.Object {
    var Key: OpsItemFilterKey
    var Operator: OpsItemFilterOperator
    var Values: OpsItemFilterValues
  }

  object OpsItemFilter {
    def apply(
        Key: OpsItemFilterKey,
        Operator: OpsItemFilterOperator,
        Values: OpsItemFilterValues
    ): OpsItemFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"      -> Key.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values"   -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OpsItemFilter]
    }
  }

  object OpsItemFilterKeyEnum {
    val Status               = "Status"
    val CreatedBy            = "CreatedBy"
    val Source               = "Source"
    val Priority             = "Priority"
    val Title                = "Title"
    val OpsItemId            = "OpsItemId"
    val CreatedTime          = "CreatedTime"
    val LastModifiedTime     = "LastModifiedTime"
    val OperationalData      = "OperationalData"
    val OperationalDataKey   = "OperationalDataKey"
    val OperationalDataValue = "OperationalDataValue"
    val ResourceId           = "ResourceId"
    val AutomationId         = "AutomationId"

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
        AutomationId
      )
    )
  }

  object OpsItemFilterOperatorEnum {
    val Equal       = "Equal"
    val Contains    = "Contains"
    val GreaterThan = "GreaterThan"
    val LessThan    = "LessThan"

    val values = js.Object.freeze(js.Array(Equal, Contains, GreaterThan, LessThan))
  }

  /**
    * A notification about the OpsItem.
    */
  @js.native
  trait OpsItemNotification extends js.Object {
    var Arn: js.UndefOr[String]
  }

  object OpsItemNotification {
    def apply(
        Arn: js.UndefOr[String] = js.undefined
    ): OpsItemNotification = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemNotification]
    }
  }

  object OpsItemStatusEnum {
    val Open       = "Open"
    val InProgress = "InProgress"
    val Resolved   = "Resolved"

    val values = js.Object.freeze(js.Array(Open, InProgress, Resolved))
  }

  /**
    * A count of OpsItems.
    */
  @js.native
  trait OpsItemSummary extends js.Object {
    var CreatedBy: js.UndefOr[String]
    var CreatedTime: js.UndefOr[DateTime]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[DateTime]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OpsItemId: js.UndefOr[OpsItemId]
    var Priority: js.UndefOr[OpsItemPriority]
    var Source: js.UndefOr[OpsItemSource]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
  }

  object OpsItemSummary {
    def apply(
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        LastModifiedBy: js.UndefOr[String] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OpsItemId: js.UndefOr[OpsItemId] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        Source: js.UndefOr[OpsItemSource] = js.undefined,
        Status: js.UndefOr[OpsItemStatus] = js.undefined,
        Title: js.UndefOr[OpsItemTitle] = js.undefined
    ): OpsItemSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.update("OperationalData", __v.asInstanceOf[js.Any]))
      OpsItemId.foreach(__v => __obj.update("OpsItemId", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsItemSummary]
    }
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
        OutputSourceType: js.UndefOr[OutputSourceType] = js.undefined
    ): OutputSource = {
      val __obj = js.Dictionary.empty[js.Any]
      OutputSourceId.foreach(__v => __obj.update("OutputSourceId", __v.asInstanceOf[js.Any]))
      OutputSourceType.foreach(__v => __obj.update("OutputSourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSource]
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
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): Parameter = {
      val __obj = js.Dictionary.empty[js.Any]
      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Selector.foreach(__v => __obj.update("Selector", __v.asInstanceOf[js.Any]))
      SourceResult.foreach(__v => __obj.update("SourceResult", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
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
    var Policies: js.UndefOr[ParameterPolicyList]
    var Tier: js.UndefOr[ParameterTier]
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
        Policies: js.UndefOr[ParameterPolicyList] = js.undefined,
        Tier: js.UndefOr[ParameterTier] = js.undefined,
        Type: js.UndefOr[ParameterType] = js.undefined,
        Value: js.UndefOr[PSParameterValue] = js.undefined,
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): ParameterHistory = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedPattern.foreach(__v => __obj.update("AllowedPattern", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.update("LastModifiedUser", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.update("Policies", __v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.update("Tier", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterHistory]
    }
  }

  /**
    * One or more policies assigned to a parameter.
    */
  @js.native
  trait ParameterInlinePolicy extends js.Object {
    var PolicyStatus: js.UndefOr[String]
    var PolicyText: js.UndefOr[String]
    var PolicyType: js.UndefOr[String]
  }

  object ParameterInlinePolicy {
    def apply(
        PolicyStatus: js.UndefOr[String] = js.undefined,
        PolicyText: js.UndefOr[String] = js.undefined,
        PolicyType: js.UndefOr[String] = js.undefined
    ): ParameterInlinePolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyStatus.foreach(__v => __obj.update("PolicyStatus", __v.asInstanceOf[js.Any]))
      PolicyText.foreach(__v => __obj.update("PolicyText", __v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.update("PolicyType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterInlinePolicy]
    }
  }

  /**
    * Metadata includes information like the ARN of the last user and the date/time the parameter was last used.
    */
  @js.native
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

  object ParameterMetadata {
    def apply(
        AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
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
      val __obj = js.Dictionary.empty[js.Any]
      AllowedPattern.foreach(__v => __obj.update("AllowedPattern", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.update("LastModifiedUser", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.update("Policies", __v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.update("Tier", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterMetadata]
    }
  }

  /**
    * One or more filters. Use a filter to return a more specific list of results.
    *
    * '''Note:'''The <code>Name</code> and <code>Tier</code> filter keys can't be used with the <a>GetParametersByPath</a> API action. Also, the <code>Label</code> filter key can't be used with the <a>DescribeParameters</a> API action.
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
        Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined
    ): ParameterStringFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Option.foreach(__v => __obj.update("Option", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterStringFilter]
    }
  }

  object ParameterTierEnum {
    val Standard              = "Standard"
    val Advanced              = "Advanced"
    val `Intelligent-Tiering` = "Intelligent-Tiering"

    val values = js.Object.freeze(js.Array(Standard, Advanced, `Intelligent-Tiering`))
  }

  object ParameterTypeEnum {
    val String       = "String"
    val StringList   = "StringList"
    val SecureString = "SecureString"

    val values = js.Object.freeze(js.Array(String, StringList, SecureString))
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
        Values: ParametersFilterValueList
    ): ParametersFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParametersFilter]
    }
  }

  object ParametersFilterKeyEnum {
    val Name  = "Name"
    val Type  = "Type"
    val KeyId = "KeyId"

    val values = js.Object.freeze(js.Array(Name, Type, KeyId))
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
        Vendor: js.UndefOr[PatchVendor] = js.undefined
    ): Patch = {
      val __obj = js.Dictionary.empty[js.Any]
      Classification.foreach(__v => __obj.update("Classification", __v.asInstanceOf[js.Any]))
      ContentUrl.foreach(__v => __obj.update("ContentUrl", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      KbNumber.foreach(__v => __obj.update("KbNumber", __v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.update("Language", __v.asInstanceOf[js.Any]))
      MsrcNumber.foreach(__v => __obj.update("MsrcNumber", __v.asInstanceOf[js.Any]))
      MsrcSeverity.foreach(__v => __obj.update("MsrcSeverity", __v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.update("Product", __v.asInstanceOf[js.Any]))
      ProductFamily.foreach(__v => __obj.update("ProductFamily", __v.asInstanceOf[js.Any]))
      ReleaseDate.foreach(__v => __obj.update("ReleaseDate", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Vendor.foreach(__v => __obj.update("Vendor", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Patch]
    }
  }

  object PatchActionEnum {
    val ALLOW_AS_DEPENDENCY = "ALLOW_AS_DEPENDENCY"
    val BLOCK               = "BLOCK"

    val values = js.Object.freeze(js.Array(ALLOW_AS_DEPENDENCY, BLOCK))
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
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): PatchBaselineIdentity = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineDescription.foreach(__v => __obj.update("BaselineDescription", __v.asInstanceOf[js.Any]))
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      BaselineName.foreach(__v => __obj.update("BaselineName", __v.asInstanceOf[js.Any]))
      DefaultBaseline.foreach(__v => __obj.update("DefaultBaseline", __v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchBaselineIdentity]
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
        Title: PatchTitle
    ): PatchComplianceData = {
      val __obj = js.Dictionary[js.Any](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "InstalledTime"  -> InstalledTime.asInstanceOf[js.Any],
        "KBId"           -> KBId.asInstanceOf[js.Any],
        "Severity"       -> Severity.asInstanceOf[js.Any],
        "State"          -> State.asInstanceOf[js.Any],
        "Title"          -> Title.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PatchComplianceData]
    }
  }

  object PatchComplianceDataStateEnum {
    val INSTALLED          = "INSTALLED"
    val INSTALLED_OTHER    = "INSTALLED_OTHER"
    val INSTALLED_REJECTED = "INSTALLED_REJECTED"
    val MISSING            = "MISSING"
    val NOT_APPLICABLE     = "NOT_APPLICABLE"
    val FAILED             = "FAILED"

    val values =
      js.Object.freeze(js.Array(INSTALLED, INSTALLED_OTHER, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE, FAILED))
  }

  object PatchComplianceLevelEnum {
    val CRITICAL      = "CRITICAL"
    val HIGH          = "HIGH"
    val MEDIUM        = "MEDIUM"
    val LOW           = "LOW"
    val INFORMATIONAL = "INFORMATIONAL"
    val UNSPECIFIED   = "UNSPECIFIED"

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED))
  }

  object PatchDeploymentStatusEnum {
    val APPROVED          = "APPROVED"
    val PENDING_APPROVAL  = "PENDING_APPROVAL"
    val EXPLICIT_APPROVED = "EXPLICIT_APPROVED"
    val EXPLICIT_REJECTED = "EXPLICIT_REJECTED"

    val values = js.Object.freeze(js.Array(APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED))
  }

  /**
    * Defines which patches should be included in a patch baseline.
    *  A patch filter consists of a key and a set of values. The filter key is a patch property. For example, the available filter keys for WINDOWS are PATCH_SET, PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, and MSRC_SEVERITY. The filter values define a matching criterion for the patch property indicated by the key. For example, if the filter key is PRODUCT and the filter values are ["Office 2013", "Office 2016"], then the filter accepts all patches where product name is either "Office 2013" or "Office 2016". The filter values can be exact values for the patch property given as a key, or a wildcard (*), which matches all values.
    *  You can view lists of valid values for the patch properties by running the <code>DescribePatchProperties</code> command. For information about which patch properties can be used with each major operating system, see <a>DescribePatchProperties</a>.
    */
  @js.native
  trait PatchFilter extends js.Object {
    var Key: PatchFilterKey
    var Values: PatchFilterValueList
  }

  object PatchFilter {
    def apply(
        Key: PatchFilterKey,
        Values: PatchFilterValueList
    ): PatchFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PatchFilter]
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
        PatchFilters: PatchFilterList
    ): PatchFilterGroup = {
      val __obj = js.Dictionary[js.Any](
        "PatchFilters" -> PatchFilters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PatchFilterGroup]
    }
  }

  object PatchFilterKeyEnum {
    val PATCH_SET      = "PATCH_SET"
    val PRODUCT        = "PRODUCT"
    val PRODUCT_FAMILY = "PRODUCT_FAMILY"
    val CLASSIFICATION = "CLASSIFICATION"
    val MSRC_SEVERITY  = "MSRC_SEVERITY"
    val PATCH_ID       = "PATCH_ID"
    val SECTION        = "SECTION"
    val PRIORITY       = "PRIORITY"
    val SEVERITY       = "SEVERITY"

    val values = js.Object.freeze(
      js.Array(PATCH_SET, PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY)
    )
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
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): PatchGroupPatchBaselineMapping = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineIdentity.foreach(__v => __obj.update("BaselineIdentity", __v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.update("PatchGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
    }
  }

  object PatchOperationTypeEnum {
    val Scan    = "Scan"
    val Install = "Install"

    val values = js.Object.freeze(js.Array(Scan, Install))
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
        Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
    ): PatchOrchestratorFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchOrchestratorFilter]
    }
  }

  object PatchPropertyEnum {
    val PRODUCT        = "PRODUCT"
    val PRODUCT_FAMILY = "PRODUCT_FAMILY"
    val CLASSIFICATION = "CLASSIFICATION"
    val MSRC_SEVERITY  = "MSRC_SEVERITY"
    val PRIORITY       = "PRIORITY"
    val SEVERITY       = "SEVERITY"

    val values = js.Object.freeze(js.Array(PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY, PRIORITY, SEVERITY))
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
        EnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    ): PatchRule = {
      val __obj = js.Dictionary[js.Any](
        "ApproveAfterDays" -> ApproveAfterDays.asInstanceOf[js.Any],
        "PatchFilterGroup" -> PatchFilterGroup.asInstanceOf[js.Any]
      )

      ComplianceLevel.foreach(__v => __obj.update("ComplianceLevel", __v.asInstanceOf[js.Any]))
      EnableNonSecurity.foreach(__v => __obj.update("EnableNonSecurity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchRule]
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
        PatchRules: PatchRuleList
    ): PatchRuleGroup = {
      val __obj = js.Dictionary[js.Any](
        "PatchRules" -> PatchRules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PatchRuleGroup]
    }
  }

  object PatchSetEnum {
    val OS          = "OS"
    val APPLICATION = "APPLICATION"

    val values = js.Object.freeze(js.Array(OS, APPLICATION))
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
        Products: PatchSourceProductList
    ): PatchSource = {
      val __obj = js.Dictionary[js.Any](
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "Name"          -> Name.asInstanceOf[js.Any],
        "Products"      -> Products.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PatchSource]
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
        DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined
    ): PatchStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      ApprovalDate.foreach(__v => __obj.update("ApprovalDate", __v.asInstanceOf[js.Any]))
      ComplianceLevel.foreach(__v => __obj.update("ComplianceLevel", __v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.update("DeploymentStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchStatus]
    }
  }

  object PingStatusEnum {
    val Online         = "Online"
    val ConnectionLost = "ConnectionLost"
    val Inactive       = "Inactive"

    val values = js.Object.freeze(js.Array(Online, ConnectionLost, Inactive))
  }

  object PlatformTypeEnum {
    val Windows = "Windows"
    val Linux   = "Linux"

    val values = js.Object.freeze(js.Array(Windows, Linux))
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
        TotalSteps: js.UndefOr[Int] = js.undefined
    ): ProgressCounters = {
      val __obj = js.Dictionary.empty[js.Any]
      CancelledSteps.foreach(__v => __obj.update("CancelledSteps", __v.asInstanceOf[js.Any]))
      FailedSteps.foreach(__v => __obj.update("FailedSteps", __v.asInstanceOf[js.Any]))
      SuccessSteps.foreach(__v => __obj.update("SuccessSteps", __v.asInstanceOf[js.Any]))
      TimedOutSteps.foreach(__v => __obj.update("TimedOutSteps", __v.asInstanceOf[js.Any]))
      TotalSteps.foreach(__v => __obj.update("TotalSteps", __v.asInstanceOf[js.Any]))
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
  }

  object PutComplianceItemsRequest {
    def apply(
        ComplianceType: ComplianceTypeName,
        ExecutionSummary: ComplianceExecutionSummary,
        Items: ComplianceItemEntryList,
        ResourceId: ComplianceResourceId,
        ResourceType: ComplianceResourceType,
        ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.undefined
    ): PutComplianceItemsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ComplianceType"   -> ComplianceType.asInstanceOf[js.Any],
        "ExecutionSummary" -> ExecutionSummary.asInstanceOf[js.Any],
        "Items"            -> Items.asInstanceOf[js.Any],
        "ResourceId"       -> ResourceId.asInstanceOf[js.Any],
        "ResourceType"     -> ResourceType.asInstanceOf[js.Any]
      )

      ItemContentHash.foreach(__v => __obj.update("ItemContentHash", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutComplianceItemsRequest]
    }
  }

  @js.native
  trait PutComplianceItemsResult extends js.Object {}

  object PutComplianceItemsResult {
    def apply(
        ): PutComplianceItemsResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutComplianceItemsResult]
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
        Items: InventoryItemList
    ): PutInventoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Items"      -> Items.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutInventoryRequest]
    }
  }

  @js.native
  trait PutInventoryResult extends js.Object {
    var Message: js.UndefOr[PutInventoryMessage]
  }

  object PutInventoryResult {
    def apply(
        Message: js.UndefOr[PutInventoryMessage] = js.undefined
    ): PutInventoryResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInventoryResult]
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
    var Policies: js.UndefOr[ParameterPolicies]
    var Tags: js.UndefOr[TagList]
    var Tier: js.UndefOr[ParameterTier]
  }

  object PutParameterRequest {
    def apply(
        Name: PSParameterName,
        Type: ParameterType,
        Value: PSParameterValue,
        AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined,
        Description: js.UndefOr[ParameterDescription] = js.undefined,
        KeyId: js.UndefOr[ParameterKeyId] = js.undefined,
        Overwrite: js.UndefOr[Boolean] = js.undefined,
        Policies: js.UndefOr[ParameterPolicies] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Tier: js.UndefOr[ParameterTier] = js.undefined
    ): PutParameterRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      AllowedPattern.foreach(__v => __obj.update("AllowedPattern", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Overwrite.foreach(__v => __obj.update("Overwrite", __v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.update("Policies", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.update("Tier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutParameterRequest]
    }
  }

  @js.native
  trait PutParameterResult extends js.Object {
    var Version: js.UndefOr[PSParameterVersion]
  }

  object PutParameterResult {
    def apply(
        Version: js.UndefOr[PSParameterVersion] = js.undefined
    ): PutParameterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutParameterResult]
    }
  }

  @js.native
  trait RegisterDefaultPatchBaselineRequest extends js.Object {
    var BaselineId: BaselineId
  }

  object RegisterDefaultPatchBaselineRequest {
    def apply(
        BaselineId: BaselineId
    ): RegisterDefaultPatchBaselineRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined
    ): RegisterDefaultPatchBaselineResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDefaultPatchBaselineResult]
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
        PatchGroup: PatchGroup
    ): RegisterPatchBaselineForPatchGroupRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        BaselineId: js.UndefOr[BaselineId] = js.undefined,
        PatchGroup: js.UndefOr[PatchGroup] = js.undefined
    ): RegisterPatchBaselineForPatchGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.update("PatchGroup", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceType: MaintenanceWindowResourceType,
        Targets: Targets,
        WindowId: MaintenanceWindowId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    ): RegisterTargetWithMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Targets"      -> Targets.asInstanceOf[js.Any],
        "WindowId"     -> WindowId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId]
  }

  object RegisterTargetWithMaintenanceWindowResult {
    def apply(
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): RegisterTargetWithMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowTargetId.foreach(__v => __obj.update("WindowTargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
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
        TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    ): RegisterTaskWithMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
        "MaxConcurrency" -> MaxConcurrency.asInstanceOf[js.Any],
        "MaxErrors"      -> MaxErrors.asInstanceOf[js.Any],
        "Targets"        -> Targets.asInstanceOf[js.Any],
        "TaskArn"        -> TaskArn.asInstanceOf[js.Any],
        "TaskType"       -> TaskType.asInstanceOf[js.Any],
        "WindowId"       -> WindowId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.update("LoggingInfo", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.update("TaskInvocationParameters", __v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.update("TaskParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
    }
  }

  @js.native
  trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId]
  }

  object RegisterTaskWithMaintenanceWindowResult {
    def apply(
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): RegisterTaskWithMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      WindowTaskId.foreach(__v => __obj.update("WindowTaskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
    }
  }

  /**
    * An OpsItems that shares something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  @js.native
  trait RelatedOpsItem extends js.Object {
    var OpsItemId: String
  }

  object RelatedOpsItem {
    def apply(
        OpsItemId: String
    ): RelatedOpsItem = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceTypeForTagging,
        TagKeys: KeyList
    ): RemoveTagsFromResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResult extends js.Object {}

  object RemoveTagsFromResourceResult {
    def apply(
        ): RemoveTagsFromResourceResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RemoveTagsFromResourceResult]
    }
  }

  /**
    * The request body of the ResetServiceSetting API action.
    */
  @js.native
  trait ResetServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
  }

  object ResetServiceSettingRequest {
    def apply(
        SettingId: ServiceSettingId
    ): ResetServiceSettingRequest = {
      val __obj = js.Dictionary[js.Any](
        "SettingId" -> SettingId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetServiceSettingRequest]
    }
  }

  /**
    * The result body of the ResetServiceSetting API action.
    */
  @js.native
  trait ResetServiceSettingResult extends js.Object {
    var ServiceSetting: js.UndefOr[ServiceSetting]
  }

  object ResetServiceSettingResult {
    def apply(
        ServiceSetting: js.UndefOr[ServiceSetting] = js.undefined
    ): ResetServiceSettingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSetting.foreach(__v => __obj.update("ServiceSetting", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetServiceSettingResult]
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
        Truncated: js.UndefOr[Boolean] = js.undefined
    ): ResolvedTargets = {
      val __obj = js.Dictionary.empty[js.Any]
      ParameterValues.foreach(__v => __obj.update("ParameterValues", __v.asInstanceOf[js.Any]))
      Truncated.foreach(__v => __obj.update("Truncated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolvedTargets]
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
        Status: js.UndefOr[ComplianceStatus] = js.undefined
    ): ResourceComplianceSummaryItem = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      CompliantSummary.foreach(__v => __obj.update("CompliantSummary", __v.asInstanceOf[js.Any]))
      ExecutionSummary.foreach(__v => __obj.update("ExecutionSummary", __v.asInstanceOf[js.Any]))
      NonCompliantSummary.foreach(__v => __obj.update("NonCompliantSummary", __v.asInstanceOf[js.Any]))
      OverallSeverity.foreach(__v => __obj.update("OverallSeverity", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceComplianceSummaryItem]
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
        SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined
    ): ResourceDataSyncItem = {
      val __obj = js.Dictionary.empty[js.Any]
      LastStatus.foreach(__v => __obj.update("LastStatus", __v.asInstanceOf[js.Any]))
      LastSuccessfulSyncTime.foreach(__v => __obj.update("LastSuccessfulSyncTime", __v.asInstanceOf[js.Any]))
      LastSyncStatusMessage.foreach(__v => __obj.update("LastSyncStatusMessage", __v.asInstanceOf[js.Any]))
      LastSyncTime.foreach(__v => __obj.update("LastSyncTime", __v.asInstanceOf[js.Any]))
      S3Destination.foreach(__v => __obj.update("S3Destination", __v.asInstanceOf[js.Any]))
      SyncCreatedTime.foreach(__v => __obj.update("SyncCreatedTime", __v.asInstanceOf[js.Any]))
      SyncName.foreach(__v => __obj.update("SyncName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncItem]
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
        Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined
    ): ResourceDataSyncS3Destination = {
      val __obj = js.Dictionary[js.Any](
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "Region"     -> Region.asInstanceOf[js.Any],
        "SyncFormat" -> SyncFormat.asInstanceOf[js.Any]
      )

      AWSKMSKeyARN.foreach(__v => __obj.update("AWSKMSKeyARN", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataSyncS3Destination]
    }
  }

  object ResourceDataSyncS3FormatEnum {
    val JsonSerDe = "JsonSerDe"

    val values = js.Object.freeze(js.Array(JsonSerDe))
  }

  object ResourceTypeEnum {
    val ManagedInstance = "ManagedInstance"
    val Document        = "Document"
    val EC2Instance     = "EC2Instance"

    val values = js.Object.freeze(js.Array(ManagedInstance, Document, EC2Instance))
  }

  object ResourceTypeForTaggingEnum {
    val Document          = "Document"
    val ManagedInstance   = "ManagedInstance"
    val MaintenanceWindow = "MaintenanceWindow"
    val Parameter         = "Parameter"
    val PatchBaseline     = "PatchBaseline"
    val OpsItem           = "OpsItem"

    val values =
      js.Object.freeze(js.Array(Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem))
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
        TypeName: InventoryItemTypeName
    ): ResultAttribute = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        SessionId: SessionId
    ): ResumeSessionRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined,
        StreamUrl: js.UndefOr[StreamUrl] = js.undefined,
        TokenValue: js.UndefOr[TokenValue] = js.undefined
    ): ResumeSessionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SessionId.foreach(__v => __obj.update("SessionId", __v.asInstanceOf[js.Any]))
      StreamUrl.foreach(__v => __obj.update("StreamUrl", __v.asInstanceOf[js.Any]))
      TokenValue.foreach(__v => __obj.update("TokenValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResumeSessionResponse]
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
        OutputS3Region: js.UndefOr[S3Region] = js.undefined
    ): S3OutputLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      OutputS3BucketName.foreach(__v => __obj.update("OutputS3BucketName", __v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.update("OutputS3KeyPrefix", __v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.update("OutputS3Region", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3OutputLocation]
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
        OutputUrl: js.UndefOr[Url] = js.undefined
    ): S3OutputUrl = {
      val __obj = js.Dictionary.empty[js.Any]
      OutputUrl.foreach(__v => __obj.update("OutputUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3OutputUrl]
    }
  }

  /**
    * Information about a scheduled execution for a maintenance window.
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
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): ScheduledWindowExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      ExecutionTime.foreach(__v => __obj.update("ExecutionTime", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
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
    def apply(
        AutomationExecutionId: AutomationExecutionId,
        SignalType: SignalType,
        Payload: js.UndefOr[AutomationParameterMap] = js.undefined
    ): SendAutomationSignalRequest = {
      val __obj = js.Dictionary[js.Any](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any],
        "SignalType"            -> SignalType.asInstanceOf[js.Any]
      )

      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAutomationSignalRequest]
    }
  }

  @js.native
  trait SendAutomationSignalResult extends js.Object {}

  object SendAutomationSignalResult {
    def apply(
        ): SendAutomationSignalResult = {
      val __obj = js.Dictionary.empty[js.Any]

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
      val __obj = js.Dictionary[js.Any](
        "DocumentName" -> DocumentName.asInstanceOf[js.Any]
      )

      CloudWatchOutputConfig.foreach(__v => __obj.update("CloudWatchOutputConfig", __v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      DocumentHash.foreach(__v => __obj.update("DocumentHash", __v.asInstanceOf[js.Any]))
      DocumentHashType.foreach(__v => __obj.update("DocumentHashType", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      NotificationConfig.foreach(__v => __obj.update("NotificationConfig", __v.asInstanceOf[js.Any]))
      OutputS3BucketName.foreach(__v => __obj.update("OutputS3BucketName", __v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.update("OutputS3KeyPrefix", __v.asInstanceOf[js.Any]))
      OutputS3Region.foreach(__v => __obj.update("OutputS3Region", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.update("TimeoutSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCommandRequest]
    }
  }

  @js.native
  trait SendCommandResult extends js.Object {
    var Command: js.UndefOr[Command]
  }

  object SendCommandResult {
    def apply(
        Command: js.UndefOr[Command] = js.undefined
    ): SendCommandResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Command.foreach(__v => __obj.update("Command", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCommandResult]
    }
  }

  /**
    * The service setting data structure.
    *  <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature.
    *  Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the <a>UpdateServiceSetting</a> API action to change the default setting. Or, use the <a>ResetServiceSetting</a> to change the value back to the original value defined by the AWS service team.
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
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        LastModifiedDate: js.UndefOr[DateTime] = js.undefined,
        LastModifiedUser: js.UndefOr[String] = js.undefined,
        SettingId: js.UndefOr[ServiceSettingId] = js.undefined,
        SettingValue: js.UndefOr[ServiceSettingValue] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ServiceSetting = {
      val __obj = js.Dictionary.empty[js.Any]
      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      LastModifiedUser.foreach(__v => __obj.update("LastModifiedUser", __v.asInstanceOf[js.Any]))
      SettingId.foreach(__v => __obj.update("SettingId", __v.asInstanceOf[js.Any]))
      SettingValue.foreach(__v => __obj.update("SettingValue", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSetting]
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
        Target: js.UndefOr[SessionTarget] = js.undefined
    ): Session = {
      val __obj = js.Dictionary.empty[js.Any]
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      OutputUrl.foreach(__v => __obj.update("OutputUrl", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.update("SessionId", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Session]
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
        value: SessionFilterValue
    ): SessionFilter = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SessionFilter]
    }
  }

  object SessionFilterKeyEnum {
    val InvokedAfter  = "InvokedAfter"
    val InvokedBefore = "InvokedBefore"
    val Target        = "Target"
    val Owner         = "Owner"
    val Status        = "Status"

    val values = js.Object.freeze(js.Array(InvokedAfter, InvokedBefore, Target, Owner, Status))
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
        S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined
    ): SessionManagerOutputUrl = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchOutputUrl.foreach(__v => __obj.update("CloudWatchOutputUrl", __v.asInstanceOf[js.Any]))
      S3OutputUrl.foreach(__v => __obj.update("S3OutputUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionManagerOutputUrl]
    }
  }

  object SessionStateEnum {
    val Active  = "Active"
    val History = "History"

    val values = js.Object.freeze(js.Array(Active, History))
  }

  object SessionStatusEnum {
    val Connected    = "Connected"
    val Connecting   = "Connecting"
    val Disconnected = "Disconnected"
    val Terminated   = "Terminated"
    val Terminating  = "Terminating"
    val Failed       = "Failed"

    val values = js.Object.freeze(js.Array(Connected, Connecting, Disconnected, Terminated, Terminating, Failed))
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
        UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    ): SeveritySummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CriticalCount.foreach(__v => __obj.update("CriticalCount", __v.asInstanceOf[js.Any]))
      HighCount.foreach(__v => __obj.update("HighCount", __v.asInstanceOf[js.Any]))
      InformationalCount.foreach(__v => __obj.update("InformationalCount", __v.asInstanceOf[js.Any]))
      LowCount.foreach(__v => __obj.update("LowCount", __v.asInstanceOf[js.Any]))
      MediumCount.foreach(__v => __obj.update("MediumCount", __v.asInstanceOf[js.Any]))
      UnspecifiedCount.foreach(__v => __obj.update("UnspecifiedCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeveritySummary]
    }
  }

  object SignalTypeEnum {
    val Approve   = "Approve"
    val Reject    = "Reject"
    val StartStep = "StartStep"
    val StopStep  = "StopStep"
    val Resume    = "Resume"

    val values = js.Object.freeze(js.Array(Approve, Reject, StartStep, StopStep, Resume))
  }

  @js.native
  trait StartAssociationsOnceRequest extends js.Object {
    var AssociationIds: AssociationIdList
  }

  object StartAssociationsOnceRequest {
    def apply(
        AssociationIds: AssociationIdList
    ): StartAssociationsOnceRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssociationIds" -> AssociationIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartAssociationsOnceRequest]
    }
  }

  @js.native
  trait StartAssociationsOnceResult extends js.Object {}

  object StartAssociationsOnceResult {
    def apply(
        ): StartAssociationsOnceResult = {
      val __obj = js.Dictionary.empty[js.Any]

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
        Targets: js.UndefOr[Targets] = js.undefined
    ): StartAutomationExecutionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentName" -> DocumentName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      TargetLocations.foreach(__v => __obj.update("TargetLocations", __v.asInstanceOf[js.Any]))
      TargetMaps.foreach(__v => __obj.update("TargetMaps", __v.asInstanceOf[js.Any]))
      TargetParameterName.foreach(__v => __obj.update("TargetParameterName", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAutomationExecutionRequest]
    }
  }

  @js.native
  trait StartAutomationExecutionResult extends js.Object {
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId]
  }

  object StartAutomationExecutionResult {
    def apply(
        AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    ): StartAutomationExecutionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomationExecutionId.foreach(__v => __obj.update("AutomationExecutionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAutomationExecutionResult]
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
        Parameters: js.UndefOr[SessionManagerParameters] = js.undefined
    ): StartSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Target" -> Target.asInstanceOf[js.Any]
      )

      DocumentName.foreach(__v => __obj.update("DocumentName", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
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
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined,
        StreamUrl: js.UndefOr[StreamUrl] = js.undefined,
        TokenValue: js.UndefOr[TokenValue] = js.undefined
    ): StartSessionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SessionId.foreach(__v => __obj.update("SessionId", __v.asInstanceOf[js.Any]))
      StreamUrl.foreach(__v => __obj.update("StreamUrl", __v.asInstanceOf[js.Any]))
      TokenValue.foreach(__v => __obj.update("TokenValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSessionResponse]
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
        ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined
    ): StepExecution = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      ExecutionEndTime.foreach(__v => __obj.update("ExecutionEndTime", __v.asInstanceOf[js.Any]))
      ExecutionStartTime.foreach(__v => __obj.update("ExecutionStartTime", __v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.update("FailureDetails", __v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.update("FailureMessage", __v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.update("Inputs", __v.asInstanceOf[js.Any]))
      IsCritical.foreach(__v => __obj.update("IsCritical", __v.asInstanceOf[js.Any]))
      IsEnd.foreach(__v => __obj.update("IsEnd", __v.asInstanceOf[js.Any]))
      MaxAttempts.foreach(__v => __obj.update("MaxAttempts", __v.asInstanceOf[js.Any]))
      NextStep.foreach(__v => __obj.update("NextStep", __v.asInstanceOf[js.Any]))
      OnFailure.foreach(__v => __obj.update("OnFailure", __v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.update("Outputs", __v.asInstanceOf[js.Any]))
      OverriddenParameters.foreach(__v => __obj.update("OverriddenParameters", __v.asInstanceOf[js.Any]))
      Response.foreach(__v => __obj.update("Response", __v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.update("ResponseCode", __v.asInstanceOf[js.Any]))
      StepExecutionId.foreach(__v => __obj.update("StepExecutionId", __v.asInstanceOf[js.Any]))
      StepName.foreach(__v => __obj.update("StepName", __v.asInstanceOf[js.Any]))
      StepStatus.foreach(__v => __obj.update("StepStatus", __v.asInstanceOf[js.Any]))
      TargetLocation.foreach(__v => __obj.update("TargetLocation", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.update("TimeoutSeconds", __v.asInstanceOf[js.Any]))
      ValidNextSteps.foreach(__v => __obj.update("ValidNextSteps", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepExecution]
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
        Values: StepExecutionFilterValueList
    ): StepExecutionFilter = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StepExecutionFilter]
    }
  }

  object StepExecutionFilterKeyEnum {
    val StartTimeBefore     = "StartTimeBefore"
    val StartTimeAfter      = "StartTimeAfter"
    val StepExecutionStatus = "StepExecutionStatus"
    val StepExecutionId     = "StepExecutionId"
    val StepName            = "StepName"
    val Action              = "Action"

    val values = js.Object.freeze(
      js.Array(StartTimeBefore, StartTimeAfter, StepExecutionStatus, StepExecutionId, StepName, Action)
    )
  }

  @js.native
  trait StopAutomationExecutionRequest extends js.Object {
    var AutomationExecutionId: AutomationExecutionId
    var Type: js.UndefOr[StopType]
  }

  object StopAutomationExecutionRequest {
    def apply(
        AutomationExecutionId: AutomationExecutionId,
        Type: js.UndefOr[StopType] = js.undefined
    ): StopAutomationExecutionRequest = {
      val __obj = js.Dictionary[js.Any](
        "AutomationExecutionId" -> AutomationExecutionId.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopAutomationExecutionRequest]
    }
  }

  @js.native
  trait StopAutomationExecutionResult extends js.Object {}

  object StopAutomationExecutionResult {
    def apply(
        ): StopAutomationExecutionResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopAutomationExecutionResult]
    }
  }

  object StopTypeEnum {
    val Complete = "Complete"
    val Cancel   = "Cancel"

    val values = js.Object.freeze(js.Array(Complete, Cancel))
  }

  /**
    * Metadata that you assign to your AWS resources. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. In Systems Manager, you can apply tags to documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
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
    *  * (Maintenance window targets only) <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
    * For information about how to send commands that target instances using <code>Key,Value</code> parameters, see [[https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting|Using Targets and Rate Controls to Send Commands to a Fleet]] in the <i>AWS Systems Manager User Guide</i>.
    */
  @js.native
  trait Target extends js.Object {
    var Key: js.UndefOr[TargetKey]
    var Values: js.UndefOr[TargetValues]
  }

  object Target {
    def apply(
        Key: js.UndefOr[TargetKey] = js.undefined,
        Values: js.UndefOr[TargetValues] = js.undefined
    ): Target = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
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
        TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined
    ): TargetLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      Accounts.foreach(__v => __obj.update("Accounts", __v.asInstanceOf[js.Any]))
      ExecutionRoleName.foreach(__v => __obj.update("ExecutionRoleName", __v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.update("Regions", __v.asInstanceOf[js.Any]))
      TargetLocationMaxConcurrency.foreach(
        __v => __obj.update("TargetLocationMaxConcurrency", __v.asInstanceOf[js.Any])
      )
      TargetLocationMaxErrors.foreach(__v => __obj.update("TargetLocationMaxErrors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetLocation]
    }
  }

  @js.native
  trait TerminateSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object TerminateSessionRequest {
    def apply(
        SessionId: SessionId
    ): TerminateSessionRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined
    ): TerminateSessionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SessionId.foreach(__v => __obj.update("SessionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateSessionResponse]
    }
  }

  @js.native
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

  object UpdateAssociationRequest {
    def apply(
        AssociationId: AssociationId,
        AssociationName: js.UndefOr[AssociationName] = js.undefined,
        AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined,
        AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined,
        ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined,
        DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        MaxErrors: js.UndefOr[MaxErrors] = js.undefined,
        Name: js.UndefOr[DocumentARN] = js.undefined,
        OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): UpdateAssociationRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      AssociationName.foreach(__v => __obj.update("AssociationName", __v.asInstanceOf[js.Any]))
      AssociationVersion.foreach(__v => __obj.update("AssociationVersion", __v.asInstanceOf[js.Any]))
      AutomationTargetParameterName.foreach(
        __v => __obj.update("AutomationTargetParameterName", __v.asInstanceOf[js.Any])
      )
      ComplianceSeverity.foreach(__v => __obj.update("ComplianceSeverity", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssociationRequest]
    }
  }

  @js.native
  trait UpdateAssociationResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object UpdateAssociationResult {
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationDescription.foreach(__v => __obj.update("AssociationDescription", __v.asInstanceOf[js.Any]))
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
    def apply(
        AssociationStatus: AssociationStatus,
        InstanceId: InstanceId,
        Name: DocumentARN
    ): UpdateAssociationStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "AssociationStatus" -> AssociationStatus.asInstanceOf[js.Any],
        "InstanceId"        -> InstanceId.asInstanceOf[js.Any],
        "Name"              -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAssociationStatusRequest]
    }
  }

  @js.native
  trait UpdateAssociationStatusResult extends js.Object {
    var AssociationDescription: js.UndefOr[AssociationDescription]
  }

  object UpdateAssociationStatusResult {
    def apply(
        AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationStatusResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationDescription.foreach(__v => __obj.update("AssociationDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssociationStatusResult]
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
        Name: DocumentName
    ): UpdateDocumentDefaultVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentVersion" -> DocumentVersion.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
    }
  }

  @js.native
  trait UpdateDocumentDefaultVersionResult extends js.Object {
    var Description: js.UndefOr[DocumentDefaultVersionDescription]
  }

  object UpdateDocumentDefaultVersionResult {
    def apply(
        Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined
    ): UpdateDocumentDefaultVersionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentDefaultVersionResult]
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
        VersionName: js.UndefOr[DocumentVersionName] = js.undefined
    ): UpdateDocumentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Content" -> Content.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      )

      Attachments.foreach(__v => __obj.update("Attachments", __v.asInstanceOf[js.Any]))
      DocumentFormat.foreach(__v => __obj.update("DocumentFormat", __v.asInstanceOf[js.Any]))
      DocumentVersion.foreach(__v => __obj.update("DocumentVersion", __v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.update("TargetType", __v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.update("VersionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentRequest]
    }
  }

  @js.native
  trait UpdateDocumentResult extends js.Object {
    var DocumentDescription: js.UndefOr[DocumentDescription]
  }

  object UpdateDocumentResult {
    def apply(
        DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): UpdateDocumentResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentDescription.foreach(__v => __obj.update("DocumentDescription", __v.asInstanceOf[js.Any]))
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
        StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    ): UpdateMaintenanceWindowRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId" -> WindowId.asInstanceOf[js.Any]
      )

      AllowUnassociatedTargets.foreach(__v => __obj.update("AllowUnassociatedTargets", __v.asInstanceOf[js.Any]))
      Cutoff.foreach(__v => __obj.update("Cutoff", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.update("Replace", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.update("ScheduleTimezone", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
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
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    ): UpdateMaintenanceWindowResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowUnassociatedTargets.foreach(__v => __obj.update("AllowUnassociatedTargets", __v.asInstanceOf[js.Any]))
      Cutoff.foreach(__v => __obj.update("Cutoff", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      ScheduleTimezone.foreach(__v => __obj.update("ScheduleTimezone", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
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
    def apply(
        WindowId: MaintenanceWindowId,
        WindowTargetId: MaintenanceWindowTargetId,
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
        Replace: js.UndefOr[Boolean] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): UpdateMaintenanceWindowTargetRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId"       -> WindowId.asInstanceOf[js.Any],
        "WindowTargetId" -> WindowTargetId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.update("Replace", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
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
    def apply(
        Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined,
        Name: js.UndefOr[MaintenanceWindowName] = js.undefined,
        OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined,
        WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined,
        WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
    ): UpdateMaintenanceWindowTargetResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OwnerInformation.foreach(__v => __obj.update("OwnerInformation", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTargetId.foreach(__v => __obj.update("WindowTargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
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
        TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    ): UpdateMaintenanceWindowTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "WindowId"     -> WindowId.asInstanceOf[js.Any],
        "WindowTaskId" -> WindowTaskId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.update("LoggingInfo", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.update("Replace", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.update("TaskArn", __v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.update("TaskInvocationParameters", __v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.update("TaskParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTaskRequest]
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
        WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
    ): UpdateMaintenanceWindowTaskResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.update("LoggingInfo", __v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.update("MaxConcurrency", __v.asInstanceOf[js.Any]))
      MaxErrors.foreach(__v => __obj.update("MaxErrors", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.update("ServiceRoleArn", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.update("TaskArn", __v.asInstanceOf[js.Any]))
      TaskInvocationParameters.foreach(__v => __obj.update("TaskInvocationParameters", __v.asInstanceOf[js.Any]))
      TaskParameters.foreach(__v => __obj.update("TaskParameters", __v.asInstanceOf[js.Any]))
      WindowId.foreach(__v => __obj.update("WindowId", __v.asInstanceOf[js.Any]))
      WindowTaskId.foreach(__v => __obj.update("WindowTaskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceWindowTaskResult]
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
        InstanceId: ManagedInstanceId
    ): UpdateManagedInstanceRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "IamRole"    -> IamRole.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateManagedInstanceRoleRequest]
    }
  }

  @js.native
  trait UpdateManagedInstanceRoleResult extends js.Object {}

  object UpdateManagedInstanceRoleResult {
    def apply(
        ): UpdateManagedInstanceRoleResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateManagedInstanceRoleResult]
    }
  }

  @js.native
  trait UpdateOpsItemRequest extends js.Object {
    var OpsItemId: OpsItemId
    var Description: js.UndefOr[OpsItemDescription]
    var Notifications: js.UndefOr[OpsItemNotifications]
    var OperationalData: js.UndefOr[OpsItemOperationalData]
    var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList]
    var Priority: js.UndefOr[OpsItemPriority]
    var RelatedOpsItems: js.UndefOr[RelatedOpsItems]
    var Status: js.UndefOr[OpsItemStatus]
    var Title: js.UndefOr[OpsItemTitle]
  }

  object UpdateOpsItemRequest {
    def apply(
        OpsItemId: OpsItemId,
        Description: js.UndefOr[OpsItemDescription] = js.undefined,
        Notifications: js.UndefOr[OpsItemNotifications] = js.undefined,
        OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined,
        OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.undefined,
        Priority: js.UndefOr[OpsItemPriority] = js.undefined,
        RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined,
        Status: js.UndefOr[OpsItemStatus] = js.undefined,
        Title: js.UndefOr[OpsItemTitle] = js.undefined
    ): UpdateOpsItemRequest = {
      val __obj = js.Dictionary[js.Any](
        "OpsItemId" -> OpsItemId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.update("Notifications", __v.asInstanceOf[js.Any]))
      OperationalData.foreach(__v => __obj.update("OperationalData", __v.asInstanceOf[js.Any]))
      OperationalDataToDelete.foreach(__v => __obj.update("OperationalDataToDelete", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      RelatedOpsItems.foreach(__v => __obj.update("RelatedOpsItems", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOpsItemRequest]
    }
  }

  @js.native
  trait UpdateOpsItemResponse extends js.Object {}

  object UpdateOpsItemResponse {
    def apply(
        ): UpdateOpsItemResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateOpsItemResponse]
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
        Sources: js.UndefOr[PatchSourceList] = js.undefined
    ): UpdatePatchBaselineRequest = {
      val __obj = js.Dictionary[js.Any](
        "BaselineId" -> BaselineId.asInstanceOf[js.Any]
      )

      ApprovalRules.foreach(__v => __obj.update("ApprovalRules", __v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.update("ApprovedPatches", __v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(
        __v => __obj.update("ApprovedPatchesComplianceLevel", __v.asInstanceOf[js.Any])
      )
      ApprovedPatchesEnableNonSecurity.foreach(
        __v => __obj.update("ApprovedPatchesEnableNonSecurity", __v.asInstanceOf[js.Any])
      )
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.update("GlobalFilters", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.update("RejectedPatches", __v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.update("RejectedPatchesAction", __v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.update("Replace", __v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.update("Sources", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      ApprovalRules.foreach(__v => __obj.update("ApprovalRules", __v.asInstanceOf[js.Any]))
      ApprovedPatches.foreach(__v => __obj.update("ApprovedPatches", __v.asInstanceOf[js.Any]))
      ApprovedPatchesComplianceLevel.foreach(
        __v => __obj.update("ApprovedPatchesComplianceLevel", __v.asInstanceOf[js.Any])
      )
      ApprovedPatchesEnableNonSecurity.foreach(
        __v => __obj.update("ApprovedPatchesEnableNonSecurity", __v.asInstanceOf[js.Any])
      )
      BaselineId.foreach(__v => __obj.update("BaselineId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GlobalFilters.foreach(__v => __obj.update("GlobalFilters", __v.asInstanceOf[js.Any]))
      ModifiedDate.foreach(__v => __obj.update("ModifiedDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.update("OperatingSystem", __v.asInstanceOf[js.Any]))
      RejectedPatches.foreach(__v => __obj.update("RejectedPatches", __v.asInstanceOf[js.Any]))
      RejectedPatchesAction.foreach(__v => __obj.update("RejectedPatchesAction", __v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.update("Sources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePatchBaselineResult]
    }
  }

  /**
    * The request body of the UpdateServiceSetting API action.
    */
  @js.native
  trait UpdateServiceSettingRequest extends js.Object {
    var SettingId: ServiceSettingId
    var SettingValue: ServiceSettingValue
  }

  object UpdateServiceSettingRequest {
    def apply(
        SettingId: ServiceSettingId,
        SettingValue: ServiceSettingValue
    ): UpdateServiceSettingRequest = {
      val __obj = js.Dictionary[js.Any](
        "SettingId"    -> SettingId.asInstanceOf[js.Any],
        "SettingValue" -> SettingValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServiceSettingRequest]
    }
  }

  /**
    * The result body of the UpdateServiceSetting API action.
    */
  @js.native
  trait UpdateServiceSettingResult extends js.Object {}

  object UpdateServiceSettingResult {
    def apply(
        ): UpdateServiceSettingResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateServiceSettingResult]
    }
  }
}
