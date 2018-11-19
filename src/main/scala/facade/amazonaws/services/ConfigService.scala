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
  type EarlierTime = js.Date
  type EmptiableStringWithCharLimit256 = String
  type EvaluationResults = js.Array[EvaluationResult]
  type Evaluations = js.Array[Evaluation]
  type EventSource = String
  type GroupByAPILimit = Int
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
  type ResourceCounts = js.Array[ResourceCount]
  type ResourceCreationTime = js.Date
  type ResourceDeletionTime = js.Date
  type ResourceId = String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
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
  type Value = String
  type Version = String
}

package configservice {
  @js.native
  @JSImport("aws-sdk", "ConfigService")
  class ConfigService(config: AWSConfig) extends js.Object {
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
    def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest): Request[GetComplianceDetailsByConfigRuleResponse] = js.native
    def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest): Request[GetComplianceDetailsByResourceResponse] = js.native
    def getComplianceSummaryByConfigRule(): Request[GetComplianceSummaryByConfigRuleResponse] = js.native
    def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest): Request[GetComplianceSummaryByResourceTypeResponse] = js.native
    def getDiscoveredResourceCounts(params: GetDiscoveredResourceCountsRequest): Request[GetDiscoveredResourceCountsResponse] = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse] = js.native
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
   * <p>A collection of accounts and regions.</p>
   */
  @js.native
  trait AccountAggregationSource extends js.Object {
    var AccountIds: js.UndefOr[AccountAggregationSourceAccountList]
    var AllAwsRegions: js.UndefOr[Boolean]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
  }

  object AccountAggregationSource {
    def apply(
      AccountIds: js.UndefOr[AccountAggregationSourceAccountList] = js.undefined,
      AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
      AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined): AccountAggregationSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] },
        "AllAwsRegions" -> AllAwsRegions.map { x => x.asInstanceOf[js.Any] },
        "AwsRegions" -> AwsRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAggregationSource]
    }
  }

  /**
   * <p>Indicates whether an AWS Config rule is compliant based on account ID, region, compliance, and rule name.</p> <p>A rule is compliant if all of the resources that the rule evaluated comply with it. It is noncompliant if any of these resources do not comply.</p>
   */
  @js.native
  trait AggregateComplianceByConfigRule extends js.Object {
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
    var Compliance: js.UndefOr[Compliance]
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
  }

  object AggregateComplianceByConfigRule {
    def apply(
      ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined,
      Compliance: js.UndefOr[Compliance] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      AwsRegion: js.UndefOr[AwsRegion] = js.undefined): AggregateComplianceByConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateComplianceByConfigRule]
    }
  }

  /**
   * <p>Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.</p>
   */
  @js.native
  trait AggregateComplianceCount extends js.Object {
    var GroupName: js.UndefOr[StringWithCharLimit256]
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
  }

  object AggregateComplianceCount {
    def apply(
      GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined): AggregateComplianceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSummary" -> ComplianceSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateComplianceCount]
    }
  }

  /**
   * <p>The details of an AWS Config evaluation for an account ID and region in an aggregator. Provides the AWS resource that was evaluated, the compliance of the resource, related time stamps, and supplementary information. </p>
   */
  @js.native
  trait AggregateEvaluationResult extends js.Object {
    var ConfigRuleInvokedTime: js.UndefOr[Date]
    var AwsRegion: js.UndefOr[AwsRegion]
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier]
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ResultRecordedTime: js.UndefOr[Date]
    var AccountId: js.UndefOr[AccountId]
  }

  object AggregateEvaluationResult {
    def apply(
      ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
      AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
      EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
      Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ResultRecordedTime: js.UndefOr[Date] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined): AggregateEvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleInvokedTime" -> ConfigRuleInvokedTime.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "EvaluationResultIdentifier" -> EvaluationResultIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Annotation" -> Annotation.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ResultRecordedTime" -> ResultRecordedTime.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AggregateEvaluationResult]
    }
  }

  /**
   * <p>The current sync status between the source and the aggregator account.</p>
   */
  @js.native
  trait AggregatedSourceStatus extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var LastUpdateTime: js.UndefOr[Date]
    var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType]
    var LastErrorCode: js.UndefOr[String]
    var SourceId: js.UndefOr[String]
    var LastErrorMessage: js.UndefOr[String]
    var SourceType: js.UndefOr[AggregatedSourceType]
  }

  object AggregatedSourceStatus {
    def apply(
      AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
      LastUpdateTime: js.UndefOr[Date] = js.undefined,
      LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.undefined,
      LastErrorCode: js.UndefOr[String] = js.undefined,
      SourceId: js.UndefOr[String] = js.undefined,
      LastErrorMessage: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[AggregatedSourceType] = js.undefined): AggregatedSourceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTime" -> LastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateStatus" -> LastUpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "LastErrorCode" -> LastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "SourceId" -> SourceId.map { x => x.asInstanceOf[js.Any] },
        "LastErrorMessage" -> LastErrorMessage.map { x => x.asInstanceOf[js.Any] },
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
   * <p>An object that represents the authorizations granted to aggregator accounts and regions.</p>
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
   * <p>The detailed configuration of a specified resource.</p>
   */
  @js.native
  trait BaseConfigurationItem extends js.Object {
    var resourceId: js.UndefOr[ResourceId]
    var arn: js.UndefOr[ARN]
    var resourceType: js.UndefOr[ResourceType]
    var availabilityZone: js.UndefOr[AvailabilityZone]
    var accountId: js.UndefOr[AccountId]
    var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration]
    var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime]
    var resourceName: js.UndefOr[ResourceName]
    var version: js.UndefOr[Version]
    var awsRegion: js.UndefOr[AwsRegion]
    var resourceCreationTime: js.UndefOr[ResourceCreationTime]
    var configuration: js.UndefOr[Configuration]
    var configurationItemStatus: js.UndefOr[ConfigurationItemStatus]
    var configurationStateId: js.UndefOr[ConfigurationStateId]
  }

  object BaseConfigurationItem {
    def apply(
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      arn: js.UndefOr[ARN] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      accountId: js.UndefOr[AccountId] = js.undefined,
      supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined,
      configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      awsRegion: js.UndefOr[AwsRegion] = js.undefined,
      resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined,
      configuration: js.UndefOr[Configuration] = js.undefined,
      configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined,
      configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined): BaseConfigurationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "accountId" -> accountId.map { x => x.asInstanceOf[js.Any] },
        "supplementaryConfiguration" -> supplementaryConfiguration.map { x => x.asInstanceOf[js.Any] },
        "configurationItemCaptureTime" -> configurationItemCaptureTime.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "resourceCreationTime" -> resourceCreationTime.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "configurationItemStatus" -> configurationItemStatus.map { x => x.asInstanceOf[js.Any] },
        "configurationStateId" -> configurationStateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BaseConfigurationItem]
    }
  }

  @js.native
  trait BatchGetResourceConfigRequest extends js.Object {
    var resourceKeys: js.UndefOr[ResourceKeys]
  }

  object BatchGetResourceConfigRequest {
    def apply(
      resourceKeys: js.UndefOr[ResourceKeys] = js.undefined): BatchGetResourceConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceKeys" -> resourceKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.</p>
   */
  @js.native
  trait Compliance extends js.Object {
    var ComplianceType: js.UndefOr[ComplianceType]
    var ComplianceContributorCount: js.UndefOr[ComplianceContributorCount]
  }

  object Compliance {
    def apply(
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ComplianceContributorCount: js.UndefOr[ComplianceContributorCount] = js.undefined): Compliance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceContributorCount" -> ComplianceContributorCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Compliance]
    }
  }

  /**
   * <p>Indicates whether an AWS Config rule is compliant. A rule is compliant if all of the resources that the rule evaluated comply with it. A rule is noncompliant if any of these resources do not comply.</p>
   */
  @js.native
  trait ComplianceByConfigRule extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var Compliance: js.UndefOr[Compliance]
  }

  object ComplianceByConfigRule {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      Compliance: js.UndefOr[Compliance] = js.undefined): ComplianceByConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceByConfigRule]
    }
  }

  /**
   * <p>Indicates whether an AWS resource that is evaluated according to one or more AWS Config rules is compliant. A resource is compliant if it complies with all of the rules that evaluate it. A resource is noncompliant if it does not comply with one or more of these rules.</p>
   */
  @js.native
  trait ComplianceByResource extends js.Object {
    var ResourceType: js.UndefOr[StringWithCharLimit256]
    var ResourceId: js.UndefOr[BaseResourceId]
    var Compliance: js.UndefOr[Compliance]
  }

  object ComplianceByResource {
    def apply(
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
      Compliance: js.UndefOr[Compliance] = js.undefined): ComplianceByResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceByResource]
    }
  }

  /**
   * <p>The number of AWS resources or AWS Config rules responsible for the current compliance of the item, up to a maximum number.</p>
   */
  @js.native
  trait ComplianceContributorCount extends js.Object {
    var CappedCount: js.UndefOr[Int]
    var CapExceeded: js.UndefOr[Boolean]
  }

  object ComplianceContributorCount {
    def apply(
      CappedCount: js.UndefOr[Int] = js.undefined,
      CapExceeded: js.UndefOr[Boolean] = js.undefined): ComplianceContributorCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CappedCount" -> CappedCount.map { x => x.asInstanceOf[js.Any] },
        "CapExceeded" -> CapExceeded.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceContributorCount]
    }
  }

  /**
   * <p>The number of AWS Config rules or AWS resources that are compliant and noncompliant.</p>
   */
  @js.native
  trait ComplianceSummary extends js.Object {
    var CompliantResourceCount: js.UndefOr[ComplianceContributorCount]
    var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount]
    var ComplianceSummaryTimestamp: js.UndefOr[Date]
  }

  object ComplianceSummary {
    def apply(
      CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
      NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
      ComplianceSummaryTimestamp: js.UndefOr[Date] = js.undefined): ComplianceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompliantResourceCount" -> CompliantResourceCount.map { x => x.asInstanceOf[js.Any] },
        "NonCompliantResourceCount" -> NonCompliantResourceCount.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSummaryTimestamp" -> ComplianceSummaryTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceSummary]
    }
  }

  /**
   * <p>The number of AWS resources of a specific type that are compliant or noncompliant, up to a maximum of 100 for each.</p>
   */
  @js.native
  trait ComplianceSummaryByResourceType extends js.Object {
    var ResourceType: js.UndefOr[StringWithCharLimit256]
    var ComplianceSummary: js.UndefOr[ComplianceSummary]
  }

  object ComplianceSummaryByResourceType {
    def apply(
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined): ComplianceSummaryByResourceType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceSummary" -> ComplianceSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides status of the delivery of the snapshot or the configuration history to the specified Amazon S3 bucket. Also provides the status of notifications about the Amazon S3 delivery to the specified Amazon SNS topic.</p>
   */
  @js.native
  trait ConfigExportDeliveryInfo extends js.Object {
    var lastAttemptTime: js.UndefOr[Date]
    var lastStatus: js.UndefOr[DeliveryStatus]
    var lastErrorMessage: js.UndefOr[String]
    var nextDeliveryTime: js.UndefOr[Date]
    var lastErrorCode: js.UndefOr[String]
    var lastSuccessfulTime: js.UndefOr[Date]
  }

  object ConfigExportDeliveryInfo {
    def apply(
      lastAttemptTime: js.UndefOr[Date] = js.undefined,
      lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      nextDeliveryTime: js.UndefOr[Date] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastSuccessfulTime: js.UndefOr[Date] = js.undefined): ConfigExportDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastAttemptTime" -> lastAttemptTime.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "lastErrorMessage" -> lastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "nextDeliveryTime" -> nextDeliveryTime.map { x => x.asInstanceOf[js.Any] },
        "lastErrorCode" -> lastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "lastSuccessfulTime" -> lastSuccessfulTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigExportDeliveryInfo]
    }
  }

  /**
   * <p>An AWS Config rule represents an AWS Lambda function that you create for a custom rule or a predefined function for an AWS managed rule. The function evaluates configuration items to assess whether your AWS resources comply with your desired configurations. This function can run when AWS Config detects a configuration change to an AWS resource and at a periodic frequency that you choose (for example, every 24 hours).</p> <note> <p>You can use the AWS CLI and AWS SDKs if you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot. For more information, see <a>ConfigSnapshotDeliveryProperties</a>.</p> </note> <p>For more information about developing and using AWS Config rules, see <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.</p>
   */
  @js.native
  trait ConfigRule extends js.Object {
    var ConfigRuleId: js.UndefOr[String]
    var Scope: js.UndefOr[Scope]
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var CreatedBy: js.UndefOr[StringWithCharLimit256]
    var Description: js.UndefOr[EmptiableStringWithCharLimit256]
    var ConfigRuleArn: js.UndefOr[String]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
    var ConfigRuleState: js.UndefOr[ConfigRuleState]
    var Source: js.UndefOr[Source]
    var InputParameters: js.UndefOr[StringWithCharLimit1024]
  }

  object ConfigRule {
    def apply(
      ConfigRuleId: js.UndefOr[String] = js.undefined,
      Scope: js.UndefOr[Scope] = js.undefined,
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined,
      Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.undefined,
      ConfigRuleArn: js.UndefOr[String] = js.undefined,
      MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
      ConfigRuleState: js.UndefOr[ConfigRuleState] = js.undefined,
      Source: js.UndefOr[Source] = js.undefined,
      InputParameters: js.UndefOr[StringWithCharLimit1024] = js.undefined): ConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleId" -> ConfigRuleId.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "CreatedBy" -> CreatedBy.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleArn" -> ConfigRuleArn.map { x => x.asInstanceOf[js.Any] },
        "MaximumExecutionFrequency" -> MaximumExecutionFrequency.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleState" -> ConfigRuleState.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "InputParameters" -> InputParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRule]
    }
  }

  /**
   * <p>Filters the compliance results based on account ID, region, compliance type, and rule name.</p>
   */
  @js.native
  trait ConfigRuleComplianceFilters extends js.Object {
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
    var ComplianceType: js.UndefOr[ComplianceType]
    var AccountId: js.UndefOr[AccountId]
    var AwsRegion: js.UndefOr[AwsRegion]
  }

  object ConfigRuleComplianceFilters {
    def apply(
      ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      AwsRegion: js.UndefOr[AwsRegion] = js.undefined): ConfigRuleComplianceFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRuleComplianceFilters]
    }
  }

  /**
   * <p>Filters the results based on the account IDs and regions.</p>
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
   * <p>Status information for your AWS managed Config rules. The status includes information such as the last time the rule ran, the last time it failed, and the related error for the last failure.</p> <p>This action does not return status information about custom AWS Config rules.</p>
   */
  @js.native
  trait ConfigRuleEvaluationStatus extends js.Object {
    var LastSuccessfulInvocationTime: js.UndefOr[Date]
    var ConfigRuleId: js.UndefOr[String]
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var LastFailedInvocationTime: js.UndefOr[Date]
    var LastSuccessfulEvaluationTime: js.UndefOr[Date]
    var FirstActivatedTime: js.UndefOr[Date]
    var LastFailedEvaluationTime: js.UndefOr[Date]
    var ConfigRuleArn: js.UndefOr[String]
    var LastErrorCode: js.UndefOr[String]
    var LastErrorMessage: js.UndefOr[String]
    var FirstEvaluationStarted: js.UndefOr[Boolean]
  }

  object ConfigRuleEvaluationStatus {
    def apply(
      LastSuccessfulInvocationTime: js.UndefOr[Date] = js.undefined,
      ConfigRuleId: js.UndefOr[String] = js.undefined,
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      LastFailedInvocationTime: js.UndefOr[Date] = js.undefined,
      LastSuccessfulEvaluationTime: js.UndefOr[Date] = js.undefined,
      FirstActivatedTime: js.UndefOr[Date] = js.undefined,
      LastFailedEvaluationTime: js.UndefOr[Date] = js.undefined,
      ConfigRuleArn: js.UndefOr[String] = js.undefined,
      LastErrorCode: js.UndefOr[String] = js.undefined,
      LastErrorMessage: js.UndefOr[String] = js.undefined,
      FirstEvaluationStarted: js.UndefOr[Boolean] = js.undefined): ConfigRuleEvaluationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastSuccessfulInvocationTime" -> LastSuccessfulInvocationTime.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleId" -> ConfigRuleId.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "LastFailedInvocationTime" -> LastFailedInvocationTime.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulEvaluationTime" -> LastSuccessfulEvaluationTime.map { x => x.asInstanceOf[js.Any] },
        "FirstActivatedTime" -> FirstActivatedTime.map { x => x.asInstanceOf[js.Any] },
        "LastFailedEvaluationTime" -> LastFailedEvaluationTime.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleArn" -> ConfigRuleArn.map { x => x.asInstanceOf[js.Any] },
        "LastErrorCode" -> LastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "LastErrorMessage" -> LastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "FirstEvaluationStarted" -> FirstEvaluationStarted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket in your delivery channel.</p> <note> <p>If you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot, see the following:</p> </note> <p>The frequency for a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot is set by one of two values, depending on which is less frequent:</p> <ul> <li> <p>The value for the <code>deliveryFrequency</code> parameter within the delivery channel configuration, which sets how often AWS Config delivers configuration snapshots. This value also sets how often AWS Config invokes evaluations for AWS Config rules.</p> </li> <li> <p>The value for the <code>MaximumExecutionFrequency</code> parameter, which sets the maximum frequency with which AWS Config invokes evaluations for the rule. For more information, see <a>ConfigRule</a>.</p> </li> </ul> <p>If the <code>deliveryFrequency</code> value is less frequent than the <code>MaximumExecutionFrequency</code> value for a rule, AWS Config invokes the rule only as often as the <code>deliveryFrequency</code> value.</p> <ol> <li> <p>For example, you want your rule to run evaluations when AWS Config delivers the configuration snapshot.</p> </li> <li> <p>You specify the <code>MaximumExecutionFrequency</code> value for <code>Six_Hours</code>. </p> </li> <li> <p>You then specify the delivery channel <code>deliveryFrequency</code> value for <code>TwentyFour_Hours</code>.</p> </li> <li> <p>Because the value for <code>deliveryFrequency</code> is less frequent than <code>MaximumExecutionFrequency</code>, AWS Config invokes evaluations for the rule every 24 hours. </p> </li> </ol> <p>You should set the <code>MaximumExecutionFrequency</code> value to be at least as frequent as the <code>deliveryFrequency</code> value. You can view the <code>deliveryFrequency</code> value by using the <code>DescribeDeliveryChannnels</code> action.</p> <p>To update the <code>deliveryFrequency</code> with which AWS Config delivers your configuration snapshots, use the <code>PutDeliveryChannel</code> action.</p>
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
   * <p>A list that contains the status of the delivery of the configuration stream notification to the Amazon SNS topic.</p>
   */
  @js.native
  trait ConfigStreamDeliveryInfo extends js.Object {
    var lastStatus: js.UndefOr[DeliveryStatus]
    var lastErrorCode: js.UndefOr[String]
    var lastErrorMessage: js.UndefOr[String]
    var lastStatusChangeTime: js.UndefOr[Date]
  }

  object ConfigStreamDeliveryInfo {
    def apply(
      lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      lastStatusChangeTime: js.UndefOr[Date] = js.undefined): ConfigStreamDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "lastErrorCode" -> lastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "lastErrorMessage" -> lastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "lastStatusChangeTime" -> lastStatusChangeTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigStreamDeliveryInfo]
    }
  }

  /**
   * <p>The details about the configuration aggregator, including information about source accounts, regions, and metadata of the aggregator. </p>
   */
  @js.native
  trait ConfigurationAggregator extends js.Object {
    var ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn]
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var LastUpdatedTime: js.UndefOr[Date]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var CreationTime: js.UndefOr[Date]
  }

  object ConfigurationAggregator {
    def apply(
      ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn] = js.undefined,
      AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined,
      LastUpdatedTime: js.UndefOr[Date] = js.undefined,
      OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined,
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
      CreationTime: js.UndefOr[Date] = js.undefined): ConfigurationAggregator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorArn" -> ConfigurationAggregatorArn.map { x => x.asInstanceOf[js.Any] },
        "AccountAggregationSources" -> AccountAggregationSources.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "OrganizationAggregationSource" -> OrganizationAggregationSource.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationAggregator]
    }
  }

  /**
   * <p>A list that contains detailed configurations of a specified resource.</p>
   */
  @js.native
  trait ConfigurationItem extends js.Object {
    var resourceId: js.UndefOr[ResourceId]
    var arn: js.UndefOr[ARN]
    var resourceType: js.UndefOr[ResourceType]
    var tags: js.UndefOr[Tags]
    var availabilityZone: js.UndefOr[AvailabilityZone]
    var accountId: js.UndefOr[AccountId]
    var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration]
    var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime]
    var resourceName: js.UndefOr[ResourceName]
    var relationships: js.UndefOr[RelationshipList]
    var version: js.UndefOr[Version]
    var relatedEvents: js.UndefOr[RelatedEventList]
    var awsRegion: js.UndefOr[AwsRegion]
    var resourceCreationTime: js.UndefOr[ResourceCreationTime]
    var configuration: js.UndefOr[Configuration]
    var configurationItemStatus: js.UndefOr[ConfigurationItemStatus]
    var configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash]
    var configurationStateId: js.UndefOr[ConfigurationStateId]
  }

  object ConfigurationItem {
    def apply(
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      arn: js.UndefOr[ARN] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      accountId: js.UndefOr[AccountId] = js.undefined,
      supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined,
      configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      relationships: js.UndefOr[RelationshipList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      relatedEvents: js.UndefOr[RelatedEventList] = js.undefined,
      awsRegion: js.UndefOr[AwsRegion] = js.undefined,
      resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined,
      configuration: js.UndefOr[Configuration] = js.undefined,
      configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined,
      configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.undefined,
      configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined): ConfigurationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "accountId" -> accountId.map { x => x.asInstanceOf[js.Any] },
        "supplementaryConfiguration" -> supplementaryConfiguration.map { x => x.asInstanceOf[js.Any] },
        "configurationItemCaptureTime" -> configurationItemCaptureTime.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "relationships" -> relationships.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "relatedEvents" -> relatedEvents.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "resourceCreationTime" -> resourceCreationTime.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "configurationItemStatus" -> configurationItemStatus.map { x => x.asInstanceOf[js.Any] },
        "configurationItemMD5Hash" -> configurationItemMD5Hash.map { x => x.asInstanceOf[js.Any] },
        "configurationStateId" -> configurationStateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An object that represents the recording of configuration changes of an AWS resource.</p>
   */
  @js.native
  trait ConfigurationRecorder extends js.Object {
    var name: js.UndefOr[RecorderName]
    var roleARN: js.UndefOr[String]
    var recordingGroup: js.UndefOr[RecordingGroup]
  }

  object ConfigurationRecorder {
    def apply(
      name: js.UndefOr[RecorderName] = js.undefined,
      roleARN: js.UndefOr[String] = js.undefined,
      recordingGroup: js.UndefOr[RecordingGroup] = js.undefined): ConfigurationRecorder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "roleARN" -> roleARN.map { x => x.asInstanceOf[js.Any] },
        "recordingGroup" -> recordingGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorder]
    }
  }

  /**
   * <p>The current status of the configuration recorder.</p>
   */
  @js.native
  trait ConfigurationRecorderStatus extends js.Object {
    var name: js.UndefOr[String]
    var lastStatus: js.UndefOr[RecorderStatus]
    var lastErrorMessage: js.UndefOr[String]
    var lastErrorCode: js.UndefOr[String]
    var lastStartTime: js.UndefOr[Date]
    var lastStatusChangeTime: js.UndefOr[Date]
    var lastStopTime: js.UndefOr[Date]
    var recording: js.UndefOr[Boolean]
  }

  object ConfigurationRecorderStatus {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      lastStatus: js.UndefOr[RecorderStatus] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastStartTime: js.UndefOr[Date] = js.undefined,
      lastStatusChangeTime: js.UndefOr[Date] = js.undefined,
      lastStopTime: js.UndefOr[Date] = js.undefined,
      recording: js.UndefOr[Boolean] = js.undefined): ConfigurationRecorderStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "lastErrorMessage" -> lastErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "lastErrorCode" -> lastErrorCode.map { x => x.asInstanceOf[js.Any] },
        "lastStartTime" -> lastStartTime.map { x => x.asInstanceOf[js.Any] },
        "lastStatusChangeTime" -> lastStatusChangeTime.map { x => x.asInstanceOf[js.Any] },
        "lastStopTime" -> lastStopTime.map { x => x.asInstanceOf[js.Any] },
        "recording" -> recording.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorderStatus]
    }
  }

  @js.native
  trait DeleteAggregationAuthorizationRequest extends js.Object {
    var AuthorizedAccountId: js.UndefOr[AccountId]
    var AuthorizedAwsRegion: js.UndefOr[AwsRegion]
  }

  object DeleteAggregationAuthorizationRequest {
    def apply(
      AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined,
      AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined): DeleteAggregationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizedAccountId" -> AuthorizedAccountId.map { x => x.asInstanceOf[js.Any] },
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAggregationAuthorizationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteConfigRuleRequest extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
  }

  object DeleteConfigRuleRequest {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined): DeleteConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigRuleRequest]
    }
  }

  @js.native
  trait DeleteConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
  }

  object DeleteConfigurationAggregatorRequest {
    def apply(
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined): DeleteConfigurationAggregatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationAggregatorRequest]
    }
  }

  /**
   * <p>The request object for the <code>DeleteConfigurationRecorder</code> action.</p>
   */
  @js.native
  trait DeleteConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: js.UndefOr[RecorderName]
  }

  object DeleteConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined): DeleteConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON format. </p>
   */
  @js.native
  trait DeleteDeliveryChannelRequest extends js.Object {
    var DeliveryChannelName: js.UndefOr[ChannelName]
  }

  object DeleteDeliveryChannelRequest {
    def apply(
      DeliveryChannelName: js.UndefOr[ChannelName] = js.undefined): DeleteDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannelName" -> DeliveryChannelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeliveryChannelRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEvaluationResultsRequest extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
  }

  object DeleteEvaluationResultsRequest {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined): DeleteEvaluationResultsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationResultsRequest]
    }
  }

  /**
   * <p>The output when you delete the evaluation results for the specified AWS Config rule.</p>
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
    var RequesterAccountId: js.UndefOr[AccountId]
    var RequesterAwsRegion: js.UndefOr[AwsRegion]
  }

  object DeletePendingAggregationRequestRequest {
    def apply(
      RequesterAccountId: js.UndefOr[AccountId] = js.undefined,
      RequesterAwsRegion: js.UndefOr[AwsRegion] = js.undefined): DeletePendingAggregationRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterAccountId" -> RequesterAccountId.map { x => x.asInstanceOf[js.Any] },
        "RequesterAwsRegion" -> RequesterAwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePendingAggregationRequestRequest]
    }
  }

  @js.native
  trait DeleteRetentionConfigurationRequest extends js.Object {
    var RetentionConfigurationName: js.UndefOr[RetentionConfigurationName]
  }

  object DeleteRetentionConfigurationRequest {
    def apply(
      RetentionConfigurationName: js.UndefOr[RetentionConfigurationName] = js.undefined): DeleteRetentionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionConfigurationName" -> RetentionConfigurationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRetentionConfigurationRequest]
    }
  }

  /**
   * <p>The input for the <a>DeliverConfigSnapshot</a> action.</p>
   */
  @js.native
  trait DeliverConfigSnapshotRequest extends js.Object {
    var deliveryChannelName: js.UndefOr[ChannelName]
  }

  object DeliverConfigSnapshotRequest {
    def apply(
      deliveryChannelName: js.UndefOr[ChannelName] = js.undefined): DeliverConfigSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deliveryChannelName" -> deliveryChannelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotRequest]
    }
  }

  /**
   * <p>The output for the <a>DeliverConfigSnapshot</a> action, in JSON format.</p>
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
   * <p>The channel through which AWS Config delivers notifications and updated configuration states.</p>
   */
  @js.native
  trait DeliveryChannel extends js.Object {
    var name: js.UndefOr[ChannelName]
    var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties]
    var s3BucketName: js.UndefOr[String]
    var snsTopicARN: js.UndefOr[String]
    var s3KeyPrefix: js.UndefOr[String]
  }

  object DeliveryChannel {
    def apply(
      name: js.UndefOr[ChannelName] = js.undefined,
      configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined,
      s3BucketName: js.UndefOr[String] = js.undefined,
      snsTopicARN: js.UndefOr[String] = js.undefined,
      s3KeyPrefix: js.UndefOr[String] = js.undefined): DeliveryChannel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "configSnapshotDeliveryProperties" -> configSnapshotDeliveryProperties.map { x => x.asInstanceOf[js.Any] },
        "s3BucketName" -> s3BucketName.map { x => x.asInstanceOf[js.Any] },
        "snsTopicARN" -> snsTopicARN.map { x => x.asInstanceOf[js.Any] },
        "s3KeyPrefix" -> s3KeyPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannel]
    }
  }

  /**
   * <p>The status of a specified delivery channel.</p> <p>Valid values: <code>Success</code> | <code>Failure</code> </p>
   */
  @js.native
  trait DeliveryChannelStatus extends js.Object {
    var name: js.UndefOr[String]
    var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo]
    var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo]
    var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo]
  }

  object DeliveryChannelStatus {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
      configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
      configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined): DeliveryChannelStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "configSnapshotDeliveryInfo" -> configSnapshotDeliveryInfo.map { x => x.asInstanceOf[js.Any] },
        "configHistoryDeliveryInfo" -> configHistoryDeliveryInfo.map { x => x.asInstanceOf[js.Any] },
        "configStreamDeliveryInfo" -> configStreamDeliveryInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var Filters: js.UndefOr[ConfigRuleComplianceFilters]
    var Limit: js.UndefOr[GroupByAPILimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAggregateComplianceByConfigRulesRequest {
    def apply(
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
      Filters: js.UndefOr[ConfigRuleComplianceFilters] = js.undefined,
      Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAggregateComplianceByConfigRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
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
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames]
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var NextToken: js.UndefOr[String]
  }

  object DescribeComplianceByConfigRuleRequest {
    def apply(
      ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeComplianceByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleNames" -> ConfigRuleNames.map { x => x.asInstanceOf[js.Any] },
        "ComplianceTypes" -> ComplianceTypes.map { x => x.asInstanceOf[js.Any] },
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
    var ResourceId: js.UndefOr[BaseResourceId]
    var Limit: js.UndefOr[Limit]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeComplianceByResourceRequest {
    def apply(
      ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeComplianceByResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceTypes" -> ComplianceTypes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextToken: js.UndefOr[String]
    var Limit: js.UndefOr[RuleLimit]
  }

  object DescribeConfigRuleEvaluationStatusRequest {
    def apply(
      ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[RuleLimit] = js.undefined): DescribeConfigRuleEvaluationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleNames" -> ConfigRuleNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList]
    var NextToken: js.UndefOr[String]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeConfigurationAggregatorSourcesStatusRequest {
    def apply(
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
      UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeConfigurationAggregatorSourcesStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
        "UpdateStatus" -> UpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextToken: js.UndefOr[String]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeConfigurationAggregatorsRequest {
    def apply(
      ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeConfigurationAggregatorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorNames" -> ConfigurationAggregatorNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The input for the <a>DescribeConfigurationRecorderStatus</a> action.</p>
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
   * <p>The output for the <a>DescribeConfigurationRecorderStatus</a> action, in JSON format.</p>
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
   * <p>The input for the <a>DescribeConfigurationRecorders</a> action.</p>
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
   * <p>The output for the <a>DescribeConfigurationRecorders</a> action.</p>
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
   * <p>The input for the <a>DeliveryChannelStatus</a> action.</p>
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
   * <p>The output for the <a>DescribeDeliveryChannelStatus</a> action.</p>
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
   * <p>The input for the <a>DescribeDeliveryChannels</a> action.</p>
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
   * <p>The output for the <a>DescribeDeliveryChannels</a> action.</p>
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
    var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList]
    var NextToken: js.UndefOr[String]
  }

  object DescribePendingAggregationRequestsResponse {
    def apply(
      PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribePendingAggregationRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PendingAggregationRequests" -> PendingAggregationRequests.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePendingAggregationRequestsResponse]
    }
  }

  @js.native
  trait DescribeRetentionConfigurationsRequest extends js.Object {
    var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeRetentionConfigurationsRequest {
    def apply(
      RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeRetentionConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionConfigurationNames" -> RetentionConfigurationNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRetentionConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeRetentionConfigurationsResponse extends js.Object {
    var RetentionConfigurations: js.UndefOr[RetentionConfigurationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeRetentionConfigurationsResponse {
    def apply(
      RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeRetentionConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionConfigurations" -> RetentionConfigurations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRetentionConfigurationsResponse]
    }
  }

  /**
   * <p>Identifies an AWS resource and indicates whether it complies with the AWS Config rule that it was evaluated against.</p>
   */
  @js.native
  trait Evaluation extends js.Object {
    var ComplianceResourceId: js.UndefOr[BaseResourceId]
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var OrderingTimestamp: js.UndefOr[OrderingTimestamp]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ComplianceResourceType: js.UndefOr[StringWithCharLimit256]
  }

  object Evaluation {
    def apply(
      ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined,
      Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
      OrderingTimestamp: js.UndefOr[OrderingTimestamp] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ComplianceResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined): Evaluation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceResourceId" -> ComplianceResourceId.map { x => x.asInstanceOf[js.Any] },
        "Annotation" -> Annotation.map { x => x.asInstanceOf[js.Any] },
        "OrderingTimestamp" -> OrderingTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ComplianceResourceType" -> ComplianceResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Evaluation]
    }
  }

  /**
   * <p>The details of an AWS Config evaluation. Provides the AWS resource that was evaluated, the compliance of the resource, related time stamps, and supplementary information.</p>
   */
  @js.native
  trait EvaluationResult extends js.Object {
    var ConfigRuleInvokedTime: js.UndefOr[Date]
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier]
    var ResultToken: js.UndefOr[String]
    var Annotation: js.UndefOr[StringWithCharLimit256]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ResultRecordedTime: js.UndefOr[Date]
  }

  object EvaluationResult {
    def apply(
      ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
      EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
      ResultToken: js.UndefOr[String] = js.undefined,
      Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ResultRecordedTime: js.UndefOr[Date] = js.undefined): EvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleInvokedTime" -> ConfigRuleInvokedTime.map { x => x.asInstanceOf[js.Any] },
        "EvaluationResultIdentifier" -> EvaluationResultIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ResultToken" -> ResultToken.map { x => x.asInstanceOf[js.Any] },
        "Annotation" -> Annotation.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ResultRecordedTime" -> ResultRecordedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResult]
    }
  }

  /**
   * <p>Uniquely identifies an evaluation result.</p>
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
   * <p>Identifies an AWS Config rule that evaluated an AWS resource, and provides the type and ID of the resource that the rule evaluated.</p>
   */
  @js.native
  trait EvaluationResultQualifier extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var ResourceType: js.UndefOr[StringWithCharLimit256]
    var ResourceId: js.UndefOr[BaseResourceId]
  }

  object EvaluationResultQualifier {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ResourceId: js.UndefOr[BaseResourceId] = js.undefined): EvaluationResultQualifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResultQualifier]
    }
  }

  object EventSourceEnum {
    val `aws.config` = "aws.config"

    val values = IndexedSeq(`aws.config`)
  }

  @js.native
  trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var ConfigRuleName: js.UndefOr[ConfigRuleName]
    var Limit: js.UndefOr[Limit]
    var ComplianceType: js.UndefOr[ComplianceType]
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var AccountId: js.UndefOr[AccountId]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateComplianceDetailsByConfigRuleRequest {
    def apply(
      AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
      ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateComplianceDetailsByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AwsRegion" -> AwsRegion.map { x => x.asInstanceOf[js.Any] },
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ComplianceType" -> ComplianceType.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
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
    var GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey]
    var Limit: js.UndefOr[GroupByAPILimit]
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateConfigRuleComplianceSummaryRequest {
    def apply(
      GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey] = js.undefined,
      Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
      Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateConfigRuleComplianceSummaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupByKey" -> GroupByKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateConfigRuleComplianceSummaryRequest]
    }
  }

  @js.native
  trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
    var GroupByKey: js.UndefOr[StringWithCharLimit256]
    var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAggregateConfigRuleComplianceSummaryResponse {
    def apply(
      GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined,
      AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetAggregateConfigRuleComplianceSummaryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupByKey" -> GroupByKey.map { x => x.asInstanceOf[js.Any] },
        "AggregateComplianceCounts" -> AggregateComplianceCounts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAggregateConfigRuleComplianceSummaryResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64]
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetComplianceDetailsByConfigRuleRequest {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetComplianceDetailsByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRuleName" -> ConfigRuleName.map { x => x.asInstanceOf[js.Any] },
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
    var ResourceType: js.UndefOr[StringWithCharLimit256]
    var ResourceId: js.UndefOr[BaseResourceId]
    var ComplianceTypes: js.UndefOr[ComplianceTypes]
    var NextToken: js.UndefOr[String]
  }

  object GetComplianceDetailsByResourceRequest {
    def apply(
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ResourceId: js.UndefOr[BaseResourceId] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetComplianceDetailsByResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
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
    var resourceTypes: js.UndefOr[ResourceTypes]
    var limit: js.UndefOr[Limit]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetDiscoveredResourceCountsRequest {
    def apply(
      resourceTypes: js.UndefOr[ResourceTypes] = js.undefined,
      limit: js.UndefOr[Limit] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetDiscoveredResourceCountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceTypes" -> resourceTypes.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoveredResourceCountsRequest]
    }
  }

  @js.native
  trait GetDiscoveredResourceCountsResponse extends js.Object {
    var totalDiscoveredResources: js.UndefOr[Double]
    var resourceCounts: js.UndefOr[ResourceCounts]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetDiscoveredResourceCountsResponse {
    def apply(
      totalDiscoveredResources: js.UndefOr[Double] = js.undefined,
      resourceCounts: js.UndefOr[ResourceCounts] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetDiscoveredResourceCountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "totalDiscoveredResources" -> totalDiscoveredResources.map { x => x.asInstanceOf[js.Any] },
        "resourceCounts" -> resourceCounts.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoveredResourceCountsResponse]
    }
  }

  /**
   * <p>The input for the <a>GetResourceConfigHistory</a> action.</p>
   */
  @js.native
  trait GetResourceConfigHistoryRequest extends js.Object {
    var resourceId: js.UndefOr[ResourceId]
    var earlierTime: js.UndefOr[EarlierTime]
    var laterTime: js.UndefOr[LaterTime]
    var resourceType: js.UndefOr[ResourceType]
    var nextToken: js.UndefOr[NextToken]
    var chronologicalOrder: js.UndefOr[ChronologicalOrder]
    var limit: js.UndefOr[Limit]
  }

  object GetResourceConfigHistoryRequest {
    def apply(
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      earlierTime: js.UndefOr[EarlierTime] = js.undefined,
      laterTime: js.UndefOr[LaterTime] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined,
      limit: js.UndefOr[Limit] = js.undefined): GetResourceConfigHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "earlierTime" -> earlierTime.map { x => x.asInstanceOf[js.Any] },
        "laterTime" -> laterTime.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "chronologicalOrder" -> chronologicalOrder.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryRequest]
    }
  }

  /**
   * <p>The output for the <a>GetResourceConfigHistory</a> action.</p>
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
   * <p/>
   */
  @js.native
  trait ListDiscoveredResourcesRequest extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var nextToken: js.UndefOr[NextToken]
    var resourceName: js.UndefOr[ResourceName]
    var resourceIds: js.UndefOr[ResourceIdList]
    var includeDeletedResources: js.UndefOr[Boolean]
    var limit: js.UndefOr[Limit]
  }

  object ListDiscoveredResourcesRequest {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      resourceIds: js.UndefOr[ResourceIdList] = js.undefined,
      includeDeletedResources: js.UndefOr[Boolean] = js.undefined,
      limit: js.UndefOr[Limit] = js.undefined): ListDiscoveredResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "resourceIds" -> resourceIds.map { x => x.asInstanceOf[js.Any] },
        "includeDeletedResources" -> includeDeletedResources.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListDiscoveredResourcesResponse extends js.Object {
    var resourceIdentifiers: js.UndefOr[ResourceIdentifierList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDiscoveredResourcesResponse {
    def apply(
      resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDiscoveredResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceIdentifiers" -> resourceIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>This object contains regions to setup the aggregator and an IAM role to retrieve organization details.</p>
   */
  @js.native
  trait OrganizationAggregationSource extends js.Object {
    var RoleArn: js.UndefOr[String]
    var AwsRegions: js.UndefOr[AggregatorRegionList]
    var AllAwsRegions: js.UndefOr[Boolean]
  }

  object OrganizationAggregationSource {
    def apply(
      RoleArn: js.UndefOr[String] = js.undefined,
      AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined,
      AllAwsRegions: js.UndefOr[Boolean] = js.undefined): OrganizationAggregationSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "AwsRegions" -> AwsRegions.map { x => x.asInstanceOf[js.Any] },
        "AllAwsRegions" -> AllAwsRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationAggregationSource]
    }
  }

  object OwnerEnum {
    val CUSTOM_LAMBDA = "CUSTOM_LAMBDA"
    val AWS = "AWS"

    val values = IndexedSeq(CUSTOM_LAMBDA, AWS)
  }

  /**
   * <p>An object that represents the account ID and region of an aggregator account that is requesting authorization but is not yet authorized.</p>
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
    var AuthorizedAccountId: js.UndefOr[AccountId]
    var AuthorizedAwsRegion: js.UndefOr[AwsRegion]
  }

  object PutAggregationAuthorizationRequest {
    def apply(
      AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined,
      AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined): PutAggregationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizedAccountId" -> AuthorizedAccountId.map { x => x.asInstanceOf[js.Any] },
        "AuthorizedAwsRegion" -> AuthorizedAwsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ConfigRule: js.UndefOr[ConfigRule]
  }

  object PutConfigRuleRequest {
    def apply(
      ConfigRule: js.UndefOr[ConfigRule] = js.undefined): PutConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigRule" -> ConfigRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigRuleRequest]
    }
  }

  @js.native
  trait PutConfigurationAggregatorRequest extends js.Object {
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName]
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList]
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource]
  }

  object PutConfigurationAggregatorRequest {
    def apply(
      ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined,
      AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined,
      OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined): PutConfigurationAggregatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationAggregatorName" -> ConfigurationAggregatorName.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The input for the <a>PutConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait PutConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorder: js.UndefOr[ConfigurationRecorder]
  }

  object PutConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorder: js.UndefOr[ConfigurationRecorder] = js.undefined): PutConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorder" -> ConfigurationRecorder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>PutDeliveryChannel</a> action.</p>
   */
  @js.native
  trait PutDeliveryChannelRequest extends js.Object {
    var DeliveryChannel: js.UndefOr[DeliveryChannel]
  }

  object PutDeliveryChannelRequest {
    def apply(
      DeliveryChannel: js.UndefOr[DeliveryChannel] = js.undefined): PutDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryChannel" -> DeliveryChannel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDeliveryChannelRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PutEvaluationsRequest extends js.Object {
    var Evaluations: js.UndefOr[Evaluations]
    var ResultToken: js.UndefOr[String]
    var TestMode: js.UndefOr[Boolean]
  }

  object PutEvaluationsRequest {
    def apply(
      Evaluations: js.UndefOr[Evaluations] = js.undefined,
      ResultToken: js.UndefOr[String] = js.undefined,
      TestMode: js.UndefOr[Boolean] = js.undefined): PutEvaluationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Evaluations" -> Evaluations.map { x => x.asInstanceOf[js.Any] },
        "ResultToken" -> ResultToken.map { x => x.asInstanceOf[js.Any] },
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
    var RetentionPeriodInDays: js.UndefOr[RetentionPeriodInDays]
  }

  object PutRetentionConfigurationRequest {
    def apply(
      RetentionPeriodInDays: js.UndefOr[RetentionPeriodInDays] = js.undefined): PutRetentionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionPeriodInDays" -> RetentionPeriodInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Specifies the types of AWS resource for which AWS Config records configuration changes.</p> <p>In the recording group, you specify whether all supported types or specific types of resources are recorded.</p> <p>By default, AWS Config records configuration changes for all supported types of regional resources that AWS Config discovers in the region in which it is running. Regional resources are tied to a region and can be used only in that region. Examples of regional resources are EC2 instances and EBS volumes.</p> <p>You can also have AWS Config record configuration changes for supported types of global resources (for example, IAM resources). Global resources are not tied to an individual region and can be used in all regions.</p> <important> <p>The configuration details for any global resource are the same in all regions. If you customize AWS Config in multiple regions to record global resources, it will create multiple configuration items each time a global resource changes: one configuration item for each region. These configuration items will contain identical data. To prevent duplicate configuration items, you should consider customizing AWS Config in only one region to record global resources, unless you want the configuration items to be available in multiple regions.</p> </important> <p>If you don't want AWS Config to record all resources, you can specify which types of resources it will record with the <code>resourceTypes</code> parameter.</p> <p>For a list of supported resource types, see <a href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported Resource Types</a>.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/config/latest/developerguide/select-resources.html">Selecting Which Resources AWS Config Records</a>.</p>
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
   * <p>The relationship of the related resource to the main resource.</p>
   */
  @js.native
  trait Relationship extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var relationshipName: js.UndefOr[RelationshipName]
  }

  object Relationship {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      relationshipName: js.UndefOr[RelationshipName] = js.undefined): Relationship = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "relationshipName" -> relationshipName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Relationship]
    }
  }

  /**
   * <p>An object that contains the resource type and the number of resources.</p>
   */
  @js.native
  trait ResourceCount extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var count: js.UndefOr[Double]
  }

  object ResourceCount {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      count: js.UndefOr[Double] = js.undefined): ResourceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "count" -> count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceCount]
    }
  }

  /**
   * <p>The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.</p>
   */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var resourceId: js.UndefOr[ResourceId]
    var resourceName: js.UndefOr[ResourceName]
    var resourceDeletionTime: js.UndefOr[ResourceDeletionTime]
  }

  object ResourceIdentifier {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "resourceDeletionTime" -> resourceDeletionTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
    }
  }

  /**
   * <p>The details that identify a resource within AWS Config, including the resource type and resource ID.</p>
   */
  @js.native
  trait ResourceKey extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var resourceId: js.UndefOr[ResourceId]
  }

  object ResourceKey {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceId: js.UndefOr[ResourceId] = js.undefined): ResourceKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An object with the name of the retention configuration and the retention period in days. The object stores the configuration for data retention in AWS Config.</p>
   */
  @js.native
  trait RetentionConfiguration extends js.Object {
    var Name: js.UndefOr[RetentionConfigurationName]
    var RetentionPeriodInDays: js.UndefOr[RetentionPeriodInDays]
  }

  object RetentionConfiguration {
    def apply(
      Name: js.UndefOr[RetentionConfigurationName] = js.undefined,
      RetentionPeriodInDays: js.UndefOr[RetentionPeriodInDays] = js.undefined): RetentionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriodInDays" -> RetentionPeriodInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetentionConfiguration]
    }
  }

  /**
   * <p>Defines which resources trigger an evaluation for an AWS Config rule. The scope can include one or more resource types, a combination of a tag key and value, or a combination of one resource type and one resource ID. Specify a scope to constrain which resources trigger an evaluation for a rule. Otherwise, evaluations for the rule are triggered when any resource in your recording group changes in configuration.</p>
   */
  @js.native
  trait Scope extends js.Object {
    var ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes]
    var TagKey: js.UndefOr[StringWithCharLimit128]
    var TagValue: js.UndefOr[StringWithCharLimit256]
    var ComplianceResourceId: js.UndefOr[BaseResourceId]
  }

  object Scope {
    def apply(
      ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes] = js.undefined,
      TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined,
      TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined): Scope = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceResourceTypes" -> ComplianceResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "TagKey" -> TagKey.map { x => x.asInstanceOf[js.Any] },
        "TagValue" -> TagValue.map { x => x.asInstanceOf[js.Any] },
        "ComplianceResourceId" -> ComplianceResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scope]
    }
  }

  /**
   * <p>Provides the AWS Config rule owner (AWS or customer), the rule identifier, and the events that trigger the evaluation of your AWS resources.</p>
   */
  @js.native
  trait Source extends js.Object {
    var Owner: js.UndefOr[Owner]
    var SourceIdentifier: js.UndefOr[StringWithCharLimit256]
    var SourceDetails: js.UndefOr[SourceDetails]
  }

  object Source {
    def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      SourceIdentifier: js.UndefOr[StringWithCharLimit256] = js.undefined,
      SourceDetails: js.UndefOr[SourceDetails] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceDetails" -> SourceDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
    }
  }

  /**
   * <p>Provides the source and the message types that trigger AWS Config to evaluate your AWS resources against a rule. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic. You can specify the parameter values for <code>SourceDetail</code> only for custom rules. </p>
   */
  @js.native
  trait SourceDetail extends js.Object {
    var EventSource: js.UndefOr[EventSource]
    var MessageType: js.UndefOr[MessageType]
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency]
  }

  object SourceDetail {
    def apply(
      EventSource: js.UndefOr[EventSource] = js.undefined,
      MessageType: js.UndefOr[MessageType] = js.undefined,
      MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined): SourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSource" -> EventSource.map { x => x.asInstanceOf[js.Any] },
        "MessageType" -> MessageType.map { x => x.asInstanceOf[js.Any] },
        "MaximumExecutionFrequency" -> MaximumExecutionFrequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The output when you start the evaluation for the specified AWS Config rule.</p>
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
   * <p>The input for the <a>StartConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait StartConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: js.UndefOr[RecorderName]
  }

  object StartConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined): StartConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>StopConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait StopConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: js.UndefOr[RecorderName]
  }

  object StopConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined): StopConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopConfigurationRecorderRequest]
    }
  }
}
