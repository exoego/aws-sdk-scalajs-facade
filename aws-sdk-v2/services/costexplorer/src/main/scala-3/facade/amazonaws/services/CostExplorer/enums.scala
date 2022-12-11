package facade.amazonaws.services.costexplorer

import scalajs.js

type AccountScope = "PAYER" | "LINKED"
object AccountScope {
  inline val PAYER: "PAYER" = "PAYER"
  inline val LINKED: "LINKED" = "LINKED"

  inline def values: js.Array[AccountScope] = js.Array(PAYER, LINKED)
}

type AnomalyFeedbackType = "YES" | "NO" | "PLANNED_ACTIVITY"
object AnomalyFeedbackType {
  inline val YES: "YES" = "YES"
  inline val NO: "NO" = "NO"
  inline val PLANNED_ACTIVITY: "PLANNED_ACTIVITY" = "PLANNED_ACTIVITY"

  inline def values: js.Array[AnomalyFeedbackType] = js.Array(YES, NO, PLANNED_ACTIVITY)
}

type AnomalySubscriptionFrequency = "DAILY" | "IMMEDIATE" | "WEEKLY"
object AnomalySubscriptionFrequency {
  inline val DAILY: "DAILY" = "DAILY"
  inline val IMMEDIATE: "IMMEDIATE" = "IMMEDIATE"
  inline val WEEKLY: "WEEKLY" = "WEEKLY"

  inline def values: js.Array[AnomalySubscriptionFrequency] = js.Array(DAILY, IMMEDIATE, WEEKLY)
}

type Context = "COST_AND_USAGE" | "RESERVATIONS" | "SAVINGS_PLANS"
object Context {
  inline val COST_AND_USAGE: "COST_AND_USAGE" = "COST_AND_USAGE"
  inline val RESERVATIONS: "RESERVATIONS" = "RESERVATIONS"
  inline val SAVINGS_PLANS: "SAVINGS_PLANS" = "SAVINGS_PLANS"

  inline def values: js.Array[Context] = js.Array(COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS)
}

type CostAllocationTagStatus = "Active" | "Inactive"
object CostAllocationTagStatus {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[CostAllocationTagStatus] = js.Array(Active, Inactive)
}

type CostAllocationTagType = "AWSGenerated" | "UserDefined"
object CostAllocationTagType {
  inline val AWSGenerated: "AWSGenerated" = "AWSGenerated"
  inline val UserDefined: "UserDefined" = "UserDefined"

  inline def values: js.Array[CostAllocationTagType] = js.Array(AWSGenerated, UserDefined)
}

type CostCategoryInheritedValueDimensionName = "LINKED_ACCOUNT_NAME" | "TAG"
object CostCategoryInheritedValueDimensionName {
  inline val LINKED_ACCOUNT_NAME: "LINKED_ACCOUNT_NAME" = "LINKED_ACCOUNT_NAME"
  inline val TAG: "TAG" = "TAG"

  inline def values: js.Array[CostCategoryInheritedValueDimensionName] = js.Array(LINKED_ACCOUNT_NAME, TAG)
}

type CostCategoryRuleType = "REGULAR" | "INHERITED_VALUE"
object CostCategoryRuleType {
  inline val REGULAR: "REGULAR" = "REGULAR"
  inline val INHERITED_VALUE: "INHERITED_VALUE" = "INHERITED_VALUE"

  inline def values: js.Array[CostCategoryRuleType] = js.Array(REGULAR, INHERITED_VALUE)
}

/** The rule schema version in this particular Cost Category.
  */
type CostCategoryRuleVersion = "CostCategoryExpression.v1"
object CostCategoryRuleVersion {
  inline val `CostCategoryExpression.v1`: "CostCategoryExpression.v1" = "CostCategoryExpression.v1"

  inline def values: js.Array[CostCategoryRuleVersion] = js.Array(`CostCategoryExpression.v1`)
}

type CostCategorySplitChargeMethod = "FIXED" | "PROPORTIONAL" | "EVEN"
object CostCategorySplitChargeMethod {
  inline val FIXED: "FIXED" = "FIXED"
  inline val PROPORTIONAL: "PROPORTIONAL" = "PROPORTIONAL"
  inline val EVEN: "EVEN" = "EVEN"

