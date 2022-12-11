package facade.amazonaws.services.costexplorer

import scalajs.js

@js.native
sealed trait AccountScope extends js.Any
object AccountScope {
  val PAYER = "PAYER".asInstanceOf[AccountScope]
  val LINKED = "LINKED".asInstanceOf[AccountScope]

  @inline def values: js.Array[AccountScope] = js.Array(PAYER, LINKED)
}

@js.native
sealed trait AnomalyFeedbackType extends js.Any
object AnomalyFeedbackType {
  val YES = "YES".asInstanceOf[AnomalyFeedbackType]
  val NO = "NO".asInstanceOf[AnomalyFeedbackType]
  val PLANNED_ACTIVITY = "PLANNED_ACTIVITY".asInstanceOf[AnomalyFeedbackType]

  @inline def values: js.Array[AnomalyFeedbackType] = js.Array(YES, NO, PLANNED_ACTIVITY)
}

@js.native
sealed trait AnomalySubscriptionFrequency extends js.Any
object AnomalySubscriptionFrequency {
  val DAILY = "DAILY".asInstanceOf[AnomalySubscriptionFrequency]
  val IMMEDIATE = "IMMEDIATE".asInstanceOf[AnomalySubscriptionFrequency]
  val WEEKLY = "WEEKLY".asInstanceOf[AnomalySubscriptionFrequency]

  @inline def values: js.Array[AnomalySubscriptionFrequency] = js.Array(DAILY, IMMEDIATE, WEEKLY)
}

@js.native
sealed trait Context extends js.Any
object Context {
  val COST_AND_USAGE = "COST_AND_USAGE".asInstanceOf[Context]
  val RESERVATIONS = "RESERVATIONS".asInstanceOf[Context]
  val SAVINGS_PLANS = "SAVINGS_PLANS".asInstanceOf[Context]

  @inline def values: js.Array[Context] = js.Array(COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS)
}

@js.native
sealed trait CostAllocationTagStatus extends js.Any
object CostAllocationTagStatus {
  val Active = "Active".asInstanceOf[CostAllocationTagStatus]
  val Inactive = "Inactive".asInstanceOf[CostAllocationTagStatus]

  @inline def values: js.Array[CostAllocationTagStatus] = js.Array(Active, Inactive)
}

@js.native
sealed trait CostAllocationTagType extends js.Any
object CostAllocationTagType {
  val AWSGenerated = "AWSGenerated".asInstanceOf[CostAllocationTagType]
  val UserDefined = "UserDefined".asInstanceOf[CostAllocationTagType]

  @inline def values: js.Array[CostAllocationTagType] = js.Array(AWSGenerated, UserDefined)
}

@js.native
sealed trait CostCategoryInheritedValueDimensionName extends js.Any
object CostCategoryInheritedValueDimensionName {
  val LINKED_ACCOUNT_NAME = "LINKED_ACCOUNT_NAME".asInstanceOf[CostCategoryInheritedValueDimensionName]
  val TAG = "TAG".asInstanceOf[CostCategoryInheritedValueDimensionName]

  @inline def values: js.Array[CostCategoryInheritedValueDimensionName] = js.Array(LINKED_ACCOUNT_NAME, TAG)
}

@js.native
sealed trait CostCategoryRuleType extends js.Any
object CostCategoryRuleType {
  val REGULAR = "REGULAR".asInstanceOf[CostCategoryRuleType]
  val INHERITED_VALUE = "INHERITED_VALUE".asInstanceOf[CostCategoryRuleType]

  @inline def values: js.Array[CostCategoryRuleType] = js.Array(REGULAR, INHERITED_VALUE)
}

/** The rule schema version in this particular Cost Category.
  */
@js.native
sealed trait CostCategoryRuleVersion extends js.Any
object CostCategoryRuleVersion {
  val `CostCategoryExpression.v1` = "CostCategoryExpression.v1".asInstanceOf[CostCategoryRuleVersion]

  @inline def values: js.Array[CostCategoryRuleVersion] = js.Array(`CostCategoryExpression.v1`)
}

@js.native
sealed trait CostCategorySplitChargeMethod extends js.Any
object CostCategorySplitChargeMethod {
  val FIXED = "FIXED".asInstanceOf[CostCategorySplitChargeMethod]
  val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[CostCategorySplitChargeMethod]
  val EVEN = "EVEN".asInstanceOf[CostCategorySplitChargeMethod]

  @inline def values: js.Array[CostCategorySplitChargeMethod] = js.Array(FIXED, PROPORTIONAL, EVEN)
}

