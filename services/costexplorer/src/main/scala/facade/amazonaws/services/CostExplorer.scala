package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object costexplorer {
  type AccountScope                             = String
  type AmortizedRecurringFee                    = String
  type AmortizedUpfrontFee                      = String
  type AttributeType                            = String
  type AttributeValue                           = String
  type Attributes                               = js.Dictionary[AttributeValue]
  type Context                                  = String
  type CoverageHoursPercentage                  = String
  type CoverageNormalizedUnitsPercentage        = String
  type CoveragesByTime                          = js.Array[CoverageByTime]
  type Dimension                                = String
  type DimensionValuesWithAttributesList        = js.Array[DimensionValuesWithAttributes]
  type Entity                                   = String
  type Estimated                                = Boolean
  type Expressions                              = js.Array[Expression]
  type ForecastResultsByTime                    = js.Array[ForecastResult]
  type GenericBoolean                           = Boolean
  type GenericString                            = String
  type Granularity                              = String
  type GroupDefinitionKey                       = String
  type GroupDefinitionType                      = String
  type GroupDefinitions                         = js.Array[GroupDefinition]
  type Groups                                   = js.Array[Group]
  type Key                                      = String
  type Keys                                     = js.Array[Key]
  type LookbackPeriodInDays                     = String
  type Metric                                   = String
  type MetricAmount                             = String
  type MetricName                               = String
  type MetricNames                              = js.Array[MetricName]
  type MetricUnit                               = String
  type Metrics                                  = js.Dictionary[MetricValue]
  type NetRISavings                             = String
  type NextPageToken                            = String
  type NonNegativeInteger                       = Int
  type OfferingClass                            = String
  type OnDemandCost                             = String
  type OnDemandCostOfRIHoursUsed                = String
  type OnDemandHours                            = String
  type OnDemandNormalizedUnits                  = String
  type PageSize                                 = Int
  type PaymentOption                            = String
  type PredictionIntervalLevel                  = Int
  type PurchasedHours                           = String
  type PurchasedUnits                           = String
  type ReservationCoverageGroups                = js.Array[ReservationCoverageGroup]
  type ReservationGroupKey                      = String
  type ReservationGroupValue                    = String
  type ReservationPurchaseRecommendationDetails = js.Array[ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations       = js.Array[ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups             = js.Array[ReservationUtilizationGroup]
  type ReservedHours                            = String
  type ReservedNormalizedUnits                  = String
  type ResultsByTime                            = js.Array[ResultByTime]
  type RightsizingRecommendationList            = js.Array[RightsizingRecommendation]
  type RightsizingType                          = String
  type SearchString                             = String
  type TagKey                                   = String
  type TagList                                  = js.Array[Entity]
  type TagValuesList                            = js.Array[TagValues]
  type TargetInstancesList                      = js.Array[TargetInstance]
  type TermInYears                              = String
  type TotalActualHours                         = String
  type TotalActualUnits                         = String
  type TotalAmortizedFee                        = String
  type TotalPotentialRISavings                  = String
  type TotalRunningHours                        = String
  type TotalRunningNormalizedUnits              = String
  type UnusedHours                              = String
  type UnusedUnits                              = String
  type UtilizationPercentage                    = String
  type UtilizationPercentageInUnits             = String
  type UtilizationsByTime                       = js.Array[UtilizationByTime]
  type Value                                    = String
  type Values                                   = js.Array[Value]
  type YearMonthDay                             = String

  implicit final class CostExplorerOps(private val service: CostExplorer) extends AnyVal {

    def getCostAndUsageFuture(params: GetCostAndUsageRequest): Future[GetCostAndUsageResponse] =
      service.getCostAndUsage(params).promise.toFuture
    def getCostForecastFuture(params: GetCostForecastRequest): Future[GetCostForecastResponse] =
      service.getCostForecast(params).promise.toFuture
    def getDimensionValuesFuture(params: GetDimensionValuesRequest): Future[GetDimensionValuesResponse] =
      service.getDimensionValues(params).promise.toFuture
    def getReservationCoverageFuture(params: GetReservationCoverageRequest): Future[GetReservationCoverageResponse] =
      service.getReservationCoverage(params).promise.toFuture
    def getReservationPurchaseRecommendationFuture(
        params: GetReservationPurchaseRecommendationRequest
    ): Future[GetReservationPurchaseRecommendationResponse] =
      service.getReservationPurchaseRecommendation(params).promise.toFuture
    def getReservationUtilizationFuture(
        params: GetReservationUtilizationRequest
    ): Future[GetReservationUtilizationResponse] = service.getReservationUtilization(params).promise.toFuture
    def getRightsizingRecommendationFuture(
        params: GetRightsizingRecommendationRequest
    ): Future[GetRightsizingRecommendationResponse]                    = service.getRightsizingRecommendation(params).promise.toFuture
    def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] = service.getTags(params).promise.toFuture
    def getUsageForecastFuture(params: GetUsageForecastRequest): Future[GetUsageForecastResponse] =
      service.getUsageForecast(params).promise.toFuture
  }
}

package costexplorer {
  @js.native
  @JSImport("aws-sdk", "CostExplorer")
  class CostExplorer() extends js.Object {
    def this(config: AWSConfig) = this()

    def getCostAndUsage(params: GetCostAndUsageRequest): Request[GetCostAndUsageResponse]          = js.native
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
    ): Request[GetRightsizingRecommendationResponse]                                         = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse]                            = js.native
    def getUsageForecast(params: GetUsageForecastRequest): Request[GetUsageForecastResponse] = js.native
  }

  object AccountScopeEnum {
    val PAYER  = "PAYER"
    val LINKED = "LINKED"

    val values = js.Object.freeze(js.Array(PAYER, LINKED))
  }

  object ContextEnum {
    val COST_AND_USAGE = "COST_AND_USAGE"
    val RESERVATIONS   = "RESERVATIONS"

    val values = js.Object.freeze(js.Array(COST_AND_USAGE, RESERVATIONS))
  }

  /**
    * The amount of instance usage that a reservation covered.
    */
  @js.native
  trait Coverage extends js.Object {
    var CoverageCost: js.UndefOr[CoverageCost]
    var CoverageHours: js.UndefOr[CoverageHours]
    var CoverageNormalizedUnits: js.UndefOr[CoverageNormalizedUnits]
  }

  object Coverage {
    @inline
    def apply(
        CoverageCost: js.UndefOr[CoverageCost] = js.undefined,
        CoverageHours: js.UndefOr[CoverageHours] = js.undefined,
        CoverageNormalizedUnits: js.UndefOr[CoverageNormalizedUnits] = js.undefined
    ): Coverage = {
      val __obj = js.Dynamic.literal()
      CoverageCost.foreach(__v => __obj.updateDynamic("CoverageCost")(__v.asInstanceOf[js.Any]))
      CoverageHours.foreach(__v => __obj.updateDynamic("CoverageHours")(__v.asInstanceOf[js.Any]))
      CoverageNormalizedUnits.foreach(__v => __obj.updateDynamic("CoverageNormalizedUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Coverage]
    }
  }

  /**
    * Reservation coverage for a specified period, in hours.
    */
  @js.native
  trait CoverageByTime extends js.Object {
    var Groups: js.UndefOr[ReservationCoverageGroups]
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[Coverage]
  }

  object CoverageByTime {
    @inline
    def apply(
        Groups: js.UndefOr[ReservationCoverageGroups] = js.undefined,
        TimePeriod: js.UndefOr[DateInterval] = js.undefined,
        Total: js.UndefOr[Coverage] = js.undefined
    ): CoverageByTime = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoverageByTime]
    }
  }

  /**
    * How much it cost to run an instance.
    */
  @js.native
  trait CoverageCost extends js.Object {
    var OnDemandCost: js.UndefOr[OnDemandCost]
  }

  object CoverageCost {
    @inline
    def apply(
        OnDemandCost: js.UndefOr[OnDemandCost] = js.undefined
    ): CoverageCost = {
      val __obj = js.Dynamic.literal()
      OnDemandCost.foreach(__v => __obj.updateDynamic("OnDemandCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoverageCost]
    }
  }

  /**
    * How long a running instance either used a reservation or was On-Demand.
    */
  @js.native
  trait CoverageHours extends js.Object {
    var CoverageHoursPercentage: js.UndefOr[CoverageHoursPercentage]
    var OnDemandHours: js.UndefOr[OnDemandHours]
    var ReservedHours: js.UndefOr[ReservedHours]
    var TotalRunningHours: js.UndefOr[TotalRunningHours]
  }

  object CoverageHours {
    @inline
    def apply(
        CoverageHoursPercentage: js.UndefOr[CoverageHoursPercentage] = js.undefined,
        OnDemandHours: js.UndefOr[OnDemandHours] = js.undefined,
        ReservedHours: js.UndefOr[ReservedHours] = js.undefined,
        TotalRunningHours: js.UndefOr[TotalRunningHours] = js.undefined
    ): CoverageHours = {
      val __obj = js.Dynamic.literal()
      CoverageHoursPercentage.foreach(__v => __obj.updateDynamic("CoverageHoursPercentage")(__v.asInstanceOf[js.Any]))
      OnDemandHours.foreach(__v => __obj.updateDynamic("OnDemandHours")(__v.asInstanceOf[js.Any]))
      ReservedHours.foreach(__v => __obj.updateDynamic("ReservedHours")(__v.asInstanceOf[js.Any]))
      TotalRunningHours.foreach(__v => __obj.updateDynamic("TotalRunningHours")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoverageHours]
    }
  }

  /**
    * The amount of instance usage, in normalized units. Normalized units enable you to see your EC2 usage for multiple sizes of instances in a uniform way. For example, suppose you run an xlarge instance and a 2xlarge instance. If you run both instances for the same amount of time, the 2xlarge instance uses twice as much of your reservation as the xlarge instance, even though both instances show only one instance-hour. Using normalized units instead of instance-hours, the xlarge instance used 8 normalized units, and the 2xlarge instance used 16 normalized units.
    *  For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html|Modifying Reserved Instances]] in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
    */
  @js.native
  trait CoverageNormalizedUnits extends js.Object {
    var CoverageNormalizedUnitsPercentage: js.UndefOr[CoverageNormalizedUnitsPercentage]
    var OnDemandNormalizedUnits: js.UndefOr[OnDemandNormalizedUnits]
    var ReservedNormalizedUnits: js.UndefOr[ReservedNormalizedUnits]
    var TotalRunningNormalizedUnits: js.UndefOr[TotalRunningNormalizedUnits]
  }

  object CoverageNormalizedUnits {
    @inline
    def apply(
        CoverageNormalizedUnitsPercentage: js.UndefOr[CoverageNormalizedUnitsPercentage] = js.undefined,
        OnDemandNormalizedUnits: js.UndefOr[OnDemandNormalizedUnits] = js.undefined,
        ReservedNormalizedUnits: js.UndefOr[ReservedNormalizedUnits] = js.undefined,
        TotalRunningNormalizedUnits: js.UndefOr[TotalRunningNormalizedUnits] = js.undefined
    ): CoverageNormalizedUnits = {
      val __obj = js.Dynamic.literal()
      CoverageNormalizedUnitsPercentage.foreach(
        __v => __obj.updateDynamic("CoverageNormalizedUnitsPercentage")(__v.asInstanceOf[js.Any])
      )
      OnDemandNormalizedUnits.foreach(__v => __obj.updateDynamic("OnDemandNormalizedUnits")(__v.asInstanceOf[js.Any]))
      ReservedNormalizedUnits.foreach(__v => __obj.updateDynamic("ReservedNormalizedUnits")(__v.asInstanceOf[js.Any]))
      TotalRunningNormalizedUnits.foreach(
        __v => __obj.updateDynamic("TotalRunningNormalizedUnits")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CoverageNormalizedUnits]
    }
  }

  /**
    * Context about the current instance.
    */
  @js.native
  trait CurrentInstance extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var MonthlyCost: js.UndefOr[GenericString]
    var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString]
    var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString]
    var ResourceDetails: js.UndefOr[ResourceDetails]
    var ResourceId: js.UndefOr[GenericString]
    var ResourceUtilization: js.UndefOr[ResourceUtilization]
    var Tags: js.UndefOr[TagValuesList]
    var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString]
  }

  object CurrentInstance {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        MonthlyCost: js.UndefOr[GenericString] = js.undefined,
        OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined,
        ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined,
        ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined,
        ResourceId: js.UndefOr[GenericString] = js.undefined,
        ResourceUtilization: js.UndefOr[ResourceUtilization] = js.undefined,
        Tags: js.UndefOr[TagValuesList] = js.undefined,
        TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
    ): CurrentInstance = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      MonthlyCost.foreach(__v => __obj.updateDynamic("MonthlyCost")(__v.asInstanceOf[js.Any]))
      OnDemandHoursInLookbackPeriod.foreach(
        __v => __obj.updateDynamic("OnDemandHoursInLookbackPeriod")(__v.asInstanceOf[js.Any])
      )
      ReservationCoveredHoursInLookbackPeriod.foreach(
        __v => __obj.updateDynamic("ReservationCoveredHoursInLookbackPeriod")(__v.asInstanceOf[js.Any])
      )
      ResourceDetails.foreach(__v => __obj.updateDynamic("ResourceDetails")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceUtilization.foreach(__v => __obj.updateDynamic("ResourceUtilization")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TotalRunningHoursInLookbackPeriod.foreach(
        __v => __obj.updateDynamic("TotalRunningHoursInLookbackPeriod")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CurrentInstance]
    }
  }

  /**
    * The time period that you want the usage and costs for.
    */
  @js.native
  trait DateInterval extends js.Object {
    var End: YearMonthDay
    var Start: YearMonthDay
  }

  object DateInterval {
    @inline
    def apply(
        End: YearMonthDay,
        Start: YearMonthDay
    ): DateInterval = {
      val __obj = js.Dynamic.literal(
        "End"   -> End.asInstanceOf[js.Any],
        "Start" -> Start.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DateInterval]
    }
  }

  object DimensionEnum {
    val AZ                   = "AZ"
    val INSTANCE_TYPE        = "INSTANCE_TYPE"
    val LINKED_ACCOUNT       = "LINKED_ACCOUNT"
    val OPERATION            = "OPERATION"
    val PURCHASE_TYPE        = "PURCHASE_TYPE"
    val REGION               = "REGION"
    val SERVICE              = "SERVICE"
    val USAGE_TYPE           = "USAGE_TYPE"
    val USAGE_TYPE_GROUP     = "USAGE_TYPE_GROUP"
    val RECORD_TYPE          = "RECORD_TYPE"
    val OPERATING_SYSTEM     = "OPERATING_SYSTEM"
    val TENANCY              = "TENANCY"
    val SCOPE                = "SCOPE"
    val PLATFORM             = "PLATFORM"
    val SUBSCRIPTION_ID      = "SUBSCRIPTION_ID"
    val LEGAL_ENTITY_NAME    = "LEGAL_ENTITY_NAME"
    val DEPLOYMENT_OPTION    = "DEPLOYMENT_OPTION"
    val DATABASE_ENGINE      = "DATABASE_ENGINE"
    val CACHE_ENGINE         = "CACHE_ENGINE"
    val INSTANCE_TYPE_FAMILY = "INSTANCE_TYPE_FAMILY"
    val BILLING_ENTITY       = "BILLING_ENTITY"
    val RESERVATION_ID       = "RESERVATION_ID"
    val RIGHTSIZING_TYPE     = "RIGHTSIZING_TYPE"

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
        RIGHTSIZING_TYPE
      )
    )
  }

  /**
    * The metadata that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.
    */
  @js.native
  trait DimensionValues extends js.Object {
    var Key: js.UndefOr[Dimension]
    var Values: js.UndefOr[Values]
  }

  object DimensionValues {
    @inline
    def apply(
        Key: js.UndefOr[Dimension] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): DimensionValues = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionValues]
    }
  }

  /**
    * The metadata of a specific type that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.
    */
  @js.native
  trait DimensionValuesWithAttributes extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Value: js.UndefOr[Value]
  }

  object DimensionValuesWithAttributes {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): DimensionValuesWithAttributes = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionValuesWithAttributes]
    }
  }

  /**
    * Details about the Amazon EC2 instances that AWS recommends that you purchase.
    */
  @js.native
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

  object EC2InstanceDetails {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[GenericString] = js.undefined,
        CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
        Family: js.UndefOr[GenericString] = js.undefined,
        InstanceType: js.UndefOr[GenericString] = js.undefined,
        Platform: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
        Tenancy: js.UndefOr[GenericString] = js.undefined
    ): EC2InstanceDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CurrentGeneration.foreach(__v => __obj.updateDynamic("CurrentGeneration")(__v.asInstanceOf[js.Any]))
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      SizeFlexEligible.foreach(__v => __obj.updateDynamic("SizeFlexEligible")(__v.asInstanceOf[js.Any]))
      Tenancy.foreach(__v => __obj.updateDynamic("Tenancy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2InstanceDetails]
    }
  }

  /**
    * Details on the Amazon EC2 Resource.
    */
  @js.native
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

  object EC2ResourceDetails {
    @inline
    def apply(
        HourlyOnDemandRate: js.UndefOr[GenericString] = js.undefined,
        InstanceType: js.UndefOr[GenericString] = js.undefined,
        Memory: js.UndefOr[GenericString] = js.undefined,
        NetworkPerformance: js.UndefOr[GenericString] = js.undefined,
        Platform: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        Sku: js.UndefOr[GenericString] = js.undefined,
        Storage: js.UndefOr[GenericString] = js.undefined,
        Vcpu: js.UndefOr[GenericString] = js.undefined
    ): EC2ResourceDetails = {
      val __obj = js.Dynamic.literal()
      HourlyOnDemandRate.foreach(__v => __obj.updateDynamic("HourlyOnDemandRate")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      Memory.foreach(__v => __obj.updateDynamic("Memory")(__v.asInstanceOf[js.Any]))
      NetworkPerformance.foreach(__v => __obj.updateDynamic("NetworkPerformance")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Sku.foreach(__v => __obj.updateDynamic("Sku")(__v.asInstanceOf[js.Any]))
      Storage.foreach(__v => __obj.updateDynamic("Storage")(__v.asInstanceOf[js.Any]))
      Vcpu.foreach(__v => __obj.updateDynamic("Vcpu")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2ResourceDetails]
    }
  }

  /**
    * Utilization metrics of the instance.
    */
  @js.native
  trait EC2ResourceUtilization extends js.Object {
    var MaxCpuUtilizationPercentage: js.UndefOr[GenericString]
    var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString]
    var MaxStorageUtilizationPercentage: js.UndefOr[GenericString]
  }

  object EC2ResourceUtilization {
    @inline
    def apply(
        MaxCpuUtilizationPercentage: js.UndefOr[GenericString] = js.undefined,
        MaxMemoryUtilizationPercentage: js.UndefOr[GenericString] = js.undefined,
        MaxStorageUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
    ): EC2ResourceUtilization = {
      val __obj = js.Dynamic.literal()
      MaxCpuUtilizationPercentage.foreach(
        __v => __obj.updateDynamic("MaxCpuUtilizationPercentage")(__v.asInstanceOf[js.Any])
      )
      MaxMemoryUtilizationPercentage.foreach(
        __v => __obj.updateDynamic("MaxMemoryUtilizationPercentage")(__v.asInstanceOf[js.Any])
      )
      MaxStorageUtilizationPercentage.foreach(
        __v => __obj.updateDynamic("MaxStorageUtilizationPercentage")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[EC2ResourceUtilization]
    }
  }

  /**
    * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
    */
  @js.native
  trait EC2Specification extends js.Object {
    var OfferingClass: js.UndefOr[OfferingClass]
  }

  object EC2Specification {
    @inline
    def apply(
        OfferingClass: js.UndefOr[OfferingClass] = js.undefined
    ): EC2Specification = {
      val __obj = js.Dynamic.literal()
      OfferingClass.foreach(__v => __obj.updateDynamic("OfferingClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2Specification]
    }
  }

  /**
    * Details about the Amazon ES instances that AWS recommends that you purchase.
    */
  @js.native
  trait ESInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var InstanceClass: js.UndefOr[GenericString]
    var InstanceSize: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  object ESInstanceDetails {
    @inline
    def apply(
        CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
        InstanceClass: js.UndefOr[GenericString] = js.undefined,
        InstanceSize: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
    ): ESInstanceDetails = {
      val __obj = js.Dynamic.literal()
      CurrentGeneration.foreach(__v => __obj.updateDynamic("CurrentGeneration")(__v.asInstanceOf[js.Any]))
      InstanceClass.foreach(__v => __obj.updateDynamic("InstanceClass")(__v.asInstanceOf[js.Any]))
      InstanceSize.foreach(__v => __obj.updateDynamic("InstanceSize")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      SizeFlexEligible.foreach(__v => __obj.updateDynamic("SizeFlexEligible")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ESInstanceDetails]
    }
  }

  /**
    * Details about the Amazon ElastiCache instances that AWS recommends that you purchase.
    */
  @js.native
  trait ElastiCacheInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var NodeType: js.UndefOr[GenericString]
    var ProductDescription: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  object ElastiCacheInstanceDetails {
    @inline
    def apply(
        CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
        Family: js.UndefOr[GenericString] = js.undefined,
        NodeType: js.UndefOr[GenericString] = js.undefined,
        ProductDescription: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
    ): ElastiCacheInstanceDetails = {
      val __obj = js.Dynamic.literal()
      CurrentGeneration.foreach(__v => __obj.updateDynamic("CurrentGeneration")(__v.asInstanceOf[js.Any]))
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      SizeFlexEligible.foreach(__v => __obj.updateDynamic("SizeFlexEligible")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElastiCacheInstanceDetails]
    }
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
    *  </li>'''Note:'''For <code>GetRightsizingRecommendation</code> action, a combination of OR and NOT is not supported. OR is not supported between different dimensions, or dimensions and tags. NOT operators aren't supported. Dimentions are also limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
    */
  @js.native
  trait Expression extends js.Object {
    var And: js.UndefOr[Expressions]
    var Dimensions: js.UndefOr[DimensionValues]
    var Not: js.UndefOr[Expression]
    var Or: js.UndefOr[Expressions]
    var Tags: js.UndefOr[TagValues]
  }

  object Expression {
    @inline
    def apply(
        And: js.UndefOr[Expressions] = js.undefined,
        Dimensions: js.UndefOr[DimensionValues] = js.undefined,
        Not: js.UndefOr[Expression] = js.undefined,
        Or: js.UndefOr[Expressions] = js.undefined,
        Tags: js.UndefOr[TagValues] = js.undefined
    ): Expression = {
      val __obj = js.Dynamic.literal()
      And.foreach(__v => __obj.updateDynamic("And")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Not.foreach(__v => __obj.updateDynamic("Not")(__v.asInstanceOf[js.Any]))
      Or.foreach(__v => __obj.updateDynamic("Or")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Expression]
    }
  }

  /**
    * The forecast created for your query.
    */
  @js.native
  trait ForecastResult extends js.Object {
    var MeanValue: js.UndefOr[GenericString]
    var PredictionIntervalLowerBound: js.UndefOr[GenericString]
    var PredictionIntervalUpperBound: js.UndefOr[GenericString]
    var TimePeriod: js.UndefOr[DateInterval]
  }

  object ForecastResult {
    @inline
    def apply(
        MeanValue: js.UndefOr[GenericString] = js.undefined,
        PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.undefined,
        PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.undefined,
        TimePeriod: js.UndefOr[DateInterval] = js.undefined
    ): ForecastResult = {
      val __obj = js.Dynamic.literal()
      MeanValue.foreach(__v => __obj.updateDynamic("MeanValue")(__v.asInstanceOf[js.Any]))
      PredictionIntervalLowerBound.foreach(
        __v => __obj.updateDynamic("PredictionIntervalLowerBound")(__v.asInstanceOf[js.Any])
      )
      PredictionIntervalUpperBound.foreach(
        __v => __obj.updateDynamic("PredictionIntervalUpperBound")(__v.asInstanceOf[js.Any])
      )
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastResult]
    }
  }

  @js.native
  trait GetCostAndUsageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetCostAndUsageRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        Metrics: js.UndefOr[MetricNames] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetCostAndUsageRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostAndUsageRequest]
    }
  }

  @js.native
  trait GetCostAndUsageResponse extends js.Object {
    var GroupDefinitions: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
    var ResultsByTime: js.UndefOr[ResultsByTime]
  }

  object GetCostAndUsageResponse {
    @inline
    def apply(
        GroupDefinitions: js.UndefOr[GroupDefinitions] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        ResultsByTime: js.UndefOr[ResultsByTime] = js.undefined
    ): GetCostAndUsageResponse = {
      val __obj = js.Dynamic.literal()
      GroupDefinitions.foreach(__v => __obj.updateDynamic("GroupDefinitions")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ResultsByTime.foreach(__v => __obj.updateDynamic("ResultsByTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostAndUsageResponse]
    }
  }

  @js.native
  trait GetCostForecastRequest extends js.Object {
    var Granularity: Granularity
    var Metric: Metric
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel]
  }

  object GetCostForecastRequest {
    @inline
    def apply(
        Granularity: Granularity,
        Metric: Metric,
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined
    ): GetCostForecastRequest = {
      val __obj = js.Dynamic.literal(
        "Granularity" -> Granularity.asInstanceOf[js.Any],
        "Metric"      -> Metric.asInstanceOf[js.Any],
        "TimePeriod"  -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      PredictionIntervalLevel.foreach(__v => __obj.updateDynamic("PredictionIntervalLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostForecastRequest]
    }
  }

  @js.native
  trait GetCostForecastResponse extends js.Object {
    var ForecastResultsByTime: js.UndefOr[ForecastResultsByTime]
    var Total: js.UndefOr[MetricValue]
  }

  object GetCostForecastResponse {
    @inline
    def apply(
        ForecastResultsByTime: js.UndefOr[ForecastResultsByTime] = js.undefined,
        Total: js.UndefOr[MetricValue] = js.undefined
    ): GetCostForecastResponse = {
      val __obj = js.Dynamic.literal()
      ForecastResultsByTime.foreach(__v => __obj.updateDynamic("ForecastResultsByTime")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostForecastResponse]
    }
  }

  @js.native
  trait GetDimensionValuesRequest extends js.Object {
    var Dimension: Dimension
    var TimePeriod: DateInterval
    var Context: js.UndefOr[Context]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
  }

  object GetDimensionValuesRequest {
    @inline
    def apply(
        Dimension: Dimension,
        TimePeriod: DateInterval,
        Context: js.UndefOr[Context] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined
    ): GetDimensionValuesRequest = {
      val __obj = js.Dynamic.literal(
        "Dimension"  -> Dimension.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDimensionValuesRequest]
    }
  }

  @js.native
  trait GetDimensionValuesResponse extends js.Object {
    var DimensionValues: DimensionValuesWithAttributesList
    var ReturnSize: PageSize
    var TotalSize: PageSize
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetDimensionValuesResponse {
    @inline
    def apply(
        DimensionValues: DimensionValuesWithAttributesList,
        ReturnSize: PageSize,
        TotalSize: PageSize,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetDimensionValuesResponse = {
      val __obj = js.Dynamic.literal(
        "DimensionValues" -> DimensionValues.asInstanceOf[js.Any],
        "ReturnSize"      -> ReturnSize.asInstanceOf[js.Any],
        "TotalSize"       -> TotalSize.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDimensionValuesResponse]
    }
  }

  /**
    * You can use the following request parameters to query for how much of your instance usage a reservation covered.
    */
  @js.native
  trait GetReservationCoverageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetReservationCoverageRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        Metrics: js.UndefOr[MetricNames] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetReservationCoverageRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservationCoverageRequest]
    }
  }

  @js.native
  trait GetReservationCoverageResponse extends js.Object {
    var CoveragesByTime: CoveragesByTime
    var NextPageToken: js.UndefOr[NextPageToken]
    var Total: js.UndefOr[Coverage]
  }

  object GetReservationCoverageResponse {
    @inline
    def apply(
        CoveragesByTime: CoveragesByTime,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        Total: js.UndefOr[Coverage] = js.undefined
    ): GetReservationCoverageResponse = {
      val __obj = js.Dynamic.literal(
        "CoveragesByTime" -> CoveragesByTime.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservationCoverageResponse]
    }
  }

  @js.native
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

  object GetReservationPurchaseRecommendationRequest {
    @inline
    def apply(
        Service: GenericString,
        AccountId: js.UndefOr[GenericString] = js.undefined,
        AccountScope: js.UndefOr[AccountScope] = js.undefined,
        LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        PageSize: js.UndefOr[NonNegativeInteger] = js.undefined,
        PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
        ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined,
        TermInYears: js.UndefOr[TermInYears] = js.undefined
    ): GetReservationPurchaseRecommendationRequest = {
      val __obj = js.Dynamic.literal(
        "Service" -> Service.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AccountScope.foreach(__v => __obj.updateDynamic("AccountScope")(__v.asInstanceOf[js.Any]))
      LookbackPeriodInDays.foreach(__v => __obj.updateDynamic("LookbackPeriodInDays")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      ServiceSpecification.foreach(__v => __obj.updateDynamic("ServiceSpecification")(__v.asInstanceOf[js.Any]))
      TermInYears.foreach(__v => __obj.updateDynamic("TermInYears")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservationPurchaseRecommendationRequest]
    }
  }

  @js.native
  trait GetReservationPurchaseRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var Recommendations: js.UndefOr[ReservationPurchaseRecommendations]
  }

  object GetReservationPurchaseRecommendationResponse {
    @inline
    def apply(
        Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.undefined
    ): GetReservationPurchaseRecommendationResponse = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Recommendations.foreach(__v => __obj.updateDynamic("Recommendations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservationPurchaseRecommendationResponse]
    }
  }

  @js.native
  trait GetReservationUtilizationRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetReservationUtilizationRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetReservationUtilizationRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservationUtilizationRequest]
    }
  }

  @js.native
  trait GetReservationUtilizationResponse extends js.Object {
    var UtilizationsByTime: UtilizationsByTime
    var NextPageToken: js.UndefOr[NextPageToken]
    var Total: js.UndefOr[ReservationAggregates]
  }

  object GetReservationUtilizationResponse {
    @inline
    def apply(
        UtilizationsByTime: UtilizationsByTime,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        Total: js.UndefOr[ReservationAggregates] = js.undefined
    ): GetReservationUtilizationResponse = {
      val __obj = js.Dynamic.literal(
        "UtilizationsByTime" -> UtilizationsByTime.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservationUtilizationResponse]
    }
  }

  @js.native
  trait GetRightsizingRecommendationRequest extends js.Object {
    var Service: GenericString
    var Filter: js.UndefOr[Expression]
    var NextPageToken: js.UndefOr[NextPageToken]
    var PageSize: js.UndefOr[NonNegativeInteger]
  }

  object GetRightsizingRecommendationRequest {
    @inline
    def apply(
        Service: GenericString,
        Filter: js.UndefOr[Expression] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
    ): GetRightsizingRecommendationRequest = {
      val __obj = js.Dynamic.literal(
        "Service" -> Service.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRightsizingRecommendationRequest]
    }
  }

  @js.native
  trait GetRightsizingRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[RightsizingRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList]
    var Summary: js.UndefOr[RightsizingRecommendationSummary]
  }

  object GetRightsizingRecommendationResponse {
    @inline
    def apply(
        Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.undefined,
        Summary: js.UndefOr[RightsizingRecommendationSummary] = js.undefined
    ): GetRightsizingRecommendationResponse = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      RightsizingRecommendations.foreach(
        __v => __obj.updateDynamic("RightsizingRecommendations")(__v.asInstanceOf[js.Any])
      )
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRightsizingRecommendationResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var TimePeriod: DateInterval
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
    var TagKey: js.UndefOr[TagKey]
  }

  object GetTagsRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined,
        TagKey: js.UndefOr[TagKey] = js.undefined
    ): GetTagsRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      TagKey.foreach(__v => __obj.updateDynamic("TagKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsRequest]
    }
  }

  @js.native
  trait GetTagsResponse extends js.Object {
    var ReturnSize: PageSize
    var Tags: TagList
    var TotalSize: PageSize
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetTagsResponse {
    @inline
    def apply(
        ReturnSize: PageSize,
        Tags: TagList,
        TotalSize: PageSize,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetTagsResponse = {
      val __obj = js.Dynamic.literal(
        "ReturnSize" -> ReturnSize.asInstanceOf[js.Any],
        "Tags"       -> Tags.asInstanceOf[js.Any],
        "TotalSize"  -> TotalSize.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsResponse]
    }
  }

  @js.native
  trait GetUsageForecastRequest extends js.Object {
    var Granularity: Granularity
    var Metric: Metric
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel]
  }

  object GetUsageForecastRequest {
    @inline
    def apply(
        Granularity: Granularity,
        Metric: Metric,
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined
    ): GetUsageForecastRequest = {
      val __obj = js.Dynamic.literal(
        "Granularity" -> Granularity.asInstanceOf[js.Any],
        "Metric"      -> Metric.asInstanceOf[js.Any],
        "TimePeriod"  -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      PredictionIntervalLevel.foreach(__v => __obj.updateDynamic("PredictionIntervalLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageForecastRequest]
    }
  }

  @js.native
  trait GetUsageForecastResponse extends js.Object {
    var ForecastResultsByTime: js.UndefOr[ForecastResultsByTime]
    var Total: js.UndefOr[MetricValue]
  }

  object GetUsageForecastResponse {
    @inline
    def apply(
        ForecastResultsByTime: js.UndefOr[ForecastResultsByTime] = js.undefined,
        Total: js.UndefOr[MetricValue] = js.undefined
    ): GetUsageForecastResponse = {
      val __obj = js.Dynamic.literal()
      ForecastResultsByTime.foreach(__v => __obj.updateDynamic("ForecastResultsByTime")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageForecastResponse]
    }
  }

  object GranularityEnum {
    val DAILY   = "DAILY"
    val MONTHLY = "MONTHLY"
    val HOURLY  = "HOURLY"

    val values = js.Object.freeze(js.Array(DAILY, MONTHLY, HOURLY))
  }

  /**
    * One level of grouped data in the results.
    */
  @js.native
  trait Group extends js.Object {
    var Keys: js.UndefOr[Keys]
    var Metrics: js.UndefOr[Metrics]
  }

  object Group {
    @inline
    def apply(
        Keys: js.UndefOr[Keys] = js.undefined,
        Metrics: js.UndefOr[Metrics] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /**
    * Represents a group when you specify a group by criteria or in the response to a query with a specific grouping.
    */
  @js.native
  trait GroupDefinition extends js.Object {
    var Key: js.UndefOr[GroupDefinitionKey]
    var Type: js.UndefOr[GroupDefinitionType]
  }

  object GroupDefinition {
    @inline
    def apply(
        Key: js.UndefOr[GroupDefinitionKey] = js.undefined,
        Type: js.UndefOr[GroupDefinitionType] = js.undefined
    ): GroupDefinition = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupDefinition]
    }
  }

  object GroupDefinitionTypeEnum {
    val DIMENSION = "DIMENSION"
    val TAG       = "TAG"

    val values = js.Object.freeze(js.Array(DIMENSION, TAG))
  }

  /**
    * Details about the instances that AWS recommends that you purchase.
    */
  @js.native
  trait InstanceDetails extends js.Object {
    var EC2InstanceDetails: js.UndefOr[EC2InstanceDetails]
    var ESInstanceDetails: js.UndefOr[ESInstanceDetails]
    var ElastiCacheInstanceDetails: js.UndefOr[ElastiCacheInstanceDetails]
    var RDSInstanceDetails: js.UndefOr[RDSInstanceDetails]
    var RedshiftInstanceDetails: js.UndefOr[RedshiftInstanceDetails]
  }

  object InstanceDetails {
    @inline
    def apply(
        EC2InstanceDetails: js.UndefOr[EC2InstanceDetails] = js.undefined,
        ESInstanceDetails: js.UndefOr[ESInstanceDetails] = js.undefined,
        ElastiCacheInstanceDetails: js.UndefOr[ElastiCacheInstanceDetails] = js.undefined,
        RDSInstanceDetails: js.UndefOr[RDSInstanceDetails] = js.undefined,
        RedshiftInstanceDetails: js.UndefOr[RedshiftInstanceDetails] = js.undefined
    ): InstanceDetails = {
      val __obj = js.Dynamic.literal()
      EC2InstanceDetails.foreach(__v => __obj.updateDynamic("EC2InstanceDetails")(__v.asInstanceOf[js.Any]))
      ESInstanceDetails.foreach(__v => __obj.updateDynamic("ESInstanceDetails")(__v.asInstanceOf[js.Any]))
      ElastiCacheInstanceDetails.foreach(
        __v => __obj.updateDynamic("ElastiCacheInstanceDetails")(__v.asInstanceOf[js.Any])
      )
      RDSInstanceDetails.foreach(__v => __obj.updateDynamic("RDSInstanceDetails")(__v.asInstanceOf[js.Any]))
      RedshiftInstanceDetails.foreach(__v => __obj.updateDynamic("RedshiftInstanceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceDetails]
    }
  }

  object LookbackPeriodInDaysEnum {
    val SEVEN_DAYS  = "SEVEN_DAYS"
    val THIRTY_DAYS = "THIRTY_DAYS"
    val SIXTY_DAYS  = "SIXTY_DAYS"

    val values = js.Object.freeze(js.Array(SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS))
  }

  object MetricEnum {
    val BLENDED_COST            = "BLENDED_COST"
    val UNBLENDED_COST          = "UNBLENDED_COST"
    val AMORTIZED_COST          = "AMORTIZED_COST"
    val NET_UNBLENDED_COST      = "NET_UNBLENDED_COST"
    val NET_AMORTIZED_COST      = "NET_AMORTIZED_COST"
    val USAGE_QUANTITY          = "USAGE_QUANTITY"
    val NORMALIZED_USAGE_AMOUNT = "NORMALIZED_USAGE_AMOUNT"

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
  trait MetricValue extends js.Object {
    var Amount: js.UndefOr[MetricAmount]
    var Unit: js.UndefOr[MetricUnit]
  }

  object MetricValue {
    @inline
    def apply(
        Amount: js.UndefOr[MetricAmount] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): MetricValue = {
      val __obj = js.Dynamic.literal()
      Amount.foreach(__v => __obj.updateDynamic("Amount")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricValue]
    }
  }

  /**
    * Details on the modification recommendation.
    */
  @js.native
  trait ModifyRecommendationDetail extends js.Object {
    var TargetInstances: js.UndefOr[TargetInstancesList]
  }

  object ModifyRecommendationDetail {
    @inline
    def apply(
        TargetInstances: js.UndefOr[TargetInstancesList] = js.undefined
    ): ModifyRecommendationDetail = {
      val __obj = js.Dynamic.literal()
      TargetInstances.foreach(__v => __obj.updateDynamic("TargetInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyRecommendationDetail]
    }
  }

  object OfferingClassEnum {
    val STANDARD    = "STANDARD"
    val CONVERTIBLE = "CONVERTIBLE"

    val values = js.Object.freeze(js.Array(STANDARD, CONVERTIBLE))
  }

  object PaymentOptionEnum {
    val NO_UPFRONT         = "NO_UPFRONT"
    val PARTIAL_UPFRONT    = "PARTIAL_UPFRONT"
    val ALL_UPFRONT        = "ALL_UPFRONT"
    val LIGHT_UTILIZATION  = "LIGHT_UTILIZATION"
    val MEDIUM_UTILIZATION = "MEDIUM_UTILIZATION"
    val HEAVY_UTILIZATION  = "HEAVY_UTILIZATION"

    val values = js.Object.freeze(
      js.Array(NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT, LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION)
    )
  }

  /**
    * Details about the Amazon RDS instances that AWS recommends that you purchase.
    */
  @js.native
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

  object RDSInstanceDetails {
    @inline
    def apply(
        CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
        DatabaseEdition: js.UndefOr[GenericString] = js.undefined,
        DatabaseEngine: js.UndefOr[GenericString] = js.undefined,
        DeploymentOption: js.UndefOr[GenericString] = js.undefined,
        Family: js.UndefOr[GenericString] = js.undefined,
        InstanceType: js.UndefOr[GenericString] = js.undefined,
        LicenseModel: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
    ): RDSInstanceDetails = {
      val __obj = js.Dynamic.literal()
      CurrentGeneration.foreach(__v => __obj.updateDynamic("CurrentGeneration")(__v.asInstanceOf[js.Any]))
      DatabaseEdition.foreach(__v => __obj.updateDynamic("DatabaseEdition")(__v.asInstanceOf[js.Any]))
      DatabaseEngine.foreach(__v => __obj.updateDynamic("DatabaseEngine")(__v.asInstanceOf[js.Any]))
      DeploymentOption.foreach(__v => __obj.updateDynamic("DeploymentOption")(__v.asInstanceOf[js.Any]))
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      SizeFlexEligible.foreach(__v => __obj.updateDynamic("SizeFlexEligible")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RDSInstanceDetails]
    }
  }

  /**
    * Details about the Amazon Redshift instances that AWS recommends that you purchase.
    */
  @js.native
  trait RedshiftInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var NodeType: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
  }

  object RedshiftInstanceDetails {
    @inline
    def apply(
        CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
        Family: js.UndefOr[GenericString] = js.undefined,
        NodeType: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
    ): RedshiftInstanceDetails = {
      val __obj = js.Dynamic.literal()
      CurrentGeneration.foreach(__v => __obj.updateDynamic("CurrentGeneration")(__v.asInstanceOf[js.Any]))
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      SizeFlexEligible.foreach(__v => __obj.updateDynamic("SizeFlexEligible")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftInstanceDetails]
    }
  }

  /**
    * The aggregated numbers for your reservation usage.
    */
  @js.native
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

  object ReservationAggregates {
    @inline
    def apply(
        AmortizedRecurringFee: js.UndefOr[AmortizedRecurringFee] = js.undefined,
        AmortizedUpfrontFee: js.UndefOr[AmortizedUpfrontFee] = js.undefined,
        NetRISavings: js.UndefOr[NetRISavings] = js.undefined,
        OnDemandCostOfRIHoursUsed: js.UndefOr[OnDemandCostOfRIHoursUsed] = js.undefined,
        PurchasedHours: js.UndefOr[PurchasedHours] = js.undefined,
        PurchasedUnits: js.UndefOr[PurchasedUnits] = js.undefined,
        TotalActualHours: js.UndefOr[TotalActualHours] = js.undefined,
        TotalActualUnits: js.UndefOr[TotalActualUnits] = js.undefined,
        TotalAmortizedFee: js.UndefOr[TotalAmortizedFee] = js.undefined,
        TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings] = js.undefined,
        UnusedHours: js.UndefOr[UnusedHours] = js.undefined,
        UnusedUnits: js.UndefOr[UnusedUnits] = js.undefined,
        UtilizationPercentage: js.UndefOr[UtilizationPercentage] = js.undefined,
        UtilizationPercentageInUnits: js.UndefOr[UtilizationPercentageInUnits] = js.undefined
    ): ReservationAggregates = {
      val __obj = js.Dynamic.literal()
      AmortizedRecurringFee.foreach(__v => __obj.updateDynamic("AmortizedRecurringFee")(__v.asInstanceOf[js.Any]))
      AmortizedUpfrontFee.foreach(__v => __obj.updateDynamic("AmortizedUpfrontFee")(__v.asInstanceOf[js.Any]))
      NetRISavings.foreach(__v => __obj.updateDynamic("NetRISavings")(__v.asInstanceOf[js.Any]))
      OnDemandCostOfRIHoursUsed.foreach(
        __v => __obj.updateDynamic("OnDemandCostOfRIHoursUsed")(__v.asInstanceOf[js.Any])
      )
      PurchasedHours.foreach(__v => __obj.updateDynamic("PurchasedHours")(__v.asInstanceOf[js.Any]))
      PurchasedUnits.foreach(__v => __obj.updateDynamic("PurchasedUnits")(__v.asInstanceOf[js.Any]))
      TotalActualHours.foreach(__v => __obj.updateDynamic("TotalActualHours")(__v.asInstanceOf[js.Any]))
      TotalActualUnits.foreach(__v => __obj.updateDynamic("TotalActualUnits")(__v.asInstanceOf[js.Any]))
      TotalAmortizedFee.foreach(__v => __obj.updateDynamic("TotalAmortizedFee")(__v.asInstanceOf[js.Any]))
      TotalPotentialRISavings.foreach(__v => __obj.updateDynamic("TotalPotentialRISavings")(__v.asInstanceOf[js.Any]))
      UnusedHours.foreach(__v => __obj.updateDynamic("UnusedHours")(__v.asInstanceOf[js.Any]))
      UnusedUnits.foreach(__v => __obj.updateDynamic("UnusedUnits")(__v.asInstanceOf[js.Any]))
      UtilizationPercentage.foreach(__v => __obj.updateDynamic("UtilizationPercentage")(__v.asInstanceOf[js.Any]))
      UtilizationPercentageInUnits.foreach(
        __v => __obj.updateDynamic("UtilizationPercentageInUnits")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ReservationAggregates]
    }
  }

  /**
    * A group of reservations that share a set of attributes.
    */
  @js.native
  trait ReservationCoverageGroup extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Coverage: js.UndefOr[Coverage]
  }

  object ReservationCoverageGroup {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Coverage: js.UndefOr[Coverage] = js.undefined
    ): ReservationCoverageGroup = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Coverage.foreach(__v => __obj.updateDynamic("Coverage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationCoverageGroup]
    }
  }

  /**
    * A specific reservation that AWS recommends for purchase.
    */
  @js.native
  trait ReservationPurchaseRecommendation extends js.Object {
    var AccountScope: js.UndefOr[AccountScope]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var PaymentOption: js.UndefOr[PaymentOption]
    var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails]
    var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary]
    var ServiceSpecification: js.UndefOr[ServiceSpecification]
    var TermInYears: js.UndefOr[TermInYears]
  }

  object ReservationPurchaseRecommendation {
    @inline
    def apply(
        AccountScope: js.UndefOr[AccountScope] = js.undefined,
        LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
        PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
        RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.undefined,
        RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.undefined,
        ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined,
        TermInYears: js.UndefOr[TermInYears] = js.undefined
    ): ReservationPurchaseRecommendation = {
      val __obj = js.Dynamic.literal()
      AccountScope.foreach(__v => __obj.updateDynamic("AccountScope")(__v.asInstanceOf[js.Any]))
      LookbackPeriodInDays.foreach(__v => __obj.updateDynamic("LookbackPeriodInDays")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      RecommendationDetails.foreach(__v => __obj.updateDynamic("RecommendationDetails")(__v.asInstanceOf[js.Any]))
      RecommendationSummary.foreach(__v => __obj.updateDynamic("RecommendationSummary")(__v.asInstanceOf[js.Any]))
      ServiceSpecification.foreach(__v => __obj.updateDynamic("ServiceSpecification")(__v.asInstanceOf[js.Any]))
      TermInYears.foreach(__v => __obj.updateDynamic("TermInYears")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPurchaseRecommendation]
    }
  }

  /**
    * Details about your recommended reservation purchase.
    */
  @js.native
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

  object ReservationPurchaseRecommendationDetail {
    @inline
    def apply(
        AccountId: js.UndefOr[GenericString] = js.undefined,
        AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined,
        AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined,
        AverageUtilization: js.UndefOr[GenericString] = js.undefined,
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined,
        EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.undefined,
        InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined,
        MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined,
        MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined,
        MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined,
        MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined,
        RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.undefined,
        RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.undefined,
        RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.undefined,
        UpfrontCost: js.UndefOr[GenericString] = js.undefined
    ): ReservationPurchaseRecommendationDetail = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AverageNormalizedUnitsUsedPerHour.foreach(
        __v => __obj.updateDynamic("AverageNormalizedUnitsUsedPerHour")(__v.asInstanceOf[js.Any])
      )
      AverageNumberOfInstancesUsedPerHour.foreach(
        __v => __obj.updateDynamic("AverageNumberOfInstancesUsedPerHour")(__v.asInstanceOf[js.Any])
      )
      AverageUtilization.foreach(__v => __obj.updateDynamic("AverageUtilization")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      EstimatedBreakEvenInMonths.foreach(
        __v => __obj.updateDynamic("EstimatedBreakEvenInMonths")(__v.asInstanceOf[js.Any])
      )
      EstimatedMonthlyOnDemandCost.foreach(
        __v => __obj.updateDynamic("EstimatedMonthlyOnDemandCost")(__v.asInstanceOf[js.Any])
      )
      EstimatedMonthlySavingsAmount.foreach(
        __v => __obj.updateDynamic("EstimatedMonthlySavingsAmount")(__v.asInstanceOf[js.Any])
      )
      EstimatedMonthlySavingsPercentage.foreach(
        __v => __obj.updateDynamic("EstimatedMonthlySavingsPercentage")(__v.asInstanceOf[js.Any])
      )
      EstimatedReservationCostForLookbackPeriod.foreach(
        __v => __obj.updateDynamic("EstimatedReservationCostForLookbackPeriod")(__v.asInstanceOf[js.Any])
      )
      InstanceDetails.foreach(__v => __obj.updateDynamic("InstanceDetails")(__v.asInstanceOf[js.Any]))
      MaximumNormalizedUnitsUsedPerHour.foreach(
        __v => __obj.updateDynamic("MaximumNormalizedUnitsUsedPerHour")(__v.asInstanceOf[js.Any])
      )
      MaximumNumberOfInstancesUsedPerHour.foreach(
        __v => __obj.updateDynamic("MaximumNumberOfInstancesUsedPerHour")(__v.asInstanceOf[js.Any])
      )
      MinimumNormalizedUnitsUsedPerHour.foreach(
        __v => __obj.updateDynamic("MinimumNormalizedUnitsUsedPerHour")(__v.asInstanceOf[js.Any])
      )
      MinimumNumberOfInstancesUsedPerHour.foreach(
        __v => __obj.updateDynamic("MinimumNumberOfInstancesUsedPerHour")(__v.asInstanceOf[js.Any])
      )
      RecommendedNormalizedUnitsToPurchase.foreach(
        __v => __obj.updateDynamic("RecommendedNormalizedUnitsToPurchase")(__v.asInstanceOf[js.Any])
      )
      RecommendedNumberOfInstancesToPurchase.foreach(
        __v => __obj.updateDynamic("RecommendedNumberOfInstancesToPurchase")(__v.asInstanceOf[js.Any])
      )
      RecurringStandardMonthlyCost.foreach(
        __v => __obj.updateDynamic("RecurringStandardMonthlyCost")(__v.asInstanceOf[js.Any])
      )
      UpfrontCost.foreach(__v => __obj.updateDynamic("UpfrontCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
    }
  }

  /**
    * Information about this specific recommendation, such as the time stamp for when AWS made a specific recommendation.
    */
  @js.native
  trait ReservationPurchaseRecommendationMetadata extends js.Object {
    var GenerationTimestamp: js.UndefOr[GenericString]
    var RecommendationId: js.UndefOr[GenericString]
  }

  object ReservationPurchaseRecommendationMetadata {
    @inline
    def apply(
        GenerationTimestamp: js.UndefOr[GenericString] = js.undefined,
        RecommendationId: js.UndefOr[GenericString] = js.undefined
    ): ReservationPurchaseRecommendationMetadata = {
      val __obj = js.Dynamic.literal()
      GenerationTimestamp.foreach(__v => __obj.updateDynamic("GenerationTimestamp")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPurchaseRecommendationMetadata]
    }
  }

  /**
    * A summary about this recommendation, such as the currency code, the amount that AWS estimates that you could save, and the total amount of reservation to purchase.
    */
  @js.native
  trait ReservationPurchaseRecommendationSummary extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString]
  }

  object ReservationPurchaseRecommendationSummary {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
        TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
    ): ReservationPurchaseRecommendationSummary = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      TotalEstimatedMonthlySavingsAmount.foreach(
        __v => __obj.updateDynamic("TotalEstimatedMonthlySavingsAmount")(__v.asInstanceOf[js.Any])
      )
      TotalEstimatedMonthlySavingsPercentage.foreach(
        __v => __obj.updateDynamic("TotalEstimatedMonthlySavingsPercentage")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
    }
  }

  /**
    * A group of reservations that share a set of attributes.
    */
  @js.native
  trait ReservationUtilizationGroup extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Key: js.UndefOr[ReservationGroupKey]
    var Utilization: js.UndefOr[ReservationAggregates]
    var Value: js.UndefOr[ReservationGroupValue]
  }

  object ReservationUtilizationGroup {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Key: js.UndefOr[ReservationGroupKey] = js.undefined,
        Utilization: js.UndefOr[ReservationAggregates] = js.undefined,
        Value: js.UndefOr[ReservationGroupValue] = js.undefined
    ): ReservationUtilizationGroup = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Utilization.foreach(__v => __obj.updateDynamic("Utilization")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationUtilizationGroup]
    }
  }

  /**
    * Details on the resource.
    */
  @js.native
  trait ResourceDetails extends js.Object {
    var EC2ResourceDetails: js.UndefOr[EC2ResourceDetails]
  }

  object ResourceDetails {
    @inline
    def apply(
        EC2ResourceDetails: js.UndefOr[EC2ResourceDetails] = js.undefined
    ): ResourceDetails = {
      val __obj = js.Dynamic.literal()
      EC2ResourceDetails.foreach(__v => __obj.updateDynamic("EC2ResourceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetails]
    }
  }

  /**
    * Resource utilization of current resource.
    */
  @js.native
  trait ResourceUtilization extends js.Object {
    var EC2ResourceUtilization: js.UndefOr[EC2ResourceUtilization]
  }

  object ResourceUtilization {
    @inline
    def apply(
        EC2ResourceUtilization: js.UndefOr[EC2ResourceUtilization] = js.undefined
    ): ResourceUtilization = {
      val __obj = js.Dynamic.literal()
      EC2ResourceUtilization.foreach(__v => __obj.updateDynamic("EC2ResourceUtilization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceUtilization]
    }
  }

  /**
    * The result that is associated with a time period.
    */
  @js.native
  trait ResultByTime extends js.Object {
    var Estimated: js.UndefOr[Estimated]
    var Groups: js.UndefOr[Groups]
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[Metrics]
  }

  object ResultByTime {
    @inline
    def apply(
        Estimated: js.UndefOr[Estimated] = js.undefined,
        Groups: js.UndefOr[Groups] = js.undefined,
        TimePeriod: js.UndefOr[DateInterval] = js.undefined,
        Total: js.UndefOr[Metrics] = js.undefined
    ): ResultByTime = {
      val __obj = js.Dynamic.literal()
      Estimated.foreach(__v => __obj.updateDynamic("Estimated")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultByTime]
    }
  }

  /**
    * Recommendations to rightsize resources.
    */
  @js.native
  trait RightsizingRecommendation extends js.Object {
    var AccountId: js.UndefOr[GenericString]
    var CurrentInstance: js.UndefOr[CurrentInstance]
    var ModifyRecommendationDetail: js.UndefOr[ModifyRecommendationDetail]
    var RightsizingType: js.UndefOr[RightsizingType]
    var TerminateRecommendationDetail: js.UndefOr[TerminateRecommendationDetail]
  }

  object RightsizingRecommendation {
    @inline
    def apply(
        AccountId: js.UndefOr[GenericString] = js.undefined,
        CurrentInstance: js.UndefOr[CurrentInstance] = js.undefined,
        ModifyRecommendationDetail: js.UndefOr[ModifyRecommendationDetail] = js.undefined,
        RightsizingType: js.UndefOr[RightsizingType] = js.undefined,
        TerminateRecommendationDetail: js.UndefOr[TerminateRecommendationDetail] = js.undefined
    ): RightsizingRecommendation = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CurrentInstance.foreach(__v => __obj.updateDynamic("CurrentInstance")(__v.asInstanceOf[js.Any]))
      ModifyRecommendationDetail.foreach(
        __v => __obj.updateDynamic("ModifyRecommendationDetail")(__v.asInstanceOf[js.Any])
      )
      RightsizingType.foreach(__v => __obj.updateDynamic("RightsizingType")(__v.asInstanceOf[js.Any]))
      TerminateRecommendationDetail.foreach(
        __v => __obj.updateDynamic("TerminateRecommendationDetail")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RightsizingRecommendation]
    }
  }

  /**
    * Metadata for this recommendation set.
    */
  @js.native
  trait RightsizingRecommendationMetadata extends js.Object {
    var GenerationTimestamp: js.UndefOr[GenericString]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var RecommendationId: js.UndefOr[GenericString]
  }

  object RightsizingRecommendationMetadata {
    @inline
    def apply(
        GenerationTimestamp: js.UndefOr[GenericString] = js.undefined,
        LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
        RecommendationId: js.UndefOr[GenericString] = js.undefined
    ): RightsizingRecommendationMetadata = {
      val __obj = js.Dynamic.literal()
      GenerationTimestamp.foreach(__v => __obj.updateDynamic("GenerationTimestamp")(__v.asInstanceOf[js.Any]))
      LookbackPeriodInDays.foreach(__v => __obj.updateDynamic("LookbackPeriodInDays")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RightsizingRecommendationMetadata]
    }
  }

  /**
    * Summary of rightsizing recommendations
    */
  @js.native
  trait RightsizingRecommendationSummary extends js.Object {
    var EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString]
    var SavingsCurrencyCode: js.UndefOr[GenericString]
    var SavingsPercentage: js.UndefOr[GenericString]
    var TotalRecommendationCount: js.UndefOr[GenericString]
  }

  object RightsizingRecommendationSummary {
    @inline
    def apply(
        EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
        SavingsCurrencyCode: js.UndefOr[GenericString] = js.undefined,
        SavingsPercentage: js.UndefOr[GenericString] = js.undefined,
        TotalRecommendationCount: js.UndefOr[GenericString] = js.undefined
    ): RightsizingRecommendationSummary = {
      val __obj = js.Dynamic.literal()
      EstimatedTotalMonthlySavingsAmount.foreach(
        __v => __obj.updateDynamic("EstimatedTotalMonthlySavingsAmount")(__v.asInstanceOf[js.Any])
      )
      SavingsCurrencyCode.foreach(__v => __obj.updateDynamic("SavingsCurrencyCode")(__v.asInstanceOf[js.Any]))
      SavingsPercentage.foreach(__v => __obj.updateDynamic("SavingsPercentage")(__v.asInstanceOf[js.Any]))
      TotalRecommendationCount.foreach(__v => __obj.updateDynamic("TotalRecommendationCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RightsizingRecommendationSummary]
    }
  }

  object RightsizingTypeEnum {
    val TERMINATE = "TERMINATE"
    val MODIFY    = "MODIFY"

    val values = js.Object.freeze(js.Array(TERMINATE, MODIFY))
  }

  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  @js.native
  trait ServiceSpecification extends js.Object {
    var EC2Specification: js.UndefOr[EC2Specification]
  }

  object ServiceSpecification {
    @inline
    def apply(
        EC2Specification: js.UndefOr[EC2Specification] = js.undefined
    ): ServiceSpecification = {
      val __obj = js.Dynamic.literal()
      EC2Specification.foreach(__v => __obj.updateDynamic("EC2Specification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSpecification]
    }
  }

  /**
    * The values that are available for a tag.
    */
  @js.native
  trait TagValues extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[Values]
  }

  object TagValues {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): TagValues = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagValues]
    }
  }

  /**
    * Details on recommended instance.
    */
  @js.native
  trait TargetInstance extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var DefaultTargetInstance: js.UndefOr[GenericBoolean]
    var EstimatedMonthlyCost: js.UndefOr[GenericString]
    var EstimatedMonthlySavings: js.UndefOr[GenericString]
    var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization]
    var ResourceDetails: js.UndefOr[ResourceDetails]
  }

  object TargetInstance {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.undefined,
        EstimatedMonthlyCost: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlySavings: js.UndefOr[GenericString] = js.undefined,
        ExpectedResourceUtilization: js.UndefOr[ResourceUtilization] = js.undefined,
        ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined
    ): TargetInstance = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      DefaultTargetInstance.foreach(__v => __obj.updateDynamic("DefaultTargetInstance")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlyCost.foreach(__v => __obj.updateDynamic("EstimatedMonthlyCost")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlySavings.foreach(__v => __obj.updateDynamic("EstimatedMonthlySavings")(__v.asInstanceOf[js.Any]))
      ExpectedResourceUtilization.foreach(
        __v => __obj.updateDynamic("ExpectedResourceUtilization")(__v.asInstanceOf[js.Any])
      )
      ResourceDetails.foreach(__v => __obj.updateDynamic("ResourceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetInstance]
    }
  }

  object TermInYearsEnum {
    val ONE_YEAR    = "ONE_YEAR"
    val THREE_YEARS = "THREE_YEARS"

    val values = js.Object.freeze(js.Array(ONE_YEAR, THREE_YEARS))
  }

  /**
    * Details on termination recommendation.
    */
  @js.native
  trait TerminateRecommendationDetail extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var EstimatedMonthlySavings: js.UndefOr[GenericString]
  }

  object TerminateRecommendationDetail {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlySavings: js.UndefOr[GenericString] = js.undefined
    ): TerminateRecommendationDetail = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlySavings.foreach(__v => __obj.updateDynamic("EstimatedMonthlySavings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateRecommendationDetail]
    }
  }

  /**
    * The amount of utilization, in hours.
    */
  @js.native
  trait UtilizationByTime extends js.Object {
    var Groups: js.UndefOr[ReservationUtilizationGroups]
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[ReservationAggregates]
  }

  object UtilizationByTime {
    @inline
    def apply(
        Groups: js.UndefOr[ReservationUtilizationGroups] = js.undefined,
        TimePeriod: js.UndefOr[DateInterval] = js.undefined,
        Total: js.UndefOr[ReservationAggregates] = js.undefined
    ): UtilizationByTime = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UtilizationByTime]
    }
  }
}
