package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object budgetsservice {
  type AccountId                       = String
  type BudgetName                      = String
  type BudgetType                      = String
  type BudgetedAndActualAmountsList    = js.Array[BudgetedAndActualAmounts]
  type Budgets                         = js.Array[Budget]
  type ComparisonOperator              = String
  type CostFilters                     = js.Dictionary[DimensionValues]
  type DimensionValues                 = js.Array[GenericString]
  type GenericString                   = String
  type GenericTimestamp                = js.Date
  type MaxResults                      = Int
  type NotificationState               = String
  type NotificationThreshold           = Double
  type NotificationType                = String
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications                   = js.Array[Notification]
  type NullableBoolean                 = Boolean
  type NumericValue                    = String
  type SubscriberAddress               = String
  type Subscribers                     = js.Array[Subscriber]
  type SubscriptionType                = String
  type ThresholdType                   = String
  type TimeUnit                        = String
  type UnitValue                       = String

  implicit final class BudgetsServiceOps(val service: BudgetsService) extends AnyVal {

    def createBudgetFuture(params: CreateBudgetRequest): Future[CreateBudgetResponse] =
      service.createBudget(params).promise.toFuture
    def createNotificationFuture(params: CreateNotificationRequest): Future[CreateNotificationResponse] =
      service.createNotification(params).promise.toFuture
    def createSubscriberFuture(params: CreateSubscriberRequest): Future[CreateSubscriberResponse] =
      service.createSubscriber(params).promise.toFuture
    def deleteBudgetFuture(params: DeleteBudgetRequest): Future[DeleteBudgetResponse] =
      service.deleteBudget(params).promise.toFuture
    def deleteNotificationFuture(params: DeleteNotificationRequest): Future[DeleteNotificationResponse] =
      service.deleteNotification(params).promise.toFuture
    def deleteSubscriberFuture(params: DeleteSubscriberRequest): Future[DeleteSubscriberResponse] =
      service.deleteSubscriber(params).promise.toFuture
    def describeBudgetFuture(params: DescribeBudgetRequest): Future[DescribeBudgetResponse] =
      service.describeBudget(params).promise.toFuture
    def describeBudgetPerformanceHistoryFuture(
        params: DescribeBudgetPerformanceHistoryRequest
    ): Future[DescribeBudgetPerformanceHistoryResponse] =
      service.describeBudgetPerformanceHistory(params).promise.toFuture
    def describeBudgetsFuture(params: DescribeBudgetsRequest): Future[DescribeBudgetsResponse] =
      service.describeBudgets(params).promise.toFuture
    def describeNotificationsForBudgetFuture(
        params: DescribeNotificationsForBudgetRequest
    ): Future[DescribeNotificationsForBudgetResponse] = service.describeNotificationsForBudget(params).promise.toFuture
    def describeSubscribersForNotificationFuture(
        params: DescribeSubscribersForNotificationRequest
    ): Future[DescribeSubscribersForNotificationResponse] =
      service.describeSubscribersForNotification(params).promise.toFuture
    def updateBudgetFuture(params: UpdateBudgetRequest): Future[UpdateBudgetResponse] =
      service.updateBudget(params).promise.toFuture
    def updateNotificationFuture(params: UpdateNotificationRequest): Future[UpdateNotificationResponse] =
      service.updateNotification(params).promise.toFuture
    def updateSubscriberFuture(params: UpdateSubscriberRequest): Future[UpdateSubscriberResponse] =
      service.updateSubscriber(params).promise.toFuture
  }
}