@js.native
sealed trait CostCategorySplitChargeRuleParameterType extends js.Any
object CostCategorySplitChargeRuleParameterType {
  val ALLOCATION_PERCENTAGES = "ALLOCATION_PERCENTAGES".asInstanceOf[CostCategorySplitChargeRuleParameterType]

  @inline def values: js.Array[CostCategorySplitChargeRuleParameterType] = js.Array(ALLOCATION_PERCENTAGES)
}

@js.native
sealed trait CostCategoryStatus extends js.Any
object CostCategoryStatus {
  val PROCESSING = "PROCESSING".asInstanceOf[CostCategoryStatus]
  val APPLIED = "APPLIED".asInstanceOf[CostCategoryStatus]

  @inline def values: js.Array[CostCategoryStatus] = js.Array(PROCESSING, APPLIED)
}

@js.native
sealed trait CostCategoryStatusComponent extends js.Any
object CostCategoryStatusComponent {
  val COST_EXPLORER = "COST_EXPLORER".asInstanceOf[CostCategoryStatusComponent]

  @inline def values: js.Array[CostCategoryStatusComponent] = js.Array(COST_EXPLORER)
}

@js.native
sealed trait Dimension extends js.Any
object Dimension {
  val AZ = "AZ".asInstanceOf[Dimension]
  val INSTANCE_TYPE = "INSTANCE_TYPE".asInstanceOf[Dimension]
  val LINKED_ACCOUNT = "LINKED_ACCOUNT".asInstanceOf[Dimension]
  val LINKED_ACCOUNT_NAME = "LINKED_ACCOUNT_NAME".asInstanceOf[Dimension]
  val OPERATION = "OPERATION".asInstanceOf[Dimension]
  val PURCHASE_TYPE = "PURCHASE_TYPE".asInstanceOf[Dimension]
  val REGION = "REGION".asInstanceOf[Dimension]
  val SERVICE = "SERVICE".asInstanceOf[Dimension]
  val SERVICE_CODE = "SERVICE_CODE".asInstanceOf[Dimension]
  val USAGE_TYPE = "USAGE_TYPE".asInstanceOf[Dimension]
  val USAGE_TYPE_GROUP = "USAGE_TYPE_GROUP".asInstanceOf[Dimension]
  val RECORD_TYPE = "RECORD_TYPE".asInstanceOf[Dimension]
  val OPERATING_SYSTEM = "OPERATING_SYSTEM".asInstanceOf[Dimension]
  val TENANCY = "TENANCY".asInstanceOf[Dimension]
  val SCOPE = "SCOPE".asInstanceOf[Dimension]
  val PLATFORM = "PLATFORM".asInstanceOf[Dimension]
  val SUBSCRIPTION_ID = "SUBSCRIPTION_ID".asInstanceOf[Dimension]
  val LEGAL_ENTITY_NAME = "LEGAL_ENTITY_NAME".asInstanceOf[Dimension]
  val DEPLOYMENT_OPTION = "DEPLOYMENT_OPTION".asInstanceOf[Dimension]
  val DATABASE_ENGINE = "DATABASE_ENGINE".asInstanceOf[Dimension]
  val CACHE_ENGINE = "CACHE_ENGINE".asInstanceOf[Dimension]
  val INSTANCE_TYPE_FAMILY = "INSTANCE_TYPE_FAMILY".asInstanceOf[Dimension]
  val BILLING_ENTITY = "BILLING_ENTITY".asInstanceOf[Dimension]
  val RESERVATION_ID = "RESERVATION_ID".asInstanceOf[Dimension]
  val RESOURCE_ID = "RESOURCE_ID".asInstanceOf[Dimension]
  val RIGHTSIZING_TYPE = "RIGHTSIZING_TYPE".asInstanceOf[Dimension]
  val SAVINGS_PLANS_TYPE = "SAVINGS_PLANS_TYPE".asInstanceOf[Dimension]
  val SAVINGS_PLAN_ARN = "SAVINGS_PLAN_ARN".asInstanceOf[Dimension]
  val PAYMENT_OPTION = "PAYMENT_OPTION".asInstanceOf[Dimension]
  val AGREEMENT_END_DATE_TIME_AFTER = "AGREEMENT_END_DATE_TIME_AFTER".asInstanceOf[Dimension]
  val AGREEMENT_END_DATE_TIME_BEFORE = "AGREEMENT_END_DATE_TIME_BEFORE".asInstanceOf[Dimension]
  val INVOICING_ENTITY = "INVOICING_ENTITY".asInstanceOf[Dimension]

