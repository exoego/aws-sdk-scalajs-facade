package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object configservice {
  type ARN                                         = String
  type AccountAggregationSourceAccountList         = js.Array[AccountId]
  type AccountAggregationSourceList                = js.Array[AccountAggregationSource]
  type AccountId                                   = String
  type AggregateComplianceByConfigRuleList         = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList                = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList               = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList                  = js.Array[AggregatedSourceStatus]
  type AggregatedSourceStatusTypeList              = js.Array[AggregatedSourceStatusType]
  type AggregationAuthorizationList                = js.Array[AggregationAuthorization]
  type AggregatorRegionList                        = js.Array[String]
  type AllSupported                                = Boolean
  type AmazonResourceName                          = String
  type Annotation                                  = String
  type AutoRemediationAttemptSeconds               = Double
  type AutoRemediationAttempts                     = Int
  type AvailabilityZone                            = String
  type AwsRegion                                   = String
  type BaseConfigurationItems                      = js.Array[BaseConfigurationItem]
  type BaseResourceId                              = String
  type ChannelName                                 = String
  type ComplianceByConfigRules                     = js.Array[ComplianceByConfigRule]
  type ComplianceByResources                       = js.Array[ComplianceByResource]
  type ComplianceResourceTypes                     = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType           = js.Array[ComplianceSummaryByResourceType]
  type ComplianceTypes                             = js.Array[ComplianceType]
  type ConfigRuleEvaluationStatusList              = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName                              = String
  type ConfigRuleNames                             = js.Array[ConfigRuleName]
  type ConfigRules                                 = js.Array[ConfigRule]
  type Configuration                               = String
  type ConfigurationAggregatorArn                  = String
  type ConfigurationAggregatorList                 = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName                 = String
  type ConfigurationAggregatorNameList             = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime                = js.Date
  type ConfigurationItemList                       = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash                    = String
  type ConfigurationRecorderList                   = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList               = js.Array[RecorderName]
  type ConfigurationRecorderStatusList             = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId                        = String
  type ConformancePackArn                          = String
  type ConformancePackComplianceResourceIds        = js.Array[StringWithCharLimit256]
  type ConformancePackComplianceSummaryList        = js.Array[ConformancePackComplianceSummary]
  type ConformancePackConfigRuleNames              = js.Array[StringWithCharLimit64]
  type ConformancePackDetailList                   = js.Array[ConformancePackDetail]
  type ConformancePackId                           = String
  type ConformancePackInputParameters              = js.Array[ConformancePackInputParameter]
  type ConformancePackName                         = String
  type ConformancePackNamesList                    = js.Array[ConformancePackName]
  type ConformancePackNamesToSummarizeList         = js.Array[ConformancePackName]
  type ConformancePackRuleComplianceList           = js.Array[ConformancePackRuleCompliance]
  type ConformancePackRuleEvaluationResultsList    = js.Array[ConformancePackEvaluationResult]
  type ConformancePackStatusDetailsList            = js.Array[ConformancePackStatusDetail]
  type ConformancePackStatusReason                 = String
  type CosmosPageLimit                             = Int
  type Date                                        = js.Date
  type DeliveryChannelList                         = js.Array[DeliveryChannel]
  type DeliveryChannelNameList                     = js.Array[ChannelName]
  type DeliveryChannelStatusList                   = js.Array[DeliveryChannelStatus]
  type DeliveryS3Bucket                            = String
  type DeliveryS3KeyPrefix                         = String
  type DescribeConformancePackComplianceLimit      = Int
  type DescribePendingAggregationRequestsLimit     = Int
  type DiscoveredResourceIdentifierList            = js.Array[AggregateResourceIdentifier]
  type EarlierTime                                 = js.Date
  type EmptiableStringWithCharLimit256             = String
  type EvaluationResults                           = js.Array[EvaluationResult]
  type Evaluations                                 = js.Array[Evaluation]
  type ExcludedAccounts                            = js.Array[AccountId]
  type Expression                                  = String
  type FailedDeleteRemediationExceptionsBatches    = js.Array[FailedDeleteRemediationExceptionsBatch]
  type FailedRemediationBatches                    = js.Array[FailedRemediationBatch]
  type FailedRemediationExceptionBatches           = js.Array[FailedRemediationExceptionBatch]
  type FieldInfoList                               = js.Array[FieldInfo]
  type FieldName                                   = String
  type GetConformancePackComplianceDetailsLimit    = Int
  type GroupByAPILimit                             = Int
  type GroupedResourceCountList                    = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes                  = Boolean
  type LaterTime                                   = js.Date
  type Limit                                       = Int
  type Name                                        = String
  type NextToken                                   = String
  type OrderingTimestamp                           = js.Date
  type OrganizationConfigRuleDetailedStatus        = js.Array[MemberAccountStatus]
  type OrganizationConfigRuleName                  = String
  type OrganizationConfigRuleNames                 = js.Array[StringWithCharLimit64]
  type OrganizationConfigRuleStatuses              = js.Array[OrganizationConfigRuleStatus]
  type OrganizationConfigRuleTriggerTypes          = js.Array[OrganizationConfigRuleTriggerType]
  type OrganizationConfigRules                     = js.Array[OrganizationConfigRule]
  type OrganizationConformancePackDetailedStatuses = js.Array[OrganizationConformancePackDetailedStatus]
  type OrganizationConformancePackName             = String
  type OrganizationConformancePackNames            = js.Array[OrganizationConformancePackName]
  type OrganizationConformancePackStatuses         = js.Array[OrganizationConformancePackStatus]
  type OrganizationConformancePacks                = js.Array[OrganizationConformancePack]
  type PageSizeLimit                               = Int
  type ParameterName                               = String
  type ParameterValue                              = String
  type PendingAggregationRequestList               = js.Array[PendingAggregationRequest]
  type Percentage                                  = Int
  type RecorderName                                = String
  type ReevaluateConfigRuleNames                   = js.Array[StringWithCharLimit64]
  type RelatedEvent                                = String
  type RelatedEventList                            = js.Array[RelatedEvent]
  type RelationshipList                            = js.Array[Relationship]
  type RelationshipName                            = String
  type RemediationConfigurations                   = js.Array[RemediationConfiguration]
  type RemediationExceptionResourceKeys            = js.Array[RemediationExceptionResourceKey]
  type RemediationExceptions                       = js.Array[RemediationException]
  type RemediationExecutionStatuses                = js.Array[RemediationExecutionStatus]
  type RemediationExecutionSteps                   = js.Array[RemediationExecutionStep]
  type RemediationParameters                       = js.Dictionary[RemediationParameterValue]
  type ResourceCounts                              = js.Array[ResourceCount]
  type ResourceCreationTime                        = js.Date
  type ResourceDeletionTime                        = js.Date
  type ResourceId                                  = String
  type ResourceIdList                              = js.Array[ResourceId]
  type ResourceIdentifierList                      = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList                     = js.Array[AggregateResourceIdentifier]
  type ResourceKeys                                = js.Array[ResourceKey]
  type ResourceName                                = String
  type ResourceTypeList                            = js.Array[ResourceType]
  type ResourceTypeString                          = String
  type ResourceTypes                               = js.Array[StringWithCharLimit256]
  type ResourceTypesScope                          = js.Array[StringWithCharLimit256]
  type Results                                     = js.Array[String]
  type RetentionConfigurationList                  = js.Array[RetentionConfiguration]
  type RetentionConfigurationName                  = String
  type RetentionConfigurationNameList              = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays                       = Int
  type RuleLimit                                   = Int
  type SchemaVersionId                             = String
  type SourceDetails                               = js.Array[SourceDetail]
  type StackArn                                    = String
  type StaticParameterValues                       = js.Array[StringWithCharLimit256]
  type StringWithCharLimit1024                     = String
  type StringWithCharLimit128                      = String
  type StringWithCharLimit2048                     = String
  type StringWithCharLimit256                      = String
  type StringWithCharLimit256Min0                  = String
  type StringWithCharLimit64                       = String
  type StringWithCharLimit768                      = String
  type SupplementaryConfiguration                  = js.Dictionary[SupplementaryConfigurationValue]
  type SupplementaryConfigurationName              = String
  type SupplementaryConfigurationValue             = String
  type TagKey                                      = String
  type TagKeyList                                  = js.Array[TagKey]
  type TagList                                     = js.Array[Tag]
  type TagValue                                    = String
  type Tags                                        = js.Dictionary[Value]
  type TagsList                                    = js.Array[Tag]
  type TemplateBody                                = String
  type TemplateS3Uri                               = String
  type UnprocessedResourceIdentifierList           = js.Array[AggregateResourceIdentifier]
  type Value                                       = String
  type Version                                     = String

  implicit final class ConfigServiceOps(private val service: ConfigService) extends AnyVal {

    @inline def batchGetAggregateResourceConfigFuture(
        params: BatchGetAggregateResourceConfigRequest
    ): Future[BatchGetAggregateResourceConfigResponse] =
      service.batchGetAggregateResourceConfig(params).promise().toFuture
    @inline def batchGetResourceConfigFuture(
        params: BatchGetResourceConfigRequest
    ): Future[BatchGetResourceConfigResponse] = service.batchGetResourceConfig(params).promise().toFuture
    @inline def deleteAggregationAuthorizationFuture(params: DeleteAggregationAuthorizationRequest): Future[js.Object] =
      service.deleteAggregationAuthorization(params).promise().toFuture
    @inline def deleteConfigRuleFuture(params: DeleteConfigRuleRequest): Future[js.Object] =
      service.deleteConfigRule(params).promise().toFuture
    @inline def deleteConfigurationAggregatorFuture(params: DeleteConfigurationAggregatorRequest): Future[js.Object] =
      service.deleteConfigurationAggregator(params).promise().toFuture
    @inline def deleteConfigurationRecorderFuture(params: DeleteConfigurationRecorderRequest): Future[js.Object] =
      service.deleteConfigurationRecorder(params).promise().toFuture
    @inline def deleteConformancePackFuture(params: DeleteConformancePackRequest): Future[js.Object] =
      service.deleteConformancePack(params).promise().toFuture
    @inline def deleteDeliveryChannelFuture(params: DeleteDeliveryChannelRequest): Future[js.Object] =
      service.deleteDeliveryChannel(params).promise().toFuture
    @inline def deleteEvaluationResultsFuture(
        params: DeleteEvaluationResultsRequest
    ): Future[DeleteEvaluationResultsResponse] = service.deleteEvaluationResults(params).promise().toFuture
    @inline def deleteOrganizationConfigRuleFuture(params: DeleteOrganizationConfigRuleRequest): Future[js.Object] =
      service.deleteOrganizationConfigRule(params).promise().toFuture
    @inline def deleteOrganizationConformancePackFuture(
        params: DeleteOrganizationConformancePackRequest
    ): Future[js.Object] = service.deleteOrganizationConformancePack(params).promise().toFuture
    @inline def deletePendingAggregationRequestFuture(
        params: DeletePendingAggregationRequestRequest
    ): Future[js.Object] = service.deletePendingAggregationRequest(params).promise().toFuture
    @inline def deleteRemediationConfigurationFuture(
        params: DeleteRemediationConfigurationRequest
    ): Future[DeleteRemediationConfigurationResponse] =
      service.deleteRemediationConfiguration(params).promise().toFuture
    @inline def deleteRemediationExceptionsFuture(
        params: DeleteRemediationExceptionsRequest
    ): Future[DeleteRemediationExceptionsResponse] = service.deleteRemediationExceptions(params).promise().toFuture
    @inline def deleteResourceConfigFuture(params: DeleteResourceConfigRequest): Future[js.Object] =
      service.deleteResourceConfig(params).promise().toFuture
    @inline def deleteRetentionConfigurationFuture(params: DeleteRetentionConfigurationRequest): Future[js.Object] =
      service.deleteRetentionConfiguration(params).promise().toFuture
    @inline def deliverConfigSnapshotFuture(
        params: DeliverConfigSnapshotRequest
    ): Future[DeliverConfigSnapshotResponse] = service.deliverConfigSnapshot(params).promise().toFuture
    @inline def describeAggregateComplianceByConfigRulesFuture(
        params: DescribeAggregateComplianceByConfigRulesRequest
    ): Future[DescribeAggregateComplianceByConfigRulesResponse] =
      service.describeAggregateComplianceByConfigRules(params).promise().toFuture
    @inline def describeAggregationAuthorizationsFuture(
        params: DescribeAggregationAuthorizationsRequest
    ): Future[DescribeAggregationAuthorizationsResponse] =
      service.describeAggregationAuthorizations(params).promise().toFuture
    @inline def describeComplianceByConfigRuleFuture(
        params: DescribeComplianceByConfigRuleRequest
    ): Future[DescribeComplianceByConfigRuleResponse] =
      service.describeComplianceByConfigRule(params).promise().toFuture
    @inline def describeComplianceByResourceFuture(
        params: DescribeComplianceByResourceRequest
    ): Future[DescribeComplianceByResourceResponse] = service.describeComplianceByResource(params).promise().toFuture
    @inline def describeConfigRuleEvaluationStatusFuture(
        params: DescribeConfigRuleEvaluationStatusRequest
    ): Future[DescribeConfigRuleEvaluationStatusResponse] =
      service.describeConfigRuleEvaluationStatus(params).promise().toFuture
    @inline def describeConfigRulesFuture(params: DescribeConfigRulesRequest): Future[DescribeConfigRulesResponse] =
      service.describeConfigRules(params).promise().toFuture
    @inline def describeConfigurationAggregatorSourcesStatusFuture(
        params: DescribeConfigurationAggregatorSourcesStatusRequest
    ): Future[DescribeConfigurationAggregatorSourcesStatusResponse] =
      service.describeConfigurationAggregatorSourcesStatus(params).promise().toFuture
    @inline def describeConfigurationAggregatorsFuture(
        params: DescribeConfigurationAggregatorsRequest
    ): Future[DescribeConfigurationAggregatorsResponse] =
      service.describeConfigurationAggregators(params).promise().toFuture
    @inline def describeConfigurationRecorderStatusFuture(
        params: DescribeConfigurationRecorderStatusRequest
    ): Future[DescribeConfigurationRecorderStatusResponse] =
      service.describeConfigurationRecorderStatus(params).promise().toFuture
    @inline def describeConfigurationRecordersFuture(
        params: DescribeConfigurationRecordersRequest
    ): Future[DescribeConfigurationRecordersResponse] =
      service.describeConfigurationRecorders(params).promise().toFuture
    @inline def describeConformancePackComplianceFuture(
        params: DescribeConformancePackComplianceRequest
    ): Future[DescribeConformancePackComplianceResponse] =
      service.describeConformancePackCompliance(params).promise().toFuture
    @inline def describeConformancePackStatusFuture(
        params: DescribeConformancePackStatusRequest
    ): Future[DescribeConformancePackStatusResponse] = service.describeConformancePackStatus(params).promise().toFuture
    @inline def describeConformancePacksFuture(
        params: DescribeConformancePacksRequest
    ): Future[DescribeConformancePacksResponse] = service.describeConformancePacks(params).promise().toFuture
    @inline def describeDeliveryChannelStatusFuture(
        params: DescribeDeliveryChannelStatusRequest
    ): Future[DescribeDeliveryChannelStatusResponse] = service.describeDeliveryChannelStatus(params).promise().toFuture
    @inline def describeDeliveryChannelsFuture(
        params: DescribeDeliveryChannelsRequest
    ): Future[DescribeDeliveryChannelsResponse] = service.describeDeliveryChannels(params).promise().toFuture
    @inline def describeOrganizationConfigRuleStatusesFuture(
        params: DescribeOrganizationConfigRuleStatusesRequest
    ): Future[DescribeOrganizationConfigRuleStatusesResponse] =
      service.describeOrganizationConfigRuleStatuses(params).promise().toFuture
    @inline def describeOrganizationConfigRulesFuture(
        params: DescribeOrganizationConfigRulesRequest
    ): Future[DescribeOrganizationConfigRulesResponse] =
      service.describeOrganizationConfigRules(params).promise().toFuture
    @inline def describeOrganizationConformancePackStatusesFuture(
        params: DescribeOrganizationConformancePackStatusesRequest
    ): Future[DescribeOrganizationConformancePackStatusesResponse] =
      service.describeOrganizationConformancePackStatuses(params).promise().toFuture
    @inline def describeOrganizationConformancePacksFuture(
        params: DescribeOrganizationConformancePacksRequest
    ): Future[DescribeOrganizationConformancePacksResponse] =
      service.describeOrganizationConformancePacks(params).promise().toFuture
    @inline def describePendingAggregationRequestsFuture(
        params: DescribePendingAggregationRequestsRequest
    ): Future[DescribePendingAggregationRequestsResponse] =
      service.describePendingAggregationRequests(params).promise().toFuture
    @inline def describeRemediationConfigurationsFuture(
        params: DescribeRemediationConfigurationsRequest
    ): Future[DescribeRemediationConfigurationsResponse] =
      service.describeRemediationConfigurations(params).promise().toFuture
    @inline def describeRemediationExceptionsFuture(
        params: DescribeRemediationExceptionsRequest
    ): Future[DescribeRemediationExceptionsResponse] = service.describeRemediationExceptions(params).promise().toFuture
    @inline def describeRemediationExecutionStatusFuture(
        params: DescribeRemediationExecutionStatusRequest
    ): Future[DescribeRemediationExecutionStatusResponse] =
      service.describeRemediationExecutionStatus(params).promise().toFuture
    @inline def describeRetentionConfigurationsFuture(
        params: DescribeRetentionConfigurationsRequest
    ): Future[DescribeRetentionConfigurationsResponse] =
      service.describeRetentionConfigurations(params).promise().toFuture
    @inline def getAggregateComplianceDetailsByConfigRuleFuture(
        params: GetAggregateComplianceDetailsByConfigRuleRequest
    ): Future[GetAggregateComplianceDetailsByConfigRuleResponse] =
      service.getAggregateComplianceDetailsByConfigRule(params).promise().toFuture
    @inline def getAggregateConfigRuleComplianceSummaryFuture(
        params: GetAggregateConfigRuleComplianceSummaryRequest
    ): Future[GetAggregateConfigRuleComplianceSummaryResponse] =
      service.getAggregateConfigRuleComplianceSummary(params).promise().toFuture
    @inline def getAggregateDiscoveredResourceCountsFuture(
        params: GetAggregateDiscoveredResourceCountsRequest
    ): Future[GetAggregateDiscoveredResourceCountsResponse] =
      service.getAggregateDiscoveredResourceCounts(params).promise().toFuture
    @inline def getAggregateResourceConfigFuture(
        params: GetAggregateResourceConfigRequest
    ): Future[GetAggregateResourceConfigResponse] = service.getAggregateResourceConfig(params).promise().toFuture
    @inline def getComplianceDetailsByConfigRuleFuture(
        params: GetComplianceDetailsByConfigRuleRequest
    ): Future[GetComplianceDetailsByConfigRuleResponse] =
      service.getComplianceDetailsByConfigRule(params).promise().toFuture
    @inline def getComplianceDetailsByResourceFuture(
        params: GetComplianceDetailsByResourceRequest
    ): Future[GetComplianceDetailsByResourceResponse] =
      service.getComplianceDetailsByResource(params).promise().toFuture
    @inline def getComplianceSummaryByConfigRuleFuture(): Future[GetComplianceSummaryByConfigRuleResponse] =
      service.getComplianceSummaryByConfigRule().promise().toFuture
    @inline def getComplianceSummaryByResourceTypeFuture(
        params: GetComplianceSummaryByResourceTypeRequest
    ): Future[GetComplianceSummaryByResourceTypeResponse] =
      service.getComplianceSummaryByResourceType(params).promise().toFuture
    @inline def getConformancePackComplianceDetailsFuture(
        params: GetConformancePackComplianceDetailsRequest
    ): Future[GetConformancePackComplianceDetailsResponse] =
      service.getConformancePackComplianceDetails(params).promise().toFuture
    @inline def getConformancePackComplianceSummaryFuture(
        params: GetConformancePackComplianceSummaryRequest
    ): Future[GetConformancePackComplianceSummaryResponse] =
      service.getConformancePackComplianceSummary(params).promise().toFuture
    @inline def getDiscoveredResourceCountsFuture(
        params: GetDiscoveredResourceCountsRequest
    ): Future[GetDiscoveredResourceCountsResponse] = service.getDiscoveredResourceCounts(params).promise().toFuture
    @inline def getOrganizationConfigRuleDetailedStatusFuture(
        params: GetOrganizationConfigRuleDetailedStatusRequest
    ): Future[GetOrganizationConfigRuleDetailedStatusResponse] =
      service.getOrganizationConfigRuleDetailedStatus(params).promise().toFuture
    @inline def getOrganizationConformancePackDetailedStatusFuture(
        params: GetOrganizationConformancePackDetailedStatusRequest
    ): Future[GetOrganizationConformancePackDetailedStatusResponse] =
      service.getOrganizationConformancePackDetailedStatus(params).promise().toFuture
    @inline def getResourceConfigHistoryFuture(
        params: GetResourceConfigHistoryRequest
    ): Future[GetResourceConfigHistoryResponse] = service.getResourceConfigHistory(params).promise().toFuture
    @inline def listAggregateDiscoveredResourcesFuture(
        params: ListAggregateDiscoveredResourcesRequest
    ): Future[ListAggregateDiscoveredResourcesResponse] =
      service.listAggregateDiscoveredResources(params).promise().toFuture
    @inline def listDiscoveredResourcesFuture(
        params: ListDiscoveredResourcesRequest
    ): Future[ListDiscoveredResourcesResponse] = service.listDiscoveredResources(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putAggregationAuthorizationFuture(
        params: PutAggregationAuthorizationRequest
    ): Future[PutAggregationAuthorizationResponse] = service.putAggregationAuthorization(params).promise().toFuture
    @inline def putConfigRuleFuture(params: PutConfigRuleRequest): Future[js.Object] =
      service.putConfigRule(params).promise().toFuture
    @inline def putConfigurationAggregatorFuture(
        params: PutConfigurationAggregatorRequest
    ): Future[PutConfigurationAggregatorResponse] = service.putConfigurationAggregator(params).promise().toFuture
    @inline def putConfigurationRecorderFuture(params: PutConfigurationRecorderRequest): Future[js.Object] =
      service.putConfigurationRecorder(params).promise().toFuture
    @inline def putConformancePackFuture(params: PutConformancePackRequest): Future[PutConformancePackResponse] =
      service.putConformancePack(params).promise().toFuture
    @inline def putDeliveryChannelFuture(params: PutDeliveryChannelRequest): Future[js.Object] =
      service.putDeliveryChannel(params).promise().toFuture
    @inline def putEvaluationsFuture(params: PutEvaluationsRequest): Future[PutEvaluationsResponse] =
      service.putEvaluations(params).promise().toFuture
    @inline def putOrganizationConfigRuleFuture(
        params: PutOrganizationConfigRuleRequest
    ): Future[PutOrganizationConfigRuleResponse] = service.putOrganizationConfigRule(params).promise().toFuture
    @inline def putOrganizationConformancePackFuture(
        params: PutOrganizationConformancePackRequest
    ): Future[PutOrganizationConformancePackResponse] =
      service.putOrganizationConformancePack(params).promise().toFuture
    @inline def putRemediationConfigurationsFuture(
        params: PutRemediationConfigurationsRequest
    ): Future[PutRemediationConfigurationsResponse] = service.putRemediationConfigurations(params).promise().toFuture
    @inline def putRemediationExceptionsFuture(
        params: PutRemediationExceptionsRequest
    ): Future[PutRemediationExceptionsResponse] = service.putRemediationExceptions(params).promise().toFuture
    @inline def putResourceConfigFuture(params: PutResourceConfigRequest): Future[js.Object] =
      service.putResourceConfig(params).promise().toFuture
    @inline def putRetentionConfigurationFuture(
        params: PutRetentionConfigurationRequest
    ): Future[PutRetentionConfigurationResponse] = service.putRetentionConfiguration(params).promise().toFuture
    @inline def selectResourceConfigFuture(params: SelectResourceConfigRequest): Future[SelectResourceConfigResponse] =
      service.selectResourceConfig(params).promise().toFuture
    @inline def startConfigRulesEvaluationFuture(
        params: StartConfigRulesEvaluationRequest
    ): Future[StartConfigRulesEvaluationResponse] = service.startConfigRulesEvaluation(params).promise().toFuture
    @inline def startConfigurationRecorderFuture(params: StartConfigurationRecorderRequest): Future[js.Object] =
      service.startConfigurationRecorder(params).promise().toFuture
    @inline def startRemediationExecutionFuture(
        params: StartRemediationExecutionRequest
    ): Future[StartRemediationExecutionResponse] = service.startRemediationExecution(params).promise().toFuture
    @inline def stopConfigurationRecorderFuture(params: StopConfigurationRecorderRequest): Future[js.Object] =
      service.stopConfigurationRecorder(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
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
    def deleteConformancePack(params: DeleteConformancePackRequest): Request[js.Object]                   = js.native
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object]                   = js.native
    def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): Request[DeleteEvaluationResultsResponse] =
      js.native
    def deleteOrganizationConfigRule(params: DeleteOrganizationConfigRuleRequest): Request[js.Object] = js.native
    def deleteOrganizationConformancePack(params: DeleteOrganizationConformancePackRequest): Request[js.Object] =
      js.native
    def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): Request[js.Object] = js.native
    def deleteRemediationConfiguration(
        params: DeleteRemediationConfigurationRequest
    ): Request[DeleteRemediationConfigurationResponse] = js.native
    def deleteRemediationExceptions(
        params: DeleteRemediationExceptionsRequest
    ): Request[DeleteRemediationExceptionsResponse]                                                         = js.native
    def deleteResourceConfig(params: DeleteResourceConfigRequest): Request[js.Object]                       = js.native
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
    def describeConformancePackCompliance(
        params: DescribeConformancePackComplianceRequest
    ): Request[DescribeConformancePackComplianceResponse] = js.native
    def describeConformancePackStatus(
        params: DescribeConformancePackStatusRequest
    ): Request[DescribeConformancePackStatusResponse] = js.native
    def describeConformancePacks(params: DescribeConformancePacksRequest): Request[DescribeConformancePacksResponse] =
      js.native
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
    def describeOrganizationConformancePackStatuses(
        params: DescribeOrganizationConformancePackStatusesRequest
    ): Request[DescribeOrganizationConformancePackStatusesResponse] = js.native
    def describeOrganizationConformancePacks(
        params: DescribeOrganizationConformancePacksRequest
    ): Request[DescribeOrganizationConformancePacksResponse] = js.native
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
    def getConformancePackComplianceDetails(
        params: GetConformancePackComplianceDetailsRequest
    ): Request[GetConformancePackComplianceDetailsResponse] = js.native
    def getConformancePackComplianceSummary(
        params: GetConformancePackComplianceSummaryRequest
    ): Request[GetConformancePackComplianceSummaryResponse] = js.native
    def getDiscoveredResourceCounts(
        params: GetDiscoveredResourceCountsRequest
    ): Request[GetDiscoveredResourceCountsResponse] = js.native
    def getOrganizationConfigRuleDetailedStatus(
        params: GetOrganizationConfigRuleDetailedStatusRequest
    ): Request[GetOrganizationConfigRuleDetailedStatusResponse] = js.native
    def getOrganizationConformancePackDetailedStatus(
        params: GetOrganizationConformancePackDetailedStatusRequest
    ): Request[GetOrganizationConformancePackDetailedStatusResponse] = js.native
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
    ): Request[PutConfigurationAggregatorResponse]                                                 = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object]      = js.native
    def putConformancePack(params: PutConformancePackRequest): Request[PutConformancePackResponse] = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object]                  = js.native
    def putEvaluations(params: PutEvaluationsRequest): Request[PutEvaluationsResponse]             = js.native
    def putOrganizationConfigRule(
        params: PutOrganizationConfigRuleRequest
    ): Request[PutOrganizationConfigRuleResponse] = js.native
    def putOrganizationConformancePack(
        params: PutOrganizationConformancePackRequest
    ): Request[PutOrganizationConformancePackResponse] = js.native
    def putRemediationConfigurations(
        params: PutRemediationConfigurationsRequest
    ): Request[PutRemediationConfigurationsResponse] = js.native
    def putRemediationExceptions(params: PutRemediationExceptionsRequest): Request[PutRemediationExceptionsResponse] =
      js.native
    def putResourceConfig(params: PutResourceConfigRequest): Request[js.Object] = js.native
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
  @Factory
  trait AccountAggregationSource extends js.Object {
    var AccountIds: AccountAggregationSourceAccountList
    var AllAwsRegions: js.UndefOr[Boolean]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
  }

  /**
    * Indicates whether an AWS Config rule is compliant based on account ID, region, compliance, and rule name.
    *  A rule is compliant if all of the resources that the rule evaluated comply with it. It is noncompliant if any of these resources do not comply.
    */
  @js.native
  @Factory
  trait AggregateComplianceByConfigRule extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
    var Compliance: js.UndefOr[Compliance]
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
  }

  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
    */
  @js.native
  @Factory
  trait AggregateComplianceCount extends js.Object {
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
    var GroupName: js.UndefOr[StringWithCharLimit256]
  }

  /**
    * The details of an AWS Config evaluation for an account ID and region in an aggregator. Provides the AWS resource that was evaluated, the compliance of the resource, related time stamps, and supplementary information.
    */
  @js.native
  @Factory
  trait AggregateEvaluationResult extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var AwsRegion: js.UndefOr[AwsRegion]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigRuleInvokedTime: js.UndefOr[Date]
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier]
    var ResultRecordedTime: js.UndefOr[Date]
  }

  /**
    * The details that identify a resource that is collected by AWS Config aggregator, including the resource type, ID, (if available) the custom resource name, the source account, and source region.
    */
  @js.native
  @Factory
  trait AggregateResourceIdentifier extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceType
    var SourceAccountId: AccountId
    var SourceRegion: AwsRegion
    var ResourceName: js.UndefOr[ResourceName]
  }

  /**
    * The current sync status between the source and the aggregator account.
    */
  @js.native
  @Factory
  trait AggregatedSourceStatus extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var LastErrorCode: js.UndefOr[String]
    var LastErrorMessage: js.UndefOr[String]
    var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType]
    var LastUpdateTime: js.UndefOr[Date]
    var SourceId: js.UndefOr[String]
    var SourceType: js.UndefOr[AggregatedSourceType]
  }

  @js.native
  sealed trait AggregatedSourceStatusType extends js.Any
  object AggregatedSourceStatusType extends js.Object {
    val FAILED    = "FAILED".asInstanceOf[AggregatedSourceStatusType]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[AggregatedSourceStatusType]
    val OUTDATED  = "OUTDATED".asInstanceOf[AggregatedSourceStatusType]

    val values = js.Object.freeze(js.Array(FAILED, SUCCEEDED, OUTDATED))
  }

  @js.native
  sealed trait AggregatedSourceType extends js.Any
  object AggregatedSourceType extends js.Object {
    val ACCOUNT      = "ACCOUNT".asInstanceOf[AggregatedSourceType]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[AggregatedSourceType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATION))
  }

  /**
    * An object that represents the authorizations granted to aggregator accounts and regions.
    */
  @js.native
  @Factory
  trait AggregationAuthorization extends js.Object {
    var AggregationAuthorizationArn: js.UndefOr[String]
    var AuthorizedAccountId: js.UndefOr[AccountId]
    var AuthorizedAwsRegion: js.UndefOr[AwsRegion]
    var CreationTime: js.UndefOr[Date]
  }

  /**
    * The detailed configuration of a specified resource.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait BatchGetAggregateResourceConfigRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceIdentifiers: ResourceIdentifiersList
  }

  @js.native
  @Factory
  trait BatchGetAggregateResourceConfigResponse extends js.Object {
    var BaseConfigurationItems: js.UndefOr[BaseConfigurationItems]
    var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList]
  }

  @js.native
  @Factory
  trait BatchGetResourceConfigRequest extends js.Object {
    var resourceKeys: ResourceKeys
  }

  @js.native
  @Factory
  trait BatchGetResourceConfigResponse extends js.Object {
    var baseConfigurationItems: js.UndefOr[BaseConfigurationItems]
    var unprocessedResourceKeys: js.UndefOr[ResourceKeys]
  }

  @js.native
  sealed trait ChronologicalOrder extends js.Any
  object ChronologicalOrder extends js.Object {
    val Reverse = "Reverse".asInstanceOf[ChronologicalOrder]
    val Forward = "Forward".asInstanceOf[ChronologicalOrder]

    val values = js.Object.freeze(js.Array(Reverse, Forward))
  }

  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  @js.native
  @Factory
  trait Compliance extends js.Object {
    var ComplianceContributorCount: js.UndefOr[ComplianceContributorCount]
    var ComplianceType: js.UndefOr[ComplianceType]
  }

  /**
    * Indicates whether an AWS Config rule is compliant. A rule is compliant if all of the resources that the rule evaluated comply with it. A rule is noncompliant if any of these resources do not comply.
    */
  @js.native
  @Factory
  trait ComplianceByConfigRule extends js.Object {
    var Compliance: js.UndefOr[Compliance]
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
  }

  /**
    * Indicates whether an AWS resource that is evaluated according to one or more AWS Config rules is compliant. A resource is compliant if it complies with all of the rules that evaluate it. A resource is noncompliant if it does not comply with one or more of these rules.
    */
  @js.native
  @Factory
  trait ComplianceByResource extends js.Object {
    var Compliance: js.UndefOr[Compliance]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item, up to a maximum number.
    */
  @js.native
  @Factory
  trait ComplianceContributorCount extends js.Object {
    var CapExceeded: js.UndefOr[Boolean]
    var CappedCount: js.UndefOr[Int]
  }

  /**
    * The number of AWS Config rules or AWS resources that are compliant and noncompliant.
    */
  @js.native
  @Factory
  trait ComplianceSummary extends js.Object {
    var ComplianceSummaryTimestamp: js.UndefOr[Date]
    var CompliantResourceCount: js.UndefOr[ComplianceContributorCount]
    var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount]
  }

  /**
    * The number of AWS resources of a specific type that are compliant or noncompliant, up to a maximum of 100 for each.
    */
  @js.native
  @Factory
  trait ComplianceSummaryByResourceType extends js.Object {
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  @js.native
  sealed trait ComplianceType extends js.Any
  object ComplianceType extends js.Object {
    val COMPLIANT         = "COMPLIANT".asInstanceOf[ComplianceType]
    val NON_COMPLIANT     = "NON_COMPLIANT".asInstanceOf[ComplianceType]
    val NOT_APPLICABLE    = "NOT_APPLICABLE".asInstanceOf[ComplianceType]
    val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[ComplianceType]

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA))
  }

  /**
    * Provides status of the delivery of the snapshot or the configuration history to the specified Amazon S3 bucket. Also provides the status of notifications about the Amazon S3 delivery to the specified Amazon SNS topic.
    */
  @js.native
  @Factory
  trait ConfigExportDeliveryInfo extends js.Object {
    var lastAttemptTime: js.UndefOr[Date]
    var lastErrorCode: js.UndefOr[String]
    var lastErrorMessage: js.UndefOr[String]
    var lastStatus: js.UndefOr[DeliveryStatus]
    var lastSuccessfulTime: js.UndefOr[Date]
    var nextDeliveryTime: js.UndefOr[Date]
  }

  /**
    * An AWS Config rule represents an AWS Lambda function that you create for a custom rule or a predefined function for an AWS managed rule. The function evaluates configuration items to assess whether your AWS resources comply with your desired configurations. This function can run when AWS Config detects a configuration change to an AWS resource and at a periodic frequency that you choose (for example, every 24 hours).
    *
    * '''Note:'''You can use the AWS CLI and AWS SDKs if you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot. For more information, see <a>ConfigSnapshotDeliveryProperties</a>.
    * For more information about developing and using AWS Config rules, see [[https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html|Evaluating AWS Resource Configurations with AWS Config]] in the <i>AWS Config Developer Guide</i>.
    */
  @js.native
  @Factory
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

  /**
    * Filters the compliance results based on account ID, region, compliance type, and rule name.
    */
  @js.native
  @Factory
  trait ConfigRuleComplianceFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
  }

  /**
    * Filters the results based on the account IDs and regions.
    */
  @js.native
  @Factory
  trait ConfigRuleComplianceSummaryFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
  }

  @js.native
  sealed trait ConfigRuleComplianceSummaryGroupKey extends js.Any
  object ConfigRuleComplianceSummaryGroupKey extends js.Object {
    val ACCOUNT_ID = "ACCOUNT_ID".asInstanceOf[ConfigRuleComplianceSummaryGroupKey]
    val AWS_REGION = "AWS_REGION".asInstanceOf[ConfigRuleComplianceSummaryGroupKey]

    val values = js.Object.freeze(js.Array(ACCOUNT_ID, AWS_REGION))
  }

  /**
    * Status information for your AWS managed Config rules. The status includes information such as the last time the rule ran, the last time it failed, and the related error for the last failure.
    *  This action does not return status information about custom AWS Config rules.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ConfigRuleState extends js.Any
  object ConfigRuleState extends js.Object {
    val ACTIVE           = "ACTIVE".asInstanceOf[ConfigRuleState]
    val DELETING         = "DELETING".asInstanceOf[ConfigRuleState]
    val DELETING_RESULTS = "DELETING_RESULTS".asInstanceOf[ConfigRuleState]
    val EVALUATING       = "EVALUATING".asInstanceOf[ConfigRuleState]

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
  @Factory
  trait ConfigSnapshotDeliveryProperties extends js.Object {
    var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency]
  }

  /**
    * A list that contains the status of the delivery of the configuration stream notification to the Amazon SNS topic.
    */
  @js.native
  @Factory
  trait ConfigStreamDeliveryInfo extends js.Object {
    var lastErrorCode: js.UndefOr[String]
    var lastErrorMessage: js.UndefOr[String]
    var lastStatus: js.UndefOr[DeliveryStatus]
    var lastStatusChangeTime: js.UndefOr[Date]
  }

  /**
    * The details about the configuration aggregator, including information about source accounts, regions, and metadata of the aggregator.
    */
  @js.native
  @Factory
  trait ConfigurationAggregator extends js.Object {
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn]
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var CreationTime: js.UndefOr[Date]
    var LastUpdatedTime: js.UndefOr[Date]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
  }

  /**
    * A list that contains detailed configurations of a specified resource.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ConfigurationItemStatus extends js.Any
  object ConfigurationItemStatus extends js.Object {
    val OK                         = "OK".asInstanceOf[ConfigurationItemStatus]
    val ResourceDiscovered         = "ResourceDiscovered".asInstanceOf[ConfigurationItemStatus]
    val ResourceNotRecorded        = "ResourceNotRecorded".asInstanceOf[ConfigurationItemStatus]
    val ResourceDeleted            = "ResourceDeleted".asInstanceOf[ConfigurationItemStatus]
    val ResourceDeletedNotRecorded = "ResourceDeletedNotRecorded".asInstanceOf[ConfigurationItemStatus]

    val values = js.Object.freeze(
      js.Array(OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded)
    )
  }

  /**
    * An object that represents the recording of configuration changes of an AWS resource.
    */
  @js.native
  @Factory
  trait ConfigurationRecorder extends js.Object {
    var name: js.UndefOr[RecorderName]
    var recordingGroup: js.UndefOr[RecordingGroup]
    var roleARN: js.UndefOr[String]
  }

  /**
    * The current status of the configuration recorder.
    */
  @js.native
  @Factory
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

  /**
    * Filters the conformance pack by compliance types and AWS Config rule names.
    */
  @js.native
  @Factory
  trait ConformancePackComplianceFilters extends js.Object {
    var ComplianceType: js.UndefOr[ConformancePackComplianceType]
    var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames]
  }

  /**
    * Summary includes the name and status of the conformance pack.
    */
  @js.native
  @Factory
  trait ConformancePackComplianceSummary extends js.Object {
    var ConformancePackComplianceStatus: ConformancePackComplianceType
    var ConformancePackName: ConformancePackName
  }

  @js.native
  sealed trait ConformancePackComplianceType extends js.Any
  object ConformancePackComplianceType extends js.Object {
    val COMPLIANT     = "COMPLIANT".asInstanceOf[ConformancePackComplianceType]
    val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[ConformancePackComplianceType]

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT))
  }

  /**
    * Returns details of a conformance pack. A conformance pack is a collection of AWS Config rules and remediation actions that can be easily deployed in an account and a region.
    */
  @js.native
  @Factory
  trait ConformancePackDetail extends js.Object {
    var ConformancePackArn: ConformancePackArn
    var ConformancePackId: ConformancePackId
    var ConformancePackName: ConformancePackName
    var DeliveryS3Bucket: DeliveryS3Bucket
    var ConformancePackInputParameters: js.UndefOr[ConformancePackInputParameters]
    var CreatedBy: js.UndefOr[StringWithCharLimit256]
    var DeliveryS3KeyPrefix: js.UndefOr[DeliveryS3KeyPrefix]
    var LastUpdateRequestedTime: js.UndefOr[Date]
  }

  /**
    * Filters a conformance pack by AWS Config rule names, compliance types, AWS resource types, and resource IDs.
    */
  @js.native
  @Factory
  trait ConformancePackEvaluationFilters extends js.Object {
    var ComplianceType: js.UndefOr[ConformancePackComplianceType]
    var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames]
    var ResourceIds: js.UndefOr[ConformancePackComplianceResourceIds]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  /**
    * The details of a conformance pack evaluation. Provides AWS Config rule and AWS resource type that was evaluated, the compliance of the conformance pack, related time stamps, and supplementary information.
    */
  @js.native
  @Factory
  trait ConformancePackEvaluationResult extends js.Object {
    var ComplianceType: ConformancePackComplianceType
    var ConfigRuleInvokedTime: Date
    var EvaluationResultIdentifier: EvaluationResultIdentifier
    var ResultRecordedTime: Date
    var Annotation: js.UndefOr[Annotation]
  }

  /**
    * Input parameters in the form of key-value pairs for the conformance pack, both of which you define. Keys can have a maximum character length of 128 characters, and values can have a maximum length of 256 characters.
    */
  @js.native
  @Factory
  trait ConformancePackInputParameter extends js.Object {
    var ParameterName: ParameterName
    var ParameterValue: ParameterValue
  }

  /**
    * Compliance information of one or more AWS Config rules within a conformance pack. You can filter using AWS Config rule names and compliance types.
    */
  @js.native
  @Factory
  trait ConformancePackRuleCompliance extends js.Object {
    var ComplianceType: js.UndefOr[ConformancePackComplianceType]
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
  }

  @js.native
  sealed trait ConformancePackState extends js.Any
  object ConformancePackState extends js.Object {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ConformancePackState]
    val CREATE_COMPLETE    = "CREATE_COMPLETE".asInstanceOf[ConformancePackState]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[ConformancePackState]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ConformancePackState]
    val DELETE_FAILED      = "DELETE_FAILED".asInstanceOf[ConformancePackState]

    val values =
      js.Object.freeze(js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, DELETE_IN_PROGRESS, DELETE_FAILED))
  }

  /**
    * Status details of a conformance pack.
    */
  @js.native
  @Factory
  trait ConformancePackStatusDetail extends js.Object {
    var ConformancePackArn: ConformancePackArn
    var ConformancePackId: ConformancePackId
    var ConformancePackName: ConformancePackName
    var ConformancePackState: ConformancePackState
    var LastUpdateRequestedTime: Date
    var StackArn: StackArn
    var ConformancePackStatusReason: js.UndefOr[ConformancePackStatusReason]
    var LastUpdateCompletedTime: js.UndefOr[Date]
  }

  @js.native
  @Factory
  trait DeleteAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: AccountId
    var AuthorizedAwsRegion: AwsRegion
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteConfigRuleRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
  }

  @js.native
  @Factory
  trait DeleteConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
  }

  /**
    * The request object for the <code>DeleteConfigurationRecorder</code> action.
    */
  @js.native
  @Factory
  trait DeleteConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  @js.native
  @Factory
  trait DeleteConformancePackRequest extends js.Object {
    var ConformancePackName: ConformancePackName
  }

  /**
    * The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON format.
    */
  @js.native
  @Factory
  trait DeleteDeliveryChannelRequest extends js.Object {
    var DeliveryChannelName: ChannelName
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEvaluationResultsRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
  }

  /**
    * The output when you delete the evaluation results for the specified AWS Config rule.
    */
  @js.native
  @Factory
  trait DeleteEvaluationResultsResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteOrganizationConfigRuleRequest extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
  }

  @js.native
  @Factory
  trait DeleteOrganizationConformancePackRequest extends js.Object {
    var OrganizationConformancePackName: OrganizationConformancePackName
  }

  @js.native
  @Factory
  trait DeletePendingAggregationRequestRequest extends js.Object {
    var RequesterAccountId: AccountId
    var RequesterAwsRegion: AwsRegion
  }

  @js.native
  @Factory
  trait DeleteRemediationConfigurationRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteRemediationConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRemediationExceptionsRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceKeys: RemediationExceptionResourceKeys
  }

  @js.native
  @Factory
  trait DeleteRemediationExceptionsResponse extends js.Object {
    var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches]
  }

  @js.native
  @Factory
  trait DeleteResourceConfigRequest extends js.Object {
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeString
  }

  @js.native
  @Factory
  trait DeleteRetentionConfigurationRequest extends js.Object {
    var RetentionConfigurationName: RetentionConfigurationName
  }

  /**
    * The input for the <a>DeliverConfigSnapshot</a> action.
    */
  @js.native
  @Factory
  trait DeliverConfigSnapshotRequest extends js.Object {
    var deliveryChannelName: ChannelName
  }

  /**
    * The output for the <a>DeliverConfigSnapshot</a> action, in JSON format.
    */
  @js.native
  @Factory
  trait DeliverConfigSnapshotResponse extends js.Object {
    var configSnapshotId: js.UndefOr[String]
  }

  /**
    * The channel through which AWS Config delivers notifications and updated configuration states.
    */
  @js.native
  @Factory
  trait DeliveryChannel extends js.Object {
    var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties]
    var name: js.UndefOr[ChannelName]
    var s3BucketName: js.UndefOr[String]
    var s3KeyPrefix: js.UndefOr[String]
    var snsTopicARN: js.UndefOr[String]
  }

  /**
    * The status of a specified delivery channel.
    *  Valid values: <code>Success</code> | <code>Failure</code>
    */
  @js.native
  @Factory
  trait DeliveryChannelStatus extends js.Object {
    var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo]
    var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo]
    var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo]
    var name: js.UndefOr[String]
  }

  @js.native
  sealed trait DeliveryStatus extends js.Any
  object DeliveryStatus extends js.Object {
    val Success        = "Success".asInstanceOf[DeliveryStatus]
    val Failure        = "Failure".asInstanceOf[DeliveryStatus]
    val Not_Applicable = "Not_Applicable".asInstanceOf[DeliveryStatus]

    val values = js.Object.freeze(js.Array(Success, Failure, Not_Applicable))
  }

  @js.native
  @Factory
  trait DescribeAggregateComplianceByConfigRulesRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ConfigRuleComplianceFilters]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
    var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAggregationAuthorizationsRequest extends js.Object {
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeAggregationAuthorizationsResponse extends js.Object {
    var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeComplianceByConfigRuleRequest extends js.Object {
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeComplianceByConfigRuleResponse extends js.Object {
    var ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeComplianceByResourceRequest extends js.Object {
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeComplianceByResourceResponse extends js.Object {
    var ComplianceByResources: js.UndefOr[ComplianceByResources]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var Limit: js.UndefOr[RuleLimit]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
    var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeConfigRulesRequest extends js.Object {
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeConfigRulesResponse extends js.Object {
    var ConfigRules: js.UndefOr[ConfigRules]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeConfigurationAggregatorSourcesStatusRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
    var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList]
  }

  @js.native
  @Factory
  trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
    var AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeConfigurationAggregatorsRequest extends js.Object {
    var ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeConfigurationAggregatorsResponse extends js.Object {
    var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * The input for the <a>DescribeConfigurationRecorderStatus</a> action.
    */
  @js.native
  @Factory
  trait DescribeConfigurationRecorderStatusRequest extends js.Object {
    var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList]
  }

  /**
    * The output for the <a>DescribeConfigurationRecorderStatus</a> action, in JSON format.
    */
  @js.native
  @Factory
  trait DescribeConfigurationRecorderStatusResponse extends js.Object {
    var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList]
  }

  /**
    * The input for the <a>DescribeConfigurationRecorders</a> action.
    */
  @js.native
  @Factory
  trait DescribeConfigurationRecordersRequest extends js.Object {
    var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList]
  }

  /**
    * The output for the <a>DescribeConfigurationRecorders</a> action.
    */
  @js.native
  @Factory
  trait DescribeConfigurationRecordersResponse extends js.Object {
    var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList]
  }

  @js.native
  @Factory
  trait DescribeConformancePackComplianceRequest extends js.Object {
    var ConformancePackName: ConformancePackName
    var Filters: js.UndefOr[ConformancePackComplianceFilters]
    var Limit: js.UndefOr[DescribeConformancePackComplianceLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeConformancePackComplianceResponse extends js.Object {
    var ConformancePackName: ConformancePackName
    var ConformancePackRuleComplianceList: ConformancePackRuleComplianceList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeConformancePackStatusRequest extends js.Object {
    var ConformancePackNames: js.UndefOr[ConformancePackNamesList]
    var Limit: js.UndefOr[PageSizeLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeConformancePackStatusResponse extends js.Object {
    var ConformancePackStatusDetails: js.UndefOr[ConformancePackStatusDetailsList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeConformancePacksRequest extends js.Object {
    var ConformancePackNames: js.UndefOr[ConformancePackNamesList]
    var Limit: js.UndefOr[PageSizeLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeConformancePacksResponse extends js.Object {
    var ConformancePackDetails: js.UndefOr[ConformancePackDetailList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The input for the <a>DeliveryChannelStatus</a> action.
    */
  @js.native
  @Factory
  trait DescribeDeliveryChannelStatusRequest extends js.Object {
    var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList]
  }

  /**
    * The output for the <a>DescribeDeliveryChannelStatus</a> action.
    */
  @js.native
  @Factory
  trait DescribeDeliveryChannelStatusResponse extends js.Object {
    var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList]
  }

  /**
    * The input for the <a>DescribeDeliveryChannels</a> action.
    */
  @js.native
  @Factory
  trait DescribeDeliveryChannelsRequest extends js.Object {
    var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList]
  }

  /**
    * The output for the <a>DescribeDeliveryChannels</a> action.
    */
  @js.native
  @Factory
  trait DescribeDeliveryChannelsResponse extends js.Object {
    var DeliveryChannels: js.UndefOr[DeliveryChannelList]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConfigRuleStatusesRequest extends js.Object {
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConfigRuleStatusesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleStatuses: js.UndefOr[OrganizationConfigRuleStatuses]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConfigRulesRequest extends js.Object {
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConfigRulesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRules: js.UndefOr[OrganizationConfigRules]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConformancePackStatusesRequest extends js.Object {
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
    var OrganizationConformancePackNames: js.UndefOr[OrganizationConformancePackNames]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConformancePackStatusesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConformancePackStatuses: js.UndefOr[OrganizationConformancePackStatuses]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConformancePacksRequest extends js.Object {
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
    var OrganizationConformancePackNames: js.UndefOr[OrganizationConformancePackNames]
  }

  @js.native
  @Factory
  trait DescribeOrganizationConformancePacksResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConformancePacks: js.UndefOr[OrganizationConformancePacks]
  }

  @js.native
  @Factory
  trait DescribePendingAggregationRequestsRequest extends js.Object {
    var Limit: js.UndefOr[DescribePendingAggregationRequestsLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribePendingAggregationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList]
  }

  @js.native
  @Factory
  trait DescribeRemediationConfigurationsRequest extends js.Object {
    var ConfigRuleNames: ConfigRuleNames
  }

  @js.native
  @Factory
  trait DescribeRemediationConfigurationsResponse extends js.Object {
    var RemediationConfigurations: js.UndefOr[RemediationConfigurations]
  }

  @js.native
  @Factory
  trait DescribeRemediationExceptionsRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
    var ResourceKeys: js.UndefOr[RemediationExceptionResourceKeys]
  }

  @js.native
  @Factory
  trait DescribeRemediationExceptionsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RemediationExceptions: js.UndefOr[RemediationExceptions]
  }

  @js.native
  @Factory
  trait DescribeRemediationExecutionStatusRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
    var ResourceKeys: js.UndefOr[ResourceKeys]
  }

  @js.native
  @Factory
  trait DescribeRemediationExecutionStatusResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RemediationExecutionStatuses: js.UndefOr[RemediationExecutionStatuses]
  }

  @js.native
  @Factory
  trait DescribeRetentionConfigurationsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList]
  }

  @js.native
  @Factory
  trait DescribeRetentionConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RetentionConfigurations: js.UndefOr[RetentionConfigurationList]
  }

  /**
    * Identifies an AWS resource and indicates whether it complies with the AWS Config rule that it was evaluated against.
    */
  @js.native
  @Factory
  trait Evaluation extends js.Object {
    var ComplianceResourceId: BaseResourceId
    var ComplianceResourceType: StringWithCharLimit256
    var ComplianceType: ComplianceType
    var OrderingTimestamp: OrderingTimestamp
    var Annotation: js.UndefOr[StringWithCharLimit256]
  }

  /**
    * The details of an AWS Config evaluation. Provides the AWS resource that was evaluated, the compliance of the resource, related time stamps, and supplementary information.
    */
  @js.native
  @Factory
  trait EvaluationResult extends js.Object {
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigRuleInvokedTime: js.UndefOr[Date]
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier]
    var ResultRecordedTime: js.UndefOr[Date]
    var ResultToken: js.UndefOr[String]
  }

  /**
    * Uniquely identifies an evaluation result.
    */
  @js.native
  @Factory
  trait EvaluationResultIdentifier extends js.Object {
    var EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier]
    var OrderingTimestamp: js.UndefOr[Date]
  }

  /**
    * Identifies an AWS Config rule that evaluated an AWS resource, and provides the type and ID of the resource that the rule evaluated.
    */
  @js.native
  @Factory
  trait EvaluationResultQualifier extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  @js.native
  sealed trait EventSource extends js.Any
  object EventSource extends js.Object {
    val `aws.config` = "aws.config".asInstanceOf[EventSource]

    val values = js.Object.freeze(js.Array(`aws.config`))
  }

  /**
    * The controls that AWS Config uses for executing remediations.
    */
  @js.native
  @Factory
  trait ExecutionControls extends js.Object {
    var SsmControls: js.UndefOr[SsmControls]
  }

  /**
    * List of each of the failed delete remediation exceptions with specific reasons.
    */
  @js.native
  @Factory
  trait FailedDeleteRemediationExceptionsBatch extends js.Object {
    var FailedItems: js.UndefOr[RemediationExceptionResourceKeys]
    var FailureMessage: js.UndefOr[String]
  }

  /**
    * List of each of the failed remediations with specific reasons.
    */
  @js.native
  @Factory
  trait FailedRemediationBatch extends js.Object {
    var FailedItems: js.UndefOr[RemediationConfigurations]
    var FailureMessage: js.UndefOr[String]
  }

  /**
    * List of each of the failed remediation exceptions with specific reasons.
    */
  @js.native
  @Factory
  trait FailedRemediationExceptionBatch extends js.Object {
    var FailedItems: js.UndefOr[RemediationExceptions]
    var FailureMessage: js.UndefOr[String]
  }

  /**
    * Details about the fields such as name of the field.
    */
  @js.native
  @Factory
  trait FieldInfo extends js.Object {
    var Name: js.UndefOr[FieldName]
  }

  @js.native
  @Factory
  trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
    var AccountId: AccountId
    var AwsRegion: AwsRegion
    var ConfigRuleName: ConfigRuleName
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ComplianceType: js.UndefOr[ComplianceType]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
    var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAggregateConfigRuleComplianceSummaryRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters]
    var GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
    var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList]
    var GroupByKey: js.UndefOr[StringWithCharLimit256]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAggregateDiscoveredResourceCountsRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ResourceCountFilters]
    var GroupByKey: js.UndefOr[ResourceCountGroupKey]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAggregateDiscoveredResourceCountsResponse extends js.Object {
    var TotalDiscoveredResources: Double
    var GroupByKey: js.UndefOr[StringWithCharLimit256]
    var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAggregateResourceConfigRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceIdentifier: AggregateResourceIdentifier
  }

  @js.native
  @Factory
  trait GetAggregateResourceConfigResponse extends js.Object {
    var ConfigurationItem: js.UndefOr[ConfigurationItem]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceDetailsByConfigRuleResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceDetailsByResourceRequest extends js.Object {
    var ResourceId: BaseResourceId
    var ResourceType: StringWithCharLimit256
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceDetailsByResourceResponse extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResults]
    var NextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
    var ResourceTypes: js.UndefOr[ResourceTypes]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetComplianceSummaryByResourceTypeResponse extends js.Object {
    var ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType]
  }

  @js.native
  @Factory
  trait GetConformancePackComplianceDetailsRequest extends js.Object {
    var ConformancePackName: ConformancePackName
    var Filters: js.UndefOr[ConformancePackEvaluationFilters]
    var Limit: js.UndefOr[GetConformancePackComplianceDetailsLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetConformancePackComplianceDetailsResponse extends js.Object {
    var ConformancePackName: ConformancePackName
    var ConformancePackRuleEvaluationResults: js.UndefOr[ConformancePackRuleEvaluationResultsList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetConformancePackComplianceSummaryRequest extends js.Object {
    var ConformancePackNames: ConformancePackNamesToSummarizeList
    var Limit: js.UndefOr[PageSizeLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetConformancePackComplianceSummaryResponse extends js.Object {
    var ConformancePackComplianceSummaryList: js.UndefOr[ConformancePackComplianceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetDiscoveredResourceCountsRequest extends js.Object {
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
    var resourceTypes: js.UndefOr[ResourceTypes]
  }

  @js.native
  @Factory
  trait GetDiscoveredResourceCountsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourceCounts: js.UndefOr[ResourceCounts]
    var totalDiscoveredResources: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait GetOrganizationConfigRuleDetailedStatusRequest extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var Filters: js.UndefOr[StatusDetailFilters]
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOrganizationConfigRuleDetailedStatusResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConfigRuleDetailedStatus: js.UndefOr[OrganizationConfigRuleDetailedStatus]
  }

  @js.native
  @Factory
  trait GetOrganizationConformancePackDetailedStatusRequest extends js.Object {
    var OrganizationConformancePackName: OrganizationConformancePackName
    var Filters: js.UndefOr[OrganizationResourceDetailedStatusFilters]
    var Limit: js.UndefOr[CosmosPageLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOrganizationConformancePackDetailedStatusResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OrganizationConformancePackDetailedStatuses: js.UndefOr[OrganizationConformancePackDetailedStatuses]
  }

  /**
    * The input for the <a>GetResourceConfigHistory</a> action.
    */
  @js.native
  @Factory
  trait GetResourceConfigHistoryRequest extends js.Object {
    var resourceId: ResourceId
    var resourceType: ResourceType
    var chronologicalOrder: js.UndefOr[ChronologicalOrder]
    var earlierTime: js.UndefOr[EarlierTime]
    var laterTime: js.UndefOr[LaterTime]
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * The output for the <a>GetResourceConfigHistory</a> action.
    */
  @js.native
  @Factory
  trait GetResourceConfigHistoryResponse extends js.Object {
    var configurationItems: js.UndefOr[ConfigurationItemList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * The count of resources that are grouped by the group name.
    */
  @js.native
  @Factory
  trait GroupedResourceCount extends js.Object {
    var GroupName: StringWithCharLimit256
    var ResourceCount: Double
  }

  @js.native
  @Factory
  trait ListAggregateDiscoveredResourcesRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceType: ResourceType
    var Filters: js.UndefOr[ResourceFilters]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAggregateDiscoveredResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListDiscoveredResourcesRequest extends js.Object {
    var resourceType: ResourceType
    var includeDeletedResources: js.UndefOr[Boolean]
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
    var resourceIds: js.UndefOr[ResourceIdList]
    var resourceName: js.UndefOr[ResourceName]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListDiscoveredResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait MaximumExecutionFrequency extends js.Any
  object MaximumExecutionFrequency extends js.Object {
    val One_Hour         = "One_Hour".asInstanceOf[MaximumExecutionFrequency]
    val Three_Hours      = "Three_Hours".asInstanceOf[MaximumExecutionFrequency]
    val Six_Hours        = "Six_Hours".asInstanceOf[MaximumExecutionFrequency]
    val Twelve_Hours     = "Twelve_Hours".asInstanceOf[MaximumExecutionFrequency]
    val TwentyFour_Hours = "TwentyFour_Hours".asInstanceOf[MaximumExecutionFrequency]

    val values = js.Object.freeze(js.Array(One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours))
  }

  @js.native
  sealed trait MemberAccountRuleStatus extends js.Any
  object MemberAccountRuleStatus extends js.Object {
    val CREATE_SUCCESSFUL  = "CREATE_SUCCESSFUL".asInstanceOf[MemberAccountRuleStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[MemberAccountRuleStatus]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[MemberAccountRuleStatus]
    val DELETE_SUCCESSFUL  = "DELETE_SUCCESSFUL".asInstanceOf[MemberAccountRuleStatus]
    val DELETE_FAILED      = "DELETE_FAILED".asInstanceOf[MemberAccountRuleStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[MemberAccountRuleStatus]
    val UPDATE_SUCCESSFUL  = "UPDATE_SUCCESSFUL".asInstanceOf[MemberAccountRuleStatus]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[MemberAccountRuleStatus]
    val UPDATE_FAILED      = "UPDATE_FAILED".asInstanceOf[MemberAccountRuleStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATE_SUCCESSFUL,
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        DELETE_SUCCESSFUL,
        DELETE_FAILED,
        DELETE_IN_PROGRESS,
        UPDATE_SUCCESSFUL,
        UPDATE_IN_PROGRESS,
        UPDATE_FAILED
      )
    )
  }

  /**
    * Organization config rule creation or deletion status in each member account. This includes the name of the rule, the status, error code and error message when the rule creation or deletion failed.
    */
  @js.native
  @Factory
  trait MemberAccountStatus extends js.Object {
    var AccountId: AccountId
    var ConfigRuleName: StringWithCharLimit64
    var MemberAccountRuleStatus: MemberAccountRuleStatus
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LastUpdateTime: js.UndefOr[Date]
  }

  @js.native
  sealed trait MessageType extends js.Any
  object MessageType extends js.Object {
    val ConfigurationItemChangeNotification    = "ConfigurationItemChangeNotification".asInstanceOf[MessageType]
    val ConfigurationSnapshotDeliveryCompleted = "ConfigurationSnapshotDeliveryCompleted".asInstanceOf[MessageType]
    val ScheduledNotification                  = "ScheduledNotification".asInstanceOf[MessageType]
    val OversizedConfigurationItemChangeNotification =
      "OversizedConfigurationItemChangeNotification".asInstanceOf[MessageType]

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
  @Factory
  trait OrganizationAggregationSource extends js.Object {
    var RoleArn: String
    var AllAwsRegions: js.UndefOr[Boolean]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
  }

  /**
    * An organization config rule that has information about config rules that AWS Config creates in member accounts.
    */
  @js.native
  @Factory
  trait OrganizationConfigRule extends js.Object {
    var OrganizationConfigRuleArn: StringWithCharLimit256
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var ExcludedAccounts: js.UndefOr[ExcludedAccounts]
    var LastUpdateTime: js.UndefOr[Date]
    var OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata]
    var OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata]
  }

  /**
    * Returns the status for an organization config rule in an organization.
    */
  @js.native
  @Factory
  trait OrganizationConfigRuleStatus extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var OrganizationRuleStatus: OrganizationRuleStatus
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LastUpdateTime: js.UndefOr[Date]
  }

  @js.native
  sealed trait OrganizationConfigRuleTriggerType extends js.Any
  object OrganizationConfigRuleTriggerType extends js.Object {
    val ConfigurationItemChangeNotification =
      "ConfigurationItemChangeNotification".asInstanceOf[OrganizationConfigRuleTriggerType]
    val OversizedConfigurationItemChangeNotification =
      "OversizedConfigurationItemChangeNotification".asInstanceOf[OrganizationConfigRuleTriggerType]
    val ScheduledNotification = "ScheduledNotification".asInstanceOf[OrganizationConfigRuleTriggerType]

    val values = js.Object.freeze(
      js.Array(ConfigurationItemChangeNotification, OversizedConfigurationItemChangeNotification, ScheduledNotification)
    )
  }

  /**
    * An organization conformance pack that has information about conformance packs that AWS Config creates in member accounts.
    */
  @js.native
  @Factory
  trait OrganizationConformancePack extends js.Object {
    var DeliveryS3Bucket: DeliveryS3Bucket
    var LastUpdateTime: Date
    var OrganizationConformancePackArn: StringWithCharLimit256
    var OrganizationConformancePackName: OrganizationConformancePackName
    var ConformancePackInputParameters: js.UndefOr[ConformancePackInputParameters]
    var DeliveryS3KeyPrefix: js.UndefOr[DeliveryS3KeyPrefix]
    var ExcludedAccounts: js.UndefOr[ExcludedAccounts]
  }

  /**
    * Organization conformance pack creation or deletion status in each member account. This includes the name of the conformance pack, the status, error code and error message when the conformance pack creation or deletion failed.
    */
  @js.native
  @Factory
  trait OrganizationConformancePackDetailedStatus extends js.Object {
    var AccountId: AccountId
    var ConformancePackName: StringWithCharLimit256
    var Status: OrganizationResourceDetailedStatus
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LastUpdateTime: js.UndefOr[Date]
  }

  /**
    * Returns the status for an organization conformance pack in an organization.
    */
  @js.native
  @Factory
  trait OrganizationConformancePackStatus extends js.Object {
    var OrganizationConformancePackName: OrganizationConformancePackName
    var Status: OrganizationResourceStatus
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LastUpdateTime: js.UndefOr[Date]
  }

  /**
    * An object that specifies organization custom rule metadata such as resource type, resource ID of AWS resource, Lamdba function ARN, and organization trigger types that trigger AWS Config to evaluate your AWS resources against a rule. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic.
    */
  @js.native
  @Factory
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

  /**
    * An object that specifies organization managed rule metadata such as resource type and ID of AWS resource along with the rule identifier. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait OrganizationResourceDetailedStatus extends js.Any
  object OrganizationResourceDetailedStatus extends js.Object {
    val CREATE_SUCCESSFUL  = "CREATE_SUCCESSFUL".asInstanceOf[OrganizationResourceDetailedStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OrganizationResourceDetailedStatus]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[OrganizationResourceDetailedStatus]
    val DELETE_SUCCESSFUL  = "DELETE_SUCCESSFUL".asInstanceOf[OrganizationResourceDetailedStatus]
    val DELETE_FAILED      = "DELETE_FAILED".asInstanceOf[OrganizationResourceDetailedStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[OrganizationResourceDetailedStatus]
    val UPDATE_SUCCESSFUL  = "UPDATE_SUCCESSFUL".asInstanceOf[OrganizationResourceDetailedStatus]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[OrganizationResourceDetailedStatus]
    val UPDATE_FAILED      = "UPDATE_FAILED".asInstanceOf[OrganizationResourceDetailedStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATE_SUCCESSFUL,
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        DELETE_SUCCESSFUL,
        DELETE_FAILED,
        DELETE_IN_PROGRESS,
        UPDATE_SUCCESSFUL,
        UPDATE_IN_PROGRESS,
        UPDATE_FAILED
      )
    )
  }

  /**
    * Status filter object to filter results based on specific member account ID or status type for an organization conformance pack.
    */
  @js.native
  @Factory
  trait OrganizationResourceDetailedStatusFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Status: js.UndefOr[OrganizationResourceDetailedStatus]
  }

  @js.native
  sealed trait OrganizationResourceStatus extends js.Any
  object OrganizationResourceStatus extends js.Object {
    val CREATE_SUCCESSFUL  = "CREATE_SUCCESSFUL".asInstanceOf[OrganizationResourceStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OrganizationResourceStatus]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[OrganizationResourceStatus]
    val DELETE_SUCCESSFUL  = "DELETE_SUCCESSFUL".asInstanceOf[OrganizationResourceStatus]
    val DELETE_FAILED      = "DELETE_FAILED".asInstanceOf[OrganizationResourceStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[OrganizationResourceStatus]
    val UPDATE_SUCCESSFUL  = "UPDATE_SUCCESSFUL".asInstanceOf[OrganizationResourceStatus]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[OrganizationResourceStatus]
    val UPDATE_FAILED      = "UPDATE_FAILED".asInstanceOf[OrganizationResourceStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATE_SUCCESSFUL,
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        DELETE_SUCCESSFUL,
        DELETE_FAILED,
        DELETE_IN_PROGRESS,
        UPDATE_SUCCESSFUL,
        UPDATE_IN_PROGRESS,
        UPDATE_FAILED
      )
    )
  }

  @js.native
  sealed trait OrganizationRuleStatus extends js.Any
  object OrganizationRuleStatus extends js.Object {
    val CREATE_SUCCESSFUL  = "CREATE_SUCCESSFUL".asInstanceOf[OrganizationRuleStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OrganizationRuleStatus]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[OrganizationRuleStatus]
    val DELETE_SUCCESSFUL  = "DELETE_SUCCESSFUL".asInstanceOf[OrganizationRuleStatus]
    val DELETE_FAILED      = "DELETE_FAILED".asInstanceOf[OrganizationRuleStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[OrganizationRuleStatus]
    val UPDATE_SUCCESSFUL  = "UPDATE_SUCCESSFUL".asInstanceOf[OrganizationRuleStatus]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[OrganizationRuleStatus]
    val UPDATE_FAILED      = "UPDATE_FAILED".asInstanceOf[OrganizationRuleStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATE_SUCCESSFUL,
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        DELETE_SUCCESSFUL,
        DELETE_FAILED,
        DELETE_IN_PROGRESS,
        UPDATE_SUCCESSFUL,
        UPDATE_IN_PROGRESS,
        UPDATE_FAILED
      )
    )
  }

  @js.native
  sealed trait Owner extends js.Any
  object Owner extends js.Object {
    val CUSTOM_LAMBDA = "CUSTOM_LAMBDA".asInstanceOf[Owner]
    val AWS           = "AWS".asInstanceOf[Owner]

    val values = js.Object.freeze(js.Array(CUSTOM_LAMBDA, AWS))
  }

  /**
    * An object that represents the account ID and region of an aggregator account that is requesting authorization but is not yet authorized.
    */
  @js.native
  @Factory
  trait PendingAggregationRequest extends js.Object {
    var RequesterAccountId: js.UndefOr[AccountId]
    var RequesterAwsRegion: js.UndefOr[AwsRegion]
  }

  @js.native
  @Factory
  trait PutAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: AccountId
    var AuthorizedAwsRegion: AwsRegion
    var Tags: js.UndefOr[TagsList]
  }

  @js.native
  @Factory
  trait PutAggregationAuthorizationResponse extends js.Object {
    var AggregationAuthorization: js.UndefOr[AggregationAuthorization]
  }

  @js.native
  @Factory
  trait PutConfigRuleRequest extends js.Object {
    var ConfigRule: ConfigRule
    var Tags: js.UndefOr[TagsList]
  }

  @js.native
  @Factory
  trait PutConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
    var Tags: js.UndefOr[TagsList]
  }

  @js.native
  @Factory
  trait PutConfigurationAggregatorResponse extends js.Object {
    var ConfigurationAggregator: js.UndefOr[ConfigurationAggregator]
  }

  /**
    * The input for the <a>PutConfigurationRecorder</a> action.
    */
  @js.native
  @Factory
  trait PutConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorder: ConfigurationRecorder
  }

  @js.native
  @Factory
  trait PutConformancePackRequest extends js.Object {
    var ConformancePackName: ConformancePackName
    var DeliveryS3Bucket: DeliveryS3Bucket
    var ConformancePackInputParameters: js.UndefOr[ConformancePackInputParameters]
    var DeliveryS3KeyPrefix: js.UndefOr[DeliveryS3KeyPrefix]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateS3Uri: js.UndefOr[TemplateS3Uri]
  }

  @js.native
  @Factory
  trait PutConformancePackResponse extends js.Object {
    var ConformancePackArn: js.UndefOr[ConformancePackArn]
  }

  /**
    * The input for the <a>PutDeliveryChannel</a> action.
    */
  @js.native
  @Factory
  trait PutDeliveryChannelRequest extends js.Object {
    var DeliveryChannel: DeliveryChannel
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PutEvaluationsRequest extends js.Object {
    var ResultToken: String
    var Evaluations: js.UndefOr[Evaluations]
    var TestMode: js.UndefOr[Boolean]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PutEvaluationsResponse extends js.Object {
    var FailedEvaluations: js.UndefOr[Evaluations]
  }

  @js.native
  @Factory
  trait PutOrganizationConfigRuleRequest extends js.Object {
    var OrganizationConfigRuleName: OrganizationConfigRuleName
    var ExcludedAccounts: js.UndefOr[ExcludedAccounts]
    var OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata]
    var OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata]
  }

  @js.native
  @Factory
  trait PutOrganizationConfigRuleResponse extends js.Object {
    var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256]
  }

  @js.native
  @Factory
  trait PutOrganizationConformancePackRequest extends js.Object {
    var DeliveryS3Bucket: DeliveryS3Bucket
    var OrganizationConformancePackName: OrganizationConformancePackName
    var ConformancePackInputParameters: js.UndefOr[ConformancePackInputParameters]
    var DeliveryS3KeyPrefix: js.UndefOr[DeliveryS3KeyPrefix]
    var ExcludedAccounts: js.UndefOr[ExcludedAccounts]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateS3Uri: js.UndefOr[TemplateS3Uri]
  }

  @js.native
  @Factory
  trait PutOrganizationConformancePackResponse extends js.Object {
    var OrganizationConformancePackArn: js.UndefOr[StringWithCharLimit256]
  }

  @js.native
  @Factory
  trait PutRemediationConfigurationsRequest extends js.Object {
    var RemediationConfigurations: RemediationConfigurations
  }

  @js.native
  @Factory
  trait PutRemediationConfigurationsResponse extends js.Object {
    var FailedBatches: js.UndefOr[FailedRemediationBatches]
  }

  @js.native
  @Factory
  trait PutRemediationExceptionsRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceKeys: RemediationExceptionResourceKeys
    var ExpirationTime: js.UndefOr[Date]
    var Message: js.UndefOr[StringWithCharLimit1024]
  }

  @js.native
  @Factory
  trait PutRemediationExceptionsResponse extends js.Object {
    var FailedBatches: js.UndefOr[FailedRemediationExceptionBatches]
  }

  @js.native
  @Factory
  trait PutResourceConfigRequest extends js.Object {
    var Configuration: Configuration
    var ResourceId: ResourceId
    var ResourceType: ResourceTypeString
    var SchemaVersionId: SchemaVersionId
    var ResourceName: js.UndefOr[ResourceName]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait PutRetentionConfigurationRequest extends js.Object {
    var RetentionPeriodInDays: RetentionPeriodInDays
  }

  @js.native
  @Factory
  trait PutRetentionConfigurationResponse extends js.Object {
    var RetentionConfiguration: js.UndefOr[RetentionConfiguration]
  }

  /**
    * Details about the query.
    */
  @js.native
  @Factory
  trait QueryInfo extends js.Object {
    var SelectFields: js.UndefOr[FieldInfoList]
  }

  @js.native
  sealed trait RecorderStatus extends js.Any
  object RecorderStatus extends js.Object {
    val Pending = "Pending".asInstanceOf[RecorderStatus]
    val Success = "Success".asInstanceOf[RecorderStatus]
    val Failure = "Failure".asInstanceOf[RecorderStatus]

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
  @Factory
  trait RecordingGroup extends js.Object {
    var allSupported: js.UndefOr[AllSupported]
    var includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes]
    var resourceTypes: js.UndefOr[ResourceTypeList]
  }

  /**
    * The relationship of the related resource to the main resource.
    */
  @js.native
  @Factory
  trait Relationship extends js.Object {
    var relationshipName: js.UndefOr[RelationshipName]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
  }

  /**
    * An object that represents the details about the remediation configuration that includes the remediation action, parameters, and data to execute the action.
    */
  @js.native
  @Factory
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

  /**
    * An object that represents the details about the remediation exception. The details include the rule name, an explanation of an exception, the time when the exception will be deleted, the resource ID, and resource type.
    */
  @js.native
  @Factory
  trait RemediationException extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceId: StringWithCharLimit1024
    var ResourceType: StringWithCharLimit256
    var ExpirationTime: js.UndefOr[Date]
    var Message: js.UndefOr[StringWithCharLimit1024]
  }

  /**
    * The details that identify a resource within AWS Config, including the resource type and resource ID.
    */
  @js.native
  @Factory
  trait RemediationExceptionResourceKey extends js.Object {
    var ResourceId: js.UndefOr[StringWithCharLimit1024]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
  }

  @js.native
  sealed trait RemediationExecutionState extends js.Any
  object RemediationExecutionState extends js.Object {
    val QUEUED      = "QUEUED".asInstanceOf[RemediationExecutionState]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RemediationExecutionState]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[RemediationExecutionState]
    val FAILED      = "FAILED".asInstanceOf[RemediationExecutionState]

    val values = js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED))
  }

  /**
    * Provides details of the current status of the invoked remediation action for that resource.
    */
  @js.native
  @Factory
  trait RemediationExecutionStatus extends js.Object {
    var InvocationTime: js.UndefOr[Date]
    var LastUpdatedTime: js.UndefOr[Date]
    var ResourceKey: js.UndefOr[ResourceKey]
    var State: js.UndefOr[RemediationExecutionState]
    var StepDetails: js.UndefOr[RemediationExecutionSteps]
  }

  /**
    * Name of the step from the SSM document.
    */
  @js.native
  @Factory
  trait RemediationExecutionStep extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var StartTime: js.UndefOr[Date]
    var State: js.UndefOr[RemediationExecutionStepState]
    var StopTime: js.UndefOr[Date]
  }

  @js.native
  sealed trait RemediationExecutionStepState extends js.Any
  object RemediationExecutionStepState extends js.Object {
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[RemediationExecutionStepState]
    val PENDING   = "PENDING".asInstanceOf[RemediationExecutionStepState]
    val FAILED    = "FAILED".asInstanceOf[RemediationExecutionStepState]

    val values = js.Object.freeze(js.Array(SUCCEEDED, PENDING, FAILED))
  }

  /**
    * The value is either a dynamic (resource) value or a static value. You must select either a dynamic value or a static value.
    */
  @js.native
  @Factory
  trait RemediationParameterValue extends js.Object {
    var ResourceValue: js.UndefOr[ResourceValue]
    var StaticValue: js.UndefOr[StaticValue]
  }

  @js.native
  sealed trait RemediationTargetType extends js.Any
  object RemediationTargetType extends js.Object {
    val SSM_DOCUMENT = "SSM_DOCUMENT".asInstanceOf[RemediationTargetType]

    val values = js.Object.freeze(js.Array(SSM_DOCUMENT))
  }

  /**
    * An object that contains the resource type and the number of resources.
    */
  @js.native
  @Factory
  trait ResourceCount extends js.Object {
    var count: js.UndefOr[Double]
    var resourceType: js.UndefOr[ResourceType]
  }

  /**
    * Filters the resource count based on account ID, region, and resource type.
    */
  @js.native
  @Factory
  trait ResourceCountFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Region: js.UndefOr[AwsRegion]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  sealed trait ResourceCountGroupKey extends js.Any
  object ResourceCountGroupKey extends js.Object {
    val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[ResourceCountGroupKey]
    val ACCOUNT_ID    = "ACCOUNT_ID".asInstanceOf[ResourceCountGroupKey]
    val AWS_REGION    = "AWS_REGION".asInstanceOf[ResourceCountGroupKey]

    val values = js.Object.freeze(js.Array(RESOURCE_TYPE, ACCOUNT_ID, AWS_REGION))
  }

  /**
    * Filters the results by resource account ID, region, resource ID, and resource name.
    */
  @js.native
  @Factory
  trait ResourceFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Region: js.UndefOr[AwsRegion]
    var ResourceId: js.UndefOr[ResourceId]
    var ResourceName: js.UndefOr[ResourceName]
  }

  /**
    * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.
    */
  @js.native
  @Factory
  trait ResourceIdentifier extends js.Object {
    var resourceDeletionTime: js.UndefOr[ResourceDeletionTime]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
  }

  /**
    * The details that identify a resource within AWS Config, including the resource type and resource ID.
    */
  @js.native
  @Factory
  trait ResourceKey extends js.Object {
    var resourceId: ResourceId
    var resourceType: ResourceType
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val `AWS::EC2::CustomerGateway`           = "AWS::EC2::CustomerGateway".asInstanceOf[ResourceType]
    val `AWS::EC2::EIP`                       = "AWS::EC2::EIP".asInstanceOf[ResourceType]
    val `AWS::EC2::Host`                      = "AWS::EC2::Host".asInstanceOf[ResourceType]
    val `AWS::EC2::Instance`                  = "AWS::EC2::Instance".asInstanceOf[ResourceType]
    val `AWS::EC2::InternetGateway`           = "AWS::EC2::InternetGateway".asInstanceOf[ResourceType]
    val `AWS::EC2::NetworkAcl`                = "AWS::EC2::NetworkAcl".asInstanceOf[ResourceType]
    val `AWS::EC2::NetworkInterface`          = "AWS::EC2::NetworkInterface".asInstanceOf[ResourceType]
    val `AWS::EC2::RouteTable`                = "AWS::EC2::RouteTable".asInstanceOf[ResourceType]
    val `AWS::EC2::SecurityGroup`             = "AWS::EC2::SecurityGroup".asInstanceOf[ResourceType]
    val `AWS::EC2::Subnet`                    = "AWS::EC2::Subnet".asInstanceOf[ResourceType]
    val `AWS::CloudTrail::Trail`              = "AWS::CloudTrail::Trail".asInstanceOf[ResourceType]
    val `AWS::EC2::Volume`                    = "AWS::EC2::Volume".asInstanceOf[ResourceType]
    val `AWS::EC2::VPC`                       = "AWS::EC2::VPC".asInstanceOf[ResourceType]
    val `AWS::EC2::VPNConnection`             = "AWS::EC2::VPNConnection".asInstanceOf[ResourceType]
    val `AWS::EC2::VPNGateway`                = "AWS::EC2::VPNGateway".asInstanceOf[ResourceType]
    val `AWS::EC2::RegisteredHAInstance`      = "AWS::EC2::RegisteredHAInstance".asInstanceOf[ResourceType]
    val `AWS::EC2::NatGateway`                = "AWS::EC2::NatGateway".asInstanceOf[ResourceType]
    val `AWS::EC2::EgressOnlyInternetGateway` = "AWS::EC2::EgressOnlyInternetGateway".asInstanceOf[ResourceType]
    val `AWS::EC2::VPCEndpoint`               = "AWS::EC2::VPCEndpoint".asInstanceOf[ResourceType]
    val `AWS::EC2::VPCEndpointService`        = "AWS::EC2::VPCEndpointService".asInstanceOf[ResourceType]
    val `AWS::EC2::FlowLog`                   = "AWS::EC2::FlowLog".asInstanceOf[ResourceType]
    val `AWS::EC2::VPCPeeringConnection`      = "AWS::EC2::VPCPeeringConnection".asInstanceOf[ResourceType]
    val `AWS::IAM::Group`                     = "AWS::IAM::Group".asInstanceOf[ResourceType]
    val `AWS::IAM::Policy`                    = "AWS::IAM::Policy".asInstanceOf[ResourceType]
    val `AWS::IAM::Role`                      = "AWS::IAM::Role".asInstanceOf[ResourceType]
    val `AWS::IAM::User`                      = "AWS::IAM::User".asInstanceOf[ResourceType]
    val `AWS::ElasticLoadBalancingV2::LoadBalancer` =
      "AWS::ElasticLoadBalancingV2::LoadBalancer".asInstanceOf[ResourceType]
    val `AWS::ACM::Certificate`                   = "AWS::ACM::Certificate".asInstanceOf[ResourceType]
    val `AWS::RDS::DBInstance`                    = "AWS::RDS::DBInstance".asInstanceOf[ResourceType]
    val `AWS::RDS::DBParameterGroup`              = "AWS::RDS::DBParameterGroup".asInstanceOf[ResourceType]
    val `AWS::RDS::DBOptionGroup`                 = "AWS::RDS::DBOptionGroup".asInstanceOf[ResourceType]
    val `AWS::RDS::DBSubnetGroup`                 = "AWS::RDS::DBSubnetGroup".asInstanceOf[ResourceType]
    val `AWS::RDS::DBSecurityGroup`               = "AWS::RDS::DBSecurityGroup".asInstanceOf[ResourceType]
    val `AWS::RDS::DBSnapshot`                    = "AWS::RDS::DBSnapshot".asInstanceOf[ResourceType]
    val `AWS::RDS::DBCluster`                     = "AWS::RDS::DBCluster".asInstanceOf[ResourceType]
    val `AWS::RDS::DBClusterParameterGroup`       = "AWS::RDS::DBClusterParameterGroup".asInstanceOf[ResourceType]
    val `AWS::RDS::DBClusterSnapshot`             = "AWS::RDS::DBClusterSnapshot".asInstanceOf[ResourceType]
    val `AWS::RDS::EventSubscription`             = "AWS::RDS::EventSubscription".asInstanceOf[ResourceType]
    val `AWS::S3::Bucket`                         = "AWS::S3::Bucket".asInstanceOf[ResourceType]
    val `AWS::S3::AccountPublicAccessBlock`       = "AWS::S3::AccountPublicAccessBlock".asInstanceOf[ResourceType]
    val `AWS::Redshift::Cluster`                  = "AWS::Redshift::Cluster".asInstanceOf[ResourceType]
    val `AWS::Redshift::ClusterSnapshot`          = "AWS::Redshift::ClusterSnapshot".asInstanceOf[ResourceType]
    val `AWS::Redshift::ClusterParameterGroup`    = "AWS::Redshift::ClusterParameterGroup".asInstanceOf[ResourceType]
    val `AWS::Redshift::ClusterSecurityGroup`     = "AWS::Redshift::ClusterSecurityGroup".asInstanceOf[ResourceType]
    val `AWS::Redshift::ClusterSubnetGroup`       = "AWS::Redshift::ClusterSubnetGroup".asInstanceOf[ResourceType]
    val `AWS::Redshift::EventSubscription`        = "AWS::Redshift::EventSubscription".asInstanceOf[ResourceType]
    val `AWS::SSM::ManagedInstanceInventory`      = "AWS::SSM::ManagedInstanceInventory".asInstanceOf[ResourceType]
    val `AWS::CloudWatch::Alarm`                  = "AWS::CloudWatch::Alarm".asInstanceOf[ResourceType]
    val `AWS::CloudFormation::Stack`              = "AWS::CloudFormation::Stack".asInstanceOf[ResourceType]
    val `AWS::ElasticLoadBalancing::LoadBalancer` = "AWS::ElasticLoadBalancing::LoadBalancer".asInstanceOf[ResourceType]
    val `AWS::AutoScaling::AutoScalingGroup`      = "AWS::AutoScaling::AutoScalingGroup".asInstanceOf[ResourceType]
    val `AWS::AutoScaling::LaunchConfiguration`   = "AWS::AutoScaling::LaunchConfiguration".asInstanceOf[ResourceType]
    val `AWS::AutoScaling::ScalingPolicy`         = "AWS::AutoScaling::ScalingPolicy".asInstanceOf[ResourceType]
    val `AWS::AutoScaling::ScheduledAction`       = "AWS::AutoScaling::ScheduledAction".asInstanceOf[ResourceType]
    val `AWS::DynamoDB::Table`                    = "AWS::DynamoDB::Table".asInstanceOf[ResourceType]
    val `AWS::CodeBuild::Project`                 = "AWS::CodeBuild::Project".asInstanceOf[ResourceType]
    val `AWS::WAF::RateBasedRule`                 = "AWS::WAF::RateBasedRule".asInstanceOf[ResourceType]
    val `AWS::WAF::Rule`                          = "AWS::WAF::Rule".asInstanceOf[ResourceType]
    val `AWS::WAF::RuleGroup`                     = "AWS::WAF::RuleGroup".asInstanceOf[ResourceType]
    val `AWS::WAF::WebACL`                        = "AWS::WAF::WebACL".asInstanceOf[ResourceType]
    val `AWS::WAFRegional::RateBasedRule`         = "AWS::WAFRegional::RateBasedRule".asInstanceOf[ResourceType]
    val `AWS::WAFRegional::Rule`                  = "AWS::WAFRegional::Rule".asInstanceOf[ResourceType]
    val `AWS::WAFRegional::RuleGroup`             = "AWS::WAFRegional::RuleGroup".asInstanceOf[ResourceType]
    val `AWS::WAFRegional::WebACL`                = "AWS::WAFRegional::WebACL".asInstanceOf[ResourceType]
    val `AWS::CloudFront::Distribution`           = "AWS::CloudFront::Distribution".asInstanceOf[ResourceType]
    val `AWS::CloudFront::StreamingDistribution`  = "AWS::CloudFront::StreamingDistribution".asInstanceOf[ResourceType]
    val `AWS::Lambda::Alias`                      = "AWS::Lambda::Alias".asInstanceOf[ResourceType]
    val `AWS::Lambda::Function`                   = "AWS::Lambda::Function".asInstanceOf[ResourceType]
    val `AWS::ElasticBeanstalk::Application`      = "AWS::ElasticBeanstalk::Application".asInstanceOf[ResourceType]
    val `AWS::ElasticBeanstalk::ApplicationVersion` =
      "AWS::ElasticBeanstalk::ApplicationVersion".asInstanceOf[ResourceType]
    val `AWS::ElasticBeanstalk::Environment` = "AWS::ElasticBeanstalk::Environment".asInstanceOf[ResourceType]
    val `AWS::MobileHub::Project`            = "AWS::MobileHub::Project".asInstanceOf[ResourceType]
    val `AWS::XRay::EncryptionConfig`        = "AWS::XRay::EncryptionConfig".asInstanceOf[ResourceType]
    val `AWS::SSM::AssociationCompliance`    = "AWS::SSM::AssociationCompliance".asInstanceOf[ResourceType]
    val `AWS::SSM::PatchCompliance`          = "AWS::SSM::PatchCompliance".asInstanceOf[ResourceType]
    val `AWS::Shield::Protection`            = "AWS::Shield::Protection".asInstanceOf[ResourceType]
    val `AWS::ShieldRegional::Protection`    = "AWS::ShieldRegional::Protection".asInstanceOf[ResourceType]
    val `AWS::Config::ResourceCompliance`    = "AWS::Config::ResourceCompliance".asInstanceOf[ResourceType]
    val `AWS::LicenseManager::LicenseConfiguration` =
      "AWS::LicenseManager::LicenseConfiguration".asInstanceOf[ResourceType]
    val `AWS::ApiGateway::DomainName`   = "AWS::ApiGateway::DomainName".asInstanceOf[ResourceType]
    val `AWS::ApiGateway::Method`       = "AWS::ApiGateway::Method".asInstanceOf[ResourceType]
    val `AWS::ApiGateway::Stage`        = "AWS::ApiGateway::Stage".asInstanceOf[ResourceType]
    val `AWS::ApiGateway::RestApi`      = "AWS::ApiGateway::RestApi".asInstanceOf[ResourceType]
    val `AWS::ApiGatewayV2::DomainName` = "AWS::ApiGatewayV2::DomainName".asInstanceOf[ResourceType]
    val `AWS::ApiGatewayV2::Stage`      = "AWS::ApiGatewayV2::Stage".asInstanceOf[ResourceType]
    val `AWS::ApiGatewayV2::Api`        = "AWS::ApiGatewayV2::Api".asInstanceOf[ResourceType]
    val `AWS::CodePipeline::Pipeline`   = "AWS::CodePipeline::Pipeline".asInstanceOf[ResourceType]
    val `AWS::ServiceCatalog::CloudFormationProvisionedProduct` =
      "AWS::ServiceCatalog::CloudFormationProvisionedProduct".asInstanceOf[ResourceType]
    val `AWS::ServiceCatalog::CloudFormationProduct` =
      "AWS::ServiceCatalog::CloudFormationProduct".asInstanceOf[ResourceType]
    val `AWS::ServiceCatalog::Portfolio` = "AWS::ServiceCatalog::Portfolio".asInstanceOf[ResourceType]

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
  @Factory
  trait ResourceValue extends js.Object {
    var Value: ResourceValueType
  }

  @js.native
  sealed trait ResourceValueType extends js.Any
  object ResourceValueType extends js.Object {
    val RESOURCE_ID = "RESOURCE_ID".asInstanceOf[ResourceValueType]

    val values = js.Object.freeze(js.Array(RESOURCE_ID))
  }

  /**
    * An object with the name of the retention configuration and the retention period in days. The object stores the configuration for data retention in AWS Config.
    */
  @js.native
  @Factory
  trait RetentionConfiguration extends js.Object {
    var Name: RetentionConfigurationName
    var RetentionPeriodInDays: RetentionPeriodInDays
  }

  /**
    * Defines which resources trigger an evaluation for an AWS Config rule. The scope can include one or more resource types, a combination of a tag key and value, or a combination of one resource type and one resource ID. Specify a scope to constrain which resources trigger an evaluation for a rule. Otherwise, evaluations for the rule are triggered when any resource in your recording group changes in configuration.
    */
  @js.native
  @Factory
  trait Scope extends js.Object {
    var ComplianceResourceId: js.UndefOr[BaseResourceId]
    var ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes]
    var TagKey: js.UndefOr[StringWithCharLimit128]
    var TagValue: js.UndefOr[StringWithCharLimit256]
  }

  @js.native
  @Factory
  trait SelectResourceConfigRequest extends js.Object {
    var Expression: Expression
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SelectResourceConfigResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryInfo: js.UndefOr[QueryInfo]
    var Results: js.UndefOr[Results]
  }

  /**
    * Provides the AWS Config rule owner (AWS or customer), the rule identifier, and the events that trigger the evaluation of your AWS resources.
    */
  @js.native
  @Factory
  trait Source extends js.Object {
    var Owner: Owner
    var SourceIdentifier: StringWithCharLimit256
    var SourceDetails: js.UndefOr[SourceDetails]
  }

  /**
    * Provides the source and the message types that trigger AWS Config to evaluate your AWS resources against a rule. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic. You can specify the parameter values for <code>SourceDetail</code> only for custom rules.
    */
  @js.native
  @Factory
  trait SourceDetail extends js.Object {
    var EventSource: js.UndefOr[EventSource]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
    var MessageType: js.UndefOr[MessageType]
  }

  /**
    * AWS Systems Manager (SSM) specific remediation controls.
    */
  @js.native
  @Factory
  trait SsmControls extends js.Object {
    var ConcurrentExecutionRatePercentage: js.UndefOr[Percentage]
    var ErrorPercentage: js.UndefOr[Percentage]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartConfigRulesEvaluationRequest extends js.Object {
    var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames]
  }

  /**
    * The output when you start the evaluation for the specified AWS Config rule.
    */
  @js.native
  @Factory
  trait StartConfigRulesEvaluationResponse extends js.Object {}

  /**
    * The input for the <a>StartConfigurationRecorder</a> action.
    */
  @js.native
  @Factory
  trait StartConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  @js.native
  @Factory
  trait StartRemediationExecutionRequest extends js.Object {
    var ConfigRuleName: ConfigRuleName
    var ResourceKeys: ResourceKeys
  }

  @js.native
  @Factory
  trait StartRemediationExecutionResponse extends js.Object {
    var FailedItems: js.UndefOr[ResourceKeys]
    var FailureMessage: js.UndefOr[String]
  }

  /**
    * The static value of the resource.
    */
  @js.native
  @Factory
  trait StaticValue extends js.Object {
    var Values: StaticParameterValues
  }

  /**
    * Status filter object to filter results based on specific member account ID or status type for an organization config rule.
    */
  @js.native
  @Factory
  trait StatusDetailFilters extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var MemberAccountRuleStatus: js.UndefOr[MemberAccountRuleStatus]
  }

  /**
    * The input for the <a>StopConfigurationRecorder</a> action.
    */
  @js.native
  @Factory
  trait StopConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  /**
    * The tags for the resource. The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }
}
