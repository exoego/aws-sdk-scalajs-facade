package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object budgetsservice {
  type AccountId = String
  type BudgetName = String
  type BudgetType = String
  type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]
  type Budgets = js.Array[Budget]
  type ComparisonOperator = String
  type CostFilters = js.Dictionary[DimensionValues]
  type DimensionValues = js.Array[GenericString]
  type GenericString = String
  type GenericTimestamp = js.Date
  type MaxResults = Int
  type NotificationState = String
  type NotificationThreshold = Double
  type NotificationType = String
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = Boolean
  type NumericValue = String
  type SubscriberAddress = String
  type Subscribers = js.Array[Subscriber]
  type SubscriptionType = String
  type ThresholdType = String
  type TimeUnit = String
  type UnitValue = String
}

package budgetsservice {
  @js.native
  @JSImport("aws-sdk", "Budgets")
  class BudgetsService(config: AWSConfig) extends js.Object {
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
   * <p>Represents the output of the <code>CreateBudget</code> operation. The content consists of the detailed metadata and data file information, and the current status of the <code>budget</code> object.</p> <p>This is the ARN pattern for a budget: </p> <p> <code>arn:aws:budgetservice::AccountId:budget/budgetName</code> </p>
   */
  @js.native
  trait Budget extends js.Object {
    var TimePeriod: js.UndefOr[TimePeriod]
    var BudgetType: js.UndefOr[BudgetType]
    var CostTypes: js.UndefOr[CostTypes]
    var LastUpdatedTime: js.UndefOr[GenericTimestamp]
    var CostFilters: js.UndefOr[CostFilters]
    var BudgetName: js.UndefOr[BudgetName]
    var BudgetLimit: js.UndefOr[Spend]
    var TimeUnit: js.UndefOr[TimeUnit]
    var CalculatedSpend: js.UndefOr[CalculatedSpend]
  }

  object Budget {
    def apply(
      TimePeriod: js.UndefOr[TimePeriod] = js.undefined,
      BudgetType: js.UndefOr[BudgetType] = js.undefined,
      CostTypes: js.UndefOr[CostTypes] = js.undefined,
      LastUpdatedTime: js.UndefOr[GenericTimestamp] = js.undefined,
      CostFilters: js.UndefOr[CostFilters] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      BudgetLimit: js.UndefOr[Spend] = js.undefined,
      TimeUnit: js.UndefOr[TimeUnit] = js.undefined,
      CalculatedSpend: js.UndefOr[CalculatedSpend] = js.undefined): Budget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "BudgetType" -> BudgetType.map { x => x.asInstanceOf[js.Any] },
        "CostTypes" -> CostTypes.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "CostFilters" -> CostFilters.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "BudgetLimit" -> BudgetLimit.map { x => x.asInstanceOf[js.Any] },
        "TimeUnit" -> TimeUnit.map { x => x.asInstanceOf[js.Any] },
        "CalculatedSpend" -> CalculatedSpend.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Budget]
    }
  }

  /**
   * <p>A history of the state of a budget at the end of the budget's specified time period.</p>
   */
  @js.native
  trait BudgetPerformanceHistory extends js.Object {
    var BudgetType: js.UndefOr[BudgetType]
    var CostTypes: js.UndefOr[CostTypes]
    var CostFilters: js.UndefOr[CostFilters]
    var BudgetName: js.UndefOr[BudgetName]
    var TimeUnit: js.UndefOr[TimeUnit]
    var BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList]
  }

  object BudgetPerformanceHistory {
    def apply(
      BudgetType: js.UndefOr[BudgetType] = js.undefined,
      CostTypes: js.UndefOr[CostTypes] = js.undefined,
      CostFilters: js.UndefOr[CostFilters] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      TimeUnit: js.UndefOr[TimeUnit] = js.undefined,
      BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList] = js.undefined): BudgetPerformanceHistory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BudgetType" -> BudgetType.map { x => x.asInstanceOf[js.Any] },
        "CostTypes" -> CostTypes.map { x => x.asInstanceOf[js.Any] },
        "CostFilters" -> CostFilters.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "TimeUnit" -> TimeUnit.map { x => x.asInstanceOf[js.Any] },
        "BudgetedAndActualAmountsList" -> BudgetedAndActualAmountsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BudgetPerformanceHistory]
    }
  }

  /**
   * <p> The type of a budget. It must be one of the following types: </p> <p> <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, or <code>RI_COVERAGE</code>.</p>
   */
  object BudgetTypeEnum {
    val USAGE = "USAGE"
    val COST = "COST"
    val RI_UTILIZATION = "RI_UTILIZATION"
    val RI_COVERAGE = "RI_COVERAGE"

    val values = IndexedSeq(USAGE, COST, RI_UTILIZATION, RI_COVERAGE)
  }

  /**
   * <p>The amount of cost or usage that you created the budget for, compared to your actual costs or usage.</p>
   */
  @js.native
  trait BudgetedAndActualAmounts extends js.Object {
    var BudgetedAmount: js.UndefOr[Spend]
    var ActualAmount: js.UndefOr[Spend]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  object BudgetedAndActualAmounts {
    def apply(
      BudgetedAmount: js.UndefOr[Spend] = js.undefined,
      ActualAmount: js.UndefOr[Spend] = js.undefined,
      TimePeriod: js.UndefOr[TimePeriod] = js.undefined): BudgetedAndActualAmounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BudgetedAmount" -> BudgetedAmount.map { x => x.asInstanceOf[js.Any] },
        "ActualAmount" -> ActualAmount.map { x => x.asInstanceOf[js.Any] },
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BudgetedAndActualAmounts]
    }
  }

  /**
   * <p>The spend objects that are associated with this budget. The <code>actualSpend</code> tracks how much you've used, cost, usage, or RI units, and the <code>forecastedSpend</code> tracks how much you are predicted to spend if your current usage remains steady.</p> <p>For example, if it is the 20th of the month and you have spent <code>50</code> dollars on Amazon EC2, your <code>actualSpend</code> is <code>50 USD</code>, and your <code>forecastedSpend</code> is <code>75 USD</code>.</p>
   */
  @js.native
  trait CalculatedSpend extends js.Object {
    var ActualSpend: js.UndefOr[Spend]
    var ForecastedSpend: js.UndefOr[Spend]
  }

  object CalculatedSpend {
    def apply(
      ActualSpend: js.UndefOr[Spend] = js.undefined,
      ForecastedSpend: js.UndefOr[Spend] = js.undefined): CalculatedSpend = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActualSpend" -> ActualSpend.map { x => x.asInstanceOf[js.Any] },
        "ForecastedSpend" -> ForecastedSpend.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CalculatedSpend]
    }
  }

  /**
   * <p> The comparison operator of a notification. Currently the service supports the following operators:</p> <p> <code>GREATER_THAN</code>, <code>LESS_THAN</code>, <code>EQUAL_TO</code> </p>
   */
  object ComparisonOperatorEnum {
    val GREATER_THAN = "GREATER_THAN"
    val LESS_THAN = "LESS_THAN"
    val EQUAL_TO = "EQUAL_TO"

    val values = IndexedSeq(GREATER_THAN, LESS_THAN, EQUAL_TO)
  }

  /**
   * <p>The types of cost that are included in a <code>COST</code> budget, such as tax and subscriptions.</p> <p> <code>USAGE</code>, <code>RI_UTILIZATION</code>, and <code>RI_COVERAGE</code> budgets do not have <code>CostTypes</code>.</p>
   */
  @js.native
  trait CostTypes extends js.Object {
    var UseAmortized: js.UndefOr[NullableBoolean]
    var UseBlended: js.UndefOr[NullableBoolean]
    var IncludeCredit: js.UndefOr[NullableBoolean]
    var IncludeOtherSubscription: js.UndefOr[NullableBoolean]
    var IncludeSupport: js.UndefOr[NullableBoolean]
    var IncludeUpfront: js.UndefOr[NullableBoolean]
    var IncludeRefund: js.UndefOr[NullableBoolean]
    var IncludeTax: js.UndefOr[NullableBoolean]
    var IncludeDiscount: js.UndefOr[NullableBoolean]
    var IncludeRecurring: js.UndefOr[NullableBoolean]
    var IncludeSubscription: js.UndefOr[NullableBoolean]
  }

  object CostTypes {
    def apply(
      UseAmortized: js.UndefOr[NullableBoolean] = js.undefined,
      UseBlended: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeCredit: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeOtherSubscription: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeSupport: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeUpfront: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeRefund: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeTax: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeDiscount: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeRecurring: js.UndefOr[NullableBoolean] = js.undefined,
      IncludeSubscription: js.UndefOr[NullableBoolean] = js.undefined): CostTypes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UseAmortized" -> UseAmortized.map { x => x.asInstanceOf[js.Any] },
        "UseBlended" -> UseBlended.map { x => x.asInstanceOf[js.Any] },
        "IncludeCredit" -> IncludeCredit.map { x => x.asInstanceOf[js.Any] },
        "IncludeOtherSubscription" -> IncludeOtherSubscription.map { x => x.asInstanceOf[js.Any] },
        "IncludeSupport" -> IncludeSupport.map { x => x.asInstanceOf[js.Any] },
        "IncludeUpfront" -> IncludeUpfront.map { x => x.asInstanceOf[js.Any] },
        "IncludeRefund" -> IncludeRefund.map { x => x.asInstanceOf[js.Any] },
        "IncludeTax" -> IncludeTax.map { x => x.asInstanceOf[js.Any] },
        "IncludeDiscount" -> IncludeDiscount.map { x => x.asInstanceOf[js.Any] },
        "IncludeRecurring" -> IncludeRecurring.map { x => x.asInstanceOf[js.Any] },
        "IncludeSubscription" -> IncludeSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CostTypes]
    }
  }

  /**
   * <p> Request of CreateBudget </p>
   */
  @js.native
  trait CreateBudgetRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Budget: js.UndefOr[Budget]
    var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList]
  }

  object CreateBudgetRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      Budget: js.UndefOr[Budget] = js.undefined,
      NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.undefined): CreateBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Budget" -> Budget.map { x => x.asInstanceOf[js.Any] },
        "NotificationsWithSubscribers" -> NotificationsWithSubscribers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBudgetRequest]
    }
  }

  /**
   * <p> Response of CreateBudget </p>
   */
  @js.native
  trait CreateBudgetResponse extends js.Object {

  }

  object CreateBudgetResponse {
    def apply(): CreateBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBudgetResponse]
    }
  }

  /**
   * <p> Request of CreateNotification </p>
   */
  @js.native
  trait CreateNotificationRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
    var Notification: js.UndefOr[Notification]
    var Subscribers: js.UndefOr[Subscribers]
  }

  object CreateNotificationRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Subscribers: js.UndefOr[Subscribers] = js.undefined): CreateNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Subscribers" -> Subscribers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotificationRequest]
    }
  }

  /**
   * <p> Response of CreateNotification </p>
   */
  @js.native
  trait CreateNotificationResponse extends js.Object {

  }

  object CreateNotificationResponse {
    def apply(): CreateNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotificationResponse]
    }
  }

  /**
   * <p> Request of CreateSubscriber </p>
   */
  @js.native
  trait CreateSubscriberRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
    var Notification: js.UndefOr[Notification]
    var Subscriber: js.UndefOr[Subscriber]
  }

  object CreateSubscriberRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Subscriber: js.UndefOr[Subscriber] = js.undefined): CreateSubscriberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Subscriber" -> Subscriber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriberRequest]
    }
  }

  /**
   * <p> Response of CreateSubscriber </p>
   */
  @js.native
  trait CreateSubscriberResponse extends js.Object {

  }

  object CreateSubscriberResponse {
    def apply(): CreateSubscriberResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriberResponse]
    }
  }

  /**
   * <p> Request of DeleteBudget </p>
   */
  @js.native
  trait DeleteBudgetRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
  }

  object DeleteBudgetRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined): DeleteBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBudgetRequest]
    }
  }

  /**
   * <p> Response of DeleteBudget </p>
   */
  @js.native
  trait DeleteBudgetResponse extends js.Object {

  }

  object DeleteBudgetResponse {
    def apply(): DeleteBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBudgetResponse]
    }
  }

  /**
   * <p> Request of DeleteNotification </p>
   */
  @js.native
  trait DeleteNotificationRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
    var Notification: js.UndefOr[Notification]
  }

  object DeleteNotificationRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined): DeleteNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationRequest]
    }
  }

  /**
   * <p> Response of DeleteNotification </p>
   */
  @js.native
  trait DeleteNotificationResponse extends js.Object {

  }

  object DeleteNotificationResponse {
    def apply(): DeleteNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationResponse]
    }
  }

  /**
   * <p> Request of DeleteSubscriber </p>
   */
  @js.native
  trait DeleteSubscriberRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
    var Notification: js.UndefOr[Notification]
    var Subscriber: js.UndefOr[Subscriber]
  }

  object DeleteSubscriberRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Subscriber: js.UndefOr[Subscriber] = js.undefined): DeleteSubscriberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Subscriber" -> Subscriber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriberRequest]
    }
  }

  /**
   * <p> Response of DeleteSubscriber </p>
   */
  @js.native
  trait DeleteSubscriberResponse extends js.Object {

  }

  object DeleteSubscriberResponse {
    def apply(): DeleteSubscriberResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriberResponse]
    }
  }

  @js.native
  trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
    var TimePeriod: js.UndefOr[TimePeriod]
    var MaxResults: js.UndefOr[MaxResults]
    var BudgetName: js.UndefOr[BudgetName]
    var AccountId: js.UndefOr[AccountId]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetPerformanceHistoryRequest {
    def apply(
      TimePeriod: js.UndefOr[TimePeriod] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeBudgetPerformanceHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimePeriod" -> TimePeriod.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
    }
  }

  @js.native
  trait DescribeBudgetPerformanceHistoryResponse extends js.Object {
    var BudgetPerformanceHistory: js.UndefOr[BudgetPerformanceHistory]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetPerformanceHistoryResponse {
    def apply(
      BudgetPerformanceHistory: js.UndefOr[BudgetPerformanceHistory] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeBudgetPerformanceHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BudgetPerformanceHistory" -> BudgetPerformanceHistory.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
    }
  }

  /**
   * <p> Request of DescribeBudget </p>
   */
  @js.native
  trait DescribeBudgetRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
  }

  object DescribeBudgetRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined): DescribeBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetRequest]
    }
  }

  /**
   * <p> Response of DescribeBudget </p>
   */
  @js.native
  trait DescribeBudgetResponse extends js.Object {
    var Budget: js.UndefOr[Budget]
  }

  object DescribeBudgetResponse {
    def apply(
      Budget: js.UndefOr[Budget] = js.undefined): DescribeBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Budget" -> Budget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetResponse]
    }
  }

  /**
   * <p> Request of DescribeBudgets </p>
   */
  @js.native
  trait DescribeBudgetsRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetsRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeBudgetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetsRequest]
    }
  }

  /**
   * <p> Response of DescribeBudgets </p>
   */
  @js.native
  trait DescribeBudgetsResponse extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetsResponse {
    def apply(
      Budgets: js.UndefOr[Budgets] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeBudgetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Budgets" -> Budgets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetsResponse]
    }
  }

  /**
   * <p> Request of DescribeNotificationsForBudget </p>
   */
  @js.native
  trait DescribeNotificationsForBudgetRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeNotificationsForBudgetRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeNotificationsForBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationsForBudgetRequest]
    }
  }

  /**
   * <p> Response of GetNotificationsForBudget </p>
   */
  @js.native
  trait DescribeNotificationsForBudgetResponse extends js.Object {
    var Notifications: js.UndefOr[Notifications]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeNotificationsForBudgetResponse {
    def apply(
      Notifications: js.UndefOr[Notifications] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeNotificationsForBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notifications" -> Notifications.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationsForBudgetResponse]
    }
  }

  /**
   * <p> Request of DescribeSubscribersForNotification </p>
   */
  @js.native
  trait DescribeSubscribersForNotificationRequest extends js.Object {
    var Notification: js.UndefOr[Notification]
    var MaxResults: js.UndefOr[MaxResults]
    var BudgetName: js.UndefOr[BudgetName]
    var AccountId: js.UndefOr[AccountId]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeSubscribersForNotificationRequest {
    def apply(
      Notification: js.UndefOr[Notification] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeSubscribersForNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribersForNotificationRequest]
    }
  }

  /**
   * <p> Response of DescribeSubscribersForNotification </p>
   */
  @js.native
  trait DescribeSubscribersForNotificationResponse extends js.Object {
    var Subscribers: js.UndefOr[Subscribers]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeSubscribersForNotificationResponse {
    def apply(
      Subscribers: js.UndefOr[Subscribers] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeSubscribersForNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subscribers" -> Subscribers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribersForNotificationResponse]
    }
  }

  /**
   * <p>A notification that is associated with a budget. A budget can have up to five notifications. </p> <p>Each notification must have at least one subscriber. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers.</p> <p>For example, if you have a budget for 200 dollars and you want to be notified when you go over 160 dollars, create a notification with the following parameters:</p> <ul> <li> <p>A notificationType of <code>ACTUAL</code> </p> </li> <li> <p>A <code>thresholdType</code> of <code>PERCENTAGE</code> </p> </li> <li> <p>A <code>comparisonOperator</code> of <code>GREATER_THAN</code> </p> </li> <li> <p>A notification <code>threshold</code> of <code>80</code> </p> </li> </ul>
   */
  @js.native
  trait Notification extends js.Object {
    var Threshold: js.UndefOr[NotificationThreshold]
    var NotificationState: js.UndefOr[NotificationState]
    var ThresholdType: js.UndefOr[ThresholdType]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var NotificationType: js.UndefOr[NotificationType]
  }

  object Notification {
    def apply(
      Threshold: js.UndefOr[NotificationThreshold] = js.undefined,
      NotificationState: js.UndefOr[NotificationState] = js.undefined,
      ThresholdType: js.UndefOr[ThresholdType] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined): Notification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Threshold" -> Threshold.map { x => x.asInstanceOf[js.Any] },
        "NotificationState" -> NotificationState.map { x => x.asInstanceOf[js.Any] },
        "ThresholdType" -> ThresholdType.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "NotificationType" -> NotificationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Notification]
    }
  }

  object NotificationStateEnum {
    val OK = "OK"
    val ALARM = "ALARM"

    val values = IndexedSeq(OK, ALARM)
  }

  /**
   * <p> The type of a notification. It must be ACTUAL or FORECASTED.</p>
   */
  object NotificationTypeEnum {
    val ACTUAL = "ACTUAL"
    val FORECASTED = "FORECASTED"

    val values = IndexedSeq(ACTUAL, FORECASTED)
  }

  /**
   * <p>A notification with subscribers. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers.</p>
   */
  @js.native
  trait NotificationWithSubscribers extends js.Object {
    var Notification: js.UndefOr[Notification]
    var Subscribers: js.UndefOr[Subscribers]
  }

  object NotificationWithSubscribers {
    def apply(
      Notification: js.UndefOr[Notification] = js.undefined,
      Subscribers: js.UndefOr[Subscribers] = js.undefined): NotificationWithSubscribers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Subscribers" -> Subscribers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationWithSubscribers]
    }
  }

  /**
   * <p>The amount of cost or usage that is measured for a budget.</p> <p>For example, a <code>Spend</code> for <code>3 GB</code> of S3 usage would have the following parameters:</p> <ul> <li> <p>An <code>Amount</code> of <code>3</code> </p> </li> <li> <p>A <code>unit</code> of <code>GB</code> </p> </li> </ul>
   */
  @js.native
  trait Spend extends js.Object {
    var Amount: js.UndefOr[NumericValue]
    var Unit: js.UndefOr[UnitValue]
  }

  object Spend {
    def apply(
      Amount: js.UndefOr[NumericValue] = js.undefined,
      Unit: js.UndefOr[UnitValue] = js.undefined): Spend = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Amount" -> Amount.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Spend]
    }
  }

  /**
   * <p>The subscriber to a budget notification. The subscriber consists of a subscription type and either an Amazon SNS topic or an email address.</p> <p>For example, an email subscriber would have the following parameters:</p> <ul> <li> <p>A <code>subscriptionType</code> of <code>EMAIL</code> </p> </li> <li> <p>An <code>address</code> of <code>example@example.com</code> </p> </li> </ul>
   */
  @js.native
  trait Subscriber extends js.Object {
    var SubscriptionType: js.UndefOr[SubscriptionType]
    var Address: js.UndefOr[SubscriberAddress]
  }

  object Subscriber {
    def apply(
      SubscriptionType: js.UndefOr[SubscriptionType] = js.undefined,
      Address: js.UndefOr[SubscriberAddress] = js.undefined): Subscriber = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionType" -> SubscriptionType.map { x => x.asInstanceOf[js.Any] },
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscriber]
    }
  }

  /**
   * <p> The subscription type of the subscriber. It can be SMS or EMAIL.</p>
   */
  object SubscriptionTypeEnum {
    val SNS = "SNS"
    val EMAIL = "EMAIL"

    val values = IndexedSeq(SNS, EMAIL)
  }

  /**
   * <p> The type of threshold for a notification. It can be PERCENTAGE or ABSOLUTE_VALUE.</p>
   */
  object ThresholdTypeEnum {
    val PERCENTAGE = "PERCENTAGE"
    val ABSOLUTE_VALUE = "ABSOLUTE_VALUE"

    val values = IndexedSeq(PERCENTAGE, ABSOLUTE_VALUE)
  }

  /**
   * <p>The period of time that is covered by a budget. The period has a start date and an end date. The start date must come before the end date. There are no restrictions on the end date. </p>
   */
  @js.native
  trait TimePeriod extends js.Object {
    var Start: js.UndefOr[GenericTimestamp]
    var End: js.UndefOr[GenericTimestamp]
  }

  object TimePeriod {
    def apply(
      Start: js.UndefOr[GenericTimestamp] = js.undefined,
      End: js.UndefOr[GenericTimestamp] = js.undefined): TimePeriod = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Start" -> Start.map { x => x.asInstanceOf[js.Any] },
        "End" -> End.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimePeriod]
    }
  }

  /**
   * <p> The time unit of the budget, such as MONTHLY or QUARTERLY.</p>
   */
  object TimeUnitEnum {
    val DAILY = "DAILY"
    val MONTHLY = "MONTHLY"
    val QUARTERLY = "QUARTERLY"
    val ANNUALLY = "ANNUALLY"

    val values = IndexedSeq(DAILY, MONTHLY, QUARTERLY, ANNUALLY)
  }

  /**
   * <p> Request of UpdateBudget </p>
   */
  @js.native
  trait UpdateBudgetRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var NewBudget: js.UndefOr[Budget]
  }

  object UpdateBudgetRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      NewBudget: js.UndefOr[Budget] = js.undefined): UpdateBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "NewBudget" -> NewBudget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBudgetRequest]
    }
  }

  /**
   * <p> Response of UpdateBudget </p>
   */
  @js.native
  trait UpdateBudgetResponse extends js.Object {

  }

  object UpdateBudgetResponse {
    def apply(): UpdateBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBudgetResponse]
    }
  }

  /**
   * <p> Request of UpdateNotification </p>
   */
  @js.native
  trait UpdateNotificationRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var BudgetName: js.UndefOr[BudgetName]
    var OldNotification: js.UndefOr[Notification]
    var NewNotification: js.UndefOr[Notification]
  }

  object UpdateNotificationRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      OldNotification: js.UndefOr[Notification] = js.undefined,
      NewNotification: js.UndefOr[Notification] = js.undefined): UpdateNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "OldNotification" -> OldNotification.map { x => x.asInstanceOf[js.Any] },
        "NewNotification" -> NewNotification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotificationRequest]
    }
  }

  /**
   * <p> Response of UpdateNotification </p>
   */
  @js.native
  trait UpdateNotificationResponse extends js.Object {

  }

  object UpdateNotificationResponse {
    def apply(): UpdateNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotificationResponse]
    }
  }

  /**
   * <p> Request of UpdateSubscriber </p>
   */
  @js.native
  trait UpdateSubscriberRequest extends js.Object {
    var Notification: js.UndefOr[Notification]
    var OldSubscriber: js.UndefOr[Subscriber]
    var BudgetName: js.UndefOr[BudgetName]
    var NewSubscriber: js.UndefOr[Subscriber]
    var AccountId: js.UndefOr[AccountId]
  }

  object UpdateSubscriberRequest {
    def apply(
      Notification: js.UndefOr[Notification] = js.undefined,
      OldSubscriber: js.UndefOr[Subscriber] = js.undefined,
      BudgetName: js.UndefOr[BudgetName] = js.undefined,
      NewSubscriber: js.UndefOr[Subscriber] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined): UpdateSubscriberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "OldSubscriber" -> OldSubscriber.map { x => x.asInstanceOf[js.Any] },
        "BudgetName" -> BudgetName.map { x => x.asInstanceOf[js.Any] },
        "NewSubscriber" -> NewSubscriber.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriberRequest]
    }
  }

  /**
   * <p> Response of UpdateSubscriber </p>
   */
  @js.native
  trait UpdateSubscriberResponse extends js.Object {

  }

  object UpdateSubscriberResponse {
    def apply(): UpdateSubscriberResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriberResponse]
    }
  }
}
