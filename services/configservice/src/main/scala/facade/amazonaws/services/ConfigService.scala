package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object configservice {
  type ARN                                      = String
  type AccountAggregationSourceAccountList      = js.Array[AccountId]
  type AccountAggregationSourceList             = js.Array[AccountAggregationSource]
  type AccountId                                = String
  type AggregateComplianceByConfigRuleList      = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList             = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList            = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList               = js.Array[AggregatedSourceStatus]
  type AggregatedSourceStatusType               = String
  type AggregatedSourceStatusTypeList           = js.Array[AggregatedSourceStatusType]
  type AggregatedSourceType                     = String
  type AggregationAuthorizationList             = js.Array[AggregationAuthorization]
  type AggregatorRegionList                     = js.Array[String]
  type AllSupported                             = Boolean
  type AmazonResourceName                       = String
  type AutoRemediationAttemptSeconds            = Double
  type AutoRemediationAttempts                  = Int
  type AvailabilityZone                         = String
  type AwsRegion                                = String
  type BaseConfigurationItems                   = js.Array[BaseConfigurationItem]
  type BaseResourceId                           = String
  type ChannelName                              = String
  type ChronologicalOrder                       = String
  type ComplianceByConfigRules                  = js.Array[ComplianceByConfigRule]
  type ComplianceByResources                    = js.Array[ComplianceByResource]
  type ComplianceResourceTypes                  = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType        = js.Array[ComplianceSummaryByResourceType]
  type ComplianceType                           = String
  type ComplianceTypes                          = js.Array[ComplianceType]
  type ConfigRuleComplianceSummaryGroupKey      = String
  type ConfigRuleEvaluationStatusList           = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName                           = String
  type ConfigRuleNames                          = js.Array[ConfigRuleName]
  type ConfigRuleState                          = String
  type ConfigRules                              = js.Array[ConfigRule]
  type Configuration                            = String
  type ConfigurationAggregatorArn               = String
  type ConfigurationAggregatorList              = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName              = String
  type ConfigurationAggregatorNameList          = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime             = js.Date
  type ConfigurationItemList                    = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash                 = String
  type ConfigurationItemStatus                  = String
  type ConfigurationRecorderList                = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList            = js.Array[RecorderName]
  type ConfigurationRecorderStatusList          = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId                     = String
  type CosmosPageLimit                          = Int
  type Date                                     = js.Date
  type DeliveryChannelList                      = js.Array[DeliveryChannel]
  type DeliveryChannelNameList                  = js.Array[ChannelName]
  type DeliveryChannelStatusList                = js.Array[DeliveryChannelStatus]
  type DeliveryStatus                           = String
  type DescribePendingAggregationRequestsLimit  = Int
  type DiscoveredResourceIdentifierList         = js.Array[AggregateResourceIdentifier]
  type EarlierTime                              = js.Date
  type EmptiableStringWithCharLimit256          = String
  type EvaluationResults                        = js.Array[EvaluationResult]
  type Evaluations                              = js.Array[Evaluation]
  type EventSource                              = String
  type ExcludedAccounts                         = js.Array[AccountId]
  type Expression                               = String
  type FailedDeleteRemediationExceptionsBatches = js.Array[FailedDeleteRemediationExceptionsBatch]
  type FailedRemediationBatches                 = js.Array[FailedRemediationBatch]
  type FailedRemediationExceptionBatches        = js.Array[FailedRemediationExceptionBatch]
  type FieldInfoList                            = js.Array[FieldInfo]
  type FieldName                                = String
  type GroupByAPILimit                          = Int
  type GroupedResourceCountList                 = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes               = Boolean
  type LaterTime                                = js.Date
  type Limit                                    = Int
  type MaximumExecutionFrequency                = String
  type MemberAccountRuleStatus                  = String
  type MessageType                              = String
  type Name                                     = String
  type NextToken                                = String
  type OrderingTimestamp                        = js.Date
  type OrganizationConfigRuleDetailedStatus     = js.Array[MemberAccountStatus]
  type OrganizationConfigRuleName               = String
  type OrganizationConfigRuleNames              = js.Array[StringWithCharLimit64]
  type OrganizationConfigRuleStatuses           = js.Array[OrganizationConfigRuleStatus]
  type OrganizationConfigRuleTriggerType        = String
  type OrganizationConfigRuleTriggerTypes       = js.Array[OrganizationConfigRuleTriggerType]
  type OrganizationConfigRules                  = js.Array[OrganizationConfigRule]
  type OrganizationRuleStatus                   = String
  type Owner                                    = String
  type PendingAggregationRequestList            = js.Array[PendingAggregationRequest]
  type Percentage                               = Int
  type RecorderName                             = String
  type RecorderStatus                           = String
  type ReevaluateConfigRuleNames                = js.Array[StringWithCharLimit64]
  type RelatedEvent                             = String
  type RelatedEventList                         = js.Array[RelatedEvent]
  type RelationshipList                         = js.Array[Relationship]
  type RelationshipName                         = String
  type RemediationConfigurations                = js.Array[RemediationConfiguration]
  type RemediationExceptionResourceKeys         = js.Array[RemediationExceptionResourceKey]
  type RemediationExceptions                    = js.Array[RemediationException]
  type RemediationExecutionState                = String
  type RemediationExecutionStatuses             = js.Array[RemediationExecutionStatus]
  type RemediationExecutionStepState            = String
  type RemediationExecutionSteps                = js.Array[RemediationExecutionStep]
  type RemediationParameters                    = js.Dictionary[RemediationParameterValue]
  type RemediationTargetType                    = String
  type ResourceCountGroupKey                    = String
  type ResourceCounts                           = js.Array[ResourceCount]
  type ResourceCreationTime                     = js.Date
  type ResourceDeletionTime                     = js.Date
  type ResourceId                               = String
  type ResourceIdList                           = js.Array[ResourceId]
  type ResourceIdentifierList                   = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList                  = js.Array[AggregateResourceIdentifier]
  type ResourceKeys                             = js.Array[ResourceKey]
  type ResourceName                             = String
  type ResourceType                             = String
  type ResourceTypeList                         = js.Array[ResourceType]
  type ResourceTypes                            = js.Array[StringWithCharLimit256]
  type ResourceTypesScope                       = js.Array[StringWithCharLimit256]
  type ResourceValueType                        = String
  type Results                                  = js.Array[String]
  type RetentionConfigurationList               = js.Array[RetentionConfiguration]
  type RetentionConfigurationName               = String
  type RetentionConfigurationNameList           = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays                    = Int
  type RuleLimit                                = Int
  type SourceDetails                            = js.Array[SourceDetail]
  type StaticParameterValues                    = js.Array[StringWithCharLimit256]
  type StringWithCharLimit1024                  = String
  type StringWithCharLimit128                   = String
  type StringWithCharLimit2048                  = String
  type StringWithCharLimit256                   = String
  type StringWithCharLimit256Min0               = String
  type StringWithCharLimit64                    = String
  type StringWithCharLimit768                   = String
  type SupplementaryConfiguration               = js.Dictionary[SupplementaryConfigurationValue]
  type SupplementaryConfigurationName           = String
  type SupplementaryConfigurationValue          = String
  type TagKey                                   = String
  type TagKeyList                               = js.Array[TagKey]
  type TagList                                  = js.Array[Tag]
  type TagValue                                 = String
  type Tags                                     = js.Dictionary[Value]
  type TagsList                                 = js.Array[Tag]
  type UnprocessedResourceIdentifierList        = js.Array[AggregateResourceIdentifier]
  type Value                                    = String
  type Version                                  = String

  implicit final class ConfigServiceOps(private val service: ConfigService) extends AnyVal {
    @inline def batchGetAggregateResourceConfigFuture(
        params: BatchGetAggregateResourceConfigRequest
    ): Future[BatchGetAggregateResourceConfigResponse] =
      service.batchGetAggregateResourceConfig(params).promise.toFuture
    @inline def batchGetResourceConfigFuture(
        params: BatchGetResourceConfigRequest
    ): Future[BatchGetResourceConfigResponse] = service.batchGetResourceConfig(params).promise.toFuture
    @inline def deleteAggregationAuthorizationFuture(params: DeleteAggregationAuthorizationRequest): Future[js.Object] =
      service.deleteAggregationAuthorization(params).promise.toFuture
    @inline def deleteConfigRuleFuture(params: DeleteConfigRuleRequest): Future[js.Object] =
      service.deleteConfigRule(params).promise.toFuture
    @inline def deleteConfigurationAggregatorFuture(params: DeleteConfigurationAggregatorRequest): Future[js.Object] =
      service.deleteConfigurationAggregator(params).promise.toFuture
    @inline def deleteConfigurationRecorderFuture(params: DeleteConfigurationRecorderRequest): Future[js.Object] =
      service.deleteConfigurationRecorder(params).promise.toFuture
    @inline def deleteDeliveryChannelFuture(params: DeleteDeliveryChannelRequest): Future[js.Object] =
      service.deleteDeliveryChannel(params).promise.toFuture
    @inline def deleteEvaluationResultsFuture(
        params: DeleteEvaluationResultsRequest
    ): Future[DeleteEvaluationResultsResponse] = service.deleteEvaluationResults(params).promise.toFuture
    @inline def deleteOrganizationConfigRuleFuture(params: DeleteOrganizationConfigRuleRequest): Future[js.Object] =
      service.deleteOrganizationConfigRule(params).promise.toFuture
    @inline def deletePendingAggregationRequestFuture(
        params: DeletePendingAggregationRequestRequest
    ): Future[js.Object] = service.deletePendingAggregationRequest(params).promise.toFuture
    @inline def deleteRemediationConfigurationFuture(
        params: DeleteRemediationConfigurationRequest
    ): Future[DeleteRemediationConfigurationResponse] = service.deleteRemediationConfiguration(params).promise.toFuture
    @inline def deleteRemediationExceptionsFuture(
        params: DeleteRemediationExceptionsRequest
    ): Future[DeleteRemediationExceptionsResponse] = service.deleteRemediationExceptions(params).promise.toFuture
    @inline def deleteRetentionConfigurationFuture(params: DeleteRetentionConfigurationRequest): Future[js.Object] =
      service.deleteRetentionConfiguration(params).promise.toFuture
    @inline def deliverConfigSnapshotFuture(
        params: DeliverConfigSnapshotRequest
    ): Future[DeliverConfigSnapshotResponse] = service.deliverConfigSnapshot(params).promise.toFuture
    @inline def describeAggregateComplianceByConfigRulesFuture(
        params: DescribeAggregateComplianceByConfigRulesRequest
    ): Future[DescribeAggregateComplianceByConfigRulesResponse] =
      service.describeAggregateComplianceByConfigRules(params).promise.toFuture
    @inline def describeAggregationAuthorizationsFuture(
        params: DescribeAggregationAuthorizationsRequest
    ): Future[DescribeAggregationAuthorizationsResponse] =
      service.describeAggregationAuthorizations(params).promise.toFuture
    @inline def describeComplianceByConfigRuleFuture(
        params: DescribeComplianceByConfigRuleRequest
    ): Future[DescribeComplianceByConfigRuleResponse] = service.describeComplianceByConfigRule(params).promise.toFuture
    @inline def describeComplianceByResourceFuture(
        params: DescribeComplianceByResourceRequest
    ): Future[DescribeComplianceByResourceResponse] = service.describeComplianceByResource(params).promise.toFuture
    @inline def describeConfigRuleEvaluationStatusFuture(
        params: DescribeConfigRuleEvaluationStatusRequest
    ): Future[DescribeConfigRuleEvaluationStatusResponse] =
      service.describeConfigRuleEvaluationStatus(params).promise.toFuture
    @inline def describeConfigRulesFuture(params: DescribeConfigRulesRequest): Future[DescribeConfigRulesResponse] =
      service.describeConfigRules(params).promise.toFuture
    @inline def describeConfigurationAggregatorSourcesStatusFuture(
        params: DescribeConfigurationAggregatorSourcesStatusRequest
    ): Future[DescribeConfigurationAggregatorSourcesStatusResponse] =
      service.describeConfigurationAggregatorSourcesStatus(params).promise.toFuture
    @inline def describeConfigurationAggregatorsFuture(
        params: DescribeConfigurationAggregatorsRequest
    ): Future[DescribeConfigurationAggregatorsResponse] =
      service.describeConfigurationAggregators(params).promise.toFuture
    @inline def describeConfigurationRecorderStatusFuture(
        params: DescribeConfigurationRecorderStatusRequest
    ): Future[DescribeConfigurationRecorderStatusResponse] =
      service.describeConfigurationRecorderStatus(params).promise.toFuture
    @inline def describeConfigurationRecordersFuture(
        params: DescribeConfigurationRecordersRequest
    ): Future[DescribeConfigurationRecordersResponse] = service.describeConfigurationRecorders(params).promise.toFuture
    @inline def describeDeliveryChannelStatusFuture(
        params: DescribeDeliveryChannelStatusRequest
    ): Future[DescribeDeliveryChannelStatusResponse] = service.describeDeliveryChannelStatus(params).promise.toFuture
    @inline def describeDeliveryChannelsFuture(
        params: DescribeDeliveryChannelsRequest
    ): Future[DescribeDeliveryChannelsResponse] = service.describeDeliveryChannels(params).promise.toFuture
    @inline def describeOrganizationConfigRuleStatusesFuture(
        params: DescribeOrganizationConfigRuleStatusesRequest
    ): Future[DescribeOrganizationConfigRuleStatusesResponse] =
      service.describeOrganizationConfigRuleStatuses(params).promise.toFuture
    @inline def describeOrganizationConfigRulesFuture(
        params: DescribeOrganizationConfigRulesRequest
    ): Future[DescribeOrganizationConfigRulesResponse] =
      service.describeOrganizationConfigRules(params).promise.toFuture
    @inline def describePendingAggregationRequestsFuture(
        params: DescribePendingAggregationRequestsRequest
    ): Future[DescribePendingAggregationRequestsResponse] =
      service.describePendingAggregationRequests(params).promise.toFuture
    @inline def describeRemediationConfigurationsFuture(
        params: DescribeRemediationConfigurationsRequest
    ): Future[DescribeRemediationConfigurationsResponse] =
      service.describeRemediationConfigurations(params).promise.toFuture
    @inline def describeRemediationExceptionsFuture(
        params: DescribeRemediationExceptionsRequest
    ): Future[DescribeRemediationExceptionsResponse] = service.describeRemediationExceptions(params).promise.toFuture
    @inline def describeRemediationExecutionStatusFuture(
        params: DescribeRemediationExecutionStatusRequest
    ): Future[DescribeRemediationExecutionStatusResponse] =
      service.describeRemediationExecutionStatus(params).promise.toFuture
    @inline def describeRetentionConfigurationsFuture(
        params: DescribeRetentionConfigurationsRequest
    ): Future[DescribeRetentionConfigurationsResponse] =
      service.describeRetentionConfigurations(params).promise.toFuture
    @inline def getAggregateComplianceDetailsByConfigRuleFuture(
        params: GetAggregateComplianceDetailsByConfigRuleRequest
    ): Future[GetAggregateComplianceDetailsByConfigRuleResponse] =
      service.getAggregateComplianceDetailsByConfigRule(params).promise.toFuture
    @inline def getAggregateConfigRuleComplianceSummaryFuture(
        params: GetAggregateConfigRuleComplianceSummaryRequest
    ): Future[GetAggregateConfigRuleComplianceSummaryResponse] =
      service.getAggregateConfigRuleComplianceSummary(params).promise.toFuture
    @inline def getAggregateDiscoveredResourceCountsFuture(
        params: GetAggregateDiscoveredResourceCountsRequest
    ): Future[GetAggregateDiscoveredResourceCountsResponse] =
      service.getAggregateDiscoveredResourceCounts(params).promise.toFuture
    @inline def getAggregateResourceConfigFuture(
        params: GetAggregateResourceConfigRequest
    ): Future[GetAggregateResourceConfigResponse] = service.getAggregateResourceConfig(params).promise.toFuture
    @inline def getComplianceDetailsByConfigRuleFuture(
        params: GetComplianceDetailsByConfigRuleRequest
    ): Future[GetComplianceDetailsByConfigRuleResponse] =
      service.getComplianceDetailsByConfigRule(params).promise.toFuture
    @inline def getComplianceDetailsByResourceFuture(
        params: GetComplianceDetailsByResourceRequest
    ): Future[GetComplianceDetailsByResourceResponse] = service.getComplianceDetailsByResource(params).promise.toFuture
    @inline def getComplianceSummaryByConfigRuleFuture(): Future[GetComplianceSummaryByConfigRuleResponse] =
      service.getComplianceSummaryByConfigRule().promise.toFuture
    @inline def getComplianceSummaryByResourceTypeFuture(
        params: GetComplianceSummaryByResourceTypeRequest
    ): Future[GetComplianceSummaryByResourceTypeResponse] =
      service.getComplianceSummaryByResourceType(params).promise.toFuture
    @inline def getDiscoveredResourceCountsFuture(
        params: GetDiscoveredResourceCountsRequest
    ): Future[GetDiscoveredResourceCountsResponse] = service.getDiscoveredResourceCounts(params).promise.toFuture
    @inline def getOrganizationConfigRuleDetailedStatusFuture(
        params: GetOrganizationConfigRuleDetailedStatusRequest
    ): Future[GetOrganizationConfigRuleDetailedStatusResponse] =
      service.getOrganizationConfigRuleDetailedStatus(params).promise.toFuture
    @inline def getResourceConfigHistoryFuture(
        params: GetResourceConfigHistoryRequest
    ): Future[GetResourceConfigHistoryResponse] = service.getResourceConfigHistory(params).promise.toFuture
    @inline def listAggregateDiscoveredResourcesFuture(
        params: ListAggregateDiscoveredResourcesRequest
    ): Future[ListAggregateDiscoveredResourcesResponse] =
      service.listAggregateDiscoveredResources(params).promise.toFuture
    @inline def listDiscoveredResourcesFuture(
        params: ListDiscoveredResourcesRequest
    ): Future[ListDiscoveredResourcesResponse] = service.listDiscoveredResources(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def putAggregationAuthorizationFuture(
        params: PutAggregationAuthorizationRequest
    ): Future[PutAggregationAuthorizationResponse] = service.putAggregationAuthorization(params).promise.toFuture
    @inline def putConfigRuleFuture(params: PutConfigRuleRequest): Future[js.Object] =
      service.putConfigRule(params).promise.toFuture
    @inline def putConfigurationAggregatorFuture(
        params: PutConfigurationAggregatorRequest
    ): Future[PutConfigurationAggregatorResponse] = service.putConfigurationAggregator(params).promise.toFuture
    @inline def putConfigurationRecorderFuture(params: PutConfigurationRecorderRequest): Future[js.Object] =
      service.putConfigurationRecorder(params).promise.toFuture
    @inline def putDeliveryChannelFuture(params: PutDeliveryChannelRequest): Future[js.Object] =
      service.putDeliveryChannel(params).promise.toFuture
    @inline def putEvaluationsFuture(params: PutEvaluationsRequest): Future[PutEvaluationsResponse] =
      service.putEvaluations(params).promise.toFuture
    @inline def putOrganizationConfigRuleFuture(
        params: PutOrganizationConfigRuleRequest
    ): Future[PutOrganizationConfigRuleResponse] = service.putOrganizationConfigRule(params).promise.toFuture
    @inline def putRemediationConfigurationsFuture(
        params: PutRemediationConfigurationsRequest
    ): Future[PutRemediationConfigurationsResponse] = service.putRemediationConfigurations(params).promise.toFuture
    @inline def putRemediationExceptionsFuture(
        params: PutRemediationExceptionsRequest
    ): Future[PutRemediationExceptionsResponse] = service.putRemediationExceptions(params).promise.toFuture
    @inline def putRetentionConfigurationFuture(
        params: PutRetentionConfigurationRequest
    ): Future[PutRetentionConfigurationResponse] = service.putRetentionConfiguration(params).promise.toFuture
    @inline def selectResourceConfigFuture(params: SelectResourceConfigRequest): Future[SelectResourceConfigResponse] =
      service.selectResourceConfig(params).promise.toFuture
    @inline def startConfigRulesEvaluationFuture(
        params: StartConfigRulesEvaluationRequest
    ): Future[StartConfigRulesEvaluationResponse] = service.startConfigRulesEvaluation(params).promise.toFuture
    @inline def startConfigurationRecorderFuture(params: StartConfigurationRecorderRequest): Future[js.Object] =
      service.startConfigurationRecorder(params).promise.toFuture
    @inline def startRemediationExecutionFuture(
        params: StartRemediationExecutionRequest
    ): Future[StartRemediationExecutionResponse] = service.startRemediationExecution(params).promise.toFuture
    @inline def stopConfigurationRecorderFuture(params: StopConfigurationRecorderRequest): Future[js.Object] =
      service.stopConfigurationRecorder(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
  }
}

package configservice {
  @js.native
  @JSImport("aws-sdk", "ConfigService")
  class ConfigService() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetAggregateResourceConfig(
        params: BatchGetAggregateResourceConfigRequest
    ): Request[BatchGetAggregateResourceConfigResponse] = js.native
    def batchGetResourceConfig(params: BatchGetResourceConfigRequest): Request[BatchGetResourceConfigResponse] =
      js.native
    def deleteAggregationAuthorization(params: DeleteAggregationAuthorizationRequest): Request[js.Object] = js.native
    def deleteConfigRule(params: DeleteConfigRuleRequest): Request[js.Object]                             = js.native
    def deleteConfigurationAggregator(params: DeleteConfigurationAggregatorRequest): Request[js.Object]   = js.native
    def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest): Request[js.Object]       = js.native
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object]                   = js.native
    def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): Request[DeleteEvaluationResultsResponse] =
      js.native
    def deleteOrganizationConfigRule(params: DeleteOrganizationConfigRuleRequest): Request[js.Object]       = js.native
    def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): Request[js.Object] = js.native
    def deleteRemediationConfiguration(
        params: DeleteRemediationConfigurationRequest
    ): Request[DeleteRemediationConfigurationResponse] = js.native
    def deleteRemediationExceptions(
        params: DeleteRemediationExceptionsRequest
    ): Request[DeleteRemediationExceptionsResponse]                                                         = js.native
    def deleteRetentionConfiguration(params: DeleteRetentionConfigurationRequest): Request[js.Object]       = js.native
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): Request[DeliverConfigSnapshotResponse] = js.native
    def describeAggregateComplianceByConfigRules(
        params: DescribeAggregateComplianceByConfigRulesRequest
    ): Request[DescribeAggregateComplianceByConfigRulesResponse] = js.native
    def describeAggregationAuthorizations(
        params: DescribeAggregationAuthorizationsRequest
    ): Request[DescribeAggregationAuthorizationsResponse] = js.native
    def describeComplianceByConfigRule(
        params: DescribeComplianceByConfigRuleRequest
    ): Request[DescribeComplianceByConfigRuleResponse] = js.native
    def describeComplianceByResource(
        params: DescribeComplianceByResourceRequest
    ): Request[DescribeComplianceByResourceResponse] = js.native
    def describeConfigRuleEvaluationStatus(
        params: DescribeConfigRuleEvaluationStatusRequest
    ): Request[DescribeConfigRuleEvaluationStatusResponse]                                            = js.native
    def describeConfigRules(params: DescribeConfigRulesRequest): Request[DescribeConfigRulesResponse] = js.native
    def describeConfigurationAggregatorSourcesStatus(
        params: DescribeConfigurationAggregatorSourcesStatusRequest
    ): Request[DescribeConfigurationAggregatorSourcesStatusResponse] = js.native
    def describeConfigurationAggregators(
        params: DescribeConfigurationAggregatorsRequest
    ): Request[DescribeConfigurationAggregatorsResponse] = js.native
    def describeConfigurationRecorderStatus(
        params: DescribeConfigurationRecorderStatusRequest
    ): Request[DescribeConfigurationRecorderStatusResponse] = js.native
    def describeConfigurationRecorders(
        params: DescribeConfigurationRecordersRequest
    ): Request[DescribeConfigurationRecordersResponse] = js.native
    def describeDeliveryChannelStatus(
        params: DescribeDeliveryChannelStatusRequest
    ): Request[DescribeDeliveryChannelStatusResponse] = js.native
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): Request[DescribeDeliveryChannelsResponse] =
      js.native
    def describeOrganizationConfigRuleStatuses(
        params: DescribeOrganizationConfigRuleStatusesRequest
    ): Request[DescribeOrganizationConfigRuleStatusesResponse] = js.native
    def describeOrganizationConfigRules(
        params: DescribeOrganizationConfigRulesRequest
    ): Request[DescribeOrganizationConfigRulesResponse] = js.native
    def describePendingAggregationRequests(
        params: DescribePendingAggregationRequestsRequest
    ): Request[DescribePendingAggregationRequestsResponse] = js.native
    def describeRemediationConfigurations(
        params: DescribeRemediationConfigurationsRequest
    ): Request[DescribeRemediationConfigurationsResponse] = js.native
    def describeRemediationExceptions(
        params: DescribeRemediationExceptionsRequest
    ): Request[DescribeRemediationExceptionsResponse] = js.native
    def describeRemediationExecutionStatus(
        params: DescribeRemediationExecutionStatusRequest
    ): Request[DescribeRemediationExecutionStatusResponse] = js.native
    def describeRetentionConfigurations(
        params: DescribeRetentionConfigurationsRequest
    ): Request[DescribeRetentionConfigurationsResponse] = js.native
    def getAggregateComplianceDetailsByConfigRule(
        params: GetAggregateComplianceDetailsByConfigRuleRequest
    ): Request[GetAggregateComplianceDetailsByConfigRuleResponse] = js.native
    def getAggregateConfigRuleComplianceSummary(
        params: GetAggregateConfigRuleComplianceSummaryRequest
    ): Request[GetAggregateConfigRuleComplianceSummaryResponse] = js.native
    def getAggregateDiscoveredResourceCounts(
        params: GetAggregateDiscoveredResourceCountsRequest
    ): Request[GetAggregateDiscoveredResourceCountsResponse] = js.native
    def getAggregateResourceConfig(
        params: GetAggregateResourceConfigRequest
    ): Request[GetAggregateResourceConfigResponse] = js.native
    def getComplianceDetailsByConfigRule(
        params: GetComplianceDetailsByConfigRuleRequest
    ): Request[GetComplianceDetailsByConfigRuleResponse] = js.native
    def getComplianceDetailsByResource(
        params: GetComplianceDetailsByResourceRequest
    ): Request[GetComplianceDetailsByResourceResponse]                                        = js.native
    def getComplianceSummaryByConfigRule(): Request[GetComplianceSummaryByConfigRuleResponse] = js.native
    def getComplianceSummaryByResourceType(
        params: GetComplianceSummaryByResourceTypeRequest
    ): Request[GetComplianceSummaryByResourceTypeResponse] = js.native
    def getDiscoveredResourceCounts(
        params: GetDiscoveredResourceCountsRequest
    ): Request[GetDiscoveredResourceCountsResponse] = js.native
    def getOrganizationConfigRuleDetailedStatus(
        params: GetOrganizationConfigRuleDetailedStatusRequest
    ): Request[GetOrganizationConfigRuleDetailedStatusResponse] = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse] =
      js.native
    def listAggregateDiscoveredResources(
        params: ListAggregateDiscoveredResourcesRequest
    ): Request[ListAggregateDiscoveredResourcesResponse] = js.native
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResponse] =
      js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putAggregationAuthorization(
        params: PutAggregationAuthorizationRequest
    ): Request[PutAggregationAuthorizationResponse]                     = js.native
    def putConfigRule(params: PutConfigRuleRequest): Request[js.Object] = js.native
    def putConfigurationAggregator(
        params: PutConfigurationAggregatorRequest
    ): Request[PutConfigurationAggregatorResponse]                                            = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object] = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object]             = js.native
    def putEvaluations(params: PutEvaluationsRequest): Request[PutEvaluationsResponse]        = js.native
    def putOrganizationConfigRule(
        params: PutOrganizationConfigRuleRequest
    ): Request[PutOrganizationConfigRuleResponse] = js.native
    def putRemediationConfigurations(
        params: PutRemediationConfigurationsRequest
    ): Request[PutRemediationConfigurationsResponse] = js.native
    def putRemediationExceptions(params: PutRemediationExceptionsRequest): Request[PutRemediationExceptionsResponse] =
      js.native
    def putRetentionConfiguration(
        params: PutRetentionConfigurationRequest
    ): Request[PutRetentionConfigurationResponse]                                                        = js.native
    def selectResourceConfig(params: SelectResourceConfigRequest): Request[SelectResourceConfigResponse] = js.native
    def startConfigRulesEvaluation(
        params: StartConfigRulesEvaluationRequest
    ): Request[StartConfigRulesEvaluationResponse]                                                = js.native
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest): Request[js.Object] = js.native
    def startRemediationExecution(
        params: StartRemediationExecutionRequest
    ): Request[StartRemediationExecutionResponse]                                               = js.native
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                             = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                         = js.native
  }

  /**
    * A collection of accounts and regions.
    */
  @js.native
  trait AccountAggregationSource extends js.Object {
    var AccountIds: AccountAggregationSourceAccountList
    var AllAwsRegions: js.UndefOr[Boolean]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
  }

  object AccountAggregationSource {
    @inline
    def apply(
        AccountIds: AccountAggregationSourceAccountList,
        AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
        AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
    ): AccountAggregationSource = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      AllAwsRegions.foreach(__v => __obj.updateDynamic("AllAwsRegions")(__v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.updateDynamic("AwsRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAggregationSource]
    }
  }

  /**
    * Indicates whether an AWS Config rule is compliant based on account ID, region, compliance, and rule name.
    *  A rule is compliant if all of the resources that the rule evaluated comply with it. It is noncompliant if any of these resources do not comply.
    */
  @js.native
  trait AggregateComplianceByConfigRule extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
    var Compliance: js.UndefOr[Compliance]
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
  }

  object AggregateComplianceByConfigRule {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        Compliance: js.UndefOr[Compliance] = js.undefined,
        ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
    ): AggregateComplianceByConfigRule = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      Compliance.foreach(__v => __obj.updateDynamic("Compliance")(__v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.updateDynamic("ConfigRuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregateComplianceByConfigRule]
    }
  }

  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
    */
  @js.native
  trait AggregateComplianceCount extends js.Object {
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
    var GroupName: js.UndefOr[StringWithCharLimit256]
  }

  object AggregateComplianceCount {
    @inline
    def apply(
        ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined,
        GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): AggregateComplianceCount = {
      val __obj = js.Dynamic.literal()
      ComplianceSummary.foreach(__v => __obj.updateDynamic("ComplianceSummary")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregateComplianceCount]
    }
  }

  /**
    * The details of an AWS Config evaluation for an account ID and region in an aggregator. Provides the AWS resource that was evaluated, the compliance of the resource, related time stamps, and supplementary information.
    */
  @js.native
  trait AggregateEvaluationResult extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var AwsRegion: js.UndefOr[AwsRegion]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigRuleInvokedTime: js.UndefOr[Date]
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier]
    var ResultRecordedTime: js.UndefOr[Date]
  }

  object AggregateEvaluationResult {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
        EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
        ResultRecordedTime: js.UndefOr[Date] = js.undefined
    ): AggregateEvaluationResult = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Annotation.foreach(__v => __obj.updateDynamic("Annotation")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      ConfigRuleInvokedTime.foreach(__v => __obj.updateDynamic("ConfigRuleInvokedTime")(__v.asInstanceOf[js.Any]))
      EvaluationResultIdentifier.foreach(
        __v => __obj.updateDynamic("EvaluationResultIdentifier")(__v.asInstanceOf[js.Any])
      )
      ResultRecordedTime.foreach(__v => __obj.updateDynamic("ResultRecordedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregateEvaluationResult]
    }
  }

  /**
    * The details that identify a resource that is collected by AWS Config aggregator, including the resource type, ID, (if available) the custom resource name, the source account, and source region.
    */
  @js.native
  trait AggregateResourceIdentifier extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceType
    var SourceAccountId: AccountId
    var SourceRegion: AwsRegion
    var ResourceName: js.UndefOr[ResourceName]
  }

  object AggregateResourceIdentifier {
    @inline
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceType,
        SourceAccountId: AccountId,
        SourceRegion: AwsRegion,
        ResourceName: js.UndefOr[ResourceName] = js.undefined
    ): AggregateResourceIdentifier = {
      val __obj = js.Dynamic.literal(
        "ResourceId"      -> ResourceId.asInstanceOf[js.Any],
        "ResourceType"    -> ResourceType.asInstanceOf[js.Any],
        "SourceAccountId" -> SourceAccountId.asInstanceOf[js.Any],
        "SourceRegion"    -> SourceRegion.asInstanceOf[js.Any]
      )

      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregateResourceIdentifier]
    }
  }

  /**
    * The current sync status between the source and the aggregator account.
    */
  @js.native
  trait AggregatedSourceStatus extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var LastErrorCode: js.UndefOr[String]
    var LastErrorMessage: js.UndefOr[String]
    var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType]
    var LastUpdateTime: js.UndefOr[Date]
    var SourceId: js.UndefOr[String]
    var SourceType: js.UndefOr[AggregatedSourceType]
  }

  object AggregatedSourceStatus {
    @inline
    def apply(
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        LastErrorCode: js.UndefOr[String] = js.undefined,
        LastErrorMessage: js.UndefOr[String] = js.undefined,
        LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.undefined,
        LastUpdateTime: js.UndefOr[Date] = js.undefined,
        SourceId: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[AggregatedSourceType] = js.undefined
    ): AggregatedSourceStatus = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      LastErrorCode.foreach(__v => __obj.updateDynamic("LastErrorCode")(__v.asInstanceOf[js.Any]))
      LastErrorMessage.foreach(__v => __obj.updateDynamic("LastErrorMessage")(__v.asInstanceOf[js.Any]))
      LastUpdateStatus.foreach(__v => __obj.updateDynamic("LastUpdateStatus")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregatedSourceStatus]
    }
  }

  object AggregatedSourceStatusTypeEnum {
    val FAILED    = "FAILED"
    val SUCCEEDED = "SUCCEEDED"
    val OUTDATED  = "OUTDATED"

    val values = js.Object.freeze(js.Array(FAILED, SUCCEEDED, OUTDATED))
  }

  object AggregatedSourceTypeEnum {
    val ACCOUNT      = "ACCOUNT"
    val ORGANIZATION = "ORGANIZATION"

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATION))
  }

  /**
    * An object that represents the authorizations granted to aggregator accounts and regions.
    */
  @js.native
  trait AggregationAuthorization extends js.Object {
    var AggregationAuthorizationArn: js.UndefOr[String]
    var AuthorizedAccountId: js.UndefOr[AccountId]
    var AuthorizedAwsRegion: js.UndefOr[AwsRegion]
    var CreationTime: js.UndefOr[Date]
  }

  object AggregationAuthorization {
    @inline
    def apply(
        AggregationAuthorizationArn: js.UndefOr[String] = js.undefined,
        AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined,
        AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined
    ): AggregationAuthorization = {
      val __obj = js.Dynamic.literal()
      AggregationAuthorizationArn.foreach(
        __v => __obj.updateDynamic("AggregationAuthorizationArn")(__v.asInstanceOf[js.Any])
      )
      AuthorizedAccountId.foreach(__v => __obj.updateDynamic("AuthorizedAccountId")(__v.asInstanceOf[js.Any]))
      AuthorizedAwsRegion.foreach(__v => __obj.updateDynamic("AuthorizedAwsRegion")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregationAuthorization]
    }
  }

  /**
    * The detailed configuration of a specified resource.
    */
  @js.native
  trait BaseConfigurationItem extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var arn: js.UndefOr[ARN]
    var availabilityZone: js.UndefOr[AvailabilityZone]
    var awsRegion: js.UndefOr[AwsRegion]
    var configuration: js.UndefOr[Configuration]
    var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime]
    var configurationItemStatus: js.UndefOr[ConfigurationItemStatus]
    var configurationStateId: js.UndefOr[ConfigurationStateId]
    var resourceCreationTime: js.UndefOr[ResourceCreationTime]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration]
    var version: js.UndefOr[Version]
  }

  object BaseConfigurationItem {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        arn: js.UndefOr[ARN] = js.undefined,
        availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        awsRegion: js.UndefOr[AwsRegion] = js.undefined,
        configuration: js.UndefOr[Configuration] = js.undefined,
        configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined,
        configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined,
        configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined,
        resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined,
        resourceId: js.UndefOr[ResourceId] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): BaseConfigurationItem = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      awsRegion.foreach(__v => __obj.updateDynamic("awsRegion")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      configurationItemCaptureTime.foreach(
        __v => __obj.updateDynamic("configurationItemCaptureTime")(__v.asInstanceOf[js.Any])
      )
      configurationItemStatus.foreach(__v => __obj.updateDynamic("configurationItemStatus")(__v.asInstanceOf[js.Any]))
      configurationStateId.foreach(__v => __obj.updateDynamic("configurationStateId")(__v.asInstanceOf[js.Any]))
      resourceCreationTime.foreach(__v => __obj.updateDynamic("resourceCreationTime")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      supplementaryConfiguration.foreach(
        __v => __obj.updateDynamic("supplementaryConfiguration")(__v.asInstanceOf[js.Any])
      )
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaseConfigurationItem]
    }
  }

  @js.native
  trait BatchGetAggregateResourceConfigRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceIdentifiers: ResourceIdentifiersList
  }

  object BatchGetAggregateResourceConfigRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ResourceIdentifiers: ResourceIdentifiersList
    ): BatchGetAggregateResourceConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceIdentifiers"         -> ResourceIdentifiers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetAggregateResourceConfigRequest]
    }
  }

  @js.native
  trait BatchGetAggregateResourceConfigResponse extends js.Object {
    var BaseConfigurationItems: js.UndefOr[BaseConfigurationItems]
    var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList]
  }

  object BatchGetAggregateResourceConfigResponse {
    @inline
    def apply(
        BaseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined,
        UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.undefined
    ): BatchGetAggregateResourceConfigResponse = {
      val __obj = js.Dynamic.literal()
      BaseConfigurationItems.foreach(__v => __obj.updateDynamic("BaseConfigurationItems")(__v.asInstanceOf[js.Any]))
      UnprocessedResourceIdentifiers.foreach(
        __v => __obj.updateDynamic("UnprocessedResourceIdentifiers")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
    }
  }

  @js.native
  trait BatchGetResourceConfigRequest extends js.Object {
    var resourceKeys: ResourceKeys
  }

  object BatchGetResourceConfigRequest {
    @inline
    def apply(
        resourceKeys: ResourceKeys
    ): BatchGetResourceConfigRequest = {
      val __obj = js.Dynamic.literal(
        "resourceKeys" -> resourceKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetResourceConfigRequest]
    }
  }

  @js.native
  trait BatchGetResourceConfigResponse extends js.Object {
    var baseConfigurationItems: js.UndefOr[BaseConfigurationItems]
    var unprocessedResourceKeys: js.UndefOr[ResourceKeys]
  }

  object BatchGetResourceConfigResponse {
    @inline
    def apply(
        baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined,
        unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
    ): BatchGetResourceConfigResponse = {
      val __obj = js.Dynamic.literal()
      baseConfigurationItems.foreach(__v => __obj.updateDynamic("baseConfigurationItems")(__v.asInstanceOf[js.Any]))
      unprocessedResourceKeys.foreach(__v => __obj.updateDynamic("unprocessedResourceKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetResourceConfigResponse]
    }
  }

  object ChronologicalOrderEnum {
    val Reverse = "Reverse"
    val Forward = "Forward"

    val values = js.Object.freeze(js.Array(Reverse, Forward))
  }

  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  @js.native
  trait Compliance extends js.Object {
    var ComplianceContributorCount: js.UndefOr[ComplianceContributorCount]
    var ComplianceType: js.UndefOr[ComplianceType]
  }

  object Compliance {
    @inline
    def apply(
        ComplianceContributorCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined
    ): Compliance = {
      val __obj = js.Dynamic.literal()
      ComplianceContributorCount.foreach(
        __v => __obj.updateDynamic("ComplianceContributorCount")(__v.asInstanceOf[js.Any])
      )
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Compliance]
    }
  }

  /**
    * Indicates whether an AWS Config rule is compliant. A rule is compliant if all of the resources that the rule evaluated comply with it. A rule is noncompliant if any of these resources do not comply.
    */
  @js.native
  trait ComplianceByConfigRule extends js.Object {
    var Compliance: js.UndefOr[Compliance]
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
  }

  object ComplianceByConfigRule {
    @inline
    def apply(
        Compliance: js.UndefOr[Compliance] = js.undefined,
        ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    ): ComplianceByConfigRule = {
      val __obj = js.Dynamic.literal()
      Compliance.foreach(__v => __obj.updateDynamic("Compliance")(__v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.updateDynamic("ConfigRuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceByConfigRule]
    }
  }

  /**
    * Indicates whether an AWS resource that is evaluated according to one or more AWS Config rules is compliant. A resource is compliant if it complies with all of the rules that evaluate it. A resource is noncompliant if it does not comply with one or more of these rules.
    */
  @js.native
  trait ComplianceByResource extends js.Object {
    var Compliance: js.UndefOr[Compliance]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  object ComplianceByResource {
    @inline
    def apply(
        Compliance: js.UndefOr[Compliance] = js.undefined,
        ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): ComplianceByResource = {
      val __obj = js.Dynamic.literal()
      Compliance.foreach(__v => __obj.updateDynamic("Compliance")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceByResource]
    }
  }

  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item, up to a maximum number.
    */
  @js.native
  trait ComplianceContributorCount extends js.Object {
    var CapExceeded: js.UndefOr[Boolean]
    var CappedCount: js.UndefOr[Int]
  }

  object ComplianceContributorCount {
    @inline
    def apply(
        CapExceeded: js.UndefOr[Boolean] = js.undefined,
        CappedCount: js.UndefOr[Int] = js.undefined
    ): ComplianceContributorCount = {
      val __obj = js.Dynamic.literal()
      CapExceeded.foreach(__v => __obj.updateDynamic("CapExceeded")(__v.asInstanceOf[js.Any]))
      CappedCount.foreach(__v => __obj.updateDynamic("CappedCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceContributorCount]
    }
  }

  /**
    * The number of AWS Config rules or AWS resources that are compliant and noncompliant.
    */
  @js.native
  trait ComplianceSummary extends js.Object {
    var ComplianceSummaryTimestamp: js.UndefOr[Date]
    var CompliantResourceCount: js.UndefOr[ComplianceContributorCount]
    var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount]
  }

  object ComplianceSummary {
    @inline
    def apply(
        ComplianceSummaryTimestamp: js.UndefOr[Date] = js.undefined,
        CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
        NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined
    ): ComplianceSummary = {
      val __obj = js.Dynamic.literal()
      ComplianceSummaryTimestamp.foreach(
        __v => __obj.updateDynamic("ComplianceSummaryTimestamp")(__v.asInstanceOf[js.Any])
      )
      CompliantResourceCount.foreach(__v => __obj.updateDynamic("CompliantResourceCount")(__v.asInstanceOf[js.Any]))
      NonCompliantResourceCount.foreach(
        __v => __obj.updateDynamic("NonCompliantResourceCount")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ComplianceSummary]
    }
  }

  /**
    * The number of AWS resources of a specific type that are compliant or noncompliant, up to a maximum of 100 for each.
    */
  @js.native
  trait ComplianceSummaryByResourceType extends js.Object {
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  object ComplianceSummaryByResourceType {
    @inline
    def apply(
        ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): ComplianceSummaryByResourceType = {
      val __obj = js.Dynamic.literal()
      ComplianceSummary.foreach(__v => __obj.updateDynamic("ComplianceSummary")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceSummaryByResourceType]
    }
  }

  object ComplianceTypeEnum {
    val COMPLIANT         = "COMPLIANT"
    val NON_COMPLIANT     = "NON_COMPLIANT"
    val NOT_APPLICABLE    = "NOT_APPLICABLE"
    val INSUFFICIENT_DATA = "INSUFFICIENT_DATA"

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA))
  }

  /**
    * Provides status of the delivery of the snapshot or the configuration history to the specified Amazon S3 bucket. Also provides the status of notifications about the Amazon S3 delivery to the specified Amazon SNS topic.
    */
  @js.native
  trait ConfigExportDeliveryInfo extends js.Object {
    var lastAttemptTime: js.UndefOr[Date]
    var lastErrorCode: js.UndefOr[String]
    var lastErrorMessage: js.UndefOr[String]
    var lastStatus: js.UndefOr[DeliveryStatus]
    var lastSuccessfulTime: js.UndefOr[Date]
    var nextDeliveryTime: js.UndefOr[Date]
  }

  object ConfigExportDeliveryInfo {
    @inline
    def apply(
        lastAttemptTime: js.UndefOr[Date] = js.undefined,
        lastErrorCode: js.UndefOr[String] = js.undefined,
        lastErrorMessage: js.UndefOr[String] = js.undefined,
        lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        lastSuccessfulTime: js.UndefOr[Date] = js.undefined,
        nextDeliveryTime: js.UndefOr[Date] = js.undefined
    ): ConfigExportDeliveryInfo = {
      val __obj = js.Dynamic.literal()
      lastAttemptTime.foreach(__v => __obj.updateDynamic("lastAttemptTime")(__v.asInstanceOf[js.Any]))
      lastErrorCode.foreach(__v => __obj.updateDynamic("lastErrorCode")(__v.asInstanceOf[js.Any]))
      lastErrorMessage.foreach(__v => __obj.updateDynamic("lastErrorMessage")(__v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.updateDynamic("lastStatus")(__v.asInstanceOf[js.Any]))
      lastSuccessfulTime.foreach(__v => __obj.updateDynamic("lastSuccessfulTime")(__v.asInstanceOf[js.Any]))
      nextDeliveryTime.foreach(__v => __obj.updateDynamic("nextDeliveryTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigExportDeliveryInfo]
    }
  }

  /**
    * An AWS Config rule represents an AWS Lambda function that you create for a custom rule or a predefined function for an AWS managed rule. The function evaluates configuration items to assess whether your AWS resources comply with your desired configurations. This function can run when AWS Config detects a configuration change to an AWS resource and at a periodic frequency that you choose (for example, every 24 hours).
    *
    * '''Note:'''You can use the AWS CLI and AWS SDKs if you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot. For more information, see <a>ConfigSnapshotDeliveryProperties</a>.
    * For more information about developing and using AWS Config rules, see [[https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html|Evaluating AWS Resource Configurations with AWS Config]] in the <i>AWS Config Developer Guide</i>.
    */
  @js.native
  trait ConfigRule extends js.Object {
    var Source: Source
    var ConfigRuleArn: js.UndefOr[String]
    var ConfigRuleId: js.UndefOr[String]
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var ConfigRuleState: js.UndefOr[ConfigRuleState]
    var CreatedBy: js.UndefOr[StringWithCharLimit256]
    var Description: js.UndefOr[EmptiableStringWithCharLimit256]
    var InputParameters: js.UndefOr[StringWithCharLimit1024]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
    var Scope: js.UndefOr[Scope]
  }

  object ConfigRule {
    @inline
    def apply(
        Source: Source,
        ConfigRuleArn: js.UndefOr[String] = js.undefined,
        ConfigRuleId: js.UndefOr[String] = js.undefined,
        ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
        ConfigRuleState: js.UndefOr[ConfigRuleState] = js.undefined,
        CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined,
        Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.undefined,
        InputParameters: js.UndefOr[StringWithCharLimit1024] = js.undefined,
        MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
        Scope: js.UndefOr[Scope] = js.undefined
    ): ConfigRule = {
      val __obj = js.Dynamic.literal(
        "Source" -> Source.asInstanceOf[js.Any]
      )

      ConfigRuleArn.foreach(__v => __obj.updateDynamic("ConfigRuleArn")(__v.asInstanceOf[js.Any]))
      ConfigRuleId.foreach(__v => __obj.updateDynamic("ConfigRuleId")(__v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.updateDynamic("ConfigRuleName")(__v.asInstanceOf[js.Any]))
      ConfigRuleState.foreach(__v => __obj.updateDynamic("ConfigRuleState")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InputParameters.foreach(__v => __obj.updateDynamic("InputParameters")(__v.asInstanceOf[js.Any]))
      MaximumExecutionFrequency.foreach(
        __v => __obj.updateDynamic("MaximumExecutionFrequency")(__v.asInstanceOf[js.Any])
      )
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigRule]
    }
  }

  /**
    * Filters the compliance results based on account ID, region, compliance type, and rule name.
    */
  @js.native
  trait ConfigRuleComplianceFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
  }

  object ConfigRuleComplianceFilters {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
    ): ConfigRuleComplianceFilters = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.updateDynamic("ConfigRuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigRuleComplianceFilters]
    }
  }

  /**
    * Filters the results based on the account IDs and regions.
    */
  @js.native
  trait ConfigRuleComplianceSummaryFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
  }

  object ConfigRuleComplianceSummaryFilters {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined
    ): ConfigRuleComplianceSummaryFilters = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
    }
  }

  object ConfigRuleComplianceSummaryGroupKeyEnum {
    val ACCOUNT_ID = "ACCOUNT_ID"
    val AWS_REGION = "AWS_REGION"

    val values = js.Object.freeze(js.Array(ACCOUNT_ID, AWS_REGION))
  }

  /**
    * Status information for your AWS managed Config rules. The status includes information such as the last time the rule ran, the last time it failed, and the related error for the last failure.
    *  This action does not return status information about custom AWS Config rules.
    */
  @js.native
  trait ConfigRuleEvaluationStatus extends js.Object {
    var ConfigRuleArn: js.UndefOr[String]
    var ConfigRuleId: js.UndefOr[String]
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var FirstActivatedTime: js.UndefOr[Date]
    var FirstEvaluationStarted: js.UndefOr[Boolean]
    var LastErrorCode: js.UndefOr[String]
    var LastErrorMessage: js.UndefOr[String]
    var LastFailedEvaluationTime: js.UndefOr[Date]
    var LastFailedInvocationTime: js.UndefOr[Date]
    var LastSuccessfulEvaluationTime: js.UndefOr[Date]
    var LastSuccessfulInvocationTime: js.UndefOr[Date]
  }

  object ConfigRuleEvaluationStatus {
    @inline
    def apply(
        ConfigRuleArn: js.UndefOr[String] = js.undefined,
        ConfigRuleId: js.UndefOr[String] = js.undefined,
        ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
        FirstActivatedTime: js.UndefOr[Date] = js.undefined,
        FirstEvaluationStarted: js.UndefOr[Boolean] = js.undefined,
        LastErrorCode: js.UndefOr[String] = js.undefined,
        LastErrorMessage: js.UndefOr[String] = js.undefined,
        LastFailedEvaluationTime: js.UndefOr[Date] = js.undefined,
        LastFailedInvocationTime: js.UndefOr[Date] = js.undefined,
        LastSuccessfulEvaluationTime: js.UndefOr[Date] = js.undefined,
        LastSuccessfulInvocationTime: js.UndefOr[Date] = js.undefined
    ): ConfigRuleEvaluationStatus = {
      val __obj = js.Dynamic.literal()
      ConfigRuleArn.foreach(__v => __obj.updateDynamic("ConfigRuleArn")(__v.asInstanceOf[js.Any]))
      ConfigRuleId.foreach(__v => __obj.updateDynamic("ConfigRuleId")(__v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.updateDynamic("ConfigRuleName")(__v.asInstanceOf[js.Any]))
      FirstActivatedTime.foreach(__v => __obj.updateDynamic("FirstActivatedTime")(__v.asInstanceOf[js.Any]))
      FirstEvaluationStarted.foreach(__v => __obj.updateDynamic("FirstEvaluationStarted")(__v.asInstanceOf[js.Any]))
      LastErrorCode.foreach(__v => __obj.updateDynamic("LastErrorCode")(__v.asInstanceOf[js.Any]))
      LastErrorMessage.foreach(__v => __obj.updateDynamic("LastErrorMessage")(__v.asInstanceOf[js.Any]))
      LastFailedEvaluationTime.foreach(__v => __obj.updateDynamic("LastFailedEvaluationTime")(__v.asInstanceOf[js.Any]))
      LastFailedInvocationTime.foreach(__v => __obj.updateDynamic("LastFailedInvocationTime")(__v.asInstanceOf[js.Any]))
      LastSuccessfulEvaluationTime.foreach(
        __v => __obj.updateDynamic("LastSuccessfulEvaluationTime")(__v.asInstanceOf[js.Any])
      )
      LastSuccessfulInvocationTime.foreach(
        __v => __obj.updateDynamic("LastSuccessfulInvocationTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ConfigRuleEvaluationStatus]
    }
  }

  object ConfigRuleStateEnum {
    val ACTIVE           = "ACTIVE"
    val DELETING         = "DELETING"
    val DELETING_RESULTS = "DELETING_RESULTS"
    val EVALUATING       = "EVALUATING"

    val values = js.Object.freeze(js.Array(ACTIVE, DELETING, DELETING_RESULTS, EVALUATING))
  }

  /**
    * Provides options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket in your delivery channel.
    *  The frequency for a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot is set by one of two values, depending on which is less frequent:
    * * The value for the <code>deliveryFrequency</code> parameter within the delivery channel configuration, which sets how often AWS Config delivers configuration snapshots. This value also sets how often AWS Config invokes evaluations for AWS Config rules.
    *  * The value for the <code>MaximumExecutionFrequency</code> parameter, which sets the maximum frequency with which AWS Config invokes evaluations for the rule. For more information, see <a>ConfigRule</a>.
    * If the <code>deliveryFrequency</code> value is less frequent than the <code>MaximumExecutionFrequency</code> value for a rule, AWS Config invokes the rule only as often as the <code>deliveryFrequency</code> value.
    *  <ol> * For example, you want your rule to run evaluations when AWS Config delivers the configuration snapshot.
    *  * You specify the <code>MaximumExecutionFrequency</code> value for <code>Six_Hours</code>.
    *  * You then specify the delivery channel <code>deliveryFrequency</code> value for <code>TwentyFour_Hours</code>.
    *  * Because the value for <code>deliveryFrequency</code> is less frequent than <code>MaximumExecutionFrequency</code>, AWS Config invokes evaluations for the rule every 24 hours.
    *  </ol> You should set the <code>MaximumExecutionFrequency</code> value to be at least as frequent as the <code>deliveryFrequency</code> value. You can view the <code>deliveryFrequency</code> value by using the <code>DescribeDeliveryChannnels</code> action.
    *  To update the <code>deliveryFrequency</code> with which AWS Config delivers your configuration snapshots, use the <code>PutDeliveryChannel</code> action.
    */
  @js.native
  trait ConfigSnapshotDeliveryProperties extends js.Object {
    var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency]
  }

  object ConfigSnapshotDeliveryProperties {
    @inline
    def apply(
        deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
    ): ConfigSnapshotDeliveryProperties = {
      val __obj = js.Dynamic.literal()
      deliveryFrequency.foreach(__v => __obj.updateDynamic("deliveryFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
    }
  }

  /**
    * A list that contains the status of the delivery of the configuration stream notification to the Amazon SNS topic.
    */
  @js.native
  trait ConfigStreamDeliveryInfo extends js.Object {
    var lastErrorCode: js.UndefOr[String]
    var lastErrorMessage: js.UndefOr[String]
    var lastStatus: js.UndefOr[DeliveryStatus]
    var lastStatusChangeTime: js.UndefOr[Date]
  }

  object ConfigStreamDeliveryInfo {
    @inline
    def apply(
        lastErrorCode: js.UndefOr[String] = js.undefined,
        lastErrorMessage: js.UndefOr[String] = js.undefined,
        lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        lastStatusChangeTime: js.UndefOr[Date] = js.undefined
    ): ConfigStreamDeliveryInfo = {
      val __obj = js.Dynamic.literal()
      lastErrorCode.foreach(__v => __obj.updateDynamic("lastErrorCode")(__v.asInstanceOf[js.Any]))
      lastErrorMessage.foreach(__v => __obj.updateDynamic("lastErrorMessage")(__v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.updateDynamic("lastStatus")(__v.asInstanceOf[js.Any]))
      lastStatusChangeTime.foreach(__v => __obj.updateDynamic("lastStatusChangeTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigStreamDeliveryInfo]
    }
  }

  /**
    * The details about the configuration aggregator, including information about source accounts, regions, and metadata of the aggregator.
    */
  @js.native
  trait ConfigurationAggregator extends js.Object {
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn]
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var CreationTime: js.UndefOr[Date]
    var LastUpdatedTime: js.UndefOr[Date]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
  }

  object ConfigurationAggregator {
    @inline
    def apply(
        AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined,
        ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn] = js.undefined,
        ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined
    ): ConfigurationAggregator = {
      val __obj = js.Dynamic.literal()
      AccountAggregationSources.foreach(
        __v => __obj.updateDynamic("AccountAggregationSources")(__v.asInstanceOf[js.Any])
      )
      ConfigurationAggregatorArn.foreach(
        __v => __obj.updateDynamic("ConfigurationAggregatorArn")(__v.asInstanceOf[js.Any])
      )
      ConfigurationAggregatorName.foreach(
        __v => __obj.updateDynamic("ConfigurationAggregatorName")(__v.asInstanceOf[js.Any])
      )
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      OrganizationAggregationSource.foreach(
        __v => __obj.updateDynamic("OrganizationAggregationSource")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ConfigurationAggregator]
    }
  }

  /**
    * A list that contains detailed configurations of a specified resource.
    */
  @js.native
  trait ConfigurationItem extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var arn: js.UndefOr[ARN]
    var availabilityZone: js.UndefOr[AvailabilityZone]
    var awsRegion: js.UndefOr[AwsRegion]
    var configuration: js.UndefOr[Configuration]
    var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime]
    var configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash]
    var configurationItemStatus: js.UndefOr[ConfigurationItemStatus]
    var configurationStateId: js.UndefOr[ConfigurationStateId]
    var relatedEvents: js.UndefOr[RelatedEventList]
    var relationships: js.UndefOr[RelationshipList]
    var resourceCreationTime: js.UndefOr[ResourceCreationTime]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration]
    var tags: js.UndefOr[Tags]
    var version: js.UndefOr[Version]
  }

  object ConfigurationItem {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        arn: js.UndefOr[ARN] = js.undefined,
        availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        awsRegion: js.UndefOr[AwsRegion] = js.undefined,
        configuration: js.UndefOr[Configuration] = js.undefined,
        configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined,
        configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.undefined,
        configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined,
        configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined,
        relatedEvents: js.UndefOr[RelatedEventList] = js.undefined,
        relationships: js.UndefOr[RelationshipList] = js.undefined,
        resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined,
        resourceId: js.UndefOr[ResourceId] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): ConfigurationItem = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      awsRegion.foreach(__v => __obj.updateDynamic("awsRegion")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      configurationItemCaptureTime.foreach(
        __v => __obj.updateDynamic("configurationItemCaptureTime")(__v.asInstanceOf[js.Any])
      )
      configurationItemMD5Hash.foreach(__v => __obj.updateDynamic("configurationItemMD5Hash")(__v.asInstanceOf[js.Any]))
      configurationItemStatus.foreach(__v => __obj.updateDynamic("configurationItemStatus")(__v.asInstanceOf[js.Any]))
      configurationStateId.foreach(__v => __obj.updateDynamic("configurationStateId")(__v.asInstanceOf[js.Any]))
      relatedEvents.foreach(__v => __obj.updateDynamic("relatedEvents")(__v.asInstanceOf[js.Any]))
      relationships.foreach(__v => __obj.updateDynamic("relationships")(__v.asInstanceOf[js.Any]))
      resourceCreationTime.foreach(__v => __obj.updateDynamic("resourceCreationTime")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      supplementaryConfiguration.foreach(
        __v => __obj.updateDynamic("supplementaryConfiguration")(__v.asInstanceOf[js.Any])
      )
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationItem]
    }
  }

  object ConfigurationItemStatusEnum {
    val OK                         = "OK"
    val ResourceDiscovered         = "ResourceDiscovered"
    val ResourceNotRecorded        = "ResourceNotRecorded"
    val ResourceDeleted            = "ResourceDeleted"
    val ResourceDeletedNotRecorded = "ResourceDeletedNotRecorded"

    val values = js.Object.freeze(
      js.Array(OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded)
    )
  }

  /**
    * An object that represents the recording of configuration changes of an AWS resource.
    */
  @js.native
  trait ConfigurationRecorder extends js.Object {
    var name: js.UndefOr[RecorderName]
    var recordingGroup: js.UndefOr[RecordingGroup]
    var roleARN: js.UndefOr[String]
  }

  object ConfigurationRecorder {
    @inline
    def apply(
        name: js.UndefOr[RecorderName] = js.undefined,
        recordingGroup: js.UndefOr[RecordingGroup] = js.undefined,
        roleARN: js.UndefOr[String] = js.undefined
    ): ConfigurationRecorder = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recordingGroup.foreach(__v => __obj.updateDynamic("recordingGroup")(__v.asInstanceOf[js.Any]))
      roleARN.foreach(__v => __obj.updateDynamic("roleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationRecorder]
    }
  }

  /**
    * The current status of the configuration recorder.
    */
  @js.native
  trait ConfigurationRecorderStatus extends js.Object {
    var lastErrorCode: js.UndefOr[String]
    var lastErrorMessage: js.UndefOr[String]
    var lastStartTime: js.UndefOr[Date]
    var lastStatus: js.UndefOr[RecorderStatus]
    var lastStatusChangeTime: js.UndefOr[Date]
    var lastStopTime: js.UndefOr[Date]
    var name: js.UndefOr[String]
    var recording: js.UndefOr[Boolean]
  }

  object ConfigurationRecorderStatus {
    @inline
    def apply(
        lastErrorCode: js.UndefOr[String] = js.undefined,
        lastErrorMessage: js.UndefOr[String] = js.undefined,
        lastStartTime: js.UndefOr[Date] = js.undefined,
        lastStatus: js.UndefOr[RecorderStatus] = js.undefined,
        lastStatusChangeTime: js.UndefOr[Date] = js.undefined,
        lastStopTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        recording: js.UndefOr[Boolean] = js.undefined
    ): ConfigurationRecorderStatus = {
      val __obj = js.Dynamic.literal()
      lastErrorCode.foreach(__v => __obj.updateDynamic("lastErrorCode")(__v.asInstanceOf[js.Any]))
      lastErrorMessage.foreach(__v => __obj.updateDynamic("lastErrorMessage")(__v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.updateDynamic("lastStartTime")(__v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.updateDynamic("lastStatus")(__v.asInstanceOf[js.Any]))
      lastStatusChangeTime.foreach(__v => __obj.updateDynamic("lastStatusChangeTime")(__v.asInstanceOf[js.Any]))
      lastStopTime.foreach(__v => __obj.updateDynamic("lastStopTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recording.foreach(__v => __obj.updateDynamic("recording")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationRecorderStatus]
    }
  }

  @js.native
  trait DeleteAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: AccountId
    var AuthorizedAwsRegion: AwsRegion
  }

  object DeleteAggregationAuthorizationRequest {
    @inline
    def apply(
        AuthorizedAccountId: AccountId,
        AuthorizedAwsRegion: AwsRegion
    ): DeleteAggregationAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizedAccountId" -> AuthorizedAccountId.asInstanceOf[js.Any],
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAggregationAuthorizationRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteConfigRuleRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
  }

  object DeleteConfigRuleRequest {
    @inline
    def apply(
        ConfigRuleName: StringWithCharLimit64
    ): DeleteConfigRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigRuleRequest]
    }
  }

  @js.native
  trait DeleteConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
  }

  object DeleteConfigurationAggregatorRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName
    ): DeleteConfigurationAggregatorRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationAggregatorRequest]
    }
  }

  /**
    * The request object for the <code>DeleteConfigurationRecorder</code> action.
    */
  @js.native
  trait DeleteConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object DeleteConfigurationRecorderRequest {
    @inline
    def apply(
        ConfigurationRecorderName: RecorderName
    ): DeleteConfigurationRecorderRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationRecorderRequest]
    }
  }

  /**
    * The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON format.
    */
  @js.native
  trait DeleteDeliveryChannelRequest extends js.Object {
    var DeliveryChannelName: ChannelName
  }

  object DeleteDeliveryChannelRequest {
    @inline
    def apply(
        DeliveryChannelName: ChannelName
    ): DeleteDeliveryChannelRequest = {
      val __obj = js.Dynamic.literal(
        "DeliveryChannelName" -> DeliveryChannelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeliveryChannelRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteEvaluationResultsRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
  }

  object DeleteEvaluationResultsRequest {
    @inline
    def apply(
        ConfigRuleName: StringWithCharLimit64
    ): DeleteEvaluationResultsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEvaluationResultsRequest]
    }
  }

  /**
    * The output when you delete the evaluation results for the specified AWS Config rule.
    */
  @js.native
  trait DeleteEvaluationResultsResponse extends js.Object {}

  object DeleteEvaluationResultsResponse {
    @inline
    def apply(
        ): DeleteEvaluationResultsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteEvaluationResultsResponse]
    }
  }

  @js.native
  trait DeleteOrganizationConfigRuleRequest extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
  }

  object DeleteOrganizationConfigRuleRequest {
    @inline
    def apply(
        OrganizationConfigRuleName: OrganizationConfigRuleName
    ): DeleteOrganizationConfigRuleRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationConfigRuleName" -> OrganizationConfigRuleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteOrganizationConfigRuleRequest]
    }
  }

  @js.native
  trait DeletePendingAggregationRequestRequest extends js.Object {
    var RequesterAccountId: AccountId
    var RequesterAwsRegion: AwsRegion
  }

  object DeletePendingAggregationRequestRequest {
    @inline
    def apply(
        RequesterAccountId: AccountId,
        RequesterAwsRegion: AwsRegion
    ): DeletePendingAggregationRequestRequest = {
      val __obj = js.Dynamic.literal(
        "RequesterAccountId" -> RequesterAccountId.asInstanceOf[js.Any],
        "RequesterAwsRegion" -> RequesterAwsRegion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
    }
  }

  @js.native
  trait DeleteRemediationConfigurationRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceType: js.UndefOr[String]
  }

  object DeleteRemediationConfigurationRequest {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        ResourceType: js.UndefOr[String] = js.undefined
    ): DeleteRemediationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRemediationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteRemediationConfigurationResponse extends js.Object {}

  object DeleteRemediationConfigurationResponse {
    @inline
    def apply(
        ): DeleteRemediationConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRemediationConfigurationResponse]
    }
  }

  @js.native
  trait DeleteRemediationExceptionsRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceKeys: RemediationExceptionResourceKeys
  }

  object DeleteRemediationExceptionsRequest {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        ResourceKeys: RemediationExceptionResourceKeys
    ): DeleteRemediationExceptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "ResourceKeys"   -> ResourceKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRemediationExceptionsRequest]
    }
  }

  @js.native
  trait DeleteRemediationExceptionsResponse extends js.Object {
    var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches]
  }

  object DeleteRemediationExceptionsResponse {
    @inline
    def apply(
        FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches] = js.undefined
    ): DeleteRemediationExceptionsResponse = {
      val __obj = js.Dynamic.literal()
      FailedBatches.foreach(__v => __obj.updateDynamic("FailedBatches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRemediationExceptionsResponse]
    }
  }

  @js.native
  trait DeleteRetentionConfigurationRequest extends js.Object {
    var RetentionConfigurationName: RetentionConfigurationName
  }

  object DeleteRetentionConfigurationRequest {
    @inline
    def apply(
        RetentionConfigurationName: RetentionConfigurationName
    ): DeleteRetentionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "RetentionConfigurationName" -> RetentionConfigurationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRetentionConfigurationRequest]
    }
  }

  /**
    * The input for the <a>DeliverConfigSnapshot</a> action.
    */
  @js.native
  trait DeliverConfigSnapshotRequest extends js.Object {
    var deliveryChannelName: ChannelName
  }

  object DeliverConfigSnapshotRequest {
    @inline
    def apply(
        deliveryChannelName: ChannelName
    ): DeliverConfigSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "deliveryChannelName" -> deliveryChannelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeliverConfigSnapshotRequest]
    }
  }

  /**
    * The output for the <a>DeliverConfigSnapshot</a> action, in JSON format.
    */
  @js.native
  trait DeliverConfigSnapshotResponse extends js.Object {
    var configSnapshotId: js.UndefOr[String]
  }

  object DeliverConfigSnapshotResponse {
    @inline
    def apply(
        configSnapshotId: js.UndefOr[String] = js.undefined
    ): DeliverConfigSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      configSnapshotId.foreach(__v => __obj.updateDynamic("configSnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliverConfigSnapshotResponse]
    }
  }

  /**
    * The channel through which AWS Config delivers notifications and updated configuration states.
    */
  @js.native
  trait DeliveryChannel extends js.Object {
    var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties]
    var name: js.UndefOr[ChannelName]
    var s3BucketName: js.UndefOr[String]
    var s3KeyPrefix: js.UndefOr[String]
    var snsTopicARN: js.UndefOr[String]
  }

  object DeliveryChannel {
    @inline
    def apply(
        configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        s3BucketName: js.UndefOr[String] = js.undefined,
        s3KeyPrefix: js.UndefOr[String] = js.undefined,
        snsTopicARN: js.UndefOr[String] = js.undefined
    ): DeliveryChannel = {
      val __obj = js.Dynamic.literal()
      configSnapshotDeliveryProperties.foreach(
        __v => __obj.updateDynamic("configSnapshotDeliveryProperties")(__v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      s3BucketName.foreach(__v => __obj.updateDynamic("s3BucketName")(__v.asInstanceOf[js.Any]))
      s3KeyPrefix.foreach(__v => __obj.updateDynamic("s3KeyPrefix")(__v.asInstanceOf[js.Any]))
      snsTopicARN.foreach(__v => __obj.updateDynamic("snsTopicARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryChannel]
    }
  }

  /**
    * The status of a specified delivery channel.
    *  Valid values: <code>Success</code> | <code>Failure</code>
    */
  @js.native
  trait DeliveryChannelStatus extends js.Object {
    var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo]
    var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo]
    var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo]
    var name: js.UndefOr[String]
  }

  object DeliveryChannelStatus {
    @inline
    def apply(
        configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
        configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
        configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): DeliveryChannelStatus = {
      val __obj = js.Dynamic.literal()
      configHistoryDeliveryInfo.foreach(
        __v => __obj.updateDynamic("configHistoryDeliveryInfo")(__v.asInstanceOf[js.Any])
      )
      configSnapshotDeliveryInfo.foreach(
        __v => __obj.updateDynamic("configSnapshotDeliveryInfo")(__v.asInstanceOf[js.Any])
      )
      configStreamDeliveryInfo.foreach(__v => __obj.updateDynamic("configStreamDeliveryInfo")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryChannelStatus]
    }
  }

  object DeliveryStatusEnum {
    val Success        = "Success"
    val Failure        = "Failure"
    val Not_Applicable = "Not_Applicable"

    val values = js.Object.freeze(js.Array(Success, Failure, Not_Applicable))
  }

  @js.native
  trait DescribeAggregateComplianceByConfigRulesRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ConfigRuleComplianceFilters]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAggregateComplianceByConfigRulesRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Filters: js.UndefOr[ConfigRuleComplianceFilters] = js.undefined,
        Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAggregateComplianceByConfigRulesRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesRequest]
    }
  }

  @js.native
  trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
    var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAggregateComplianceByConfigRulesResponse {
    @inline
    def apply(
        AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAggregateComplianceByConfigRulesResponse = {
      val __obj = js.Dynamic.literal()
      AggregateComplianceByConfigRules.foreach(
        __v => __obj.updateDynamic("AggregateComplianceByConfigRules")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
    }
  }

  @js.native
  trait DescribeAggregationAuthorizationsRequest extends js.Object {
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAggregationAuthorizationsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAggregationAuthorizationsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregationAuthorizationsRequest]
    }
  }

  @js.native
  trait DescribeAggregationAuthorizationsResponse extends js.Object {
    var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAggregationAuthorizationsResponse {
    @inline
    def apply(
        AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAggregationAuthorizationsResponse = {
      val __obj = js.Dynamic.literal()
      AggregationAuthorizations.foreach(
        __v => __obj.updateDynamic("AggregationAuthorizations")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregationAuthorizationsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeComplianceByConfigRuleRequest extends js.Object {
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var NextToken: js.UndefOr[String]
  }

  object DescribeComplianceByConfigRuleRequest {
    @inline
    def apply(
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeComplianceByConfigRuleRequest = {
      val __obj = js.Dynamic.literal()
      ComplianceTypes.foreach(__v => __obj.updateDynamic("ComplianceTypes")(__v.asInstanceOf[js.Any]))
      ConfigRuleNames.foreach(__v => __obj.updateDynamic("ConfigRuleNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComplianceByConfigRuleRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeComplianceByConfigRuleResponse extends js.Object {
    var ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules]
    var NextToken: js.UndefOr[String]
  }

  object DescribeComplianceByConfigRuleResponse {
    @inline
    def apply(
        ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeComplianceByConfigRuleResponse = {
      val __obj = js.Dynamic.literal()
      ComplianceByConfigRules.foreach(__v => __obj.updateDynamic("ComplianceByConfigRules")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComplianceByConfigRuleResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeComplianceByResourceRequest extends js.Object {
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  object DescribeComplianceByResourceRequest {
    @inline
    def apply(
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): DescribeComplianceByResourceRequest = {
      val __obj = js.Dynamic.literal()
      ComplianceTypes.foreach(__v => __obj.updateDynamic("ComplianceTypes")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComplianceByResourceRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeComplianceByResourceResponse extends js.Object {
    var ComplianceByResources: js.UndefOr[ComplianceByResources]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeComplianceByResourceResponse {
    @inline
    def apply(
        ComplianceByResources: js.UndefOr[ComplianceByResources] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeComplianceByResourceResponse = {
      val __obj = js.Dynamic.literal()
      ComplianceByResources.foreach(__v => __obj.updateDynamic("ComplianceByResources")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComplianceByResourceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var Limit: js.UndefOr[RuleLimit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigRuleEvaluationStatusRequest {
    @inline
    def apply(
        ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
        Limit: js.UndefOr[RuleLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRuleEvaluationStatusRequest = {
      val __obj = js.Dynamic.literal()
      ConfigRuleNames.foreach(__v => __obj.updateDynamic("ConfigRuleNames")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
    var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigRuleEvaluationStatusResponse {
    @inline
    def apply(
        ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRuleEvaluationStatusResponse = {
      val __obj = js.Dynamic.literal()
      ConfigRulesEvaluationStatus.foreach(
        __v => __obj.updateDynamic("ConfigRulesEvaluationStatus")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeConfigRulesRequest extends js.Object {
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigRulesRequest {
    @inline
    def apply(
        ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRulesRequest = {
      val __obj = js.Dynamic.literal()
      ConfigRuleNames.foreach(__v => __obj.updateDynamic("ConfigRuleNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigRulesRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeConfigRulesResponse extends js.Object {
    var ConfigRules: js.UndefOr[ConfigRules]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigRulesResponse {
    @inline
    def apply(
        ConfigRules: js.UndefOr[ConfigRules] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRulesResponse = {
      val __obj = js.Dynamic.literal()
      ConfigRules.foreach(__v => __obj.updateDynamic("ConfigRules")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigRulesResponse]
    }
  }

  @js.native
  trait DescribeConfigurationAggregatorSourcesStatusRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
    var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList]
  }

  object DescribeConfigurationAggregatorSourcesStatusRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.undefined
    ): DescribeConfigurationAggregatorSourcesStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.updateDynamic("UpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusRequest]
    }
  }

  @js.native
  trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
    var AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigurationAggregatorSourcesStatusResponse {
    @inline
    def apply(
        AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigurationAggregatorSourcesStatusResponse = {
      val __obj = js.Dynamic.literal()
      AggregatedSourceStatusList.foreach(
        __v => __obj.updateDynamic("AggregatedSourceStatusList")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
    }
  }

  @js.native
  trait DescribeConfigurationAggregatorsRequest extends js.Object {
    var ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigurationAggregatorsRequest {
    @inline
    def apply(
        ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigurationAggregatorsRequest = {
      val __obj = js.Dynamic.literal()
      ConfigurationAggregatorNames.foreach(
        __v => __obj.updateDynamic("ConfigurationAggregatorNames")(__v.asInstanceOf[js.Any])
      )
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationAggregatorsRequest]
    }
  }

  @js.native
  trait DescribeConfigurationAggregatorsResponse extends js.Object {
    var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigurationAggregatorsResponse {
    @inline
    def apply(
        ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigurationAggregatorsResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationAggregators.foreach(__v => __obj.updateDynamic("ConfigurationAggregators")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationAggregatorsResponse]
    }
  }

  /**
    * The input for the <a>DescribeConfigurationRecorderStatus</a> action.
    */
  @js.native
  trait DescribeConfigurationRecorderStatusRequest extends js.Object {
    var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList]
  }

  object DescribeConfigurationRecorderStatusRequest {
    @inline
    def apply(
        ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecorderStatusRequest = {
      val __obj = js.Dynamic.literal()
      ConfigurationRecorderNames.foreach(
        __v => __obj.updateDynamic("ConfigurationRecorderNames")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeConfigurationRecorderStatusRequest]
    }
  }

  /**
    * The output for the <a>DescribeConfigurationRecorderStatus</a> action, in JSON format.
    */
  @js.native
  trait DescribeConfigurationRecorderStatusResponse extends js.Object {
    var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList]
  }

  object DescribeConfigurationRecorderStatusResponse {
    @inline
    def apply(
        ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
    ): DescribeConfigurationRecorderStatusResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationRecordersStatus.foreach(
        __v => __obj.updateDynamic("ConfigurationRecordersStatus")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeConfigurationRecorderStatusResponse]
    }
  }

  /**
    * The input for the <a>DescribeConfigurationRecorders</a> action.
    */
  @js.native
  trait DescribeConfigurationRecordersRequest extends js.Object {
    var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList]
  }

  object DescribeConfigurationRecordersRequest {
    @inline
    def apply(
        ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecordersRequest = {
      val __obj = js.Dynamic.literal()
      ConfigurationRecorderNames.foreach(
        __v => __obj.updateDynamic("ConfigurationRecorderNames")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeConfigurationRecordersRequest]
    }
  }

  /**
    * The output for the <a>DescribeConfigurationRecorders</a> action.
    */
  @js.native
  trait DescribeConfigurationRecordersResponse extends js.Object {
    var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList]
  }

  object DescribeConfigurationRecordersResponse {
    @inline
    def apply(
        ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
    ): DescribeConfigurationRecordersResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationRecorders.foreach(__v => __obj.updateDynamic("ConfigurationRecorders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationRecordersResponse]
    }
  }

  /**
    * The input for the <a>DeliveryChannelStatus</a> action.
    */
  @js.native
  trait DescribeDeliveryChannelStatusRequest extends js.Object {
    var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList]
  }

  object DescribeDeliveryChannelStatusRequest {
    @inline
    def apply(
        DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelStatusRequest = {
      val __obj = js.Dynamic.literal()
      DeliveryChannelNames.foreach(__v => __obj.updateDynamic("DeliveryChannelNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeliveryChannelStatusRequest]
    }
  }

  /**
    * The output for the <a>DescribeDeliveryChannelStatus</a> action.
    */
  @js.native
  trait DescribeDeliveryChannelStatusResponse extends js.Object {
    var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList]
  }

  object DescribeDeliveryChannelStatusResponse {
    @inline
    def apply(
        DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
    ): DescribeDeliveryChannelStatusResponse = {
      val __obj = js.Dynamic.literal()
      DeliveryChannelsStatus.foreach(__v => __obj.updateDynamic("DeliveryChannelsStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeliveryChannelStatusResponse]
    }
  }

  /**
    * The input for the <a>DescribeDeliveryChannels</a> action.
    */
  @js.native
  trait DescribeDeliveryChannelsRequest extends js.Object {
    var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList]
  }

  object DescribeDeliveryChannelsRequest {
    @inline
    def apply(
        DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelsRequest = {
      val __obj = js.Dynamic.literal()
      DeliveryChannelNames.foreach(__v => __obj.updateDynamic("DeliveryChannelNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeliveryChannelsRequest]
    }
  }

  /**
    * The output for the <a>DescribeDeliveryChannels</a> action.
    */
  @js.native
  trait DescribeDeliveryChannelsResponse extends js.Object {
    var DeliveryChannels: js.UndefOr[DeliveryChannelList]
  }

  object DescribeDeliveryChannelsResponse {
    @inline
    def apply(
        DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
    ): DescribeDeliveryChannelsResponse = {
      val __obj = js.Dynamic.literal()
      DeliveryChannels.foreach(__v => __obj.updateDynamic("DeliveryChannels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigRuleStatusesRequest extends js.Object {
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames]
  }

  object DescribeOrganizationConfigRuleStatusesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames] = js.undefined
    ): DescribeOrganizationConfigRuleStatusesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationConfigRuleNames.foreach(
        __v => __obj.updateDynamic("OrganizationConfigRuleNames")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesRequest]
    }
  }

  @js.native
  trait DescribeOrganizationConfigRuleStatusesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleStatuses: js.UndefOr[OrganizationConfigRuleStatuses]
  }

  object DescribeOrganizationConfigRuleStatusesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        OrganizationConfigRuleStatuses: js.UndefOr[OrganizationConfigRuleStatuses] = js.undefined
    ): DescribeOrganizationConfigRuleStatusesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationConfigRuleStatuses.foreach(
        __v => __obj.updateDynamic("OrganizationConfigRuleStatuses")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigRulesRequest extends js.Object {
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames]
  }

  object DescribeOrganizationConfigRulesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames] = js.undefined
    ): DescribeOrganizationConfigRulesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationConfigRuleNames.foreach(
        __v => __obj.updateDynamic("OrganizationConfigRuleNames")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeOrganizationConfigRulesRequest]
    }
  }

  @js.native
  trait DescribeOrganizationConfigRulesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRules: js.UndefOr[OrganizationConfigRules]
  }

  object DescribeOrganizationConfigRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        OrganizationConfigRules: js.UndefOr[OrganizationConfigRules] = js.undefined
    ): DescribeOrganizationConfigRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationConfigRules.foreach(__v => __obj.updateDynamic("OrganizationConfigRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationConfigRulesResponse]
    }
  }

  @js.native
  trait DescribePendingAggregationRequestsRequest extends js.Object {
    var Limit: js.UndefOr[DescribePendingAggregationRequestsLimit]
    var NextToken: js.UndefOr[String]
  }

  object DescribePendingAggregationRequestsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[DescribePendingAggregationRequestsLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribePendingAggregationRequestsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingAggregationRequestsRequest]
    }
  }

  @js.native
  trait DescribePendingAggregationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList]
  }

  object DescribePendingAggregationRequestsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.undefined
    ): DescribePendingAggregationRequestsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PendingAggregationRequests.foreach(
        __v => __obj.updateDynamic("PendingAggregationRequests")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribePendingAggregationRequestsResponse]
    }
  }

  @js.native
  trait DescribeRemediationConfigurationsRequest extends js.Object {
    var ConfigRuleNames: ConfigRuleNames
  }

  object DescribeRemediationConfigurationsRequest {
    @inline
    def apply(
        ConfigRuleNames: ConfigRuleNames
    ): DescribeRemediationConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleNames" -> ConfigRuleNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRemediationConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeRemediationConfigurationsResponse extends js.Object {
    var RemediationConfigurations: js.UndefOr[RemediationConfigurations]
  }

  object DescribeRemediationConfigurationsResponse {
    @inline
    def apply(
        RemediationConfigurations: js.UndefOr[RemediationConfigurations] = js.undefined
    ): DescribeRemediationConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      RemediationConfigurations.foreach(
        __v => __obj.updateDynamic("RemediationConfigurations")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeRemediationExceptionsRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
    var ResourceKeys: js.UndefOr[RemediationExceptionResourceKeys]
  }

  object DescribeRemediationExceptionsRequest {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceKeys: js.UndefOr[RemediationExceptionResourceKeys] = js.undefined
    ): DescribeRemediationExceptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceKeys.foreach(__v => __obj.updateDynamic("ResourceKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRemediationExceptionsRequest]
    }
  }

  @js.native
  trait DescribeRemediationExceptionsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RemediationExceptions: js.UndefOr[RemediationExceptions]
  }

  object DescribeRemediationExceptionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RemediationExceptions: js.UndefOr[RemediationExceptions] = js.undefined
    ): DescribeRemediationExceptionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RemediationExceptions.foreach(__v => __obj.updateDynamic("RemediationExceptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRemediationExceptionsResponse]
    }
  }

  @js.native
  trait DescribeRemediationExecutionStatusRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
    var ResourceKeys: js.UndefOr[ResourceKeys]
  }

  object DescribeRemediationExecutionStatusRequest {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
    ): DescribeRemediationExecutionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceKeys.foreach(__v => __obj.updateDynamic("ResourceKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRemediationExecutionStatusRequest]
    }
  }

  @js.native
  trait DescribeRemediationExecutionStatusResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RemediationExecutionStatuses: js.UndefOr[RemediationExecutionStatuses]
  }

  object DescribeRemediationExecutionStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RemediationExecutionStatuses: js.UndefOr[RemediationExecutionStatuses] = js.undefined
    ): DescribeRemediationExecutionStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RemediationExecutionStatuses.foreach(
        __v => __obj.updateDynamic("RemediationExecutionStatuses")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
    }
  }

  @js.native
  trait DescribeRetentionConfigurationsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList]
  }

  object DescribeRetentionConfigurationsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined
    ): DescribeRetentionConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RetentionConfigurationNames.foreach(
        __v => __obj.updateDynamic("RetentionConfigurationNames")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeRetentionConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RetentionConfigurations: js.UndefOr[RetentionConfigurationList]
  }

  object DescribeRetentionConfigurationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined
    ): DescribeRetentionConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RetentionConfigurations.foreach(__v => __obj.updateDynamic("RetentionConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRetentionConfigurationsResponse]
    }
  }

  /**
    * Identifies an AWS resource and indicates whether it complies with the AWS Config rule that it was evaluated against.
    */
  @js.native
  trait Evaluation extends js.Object {
    var ComplianceResourceId: BaseResourceId
    var ComplianceResourceType: StringWithCharLimit256
    var ComplianceType: ComplianceType
    var OrderingTimestamp: OrderingTimestamp
    var Annotation: js.UndefOr[StringWithCharLimit256]
  }

  object Evaluation {
    @inline
    def apply(
        ComplianceResourceId: BaseResourceId,
        ComplianceResourceType: StringWithCharLimit256,
        ComplianceType: ComplianceType,
        OrderingTimestamp: OrderingTimestamp,
        Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): Evaluation = {
      val __obj = js.Dynamic.literal(
        "ComplianceResourceId"   -> ComplianceResourceId.asInstanceOf[js.Any],
        "ComplianceResourceType" -> ComplianceResourceType.asInstanceOf[js.Any],
        "ComplianceType"         -> ComplianceType.asInstanceOf[js.Any],
        "OrderingTimestamp"      -> OrderingTimestamp.asInstanceOf[js.Any]
      )

      Annotation.foreach(__v => __obj.updateDynamic("Annotation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Evaluation]
    }
  }

  /**
    * The details of an AWS Config evaluation. Provides the AWS resource that was evaluated, the compliance of the resource, related time stamps, and supplementary information.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigRuleInvokedTime: js.UndefOr[Date]
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier]
    var ResultRecordedTime: js.UndefOr[Date]
    var ResultToken: js.UndefOr[String]
  }

  object EvaluationResult {
    @inline
    def apply(
        Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
        EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
        ResultRecordedTime: js.UndefOr[Date] = js.undefined,
        ResultToken: js.UndefOr[String] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dynamic.literal()
      Annotation.foreach(__v => __obj.updateDynamic("Annotation")(__v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      ConfigRuleInvokedTime.foreach(__v => __obj.updateDynamic("ConfigRuleInvokedTime")(__v.asInstanceOf[js.Any]))
      EvaluationResultIdentifier.foreach(
        __v => __obj.updateDynamic("EvaluationResultIdentifier")(__v.asInstanceOf[js.Any])
      )
      ResultRecordedTime.foreach(__v => __obj.updateDynamic("ResultRecordedTime")(__v.asInstanceOf[js.Any]))
      ResultToken.foreach(__v => __obj.updateDynamic("ResultToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResult]
    }
  }

  /**
    * Uniquely identifies an evaluation result.
    */
  @js.native
  trait EvaluationResultIdentifier extends js.Object {
    var EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier]
    var OrderingTimestamp: js.UndefOr[Date]
  }

  object EvaluationResultIdentifier {
    @inline
    def apply(
        EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier] = js.undefined,
        OrderingTimestamp: js.UndefOr[Date] = js.undefined
    ): EvaluationResultIdentifier = {
      val __obj = js.Dynamic.literal()
      EvaluationResultQualifier.foreach(
        __v => __obj.updateDynamic("EvaluationResultQualifier")(__v.asInstanceOf[js.Any])
      )
      OrderingTimestamp.foreach(__v => __obj.updateDynamic("OrderingTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResultIdentifier]
    }
  }

  /**
    * Identifies an AWS Config rule that evaluated an AWS resource, and provides the type and ID of the resource that the rule evaluated.
    */
  @js.native
  trait EvaluationResultQualifier extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  object EvaluationResultQualifier {
    @inline
    def apply(
        ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
        ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): EvaluationResultQualifier = {
      val __obj = js.Dynamic.literal()
      ConfigRuleName.foreach(__v => __obj.updateDynamic("ConfigRuleName")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResultQualifier]
    }
  }

  object EventSourceEnum {
    val `aws.config` = "aws.config"

    val values = js.Object.freeze(js.Array(`aws.config`))
  }

  /**
    * The controls that AWS Config uses for executing remediations.
    */
  @js.native
  trait ExecutionControls extends js.Object {
    var SsmControls: js.UndefOr[SsmControls]
  }

  object ExecutionControls {
    @inline
    def apply(
        SsmControls: js.UndefOr[SsmControls] = js.undefined
    ): ExecutionControls = {
      val __obj = js.Dynamic.literal()
      SsmControls.foreach(__v => __obj.updateDynamic("SsmControls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionControls]
    }
  }

  /**
    * List of each of the failed delete remediation exceptions with specific reasons.
    */
  @js.native
  trait FailedDeleteRemediationExceptionsBatch extends js.Object {
    var FailedItems: js.UndefOr[RemediationExceptionResourceKeys]
    var FailureMessage: js.UndefOr[String]
  }

  object FailedDeleteRemediationExceptionsBatch {
    @inline
    def apply(
        FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): FailedDeleteRemediationExceptionsBatch = {
      val __obj = js.Dynamic.literal()
      FailedItems.foreach(__v => __obj.updateDynamic("FailedItems")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
    }
  }

  /**
    * List of each of the failed remediations with specific reasons.
    */
  @js.native
  trait FailedRemediationBatch extends js.Object {
    var FailedItems: js.UndefOr[RemediationConfigurations]
    var FailureMessage: js.UndefOr[String]
  }

  object FailedRemediationBatch {
    @inline
    def apply(
        FailedItems: js.UndefOr[RemediationConfigurations] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): FailedRemediationBatch = {
      val __obj = js.Dynamic.literal()
      FailedItems.foreach(__v => __obj.updateDynamic("FailedItems")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedRemediationBatch]
    }
  }

  /**
    * List of each of the failed remediation exceptions with specific reasons.
    */
  @js.native
  trait FailedRemediationExceptionBatch extends js.Object {
    var FailedItems: js.UndefOr[RemediationExceptions]
    var FailureMessage: js.UndefOr[String]
  }

  object FailedRemediationExceptionBatch {
    @inline
    def apply(
        FailedItems: js.UndefOr[RemediationExceptions] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): FailedRemediationExceptionBatch = {
      val __obj = js.Dynamic.literal()
      FailedItems.foreach(__v => __obj.updateDynamic("FailedItems")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedRemediationExceptionBatch]
    }
  }

  /**
    * Details about the fields such as name of the field.
    */
  @js.native
  trait FieldInfo extends js.Object {
    var Name: js.UndefOr[FieldName]
  }

  object FieldInfo {
    @inline
    def apply(
        Name: js.UndefOr[FieldName] = js.undefined
    ): FieldInfo = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldInfo]
    }
  }

  @js.native
  trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
    var AccountId: AccountId
    var AwsRegion: AwsRegion
    var ConfigRuleName: ConfigRuleName
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ComplianceType: js.UndefOr[ComplianceType]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateComplianceDetailsByConfigRuleRequest {
    @inline
    def apply(
        AccountId: AccountId,
        AwsRegion: AwsRegion,
        ConfigRuleName: ConfigRuleName,
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateComplianceDetailsByConfigRuleRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"                   -> AccountId.asInstanceOf[js.Any],
        "AwsRegion"                   -> AwsRegion.asInstanceOf[js.Any],
        "ConfigRuleName"              -> ConfigRuleName.asInstanceOf[js.Any],
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
    }
  }

  @js.native
  trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
    var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateComplianceDetailsByConfigRuleResponse {
    @inline
    def apply(
        AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateComplianceDetailsByConfigRuleResponse = {
      val __obj = js.Dynamic.literal()
      AggregateEvaluationResults.foreach(
        __v => __obj.updateDynamic("AggregateEvaluationResults")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
    }
  }

  @js.native
  trait GetAggregateConfigRuleComplianceSummaryRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters]
    var GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateConfigRuleComplianceSummaryRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters] = js.undefined,
        GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey] = js.undefined,
        Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateConfigRuleComplianceSummaryRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      GroupByKey.foreach(__v => __obj.updateDynamic("GroupByKey")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryRequest]
    }
  }

  @js.native
  trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
    var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList]
    var GroupByKey: js.UndefOr[StringWithCharLimit256]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateConfigRuleComplianceSummaryResponse {
    @inline
    def apply(
        AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.undefined,
        GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateConfigRuleComplianceSummaryResponse = {
      val __obj = js.Dynamic.literal()
      AggregateComplianceCounts.foreach(
        __v => __obj.updateDynamic("AggregateComplianceCounts")(__v.asInstanceOf[js.Any])
      )
      GroupByKey.foreach(__v => __obj.updateDynamic("GroupByKey")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryResponse]
    }
  }

  @js.native
  trait GetAggregateDiscoveredResourceCountsRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ResourceCountFilters]
    var GroupByKey: js.UndefOr[ResourceCountGroupKey]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateDiscoveredResourceCountsRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Filters: js.UndefOr[ResourceCountFilters] = js.undefined,
        GroupByKey: js.UndefOr[ResourceCountGroupKey] = js.undefined,
        Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateDiscoveredResourceCountsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      GroupByKey.foreach(__v => __obj.updateDynamic("GroupByKey")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsRequest]
    }
  }

  @js.native
  trait GetAggregateDiscoveredResourceCountsResponse extends js.Object {
    var TotalDiscoveredResources: Double
    var GroupByKey: js.UndefOr[StringWithCharLimit256]
    var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateDiscoveredResourceCountsResponse {
    @inline
    def apply(
        TotalDiscoveredResources: Double,
        GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined,
        GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateDiscoveredResourceCountsResponse = {
      val __obj = js.Dynamic.literal(
        "TotalDiscoveredResources" -> TotalDiscoveredResources.asInstanceOf[js.Any]
      )

      GroupByKey.foreach(__v => __obj.updateDynamic("GroupByKey")(__v.asInstanceOf[js.Any]))
      GroupedResourceCounts.foreach(__v => __obj.updateDynamic("GroupedResourceCounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
    }
  }

  @js.native
  trait GetAggregateResourceConfigRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceIdentifier: AggregateResourceIdentifier
  }

  object GetAggregateResourceConfigRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ResourceIdentifier: AggregateResourceIdentifier
    ): GetAggregateResourceConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceIdentifier"          -> ResourceIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAggregateResourceConfigRequest]
    }
  }

  @js.native
  trait GetAggregateResourceConfigResponse extends js.Object {
    var ConfigurationItem: js.UndefOr[ConfigurationItem]
  }

  object GetAggregateResourceConfigResponse {
    @inline
    def apply(
        ConfigurationItem: js.UndefOr[ConfigurationItem] = js.undefined
    ): GetAggregateResourceConfigResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationItem.foreach(__v => __obj.updateDynamic("ConfigurationItem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateResourceConfigResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetComplianceDetailsByConfigRuleRequest {
    @inline
    def apply(
        ConfigRuleName: StringWithCharLimit64,
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetComplianceDetailsByConfigRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      ComplianceTypes.foreach(__v => __obj.updateDynamic("ComplianceTypes")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceDetailsByConfigRuleResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetComplianceDetailsByConfigRuleResponse {
    @inline
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetComplianceDetailsByConfigRuleResponse = {
      val __obj = js.Dynamic.literal()
      EvaluationResults.foreach(__v => __obj.updateDynamic("EvaluationResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceDetailsByResourceRequest extends js.Object {
    var ResourceId: BaseResourceId
    var ResourceType: StringWithCharLimit256
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var NextToken: js.UndefOr[String]
  }

  object GetComplianceDetailsByResourceRequest {
    @inline
    def apply(
        ResourceId: BaseResourceId,
        ResourceType: StringWithCharLimit256,
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetComplianceDetailsByResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      ComplianceTypes.foreach(__v => __obj.updateDynamic("ComplianceTypes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceDetailsByResourceRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceDetailsByResourceResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResults]
    var NextToken: js.UndefOr[String]
  }

  object GetComplianceDetailsByResourceResponse {
    @inline
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetComplianceDetailsByResourceResponse = {
      val __obj = js.Dynamic.literal()
      EvaluationResults.foreach(__v => __obj.updateDynamic("EvaluationResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceDetailsByResourceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
  }

  object GetComplianceSummaryByConfigRuleResponse {
    @inline
    def apply(
        ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
    ): GetComplianceSummaryByConfigRuleResponse = {
      val __obj = js.Dynamic.literal()
      ComplianceSummary.foreach(__v => __obj.updateDynamic("ComplianceSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
    var ResourceTypes: js.UndefOr[ResourceTypes]
  }

  object GetComplianceSummaryByResourceTypeRequest {
    @inline
    def apply(
        ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    ): GetComplianceSummaryByResourceTypeRequest = {
      val __obj = js.Dynamic.literal()
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetComplianceSummaryByResourceTypeResponse extends js.Object {
    var ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType]
  }

  object GetComplianceSummaryByResourceTypeResponse {
    @inline
    def apply(
        ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType] = js.undefined
    ): GetComplianceSummaryByResourceTypeResponse = {
      val __obj = js.Dynamic.literal()
      ComplianceSummariesByResourceType.foreach(
        __v => __obj.updateDynamic("ComplianceSummariesByResourceType")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetComplianceSummaryByResourceTypeResponse]
    }
  }

  @js.native
  trait GetDiscoveredResourceCountsRequest extends js.Object {
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
    var resourceTypes: js.UndefOr[ResourceTypes]
  }

  object GetDiscoveredResourceCountsRequest {
    @inline
    def apply(
        limit: js.UndefOr[Limit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    ): GetDiscoveredResourceCountsRequest = {
      val __obj = js.Dynamic.literal()
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceTypes.foreach(__v => __obj.updateDynamic("resourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiscoveredResourceCountsRequest]
    }
  }

  @js.native
  trait GetDiscoveredResourceCountsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourceCounts: js.UndefOr[ResourceCounts]
    var totalDiscoveredResources: js.UndefOr[Double]
  }

  object GetDiscoveredResourceCountsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceCounts: js.UndefOr[ResourceCounts] = js.undefined,
        totalDiscoveredResources: js.UndefOr[Double] = js.undefined
    ): GetDiscoveredResourceCountsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceCounts.foreach(__v => __obj.updateDynamic("resourceCounts")(__v.asInstanceOf[js.Any]))
      totalDiscoveredResources.foreach(__v => __obj.updateDynamic("totalDiscoveredResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiscoveredResourceCountsResponse]
    }
  }

  @js.native
  trait GetOrganizationConfigRuleDetailedStatusRequest extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var Filters: js.UndefOr[StatusDetailFilters]
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
  }

  object GetOrganizationConfigRuleDetailedStatusRequest {
    @inline
    def apply(
        OrganizationConfigRuleName: OrganizationConfigRuleName,
        Filters: js.UndefOr[StatusDetailFilters] = js.undefined,
        Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetOrganizationConfigRuleDetailedStatusRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationConfigRuleName" -> OrganizationConfigRuleName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusRequest]
    }
  }

  @js.native
  trait GetOrganizationConfigRuleDetailedStatusResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleDetailedStatus: js.UndefOr[OrganizationConfigRuleDetailedStatus]
  }

  object GetOrganizationConfigRuleDetailedStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        OrganizationConfigRuleDetailedStatus: js.UndefOr[OrganizationConfigRuleDetailedStatus] = js.undefined
    ): GetOrganizationConfigRuleDetailedStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationConfigRuleDetailedStatus.foreach(
        __v => __obj.updateDynamic("OrganizationConfigRuleDetailedStatus")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
    }
  }

  /**
    * The input for the <a>GetResourceConfigHistory</a> action.
    */
  @js.native
  trait GetResourceConfigHistoryRequest extends js.Object {
    var resourceId: ResourceId
    var resourceType: ResourceType
    var chronologicalOrder: js.UndefOr[ChronologicalOrder]
    var earlierTime: js.UndefOr[EarlierTime]
    var laterTime: js.UndefOr[LaterTime]
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetResourceConfigHistoryRequest {
    @inline
    def apply(
        resourceId: ResourceId,
        resourceType: ResourceType,
        chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined,
        earlierTime: js.UndefOr[EarlierTime] = js.undefined,
        laterTime: js.UndefOr[LaterTime] = js.undefined,
        limit: js.UndefOr[Limit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceConfigHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "resourceId"   -> resourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      chronologicalOrder.foreach(__v => __obj.updateDynamic("chronologicalOrder")(__v.asInstanceOf[js.Any]))
      earlierTime.foreach(__v => __obj.updateDynamic("earlierTime")(__v.asInstanceOf[js.Any]))
      laterTime.foreach(__v => __obj.updateDynamic("laterTime")(__v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceConfigHistoryRequest]
    }
  }

  /**
    * The output for the <a>GetResourceConfigHistory</a> action.
    */
  @js.native
  trait GetResourceConfigHistoryResponse extends js.Object {
    var configurationItems: js.UndefOr[ConfigurationItemList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetResourceConfigHistoryResponse {
    @inline
    def apply(
        configurationItems: js.UndefOr[ConfigurationItemList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceConfigHistoryResponse = {
      val __obj = js.Dynamic.literal()
      configurationItems.foreach(__v => __obj.updateDynamic("configurationItems")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceConfigHistoryResponse]
    }
  }

  /**
    * The count of resources that are grouped by the group name.
    */
  @js.native
  trait GroupedResourceCount extends js.Object {
    var GroupName: StringWithCharLimit256
    var ResourceCount: Double
  }

  object GroupedResourceCount {
    @inline
    def apply(
        GroupName: StringWithCharLimit256,
        ResourceCount: Double
    ): GroupedResourceCount = {
      val __obj = js.Dynamic.literal(
        "GroupName"     -> GroupName.asInstanceOf[js.Any],
        "ResourceCount" -> ResourceCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GroupedResourceCount]
    }
  }

  @js.native
  trait ListAggregateDiscoveredResourcesRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceType: ResourceType
    var Filters: js.UndefOr[ResourceFilters]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAggregateDiscoveredResourcesRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ResourceType: ResourceType,
        Filters: js.UndefOr[ResourceFilters] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAggregateDiscoveredResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceType"                -> ResourceType.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAggregateDiscoveredResourcesRequest]
    }
  }

  @js.native
  trait ListAggregateDiscoveredResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList]
  }

  object ListAggregateDiscoveredResourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.undefined
    ): ListAggregateDiscoveredResourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.updateDynamic("ResourceIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListDiscoveredResourcesRequest extends js.Object {
    var resourceType: ResourceType
    var includeDeletedResources: js.UndefOr[Boolean]
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
    var resourceIds: js.UndefOr[ResourceIdList]
    var resourceName: js.UndefOr[ResourceName]
  }

  object ListDiscoveredResourcesRequest {
    @inline
    def apply(
        resourceType: ResourceType,
        includeDeletedResources: js.UndefOr[Boolean] = js.undefined,
        limit: js.UndefOr[Limit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIds: js.UndefOr[ResourceIdList] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined
    ): ListDiscoveredResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      includeDeletedResources.foreach(__v => __obj.updateDynamic("includeDeletedResources")(__v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDiscoveredResourcesRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ListDiscoveredResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object ListDiscoveredResourcesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): ListDiscoveredResourcesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceIdentifiers.foreach(__v => __obj.updateDynamic("resourceIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDiscoveredResourcesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object MaximumExecutionFrequencyEnum {
    val One_Hour         = "One_Hour"
    val Three_Hours      = "Three_Hours"
    val Six_Hours        = "Six_Hours"
    val Twelve_Hours     = "Twelve_Hours"
    val TwentyFour_Hours = "TwentyFour_Hours"

    val values = js.Object.freeze(js.Array(One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours))
  }

  object MemberAccountRuleStatusEnum {
    val CREATE_SUCCESSFUL  = "CREATE_SUCCESSFUL"
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_FAILED      = "CREATE_FAILED"
    val UPDATE_SUCCESSFUL  = "UPDATE_SUCCESSFUL"
    val UPDATE_FAILED      = "UPDATE_FAILED"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"
    val DELETE_SUCCESSFUL  = "DELETE_SUCCESSFUL"
    val DELETE_FAILED      = "DELETE_FAILED"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"

    val values = js.Object.freeze(
      js.Array(
        CREATE_SUCCESSFUL,
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        UPDATE_SUCCESSFUL,
        UPDATE_FAILED,
        UPDATE_IN_PROGRESS,
        DELETE_SUCCESSFUL,
        DELETE_FAILED,
        DELETE_IN_PROGRESS
      )
    )
  }

  /**
    * Organization config rule creation or deletion status in each member account. This includes the name of the rule, the status, error code and error message when the rule creation or deletion failed.
    */
  @js.native
  trait MemberAccountStatus extends js.Object {
    var AccountId: AccountId
    var ConfigRuleName: StringWithCharLimit64
    var MemberAccountRuleStatus: MemberAccountRuleStatus
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LastUpdateTime: js.UndefOr[Date]
  }

  object MemberAccountStatus {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigRuleName: StringWithCharLimit64,
        MemberAccountRuleStatus: MemberAccountRuleStatus,
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        LastUpdateTime: js.UndefOr[Date] = js.undefined
    ): MemberAccountStatus = {
      val __obj = js.Dynamic.literal(
        "AccountId"               -> AccountId.asInstanceOf[js.Any],
        "ConfigRuleName"          -> ConfigRuleName.asInstanceOf[js.Any],
        "MemberAccountRuleStatus" -> MemberAccountRuleStatus.asInstanceOf[js.Any]
      )

      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberAccountStatus]
    }
  }

  object MessageTypeEnum {
    val ConfigurationItemChangeNotification          = "ConfigurationItemChangeNotification"
    val ConfigurationSnapshotDeliveryCompleted       = "ConfigurationSnapshotDeliveryCompleted"
    val ScheduledNotification                        = "ScheduledNotification"
    val OversizedConfigurationItemChangeNotification = "OversizedConfigurationItemChangeNotification"

    val values = js.Object.freeze(
      js.Array(
        ConfigurationItemChangeNotification,
        ConfigurationSnapshotDeliveryCompleted,
        ScheduledNotification,
        OversizedConfigurationItemChangeNotification
      )
    )
  }

  /**
    * This object contains regions to set up the aggregator and an IAM role to retrieve organization details.
    */
  @js.native
  trait OrganizationAggregationSource extends js.Object {
    var RoleArn: String
    var AllAwsRegions: js.UndefOr[Boolean]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
  }

  object OrganizationAggregationSource {
    @inline
    def apply(
        RoleArn: String,
        AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
        AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
    ): OrganizationAggregationSource = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      AllAwsRegions.foreach(__v => __obj.updateDynamic("AllAwsRegions")(__v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.updateDynamic("AwsRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationAggregationSource]
    }
  }

  /**
    * An organization config rule that has information about config rules that AWS Config creates in member accounts.
    */
  @js.native
  trait OrganizationConfigRule extends js.Object {
    var OrganizationConfigRuleArn: StringWithCharLimit256
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var ExcludedAccounts: js.UndefOr[ExcludedAccounts]
    var LastUpdateTime: js.UndefOr[Date]
    var OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata]
    var OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata]
  }

  object OrganizationConfigRule {
    @inline
    def apply(
        OrganizationConfigRuleArn: StringWithCharLimit256,
        OrganizationConfigRuleName: OrganizationConfigRuleName,
        ExcludedAccounts: js.UndefOr[ExcludedAccounts] = js.undefined,
        LastUpdateTime: js.UndefOr[Date] = js.undefined,
        OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata] = js.undefined,
        OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata] = js.undefined
    ): OrganizationConfigRule = {
      val __obj = js.Dynamic.literal(
        "OrganizationConfigRuleArn"  -> OrganizationConfigRuleArn.asInstanceOf[js.Any],
        "OrganizationConfigRuleName" -> OrganizationConfigRuleName.asInstanceOf[js.Any]
      )

      ExcludedAccounts.foreach(__v => __obj.updateDynamic("ExcludedAccounts")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      OrganizationCustomRuleMetadata.foreach(
        __v => __obj.updateDynamic("OrganizationCustomRuleMetadata")(__v.asInstanceOf[js.Any])
      )
      OrganizationManagedRuleMetadata.foreach(
        __v => __obj.updateDynamic("OrganizationManagedRuleMetadata")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[OrganizationConfigRule]
    }
  }

  /**
    * Returns the status for an organization config rule in an organization.
    */
  @js.native
  trait OrganizationConfigRuleStatus extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var OrganizationRuleStatus: OrganizationRuleStatus
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LastUpdateTime: js.UndefOr[Date]
  }

  object OrganizationConfigRuleStatus {
    @inline
    def apply(
        OrganizationConfigRuleName: OrganizationConfigRuleName,
        OrganizationRuleStatus: OrganizationRuleStatus,
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        LastUpdateTime: js.UndefOr[Date] = js.undefined
    ): OrganizationConfigRuleStatus = {
      val __obj = js.Dynamic.literal(
        "OrganizationConfigRuleName" -> OrganizationConfigRuleName.asInstanceOf[js.Any],
        "OrganizationRuleStatus"     -> OrganizationRuleStatus.asInstanceOf[js.Any]
      )

      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationConfigRuleStatus]
    }
  }

  object OrganizationConfigRuleTriggerTypeEnum {
    val ConfigurationItemChangeNotification          = "ConfigurationItemChangeNotification"
    val OversizedConfigurationItemChangeNotification = "OversizedConfigurationItemChangeNotification"
    val ScheduledNotification                        = "ScheduledNotification"

    val values = js.Object.freeze(
      js.Array(ConfigurationItemChangeNotification, OversizedConfigurationItemChangeNotification, ScheduledNotification)
    )
  }

  /**
    * An object that specifies organization custom rule metadata such as resource type, resource ID of AWS resource, Lamdba function ARN, and organization trigger types that trigger AWS Config to evaluate your AWS resources against a rule. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic.
    */
  @js.native
  trait OrganizationCustomRuleMetadata extends js.Object {
    var LambdaFunctionArn: StringWithCharLimit256
    var OrganizationConfigRuleTriggerTypes: OrganizationConfigRuleTriggerTypes
    var Description: js.UndefOr[StringWithCharLimit256Min0]
    var InputParameters: js.UndefOr[StringWithCharLimit2048]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
    var ResourceIdScope: js.UndefOr[StringWithCharLimit768]
    var ResourceTypesScope: js.UndefOr[ResourceTypesScope]
    var TagKeyScope: js.UndefOr[StringWithCharLimit128]
    var TagValueScope: js.UndefOr[StringWithCharLimit256]
  }

  object OrganizationCustomRuleMetadata {
    @inline
    def apply(
        LambdaFunctionArn: StringWithCharLimit256,
        OrganizationConfigRuleTriggerTypes: OrganizationConfigRuleTriggerTypes,
        Description: js.UndefOr[StringWithCharLimit256Min0] = js.undefined,
        InputParameters: js.UndefOr[StringWithCharLimit2048] = js.undefined,
        MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
        ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.undefined,
        ResourceTypesScope: js.UndefOr[ResourceTypesScope] = js.undefined,
        TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.undefined,
        TagValueScope: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): OrganizationCustomRuleMetadata = {
      val __obj = js.Dynamic.literal(
        "LambdaFunctionArn"                  -> LambdaFunctionArn.asInstanceOf[js.Any],
        "OrganizationConfigRuleTriggerTypes" -> OrganizationConfigRuleTriggerTypes.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InputParameters.foreach(__v => __obj.updateDynamic("InputParameters")(__v.asInstanceOf[js.Any]))
      MaximumExecutionFrequency.foreach(
        __v => __obj.updateDynamic("MaximumExecutionFrequency")(__v.asInstanceOf[js.Any])
      )
      ResourceIdScope.foreach(__v => __obj.updateDynamic("ResourceIdScope")(__v.asInstanceOf[js.Any]))
      ResourceTypesScope.foreach(__v => __obj.updateDynamic("ResourceTypesScope")(__v.asInstanceOf[js.Any]))
      TagKeyScope.foreach(__v => __obj.updateDynamic("TagKeyScope")(__v.asInstanceOf[js.Any]))
      TagValueScope.foreach(__v => __obj.updateDynamic("TagValueScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationCustomRuleMetadata]
    }
  }

  /**
    * An object that specifies organization managed rule metadata such as resource type and ID of AWS resource along with the rule identifier. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic.
    */
  @js.native
  trait OrganizationManagedRuleMetadata extends js.Object {
    var RuleIdentifier: StringWithCharLimit256
    var Description: js.UndefOr[StringWithCharLimit256Min0]
    var InputParameters: js.UndefOr[StringWithCharLimit2048]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
    var ResourceIdScope: js.UndefOr[StringWithCharLimit768]
    var ResourceTypesScope: js.UndefOr[ResourceTypesScope]
    var TagKeyScope: js.UndefOr[StringWithCharLimit128]
    var TagValueScope: js.UndefOr[StringWithCharLimit256]
  }

  object OrganizationManagedRuleMetadata {
    @inline
    def apply(
        RuleIdentifier: StringWithCharLimit256,
        Description: js.UndefOr[StringWithCharLimit256Min0] = js.undefined,
        InputParameters: js.UndefOr[StringWithCharLimit2048] = js.undefined,
        MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
        ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.undefined,
        ResourceTypesScope: js.UndefOr[ResourceTypesScope] = js.undefined,
        TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.undefined,
        TagValueScope: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): OrganizationManagedRuleMetadata = {
      val __obj = js.Dynamic.literal(
        "RuleIdentifier" -> RuleIdentifier.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InputParameters.foreach(__v => __obj.updateDynamic("InputParameters")(__v.asInstanceOf[js.Any]))
      MaximumExecutionFrequency.foreach(
        __v => __obj.updateDynamic("MaximumExecutionFrequency")(__v.asInstanceOf[js.Any])
      )
      ResourceIdScope.foreach(__v => __obj.updateDynamic("ResourceIdScope")(__v.asInstanceOf[js.Any]))
      ResourceTypesScope.foreach(__v => __obj.updateDynamic("ResourceTypesScope")(__v.asInstanceOf[js.Any]))
      TagKeyScope.foreach(__v => __obj.updateDynamic("TagKeyScope")(__v.asInstanceOf[js.Any]))
      TagValueScope.foreach(__v => __obj.updateDynamic("TagValueScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationManagedRuleMetadata]
    }
  }

  object OrganizationRuleStatusEnum {
    val CREATE_SUCCESSFUL  = "CREATE_SUCCESSFUL"
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_FAILED      = "CREATE_FAILED"
    val UPDATE_SUCCESSFUL  = "UPDATE_SUCCESSFUL"
    val UPDATE_FAILED      = "UPDATE_FAILED"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"
    val DELETE_SUCCESSFUL  = "DELETE_SUCCESSFUL"
    val DELETE_FAILED      = "DELETE_FAILED"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"

    val values = js.Object.freeze(
      js.Array(
        CREATE_SUCCESSFUL,
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        UPDATE_SUCCESSFUL,
        UPDATE_FAILED,
        UPDATE_IN_PROGRESS,
        DELETE_SUCCESSFUL,
        DELETE_FAILED,
        DELETE_IN_PROGRESS
      )
    )
  }

  object OwnerEnum {
    val CUSTOM_LAMBDA = "CUSTOM_LAMBDA"
    val AWS           = "AWS"

    val values = js.Object.freeze(js.Array(CUSTOM_LAMBDA, AWS))
  }

  /**
    * An object that represents the account ID and region of an aggregator account that is requesting authorization but is not yet authorized.
    */
  @js.native
  trait PendingAggregationRequest extends js.Object {
    var RequesterAccountId: js.UndefOr[AccountId]
    var RequesterAwsRegion: js.UndefOr[AwsRegion]
  }

  object PendingAggregationRequest {
    @inline
    def apply(
        RequesterAccountId: js.UndefOr[AccountId] = js.undefined,
        RequesterAwsRegion: js.UndefOr[AwsRegion] = js.undefined
    ): PendingAggregationRequest = {
      val __obj = js.Dynamic.literal()
      RequesterAccountId.foreach(__v => __obj.updateDynamic("RequesterAccountId")(__v.asInstanceOf[js.Any]))
      RequesterAwsRegion.foreach(__v => __obj.updateDynamic("RequesterAwsRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingAggregationRequest]
    }
  }

  @js.native
  trait PutAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: AccountId
    var AuthorizedAwsRegion: AwsRegion
    var Tags: js.UndefOr[TagsList]
  }

  object PutAggregationAuthorizationRequest {
    @inline
    def apply(
        AuthorizedAccountId: AccountId,
        AuthorizedAwsRegion: AwsRegion,
        Tags: js.UndefOr[TagsList] = js.undefined
    ): PutAggregationAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizedAccountId" -> AuthorizedAccountId.asInstanceOf[js.Any],
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAggregationAuthorizationRequest]
    }
  }

  @js.native
  trait PutAggregationAuthorizationResponse extends js.Object {
    var AggregationAuthorization: js.UndefOr[AggregationAuthorization]
  }

  object PutAggregationAuthorizationResponse {
    @inline
    def apply(
        AggregationAuthorization: js.UndefOr[AggregationAuthorization] = js.undefined
    ): PutAggregationAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      AggregationAuthorization.foreach(__v => __obj.updateDynamic("AggregationAuthorization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAggregationAuthorizationResponse]
    }
  }

  @js.native
  trait PutConfigRuleRequest extends js.Object {
    var ConfigRule: ConfigRule
    var Tags: js.UndefOr[TagsList]
  }

  object PutConfigRuleRequest {
    @inline
    def apply(
        ConfigRule: ConfigRule,
        Tags: js.UndefOr[TagsList] = js.undefined
    ): PutConfigRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRule" -> ConfigRule.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigRuleRequest]
    }
  }

  @js.native
  trait PutConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
    var Tags: js.UndefOr[TagsList]
  }

  object PutConfigurationAggregatorRequest {
    @inline
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined,
        OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined,
        Tags: js.UndefOr[TagsList] = js.undefined
    ): PutConfigurationAggregatorRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      AccountAggregationSources.foreach(
        __v => __obj.updateDynamic("AccountAggregationSources")(__v.asInstanceOf[js.Any])
      )
      OrganizationAggregationSource.foreach(
        __v => __obj.updateDynamic("OrganizationAggregationSource")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationAggregatorRequest]
    }
  }

  @js.native
  trait PutConfigurationAggregatorResponse extends js.Object {
    var ConfigurationAggregator: js.UndefOr[ConfigurationAggregator]
  }

  object PutConfigurationAggregatorResponse {
    @inline
    def apply(
        ConfigurationAggregator: js.UndefOr[ConfigurationAggregator] = js.undefined
    ): PutConfigurationAggregatorResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationAggregator.foreach(__v => __obj.updateDynamic("ConfigurationAggregator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationAggregatorResponse]
    }
  }

  /**
    * The input for the <a>PutConfigurationRecorder</a> action.
    */
  @js.native
  trait PutConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorder: ConfigurationRecorder
  }

  object PutConfigurationRecorderRequest {
    @inline
    def apply(
        ConfigurationRecorder: ConfigurationRecorder
    ): PutConfigurationRecorderRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationRecorder" -> ConfigurationRecorder.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutConfigurationRecorderRequest]
    }
  }

  /**
    * The input for the <a>PutDeliveryChannel</a> action.
    */
  @js.native
  trait PutDeliveryChannelRequest extends js.Object {
    var DeliveryChannel: DeliveryChannel
  }

  object PutDeliveryChannelRequest {
    @inline
    def apply(
        DeliveryChannel: DeliveryChannel
    ): PutDeliveryChannelRequest = {
      val __obj = js.Dynamic.literal(
        "DeliveryChannel" -> DeliveryChannel.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutDeliveryChannelRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait PutEvaluationsRequest extends js.Object {
    var ResultToken: String
    var Evaluations: js.UndefOr[Evaluations]
    var TestMode: js.UndefOr[Boolean]
  }

  object PutEvaluationsRequest {
    @inline
    def apply(
        ResultToken: String,
        Evaluations: js.UndefOr[Evaluations] = js.undefined,
        TestMode: js.UndefOr[Boolean] = js.undefined
    ): PutEvaluationsRequest = {
      val __obj = js.Dynamic.literal(
        "ResultToken" -> ResultToken.asInstanceOf[js.Any]
      )

      Evaluations.foreach(__v => __obj.updateDynamic("Evaluations")(__v.asInstanceOf[js.Any]))
      TestMode.foreach(__v => __obj.updateDynamic("TestMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEvaluationsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait PutEvaluationsResponse extends js.Object {
    var FailedEvaluations: js.UndefOr[Evaluations]
  }

  object PutEvaluationsResponse {
    @inline
    def apply(
        FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
    ): PutEvaluationsResponse = {
      val __obj = js.Dynamic.literal()
      FailedEvaluations.foreach(__v => __obj.updateDynamic("FailedEvaluations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEvaluationsResponse]
    }
  }

  @js.native
  trait PutOrganizationConfigRuleRequest extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var ExcludedAccounts: js.UndefOr[ExcludedAccounts]
    var OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata]
    var OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata]
  }

  object PutOrganizationConfigRuleRequest {
    @inline
    def apply(
        OrganizationConfigRuleName: OrganizationConfigRuleName,
        ExcludedAccounts: js.UndefOr[ExcludedAccounts] = js.undefined,
        OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata] = js.undefined,
        OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata] = js.undefined
    ): PutOrganizationConfigRuleRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationConfigRuleName" -> OrganizationConfigRuleName.asInstanceOf[js.Any]
      )

      ExcludedAccounts.foreach(__v => __obj.updateDynamic("ExcludedAccounts")(__v.asInstanceOf[js.Any]))
      OrganizationCustomRuleMetadata.foreach(
        __v => __obj.updateDynamic("OrganizationCustomRuleMetadata")(__v.asInstanceOf[js.Any])
      )
      OrganizationManagedRuleMetadata.foreach(
        __v => __obj.updateDynamic("OrganizationManagedRuleMetadata")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutOrganizationConfigRuleRequest]
    }
  }

  @js.native
  trait PutOrganizationConfigRuleResponse extends js.Object {
    var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256]
  }

  object PutOrganizationConfigRuleResponse {
    @inline
    def apply(
        OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): PutOrganizationConfigRuleResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationConfigRuleArn.foreach(
        __v => __obj.updateDynamic("OrganizationConfigRuleArn")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
    }
  }

  @js.native
  trait PutRemediationConfigurationsRequest extends js.Object {
    var RemediationConfigurations: RemediationConfigurations
  }

  object PutRemediationConfigurationsRequest {
    @inline
    def apply(
        RemediationConfigurations: RemediationConfigurations
    ): PutRemediationConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "RemediationConfigurations" -> RemediationConfigurations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRemediationConfigurationsRequest]
    }
  }

  @js.native
  trait PutRemediationConfigurationsResponse extends js.Object {
    var FailedBatches: js.UndefOr[FailedRemediationBatches]
  }

  object PutRemediationConfigurationsResponse {
    @inline
    def apply(
        FailedBatches: js.UndefOr[FailedRemediationBatches] = js.undefined
    ): PutRemediationConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      FailedBatches.foreach(__v => __obj.updateDynamic("FailedBatches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRemediationConfigurationsResponse]
    }
  }

  @js.native
  trait PutRemediationExceptionsRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceKeys: RemediationExceptionResourceKeys
    var ExpirationTime: js.UndefOr[Date]
    var Message: js.UndefOr[StringWithCharLimit1024]
  }

  object PutRemediationExceptionsRequest {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        ResourceKeys: RemediationExceptionResourceKeys,
        ExpirationTime: js.UndefOr[Date] = js.undefined,
        Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
    ): PutRemediationExceptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "ResourceKeys"   -> ResourceKeys.asInstanceOf[js.Any]
      )

      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRemediationExceptionsRequest]
    }
  }

  @js.native
  trait PutRemediationExceptionsResponse extends js.Object {
    var FailedBatches: js.UndefOr[FailedRemediationExceptionBatches]
  }

  object PutRemediationExceptionsResponse {
    @inline
    def apply(
        FailedBatches: js.UndefOr[FailedRemediationExceptionBatches] = js.undefined
    ): PutRemediationExceptionsResponse = {
      val __obj = js.Dynamic.literal()
      FailedBatches.foreach(__v => __obj.updateDynamic("FailedBatches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRemediationExceptionsResponse]
    }
  }

  @js.native
  trait PutRetentionConfigurationRequest extends js.Object {
    var RetentionPeriodInDays: RetentionPeriodInDays
  }

  object PutRetentionConfigurationRequest {
    @inline
    def apply(
        RetentionPeriodInDays: RetentionPeriodInDays
    ): PutRetentionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "RetentionPeriodInDays" -> RetentionPeriodInDays.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRetentionConfigurationRequest]
    }
  }

  @js.native
  trait PutRetentionConfigurationResponse extends js.Object {
    var RetentionConfiguration: js.UndefOr[RetentionConfiguration]
  }

  object PutRetentionConfigurationResponse {
    @inline
    def apply(
        RetentionConfiguration: js.UndefOr[RetentionConfiguration] = js.undefined
    ): PutRetentionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      RetentionConfiguration.foreach(__v => __obj.updateDynamic("RetentionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRetentionConfigurationResponse]
    }
  }

  /**
    * Details about the query.
    */
  @js.native
  trait QueryInfo extends js.Object {
    var SelectFields: js.UndefOr[FieldInfoList]
  }

  object QueryInfo {
    @inline
    def apply(
        SelectFields: js.UndefOr[FieldInfoList] = js.undefined
    ): QueryInfo = {
      val __obj = js.Dynamic.literal()
      SelectFields.foreach(__v => __obj.updateDynamic("SelectFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryInfo]
    }
  }

  object RecorderStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failure = "Failure"

    val values = js.Object.freeze(js.Array(Pending, Success, Failure))
  }

  /**
    * Specifies the types of AWS resource for which AWS Config records configuration changes.
    *  In the recording group, you specify whether all supported types or specific types of resources are recorded.
    *  By default, AWS Config records configuration changes for all supported types of regional resources that AWS Config discovers in the region in which it is running. Regional resources are tied to a region and can be used only in that region. Examples of regional resources are EC2 instances and EBS volumes.
    *  You can also have AWS Config record configuration changes for supported types of global resources (for example, IAM resources). Global resources are not tied to an individual region and can be used in all regions.
    *  <important> The configuration details for any global resource are the same in all regions. If you customize AWS Config in multiple regions to record global resources, it will create multiple configuration items each time a global resource changes: one configuration item for each region. These configuration items will contain identical data. To prevent duplicate configuration items, you should consider customizing AWS Config in only one region to record global resources, unless you want the configuration items to be available in multiple regions.
    *  </important> If you don't want AWS Config to record all resources, you can specify which types of resources it will record with the <code>resourceTypes</code> parameter.
    *  For a list of supported resource types, see [[https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources|Supported Resource Types]].
    *  For more information, see [[https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html|Selecting Which Resources AWS Config Records]].
    */
  @js.native
  trait RecordingGroup extends js.Object {
    var allSupported: js.UndefOr[AllSupported]
    var includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes]
    var resourceTypes: js.UndefOr[ResourceTypeList]
  }

  object RecordingGroup {
    @inline
    def apply(
        allSupported: js.UndefOr[AllSupported] = js.undefined,
        includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.undefined,
        resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
    ): RecordingGroup = {
      val __obj = js.Dynamic.literal()
      allSupported.foreach(__v => __obj.updateDynamic("allSupported")(__v.asInstanceOf[js.Any]))
      includeGlobalResourceTypes.foreach(
        __v => __obj.updateDynamic("includeGlobalResourceTypes")(__v.asInstanceOf[js.Any])
      )
      resourceTypes.foreach(__v => __obj.updateDynamic("resourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordingGroup]
    }
  }

  /**
    * The relationship of the related resource to the main resource.
    */
  @js.native
  trait Relationship extends js.Object {
    var relationshipName: js.UndefOr[RelationshipName]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
  }

  object Relationship {
    @inline
    def apply(
        relationshipName: js.UndefOr[RelationshipName] = js.undefined,
        resourceId: js.UndefOr[ResourceId] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): Relationship = {
      val __obj = js.Dynamic.literal()
      relationshipName.foreach(__v => __obj.updateDynamic("relationshipName")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relationship]
    }
  }

  /**
    * An object that represents the details about the remediation configuration that includes the remediation action, parameters, and data to execute the action.
    */
  @js.native
  trait RemediationConfiguration extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var TargetId: StringWithCharLimit256
    var TargetType: RemediationTargetType
    var Arn: js.UndefOr[StringWithCharLimit1024]
    var Automatic: js.UndefOr[Boolean]
    var CreatedByService: js.UndefOr[StringWithCharLimit1024]
    var ExecutionControls: js.UndefOr[ExecutionControls]
    var MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts]
    var Parameters: js.UndefOr[RemediationParameters]
    var ResourceType: js.UndefOr[String]
    var RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds]
    var TargetVersion: js.UndefOr[String]
  }

  object RemediationConfiguration {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        TargetId: StringWithCharLimit256,
        TargetType: RemediationTargetType,
        Arn: js.UndefOr[StringWithCharLimit1024] = js.undefined,
        Automatic: js.UndefOr[Boolean] = js.undefined,
        CreatedByService: js.UndefOr[StringWithCharLimit1024] = js.undefined,
        ExecutionControls: js.UndefOr[ExecutionControls] = js.undefined,
        MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts] = js.undefined,
        Parameters: js.UndefOr[RemediationParameters] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined,
        RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds] = js.undefined,
        TargetVersion: js.UndefOr[String] = js.undefined
    ): RemediationConfiguration = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "TargetId"       -> TargetId.asInstanceOf[js.Any],
        "TargetType"     -> TargetType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Automatic.foreach(__v => __obj.updateDynamic("Automatic")(__v.asInstanceOf[js.Any]))
      CreatedByService.foreach(__v => __obj.updateDynamic("CreatedByService")(__v.asInstanceOf[js.Any]))
      ExecutionControls.foreach(__v => __obj.updateDynamic("ExecutionControls")(__v.asInstanceOf[js.Any]))
      MaximumAutomaticAttempts.foreach(__v => __obj.updateDynamic("MaximumAutomaticAttempts")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      RetryAttemptSeconds.foreach(__v => __obj.updateDynamic("RetryAttemptSeconds")(__v.asInstanceOf[js.Any]))
      TargetVersion.foreach(__v => __obj.updateDynamic("TargetVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationConfiguration]
    }
  }

  /**
    * An object that represents the details about the remediation exception. The details include the rule name, an explanation of an exception, the time when the exception will be deleted, the resource ID, and resource type.
    */
  @js.native
  trait RemediationException extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceId: StringWithCharLimit1024
    var ResourceType: StringWithCharLimit256
    var ExpirationTime: js.UndefOr[Date]
    var Message: js.UndefOr[StringWithCharLimit1024]
  }

  object RemediationException {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        ResourceId: StringWithCharLimit1024,
        ResourceType: StringWithCharLimit256,
        ExpirationTime: js.UndefOr[Date] = js.undefined,
        Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
    ): RemediationException = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "ResourceId"     -> ResourceId.asInstanceOf[js.Any],
        "ResourceType"   -> ResourceType.asInstanceOf[js.Any]
      )

      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationException]
    }
  }

  /**
    * The details that identify a resource within AWS Config, including the resource type and resource ID.
    */
  @js.native
  trait RemediationExceptionResourceKey extends js.Object {
    var ResourceId: js.UndefOr[StringWithCharLimit1024]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  object RemediationExceptionResourceKey {
    @inline
    def apply(
        ResourceId: js.UndefOr[StringWithCharLimit1024] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): RemediationExceptionResourceKey = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationExceptionResourceKey]
    }
  }

  object RemediationExecutionStateEnum {
    val QUEUED      = "QUEUED"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED))
  }

  /**
    * Provides details of the current status of the invoked remediation action for that resource.
    */
  @js.native
  trait RemediationExecutionStatus extends js.Object {
    var InvocationTime: js.UndefOr[Date]
    var LastUpdatedTime: js.UndefOr[Date]
    var ResourceKey: js.UndefOr[ResourceKey]
    var State: js.UndefOr[RemediationExecutionState]
    var StepDetails: js.UndefOr[RemediationExecutionSteps]
  }

  object RemediationExecutionStatus {
    @inline
    def apply(
        InvocationTime: js.UndefOr[Date] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        ResourceKey: js.UndefOr[ResourceKey] = js.undefined,
        State: js.UndefOr[RemediationExecutionState] = js.undefined,
        StepDetails: js.UndefOr[RemediationExecutionSteps] = js.undefined
    ): RemediationExecutionStatus = {
      val __obj = js.Dynamic.literal()
      InvocationTime.foreach(__v => __obj.updateDynamic("InvocationTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      ResourceKey.foreach(__v => __obj.updateDynamic("ResourceKey")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StepDetails.foreach(__v => __obj.updateDynamic("StepDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationExecutionStatus]
    }
  }

  /**
    * Name of the step from the SSM document.
    */
  @js.native
  trait RemediationExecutionStep extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var StartTime: js.UndefOr[Date]
    var State: js.UndefOr[RemediationExecutionStepState]
    var StopTime: js.UndefOr[Date]
  }

  object RemediationExecutionStep {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[RemediationExecutionStepState] = js.undefined,
        StopTime: js.UndefOr[Date] = js.undefined
    ): RemediationExecutionStep = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StopTime.foreach(__v => __obj.updateDynamic("StopTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationExecutionStep]
    }
  }

  object RemediationExecutionStepStateEnum {
    val SUCCEEDED = "SUCCEEDED"
    val PENDING   = "PENDING"
    val FAILED    = "FAILED"

    val values = js.Object.freeze(js.Array(SUCCEEDED, PENDING, FAILED))
  }

  /**
    * The value is either a dynamic (resource) value or a static value. You must select either a dynamic value or a static value.
    */
  @js.native
  trait RemediationParameterValue extends js.Object {
    var ResourceValue: js.UndefOr[ResourceValue]
    var StaticValue: js.UndefOr[StaticValue]
  }

  object RemediationParameterValue {
    @inline
    def apply(
        ResourceValue: js.UndefOr[ResourceValue] = js.undefined,
        StaticValue: js.UndefOr[StaticValue] = js.undefined
    ): RemediationParameterValue = {
      val __obj = js.Dynamic.literal()
      ResourceValue.foreach(__v => __obj.updateDynamic("ResourceValue")(__v.asInstanceOf[js.Any]))
      StaticValue.foreach(__v => __obj.updateDynamic("StaticValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationParameterValue]
    }
  }

  object RemediationTargetTypeEnum {
    val SSM_DOCUMENT = "SSM_DOCUMENT"

    val values = js.Object.freeze(js.Array(SSM_DOCUMENT))
  }

  /**
    * An object that contains the resource type and the number of resources.
    */
  @js.native
  trait ResourceCount extends js.Object {
    var count: js.UndefOr[Double]
    var resourceType: js.UndefOr[ResourceType]
  }

  object ResourceCount {
    @inline
    def apply(
        count: js.UndefOr[Double] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceCount = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCount]
    }
  }

  /**
    * Filters the resource count based on account ID, region, and resource type.
    */
  @js.native
  trait ResourceCountFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Region: js.UndefOr[AwsRegion]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceCountFilters {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Region: js.UndefOr[AwsRegion] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceCountFilters = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCountFilters]
    }
  }

  object ResourceCountGroupKeyEnum {
    val RESOURCE_TYPE = "RESOURCE_TYPE"
    val ACCOUNT_ID    = "ACCOUNT_ID"
    val AWS_REGION    = "AWS_REGION"

    val values = js.Object.freeze(js.Array(RESOURCE_TYPE, ACCOUNT_ID, AWS_REGION))
  }

  /**
    * Filters the results by resource account ID, region, resource ID, and resource name.
    */
  @js.native
  trait ResourceFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Region: js.UndefOr[AwsRegion]
    var ResourceId: js.UndefOr[ResourceId]
    var ResourceName: js.UndefOr[ResourceName]
  }

  object ResourceFilters {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Region: js.UndefOr[AwsRegion] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        ResourceName: js.UndefOr[ResourceName] = js.undefined
    ): ResourceFilters = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceFilters]
    }
  }

  /**
    * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.
    */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var resourceDeletionTime: js.UndefOr[ResourceDeletionTime]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
  }

  object ResourceIdentifier {
    @inline
    def apply(
        resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined,
        resourceId: js.UndefOr[ResourceId] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceIdentifier = {
      val __obj = js.Dynamic.literal()
      resourceDeletionTime.foreach(__v => __obj.updateDynamic("resourceDeletionTime")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIdentifier]
    }
  }

  /**
    * The details that identify a resource within AWS Config, including the resource type and resource ID.
    */
  @js.native
  trait ResourceKey extends js.Object {
    var resourceId: ResourceId
    var resourceType: ResourceType
  }

  object ResourceKey {
    @inline
    def apply(
        resourceId: ResourceId,
        resourceType: ResourceType
    ): ResourceKey = {
      val __obj = js.Dynamic.literal(
        "resourceId"   -> resourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceKey]
    }
  }

  object ResourceTypeEnum {
    val `AWS::EC2::CustomerGateway`                 = "AWS::EC2::CustomerGateway"
    val `AWS::EC2::EIP`                             = "AWS::EC2::EIP"
    val `AWS::EC2::Host`                            = "AWS::EC2::Host"
    val `AWS::EC2::Instance`                        = "AWS::EC2::Instance"
    val `AWS::EC2::InternetGateway`                 = "AWS::EC2::InternetGateway"
    val `AWS::EC2::NetworkAcl`                      = "AWS::EC2::NetworkAcl"
    val `AWS::EC2::NetworkInterface`                = "AWS::EC2::NetworkInterface"
    val `AWS::EC2::RouteTable`                      = "AWS::EC2::RouteTable"
    val `AWS::EC2::SecurityGroup`                   = "AWS::EC2::SecurityGroup"
    val `AWS::EC2::Subnet`                          = "AWS::EC2::Subnet"
    val `AWS::CloudTrail::Trail`                    = "AWS::CloudTrail::Trail"
    val `AWS::EC2::Volume`                          = "AWS::EC2::Volume"
    val `AWS::EC2::VPC`                             = "AWS::EC2::VPC"
    val `AWS::EC2::VPNConnection`                   = "AWS::EC2::VPNConnection"
    val `AWS::EC2::VPNGateway`                      = "AWS::EC2::VPNGateway"
    val `AWS::EC2::RegisteredHAInstance`            = "AWS::EC2::RegisteredHAInstance"
    val `AWS::EC2::NatGateway`                      = "AWS::EC2::NatGateway"
    val `AWS::EC2::EgressOnlyInternetGateway`       = "AWS::EC2::EgressOnlyInternetGateway"
    val `AWS::EC2::VPCEndpoint`                     = "AWS::EC2::VPCEndpoint"
    val `AWS::EC2::VPCEndpointService`              = "AWS::EC2::VPCEndpointService"
    val `AWS::EC2::FlowLog`                         = "AWS::EC2::FlowLog"
    val `AWS::EC2::VPCPeeringConnection`            = "AWS::EC2::VPCPeeringConnection"
    val `AWS::IAM::Group`                           = "AWS::IAM::Group"
    val `AWS::IAM::Policy`                          = "AWS::IAM::Policy"
    val `AWS::IAM::Role`                            = "AWS::IAM::Role"
    val `AWS::IAM::User`                            = "AWS::IAM::User"
    val `AWS::ElasticLoadBalancingV2::LoadBalancer` = "AWS::ElasticLoadBalancingV2::LoadBalancer"
    val `AWS::ACM::Certificate`                     = "AWS::ACM::Certificate"
    val `AWS::RDS::DBInstance`                      = "AWS::RDS::DBInstance"
    val `AWS::RDS::DBParameterGroup`                = "AWS::RDS::DBParameterGroup"
    val `AWS::RDS::DBOptionGroup`                   = "AWS::RDS::DBOptionGroup"
    val `AWS::RDS::DBSubnetGroup`                   = "AWS::RDS::DBSubnetGroup"
    val `AWS::RDS::DBSecurityGroup`                 = "AWS::RDS::DBSecurityGroup"
    val `AWS::RDS::DBSnapshot`                      = "AWS::RDS::DBSnapshot"
    val `AWS::RDS::DBCluster`                       = "AWS::RDS::DBCluster"
    val `AWS::RDS::DBClusterParameterGroup`         = "AWS::RDS::DBClusterParameterGroup"
    val `AWS::RDS::DBClusterSnapshot`               = "AWS::RDS::DBClusterSnapshot"
    val `AWS::RDS::EventSubscription`               = "AWS::RDS::EventSubscription"
    val `AWS::S3::Bucket`                           = "AWS::S3::Bucket"
    val `AWS::S3::AccountPublicAccessBlock`         = "AWS::S3::AccountPublicAccessBlock"
    val `AWS::Redshift::Cluster`                    = "AWS::Redshift::Cluster"
    val `AWS::Redshift::ClusterSnapshot`            = "AWS::Redshift::ClusterSnapshot"
    val `AWS::Redshift::ClusterParameterGroup`      = "AWS::Redshift::ClusterParameterGroup"
    val `AWS::Redshift::ClusterSecurityGroup`       = "AWS::Redshift::ClusterSecurityGroup"
    val `AWS::Redshift::ClusterSubnetGroup`         = "AWS::Redshift::ClusterSubnetGroup"
    val `AWS::Redshift::EventSubscription`          = "AWS::Redshift::EventSubscription"
    val `AWS::SSM::ManagedInstanceInventory`        = "AWS::SSM::ManagedInstanceInventory"
    val `AWS::CloudWatch::Alarm`                    = "AWS::CloudWatch::Alarm"
    val `AWS::CloudFormation::Stack`                = "AWS::CloudFormation::Stack"
    val `AWS::ElasticLoadBalancing::LoadBalancer`   = "AWS::ElasticLoadBalancing::LoadBalancer"
    val `AWS::AutoScaling::AutoScalingGroup`        = "AWS::AutoScaling::AutoScalingGroup"
    val `AWS::AutoScaling::LaunchConfiguration`     = "AWS::AutoScaling::LaunchConfiguration"
    val `AWS::AutoScaling::ScalingPolicy`           = "AWS::AutoScaling::ScalingPolicy"
    val `AWS::AutoScaling::ScheduledAction`         = "AWS::AutoScaling::ScheduledAction"
    val `AWS::DynamoDB::Table`                      = "AWS::DynamoDB::Table"
    val `AWS::CodeBuild::Project`                   = "AWS::CodeBuild::Project"
    val `AWS::WAF::RateBasedRule`                   = "AWS::WAF::RateBasedRule"
    val `AWS::WAF::Rule`                            = "AWS::WAF::Rule"
    val `AWS::WAF::RuleGroup`                       = "AWS::WAF::RuleGroup"
    val `AWS::WAF::WebACL`                          = "AWS::WAF::WebACL"
    val `AWS::WAFRegional::RateBasedRule`           = "AWS::WAFRegional::RateBasedRule"
    val `AWS::WAFRegional::Rule`                    = "AWS::WAFRegional::Rule"
    val `AWS::WAFRegional::RuleGroup`               = "AWS::WAFRegional::RuleGroup"
    val `AWS::WAFRegional::WebACL`                  = "AWS::WAFRegional::WebACL"
    val `AWS::CloudFront::Distribution`             = "AWS::CloudFront::Distribution"
    val `AWS::CloudFront::StreamingDistribution`    = "AWS::CloudFront::StreamingDistribution"
    val `AWS::Lambda::Alias`                        = "AWS::Lambda::Alias"
    val `AWS::Lambda::Function`                     = "AWS::Lambda::Function"
    val `AWS::ElasticBeanstalk::Application`        = "AWS::ElasticBeanstalk::Application"
    val `AWS::ElasticBeanstalk::ApplicationVersion` = "AWS::ElasticBeanstalk::ApplicationVersion"
    val `AWS::ElasticBeanstalk::Environment`        = "AWS::ElasticBeanstalk::Environment"
    val `AWS::MobileHub::Project`                   = "AWS::MobileHub::Project"
    val `AWS::XRay::EncryptionConfig`               = "AWS::XRay::EncryptionConfig"
    val `AWS::SSM::AssociationCompliance`           = "AWS::SSM::AssociationCompliance"
    val `AWS::SSM::PatchCompliance`                 = "AWS::SSM::PatchCompliance"
    val `AWS::Shield::Protection`                   = "AWS::Shield::Protection"
    val `AWS::ShieldRegional::Protection`           = "AWS::ShieldRegional::Protection"
    val `AWS::Config::ResourceCompliance`           = "AWS::Config::ResourceCompliance"
    val `AWS::LicenseManager::LicenseConfiguration` = "AWS::LicenseManager::LicenseConfiguration"
    val `AWS::ApiGateway::DomainName`               = "AWS::ApiGateway::DomainName"
    val `AWS::ApiGateway::Method`                   = "AWS::ApiGateway::Method"
    val `AWS::ApiGateway::Stage`                    = "AWS::ApiGateway::Stage"
    val `AWS::ApiGateway::RestApi`                  = "AWS::ApiGateway::RestApi"
    val `AWS::ApiGatewayV2::DomainName`             = "AWS::ApiGatewayV2::DomainName"
    val `AWS::ApiGatewayV2::Stage`                  = "AWS::ApiGatewayV2::Stage"
    val `AWS::ApiGatewayV2::Api`                    = "AWS::ApiGatewayV2::Api"
    val `AWS::CodePipeline::Pipeline`               = "AWS::CodePipeline::Pipeline"
    val `AWS::ServiceCatalog::CloudFormationProvisionedProduct` =
      "AWS::ServiceCatalog::CloudFormationProvisionedProduct"
    val `AWS::ServiceCatalog::CloudFormationProduct` = "AWS::ServiceCatalog::CloudFormationProduct"
    val `AWS::ServiceCatalog::Portfolio`             = "AWS::ServiceCatalog::Portfolio"

    val values = js.Object.freeze(
      js.Array(
        `AWS::EC2::CustomerGateway`,
        `AWS::EC2::EIP`,
        `AWS::EC2::Host`,
        `AWS::EC2::Instance`,
        `AWS::EC2::InternetGateway`,
        `AWS::EC2::NetworkAcl`,
        `AWS::EC2::NetworkInterface`,
        `AWS::EC2::RouteTable`,
        `AWS::EC2::SecurityGroup`,
        `AWS::EC2::Subnet`,
        `AWS::CloudTrail::Trail`,
        `AWS::EC2::Volume`,
        `AWS::EC2::VPC`,
        `AWS::EC2::VPNConnection`,
        `AWS::EC2::VPNGateway`,
        `AWS::EC2::RegisteredHAInstance`,
        `AWS::EC2::NatGateway`,
        `AWS::EC2::EgressOnlyInternetGateway`,
        `AWS::EC2::VPCEndpoint`,
        `AWS::EC2::VPCEndpointService`,
        `AWS::EC2::FlowLog`,
        `AWS::EC2::VPCPeeringConnection`,
        `AWS::IAM::Group`,
        `AWS::IAM::Policy`,
        `AWS::IAM::Role`,
        `AWS::IAM::User`,
        `AWS::ElasticLoadBalancingV2::LoadBalancer`,
        `AWS::ACM::Certificate`,
        `AWS::RDS::DBInstance`,
        `AWS::RDS::DBParameterGroup`,
        `AWS::RDS::DBOptionGroup`,
        `AWS::RDS::DBSubnetGroup`,
        `AWS::RDS::DBSecurityGroup`,
        `AWS::RDS::DBSnapshot`,
        `AWS::RDS::DBCluster`,
        `AWS::RDS::DBClusterParameterGroup`,
        `AWS::RDS::DBClusterSnapshot`,
        `AWS::RDS::EventSubscription`,
        `AWS::S3::Bucket`,
        `AWS::S3::AccountPublicAccessBlock`,
        `AWS::Redshift::Cluster`,
        `AWS::Redshift::ClusterSnapshot`,
        `AWS::Redshift::ClusterParameterGroup`,
        `AWS::Redshift::ClusterSecurityGroup`,
        `AWS::Redshift::ClusterSubnetGroup`,
        `AWS::Redshift::EventSubscription`,
        `AWS::SSM::ManagedInstanceInventory`,
        `AWS::CloudWatch::Alarm`,
        `AWS::CloudFormation::Stack`,
        `AWS::ElasticLoadBalancing::LoadBalancer`,
        `AWS::AutoScaling::AutoScalingGroup`,
        `AWS::AutoScaling::LaunchConfiguration`,
        `AWS::AutoScaling::ScalingPolicy`,
        `AWS::AutoScaling::ScheduledAction`,
        `AWS::DynamoDB::Table`,
        `AWS::CodeBuild::Project`,
        `AWS::WAF::RateBasedRule`,
        `AWS::WAF::Rule`,
        `AWS::WAF::RuleGroup`,
        `AWS::WAF::WebACL`,
        `AWS::WAFRegional::RateBasedRule`,
        `AWS::WAFRegional::Rule`,
        `AWS::WAFRegional::RuleGroup`,
        `AWS::WAFRegional::WebACL`,
        `AWS::CloudFront::Distribution`,
        `AWS::CloudFront::StreamingDistribution`,
        `AWS::Lambda::Alias`,
        `AWS::Lambda::Function`,
        `AWS::ElasticBeanstalk::Application`,
        `AWS::ElasticBeanstalk::ApplicationVersion`,
        `AWS::ElasticBeanstalk::Environment`,
        `AWS::MobileHub::Project`,
        `AWS::XRay::EncryptionConfig`,
        `AWS::SSM::AssociationCompliance`,
        `AWS::SSM::PatchCompliance`,
        `AWS::Shield::Protection`,
        `AWS::ShieldRegional::Protection`,
        `AWS::Config::ResourceCompliance`,
        `AWS::LicenseManager::LicenseConfiguration`,
        `AWS::ApiGateway::DomainName`,
        `AWS::ApiGateway::Method`,
        `AWS::ApiGateway::Stage`,
        `AWS::ApiGateway::RestApi`,
        `AWS::ApiGatewayV2::DomainName`,
        `AWS::ApiGatewayV2::Stage`,
        `AWS::ApiGatewayV2::Api`,
        `AWS::CodePipeline::Pipeline`,
        `AWS::ServiceCatalog::CloudFormationProvisionedProduct`,
        `AWS::ServiceCatalog::CloudFormationProduct`,
        `AWS::ServiceCatalog::Portfolio`
      )
    )
  }

  /**
    * The dynamic value of the resource.
    */
  @js.native
  trait ResourceValue extends js.Object {
    var Value: ResourceValueType
  }

  object ResourceValue {
    @inline
    def apply(
        Value: ResourceValueType
    ): ResourceValue = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceValue]
    }
  }

  object ResourceValueTypeEnum {
    val RESOURCE_ID = "RESOURCE_ID"

    val values = js.Object.freeze(js.Array(RESOURCE_ID))
  }

  /**
    * An object with the name of the retention configuration and the retention period in days. The object stores the configuration for data retention in AWS Config.
    */
  @js.native
  trait RetentionConfiguration extends js.Object {
    var Name: RetentionConfigurationName
    var RetentionPeriodInDays: RetentionPeriodInDays
  }

  object RetentionConfiguration {
    @inline
    def apply(
        Name: RetentionConfigurationName,
        RetentionPeriodInDays: RetentionPeriodInDays
    ): RetentionConfiguration = {
      val __obj = js.Dynamic.literal(
        "Name"                  -> Name.asInstanceOf[js.Any],
        "RetentionPeriodInDays" -> RetentionPeriodInDays.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RetentionConfiguration]
    }
  }

  /**
    * Defines which resources trigger an evaluation for an AWS Config rule. The scope can include one or more resource types, a combination of a tag key and value, or a combination of one resource type and one resource ID. Specify a scope to constrain which resources trigger an evaluation for a rule. Otherwise, evaluations for the rule are triggered when any resource in your recording group changes in configuration.
    */
  @js.native
  trait Scope extends js.Object {
    var ComplianceResourceId: js.UndefOr[BaseResourceId]
    var ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes]
    var TagKey: js.UndefOr[StringWithCharLimit128]
    var TagValue: js.UndefOr[StringWithCharLimit256]
  }

  object Scope {
    @inline
    def apply(
        ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes] = js.undefined,
        TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined,
        TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): Scope = {
      val __obj = js.Dynamic.literal()
      ComplianceResourceId.foreach(__v => __obj.updateDynamic("ComplianceResourceId")(__v.asInstanceOf[js.Any]))
      ComplianceResourceTypes.foreach(__v => __obj.updateDynamic("ComplianceResourceTypes")(__v.asInstanceOf[js.Any]))
      TagKey.foreach(__v => __obj.updateDynamic("TagKey")(__v.asInstanceOf[js.Any]))
      TagValue.foreach(__v => __obj.updateDynamic("TagValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scope]
    }
  }

  @js.native
  trait SelectResourceConfigRequest extends js.Object {
    var Expression: Expression
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object SelectResourceConfigRequest {
    @inline
    def apply(
        Expression: Expression,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SelectResourceConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectResourceConfigRequest]
    }
  }

  @js.native
  trait SelectResourceConfigResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryInfo: js.UndefOr[QueryInfo]
    var Results: js.UndefOr[Results]
  }

  object SelectResourceConfigResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryInfo: js.UndefOr[QueryInfo] = js.undefined,
        Results: js.UndefOr[Results] = js.undefined
    ): SelectResourceConfigResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryInfo.foreach(__v => __obj.updateDynamic("QueryInfo")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectResourceConfigResponse]
    }
  }

  /**
    * Provides the AWS Config rule owner (AWS or customer), the rule identifier, and the events that trigger the evaluation of your AWS resources.
    */
  @js.native
  trait Source extends js.Object {
    var Owner: Owner
    var SourceIdentifier: StringWithCharLimit256
    var SourceDetails: js.UndefOr[SourceDetails]
  }

  object Source {
    @inline
    def apply(
        Owner: Owner,
        SourceIdentifier: StringWithCharLimit256,
        SourceDetails: js.UndefOr[SourceDetails] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal(
        "Owner"            -> Owner.asInstanceOf[js.Any],
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any]
      )

      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  /**
    * Provides the source and the message types that trigger AWS Config to evaluate your AWS resources against a rule. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic. You can specify the parameter values for <code>SourceDetail</code> only for custom rules.
    */
  @js.native
  trait SourceDetail extends js.Object {
    var EventSource: js.UndefOr[EventSource]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
    var MessageType: js.UndefOr[MessageType]
  }

  object SourceDetail {
    @inline
    def apply(
        EventSource: js.UndefOr[EventSource] = js.undefined,
        MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined
    ): SourceDetail = {
      val __obj = js.Dynamic.literal()
      EventSource.foreach(__v => __obj.updateDynamic("EventSource")(__v.asInstanceOf[js.Any]))
      MaximumExecutionFrequency.foreach(
        __v => __obj.updateDynamic("MaximumExecutionFrequency")(__v.asInstanceOf[js.Any])
      )
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceDetail]
    }
  }

  /**
    * AWS Systems Manager (SSM) specific remediation controls.
    */
  @js.native
  trait SsmControls extends js.Object {
    var ConcurrentExecutionRatePercentage: js.UndefOr[Percentage]
    var ErrorPercentage: js.UndefOr[Percentage]
  }

  object SsmControls {
    @inline
    def apply(
        ConcurrentExecutionRatePercentage: js.UndefOr[Percentage] = js.undefined,
        ErrorPercentage: js.UndefOr[Percentage] = js.undefined
    ): SsmControls = {
      val __obj = js.Dynamic.literal()
      ConcurrentExecutionRatePercentage.foreach(
        __v => __obj.updateDynamic("ConcurrentExecutionRatePercentage")(__v.asInstanceOf[js.Any])
      )
      ErrorPercentage.foreach(__v => __obj.updateDynamic("ErrorPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SsmControls]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StartConfigRulesEvaluationRequest extends js.Object {
    var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames]
  }

  object StartConfigRulesEvaluationRequest {
    @inline
    def apply(
        ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.undefined
    ): StartConfigRulesEvaluationRequest = {
      val __obj = js.Dynamic.literal()
      ConfigRuleNames.foreach(__v => __obj.updateDynamic("ConfigRuleNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartConfigRulesEvaluationRequest]
    }
  }

  /**
    * The output when you start the evaluation for the specified AWS Config rule.
    */
  @js.native
  trait StartConfigRulesEvaluationResponse extends js.Object {}

  object StartConfigRulesEvaluationResponse {
    @inline
    def apply(
        ): StartConfigRulesEvaluationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartConfigRulesEvaluationResponse]
    }
  }

  /**
    * The input for the <a>StartConfigurationRecorder</a> action.
    */
  @js.native
  trait StartConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object StartConfigurationRecorderRequest {
    @inline
    def apply(
        ConfigurationRecorderName: RecorderName
    ): StartConfigurationRecorderRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartConfigurationRecorderRequest]
    }
  }

  @js.native
  trait StartRemediationExecutionRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceKeys: ResourceKeys
  }

  object StartRemediationExecutionRequest {
    @inline
    def apply(
        ConfigRuleName: ConfigRuleName,
        ResourceKeys: ResourceKeys
    ): StartRemediationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "ResourceKeys"   -> ResourceKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartRemediationExecutionRequest]
    }
  }

  @js.native
  trait StartRemediationExecutionResponse extends js.Object {
    var FailedItems: js.UndefOr[ResourceKeys]
    var FailureMessage: js.UndefOr[String]
  }

  object StartRemediationExecutionResponse {
    @inline
    def apply(
        FailedItems: js.UndefOr[ResourceKeys] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): StartRemediationExecutionResponse = {
      val __obj = js.Dynamic.literal()
      FailedItems.foreach(__v => __obj.updateDynamic("FailedItems")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRemediationExecutionResponse]
    }
  }

  /**
    * The static value of the resource.
    */
  @js.native
  trait StaticValue extends js.Object {
    var Values: StaticParameterValues
  }

  object StaticValue {
    @inline
    def apply(
        Values: StaticParameterValues
    ): StaticValue = {
      val __obj = js.Dynamic.literal(
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StaticValue]
    }
  }

  /**
    * Status filter object to filter results based on specific member account ID or status type for an organization config rule.
    */
  @js.native
  trait StatusDetailFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var MemberAccountRuleStatus: js.UndefOr[MemberAccountRuleStatus]
  }

  object StatusDetailFilters {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        MemberAccountRuleStatus: js.UndefOr[MemberAccountRuleStatus] = js.undefined
    ): StatusDetailFilters = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      MemberAccountRuleStatus.foreach(__v => __obj.updateDynamic("MemberAccountRuleStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatusDetailFilters]
    }
  }

  /**
    * The input for the <a>StopConfigurationRecorder</a> action.
    */
  @js.native
  trait StopConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object StopConfigurationRecorderRequest {
    @inline
    def apply(
        ConfigurationRecorderName: RecorderName
    ): StopConfigurationRecorderRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopConfigurationRecorderRequest]
    }
  }

  /**
    * The tags for the resource. The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }
}
