package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object costexplorer {
  type AmortizedRecurringFee = String
  type AmortizedUpfrontFee = String
  type Anomalies = js.Array[Anomaly]
  type AnomalyMonitors = js.Array[AnomalyMonitor]
  type AnomalySubscriptions = js.Array[AnomalySubscription]
  type Arn = String
  type AttributeType = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type CostCategoryMaxResults = Int
  type CostCategoryName = String
  type CostCategoryNamesList = js.Array[CostCategoryName]
  type CostCategoryProcessingStatusList = js.Array[CostCategoryProcessingStatus]
  type CostCategoryReferencesList = js.Array[CostCategoryReference]
  type CostCategoryRulesList = js.Array[CostCategoryRule]
  type CostCategoryValue = String
  type CostCategoryValuesList = js.Array[CostCategoryValue]
  type CoverageHoursPercentage = String
  type CoverageNormalizedUnitsPercentage = String
  type CoveragesByTime = js.Array[CoverageByTime]
  type DimensionValuesWithAttributesList = js.Array[DimensionValuesWithAttributes]
  type Entity = String
  type Estimated = Boolean
  type Expressions = js.Array[Expression]
  type ForecastResultsByTime = js.Array[ForecastResult]
  type GenericBoolean = Boolean
  type GenericDouble = Double
  type GenericString = String
  type GroupDefinitionKey = String
  type GroupDefinitions = js.Array[GroupDefinition]
  type Groups = js.Array[Group]
  type Key = String
  type Keys = js.Array[Key]
  type MatchOptions = js.Array[MatchOption]
  type MaxResults = Int
  type MetricAmount = String
  type MetricName = String
  type MetricNames = js.Array[MetricName]
  type MetricUnit = String
  type Metrics = js.Dictionary[MetricValue]
  type MonitorArnList = js.Array[Arn]
  type NetRISavings = String
  type NextPageToken = String
  type NonNegativeInteger = Int
  type NullableNonNegativeDouble = Double
  type OnDemandCost = String
  type OnDemandCostOfRIHoursUsed = String
  type OnDemandHours = String
  type OnDemandNormalizedUnits = String
  type PageSize = Int
  type PredictionIntervalLevel = Int
  type PurchasedHours = String
  type PurchasedUnits = String
  type RICostForUnusedHours = String
  type RealizedSavings = String
  type ReservationCoverageGroups = js.Array[ReservationCoverageGroup]
  type ReservationGroupKey = String
  type ReservationGroupValue = String
  type ReservationPurchaseRecommendationDetails = js.Array[ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[ReservationUtilizationGroup]
  type ReservedHours = String
  type ReservedNormalizedUnits = String
  type ResultsByTime = js.Array[ResultByTime]
  type RightsizingRecommendationList = js.Array[RightsizingRecommendation]
  type RootCauses = js.Array[RootCause]
  type SavingsPlanArn = String
  type SavingsPlansCoverages = js.Array[SavingsPlansCoverage]
  type SavingsPlansDataTypes = js.Array[SavingsPlansDataType]
  type SavingsPlansPurchaseRecommendationDetailList = js.Array[SavingsPlansPurchaseRecommendationDetail]
  type SavingsPlansUtilizationDetails = js.Array[SavingsPlansUtilizationDetail]
  type SavingsPlansUtilizationsByTime = js.Array[SavingsPlansUtilizationByTime]
  type SearchString = String
  type SortDefinitionKey = String
  type SortDefinitions = js.Array[SortDefinition]
  type SubscriberAddress = String
  type Subscribers = js.Array[Subscriber]
  type TagKey = String
  type TagList = js.Array[Entity]
  type TagValuesList = js.Array[TagValues]
  type TargetInstancesList = js.Array[TargetInstance]
  type TotalActualHours = String
  type TotalActualUnits = String
  type TotalAmortizedFee = String
  type TotalPotentialRISavings = String
  type TotalRunningHours = String
  type TotalRunningNormalizedUnits = String
  type UnrealizedSavings = String
  type UnusedHours = String
  type UnusedUnits = String
  type UtilizationPercentage = String
  type UtilizationPercentageInUnits = String
  type UtilizationsByTime = js.Array[UtilizationByTime]
  type Value = String
  type Values = js.Array[Value]
  type YearMonthDay = String
  type ZonedDateTime = String

  final class CostExplorerOps(private val service: CostExplorer) extends AnyVal {

    @inline def createAnomalyMonitorFuture(params: CreateAnomalyMonitorRequest): Future[CreateAnomalyMonitorResponse] = service.createAnomalyMonitor(params).promise().toFuture
    @inline def createAnomalySubscriptionFuture(params: CreateAnomalySubscriptionRequest): Future[CreateAnomalySubscriptionResponse] = service.createAnomalySubscription(params).promise().toFuture
    @inline def createCostCategoryDefinitionFuture(params: CreateCostCategoryDefinitionRequest): Future[CreateCostCategoryDefinitionResponse] = service.createCostCategoryDefinition(params).promise().toFuture
    @inline def deleteAnomalyMonitorFuture(params: DeleteAnomalyMonitorRequest): Future[DeleteAnomalyMonitorResponse] = service.deleteAnomalyMonitor(params).promise().toFuture
    @inline def deleteAnomalySubscriptionFuture(params: DeleteAnomalySubscriptionRequest): Future[DeleteAnomalySubscriptionResponse] = service.deleteAnomalySubscription(params).promise().toFuture
    @inline def deleteCostCategoryDefinitionFuture(params: DeleteCostCategoryDefinitionRequest): Future[DeleteCostCategoryDefinitionResponse] = service.deleteCostCategoryDefinition(params).promise().toFuture
    @inline def describeCostCategoryDefinitionFuture(params: DescribeCostCategoryDefinitionRequest): Future[DescribeCostCategoryDefinitionResponse] = service.describeCostCategoryDefinition(params).promise().toFuture
    @inline def getAnomaliesFuture(params: GetAnomaliesRequest): Future[GetAnomaliesResponse] = service.getAnomalies(params).promise().toFuture
    @inline def getAnomalyMonitorsFuture(params: GetAnomalyMonitorsRequest): Future[GetAnomalyMonitorsResponse] = service.getAnomalyMonitors(params).promise().toFuture
    @inline def getAnomalySubscriptionsFuture(params: GetAnomalySubscriptionsRequest): Future[GetAnomalySubscriptionsResponse] = service.getAnomalySubscriptions(params).promise().toFuture
    @inline def getCostAndUsageFuture(params: GetCostAndUsageRequest): Future[GetCostAndUsageResponse] = service.getCostAndUsage(params).promise().toFuture
    @inline def getCostAndUsageWithResourcesFuture(params: GetCostAndUsageWithResourcesRequest): Future[GetCostAndUsageWithResourcesResponse] = service.getCostAndUsageWithResources(params).promise().toFuture
    @inline def getCostCategoriesFuture(params: GetCostCategoriesRequest): Future[GetCostCategoriesResponse] = service.getCostCategories(params).promise().toFuture
    @inline def getCostForecastFuture(params: GetCostForecastRequest): Future[GetCostForecastResponse] = service.getCostForecast(params).promise().toFuture
    @inline def getDimensionValuesFuture(params: GetDimensionValuesRequest): Future[GetDimensionValuesResponse] = service.getDimensionValues(params).promise().toFuture
    @inline def getReservationCoverageFuture(params: GetReservationCoverageRequest): Future[GetReservationCoverageResponse] = service.getReservationCoverage(params).promise().toFuture
    @inline def getReservationPurchaseRecommendationFuture(params: GetReservationPurchaseRecommendationRequest): Future[GetReservationPurchaseRecommendationResponse] = service.getReservationPurchaseRecommendation(params).promise().toFuture
    @inline def getReservationUtilizationFuture(params: GetReservationUtilizationRequest): Future[GetReservationUtilizationResponse] = service.getReservationUtilization(params).promise().toFuture
    @inline def getRightsizingRecommendationFuture(params: GetRightsizingRecommendationRequest): Future[GetRightsizingRecommendationResponse] = service.getRightsizingRecommendation(params).promise().toFuture
    @inline def getSavingsPlansCoverageFuture(params: GetSavingsPlansCoverageRequest): Future[GetSavingsPlansCoverageResponse] = service.getSavingsPlansCoverage(params).promise().toFuture
    @inline def getSavingsPlansPurchaseRecommendationFuture(params: GetSavingsPlansPurchaseRecommendationRequest): Future[GetSavingsPlansPurchaseRecommendationResponse] = service.getSavingsPlansPurchaseRecommendation(params).promise().toFuture
    @inline def getSavingsPlansUtilizationDetailsFuture(params: GetSavingsPlansUtilizationDetailsRequest): Future[GetSavingsPlansUtilizationDetailsResponse] = service.getSavingsPlansUtilizationDetails(params).promise().toFuture
    @inline def getSavingsPlansUtilizationFuture(params: GetSavingsPlansUtilizationRequest): Future[GetSavingsPlansUtilizationResponse] = service.getSavingsPlansUtilization(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] = service.getTags(params).promise().toFuture
    @inline def getUsageForecastFuture(params: GetUsageForecastRequest): Future[GetUsageForecastResponse] = service.getUsageForecast(params).promise().toFuture
    @inline def listCostCategoryDefinitionsFuture(params: ListCostCategoryDefinitionsRequest): Future[ListCostCategoryDefinitionsResponse] = service.listCostCategoryDefinitions(params).promise().toFuture
    @inline def provideAnomalyFeedbackFuture(params: ProvideAnomalyFeedbackRequest): Future[ProvideAnomalyFeedbackResponse] = service.provideAnomalyFeedback(params).promise().toFuture
    @inline def updateAnomalyMonitorFuture(params: UpdateAnomalyMonitorRequest): Future[UpdateAnomalyMonitorResponse] = service.updateAnomalyMonitor(params).promise().toFuture
    @inline def updateAnomalySubscriptionFuture(params: UpdateAnomalySubscriptionRequest): Future[UpdateAnomalySubscriptionResponse] = service.updateAnomalySubscription(params).promise().toFuture
    @inline def updateCostCategoryDefinitionFuture(params: UpdateCostCategoryDefinitionRequest): Future[UpdateCostCategoryDefinitionResponse] = service.updateCostCategoryDefinition(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/costexplorer", JSImport.Namespace, "AWS.CostExplorer")
  class CostExplorer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAnomalyMonitor(params: CreateAnomalyMonitorRequest): Request[CreateAnomalyMonitorResponse] = js.native
    def createAnomalySubscription(params: CreateAnomalySubscriptionRequest): Request[CreateAnomalySubscriptionResponse] = js.native
    def createCostCategoryDefinition(params: CreateCostCategoryDefinitionRequest): Request[CreateCostCategoryDefinitionResponse] = js.native
    def deleteAnomalyMonitor(params: DeleteAnomalyMonitorRequest): Request[DeleteAnomalyMonitorResponse] = js.native
    def deleteAnomalySubscription(params: DeleteAnomalySubscriptionRequest): Request[DeleteAnomalySubscriptionResponse] = js.native
    def deleteCostCategoryDefinition(params: DeleteCostCategoryDefinitionRequest): Request[DeleteCostCategoryDefinitionResponse] = js.native
    def describeCostCategoryDefinition(params: DescribeCostCategoryDefinitionRequest): Request[DescribeCostCategoryDefinitionResponse] = js.native
    def getAnomalies(params: GetAnomaliesRequest): Request[GetAnomaliesResponse] = js.native
    def getAnomalyMonitors(params: GetAnomalyMonitorsRequest): Request[GetAnomalyMonitorsResponse] = js.native
    def getAnomalySubscriptions(params: GetAnomalySubscriptionsRequest): Request[GetAnomalySubscriptionsResponse] = js.native
    def getCostAndUsage(params: GetCostAndUsageRequest): Request[GetCostAndUsageResponse] = js.native
    def getCostAndUsageWithResources(params: GetCostAndUsageWithResourcesRequest): Request[GetCostAndUsageWithResourcesResponse] = js.native
    def getCostCategories(params: GetCostCategoriesRequest): Request[GetCostCategoriesResponse] = js.native
    def getCostForecast(params: GetCostForecastRequest): Request[GetCostForecastResponse] = js.native
    def getDimensionValues(params: GetDimensionValuesRequest): Request[GetDimensionValuesResponse] = js.native
    def getReservationCoverage(params: GetReservationCoverageRequest): Request[GetReservationCoverageResponse] = js.native
    def getReservationPurchaseRecommendation(params: GetReservationPurchaseRecommendationRequest): Request[GetReservationPurchaseRecommendationResponse] = js.native
    def getReservationUtilization(params: GetReservationUtilizationRequest): Request[GetReservationUtilizationResponse] = js.native
    def getRightsizingRecommendation(params: GetRightsizingRecommendationRequest): Request[GetRightsizingRecommendationResponse] = js.native
    def getSavingsPlansCoverage(params: GetSavingsPlansCoverageRequest): Request[GetSavingsPlansCoverageResponse] = js.native
    def getSavingsPlansPurchaseRecommendation(params: GetSavingsPlansPurchaseRecommendationRequest): Request[GetSavingsPlansPurchaseRecommendationResponse] = js.native
    def getSavingsPlansUtilization(params: GetSavingsPlansUtilizationRequest): Request[GetSavingsPlansUtilizationResponse] = js.native
    def getSavingsPlansUtilizationDetails(params: GetSavingsPlansUtilizationDetailsRequest): Request[GetSavingsPlansUtilizationDetailsResponse] = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse] = js.native
    def getUsageForecast(params: GetUsageForecastRequest): Request[GetUsageForecastResponse] = js.native
    def listCostCategoryDefinitions(params: ListCostCategoryDefinitionsRequest): Request[ListCostCategoryDefinitionsResponse] = js.native
    def provideAnomalyFeedback(params: ProvideAnomalyFeedbackRequest): Request[ProvideAnomalyFeedbackResponse] = js.native
    def updateAnomalyMonitor(params: UpdateAnomalyMonitorRequest): Request[UpdateAnomalyMonitorResponse] = js.native
    def updateAnomalySubscription(params: UpdateAnomalySubscriptionRequest): Request[UpdateAnomalySubscriptionResponse] = js.native
    def updateCostCategoryDefinition(params: UpdateCostCategoryDefinitionRequest): Request[UpdateCostCategoryDefinitionResponse] = js.native
  }
  object CostExplorer {
    @inline implicit def toOps(service: CostExplorer): CostExplorerOps = {
      new CostExplorerOps(service)
    }
  }

  /** An unusual cost pattern. This consists of the detailed metadata and the current status of the anomaly object.
    */
  @js.native
  trait Anomaly extends js.Object {
    var AnomalyId: GenericString
    var AnomalyScore: AnomalyScore
    var Impact: Impact
    var MonitorArn: GenericString
    var AnomalyEndDate: js.UndefOr[YearMonthDay]
    var AnomalyStartDate: js.UndefOr[YearMonthDay]
    var DimensionValue: js.UndefOr[GenericString]
    var Feedback: js.UndefOr[AnomalyFeedbackType]
    var RootCauses: js.UndefOr[RootCauses]
  }

  object Anomaly {
    @inline
    def apply(
        AnomalyId: GenericString,
        AnomalyScore: AnomalyScore,
        Impact: Impact,
        MonitorArn: GenericString,
        AnomalyEndDate: js.UndefOr[YearMonthDay] = js.undefined,
        AnomalyStartDate: js.UndefOr[YearMonthDay] = js.undefined,
        DimensionValue: js.UndefOr[GenericString] = js.undefined,
        Feedback: js.UndefOr[AnomalyFeedbackType] = js.undefined,
        RootCauses: js.UndefOr[RootCauses] = js.undefined
    ): Anomaly = {
      val __obj = js.Dynamic.literal(
        "AnomalyId" -> AnomalyId.asInstanceOf[js.Any],
        "AnomalyScore" -> AnomalyScore.asInstanceOf[js.Any],
        "Impact" -> Impact.asInstanceOf[js.Any],
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )

      AnomalyEndDate.foreach(__v => __obj.updateDynamic("AnomalyEndDate")(__v.asInstanceOf[js.Any]))
      AnomalyStartDate.foreach(__v => __obj.updateDynamic("AnomalyStartDate")(__v.asInstanceOf[js.Any]))
      DimensionValue.foreach(__v => __obj.updateDynamic("DimensionValue")(__v.asInstanceOf[js.Any]))
      Feedback.foreach(__v => __obj.updateDynamic("Feedback")(__v.asInstanceOf[js.Any]))
      RootCauses.foreach(__v => __obj.updateDynamic("RootCauses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Anomaly]
    }
  }

  /** The time period for an anomaly.
    */
  @js.native
  trait AnomalyDateInterval extends js.Object {
    var StartDate: YearMonthDay
    var EndDate: js.UndefOr[YearMonthDay]
  }

  object AnomalyDateInterval {
    @inline
    def apply(
        StartDate: YearMonthDay,
        EndDate: js.UndefOr[YearMonthDay] = js.undefined
    ): AnomalyDateInterval = {
      val __obj = js.Dynamic.literal(
        "StartDate" -> StartDate.asInstanceOf[js.Any]
      )

      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyDateInterval]
    }
  }

  /** This object continuously inspects your account's cost data for anomalies, based on <code>MonitorType</code> and <code>MonitorSpecification</code>. The content consists of detailed metadata and the current status of the monitor object.
    */
  @js.native
  trait AnomalyMonitor extends js.Object {
    var MonitorName: GenericString
    var MonitorType: MonitorType
    var CreationDate: js.UndefOr[YearMonthDay]
    var DimensionalValueCount: js.UndefOr[NonNegativeInteger]
    var LastEvaluatedDate: js.UndefOr[YearMonthDay]
    var LastUpdatedDate: js.UndefOr[YearMonthDay]
    var MonitorArn: js.UndefOr[GenericString]
    var MonitorDimension: js.UndefOr[MonitorDimension]
    var MonitorSpecification: js.UndefOr[Expression]
  }

  object AnomalyMonitor {
    @inline
    def apply(
        MonitorName: GenericString,
        MonitorType: MonitorType,
        CreationDate: js.UndefOr[YearMonthDay] = js.undefined,
        DimensionalValueCount: js.UndefOr[NonNegativeInteger] = js.undefined,
        LastEvaluatedDate: js.UndefOr[YearMonthDay] = js.undefined,
        LastUpdatedDate: js.UndefOr[YearMonthDay] = js.undefined,
        MonitorArn: js.UndefOr[GenericString] = js.undefined,
        MonitorDimension: js.UndefOr[MonitorDimension] = js.undefined,
        MonitorSpecification: js.UndefOr[Expression] = js.undefined
    ): AnomalyMonitor = {
      val __obj = js.Dynamic.literal(
        "MonitorName" -> MonitorName.asInstanceOf[js.Any],
        "MonitorType" -> MonitorType.asInstanceOf[js.Any]
      )

      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DimensionalValueCount.foreach(__v => __obj.updateDynamic("DimensionalValueCount")(__v.asInstanceOf[js.Any]))
      LastEvaluatedDate.foreach(__v => __obj.updateDynamic("LastEvaluatedDate")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      MonitorDimension.foreach(__v => __obj.updateDynamic("MonitorDimension")(__v.asInstanceOf[js.Any]))
      MonitorSpecification.foreach(__v => __obj.updateDynamic("MonitorSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyMonitor]
    }
  }

  /** Quantifies the anomaly. The higher score means that it is more anomalous.
    */
  @js.native
  trait AnomalyScore extends js.Object {
    var CurrentScore: GenericDouble
    var MaxScore: GenericDouble
  }

  object AnomalyScore {
    @inline
    def apply(
        CurrentScore: GenericDouble,
        MaxScore: GenericDouble
    ): AnomalyScore = {
      val __obj = js.Dynamic.literal(
        "CurrentScore" -> CurrentScore.asInstanceOf[js.Any],
        "MaxScore" -> MaxScore.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnomalyScore]
    }
  }

  /** The association between a monitor, threshold, and list of subscribers used to deliver notifications about anomalies detected by a monitor that exceeds a threshold. The content consists of the detailed metadata and the current status of the <code>AnomalySubscription</code> object.
    */
  @js.native
  trait AnomalySubscription extends js.Object {
    var Frequency: AnomalySubscriptionFrequency
    var MonitorArnList: MonitorArnList
    var Subscribers: Subscribers
    var SubscriptionName: GenericString
    var Threshold: NullableNonNegativeDouble
    var AccountId: js.UndefOr[GenericString]
    var SubscriptionArn: js.UndefOr[GenericString]
  }

  object AnomalySubscription {
    @inline
    def apply(
        Frequency: AnomalySubscriptionFrequency,
        MonitorArnList: MonitorArnList,
        Subscribers: Subscribers,
        SubscriptionName: GenericString,
        Threshold: NullableNonNegativeDouble,
        AccountId: js.UndefOr[GenericString] = js.undefined,
        SubscriptionArn: js.UndefOr[GenericString] = js.undefined
    ): AnomalySubscription = {
      val __obj = js.Dynamic.literal(
        "Frequency" -> Frequency.asInstanceOf[js.Any],
        "MonitorArnList" -> MonitorArnList.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any],
        "Threshold" -> Threshold.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      SubscriptionArn.foreach(__v => __obj.updateDynamic("SubscriptionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalySubscription]
    }
  }

  /** The structure of Cost Categories. This includes detailed metadata and the set of rules for the <code>CostCategory</code> object.
    */
  @js.native
  trait CostCategory extends js.Object {
    var CostCategoryArn: Arn
    var EffectiveStart: ZonedDateTime
    var Name: CostCategoryName
    var RuleVersion: CostCategoryRuleVersion
    var Rules: CostCategoryRulesList
    var DefaultValue: js.UndefOr[CostCategoryValue]
    var EffectiveEnd: js.UndefOr[ZonedDateTime]
    var ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList]
  }

  object CostCategory {
    @inline
    def apply(
        CostCategoryArn: Arn,
        EffectiveStart: ZonedDateTime,
        Name: CostCategoryName,
        RuleVersion: CostCategoryRuleVersion,
        Rules: CostCategoryRulesList,
        DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined,
        EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined,
        ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList] = js.undefined
    ): CostCategory = {
      val __obj = js.Dynamic.literal(
        "CostCategoryArn" -> CostCategoryArn.asInstanceOf[js.Any],
        "EffectiveStart" -> EffectiveStart.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleVersion" -> RuleVersion.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      EffectiveEnd.foreach(__v => __obj.updateDynamic("EffectiveEnd")(__v.asInstanceOf[js.Any]))
      ProcessingStatus.foreach(__v => __obj.updateDynamic("ProcessingStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostCategory]
    }
  }

  /** When creating or updating a cost category, you can define the <code>CostCategoryRule</code> rule type as <code>INHERITED_VALUE</code>. This rule type adds the flexibility of defining a rule that dynamically inherits the cost category value from the dimension value defined by <code>CostCategoryInheritedValueDimension</code>. For example, if you wanted to dynamically group costs based on the value of a specific tag key, you would first choose an inherited value rule type, then choose the tag dimension and specify the tag key to use.
    */
  @js.native
  trait CostCategoryInheritedValueDimension extends js.Object {
    var DimensionKey: js.UndefOr[GenericString]
    var DimensionName: js.UndefOr[CostCategoryInheritedValueDimensionName]
  }

  object CostCategoryInheritedValueDimension {
    @inline
    def apply(
        DimensionKey: js.UndefOr[GenericString] = js.undefined,
        DimensionName: js.UndefOr[CostCategoryInheritedValueDimensionName] = js.undefined
    ): CostCategoryInheritedValueDimension = {
      val __obj = js.Dynamic.literal()
      DimensionKey.foreach(__v => __obj.updateDynamic("DimensionKey")(__v.asInstanceOf[js.Any]))
      DimensionName.foreach(__v => __obj.updateDynamic("DimensionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostCategoryInheritedValueDimension]
    }
  }

  /** The list of processing statuses for Cost Management products for a specific cost category.
    */
  @js.native
  trait CostCategoryProcessingStatus extends js.Object {
    var Component: js.UndefOr[CostCategoryStatusComponent]
    var Status: js.UndefOr[CostCategoryStatus]
  }

  object CostCategoryProcessingStatus {
    @inline
    def apply(
        Component: js.UndefOr[CostCategoryStatusComponent] = js.undefined,
        Status: js.UndefOr[CostCategoryStatus] = js.undefined
    ): CostCategoryProcessingStatus = {
      val __obj = js.Dynamic.literal()
      Component.foreach(__v => __obj.updateDynamic("Component")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostCategoryProcessingStatus]
    }
  }

  /** A reference to a Cost Category containing only enough information to identify the Cost Category. You can use this information to retrieve the full Cost Category information using <code>DescribeCostCategory</code>.
    */
  @js.native
  trait CostCategoryReference extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var DefaultValue: js.UndefOr[CostCategoryValue]
    var EffectiveEnd: js.UndefOr[ZonedDateTime]
    var EffectiveStart: js.UndefOr[ZonedDateTime]
    var Name: js.UndefOr[CostCategoryName]
    var NumberOfRules: js.UndefOr[NonNegativeInteger]
    var ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList]
    var Values: js.UndefOr[CostCategoryValuesList]
  }

  object CostCategoryReference {
    @inline
    def apply(
        CostCategoryArn: js.UndefOr[Arn] = js.undefined,
        DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined,
        EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined,
        EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined,
        Name: js.UndefOr[CostCategoryName] = js.undefined,
        NumberOfRules: js.UndefOr[NonNegativeInteger] = js.undefined,
        ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList] = js.undefined,
        Values: js.UndefOr[CostCategoryValuesList] = js.undefined
    ): CostCategoryReference = {
      val __obj = js.Dynamic.literal()
      CostCategoryArn.foreach(__v => __obj.updateDynamic("CostCategoryArn")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      EffectiveEnd.foreach(__v => __obj.updateDynamic("EffectiveEnd")(__v.asInstanceOf[js.Any]))
      EffectiveStart.foreach(__v => __obj.updateDynamic("EffectiveStart")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberOfRules.foreach(__v => __obj.updateDynamic("NumberOfRules")(__v.asInstanceOf[js.Any]))
      ProcessingStatus.foreach(__v => __obj.updateDynamic("ProcessingStatus")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostCategoryReference]
    }
  }

  /** Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value.
    */
  @js.native
  trait CostCategoryRule extends js.Object {
    var InheritedValue: js.UndefOr[CostCategoryInheritedValueDimension]
    var Rule: js.UndefOr[Expression]
    var Type: js.UndefOr[CostCategoryRuleType]
    var Value: js.UndefOr[CostCategoryValue]
  }

  object CostCategoryRule {
    @inline
    def apply(
        InheritedValue: js.UndefOr[CostCategoryInheritedValueDimension] = js.undefined,
        Rule: js.UndefOr[Expression] = js.undefined,
        Type: js.UndefOr[CostCategoryRuleType] = js.undefined,
        Value: js.UndefOr[CostCategoryValue] = js.undefined
    ): CostCategoryRule = {
      val __obj = js.Dynamic.literal()
      InheritedValue.foreach(__v => __obj.updateDynamic("InheritedValue")(__v.asInstanceOf[js.Any]))
      Rule.foreach(__v => __obj.updateDynamic("Rule")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostCategoryRule]
    }
  }

  /** The Cost Categories values used for filtering the costs. If <code>Values</code> and <code>Key</code> are not specified, the <code>ABSENT</code> <code>MatchOption</code> is applied to all Cost Categories. That is, filtering on resources that are not mapped to any Cost Categories. If <code>Values</code> is provided and <code>Key</code> is not specified, the <code>ABSENT</code> <code>MatchOption</code> is applied to the Cost Categories <code>Key</code> only. That is, filtering on resources without the given Cost Categories key.
    */
  @js.native
  trait CostCategoryValues extends js.Object {
    var Key: js.UndefOr[CostCategoryName]
    var MatchOptions: js.UndefOr[MatchOptions]
    var Values: js.UndefOr[Values]
  }

  object CostCategoryValues {
    @inline
    def apply(
        Key: js.UndefOr[CostCategoryName] = js.undefined,
        MatchOptions: js.UndefOr[MatchOptions] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): CostCategoryValues = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      MatchOptions.foreach(__v => __obj.updateDynamic("MatchOptions")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostCategoryValues]
    }
  }

  /** The amount of instance usage that a reservation covered.
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

  /** Reservation coverage for a specified period, in hours.
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

  /** How much it costs to run an instance.
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

  /** How long a running instance either used a reservation or was On-Demand.
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

  /** The amount of instance usage, in normalized units. Normalized units enable you to see your EC2 usage for multiple sizes of instances in a uniform way. For example, suppose you run an xlarge instance and a 2xlarge instance. If you run both instances for the same amount of time, the 2xlarge instance uses twice as much of your reservation as the xlarge instance, even though both instances show only one instance-hour. Using normalized units instead of instance-hours, the xlarge instance used 8 normalized units, and the 2xlarge instance used 16 normalized units. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html|Modifying Reserved Instances]] in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
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
      CoverageNormalizedUnitsPercentage.foreach(__v => __obj.updateDynamic("CoverageNormalizedUnitsPercentage")(__v.asInstanceOf[js.Any]))
      OnDemandNormalizedUnits.foreach(__v => __obj.updateDynamic("OnDemandNormalizedUnits")(__v.asInstanceOf[js.Any]))
      ReservedNormalizedUnits.foreach(__v => __obj.updateDynamic("ReservedNormalizedUnits")(__v.asInstanceOf[js.Any]))
      TotalRunningNormalizedUnits.foreach(__v => __obj.updateDynamic("TotalRunningNormalizedUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoverageNormalizedUnits]
    }
  }

  @js.native
  trait CreateAnomalyMonitorRequest extends js.Object {
    var AnomalyMonitor: AnomalyMonitor
  }

  object CreateAnomalyMonitorRequest {
    @inline
    def apply(
        AnomalyMonitor: AnomalyMonitor
    ): CreateAnomalyMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyMonitor" -> AnomalyMonitor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAnomalyMonitorRequest]
    }
  }

  @js.native
  trait CreateAnomalyMonitorResponse extends js.Object {
    var MonitorArn: GenericString
  }

  object CreateAnomalyMonitorResponse {
    @inline
    def apply(
        MonitorArn: GenericString
    ): CreateAnomalyMonitorResponse = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAnomalyMonitorResponse]
    }
  }

  @js.native
  trait CreateAnomalySubscriptionRequest extends js.Object {
    var AnomalySubscription: AnomalySubscription
  }

  object CreateAnomalySubscriptionRequest {
    @inline
    def apply(
        AnomalySubscription: AnomalySubscription
    ): CreateAnomalySubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalySubscription" -> AnomalySubscription.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAnomalySubscriptionRequest]
    }
  }

  @js.native
  trait CreateAnomalySubscriptionResponse extends js.Object {
    var SubscriptionArn: GenericString
  }

  object CreateAnomalySubscriptionResponse {
    @inline
    def apply(
        SubscriptionArn: GenericString
    ): CreateAnomalySubscriptionResponse = {
      val __obj = js.Dynamic.literal(
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAnomalySubscriptionResponse]
    }
  }

  @js.native
  trait CreateCostCategoryDefinitionRequest extends js.Object {
    var Name: CostCategoryName
    var RuleVersion: CostCategoryRuleVersion
    var Rules: CostCategoryRulesList
    var DefaultValue: js.UndefOr[CostCategoryValue]
  }

  object CreateCostCategoryDefinitionRequest {
    @inline
    def apply(
        Name: CostCategoryName,
        RuleVersion: CostCategoryRuleVersion,
        Rules: CostCategoryRulesList,
        DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined
    ): CreateCostCategoryDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleVersion" -> RuleVersion.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCostCategoryDefinitionRequest]
    }
  }

  @js.native
  trait CreateCostCategoryDefinitionResponse extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveStart: js.UndefOr[ZonedDateTime]
  }

  object CreateCostCategoryDefinitionResponse {
    @inline
    def apply(
        CostCategoryArn: js.UndefOr[Arn] = js.undefined,
        EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
    ): CreateCostCategoryDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      CostCategoryArn.foreach(__v => __obj.updateDynamic("CostCategoryArn")(__v.asInstanceOf[js.Any]))
      EffectiveStart.foreach(__v => __obj.updateDynamic("EffectiveStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCostCategoryDefinitionResponse]
    }
  }

  /** Context about the current instance.
    */
  @js.native
  trait CurrentInstance extends js.Object {
    var CurrencyCode: js.UndefOr[GenericString]
    var InstanceName: js.UndefOr[GenericString]
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

  object CurrentInstance {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        InstanceName: js.UndefOr[GenericString] = js.undefined,
        MonthlyCost: js.UndefOr[GenericString] = js.undefined,
        OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined,
        ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined,
        ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined,
        ResourceId: js.UndefOr[GenericString] = js.undefined,
        ResourceUtilization: js.UndefOr[ResourceUtilization] = js.undefined,
        SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagValuesList] = js.undefined,
        TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
    ): CurrentInstance = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      InstanceName.foreach(__v => __obj.updateDynamic("InstanceName")(__v.asInstanceOf[js.Any]))
      MonthlyCost.foreach(__v => __obj.updateDynamic("MonthlyCost")(__v.asInstanceOf[js.Any]))
      OnDemandHoursInLookbackPeriod.foreach(__v => __obj.updateDynamic("OnDemandHoursInLookbackPeriod")(__v.asInstanceOf[js.Any]))
      ReservationCoveredHoursInLookbackPeriod.foreach(__v => __obj.updateDynamic("ReservationCoveredHoursInLookbackPeriod")(__v.asInstanceOf[js.Any]))
      ResourceDetails.foreach(__v => __obj.updateDynamic("ResourceDetails")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceUtilization.foreach(__v => __obj.updateDynamic("ResourceUtilization")(__v.asInstanceOf[js.Any]))
      SavingsPlansCoveredHoursInLookbackPeriod.foreach(__v => __obj.updateDynamic("SavingsPlansCoveredHoursInLookbackPeriod")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TotalRunningHoursInLookbackPeriod.foreach(__v => __obj.updateDynamic("TotalRunningHoursInLookbackPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentInstance]
    }
  }

  /** The time period of the request.
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
        "End" -> End.asInstanceOf[js.Any],
        "Start" -> Start.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DateInterval]
    }
  }

  @js.native
  trait DeleteAnomalyMonitorRequest extends js.Object {
    var MonitorArn: GenericString
  }

  object DeleteAnomalyMonitorRequest {
    @inline
    def apply(
        MonitorArn: GenericString
    ): DeleteAnomalyMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAnomalyMonitorRequest]
    }
  }

  @js.native
  trait DeleteAnomalyMonitorResponse extends js.Object

  object DeleteAnomalyMonitorResponse {
    @inline
    def apply(): DeleteAnomalyMonitorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAnomalyMonitorResponse]
    }
  }

  @js.native
  trait DeleteAnomalySubscriptionRequest extends js.Object {
    var SubscriptionArn: GenericString
  }

  object DeleteAnomalySubscriptionRequest {
    @inline
    def apply(
        SubscriptionArn: GenericString
    ): DeleteAnomalySubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAnomalySubscriptionRequest]
    }
  }

  @js.native
  trait DeleteAnomalySubscriptionResponse extends js.Object

  object DeleteAnomalySubscriptionResponse {
    @inline
    def apply(): DeleteAnomalySubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAnomalySubscriptionResponse]
    }
  }

  @js.native
  trait DeleteCostCategoryDefinitionRequest extends js.Object {
    var CostCategoryArn: Arn
  }

  object DeleteCostCategoryDefinitionRequest {
    @inline
    def apply(
        CostCategoryArn: Arn
    ): DeleteCostCategoryDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "CostCategoryArn" -> CostCategoryArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCostCategoryDefinitionRequest]
    }
  }

  @js.native
  trait DeleteCostCategoryDefinitionResponse extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveEnd: js.UndefOr[ZonedDateTime]
  }

  object DeleteCostCategoryDefinitionResponse {
    @inline
    def apply(
        CostCategoryArn: js.UndefOr[Arn] = js.undefined,
        EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined
    ): DeleteCostCategoryDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      CostCategoryArn.foreach(__v => __obj.updateDynamic("CostCategoryArn")(__v.asInstanceOf[js.Any]))
      EffectiveEnd.foreach(__v => __obj.updateDynamic("EffectiveEnd")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCostCategoryDefinitionResponse]
    }
  }

  @js.native
  trait DescribeCostCategoryDefinitionRequest extends js.Object {
    var CostCategoryArn: Arn
    var EffectiveOn: js.UndefOr[ZonedDateTime]
  }

  object DescribeCostCategoryDefinitionRequest {
    @inline
    def apply(
        CostCategoryArn: Arn,
        EffectiveOn: js.UndefOr[ZonedDateTime] = js.undefined
    ): DescribeCostCategoryDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "CostCategoryArn" -> CostCategoryArn.asInstanceOf[js.Any]
      )

      EffectiveOn.foreach(__v => __obj.updateDynamic("EffectiveOn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCostCategoryDefinitionRequest]
    }
  }

  @js.native
  trait DescribeCostCategoryDefinitionResponse extends js.Object {
    var CostCategory: js.UndefOr[CostCategory]
  }

  object DescribeCostCategoryDefinitionResponse {
    @inline
    def apply(
        CostCategory: js.UndefOr[CostCategory] = js.undefined
    ): DescribeCostCategoryDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      CostCategory.foreach(__v => __obj.updateDynamic("CostCategory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
    }
  }

  /** The metadata that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.
    */
  @js.native
  trait DimensionValues extends js.Object {
    var Key: js.UndefOr[Dimension]
    var MatchOptions: js.UndefOr[MatchOptions]
    var Values: js.UndefOr[Values]
  }

  object DimensionValues {
    @inline
    def apply(
        Key: js.UndefOr[Dimension] = js.undefined,
        MatchOptions: js.UndefOr[MatchOptions] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): DimensionValues = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      MatchOptions.foreach(__v => __obj.updateDynamic("MatchOptions")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionValues]
    }
  }

  /** The metadata of a specific type that you can use to filter and group your results. You can use <code>GetDimensionValues</code> to find specific values.
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

  /** The EBS field that contains a list of EBS metrics associated with the current instance.
    */
  @js.native
  trait EBSResourceUtilization extends js.Object {
    var EbsReadBytesPerSecond: js.UndefOr[GenericString]
    var EbsReadOpsPerSecond: js.UndefOr[GenericString]
    var EbsWriteBytesPerSecond: js.UndefOr[GenericString]
    var EbsWriteOpsPerSecond: js.UndefOr[GenericString]
  }

  object EBSResourceUtilization {
    @inline
    def apply(
        EbsReadBytesPerSecond: js.UndefOr[GenericString] = js.undefined,
        EbsReadOpsPerSecond: js.UndefOr[GenericString] = js.undefined,
        EbsWriteBytesPerSecond: js.UndefOr[GenericString] = js.undefined,
        EbsWriteOpsPerSecond: js.UndefOr[GenericString] = js.undefined
    ): EBSResourceUtilization = {
      val __obj = js.Dynamic.literal()
      EbsReadBytesPerSecond.foreach(__v => __obj.updateDynamic("EbsReadBytesPerSecond")(__v.asInstanceOf[js.Any]))
      EbsReadOpsPerSecond.foreach(__v => __obj.updateDynamic("EbsReadOpsPerSecond")(__v.asInstanceOf[js.Any]))
      EbsWriteBytesPerSecond.foreach(__v => __obj.updateDynamic("EbsWriteBytesPerSecond")(__v.asInstanceOf[js.Any]))
      EbsWriteOpsPerSecond.foreach(__v => __obj.updateDynamic("EbsWriteOpsPerSecond")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSResourceUtilization]
    }
  }

  /** Details about the Amazon EC2 instances that AWS recommends that you purchase.
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

  /** Details on the Amazon EC2 Resource.
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

  /** Utilization metrics of the instance.
    */
  @js.native
  trait EC2ResourceUtilization extends js.Object {
    var EBSResourceUtilization: js.UndefOr[EBSResourceUtilization]
    var MaxCpuUtilizationPercentage: js.UndefOr[GenericString]
    var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString]
    var MaxStorageUtilizationPercentage: js.UndefOr[GenericString]
  }

  object EC2ResourceUtilization {
    @inline
    def apply(
        EBSResourceUtilization: js.UndefOr[EBSResourceUtilization] = js.undefined,
        MaxCpuUtilizationPercentage: js.UndefOr[GenericString] = js.undefined,
        MaxMemoryUtilizationPercentage: js.UndefOr[GenericString] = js.undefined,
        MaxStorageUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
    ): EC2ResourceUtilization = {
      val __obj = js.Dynamic.literal()
      EBSResourceUtilization.foreach(__v => __obj.updateDynamic("EBSResourceUtilization")(__v.asInstanceOf[js.Any]))
      MaxCpuUtilizationPercentage.foreach(__v => __obj.updateDynamic("MaxCpuUtilizationPercentage")(__v.asInstanceOf[js.Any]))
      MaxMemoryUtilizationPercentage.foreach(__v => __obj.updateDynamic("MaxMemoryUtilizationPercentage")(__v.asInstanceOf[js.Any]))
      MaxStorageUtilizationPercentage.foreach(__v => __obj.updateDynamic("MaxStorageUtilizationPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2ResourceUtilization]
    }
  }

  /** The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
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

  /** Details about the Amazon ES instances that AWS recommends that you purchase.
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

  /** Details about the Amazon ElastiCache instances that AWS recommends that you purchase.
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

  /** Use <code>Expression</code> to filter by cost or by usage. There are two patterns: * Simple dimension values - You can set the dimension name and values for the filters that you plan to use. For example, you can filter for <code>REGION==us-east-1 OR REGION==us-west-1</code>. For <code>GetRightsizingRecommendation</code>, the Region is a full name (for example, <code>REGION==US East (N. Virginia)</code>. The <code>Expression</code> example looks like: <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code> The list of dimension values are OR'd together to retrieve cost or usage data. You can create <code>Expression</code> and <code>DimensionValues</code> objects using either <code>with*</code> methods or <code>set*</code> methods in multiple lines. <li> Compound dimension values with logical operations - You can use multiple <code>Expression</code> types and the logical operators <code>AND/OR/NOT</code> to create a list of one or more
    * <code>Expression</code> objects. This allows you to filter on more advanced options. For example, you can filter on <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>. The <code>Expression</code> for that looks like this: <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
    *
    * '''Note:'''Because each <code>Expression</code> can have only one operator, the service returns an error if more than one is specified. The following example shows an <code>Expression</code> object that creates an error. <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code> </li>'''Note:'''For the <code>GetRightsizingRecommendation</code> action, a combination of OR and NOT is not supported. OR is not supported between different dimensions, or dimensions and tags. NOT operators aren't supported. Dimensions are also limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>. For the <code>GetReservationPurchaseRecommendation</code> action, only NOT is supported. AND and OR are not supported. Dimensions are limited to <code>LINKED_ACCOUNT</code>.
    */
  @js.native
  trait Expression extends js.Object {
    var And: js.UndefOr[Expressions]
    var CostCategories: js.UndefOr[CostCategoryValues]
    var Dimensions: js.UndefOr[DimensionValues]
    var Not: js.UndefOr[Expression]
    var Or: js.UndefOr[Expressions]
    var Tags: js.UndefOr[TagValues]
  }

  object Expression {
    @inline
    def apply(
        And: js.UndefOr[Expressions] = js.undefined,
        CostCategories: js.UndefOr[CostCategoryValues] = js.undefined,
        Dimensions: js.UndefOr[DimensionValues] = js.undefined,
        Not: js.UndefOr[Expression] = js.undefined,
        Or: js.UndefOr[Expressions] = js.undefined,
        Tags: js.UndefOr[TagValues] = js.undefined
    ): Expression = {
      val __obj = js.Dynamic.literal()
      And.foreach(__v => __obj.updateDynamic("And")(__v.asInstanceOf[js.Any]))
      CostCategories.foreach(__v => __obj.updateDynamic("CostCategories")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Not.foreach(__v => __obj.updateDynamic("Not")(__v.asInstanceOf[js.Any]))
      Or.foreach(__v => __obj.updateDynamic("Or")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Expression]
    }
  }

  /** The forecast created for your query.
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
      PredictionIntervalLowerBound.foreach(__v => __obj.updateDynamic("PredictionIntervalLowerBound")(__v.asInstanceOf[js.Any]))
      PredictionIntervalUpperBound.foreach(__v => __obj.updateDynamic("PredictionIntervalUpperBound")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastResult]
    }
  }

  @js.native
  trait GetAnomaliesRequest extends js.Object {
    var DateInterval: AnomalyDateInterval
    var Feedback: js.UndefOr[AnomalyFeedbackType]
    var MaxResults: js.UndefOr[PageSize]
    var MonitorArn: js.UndefOr[GenericString]
    var NextPageToken: js.UndefOr[NextPageToken]
    var TotalImpact: js.UndefOr[TotalImpactFilter]
  }

  object GetAnomaliesRequest {
    @inline
    def apply(
        DateInterval: AnomalyDateInterval,
        Feedback: js.UndefOr[AnomalyFeedbackType] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        MonitorArn: js.UndefOr[GenericString] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        TotalImpact: js.UndefOr[TotalImpactFilter] = js.undefined
    ): GetAnomaliesRequest = {
      val __obj = js.Dynamic.literal(
        "DateInterval" -> DateInterval.asInstanceOf[js.Any]
      )

      Feedback.foreach(__v => __obj.updateDynamic("Feedback")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      TotalImpact.foreach(__v => __obj.updateDynamic("TotalImpact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomaliesRequest]
    }
  }

  @js.native
  trait GetAnomaliesResponse extends js.Object {
    var Anomalies: Anomalies
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetAnomaliesResponse {
    @inline
    def apply(
        Anomalies: Anomalies,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetAnomaliesResponse = {
      val __obj = js.Dynamic.literal(
        "Anomalies" -> Anomalies.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomaliesResponse]
    }
  }

  @js.native
  trait GetAnomalyMonitorsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var MonitorArnList: js.UndefOr[Values]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetAnomalyMonitorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        MonitorArnList: js.UndefOr[Values] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetAnomalyMonitorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MonitorArnList.foreach(__v => __obj.updateDynamic("MonitorArnList")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomalyMonitorsRequest]
    }
  }

  @js.native
  trait GetAnomalyMonitorsResponse extends js.Object {
    var AnomalyMonitors: AnomalyMonitors
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetAnomalyMonitorsResponse {
    @inline
    def apply(
        AnomalyMonitors: AnomalyMonitors,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetAnomalyMonitorsResponse = {
      val __obj = js.Dynamic.literal(
        "AnomalyMonitors" -> AnomalyMonitors.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomalyMonitorsResponse]
    }
  }

  @js.native
  trait GetAnomalySubscriptionsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var MonitorArn: js.UndefOr[GenericString]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SubscriptionArnList: js.UndefOr[Values]
  }

  object GetAnomalySubscriptionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        MonitorArn: js.UndefOr[GenericString] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SubscriptionArnList: js.UndefOr[Values] = js.undefined
    ): GetAnomalySubscriptionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SubscriptionArnList.foreach(__v => __obj.updateDynamic("SubscriptionArnList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomalySubscriptionsRequest]
    }
  }

  @js.native
  trait GetAnomalySubscriptionsResponse extends js.Object {
    var AnomalySubscriptions: AnomalySubscriptions
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetAnomalySubscriptionsResponse {
    @inline
    def apply(
        AnomalySubscriptions: AnomalySubscriptions,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetAnomalySubscriptionsResponse = {
      val __obj = js.Dynamic.literal(
        "AnomalySubscriptions" -> AnomalySubscriptions.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomalySubscriptionsResponse]
    }
  }

  @js.native
  trait GetCostAndUsageRequest extends js.Object {
    var Granularity: Granularity
    var Metrics: MetricNames
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetCostAndUsageRequest {
    @inline
    def apply(
        Granularity: Granularity,
        Metrics: MetricNames,
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetCostAndUsageRequest = {
      val __obj = js.Dynamic.literal(
        "Granularity" -> Granularity.asInstanceOf[js.Any],
        "Metrics" -> Metrics.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostAndUsageRequest]
    }
  }

  @js.native
  trait GetCostAndUsageResponse extends js.Object {
    var DimensionValueAttributes: js.UndefOr[DimensionValuesWithAttributesList]
    var GroupDefinitions: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
    var ResultsByTime: js.UndefOr[ResultsByTime]
  }

  object GetCostAndUsageResponse {
    @inline
    def apply(
        DimensionValueAttributes: js.UndefOr[DimensionValuesWithAttributesList] = js.undefined,
        GroupDefinitions: js.UndefOr[GroupDefinitions] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        ResultsByTime: js.UndefOr[ResultsByTime] = js.undefined
    ): GetCostAndUsageResponse = {
      val __obj = js.Dynamic.literal()
      DimensionValueAttributes.foreach(__v => __obj.updateDynamic("DimensionValueAttributes")(__v.asInstanceOf[js.Any]))
      GroupDefinitions.foreach(__v => __obj.updateDynamic("GroupDefinitions")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ResultsByTime.foreach(__v => __obj.updateDynamic("ResultsByTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostAndUsageResponse]
    }
  }

  @js.native
  trait GetCostAndUsageWithResourcesRequest extends js.Object {
    var Filter: Expression
    var Granularity: Granularity
    var TimePeriod: DateInterval
    var GroupBy: js.UndefOr[GroupDefinitions]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetCostAndUsageWithResourcesRequest {
    @inline
    def apply(
        Filter: Expression,
        Granularity: Granularity,
        TimePeriod: DateInterval,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        Metrics: js.UndefOr[MetricNames] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetCostAndUsageWithResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "Filter" -> Filter.asInstanceOf[js.Any],
        "Granularity" -> Granularity.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostAndUsageWithResourcesRequest]
    }
  }

  @js.native
  trait GetCostAndUsageWithResourcesResponse extends js.Object {
    var DimensionValueAttributes: js.UndefOr[DimensionValuesWithAttributesList]
    var GroupDefinitions: js.UndefOr[GroupDefinitions]
    var NextPageToken: js.UndefOr[NextPageToken]
    var ResultsByTime: js.UndefOr[ResultsByTime]
  }

  object GetCostAndUsageWithResourcesResponse {
    @inline
    def apply(
        DimensionValueAttributes: js.UndefOr[DimensionValuesWithAttributesList] = js.undefined,
        GroupDefinitions: js.UndefOr[GroupDefinitions] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        ResultsByTime: js.UndefOr[ResultsByTime] = js.undefined
    ): GetCostAndUsageWithResourcesResponse = {
      val __obj = js.Dynamic.literal()
      DimensionValueAttributes.foreach(__v => __obj.updateDynamic("DimensionValueAttributes")(__v.asInstanceOf[js.Any]))
      GroupDefinitions.foreach(__v => __obj.updateDynamic("GroupDefinitions")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ResultsByTime.foreach(__v => __obj.updateDynamic("ResultsByTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostAndUsageWithResourcesResponse]
    }
  }

  @js.native
  trait GetCostCategoriesRequest extends js.Object {
    var TimePeriod: DateInterval
    var CostCategoryName: js.UndefOr[CostCategoryName]
    var Filter: js.UndefOr[Expression]
    var MaxResults: js.UndefOr[MaxResults]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
    var SortBy: js.UndefOr[SortDefinitions]
  }

  object GetCostCategoriesRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        CostCategoryName: js.UndefOr[CostCategoryName] = js.undefined,
        Filter: js.UndefOr[Expression] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined,
        SortBy: js.UndefOr[SortDefinitions] = js.undefined
    ): GetCostCategoriesRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      CostCategoryName.foreach(__v => __obj.updateDynamic("CostCategoryName")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostCategoriesRequest]
    }
  }

  @js.native
  trait GetCostCategoriesResponse extends js.Object {
    var ReturnSize: PageSize
    var TotalSize: PageSize
    var CostCategoryNames: js.UndefOr[CostCategoryNamesList]
    var CostCategoryValues: js.UndefOr[CostCategoryValuesList]
    var NextPageToken: js.UndefOr[NextPageToken]
  }

  object GetCostCategoriesResponse {
    @inline
    def apply(
        ReturnSize: PageSize,
        TotalSize: PageSize,
        CostCategoryNames: js.UndefOr[CostCategoryNamesList] = js.undefined,
        CostCategoryValues: js.UndefOr[CostCategoryValuesList] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetCostCategoriesResponse = {
      val __obj = js.Dynamic.literal(
        "ReturnSize" -> ReturnSize.asInstanceOf[js.Any],
        "TotalSize" -> TotalSize.asInstanceOf[js.Any]
      )

      CostCategoryNames.foreach(__v => __obj.updateDynamic("CostCategoryNames")(__v.asInstanceOf[js.Any]))
      CostCategoryValues.foreach(__v => __obj.updateDynamic("CostCategoryValues")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostCategoriesResponse]
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
        "Metric" -> Metric.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
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
    var Filter: js.UndefOr[Expression]
    var MaxResults: js.UndefOr[MaxResults]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
    var SortBy: js.UndefOr[SortDefinitions]
  }

  object GetDimensionValuesRequest {
    @inline
    def apply(
        Dimension: Dimension,
        TimePeriod: DateInterval,
        Context: js.UndefOr[Context] = js.undefined,
        Filter: js.UndefOr[Expression] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined,
        SortBy: js.UndefOr[SortDefinitions] = js.undefined
    ): GetDimensionValuesRequest = {
      val __obj = js.Dynamic.literal(
        "Dimension" -> Dimension.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
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
        "ReturnSize" -> ReturnSize.asInstanceOf[js.Any],
        "TotalSize" -> TotalSize.asInstanceOf[js.Any]
      )

      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDimensionValuesResponse]
    }
  }

  /** You can use the following request parameters to query for how much of your instance usage a reservation covered.
    */
  @js.native
  trait GetReservationCoverageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var MaxResults: js.UndefOr[MaxResults]
    var Metrics: js.UndefOr[MetricNames]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SortBy: js.UndefOr[SortDefinition]
  }

  object GetReservationCoverageRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        Metrics: js.UndefOr[MetricNames] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SortBy: js.UndefOr[SortDefinition] = js.undefined
    ): GetReservationCoverageRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
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
    var Filter: js.UndefOr[Expression]
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
        Filter: js.UndefOr[Expression] = js.undefined,
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
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
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
    var MaxResults: js.UndefOr[MaxResults]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SortBy: js.UndefOr[SortDefinition]
  }

  object GetReservationUtilizationRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SortBy: js.UndefOr[SortDefinition] = js.undefined
    ): GetReservationUtilizationRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
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
    var Configuration: js.UndefOr[RightsizingRecommendationConfiguration]
    var Filter: js.UndefOr[Expression]
    var NextPageToken: js.UndefOr[NextPageToken]
    var PageSize: js.UndefOr[NonNegativeInteger]
  }

  object GetRightsizingRecommendationRequest {
    @inline
    def apply(
        Service: GenericString,
        Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.undefined,
        Filter: js.UndefOr[Expression] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
    ): GetRightsizingRecommendationRequest = {
      val __obj = js.Dynamic.literal(
        "Service" -> Service.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRightsizingRecommendationRequest]
    }
  }

  @js.native
  trait GetRightsizingRecommendationResponse extends js.Object {
    var Configuration: js.UndefOr[RightsizingRecommendationConfiguration]
    var Metadata: js.UndefOr[RightsizingRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList]
    var Summary: js.UndefOr[RightsizingRecommendationSummary]
  }

  object GetRightsizingRecommendationResponse {
    @inline
    def apply(
        Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.undefined,
        Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.undefined,
        Summary: js.UndefOr[RightsizingRecommendationSummary] = js.undefined
    ): GetRightsizingRecommendationResponse = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      RightsizingRecommendations.foreach(__v => __obj.updateDynamic("RightsizingRecommendations")(__v.asInstanceOf[js.Any]))
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRightsizingRecommendationResponse]
    }
  }

  @js.native
  trait GetSavingsPlansCoverageRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var GroupBy: js.UndefOr[GroupDefinitions]
    var MaxResults: js.UndefOr[MaxResults]
    var Metrics: js.UndefOr[MetricNames]
    var NextToken: js.UndefOr[NextPageToken]
    var SortBy: js.UndefOr[SortDefinition]
  }

  object GetSavingsPlansCoverageRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        GroupBy: js.UndefOr[GroupDefinitions] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        Metrics: js.UndefOr[MetricNames] = js.undefined,
        NextToken: js.UndefOr[NextPageToken] = js.undefined,
        SortBy: js.UndefOr[SortDefinition] = js.undefined
    ): GetSavingsPlansCoverageRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansCoverageRequest]
    }
  }

  @js.native
  trait GetSavingsPlansCoverageResponse extends js.Object {
    var SavingsPlansCoverages: SavingsPlansCoverages
    var NextToken: js.UndefOr[NextPageToken]
  }

  object GetSavingsPlansCoverageResponse {
    @inline
    def apply(
        SavingsPlansCoverages: SavingsPlansCoverages,
        NextToken: js.UndefOr[NextPageToken] = js.undefined
    ): GetSavingsPlansCoverageResponse = {
      val __obj = js.Dynamic.literal(
        "SavingsPlansCoverages" -> SavingsPlansCoverages.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansCoverageResponse]
    }
  }

  @js.native
  trait GetSavingsPlansPurchaseRecommendationRequest extends js.Object {
    var LookbackPeriodInDays: LookbackPeriodInDays
    var PaymentOption: PaymentOption
    var SavingsPlansType: SupportedSavingsPlansType
    var TermInYears: TermInYears
    var AccountScope: js.UndefOr[AccountScope]
    var Filter: js.UndefOr[Expression]
    var NextPageToken: js.UndefOr[NextPageToken]
    var PageSize: js.UndefOr[NonNegativeInteger]
  }

  object GetSavingsPlansPurchaseRecommendationRequest {
    @inline
    def apply(
        LookbackPeriodInDays: LookbackPeriodInDays,
        PaymentOption: PaymentOption,
        SavingsPlansType: SupportedSavingsPlansType,
        TermInYears: TermInYears,
        AccountScope: js.UndefOr[AccountScope] = js.undefined,
        Filter: js.UndefOr[Expression] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
    ): GetSavingsPlansPurchaseRecommendationRequest = {
      val __obj = js.Dynamic.literal(
        "LookbackPeriodInDays" -> LookbackPeriodInDays.asInstanceOf[js.Any],
        "PaymentOption" -> PaymentOption.asInstanceOf[js.Any],
        "SavingsPlansType" -> SavingsPlansType.asInstanceOf[js.Any],
        "TermInYears" -> TermInYears.asInstanceOf[js.Any]
      )

      AccountScope.foreach(__v => __obj.updateDynamic("AccountScope")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationRequest]
    }
  }

  @js.native
  trait GetSavingsPlansPurchaseRecommendationResponse extends js.Object {
    var Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SavingsPlansPurchaseRecommendation: js.UndefOr[SavingsPlansPurchaseRecommendation]
  }

  object GetSavingsPlansPurchaseRecommendationResponse {
    @inline
    def apply(
        Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SavingsPlansPurchaseRecommendation: js.UndefOr[SavingsPlansPurchaseRecommendation] = js.undefined
    ): GetSavingsPlansPurchaseRecommendationResponse = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SavingsPlansPurchaseRecommendation.foreach(__v => __obj.updateDynamic("SavingsPlansPurchaseRecommendation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationResponse]
    }
  }

  @js.native
  trait GetSavingsPlansUtilizationDetailsRequest extends js.Object {
    var TimePeriod: DateInterval
    var DataType: js.UndefOr[SavingsPlansDataTypes]
    var Filter: js.UndefOr[Expression]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextPageToken]
    var SortBy: js.UndefOr[SortDefinition]
  }

  object GetSavingsPlansUtilizationDetailsRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        DataType: js.UndefOr[SavingsPlansDataTypes] = js.undefined,
        Filter: js.UndefOr[Expression] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextPageToken] = js.undefined,
        SortBy: js.UndefOr[SortDefinition] = js.undefined
    ): GetSavingsPlansUtilizationDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsRequest]
    }
  }

  @js.native
  trait GetSavingsPlansUtilizationDetailsResponse extends js.Object {
    var SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails
    var TimePeriod: DateInterval
    var NextToken: js.UndefOr[NextPageToken]
    var Total: js.UndefOr[SavingsPlansUtilizationAggregates]
  }

  object GetSavingsPlansUtilizationDetailsResponse {
    @inline
    def apply(
        SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails,
        TimePeriod: DateInterval,
        NextToken: js.UndefOr[NextPageToken] = js.undefined,
        Total: js.UndefOr[SavingsPlansUtilizationAggregates] = js.undefined
    ): GetSavingsPlansUtilizationDetailsResponse = {
      val __obj = js.Dynamic.literal(
        "SavingsPlansUtilizationDetails" -> SavingsPlansUtilizationDetails.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsResponse]
    }
  }

  @js.native
  trait GetSavingsPlansUtilizationRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var Granularity: js.UndefOr[Granularity]
    var SortBy: js.UndefOr[SortDefinition]
  }

  object GetSavingsPlansUtilizationRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        Granularity: js.UndefOr[Granularity] = js.undefined,
        SortBy: js.UndefOr[SortDefinition] = js.undefined
    ): GetSavingsPlansUtilizationRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansUtilizationRequest]
    }
  }

  @js.native
  trait GetSavingsPlansUtilizationResponse extends js.Object {
    var Total: SavingsPlansUtilizationAggregates
    var SavingsPlansUtilizationsByTime: js.UndefOr[SavingsPlansUtilizationsByTime]
  }

  object GetSavingsPlansUtilizationResponse {
    @inline
    def apply(
        Total: SavingsPlansUtilizationAggregates,
        SavingsPlansUtilizationsByTime: js.UndefOr[SavingsPlansUtilizationsByTime] = js.undefined
    ): GetSavingsPlansUtilizationResponse = {
      val __obj = js.Dynamic.literal(
        "Total" -> Total.asInstanceOf[js.Any]
      )

      SavingsPlansUtilizationsByTime.foreach(__v => __obj.updateDynamic("SavingsPlansUtilizationsByTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSavingsPlansUtilizationResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var TimePeriod: DateInterval
    var Filter: js.UndefOr[Expression]
    var MaxResults: js.UndefOr[MaxResults]
    var NextPageToken: js.UndefOr[NextPageToken]
    var SearchString: js.UndefOr[SearchString]
    var SortBy: js.UndefOr[SortDefinitions]
    var TagKey: js.UndefOr[TagKey]
  }

  object GetTagsRequest {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Filter: js.UndefOr[Expression] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextPageToken: js.UndefOr[NextPageToken] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined,
        SortBy: js.UndefOr[SortDefinitions] = js.undefined,
        TagKey: js.UndefOr[TagKey] = js.undefined
    ): GetTagsRequest = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
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
        "Tags" -> Tags.asInstanceOf[js.Any],
        "TotalSize" -> TotalSize.asInstanceOf[js.Any]
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
        "Metric" -> Metric.asInstanceOf[js.Any],
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any]
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

  /** One level of grouped data in the results.
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

  /** Represents a group when you specify a group by criteria or in the response to a query with a specific grouping.
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

  /** The anomaly's dollar value.
    */
  @js.native
  trait Impact extends js.Object {
    var MaxImpact: GenericDouble
    var TotalImpact: js.UndefOr[GenericDouble]
  }

  object Impact {
    @inline
    def apply(
        MaxImpact: GenericDouble,
        TotalImpact: js.UndefOr[GenericDouble] = js.undefined
    ): Impact = {
      val __obj = js.Dynamic.literal(
        "MaxImpact" -> MaxImpact.asInstanceOf[js.Any]
      )

      TotalImpact.foreach(__v => __obj.updateDynamic("TotalImpact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Impact]
    }
  }

  /** Details about the instances that AWS recommends that you purchase.
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
      ElastiCacheInstanceDetails.foreach(__v => __obj.updateDynamic("ElastiCacheInstanceDetails")(__v.asInstanceOf[js.Any]))
      RDSInstanceDetails.foreach(__v => __obj.updateDynamic("RDSInstanceDetails")(__v.asInstanceOf[js.Any]))
      RedshiftInstanceDetails.foreach(__v => __obj.updateDynamic("RedshiftInstanceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceDetails]
    }
  }

  @js.native
  trait ListCostCategoryDefinitionsRequest extends js.Object {
    var EffectiveOn: js.UndefOr[ZonedDateTime]
    var MaxResults: js.UndefOr[CostCategoryMaxResults]
    var NextToken: js.UndefOr[NextPageToken]
  }

  object ListCostCategoryDefinitionsRequest {
    @inline
    def apply(
        EffectiveOn: js.UndefOr[ZonedDateTime] = js.undefined,
        MaxResults: js.UndefOr[CostCategoryMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextPageToken] = js.undefined
    ): ListCostCategoryDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      EffectiveOn.foreach(__v => __obj.updateDynamic("EffectiveOn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCostCategoryDefinitionsRequest]
    }
  }

  @js.native
  trait ListCostCategoryDefinitionsResponse extends js.Object {
    var CostCategoryReferences: js.UndefOr[CostCategoryReferencesList]
    var NextToken: js.UndefOr[NextPageToken]
  }

  object ListCostCategoryDefinitionsResponse {
    @inline
    def apply(
        CostCategoryReferences: js.UndefOr[CostCategoryReferencesList] = js.undefined,
        NextToken: js.UndefOr[NextPageToken] = js.undefined
    ): ListCostCategoryDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      CostCategoryReferences.foreach(__v => __obj.updateDynamic("CostCategoryReferences")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCostCategoryDefinitionsResponse]
    }
  }

  /** The aggregated value for a metric.
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

  /** Details on the modification recommendation.
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

  @js.native
  trait ProvideAnomalyFeedbackRequest extends js.Object {
    var AnomalyId: GenericString
    var Feedback: AnomalyFeedbackType
  }

  object ProvideAnomalyFeedbackRequest {
    @inline
    def apply(
        AnomalyId: GenericString,
        Feedback: AnomalyFeedbackType
    ): ProvideAnomalyFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyId" -> AnomalyId.asInstanceOf[js.Any],
        "Feedback" -> Feedback.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProvideAnomalyFeedbackRequest]
    }
  }

  @js.native
  trait ProvideAnomalyFeedbackResponse extends js.Object {
    var AnomalyId: GenericString
  }

  object ProvideAnomalyFeedbackResponse {
    @inline
    def apply(
        AnomalyId: GenericString
    ): ProvideAnomalyFeedbackResponse = {
      val __obj = js.Dynamic.literal(
        "AnomalyId" -> AnomalyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProvideAnomalyFeedbackResponse]
    }
  }

  /** Details about the Amazon RDS instances that AWS recommends that you purchase.
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

  /** Details about the Amazon Redshift instances that AWS recommends that you purchase.
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

  /** The aggregated numbers for your reservation usage.
    */
  @js.native
  trait ReservationAggregates extends js.Object {
    var AmortizedRecurringFee: js.UndefOr[AmortizedRecurringFee]
    var AmortizedUpfrontFee: js.UndefOr[AmortizedUpfrontFee]
    var NetRISavings: js.UndefOr[NetRISavings]
    var OnDemandCostOfRIHoursUsed: js.UndefOr[OnDemandCostOfRIHoursUsed]
    var PurchasedHours: js.UndefOr[PurchasedHours]
    var PurchasedUnits: js.UndefOr[PurchasedUnits]
    var RICostForUnusedHours: js.UndefOr[RICostForUnusedHours]
    var RealizedSavings: js.UndefOr[RealizedSavings]
    var TotalActualHours: js.UndefOr[TotalActualHours]
    var TotalActualUnits: js.UndefOr[TotalActualUnits]
    var TotalAmortizedFee: js.UndefOr[TotalAmortizedFee]
    var TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings]
    var UnrealizedSavings: js.UndefOr[UnrealizedSavings]
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
        RICostForUnusedHours: js.UndefOr[RICostForUnusedHours] = js.undefined,
        RealizedSavings: js.UndefOr[RealizedSavings] = js.undefined,
        TotalActualHours: js.UndefOr[TotalActualHours] = js.undefined,
        TotalActualUnits: js.UndefOr[TotalActualUnits] = js.undefined,
        TotalAmortizedFee: js.UndefOr[TotalAmortizedFee] = js.undefined,
        TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings] = js.undefined,
        UnrealizedSavings: js.UndefOr[UnrealizedSavings] = js.undefined,
        UnusedHours: js.UndefOr[UnusedHours] = js.undefined,
        UnusedUnits: js.UndefOr[UnusedUnits] = js.undefined,
        UtilizationPercentage: js.UndefOr[UtilizationPercentage] = js.undefined,
        UtilizationPercentageInUnits: js.UndefOr[UtilizationPercentageInUnits] = js.undefined
    ): ReservationAggregates = {
      val __obj = js.Dynamic.literal()
      AmortizedRecurringFee.foreach(__v => __obj.updateDynamic("AmortizedRecurringFee")(__v.asInstanceOf[js.Any]))
      AmortizedUpfrontFee.foreach(__v => __obj.updateDynamic("AmortizedUpfrontFee")(__v.asInstanceOf[js.Any]))
      NetRISavings.foreach(__v => __obj.updateDynamic("NetRISavings")(__v.asInstanceOf[js.Any]))
      OnDemandCostOfRIHoursUsed.foreach(__v => __obj.updateDynamic("OnDemandCostOfRIHoursUsed")(__v.asInstanceOf[js.Any]))
      PurchasedHours.foreach(__v => __obj.updateDynamic("PurchasedHours")(__v.asInstanceOf[js.Any]))
      PurchasedUnits.foreach(__v => __obj.updateDynamic("PurchasedUnits")(__v.asInstanceOf[js.Any]))
      RICostForUnusedHours.foreach(__v => __obj.updateDynamic("RICostForUnusedHours")(__v.asInstanceOf[js.Any]))
      RealizedSavings.foreach(__v => __obj.updateDynamic("RealizedSavings")(__v.asInstanceOf[js.Any]))
      TotalActualHours.foreach(__v => __obj.updateDynamic("TotalActualHours")(__v.asInstanceOf[js.Any]))
      TotalActualUnits.foreach(__v => __obj.updateDynamic("TotalActualUnits")(__v.asInstanceOf[js.Any]))
      TotalAmortizedFee.foreach(__v => __obj.updateDynamic("TotalAmortizedFee")(__v.asInstanceOf[js.Any]))
      TotalPotentialRISavings.foreach(__v => __obj.updateDynamic("TotalPotentialRISavings")(__v.asInstanceOf[js.Any]))
      UnrealizedSavings.foreach(__v => __obj.updateDynamic("UnrealizedSavings")(__v.asInstanceOf[js.Any]))
      UnusedHours.foreach(__v => __obj.updateDynamic("UnusedHours")(__v.asInstanceOf[js.Any]))
      UnusedUnits.foreach(__v => __obj.updateDynamic("UnusedUnits")(__v.asInstanceOf[js.Any]))
      UtilizationPercentage.foreach(__v => __obj.updateDynamic("UtilizationPercentage")(__v.asInstanceOf[js.Any]))
      UtilizationPercentageInUnits.foreach(__v => __obj.updateDynamic("UtilizationPercentageInUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationAggregates]
    }
  }

  /** A group of reservations that share a set of attributes.
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

  /** A specific reservation that AWS recommends for purchase.
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

  /** Details about your recommended reservation purchase.
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
      AverageNormalizedUnitsUsedPerHour.foreach(__v => __obj.updateDynamic("AverageNormalizedUnitsUsedPerHour")(__v.asInstanceOf[js.Any]))
      AverageNumberOfInstancesUsedPerHour.foreach(__v => __obj.updateDynamic("AverageNumberOfInstancesUsedPerHour")(__v.asInstanceOf[js.Any]))
      AverageUtilization.foreach(__v => __obj.updateDynamic("AverageUtilization")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      EstimatedBreakEvenInMonths.foreach(__v => __obj.updateDynamic("EstimatedBreakEvenInMonths")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlyOnDemandCost.foreach(__v => __obj.updateDynamic("EstimatedMonthlyOnDemandCost")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlySavingsAmount.foreach(__v => __obj.updateDynamic("EstimatedMonthlySavingsAmount")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlySavingsPercentage.foreach(__v => __obj.updateDynamic("EstimatedMonthlySavingsPercentage")(__v.asInstanceOf[js.Any]))
      EstimatedReservationCostForLookbackPeriod.foreach(__v => __obj.updateDynamic("EstimatedReservationCostForLookbackPeriod")(__v.asInstanceOf[js.Any]))
      InstanceDetails.foreach(__v => __obj.updateDynamic("InstanceDetails")(__v.asInstanceOf[js.Any]))
      MaximumNormalizedUnitsUsedPerHour.foreach(__v => __obj.updateDynamic("MaximumNormalizedUnitsUsedPerHour")(__v.asInstanceOf[js.Any]))
      MaximumNumberOfInstancesUsedPerHour.foreach(__v => __obj.updateDynamic("MaximumNumberOfInstancesUsedPerHour")(__v.asInstanceOf[js.Any]))
      MinimumNormalizedUnitsUsedPerHour.foreach(__v => __obj.updateDynamic("MinimumNormalizedUnitsUsedPerHour")(__v.asInstanceOf[js.Any]))
      MinimumNumberOfInstancesUsedPerHour.foreach(__v => __obj.updateDynamic("MinimumNumberOfInstancesUsedPerHour")(__v.asInstanceOf[js.Any]))
      RecommendedNormalizedUnitsToPurchase.foreach(__v => __obj.updateDynamic("RecommendedNormalizedUnitsToPurchase")(__v.asInstanceOf[js.Any]))
      RecommendedNumberOfInstancesToPurchase.foreach(__v => __obj.updateDynamic("RecommendedNumberOfInstancesToPurchase")(__v.asInstanceOf[js.Any]))
      RecurringStandardMonthlyCost.foreach(__v => __obj.updateDynamic("RecurringStandardMonthlyCost")(__v.asInstanceOf[js.Any]))
      UpfrontCost.foreach(__v => __obj.updateDynamic("UpfrontCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
    }
  }

  /** Information about this specific recommendation, such as the timestamp for when AWS made a specific recommendation.
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

  /** A summary about this recommendation, such as the currency code, the amount that AWS estimates that you could save, and the total amount of reservation to purchase.
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
      TotalEstimatedMonthlySavingsAmount.foreach(__v => __obj.updateDynamic("TotalEstimatedMonthlySavingsAmount")(__v.asInstanceOf[js.Any]))
      TotalEstimatedMonthlySavingsPercentage.foreach(__v => __obj.updateDynamic("TotalEstimatedMonthlySavingsPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
    }
  }

  /** A group of reservations that share a set of attributes.
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

  /** Details on the resource.
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

  /** Resource utilization of current resource.
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

  /** The result that is associated with a time period.
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

  /** Recommendations to rightsize resources.
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
      ModifyRecommendationDetail.foreach(__v => __obj.updateDynamic("ModifyRecommendationDetail")(__v.asInstanceOf[js.Any]))
      RightsizingType.foreach(__v => __obj.updateDynamic("RightsizingType")(__v.asInstanceOf[js.Any]))
      TerminateRecommendationDetail.foreach(__v => __obj.updateDynamic("TerminateRecommendationDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RightsizingRecommendation]
    }
  }

  /** Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or neither.
    */
  @js.native
  trait RightsizingRecommendationConfiguration extends js.Object {
    var BenefitsConsidered: GenericBoolean
    var RecommendationTarget: RecommendationTarget
  }

  object RightsizingRecommendationConfiguration {
    @inline
    def apply(
        BenefitsConsidered: GenericBoolean,
        RecommendationTarget: RecommendationTarget
    ): RightsizingRecommendationConfiguration = {
      val __obj = js.Dynamic.literal(
        "BenefitsConsidered" -> BenefitsConsidered.asInstanceOf[js.Any],
        "RecommendationTarget" -> RecommendationTarget.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RightsizingRecommendationConfiguration]
    }
  }

  /** Metadata for this recommendation set.
    */
  @js.native
  trait RightsizingRecommendationMetadata extends js.Object {
    var AdditionalMetadata: js.UndefOr[GenericString]
    var GenerationTimestamp: js.UndefOr[GenericString]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var RecommendationId: js.UndefOr[GenericString]
  }

  object RightsizingRecommendationMetadata {
    @inline
    def apply(
        AdditionalMetadata: js.UndefOr[GenericString] = js.undefined,
        GenerationTimestamp: js.UndefOr[GenericString] = js.undefined,
        LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
        RecommendationId: js.UndefOr[GenericString] = js.undefined
    ): RightsizingRecommendationMetadata = {
      val __obj = js.Dynamic.literal()
      AdditionalMetadata.foreach(__v => __obj.updateDynamic("AdditionalMetadata")(__v.asInstanceOf[js.Any]))
      GenerationTimestamp.foreach(__v => __obj.updateDynamic("GenerationTimestamp")(__v.asInstanceOf[js.Any]))
      LookbackPeriodInDays.foreach(__v => __obj.updateDynamic("LookbackPeriodInDays")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RightsizingRecommendationMetadata]
    }
  }

  /** Summary of rightsizing recommendations
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
      EstimatedTotalMonthlySavingsAmount.foreach(__v => __obj.updateDynamic("EstimatedTotalMonthlySavingsAmount")(__v.asInstanceOf[js.Any]))
      SavingsCurrencyCode.foreach(__v => __obj.updateDynamic("SavingsCurrencyCode")(__v.asInstanceOf[js.Any]))
      SavingsPercentage.foreach(__v => __obj.updateDynamic("SavingsPercentage")(__v.asInstanceOf[js.Any]))
      TotalRecommendationCount.foreach(__v => __obj.updateDynamic("TotalRecommendationCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RightsizingRecommendationSummary]
    }
  }

  /** The combination of AWS service, linked account, Region, and usage type where a cost anomaly is observed.
    */
  @js.native
  trait RootCause extends js.Object {
    var LinkedAccount: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
    var Service: js.UndefOr[GenericString]
    var UsageType: js.UndefOr[GenericString]
  }

  object RootCause {
    @inline
    def apply(
        LinkedAccount: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined,
        Service: js.UndefOr[GenericString] = js.undefined,
        UsageType: js.UndefOr[GenericString] = js.undefined
    ): RootCause = {
      val __obj = js.Dynamic.literal()
      LinkedAccount.foreach(__v => __obj.updateDynamic("LinkedAccount")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      UsageType.foreach(__v => __obj.updateDynamic("UsageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RootCause]
    }
  }

  /** The amortized amount of Savings Plans purchased in a specific account during a specific time interval.
    */
  @js.native
  trait SavingsPlansAmortizedCommitment extends js.Object {
    var AmortizedRecurringCommitment: js.UndefOr[GenericString]
    var AmortizedUpfrontCommitment: js.UndefOr[GenericString]
    var TotalAmortizedCommitment: js.UndefOr[GenericString]
  }

  object SavingsPlansAmortizedCommitment {
    @inline
    def apply(
        AmortizedRecurringCommitment: js.UndefOr[GenericString] = js.undefined,
        AmortizedUpfrontCommitment: js.UndefOr[GenericString] = js.undefined,
        TotalAmortizedCommitment: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansAmortizedCommitment = {
      val __obj = js.Dynamic.literal()
      AmortizedRecurringCommitment.foreach(__v => __obj.updateDynamic("AmortizedRecurringCommitment")(__v.asInstanceOf[js.Any]))
      AmortizedUpfrontCommitment.foreach(__v => __obj.updateDynamic("AmortizedUpfrontCommitment")(__v.asInstanceOf[js.Any]))
      TotalAmortizedCommitment.foreach(__v => __obj.updateDynamic("TotalAmortizedCommitment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansAmortizedCommitment]
    }
  }

  /** The amount of Savings Plans eligible usage that is covered by Savings Plans. All calculations consider the On-Demand equivalent of your Savings Plans usage.
    */
  @js.native
  trait SavingsPlansCoverage extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Coverage: js.UndefOr[SavingsPlansCoverageData]
    var TimePeriod: js.UndefOr[DateInterval]
  }

  object SavingsPlansCoverage {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Coverage: js.UndefOr[SavingsPlansCoverageData] = js.undefined,
        TimePeriod: js.UndefOr[DateInterval] = js.undefined
    ): SavingsPlansCoverage = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Coverage.foreach(__v => __obj.updateDynamic("Coverage")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansCoverage]
    }
  }

  /** Specific coverage percentage, On-Demand costs, and spend covered by Savings Plans, and total Savings Plans costs for an account.
    */
  @js.native
  trait SavingsPlansCoverageData extends js.Object {
    var CoveragePercentage: js.UndefOr[GenericString]
    var OnDemandCost: js.UndefOr[GenericString]
    var SpendCoveredBySavingsPlans: js.UndefOr[GenericString]
    var TotalCost: js.UndefOr[GenericString]
  }

  object SavingsPlansCoverageData {
    @inline
    def apply(
        CoveragePercentage: js.UndefOr[GenericString] = js.undefined,
        OnDemandCost: js.UndefOr[GenericString] = js.undefined,
        SpendCoveredBySavingsPlans: js.UndefOr[GenericString] = js.undefined,
        TotalCost: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansCoverageData = {
      val __obj = js.Dynamic.literal()
      CoveragePercentage.foreach(__v => __obj.updateDynamic("CoveragePercentage")(__v.asInstanceOf[js.Any]))
      OnDemandCost.foreach(__v => __obj.updateDynamic("OnDemandCost")(__v.asInstanceOf[js.Any]))
      SpendCoveredBySavingsPlans.foreach(__v => __obj.updateDynamic("SpendCoveredBySavingsPlans")(__v.asInstanceOf[js.Any]))
      TotalCost.foreach(__v => __obj.updateDynamic("TotalCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansCoverageData]
    }
  }

  /** Attribute details on a specific Savings Plan.
    */
  @js.native
  trait SavingsPlansDetails extends js.Object {
    var InstanceFamily: js.UndefOr[GenericString]
    var OfferingId: js.UndefOr[GenericString]
    var Region: js.UndefOr[GenericString]
  }

  object SavingsPlansDetails {
    @inline
    def apply(
        InstanceFamily: js.UndefOr[GenericString] = js.undefined,
        OfferingId: js.UndefOr[GenericString] = js.undefined,
        Region: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansDetails = {
      val __obj = js.Dynamic.literal()
      InstanceFamily.foreach(__v => __obj.updateDynamic("InstanceFamily")(__v.asInstanceOf[js.Any]))
      OfferingId.foreach(__v => __obj.updateDynamic("OfferingId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansDetails]
    }
  }

  /** Contains your request parameters, Savings Plan Recommendations Summary, and Details.
    */
  @js.native
  trait SavingsPlansPurchaseRecommendation extends js.Object {
    var AccountScope: js.UndefOr[AccountScope]
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays]
    var PaymentOption: js.UndefOr[PaymentOption]
    var SavingsPlansPurchaseRecommendationDetails: js.UndefOr[SavingsPlansPurchaseRecommendationDetailList]
    var SavingsPlansPurchaseRecommendationSummary: js.UndefOr[SavingsPlansPurchaseRecommendationSummary]
    var SavingsPlansType: js.UndefOr[SupportedSavingsPlansType]
    var TermInYears: js.UndefOr[TermInYears]
  }

  object SavingsPlansPurchaseRecommendation {
    @inline
    def apply(
        AccountScope: js.UndefOr[AccountScope] = js.undefined,
        LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined,
        PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
        SavingsPlansPurchaseRecommendationDetails: js.UndefOr[SavingsPlansPurchaseRecommendationDetailList] = js.undefined,
        SavingsPlansPurchaseRecommendationSummary: js.UndefOr[SavingsPlansPurchaseRecommendationSummary] = js.undefined,
        SavingsPlansType: js.UndefOr[SupportedSavingsPlansType] = js.undefined,
        TermInYears: js.UndefOr[TermInYears] = js.undefined
    ): SavingsPlansPurchaseRecommendation = {
      val __obj = js.Dynamic.literal()
      AccountScope.foreach(__v => __obj.updateDynamic("AccountScope")(__v.asInstanceOf[js.Any]))
      LookbackPeriodInDays.foreach(__v => __obj.updateDynamic("LookbackPeriodInDays")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      SavingsPlansPurchaseRecommendationDetails.foreach(__v => __obj.updateDynamic("SavingsPlansPurchaseRecommendationDetails")(__v.asInstanceOf[js.Any]))
      SavingsPlansPurchaseRecommendationSummary.foreach(__v => __obj.updateDynamic("SavingsPlansPurchaseRecommendationSummary")(__v.asInstanceOf[js.Any]))
      SavingsPlansType.foreach(__v => __obj.updateDynamic("SavingsPlansType")(__v.asInstanceOf[js.Any]))
      TermInYears.foreach(__v => __obj.updateDynamic("TermInYears")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansPurchaseRecommendation]
    }
  }

  /** Details for your recommended Savings Plans.
    */
  @js.native
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

  object SavingsPlansPurchaseRecommendationDetail {
    @inline
    def apply(
        AccountId: js.UndefOr[GenericString] = js.undefined,
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        CurrentAverageHourlyOnDemandSpend: js.UndefOr[GenericString] = js.undefined,
        CurrentMaximumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.undefined,
        CurrentMinimumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.undefined,
        EstimatedAverageUtilization: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
        EstimatedOnDemandCost: js.UndefOr[GenericString] = js.undefined,
        EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.undefined,
        EstimatedROI: js.UndefOr[GenericString] = js.undefined,
        EstimatedSPCost: js.UndefOr[GenericString] = js.undefined,
        EstimatedSavingsAmount: js.UndefOr[GenericString] = js.undefined,
        EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.undefined,
        HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.undefined,
        SavingsPlansDetails: js.UndefOr[SavingsPlansDetails] = js.undefined,
        UpfrontCost: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansPurchaseRecommendationDetail = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      CurrentAverageHourlyOnDemandSpend.foreach(__v => __obj.updateDynamic("CurrentAverageHourlyOnDemandSpend")(__v.asInstanceOf[js.Any]))
      CurrentMaximumHourlyOnDemandSpend.foreach(__v => __obj.updateDynamic("CurrentMaximumHourlyOnDemandSpend")(__v.asInstanceOf[js.Any]))
      CurrentMinimumHourlyOnDemandSpend.foreach(__v => __obj.updateDynamic("CurrentMinimumHourlyOnDemandSpend")(__v.asInstanceOf[js.Any]))
      EstimatedAverageUtilization.foreach(__v => __obj.updateDynamic("EstimatedAverageUtilization")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlySavingsAmount.foreach(__v => __obj.updateDynamic("EstimatedMonthlySavingsAmount")(__v.asInstanceOf[js.Any]))
      EstimatedOnDemandCost.foreach(__v => __obj.updateDynamic("EstimatedOnDemandCost")(__v.asInstanceOf[js.Any]))
      EstimatedOnDemandCostWithCurrentCommitment.foreach(__v => __obj.updateDynamic("EstimatedOnDemandCostWithCurrentCommitment")(__v.asInstanceOf[js.Any]))
      EstimatedROI.foreach(__v => __obj.updateDynamic("EstimatedROI")(__v.asInstanceOf[js.Any]))
      EstimatedSPCost.foreach(__v => __obj.updateDynamic("EstimatedSPCost")(__v.asInstanceOf[js.Any]))
      EstimatedSavingsAmount.foreach(__v => __obj.updateDynamic("EstimatedSavingsAmount")(__v.asInstanceOf[js.Any]))
      EstimatedSavingsPercentage.foreach(__v => __obj.updateDynamic("EstimatedSavingsPercentage")(__v.asInstanceOf[js.Any]))
      HourlyCommitmentToPurchase.foreach(__v => __obj.updateDynamic("HourlyCommitmentToPurchase")(__v.asInstanceOf[js.Any]))
      SavingsPlansDetails.foreach(__v => __obj.updateDynamic("SavingsPlansDetails")(__v.asInstanceOf[js.Any]))
      UpfrontCost.foreach(__v => __obj.updateDynamic("UpfrontCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansPurchaseRecommendationDetail]
    }
  }

  /** Metadata about your Savings Plans Purchase Recommendations.
    */
  @js.native
  trait SavingsPlansPurchaseRecommendationMetadata extends js.Object {
    var AdditionalMetadata: js.UndefOr[GenericString]
    var GenerationTimestamp: js.UndefOr[GenericString]
    var RecommendationId: js.UndefOr[GenericString]
  }

  object SavingsPlansPurchaseRecommendationMetadata {
    @inline
    def apply(
        AdditionalMetadata: js.UndefOr[GenericString] = js.undefined,
        GenerationTimestamp: js.UndefOr[GenericString] = js.undefined,
        RecommendationId: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansPurchaseRecommendationMetadata = {
      val __obj = js.Dynamic.literal()
      AdditionalMetadata.foreach(__v => __obj.updateDynamic("AdditionalMetadata")(__v.asInstanceOf[js.Any]))
      GenerationTimestamp.foreach(__v => __obj.updateDynamic("GenerationTimestamp")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansPurchaseRecommendationMetadata]
    }
  }

  /** Summary metrics for your Savings Plans Purchase Recommendations.
    */
  @js.native
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

  object SavingsPlansPurchaseRecommendationSummary {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[GenericString] = js.undefined,
        CurrentOnDemandSpend: js.UndefOr[GenericString] = js.undefined,
        DailyCommitmentToPurchase: js.UndefOr[GenericString] = js.undefined,
        EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined,
        EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.undefined,
        EstimatedROI: js.UndefOr[GenericString] = js.undefined,
        EstimatedSavingsAmount: js.UndefOr[GenericString] = js.undefined,
        EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.undefined,
        EstimatedTotalCost: js.UndefOr[GenericString] = js.undefined,
        HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.undefined,
        TotalRecommendationCount: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansPurchaseRecommendationSummary = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      CurrentOnDemandSpend.foreach(__v => __obj.updateDynamic("CurrentOnDemandSpend")(__v.asInstanceOf[js.Any]))
      DailyCommitmentToPurchase.foreach(__v => __obj.updateDynamic("DailyCommitmentToPurchase")(__v.asInstanceOf[js.Any]))
      EstimatedMonthlySavingsAmount.foreach(__v => __obj.updateDynamic("EstimatedMonthlySavingsAmount")(__v.asInstanceOf[js.Any]))
      EstimatedOnDemandCostWithCurrentCommitment.foreach(__v => __obj.updateDynamic("EstimatedOnDemandCostWithCurrentCommitment")(__v.asInstanceOf[js.Any]))
      EstimatedROI.foreach(__v => __obj.updateDynamic("EstimatedROI")(__v.asInstanceOf[js.Any]))
      EstimatedSavingsAmount.foreach(__v => __obj.updateDynamic("EstimatedSavingsAmount")(__v.asInstanceOf[js.Any]))
      EstimatedSavingsPercentage.foreach(__v => __obj.updateDynamic("EstimatedSavingsPercentage")(__v.asInstanceOf[js.Any]))
      EstimatedTotalCost.foreach(__v => __obj.updateDynamic("EstimatedTotalCost")(__v.asInstanceOf[js.Any]))
      HourlyCommitmentToPurchase.foreach(__v => __obj.updateDynamic("HourlyCommitmentToPurchase")(__v.asInstanceOf[js.Any]))
      TotalRecommendationCount.foreach(__v => __obj.updateDynamic("TotalRecommendationCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansPurchaseRecommendationSummary]
    }
  }

  /** The amount of savings you're accumulating, against the public On-Demand rate of the usage accrued in an account.
    */
  @js.native
  trait SavingsPlansSavings extends js.Object {
    var NetSavings: js.UndefOr[GenericString]
    var OnDemandCostEquivalent: js.UndefOr[GenericString]
  }

  object SavingsPlansSavings {
    @inline
    def apply(
        NetSavings: js.UndefOr[GenericString] = js.undefined,
        OnDemandCostEquivalent: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansSavings = {
      val __obj = js.Dynamic.literal()
      NetSavings.foreach(__v => __obj.updateDynamic("NetSavings")(__v.asInstanceOf[js.Any]))
      OnDemandCostEquivalent.foreach(__v => __obj.updateDynamic("OnDemandCostEquivalent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansSavings]
    }
  }

  /** The measurement of how well you are using your existing Savings Plans.
    */
  @js.native
  trait SavingsPlansUtilization extends js.Object {
    var TotalCommitment: js.UndefOr[GenericString]
    var UnusedCommitment: js.UndefOr[GenericString]
    var UsedCommitment: js.UndefOr[GenericString]
    var UtilizationPercentage: js.UndefOr[GenericString]
  }

  object SavingsPlansUtilization {
    @inline
    def apply(
        TotalCommitment: js.UndefOr[GenericString] = js.undefined,
        UnusedCommitment: js.UndefOr[GenericString] = js.undefined,
        UsedCommitment: js.UndefOr[GenericString] = js.undefined,
        UtilizationPercentage: js.UndefOr[GenericString] = js.undefined
    ): SavingsPlansUtilization = {
      val __obj = js.Dynamic.literal()
      TotalCommitment.foreach(__v => __obj.updateDynamic("TotalCommitment")(__v.asInstanceOf[js.Any]))
      UnusedCommitment.foreach(__v => __obj.updateDynamic("UnusedCommitment")(__v.asInstanceOf[js.Any]))
      UsedCommitment.foreach(__v => __obj.updateDynamic("UsedCommitment")(__v.asInstanceOf[js.Any]))
      UtilizationPercentage.foreach(__v => __obj.updateDynamic("UtilizationPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansUtilization]
    }
  }

  /** The aggregated utilization metrics for your Savings Plans usage.
    */
  @js.native
  trait SavingsPlansUtilizationAggregates extends js.Object {
    var Utilization: SavingsPlansUtilization
    var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment]
    var Savings: js.UndefOr[SavingsPlansSavings]
  }

  object SavingsPlansUtilizationAggregates {
    @inline
    def apply(
        Utilization: SavingsPlansUtilization,
        AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.undefined,
        Savings: js.UndefOr[SavingsPlansSavings] = js.undefined
    ): SavingsPlansUtilizationAggregates = {
      val __obj = js.Dynamic.literal(
        "Utilization" -> Utilization.asInstanceOf[js.Any]
      )

      AmortizedCommitment.foreach(__v => __obj.updateDynamic("AmortizedCommitment")(__v.asInstanceOf[js.Any]))
      Savings.foreach(__v => __obj.updateDynamic("Savings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansUtilizationAggregates]
    }
  }

  /** The amount of Savings Plans utilization, in hours.
    */
  @js.native
  trait SavingsPlansUtilizationByTime extends js.Object {
    var TimePeriod: DateInterval
    var Utilization: SavingsPlansUtilization
    var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment]
    var Savings: js.UndefOr[SavingsPlansSavings]
  }

  object SavingsPlansUtilizationByTime {
    @inline
    def apply(
        TimePeriod: DateInterval,
        Utilization: SavingsPlansUtilization,
        AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.undefined,
        Savings: js.UndefOr[SavingsPlansSavings] = js.undefined
    ): SavingsPlansUtilizationByTime = {
      val __obj = js.Dynamic.literal(
        "TimePeriod" -> TimePeriod.asInstanceOf[js.Any],
        "Utilization" -> Utilization.asInstanceOf[js.Any]
      )

      AmortizedCommitment.foreach(__v => __obj.updateDynamic("AmortizedCommitment")(__v.asInstanceOf[js.Any]))
      Savings.foreach(__v => __obj.updateDynamic("Savings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansUtilizationByTime]
    }
  }

  /** A single daily or monthly Savings Plans utilization rate, and details for your account. A management account in an organization have access to member accounts. You can use <code>GetDimensionValues</code> to determine the possible dimension values.
    */
  @js.native
  trait SavingsPlansUtilizationDetail extends js.Object {
    var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment]
    var Attributes: js.UndefOr[Attributes]
    var Savings: js.UndefOr[SavingsPlansSavings]
    var SavingsPlanArn: js.UndefOr[SavingsPlanArn]
    var Utilization: js.UndefOr[SavingsPlansUtilization]
  }

  object SavingsPlansUtilizationDetail {
    @inline
    def apply(
        AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.undefined,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Savings: js.UndefOr[SavingsPlansSavings] = js.undefined,
        SavingsPlanArn: js.UndefOr[SavingsPlanArn] = js.undefined,
        Utilization: js.UndefOr[SavingsPlansUtilization] = js.undefined
    ): SavingsPlansUtilizationDetail = {
      val __obj = js.Dynamic.literal()
      AmortizedCommitment.foreach(__v => __obj.updateDynamic("AmortizedCommitment")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Savings.foreach(__v => __obj.updateDynamic("Savings")(__v.asInstanceOf[js.Any]))
      SavingsPlanArn.foreach(__v => __obj.updateDynamic("SavingsPlanArn")(__v.asInstanceOf[js.Any]))
      Utilization.foreach(__v => __obj.updateDynamic("Utilization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlansUtilizationDetail]
    }
  }

  /** Hardware specifications for the service that you want recommendations for.
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

  /** The details of how to sort the data.
    */
  @js.native
  trait SortDefinition extends js.Object {
    var Key: SortDefinitionKey
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SortDefinition {
    @inline
    def apply(
        Key: SortDefinitionKey,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SortDefinition = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortDefinition]
    }
  }

  /** The recipient of <code>AnomalySubscription</code> notifications.
    */
  @js.native
  trait Subscriber extends js.Object {
    var Address: js.UndefOr[SubscriberAddress]
    var Status: js.UndefOr[SubscriberStatus]
    var Type: js.UndefOr[SubscriberType]
  }

  object Subscriber {
    @inline
    def apply(
        Address: js.UndefOr[SubscriberAddress] = js.undefined,
        Status: js.UndefOr[SubscriberStatus] = js.undefined,
        Type: js.UndefOr[SubscriberType] = js.undefined
    ): Subscriber = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscriber]
    }
  }

  /** The values that are available for a tag. If <code>Values</code> and <code>Key</code> are not specified, the <code>ABSENT</code> <code>MatchOption</code> is applied to all tags. That is, filtering on resources with no tags. If <code>Values</code> is provided and <code>Key</code> is not specified, the <code>ABSENT</code> <code>MatchOption</code> is applied to the tag <code>Key</code> only. That is, filtering on resources without the given tag key.
    */
  @js.native
  trait TagValues extends js.Object {
    var Key: js.UndefOr[TagKey]
    var MatchOptions: js.UndefOr[MatchOptions]
    var Values: js.UndefOr[Values]
  }

  object TagValues {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        MatchOptions: js.UndefOr[MatchOptions] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): TagValues = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      MatchOptions.foreach(__v => __obj.updateDynamic("MatchOptions")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagValues]
    }
  }

  /** Details on recommended instance.
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
      ExpectedResourceUtilization.foreach(__v => __obj.updateDynamic("ExpectedResourceUtilization")(__v.asInstanceOf[js.Any]))
      ResourceDetails.foreach(__v => __obj.updateDynamic("ResourceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetInstance]
    }
  }

  /** Details on termination recommendation.
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

  /** Filters cost anomalies based on the total impact.
    */
  @js.native
  trait TotalImpactFilter extends js.Object {
    var NumericOperator: NumericOperator
    var StartValue: GenericDouble
    var EndValue: js.UndefOr[GenericDouble]
  }

  object TotalImpactFilter {
    @inline
    def apply(
        NumericOperator: NumericOperator,
        StartValue: GenericDouble,
        EndValue: js.UndefOr[GenericDouble] = js.undefined
    ): TotalImpactFilter = {
      val __obj = js.Dynamic.literal(
        "NumericOperator" -> NumericOperator.asInstanceOf[js.Any],
        "StartValue" -> StartValue.asInstanceOf[js.Any]
      )

      EndValue.foreach(__v => __obj.updateDynamic("EndValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TotalImpactFilter]
    }
  }

  @js.native
  trait UpdateAnomalyMonitorRequest extends js.Object {
    var MonitorArn: GenericString
    var MonitorName: js.UndefOr[GenericString]
  }

  object UpdateAnomalyMonitorRequest {
    @inline
    def apply(
        MonitorArn: GenericString,
        MonitorName: js.UndefOr[GenericString] = js.undefined
    ): UpdateAnomalyMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )

      MonitorName.foreach(__v => __obj.updateDynamic("MonitorName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnomalyMonitorRequest]
    }
  }

  @js.native
  trait UpdateAnomalyMonitorResponse extends js.Object {
    var MonitorArn: GenericString
  }

  object UpdateAnomalyMonitorResponse {
    @inline
    def apply(
        MonitorArn: GenericString
    ): UpdateAnomalyMonitorResponse = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAnomalyMonitorResponse]
    }
  }

  @js.native
  trait UpdateAnomalySubscriptionRequest extends js.Object {
    var SubscriptionArn: GenericString
    var Frequency: js.UndefOr[AnomalySubscriptionFrequency]
    var MonitorArnList: js.UndefOr[MonitorArnList]
    var Subscribers: js.UndefOr[Subscribers]
    var SubscriptionName: js.UndefOr[GenericString]
    var Threshold: js.UndefOr[NullableNonNegativeDouble]
  }

  object UpdateAnomalySubscriptionRequest {
    @inline
    def apply(
        SubscriptionArn: GenericString,
        Frequency: js.UndefOr[AnomalySubscriptionFrequency] = js.undefined,
        MonitorArnList: js.UndefOr[MonitorArnList] = js.undefined,
        Subscribers: js.UndefOr[Subscribers] = js.undefined,
        SubscriptionName: js.UndefOr[GenericString] = js.undefined,
        Threshold: js.UndefOr[NullableNonNegativeDouble] = js.undefined
    ): UpdateAnomalySubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )

      Frequency.foreach(__v => __obj.updateDynamic("Frequency")(__v.asInstanceOf[js.Any]))
      MonitorArnList.foreach(__v => __obj.updateDynamic("MonitorArnList")(__v.asInstanceOf[js.Any]))
      Subscribers.foreach(__v => __obj.updateDynamic("Subscribers")(__v.asInstanceOf[js.Any]))
      SubscriptionName.foreach(__v => __obj.updateDynamic("SubscriptionName")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnomalySubscriptionRequest]
    }
  }

  @js.native
  trait UpdateAnomalySubscriptionResponse extends js.Object {
    var SubscriptionArn: GenericString
  }

  object UpdateAnomalySubscriptionResponse {
    @inline
    def apply(
        SubscriptionArn: GenericString
    ): UpdateAnomalySubscriptionResponse = {
      val __obj = js.Dynamic.literal(
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAnomalySubscriptionResponse]
    }
  }

  @js.native
  trait UpdateCostCategoryDefinitionRequest extends js.Object {
    var CostCategoryArn: Arn
    var RuleVersion: CostCategoryRuleVersion
    var Rules: CostCategoryRulesList
    var DefaultValue: js.UndefOr[CostCategoryValue]
  }

  object UpdateCostCategoryDefinitionRequest {
    @inline
    def apply(
        CostCategoryArn: Arn,
        RuleVersion: CostCategoryRuleVersion,
        Rules: CostCategoryRulesList,
        DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined
    ): UpdateCostCategoryDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "CostCategoryArn" -> CostCategoryArn.asInstanceOf[js.Any],
        "RuleVersion" -> RuleVersion.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCostCategoryDefinitionRequest]
    }
  }

  @js.native
  trait UpdateCostCategoryDefinitionResponse extends js.Object {
    var CostCategoryArn: js.UndefOr[Arn]
    var EffectiveStart: js.UndefOr[ZonedDateTime]
  }

  object UpdateCostCategoryDefinitionResponse {
    @inline
    def apply(
        CostCategoryArn: js.UndefOr[Arn] = js.undefined,
        EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
    ): UpdateCostCategoryDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      CostCategoryArn.foreach(__v => __obj.updateDynamic("CostCategoryArn")(__v.asInstanceOf[js.Any]))
      EffectiveStart.foreach(__v => __obj.updateDynamic("EffectiveStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCostCategoryDefinitionResponse]
    }
  }

  /** The amount of utilization, in hours.
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
