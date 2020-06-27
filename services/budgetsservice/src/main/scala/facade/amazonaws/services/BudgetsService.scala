package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object budgetsservice {
  type AccountId                       = String
  type BudgetName                      = String
  type BudgetedAndActualAmountsList    = js.Array[BudgetedAndActualAmounts]
  type Budgets                         = js.Array[Budget]
  type CostFilters                     = js.Dictionary[DimensionValues]
  type DimensionValues                 = js.Array[GenericString]
  type GenericString                   = String
  type GenericTimestamp                = js.Date
  type MaxResults                      = Int
  type NotificationThreshold           = Double
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications                   = js.Array[Notification]
  type NullableBoolean                 = Boolean
  type NumericValue                    = String
  type PlannedBudgetLimits             = js.Dictionary[Spend]
  type SubscriberAddress               = String
  type Subscribers                     = js.Array[Subscriber]
  type UnitValue                       = String

  implicit final class BudgetsServiceOps(private val service: BudgetsService) extends AnyVal {

    @inline def createBudgetFuture(params: CreateBudgetRequest): Future[CreateBudgetResponse] =
      service.createBudget(params).promise().toFuture
    @inline def createNotificationFuture(params: CreateNotificationRequest): Future[CreateNotificationResponse] =
      service.createNotification(params).promise().toFuture
    @inline def createSubscriberFuture(params: CreateSubscriberRequest): Future[CreateSubscriberResponse] =
      service.createSubscriber(params).promise().toFuture
    @inline def deleteBudgetFuture(params: DeleteBudgetRequest): Future[DeleteBudgetResponse] =
      service.deleteBudget(params).promise().toFuture
    @inline def deleteNotificationFuture(params: DeleteNotificationRequest): Future[DeleteNotificationResponse] =
      service.deleteNotification(params).promise().toFuture
    @inline def deleteSubscriberFuture(params: DeleteSubscriberRequest): Future[DeleteSubscriberResponse] =
      service.deleteSubscriber(params).promise().toFuture
    @inline def describeBudgetFuture(params: DescribeBudgetRequest): Future[DescribeBudgetResponse] =
      service.describeBudget(params).promise().toFuture
    @inline def describeBudgetPerformanceHistoryFuture(
        params: DescribeBudgetPerformanceHistoryRequest
    ): Future[DescribeBudgetPerformanceHistoryResponse] =
      service.describeBudgetPerformanceHistory(params).promise().toFuture
    @inline def describeBudgetsFuture(params: DescribeBudgetsRequest): Future[DescribeBudgetsResponse] =
      service.describeBudgets(params).promise().toFuture
    @inline def describeNotificationsForBudgetFuture(
        params: DescribeNotificationsForBudgetRequest
    ): Future[DescribeNotificationsForBudgetResponse] =
      service.describeNotificationsForBudget(params).promise().toFuture
    @inline def describeSubscribersForNotificationFuture(
        params: DescribeSubscribersForNotificationRequest
    ): Future[DescribeSubscribersForNotificationResponse] =
      service.describeSubscribersForNotification(params).promise().toFuture
    @inline def updateBudgetFuture(params: UpdateBudgetRequest): Future[UpdateBudgetResponse] =
      service.updateBudget(params).promise().toFuture
    @inline def updateNotificationFuture(params: UpdateNotificationRequest): Future[UpdateNotificationResponse] =
      service.updateNotification(params).promise().toFuture
    @inline def updateSubscriberFuture(params: UpdateSubscriberRequest): Future[UpdateSubscriberResponse] =
      service.updateSubscriber(params).promise().toFuture
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
  @Factory
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

  /**
    * A history of the state of a budget at the end of the budget's specified time period.
    */
  @js.native
  @Factory
  trait BudgetPerformanceHistory extends js.Object {
    var BudgetName: js.UndefOr[BudgetName]
    var BudgetType: js.UndefOr[BudgetType]
    var BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList]
    var CostFilters: js.UndefOr[CostFilters]
    var CostTypes: js.UndefOr[CostTypes]
    var TimeUnit: js.UndefOr[TimeUnit]
  }

  /**
    * The type of a budget. It must be one of the following types:
    *  <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, or <code>RI_COVERAGE</code>.
    */
  @js.native
  sealed trait BudgetType extends js.Any
  object BudgetType extends js.Object {
    val USAGE                     = "USAGE".asInstanceOf[BudgetType]
    val COST                      = "COST".asInstanceOf[BudgetType]
    val RI_UTILIZATION            = "RI_UTILIZATION".asInstanceOf[BudgetType]
    val RI_COVERAGE               = "RI_COVERAGE".asInstanceOf[BudgetType]
    val SAVINGS_PLANS_UTILIZATION = "SAVINGS_PLANS_UTILIZATION".asInstanceOf[BudgetType]
    val SAVINGS_PLANS_COVERAGE    = "SAVINGS_PLANS_COVERAGE".asInstanceOf[BudgetType]

    val values = js.Object.freeze(
      js.Array(USAGE, COST, RI_UTILIZATION, RI_COVERAGE, SAVINGS_PLANS_UTILIZATION, SAVINGS_PLANS_COVERAGE)
    )
  }

  /**
    * The amount of cost or usage that you created the budget for, compared to your actual costs or usage.
    */
  @js.native
  @Factory
  trait BudgetedAndActualAmounts extends js.Object {
    var ActualAmount: js.UndefOr[Spend]
    var BudgetedAmount: js.UndefOr[Spend]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  /**
    * The spend objects that are associated with this budget. The <code>actualSpend</code> tracks how much you've used, cost, usage, or RI units, and the <code>forecastedSpend</code> tracks how much you are predicted to spend if your current usage remains steady.
    *  For example, if it is the 20th of the month and you have spent <code>50</code> dollars on Amazon EC2, your <code>actualSpend</code> is <code>50 USD</code>, and your <code>forecastedSpend</code> is <code>75 USD</code>.
    */
  @js.native
  @Factory
  trait CalculatedSpend extends js.Object {
    var ActualSpend: Spend
    var ForecastedSpend: js.UndefOr[Spend]
  }

  /**
    * The comparison operator of a notification. Currently the service supports the following operators:
    *  <code>GREATER_THAN</code>, <code>LESS_THAN</code>, <code>EQUAL_TO</code>
    */
  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComparisonOperator]
    val LESS_THAN    = "LESS_THAN".asInstanceOf[ComparisonOperator]
    val EQUAL_TO     = "EQUAL_TO".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(js.Array(GREATER_THAN, LESS_THAN, EQUAL_TO))
  }

  /**
    * The types of cost that are included in a <code>COST</code> budget, such as tax and subscriptions.
    *  <code>USAGE</code>, <code>RI_UTILIZATION</code>, and <code>RI_COVERAGE</code> budgets do not have <code>CostTypes</code>.
    */
  @js.native
  @Factory
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

  /**
    * Request of CreateBudget
    */
  @js.native
  @Factory
  trait CreateBudgetRequest extends js.Object {
    var AccountId: AccountId
    var Budget: Budget
    var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList]
  }

  /**
    * Response of CreateBudget
    */
  @js.native
  @Factory
  trait CreateBudgetResponse extends js.Object {}

  /**
    * Request of CreateNotification
    */
  @js.native
  @Factory
  trait CreateNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var Subscribers: Subscribers
  }

  /**
    * Response of CreateNotification
    */
  @js.native
  @Factory
  trait CreateNotificationResponse extends js.Object {}

  /**
    * Request of CreateSubscriber
    */
  @js.native
  @Factory
  trait CreateSubscriberRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var Subscriber: Subscriber
  }

  /**
    * Response of CreateSubscriber
    */
  @js.native
  @Factory
  trait CreateSubscriberResponse extends js.Object {}

  /**
    * Request of DeleteBudget
    */
  @js.native
  @Factory
  trait DeleteBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
  }

  /**
    * Response of DeleteBudget
    */
  @js.native
  @Factory
  trait DeleteBudgetResponse extends js.Object {}

  /**
    * Request of DeleteNotification
    */
  @js.native
  @Factory
  trait DeleteNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
  }

  /**
    * Response of DeleteNotification
    */
  @js.native
  @Factory
  trait DeleteNotificationResponse extends js.Object {}

  /**
    * Request of DeleteSubscriber
    */
  @js.native
  @Factory
  trait DeleteSubscriberRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var Subscriber: Subscriber
  }

  /**
    * Response of DeleteSubscriber
    */
  @js.native
  @Factory
  trait DeleteSubscriberResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  @js.native
  @Factory
  trait DescribeBudgetPerformanceHistoryResponse extends js.Object {
    var BudgetPerformanceHistory: js.UndefOr[BudgetPerformanceHistory]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * Request of DescribeBudget
    */
  @js.native
  @Factory
  trait DescribeBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
  }

  /**
    * Response of DescribeBudget
    */
  @js.native
  @Factory
  trait DescribeBudgetResponse extends js.Object {
    var Budget: js.UndefOr[Budget]
  }

  /**
    * Request of DescribeBudgets
    */
  @js.native
  @Factory
  trait DescribeBudgetsRequest extends js.Object {
    var AccountId: AccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * Response of DescribeBudgets
    */
  @js.native
  @Factory
  trait DescribeBudgetsResponse extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * Request of DescribeNotificationsForBudget
    */
  @js.native
  @Factory
  trait DescribeNotificationsForBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * Response of GetNotificationsForBudget
    */
  @js.native
  @Factory
  trait DescribeNotificationsForBudgetResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Notifications: js.UndefOr[Notifications]
  }

  /**
    * Request of DescribeSubscribersForNotification
    */
  @js.native
  @Factory
  trait DescribeSubscribersForNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var Notification: Notification
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * Response of DescribeSubscribersForNotification
    */
  @js.native
  @Factory
  trait DescribeSubscribersForNotificationResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Subscribers: js.UndefOr[Subscribers]
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
  @Factory
  trait Notification extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var NotificationType: NotificationType
    var Threshold: NotificationThreshold
    var NotificationState: js.UndefOr[NotificationState]
    var ThresholdType: js.UndefOr[ThresholdType]
  }

  @js.native
  sealed trait NotificationState extends js.Any
  object NotificationState extends js.Object {
    val OK    = "OK".asInstanceOf[NotificationState]
    val ALARM = "ALARM".asInstanceOf[NotificationState]

    val values = js.Object.freeze(js.Array(OK, ALARM))
  }

  /**
    * The type of a notification. It must be ACTUAL or FORECASTED.
    */
  @js.native
  sealed trait NotificationType extends js.Any
  object NotificationType extends js.Object {
    val ACTUAL     = "ACTUAL".asInstanceOf[NotificationType]
    val FORECASTED = "FORECASTED".asInstanceOf[NotificationType]

    val values = js.Object.freeze(js.Array(ACTUAL, FORECASTED))
  }

  /**
    * A notification with subscribers. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers.
    */
  @js.native
  @Factory
  trait NotificationWithSubscribers extends js.Object {
    var Notification: Notification
    var Subscribers: Subscribers
  }

  /**
    * The amount of cost or usage that is measured for a budget.
    *  For example, a <code>Spend</code> for <code>3 GB</code> of S3 usage would have the following parameters:
    * * An <code>Amount</code> of <code>3</code>
    *  * A <code>unit</code> of <code>GB</code>
    */
  @js.native
  @Factory
  trait Spend extends js.Object {
    var Amount: NumericValue
    var Unit: UnitValue
  }

  /**
    * The subscriber to a budget notification. The subscriber consists of a subscription type and either an Amazon SNS topic or an email address.
    *  For example, an email subscriber would have the following parameters:
    * * A <code>subscriptionType</code> of <code>EMAIL</code>
    *  * An <code>address</code> of <code>example@example.com</code>
    */
  @js.native
  @Factory
  trait Subscriber extends js.Object {
    var Address: SubscriberAddress
    var SubscriptionType: SubscriptionType
  }

  /**
    * The subscription type of the subscriber. It can be SMS or EMAIL.
    */
  @js.native
  sealed trait SubscriptionType extends js.Any
  object SubscriptionType extends js.Object {
    val SNS   = "SNS".asInstanceOf[SubscriptionType]
    val EMAIL = "EMAIL".asInstanceOf[SubscriptionType]

    val values = js.Object.freeze(js.Array(SNS, EMAIL))
  }

  /**
    * The type of threshold for a notification. It can be PERCENTAGE or ABSOLUTE_VALUE.
    */
  @js.native
  sealed trait ThresholdType extends js.Any
  object ThresholdType extends js.Object {
    val PERCENTAGE     = "PERCENTAGE".asInstanceOf[ThresholdType]
    val ABSOLUTE_VALUE = "ABSOLUTE_VALUE".asInstanceOf[ThresholdType]

    val values = js.Object.freeze(js.Array(PERCENTAGE, ABSOLUTE_VALUE))
  }

  /**
    * The period of time that is covered by a budget. The period has a start date and an end date. The start date must come before the end date. There are no restrictions on the end date.
    */
  @js.native
  @Factory
  trait TimePeriod extends js.Object {
    var End: js.UndefOr[GenericTimestamp]
    var Start: js.UndefOr[GenericTimestamp]
  }

  /**
    * The time unit of the budget, such as MONTHLY or QUARTERLY.
    */
  @js.native
  sealed trait TimeUnit extends js.Any
  object TimeUnit extends js.Object {
    val DAILY     = "DAILY".asInstanceOf[TimeUnit]
    val MONTHLY   = "MONTHLY".asInstanceOf[TimeUnit]
    val QUARTERLY = "QUARTERLY".asInstanceOf[TimeUnit]
    val ANNUALLY  = "ANNUALLY".asInstanceOf[TimeUnit]

    val values = js.Object.freeze(js.Array(DAILY, MONTHLY, QUARTERLY, ANNUALLY))
  }

  /**
    * Request of UpdateBudget
    */
  @js.native
  @Factory
  trait UpdateBudgetRequest extends js.Object {
    var AccountId: AccountId
    var NewBudget: Budget
  }

  /**
    * Response of UpdateBudget
    */
  @js.native
  @Factory
  trait UpdateBudgetResponse extends js.Object {}

  /**
    * Request of UpdateNotification
    */
  @js.native
  @Factory
  trait UpdateNotificationRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var NewNotification: Notification
    var OldNotification: Notification
  }

  /**
    * Response of UpdateNotification
    */
  @js.native
  @Factory
  trait UpdateNotificationResponse extends js.Object {}

  /**
    * Request of UpdateSubscriber
    */
  @js.native
  @Factory
  trait UpdateSubscriberRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var NewSubscriber: Subscriber
    var Notification: Notification
    var OldSubscriber: Subscriber
  }

  /**
    * Response of UpdateSubscriber
    */
  @js.native
  @Factory
  trait UpdateSubscriberResponse extends js.Object {}
}
