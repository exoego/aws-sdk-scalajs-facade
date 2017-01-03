package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object config {
  type ARN = String
  type AccountId = String
  type AllSupported = Boolean
  type AvailabilityZone = String
  type AwsRegion = String
  type ChannelName = String
  type ChronologicalOrder = String
  type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]
  type ComplianceByResources = js.Array[ComplianceByResource]
  type ComplianceResourceTypes = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]
  type ComplianceType = String
  type ComplianceTypes = js.Array[ComplianceType]
  type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleNames = js.Array[StringWithCharLimit64]
  type ConfigRuleState = String
  type ConfigRules = js.Array[ConfigRule]
  type Configuration = String
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
  type EarlierTime = js.Date
  type EmptiableStringWithCharLimit256 = String
  type EvaluationResults = js.Array[EvaluationResult]
  type Evaluations = js.Array[Evaluation]
  type EventSource = String
  type IncludeGlobalResourceTypes = Boolean
  type LaterTime = js.Date
  type Limit = Integer
  type MaximumExecutionFrequency = String
  type MessageType = String
  type Name = String
  type NextToken = String
  type OrderingTimestamp = js.Date
  type Owner = String
  type RecorderName = String
  type RecorderStatus = String
  type ReevaluateConfigRuleNames = js.Array[StringWithCharLimit64]
  type RelatedEvent = String
  type RelatedEventList = js.Array[RelatedEvent]
  type RelationshipList = js.Array[Relationship]
  type RelationshipName = String
  type ResourceCreationTime = js.Date
  type ResourceDeletionTime = js.Date
  type ResourceId = String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceName = String
  type ResourceType = String
  type ResourceTypeList = js.Array[ResourceType]
  type ResourceTypes = js.Array[StringWithCharLimit256]
  type RuleLimit = Integer
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

