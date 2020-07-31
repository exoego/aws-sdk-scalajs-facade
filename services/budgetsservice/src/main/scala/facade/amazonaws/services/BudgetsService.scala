package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object budgetsservice {
  type AccountId = String
  type BudgetName = String
  type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]
  type Budgets = js.Array[Budget]
  type CostFilters = js.Dictionary[DimensionValues]
  type DimensionValues = js.Array[GenericString]
  type GenericString = String
  type GenericTimestamp = js.Date
  type MaxResults = Int
  type NotificationThreshold = Double
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = Boolean
  type NumericValue = String
  type PlannedBudgetLimits = js.Dictionary[Spend]
  type SubscriberAddress = String
  type Subscribers = js.Array[Subscriber]
  type UnitValue = String

  implicit final class BudgetsServiceOps(private val service: BudgetsService) extends AnyVal {

    @inline def createBudgetFuture(params: CreateBudgetRequest): Future[CreateBudgetResponse] = service.createBudget(params).promise().toFuture
    @inline def createNotificationFuture(params: CreateNotificationRequest): Future[CreateNotificationResponse] = service.createNotification(params).promise().toFuture
    @inline def createSubscriberFuture(params: CreateSubscriberRequest): Future[CreateSubscriberResponse] = service.createSubscriber(params).promise().toFuture
    @inline def deleteBudgetFuture(params: DeleteBudgetRequest): Future[DeleteBudgetResponse] = service.deleteBudget(params).promise().toFuture
    @inline def deleteNotificationFuture(params: DeleteNotificationRequest): Future[DeleteNotificationResponse] = service.deleteNotification(params).promise().toFuture
    @inline def deleteSubscriberFuture(params: DeleteSubscriberRequest): Future[DeleteSubscriberResponse] = service.deleteSubscriber(params).promise().toFuture
    @inline def describeBudgetFuture(params: DescribeBudgetRequest): Future[DescribeBudgetResponse] = service.describeBudget(params).promise().toFuture
    @inline def describeBudgetPerformanceHistoryFuture(params: DescribeBudgetPerformanceHistoryRequest): Future[DescribeBudgetPerformanceHistoryResponse] = service.describeBudgetPerformanceHistory(params).promise().toFuture
    @inline def describeBudgetsFuture(params: DescribeBudgetsRequest): Future[DescribeBudgetsResponse] = service.describeBudgets(params).promise().toFuture
    @inline def describeNotificationsForBudgetFuture(params: DescribeNotificationsForBudgetRequest): Future[DescribeNotificationsForBudgetResponse] = service.describeNotificationsForBudget(params).promise().toFuture
    @inline def describeSubscribersForNotificationFuture(params: DescribeSubscribersForNotificationRequest): Future[DescribeSubscribersForNotificationResponse] = service.describeSubscribersForNotification(params).promise().toFuture
    @inline def updateBudgetFuture(params: UpdateBudgetRequest): Future[UpdateBudgetResponse] = service.updateBudget(params).promise().toFuture
    @inline def updateNotificationFuture(params: UpdateNotificationRequest): Future[UpdateNotificationResponse] = service.updateNotification(params).promise().toFuture
    @inline def updateSubscriberFuture(params: UpdateSubscriberRequest): Future[UpdateSubscriberResponse] = service.updateSubscriber(params).promise().toFuture
  }
}

