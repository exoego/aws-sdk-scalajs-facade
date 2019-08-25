package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object configservice {
  type ARN                                     = String
  type AccountAggregationSourceAccountList     = js.Array[AccountId]
  type AccountAggregationSourceList            = js.Array[AccountAggregationSource]
  type AccountId                               = String
  type AggregateComplianceByConfigRuleList     = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList            = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList           = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList              = js.Array[AggregatedSourceStatus]
  type AggregatedSourceStatusType              = String
  type AggregatedSourceStatusTypeList          = js.Array[AggregatedSourceStatusType]
  type AggregatedSourceType                    = String
  type AggregationAuthorizationList            = js.Array[AggregationAuthorization]
  type AggregatorRegionList                    = js.Array[String]
  type AllSupported                            = Boolean
  type AmazonResourceName                      = String
  type AvailabilityZone                        = String
  type AwsRegion                               = String
  type BaseConfigurationItems                  = js.Array[BaseConfigurationItem]
  type BaseResourceId                          = String
  type ChannelName                             = String
  type ChronologicalOrder                      = String
  type ComplianceByConfigRules                 = js.Array[ComplianceByConfigRule]
  type ComplianceByResources                   = js.Array[ComplianceByResource]
  type ComplianceResourceTypes                 = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType       = js.Array[ComplianceSummaryByResourceType]
  type ComplianceType                          = String
  type ComplianceTypes                         = js.Array[ComplianceType]
  type ConfigRuleComplianceSummaryGroupKey     = String
  type ConfigRuleEvaluationStatusList          = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName                          = String
  type ConfigRuleNames                         = js.Array[StringWithCharLimit64]
  type ConfigRuleState                         = String
  type ConfigRules                             = js.Array[ConfigRule]
  type Configuration                           = String
  type ConfigurationAggregatorArn              = String
  type ConfigurationAggregatorList             = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName             = String
  type ConfigurationAggregatorNameList         = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime            = js.Date
  type ConfigurationItemList                   = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash                = String
  type ConfigurationItemStatus                 = String
  type ConfigurationRecorderList               = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList           = js.Array[RecorderName]
  type ConfigurationRecorderStatusList         = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId                    = String
  type Date                                    = js.Date
  type DeliveryChannelList                     = js.Array[DeliveryChannel]
  type DeliveryChannelNameList                 = js.Array[ChannelName]
  type DeliveryChannelStatusList               = js.Array[DeliveryChannelStatus]
  type DeliveryStatus                          = String
  type DescribePendingAggregationRequestsLimit = Int
  type DiscoveredResourceIdentifierList        = js.Array[AggregateResourceIdentifier]
  type EarlierTime                             = js.Date
  type EmptiableStringWithCharLimit256         = String
  type EvaluationResults                       = js.Array[EvaluationResult]
  type Evaluations                             = js.Array[Evaluation]
  type EventSource                             = String
  type Expression                              = String
  type FailedRemediationBatches                = js.Array[FailedRemediationBatch]
  type FieldInfoList                           = js.Array[FieldInfo]
  type FieldName                               = String
  type GroupByAPILimit                         = Int
  type GroupedResourceCountList                = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes              = Boolean
  type LaterTime                               = js.Date
  type Limit                                   = Int
  type MaximumExecutionFrequency               = String
  type MessageType                             = String
  type Name                                    = String
  type NextToken                               = String
  type OrderingTimestamp                       = js.Date
  type Owner                                   = String
  type PendingAggregationRequestList           = js.Array[PendingAggregationRequest]
  type RecorderName                            = String
  type RecorderStatus                          = String
  type ReevaluateConfigRuleNames               = js.Array[StringWithCharLimit64]
  type RelatedEvent                            = String
  type RelatedEventList                        = js.Array[RelatedEvent]
  type RelationshipList                        = js.Array[Relationship]
  type RelationshipName                        = String
  type RemediationConfigurations               = js.Array[RemediationConfiguration]
  type RemediationExecutionState               = String
  type RemediationExecutionStatuses            = js.Array[RemediationExecutionStatus]
  type RemediationExecutionStepState           = String
  type RemediationExecutionSteps               = js.Array[RemediationExecutionStep]
  type RemediationParameters                   = js.Dictionary[RemediationParameterValue]
  type RemediationTargetType                   = String
  type ResourceCountGroupKey                   = String
  type ResourceCounts                          = js.Array[ResourceCount]
  type ResourceCreationTime                    = js.Date
  type ResourceDeletionTime                    = js.Date
  type ResourceId                              = String
  type ResourceIdList                          = js.Array[ResourceId]
  type ResourceIdentifierList                  = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList                 = js.Array[AggregateResourceIdentifier]
  type ResourceKeys                            = js.Array[ResourceKey]
  type ResourceName                            = String
  type ResourceType                            = String
  type ResourceTypeList                        = js.Array[ResourceType]
  type ResourceTypes                           = js.Array[StringWithCharLimit256]
  type ResourceValueType                       = String
  type Results                                 = js.Array[String]
  type RetentionConfigurationList              = js.Array[RetentionConfiguration]
  type RetentionConfigurationName              = String
  type RetentionConfigurationNameList          = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays                   = Int
  type RuleLimit                               = Int
  type SourceDetails                           = js.Array[SourceDetail]
  type StaticParameterValues                   = js.Array[StringWithCharLimit256]
  type StringWithCharLimit1024                 = String
  type StringWithCharLimit128                  = String
  type StringWithCharLimit256                  = String
  type StringWithCharLimit64                   = String
  type SupplementaryConfiguration              = js.Dictionary[SupplementaryConfigurationValue]
  type SupplementaryConfigurationName          = String
  type SupplementaryConfigurationValue         = String
  type TagKey                                  = String
  type TagKeyList                              = js.Array[TagKey]
  type TagList                                 = js.Array[Tag]
  type TagValue                                = String
  type Tags                                    = js.Dictionary[Value]
  type UnprocessedResourceIdentifierList       = js.Array[AggregateResourceIdentifier]
  type Value                                   = String
  type Version                                 = String

  implicit final class ConfigServiceOps(val service: ConfigService) extends AnyVal {

    def batchGetAggregateResourceConfigFuture(
        params: BatchGetAggregateResourceConfigRequest
    ): Future[BatchGetAggregateResourceConfigResponse] =
      service.batchGetAggregateResourceConfig(params).promise.toFuture
    def batchGetResourceConfigFuture(params: BatchGetResourceConfigRequest): Future[BatchGetResourceConfigResponse] =
      service.batchGetResourceConfig(params).promise.toFuture
    def deleteAggregationAuthorizationFuture(params: DeleteAggregationAuthorizationRequest): Future[js.Object] =
      service.deleteAggregationAuthorization(params).promise.toFuture
    def deleteConfigRuleFuture(params: DeleteConfigRuleRequest): Future[js.Object] =
      service.deleteConfigRule(params).promise.toFuture
    def deleteConfigurationAggregatorFuture(params: DeleteConfigurationAggregatorRequest): Future[js.Object] =
      service.deleteConfigurationAggregator(params).promise.toFuture
    def deleteConfigurationRecorderFuture(params: DeleteConfigurationRecorderRequest): Future[js.Object] =
      service.deleteConfigurationRecorder(params).promise.toFuture
    def deleteDeliveryChannelFuture(params: DeleteDeliveryChannelRequest): Future[js.Object] =
      service.deleteDeliveryChannel(params).promise.toFuture
    def deleteEvaluationResultsFuture(params: DeleteEvaluationResultsRequest): Future[DeleteEvaluationResultsResponse] =
      service.deleteEvaluationResults(params).promise.toFuture
    def deletePendingAggregationRequestFuture(params: DeletePendingAggregationRequestRequest): Future[js.Object] =
      service.deletePendingAggregationRequest(params).promise.toFuture
    def deleteRemediationConfigurationFuture(
        params: DeleteRemediationConfigurationRequest
    ): Future[DeleteRemediationConfigurationResponse] = service.deleteRemediationConfiguration(params).promise.toFuture
    def deleteRetentionConfigurationFuture(params: DeleteRetentionConfigurationRequest): Future[js.Object] =
      service.deleteRetentionConfiguration(params).promise.toFuture
    def deliverConfigSnapshotFuture(params: DeliverConfigSnapshotRequest): Future[DeliverConfigSnapshotResponse] =
      service.deliverConfigSnapshot(params).promise.toFuture
    def describeAggregateComplianceByConfigRulesFuture(
        params: DescribeAggregateComplianceByConfigRulesRequest
    ): Future[DescribeAggregateComplianceByConfigRulesResponse] =
      service.describeAggregateComplianceByConfigRules(params).promise.toFuture
    def describeAggregationAuthorizationsFuture(
        params: DescribeAggregationAuthorizationsRequest
    ): Future[DescribeAggregationAuthorizationsResponse] =
      service.describeAggregationAuthorizations(params).promise.toFuture
    def describeComplianceByConfigRuleFuture(
        params: DescribeComplianceByConfigRuleRequest
    ): Future[DescribeComplianceByConfigRuleResponse] = service.describeComplianceByConfigRule(params).promise.toFuture
    def describeComplianceByResourceFuture(
        params: DescribeComplianceByResourceRequest
    ): Future[DescribeComplianceByResourceResponse] = service.describeComplianceByResource(params).promise.toFuture
    def describeConfigRuleEvaluationStatusFuture(
        params: DescribeConfigRuleEvaluationStatusRequest
    ): Future[DescribeConfigRuleEvaluationStatusResponse] =
      service.describeConfigRuleEvaluationStatus(params).promise.toFuture
    def describeConfigRulesFuture(params: DescribeConfigRulesRequest): Future[DescribeConfigRulesResponse] =
      service.describeConfigRules(params).promise.toFuture
    def describeConfigurationAggregatorSourcesStatusFuture(
        params: DescribeConfigurationAggregatorSourcesStatusRequest
    ): Future[DescribeConfigurationAggregatorSourcesStatusResponse] =
      service.describeConfigurationAggregatorSourcesStatus(params).promise.toFuture
    def describeConfigurationAggregatorsFuture(
        params: DescribeConfigurationAggregatorsRequest
    ): Future[DescribeConfigurationAggregatorsResponse] =
      service.describeConfigurationAggregators(params).promise.toFuture
    def describeConfigurationRecorderStatusFuture(
        params: DescribeConfigurationRecorderStatusRequest
    ): Future[DescribeConfigurationRecorderStatusResponse] =
      service.describeConfigurationRecorderStatus(params).promise.toFuture
    def describeConfigurationRecordersFuture(
        params: DescribeConfigurationRecordersRequest
    ): Future[DescribeConfigurationRecordersResponse] = service.describeConfigurationRecorders(params).promise.toFuture
    def describeDeliveryChannelStatusFuture(
        params: DescribeDeliveryChannelStatusRequest
    ): Future[DescribeDeliveryChannelStatusResponse] = service.describeDeliveryChannelStatus(params).promise.toFuture
    def describeDeliveryChannelsFuture(
        params: DescribeDeliveryChannelsRequest
    ): Future[DescribeDeliveryChannelsResponse] = service.describeDeliveryChannels(params).promise.toFuture
    def describePendingAggregationRequestsFuture(
        params: DescribePendingAggregationRequestsRequest
    ): Future[DescribePendingAggregationRequestsResponse] =
      service.describePendingAggregationRequests(params).promise.toFuture
    def describeRemediationConfigurationsFuture(
        params: DescribeRemediationConfigurationsRequest
    ): Future[DescribeRemediationConfigurationsResponse] =
      service.describeRemediationConfigurations(params).promise.toFuture
    def describeRemediationExecutionStatusFuture(
        params: DescribeRemediationExecutionStatusRequest
    ): Future[DescribeRemediationExecutionStatusResponse] =
      service.describeRemediationExecutionStatus(params).promise.toFuture
    def describeRetentionConfigurationsFuture(
        params: DescribeRetentionConfigurationsRequest
    ): Future[DescribeRetentionConfigurationsResponse] =
      service.describeRetentionConfigurations(params).promise.toFuture
    def getAggregateComplianceDetailsByConfigRuleFuture(
        params: GetAggregateComplianceDetailsByConfigRuleRequest
    ): Future[GetAggregateComplianceDetailsByConfigRuleResponse] =
      service.getAggregateComplianceDetailsByConfigRule(params).promise.toFuture
    def getAggregateConfigRuleComplianceSummaryFuture(
        params: GetAggregateConfigRuleComplianceSummaryRequest
    ): Future[GetAggregateConfigRuleComplianceSummaryResponse] =
      service.getAggregateConfigRuleComplianceSummary(params).promise.toFuture
    def getAggregateDiscoveredResourceCountsFuture(
        params: GetAggregateDiscoveredResourceCountsRequest
    ): Future[GetAggregateDiscoveredResourceCountsResponse] =
      service.getAggregateDiscoveredResourceCounts(params).promise.toFuture
    def getAggregateResourceConfigFuture(
        params: GetAggregateResourceConfigRequest
    ): Future[GetAggregateResourceConfigResponse] = service.getAggregateResourceConfig(params).promise.toFuture
    def getComplianceDetailsByConfigRuleFuture(
        params: GetComplianceDetailsByConfigRuleRequest
    ): Future[GetComplianceDetailsByConfigRuleResponse] =
      service.getComplianceDetailsByConfigRule(params).promise.toFuture
    def getComplianceDetailsByResourceFuture(
        params: GetComplianceDetailsByResourceRequest
    ): Future[GetComplianceDetailsByResourceResponse] = service.getComplianceDetailsByResource(params).promise.toFuture
    def getComplianceSummaryByConfigRuleFuture(): Future[GetComplianceSummaryByConfigRuleResponse] =
      service.getComplianceSummaryByConfigRule().promise.toFuture
    def getComplianceSummaryByResourceTypeFuture(
        params: GetComplianceSummaryByResourceTypeRequest
    ): Future[GetComplianceSummaryByResourceTypeResponse] =
      service.getComplianceSummaryByResourceType(params).promise.toFuture
    def getDiscoveredResourceCountsFuture(
        params: GetDiscoveredResourceCountsRequest
    ): Future[GetDiscoveredResourceCountsResponse] = service.getDiscoveredResourceCounts(params).promise.toFuture
    def getResourceConfigHistoryFuture(
        params: GetResourceConfigHistoryRequest
    ): Future[GetResourceConfigHistoryResponse] = service.getResourceConfigHistory(params).promise.toFuture
    def listAggregateDiscoveredResourcesFuture(
        params: ListAggregateDiscoveredResourcesRequest
    ): Future[ListAggregateDiscoveredResourcesResponse] =
      service.listAggregateDiscoveredResources(params).promise.toFuture
    def listDiscoveredResourcesFuture(params: ListDiscoveredResourcesRequest): Future[ListDiscoveredResourcesResponse] =
      service.listDiscoveredResources(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def putAggregationAuthorizationFuture(
        params: PutAggregationAuthorizationRequest
    ): Future[PutAggregationAuthorizationResponse] = service.putAggregationAuthorization(params).promise.toFuture
    def putConfigRuleFuture(params: PutConfigRuleRequest): Future[js.Object] =
      service.putConfigRule(params).promise.toFuture
    def putConfigurationAggregatorFuture(
        params: PutConfigurationAggregatorRequest
    ): Future[PutConfigurationAggregatorResponse] = service.putConfigurationAggregator(params).promise.toFuture
    def putConfigurationRecorderFuture(params: PutConfigurationRecorderRequest): Future[js.Object] =
      service.putConfigurationRecorder(params).promise.toFuture
    def putDeliveryChannelFuture(params: PutDeliveryChannelRequest): Future[js.Object] =
      service.putDeliveryChannel(params).promise.toFuture
    def putEvaluationsFuture(params: PutEvaluationsRequest): Future[PutEvaluationsResponse] =
      service.putEvaluations(params).promise.toFuture
    def putRemediationConfigurationsFuture(
        params: PutRemediationConfigurationsRequest
    ): Future[PutRemediationConfigurationsResponse] = service.putRemediationConfigurations(params).promise.toFuture
    def putRetentionConfigurationFuture(
        params: PutRetentionConfigurationRequest
    ): Future[PutRetentionConfigurationResponse] = service.putRetentionConfiguration(params).promise.toFuture
    def selectResourceConfigFuture(params: SelectResourceConfigRequest): Future[SelectResourceConfigResponse] =
      service.selectResourceConfig(params).promise.toFuture
    def startConfigRulesEvaluationFuture(
        params: StartConfigRulesEvaluationRequest
    ): Future[StartConfigRulesEvaluationResponse] = service.startConfigRulesEvaluation(params).promise.toFuture
    def startConfigurationRecorderFuture(params: StartConfigurationRecorderRequest): Future[js.Object] =
      service.startConfigurationRecorder(params).promise.toFuture
    def startRemediationExecutionFuture(
        params: StartRemediationExecutionRequest
    ): Future[StartRemediationExecutionResponse] = service.startRemediationExecution(params).promise.toFuture
    def stopConfigurationRecorderFuture(params: StopConfigurationRecorderRequest): Future[js.Object] =
      service.stopConfigurationRecorder(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
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
    def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): Request[js.Object] = js.native
    def deleteRemediationConfiguration(
        params: DeleteRemediationConfigurationRequest
    ): Request[DeleteRemediationConfigurationResponse]                                                      = js.native
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
    def describePendingAggregationRequests(
        params: DescribePendingAggregationRequestsRequest
    ): Request[DescribePendingAggregationRequestsResponse] = js.native
    def describeRemediationConfigurations(
        params: DescribeRemediationConfigurationsRequest
    ): Request[DescribeRemediationConfigurationsResponse] = js.native
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
    def putRemediationConfigurations(
        params: PutRemediationConfigurationsRequest
    ): Request[PutRemediationConfigurationsResponse] = js.native
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
    def apply(
        AccountIds: AccountAggregationSourceAccountList,
        AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
        AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
    ): AccountAggregationSource = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      AllAwsRegions.foreach(__v => __obj.update("AllAwsRegions", __v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.update("AwsRegions", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        Compliance: js.UndefOr[Compliance] = js.undefined,
        ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
    ): AggregateComplianceByConfigRule = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      Compliance.foreach(__v => __obj.update("Compliance", __v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.update("ConfigRuleName", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined,
        GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): AggregateComplianceCount = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceSummary.foreach(__v => __obj.update("ComplianceSummary", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
        EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
        ResultRecordedTime: js.UndefOr[Date] = js.undefined
    ): AggregateEvaluationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      Annotation.foreach(__v => __obj.update("Annotation", __v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      ConfigRuleInvokedTime.foreach(__v => __obj.update("ConfigRuleInvokedTime", __v.asInstanceOf[js.Any]))
      EvaluationResultIdentifier.foreach(__v => __obj.update("EvaluationResultIdentifier", __v.asInstanceOf[js.Any]))
      ResultRecordedTime.foreach(__v => __obj.update("ResultRecordedTime", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceId: ResourceId,
        ResourceType: ResourceType,
        SourceAccountId: AccountId,
        SourceRegion: AwsRegion,
        ResourceName: js.UndefOr[ResourceName] = js.undefined
    ): AggregateResourceIdentifier = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"      -> ResourceId.asInstanceOf[js.Any],
        "ResourceType"    -> ResourceType.asInstanceOf[js.Any],
        "SourceAccountId" -> SourceAccountId.asInstanceOf[js.Any],
        "SourceRegion"    -> SourceRegion.asInstanceOf[js.Any]
      )

      ResourceName.foreach(__v => __obj.update("ResourceName", __v.asInstanceOf[js.Any]))
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
    def apply(
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        LastErrorCode: js.UndefOr[String] = js.undefined,
        LastErrorMessage: js.UndefOr[String] = js.undefined,
        LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.undefined,
        LastUpdateTime: js.UndefOr[Date] = js.undefined,
        SourceId: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[AggregatedSourceType] = js.undefined
    ): AggregatedSourceStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      LastErrorCode.foreach(__v => __obj.update("LastErrorCode", __v.asInstanceOf[js.Any]))
      LastErrorMessage.foreach(__v => __obj.update("LastErrorMessage", __v.asInstanceOf[js.Any]))
      LastUpdateStatus.foreach(__v => __obj.update("LastUpdateStatus", __v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.update("LastUpdateTime", __v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.update("SourceId", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregatedSourceStatus]
    }
  }

  object AggregatedSourceStatusTypeEnum {
    val FAILED    = "FAILED"
    val SUCCEEDED = "SUCCEEDED"
    val OUTDATED  = "OUTDATED"

    val values = IndexedSeq(FAILED, SUCCEEDED, OUTDATED)
  }

  object AggregatedSourceTypeEnum {
    val ACCOUNT      = "ACCOUNT"
    val ORGANIZATION = "ORGANIZATION"

    val values = IndexedSeq(ACCOUNT, ORGANIZATION)
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
    def apply(
        AggregationAuthorizationArn: js.UndefOr[String] = js.undefined,
        AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined,
        AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined
    ): AggregationAuthorization = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregationAuthorizationArn.foreach(__v => __obj.update("AggregationAuthorizationArn", __v.asInstanceOf[js.Any]))
      AuthorizedAccountId.foreach(__v => __obj.update("AuthorizedAccountId", __v.asInstanceOf[js.Any]))
      AuthorizedAwsRegion.foreach(__v => __obj.update("AuthorizedAwsRegion", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      accountId.foreach(__v => __obj.update("accountId", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      availabilityZone.foreach(__v => __obj.update("availabilityZone", __v.asInstanceOf[js.Any]))
      awsRegion.foreach(__v => __obj.update("awsRegion", __v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      configurationItemCaptureTime.foreach(
        __v => __obj.update("configurationItemCaptureTime", __v.asInstanceOf[js.Any])
      )
      configurationItemStatus.foreach(__v => __obj.update("configurationItemStatus", __v.asInstanceOf[js.Any]))
      configurationStateId.foreach(__v => __obj.update("configurationStateId", __v.asInstanceOf[js.Any]))
      resourceCreationTime.foreach(__v => __obj.update("resourceCreationTime", __v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.update("resourceId", __v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.update("resourceName", __v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.update("resourceType", __v.asInstanceOf[js.Any]))
      supplementaryConfiguration.foreach(__v => __obj.update("supplementaryConfiguration", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaseConfigurationItem]
    }
  }

  @js.native
  trait BatchGetAggregateResourceConfigRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceIdentifiers: ResourceIdentifiersList
  }

  object BatchGetAggregateResourceConfigRequest {
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ResourceIdentifiers: ResourceIdentifiersList
    ): BatchGetAggregateResourceConfigRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        BaseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined,
        UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.undefined
    ): BatchGetAggregateResourceConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      BaseConfigurationItems.foreach(__v => __obj.update("BaseConfigurationItems", __v.asInstanceOf[js.Any]))
      UnprocessedResourceIdentifiers.foreach(
        __v => __obj.update("UnprocessedResourceIdentifiers", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
    }
  }

  @js.native
  trait BatchGetResourceConfigRequest extends js.Object {
    var resourceKeys: ResourceKeys
  }

  object BatchGetResourceConfigRequest {
    def apply(
        resourceKeys: ResourceKeys
    ): BatchGetResourceConfigRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined,
        unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
    ): BatchGetResourceConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      baseConfigurationItems.foreach(__v => __obj.update("baseConfigurationItems", __v.asInstanceOf[js.Any]))
      unprocessedResourceKeys.foreach(__v => __obj.update("unprocessedResourceKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetResourceConfigResponse]
    }
  }

  object ChronologicalOrderEnum {
    val Reverse = "Reverse"
    val Forward = "Forward"

    val values = IndexedSeq(Reverse, Forward)
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
    def apply(
        ComplianceContributorCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined
    ): Compliance = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceContributorCount.foreach(__v => __obj.update("ComplianceContributorCount", __v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
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
    def apply(
        Compliance: js.UndefOr[Compliance] = js.undefined,
        ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    ): ComplianceByConfigRule = {
      val __obj = js.Dictionary.empty[js.Any]
      Compliance.foreach(__v => __obj.update("Compliance", __v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.update("ConfigRuleName", __v.asInstanceOf[js.Any]))
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
    def apply(
        Compliance: js.UndefOr[Compliance] = js.undefined,
        ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): ComplianceByResource = {
      val __obj = js.Dictionary.empty[js.Any]
      Compliance.foreach(__v => __obj.update("Compliance", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
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
    def apply(
        CapExceeded: js.UndefOr[Boolean] = js.undefined,
        CappedCount: js.UndefOr[Int] = js.undefined
    ): ComplianceContributorCount = {
      val __obj = js.Dictionary.empty[js.Any]
      CapExceeded.foreach(__v => __obj.update("CapExceeded", __v.asInstanceOf[js.Any]))
      CappedCount.foreach(__v => __obj.update("CappedCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceSummaryTimestamp: js.UndefOr[Date] = js.undefined,
        CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
        NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined
    ): ComplianceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceSummaryTimestamp.foreach(__v => __obj.update("ComplianceSummaryTimestamp", __v.asInstanceOf[js.Any]))
      CompliantResourceCount.foreach(__v => __obj.update("CompliantResourceCount", __v.asInstanceOf[js.Any]))
      NonCompliantResourceCount.foreach(__v => __obj.update("NonCompliantResourceCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): ComplianceSummaryByResourceType = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceSummary.foreach(__v => __obj.update("ComplianceSummary", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceSummaryByResourceType]
    }
  }

  object ComplianceTypeEnum {
    val COMPLIANT         = "COMPLIANT"
    val NON_COMPLIANT     = "NON_COMPLIANT"
    val NOT_APPLICABLE    = "NOT_APPLICABLE"
    val INSUFFICIENT_DATA = "INSUFFICIENT_DATA"

    val values = IndexedSeq(COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA)
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
    def apply(
        lastAttemptTime: js.UndefOr[Date] = js.undefined,
        lastErrorCode: js.UndefOr[String] = js.undefined,
        lastErrorMessage: js.UndefOr[String] = js.undefined,
        lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        lastSuccessfulTime: js.UndefOr[Date] = js.undefined,
        nextDeliveryTime: js.UndefOr[Date] = js.undefined
    ): ConfigExportDeliveryInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      lastAttemptTime.foreach(__v => __obj.update("lastAttemptTime", __v.asInstanceOf[js.Any]))
      lastErrorCode.foreach(__v => __obj.update("lastErrorCode", __v.asInstanceOf[js.Any]))
      lastErrorMessage.foreach(__v => __obj.update("lastErrorMessage", __v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.update("lastStatus", __v.asInstanceOf[js.Any]))
      lastSuccessfulTime.foreach(__v => __obj.update("lastSuccessfulTime", __v.asInstanceOf[js.Any]))
      nextDeliveryTime.foreach(__v => __obj.update("nextDeliveryTime", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary[js.Any](
        "Source" -> Source.asInstanceOf[js.Any]
      )

      ConfigRuleArn.foreach(__v => __obj.update("ConfigRuleArn", __v.asInstanceOf[js.Any]))
      ConfigRuleId.foreach(__v => __obj.update("ConfigRuleId", __v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.update("ConfigRuleName", __v.asInstanceOf[js.Any]))
      ConfigRuleState.foreach(__v => __obj.update("ConfigRuleState", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      InputParameters.foreach(__v => __obj.update("InputParameters", __v.asInstanceOf[js.Any]))
      MaximumExecutionFrequency.foreach(__v => __obj.update("MaximumExecutionFrequency", __v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.update("Scope", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
    ): ConfigRuleComplianceFilters = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.update("ConfigRuleName", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined
    ): ConfigRuleComplianceSummaryFilters = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
    }
  }

  object ConfigRuleComplianceSummaryGroupKeyEnum {
    val ACCOUNT_ID = "ACCOUNT_ID"
    val AWS_REGION = "AWS_REGION"

    val values = IndexedSeq(ACCOUNT_ID, AWS_REGION)
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
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRuleArn.foreach(__v => __obj.update("ConfigRuleArn", __v.asInstanceOf[js.Any]))
      ConfigRuleId.foreach(__v => __obj.update("ConfigRuleId", __v.asInstanceOf[js.Any]))
      ConfigRuleName.foreach(__v => __obj.update("ConfigRuleName", __v.asInstanceOf[js.Any]))
      FirstActivatedTime.foreach(__v => __obj.update("FirstActivatedTime", __v.asInstanceOf[js.Any]))
      FirstEvaluationStarted.foreach(__v => __obj.update("FirstEvaluationStarted", __v.asInstanceOf[js.Any]))
      LastErrorCode.foreach(__v => __obj.update("LastErrorCode", __v.asInstanceOf[js.Any]))
      LastErrorMessage.foreach(__v => __obj.update("LastErrorMessage", __v.asInstanceOf[js.Any]))
      LastFailedEvaluationTime.foreach(__v => __obj.update("LastFailedEvaluationTime", __v.asInstanceOf[js.Any]))
      LastFailedInvocationTime.foreach(__v => __obj.update("LastFailedInvocationTime", __v.asInstanceOf[js.Any]))
      LastSuccessfulEvaluationTime.foreach(
        __v => __obj.update("LastSuccessfulEvaluationTime", __v.asInstanceOf[js.Any])
      )
      LastSuccessfulInvocationTime.foreach(
        __v => __obj.update("LastSuccessfulInvocationTime", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ConfigRuleEvaluationStatus]
    }
  }

  object ConfigRuleStateEnum {
    val ACTIVE           = "ACTIVE"
    val DELETING         = "DELETING"
    val DELETING_RESULTS = "DELETING_RESULTS"
    val EVALUATING       = "EVALUATING"

    val values = IndexedSeq(ACTIVE, DELETING, DELETING_RESULTS, EVALUATING)
  }

  /**
    * Provides options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket in your delivery channel.
    *
    * '''Note:'''If you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot, see the following:
    * The frequency for a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot is set by one of two values, depending on which is less frequent:
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
    def apply(
        deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
    ): ConfigSnapshotDeliveryProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      deliveryFrequency.foreach(__v => __obj.update("deliveryFrequency", __v.asInstanceOf[js.Any]))
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
    def apply(
        lastErrorCode: js.UndefOr[String] = js.undefined,
        lastErrorMessage: js.UndefOr[String] = js.undefined,
        lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        lastStatusChangeTime: js.UndefOr[Date] = js.undefined
    ): ConfigStreamDeliveryInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      lastErrorCode.foreach(__v => __obj.update("lastErrorCode", __v.asInstanceOf[js.Any]))
      lastErrorMessage.foreach(__v => __obj.update("lastErrorMessage", __v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.update("lastStatus", __v.asInstanceOf[js.Any]))
      lastStatusChangeTime.foreach(__v => __obj.update("lastStatusChangeTime", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined,
        ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn] = js.undefined,
        ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined
    ): ConfigurationAggregator = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountAggregationSources.foreach(__v => __obj.update("AccountAggregationSources", __v.asInstanceOf[js.Any]))
      ConfigurationAggregatorArn.foreach(__v => __obj.update("ConfigurationAggregatorArn", __v.asInstanceOf[js.Any]))
      ConfigurationAggregatorName.foreach(__v => __obj.update("ConfigurationAggregatorName", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.update("LastUpdatedTime", __v.asInstanceOf[js.Any]))
      OrganizationAggregationSource.foreach(
        __v => __obj.update("OrganizationAggregationSource", __v.asInstanceOf[js.Any])
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
      val __obj = js.Dictionary.empty[js.Any]
      accountId.foreach(__v => __obj.update("accountId", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      availabilityZone.foreach(__v => __obj.update("availabilityZone", __v.asInstanceOf[js.Any]))
      awsRegion.foreach(__v => __obj.update("awsRegion", __v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      configurationItemCaptureTime.foreach(
        __v => __obj.update("configurationItemCaptureTime", __v.asInstanceOf[js.Any])
      )
      configurationItemMD5Hash.foreach(__v => __obj.update("configurationItemMD5Hash", __v.asInstanceOf[js.Any]))
      configurationItemStatus.foreach(__v => __obj.update("configurationItemStatus", __v.asInstanceOf[js.Any]))
      configurationStateId.foreach(__v => __obj.update("configurationStateId", __v.asInstanceOf[js.Any]))
      relatedEvents.foreach(__v => __obj.update("relatedEvents", __v.asInstanceOf[js.Any]))
      relationships.foreach(__v => __obj.update("relationships", __v.asInstanceOf[js.Any]))
      resourceCreationTime.foreach(__v => __obj.update("resourceCreationTime", __v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.update("resourceId", __v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.update("resourceName", __v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.update("resourceType", __v.asInstanceOf[js.Any]))
      supplementaryConfiguration.foreach(__v => __obj.update("supplementaryConfiguration", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationItem]
    }
  }

  object ConfigurationItemStatusEnum {
    val OK                         = "OK"
    val ResourceDiscovered         = "ResourceDiscovered"
    val ResourceNotRecorded        = "ResourceNotRecorded"
    val ResourceDeleted            = "ResourceDeleted"
    val ResourceDeletedNotRecorded = "ResourceDeletedNotRecorded"

    val values = IndexedSeq(OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded)
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
    def apply(
        name: js.UndefOr[RecorderName] = js.undefined,
        recordingGroup: js.UndefOr[RecordingGroup] = js.undefined,
        roleARN: js.UndefOr[String] = js.undefined
    ): ConfigurationRecorder = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      recordingGroup.foreach(__v => __obj.update("recordingGroup", __v.asInstanceOf[js.Any]))
      roleARN.foreach(__v => __obj.update("roleARN", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      lastErrorCode.foreach(__v => __obj.update("lastErrorCode", __v.asInstanceOf[js.Any]))
      lastErrorMessage.foreach(__v => __obj.update("lastErrorMessage", __v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.update("lastStartTime", __v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.update("lastStatus", __v.asInstanceOf[js.Any]))
      lastStatusChangeTime.foreach(__v => __obj.update("lastStatusChangeTime", __v.asInstanceOf[js.Any]))
      lastStopTime.foreach(__v => __obj.update("lastStopTime", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      recording.foreach(__v => __obj.update("recording", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationRecorderStatus]
    }
  }

  @js.native
  trait DeleteAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: AccountId
    var AuthorizedAwsRegion: AwsRegion
  }

  object DeleteAggregationAuthorizationRequest {
    def apply(
        AuthorizedAccountId: AccountId,
        AuthorizedAwsRegion: AwsRegion
    ): DeleteAggregationAuthorizationRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConfigRuleName: StringWithCharLimit64
    ): DeleteConfigRuleRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName
    ): DeleteConfigurationAggregatorRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConfigurationRecorderName: RecorderName
    ): DeleteConfigurationRecorderRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        DeliveryChannelName: ChannelName
    ): DeleteDeliveryChannelRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConfigRuleName: StringWithCharLimit64
    ): DeleteEvaluationResultsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ): DeleteEvaluationResultsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteEvaluationResultsResponse]
    }
  }

  @js.native
  trait DeletePendingAggregationRequestRequest extends js.Object {
    var RequesterAccountId: AccountId
    var RequesterAwsRegion: AwsRegion
  }

  object DeletePendingAggregationRequestRequest {
    def apply(
        RequesterAccountId: AccountId,
        RequesterAwsRegion: AwsRegion
    ): DeletePendingAggregationRequestRequest = {
      val __obj = js.Dictionary[js.Any](
        "RequesterAccountId" -> RequesterAccountId.asInstanceOf[js.Any],
        "RequesterAwsRegion" -> RequesterAwsRegion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
    }
  }

  @js.native
  trait DeleteRemediationConfigurationRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var ResourceType: js.UndefOr[String]
  }

  object DeleteRemediationConfigurationRequest {
    def apply(
        ConfigRuleName: StringWithCharLimit64,
        ResourceType: js.UndefOr[String] = js.undefined
    ): DeleteRemediationConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRemediationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteRemediationConfigurationResponse extends js.Object {}

  object DeleteRemediationConfigurationResponse {
    def apply(
        ): DeleteRemediationConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteRemediationConfigurationResponse]
    }
  }

  @js.native
  trait DeleteRetentionConfigurationRequest extends js.Object {
    var RetentionConfigurationName: RetentionConfigurationName
  }

  object DeleteRetentionConfigurationRequest {
    def apply(
        RetentionConfigurationName: RetentionConfigurationName
    ): DeleteRetentionConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        deliveryChannelName: ChannelName
    ): DeliverConfigSnapshotRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        configSnapshotId: js.UndefOr[String] = js.undefined
    ): DeliverConfigSnapshotResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      configSnapshotId.foreach(__v => __obj.update("configSnapshotId", __v.asInstanceOf[js.Any]))
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
    def apply(
        configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        s3BucketName: js.UndefOr[String] = js.undefined,
        s3KeyPrefix: js.UndefOr[String] = js.undefined,
        snsTopicARN: js.UndefOr[String] = js.undefined
    ): DeliveryChannel = {
      val __obj = js.Dictionary.empty[js.Any]
      configSnapshotDeliveryProperties.foreach(
        __v => __obj.update("configSnapshotDeliveryProperties", __v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      s3BucketName.foreach(__v => __obj.update("s3BucketName", __v.asInstanceOf[js.Any]))
      s3KeyPrefix.foreach(__v => __obj.update("s3KeyPrefix", __v.asInstanceOf[js.Any]))
      snsTopicARN.foreach(__v => __obj.update("snsTopicARN", __v.asInstanceOf[js.Any]))
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
    def apply(
        configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
        configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
        configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): DeliveryChannelStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      configHistoryDeliveryInfo.foreach(__v => __obj.update("configHistoryDeliveryInfo", __v.asInstanceOf[js.Any]))
      configSnapshotDeliveryInfo.foreach(__v => __obj.update("configSnapshotDeliveryInfo", __v.asInstanceOf[js.Any]))
      configStreamDeliveryInfo.foreach(__v => __obj.update("configStreamDeliveryInfo", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryChannelStatus]
    }
  }

  object DeliveryStatusEnum {
    val Success        = "Success"
    val Failure        = "Failure"
    val Not_Applicable = "Not_Applicable"

    val values = IndexedSeq(Success, Failure, Not_Applicable)
  }

  @js.native
  trait DescribeAggregateComplianceByConfigRulesRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var Filters: js.UndefOr[ConfigRuleComplianceFilters]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAggregateComplianceByConfigRulesRequest {
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Filters: js.UndefOr[ConfigRuleComplianceFilters] = js.undefined,
        Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAggregateComplianceByConfigRulesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesRequest]
    }
  }

  @js.native
  trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
    var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAggregateComplianceByConfigRulesResponse {
    def apply(
        AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAggregateComplianceByConfigRulesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregateComplianceByConfigRules.foreach(
        __v => __obj.update("AggregateComplianceByConfigRules", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
    }
  }

  @js.native
  trait DescribeAggregationAuthorizationsRequest extends js.Object {
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAggregationAuthorizationsRequest {
    def apply(
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAggregationAuthorizationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAggregationAuthorizationsRequest]
    }
  }

  @js.native
  trait DescribeAggregationAuthorizationsResponse extends js.Object {
    var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAggregationAuthorizationsResponse {
    def apply(
        AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAggregationAuthorizationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregationAuthorizations.foreach(__v => __obj.update("AggregationAuthorizations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeComplianceByConfigRuleRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceTypes.foreach(__v => __obj.update("ComplianceTypes", __v.asInstanceOf[js.Any]))
      ConfigRuleNames.foreach(__v => __obj.update("ConfigRuleNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeComplianceByConfigRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceByConfigRules.foreach(__v => __obj.update("ComplianceByConfigRules", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): DescribeComplianceByResourceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceTypes.foreach(__v => __obj.update("ComplianceTypes", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceByResources: js.UndefOr[ComplianceByResources] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeComplianceByResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceByResources.foreach(__v => __obj.update("ComplianceByResources", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
        Limit: js.UndefOr[RuleLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRuleEvaluationStatusRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRuleNames.foreach(__v => __obj.update("ConfigRuleNames", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRuleEvaluationStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRulesEvaluationStatus.foreach(__v => __obj.update("ConfigRulesEvaluationStatus", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRulesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRuleNames.foreach(__v => __obj.update("ConfigRuleNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigRules: js.UndefOr[ConfigRules] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRulesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRules.foreach(__v => __obj.update("ConfigRules", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.undefined
    ): DescribeConfigurationAggregatorSourcesStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.update("UpdateStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusRequest]
    }
  }

  @js.native
  trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
    var AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigurationAggregatorSourcesStatusResponse {
    def apply(
        AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigurationAggregatorSourcesStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregatedSourceStatusList.foreach(__v => __obj.update("AggregatedSourceStatusList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigurationAggregatorsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationAggregatorNames.foreach(
        __v => __obj.update("ConfigurationAggregatorNames", __v.asInstanceOf[js.Any])
      )
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationAggregatorsRequest]
    }
  }

  @js.native
  trait DescribeConfigurationAggregatorsResponse extends js.Object {
    var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeConfigurationAggregatorsResponse {
    def apply(
        ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigurationAggregatorsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationAggregators.foreach(__v => __obj.update("ConfigurationAggregators", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecorderStatusRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationRecorderNames.foreach(__v => __obj.update("ConfigurationRecorderNames", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
    ): DescribeConfigurationRecorderStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationRecordersStatus.foreach(
        __v => __obj.update("ConfigurationRecordersStatus", __v.asInstanceOf[js.Any])
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
    def apply(
        ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecordersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationRecorderNames.foreach(__v => __obj.update("ConfigurationRecorderNames", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
    ): DescribeConfigurationRecordersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationRecorders.foreach(__v => __obj.update("ConfigurationRecorders", __v.asInstanceOf[js.Any]))
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
    def apply(
        DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelStatusRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryChannelNames.foreach(__v => __obj.update("DeliveryChannelNames", __v.asInstanceOf[js.Any]))
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
    def apply(
        DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
    ): DescribeDeliveryChannelStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryChannelsStatus.foreach(__v => __obj.update("DeliveryChannelsStatus", __v.asInstanceOf[js.Any]))
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
    def apply(
        DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryChannelNames.foreach(__v => __obj.update("DeliveryChannelNames", __v.asInstanceOf[js.Any]))
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
    def apply(
        DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
    ): DescribeDeliveryChannelsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryChannels.foreach(__v => __obj.update("DeliveryChannels", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
    }
  }

  @js.native
  trait DescribePendingAggregationRequestsRequest extends js.Object {
    var Limit: js.UndefOr[DescribePendingAggregationRequestsLimit]
    var NextToken: js.UndefOr[String]
  }

  object DescribePendingAggregationRequestsRequest {
    def apply(
        Limit: js.UndefOr[DescribePendingAggregationRequestsLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribePendingAggregationRequestsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingAggregationRequestsRequest]
    }
  }

  @js.native
  trait DescribePendingAggregationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList]
  }

  object DescribePendingAggregationRequestsResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.undefined
    ): DescribePendingAggregationRequestsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PendingAggregationRequests.foreach(__v => __obj.update("PendingAggregationRequests", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingAggregationRequestsResponse]
    }
  }

  @js.native
  trait DescribeRemediationConfigurationsRequest extends js.Object {
    var ConfigRuleNames: ConfigRuleNames
  }

  object DescribeRemediationConfigurationsRequest {
    def apply(
        ConfigRuleNames: ConfigRuleNames
    ): DescribeRemediationConfigurationsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        RemediationConfigurations: js.UndefOr[RemediationConfigurations] = js.undefined
    ): DescribeRemediationConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RemediationConfigurations.foreach(__v => __obj.update("RemediationConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeRemediationExecutionStatusRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[StringWithCharLimit256]
    var ResourceKeys: js.UndefOr[ResourceKeys]
  }

  object DescribeRemediationExecutionStatusRequest {
    def apply(
        ConfigRuleName: StringWithCharLimit64,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[StringWithCharLimit256] = js.undefined,
        ResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
    ): DescribeRemediationExecutionStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceKeys.foreach(__v => __obj.update("ResourceKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRemediationExecutionStatusRequest]
    }
  }

  @js.native
  trait DescribeRemediationExecutionStatusResponse extends js.Object {
    var NextToken: js.UndefOr[StringWithCharLimit256]
    var RemediationExecutionStatuses: js.UndefOr[RemediationExecutionStatuses]
  }

  object DescribeRemediationExecutionStatusResponse {
    def apply(
        NextToken: js.UndefOr[StringWithCharLimit256] = js.undefined,
        RemediationExecutionStatuses: js.UndefOr[RemediationExecutionStatuses] = js.undefined
    ): DescribeRemediationExecutionStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RemediationExecutionStatuses.foreach(
        __v => __obj.update("RemediationExecutionStatuses", __v.asInstanceOf[js.Any])
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined
    ): DescribeRetentionConfigurationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RetentionConfigurationNames.foreach(__v => __obj.update("RetentionConfigurationNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeRetentionConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RetentionConfigurations: js.UndefOr[RetentionConfigurationList]
  }

  object DescribeRetentionConfigurationsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined
    ): DescribeRetentionConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RetentionConfigurations.foreach(__v => __obj.update("RetentionConfigurations", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceResourceId: BaseResourceId,
        ComplianceResourceType: StringWithCharLimit256,
        ComplianceType: ComplianceType,
        OrderingTimestamp: OrderingTimestamp,
        Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): Evaluation = {
      val __obj = js.Dictionary[js.Any](
        "ComplianceResourceId"   -> ComplianceResourceId.asInstanceOf[js.Any],
        "ComplianceResourceType" -> ComplianceResourceType.asInstanceOf[js.Any],
        "ComplianceType"         -> ComplianceType.asInstanceOf[js.Any],
        "OrderingTimestamp"      -> OrderingTimestamp.asInstanceOf[js.Any]
      )

      Annotation.foreach(__v => __obj.update("Annotation", __v.asInstanceOf[js.Any]))
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
    def apply(
        Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
        EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
        ResultRecordedTime: js.UndefOr[Date] = js.undefined,
        ResultToken: js.UndefOr[String] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Annotation.foreach(__v => __obj.update("Annotation", __v.asInstanceOf[js.Any]))
      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      ConfigRuleInvokedTime.foreach(__v => __obj.update("ConfigRuleInvokedTime", __v.asInstanceOf[js.Any]))
      EvaluationResultIdentifier.foreach(__v => __obj.update("EvaluationResultIdentifier", __v.asInstanceOf[js.Any]))
      ResultRecordedTime.foreach(__v => __obj.update("ResultRecordedTime", __v.asInstanceOf[js.Any]))
      ResultToken.foreach(__v => __obj.update("ResultToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier] = js.undefined,
        OrderingTimestamp: js.UndefOr[Date] = js.undefined
    ): EvaluationResultIdentifier = {
      val __obj = js.Dictionary.empty[js.Any]
      EvaluationResultQualifier.foreach(__v => __obj.update("EvaluationResultQualifier", __v.asInstanceOf[js.Any]))
      OrderingTimestamp.foreach(__v => __obj.update("OrderingTimestamp", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
        ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): EvaluationResultQualifier = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRuleName.foreach(__v => __obj.update("ConfigRuleName", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResultQualifier]
    }
  }

  object EventSourceEnum {
    val `aws.config` = "aws.config"

    val values = IndexedSeq(`aws.config`)
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
    def apply(
        FailedItems: js.UndefOr[RemediationConfigurations] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): FailedRemediationBatch = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedItems.foreach(__v => __obj.update("FailedItems", __v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.update("FailureMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedRemediationBatch]
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
    def apply(
        Name: js.UndefOr[FieldName] = js.undefined
    ): FieldInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountId: AccountId,
        AwsRegion: AwsRegion,
        ConfigRuleName: ConfigRuleName,
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateComplianceDetailsByConfigRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountId"                   -> AccountId.asInstanceOf[js.Any],
        "AwsRegion"                   -> AwsRegion.asInstanceOf[js.Any],
        "ConfigRuleName"              -> ConfigRuleName.asInstanceOf[js.Any],
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      ComplianceType.foreach(__v => __obj.update("ComplianceType", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
    }
  }

  @js.native
  trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
    var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateComplianceDetailsByConfigRuleResponse {
    def apply(
        AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateComplianceDetailsByConfigRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregateEvaluationResults.foreach(__v => __obj.update("AggregateEvaluationResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters] = js.undefined,
        GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey] = js.undefined,
        Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateConfigRuleComplianceSummaryRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      GroupByKey.foreach(__v => __obj.update("GroupByKey", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.undefined,
        GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateConfigRuleComplianceSummaryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregateComplianceCounts.foreach(__v => __obj.update("AggregateComplianceCounts", __v.asInstanceOf[js.Any]))
      GroupByKey.foreach(__v => __obj.update("GroupByKey", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        Filters: js.UndefOr[ResourceCountFilters] = js.undefined,
        GroupByKey: js.UndefOr[ResourceCountGroupKey] = js.undefined,
        Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateDiscoveredResourceCountsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      GroupByKey.foreach(__v => __obj.update("GroupByKey", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        TotalDiscoveredResources: Double,
        GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined,
        GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAggregateDiscoveredResourceCountsResponse = {
      val __obj = js.Dictionary[js.Any](
        "TotalDiscoveredResources" -> TotalDiscoveredResources.asInstanceOf[js.Any]
      )

      GroupByKey.foreach(__v => __obj.update("GroupByKey", __v.asInstanceOf[js.Any]))
      GroupedResourceCounts.foreach(__v => __obj.update("GroupedResourceCounts", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
    }
  }

  @js.native
  trait GetAggregateResourceConfigRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var ResourceIdentifier: AggregateResourceIdentifier
  }

  object GetAggregateResourceConfigRequest {
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ResourceIdentifier: AggregateResourceIdentifier
    ): GetAggregateResourceConfigRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConfigurationItem: js.UndefOr[ConfigurationItem] = js.undefined
    ): GetAggregateResourceConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationItem.foreach(__v => __obj.update("ConfigurationItem", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigRuleName: StringWithCharLimit64,
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetComplianceDetailsByConfigRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]
      )

      ComplianceTypes.foreach(__v => __obj.update("ComplianceTypes", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetComplianceDetailsByConfigRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EvaluationResults.foreach(__v => __obj.update("EvaluationResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceId: BaseResourceId,
        ResourceType: StringWithCharLimit256,
        ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetComplianceDetailsByResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      ComplianceTypes.foreach(__v => __obj.update("ComplianceTypes", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetComplianceDetailsByResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EvaluationResults.foreach(__v => __obj.update("EvaluationResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
    ): GetComplianceSummaryByConfigRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceSummary.foreach(__v => __obj.update("ComplianceSummary", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    ): GetComplianceSummaryByResourceTypeRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceTypes.foreach(__v => __obj.update("ResourceTypes", __v.asInstanceOf[js.Any]))
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
    def apply(
        ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType] = js.undefined
    ): GetComplianceSummaryByResourceTypeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceSummariesByResourceType.foreach(
        __v => __obj.update("ComplianceSummariesByResourceType", __v.asInstanceOf[js.Any])
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
    def apply(
        limit: js.UndefOr[Limit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    ): GetDiscoveredResourceCountsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resourceTypes.foreach(__v => __obj.update("resourceTypes", __v.asInstanceOf[js.Any]))
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
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceCounts: js.UndefOr[ResourceCounts] = js.undefined,
        totalDiscoveredResources: js.UndefOr[Double] = js.undefined
    ): GetDiscoveredResourceCountsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resourceCounts.foreach(__v => __obj.update("resourceCounts", __v.asInstanceOf[js.Any]))
      totalDiscoveredResources.foreach(__v => __obj.update("totalDiscoveredResources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiscoveredResourceCountsResponse]
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
    def apply(
        resourceId: ResourceId,
        resourceType: ResourceType,
        chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined,
        earlierTime: js.UndefOr[EarlierTime] = js.undefined,
        laterTime: js.UndefOr[LaterTime] = js.undefined,
        limit: js.UndefOr[Limit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceConfigHistoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceId"   -> resourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      chronologicalOrder.foreach(__v => __obj.update("chronologicalOrder", __v.asInstanceOf[js.Any]))
      earlierTime.foreach(__v => __obj.update("earlierTime", __v.asInstanceOf[js.Any]))
      laterTime.foreach(__v => __obj.update("laterTime", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        configurationItems: js.UndefOr[ConfigurationItemList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceConfigHistoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      configurationItems.foreach(__v => __obj.update("configurationItems", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        GroupName: StringWithCharLimit256,
        ResourceCount: Double
    ): GroupedResourceCount = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        ResourceType: ResourceType,
        Filters: js.UndefOr[ResourceFilters] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAggregateDiscoveredResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceType"                -> ResourceType.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAggregateDiscoveredResourcesRequest]
    }
  }

  @js.native
  trait ListAggregateDiscoveredResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList]
  }

  object ListAggregateDiscoveredResourcesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.undefined
    ): ListAggregateDiscoveredResourcesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.update("ResourceIdentifiers", __v.asInstanceOf[js.Any]))
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
    def apply(
        resourceType: ResourceType,
        includeDeletedResources: js.UndefOr[Boolean] = js.undefined,
        limit: js.UndefOr[Limit] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIds: js.UndefOr[ResourceIdList] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined
    ): ListDiscoveredResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      includeDeletedResources.foreach(__v => __obj.update("includeDeletedResources", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.update("resourceIds", __v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.update("resourceName", __v.asInstanceOf[js.Any]))
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
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): ListDiscoveredResourcesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resourceIdentifiers.foreach(__v => __obj.update("resourceIdentifiers", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceArn: AmazonResourceName,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object MaximumExecutionFrequencyEnum {
    val One_Hour         = "One_Hour"
    val Three_Hours      = "Three_Hours"
    val Six_Hours        = "Six_Hours"
    val Twelve_Hours     = "Twelve_Hours"
    val TwentyFour_Hours = "TwentyFour_Hours"

    val values = IndexedSeq(One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours)
  }

  object MessageTypeEnum {
    val ConfigurationItemChangeNotification          = "ConfigurationItemChangeNotification"
    val ConfigurationSnapshotDeliveryCompleted       = "ConfigurationSnapshotDeliveryCompleted"
    val ScheduledNotification                        = "ScheduledNotification"
    val OversizedConfigurationItemChangeNotification = "OversizedConfigurationItemChangeNotification"

    val values = IndexedSeq(
      ConfigurationItemChangeNotification,
      ConfigurationSnapshotDeliveryCompleted,
      ScheduledNotification,
      OversizedConfigurationItemChangeNotification
    )
  }

  /**
    * This object contains regions to setup the aggregator and an IAM role to retrieve organization details.
    */
  @js.native
  trait OrganizationAggregationSource extends js.Object {
    var RoleArn: String
    var AllAwsRegions: js.UndefOr[Boolean]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
  }

  object OrganizationAggregationSource {
    def apply(
        RoleArn: String,
        AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
        AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
    ): OrganizationAggregationSource = {
      val __obj = js.Dictionary[js.Any](
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      AllAwsRegions.foreach(__v => __obj.update("AllAwsRegions", __v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.update("AwsRegions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationAggregationSource]
    }
  }

  object OwnerEnum {
    val CUSTOM_LAMBDA = "CUSTOM_LAMBDA"
    val AWS           = "AWS"

    val values = IndexedSeq(CUSTOM_LAMBDA, AWS)
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
    def apply(
        RequesterAccountId: js.UndefOr[AccountId] = js.undefined,
        RequesterAwsRegion: js.UndefOr[AwsRegion] = js.undefined
    ): PendingAggregationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RequesterAccountId.foreach(__v => __obj.update("RequesterAccountId", __v.asInstanceOf[js.Any]))
      RequesterAwsRegion.foreach(__v => __obj.update("RequesterAwsRegion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingAggregationRequest]
    }
  }

  @js.native
  trait PutAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: AccountId
    var AuthorizedAwsRegion: AwsRegion
  }

  object PutAggregationAuthorizationRequest {
    def apply(
        AuthorizedAccountId: AccountId,
        AuthorizedAwsRegion: AwsRegion
    ): PutAggregationAuthorizationRequest = {
      val __obj = js.Dictionary[js.Any](
        "AuthorizedAccountId" -> AuthorizedAccountId.asInstanceOf[js.Any],
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutAggregationAuthorizationRequest]
    }
  }

  @js.native
  trait PutAggregationAuthorizationResponse extends js.Object {
    var AggregationAuthorization: js.UndefOr[AggregationAuthorization]
  }

  object PutAggregationAuthorizationResponse {
    def apply(
        AggregationAuthorization: js.UndefOr[AggregationAuthorization] = js.undefined
    ): PutAggregationAuthorizationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AggregationAuthorization.foreach(__v => __obj.update("AggregationAuthorization", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAggregationAuthorizationResponse]
    }
  }

  @js.native
  trait PutConfigRuleRequest extends js.Object {
    var ConfigRule: ConfigRule
  }

  object PutConfigRuleRequest {
    def apply(
        ConfigRule: ConfigRule
    ): PutConfigRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigRule" -> ConfigRule.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutConfigRuleRequest]
    }
  }

  @js.native
  trait PutConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
  }

  object PutConfigurationAggregatorRequest {
    def apply(
        ConfigurationAggregatorName: ConfigurationAggregatorName,
        AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined,
        OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined
    ): PutConfigurationAggregatorRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]
      )

      AccountAggregationSources.foreach(__v => __obj.update("AccountAggregationSources", __v.asInstanceOf[js.Any]))
      OrganizationAggregationSource.foreach(
        __v => __obj.update("OrganizationAggregationSource", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutConfigurationAggregatorRequest]
    }
  }

  @js.native
  trait PutConfigurationAggregatorResponse extends js.Object {
    var ConfigurationAggregator: js.UndefOr[ConfigurationAggregator]
  }

  object PutConfigurationAggregatorResponse {
    def apply(
        ConfigurationAggregator: js.UndefOr[ConfigurationAggregator] = js.undefined
    ): PutConfigurationAggregatorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationAggregator.foreach(__v => __obj.update("ConfigurationAggregator", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConfigurationRecorder: ConfigurationRecorder
    ): PutConfigurationRecorderRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        DeliveryChannel: DeliveryChannel
    ): PutDeliveryChannelRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ResultToken: String,
        Evaluations: js.UndefOr[Evaluations] = js.undefined,
        TestMode: js.UndefOr[Boolean] = js.undefined
    ): PutEvaluationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResultToken" -> ResultToken.asInstanceOf[js.Any]
      )

      Evaluations.foreach(__v => __obj.update("Evaluations", __v.asInstanceOf[js.Any]))
      TestMode.foreach(__v => __obj.update("TestMode", __v.asInstanceOf[js.Any]))
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
    def apply(
        FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
    ): PutEvaluationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedEvaluations.foreach(__v => __obj.update("FailedEvaluations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEvaluationsResponse]
    }
  }

  @js.native
  trait PutRemediationConfigurationsRequest extends js.Object {
    var RemediationConfigurations: RemediationConfigurations
  }

  object PutRemediationConfigurationsRequest {
    def apply(
        RemediationConfigurations: RemediationConfigurations
    ): PutRemediationConfigurationsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        FailedBatches: js.UndefOr[FailedRemediationBatches] = js.undefined
    ): PutRemediationConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedBatches.foreach(__v => __obj.update("FailedBatches", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRemediationConfigurationsResponse]
    }
  }

  @js.native
  trait PutRetentionConfigurationRequest extends js.Object {
    var RetentionPeriodInDays: RetentionPeriodInDays
  }

  object PutRetentionConfigurationRequest {
    def apply(
        RetentionPeriodInDays: RetentionPeriodInDays
    ): PutRetentionConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        RetentionConfiguration: js.UndefOr[RetentionConfiguration] = js.undefined
    ): PutRetentionConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RetentionConfiguration.foreach(__v => __obj.update("RetentionConfiguration", __v.asInstanceOf[js.Any]))
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
    def apply(
        SelectFields: js.UndefOr[FieldInfoList] = js.undefined
    ): QueryInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      SelectFields.foreach(__v => __obj.update("SelectFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryInfo]
    }
  }

  object RecorderStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Pending, Success, Failure)
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
    def apply(
        allSupported: js.UndefOr[AllSupported] = js.undefined,
        includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.undefined,
        resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
    ): RecordingGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      allSupported.foreach(__v => __obj.update("allSupported", __v.asInstanceOf[js.Any]))
      includeGlobalResourceTypes.foreach(__v => __obj.update("includeGlobalResourceTypes", __v.asInstanceOf[js.Any]))
      resourceTypes.foreach(__v => __obj.update("resourceTypes", __v.asInstanceOf[js.Any]))
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
    def apply(
        relationshipName: js.UndefOr[RelationshipName] = js.undefined,
        resourceId: js.UndefOr[ResourceId] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): Relationship = {
      val __obj = js.Dictionary.empty[js.Any]
      relationshipName.foreach(__v => __obj.update("relationshipName", __v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.update("resourceId", __v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.update("resourceName", __v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.update("resourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relationship]
    }
  }

  /**
    * An object that represents the details about the remediation configuration that includes the remediation action, parameters, and data to execute the action.
    */
  @js.native
  trait RemediationConfiguration extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var TargetId: StringWithCharLimit256
    var TargetType: RemediationTargetType
    var Parameters: js.UndefOr[RemediationParameters]
    var ResourceType: js.UndefOr[String]
    var TargetVersion: js.UndefOr[String]
  }

  object RemediationConfiguration {
    def apply(
        ConfigRuleName: StringWithCharLimit64,
        TargetId: StringWithCharLimit256,
        TargetType: RemediationTargetType,
        Parameters: js.UndefOr[RemediationParameters] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined,
        TargetVersion: js.UndefOr[String] = js.undefined
    ): RemediationConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "TargetId"       -> TargetId.asInstanceOf[js.Any],
        "TargetType"     -> TargetType.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      TargetVersion.foreach(__v => __obj.update("TargetVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationConfiguration]
    }
  }

  object RemediationExecutionStateEnum {
    val QUEUED      = "QUEUED"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = IndexedSeq(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED)
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
    def apply(
        InvocationTime: js.UndefOr[Date] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        ResourceKey: js.UndefOr[ResourceKey] = js.undefined,
        State: js.UndefOr[RemediationExecutionState] = js.undefined,
        StepDetails: js.UndefOr[RemediationExecutionSteps] = js.undefined
    ): RemediationExecutionStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      InvocationTime.foreach(__v => __obj.update("InvocationTime", __v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.update("LastUpdatedTime", __v.asInstanceOf[js.Any]))
      ResourceKey.foreach(__v => __obj.update("ResourceKey", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StepDetails.foreach(__v => __obj.update("StepDetails", __v.asInstanceOf[js.Any]))
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
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[RemediationExecutionStepState] = js.undefined,
        StopTime: js.UndefOr[Date] = js.undefined
    ): RemediationExecutionStep = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StopTime.foreach(__v => __obj.update("StopTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationExecutionStep]
    }
  }

  object RemediationExecutionStepStateEnum {
    val SUCCEEDED = "SUCCEEDED"
    val PENDING   = "PENDING"
    val FAILED    = "FAILED"

    val values = IndexedSeq(SUCCEEDED, PENDING, FAILED)
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
    def apply(
        ResourceValue: js.UndefOr[ResourceValue] = js.undefined,
        StaticValue: js.UndefOr[StaticValue] = js.undefined
    ): RemediationParameterValue = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceValue.foreach(__v => __obj.update("ResourceValue", __v.asInstanceOf[js.Any]))
      StaticValue.foreach(__v => __obj.update("StaticValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationParameterValue]
    }
  }

  object RemediationTargetTypeEnum {
    val SSM_DOCUMENT = "SSM_DOCUMENT"

    val values = IndexedSeq(SSM_DOCUMENT)
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
    def apply(
        count: js.UndefOr[Double] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceCount = {
      val __obj = js.Dictionary.empty[js.Any]
      count.foreach(__v => __obj.update("count", __v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.update("resourceType", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Region: js.UndefOr[AwsRegion] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceCountFilters = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCountFilters]
    }
  }

  object ResourceCountGroupKeyEnum {
    val RESOURCE_TYPE = "RESOURCE_TYPE"
    val ACCOUNT_ID    = "ACCOUNT_ID"
    val AWS_REGION    = "AWS_REGION"

    val values = IndexedSeq(RESOURCE_TYPE, ACCOUNT_ID, AWS_REGION)
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
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Region: js.UndefOr[AwsRegion] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        ResourceName: js.UndefOr[ResourceName] = js.undefined
    ): ResourceFilters = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.update("ResourceName", __v.asInstanceOf[js.Any]))
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
    def apply(
        resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined,
        resourceId: js.UndefOr[ResourceId] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceIdentifier = {
      val __obj = js.Dictionary.empty[js.Any]
      resourceDeletionTime.foreach(__v => __obj.update("resourceDeletionTime", __v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.update("resourceId", __v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.update("resourceName", __v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.update("resourceType", __v.asInstanceOf[js.Any]))
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
    def apply(
        resourceId: ResourceId,
        resourceType: ResourceType
    ): ResourceKey = {
      val __obj = js.Dictionary[js.Any](
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
    val `AWS::IAM::Group`                           = "AWS::IAM::Group"
    val `AWS::IAM::Policy`                          = "AWS::IAM::Policy"
    val `AWS::IAM::Role`                            = "AWS::IAM::Role"
    val `AWS::IAM::User`                            = "AWS::IAM::User"
    val `AWS::ACM::Certificate`                     = "AWS::ACM::Certificate"
    val `AWS::RDS::DBInstance`                      = "AWS::RDS::DBInstance"
    val `AWS::RDS::DBSubnetGroup`                   = "AWS::RDS::DBSubnetGroup"
    val `AWS::RDS::DBSecurityGroup`                 = "AWS::RDS::DBSecurityGroup"
    val `AWS::RDS::DBSnapshot`                      = "AWS::RDS::DBSnapshot"
    val `AWS::RDS::EventSubscription`               = "AWS::RDS::EventSubscription"
    val `AWS::ElasticLoadBalancingV2::LoadBalancer` = "AWS::ElasticLoadBalancingV2::LoadBalancer"
    val `AWS::S3::Bucket`                           = "AWS::S3::Bucket"
    val `AWS::SSM::ManagedInstanceInventory`        = "AWS::SSM::ManagedInstanceInventory"
    val `AWS::Redshift::Cluster`                    = "AWS::Redshift::Cluster"
    val `AWS::Redshift::ClusterSnapshot`            = "AWS::Redshift::ClusterSnapshot"
    val `AWS::Redshift::ClusterParameterGroup`      = "AWS::Redshift::ClusterParameterGroup"
    val `AWS::Redshift::ClusterSecurityGroup`       = "AWS::Redshift::ClusterSecurityGroup"
    val `AWS::Redshift::ClusterSubnetGroup`         = "AWS::Redshift::ClusterSubnetGroup"
    val `AWS::Redshift::EventSubscription`          = "AWS::Redshift::EventSubscription"
    val `AWS::CloudWatch::Alarm`                    = "AWS::CloudWatch::Alarm"
    val `AWS::CloudFormation::Stack`                = "AWS::CloudFormation::Stack"
    val `AWS::DynamoDB::Table`                      = "AWS::DynamoDB::Table"
    val `AWS::AutoScaling::AutoScalingGroup`        = "AWS::AutoScaling::AutoScalingGroup"
    val `AWS::AutoScaling::LaunchConfiguration`     = "AWS::AutoScaling::LaunchConfiguration"
    val `AWS::AutoScaling::ScalingPolicy`           = "AWS::AutoScaling::ScalingPolicy"
    val `AWS::AutoScaling::ScheduledAction`         = "AWS::AutoScaling::ScheduledAction"
    val `AWS::CodeBuild::Project`                   = "AWS::CodeBuild::Project"
    val `AWS::WAF::RateBasedRule`                   = "AWS::WAF::RateBasedRule"
    val `AWS::WAF::Rule`                            = "AWS::WAF::Rule"
    val `AWS::WAF::WebACL`                          = "AWS::WAF::WebACL"
    val `AWS::WAFRegional::RateBasedRule`           = "AWS::WAFRegional::RateBasedRule"
    val `AWS::WAFRegional::Rule`                    = "AWS::WAFRegional::Rule"
    val `AWS::WAFRegional::WebACL`                  = "AWS::WAFRegional::WebACL"
    val `AWS::CloudFront::Distribution`             = "AWS::CloudFront::Distribution"
    val `AWS::CloudFront::StreamingDistribution`    = "AWS::CloudFront::StreamingDistribution"
    val `AWS::WAF::RuleGroup`                       = "AWS::WAF::RuleGroup"
    val `AWS::WAFRegional::RuleGroup`               = "AWS::WAFRegional::RuleGroup"
    val `AWS::Lambda::Function`                     = "AWS::Lambda::Function"
    val `AWS::ElasticBeanstalk::Application`        = "AWS::ElasticBeanstalk::Application"
    val `AWS::ElasticBeanstalk::ApplicationVersion` = "AWS::ElasticBeanstalk::ApplicationVersion"
    val `AWS::ElasticBeanstalk::Environment`        = "AWS::ElasticBeanstalk::Environment"
    val `AWS::ElasticLoadBalancing::LoadBalancer`   = "AWS::ElasticLoadBalancing::LoadBalancer"
    val `AWS::XRay::EncryptionConfig`               = "AWS::XRay::EncryptionConfig"
    val `AWS::SSM::AssociationCompliance`           = "AWS::SSM::AssociationCompliance"
    val `AWS::SSM::PatchCompliance`                 = "AWS::SSM::PatchCompliance"
    val `AWS::Shield::Protection`                   = "AWS::Shield::Protection"
    val `AWS::ShieldRegional::Protection`           = "AWS::ShieldRegional::Protection"
    val `AWS::Config::ResourceCompliance`           = "AWS::Config::ResourceCompliance"
    val `AWS::CodePipeline::Pipeline`               = "AWS::CodePipeline::Pipeline"

    val values = IndexedSeq(
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
      `AWS::IAM::Group`,
      `AWS::IAM::Policy`,
      `AWS::IAM::Role`,
      `AWS::IAM::User`,
      `AWS::ACM::Certificate`,
      `AWS::RDS::DBInstance`,
      `AWS::RDS::DBSubnetGroup`,
      `AWS::RDS::DBSecurityGroup`,
      `AWS::RDS::DBSnapshot`,
      `AWS::RDS::EventSubscription`,
      `AWS::ElasticLoadBalancingV2::LoadBalancer`,
      `AWS::S3::Bucket`,
      `AWS::SSM::ManagedInstanceInventory`,
      `AWS::Redshift::Cluster`,
      `AWS::Redshift::ClusterSnapshot`,
      `AWS::Redshift::ClusterParameterGroup`,
      `AWS::Redshift::ClusterSecurityGroup`,
      `AWS::Redshift::ClusterSubnetGroup`,
      `AWS::Redshift::EventSubscription`,
      `AWS::CloudWatch::Alarm`,
      `AWS::CloudFormation::Stack`,
      `AWS::DynamoDB::Table`,
      `AWS::AutoScaling::AutoScalingGroup`,
      `AWS::AutoScaling::LaunchConfiguration`,
      `AWS::AutoScaling::ScalingPolicy`,
      `AWS::AutoScaling::ScheduledAction`,
      `AWS::CodeBuild::Project`,
      `AWS::WAF::RateBasedRule`,
      `AWS::WAF::Rule`,
      `AWS::WAF::WebACL`,
      `AWS::WAFRegional::RateBasedRule`,
      `AWS::WAFRegional::Rule`,
      `AWS::WAFRegional::WebACL`,
      `AWS::CloudFront::Distribution`,
      `AWS::CloudFront::StreamingDistribution`,
      `AWS::WAF::RuleGroup`,
      `AWS::WAFRegional::RuleGroup`,
      `AWS::Lambda::Function`,
      `AWS::ElasticBeanstalk::Application`,
      `AWS::ElasticBeanstalk::ApplicationVersion`,
      `AWS::ElasticBeanstalk::Environment`,
      `AWS::ElasticLoadBalancing::LoadBalancer`,
      `AWS::XRay::EncryptionConfig`,
      `AWS::SSM::AssociationCompliance`,
      `AWS::SSM::PatchCompliance`,
      `AWS::Shield::Protection`,
      `AWS::ShieldRegional::Protection`,
      `AWS::Config::ResourceCompliance`,
      `AWS::CodePipeline::Pipeline`
    )
  }

  /**
    * The dynamic value of the resource.
    */
  @js.native
  trait ResourceValue extends js.Object {
    var Value: js.UndefOr[ResourceValueType]
  }

  object ResourceValue {
    def apply(
        Value: js.UndefOr[ResourceValueType] = js.undefined
    ): ResourceValue = {
      val __obj = js.Dictionary.empty[js.Any]
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceValue]
    }
  }

  object ResourceValueTypeEnum {
    val RESOURCE_ID = "RESOURCE_ID"

    val values = IndexedSeq(RESOURCE_ID)
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
    def apply(
        Name: RetentionConfigurationName,
        RetentionPeriodInDays: RetentionPeriodInDays
    ): RetentionConfiguration = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined,
        ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes] = js.undefined,
        TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined,
        TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): Scope = {
      val __obj = js.Dictionary.empty[js.Any]
      ComplianceResourceId.foreach(__v => __obj.update("ComplianceResourceId", __v.asInstanceOf[js.Any]))
      ComplianceResourceTypes.foreach(__v => __obj.update("ComplianceResourceTypes", __v.asInstanceOf[js.Any]))
      TagKey.foreach(__v => __obj.update("TagKey", __v.asInstanceOf[js.Any]))
      TagValue.foreach(__v => __obj.update("TagValue", __v.asInstanceOf[js.Any]))
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
    def apply(
        Expression: Expression,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SelectResourceConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryInfo: js.UndefOr[QueryInfo] = js.undefined,
        Results: js.UndefOr[Results] = js.undefined
    ): SelectResourceConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      QueryInfo.foreach(__v => __obj.update("QueryInfo", __v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.update("Results", __v.asInstanceOf[js.Any]))
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
    def apply(
        Owner: Owner,
        SourceIdentifier: StringWithCharLimit256,
        SourceDetails: js.UndefOr[SourceDetails] = js.undefined
    ): Source = {
      val __obj = js.Dictionary[js.Any](
        "Owner"            -> Owner.asInstanceOf[js.Any],
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any]
      )

      SourceDetails.foreach(__v => __obj.update("SourceDetails", __v.asInstanceOf[js.Any]))
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
    def apply(
        EventSource: js.UndefOr[EventSource] = js.undefined,
        MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined
    ): SourceDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSource.foreach(__v => __obj.update("EventSource", __v.asInstanceOf[js.Any]))
      MaximumExecutionFrequency.foreach(__v => __obj.update("MaximumExecutionFrequency", __v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.update("MessageType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceDetail]
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
    def apply(
        ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.undefined
    ): StartConfigRulesEvaluationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigRuleNames.foreach(__v => __obj.update("ConfigRuleNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartConfigRulesEvaluationRequest]
    }
  }

  /**
    * The output when you start the evaluation for the specified AWS Config rule.
    */
  @js.native
  trait StartConfigRulesEvaluationResponse extends js.Object {}

  object StartConfigRulesEvaluationResponse {
    def apply(
        ): StartConfigRulesEvaluationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ConfigurationRecorderName: RecorderName
    ): StartConfigurationRecorderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartConfigurationRecorderRequest]
    }
  }

  @js.native
  trait StartRemediationExecutionRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var ResourceKeys: ResourceKeys
  }

  object StartRemediationExecutionRequest {
    def apply(
        ConfigRuleName: StringWithCharLimit64,
        ResourceKeys: ResourceKeys
    ): StartRemediationExecutionRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        FailedItems: js.UndefOr[ResourceKeys] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): StartRemediationExecutionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedItems.foreach(__v => __obj.update("FailedItems", __v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.update("FailureMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRemediationExecutionResponse]
    }
  }

  /**
    * The static value of the resource.
    */
  @js.native
  trait StaticValue extends js.Object {
    var Values: js.UndefOr[StaticParameterValues]
  }

  object StaticValue {
    def apply(
        Values: js.UndefOr[StaticParameterValues] = js.undefined
    ): StaticValue = {
      val __obj = js.Dictionary.empty[js.Any]
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticValue]
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
    def apply(
        ConfigurationRecorderName: RecorderName
    ): StopConfigurationRecorderRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }
}