package config {
  @js.native
  trait Config extends js.Object {
    def deleteConfigRule(params: DeleteConfigRuleRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteConfigRule(params: DeleteConfigRuleRequest): Request[js.Object] = js.native
    def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest): Request[js.Object] = js.native
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object] = js.native
    def deleteEvaluationResults(params: DeleteEvaluationResultsRequest, callback: Callback[DeleteEvaluationResultsResponse]): Unit = js.native
    def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): Request[DeleteEvaluationResultsResponse] = js.native
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest, callback: Callback[DeliverConfigSnapshotResponse]): Unit = js.native
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): Request[DeliverConfigSnapshotResponse] = js.native
    def describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest, callback: Callback[DescribeComplianceByConfigRuleResponse]): Unit = js.native
    def describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest): Request[DescribeComplianceByConfigRuleResponse] = js.native
    def describeComplianceByResource(params: DescribeComplianceByResourceRequest, callback: Callback[DescribeComplianceByResourceResponse]): Unit = js.native
    def describeComplianceByResource(params: DescribeComplianceByResourceRequest): Request[DescribeComplianceByResourceResponse] = js.native
    def describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest, callback: Callback[DescribeConfigRuleEvaluationStatusResponse]): Unit = js.native
    def describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest): Request[DescribeConfigRuleEvaluationStatusResponse] = js.native
    def describeConfigRules(params: DescribeConfigRulesRequest, callback: Callback[DescribeConfigRulesResponse]): Unit = js.native
    def describeConfigRules(params: DescribeConfigRulesRequest): Request[DescribeConfigRulesResponse] = js.native
    def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest, callback: Callback[DescribeConfigurationRecorderStatusResponse]): Unit = js.native
    def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest): Request[DescribeConfigurationRecorderStatusResponse] = js.native
    def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest, callback: Callback[DescribeConfigurationRecordersResponse]): Unit = js.native
    def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest): Request[DescribeConfigurationRecordersResponse] = js.native
    def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest, callback: Callback[DescribeDeliveryChannelStatusResponse]): Unit = js.native
    def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest): Request[DescribeDeliveryChannelStatusResponse] = js.native
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest, callback: Callback[DescribeDeliveryChannelsResponse]): Unit = js.native
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): Request[DescribeDeliveryChannelsResponse] = js.native
    def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest, callback: Callback[GetComplianceDetailsByConfigRuleResponse]): Unit = js.native
    def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest): Request[GetComplianceDetailsByConfigRuleResponse] = js.native
    def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest, callback: Callback[GetComplianceDetailsByResourceResponse]): Unit = js.native
    def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest): Request[GetComplianceDetailsByResourceResponse] = js.native
    def getComplianceSummaryByConfigRule(callback: Callback[GetComplianceSummaryByConfigRuleResponse]): Unit = js.native
    def getComplianceSummaryByConfigRule(): Request[GetComplianceSummaryByConfigRuleResponse] = js.native
    def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest, callback: Callback[GetComplianceSummaryByResourceTypeResponse]): Unit = js.native
    def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest): Request[GetComplianceSummaryByResourceTypeResponse] = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest, callback: Callback[GetResourceConfigHistoryResponse]): Unit = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse] = js.native
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest, callback: Callback[ListDiscoveredResourcesResponse]): Unit = js.native
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResponse] = js.native
    def putConfigRule(params: PutConfigRuleRequest, callback: Callback[js.Object]): Unit = js.native
    def putConfigRule(params: PutConfigRuleRequest): Request[js.Object] = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object] = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest, callback: Callback[js.Object]): Unit = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object] = js.native
    def putEvaluations(params: PutEvaluationsRequest, callback: Callback[PutEvaluationsResponse]): Unit = js.native
    def putEvaluations(params: PutEvaluationsRequest): Request[PutEvaluationsResponse] = js.native
    def startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest, callback: Callback[StartConfigRulesEvaluationResponse]): Unit = js.native
    def startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest): Request[StartConfigRulesEvaluationResponse] = js.native
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest): Request[js.Object] = js.native
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): Request[js.Object] = js.native
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
    var ComplianceType: ComplianceType
    var ComplianceContributorCount: ComplianceContributorCount
  }

  object Compliance {
    def apply(
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ComplianceContributorCount: js.UndefOr[ComplianceContributorCount] = js.undefined
    ): Compliance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceType" -> ComplianceType.map { x => x: js.Any }),
        ("ComplianceContributorCount" -> ComplianceContributorCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Compliance]
    }
  }

  /**
   * <p>Indicates whether an AWS Config rule is compliant. A rule is compliant if all of the resources that the rule evaluated comply with it, and it is noncompliant if any of these resources do not comply.</p>
   */
  @js.native
  trait ComplianceByConfigRule extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var Compliance: Compliance
  }

  object ComplianceByConfigRule {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      Compliance: js.UndefOr[Compliance] = js.undefined
    ): ComplianceByConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any }),
        ("Compliance" -> Compliance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceByConfigRule]
    }
  }

  /**
   * <p>Indicates whether an AWS resource that is evaluated according to one or more AWS Config rules is compliant. A resource is compliant if it complies with all of the rules that evaluate it, and it is noncompliant if it does not comply with one or more of these rules.</p>
   */
  @js.native
  trait ComplianceByResource extends js.Object {
    var ResourceType: StringWithCharLimit256
    var ResourceId: StringWithCharLimit256
    var Compliance: Compliance
  }

  object ComplianceByResource {
    def apply(
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ResourceId: js.UndefOr[StringWithCharLimit256] = js.undefined,
      Compliance: js.UndefOr[Compliance] = js.undefined
    ): ComplianceByResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Compliance" -> Compliance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceByResource]
    }
  }

  /**
   * <p>The number of AWS resources or AWS Config rules responsible for the current compliance of the item, up to a maximum number.</p>
   */
  @js.native
  trait ComplianceContributorCount extends js.Object {
    var CappedCount: Integer
    var CapExceeded: Boolean
  }

  object ComplianceContributorCount {
    def apply(
      CappedCount: js.UndefOr[Integer] = js.undefined,
      CapExceeded: js.UndefOr[Boolean] = js.undefined
    ): ComplianceContributorCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CappedCount" -> CappedCount.map { x => x: js.Any }),
        ("CapExceeded" -> CapExceeded.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceContributorCount]
    }
  }

  /**
   * <p>The number of AWS Config rules or AWS resources that are compliant and noncompliant.</p>
   */
  @js.native
  trait ComplianceSummary extends js.Object {
    var CompliantResourceCount: ComplianceContributorCount
    var NonCompliantResourceCount: ComplianceContributorCount
    var ComplianceSummaryTimestamp: Date
  }

  object ComplianceSummary {
    def apply(
      CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
      NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined,
      ComplianceSummaryTimestamp: js.UndefOr[Date] = js.undefined
    ): ComplianceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CompliantResourceCount" -> CompliantResourceCount.map { x => x: js.Any }),
        ("NonCompliantResourceCount" -> NonCompliantResourceCount.map { x => x: js.Any }),
        ("ComplianceSummaryTimestamp" -> ComplianceSummaryTimestamp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceSummary]
    }
  }

  /**
   * <p>The number of AWS resources of a specific type that are compliant or noncompliant, up to a maximum of 100 for each compliance.</p>
   */
  @js.native
  trait ComplianceSummaryByResourceType extends js.Object {
    var ResourceType: StringWithCharLimit256
    var ComplianceSummary: ComplianceSummary
  }

  object ComplianceSummaryByResourceType {
    def apply(
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
    ): ComplianceSummaryByResourceType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ComplianceSummary" -> ComplianceSummary.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceSummaryByResourceType]
    }
  }


  object ComplianceTypeEnum {
    val COMPLIANT = "COMPLIANT"
    val `NON_COMPLIANT` = "NON_COMPLIANT"
    val `NOT_APPLICABLE` = "NOT_APPLICABLE"
    val `INSUFFICIENT_DATA` = "INSUFFICIENT_DATA"

    val values = IndexedSeq(COMPLIANT, `NON_COMPLIANT`, `NOT_APPLICABLE`, `INSUFFICIENT_DATA`)
  }

  /**
   * <p>A list that contains the status of the delivery of either the snapshot or the configuration history to the specified Amazon S3 bucket.</p>
   */
  @js.native
  trait ConfigExportDeliveryInfo extends js.Object {
    var lastAttemptTime: Date
    var lastStatus: DeliveryStatus
    var lastErrorMessage: String
    var nextDeliveryTime: Date
    var lastErrorCode: String
    var lastSuccessfulTime: Date
  }

  object ConfigExportDeliveryInfo {
    def apply(
      lastAttemptTime: js.UndefOr[Date] = js.undefined,
      lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      nextDeliveryTime: js.UndefOr[Date] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastSuccessfulTime: js.UndefOr[Date] = js.undefined
    ): ConfigExportDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("lastAttemptTime" -> lastAttemptTime.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("lastErrorMessage" -> lastErrorMessage.map { x => x: js.Any }),
        ("nextDeliveryTime" -> nextDeliveryTime.map { x => x: js.Any }),
        ("lastErrorCode" -> lastErrorCode.map { x => x: js.Any }),
        ("lastSuccessfulTime" -> lastSuccessfulTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigExportDeliveryInfo]
    }
  }

  /**
   * <p>An AWS Config rule represents an AWS Lambda function that you create for a custom rule or a predefined function for an AWS managed rule. The function evaluates configuration items to assess whether your AWS resources comply with your desired configurations. This function can run when AWS Config detects a configuration change to an AWS resource and at a periodic frequency that you choose (for example, every 24 hours).</p> <note> <p>You can use the AWS CLI and AWS SDKs if you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot. For more information, see <a>ConfigSnapshotDeliveryProperties</a>.</p> </note> <p>For more information about developing and using AWS Config rules, see <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.</p>
   */
  @js.native
  trait ConfigRule extends js.Object {
    var ConfigRuleId: String
    var Scope: Scope
    var ConfigRuleName: StringWithCharLimit64
    var Description: EmptiableStringWithCharLimit256
    var ConfigRuleArn: String
    var MaximumExecutionFrequency: MaximumExecutionFrequency
    var ConfigRuleState: ConfigRuleState
    var Source: Source
    var InputParameters: StringWithCharLimit1024
  }

  object ConfigRule {
    def apply(
      ConfigRuleId: js.UndefOr[String] = js.undefined,
      Scope: js.UndefOr[Scope] = js.undefined,
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.undefined,
      ConfigRuleArn: js.UndefOr[String] = js.undefined,
      MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined,
      ConfigRuleState: js.UndefOr[ConfigRuleState] = js.undefined,
      Source: js.UndefOr[Source] = js.undefined,
      InputParameters: js.UndefOr[StringWithCharLimit1024] = js.undefined
    ): ConfigRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleId" -> ConfigRuleId.map { x => x: js.Any }),
        ("Scope" -> Scope.map { x => x: js.Any }),
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ConfigRuleArn" -> ConfigRuleArn.map { x => x: js.Any }),
        ("MaximumExecutionFrequency" -> MaximumExecutionFrequency.map { x => x: js.Any }),
        ("ConfigRuleState" -> ConfigRuleState.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("InputParameters" -> InputParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRule]
    }
  }

  /**
   * <p>Status information for your AWS managed Config rules. The status includes information such as the last time the rule ran, the last time it failed, and the related error for the last failure.</p> <p>This action does not return status information about custom Config rules.</p>
   */
  @js.native
  trait ConfigRuleEvaluationStatus extends js.Object {
    var LastSuccessfulInvocationTime: Date
    var ConfigRuleId: String
    var ConfigRuleName: StringWithCharLimit64
    var LastFailedInvocationTime: Date
    var LastSuccessfulEvaluationTime: Date
    var FirstActivatedTime: Date
    var LastFailedEvaluationTime: Date
    var ConfigRuleArn: String
    var LastErrorCode: String
    var LastErrorMessage: String
    var FirstEvaluationStarted: Boolean
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
      FirstEvaluationStarted: js.UndefOr[Boolean] = js.undefined
    ): ConfigRuleEvaluationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastSuccessfulInvocationTime" -> LastSuccessfulInvocationTime.map { x => x: js.Any }),
        ("ConfigRuleId" -> ConfigRuleId.map { x => x: js.Any }),
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any }),
        ("LastFailedInvocationTime" -> LastFailedInvocationTime.map { x => x: js.Any }),
        ("LastSuccessfulEvaluationTime" -> LastSuccessfulEvaluationTime.map { x => x: js.Any }),
        ("FirstActivatedTime" -> FirstActivatedTime.map { x => x: js.Any }),
        ("LastFailedEvaluationTime" -> LastFailedEvaluationTime.map { x => x: js.Any }),
        ("ConfigRuleArn" -> ConfigRuleArn.map { x => x: js.Any }),
        ("LastErrorCode" -> LastErrorCode.map { x => x: js.Any }),
        ("LastErrorMessage" -> LastErrorMessage.map { x => x: js.Any }),
        ("FirstEvaluationStarted" -> FirstEvaluationStarted.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigRuleEvaluationStatus]
    }
  }


  object ConfigRuleStateEnum {
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"
    val `DELETING_RESULTS` = "DELETING_RESULTS"
    val EVALUATING = "EVALUATING"

    val values = IndexedSeq(ACTIVE, DELETING, `DELETING_RESULTS`, EVALUATING)
  }

  /**
   * <p>Provides options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket in your delivery channel.</p> <note> <p>If you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot, see the following:</p> </note> <p>The frequency for a rule that triggers evaluations for your resources when AWS Config delivers the configuration snapshot is set by one of two values, depending on which is less frequent:</p> <ul> <li> <p>The value for the <code>deliveryFrequency</code> parameter within the delivery channel configuration, which sets how often AWS Config delivers configuration snapshots. This value also sets how often AWS Config invokes evaluations for Config rules.</p> </li> <li> <p>The value for the <code>MaximumExecutionFrequency</code> parameter, which sets the maximum frequency with which AWS Config invokes evaluations for the rule. For more information, see <a>ConfigRule</a>.</p> </li> </ul> <p>If the <code>deliveryFrequency</code> value is less frequent than the <code>MaximumExecutionFrequency</code> value for a rule, AWS Config invokes the rule only as often as the <code>deliveryFrequency</code> value.</p> <ol> <li> <p>For example, you want your rule to run evaluations when AWS Config delivers the configuration snapshot.</p> </li> <li> <p>You specify the <code>MaximumExecutionFrequency</code> value for <code>Six_Hours</code>. </p> </li> <li> <p>You then specify the delivery channel <code>deliveryFrequency</code> value for <code>TwentyFour_Hours</code>.</p> </li> <li> <p>Because the value for <code>deliveryFrequency</code> is less frequent than <code>MaximumExecutionFrequency</code>, AWS Config invokes evaluations for the rule every 24 hours. </p> </li> </ol> <p>You should set the <code>MaximumExecutionFrequency</code> value to be at least as frequent as the <code>deliveryFrequency</code> value. You can view the <code>deliveryFrequency</code> value by using the <code>DescribeDeliveryChannnels</code> action.</p> <p>To update the <code>deliveryFrequency</code> with which AWS Config delivers your configuration snapshots, use the <code>PutDeliveryChannel</code> action.</p>
   */
  @js.native
  trait ConfigSnapshotDeliveryProperties extends js.Object {
    var deliveryFrequency: MaximumExecutionFrequency
  }

  object ConfigSnapshotDeliveryProperties {
    def apply(
      deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
    ): ConfigSnapshotDeliveryProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deliveryFrequency" -> deliveryFrequency.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigSnapshotDeliveryProperties]
    }
  }

  /**
   * <p>A list that contains the status of the delivery of the configuration stream notification to the Amazon SNS topic.</p>
   */
  @js.native
  trait ConfigStreamDeliveryInfo extends js.Object {
    var lastStatus: DeliveryStatus
    var lastErrorCode: String
    var lastErrorMessage: String
    var lastStatusChangeTime: Date
  }

  object ConfigStreamDeliveryInfo {
    def apply(
      lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      lastStatusChangeTime: js.UndefOr[Date] = js.undefined
    ): ConfigStreamDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("lastErrorCode" -> lastErrorCode.map { x => x: js.Any }),
        ("lastErrorMessage" -> lastErrorMessage.map { x => x: js.Any }),
        ("lastStatusChangeTime" -> lastStatusChangeTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigStreamDeliveryInfo]
    }
  }

  /**
   * <p>A list that contains detailed configurations of a specified resource.</p> <note> <p>Currently, the list does not contain information about non-AWS components (for example, applications on your Amazon EC2 instances).</p> </note>
   */
  @js.native
  trait ConfigurationItem extends js.Object {
    var resourceId: ResourceId
    var arn: ARN
    var resourceType: ResourceType
    var tags: Tags
    var availabilityZone: AvailabilityZone
    var accountId: AccountId
    var supplementaryConfiguration: SupplementaryConfiguration
    var configurationItemCaptureTime: ConfigurationItemCaptureTime
    var resourceName: ResourceName
    var relationships: RelationshipList
    var version: Version
    var relatedEvents: RelatedEventList
    var awsRegion: AwsRegion
    var resourceCreationTime: ResourceCreationTime
    var configuration: Configuration
    var configurationItemStatus: ConfigurationItemStatus
    var configurationItemMD5Hash: ConfigurationItemMD5Hash
    var configurationStateId: ConfigurationStateId
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
      configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined
    ): ConfigurationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("arn" -> arn.map { x => x: js.Any }),
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("tags" -> tags.map { x => x: js.Any }),
        ("availabilityZone" -> availabilityZone.map { x => x: js.Any }),
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("supplementaryConfiguration" -> supplementaryConfiguration.map { x => x: js.Any }),
        ("configurationItemCaptureTime" -> configurationItemCaptureTime.map { x => x: js.Any }),
        ("resourceName" -> resourceName.map { x => x: js.Any }),
        ("relationships" -> relationships.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("relatedEvents" -> relatedEvents.map { x => x: js.Any }),
        ("awsRegion" -> awsRegion.map { x => x: js.Any }),
        ("resourceCreationTime" -> resourceCreationTime.map { x => x: js.Any }),
        ("configuration" -> configuration.map { x => x: js.Any }),
        ("configurationItemStatus" -> configurationItemStatus.map { x => x: js.Any }),
        ("configurationItemMD5Hash" -> configurationItemMD5Hash.map { x => x: js.Any }),
        ("configurationStateId" -> configurationStateId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationItem]
    }
  }


  object ConfigurationItemStatusEnum {
    val Ok = "Ok"
    val Failed = "Failed"
    val Discovered = "Discovered"
    val Deleted = "Deleted"

    val values = IndexedSeq(Ok, Failed, Discovered, Deleted)
  }

  /**
   * <p>An object that represents the recording of configuration changes of an AWS resource.</p>
   */
  @js.native
  trait ConfigurationRecorder extends js.Object {
    var name: RecorderName
    var roleARN: String
    var recordingGroup: RecordingGroup
  }

  object ConfigurationRecorder {
    def apply(
      name: js.UndefOr[RecorderName] = js.undefined,
      roleARN: js.UndefOr[String] = js.undefined,
      recordingGroup: js.UndefOr[RecordingGroup] = js.undefined
    ): ConfigurationRecorder = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("roleARN" -> roleARN.map { x => x: js.Any }),
        ("recordingGroup" -> recordingGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorder]
    }
  }

  /**
   * <p>The current status of the configuration recorder.</p>
   */
  @js.native
  trait ConfigurationRecorderStatus extends js.Object {
    var name: String
    var lastStatus: RecorderStatus
    var lastErrorMessage: String
    var lastErrorCode: String
    var lastStartTime: Date
    var lastStatusChangeTime: Date
    var lastStopTime: Date
    var recording: Boolean
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
      recording: js.UndefOr[Boolean] = js.undefined
    ): ConfigurationRecorderStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("lastErrorMessage" -> lastErrorMessage.map { x => x: js.Any }),
        ("lastErrorCode" -> lastErrorCode.map { x => x: js.Any }),
        ("lastStartTime" -> lastStartTime.map { x => x: js.Any }),
        ("lastStatusChangeTime" -> lastStatusChangeTime.map { x => x: js.Any }),
        ("lastStopTime" -> lastStopTime.map { x => x: js.Any }),
        ("recording" -> recording.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorderStatus]
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
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    ): DeleteConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigRuleRequest]
    }
  }

  /**
   * <p>The request object for the <code>DeleteConfigurationRecorder</code> action.</p>
   */
  @js.native
  trait DeleteConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object DeleteConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined
    ): DeleteConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data in JSON format. </p>
   */
  @js.native
  trait DeleteDeliveryChannelRequest extends js.Object {
    var DeliveryChannelName: ChannelName
  }

  object DeleteDeliveryChannelRequest {
    def apply(
      DeliveryChannelName: js.UndefOr[ChannelName] = js.undefined
    ): DeleteDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelName" -> DeliveryChannelName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    ): DeleteEvaluationResultsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationResultsRequest]
    }
  }

  /**
   * <p>The output when you delete the evaluation results for the specified Config rule.</p>
   */
  @js.native
  trait DeleteEvaluationResultsResponse extends js.Object {

  }

  object DeleteEvaluationResultsResponse {
    def apply(

    ): DeleteEvaluationResultsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationResultsResponse]
    }
  }

  /**
   * <p>The input for the <a>DeliverConfigSnapshot</a> action.</p>
   */
  @js.native
  trait DeliverConfigSnapshotRequest extends js.Object {
    var deliveryChannelName: ChannelName
  }

  object DeliverConfigSnapshotRequest {
    def apply(
      deliveryChannelName: js.UndefOr[ChannelName] = js.undefined
    ): DeliverConfigSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deliveryChannelName" -> deliveryChannelName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotRequest]
    }
  }

  /**
   * <p>The output for the <a>DeliverConfigSnapshot</a> action in JSON format.</p>
   */
  @js.native
  trait DeliverConfigSnapshotResponse extends js.Object {
    var configSnapshotId: String
  }

  object DeliverConfigSnapshotResponse {
    def apply(
      configSnapshotId: js.UndefOr[String] = js.undefined
    ): DeliverConfigSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("configSnapshotId" -> configSnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotResponse]
    }
  }

  /**
   * <p>The channel through which AWS Config delivers notifications and updated configuration states.</p>
   */
  @js.native
  trait DeliveryChannel extends js.Object {
    var name: ChannelName
    var configSnapshotDeliveryProperties: ConfigSnapshotDeliveryProperties
    var s3BucketName: String
    var snsTopicARN: String
    var s3KeyPrefix: String
  }

  object DeliveryChannel {
    def apply(
      name: js.UndefOr[ChannelName] = js.undefined,
      configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined,
      s3BucketName: js.UndefOr[String] = js.undefined,
      snsTopicARN: js.UndefOr[String] = js.undefined,
      s3KeyPrefix: js.UndefOr[String] = js.undefined
    ): DeliveryChannel = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("configSnapshotDeliveryProperties" -> configSnapshotDeliveryProperties.map { x => x: js.Any }),
        ("s3BucketName" -> s3BucketName.map { x => x: js.Any }),
        ("snsTopicARN" -> snsTopicARN.map { x => x: js.Any }),
        ("s3KeyPrefix" -> s3KeyPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannel]
    }
  }

  /**
   * <p>The status of a specified delivery channel.</p> <p>Valid values: <code>Success</code> | <code>Failure</code> </p>
   */
  @js.native
  trait DeliveryChannelStatus extends js.Object {
    var name: String
    var configSnapshotDeliveryInfo: ConfigExportDeliveryInfo
    var configHistoryDeliveryInfo: ConfigExportDeliveryInfo
    var configStreamDeliveryInfo: ConfigStreamDeliveryInfo
  }

  object DeliveryChannelStatus {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
      configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
      configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined
    ): DeliveryChannelStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("configSnapshotDeliveryInfo" -> configSnapshotDeliveryInfo.map { x => x: js.Any }),
        ("configHistoryDeliveryInfo" -> configHistoryDeliveryInfo.map { x => x: js.Any }),
        ("configStreamDeliveryInfo" -> configStreamDeliveryInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannelStatus]
    }
  }


  object DeliveryStatusEnum {
    val Success = "Success"
    val Failure = "Failure"
    val `Not_Applicable` = "Not_Applicable"

    val values = IndexedSeq(Success, Failure, `Not_Applicable`)
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeComplianceByConfigRuleRequest extends js.Object {
    var ConfigRuleNames: ConfigRuleNames
    var ComplianceTypes: ComplianceTypes
    var NextToken: String
  }

  object DescribeComplianceByConfigRuleRequest {
    def apply(
      ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeComplianceByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleNames" -> ConfigRuleNames.map { x => x: js.Any }),
        ("ComplianceTypes" -> ComplianceTypes.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByConfigRuleRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeComplianceByConfigRuleResponse extends js.Object {
    var ComplianceByConfigRules: ComplianceByConfigRules
    var NextToken: String
  }

  object DescribeComplianceByConfigRuleResponse {
    def apply(
      ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeComplianceByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceByConfigRules" -> ComplianceByConfigRules.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByConfigRuleResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeComplianceByResourceRequest extends js.Object {
    var ResourceId: StringWithCharLimit256
    var Limit: Limit
    var ResourceType: StringWithCharLimit256
    var ComplianceTypes: ComplianceTypes
    var NextToken: NextToken
  }

  object DescribeComplianceByResourceRequest {
    def apply(
      ResourceId: js.UndefOr[StringWithCharLimit256] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeComplianceByResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ComplianceTypes" -> ComplianceTypes.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByResourceRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeComplianceByResourceResponse extends js.Object {
    var ComplianceByResources: ComplianceByResources
    var NextToken: NextToken
  }

  object DescribeComplianceByResourceResponse {
    def apply(
      ComplianceByResources: js.UndefOr[ComplianceByResources] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeComplianceByResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceByResources" -> ComplianceByResources.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComplianceByResourceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
    var ConfigRuleNames: ConfigRuleNames
    var NextToken: String
    var Limit: RuleLimit
  }

  object DescribeConfigRuleEvaluationStatusRequest {
    def apply(
      ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[RuleLimit] = js.undefined
    ): DescribeConfigRuleEvaluationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleNames" -> ConfigRuleNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRuleEvaluationStatusRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
    var ConfigRulesEvaluationStatus: ConfigRuleEvaluationStatusList
    var NextToken: String
  }

  object DescribeConfigRuleEvaluationStatusResponse {
    def apply(
      ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRuleEvaluationStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRulesEvaluationStatus" -> ConfigRulesEvaluationStatus.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeConfigRulesRequest extends js.Object {
    var ConfigRuleNames: ConfigRuleNames
    var NextToken: String
  }

  object DescribeConfigRulesRequest {
    def apply(
      ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleNames" -> ConfigRuleNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRulesRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeConfigRulesResponse extends js.Object {
    var ConfigRules: ConfigRules
    var NextToken: String
  }

  object DescribeConfigRulesResponse {
    def apply(
      ConfigRules: js.UndefOr[ConfigRules] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeConfigRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRules" -> ConfigRules.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigRulesResponse]
    }
  }

  /**
   * <p>The input for the <a>DescribeConfigurationRecorderStatus</a> action.</p>
   */
  @js.native
  trait DescribeConfigurationRecorderStatusRequest extends js.Object {
    var ConfigurationRecorderNames: ConfigurationRecorderNameList
  }

  object DescribeConfigurationRecorderStatusRequest {
    def apply(
      ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecorderStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderNames" -> ConfigurationRecorderNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecorderStatusRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeConfigurationRecorderStatus</a> action in JSON format.</p>
   */
  @js.native
  trait DescribeConfigurationRecorderStatusResponse extends js.Object {
    var ConfigurationRecordersStatus: ConfigurationRecorderStatusList
  }

  object DescribeConfigurationRecorderStatusResponse {
    def apply(
      ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
    ): DescribeConfigurationRecorderStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecordersStatus" -> ConfigurationRecordersStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecorderStatusResponse]
    }
  }

  /**
   * <p>The input for the <a>DescribeConfigurationRecorders</a> action.</p>
   */
  @js.native
  trait DescribeConfigurationRecordersRequest extends js.Object {
    var ConfigurationRecorderNames: ConfigurationRecorderNameList
  }

  object DescribeConfigurationRecordersRequest {
    def apply(
      ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecordersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderNames" -> ConfigurationRecorderNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecordersRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeConfigurationRecorders</a> action.</p>
   */
  @js.native
  trait DescribeConfigurationRecordersResponse extends js.Object {
    var ConfigurationRecorders: ConfigurationRecorderList
  }

  object DescribeConfigurationRecordersResponse {
    def apply(
      ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
    ): DescribeConfigurationRecordersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorders" -> ConfigurationRecorders.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecordersResponse]
    }
  }

  /**
   * <p>The input for the <a>DeliveryChannelStatus</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelStatusRequest extends js.Object {
    var DeliveryChannelNames: DeliveryChannelNameList
  }

  object DescribeDeliveryChannelStatusRequest {
    def apply(
      DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelNames" -> DeliveryChannelNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelStatusRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeDeliveryChannelStatus</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelStatusResponse extends js.Object {
    var DeliveryChannelsStatus: DeliveryChannelStatusList
  }

  object DescribeDeliveryChannelStatusResponse {
    def apply(
      DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
    ): DescribeDeliveryChannelStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelsStatus" -> DeliveryChannelsStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelStatusResponse]
    }
  }

  /**
   * <p>The input for the <a>DescribeDeliveryChannels</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelsRequest extends js.Object {
    var DeliveryChannelNames: DeliveryChannelNameList
  }

  object DescribeDeliveryChannelsRequest {
    def apply(
      DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelNames" -> DeliveryChannelNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelsRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeDeliveryChannels</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelsResponse extends js.Object {
    var DeliveryChannels: DeliveryChannelList
  }

  object DescribeDeliveryChannelsResponse {
    def apply(
      DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
    ): DescribeDeliveryChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannels" -> DeliveryChannels.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelsResponse]
    }
  }

  /**
   * <p>Identifies an AWS resource and indicates whether it complies with the AWS Config rule that it was evaluated against.</p>
   */
  @js.native
  trait Evaluation extends js.Object {
    var ComplianceResourceId: StringWithCharLimit256
    var Annotation: StringWithCharLimit256
    var OrderingTimestamp: OrderingTimestamp
    var ComplianceType: ComplianceType
    var ComplianceResourceType: StringWithCharLimit256
  }

  object Evaluation {
    def apply(
      ComplianceResourceId: js.UndefOr[StringWithCharLimit256] = js.undefined,
      Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
      OrderingTimestamp: js.UndefOr[OrderingTimestamp] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ComplianceResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): Evaluation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceResourceId" -> ComplianceResourceId.map { x => x: js.Any }),
        ("Annotation" -> Annotation.map { x => x: js.Any }),
        ("OrderingTimestamp" -> OrderingTimestamp.map { x => x: js.Any }),
        ("ComplianceType" -> ComplianceType.map { x => x: js.Any }),
        ("ComplianceResourceType" -> ComplianceResourceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Evaluation]
    }
  }

  /**
   * <p>The details of an AWS Config evaluation. Provides the AWS resource that was evaluated, the compliance of the resource, related timestamps, and supplementary information.</p>
   */
  @js.native
  trait EvaluationResult extends js.Object {
    var ConfigRuleInvokedTime: Date
    var EvaluationResultIdentifier: EvaluationResultIdentifier
    var ResultToken: String
    var Annotation: StringWithCharLimit256
    var ComplianceType: ComplianceType
    var ResultRecordedTime: Date
  }

  object EvaluationResult {
    def apply(
      ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined,
      EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined,
      ResultToken: js.UndefOr[String] = js.undefined,
      Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceType: js.UndefOr[ComplianceType] = js.undefined,
      ResultRecordedTime: js.UndefOr[Date] = js.undefined
    ): EvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleInvokedTime" -> ConfigRuleInvokedTime.map { x => x: js.Any }),
        ("EvaluationResultIdentifier" -> EvaluationResultIdentifier.map { x => x: js.Any }),
        ("ResultToken" -> ResultToken.map { x => x: js.Any }),
        ("Annotation" -> Annotation.map { x => x: js.Any }),
        ("ComplianceType" -> ComplianceType.map { x => x: js.Any }),
        ("ResultRecordedTime" -> ResultRecordedTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResult]
    }
  }

  /**
   * <p>Uniquely identifies an evaluation result.</p>
   */
  @js.native
  trait EvaluationResultIdentifier extends js.Object {
    var EvaluationResultQualifier: EvaluationResultQualifier
    var OrderingTimestamp: Date
  }

  object EvaluationResultIdentifier {
    def apply(
      EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier] = js.undefined,
      OrderingTimestamp: js.UndefOr[Date] = js.undefined
    ): EvaluationResultIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationResultQualifier" -> EvaluationResultQualifier.map { x => x: js.Any }),
        ("OrderingTimestamp" -> OrderingTimestamp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResultIdentifier]
    }
  }

  /**
   * <p>Identifies an AWS Config rule that evaluated an AWS resource, and provides the type and ID of the resource that the rule evaluated.</p>
   */
  @js.native
  trait EvaluationResultQualifier extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var ResourceType: StringWithCharLimit256
    var ResourceId: StringWithCharLimit256
  }

  object EvaluationResultQualifier {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ResourceId: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): EvaluationResultQualifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResultQualifier]
    }
  }


  object EventSourceEnum {
    val `aws.config` = "aws.config"

    val values = IndexedSeq(`aws.config`)
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
    var ConfigRuleName: StringWithCharLimit64
    var ComplianceTypes: ComplianceTypes
    var Limit: Limit
    var NextToken: NextToken
  }

  object GetComplianceDetailsByConfigRuleRequest {
    def apply(
      ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetComplianceDetailsByConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleName" -> ConfigRuleName.map { x => x: js.Any }),
        ("ComplianceTypes" -> ComplianceTypes.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceDetailsByConfigRuleResponse extends js.Object {
    var EvaluationResults: EvaluationResults
    var NextToken: NextToken
  }

  object GetComplianceDetailsByConfigRuleResponse {
    def apply(
      EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetComplianceDetailsByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationResults" -> EvaluationResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceDetailsByResourceRequest extends js.Object {
    var ResourceType: StringWithCharLimit256
    var ResourceId: StringWithCharLimit256
    var ComplianceTypes: ComplianceTypes
    var NextToken: String
  }

  object GetComplianceDetailsByResourceRequest {
    def apply(
      ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ResourceId: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): GetComplianceDetailsByResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("ComplianceTypes" -> ComplianceTypes.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByResourceRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceDetailsByResourceResponse extends js.Object {
    var EvaluationResults: EvaluationResults
    var NextToken: String
  }

  object GetComplianceDetailsByResourceResponse {
    def apply(
      EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): GetComplianceDetailsByResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationResults" -> EvaluationResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailsByResourceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
    var ComplianceSummary: ComplianceSummary
  }

  object GetComplianceSummaryByConfigRuleResponse {
    def apply(
      ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
    ): GetComplianceSummaryByConfigRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceSummary" -> ComplianceSummary.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
    var ResourceTypes: ResourceTypes
  }

  object GetComplianceSummaryByResourceTypeRequest {
    def apply(
      ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    ): GetComplianceSummaryByResourceTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceTypes" -> ResourceTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetComplianceSummaryByResourceTypeResponse extends js.Object {
    var ComplianceSummariesByResourceType: ComplianceSummariesByResourceType
  }

  object GetComplianceSummaryByResourceTypeResponse {
    def apply(
      ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType] = js.undefined
    ): GetComplianceSummaryByResourceTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceSummariesByResourceType" -> ComplianceSummariesByResourceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceSummaryByResourceTypeResponse]
    }
  }

  /**
   * <p>The input for the <a>GetResourceConfigHistory</a> action.</p>
   */
  @js.native
  trait GetResourceConfigHistoryRequest extends js.Object {
    var resourceId: ResourceId
    var earlierTime: EarlierTime
    var laterTime: LaterTime
    var resourceType: ResourceType
    var nextToken: NextToken
    var chronologicalOrder: ChronologicalOrder
    var limit: Limit
  }

  object GetResourceConfigHistoryRequest {
    def apply(
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      earlierTime: js.UndefOr[EarlierTime] = js.undefined,
      laterTime: js.UndefOr[LaterTime] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined,
      limit: js.UndefOr[Limit] = js.undefined
    ): GetResourceConfigHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("earlierTime" -> earlierTime.map { x => x: js.Any }),
        ("laterTime" -> laterTime.map { x => x: js.Any }),
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("chronologicalOrder" -> chronologicalOrder.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryRequest]
    }
  }

  /**
   * <p>The output for the <a>GetResourceConfigHistory</a> action.</p>
   */
  @js.native
  trait GetResourceConfigHistoryResponse extends js.Object {
    var configurationItems: ConfigurationItemList
    var nextToken: NextToken
  }

  object GetResourceConfigHistoryResponse {
    def apply(
      configurationItems: js.UndefOr[ConfigurationItemList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceConfigHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("configurationItems" -> configurationItems.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryResponse]
    }
  }

  /**
   * <p>Your Amazon S3 bucket policy does not permit AWS Config to write to it.</p>
   */
  @js.native
  trait InsufficientDeliveryPolicyExceptionException extends js.Object {

  }

  /**
   * <p>Indicates one of the following errors:</p> <ul> <li> <p>The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the config:Put* action.</p> </li> <li> <p>The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions.</p> </li> </ul>
   */
  @js.native
  trait InsufficientPermissionsExceptionException extends js.Object {

  }

  /**
   * <p>You have provided a configuration recorder name that is not valid.</p>
   */
  @js.native
  trait InvalidConfigurationRecorderNameExceptionException extends js.Object {

  }

  /**
   * <p>The specified delivery channel name is not valid.</p>
   */
  @js.native
  trait InvalidDeliveryChannelNameExceptionException extends js.Object {

  }

  /**
   * <p>The specified limit is outside the allowable range.</p>
   */
  @js.native
  trait InvalidLimitExceptionException extends js.Object {

  }

  /**
   * <p>The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the previous response to get the next page of results.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {

  }

  /**
   * <p>One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.</p>
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {

  }

  /**
   * <p>AWS Config throws an exception if the recording group does not contain a valid list of resource types. Invalid values could also be incorrectly formatted.</p>
   */
  @js.native
  trait InvalidRecordingGroupExceptionException extends js.Object {

  }

  /**
   * <p>The speNexcified token is invalid.</p>
   */
  @js.native
  trait InvalidResultTokenExceptionException extends js.Object {

  }

  /**
   * <p>You have provided a null or empty role ARN.</p>
   */
  @js.native
  trait InvalidRoleExceptionException extends js.Object {

  }

  /**
   * <p>The specified Amazon S3 key prefix is not valid.</p>
   */
  @js.native
  trait InvalidS3KeyPrefixExceptionException extends js.Object {

  }

  /**
   * <p>The specified Amazon SNS topic does not exist.</p>
   */
  @js.native
  trait InvalidSNSTopicARNExceptionException extends js.Object {

  }

  /**
   * <p>The specified time range is not valid. The earlier time is not chronologically before the later time.</p>
   */
  @js.native
  trait InvalidTimeRangeExceptionException extends js.Object {

  }

  /**
   * <p>You cannot delete the delivery channel you specified because the configuration recorder is running.</p>
   */
  @js.native
  trait LastDeliveryChannelDeleteFailedExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown if an evaluation is in progress or if you call the <a>StartConfigRulesEvaluation</a> API more than once per minute.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait ListDiscoveredResourcesRequest extends js.Object {
    var resourceType: ResourceType
    var nextToken: NextToken
    var resourceName: ResourceName
    var resourceIds: ResourceIdList
    var includeDeletedResources: Boolean
    var limit: Limit
  }

  object ListDiscoveredResourcesRequest {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      resourceIds: js.UndefOr[ResourceIdList] = js.undefined,
      includeDeletedResources: js.UndefOr[Boolean] = js.undefined,
      limit: js.UndefOr[Limit] = js.undefined
    ): ListDiscoveredResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("resourceName" -> resourceName.map { x => x: js.Any }),
        ("resourceIds" -> resourceIds.map { x => x: js.Any }),
        ("includeDeletedResources" -> includeDeletedResources.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListDiscoveredResourcesResponse extends js.Object {
    var resourceIdentifiers: ResourceIdentifierList
    var nextToken: NextToken
  }

  object ListDiscoveredResourcesResponse {
    def apply(
      resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDiscoveredResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceIdentifiers" -> resourceIdentifiers.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesResponse]
    }
  }

  /**
   * <p>Failed to add the AWS Config rule because the account already contains the maximum number of 50 rules. Consider deleting any deactivated rules before adding new rules.</p>
   */
  @js.native
  trait MaxNumberOfConfigRulesExceededExceptionException extends js.Object {

  }

  /**
   * <p>You have reached the limit on the number of recorders you can create.</p>
   */
  @js.native
  trait MaxNumberOfConfigurationRecordersExceededExceptionException extends js.Object {

  }

  /**
   * <p>You have reached the limit on the number of delivery channels you can create.</p>
   */
  @js.native
  trait MaxNumberOfDeliveryChannelsExceededExceptionException extends js.Object {

  }


  object MaximumExecutionFrequencyEnum {
    val `One_Hour` = "One_Hour"
    val `Three_Hours` = "Three_Hours"
    val `Six_Hours` = "Six_Hours"
    val `Twelve_Hours` = "Twelve_Hours"
    val `TwentyFour_Hours` = "TwentyFour_Hours"

    val values = IndexedSeq(`One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`)
  }


  object MessageTypeEnum {
    val ConfigurationItemChangeNotification = "ConfigurationItemChangeNotification"
    val ConfigurationSnapshotDeliveryCompleted = "ConfigurationSnapshotDeliveryCompleted"
    val ScheduledNotification = "ScheduledNotification"

    val values = IndexedSeq(ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted, ScheduledNotification)
  }

  /**
   * <p>There are no configuration recorders available to provide the role needed to describe your resources. Create a configuration recorder.</p>
   */
  @js.native
  trait NoAvailableConfigurationRecorderExceptionException extends js.Object {

  }

  /**
   * <p>There is no delivery channel available to record configurations.</p>
   */
  @js.native
  trait NoAvailableDeliveryChannelExceptionException extends js.Object {

  }

  /**
   * <p>There is no configuration recorder running.</p>
   */
  @js.native
  trait NoRunningConfigurationRecorderExceptionException extends js.Object {

  }

  /**
   * <p>The specified Amazon S3 bucket does not exist.</p>
   */
  @js.native
  trait NoSuchBucketExceptionException extends js.Object {

  }

  /**
   * <p>One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again.</p>
   */
  @js.native
  trait NoSuchConfigRuleExceptionException extends js.Object {

  }

  /**
   * <p>You have specified a configuration recorder that does not exist.</p>
   */
  @js.native
  trait NoSuchConfigurationRecorderExceptionException extends js.Object {

  }

  /**
   * <p>You have specified a delivery channel that does not exist.</p>
   */
  @js.native
  trait NoSuchDeliveryChannelExceptionException extends js.Object {

  }


  object OwnerEnum {
    val `CUSTOM_LAMBDA` = "CUSTOM_LAMBDA"
    val AWS = "AWS"

    val values = IndexedSeq(`CUSTOM_LAMBDA`, AWS)
  }

  /**
   * <p/>
   */
  @js.native
  trait PutConfigRuleRequest extends js.Object {
    var ConfigRule: ConfigRule
  }

  object PutConfigRuleRequest {
    def apply(
      ConfigRule: js.UndefOr[ConfigRule] = js.undefined
    ): PutConfigRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRule" -> ConfigRule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigRuleRequest]
    }
  }

  /**
   * <p>The input for the <a>PutConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait PutConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorder: ConfigurationRecorder
  }

  object PutConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorder: js.UndefOr[ConfigurationRecorder] = js.undefined
    ): PutConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorder" -> ConfigurationRecorder.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>PutDeliveryChannel</a> action.</p>
   */
  @js.native
  trait PutDeliveryChannelRequest extends js.Object {
    var DeliveryChannel: DeliveryChannel
  }

  object PutDeliveryChannelRequest {
    def apply(
      DeliveryChannel: js.UndefOr[DeliveryChannel] = js.undefined
    ): PutDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannel" -> DeliveryChannel.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDeliveryChannelRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PutEvaluationsRequest extends js.Object {
    var Evaluations: Evaluations
    var ResultToken: String
  }

  object PutEvaluationsRequest {
    def apply(
      Evaluations: js.UndefOr[Evaluations] = js.undefined,
      ResultToken: js.UndefOr[String] = js.undefined
    ): PutEvaluationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Evaluations" -> Evaluations.map { x => x: js.Any }),
        ("ResultToken" -> ResultToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEvaluationsRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PutEvaluationsResponse extends js.Object {
    var FailedEvaluations: Evaluations
  }

  object PutEvaluationsResponse {
    def apply(
      FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
    ): PutEvaluationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedEvaluations" -> FailedEvaluations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEvaluationsResponse]
    }
  }


  object RecorderStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Pending, Success, Failure)
  }

  /**
   * <p>Specifies the types of AWS resource for which AWS Config records configuration changes.</p> <p>In the recording group, you specify whether all supported types or specific types of resources are recorded.</p> <p>By default, AWS Config records configuration changes for all supported types of regional resources that AWS Config discovers in the region in which it is running. Regional resources are tied to a region and can be used only in that region. Examples of regional resources are EC2 instances and EBS volumes.</p> <p>You can also have AWS Config record configuration changes for supported types of global resources (for example, IAM resources). Global resources are not tied to an individual region and can be used in all regions.</p> <important> <p>The configuration details for any global resource are the same in all regions. If you customize AWS Config in multiple regions to record global resources, it will create multiple configuration items each time a global resource changes: one configuration item for each region. These configuration items will contain identical data. To prevent duplicate configuration items, you should consider customizing AWS Config in only one region to record global resources, unless you want the configuration items to be available in multiple regions.</p> </important> <p>If you don't want AWS Config to record all resources, you can specify which types of resources it will record with the <code>resourceTypes</code> parameter.</p> <p>For a list of supported resource types, see <a href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported resource types</a>.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/config/latest/developerguide/select-resources.html">Selecting Which Resources AWS Config Records</a>.</p>
   */
  @js.native
  trait RecordingGroup extends js.Object {
    var allSupported: AllSupported
    var includeGlobalResourceTypes: IncludeGlobalResourceTypes
    var resourceTypes: ResourceTypeList
  }

  object RecordingGroup {
    def apply(
      allSupported: js.UndefOr[AllSupported] = js.undefined,
      includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.undefined,
      resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
    ): RecordingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("allSupported" -> allSupported.map { x => x: js.Any }),
        ("includeGlobalResourceTypes" -> includeGlobalResourceTypes.map { x => x: js.Any }),
        ("resourceTypes" -> resourceTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordingGroup]
    }
  }

  /**
   * <p>The relationship of the related resource to the main resource.</p>
   */
  @js.native
  trait Relationship extends js.Object {
    var resourceType: ResourceType
    var resourceId: ResourceId
    var resourceName: ResourceName
    var relationshipName: RelationshipName
  }

  object Relationship {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      relationshipName: js.UndefOr[RelationshipName] = js.undefined
    ): Relationship = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("resourceName" -> resourceName.map { x => x: js.Any }),
        ("relationshipName" -> relationshipName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Relationship]
    }
  }

  /**
   * <p>The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.</p>
   */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var resourceType: ResourceType
    var resourceId: ResourceId
    var resourceName: ResourceName
    var resourceDeletionTime: ResourceDeletionTime
  }

  object ResourceIdentifier {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined
    ): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("resourceName" -> resourceName.map { x => x: js.Any }),
        ("resourceDeletionTime" -> resourceDeletionTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
    }
  }

  /**
   * <p>The rule is currently being deleted or the rule is deleting your evaluation results. Try your request again later.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {

  }

  /**
   * <p>You have specified a resource that is either unknown or has not been discovered.</p>
   */
  @js.native
  trait ResourceNotDiscoveredExceptionException extends js.Object {

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

    val values = IndexedSeq(`AWS::EC2::CustomerGateway`, `AWS::EC2::EIP`, `AWS::EC2::Host`, `AWS::EC2::Instance`, `AWS::EC2::InternetGateway`, `AWS::EC2::NetworkAcl`, `AWS::EC2::NetworkInterface`, `AWS::EC2::RouteTable`, `AWS::EC2::SecurityGroup`, `AWS::EC2::Subnet`, `AWS::CloudTrail::Trail`, `AWS::EC2::Volume`, `AWS::EC2::VPC`, `AWS::EC2::VPNConnection`, `AWS::EC2::VPNGateway`, `AWS::IAM::Group`, `AWS::IAM::Policy`, `AWS::IAM::Role`, `AWS::IAM::User`, `AWS::ACM::Certificate`, `AWS::RDS::DBInstance`, `AWS::RDS::DBSubnetGroup`, `AWS::RDS::DBSecurityGroup`, `AWS::RDS::DBSnapshot`, `AWS::RDS::EventSubscription`, `AWS::ElasticLoadBalancingV2::LoadBalancer`, `AWS::S3::Bucket`, `AWS::SSM::ManagedInstanceInventory`, `AWS::Redshift::Cluster`, `AWS::Redshift::ClusterSnapshot`, `AWS::Redshift::ClusterParameterGroup`, `AWS::Redshift::ClusterSecurityGroup`, `AWS::Redshift::ClusterSubnetGroup`, `AWS::Redshift::EventSubscription`)
  }

  /**
   * <p>Defines which resources trigger an evaluation for an AWS Config rule. The scope can include one or more resource types, a combination of a tag key and value, or a combination of one resource type and one resource ID. Specify a scope to constrain which resources trigger an evaluation for a rule. Otherwise, evaluations for the rule are triggered when any resource in your recording group changes in configuration.</p>
   */
  @js.native
  trait Scope extends js.Object {
    var ComplianceResourceTypes: ComplianceResourceTypes
    var TagKey: StringWithCharLimit128
    var TagValue: StringWithCharLimit256
    var ComplianceResourceId: StringWithCharLimit256
  }

  object Scope {
    def apply(
      ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes] = js.undefined,
      TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined,
      TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined,
      ComplianceResourceId: js.UndefOr[StringWithCharLimit256] = js.undefined
    ): Scope = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComplianceResourceTypes" -> ComplianceResourceTypes.map { x => x: js.Any }),
        ("TagKey" -> TagKey.map { x => x: js.Any }),
        ("TagValue" -> TagValue.map { x => x: js.Any }),
        ("ComplianceResourceId" -> ComplianceResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scope]
    }
  }

  /**
   * <p>Provides the AWS Config rule owner (AWS or customer), the rule identifier, and the events that trigger the evaluation of your AWS resources.</p>
   */
  @js.native
  trait Source extends js.Object {
    var Owner: Owner
    var SourceIdentifier: StringWithCharLimit256
    var SourceDetails: SourceDetails
  }

  object Source {
    def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      SourceIdentifier: js.UndefOr[StringWithCharLimit256] = js.undefined,
      SourceDetails: js.UndefOr[SourceDetails] = js.undefined
    ): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any }),
        ("SourceDetails" -> SourceDetails.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
    }
  }

  /**
   * <p>Provides the source and the message types that trigger AWS Config to evaluate your AWS resources against a rule. It also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is periodic. You can specify the parameter values for <code>SourceDetail</code> only for custom rules. </p>
   */
  @js.native
  trait SourceDetail extends js.Object {
    var EventSource: EventSource
    var MessageType: MessageType
    var MaximumExecutionFrequency: MaximumExecutionFrequency
  }

  object SourceDetail {
    def apply(
      EventSource: js.UndefOr[EventSource] = js.undefined,
      MessageType: js.UndefOr[MessageType] = js.undefined,
      MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
    ): SourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSource" -> EventSource.map { x => x: js.Any }),
        ("MessageType" -> MessageType.map { x => x: js.Any }),
        ("MaximumExecutionFrequency" -> MaximumExecutionFrequency.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceDetail]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartConfigRulesEvaluationRequest extends js.Object {
    var ConfigRuleNames: ReevaluateConfigRuleNames
  }

  object StartConfigRulesEvaluationRequest {
    def apply(
      ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.undefined
    ): StartConfigRulesEvaluationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigRuleNames" -> ConfigRuleNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigRulesEvaluationRequest]
    }
  }

  /**
   * <p>The output when you start the evaluation for the specified Config rule.</p>
   */
  @js.native
  trait StartConfigRulesEvaluationResponse extends js.Object {

  }

  object StartConfigRulesEvaluationResponse {
    def apply(

    ): StartConfigRulesEvaluationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigRulesEvaluationResponse]
    }
  }

  /**
   * <p>The input for the <a>StartConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait StartConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object StartConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined
    ): StartConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>StopConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait StopConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object StopConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined
    ): StopConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The requested action is not valid.</p>
   */
  @js.native
  trait ValidationExceptionException extends js.Object {

  }
}