  @inline def values: js.Array[Dimension] = js.Array(
    AZ,
    INSTANCE_TYPE,
    LINKED_ACCOUNT,
    LINKED_ACCOUNT_NAME,
    OPERATION,
    PURCHASE_TYPE,
    REGION,
    SERVICE,
    SERVICE_CODE,
    USAGE_TYPE,
    USAGE_TYPE_GROUP,
    RECORD_TYPE,
    OPERATING_SYSTEM,
    TENANCY,
    SCOPE,
    PLATFORM,
    SUBSCRIPTION_ID,
    LEGAL_ENTITY_NAME,
    DEPLOYMENT_OPTION,
    DATABASE_ENGINE,
    CACHE_ENGINE,
    INSTANCE_TYPE_FAMILY,
    BILLING_ENTITY,
    RESERVATION_ID,
    RESOURCE_ID,
    RIGHTSIZING_TYPE,
    SAVINGS_PLANS_TYPE,
    SAVINGS_PLAN_ARN,
    PAYMENT_OPTION,
    AGREEMENT_END_DATE_TIME_AFTER,
    AGREEMENT_END_DATE_TIME_BEFORE,
    INVOICING_ENTITY
  )
}

@js.native
sealed trait FindingReasonCode extends js.Any
object FindingReasonCode {
  val CPU_OVER_PROVISIONED = "CPU_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val CPU_UNDER_PROVISIONED = "CPU_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val MEMORY_OVER_PROVISIONED = "MEMORY_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val MEMORY_UNDER_PROVISIONED = "MEMORY_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val EBS_THROUGHPUT_OVER_PROVISIONED = "EBS_THROUGHPUT_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val EBS_THROUGHPUT_UNDER_PROVISIONED = "EBS_THROUGHPUT_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val EBS_IOPS_OVER_PROVISIONED = "EBS_IOPS_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val EBS_IOPS_UNDER_PROVISIONED = "EBS_IOPS_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val NETWORK_BANDWIDTH_OVER_PROVISIONED = "NETWORK_BANDWIDTH_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val NETWORK_BANDWIDTH_UNDER_PROVISIONED = "NETWORK_BANDWIDTH_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val NETWORK_PPS_OVER_PROVISIONED = "NETWORK_PPS_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val NETWORK_PPS_UNDER_PROVISIONED = "NETWORK_PPS_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val DISK_IOPS_OVER_PROVISIONED = "DISK_IOPS_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val DISK_IOPS_UNDER_PROVISIONED = "DISK_IOPS_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val DISK_THROUGHPUT_OVER_PROVISIONED = "DISK_THROUGHPUT_OVER_PROVISIONED".asInstanceOf[FindingReasonCode]
  val DISK_THROUGHPUT_UNDER_PROVISIONED = "DISK_THROUGHPUT_UNDER_PROVISIONED".asInstanceOf[FindingReasonCode]

  @inline def values: js.Array[FindingReasonCode] = js.Array(
    CPU_OVER_PROVISIONED,
    CPU_UNDER_PROVISIONED,
    MEMORY_OVER_PROVISIONED,
    MEMORY_UNDER_PROVISIONED,
    EBS_THROUGHPUT_OVER_PROVISIONED,
    EBS_THROUGHPUT_UNDER_PROVISIONED,
    EBS_IOPS_OVER_PROVISIONED,
    EBS_IOPS_UNDER_PROVISIONED,
    NETWORK_BANDWIDTH_OVER_PROVISIONED,
    NETWORK_BANDWIDTH_UNDER_PROVISIONED,
    NETWORK_PPS_OVER_PROVISIONED,
    NETWORK_PPS_UNDER_PROVISIONED,
    DISK_IOPS_OVER_PROVISIONED,
    DISK_IOPS_UNDER_PROVISIONED,
    DISK_THROUGHPUT_OVER_PROVISIONED,
    DISK_THROUGHPUT_UNDER_PROVISIONED
  )
}

@js.native
sealed trait GenerationStatus extends js.Any
object GenerationStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[GenerationStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[GenerationStatus]
  val FAILED = "FAILED".asInstanceOf[GenerationStatus]

  @inline def values: js.Array[GenerationStatus] = js.Array(SUCCEEDED, PROCESSING, FAILED)
}

@js.native
sealed trait Granularity extends js.Any
object Granularity {
  val DAILY = "DAILY".asInstanceOf[Granularity]
  val MONTHLY = "MONTHLY".asInstanceOf[Granularity]
  val HOURLY = "HOURLY".asInstanceOf[Granularity]

  @inline def values: js.Array[Granularity] = js.Array(DAILY, MONTHLY, HOURLY)
}