  inline def values: js.Array[CostCategorySplitChargeMethod] = js.Array(FIXED, PROPORTIONAL, EVEN)
}

type CostCategorySplitChargeRuleParameterType = "ALLOCATION_PERCENTAGES"
object CostCategorySplitChargeRuleParameterType {
  inline val ALLOCATION_PERCENTAGES: "ALLOCATION_PERCENTAGES" = "ALLOCATION_PERCENTAGES"

  inline def values: js.Array[CostCategorySplitChargeRuleParameterType] = js.Array(ALLOCATION_PERCENTAGES)
}

type CostCategoryStatus = "PROCESSING" | "APPLIED"
object CostCategoryStatus {
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val APPLIED: "APPLIED" = "APPLIED"

  inline def values: js.Array[CostCategoryStatus] = js.Array(PROCESSING, APPLIED)
}

type CostCategoryStatusComponent = "COST_EXPLORER"
object CostCategoryStatusComponent {
  inline val COST_EXPLORER: "COST_EXPLORER" = "COST_EXPLORER"

  inline def values: js.Array[CostCategoryStatusComponent] = js.Array(COST_EXPLORER)
}

type Dimension = "AZ" | "INSTANCE_TYPE" | "LINKED_ACCOUNT" | "LINKED_ACCOUNT_NAME" | "OPERATION" | "PURCHASE_TYPE" | "REGION" | "SERVICE" | "SERVICE_CODE" | "USAGE_TYPE" | "USAGE_TYPE_GROUP" | "RECORD_TYPE" | "OPERATING_SYSTEM" | "TENANCY" | "SCOPE" | "PLATFORM" | "SUBSCRIPTION_ID" | "LEGAL_ENTITY_NAME" | "DEPLOYMENT_OPTION" | "DATABASE_ENGINE" | "CACHE_ENGINE" | "INSTANCE_TYPE_FAMILY" | "BILLING_ENTITY" | "RESERVATION_ID" | "RESOURCE_ID" | "RIGHTSIZING_TYPE" | "SAVINGS_PLANS_TYPE" | "SAVINGS_PLAN_ARN" | "PAYMENT_OPTION" | "AGREEMENT_END_DATE_TIME_AFTER" | "AGREEMENT_END_DATE_TIME_BEFORE" | "INVOICING_ENTITY"
object Dimension {
  inline val AZ: "AZ" = "AZ"
  inline val INSTANCE_TYPE: "INSTANCE_TYPE" = "INSTANCE_TYPE"
  inline val LINKED_ACCOUNT: "LINKED_ACCOUNT" = "LINKED_ACCOUNT"
  inline val LINKED_ACCOUNT_NAME: "LINKED_ACCOUNT_NAME" = "LINKED_ACCOUNT_NAME"
  inline val OPERATION: "OPERATION" = "OPERATION"
  inline val PURCHASE_TYPE: "PURCHASE_TYPE" = "PURCHASE_TYPE"
  inline val REGION: "REGION" = "REGION"
  inline val SERVICE: "SERVICE" = "SERVICE"
  inline val SERVICE_CODE: "SERVICE_CODE" = "SERVICE_CODE"
  inline val USAGE_TYPE: "USAGE_TYPE" = "USAGE_TYPE"
  inline val USAGE_TYPE_GROUP: "USAGE_TYPE_GROUP" = "USAGE_TYPE_GROUP"
  inline val RECORD_TYPE: "RECORD_TYPE" = "RECORD_TYPE"
  inline val OPERATING_SYSTEM: "OPERATING_SYSTEM" = "OPERATING_SYSTEM"
  inline val TENANCY: "TENANCY" = "TENANCY"
  inline val SCOPE: "SCOPE" = "SCOPE"
  inline val PLATFORM: "PLATFORM" = "PLATFORM"
  inline val SUBSCRIPTION_ID: "SUBSCRIPTION_ID" = "SUBSCRIPTION_ID"
  inline val LEGAL_ENTITY_NAME: "LEGAL_ENTITY_NAME" = "LEGAL_ENTITY_NAME"
  inline val DEPLOYMENT_OPTION: "DEPLOYMENT_OPTION" = "DEPLOYMENT_OPTION"
  inline val DATABASE_ENGINE: "DATABASE_ENGINE" = "DATABASE_ENGINE"
  inline val CACHE_ENGINE: "CACHE_ENGINE" = "CACHE_ENGINE"
  inline val INSTANCE_TYPE_FAMILY: "INSTANCE_TYPE_FAMILY" = "INSTANCE_TYPE_FAMILY"
  inline val BILLING_ENTITY: "BILLING_ENTITY" = "BILLING_ENTITY"
  inline val RESERVATION_ID: "RESERVATION_ID" = "RESERVATION_ID"
  inline val RESOURCE_ID: "RESOURCE_ID" = "RESOURCE_ID"
  inline val RIGHTSIZING_TYPE: "RIGHTSIZING_TYPE" = "RIGHTSIZING_TYPE"
  inline val SAVINGS_PLANS_TYPE: "SAVINGS_PLANS_TYPE" = "SAVINGS_PLANS_TYPE"
  inline val SAVINGS_PLAN_ARN: "SAVINGS_PLAN_ARN" = "SAVINGS_PLAN_ARN"
  inline val PAYMENT_OPTION: "PAYMENT_OPTION" = "PAYMENT_OPTION"
  inline val AGREEMENT_END_DATE_TIME_AFTER: "AGREEMENT_END_DATE_TIME_AFTER" = "AGREEMENT_END_DATE_TIME_AFTER"
  inline val AGREEMENT_END_DATE_TIME_BEFORE: "AGREEMENT_END_DATE_TIME_BEFORE" = "AGREEMENT_END_DATE_TIME_BEFORE"
  inline val INVOICING_ENTITY: "INVOICING_ENTITY" = "INVOICING_ENTITY"

