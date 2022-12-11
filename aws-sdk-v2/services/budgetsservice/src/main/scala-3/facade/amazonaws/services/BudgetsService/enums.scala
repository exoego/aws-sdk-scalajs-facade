package facade.amazonaws.services.budgetsservice

import scalajs.js

type ActionStatus = "STANDBY" | "PENDING" | "EXECUTION_IN_PROGRESS" | "EXECUTION_SUCCESS" | "EXECUTION_FAILURE" | "REVERSE_IN_PROGRESS" | "REVERSE_SUCCESS" | "REVERSE_FAILURE" | "RESET_IN_PROGRESS" | "RESET_FAILURE"
object ActionStatus {
  inline val STANDBY: "STANDBY" = "STANDBY"
  inline val PENDING: "PENDING" = "PENDING"
  inline val EXECUTION_IN_PROGRESS: "EXECUTION_IN_PROGRESS" = "EXECUTION_IN_PROGRESS"
  inline val EXECUTION_SUCCESS: "EXECUTION_SUCCESS" = "EXECUTION_SUCCESS"
  inline val EXECUTION_FAILURE: "EXECUTION_FAILURE" = "EXECUTION_FAILURE"
  inline val REVERSE_IN_PROGRESS: "REVERSE_IN_PROGRESS" = "REVERSE_IN_PROGRESS"
  inline val REVERSE_SUCCESS: "REVERSE_SUCCESS" = "REVERSE_SUCCESS"
  inline val REVERSE_FAILURE: "REVERSE_FAILURE" = "REVERSE_FAILURE"
  inline val RESET_IN_PROGRESS: "RESET_IN_PROGRESS" = "RESET_IN_PROGRESS"
  inline val RESET_FAILURE: "RESET_FAILURE" = "RESET_FAILURE"