@js.native
sealed trait GroupDefinitionType extends js.Any
object GroupDefinitionType {
  val DIMENSION = "DIMENSION".asInstanceOf[GroupDefinitionType]
  val TAG = "TAG".asInstanceOf[GroupDefinitionType]
  val COST_CATEGORY = "COST_CATEGORY".asInstanceOf[GroupDefinitionType]

  @inline def values: js.Array[GroupDefinitionType] = js.Array(DIMENSION, TAG, COST_CATEGORY)
}

@js.native
sealed trait LookbackPeriodInDays extends js.Any
object LookbackPeriodInDays {
  val SEVEN_DAYS = "SEVEN_DAYS".asInstanceOf[LookbackPeriodInDays]
  val THIRTY_DAYS = "THIRTY_DAYS".asInstanceOf[LookbackPeriodInDays]
  val SIXTY_DAYS = "SIXTY_DAYS".asInstanceOf[LookbackPeriodInDays]

  @inline def values: js.Array[LookbackPeriodInDays] = js.Array(SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS)
}

@js.native
sealed trait MatchOption extends js.Any
object MatchOption {
  val EQUALS = "EQUALS".asInstanceOf[MatchOption]
  val ABSENT = "ABSENT".asInstanceOf[MatchOption]
  val STARTS_WITH = "STARTS_WITH".asInstanceOf[MatchOption]
  val ENDS_WITH = "ENDS_WITH".asInstanceOf[MatchOption]
  val CONTAINS = "CONTAINS".asInstanceOf[MatchOption]
  val CASE_SENSITIVE = "CASE_SENSITIVE".asInstanceOf[MatchOption]
  val CASE_INSENSITIVE = "CASE_INSENSITIVE".asInstanceOf[MatchOption]

  @inline def values: js.Array[MatchOption] = js.Array(EQUALS, ABSENT, STARTS_WITH, ENDS_WITH, CONTAINS, CASE_SENSITIVE, CASE_INSENSITIVE)
}

@js.native
sealed trait Metric extends js.Any
object Metric {
  val BLENDED_COST = "BLENDED_COST".asInstanceOf[Metric]
  val UNBLENDED_COST = "UNBLENDED_COST".asInstanceOf[Metric]
  val AMORTIZED_COST = "AMORTIZED_COST".asInstanceOf[Metric]
  val NET_UNBLENDED_COST = "NET_UNBLENDED_COST".asInstanceOf[Metric]
  val NET_AMORTIZED_COST = "NET_AMORTIZED_COST".asInstanceOf[Metric]
  val USAGE_QUANTITY = "USAGE_QUANTITY".asInstanceOf[Metric]
  val NORMALIZED_USAGE_AMOUNT = "NORMALIZED_USAGE_AMOUNT".asInstanceOf[Metric]

  @inline def values: js.Array[Metric] = js.Array(BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST, NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY, NORMALIZED_USAGE_AMOUNT)
}

@js.native
sealed trait MonitorDimension extends js.Any
object MonitorDimension {
  val SERVICE = "SERVICE".asInstanceOf[MonitorDimension]

  @inline def values: js.Array[MonitorDimension] = js.Array(SERVICE)
}

@js.native
sealed trait MonitorType extends js.Any
object MonitorType {
  val DIMENSIONAL = "DIMENSIONAL".asInstanceOf[MonitorType]
  val CUSTOM = "CUSTOM".asInstanceOf[MonitorType]

  @inline def values: js.Array[MonitorType] = js.Array(DIMENSIONAL, CUSTOM)
}