  inline def values: js.Array[Dimension] = js.Array(
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

type FindingReasonCode = "CPU_OVER_PROVISIONED" | "CPU_UNDER_PROVISIONED" | "MEMORY_OVER_PROVISIONED" | "MEMORY_UNDER_PROVISIONED" | "EBS_THROUGHPUT_OVER_PROVISIONED" | "EBS_THROUGHPUT_UNDER_PROVISIONED" | "EBS_IOPS_OVER_PROVISIONED" | "EBS_IOPS_UNDER_PROVISIONED" | "NETWORK_BANDWIDTH_OVER_PROVISIONED" | "NETWORK_BANDWIDTH_UNDER_PROVISIONED" | "NETWORK_PPS_OVER_PROVISIONED" | "NETWORK_PPS_UNDER_PROVISIONED" | "DISK_IOPS_OVER_PROVISIONED" | "DISK_IOPS_UNDER_PROVISIONED" | "DISK_THROUGHPUT_OVER_PROVISIONED" | "DISK_THROUGHPUT_UNDER_PROVISIONED"
object FindingReasonCode {
  inline val CPU_OVER_PROVISIONED: "CPU_OVER_PROVISIONED" = "CPU_OVER_PROVISIONED"
  inline val CPU_UNDER_PROVISIONED: "CPU_UNDER_PROVISIONED" = "CPU_UNDER_PROVISIONED"
  inline val MEMORY_OVER_PROVISIONED: "MEMORY_OVER_PROVISIONED" = "MEMORY_OVER_PROVISIONED"
  inline val MEMORY_UNDER_PROVISIONED: "MEMORY_UNDER_PROVISIONED" = "MEMORY_UNDER_PROVISIONED"
  inline val EBS_THROUGHPUT_OVER_PROVISIONED: "EBS_THROUGHPUT_OVER_PROVISIONED" = "EBS_THROUGHPUT_OVER_PROVISIONED"
  inline val EBS_THROUGHPUT_UNDER_PROVISIONED: "EBS_THROUGHPUT_UNDER_PROVISIONED" = "EBS_THROUGHPUT_UNDER_PROVISIONED"
  inline val EBS_IOPS_OVER_PROVISIONED: "EBS_IOPS_OVER_PROVISIONED" = "EBS_IOPS_OVER_PROVISIONED"
  inline val EBS_IOPS_UNDER_PROVISIONED: "EBS_IOPS_UNDER_PROVISIONED" = "EBS_IOPS_UNDER_PROVISIONED"
  inline val NETWORK_BANDWIDTH_OVER_PROVISIONED: "NETWORK_BANDWIDTH_OVER_PROVISIONED" = "NETWORK_BANDWIDTH_OVER_PROVISIONED"
  inline val NETWORK_BANDWIDTH_UNDER_PROVISIONED: "NETWORK_BANDWIDTH_UNDER_PROVISIONED" = "NETWORK_BANDWIDTH_UNDER_PROVISIONED"
  inline val NETWORK_PPS_OVER_PROVISIONED: "NETWORK_PPS_OVER_PROVISIONED" = "NETWORK_PPS_OVER_PROVISIONED"
  inline val NETWORK_PPS_UNDER_PROVISIONED: "NETWORK_PPS_UNDER_PROVISIONED" = "NETWORK_PPS_UNDER_PROVISIONED"
  inline val DISK_IOPS_OVER_PROVISIONED: "DISK_IOPS_OVER_PROVISIONED" = "DISK_IOPS_OVER_PROVISIONED"
  inline val DISK_IOPS_UNDER_PROVISIONED: "DISK_IOPS_UNDER_PROVISIONED" = "DISK_IOPS_UNDER_PROVISIONED"
  inline val DISK_THROUGHPUT_OVER_PROVISIONED: "DISK_THROUGHPUT_OVER_PROVISIONED" = "DISK_THROUGHPUT_OVER_PROVISIONED"
  inline val DISK_THROUGHPUT_UNDER_PROVISIONED: "DISK_THROUGHPUT_UNDER_PROVISIONED" = "DISK_THROUGHPUT_UNDER_PROVISIONED"

  inline def values: js.Array[FindingReasonCode] = js.Array(
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

type GenerationStatus = "SUCCEEDED" | "PROCESSING" | "FAILED"
object GenerationStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[GenerationStatus] = js.Array(SUCCEEDED, PROCESSING, FAILED)
}

type Granularity = "DAILY" | "MONTHLY" | "HOURLY"
object Granularity {
  inline val DAILY: "DAILY" = "DAILY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"
  inline val HOURLY: "HOURLY" = "HOURLY"

  inline def values: js.Array[Granularity] = js.Array(DAILY, MONTHLY, HOURLY)
}

type GroupDefinitionType = "DIMENSION" | "TAG" | "COST_CATEGORY"
object GroupDefinitionType {
  inline val DIMENSION: "DIMENSION" = "DIMENSION"
  inline val TAG: "TAG" = "TAG"
  inline val COST_CATEGORY: "COST_CATEGORY" = "COST_CATEGORY"

  inline def values: js.Array[GroupDefinitionType] = js.Array(DIMENSION, TAG, COST_CATEGORY)
}

type LookbackPeriodInDays = "SEVEN_DAYS" | "THIRTY_DAYS" | "SIXTY_DAYS"
object LookbackPeriodInDays {
  inline val SEVEN_DAYS: "SEVEN_DAYS" = "SEVEN_DAYS"
  inline val THIRTY_DAYS: "THIRTY_DAYS" = "THIRTY_DAYS"
  inline val SIXTY_DAYS: "SIXTY_DAYS" = "SIXTY_DAYS"

  inline def values: js.Array[LookbackPeriodInDays] = js.Array(SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS)
}

type MatchOption = "EQUALS" | "ABSENT" | "STARTS_WITH" | "ENDS_WITH" | "CONTAINS" | "CASE_SENSITIVE" | "CASE_INSENSITIVE"
object MatchOption {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val ABSENT: "ABSENT" = "ABSENT"
  inline val STARTS_WITH: "STARTS_WITH" = "STARTS_WITH"
  inline val ENDS_WITH: "ENDS_WITH" = "ENDS_WITH"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val CASE_SENSITIVE: "CASE_SENSITIVE" = "CASE_SENSITIVE"
  inline val CASE_INSENSITIVE: "CASE_INSENSITIVE" = "CASE_INSENSITIVE"

  inline def values: js.Array[MatchOption] = js.Array(EQUALS, ABSENT, STARTS_WITH, ENDS_WITH, CONTAINS, CASE_SENSITIVE, CASE_INSENSITIVE)
}

type Metric = "BLENDED_COST" | "UNBLENDED_COST" | "AMORTIZED_COST" | "NET_UNBLENDED_COST" | "NET_AMORTIZED_COST" | "USAGE_QUANTITY" | "NORMALIZED_USAGE_AMOUNT"
object Metric {
  inline val BLENDED_COST: "BLENDED_COST" = "BLENDED_COST"
  inline val UNBLENDED_COST: "UNBLENDED_COST" = "UNBLENDED_COST"
  inline val AMORTIZED_COST: "AMORTIZED_COST" = "AMORTIZED_COST"
  inline val NET_UNBLENDED_COST: "NET_UNBLENDED_COST" = "NET_UNBLENDED_COST"
  inline val NET_AMORTIZED_COST: "NET_AMORTIZED_COST" = "NET_AMORTIZED_COST"
  inline val USAGE_QUANTITY: "USAGE_QUANTITY" = "USAGE_QUANTITY"
  inline val NORMALIZED_USAGE_AMOUNT: "NORMALIZED_USAGE_AMOUNT" = "NORMALIZED_USAGE_AMOUNT"

  inline def values: js.Array[Metric] = js.Array(BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST, NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY, NORMALIZED_USAGE_AMOUNT)
}

type MonitorDimension = "SERVICE"
object MonitorDimension {
  inline val SERVICE: "SERVICE" = "SERVICE"

  inline def values: js.Array[MonitorDimension] = js.Array(SERVICE)
}

type MonitorType = "DIMENSIONAL" | "CUSTOM"
object MonitorType {
  inline val DIMENSIONAL: "DIMENSIONAL" = "DIMENSIONAL"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[MonitorType] = js.Array(DIMENSIONAL, CUSTOM)
}

type NumericOperator = "EQUAL" | "GREATER_THAN_OR_EQUAL" | "LESS_THAN_OR_EQUAL" | "GREATER_THAN" | "LESS_THAN" | "BETWEEN"
object NumericOperator {
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val GREATER_THAN_OR_EQUAL: "GREATER_THAN_OR_EQUAL" = "GREATER_THAN_OR_EQUAL"
  inline val LESS_THAN_OR_EQUAL: "LESS_THAN_OR_EQUAL" = "LESS_THAN_OR_EQUAL"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[NumericOperator] = js.Array(EQUAL, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, BETWEEN)
}

type OfferingClass = "STANDARD" | "CONVERTIBLE"
object OfferingClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val CONVERTIBLE: "CONVERTIBLE" = "CONVERTIBLE"

  inline def values: js.Array[OfferingClass] = js.Array(STANDARD, CONVERTIBLE)
}

type PaymentOption = "NO_UPFRONT" | "PARTIAL_UPFRONT" | "ALL_UPFRONT" | "LIGHT_UTILIZATION" | "MEDIUM_UTILIZATION" | "HEAVY_UTILIZATION"
object PaymentOption {
  inline val NO_UPFRONT: "NO_UPFRONT" = "NO_UPFRONT"
  inline val PARTIAL_UPFRONT: "PARTIAL_UPFRONT" = "PARTIAL_UPFRONT"
  inline val ALL_UPFRONT: "ALL_UPFRONT" = "ALL_UPFRONT"
  inline val LIGHT_UTILIZATION: "LIGHT_UTILIZATION" = "LIGHT_UTILIZATION"
  inline val MEDIUM_UTILIZATION: "MEDIUM_UTILIZATION" = "MEDIUM_UTILIZATION"
  inline val HEAVY_UTILIZATION: "HEAVY_UTILIZATION" = "HEAVY_UTILIZATION"

  inline def values: js.Array[PaymentOption] = js.Array(NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT, LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION)
}

type PlatformDifference = "HYPERVISOR" | "NETWORK_INTERFACE" | "STORAGE_INTERFACE" | "INSTANCE_STORE_AVAILABILITY" | "VIRTUALIZATION_TYPE"
object PlatformDifference {
  inline val HYPERVISOR: "HYPERVISOR" = "HYPERVISOR"
  inline val NETWORK_INTERFACE: "NETWORK_INTERFACE" = "NETWORK_INTERFACE"
  inline val STORAGE_INTERFACE: "STORAGE_INTERFACE" = "STORAGE_INTERFACE"
  inline val INSTANCE_STORE_AVAILABILITY: "INSTANCE_STORE_AVAILABILITY" = "INSTANCE_STORE_AVAILABILITY"
  inline val VIRTUALIZATION_TYPE: "VIRTUALIZATION_TYPE" = "VIRTUALIZATION_TYPE"

  inline def values: js.Array[PlatformDifference] = js.Array(HYPERVISOR, NETWORK_INTERFACE, STORAGE_INTERFACE, INSTANCE_STORE_AVAILABILITY, VIRTUALIZATION_TYPE)
}

type RecommendationTarget = "SAME_INSTANCE_FAMILY" | "CROSS_INSTANCE_FAMILY"
object RecommendationTarget {
  inline val SAME_INSTANCE_FAMILY: "SAME_INSTANCE_FAMILY" = "SAME_INSTANCE_FAMILY"
  inline val CROSS_INSTANCE_FAMILY: "CROSS_INSTANCE_FAMILY" = "CROSS_INSTANCE_FAMILY"

  inline def values: js.Array[RecommendationTarget] = js.Array(SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY)
}

type RightsizingType = "TERMINATE" | "MODIFY"
object RightsizingType {
  inline val TERMINATE: "TERMINATE" = "TERMINATE"
  inline val MODIFY: "MODIFY" = "MODIFY"

  inline def values: js.Array[RightsizingType] = js.Array(TERMINATE, MODIFY)
}

type SavingsPlansDataType = "ATTRIBUTES" | "UTILIZATION" | "AMORTIZED_COMMITMENT" | "SAVINGS"
object SavingsPlansDataType {
  inline val ATTRIBUTES: "ATTRIBUTES" = "ATTRIBUTES"
  inline val UTILIZATION: "UTILIZATION" = "UTILIZATION"
  inline val AMORTIZED_COMMITMENT: "AMORTIZED_COMMITMENT" = "AMORTIZED_COMMITMENT"
  inline val SAVINGS: "SAVINGS" = "SAVINGS"

  inline def values: js.Array[SavingsPlansDataType] = js.Array(ATTRIBUTES, UTILIZATION, AMORTIZED_COMMITMENT, SAVINGS)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

type SubscriberStatus = "CONFIRMED" | "DECLINED"
object SubscriberStatus {
  inline val CONFIRMED: "CONFIRMED" = "CONFIRMED"
  inline val DECLINED: "DECLINED" = "DECLINED"

  inline def values: js.Array[SubscriberStatus] = js.Array(CONFIRMED, DECLINED)
}

type SubscriberType = "EMAIL" | "SNS"
object SubscriberType {
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val SNS: "SNS" = "SNS"

  inline def values: js.Array[SubscriberType] = js.Array(EMAIL, SNS)
}

type SupportedSavingsPlansType = "COMPUTE_SP" | "EC2_INSTANCE_SP" | "SAGEMAKER_SP"
object SupportedSavingsPlansType {
  inline val COMPUTE_SP: "COMPUTE_SP" = "COMPUTE_SP"
  inline val EC2_INSTANCE_SP: "EC2_INSTANCE_SP" = "EC2_INSTANCE_SP"
  inline val SAGEMAKER_SP: "SAGEMAKER_SP" = "SAGEMAKER_SP"

  inline def values: js.Array[SupportedSavingsPlansType] = js.Array(COMPUTE_SP, EC2_INSTANCE_SP, SAGEMAKER_SP)
}

type TermInYears = "ONE_YEAR" | "THREE_YEARS"
object TermInYears {
  inline val ONE_YEAR: "ONE_YEAR" = "ONE_YEAR"
  inline val THREE_YEARS: "THREE_YEARS" = "THREE_YEARS"

  inline def values: js.Array[TermInYears] = js.Array(ONE_YEAR, THREE_YEARS)
}
