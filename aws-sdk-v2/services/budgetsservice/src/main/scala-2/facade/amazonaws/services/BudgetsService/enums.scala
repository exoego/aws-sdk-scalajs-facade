package facade.amazonaws.services.budgetsservice

import scalajs.js

@js.native
sealed trait ActionStatus extends js.Any
object ActionStatus {
  val STANDBY = "STANDBY".asInstanceOf[ActionStatus]
  val PENDING = "PENDING".asInstanceOf[ActionStatus]
  val EXECUTION_IN_PROGRESS = "EXECUTION_IN_PROGRESS".asInstanceOf[ActionStatus]
  val EXECUTION_SUCCESS = "EXECUTION_SUCCESS".asInstanceOf[ActionStatus]
  val EXECUTION_FAILURE = "EXECUTION_FAILURE".asInstanceOf[ActionStatus]
  val REVERSE_IN_PROGRESS = "REVERSE_IN_PROGRESS".asInstanceOf[ActionStatus]
  val REVERSE_SUCCESS = "REVERSE_SUCCESS".asInstanceOf[ActionStatus]
  val REVERSE_FAILURE = "REVERSE_FAILURE".asInstanceOf[ActionStatus]
  val RESET_IN_PROGRESS = "RESET_IN_PROGRESS".asInstanceOf[ActionStatus]
  val RESET_FAILURE = "RESET_FAILURE".asInstanceOf[ActionStatus]

  @inline def values: js.Array[ActionStatus] = js.Array(
    STANDBY,
    PENDING,
    EXECUTION_IN_PROGRESS,
    EXECUTION_SUCCESS,
    EXECUTION_FAILURE,
    REVERSE_IN_PROGRESS,
    REVERSE_SUCCESS,
    REVERSE_FAILURE,
    RESET_IN_PROGRESS,
    RESET_FAILURE
  )
}

@js.native
sealed trait ActionSubType extends js.Any
object ActionSubType {
  val STOP_EC2_INSTANCES = "STOP_EC2_INSTANCES".asInstanceOf[ActionSubType]
  val STOP_RDS_INSTANCES = "STOP_RDS_INSTANCES".asInstanceOf[ActionSubType]

  @inline def values: js.Array[ActionSubType] = js.Array(STOP_EC2_INSTANCES, STOP_RDS_INSTANCES)
}

@js.native
sealed trait ActionType extends js.Any
object ActionType {
  val APPLY_IAM_POLICY = "APPLY_IAM_POLICY".asInstanceOf[ActionType]
  val APPLY_SCP_POLICY = "APPLY_SCP_POLICY".asInstanceOf[ActionType]
  val RUN_SSM_DOCUMENTS = "RUN_SSM_DOCUMENTS".asInstanceOf[ActionType]

  @inline def values: js.Array[ActionType] = js.Array(APPLY_IAM_POLICY, APPLY_SCP_POLICY, RUN_SSM_DOCUMENTS)
}

@js.native
sealed trait ApprovalModel extends js.Any
object ApprovalModel {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[ApprovalModel]
  val MANUAL = "MANUAL".asInstanceOf[ApprovalModel]

  @inline def values: js.Array[ApprovalModel] = js.Array(AUTOMATIC, MANUAL)
}

/** The type of a budget. It must be one of the following types: <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>, or <code>SAVINGS_PLANS_COVERAGE</code>.
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

  @inline def values: js.Array[BudgetType] = js.Array(USAGE, COST, RI_UTILIZATION, RI_COVERAGE, SAVINGS_PLANS_UTILIZATION, SAVINGS_PLANS_COVERAGE)
}

/** The comparison operator of a notification. Currently the service supports the following operators: <code>GREATER_THAN</code>, <code>LESS_THAN</code>, <code>EQUAL_TO</code>
  */
@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComparisonOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[ComparisonOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(GREATER_THAN, LESS_THAN, EQUAL_TO)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val SYSTEM = "SYSTEM".asInstanceOf[EventType]
  val CREATE_ACTION = "CREATE_ACTION".asInstanceOf[EventType]
  val DELETE_ACTION = "DELETE_ACTION".asInstanceOf[EventType]
  val UPDATE_ACTION = "UPDATE_ACTION".asInstanceOf[EventType]
  val EXECUTE_ACTION = "EXECUTE_ACTION".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(SYSTEM, CREATE_ACTION, DELETE_ACTION, UPDATE_ACTION, EXECUTE_ACTION)
}

@js.native
sealed trait ExecutionType extends js.Any
object ExecutionType {
  val APPROVE_BUDGET_ACTION = "APPROVE_BUDGET_ACTION".asInstanceOf[ExecutionType]
  val RETRY_BUDGET_ACTION = "RETRY_BUDGET_ACTION".asInstanceOf[ExecutionType]
  val REVERSE_BUDGET_ACTION = "REVERSE_BUDGET_ACTION".asInstanceOf[ExecutionType]
  val RESET_BUDGET_ACTION = "RESET_BUDGET_ACTION".asInstanceOf[ExecutionType]

  @inline def values: js.Array[ExecutionType] = js.Array(APPROVE_BUDGET_ACTION, RETRY_BUDGET_ACTION, REVERSE_BUDGET_ACTION, RESET_BUDGET_ACTION)
}

@js.native
sealed trait NotificationState extends js.Any
object NotificationState {
  val OK = "OK".asInstanceOf[NotificationState]
  val ALARM = "ALARM".asInstanceOf[NotificationState]

  @inline def values: js.Array[NotificationState] = js.Array(OK, ALARM)
}

/** The type of a notification. It must be ACTUAL or FORECASTED.
  */
@js.native
sealed trait NotificationType extends js.Any
object NotificationType {
  val ACTUAL = "ACTUAL".asInstanceOf[NotificationType]
  val FORECASTED = "FORECASTED".asInstanceOf[NotificationType]

  @inline def values: js.Array[NotificationType] = js.Array(ACTUAL, FORECASTED)
}

/** The subscription type of the subscriber. It can be SMS or EMAIL.
  */
@js.native
sealed trait SubscriptionType extends js.Any
object SubscriptionType {
  val SNS = "SNS".asInstanceOf[SubscriptionType]
  val EMAIL = "EMAIL".asInstanceOf[SubscriptionType]

  @inline def values: js.Array[SubscriptionType] = js.Array(SNS, EMAIL)
}

/** The type of threshold for a notification.
  */
@js.native
sealed trait ThresholdType extends js.Any
object ThresholdType {
  val PERCENTAGE = "PERCENTAGE".asInstanceOf[ThresholdType]
  val ABSOLUTE_VALUE = "ABSOLUTE_VALUE".asInstanceOf[ThresholdType]

  @inline def values: js.Array[ThresholdType] = js.Array(PERCENTAGE, ABSOLUTE_VALUE)
}

/** The time unit of the budget, such as MONTHLY or QUARTERLY.
  */
@js.native
sealed trait TimeUnit extends js.Any
object TimeUnit {
  val DAILY = "DAILY".asInstanceOf[TimeUnit]
  val MONTHLY = "MONTHLY".asInstanceOf[TimeUnit]
  val QUARTERLY = "QUARTERLY".asInstanceOf[TimeUnit]
  val ANNUALLY = "ANNUALLY".asInstanceOf[TimeUnit]

  @inline def values: js.Array[TimeUnit] = js.Array(DAILY, MONTHLY, QUARTERLY, ANNUALLY)
}