package budgetsservice {
  @js.native
  @JSImport("aws-sdk", "Budgets")
  class BudgetsService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBudget(params: CreateBudgetRequest): Request[CreateBudgetResponse]                   = js.native
    def createNotification(params: CreateNotificationRequest): Request[CreateNotificationResponse] = js.native
    def createSubscriber(params: CreateSubscriberRequest): Request[CreateSubscriberResponse]       = js.native
    def deleteBudget(params: DeleteBudgetRequest): Request[DeleteBudgetResponse]                   = js.native
    def deleteNotification(params: DeleteNotificationRequest): Request[DeleteNotificationResponse] = js.native
    def deleteSubscriber(params: DeleteSubscriberRequest): Request[DeleteSubscriberResponse]       = js.native
    def describeBudget(params: DescribeBudgetRequest): Request[DescribeBudgetResponse]             = js.native
    def describeBudgetPerformanceHistory(
        params: DescribeBudgetPerformanceHistoryRequest
    ): Request[DescribeBudgetPerformanceHistoryResponse]                                  = js.native
    def describeBudgets(params: DescribeBudgetsRequest): Request[DescribeBudgetsResponse] = js.native
    def describeNotificationsForBudget(
        params: DescribeNotificationsForBudgetRequest
    ): Request[DescribeNotificationsForBudgetResponse] = js.native
    def describeSubscribersForNotification(
        params: DescribeSubscribersForNotificationRequest
    ): Request[DescribeSubscribersForNotificationResponse]                                         = js.native
    def updateBudget(params: UpdateBudgetRequest): Request[UpdateBudgetResponse]                   = js.native
    def updateNotification(params: UpdateNotificationRequest): Request[UpdateNotificationResponse] = js.native
    def updateSubscriber(params: UpdateSubscriberRequest): Request[UpdateSubscriberResponse]       = js.native
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
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  object Budget {
    def apply(
        BudgetName: BudgetName,
        BudgetType: BudgetType,
        TimeUnit: TimeUnit,
        BudgetLimit: js.UndefOr[Spend] = js.undefined,
        CalculatedSpend: js.UndefOr[CalculatedSpend] = js.undefined,
        CostFilters: js.UndefOr[CostFilters] = js.undefined,
        CostTypes: js.UndefOr[CostTypes] = js.undefined,
        LastUpdatedTime: js.UndefOr[GenericTimestamp] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): Budget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "BudgetType" -> BudgetType.asInstanceOf[js.Any],
        "TimeUnit"   -> TimeUnit.asInstanceOf[js.Any],
        "BudgetLimit" -> BudgetLimit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CalculatedSpend" -> CalculatedSpend.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CostFilters" -> CostFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CostTypes" -> CostTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTime" -> LastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimePeriod" -> TimePeriod.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Budget]
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
    def apply(
        BudgetName: js.UndefOr[BudgetName] = js.undefined,
        BudgetType: js.UndefOr[BudgetType] = js.undefined,
        BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList] = js.undefined,
        CostFilters: js.UndefOr[CostFilters] = js.undefined,
        CostTypes: js.UndefOr[CostTypes] = js.undefined,
        TimeUnit: js.UndefOr[TimeUnit] = js.undefined
    ): BudgetPerformanceHistory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BudgetName" -> BudgetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BudgetType" -> BudgetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BudgetedAndActualAmountsList" -> BudgetedAndActualAmountsList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CostFilters" -> CostFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CostTypes" -> CostTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeUnit" -> TimeUnit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BudgetPerformanceHistory]
    }
  }

  /**
    * The type of a budget. It must be one of the following types:
    *  <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, or <code>RI_COVERAGE</code>.
    */
  object BudgetTypeEnum {
    val USAGE          = "USAGE"
    val COST           = "COST"
    val RI_UTILIZATION = "RI_UTILIZATION"
    val RI_COVERAGE    = "RI_COVERAGE"

    val values = IndexedSeq(USAGE, COST, RI_UTILIZATION, RI_COVERAGE)
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
    def apply(
        ActualAmount: js.UndefOr[Spend] = js.undefined,
        BudgetedAmount: js.UndefOr[Spend] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): BudgetedAndActualAmounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActualAmount" -> ActualAmount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BudgetedAmount" -> BudgetedAmount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimePeriod" -> TimePeriod.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BudgetedAndActualAmounts]
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
    def apply(
        ActualSpend: Spend,
        ForecastedSpend: js.UndefOr[Spend] = js.undefined
    ): CalculatedSpend = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActualSpend" -> ActualSpend.asInstanceOf[js.Any],
        "ForecastedSpend" -> ForecastedSpend.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CalculatedSpend]
    }
  }

  /**
    * The comparison operator of a notification. Currently the service supports the following operators:
    *  <code>GREATER_THAN</code>, <code>LESS_THAN</code>, <code>EQUAL_TO</code>
    */
  object ComparisonOperatorEnum {
    val GREATER_THAN = "GREATER_THAN"
    val LESS_THAN    = "LESS_THAN"
    val EQUAL_TO     = "EQUAL_TO"

    val values = IndexedSeq(GREATER_THAN, LESS_THAN, EQUAL_TO)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "IncludeCredit" -> IncludeCredit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeDiscount" -> IncludeDiscount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeOtherSubscription" -> IncludeOtherSubscription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeRecurring" -> IncludeRecurring.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeRefund" -> IncludeRefund.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeSubscription" -> IncludeSubscription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeSupport" -> IncludeSupport.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeTax" -> IncludeTax.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeUpfront" -> IncludeUpfront.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseAmortized" -> UseAmortized.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseBlended" -> UseBlended.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CostTypes]
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
    def apply(
        AccountId: AccountId,
        Budget: Budget,
        NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.undefined
    ): CreateBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Budget"    -> Budget.asInstanceOf[js.Any],
        "NotificationsWithSubscribers" -> NotificationsWithSubscribers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBudgetRequest]
    }
  }

  /**
    * Response of CreateBudget
    */
  @js.native
  trait CreateBudgetResponse extends js.Object {}

  object CreateBudgetResponse {
    def apply(
        ): CreateBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBudgetResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        Subscribers: Subscribers
    ): CreateNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "BudgetName"   -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscribers"  -> Subscribers.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotificationRequest]
    }
  }

  /**
    * Response of CreateNotification
    */
  @js.native
  trait CreateNotificationResponse extends js.Object {}

  object CreateNotificationResponse {
    def apply(
        ): CreateNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotificationResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        Subscriber: Subscriber
    ): CreateSubscriberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "BudgetName"   -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscriber"   -> Subscriber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriberRequest]
    }
  }

  /**
    * Response of CreateSubscriber
    */
  @js.native
  trait CreateSubscriberResponse extends js.Object {}

  object CreateSubscriberResponse {
    def apply(
        ): CreateSubscriberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriberResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName
    ): DeleteBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBudgetRequest]
    }
  }

  /**
    * Response of DeleteBudget
    */
  @js.native
  trait DeleteBudgetResponse extends js.Object {}

  object DeleteBudgetResponse {
    def apply(
        ): DeleteBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBudgetResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification
    ): DeleteNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "BudgetName"   -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationRequest]
    }
  }

  /**
    * Response of DeleteNotification
    */
  @js.native
  trait DeleteNotificationResponse extends js.Object {}

  object DeleteNotificationResponse {
    def apply(
        ): DeleteNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        Subscriber: Subscriber
    ): DeleteSubscriberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "BudgetName"   -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscriber"   -> Subscriber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriberRequest]
    }
  }

  /**
    * Response of DeleteSubscriber
    */
  @js.native
  trait DeleteSubscriberResponse extends js.Object {}

  object DeleteSubscriberResponse {
    def apply(
        ): DeleteSubscriberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriberResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): DescribeBudgetPerformanceHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimePeriod" -> TimePeriod.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetPerformanceHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BudgetPerformanceHistory" -> BudgetPerformanceHistory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName
    ): DescribeBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetRequest]
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
    def apply(
        Budget: js.UndefOr[Budget] = js.undefined
    ): DescribeBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Budget" -> Budget.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetResponse]
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
    def apply(
        AccountId: AccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetsRequest]
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
    def apply(
        Budgets: js.UndefOr[Budgets] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Budgets" -> Budgets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBudgetsResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeNotificationsForBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationsForBudgetRequest]
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
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Notifications: js.UndefOr[Notifications] = js.undefined
    ): DescribeNotificationsForBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Notifications" -> Notifications.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationsForBudgetResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        Notification: Notification,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeSubscribersForNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "BudgetName"   -> BudgetName.asInstanceOf[js.Any],
        "Notification" -> Notification.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribersForNotificationRequest]
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
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Subscribers: js.UndefOr[Subscribers] = js.undefined
    ): DescribeSubscribersForNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subscribers" -> Subscribers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeSubscribersForNotificationResponse]
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
    def apply(
        ComparisonOperator: ComparisonOperator,
        NotificationType: NotificationType,
        Threshold: NotificationThreshold,
        NotificationState: js.UndefOr[NotificationState] = js.undefined,
        ThresholdType: js.UndefOr[ThresholdType] = js.undefined
    ): Notification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "NotificationType"   -> NotificationType.asInstanceOf[js.Any],
        "Threshold"          -> Threshold.asInstanceOf[js.Any],
        "NotificationState" -> NotificationState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThresholdType" -> ThresholdType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Notification]
    }
  }

  object NotificationStateEnum {
    val OK    = "OK"
    val ALARM = "ALARM"

    val values = IndexedSeq(OK, ALARM)
  }

  /**
    * The type of a notification. It must be ACTUAL or FORECASTED.
    */
  object NotificationTypeEnum {
    val ACTUAL     = "ACTUAL"
    val FORECASTED = "FORECASTED"

    val values = IndexedSeq(ACTUAL, FORECASTED)
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
    def apply(
        Notification: Notification,
        Subscribers: Subscribers
    ): NotificationWithSubscribers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notification" -> Notification.asInstanceOf[js.Any],
        "Subscribers"  -> Subscribers.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationWithSubscribers]
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
    def apply(
        Amount: NumericValue,
        Unit: UnitValue
    ): Spend = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Amount" -> Amount.asInstanceOf[js.Any],
        "Unit"   -> Unit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Spend]
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
    def apply(
        Address: SubscriberAddress,
        SubscriptionType: SubscriptionType
    ): Subscriber = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address"          -> Address.asInstanceOf[js.Any],
        "SubscriptionType" -> SubscriptionType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscriber]
    }
  }

  /**
    * The subscription type of the subscriber. It can be SMS or EMAIL.
    */
  object SubscriptionTypeEnum {
    val SNS   = "SNS"
    val EMAIL = "EMAIL"

    val values = IndexedSeq(SNS, EMAIL)
  }

  /**
    * The type of threshold for a notification. It can be PERCENTAGE or ABSOLUTE_VALUE.
    */
  object ThresholdTypeEnum {
    val PERCENTAGE     = "PERCENTAGE"
    val ABSOLUTE_VALUE = "ABSOLUTE_VALUE"

    val values = IndexedSeq(PERCENTAGE, ABSOLUTE_VALUE)
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
    def apply(
        End: js.UndefOr[GenericTimestamp] = js.undefined,
        Start: js.UndefOr[GenericTimestamp] = js.undefined
    ): TimePeriod = {
      val _fields = IndexedSeq[(String, js.Any)](
        "End" -> End.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimePeriod]
    }
  }

  /**
    * The time unit of the budget, such as MONTHLY or QUARTERLY.
    */
  object TimeUnitEnum {
    val DAILY     = "DAILY"
    val MONTHLY   = "MONTHLY"
    val QUARTERLY = "QUARTERLY"
    val ANNUALLY  = "ANNUALLY"

    val values = IndexedSeq(DAILY, MONTHLY, QUARTERLY, ANNUALLY)
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
    def apply(
        AccountId: AccountId,
        NewBudget: Budget
    ): UpdateBudgetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "NewBudget" -> NewBudget.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBudgetRequest]
    }
  }

  /**
    * Response of UpdateBudget
    */
  @js.native
  trait UpdateBudgetResponse extends js.Object {}

  object UpdateBudgetResponse {
    def apply(
        ): UpdateBudgetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBudgetResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        NewNotification: Notification,
        OldNotification: Notification
    ): UpdateNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"       -> AccountId.asInstanceOf[js.Any],
        "BudgetName"      -> BudgetName.asInstanceOf[js.Any],
        "NewNotification" -> NewNotification.asInstanceOf[js.Any],
        "OldNotification" -> OldNotification.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotificationRequest]
    }
  }

  /**
    * Response of UpdateNotification
    */
  @js.native
  trait UpdateNotificationResponse extends js.Object {}

  object UpdateNotificationResponse {
    def apply(
        ): UpdateNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotificationResponse]
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
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        NewSubscriber: Subscriber,
        Notification: Notification,
        OldSubscriber: Subscriber
    ): UpdateSubscriberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"     -> AccountId.asInstanceOf[js.Any],
        "BudgetName"    -> BudgetName.asInstanceOf[js.Any],
        "NewSubscriber" -> NewSubscriber.asInstanceOf[js.Any],
        "Notification"  -> Notification.asInstanceOf[js.Any],
        "OldSubscriber" -> OldSubscriber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriberRequest]
    }
  }

  /**
    * Response of UpdateSubscriber
    */
  @js.native
  trait UpdateSubscriberResponse extends js.Object {}

  object UpdateSubscriberResponse {
    def apply(
        ): UpdateSubscriberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriberResponse]
    }
  }
}
