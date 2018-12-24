package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object configservice {
  type ARN = String
  type AccountAggregationSourceAccountList = js.Array[AccountId]
  type AccountAggregationSourceList = js.Array[AccountAggregationSource]
  type AccountId = String
  type AggregateComplianceByConfigRuleList = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList = js.Array[AggregatedSourceStatus]
  type AggregatedSourceStatusType = String
  type AggregatedSourceStatusTypeList = js.Array[AggregatedSourceStatusType]
  type AggregatedSourceType = String
  type AggregationAuthorizationList = js.Array[AggregationAuthorization]
  type AggregatorRegionList = js.Array[String]
  type AllSupported = Boolean
  type AvailabilityZone = String
  type AwsRegion = String
  type BaseConfigurationItems = js.Array[BaseConfigurationItem]
  type BaseResourceId = String
  type ChannelName = String
  type ChronologicalOrder = String
  type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]
  type ComplianceByResources = js.Array[ComplianceByResource]
  type ComplianceResourceTypes = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]
  type ComplianceType = String
  type ComplianceTypes = js.Array[ComplianceType]
  type ConfigRuleComplianceSummaryGroupKey = String
  type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName = String
  type ConfigRuleNames = js.Array[StringWithCharLimit64]
  type ConfigRuleState = String
  type ConfigRules = js.Array[ConfigRule]
  type Configuration = String
  type ConfigurationAggregatorArn = String
  type ConfigurationAggregatorList = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName = String
  type ConfigurationAggregatorNameList = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime = js.Date
  type ConfigurationItemList = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash = String
  type ConfigurationItemStatus = String
  type ConfigurationRecorderList = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[RecorderName]
  type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId = String
  type Date = js.Date
  type DeliveryChannelList = js.Array[DeliveryChannel]
  type DeliveryChannelNameList = js.Array[ChannelName]
  type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]
  type DeliveryStatus = String
  type DescribePendingAggregationRequestsLimit = Int
  type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type EarlierTime = js.Date
  type EmptiableStringWithCharLimit256 = String
  type EvaluationResults = js.Array[EvaluationResult]
  type Evaluations = js.Array[Evaluation]
  type EventSource = String
  type GroupByAPILimit = Int
  type GroupedResourceCountList = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes = Boolean
  type LaterTime = js.Date
  type Limit = Int
  type MaximumExecutionFrequency = String
  type MessageType = String
  type Name = String
  type NextToken = String
  type OrderingTimestamp = js.Date
  type Owner = String
  type PendingAggregationRequestList = js.Array[PendingAggregationRequest]
  type RecorderName = String
  type RecorderStatus = String
  type ReevaluateConfigRuleNames = js.Array[StringWithCharLimit64]
  type RelatedEvent = String
  type RelatedEventList = js.Array[RelatedEvent]
  type RelationshipList = js.Array[Relationship]
  type RelationshipName = String
  type ResourceCountGroupKey = String
  type ResourceCounts = js.Array[ResourceCount]
  type ResourceCreationTime = js.Date
  type ResourceDeletionTime = js.Date
  type ResourceId = String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList = js.Array[AggregateResourceIdentifier]
  type ResourceKeys = js.Array[ResourceKey]
  type ResourceName = String
  type ResourceType = String
  type ResourceTypeList = js.Array[ResourceType]
  type ResourceTypes = js.Array[StringWithCharLimit256]
  type RetentionConfigurationList = js.Array[RetentionConfiguration]
  type RetentionConfigurationName = String
  type RetentionConfigurationNameList = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays = Int
  type RuleLimit = Int
  type SourceDetails = js.Array[SourceDetail]
  type StringWithCharLimit1024 = String
  type StringWithCharLimit128 = String
  type StringWithCharLimit256 = String
  type StringWithCharLimit64 = String
  type SupplementaryConfiguration = js.Dictionary[SupplementaryConfigurationValue]
  type SupplementaryConfigurationName = String
  type SupplementaryConfigurationValue = String
  type Tags = js.Dictionary[Value]
  type UnprocessedResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type Value = String
  type Version = String
}

