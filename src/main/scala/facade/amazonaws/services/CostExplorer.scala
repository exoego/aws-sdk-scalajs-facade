package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object costexplorer {
  type AccountScope = String
  type AmortizedRecurringFee = String
  type AmortizedUpfrontFee = String
  type AttributeType = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type Context = String
  type CoverageHoursPercentage = String
  type CoveragesByTime = js.Array[CoverageByTime]
  type Dimension = String
  type DimensionValuesWithAttributesList = js.Array[DimensionValuesWithAttributes]
  type Entity = String
  type Estimated = Boolean
  type Expressions = js.Array[Expression]
  type ForecastResultsByTime = js.Array[ForecastResult]
  type GenericBoolean = Boolean
  type GenericString = String
  type Granularity = String
  type GroupDefinitionKey = String
  type GroupDefinitionType = String
  type GroupDefinitions = js.Array[GroupDefinition]
  type Groups = js.Array[Group]
  type Key = String
  type Keys = js.Array[Key]
  type LookbackPeriodInDays = String
  type Metric = String
  type MetricAmount = String
  type MetricName = String
  type MetricNames = js.Array[MetricName]
  type MetricUnit = String
  type Metrics = js.Dictionary[MetricValue]
  type NetRISavings = String
  type NextPageToken = String
  type NonNegativeInteger = Int
  type OfferingClass = String
  type OnDemandCostOfRIHoursUsed = String
  type OnDemandHours = String
  type PageSize = Int
  type PaymentOption = String
  type PredictionIntervalLevel = Int
  type PurchasedHours = String
  type ReservationCoverageGroups = js.Array[ReservationCoverageGroup]
  type ReservationGroupKey = String
  type ReservationGroupValue = String
  type ReservationPurchaseRecommendationDetails = js.Array[ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[ReservationUtilizationGroup]
  type ReservedHours = String
  type ResultsByTime = js.Array[ResultByTime]
  type SearchString = String
  type TagKey = String
  type TagList = js.Array[Entity]
  type TermInYears = String
  type TotalActualHours = String
  type TotalAmortizedFee = String
  type TotalPotentialRISavings = String
  type TotalRunningHours = String
  type UnusedHours = String
  type UtilizationPercentage = String
  type UtilizationsByTime = js.Array[UtilizationByTime]
  type Value = String
  type Values = js.Array[Value]
  type YearMonthDay = String
}

package costexplorer {
  @js.native
  @JSImport("aws-sdk", "CostExplorer")
  class CostExplorer(config: AWSConfig) extends js.Object {
    def getCostAndUsage(params: GetCostAndUsageRequest): Request[GetCostAndUsageResponse] = js.native
    def getCostForecast(params: GetCostForecastRequest): Request[GetCostForecastResponse] = js.native
    def getDimensionValues(params: GetDimensionValuesRequest): Request[GetDimensionValuesResponse] = js.native
    def getReservationCoverage(params: GetReservationCoverageRequest): Request[GetReservationCoverageResponse] = js.native
    def getReservationPurchaseRecommendation(params: GetReservationPurchaseRecommendationRequest): Request[GetReservationPurchaseRecommendationResponse] = js.native
    def getReservationUtilization(params: GetReservationUtilizationRequest): Request[GetReservationUtilizationResponse] = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse] = js.native
  }

  object AccountScopeEnum {
    val PAYER = "PAYER"
    val LINKED = "LINKED"

    val values = IndexedSeq(PAYER, LINKED)
  }

  object ContextEnum {
    val COST_AND_USAGE = "COST_AND_USAGE"
    val RESERVATIONS = "RESERVATIONS"

    val values = IndexedSeq(COST_AND_USAGE, RESERVATIONS)
  }

  /**
   * <p>The amount of instance usage that a reservation covered.</p>
   */
  @js.native
  trait Coverage extends js.Object {
    var CoverageHours: js.UndefOr[CoverageHours]
  }

  object Coverage {
    def apply(
      CoverageHours: js.UndefOr[CoverageHours] = js.undefined): Coverage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoverageHours" -> CoverageHours.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Coverage]
    }
  }

  /**
   * <p>Reservation coverage for a specified period, in hours.</p>
   */
  @js.native
  trait CoverageByTime extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var Groups: js.UndefOr[ReservationCoverageGroups]
    var Total: js.UndefOr[Coverage]
  }

  object CoverageByTime {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      Groups: js.UndefOr[ReservationCoverageGroups] = js.undefined,
      Total: js.UndefOr[Coverage] = js.undefined): CoverageByTime = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CoverageByTime]
    }
  }

  /**
   * <p>How long a running instance either used a reservation or was On-Demand.</p>
   */
  @js.native
  trait CoverageHours extends js.Object {
    var OnDemandHours: js.UndefOr[OnDemandHours]
    var ReservedHours: js.UndefOr[ReservedHours]
    var TotalRunningHours: js.UndefOr[TotalRunningHours]
    var CoverageHoursPercentage: js.UndefOr[CoverageHoursPercentage]
  }

  object CoverageHours {
    def apply(
      OnDemandHours: js.UndefOr[OnDemandHours] = js.undefined,
      ReservedHours: js.UndefOr[ReservedHours] = js.undefined,
      TotalRunningHours: js.UndefOr[TotalRunningHours] = js.undefined,
      CoverageHoursPercentage: js.UndefOr[CoverageHoursPercentage] = js.undefined): CoverageHours = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OnDemandHours" -> OnDemandHours.map { x => x.asInstanceOf[js.Any] },
        "ReservedHours" -> ReservedHours.map { x => x.asInstanceOf[js.Any] },
        "TotalRunningHours" -> TotalRunningHours.map { x => x.asInstanceOf[js.Any] },
        "CoverageHoursPercentage" -> CoverageHoursPercentage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CoverageHours]
    }
  }

  /**
   * <p>The time period that you want the usage and costs for. </p>
   */
  @js.native
  trait DateInterval extends js.Object {
    var Start: js.UndefOr[YearMonthDay]
    var End: js.UndefOr[YearMonthDay]
  }

  object DateInterval {
    def apply(
      Start: js.UndefOr[YearMonthDay] = js.undefined,
      End: js.UndefOr[YearMonthDay] = js.undefined): DateInterval = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Start" -> Start.map { x => x.asInstanceOf[js.Any] },
        "End" -> End.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DateInterval]
    }
  }

  object DimensionEnum {
    val AZ = "AZ"
    val INSTANCE_TYPE = "INSTANCE_TYPE"
    val LINKED_ACCOUNT = "LINKED_ACCOUNT"
    val OPERATION = "OPERATION"
    val PURCHASE_TYPE = "PURCHASE_TYPE"
    val REGION = "REGION"
    val SERVICE = "SERVICE"
    val USAGE_TYPE = "USAGE_TYPE"
    val USAGE_TYPE_GROUP = "USAGE_TYPE_GROUP"
    val RECORD_TYPE = "RECORD_TYPE"
    val OPERATING_SYSTEM = "OPERATING_SYSTEM"
    val TENANCY = "TENANCY"
    val SCOPE = "SCOPE"
    val PLATFORM = "PLATFORM"
    val SUBSCRIPTION_ID = "SUBSCRIPTION_ID"
    val LEGAL_ENTITY_NAME = "LEGAL_ENTITY_NAME"
    val DEPLOYMENT_OPTION = "DEPLOYMENT_OPTION"
    val DATABASE_ENGINE = "DATABASE_ENGINE"
    val CACHE_ENGINE = "CACHE_ENGINE"
    val INSTANCE_TYPE_FAMILY = "INSTANCE_TYPE_FAMILY"
    val BILLING_ENTITY = "BILLING_ENTITY"
    val RESERVATION_ID = "RESERVATION_ID"

    val values = IndexedSeq(AZ, INSTANCE_TYPE, LINKED_ACCOUNT, OPERATION, PURCHASE_TYPE, REGION, SERVICE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE, OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID, LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE, INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID)
  }

  /**
   * <p>The metadata that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.</p>
   */
  @js.native
  trait DimensionValues extends js.Object {
    var Key: js.UndefOr[Dimension]
    var Values: js.UndefOr[Values]
  }

  object DimensionValues {
    def apply(
      Key: js.UndefOr[Dimension] = js.undefined,
      Values: js.UndefOr[Values] = js.undefined): DimensionValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DimensionValues]
    }
  }

  /**
   * <p>The metadata of a specific type that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.</p>
   */
  @js.native
  trait DimensionValuesWithAttributes extends js.Object {
    var Value: js.UndefOr[Value]
    var Attributes: js.UndefOr[Attributes]
  }

  object DimensionValuesWithAttributes {
    def apply(
      Value: js.UndefOr[Value] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined): DimensionValuesWithAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DimensionValuesWithAttributes]
    }
  }

  /**
   * <p>Details about the EC2 instances that AWS recommends that you purchase.</p>
   */
  @js.native
  trait EC2InstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Platform: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var Tenancy: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var AvailabilityZone: js.UndefOr[GenericString]
    var InstanceType: js.UndefOr[GenericString]
  }

  object EC2InstanceDetails {
    def apply(
      CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
      Platform: js.UndefOr[GenericString] = js.undefined,
      Region: js.UndefOr[GenericString] = js.undefined,
      Tenancy: js.UndefOr[GenericString] = js.undefined,
      SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
      Family: js.UndefOr[GenericString] = js.undefined,
      AvailabilityZone: js.UndefOr[GenericString] = js.undefined,
      InstanceType: js.UndefOr[GenericString] = js.undefined): EC2InstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentGeneration" -> CurrentGeneration.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "SizeFlexEligible" -> SizeFlexEligible.map { x => x.asInstanceOf[js.Any] },
        "Family" -> Family.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2InstanceDetails]
    }
  }

  /**
   * <p>The EC2 hardware specifications that you want AWS to provide recommendations for.</p>
   */
  @js.native
  trait EC2Specification extends js.Object {
    var OfferingClass: js.UndefOr[OfferingClass]
  }

  object EC2Specification {
    def apply(
      OfferingClass: js.UndefOr[OfferingClass] = js.undefined): EC2Specification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OfferingClass" -> OfferingClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2Specification]
    }
  }

  /**
   * <p>Details about the ES instances that AWS recommends that you purchase.</p>
   */
  @js.native
  trait ESInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var InstanceSize: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
    var InstanceClass: js.UndefOr[GenericString]
  }

  object ESInstanceDetails {
    def apply(
      CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
      InstanceSize: js.UndefOr[GenericString] = js.undefined,
      Region: js.UndefOr[GenericString] = js.undefined,
      SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
      InstanceClass: js.UndefOr[GenericString] = js.undefined): ESInstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentGeneration" -> CurrentGeneration.map { x => x.asInstanceOf[js.Any] },
        "InstanceSize" -> InstanceSize.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "SizeFlexEligible" -> SizeFlexEligible.map { x => x.asInstanceOf[js.Any] },
        "InstanceClass" -> InstanceClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ESInstanceDetails]
    }
  }

  /**
   * <p>Details about the ElastiCache instances that AWS recommends that you purchase.</p>
   */
  @js.native
  trait ElastiCacheInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Region: js.UndefOr[GenericString]
    var NodeType: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var ProductDescription: js.UndefOr[GenericString]
  }

  object ElastiCacheInstanceDetails {
    def apply(
      CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
      Region: js.UndefOr[GenericString] = js.undefined,
      NodeType: js.UndefOr[GenericString] = js.undefined,
      SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
      Family: js.UndefOr[GenericString] = js.undefined,
      ProductDescription: js.UndefOr[GenericString] = js.undefined): ElastiCacheInstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentGeneration" -> CurrentGeneration.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "SizeFlexEligible" -> SizeFlexEligible.map { x => x.asInstanceOf[js.Any] },
        "Family" -> Family.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElastiCacheInstanceDetails]
    }
  }

  /**
   * <p>Use <code>Expression</code> to filter by cost or by usage. There are two patterns: </p> <ul> <li> <p>Simple dimension values - You can set the dimension name and values for the filters that you plan to use. For example, you can filter for <code>INSTANCE_TYPE==m4.xlarge OR INSTANCE_TYPE==c4.large</code>. The <code>Expression</code> for that looks like this:</p> <p> <code>{ "Dimensions": { "Key": "INSTANCE_TYPE", "Values": [ "m4.xlarge", �gc4.large�h ] } }</code> </p> <p>The list of dimension values are OR'd together to retrieve cost or usage data. You can create <code>Expression</code> and <code>DimensionValues</code> objects using either <code>with*</code> methods or <code>set*</code> methods in multiple lines. </p> </li> <li> <p>Compound dimension values with logical operations - You can use multiple <code>Expression</code> types and the logical operators <code>AND/OR/NOT</code> to create a list of one or more <code>Expression</code> objects. This allows you to filter on more advanced options. For example, you can filter on <code>((INSTANCE_TYPE == m4.large OR INSTANCE_TYPE == m3.large) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>. The <code>Expression</code> for that looks like this:</p> <p> <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "INSTANCE_TYPE", "Values": [ "m4.x.large", "c4.large" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code> </p> <note> <p>Because each <code>Expression</code> can have only one operator, the service returns an error if more than one is specified. The following example shows an <code>Expression</code> object that creates an error.</p> </note> <p> <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code> </p> </li> </ul>
   */
  @js.native
  trait Expression extends js.Object {
    var Dimensions: js.UndefOr[DimensionValues]
    var And: js.UndefOr[Expressions]
    var Tags: js.UndefOr[TagValues]
    var Not: js.UndefOr[Expression]
    var Or: js.UndefOr[Expressions]
  }

  object Expression {
    def apply(
      Dimensions: js.UndefOr[DimensionValues] = js.undefined,
      And: js.UndefOr[Expressions] = js.undefined,
      Tags: js.UndefOr[TagValues] = js.undefined,
      Not: js.UndefOr[Expression] = js.undefined,
      Or: js.UndefOr[Expressions] = js.undefined): Expression = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "And" -> And.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Not" -> Not.map { x => x.asInstanceOf[js.Any] },
        "Or" -> Or.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Expression]
    }
  }

  /**
   * <p>The forecast created for your query.</p>
   */
  @js.native
  trait ForecastResult extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var MeanValue: js.UndefOr[GenericString]
    var PredictionIntervalLowerBound: js.UndefOr[GenericString]
    var PredictionIntervalUpperBound: js.UndefOr[GenericString]
  }

  object ForecastResult {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      MeanValue: js.UndefOr[GenericString] = js.undefined,
      PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.undefined,
      PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.undefined): ForecastResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "MeanValue" -> MeanValue.map { x => x.asInstanceOf[js.Any] },
        "PredictionIntervalLowerBound" -> PredictionIntervalLowerBound.map { x => x.asInstanceOf[js.Any] },
        "PredictionIntervalUpperBound" -> PredictionIntervalUpperBound.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForecastResult]
    }
  }

  @js.native
  trait GetCostAndUsageRequest extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Granularity: js.UndefOr[Granularity]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
    var Filter: js.UndefOr[Expression]
  }

  object GetCostAndUsageRequest {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
      Granularity: js.UndefOr[Granularity] = js.undefined,
      Metrics: js.UndefOr[MetricNames] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
      Filter: js.UndefOr[Expression] = js.undefined): GetCostAndUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "GroupBy" -> GroupBy.map { x => x.asInstanceOf[js.Any] },
        "Granularity" -> Granularity.map { x => x.asInstanceOf[js.Any] },
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCostAndUsageRequest]
    }
  }

  @js.native
  trait GetCostAndUsageResponse extends js.Object {
    var NextPageToken: js.UndefOr[NextPageToken]
    var GroupDefinitions: js.UndefOr[GroupDefinitions]
    var ResultsByTime: js.UndefOr[ResultsByTime]
  }

  object GetCostAndUsageResponse {
    def apply(
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
      GroupDefinitions: js.UndefOr[GroupDefinitions] = js.undefined,
      ResultsByTime: js.UndefOr[ResultsByTime] = js.undefined): GetCostAndUsageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "GroupDefinitions" -> GroupDefinitions.map { x => x.asInstanceOf[js.Any] },
        "ResultsByTime" -> ResultsByTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCostAndUsageResponse]
    }
  }

  @js.native
  trait GetCostForecastRequest extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var Metric: js.UndefOr[Metric]
    var Granularity: js.UndefOr[Granularity]
    var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel]
    var Filter: js.UndefOr[Expression]
  }

  object GetCostForecastRequest {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      Metric: js.UndefOr[Metric] = js.undefined,
      Granularity: js.UndefOr[Granularity] = js.undefined,
      PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined,
      Filter: js.UndefOr[Expression] = js.undefined): GetCostForecastRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] },
        "Granularity" -> Granularity.map { x => x.asInstanceOf[js.Any] },
        "PredictionIntervalLevel" -> PredictionIntervalLevel.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCostForecastRequest]
    }
  }

  @js.native
  trait GetCostForecastResponse extends js.Object {
    var Total: js.UndefOr[MetricValue]
    var ForecastResultsByTime: js.UndefOr[ForecastResultsByTime]
  }

  object GetCostForecastResponse {
    def apply(
      Total: js.UndefOr[MetricValue] = js.undefined,
      ForecastResultsByTime: js.UndefOr[ForecastResultsByTime] = js.undefined): GetCostForecastResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] },
        "ForecastResultsByTime" -> ForecastResultsByTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCostForecastResponse]
    }
  }

  @js.native
  trait GetDimensionValuesRequest extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var SearchString: js.UndefOr[SearchString]
    var Context: js.UndefOr[Context]
    var Dimension: js.UndefOr[Dimension]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetDimensionValuesRequest {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      SearchString: js.UndefOr[SearchString] = js.undefined,
      Context: js.UndefOr[Context] = js.undefined,
      Dimension: js.UndefOr[Dimension] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetDimensionValuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "SearchString" -> SearchString.map { x => x.asInstanceOf[js.Any] },
        "Context" -> Context.map { x => x.asInstanceOf[js.Any] },
        "Dimension" -> Dimension.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDimensionValuesRequest]
    }
  }

  @js.native
  trait GetDimensionValuesResponse extends js.Object {
    var DimensionValues: js.UndefOr[DimensionValuesWithAttributesList]
    var ReturnSize: js.UndefOr[PageSize]
    var TotalSize: js.UndefOr[PageSize]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetDimensionValuesResponse {
    def apply(
      DimensionValues: js.UndefOr[DimensionValuesWithAttributesList] = js.undefined,
      ReturnSize: js.UndefOr[PageSize] = js.undefined,
      TotalSize: js.UndefOr[PageSize] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetDimensionValuesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DimensionValues" -> DimensionValues.map { x => x.asInstanceOf[js.Any] },
        "ReturnSize" -> ReturnSize.map { x => x.asInstanceOf[js.Any] },
        "TotalSize" -> TotalSize.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDimensionValuesResponse]
    }
  }

  /**
   * <p>You can use the following request parameters to query for how much of your instance usage is covered by a reservation.</p>
   */
  @js.native
  trait GetReservationCoverageRequest extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Granularity: js.UndefOr[Granularity]
    var NextPageToken: js.UndefOr[NextPageToken]
    var Filter: js.UndefOr[Expression]
  }

  object GetReservationCoverageRequest {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
      Granularity: js.UndefOr[Granularity] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
      Filter: js.UndefOr[Expression] = js.undefined): GetReservationCoverageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "GroupBy" -> GroupBy.map { x => x.asInstanceOf[js.Any] },
        "Granularity" -> Granularity.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservationCoverageRequest]
    }
  }

  @js.native
  trait GetReservationCoverageResponse extends js.Object {
    var CoveragesByTime: js.UndefOr[CoveragesByTime]
    var Total: js.UndefOr[Coverage]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetReservationCoverageResponse {
    def apply(
      CoveragesByTime: js.UndefOr[CoveragesByTime] = js.undefined,
      Total: js.UndefOr[Coverage] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetReservationCoverageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoveragesByTime" -> CoveragesByTime.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservationCoverageResponse]
    }
  }

  @js.native
  trait GetReservationPurchaseRecommendationRequest extends js.Object {
    var PaymentOption: js.UndefOr[PaymentOption]
    var ServiceSpecification: js.UndefOr[ServiceSpecification]
    var PageSize: js.UndefOr[NonNegativeInteger]
    var TermInYears: js.UndefOr[TermInYears]
    var Service: js.UndefOr[GenericString]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var AccountScope: js.UndefOr[AccountScope]
    var AccountId: js.UndefOr[GenericString]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetReservationPurchaseRecommendationRequest {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined,
      PageSize: js.UndefOr[NonNegativeInteger] = js.undefined,
      TermInYears: js.UndefOr[TermInYears] = js.undefined,
      Service: js.UndefOr[GenericString] = js.undefined,
      LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
      AccountScope: js.UndefOr[AccountScope] = js.undefined,
      AccountId: js.UndefOr[GenericString] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetReservationPurchaseRecommendationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecification" -> ServiceSpecification.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "TermInYears" -> TermInYears.map { x => x.asInstanceOf[js.Any] },
        "Service" -> Service.map { x => x.asInstanceOf[js.Any] },
        "LookbackPeriodInDays" -> LookbackPeriodInDays.map { x => x.asInstanceOf[js.Any] },
        "AccountScope" -> AccountScope.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservationPurchaseRecommendationRequest]
    }
  }

  @js.native
  trait GetReservationPurchaseRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata]
    var Recommendations: js.UndefOr[ReservationPurchaseRecommendations]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetReservationPurchaseRecommendationResponse {
    def apply(
      Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.undefined,
      Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetReservationPurchaseRecommendationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Recommendations" -> Recommendations.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservationPurchaseRecommendationResponse]
    }
  }

  @js.native
  trait GetReservationUtilizationRequest extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Granularity: js.UndefOr[Granularity]
    var NextPageToken: js.UndefOr[NextPageToken]
    var Filter: js.UndefOr[Expression]
  }

  object GetReservationUtilizationRequest {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
      Granularity: js.UndefOr[Granularity] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
      Filter: js.UndefOr[Expression] = js.undefined): GetReservationUtilizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "GroupBy" -> GroupBy.map { x => x.asInstanceOf[js.Any] },
        "Granularity" -> Granularity.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservationUtilizationRequest]
    }
  }

  @js.native
  trait GetReservationUtilizationResponse extends js.Object {
    var UtilizationsByTime: js.UndefOr[UtilizationsByTime]
    var Total: js.UndefOr[ReservationAggregates]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetReservationUtilizationResponse {
    def apply(
      UtilizationsByTime: js.UndefOr[UtilizationsByTime] = js.undefined,
      Total: js.UndefOr[ReservationAggregates] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetReservationUtilizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UtilizationsByTime" -> UtilizationsByTime.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservationUtilizationResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var SearchString: js.UndefOr[SearchString]
    var TimePeriod: js.UndefOr[DateInterval]
    var TagKey: js.UndefOr[TagKey]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetTagsRequest {
    def apply(
      SearchString: js.UndefOr[SearchString] = js.undefined,
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      TagKey: js.UndefOr[TagKey] = js.undefined,
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined): GetTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SearchString" -> SearchString.map { x => x.asInstanceOf[js.Any] },
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "TagKey" -> TagKey.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsRequest]
    }
  }

  @js.native
  trait GetTagsResponse extends js.Object {
    var NextPageToken: js.UndefOr[NextPageToken]
    var Tags: js.UndefOr[TagList]
    var ReturnSize: js.UndefOr[PageSize]
    var TotalSize: js.UndefOr[PageSize]
  }

  object GetTagsResponse {
    def apply(
      NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ReturnSize: js.UndefOr[PageSize] = js.undefined,
      TotalSize: js.UndefOr[PageSize] = js.undefined): GetTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ReturnSize" -> ReturnSize.map { x => x.asInstanceOf[js.Any] },
        "TotalSize" -> TotalSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsResponse]
    }
  }

  object GranularityEnum {
    val DAILY = "DAILY"
    val MONTHLY = "MONTHLY"
    val HOURLY = "HOURLY"

    val values = IndexedSeq(DAILY, MONTHLY, HOURLY)
  }

  /**
   * <p>One level of grouped data within the results.</p>
   */
  @js.native
  trait Group extends js.Object {
    var Keys: js.UndefOr[Keys]
    var Metrics: js.UndefOr[Metrics]
  }

  object Group {
    def apply(
      Keys: js.UndefOr[Keys] = js.undefined,
      Metrics: js.UndefOr[Metrics] = js.undefined): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] },
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
   * <p>Represents a group when you specify a group by criteria, or in the response to a query with a specific grouping.</p>
   */
  @js.native
  trait GroupDefinition extends js.Object {
    var Type: js.UndefOr[GroupDefinitionType]
    var Key: js.UndefOr[GroupDefinitionKey]
  }

  object GroupDefinition {
    def apply(
      Type: js.UndefOr[GroupDefinitionType] = js.undefined,
      Key: js.UndefOr[GroupDefinitionKey] = js.undefined): GroupDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupDefinition]
    }
  }

  object GroupDefinitionTypeEnum {
    val DIMENSION = "DIMENSION"
    val TAG = "TAG"

    val values = IndexedSeq(DIMENSION, TAG)
  }

  /**
   * <p>Details about the instances that AWS recommends that you purchase.</p>
   */
  @js.native
  trait InstanceDetails extends js.Object {
    var ESInstanceDetails: js.UndefOr[ESInstanceDetails]
    var EC2InstanceDetails: js.UndefOr[EC2InstanceDetails]
    var RDSInstanceDetails: js.UndefOr[RDSInstanceDetails]
    var ElastiCacheInstanceDetails: js.UndefOr[ElastiCacheInstanceDetails]
    var RedshiftInstanceDetails: js.UndefOr[RedshiftInstanceDetails]
  }

  object InstanceDetails {
    def apply(
      ESInstanceDetails: js.UndefOr[ESInstanceDetails] = js.undefined,
      EC2InstanceDetails: js.UndefOr[EC2InstanceDetails] = js.undefined,
      RDSInstanceDetails: js.UndefOr[RDSInstanceDetails] = js.undefined,
      ElastiCacheInstanceDetails: js.UndefOr[ElastiCacheInstanceDetails] = js.undefined,
      RedshiftInstanceDetails: js.UndefOr[RedshiftInstanceDetails] = js.undefined): InstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ESInstanceDetails" -> ESInstanceDetails.map { x => x.asInstanceOf[js.Any] },
        "EC2InstanceDetails" -> EC2InstanceDetails.map { x => x.asInstanceOf[js.Any] },
        "RDSInstanceDetails" -> RDSInstanceDetails.map { x => x.asInstanceOf[js.Any] },
        "ElastiCacheInstanceDetails" -> ElastiCacheInstanceDetails.map { x => x.asInstanceOf[js.Any] },
        "RedshiftInstanceDetails" -> RedshiftInstanceDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceDetails]
    }
  }

  object LookbackPeriodInDaysEnum {
    val SEVEN_DAYS = "SEVEN_DAYS"
    val THIRTY_DAYS = "THIRTY_DAYS"
    val SIXTY_DAYS = "SIXTY_DAYS"

    val values = IndexedSeq(SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS)
  }

  object MetricEnum {
    val BLENDED_COST = "BLENDED_COST"
    val UNBLENDED_COST = "UNBLENDED_COST"
    val AMORTIZED_COST = "AMORTIZED_COST"
    val NET_UNBLENDED_COST = "NET_UNBLENDED_COST"
    val NET_AMORTIZED_COST = "NET_AMORTIZED_COST"
    val USAGE_QUANTITY = "USAGE_QUANTITY"
    val NORMALIZED_USAGE_AMOUNT = "NORMALIZED_USAGE_AMOUNT"

    val values = IndexedSeq(BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST, NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY, NORMALIZED_USAGE_AMOUNT)
  }

  /**
   * <p>The aggregated value for a metric.</p>
   */
  @js.native
  trait MetricValue extends js.Object {
    var Amount: js.UndefOr[MetricAmount]
    var Unit: js.UndefOr[MetricUnit]
  }

  object MetricValue {
    def apply(
      Amount: js.UndefOr[MetricAmount] = js.undefined,
      Unit: js.UndefOr[MetricUnit] = js.undefined): MetricValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Amount" -> Amount.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricValue]
    }
  }

  object OfferingClassEnum {
    val STANDARD = "STANDARD"
    val CONVERTIBLE = "CONVERTIBLE"

    val values = IndexedSeq(STANDARD, CONVERTIBLE)
  }

  object PaymentOptionEnum {
    val NO_UPFRONT = "NO_UPFRONT"
    val PARTIAL_UPFRONT = "PARTIAL_UPFRONT"
    val ALL_UPFRONT = "ALL_UPFRONT"
    val LIGHT_UTILIZATION = "LIGHT_UTILIZATION"
    val MEDIUM_UTILIZATION = "MEDIUM_UTILIZATION"
    val HEAVY_UTILIZATION = "HEAVY_UTILIZATION"

    val values = IndexedSeq(NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT, LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION)
  }

  /**
   * <p>Details about the RDS instances that AWS recommends that you purchase.</p>
   */
  @js.native
  trait RDSInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Region: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
    var DatabaseEngine: js.UndefOr[GenericString]
    var InstanceType: js.UndefOr[GenericString]
    var DeploymentOption: js.UndefOr[GenericString]
    var DatabaseEdition: js.UndefOr[GenericString]
    var LicenseModel: js.UndefOr[GenericString]
  }

  object RDSInstanceDetails {
    def apply(
      CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
      Region: js.UndefOr[GenericString] = js.undefined,
      SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
      Family: js.UndefOr[GenericString] = js.undefined,
      DatabaseEngine: js.UndefOr[GenericString] = js.undefined,
      InstanceType: js.UndefOr[GenericString] = js.undefined,
      DeploymentOption: js.UndefOr[GenericString] = js.undefined,
      DatabaseEdition: js.UndefOr[GenericString] = js.undefined,
      LicenseModel: js.UndefOr[GenericString] = js.undefined): RDSInstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentGeneration" -> CurrentGeneration.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "SizeFlexEligible" -> SizeFlexEligible.map { x => x.asInstanceOf[js.Any] },
        "Family" -> Family.map { x => x.asInstanceOf[js.Any] },
        "DatabaseEngine" -> DatabaseEngine.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "DeploymentOption" -> DeploymentOption.map { x => x.asInstanceOf[js.Any] },
        "DatabaseEdition" -> DatabaseEdition.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSInstanceDetails]
    }
  }

  /**
   * <p>Details about the Amazon Redshift instances that AWS recommends that you purchase.</p>
   */
  @js.native
  trait RedshiftInstanceDetails extends js.Object {
    var CurrentGeneration: js.UndefOr[GenericBoolean]
    var Region: js.UndefOr[GenericString]
    var NodeType: js.UndefOr[GenericString]
    var SizeFlexEligible: js.UndefOr[GenericBoolean]
    var Family: js.UndefOr[GenericString]
  }

  object RedshiftInstanceDetails {
    def apply(
      CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
      Region: js.UndefOr[GenericString] = js.undefined,
      NodeType: js.UndefOr[GenericString] = js.undefined,
      SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
      Family: js.UndefOr[GenericString] = js.undefined): RedshiftInstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentGeneration" -> CurrentGeneration.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "SizeFlexEligible" -> SizeFlexEligible.map { x => x.asInstanceOf[js.Any] },
        "Family" -> Family.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftInstanceDetails]
    }
  }

  /**
   * <p>The aggregated numbers for your Reserved Instance (RI) usage.</p>
   */
  @js.native
  trait ReservationAggregates extends js.Object {
    var PurchasedHours: js.UndefOr[PurchasedHours]
    var OnDemandCostOfRIHoursUsed: js.UndefOr[OnDemandCostOfRIHoursUsed]
    var AmortizedUpfrontFee: js.UndefOr[AmortizedUpfrontFee]
    var TotalAmortizedFee: js.UndefOr[TotalAmortizedFee]
    var TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings]
    var NetRISavings: js.UndefOr[NetRISavings]
    var UnusedHours: js.UndefOr[UnusedHours]
    var AmortizedRecurringFee: js.UndefOr[AmortizedRecurringFee]
    var TotalActualHours: js.UndefOr[TotalActualHours]
    var UtilizationPercentage: js.UndefOr[UtilizationPercentage]
  }

  object ReservationAggregates {
    def apply(
      PurchasedHours: js.UndefOr[PurchasedHours] = js.undefined,
      OnDemandCostOfRIHoursUsed: js.UndefOr[OnDemandCostOfRIHoursUsed] = js.undefined,
      AmortizedUpfrontFee: js.UndefOr[AmortizedUpfrontFee] = js.undefined,
      TotalAmortizedFee: js.UndefOr[TotalAmortizedFee] = js.undefined,
      TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings] = js.undefined,
      NetRISavings: js.UndefOr[NetRISavings] = js.undefined,
      UnusedHours: js.UndefOr[UnusedHours] = js.undefined,
      AmortizedRecurringFee: js.UndefOr[AmortizedRecurringFee] = js.undefined,
      TotalActualHours: js.UndefOr[TotalActualHours] = js.undefined,
      UtilizationPercentage: js.UndefOr[UtilizationPercentage] = js.undefined): ReservationAggregates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PurchasedHours" -> PurchasedHours.map { x => x.asInstanceOf[js.Any] },
        "OnDemandCostOfRIHoursUsed" -> OnDemandCostOfRIHoursUsed.map { x => x.asInstanceOf[js.Any] },
        "AmortizedUpfrontFee" -> AmortizedUpfrontFee.map { x => x.asInstanceOf[js.Any] },
        "TotalAmortizedFee" -> TotalAmortizedFee.map { x => x.asInstanceOf[js.Any] },
        "TotalPotentialRISavings" -> TotalPotentialRISavings.map { x => x.asInstanceOf[js.Any] },
        "NetRISavings" -> NetRISavings.map { x => x.asInstanceOf[js.Any] },
        "UnusedHours" -> UnusedHours.map { x => x.asInstanceOf[js.Any] },
        "AmortizedRecurringFee" -> AmortizedRecurringFee.map { x => x.asInstanceOf[js.Any] },
        "TotalActualHours" -> TotalActualHours.map { x => x.asInstanceOf[js.Any] },
        "UtilizationPercentage" -> UtilizationPercentage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationAggregates]
    }
  }

  /**
   * <p>A group of reservations that share a set of attributes.</p>
   */
  @js.native
  trait ReservationCoverageGroup extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Coverage: js.UndefOr[Coverage]
  }

  object ReservationCoverageGroup {
    def apply(
      Attributes: js.UndefOr[Attributes] = js.undefined,
      Coverage: js.UndefOr[Coverage] = js.undefined): ReservationCoverageGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "Coverage" -> Coverage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationCoverageGroup]
    }
  }

  /**
   * <p>A specific reservation that AWS recommends for purchase.</p>
   */
  @js.native
  trait ReservationPurchaseRecommendation extends js.Object {
    var PaymentOption: js.UndefOr[PaymentOption]
    var ServiceSpecification: js.UndefOr[ServiceSpecification]
    var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails]
    var TermInYears: js.UndefOr[TermInYears]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var AccountScope: js.UndefOr[AccountScope]
    var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary]
  }

  object ReservationPurchaseRecommendation {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined,
      RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.undefined,
      TermInYears: js.UndefOr[TermInYears] = js.undefined,
      LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
      AccountScope: js.UndefOr[AccountScope] = js.undefined,
      RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.undefined): ReservationPurchaseRecommendation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "ServiceSpecification" -> ServiceSpecification.map { x => x.asInstanceOf[js.Any] },
        "RecommendationDetails" -> RecommendationDetails.map { x => x.asInstanceOf[js.Any] },
        "TermInYears" -> TermInYears.map { x => x.asInstanceOf[js.Any] },
        "LookbackPeriodInDays" -> LookbackPeriodInDays.map { x => x.asInstanceOf[js.Any] },
        "AccountScope" -> AccountScope.map { x => x.asInstanceOf[js.Any] },
        "RecommendationSummary" -> RecommendationSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationPurchaseRecommendation]
    }
  }

  /**
   * <p>Details about your recommended reservation purchase.</p>
   */
  @js.native
  trait ReservationPurchaseRecommendationDetail extends js.Object {
    var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString]
    var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString]
    var RecurringStandardMonthlyCost: js.UndefOr[GenericString]
    var CurrencyCode: js.UndefOr[GenericString]
    var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString]
    var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString]
    var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var EstimatedBreakEvenInMonths: js.UndefOr[GenericString]
    var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString]
    var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString]
    var AverageUtilization: js.UndefOr[GenericString]
    var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString]
    var AccountId: js.UndefOr[GenericString]
    var UpfrontCost: js.UndefOr[GenericString]
    var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString]
    var InstanceDetails: js.UndefOr[InstanceDetails]
    var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString]
    var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString]
    var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString]
  }

  object ReservationPurchaseRecommendationDetail {
    def apply(
      EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined,
      AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined,
      RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.undefined,
      CurrencyCode: js.UndefOr[GenericString] = js.undefined,
      EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.undefined,
      RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.undefined,
      EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
      EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.undefined,
      AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined,
      MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined,
      AverageUtilization: js.UndefOr[GenericString] = js.undefined,
      MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined,
      AccountId: js.UndefOr[GenericString] = js.undefined,
      UpfrontCost: js.UndefOr[GenericString] = js.undefined,
      MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined,
      InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined,
      RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.undefined,
      MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined,
      EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.undefined): ReservationPurchaseRecommendationDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EstimatedMonthlySavingsPercentage" -> EstimatedMonthlySavingsPercentage.map { x => x.asInstanceOf[js.Any] },
        "AverageNumberOfInstancesUsedPerHour" -> AverageNumberOfInstancesUsedPerHour.map { x => x.asInstanceOf[js.Any] },
        "RecurringStandardMonthlyCost" -> RecurringStandardMonthlyCost.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "EstimatedMonthlyOnDemandCost" -> EstimatedMonthlyOnDemandCost.map { x => x.asInstanceOf[js.Any] },
        "RecommendedNumberOfInstancesToPurchase" -> RecommendedNumberOfInstancesToPurchase.map { x => x.asInstanceOf[js.Any] },
        "EstimatedMonthlySavingsAmount" -> EstimatedMonthlySavingsAmount.map { x => x.asInstanceOf[js.Any] },
        "EstimatedBreakEvenInMonths" -> EstimatedBreakEvenInMonths.map { x => x.asInstanceOf[js.Any] },
        "AverageNormalizedUnitsUsedPerHour" -> AverageNormalizedUnitsUsedPerHour.map { x => x.asInstanceOf[js.Any] },
        "MinimumNormalizedUnitsUsedPerHour" -> MinimumNormalizedUnitsUsedPerHour.map { x => x.asInstanceOf[js.Any] },
        "AverageUtilization" -> AverageUtilization.map { x => x.asInstanceOf[js.Any] },
        "MaximumNumberOfInstancesUsedPerHour" -> MaximumNumberOfInstancesUsedPerHour.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UpfrontCost" -> UpfrontCost.map { x => x.asInstanceOf[js.Any] },
        "MaximumNormalizedUnitsUsedPerHour" -> MaximumNormalizedUnitsUsedPerHour.map { x => x.asInstanceOf[js.Any] },
        "InstanceDetails" -> InstanceDetails.map { x => x.asInstanceOf[js.Any] },
        "RecommendedNormalizedUnitsToPurchase" -> RecommendedNormalizedUnitsToPurchase.map { x => x.asInstanceOf[js.Any] },
        "MinimumNumberOfInstancesUsedPerHour" -> MinimumNumberOfInstancesUsedPerHour.map { x => x.asInstanceOf[js.Any] },
        "EstimatedReservationCostForLookbackPeriod" -> EstimatedReservationCostForLookbackPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationPurchaseRecommendationDetail]
    }
  }

  /**
   * <p>Information about this specific recommendation, such as the time stamp for when AWS made a specific recommendation.</p>
   */
  @js.native
  trait ReservationPurchaseRecommendationMetadata extends js.Object {
    var RecommendationId: js.UndefOr[GenericString]
    var GenerationTimestamp: js.UndefOr[GenericString]
  }

  object ReservationPurchaseRecommendationMetadata {
    def apply(
      RecommendationId: js.UndefOr[GenericString] = js.undefined,
      GenerationTimestamp: js.UndefOr[GenericString] = js.undefined): ReservationPurchaseRecommendationMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecommendationId" -> RecommendationId.map { x => x.asInstanceOf[js.Any] },
        "GenerationTimestamp" -> GenerationTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationPurchaseRecommendationMetadata]
    }
  }

  /**
   * <p>A summary about this recommendation, such as the currency code, the amount that AWS estimates that you could save, and the total amount of reservation to purchase.</p>
   */
  @js.native
  trait ReservationPurchaseRecommendationSummary extends js.Object {
    var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString]
    var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString]
    var CurrencyCode: js.UndefOr[GenericString]
  }

  object ReservationPurchaseRecommendationSummary {
    def apply(
      TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
      TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined,
      CurrencyCode: js.UndefOr[GenericString] = js.undefined): ReservationPurchaseRecommendationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalEstimatedMonthlySavingsAmount" -> TotalEstimatedMonthlySavingsAmount.map { x => x.asInstanceOf[js.Any] },
        "TotalEstimatedMonthlySavingsPercentage" -> TotalEstimatedMonthlySavingsPercentage.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationPurchaseRecommendationSummary]
    }
  }

  /**
   * <p>A group of Reserved Instances (RIs) that share a set of attributes.</p>
   */
  @js.native
  trait ReservationUtilizationGroup extends js.Object {
    var Key: js.UndefOr[ReservationGroupKey]
    var Value: js.UndefOr[ReservationGroupValue]
    var Attributes: js.UndefOr[Attributes]
    var Utilization: js.UndefOr[ReservationAggregates]
  }

  object ReservationUtilizationGroup {
    def apply(
      Key: js.UndefOr[ReservationGroupKey] = js.undefined,
      Value: js.UndefOr[ReservationGroupValue] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined,
      Utilization: js.UndefOr[ReservationAggregates] = js.undefined): ReservationUtilizationGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "Utilization" -> Utilization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationUtilizationGroup]
    }
  }

  /**
   * <p>The result that is associated with a time period.</p>
   */
  @js.native
  trait ResultByTime extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var Total: js.UndefOr[Metrics]
    var Groups: js.UndefOr[Groups]
    var Estimated: js.UndefOr[Estimated]
  }

  object ResultByTime {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      Total: js.UndefOr[Metrics] = js.undefined,
      Groups: js.UndefOr[Groups] = js.undefined,
      Estimated: js.UndefOr[Estimated] = js.undefined): ResultByTime = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Estimated" -> Estimated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultByTime]
    }
  }

  /**
   * <p>Hardware specifications for the service that you want recommendations for.</p>
   */
  @js.native
  trait ServiceSpecification extends js.Object {
    var EC2Specification: js.UndefOr[EC2Specification]
  }

  object ServiceSpecification {
    def apply(
      EC2Specification: js.UndefOr[EC2Specification] = js.undefined): ServiceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2Specification" -> EC2Specification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSpecification]
    }
  }

  /**
   * <p>The values that are available for a tag.</p>
   */
  @js.native
  trait TagValues extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[Values]
  }

  object TagValues {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Values: js.UndefOr[Values] = js.undefined): TagValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagValues]
    }
  }

  object TermInYearsEnum {
    val ONE_YEAR = "ONE_YEAR"
    val THREE_YEARS = "THREE_YEARS"

    val values = IndexedSeq(ONE_YEAR, THREE_YEARS)
  }

  /**
   * <p>The amount of utilization, in hours.</p>
   */
  @js.native
  trait UtilizationByTime extends js.Object {
    var TimePeriod: js.UndefOr[DateInterval]
    var Groups: js.UndefOr[ReservationUtilizationGroups]
    var Total: js.UndefOr[ReservationAggregates]
  }

  object UtilizationByTime {
    def apply(
      TimePeriod: js.UndefOr[DateInterval] = js.undefined,
      Groups: js.UndefOr[ReservationUtilizationGroups] = js.undefined,
      Total: js.UndefOr[ReservationAggregates] = js.undefined): UtilizationByTime = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UtilizationByTime]
    }
  }
}