@js.native
sealed trait NumericOperator extends js.Any
object NumericOperator {
  val EQUAL = "EQUAL".asInstanceOf[NumericOperator]
  val GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[NumericOperator]
  val LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[NumericOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[NumericOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[NumericOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[NumericOperator]

  @inline def values: js.Array[NumericOperator] = js.Array(EQUAL, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, BETWEEN)
}

@js.native
sealed trait OfferingClass extends js.Any
object OfferingClass {
  val STANDARD = "STANDARD".asInstanceOf[OfferingClass]
  val CONVERTIBLE = "CONVERTIBLE".asInstanceOf[OfferingClass]

  @inline def values: js.Array[OfferingClass] = js.Array(STANDARD, CONVERTIBLE)
}

@js.native
sealed trait PaymentOption extends js.Any
object PaymentOption {
  val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[PaymentOption]
  val PARTIAL_UPFRONT = "PARTIAL_UPFRONT".asInstanceOf[PaymentOption]
  val ALL_UPFRONT = "ALL_UPFRONT".asInstanceOf[PaymentOption]
  val LIGHT_UTILIZATION = "LIGHT_UTILIZATION".asInstanceOf[PaymentOption]
  val MEDIUM_UTILIZATION = "MEDIUM_UTILIZATION".asInstanceOf[PaymentOption]
  val HEAVY_UTILIZATION = "HEAVY_UTILIZATION".asInstanceOf[PaymentOption]

  @inline def values: js.Array[PaymentOption] = js.Array(NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT, LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION)
}

@js.native
sealed trait PlatformDifference extends js.Any
object PlatformDifference {
  val HYPERVISOR = "HYPERVISOR".asInstanceOf[PlatformDifference]
  val NETWORK_INTERFACE = "NETWORK_INTERFACE".asInstanceOf[PlatformDifference]
  val STORAGE_INTERFACE = "STORAGE_INTERFACE".asInstanceOf[PlatformDifference]
  val INSTANCE_STORE_AVAILABILITY = "INSTANCE_STORE_AVAILABILITY".asInstanceOf[PlatformDifference]
  val VIRTUALIZATION_TYPE = "VIRTUALIZATION_TYPE".asInstanceOf[PlatformDifference]

  @inline def values: js.Array[PlatformDifference] = js.Array(HYPERVISOR, NETWORK_INTERFACE, STORAGE_INTERFACE, INSTANCE_STORE_AVAILABILITY, VIRTUALIZATION_TYPE)
}

@js.native
sealed trait RecommendationTarget extends js.Any
object RecommendationTarget {
  val SAME_INSTANCE_FAMILY = "SAME_INSTANCE_FAMILY".asInstanceOf[RecommendationTarget]
  val CROSS_INSTANCE_FAMILY = "CROSS_INSTANCE_FAMILY".asInstanceOf[RecommendationTarget]

  @inline def values: js.Array[RecommendationTarget] = js.Array(SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY)
}

@js.native
sealed trait RightsizingType extends js.Any
object RightsizingType {
  val TERMINATE = "TERMINATE".asInstanceOf[RightsizingType]
  val MODIFY = "MODIFY".asInstanceOf[RightsizingType]

  @inline def values: js.Array[RightsizingType] = js.Array(TERMINATE, MODIFY)
}

@js.native
sealed trait SavingsPlansDataType extends js.Any
object SavingsPlansDataType {
  val ATTRIBUTES = "ATTRIBUTES".asInstanceOf[SavingsPlansDataType]
  val UTILIZATION = "UTILIZATION".asInstanceOf[SavingsPlansDataType]
  val AMORTIZED_COMMITMENT = "AMORTIZED_COMMITMENT".asInstanceOf[SavingsPlansDataType]
  val SAVINGS = "SAVINGS".asInstanceOf[SavingsPlansDataType]

  @inline def values: js.Array[SavingsPlansDataType] = js.Array(ATTRIBUTES, UTILIZATION, AMORTIZED_COMMITMENT, SAVINGS)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait SubscriberStatus extends js.Any
object SubscriberStatus {
  val CONFIRMED = "CONFIRMED".asInstanceOf[SubscriberStatus]
  val DECLINED = "DECLINED".asInstanceOf[SubscriberStatus]

  @inline def values: js.Array[SubscriberStatus] = js.Array(CONFIRMED, DECLINED)
}

@js.native
sealed trait SubscriberType extends js.Any
object SubscriberType {
  val EMAIL = "EMAIL".asInstanceOf[SubscriberType]
  val SNS = "SNS".asInstanceOf[SubscriberType]

  @inline def values: js.Array[SubscriberType] = js.Array(EMAIL, SNS)
}

@js.native
sealed trait SupportedSavingsPlansType extends js.Any
object SupportedSavingsPlansType {
  val COMPUTE_SP = "COMPUTE_SP".asInstanceOf[SupportedSavingsPlansType]
  val EC2_INSTANCE_SP = "EC2_INSTANCE_SP".asInstanceOf[SupportedSavingsPlansType]
  val SAGEMAKER_SP = "SAGEMAKER_SP".asInstanceOf[SupportedSavingsPlansType]

  @inline def values: js.Array[SupportedSavingsPlansType] = js.Array(COMPUTE_SP, EC2_INSTANCE_SP, SAGEMAKER_SP)
}

@js.native
sealed trait TermInYears extends js.Any
object TermInYears {
  val ONE_YEAR = "ONE_YEAR".asInstanceOf[TermInYears]
  val THREE_YEARS = "THREE_YEARS".asInstanceOf[TermInYears]

  @inline def values: js.Array[TermInYears] = js.Array(ONE_YEAR, THREE_YEARS)
}