package configservice {
  @js.native
  @JSImport("aws-sdk", "ConfigService")
  class ConfigService() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetAggregateResourceConfig(params: BatchGetAggregateResourceConfigRequest): Request[BatchGetAggregateResourceConfigResponse] = js.native
    def batchGetResourceConfig(params: BatchGetResourceConfigRequest): Request[BatchGetResourceConfigResponse] = js.native
    def deleteAggregationAuthorization(params: DeleteAggregationAuthorizationRequest): Request[js.Object] = js.native
    def deleteConfigRule(params: DeleteConfigRuleRequest): Request[js.Object] = js.native
    def deleteConfigurationAggregator(params: DeleteConfigurationAggregatorRequest): Request[js.Object] = js.native
    def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest): Request[js.Object] = js.native
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object] = js.native
    def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): Request[DeleteEvaluationResultsResponse] = js.native
    def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): Request[js.Object] = js.native
    def deleteRetentionConfiguration(params: DeleteRetentionConfigurationRequest): Request[js.Object] = js.native
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): Request[DeliverConfigSnapshotResponse] = js.native
    def describeAggregateComplianceByConfigRules(params: DescribeAggregateComplianceByConfigRulesRequest): Request[DescribeAggregateComplianceByConfigRulesResponse] = js.native
    def describeAggregationAuthorizations(params: DescribeAggregationAuthorizationsRequest): Request[DescribeAggregationAuthorizationsResponse] = js.native
    def describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest): Request[DescribeComplianceByConfigRuleResponse] = js.native
    def describeComplianceByResource(params: DescribeComplianceByResourceRequest): Request[DescribeComplianceByResourceResponse] = js.native
    def describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest): Request[DescribeConfigRuleEvaluationStatusResponse] = js.native
    def describeConfigRules(params: DescribeConfigRulesRequest): Request[DescribeConfigRulesResponse] = js.native
    def describeConfigurationAggregatorSourcesStatus(params: DescribeConfigurationAggregatorSourcesStatusRequest): Request[DescribeConfigurationAggregatorSourcesStatusResponse] = js.native
    def describeConfigurationAggregators(params: DescribeConfigurationAggregatorsRequest): Request[DescribeConfigurationAggregatorsResponse] = js.native
    def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest): Request[DescribeConfigurationRecorderStatusResponse] = js.native
    def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest): Request[DescribeConfigurationRecordersResponse] = js.native
    def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest): Request[DescribeDeliveryChannelStatusResponse] = js.native
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): Request[DescribeDeliveryChannelsResponse] = js.native
    def describePendingAggregationRequests(params: DescribePendingAggregationRequestsRequest): Request[DescribePendingAggregationRequestsResponse] = js.native
    def describeRetentionConfigurations(params: DescribeRetentionConfigurationsRequest): Request[DescribeRetentionConfigurationsResponse] = js.native
    def getAggregateComplianceDetailsByConfigRule(params: GetAggregateComplianceDetailsByConfigRuleRequest): Request[GetAggregateComplianceDetailsByConfigRuleResponse] = js.native
    def getAggregateConfigRuleComplianceSummary(params: GetAggregateConfigRuleComplianceSummaryRequest): Request[GetAggregateConfigRuleComplianceSummaryResponse] = js.native
    def getAggregateDiscoveredResourceCounts(params: GetAggregateDiscoveredResourceCountsRequest): Request[GetAggregateDiscoveredResourceCountsResponse] = js.native
    def getAggregateResourceConfig(params: GetAggregateResourceConfigRequest): Request[GetAggregateResourceConfigResponse] = js.native
    def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest): Request[GetComplianceDetailsByConfigRuleResponse] = js.native
    def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest): Request[GetComplianceDetailsByResourceResponse] = js.native
    def getComplianceSummaryByConfigRule(): Request[GetComplianceSummaryByConfigRuleResponse] = js.native
    def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest): Request[GetComplianceSummaryByResourceTypeResponse] = js.native
    def getDiscoveredResourceCounts(params: GetDiscoveredResourceCountsRequest): Request[GetDiscoveredResourceCountsResponse] = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse] = js.native
    def listAggregateDiscoveredResources(params: ListAggregateDiscoveredResourcesRequest): Request[ListAggregateDiscoveredResourcesResponse] = js.native
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResponse] = js.native
    def putAggregationAuthorization(params: PutAggregationAuthorizationRequest): Request[PutAggregationAuthorizationResponse] = js.native
    def putConfigRule(params: PutConfigRuleRequest): Request[js.Object] = js.native
    def putConfigurationAggregator(params: PutConfigurationAggregatorRequest): Request[PutConfigurationAggregatorResponse] = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object] = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object] = js.native
    def putEvaluations(params: PutEvaluationsRequest): Request[PutEvaluationsResponse] = js.native
    def putRetentionConfiguration(params: PutRetentionConfigurationRequest): Request[PutRetentionConfigurationResponse] = js.native
    def startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest): Request[StartConfigRulesEvaluationResponse] = js.native
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest): Request[js.Object] = js.native
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): Request[js.Object] = js.native
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
      AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined): AccountAggregationSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "AllAwsRegions" -> AllAwsRegions.map { x => x.asInstanceOf[js.Any] },
        "AwsRegions" -> AwsRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAggregationSource]
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
      ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined): AggregateComplianceByConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateComplianceByConfigRule]
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
      GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined): AggregateComplianceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceSummary" -> ComplianceSummary.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateComplianceCount]
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
      ResultRecordedTime: js.UndefOr[Date] = js.undefined): AggregateEvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Annotation" -> Annotation.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleInvokedTime" -> ConfigRuleInvokedTime.map { x => x.asInstanceOf[js.Any] },
        "EvaluationResultIdentifier" -> EvaluationResultIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ResultRecordedTime" -> ResultRecordedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateEvaluationResult]
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
      ResourceName: js.UndefOr[ResourceName] = js.undefined): AggregateResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "SourceAccountId" -> SourceAccountId.asInstanceOf[js.Any],
        "SourceRegion" -> SourceRegion.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateResourceIdentifier]
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
      SourceType: js.UndefOr[AggregatedSourceType] = js.undefined): AggregatedSourceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "LastErrorCode" -> LastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "LastErrorMessage" -> LastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateStatus" -> LastUpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTime" -> LastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "SourceId" -> SourceId.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregatedSourceStatus]
    }
  }

  object AggregatedSourceStatusTypeEnum {
    val FAILED = "FAILED"
    val SUCCEEDED = "SUCCEEDED"
    val OUTDATED = "OUTDATED"

    val values = IndexedSeq(FAILED, SUCCEEDED, OUTDATED)
  }

  object AggregatedSourceTypeEnum {
    val ACCOUNT = "ACCOUNT"
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
      CreationTime: js.UndefOr[Date] = js.undefined): AggregationAuthorization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregationAuthorizationArn" -> AggregationAuthorizationArn.map { x => x.asInstanceOf[js.Any] },
        "AuthorizedAccountId" -> AuthorizedAccountId.map { x => x.asInstanceOf[js.Any] },
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregationAuthorization]
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
      version: js.UndefOr[Version] = js.undefined): BaseConfigurationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "configurationItemCaptureTime" -> configurationItemCaptureTime.map { x => x.asInstanceOf[js.Any] },
        "configurationItemStatus" -> configurationItemStatus.map { x => x.asInstanceOf[js.Any] },
        "configurationStateId" -> configurationStateId.map { x => x.asInstanceOf[js.Any] },
        "resourceCreationTime" -> resourceCreationTime.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "supplementaryConfiguration" -> supplementaryConfiguration.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BaseConfigurationItem]
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
      ResourceIdentifiers: ResourceIdentifiersList): BatchGetAggregateResourceConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceIdentifiers" -> ResourceIdentifiers.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetAggregateResourceConfigRequest]
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
      UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.undefined): BatchGetAggregateResourceConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaseConfigurationItems" -> BaseConfigurationItems.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedResourceIdentifiers" -> UnprocessedResourceIdentifiers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetAggregateResourceConfigResponse]
    }
  }

  @js.native
  trait BatchGetResourceConfigRequest extends js.Object {
    var resourceKeys: ResourceKeys
  }

  object BatchGetResourceConfigRequest {
    def apply(
      resourceKeys: ResourceKeys): BatchGetResourceConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceKeys" -> resourceKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetResourceConfigRequest]
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
      unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.undefined): BatchGetResourceConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "baseConfigurationItems" -> baseConfigurationItems.map { x => x.asInstanceOf[js.Any] },
        "unprocessedResourceKeys" -> unprocessedResourceKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetResourceConfigResponse]
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
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined): Compliance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceContributorCount" -> ComplianceContributorCount.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Compliance]
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
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined): ComplianceByConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceByConfigRule]
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
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined): ComplianceByResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceByResource]
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
      CappedCount: js.UndefOr[Int] = js.undefined): ComplianceContributorCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapExceeded" -> CapExceeded.map { x => x.asInstanceOf[js.Any] },
        "CappedCount" -> CappedCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceContributorCount]
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
      NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined): ComplianceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceSummaryTimestamp" -> ComplianceSummaryTimestamp.map { x => x.asInstanceOf[js.Any] },
        "CompliantResourceCount" -> CompliantResourceCount.map { x => x.asInstanceOf[js.Any] },
        "NonCompliantResourceCount" -> NonCompliantResourceCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceSummary]
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
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined): ComplianceSummaryByResourceType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceSummary" -> ComplianceSummary.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceSummaryByResourceType]
    }
  }

  object ComplianceTypeEnum {
    val COMPLIANT = "COMPLIANT"
    val NON_COMPLIANT = "NON_COMPLIANT"
    val NOT_APPLICABLE = "NOT_APPLICABLE"
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
      nextDeliveryTime: js.UndefOr[Date] = js.undefined): ConfigExportDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastAttemptTime" -> lastAttemptTime.map { x => x.asInstanceOf[js.Any] },
        "lastErrorCode" -> lastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "lastErrorMessage" -> lastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "lastSuccessfulTime" -> lastSuccessfulTime.map { x => x.asInstanceOf[js.Any] },
        "nextDeliveryTime" -> nextDeliveryTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigExportDeliveryInfo]
    }
  }

  /**
   * An AWS Config rule represents an AWS Lambda function that you create for a custom rule or a predefined function for an AWS managed rule. The function evaluates configuration items to assess whether your AWS resources comply with your desired configurations. This function can run when AWS Config detects a configuration change to an AWS resource and at a periodic frequency that you choose (for example, every 24 hours).
   *
   * '''Note:'''You can use the AWS CLI and AWS SDKs if you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot. For more information, see <a>ConfigSnapshotDeliveryProperties</a>.
   * For more information about developing and using AWS Config rules, see [[http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html|Evaluating AWS Resource Configurations with AWS Config]] in the <i>AWS Config Developer Guide</i>.
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
      Scope: js.UndefOr[Scope] = js.undefined): ConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Source" -> Source.asInstanceOf[js.Any],
        "ConfigRuleArn" -> ConfigRuleArn.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleId" -> ConfigRuleId.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleState" -> ConfigRuleState.map { x => x.asInstanceOf[js.Any] },
        "CreatedBy" -> CreatedBy.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InputParameters" -> InputParameters.map { x => x.asInstanceOf[js.Any] },
        "MaximumExecutionFrequency" -> MaximumExecutionFrequency.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRule]
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
      ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined): ConfigRuleComplianceFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRuleComplianceFilters]
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
      AwsRegion: js.UndefOr[AwsRegion] = js.undefined): ConfigRuleComplianceSummaryFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRuleComplianceSummaryFilters]
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
      LastSuccessfulInvocationTime: js.UndefOr[Date] = js.undefined): ConfigRuleEvaluationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleArn" -> ConfigRuleArn.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleId" -> ConfigRuleId.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "FirstActivatedTime" -> FirstActivatedTime.map { x => x.asInstanceOf[js.Any] },
        "FirstEvaluationStarted" -> FirstEvaluationStarted.map { x => x.asInstanceOf[js.Any] },
        "LastErrorCode" -> LastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "LastErrorMessage" -> LastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "LastFailedEvaluationTime" -> LastFailedEvaluationTime.map { x => x.asInstanceOf[js.Any] },
        "LastFailedInvocationTime" -> LastFailedInvocationTime.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulEvaluationTime" -> LastSuccessfulEvaluationTime.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulInvocationTime" -> LastSuccessfulInvocationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRuleEvaluationStatus]
    }
  }

  object ConfigRuleStateEnum {
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"
    val DELETING_RESULTS = "DELETING_RESULTS"
    val EVALUATING = "EVALUATING"

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
      deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined): ConfigSnapshotDeliveryProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deliveryFrequency" -> deliveryFrequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigSnapshotDeliveryProperties]
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
      lastStatusChangeTime: js.UndefOr[Date] = js.undefined): ConfigStreamDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastErrorCode" -> lastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "lastErrorMessage" -> lastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "lastStatusChangeTime" -> lastStatusChangeTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigStreamDeliveryInfo]
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
      OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined): ConfigurationAggregator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountAggregationSources" -> AccountAggregationSources.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationAggregatorArn" -> ConfigurationAggregatorArn.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "OrganizationAggregationSource" -> OrganizationAggregationSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationAggregator]
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
      version: js.UndefOr[Version] = js.undefined): ConfigurationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "configurationItemCaptureTime" -> configurationItemCaptureTime.map { x => x.asInstanceOf[js.Any] },
        "configurationItemMD5Hash" -> configurationItemMD5Hash.map { x => x.asInstanceOf[js.Any] },
        "configurationItemStatus" -> configurationItemStatus.map { x => x.asInstanceOf[js.Any] },
        "configurationStateId" -> configurationStateId.map { x => x.asInstanceOf[js.Any] },
        "relatedEvents" -> relatedEvents.map { x => x.asInstanceOf[js.Any] },
        "relationships" -> relationships.map { x => x.asInstanceOf[js.Any] },
        "resourceCreationTime" -> resourceCreationTime.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "supplementaryConfiguration" -> supplementaryConfiguration.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationItem]
    }
  }

  object ConfigurationItemStatusEnum {
    val OK = "OK"
    val ResourceDiscovered = "ResourceDiscovered"
    val ResourceNotRecorded = "ResourceNotRecorded"
    val ResourceDeleted = "ResourceDeleted"
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
      roleARN: js.UndefOr[String] = js.undefined): ConfigurationRecorder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "recordingGroup" -> recordingGroup.map { x => x.asInstanceOf[js.Any] },
        "roleARN" -> roleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorder]
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
      recording: js.UndefOr[Boolean] = js.undefined): ConfigurationRecorderStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastErrorCode" -> lastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "lastErrorMessage" -> lastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "lastStartTime" -> lastStartTime.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "lastStatusChangeTime" -> lastStatusChangeTime.map { x => x.asInstanceOf[js.Any] },
        "lastStopTime" -> lastStopTime.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "recording" -> recording.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorderStatus]
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
      AuthorizedAwsRegion: AwsRegion): DeleteAggregationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizedAccountId" -> AuthorizedAccountId.asInstanceOf[js.Any],
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAggregationAuthorizationRequest]
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
      ConfigRuleName: StringWithCharLimit64): DeleteConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigRuleRequest]
    }
  }

  @js.native
  trait DeleteConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: ConfigurationAggregatorName
  }

  object DeleteConfigurationAggregatorRequest {
    def apply(
      ConfigurationAggregatorName: ConfigurationAggregatorName): DeleteConfigurationAggregatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationAggregatorRequest]
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
      ConfigurationRecorderName: RecorderName): DeleteConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationRecorderRequest]
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
      DeliveryChannelName: ChannelName): DeleteDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannelName" -> DeliveryChannelName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeliveryChannelRequest]
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
      ConfigRuleName: StringWithCharLimit64): DeleteEvaluationResultsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationResultsRequest]
    }
  }

  /**
   * The output when you delete the evaluation results for the specified AWS Config rule.
   */
  @js.native
  trait DeleteEvaluationResultsResponse extends js.Object {

  }

  object DeleteEvaluationResultsResponse {
    def apply(): DeleteEvaluationResultsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationResultsResponse]
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
      RequesterAwsRegion: AwsRegion): DeletePendingAggregationRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterAccountId" -> RequesterAccountId.asInstanceOf[js.Any],
        "RequesterAwsRegion" -> RequesterAwsRegion.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePendingAggregationRequestRequest]
    }
  }

  @js.native
  trait DeleteRetentionConfigurationRequest extends js.Object {
    var RetentionConfigurationName: RetentionConfigurationName
  }

  object DeleteRetentionConfigurationRequest {
    def apply(
      RetentionConfigurationName: RetentionConfigurationName): DeleteRetentionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionConfigurationName" -> RetentionConfigurationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRetentionConfigurationRequest]
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
      deliveryChannelName: ChannelName): DeliverConfigSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deliveryChannelName" -> deliveryChannelName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotRequest]
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
      configSnapshotId: js.UndefOr[String] = js.undefined): DeliverConfigSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configSnapshotId" -> configSnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotResponse]
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
      snsTopicARN: js.UndefOr[String] = js.undefined): DeliveryChannel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configSnapshotDeliveryProperties" -> configSnapshotDeliveryProperties.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "s3BucketName" -> s3BucketName.map { x => x.asInstanceOf[js.Any] },
        "s3KeyPrefix" -> s3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "snsTopicARN" -> snsTopicARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannel]
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
      name: js.UndefOr[String] = js.undefined): DeliveryChannelStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configHistoryDeliveryInfo" -> configHistoryDeliveryInfo.map { x => x.asInstanceOf[js.Any] },
        "configSnapshotDeliveryInfo" -> configSnapshotDeliveryInfo.map { x => x.asInstanceOf[js.Any] },
        "configStreamDeliveryInfo" -> configStreamDeliveryInfo.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannelStatus]
    }
  }

  object DeliveryStatusEnum {
    val Success = "Success"
    val Failure = "Failure"
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
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAggregateComplianceByConfigRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAggregateComplianceByConfigRulesRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAggregateComplianceByConfigRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregateComplianceByConfigRules" -> AggregateComplianceByConfigRules.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeAggregationAuthorizationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAggregationAuthorizationsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeAggregationAuthorizationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregationAuthorizations" -> AggregationAuthorizations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAggregationAuthorizationsResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeComplianceByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceTypes" -> ComplianceTypes.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleNames" -> ConfigRuleNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByConfigRuleRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeComplianceByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceByConfigRules" -> ComplianceByConfigRules.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByConfigRuleResponse]
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
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined): DescribeComplianceByResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceTypes" -> ComplianceTypes.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByResourceRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeComplianceByResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceByResources" -> ComplianceByResources.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByResourceResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigRuleEvaluationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleNames" -> ConfigRuleNames.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRuleEvaluationStatusRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigRuleEvaluationStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRulesEvaluationStatus" -> ConfigRulesEvaluationStatus.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleNames" -> ConfigRuleNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRulesRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRules" -> ConfigRules.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRulesResponse]
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
      UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.undefined): DescribeConfigurationAggregatorSourcesStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "UpdateStatus" -> UpdateStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationAggregatorSourcesStatusRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigurationAggregatorSourcesStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregatedSourceStatusList" -> AggregatedSourceStatusList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigurationAggregatorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorNames" -> ConfigurationAggregatorNames.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationAggregatorsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribeConfigurationAggregatorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregators" -> ConfigurationAggregators.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationAggregatorsResponse]
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
      ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined): DescribeConfigurationRecorderStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderNames" -> ConfigurationRecorderNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecorderStatusRequest]
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
      ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined): DescribeConfigurationRecorderStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecordersStatus" -> ConfigurationRecordersStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecorderStatusResponse]
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
      ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined): DescribeConfigurationRecordersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderNames" -> ConfigurationRecorderNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecordersRequest]
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
      ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined): DescribeConfigurationRecordersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorders" -> ConfigurationRecorders.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecordersResponse]
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
      DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined): DescribeDeliveryChannelStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannelNames" -> DeliveryChannelNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelStatusRequest]
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
      DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined): DescribeDeliveryChannelStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannelsStatus" -> DeliveryChannelsStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelStatusResponse]
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
      DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined): DescribeDeliveryChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannelNames" -> DeliveryChannelNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelsRequest]
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
      DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined): DescribeDeliveryChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannels" -> DeliveryChannels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelsResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): DescribePendingAggregationRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePendingAggregationRequestsRequest]
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
      PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.undefined): DescribePendingAggregationRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PendingAggregationRequests" -> PendingAggregationRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePendingAggregationRequestsResponse]
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
      RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined): DescribeRetentionConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "RetentionConfigurationNames" -> RetentionConfigurationNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRetentionConfigurationsRequest]
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
      RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined): DescribeRetentionConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "RetentionConfigurations" -> RetentionConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRetentionConfigurationsResponse]
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
      Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined): Evaluation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceResourceId" -> ComplianceResourceId.asInstanceOf[js.Any],
        "ComplianceResourceType" -> ComplianceResourceType.asInstanceOf[js.Any],
        "ComplianceType" -> ComplianceType.asInstanceOf[js.Any],
        "OrderingTimestamp" -> OrderingTimestamp.asInstanceOf[js.Any],
        "Annotation" -> Annotation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Evaluation]
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
      ResultToken: js.UndefOr[String] = js.undefined): EvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Annotation" -> Annotation.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleInvokedTime" -> ConfigRuleInvokedTime.map { x => x.asInstanceOf[js.Any] },
        "EvaluationResultIdentifier" -> EvaluationResultIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ResultRecordedTime" -> ResultRecordedTime.map { x => x.asInstanceOf[js.Any] },
        "ResultToken" -> ResultToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResult]
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
      OrderingTimestamp: js.UndefOr[Date] = js.undefined): EvaluationResultIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationResultQualifier" -> EvaluationResultQualifier.map { x => x.asInstanceOf[js.Any] },
        "OrderingTimestamp" -> OrderingTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResultIdentifier]
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
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined): EvaluationResultQualifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResultQualifier]
    }
  }

  object EventSourceEnum {
    val `aws.config` = "aws.config"

    val values = IndexedSeq(`aws.config`)
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateComplianceDetailsByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "AwsRegion" -> AwsRegion.asInstanceOf[js.Any],
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateComplianceDetailsByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregateEvaluationResults" -> AggregateEvaluationResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateConfigRuleComplianceSummaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "GroupByKey" -> GroupByKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateConfigRuleComplianceSummaryRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateConfigRuleComplianceSummaryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregateComplianceCounts" -> AggregateComplianceCounts.map { x => x.asInstanceOf[js.Any] },
        "GroupByKey" -> GroupByKey.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateConfigRuleComplianceSummaryResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateDiscoveredResourceCountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "GroupByKey" -> GroupByKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateDiscoveredResourceCountsRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateDiscoveredResourceCountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalDiscoveredResources" -> TotalDiscoveredResources.asInstanceOf[js.Any],
        "GroupByKey" -> GroupByKey.map { x => x.asInstanceOf[js.Any] },
        "GroupedResourceCounts" -> GroupedResourceCounts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
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
      ResourceIdentifier: AggregateResourceIdentifier): GetAggregateResourceConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateResourceConfigRequest]
    }
  }

  @js.native
  trait GetAggregateResourceConfigResponse extends js.Object {
    var ConfigurationItem: js.UndefOr[ConfigurationItem]
  }

  object GetAggregateResourceConfigResponse {
    def apply(
      ConfigurationItem: js.UndefOr[ConfigurationItem] = js.undefined): GetAggregateResourceConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationItem" -> ConfigurationItem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateResourceConfigResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetComplianceDetailsByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.asInstanceOf[js.Any],
        "ComplianceTypes" -> ComplianceTypes.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): GetComplianceDetailsByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationResults" -> EvaluationResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): GetComplianceDetailsByResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "ComplianceTypes" -> ComplianceTypes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByResourceRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): GetComplianceDetailsByResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationResults" -> EvaluationResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByResourceResponse]
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
      ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined): GetComplianceSummaryByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceSummary" -> ComplianceSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
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
      ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined): GetComplianceSummaryByResourceTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
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
      ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType] = js.undefined): GetComplianceSummaryByResourceTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceSummariesByResourceType" -> ComplianceSummariesByResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceSummaryByResourceTypeResponse]
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
      resourceTypes: js.UndefOr[ResourceTypes] = js.undefined): GetDiscoveredResourceCountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceTypes" -> resourceTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoveredResourceCountsRequest]
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
      totalDiscoveredResources: js.UndefOr[Double] = js.undefined): GetDiscoveredResourceCountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceCounts" -> resourceCounts.map { x => x.asInstanceOf[js.Any] },
        "totalDiscoveredResources" -> totalDiscoveredResources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoveredResourceCountsResponse]
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
      nextToken: js.UndefOr[NextToken] = js.undefined): GetResourceConfigHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "chronologicalOrder" -> chronologicalOrder.map { x => x.asInstanceOf[js.Any] },
        "earlierTime" -> earlierTime.map { x => x.asInstanceOf[js.Any] },
        "laterTime" -> laterTime.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryRequest]
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
      nextToken: js.UndefOr[NextToken] = js.undefined): GetResourceConfigHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationItems" -> configurationItems.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryResponse]
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
      ResourceCount: Double): GroupedResourceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "ResourceCount" -> ResourceCount.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupedResourceCount]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAggregateDiscoveredResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAggregateDiscoveredResourcesRequest]
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
      ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.undefined): ListAggregateDiscoveredResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceIdentifiers" -> ResourceIdentifiers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAggregateDiscoveredResourcesResponse]
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
      resourceName: js.UndefOr[ResourceName] = js.undefined): ListDiscoveredResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "includeDeletedResources" -> includeDeletedResources.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceIds" -> resourceIds.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesRequest]
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
      resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined): ListDiscoveredResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceIdentifiers" -> resourceIdentifiers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesResponse]
    }
  }

  object MaximumExecutionFrequencyEnum {
    val One_Hour = "One_Hour"
    val Three_Hours = "Three_Hours"
    val Six_Hours = "Six_Hours"
    val Twelve_Hours = "Twelve_Hours"
    val TwentyFour_Hours = "TwentyFour_Hours"

    val values = IndexedSeq(One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours)
  }

  object MessageTypeEnum {
    val ConfigurationItemChangeNotification = "ConfigurationItemChangeNotification"
    val ConfigurationSnapshotDeliveryCompleted = "ConfigurationSnapshotDeliveryCompleted"
    val ScheduledNotification = "ScheduledNotification"
    val OversizedConfigurationItemChangeNotification = "OversizedConfigurationItemChangeNotification"

    val values = IndexedSeq(ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted, ScheduledNotification, OversizedConfigurationItemChangeNotification)
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
      AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined): OrganizationAggregationSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "AllAwsRegions" -> AllAwsRegions.map { x => x.asInstanceOf[js.Any] },
        "AwsRegions" -> AwsRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationAggregationSource]
    }
  }

  object OwnerEnum {
    val CUSTOM_LAMBDA = "CUSTOM_LAMBDA"
    val AWS = "AWS"

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
      RequesterAwsRegion: js.UndefOr[AwsRegion] = js.undefined): PendingAggregationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterAccountId" -> RequesterAccountId.map { x => x.asInstanceOf[js.Any] },
        "RequesterAwsRegion" -> RequesterAwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingAggregationRequest]
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
      AuthorizedAwsRegion: AwsRegion): PutAggregationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizedAccountId" -> AuthorizedAccountId.asInstanceOf[js.Any],
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAggregationAuthorizationRequest]
    }
  }

  @js.native
  trait PutAggregationAuthorizationResponse extends js.Object {
    var AggregationAuthorization: js.UndefOr[AggregationAuthorization]
  }

  object PutAggregationAuthorizationResponse {
    def apply(
      AggregationAuthorization: js.UndefOr[AggregationAuthorization] = js.undefined): PutAggregationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AggregationAuthorization" -> AggregationAuthorization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAggregationAuthorizationResponse]
    }
  }

  @js.native
  trait PutConfigRuleRequest extends js.Object {
    var ConfigRule: ConfigRule
  }

  object PutConfigRuleRequest {
    def apply(
      ConfigRule: ConfigRule): PutConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRule" -> ConfigRule.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigRuleRequest]
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
      OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined): PutConfigurationAggregatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.asInstanceOf[js.Any],
        "AccountAggregationSources" -> AccountAggregationSources.map { x => x.asInstanceOf[js.Any] },
        "OrganizationAggregationSource" -> OrganizationAggregationSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationAggregatorRequest]
    }
  }

  @js.native
  trait PutConfigurationAggregatorResponse extends js.Object {
    var ConfigurationAggregator: js.UndefOr[ConfigurationAggregator]
  }

  object PutConfigurationAggregatorResponse {
    def apply(
      ConfigurationAggregator: js.UndefOr[ConfigurationAggregator] = js.undefined): PutConfigurationAggregatorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregator" -> ConfigurationAggregator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationAggregatorResponse]
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
      ConfigurationRecorder: ConfigurationRecorder): PutConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorder" -> ConfigurationRecorder.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationRecorderRequest]
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
      DeliveryChannel: DeliveryChannel): PutDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannel" -> DeliveryChannel.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDeliveryChannelRequest]
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
      TestMode: js.UndefOr[Boolean] = js.undefined): PutEvaluationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultToken" -> ResultToken.asInstanceOf[js.Any],
        "Evaluations" -> Evaluations.map { x => x.asInstanceOf[js.Any] },
        "TestMode" -> TestMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEvaluationsRequest]
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
      FailedEvaluations: js.UndefOr[Evaluations] = js.undefined): PutEvaluationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedEvaluations" -> FailedEvaluations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEvaluationsResponse]
    }
  }

  @js.native
  trait PutRetentionConfigurationRequest extends js.Object {
    var RetentionPeriodInDays: RetentionPeriodInDays
  }

  object PutRetentionConfigurationRequest {
    def apply(
      RetentionPeriodInDays: RetentionPeriodInDays): PutRetentionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionPeriodInDays" -> RetentionPeriodInDays.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRetentionConfigurationRequest]
    }
  }

  @js.native
  trait PutRetentionConfigurationResponse extends js.Object {
    var RetentionConfiguration: js.UndefOr[RetentionConfiguration]
  }

  object PutRetentionConfigurationResponse {
    def apply(
      RetentionConfiguration: js.UndefOr[RetentionConfiguration] = js.undefined): PutRetentionConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionConfiguration" -> RetentionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRetentionConfigurationResponse]
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
   *  For a list of supported resource types, see [[http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources|Supported Resource Types]].
   *  For more information, see [[http://docs.aws.amazon.com/config/latest/developerguide/select-resources.html|Selecting Which Resources AWS Config Records]].
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
      resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined): RecordingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allSupported" -> allSupported.map { x => x.asInstanceOf[js.Any] },
        "includeGlobalResourceTypes" -> includeGlobalResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "resourceTypes" -> resourceTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordingGroup]
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
      resourceType: js.UndefOr[ResourceType] = js.undefined): Relationship = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationshipName" -> relationshipName.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Relationship]
    }
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
      resourceType: js.UndefOr[ResourceType] = js.undefined): ResourceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceCount]
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
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ResourceCountFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceCountFilters]
    }
  }

  object ResourceCountGroupKeyEnum {
    val RESOURCE_TYPE = "RESOURCE_TYPE"
    val ACCOUNT_ID = "ACCOUNT_ID"
    val AWS_REGION = "AWS_REGION"

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
      ResourceName: js.UndefOr[ResourceName] = js.undefined): ResourceFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceFilters]
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
      resourceType: js.UndefOr[ResourceType] = js.undefined): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceDeletionTime" -> resourceDeletionTime.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
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
      resourceType: ResourceType): ResourceKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceKey]
    }
  }

  object ResourceTypeEnum {
    val `AWS::EC2::CustomerGateway` = "AWS::EC2::CustomerGateway"
    val `AWS::EC2::EIP` = "AWS::EC2::EIP"
    val `AWS::EC2::Host` = "AWS::EC2::Host"
    val `AWS::EC2::Instance` = "AWS::EC2::Instance"
    val `AWS::EC2::InternetGateway` = "AWS::EC2::InternetGateway"
    val `AWS::EC2::NetworkAcl` = "AWS::EC2::NetworkAcl"
    val `AWS::EC2::NetworkInterface` = "AWS::EC2::NetworkInterface"
    val `AWS::EC2::RouteTable` = "AWS::EC2::RouteTable"
    val `AWS::EC2::SecurityGroup` = "AWS::EC2::SecurityGroup"
    val `AWS::EC2::Subnet` = "AWS::EC2::Subnet"
    val `AWS::CloudTrail::Trail` = "AWS::CloudTrail::Trail"
    val `AWS::EC2::Volume` = "AWS::EC2::Volume"
    val `AWS::EC2::VPC` = "AWS::EC2::VPC"
    val `AWS::EC2::VPNConnection` = "AWS::EC2::VPNConnection"
    val `AWS::EC2::VPNGateway` = "AWS::EC2::VPNGateway"
    val `AWS::IAM::Group` = "AWS::IAM::Group"
    val `AWS::IAM::Policy` = "AWS::IAM::Policy"
    val `AWS::IAM::Role` = "AWS::IAM::Role"
    val `AWS::IAM::User` = "AWS::IAM::User"
    val `AWS::ACM::Certificate` = "AWS::ACM::Certificate"
    val `AWS::RDS::DBInstance` = "AWS::RDS::DBInstance"
    val `AWS::RDS::DBSubnetGroup` = "AWS::RDS::DBSubnetGroup"
    val `AWS::RDS::DBSecurityGroup` = "AWS::RDS::DBSecurityGroup"
    val `AWS::RDS::DBSnapshot` = "AWS::RDS::DBSnapshot"
    val `AWS::RDS::EventSubscription` = "AWS::RDS::EventSubscription"
    val `AWS::ElasticLoadBalancingV2::LoadBalancer` = "AWS::ElasticLoadBalancingV2::LoadBalancer"
    val `AWS::S3::Bucket` = "AWS::S3::Bucket"
    val `AWS::SSM::ManagedInstanceInventory` = "AWS::SSM::ManagedInstanceInventory"
    val `AWS::Redshift::Cluster` = "AWS::Redshift::Cluster"
    val `AWS::Redshift::ClusterSnapshot` = "AWS::Redshift::ClusterSnapshot"
    val `AWS::Redshift::ClusterParameterGroup` = "AWS::Redshift::ClusterParameterGroup"
    val `AWS::Redshift::ClusterSecurityGroup` = "AWS::Redshift::ClusterSecurityGroup"
    val `AWS::Redshift::ClusterSubnetGroup` = "AWS::Redshift::ClusterSubnetGroup"
    val `AWS::Redshift::EventSubscription` = "AWS::Redshift::EventSubscription"
    val `AWS::CloudWatch::Alarm` = "AWS::CloudWatch::Alarm"
    val `AWS::CloudFormation::Stack` = "AWS::CloudFormation::Stack"
    val `AWS::DynamoDB::Table` = "AWS::DynamoDB::Table"
    val `AWS::AutoScaling::AutoScalingGroup` = "AWS::AutoScaling::AutoScalingGroup"
    val `AWS::AutoScaling::LaunchConfiguration` = "AWS::AutoScaling::LaunchConfiguration"
    val `AWS::AutoScaling::ScalingPolicy` = "AWS::AutoScaling::ScalingPolicy"
    val `AWS::AutoScaling::ScheduledAction` = "AWS::AutoScaling::ScheduledAction"
    val `AWS::CodeBuild::Project` = "AWS::CodeBuild::Project"
    val `AWS::WAF::RateBasedRule` = "AWS::WAF::RateBasedRule"
    val `AWS::WAF::Rule` = "AWS::WAF::Rule"
    val `AWS::WAF::WebACL` = "AWS::WAF::WebACL"
    val `AWS::WAFRegional::RateBasedRule` = "AWS::WAFRegional::RateBasedRule"
    val `AWS::WAFRegional::Rule` = "AWS::WAFRegional::Rule"
    val `AWS::WAFRegional::WebACL` = "AWS::WAFRegional::WebACL"
    val `AWS::CloudFront::Distribution` = "AWS::CloudFront::Distribution"
    val `AWS::CloudFront::StreamingDistribution` = "AWS::CloudFront::StreamingDistribution"
    val `AWS::WAF::RuleGroup` = "AWS::WAF::RuleGroup"
    val `AWS::WAFRegional::RuleGroup` = "AWS::WAFRegional::RuleGroup"
    val `AWS::Lambda::Function` = "AWS::Lambda::Function"
    val `AWS::ElasticBeanstalk::Application` = "AWS::ElasticBeanstalk::Application"
    val `AWS::ElasticBeanstalk::ApplicationVersion` = "AWS::ElasticBeanstalk::ApplicationVersion"
    val `AWS::ElasticBeanstalk::Environment` = "AWS::ElasticBeanstalk::Environment"
    val `AWS::ElasticLoadBalancing::LoadBalancer` = "AWS::ElasticLoadBalancing::LoadBalancer"
    val `AWS::XRay::EncryptionConfig` = "AWS::XRay::EncryptionConfig"
    val `AWS::SSM::AssociationCompliance` = "AWS::SSM::AssociationCompliance"
    val `AWS::SSM::PatchCompliance` = "AWS::SSM::PatchCompliance"
    val `AWS::Shield::Protection` = "AWS::Shield::Protection"
    val `AWS::ShieldRegional::Protection` = "AWS::ShieldRegional::Protection"
    val `AWS::Config::ResourceCompliance` = "AWS::Config::ResourceCompliance"
    val `AWS::CodePipeline::Pipeline` = "AWS::CodePipeline::Pipeline"

    val values = IndexedSeq(`AWS::EC2::CustomerGateway`, `AWS::EC2::EIP`, `AWS::EC2::Host`, `AWS::EC2::Instance`, `AWS::EC2::InternetGateway`, `AWS::EC2::NetworkAcl`, `AWS::EC2::NetworkInterface`, `AWS::EC2::RouteTable`, `AWS::EC2::SecurityGroup`, `AWS::EC2::Subnet`, `AWS::CloudTrail::Trail`, `AWS::EC2::Volume`, `AWS::EC2::VPC`, `AWS::EC2::VPNConnection`, `AWS::EC2::VPNGateway`, `AWS::IAM::Group`, `AWS::IAM::Policy`, `AWS::IAM::Role`, `AWS::IAM::User`, `AWS::ACM::Certificate`, `AWS::RDS::DBInstance`, `AWS::RDS::DBSubnetGroup`, `AWS::RDS::DBSecurityGroup`, `AWS::RDS::DBSnapshot`, `AWS::RDS::EventSubscription`, `AWS::ElasticLoadBalancingV2::LoadBalancer`, `AWS::S3::Bucket`, `AWS::SSM::ManagedInstanceInventory`, `AWS::Redshift::Cluster`, `AWS::Redshift::ClusterSnapshot`, `AWS::Redshift::ClusterParameterGroup`, `AWS::Redshift::ClusterSecurityGroup`, `AWS::Redshift::ClusterSubnetGroup`, `AWS::Redshift::EventSubscription`, `AWS::CloudWatch::Alarm`, `AWS::CloudFormation::Stack`, `AWS::DynamoDB::Table`, `AWS::AutoScaling::AutoScalingGroup`, `AWS::AutoScaling::LaunchConfiguration`, `AWS::AutoScaling::ScalingPolicy`, `AWS::AutoScaling::ScheduledAction`, `AWS::CodeBuild::Project`, `AWS::WAF::RateBasedRule`, `AWS::WAF::Rule`, `AWS::WAF::WebACL`, `AWS::WAFRegional::RateBasedRule`, `AWS::WAFRegional::Rule`, `AWS::WAFRegional::WebACL`, `AWS::CloudFront::Distribution`, `AWS::CloudFront::StreamingDistribution`, `AWS::WAF::RuleGroup`, `AWS::WAFRegional::RuleGroup`, `AWS::Lambda::Function`, `AWS::ElasticBeanstalk::Application`, `AWS::ElasticBeanstalk::ApplicationVersion`, `AWS::ElasticBeanstalk::Environment`, `AWS::ElasticLoadBalancing::LoadBalancer`, `AWS::XRay::EncryptionConfig`, `AWS::SSM::AssociationCompliance`, `AWS::SSM::PatchCompliance`, `AWS::Shield::Protection`, `AWS::ShieldRegional::Protection`, `AWS::Config::ResourceCompliance`, `AWS::CodePipeline::Pipeline`)
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
      RetentionPeriodInDays: RetentionPeriodInDays): RetentionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "RetentionPeriodInDays" -> RetentionPeriodInDays.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetentionConfiguration]
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
      TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined): Scope = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceResourceId" -> ComplianceResourceId.map { x => x.asInstanceOf[js.Any] },
        "ComplianceResourceTypes" -> ComplianceResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "TagKey" -> TagKey.map { x => x.asInstanceOf[js.Any] },
        "TagValue" -> TagValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scope]
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
      SourceDetails: js.UndefOr[SourceDetails] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Owner" -> Owner.asInstanceOf[js.Any],
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SourceDetails" -> SourceDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
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
      MessageType: js.UndefOr[MessageType] = js.undefined): SourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSource" -> EventSource.map { x => x.asInstanceOf[js.Any] },
        "MaximumExecutionFrequency" -> MaximumExecutionFrequency.map { x => x.asInstanceOf[js.Any] },
        "MessageType" -> MessageType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceDetail]
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
      ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.undefined): StartConfigRulesEvaluationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleNames" -> ConfigRuleNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigRulesEvaluationRequest]
    }
  }

  /**
   * The output when you start the evaluation for the specified AWS Config rule.
   */
  @js.native
  trait StartConfigRulesEvaluationResponse extends js.Object {

  }

  object StartConfigRulesEvaluationResponse {
    def apply(): StartConfigRulesEvaluationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigRulesEvaluationResponse]
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
      ConfigurationRecorderName: RecorderName): StartConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigurationRecorderRequest]
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
      ConfigurationRecorderName: RecorderName): StopConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopConfigurationRecorderRequest]
    }
  }
}