  inline def values: js.Array[ActionStatus] = js.Array(
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

type ActionSubType = "STOP_EC2_INSTANCES" | "STOP_RDS_INSTANCES"
object ActionSubType {
  inline val STOP_EC2_INSTANCES: "STOP_EC2_INSTANCES" = "STOP_EC2_INSTANCES"
  inline val STOP_RDS_INSTANCES: "STOP_RDS_INSTANCES" = "STOP_RDS_INSTANCES"

  inline def values: js.Array[ActionSubType] = js.Array(STOP_EC2_INSTANCES, STOP_RDS_INSTANCES)
}

type ActionType = "APPLY_IAM_POLICY" | "APPLY_SCP_POLICY" | "RUN_SSM_DOCUMENTS"
object ActionType {
  inline val APPLY_IAM_POLICY: "APPLY_IAM_POLICY" = "APPLY_IAM_POLICY"
  inline val APPLY_SCP_POLICY: "APPLY_SCP_POLICY" = "APPLY_SCP_POLICY"
  inline val RUN_SSM_DOCUMENTS: "RUN_SSM_DOCUMENTS" = "RUN_SSM_DOCUMENTS"

  inline def values: js.Array[ActionType] = js.Array(APPLY_IAM_POLICY, APPLY_SCP_POLICY, RUN_SSM_DOCUMENTS)
}

type ApprovalModel = "AUTOMATIC" | "MANUAL"
object ApprovalModel {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[ApprovalModel] = js.Array(AUTOMATIC, MANUAL)
}

type AutoAdjustType = "HISTORICAL" | "FORECAST"
object AutoAdjustType {
  inline val HISTORICAL: "HISTORICAL" = "HISTORICAL"
  inline val FORECAST: "FORECAST" = "FORECAST"

  inline def values: js.Array[AutoAdjustType] = js.Array(HISTORICAL, FORECAST)
}

/** The type of a budget. It must be one of the following types: <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>, <code>SAVINGS_PLANS_UTILIZATION</code>, or <code>SAVINGS_PLANS_COVERAGE</code>.
  */
type BudgetType = "USAGE" | "COST" | "RI_UTILIZATION" | "RI_COVERAGE" | "SAVINGS_PLANS_UTILIZATION" | "SAVINGS_PLANS_COVERAGE"
object BudgetType {
  inline val USAGE: "USAGE" = "USAGE"
  inline val COST: "COST" = "COST"
  inline val RI_UTILIZATION: "RI_UTILIZATION" = "RI_UTILIZATION"
  inline val RI_COVERAGE: "RI_COVERAGE" = "RI_COVERAGE"
  inline val SAVINGS_PLANS_UTILIZATION: "SAVINGS_PLANS_UTILIZATION" = "SAVINGS_PLANS_UTILIZATION"
  inline val SAVINGS_PLANS_COVERAGE: "SAVINGS_PLANS_COVERAGE" = "SAVINGS_PLANS_COVERAGE"

  inline def values: js.Array[BudgetType] = js.Array(USAGE, COST, RI_UTILIZATION, RI_COVERAGE, SAVINGS_PLANS_UTILIZATION, SAVINGS_PLANS_COVERAGE)
}

/** The comparison operator of a notification. Currently, the service supports the following operators: <code>GREATER_THAN</code>, <code>LESS_THAN</code>, <code>EQUAL_TO</code>
  */
type ComparisonOperator = "GREATER_THAN" | "LESS_THAN" | "EQUAL_TO"
object ComparisonOperator {
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"

  inline def values: js.Array[ComparisonOperator] = js.Array(GREATER_THAN, LESS_THAN, EQUAL_TO)
}

type EventType = "SYSTEM" | "CREATE_ACTION" | "DELETE_ACTION" | "UPDATE_ACTION" | "EXECUTE_ACTION"
object EventType {
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val CREATE_ACTION: "CREATE_ACTION" = "CREATE_ACTION"
  inline val DELETE_ACTION: "DELETE_ACTION" = "DELETE_ACTION"
  inline val UPDATE_ACTION: "UPDATE_ACTION" = "UPDATE_ACTION"
  inline val EXECUTE_ACTION: "EXECUTE_ACTION" = "EXECUTE_ACTION"

  inline def values: js.Array[EventType] = js.Array(SYSTEM, CREATE_ACTION, DELETE_ACTION, UPDATE_ACTION, EXECUTE_ACTION)
}

type ExecutionType = "APPROVE_BUDGET_ACTION" | "RETRY_BUDGET_ACTION" | "REVERSE_BUDGET_ACTION" | "RESET_BUDGET_ACTION"
object ExecutionType {
  inline val APPROVE_BUDGET_ACTION: "APPROVE_BUDGET_ACTION" = "APPROVE_BUDGET_ACTION"
  inline val RETRY_BUDGET_ACTION: "RETRY_BUDGET_ACTION" = "RETRY_BUDGET_ACTION"
  inline val REVERSE_BUDGET_ACTION: "REVERSE_BUDGET_ACTION" = "REVERSE_BUDGET_ACTION"
  inline val RESET_BUDGET_ACTION: "RESET_BUDGET_ACTION" = "RESET_BUDGET_ACTION"

  inline def values: js.Array[ExecutionType] = js.Array(APPROVE_BUDGET_ACTION, RETRY_BUDGET_ACTION, REVERSE_BUDGET_ACTION, RESET_BUDGET_ACTION)
}

type NotificationState = "OK" | "ALARM"
object NotificationState {
  inline val OK: "OK" = "OK"
  inline val ALARM: "ALARM" = "ALARM"

  inline def values: js.Array[NotificationState] = js.Array(OK, ALARM)
}

/** The type of a notification. It must be ACTUAL or FORECASTED.
  */
type NotificationType = "ACTUAL" | "FORECASTED"
object NotificationType {
  inline val ACTUAL: "ACTUAL" = "ACTUAL"
  inline val FORECASTED: "FORECASTED" = "FORECASTED"

  inline def values: js.Array[NotificationType] = js.Array(ACTUAL, FORECASTED)
}

/** The subscription type of the subscriber. It can be SMS or EMAIL.
  */
type SubscriptionType = "SNS" | "EMAIL"
object SubscriptionType {
  inline val SNS: "SNS" = "SNS"
  inline val EMAIL: "EMAIL" = "EMAIL"

  inline def values: js.Array[SubscriptionType] = js.Array(SNS, EMAIL)
}

/** The type of threshold for a notification.
  */
type ThresholdType = "PERCENTAGE" | "ABSOLUTE_VALUE"
object ThresholdType {
  inline val PERCENTAGE: "PERCENTAGE" = "PERCENTAGE"
  inline val ABSOLUTE_VALUE: "ABSOLUTE_VALUE" = "ABSOLUTE_VALUE"

  inline def values: js.Array[ThresholdType] = js.Array(PERCENTAGE, ABSOLUTE_VALUE)
}

/** The time unit of the budget, such as MONTHLY or QUARTERLY.
  */
type TimeUnit = "DAILY" | "MONTHLY" | "QUARTERLY" | "ANNUALLY"
object TimeUnit {
  inline val DAILY: "DAILY" = "DAILY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"
  inline val QUARTERLY: "QUARTERLY" = "QUARTERLY"
  inline val ANNUALLY: "ANNUALLY" = "ANNUALLY"

  inline def values: js.Array[TimeUnit] = js.Array(DAILY, MONTHLY, QUARTERLY, ANNUALLY)
}
