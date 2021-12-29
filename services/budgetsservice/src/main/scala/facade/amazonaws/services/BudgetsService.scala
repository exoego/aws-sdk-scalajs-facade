package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object budgetsservice {
  type AccountId = String
  type ActionHistories = js.Array[ActionHistory]
  type ActionId = String
  type Actions = js.Array[Action]
  type BudgetName = String
  type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]
  type Budgets = js.Array[Budget]
  type CostFilters = js.Dictionary[DimensionValues]
  type DimensionValues = js.Array[GenericString]
  type GenericString = String
  type GenericTimestamp = js.Date
  type Group = String
  type Groups = js.Array[Group]
  type InstanceId = String
  type InstanceIds = js.Array[InstanceId]
  type MaxResults = Int
  type NotificationThreshold = Double
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = Boolean
  type NumericValue = String
  type PlannedBudgetLimits = js.Dictionary[Spend]
  type PolicyArn = String
  type PolicyId = String
  type Region = String
  type Role = String
  type RoleArn = String
  type Roles = js.Array[Role]
  type SubscriberAddress = String
  type Subscribers = js.Array[Subscriber]
  type TargetId = String
  type TargetIds = js.Array[TargetId]
  type UnitValue = String
  type User = String
  type Users = js.Array[User]

  final class BudgetsServiceOps(private val service: BudgetsService) extends AnyVal {

    @inline def createBudgetActionFuture(params: CreateBudgetActionRequest): Future[CreateBudgetActionResponse] = service.createBudgetAction(params).promise().toFuture
    @inline def createBudgetFuture(params: CreateBudgetRequest): Future[CreateBudgetResponse] = service.createBudget(params).promise().toFuture
    @inline def createNotificationFuture(params: CreateNotificationRequest): Future[CreateNotificationResponse] = service.createNotification(params).promise().toFuture
    @inline def createSubscriberFuture(params: CreateSubscriberRequest): Future[CreateSubscriberResponse] = service.createSubscriber(params).promise().toFuture
    @inline def deleteBudgetActionFuture(params: DeleteBudgetActionRequest): Future[DeleteBudgetActionResponse] = service.deleteBudgetAction(params).promise().toFuture
    @inline def deleteBudgetFuture(params: DeleteBudgetRequest): Future[DeleteBudgetResponse] = service.deleteBudget(params).promise().toFuture
    @inline def deleteNotificationFuture(params: DeleteNotificationRequest): Future[DeleteNotificationResponse] = service.deleteNotification(params).promise().toFuture
    @inline def deleteSubscriberFuture(params: DeleteSubscriberRequest): Future[DeleteSubscriberResponse] = service.deleteSubscriber(params).promise().toFuture
    @inline def describeBudgetActionFuture(params: DescribeBudgetActionRequest): Future[DescribeBudgetActionResponse] = service.describeBudgetAction(params).promise().toFuture
    @inline def describeBudgetActionHistoriesFuture(params: DescribeBudgetActionHistoriesRequest): Future[DescribeBudgetActionHistoriesResponse] = service.describeBudgetActionHistories(params).promise().toFuture
    @inline def describeBudgetActionsForAccountFuture(params: DescribeBudgetActionsForAccountRequest): Future[DescribeBudgetActionsForAccountResponse] = service.describeBudgetActionsForAccount(params).promise().toFuture
    @inline def describeBudgetActionsForBudgetFuture(params: DescribeBudgetActionsForBudgetRequest): Future[DescribeBudgetActionsForBudgetResponse] = service.describeBudgetActionsForBudget(params).promise().toFuture
    @inline def describeBudgetFuture(params: DescribeBudgetRequest): Future[DescribeBudgetResponse] = service.describeBudget(params).promise().toFuture
    @inline def describeBudgetPerformanceHistoryFuture(params: DescribeBudgetPerformanceHistoryRequest): Future[DescribeBudgetPerformanceHistoryResponse] = service.describeBudgetPerformanceHistory(params).promise().toFuture
    @inline def describeBudgetsFuture(params: DescribeBudgetsRequest): Future[DescribeBudgetsResponse] = service.describeBudgets(params).promise().toFuture
    @inline def describeNotificationsForBudgetFuture(params: DescribeNotificationsForBudgetRequest): Future[DescribeNotificationsForBudgetResponse] = service.describeNotificationsForBudget(params).promise().toFuture
    @inline def describeSubscribersForNotificationFuture(params: DescribeSubscribersForNotificationRequest): Future[DescribeSubscribersForNotificationResponse] = service.describeSubscribersForNotification(params).promise().toFuture
    @inline def executeBudgetActionFuture(params: ExecuteBudgetActionRequest): Future[ExecuteBudgetActionResponse] = service.executeBudgetAction(params).promise().toFuture
    @inline def updateBudgetActionFuture(params: UpdateBudgetActionRequest): Future[UpdateBudgetActionResponse] = service.updateBudgetAction(params).promise().toFuture
    @inline def updateBudgetFuture(params: UpdateBudgetRequest): Future[UpdateBudgetResponse] = service.updateBudget(params).promise().toFuture
    @inline def updateNotificationFuture(params: UpdateNotificationRequest): Future[UpdateNotificationResponse] = service.updateNotification(params).promise().toFuture
    @inline def updateSubscriberFuture(params: UpdateSubscriberRequest): Future[UpdateSubscriberResponse] = service.updateSubscriber(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/budgets", JSImport.Namespace, "AWS.Budgets")
  class BudgetsService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBudget(params: CreateBudgetRequest): Request[CreateBudgetResponse] = js.native
    def createBudgetAction(params: CreateBudgetActionRequest): Request[CreateBudgetActionResponse] = js.native
    def createNotification(params: CreateNotificationRequest): Request[CreateNotificationResponse] = js.native
    def createSubscriber(params: CreateSubscriberRequest): Request[CreateSubscriberResponse] = js.native
    def deleteBudget(params: DeleteBudgetRequest): Request[DeleteBudgetResponse] = js.native
    def deleteBudgetAction(params: DeleteBudgetActionRequest): Request[DeleteBudgetActionResponse] = js.native
    def deleteNotification(params: DeleteNotificationRequest): Request[DeleteNotificationResponse] = js.native
    def deleteSubscriber(params: DeleteSubscriberRequest): Request[DeleteSubscriberResponse] = js.native
    def describeBudget(params: DescribeBudgetRequest): Request[DescribeBudgetResponse] = js.native
    def describeBudgetAction(params: DescribeBudgetActionRequest): Request[DescribeBudgetActionResponse] = js.native
    def describeBudgetActionHistories(params: DescribeBudgetActionHistoriesRequest): Request[DescribeBudgetActionHistoriesResponse] = js.native
    def describeBudgetActionsForAccount(params: DescribeBudgetActionsForAccountRequest): Request[DescribeBudgetActionsForAccountResponse] = js.native
    def describeBudgetActionsForBudget(params: DescribeBudgetActionsForBudgetRequest): Request[DescribeBudgetActionsForBudgetResponse] = js.native
    def describeBudgetPerformanceHistory(params: DescribeBudgetPerformanceHistoryRequest): Request[DescribeBudgetPerformanceHistoryResponse] = js.native
    def describeBudgets(params: DescribeBudgetsRequest): Request[DescribeBudgetsResponse] = js.native
    def describeNotificationsForBudget(params: DescribeNotificationsForBudgetRequest): Request[DescribeNotificationsForBudgetResponse] = js.native
    def describeSubscribersForNotification(params: DescribeSubscribersForNotificationRequest): Request[DescribeSubscribersForNotificationResponse] = js.native
    def executeBudgetAction(params: ExecuteBudgetActionRequest): Request[ExecuteBudgetActionResponse] = js.native
    def updateBudget(params: UpdateBudgetRequest): Request[UpdateBudgetResponse] = js.native
    def updateBudgetAction(params: UpdateBudgetActionRequest): Request[UpdateBudgetActionResponse] = js.native
    def updateNotification(params: UpdateNotificationRequest): Request[UpdateNotificationResponse] = js.native
    def updateSubscriber(params: UpdateSubscriberRequest): Request[UpdateSubscriberResponse] = js.native
  }
  object BudgetsService {
    @inline implicit def toOps(service: BudgetsService): BudgetsServiceOps = {
      new BudgetsServiceOps(service)
    }
  }

  /** A budget action resource.
    */
  @js.native
  trait Action extends js.Object {
    var ActionId: ActionId
    var ActionThreshold: ActionThreshold
    var ActionType: ActionType
    var ApprovalModel: ApprovalModel
    var BudgetName: BudgetName
    var Definition: Definition
    var ExecutionRoleArn: RoleArn
    var NotificationType: NotificationType
    var Status: ActionStatus
    var Subscribers: Subscribers
  }

  object Action {
    @inline
    def apply(
        ActionId: ActionId,
        ActionThreshold: ActionThreshold,
        ActionType: ActionType,
        ApprovalModel: ApprovalModel,
        BudgetName: BudgetName,
        Definition: Definition,
        ExecutionRoleArn: RoleArn,
        NotificationType: NotificationType,
        Status: ActionStatus,
        Subscribers: Subscribers
    ): Action = {
      val __obj = js.Dynamic.literal(
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "ActionThreshold" -> ActionThreshold.asInstanceOf[js.Any],
        "ActionType" -> ActionType.asInstanceOf[js.Any],
        "ApprovalModel" -> ApprovalModel.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Definition" -> Definition.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "NotificationType" -> NotificationType.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Action]
    }
  }

  /** The historical records for a budget action.
    */
  @js.native
  trait ActionHistory extends js.Object {
    var ActionHistoryDetails: ActionHistoryDetails
    var EventType: EventType
    var Status: ActionStatus
    var Timestamp: GenericTimestamp
  }

  object ActionHistory {
    @inline
    def apply(
        ActionHistoryDetails: ActionHistoryDetails,
        EventType: EventType,
        Status: ActionStatus,
        Timestamp: GenericTimestamp
    ): ActionHistory = {
      val __obj = js.Dynamic.literal(
        "ActionHistoryDetails" -> ActionHistoryDetails.asInstanceOf[js.Any],
        "EventType" -> EventType.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionHistory]
    }
  }

  /** The description of details of the event.
    */
  @js.native
  trait ActionHistoryDetails extends js.Object {
    var Action: Action
    var Message: GenericString
  }

  object ActionHistoryDetails {
    @inline
    def apply(
        Action: Action,
        Message: GenericString
    ): ActionHistoryDetails = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionHistoryDetails]
    }
  }

  /** The trigger threshold of the action.
    */
  @js.native
  trait ActionThreshold extends js.Object {
    var ActionThresholdType: ThresholdType
    var ActionThresholdValue: NotificationThreshold
  }

  object ActionThreshold {
    @inline
    def apply(
        ActionThresholdType: ThresholdType,
        ActionThresholdValue: NotificationThreshold
    ): ActionThreshold = {
      val __obj = js.Dynamic.literal(
        "ActionThresholdType" -> ActionThresholdType.asInstanceOf[js.Any],
        "ActionThresholdValue" -> ActionThresholdValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionThreshold]
    }
  }

  /** Represents the output of the <code>CreateBudget</code> operation. The content consists of the detailed metadata and data file information, and the current status of the <code>budget</code> object. This is the ARN pattern for a budget: <code>arn:aws:budgets::AccountId:budget/budgetName</code>
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

  /** A history of the state of a budget at the end of the budget's specified time period.
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

  /** The amount of cost or usage that you created the budget for, compared to your actual costs or usage.
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

  /** The spend objects that are associated with this budget. The <code>actualSpend</code> tracks how much you've used, cost, usage, RI units, or Savings Plans units and the <code>forecastedSpend</code> tracks how much you are predicted to spend based on your historical usage profile. For example, if it is the 20th of the month and you have spent <code>50</code> dollars on Amazon EC2, your <code>actualSpend</code> is <code>50 USD</code>, and your <code>forecastedSpend</code> is <code>75 USD</code>.
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

  /** The types of cost that are included in a <code>COST</code> budget, such as tax and subscriptions. <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>, and <code>SAVINGS_PLANS_COVERAGE</code> budgets do not have <code>CostTypes</code>.
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

  @js.native
  trait CreateBudgetActionRequest extends js.Object {
    var AccountId: AccountId
    var ActionThreshold: ActionThreshold
    var ActionType: ActionType
    var ApprovalModel: ApprovalModel
    var BudgetName: BudgetName
    var Definition: Definition
    var ExecutionRoleArn: RoleArn
    var NotificationType: NotificationType
    var Subscribers: Subscribers
  }

  object CreateBudgetActionRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ActionThreshold: ActionThreshold,
        ActionType: ActionType,
        ApprovalModel: ApprovalModel,
        BudgetName: BudgetName,
        Definition: Definition,
        ExecutionRoleArn: RoleArn,
        NotificationType: NotificationType,
        Subscribers: Subscribers
    ): CreateBudgetActionRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionThreshold" -> ActionThreshold.asInstanceOf[js.Any],
        "ActionType" -> ActionType.asInstanceOf[js.Any],
        "ApprovalModel" -> ApprovalModel.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "Definition" -> Definition.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "NotificationType" -> NotificationType.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBudgetActionRequest]
    }
  }

  @js.native
  trait CreateBudgetActionResponse extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
  }

  object CreateBudgetActionResponse {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName
    ): CreateBudgetActionResponse = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBudgetActionResponse]
    }
  }

  /** Request of CreateBudget
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

  /** Response of CreateBudget
    */
  @js.native
  trait CreateBudgetResponse extends js.Object

  object CreateBudgetResponse {
    @inline
    def apply(): CreateBudgetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBudgetResponse]
    }
  }

  /** Request of CreateNotification
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

  /** Response of CreateNotification
    */
  @js.native
  trait CreateNotificationResponse extends js.Object

  object CreateNotificationResponse {
    @inline
    def apply(): CreateNotificationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateNotificationResponse]
    }
  }

  /** Request of CreateSubscriber
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

  /** Response of CreateSubscriber
    */
  @js.native
  trait CreateSubscriberResponse extends js.Object

  object CreateSubscriberResponse {
    @inline
    def apply(): CreateSubscriberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSubscriberResponse]
    }
  }

  /** Specifies all of the type-specific parameters.
    */
  @js.native
  trait Definition extends js.Object {
    var IamActionDefinition: js.UndefOr[IamActionDefinition]
    var ScpActionDefinition: js.UndefOr[ScpActionDefinition]
    var SsmActionDefinition: js.UndefOr[SsmActionDefinition]
  }

  object Definition {
    @inline
    def apply(
        IamActionDefinition: js.UndefOr[IamActionDefinition] = js.undefined,
        ScpActionDefinition: js.UndefOr[ScpActionDefinition] = js.undefined,
        SsmActionDefinition: js.UndefOr[SsmActionDefinition] = js.undefined
    ): Definition = {
      val __obj = js.Dynamic.literal()
      IamActionDefinition.foreach(__v => __obj.updateDynamic("IamActionDefinition")(__v.asInstanceOf[js.Any]))
      ScpActionDefinition.foreach(__v => __obj.updateDynamic("ScpActionDefinition")(__v.asInstanceOf[js.Any]))
      SsmActionDefinition.foreach(__v => __obj.updateDynamic("SsmActionDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Definition]
    }
  }

  @js.native
  trait DeleteBudgetActionRequest extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
  }

  object DeleteBudgetActionRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName
    ): DeleteBudgetActionRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBudgetActionRequest]
    }
  }

  @js.native
  trait DeleteBudgetActionResponse extends js.Object {
    var AccountId: AccountId
    var Action: Action
    var BudgetName: BudgetName
  }

  object DeleteBudgetActionResponse {
    @inline
    def apply(
        AccountId: AccountId,
        Action: Action,
        BudgetName: BudgetName
    ): DeleteBudgetActionResponse = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Action" -> Action.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBudgetActionResponse]
    }
  }

  /** Request of DeleteBudget
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

  /** Response of DeleteBudget
    */
  @js.native
  trait DeleteBudgetResponse extends js.Object

  object DeleteBudgetResponse {
    @inline
    def apply(): DeleteBudgetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBudgetResponse]
    }
  }

  /** Request of DeleteNotification
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

  /** Response of DeleteNotification
    */
  @js.native
  trait DeleteNotificationResponse extends js.Object

  object DeleteNotificationResponse {
    @inline
    def apply(): DeleteNotificationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNotificationResponse]
    }
  }

  /** Request of DeleteSubscriber
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

  /** Response of DeleteSubscriber
    */
  @js.native
  trait DeleteSubscriberResponse extends js.Object

  object DeleteSubscriberResponse {
    @inline
    def apply(): DeleteSubscriberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSubscriberResponse]
    }
  }

  @js.native
  trait DescribeBudgetActionHistoriesRequest extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
    var TimePeriod: js.UndefOr[TimePeriod]
  }

  object DescribeBudgetActionHistoriesRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        TimePeriod: js.UndefOr[TimePeriod] = js.undefined
    ): DescribeBudgetActionHistoriesRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TimePeriod.foreach(__v => __obj.updateDynamic("TimePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetActionHistoriesRequest]
    }
  }

  @js.native
  trait DescribeBudgetActionHistoriesResponse extends js.Object {
    var ActionHistories: ActionHistories
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetActionHistoriesResponse {
    @inline
    def apply(
        ActionHistories: ActionHistories,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetActionHistoriesResponse = {
      val __obj = js.Dynamic.literal(
        "ActionHistories" -> ActionHistories.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetActionHistoriesResponse]
    }
  }

  @js.native
  trait DescribeBudgetActionRequest extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
  }

  object DescribeBudgetActionRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName
    ): DescribeBudgetActionRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBudgetActionRequest]
    }
  }

  @js.native
  trait DescribeBudgetActionResponse extends js.Object {
    var AccountId: AccountId
    var Action: Action
    var BudgetName: BudgetName
  }

  object DescribeBudgetActionResponse {
    @inline
    def apply(
        AccountId: AccountId,
        Action: Action,
        BudgetName: BudgetName
    ): DescribeBudgetActionResponse = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Action" -> Action.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBudgetActionResponse]
    }
  }

  @js.native
  trait DescribeBudgetActionsForAccountRequest extends js.Object {
    var AccountId: AccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetActionsForAccountRequest {
    @inline
    def apply(
        AccountId: AccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetActionsForAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetActionsForAccountRequest]
    }
  }

  @js.native
  trait DescribeBudgetActionsForAccountResponse extends js.Object {
    var Actions: Actions
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetActionsForAccountResponse {
    @inline
    def apply(
        Actions: Actions,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetActionsForAccountResponse = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetActionsForAccountResponse]
    }
  }

  @js.native
  trait DescribeBudgetActionsForBudgetRequest extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetActionsForBudgetRequest {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetActionsForBudgetRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetActionsForBudgetRequest]
    }
  }

  @js.native
  trait DescribeBudgetActionsForBudgetResponse extends js.Object {
    var Actions: Actions
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeBudgetActionsForBudgetResponse {
    @inline
    def apply(
        Actions: Actions,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeBudgetActionsForBudgetResponse = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBudgetActionsForBudgetResponse]
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

  /** Request of DescribeBudget
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

  /** Response of DescribeBudget
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

  /** Request of DescribeBudgets
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

  /** Response of DescribeBudgets
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

  /** Request of DescribeNotificationsForBudget
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

  /** Response of GetNotificationsForBudget
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

  /** Request of DescribeSubscribersForNotification
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

  /** Response of DescribeSubscribersForNotification
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

  @js.native
  trait ExecuteBudgetActionRequest extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
    var ExecutionType: ExecutionType
  }

  object ExecuteBudgetActionRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName,
        ExecutionType: ExecutionType
    ): ExecuteBudgetActionRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "ExecutionType" -> ExecutionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExecuteBudgetActionRequest]
    }
  }

  @js.native
  trait ExecuteBudgetActionResponse extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
    var ExecutionType: ExecutionType
  }

  object ExecuteBudgetActionResponse {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName,
        ExecutionType: ExecutionType
    ): ExecuteBudgetActionResponse = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "ExecutionType" -> ExecutionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExecuteBudgetActionResponse]
    }
  }

  /** The AWS Identity and Access Management (IAM) action definition details.
    */
  @js.native
  trait IamActionDefinition extends js.Object {
    var PolicyArn: PolicyArn
    var Groups: js.UndefOr[Groups]
    var Roles: js.UndefOr[Roles]
    var Users: js.UndefOr[Users]
  }

  object IamActionDefinition {
    @inline
    def apply(
        PolicyArn: PolicyArn,
        Groups: js.UndefOr[Groups] = js.undefined,
        Roles: js.UndefOr[Roles] = js.undefined,
        Users: js.UndefOr[Users] = js.undefined
    ): IamActionDefinition = {
      val __obj = js.Dynamic.literal(
        "PolicyArn" -> PolicyArn.asInstanceOf[js.Any]
      )

      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Roles.foreach(__v => __obj.updateDynamic("Roles")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamActionDefinition]
    }
  }

  /** A notification that is associated with a budget. A budget can have up to ten notifications. Each notification must have at least one subscriber. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers. For example, if you have a budget for 200 dollars and you want to be notified when you go over 160 dollars, create a notification with the following parameters: * A notificationType of <code>ACTUAL</code> * A <code>thresholdType</code> of <code>PERCENTAGE</code> * A <code>comparisonOperator</code> of <code>GREATER_THAN</code> * A notification <code>threshold</code> of <code>80</code>
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

  /** A notification with subscribers. A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11 subscribers.
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

  /** The service control policies (SCP) action definition details.
    */
  @js.native
  trait ScpActionDefinition extends js.Object {
    var PolicyId: PolicyId
    var TargetIds: TargetIds
  }

  object ScpActionDefinition {
    @inline
    def apply(
        PolicyId: PolicyId,
        TargetIds: TargetIds
    ): ScpActionDefinition = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "TargetIds" -> TargetIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScpActionDefinition]
    }
  }

  /** The amount of cost or usage that is measured for a budget. For example, a <code>Spend</code> for <code>3 GB</code> of S3 usage would have the following parameters: * An <code>Amount</code> of <code>3</code> * A <code>unit</code> of <code>GB</code>
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

  /** The AWS Systems Manager (SSM) action definition details.
    */
  @js.native
  trait SsmActionDefinition extends js.Object {
    var ActionSubType: ActionSubType
    var InstanceIds: InstanceIds
    var Region: Region
  }

  object SsmActionDefinition {
    @inline
    def apply(
        ActionSubType: ActionSubType,
        InstanceIds: InstanceIds,
        Region: Region
    ): SsmActionDefinition = {
      val __obj = js.Dynamic.literal(
        "ActionSubType" -> ActionSubType.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SsmActionDefinition]
    }
  }

  /** The subscriber to a budget notification. The subscriber consists of a subscription type and either an Amazon SNS topic or an email address. For example, an email subscriber would have the following parameters: * A <code>subscriptionType</code> of <code>EMAIL</code> * An <code>address</code> of <code>example@example.com</code>
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

  /** The period of time that is covered by a budget. The period has a start date and an end date. The start date must come before the end date. There are no restrictions on the end date.
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

  @js.native
  trait UpdateBudgetActionRequest extends js.Object {
    var AccountId: AccountId
    var ActionId: ActionId
    var BudgetName: BudgetName
    var ActionThreshold: js.UndefOr[ActionThreshold]
    var ApprovalModel: js.UndefOr[ApprovalModel]
    var Definition: js.UndefOr[Definition]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var NotificationType: js.UndefOr[NotificationType]
    var Subscribers: js.UndefOr[Subscribers]
  }

  object UpdateBudgetActionRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ActionId: ActionId,
        BudgetName: BudgetName,
        ActionThreshold: js.UndefOr[ActionThreshold] = js.undefined,
        ApprovalModel: js.UndefOr[ApprovalModel] = js.undefined,
        Definition: js.UndefOr[Definition] = js.undefined,
        ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
        NotificationType: js.UndefOr[NotificationType] = js.undefined,
        Subscribers: js.UndefOr[Subscribers] = js.undefined
    ): UpdateBudgetActionRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any]
      )

      ActionThreshold.foreach(__v => __obj.updateDynamic("ActionThreshold")(__v.asInstanceOf[js.Any]))
      ApprovalModel.foreach(__v => __obj.updateDynamic("ApprovalModel")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      NotificationType.foreach(__v => __obj.updateDynamic("NotificationType")(__v.asInstanceOf[js.Any]))
      Subscribers.foreach(__v => __obj.updateDynamic("Subscribers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBudgetActionRequest]
    }
  }

  @js.native
  trait UpdateBudgetActionResponse extends js.Object {
    var AccountId: AccountId
    var BudgetName: BudgetName
    var NewAction: Action
    var OldAction: Action
  }

  object UpdateBudgetActionResponse {
    @inline
    def apply(
        AccountId: AccountId,
        BudgetName: BudgetName,
        NewAction: Action,
        OldAction: Action
    ): UpdateBudgetActionResponse = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "NewAction" -> NewAction.asInstanceOf[js.Any],
        "OldAction" -> OldAction.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBudgetActionResponse]
    }
  }

  /** Request of UpdateBudget
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

  /** Response of UpdateBudget
    */
  @js.native
  trait UpdateBudgetResponse extends js.Object

  object UpdateBudgetResponse {
    @inline
    def apply(): UpdateBudgetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateBudgetResponse]
    }
  }

  /** Request of UpdateNotification
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

  /** Response of UpdateNotification
    */
  @js.native
  trait UpdateNotificationResponse extends js.Object

  object UpdateNotificationResponse {
    @inline
    def apply(): UpdateNotificationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotificationResponse]
    }
  }

  /** Request of UpdateSubscriber
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

  /** Response of UpdateSubscriber
    */
  @js.native
  trait UpdateSubscriberResponse extends js.Object

  object UpdateSubscriberResponse {
    @inline
    def apply(): UpdateSubscriberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateSubscriberResponse]
    }
  }
}
