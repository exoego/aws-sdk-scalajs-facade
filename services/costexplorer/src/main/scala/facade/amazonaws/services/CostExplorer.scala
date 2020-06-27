package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object costexplorer {
  type AmortizedRecurringFee                        = String
  type AmortizedUpfrontFee                          = String
  type Arn                                          = String
  type AttributeType                                = String
  type AttributeValue                               = String
  type Attributes                                   = js.Dictionary[AttributeValue]
  type CostCategoryName                             = String
  type CostCategoryReferencesList                   = js.Array[CostCategoryReference]
  type CostCategoryRulesList                        = js.Array[CostCategoryRule]
  type CostCategoryValue                            = String
  type CoverageHoursPercentage                      = String
  type CoverageNormalizedUnitsPercentage            = String
  type CoveragesByTime                              = js.Array[CoverageByTime]
  type DimensionValuesWithAttributesList            = js.Array[DimensionValuesWithAttributes]
  type Entity                                       = String
  type Estimated                                    = Boolean
  type Expressions                                  = js.Array[Expression]
  type ForecastResultsByTime                        = js.Array[ForecastResult]
  type GenericBoolean                               = Boolean
  type GenericString                                = String
  type GroupDefinitionKey                           = String
  type GroupDefinitions                             = js.Array[GroupDefinition]
  type Groups                                       = js.Array[Group]
  type Key                                          = String
  type Keys                                         = js.Array[Key]
  type MaxResults                                   = Int
  type MetricAmount                                 = String
  type MetricName                                   = String
  type MetricNames                                  = js.Array[MetricName]
  type MetricUnit                                   = String
  type Metrics                                      = js.Dictionary[MetricValue]
  type NetRISavings                                 = String
  type NextPageToken                                = String
  type NonNegativeInteger                           = Int
  type OnDemandCost                                 = String
  type OnDemandCostOfRIHoursUsed                    = String
  type OnDemandHours                                = String
  type OnDemandNormalizedUnits                      = String
  type PageSize                                     = Int
  type PredictionIntervalLevel                      = Int
  type PurchasedHours                               = String
  type PurchasedUnits                               = String
  type ReservationCoverageGroups                    = js.Array[ReservationCoverageGroup]
  type ReservationGroupKey                          = String
  type ReservationGroupValue                        = String
  type ReservationPurchaseRecommendationDetails     = js.Array[ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations           = js.Array[ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups                 = js.Array[ReservationUtilizationGroup]
  type ReservedHours                                = String
  type ReservedNormalizedUnits                      = String
  type ResultsByTime                                = js.Array[ResultByTime]
  type RightsizingRecommendationList                = js.Array[RightsizingRecommendation]
  type SavingsPlanArn                               = String
  type SavingsPlansCoverages                        = js.Array[SavingsPlansCoverage]
  type SavingsPlansPurchaseRecommendationDetailList = js.Array[SavingsPlansPurchaseRecommendationDetail]
  type SavingsPlansUtilizationDetails               = js.Array[SavingsPlansUtilizationDetail]
  type SavingsPlansUtilizationsByTime               = js.Array[SavingsPlansUtilizationByTime]
  type SearchString                                 = String
  type TagKey                                       = String
  type TagList                                      = js.Array[Entity]
  type TagValuesList                                = js.Array[TagValues]
  type TargetInstancesList                          = js.Array[TargetInstance]
  type TotalActualHours                             = String
  type TotalActualUnits                             = String
  type TotalAmortizedFee                            = String
  type TotalPotentialRISavings                      = String
  type TotalRunningHours                            = String
  type TotalRunningNormalizedUnits                  = String
  type UnusedHours                                  = String
  type UnusedUnits                                  = String
  type UtilizationPercentage                        = String
  type UtilizationPercentageInUnits                 = String
  type UtilizationsByTime                           = js.Array[UtilizationByTime]
  type Value                                        = String
  type Values                                       = js.Array[Value]
  type YearMonthDay                                 = String
  type ZonedDateTime                                = String

  implicit final class CostExplorerOps(private val service: CostExplorer) extends AnyVal {

    @inline def createCostCategoryDefinitionFuture(
        params: CreateCostCategoryDefinitionRequest
    ): Future[CreateCostCategoryDefinitionResponse] = service.createCostCategoryDefinition(params).promise().toFuture
    @inline def deleteCostCategoryDefinitionFuture(
        params: DeleteCostCategoryDefinitionRequest
    ): Future[DeleteCostCategoryDefinitionResponse] = service.deleteCostCategoryDefinition(params).promise().toFuture
    @inline def describeCostCategoryDefinitionFuture(
        params: DescribeCostCategoryDefinitionRequest
    ): Future[DescribeCostCategoryDefinitionResponse] =
      service.describeCostCategoryDefinition(params).promise().toFuture
    @inline def getCostAndUsageFuture(params: GetCostAndUsageRequest): Future[GetCostAndUsageResponse] =
      service.getCostAndUsage(params).promise().toFuture
    @inline def getCostAndUsageWithResourcesFuture(
        params: GetCostAndUsageWithResourcesRequest
    ): Future[GetCostAndUsageWithResourcesResponse] = service.getCostAndUsageWithResources(params).promise().toFuture
    @inline def getCostForecastFuture(params: GetCostForecastRequest): Future[GetCostForecastResponse] =
      service.getCostForecast(params).promise().toFuture
    @inline def getDimensionValuesFuture(params: GetDimensionValuesRequest): Future[GetDimensionValuesResponse] =
      service.getDimensionValues(params).promise().toFuture
    @inline def getReservationCoverageFuture(
        params: GetReservationCoverageRequest
    ): Future[GetReservationCoverageResponse] = service.getReservationCoverage(params).promise().toFuture
    @inline def getReservationPurchaseRecommendationFuture(
        params: GetReservationPurchaseRecommendationRequest
    ): Future[GetReservationPurchaseRecommendationResponse] =
      service.getReservationPurchaseRecommendation(params).promise().toFuture
    @inline def getReservationUtilizationFuture(
        params: GetReservationUtilizationRequest
    ): Future[GetReservationUtilizationResponse] = service.getReservationUtilization(params).promise().toFuture
    @inline def getRightsizingRecommendationFuture(
        params: GetRightsizingRecommendationRequest
    ): Future[GetRightsizingRecommendationResponse] = service.getRightsizingRecommendation(params).promise().toFuture
    @inline def getSavingsPlansCoverageFuture(
        params: GetSavingsPlansCoverageRequest
    ): Future[GetSavingsPlansCoverageResponse] = service.getSavingsPlansCoverage(params).promise().toFuture
    @inline def getSavingsPlansPurchaseRecommendationFuture(
        params: GetSavingsPlansPurchaseRecommendationRequest
    ): Future[GetSavingsPlansPurchaseRecommendationResponse] =
      service.getSavingsPlansPurchaseRecommendation(params).promise().toFuture
    @inline def getSavingsPlansUtilizationDetailsFuture(
        params: GetSavingsPlansUtilizationDetailsRequest
    ): Future[GetSavingsPlansUtilizationDetailsResponse] =
      service.getSavingsPlansUtilizationDetails(params).promise().toFuture
    @inline def getSavingsPlansUtilizationFuture(
        params: GetSavingsPlansUtilizationRequest
    ): Future[GetSavingsPlansUtilizationResponse] = service.getSavingsPlansUtilization(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] =
      service.getTags(params).promise().toFuture
    @inline def getUsageForecastFuture(params: GetUsageForecastRequest): Future[GetUsageForecastResponse] =
      service.getUsageForecast(params).promise().toFuture
    @inline def listCostCategoryDefinitionsFuture(
        params: ListCostCategoryDefinitionsRequest
    ): Future[ListCostCategoryDefinitionsResponse] = service.listCostCategoryDefinitions(params).promise().toFuture
    @inline def updateCostCategoryDefinitionFuture(
        params: UpdateCostCategoryDefinitionRequest
    ): Future[UpdateCostCategoryDefinitionResponse] = service.updateCostCategoryDefinition(params).promise().toFuture
  }
}

package costexplorer {
  @js.native
  @JSImport("aws-sdk", "CostExplorer")
  class CostExplorer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCostCategoryDefinition(
        params: CreateCostCategoryDefinitionRequest
    ): Request[CreateCostCategoryDefinitionResponse] = js.native
    def deleteCostCategoryDefinition(
        params: DeleteCostCategoryDefinitionRequest
    ): Request[DeleteCostCategoryDefinitionResponse] = js.native
    def describeCostCategoryDefinition(
        params: DescribeCostCategoryDefinitionRequest
    ): Request[DescribeCostCategoryDefinitionResponse]                                    = js.native
    def getCostAndUsage(params: GetCostAndUsageRequest): Request[GetCostAndUsageResponse] = js.native
    def getCostAndUsageWithResources(
        params: GetCostAndUsageWithResourcesRequest
    ): Request[GetCostAndUsageWithResourcesResponse]                                               = js.native
    def getCostForecast(params: GetCostForecastRequest): Request[GetCostForecastResponse]          = js.native
    def getDimensionValues(params: GetDimensionValuesRequest): Request[GetDimensionValuesResponse] = js.native
    def getReservationCoverage(params: GetReservationCoverageRequest): Request[GetReservationCoverageResponse] =
      js.native
    def getReservationPurchaseRecommendation(
        params: GetReservationPurchaseRecommendationRequest
    ): Request[GetReservationPurchaseRecommendationResponse] = js.native
    def getReservationUtilization(
        params: GetReservationUtilizationRequest
    ): Request[GetReservationUtilizationResponse] = js.native
    def getRightsizingRecommendation(
        params: GetRightsizingRecommendationRequest
    ): Request[GetRightsizingRecommendationResponse] = js.native
    def getSavingsPlansCoverage(params: GetSavingsPlansCoverageRequest): Request[GetSavingsPlansCoverageResponse] =
      js.native
    def getSavingsPlansPurchaseRecommendation(
        params: GetSavingsPlansPurchaseRecommendationRequest
    ): Request[GetSavingsPlansPurchaseRecommendationResponse] = js.native
    def getSavingsPlansUtilization(
        params: GetSavingsPlansUtilizationRequest
    ): Request[GetSavingsPlansUtilizationResponse] = js.native
    def getSavingsPlansUtilizationDetails(
        params: GetSavingsPlansUtilizationDetailsRequest
    ): Request[GetSavingsPlansUtilizationDetailsResponse]                                    = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse]                            = js.native
    def getUsageForecast(params: GetUsageForecastRequest): Request[GetUsageForecastResponse] = js.native
    def listCostCategoryDefinitions(
        params: ListCostCategoryDefinitionsRequest
    ): Request[ListCostCategoryDefinitionsResponse] = js.native
    def updateCostCategoryDefinition(
        params: UpdateCostCategoryDefinitionRequest
    ): Request[UpdateCostCategoryDefinitionResponse] = js.native
  }

  @js.native
  sealed trait AccountScope extends js.Any
  object AccountScope extends js.Object {
    val PAYER  = "PAYER".asInstanceOf[AccountScope]
    val LINKED = "LINKED".asInstanceOf[AccountScope]

    val values = js.Object.freeze(js.Array(PAYER, LINKED))
  }

  @js.native
  sealed trait Context extends js.Any
  object Context extends js.Object {
    val COST_AND_USAGE = "COST_AND_USAGE".asInstanceOf[Context]
    val RESERVATIONS   = "RESERVATIONS".asInstanceOf[Context]
    val SAVINGS_PLANS  = "SAVINGS_PLANS".asInstanceOf[Context]

    val values = js.Object.freeze(js.Array(COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS))
  }

  /**
    * <important> <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost Categories is subject to the Beta Service Participation terms of the [[https://aws.amazon.com/service-terms/|AWS Service Terms]] (Section 1.10).</b> </i>
    *  </important> The structure of Cost Categories. This includes detailed metadata and the set of rules for the <code>CostCategory</code> object.
    */
  @js.native
  @Factory
  trait CostCategory extends js.Object {
    var CostCategoryArn: Arn
    var EffectiveStart: ZonedDateTime
    var Name: CostCategoryName
    var RuleVersion: CostCategoryRuleVersion
    var Rules: CostCategoryRulesList
    var EffectiveEnd: js.UndefOr[ZonedDateTime]
  }

  /**
    * <important> <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost Categories is subject to the Beta Service Participation terms of the [[https://aws.amazon.com/service-terms/|AWS Service Terms]] (Section 1.10).</b> </i>
    *  </important> A reference to a Cost Category containing only enough information to identify the Cost Category.
    *  You can use this information to retrieve the full Cost Category information using <code>DescribeCostCategory</code>.
    */
  @js.native
  @Factory
  trait CostCategoryReference extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveEnd: js.UndefOr[ZonedDateTime]
    var EffectiveStart: js.UndefOr[ZonedDateTime]
    var Name: js.UndefOr[CostCategoryName]
  }

  /**
    * <important> <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost Categories is subject to the Beta Service Participation terms of the [[https://aws.amazon.com/service-terms/|AWS Service Terms]] (Section 1.10).</b> </i>
    *  </important> Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value.
    */
  @js.native
  @Factory
  trait CostCategoryRule extends js.Object {
    var Rule: Expression
    var Value: CostCategoryValue
  }

  /**
    * The rule schema version in this particular Cost Category.
    */
  @js.native
  sealed trait CostCategoryRuleVersion extends js.Any
  object CostCategoryRuleVersion extends js.Object {
    val `CostCategoryExpression.v1` = "CostCategoryExpression.v1".asInstanceOf[CostCategoryRuleVersion]

    val values = js.Object.freeze(js.Array(`CostCategoryExpression.v1`))
  }

  /**
    * <important> <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost Categories is subject to the Beta Service Participation terms of the [[https://aws.amazon.com/service-terms/|AWS Service Terms]] (Section 1.10).</b> </i>
    *  </important> The values that are available for Cost Categories.
    */
  @js.native
  @Factory
  trait CostCategoryValues extends js.Object {
    var Key: js.UndefOr[CostCategoryName]
    var Values: js.UndefOr[Values]
  }

  /**
    * The amount of instance usage that a reservation covered.
    */
  @js.native
  @Factory
  trait Coverage extends js.Object {
    var CoverageCost: js.UndefOr[CoverageCost]
    var CoverageHours: js.UndefOr[CoverageHours]
    var CoverageNormalizedUnits: js.UndefOr[CoverageNormalizedUnits]
  }

  /**
    * Reservation coverage for a specified period, in hours.
    */
  @js.native
  @Factory
  trait CoverageByTime extends js.Object {
    var Groups: js.UndefOr[ReservationCoverageGroups]
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[Coverage]
  }

  /**
    * How much it cost to run an instance.
    */
  @js.native
  @Factory
  trait CoverageCost extends js.Object {
    var OnDemandCost: js.UndefOr[OnDemandCost]
  }

  /**
    * How long a running instance either used a reservation or was On-Demand.
    */
  @js.native
  @Factory
  trait CoverageHours extends js.Object {
    var CoverageHoursPercentage: js.UndefOr[CoverageHoursPercentage]
    var OnDemandHours: js.UndefOr[OnDemandHours]
    var ReservedHours: js.UndefOr[ReservedHours]
    var TotalRunningHours: js.UndefOr[TotalRunningHours]
  }

  /**
    * The amount of instance usage, in normalized units. Normalized units enable you to see your EC2 usage for multiple sizes of instances in a uniform way. For example, suppose you run an xlarge instance and a 2xlarge instance. If you run both instances for the same amount of time, the 2xlarge instance uses twice as much of your reservation as the xlarge instance, even though both instances show only one instance-hour. Using normalized units instead of instance-hours, the xlarge instance used 8 normalized units, and the 2xlarge instance used 16 normalized units.
    *  For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html|Modifying Reserved Instances]] in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
    */
  @js.native
  @Factory
  trait CoverageNormalizedUnits extends js.Object {
    var CoverageNormalizedUnitsPercentage: js.UndefOr[CoverageNormalizedUnitsPercentage]
    var OnDemandNormalizedUnits: js.UndefOr[OnDemandNormalizedUnits]
    var ReservedNormalizedUnits: js.UndefOr[ReservedNormalizedUnits]
    var TotalRunningNormalizedUnits: js.UndefOr[TotalRunningNormalizedUnits]
  }

  @js.native
  @Factory
  trait CreateCostCategoryDefinitionRequest extends js.Object {
    var Name: CostCategoryName
    var RuleVersion: CostCategoryRuleVersion
    var Rules: CostCategoryRulesList
  }

  @js.native
  @Factory
  trait CreateCostCategoryDefinitionResponse extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveStart: js.UndefOr[ZonedDateTime]
  }

  /**
    * Context about the current instance.
    */
  @js.native
  @Factory
  trait CurrentInstance extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var MonthlyCost: js.UndefOr[GenericString]
    var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString]
    var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString]
    var ResourceDetails: js.UndefOr[ResourceDetails]
    var ResourceId: js.UndefOr[GenericString]
    var ResourceUtilization: js.UndefOr[ResourceUtilization]
    var SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagValuesList]
    var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString]
  }

  /**
    * The time period that you want the usage and costs for.
    */
  @js.native
  @Factory
  trait DateInterval extends js.Object {
    var End: YearMonthDay
    var Start: YearMonthDay
  }

  @js.native
  @Factory
  trait DeleteCostCategoryDefinitionRequest extends js.Object {
    var CostCategoryArn: Arn
  }

  @js.native
  @Factory
  trait DeleteCostCategoryDefinitionResponse extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveEnd: js.UndefOr[ZonedDateTime]
  }

  @js.native
  @Factory
  trait DescribeCostCategoryDefinitionRequest extends js.Object {
    var CostCategoryArn: Arn
    var EffectiveOn: js.UndefOr[ZonedDateTime]
  }

  @js.native
  @Factory
  trait DescribeCostCategoryDefinitionResponse extends js.Object {
    var CostCategory: js.UndefOr[CostCategory]
  }

  @js.native
  sealed trait Dimension extends js.Any
  object Dimension extends js.Object {
    val AZ                   = "AZ".asInstanceOf[Dimension]
    val INSTANCE_TYPE        = "INSTANCE_TYPE".asInstanceOf[Dimension]
    val LINKED_ACCOUNT       = "LINKED_ACCOUNT".asInstanceOf[Dimension]
    val OPERATION            = "OPERATION".asInstanceOf[Dimension]
    val PURCHASE_TYPE        = "PURCHASE_TYPE".asInstanceOf[Dimension]
    val REGION               = "REGION".asInstanceOf[Dimension]
    val SERVICE              = "SERVICE".asInstanceOf[Dimension]
    val USAGE_TYPE           = "USAGE_TYPE".asInstanceOf[Dimension]
    val USAGE_TYPE_GROUP     = "USAGE_TYPE_GROUP".asInstanceOf[Dimension]
    val RECORD_TYPE          = "RECORD_TYPE".asInstanceOf[Dimension]
    val OPERATING_SYSTEM     = "OPERATING_SYSTEM".asInstanceOf[Dimension]
    val TENANCY              = "TENANCY".asInstanceOf[Dimension]
    val SCOPE                = "SCOPE".asInstanceOf[Dimension]
    val PLATFORM             = "PLATFORM".asInstanceOf[Dimension]
    val SUBSCRIPTION_ID      = "SUBSCRIPTION_ID".asInstanceOf[Dimension]
    val LEGAL_ENTITY_NAME    = "LEGAL_ENTITY_NAME".asInstanceOf[Dimension]
    val DEPLOYMENT_OPTION    = "DEPLOYMENT_OPTION".asInstanceOf[Dimension]
    val DATABASE_ENGINE      = "DATABASE_ENGINE".asInstanceOf[Dimension]
    val CACHE_ENGINE         = "CACHE_ENGINE".asInstanceOf[Dimension]
    val INSTANCE_TYPE_FAMILY = "INSTANCE_TYPE_FAMILY".asInstanceOf[Dimension]
    val BILLING_ENTITY       = "BILLING_ENTITY".asInstanceOf[Dimension]
    val RESERVATION_ID       = "RESERVATION_ID".asInstanceOf[Dimension]
    val RESOURCE_ID          = "RESOURCE_ID".asInstanceOf[Dimension]
    val RIGHTSIZING_TYPE     = "RIGHTSIZING_TYPE".asInstanceOf[Dimension]
    val SAVINGS_PLANS_TYPE   = "SAVINGS_PLANS_TYPE".asInstanceOf[Dimension]
    val SAVINGS_PLAN_ARN     = "SAVINGS_PLAN_ARN".asInstanceOf[Dimension]
    val PAYMENT_OPTION       = "PAYMENT_OPTION".asInstanceOf[Dimension]

    val values = js.Object.freeze(
      js.Array(
        AZ,
        INSTANCE_TYPE,
        LINKED_ACCOUNT,
        OPERATION,
        PURCHASE_TYPE,
        REGION,
        SERVICE,
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
        PAYMENT_OPTION
      )
    )
  }

  /**
    * The metadata that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.
    */
  @js.native
  @Factory
  trait DimensionValues extends js.Object {
    var Key: js.UndefOr[Dimension]
    var Values: js.UndefOr[Values]
  }

  /**
    * The metadata of a specific type that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.
    */
  @js.native
  @Factory
  trait DimensionValuesWithAttributes extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Value: js.UndefOr[Value]
  }

  /**
    * Details about the Amazon EC2 instances that AWS recommends that you purchase.
    */
  @js.native
  @Factory
  trait EC2InstanceDetails extends js.Object {
    var AvailabilityZone: js.UndefOr[GenericString]
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var InstanceType: js.UndefOr[GenericString]
    var Platform: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
    var Tenancy: js.UndefOr[GenericString]
  }

  /**
    * Details on the Amazon EC2 Resource.
    */
  @js.native
  @Factory
  trait EC2ResourceDetails extends js.Object {
    var HourlyOnDemandRate: js.UndefOr[GenericString]
    var InstanceType: js.UndefOr[GenericString]
    var Memory: js.UndefOr[GenericString]
    var NetworkPerformance: js.UndefOr[GenericString]
    var Platform: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var Sku: js.UndefOr[GenericString]
    var Storage: js.UndefOr[GenericString]
    var Vcpu: js.UndefOr[GenericString]
  }

  /**
    * Utilization metrics of the instance.
    */
  @js.native
  @Factory
  trait EC2ResourceUtilization extends js.Object {
    var MaxCpuUtilizationPercentage: js.UndefOr[GenericString]
    var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString]
    var MaxStorageUtilizationPercentage: js.UndefOr[GenericString]
  }

  /**
    * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
    */
  @js.native
  @Factory
  trait EC2Specification extends js.Object {
    var OfferingClass: js.UndefOr[OfferingClass]
  }

  /**
    * Details about the Amazon ES instances that AWS recommends that you purchase.
    */
  @js.native
  @Factory
  trait ESInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var InstanceClass: js.UndefOr[GenericString]
    var InstanceSize: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  /**
    * Details about the Amazon ElastiCache instances that AWS recommends that you purchase.
    */
  @js.native
  @Factory
  trait ElastiCacheInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var NodeType: js.UndefOr[GenericString]
    var ProductDescription: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  /**
    * Use <code>Expression</code> to filter by cost or by usage. There are two patterns:
    * * Simple dimension values - You can set the dimension name and values for the filters that you plan to use. For example, you can filter for <code>REGION==us-east-1 OR REGION==us-west-1</code>. The <code>Expression</code> for that looks like this:
    *  <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
    *  The list of dimension values are OR'd together to retrieve cost or usage data. You can create <code>Expression</code> and <code>DimensionValues</code> objects using either <code>with*</code> methods or <code>set*</code> methods in multiple lines.
    *  <li> Compound dimension values with logical operations - You can use multiple <code>Expression</code> types and the logical operators <code>AND/OR/NOT</code> to create a list of one or more <code>Expression</code> objects. This allows you to filter on more advanced options. For example, you can filter on <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>. The <code>Expression</code> for that looks like this:
    *  <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
    *
    * '''Note:'''Because each <code>Expression</code> can have only one operator, the service returns an error if more than one is specified. The following example shows an <code>Expression</code> object that creates an error.
    * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
    *  </li>'''Note:'''For <code>GetRightsizingRecommendation</code> action, a combination of OR and NOT is not supported. OR is not supported between different dimensions, or dimensions and tags. NOT operators aren't supported. Dimensions are also limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
    */
  @js.native
  @Factory
  trait Expression extends js.Object {
    var And: js.UndefOr[Expressions]
    var CostCategories: js.UndefOr[CostCategoryValues]
    var Dimensions: js.UndefOr[DimensionValues]
    var Not: js.UndefOr[Expression]
    var Or: js.UndefOr[Expressions]
    var Tags: js.UndefOr[TagValues]
  }

  /**
    * The forecast created for your query.
    */
  @js.native
  @Factory
  trait ForecastResult extends js.Object {
    var MeanValue: js.UndefOr[GenericString]
    var PredictionIntervalLowerBound: js.UndefOr[GenericString]
    var PredictionIntervalUpperBound: js.UndefOr[GenericString]
    var TimePeriod: js.UndefOr[DateInterval]
  }

  @js.native
  @Factory
  trait GetCostAndUsageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetCostAndUsageResponse extends js.Object {
    var GroupDefinitions: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
    var ResultsByTime: js.UndefOr[ResultsByTime]
  }

  @js.native
  @Factory
  trait GetCostAndUsageWithResourcesRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetCostAndUsageWithResourcesResponse extends js.Object {
    var GroupDefinitions: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
    var ResultsByTime: js.UndefOr[ResultsByTime]
  }

  @js.native
  @Factory
  trait GetCostForecastRequest extends js.Object {
    var Granularity: Granularity
    var Metric: Metric
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel]
  }

  @js.native
  @Factory
  trait GetCostForecastResponse extends js.Object {
    var ForecastResultsByTime: js.UndefOr[ForecastResultsByTime]
    var Total: js.UndefOr[MetricValue]
  }

  @js.native
  @Factory
  trait GetDimensionValuesRequest extends js.Object {
    var Dimension: Dimension
    var TimePeriod: DateInterval
    var Context: js.UndefOr[Context]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
  }

  @js.native
  @Factory
  trait GetDimensionValuesResponse extends js.Object {
    var DimensionValues: DimensionValuesWithAttributesList
    var ReturnSize: PageSize
    var TotalSize: PageSize
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  /**
    * You can use the following request parameters to query for how much of your instance usage a reservation covered.
    */
  @js.native
  @Factory
  trait GetReservationCoverageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetReservationCoverageResponse extends js.Object {
    var CoveragesByTime: CoveragesByTime
    var NextPageToken: js.UndefOr[NextPageToken]
    var Total: js.UndefOr[Coverage]
  }

  @js.native
  @Factory
  trait GetReservationPurchaseRecommendationRequest extends js.Object {
    var Service: GenericString
    var AccountId: js.UndefOr[GenericString]
    var AccountScope: js.UndefOr[AccountScope]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var NextPageToken: js.UndefOr[NextPageToken]
    var PageSize: js.UndefOr[NonNegativeInteger]
    var PaymentOption: js.UndefOr[PaymentOption]
    var ServiceSpecification: js.UndefOr[ServiceSpecification]
    var TermInYears: js.UndefOr[TermInYears]
  }

  @js.native
  @Factory
  trait GetReservationPurchaseRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var Recommendations: js.UndefOr[ReservationPurchaseRecommendations]
  }

  @js.native
  @Factory
  trait GetReservationUtilizationRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetReservationUtilizationResponse extends js.Object {
    var UtilizationsByTime: UtilizationsByTime
    var NextPageToken: js.UndefOr[NextPageToken]
    var Total: js.UndefOr[ReservationAggregates]
  }

  @js.native
  @Factory
  trait GetRightsizingRecommendationRequest extends js.Object {
    var Service: GenericString
    var Filter: js.UndefOr[Expression]
    var NextPageToken: js.UndefOr[NextPageToken]
    var PageSize: js.UndefOr[NonNegativeInteger]
  }

  @js.native
  @Factory
  trait GetRightsizingRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[RightsizingRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList]
    var Summary: js.UndefOr[RightsizingRecommendationSummary]
  }

  @js.native
  @Factory
  trait GetSavingsPlansCoverageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var MaxResults: js.UndefOr[MaxResults]
    var Metrics: js.UndefOr[MetricNames]
    var NextToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetSavingsPlansCoverageResponse extends js.Object {
    var SavingsPlansCoverages: SavingsPlansCoverages
    var NextToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetSavingsPlansPurchaseRecommendationRequest extends js.Object {
    var LookbackPeriodInDays: LookbackPeriodInDays
    var PaymentOption: PaymentOption
    var SavingsPlansType: SupportedSavingsPlansType
    var TermInYears: TermInYears
    var NextPageToken: js.UndefOr[NextPageToken]
    var PageSize: js.UndefOr[NonNegativeInteger]
  }

  @js.native
  @Factory
  trait GetSavingsPlansPurchaseRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SavingsPlansPurchaseRecommendation: js.UndefOr[SavingsPlansPurchaseRecommendation]
  }

  @js.native
  @Factory
  trait GetSavingsPlansUtilizationDetailsRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetSavingsPlansUtilizationDetailsResponse extends js.Object {
    var SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails
    var TimePeriod: DateInterval
    var NextToken: js.UndefOr[NextPageToken]
    var Total: js.UndefOr[SavingsPlansUtilizationAggregates]
  }

  @js.native
  @Factory
  trait GetSavingsPlansUtilizationRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
  }

  @js.native
  @Factory
  trait GetSavingsPlansUtilizationResponse extends js.Object {
    var Total: SavingsPlansUtilizationAggregates
    var SavingsPlansUtilizationsByTime: js.UndefOr[SavingsPlansUtilizationsByTime]
  }

  @js.native
  @Factory
  trait GetTagsRequest extends js.Object {
    var TimePeriod: DateInterval
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
    var TagKey: js.UndefOr[TagKey]
  }

  @js.native
  @Factory
  trait GetTagsResponse extends js.Object {
    var ReturnSize: PageSize
    var Tags: TagList
    var TotalSize: PageSize
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait GetUsageForecastRequest extends js.Object {
    var Granularity: Granularity
    var Metric: Metric
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel]
  }

  @js.native
  @Factory
  trait GetUsageForecastResponse extends js.Object {
    var ForecastResultsByTime: js.UndefOr[ForecastResultsByTime]
    var Total: js.UndefOr[MetricValue]
  }

  @js.native
  sealed trait Granularity extends js.Any
  object Granularity extends js.Object {
    val DAILY   = "DAILY".asInstanceOf[Granularity]
    val MONTHLY = "MONTHLY".asInstanceOf[Granularity]
    val HOURLY  = "HOURLY".asInstanceOf[Granularity]

    val values = js.Object.freeze(js.Array(DAILY, MONTHLY, HOURLY))
  }

  /**
    * One level of grouped data in the results.
    */
  @js.native
  @Factory
  trait Group extends js.Object {
    var Keys: js.UndefOr[Keys]
    var Metrics: js.UndefOr[Metrics]
  }

  /**
    * Represents a group when you specify a group by criteria or in the response to a query with a specific grouping.
    */
  @js.native
  @Factory
  trait GroupDefinition extends js.Object {
    var Key: js.UndefOr[GroupDefinitionKey]
    var Type: js.UndefOr[GroupDefinitionType]
  }

  @js.native
  sealed trait GroupDefinitionType extends js.Any
  object GroupDefinitionType extends js.Object {
    val DIMENSION     = "DIMENSION".asInstanceOf[GroupDefinitionType]
    val TAG           = "TAG".asInstanceOf[GroupDefinitionType]
    val COST_CATEGORY = "COST_CATEGORY".asInstanceOf[GroupDefinitionType]

    val values = js.Object.freeze(js.Array(DIMENSION, TAG, COST_CATEGORY))
  }

  /**
    * Details about the instances that AWS recommends that you purchase.
    */
  @js.native
  @Factory
  trait InstanceDetails extends js.Object {
    var EC2InstanceDetails: js.UndefOr[EC2InstanceDetails]
    var ESInstanceDetails: js.UndefOr[ESInstanceDetails]
    var ElastiCacheInstanceDetails: js.UndefOr[ElastiCacheInstanceDetails]
    var RDSInstanceDetails: js.UndefOr[RDSInstanceDetails]
    var RedshiftInstanceDetails: js.UndefOr[RedshiftInstanceDetails]
  }

  @js.native
  @Factory
  trait ListCostCategoryDefinitionsRequest extends js.Object {
    var EffectiveOn: js.UndefOr[ZonedDateTime]
    var NextToken: js.UndefOr[NextPageToken]
  }

  @js.native
  @Factory
  trait ListCostCategoryDefinitionsResponse extends js.Object {
    var CostCategoryReferences: js.UndefOr[CostCategoryReferencesList]
    var NextToken: js.UndefOr[NextPageToken]
  }

  @js.native
  sealed trait LookbackPeriodInDays extends js.Any
  object LookbackPeriodInDays extends js.Object {
    val SEVEN_DAYS  = "SEVEN_DAYS".asInstanceOf[LookbackPeriodInDays]
    val THIRTY_DAYS = "THIRTY_DAYS".asInstanceOf[LookbackPeriodInDays]
    val SIXTY_DAYS  = "SIXTY_DAYS".asInstanceOf[LookbackPeriodInDays]

    val values = js.Object.freeze(js.Array(SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS))
  }

  @js.native
  sealed trait Metric extends js.Any
  object Metric extends js.Object {
    val BLENDED_COST            = "BLENDED_COST".asInstanceOf[Metric]
    val UNBLENDED_COST          = "UNBLENDED_COST".asInstanceOf[Metric]
    val AMORTIZED_COST          = "AMORTIZED_COST".asInstanceOf[Metric]
    val NET_UNBLENDED_COST      = "NET_UNBLENDED_COST".asInstanceOf[Metric]
    val NET_AMORTIZED_COST      = "NET_AMORTIZED_COST".asInstanceOf[Metric]
    val USAGE_QUANTITY          = "USAGE_QUANTITY".asInstanceOf[Metric]
    val NORMALIZED_USAGE_AMOUNT = "NORMALIZED_USAGE_AMOUNT".asInstanceOf[Metric]

    val values = js.Object.freeze(
      js.Array(
        BLENDED_COST,
        UNBLENDED_COST,
        AMORTIZED_COST,
        NET_UNBLENDED_COST,
        NET_AMORTIZED_COST,
        USAGE_QUANTITY,
        NORMALIZED_USAGE_AMOUNT
      )
    )
  }

  /**
    * The aggregated value for a metric.
    */
  @js.native
  @Factory
  trait MetricValue extends js.Object {
    var Amount: js.UndefOr[MetricAmount]
    var Unit: js.UndefOr[MetricUnit]
  }

  /**
    * Details on the modification recommendation.
    */
  @js.native
  @Factory
  trait ModifyRecommendationDetail extends js.Object {
    var TargetInstances: js.UndefOr[TargetInstancesList]
  }

  @js.native
  sealed trait OfferingClass extends js.Any
  object OfferingClass extends js.Object {
    val STANDARD    = "STANDARD".asInstanceOf[OfferingClass]
    val CONVERTIBLE = "CONVERTIBLE".asInstanceOf[OfferingClass]

    val values = js.Object.freeze(js.Array(STANDARD, CONVERTIBLE))
  }

  @js.native
  sealed trait PaymentOption extends js.Any
  object PaymentOption extends js.Object {
    val NO_UPFRONT         = "NO_UPFRONT".asInstanceOf[PaymentOption]
    val PARTIAL_UPFRONT    = "PARTIAL_UPFRONT".asInstanceOf[PaymentOption]
    val ALL_UPFRONT        = "ALL_UPFRONT".asInstanceOf[PaymentOption]
    val LIGHT_UTILIZATION  = "LIGHT_UTILIZATION".asInstanceOf[PaymentOption]
    val MEDIUM_UTILIZATION = "MEDIUM_UTILIZATION".asInstanceOf[PaymentOption]
    val HEAVY_UTILIZATION  = "HEAVY_UTILIZATION".asInstanceOf[PaymentOption]

    val values = js.Object.freeze(
      js.Array(NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT, LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION)
    )
  }

  /**
    * Details about the Amazon RDS instances that AWS recommends that you purchase.
    */
  @js.native
  @Factory
  trait RDSInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var DatabaseEdition: js.UndefOr[GenericString]
    var DatabaseEngine: js.UndefOr[GenericString]
    var DeploymentOption: js.UndefOr[GenericString]
    var Family: js.UndefOr[GenericString]
    var InstanceType: js.UndefOr[GenericString]
    var LicenseModel: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  /**
    * Details about the Amazon Redshift instances that AWS recommends that you purchase.
    */
  @js.native
  @Factory
  trait RedshiftInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var NodeType: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  /**
    * The aggregated numbers for your reservation usage.
    */
  @js.native
  @Factory
  trait ReservationAggregates extends js.Object {
    var AmortizedRecurringFee: js.UndefOr[AmortizedRecurringFee]
    var AmortizedUpfrontFee: js.UndefOr[AmortizedUpfrontFee]
    var NetRISavings: js.UndefOr[NetRISavings]
    var OnDemandCostOfRIHoursUsed: js.UndefOr[OnDemandCostOfRIHoursUsed]
    var PurchasedHours: js.UndefOr[PurchasedHours]
    var PurchasedUnits: js.UndefOr[PurchasedUnits]
    var TotalActualHours: js.UndefOr[TotalActualHours]
    var TotalActualUnits: js.UndefOr[TotalActualUnits]
    var TotalAmortizedFee: js.UndefOr[TotalAmortizedFee]
    var TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings]
    var UnusedHours: js.UndefOr[UnusedHours]
    var UnusedUnits: js.UndefOr[UnusedUnits]
    var UtilizationPercentage: js.UndefOr[UtilizationPercentage]
    var UtilizationPercentageInUnits: js.UndefOr[UtilizationPercentageInUnits]
  }

  /**
    * A group of reservations that share a set of attributes.
    */
  @js.native
  @Factory
  trait ReservationCoverageGroup extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Coverage: js.UndefOr[Coverage]
  }

  /**
    * A specific reservation that AWS recommends for purchase.
    */
  @js.native
  @Factory
  trait ReservationPurchaseRecommendation extends js.Object {
    var AccountScope: js.UndefOr[AccountScope]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var PaymentOption: js.UndefOr[PaymentOption]
    var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails]
    var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary]
    var ServiceSpecification: js.UndefOr[ServiceSpecification]
    var TermInYears: js.UndefOr[TermInYears]
  }

  /**
    * Details about your recommended reservation purchase.
    */
  @js.native
  @Factory
  trait ReservationPurchaseRecommendationDetail extends js.Object {
    var AccountId: js.UndefOr[GenericString]
    var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString]
    var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString]
    var AverageUtilization: js.UndefOr[GenericString]
    var CurrencyCode: js.UndefOr[GenericString]
    var EstimatedBreakEvenInMonths: js.UndefOr[GenericString]
    var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString]
    var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString]
    var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString]
    var InstanceDetails: js.UndefOr[InstanceDetails]
    var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString]
    var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString]
    var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString]
    var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString]
    var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString]
    var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString]
    var RecurringStandardMonthlyCost: js.UndefOr[GenericString]
    var UpfrontCost: js.UndefOr[GenericString]
  }

  /**
    * Information about this specific recommendation, such as the time stamp for when AWS made a specific recommendation.
    */
  @js.native
  @Factory
  trait ReservationPurchaseRecommendationMetadata extends js.Object {
    var GenerationTimestamp: js.UndefOr[GenericString]
    var RecommendationId: js.UndefOr[GenericString]
  }

  /**
    * A summary about this recommendation, such as the currency code, the amount that AWS estimates that you could save, and the total amount of reservation to purchase.
    */
  @js.native
  @Factory
  trait ReservationPurchaseRecommendationSummary extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString]
  }

  /**
    * A group of reservations that share a set of attributes.
    */
  @js.native
  @Factory
  trait ReservationUtilizationGroup extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Key: js.UndefOr[ReservationGroupKey]
    var Utilization: js.UndefOr[ReservationAggregates]
    var Value: js.UndefOr[ReservationGroupValue]
  }

  /**
    * Details on the resource.
    */
  @js.native
  @Factory
  trait ResourceDetails extends js.Object {
    var EC2ResourceDetails: js.UndefOr[EC2ResourceDetails]
  }

  /**
    * Resource utilization of current resource.
    */
  @js.native
  @Factory
  trait ResourceUtilization extends js.Object {
    var EC2ResourceUtilization: js.UndefOr[EC2ResourceUtilization]
  }

  /**
    * The result that is associated with a time period.
    */
  @js.native
  @Factory
  trait ResultByTime extends js.Object {
    var Estimated: js.UndefOr[Estimated]
    var Groups: js.UndefOr[Groups]
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[Metrics]
  }

  /**
    * Recommendations to rightsize resources.
    */
  @js.native
  @Factory
  trait RightsizingRecommendation extends js.Object {
    var AccountId: js.UndefOr[GenericString]
    var CurrentInstance: js.UndefOr[CurrentInstance]
    var ModifyRecommendationDetail: js.UndefOr[ModifyRecommendationDetail]
    var RightsizingType: js.UndefOr[RightsizingType]
    var TerminateRecommendationDetail: js.UndefOr[TerminateRecommendationDetail]
  }

  /**
    * Metadata for this recommendation set.
    */
  @js.native
  @Factory
  trait RightsizingRecommendationMetadata extends js.Object {
    var GenerationTimestamp: js.UndefOr[GenericString]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var RecommendationId: js.UndefOr[GenericString]
  }

  /**
    * Summary of rightsizing recommendations
    */
  @js.native
  @Factory
  trait RightsizingRecommendationSummary extends js.Object {
    var EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString]
    var SavingsCurrencyCode: js.UndefOr[GenericString]
    var SavingsPercentage: js.UndefOr[GenericString]
    var TotalRecommendationCount: js.UndefOr[GenericString]
  }

  @js.native
  sealed trait RightsizingType extends js.Any
  object RightsizingType extends js.Object {
    val TERMINATE = "TERMINATE".asInstanceOf[RightsizingType]
    val MODIFY    = "MODIFY".asInstanceOf[RightsizingType]

    val values = js.Object.freeze(js.Array(TERMINATE, MODIFY))
  }

  /**
    * The amortized amount of Savings Plans purchased in a specific account during a specific time interval.
    */
  @js.native
  @Factory
  trait SavingsPlansAmortizedCommitment extends js.Object {
    var AmortizedRecurringCommitment: js.UndefOr[GenericString]
    var AmortizedUpfrontCommitment: js.UndefOr[GenericString]
    var TotalAmortizedCommitment: js.UndefOr[GenericString]
  }

  /**
    * The amount of Savings Plans eligible usage that is covered by Savings Plans. All calculations consider the On-Demand equivalent of your Savings Plans usage.
    */
  @js.native
  @Factory
  trait SavingsPlansCoverage extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Coverage: js.UndefOr[SavingsPlansCoverageData]
    var TimePeriod: js.UndefOr[DateInterval]
  }

  /**
    * Specific coverage percentage, On-Demand costs, and spend covered by Savings Plans, and total Savings Plans costs for an account.
    */
  @js.native
  @Factory
  trait SavingsPlansCoverageData extends js.Object {
    var CoveragePercentage: js.UndefOr[GenericString]
    var OnDemandCost: js.UndefOr[GenericString]
    var SpendCoveredBySavingsPlans: js.UndefOr[GenericString]
    var TotalCost: js.UndefOr[GenericString]
  }

  /**
    * Attribute details on a specific Savings Plan.
    */
  @js.native
  @Factory
  trait SavingsPlansDetails extends js.Object {
    var InstanceFamily: js.UndefOr[GenericString]
    var OfferingId: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
  }

  /**
    * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
    */
  @js.native
  @Factory
  trait SavingsPlansPurchaseRecommendation extends js.Object {
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var PaymentOption: js.UndefOr[PaymentOption]
    var SavingsPlansPurchaseRecommendationDetails: js.UndefOr[SavingsPlansPurchaseRecommendationDetailList]
    var SavingsPlansPurchaseRecommendationSummary: js.UndefOr[SavingsPlansPurchaseRecommendationSummary]
    var SavingsPlansType: js.UndefOr[SupportedSavingsPlansType]
    var TermInYears: js.UndefOr[TermInYears]
  }

  /**
    * Details for your recommended Savings Plans.
    */
  @js.native
  @Factory
  trait SavingsPlansPurchaseRecommendationDetail extends js.Object {
    var AccountId: js.UndefOr[GenericString]
    var CurrencyCode: js.UndefOr[GenericString]
    var CurrentAverageHourlyOnDemandSpend: js.UndefOr[GenericString]
    var CurrentMaximumHourlyOnDemandSpend: js.UndefOr[GenericString]
    var CurrentMinimumHourlyOnDemandSpend: js.UndefOr[GenericString]
    var EstimatedAverageUtilization: js.UndefOr[GenericString]
    var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var EstimatedOnDemandCost: js.UndefOr[GenericString]
    var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString]
    var EstimatedROI: js.UndefOr[GenericString]
    var EstimatedSPCost: js.UndefOr[GenericString]
    var EstimatedSavingsAmount: js.UndefOr[GenericString]
    var EstimatedSavingsPercentage: js.UndefOr[GenericString]
    var HourlyCommitmentToPurchase: js.UndefOr[GenericString]
    var SavingsPlansDetails: js.UndefOr[SavingsPlansDetails]
    var UpfrontCost: js.UndefOr[GenericString]
  }

  /**
    * Metadata about your Savings Plans Purchase Recommendations.
    */
  @js.native
  @Factory
  trait SavingsPlansPurchaseRecommendationMetadata extends js.Object {
    var GenerationTimestamp: js.UndefOr[GenericString]
    var RecommendationId: js.UndefOr[GenericString]
  }

  /**
    * Summary metrics for your Savings Plans Purchase Recommendations.
    */
  @js.native
  @Factory
  trait SavingsPlansPurchaseRecommendationSummary extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var CurrentOnDemandSpend: js.UndefOr[GenericString]
    var DailyCommitmentToPurchase: js.UndefOr[GenericString]
    var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString]
    var EstimatedROI: js.UndefOr[GenericString]
    var EstimatedSavingsAmount: js.UndefOr[GenericString]
    var EstimatedSavingsPercentage: js.UndefOr[GenericString]
    var EstimatedTotalCost: js.UndefOr[GenericString]
    var HourlyCommitmentToPurchase: js.UndefOr[GenericString]
    var TotalRecommendationCount: js.UndefOr[GenericString]
  }

  /**
    * The amount of savings you're accumulating, against the public On-Demand rate of the usage accrued in an account.
    */
  @js.native
  @Factory
  trait SavingsPlansSavings extends js.Object {
    var NetSavings: js.UndefOr[GenericString]
    var OnDemandCostEquivalent: js.UndefOr[GenericString]
  }

  /**
    * The measurement of how well you are using your existing Savings Plans.
    */
  @js.native
  @Factory
  trait SavingsPlansUtilization extends js.Object {
    var TotalCommitment: js.UndefOr[GenericString]
    var UnusedCommitment: js.UndefOr[GenericString]
    var UsedCommitment: js.UndefOr[GenericString]
    var UtilizationPercentage: js.UndefOr[GenericString]
  }

  /**
    * The aggregated utilization metrics for your Savings Plans usage.
    */
  @js.native
  @Factory
  trait SavingsPlansUtilizationAggregates extends js.Object {
    var Utilization: SavingsPlansUtilization
    var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment]
    var Savings: js.UndefOr[SavingsPlansSavings]
  }

  /**
    * The amount of Savings Plans utilization, in hours.
    */
  @js.native
  @Factory
  trait SavingsPlansUtilizationByTime extends js.Object {
    var TimePeriod: DateInterval
    var Utilization: SavingsPlansUtilization
    var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment]
    var Savings: js.UndefOr[SavingsPlansSavings]
  }

  /**
    * A single daily or monthly Savings Plans utilization rate, and details for your account. Master accounts in an organization have access to member accounts. You can use <code>GetDimensionValues</code> to determine the possible dimension values.
    */
  @js.native
  @Factory
  trait SavingsPlansUtilizationDetail extends js.Object {
    var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment]
    var Attributes: js.UndefOr[Attributes]
    var Savings: js.UndefOr[SavingsPlansSavings]
    var SavingsPlanArn: js.UndefOr[SavingsPlanArn]
    var Utilization: js.UndefOr[SavingsPlansUtilization]
  }

  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  @js.native
  @Factory
  trait ServiceSpecification extends js.Object {
    var EC2Specification: js.UndefOr[EC2Specification]
  }

  @js.native
  sealed trait SupportedSavingsPlansType extends js.Any
  object SupportedSavingsPlansType extends js.Object {
    val COMPUTE_SP      = "COMPUTE_SP".asInstanceOf[SupportedSavingsPlansType]
    val EC2_INSTANCE_SP = "EC2_INSTANCE_SP".asInstanceOf[SupportedSavingsPlansType]

    val values = js.Object.freeze(js.Array(COMPUTE_SP, EC2_INSTANCE_SP))
  }

  /**
    * The values that are available for a tag.
    */
  @js.native
  @Factory
  trait TagValues extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[Values]
  }

  /**
    * Details on recommended instance.
    */
  @js.native
  @Factory
  trait TargetInstance extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var DefaultTargetInstance: js.UndefOr[GenericBoolean]
    var EstimatedMonthlyCost: js.UndefOr[GenericString]
    var EstimatedMonthlySavings: js.UndefOr[GenericString]
    var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization]
    var ResourceDetails: js.UndefOr[ResourceDetails]
  }

  @js.native
  sealed trait TermInYears extends js.Any
  object TermInYears extends js.Object {
    val ONE_YEAR    = "ONE_YEAR".asInstanceOf[TermInYears]
    val THREE_YEARS = "THREE_YEARS".asInstanceOf[TermInYears]

    val values = js.Object.freeze(js.Array(ONE_YEAR, THREE_YEARS))
  }

  /**
    * Details on termination recommendation.
    */
  @js.native
  @Factory
  trait TerminateRecommendationDetail extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var EstimatedMonthlySavings: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait UpdateCostCategoryDefinitionRequest extends js.Object {
    var CostCategoryArn: Arn
    var RuleVersion: CostCategoryRuleVersion
    var Rules: CostCategoryRulesList
  }

  @js.native
  @Factory
  trait UpdateCostCategoryDefinitionResponse extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveStart: js.UndefOr[ZonedDateTime]
  }

  /**
    * The amount of utilization, in hours.
    */
  @js.native
  @Factory
  trait UtilizationByTime extends js.Object {
    var Groups: js.UndefOr[ReservationUtilizationGroups]
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[ReservationAggregates]
  }
}