package budgetsservice {
  @js.native
  @JSImport("aws-sdk", "Budgets", "AWS.Budgets")
  class BudgetsService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBudget(params: CreateBudgetRequest): Request[CreateBudgetResponse] = js.native
    def createNotification(params: CreateNotificationRequest): Request[CreateNotificationResponse] = js.native
    def createSubscriber(params: CreateSubscriberRequest): Request[CreateSubscriberResponse] = js.native
    def deleteBudget(params: DeleteBudgetRequest): Request[DeleteBudgetResponse] = js.native
    def deleteNotification(params: DeleteNotificationRequest): Request[DeleteNotificationResponse] = js.native
    def deleteSubscriber(params: DeleteSubscriberRequest): Request[DeleteSubscriberResponse] = js.native
    def describeBudget(params: DescribeBudgetRequest): Request[DescribeBudgetResponse] = js.native
    def describeBudgetPerformanceHistory(params: DescribeBudgetPerformanceHistoryRequest): Request[DescribeBudgetPerformanceHistoryResponse] = js.native
    def describeBudgets(params: DescribeBudgetsRequest): Request[DescribeBudgetsResponse] = js.native
    def describeNotificationsForBudget(params: DescribeNotificationsForBudgetRequest): Request[DescribeNotificationsForBudgetResponse] = js.native
    def describeSubscribersForNotification(params: DescribeSubscribersForNotificationRequest): Request[DescribeSubscribersForNotificationResponse] = js.native
    def updateBudget(params: UpdateBudgetRequest): Request[UpdateBudgetResponse] = js.native
    def updateNotification(params: UpdateNotificationRequest): Request[UpdateNotificationResponse] = js.native
    def updateSubscriber(params: UpdateSubscriberRequest): Request[UpdateSubscriberResponse] = js.native
  }

  /**
    * Represents the output of the <code>CreateBudget</code> operation. The content consists of the detailed metadata and data file information, and the current status of the <code>budget</code> object.
    *  This is the ARN pattern for a budget:
    *  <code>arn:aws:budgetservice::AccountId:budget/budgetName</code>
    */
  @js.native
  trait Budget extends js.Object {
    var BudgetName: BudgetName
    var BudgetType: BudgetType
    var TimeUnit: TimeUnit
    var BudgetLimit: js.UndefOr[Spend]
    var CalculatedSpend: js.UndefOr[CalculatedSpend]
    var CostFilters: js.UndefOr[CostFilters]
    var CostTypes: js.UndefOr[CostTypes]
    var LastUpdatedTime: js.UndefOr[GenericTimestamp]
    var PlannedBudgetLimits: js.UndefOr[PlannedBudgetLimits]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  object Budget {
    @inline
    def apply(
        BudgetName: BudgetName,
        BudgetType: BudgetType,
        TimeUnit: TimeUnit,
        BudgetLimit: js.UndefOr[Spend] = js.undefined,
        CalculatedSpend: js.UndefOr[CalculatedSpend] = js.undefined,
        CostFilters: js.UndefOr[CostFilters] = js.undefined,
        CostTypes: js.UndefOr[CostTypes] = js.undefined,
        LastUpdatedTime: js.UndefOr[GenericTimestamp] = js.undefined,
        PlannedBudgetLimits: js.UndefOr[PlannedBudgetLimits] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): Budget = {
      val __obj = js.Dynamic.literal(
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "BudgetType" -> BudgetType.asInstanceOf[js.Any],
        "TimeUnit" -> TimeUnit.asInstanceOf[js.Any]
      )

      BudgetLimit.foreach(__v => __obj.updateDynamic("BudgetLimit")(__v.asInstanceOf[js.Any]))
      CalculatedSpend.foreach(__v => __obj.updateDynamic("CalculatedSpend")(__v.asInstanceOf[js.Any]))
      CostFilters.foreach(__v => __obj.updateDynamic("CostFilters")(__v.asInstanceOf[js.Any]))
      CostTypes.foreach(__v => __obj.updateDynamic("CostTypes")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      PlannedBudgetLimits.foreach(__v => __obj.updateDynamic("PlannedBudgetLimits")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Budget]
    }
  }

  /**
    * A history of the state of a budget at the end of the budget's specified time period.
    */
  @js.native
  trait BudgetPerformanceHistory extends js.Object {
    var BudgetName: js.UndefOr[BudgetName]
    var BudgetType: js.UndefOr[BudgetType]
    var BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList]
    var CostFilters: js.UndefOr[CostFilters]
    var CostTypes: js.UndefOr[CostTypes]
    var TimeUnit: js.UndefOr[TimeUnit]
  }

  object BudgetPerformanceHistory {
    @inline
    def apply(
        BudgetName: js.UndefOr[BudgetName] = js.undefined,
        BudgetType: js.UndefOr[BudgetType] = js.undefined,
        BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList] = js.undefined,
        CostFilters: js.UndefOr[CostFilters] = js.undefined,
        CostTypes: js.UndefOr[CostTypes] = js.undefined,
        TimeUnit: js.UndefOr[TimeUnit] = js.undefined
    ): BudgetPerformanceHistory = {
      val __obj = js.Dynamic.literal()
      BudgetName.foreach(__v => __obj.updateDynamic("BudgetName")(__v.asInstanceOf[js.Any]))
      BudgetType.foreach(__v => __obj.updateDynamic("BudgetType")(__v.asInstanceOf[js.Any]))
      BudgetedAndActualAmountsList.foreach(__v => __obj.updateDynamic("BudgetedAndActualAmountsList")(__v.asInstanceOf[js.Any]))
      CostFilters.foreach(__v => __obj.updateDynamic("CostFilters")(__v.asInstanceOf[js.Any]))
      CostTypes.foreach(__v => __obj.updateDynamic("CostTypes")(__v.asInstanceOf[js.Any]))
      TimeUnit.foreach(__v => __obj.updateDynamic("TimeUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BudgetPerformanceHistory]
    }
  }

  /**
    * The type of a budget. It must be one of the following types:
    *  <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, or <code>RI_COVERAGE</code>.
    */
  @js.native
  sealed trait BudgetType extends js.Any
  object BudgetType {
    val USAGE = "USAGE".asInstanceOf[BudgetType]
    val COST = "COST".asInstanceOf[BudgetType]
    val RI_UTILIZATION = "RI_UTILIZATION".asInstanceOf[BudgetType]
    val RI_COVERAGE = "RI_COVERAGE".asInstanceOf[BudgetType]
    val SAVINGS_PLANS_UTILIZATION = "SAVINGS_PLANS_UTILIZATION".asInstanceOf[BudgetType]
    val SAVINGS_PLANS_COVERAGE = "SAVINGS_PLANS_COVERAGE".asInstanceOf[BudgetType]

    @inline def values = js.Array(USAGE, COST, RI_UTILIZATION, RI_COVERAGE, SAVINGS_PLANS_UTILIZATION, SAVINGS_PLANS_COVERAGE)
  }

  /**
    * The amount of cost or usage that you created the budget for, compared to your actual costs or usage.
    */
  @js.native
  trait BudgetedAndActualAmounts extends js.Object {
    var ActualAmount: js.UndefOr[Spend]
    var BudgetedAmount: js.UndefOr[Spend]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  object BudgetedAndActualAmounts {
    @inline
    def apply(
        ActualAmount: js.UndefOr[Spend] = js.undefined,
        BudgetedAmount: js.UndefOr[Spend] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): BudgetedAndActualAmounts = {
      val __obj = js.Dynamic.literal()
      ActualAmount.foreach(__v => __obj.updateDynamic("ActualAmount")(__v.asInstanceOf[js.Any]))
      BudgetedAmount.foreach(__v => __obj.updateDynamic("BudgetedAmount")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BudgetedAndActualAmounts]
    }
  }

  /**
    * The spend objects that are associated with this budget. The <code>actualSpend</code> tracks how much you've used, cost, usage, or RI units, and the <code>forecastedSpend</code> tracks how much you are predicted to spend if your current usage remains steady.
    *  For example, if it is the 20th of the month and you have spent <code>50</code> dollars on Amazon EC2, your <code>actualSpend</code> is <code>50 USD</code>, and your <code>forecastedSpend</code> is <code>75 USD</code>.
    */
  @js.native
  trait CalculatedSpend extends js.Object {
    var ActualSpend: Spend
    var ForecastedSpend: js.UndefOr[Spend]
  }

  object CalculatedSpend {
    @inline
    def apply(
        ActualSpend: Spend,
        ForecastedSpend: js.UndefOr[Spend] = js.undefined
    ): CalculatedSpend = {
      val __obj = js.Dynamic.literal(
        "ActualSpend" -> ActualSpend.asInstanceOf[js.Any]
      )

      ForecastedSpend.foreach(__v => __obj.updateDynamic("ForecastedSpend")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculatedSpend]
    }
  }

  /**
    * The comparison operator of a notification. Currently the service supports the following operators:
    *  <code>GREATER_THAN</code>, <code>LESS_THAN</code>, <code>EQUAL_TO</code>
    */
  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator {
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComparisonOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[ComparisonOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[ComparisonOperator]

    @inline def values = js.Array(GREATER_THAN, LESS_THAN, EQUAL_TO)
  }

  /**
    * The types of cost that are included in a <code>COST</code> budget, such as tax and subscriptions.
    *  <code>USAGE</code>, <code>RI_UTILIZATION</code>, and <code>RI_COVERAGE</code> budgets do not have <code>CostTypes</code>.
    */
  @js.native
  trait CostTypes extends js.Object {
    var IncludeCredit: js.UndefOr[NullableBoolean]
    var IncludeDiscount: js.UndefOr[NullableBoolean]
    var IncludeOtherSubscription: js.UndefOr[NullableBoolean]
    var IncludeRecurring: js.UndefOr[NullableBoolean]
    var IncludeRefund: js.UndefOr[NullableBoolean]
    var IncludeSubscription: js.UndefOr[NullableBoolean]
    var IncludeSupport: js.UndefOr[NullableBoolean]
    var IncludeTax: js.UndefOr[NullableBoolean]
    var IncludeUpfront: js.UndefOr[NullableBoolean]
    var UseAmortized: js.UndefOr[NullableBoolean]
    var UseBlended: js.UndefOr[NullableBoolean]
  }

  object CostTypes {
    @inline
    def apply(
        IncludeCredit: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeDiscount: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeOtherSubscription: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeRecurring: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeRefund: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeSubscription: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeSupport: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeTax: js.UndefOr[NullableBoolean] = js.undefined,
        IncludeUpfront: js.UndefOr[NullableBoolean] = js.undefined,
        UseAmortized: js.UndefOr[NullableBoolean] = js.undefined,
        UseBlended: js.UndefOr[NullableBoolean] = js.undefined
    ): CostTypes = {
      val __obj = js.Dynamic.literal()
      IncludeCredit.foreach(__v => __obj.updateDynamic("IncludeCredit")(__v.asInstanceOf[js.Any]))
      IncludeDiscount.foreach(__v => __obj.updateDynamic("IncludeDiscount")(__v.asInstanceOf[js.Any]))
      IncludeOtherSubscription.foreach(__v => __obj.updateDynamic("IncludeOtherSubscription")(__v.asInstanceOf[js.Any]))
      IncludeRecurring.foreach(__v => __obj.updateDynamic("IncludeRecurring")(__v.asInstanceOf[js.Any]))
      IncludeRefund.foreach(__v => __obj.updateDynamic("IncludeRefund")(__v.asInstanceOf[js.Any]))
      IncludeSubscription.foreach(__v => __obj.updateDynamic("IncludeSubscription")(__v.asInstanceOf[js.Any]))
      IncludeSupport.foreach(__v => __obj.updateDynamic("IncludeSupport")(__v.asInstanceOf[js.Any]))
      IncludeTax.foreach(__v => __obj.updateDynamic("IncludeTax")(__v.asInstanceOf[js.Any]))
      IncludeUpfront.foreach(__v => __obj.updateDynamic("IncludeUpfront")(__v.asInstanceOf[js.Any]))
      UseAmortized.foreach(__v => __obj.updateDynamic("UseAmortized")(__v.asInstanceOf[js.Any]))
      UseBlended.foreach(__v => __obj.updateDynamic("UseBlended")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostTypes]
    }
  }

  /**
    * Request of CreateBudget
    */
  @js.native
  trait CreateBudgetRequest extends js.Object {
    var AccountId: AccountId
    var Budget: Budget
    var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList]
  }

  object CreateBudgetRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Budget: Budget,
        NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.undefined
    ): CreateBudgetRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Budget" -> Budget.asInstanceOf[js.Any]
      )

      NotificationsWithSubscribers.foreach(__v => __obj.updateDynamic("NotificationsWithSubscribers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBudgetRequest]
    }
  }

  /**
    * Response of CreateBudget
    */
  @js.native
  trait CreateBudgetResponse extends js.Object {}

  object CreateBudgetResponse {
    @inline
    def apply(
    ): CreateBudgetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateBudgetResponse]
    }
  }

  /**
    * Request of CreateNotification
    */
  @js.native
  trait CreateNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var Subscribers: Subscribers
  }

  object CreateNotificationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        Subscribers: Subscribers
    ): CreateNotificationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateNotificationRequest]
    }
  }

  /**
    * Response of CreateNotification
    */
  @js.native
  trait CreateNotificationResponse extends js.Object {}

  object CreateNotificationResponse {
    @inline
    def apply(
    ): CreateNotificationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateNotificationResponse]
    }
  }

  /**
    * Request of CreateSubscriber
    */
  @js.native
  trait CreateSubscriberRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var Subscriber: Subscriber
  }

  object CreateSubscriberRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        Subscriber: Subscriber
    ): CreateSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscriber" -> Subscriber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSubscriberRequest]
    }
  }

  /**
    * Response of CreateSubscriber
    */
  @js.native
  trait CreateSubscriberResponse extends js.Object {}

  object CreateSubscriberResponse {
    @inline
    def apply(
    ): CreateSubscriberResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateSubscriberResponse]
    }
  }

  /**
    * Request of DeleteBudget
    */
  @js.native
  trait DeleteBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
  }

  object DeleteBudgetRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName
    ): DeleteBudgetRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBudgetRequest]
    }
  }

  /**
    * Response of DeleteBudget
    */
  @js.native
  trait DeleteBudgetResponse extends js.Object {}

  object DeleteBudgetResponse {
    @inline
    def apply(
    ): DeleteBudgetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteBudgetResponse]
    }
  }

  /**
    * Request of DeleteNotification
    */
  @js.native
  trait DeleteNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
  }

  object DeleteNotificationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification
    ): DeleteNotificationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNotificationRequest]
    }
  }

  /**
    * Response of DeleteNotification
    */
  @js.native
  trait DeleteNotificationResponse extends js.Object {}

  object DeleteNotificationResponse {
    @inline
    def apply(
    ): DeleteNotificationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteNotificationResponse]
    }
  }

  /**
    * Request of DeleteSubscriber
    */
  @js.native
  trait DeleteSubscriberRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var Subscriber: Subscriber
  }

  object DeleteSubscriberRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        Subscriber: Subscriber
    ): DeleteSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscriber" -> Subscriber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSubscriberRequest]
    }
  }

  /**
    * Response of DeleteSubscriber
    */
  @js.native
  trait DeleteSubscriberResponse extends js.Object {}

  object DeleteSubscriberResponse {
    @inline
    def apply(
    ): DeleteSubscriberResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSubscriberResponse]
    }
  }

  @js.native
  trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  object DescribeBudgetPerformanceHistoryRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): DescribeBudgetPerformanceHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
    }
  }

  @js.native
  trait DescribeBudgetPerformanceHistoryResponse extends js.Object {
    var BudgetPerformanceHistory: js.UndefOr[BudgetPerformanceHistory]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetPerformanceHistoryResponse {
    @inline
    def apply(
        BudgetPerformanceHistory: js.UndefOr[BudgetPerformanceHistory] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetPerformanceHistoryResponse = {
      val __obj = js.Dynamic.literal()
      BudgetPerformanceHistory.foreach(__v => __obj.updateDynamic("BudgetPerformanceHistory")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
    }
  }

  /**
    * Request of DescribeBudget
    */
  @js.native
  trait DescribeBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
  }

  object DescribeBudgetRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName
    ): DescribeBudgetRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeBudgetRequest]
    }
  }

  /**
    * Response of DescribeBudget
    */
  @js.native
  trait DescribeBudgetResponse extends js.Object {
    var Budget: js.UndefOr[Budget]
  }

  object DescribeBudgetResponse {
    @inline
    def apply(
        Budget: js.UndefOr[Budget] = js.undefined
    ): DescribeBudgetResponse = {
      val __obj = js.Dynamic.literal()
      Budget.foreach(__v => __obj.updateDynamic("Budget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetResponse]
    }
  }

  /**
    * Request of DescribeBudgets
    */
  @js.native
  trait DescribeBudgetsRequest extends js.Object {
    var AccountId: AccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetsRequest {
    @inline
    def apply(
        AccountId: AccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetsRequest]
    }
  }

  /**
    * Response of DescribeBudgets
    */
  @js.native
  trait DescribeBudgetsResponse extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetsResponse {
    @inline
    def apply(
        Budgets: js.UndefOr[Budgets] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetsResponse = {
      val __obj = js.Dynamic.literal()
      Budgets.foreach(__v => __obj.updateDynamic("Budgets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetsResponse]
    }
  }

  /**
    * Request of DescribeNotificationsForBudget
    */
  @js.native
  trait DescribeNotificationsForBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeNotificationsForBudgetRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeNotificationsForBudgetRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationsForBudgetRequest]
    }
  }

  /**
    * Response of GetNotificationsForBudget
    */
  @js.native
  trait DescribeNotificationsForBudgetResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Notifications: js.UndefOr[Notifications]
  }

  object DescribeNotificationsForBudgetResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Notifications: js.UndefOr[Notifications] = js.undefined
    ): DescribeNotificationsForBudgetResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationsForBudgetResponse]
    }
  }

  /**
    * Request of DescribeSubscribersForNotification
    */
  @js.native
  trait DescribeSubscribersForNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeSubscribersForNotificationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeSubscribersForNotificationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscribersForNotificationRequest]
    }
  }

  /**
    * Response of DescribeSubscribersForNotification
    */
  @js.native
  trait DescribeSubscribersForNotificationResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Subscribers: js.UndefOr[Subscribers]
  }

  object DescribeSubscribersForNotificationResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Subscribers: js.UndefOr[Subscribers] = js.undefined
    ): DescribeSubscribersForNotificationResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Subscribers.foreach(__v => __obj.updateDynamic("Subscribers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
    }
  }

  /**
    * A notification that is associated with a budget. A budget can have up to five notifications.
    *  Each notification must have at least one subscriber. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers.
    *  For example, if you have a budget for 200 dollars and you want to be notified when you go over 160 dollars, create a notification with the following parameters:
    * * A notificationType of <code>ACTUAL</code>
    *  * A <code>thresholdType</code> of <code>PERCENTAGE</code>
    *  * A <code>comparisonOperator</code> of <code>GREATER_THAN</code>
    *  * A notification <code>threshold</code> of <code>80</code>
    */
  @js.native
  trait Notification extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var NotificationType: NotificationType
    var Threshold: NotificationThreshold
    var NotificationState: js.UndefOr[NotificationState]
    var ThresholdType: js.UndefOr[ThresholdType]
  }

  object Notification {
    @inline
    def apply(
        ComparisonOperator: ComparisonOperator,
        NotificationType: NotificationType,
        Threshold: NotificationThreshold,
        NotificationState: js.UndefOr[NotificationState] = js.undefined,
        ThresholdType: js.UndefOr[ThresholdType] = js.undefined
    ): Notification = {
      val __obj = js.Dynamic.literal(
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "NotificationType" -> NotificationType.asInstanceOf[js.Any],
        "Threshold" -> Threshold.asInstanceOf[js.Any]
      )

      NotificationState.foreach(__v => __obj.updateDynamic("NotificationState")(__v.asInstanceOf[js.Any]))
      ThresholdType.foreach(__v => __obj.updateDynamic("ThresholdType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Notification]
    }
  }

  @js.native
  sealed trait NotificationState extends js.Any
  object NotificationState {
    val OK = "OK".asInstanceOf[NotificationState]
    val ALARM = "ALARM".asInstanceOf[NotificationState]

    @inline def values = js.Array(OK, ALARM)
  }

  /**
    * The type of a notification. It must be ACTUAL or FORECASTED.
    */
  @js.native
  sealed trait NotificationType extends js.Any
  object NotificationType {
    val ACTUAL = "ACTUAL".asInstanceOf[NotificationType]
    val FORECASTED = "FORECASTED".asInstanceOf[NotificationType]

    @inline def values = js.Array(ACTUAL, FORECASTED)
  }

  /**
    * A notification with subscribers. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers.
    */
  @js.native
  trait NotificationWithSubscribers extends js.Object {
    var Notification: Notification
    var Subscribers: Subscribers
  }

  object NotificationWithSubscribers {
    @inline
    def apply(
        Notification: Notification,
        Subscribers: Subscribers
    ): NotificationWithSubscribers = {
      val __obj = js.Dynamic.literal(
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NotificationWithSubscribers]
    }
  }

  /**
    * The amount of cost or usage that is measured for a budget.
    *  For example, a <code>Spend</code> for <code>3 GB</code> of S3 usage would have the following parameters:
    * * An <code>Amount</code> of <code>3</code>
    *  * A <code>unit</code> of <code>GB</code>
    */
  @js.native
  trait Spend extends js.Object {
    var Amount: NumericValue
    var Unit: UnitValue
  }

  object Spend {
    @inline
    def apply(
        Amount: NumericValue,
        Unit: UnitValue
    ): Spend = {
      val __obj = js.Dynamic.literal(
        "Amount" -> Amount.asInstanceOf[js.Any],
        "Unit" -> Unit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Spend]
    }
  }

  /**
    * The subscriber to a budget notification. The subscriber consists of a subscription type and either an Amazon SNS topic or an email address.
    *  For example, an email subscriber would have the following parameters:
    * * A <code>subscriptionType</code> of <code>EMAIL</code>
    *  * An <code>address</code> of <code>example@example.com</code>
    */
  @js.native
  trait Subscriber extends js.Object {
    var Address: SubscriberAddress
    var SubscriptionType: SubscriptionType
  }

  object Subscriber {
    @inline
    def apply(
        Address: SubscriberAddress,
        SubscriptionType: SubscriptionType
    ): Subscriber = {
      val __obj = js.Dynamic.literal(
        "Address" -> Address.asInstanceOf[js.Any],
        "SubscriptionType" -> SubscriptionType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Subscriber]
    }
  }

  /**
    * The subscription type of the subscriber. It can be SMS or EMAIL.
    */
  @js.native
  sealed trait SubscriptionType extends js.Any
  object SubscriptionType {
    val SNS = "SNS".asInstanceOf[SubscriptionType]
    val EMAIL = "EMAIL".asInstanceOf[SubscriptionType]

    @inline def values = js.Array(SNS, EMAIL)
  }

  /**
    * The type of threshold for a notification. It can be PERCENTAGE or ABSOLUTE_VALUE.
    */
  @js.native
  sealed trait ThresholdType extends js.Any
  object ThresholdType {
    val PERCENTAGE = "PERCENTAGE".asInstanceOf[ThresholdType]
    val ABSOLUTE_VALUE = "ABSOLUTE_VALUE".asInstanceOf[ThresholdType]

    @inline def values = js.Array(PERCENTAGE, ABSOLUTE_VALUE)
  }

  /**
    * The period of time that is covered by a budget. The period has a start date and an end date. The start date must come before the end date. There are no restrictions on the end date.
    */
  @js.native
  trait TimePeriod extends js.Object {
    var End: js.UndefOr[GenericTimestamp]
    var Start: js.UndefOr[GenericTimestamp]
  }

  object TimePeriod {
    @inline
    def apply(
        End: js.UndefOr[GenericTimestamp] = js.undefined,
        Start: js.UndefOr[GenericTimestamp] = js.undefined
    ): TimePeriod = {
      val __obj = js.Dynamic.literal()
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimePeriod]
    }
  }

  /**
    * The time unit of the budget, such as MONTHLY or QUARTERLY.
    */
  @js.native
  sealed trait TimeUnit extends js.Any
  object TimeUnit {
    val DAILY = "DAILY".asInstanceOf[TimeUnit]
    val MONTHLY = "MONTHLY".asInstanceOf[TimeUnit]
    val QUARTERLY = "QUARTERLY".asInstanceOf[TimeUnit]
    val ANNUALLY = "ANNUALLY".asInstanceOf[TimeUnit]

    @inline def values = js.Array(DAILY, MONTHLY, QUARTERLY, ANNUALLY)
  }

  /**
    * Request of UpdateBudget
    */
  @js.native
  trait UpdateBudgetRequest extends js.Object {
    var AccountId: AccountId
    var NewBudget: Budget
  }

  object UpdateBudgetRequest {
    @inline
    def apply(
        AccountId: AccountId,
        NewBudget: Budget
    ): UpdateBudgetRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "NewBudget" -> NewBudget.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateBudgetRequest]
    }
  }

  /**
    * Response of UpdateBudget
    */
  @js.native
  trait UpdateBudgetResponse extends js.Object {}

  object UpdateBudgetResponse {
    @inline
    def apply(
    ): UpdateBudgetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateBudgetResponse]
    }
  }

  /**
    * Request of UpdateNotification
    */
  @js.native
  trait UpdateNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var NewNotification: Notification
    var OldNotification: Notification
  }

  object UpdateNotificationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        NewNotification: Notification,
        OldNotification: Notification
    ): UpdateNotificationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "NewNotification" -> NewNotification.asInstanceOf[js.Any],
        "OldNotification" -> OldNotification.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateNotificationRequest]
    }
  }

  /**
    * Response of UpdateNotification
    */
  @js.native
  trait UpdateNotificationResponse extends js.Object {}

  object UpdateNotificationResponse {
    @inline
    def apply(
    ): UpdateNotificationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNotificationResponse]
    }
  }

  /**
    * Request of UpdateSubscriber
    */
  @js.native
  trait UpdateSubscriberRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var NewSubscriber: Subscriber
    var Notification: Notification
    var OldSubscriber: Subscriber
  }

  object UpdateSubscriberRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        NewSubscriber: Subscriber,
        Notification: Notification,
        OldSubscriber: Subscriber
    ): UpdateSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "NewSubscriber" -> NewSubscriber.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "OldSubscriber" -> OldSubscriber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSubscriberRequest]
    }
  }

  /**
    * Response of UpdateSubscriber
    */
  @js.native
  trait UpdateSubscriberResponse extends js.Object {}

  object UpdateSubscriberResponse {
    @inline
    def apply(
    ): UpdateSubscriberResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateSubscriberResponse]
    }
  }
}
